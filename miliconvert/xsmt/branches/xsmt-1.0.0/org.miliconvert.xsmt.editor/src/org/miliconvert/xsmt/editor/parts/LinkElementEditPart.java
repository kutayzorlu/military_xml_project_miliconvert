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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RoutingAnimator;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.miliconvert.xsmt.editor.model.LinkElement;
import org.miliconvert.xsmt.editor.policies.LinkEditPolicy;
import org.miliconvert.xsmt.editor.policies.LinkEndpointEditPolicy;

public class LinkElementEditPart extends AbstractConnectionEditPart implements
		PropertyChangeListener {

	public LinkElementEditPart() {
		super();
	}

	public void activate() {
		super.activate();
		getLinkElement().addPropertyChangeListener(this);
	}

	public void activateFigure() {
		super.activateFigure();
		getFigure().addPropertyChangeListener(
				Connection.PROPERTY_CONNECTION_ROUTER, this);
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new LinkEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new LinkEditPolicy());

	}

	@Override
	protected IFigure createFigure() {
		PolylineConnection pc = new PolylineConnection();
		pc.addRoutingListener(RoutingAnimator.getDefault());
		PolygonDecoration arrow = new PolygonDecoration();
		arrow.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		arrow.setScale(5, 2.5);
		pc.setTargetDecoration(arrow);
		System.out.println("link figure created"); //$NON-NLS-1$
		return pc;
	}

	public void deactivate() {
		getLinkElement().removePropertyChangeListener(this);
		super.deactivate();
	}

	public void deactivateFigure() {
		getFigure().removePropertyChangeListener(
				Connection.PROPERTY_CONNECTION_ROUTER, this);
		super.deactivateFigure();
	}

	protected LinkElement getLinkElement() {
		return (LinkElement) getModel();
	}

	public void propertyChange(PropertyChangeEvent event) {
		System.out.println("leep:propertyChange(" + event.getPropertyName() //$NON-NLS-1$
				+ ")"); //$NON-NLS-1$
		refreshVisuals();
	}

	@Override
	protected void refreshVisuals() {
		getFigure().setForegroundColor(ColorConstants.red);
	}

}
