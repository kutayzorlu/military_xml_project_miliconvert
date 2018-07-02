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

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.w3c.dom.Document;

/**
 * Turns formatted texts into XML
 * 
 * @author Thomas Cataldo
 * 
 */
public class Transformer {

	private Map<String, ITransformerFactory> transformers;

	public Transformer() {
		transformers = new HashMap<String, ITransformerFactory>();
		loadTransformerPlugins();
	}

	private void loadTransformerPlugins() {
		IExtensionPoint point = Platform.getExtensionRegistry()
				.getExtensionPoint(Activator.PLUGIN_ID, "transformerfactory"); //$NON-NLS-1$
		IExtension[] extensions = point.getExtensions();

		for (IExtension ie : extensions) {
			for (IConfigurationElement element : ie.getConfigurationElements()) {
				if ("transformerFactory".equals(element.getName())) { //$NON-NLS-1$
					//System.out.println(Messages.Transformer_loading_extension);
					try {
						ITransformerFactory factory = (ITransformerFactory) element
								.createExecutableExtension("class"); //$NON-NLS-1$
						for (String format : factory.getSupportedTransformers()) {
							transformers.put(format, factory);
							/*System.out.println(MessageFormat.format(
									Messages.Transformer_format_x_registered,
									format));*/
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}

				}
			}
		}
	}

	/**
	 * Turns text into xml using the given transformation type
	 * 
	 * @param txType
	 * @param inputText
	 * @return
	 * @throws Txt2XmlException
	 */
	public Document transform(String txType, InputStream inputText)
			throws Txt2XmlException {
		if (!transformers.containsKey(txType)) {
			throw new Txt2XmlException(MessageFormat.format(
					Messages.Transformer_cannot_handle_x_format, txType));
		}

		ITransformerFactory itf = transformers.get(txType);
		ITransformerDescriptor itd = itf.getDescriptor(txType);
		ITransformer it = itd.createInstance();
		
		return it.transform(inputText);
	}

	/**
	 * Turns xml into text using the givent transformation type
	 * 
	 * @param txType
	 * @param inputXml
	 * @return
	 * @throws Txt2XmlException
	 */
	public InputStream transform(String txType, Document inputXml)
			throws Txt2XmlException {
		if (!transformers.containsKey(txType)) {
			throw new Txt2XmlException(MessageFormat.format(
					Messages.Transformer_cannot_handle_x_format, txType));
		}

		ITransformerFactory itf = transformers.get(txType);
		ITransformerDescriptor itd = itf.getDescriptor(txType);
		ITransformer it = itd.createInstance();

		return it.transform(inputXml);
	}
}
