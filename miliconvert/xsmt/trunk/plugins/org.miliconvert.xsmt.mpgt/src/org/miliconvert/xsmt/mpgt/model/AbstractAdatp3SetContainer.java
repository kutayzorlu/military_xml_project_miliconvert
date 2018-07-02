package org.miliconvert.xsmt.mpgt.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author matthieu
 *
 */
public abstract class  AbstractAdatp3SetContainer {

	private List<Adatp3SetEntities> entities = new ArrayList<Adatp3SetEntities>();

	
	public void add(Adatp3SetEntities entite) {
		if(entite instanceof Adatp3Set){
			((Adatp3Set) entite).setParent(this);
			((Adatp3Set) entite).setCurrOcc(findBySetSeg(((Adatp3Set) entite).getSetSeq()).size());
		}
		
		entities.add(entite);
	}



	public List<Adatp3SetEntities> getEntities() {
		return entities;
	}

	public void setEntities(List<Adatp3SetEntities> entities) {
		this.entities = entities;
	}
	
	
	

	public List<Adatp3Set> getSets() {
		List<Adatp3Set> ret = new ArrayList<Adatp3Set>();
		for(Adatp3SetEntities entite : entities){
			if(entite instanceof AbstractAdatp3SetContainer){
			 ret.addAll(((AbstractAdatp3SetContainer)entite).getSets());	
			} else if(entite instanceof Adatp3Set){
				ret.add((Adatp3Set)entite);
			}
		}
		return ret;
	}


	public List<Adatp3Set> findBySetSeg(int setSeq) {
		List<Adatp3Set> ret = new ArrayList<Adatp3Set>();
		for(Adatp3SetEntities entite : entities){
			if(entite instanceof AbstractAdatp3SetContainer){
			 ret.addAll(((AbstractAdatp3SetContainer)entite).findBySetSeg(setSeq));	
			} else if(entite instanceof Adatp3Set
					&& ((Adatp3Set)entite).getSetSeq()==setSeq){
				ret.add((Adatp3Set)entite);
			}
		}
		return ret;
	}



	public List<Adatp3Set> findBySetId(String setId) {
		List<Adatp3Set> ret = new ArrayList<Adatp3Set>();
		for(Adatp3SetEntities entite : entities){
			if(entite instanceof AbstractAdatp3SetContainer){
			 ret.addAll(((AbstractAdatp3SetContainer)entite).findBySetId(setId));	
			} else if(entite instanceof Adatp3Set
					&& ((Adatp3Set)entite).getSetId().equalsIgnoreCase(setId)){
				ret.add((Adatp3Set)entite);
			}
		}
		return ret;
	}



	public void remove(String setId) {
		for (Iterator<Adatp3SetEntities> iterator = entities.iterator(); iterator.hasNext();) {
			Adatp3SetEntities entite = (Adatp3SetEntities) iterator.next();
			if(entite instanceof AbstractAdatp3SetContainer){
				 ((AbstractAdatp3SetContainer)entite).remove(setId);	
				} else if(entite instanceof Adatp3Set
						&& ((Adatp3Set)entite).getSetId().equalsIgnoreCase(setId)){
					iterator.remove();
					return;
				}
		}
		
		
	}
}
