package org.miliconvert.xsmt.mpgt.rules;

import java.math.BigDecimal;

import mpia.meta.MetaFactory;
import mpia.meta.TypeDataTypeLatitude;
import mpia.meta.TypeDataTypeLongitude;
import mpia.schema.SchemaFactory;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeDictionaryDicoPrecisionAngle;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypePointGeometrique;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class NavsitsumFieldRules extends InterDomaineFieldRules{

	private static String flag;
	
	/**
	 * Mémoriser la valeur de FLAG et renseigner l'attribut MPIA.EntitePolitique.Trigramme, 
	 * pour chacune des instances de MPIA.TypeBatimentSurface décrites au niveau du groupe répétable (lignes 503 à 509). 
	 * Vérifier que si une entité de bâtiment de même nom existe déjà, ce bâtiment a le même pavillon.
	 * @param s
	 * @param f
	 * @throws Exception
	 */
	public static void A_ShipsTypeFlag(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
		flag = f.getValue();
		log("A_ShipsTypeFlag");
	}
	
	/**
	 * Mémoriser la valeur de FLAG et renseigner l'attribut MPIA.EntitePolitique.Trigramme, 
	 * pour chacune des instances de MPIA.Batiment décrites au niveau du groupe répétable (lignes 45 à 51) 
	 * @param s
	 * @param f
	 * @throws Exception
	 */
	public static void A_ShipsFlag(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
		flag = f.getValue();
		log("A_ShipsFlag");
	}
	
	
	/**
	 * 
	 * @param s
	 * @param f
	 * @throws Exception
	 * Cas des alternats A, B, C : on localise directement le bâtiment
	   Cas de l'alternat D : on crée (si elle n'existe pas) une instance d'un site de mouillage dont le nom est égal au contenu de la zone PLACE NAME. 
	   On crée un association instance objet - instance objet (matériel - site de catégorie "Is situed in").
	   Cas des= 'alternats E, F : non analysé.
	 */
	public static void A_LocalisationBatiment(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
		log("A_LocalisationBatiment");
		
	}
		

	/**
	 * Convertir la quantité exprimée en Knots en une quantité exprimée en m/s
	 * @param s
	 * @param f
	 * @throws Exception
	 */
	public static void A_ConversionVitesseKnots(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
		//1061/004
		f.setValue(ConversionVitesseMS("knots", f.getValue()));
		
	}
	
	
	/**
	 * Vérification de la checksum
	 * @param s
	 * @param f
	 * @throws Exception
	 */
	public static void VerifCheckSum(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
		log("VerifCheckSum");
	}
	
	/**
	 * Conversion la valeur de LAT/LONG en une valeur exprimée en degré décimal
	 * (dd + mm/60 +ss/3600) to Decimal degrees (dd.ff)

		dd = whole degrees, mm = minutes, ss = seconds
		
		dd.ff = dd + mm/60 + ss/3600
		
		Example: 30 degrees 15 minutes 22 seconds = 30 + 15/60 + 22/3600 = 30.2561
	 * @param s
	 * @param f
	 * @throws Exception
	 */

	
	public static void ConvLatLonToDecimalDegree(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
		log("ConvLatLonToDecimalDegree");
		
		//2042/001
		//2043/001
		//2044/001
		TypeLocalisationGeometrique2D localisationGeometrique2D = (TypeLocalisationGeometrique2D) engine.findOrCreateFieldEntities("LocalisationGeometrique2D");
		TypePointGeometrique pointGeometrique = (TypePointGeometrique) engine.findOrCreateFieldEntities("PointGeometrique");
		TypeCoordonneesLatLong coordonneesLatLong = SchemaFactory.eINSTANCE.createTypeCoordonneesLatLong();
		TypeDataTypeLatitude latitude = MetaFactory.eINSTANCE.createTypeDataTypeLatitude();
		TypeDataTypeLongitude longitude = MetaFactory.eINSTANCE.createTypeDataTypeLongitude();
		latitude.setValue(new BigDecimal(convLatitudeDecimal(f)));
		longitude.setValue(new BigDecimal(convLongitudeDecimal(f)));
		//2023_001 en minute
		
		coordonneesLatLong.setPrecisionLatitude(TypeDictionaryDicoPrecisionAngle.DEGREE);
		coordonneesLatLong.setPrecisionLongitude(TypeDictionaryDicoPrecisionAngle.DEGREE);
		
		if("2043_001".equals(f.getFfirn()) || "2044_001".equals(f.getFfirn()) ){
			coordonneesLatLong.setPrecisionLatitude(TypeDictionaryDicoPrecisionAngle.MINUTE);
			coordonneesLatLong.setPrecisionLongitude(TypeDictionaryDicoPrecisionAngle.MINUTE);
		}

		if("2044_001".equals(f.getFfirn())){
			coordonneesLatLong.setPrecisionLatitude(TypeDictionaryDicoPrecisionAngle.SECOND);
			coordonneesLatLong.setPrecisionLongitude(TypeDictionaryDicoPrecisionAngle.SECOND);
     	}
		coordonneesLatLong.setLatitude(latitude);
		coordonneesLatLong.setLongitude(longitude);
		
		localisationGeometrique2D.setAPourObjetGeometriqueObjetGeometrique(pointGeometrique);
		pointGeometrique.setEstLocaliseParCoordonneesLatLong(coordonneesLatLong);
		
		f.setFieldInstance(localisationGeometrique2D);
		f.setValue(null);
		
	}
	

	
}
