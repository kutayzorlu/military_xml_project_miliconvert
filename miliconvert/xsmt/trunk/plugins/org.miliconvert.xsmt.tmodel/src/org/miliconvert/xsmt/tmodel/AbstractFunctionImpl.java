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

package org.miliconvert.xsmt.tmodel;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class AbstractFunctionImpl implements IFunctionImpl {

	protected List<Variable> variables;

	private FunctionSignature fs;

	protected AbstractFunctionImpl() {
		variables = new LinkedList<Variable>();
		fs = new FunctionSignature(variables);
	}

	public void setProperties(Map<String, String> properties)
			throws TModelException {
		throw new TModelException(Messages.AbstractFunctionImpl__error_setproperties);
	}

	public FunctionSignature getSignature() {
		return fs;
	}

}
