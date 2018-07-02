package org.miliconvert.xsmt.mpgt.rules;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import mpia.meta.MetaFactory;
import mpia.schema.SchemaFactory;
import mpia.schema.TypeEtatOperationnel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.miliconvert.xsmt.mpgt.MPGTDictionaryService;
import org.miliconvert.xsmt.mpgt.MPGTEngine;
import org.miliconvert.xsmt.mpgt.MPGTUtils;
import org.miliconvert.xsmt.mpgt.SetsUtils;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class CommonRules {

	protected static Log logger = LogFactory.getLog(CommonRules.class);
	protected static MPGTEngine engine = MPGTEngine.getInstance(); 
	protected static MPGTDictionaryService dictionaryService= MPGTDictionaryService.getInstance();
	
	
	protected static boolean softEquals(String org, String dest) {
		return org.replaceAll(" ", "").replaceAll("\n", "").trim()
				.equalsIgnoreCase(dest.replaceAll(" ", "").replaceAll("\n", ""));
	}
	
	public static void log(String message){
		logger.info(message);
	}
	
	



	protected static String CD(String value, String key,String ffirn, String mpgt){
	  return dictionaryService.convertAD3ToMPGTFromRule(key, ffirn, mpgt,value);
			
	  
	}
	


	private static Map<String,Integer>  months = new HashMap<String, Integer>();
		
	
	static {
		
		months.put("JAN",Calendar.JANUARY);
		months.put("FEB",Calendar.FEBRUARY);
		months.put("MAR",Calendar.MARCH);
		months.put("APR",Calendar.APRIL);
	    months.put("MAY",Calendar.MAY);
		months.put("JUN",Calendar.JUNE);
		months.put("JUL",Calendar.JULY);
		months.put("AUG",Calendar.AUGUST);
		months.put("SEP",Calendar.SEPTEMBER);
		months.put("OCT",Calendar.OCTOBER);
		months.put("NOV",Calendar.NOVEMBER);
	    months.put("DEC",Calendar.DECEMBER);
		
	}
	


	public static void A_GdhFormatAn(MPGTWrapperSet s, MPGTWrapperField f) throws ParseException{

			log("Converting " + f.getValue() + " in " + " YYYY-MM-DDThh:mm:ss " );

			
			Calendar cal = Calendar.getInstance();
			cal.setTimeZone( Ad3TimeZone.getTimeZone(f.getSubFields("1003_001")));
			cal.set(Calendar.YEAR, Integer.parseInt(f.getSubFields("1005_007")));
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(f.getSubFields("1000_001")));
			cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(f.getSubFields("1001_001")));
			cal.set(Calendar.MINUTE, Integer.parseInt(f.getSubFields("1002_001")));
			cal.set(Calendar.SECOND, 0);
			cal.set(Calendar.MONTH, months.get(f.getSubFields("1004_001").trim()));
			
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		    f.setValue(format.format(cal.getTime()));
		}


	public static void A_GdhFormatJour( MPGTWrapperSet s, MPGTWrapperField f){
			log("Converting " + f.getValue() + " in " + " YYYY-MM-DDThh:mm:ss " );
		
			Calendar cal = Calendar.getInstance();
			cal.setTimeZone( Ad3TimeZone.getTimeZone(f.getSubFields("1003_001")));
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(f.getSubFields("1000_001")));
			cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(f.getSubFields("1001_001")));
			cal.set(Calendar.MINUTE, Integer.parseInt(f.getSubFields("1002_001")));
			cal.set(Calendar.SECOND, 0);
			
		    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		    f.setValue(format.format(cal.getTime()));
	}



	public static void A_GdhFormatMois(MPGTWrapperSet s, MPGTWrapperField f) throws ParseException{
			 log("Converting " + f.getValue() + " in " + " YYYY-MM-DDThh:mm:ss " );

			
			Calendar cal = Calendar.getInstance();
			cal.setTimeZone( Ad3TimeZone.getTimeZone(f.getSubFields("1003_001")));
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(f.getSubFields("1000_001")));
			cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(f.getSubFields("1001_001")));
			cal.set(Calendar.MINUTE, Integer.parseInt(f.getSubFields("1002_001")));
			cal.set(Calendar.SECOND, 0);
			cal.set(Calendar.MONTH, months.get(f.getSubFields("1004_001").trim()));
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		    f.setValue(format.format(cal.getTime()));
	}

	/*
	Le format du Gdh en final est de la forme YYYY-MM-DDThh:mm:ss où 
	YYYY = année courante 
	MM = conversion du FF 1004_1 "nom du mois" en "numéro du mois"
	DD = FF 1000_1
	hh = 00
	mm = 00
	ss = 00
	*/
	public static void A_GdhFormatJourDuMois(MPGTWrapperSet s, MPGTWrapperField f) throws ParseException{
		log("Converting " + f.getValue() + " in " + " YYYY-MM-DDThh:mm:ss " );
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(f.getSubFields("1000_001")));
			cal.set(Calendar.HOUR_OF_DAY, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			cal.set(Calendar.MONTH, months.get(f.getSubFields("1004_001").trim()));
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		    f.setValue(format.format(cal.getTime()));

	}
	
   public static void VI(MPGTWrapperSet s, MPGTWrapperField f, String mpgt, String value) throws Exception {
		
		log("VI: "+mpgt+ " to "+value);
//		EObject entite = s.getSetInstance();
//		
//		MPGTFieldDef fieldDef = new MPGTFieldDef();
//		if(f!=null){
//			fieldDef = f.getFieldDef();
//		} else {
//			fieldDef.setCurrInstance(s.getInstanceType());
//		}
//		
//		fieldDef.setDef(mpgt);
//		
//		
//		engine.createDef(entite, fieldDef,value); 
		
		try {
		
			if(!MPGTUtils.isAttribute(mpgt)){
				mpgt = MPGTUtils.extractAttribute(mpgt);
			}
			
			EObject entite = engine.findOrCreateFieldEntities(MPGTUtils.getTypeFromAttributeMega(mpgt));
			engine.appendAttribute(entite, MPGTUtils.getXMLNameFromMegaAttributeOrEntity(mpgt), value );
		
		} catch (Exception e) {
		 logger.error("ERROR dans VI: "+mpgt+ " to "+value);
		}
	}
   


	public static void VD(MPGTWrapperSet s, MPGTWrapperField f, String mpgt, String value) throws Exception{
		log("VD: "+mpgt+ " to "+value);
		
		try {
				
			if(!MPGTUtils.isAttribute(mpgt)){
				mpgt = MPGTUtils.extractAttribute(mpgt);
			}
			
			EObject entite = engine.findOrCreateFieldEntities(MPGTUtils.getTypeFromAttributeMega(mpgt));
			
			 EAttribute attribute = MPGTUtils.find(entite.eClass(), MPGTUtils.getXMLNameFromMegaAttributeOrEntity(mpgt));
			   if(attribute!=null &&! entite.eIsSet(attribute)){
				
				   try {
					   entite.eSet(attribute, MetaFactory.eINSTANCE.createFromString(attribute.getEAttributeType(), value));
						return;
					} catch (IllegalArgumentException e) {
						entite.eSet(attribute, SchemaFactory.eINSTANCE.createFromString(attribute.getEAttributeType(), value));
						return;
					}
			   }
			   
		
			log("VD déjà présente ou champ non existant : "+mpgt); 
		
		
		} catch (Exception e) {
		 logger.error("ERROR dans VD: "+mpgt+ " to "+value);
		}
	}
   
   
   public static boolean VC(MPGTWrapperSet s, String fieldName, String value) throws Exception {
		fieldName = SetsUtils.getXmlElementName(fieldName);
	    for(MPGTWrapperField f: s.getFields()){
	    	log("On compare: "+f.getName()+" avec "+fieldName );
	    	if(softEquals(fieldName,f.getName())){
	    		if(softEquals(value,fieldName)){
	    			return true;
	    		} else {
	    			break;
	    		}
	    	}
	    }
	    log("VC non satifait, on saute le set");
	    s.setSetInstance(null); 
	    s.setSkip(true);
	    return false;
	   
	}


	protected static void halt(MPGTWrapperSet s,String ruleName) {
		 log("On stop  pour :"+s.getSetId()+" condition non satisfaite: "+ruleName);
		 s.setSetInstance(null); 
		 s.setSkip(true);
	}
	
}
