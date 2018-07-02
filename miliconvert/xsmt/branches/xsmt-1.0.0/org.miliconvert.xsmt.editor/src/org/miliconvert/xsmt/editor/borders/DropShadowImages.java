/******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.miliconvert.xsmt.editor.borders;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.miliconvert.xsmt.editor.XSMTEditor;

public class DropShadowImages {

	public static final ImageDescriptor DESC_BOTTOM = create("icons/" //$NON-NLS-1$
			+ "bottom.gif"); //$NON-NLS-1$

	public static final ImageDescriptor DESC_LEFT_BOTTOM = create("icons/" //$NON-NLS-1$
			+ "leftbottom.gif"); //$NON-NLS-1$

	public static final ImageDescriptor DESC_RIGHT = create("icons/" //$NON-NLS-1$
			+ "right.gif"); //$NON-NLS-1$

	public static final ImageDescriptor DESC_RIGHT_BOTTOM = create("icons/" //$NON-NLS-1$
			+ "rightbottom.gif"); //$NON-NLS-1$

	public static final ImageDescriptor DESC_TOP_RIGHT = create("icons/" //$NON-NLS-1$
			+ "topright.gif"); //$NON-NLS-1$

	private static ImageDescriptor create(String imageName) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(XSMTEditor.PLUGIN_ID,
				imageName);
	}

}
