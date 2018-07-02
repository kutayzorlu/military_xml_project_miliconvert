/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type MPGT Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getGroup <em>Group</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getActionRenseignement <em>Action Renseignement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getActivitePosture <em>Activite Posture</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAeronef <em>Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAlerteFrappeNucleaireAmie <em>Alerte Frappe Nucleaire Amie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAllure <em>Allure</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAnnulationInterdictionTir <em>Annulation Interdiction Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAppuiFeuHelicoptere <em>Appui Feu Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getArticulationASS <em>Articulation ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getArticulationLogistique <em>Articulation Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssocEntiteOrgTypeEntiteOrg <em>Assoc Entite Org Type Entite Org</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationActionAction <em>Association Action Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationActionAutreEvenement <em>Association Action Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationActionEvenementNRBC <em>Association Action Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationAutreEvenementAction <em>Association Autre Evenement Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationAutreEvenementAutreEvenement <em>Association Autre Evenement Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationAutreEvenementEvenementNRBC <em>Association Autre Evenement Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationConflit3DMissionAerienne <em>Association Conflit3 DMission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationConsommablelMajeur <em>Association Consommablel Majeur</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationConvoiMouvementParRoute <em>Association Convoi Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationDepEvacuationDepEvacuation <em>Association Dep Evacuation Dep Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationElementControleEvenement <em>Association Element Controle Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationElementTopographieEvenement <em>Association Element Topographie Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEltCtrlEltCtrl <em>Association Elt Ctrl Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEltCtrlEltTopo <em>Association Elt Ctrl Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEltCtrlMateriel <em>Association Elt Ctrl Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEltCtrlSite <em>Association Elt Ctrl Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEltCtrlTypeEltCtrl <em>Association Elt Ctrl Type Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEltTopoSite <em>Association Elt Topo Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrgAction <em>Association Entite Org Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrganisationnellePlanOuOrdre <em>Association Entite Organisationnelle Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrgEltCtrl <em>Association Entite Org Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrgEltTopo <em>Association Entite Org Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrgEntiteOrg <em>Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrgEvenement <em>Association Entite Org Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrgMateriel <em>Association Entite Org Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrgObjetInconnu <em>Association Entite Org Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrgPersonne <em>Association Entite Org Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEntiteOrgSite <em>Association Entite Org Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEquipementlMajeur <em>Association Equipementl Majeur</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEvenementNRBCAction <em>Association Evenement NRBC Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEvenementNRBCAutreEvenement <em>Association Evenement NRBC Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEvenementNRBCEvenementNRBC <em>Association Evenement NRBC Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEvenementRENSAutreEvenement <em>Association Evenement RENS Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationEvenementRENSEvenementRENS <em>Association Evenement RENS Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationGroupeInfoOpsPlanOuOrdre <em>Association Groupe Info Ops Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationHoraireManoeuvre <em>Association Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationLivraisonLivaison <em>Association Livraison Livaison</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMaterielEltCtrl <em>Association Materiel Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMaterielEltTopo <em>Association Materiel Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMaterielEvenement <em>Association Materiel Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMaterielMateriel <em>Association Materiel Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMaterielMeteorologie <em>Association Materiel Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMaterielObjetInconnu <em>Association Materiel Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMaterielPersonne <em>Association Materiel Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMaterielSite <em>Association Materiel Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMaterielTypeMateriel <em>Association Materiel Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMesureCoordinationPlanFeux <em>Association Mesure Coordination Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMesureCoordMissionAerienne <em>Association Mesure Coord Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMeteorologieSite <em>Association Meteorologie Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMissionAerienneMissionAerienne <em>Association Mission Aerienne Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMissionGenieMissionGenie <em>Association Mission Genie Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMissionMeleeAction <em>Association Mission Melee Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMissionMouvementMissionMouvement <em>Association Mission Mouvement Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMissionRenseignementAction <em>Association Mission Renseignement Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMissionRensObjPlanTraitementObj <em>Association Mission Rens Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMissionRensObjTraitementObj <em>Association Mission Rens Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationMouvementParRouteMouvementParRoute <em>Association Mouvement Par Route Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationObjectifCiblageDocument <em>Association Objectif Ciblage Document</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationObjetInconnuEltCtrl <em>Association Objet Inconnu Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationObjetInconnuEltTopo <em>Association Objet Inconnu Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationObjetInconnuSite <em>Association Objet Inconnu Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationObservationObservation <em>Association Observation Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationParagraphePOparagraphePO <em>Association Paragraphe POparagraphe PO</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonneEltCtrl <em>Association Personne Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonneEltTopo <em>Association Personne Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonneEvenement <em>Association Personne Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonneMateriel <em>Association Personne Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonneMissionAir <em>Association Personne Mission Air</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonneObjetInconnu <em>Association Personne Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonnePersonne <em>Association Personne Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonnePlanifOperation3D <em>Association Personne Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonneSite <em>Association Personne Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPersonneTypePersonne <em>Association Personne Type Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPlanificationOperation3DMissionAir <em>Association Planification Operation3 DMission Air</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPlanificationOperation3DMissionASA <em>Association Planification Operation3 DMission ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPlanOuOrdrePlanOuOrdre <em>Association Plan Ou Ordre Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationPlanTraitementObjTraitementObj <em>Association Plan Traitement Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationRenseignementObjMisRenseignementObj <em>Association Renseignement Obj Mis Renseignement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationSiteEltCtrl <em>Association Site Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationSiteEltTopo <em>Association Site Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationSiteEvenement <em>Association Site Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationSiteMateriel <em>Association Site Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationSiteMeteorologie <em>Association Site Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationSiteObjetInconnu <em>Association Site Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationSiteSite <em>Association Site Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationSiteTypeSite <em>Association Site Type Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationSyntheseDetectionsEvenementNRBC <em>Association Synthese Detections Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationTraitementObjPlanTraitementObj <em>Association Traitement Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteAppuiFeuHelicoptere <em>Association Unite Appui Feu Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteAutreMissionLog <em>Association Unite Autre Mission Log</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteLivraison <em>Association Unite Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionAcqASS <em>Association Unite Mission Acq ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionAerienne <em>Association Unite Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionAir <em>Association Unite Mission Air</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionALATattaque <em>Association Unite Mission ALA Tattaque</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionASA <em>Association Unite Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionEscorteAF <em>Association Unite Mission Escorte AF</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionGenie <em>Association Unite Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionMelee <em>Association Unite Mission Melee</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionRensObj <em>Association Unite Mission Rens Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionSic <em>Association Unite Mission Sic</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionTranspTact <em>Association Unite Mission Transp Tact</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMissionUniteAntichar <em>Association Unite Mission Unite Antichar</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteMouvementParRoute <em>Association Unite Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUnitePlanFeux <em>Association Unite Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUnitePlanifOperation3D <em>Association Unite Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationUniteRenforcementsFeux <em>Association Unite Renforcements Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssocSymboleTactique <em>Assoc Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreAction <em>Autre Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreAffiliation <em>Autre Affiliation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreCapteurRENS <em>Autre Capteur RENS</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreEvenementNucleaire <em>Autre Evenement Nucleaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreMenace <em>Autre Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreMission <em>Autre Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreMissionALAT <em>Autre Mission ALAT</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreMissionLogistique <em>Autre Mission Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreTypeConsommableSystemeArme <em>Autre Type Consommable Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getBesoinsEnRenseignements <em>Besoins En Renseignements</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getBilanTirsASS <em>Bilan Tirs ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getBrancheNavigation <em>Branche Navigation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getBulletinSondage <em>Bulletin Sondage</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteHebergement <em>Capacite Hebergement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteMaintenance <em>Capacite Maintenance</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteManutention <em>Capacite Manutention</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteOperationnelle <em>Capacite Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteSoutien <em>Capacite Soutien</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteTransmission <em>Capacite Transmission</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapteurDrone <em>Capteur Drone</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapteurLocalisationRadioelectrique <em>Capteur Localisation Radioelectrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapteurRadar <em>Capteur Radar</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapteurROHUM <em>Capteur ROHUM</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCarnetPoints <em>Carnet Points</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getChargementMateriel <em>Chargement Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCompteRenduTir <em>Compte Rendu Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getConflit3D <em>Conflit3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getConsigne <em>Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getConsigneLutteAntiaerienneTTA <em>Consigne Lutte Antiaerienne TTA</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getConsigneTir <em>Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCouvertureAerienne <em>Couverture Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCouvertureASA <em>Couverture ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDegreClassification <em>Degre Classification</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDemandeTir <em>Demande Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDepannageEvacuation <em>Depannage Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDeploiementMARTHA <em>Deploiement MARTHA</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDeploiementMoyensASAc3d <em>Deploiement Moyens AS Ac3d</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDetachementIdentifie <em>Detachement Identifie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDetachementNonIdentifie <em>Detachement Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDirectiveTir <em>Directive Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getEchelon <em>Echelon</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getElementMeteo <em>Element Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getEnnemiFutur <em>Ennemi Futur</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getEnTeteParagraphePlanOuOrdre <em>En Tete Paragraphe Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getEtudeDispersion <em>Etude Dispersion</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getEvenementRENS <em>Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getFaitRenseignement <em>Fait Renseignement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getHoraireManoeuvre <em>Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getHypotheseActionENIouAutre <em>Hypothese Action EN Iou Autre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getIndicateurGeostatistique <em>Indicateur Geostatistique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getInterdictionTir <em>Interdiction Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getInterventionGenerale <em>Intervention Generale</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getInterventionType <em>Intervention Type</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getItineraireOuModeleCheminementALAT <em>Itineraire Ou Modele Cheminement ALAT</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getJonctionReseau <em>Jonction Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getLiaisonReseau <em>Liaison Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getLigneLivraison <em>Ligne Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getListeMesuresCoordination3D <em>Liste Mesures Coordination3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getListeObjectifsPlanifies <em>Liste Objectifs Planifies</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getLivraison <em>Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMementoGenie <em>Memento Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMenaceAerienne <em>Menace Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMenaceASAeni <em>Menace AS Aeni</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMenaceDetection <em>Menace Detection</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMenaceFeuxENI <em>Menace Feux ENI</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMenaceGenieENI <em>Menace Genie ENI</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMenacesAeriennesMissionALAT <em>Menaces Aeriennes Mission ALAT</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMesuresProtectionElectronique <em>Mesures Protection Electronique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMiseEnOeuvreROE <em>Mise En Oeuvre ROE</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionAcquisitionASS <em>Mission Acquisition ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionAerienne <em>Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionAir <em>Mission Air</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionALATattaque <em>Mission ALA Tattaque</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionASA <em>Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionEscorteOuAppuiFeu <em>Mission Escorte Ou Appui Feu</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionFeux <em>Mission Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionGenie <em>Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionI3D <em>Mission I3D</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionMaintenance <em>Mission Maintenance</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionMelee <em>Mission Melee</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionMouvement <em>Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionRavitaillement <em>Mission Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionRenseignement <em>Mission Renseignement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionRenseignementObjectif <em>Mission Renseignement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionSarCombat <em>Mission Sar Combat</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionSic <em>Mission Sic</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionTransportTactique <em>Mission Transport Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMissionUniteAntichar <em>Mission Unite Antichar</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getModule <em>Module</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMouvementParRoute <em>Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMoyensAeriensDontBeneficieGU <em>Moyens Aeriens Dont Beneficie GU</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMoyensGenie <em>Moyens Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getObjetInconnu <em>Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getObjetLibre <em>Objet Libre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getObservation <em>Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getOrdre <em>Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getOrganisationSoutienMedical <em>Organisation Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getOuvrageGenie <em>Ouvrage Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getOverlay <em>Overlay</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getParagraphePlanOuOrdre <em>Paragraphe Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPertesSante <em>Pertes Sante</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPionReseau <em>Pion Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPlan <em>Plan</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPlanFeux <em>Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPlanificationCelluleSoutien <em>Planification Cellule Soutien</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPlanificationMouvement <em>Planification Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPlanificationOperation3D <em>Planification Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPlanNumerotationObjectifs <em>Plan Numerotation Objectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPlanTraitementObjectifs <em>Plan Traitement Objectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPointAxe <em>Point Axe</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPointHaut <em>Point Haut</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPointTrajectoire <em>Point Trajectoire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPolitiqueTir <em>Politique Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPorteurSystemeArme <em>Porteur Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPossibilitesENI3d <em>Possibilites ENI 3d</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPosteTir <em>Poste Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPotentielENIfeuSolSol <em>Potentiel EN Ifeu Sol Sol</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPrelevementSubordonneIdentifie <em>Prelevement Subordonne Identifie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPrelevementSubordonneNonIdentifie <em>Prelevement Subordonne Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPrevisionObservation <em>Prevision Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPrioriteTactique <em>Priorite Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPrioriteTechnique <em>Priorite Technique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getProcedureIFF <em>Procedure IFF</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getProjetCimic <em>Projet Cimic</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRaidAerienEnnemi <em>Raid Aerien Ennemi</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRapportForce <em>Rapport Force</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRattachementLogistiqueParticulier <em>Rattachement Logistique Particulier</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRavitaillement <em>Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRechange <em>Rechange</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRenforcementsFeux <em>Renforcements Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRenseignementObjectif <em>Renseignement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getReservationUnite <em>Reservation Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRouteHelicoptereALAT <em>Route Helicoptere ALAT</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSituationConsommable <em>Situation Consommable</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSituationEffectif <em>Situation Effectif</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSituationEquipement <em>Situation Equipement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSituationRadiation <em>Situation Radiation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSituationVehicule <em>Situation Vehicule</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymboleAnnotation <em>Symbole Annotation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymboleCercle <em>Symbole Cercle</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymboleFleche <em>Symbole Fleche</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymboleImage <em>Symbole Image</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymboleLineique <em>Symbole Lineique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymboleNote <em>Symbole Note</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymbolePoint <em>Symbole Point</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymbolePostIt <em>Symbole Post It</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymboleTactique <em>Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSymboleTexte <em>Symbole Texte</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSyntheseDetections <em>Synthese Detections</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSystemeAtterrissageAuxInstruments <em>Systeme Atterrissage Aux Instruments</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTraitementObjectif <em>Traitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTravailAideDeploiement <em>Travail Aide Deploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeArmementSystemeArme <em>Type Armement Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeCapteur <em>Type Capteur</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeEquipementSystemeArme <em>Type Equipement Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeItineraire <em>Type Itineraire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeMunitionSystemeArme <em>Type Munition Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeOrganisationMilitaireExecutive <em>Type Organisation Militaire Executive</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypePorteur <em>Type Porteur</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getVarianteTravail <em>Variante Travail</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getVehicule <em>Vehicule</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getVol <em>Vol</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getZoneAlat <em>Zone Alat</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getZoneFonctionnelleLogistique <em>Zone Fonctionnelle Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getZoneLogistique <em>Zone Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getZoneMiseATerre <em>Zone Mise ATerre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getZoneRecherche <em>Zone Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAdresseElectronique <em>Adresse Electronique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAdressePhysique <em>Adresse Physique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAdresseRadio <em>Adresse Radio</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAerodrome <em>Aerodrome</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAireStationnement <em>Aire Stationnement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getArticulationMarine <em>Articulation Marine</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getArticulationTerre <em>Articulation Terre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssocActiviteContexte <em>Assoc Activite Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssocContexteContexte <em>Assoc Contexte Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssocContexteInstanceObjet <em>Assoc Contexte Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationActiviteCapacite <em>Association Activite Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationAffiliationAffiliation <em>Association Affiliation Affiliation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationAffiliationInstanceObjet <em>Association Affiliation Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationAffiliationType <em>Association Affiliation Type</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationConsommation <em>Association Consommation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationContexteRapport <em>Association Contexte Rapport</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationDocumentCapacite <em>Association Document Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationGroupeInfoOpsEntiteOrganisationnelle <em>Association Groupe Info Ops Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationInstanceObjetAdresse <em>Association Instance Objet Adresse</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationInstanceObjetCapacite <em>Association Instance Objet Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationObjectifCiblageObjectifCiblage <em>Association Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationProfilDotationTheorique <em>Association Profil Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationProfilUnite <em>Association Profil Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationRacineOperationnelleDocument <em>Association Racine Operationnelle Document</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationTemporelleActivite <em>Association Temporelle Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssociationTypeCapacite <em>Association Type Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssocListeObjCandListeObjCand <em>Assoc Liste Obj Cand Liste Obj Cand</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAssocPisteAtterDirAppAir <em>Assoc Piste Atter Dir App Air</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreAdresse <em>Autre Adresse</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreArticulation <em>Autre Articulation</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreContexte <em>Autre Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreElementControle <em>Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreEvenement <em>Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreEvenementNRBC <em>Autre Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreEvenementRadioactif <em>Autre Evenement Radioactif</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreListeObjectifs <em>Autre Liste Objectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreMateriel <em>Autre Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreNom <em>Autre Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreObstacle <em>Autre Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreSegmentItineraire <em>Autre Segment Itineraire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreSite <em>Autre Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreTypeBatiment <em>Autre Type Batiment</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreTypeConsommable <em>Autre Type Consommable</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreTypeElementControle <em>Autre Type Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreTypeEntiteOrganisationnelle <em>Autre Type Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreTypeEquipement <em>Autre Type Equipement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreTypeOrganisationGouvernementale <em>Autre Type Organisation Gouvernementale</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getAutreTypeSite <em>Autre Type Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getBassin <em>Bassin</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getBatiment <em>Batiment</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCaleLancement <em>Cale Lancement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCaleSeche <em>Cale Seche</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteFeux <em>Capacite Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteGenie <em>Capacite Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteMobilite <em>Capacite Mobilite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteStockage <em>Capacite Stockage</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCapaciteSurveillance <em>Capacite Surveillance</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCaracteristiqueLogistique <em>Caracteristique Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCaracteristiqueTransport <em>Caracteristique Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getChampMinesMaritime <em>Champ Mines Maritime</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getChampMinesTerrestre <em>Champ Mines Terrestre</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCharnier <em>Charnier</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCheminFer <em>Chemin Fer</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getCompositionDotationTheoriqueEnType <em>Composition Dotation Theorique En Type</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getConvoi <em>Convoi</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDirectionApprocheAir <em>Direction Approche Air</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDocument <em>Document</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDotationTheorique <em>Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getDotationTheoriqueInstanceObjet <em>Dotation Theorique Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getElementTopographie <em>Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getEntitePolitique <em>Entite Politique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getEvenementArmeNucleaire <em>Evenement Arme Nucleaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getEvenementChimiqueEtBiologique <em>Evenement Chimique Et Biologique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getEvenementRadiologique <em>Evenement Radiologique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getGroupeEthnique <em>Groupe Ethnique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getGroupeFonctionnel <em>Groupe Fonctionnel</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getGroupeIndividus <em>Groupe Individus</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getGroupeInformationsOperationnelles <em>Groupe Informations Operationnelles</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getItineraire <em>Itineraire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getJetee <em>Jetee</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getLimite <em>Limite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getListeObjectifsCandidats <em>Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMesureCoordination <em>Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getMouillage <em>Mouillage</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getObjectifActivite <em>Objectif Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getObjectifCiblage <em>Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPersonne <em>Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPisteAtterrissage <em>Piste Atterrissage</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPointControle3D <em>Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPont <em>Pont</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPort <em>Port</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getPosteAmarrage <em>Poste Amarrage</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getProfil <em>Profil</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getQuaiMaritime <em>Quai Maritime</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRapport <em>Rapport</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRegleEngagement <em>Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getReligion <em>Religion</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getReseauTelecommunication <em>Reseau Telecommunication</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getRoute <em>Route</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getSegmentRouteAerienne <em>Segment Route Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getServiceReseau <em>Service Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getStructureOrganisee <em>Structure Organisee</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTrancheMeteo <em>Tranche Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeAerodrome <em>Type Aerodrome</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeAeronef <em>Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeAgentBiologique <em>Type Agent Biologique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeAgentChimique <em>Type Agent Chimique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeAgentNucleaire <em>Type Agent Nucleaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeArme <em>Type Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeBatimentSurface <em>Type Batiment Surface</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeEquipementElectronique <em>Type Equipement Electronique</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeEquipementFerroviaire <em>Type Equipement Ferroviaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeEquipementGenie <em>Type Equipement Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeEquipementMaritime <em>Type Equipement Maritime</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeEquipementNRBC <em>Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeGroupeIndividus <em>Type Groupe Individus</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeMesureCoordination <em>Type Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeMunition <em>Type Munition</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeObstacle <em>Type Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeOrganisationPrivee <em>Type Organisation Privee</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypePersonne <em>Type Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypePont <em>Type Pont</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypePort <em>Type Port</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypePosteCivil <em>Type Poste Civil</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypePosteMilitaire <em>Type Poste Militaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeRegroupementForce <em>Type Regroupement Force</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeSousMarin <em>Type Sous Marin</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeUnite <em>Type Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeVehicule <em>Type Vehicule</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getUnite <em>Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getZoneAerienne <em>Zone Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getBibliotheque <em>Bibliotheque</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getTypeAnnexe <em>Type Annexe</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getVersionDQP <em>Version DQP</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getVersionGrammaire <em>Version Grammaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getVersionModele <em>Version Modele</em>}</li>
 *   <li>{@link mpia.schema.TypeMPGTMessage#getVersionTypeAnnexe <em>Version Type Annexe</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage()
 * @model extendedMetaData="name='type_MPGT_Message' kind='elementOnly'"
 * @generated
 */
public interface TypeMPGTMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Action Renseignement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeActionRenseignement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Renseignement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Renseignement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ActionRenseignement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActionRenseignement' group='#group:0'"
	 * @generated
	 */
	EList<TypeActionRenseignement> getActionRenseignement();

	/**
	 * Returns the value of the '<em><b>Activite Posture</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeActivitePosture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Posture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Posture</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ActivitePosture()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivitePosture' group='#group:0'"
	 * @generated
	 */
	EList<TypeActivitePosture> getActivitePosture();

	/**
	 * Returns the value of the '<em><b>Aeronef</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAeronef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aeronef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aeronef</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Aeronef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Aeronef' group='#group:0'"
	 * @generated
	 */
	EList<TypeAeronef> getAeronef();

	/**
	 * Returns the value of the '<em><b>Alerte Frappe Nucleaire Amie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAlerteFrappeNucleaireAmie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alerte Frappe Nucleaire Amie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alerte Frappe Nucleaire Amie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AlerteFrappeNucleaireAmie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AlerteFrappeNucleaireAmie' group='#group:0'"
	 * @generated
	 */
	EList<TypeAlerteFrappeNucleaireAmie> getAlerteFrappeNucleaireAmie();

	/**
	 * Returns the value of the '<em><b>Allure</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAllure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allure</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Allure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Allure' group='#group:0'"
	 * @generated
	 */
	EList<TypeAllure> getAllure();

	/**
	 * Returns the value of the '<em><b>Annulation Interdiction Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAnnulationInterdictionTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annulation Interdiction Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annulation Interdiction Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AnnulationInterdictionTir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AnnulationInterdictionTir' group='#group:0'"
	 * @generated
	 */
	EList<TypeAnnulationInterdictionTir> getAnnulationInterdictionTir();

	/**
	 * Returns the value of the '<em><b>Appui Feu Helicoptere</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAppuiFeuHelicoptere}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appui Feu Helicoptere</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appui Feu Helicoptere</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AppuiFeuHelicoptere()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AppuiFeuHelicoptere' group='#group:0'"
	 * @generated
	 */
	EList<TypeAppuiFeuHelicoptere> getAppuiFeuHelicoptere();

	/**
	 * Returns the value of the '<em><b>Articulation ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeArticulationASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articulation ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articulation ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ArticulationASS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArticulationASS' group='#group:0'"
	 * @generated
	 */
	EList<TypeArticulationASS> getArticulationASS();

	/**
	 * Returns the value of the '<em><b>Articulation Logistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeArticulationLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articulation Logistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articulation Logistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ArticulationLogistique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArticulationLogistique' group='#group:0'"
	 * @generated
	 */
	EList<TypeArticulationLogistique> getArticulationLogistique();

	/**
	 * Returns the value of the '<em><b>Assoc Entite Org Type Entite Org</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocEntiteOrgTypeEntiteOrg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc Entite Org Type Entite Org</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc Entite Org Type Entite Org</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssocEntiteOrgTypeEntiteOrg()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssocEntiteOrgTypeEntiteOrg' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssocEntiteOrgTypeEntiteOrg> getAssocEntiteOrgTypeEntiteOrg();

	/**
	 * Returns the value of the '<em><b>Association Action Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationActionAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Action Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Action Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationActionAction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationActionAction' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationActionAction> getAssociationActionAction();

	/**
	 * Returns the value of the '<em><b>Association Action Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationActionAutreEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Action Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Action Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationActionAutreEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationActionAutreEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationActionAutreEvenement> getAssociationActionAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Association Action Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationActionEvenementNRBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Action Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Action Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationActionEvenementNRBC()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationActionEvenementNRBC' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationActionEvenementNRBC> getAssociationActionEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Association Autre Evenement Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationAutreEvenementAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Autre Evenement Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Autre Evenement Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationAutreEvenementAction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationAutreEvenementAction' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationAutreEvenementAction> getAssociationAutreEvenementAction();

	/**
	 * Returns the value of the '<em><b>Association Autre Evenement Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationAutreEvenementAutreEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Autre Evenement Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Autre Evenement Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationAutreEvenementAutreEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationAutreEvenementAutreEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationAutreEvenementAutreEvenement> getAssociationAutreEvenementAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Association Autre Evenement Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationAutreEvenementEvenementNRBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Autre Evenement Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Autre Evenement Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationAutreEvenementEvenementNRBC()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationAutreEvenementEvenementNRBC' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationAutreEvenementEvenementNRBC> getAssociationAutreEvenementEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Association Conflit3 DMission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationConflit3DMissionAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Conflit3 DMission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Conflit3 DMission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationConflit3DMissionAerienne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationConflit3DMissionAerienne' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationConflit3DMissionAerienne> getAssociationConflit3DMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Association Consommablel Majeur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationConsommablelMajeur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Consommablel Majeur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Consommablel Majeur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationConsommablelMajeur()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationConsommablelMajeur' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationConsommablelMajeur> getAssociationConsommablelMajeur();

	/**
	 * Returns the value of the '<em><b>Association Convoi Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationConvoiMouvementParRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Convoi Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Convoi Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationConvoiMouvementParRoute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationConvoiMouvementParRoute' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationConvoiMouvementParRoute> getAssociationConvoiMouvementParRoute();

	/**
	 * Returns the value of the '<em><b>Association Dep Evacuation Dep Evacuation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationDepEvacuationDepEvacuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Dep Evacuation Dep Evacuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Dep Evacuation Dep Evacuation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationDepEvacuationDepEvacuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationDepEvacuationDepEvacuation' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationDepEvacuationDepEvacuation> getAssociationDepEvacuationDepEvacuation();

	/**
	 * Returns the value of the '<em><b>Association Element Controle Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationElementControleEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Element Controle Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Element Controle Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationElementControleEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationElementControleEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationElementControleEvenement> getAssociationElementControleEvenement();

	/**
	 * Returns the value of the '<em><b>Association Element Topographie Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationElementTopographieEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Element Topographie Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Element Topographie Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationElementTopographieEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationElementTopographieEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationElementTopographieEvenement> getAssociationElementTopographieEvenement();

	/**
	 * Returns the value of the '<em><b>Association Elt Ctrl Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEltCtrlEltCtrl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Elt Ctrl Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Elt Ctrl Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEltCtrlEltCtrl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEltCtrlEltCtrl' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEltCtrlEltCtrl> getAssociationEltCtrlEltCtrl();

	/**
	 * Returns the value of the '<em><b>Association Elt Ctrl Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEltCtrlEltTopo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Elt Ctrl Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Elt Ctrl Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEltCtrlEltTopo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEltCtrlEltTopo' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEltCtrlEltTopo> getAssociationEltCtrlEltTopo();

	/**
	 * Returns the value of the '<em><b>Association Elt Ctrl Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEltCtrlMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Elt Ctrl Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Elt Ctrl Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEltCtrlMateriel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEltCtrlMateriel' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEltCtrlMateriel> getAssociationEltCtrlMateriel();

	/**
	 * Returns the value of the '<em><b>Association Elt Ctrl Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEltCtrlSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Elt Ctrl Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Elt Ctrl Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEltCtrlSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEltCtrlSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEltCtrlSite> getAssociationEltCtrlSite();

	/**
	 * Returns the value of the '<em><b>Association Elt Ctrl Type Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEltCtrlTypeEltCtrl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Elt Ctrl Type Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Elt Ctrl Type Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEltCtrlTypeEltCtrl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEltCtrlTypeEltCtrl' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEltCtrlTypeEltCtrl> getAssociationEltCtrlTypeEltCtrl();

	/**
	 * Returns the value of the '<em><b>Association Elt Topo Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEltTopoSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Elt Topo Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Elt Topo Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEltTopoSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEltTopoSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEltTopoSite> getAssociationEltTopoSite();

	/**
	 * Returns the value of the '<em><b>Association Entite Org Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrgAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Org Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Org Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrgAction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrgAction' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrgAction> getAssociationEntiteOrgAction();

	/**
	 * Returns the value of the '<em><b>Association Entite Organisationnelle Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrganisationnellePlanOuOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Organisationnelle Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Organisationnelle Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrganisationnellePlanOuOrdre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrganisationnellePlanOuOrdre' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrganisationnellePlanOuOrdre> getAssociationEntiteOrganisationnellePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Association Entite Org Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrgEltCtrl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Org Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Org Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrgEltCtrl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrgEltCtrl' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrgEltCtrl> getAssociationEntiteOrgEltCtrl();

	/**
	 * Returns the value of the '<em><b>Association Entite Org Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrgEltTopo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Org Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Org Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrgEltTopo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrgEltTopo' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrgEltTopo> getAssociationEntiteOrgEltTopo();

	/**
	 * Returns the value of the '<em><b>Association Entite Org Entite Org</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Org Entite Org</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Org Entite Org</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrgEntiteOrg()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrgEntiteOrg' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrgEntiteOrg> getAssociationEntiteOrgEntiteOrg();

	/**
	 * Returns the value of the '<em><b>Association Entite Org Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrgEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Org Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Org Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrgEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrgEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrgEvenement> getAssociationEntiteOrgEvenement();

	/**
	 * Returns the value of the '<em><b>Association Entite Org Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrgMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Org Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Org Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrgMateriel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrgMateriel' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrgMateriel> getAssociationEntiteOrgMateriel();

	/**
	 * Returns the value of the '<em><b>Association Entite Org Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Org Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Org Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrgObjetInconnu()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrgObjetInconnu' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrgObjetInconnu> getAssociationEntiteOrgObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Association Entite Org Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrgPersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Org Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Org Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrgPersonne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrgPersonne' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrgPersonne> getAssociationEntiteOrgPersonne();

	/**
	 * Returns the value of the '<em><b>Association Entite Org Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEntiteOrgSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Entite Org Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Entite Org Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEntiteOrgSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEntiteOrgSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEntiteOrgSite> getAssociationEntiteOrgSite();

	/**
	 * Returns the value of the '<em><b>Association Equipementl Majeur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEquipementlMajeur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Equipementl Majeur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Equipementl Majeur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEquipementlMajeur()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEquipementlMajeur' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEquipementlMajeur> getAssociationEquipementlMajeur();

	/**
	 * Returns the value of the '<em><b>Association Evenement NRBC Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEvenementNRBCAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Evenement NRBC Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Evenement NRBC Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEvenementNRBCAction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEvenementNRBCAction' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEvenementNRBCAction> getAssociationEvenementNRBCAction();

	/**
	 * Returns the value of the '<em><b>Association Evenement NRBC Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEvenementNRBCAutreEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Evenement NRBC Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Evenement NRBC Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEvenementNRBCAutreEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEvenementNRBCAutreEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEvenementNRBCAutreEvenement> getAssociationEvenementNRBCAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Association Evenement NRBC Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEvenementNRBCEvenementNRBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Evenement NRBC Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Evenement NRBC Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEvenementNRBCEvenementNRBC()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEvenementNRBCEvenementNRBC' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEvenementNRBCEvenementNRBC> getAssociationEvenementNRBCEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Association Evenement RENS Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Evenement RENS Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Evenement RENS Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEvenementRENSAutreEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEvenementRENSAutreEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEvenementRENSAutreEvenement> getAssociationEvenementRENSAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Association Evenement RENS Evenement RENS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Evenement RENS Evenement RENS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Evenement RENS Evenement RENS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationEvenementRENSEvenementRENS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationEvenementRENSEvenementRENS' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationEvenementRENSEvenementRENS> getAssociationEvenementRENSEvenementRENS();

	/**
	 * Returns the value of the '<em><b>Association Groupe Info Ops Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationGroupeInfoOpsPlanOuOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Groupe Info Ops Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Groupe Info Ops Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationGroupeInfoOpsPlanOuOrdre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationGroupeInfoOpsPlanOuOrdre' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationGroupeInfoOpsPlanOuOrdre> getAssociationGroupeInfoOpsPlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Association Horaire Manoeuvre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationHoraireManoeuvre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Horaire Manoeuvre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Horaire Manoeuvre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationHoraireManoeuvre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationHoraireManoeuvre' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationHoraireManoeuvre> getAssociationHoraireManoeuvre();

	/**
	 * Returns the value of the '<em><b>Association Livraison Livaison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationLivraisonLivaison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Livraison Livaison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Livraison Livaison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationLivraisonLivaison()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationLivraisonLivaison' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationLivraisonLivaison> getAssociationLivraisonLivaison();

	/**
	 * Returns the value of the '<em><b>Association Materiel Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMaterielEltCtrl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Materiel Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Materiel Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMaterielEltCtrl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMaterielEltCtrl' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMaterielEltCtrl> getAssociationMaterielEltCtrl();

	/**
	 * Returns the value of the '<em><b>Association Materiel Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMaterielEltTopo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Materiel Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Materiel Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMaterielEltTopo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMaterielEltTopo' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMaterielEltTopo> getAssociationMaterielEltTopo();

	/**
	 * Returns the value of the '<em><b>Association Materiel Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMaterielEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Materiel Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Materiel Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMaterielEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMaterielEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMaterielEvenement> getAssociationMaterielEvenement();

	/**
	 * Returns the value of the '<em><b>Association Materiel Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMaterielMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Materiel Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Materiel Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMaterielMateriel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMaterielMateriel' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMaterielMateriel> getAssociationMaterielMateriel();

	/**
	 * Returns the value of the '<em><b>Association Materiel Meteorologie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMaterielMeteorologie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Materiel Meteorologie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Materiel Meteorologie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMaterielMeteorologie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMaterielMeteorologie' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMaterielMeteorologie> getAssociationMaterielMeteorologie();

	/**
	 * Returns the value of the '<em><b>Association Materiel Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMaterielObjetInconnu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Materiel Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Materiel Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMaterielObjetInconnu()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMaterielObjetInconnu' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMaterielObjetInconnu> getAssociationMaterielObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Association Materiel Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMaterielPersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Materiel Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Materiel Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMaterielPersonne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMaterielPersonne' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMaterielPersonne> getAssociationMaterielPersonne();

	/**
	 * Returns the value of the '<em><b>Association Materiel Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMaterielSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Materiel Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Materiel Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMaterielSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMaterielSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMaterielSite> getAssociationMaterielSite();

	/**
	 * Returns the value of the '<em><b>Association Materiel Type Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMaterielTypeMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Materiel Type Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Materiel Type Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMaterielTypeMateriel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMaterielTypeMateriel' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMaterielTypeMateriel> getAssociationMaterielTypeMateriel();

	/**
	 * Returns the value of the '<em><b>Association Mesure Coordination Plan Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mesure Coordination Plan Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mesure Coordination Plan Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMesureCoordinationPlanFeux()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMesureCoordinationPlanFeux' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMesureCoordinationPlanFeux> getAssociationMesureCoordinationPlanFeux();

	/**
	 * Returns the value of the '<em><b>Association Mesure Coord Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMesureCoordMissionAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mesure Coord Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mesure Coord Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMesureCoordMissionAerienne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMesureCoordMissionAerienne' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMesureCoordMissionAerienne> getAssociationMesureCoordMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Association Meteorologie Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMeteorologieSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Meteorologie Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Meteorologie Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMeteorologieSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMeteorologieSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMeteorologieSite> getAssociationMeteorologieSite();

	/**
	 * Returns the value of the '<em><b>Association Mission Aerienne Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mission Aerienne Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mission Aerienne Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMissionAerienneMissionAerienne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMissionAerienneMissionAerienne' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMissionAerienneMissionAerienne> getAssociationMissionAerienneMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Association Mission Genie Mission Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMissionGenieMissionGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mission Genie Mission Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mission Genie Mission Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMissionGenieMissionGenie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMissionGenieMissionGenie' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMissionGenieMissionGenie> getAssociationMissionGenieMissionGenie();

	/**
	 * Returns the value of the '<em><b>Association Mission Melee Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMissionMeleeAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mission Melee Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mission Melee Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMissionMeleeAction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMissionMeleeAction' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMissionMeleeAction> getAssociationMissionMeleeAction();

	/**
	 * Returns the value of the '<em><b>Association Mission Mouvement Mission Mouvement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mission Mouvement Mission Mouvement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mission Mouvement Mission Mouvement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMissionMouvementMissionMouvement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMissionMouvementMissionMouvement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMissionMouvementMissionMouvement> getAssociationMissionMouvementMissionMouvement();

	/**
	 * Returns the value of the '<em><b>Association Mission Renseignement Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMissionRenseignementAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mission Renseignement Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mission Renseignement Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMissionRenseignementAction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMissionRenseignementAction' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMissionRenseignementAction> getAssociationMissionRenseignementAction();

	/**
	 * Returns the value of the '<em><b>Association Mission Rens Obj Plan Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mission Rens Obj Plan Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mission Rens Obj Plan Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMissionRensObjPlanTraitementObj()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMissionRensObjPlanTraitementObj' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMissionRensObjPlanTraitementObj> getAssociationMissionRensObjPlanTraitementObj();

	/**
	 * Returns the value of the '<em><b>Association Mission Rens Obj Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMissionRensObjTraitementObj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mission Rens Obj Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mission Rens Obj Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMissionRensObjTraitementObj()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMissionRensObjTraitementObj' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMissionRensObjTraitementObj> getAssociationMissionRensObjTraitementObj();

	/**
	 * Returns the value of the '<em><b>Association Mouvement Par Route Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Mouvement Par Route Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Mouvement Par Route Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationMouvementParRouteMouvementParRoute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMouvementParRouteMouvementParRoute' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationMouvementParRouteMouvementParRoute> getAssociationMouvementParRouteMouvementParRoute();

	/**
	 * Returns the value of the '<em><b>Association Objectif Ciblage Document</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationObjectifCiblageDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Objectif Ciblage Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Objectif Ciblage Document</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationObjectifCiblageDocument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationObjectifCiblageDocument' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationObjectifCiblageDocument> getAssociationObjectifCiblageDocument();

	/**
	 * Returns the value of the '<em><b>Association Objet Inconnu Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationObjetInconnuEltCtrl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Objet Inconnu Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Objet Inconnu Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationObjetInconnuEltCtrl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationObjetInconnuEltCtrl' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationObjetInconnuEltCtrl> getAssociationObjetInconnuEltCtrl();

	/**
	 * Returns the value of the '<em><b>Association Objet Inconnu Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationObjetInconnuEltTopo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Objet Inconnu Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Objet Inconnu Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationObjetInconnuEltTopo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationObjetInconnuEltTopo' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationObjetInconnuEltTopo> getAssociationObjetInconnuEltTopo();

	/**
	 * Returns the value of the '<em><b>Association Objet Inconnu Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationObjetInconnuSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Objet Inconnu Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Objet Inconnu Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationObjetInconnuSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationObjetInconnuSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationObjetInconnuSite> getAssociationObjetInconnuSite();

	/**
	 * Returns the value of the '<em><b>Association Observation Observation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationObservationObservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Observation Observation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Observation Observation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationObservationObservation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationObservationObservation' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationObservationObservation> getAssociationObservationObservation();

	/**
	 * Returns the value of the '<em><b>Association Paragraphe POparagraphe PO</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationParagraphePOparagraphePO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Paragraphe POparagraphe PO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Paragraphe POparagraphe PO</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationParagraphePOparagraphePO()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationParagraphePOparagraphePO' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationParagraphePOparagraphePO> getAssociationParagraphePOparagraphePO();

	/**
	 * Returns the value of the '<em><b>Association Personne Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonneEltCtrl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonneEltCtrl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonneEltCtrl' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonneEltCtrl> getAssociationPersonneEltCtrl();

	/**
	 * Returns the value of the '<em><b>Association Personne Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonneEltTopo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonneEltTopo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonneEltTopo' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonneEltTopo> getAssociationPersonneEltTopo();

	/**
	 * Returns the value of the '<em><b>Association Personne Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonneEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonneEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonneEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonneEvenement> getAssociationPersonneEvenement();

	/**
	 * Returns the value of the '<em><b>Association Personne Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonneMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonneMateriel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonneMateriel' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonneMateriel> getAssociationPersonneMateriel();

	/**
	 * Returns the value of the '<em><b>Association Personne Mission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonneMissionAir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Mission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Mission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonneMissionAir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonneMissionAir' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonneMissionAir> getAssociationPersonneMissionAir();

	/**
	 * Returns the value of the '<em><b>Association Personne Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonneObjetInconnu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonneObjetInconnu()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonneObjetInconnu' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonneObjetInconnu> getAssociationPersonneObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Association Personne Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonnePersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonnePersonne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonnePersonne' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonnePersonne> getAssociationPersonnePersonne();

	/**
	 * Returns the value of the '<em><b>Association Personne Planif Operation3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonnePlanifOperation3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Planif Operation3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Planif Operation3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonnePlanifOperation3D()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonnePlanifOperation3D' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonnePlanifOperation3D> getAssociationPersonnePlanifOperation3D();

	/**
	 * Returns the value of the '<em><b>Association Personne Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonneSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonneSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonneSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonneSite> getAssociationPersonneSite();

	/**
	 * Returns the value of the '<em><b>Association Personne Type Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPersonneTypePersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Personne Type Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Personne Type Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPersonneTypePersonne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPersonneTypePersonne' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPersonneTypePersonne> getAssociationPersonneTypePersonne();

	/**
	 * Returns the value of the '<em><b>Association Planification Operation3 DMission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPlanificationOperation3DMissionAir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Planification Operation3 DMission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Planification Operation3 DMission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPlanificationOperation3DMissionAir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPlanificationOperation3DMissionAir' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPlanificationOperation3DMissionAir> getAssociationPlanificationOperation3DMissionAir();

	/**
	 * Returns the value of the '<em><b>Association Planification Operation3 DMission ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Planification Operation3 DMission ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Planification Operation3 DMission ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPlanificationOperation3DMissionASA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPlanificationOperation3DMissionASA' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPlanificationOperation3DMissionASA> getAssociationPlanificationOperation3DMissionASA();

	/**
	 * Returns the value of the '<em><b>Association Plan Ou Ordre Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Plan Ou Ordre Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Plan Ou Ordre Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPlanOuOrdrePlanOuOrdre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPlanOuOrdrePlanOuOrdre' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPlanOuOrdrePlanOuOrdre> getAssociationPlanOuOrdrePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Association Plan Traitement Obj Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Plan Traitement Obj Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Plan Traitement Obj Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationPlanTraitementObjTraitementObj()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationPlanTraitementObjTraitementObj' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationPlanTraitementObjTraitementObj> getAssociationPlanTraitementObjTraitementObj();

	/**
	 * Returns the value of the '<em><b>Association Renseignement Obj Mis Renseignement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Renseignement Obj Mis Renseignement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Renseignement Obj Mis Renseignement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationRenseignementObjMisRenseignementObj()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationRenseignementObjMisRenseignementObj' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationRenseignementObjMisRenseignementObj> getAssociationRenseignementObjMisRenseignementObj();

	/**
	 * Returns the value of the '<em><b>Association Site Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationSiteEltCtrl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Site Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Site Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationSiteEltCtrl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationSiteEltCtrl' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationSiteEltCtrl> getAssociationSiteEltCtrl();

	/**
	 * Returns the value of the '<em><b>Association Site Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationSiteEltTopo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Site Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Site Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationSiteEltTopo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationSiteEltTopo' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationSiteEltTopo> getAssociationSiteEltTopo();

	/**
	 * Returns the value of the '<em><b>Association Site Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationSiteEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Site Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Site Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationSiteEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationSiteEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationSiteEvenement> getAssociationSiteEvenement();

	/**
	 * Returns the value of the '<em><b>Association Site Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationSiteMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Site Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Site Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationSiteMateriel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationSiteMateriel' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationSiteMateriel> getAssociationSiteMateriel();

	/**
	 * Returns the value of the '<em><b>Association Site Meteorologie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationSiteMeteorologie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Site Meteorologie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Site Meteorologie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationSiteMeteorologie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationSiteMeteorologie' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationSiteMeteorologie> getAssociationSiteMeteorologie();

	/**
	 * Returns the value of the '<em><b>Association Site Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationSiteObjetInconnu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Site Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Site Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationSiteObjetInconnu()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationSiteObjetInconnu' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationSiteObjetInconnu> getAssociationSiteObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Association Site Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationSiteSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Site Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Site Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationSiteSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationSiteSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationSiteSite> getAssociationSiteSite();

	/**
	 * Returns the value of the '<em><b>Association Site Type Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationSiteTypeSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Site Type Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Site Type Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationSiteTypeSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationSiteTypeSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationSiteTypeSite> getAssociationSiteTypeSite();

	/**
	 * Returns the value of the '<em><b>Association Synthese Detections Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationSyntheseDetectionsEvenementNRBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Synthese Detections Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Synthese Detections Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationSyntheseDetectionsEvenementNRBC()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationSyntheseDetectionsEvenementNRBC' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationSyntheseDetectionsEvenementNRBC> getAssociationSyntheseDetectionsEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Association Traitement Obj Plan Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Traitement Obj Plan Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Traitement Obj Plan Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationTraitementObjPlanTraitementObj()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationTraitementObjPlanTraitementObj' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationTraitementObjPlanTraitementObj> getAssociationTraitementObjPlanTraitementObj();

	/**
	 * Returns the value of the '<em><b>Association Unite Appui Feu Helicoptere</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Appui Feu Helicoptere</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Appui Feu Helicoptere</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteAppuiFeuHelicoptere()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteAppuiFeuHelicoptere' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteAppuiFeuHelicoptere> getAssociationUniteAppuiFeuHelicoptere();

	/**
	 * Returns the value of the '<em><b>Association Unite Autre Mission Log</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteAutreMissionLog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Autre Mission Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Autre Mission Log</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteAutreMissionLog()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteAutreMissionLog' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteAutreMissionLog> getAssociationUniteAutreMissionLog();

	/**
	 * Returns the value of the '<em><b>Association Unite Livraison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteLivraison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Livraison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Livraison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteLivraison()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteLivraison' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteLivraison> getAssociationUniteLivraison();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Acq ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionAcqASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Acq ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Acq ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionAcqASS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionAcqASS' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionAcqASS> getAssociationUniteMissionAcqASS();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionAerienne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionAerienne' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionAerienne> getAssociationUniteMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionAir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionAir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionAir' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionAir> getAssociationUniteMissionAir();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission ALA Tattaque</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionALATattaque}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission ALA Tattaque</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission ALA Tattaque</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionALATattaque()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionALATattaque' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionALATattaque> getAssociationUniteMissionALATattaque();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionASA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionASA' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionASA> getAssociationUniteMissionASA();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Escorte AF</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionEscorteAF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Escorte AF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Escorte AF</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionEscorteAF()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionEscorteAF' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionEscorteAF> getAssociationUniteMissionEscorteAF();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionGenie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionGenie' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionGenie> getAssociationUniteMissionGenie();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Melee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionMelee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Melee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Melee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionMelee()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionMelee' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionMelee> getAssociationUniteMissionMelee();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Rens Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionRensObj}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Rens Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Rens Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionRensObj()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionRensObj' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionRensObj> getAssociationUniteMissionRensObj();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Sic</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionSic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Sic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Sic</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionSic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionSic' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionSic> getAssociationUniteMissionSic();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Transp Tact</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionTranspTact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Transp Tact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Transp Tact</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionTranspTact()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionTranspTact' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionTranspTact> getAssociationUniteMissionTranspTact();

	/**
	 * Returns the value of the '<em><b>Association Unite Mission Unite Antichar</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMissionUniteAntichar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mission Unite Antichar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mission Unite Antichar</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMissionUniteAntichar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMissionUniteAntichar' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMissionUniteAntichar> getAssociationUniteMissionUniteAntichar();

	/**
	 * Returns the value of the '<em><b>Association Unite Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteMouvementParRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteMouvementParRoute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteMouvementParRoute' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteMouvementParRoute> getAssociationUniteMouvementParRoute();

	/**
	 * Returns the value of the '<em><b>Association Unite Plan Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUnitePlanFeux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Plan Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Plan Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUnitePlanFeux()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUnitePlanFeux' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUnitePlanFeux> getAssociationUnitePlanFeux();

	/**
	 * Returns the value of the '<em><b>Association Unite Planif Operation3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUnitePlanifOperation3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Planif Operation3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Planif Operation3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUnitePlanifOperation3D()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUnitePlanifOperation3D' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUnitePlanifOperation3D> getAssociationUnitePlanifOperation3D();

	/**
	 * Returns the value of the '<em><b>Association Unite Renforcements Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationUniteRenforcementsFeux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Unite Renforcements Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Unite Renforcements Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationUniteRenforcementsFeux()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationUniteRenforcementsFeux' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationUniteRenforcementsFeux> getAssociationUniteRenforcementsFeux();

	/**
	 * Returns the value of the '<em><b>Assoc Symbole Tactique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocSymboleTactique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc Symbole Tactique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc Symbole Tactique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssocSymboleTactique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssocSymboleTactique' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssocSymboleTactique> getAssocSymboleTactique();

	/**
	 * Returns the value of the '<em><b>Autre Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreAction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreAction' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreAction> getAutreAction();

	/**
	 * Returns the value of the '<em><b>Autre Affiliation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreAffiliation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Affiliation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Affiliation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreAffiliation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreAffiliation' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreAffiliation> getAutreAffiliation();

	/**
	 * Returns the value of the '<em><b>Autre Capteur RENS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreCapteurRENS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Capteur RENS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Capteur RENS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreCapteurRENS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreCapteurRENS' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreCapteurRENS> getAutreCapteurRENS();

	/**
	 * Returns the value of the '<em><b>Autre Evenement Nucleaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreEvenementNucleaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Evenement Nucleaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Evenement Nucleaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreEvenementNucleaire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreEvenementNucleaire' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreEvenementNucleaire> getAutreEvenementNucleaire();

	/**
	 * Returns the value of the '<em><b>Autre Menace</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreMenace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Menace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Menace</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreMenace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreMenace' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreMenace> getAutreMenace();

	/**
	 * Returns the value of the '<em><b>Autre Mission</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreMission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Mission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Mission</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreMission()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreMission' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreMission> getAutreMission();

	/**
	 * Returns the value of the '<em><b>Autre Mission ALAT</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreMissionALAT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Mission ALAT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Mission ALAT</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreMissionALAT()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreMissionALAT' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreMissionALAT> getAutreMissionALAT();

	/**
	 * Returns the value of the '<em><b>Autre Mission Logistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreMissionLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Mission Logistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Mission Logistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreMissionLogistique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreMissionLogistique' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreMissionLogistique> getAutreMissionLogistique();

	/**
	 * Returns the value of the '<em><b>Autre Type Consommable Systeme Arme</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreTypeConsommableSystemeArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Consommable Systeme Arme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Consommable Systeme Arme</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreTypeConsommableSystemeArme()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreTypeConsommableSystemeArme' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreTypeConsommableSystemeArme> getAutreTypeConsommableSystemeArme();

	/**
	 * Returns the value of the '<em><b>Besoins En Renseignements</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBesoinsEnRenseignements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Besoins En Renseignements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Besoins En Renseignements</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_BesoinsEnRenseignements()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BesoinsEnRenseignements' group='#group:0'"
	 * @generated
	 */
	EList<TypeBesoinsEnRenseignements> getBesoinsEnRenseignements();

	/**
	 * Returns the value of the '<em><b>Bilan Tirs ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBilanTirsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bilan Tirs ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bilan Tirs ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_BilanTirsASS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BilanTirsASS' group='#group:0'"
	 * @generated
	 */
	EList<TypeBilanTirsASS> getBilanTirsASS();

	/**
	 * Returns the value of the '<em><b>Branche Navigation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBrancheNavigation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branche Navigation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branche Navigation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_BrancheNavigation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrancheNavigation' group='#group:0'"
	 * @generated
	 */
	EList<TypeBrancheNavigation> getBrancheNavigation();

	/**
	 * Returns the value of the '<em><b>Bulletin Sondage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBulletinSondage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulletin Sondage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulletin Sondage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_BulletinSondage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BulletinSondage' group='#group:0'"
	 * @generated
	 */
	EList<TypeBulletinSondage> getBulletinSondage();

	/**
	 * Returns the value of the '<em><b>Capacite Hebergement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteHebergement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Hebergement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Hebergement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteHebergement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteHebergement' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteHebergement> getCapaciteHebergement();

	/**
	 * Returns the value of the '<em><b>Capacite Maintenance</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteMaintenance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Maintenance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Maintenance</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteMaintenance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteMaintenance' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteMaintenance> getCapaciteMaintenance();

	/**
	 * Returns the value of the '<em><b>Capacite Manutention</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteManutention}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Manutention</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Manutention</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteManutention()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteManutention' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteManutention> getCapaciteManutention();

	/**
	 * Returns the value of the '<em><b>Capacite Operationnelle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteOperationnelle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Operationnelle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Operationnelle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteOperationnelle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteOperationnelle' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteOperationnelle> getCapaciteOperationnelle();

	/**
	 * Returns the value of the '<em><b>Capacite Soutien</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteSoutien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Soutien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Soutien</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteSoutien()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteSoutien' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteSoutien> getCapaciteSoutien();

	/**
	 * Returns the value of the '<em><b>Capacite Transmission</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteTransmission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Transmission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Transmission</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteTransmission()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteTransmission' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteTransmission> getCapaciteTransmission();

	/**
	 * Returns the value of the '<em><b>Capteur Drone</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapteurDrone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capteur Drone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capteur Drone</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapteurDrone()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapteurDrone' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapteurDrone> getCapteurDrone();

	/**
	 * Returns the value of the '<em><b>Capteur Localisation Radioelectrique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapteurLocalisationRadioelectrique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capteur Localisation Radioelectrique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capteur Localisation Radioelectrique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapteurLocalisationRadioelectrique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapteurLocalisationRadioelectrique' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapteurLocalisationRadioelectrique> getCapteurLocalisationRadioelectrique();

	/**
	 * Returns the value of the '<em><b>Capteur Radar</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapteurRadar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capteur Radar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capteur Radar</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapteurRadar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapteurRadar' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapteurRadar> getCapteurRadar();

	/**
	 * Returns the value of the '<em><b>Capteur ROHUM</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapteurROHUM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capteur ROHUM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capteur ROHUM</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapteurROHUM()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapteurROHUM' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapteurROHUM> getCapteurROHUM();

	/**
	 * Returns the value of the '<em><b>Carnet Points</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCarnetPoints}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carnet Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carnet Points</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CarnetPoints()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CarnetPoints' group='#group:0'"
	 * @generated
	 */
	EList<TypeCarnetPoints> getCarnetPoints();

	/**
	 * Returns the value of the '<em><b>Chargement Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeChargementMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chargement Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chargement Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ChargementMateriel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChargementMateriel' group='#group:0'"
	 * @generated
	 */
	EList<TypeChargementMateriel> getChargementMateriel();

	/**
	 * Returns the value of the '<em><b>Compte Rendu Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCompteRenduTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compte Rendu Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compte Rendu Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CompteRenduTir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompteRenduTir' group='#group:0'"
	 * @generated
	 */
	EList<TypeCompteRenduTir> getCompteRenduTir();

	/**
	 * Returns the value of the '<em><b>Conflit3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConflit3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflit3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflit3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Conflit3D()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Conflit3D' group='#group:0'"
	 * @generated
	 */
	EList<TypeConflit3D> getConflit3D();

	/**
	 * Returns the value of the '<em><b>Consigne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsigne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Consigne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Consigne' group='#group:0'"
	 * @generated
	 */
	EList<TypeConsigne> getConsigne();

	/**
	 * Returns the value of the '<em><b>Consigne Lutte Antiaerienne TTA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsigneLutteAntiaerienneTTA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne Lutte Antiaerienne TTA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne Lutte Antiaerienne TTA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ConsigneLutteAntiaerienneTTA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConsigneLutteAntiaerienneTTA' group='#group:0'"
	 * @generated
	 */
	EList<TypeConsigneLutteAntiaerienneTTA> getConsigneLutteAntiaerienneTTA();

	/**
	 * Returns the value of the '<em><b>Consigne Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsigneTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ConsigneTir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConsigneTir' group='#group:0'"
	 * @generated
	 */
	EList<TypeConsigneTir> getConsigneTir();

	/**
	 * Returns the value of the '<em><b>Couverture Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCouvertureAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couverture Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couverture Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CouvertureAerienne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CouvertureAerienne' group='#group:0'"
	 * @generated
	 */
	EList<TypeCouvertureAerienne> getCouvertureAerienne();

	/**
	 * Returns the value of the '<em><b>Couverture ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCouvertureASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couverture ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couverture ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CouvertureASA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CouvertureASA' group='#group:0'"
	 * @generated
	 */
	EList<TypeCouvertureASA> getCouvertureASA();

	/**
	 * Returns the value of the '<em><b>Degre Classification</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDegreClassification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Classification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Classification</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DegreClassification()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DegreClassification' group='#group:0'"
	 * @generated
	 */
	EList<TypeDegreClassification> getDegreClassification();

	/**
	 * Returns the value of the '<em><b>Demande Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDemandeTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demande Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demande Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DemandeTir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DemandeTir' group='#group:0'"
	 * @generated
	 */
	EList<TypeDemandeTir> getDemandeTir();

	/**
	 * Returns the value of the '<em><b>Depannage Evacuation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDepannageEvacuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depannage Evacuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depannage Evacuation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DepannageEvacuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DepannageEvacuation' group='#group:0'"
	 * @generated
	 */
	EList<TypeDepannageEvacuation> getDepannageEvacuation();

	/**
	 * Returns the value of the '<em><b>Deploiement MARTHA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDeploiementMARTHA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploiement MARTHA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploiement MARTHA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DeploiementMARTHA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeploiementMARTHA' group='#group:0'"
	 * @generated
	 */
	EList<TypeDeploiementMARTHA> getDeploiementMARTHA();

	/**
	 * Returns the value of the '<em><b>Deploiement Moyens AS Ac3d</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDeploiementMoyensASAc3d}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploiement Moyens AS Ac3d</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploiement Moyens AS Ac3d</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DeploiementMoyensASAc3d()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeploiementMoyensASAc3d' group='#group:0'"
	 * @generated
	 */
	EList<TypeDeploiementMoyensASAc3d> getDeploiementMoyensASAc3d();

	/**
	 * Returns the value of the '<em><b>Detachement Identifie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDetachementIdentifie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detachement Identifie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detachement Identifie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DetachementIdentifie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DetachementIdentifie' group='#group:0'"
	 * @generated
	 */
	EList<TypeDetachementIdentifie> getDetachementIdentifie();

	/**
	 * Returns the value of the '<em><b>Detachement Non Identifie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDetachementNonIdentifie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detachement Non Identifie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detachement Non Identifie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DetachementNonIdentifie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DetachementNonIdentifie' group='#group:0'"
	 * @generated
	 */
	EList<TypeDetachementNonIdentifie> getDetachementNonIdentifie();

	/**
	 * Returns the value of the '<em><b>Directive Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDirectiveTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directive Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directive Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DirectiveTir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DirectiveTir' group='#group:0'"
	 * @generated
	 */
	EList<TypeDirectiveTir> getDirectiveTir();

	/**
	 * Returns the value of the '<em><b>Echelon</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEchelon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelon</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Echelon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Echelon' group='#group:0'"
	 * @generated
	 */
	EList<TypeEchelon> getEchelon();

	/**
	 * Returns the value of the '<em><b>Element Meteo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeElementMeteo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Meteo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Meteo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ElementMeteo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ElementMeteo' group='#group:0'"
	 * @generated
	 */
	EList<TypeElementMeteo> getElementMeteo();

	/**
	 * Returns the value of the '<em><b>Ennemi Futur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEnnemiFutur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ennemi Futur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ennemi Futur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_EnnemiFutur()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnnemiFutur' group='#group:0'"
	 * @generated
	 */
	EList<TypeEnnemiFutur> getEnnemiFutur();

	/**
	 * Returns the value of the '<em><b>En Tete Paragraphe Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>En Tete Paragraphe Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>En Tete Paragraphe Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_EnTeteParagraphePlanOuOrdre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnTeteParagraphePlanOuOrdre' group='#group:0'"
	 * @generated
	 */
	EList<TypeEnTeteParagraphePlanOuOrdre> getEnTeteParagraphePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Etude Dispersion</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtudeDispersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etude Dispersion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etude Dispersion</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_EtudeDispersion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EtudeDispersion' group='#group:0'"
	 * @generated
	 */
	EList<TypeEtudeDispersion> getEtudeDispersion();

	/**
	 * Returns the value of the '<em><b>Evenement RENS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvenementRENS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evenement RENS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenement RENS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_EvenementRENS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EvenementRENS' group='#group:0'"
	 * @generated
	 */
	EList<TypeEvenementRENS> getEvenementRENS();

	/**
	 * Returns the value of the '<em><b>Fait Renseignement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeFaitRenseignement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fait Renseignement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fait Renseignement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_FaitRenseignement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FaitRenseignement' group='#group:0'"
	 * @generated
	 */
	EList<TypeFaitRenseignement> getFaitRenseignement();

	/**
	 * Returns the value of the '<em><b>Horaire Manoeuvre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeHoraireManoeuvre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horaire Manoeuvre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horaire Manoeuvre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_HoraireManoeuvre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HoraireManoeuvre' group='#group:0'"
	 * @generated
	 */
	EList<TypeHoraireManoeuvre> getHoraireManoeuvre();

	/**
	 * Returns the value of the '<em><b>Hypothese Action EN Iou Autre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeHypotheseActionENIouAutre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypothese Action EN Iou Autre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypothese Action EN Iou Autre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_HypotheseActionENIouAutre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HypotheseActionENIouAutre' group='#group:0'"
	 * @generated
	 */
	EList<TypeHypotheseActionENIouAutre> getHypotheseActionENIouAutre();

	/**
	 * Returns the value of the '<em><b>Indicateur Geostatistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeIndicateurGeostatistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicateur Geostatistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicateur Geostatistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_IndicateurGeostatistique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IndicateurGeostatistique' group='#group:0'"
	 * @generated
	 */
	EList<TypeIndicateurGeostatistique> getIndicateurGeostatistique();

	/**
	 * Returns the value of the '<em><b>Interdiction Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeInterdictionTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interdiction Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interdiction Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_InterdictionTir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InterdictionTir' group='#group:0'"
	 * @generated
	 */
	EList<TypeInterdictionTir> getInterdictionTir();

	/**
	 * Returns the value of the '<em><b>Intervention Generale</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeInterventionGenerale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervention Generale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervention Generale</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_InterventionGenerale()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InterventionGenerale' group='#group:0'"
	 * @generated
	 */
	EList<TypeInterventionGenerale> getInterventionGenerale();

	/**
	 * Returns the value of the '<em><b>Intervention Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeInterventionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervention Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervention Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_InterventionType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InterventionType' group='#group:0'"
	 * @generated
	 */
	EList<TypeInterventionType> getInterventionType();

	/**
	 * Returns the value of the '<em><b>Itineraire Ou Modele Cheminement ALAT</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeItineraireOuModeleCheminementALAT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itineraire Ou Modele Cheminement ALAT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itineraire Ou Modele Cheminement ALAT</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ItineraireOuModeleCheminementALAT()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItineraireOuModeleCheminementALAT' group='#group:0'"
	 * @generated
	 */
	EList<TypeItineraireOuModeleCheminementALAT> getItineraireOuModeleCheminementALAT();

	/**
	 * Returns the value of the '<em><b>Jonction Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeJonctionReseau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jonction Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jonction Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_JonctionReseau()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JonctionReseau' group='#group:0'"
	 * @generated
	 */
	EList<TypeJonctionReseau> getJonctionReseau();

	/**
	 * Returns the value of the '<em><b>Liaison Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeLiaisonReseau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liaison Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liaison Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_LiaisonReseau()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LiaisonReseau' group='#group:0'"
	 * @generated
	 */
	EList<TypeLiaisonReseau> getLiaisonReseau();

	/**
	 * Returns the value of the '<em><b>Ligne Livraison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeLigneLivraison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ligne Livraison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ligne Livraison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_LigneLivraison()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LigneLivraison' group='#group:0'"
	 * @generated
	 */
	EList<TypeLigneLivraison> getLigneLivraison();

	/**
	 * Returns the value of the '<em><b>Liste Mesures Coordination3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeListeMesuresCoordination3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Mesures Coordination3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Mesures Coordination3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ListeMesuresCoordination3D()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListeMesuresCoordination3D' group='#group:0'"
	 * @generated
	 */
	EList<TypeListeMesuresCoordination3D> getListeMesuresCoordination3D();

	/**
	 * Returns the value of the '<em><b>Liste Objectifs Planifies</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeListeObjectifsPlanifies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Objectifs Planifies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Objectifs Planifies</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ListeObjectifsPlanifies()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListeObjectifsPlanifies' group='#group:0'"
	 * @generated
	 */
	EList<TypeListeObjectifsPlanifies> getListeObjectifsPlanifies();

	/**
	 * Returns the value of the '<em><b>Livraison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeLivraison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Livraison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Livraison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Livraison()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Livraison' group='#group:0'"
	 * @generated
	 */
	EList<TypeLivraison> getLivraison();

	/**
	 * Returns the value of the '<em><b>Memento Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMementoGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memento Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memento Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MementoGenie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MementoGenie' group='#group:0'"
	 * @generated
	 */
	EList<TypeMementoGenie> getMementoGenie();

	/**
	 * Returns the value of the '<em><b>Menace Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMenaceAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menace Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menace Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MenaceAerienne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MenaceAerienne' group='#group:0'"
	 * @generated
	 */
	EList<TypeMenaceAerienne> getMenaceAerienne();

	/**
	 * Returns the value of the '<em><b>Menace AS Aeni</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMenaceASAeni}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menace AS Aeni</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menace AS Aeni</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MenaceASAeni()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MenaceASAeni' group='#group:0'"
	 * @generated
	 */
	EList<TypeMenaceASAeni> getMenaceASAeni();

	/**
	 * Returns the value of the '<em><b>Menace Detection</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMenaceDetection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menace Detection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menace Detection</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MenaceDetection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MenaceDetection' group='#group:0'"
	 * @generated
	 */
	EList<TypeMenaceDetection> getMenaceDetection();

	/**
	 * Returns the value of the '<em><b>Menace Feux ENI</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMenaceFeuxENI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menace Feux ENI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menace Feux ENI</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MenaceFeuxENI()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MenaceFeuxENI' group='#group:0'"
	 * @generated
	 */
	EList<TypeMenaceFeuxENI> getMenaceFeuxENI();

	/**
	 * Returns the value of the '<em><b>Menace Genie ENI</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMenaceGenieENI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menace Genie ENI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menace Genie ENI</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MenaceGenieENI()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MenaceGenieENI' group='#group:0'"
	 * @generated
	 */
	EList<TypeMenaceGenieENI> getMenaceGenieENI();

	/**
	 * Returns the value of the '<em><b>Menaces Aeriennes Mission ALAT</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMenacesAeriennesMissionALAT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menaces Aeriennes Mission ALAT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menaces Aeriennes Mission ALAT</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MenacesAeriennesMissionALAT()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MenacesAeriennesMissionALAT' group='#group:0'"
	 * @generated
	 */
	EList<TypeMenacesAeriennesMissionALAT> getMenacesAeriennesMissionALAT();

	/**
	 * Returns the value of the '<em><b>Mesures Protection Electronique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMesuresProtectionElectronique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesures Protection Electronique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesures Protection Electronique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MesuresProtectionElectronique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MesuresProtectionElectronique' group='#group:0'"
	 * @generated
	 */
	EList<TypeMesuresProtectionElectronique> getMesuresProtectionElectronique();

	/**
	 * Returns the value of the '<em><b>Mise En Oeuvre ROE</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMiseEnOeuvreROE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mise En Oeuvre ROE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mise En Oeuvre ROE</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MiseEnOeuvreROE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MiseEnOeuvreROE' group='#group:0'"
	 * @generated
	 */
	EList<TypeMiseEnOeuvreROE> getMiseEnOeuvreROE();

	/**
	 * Returns the value of the '<em><b>Mission Acquisition ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionAcquisitionASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Acquisition ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Acquisition ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionAcquisitionASS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionAcquisitionASS' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionAcquisitionASS> getMissionAcquisitionASS();

	/**
	 * Returns the value of the '<em><b>Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionAerienne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionAerienne' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionAerienne> getMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Mission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionAir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionAir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionAir' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionAir> getMissionAir();

	/**
	 * Returns the value of the '<em><b>Mission ALA Tattaque</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionALATattaque}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission ALA Tattaque</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission ALA Tattaque</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionALATattaque()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionALATattaque' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionALATattaque> getMissionALATattaque();

	/**
	 * Returns the value of the '<em><b>Mission ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionASA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionASA' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionASA> getMissionASA();

	/**
	 * Returns the value of the '<em><b>Mission Escorte Ou Appui Feu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionEscorteOuAppuiFeu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Escorte Ou Appui Feu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Escorte Ou Appui Feu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionEscorteOuAppuiFeu()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionEscorteOuAppuiFeu' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionEscorteOuAppuiFeu> getMissionEscorteOuAppuiFeu();

	/**
	 * Returns the value of the '<em><b>Mission Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionFeux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionFeux()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionFeux' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionFeux> getMissionFeux();

	/**
	 * Returns the value of the '<em><b>Mission Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionGenie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionGenie' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionGenie> getMissionGenie();

	/**
	 * Returns the value of the '<em><b>Mission I3D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionI3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission I3D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission I3D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionI3D()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionI3D' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionI3D> getMissionI3D();

	/**
	 * Returns the value of the '<em><b>Mission Maintenance</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionMaintenance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Maintenance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Maintenance</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionMaintenance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionMaintenance' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionMaintenance> getMissionMaintenance();

	/**
	 * Returns the value of the '<em><b>Mission Melee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionMelee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Melee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Melee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionMelee()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionMelee' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionMelee> getMissionMelee();

	/**
	 * Returns the value of the '<em><b>Mission Mouvement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Mouvement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Mouvement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionMouvement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionMouvement' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionMouvement> getMissionMouvement();

	/**
	 * Returns the value of the '<em><b>Mission Ravitaillement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionRavitaillement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Ravitaillement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Ravitaillement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionRavitaillement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionRavitaillement' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionRavitaillement> getMissionRavitaillement();

	/**
	 * Returns the value of the '<em><b>Mission Renseignement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionRenseignement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Renseignement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Renseignement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionRenseignement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionRenseignement' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionRenseignement> getMissionRenseignement();

	/**
	 * Returns the value of the '<em><b>Mission Renseignement Objectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionRenseignementObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Renseignement Objectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Renseignement Objectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionRenseignementObjectif()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionRenseignementObjectif' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionRenseignementObjectif> getMissionRenseignementObjectif();

	/**
	 * Returns the value of the '<em><b>Mission Sar Combat</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionSarCombat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Sar Combat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Sar Combat</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionSarCombat()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionSarCombat' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionSarCombat> getMissionSarCombat();

	/**
	 * Returns the value of the '<em><b>Mission Sic</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionSic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Sic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Sic</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionSic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionSic' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionSic> getMissionSic();

	/**
	 * Returns the value of the '<em><b>Mission Transport Tactique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionTransportTactique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Transport Tactique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Transport Tactique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionTransportTactique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionTransportTactique' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionTransportTactique> getMissionTransportTactique();

	/**
	 * Returns the value of the '<em><b>Mission Unite Antichar</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionUniteAntichar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Unite Antichar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Unite Antichar</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MissionUniteAntichar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissionUniteAntichar' group='#group:0'"
	 * @generated
	 */
	EList<TypeMissionUniteAntichar> getMissionUniteAntichar();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Module()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Module' group='#group:0'"
	 * @generated
	 */
	EList<TypeModule> getModule();

	/**
	 * Returns the value of the '<em><b>Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMouvementParRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MouvementParRoute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MouvementParRoute' group='#group:0'"
	 * @generated
	 */
	EList<TypeMouvementParRoute> getMouvementParRoute();

	/**
	 * Returns the value of the '<em><b>Moyens Aeriens Dont Beneficie GU</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensAeriensDontBeneficieGU}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Aeriens Dont Beneficie GU</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Aeriens Dont Beneficie GU</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MoyensAeriensDontBeneficieGU()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MoyensAeriensDontBeneficieGU' group='#group:0'"
	 * @generated
	 */
	EList<TypeMoyensAeriensDontBeneficieGU> getMoyensAeriensDontBeneficieGU();

	/**
	 * Returns the value of the '<em><b>Moyens Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MoyensGenie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MoyensGenie' group='#group:0'"
	 * @generated
	 */
	EList<TypeMoyensGenie> getMoyensGenie();

	/**
	 * Returns the value of the '<em><b>Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeObjetInconnu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ObjetInconnu()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjetInconnu' group='#group:0'"
	 * @generated
	 */
	EList<TypeObjetInconnu> getObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Objet Libre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeObjetLibre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objet Libre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet Libre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ObjetLibre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjetLibre' group='#group:0'"
	 * @generated
	 */
	EList<TypeObjetLibre> getObjetLibre();

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeObservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Observation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Observation' group='#group:0'"
	 * @generated
	 */
	EList<TypeObservation> getObservation();

	/**
	 * Returns the value of the '<em><b>Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Ordre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ordre' group='#group:0'"
	 * @generated
	 */
	EList<TypeOrdre> getOrdre();

	/**
	 * Returns the value of the '<em><b>Organisation Soutien Medical</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeOrganisationSoutienMedical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation Soutien Medical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation Soutien Medical</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_OrganisationSoutienMedical()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganisationSoutienMedical' group='#group:0'"
	 * @generated
	 */
	EList<TypeOrganisationSoutienMedical> getOrganisationSoutienMedical();

	/**
	 * Returns the value of the '<em><b>Ouvrage Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeOuvrageGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ouvrage Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ouvrage Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_OuvrageGenie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OuvrageGenie' group='#group:0'"
	 * @generated
	 */
	EList<TypeOuvrageGenie> getOuvrageGenie();

	/**
	 * Returns the value of the '<em><b>Overlay</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeOverlay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Overlay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Overlay' group='#group:0'"
	 * @generated
	 */
	EList<TypeOverlay> getOverlay();

	/**
	 * Returns the value of the '<em><b>Paragraphe Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeParagraphePlanOuOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraphe Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphe Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ParagraphePlanOuOrdre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParagraphePlanOuOrdre' group='#group:0'"
	 * @generated
	 */
	EList<TypeParagraphePlanOuOrdre> getParagraphePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Pertes Sante</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePertesSante}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pertes Sante</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pertes Sante</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PertesSante()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PertesSante' group='#group:0'"
	 * @generated
	 */
	EList<TypePertesSante> getPertesSante();

	/**
	 * Returns the value of the '<em><b>Pion Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePionReseau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pion Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pion Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PionReseau()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PionReseau' group='#group:0'"
	 * @generated
	 */
	EList<TypePionReseau> getPionReseau();

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Plan()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Plan' group='#group:0'"
	 * @generated
	 */
	EList<TypePlan> getPlan();

	/**
	 * Returns the value of the '<em><b>Plan Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlanFeux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PlanFeux()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlanFeux' group='#group:0'"
	 * @generated
	 */
	EList<TypePlanFeux> getPlanFeux();

	/**
	 * Returns the value of the '<em><b>Planification Cellule Soutien</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlanificationCelluleSoutien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planification Cellule Soutien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planification Cellule Soutien</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PlanificationCelluleSoutien()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlanificationCelluleSoutien' group='#group:0'"
	 * @generated
	 */
	EList<TypePlanificationCelluleSoutien> getPlanificationCelluleSoutien();

	/**
	 * Returns the value of the '<em><b>Planification Mouvement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlanificationMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planification Mouvement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planification Mouvement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PlanificationMouvement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlanificationMouvement' group='#group:0'"
	 * @generated
	 */
	EList<TypePlanificationMouvement> getPlanificationMouvement();

	/**
	 * Returns the value of the '<em><b>Planification Operation3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlanificationOperation3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planification Operation3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planification Operation3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PlanificationOperation3D()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlanificationOperation3D' group='#group:0'"
	 * @generated
	 */
	EList<TypePlanificationOperation3D> getPlanificationOperation3D();

	/**
	 * Returns the value of the '<em><b>Plan Numerotation Objectifs</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlanNumerotationObjectifs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Numerotation Objectifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Numerotation Objectifs</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PlanNumerotationObjectifs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlanNumerotationObjectifs' group='#group:0'"
	 * @generated
	 */
	EList<TypePlanNumerotationObjectifs> getPlanNumerotationObjectifs();

	/**
	 * Returns the value of the '<em><b>Plan Traitement Objectifs</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlanTraitementObjectifs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Traitement Objectifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Traitement Objectifs</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PlanTraitementObjectifs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlanTraitementObjectifs' group='#group:0'"
	 * @generated
	 */
	EList<TypePlanTraitementObjectifs> getPlanTraitementObjectifs();

	/**
	 * Returns the value of the '<em><b>Point Axe</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePointAxe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Axe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Axe</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PointAxe()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointAxe' group='#group:0'"
	 * @generated
	 */
	EList<TypePointAxe> getPointAxe();

	/**
	 * Returns the value of the '<em><b>Point Haut</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePointHaut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Haut</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Haut</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PointHaut()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointHaut' group='#group:0'"
	 * @generated
	 */
	EList<TypePointHaut> getPointHaut();

	/**
	 * Returns the value of the '<em><b>Point Trajectoire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePointTrajectoire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Trajectoire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Trajectoire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PointTrajectoire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointTrajectoire' group='#group:0'"
	 * @generated
	 */
	EList<TypePointTrajectoire> getPointTrajectoire();

	/**
	 * Returns the value of the '<em><b>Politique Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePolitiqueTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Politique Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Politique Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PolitiqueTir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolitiqueTir' group='#group:0'"
	 * @generated
	 */
	EList<TypePolitiqueTir> getPolitiqueTir();

	/**
	 * Returns the value of the '<em><b>Porteur Systeme Arme</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePorteurSystemeArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porteur Systeme Arme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porteur Systeme Arme</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PorteurSystemeArme()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PorteurSystemeArme' group='#group:0'"
	 * @generated
	 */
	EList<TypePorteurSystemeArme> getPorteurSystemeArme();

	/**
	 * Returns the value of the '<em><b>Possibilites ENI 3d</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePossibilitesENI3d}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possibilites ENI 3d</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possibilites ENI 3d</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PossibilitesENI3d()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PossibilitesENI3d' group='#group:0'"
	 * @generated
	 */
	EList<TypePossibilitesENI3d> getPossibilitesENI3d();

	/**
	 * Returns the value of the '<em><b>Poste Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePosteTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poste Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poste Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PosteTir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PosteTir' group='#group:0'"
	 * @generated
	 */
	EList<TypePosteTir> getPosteTir();

	/**
	 * Returns the value of the '<em><b>Potentiel EN Ifeu Sol Sol</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePotentielENIfeuSolSol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potentiel EN Ifeu Sol Sol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potentiel EN Ifeu Sol Sol</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PotentielENIfeuSolSol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PotentielENIfeuSolSol' group='#group:0'"
	 * @generated
	 */
	EList<TypePotentielENIfeuSolSol> getPotentielENIfeuSolSol();

	/**
	 * Returns the value of the '<em><b>Prelevement Subordonne Identifie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePrelevementSubordonneIdentifie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prelevement Subordonne Identifie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prelevement Subordonne Identifie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PrelevementSubordonneIdentifie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PrelevementSubordonneIdentifie' group='#group:0'"
	 * @generated
	 */
	EList<TypePrelevementSubordonneIdentifie> getPrelevementSubordonneIdentifie();

	/**
	 * Returns the value of the '<em><b>Prelevement Subordonne Non Identifie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePrelevementSubordonneNonIdentifie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prelevement Subordonne Non Identifie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prelevement Subordonne Non Identifie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PrelevementSubordonneNonIdentifie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PrelevementSubordonneNonIdentifie' group='#group:0'"
	 * @generated
	 */
	EList<TypePrelevementSubordonneNonIdentifie> getPrelevementSubordonneNonIdentifie();

	/**
	 * Returns the value of the '<em><b>Prevision Observation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePrevisionObservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prevision Observation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prevision Observation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PrevisionObservation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PrevisionObservation' group='#group:0'"
	 * @generated
	 */
	EList<TypePrevisionObservation> getPrevisionObservation();

	/**
	 * Returns the value of the '<em><b>Priorite Tactique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePrioriteTactique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Tactique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Tactique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PrioriteTactique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PrioriteTactique' group='#group:0'"
	 * @generated
	 */
	EList<TypePrioriteTactique> getPrioriteTactique();

	/**
	 * Returns the value of the '<em><b>Priorite Technique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePrioriteTechnique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Technique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Technique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PrioriteTechnique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PrioriteTechnique' group='#group:0'"
	 * @generated
	 */
	EList<TypePrioriteTechnique> getPrioriteTechnique();

	/**
	 * Returns the value of the '<em><b>Procedure IFF</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeProcedureIFF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure IFF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure IFF</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ProcedureIFF()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcedureIFF' group='#group:0'"
	 * @generated
	 */
	EList<TypeProcedureIFF> getProcedureIFF();

	/**
	 * Returns the value of the '<em><b>Projet Cimic</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeProjetCimic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projet Cimic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projet Cimic</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ProjetCimic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProjetCimic' group='#group:0'"
	 * @generated
	 */
	EList<TypeProjetCimic> getProjetCimic();

	/**
	 * Returns the value of the '<em><b>Raid Aerien Ennemi</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRaidAerienEnnemi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raid Aerien Ennemi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raid Aerien Ennemi</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_RaidAerienEnnemi()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RaidAerienEnnemi' group='#group:0'"
	 * @generated
	 */
	EList<TypeRaidAerienEnnemi> getRaidAerienEnnemi();

	/**
	 * Returns the value of the '<em><b>Rapport Force</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRapportForce}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rapport Force</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rapport Force</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_RapportForce()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RapportForce' group='#group:0'"
	 * @generated
	 */
	EList<TypeRapportForce> getRapportForce();

	/**
	 * Returns the value of the '<em><b>Rattachement Logistique Particulier</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRattachementLogistiqueParticulier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rattachement Logistique Particulier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rattachement Logistique Particulier</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_RattachementLogistiqueParticulier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RattachementLogistiqueParticulier' group='#group:0'"
	 * @generated
	 */
	EList<TypeRattachementLogistiqueParticulier> getRattachementLogistiqueParticulier();

	/**
	 * Returns the value of the '<em><b>Ravitaillement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRavitaillement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ravitaillement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ravitaillement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Ravitaillement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ravitaillement' group='#group:0'"
	 * @generated
	 */
	EList<TypeRavitaillement> getRavitaillement();

	/**
	 * Returns the value of the '<em><b>Rechange</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRechange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rechange</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rechange</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Rechange()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Rechange' group='#group:0'"
	 * @generated
	 */
	EList<TypeRechange> getRechange();

	/**
	 * Returns the value of the '<em><b>Renforcements Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRenforcementsFeux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renforcements Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renforcements Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_RenforcementsFeux()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RenforcementsFeux' group='#group:0'"
	 * @generated
	 */
	EList<TypeRenforcementsFeux> getRenforcementsFeux();

	/**
	 * Returns the value of the '<em><b>Renseignement Objectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRenseignementObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renseignement Objectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renseignement Objectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_RenseignementObjectif()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RenseignementObjectif' group='#group:0'"
	 * @generated
	 */
	EList<TypeRenseignementObjectif> getRenseignementObjectif();

	/**
	 * Returns the value of the '<em><b>Reservation Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeReservationUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ReservationUnite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReservationUnite' group='#group:0'"
	 * @generated
	 */
	EList<TypeReservationUnite> getReservationUnite();

	/**
	 * Returns the value of the '<em><b>Route Helicoptere ALAT</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRouteHelicoptereALAT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Helicoptere ALAT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Helicoptere ALAT</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_RouteHelicoptereALAT()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RouteHelicoptereALAT' group='#group:0'"
	 * @generated
	 */
	EList<TypeRouteHelicoptereALAT> getRouteHelicoptereALAT();

	/**
	 * Returns the value of the '<em><b>Situation Consommable</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSituationConsommable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Consommable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Consommable</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SituationConsommable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SituationConsommable' group='#group:0'"
	 * @generated
	 */
	EList<TypeSituationConsommable> getSituationConsommable();

	/**
	 * Returns the value of the '<em><b>Situation Effectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSituationEffectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Effectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Effectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SituationEffectif()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SituationEffectif' group='#group:0'"
	 * @generated
	 */
	EList<TypeSituationEffectif> getSituationEffectif();

	/**
	 * Returns the value of the '<em><b>Situation Equipement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSituationEquipement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Equipement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Equipement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SituationEquipement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SituationEquipement' group='#group:0'"
	 * @generated
	 */
	EList<TypeSituationEquipement> getSituationEquipement();

	/**
	 * Returns the value of the '<em><b>Situation Radiation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSituationRadiation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Radiation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Radiation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SituationRadiation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SituationRadiation' group='#group:0'"
	 * @generated
	 */
	EList<TypeSituationRadiation> getSituationRadiation();

	/**
	 * Returns the value of the '<em><b>Situation Vehicule</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSituationVehicule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Vehicule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Vehicule</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SituationVehicule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SituationVehicule' group='#group:0'"
	 * @generated
	 */
	EList<TypeSituationVehicule> getSituationVehicule();

	/**
	 * Returns the value of the '<em><b>Symbole Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymboleAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Annotation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymboleAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymboleAnnotation' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymboleAnnotation> getSymboleAnnotation();

	/**
	 * Returns the value of the '<em><b>Symbole Cercle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymboleCercle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Cercle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Cercle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymboleCercle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymboleCercle' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymboleCercle> getSymboleCercle();

	/**
	 * Returns the value of the '<em><b>Symbole Fleche</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymboleFleche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Fleche</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Fleche</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymboleFleche()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymboleFleche' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymboleFleche> getSymboleFleche();

	/**
	 * Returns the value of the '<em><b>Symbole Image</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymboleImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Image</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymboleImage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymboleImage' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymboleImage> getSymboleImage();

	/**
	 * Returns the value of the '<em><b>Symbole Lineique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymboleLineique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Lineique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Lineique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymboleLineique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymboleLineique' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymboleLineique> getSymboleLineique();

	/**
	 * Returns the value of the '<em><b>Symbole Note</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymboleNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Note</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymboleNote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymboleNote' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymboleNote> getSymboleNote();

	/**
	 * Returns the value of the '<em><b>Symbole Point</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymbolePoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Point</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymbolePoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymbolePoint' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymbolePoint> getSymbolePoint();

	/**
	 * Returns the value of the '<em><b>Symbole Post It</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymbolePostIt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Post It</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Post It</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymbolePostIt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymbolePostIt' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymbolePostIt> getSymbolePostIt();

	/**
	 * Returns the value of the '<em><b>Symbole Tactique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymboleTactique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Tactique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Tactique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymboleTactique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymboleTactique' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymboleTactique> getSymboleTactique();

	/**
	 * Returns the value of the '<em><b>Symbole Texte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSymboleTexte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole Texte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole Texte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SymboleTexte()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymboleTexte' group='#group:0'"
	 * @generated
	 */
	EList<TypeSymboleTexte> getSymboleTexte();

	/**
	 * Returns the value of the '<em><b>Synthese Detections</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSyntheseDetections}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthese Detections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthese Detections</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SyntheseDetections()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SyntheseDetections' group='#group:0'"
	 * @generated
	 */
	EList<TypeSyntheseDetections> getSyntheseDetections();

	/**
	 * Returns the value of the '<em><b>Systeme Atterrissage Aux Instruments</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSystemeAtterrissageAuxInstruments}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systeme Atterrissage Aux Instruments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systeme Atterrissage Aux Instruments</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SystemeAtterrissageAuxInstruments()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemeAtterrissageAuxInstruments' group='#group:0'"
	 * @generated
	 */
	EList<TypeSystemeAtterrissageAuxInstruments> getSystemeAtterrissageAuxInstruments();

	/**
	 * Returns the value of the '<em><b>Traitement Objectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTraitementObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traitement Objectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traitement Objectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TraitementObjectif()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TraitementObjectif' group='#group:0'"
	 * @generated
	 */
	EList<TypeTraitementObjectif> getTraitementObjectif();

	/**
	 * Returns the value of the '<em><b>Travail Aide Deploiement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTravailAideDeploiement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travail Aide Deploiement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travail Aide Deploiement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TravailAideDeploiement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TravailAideDeploiement' group='#group:0'"
	 * @generated
	 */
	EList<TypeTravailAideDeploiement> getTravailAideDeploiement();

	/**
	 * Returns the value of the '<em><b>Type Armement Systeme Arme</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeArmementSystemeArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Armement Systeme Arme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Armement Systeme Arme</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeArmementSystemeArme()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeArmementSystemeArme' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeArmementSystemeArme> getTypeArmementSystemeArme();

	/**
	 * Returns the value of the '<em><b>Type Capteur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeCapteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Capteur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Capteur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeCapteur()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeCapteur' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeCapteur> getTypeCapteur();

	/**
	 * Returns the value of the '<em><b>Type Equipement Systeme Arme</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeEquipementSystemeArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Equipement Systeme Arme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Equipement Systeme Arme</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeEquipementSystemeArme()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeEquipementSystemeArme' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeEquipementSystemeArme> getTypeEquipementSystemeArme();

	/**
	 * Returns the value of the '<em><b>Type Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeItineraire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeItineraire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeItineraire' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeItineraire> getTypeItineraire();

	/**
	 * Returns the value of the '<em><b>Type Munition Systeme Arme</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeMunitionSystemeArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Munition Systeme Arme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Munition Systeme Arme</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeMunitionSystemeArme()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeMunitionSystemeArme' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeMunitionSystemeArme> getTypeMunitionSystemeArme();

	/**
	 * Returns the value of the '<em><b>Type Organisation Militaire Executive</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeOrganisationMilitaireExecutive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Organisation Militaire Executive</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Organisation Militaire Executive</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeOrganisationMilitaireExecutive()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeOrganisationMilitaireExecutive' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeOrganisationMilitaireExecutive> getTypeOrganisationMilitaireExecutive();

	/**
	 * Returns the value of the '<em><b>Type Porteur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypePorteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Porteur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Porteur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypePorteur()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypePorteur' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypePorteur> getTypePorteur();

	/**
	 * Returns the value of the '<em><b>Variante Travail</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVarianteTravail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variante Travail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variante Travail</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_VarianteTravail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VarianteTravail' group='#group:0'"
	 * @generated
	 */
	EList<TypeVarianteTravail> getVarianteTravail();

	/**
	 * Returns the value of the '<em><b>Vehicule</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVehicule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicule</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Vehicule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Vehicule' group='#group:0'"
	 * @generated
	 */
	EList<TypeVehicule> getVehicule();

	/**
	 * Returns the value of the '<em><b>Vol</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vol</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Vol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Vol' group='#group:0'"
	 * @generated
	 */
	EList<TypeVol> getVol();

	/**
	 * Returns the value of the '<em><b>Zone Alat</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneAlat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Alat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Alat</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ZoneAlat()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ZoneAlat' group='#group:0'"
	 * @generated
	 */
	EList<TypeZoneAlat> getZoneAlat();

	/**
	 * Returns the value of the '<em><b>Zone Fonctionnelle Logistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneFonctionnelleLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Fonctionnelle Logistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Fonctionnelle Logistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ZoneFonctionnelleLogistique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ZoneFonctionnelleLogistique' group='#group:0'"
	 * @generated
	 */
	EList<TypeZoneFonctionnelleLogistique> getZoneFonctionnelleLogistique();

	/**
	 * Returns the value of the '<em><b>Zone Logistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Logistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Logistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ZoneLogistique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ZoneLogistique' group='#group:0'"
	 * @generated
	 */
	EList<TypeZoneLogistique> getZoneLogistique();

	/**
	 * Returns the value of the '<em><b>Zone Mise ATerre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneMiseATerre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Mise ATerre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Mise ATerre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ZoneMiseATerre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ZoneMiseATerre' group='#group:0'"
	 * @generated
	 */
	EList<TypeZoneMiseATerre> getZoneMiseATerre();

	/**
	 * Returns the value of the '<em><b>Zone Recherche</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneRecherche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Recherche</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Recherche</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ZoneRecherche()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ZoneRecherche' group='#group:0'"
	 * @generated
	 */
	EList<TypeZoneRecherche> getZoneRecherche();

	/**
	 * Returns the value of the '<em><b>Adresse Electronique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAdresseElectronique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse Electronique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Electronique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AdresseElectronique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdresseElectronique' group='#group:0'"
	 * @generated
	 */
	EList<TypeAdresseElectronique> getAdresseElectronique();

	/**
	 * Returns the value of the '<em><b>Adresse Physique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAdressePhysique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse Physique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Physique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AdressePhysique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdressePhysique' group='#group:0'"
	 * @generated
	 */
	EList<TypeAdressePhysique> getAdressePhysique();

	/**
	 * Returns the value of the '<em><b>Adresse Radio</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAdresseRadio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse Radio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Radio</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AdresseRadio()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdresseRadio' group='#group:0'"
	 * @generated
	 */
	EList<TypeAdresseRadio> getAdresseRadio();

	/**
	 * Returns the value of the '<em><b>Aerodrome</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAerodrome}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aerodrome</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aerodrome</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Aerodrome()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Aerodrome' group='#group:0'"
	 * @generated
	 */
	EList<TypeAerodrome> getAerodrome();

	/**
	 * Returns the value of the '<em><b>Aire Stationnement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAireStationnement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aire Stationnement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aire Stationnement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AireStationnement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AireStationnement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAireStationnement> getAireStationnement();

	/**
	 * Returns the value of the '<em><b>Articulation Marine</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeArticulationMarine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articulation Marine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articulation Marine</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ArticulationMarine()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArticulationMarine' group='#group:0'"
	 * @generated
	 */
	EList<TypeArticulationMarine> getArticulationMarine();

	/**
	 * Returns the value of the '<em><b>Articulation Terre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeArticulationTerre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articulation Terre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articulation Terre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ArticulationTerre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArticulationTerre' group='#group:0'"
	 * @generated
	 */
	EList<TypeArticulationTerre> getArticulationTerre();

	/**
	 * Returns the value of the '<em><b>Assoc Activite Contexte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocActiviteContexte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc Activite Contexte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc Activite Contexte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssocActiviteContexte()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssocActiviteContexte' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssocActiviteContexte> getAssocActiviteContexte();

	/**
	 * Returns the value of the '<em><b>Assoc Contexte Contexte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocContexteContexte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc Contexte Contexte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc Contexte Contexte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssocContexteContexte()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssocContexteContexte' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssocContexteContexte> getAssocContexteContexte();

	/**
	 * Returns the value of the '<em><b>Assoc Contexte Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocContexteInstanceObjet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc Contexte Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc Contexte Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssocContexteInstanceObjet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssocContexteInstanceObjet' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssocContexteInstanceObjet> getAssocContexteInstanceObjet();

	/**
	 * Returns the value of the '<em><b>Association Activite Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationActiviteCapacite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Activite Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Activite Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationActiviteCapacite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationActiviteCapacite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationActiviteCapacite> getAssociationActiviteCapacite();

	/**
	 * Returns the value of the '<em><b>Association Affiliation Affiliation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationAffiliationAffiliation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Affiliation Affiliation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Affiliation Affiliation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationAffiliationAffiliation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationAffiliationAffiliation' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationAffiliationAffiliation> getAssociationAffiliationAffiliation();

	/**
	 * Returns the value of the '<em><b>Association Affiliation Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationAffiliationInstanceObjet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Affiliation Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Affiliation Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationAffiliationInstanceObjet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationAffiliationInstanceObjet' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationAffiliationInstanceObjet> getAssociationAffiliationInstanceObjet();

	/**
	 * Returns the value of the '<em><b>Association Affiliation Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationAffiliationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Affiliation Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Affiliation Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationAffiliationType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationAffiliationType' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationAffiliationType> getAssociationAffiliationType();

	/**
	 * Returns the value of the '<em><b>Association Consommation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationConsommation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Consommation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Consommation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationConsommation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationConsommation' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationConsommation> getAssociationConsommation();

	/**
	 * Returns the value of the '<em><b>Association Contexte Rapport</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationContexteRapport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Contexte Rapport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Contexte Rapport</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationContexteRapport()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationContexteRapport' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationContexteRapport> getAssociationContexteRapport();

	/**
	 * Returns the value of the '<em><b>Association Document Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationDocumentCapacite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Document Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Document Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationDocumentCapacite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationDocumentCapacite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationDocumentCapacite> getAssociationDocumentCapacite();

	/**
	 * Returns the value of the '<em><b>Association Groupe Info Ops Entite Organisationnelle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Groupe Info Ops Entite Organisationnelle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Groupe Info Ops Entite Organisationnelle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationGroupeInfoOpsEntiteOrganisationnelle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationGroupeInfoOpsEntiteOrganisationnelle' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationGroupeInfoOpsEntiteOrganisationnelle> getAssociationGroupeInfoOpsEntiteOrganisationnelle();

	/**
	 * Returns the value of the '<em><b>Association Instance Objet Adresse</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationInstanceObjetAdresse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Instance Objet Adresse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Instance Objet Adresse</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationInstanceObjetAdresse()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationInstanceObjetAdresse' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationInstanceObjetAdresse> getAssociationInstanceObjetAdresse();

	/**
	 * Returns the value of the '<em><b>Association Instance Objet Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationInstanceObjetCapacite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Instance Objet Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Instance Objet Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationInstanceObjetCapacite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationInstanceObjetCapacite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationInstanceObjetCapacite> getAssociationInstanceObjetCapacite();

	/**
	 * Returns the value of the '<em><b>Association Objectif Ciblage Objectif Ciblage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Objectif Ciblage Objectif Ciblage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Objectif Ciblage Objectif Ciblage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationObjectifCiblageObjectifCiblage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationObjectifCiblageObjectifCiblage' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationObjectifCiblageObjectifCiblage> getAssociationObjectifCiblageObjectifCiblage();

	/**
	 * Returns the value of the '<em><b>Association Profil Dotation Theorique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationProfilDotationTheorique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Profil Dotation Theorique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Profil Dotation Theorique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationProfilDotationTheorique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationProfilDotationTheorique' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationProfilDotationTheorique> getAssociationProfilDotationTheorique();

	/**
	 * Returns the value of the '<em><b>Association Profil Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationProfilUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Profil Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Profil Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationProfilUnite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationProfilUnite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationProfilUnite> getAssociationProfilUnite();

	/**
	 * Returns the value of the '<em><b>Association Racine Operationnelle Document</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationRacineOperationnelleDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Racine Operationnelle Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Racine Operationnelle Document</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationRacineOperationnelleDocument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationRacineOperationnelleDocument' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationRacineOperationnelleDocument> getAssociationRacineOperationnelleDocument();

	/**
	 * Returns the value of the '<em><b>Association Temporelle Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationTemporelleActivite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Temporelle Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Temporelle Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationTemporelleActivite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationTemporelleActivite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationTemporelleActivite> getAssociationTemporelleActivite();

	/**
	 * Returns the value of the '<em><b>Association Type Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationTypeCapacite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssociationTypeCapacite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationTypeCapacite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssociationTypeCapacite> getAssociationTypeCapacite();

	/**
	 * Returns the value of the '<em><b>Assoc Liste Obj Cand Liste Obj Cand</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocListeObjCandListeObjCand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc Liste Obj Cand Liste Obj Cand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc Liste Obj Cand Liste Obj Cand</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssocListeObjCandListeObjCand()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssocListeObjCandListeObjCand' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssocListeObjCandListeObjCand> getAssocListeObjCandListeObjCand();

	/**
	 * Returns the value of the '<em><b>Assoc Piste Atter Dir App Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocPisteAtterDirAppAir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc Piste Atter Dir App Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc Piste Atter Dir App Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AssocPisteAtterDirAppAir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssocPisteAtterDirAppAir' group='#group:0'"
	 * @generated
	 */
	EList<TypeAssocPisteAtterDirAppAir> getAssocPisteAtterDirAppAir();

	/**
	 * Returns the value of the '<em><b>Autre Adresse</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreAdresse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Adresse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Adresse</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreAdresse()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreAdresse' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreAdresse> getAutreAdresse();

	/**
	 * Returns the value of the '<em><b>Autre Articulation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreArticulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Articulation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Articulation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreArticulation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreArticulation' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreArticulation> getAutreArticulation();

	/**
	 * Returns the value of the '<em><b>Autre Contexte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreContexte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Contexte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Contexte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreContexte()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreContexte' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreContexte> getAutreContexte();

	/**
	 * Returns the value of the '<em><b>Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreElementControle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreElementControle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreElementControle' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreElementControle> getAutreElementControle();

	/**
	 * Returns the value of the '<em><b>Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreEvenement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreEvenement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreEvenement> getAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Autre Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreEvenementNRBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreEvenementNRBC()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreEvenementNRBC' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreEvenementNRBC> getAutreEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Autre Evenement Radioactif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreEvenementRadioactif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Evenement Radioactif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Evenement Radioactif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreEvenementRadioactif()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreEvenementRadioactif' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreEvenementRadioactif> getAutreEvenementRadioactif();

	/**
	 * Returns the value of the '<em><b>Autre Liste Objectifs</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreListeObjectifs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Liste Objectifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Liste Objectifs</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreListeObjectifs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreListeObjectifs' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreListeObjectifs> getAutreListeObjectifs();

	/**
	 * Returns the value of the '<em><b>Autre Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreMateriel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreMateriel' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreMateriel> getAutreMateriel();

	/**
	 * Returns the value of the '<em><b>Autre Nom</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreNom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Nom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Nom</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreNom()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreNom' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreNom> getAutreNom();

	/**
	 * Returns the value of the '<em><b>Autre Obstacle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreObstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Obstacle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Obstacle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreObstacle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreObstacle' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreObstacle> getAutreObstacle();

	/**
	 * Returns the value of the '<em><b>Autre Segment Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreSegmentItineraire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Segment Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Segment Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreSegmentItineraire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreSegmentItineraire' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreSegmentItineraire> getAutreSegmentItineraire();

	/**
	 * Returns the value of the '<em><b>Autre Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreSite> getAutreSite();

	/**
	 * Returns the value of the '<em><b>Autre Type Batiment</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreTypeBatiment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Batiment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Batiment</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreTypeBatiment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreTypeBatiment' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreTypeBatiment> getAutreTypeBatiment();

	/**
	 * Returns the value of the '<em><b>Autre Type Consommable</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreTypeConsommable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Consommable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Consommable</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreTypeConsommable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreTypeConsommable' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreTypeConsommable> getAutreTypeConsommable();

	/**
	 * Returns the value of the '<em><b>Autre Type Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreTypeElementControle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreTypeElementControle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreTypeElementControle' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreTypeElementControle> getAutreTypeElementControle();

	/**
	 * Returns the value of the '<em><b>Autre Type Entite Organisationnelle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreTypeEntiteOrganisationnelle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Entite Organisationnelle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Entite Organisationnelle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreTypeEntiteOrganisationnelle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreTypeEntiteOrganisationnelle' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreTypeEntiteOrganisationnelle> getAutreTypeEntiteOrganisationnelle();

	/**
	 * Returns the value of the '<em><b>Autre Type Equipement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreTypeEquipement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Equipement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Equipement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreTypeEquipement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreTypeEquipement' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreTypeEquipement> getAutreTypeEquipement();

	/**
	 * Returns the value of the '<em><b>Autre Type Organisation Gouvernementale</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreTypeOrganisationGouvernementale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Organisation Gouvernementale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Organisation Gouvernementale</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreTypeOrganisationGouvernementale()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreTypeOrganisationGouvernementale' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreTypeOrganisationGouvernementale> getAutreTypeOrganisationGouvernementale();

	/**
	 * Returns the value of the '<em><b>Autre Type Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutreTypeSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_AutreTypeSite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutreTypeSite' group='#group:0'"
	 * @generated
	 */
	EList<TypeAutreTypeSite> getAutreTypeSite();

	/**
	 * Returns the value of the '<em><b>Bassin</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBassin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bassin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bassin</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Bassin()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bassin' group='#group:0'"
	 * @generated
	 */
	EList<TypeBassin> getBassin();

	/**
	 * Returns the value of the '<em><b>Batiment</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBatiment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batiment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batiment</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Batiment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Batiment' group='#group:0'"
	 * @generated
	 */
	EList<TypeBatiment> getBatiment();

	/**
	 * Returns the value of the '<em><b>Cale Lancement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCaleLancement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cale Lancement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cale Lancement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CaleLancement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CaleLancement' group='#group:0'"
	 * @generated
	 */
	EList<TypeCaleLancement> getCaleLancement();

	/**
	 * Returns the value of the '<em><b>Cale Seche</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCaleSeche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cale Seche</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cale Seche</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CaleSeche()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CaleSeche' group='#group:0'"
	 * @generated
	 */
	EList<TypeCaleSeche> getCaleSeche();

	/**
	 * Returns the value of the '<em><b>Capacite Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteFeux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteFeux()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteFeux' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteFeux> getCapaciteFeux();

	/**
	 * Returns the value of the '<em><b>Capacite Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteGenie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteGenie' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteGenie> getCapaciteGenie();

	/**
	 * Returns the value of the '<em><b>Capacite Mobilite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteMobilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Mobilite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Mobilite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteMobilite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteMobilite' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteMobilite> getCapaciteMobilite();

	/**
	 * Returns the value of the '<em><b>Capacite Stockage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteStockage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Stockage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Stockage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteStockage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteStockage' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteStockage> getCapaciteStockage();

	/**
	 * Returns the value of the '<em><b>Capacite Surveillance</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteSurveillance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Surveillance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Surveillance</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CapaciteSurveillance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapaciteSurveillance' group='#group:0'"
	 * @generated
	 */
	EList<TypeCapaciteSurveillance> getCapaciteSurveillance();

	/**
	 * Returns the value of the '<em><b>Caracteristique Logistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCaracteristiqueLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteristique Logistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristique Logistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CaracteristiqueLogistique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CaracteristiqueLogistique' group='#group:0'"
	 * @generated
	 */
	EList<TypeCaracteristiqueLogistique> getCaracteristiqueLogistique();

	/**
	 * Returns the value of the '<em><b>Caracteristique Transport</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCaracteristiqueTransport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteristique Transport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristique Transport</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CaracteristiqueTransport()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CaracteristiqueTransport' group='#group:0'"
	 * @generated
	 */
	EList<TypeCaracteristiqueTransport> getCaracteristiqueTransport();

	/**
	 * Returns the value of the '<em><b>Champ Mines Maritime</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeChampMinesMaritime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Champ Mines Maritime</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champ Mines Maritime</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ChampMinesMaritime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChampMinesMaritime' group='#group:0'"
	 * @generated
	 */
	EList<TypeChampMinesMaritime> getChampMinesMaritime();

	/**
	 * Returns the value of the '<em><b>Champ Mines Terrestre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeChampMinesTerrestre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Champ Mines Terrestre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champ Mines Terrestre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ChampMinesTerrestre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChampMinesTerrestre' group='#group:0'"
	 * @generated
	 */
	EList<TypeChampMinesTerrestre> getChampMinesTerrestre();

	/**
	 * Returns the value of the '<em><b>Charnier</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCharnier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charnier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charnier</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Charnier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Charnier' group='#group:0'"
	 * @generated
	 */
	EList<TypeCharnier> getCharnier();

	/**
	 * Returns the value of the '<em><b>Chemin Fer</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCheminFer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chemin Fer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin Fer</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CheminFer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CheminFer' group='#group:0'"
	 * @generated
	 */
	EList<TypeCheminFer> getCheminFer();

	/**
	 * Returns the value of the '<em><b>Composition Dotation Theorique En Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCompositionDotationTheoriqueEnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Dotation Theorique En Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Dotation Theorique En Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_CompositionDotationTheoriqueEnType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompositionDotationTheoriqueEnType' group='#group:0'"
	 * @generated
	 */
	EList<TypeCompositionDotationTheoriqueEnType> getCompositionDotationTheoriqueEnType();

	/**
	 * Returns the value of the '<em><b>Convoi</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConvoi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convoi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convoi</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Convoi()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Convoi' group='#group:0'"
	 * @generated
	 */
	EList<TypeConvoi> getConvoi();

	/**
	 * Returns the value of the '<em><b>Direction Approche Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDirectionApprocheAir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Approche Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Approche Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DirectionApprocheAir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DirectionApprocheAir' group='#group:0'"
	 * @generated
	 */
	EList<TypeDirectionApprocheAir> getDirectionApprocheAir();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Document()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Document' group='#group:0'"
	 * @generated
	 */
	EList<TypeDocument> getDocument();

	/**
	 * Returns the value of the '<em><b>Dotation Theorique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDotationTheorique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dotation Theorique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dotation Theorique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DotationTheorique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DotationTheorique' group='#group:0'"
	 * @generated
	 */
	EList<TypeDotationTheorique> getDotationTheorique();

	/**
	 * Returns the value of the '<em><b>Dotation Theorique Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDotationTheoriqueInstanceObjet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dotation Theorique Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dotation Theorique Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_DotationTheoriqueInstanceObjet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DotationTheoriqueInstanceObjet' group='#group:0'"
	 * @generated
	 */
	EList<TypeDotationTheoriqueInstanceObjet> getDotationTheoriqueInstanceObjet();

	/**
	 * Returns the value of the '<em><b>Element Topographie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeElementTopographie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Topographie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Topographie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ElementTopographie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ElementTopographie' group='#group:0'"
	 * @generated
	 */
	EList<TypeElementTopographie> getElementTopographie();

	/**
	 * Returns the value of the '<em><b>Entite Politique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEntitePolitique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entite Politique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entite Politique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_EntitePolitique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntitePolitique' group='#group:0'"
	 * @generated
	 */
	EList<TypeEntitePolitique> getEntitePolitique();

	/**
	 * Returns the value of the '<em><b>Evenement Arme Nucleaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvenementArmeNucleaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evenement Arme Nucleaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenement Arme Nucleaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_EvenementArmeNucleaire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EvenementArmeNucleaire' group='#group:0'"
	 * @generated
	 */
	EList<TypeEvenementArmeNucleaire> getEvenementArmeNucleaire();

	/**
	 * Returns the value of the '<em><b>Evenement Chimique Et Biologique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvenementChimiqueEtBiologique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evenement Chimique Et Biologique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenement Chimique Et Biologique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_EvenementChimiqueEtBiologique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EvenementChimiqueEtBiologique' group='#group:0'"
	 * @generated
	 */
	EList<TypeEvenementChimiqueEtBiologique> getEvenementChimiqueEtBiologique();

	/**
	 * Returns the value of the '<em><b>Evenement Radiologique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvenementRadiologique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evenement Radiologique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenement Radiologique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_EvenementRadiologique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EvenementRadiologique' group='#group:0'"
	 * @generated
	 */
	EList<TypeEvenementRadiologique> getEvenementRadiologique();

	/**
	 * Returns the value of the '<em><b>Groupe Ethnique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeGroupeEthnique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupe Ethnique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe Ethnique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_GroupeEthnique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupeEthnique' group='#group:0'"
	 * @generated
	 */
	EList<TypeGroupeEthnique> getGroupeEthnique();

	/**
	 * Returns the value of the '<em><b>Groupe Fonctionnel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeGroupeFonctionnel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupe Fonctionnel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe Fonctionnel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_GroupeFonctionnel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupeFonctionnel' group='#group:0'"
	 * @generated
	 */
	EList<TypeGroupeFonctionnel> getGroupeFonctionnel();

	/**
	 * Returns the value of the '<em><b>Groupe Individus</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeGroupeIndividus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupe Individus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe Individus</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_GroupeIndividus()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupeIndividus' group='#group:0'"
	 * @generated
	 */
	EList<TypeGroupeIndividus> getGroupeIndividus();

	/**
	 * Returns the value of the '<em><b>Groupe Informations Operationnelles</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeGroupeInformationsOperationnelles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupe Informations Operationnelles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe Informations Operationnelles</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_GroupeInformationsOperationnelles()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupeInformationsOperationnelles' group='#group:0'"
	 * @generated
	 */
	EList<TypeGroupeInformationsOperationnelles> getGroupeInformationsOperationnelles();

	/**
	 * Returns the value of the '<em><b>Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeItineraire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Itineraire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Itineraire' group='#group:0'"
	 * @generated
	 */
	EList<TypeItineraire> getItineraire();

	/**
	 * Returns the value of the '<em><b>Jetee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeJetee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jetee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jetee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Jetee()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Jetee' group='#group:0'"
	 * @generated
	 */
	EList<TypeJetee> getJetee();

	/**
	 * Returns the value of the '<em><b>Limite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeLimite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Limite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Limite' group='#group:0'"
	 * @generated
	 */
	EList<TypeLimite> getLimite();

	/**
	 * Returns the value of the '<em><b>Liste Objectifs Candidats</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeListeObjectifsCandidats}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Objectifs Candidats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Objectifs Candidats</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ListeObjectifsCandidats()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListeObjectifsCandidats' group='#group:0'"
	 * @generated
	 */
	EList<TypeListeObjectifsCandidats> getListeObjectifsCandidats();

	/**
	 * Returns the value of the '<em><b>Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMesureCoordination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_MesureCoordination()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MesureCoordination' group='#group:0'"
	 * @generated
	 */
	EList<TypeMesureCoordination> getMesureCoordination();

	/**
	 * Returns the value of the '<em><b>Mouillage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMouillage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouillage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouillage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Mouillage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mouillage' group='#group:0'"
	 * @generated
	 */
	EList<TypeMouillage> getMouillage();

	/**
	 * Returns the value of the '<em><b>Objectif Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeObjectifActivite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectif Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectif Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ObjectifActivite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectifActivite' group='#group:0'"
	 * @generated
	 */
	EList<TypeObjectifActivite> getObjectifActivite();

	/**
	 * Returns the value of the '<em><b>Objectif Ciblage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeObjectifCiblage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectif Ciblage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectif Ciblage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ObjectifCiblage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectifCiblage' group='#group:0'"
	 * @generated
	 */
	EList<TypeObjectifCiblage> getObjectifCiblage();

	/**
	 * Returns the value of the '<em><b>Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Personne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Personne' group='#group:0'"
	 * @generated
	 */
	EList<TypePersonne> getPersonne();

	/**
	 * Returns the value of the '<em><b>Piste Atterrissage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePisteAtterrissage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piste Atterrissage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piste Atterrissage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PisteAtterrissage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PisteAtterrissage' group='#group:0'"
	 * @generated
	 */
	EList<TypePisteAtterrissage> getPisteAtterrissage();

	/**
	 * Returns the value of the '<em><b>Point Controle3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePointControle3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Controle3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Controle3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PointControle3D()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointControle3D' group='#group:0'"
	 * @generated
	 */
	EList<TypePointControle3D> getPointControle3D();

	/**
	 * Returns the value of the '<em><b>Pont</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePont}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pont</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pont</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Pont()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Pont' group='#group:0'"
	 * @generated
	 */
	EList<TypePont> getPont();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Port()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Port' group='#group:0'"
	 * @generated
	 */
	EList<TypePort> getPort();

	/**
	 * Returns the value of the '<em><b>Poste Amarrage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePosteAmarrage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poste Amarrage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poste Amarrage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_PosteAmarrage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PosteAmarrage' group='#group:0'"
	 * @generated
	 */
	EList<TypePosteAmarrage> getPosteAmarrage();

	/**
	 * Returns the value of the '<em><b>Profil</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeProfil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profil</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profil</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Profil()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Profil' group='#group:0'"
	 * @generated
	 */
	EList<TypeProfil> getProfil();

	/**
	 * Returns the value of the '<em><b>Quai Maritime</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuaiMaritime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quai Maritime</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quai Maritime</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_QuaiMaritime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QuaiMaritime' group='#group:0'"
	 * @generated
	 */
	EList<TypeQuaiMaritime> getQuaiMaritime();

	/**
	 * Returns the value of the '<em><b>Rapport</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRapport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rapport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rapport</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Rapport()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Rapport' group='#group:0'"
	 * @generated
	 */
	EList<TypeRapport> getRapport();

	/**
	 * Returns the value of the '<em><b>Regle Engagement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRegleEngagement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regle Engagement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regle Engagement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_RegleEngagement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegleEngagement' group='#group:0'"
	 * @generated
	 */
	EList<TypeRegleEngagement> getRegleEngagement();

	/**
	 * Returns the value of the '<em><b>Religion</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeReligion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Religion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Religion</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Religion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Religion' group='#group:0'"
	 * @generated
	 */
	EList<TypeReligion> getReligion();

	/**
	 * Returns the value of the '<em><b>Reseau Telecommunication</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeReseauTelecommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reseau Telecommunication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reseau Telecommunication</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ReseauTelecommunication()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReseauTelecommunication' group='#group:0'"
	 * @generated
	 */
	EList<TypeReseauTelecommunication> getReseauTelecommunication();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Route()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Route' group='#group:0'"
	 * @generated
	 */
	EList<TypeRoute> getRoute();

	/**
	 * Returns the value of the '<em><b>Segment Route Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSegmentRouteAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Route Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Route Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_SegmentRouteAerienne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SegmentRouteAerienne' group='#group:0'"
	 * @generated
	 */
	EList<TypeSegmentRouteAerienne> getSegmentRouteAerienne();

	/**
	 * Returns the value of the '<em><b>Service Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeServiceReseau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ServiceReseau()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceReseau' group='#group:0'"
	 * @generated
	 */
	EList<TypeServiceReseau> getServiceReseau();

	/**
	 * Returns the value of the '<em><b>Structure Organisee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeStructureOrganisee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Organisee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Organisee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_StructureOrganisee()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructureOrganisee' group='#group:0'"
	 * @generated
	 */
	EList<TypeStructureOrganisee> getStructureOrganisee();

	/**
	 * Returns the value of the '<em><b>Tranche Meteo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTrancheMeteo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tranche Meteo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tranche Meteo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TrancheMeteo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TrancheMeteo' group='#group:0'"
	 * @generated
	 */
	EList<TypeTrancheMeteo> getTrancheMeteo();

	/**
	 * Returns the value of the '<em><b>Type Aerodrome</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeAerodrome}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Aerodrome</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Aerodrome</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeAerodrome()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeAerodrome' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeAerodrome> getTypeAerodrome();

	/**
	 * Returns the value of the '<em><b>Type Aeronef</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeAeronef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Aeronef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Aeronef</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeAeronef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeAeronef' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeAeronef> getTypeAeronef();

	/**
	 * Returns the value of the '<em><b>Type Agent Biologique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeAgentBiologique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Agent Biologique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Agent Biologique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeAgentBiologique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeAgentBiologique' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeAgentBiologique> getTypeAgentBiologique();

	/**
	 * Returns the value of the '<em><b>Type Agent Chimique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeAgentChimique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Agent Chimique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Agent Chimique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeAgentChimique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeAgentChimique' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeAgentChimique> getTypeAgentChimique();

	/**
	 * Returns the value of the '<em><b>Type Agent Nucleaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeAgentNucleaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Agent Nucleaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Agent Nucleaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeAgentNucleaire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeAgentNucleaire' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeAgentNucleaire> getTypeAgentNucleaire();

	/**
	 * Returns the value of the '<em><b>Type Arme</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Arme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arme</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeArme()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeArme' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeArme> getTypeArme();

	/**
	 * Returns the value of the '<em><b>Type Batiment Surface</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeBatimentSurface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Batiment Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Batiment Surface</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeBatimentSurface()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeBatimentSurface' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeBatimentSurface> getTypeBatimentSurface();

	/**
	 * Returns the value of the '<em><b>Type Equipement Electronique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeEquipementElectronique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Equipement Electronique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Equipement Electronique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeEquipementElectronique()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeEquipementElectronique' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeEquipementElectronique> getTypeEquipementElectronique();

	/**
	 * Returns the value of the '<em><b>Type Equipement Ferroviaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeEquipementFerroviaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Equipement Ferroviaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Equipement Ferroviaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeEquipementFerroviaire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeEquipementFerroviaire' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeEquipementFerroviaire> getTypeEquipementFerroviaire();

	/**
	 * Returns the value of the '<em><b>Type Equipement Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeEquipementGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Equipement Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Equipement Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeEquipementGenie()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeEquipementGenie' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeEquipementGenie> getTypeEquipementGenie();

	/**
	 * Returns the value of the '<em><b>Type Equipement Maritime</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeEquipementMaritime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Equipement Maritime</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Equipement Maritime</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeEquipementMaritime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeEquipementMaritime' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeEquipementMaritime> getTypeEquipementMaritime();

	/**
	 * Returns the value of the '<em><b>Type Equipement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeEquipementNRBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Equipement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Equipement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeEquipementNRBC()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeEquipementNRBC' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeEquipementNRBC> getTypeEquipementNRBC();

	/**
	 * Returns the value of the '<em><b>Type Groupe Individus</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeGroupeIndividus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Groupe Individus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Groupe Individus</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeGroupeIndividus()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeGroupeIndividus' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeGroupeIndividus> getTypeGroupeIndividus();

	/**
	 * Returns the value of the '<em><b>Type Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeMesureCoordination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeMesureCoordination()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeMesureCoordination' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeMesureCoordination> getTypeMesureCoordination();

	/**
	 * Returns the value of the '<em><b>Type Munition</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeMunition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Munition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Munition</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeMunition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeMunition' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeMunition> getTypeMunition();

	/**
	 * Returns the value of the '<em><b>Type Obstacle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeObstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Obstacle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Obstacle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeObstacle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeObstacle' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeObstacle> getTypeObstacle();

	/**
	 * Returns the value of the '<em><b>Type Organisation Privee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeOrganisationPrivee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Organisation Privee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Organisation Privee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeOrganisationPrivee()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeOrganisationPrivee' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeOrganisationPrivee> getTypeOrganisationPrivee();

	/**
	 * Returns the value of the '<em><b>Type Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypePersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypePersonne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypePersonne' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypePersonne> getTypePersonne();

	/**
	 * Returns the value of the '<em><b>Type Pont</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypePont}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Pont</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Pont</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypePont()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypePont' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypePont> getTypePont();

	/**
	 * Returns the value of the '<em><b>Type Port</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Port</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypePort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypePort' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypePort> getTypePort();

	/**
	 * Returns the value of the '<em><b>Type Poste Civil</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypePosteCivil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Poste Civil</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Poste Civil</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypePosteCivil()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypePosteCivil' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypePosteCivil> getTypePosteCivil();

	/**
	 * Returns the value of the '<em><b>Type Poste Militaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypePosteMilitaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Poste Militaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Poste Militaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypePosteMilitaire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypePosteMilitaire' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypePosteMilitaire> getTypePosteMilitaire();

	/**
	 * Returns the value of the '<em><b>Type Regroupement Force</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeRegroupementForce}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Regroupement Force</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Regroupement Force</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeRegroupementForce()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeRegroupementForce' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeRegroupementForce> getTypeRegroupementForce();

	/**
	 * Returns the value of the '<em><b>Type Sous Marin</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeSousMarin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Sous Marin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Sous Marin</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeSousMarin()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeSousMarin' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeSousMarin> getTypeSousMarin();

	/**
	 * Returns the value of the '<em><b>Type Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeUnite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeUnite' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeUnite> getTypeUnite();

	/**
	 * Returns the value of the '<em><b>Type Vehicule</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeVehicule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Vehicule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Vehicule</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeVehicule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeVehicule' group='#group:0'"
	 * @generated
	 */
	EList<TypeTypeVehicule> getTypeVehicule();

	/**
	 * Returns the value of the '<em><b>Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Unite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Unite' group='#group:0'"
	 * @generated
	 */
	EList<TypeUnite> getUnite();

	/**
	 * Returns the value of the '<em><b>Zone Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_ZoneAerienne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ZoneAerienne' group='#group:0'"
	 * @generated
	 */
	EList<TypeZoneAerienne> getZoneAerienne();

	/**
	 * Returns the value of the '<em><b>Bibliotheque</b></em>' attribute.
	 * The default value is <code>"XML SIC Terre"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliotheque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliotheque</em>' attribute.
	 * @see #isSetBibliotheque()
	 * @see #unsetBibliotheque()
	 * @see #setBibliotheque(String)
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_Bibliotheque()
	 * @model default="XML SIC Terre" unsettable="true" dataType="mpia.meta.TypeString"
	 *        extendedMetaData="kind='attribute' name='Bibliotheque'"
	 * @generated
	 */
	String getBibliotheque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMPGTMessage#getBibliotheque <em>Bibliotheque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliotheque</em>' attribute.
	 * @see #isSetBibliotheque()
	 * @see #unsetBibliotheque()
	 * @see #getBibliotheque()
	 * @generated
	 */
	void setBibliotheque(String value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMPGTMessage#getBibliotheque <em>Bibliotheque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBibliotheque()
	 * @see #getBibliotheque()
	 * @see #setBibliotheque(String)
	 * @generated
	 */
	void unsetBibliotheque();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMPGTMessage#getBibliotheque <em>Bibliotheque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bibliotheque</em>' attribute is set.
	 * @see #unsetBibliotheque()
	 * @see #getBibliotheque()
	 * @see #setBibliotheque(String)
	 * @generated
	 */
	boolean isSetBibliotheque();

	/**
	 * Returns the value of the '<em><b>Type Annexe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Annexe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Annexe</em>' attribute.
	 * @see #setTypeAnnexe(String)
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_TypeAnnexe()
	 * @model dataType="mpia.meta.TypeString"
	 *        extendedMetaData="kind='attribute' name='TypeAnnexe'"
	 * @generated
	 */
	String getTypeAnnexe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMPGTMessage#getTypeAnnexe <em>Type Annexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Annexe</em>' attribute.
	 * @see #getTypeAnnexe()
	 * @generated
	 */
	void setTypeAnnexe(String value);

	/**
	 * Returns the value of the '<em><b>Version DQP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version DQP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version DQP</em>' attribute.
	 * @see #setVersionDQP(String)
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_VersionDQP()
	 * @model dataType="mpia.meta.TypeString"
	 *        extendedMetaData="kind='attribute' name='VersionDQP'"
	 * @generated
	 */
	String getVersionDQP();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionDQP <em>Version DQP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version DQP</em>' attribute.
	 * @see #getVersionDQP()
	 * @generated
	 */
	void setVersionDQP(String value);

	/**
	 * Returns the value of the '<em><b>Version Grammaire</b></em>' attribute.
	 * The default value is <code>"F.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Grammaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Grammaire</em>' attribute.
	 * @see #isSetVersionGrammaire()
	 * @see #unsetVersionGrammaire()
	 * @see #setVersionGrammaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_VersionGrammaire()
	 * @model default="F.0" unsettable="true" dataType="mpia.meta.TypeString"
	 *        extendedMetaData="kind='attribute' name='VersionGrammaire'"
	 * @generated
	 */
	String getVersionGrammaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionGrammaire <em>Version Grammaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Grammaire</em>' attribute.
	 * @see #isSetVersionGrammaire()
	 * @see #unsetVersionGrammaire()
	 * @see #getVersionGrammaire()
	 * @generated
	 */
	void setVersionGrammaire(String value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionGrammaire <em>Version Grammaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersionGrammaire()
	 * @see #getVersionGrammaire()
	 * @see #setVersionGrammaire(String)
	 * @generated
	 */
	void unsetVersionGrammaire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionGrammaire <em>Version Grammaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version Grammaire</em>' attribute is set.
	 * @see #unsetVersionGrammaire()
	 * @see #getVersionGrammaire()
	 * @see #setVersionGrammaire(String)
	 * @generated
	 */
	boolean isSetVersionGrammaire();

	/**
	 * Returns the value of the '<em><b>Version Modele</b></em>' attribute.
	 * The default value is <code>"3.1.7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Modele</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Modele</em>' attribute.
	 * @see #isSetVersionModele()
	 * @see #unsetVersionModele()
	 * @see #setVersionModele(String)
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_VersionModele()
	 * @model default="3.1.7" unsettable="true" dataType="mpia.meta.TypeString"
	 *        extendedMetaData="kind='attribute' name='VersionModele'"
	 * @generated
	 */
	String getVersionModele();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionModele <em>Version Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Modele</em>' attribute.
	 * @see #isSetVersionModele()
	 * @see #unsetVersionModele()
	 * @see #getVersionModele()
	 * @generated
	 */
	void setVersionModele(String value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionModele <em>Version Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersionModele()
	 * @see #getVersionModele()
	 * @see #setVersionModele(String)
	 * @generated
	 */
	void unsetVersionModele();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionModele <em>Version Modele</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version Modele</em>' attribute is set.
	 * @see #unsetVersionModele()
	 * @see #getVersionModele()
	 * @see #setVersionModele(String)
	 * @generated
	 */
	boolean isSetVersionModele();

	/**
	 * Returns the value of the '<em><b>Version Type Annexe</b></em>' attribute.
	 * The default value is <code>"G.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Type Annexe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Type Annexe</em>' attribute.
	 * @see #isSetVersionTypeAnnexe()
	 * @see #unsetVersionTypeAnnexe()
	 * @see #setVersionTypeAnnexe(String)
	 * @see mpia.schema.SchemaPackage#getTypeMPGTMessage_VersionTypeAnnexe()
	 * @model default="G.0" unsettable="true" dataType="mpia.meta.TypeString"
	 *        extendedMetaData="kind='attribute' name='VersionTypeAnnexe'"
	 * @generated
	 */
	String getVersionTypeAnnexe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionTypeAnnexe <em>Version Type Annexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Type Annexe</em>' attribute.
	 * @see #isSetVersionTypeAnnexe()
	 * @see #unsetVersionTypeAnnexe()
	 * @see #getVersionTypeAnnexe()
	 * @generated
	 */
	void setVersionTypeAnnexe(String value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionTypeAnnexe <em>Version Type Annexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersionTypeAnnexe()
	 * @see #getVersionTypeAnnexe()
	 * @see #setVersionTypeAnnexe(String)
	 * @generated
	 */
	void unsetVersionTypeAnnexe();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMPGTMessage#getVersionTypeAnnexe <em>Version Type Annexe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version Type Annexe</em>' attribute is set.
	 * @see #unsetVersionTypeAnnexe()
	 * @see #getVersionTypeAnnexe()
	 * @see #setVersionTypeAnnexe(String)
	 * @generated
	 */
	boolean isSetVersionTypeAnnexe();

} // TypeMPGTMessage
