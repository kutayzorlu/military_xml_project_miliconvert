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
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.miliconvert.txt2xml.transform.Transformer;
import org.w3c.dom.Document;

public class Xml2Txt implements IApplication {

	@SuppressWarnings("unchecked")//$NON-NLS-1$
	public Object start(IApplicationContext context) throws Exception {
		Map arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args"); //$NON-NLS-1$

		if (args.length != 3) {
			System.err.println(Messages.Xml2Txt_syntax);
			return EXIT_OK;
		}

		String format = args[0];
		File input = new File(args[1]);
		if (!input.exists()) {
			System.err.println(MessageFormat.format(
					Messages.Txt2Xml_input_not_found, args[1]));
			return EXIT_OK;
		}

		File output = new File(args[2]);

		Transformer t = new Transformer();
		DocumentBuilder parser = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder();
		Document doc = parser.parse(input);
		InputStream toWrite = t.transform(format, doc);

		writeResult(toWrite, new FileOutputStream(output));

		return EXIT_OK;
	}

	public void stop() {
		System.out.println(Messages.Txt2Xml_stop);
	}

	private void writeResult(InputStream in, OutputStream out) {
		
	}

}
