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

package org.miliconvert.xsmt.editor.wizards;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.ide.IDE;
import org.miliconvert.xsmt.editor.XSMTEditor;
import org.miliconvert.xsmt.io.XSMTException;
import org.miliconvert.xsmt.io.XSMTPackage;
import org.miliconvert.xsmt.io.XSMTPackageFactory;
import org.miliconvert.xsmt.perspective.XSMTPerspectivePlugin;

public class XSMTWizard extends Wizard implements INewWizard {
	private XSMTWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for XSMTWizard.
	 */
	public XSMTWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new XSMTWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog
					.openError(getShell(), Messages.XSMTWizard_label_title,
							realException.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 */

	private void doFinish(String containerName, String fileName,
			IProgressMonitor monitor) throws CoreException {
		// create a sample file
		monitor.beginTask(Messages.XSMTWizard_label_creating + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			createCoreException(MessageFormat.format(
					Messages.XSMTWizard_error_container, containerName), null);
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
			createCoreException(Messages.XSMTWizard_error_pouic
					+ e.getMessage(), e);
		}
		monitor.worked(1);
		monitor.setTaskName(Messages.XSMTWizard_message_opening);
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {

				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				// ouverture de la perspective
				try {
					PlatformUI.getWorkbench().showPerspective(
							XSMTPerspectivePlugin.PLUGIN_ID,
							PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow());
				} catch (WorkbenchException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}

			}
		});
		monitor.worked(1);
	}

	/**
	 * We will initialize file contents with a sample text.
	 * 
	 * @throws CoreException
	 */

	private InputStream openContentStream() throws CoreException {
		XSMTPackageFactory xsmtPackageFactory = new XSMTPackageFactory();

		try {
			return xsmtPackageFactory.read(new XSMTPackage());
		} catch (XSMTException e) {
			throw createCoreException(Messages.XSMTWizard_error_xsmtpfactory, e);
		}
	}

	private CoreException createCoreException(String message, Throwable cause) {
		String m = message;
		if (cause != null) {
			StackTraceElement[] e = cause.getStackTrace();
			for (StackTraceElement ste : e) {
				m += ste.toString() + "\n"; //$NON-NLS-1$
			}
		}
		IStatus status = new Status(IStatus.ERROR, XSMTEditor.PLUGIN_ID,
				IStatus.OK, message, cause);

		return new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

}
