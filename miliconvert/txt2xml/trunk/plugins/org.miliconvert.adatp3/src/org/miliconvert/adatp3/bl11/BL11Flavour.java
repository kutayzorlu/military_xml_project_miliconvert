package org.miliconvert.adatp3.bl11;

import org.miliconvert.adatp3.IAdapt3Flavour;
import org.miliconvert.adatp3.hibernate.BaselineConstants;

/**
 * Supported Adatp3 message formats
 * 
 * @author matthieu
 * 
 */
public class BL11Flavour implements IAdapt3Flavour {

	private String shortName;
	private String fullName;


	public BL11Flavour(String shortName, String fullName) {
		this.shortName = shortName;
		this.fullName = fullName;
	}

	@Override
	public String getPath() {
		return "mappings/bl11/"+shortName+":"+fullName+".mapping";
	}

	public String getShortName() {
		return shortName;
	}

	public String getFullName() {
		return fullName;
	}


	public String getXsdFileName() {
		return shortName+".xsd";
	}
	

	public String getSampleFileName() {
		return shortName+":"+fullName+".adatp3";
	}

	@Override
	public String getBaseline() {
		return BaselineConstants.BL11;
	}

	
	
}
