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

package org.miliconvert.xsmt.editor.parts.commands;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.miliconvert.xsmt.editor.parts.commands.messages"; //$NON-NLS-1$
	public static String ConnectionCommand_label_link;
	public static String FunctionChangeConstraintCommand_label_move;
	public static String FunctionCreateCommand_label_create;
	public static String FunctionDeleteCommand_label_delete;
	public static String SchemaChangeConstraintCommand_label_move;
	public static String SchemaCreateCommand_label_create;
	public static String SchemaDeleteCommand_label_delete;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
