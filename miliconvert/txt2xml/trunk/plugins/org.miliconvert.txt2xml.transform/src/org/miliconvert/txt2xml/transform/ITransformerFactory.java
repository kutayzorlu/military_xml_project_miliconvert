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

package org.miliconvert.txt2xml.transform;

import java.util.Collection;

/**
 * @author Thomas Cataldo
 * 
 */
public interface ITransformerFactory {

	/**
	 * Returns a list of supported transformation types
	 * 
	 * @return
	 */
	Collection<String> getSupportedTransformers();

	/**
	 * @param format
	 *            one of the strings returned by getSupportedFormats
	 * @return a suitable transformer
	 */
	ITransformerDescriptor getDescriptor(String format);

}
