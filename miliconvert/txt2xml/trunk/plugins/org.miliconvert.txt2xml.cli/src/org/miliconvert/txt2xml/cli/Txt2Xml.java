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

package org.miliconvert.txt2xml.cli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.Map;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.miliconvert.txt2xml.transform.Transformer;
import org.w3c.dom.Document;

public class Txt2Xml implements IApplication {

	private Log logger = LogFactory.getLog(getClass());
	
	@SuppressWarnings("unchecked")//$NON-NLS-1$
	public Object start(IApplicationContext context) throws Exception {
		Map arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args"); //$NON-NLS-1$

		if (args.length != 3) {
			logger.error(Messages.Txt2Xml_syntax);
			return EXIT_OK;
		}

		String format = args[0];
		File input = new File(args[1]);
		if (!input.exists()) {
			logger.error(MessageFormat.format(Messages.Txt2Xml_input_not_found, args[1]));
			return EXIT_OK;
		}
		
		File output = new File(args[2]);

		Transformer t = new Transformer();
		Document doc = t.transform(format, new FileInputStream(input));
		//doc.
		if(doc!=null){
			writeResult(doc, new FileOutputStream(output));
		}
		
		return EXIT_OK;
	}

	public void stop() {
		logger.info(Messages.Txt2Xml_stop);
	}

	private void writeResult(Document doc, OutputStream out) throws TransformerException {
		TransformerFactory fac = TransformerFactory.newInstance();
		javax.xml.transform.Transformer tf;
		tf = fac.newTransformer();
		tf.setOutputProperty(OutputKeys.INDENT, "yes"); //$NON-NLS-1$
		Source input = new DOMSource(doc.getDocumentElement());
		Result output = new StreamResult(out);
		tf.transform(input, output);
	}


}
