package org.miliconvert.xsmt.mpgt.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author matthieu
 *
 */
public abstract class AbstractFieldContainer {

	
	protected List<Adapt3FieldEntities> fieldsEntities = new ArrayList<Adapt3FieldEntities>();

	public List<Adapt3FieldEntities> getFieldsEntities() {
		return fieldsEntities;
	}

	public void setFieldsEntities(List<Adapt3FieldEntities> fieldsEntities) {
		this.fieldsEntities = fieldsEntities;
	}
	
	

    
	public void add(Adapt3FieldEntities entite) {
		entite.setParent(this);
		if(entite instanceof Adatp3Field){
			entite.setCurrOcc(findByFFPos(((Adatp3Field) entite).getFfPos()).size());
		}
		fieldsEntities.add(entite);
	}
	
	


	public List<Adatp3Field> findByFFPos(String ffPos) {
		List<Adatp3Field> ret = new ArrayList<Adatp3Field>();
		for(Adapt3FieldEntities entite : fieldsEntities){
			if(entite instanceof AbstractFieldContainer){
			 ret.addAll(((AbstractFieldContainer)entite).findByFFPos(ffPos));	
			} else if(entite instanceof Adatp3Field){
				String ffpos = ((Adatp3Field)entite).getFfPos();
				String alt =((Adatp3Field)entite).getAlt();
				if(ffpos.equalsIgnoreCase(ffPos) ||
					(ffpos+alt).equalsIgnoreCase(ffPos)	){
					ret.add((Adatp3Field)entite);
				}
			}
		}
		return ret;
	}	
	
	public List<Adatp3Field> getAd3Fields() {
		List<Adatp3Field> ret = new ArrayList<Adatp3Field>();
		for(Adapt3FieldEntities entite : fieldsEntities){
			if(entite instanceof AbstractFieldContainer){
			 ret.addAll(((AbstractFieldContainer)entite).getAd3Fields());	
			} else if(entite instanceof Adatp3Field){
				ret.add((Adatp3Field)entite);
			}
		}
		return ret;
	}	
	

	public int countFields(String ffPos) {
		return findByFFPos(ffPos).size();
	}


	
	
}
