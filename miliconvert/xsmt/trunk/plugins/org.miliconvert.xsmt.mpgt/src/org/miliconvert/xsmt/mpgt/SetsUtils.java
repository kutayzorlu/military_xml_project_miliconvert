package org.miliconvert.xsmt.mpgt;

import java.util.ArrayList;

public class SetsUtils {


	public static String getXmlElementName(String setFormatName) {
		
		
		if(setFormatName.length()>0 &&  Character.isDigit(setFormatName.charAt(0))){
			setFormatName+="n_";
		}
		
		return setFormatName.trim().replace("(NU) ", "").replace(" ", "_")
		.replace("(", "").replace(")", "").replace("-", "_").replace(
				"/", "_").replace("'", "").replace(",", "").replace("=", "equals")
				.replace("&", "and")
				.replace(".", "_")
				.replace("+", "_")
				.replace(":", "_")
		.toLowerCase();
		
	}

	
	public static String[] safeSplit(String s, char sep) {
		ArrayList<String> al = new ArrayList<String>(25);
		StringBuffer cur = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == sep) {
				al.add(cur.toString().trim());
				cur = new StringBuffer();
			} else {
				cur.append(s.charAt(i));
			}
		}
		al.add(cur.toString().trim());

		String[] ret = al.toArray(new String[al.size()]);
		return ret;
	}
}
