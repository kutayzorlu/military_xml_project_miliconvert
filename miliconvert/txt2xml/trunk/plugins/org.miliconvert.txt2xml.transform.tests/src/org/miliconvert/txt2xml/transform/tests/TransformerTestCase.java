/* ***** BEGIN LICENSE BLOCK *****
 * Version: GPL 2.0
 *
 * The contents of this file are subject to the GNU General Public
 * License Version 2 or later (the "GPL").
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Initial Developer of the Original Code is
 *   BT Global Services / Etat  français  Ministre de la Défense
 *
 * ***** END LICENSE BLOCK ***** */

package org.miliconvert.txt2xml.transform.tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import junit.framework.TestCase;

import org.w3c.dom.Document;

public abstract class TransformerTestCase extends TestCase {

	public static final String PIPO_TEXT = "structured;pipo;text\nwith;3;columns\n";

	InputStream getPipo() {
		return new ByteArrayInputStream(PIPO_TEXT.getBytes());
	}

	void printResult(Document doc) {
		TransformerFactory fac = TransformerFactory.newInstance();
		Transformer tf;
		try {
			tf = fac.newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes"); //$NON-NLS-1$
			Source input = new DOMSource(doc.getDocumentElement());
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			Result output = new StreamResult(out);
			tf.transform(input, output);
			System.out.println(out.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail("exception while printing result DOM");
		}
	}

}
