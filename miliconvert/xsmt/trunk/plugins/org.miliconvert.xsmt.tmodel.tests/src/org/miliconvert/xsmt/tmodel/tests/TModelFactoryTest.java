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

package org.miliconvert.xsmt.tmodel.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.FunctionFactory;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.TModelFactory;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class TModelFactoryTest extends AbstractTModelTest {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		initModel("test-data/path.xsd", "test-data/pathl.xsd");

		Link l = null;
		l = createFeatFeatLink("win32", "linux");
		tm.add(l);
		l = createFeatFeatLink("path", "path");
		tm.add(l);

		FunctionFactory ff = new FunctionFactory();
		Function f = ff.create("org.miliconvert.xsmt.tmodel.tests.Identity");

		tm.add(f);

		l = createFeatFuncLink("value", f);
		tm.add(l);

		l = createFuncFeatLink(f, "value");
		tm.add(l);
	}

	
	public void testLoad() {
		TModelFactory tf = new TModelFactory();
		try {
			Document doc = tf.save(tm);
			TModel model = tf.load(doc.getDocumentElement());
			assertNotNull("not model obtained from load(elem)", model);
			assertTrue(model.getFunctions().size() > 0);
			assertTrue(model.getLinks().size() > 0);
			assertTrue(model.getSchemas().size() > 0);
			
		} catch (TModelException e) {
			e.printStackTrace();
			fail("problem while loading tmodel");
		}
	}
	
	public void testLoadHandWrittenModel() throws FileNotFoundException, SAXException, IOException, ParserConfigurationException, FactoryConfigurationError {
		TModelFactory tf = new TModelFactory();
		try {
			Document doc = DOMUtils.parse(new FileInputStream("test-data/tmodel_path_to_pathl.xml"));
			TModel model = tf.load(doc.getDocumentElement());
			assertTrue(model.getFunctions().size() > 0);
			assertTrue(model.getLinks().size() > 0);
			assertTrue(model.getSchemas().size() > 0);
		} catch (TModelException e) {
			e.printStackTrace();
			fail("problem while loading tmodel");
		}
				
	}

	public void testToXML() {
		TModelFactory tf = new TModelFactory();
		try {
			Document doc = tf.save(tm);
			DOMUtils.logDom(doc);
			assertNotNull("dom obtained from toXml is null", doc);
		} catch (Exception e) {
			e.printStackTrace();
			fail("problem while getting dom from tmodel object");
		}
	}

}
