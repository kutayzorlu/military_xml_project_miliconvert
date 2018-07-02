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

public final class FunctionId {
	
	private static int idGenerator;

	private int id;
	
	public FunctionId() {
		this.id = idGenerator++;
	}
	
	public FunctionId(int id) {
		if (id >= idGenerator) {
			idGenerator = id+1;
		}
		this.id = id;
	}
	
	public int get() {
		return id;
	}
	
	public boolean equals(Object o) {
		return o instanceof FunctionId && id == ((FunctionId)o).get();
	}
	
	public int hashCode() {
		return id;
	}
	
	public String toString() {
		return "func-"+id; //$NON-NLS-1$
	}
	
}
