package org.miliconvert.adatp3.bl12;

import org.miliconvert.adatp3.Adatp3ToXmlTransformer;

/**
 * 
 * @author matthieu
 *
 */
public class BL12ToXmlTransformer extends Adatp3ToXmlTransformer {

	private BL12Flavour flavour; 
	
	public BL12ToXmlTransformer(BL12Flavour flavour) {
		super(flavour);
		
		this.flavour = flavour;
	}

	public BL12Flavour getFlavour() {
		return flavour;
	}

}
