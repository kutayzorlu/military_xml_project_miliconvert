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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.gef.GraphicalViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.miliconvert.xsmt.editor.model.SchemaElement;
import org.miliconvert.xsmt.editor.parts.SchemaElementEditPart;
import org.miliconvert.xsmt.engine.Engine;
import org.miliconvert.xsmt.engine.EngineException;
import org.miliconvert.xsmt.engine.IReadable;

public class SetXsiAction extends Action implements ISelectionChangedListener {

	public static final String ID = "org.miliconvert.xsmt.editor.SetXsiAction"; //$NON-NLS-1$

	// TODO : we leak a listener on the viewer
	private GraphicalViewer viewer;

	private static final String[] extension = { "*.xml" }; //$NON-NLS-1$

	private SchemaElementEditPart seep;

	private Engine engine;

	public SetXsiAction(Engine engine) {
		setId(ID);
		setEnabled(false);
		this.engine = engine;
	}

	public void setViewer(GraphicalViewer viewer) {
		this.viewer = viewer;
		viewer.addSelectionChangedListener(this);
	}

	public void dispose() {
		// TODO call me on contributor dispose
		viewer.removeSelectionChangedListener(this);
	}

	public void run() {
		System.out.println("setXsiAction on " + seep + "!!"); //$NON-NLS-1$ //$NON-NLS-2$
		final String xmlPath = openFileDialog();
		if (xmlPath == null) {
			return;
		}
		System.out.println("xmlPath:" + xmlPath); //$NON-NLS-1$
		SchemaElement se = (SchemaElement) seep.getModel();

		try {
			engine.setXmlInstance(se.getSchema().getId(), new IReadable() {

				public InputStream read() throws EngineException {
					try {
						return new FileInputStream(xmlPath);
					} catch (FileNotFoundException e) {
						throw new EngineException(e.getMessage(), e);
					}
				}

			});
			se.setWithXsi(true);
			System.out.println("xsi linked to schema."); //$NON-NLS-1$
		} catch (EngineException e) {
			se.setWithXsi(false);
			errorOut(e);
		}

	}

	private void errorOut(EngineException e) {
		MessageBox mb = new MessageBox(viewer.getControl().getShell(),
				SWT.ICON_WARNING | SWT.OK);
		mb.setMessage(e.getMessage());
		mb.open();
	}

	private String openFileDialog() {
		FileDialog fd = new FileDialog(viewer.getControl().getShell());
		fd.setFilterExtensions(extension);
		fd
				.setText(Messages.SetXsiAction_message_link_xml);
		final String xmlPath = fd.open();
		return xmlPath;
	}

	public void selectionChanged(SelectionChangedEvent event) {
		StructuredSelection selection = (StructuredSelection) event
				.getSelection();
		if (selection.size() != 1) {
			setEnabled(false);
			return;
		}
		Object o = selection.getFirstElement();
		if (o instanceof SchemaElementEditPart) {
			setEnabled(true);
			this.seep = (SchemaElementEditPart) o;
		} else {
			setEnabled(false);
		}
	}

}
