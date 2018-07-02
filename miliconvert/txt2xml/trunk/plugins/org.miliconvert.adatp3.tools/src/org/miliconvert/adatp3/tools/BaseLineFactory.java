package org.miliconvert.adatp3.tools;

import org.miliconvert.adatp3.tools.impl.bl11.HTMLBL11Extractor;
import org.miliconvert.adatp3.tools.impl.bl11.SetsBL11Extractor;
import org.miliconvert.adatp3.tools.impl.bl12.HTMLBL12Extractor;
import org.miliconvert.adatp3.tools.impl.bl12.SetsBL12Extractor;
import org.miliconvert.adatp3.tools.impl.bl13.HTMLBL13Extractor;
import org.miliconvert.adatp3.tools.impl.bl13.SetsBL13Extractor;

public class BaseLineFactory {

	public static IHTMLExtractor getExtractor(String optionValue, IOpenable openable) {
		if(optionValue!=null){
			if(optionValue.equals("bl12")){
				return new HTMLBL12Extractor(openable);
			} else if(optionValue.equals("bl13")){
				return new HTMLBL13Extractor(openable);
			}
		}
		return new HTMLBL11Extractor(openable);
	}
	
	
	public static IHTMLExtractor getSetExtractor(String optionValue, IOpenable openable) {
		if(optionValue!=null){
			if(optionValue.equals("bl12")){
				return new SetsBL12Extractor(openable);
			} else if(optionValue.equals("bl13")){
				return new SetsBL13Extractor(openable);
			}
		}
		return new SetsBL11Extractor(openable);
	}

}
