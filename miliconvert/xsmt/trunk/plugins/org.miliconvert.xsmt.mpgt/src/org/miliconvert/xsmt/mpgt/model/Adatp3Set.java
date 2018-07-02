package org.miliconvert.xsmt.mpgt.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author matthieu
 *
 */
public class Adatp3Set extends AbstractFieldContainer implements Adatp3SetEntities  {


	private String setId;
	private String setName;
	private int setSeq;
	private int setPos;
	private int currOcc;
	
	private AbstractAdatp3SetContainer parent;


	

	public Adatp3Set(Adatp3Set set) {
		this.setId = set.setId;
		this.setName = set.setName;
		this.setSeq = set.setSeq;
		this.setPos = set.setPos;
		this.fieldsEntities = set.fieldsEntities;
		this.parent = set.parent;
		this.currOcc = set.currOcc;
	}

	public Adatp3Set() {}

	public String getSetId() {
		return setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public String getSetName() {
		return setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public int getSetSeq() {
		return setSeq;
	}

	public void setSetSeq(int setSeq) {
		this.setSeq = setSeq;
	}

	public int getSetPos() {
		return setPos;
	}

	public void setSetPos(int setPos) {
		this.setPos = setPos;
	}

	
    public String toString()
    {
        final String TAB = "    ";
        
        String retValue = "";
        
        retValue = "Set ( setId = " + this.setId + TAB
            + "setName = " + this.setName + TAB
            + "setSeq = " + this.setSeq + TAB
            + "setPos = " + this.setPos + TAB
            + "fieldsCount = " + this.fieldsEntities.size() + TAB
            + "currOcc = " + this.currOcc +TAB
            + " )";
        
        return retValue;
    }


	public List<Adatp3Set> getSets() {
		List<Adatp3Set> ret = new ArrayList<Adatp3Set>(1);
		ret.add(this);
		return ret;
	}
	


	public AbstractAdatp3SetContainer getParent() {
		return parent;
	}

	public void setParent(AbstractAdatp3SetContainer parent) {
		this.parent = parent;
	}

	
	


	public int getCurrOcc() {
		return currOcc;
	}

	public void setCurrOcc(int currOcc) {
		this.currOcc = currOcc;
	}

	public int getOccCount() {
		return parent.findBySetSeg(setSeq).size();
	}
	
}
