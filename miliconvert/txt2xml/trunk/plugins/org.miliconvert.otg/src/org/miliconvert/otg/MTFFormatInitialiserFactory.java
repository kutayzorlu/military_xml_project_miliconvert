package org.miliconvert.otg;

import org.miliconvert.otg.service.initialiser.MTFFormatInitialiser;
import org.miliconvert.otg.service.initialiser.impl.MTFFormatInitialiserImpl;

public class MTFFormatInitialiserFactory {
 	
	private static  MTFFormatInitialiser mtfFormatInitialiser = new MTFFormatInitialiserImpl();
	
	static {
		mtfFormatInitialiser.initialize();
	}



	public static MTFFormatInitialiser getMtfFormatInitialiser() {
		return mtfFormatInitialiser;
	}
 
	
	
 
}
