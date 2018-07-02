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

import org.miliconvert.xsmt.tmodel.AbstractFunctionImpl;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.Variable;

public class Multiplication extends AbstractFunctionImpl {

	public Multiplication() {
		super();
		variables.add(new Variable("a")); //$NON-NLS-1$
		variables.add(new Variable("b")); //$NON-NLS-1$
	}

	public String getName() {
		return Messages.Multiplication_label_name;
	}

	/**
	 * Multiplicat a and b
	 * 
	 * @param a
	 * @param b
	 * @return the multiplication of a and b
	 */
	private Integer multi(Integer a, Integer b) {
		return a * b;
	}

	/**
	 * Multplicate a and b
	 * 
	 * @param a
	 * @param b
	 * @return the multiplication of a and b
	 * @throws TModelException
	 *             when one of the parameters is null
	 */

	public Integer execute(Integer a, Integer b) throws TModelException {
		if (a == null || b == null) {
			throw new TModelException(
					"One parameter of the multiplication function is null: " //$NON-NLS-1$
							+ ": a=" + a + ", " + "b=" + b); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			return multi(a, b);
	}

}
