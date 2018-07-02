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

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.miliconvert.xsmt.engine.tests");
		//$JUnit-BEGIN$
		suite.addTestSuite(XSLTGeneratorTests.class);
		suite.addTestSuite(ValidatingParserTests.class);
		suite.addTestSuite(EngineTests.class);
		suite.addTestSuite(AcoValidationTests.class);
		suite.addTestSuite(AtoValidationTests.class);
		suite.addTestSuite(EnsitrepValidationTests.class);
		suite.addTestSuite(IntsumValidationTests.class);
		suite.addTestSuite(LocatorValidationTests.class);
		suite.addTestSuite(NavsitrepValidationTests.class);
		suite.addTestSuite(NavsitsumValidationTests.class);
		suite.addTestSuite(OwnsitrepValidationTests.class);
		//$JUnit-END$
		return suite;
	}

}
