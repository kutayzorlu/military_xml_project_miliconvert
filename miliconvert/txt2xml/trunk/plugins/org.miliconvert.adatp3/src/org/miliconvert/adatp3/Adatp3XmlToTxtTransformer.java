package org.miliconvert.adatp3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.adatp3.common.utils.DOMUtils;
import org.miliconvert.adatp3.hibernate.HibernateUtil;
import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.Txt2XmlException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class Adatp3XmlToTxtTransformer implements ITransformer {

	private Log logger = LogFactory.getLog(getClass());

	String baseline;
	
	public Adatp3XmlToTxtTransformer(String baseline) {
		this.baseline = baseline;
	}

	@Override
	public TransformerType getType() {
		return TransformerType.XML2TXT;
	}

	@Override
	public Document transform(InputStream txtInput) throws Txt2XmlException {
		return null;
	}

	@Override
	public InputStream transform(Document xmlInput) throws Txt2XmlException {
		 HibernateUtil.init(baseline);
		 HibernateUtil.begin();
			Adatp3HibernateSerialiser as = new Adatp3HibernateSerialiser();
			SAXParserFactory spf = SAXParserFactory.newInstance();
			try {
				SAXParser parser = spf.newSAXParser();
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				DOMUtils.serialise(xmlInput, out);
				ByteArrayInputStream in = new ByteArrayInputStream(out
						.toByteArray());
				
				parser.parse(new InputSource(in), as);
				
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		 finally {
			 HibernateUtil.closeSession();
		 }
	
			
		return as.getAdatp3Stream();
	}

}
