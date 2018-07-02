package org.miliconvert.adatp3;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.miliconvert.adatp3.tools.hibernate.XsdGenerationTool;
import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.xsmt.engine.ValidatingParser;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.miliconvert.xsmt.utils.FileUtils;
import org.w3c.dom.Document;

public class LocatorFormatTests extends FormatTestCase {

	public void testLoadTransformer0001() {
		ITransformer tx = getTransformer("locatorToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("locator_0002.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("locator_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("maritime_force_locator", doc.getDocumentElement()
					.getNodeName());
			System.out.println("Doc written to " + tmp.getAbsolutePath());
					
		} catch (Exception e) {
			e.printStackTrace();
			fail("transformation failed");
		}


	
		
		
		ITransformer reformat = getTransformer(Adatp3TransformerFactory.B11XML_TO_TXT);
		assertNotNull(reformat);
		try {
			InputStream in = reformat.transform(doc);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			FileUtils.transfer(in, out, true);
			System.out.println("******\n" + out.toString() + "\n*****");
			assertTrue(out.toString().contains("MSGID"));
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}

		
		
		
	}
	
	
	public void testLoadTransformer0002() {
		ITransformer tx = getTransformer("locatorToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("Locator_CELAR_0003.ad3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("locator_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("maritime_force_locator", doc.getDocumentElement()
					.getNodeName());
			
			ValidatingParser vp = new ValidatingParser();
			
			assertTrue(vp.isValid(getReadable(tmp.getPath()),
						"data/bl11/xsd/locator/messages.xsd"));
			System.out.println("Doc written to " + tmp.getAbsolutePath());
					
		} catch (Exception e) {
			e.printStackTrace();
			fail("transformation failed");
		}

		
		
		
		
		ITransformer reformat = getTransformer(Adatp3TransformerFactory.B11XML_TO_TXT);
		assertNotNull(reformat);
		try {
			
			String ret = logFile(reformat.transform(doc));		
			String org =  logFile(getTestFile("Locator_CELAR_0003.ad3"));

			System.out.println("\n RES:"+ret+"\n ORG:"+org);
			assertTrue(ret.replace(" ", "").equals(org.replace(" ", "")));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}

		
		
		
	}

}
