package org.miliconvert.xsmt.mpgt.rules;

import java.math.BigDecimal;

import mpia.meta.MetaFactory;
import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeLatitude;
import mpia.meta.TypeDataTypeLongitude;
import mpia.schema.TypeAssociationEltCtrlTypeEltCtrl;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeDictionaryDicoTypeMesureCoordinationCategorie;
import mpia.schema.TypeMesureCoordination;
import mpia.schema.TypeTypeMesureCoordination;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

/**
 * 
 * @author matthieu
 *
 */
public class AcoFieldRules extends Common3dFieldRules{

	private static String geoideGlobal;
	private static String geoideCourrant;
	private static int angle;


	/**
	 * Conversion de la quantité (FFIRN/FUD 1023_039) exprimée dans l'unité de mesure de longueur associée (FFIRN/FUD 1008_020) en une quantité exprimée en mètres.
	 */
	public static void A_Largeur(MPGTWrapperSet s, MPGTWrapperField f){
	  String value = f.getSubFields("1023_039");
	  if(value==null){
		 value =  f.getSubFields("1023_049");
	  }
		
	   f.setValue(ConversionLongeur( f.getSubFields("1008_020"),value));
	}
	

	
	/**
	 * Conversion de la quantité (FFIRN/FUD 1023_049) exprimée dans l'unité de mesure de longueur associée (FFIRN/FUD 1008_020) en une quantité exprimée en mètres.
	 * 
	 */
	public static void A_LargeurPiste(MPGTWrapperSet s, MPGTWrapperField f){
		A_Largeur(s, f);
	}
	
	/**
	 * Conversion de la quantité (FFIRN/FUD 1023/049) exprimée dans l'unité de mesure de longueur associée (FFIRN/FUD 1008_020) en une quantité exprimée en mètres.
	 */
	public static void A_Rayon(MPGTWrapperSet s, MPGTWrapperField f){
		A_LargeurPiste(s, f);
	}
	
	/**
	 * Angle = [FF 2253/008 ss zone 1] - [FF2253/007 ss zone 1]
		si Angle <0 alors Angle = Angle + 360
		conversion Angle (exprimé en degrés) en radians
		MPGT.SecteurGeometrique.LargeurAngulaire = Angle
	 */
	public static void A_Secteur(MPGTWrapperSet s, MPGTWrapperField f){
		if(softEquals(f.getFfirn(), "2253_007")){
			angle = Integer.parseInt(f.getSubFields(0));
		} else if(softEquals(f.getFfirn(), "2253_008")){
			angle = Integer.parseInt(f.getSubFields(0)) -angle;
			if(angle<0){
				angle+=360;
			}
		}
		
		f.setValue(""+angle*Math.PI/180);
		
	}
	
	/**
	 * Convertir le couple  'valeur fréquence', 'unité de mesure fréquence' en une valeur de fréquence exprimée en Hz
	 */
	public static void A_ValoriserFrequence(MPGTWrapperSet s, MPGTWrapperField f){
		//2064/001
		log("A_ValoriserFrequence");
		f.setValue(ConversionFrequence(f.getSubFields("1008_002"),f.getSubFields("1023_022")));
	}
	
	/**
	 * Conversion de la valeur de l'angle exprimée en degrés en une valeur exprimée en radians.
	 */
	public static void A_AngleDegré(MPGTWrapperSet s, MPGTWrapperField f){
		log("A_AngleDegré");
		f.setValue(""+Integer.parseInt(f.getValue())*Math.PI/180);

	}
	
	
	
	
	/**
	 *  Si alternat B zone 1 est utilisé alors :
		MPIA.TypeMesureCoordination.Categorie = 'NOS' (et renseigner MPIA.TypeMesureCoordination.AutreCategorie avec la valeur de l'alternat B de la zone 1)
	 */
	public static void  A_AutreTypeAcm(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
		if(f.getSubFields(1)!=null){
			TypeMesureCoordination mesureCoordination = (TypeMesureCoordination) s.getSetInstance();
			TypeAssociationEltCtrlTypeEltCtrl typeAssociationEltCtrlTypeEltCtrl =  (TypeAssociationEltCtrlTypeEltCtrl) engine.findOrCreateFieldEntities("AssociationEltCtrlTypeEltCtrl");
			
			mesureCoordination .getAPourTypeAssociationEltCtrlTypeEltCtrl()
				.add((TypeAssociation) engine.createAssoc(mesureCoordination, typeAssociationEltCtrlTypeEltCtrl, "AssocieCommeObjet_ElementControle", false));

			TypeTypeMesureCoordination typeMesureCoordination = (TypeTypeMesureCoordination) engine.findOrCreateFieldEntities("TypeMesureCoordination");
			typeMesureCoordination.setAutreCategorie(f.getSubFields(1));
			
			typeMesureCoordination.setCategorie(TypeDictionaryDicoTypeMesureCoordinationCategorie.NOS);
			
			
			typeAssociationEltCtrlTypeEltCtrl.setAssocieCommeTypeTypeElementControle((TypeAssociationEXT) engine.createAssoc(typeAssociationEltCtrlTypeEltCtrl, typeMesureCoordination, null, true));	
		}
		f.setSkip(true);
		
	}

	
	
	
	/**
	 * Mémoriser le GéoïdeGlobalRéférence du message
	 */
	public static void A_GéoïdeGlobalRéférence(MPGTWrapperSet s, MPGTWrapperField f){
		log("On memorise le géioide global");
		geoideGlobal = f.getValue();
	}

	/**
	 * Si FF 1195_1 = "" alors GéoïdeCourantRéférence = GéoïdeGlobalRéférence
		Sinon GéoïdeCourantRéférence = FF 1195_1
		Utiliser le GéoïdeCourantRéférence pour effectuer les calculs de correction des coordonnées dans le géoïde de référence interne (WGS84).
	*/
	public static void A_GéoïdeCourantRéférence(MPGTWrapperSet s, MPGTWrapperField f){
		geoideCourrant = f.getValue();
	}

	
	/**
	 * 
	 * @param s
	 * @param f
	 * @throws Exception
	 */
	public static void A_CorrectionCoordonnéesGéoïdeRéférence(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
			if(geoideCourrant==null){
				geoideCourrant = geoideGlobal;
			}
			
			TypeCoordonneesLatLong coordonneesLatLong = (TypeCoordonneesLatLong) engine.findOrCreateFieldEntities("CoordonneesLatLong");
			
			
			double latitude =  convLatitudeDecimal(f);
			double longitude = convLongitudeDecimal(f);
			
			
			
			 
			
				
			log("TODO corriger avec le geoide courrant : "+geoideCourrant+"  utiliser WSG84");
			
		
			
			 TypeDataTypeLatitude tlatitude = MetaFactory.eINSTANCE.createTypeDataTypeLatitude();
			  TypeDataTypeLongitude tlongitude = MetaFactory.eINSTANCE.createTypeDataTypeLongitude();
			  tlatitude.setValue(new BigDecimal(latitude));
			  tlongitude.setValue(new BigDecimal(longitude));
		  
			coordonneesLatLong.setLatitude(tlatitude);
			coordonneesLatLong.setLongitude(tlongitude);
			 
			f.setFieldInstance(coordonneesLatLong);
			f.setValue(null);
			
	}



	
	
}
