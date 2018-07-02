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

package org.miliconvert.xsmt.editor;

import org.eclipse.gef.requests.CreationFactory;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.tmodel.SchemaFactory;
import org.miliconvert.xsmt.tmodel.TModelException;

public class SchemaCreationFactory implements CreationFactory {

	private String osPath;
	private SchemaFactory sf;

	@SuppressWarnings("unchecked") //$NON-NLS-1$
	public SchemaCreationFactory() {
		sf = new SchemaFactory();
	}

	public Object getNewObject() {
		if (osPath == null) {
			return null;
		}
		
		try {
			return new SchemaElement(sf.create(osPath));
		} catch (TModelException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public Object getObjectType() {
		return SchemaElement.class;
	}

	public void setOsPath(String osPath) {
		this.osPath = osPath;
	}

}
