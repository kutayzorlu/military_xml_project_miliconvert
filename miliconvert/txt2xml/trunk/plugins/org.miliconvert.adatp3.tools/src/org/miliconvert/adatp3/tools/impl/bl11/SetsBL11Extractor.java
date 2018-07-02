package org.miliconvert.adatp3.tools.impl.bl11;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.adatp3.common.utils.StringUtils;
import org.miliconvert.adatp3.tools.IOpenable;
import org.w3c.dom.NodeList;

public class SetsBL11Extractor extends HTMLBL11Extractor {

	private Log logger = LogFactory.getLog(getClass());

	public SetsBL11Extractor(IOpenable openable) {
		super(openable);
	}

	@Override
	protected String asCSV(NodeList tables, int item) {
		String stdCsv = super.asCSV(tables, item);

		String secondTab = super.asCSV(tables, item + 1);

		if (isContinuedDefinition(secondTab)) {
			stdCsv = merge(stdCsv, secondTab);
		}
		
		secondTab = super.asCSV(tables, item + 2);

		if (isContinuedDefinition(secondTab)) {
			stdCsv = merge(stdCsv, secondTab);
		}
		
		return stdCsv;
	}

	private String merge(String stdCsv, String secondTab) {
		String[] tab1 = StringUtils.safeSplit(stdCsv, '\n');
		String[] tab2 = StringUtils.safeSplit(secondTab, '\n');

		logger.info("Merging :\n" + stdCsv
				+ "\n------------------------------\n" + secondTab);

		StringBuffer out = new StringBuffer();
		for (int i = 0; i < tab1.length; i++) {
			if (tab1[i].trim().length() == 0 || tab2[i].trim().length() == 0) {
				continue;
			}
			out.append(tab1[i] + tab2[i].substring("null".length()));
			out.append("\n");
		}
		return out.toString();
	}

	private boolean isContinuedDefinition(String secondTab) {
		String[] lines = StringUtils.safeSplit(secondTab, '\n');
		// logger.info("Lines.length in second tab : " + lines.length);
		return lines.length == 4 && lines[0].matches("^null;[0-9].*");
	}

}
