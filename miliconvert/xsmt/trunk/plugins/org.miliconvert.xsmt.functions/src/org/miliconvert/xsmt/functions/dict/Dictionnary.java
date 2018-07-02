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

package org.miliconvert.xsmt.functions.dict;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

import org.miliconvert.xsmt.tmodel.AbstractFunctionImpl;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.Variable;

public class Dictionnary extends AbstractFunctionImpl {

	private String val;
	private Map<String, String> dict;

	private static Map<String, String> getDefaultMap() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("dict", ""); //$NON-NLS-1$ //$NON-NLS-2$
		return m;
	}

	public Dictionnary() throws TModelException {
		this(getDefaultMap());
	}

	public Dictionnary(Map<String, String> value) throws TModelException {
		variables.add(new Variable("source")); //$NON-NLS-1$
		setProperties(value);
	}

	public String getName() {
		return Messages.Dictionnary_0;
	}

	public String execute(String a) {
		if (dict.containsKey(a)) {
			return dict.get(a);
		}
		System.err.println("Dict '" + val + "' does not contain a value for '"
				+ a + "'");
		return a;
	}

	@Override
	public void setProperties(Map<String, String> value) throws TModelException {
		if (!value.containsKey("dict")) { //$NON-NLS-1$
			throw new TModelException(Messages.Dictionnary_1);
		}
		this.val = value.get("dict"); //$NON-NLS-1$
		dict = new HashMap<String, String>();
		if ("".equals(val)) {
			return;
		}
		try {
			RandomAccessFile raf = new RandomAccessFile(new File(val), "r");
			String line = null;
			while ((line = raf.readLine()) != null) {
				String[] l = line.split(";");
				dict.put(l[0], l[1]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
