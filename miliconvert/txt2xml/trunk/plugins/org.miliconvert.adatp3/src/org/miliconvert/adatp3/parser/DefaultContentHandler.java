package org.miliconvert.adatp3.parser;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.adatp3.common.formlets.ClosingPart;
import org.miliconvert.adatp3.common.formlets.Field;
import org.miliconvert.adatp3.common.formlets.IntroductoryPart;
import org.miliconvert.adatp3.common.formlets.MainMessagePart;
import org.miliconvert.adatp3.common.formlets.Message;
import org.miliconvert.adatp3.common.formlets.Set;

public class DefaultContentHandler implements IContentHandler {

	private Message message;
	protected Set currentSet;
	protected Log logger = LogFactory.getLog(getClass());
	private int currentSetPos;
	
	
	public DefaultContentHandler() {
		currentSetPos=0;
	}

	@Override
	public void columnHeaders(String[] headers) {
		currentSet.setColumnHeaders(headers);
	}

	@Override
	public void endClosingSection(List<String> closingLines) {
		message.getClosingPart().setClosingLines(
				closingLines.toArray(new String[closingLines.size()]));
	}

	@Override
	public void endIntroSection(List<String> introLines) {
		message.getIntroductionPart().setHeaderLines(
				introLines.toArray(new String[introLines.size()]));
	}

	@Override
	public void endMainSection() {
		logger.debug("End of main message part with "
				+ message.getMainPart().getSets().size() + " sets.");
	}

	@Override
	public void endMessage() {
	}

	@Override
	public void endSet() {
		message.getMainPart().addSet(currentSet);
		currentSet = null;
	}

	/**
	 * Adding field values in the current set.
	 */
	@Override
	public void fieldValues(String[] values) {
		Field[] fValues = new Field[values.length];
		for (int i = 0; i < fValues.length; i++) {
			int idx = values[i].indexOf(':');
			String descriptor = null;
			if (idx > 0) {
				descriptor = values[i].substring(0, idx);
				values[i] = values[i].substring(idx + 1);
				if(currentSet.isTabularSet()){
					values[i]=values[i];
				}
			}

			fValues[i] = new Field(descriptor, values[i]);
		}
		currentSet.addFieldValues(fValues);
		if (logger.isDebugEnabled()) {
			if (values.length == 1) {
				logger.debug("           * field_value: " + values[0]);
			}
		}
		currentSetPos++;
		currentSet.setPosition(currentSetPos);
	}

	
	
	@Override
	public Message getMessage() {
		return message;
	}

	@Override
	public void startClosingSection() {
		message.setClosingPart(new ClosingPart());
	}

	@Override
	public void startIntroSection() {
		message.setIntroductionPart(new IntroductoryPart());
	}

	@Override
	public void startMainSection() {
		message.setMainPart(new MainMessagePart());
		logger.debug("-- Start of main message part.");
	}

	@Override
	public void startMessage() {
		message = new Message();
	}

	@Override
	public void startSet(String identifier) {
		currentSet = new Set(identifier);
		logger.debug("   * start_set: " + identifier);
	}

	@Override
	public String getSetId() {
		return currentSet.getIdentifier();
	}
	

}
