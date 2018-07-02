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

package org.miliconvert.xsmt.editor.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.miliconvert.xsmt.editor.model.FunctionElement;
import org.miliconvert.xsmt.editor.model.LinkElement;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;

public class XSMTEditPartFactory implements EditPartFactory {

	public EditPart createEditPart(EditPart context, Object modelElement) {
		EditPart part = null;

		if (modelElement instanceof XSMTDiagram) {
			part = new XSMTDiagramEditPart();
		} else if (modelElement instanceof FunctionElement) {
			part = new FunctionElementEditPart();
		} else if (modelElement instanceof LinkElement) {
			part = new LinkElementEditPart();
		} else if (modelElement instanceof SchemaElement) {
			part = new SchemaElementEditPart();
		} else {
			throw new RuntimeException(Messages.XSMTEditPartFactory_error_editPart
					+ modelElement);
		}

		System.out.println("createEditPart("+part+", "+modelElement+")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		part.setModel(modelElement);
		
		return part;
	}
}
