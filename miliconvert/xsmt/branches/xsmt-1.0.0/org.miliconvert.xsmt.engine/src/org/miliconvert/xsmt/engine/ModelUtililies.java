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

package org.miliconvert.xsmt.engine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsd.XSDAttributeDeclaration;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFeature;
import org.eclipse.xsd.XSDSchema;
import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.TModel;

/**
 * Utility functions to manipulate tmodel
 * 
 * @author tom
 * 
 */
public class ModelUtililies {

	public ModelUtililies() {
	}

	public Link getLinkStartingFrom(TModel tmodel, XSDFeature f) {
		for (Link l : tmodel.getLinks()) {
			if (l.getStartFeat() == f) {
				return l;
			}
		}
		return null;
	}

	/**
	 * Returns the link ending on a given feature in the provided model. Returns
	 * null if no matching link is found.
	 * 
	 * @param tmodel
	 * @param f
	 * @return
	 */
	public Link getLinkEndingOn(TModel tmodel, XSDFeature f) {
		for (Link l : tmodel.getLinks()) {
			if (l.getEndFeat() == f) {
				return l;
			}
		}
		System.out.println("No link ending on '" + f.getName() + "' found.");
		return null;
	}

	public List<XSDFeature> getRoots(Schema source) {
		XSDSchema schema = source.getSchema();
		Map<Integer, List<XSDFeature>> tree = new HashMap<Integer, List<XSDFeature>>();
		buildTree(schema, 0, tree, new HashSet<EObject>());

		return tree.get(0);
	}

	private void putFeature(int lvl, XSDFeature feat,
			Map<Integer, List<XSDFeature>> tree) {
		List<XSDFeature> elems = tree.get(lvl);
		if (elems == null) {
			elems = new LinkedList<XSDFeature>();
			tree.put(lvl, elems);
		}
		elems.add(feat);
	}

	private void buildTree(EObject parent, int lvl,
			Map<Integer, List<XSDFeature>> tree, Set<EObject> walkedNodes) {
		if (walkedNodes.contains(parent)) {
			return;
		}
		walkedNodes.add(parent);
		for (EObject o : parent.eContents()) {
			if (o instanceof XSDFeature) {
				XSDFeature f = (XSDFeature) o;
				if (f.isFeatureReference()) {
					f = f.getResolvedFeature();
				}
				putFeature(lvl, f, tree);
				buildTree(f.getType(), lvl + 1, tree, walkedNodes);
			} else {
				buildTree(o, lvl, tree, walkedNodes);
			}
		}
	}

	public List<XSDFeature> getChildren(XSDFeature f) {
		Set<EObject> walkedNodes = new HashSet<EObject>();
		List<XSDFeature> ret = new LinkedList<XSDFeature>();

		visitChildren(f.getType(), walkedNodes, ret);
		return ret;
	}

	private void visitChildren(EObject parent, Set<EObject> walkedNodes,
			List<XSDFeature> ret) {
		if (walkedNodes.contains(parent)) {
			return;
		}
		for (EObject o : parent.eContents()) {
			if (o instanceof XSDFeature) {
				XSDFeature f = (XSDFeature) o;
				if (f.isFeatureReference()) {
					f = f.getResolvedFeature();
				}
				System.out.println(" ******** adding " + f.getName()); //$NON-NLS-1$
				ret.add(f);
			} else {
				visitChildren(o, walkedNodes, ret);
			}
		}

	}

	public void forEachFeature(Schema s, IFeatVisitor fv) {
		Set<EObject> walkedNodes = new HashSet<EObject>();
		visitAllChildren(s.getSchema(), walkedNodes, fv);
	}

	private void visitAllChildren(EObject parent, Set<EObject> walkedNodes,
			IFeatVisitor visitor) {
		if (walkedNodes.contains(parent)) {
			return;
		}
		for (EObject o : parent.eContents()) {
			if (o instanceof XSDFeature) {
				XSDFeature f = (XSDFeature) o;
				if (f.isFeatureReference()) {
					f = f.getResolvedFeature();
				}
				visitor.visit(f);
				visitAllChildren(f.getType(), walkedNodes, visitor);
			} else {
				visitAllChildren(o, walkedNodes, visitor);
			}
		}

	}

	/**
	 * TODO : this won't work on non "tree like" schemas (i.e. rss2)
	 * 
	 * @param f
	 * @return
	 */
	public List<XSDFeature> getParents(XSDFeature f) {
		LinkedList<XSDFeature> ret = new LinkedList<XSDFeature>();

		XSDConcreteComponent cc = f;
		while (cc != null) {
			if (cc instanceof XSDElementDeclaration) {
				ret.addFirst((XSDFeature) cc);
			}
			cc = cc.getContainer();
		}

		return ret;
	}

	/**
	 * returns the xpath string to access an attribute value
	 * 
	 * @param startFeat
	 * @return
	 */
	public String getXPath(XSDAttributeDeclaration startFeat) {
		return "@" + startFeat.getName();
	}

	public Link[] getParameters(TModel tmodel, Function f) {
		Link[] ret = new Link[f.getSignature().getParametersCount()];
		for (Link l : tmodel.getLinks()) {
			if (f.getId().equals(l.getEndFid())) {
				ret[l.getEndParamIdx()] = l;
			}
		}
		
		return ret;
	}

}
