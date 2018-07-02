package org.miliconvert.xsmt.mpgt.model.mpgt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.miliconvert.xsmt.mpgt.MPGTUtils;
import org.miliconvert.xsmt.mpgt.model.Adatp3Field;
import org.miliconvert.xsmt.mpgt.model.Adatp3Set;

/**
 * 
 * @author matthieu
 *
 */
public class MPGTWrapperSet extends Adatp3Set{

	private EClass eclass;
	private boolean skip = false;
	private int currentAlternative = 0;
	private EObject setInstance;
	
	
	private static Log logger = LogFactory.getLog(MPGTWrapperSet.class);
	
	private List<MPGTSetDef> setDefs = new ArrayList<MPGTSetDef>();
	
	
	public MPGTWrapperSet(Adatp3Set set, List<MPGTSetDef> setDefs) {
		super(set);
		this.setDefs = setDefs; 
		this.skip = false;
		this.currentAlternative = 0;
			if(!setDefs.get(0).getSetId().trim().equalsIgnoreCase(getSetId().trim())){
				logger.error("Set ID mismatch:"+setDefs.get(0).getSetId() +" "+getSetId());
			}
		
		}

	
	

	
		public MPGTWrapperField getRacineOperationnel(){
			if(eclass!=null ){
				for(EAttribute attribute : eclass.getEAttributes() ){
					if(attribute.getEAnnotation(MPGTUtils.ANNOTATION_KEY)!=null){
						for(Map.Entry<String, String> test : attribute.getEAnnotation(MPGTUtils.ANNOTATION_KEY).getDetails()){
							if("operational_key".equals(test.getKey()) && "true".equals(test.getValue())){
								for(MPGTWrapperField field: getFields()){
										if(field.getFieldDef()!=null){
												if(attribute.getName().equalsIgnoreCase(MPGTUtils.getXMLNameFromMegaAttributeOrEntity(field.getFieldDef().getDef()))){
													return field;
												}
										}
									}
								}
							}
						}
					}
				}			

			return null;
		}
		
	



   public List<MPGTWrapperField> getFields() {
			return wrap(getAd3Fields());
   }



		

	public List<MPGTWrapperField> getFieldsByPos(String ffpos){

		return wrap(findByFFPos(ffpos));
	}
	
	
	private List<MPGTWrapperField> wrap(List<Adatp3Field> fields) {
		List<MPGTWrapperField> ret = new ArrayList<MPGTWrapperField>();
		for(Adatp3Field field : fields){
			MPGTWrapperField wrapped = wrap(field);
			if(wrapped!=null){
				ret.add(wrapped);
			}
		}
		
		return ret;
	}





	private MPGTWrapperField wrap(Adatp3Field field) {
		String ffPos = field.getFfPos()+field.getAlt();
	    List<MPGTFieldDef> defs = getCurrentDefAlternative().findFieldDef(ffPos);
		if(defs==null){
			ffPos = field.getFfPos();
			defs =  getCurrentDefAlternative().findFieldDef(ffPos);
		}
	    if(defs==null || defs.size()==0){
	    	logger.error("Définition introuvable pour :"+field.toString()+" dans " +
	    			"\n"+toString()
	    			+"\n Def size"+setDefs.size()
	    			+"\n Alternative"+currentAlternative
	    			+"\n Alternative fields size"+getCurrentDefAlternative().getFields().size());
	    	
	    	return new MPGTWrapperField(field,null,ffPos,0);
	    }
		
		
	    if(field.getCurrOcc()<defs.size()){
	    	return new MPGTWrapperField(field,defs.get(field.getCurrOcc()),ffPos,field.getCurrOcc());
	    }
	    
	    return new MPGTWrapperField(field,defs.get(0),ffPos,0);
	    
	}





	public MPGTWrapperField getField(String ffpos){
		List<Adatp3Field> fields = findByFFPos(ffpos);
		if(fields!=null && fields.size()>0){
			return wrap(fields.get(0));
		}
		return null;
	}

	
	

	public String getInstanceType() {
		MPGTSetDef def = getCurrentDefAlternative();
		for(Map.Entry<String, List<MPGTFieldDef>> fieldDefs : def.getFields().entrySet()){
			for(MPGTFieldDef fieldDef : fieldDefs.getValue()){
				if(	MPGTUtils.isEntiteOrAttribute(fieldDef.getParentInstance())
						){
					return fieldDef.getParentInstance();
				}
			}
			
		}
		
		return null;
	}
	
	
	


	public void updateAlternative(int alternative){
		currentAlternative = alternative;
	}


	public boolean isSkip() {
		if(skip){
			return true;
		}
		return false;
	}


	public void setSkip(boolean skip) {
		this.skip = skip;
	}



	public MPGTSetDef getCurrentDefAlternative() {
		return setDefs.get(currentAlternative);
	}


	public EObject getSetInstance() {
		return setInstance;
	}


	public void setSetInstance(EObject setInstance) {
		this.setInstance = setInstance;
	}


	public int getCurrentAlternative() {
		return currentAlternative;
	}






	public EClass getEclass() {
		return eclass;
	}





	public void setEclass(EClass eclass) {
		this.eclass = eclass;
	}





	/**
	 * Constructs a <code>String</code> with all attributes
	 * in name = value format.
	 *
	 * @return a <code>String</code> representation 
	 * of this object.
	 */
	public String toString()
	{
	    final String TAB = "    ";
	
	    StringBuilder retValue = new StringBuilder();
	    
	    retValue.append("MPGTWrapperSet ( ")
	    	.append(super.toString()).append(TAB)
	        .append("skip = ").append(this.skip).append(TAB)
	        .append("currentAlternative = ").append(this.currentAlternative).append(TAB)
	        .append("setDefs = ").append(this.setDefs.size()).append(TAB)
	        .append(" )");
	    
	    return retValue.toString();
	}




















}
