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

package org.miliconvert.xsmt.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.transform.TransformerException;

import org.miliconvert.xsmt.gmodel.GModel;
import org.miliconvert.xsmt.gmodel.GModelFactory;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelFactory;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Saves and Load .xsmt files
 * 
 * @author tom
 * 
 */
public class XSMTPackageFactory {

	private static final String PF = "xsmt:"; //$NON-NLS-1$

	private TModelFactory tf;
	private GModelFactory gf;

	public XSMTPackageFactory() {
		tf = new TModelFactory();
		gf = new GModelFactory();
	}

	public XSMTPackage load(Element xsmtNode) throws XSMTException {
		try {
			Element e = (Element) xsmtNode.getElementsByTagNameNS(TModel.NS,
					"tmodel").item(0); //$NON-NLS-1$
			TModel tModel = tf.load(e);

			e = (Element) xsmtNode.getElementsByTagNameNS(GModel.NS, "graphic") //$NON-NLS-1$
					.item(0);
			GModel gModel = gf.load(e);
			return new XSMTPackage(tModel, gModel);
		} catch (Exception e) {
			throw new XSMTException(e.getMessage(), e);
		}
	}

	public XSMTPackage load(InputStream in) throws XSMTException {
		try {
			return load(DOMUtils.parse(in).getDocumentElement());
		} catch (XSMTException xe) {
			throw xe;
		} catch (Exception e) {
			throw new XSMTException(e.getMessage(), e);
		}
	}

	public void save(OutputStream out, XSMTPackage p) throws XSMTException {
		Document doc = save(p);
		try {
			DOMUtils.serialise(doc, out);
		} catch (TransformerException e) {
			throw new XSMTException(e.getMessage(), e);
		}
	}
	
	public InputStream read(XSMTPackage p) throws XSMTException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		save(out, p);
		return new ByteArrayInputStream(out.toByteArray());
	}

	public Document save(XSMTPackage p) throws XSMTException {
		Document xsmt;
		try {
			xsmt = DOMUtils.createDoc(XSMTPackage.NS, PF + "xsmt"); //$NON-NLS-1$
			Document tmodel = tf.save(p.getTmodel());
			Document gmodel = gf.save(p.getGraphic());

			xsmt.getDocumentElement().appendChild(
					xsmt.importNode(tmodel.getDocumentElement(), true));
			xsmt.getDocumentElement().appendChild(
					xsmt.importNode(gmodel.getDocumentElement(), true));
		} catch (Exception e) {
			throw new XSMTException(Messages.XSMTPackageFactory__error_create, e);
		}

		return xsmt;
	}

}
