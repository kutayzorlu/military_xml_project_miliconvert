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
import java.util.HashMap;
import java.util.Map;

import org.miliconvert.xsmt.tmodel.AbstractFunctionImpl;
import org.miliconvert.xsmt.tmodel.TModelException;

public class Constant extends AbstractFunctionImpl {

	private String val;

	private static Map<String, String> getDefaultMap() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("value", ""); //$NON-NLS-1$ //$NON-NLS-2$
		return m;
	}

	public Constant() throws TModelException {
		this(getDefaultMap());
	}

	public Constant(Map<String, String> value) throws TModelException {
		setProperties(value);
	}

	public String getName() {
		return MessageFormat.format(Messages.Constant_label_name,val);
	}

	public String execute() {
		return val;
	}

	@Override
	public void setProperties(Map<String, String> value) throws TModelException {
		if (!value.containsKey("value")) { //$NON-NLS-1$
			throw new TModelException(Messages.Constant_error_value);
		}
		this.val = value.get("value"); //$NON-NLS-1$
	}

}
