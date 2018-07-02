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

import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Handles tmodel saving and loading
 * 
 * @author Thomas Cataldo
 * 
 */
public class TModelFactory {

	private final String PF = "tmodel:"; //$NON-NLS-1$

	private int getId(String stringId) {
		String integer = stringId.substring(stringId.indexOf('-') + 1);
		return Integer.parseInt(integer);
	}

	public TModel load(Element tmodelNode) throws TModelException {
		TModel model = new TModel();
		FunctionFactory ff = new FunctionFactory();
		SchemaFactory ss = new SchemaFactory();

		String prefix = computePrefix(tmodelNode);

		NodeList functions = tmodelNode.getElementsByTagName(prefix
				+ "function"); //$NON-NLS-1$
		for (int i = 0; i < functions.getLength(); i++) {
			Element function = (Element) functions.item(i);
			Function f = ff.create(new FunctionId(getId(function
					.getAttribute("id"))), function.getAttribute("impl"), //$NON-NLS-1$ //$NON-NLS-2$
					new HashMap<String, String>());
			NodeList props = function.getElementsByTagName(prefix + "property"); //$NON-NLS-1$
			HashMap<String, String> ps = new HashMap<String, String>();
			for (int j = 0; j < props.getLength(); j++) {
				Element prop = (Element) props.item(j);
				ps.put(prop.getAttribute("name"), prop.getAttribute("value")); //$NON-NLS-1$ //$NON-NLS-2$
			}
			if (props.getLength() > 0) {
				f.setProperties(ps);
			}
			model.add(f);
		}

		NodeList schemas = tmodelNode.getElementsByTagName(prefix + "schema"); //$NON-NLS-1$
		for (int i = 0; i < schemas.getLength(); i++) {
			Element schema = (Element) schemas.item(i);
			Schema s = ss.create(
					new SchemaId(getId(schema.getAttribute("id"))), schema //$NON-NLS-1$
							.getAttribute("path")); //$NON-NLS-1$
			model.add(s);
		}

		LinkResolver lr = new LinkResolver(model);
		NodeList links = tmodelNode.getElementsByTagName(prefix + "link"); //$NON-NLS-1$
		for (int i = 0; i < links.getLength(); i++) {
			Element link = (Element) links.item(i);
			Link l = lr.resolve(link.getAttribute("start"), link //$NON-NLS-1$
					.getAttribute("end")); //$NON-NLS-1$
			model.add(l);
		}

		return model;
	}

	private String computePrefix(Element tmodelNode) {
		String prefix = tmodelNode.getPrefix();
		if (prefix == null || prefix.length() == 0) {
			return ""; //$NON-NLS-1$
		} else {
			return prefix + ":"; //$NON-NLS-1$
		}
	}

	public Document save(TModel t) throws TModelException {
		try {
			Document tm = DOMUtils.createDoc(TModel.NS, PF + "tmodel"); //$NON-NLS-1$
			Element tmodel = tm.getDocumentElement();

			Element schemas = DOMUtils.createElement(tmodel, PF + "schemas"); //$NON-NLS-1$
			Element functions = DOMUtils.createElement(tmodel,
					"tmodel:functions"); //$NON-NLS-1$
			Element links = DOMUtils.createElement(tmodel, PF + "links"); //$NON-NLS-1$

			addSchemas(t, schemas);
			addFunctions(t, functions);
			addLinks(t, links);

			return tm;
		} catch (TModelException te) {
			throw te;
		} catch (Exception e) {
			throw new TModelException(Messages.TModelFactory_error_dom_create, e);
		}
	}

	private void addLinks(TModel t, Element links) throws TModelException {
		LinkResolver lr = new LinkResolver(t);
		for (Link link : t.getLinks()) {
			Element l = DOMUtils.createElement(links, PF + "link"); //$NON-NLS-1$
			l.setAttribute("start", lr.serializeStart(link)); //$NON-NLS-1$
			l.setAttribute("end", lr.serializeEnd(link)); //$NON-NLS-1$
		}
	}

	private void addFunctions(TModel t, Element functions) {
		for (Function function : t.getFunctions()) {
			Element f = DOMUtils.createElement(functions, PF + "function"); //$NON-NLS-1$
			f.setAttribute("id", function.getId().toString()); //$NON-NLS-1$
			f.setAttribute("impl", function.getImplementationClass()); //$NON-NLS-1$
			for (String propName : function.getProperties().keySet()) {
				Element p = DOMUtils.createElement(f, PF + "property"); //$NON-NLS-1$
				p.setAttribute("name", propName); //$NON-NLS-1$
				p.setAttribute("value", function.getProperties().get(propName)); //$NON-NLS-1$
			}
		}
	}

	private void addSchemas(TModel t, Element schemas) {
		for (Schema schema : t.getSchemas()) {
			Element s = DOMUtils.createElement(schemas, "tmodel:schema"); //$NON-NLS-1$
			s.setAttribute("id", schema.getId().toString()); //$NON-NLS-1$
			s.setAttribute("path", schema.getFsPath()); //$NON-NLS-1$
		}
	}
}
