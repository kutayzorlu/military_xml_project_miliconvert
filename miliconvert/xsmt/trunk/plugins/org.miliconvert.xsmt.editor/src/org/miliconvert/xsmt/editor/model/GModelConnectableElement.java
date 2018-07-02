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

package org.miliconvert.xsmt.editor.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GModelConnectableElement extends GModelElement {

	public static final String INPUT_CONNECT = "GModelConnectableElement.connectInput"; //$NON-NLS-1$
	public static final String INPUT_DISCONNECT = "GModelConnectableElement.disconnectInput"; //$NON-NLS-1$
	public static final String OUTPUT_CONNECT = "GModelConnectableElement.connectOutput"; //$NON-NLS-1$
	public static final String OUTPUT_DISCONNECT = "GModelConnectableElement.disconnectOutput"; //$NON-NLS-1$

	protected Map<String, LinkElement> inputs;
	protected Map<String, LinkElement> outputs;

	protected GModelConnectableElement() {
		super();
		inputs = new HashMap<String, LinkElement>();
		outputs = new HashMap<String, LinkElement>();
	}

	public List<LinkElement> getSourceConnections() {
		LinkedList<LinkElement> ret = new LinkedList<LinkElement>();
		for (LinkElement le : outputs.values()) {
			if (le != null) {
				ret.add(le);
			}
		}
		return ret;
	}

	public List<LinkElement> getTargetConnections() {
		LinkedList<LinkElement> ret = new LinkedList<LinkElement>();
		for (LinkElement le : inputs.values()) {
			if (le != null) {
				ret.add(le);
			}
		}
		return ret;
	}

	public void connectOutput(String output, LinkElement le) {
		outputs.put(output, le);
		firePropertyChange(OUTPUT_CONNECT, null, le);
	}

	public void connectInput(String input, LinkElement le) {
		inputs.put(input, le);
		firePropertyChange(INPUT_CONNECT, null, le);
	}

	public void disconnectOutput(String output) {
		LinkElement le = outputs.get(output);
		outputs.put(output, null);
		firePropertyChange(OUTPUT_DISCONNECT, null, le);
	}

	public void disconnectInput(String input) {
		LinkElement le = inputs.get(input);
		inputs.put(input, null);
		firePropertyChange(INPUT_DISCONNECT, null, le);
	}

	public boolean isConnectable(String anchor) {
		boolean ret = false;
		if (inputs.containsKey(anchor)) {
			ret = inputs.get(anchor) == null;
		} else if (outputs.containsKey(anchor)) {
			ret = outputs.get(anchor) == null;
		} else {
			System.out.println("Anchor '" + anchor + "'comes from nowhere...");
			System.out.println("Inputs are : ");
			for (String key : inputs.keySet()) {
				System.out.println("   --> "+key);
			}
			System.out.println("Outputs are : ");
			for (String key : outputs.keySet()) {
				System.out.println("   --> "+key);
			}
		}
		System.out.println("isConnectable(" + anchor + "): " + ret); //$NON-NLS-1$ //$NON-NLS-2$
		return ret;
	}

}
