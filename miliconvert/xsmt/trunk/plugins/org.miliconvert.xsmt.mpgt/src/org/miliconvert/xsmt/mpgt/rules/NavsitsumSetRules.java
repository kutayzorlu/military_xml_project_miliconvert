package org.miliconvert.xsmt.mpgt.rules;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class NavsitsumSetRules extends InterDomaineSetRules{

	
	/**
	 * Chaque répétition du groupe de champs permet de créer ou de récupérer :
		- soit un Bâtiment (instance MPIA.Batiment), si la zone 3 utilise l'alternat A "SHIP NAME"
		- soit un Type d'équipement de "Type Batiment de surface" (instance MPIA.TypeBatimentSurface) si la zone 3 utilise l'alternat B "NUMBER OF SHIPS"
		
		Les Bâtiments sont rajoutés à la liste des "Bâtiments participants" (relation APourBatimentsParticipants) de l'articulation marine en cours
		Les Types d'équipement sont rajoutés à la liste des "a pour composition" (association APourComposition{MPIA.TypeBatimentParticipant}#EstType{MPIA.TypeBatimentSurface}
		
		Dans les 2 cas, les sous zones de la zone 2 (si renseignées) permettent de créer ou de récupérer une instance "Type de batiment de surface" (MPIA.TypeBatimentSurface) pour laquelle on valorise les attributs MPIA.TypeBatimentSurface.Categorie et MPIA.TypeBatiment.Complements. 
		
		La zone 3 permet de valoriser :
		- soit le Nom du Bâtiment (alternat A). 
		- soit le nombre du "type de bâtiment de surface participant" à l'articulation marine (alternat B).
		
		Dans le cas du bâtiment, on vérifie si il existe un bâtiment de même nom :
		- si oui, le récupérer et vérifier que pavillons (FLAG) sont identiques.
		- si il n'existe pas de bâtiment de même nom on crée une entité MPIA.Batiment.
		Si le bâtiment existe déjà, vérifier si il existe un type de bâtiment de surface associé. Si le bâtiment est créé ou si le bâtiment existe déjà, mais n'est pas associé à un type bâtiment, vérifier si la zone 2 est renseignée (différente de '-') :
		- dans ce cas, vérifier si le type de bâtiment existe déjà, si celui-ci n'existe pas, créer un type de bâtiment de surface dans lequel on renseigne les attributs MPIA.TypeBatimentSurface.Categorie et MPIA.TypeBatiment.Complements.
		- associer le type de bâtiment au bâtiment.
	 * @param s
	 * @throws Exception
	 */
	public static void A_SHIPS(MPGTWrapperSet s) throws Exception{}
	
	
	/**
	 * Pour chaque répétition du set SMRY, on crée une instance MPIA.Action (s'il n'existe pas déjà une instance ayant la même valeur pour l'attribut MPIA.Action.SousActivite) et une entité MPIA.AutreElementControle (s'il n'existe pas déjà une instance ayant la même valeur pour l'attribut {MPIA.AutreElementControle}#MPIA.RacineOperationnelle.Nom) et dont le type associé MPIA.AutreTypeElementControle a comme catégorie "MARINE" et sous catégorie "GENARE". 
		La zone est considée comme l'objectif de l'action.
	 * @param s
	 * @throws Exception
	 */
	public static void A_SMRY(MPGTWrapperSet s) throws Exception{}
	
	/**
	 * On utilise la valeur de la zone 2 pour créer :
		- dans le cas de l'alternat A, une entité MPIA.Batiment (si celle-ci n'existe) identifiée par la zone 2A, associée à une entité  MPIA.TypeSousMarin.
		- dans le cas de l'alternat B, une entité MPIA.ArticulationMarine (si celle-ci n'existe pas) identifiée par les informations des sous-zones de la zone 2B. Si l'entité  MPIA.ArticulationMarine vient d'être créée, on crée de plus une entité MPIA.Batiment (non nommée), associée à une entité  MPIA.TypeSousMarin. Cette entité MPIA.Batiment est associée comme "APourArticulation" à l'entité MPIA.ArticulationMarine précédente.
		
		On utilise la valeur de la zone 1, pour valoriser le pavillon ("ObjetMPIA.EntitePolitique{MPIA.Affiliation}") associé à l'entité MPIA.Batiment.
		
		On utilise la valeur de la zone 3 pour valoriser la localisation de l'unité amphibie : 
		- dans le cas des alternats A, B, C : localisation géoréférencée,
		- dans le cas de l'alternat D : localisation sur un port. Création d'une association "instance objet - instance objet" entre l'unité amphibie et le port.
		- dans le cas de l'alternat 3E : localisation sur un site de mouillage. Création d'une association "instance objet - instance objet" entre l'unité amphibie et le site de mouillage.
		
		On ajoute l'unité amphibie à la liste des unités "sous contrôle"  de l'autorité de contrôle décrite par le set CONTR de niveau supérieur.
		
		Au niveau du segment 1PHIB, le set SAIL définit la position pour l'ensemble des unités amphibies décrites au niveau du set 1PHIB : création d'autant d'instances des entités MPIA.AssocInstanceObjetLocalisation / MPIA.AssociationInstanceObjetInstanceObjet qu'il y a d'unités amphibies à localiser.
	 * @param s
	 * @throws Exception
	 */
	public static void A_1APHIB(MPGTWrapperSet s) throws Exception{}
	
	/**
	 * On utilise la valeur de la zone 2 pour créer :
		- dans le cas de l'alternat A, une entité MPIA.Batiment (si celle-ci n'existe) identifiée par la zone 2A, associée à une entité  MPIA.TypeSousMarin.
		- dans le cas de l'alternat B, une entité MPIA.ArticulationMarine (si celle-ci n'existe pas) identifiée par les informations des sous-zones de la zone 2B. Si l'entité  MPIA.ArticulationMarine vient d'être créée, on crée de plus une entité MPIA.Batiment (non nommée), associée à une entité  MPIA.TypeSousMarin. Cette entité MPIA.Batiment est associée comme "APourArticulation" à l'entité MPIA.ArticulationMarine précédente.
		
		On utilise la valeur de la zone 1, pour valoriser le pavillon ("ObjetMPIA.EntitePolitique{MPIA.Affiliation}") associé à l'entité MPIA.Batiment.
		
		On utilise la valeur de la zone 3 pour valoriser la localisation de l'unité amphibie : 
		- dans le cas des alternats A, B, C : localisation géoréférencée,
		- dans le cas de l'alternat D : localisation sur un bâtiment de surface. Création d'une entité MPIA.Batiment (si celle-ci n'existe pas) identifiée par la valeur de la zone 3D, associée si nécessaire à une entité MPIA.TypeBatimentSurface. Création d'une association "instance objet - instance objet" entre l'unité amphibie et le bâtiment de surface.
		- dans le cas de l'alternat 3E : localisation sur un site de mouillage. Création d'une association "instance objet - instance objet" entre l'unité amphibie et le site de mouillage.
		
		On ajoute l'unité amphibie à la liste des unités "sous contrôle"  de l'autorité de contrôle décrite par le set CONTR de niveau supérieur.
		
		Au niveau du segment APHIB, le set SAIL définit la route pour l'ensemble des unités amphibies décrites au niveau du set APHIB : création d'autant d'instances des entités MPIA.AssocInstanceObjetLocalisation / MPIA.AssociationInstanceObjetInstanceObjet qu'il y a d'unités amphibies à localiser.
	 * @param s
	 * @throws Exception
	 */
	public static void A_APHIB(MPGTWrapperSet s) throws Exception{}
	
	/**
	 * Le set contient les mêmes champs que le set SHIPS
		Les traitements d'analyse sont identiques à ceux décrits dans la règle A_SHIPS
	 * @param s
	 * @throws Exception
	 */
	public static void A_1SHIPS(MPGTWrapperSet s) throws Exception{}
	
	/**
	 * Chaque répétition du segment NSIT donne lieu à la création d'un bâtiment à rajouter à la liste des :
		- des "bâtiments sous contrôle" de la structure organisée, si l'autorité de de contrôle est décrite sous la forme d'une structure organisée (segment CONTR englobant),
		- des "bâtiments participants" de l'Articulation marine, si l'autorité de contrôle est décrite sous la forme d'une articulation marine (segment CONTR englobant).
		
		Si un bâtiment existe déjà avec le nom donné dans la zone 3, le récupérer (on vérifie dans ce cas, que le pavillon (FLAG) est identique au précédent), sinon, créer un bâtiment de surface et lui affecter ce nom. 
		Si le bâtiment existe déjà, vérifier si il existe un type de bâtiment de surface associé.
		Si bâtiment est créé ou si le bâtiment existe déjà, mais n'est pas associé à un type bâtiment de surface, vérifier si la zone 2 est renseignée (différente de '-') :
		- dans ce cas, vérifier si le type de bâtiment de surface existe déjà. Si celui-ci n'existe pas, créer un type de bâtiment de surface dans lequel on renseigne les attributs MPIA.TypeBatimentSurface.Categorie et MPIA.TypeBatiment.Complements.
		- associer le type de bâtiment de surface au bâtiment.
	 * @param s
	 * @throws Exception
	 */
	public static void A_NSIT(MPGTWrapperSet s) throws Exception{}
	
	/**
	 * répétition du set OPCASM permet de mettre à jour les attributs Etat opérationnel (MPIA.EtatOperationnelMateriel.EtatOperationnel) et Qualificatif état d'un Bâtiment (MPIA.EtatOperationnelMateriel.QualificatifEtat), a priori,  précédemment référencé dans le message (sets SHIPS, 1SHIPS et NSIT).

		On ne traite que les sets pour lesquels la zone 4 utilise l'alternat A (SHIP NAME) renseignée.
		Les instances du set OPCASM dont la zone 4 utilise l'alternat B (NUMBER OF SHIPS) ne sont pas traitées.
		
		On utilise la valeur de la zone 4 pour créer ou récupérer un Bâtiment. On utilise la valeur de la zone 2 pour renseigner le pavillon du bâtiment courant, si le pavillon n'est pas déjà renseigné.
		
		On utilise la valeur de la zone 3 (NAVAL SHIP TYPE) pour créer éventuellement un type de bâtiment de surface et l'associer au bâtiment courant, si celui-ci n'a pas déjà un type de bâtiment de surface associé.
	 * @param s
	 * @throws Exception
	 */
	public static void A_OPCASM(MPGTWrapperSet s) throws Exception{}
}
