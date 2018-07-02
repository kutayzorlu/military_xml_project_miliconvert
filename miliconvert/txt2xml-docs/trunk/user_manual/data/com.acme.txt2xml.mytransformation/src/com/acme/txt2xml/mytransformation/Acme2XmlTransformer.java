package com.acme.txt2xml.mytransformation;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.Txt2XmlException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Acme2XmlTransformer implements ITransformer {

	public TransformerType getType() {
		return TransformerType.TXT2XML;
	}

	public InputStream transform(Document xmlInput) throws Txt2XmlException {
		// TODO Auto-generated method stub
		return null;
	}

	private Document createDoc(String rootElement)
			throws ParserConfigurationException, FactoryConfigurationError {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbf.newDocumentBuilder();
		DOMImplementation di = builder.getDOMImplementation();
		return di.createDocument(null, rootElement, null);
	}

	private Element createElementAndText(Element parent, String elementName,
			String text) {
		if (text == null) {
			throw new NullPointerException("text for " + elementName
					+ " is null");
		}
		Element el = parent.getOwnerDocument().createElement(elementName);
		parent.appendChild(el);
		Text txt = el.getOwnerDocument().createTextNode(text);
		el.appendChild(txt);
		return el;
	}

	private Element createElement(Element parent, String elementName) {
		Element el = parent.getOwnerDocument().createElement(elementName);
		parent.appendChild(el);
		return el;
	}
	public Document transform(InputStream txtInput) throws Txt2XmlException {
		Document doc = null;

		try {
			doc = createDoc("acme");
			Element root = doc.getDocumentElement();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					txtInput));
			String line = null;
			while ((line = reader.readLine()) != null) {
				Element data = createElement(root, "data");
				String[] l = line.split("/");
				for (String t : l) {
					if (!"".equals(t)) {
						createElementAndText(data, "line", t);
					}
				}
			}
		} catch (Exception e) {
			throw new Txt2XmlException(e.getMessage(), e);
		}
		return doc;
	}

}
