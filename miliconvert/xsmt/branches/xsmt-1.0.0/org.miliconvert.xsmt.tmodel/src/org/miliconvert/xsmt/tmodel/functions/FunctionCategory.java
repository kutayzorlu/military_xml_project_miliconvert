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

package org.miliconvert.xsmt.tmodel.functions;

import java.util.HashMap;

public class FunctionCategory {

	private static HashMap<String, FunctionCategory> idx;
	private String name;

	static {
		idx = new HashMap<String, FunctionCategory>();
	}

	public static FunctionCategory create(String name) {
		if (idx.containsKey(name)) {
			return idx.get(name);
		} else {
			FunctionCategory fc = new FunctionCategory(name);
			idx.put(name, fc);
			return fc;
		}
	}

	private FunctionCategory(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
