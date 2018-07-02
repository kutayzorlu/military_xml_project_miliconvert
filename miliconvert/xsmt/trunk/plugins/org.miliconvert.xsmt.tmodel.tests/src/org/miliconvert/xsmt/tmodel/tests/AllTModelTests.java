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

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTModelTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.miliconvert.xsmt.tmodel.tests");
		//$JUnit-BEGIN$
		suite.addTestSuite(FunctionFactoryTest.class);
		suite.addTestSuite(SchemaTest.class);
		suite.addTestSuite(TModelFactoryTest.class);
		suite.addTestSuite(LinkResolverTest.class);
		suite.addTestSuite(SchemaFactoryTest.class);
		suite.addTestSuite(TmodelTest.class);
		//$JUnit-END$
		return suite;
	}

}
