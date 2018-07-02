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

import org.eclipse.xsd.XSDSchema;

/**
 * Wraps an XSDSchema in a form suitable for
 * saving/loading a TModel, and for command line execution
 * 
 * @author Thomas Cataldo
 *
 */
public class Schema {

	private SchemaId id;

	/**
	 * 
	 * needs to be a file system path for cli execution. workspace relative path
	 * would not work.
	 */
	private String fsPath;

	private XSDSchema schema;

	public SchemaId getId() {
		return id;
	}

	public void setId(SchemaId id) {
		this.id = id;
	}

	public String getFsPath() {
		return fsPath;
	}

	public void setFsPath(String fsPath) {
		this.fsPath = fsPath;
	}

	public XSDSchema getSchema() {
		return schema;
	}

	public void setSchema(XSDSchema schema) {
		this.schema = schema;
	}

	public int hashCode() {
		return id.hashCode();
	}

	public boolean equals(Object o) {
		return o instanceof Schema && ((Schema) o).getId().equals(id);
	}
	
	public String toString() {
		return "id: "+id+" path: "+fsPath; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
