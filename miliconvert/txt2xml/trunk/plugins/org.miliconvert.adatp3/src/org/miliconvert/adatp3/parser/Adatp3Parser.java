package org.miliconvert.adatp3.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import org.miliconvert.adatp3.common.formlets.Message;
import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.common.utils.StringUtils;


/**
 * Parses AdatP3 text messages, using a SAX-like event based interface
 * 
 * @author tom
 * 
 */
public class Adatp3Parser {

	private static final int INTRO_SECTION = 0;
	private static final int MAIN_SECTION = 1;
	private static final int CLOSE_SECTION = 2;

	private static final String END_OF_SET = "//";
	private static final char FIELD_SEP = '/';

	private IContentHandler handler;

	private List<String> bufferedLines;

	private boolean continuation;

	public Adatp3Parser(IContentHandler handler) {
		this.bufferedLines = new LinkedList<String>();
		this.handler = handler;
		continuation = false;
	}

	public Message parse(InputStream in) throws IOException {
		return parseImpl(new BufferedReader(new InputStreamReader(in)));
	}

	private Message parseImpl(BufferedReader reader) throws IOException {
		String line = null;
		int section = INTRO_SECTION;
		handler.startMessage();
		handler.startIntroSection();
		
		while ((line = reader.readLine()) != null) {
			if (line.length() == 0) {
				continue;
			}

			switch (section) {
			case INTRO_SECTION:
				if (!line.startsWith("EXER/") && !line.startsWith("OPER/") && !line.startsWith("MSGID/")) {
					parseIntroSectionLine(line);
				} else {
					section = MAIN_SECTION;
					handler.endIntroSection(bufferedLines);
					bufferedLines.clear();
					handler.startMainSection();
					parseMainSectionLine(line);
				}
				break;
			case MAIN_SECTION:
				if (!line.equals("CLOSTEXT")) {
					parseMainSectionLine(line);
				} else {
					section = CLOSE_SECTION;
					handler.endMainSection();
					handler.startClosingSection();
					parseClosingSectionLine(line);
				}
				break;
			case CLOSE_SECTION:
				parseClosingSectionLine(line);
				break;
			}
			;
		}

		if (section == CLOSE_SECTION) {
			handler.endClosingSection(bufferedLines);
		}
		bufferedLines.clear();
		handler.endMessage();
		return handler.getMessage();
	}

	private void parseClosingSectionLine(String line) {
		bufferedLines.add(line);
	}


	
	
	private void parseMainSectionLine(String line) {
		if (line.endsWith(END_OF_SET) && bufferedLines.size() == 0) {
			processOneLineSet(line);
		} else {
			if (bufferedLines.size() == 0 && line.indexOf(FIELD_SEP) > 0
					&& !line.endsWith(END_OF_SET)) {
				// more than 69 chars linear set
				continuation = true;
			}

			if (continuation) {
				processContinuedLinearSet(line);
			} else {
				processMultiLineSet(line);
			}
		}
	}

	
	
	private void processContinuedLinearSet(String line) {
		
		if (line.endsWith(END_OF_SET)) {
			bufferedLines.add(trimEndOfSet(line));
			continuation = false;

			StringBuffer content = new StringBuffer(70 * bufferedLines.size());
			for (String l : bufferedLines) {
					content.append(l+"\n");
			}
			String linSetContent = content.toString();
			String[] parts = StringUtils.safeSplit(linSetContent,FIELD_SEP);
			handler.startSet(parts[0]);
			handler
					.fieldValues(SetsUtils.split(parts));
			bufferedLines.clear();
			handler.endSet();
		} else {
			bufferedLines.add(line);
		}
	}

	private void processMultiLineSet(String line) {
		if (bufferedLines.isEmpty()) {
			// set identifier
			handler.startSet(line);
			bufferedLines.add(line);
		} else if (bufferedLines.size() == 1) {
			// column headers
			String[] headers = StringUtils.safeSplit(line, FIELD_SEP);
			handler.columnHeaders(headers);
			bufferedLines.add(line);
		} else {
			// data row
			String tmp = line;
			if (line.endsWith(END_OF_SET)) {
				tmp = trimEndOfSet(line);
			}
			if (tmp.length() > 0 && tmp.startsWith("/")) {
				tmp = tmp.substring(1);
			}
			//Cas de END_OF_SET sur une seul ligne
			if(tmp.length()>0){
				String[] exploded = StringUtils.safeSplit(handler.getSetId()+"/"+tmp, FIELD_SEP);
				handler.fieldValues(SetsUtils.split(exploded));
			}
			if (line.endsWith(END_OF_SET)) {
				handler.endSet();
				bufferedLines.clear();
			} else {
				bufferedLines.add(line);
			}
		}
	}

	private void processOneLineSet(String line) {
		String trimmed = trimEndOfSet(line);
		String[] exploded = StringUtils.safeSplit(trimmed,FIELD_SEP);
		handler.startSet(exploded[0]);
	
		handler.fieldValues(SetsUtils.split(exploded));
		handler.endSet();
	}

	private void parseIntroSectionLine(String line) {
		bufferedLines.add(line);
	}

	private String trimEndOfSet(String line) {
		return line.substring(0, line.length() - 2);
	}

}
