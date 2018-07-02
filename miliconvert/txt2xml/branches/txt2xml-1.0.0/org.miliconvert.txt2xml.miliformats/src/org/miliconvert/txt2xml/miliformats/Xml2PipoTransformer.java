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

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.Txt2XmlException;
import org.w3c.dom.Document;

public class Xml2PipoTransformer implements ITransformer {

	public Document transform(InputStream txtInput) throws Txt2XmlException {
		throw new Txt2XmlException("Can't transform xml to text");

	}

	public TransformerType getType() {
		return TransformerType.XML2TXT;
	}

	public InputStream transform(Document xmlInput) throws Txt2XmlException {
		System.out.println(Messages.PipoTransformer_running);
		String pipoTxt = "pipo;conforming;text\nfor;demonstration;purpose\n";
		return new ByteArrayInputStream(pipoTxt.getBytes());
	}

}
