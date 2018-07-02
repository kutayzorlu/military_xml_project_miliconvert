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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.IFeatVisitor;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.LinkResolver;
import org.miliconvert.xsmt.tmodel.ModelUtililies;
import org.miliconvert.xsmt.tmodel.SchemaId;
import org.miliconvert.xsmt.tmodel.TModelException;

public abstract class IdentityLinkResolverTestCase extends AbstractTModelTest {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		initAndLink(getSchemaPath());
	}

	protected abstract String getSchemaPath();
	
	protected void initAndLink(String schemaPath) throws Exception {
		initModel(schemaPath, schemaPath);
		linkEverything();
	}

	private class FeatLister implements IFeatVisitor {
		private List<XSDFeature> featList;
		ModelUtililies mu = new ModelUtililies();

		public FeatLister(List<XSDFeature> featList) {
			this.featList = featList;
		}

		public void visit(XSDFeature f) {
			featList.add(f);
		}
	}

	protected void linkEverything() throws TModelException {
		ModelUtililies mu = new ModelUtililies();

		List<XSDFeature> source = new LinkedList<XSDFeature>();
		List<XSDFeature> dest = new LinkedList<XSDFeature>();

		mu.forEachFeature(sourceSchema, new FeatLister(source));
		mu.forEachFeature(targetSchema, new FeatLister(dest));

		System.out.println("Source feat list has " + source.size() + " elems");
		System.out.println("Dest feat list has " + dest.size() + " elems");
		assertEquals(source.size(), dest.size());

		Iterator<XSDFeature> its = source.iterator();
		Iterator<XSDFeature> itd = dest.iterator();
		int count = 0;
		while (its.hasNext()) {
			XSDFeature sf = its.next();
			XSDFeature df = itd.next();
			Link l = createFeatFeatLink(sf, df);
			tm.add(l);
			count++;
		}
		System.out.println("Links created: " + count);
	}

	public void testLinkResolution() throws TModelException {
		LinkResolver lr = new LinkResolver(tm);
		assertNotNull(lr);
		SchemaId sid = sourceSchema.getId();
		for (Link l : tm.getLinks()) {
			XSDFeature sf = l.getStartFeat();
			String s = lr.serialize(sid, sf);

			XSDFeature resolved = null;
			try {
				resolved = lr.resolveFeature(s);
			} catch (Throwable t) {
				System.err.println("Error resolving "+s+" (from "+sf.getName()+")");
				t.printStackTrace();
				fail("exception on resolve");
			}
			assertNotNull(resolved);
			assertEquals(sf.getName(), resolved.getName());
		}
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
