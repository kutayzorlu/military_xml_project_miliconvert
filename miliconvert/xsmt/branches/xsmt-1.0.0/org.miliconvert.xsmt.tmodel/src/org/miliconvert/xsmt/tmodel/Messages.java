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

package org.miliconvert.xsmt.tmodel;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.miliconvert.xsmt.tmodel.messages"; //$NON-NLS-1$
	public static String AbstractFunctionImpl__error_setproperties;
	public static String FunctionFactory__error_function_create;
	public static String LinkResolver_error_xsdfeature_uri;
	public static String LinkResolver_error_feature_not_found;
	public static String TModel_error_function_not_found;
	public static String TModel_error_id_not_found;
	public static String TModel_error_link_end;
	public static String TModel_error_link_start;
	public static String TModel_error_schema_not_found;
	public static String TModelFactory_error_dom_create;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
