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

package org.miliconvert.xsmt.gmodel;

import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class GModelFactory {

	private final String PF = "graphic:"; //$NON-NLS-1$

	public GModel load(Element gModelNode) {
		GModel graphic = new GModel();

		String prefix = gModelNode.getPrefix();
		if (prefix == null || prefix.length() == 0) {
			prefix = ""; //$NON-NLS-1$
		} else {
			prefix = prefix + ':';
		}

		NodeList nl = gModelNode.getElementsByTagName(prefix + "box"); //$NON-NLS-1$
		for (int i = 0; i < nl.getLength(); i++) {
			Element b = (Element) nl.item(i);
			Box box = new Box(b.getAttribute("modelid"), Integer.parseInt(b //$NON-NLS-1$
					.getAttribute("x")), Integer.parseInt(b.getAttribute("y")), //$NON-NLS-1$ //$NON-NLS-2$
					Integer.parseInt(b.getAttribute("w")), Integer.parseInt(b //$NON-NLS-1$
							.getAttribute("h"))); //$NON-NLS-1$
			graphic.addBox(box);
		}

		return graphic;
	}

	public Document save(GModel m) throws GModelException {
		try {
			Document doc = DOMUtils.createDoc(GModel.NS, PF + "graphic"); //$NON-NLS-1$
			Element root = doc.getDocumentElement();

			for (Box b : m.getBoxes()) {
				Element box = DOMUtils.createElement(root, PF + "box"); //$NON-NLS-1$
				box.setAttribute("modelid", "" + b.getModelId()); //$NON-NLS-1$ //$NON-NLS-2$
				box.setAttribute("x", "" + b.getX()); //$NON-NLS-1$ //$NON-NLS-2$
				box.setAttribute("y", "" + b.getY()); //$NON-NLS-1$ //$NON-NLS-2$
				box.setAttribute("w", "" + b.getW()); //$NON-NLS-1$ //$NON-NLS-2$
				box.setAttribute("h", "" + b.getH()); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return doc;
		} catch (Exception e) {
			throw new GModelException(Messages.GModelFactory_error_dom_create, e);
		}

	}

}
