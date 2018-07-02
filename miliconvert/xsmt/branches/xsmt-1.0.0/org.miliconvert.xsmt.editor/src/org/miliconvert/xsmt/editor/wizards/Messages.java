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

package org.miliconvert.xsmt.editor.wizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.miliconvert.xsmt.editor.wizards.messages"; //$NON-NLS-1$
	public static String XSMTWizard_error_container;
	public static String XSMTWizard_error_pouic;
	public static String XSMTWizard_error_xsmtpfactory;
	public static String XSMTWizard_label_creating;
	public static String XSMTWizard_label_title;
	public static String XSMTWizard_message_opening;
	public static String XSMTWizardPage_label_browse;
	public static String XSMTWizardPage_label_container;
	public static String XSMTWizardPage_label_file_name;
	public static String XSMTWizardPage_label_title;
	public static String XSMTWizardPage_message_description;
	public static String XSMTWizardPage_message_exist_container;
	public static String XSMTWizardPage_message_file_extension;
	public static String XSMTWizardPage_message_select_container;
	public static String XSMTWizardPage_message_specify_container;
	public static String XSMTWizardPage_message_specify_file_name;
	public static String XSMTWizardPage_message_valid_file_name;
	public static String XSMTWizardPage_message_writable_project;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
