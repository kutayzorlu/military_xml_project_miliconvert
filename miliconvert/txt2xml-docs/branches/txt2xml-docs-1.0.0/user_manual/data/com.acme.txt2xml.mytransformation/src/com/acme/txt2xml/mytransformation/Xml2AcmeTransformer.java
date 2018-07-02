package com.acme.txt2xml.mytransformation;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.Txt2XmlException;
import org.w3c.dom.Document;

public class Xml2AcmeTransformer implements ITransformer {

	public TransformerType getType() {
		return TransformerType.XML2TXT;
	}

	public Document transform(InputStream txtInput) throws Txt2XmlException {
		throw new Txt2XmlException("can't handle txt -> xml");
	}

	public InputStream transform(Document xmlInput) throws Txt2XmlException {
		return new ByteArrayInputStream("welcome to Acme :-)".getBytes());
	}

}
