package org.miliconvert.xsmt.mpgt.rules;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class EnsitrepFieldRules extends InterDomaineFieldRules{

	
	/**
	 * Vérifier que, au moins, l'une des 2 zones 1 (REPORTABLE ITEM CODE (RIC)) ou 2 (SHORT TITLE) est non vide :
	- Si oui, tester s'il existe déjà un "Type d'arme" de catégorie ""AD" (Air-defence) et de sous-catégorie est "ADMLSR" (Air-defence missile launcher, short range) et dont l'attribut MPIA.TypeMateriel.CodeRIC est égal au contenu de la zone 1 ou l'attribut MPIA.RacineOperationnelle.Nom est égal au contenu de la zone 2 :
	  - Si oui , utiliser cet "Type d'arme" pour enrichir les dotations effective et théorique de l'unité définie par le set EOGID,
	  - Si non créer un "Type d'arme", de catégorie "AD" (Air-defence) et de sous-catégorie est "ADMLSR" (Air-defence missile launcher, short range) et l'utiliser pour enrichir les dotations effective et théorique de l'unité.
	- Si non, générer un warning et ne pas prendre en compte cette instance du set 1AMMOH.
	Vérifier s'il existe déjà un "Type de système d’arme" dont l'attribut MPIA.RacineOperationnelle.Nom est égale à la zone 3 (WEAPON SYSTEM SHORT NAME) et associé (association "peut être embarqué par") au "Type d'arme" ci-dessus :
	- si oui, ne rien faire,
	- si non, créer le "Type de système d’arme", renseigner l'attribut MPIA.RacineOperationnelle.Nom avec la valeur de la zone 3 (WEAPON SYSTEM SHORT NAME) et créer la relation entre le "Type d'arme" précédent et le "Type de système d’arme".
	 * @param s
	 * @param f
	 */
	public static void A_2SHORAD_ExisteEquipement(MPGTWrapperSet s, MPGTWrapperField f){
		
		
	}
	
	
	/**
	 * Vérifier que, au moins, l'une des 2 zones 1 (REPORTABLE ITEM CODE (RIC)) ou 2 (SHORT TITLE) est non vide :
		- Si oui, tester s'il existe déjà un "Type d'arme" dont l'attribut MPIA.TypeMateriel.CodeRIC est égal au contenu de la zone 1 ou l'attribut MPIA.RacineOperationnelle.Nom est égal au contenu de la zone 2 :
		  - Si oui, utiliser ce "Type d'arme" pour enrichir les dotations effective et théorique de l'unité définie par le set EOGID,
		  - Si non créer un "Type d'arme" et l'utiliser pour enrichir les dotations effective et théorique de l'unité.
		- Si non, générer un warning et ne pas prendre en compte cette instance du set 1FWPNS.
	 * @param s
	 * @param f
	 */
	public static void A_1FWPNS_ExisteEquipement(MPGTWrapperSet s, MPGTWrapperField f){}
	
	
	/**
	 * Vérifier que, au moins, l'une des 2 zones 1 (REPORTABLE ITEM CODE (RIC)) ou 2 (POL TYPE NAME) est non vide :
- Si oui, tester s'il existe déjà un "Autre type de consommable" dont l'attribut MPIA.TypeMateriel.CodeRIC est égal au contenu de la zone 1 ou l'attribut MPIA.RacineOperationnelle.Nom est égal au contenu de la zone 2 :
  - Si oui , utiliser cet "Autre type de consommable" pour enrichir la dotation effective de l'unité définie par le set EOGID,
  - Si non créer un "Autre type de consommable", de catégorie "POL" (POL) et l'utiliser pour enrichir la dotation effective de l'unité.
- Si non, générer un warning et ne pas prendre en compte cette instance du set 1POL.
	 * @param s
	 * @param f
	 */
	public static void A_1POL_ExisteConsommable(MPGTWrapperSet s, MPGTWrapperField f){
		
	}
	
	/**
	 * Vérifier que, au moins, l'une des 2 zones 1 (REPORTABLE ITEM CODE (RIC)) ou 2 (AMMUNITION SHORT TITLE/SPECIFICATION NAME) est non vide :
- Si oui, tester s'il existe déjà un "Type de munition" dont l'attribut MPIA.TypeMateriel.CodeRIC est égal au contenu de la zone 1 ou l'attribut MPIA.RacineOperationnelle.Nom est égal au contenu de la zone 2 :
  - Si oui ,  utiliser cet "Type de munition" pour enrichir la dotation effective de l'unité définie par le set EORGID,
  - Si non créer un "Type de munition" et l'utiliser pour enrichir la dotation effective de l'unité.
- Si non, générer un warning et ne pas prendre en compte cette instance du set 1AMMOH.
	 * @param s
	 * @param f
	 */
	public static void A_1AMMOH_ExisteConsommable(MPGTWrapperSet s, MPGTWrapperField f){}

	
	

}
