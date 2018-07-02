package org.miliconvert.adatp3;

import java.io.File;
import java.io.FileOutputStream;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.w3c.dom.Document;

public class ACOFormatTests extends FormatTestCase {


	public void testLoadTransformer0001() {
		ITransformer tx = getTransformer("acoToXml");
		assertNotNull(tx);

		try {
			Document doc = tx.transform(getTestFile("aco_0001.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("aco_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("airspace_control_order", doc.getDocumentElement()
					.getNodeName());
			System.out.println("Doc written to " + tmp.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
			fail("transformation failed");
		}
	}

	
	public void testLoadTransformer0003() {
		ITransformer tx = getTransformer("acoToXml");
		assertNotNull(tx);

		try {
			Document doc = tx.transform(getTestFile("aco_0003.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("aco_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("airspace_control_order", doc.getDocumentElement()
					.getNodeName());
			System.out.println("Doc written to " + tmp.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
			fail("transformation failed");
		}
	}
	
	public void testLoadTransformer0004() {
		ITransformer tx = getTransformer("acoToXml");
		assertNotNull(tx);

		try {
			Document doc = tx.transform(getTestFile("aco_0004.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("aco_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("airspace_control_order", doc.getDocumentElement()
					.getNodeName());
			System.out.println("Doc written to " + tmp.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
			fail("transformation failed");
		}
	}
}
