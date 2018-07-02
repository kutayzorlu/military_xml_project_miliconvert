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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.miliconvert.xsmt.editor.model.LinkElement;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;

public class SchemaDeleteCommand extends Command {

	private XSMTDiagram parent;
	private SchemaElement se;
	private List<LinkElement> sc;
	private List<LinkElement> tc;

	public SchemaDeleteCommand(XSMTDiagram parent, SchemaElement child) {
		this.parent = parent;
		this.se = child;
		sc = new LinkedList<LinkElement>();
		tc = new LinkedList<LinkElement>();

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
		sc.addAll(se.getSourceConnections());
		tc.addAll(se.getTargetConnections());
		for (LinkElement le : sc) {
			le.detachEnd();
			le.detachStart();
		}
		for (LinkElement le : tc) {
			le.detachEnd();
			le.detachStart();
		}
		parent.remove(se);
	}

	@Override
	public void undo() {
		for (LinkElement le : sc) {
			le.attachStart();
			le.attachEnd();
		}
		sc.clear();
		for (LinkElement le : tc) {
			le.attachStart();
			le.attachEnd();
		}
		tc.clear();
		parent.add(se);
	}

}
