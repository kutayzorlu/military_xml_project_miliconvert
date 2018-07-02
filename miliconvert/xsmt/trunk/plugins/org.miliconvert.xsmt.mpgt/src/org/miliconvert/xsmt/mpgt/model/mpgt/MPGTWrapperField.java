package org.miliconvert.xsmt.mpgt.model.mpgt;

import org.eclipse.emf.ecore.EObject;
import org.miliconvert.xsmt.mpgt.model.Adatp3Field;

/**
 * 
 * @author matthieu
 *
 */
public class MPGTWrapperField  extends Adatp3Field {


	private boolean skip;
	private EObject fieldInstance = null;
	private MPGTFieldDef fieldDef;
	private String ffPos;
	private int currentAlternative = 0;
	


	public MPGTWrapperField(Adatp3Field field,MPGTFieldDef fieldDef, String ffPos, int currentAlternative) {
		super(field);
		this.ffPos = ffPos;
		this.fieldDef = fieldDef;
		this.currentAlternative = currentAlternative;
	}


	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}



	public EObject getFieldInstance() {
		return fieldInstance;
	}

	public void setFieldInstance(EObject fieldInstance) {
		this.fieldInstance = fieldInstance;
	}


	public MPGTFieldDef getFieldDef() {
		return fieldDef;
	}


	public void setFieldDef(MPGTFieldDef fieldDef) {
		this.fieldDef = fieldDef;
	}


	public String getFfPos() {
		return ffPos;
	}


	public void setFfPos(String ffPos) {
		this.ffPos = ffPos;
	}


	public int getCurrentAlternative() {
		return currentAlternative;
	}


	public void setCurrentAlternative(int currentAlternative) {
		this.currentAlternative = currentAlternative;
	}
	
	
	
	
}
