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

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsd.XSDAttributeDeclaration;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFeature;
import org.eclipse.xsd.XSDSchema;

public class LinkResolver {

	private TModel tm;

	public LinkResolver(TModel tm) {
		this.tm = tm;
	}

	public String serializeEnd(Link l) throws TModelException {
		StringBuffer sb = new StringBuffer();
		if (l.getEndFid() != null) {
			sb.append("fid:"); //$NON-NLS-1$
			sb.append(l.getEndFid().toString());
			sb.append(',');
			sb.append(l.getEndParamIdx());
		} else {
			sb.append(serialize(l.getEndFeat()));
		}
		return sb.toString();
	}

	public String serializeStart(Link l) throws TModelException {
		StringBuffer sb = new StringBuffer();
		if (l.getStartFid() != null) {
			sb.append("fid:"); //$NON-NLS-1$
			sb.append(l.getStartFid().toString());
		} else {
			sb.append(serialize(l.getStartFeat()));
		}
		return sb.toString();
	}

	/**
	 * Given an element decl or attribute decl
	 * 
	 * @param f
	 * @return
	 * @throws TModelException
	 */
	public String serialize(XSDFeature f) throws TModelException {
		return serialize(tm.getId(f.getSchema()), f);
	}

	public String serialize(SchemaId id, XSDFeature f) throws TModelException {
		String ret = "xsd:"; //$NON-NLS-1$
		ret += id.toString();
		ret += ':';
		String hierarchy = ""; //$NON-NLS-1$
		if (f instanceof XSDAttributeDeclaration) {
			hierarchy += "@" + f.getName(); //$NON-NLS-1$
		} else {
			hierarchy += "/" + f.getName(); //$NON-NLS-1$
		}
		XSDConcreteComponent container = f.getContainer();
		while (container != null) {
			if (container instanceof XSDElementDeclaration) {
				hierarchy = "/" + ((XSDElementDeclaration) container).getName() //$NON-NLS-1$
						+ hierarchy;
			}
			container = container.getContainer();
		}
		ret += hierarchy;

		return ret;
	}

	
	private void findFeaturesByName(List<XSDFeature> results, String name,
			EObject parent) {
		for (EObject o : parent.eContents()) {
			if (o instanceof XSDFeature) {
				XSDFeature f = (XSDFeature) o;
				if (f.getName().equals(name)) {
					results.add(f);
				}
			}
			findFeaturesByName(results, name, o);
		}

	}

	/**
	 * Returns the {@link XSDFeature} matching a start or end attribute in a
	 * serialised tmodel:link
	 * 
	 * @param featUri
	 *            start or end attribute in tmodel:link
	 * 
	 * @return the corresponding {@link XSDFeature}
	 * @throws TModelException
	 */
	public XSDFeature resolveFeature(String featUri) throws TModelException {
		String[] featStrings = featUri.split(":"); //$NON-NLS-1$
		if (!featStrings[0].equals("xsd")) { //$NON-NLS-1$
			throw new TModelException(MessageFormat.format(
					Messages.LinkResolver_error_xsdfeature_uri, featUri));
		}
		XSDSchema sc = tm.findSchemaById(featStrings[1]).getSchema();
		List<XSDFeature> feats = new LinkedList<XSDFeature>();
		int idx = Math.max(featStrings[2].lastIndexOf("/"), featStrings[2] //$NON-NLS-1$
				.indexOf("@")); //$NON-NLS-1$
		String featName = featStrings[2].substring(idx + 1);

		findFeaturesByName(feats, featName, sc);
		for (XSDFeature f : feats) {
			String ser = serialize(f);
			if (ser.equals(featUri)) {
				return f;
			}
		}
		throw new TModelException(MessageFormat.format(
				Messages.LinkResolver_error_feature_not_found, featUri));
	}

	public Function resolveFunctionId(String fId) throws TModelException {
		String[] s = fId.split(":"); //$NON-NLS-1$
		String fid = s[1];
		int idx = fid.indexOf(',');
		if (idx > 0) {
			fid = fid.substring(0, idx);
		}
		return tm.findFunctionById(fid);
	}

	private int resolveIdxParam(String fid) {
		int idx = fid.indexOf(',');
		return Integer.parseInt(fid.substring(idx + 1));
	}

	public Link resolve(String start, String end) throws TModelException {
		Link l = new Link();
		if (start.startsWith("fid")) { //$NON-NLS-1$
			l.setStart(resolveFunctionId(start).getId());
		} else {
			l.setStart(resolveFeature(start));
		}

		if (end.startsWith("fid")) { //$NON-NLS-1$
			l.setEnd(resolveFunctionId(end).getId(), resolveIdxParam(end));
		} else {
			l.setEnd(resolveFeature(end));
		}
		return l;
	}

}
