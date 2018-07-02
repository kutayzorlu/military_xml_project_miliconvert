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

import java.io.File;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.SchemeBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.editor.borders.SeparatorBorder;
import org.miliconvert.xsmt.editor.figures.tree.Messages;
import org.miliconvert.xsmt.editor.figures.tree.TreeBranch;
import org.miliconvert.xsmt.editor.figures.tree.TreeRoot;
import org.miliconvert.xsmt.editor.figures.tree.XSDFeatureNode;
import org.miliconvert.xsmt.editor.model.GModelElement;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.editor.model.XSMTDiagram;
import org.miliconvert.xsmt.editor.parts.SchemaElementEditPart;
import org.miliconvert.xsmt.editor.parts.XSMTDiagramEditPart;
import org.miliconvert.xsmt.tmodel.LinkResolver;
import org.miliconvert.xsmt.tmodel.ModelUtililies;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelException;

/**
 * Figure representing xsd schemas
 * 
 * @author Thomas Cataldo
 * 
 */
public class SchemaFigure extends ConnectedFigure {

	private SchemaElementEditPart seep;
	private SchemaElement se;

	private Schema schema;
	private TreeRoot root;
	private ModelUtililies mu;

	private Label title;
	private boolean withXsi;

	private XSDFeatureNode selected;
	private Map<XSDFeatureNode, XSDFeature> nodeIdx;
	private Map<XSDFeature, XSDFeatureNode> featIdx;
	private LinkResolver lr;

	public SchemaFigure(SchemaElementEditPart ep) {
		super();
		this.seep = ep;
		this.nodeIdx = new HashMap<XSDFeatureNode, XSDFeature>();
		this.featIdx = new HashMap<XSDFeature, XSDFeatureNode>();
		this.se = (SchemaElement) seep.getModel();
		this.schema = se.getSchema();

		this.mu = new ModelUtililies();
		this.withXsi = false;
		TModel tm = ((XSMTDiagram) ((XSMTDiagramEditPart) ep.getParent())
				.getModel()).getTModel();
		
		
		lr = new LinkResolver(tm);

		drawContent();

	}

	private void drawContent() {
		System.out.println("drawContent");
		setLayoutManager(new ToolbarLayout());
		setBorder(new SchemeBorder(SchemeBorder.SCHEMES.ETCHED));

		title = new Label(getSchemaTitle());
		Font classFont = new Font(null, "Arial", 10, SWT.BOLD); //$NON-NLS-1$
		title.setFont(classFont);

		add(title);
		title.setBorder(new SeparatorBorder(false, false, false, true));

		RectangleFigure r = new RectangleFigure();
		r.setLayoutManager(new ToolbarLayout());
		r.setOutline(false);
		r.setBorder(new MarginBorder(5));
		add(r);

		List<XSDFeature> roots = mu.getRoots(schema);
		System.out.println("roots list with "+roots.size());
		XSDFeature rootElem = roots.get(0);
		root = new TreeRoot(createNode(rootElem), TreeBranch.STYLE_HANGING);
		fillTree(root, rootElem);

		r.add(root);
	}

	private void fillTree(TreeBranch pb, XSDFeature parent) {
		System.out.println("filltree(" + parent.getName() + ")");
		List<XSDFeature> children = mu.getChildren(parent);
		for (XSDFeature child : children) {
			TreeBranch tb = new TreeBranch(createNode(child),
					TreeBranch.STYLE_HANGING);
			pb.getContentsPane().add(tb);
		}
		XSDFeatureNode node = featIdx.get(parent);
		node.setExpanded(true);
		System.out.println("filltree(" + parent.getName() + ")");
	}

	private String getSchemaTitle() {
		File f = new File(schema.getFsPath());
		String ret = MessageFormat.format(Messages.SchemaFigure__label_title, f
				.getName());
		if (withXsi) {
			ret += Messages.SchemaFigure_label_title_xsi;
		}
		return ret;
	}

	private Figure createNode(XSDFeature f) {

		final XSDFeatureNode ref = new XSDFeatureNode(f);
		ref.addMouseListener(new MouseListener.Stub() {
			public void mousePressed(MouseEvent me) {
				System.out.println("selected !"); //$NON-NLS-1$
				setSelected(ref);
				doExpandCollapse();
			}

			public void mouseDoubleClicked(MouseEvent me) {
				System.out.println("dbl click !! I should expand here..."); //$NON-NLS-1$
			}
		});

		nodeIdx.put(ref, f);
		featIdx.put(f, ref);

		addAnchors(f, ref);

		return ref;
	}

	private void addAnchors(XSDFeature f, XSDFeatureNode ref) {
		String fId = getFeatAnchorId(f);
		addOutputAnchor("out-" + fId, new OutputAnchor(ref.getOut()));
		addInputAnchor("in-" + fId, new InputAnchor(ref.getIn()));
		System.err.println("added anchors for id " + fId);
	}

	private String getFeatAnchorId(XSDFeature f) {
		try {
			return lr.serialize(f);
		} catch (TModelException e) {
			e.printStackTrace();
			return f.toString();
		}
	}

	public boolean isWithXsi() {
		return withXsi;
	}

	public void setWithXsi(boolean withXsi) {
		this.withXsi = withXsi;
		title.setText(getSchemaTitle());
	}

	public void setSelected(XSDFeatureNode node) {
		if (selected != null) {
			selected.setSelected(false);
		}
		selected = node;
		selected.setSelected(!selected.isSelected());
	}

	public void doExpandCollapse() {
		if (selected == null)
			return;
		TreeBranch parent = (TreeBranch) selected.getParent();

		if (parent.getContentsPane().getChildren().isEmpty()) {
			// try load
			XSDFeature f = nodeIdx.get(selected);
			fillTree(parent, f);
			se.firePropertyChange(GModelElement.SIZE, null, se.getSize());
			return;
		}

		boolean expand = !parent.isExpanded();
		System.out.println("setExpanded(" + expand + ")"); //$NON-NLS-1$ //$NON-NLS-2$
		parent.setExpanded(expand);
		selected.setExpanded(expand);
		se.firePropertyChange(GModelElement.SIZE, null, se.getSize());

	}

	public void doExpandCollapse(TreeBranch parent, XSDFeature selectedFeature) {
		System.out.println("doExpandCollapse(" + selectedFeature.getName()
				+ ")..");
		if (parent.getContentsPane().getChildren().isEmpty()) {
			// try load
			fillTree(parent, selectedFeature);
			se.firePropertyChange(GModelElement.SIZE, null, se.getSize());
			System.out.println("doExpandCollapse() return early.");
			return;
		}

		boolean expand = !parent.isExpanded();
		System.out.println("setExpanded(" + expand + ")"); //$NON-NLS-1$ //$NON-NLS-2$
		parent.setExpanded(expand);
		selected.setExpanded(expand);
		se.firePropertyChange(GModelElement.SIZE, null, se.getSize());

	}

	public void makeVisible(XSDFeature f) {
		if (featIdx.containsKey(f)) {
			System.out.println(f.getName() + " seems already visible");
			return;
		}
		List<XSDFeature> parents = mu.getParents(f);
		System.out.print("Node expansion...");
		for (XSDFeature feat : parents) {
			System.out.print(" '" + feat.getName() + "'");
			XSDFeatureNode node = featIdx.get(feat);
			TreeBranch tb = (TreeBranch) node.getParent();
			if (tb.getContentsPane().getChildren().isEmpty()) {
				doExpandCollapse(tb, feat);
			}
		}
		System.out.println(". " + f.getName() + " should be visible.");
	}

	@Override
	public ConnectionAnchor getAnchor(String anchorName) {
		ConnectionAnchor ret = super.getAnchor(anchorName);

		if (ret == null) {
			int idx = anchorName.indexOf("-");
			try {
				XSDFeature f = lr.resolveFeature(anchorName.substring(idx + 1));
				makeVisible(f);
				ret = super.getAnchor(anchorName);
			} catch (TModelException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ret = " + ret);
		return ret;
	}

}
