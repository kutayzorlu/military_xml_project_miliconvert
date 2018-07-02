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

package org.miliconvert.xsmt.engine;

import javax.xml.transform.TransformerFactory;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.miliconvert.xsmt.engine"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	private IStatus status(final String message) {
		return new IStatus() {

			public IStatus[] getChildren() {
				return new IStatus[0];
			}

			public int getCode() {
				// TODO Auto-generated method stub
				return 0;
			}

			public Throwable getException() {
				return null;
			}

			public String getMessage() {
				return message;
			}

			public String getPlugin() {
				return PLUGIN_ID;
			}

			public int getSeverity() {
				// TODO Auto-generated method stub
				return IStatus.INFO;
			}

			public boolean isMultiStatus() {
				return false;
			}

			public boolean isOK() {
				return true;
			}

			public boolean matches(int severityMask) {
				return true;
			}
		};
	}

	public void logInfo(String info) {
		getLog().log(status(info));
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		DOMUtils.setTransformerFactory(getTransformerFactory());
		logInfo("engine started.");
	}

	public TransformerFactory getTransformerFactory() {
		return TransformerFactory.newInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
