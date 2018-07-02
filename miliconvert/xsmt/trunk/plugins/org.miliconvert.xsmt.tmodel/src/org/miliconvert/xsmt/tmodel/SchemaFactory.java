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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.util.XSDResourceImpl;

public class SchemaFactory {

	public Schema create(SchemaId id, String osPath) throws TModelException {
		Schema ret = new Schema();
		ret.setId(id);
		ret.setFsPath(osPath);
		XSDSchema smodel = loadModel(osPath);
		ret.setSchema(smodel);
		return ret;
	}

	public Schema create(String osPath) throws TModelException {
		return create(new SchemaId(), osPath);
	}

	private XSDSchema loadModel(String osPath) {
		ResourceSet rs = new ResourceSetImpl();
		URI uri = URI.createFileURI(osPath);
		XSDResourceImpl xsdResource = (XSDResourceImpl) rs.getResource(uri,
				true);
		XSDSchema xsdSchema = xsdResource.getSchema();
		return xsdSchema;
	}
}
