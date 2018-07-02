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

package org.miliconvert.xsmt.io.tests;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.miliconvert.xsmt.io.XSMTException;
import org.miliconvert.xsmt.io.XSMTPackage;
import org.miliconvert.xsmt.io.XSMTPackageFactory;
import org.w3c.dom.Document;

public class XSMTPackageFactoryTests extends TestCase {

	public void testSave() {
		XSMTPackageFactory f = new XSMTPackageFactory();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			f.save(bos, new XSMTPackage());
			System.out.println(bos.toString());
		} catch (XSMTException e) {
			e.printStackTrace();
			fail("Exception while saving");
		}
	}

	public void testLoad() {
		XSMTPackageFactory f = new XSMTPackageFactory();
		XSMTPackage xsmtPackage = new XSMTPackage();
		try {
			Document doc = f.save(xsmtPackage);
			XSMTPackage loaded = f.load(doc.getDocumentElement());
			assertNotNull(loaded);
			assertNotNull("tmodel is null", loaded.getTmodel());
			assertNotNull("gmodel is null", loaded.getGraphic());
		} catch (XSMTException e) {
			e.printStackTrace();
			fail("error on testload");
		}
	}

}
