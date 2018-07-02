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

package org.miliconvert.xsmt.tmodel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsd.XSDAttributeDeclaration;
import org.eclipse.xsd.XSDFeature;
import org.eclipse.xsd.XSDSchema;
import org.miliconvert.xsmt.tmodel.tree.SchemaTree;

/**
 * Utility functions to manipulate tmodel
 * 
 * @author tom
 * 
 */
public class ModelUtililies {

	private Map<XSDSchema, SchemaTree> cache;
	private Map<XSDSchema, List<XSDFeature>> rootsCache;

	public ModelUtililies() {
		cache = new HashMap<XSDSchema, SchemaTree>();
		rootsCache = new HashMap<XSDSchema, List<XSDFeature>>();
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
		//System.out.println("No link ending on '" + f.getName() + "' found.");
		return null;
	}

	public List<XSDFeature> getRoots(Schema source) {
		return getRoots(source.getSchema());
	}

	public List<XSDFeature> getRoots(XSDSchema source) {
		if (rootsCache.containsKey(source)) {
			return rootsCache.get(source);
		}

		List<XSDFeature> ret = new LinkedList<XSDFeature>();
		directForEachFeature(source, new RootExtractor(source, ret));

		if (ret.size() == 0) {
			System.err.println("Roots not found !!!! in " + source);
			if (rootsCache.size() == 1) {
				System.out.println("Returning roots of an another schema and hoping for the best");
				return rootsCache.values().iterator().next();
			}
		} else {
			rootsCache.put(source, ret);
			System.out.println("****************** ROOT Cached for " + source
					+ " ***********************");
		}
		return ret;
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
				ret.add(f);
			} else {
				visitChildren(o, walkedNodes, ret);
			}
		}

	}

	public void forEachFeature(Schema s, IFeatVisitor fv) {
		forEachFeature(s.getSchema(), fv);
	}

	public void forEachFeature(XSDSchema s, IFeatVisitor fv) {
		SchemaTree st = cacheTree(s);
		st.forEach(fv);
	}

	private void directForEachFeature(XSDSchema s, IFeatVisitor fv) {
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
		SchemaTree st = cacheTree(f);
		return st.getParents(f);
	}

	private SchemaTree cacheTree(XSDFeature f) {
		return cacheTree(f.getSchema());
	}

	private SchemaTree cacheTree(XSDSchema s) {
		try {
			if (!cache.containsKey(s)) {
				SchemaTree st = new SchemaTree(this, getRoots(s).get(0));
				cache.put(s, st);
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}

		return cache.get(s);
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
