package org.miliconvert.otg;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MTFSerialiserTest extends AbstractBaseTestCase {



	public void testVisitContactReport() throws Exception {
		MTFSerialiser ms = new MTFSerialiser(mtfFormatInitialiser.getFormat(MTFFormatRegister.CONTACT_REPORT_FORMAT));
	
		SAXParserFactory spf = SAXParserFactory.newInstance();

			SAXParser parser = spf.newSAXParser();
			
			parser.parse(getTestFile("test.xml"), ms);

			ms.getOTGStream();
		
		
	}

	
}
