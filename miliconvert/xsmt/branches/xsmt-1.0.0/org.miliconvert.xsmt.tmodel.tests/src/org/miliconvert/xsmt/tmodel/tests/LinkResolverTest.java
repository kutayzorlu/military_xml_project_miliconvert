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

import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.LinkResolver;
import org.miliconvert.xsmt.tmodel.TModelException;

public class LinkResolverTest extends AbstractTModelTest {

	public void testLinkResolverCTor() {
		new LinkResolver(tm);
	}

	public void testSerializeEnd() {
		String[] expectedEnds = { ":/linux", ":/linux/path",
				":/linux/path@value" };
		LinkResolver lr = new LinkResolver(tm);
		int i = 0;
		for (Link l : tm.getLinks()) {
			if (l.getEndFid() != null)
				continue;

			try {
				String s = lr.serializeEnd(l);
				System.out.println("end=\"" + s + "\"");
				assertTrue(s.endsWith(expectedEnds[i++]));
			} catch (TModelException e) {
				e.printStackTrace();
				fail("exception :/");
			}
		}
	}

	public void testSerializeStart() {
		String[] expectedStarts = { ":/win32", ":/win32/path",
				":/win32/path@value" };
		LinkResolver lr = new LinkResolver(tm);
		int i = 0;
		for (Link l : tm.getLinks()) {
			if (l.getStartFid() != null)
				continue;
			try {
				String s = lr.serializeStart(l);
				System.out.println("start=\"" + s + "\"");
				assertTrue(s.endsWith(expectedStarts[i++]));
			} catch (TModelException e) {
				e.printStackTrace();
				fail("exception :/");
			}
		}
	}

	public void testResolveFeature() {
		LinkResolver lr = new LinkResolver(tm);
		for (Link l : tm.getLinks()) {
			if (l.getStartFid() != null)
				continue;
			try {
				String s = lr.serializeStart(l);
				XSDFeature f = lr.resolveFeature(s);
				assertNotNull(f);
			} catch (TModelException e) {
				e.printStackTrace();
				fail("exception :/");
			}
		}
		try {
			lr.resolveFeature("fid:func-99999");
			fail("resolve feature should have failed");
		} catch (TModelException te) {
		}
	}

	public void testResolveFunction() {
		LinkResolver lr = new LinkResolver(tm);
		for (Link l : tm.getLinks()) {
			if (l.getStartFid() != null) {
				try {
					String s = lr.serializeStart(l);
					Function f = lr.resolveFunctionId(s);
					assertNotNull(f);
				} catch (TModelException e) {
					e.printStackTrace();
					fail("exception :/");
				}
			}
			if (l.getEndFid() != null) {
				try {
					String s = lr.serializeEnd(l);
					Function f = lr.resolveFunctionId(s);
					assertNotNull(f);
				} catch (TModelException e) {
					e.printStackTrace();
					fail("exception :/");
				}
			}
		}
	}

}
