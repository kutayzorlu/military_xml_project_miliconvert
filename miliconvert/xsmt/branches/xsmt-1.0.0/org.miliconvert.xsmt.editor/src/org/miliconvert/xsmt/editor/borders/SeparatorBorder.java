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

package org.miliconvert.xsmt.editor.borders;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class SeparatorBorder extends MarginBorder {

	private boolean bottom;
	private boolean right;
	private boolean left;
	private boolean top;

	public SeparatorBorder(boolean top, boolean left, boolean right,
			boolean bottom) {
		super(2, 2, 2, 2);
		this.top = top;
		this.left = left;
		this.right = right;
		this.bottom = bottom;
	}

	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		Rectangle where = getPaintRectangle(figure, insets);
		Point bl = where.getBottomLeft();
		Point br = where.getBottomRight();
		Point tl = where.getTopLeft();
		Point tr = where.getTopRight();

		if (top) {
			graphics.drawLine(tl.x, tl.y, tr.x, tr.y);
		}
		if (left) {
			graphics.drawLine(tl.x, tl.y, bl.x, bl.y);
		}
		if (right) {
			graphics.drawLine(tr.x - 1, tr.y, br.x - 1, br.y);
		}
		if (bottom) {
			graphics.drawLine(bl.x, bl.y - 1, br.x, br.y - 1);
		}

	}
}
