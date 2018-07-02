package org.miliconvert.xsmt.mpgt.rules;

import java.lang.reflect.Method;

import mpia.schema.SchemaFactory;
import mpia.schema.TypeComportement;
import mpia.schema.TypeDictionaryDicoComportement;
import mpia.schema.TypeEntiteOrganisationnelle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.miliconvert.xsmt.mpgt.MPGTUtils;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class InterDomaineSetRules extends CommonSetRules {

	/*
	L'entité produite par l'analyse d'un set ORGID peut être une Unité ou une Structure organisée :
	- si la zone 9 utilise l'Alternat B (CIVILIAN AGENCY CODE), l'entité à produire est une Structure organisée
	- sinon, on applique la règle A_UNITSIZEINDICATOR à la valeur de la zone 2 pour déterminer si l'entité à produire est une unité soit associée à un type d'unité soit à un type de regroupement de force.

	La valorisation effective de l'entité créée avec les données du set est décrite par les règles :
	- A_SET_ORGID_UnitéTypeUnité,
	- A_SET_ORGID_UnitéTypeDeRegroupementForce, 
	- A_SET_ORGID_StructureOrganisée.
	*/

	public static void A_SET_ORGID(MPGTWrapperSet s) throws Exception{
	 	if(s.getField("9B")!=null){
	 	  log("Change l'alternative à Structure Organisée");
	  	  s.updateAlternative(2);
	 	} else {
	 		A_UNITSIZEINDICATOR(s);
	 	}
	 	
	 	
	 	/*
	 	Si la zone 1 du set est vide, on génère un nom automatique pour l'entité à produire ; sinon, on teste s'il existe déjà une unité ou une structure organisée de même clé opérationnelle  :
		- si oui, on récupère l'entité existante sans la valoriser avec les données du set.
		- si non, on la crée et on la valorise avec les données du set.
	 	 */
	 
		 	String name = MPGTUtils.getXMLNameFromMegaAttributeOrEntity(s.getInstanceType());
		 	Method createMethod  = SchemaFactory.class.getMethod("createType"+name, null);
			EObject tmp = (EObject) createMethod.invoke(SchemaFactory.eINSTANCE, null);		
			s.setEclass(tmp.eClass());
		
		 	
		 	if(s.getField("1")==null || s.getField("1").getValue().trim().length()<1){
					tmp.eSet(MPGTUtils.find(tmp.eClass(),"operational_key"), EcoreUtil.generateUUID());
					s.setSetInstance(tmp);
		 	} else {
	
					String value = s.getField("1").getValue();
					
					if(engine.findEntities(name,value)!=null ){
							log("Entite ORGID déjà existante avec comme racine Opérationel: "+ value);
							s.setSetInstance(engine.findEntities(name,value));
							s.setSkip(true);
	
					} else {
						s.setSetInstance(tmp);
					}
			
		 	}
	}
	
	

	
	/*
	Les zones 2,3,4,5,6,7,8,9 sont des zones composites dont la 2eme sous-zone contient un indicateur de validité (FFIRN/FUDN 1233/001).
	Ces indicateurs ne sont pas traités en analyse.

	Appliquer la règle A_UNITSIZEINDICATOR à la sous zone 1 de la zone 2 pour déterminer si le set décrit une entité MPIA.Unite associée soit à un type "type d'unité" soit à un type "regroupement de force".

	Récupérer le nom de l'entité :
	- valeur de la zone 1 si elle est renseignée,
	- sinon, valeur de la sous-zone 10.2 ("UNIDENTIFIED ADDRESSING NUMBER" pour l'alternat A et "UNKNOWN ADDRESSING NUMBER" pour l'alternat B).
	Afficher un message d'erreur si aucune de ces 2 valeurs n'est renseignée.

	Récupérer la valeur de la nationalité donnée dans la sous-zone 3.1 du set EORGID.


	Positionner le Comportement de l'entité créée en appliquant :
	- la Règle A_Comportement_Unite si la zone 1 est renseignée,
	- la règle A_Unidentified_Suspect si la zone 10 est renseignée.
	*/

	public static void A_SET_EORGID(MPGTWrapperSet s) throws Exception{
		//ON choisit l'alternative
		A_UNITSIZEINDICATOR(s);
		
		/*Récupérer le nom de l'entité :
		- valeur de la zone 1 si elle est renseignée,
		- sinon, valeur de la sous-zone 10.2 ("UNIDENTIFIED ADDRESSING NUMBER" pour l'alternat A et "UNKNOWN ADDRESSING NUMBER" pour l'alternat B).
		Afficher un message d'erreur si aucune de ces 2 valeurs n'est renseignée.
		 */
		String value = null;
		if(s.getField("1")==null || s.getField("1").getValue().trim().length()<1){
		  if(s.getField("10A")!=null){
			  value = s.getField("10A").getSubFields(1);
		  } else if(s.getField("10B")!=null) {
			  value = s.getField("10B").getSubFields(1);
		  } else {
			  s.setSkip(true);
			  log("Impossible de trouver la racine op du set EORGID");
		  }
			
		} else {
			value = s.getField("1").getValue();
			s.getField("1").setSkip(true);
		}
		
		/*Tester s'il existe déjà une entité MPIA.Unite ayant le nom donné dans le set :
		- si oui, on récupère l'entité déjà existante sans la valoriser avec les données du set,
		- si non, on crée l'entité  MPIA.Unite et on la valorise suivant la règle correspondante :
		  - A_SET_EORGID_UnitéTypeUnité,
		  - A_SET_EORGID_UnitéTypeDeRegroupementForce,  */
		if(value!=null){
			String name = MPGTUtils.getXMLNameFromMegaAttributeOrEntity(s.getInstanceType());
			Method createMethod  = SchemaFactory.class.getMethod("createType"+name, null);
			EObject tmp = (EObject) createMethod.invoke(SchemaFactory.eINSTANCE, null);	
			s.setEclass(tmp.eClass());
			if(engine.findEntities(name,value)!=null ){
				s.setSetInstance(engine.findEntities(name,value));
				s.setSkip(true);

			} else {
				s.setSetInstance(tmp);
			}
		}
		
		if(s.getField("1")!=null){
			A_Comportement_Unite(s);
		} else if(s.getField("10")!=null){
			A_Unidentified_Suspect(s);
		}
		
		
	}
	



	/** Ne prendre en compte la zone 10 du set EORGID que si la zone 1 n'est pas renseignée.

		Si l'alternat A est utilisé pour la zone 10, positionner le comportement de l'entité produite par l'analyse du set à  "PENDNG" (Pending).
		Si l'alternat B est utilisé pour la zone 10, le positionner à "SUSPCT" (Suspect).
	 * @throws Exception 
	*/
	public static void A_Unidentified_Suspect(MPGTWrapperSet s) throws Exception{
		  if(s.getField("10A")!=null){
			  TypeComportement comportement = (TypeComportement) engine.findOrCreateSetEntities("Comportement", "PENDNG");
				comportement.setComportement(TypeDictionaryDicoComportement.PENDNG);
				TypeEntiteOrganisationnelle org = (TypeEntiteOrganisationnelle) s.getSetInstance();
				org.getAPourComportementComportement().add(comportement);
		  } else if(s.getField("10B")!=null) {
			  TypeComportement comportement = (TypeComportement) engine.findOrCreateSetEntities("Comportement", "SUSPCT");
				comportement.setComportement(TypeDictionaryDicoComportement.SUSPCT);
				TypeEntiteOrganisationnelle org = (TypeEntiteOrganisationnelle) s.getSetInstance();
				org.getAPourComportementComportement().add(comportement);
		  }
	}
	

	
	/*
	La valeur du champ "UNIT SIZE INDICATOR"  (zone 2 d'un set ORGID ou sous-zone 2.1 d'un set EORGID) permet de déterminer si l'entité à produire est une unité associée à soit un type d'unité soit à un type de regroupement de force :
	- les valeurs "NAVTF", "NAVTG", "NAVTU", "TF", "TG", "TU", "NAVGP" décrivent un type de regroupement de force,
	- les autres valeurs (et la valeur "non renseignée") décrivent un type d'unité.
	*/

	public static void A_UNITSIZEINDICATOR(MPGTWrapperSet s){
		  String value = null;
		if("ORGID".equals(s.getSetId())){
			if(s.getField("2")!=null){
				value = s.getField("2").getValue();
			}
		} else if("EORGID".equals(s.getSetId()) || "ESTRENTH".equals(s.getSetId())) {
			if(s.getField("2")!=null){
				value = s.getField("2").getSubFields(0);
			}
		}
		
		  if(value!=null
		  	 && (value=="NAVTF" || value == "NAVTG" || value =="NAVTU" || value =="TF" || value =="TG" || value =="TU" || value =="NAVGP") ){
		  	log("Change l'alternative à Unité");
	   		s.updateAlternative(0);
		  } else {
		      log("Change l'alternative à Regroupement de force");
	   		 s.updateAlternative(1);
		  }
	}


	/**

	Les entités produites par l'analyse du message et considérées comme dites 'amies' (sets ORGID, ORGIDSUB, ORGIDBDY, ORGIDAFU, ORGIDSCE) seront associés à un état opérationnel (MPIA.EtatOperationnel) dont l'attribut MPIA.EtatOperationnel.Comportement aura la valeur "FR" (Friend).

	Les entités produites par l'analyse du message et considérées comme dites 'non amies' (sets EORGID, ESTRENTH, EORGBDRY) seront seront associés à un état opérationnel (MPIA.EtatOperationnel) dont l'attribut MPIA.EtatOperationnel.Comportement aura la valeur "HO" (Hostile), sauf si ce comportement est explicité dans le message (Règle A_Unidentified_Suspect)
	 * @throws Exception 

	*/

	public static void A_Comportement_Unite(MPGTWrapperSet s) throws Exception{
		String setId = s.getSetId().trim();
		log("A_Comportement_Unite "+ setId +" déjà réalisé par les VI ?");
		 if(softEquals(setId,"ORGID") || softEquals(setId , "ORGISUB") || softEquals(setId , "ORGIDBDY") || softEquals(setId , "ORGIDAFU") || softEquals(setId, "ORGIDSCE")  ){
			TypeComportement comportement = (TypeComportement) engine.findOrCreateSetEntities("Comportement", "FR");
			comportement.setComportement(TypeDictionaryDicoComportement.FR);
			TypeEntiteOrganisationnelle org = (TypeEntiteOrganisationnelle) s.getSetInstance();
			org.getAPourComportementComportement().add(comportement);
			log("VI  = {5|FR|Friend}");
		}else if(setId == "EORGID" || setId == "ESTRENTH" || setId == "EORGBDRY"){
		 	log("VI = {6|HO|Hostile}");
			TypeComportement comportement = (TypeComportement) engine.findOrCreateSetEntities("Comportement", "HO");
			comportement.setComportement(TypeDictionaryDicoComportement.HO);
			TypeEntiteOrganisationnelle org = (TypeEntiteOrganisationnelle) s.getSetInstance();
			org.getAPourComportementComportement().add(comportement);
		} 
	}
	
	

	/*
	Ne pas traiter le set si la forme n'est pas renseignée ou si la forme et le nombre de points ne sont pas cohérents.
	En fonction des valeurs du FFIRN/FUD 1237/001 "TYPE OF GRAPHIC SHAPE", on décrit une des entités "Localisation" suivantes :
	- LINE : MPGT.LigneGeometrique,
	- POINT  : MPGT.PointGeometrique,
	- AREA  : MPGT.AirePolygoneGeometrique,
	- ARROW : -,
	- SECTOR : MPGT.SecteurGeometrique,
	- ELLIPSE : MPGT.EllipseGeometrique.
	*/
	public static void   A_LOCATION_FORME(MPGTWrapperSet s){
	 	  String value = s.getField("2").getValue();
	 	  if(softEquals(value,"LINE") && s.countFields("3")==2){
	 		  
	 	  } else if(softEquals(value,"POINT") && s.countFields("3")==1){
	 		  
	 	  } else if(softEquals(value,"AREA") && s.countFields("3")>2){
	 		  
	 	  }  else if(softEquals(value,"ARROW") && s.countFields("3")>2){
	 		  
	 	  }  else if(softEquals(value,"SECTOR") && s.countFields("3")>2){
	 		  
	 	  }  else if(softEquals(value,"ELLIPSE") && s.countFields("3")>2){
	 		  
	 	  }
	 	  log("Le nombre de point "+ s.countFields("3")+ " ne correspond pas à "+value );
	 	  halt(s, "A_LOCATION_FORME");
	}


}
