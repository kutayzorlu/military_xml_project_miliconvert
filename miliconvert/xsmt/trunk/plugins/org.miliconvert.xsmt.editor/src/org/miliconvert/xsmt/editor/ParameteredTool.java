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

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Shell;

public class ParameteredTool extends CreationTool {

	public static final String MANDATORY_PROPERTIES = "mandatoryProperties"; //$NON-NLS-1$

	private String[] mandatoryProperties;
	private Map<String, String> currentParamValues;
	private static Shell shell;

	private IInputValidator validator = new IInputValidator() {
		public String isValid(String newText) {
			return null;
		}
	};

	public ParameteredTool() {
		super();
	}

	public static void setShell(Shell s) {
		shell = s;
	}

	@Override
	protected CreationFactory getFactory() {
		return super.getFactory();
	}

	@Override
	protected void applyProperty(Object key, Object value) {
		if (key.equals(MANDATORY_PROPERTIES)) {
			this.mandatoryProperties = (String[]) value;
		} else {
			super.applyProperty(key, value);
		}
	}

	private boolean promptParams() {

		Map<String, String> params = new HashMap<String, String>();
		for (String property : mandatoryProperties) {
			InputDialog id = new InputDialog(shell,
					Messages.ParameteredTool_message_init_needed,
					MessageFormat.format(
							Messages.ParameteredTool_message_init_property,
							property), "", validator); //$NON-NLS-1$
			int ret = id.open();
			if (ret == InputDialog.CANCEL) {
				return false;
			}
			params.put(property, id.getValue());
		}
		this.currentParamValues = params;
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
	protected CreateRequest getCreateRequest() {
		CreateRequest req = super.getCreateRequest();
		req.setExtendedData(currentParamValues);
		return req;
	}

}
