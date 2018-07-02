package org.miliconvert.xsmt.mpgt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author matthieu
 *
 */
public class Adatp3GeneratorFactory {

	private static Log logger = LogFactory.getLog(Adatp3GeneratorFactory.class);


	public void registerSupportedGenerators(
			Map<String, IMPGTGenerator> generators) {
		
		InputStream in = null;
		try {
			in = Adatp3GeneratorFactory.class.getClassLoader().getResourceAsStream("mappings/mpgt.supported");
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));

			String mapping = null;
			while ((mapping = reader.readLine()) != null) {
				if(mapping.endsWith(".mapping")){
					String[] fields = mapping.replace(".mapping","").split(":");
					if(fields.length>1){
					String fullName = fields[1].replace(" ","").toLowerCase().trim();
					String shortName = fields[0].replace(" ","");
					generators.put(fullName,
							new FileBasedGenerator("mappings/"+shortName+"_mpgt.mapping",shortName));
					} else {
						logger.warn("Invalid name: "+mapping);
					}
				}
			}
		} catch (Exception e) {
			logger.error(e,e);
		} finally {
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					logger.error(e,e);
				}
			}
		}
		
	}
	
	
	
}
