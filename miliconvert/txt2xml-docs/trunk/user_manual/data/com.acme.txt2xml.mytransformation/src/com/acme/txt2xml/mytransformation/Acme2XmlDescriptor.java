package com.acme.txt2xml.mytransformation;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.ITransformerDescriptor;

public class Acme2XmlDescriptor implements ITransformerDescriptor {

	public ITransformer createInstance() {
		// TODO Auto-generated method stub
		return new Acme2XmlTransformer();
	}

}
