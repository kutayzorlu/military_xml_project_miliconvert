package org.miliconvert.xsmt.tmodel.tree;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.IFeatVisitor;
import org.miliconvert.xsmt.tmodel.ModelUtililies;

public class SchemaTree implements TreeModel {

	private TreeModel tm;
	private ModelUtililies mu;

	private Map<XSDFeature, FeatTreeNode> featNodeIdx;
	private Map<FeatTreeNode, XSDFeature> nodeFeatIdx;
	private boolean fullyCached = false;

	public SchemaTree(XSDFeature root) {
		this(new ModelUtililies(), root);
	}

	public SchemaTree(ModelUtililies mu, XSDFeature root) {
		this.mu = mu;
		this.featNodeIdx = new HashMap<XSDFeature, FeatTreeNode>();
		this.nodeFeatIdx = new HashMap<FeatTreeNode, XSDFeature>();
		FeatTreeNode ftn = getNode(root, null);
		this.tm = new DefaultTreeModel(ftn);
	}

	FeatTreeNode getNode(XSDFeature root, FeatTreeNode parent) {
		if (featNodeIdx.containsKey(root)) {
			return featNodeIdx.get(root);
		}
		FeatTreeNode newNode = new FeatTreeNode(this, root, parent);
		featNodeIdx.put(root, newNode);
		nodeFeatIdx.put(newNode, root);
		return newNode;
	}

	ModelUtililies getModelUtilities() {
		return mu;
	}

	public void addTreeModelListener(TreeModelListener l) {
		tm.addTreeModelListener(l);
	}

	public Object getChild(Object parent, int index) {
		return tm.getChild(parent, index);
	}

	public int getChildCount(Object parent) {
		return tm.getChildCount(parent);
	}

	public int getIndexOfChild(Object parent, Object child) {
		return tm.getIndexOfChild(parent, child);
	}

	public Object getRoot() {
		return tm.getRoot();
	}

	public boolean isLeaf(Object node) {
		return tm.isLeaf(node);
	}

	public void removeTreeModelListener(TreeModelListener l) {
		tm.removeTreeModelListener(l);
	}

	public void valueForPathChanged(TreePath path, Object newValue) {
		tm.valueForPathChanged(path, newValue);
	}

	public List<XSDFeature> getParents(XSDFeature f) {
		if (!fullyCached) {
			forEach(new IFeatVisitor() {
				public void visit(XSDFeature f) {
				}
			});
		}
		LinkedList<XSDFeature> ret = new LinkedList<XSDFeature>();
		FeatTreeNode node = featNodeIdx.get(f);
		while (node != null) {
			ret.add(node.getFeature());
			node = (FeatTreeNode) node.getParent();
		}
		Collections.reverse(ret);
		return ret;
	}

	public void forEach(IFeatVisitor ifv) {
		System.out.println("forEach(ifv)");
		Vector<FeatTreeNode> start = new Vector<FeatTreeNode>();
		start.add((FeatTreeNode) getRoot());
		forEachImpl(start.elements(), ifv);
		fullyCached = true;
	}

	private void forEachImpl(Enumeration<FeatTreeNode> start, IFeatVisitor ifv) {
		while (start.hasMoreElements()) {
			FeatTreeNode ftn = start.nextElement();
			ifv.visit(ftn.getFeature());
			if (!ftn.isLeaf()) {
				forEachImpl(ftn.children(), ifv);
			}
		}
	}

}
