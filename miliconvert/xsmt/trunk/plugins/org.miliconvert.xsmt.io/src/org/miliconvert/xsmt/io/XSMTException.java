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


/**
 * Generic exception thrown by tmodel classes on errors
 * 
 * @author Thomas Cataldo
 *
 */
public class XSMTException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4057446504819361919L;

	public XSMTException(String s) {
		super(s);
	}
	
	public XSMTException(String s, Throwable cause) {
		super(s, cause);
	}

}
