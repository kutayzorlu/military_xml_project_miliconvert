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

package org.miliconvert.txt2xml.miliformats;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.Txt2XmlException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public class Pipo2XmlTransformer implements ITransformer {

	public Document transform(InputStream txtInput) throws Txt2XmlException {
		System.out.println(Messages.PipoTransformer_running);
		try {
			Document ret = createDoc("pipo");

			return ret;
		} catch (ParserConfigurationException e) {
			throw new Txt2XmlException(e.getMessage(), e);
		}

	}

	public TransformerType getType() {
		return TransformerType.TXT2XML;
	}

	public InputStream transform(Document xmlInput) throws Txt2XmlException {
		throw new Txt2XmlException("Can't transform xml to text");
	}

	private Document createDoc(String rootElement)
			throws ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbf.newDocumentBuilder();
		DOMImplementation di = builder.getDOMImplementation();
		return di.createDocument(null, rootElement, null);
	}

}
