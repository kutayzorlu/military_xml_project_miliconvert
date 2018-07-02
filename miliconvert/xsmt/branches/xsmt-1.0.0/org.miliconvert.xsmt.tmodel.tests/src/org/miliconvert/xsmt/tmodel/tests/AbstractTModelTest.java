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

package org.miliconvert.xsmt.tmodel.tests;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.FunctionFactory;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.SchemaFactory;
import org.miliconvert.xsmt.tmodel.TModel;

public abstract class AbstractTModelTest extends TestCase {

	protected TModel tm;

	/* ("path", XSDElementDecl()) */
	protected Map<String, XSDFeature> pathMap;
	protected Map<String, XSDFeature> pathLMap;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		tm = new TModel();
		SchemaFactory sf = new SchemaFactory();
		Schema s = null;

		File pathXsd = new File("../org.miliconvert.xsmt.tmodel.tests/test-data/path.xsd");
		s = sf.create(pathXsd.getAbsolutePath());
		tm.add(s);
		pathMap = new HashMap<String, XSDFeature>();
		walk(pathMap, s.getSchema(), 0, new HashSet<EObject>());

		File pathlXsd = new File("../org.miliconvert.xsmt.tmodel.tests/test-data/pathl.xsd");
		s = sf.create(pathlXsd.getAbsolutePath());
		tm.add(s);
		pathLMap = new HashMap<String, XSDFeature>();
		walk(pathLMap, s.getSchema(), 0, new HashSet<EObject>());

		Link l = null;
		l = createFeatFeatLink("win32", "linux");
		tm.add(l);
		l = createFeatFeatLink("path", "path");
		tm.add(l);

		FunctionFactory ff = new FunctionFactory();
		Function f = ff.create("org.miliconvert.xsmt.functions.core.Identity");

		tm.add(f);

		l = createFeatFuncLink("value", f);
		tm.add(l);

		l = createFuncFeatLink(f, "value");
		tm.add(l);

	}

	private Link createFeatFuncLink(String sKey, Function f) {
		assertNotNull("pathMap(" + sKey + ") is null", pathMap.get(sKey));
		Link l = new Link();
		l.setStart(pathMap.get(sKey));
		l.setEnd(f.getId(), 0);
		return l;
	}

	private Link createFuncFeatLink(Function f, String eKey) {
		assertNotNull("pathLMap(" + eKey + ") is null", pathLMap.get(eKey));
		Link l = new Link();
		l.setStart(f.getId());
		l.setEnd(pathLMap.get(eKey));
		return l;

	}

	private Link createFeatFeatLink(String sKey, String eKey) {
		assertNotNull("pathMap(" + sKey + ") is null", pathMap.get(sKey));
		assertNotNull("pathLMap(" + eKey + ") is null", pathLMap.get(eKey));
		Link l = new Link();
		l.setStart(pathMap.get(sKey));
		l.setEnd(pathLMap.get(eKey));
		return l;
	}

	private void print(XSDFeature f, int indent) {
		for (int i = 0; i < indent; i++) {
			System.out.print(" ");
		}
		System.out.println(" + "
				+ (f instanceof XSDElementDeclaration ? "<" + f.getName() + ">"
						: f.getName() + "="));
	}

	private void walk(Map<String, XSDFeature> map, EObject parent, int indent,
			Set<EObject> walkedNodes) {
		if (walkedNodes.contains(parent)) {
			return;
		}
		walkedNodes.add(parent);
		for (EObject o : parent.eContents()) {
			if (o instanceof XSDFeature) {
				XSDFeature f = (XSDFeature) o;
				map.put(f.getName(), f);
				print(f, indent);
				walk(map, f.getType(), indent + 2, walkedNodes);
			} else {
				walk(map, o, indent, walkedNodes);
			}
		}
	}

	@Override
	protected void tearDown() throws Exception {
		tm = null;
		pathMap = null;
		pathLMap = null;
		super.tearDown();
	}

}
