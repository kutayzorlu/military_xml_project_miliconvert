package org.miliconvert.adatp3.tools.impl.bl13;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.StringReader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cyberneko.html.parsers.DOMParser;
import org.miliconvert.adatp3.common.utils.DOMUtils;
import org.miliconvert.adatp3.common.utils.StringUtils;
import org.miliconvert.adatp3.tools.IOpenable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;

/**
 * 
 * @author matthieu
 *
 */
public class SetsBL13Extractor extends HTMLBL13Extractor {

	public SetsBL13Extractor(IOpenable openable) {
		super(openable);
	}

	private Log logger = LogFactory.getLog(getClass());



	public void extract(int tableNumber, String outputDir) {
		InputStream in = openable.open();
		DOMParser parser = new DOMParser();
		try {
			parser.parse(new InputSource(in));
		
		Document doc = parser.getDocument();

		NodeList nl = doc.getElementsByTagName("table");
		String csv = asCSV(nl);
		String setName = extractFieldName(csv);
		String sample = extractSample(nl);
		csv = cleanCSV(csv,setName);
		
		try {
			in.close();
		} catch (Exception e) {	}
			
			if (outputDir == null) {
				try {
					File f = File.createTempFile(setName.toLowerCase(), ".csv");
					RandomAccessFile raf = new RandomAccessFile(f, "rw");
					raf.write(csv.getBytes());
					raf.close();
					logger.info("cvs:\n" + csv + "\n----\n\n");
					logger.info("CSV dumped to " + f.getAbsolutePath());
				} catch (IOException e) {
					logger.error(e.getMessage());
				}
			} else {
				String out = outputDir + "/"
						+setName.toLowerCase()+".csv";
				String sampleOut = outputDir + "/"
				+setName.toLowerCase()+".sample";
				try {
					File fout = new File(out);
					if (fout.exists()) {
						fout.delete();
					}
					RandomAccessFile raf = new RandomAccessFile(fout, "rw");
					raf.write(csv.getBytes());
					raf.close();
					
					fout = new File(sampleOut);
					if (fout.exists()) {
						fout.delete();
					}
					raf = new RandomAccessFile(fout, "rw");
					raf.write(sample.getBytes());
					raf.close();
				} catch (IOException e) {
					logger.error(e.getMessage());
				}
				logger.info("CSV dumped to " + out);
			}
		
		} catch (Exception e1) {
			logger.error("Error parsing " + openable.getFileName(), e1);
		}
	}

	



	private String cleanCSV(String csv,String fieldName) {
		BufferedReader reader = new BufferedReader(new StringReader(csv));		
		String defLine = "";
		String cardLine = "";
		String repLine = "";
		int count = 0;
		String ret = "FF-SEQ;FIELD USE DESIGNATOR;;;CLASSNAME;NAME;FLD DESC;FFIRN;STRUCTURE;CARD;\n";
		try {
			String line = null;
			String prec = null;
			boolean isRepeat = false;
			String fud = "";
			while ((line = reader.readLine()) != null) {
				String[] fields = StringUtils.safeSplit(line, ';');
				if(line.startsWith(fieldName)){
					defLine+=line.replaceFirst(fieldName+";", "");
					cardLine+=prec.replaceFirst(";", "");
					count++;
					isRepeat = true;
				} else if(isRepeat == true && (line.contains("REPEATABLE") || line.replace(";","").trim().length()==0)){
					isRepeat = false;
					repLine+=line.replaceFirst(";", "");
				} else if (prec!=null && Character.isDigit(prec.trim().charAt(0))) {
					isRepeat = false;
					try  {
						int fieldNumber = Integer.parseInt(prec.split(";")[0]);
						String[] precFields = StringUtils.safeSplit(prec, ';');
					
						String rep = "";
						if(repLine!=null && repLine.contains("REPEATABLE")){
							String[] reps = repLine.split(";");
							if(reps.length>(fieldNumber-1)*2){
								rep = reps[(fieldNumber-1)*2].contains("REPEATABLE")?"*":"";
							} 
						}
						fud=precFields[1];
						ret+= precFields[0]+";"+precFields[1]+";"+line+
						";"+defLine.split(";")[(fieldNumber-1)*2+1]+
						";"+cardLine.split(";")[(fieldNumber-1)*2]+rep+"\n";
					} catch (Exception e) {logger.debug(e,e);}
				} else if(fields.length>2 && fields[0].length()<1
						 && fields[2].length()>0
						 && Character.isDigit(fields[2].charAt(0))) {
					   isRepeat = false;
					   ret+=";"+fud+";"+line+";;\n";
				}
				prec=line;
			}
		} catch (Exception e) {
			logger.error(e,e);
		}		
		
		return ret;
		
	}

	private String extractFieldName(String csv) {
		BufferedReader reader = new BufferedReader(new StringReader(csv));

		String ret = null ;

		String line;
		try {
			line = reader.readLine();
			if(line!=null){
				ret = StringUtils.clean(line.split(";")[1].replace("(",""));
			}
		} catch (Exception e) {
			logger.error(e,e);
		}		
		
		return ret;
	}

	

	
	private String extractSample(NodeList tables) {
		StringBuffer ret = new StringBuffer();
		for (int z = 0; z < tables.getLength(); z++) {
			NodeList trs = ((Element) tables.item(z)).getElementsByTagName("tr");
			for (int i = 0; i < trs.getLength(); i++) {
				Element tr = (Element) trs.item(i);
				NodeList tds = tr.getElementsByTagName("td");
				StringBuffer csv = new StringBuffer();
				getData((Element) tds.item(0), csv, false);
				if(csv.toString().contains("Examples")){
					NodeList nl =   ((Element)tds.item(1)).getElementsByTagName("span");
					for (int j = 0; j < nl.item(0).getChildNodes().getLength(); j++) {
						Node n = nl.item(0).getChildNodes().item(j);
						String tmp = null;
						if (n instanceof Element) {
							try {
								tmp = DOMUtils.getElementText((Element) n);
							} catch (ClassCastException cce) {
								// for html <br/>
							}
						} else if (n.getNodeType() == Node.TEXT_NODE) {
							tmp = ((Text) n).getData();
						} else {
							tmp =  n.getNodeName();
						}
						if(tmp!=null){
							ret.append(tmp.replace("\n", ""));
						} else {
							ret.append("\n");
						}
					}
					return ret.toString();
				}
			}
		}
		
		return "";
	}
	
	protected String asCSV(NodeList tables) {
		StringBuffer csv = new StringBuffer();
		for (int z = 0; z < tables.getLength(); z++) {
			NodeList trs = ((Element) tables.item(z)).getElementsByTagName("tr");
			for (int i = 0; i < trs.getLength(); i++) {
				Element tr = (Element) trs.item(i);
				NodeList tds = tr.getElementsByTagName("td");
					StringBuffer line = new StringBuffer();
					for (int j = 0; j < tds.getLength(); j++) {
						Element td = (Element) tds.item(j);
							if(td.getAttribute("colspan")!=null && td.getAttribute("colspan").length()>0){
								try{
									int colspan = Integer.parseInt(td.getAttribute("colspan"));
									for (int k = 0; k < colspan; k++) {
										if (j+k > 0) {
											line.append(';');
										}
										getData(td, line, false);
									}
								}catch (Exception e) {
									logger.error(e,e);
								}
							} else {
								if (j > 0) {
									line.append(';');
								}
								getData(td, line, tds.getLength()==6);
							}
	
					}
					String l = StringUtils.clean(line.toString());
					if (l.length() > 0 ) {
							csv.append(l);
							csv.append('\n');
					}
				}
		}
		return csv.toString();
	}

	private void getData(Element td, StringBuffer csv, boolean shouldA) {
		NodeList nl = null;
		if(shouldA && td.getElementsByTagName("a").getLength()>0){
			nl = td.getElementsByTagName("b");
		} else {
			nl = td.getElementsByTagName("span");
		}
		
		
		for (int i = 0; i < nl.getLength(); i++) {
			Node n = nl.item(i);
			if (n instanceof Element) {
				try {
					csv.append("" + DOMUtils.getElementText((Element) n));
				} catch (ClassCastException cce) {
					// for html <br/>
				}
			} else if (n.getNodeType() == Node.TEXT_NODE) {
				csv.append("" + ((Text) n).getData());
			} else {
				csv.append("" + n.getNodeName());
			}
		}
	}

}
