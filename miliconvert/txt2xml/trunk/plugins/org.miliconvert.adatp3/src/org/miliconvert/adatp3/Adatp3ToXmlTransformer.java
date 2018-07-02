package org.miliconvert.adatp3;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.adatp3.common.InvalideAd3Exception;
import org.miliconvert.adatp3.parser.Adatp3Parser;
import org.miliconvert.adatp3.parser.DefaultContentHandler;
import org.miliconvert.adatp3.xml.XmlProducer;
import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.Txt2XmlException;
import org.w3c.dom.Document;

public abstract class Adatp3ToXmlTransformer implements ITransformer {

	private Log logger = LogFactory.getLog(getClass());
	private IAdapt3Flavour adatp3Flavour;

	protected Adatp3ToXmlTransformer(IAdapt3Flavour flavour) {
		this.adatp3Flavour = flavour;
	}

	@Override
	public TransformerType getType() {
		return TransformerType.TXT2XML;
	}

	@Override
	public Document transform(InputStream txtInput) throws Txt2XmlException {
		logger.debug("Transforming txt message to xml, flavour: "
				+ adatp3Flavour.getShortName());
		DefaultContentHandler handler = new DefaultContentHandler();
		Adatp3Parser parser = new Adatp3Parser(handler);
		//Retrieve all fields inside each line of text
		try {
			parser.parse(txtInput);
		} catch (IOException e) {
			throw new Txt2XmlException(e.getMessage(), e);
		}
		//Create an object containing the mapping which will be useful to produce xml file
		XmlProducer xp = new XmlProducer(adatp3Flavour);
		Document ret = null;
		try {
			ret = xp.createDom(handler.getMessage());
		}catch (InvalideAd3Exception e) {
			logger.error("Invalide input file REJECTING\n "+e.getMessage()+"");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return ret;
	}

	@Override
	public InputStream transform(Document xmlInput) throws Txt2XmlException {
		return null;
	}

}
