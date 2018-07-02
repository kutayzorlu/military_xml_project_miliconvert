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

package org.miliconvert.xsmt.editor.figures.tree;

import java.text.MessageFormat;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFeature;

/**
 * Tree node for xsd feature
 * 
 * @author Thomas Cataldo
 * 
 */
public class XSDFeatureNode extends Figure {

	private Label l;
	private Label toggle;

	private boolean selected;

	private Label in;
	private Label out;

	public XSDFeatureNode(XSDFeature f) {
		// setOutline(false);
		setLayoutManager(new ToolbarLayout(true));

		in = new Label();
		add(in);

		toggle = new Label("+");
		if (f instanceof XSDElementDeclaration) {
			add(toggle);
		}

		String lbl = null;
		if (f instanceof XSDElementDeclaration) {
			lbl = MessageFormat.format(
					Messages.XSDFeatureNode_label_declaration, f.getName());
		} else {
			lbl = MessageFormat.format(Messages.XSDFeatureNode_label_set, f
					.getName()); //$NON-NLS-2$
		}

		l = new Label(lbl);

		add(l);

		out = new Label();
		add(out);

		setBorder(new MarginBorder(new Insets(0, 3, 0, 0)));
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
		l.setForegroundColor(selected ? ColorConstants.green
				: ColorConstants.black);
	}

	public void setExpanded(boolean b) {
		toggle.setText((b ? "-" : "+"));
	}

	public IFigure getIn() {
		return in;
	}

	public IFigure getOut() {
		return out;
	}

}
