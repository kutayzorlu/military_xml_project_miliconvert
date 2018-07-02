package org.miliconvert.adatp3;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.ITransformerDescriptor;

public class Adatp3XmlToTxtransformerDescriptor implements
		ITransformerDescriptor {

	String baseline;
	
	public Adatp3XmlToTxtransformerDescriptor(String baseline) {
		this.baseline = baseline;
	}

	@Override
	public ITransformer createInstance() {
		return new Adatp3XmlToTxtTransformer(baseline);
	}

}
