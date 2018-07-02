package org.miliconvert.xsmt.mpgt.rules;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class EnsitrepSetRules extends InterDomaineSetRules{
	
	/**
	 * un type d'équipement, et en fonction de la conversion "CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)" un sous type d'équipement (voir ci-après, le détail),
		- une dotation effective :
		  - de l'entité MPIA.EntiteOrganisationnelle décrite par le set EORGID de niveau supérieur,
		  - pour le type d'équipement précédemment créé,
		
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
		- si non, créer une instance du sous type d'équipement et mettre à jour la dotation effective de ce sous-type équipement.
	 * @param s
	 */
	public static void A_ENSITREP_EMAT(MPGTWrapperSet s){
		
	}
	
	/**
	 * Valoriser une entité MPIA.Localisation associée (par l'entité MPIA.AssociationActiviteLocalisation) à l'entité MPIA.Action courante avec les valeurs du set LOCATION de niveau supérieur.
		Valoriser les attributs "Angle de mouvement" et "Vitesse" de l'entité MPIA.AssociationActiviteLocalisation
		Valoriser le rapport associé à l'entité MPIA.AssociationActiviteLocalisation, pour les attributs "Confirmation" et "GDH rapport".
	 * @param s
	 */
	public static void A_DRCTN(MPGTWrapperSet s){
		
	}
	
	/**
	 * Les sets INFOEVAL et ORGIDSCE contenus dans un segment ACTIVITY sont utilisés pour marquer la validité des données produites par l'analyse des sets ACTIVITY et DRCTN contenus dans le segment courant.

		Les sets INFOEVAL et ORGIDSCE permettent de créer l'entité MPIA.Rapport associée à l'entité d'association MPIA.AssociationActiviteLocalisation produite par l'analyse du set ACTIVITY.
		
		Le set ORGIDDFT permet de renseigner l'entité MPIA.EntiteOrganisationnelle qui "rédige" (rôle Redige) associée aux différents rapports.
	 * @param s
	 */
	public static void A_INFOEVAL_ACTIVITY(MPGTWrapperSet s){
		
	}
	
	
	public static void A_Unite_Limite(MPGTWrapperSet s){}
	
	
	
	/**
	 * Le set EORGID permet de créer une unité (entité MPIA.Unite) de type "type d'unité" ou "type de regroupement de force" et de comportement "HO" (Hostile).
		Les sets CMDRELI et ESUBORD permettent de créer un "lien de subordination" (entité d'association MPIA.AssociationInstanceObjetInstanceObjet) concernant cette entité organisationnelle.
		
		Le traitement à effectuer dépend de la valeur de la zone 1 du set CMDRELI :
		- si elle vaut "SUPERIOR", créer l'entité MPIA.Unite décrite par le segment EORGID puis la mémoriser, en tant que "entité organisationnelle supérieure courante",  jusqu'à trouver une prochaine répétition du segment dont le set CMDRELI contiendra la valeur "SUPERIOR".
		- si elle vaut "SUBORDONATE", créer l'entité MPIA.Unite décrite par le segment EORGID, puis créer un "lien de subordination".  Valoriser ce "lien de subordination", en fonction de la sous zone 1.1 du set ESUBORD :
		  - si la valeur de la sous zone est égale à l'une des valeurs suivantes : "NATPAR", "OPCOMD", "OPCON", "TACCOMD", "TACCNTL", l'entité MPIA.Unite subordonnée que l'on vient de créer est "objet" (rôle EstObjet) de l'entité d'association MPIA.AssociationInstanceObjetInstanceObjet; l'entité MPIA.Unite dernièrement mémorisée en tant que "entité organisationnelle supérieure courante" est "sujet" (EstSujet) de l'entité d'association,
		  - si la valeur de la sous zone est égale à "ELMOF", l'entité MPIA.Unite subordonnée que l'on vient de créer est "sujet" (EstSujet) de l'entité d'association MPIA.AssociationInstanceObjetInstanceObjet; l'entité MPIA.Unite dernièrement mémorisée en tant que "entité organisationnelle supérieure courante" est "objet" (rôle EstObjet) de l'entité d'association,
		- si elle vaut "UNKNOWN", créer l'entité MPIA.Unite décrite par le set EORGID mais ne pas créer de "lien de subordination" et ne pas changer "l'entité organisationnelle supérieure courante" mémorisée.
	 * @param s
	 */
	public static void A_CMDRELI(MPGTWrapperSet s){}
	
	

}
