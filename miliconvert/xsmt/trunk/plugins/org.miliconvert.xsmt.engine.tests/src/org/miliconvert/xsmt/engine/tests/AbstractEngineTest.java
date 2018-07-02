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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamResult;

import junit.framework.TestCase;

import org.miliconvert.xsmt.engine.Engine;
import org.miliconvert.xsmt.engine.EngineException;
import org.miliconvert.xsmt.engine.IReadable;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.TModelFactory;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public abstract class AbstractEngineTest extends TestCase {

	protected TModel loadTModel(String path) throws FileNotFoundException,
			SAXException, IOException, ParserConfigurationException,
			FactoryConfigurationError, TModelException {
		Document modelDoc = DOMUtils.parse(new FileInputStream(path));
		TModel tmodel = new TModelFactory().load(modelDoc.getDocumentElement());
		assertTrue(tmodel.getLinks().size() > 0);
		assertTrue(tmodel.getSchemas().size() > 0);
		return tmodel;
	}

	protected IReadable getReadableFromDomString(final String in) {
		return new IReadable() {
			public InputStream read() throws EngineException {
				return new ByteArrayInputStream(in.getBytes());
			}
		};
	}

	protected IReadable getReadableFromStream(final InputStream in) {
		return new IReadable() {

			public InputStream read() throws EngineException {
				return in;
			}
		};
	}

	protected IReadable getReadable(final String path) {
		try {
			return getReadableFromStream(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	protected String runFiles(String model, final String file)
			throws FileNotFoundException, SAXException, IOException,
			ParserConfigurationException, FactoryConfigurationError,
			TModelException {
		TModel tmodel = loadTModel(model);
		return runModelOnFile(tmodel, file);
	}

	protected String runModelOnFile(TModel tmodel, final String file)
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
			return out.toString();
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		return null;
	}

}
