package org.miliconvert.xsmt.mpgt.rules;

import org.eclipse.emf.ecore.EObject;
import org.miliconvert.xsmt.mpgt.MPGTUtils;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTFieldDef;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;


public class CommonFieldRules  extends CommonRules {


	
	
	protected static String ConversionVitesseMS(String unit, String value){
		
		double v = Double.parseDouble(value);
		if(softEquals("km/h", unit)){
			log("On converti km/h en m/s");
			v = v*1000/60;
		}
		else if(softEquals("knots",unit)){
			log("On converti knot en m/s");
			v = v*0.514444444;
		}
		
		return ""+v;
		
	}
	
	
	
	

	
	
	
	protected static String ConversionLongeur(String unit, String value){
		log(unit+" "+value);
		/*008 	
		UNIT OF LINEAR MEASUREMENT, FT, KF, YD, SM, NM, M, HM, KM
		( 1-2 A )
			
		UNIT OF LINEAR MEASUREMENT, FEET, KILOFEET, YARDS, STATUTE MILES, NAUTICAL MILES, METRES, HECTOMETRES, AND KILOMETRES.*/
		double length = Double.parseDouble(value);
		
		if(softEquals("FT", unit)){
			log("On converti feet en metre");
			length = (length)* 0.3048;
		} else if(softEquals("KT", unit)){
			log("On converti kilo feet en metre");
			length = (length)* 3048;
		}else if(softEquals("YD", unit)){
			log("On converti yard en metre");
			length = (length)* 0.9144;
		}else if(softEquals("SM", unit)){
			log("On converti STATUTE MILES en metre");
			length = (length)* 1609.34;
		}else if(softEquals("NM", unit)){
			log("On converti NAUTICAL MILES en metre");
			length = (length)* 1852;
		}else if(softEquals("HM", unit)){
			log("On converti NAUTICAL HECTOMETRES en metre");
			length = (length)*100;
		}else if(softEquals("KM", unit)){
			log("On converti KILOMETRES en metre");
			length = (length)*1000;
		} else {
			log("Conversion impossible: "+unit);
		}
		
		return ""+length;
	
		
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public static double convLongitudeDecimal(MPGTWrapperField f) {
		double lonDeg = Double.parseDouble(f.getSubFields("1040_001"));
		
		if(f.getSubFields("1041_003")!=null ){
			lonDeg += Integer.parseInt(f.getSubFields("1041_003"))/60;
		}

		if(f.getSubFields("1042_003")!=null){
			lonDeg += Integer.parseInt(f.getSubFields("1042_003"))/3600;
     	}
		return lonDeg;
	}


	/**
	 * 
	 * @param f
	 * @return
	 */
	public static double convLatitudeDecimal(MPGTWrapperField f) {
		double latDeg = Double.parseDouble(f.getSubFields("1039_001"));
		
		
		if(f.getSubFields("1041_002")!=null){
			latDeg += Integer.parseInt(f.getSubFields("1041_002"))/60;
		}

		if(f.getSubFields("1042_002")!=null){
			latDeg += Integer.parseInt(f.getSubFields("1042_002"))/3600;
     	}
		
		return latDeg;
	}
	
	
	
	/**
	 * Conversion en une valeur de fréquence exprimée en Hz
	 * @param unit
	 * @param value
	 * @return
	 */
	protected static String ConversionFrequence(String unit, String value){
		/*002 	
		UNIT OF ELECTROMAGNETIC EMISSION MEASUREMENT
		( 2-3 A )*/
		double freq = Double.parseDouble(value);
		if(softEquals("MHZ", unit)){
			log("On converti MHz en hz");
			freq = (freq)*10000;
		} else if(!softEquals("HZ", unit))  {
			log("Conversion impossible: "+unit);
		}
		
		return ""+freq;
	}
	
	
	
	public static void IF(MPGTWrapperSet s, MPGTWrapperField f, String cond,String value){
		log("TODO: IF :"+cond);
	}
	

	
	
	
	
	public static void CD(MPGTWrapperSet s, MPGTWrapperField f, String key){
	  log("CD : "+key);
	  String ffirn = f.getFfirn();
		if(f.getValue()!=null){
			  EObject o = engine.createDef(s.getSetInstance(),f.getFieldDef());
			  if(o!=null){
				  f.setFieldInstance(o);
				  f.setValue(dictionaryService.convertAD3ToMPGTFromRule(key, ffirn, MPGTUtils.findAttributeType(o, f.getFieldDef()) ,f.getValue()));
			  } else {
				  System.err.println("Ne peut instancier");
			  }
		} else {
			log("WARN: null value for field");
		}
	  
	}
	

	public static void NANA(MPGTWrapperSet s, MPGTWrapperField f){
		log("NANA");
		f.setSkip(true);
	}
	
	
	public static void LIGNE(MPGTWrapperSet s, MPGTWrapperField f, String input){
		f.setFieldInstance(engine.getLineContext().getInstance(input));
	}
	
	
	public static void VI_LIGNE(MPGTWrapperSet s, MPGTWrapperField f,String mpgt, String ligne) throws Exception {
		
		log("VI LIGNE: "+mpgt+ " to "+ligne);

		MPGTFieldDef fieldDef = new MPGTFieldDef();
		if(f!=null){
			fieldDef = f.getFieldDef();
		} else {
			fieldDef.setCurrInstance(s.getInstanceType());
		}
		
		fieldDef.setDef(mpgt);
		
		
		EObject entite = engine.createDef(s.getSetInstance(), fieldDef);
		engine.appendAttribute(entite,entite.eClass(), MPGTUtils.getXMLNameFromMegaAttributeOrEntity(mpgt), engine.getLineContext().getInstance(ligne) );

		
		
	}
   
	
}
