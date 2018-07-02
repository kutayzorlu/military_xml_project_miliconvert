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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.miliconvert.txt2xml.transform.ITransformerDescriptor;
import org.miliconvert.txt2xml.transform.ITransformerFactory;

public class MiliTransformerFactory implements ITransformerFactory {

	private Map<String, ITransformerDescriptor> m;
	
	public MiliTransformerFactory() {
		m = new HashMap<String, ITransformerDescriptor>();
		m.put("pipo2xml", new Pipo2XmlTransformerDescriptor()); //$NON-NLS-1$
		m.put("xml2pipo", new Xml2PipoTransformerDescriptor()); //$NON-NLS-1$
	}
	
	public ITransformerDescriptor getDescriptor(String format) {
		return m.get(format);
	}

	public Collection<String> getSupportedTransformers() {
		return m.keySet();
	}

}
