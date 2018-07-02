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

import java.io.InputStream;

import org.miliconvert.txt2xml.transform.Transformer;
import org.miliconvert.txt2xml.transform.Txt2XmlException;
import org.w3c.dom.Document;

public class TransformerTests extends TransformerTestCase {

	public void testTransformer() {
		Transformer t = new Transformer();
		assertNotNull(t);
	}

	public void testTransform() {
		Transformer t = new Transformer();
		try {
			t.transform("unknowned.format", (InputStream) null);
			fail("no exception thrown on unknown format");
		} catch (Txt2XmlException e) {
		}

		try {
			Document doc = t.transform("pipo", getPipo());
			printResult(doc);
		} catch (Txt2XmlException e) {
			e.printStackTrace();
			fail("should not error on pipo transformation");
		}
	}
}
