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

package org.miliconvert.xsmt.functions.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.miliconvert.xsmt.tmodel.AbstractFunctionImpl;
import org.miliconvert.xsmt.tmodel.FunctionSignature;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.Variable;

public class Addition extends AbstractFunctionImpl {

	Variable a;
	Variable b;
	List<Variable> variableList;
	FunctionSignature functionSignature;

	public Addition() {
		a = new Variable("a"); //$NON-NLS-1$
		b = new Variable("b"); //$NON-NLS-1$
		variableList = new ArrayList<Variable>();
		variableList.add(a);
		variableList.add(b);
		functionSignature = new FunctionSignature(variableList);
	}

	public String getName() {
		return Messages.Addition_label_name;
	}

	/**
	 * Add a and b
	 * 
	 * @param a
	 * @param b
	 * @return the addition of a and b
	 * @throws TModelException
	 *             when one of the parameters is null
	 */

	public String execute(String a, String b) throws TModelException {
		if (a == null || b == null) {
			throw new TModelException(
					"One parameter of the addition function is null: " + ": a=" //$NON-NLS-1$ //$NON-NLS-2$
							+ a + ", " + "b=" + b); //$NON-NLS-1$ //$NON-NLS-2$
		} else
			return "" + (Integer.parseInt(a) + Integer.parseInt(b));
	}

	public FunctionSignature getSignature() {
		return functionSignature;
	}

	public void setProperties(Map<String, String> properties)
			throws TModelException {
	}

}
