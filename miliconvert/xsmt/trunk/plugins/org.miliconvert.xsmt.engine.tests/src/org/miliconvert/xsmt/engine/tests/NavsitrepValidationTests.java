package org.miliconvert.xsmt.engine.tests;

import org.miliconvert.xsmt.engine.ValidatingParser;

public class NavsitrepValidationTests extends AbstractEngineTest {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testValidateNavsitrep() throws Exception {
		ValidatingParser vp = new ValidatingParser();
		boolean ret = vp.isValid(getReadable("test-data/ad3/navsitrep.xml"),
				"test-data/bl12/navsitrep/messages.xsd");
		assertTrue(ret);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
