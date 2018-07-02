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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.requests.DropRequest;
import org.miliconvert.xsmt.editor.figures.ConnectedFigure;
import org.miliconvert.xsmt.editor.figures.FunctionFigure;
import org.miliconvert.xsmt.editor.model.FunctionElement;
import org.miliconvert.xsmt.editor.model.GModelConnectableElement;
import org.miliconvert.xsmt.editor.model.GModelElement;
import org.miliconvert.xsmt.editor.model.LinkElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;
import org.miliconvert.xsmt.editor.policies.FunctionElementEditPolicy;
import org.miliconvert.xsmt.editor.policies.FunctionElementNodeEditPolicy;

public class FunctionElementEditPart extends AbstractGraphicalEditPart
		implements PropertyChangeListener, NodeEditPart {

	private ConnectedFigure figure;

	public FunctionElementEditPart() {
	}

	private FunctionElement getCastedModel() {
		return (FunctionElement) getModel();
	}

	@Override
	protected IFigure createFigure() {
		if (figure == null) {
			figure = new FunctionFigure(this);
		}
		return figure;
	}

	/**
	 * Upon activation, attach to the model element as a property change
	 * listener.
	 */
	public void activate() {
		if (!isActive()) {
			super.activate();
			getCastedModel().addPropertyChangeListener(this);
		}
	}

	/**
	 * Upon deactivation, detach from the model element as a property change
	 * listener.
	 */
	public void deactivate() {
		if (isActive()) {
			super.deactivate();
			getCastedModel().removePropertyChangeListener(this);
		}
	}

	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		System.out.println("feep.propertyChange(" + prop + ")"); //$NON-NLS-1$ //$NON-NLS-2$
		if (GModelConnectableElement.INPUT_CONNECT.equals(prop)) {
			addLink((LinkElement) evt.getNewValue());
			refreshTargetConnections();
		}
		if (GModelConnectableElement.INPUT_DISCONNECT.equals(prop)) {
			removeLink((LinkElement) evt.getNewValue());
			refreshTargetConnections();
		}
		if (GModelConnectableElement.OUTPUT_CONNECT.equals(prop)) {
			addLink((LinkElement) evt.getNewValue());
			refreshSourceConnections();
		}
		if (GModelConnectableElement.OUTPUT_DISCONNECT.equals(prop)) {
			removeLink((LinkElement) evt.getNewValue());
			refreshSourceConnections();
		}
		if (GModelElement.LOCATION.equals(prop)) {
			refreshVisuals();
		}
	}

	private void addLink(LinkElement le) {
		XSMTDiagram d = (XSMTDiagram) getParent().getModel();
		le.update(d.getTModel());
		d.add(le);
	}

	private void removeLink(LinkElement le) {
		XSMTDiagram d = (XSMTDiagram) getParent().getModel();
		d.remove(le);
	}
	
	protected void refreshVisuals() {
		IFigure figure = getFigure();
		Rectangle bounds = new Rectangle(getCastedModel().getLocation(), figure
				.getPreferredSize());
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure,
				bounds);
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new FunctionElementEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new FunctionElementNodeEditPolicy());

	}

	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		LinkElement le = (LinkElement) connection.getModel();
		return figure.getAnchor(le.getStartName());
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		Point pt = ((DropRequest) request).getLocation();
		return figure.nearestOutputAnchor(pt);
	}

	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		LinkElement le = (LinkElement) connection.getModel();
		return figure.getAnchor(le.getEndName());
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		Point pt = ((DropRequest) request).getLocation();
		return figure.nearestInputAnchor(pt);
	}

	/**
	 * Returns a list of connections for which this is the source.
	 * 
	 * @return List of connections.
	 */
	protected List<LinkElement> getModelSourceConnections() {
		return getCastedModel().getSourceConnections();
	}

	/**
	 * Returns a list of connections for which this is the target.
	 * 
	 * @return List of connections.
	 */
	protected List<LinkElement> getModelTargetConnections() {
		return getCastedModel().getTargetConnections();
	}

}
