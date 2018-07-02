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

package org.miliconvert.xsmt.functions.core;

import org.miliconvert.xsmt.tmodel.AbstractFunctionImpl;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.Variable;

public class InferiorOrEqual extends AbstractFunctionImpl {

	public InferiorOrEqual() {
		super();
		variables.add(new Variable("a")); //$NON-NLS-1$
		variables.add(new Variable("b")); //$NON-NLS-1$
	}

	public String getName() {
		return Messages.InferiorOrEqual_0;
	}

	/**
	 * is a inferior or equal to b ?
	 * 
	 * @param a
	 * @param b
	 * @return true if a is inferior or equal to b
	 */
	private Boolean inferiorOrEqual(Integer a, Integer b) {
		return a <= b;
	}

	/**
	 * is a inferior or equal to b ?
	 * 
	 * @param a
	 * @param b
	 * @return true if a is inferior or equal to b
	 * @throws TModelException
	 *             when one of the parameters is null
	 */

	public Boolean execute(Integer a, Integer b) throws TModelException {
		if (a == null || b == null) {
			throw new TModelException(
					"One parameter of the inferior or equal function is null: " + ": a=" //$NON-NLS-1$ //$NON-NLS-2$
							+ a + ", " + "b=" + b); //$NON-NLS-1$ //$NON-NLS-2$
		} else
			return inferiorOrEqual(a, b);
	}
}
