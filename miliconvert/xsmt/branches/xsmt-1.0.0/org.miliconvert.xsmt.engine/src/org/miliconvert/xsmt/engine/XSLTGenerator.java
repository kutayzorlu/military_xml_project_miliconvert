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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamSource;

import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * Generates the XSLT document used to execute the transformation
 * 
 * The generated document is xalan specific. A more portable EXSLT solution
 * might be generated in the future. The generated document is not a "user
 * visible" file.
 * 
 * XSLT is a temporary step used to do the transformation
 * 
 * @author Thomas Cataldo
 * 
 */
public class XSLTGenerator implements IEngineListener {

	public static final String XSL_NS = "http://www.w3.org/1999/XSL/Transform"; //$NON-NLS-1$
	public static final String XSI_NS = "http://www.w3.org/2001/XMLSchema-instance"; //$NON-NLS-1$
	public static final String XS_NS = "http://www.w3.org/2001/XMLSchema"; //$NON-NLS-1$

	public static final String XALAN_MAP = "org.miliconvert.xsmt.tmodel.functions.XalanMap"; //$NON-NLS-1$

	private File xslt;
	private TModel tmodel;

	private Map<String, String> nsMap;
	private Set<String> excludeNs;
	private int id = 0;
	private ModelUtililies mu;

	public XSLTGenerator(TModel tmodel) {
		this.tmodel = tmodel;
		this.mu = new ModelUtililies();
		try {
			xslt = File.createTempFile("xsmt", ".xsl"); //$NON-NLS-1$ //$NON-NLS-2$
			xslt.deleteOnExit();
		} catch (IOException e) {
		}
		excludeNs = new HashSet<String>();
		nsMap = new HashMap<String, String>();
	}

	/**
	 * Creates the xslt temporary xslt
	 * model is assumed valid at this point.
	 * 
	 * @throws EngineException
	 */
	public void generate() throws EngineException {
		try {
			Document doc = DOMUtils.createDoc(XSL_NS, "xsl:stylesheet"); //$NON-NLS-1$

			Element xsl = doc.getDocumentElement();
			xsl.setAttribute("version", "1.0"); //$NON-NLS-1$ //$NON-NLS-2$

			Element output = DOMUtils.createElement(xsl, "xsl:output"); //$NON-NLS-1$
			output.setAttribute("method", "xml"); //$NON-NLS-1$ //$NON-NLS-2$
			output.setAttribute("encoding", "utf-8"); //$NON-NLS-1$ //$NON-NLS-2$
			output.setAttribute("indent", "yes"); //$NON-NLS-1$ //$NON-NLS-2$

			generateNamespaces(xsl);

			generateFunctionsInit(xsl);

			// size is 1
			for (Schema target : tmodel.getTargetSchemas()) {
				mu.forEachFeature(target, new TargetSchemaVisitor(mu, tmodel, nsMap,
						xsl));
			}

			String prefixes = "xs"; //$NON-NLS-1$
			for (String ns : excludeNs) {
				prefixes += " " + ns; //$NON-NLS-1$
			}
			xsl.setAttribute("exclude-result-prefixes", prefixes); //$NON-NLS-1$

			DOMUtils.serialise(doc, new FileOutputStream(xslt));
		} catch (Exception e) {
			throw new EngineException(e.getMessage(), e);
		}
	}

	private void generateNamespaces(Element xsl) {
		xsl.setAttribute("xmlns:xs", XS_NS); //$NON-NLS-1$

		// add xalan map for functions init
		putNs(XALAN_MAP, xsl);

		// add function impl classes
		for (Function f : tmodel.getFunctions()) {
			putNs(f.getImplementationClass(), xsl);
		}
	}

	private void putNs(String implClass, Element xsl) {
		String ns = getNS(implClass);
		xsl.setAttribute("xmlns:" + ns, "xalan://" + implClass); //$NON-NLS-1$ //$NON-NLS-2$
		excludeNs.add(ns);
	}

	/**
	 * Generate code to initialize the java functions used by this
	 * transformation
	 * 
	 * @param xsl
	 */
	private void generateFunctionsInit(Element xsl) {

		for (Function f : tmodel.getFunctions()) {
			String ns = getNS(f.getImplementationClass());
			Map<String, String> init = f.getProperties();
			String fid = f.getId().toString();
			if (init != null && !init.isEmpty()) {
				// init properties map
				String xmNs = getNS(XALAN_MAP);
				String prevVar = "init_" + fid; //$NON-NLS-1$
				createVar(xsl, prevVar, xmNs + ":new()"); //$NON-NLS-1$
				for (String prop : init.keySet()) {
					String var = getTempVarName();
					createVar(xsl, var, xmNs + ":addItem($" + prevVar + ", '" //$NON-NLS-1$ //$NON-NLS-2$
							+ prop + "', '" + init.get(prop) + "')"); //$NON-NLS-1$ //$NON-NLS-2$
					prevVar = var;
				}

				// instanciate function
				createVar(xsl, fid, ns + ":new($" + prevVar + ")"); //$NON-NLS-1$ //$NON-NLS-2$
			} else {
				// instanciate function
				createVar(xsl, fid, ns + ":new()"); //$NON-NLS-1$
			}
		}
	}

	private Element createVar(Element e, String name, String value) {
		Element var = DOMUtils.createElement(e, "xsl:variable"); //$NON-NLS-1$
		var.setAttribute("name", name); //$NON-NLS-1$
		var.setAttribute("select", value); //$NON-NLS-1$
		return var;
	}

	private String getTempVarName() {
		return "tmpvar" + id(); //$NON-NLS-1$
	}

	private String getNS(String implClass) {
		String ret = null;
		if (nsMap.containsKey(implClass)) {
			ret = nsMap.get(implClass);
		} else {
			int idx = implClass.lastIndexOf('.');
			ret = implClass.substring(idx + 1).toLowerCase() + id();
			nsMap.put(implClass, ret);
		}
		return ret;
	}

	private int id() {
		return id++;
	}

	public Source getSource() {
		Source ret = null;
		try {
			ret = new StreamSource(new FileInputStream(xslt));
		} catch (FileNotFoundException e) {
		}
		return ret;
	}

	public void dumpXslt(OutputStream out) throws FileNotFoundException,
			SAXException, IOException, ParserConfigurationException,
			FactoryConfigurationError, TransformerException {
		Document doc = DOMUtils.parse(new FileInputStream(xslt));
		DOMUtils.serialise(doc, out);
	}

	public void executableStateChange(boolean executable) {
		if (executable) {
			try {
				generate();
			} catch (EngineException e) {
				// use some kind of error handler here so that errors can be
				// reported by eclipse !
				e.printStackTrace();
			}
		}
	}

}
