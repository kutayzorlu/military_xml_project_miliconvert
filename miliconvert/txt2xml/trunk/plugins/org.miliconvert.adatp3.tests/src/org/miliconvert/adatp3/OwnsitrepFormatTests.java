package org.miliconvert.adatp3;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.xsmt.utils.FileUtils;
import org.w3c.dom.Document;

public class OwnsitrepFormatTests extends FormatTestCase {


	public void testLoadTransformer0001() {
		ITransformer tx = getTransformer("ownsitrepToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("ownsitrep_0001.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("ownsitrep_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("own_land_force_situation_report", doc.getDocumentElement()
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
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}
	}

	
	public void testLoadTransformer0002() {
		ITransformer tx = getTransformer("ownsitrepToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("ownsitrep_0002.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("ownsitrep_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("own_land_forces_situation_report", doc.getDocumentElement()
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
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}
	}
	
	public void testLoadTransformer0003() {
		ITransformer tx = getTransformer("ownsitrepToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("ownsitrep_0003.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("ownsitrep_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("own_land_forces_situation_report", doc.getDocumentElement()
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
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}
	}

	public void testLoadTransformer0004() {
		ITransformer tx = getTransformer("ownsitrepToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("ownsitrep_0004.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("ownsitrep_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("own_land_forces_situation_report", doc.getDocumentElement()
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
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}
	}
	
	public void testLoadTransformer0005() {
		ITransformer tx = getTransformer("ownsitrepToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("ownsitrep_CELAR_02.ad3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("ownsitrep_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("own_land_forces_situation_report", doc.getDocumentElement()
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
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}
	}
	

}
