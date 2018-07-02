package org.miliconvert.adatp3.bl12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.ITransformerDescriptor;

/**
 * 
 * @author matthieu
 *
 */
public class BL12TransformerFactory {

	private static Log logger = LogFactory.getLog(BL12TransformerFactory.class);
	

	public void registerTransformers(
			HashMap<String, ITransformerDescriptor> transformers){
		registerSupportedTransformers(transformers);
	}
	
	
	public void registerSupportedTransformers(
			HashMap<String, ITransformerDescriptor> transformers){
		
			InputStream in = null;
			try {
				in = BL12TransformerFactory.class.getClassLoader().getResourceAsStream("mappings/bl12/bl12.supported");
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));

				String mapping = null;
				while ((mapping = reader.readLine()) != null) {
					if(mapping.endsWith(".mapping")){
						String[] fields = mapping.replace(".mapping","").split(":");
						if(fields.length>1){
						final String fullName = fields[1];
						final String shortName = fields[0];
						transformers.put(shortName.replace(" ","").toLowerCase()+"ToXml",
								new ITransformerDescriptor (){
										@Override
										public ITransformer createInstance() {
											return new BL12ToXmlTransformer(new BL12Flavour(shortName,fullName));
										}
								});
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
