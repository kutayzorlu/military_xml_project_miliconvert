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

package org.miliconvert.xsmt.editor;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.miliconvert.xsmt.editor.messages"; //$NON-NLS-1$
	public static String ParameteredTool_message_init_needed;
	public static String ParameteredTool_message_init_property;
	public static String RunEngineAction_message_already_exist;
	public static String RunEngineAction_message_save;
	public static String RunEngineRetargetAction_label_run;
	public static String SetXsiAction_message_link_xml;
	public static String SetXsiRetargetAction_label_schema_instance;
	public static String XSMTEditorPaletteFactory_label_create_link;
	public static String XSMTEditorPaletteFactory_label_create_links;
	public static String XSMTEditorPaletteFactory_label_schema;
	public static String XSMTEditorPaletteFactory_label_tools;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
