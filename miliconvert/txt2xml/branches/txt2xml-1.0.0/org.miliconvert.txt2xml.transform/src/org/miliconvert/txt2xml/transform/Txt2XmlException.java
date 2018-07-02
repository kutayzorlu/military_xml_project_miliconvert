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

public class Txt2XmlException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7686909873157405849L;

	public Txt2XmlException(String s, Exception e) {
		super(s, e);
	}

	public Txt2XmlException(String s) {
		super(s);
	}
	
}
