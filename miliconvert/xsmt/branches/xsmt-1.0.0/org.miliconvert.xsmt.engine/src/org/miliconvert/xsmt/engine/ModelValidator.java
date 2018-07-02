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

package org.miliconvert.xsmt.engine;

import java.util.List;

import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.TModel;

public class ModelValidator {

	private TModel model;
	private ModelUtililies mu;

	public ModelValidator(TModel model) {
		this.model = model;
		this.mu = new ModelUtililies();
	}

	public boolean isValid() {
		List<Schema> lss = model.getSourceSchemas();

		int sourceCount = lss.size();
		System.out.println("source schema count in model: " + sourceCount); //$NON-NLS-1$

		// only support one source for now
		if (sourceCount != 1) {
			return false;
		}
		Schema source = lss.get(0);
		// source schema "root" is not linked to anything
		List<XSDFeature> roots = mu.getRoots(source);
		for (XSDFeature f : roots) {
			System.out.println("root found: " + f.getName()); //$NON-NLS-1$
		}
		if (roots.size() != 1) {
			System.out.println("model is not valid : schema has several roots"); //$NON-NLS-1$
			return false;
		}

		XSDFeature root = roots.get(0);
		if (mu.getLinkStartingFrom(model, root) == null) {
			System.out.println("No links starting from schema root"); //$NON-NLS-1$
			return false;
		}

		// TODO check _used_ functions are correctly linked

		return true;
	}

}
