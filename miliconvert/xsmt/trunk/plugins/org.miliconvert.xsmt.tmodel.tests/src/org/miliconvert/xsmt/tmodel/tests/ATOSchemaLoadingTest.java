package org.miliconvert.xsmt.tmodel.tests;

import java.util.List;

import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.ModelUtililies;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.TModelException;

public class ATOSchemaLoadingTest extends SchemaTestCase {

	public void testSets() throws TModelException {
		Schema s = loadSchema("test-data/ato/sets.xsd");
		assertNotNull(s);
	}

	public void testFields() throws TModelException {
		Schema s = loadSchema("test-data/ato/fields.xsd");
		assertNotNull(s);
	}

	public void testComposites() throws TModelException {
		Schema s = loadSchema("test-data/ato/composites.xsd");
		assertNotNull(s);
	}

	public void testMessages() throws TModelException {
		Schema s = loadSchema("test-data/ato/messages.xsd");
		assertNotNull(s);

		ModelUtililies mu = new ModelUtililies();

		List<XSDFeature> roots = mu.getRoots(s);
		System.out.println("==== ROOTS start messages ====");
		for (XSDFeature f : roots) {
			System.out.println("root: " + f.getName() + " " + f.getQName()
					+ " container: "
					+ f.getContainer().getElement().getNodeName());
		}
		System.out.println("==== ROOTS end ====");
		assertTrue(roots.size() == 1);

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
