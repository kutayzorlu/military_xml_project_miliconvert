package org.miliconvert.xsmt.mpgt.rules;

import mpia.schema.SchemaFactory;
import mpia.schema.TypeLimite;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

/**
 * 
 * @author matthieu
 *
 */
public class OwnsitrepFieldRules  extends InterDomaineFieldRules {
	

	
	

	
	
	/*
	 * L'entité MPIA.Limite créée est renseignée avec le nom donné dans la zone 3 du set LINETYPE et les entités organisationnelles "droite" et "gauche" données dans le set ORGIDBDY.
	On lui affecte un comportement "Friend" (attribut MPIA.EtatOperationnel.Comportement = "FR" (Friend)).
	Si l'entité organisationnelle (droite ou gauche) du set ORGIDBDY a un nom identique à celui d'une entité organisationnelle déjà décrite par les sets ORGID, ORGIDSUB, utiliser cette dernière, comme entité organisationnelle (droite ou gauche).
	 */
	public static void A_LINETYPE_Limite(MPGTWrapperSet s, MPGTWrapperField f){
		TypeLimite limite = SchemaFactory.eINSTANCE.createTypeLimite();
		limite.setNom(s.getField("3").getValue());
		log("TODO A_LINETYPE_Limite");
		
	}
	
	
	/*
	 * On valorise les attributs MPIA.AutreTypeElementControle.Categorie, MPIA.AutreTypeElementControle.SousCategorie de l'entité MPIA.AutreTypeElementControle et l'attribut MPIA.EtatOperationnel.Comportement de l'entité MPIA.EtatOperationnel associé à l'état opérationnel de l'élément de contrôle, avec le résultat de la CD=(AD3_1284_9;MPGT_AutreTypeElementControleCategorie;MPGT_AutreTypeElementControleSousCategorie;MPGT_Comportement).
	On lui affecte, par défaut, un comportement "Friend" (attribut MPIA.EtatOperationnel.Comportement = "FR" (Friend)), sauf si l'attribut MPIA.AutreTypeElementControle.SousCategorie prend la valeur "FLET" (FORWARD LINE OF ENEMY TROOPS).
	 */
	public static void A_LINETYPE_AutreElementControle(MPGTWrapperSet s, MPGTWrapperField f){
		log("TODO A_LINETYPE_AutreElementControle");
		
	}
	
	/*
	 * Conversion des trois coordonnées décrivant :
		- le point extême de l'un des rayons,
		- le centre du secteur,
		- le point extrême de l'autre rayon.
		
		En cinq caractéristiques décrivant :
		- le centre du secteur,
		- l'angle avec le nord de l'un des rayons,
		- la largeur angulaire du secteur,
		- le rayon maximal du secteur,
		- le rayon minimal du secteur.
	 */
	public static void A_Secteur(MPGTWrapperSet s, MPGTWrapperField f){
		
		log("TODO A_Secteur");
	}
	
	/*
	[Rêgle de champ]
	La CD "CD=(AD3_1135_28;Entité Sous-type d'équipement_Entité.Attribut)" permet de déterminer quelle est l'entité instanciable (et l'attribut associé) en fonction de la valeur de l'item du FFIRN/FUD 1135_28 :
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
	//Règle A_EQUIP
	/*
	function void A_EQUIP(MPGTWrapperSet s){
	   if("MPIA.AutreTypeEquipement".equals(s.getField("1135_28")){
	   
	   } else {
	   
	   }

	}
	*/

	
	
}
