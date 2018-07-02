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
import java.util.Map;

import org.eclipse.xsd.XSDAttributeDeclaration;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.IFeatVisitor;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.ModelUtililies;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Element;

/**
 * Visitor used on the target schema to produce the necessary xslt pieces.
 * 
 * @author Thomas Cataldo
 * 
 */
public class TargetSchemaVisitor implements IFeatVisitor {

	private Element xsl;
	private TModel tmodel;
	private ModelUtililies mu;

	private XSDElementDeclaration parentDecl;
	private Map<XSDElementDeclaration, Element> generatedElems;
	private Map<String, String> nsMap;

	public TargetSchemaVisitor(ModelUtililies mu, TModel tmodel,
			Map<String, String> nsMap, Element xsl) {
		this.xsl = xsl;
		this.mu = mu;
		this.tmodel = tmodel;
		this.nsMap = nsMap;
		this.generatedElems = new HashMap<XSDElementDeclaration, Element>();
	}

	/**
	 * @see org.miliconvert.xsmt.engine.IFeatVisitor#visit(org.eclipse.xsd.XSDFeature)
	 */
	public void visit(XSDFeature f) {
		if (f instanceof XSDElementDeclaration) {
			parentDecl = (XSDElementDeclaration) f;
		}

		Link l = mu.getLinkEndingOn(tmodel, f);

		if (l == null) {
			// System.out.println("No link ending on " + f.getName());
			// we do not generate this node in the target document
			return;
		}

		if (l.getStartFeat() != null) {
			System.out.println("featToFeatLink()");
			featureToFeatureLink(f, l);
		} else {
			System.out.println("functionToFeatLink()");
			functionToFeatureLink(f, l);
		}

	}

	private void featureToFeatureLink(XSDFeature f, Link l) {
		if (isElementToElementLink(l)) {
			Element tpl = DOMUtils.createElement(xsl, "xsl:template"); //$NON-NLS-1$
			tpl.setAttribute("match", l.getStartFeat().getName()); //$NON-NLS-1$

			Element target = DOMUtils.createElement(tpl, "xsl:element");
			target.setAttribute("name", f.getName());
			generatedElems.put(parentDecl, target);

			DOMUtils.createElement(target, "xsl:apply-templates"); //$NON-NLS-1$
		} else if (isAttributeToAttributeLink(l)) {
			Element parent = generatedElems.get(parentDecl);
			Element attrib = DOMUtils.createElement(parent, "xsl:attribute");
			attrib.setAttribute("name", f.getName());

			Element valueOf = DOMUtils.createElement(attrib, "xsl:value-of");
			valueOf.setAttribute("select", mu
					.getXPath((XSDAttributeDeclaration) l.getStartFeat()));
		}
		// TODO elem to attrib
		// TODO attrib to elem
	}

	private void functionToFeatureLink(XSDFeature f, Link l) {
		if (isFunctionToAttributeLink(l)) {
			// walk up links
			Element parent = generatedElems.get(parentDecl);
			Element attrib = DOMUtils.createElement(parent, "xsl:attribute");
			attrib.setAttribute("name", f.getName());
			Element valueOf = DOMUtils.createElement(attrib, "xsl:value-of");

			// compute select value
			String call = generateFunctionCall(null, l);
			valueOf.setAttribute("select", call);
		} else {
			generateFunctionCall(xsl, l);
		}
	}

	/**
	 * 
	 * @param l
	 *            a link starting on a function result
	 * @return
	 */
	private String generateFunctionCall(Element parent, Link l) {
		Function f = tmodel.getFunction(l.getStartFid());
		Link[] parameters = mu.getParameters(tmodel, f);
		String ret = nsMap.get(f.getImplementationClass()) + ":execute($func-"
				+ f.getId().get();

		for (int i = 0; i < parameters.length; i++) {
			if (parameters[i].getStartFid() != null) {
				ret += ", "+generateFunctionCall(parent, parameters[i]);
			} else {
				if (parameters[i].getStartFeat() instanceof XSDAttributeDeclaration) {
					ret += ", "+mu.getXPath((XSDAttributeDeclaration) parameters[i]
							.getStartFeat());
				} else {
					// element -> func param
					Element tpl = DOMUtils.createElement(xsl, "xsl:template"); //$NON-NLS-1$
//					System.err.println("startFeat: "+parameters[i].getStartFeat().getForm());
					tpl.setAttribute("match", parameters[i].getStartFeat().getName()); //$NON-NLS-1$
					Element vOf = DOMUtils.createElement(tpl, "xsl:copy-of");
					vOf.setAttribute("select", ret+", .)");
				}
			}
		}
		ret += ")";
		return ret;
	}

	private boolean isFunctionToAttributeLink(Link l) {
		return l.getStartFid() != null
				&& l.getEndFeat() instanceof XSDAttributeDeclaration;
	}

	private boolean isAttributeToAttributeLink(Link l) {
		return l.getStartFeat() instanceof XSDAttributeDeclaration
				&& l.getEndFeat() instanceof XSDAttributeDeclaration;
	}

	private boolean isElementToElementLink(Link l) {
		return l.getStartFeat() instanceof XSDElementDeclaration
				&& l.getEndFeat() instanceof XSDElementDeclaration;
	}

}
