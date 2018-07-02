package org.miliconvert.adatp3.bl11;

import org.miliconvert.adatp3.Adatp3ToXmlTransformer;

/**
 * 
 * @author matthieu
 *
 */
public class BL11ToXmlTransformer extends Adatp3ToXmlTransformer {

	private BL11Flavour flavour; 
	
	public BL11ToXmlTransformer(BL11Flavour flavour) {
		super(flavour);
		
		this.flavour = flavour;
	}

	public BL11Flavour getFlavour() {
		return flavour;
	}

}
