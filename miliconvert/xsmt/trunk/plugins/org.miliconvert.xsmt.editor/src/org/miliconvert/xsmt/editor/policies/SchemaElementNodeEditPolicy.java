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

package org.miliconvert.xsmt.editor.policies;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RoutingAnimator;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.miliconvert.xsmt.editor.figures.ConnectedFigure;
import org.miliconvert.xsmt.editor.model.LinkElement;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.editor.parts.SchemaElementEditPart;
import org.miliconvert.xsmt.editor.parts.commands.ConnectionCommand;
import org.miliconvert.xsmt.tmodel.Link;

public class SchemaElementNodeEditPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		ConnectionCommand command = (ConnectionCommand) request
				.getStartCommand();
		command.setTarget(getFE());
		ConnectionAnchor ctor = getSEEditPart().getTargetConnectionAnchor(
				request);
		if (ctor == null) {
			return null;
		}
		command.setTargetAnchor(getConnectedFigure().getAnchorId(ctor));
		return command;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		ConnectionCommand command = new ConnectionCommand();
		command.setLinkElement(new LinkElement(new Link()));
		command.setSource(getFE());

		ConnectionAnchor anchor = getConnectedFigure().nearestOutputAnchor(request.getLocation());
		String id = getConnectedFigure().getAnchorId(anchor);
		System.out.println("getCcCommand(req), anchorid: '"+id+"'");
		command.setStartAnchor(id);

		request.setStartCommand(command);
		return command;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		System.out.println("getReconnectSource");
		return null;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		System.out.println("getReconnectTarget");
		return null;
	}

	protected Connection createDummyConnection(Request req) {
		PolylineConnection conn = new PolylineConnection();
		conn.addRoutingListener(RoutingAnimator.getDefault());
		return conn;
	}

	private SchemaElementEditPart getSEEditPart() {
		return (SchemaElementEditPart) getHost();
	}

	private ConnectedFigure getConnectedFigure() {
		return (ConnectedFigure) getSEEditPart().getFigure();
	}

	private SchemaElement getFE() {
		return (SchemaElement) getSEEditPart().getModel();
	}

}
