package org.miliconvert.xsmt.engine.tests;

import org.miliconvert.xsmt.engine.ValidatingParser;

public class LocatorValidationTests extends AbstractEngineTest {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testValidateLocator() throws Exception {
		ValidatingParser vp = new ValidatingParser();
		boolean ret = vp.isValid(getReadable("test-data/ad3/locator.xml"),
		"test-data/bl11/locator/messages.xsd");
		assertTrue(ret);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
