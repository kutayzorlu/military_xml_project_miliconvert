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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.miliconvert.xsmt.tmodel.TModelActivator;

public class FunctionExtensionParser {

	private static final String FUNCTION_NAME = "name"; //$NON-NLS-1$
	private static final String FUNCTION_COMMENT = "comment"; //$NON-NLS-1$
	private static final String FUNCTION_CLASS_NAME = "class"; //$NON-NLS-1$
	private static final String FUNCTION_CATEGORY = "category"; //$NON-NLS-1$
	private static final String FUNCTION_MANDATORY = "mandatoryProperties"; //$NON-NLS-1$

	private List<FunctionExtension> functionExtensionParsed;

	public FunctionExtensionParser() {
		functionExtensionParsed = new ArrayList<FunctionExtension>();
		IExtension[] extensions = Platform.getExtensionRegistry()
				.getExtensionPoint(TModelActivator.PLUGIN_ID, "userfunctions") //$NON-NLS-1$
				.getExtensions();
		// pour chaque extensions
		for (IExtension extension : extensions) {
			// parser les elements
			for (IConfigurationElement element : extension
					.getConfigurationElements()) {
				System.out.println("Adding plug-in provided function..."); //$NON-NLS-1$
				functionExtensionParsed.add(parse(element));
			}
		}
	}

	private FunctionExtension parse(IConfigurationElement configurationElement) {
		System.out
				.println("configElement.name: " + configurationElement.getName()); //$NON-NLS-1$
		FunctionExtension functionExtension = new FunctionExtension();
		if (configurationElement.getName().equals("userFunction")) { //$NON-NLS-1$
			functionExtension.setFunctionName(configurationElement
					.getAttribute(FUNCTION_NAME));
			functionExtension.setFunctionComment(configurationElement
					.getAttribute(FUNCTION_COMMENT));
			functionExtension.setFunctionClass(configurationElement
					.getAttribute(FUNCTION_CLASS_NAME));
			functionExtension.setFunctionCategory(FunctionCategory
					.create(configurationElement
							.getAttribute(FUNCTION_CATEGORY)));
			functionExtension.setMandatoryProperties(configurationElement
					.getAttribute(FUNCTION_MANDATORY));
		}
		return functionExtension;
	}

	public List<FunctionExtension> getFunctionExtensionParsed() {
		return functionExtensionParsed;
	}

}
