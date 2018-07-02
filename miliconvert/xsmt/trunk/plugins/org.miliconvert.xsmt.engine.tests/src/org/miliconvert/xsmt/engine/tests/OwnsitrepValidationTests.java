package org.miliconvert.xsmt.engine.tests;

import org.miliconvert.xsmt.engine.ValidatingParser;

public class OwnsitrepValidationTests extends AbstractEngineTest {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testValidateOwnsitrep() throws Exception {
		ValidatingParser vp = new ValidatingParser();
		boolean ret = vp.isValid(getReadable("test-data/ad3/ownsitrep.xml"),
				"test-data/bl11/ownsitrep/messages.xsd");
		assertTrue(ret);
	}


	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
