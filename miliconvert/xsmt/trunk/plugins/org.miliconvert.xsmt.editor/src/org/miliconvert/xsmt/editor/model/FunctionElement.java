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

package org.miliconvert.xsmt.editor.model;

import org.miliconvert.xsmt.tmodel.Function;

public class FunctionElement extends GModelConnectableElement {

	private Function function;

	public FunctionElement(Function function) {
		super();
		this.function = function;

		for (int i = 0; i < function.getSignature().getParameters().size(); i++) {
			inputs.put(function.getId() + "," + i, null); //$NON-NLS-1$
		}
		outputs.put(function.getId().toString(), null);
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public String toString() {
		return Messages.FunctionElement_label_function_element + function.getId().toString();
	}

}
