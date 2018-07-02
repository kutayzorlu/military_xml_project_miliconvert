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
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

public class RectangularDropShadowLineBorder extends LineBorderEx implements
		DropShadowBorder {

	// whether the shadow will be painted on this border also
	private boolean drawDropShadow = true;

	/**
	 * delegated <code>DropShadow</code> object that has the drop shadow
	 * logic.
	 */
	private static RectangularDropShadow dropShadow = new RectangularDropShadow();

	/**
	 * Constructs a LineBorder of the specified width.
	 * 
	 * @param w
	 *            Width of inset for border
	 * 
	 */
	public RectangularDropShadowLineBorder(int w) {
		super(w);
	}

	/**
	 * Constructs a DropShadowLineBorder with the foreground color and backgroud
	 * color of the figure that it is drawing the border for.
	 * 
	 * 
	 */
	public RectangularDropShadowLineBorder() {
		super();
	}

	/**
	 * Method for determining the width of the drop shadow border will take up
	 * on the shape.
	 * 
	 * @return int the width of the drop shadow
	 */
	protected int getShadowWidth() {
		if (shouldDrawDropShadow() == true) {
			return getDropShadow().getShadowWidth();
		}
		return 0;

	}

	/**
	 * Method for determining the height of the drop shadow border will take up
	 * on the shape.
	 * 
	 * @return int the height of the drop shadow
	 */
	protected int getShadowHeight() {
		if (shouldDrawDropShadow() == true) {
			return getDropShadow().getShadowHeight();
		}
		return 0;
	}

	/**
	 * Method for determining the inset the border will take up on the shape.
	 * 
	 * @param figure
	 *            Figure that will be inset from the border
	 * @return Insets the Insets for the border on the given figure.
	 */
	public Insets getInsets(IFigure figure) {
		Insets insetsNew = super.getInsets(figure);
		insetsNew.top = 0;
		insetsNew.left = 0;
		insetsNew.bottom = insetsNew.bottom + getShadowHeight();
		insetsNew.right = insetsNew.right + getShadowWidth();

		return insetsNew;
	}

	/**
	 * Method shouldDrawShadow. Determines if the shadow should be drawn on the
	 * figure border. Checks that a drop shadow is the preferred border, and
	 * that the drop shadow can be drawn on this figure.
	 * 
	 * @param figure
	 *            Figure that the border will be drawn on
	 * @return boolean true if the shadow should be drawn, false otherwise.
	 */
	protected boolean shouldDrawShadow(IFigure figure) {

		if (shouldDrawDropShadow() == false)
			return false;

		Rectangle rBox = figure.getBounds();

		// check to see if we can draw a shadow on this figure
		if (rBox.width < getShadowWidth() * 2
				|| rBox.height < getShadowHeight() * 2) {
			return false;
		}

		return true;
	}

	/**
	 * @see TransparentBorder#getTransparentInsets(IFigure)
	 */
	public Insets getTransparentInsets(IFigure figure) {
		Insets insetsNew = new Insets();

		insetsNew.top = 0;
		insetsNew.left = 0;
		insetsNew.bottom = getShadowHeight();
		insetsNew.right = getShadowWidth();

		return insetsNew;
	}

	/**
	 * Is this border Opaque or not.
	 * 
	 * @return boolean true if opaque, false otherwise
	 */
	public boolean isOpaque() {
		return false;
	}

	/**
	 * Method paintLineBorder. Painting the line border on the shape without the
	 * dropshadow.
	 * 
	 * @param figure
	 *            Figure that the border will be painted on
	 * @param g
	 *            Graphics context
	 * @param insets
	 *            Insets value that contrains how the border will be painted.
	 */
	public void paintLineBorder(IFigure figure, Graphics g, Insets insets) {

		// will not paint line border if width is 0
		if (getWidth() > 0) {
			tempRect.setBounds(getPaintRectangle(figure, insets));
			g.setLineWidth(getWidth());
			g.drawRectangle(tempRect);
		}
	}

	/**
	 * Paint the border of the figure with a dropshadow.
	 * 
	 * @param figure
	 *            Figure that the border will be painted on
	 * @param g
	 *            Graphics context
	 * @param insets
	 *            Insets value that contrains how the border will be painted.
	 * @param rBox
	 *            Rectangle representing figure bounds.
	 */
	public void paintDropShadowBorder(IFigure figure, Graphics g,
			Insets insets, Rectangle rBox) {

		// Draw the dropShadow.
		getDropShadow().drawShadow(figure, g, rBox);

		// Draw the line border.
		if (getWidth() > 0) {
			// will not paint line border if width is 0
			tempRect.setBounds(getPaintRectangle(figure, insets));
			tempRect.width -= getShadowWidth();
			tempRect.height -= getShadowHeight();
			if (getWidth() % 2 == 1) {
				tempRect.width -= 1;
				tempRect.height -= 1;
			}
			tempRect.shrink(getWidth() / 2, getWidth() / 2);
			g.setLineWidth(getWidth());

			if (getColor() != null) {
				g.setForegroundColor(getColor());
			} else {
				g.setForegroundColor(figure.getForegroundColor());
			}
			g.drawRectangle(tempRect);
		}
	}

	/**
	 * Overridden method for painting the border on the shape.
	 * 
	 * @param figure
	 *            Figure that the border will be painted on
	 * @param g
	 *            Graphics context
	 * @param insets
	 *            Insets value that contrains how the border will be painted.
	 */
	public void paint(IFigure figure, Graphics g, Insets insets) {

		Rectangle rBox = new Rectangle(figure.getBounds());

		// draw drop shadow border
		if (shouldDrawShadow(figure)) {
			paintDropShadowBorder(figure, g, insets, rBox);
		}
		// draw line border
		else {
			paintLineBorder(figure, g, insets);
		}
	}

	/*
	 * @see org.eclipse.gmf.runtime.gef.ui.internal.figures.DropShadowBorder#drawDropShadow()
	 */
	public boolean shouldDrawDropShadow() {
		return this.drawDropShadow;
	}

	/*
	 * @see org.eclipse.gmf.runtime.gef.ui.internal.figures.DropShadowBorder#drawDropShadow(boolean)
	 */
	public void setShouldDrawDropShadow(boolean bDrawDropShadow) {
		this.drawDropShadow = bDrawDropShadow;
	}

	/**
	 * @return Returns the drip shadow iamge.
	 */
	protected RectangularDropShadow getDropShadow() {
		return dropShadow;
	}

}