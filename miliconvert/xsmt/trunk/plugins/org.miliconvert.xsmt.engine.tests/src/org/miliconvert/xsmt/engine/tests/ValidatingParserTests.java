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

import org.miliconvert.xsmt.engine.EngineException;
import org.miliconvert.xsmt.engine.ValidatingParser;

public class ValidatingParserTests extends AbstractEngineTest {

	public void testValidatingParser() {
		new ValidatingParser();
	}

	public void testIsValid() throws EngineException {
		ValidatingParser vp = new ValidatingParser();
		boolean ret = vp.isValid(
				getReadable("../org.miliconvert.xsmt.xalan.tests/"
						+ "test-data/path.xml"),
				"../org.miliconvert.xsmt.tmodel.tests/test-data/path.xsd");
		assertTrue(ret);

		ret = vp.isValid(getReadable("test-data/pathl.xml"),
				"../org.miliconvert.xsmt.tmodel.tests/test-data/path.xsd");
		assertFalse(ret);

		ret = vp.isValid(getReadable("test-data/pathl.xml"),
				"../org.miliconvert.xsmt.tmodel.tests/test-data/pathl.xsd");
		assertTrue(ret);

		ret = vp.isValid(getReadable("../org.miliconvert.xsmt.xalan.tests/"
				+ "test-data/path.xml"),
				"../org.miliconvert.xsmt.tmodel.tests/test-data/pathl.xsd");
		assertFalse(ret);
	}

}
