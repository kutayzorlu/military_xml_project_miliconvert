package org.miliconvert.xsmt.tmodel.tests;

import java.util.List;

import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.IFeatVisitor;
import org.miliconvert.xsmt.tmodel.ModelUtililies;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.TModelException;

public class RSSSchemaLoadingTest extends SchemaTestCase {

	public void testLoad() throws TModelException {
		Schema s = loadSchema("test-data/rss-2_0_1-rev10.xsd");
		assertNotNull(s);
		ModelUtililies mu = new ModelUtililies();

		mu.forEachFeature(s, new IFeatVisitor() {

			public void visit(XSDFeature f) {
				System.out.println("feat: " + f.getName() + " " + f.getQName()
						+ " container: "
						+ f.getContainer().getElement().getNodeName());
			}
		});

		List<XSDFeature> roots = mu.getRoots(s);
		System.out.println("==== ROOTS start ====");
		for (XSDFeature f : roots) {
			System.out.println("root: " + f.getName() + " " + f.getQName()
					+ " container: "
					+ f.getContainer().getElement().getNodeName());
		}
		System.out.println("==== ROOTS end ====");
		assertEquals(1, roots.size());

		XSDFeature root = roots.get(0);
		List<XSDFeature> children = mu.getChildren(root);
		System.out.println("==== Children start ====");
		for (XSDFeature f : children) {
			System.out.println("root: " + f.getName() + " " + f.getQName()
					+ " container: "
					+ f.getContainer().getElement().getNodeName());
		}
		System.out.println("==== Children end ====");
	}

}
