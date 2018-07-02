package org.miliconvert.xsmt.mpgt.rules;

import mpia.schema.TypeAutreAdresse;
import mpia.schema.TypePersonne;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class AtoFieldRules extends Common3dFieldRules{

	/**
	 * On créé une instance de  MPIA.AutreAdresse
	 *  associée via le lien 
	 *  AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse} 
	 *  et satisfaisant la condition 
	 *  AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseElectronique}#FournitAccesA{MPIA.ServiceReseau}#MPIA.AutreAdresse.Categorie = 29 (Link 16, data), 
	 *  la valeur du champ servant à renseigner AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseElectronique}#MPIA.AdresseElectronique.AdresseReseau
	 * @param s
	 * @param f
	 * @throws Exception 
	 */
	public static void A_L16VOICE(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
//		TypePersonne personne = (TypePersonne) s.getSetInstance();
//		TypeAssociationInstanceObjetAdresse tyAssociationInstanceObjetAdresse = (TypeAssociationInstanceObjetAdresse) engine.findOrCreateFieldEntities("AssociationInstanceObjetAdresse", 0);
//		TypeAutreAdresse autreAdresse =  (TypeAutreAdresse) engine.findOrCreateFieldEntities("AssociationInstanceObjetAdresse", 1);
//		
//		personne.getAssocieCommeAdresseAssociationInstanceObjetAdresse()
//		.add((TypeAssociation) engine.createAssoc(personne, tyAssociationInstanceObjetAdresse,"AssocieCommeSujet_InstanceObjet" , false));
//		tyAssociationInstanceObjetAdresse.setAssocieCommeObjetAdresse((TypeAssociation)
//		engine.createAssoc(tyAssociationInstanceObjetAdresse, autreAdresse, "EstAdresse_AssociationInstanceObjetAdresse", false));
		
		
	}
	
	
	public static void AVERIFPACK(MPGTWrapperSet s, MPGTWrapperField f){}
	
	
	/**
	 * On créé une instance de  MPIA.AutreAdresse 
	 * associée via le lien AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse} 
	 * et satisfaisant la condition 
	 * AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse}#MPIA.AutreAdresse.Categorie = 10001 (Fax), 
	 * la valeur du champ servant à renseigner AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse}#MPIA.Adresse.Libelle
	 * @param s
	 * @param f
	 */
	public static void A_FAX(MPGTWrapperSet s, MPGTWrapperField f){
		
		
	}
	
	/**
	 * On crée une instance de  MPIA.AutreAdresse associée via le lien AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse} et satisfaisant la condition AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse}#MPIA.AutreAdresse.Categorie = 40002 (Secure fax), la valeur du champ servant à renseigner AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse}#MPIA.AutreAdresse.Libelle
	 * @param s
	 * @param f
	 */
	public static void A_SECFAX(MPGTWrapperSet s, MPGTWrapperField f){
		
	}
	
	/**
	 * 
	 * @param s
	 * @param f
	 */
	public static void ATYPEEQUIP(MPGTWrapperSet s, MPGTWrapperField f){
		
	}
	
	/**
	 * On créé une instance de MPIA.AdresseRadio 
	 * associée via le lien AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseRadio} et à laquelles est associée au moins une instance de MPIA.Frequence à travers le lien AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseRadio}#APourFrequence{MPIA.Frequence}. Pour chaque instance de AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseRadio}#APourFrequence{MPIA.Frequence}, l'attribut AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseRadio}#APourFrequence{MPIA.Frequence}#MPIA.Frequence.NomCode est renseigné avec la valeur du champ 5.D
	 * @param s
	 * @param f
	 */
	public static void A_CODEFREQUENCE(MPGTWrapperSet s, MPGTWrapperField f){}
	
	/**
	 * Convertir la valeur de la zone 5.C.1 selon la valeur (unité) de la zone 5.C.2.
	 * @param s
	 * @param f
	 */
	public static void A_CONVFREQ(MPGTWrapperSet s, MPGTWrapperField f){}
	
	/**
	 * On crée une instance de MPIA.AdresseRadio associée via le lien AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseRadio} et à laquelles est associée au moins une instance de MPIA.Frequence à travers le lien AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseRadio}#APourFrequence{MPIA.Frequence}. Pour chaque instance de AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseRadio}#APourFrequence{MPIA.Frequence}, l'attribut AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseRadio}#APourFrequence{MPIA.Frequence}#MPIA.Frequence.Frequence est renseigné avec la valeur de la sous zone 5.C.2
	 * @param s
	 * @param f
	 */
	public static void A_RADIOFREQ(MPGTWrapperSet s, MPGTWrapperField f){}
	
	/**
	 * On crée une instance de  MPIA.AutreAdresse associée via le lien AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse} et satisfaisant la condition AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse}#MPIA.AutreAdresse.Categorie = 10003 (Phone), la valeur du champ servant à renseigner AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse}#MPIA.Adresse.Libelle
	 * @param s
	 * @param f
	 */
	public static void A_PHONE(MPGTWrapperSet s, MPGTWrapperField f){}
	
	/**
	 * On crée une instance de  MPIA.AutreAdresse associée via le lien AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse} et satisfaisant la condition AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseElectronique}#FournitAccesA{MPIA.ServiceReseau}#MPIA.AutreAdresse.Categorie = 2 (Electronic mail), la valeur du champ servant à renseigner AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AdresseElectronique}#MPIA.AdresseElectronique.AdresseReseau
	 * @param s
	 * @param f
	 */
	public static void A_MAIL(MPGTWrapperSet s, MPGTWrapperField f){}
	
	/**
	 * Créer une instance de MPIA.Unite
		Si l'alternat A est utilisé pour la zone 3, utiliser la valeur pour renseigner l'attribut MPIA.RacineOperationnelle.Nom
		Si l'alternat B est utilisé pour la zone 3, générer une valeur auto pour le MPIA.RacineOperationnelle.Nom et renseigner EstObjet{MPIA.AssociationInstanceObjetInstanceObjet}#APourSujet{MPIA.Unite}#AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#MPIA.AssociationInstanceObjetAdresse.Designation avec la valeur de la zone 3.
		Si l'alternat C est utilisé pour la zone 3,  MPIA.RacineOperationnelle.Nom prend la valeur de cette zone et on renseigne également l'attributs MPGT.EntiteOrganisationnelle.CodeIdentification avec la valeur de la zone 3.
	 * @param s
	 * @param f
	 */
	public static void A_UNITEPOC(MPGTWrapperSet s, MPGTWrapperField f){}
	
	/**
	 * On crée une instance de  MPIA.AutreAdresse associée via le lien AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse} et satisfaisant la condition AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse}#MPIA.AutreAdresse.Categorie = 20001 (SPHONE), la valeur du champ servant à renseigner AssocieCommeAdresse{MPIA.AssociationInstanceObjetAdresse}#AssocieCommeObjet{MPIA.AutreAdresse}#MPIA.Adresse.Libelle
	 * @param s
	 * @param f
	 */
	public static void A_SECPHONE(MPGTWrapperSet s, MPGTWrapperField f){}
	
	
	
	
}
