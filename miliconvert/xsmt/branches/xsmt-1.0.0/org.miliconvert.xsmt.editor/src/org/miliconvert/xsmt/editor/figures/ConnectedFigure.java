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

package org.miliconvert.xsmt.editor.figures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.geometry.Point;

public class ConnectedFigure extends Figure {

	protected Map<String, ConnectionAnchor> allAnchors;

	protected List<ConnectionAnchor> inputAnchors;

	protected List<ConnectionAnchor> outputAnchors;

	public ConnectedFigure() {
		allAnchors = new HashMap<String, ConnectionAnchor>();
		inputAnchors = new LinkedList<ConnectionAnchor>();
		outputAnchors = new LinkedList<ConnectionAnchor>();
	}

	protected void addInputAnchor(String inputName, ConnectionAnchor anchor) {
		inputAnchors.add(anchor);
		allAnchors.put(inputName, anchor);
	}

	protected void addOutputAnchor(String outputName, ConnectionAnchor anchor) {
		outputAnchors.add(anchor);
		allAnchors.put(outputName, anchor);
	}

	public ConnectionAnchor getAnchor(String anchorName) {
		ConnectionAnchor ret = allAnchors.get(anchorName);
		System.out.println("getAnchor(" + anchorName + "): " + ret); //$NON-NLS-1$ //$NON-NLS-2$
		return ret;
	}

	public String getAnchorId(ConnectionAnchor anchor) {
		for (String id : allAnchors.keySet()) {
			if (anchor == allAnchors.get(id)) {
				return id;
			}
		}
		return null;
	}

	public ConnectionAnchor nearestInputAnchor(Point p) {
		return nearestAnchor(p, inputAnchors);
	}

	public ConnectionAnchor nearestOutputAnchor(Point p) {
		return nearestAnchor(p, outputAnchors);
	}

	private ConnectionAnchor nearestAnchor(Point p,
			List<ConnectionAnchor> anchors) {
		ConnectionAnchor closest = null;
		long min = Long.MAX_VALUE;

		for (ConnectionAnchor c : anchors) {
			Point p2 = c.getLocation(null);
			long d = p.getDistance2(p2);
			if (d < min) {
				min = d;
				closest = c;
			}
		}
		return closest;
	}
}
