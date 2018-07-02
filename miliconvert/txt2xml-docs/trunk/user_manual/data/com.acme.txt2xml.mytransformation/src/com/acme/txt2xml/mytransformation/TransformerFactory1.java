package com.acme.txt2xml.mytransformation;

import java.util.Collection;
import java.util.HashMap;

import org.miliconvert.txt2xml.transform.ITransformerDescriptor;
import org.miliconvert.txt2xml.transform.ITransformerFactory;

public class TransformerFactory1 implements ITransformerFactory {

	private HashMap<String, ITransformerDescriptor> m;

	public TransformerFactory1() {
		m = new HashMap<String, ITransformerDescriptor>();
		m.put("xml2acme", new Xml2AcmeDescriptor());
		m.put("acme2xml", new Acme2XmlDescriptor());
	}

	public ITransformerDescriptor getDescriptor(String format) {
		return m.get(format);
	}

	public Collection<String> getSupportedFormats() {
		return m.keySet();
	}

}
