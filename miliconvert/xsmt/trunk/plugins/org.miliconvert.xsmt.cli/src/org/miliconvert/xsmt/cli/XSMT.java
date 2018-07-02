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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Map;

import javax.xml.transform.stream.StreamResult;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.miliconvert.xsmt.engine.Engine;
import org.miliconvert.xsmt.engine.EngineException;
import org.miliconvert.xsmt.engine.IReadable;
import org.miliconvert.xsmt.io.XSMTPackage;
import org.miliconvert.xsmt.io.XSMTPackageFactory;
import org.miliconvert.xsmt.tmodel.SchemaId;
import org.miliconvert.xsmt.tmodel.TModel;

public class XSMT implements IApplication {

	public IReadable getReadable(final String path) {
		return new IReadable() {

			public InputStream read() throws EngineException {
				try {
					return new FileInputStream(path);
				} catch (FileNotFoundException e) {
					throw new EngineException(e.getMessage(), e);
				}
			}

		};
	}

	@SuppressWarnings("unchecked")//$NON-NLS-1$
	public Object start(IApplicationContext context) throws Exception {
		Map arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args"); //$NON-NLS-1$

		XSMTPackage pack = null;
		try {
			if (args.length < 3) {
				System.err.println(Messages.XSMT_message_syntax);
				return EXIT_OK;
			}
			File output = new File(args[1]);
			if (!output.exists()) {
				System.out.print(MessageFormat.format(
						Messages.XSMT_message_creating, args[1]));
				if (output.mkdirs()) {
					System.out.println(Messages.XSMT_message_ok);
				} else {
					System.out.println(Messages.XSMT_message_nok);
					return EXIT_OK;
				}
			}
	
			for (String arg : args) {
				File f = new File(arg);
				if (!f.exists()) {
					System.err.println(MessageFormat.format(
							Messages.XSMT_error_not_found, arg));
					return EXIT_OK;
				}
			}
	
			File xsmt = new File(args[0]);
			pack = new XSMTPackageFactory().load(new FileInputStream(xsmt));
			TModel tm = pack.getTmodel();
	
			Engine e = new Engine(tm);
			if (!e.isValidModel()) {
				System.err.println(MessageFormat.format(
						Messages.XSMT_error_not_usable, args[0]));
				return EXIT_OK;
			}
	
	
			SchemaId source = tm.getSourceSchemas().get(0).getId();
			for (int i = 2; i < args.length; i++) {
				File in = new File(args[i]);
				e.setXmlInstance(source, getReadable(args[i]));
				if (e.isExecutable()) {
					String outName = output.getAbsolutePath() + File.separator
					+ in.getName();
					FileOutputStream out = new FileOutputStream(outName);
					System.out.println(MessageFormat
							.format(Messages.XSMT_message_generating, outName));
					e.run(new StreamResult(out));
				} else {
					System.err.println(MessageFormat.format(
							Messages.XSMT_error_not_valid, args[i]));
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		

		return EXIT_OK;
	}

	public void stop() {
		System.out.println(Messages.XSMT_message_stop);
	}

}
