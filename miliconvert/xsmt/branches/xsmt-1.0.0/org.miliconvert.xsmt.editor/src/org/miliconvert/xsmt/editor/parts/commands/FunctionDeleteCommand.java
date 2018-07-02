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
import org.miliconvert.xsmt.editor.model.FunctionElement;
import org.miliconvert.xsmt.editor.model.LinkElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;

/**
 * Deletes a function from the diagram
 * Handle links removal
 * 
 * @author Thomas Cataldo
 *
 */
public class FunctionDeleteCommand extends Command {

	private XSMTDiagram parent;
	private FunctionElement fe;
	private List<LinkElement> sc;
	private List<LinkElement> tc;

	public FunctionDeleteCommand(XSMTDiagram parent, FunctionElement child) {
		this.parent = parent;
		this.fe = child;
		sc = new LinkedList<LinkElement>();
		tc = new LinkedList<LinkElement>();
		setLabel(Messages.FunctionDeleteCommand_label_delete);
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
		sc.addAll(fe.getSourceConnections());
		tc.addAll(fe.getTargetConnections());
		for (LinkElement le : sc) {
			le.detachEnd();
			le.detachStart();
		}
		for (LinkElement le : tc) {
			le.detachEnd();
			le.detachStart();
		}
		parent.remove(fe);
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
		parent.add(fe);
	}

}
