package org.miliconvert.xsmt.engine.tests;

import org.miliconvert.xsmt.engine.ValidatingParser;

public class NavsitsumValidationTests extends AbstractEngineTest {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testValidateNavsitsum() throws Exception {
		ValidatingParser vp = new ValidatingParser();
		boolean ret = vp.isValid(getReadable("test-data/ad3/navsitsum.xml"),
		"test-data/bl11/navsitsum/messages.xsd");
		assertTrue(ret);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
