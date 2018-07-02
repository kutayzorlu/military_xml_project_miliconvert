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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

public class RectangularDropShadow {

	private static ImageData alpha_ib = DropShadowImages.DESC_BOTTOM
			.getImageData();

	// Images for the border of the shadow border
	private static ImageData alpha_ilb = DropShadowImages.DESC_LEFT_BOTTOM
			.getImageData();

	private static ImageData alpha_ir = DropShadowImages.DESC_RIGHT
			.getImageData();

	private static ImageData alpha_irb = DropShadowImages.DESC_RIGHT_BOTTOM
			.getImageData();

	private static ImageData alpha_itr = DropShadowImages.DESC_TOP_RIGHT
			.getImageData();

	/**
	 * 
	 */
	public RectangularDropShadow() {
		super();
	}

	/**
	 * Utility function for the paint routine to create the image that will be
	 * displayed based on a transparency image.
	 */
	private Image createImageFromAlpha(IFigure figure, ImageData alphaData,
			Dimension dim) {
		Color foreColor = figure.getForegroundColor();

		ImageData newAlpha = alphaData;
		if (alphaData.width != dim.width || alphaData.height != dim.height) {
			ImageData newAlphaData = new ImageData(((dim.width + 3) / 4) * 4,
					dim.height, alphaData.depth, alphaData.palette);
			Image imgNewAlpha = new Image(null, newAlphaData);
			GC gc = new GC(imgNewAlpha);

			Image imgAlpha = new Image(null, alphaData);
			gc.drawImage(imgAlpha, 0, 0, alphaData.width, alphaData.height, 0,
					0, newAlphaData.width, newAlphaData.height);

			int nDelta = newAlphaData.width - dim.width;
			if (nDelta > 0) {
				gc.setForeground(ColorConstants.black);
				gc.setBackground(ColorConstants.black);
				gc.fillRectangle(newAlphaData.width - nDelta, 0, nDelta,
						newAlphaData.height);
			}

			newAlpha = imgNewAlpha.getImageData();

			imgNewAlpha.dispose();
			imgAlpha.dispose();
			gc.dispose();
		}

		Image img = new Image(Display.getDefault(), newAlpha.width,
				newAlpha.height);

		GC gc = new GC(img);
		gc.setForeground(foreColor);
		gc.setBackground(foreColor);
		gc.fillRectangle(0, 0, newAlpha.width, newAlpha.height);
		gc.dispose();

		ImageData filledData = img.getImageData();
		img.dispose();

		for (int i = 0; i < newAlpha.height; i++) {
			filledData.setAlphas(0, i, newAlpha.width, newAlpha.data, i
					* newAlpha.width);
		}

		return new Image(null, filledData);
	}

	/**
	 * @param figure
	 * @param g
	 * @param rBox
	 */
	private void drawBottomLeftShadow(IFigure figure, Graphics g, Rectangle rBox) {
		Dimension dim = getLeftShadowDimension();
		Image ilb = createImageFromAlpha(figure, alpha_ilb, dim);
		Point pt = new Point(rBox.getLeft().x, rBox.getBottom().y
				- alpha_ib.height);
		g.drawImage(ilb, pt);
		ilb.dispose();
	}

	/**
	 * @param figure
	 * @param g
	 * @param rBox
	 */
	protected void drawBottomRightShadow(IFigure figure, Graphics g,
			Rectangle rBox) {
		Dimension dim;
		dim = getBottomRightShadowDimension();
		Image irb = createImageFromAlpha(figure, alpha_irb, dim);

		Point pt = new Point(rBox.getRight().x - alpha_ir.width, rBox
				.getBottom().y
				- alpha_ib.height);
		g.drawImage(irb, pt);
		irb.dispose();
	}

	/**
	 * @param figure
	 * @param g
	 * @param rBox
	 */
	protected void drawBottomShadow(IFigure figure, Graphics g, Rectangle rBox) {

		Dimension dim = getBottomShadowDimension(figure, rBox);
		Image ib = createImageFromAlpha(figure, alpha_ib, dim);
		Point pt = new Point(rBox.getLeft().x + alpha_ilb.width, rBox
				.getBottom().y
				- alpha_ib.height);
		g.drawImage(ib, pt);
		ib.dispose();
	}

	/**
	 * @param figure
	 * @param g
	 * @param rBox
	 */
	protected void drawRightShadow(IFigure figure, Graphics g, Rectangle rBox) {
		Dimension dim = getRightShadowDimension(figure, rBox);
		Image ir = createImageFromAlpha(figure, alpha_ir, dim);
		Point pt = new Point(rBox.getRight().x - alpha_ir.width,
				rBox.getTop().y + alpha_itr.height);
		g.drawImage(ir, pt);
		ir.dispose();
	}

	/**
	 * draw a shadow around given rectangle
	 * 
	 * @rect
	 * @param figure
	 * @param g
	 * @param rect
	 *            the rectangle to draw the shadow around
	 */
	public void drawShadow(IFigure figure, Graphics g, Rectangle rect) {

		drawBottomLeftShadow(figure, g, rect);

		// bottom
		drawBottomShadow(figure, g, rect);

		// bottom right
		drawBottomRightShadow(figure, g, rect);

		// right
		drawRightShadow(figure, g, rect);

		// top right
		drawTopRightShadow(figure, g, rect);

	}

	/**
	 * @param figure
	 * @param g
	 * @param rBox
	 */
	protected void drawTopRightShadow(IFigure figure, Graphics g, Rectangle rBox) {
		Dimension dim = new Dimension(alpha_itr.width, alpha_itr.height);
		Image itr = createImageFromAlpha(figure, alpha_itr, dim);
		Point pt = new Point(rBox.getRight().x - alpha_ir.width,
				rBox.getTop().y);
		g.drawImage(itr, pt);
		itr.dispose();
	}

	/**
	 * @return the <code>Dimension</code> representing the bottom right shadow
	 */
	protected Dimension getBottomRightShadowDimension() {
		return new Dimension(alpha_irb.width, alpha_irb.height);
	}

	/**
	 * @param rBox
	 * @return the <code>Dimension</code> representing the bottom shadow
	 */
	protected Dimension getBottomShadowDimension(IFigure figure, Rectangle rBox) {

		int width = Math.max(rBox.width - alpha_ilb.width - alpha_irb.width, 1);
		return new Dimension(width, alpha_ib.height);
	}

	/**
	 * @return the <code>Dimension</code> representing the left shadow
	 */
	protected Dimension getLeftShadowDimension() {
		return new Dimension(alpha_ilb.width, alpha_ilb.height);
	}

	/**
	 * @param figure
	 * @param rBox
	 * @return the <code>Dimension</code> representing the right shadow
	 */
	protected Dimension getRightShadowDimension(IFigure figure, Rectangle rBox) {

		int height = Math.max(
				rBox.height - alpha_itr.height - alpha_irb.height, 2);
		return new Dimension(alpha_ir.width, height);
	}

	/**
	 * Method for determining the height of the drop shadow border will take up
	 * on the shape.
	 * 
	 * @return int the height of the drop shadow
	 */
	public int getShadowHeight() {
		return alpha_ib.height;
	}

	/**
	 * Method for determining the width of the drop shadow border will take up
	 * on the shape.
	 * 
	 * @return int the width of the drop shadow
	 */
	public int getShadowWidth() {
		return alpha_ir.width;
	}

}
