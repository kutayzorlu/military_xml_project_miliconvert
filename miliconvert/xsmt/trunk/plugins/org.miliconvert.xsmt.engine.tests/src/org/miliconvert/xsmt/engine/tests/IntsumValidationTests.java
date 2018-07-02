package org.miliconvert.xsmt.engine.tests;

import org.miliconvert.xsmt.engine.ValidatingParser;

public class IntsumValidationTests extends AbstractEngineTest {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testValidateIntsum() throws Exception {
		ValidatingParser vp = new ValidatingParser();
		boolean ret = vp.isValid(getReadable("test-data/ad3/intsum.xml"),
				"test-data/bl11/intsum/messages.xsd");
		assertTrue(ret);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
