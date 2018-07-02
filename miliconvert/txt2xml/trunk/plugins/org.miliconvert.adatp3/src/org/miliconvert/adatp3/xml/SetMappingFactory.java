package org.miliconvert.adatp3.xml;

import org.miliconvert.adatp3.IAdapt3Flavour;
import org.miliconvert.adatp3.xml.impl.HibernateSetMapping;

public class SetMappingFactory {

	private static  SetMappingFactory instance = new SetMappingFactory();
	
	public static SetMappingFactory getInstance(){
		return instance;
	}
	
	
	public ISetMapping loadValidator(IAdapt3Flavour flavour) {
		
		return new HibernateSetMapping(flavour);
	}

}
