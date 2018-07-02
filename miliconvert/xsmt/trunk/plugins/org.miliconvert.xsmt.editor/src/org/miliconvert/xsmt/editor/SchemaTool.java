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

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.miliconvert.xsmt.editor.policies.SchemaRequest;

public class SchemaTool extends CreationTool {

	public static final String SCHEMA_PATH = "path"; //$NON-NLS-1$

	private Map<String, String> currentParamValues;
	private String[] extension = { "*.xsd" }; //$NON-NLS-1$
	private String schemaPath;
	private static Shell shell;

	public SchemaTool() {
		super();
	}

	public static void setShell(Shell s) {
		shell = s;
	}

	@Override
	protected CreationFactory getFactory() {
		return super.getFactory();
	}

	private boolean promptParams() {

		FileDialog fd = new FileDialog(shell);
		fd.setFilterExtensions(extension);
		String notCanceled = fd.open();
		if (notCanceled == null) {
			return false;
		}
		schemaPath = fd.getFilterPath() + File.separator + fd.getFileName();
		System.out.println("schemaPath: " + schemaPath); //$NON-NLS-1$
		currentParamValues = new HashMap<String, String>();
		currentParamValues.put(SCHEMA_PATH, schemaPath);
		return true;
	}

	@Override
	public void activate() {
		if (promptParams()) {
			super.activate();
		}
	}

	@Override
	public void deactivate() {
		currentParamValues = null;
		super.deactivate();
	}

	@Override
	protected Request createTargetRequest() {
		SchemaRequest req = new SchemaRequest();
		req.setFactory(getFactory());
		return req;
	}

	@Override
	protected CreateRequest getCreateRequest() {
		CreateRequest req = super.getCreateRequest();
		req.setExtendedData(currentParamValues);
		return req;
	}

}
