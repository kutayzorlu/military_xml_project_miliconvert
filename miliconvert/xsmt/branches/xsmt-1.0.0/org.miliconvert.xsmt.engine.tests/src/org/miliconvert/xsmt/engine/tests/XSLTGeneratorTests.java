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

package org.miliconvert.xsmt.engine.tests;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.miliconvert.xsmt.engine.XSLTGenerator;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.xml.sax.SAXException;

public class XSLTGeneratorTests extends AbstractEngineTest {

	public void testConstructor() throws FileNotFoundException, SAXException, IOException, ParserConfigurationException, FactoryConfigurationError, TModelException {
		new XSLTGenerator(loadTModel("test-data/attrib_copy.xml"));
	}

	public void testGenerateAttribCopy() throws TModelException,
			FileNotFoundException, SAXException, IOException,
			ParserConfigurationException, FactoryConfigurationError {
		TModel tmodel = loadTModel("test-data/attrib_copy.xml");
		XSLTGenerator g = new XSLTGenerator(tmodel);

		try {
			g.generate();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			g.dumpXslt(out);
			System.out.println("------ DUMP START ------");
			System.out.println(out.toString());
			System.out.println("------ DUMP END ------");
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	public void testGenerateWithParametersFunctions() throws TModelException,
			FileNotFoundException, SAXException, IOException,
			ParserConfigurationException, FactoryConfigurationError {
		TModel tmodel = loadTModel("test-data/tmodel_path_to_pathl.xml");
		assertTrue(tmodel.getFunctions().size() > 0);
		XSLTGenerator g = new XSLTGenerator(tmodel);

		try {
			g.generate();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			g.dumpXslt(out);
			System.out.println("------ DUMP START ------");
			System.out.println(out.toString());
			System.out.println("------ DUMP END ------");
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
