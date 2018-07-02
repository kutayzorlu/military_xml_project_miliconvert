package org.miliconvert.xsmt.tmodel.tests;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.tree.FeatTreeNode;

public class SchemaTreeRenderer extends DefaultTreeCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2783249434439085223L;

	public SchemaTreeRenderer() {
	}

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean selected, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {
		JLabel ret = (JLabel) super.getTreeCellRendererComponent(tree, value,
				selected, expanded, leaf, row, hasFocus);
		FeatTreeNode ftn = (FeatTreeNode) value;
		XSDFeature feat = ftn.getFeature();

		String label = feat.getName();
		if (feat instanceof XSDElementDeclaration) {
			label = "<" + label + ">";
		} else {
			label = "@" + label;
		}
		label += " (@" + Integer.toHexString(value.hashCode()) + ")";

		ret.setText(label);

		return ret;
	}

}
