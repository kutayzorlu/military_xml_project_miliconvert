package org.miliconvert.otg;

import java.io.FileOutputStream;

import org.miliconvert.otg.tools.SchemaGenerator;
import org.miliconvert.otg.utils.DOMUtils;

public class SchemaGeneratorTest extends AbstractBaseTestCase {

	
	public void testGenerateShema() throws Exception {
	
		for(String format : MTFFormatRegister.registeredFormats){
			SchemaGenerator generator = new SchemaGenerator(format);
		//	DOMUtils.serialise(generator.generate(), new FileOutputStream("/opt/workspace/miliconvert/txt2xml/trunk/plugins/org.miliconvert.otg/schemas/"+format+".xsd"));
			DOMUtils.serialise(generator.generate(), new FileOutputStream("/tmp/"+format+".xsd"));
			
		}

		
	}

	
	
	
}
