package org.miliconvert.otg;

import java.util.Collection;
import java.util.HashMap;

import org.miliconvert.txt2xml.transform.ITransformerDescriptor;
import org.miliconvert.txt2xml.transform.ITransformerFactory;
import org.miliconvert.txt2xml.transform.ITransformer.TransformerType;

/**
 * Plugs OTG transformers into txt2xml engine
 * 
 * @author matthieu
 * 
 */
public class OTGTransformerFactory implements ITransformerFactory {

	
	public static final String CONTACT_REPORT_TO_XML = "contactreportToXml";
	public static final String OPNOTE_TO_XML = "opnoteToXml";
	public static final String FOUR_WHISKY_TO_XML = "fourwhiskyToXml";
	public static final String CONTACT_REPORT_TO_TXT = "contactreportToTxt";
	public static final String OPNOTE_TO_TXT = "opnoteToTxt";
	public static final String FOUR_WHISKY_TO_TXT = "fourwhiskyToTxt";
	
	

	private HashMap<String, ITransformerDescriptor> transformers;

	public OTGTransformerFactory() {
		transformers = new HashMap<String, ITransformerDescriptor>();
		transformers.put(OTGTransformerFactory.CONTACT_REPORT_TO_XML,
				new MTFTransformerDescriptor(MTFFormatRegister.CONTACT_REPORT_FORMAT,TransformerType.TXT2XML));
		transformers.put(OTGTransformerFactory.OPNOTE_TO_XML,
				new MTFTransformerDescriptor(MTFFormatRegister.OPNOTE_FORMAT,TransformerType.TXT2XML));
		transformers.put(OTGTransformerFactory.FOUR_WHISKY_TO_XML,
				new MTFTransformerDescriptor(MTFFormatRegister.FOURWHISKY_FORMAT,TransformerType.TXT2XML));
		transformers.put(OTGTransformerFactory.CONTACT_REPORT_TO_TXT,
				new MTFTransformerDescriptor(MTFFormatRegister.CONTACT_REPORT_FORMAT,TransformerType.XML2TXT));
		transformers.put(OTGTransformerFactory.OPNOTE_TO_TXT,
				new MTFTransformerDescriptor(MTFFormatRegister.OPNOTE_FORMAT,TransformerType.XML2TXT));
		transformers.put(OTGTransformerFactory.FOUR_WHISKY_TO_TXT,
				new MTFTransformerDescriptor(MTFFormatRegister.FOURWHISKY_FORMAT,TransformerType.XML2TXT));
	
		
	}

	public ITransformerDescriptor getDescriptor(String format) {
		return transformers.get(format);
	}


	public Collection<String> getSupportedTransformers() {
		return transformers.keySet();
	}

}
