package org.miliconvert.otg.tools;

import java.io.FileOutputStream;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.miliconvert.otg.MTFFormatRegister;
import org.miliconvert.otg.utils.DOMUtils;

public class GenerateXSDApplication implements IApplication {

	
	private Log logger = LogFactory.getLog(getClass());

	@SuppressWarnings("unchecked")
	public Object start(IApplicationContext context) throws Exception {
		Map arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args");

		if (args.length != 5) {
			logger
					.error("usage: <output dir> ");
			return IApplication.EXIT_OK;
		}
		
		for(String format : MTFFormatRegister.registeredFormats){
			SchemaGenerator generator = new SchemaGenerator(format);
			
			
			DOMUtils.serialise(generator.generate(), new FileOutputStream(args[0]+"/"+format+".xsd"));
			logger.info("Schema generation for " +format
					+ " completed.");
		}

		return EXIT_OK;
	}


	public void stop() {
	}


}
