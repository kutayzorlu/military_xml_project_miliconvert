package org.miliconvert.adatp3.common.formlets;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * FORMETS Set object representation
 * 
 * @author tom
 *
 */
public class Set implements IStructuralComponent {

	private Integer position;
	
	private String identifier;
	
	private Header[] columnHeaders;
	
	private List<Field[]> fields;
	
	public Set(String identifier) {
		this.identifier = identifier;
		fields = new LinkedList<Field[]>();
	}
	
	public void addFieldValues(Field[] values) {
		fields.add(values);
	}
	
	public List<Field[]> getFields() {
		return fields;
	}
	
	public void setColumnHeaders(Header[] headers) {
		this.columnHeaders = headers;
	}

	public String getIdentifier() {
		return identifier;
	}

	public Header[] getColumnHeaders() {
		return columnHeaders;
	}
	
	/**
	 * Give the position inside the adatp3 file.
	 * @return position the position inside the adatp3 file.
	 */
	public Integer getPosition() {
		return position;
	}

	/**
	 * Set the position inside the adatp3 file.
	 * @param position
	 */
	public void setPosition(Integer position) {
		this.position = position;
	}
	
	@Override
	public boolean equals(Object set){
		if(null!=set && set instanceof Set){
			if(set == this){
				return true;
			}
			if(!fieldsEquals(((Set)set).getFields(),this.fields) || !Arrays.equals(((Set)set).getColumnHeaders(),this.columnHeaders) || !((Set)set).getIdentifier().equals(this.identifier)){
				return false;
			}
			return true;
		}else{
			return false;
		}
	}
	
	private boolean fieldsEquals(List<Field[]> fields,List<Field[]> fields2){
		if(fields==null && fields2 ==null){
			return true;
		}
		if(fields==null || fields2==null){
			return false;
		}
		if( fields.size()!=fields2.size()){
			return false;
		}
		for(int i=0;i<fields.size();i++){
			if(!Arrays.equals(fields.get(i),fields2.get(i))){
				return false;
			}
		}
		return true;
	}

	public boolean isTabularSet() {
		return columnHeaders!=null && columnHeaders.length>0;
	}

	public void setColumnHeaders(String[] headers) {
		this.columnHeaders = new Header[headers.length];
	    for (int i = 0; i < headers.length; i++) {
	    	columnHeaders[i] = new Header(headers[i]);
		}
		
	}


}
