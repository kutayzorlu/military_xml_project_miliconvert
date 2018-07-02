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

import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.draw2d.geometry.Point;
import org.miliconvert.xsmt.engine.Engine;
import org.miliconvert.xsmt.engine.EngineException;
import org.miliconvert.xsmt.gmodel.Box;
import org.miliconvert.xsmt.gmodel.GModel;
import org.miliconvert.xsmt.io.XSMTException;
import org.miliconvert.xsmt.io.XSMTPackage;
import org.miliconvert.xsmt.io.XSMTPackageFactory;
import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.FunctionId;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.LinkResolver;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.SchemaId;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelException;

public class XSMTDiagram extends GModelNode {

	public static final String ADD_FUNCTION_ELEMENT = "XSMTDiagram.addFunctionElement"; //$NON-NLS-1$
	public static final String REMOVE_FUNCTION_ELEMENT = "XSMTDiagram.removeFunctionElement"; //$NON-NLS-1$
	public static final String ADD_LINK_ELEMENT = "XSMTDiagram.addLinkElement"; //$NON-NLS-1$
	public static final String REMOVE_LINK_ELEMENT = "XSMTDiagram.removeLinkElement"; //$NON-NLS-1$
	public static final String ADD_SCHEMA_ELEMENT = "XSMTDiagram.addSchemaElement"; //$NON-NLS-1$
	public static final String REMOVE_SCHEMA_ELEMENT = "XSMTDiagram.removeSchemaElement"; //$NON-NLS-1$

	private XSMTPackage xsmt;

	private List<FunctionElement> functionElements;
	private List<GModelElement> children;
	private List<SchemaElement> schemaElements;
	private Set<LinkElement> links;
	private Engine engine;

	public XSMTDiagram(InputStream in) throws XSMTException {
		super();
		children = new LinkedList<GModelElement>();
		functionElements = new LinkedList<FunctionElement>();
		schemaElements = new LinkedList<SchemaElement>();
		links = new HashSet<LinkElement>();
		xsmt = new XSMTPackageFactory().load(in);

		try {
			engine = new Engine(xsmt.getTmodel());
		} catch (EngineException e) {
			e.printStackTrace();
		}

		load();
		
		System.err.println("xsmtd ctor finished.");
	}

	public void load() {
		TModel tm = xsmt.getTmodel();
		GModel gm = xsmt.getGraphic();


		System.out.println("loading Tmodel ..."); //$NON-NLS-1$
		HashMap<FunctionId, FunctionElement> feIdx = new HashMap<FunctionId, FunctionElement>();
		// restore function positions
		for (Function f : tm.getFunctions()) {
			FunctionElement fe = new FunctionElement(f);
			functionElements.add(fe);
			children.add(fe);
			Box b = gm.getBox(fe.getFunction().getId().toString());
			fe.setLocation(new Point(b.getX(), b.getY()));
			fe.setBox(b);
			feIdx.put(f.getId(), fe);
			firePropertyChange(ADD_FUNCTION_ELEMENT, null, fe);
		}

		HashMap<SchemaId, SchemaElement> seIdx = new HashMap<SchemaId, SchemaElement>();

		// restore schema positions
		for (Schema s : tm.getSchemas()) {
			SchemaElement se = new SchemaElement(s);
			schemaElements.add(se);
			children.add(se);
			Box b = gm.getBox(se.getSchema().getId().toString());
			se.setLocation(new Point(b.getX(), b.getY()));
			se.setBox(b);
			seIdx.put(s.getId(), se);
			System.err.println("fireAddSchemaElement");
			firePropertyChange(ADD_SCHEMA_ELEMENT, null, se);
		}

		// restore links
		LinkResolver lr = new LinkResolver(tm);
		for (Link l : tm.getLinks()) {
			boolean restore = true;

			LinkElement le = new LinkElement(l);
			links.add(le);
			if (l.getStartFid() != null) {
				le.setStart(feIdx.get(l.getStartFid()));
				le.setStartName(l.getStartFid().toString());
			}
			if (l.getEndFid() != null) {
				le.setEnd(feIdx.get(l.getEndFid()));
				le.setEndName(l.getEndFid().toString() + "," //$NON-NLS-1$
						+ l.getEndParamIdx());
			}

			if (l.getStartFeat() != null) {
				try {
					SchemaElement se = seIdx.get(tm.getId(l.getStartFeat()
							.getSchema()));
					se.setVisible(l.getStartFeat());
					le.setStart(se);
					le.setStartName("out-" + lr.serialize(l.getStartFeat()));
				} catch (TModelException e) {
					e.printStackTrace();
					restore = false;
				}
			}
			if (l.getEndFeat() != null) {
				try {
					SchemaElement se = seIdx.get(tm.getId(l.getEndFeat()
							.getSchema()));
					se.setVisible(l.getEndFeat());
					le.setEnd(se);
					le.setEndName("in-" + lr.serialize(l.getEndFeat()));
				} catch (TModelException e) {
					e.printStackTrace();
					restore = false;
				}
			}

			if (restore) {
				le.attachStart();
				le.attachEnd();
			}

		}
	}

	public InputStream save() throws XSMTException {
		return new XSMTPackageFactory().read(xsmt);
	}

	public void add(FunctionElement fe) {
		functionElements.add(fe);
		children.add(fe);
		xsmt.getTmodel().add(fe.getFunction());
		fe
				.setBox(xsmt.getGraphic().getBox(
						fe.getFunction().getId().toString()));
		firePropertyChange(ADD_FUNCTION_ELEMENT, null, fe);
	}

	public void remove(FunctionElement fe) {
		functionElements.remove(fe);
		children.remove(fe);
		xsmt.getTmodel().remove(fe.getFunction());
		firePropertyChange(REMOVE_FUNCTION_ELEMENT, null, fe);
	}

	public void add(SchemaElement se) {
		schemaElements.add(se);
		children.add(se);
		xsmt.getTmodel().add(se.getSchema());
		se.setBox(xsmt.getGraphic().getBox(se.getSchema().getId().toString()));
		firePropertyChange(ADD_SCHEMA_ELEMENT, null, se);
	}

	public void remove(SchemaElement se) {
		schemaElements.remove(se);
		children.remove(se);
		xsmt.getTmodel().remove(se.getSchema());
		firePropertyChange(REMOVE_SCHEMA_ELEMENT, null, se);
	}

	public void add(LinkElement le) {
		if (!links.contains(le)) {
			try {
				xsmt.getTmodel().add(le.getLink());
				links.add(le);
				System.out.println("link added to model"); //$NON-NLS-1$
			} catch (TModelException e) {
			}
		}
	}

	public void remove(LinkElement le) {
		if (links.contains(le)) {
			xsmt.getTmodel().remove(le.getLink());
			links.remove(le);
		}
	}

	public List<GModelElement> getChildren() {
		return children;
	}

	public Engine getEngine() {
		return engine;
	}

	public TModel getTModel() {
		return xsmt.getTmodel();
	}

}
