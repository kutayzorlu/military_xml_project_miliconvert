package org.miliconvert.adatp3.parser;

import java.util.List;

import org.miliconvert.adatp3.common.formlets.Message;

/**
 * Event consumer for the {@link Adatp3Parser}
 * 
 * @author tom
 * 
 */
public interface IContentHandler {

	void startMessage();

	void startIntroSection();

	void endIntroSection(List<String> introLines);

	void startMainSection();

	void endMainSection();

	void startClosingSection();

	void endClosingSection(List<String> closingLines);

	void startSet(String identifier);

	void columnHeaders(String[] headers);

	void fieldValues(String[] values);

	void endSet();

	void endMessage();

	Message getMessage();

	String getSetId();

}
