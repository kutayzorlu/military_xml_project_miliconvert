package org.miliconvert.adatp3.xml;

import org.miliconvert.adatp3.IAdapt3Flavour;
import org.miliconvert.adatp3.xml.impl.HibernateSetValidator;

public class SetValidatorFactory {

	private static  SetValidatorFactory instance = new SetValidatorFactory();
	
	public static SetValidatorFactory getInstance(){
		
		return instance;
	}
	
	
	public ISetValidator loadValidator(IAdapt3Flavour flavour) {
		
		return new HibernateSetValidator(flavour);
	}

}
