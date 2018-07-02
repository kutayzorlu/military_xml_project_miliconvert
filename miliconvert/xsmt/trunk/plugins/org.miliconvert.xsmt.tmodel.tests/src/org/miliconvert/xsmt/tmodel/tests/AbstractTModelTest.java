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
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.ModelUtililies;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.SchemaFactory;
import org.miliconvert.xsmt.tmodel.TModel;

public abstract class AbstractTModelTest extends TestCase {

	protected TModel tm;

	/* ("path", XSDElementDecl()) */
	protected Map<String, XSDFeature> sourceNameFeatMap;
	protected Map<String, XSDFeature> destNameFeatMap;

	protected Schema sourceSchema;
	protected Schema targetSchema;

	@Override
	protected void setUp() throws Exception {
		super.setUp();

	}

	protected TModel initModel(String sourceXsdPath, String destXsdPath)
			throws Exception {
		tm = new TModel();
		ModelUtililies mu = new ModelUtililies();
		SchemaFactory sf = new SchemaFactory();
		Schema s = null;
		XSDFeature root = null;

		// Walk source
		File sourceFile = new File(sourceXsdPath);
		s = sf.create(sourceFile.getAbsolutePath());
		tm.add(s);
		sourceSchema = s;
		root = mu.getRoots(s).get(0);
		System.out.println("Root is "+root.getName());

		sourceNameFeatMap = new HashMap<String, XSDFeature>();
		walk(sourceNameFeatMap, s.getSchema(), 0, new HashSet<EObject>());

		
		// Walk dest
		File destFile = new File(destXsdPath);
		s = sf.create(destFile.getAbsolutePath());
		tm.add(s);
		targetSchema = s;
		root = mu.getRoots(s).get(0);
		System.out.println("Root is "+root.getName());
		destNameFeatMap = new HashMap<String, XSDFeature>();
		walk(destNameFeatMap, s.getSchema(), 0, new HashSet<EObject>());
		
		return tm;
	}

	protected Link createFeatFuncLink(String sKey, Function f) {
		assertNotNull("pathMap(" + sKey + ") is null", sourceNameFeatMap
				.get(sKey));
		Link l = new Link();
		l.setStart(sourceNameFeatMap.get(sKey));
		l.setEnd(f.getId(), 0);
		return l;
	}

	protected Link createFuncFeatLink(Function f, String eKey) {
		assertNotNull("pathLMap(" + eKey + ") is null", destNameFeatMap
				.get(eKey));
		Link l = new Link();
		l.setStart(f.getId());
		l.setEnd(destNameFeatMap.get(eKey));
		return l;

	}

	protected Link createFeatFeatLink(String sKey, String eKey) {
		assertNotNull("pathMap(" + sKey + ") is null", sourceNameFeatMap
				.get(sKey));
		assertNotNull("pathLMap(" + eKey + ") is null", destNameFeatMap
				.get(eKey));
		return createFeatFeatLink(sourceNameFeatMap.get(sKey), destNameFeatMap
				.get(eKey));
	}

	protected Link createFeatFeatLink(XSDFeature s, XSDFeature d) {
		Link l = new Link();
		l.setStart(s);
		l.setEnd(d);
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
	
	protected String prettyPrint(XSDFeature f) {
		return ((f instanceof XSDElementDeclaration ? "<" + f.getName() + ">"
				: "@"+f.getName()));
	}

	@Override
	protected void tearDown() throws Exception {
		tm = null;
		sourceNameFeatMap = null;
		destNameFeatMap = null;
		super.tearDown();
	}

}
