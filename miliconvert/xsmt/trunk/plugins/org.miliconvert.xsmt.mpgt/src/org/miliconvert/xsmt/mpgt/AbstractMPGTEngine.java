package org.miliconvert.xsmt.mpgt;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;

import mpia.meta.MetaFactory;
import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.schema.SchemaFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTFieldDef;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public abstract class AbstractMPGTEngine {

	protected  static Log logger = LogFactory.getLog(MPGTEngine.class);
	
	

	
	protected Map<String,EObject> entitiesMap = new HashMap<String, EObject>();
	protected EObject currentSetInstance;
	//protected EObject currentFieldInstance;
	protected MPGTFieldCreator currentFieldCreator;
	
	

	/**
	 * L'instance du field n'existe pas on la créé et on l'ajoute au set.
	 * @param set
	 * @param field
	 * @return
	 */
	protected EObject createDef(MPGTWrapperSet set, MPGTWrapperField field) {
		return createDef(set.getSetInstance(),
				field.getFieldDef(),
				field.getValue());
	}





	
	/**
	 * 
	 * @param entite
	 * @param fieldDef
	 * @return
	 * @throws Exception 
	 */
	public EObject createDef(EObject entite , MPGTFieldDef fieldDef)  {
			return createDef(entite,fieldDef,
				null);
	
	}

	



	protected void appendFieldInstance(MPGTWrapperSet set, MPGTWrapperField field) {
		 createDef(set.getSetInstance(),field.getFieldDef(),
				null);
		//automatiquemnt associé!!
		
	}
	


	protected void appendValue(final MPGTWrapperField field)  {
	  if(field.getValue()!=null && field.getValue().length()>0){
			  final String attrName = MPGTUtils.getAttributeName(field.getFieldDef().getDef());
			if(logger.isInfoEnabled()){
		    	logger.info("Ajoute la valeur "+field.getValue()+" à "+attrName);
		    }
			try {
			appendAttribute(field.getFieldInstance(), attrName , field.getValue());
			} catch (Exception e) {
				logger.error(e,e);
			}
	  } else {
		  logger.warn("Attention le champ est vide pour "+field.toString());
	  }
	}
	

	public EObject createDef(EObject entite , MPGTFieldDef fieldDef,
			String value ) {
		String mega = fieldDef.getDef().trim();
		Matcher roleMa = MPGTUtils.role.matcher(mega);
		try {
			if(MPGTUtils.isChemin(mega)){
				return appendRole(entite,fieldDef, value, mega,0);
			} else 	if(MPGTUtils.isAttribute(mega)){
				 if(value!=null){
					 createAttribute(entite,fieldDef.getCurrInstance(),value,mega);
				 }
				return entite;
			} else if(roleMa.matches()){
				String type = MPGTUtils.getXMLNameFromMegaAttributeOrEntity(roleMa.group(2));
				EObject pasBean = currentFieldCreator.findOrCreateFieldEntities(type);
				
				String roleName = MPGTUtils.getXmlNameFromRole(roleMa.group(1),type );

				 appendAttribute(entite,entite.eClass(),roleName, pasBean);

				return pasBean ;
				
				
			}else {
				logger.warn("No match for: "+mega+" \n");
			}
		} catch (Exception e) {
			logger.error("Error creating entites ( entite : "+entite.eClass().getName()+" def : "+fieldDef.toString()+")",e);
		}
		return null;
	}
	
	
	private EObject createAttribute( EObject entite , String instanceName,
			String value, String mega) throws Exception {
		String name = MPGTUtils.getXMLNameFromMegaAttributeOrEntity(mega);
		String typeInstanciate = MPGTUtils.getInstanciateType(instanceName);
		EObject ret = entite;
		if(typeInstanciate!=null){
			 logger.info("No match: Type"+typeInstanciate+ " "+entite.eClass().getName() );
			 ret =   currentFieldCreator.findOrCreateFieldEntities(typeInstanciate);
			 appendAttribute(entite, entite.eClass(), typeInstanciate , ret );
			 
		}
		if(ret!=null){
		 appendAttribute(ret, name, value );
		}
		 
		return ret;
	}
	



	
	public void appendAttribute(EObject element,
			String attrName, String value) throws Exception {
		   logger.info("Appening "+attrName+" to "+element.eClass().getName()+" value "+value);
		   
		   EAttribute attribute = MPGTUtils.find(element.eClass(), attrName);
		   if(attribute!=null){
			   try {
					element.eSet(attribute, MetaFactory.eINSTANCE.createFromString(attribute.getEAttributeType(), value));
					return;
				} catch (IllegalArgumentException e) {
					try {
						element.eSet(attribute, SchemaFactory.eINSTANCE.createFromString(attribute.getEAttributeType(), value));
					}catch (Exception ex) {
						logger.warn(e,e);
						logger.error(ex,ex);
					}
					return;
				}
		   }
	
		   /*
		  if("Frequence".equals(attrName) && element instanceof TypeFrequence){
			  TypeDataTypeFrequence freq = MetaFactory.eINSTANCE.createTypeDataTypeFrequence();
			  freq.setValue(Double.parseDouble(value));
			  ((TypeFrequence)element).setFrequence(freq);
			  return;
		  }
			  
		  if("Largeur".equals(attrName) && element instanceof TypeCorridorGeometrique){
			  TypeDataTypeLongueur longueur = MetaFactory.eINSTANCE.createTypeDataTypeLongueur();
			  longueur.setValue(Double.parseDouble(value));
			  ((TypeCorridorGeometrique)element).setLargeur(longueur);
			  return;
		  }
		  
		  */
		  
			  //Si on n'a pas trouvez on cherche dans les reference
			   logger.warn("FIELD NOT FOUND in attributes:"+attrName);
		   
	}

	

	
	public void appendAttribute(EObject element,EClass eclass,
			String attrName, EObject value) throws Exception {
		   logger.info("Appening "+attrName+" to "+ eclass.getName()+" value "+value.eClass().getName());
		   
		   if(!didAppendAttribute(element, eclass, attrName, value)){
			   appendAttributeToParent(element, eclass, attrName, value, value.eClass());
			}	

	}
	
	private void appendAttributeToParent(EObject element,EClass eclass,
			String attrName, EObject value, EClass parentClass) throws Exception{
		 Iterator<EClass> it = parentClass.getEAllSuperTypes().iterator();
	   		while(it.hasNext()) {
	   		   EClass locClass = it.next();
		       String locAttrName = attrName.split("_")[0]+"_"+MPGTUtils.formatEClassName(locClass.getName());
			   logger.info("Trying: "+ attrName);
			   if(!didAppendAttribute(element, eclass, locAttrName, value)){
				   appendAttributeToParent(element, eclass, locAttrName, value, locClass);
			   } else {
				   return;
			   }
	   		} 
		
		
	}
	
	

	@SuppressWarnings("unchecked")
	private boolean didAppendAttribute(EObject element,EClass eclass,
			String attrName, EObject value) throws Exception {
		EReference reference = MPGTUtils.findReference(eclass, attrName);
		if (reference != null) {
			EMap<String, String> annotations = reference.getEAnnotation(
					MPGTUtils.ANNOTATION_KEY).getDetails();
			if (annotations != null && annotations.containsKey("relation_type")) {
				EObject assoc = null;
				if ("ASSOCIATION".equals(annotations.get("relation_type"))) {
					assoc = createAssoc(element,value, annotations.get("reverse_association"),!"TypeAssociation".equals(reference.getEReferenceType().getName()));
				} else if ("AGGREGATION".equals(annotations
						.get("relation_type"))) {
					logger.debug("Create agregation: " + reference.getName());
					assoc = value;
				}
				
				if(assoc!=null){
					if (reference.isMany()) {
						addOnce(((EList<EObject>) element.eGet(reference)),assoc);
					
					} else {
						element.eSet(reference, assoc);
					}
					return true;
				} else {
					logger.warn("Type de relation inconnue:"
							+ annotations.get("relation_type"));
				}
			}
			logger.warn("Relation type instrouvable");
		}

		return false;
	}
	




	public EObject createAssoc(EObject org,EObject cible, String reverseAssociation, boolean isExt) throws Exception {
		EObject ret = null;

	    EAttribute cte = MPGTUtils.find(cible.eClass(),"CTE");
	    String ref = (String) cible.eGet(cte);
		entitiesMap.put(ref, cible);
		
		if(!isExt) {
			TypeAssociation assoc = MetaFactory.eINSTANCE.createTypeAssociation();
			assoc.setRefCTE(ref);
			ret = assoc;
		} else {
			TypeAssociationEXT assoc = MetaFactory.eINSTANCE.createTypeAssociationEXT();
			assoc.setRefCTE(ref);
			ret = assoc;
		}
	
		
		if(reverseAssociation!=null){
			logger.info("On ajoute la reverse association : "+reverseAssociation);
			cte = MPGTUtils.find(org.eClass(),"CTE");
			ref = (String) org.eGet(cte);
			EReference reference = MPGTUtils.findReference(cible.eClass(),reverseAssociation);
			EObject reverseAssoc =null;
			if("TypeAssociation".equals(reference.getEReferenceType().getName())) {
				 reverseAssoc = MetaFactory.eINSTANCE.createTypeAssociation();
		   	    ((TypeAssociation)reverseAssoc).setRefCTE(ref);
			} else {
				reverseAssoc = MetaFactory.eINSTANCE.createTypeAssociationEXT();
				((TypeAssociationEXT)reverseAssoc).setRefCTE(ref);
			}
			
			if (reference.isMany()) {
				addOnce(((EList<EObject>) cible.eGet(reference)),reverseAssoc);
			} else {
				cible.eSet(reference, reverseAssoc);
			}
		}
	    
    	return ret;
		
	}

	
	public <T>  void  addOnce(EList<T> list, T object) {
		if(object instanceof TypeAssociation){
			for(T tmp : list){
				if(((TypeAssociation) tmp).getRefCTE().equals(((TypeAssociation)object).getRefCTE())){
						return;
				}
			}
		}
		
		list.add(object);
	}



	/*source_0, pas_1#pas_2#...#pas_n	 source_1, pas_2#...#pas_n
	source_1, pas_2#...#pas_n		 source_2, pas_3#...#pas_n
	...
	source_(n-1), pas_n			 source_n, 
	
	 */
	private EObject appendRole( EObject source , MPGTFieldDef fieldDef,
			String value, String mega, int depth) throws Exception {
		//Groupe 1 : nom du role
		//Groupe 2 : nom de l'entite
		//Groupe 4 : suite du chemin
		Matcher ma = MPGTUtils.chemin.matcher(mega);
		if(ma.matches()){
			
			String type = MPGTUtils.getXMLNameFromMegaAttributeOrEntity(ma.group(2));
			String roleName = MPGTUtils.getXmlNameFromRole(ma.group(1),type );
			
			logger.info( type+" "+ roleName );
		
			
			EObject pasBean =  currentFieldCreator.findOrCreateFieldEntities(type,depth);
		
			
			EObject ret = appendRole( pasBean, fieldDef , value, ma.group(4), depth++ );
			
	

			 appendAttribute(source,source.eClass(),roleName, pasBean);

			return ret ;
		} 
		
		ma = MPGTUtils.attribute.matcher(mega);
		if(ma.matches()){
			logger.info("Attribut match"+ma.group(1) );
			 if(value!=null){
				 return	 createAttribute(source, fieldDef.getCurrInstance(), value, ma.group(1));
			 }
			return source;
			
			

		} 
		
		
		ma = MPGTUtils.role.matcher(mega);
		if(ma.matches()){
			logger.info(ma.group(1)+" "+ma.group(2) );
			String type = MPGTUtils.getXMLNameFromMegaAttributeOrEntity(ma.group(2));
			EObject pasBean =  currentFieldCreator.findOrCreateFieldEntities(type,depth);
			
			String roleName = MPGTUtils.getXmlNameFromRole(ma.group(1),type );

			 appendAttribute(source,source.eClass(),roleName, pasBean);

			return pasBean ;
			
			
		}
		
		logger.error("Not match for: "+mega);
		return null;
		
	}

	
	


	
	
	


	/*



	private boolean isRacineOp(EObject entite, String attrName) {
		if(attrName!=null){
			for(EAttribute attribute : entite.eClass().getEAttributes() ){
				if(attribute.getEAnnotation(MPGTUtils.ANNOTATION_KEY)!=null){
					EMap<String,String> map =  attribute.getEAnnotation(MPGTUtils.ANNOTATION_KEY).getDetails();
					if(map.containsKey("operational_key") &&  "true".equals(map.get("operational_key"))){
						EMap<String,String> tmp =  attribute.getEAnnotation(MPGTUtils.EXTENDED_METADATA_KEY).getDetails();
						if(tmp.containsKey("name") && attrName.equalsIgnoreCase(tmp.get("name"))){
							return true;
						} else {
							return false;
						}
					}
				}
			}
		}
		return false;
	}

*/


	
	
	

	


	

	
/*


	private EObject merge(EObject source, EObject toFill) {
		for(EAttribute attribute : source.eClass().getEAllAttributes() ){
			if(source.eGet(attribute)!=null){
				toFill.eSet(attribute,source.eGet(attribute) );
			}
		}
		//TODO Elist
		for(EReference eReference : source.eClass().getEAllReferences() ){
			if(source.eGet(eReference)!=null){
				toFill.eSet(eReference,source.eGet(eReference) );
			}
		}
		
		return  source;
	}

*/




	protected Object findRacineOpValue(EObject entite) {
		for(EAttribute attribute : entite.eClass().getEAttributes() ){
			if(attribute.getEAnnotation(MPGTUtils.ANNOTATION_KEY)!=null){
				EMap<String,String> map =  attribute.getEAnnotation(MPGTUtils.ANNOTATION_KEY).getDetails();
				if(map.containsKey("operational_key") &&  "true".equals(map.get("operational_key"))){
				return	entite.eGet(attribute);
				}
			}
		}	
		return null;
	}

	


	/*
		private void appendDef(EObject entite, EObject fieldInstance,
				MPGTFieldDef fieldDef , String value){
			
			if(value!=null){
				appendDef(entite, fieldInstance, fieldDef.getCurrInstance(),fieldDef.getDef(), value);
			}
		}
		*/

		



		public EObject findEntities(String name, String value) {
			if(value !=null && 
					entitiesMap.containsKey(name+"-"+value)){
					return entitiesMap.get((name+"-"+value));
			} else  if(currentSetInstance !=null && MPGTUtils.formatEClassName(currentSetInstance.eClass().getName()).equals(name)){
				return currentSetInstance;
			}
			
			return null;
		}



		public EObject findOrCreateSetEntities(String entite, String value) throws Exception {
			String instanceName = MPGTUtils.formatName(entite);
			Method createMethod  = SchemaFactory.class.getMethod("createType"+instanceName, null);
			EObject instance = (EObject) createMethod.invoke(SchemaFactory.eINSTANCE, null);		
			if(value==null){
				return instance;
			} else if(entitiesMap.containsKey(instanceName+"-"+value)) {
				return entitiesMap.get(instanceName+"-"+value);
			} else {
				EAttribute cte = MPGTUtils.find(instance.eClass(),"CTE");
				if(cte!=null){
					instance.eSet(cte, EcoreUtil.generateUUID());
				}
				EAttribute racineOp = MPGTUtils.find(instance.eClass(),"operational_key");
				if(racineOp!=null){
					instance.eSet(racineOp, value);
					entitiesMap.put(instanceName+"-"+value,instance);
				}
				return instance;
				
			}
			
			
		}



		
		/*
		public EObject getEntiteByName(String name, Map<String,EObject> workingMem, EObject instance, String attrName ,String value )  {
			try {
				Method createMethod  = SchemaFactory.class.getMethod("createType"+name.replace("_", ""), null);
				EObject tmp = (EObject) createMethod.invoke(SchemaFactory.eINSTANCE, null);			
				
				
				// La regle si le set contient une racineOp alors on cherche 
				// Si on ne trouve pas est que l'instance courrante est de mêm type est n'a pas de racine op on enrichit
				//Sinon on crée et on set l'instance courrante 
				// Sinon
				// Si l'instance courrante est de même type on enrichi
				// Sinon on crée et on set l'instance courrante
				boolean isRacineOp = isRacineOp(tmp,attrName);
				
				if(isRacineOp && 
						workingMem.containsKey(name+"-"+value)){
					instance = workingMem.get((name+"-"+value));
				} else  if(instance ==null || !instance.eClass().equals(tmp.eClass())){
					instance  = tmp;
					EAttribute cte = MPGTUtils.find(instance.eClass(),"CTE");
					if(cte!=null){
						instance.eSet(cte, EcoreUtil.generateUUID());
					}
					
					EAttribute ce = MPGTUtils.find(instance.eClass(),"CE");
					if(ce!=null){
						instance.eSet(ce, EcoreUtil.generateUUID());
					}
					if(isRacineOp){
						workingMem.put(name+"-"+value, instance);
					}
				}
				
				
				 return instance;
				 
				} catch (Exception e) {
					logger.error(e,e);
				}
				return null;
			}
			*/
			
	
}
