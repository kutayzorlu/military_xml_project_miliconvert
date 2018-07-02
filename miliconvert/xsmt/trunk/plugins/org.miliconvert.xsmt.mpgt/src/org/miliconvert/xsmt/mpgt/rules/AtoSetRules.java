package org.miliconvert.xsmt.mpgt.rules;

import mpia.meta.TypeAssociation;
import mpia.schema.TypeAutreElementControle;
import mpia.schema.TypeObjectifActivite;
import mpia.schema.TypePersonne;
import mpia.schema.TypePlanificationOperation3D;
import mpia.schema.TypeUnite;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class AtoSetRules extends CommonSetRules{

	private static TypeUnite unite;
	
	
	/**
	 * 
	 * @param s
	 * Pour chaque répétition du groupe, on crée une instance de la classe 
	 * MPIA.AssociationFonctionnelleActivite associée l'instance courante de MPGT.PlanificationOperation3D 
	 * via le lien EstSujet{MPIA.AssociationFonctionnelleActivite}. 
	 * Une utilise cette instance pour l'analyse de tous les champs du groupe
	 *  (c.-à-d. chaque fois que le chemin commence par EstSujet{MPIA.AssociationFonctionnelleActivite}).
	 */
	public static void A_ALLOC(MPGTWrapperSet s){
		log("A_ALLOC");
		
	}
	
	
	
	/**
	 * On crée de nouvelles instances de l'entité MPIA.Unite. 
	 * Ces instances seront liées à des instances de MPGT.MissionAir et de MPGT.MissionASA définis plus tard dans le message.
	 * @param s
	 * @throws Exception 
	 */
	public static void A_TASKUNIT(MPGTWrapperSet s) throws Exception{
		log("A_TASKUNIT");
		unite = (TypeUnite) engine.findOrCreateSetEntities("Unite", s.getRacineOperationnel().getValue());
		s.setSetInstance(unite);
	}
	
	/**
	 * On créé une instance de  MPIA.AutreElementControle associée via le lien 
	 * APourObjectif{MPIA.ObjectifActivite}#AssocieCommeInstanceObjet{MPIA.AutreElementControle} 
	 * @param s
	 * @throws Exception 
	 */
	public static void A_ZONEDEFENSE(MPGTWrapperSet s) throws Exception{
		log("A_ZONEDEFENSE");
		TypeAutreElementControle autreElementControle = (TypeAutreElementControle) engine.findOrCreateFieldEntities("AutreElementControle");
		TypeObjectifActivite objectifActivite = (TypeObjectifActivite) engine.findOrCreateFieldEntities("ObjectifActivite");
		objectifActivite.setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation) engine.createAssoc(objectifActivite,autreElementControle,"AssocieCommeObjectifActivite_ObjectifActivite",false));
		
		TypePlanificationOperation3D typePlanificationOperation3D = (TypePlanificationOperation3D) s.getSetInstance();
		typePlanificationOperation3D.getAPourObjectifObjectifActivite().add((TypeAssociation) engine.createAssoc(typePlanificationOperation3D, objectifActivite,"EstObjectifPour_Activite", false));
	}
	
	/**
	 * On crée de nouvelles instances de l'entité MPIA.Personne. 
	 * Ces instances seront liées à des instances de MPGT.MissionAir et de MPGT.MissionASA définis plus tard dans le message.
	 * @param s
	 * @throws Exception 
	 */
	public static void A_POCGROUPE(MPGTWrapperSet s) throws Exception{
		log("A_POCGROUPE");
		TypePersonne personne = (TypePersonne) engine.findOrCreateSetEntities("Personne", s.getRacineOperationnel().getValue());
		s.setSetInstance(personne);
		
	}
	

	
	
	/**
	 * On crée une nouvelle instance de MPGT.Mission 
	 * possédant un agrégat MPGT.MissionAir
	 *  et lié à l'instance courante de MPGT.Mission
	 *   via le lien EstSujet{MPIA.AssociationFonctionnelleActivite}#AssocieCommeObjet{MPGT.Mission} avec 
	 *   : EstSujet{MPIA.AssociationFonctionnelleActivite}#MPIA.AssociationFonctionnelleActivite.Categorie = 1 (Has as a sub-ACTION) . 
	 *   De plus, l'agrégat MPGT.MissionAir associé à la nouvelle instance de mission vérifie la condition 
	 *   : EstSujet{MPIA.AssociationFonctionnelleActivite}#AssocieCommeObjet{MPGT.Mission}#APourCaracteristiqueMissionAir{MPGT.MissionAir}#MPGT.MissionAir.Categorie = 20001 (Mission air)
	 * @param s
	 */
	public static void A_MISSIONAIR(MPGTWrapperSet s){
		log("A_MISSIONAIR");
		
	}
	
	
	/**
	 * On créé une nouvelle instance de MPGT.Mission possédant un agrégat MPGT.MissionASA et lié à l'instance courante de MPGT.Mission via 
	 * le lien EstSujet{MPIA.AssociationFonctionnelleActivite}#AssocieCommeObjet{MPGT.Mission} avec : EstSujet{MPIA.AssociationFonctionnelleActivite}#MPIA.AssociationFonctionnelleActivite.Categorie = 1 (Has as a sub-ACTION)
	 * @param s
	 */
	public static void A_MISSIONSOLAIR(MPGTWrapperSet s){
		log("A_MISSIONSOLAIR");
	}
	
	/**
	 * Lier l'instance de MPIA.Unite créée par le précédent set TASKUNIT
	 *  (segment TASKUNIT) s'il en existe un, avec l'objet MPGT.MissionAsa suivant le lien "Force exécutante/Force".
	 * @param s
	 */
	public static void A_FORCEEXE1(MPGTWrapperSet s){
		log("A_FORCEEXE1");
	}
	
	
	public static void ALIENOBJAERIEN(MPGTWrapperSet s){
		log("ALIENOBJAERIEN");
	}
	
}
