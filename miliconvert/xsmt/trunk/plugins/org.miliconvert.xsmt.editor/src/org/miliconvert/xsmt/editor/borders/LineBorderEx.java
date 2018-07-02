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
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.swt.graphics.Color;

public class LineBorderEx extends LineBorder {

	/**
	 * Constructs a default black LineBorder with a width of one pixel.
	 */
	public LineBorderEx() {
		super();
	}

	/**
	 * Constructs a black LineBorder with a specified width
	 * @param width width of the line border in pixels
	 */
	public LineBorderEx(int width) {
		super(width);
	}

	/**
	 * Constructs a LineBorder with a width of 1 pixel using the color specified
	 * @param color
	 */
	public LineBorderEx(Color color) {
		super(color);
	}

	/**
	 * Construct a LineBorder with a given color and width
	 * @param color
	 * @param width width of the line border in pixels
	 */
	public LineBorderEx(Color color, int width) {
		super(color, width);
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.LineBorder#paint(org.eclipse.draw2d.IFigure, org.eclipse.draw2d.Graphics, org.eclipse.draw2d.geometry.Insets)
	 */
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		tempRect.setBounds(getPaintRectangle(figure, insets));
		if (getWidth() % 2 == 1) {
			tempRect.width -= 1;
			tempRect.height -= 1;
		}
		int shrinkWidth =  getWidth() / 2;
		tempRect.shrink(shrinkWidth, shrinkWidth);

		graphics.setLineWidth(getWidth());
		if (getColor() != null)
			graphics.setForegroundColor(getColor());

		graphics.drawRectangle(tempRect);
	}
}
