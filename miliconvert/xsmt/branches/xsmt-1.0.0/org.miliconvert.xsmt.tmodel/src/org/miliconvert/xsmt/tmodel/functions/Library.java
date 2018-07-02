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

package org.miliconvert.xsmt.tmodel.functions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Lists avalaible transformation functions
 * 
 * The list is still hardcoded for now.
 * 
 * TODO: think more about user functions...
 * 
 * @author tom
 * 
 */
public class Library {

	public static final String PF = "org.miliconvert.xsmt.functions."; //$NON-NLS-1$

	private static Map<FunctionCategory, List<FunctionDescriptor>> idx;

	static {
		idx = new HashMap<FunctionCategory, List<FunctionDescriptor>>();

		// ajouter les FunctionsExtensions
		FunctionExtensionParser functionExtensionParser = new FunctionExtensionParser();
		for (FunctionExtension functionExtension : functionExtensionParser
				.getFunctionExtensionParsed()) {
			putFunc(functionExtension.getFunctionCategory(), functionExtension
					.getFunctionName(), functionExtension.getFunctionComment(),
					functionExtension.getFunctionClass(), functionExtension
							.getMandatoryProperties());
		}
	}

	private static void putFunc(FunctionCategory cat, String name,
			String comment, String sClass, String mandatoryP) {
		System.out.println("Adding function: cat: " + cat + ", name:" + name); //$NON-NLS-1$ //$NON-NLS-2$
		String[] mp = new String[0];
		if (mandatoryP != null) {
			mp = mandatoryP.split(";"); //$NON-NLS-1$
		}
		putFunc(cat, name, comment, sClass, mp);
	}

	private static void putFunc(FunctionCategory cat, String name,
			String comment, String sClass, String[] mandatoryProperties) {
		FunctionDescriptor fd = new FunctionDescriptor(name, "", sClass, cat, //$NON-NLS-1$
				mandatoryProperties);
		List<FunctionDescriptor> l = idx.get(cat);
		if (l == null) {
			l = new LinkedList<FunctionDescriptor>();
			idx.put(cat, l);
		}
		l.add(fd);
	}

	public static Map<FunctionCategory, List<FunctionDescriptor>> list() {
		return idx;
	}
}
