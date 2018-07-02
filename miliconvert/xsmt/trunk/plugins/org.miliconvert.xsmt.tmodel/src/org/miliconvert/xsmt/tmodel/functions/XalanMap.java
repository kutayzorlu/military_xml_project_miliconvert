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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This seems usefull because of xalan lazy variable initialisation just calling
 * "put" on a {@link java.util.HashMap} results in an empty map
 * 
 * @author tom
 * 
 */
public class XalanMap implements Map<String, String> {

	private HashMap<String, String> impl;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 169965845561633548L;

	public XalanMap() {
		impl = new HashMap<String, String>();
	}
	
	public XalanMap addItem(String k, String v) {
		impl.put(k, v);
		return this;
	}

	public void clear() {
		impl.clear();
	}

	public Object clone() {
		return impl.clone();
	}

	public boolean containsKey(Object key) {
		return impl.containsKey(key);
	}

	public boolean containsValue(Object value) {
		return impl.containsValue(value);
	}

	public Set<Entry<String, String>> entrySet() {
		return impl.entrySet();
	}

	public boolean equals(Object o) {
		return impl.equals(o);
	}

	public String get(Object key) {
		return impl.get(key);
	}

	public int hashCode() {
		return impl.hashCode();
	}

	public boolean isEmpty() {
		return impl.isEmpty();
	}

	public Set<String> keySet() {
		return impl.keySet();
	}

	public String put(String key, String value) {
		return impl.put(key, value);
	}

	public void putAll(Map<? extends String, ? extends String> m) {
		impl.putAll(m);
	}

	public String remove(Object key) {
		return impl.remove(key);
	}

	public int size() {
		return impl.size();
	}

	public Collection<String> values() {
		return impl.values();
	}

}
