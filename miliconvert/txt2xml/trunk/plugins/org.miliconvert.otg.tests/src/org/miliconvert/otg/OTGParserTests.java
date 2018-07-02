package org.miliconvert.otg;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.miliconvert.otg.model.MTF;
import org.miliconvert.otg.service.parser.MTFParser;

public class OTGParserTests extends AbstractBaseTestCase {

	
	public void testParseContactReport() throws FileNotFoundException, IOException {
		MTFParser parser = new MTFParser(mtfFormatInitialiser.getFormat(MTFFormatRegister.CONTACT_REPORT_FORMAT));
		MTF mtf  = parser.parse(getTestFile("contactreport1.mtf"));
		assertNotNull(mtf);
		mtf  = parser.parse(getTestFile("contactreport2.mtf"));
		assertNotNull(mtf);
		mtf  = parser.parse(getTestFile("contactreport3.mtf"));
		assertNotNull(mtf);
		mtf  = parser.parse(getTestFile("contactreport4.mtf"));
		assertNotNull(mtf);
		
	}
	
	
	public void testOpNoteReport() throws FileNotFoundException, IOException {
		MTFParser parser = new MTFParser(mtfFormatInitialiser.getFormat(MTFFormatRegister.OPNOTE_FORMAT));
		MTF mtf  = parser.parse(getTestFile("opnote1.mtf"));
		assertNotNull(mtf);
		mtf  = parser.parse(getTestFile("opnote2.mtf"));
		assertNotNull(mtf);
		mtf  = parser.parse(getTestFile("opnote3.mtf"));
		assertNotNull(mtf);
		
	}
	

	public void test4Whisky() throws FileNotFoundException, IOException {
		MTFParser parser = new MTFParser(mtfFormatInitialiser.getFormat(MTFFormatRegister.FOURWHISKY_FORMAT));
		MTF mtf  = parser.parse(getTestFile("4whisky1.mtf"));
		assertNotNull(mtf);
		
	}
	

	
}
