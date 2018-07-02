package org.miliconvert.xsmt.mpgt;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.exec.util.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author matthieu
 * Permet de garder en mémoire les objets créé à une ligne de la définition donnée.
 */
public class MPGTLineContext {

	Map<String,EObject> context = new HashMap<String,EObject>();
	Log logger = LogFactory.getLog(MPGTLineContext.class);
	
	public void add(String line, EObject e) {
		 logger.info("Saving line :"+line);
		 context.put(line,e);
	}
	
	public EObject getInstance(String input){
		String [] lines = StringUtils.split(input, "/");
		for (int i = 0; i < lines.length; i++) {
			if(context.containsKey(lines[i])){
				return context.get(lines[i]);
			}
		}
		logger.error("Instance de la ligne "+input +" non trouvé.");
		return null;
	}
	

}
