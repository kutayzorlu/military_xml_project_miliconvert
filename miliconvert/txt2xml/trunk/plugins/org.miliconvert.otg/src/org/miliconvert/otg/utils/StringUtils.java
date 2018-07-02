package org.miliconvert.otg.utils;

public class StringUtils {

	
	public static String formatNCName(String formatName) {
		if(formatName!=null && formatName.trim().length()>0){
			formatName =  formatName.trim().replaceAll("[ :]", "_").replaceAll("[\\.!?%\\/|]", "").toLowerCase();
			
			if(Character.isDigit(formatName.charAt(0))){
				formatName = "_"+formatName;
			}
			return formatName;
		}
		return "null-error";
	}

	
}
