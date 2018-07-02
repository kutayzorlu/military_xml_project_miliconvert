package org.miliconvert.xsmt.mpgt.rules;

import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author matthieu
 *
 */
public class Ad3TimeZone {
	
	private static Log logger = LogFactory.getLog(Ad3TimeZone.class);
	
	
	private static Map<String,String> dico = new HashMap<String, String>();
	
	static {
		dico.put("A","GMT+01:00");
		dico.put("B","GMT+02:00");
		dico.put("C","GMT+03:00");
		dico.put("D","GMT+04:00");
		dico.put("E","GMT+05:00");
		dico.put("F","GMT+06:00");
		dico.put("G","GMT+07:00");
		dico.put("H","GMT+08:00");
		dico.put("I","GMT+09:00");
		dico.put("K","GMT+10:00");
		dico.put("L","GMT+11:00");
		dico.put("M","GMT+12:00");
		dico.put("Y","GMT-12:00");
		dico.put("X","GMT-11:00");
		dico.put("W","GMT-10:00");
		dico.put("V","GMT-09:00");
		dico.put("U","GMT-08:00");
		dico.put("T","GMT-07:00");
		dico.put("S","GMT-06:00");
		dico.put("R","GMT-05:00");
		dico.put("Q","GMT-04:00");
		dico.put("P","GMT-03:00");
		dico.put("O","GMT-02:00");
		dico.put("N","GMT-01:00");
		dico.put("Z","GMT+00:00");
		
	}
	
	public static TimeZone getTimeZone(String key) {
		if(key!=null && dico.containsKey(key.trim())){
			return TimeZone.getTimeZone(dico.get(key.trim()));
		}
		logger.error("Impossible de trouver une timezone pour "+key);
		return TimeZone.getDefault();
	}
	
	
}
