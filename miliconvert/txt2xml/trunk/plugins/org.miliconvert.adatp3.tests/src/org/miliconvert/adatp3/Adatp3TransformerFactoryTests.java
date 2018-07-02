package org.miliconvert.adatp3;

import java.util.Collection;

import org.miliconvert.adatp3.Adatp3TransformerFactory;
import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.ITransformerDescriptor;

import junit.framework.TestCase;

public class Adatp3TransformerFactoryTests extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCtor() {
		Adatp3TransformerFactory mpgt = new Adatp3TransformerFactory();
		assertNotNull(mpgt);
	}

	public void testGetSupportedTransformers() {
		Collection<String> s = new Adatp3TransformerFactory()
				.getSupportedTransformers();
		assertNotNull(s);
		assertTrue(s.size() > 0);
	}

	public void testSupportsAtoToXml() {
		ITransformerDescriptor ato = new Adatp3TransformerFactory()
				.getDescriptor("atoToXml");
		assertNotNull(ato);
		ITransformer tx = ato.createInstance();
		assertNotNull(tx);
	}

}
