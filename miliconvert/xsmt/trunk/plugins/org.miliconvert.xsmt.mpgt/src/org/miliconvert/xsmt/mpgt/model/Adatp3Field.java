package org.miliconvert.xsmt.mpgt.model;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author matthieu
 *
 */
public class Adatp3Field  implements Adapt3FieldEntities {

	private String value;
	private Map<String,String> subFields = new LinkedHashMap<String, String>();
	private List<String> subList = new LinkedList<String>();
	private String ffirn;
	private String ffPos;

	private String name;
	private String alt;
	private AbstractFieldContainer parent;
	private int currOcc;
	

	public Adatp3Field(Adatp3Field field) {
		this.ffirn = field.ffirn;
		this.ffPos = field.ffPos;
		this.name = field.name;
		this.alt = field.alt;
		this.value = field.value;
		this.subFields = field.subFields;
		this.subList = field.subList;
		this.parent = field.parent;
		this.currOcc = field.currOcc;
	}

	
	
	public String getName() {
		return name;
	}




	public int getCurrOcc() {
		return currOcc;
	}




	public void setCurrOcc(int currOcc) {
		this.currOcc = currOcc;
	}




	public void setName(String name) {
		this.name = name;
	}


	public Adatp3Field() {}

	public Adatp3Field(String ffirn, String pos, String name,String alt) {
		super();
		this.ffirn = ffirn;
		this.ffPos = pos;
		this.name = name;
		this.alt = alt;
	}





	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getSubFields(String ffirn){
		return subFields.get(ffirn);
	}

	public void addSubField(String ffirn, String fieldValue) {
		subFields.put(ffirn, fieldValue);
		subList.add(fieldValue);
	}

	public String getSubFields(int i) {
		return subList.get(i);
	}

	public String getFfirn() {
		return ffirn;
	}

	public void setFfirn(String ffirn) {
		this.ffirn = ffirn;
	}

	public String getFfPos() {
		return ffPos;
	}

	public void setFfPos(String ffPos) {
		this.ffPos = ffPos;
	}


	
	
	
	
	  public String getAlt() {
		return alt;
	}




	public void setAlt(String alt) {
		this.alt = alt;
	}




	public AbstractFieldContainer getParent() {
		return parent;
	}




	public void setParent(AbstractFieldContainer parent) {
		this.parent = parent;
	}




	public String toString()
	    {
	        final String TAB = "    ";
	        
	        String retValue = "";
	        
	        retValue = "Field ( ffirn = " + this.ffirn + TAB
	            + "ffPos = " + this.ffPos + TAB
	            + "name = " + this.name + TAB
	            + "value = " + this.value + TAB
	            + "subFieldsCount = " + this.subFields.size() + TAB
	            + "currOcc = " + this.currOcc +TAB
	            + "alt = "+this.alt +TAB
	            + " )";
	        
	        return retValue;
	    }
	
	
	
}
