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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import junit.framework.TestCase;

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

}
