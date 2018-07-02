package org.miliconvert.adatp3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import junit.framework.TestCase;

import org.miliconvert.adatp3.common.formlets.Field;
import org.miliconvert.adatp3.common.formlets.Message;
import org.miliconvert.adatp3.common.formlets.Set;
import org.miliconvert.adatp3.parser.Adatp3Parser;
import org.miliconvert.adatp3.parser.DefaultContentHandler;
import org.miliconvert.adatp3.parser.IContentHandler;

public class Adatp3ParserTests extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testParseExample1() throws FileNotFoundException, IOException {
		IContentHandler handler = new DefaultContentHandler();
		Adatp3Parser parser = new Adatp3Parser(handler);
		parser.parse(getTestFile("example1.adatp3"));
	}
	
	public void testParseContinued() throws FileNotFoundException, IOException {
		IContentHandler handler = new DefaultContentHandler();
		Adatp3Parser parser = new Adatp3Parser(handler);
		parser.parse(getTestFile("continued.adatp3"));
		Message m = handler.getMessage();
		List<Set> l = m.getMainPart().getSets();
		for (Set s : l) {
			System.out.println("id: "+s.getIdentifier()+" fieldList: "+s.getFields().size());
			if (s.getFields().size() == 1) {
				Field[] fs = s.getFields().get(0);
				System.out.println("     field[] size: "+fs.length);
			}
		}
	}

	InputStream getTestFile(String fname) throws FileNotFoundException {
		return new FileInputStream("data/"+fname);
	}
	
}
