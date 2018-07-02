package com.acme.txt2xml.mytransformation;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.ITransformerDescriptor;

public class Xml2AcmeDescriptor implements ITransformerDescriptor {

	public ITransformer createInstance() {
		return new Xml2AcmeTransformer();
	}

}
