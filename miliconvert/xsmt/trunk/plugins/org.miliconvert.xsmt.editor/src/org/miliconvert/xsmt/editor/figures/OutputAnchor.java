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

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;

public class OutputAnchor extends AbstractConnectionAnchor {

	public OutputAnchor(IFigure f) {
		super(f);
	}
	
	public Point getLocation(Point reference) {
		Point p = getOwner().getBounds().getRight();
		getOwner().translateToAbsolute(p);
		return p;
	}

	@Override
	public Point getReferencePoint() {
		return getLocation(null);
	}
	
}
