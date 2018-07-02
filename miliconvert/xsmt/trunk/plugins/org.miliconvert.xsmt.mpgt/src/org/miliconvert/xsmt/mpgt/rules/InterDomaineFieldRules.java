package org.miliconvert.xsmt.mpgt.rules;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import mpia.meta.MetaFactory;
import mpia.meta.TypeDataTypeLatitude;
import mpia.meta.TypeDataTypeLongitude;
import mpia.schema.TypeAction;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeUnite;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class InterDomaineFieldRules extends CommonFieldRules{
	/**
	 * "HO" (Hostile) ou "UNK" (Unknown) ou "SUSPCT" (Suspect) en fonction de l'état opérationnel de l'unité associé : LIGNE {ligne}
	 * @param s
	 * @param f
	 * @param mpgt
	 * @param ligne
	 * @throws Exception 
	 */
	
	public static void VI_ETAT_OP(MPGTWrapperSet s, MPGTWrapperField f,String mpgt, String ligne) throws Exception{
		TypeUnite unite = (TypeUnite) engine.getLineContext().getInstance(ligne);
		VI(s, f, mpgt, unite.getAPourComportementComportement().get(0).getComportement().getLiteral());
	}
	
	/**
	 * "HO" (Hostile) ou "UNK" (Unknown) ou "SUSPCT" (Suspect) en fonction de l'état opérationnel de l'unité associé : LIGNE {ligne}
	 * @param s
	 * @param f
	 * @param mpgt
	 * @param ligne
	 * @throws Exception 
	 */
	public static void VD_ETAT_OP(MPGTWrapperSet s, MPGTWrapperField f,String mpgt, String ligne) throws Exception{
		TypeUnite unite = (TypeUnite) engine.getLineContext().getInstance(ligne);
		VD(s, f, mpgt, unite.getAPourComportementComportement().get(0).getComportement().getLiteral());
	}
	
	/**
	 * nom entité définie aux lignes ${ligne}. 
	 * @throws Exception 

	 */
	public static void VI_NOM_ENTITE(MPGTWrapperSet s, MPGTWrapperField f,String mpgt, String ligne) throws Exception{
		TypeUnite unite = (TypeUnite) engine.getLineContext().getInstance(ligne);
		VI(s, f, mpgt, unite.getNom());
	}
	
	/**
	 * CD A_LOCATION_TYPE pour traiter la conversion des valeurs {conv} = OwnsitrepFieldRules.CD A_LOCATION_TYPE($s,$f,{conv});
	 * @param s
	 * @param f
	 */
	public static void CD_A_LOCATION_TYPE(MPGTWrapperSet s, MPGTWrapperField f,String conv){
		log("TODO");
	}
	
	/**
	 * Concaténation des {count} sous zones dans l'attribut {value} = OwnsitrepFieldRules.concatSubFields($s,$f,{count},{value}) ;
	 * @param s
	 * @param f
	 * @param conv
	 */
	public static void concatSubFields(MPGTWrapperSet s, MPGTWrapperField f,String count,String value){
		log("concatSubFields déjà réalisé");
	}
	
	
	/**
	 * Converting UTM to Latitude and Longitude

		y = northing, x = easting (relative to central meridian; subtract 500,000 from conventional UTM coordinate).
		
		Calculate the Meridional Arc
		
		This is easy: M = y/k0.
		
		Calculate Footprint Latitude
		
		mu = M/[a(1 - e2/4 - 3e4/64 - 5e6/256...)
		e1 = [1 - (1 - e2)1/2]/[1 + (1 - e2)1/2]
		footprint latitude fp = mu + J1sin(2mu) + J2sin(4mu) + J3sin(6mu) + J4sin(8mu), where:
		
		J1 = (3e1/2 - 27e13/32 ..)
		J2 = (21e12/16 - 55e14/32 ..)
		J3 = (151e13/96 ..)
		J4 = (1097e14/512 ..)
		Calculate Latitude and Longitude
		
		e'2 = (ea/b)2 = e2/(1-e2) 
		C1 = e'2cos2(fp)
		T1 = tan2(fp)
		R1 = a(1-e2)/(1-e2sin2(fp))3/2. This is the same as rho in the forward conversion formulas above, but calculated for fp instead of lat.
		N1 = a/(1-e2sin2(fp))1/2. This is the same as nu in the forward conversion formulas above, but calculated for fp instead of lat.
		D = x/(N1k0)
		lat = fp - Q1(Q2 - Q3 + Q4), where:
		
		Q1 = N1 tan(fp)/R1
		Q2 = (D2/2)
		Q3 = (5 + 3T1 + 10C1 - 4C12 -9e'2)D4/24
		Q4 = (61 + 90T1 + 298C1 +45T12  - 3C12 -252e'2)D6/720
		long = long0 + (Q5 - Q6 + Q7)/cos(fp), where:
		
		Q5 = D
		Q6 = (1 + 2T1 + C1)D3/6
		Q7 = (5 - 2C1 + 28T1 - 3C12 + 8e'2 + 24T12)D5/120
	 * @param s
	 * @param f
	 * @throws Exception
	 */
	public static void ConversionUTM(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
	 if(f.getFfirn()=="2089_020"){
	   log("TODO Convertion 1 metre");
	 } else if(f.getFfirn()=="2086_020") {
	   log("TODO Convertion 10 metre");
	 }else if(f.getFfirn()=="2087_020") {
	   log("TODO Convertion 100 metre");
	 }else if(f.getFfirn()=="2088_020") {
	   log("TODO Convertion 1000 metre");
	 }

	 

	 	double latitude =  0;
	    double longitude = 0;
//	 double utmZoneCenterLongitude = ...  // Center lon of zone, example: zone 10 = -123
//	 int zoneNumber = ...                 // zone number, example: 10
//	 double latitude, longitude = ...     // lat, lon in degrees

//	    CoordinateReferenceSystem sourceCRS = CRS.decode("EPSG:4978"); //WGS84 geocentrique
//		CoordinateReferenceSystem targetCRS = CRS.decode("EPSG:4979"); //WGS84 geographique 3D
//		System.out.println("Source CRS: " + sourceCRS.getName().getCode());
//		System.out.println("Target CRS: " + targetCRS.getName().getCode());
//
//		MathTransform mathTransform =CRS.findMathTransform( sourceCRS, targetCRS );
//		System.out.println("MT: " + mathTransform.toWKT());
//	    DirectPosition pt = new GeneralDirectPosition(4089881.3, -4874130.7, 441946.6); //x,y,z
//	    System.out.println("Input point: " + pt);
//	    pt = mathTransform.transform(pt, null);
//	    System.out.println("Output point: " + pt); //longitude,latitude,height
//
//	    
	 
	 
	   TypeCoordonneesLatLong coord = (TypeCoordonneesLatLong) engine.findOrCreateFieldEntities("CoordonneesLatLong");
	   TypeDataTypeLatitude lat = MetaFactory.eINSTANCE.createTypeDataTypeLatitude();
		lat.setValue(new BigDecimal(latitude));
		TypeDataTypeLongitude lon = MetaFactory.eINSTANCE.createTypeDataTypeLongitude();
		lon.setValue(new BigDecimal(longitude));
		coord.setLatitude(lat);
		coord.setLongitude(lon);
		
		
		
		
	   
	   f.setFieldInstance(coord);
	   f.setValue(null);
	}
	
	


	
	/*
	Si la zone vaut MAIN, alors positionner l'attribut MPGT.Action.EffortPrincipal à VRAI.
	Si la zone vaut DUMMY, alors positionner l'attribut MPGT.Action.Fictive à VRAI
	Si la zone vaut SUPPORTING : ne rien faire.
	*/

	public static void  A_ACTIVITY_QUALIFIER(MPGTWrapperSet s, MPGTWrapperField f){
			if(f.getValue()=="MAIN"){
				 TypeAction o = (TypeAction) engine.createDef(s.getSetInstance(), f.getFieldDef());
				 o.setEffortPrincipal(true);
				 f.setFieldInstance(o);
			} else if(f.getValue()=="DUMMY"){
				 TypeAction o = (TypeAction) engine.createDef(s.getSetInstance(), f.getFieldDef());
				 o.setFictive(true);
				f.setFieldInstance(o);
			}
		   
		   f.setSkip(true);
	}
	
	
	
	/*
	 * On renseigne une valeur en degrés selon la direction ordinale :
	N           0
	NE       45
	E         90
	SE     135
	S       180
	SW    225
	W      270
	NW    315
	 */
	public static void A_Direction(MPGTWrapperSet s, MPGTWrapperField f){
		Map<String,String> conv = new HashMap<String, String>();
		conv.put("N", "0");
		conv.put("NE","45");
		conv.put("E", "90");
		conv.put("SE", "135");
		conv.put("S", "180");
		conv.put("SW", "225");
		conv.put("W", "270");
		conv.put("NW", "315");
		
		f.setValue(conv.get(f.getValue()));
		log("A_Direction: "+ f.getValue() );
				
	}
	
	/**
	 * Conversion de la valeur de la vitesse exprimée en km/h en une valeur valeur exprimée en secondes
	 * @param s
	 * @param f
	 */
	public static void ConversionVitesse(MPGTWrapperSet s, MPGTWrapperField f){
		
		//1267/001
		f.setValue(ConversionVitesseMS("km/h",f.getValue()));

	}
	
	

}
