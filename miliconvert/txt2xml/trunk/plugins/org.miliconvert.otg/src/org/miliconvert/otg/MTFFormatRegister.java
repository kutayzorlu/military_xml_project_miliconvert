package org.miliconvert.otg;

import java.util.ArrayList;
import java.util.List;

/**
 * Supported OTG message formats
 * 
 * @author matthieu
 * 
 */
public class MTFFormatRegister {

	public static String CONTACT_REPORT_FORMAT = "contactreport";
	public static String OPNOTE_FORMAT = "opnote";
	public static String FOURWHISKY_FORMAT = "fourwhisky";
	
	public static List<String> registeredFormats = new ArrayList<String>();
	static{
		
		registeredFormats.add(CONTACT_REPORT_FORMAT);
		registeredFormats.add(OPNOTE_FORMAT);
		registeredFormats.add(FOURWHISKY_FORMAT);
	}
	
	
	public static List<String> getRegisteredFormats() {
		return registeredFormats;
	}
	
	
	
	/*CONTACT, FOTC , GRIDFLD, GROUP,
	JUNIT, OPNOTE, OVLY2, OVLY3, PYMTRACK,
	PING, RECON, ROTHRSREQ,
	ROTHRSTAT, ROTHRTASK, SATELLITE,
	SCRNKILO, FOURWHISKY, WEX, XCTC
	*/

	
	
	
	
	
}
