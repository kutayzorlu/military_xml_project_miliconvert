package org.miliconvert.adatp3.common.formlets;

/**
 * Object representation of FORMETS field
 * 
 * @author tom
 *
 */
public class Field implements IStructuralComponent {
	
	private String value;
	private String descriptor;
	private String label;
	private String header;
	private String justify;
	private int size = 0;
	private boolean isFreeText = false;

	public Field(String descriptor, String value) {
		super();
		this.descriptor = descriptor;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	

	
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public boolean equals(Object field){
		if(null!=field && field instanceof Field){
			if(field == this || ((Field)field).getValue().equals(this.value)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

	public String getJustify() {
		return justify;
	}

	public void setJustify(String justify) {
		this.justify = justify;
	}

	public boolean isFreeText() {
		return isFreeText;
	}

	public void setFreeText(boolean isFreeText) {
		this.isFreeText = isFreeText;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	
	

}
