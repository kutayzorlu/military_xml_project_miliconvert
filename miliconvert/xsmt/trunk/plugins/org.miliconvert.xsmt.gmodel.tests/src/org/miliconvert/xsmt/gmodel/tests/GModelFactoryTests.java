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

package org.miliconvert.xsmt.gmodel.tests;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.miliconvert.xsmt.gmodel.Box;
import org.miliconvert.xsmt.gmodel.GModel;
import org.miliconvert.xsmt.gmodel.GModelFactory;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Document;

public class GModelFactoryTests extends TestCase {

	public void testLoad() {
		GModel gm = new GModel();
		gm.addBox(new Box("pouic", 0, 0, 0, 0));
		GModelFactory gmf = new GModelFactory();
		try {
			Document doc = gmf.save(gm);
			GModel underTest = gmf.load(doc.getDocumentElement());
			assertNotNull(underTest);
			System.out.println("underTest.boxes.size(): "
					+ underTest.getBoxes().size());
			assertTrue(underTest.getBoxes().size() == 1);
			Box b = underTest.getBox("pouic");
			assertNotNull(b);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testSave() {
		GModel gm = new GModel();
		gm.addBox(new Box("pouic", 0, 0, 0, 0));
		GModelFactory gmf = new GModelFactory();
		try {
			Document doc = gmf.save(gm);
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			DOMUtils.serialise(doc, bo);
			System.out.println(bo.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
