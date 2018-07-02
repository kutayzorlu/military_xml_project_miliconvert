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
import java.io.FileOutputStream;

import javax.xml.transform.stream.StreamResult;

import org.eclipse.gef.GraphicalViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.miliconvert.xsmt.engine.Engine;
import org.miliconvert.xsmt.engine.IEngineListener;

public class RunEngineAction extends Action implements IEngineListener {

	public static final String ID = "org.miliconvert.xsmt.editor.RunEngineEditor"; //$NON-NLS-1$

	private Engine engine;
	private GraphicalViewer viewer;

	public RunEngineAction(Engine engine) {
		this.engine = engine;
		setId(ID);
		setEnabled(engine.isExecutable());
		engine.registerListener(this);
	}
	
	public void setEngine(Engine e) {
		engine.unregisterListener(this);
		this.engine = e;
		setEnabled(e.isExecutable());
		engine.registerListener(this);
	}

	@Override
	public void run() {
		System.out.println("Run !!"); //$NON-NLS-1$

		String xmlName = saveFileDialog();
		System.out.println("xmlName: "+xmlName);
		try {
			engine.run(new StreamResult(new FileOutputStream(xmlName)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void executableStateChange(boolean newState) {
		setEnabled(newState);
	}

	private String saveFileDialog() {
		FileDialog fd = new FileDialog(viewer.getControl().getShell(), SWT.SAVE);
		fd.setFileName("resultatDeTransformation.xml"); //$NON-NLS-1$
		fd.setText(Messages.RunEngineAction_message_save);

		boolean done = false;
		String fileName = null;

		while (!done) {

			fileName = fd.open();
			if (fileName == null) {
				done = true;
			} else {
				// User has selected a file; see if it already exists
				File file = new File(fileName);
				if (file.exists()) {
					// The file already exists; asks for confirmation
					MessageBox mb = new MessageBox(fd.getParent(),
							SWT.ICON_WARNING | SWT.YES | SWT.NO);

					mb
							.setMessage(fileName
									+ Messages.RunEngineAction_message_already_exist);

					// If they click Yes, we're done and we drop out. If
					// they click No, we redisplay the File Dialog
					done = mb.open() == SWT.YES;
				} else {
					done = true;
				}
			}
		}
		return fileName;
	}

	public void setViewer(GraphicalViewer viewer) {
		this.viewer = viewer;
	}

}
