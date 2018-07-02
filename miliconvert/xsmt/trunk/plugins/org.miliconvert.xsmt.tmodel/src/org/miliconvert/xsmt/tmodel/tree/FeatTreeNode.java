package org.miliconvert.xsmt.tmodel.tree;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import javax.swing.tree.TreeNode;

import org.eclipse.xsd.XSDAttributeDeclaration;
import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.ModelUtililies;

public class FeatTreeNode implements TreeNode {

	private XSDFeature feat;
	private SchemaTree st;
	private ModelUtililies mu;
	private Vector<FeatTreeNode> childNodes;
	private FeatTreeNode parent;

	public FeatTreeNode(SchemaTree st, XSDFeature feat, FeatTreeNode parent) {
		this.feat = feat;
		this.st = st;
		this.mu = st.getModelUtilities();
		this.parent = parent;
	}

	public Enumeration<FeatTreeNode> children() {
		if (childNodes == null) {
			loadChildren();
		}
		return childNodes.elements();
	}

	private void loadChildren() {
		List<XSDFeature> children = mu.getChildren(feat);
		Vector<FeatTreeNode> vnodes = new Vector<FeatTreeNode>();
		for (XSDFeature f : children) {
			vnodes.add(st.getNode(f, this));
		}
		childNodes = vnodes;
	}

	public boolean getAllowsChildren() {
		return true;
	}

	public TreeNode getChildAt(int childIndex) {
		if (childNodes == null) {
			loadChildren();
		}
		return childNodes.elementAt(childIndex);
	}

	public int getChildCount() {
		if (childNodes == null) {
			loadChildren();
		}
		return childNodes.size();
	}

	public int getIndex(TreeNode node) {
		return childNodes.indexOf(node);
	}

	public TreeNode getParent() {
		return parent;
	}
	
	public XSDFeature getFeature() {
		return feat;
	}

	public boolean isLeaf() {
		if (feat instanceof XSDAttributeDeclaration) {
			return true;
		}
		if (childNodes == null) {
			loadChildren();
		}
		return childNodes.size() == 0;
	}

}
