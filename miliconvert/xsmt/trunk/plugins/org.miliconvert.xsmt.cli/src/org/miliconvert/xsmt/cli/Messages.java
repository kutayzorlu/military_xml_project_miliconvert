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

package org.miliconvert.xsmt.cli;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.miliconvert.xsmt.cli.messages"; //$NON-NLS-1$
	public static String XSMT_error_not_found;
	public static String XSMT_error_not_usable;
	public static String XSMT_error_not_valid;
	public static String XSMT_message_creating;
	public static String XSMT_message_generating;
	public static String XSMT_message_nok;
	public static String XSMT_message_ok;
	public static String XSMT_message_stop;
	public static String XSMT_message_syntax;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
