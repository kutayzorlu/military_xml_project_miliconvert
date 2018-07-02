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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamResult;

import org.miliconvert.xsmt.engine.Engine;
import org.miliconvert.xsmt.engine.EngineException;
import org.miliconvert.xsmt.engine.IReadable;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.xml.sax.SAXException;

public class EngineTests extends AbstractEngineTest {

	public void testEngine() {
		try {
			new Engine(loadTModel("test-data/tmodel_path_to_pathl.xml"));
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	private void runFiles(String model, final String file) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException, FactoryConfigurationError, TModelException {
		TModel tmodel = loadTModel(model);
		runModelOnFile(tmodel, file);
	}
	
	private void runModelOnFile(TModel tmodel, final String file)
			throws FileNotFoundException, SAXException, IOException,
			ParserConfigurationException, FactoryConfigurationError,
			TModelException {
		try {
			Engine e = new Engine(tmodel);

			e.setXmlInstance(tmodel.getSourceSchemas().get(0).getId(),
					new IReadable() {

						public InputStream read() throws EngineException {
							try {
								return new FileInputStream(file);
							} catch (FileNotFoundException e) {
								throw new EngineException(e.getMessage());
							}
						}

					});

			assertTrue(e.isExecutable());

			ByteArrayOutputStream out = new ByteArrayOutputStream();
			StreamResult r = new StreamResult(out);
			e.dump();
			e.run(r);
			System.out.println("Result:");
			System.out.println(out.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	public void testRunPathToPathl() throws FileNotFoundException, SAXException, IOException, ParserConfigurationException, FactoryConfigurationError, TModelException {
		runFiles("test-data/tmodel_path_to_pathl.xml", "test-data/path.xml");
	}

	public void testRunAttribCopy() throws FileNotFoundException, SAXException, IOException, ParserConfigurationException, FactoryConfigurationError, TModelException {
		runFiles("test-data/attrib_copy.xml", "test-data/path.xml");
	}
}
