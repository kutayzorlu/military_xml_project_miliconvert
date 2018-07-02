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

public class Division extends AbstractFunctionImpl {

	public Division() {
		super();
		variables.add(new Variable("a")); //$NON-NLS-1$
		variables.add(new Variable("b")); //$NON-NLS-1$
	}

	public String getName() {
		return Messages.Division_label_name;
	}

	/**
	 * Divide a and b
	 * 
	 * @param a
	 * @param b
	 * @return the division of a and b
	 */
	private Integer div(Integer a, Integer b) {
		return a / b;
	}

	/**
	 * Divide a and b
	 * 
	 * @param a
	 * @param b
	 * @return the division of a and b
	 * @throws TModelException
	 *             when one of the parameters is null
	 */

	public Integer execute(Integer a, Integer b) throws TModelException {
		if (a == null || b == null || b == 0) {
			throw new TModelException(
					"One parameter of the division function is null: " + ": a=" //$NON-NLS-1$ //$NON-NLS-2$
							+ a + ", " + "b=" + b); //$NON-NLS-1$ //$NON-NLS-2$
		} else
			return div(a, b);
	}
}
