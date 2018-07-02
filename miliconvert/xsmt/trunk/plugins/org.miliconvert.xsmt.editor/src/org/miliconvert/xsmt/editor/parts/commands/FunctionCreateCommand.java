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
import org.miliconvert.xsmt.editor.model.FunctionElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;

public class FunctionCreateCommand extends Command {

	private final XSMTDiagram diagram;
	private FunctionElement function;
	private Rectangle bounds;

	public FunctionCreateCommand(FunctionElement function, XSMTDiagram diagram, Rectangle r) {
		this.diagram = diagram;
		this.function = function;
		this.bounds = r;

		setLabel(Messages.FunctionCreateCommand_label_create);
	}
	
	@Override
	public void execute() {
		function.setLocation(bounds.getLocation());
		redo();
	}

	@Override
	public boolean canExecute() {
		return function != null && diagram != null && bounds != null;
	}
	
	@Override
	public void redo() {
		diagram.add(function);
	}

	@Override
	public void undo() {
		diagram.remove(function);
	}

	
	
}
