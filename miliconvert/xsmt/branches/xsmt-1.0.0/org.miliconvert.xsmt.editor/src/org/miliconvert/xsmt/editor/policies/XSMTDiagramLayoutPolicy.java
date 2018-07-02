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

package org.miliconvert.xsmt.editor.policies;

import java.text.MessageFormat;
import java.util.Map;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.miliconvert.xsmt.editor.SchemaCreationFactory;
import org.miliconvert.xsmt.editor.SchemaTool;
import org.miliconvert.xsmt.editor.model.FunctionElement;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;
import org.miliconvert.xsmt.editor.parts.FunctionElementEditPart;
import org.miliconvert.xsmt.editor.parts.SchemaElementEditPart;
import org.miliconvert.xsmt.editor.parts.commands.FunctionChangeConstraintCommand;
import org.miliconvert.xsmt.editor.parts.commands.FunctionCreateCommand;
import org.miliconvert.xsmt.editor.parts.commands.SchemaChangeConstraintCommand;
import org.miliconvert.xsmt.editor.parts.commands.SchemaCreateCommand;
import org.miliconvert.xsmt.tmodel.TModelException;

public class XSMTDiagramLayoutPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command createChangeConstraintCommand(EditPart child,
			Object constraint) {
		if (child instanceof FunctionElementEditPart) {
			return new FunctionChangeConstraintCommand(
					(FunctionElementEditPart) child, (Rectangle) constraint);
		}
		if (child instanceof SchemaElementEditPart) {
			return new SchemaChangeConstraintCommand(
					(SchemaElementEditPart) child, (Rectangle) constraint);
		} else {
			throw new RuntimeException(MessageFormat.format(
					Messages.XSMTDiagramLayoutPolicy_error_element, child));
		}
	}

	@SuppressWarnings("unchecked")//$NON-NLS-1$
	@Override
	protected Command getCreateCommand(CreateRequest request) {

		Object childClass = request.getNewObjectType();
		if (childClass == null) {
			return null;
		}

		if (childClass == FunctionElement.class) {
			FunctionElement fe = (FunctionElement) request.getNewObject();
			Map<String, String> extendedParams = request.getExtendedData();
			try {
				if (extendedParams != null && !extendedParams.isEmpty()) {
					fe.getFunction().setProperties(extendedParams);
				}
			} catch (TModelException e) {
				throw new RuntimeException(
						Messages.XSMTDiagramLayoutPolicy_error_params, e);
			}
			return new FunctionCreateCommand(fe, (XSMTDiagram) getHost()
					.getModel(), (Rectangle) getConstraintFor(request));
		} else if (childClass == SchemaElement.class) {

			Map params = request.getExtendedData();
			String path = (String) params.get(SchemaTool.SCHEMA_PATH);
			SchemaCreationFactory scf = ((SchemaRequest) request)
					.getSchemaCreationFactory();
			scf.setOsPath(path);
			SchemaElement se = (SchemaElement) request.getNewObject();
			return new SchemaCreateCommand(se, (XSMTDiagram) getHost()
					.getModel(), (Rectangle) getConstraintFor(request));

		} else {
			throw new RuntimeException(
					Messages.XSMTDiagramLayoutPolicy_error_unknown_object
							+ childClass);
		}

	}
}
