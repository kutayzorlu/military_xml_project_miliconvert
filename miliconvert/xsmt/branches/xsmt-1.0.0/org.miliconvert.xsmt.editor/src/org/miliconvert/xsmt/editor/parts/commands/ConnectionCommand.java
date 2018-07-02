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
import org.miliconvert.xsmt.editor.model.GModelConnectableElement;
import org.miliconvert.xsmt.editor.model.LinkElement;

public class ConnectionCommand extends Command {

	private LinkElement linkElement;

	private GModelConnectableElement source;
	private String startAnchor;
	private GModelConnectableElement target;
	private String targetAnchor;

	private GModelConnectableElement oldSource;
	private String oldStartAnchor;
	private GModelConnectableElement oldTarget;
	private String oldTargetAnchor;

	public ConnectionCommand() {
		super(Messages.ConnectionCommand_label_link);
	}

	public LinkElement getLinkElement() {
		return linkElement;
	}

	public void setLinkElement(LinkElement linkElement) {
		this.linkElement = linkElement;
	}

	public GModelConnectableElement getSource() {
		return source;
	}

	public void setSource(GModelConnectableElement source) {
		this.source = source;
	}

	public String getStartAnchor() {
		return startAnchor;
	}

	public void setStartAnchor(String startAnchor) {
		this.startAnchor = startAnchor;
	}

	public GModelConnectableElement getTarget() {
		return target;
	}

	public void setTarget(GModelConnectableElement target) {
		this.target = target;
	}

	public String getTargetAnchor() {
		return targetAnchor;
	}

	public void setTargetAnchor(String targetAnchor) {
		this.targetAnchor = targetAnchor;
	}

	public void execute() {
		if (source != null) {
			linkElement.detachStart();
			linkElement.setStart(source);
			linkElement.setStartName(startAnchor);
			linkElement.attachStart();
		}
		if (target != null) {
			linkElement.detachEnd();
			linkElement.setEnd(target);
			linkElement.setEndName(targetAnchor);
			linkElement.attachEnd();
		}
		if (source == null && target == null) {
			linkElement.detachStart();
			linkElement.detachEnd();
			linkElement.setStart(null);
			linkElement.setEnd(null);
		}
		System.out.println("cc:execute(" + source + ", " + startAnchor //$NON-NLS-1$ //$NON-NLS-2$
				+ " --> " + target + ", " + targetAnchor + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public boolean canExecute() {
		System.out.println("cc:canExecute(" + source + ", " + startAnchor //$NON-NLS-1$ //$NON-NLS-2$
				+ " --> " + target + ", " + targetAnchor + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// allow only one output for now... will be problematic with link from
		// tree
		if (source != null && startAnchor != null && !source.isConnectable(startAnchor)) {
			return false;
		}

		// not to an already targeted anchor
		if (target != null && targetAnchor != null && !target.isConnectable(targetAnchor)) {
			return false;
		}
		
		// not to myself
		if (target != null && source != null && source == target) {
			return false;
		}
		return true;
	}

	public void redo() {
		execute();
	}

	public void undo() {
		source = linkElement.getStart();
		target = linkElement.getEnd();
		startAnchor = linkElement.getStartName();
		targetAnchor = linkElement.getEndName();

		linkElement.detachStart();
		linkElement.detachEnd();

		linkElement.setStart(oldSource);
		linkElement.setEnd(oldTarget);
		linkElement.setStartName(oldStartAnchor);
		linkElement.setEndName(oldTargetAnchor);

		linkElement.attachStart();
		linkElement.attachEnd();
	}

}
