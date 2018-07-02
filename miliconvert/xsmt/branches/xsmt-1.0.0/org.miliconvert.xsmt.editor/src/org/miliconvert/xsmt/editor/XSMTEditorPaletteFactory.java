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

import java.util.List;
import java.util.Map;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.miliconvert.xsmt.tmodel.IFunctionImpl;
import org.miliconvert.xsmt.tmodel.functions.FunctionCategory;
import org.miliconvert.xsmt.tmodel.functions.FunctionDescriptor;
import org.miliconvert.xsmt.tmodel.functions.Library;

/**
 * Utility class that can create a GEF Palette.
 * 
 * @see #createPalette()
 * @author François GILBERT
 */

public class XSMTEditorPaletteFactory {

	/**
	 * Create drawers for categories
	 * 
	 * @param pr
	 */
	private static void createFunctionsDrawer(PaletteRoot pr) {

		Map<FunctionCategory, List<FunctionDescriptor>> functions = Library
				.list();

		for (FunctionCategory fc : functions.keySet()) {
			System.out.println("category: " + fc); //$NON-NLS-1$
			PaletteDrawer componentsDrawer = new PaletteDrawer(fc.getName());

			List<FunctionDescriptor> fs = functions.get(fc);
			for (FunctionDescriptor f : fs) {
				try {
					if (f.getMandatoryProperties().length > 0) {
						componentsDrawer.add(addFuncWithParam(f));
					} else {
						componentsDrawer.add(addFunc(f));
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}

			pr.add(componentsDrawer);
		}
	}

	/**
	 * Creates the PaletteRoot and adds all palette elements. Use this factory
	 * method to create a new palette for your graphical editor.
	 * 
	 * @return a new PaletteRoot
	 */
	public static PaletteRoot createPalette() {
		PaletteRoot palette = new PaletteRoot();
		palette.add(createToolsGroup(palette));
		createFunctionsDrawer(palette);
		return palette;
	}

	/** Create the "Tools" group. */
	private static PaletteContainer createToolsGroup(PaletteRoot palette) {
		PaletteGroup toolGroup = new PaletteGroup(
				Messages.XSMTEditorPaletteFactory_label_tools);

		// Add a selection tool to the group
		ToolEntry selectTool = new PanningSelectionToolEntry();
		toolGroup.add(selectTool);

		ToolEntry linkTool = new ConnectionCreationToolEntry(
				Messages.XSMTEditorPaletteFactory_label_create_link,
				Messages.XSMTEditorPaletteFactory_label_create_links,
				null,
				ImageDescriptor.createFromFile(Activator.class,
						"icons/connection_s16.gif"), ImageDescriptor.createFromFile(Activator.class, //$NON-NLS-1$
								"icons/connection_s24.gif")); //$NON-NLS-1$
		toolGroup.add(linkTool);

		ToolEntry schemaTool = new SchemaToolEntry(
				Messages.XSMTEditorPaletteFactory_label_schema,
				"", new SchemaCreationFactory(), null, null, null); //$NON-NLS-1$
		toolGroup.add(schemaTool);

		palette.setDefaultEntry(selectTool);

		return toolGroup;
	}

	private static PaletteEntry addFuncWithParam(FunctionDescriptor f)
			throws ClassNotFoundException {
		PaletteEntry component = new ParameteredToolEntry(f.getName(), f
				.getComment(), new FunctionCreationFactory(f.getImplClass()),
				ImageDescriptor.createFromFile(Activator.class,
						"icons/function_16x16.gif"), ImageDescriptor //$NON-NLS-1$
						.createFromFile(Activator.class,
								"icons/function_24x24.gif"), f //$NON-NLS-1$
						.getMandatoryProperties());
		return component;

	}

	private static CombinedTemplateCreationEntry addFunc(FunctionDescriptor f)
			throws ClassNotFoundException {
		CombinedTemplateCreationEntry component = new CombinedTemplateCreationEntry(
				f.getName(), f.getComment(), IFunctionImpl.class,
				new FunctionCreationFactory(f.getImplClass()), ImageDescriptor
						.createFromFile(Activator.class,
								"icons/function_16x16.gif"), ImageDescriptor //$NON-NLS-1$
						.createFromFile(Activator.class,
								"icons/function_16x16.gif")); //$NON-NLS-1$
		return component;
	}

	/** Utility class. */
	private XSMTEditorPaletteFactory() {
	}

}
