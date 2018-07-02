package org.miliconvert.otg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.otg.model.MTF;
import org.miliconvert.otg.service.initialiser.MTFFormatInitialiser;
import org.miliconvert.otg.service.parser.MTFParser;
import org.miliconvert.otg.service.xml.MTFXmlVisitor;
import org.miliconvert.otg.service.xml.impl.MTFXmlVisitorImpl;
import org.miliconvert.otg.utils.DOMUtils;
import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.Txt2XmlException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 * 
 * @author matthieu
 *
 */
public  class OTGTransformer implements ITransformer {

	private Log logger = LogFactory.getLog(getClass());
	private String format ;
	private TransformerType type;
	private MTFFormatInitialiser mtfFormatInitialiser;
	


	protected OTGTransformer(String format,TransformerType type) {
		this.format = format;
		this.type = type;
		this.mtfFormatInitialiser = MTFFormatInitialiserFactory.getMtfFormatInitialiser();
	}


	public TransformerType getType() {
		return type;
	}

	
	public Document transform(InputStream txtInput) throws Txt2XmlException {
		logger.info("Transforming txt message to xml, format: "
				+ format);
		MTFParser parser = new MTFParser(mtfFormatInitialiser.getFormat(format));
		MTF mtfDocument	 = parser.parse(txtInput);
		MTFXmlVisitor visitor = new MTFXmlVisitorImpl(mtfFormatInitialiser.getFormat(format));

		Document ret = null;
		try {
			ret = visitor.visit(mtfDocument);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return ret;
	}


	public InputStream transform(Document xmlInput) throws Txt2XmlException {
		MTFSerialiser ms = new MTFSerialiser(mtfFormatInitialiser.getFormat(format));
		SAXParserFactory spf = SAXParserFactory.newInstance();
		try {
			SAXParser parser = spf.newSAXParser();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			DOMUtils.serialise(xmlInput, out);
			ByteArrayInputStream in = new ByteArrayInputStream(out
					.toByteArray());

			parser.parse(new InputSource(in), ms);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		return ms.getOTGStream();
	}

}
