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

package org.miliconvert.xsmt.editor.parts.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.miliconvert.xsmt.editor.model.GModelElement;
import org.miliconvert.xsmt.editor.parts.SchemaElementEditPart;

public class SchemaChangeConstraintCommand extends Command {

	private Rectangle constraint;
	private Point prevLocation;
	private SchemaElementEditPart child;

	public SchemaChangeConstraintCommand(SchemaElementEditPart child,
			Rectangle constraint) {
		this.child = child;
		this.constraint = constraint;
		this.prevLocation = getModel().getLocation();

		setLabel(Messages.SchemaChangeConstraintCommand_label_move);
	}

	private GModelElement getModel() {
		return (GModelElement) child.getModel();
	}

	public void execute() {
		redo();
	}

	public void redo() {
		getModel().setLocation(constraint.getLocation());
	}

	public void undo() {
		getModel().setLocation(prevLocation);
	}

}
