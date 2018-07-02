package org.miliconvert.adatp3;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.xsmt.utils.FileUtils;
import org.w3c.dom.Document;

public class NavsitsumFormatTests extends FormatTestCase {

	public void testLoadTransformer0001() {
		ITransformer tx = getTransformer("navsitsumToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("navsitsum_0001.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			File tmp = File.createTempFile("navsitsum_", ".xml");
			serialise(doc, new FileOutputStream(tmp), true);
			assertEquals("naval_situation_summary", doc.getDocumentElement()
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
			assertTrue(out.toString().contains("NFOR"));
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}

	}

}
