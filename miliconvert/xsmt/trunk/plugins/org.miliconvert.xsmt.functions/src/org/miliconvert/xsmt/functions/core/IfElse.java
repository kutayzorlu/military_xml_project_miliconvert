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

public class IfElse extends AbstractFunctionImpl {

	public IfElse() {
		super();
		variables.add(new Variable(Messages.IfElse_0));
		variables.add(new Variable(Messages.IfElse_1));
		variables.add(new Variable(Messages.IfElse_2));
	}

	public String getName() {
		return Messages.IfElse_label_name;
	}

	/**
	 * if boolean is true return a else return b
	 * 
	 * @param a
	 * @param b
	 * @return the value of the boolean
	 * @throws TModelException
	 *             when one of the parameters is null
	 */

	public String execute(String bool, String t, String f)
			throws TModelException {
		if (bool == null || t == null || f == null) {
			throw new TModelException(
					"One parameter of the ifElse function is null: " //$NON-NLS-1$
							+ ": boolean=" + bool + ", " + "true=" + t //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
							+ "false =" + f); //$NON-NLS-1$
		} else
			return (("true".equals(bool) ? true : false) ? t : f);
	}

}
