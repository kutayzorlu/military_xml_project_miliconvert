package org.miliconvert.xsmt.mpgt.rules;

import java.lang.reflect.Method;
import java.text.ParseException;

import mpia.meta.MetaFactory;
import mpia.meta.MetaPackage;
import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;
import mpia.schema.SchemaFactory;
import mpia.schema.TypeArticulationTerre;
import mpia.schema.TypeAssocInstanceObjetLocalisation;
import mpia.schema.TypeAssociationEntiteOrgEntiteOrg;
import mpia.schema.TypeAutreDotationEffective;
import mpia.schema.TypeAutreTypeEquipement;
import mpia.schema.TypeComportement;
import mpia.schema.TypeDictionaryDicoArticulationTerreTypeODB;
import mpia.schema.TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie;
import mpia.schema.TypeDictionaryDicoAutreTypeEquipementCategorie;
import mpia.schema.TypeDictionaryDicoComportement;
import mpia.schema.TypeDictionaryDicoRapportConfirmation;
import mpia.schema.TypeDictionaryDicoTypeAeronefCategorie;
import mpia.schema.TypeDictionaryDicoTypeArmeCategorie;
import mpia.schema.TypeDictionaryDicoTypeArmeSousCategorie;
import mpia.schema.TypeDictionaryDicoTypeEquipementElectroniqueCategorie;
import mpia.schema.TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie;
import mpia.schema.TypeDictionaryDicoTypeEquipementGenieCategorie;
import mpia.schema.TypeDictionaryDicoTypeEquipementNRBCCategorie;
import mpia.schema.TypeDictionaryDicoTypeVehiculeCategorie;
import mpia.schema.TypeDotationEffectiveEquipement;
import mpia.schema.TypeEntiteOrganisationnelle;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypePrelevementSubordonneIdentifie;
import mpia.schema.TypeRapport;
import mpia.schema.TypeTypeAeronef;
import mpia.schema.TypeTypeArme;
import mpia.schema.TypeTypeEquipement;
import mpia.schema.TypeTypeEquipementElectronique;
import mpia.schema.TypeTypeEquipementGenie;
import mpia.schema.TypeTypeEquipementNRBC;
import mpia.schema.TypeTypeVehicule;
import mpia.schema.TypeUnite;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.miliconvert.xsmt.mpgt.MPGTUtils;
import org.miliconvert.xsmt.mpgt.model.Adatp3Set;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class OwnsitrepSetRules  extends InterDomaineSetRules{

		public static int parttitl = 0;
		private static TypeRapport rapport;
		
	
	
	/*
	Il y a quatre segments PARTTITL, le premier est obligatoire et les autres sont facultatifs ;  tous sont répétables.

	On se fonde sur la valeur de la zone 2 du set PARTTITL pour identifier le niveau du segment à analyser :
	- PARTTITL_1 : "OWN FORCES TASK ORGANIZATION",
	- PARTTITL_2 : "OWN FORCES PRESENCE REPORT",
	- PARTTITL_3 : "OWN FORCES UNIT STATUS",
	- PARTTITL_4 : "CONTROL AND COORDINATION LINES".
	*/
	public static void  A_PARTTITL(MPGTWrapperSet s){
			String value = s.getField("2").getValue();
			
			if(softEquals("OWN FORCES TASK ORGANIZATION",value) ){
				log("Traitement de PARTTITL_1");
				parttitl = 1;
			} else if(softEquals("OWN FORCES PRESENCE REPORT",value) ){
				log("Traitement de PARTTITL_2");
				parttitl = 2;
			} else if(softEquals("OWN FORCES UNIT STATUS",value) ){
				log("Traitement de PARTTITL_3");
				parttitl = 3;
			} else if(softEquals("CONTROL AND COORDINATION LINES",value)){
				log("Traitement de PARTTITL_4");
				parttitl = 4;
			} else {
				parttitl = 0;
			}
	}




	/*
	Chaque instance du segment ORGIDSUB décrit un lien de subordination dont le supérieur est l'unité produite par le précédent set ORGID.

	Le set ORGIDSUB permet de créer, ou de récupérer si elle existe déjà, l'unité subordonnée.
	Le set CMDREL permet de créer une entité MPIA.AssociationInstanceObjetInstanceObjet entre les 2 unités décrites par les sets ORGID et ORGIDSUB. 
	Les attributs MPGT.AssociationEntiteOrgEntiteOrg.Categorie, MPIA.AssociationInstanceObjetInstanceObjet.SousCategorie sont renseignés par le résultat de la CD=(AD3_1660_2;MPGT_AssociationInstanceObjetInstanceObjetCategorie;MPGT_AssociationInstanceObjetInstanceObjetSousCategorie).

	De plus, cette entité MPIA.AssociationInstanceObjetInstanceObjet est liée (EstReferenceeDans) à l'entité MPIA.ArticulationTerre dont l'attribut MPIA.ArticulationTerre.TypeODB est forcé à "Conjoncturel").
	Le set TIME permet de renseigner les dates de début et de fin de la relation.

	Enfin, si la valeur du FFIRN/FUD 1660_2 = "ATTACH", création d'une entité MPGT.PrelevementSubordonneIdentifie associée d'une part à l'entité MPIA.ArticulationTerre précédente (relation ACommePrelevement), et d'autre part à l'entité MPIA.AssociationInstanceObjetInstanceObjet précédente par la relation "ACommeLienVersBeneficiaire".
	*/
	public static void A_CMDREL(MPGTWrapperSet s){
		try {

					TypeAssociationEntiteOrgEntiteOrg t = SchemaFactory.eINSTANCE.createTypeAssociationEntiteOrgEntiteOrg();
					rapport = SchemaFactory.eINSTANCE.createTypeRapport();
					rapport.setConfirmation(TypeDictionaryDicoRapportConfirmation.get(
							CD(s.getField("1").getValue(),"CD=(AD3_1130_34;MPGT_RapportConfirmation)",s.getField("1").getFfirn(),"RapportConfirmation")));
					rapport.setCTE(EcoreUtil.generateUUID());
					
					
					
					t.setEstRapporteeParRapport((TypeAssociation) engine.createAssoc(t,rapport,null,false));
					
					t.setAPourSujetEntiteOrganisationnelle((TypeAssociationEXT) engine.createAssoc(t,engine.getLineContext().getInstance("22/40/56"),"EstSujet_AssociationEntiteOrgEntiteOrg",true));
					t.setCategorie(TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie.get(
							CD(s.getField("2").getValue(),"CD=(AD3_1660_2;MPGT_AssociationEntiteOrgEntiteOrgCategorie,MPGT_AssociationInstanceObjetInstanceObjetSousCategorie)",s.getField("2").getFfirn(),"AssociationEntiteOrgEntiteOrgCategorie"))
					);
					t.setAPourObjetEntiteOrganisationnelle((TypeAssociationEXT)engine.createAssoc(t,engine.getLineContext().getInstance("75/92/108"),"EstObjet_AssociationEntiteOrgEntiteOrg",true));
					
					TypeArticulationTerre art = SchemaFactory.eINSTANCE.createTypeArticulationTerre();
					art.setCTE(EcoreUtil.generateUUID());
				    art.setTypeODB(TypeDictionaryDicoArticulationTerreTypeODB.SITU);
				    t.getEstReferenceeDansArticulation().add((TypeAssociationEXT) engine.createAssoc(t,art,"EstConstitueDe_AssociationEntiteOrgEntiteOrg",true));
				    
					if(softEquals("ATTACH",s.getField("2").getValue())){
						
						TypePrelevementSubordonneIdentifie ident = SchemaFactory.eINSTANCE.createTypePrelevementSubordonneIdentifie();
						ident.setCTE(EcoreUtil.generateUUID());;
						ident.setACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg((TypeAssociation) engine.createAssoc(ident,t,null,false));
						art.getACommePrelevementPrelevementDetachement().add((TypeAssociation) engine.createAssoc(art,ident,"PorteSur_ArticulationTerre",false));
						
					}
					s.setSetInstance(t);

				s.setSkip(true);
			
		}catch (Exception e) {
			logger.error(e,e);
		}
	 
		
	}
	
	

	/*
	Les instances du groupe de champs, au sein du set TIME, sont utilisées pour valoriser les dates de début et/ou de fin de relation "du lien de subordination".

	Si le set ne contient qu'une seule instance :
	- si la 2ieme zone de cette instance n'est pas renseignée (exemple : TIME/ASAP/-//), on ne traite pas le set, 
	- sinon on teste si le qualificatif de la zone 1 décrit une date de début ou de fin :
	  - les qualificatifs qui décrivent une date de fin sont CLEARED, END, OFF, AND, UNTIL, TO,
	  - les autres qualificatifs sont pris comme décrivant une date de début.
	  - si le qualificatif de la zone 1 décrit une date de début, on valorise la date de début de relation avec la valeur de la zone 2,
	  - si le qualificatif de la zone 1 décrit une date de fin, on valorise la date de fin de relation avec la valeur de la zone 2.

	Si le set contient deux instances, la première est utilisée pour valoriser la date de début de relation et la seconde pour la date de fin de relation.

	Si le set contient plus de deux instances, on ne prend en compte que les deux premières instances.

	TIME/AT/271430ZFEB95//
	TIME/NLT/DTM:271430ZFEB//
	TIME/ASOF/271430Z//
	TIME/BEFORE/DMINUS120MIN/AFTER/DPLUS2HR//
	TIME/FROM/271430ZFEB96/TO/281430ZFEB96//

	 

	*/


	public static void A_TIME_SUBORD(MPGTWrapperSet s) throws ParseException{
	  log("A_TIME_SUBORD");
	  
	  String value = null;
	  if(s.getField("2A")!=null){
		  A_GdhFormatAn(s, s.getField("2A"));
		  value =  s.getField("2A").getValue();
	  } else if(s.getField("2B")!=null) {
		  A_GdhFormatMois(s, s.getField("2B"));
		  value =  s.getField("2B").getValue();
	  }else if(s.getField("2C")!=null){
		  A_GdhFormatJourDuMois(s, s.getField("2C"));
		  value =  s.getField("2C").getValue();
	  }
	  
	  if(s.getOccCount()>1){
		  if(s.getCurrOcc()==0){
			  rapport.setDateDebut((TypeDataTypeDateHeure) MetaFactory.eINSTANCE.createFromString(MetaPackage.eINSTANCE.getTypeHeure(), value));
		  } else  if(s.getCurrOcc()==1) {
			  rapport.setDateFin((TypeDataTypeDateHeure) MetaFactory.eINSTANCE.createFromString(MetaPackage.eINSTANCE.getTypeHeure(), value));
		  }
		  
	  } else {

	   if(value!=null){
	   	  if(softEquals(value,"CLEARED") ||  softEquals(value,"END") || softEquals(value,"OFF") || softEquals(value,"AND") || softEquals(value,"UNTIL") || softEquals(value,"TO")){
	   		  rapport.setDateFin((TypeDataTypeDateHeure) MetaFactory.eINSTANCE.createFromString(MetaPackage.eINSTANCE.getTypeHeure(), value));
	   	  } else {
	   		  rapport.setDateDebut((TypeDataTypeDateHeure) MetaFactory.eINSTANCE.createFromString(MetaPackage.eINSTANCE.getTypeHeure(), value));
	   	  }
	   }
	
	  
	  }
	  s.setSkip(true); 
	  
	}
	
	





	

	/*
	 *  
	 * 
	Pour chaque instance du groupe de champs, créer :   :
	- en fonction des valeurs du FFIRN/FUD 1045/004 (UNIT SIZE INDICATOR) : soit une entité MPIA.TypeUnite, soit une entité MPIA.TypeRegroupementForce que l'on valorise avec les données du groupe,
	- une dotation effective :
	  - de l'entité MPIA.EntiteOrganisationnelle décrite par le set EORGID de niveau supérieur,
	  - de type entité MPIA.TypeUnite ou entité MPIA.TypeRegroupementForce précédemment créée,
	  - rapportée par l'entité MPIA.EntiteOrganisationnelle décrite par le set ORGID de niveau supérieur.
	 */
	public static void   A_ESTRENTH(MPGTWrapperSet s) throws Exception{
		A_UNITSIZEINDICATOR(s);

		TypeUnite unite = SchemaFactory.eINSTANCE.createTypeUnite();
		unite.setCTE(EcoreUtil.generateUUID());
		TypeAutreDotationEffective dotation= SchemaFactory.eINSTANCE.createTypeAutreDotationEffective();
		
		
		
		TypeEntiteOrganisationnelle eorgid = getEorgidSegInstance();
		TypeEntiteOrganisationnelle orgid = getOrgidSegInstance();
		
		
		TypeRapport rapport =  SchemaFactory.eINSTANCE.createTypeRapport();
		rapport.setCTE(EcoreUtil.generateUUID());
		rapport.setEstRedigeParEntiteOrganisationnelle((TypeAssociationEXT) engine.createAssoc(rapport,orgid,"Redige_Rapport",true));
		dotation.setEstRapporteeParRapport((TypeAssociation) engine.createAssoc(dotation,rapport,null,false));
		dotation.setAssocieCommeTypeTypeEntiteOrganisationnelle((TypeAssociation) engine.createAssoc(dotation,unite,null,false));
		eorgid.getAPourDotationEffectiveDotationEffective().add(dotation);
		
		//Type Unite
		log("TODO les champs en jaunes");
		/*if(s.getCurrentAlternative()==0){
		
			
		} else 
		//Type Regroupement de force
		{
			TypeDotationEffective tmp = SchemaFactory.eINSTANCE.createTypeDotationEffectiveEffectif();
			tmp.setQuantiteOperationnelle(Long.parseLong(s.getField("1").getValue()));
			unite.getAPourDotationEffectiveDotationEffective().add(tmp);
			
		}*/
		
		s.setSetInstance(unite);

		
		//dotation.getA
		//eorgid.getAPourDotationEffectiveDotationEffective().add();
			// 333/1049
		  
	 	
	 	
	}
	


	/*
	Pour chaque instance du groupe de champs, créer ou récupérer :
	- un type d'équipement, en fonction de la conversion "CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)" un sous type d'équipement (voir ci-après, le détail),
	- une dotation effective :
	  - de l'entité MPIA.EntiteOrganisationnelle décrite par le set EORGID de niveau supérieur,
	  - pour le type d'équipement précédemment créé,
	  - rapportée par l'entité MPIA.EntiteOrganisationnelle décrite par le set ORGID de niveau supérieur.

	La conversion "CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)"permet de déterminer quelle est l'entité instanciable (et l'attribut associé) fille de l'entité MPIA.TypeEquipement, en fonction de la valeur de l'item du FFIRN/FUD 1135_28 :
	   - entité MPIA.AutreTypeEquipement, attribut MPIA.AutreTypeEquipement.Categorie,
	   - entité MPGT.AutreTypeAeronef, attributs MPIA.TypeAeronef.Categorie, MPIA.TypeAeronef.SousCategorie,
	   - entité MPIA.TypeArme, attribut MPIA.TypeArme.Categorie,
	   - entité MPIA.TypeEquipementElectronique, attribut MPIA.TypeEquipementElectronique.Categorie,
	   - entité MPIA.TypeEquipementGenie, attribut MPIA.TypeEquipementGenie.Categorie,
	   - entité MPIA.TypeEquipementNRBC, attribut MPIA.TypeEquipementNRBC.Categorie
	   - entité MPIA.TypeVehicule, attribut MPIA.TypeVehicule.Categorie.

	La zone 3.1 "EQUIPMENT CATEGORY" est à mettre en correspondance avec le nom du sous type d'équipement (attribut MPIA.RacineOperationnelle.Nom).
	Vérifier si la zone 3.1 (optionnelle) est ou non renseignée : si elle est non renseignée, prendre comme valeur par défaut le contenu de la zone 2.1 "EQUIPMENT CATEGORY " comme nom du sous type d'équipement. 

	Vérifier s'il existe un sous type d'équipement de nom "MPIA.RacineOperationnelle.Nom" :
	- si oui, mettre à jour la dotation effective de cet équipement,
	- sinon, créer une instance du sous type d'équipement et mettre à jour la dotation effective de ce sous-type équipement.
	*/



	public static void   A_EMAT(MPGTWrapperSet s) throws Exception{
		 String value = s.getField("2").getSubFields(0);
		 String entite = 		 CD(value,"CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)","1135_028","Entité Sous-type d'équipement");
		 String categorie = 	 CD(value,"CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)","1135_028","Catégorie");
		 String scategorie = 	 CD(value,"CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)","1135_028","Sous catégorie");
		
		 if(entite==null){
			 entite = "MPIA.TypeAeronef";
			 categorie = 	 CD(value,"CD=(AD3_1135_28;MPGT_TypeAeronefCategorie","1135_028","TypeAeronefCategorie");
		 }
		 

		 log(entite+" "+categorie+" "+scategorie);
		 
			
			TypeTypeEquipement equipement  = (TypeTypeEquipement) engine.findOrCreateSetEntities(entite, s.getField("3")!=null?s.getField("3").getSubFields(0):value);
			if (equipement instanceof TypeAutreTypeEquipement) {
				((TypeAutreTypeEquipement) equipement).setCategorie(TypeDictionaryDicoAutreTypeEquipementCategorie.get(Integer.parseInt(categorie)));
				
			} else if (equipement instanceof TypeTypeAeronef) {
				((TypeTypeAeronef) equipement).setCategorie(TypeDictionaryDicoTypeAeronefCategorie.get(categorie));
			
			}else if (equipement instanceof TypeTypeArme) {
				((TypeTypeArme) equipement).setCategorie(TypeDictionaryDicoTypeArmeCategorie.get(Integer.parseInt(categorie)));
				((TypeTypeArme) equipement).setSousCategorie(TypeDictionaryDicoTypeArmeSousCategorie.get(Integer.parseInt(scategorie)));
			}else if (equipement instanceof TypeTypeEquipementElectronique) {
				((TypeTypeEquipementElectronique) equipement).setCategorie(TypeDictionaryDicoTypeEquipementElectroniqueCategorie.get(Integer.parseInt(categorie)));
				((TypeTypeEquipementElectronique) equipement).setSousCategorie(TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie.get(Integer.parseInt(scategorie)));
			}else if (equipement instanceof TypeTypeEquipementGenie) {
				((TypeTypeEquipementGenie) equipement).setCategorie(TypeDictionaryDicoTypeEquipementGenieCategorie.get(Integer.parseInt(categorie)));
			}else if (equipement instanceof TypeTypeEquipementNRBC) {
				((TypeTypeEquipementNRBC) equipement).setCategorie(TypeDictionaryDicoTypeEquipementNRBCCategorie.get(Integer.parseInt(categorie)));
			}else if (equipement instanceof TypeTypeVehicule) {
				((TypeTypeVehicule) equipement).setCategorie(TypeDictionaryDicoTypeVehiculeCategorie.get(Integer.parseInt(categorie)));
			}
			

			//equipement.setNom(value)
			equipement.setCTE(EcoreUtil.generateUUID());
			TypeDotationEffectiveEquipement dotation= SchemaFactory.eINSTANCE.createTypeDotationEffectiveEquipement();
			
			
			
			TypeEntiteOrganisationnelle eorgid = (TypeEntiteOrganisationnelle) s.getSetInstance();
			TypeEntiteOrganisationnelle orgid = getOrgidSegInstance();
			
			
			TypeRapport rapport =  SchemaFactory.eINSTANCE.createTypeRapport();
			rapport.setCTE(EcoreUtil.generateUUID());
			rapport.setEstRedigeParEntiteOrganisationnelle((TypeAssociationEXT) engine.createAssoc(rapport,orgid,"Redige_Rapport",true));
			dotation.setEstRapporteeParRapport((TypeAssociation) engine.createAssoc(dotation,rapport,null,false));
			dotation.setAssocieCommeTypeTypeMateriel((TypeAssociation) engine.createAssoc(dotation,equipement,null,false));
			
			dotation.setQuantiteOperationnelle(Long.parseLong(s.getField("1").getSubFields(0)));
			eorgid.getAPourDotationEffectiveDotationEffective().add(dotation);
			
			
			s.setSkip(true);

	}

	
	/*Les informations contenues dans le set TPERID, contenu dans le segment ORGID, 
	 * sont mémorisées pour valoriser les attributs "Date de début" et "Date de fin" 
	 * des instances de l'entité MPIA.Rapport qui seront associées aux instances de l'entité MPIA.Localisation
	 *  produites par les instances du segment LOCNFSTS suivant. 
	*/
	public static void   A_TPERID_ORGID(MPGTWrapperSet s){
	 	 //Normalement ca marche tout seul
	}
	 

	/*
	 * 
	 * Cette règle décrit la prise en compte des instances du segment LOCNFSTS au sein d'un segment ORGID et la prise  en compte des instances des segments TPERID au sein d'une instance du segment LOCNFSTS.

		Chaque instance du segment LOCNFSTS contient un set LOCNFSTS qui donne une liste de coordonnées à attribuer à chacune des entités qui seront créés.
		Chaque instance du segment TPERID au sein d'une instance du segment LOCNFSTS permet de créer effectivement une entité MPIA.Localisation (MPGT.PointGeometrique ou MPGT.LigneGeometrique en fonction du nombre de coordonnées) .
		
		Si l'instance du segment TPERID contient un set OPMOVEMT, les attributs MPIA.AssocInstanceObjetLocalisation.AngleMouvement et MPIA.AssocInstanceObjetLocalisation.Vitesse de l'entité  MPIA.AssocInstanceObjetLocalisation courante sont valorisés.
		Si l'instance du segment TPERID contient un set ACTIVITY, une entité MPIA.Action est créée et est associée à l'entité MPIA.Localisation. Le set TPERID est alors pris en compte pour valoriser les attributs MPIA.Action.DateDebutPrevue et MPIA.Action.DateFinPrevue.
		Si elle ne contient pas de set ACTIVITY, le set TPERID n'est pas traité.
	*/
	
	public static void   A_LOCNFSTS_TPERID(MPGTWrapperSet s){
	 	 //Normalement ca marche tout seul
	}
	
	
	
	/*
	Le traitement du set LOCATION dépend :
	- de la présence et du contenu des sets LOCAMPN et ACTIVITY dans le segment,

	1) Seul le set LOCATION est présent (pas de set LOCAMPN et le set ACTIVITY est vide) : 
	   - on crée une entité MPIA.Localisation, associée par le biais de l'entité d'association MPIA.AssocInstanceObjetLocalisation à l'entité MPIA.Unite (issue du set EORGID). Cette association est rapportée par l'entité ORGID précédente,
	   - on ne traite pas les données du set TIME.

	2)  Si le set LOCAMPN est présent (le set ACTIVITY étant vide ou pas) :
	     le set LOCATION, en fonction de la conversion CD A_LOCATION_TYPE, décrit :
	     - soit le géoréférencement d'une entité qui est associée à l'entité MPIA.Unite (produite par le set EORGID) :
	       Cas1 : "Autre élément de contrôle" (élément de contrôle différent de "Limite"),
	       Cas 2 : "Limite",
	       Cas 3 : "Autre Site" (site différent de "Aerodrome", Obstacle", "Pont", "Route"),
	       Cas 4 : "Aerodrome",
	       Cas 5 : "Obstacle",
	       Cas 6 : "Pont",
	       Cas 7 : "Route",
	       Cas 9 : une localisation de l'unité de type "CMASS".
	     - soit une unité dont le type de commandement est "PC" ou "HQ" (dont les autres caractéristiques d'unité sont reprises du set EORGID précédent) et son géoréférencement =>
	       Cas 8 : unité de type de commandement (attribut MPIA.TypeEntiteOrganisationnelle.TypeCommandement) "PC" ou "HQ",

	Pour les cas 1, 2, 3, 4, 5, 6, 7 l'entité d'association utilisée est MPIA.AssociationInstanceObjetInstanceObjet. Cette association est rapportée par l'entité ORGID précédente.
	Pour les cas 8 et 9, l'entité d'association utilisée est MPIA.AssocInstanceObjetLocalisation. Cette association est rapportée par l'entité ORGID précédente.

	3) Si le set ACTIVITY est renseigné (que le set LOCAMPN soit présent ou pas) :
	    - on génère une entité MPIA.Action avec les données du set ACTIVITY : 
	    - on crée une association (entité MPIA.AssociationInstanceObjetActivite) entre l'entité MPIA.Action et l'entité MPIA.Unite produite par le set EORGID précédent,
	    - on duplique les coordonnées du précédent set LOCATION pour créer une entité MPIA.Localisation (la localisation initiale est préservée) associée (par l'entité MPIA.AssociationActiviteLocalisation) à l'entité MPIA.Action,
	    - si la zone 1 du set ACTIVITY est renseignée, elle permet de créer une entité MPIA.EtatAction associée à l'entité MPIA.Action,
	    - on marque que les entités précédentes MPIA.AssociationActiviteLocalisation et MPIA.EtatAction (si celle-ci a été générée) sont rapportées par l'entité MPIA.EntiteOrganisationnelle produite par le set ORGID du segment ORGID de niveau supérieur :
	    - si le set TIME est renseigné, on utilise son contenu pour valoriser :
	      . les attributs "Date début" et "Date fin" de l'entité d'association (entité MPIA.AssociationInstanceObjetActivite) entre les entités MPIA.Action et MPIA.Unite produite par le set EORGID précédent.
	      . les attributs "Date de début" et "Date de fin"des rapports associés aux entités MPIA.AssociationActiviteLocalisation et MPIA.EtatAction associées à l'entité MPIA.Action.
	*/

	public static void   A_LOCATION_OWNSITREP(MPGTWrapperSet s) throws Exception{
	 	
	 	  
	 	  boolean isLocampn = s.getParent().findBySetId("LOCAMPN").size()>0;
	 	  boolean activity  = s.getParent().findBySetId("ACTIVITY").size()>0 && s.getParent().findBySetId("ACTIVITY").get(0).getAd3Fields().size()>0 ;
	 	  
	 	  /*
	 	   * 1) Seul le set LOCATION est présent (pas de set LOCAMPN et le set ACTIVITY est vide) : 
			   - on crée une entité MPIA.Localisation, 
			   		associée par le biais de l'entité d'association MPIA.AssocInstanceObjetLocalisation 
			   		à l'entité MPIA.Unite (issue du set EORGID). Cette association est rapportée par l'entité ORGID précédente,
			   - on ne traite pas les données du set TIME.
	 	   * 
	 	   */
	 	  if(!isLocampn && !activity){
	 		  log("A_LOCATION_OWNSITREP cas 1");
	 		  TypeLocalisation localisation = (TypeLocalisation) engine.findOrCreateFieldEntities("Localisation");
	 		  
	 		 TypeEntiteOrganisationnelle eorgid = getEorgidSegInstance();
	 		 TypeEntiteOrganisationnelle orgid = getOrgidSegInstance();
	 		
	 		 TypeAssocInstanceObjetLocalisation assocInstanceObjetLocalisation =  (TypeAssocInstanceObjetLocalisation) engine.findOrCreateFieldEntities("AssocInstanceObjetLocalisation");
	 		 assocInstanceObjetLocalisation.setEstLocaliseEnLocalisation(localisation);
	 		 assocInstanceObjetLocalisation.setEstRapporteeParRapport((TypeAssociation) engine.createAssoc(assocInstanceObjetLocalisation, orgid, null,false));
	 		 
	 		 eorgid.getEstLocaliseParAssocInstanceObjetLocalisation().add(assocInstanceObjetLocalisation);
	 		 s.getParent().remove("TIME");
	 	  }
	 	  
	 	  
	 	  /*
	 	   *2)  Si le set LOCAMPN est présent (le set ACTIVITY étant vide ou pas) :
			     le set LOCATION, en fonction de la conversion CD A_LOCATION_TYPE, décrit :
			     - soit le géoréférencement d'une entité qui est associée à l'entité MPIA.Unite (produite par le set EORGID) :
			       Cas1 : "Autre élément de contrôle" (élément de contrôle différent de "Limite"),
			       Cas 2 : "Limite",
			       Cas 3 : "Autre Site" (site différent de "Aerodrome", Obstacle", "Pont", "Route"),
			       Cas 4 : "Aerodrome",
			       Cas 5 : "Obstacle",
			       Cas 6 : "Pont",
			       Cas 7 : "Route",
			       Cas 9 : une localisation de l'unité de type "CMASS".
			     - soit une unité dont le type de commandement est "PC" ou "HQ" (dont les autres caractéristiques d'unité sont reprises du set EORGID précédent) et son géoréférencement =>
			       Cas 8 : unité de type de commandement (attribut MPIA.TypeEntiteOrganisationnelle.TypeCommandement) "PC" ou "HQ",
		
			Pour les cas 1, 2, 3, 4, 5, 6, 7 l'entité d'association utilisée est MPIA.AssociationInstanceObjetInstanceObjet. Cette association est rapportée par l'entité ORGID précédente.
			Pour les cas 8 et 9, l'entité d'association utilisée est MPIA.AssocInstanceObjetLocalisation. Cette association est rapportée par l'entité ORGID précédente.
 
	 	   */
	 	 if(isLocampn){
	 		log("A_LOCATION_OWNSITREP cas 2 TODO");
	 		Adatp3Set locampn  = s.getParent().findBySetId("LOCAMPN").get(0);
	 		
	 		
	 		//CD A_LOCATION_TYPE pour traiter la conversion des valeurs 1284_1;MPGT_AutreTypeElementControleCategorie;MPGT_AutreTypeElementControleSousCategorie:MPGT_Comportement
	 		
	 	 }
	 	 
	 	 /*
	 	3) Si le set ACTIVITY est renseigné (que le set LOCAMPN soit présent ou pas) :
		    - on génère une entité MPIA.Action avec les données du set ACTIVITY : 
		    - on crée une association (entité MPIA.AssociationInstanceObjetActivite) entre l'entité MPIA.Action et l'entité MPIA.Unite produite par le set EORGID précédent,
		    - on duplique les coordonnées du précédent set LOCATION pour créer une entité MPIA.Localisation (la localisation initiale est préservée) associée (par l'entité MPIA.AssociationActiviteLocalisation) à l'entité MPIA.Action,
		    - si la zone 1 du set ACTIVITY est renseignée, elle permet de créer une entité MPIA.EtatAction associée à l'entité MPIA.Action,
		    - on marque que les entités précédentes MPIA.AssociationActiviteLocalisation et MPIA.EtatAction (si celle-ci a été générée) sont rapportées par l'entité MPIA.EntiteOrganisationnelle produite par le set ORGID du segment ORGID de niveau supérieur :
		   
		*/
	 	 
	 	 if(activity){
	 		 log("A_LOCATION_OWNSITREP cas 3 TODO");
	 	 }

	 	  
	 	  
	}

	private static TypeEntiteOrganisationnelle getOrgidSegInstance() {
		return (TypeEntiteOrganisationnelle) engine.getLineContext().getInstance("259/277/293");
	}



	private static TypeEntiteOrganisationnelle getEorgidSegInstance() {
		return (TypeEntiteOrganisationnelle) engine.getLineContext().getInstance("333/1049");
	}



	

	/*
	Le set TIME n'est pris en compte que si le set ACTIVITY suivant est renseigné.

	Le set TIME permet de produire une date de début et/ou une date de fin (se reporter à la A_TIME_SUBORD($s);)

	Les données valorisées par le set TIME sont listées dans la description de la règle A_LOCATION_OWNSITREP
	 - si le set TIME est renseigné, on utilise son contenu pour valoriser :
		      . les attributs "Date début" et "Date fin" de l'entité d'association (entité MPIA.AssociationInstanceObjetActivite) entre les entités MPIA.Action et MPIA.Unite produite par le set EORGID précédent.
		      . les attributs "Date de début" et "Date de fin"des rapports associés aux entités MPIA.AssociationActiviteLocalisation et MPIA.EtatAction associées à l'entité MPIA.Action.
	
	*/

	public static void   A_TIME_LOCATION(MPGTWrapperSet s) throws ParseException{
	 	 log("A_TIME_LOCATION");
	 	boolean activity  = s.getParent().findBySetId("ACTIVITY").size()>0 && s.getParent().findBySetId("ACTIVITY").get(0).getAd3Fields().size()>0 ;
	 	if(!activity){
	 		log("TODO SET rapport first");
	 		A_TIME_SUBORD(s);
	 	}
	 	
	 	s.setSkip(true);
	 	
	}
	

	/*
	Le set ACTIVITY n'est pas traité s'il est vide (set obligatoire)
	Sinon, il donne lieu à la création d'une entité MPIA.Action comme décrite dans la règle A_LOCATION_OWNSITREP.
	*/
	public static void   A_ACTIVITY_EORGID(MPGTWrapperSet s){
	 	  log("TODO");
	}
	
	


	/*
	Si le set ORGID de niveau supérieur a produit une entité organisationnelle identifiée :
	- le set LINETYPE permet de créer soit une entité MPIA.Limite (zone 2 = "BOUND") soit une entité MPIA.AutreElementControle,
	- une association MPIA.AssociationInstanceObjetInstanceObjet est créee entre l'entité produite par 
	le ORGID (entité fille de l'entité MPIA.EntiteOrganisationnelle) 
	et celle produite par le set LINETYPE (MPIA.Limite ou MPIA.AutreElementControle). 
	Dans le cas de l'entité MPIA.AutreElementControle, créer de plus le type d'élément de contrôle (entité MPIA.AutreTypeElementControle) relié par l'association MPGT.AssociationEltCtrlTypeEltCtrl.

	Si le set ORGID n'a pas permis de produire une entité identifiable :
	- on ne prend en compte que les sets LINETYPE de zone 2 = "BOUND" pour créer une entité MPIA.Limite.
	- on ne crée pas d'association pour cette Limite.
	*/
	public static void   A_LINETYPE(MPGTWrapperSet s){
	 	  log("TODO");
	}




	/*
	Si l'élément de contrôle traité est de type MPIA.AutreTypeElementControle, appliquer la règle A_VD_Forme.

	Si l'élément de contrôle traité est une MPIA.Limite, vérification que la localisation contient au moins deux coordonnées, puis associer à l'entité MPIA.Limite une entité MPIA.LigneGeometrique (entité MPIA.AssocInstanceObjetLocalisation)
	*/
	public static void   A_LOCNF_Forme(MPGTWrapperSet s){
	 	  log("TODO");
	}


	/*
	Prendre en compte la valeur de la zone 1 du set QSTRTIME pour déterminer si la date à valoriser est la date de début de relation ou la date de fin de relation.

	Les valeurs qui décrivent une date de début sont :    AFTER, ASOF, AT, BEFORE, NET, NLT, START, WEF,
	Les valeurs qui décrivent une date de fin sont :         CLEARED, UNTIL.
	*/
	public static void   A_QSTRTIME(MPGTWrapperSet s){
	 	  log("TODO");
	}
	
	
	/*
	 * 	On valorise :
		- le rapport associé à l'entité produite par le précécent set LOCATION
		- le rapport associé à l'entité MPIA.EtatAction, ainsi que celui associé à l'entité MPGT.AssociationEntiteOrgAction, ces entités étant produites par le set ACTIVITY suivant.

	 */
	public static void A_TIME_LOCATION_VALORISATION(MPGTWrapperSet s){
	 	  log("TODO");
	}
	
	/*
	 * On valorise les dates de début et de fin de relation de l'association entre l'entité produite par le set ORGID et l'entité produite par le set LINETYPE
	 */
	public static void A_DATE_VALORISATION(MPGTWrapperSet s){
		 log("TODO");
	}
	
	public static void NANA(MPGTWrapperSet s,String cond){
		 log("TODO");
	}
	
	/*
	 * La CD "CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)" permet de déterminer quelle est l'entité instanciable 
	 * (et l'attribut associé) en fonction de la valeur de l'item du FFIRN/FUD 1135_28 :
	- entité MPIA.AutreTypeEquipement, attriut MPIA.AutreTypeEquipement.Categorie,
	- entité MPGT.AutreTypeAeronef, attributs MPIA.TypeAeronef.Categorie, MPIA.TypeAeronef.SousCategorie,
	- entité MPIA.TypeArme, attribut MPIA.TypeArme.Categorie,
	- entité MPIA.TypeEquipementElectronique, attribut MPIA.TypeEquipementElectronique.Categorie,
	- entité MPIA.TypeEquipementGenie, attribut MPIA.TypeEquipementGenie.Categorie,
	- entité MPIA.TypeEquipementNRBC, attribut MPIA.TypeEquipementNRBC.Categorie
	- entité MPIA.TypeVehicule, attribut MPIA.TypeVehicule.Categorie
	
	La zone 3 "EQUIPMENT DESIGNATOR" est à mettre en correspondance avec le nom du sous type d'équipement (attribut MPIA.RacineOperationnelle.Nom).
	Vérifier s'il existe un nom de sous type d'équipement "MPIA.RacineOperationnelle.Nom" :
	- si oui, mettre à jour la dotation effective de cet équipement,
	- sinon, créer une instance du sous type d'équipement et mettre à jour la dotation effective de ce sous-type équipement.
	 */
	public static void A_EQUIP(MPGTWrapperSet s) throws Exception{
		 log("A_EQUIP");
		 String value = s.getField("2").getValue();
		 String entite = CD(value,"CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)","1135_028","Entité Sous-type d'équipement");
		 String categorie = 	 CD(value,"CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)","1135_028","Catégorie");
		 String scategorie = 	 CD(value,"CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)","1135_028","Sous catégorie");
		
		 if(entite==null){
			 entite = "MPIA.TypeAeronef";
			 categorie = 	 CD(value,"CD=(AD3_1135_28;MPGT_TypeAeronefCategorie","1135_028","TypeAeronefCategorie");
		 }

		 log(entite+" "+categorie+" "+scategorie);
		 

			 TypeEntiteOrganisationnelle instance = (TypeEntiteOrganisationnelle)s.getSetInstance();
		    TypeRapport rapport = SchemaFactory.eINSTANCE.createTypeRapport();
			rapport.setConfirmation(TypeDictionaryDicoRapportConfirmation.get(
					CD(s.getField("1").getValue(),"CD=(AD3_1130_34;MPGT_RapportConfirmation)",s.getField("1").getFfirn(),"RapportConfirmation")));
			rapport.setCTE(EcoreUtil.generateUUID());
			TypeDotationEffectiveEquipement dotation = SchemaFactory.eINSTANCE.createTypeDotationEffectiveEquipement();
			dotation.setCTE(EcoreUtil.generateUUID());
			dotation.setEstRapporteeParRapport((TypeAssociation) engine.createAssoc(dotation,rapport,null,false));
			
			
		
			
			TypeTypeEquipement equipement  = (TypeTypeEquipement) engine.findOrCreateSetEntities(entite, s.getField("3")!=null?s.getField("3").getValue():null);
			if (equipement instanceof TypeAutreTypeEquipement) {
				((TypeAutreTypeEquipement) equipement).setCategorie(TypeDictionaryDicoAutreTypeEquipementCategorie.get(Integer.parseInt(categorie)));
				
			} else if (equipement instanceof TypeTypeAeronef) {
				((TypeTypeAeronef) equipement).setCategorie(TypeDictionaryDicoTypeAeronefCategorie.get(categorie));
			
			}else if (equipement instanceof TypeTypeArme) {
				((TypeTypeArme) equipement).setCategorie(TypeDictionaryDicoTypeArmeCategorie.get(Integer.parseInt(categorie)));
				((TypeTypeArme) equipement).setSousCategorie(TypeDictionaryDicoTypeArmeSousCategorie.get(Integer.parseInt(scategorie)));
			}else if (equipement instanceof TypeTypeEquipementElectronique) {
				((TypeTypeEquipementElectronique) equipement).setCategorie(TypeDictionaryDicoTypeEquipementElectroniqueCategorie.get(Integer.parseInt(categorie)));
				((TypeTypeEquipementElectronique) equipement).setSousCategorie(TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie.get(Integer.parseInt(scategorie)));
			}else if (equipement instanceof TypeTypeEquipementGenie) {
				((TypeTypeEquipementGenie) equipement).setCategorie(TypeDictionaryDicoTypeEquipementGenieCategorie.get(Integer.parseInt(categorie)));
			}else if (equipement instanceof TypeTypeEquipementNRBC) {
				((TypeTypeEquipementNRBC) equipement).setCategorie(TypeDictionaryDicoTypeEquipementNRBCCategorie.get(Integer.parseInt(categorie)));
			}else if (equipement instanceof TypeTypeVehicule) {
				((TypeTypeVehicule) equipement).setCategorie(TypeDictionaryDicoTypeVehiculeCategorie.get(Integer.parseInt(categorie)));
			}
			

			//equipement.setNom(value)
			equipement.setCTE(EcoreUtil.generateUUID());
			dotation.setAssocieCommeTypeTypeMateriel((TypeAssociation) engine.createAssoc(dotation,equipement,null,false));
			dotation.setQuantiteOperationnelle(Long.parseLong(s.getField("4").getValue()));
			instance.getAPourDotationEffectiveDotationEffective().add(dotation);
		
			s.setSkip(true);

		 
	}
	
	
}
