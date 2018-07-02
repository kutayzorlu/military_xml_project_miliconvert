package org.miliconvert.xsmt.mpgt;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTFieldDef;

/**
 * 
 * @author matthieu
 *
 */
public class MPGTUtils {

	public static final String ANNOTATION_KEY = "urn:MPIA-schemaInfo";
	public static final String EXTENDED_METADATA_KEY = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
	public static Log logger = LogFactory.getLog(MPGTUtils.class);
	
	public static Pattern attribute = Pattern
	.compile("((MPGT|MPIA)\\.[A-Za-z0-9]*\\.[A-Za-z0-9]*)");

	public static Pattern role = Pattern
	.compile("([A-Za-z0-9]*)\\{((MPGT|MPIA)\\.[A-Za-z0-9]*)\\}");
	

	//Groupe 1 : nom du role
	//Groupe 2 : nom de l'entite
	//Groupe 4 : suite du chemin
	public static Pattern chemin = Pattern
	.compile("([A-Za-z0-9]*)\\{((MPGT|MPIA)\\.[A-Za-z0-9]*)\\}#(.*)");
	
	

	public static String extractAttribute(String mpgt) {

		Matcher ma = chemin.matcher(mpgt);
		if(ma.matches()){
			return extractAttribute(ma.group(4));
		}
		ma = role.matcher(mpgt);
		if(ma.matches()){
			return extractAttribute(ma.group(2));
		}
		return mpgt;
	}


	public static String getTypeFromAttributeMega(String mega) { 
		return mega.substring(mega.indexOf(".")+1,mega.lastIndexOf("."));
	}


	public static String findAttributeType(EObject o, MPGTFieldDef def)  {
		EAttribute a = MPGTUtils.find(o.eClass(),def.getDef().substring(def.getDef().lastIndexOf(".")+1));
		if(a!=null){
			return a.getEType().getName().replaceFirst("TypeDictionaryDico", "");
		} else {
			logger.error("Impossible de determiner le type pour :"+def.getDef().substring(def.getDef().lastIndexOf(".")+1)+" "+o.eClass().getName() );
			return null;
		}
	}
	
	

	
	public static  String getXMLNameFromMegaAttributeOrEntity(String mega){
		
		if(mega !=null && isEntiteOrAttribute(mega) ){
			Pattern pa = Pattern.compile("(MPGT|MPIA)\\.([A-Za-z0-9]*)\\{(MPGT|MPIA)\\.[A-Za-z0-9]*\\}");
			Matcher ma = pa.matcher(mega);
			if(ma.matches()){
				return ma.group(2);
			} 
			return mega.substring(mega.lastIndexOf(".")+1,mega.length());
		} 
		return null;
	}
	

	
	public static  String getXmlNameFromRole(String role, String cible){
		return role+"_"+cible;
	}

	
	public static boolean isEntiteOrAttribute(String mega) {
		return mega.startsWith("MPGT") || mega.startsWith("MPIA") && !mega.contains("{NON INST}") && !mega.contains("NON_TRACE") ;
	}
	
	
	public static boolean isAttribute(String mega){
		Matcher ma = attribute.matcher(mega);
		return ma.matches();
	}
	

	public static boolean isChemin(String mega) {
		Matcher ma = chemin.matcher(mega);
		return ma.matches();
	}
	

	private static EAttribute locate(EClass eclass,String name){
		 
		 Iterator<EClass> it = eclass.getEAllSuperTypes().iterator();
	   		while(it.hasNext()) {
	   			eclass = it.next();
	   		    
	   			
	   			for(EAttribute attribute : eclass.getEAllAttributes() ){
	   				if(attribute.getEAnnotation(MPGTUtils.EXTENDED_METADATA_KEY)!=null){
	   					EMap<String, String> annotations  = attribute.getEAnnotation(MPGTUtils.EXTENDED_METADATA_KEY).getDetails();
	   					if(annotations.containsKey("name") && name.equalsIgnoreCase(annotations.get("name").trim())){
	   						return attribute;
	   					}
	   				}
	   			}	
	   				
	   		     EAttribute ret = locate(eclass,name);
	   		    
	   			if(ret!=null){
	   				return ret;
	   			}
	   			
	   		} 
	   		return null;
	}
	
	public static EAttribute find(EClass eclass,String name) {

		for(EAttribute attribute : eclass.getEAllAttributes() ){
			if(attribute.getEAnnotation(MPGTUtils.EXTENDED_METADATA_KEY)!=null){
				EMap<String, String> annotations  = attribute.getEAnnotation(MPGTUtils.EXTENDED_METADATA_KEY).getDetails();
				if(annotations.containsKey("name") && name.trim().equalsIgnoreCase(annotations.get("name").trim())){
					return attribute;
				}
			}
		}	
		
	
		
		return locate(eclass,name.trim());
		
	}
	
	
	public static EReference findReference(EClass eclass,String name) {

		  for(EReference reference : eclass.getEAllReferences() ){
				EMap<String, String> metadata = reference.getEAnnotation(MPGTUtils.EXTENDED_METADATA_KEY).getDetails();
					if(metadata!=null && metadata.containsKey("name") && name.trim().equalsIgnoreCase(metadata.get("name").trim())){	
						return reference;
					}
		}	
		
		return null;
		
	}
	
	


	public static  String getInstanciateType(String instanceName) {
		// MPIA.StructureOrganisee{MPIA.RacineOperationnelle}
		if(instanceName!=null){
			Pattern pa = Pattern.compile("(MPGT|MPIA)\\.([A-Za-z0-9]*)\\{(MPGT|MPIA)\\.[A-Za-z0-9]*\\}");
			Matcher ma = pa.matcher(instanceName);
			if(ma.matches()){
				return ma.group(2);
			} 
		}
		return null;
	}


	public static String formatName(String entite) {
		return entite.substring(entite.indexOf(".")+1,entite.length()).replace("_", "");
	}

	
	

	
	public static String formatEClassName(String name) {
		if(name.startsWith("TypeDico")){
			return name.replaceFirst("TypeDico", "");
		}
		
		return name.replaceFirst("Type", "");
	}


	public static String getAttributeName(String mega) {
		return mega.substring(mega.lastIndexOf(".")+1,mega.length());
	}





	
	
}
