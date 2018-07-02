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
import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.editor.figures.SchemaFigure;
import org.miliconvert.xsmt.editor.model.GModelConnectableElement;
import org.miliconvert.xsmt.editor.model.GModelElement;
import org.miliconvert.xsmt.editor.model.LinkElement;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;
import org.miliconvert.xsmt.editor.policies.SchemaElementEditPolicy;
import org.miliconvert.xsmt.editor.policies.SchemaElementNodeEditPolicy;

public class SchemaElementEditPart extends AbstractGraphicalEditPart implements
		PropertyChangeListener, NodeEditPart {

	private SchemaFigure figure;

	public SchemaElementEditPart() {
		super();
	}

	protected IFigure createFigure() {
		if (figure == null) {
			figure = new SchemaFigure(this);
		}
		return figure;
	}

	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new SchemaElementEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new SchemaElementNodeEditPolicy());
	}

	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		System.out.println("seep.propertyChange(" + prop + ")"); //$NON-NLS-1$ //$NON-NLS-2$
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
		if (GModelElement.SIZE.equals(prop)) {
			refreshVisuals();
		}
		if (SchemaElement.XSI.equals(prop)) {
			System.out.println(SchemaElement.XSI + " changed !!"); //$NON-NLS-1$
			figure.setWithXsi((Boolean) evt.getNewValue());
			refreshVisuals();
		}
		if (SchemaElement.VISIBLE.equals(prop)) {
			XSDFeature f = (XSDFeature) evt.getNewValue();
			makeVisible(f);
		}
	}

	private void removeLink(LinkElement le) {
		XSMTDiagram d = (XSMTDiagram) getParent().getModel();
		d.remove(le);
	}

	private void addLink(LinkElement le) {
		XSMTDiagram d = (XSMTDiagram) getParent().getModel();
		le.update(d.getTModel());
		d.add(le);
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

	private SchemaElement getCastedModel() {
		return (SchemaElement) getModel();
	}

	protected void refreshVisuals() {
		IFigure figure = getFigure();
		Rectangle bounds = new Rectangle(getCastedModel().getLocation(), figure
				.getPreferredSize());
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure,
				bounds);
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

	/**
	 * Forces tree expension so that the node reprenting the given feature is
	 * visible
	 * 
	 * @param f
	 */
	private void makeVisible(XSDFeature f) {
		System.out.println("seep.makeVisible(" + f.getName() + ")");
		SchemaFigure sf = (SchemaFigure) figure;
		sf.makeVisible(f);
	}

}
