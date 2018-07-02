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
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.SchemaFactory;
import org.miliconvert.xsmt.tmodel.SchemaId;

public class SchemaTest extends TestCase {

	private Schema underTest;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		String path = "test-data/rss-2_0_1-rev10.xsd";
		SchemaFactory sf = new SchemaFactory();
		path = new File(path).getAbsolutePath();
		underTest = sf.create(path);
	}

	@Override
	protected void tearDown() throws Exception {
		underTest = null;
		super.tearDown();
	}

	public void testHashCode() {
		assertEquals(underTest.getId().get(), underTest.hashCode());
	}

	public void testGetId() {
		assertNotNull("schema.id is null", underTest.getId());
	}

	public void testSetId() {
		SchemaId id = underTest.getId();
		underTest.setId(new SchemaId());
		assertNotSame(underTest.getId(), id);
		underTest.setId(id);
	}

	public void testGetFsPath() {
		assertNotNull(underTest.getFsPath());
		assertTrue(new File(underTest.getFsPath()).exists());
	}

	public void testSetFsPath() {
		String fsp = underTest.getFsPath();
		underTest.setFsPath("toto");
		assertNotSame(underTest.getFsPath(), fsp);
		underTest.setFsPath(fsp);
		assertSame(underTest.getFsPath(), fsp);
	}
	
	private void print(XSDFeature f, int indent) {
		for (int i = 0; i < indent; i++) {
			System.out.print(" ");
		}
		System.out.println(" + "
				+ (f instanceof XSDElementDeclaration ? "<" + f.getName() + ">"
						: f.getName() + "="));
	}
	
	 
	private void walk(EObject parent, int indent, Set<EObject> walkedNodes) {
		if (walkedNodes.contains(parent)) {
			return;
		}
		walkedNodes.add(parent);
		for (EObject o : parent.eContents()) {
			if (o instanceof XSDFeature) {
				XSDFeature f = (XSDFeature) o;
				if (f.isFeatureReference()) {
					f = f.getResolvedFeature();
				}
				print(f, indent);
				walk(f.getType(), indent + 2, walkedNodes);
			} else {
				walk(o, indent, walkedNodes);
			}
		}
	}


	public void testGetSchema() {
		assertNotNull(underTest.getSchema());
		Set<EObject> walkedNodes = new HashSet<EObject>();
		walk(underTest.getSchema(), 0, walkedNodes);
	}

}
