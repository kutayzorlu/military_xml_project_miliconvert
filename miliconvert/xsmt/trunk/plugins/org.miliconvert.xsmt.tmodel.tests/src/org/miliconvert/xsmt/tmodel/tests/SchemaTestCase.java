package org.miliconvert.xsmt.tmodel.tests;

import java.io.File;

import junit.framework.TestCase;

import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.SchemaFactory;
import org.miliconvert.xsmt.tmodel.SchemaId;
import org.miliconvert.xsmt.tmodel.TModelException;

public abstract class SchemaTestCase extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	protected Schema loadSchema(String relativePath) throws TModelException {
		SchemaFactory sf = new SchemaFactory();
		String path = new File(relativePath).getAbsolutePath();
		Schema s = sf.create(new SchemaId(40), path);
		return s;
	}
	
}
