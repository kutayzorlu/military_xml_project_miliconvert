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

import java.text.MessageFormat;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.SchemeBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;
import org.miliconvert.xsmt.editor.borders.SeparatorBorder;
import org.miliconvert.xsmt.editor.model.FunctionElement;
import org.miliconvert.xsmt.editor.parts.FunctionElementEditPart;
import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.Variable;

public class FunctionFigure extends ConnectedFigure {

	public static final Color BG = new Color(null, 243, 250, 184);

	public FunctionFigure(FunctionElementEditPart fe) {
		super();
		setLayoutManager(new ToolbarLayout());
		setOpaque(true);
		setBackgroundColor(BG);

		Function f = getFx(fe);
		Label l = new Label(f.getName());
		Figure sig = new Figure();

		add(l);
		l.setBorder(new SeparatorBorder(false, false, false, true));

		ToolbarLayout layout = new ToolbarLayout(true);
		layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		sig.setLayoutManager(layout);
		add(sig);

		Figure params = new Figure();
		params.setLayoutManager(new ToolbarLayout());

		int i = 0;
		for (Variable v : f.getSignature().getParameters()) {
			Label param = new Label(MessageFormat.format(
					Messages.FunctionFigure_label_variable, v.getName()));
			param.setBorder(new SeparatorBorder(i != 0, false, true, false));
			params.add(param);
			String anchorId = f.getId() + "," + i;
			addInputAnchor(anchorId, new InputAnchor(param)); //$NON-NLS-1$
			System.out.println("anchor id '" + anchorId + "' added.");
			i++;
		}
		sig.add(params);

		Label result = new Label(Messages.FunctionFigure_label_result);
		result.setBorder(new MarginBorder(2, 2, 2, 2));
		sig.add(result);
		addOutputAnchor(f.getId().toString(), new OutputAnchor(result));

		setBorder(new SchemeBorder(SchemeBorder.SCHEMES.ETCHED));
	}

	private Function getFx(FunctionElementEditPart fe) {
		return ((FunctionElement) fe.getModel()).getFunction();
	}

}
