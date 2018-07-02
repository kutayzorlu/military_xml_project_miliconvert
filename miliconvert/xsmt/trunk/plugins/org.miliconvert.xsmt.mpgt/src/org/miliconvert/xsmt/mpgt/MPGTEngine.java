package org.miliconvert.xsmt.mpgt;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import mpia.schema.SchemaFactory;

import org.eclipse.emf.ecore.EObject;
import org.miliconvert.xsmt.mpgt.model.Adatp3Field;
import org.miliconvert.xsmt.mpgt.model.Adatp3Message;
import org.miliconvert.xsmt.mpgt.model.Adatp3Set;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTSetDef;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

/**
 * 
 * @author matthieu
 *
 */
public class MPGTEngine extends AbstractMPGTEngine {

	public static MPGTEngine instance = new MPGTEngine();
	
	public static final String NAMESPACE_URI = "urn:MPIA-schema";
	public final static String SET_SEQ = "SET_SEQ";

	
	private  MPGTRuleService ruleService;
	private  MPGTLineContext lineContext;
	private  Adatp3Message message;
	
	
/*
	private Map<String,EObject> assocTypeBuffer = new HashMap<String, EObject>();
	private Map<String,EObject> assocValueBuffer = new HashMap<String, EObject>();
	*/
	
	



	
	public void init(final String type) {
		 try {
			ruleService = new MPGTRuleService(type);
			lineContext = new MPGTLineContext();
			
		    logger.debug("Init mpgt engine done!");
		
		 } catch (Exception e) {
			logger.error(e,e);
		}

	}
	

	


	public static MPGTEngine getInstance() {
		return instance;
	}





	public Map<String, EObject> getEntitiesMap() {
		return entitiesMap;
	}

	
	public MPGTLineContext getLineContext() {
		return lineContext;
	}
	
	/**
	 * Ajout des sets
	 */
	
	
	private void addSet(final MPGTWrapperSet set) {

		logger.info("On traîte le set : "+set.toString());
			startAssoc();
			

			try {

				
				//PHASE 1 On joue les rêgles de transformation
				//ruleService.runTransformationRules(set);
				

				//PHASE 2 On joue les rêgles d'instanciation 
				// Cela permet de jouer avec currentInstance 
				// ET de choisir l'alternative de définition de set
				ruleService.runInstanciationRules(set);
				
				if(!set.isSkip()){
				
						
						if(set.getSetInstance()==null)
						{
						//on remplie currentInstance
							String name = MPGTUtils.getXMLNameFromMegaAttributeOrEntity(set.getInstanceType());
							if(name!=null){
								Method createMethod  = SchemaFactory.class.getMethod("createType"+name, null);
								EObject tmp = (EObject) createMethod.invoke(SchemaFactory.eINSTANCE, null);		
							
								set.setEclass(tmp.eClass());
							
								// La regle si le set contient une racineOp alors on cherche 
								// Si on ne trouve pas est que l'instance courrante est de mêm type est n'a pas de racine op on enrichit
								//Sinon on crée et on set l'instance courrante 
								// Sinon
								// Si l'instance courrante est de même type on enrichi
								// Sinon on crée et on set l'instance courrante
								final Adatp3Field racineOP = set.getRacineOperationnel();
								
								if(racineOP !=null && 
										entitiesMap.containsKey(name+"-"+racineOP.getValue())){
										currentSetInstance = entitiesMap.get(name+"-"+racineOP.getValue());
								} else  if(currentSetInstance ==null || !currentSetInstance.eClass().equals(tmp.eClass())){
									currentSetInstance  = tmp;
									
								}
								set.setSetInstance(currentSetInstance);
							}  else {
								logger.warn("Le nom est null pour le set "+set.getSetId()+" ("+set.getInstanceType()+") !");
								return ; 
							}
							
						} 
						
						//PHASE 3 On rempli si ce n'est pas fait 
						 fill(set);
						
					} 
					
					currentSetInstance = set.getSetInstance();
					if(currentSetInstance!=null){
						lineContext.add(set.getCurrentDefAlternative().getLine(), currentSetInstance);
						final String value = (String) findRacineOpValue(currentSetInstance);
						final String key =  MPGTUtils.formatEClassName(currentSetInstance.eClass().getName())+"-"+value;
						if(value!=null
									&& !entitiesMap.containsKey(key) ){
									entitiesMap.put(key, currentSetInstance);
						}
					}
					
					commitAssoc();
				

			} catch (Exception e) {
					logger.error(e,e);
			}

	}
	

	private void startAssoc() {
		currentFieldCreator = new MPGTFieldCreator();
		//currentFieldInstance = null;
		
	}
	
	



	private void commitAssoc(){
		/*
		//On merge les entités crées a partir des assocs
		for(Map.Entry<String, EObject> entry : assocValueBuffer.entrySet()){
			logger.info("Mergin :+"+entry.getValue().eClass().getName());
			//EObject toMerge = assocValueBuffer.get(entry.getKey());
			String racineOpKey = formatEClassName(entry.getValue().eClass().getName())+"-"+findRacineOpValue(entry.getValue());
			if(entitiesMap.containsKey(racineOpKey)){
				EObject tmp = merge(entitiesMap.get(racineOpKey),entry.getValue());
				EAttribute cte1 = MPGTUtils.find(tmp.eClass(), "CTE");
				EObject tmp2 = assocTypeBuffer.get(entry.getKey());
				EAttribute cte2 = MPGTUtils.find(tmp2.eClass(), "refCTE");
				tmp2.eSet(cte2, tmp.eGet(cte1));
				
				entitiesMap.put(racineOpKey, tmp);
			} else {
				entitiesMap.put(racineOpKey, entry.getValue());
			}
			
			
		}
		*/
	}
	
	private void fill(final MPGTWrapperSet set){

		for(MPGTWrapperField field : set.getFields()){
			if(field.getFieldDef()!=null){
				if(logger.isInfoEnabled()){
					logger.info("Traitement du champ :"+field.getFfPos()+" du set "+set.getSetId()+" at pos "+set.getSetPos());
				}
				ruleService.runFillingRules(set,field);
				
				if(!field.isSkip()){
					
					if(field.getFieldInstance()!=null){
						//Cas ou l'assoc est créé depuis la rêgle
						if(field.getValue()!=null){
							appendValue(field);
						} else {
							appendFieldInstance(set,field);
						}
					} else {
						field.setFieldInstance(createDef(set,field));
					}

				} 
				
				//currentFieldInstance = field.getFieldInstance();
				if(field.getFieldInstance()!=null){
					lineContext.add(field.getFieldDef().getLine(),field.getFieldInstance());
				}
			
			}
		}

}




	






	public EObject findOrCreateFieldEntities(final String instanceName) throws Exception {
		return currentFieldCreator.findOrCreateFieldEntities(instanceName);
	}



	public MPGTRuleService getRuleService() {
		return ruleService;
	}



	public void setRuleService(MPGTRuleService ruleService) {
		this.ruleService = ruleService;
	}



	public void setLineContext(MPGTLineContext lineContext) {
		this.lineContext = lineContext;
	}




	public void transform(Adatp3Message ad3Message, MPGTDefExtractor extractor) {
		this.message = ad3Message;
		
		for (Adatp3Set set : message.getSets()) {
			List<MPGTSetDef> setDefAlt = extractor.getSetDefs(""+set.getSetSeq());
			int i = set.getSetSeq();
			while(setDefAlt!=null && !setDefAlt.get(0).getSetId().trim().equalsIgnoreCase(set.getSetId().trim())){
				setDefAlt = extractor.getSetDefs(""+i++);
			}
			
			if(setDefAlt==null || setDefAlt.size()<1 ){
				logger.error("No set def for set :"+set.getSetSeq());
				continue;
			}
			
			addSet(new MPGTWrapperSet(set, setDefAlt));
		}
		
		
	}


}
