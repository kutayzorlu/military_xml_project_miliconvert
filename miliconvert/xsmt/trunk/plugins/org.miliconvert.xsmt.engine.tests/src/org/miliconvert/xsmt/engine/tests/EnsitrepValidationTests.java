package org.miliconvert.xsmt.engine.tests;

import org.miliconvert.xsmt.engine.ValidatingParser;

public class EnsitrepValidationTests extends AbstractEngineTest {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testValidateEnsitrep() throws Exception {
		ValidatingParser vp = new ValidatingParser();
		boolean ret = vp.isValid(getReadable("test-data/ad3/ensitrep.xml"),
				"test-data/bl11/ensitrep/messages.xsd");
		assertTrue(ret);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
