package org.miliconvert.adatp3;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.xsmt.utils.FileUtils;
import org.w3c.dom.Document;

public class ATOFormatTests extends FormatTestCase {

	public void testLoadTransformer0001() {
		ITransformer tx = getTransformer("atoToXml");
		assertNotNull(tx);

		Document doc = null;
		try {
			doc = tx.transform(getTestFile("ato_0002.adatp3"));
			assertNotNull(doc);
			logDom(doc);
			assertEquals("air_tasking_order", doc.getDocumentElement()
					.getNodeName());
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
			System.out.println("******\n"+out.toString()+"\n*****");
		} catch (Exception e) {
			e.printStackTrace();
			fail("error transorming back to text");
		}
	}

}