package org.miliconvert.xsmt.mpgt.model;


/**
 * 
 * @author matthieu
 *
 */
public class Adatp3FieldGroup extends AbstractFieldContainer implements Adapt3FieldEntities {

	private AbstractFieldContainer parent;
	private int currOcc;
	
	public AbstractFieldContainer getParent() {
		return parent;
	}
	public void setParent(AbstractFieldContainer parent) {
		this.parent = parent;
	}
	public int getCurrOcc() {
		return currOcc;
	}
	public void setCurrOcc(int currOcc) {
		this.currOcc = currOcc;
	}
	
	
	
}
