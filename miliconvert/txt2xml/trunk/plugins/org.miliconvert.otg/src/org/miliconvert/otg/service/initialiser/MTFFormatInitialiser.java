package org.miliconvert.otg.service.initialiser;

import org.miliconvert.otg.model.MTFFormatDefinition;


public interface MTFFormatInitialiser {

	public void initialize();
	
	public MTFFormatDefinition getFormat(String mtfType);
	
}
