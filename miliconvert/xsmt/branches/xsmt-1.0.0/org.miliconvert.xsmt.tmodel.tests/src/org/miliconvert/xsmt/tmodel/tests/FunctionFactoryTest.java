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

import java.util.HashMap;

import org.miliconvert.xsmt.tmodel.FunctionFactory;
import org.miliconvert.xsmt.tmodel.FunctionId;
import org.miliconvert.xsmt.tmodel.TModelException;

import junit.framework.TestCase;

/**
 * Fails with class not found because the plugin classloader in tmodel cannot
 * load classes from functions plugin.
 * 
 * @author Thomas Cataldo
 * 
 */
public class FunctionFactoryTest extends TestCase {

	public static final String FUNC_CLASS = "org.miliconvert.xsmt.functions.core.Identity";

	public void testCreateFunctionIdStringMapOfStringString() {
		FunctionFactory ff = new FunctionFactory();
		try {
			ff.create(new FunctionId(25), FUNC_CLASS,
					new HashMap<String, String>());
		} catch (TModelException e) {
			e.printStackTrace();
			fail("tmodel exception not expected");
		}
	}

	public void testCreateStringMapOfStringString() {
		FunctionFactory ff = new FunctionFactory();
		try {
			ff.create(FUNC_CLASS, new HashMap<String, String>());
		} catch (TModelException e) {
			e.printStackTrace();
			fail("tmodel exception not expected");
		}
	}

	public void testCreateString() {
		FunctionFactory ff = new FunctionFactory();
		try {
			ff.create(FUNC_CLASS);
		} catch (TModelException e) {
			e.printStackTrace();
			fail("tmodel exception not expected");
		}
	}

}
