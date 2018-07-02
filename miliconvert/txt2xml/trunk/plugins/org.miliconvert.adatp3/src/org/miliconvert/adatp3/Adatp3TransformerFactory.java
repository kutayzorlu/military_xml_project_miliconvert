package org.miliconvert.adatp3;

import java.util.Collection;
import java.util.HashMap;

import org.miliconvert.adatp3.bl11.BL11TransformerFactory;
import org.miliconvert.adatp3.bl12.BL12TransformerFactory;
import org.miliconvert.adatp3.hibernate.BaselineConstants;
import org.miliconvert.txt2xml.transform.ITransformerDescriptor;
import org.miliconvert.txt2xml.transform.ITransformerFactory;

/**
 * Plugs Adatp3 transformers into txt2xml engine
 * 
 * @author tom
 * 
 */
public class Adatp3TransformerFactory implements ITransformerFactory {


	public static final String B11XML_TO_TXT= "b11XmlToTxt";	
	public static final String B12XML_TO_TXT= "b12XmlToTxt";

	
	private HashMap<String, ITransformerDescriptor> transformers;

	public Adatp3TransformerFactory() {
		transformers = new HashMap<String, ITransformerDescriptor>();
		
		
		BL11TransformerFactory b11TransformerFactory= new BL11TransformerFactory();
		b11TransformerFactory.registerTransformers(transformers);
		BL12TransformerFactory b12TransformerFactory= new BL12TransformerFactory();
		b12TransformerFactory.registerTransformers(transformers);
		
		transformers.put(Adatp3TransformerFactory.B11XML_TO_TXT,
				new Adatp3XmlToTxtransformerDescriptor(BaselineConstants.BL11));
		transformers.put(Adatp3TransformerFactory.B12XML_TO_TXT,
				new Adatp3XmlToTxtransformerDescriptor(BaselineConstants.BL12));
		
	
		
	}

	@Override
	public ITransformerDescriptor getDescriptor(String format) {
		return transformers.get(format);
	}

	@Override
	public Collection<String> getSupportedTransformers() {
		return transformers.keySet();
	}

}
