package org.miliconvert.otg;

import org.miliconvert.otg.model.MTF;
import org.miliconvert.otg.service.parser.MTFParser;
import org.miliconvert.otg.service.xml.MTFXmlVisitor;
import org.miliconvert.otg.service.xml.impl.MTFXmlVisitorImpl;
import org.w3c.dom.Document;

public class MTFXmlVisitorTest extends AbstractBaseTestCase {


	private MTFXmlVisitor mtfXmlVisitor;

	public void testVisitContactReport() throws Exception {
		MTFParser parser = new MTFParser(mtfFormatInitialiser.getFormat(MTFFormatRegister.CONTACT_REPORT_FORMAT));
		mtfXmlVisitor = new MTFXmlVisitorImpl(mtfFormatInitialiser.getFormat(MTFFormatRegister.CONTACT_REPORT_FORMAT));
		Document dom = null; 
		MTF mtfDocument =  null;
		mtfDocument = parser.parse(getTestFile("contactreport1.mtf"));
		assertNotNull(mtfDocument);
		dom = mtfXmlVisitor.visit(mtfDocument);
		assertNotNull(dom);
		logDom(dom);
		mtfDocument = parser.parse(getTestFile("contactreport2.mtf"));
		assertNotNull(mtfDocument);
		dom = mtfXmlVisitor.visit(mtfDocument);
		assertNotNull(dom);
		logDom(dom);
		mtfDocument = parser.parse(getTestFile("contactreport3.mtf"));
		assertNotNull(mtfDocument);
		dom = mtfXmlVisitor.visit(mtfDocument);
		assertNotNull(dom);
		logDom(dom);
		mtfDocument = parser.parse(getTestFile("contactreport4.mtf"));
		assertNotNull(mtfDocument);
		dom = mtfXmlVisitor.visit(mtfDocument);
		assertNotNull(dom);
		logDom(dom);
		
	}

	public void testOpNoteReport() throws Exception {
		MTFParser parser = new MTFParser(mtfFormatInitialiser.getFormat(MTFFormatRegister.OPNOTE_FORMAT));
		mtfXmlVisitor = new MTFXmlVisitorImpl(mtfFormatInitialiser.getFormat(MTFFormatRegister.OPNOTE_FORMAT));
		MTF mtfDocument  = parser.parse(getTestFile("opnote1.mtf"));
		assertNotNull(mtfDocument);
		Document dom = mtfXmlVisitor.visit(mtfDocument);
		assertNotNull(dom);
		logDom(dom);
		 mtfDocument  = parser.parse(getTestFile("opnote2.mtf"));
		assertNotNull(mtfDocument);
		 dom = mtfXmlVisitor.visit(mtfDocument);
		assertNotNull(dom);
		logDom(dom);
		 mtfDocument  = parser.parse(getTestFile("opnote3.mtf"));
		assertNotNull(mtfDocument);
		 dom = mtfXmlVisitor.visit(mtfDocument);
		assertNotNull(dom);
		logDom(dom);
		
	}

	public void test4Whisky() throws Exception {
		MTFParser parser = new MTFParser(mtfFormatInitialiser.getFormat(MTFFormatRegister.FOURWHISKY_FORMAT));
		mtfXmlVisitor = new MTFXmlVisitorImpl(mtfFormatInitialiser.getFormat(MTFFormatRegister.FOURWHISKY_FORMAT));
		MTF mtfDocument  = parser.parse(getTestFile("4whisky1.mtf"));
		assertNotNull(mtfDocument);
		Document dom = mtfXmlVisitor.visit(mtfDocument);
		assertNotNull(dom);
		logDom(dom);
		
	}

	
}
