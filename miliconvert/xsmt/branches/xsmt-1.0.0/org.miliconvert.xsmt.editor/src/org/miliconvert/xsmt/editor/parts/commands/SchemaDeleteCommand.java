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

import org.eclipse.gef.commands.Command;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;

public class SchemaDeleteCommand extends Command {

	private XSMTDiagram parent;
	private SchemaElement se;

	public SchemaDeleteCommand(XSMTDiagram parent, SchemaElement child) {
		this.parent = parent;
		this.se = child;

		setLabel(Messages.SchemaDeleteCommand_label_delete);
	}

	@Override
	public boolean canUndo() {
		return true;
	}

	@Override
	public void execute() {
		redo();
	}

	@Override
	public void redo() {
		parent.remove(se);
	}

	@Override
	public void undo() {
		parent.add(se);
	}

}
