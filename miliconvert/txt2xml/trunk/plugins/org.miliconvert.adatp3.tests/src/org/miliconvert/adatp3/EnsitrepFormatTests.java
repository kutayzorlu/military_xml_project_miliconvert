package org.miliconvert.adatp3;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.xsmt.utils.FileUtils;
import org.w3c.dom.Document;

public class EnsitrepFormatTests extends FormatTestCase {

	public void testLoadTransformer0001() {
		ITransformer tx = getTransformer("ensitrepToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("ensitrep_0001.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("ensitrep_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("enemy_land_forces_situation_report", doc
					.getDocumentElement().getNodeName());
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
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}
	}
	
	public void testLoadTransformer0002() {
		ITransformer tx = getTransformer("ensitrepToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("ensitrep_0002.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("ensitrep_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("enemy_land_forces_situation_report", doc
					.getDocumentElement().getNodeName());
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
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}
	}

}
