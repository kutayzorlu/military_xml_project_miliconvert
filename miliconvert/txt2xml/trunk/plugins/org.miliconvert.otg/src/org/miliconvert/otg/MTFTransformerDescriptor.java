package org.miliconvert.otg;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.ITransformerDescriptor;
import org.miliconvert.txt2xml.transform.ITransformer.TransformerType;

public class MTFTransformerDescriptor implements ITransformerDescriptor {

	private String mtfFormat;
	private TransformerType type;
	
	
	
	
	public MTFTransformerDescriptor(String mtfFormat, TransformerType type) {
		super();
		this.mtfFormat = mtfFormat;
		this.type = type;
	}




	@Override
	public ITransformer createInstance() {
		return new OTGTransformer(mtfFormat,type);
	}

}
