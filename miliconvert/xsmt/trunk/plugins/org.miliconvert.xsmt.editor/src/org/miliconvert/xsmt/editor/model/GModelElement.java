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

package org.miliconvert.xsmt.editor.model;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.miliconvert.xsmt.gmodel.Box;

public abstract class GModelElement extends GModelNode {

	public static final String LOCATION = "GModelElement.location"; //$NON-NLS-1$
	public static final String SIZE = "GModelElement.size"; //$NON-NLS-1$

	private Point location;
	private Dimension size;
	protected Box box;

	public GModelElement(Point location, Dimension size) {
		super();
		this.location = location;
		this.size = size;
	}

	protected GModelElement() {
		this(new Point(0, 0), new Dimension(50, 50));
	}

	public Point getLocation() {
		return location.getCopy();
	}

	public void setLocation(Point location) {
		Point oldValue = this.location;
		this.location = location;
		if (box != null) {
			box.setX(location.x);
			box.setY(location.y);
		}
		firePropertyChange(LOCATION, oldValue, location);
	}

	public Dimension getSize() {
		return size.getCopy();
	}

	public void setSize(Dimension size) {
		this.size = size;
		if (box != null) {
			box.setW(size.width);
			box.setH(size.height);
		}
	}

	public void setBox(Box b) {
		this.box = b;
		box.setX(location.x);
		box.setY(location.y);
		box.setW(size.width);
		box.setH(size.height);
	}

	public Box getBox() {
		return box;
	}

}
