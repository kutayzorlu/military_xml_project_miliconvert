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

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;

public class SchemaCreateCommand extends Command {

	private final XSMTDiagram diagram;
	private SchemaElement schema;
	private Rectangle bounds;

	public SchemaCreateCommand(SchemaElement schema, XSMTDiagram diagram,
			Rectangle r) {
		this.diagram = diagram;
		this.schema = schema;
		this.bounds = r;

		setLabel(Messages.SchemaCreateCommand_label_create);
	}

	@Override
	public void execute() {
		schema.setLocation(bounds.getLocation());
		redo();
	}

	@Override
	public boolean canExecute() {
		return schema != null && diagram != null && bounds != null;
	}

	@Override
	public void redo() {
		diagram.add(schema);
	}

	@Override
	public void undo() {
		diagram.remove(schema);
	}

}
