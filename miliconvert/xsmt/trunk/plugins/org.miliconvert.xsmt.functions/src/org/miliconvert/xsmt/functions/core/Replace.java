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

import java.text.MessageFormat;

import org.miliconvert.xsmt.tmodel.AbstractFunctionImpl;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.Variable;

/**
 * @author Thomas Cataldo
 * 
 */
public class Replace extends AbstractFunctionImpl {

	public Replace() {
		super();
		variables.add(new Variable("a")); //$NON-NLS-1$
		variables.add(new Variable("b")); //$NON-NLS-1$
		variables.add(new Variable("c")); //$NON-NLS-1$
	}

	public String getName() {
		return Messages.Replace_label_replace;
	}

	/**
	 * Replaces a by b in c
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return the new string
	 */
	private String strReplace(String a, String b, final String c) {
		StringBuffer ret = new StringBuffer((b.length() > a.length()) ? c
				.length() * 2 : c.length());
		for (int i = 0; i < c.length(); i++) {
			if (c.startsWith(a, i)) {
				ret.append(b);
				i += a.length() - 1;
			} else {
				ret.append(c.charAt(i));
			}
		}
		return ret.toString();
	}

	/**
	 * replaces a by b in c
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * @throws TModelException
	 *             when one of the parameters is null
	 */
	public String execute(String a, String b, String c) throws TModelException {
		if (a == null || b == null || c == null) {
			throw new TModelException(MessageFormat
					.format(Messages.Replace_error_parameters, new Object[] {
							a, b, c }));
		}
		return strReplace(a, b, c);
	}

}
