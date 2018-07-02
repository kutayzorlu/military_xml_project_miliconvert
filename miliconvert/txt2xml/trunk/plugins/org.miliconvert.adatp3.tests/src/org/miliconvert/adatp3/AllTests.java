package org.miliconvert.adatp3;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests  {

	

	public static Test suite() {
		TestSuite suite = new TestSuite(new Class[]{
				ACOFormatTests.class,
				Adatp3ParserTests.class,
				Adatp3TransformerFactoryTests.class,
				ATOFormatTests.class,
				EnsitrepFormatTests.class,
				IntsumFormatTests.class,
				LocatorFormatTests.class,
				NavsitrepFormatTests.class,
				NavsitsumFormatTests.class,
				OwnsitrepFormatTests.class});

	
		return suite;
	}
	
	
	
}
