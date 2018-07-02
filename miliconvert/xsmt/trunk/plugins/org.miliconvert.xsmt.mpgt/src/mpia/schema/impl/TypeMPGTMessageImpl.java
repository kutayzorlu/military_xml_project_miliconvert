/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeActionRenseignement;
import mpia.schema.TypeActivitePosture;
import mpia.schema.TypeAdresseElectronique;
import mpia.schema.TypeAdressePhysique;
import mpia.schema.TypeAdresseRadio;
import mpia.schema.TypeAerodrome;
import mpia.schema.TypeAeronef;
import mpia.schema.TypeAireStationnement;
import mpia.schema.TypeAlerteFrappeNucleaireAmie;
import mpia.schema.TypeAllure;
import mpia.schema.TypeAnnulationInterdictionTir;
import mpia.schema.TypeAppuiFeuHelicoptere;
import mpia.schema.TypeArticulationASS;
import mpia.schema.TypeArticulationLogistique;
import mpia.schema.TypeArticulationMarine;
import mpia.schema.TypeArticulationTerre;
import mpia.schema.TypeAssocActiviteContexte;
import mpia.schema.TypeAssocContexteContexte;
import mpia.schema.TypeAssocContexteInstanceObjet;
import mpia.schema.TypeAssocEntiteOrgTypeEntiteOrg;
import mpia.schema.TypeAssocListeObjCandListeObjCand;
import mpia.schema.TypeAssocPisteAtterDirAppAir;
import mpia.schema.TypeAssocSymboleTactique;
import mpia.schema.TypeAssociationActionAction;
import mpia.schema.TypeAssociationActionAutreEvenement;
import mpia.schema.TypeAssociationActionEvenementNRBC;
import mpia.schema.TypeAssociationActiviteCapacite;
import mpia.schema.TypeAssociationAffiliationAffiliation;
import mpia.schema.TypeAssociationAffiliationInstanceObjet;
import mpia.schema.TypeAssociationAffiliationType;
import mpia.schema.TypeAssociationAutreEvenementAction;
import mpia.schema.TypeAssociationAutreEvenementAutreEvenement;
import mpia.schema.TypeAssociationAutreEvenementEvenementNRBC;
import mpia.schema.TypeAssociationConflit3DMissionAerienne;
import mpia.schema.TypeAssociationConsommablelMajeur;
import mpia.schema.TypeAssociationConsommation;
import mpia.schema.TypeAssociationContexteRapport;
import mpia.schema.TypeAssociationConvoiMouvementParRoute;
import mpia.schema.TypeAssociationDepEvacuationDepEvacuation;
import mpia.schema.TypeAssociationDocumentCapacite;
import mpia.schema.TypeAssociationElementControleEvenement;
import mpia.schema.TypeAssociationElementTopographieEvenement;
import mpia.schema.TypeAssociationEltCtrlEltCtrl;
import mpia.schema.TypeAssociationEltCtrlEltTopo;
import mpia.schema.TypeAssociationEltCtrlMateriel;
import mpia.schema.TypeAssociationEltCtrlSite;
import mpia.schema.TypeAssociationEltCtrlTypeEltCtrl;
import mpia.schema.TypeAssociationEltTopoSite;
import mpia.schema.TypeAssociationEntiteOrgAction;
import mpia.schema.TypeAssociationEntiteOrgEltCtrl;
import mpia.schema.TypeAssociationEntiteOrgEltTopo;
import mpia.schema.TypeAssociationEntiteOrgEntiteOrg;
import mpia.schema.TypeAssociationEntiteOrgEvenement;
import mpia.schema.TypeAssociationEntiteOrgMateriel;
import mpia.schema.TypeAssociationEntiteOrgObjetInconnu;
import mpia.schema.TypeAssociationEntiteOrgPersonne;
import mpia.schema.TypeAssociationEntiteOrgSite;
import mpia.schema.TypeAssociationEntiteOrganisationnellePlanOuOrdre;
import mpia.schema.TypeAssociationEquipementlMajeur;
import mpia.schema.TypeAssociationEvenementNRBCAction;
import mpia.schema.TypeAssociationEvenementNRBCAutreEvenement;
import mpia.schema.TypeAssociationEvenementNRBCEvenementNRBC;
import mpia.schema.TypeAssociationEvenementRENSAutreEvenement;
import mpia.schema.TypeAssociationEvenementRENSEvenementRENS;
import mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle;
import mpia.schema.TypeAssociationGroupeInfoOpsPlanOuOrdre;
import mpia.schema.TypeAssociationHoraireManoeuvre;
import mpia.schema.TypeAssociationInstanceObjetAdresse;
import mpia.schema.TypeAssociationInstanceObjetCapacite;
import mpia.schema.TypeAssociationLivraisonLivaison;
import mpia.schema.TypeAssociationMaterielEltCtrl;
import mpia.schema.TypeAssociationMaterielEltTopo;
import mpia.schema.TypeAssociationMaterielEvenement;
import mpia.schema.TypeAssociationMaterielMateriel;
import mpia.schema.TypeAssociationMaterielMeteorologie;
import mpia.schema.TypeAssociationMaterielObjetInconnu;
import mpia.schema.TypeAssociationMaterielPersonne;
import mpia.schema.TypeAssociationMaterielSite;
import mpia.schema.TypeAssociationMaterielTypeMateriel;
import mpia.schema.TypeAssociationMesureCoordMissionAerienne;
import mpia.schema.TypeAssociationMesureCoordinationPlanFeux;
import mpia.schema.TypeAssociationMeteorologieSite;
import mpia.schema.TypeAssociationMissionAerienneMissionAerienne;
import mpia.schema.TypeAssociationMissionGenieMissionGenie;
import mpia.schema.TypeAssociationMissionMeleeAction;
import mpia.schema.TypeAssociationMissionMouvementMissionMouvement;
import mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj;
import mpia.schema.TypeAssociationMissionRensObjTraitementObj;
import mpia.schema.TypeAssociationMissionRenseignementAction;
import mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute;
import mpia.schema.TypeAssociationObjectifCiblageDocument;
import mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage;
import mpia.schema.TypeAssociationObjetInconnuEltCtrl;
import mpia.schema.TypeAssociationObjetInconnuEltTopo;
import mpia.schema.TypeAssociationObjetInconnuSite;
import mpia.schema.TypeAssociationObservationObservation;
import mpia.schema.TypeAssociationParagraphePOparagraphePO;
import mpia.schema.TypeAssociationPersonneEltCtrl;
import mpia.schema.TypeAssociationPersonneEltTopo;
import mpia.schema.TypeAssociationPersonneEvenement;
import mpia.schema.TypeAssociationPersonneMateriel;
import mpia.schema.TypeAssociationPersonneMissionAir;
import mpia.schema.TypeAssociationPersonneObjetInconnu;
import mpia.schema.TypeAssociationPersonnePersonne;
import mpia.schema.TypeAssociationPersonnePlanifOperation3D;
import mpia.schema.TypeAssociationPersonneSite;
import mpia.schema.TypeAssociationPersonneTypePersonne;
import mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre;
import mpia.schema.TypeAssociationPlanTraitementObjTraitementObj;
import mpia.schema.TypeAssociationPlanificationOperation3DMissionASA;
import mpia.schema.TypeAssociationPlanificationOperation3DMissionAir;
import mpia.schema.TypeAssociationProfilDotationTheorique;
import mpia.schema.TypeAssociationProfilUnite;
import mpia.schema.TypeAssociationRacineOperationnelleDocument;
import mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj;
import mpia.schema.TypeAssociationSiteEltCtrl;
import mpia.schema.TypeAssociationSiteEltTopo;
import mpia.schema.TypeAssociationSiteEvenement;
import mpia.schema.TypeAssociationSiteMateriel;
import mpia.schema.TypeAssociationSiteMeteorologie;
import mpia.schema.TypeAssociationSiteObjetInconnu;
import mpia.schema.TypeAssociationSiteSite;
import mpia.schema.TypeAssociationSiteTypeSite;
import mpia.schema.TypeAssociationSyntheseDetectionsEvenementNRBC;
import mpia.schema.TypeAssociationTemporelleActivite;
import mpia.schema.TypeAssociationTraitementObjPlanTraitementObj;
import mpia.schema.TypeAssociationTypeCapacite;
import mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere;
import mpia.schema.TypeAssociationUniteAutreMissionLog;
import mpia.schema.TypeAssociationUniteLivraison;
import mpia.schema.TypeAssociationUniteMissionALATattaque;
import mpia.schema.TypeAssociationUniteMissionASA;
import mpia.schema.TypeAssociationUniteMissionAcqASS;
import mpia.schema.TypeAssociationUniteMissionAerienne;
import mpia.schema.TypeAssociationUniteMissionAir;
import mpia.schema.TypeAssociationUniteMissionEscorteAF;
import mpia.schema.TypeAssociationUniteMissionGenie;
import mpia.schema.TypeAssociationUniteMissionMelee;
import mpia.schema.TypeAssociationUniteMissionRensObj;
import mpia.schema.TypeAssociationUniteMissionSic;
import mpia.schema.TypeAssociationUniteMissionTranspTact;
import mpia.schema.TypeAssociationUniteMissionUniteAntichar;
import mpia.schema.TypeAssociationUniteMouvementParRoute;
import mpia.schema.TypeAssociationUnitePlanFeux;
import mpia.schema.TypeAssociationUnitePlanifOperation3D;
import mpia.schema.TypeAssociationUniteRenforcementsFeux;
import mpia.schema.TypeAutreAction;
import mpia.schema.TypeAutreAdresse;
import mpia.schema.TypeAutreAffiliation;
import mpia.schema.TypeAutreArticulation;
import mpia.schema.TypeAutreCapteurRENS;
import mpia.schema.TypeAutreContexte;
import mpia.schema.TypeAutreElementControle;
import mpia.schema.TypeAutreEvenement;
import mpia.schema.TypeAutreEvenementNRBC;
import mpia.schema.TypeAutreEvenementNucleaire;
import mpia.schema.TypeAutreEvenementRadioactif;
import mpia.schema.TypeAutreListeObjectifs;
import mpia.schema.TypeAutreMateriel;
import mpia.schema.TypeAutreMenace;
import mpia.schema.TypeAutreMission;
import mpia.schema.TypeAutreMissionALAT;
import mpia.schema.TypeAutreMissionLogistique;
import mpia.schema.TypeAutreNom;
import mpia.schema.TypeAutreObstacle;
import mpia.schema.TypeAutreSegmentItineraire;
import mpia.schema.TypeAutreSite;
import mpia.schema.TypeAutreTypeBatiment;
import mpia.schema.TypeAutreTypeConsommable;
import mpia.schema.TypeAutreTypeConsommableSystemeArme;
import mpia.schema.TypeAutreTypeElementControle;
import mpia.schema.TypeAutreTypeEntiteOrganisationnelle;
import mpia.schema.TypeAutreTypeEquipement;
import mpia.schema.TypeAutreTypeOrganisationGouvernementale;
import mpia.schema.TypeAutreTypeSite;
import mpia.schema.TypeBassin;
import mpia.schema.TypeBatiment;
import mpia.schema.TypeBesoinsEnRenseignements;
import mpia.schema.TypeBilanTirsASS;
import mpia.schema.TypeBrancheNavigation;
import mpia.schema.TypeBulletinSondage;
import mpia.schema.TypeCaleLancement;
import mpia.schema.TypeCaleSeche;
import mpia.schema.TypeCapaciteFeux;
import mpia.schema.TypeCapaciteGenie;
import mpia.schema.TypeCapaciteHebergement;
import mpia.schema.TypeCapaciteMaintenance;
import mpia.schema.TypeCapaciteManutention;
import mpia.schema.TypeCapaciteMobilite;
import mpia.schema.TypeCapaciteOperationnelle;
import mpia.schema.TypeCapaciteSoutien;
import mpia.schema.TypeCapaciteStockage;
import mpia.schema.TypeCapaciteSurveillance;
import mpia.schema.TypeCapaciteTransmission;
import mpia.schema.TypeCapteurDrone;
import mpia.schema.TypeCapteurLocalisationRadioelectrique;
import mpia.schema.TypeCapteurROHUM;
import mpia.schema.TypeCapteurRadar;
import mpia.schema.TypeCaracteristiqueLogistique;
import mpia.schema.TypeCaracteristiqueTransport;
import mpia.schema.TypeCarnetPoints;
import mpia.schema.TypeChampMinesMaritime;
import mpia.schema.TypeChampMinesTerrestre;
import mpia.schema.TypeChargementMateriel;
import mpia.schema.TypeCharnier;
import mpia.schema.TypeCheminFer;
import mpia.schema.TypeCompositionDotationTheoriqueEnType;
import mpia.schema.TypeCompteRenduTir;
import mpia.schema.TypeConflit3D;
import mpia.schema.TypeConsigne;
import mpia.schema.TypeConsigneLutteAntiaerienneTTA;
import mpia.schema.TypeConsigneTir;
import mpia.schema.TypeConvoi;
import mpia.schema.TypeCouvertureASA;
import mpia.schema.TypeCouvertureAerienne;
import mpia.schema.TypeDegreClassification;
import mpia.schema.TypeDemandeTir;
import mpia.schema.TypeDepannageEvacuation;
import mpia.schema.TypeDeploiementMARTHA;
import mpia.schema.TypeDeploiementMoyensASAc3d;
import mpia.schema.TypeDetachementIdentifie;
import mpia.schema.TypeDetachementNonIdentifie;
import mpia.schema.TypeDirectionApprocheAir;
import mpia.schema.TypeDirectiveTir;
import mpia.schema.TypeDocument;
import mpia.schema.TypeDotationTheorique;
import mpia.schema.TypeDotationTheoriqueInstanceObjet;
import mpia.schema.TypeEchelon;
import mpia.schema.TypeElementMeteo;
import mpia.schema.TypeElementTopographie;
import mpia.schema.TypeEnTeteParagraphePlanOuOrdre;
import mpia.schema.TypeEnnemiFutur;
import mpia.schema.TypeEntitePolitique;
import mpia.schema.TypeEtudeDispersion;
import mpia.schema.TypeEvenementArmeNucleaire;
import mpia.schema.TypeEvenementChimiqueEtBiologique;
import mpia.schema.TypeEvenementRENS;
import mpia.schema.TypeEvenementRadiologique;
import mpia.schema.TypeFaitRenseignement;
import mpia.schema.TypeGroupeEthnique;
import mpia.schema.TypeGroupeFonctionnel;
import mpia.schema.TypeGroupeIndividus;
import mpia.schema.TypeGroupeInformationsOperationnelles;
import mpia.schema.TypeHoraireManoeuvre;
import mpia.schema.TypeHypotheseActionENIouAutre;
import mpia.schema.TypeIndicateurGeostatistique;
import mpia.schema.TypeInterdictionTir;
import mpia.schema.TypeInterventionGenerale;
import mpia.schema.TypeInterventionType;
import mpia.schema.TypeItineraire;
import mpia.schema.TypeItineraireOuModeleCheminementALAT;
import mpia.schema.TypeJetee;
import mpia.schema.TypeJonctionReseau;
import mpia.schema.TypeLiaisonReseau;
import mpia.schema.TypeLigneLivraison;
import mpia.schema.TypeLimite;
import mpia.schema.TypeListeMesuresCoordination3D;
import mpia.schema.TypeListeObjectifsCandidats;
import mpia.schema.TypeListeObjectifsPlanifies;
import mpia.schema.TypeLivraison;
import mpia.schema.TypeMPGTMessage;
import mpia.schema.TypeMementoGenie;
import mpia.schema.TypeMenaceASAeni;
import mpia.schema.TypeMenaceAerienne;
import mpia.schema.TypeMenaceDetection;
import mpia.schema.TypeMenaceFeuxENI;
import mpia.schema.TypeMenaceGenieENI;
import mpia.schema.TypeMenacesAeriennesMissionALAT;
import mpia.schema.TypeMesureCoordination;
import mpia.schema.TypeMesuresProtectionElectronique;
import mpia.schema.TypeMiseEnOeuvreROE;
import mpia.schema.TypeMissionALATattaque;
import mpia.schema.TypeMissionASA;
import mpia.schema.TypeMissionAcquisitionASS;
import mpia.schema.TypeMissionAerienne;
import mpia.schema.TypeMissionAir;
import mpia.schema.TypeMissionEscorteOuAppuiFeu;
import mpia.schema.TypeMissionFeux;
import mpia.schema.TypeMissionGenie;
import mpia.schema.TypeMissionI3D;
import mpia.schema.TypeMissionMaintenance;
import mpia.schema.TypeMissionMelee;
import mpia.schema.TypeMissionMouvement;
import mpia.schema.TypeMissionRavitaillement;
import mpia.schema.TypeMissionRenseignement;
import mpia.schema.TypeMissionRenseignementObjectif;
import mpia.schema.TypeMissionSarCombat;
import mpia.schema.TypeMissionSic;
import mpia.schema.TypeMissionTransportTactique;
import mpia.schema.TypeMissionUniteAntichar;
import mpia.schema.TypeModule;
import mpia.schema.TypeMouillage;
import mpia.schema.TypeMouvementParRoute;
import mpia.schema.TypeMoyensAeriensDontBeneficieGU;
import mpia.schema.TypeMoyensGenie;
import mpia.schema.TypeObjectifActivite;
import mpia.schema.TypeObjectifCiblage;
import mpia.schema.TypeObjetInconnu;
import mpia.schema.TypeObjetLibre;
import mpia.schema.TypeObservation;
import mpia.schema.TypeOrdre;
import mpia.schema.TypeOrganisationSoutienMedical;
import mpia.schema.TypeOuvrageGenie;
import mpia.schema.TypeOverlay;
import mpia.schema.TypeParagraphePlanOuOrdre;
import mpia.schema.TypePersonne;
import mpia.schema.TypePertesSante;
import mpia.schema.TypePionReseau;
import mpia.schema.TypePisteAtterrissage;
import mpia.schema.TypePlan;
import mpia.schema.TypePlanFeux;
import mpia.schema.TypePlanNumerotationObjectifs;
import mpia.schema.TypePlanTraitementObjectifs;
import mpia.schema.TypePlanificationCelluleSoutien;
import mpia.schema.TypePlanificationMouvement;
import mpia.schema.TypePlanificationOperation3D;
import mpia.schema.TypePointAxe;
import mpia.schema.TypePointControle3D;
import mpia.schema.TypePointHaut;
import mpia.schema.TypePointTrajectoire;
import mpia.schema.TypePolitiqueTir;
import mpia.schema.TypePont;
import mpia.schema.TypePort;
import mpia.schema.TypePorteurSystemeArme;
import mpia.schema.TypePossibilitesENI3d;
import mpia.schema.TypePosteAmarrage;
import mpia.schema.TypePosteTir;
import mpia.schema.TypePotentielENIfeuSolSol;
import mpia.schema.TypePrelevementSubordonneIdentifie;
import mpia.schema.TypePrelevementSubordonneNonIdentifie;
import mpia.schema.TypePrevisionObservation;
import mpia.schema.TypePrioriteTactique;
import mpia.schema.TypePrioriteTechnique;
import mpia.schema.TypeProcedureIFF;
import mpia.schema.TypeProfil;
import mpia.schema.TypeProjetCimic;
import mpia.schema.TypeQuaiMaritime;
import mpia.schema.TypeRaidAerienEnnemi;
import mpia.schema.TypeRapport;
import mpia.schema.TypeRapportForce;
import mpia.schema.TypeRattachementLogistiqueParticulier;
import mpia.schema.TypeRavitaillement;
import mpia.schema.TypeRechange;
import mpia.schema.TypeRegleEngagement;
import mpia.schema.TypeReligion;
import mpia.schema.TypeRenforcementsFeux;
import mpia.schema.TypeRenseignementObjectif;
import mpia.schema.TypeReseauTelecommunication;
import mpia.schema.TypeReservationUnite;
import mpia.schema.TypeRoute;
import mpia.schema.TypeRouteHelicoptereALAT;
import mpia.schema.TypeSegmentRouteAerienne;
import mpia.schema.TypeServiceReseau;
import mpia.schema.TypeSituationConsommable;
import mpia.schema.TypeSituationEffectif;
import mpia.schema.TypeSituationEquipement;
import mpia.schema.TypeSituationRadiation;
import mpia.schema.TypeSituationVehicule;
import mpia.schema.TypeStructureOrganisee;
import mpia.schema.TypeSymboleAnnotation;
import mpia.schema.TypeSymboleCercle;
import mpia.schema.TypeSymboleFleche;
import mpia.schema.TypeSymboleImage;
import mpia.schema.TypeSymboleLineique;
import mpia.schema.TypeSymboleNote;
import mpia.schema.TypeSymbolePoint;
import mpia.schema.TypeSymbolePostIt;
import mpia.schema.TypeSymboleTactique;
import mpia.schema.TypeSymboleTexte;
import mpia.schema.TypeSyntheseDetections;
import mpia.schema.TypeSystemeAtterrissageAuxInstruments;
import mpia.schema.TypeTraitementObjectif;
import mpia.schema.TypeTrancheMeteo;
import mpia.schema.TypeTravailAideDeploiement;
import mpia.schema.TypeTypeAerodrome;
import mpia.schema.TypeTypeAeronef;
import mpia.schema.TypeTypeAgentBiologique;
import mpia.schema.TypeTypeAgentChimique;
import mpia.schema.TypeTypeAgentNucleaire;
import mpia.schema.TypeTypeArme;
import mpia.schema.TypeTypeArmementSystemeArme;
import mpia.schema.TypeTypeBatimentSurface;
import mpia.schema.TypeTypeCapteur;
import mpia.schema.TypeTypeEquipementElectronique;
import mpia.schema.TypeTypeEquipementFerroviaire;
import mpia.schema.TypeTypeEquipementGenie;
import mpia.schema.TypeTypeEquipementMaritime;
import mpia.schema.TypeTypeEquipementNRBC;
import mpia.schema.TypeTypeEquipementSystemeArme;
import mpia.schema.TypeTypeGroupeIndividus;
import mpia.schema.TypeTypeItineraire;
import mpia.schema.TypeTypeMesureCoordination;
import mpia.schema.TypeTypeMunition;
import mpia.schema.TypeTypeMunitionSystemeArme;
import mpia.schema.TypeTypeObstacle;
import mpia.schema.TypeTypeOrganisationMilitaireExecutive;
import mpia.schema.TypeTypeOrganisationPrivee;
import mpia.schema.TypeTypePersonne;
import mpia.schema.TypeTypePont;
import mpia.schema.TypeTypePort;
import mpia.schema.TypeTypePorteur;
import mpia.schema.TypeTypePosteCivil;
import mpia.schema.TypeTypePosteMilitaire;
import mpia.schema.TypeTypeRegroupementForce;
import mpia.schema.TypeTypeSousMarin;
import mpia.schema.TypeTypeUnite;
import mpia.schema.TypeTypeVehicule;
import mpia.schema.TypeUnite;
import mpia.schema.TypeVarianteTravail;
import mpia.schema.TypeVehicule;
import mpia.schema.TypeVol;
import mpia.schema.TypeZoneAerienne;
import mpia.schema.TypeZoneAlat;
import mpia.schema.TypeZoneFonctionnelleLogistique;
import mpia.schema.TypeZoneLogistique;
import mpia.schema.TypeZoneMiseATerre;
import mpia.schema.TypeZoneRecherche;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type MPGT Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getActionRenseignement <em>Action Renseignement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getActivitePosture <em>Activite Posture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAeronef <em>Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAlerteFrappeNucleaireAmie <em>Alerte Frappe Nucleaire Amie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAllure <em>Allure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAnnulationInterdictionTir <em>Annulation Interdiction Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAppuiFeuHelicoptere <em>Appui Feu Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getArticulationASS <em>Articulation ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getArticulationLogistique <em>Articulation Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssocEntiteOrgTypeEntiteOrg <em>Assoc Entite Org Type Entite Org</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationActionAction <em>Association Action Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationActionAutreEvenement <em>Association Action Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationActionEvenementNRBC <em>Association Action Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationAutreEvenementAction <em>Association Autre Evenement Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationAutreEvenementAutreEvenement <em>Association Autre Evenement Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationAutreEvenementEvenementNRBC <em>Association Autre Evenement Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationConflit3DMissionAerienne <em>Association Conflit3 DMission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationConsommablelMajeur <em>Association Consommablel Majeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationConvoiMouvementParRoute <em>Association Convoi Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationDepEvacuationDepEvacuation <em>Association Dep Evacuation Dep Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationElementControleEvenement <em>Association Element Controle Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationElementTopographieEvenement <em>Association Element Topographie Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEltCtrlEltCtrl <em>Association Elt Ctrl Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEltCtrlEltTopo <em>Association Elt Ctrl Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEltCtrlMateriel <em>Association Elt Ctrl Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEltCtrlSite <em>Association Elt Ctrl Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEltCtrlTypeEltCtrl <em>Association Elt Ctrl Type Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEltTopoSite <em>Association Elt Topo Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrgAction <em>Association Entite Org Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrganisationnellePlanOuOrdre <em>Association Entite Organisationnelle Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrgEltCtrl <em>Association Entite Org Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrgEltTopo <em>Association Entite Org Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrgEntiteOrg <em>Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrgEvenement <em>Association Entite Org Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrgMateriel <em>Association Entite Org Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrgObjetInconnu <em>Association Entite Org Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrgPersonne <em>Association Entite Org Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEntiteOrgSite <em>Association Entite Org Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEquipementlMajeur <em>Association Equipementl Majeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEvenementNRBCAction <em>Association Evenement NRBC Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEvenementNRBCAutreEvenement <em>Association Evenement NRBC Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEvenementNRBCEvenementNRBC <em>Association Evenement NRBC Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEvenementRENSAutreEvenement <em>Association Evenement RENS Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationEvenementRENSEvenementRENS <em>Association Evenement RENS Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationGroupeInfoOpsPlanOuOrdre <em>Association Groupe Info Ops Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationHoraireManoeuvre <em>Association Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationLivraisonLivaison <em>Association Livraison Livaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMaterielEltCtrl <em>Association Materiel Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMaterielEltTopo <em>Association Materiel Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMaterielEvenement <em>Association Materiel Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMaterielMateriel <em>Association Materiel Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMaterielMeteorologie <em>Association Materiel Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMaterielObjetInconnu <em>Association Materiel Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMaterielPersonne <em>Association Materiel Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMaterielSite <em>Association Materiel Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMaterielTypeMateriel <em>Association Materiel Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMesureCoordinationPlanFeux <em>Association Mesure Coordination Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMesureCoordMissionAerienne <em>Association Mesure Coord Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMeteorologieSite <em>Association Meteorologie Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMissionAerienneMissionAerienne <em>Association Mission Aerienne Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMissionGenieMissionGenie <em>Association Mission Genie Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMissionMeleeAction <em>Association Mission Melee Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMissionMouvementMissionMouvement <em>Association Mission Mouvement Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMissionRenseignementAction <em>Association Mission Renseignement Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMissionRensObjPlanTraitementObj <em>Association Mission Rens Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMissionRensObjTraitementObj <em>Association Mission Rens Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationMouvementParRouteMouvementParRoute <em>Association Mouvement Par Route Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationObjectifCiblageDocument <em>Association Objectif Ciblage Document</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationObjetInconnuEltCtrl <em>Association Objet Inconnu Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationObjetInconnuEltTopo <em>Association Objet Inconnu Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationObjetInconnuSite <em>Association Objet Inconnu Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationObservationObservation <em>Association Observation Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationParagraphePOparagraphePO <em>Association Paragraphe POparagraphe PO</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonneEltCtrl <em>Association Personne Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonneEltTopo <em>Association Personne Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonneEvenement <em>Association Personne Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonneMateriel <em>Association Personne Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonneMissionAir <em>Association Personne Mission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonneObjetInconnu <em>Association Personne Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonnePersonne <em>Association Personne Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonnePlanifOperation3D <em>Association Personne Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonneSite <em>Association Personne Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPersonneTypePersonne <em>Association Personne Type Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPlanificationOperation3DMissionAir <em>Association Planification Operation3 DMission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPlanificationOperation3DMissionASA <em>Association Planification Operation3 DMission ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPlanOuOrdrePlanOuOrdre <em>Association Plan Ou Ordre Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationPlanTraitementObjTraitementObj <em>Association Plan Traitement Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationRenseignementObjMisRenseignementObj <em>Association Renseignement Obj Mis Renseignement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationSiteEltCtrl <em>Association Site Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationSiteEltTopo <em>Association Site Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationSiteEvenement <em>Association Site Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationSiteMateriel <em>Association Site Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationSiteMeteorologie <em>Association Site Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationSiteObjetInconnu <em>Association Site Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationSiteSite <em>Association Site Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationSiteTypeSite <em>Association Site Type Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationSyntheseDetectionsEvenementNRBC <em>Association Synthese Detections Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationTraitementObjPlanTraitementObj <em>Association Traitement Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteAppuiFeuHelicoptere <em>Association Unite Appui Feu Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteAutreMissionLog <em>Association Unite Autre Mission Log</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteLivraison <em>Association Unite Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionAcqASS <em>Association Unite Mission Acq ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionAerienne <em>Association Unite Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionAir <em>Association Unite Mission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionALATattaque <em>Association Unite Mission ALA Tattaque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionASA <em>Association Unite Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionEscorteAF <em>Association Unite Mission Escorte AF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionGenie <em>Association Unite Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionMelee <em>Association Unite Mission Melee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionRensObj <em>Association Unite Mission Rens Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionSic <em>Association Unite Mission Sic</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionTranspTact <em>Association Unite Mission Transp Tact</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMissionUniteAntichar <em>Association Unite Mission Unite Antichar</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteMouvementParRoute <em>Association Unite Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUnitePlanFeux <em>Association Unite Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUnitePlanifOperation3D <em>Association Unite Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationUniteRenforcementsFeux <em>Association Unite Renforcements Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssocSymboleTactique <em>Assoc Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreAction <em>Autre Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreAffiliation <em>Autre Affiliation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreCapteurRENS <em>Autre Capteur RENS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreEvenementNucleaire <em>Autre Evenement Nucleaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreMenace <em>Autre Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreMission <em>Autre Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreMissionALAT <em>Autre Mission ALAT</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreMissionLogistique <em>Autre Mission Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreTypeConsommableSystemeArme <em>Autre Type Consommable Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getBesoinsEnRenseignements <em>Besoins En Renseignements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getBilanTirsASS <em>Bilan Tirs ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getBrancheNavigation <em>Branche Navigation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getBulletinSondage <em>Bulletin Sondage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteHebergement <em>Capacite Hebergement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteMaintenance <em>Capacite Maintenance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteManutention <em>Capacite Manutention</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteOperationnelle <em>Capacite Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteSoutien <em>Capacite Soutien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteTransmission <em>Capacite Transmission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapteurDrone <em>Capteur Drone</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapteurLocalisationRadioelectrique <em>Capteur Localisation Radioelectrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapteurRadar <em>Capteur Radar</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapteurROHUM <em>Capteur ROHUM</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCarnetPoints <em>Carnet Points</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getChargementMateriel <em>Chargement Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCompteRenduTir <em>Compte Rendu Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getConflit3D <em>Conflit3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getConsigne <em>Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getConsigneLutteAntiaerienneTTA <em>Consigne Lutte Antiaerienne TTA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getConsigneTir <em>Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCouvertureAerienne <em>Couverture Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCouvertureASA <em>Couverture ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDegreClassification <em>Degre Classification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDemandeTir <em>Demande Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDepannageEvacuation <em>Depannage Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDeploiementMARTHA <em>Deploiement MARTHA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDeploiementMoyensASAc3d <em>Deploiement Moyens AS Ac3d</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDetachementIdentifie <em>Detachement Identifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDetachementNonIdentifie <em>Detachement Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDirectiveTir <em>Directive Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getEchelon <em>Echelon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getElementMeteo <em>Element Meteo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getEnnemiFutur <em>Ennemi Futur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getEnTeteParagraphePlanOuOrdre <em>En Tete Paragraphe Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getEtudeDispersion <em>Etude Dispersion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getEvenementRENS <em>Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getFaitRenseignement <em>Fait Renseignement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getHoraireManoeuvre <em>Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getHypotheseActionENIouAutre <em>Hypothese Action EN Iou Autre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getIndicateurGeostatistique <em>Indicateur Geostatistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getInterdictionTir <em>Interdiction Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getInterventionGenerale <em>Intervention Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getInterventionType <em>Intervention Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getItineraireOuModeleCheminementALAT <em>Itineraire Ou Modele Cheminement ALAT</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getJonctionReseau <em>Jonction Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getLiaisonReseau <em>Liaison Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getLigneLivraison <em>Ligne Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getListeMesuresCoordination3D <em>Liste Mesures Coordination3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getListeObjectifsPlanifies <em>Liste Objectifs Planifies</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getLivraison <em>Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMementoGenie <em>Memento Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMenaceAerienne <em>Menace Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMenaceASAeni <em>Menace AS Aeni</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMenaceDetection <em>Menace Detection</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMenaceFeuxENI <em>Menace Feux ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMenaceGenieENI <em>Menace Genie ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMenacesAeriennesMissionALAT <em>Menaces Aeriennes Mission ALAT</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMesuresProtectionElectronique <em>Mesures Protection Electronique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMiseEnOeuvreROE <em>Mise En Oeuvre ROE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionAcquisitionASS <em>Mission Acquisition ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionAerienne <em>Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionAir <em>Mission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionALATattaque <em>Mission ALA Tattaque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionASA <em>Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionEscorteOuAppuiFeu <em>Mission Escorte Ou Appui Feu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionFeux <em>Mission Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionGenie <em>Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionI3D <em>Mission I3D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionMaintenance <em>Mission Maintenance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionMelee <em>Mission Melee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionMouvement <em>Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionRavitaillement <em>Mission Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionRenseignement <em>Mission Renseignement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionRenseignementObjectif <em>Mission Renseignement Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionSarCombat <em>Mission Sar Combat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionSic <em>Mission Sic</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionTransportTactique <em>Mission Transport Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMissionUniteAntichar <em>Mission Unite Antichar</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getModule <em>Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMouvementParRoute <em>Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMoyensAeriensDontBeneficieGU <em>Moyens Aeriens Dont Beneficie GU</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMoyensGenie <em>Moyens Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getObjetInconnu <em>Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getObjetLibre <em>Objet Libre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getOrdre <em>Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getOrganisationSoutienMedical <em>Organisation Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getOuvrageGenie <em>Ouvrage Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getOverlay <em>Overlay</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getParagraphePlanOuOrdre <em>Paragraphe Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPertesSante <em>Pertes Sante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPionReseau <em>Pion Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPlanFeux <em>Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPlanificationCelluleSoutien <em>Planification Cellule Soutien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPlanificationMouvement <em>Planification Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPlanificationOperation3D <em>Planification Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPlanNumerotationObjectifs <em>Plan Numerotation Objectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPlanTraitementObjectifs <em>Plan Traitement Objectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPointAxe <em>Point Axe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPointHaut <em>Point Haut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPointTrajectoire <em>Point Trajectoire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPolitiqueTir <em>Politique Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPorteurSystemeArme <em>Porteur Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPossibilitesENI3d <em>Possibilites ENI 3d</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPosteTir <em>Poste Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPotentielENIfeuSolSol <em>Potentiel EN Ifeu Sol Sol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPrelevementSubordonneIdentifie <em>Prelevement Subordonne Identifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPrelevementSubordonneNonIdentifie <em>Prelevement Subordonne Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPrevisionObservation <em>Prevision Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPrioriteTactique <em>Priorite Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPrioriteTechnique <em>Priorite Technique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getProcedureIFF <em>Procedure IFF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getProjetCimic <em>Projet Cimic</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRaidAerienEnnemi <em>Raid Aerien Ennemi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRapportForce <em>Rapport Force</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRattachementLogistiqueParticulier <em>Rattachement Logistique Particulier</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRavitaillement <em>Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRechange <em>Rechange</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRenforcementsFeux <em>Renforcements Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRenseignementObjectif <em>Renseignement Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getReservationUnite <em>Reservation Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRouteHelicoptereALAT <em>Route Helicoptere ALAT</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSituationConsommable <em>Situation Consommable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSituationEffectif <em>Situation Effectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSituationEquipement <em>Situation Equipement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSituationRadiation <em>Situation Radiation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSituationVehicule <em>Situation Vehicule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymboleAnnotation <em>Symbole Annotation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymboleCercle <em>Symbole Cercle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymboleFleche <em>Symbole Fleche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymboleImage <em>Symbole Image</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymboleLineique <em>Symbole Lineique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymboleNote <em>Symbole Note</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymbolePoint <em>Symbole Point</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymbolePostIt <em>Symbole Post It</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymboleTactique <em>Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSymboleTexte <em>Symbole Texte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSyntheseDetections <em>Synthese Detections</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSystemeAtterrissageAuxInstruments <em>Systeme Atterrissage Aux Instruments</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTraitementObjectif <em>Traitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTravailAideDeploiement <em>Travail Aide Deploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeArmementSystemeArme <em>Type Armement Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeCapteur <em>Type Capteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeEquipementSystemeArme <em>Type Equipement Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeItineraire <em>Type Itineraire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeMunitionSystemeArme <em>Type Munition Systeme Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeOrganisationMilitaireExecutive <em>Type Organisation Militaire Executive</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypePorteur <em>Type Porteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getVarianteTravail <em>Variante Travail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getVehicule <em>Vehicule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getVol <em>Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getZoneAlat <em>Zone Alat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getZoneFonctionnelleLogistique <em>Zone Fonctionnelle Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getZoneLogistique <em>Zone Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getZoneMiseATerre <em>Zone Mise ATerre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getZoneRecherche <em>Zone Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAdresseElectronique <em>Adresse Electronique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAdressePhysique <em>Adresse Physique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAdresseRadio <em>Adresse Radio</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAerodrome <em>Aerodrome</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAireStationnement <em>Aire Stationnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getArticulationMarine <em>Articulation Marine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getArticulationTerre <em>Articulation Terre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssocActiviteContexte <em>Assoc Activite Contexte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssocContexteContexte <em>Assoc Contexte Contexte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssocContexteInstanceObjet <em>Assoc Contexte Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationActiviteCapacite <em>Association Activite Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationAffiliationAffiliation <em>Association Affiliation Affiliation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationAffiliationInstanceObjet <em>Association Affiliation Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationAffiliationType <em>Association Affiliation Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationConsommation <em>Association Consommation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationContexteRapport <em>Association Contexte Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationDocumentCapacite <em>Association Document Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationGroupeInfoOpsEntiteOrganisationnelle <em>Association Groupe Info Ops Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationInstanceObjetAdresse <em>Association Instance Objet Adresse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationInstanceObjetCapacite <em>Association Instance Objet Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationObjectifCiblageObjectifCiblage <em>Association Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationProfilDotationTheorique <em>Association Profil Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationProfilUnite <em>Association Profil Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationRacineOperationnelleDocument <em>Association Racine Operationnelle Document</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationTemporelleActivite <em>Association Temporelle Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssociationTypeCapacite <em>Association Type Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssocListeObjCandListeObjCand <em>Assoc Liste Obj Cand Liste Obj Cand</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAssocPisteAtterDirAppAir <em>Assoc Piste Atter Dir App Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreAdresse <em>Autre Adresse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreArticulation <em>Autre Articulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreContexte <em>Autre Contexte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreElementControle <em>Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreEvenement <em>Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreEvenementNRBC <em>Autre Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreEvenementRadioactif <em>Autre Evenement Radioactif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreListeObjectifs <em>Autre Liste Objectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreMateriel <em>Autre Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreNom <em>Autre Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreObstacle <em>Autre Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreSegmentItineraire <em>Autre Segment Itineraire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreSite <em>Autre Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreTypeBatiment <em>Autre Type Batiment</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreTypeConsommable <em>Autre Type Consommable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreTypeElementControle <em>Autre Type Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreTypeEntiteOrganisationnelle <em>Autre Type Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreTypeEquipement <em>Autre Type Equipement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreTypeOrganisationGouvernementale <em>Autre Type Organisation Gouvernementale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getAutreTypeSite <em>Autre Type Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getBassin <em>Bassin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getBatiment <em>Batiment</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCaleLancement <em>Cale Lancement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCaleSeche <em>Cale Seche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteFeux <em>Capacite Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteGenie <em>Capacite Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteMobilite <em>Capacite Mobilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteStockage <em>Capacite Stockage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCapaciteSurveillance <em>Capacite Surveillance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCaracteristiqueLogistique <em>Caracteristique Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCaracteristiqueTransport <em>Caracteristique Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getChampMinesMaritime <em>Champ Mines Maritime</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getChampMinesTerrestre <em>Champ Mines Terrestre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCharnier <em>Charnier</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCheminFer <em>Chemin Fer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getCompositionDotationTheoriqueEnType <em>Composition Dotation Theorique En Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getConvoi <em>Convoi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDirectionApprocheAir <em>Direction Approche Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDotationTheorique <em>Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getDotationTheoriqueInstanceObjet <em>Dotation Theorique Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getElementTopographie <em>Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getEntitePolitique <em>Entite Politique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getEvenementArmeNucleaire <em>Evenement Arme Nucleaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getEvenementChimiqueEtBiologique <em>Evenement Chimique Et Biologique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getEvenementRadiologique <em>Evenement Radiologique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getGroupeEthnique <em>Groupe Ethnique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getGroupeFonctionnel <em>Groupe Fonctionnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getGroupeIndividus <em>Groupe Individus</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getGroupeInformationsOperationnelles <em>Groupe Informations Operationnelles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getItineraire <em>Itineraire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getJetee <em>Jetee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getLimite <em>Limite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getListeObjectifsCandidats <em>Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMesureCoordination <em>Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getMouillage <em>Mouillage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getObjectifActivite <em>Objectif Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getObjectifCiblage <em>Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPersonne <em>Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPisteAtterrissage <em>Piste Atterrissage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPointControle3D <em>Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPont <em>Pont</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPort <em>Port</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getPosteAmarrage <em>Poste Amarrage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getProfil <em>Profil</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getQuaiMaritime <em>Quai Maritime</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRapport <em>Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRegleEngagement <em>Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getReligion <em>Religion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getReseauTelecommunication <em>Reseau Telecommunication</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getSegmentRouteAerienne <em>Segment Route Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getServiceReseau <em>Service Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getStructureOrganisee <em>Structure Organisee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTrancheMeteo <em>Tranche Meteo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeAerodrome <em>Type Aerodrome</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeAeronef <em>Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeAgentBiologique <em>Type Agent Biologique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeAgentChimique <em>Type Agent Chimique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeAgentNucleaire <em>Type Agent Nucleaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeArme <em>Type Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeBatimentSurface <em>Type Batiment Surface</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeEquipementElectronique <em>Type Equipement Electronique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeEquipementFerroviaire <em>Type Equipement Ferroviaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeEquipementGenie <em>Type Equipement Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeEquipementMaritime <em>Type Equipement Maritime</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeEquipementNRBC <em>Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeGroupeIndividus <em>Type Groupe Individus</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeMesureCoordination <em>Type Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeMunition <em>Type Munition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeObstacle <em>Type Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeOrganisationPrivee <em>Type Organisation Privee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypePersonne <em>Type Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypePont <em>Type Pont</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypePort <em>Type Port</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypePosteCivil <em>Type Poste Civil</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypePosteMilitaire <em>Type Poste Militaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeRegroupementForce <em>Type Regroupement Force</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeSousMarin <em>Type Sous Marin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeUnite <em>Type Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeVehicule <em>Type Vehicule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getUnite <em>Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getZoneAerienne <em>Zone Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getBibliotheque <em>Bibliotheque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getTypeAnnexe <em>Type Annexe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getVersionDQP <em>Version DQP</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getVersionGrammaire <em>Version Grammaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getVersionModele <em>Version Modele</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMPGTMessageImpl#getVersionTypeAnnexe <em>Version Type Annexe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMPGTMessageImpl extends EObjectImpl implements TypeMPGTMessage {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getBibliotheque() <em>Bibliotheque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliotheque()
	 * @generated
	 * @ordered
	 */
	protected static final String BIBLIOTHEQUE_EDEFAULT = "XML SIC Terre";

	/**
	 * The cached value of the '{@link #getBibliotheque() <em>Bibliotheque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliotheque()
	 * @generated
	 * @ordered
	 */
	protected String bibliotheque = BIBLIOTHEQUE_EDEFAULT;

	/**
	 * This is true if the Bibliotheque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bibliothequeESet;

	/**
	 * The default value of the '{@link #getTypeAnnexe() <em>Type Annexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAnnexe()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ANNEXE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAnnexe() <em>Type Annexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAnnexe()
	 * @generated
	 * @ordered
	 */
	protected String typeAnnexe = TYPE_ANNEXE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionDQP() <em>Version DQP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDQP()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_DQP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionDQP() <em>Version DQP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDQP()
	 * @generated
	 * @ordered
	 */
	protected String versionDQP = VERSION_DQP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionGrammaire() <em>Version Grammaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionGrammaire()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_GRAMMAIRE_EDEFAULT = "F.0";

	/**
	 * The cached value of the '{@link #getVersionGrammaire() <em>Version Grammaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionGrammaire()
	 * @generated
	 * @ordered
	 */
	protected String versionGrammaire = VERSION_GRAMMAIRE_EDEFAULT;

	/**
	 * This is true if the Version Grammaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionGrammaireESet;

	/**
	 * The default value of the '{@link #getVersionModele() <em>Version Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionModele()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_MODELE_EDEFAULT = "3.1.7";

	/**
	 * The cached value of the '{@link #getVersionModele() <em>Version Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionModele()
	 * @generated
	 * @ordered
	 */
	protected String versionModele = VERSION_MODELE_EDEFAULT;

	/**
	 * This is true if the Version Modele attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionModeleESet;

	/**
	 * The default value of the '{@link #getVersionTypeAnnexe() <em>Version Type Annexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTypeAnnexe()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_TYPE_ANNEXE_EDEFAULT = "G.0";

	/**
	 * The cached value of the '{@link #getVersionTypeAnnexe() <em>Version Type Annexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTypeAnnexe()
	 * @generated
	 * @ordered
	 */
	protected String versionTypeAnnexe = VERSION_TYPE_ANNEXE_EDEFAULT;

	/**
	 * This is true if the Version Type Annexe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionTypeAnnexeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMPGTMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMPGTMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SchemaPackage.TYPE_MPGT_MESSAGE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeActionRenseignement> getActionRenseignement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ActionRenseignement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeActivitePosture> getActivitePosture() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ActivitePosture());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAeronef> getAeronef() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Aeronef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAlerteFrappeNucleaireAmie> getAlerteFrappeNucleaireAmie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AlerteFrappeNucleaireAmie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAllure> getAllure() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Allure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAnnulationInterdictionTir> getAnnulationInterdictionTir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AnnulationInterdictionTir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAppuiFeuHelicoptere> getAppuiFeuHelicoptere() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AppuiFeuHelicoptere());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArticulationASS> getArticulationASS() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ArticulationASS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArticulationLogistique> getArticulationLogistique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ArticulationLogistique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocEntiteOrgTypeEntiteOrg> getAssocEntiteOrgTypeEntiteOrg() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssocEntiteOrgTypeEntiteOrg());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationActionAction> getAssociationActionAction() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationActionAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationActionAutreEvenement> getAssociationActionAutreEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationActionAutreEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationActionEvenementNRBC> getAssociationActionEvenementNRBC() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationActionEvenementNRBC());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationAutreEvenementAction> getAssociationAutreEvenementAction() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationAutreEvenementAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationAutreEvenementAutreEvenement> getAssociationAutreEvenementAutreEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationAutreEvenementAutreEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationAutreEvenementEvenementNRBC> getAssociationAutreEvenementEvenementNRBC() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationAutreEvenementEvenementNRBC());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationConflit3DMissionAerienne> getAssociationConflit3DMissionAerienne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationConflit3DMissionAerienne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationConsommablelMajeur> getAssociationConsommablelMajeur() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationConsommablelMajeur());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationConvoiMouvementParRoute> getAssociationConvoiMouvementParRoute() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationConvoiMouvementParRoute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationDepEvacuationDepEvacuation> getAssociationDepEvacuationDepEvacuation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationDepEvacuationDepEvacuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationElementControleEvenement> getAssociationElementControleEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationElementControleEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationElementTopographieEvenement> getAssociationElementTopographieEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationElementTopographieEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEltCtrlEltCtrl> getAssociationEltCtrlEltCtrl() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEltCtrlEltCtrl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEltCtrlEltTopo> getAssociationEltCtrlEltTopo() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEltCtrlEltTopo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEltCtrlMateriel> getAssociationEltCtrlMateriel() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEltCtrlMateriel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEltCtrlSite> getAssociationEltCtrlSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEltCtrlSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEltCtrlTypeEltCtrl> getAssociationEltCtrlTypeEltCtrl() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEltCtrlTypeEltCtrl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEltTopoSite> getAssociationEltTopoSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEltTopoSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrgAction> getAssociationEntiteOrgAction() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrgAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrganisationnellePlanOuOrdre> getAssociationEntiteOrganisationnellePlanOuOrdre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrganisationnellePlanOuOrdre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrgEltCtrl> getAssociationEntiteOrgEltCtrl() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrgEltCtrl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrgEltTopo> getAssociationEntiteOrgEltTopo() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrgEltTopo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrgEntiteOrg> getAssociationEntiteOrgEntiteOrg() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrgEntiteOrg());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrgEvenement> getAssociationEntiteOrgEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrgEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrgMateriel> getAssociationEntiteOrgMateriel() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrgMateriel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrgObjetInconnu> getAssociationEntiteOrgObjetInconnu() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrgObjetInconnu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrgPersonne> getAssociationEntiteOrgPersonne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrgPersonne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEntiteOrgSite> getAssociationEntiteOrgSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEntiteOrgSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEquipementlMajeur> getAssociationEquipementlMajeur() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEquipementlMajeur());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEvenementNRBCAction> getAssociationEvenementNRBCAction() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEvenementNRBCAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEvenementNRBCAutreEvenement> getAssociationEvenementNRBCAutreEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEvenementNRBCAutreEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEvenementNRBCEvenementNRBC> getAssociationEvenementNRBCEvenementNRBC() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEvenementNRBCEvenementNRBC());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEvenementRENSAutreEvenement> getAssociationEvenementRENSAutreEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEvenementRENSAutreEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEvenementRENSEvenementRENS> getAssociationEvenementRENSEvenementRENS() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationEvenementRENSEvenementRENS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationGroupeInfoOpsPlanOuOrdre> getAssociationGroupeInfoOpsPlanOuOrdre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationGroupeInfoOpsPlanOuOrdre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationHoraireManoeuvre> getAssociationHoraireManoeuvre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationHoraireManoeuvre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationLivraisonLivaison> getAssociationLivraisonLivaison() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationLivraisonLivaison());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMaterielEltCtrl> getAssociationMaterielEltCtrl() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMaterielEltCtrl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMaterielEltTopo> getAssociationMaterielEltTopo() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMaterielEltTopo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMaterielEvenement> getAssociationMaterielEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMaterielEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMaterielMateriel> getAssociationMaterielMateriel() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMaterielMateriel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMaterielMeteorologie> getAssociationMaterielMeteorologie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMaterielMeteorologie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMaterielObjetInconnu> getAssociationMaterielObjetInconnu() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMaterielObjetInconnu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMaterielPersonne> getAssociationMaterielPersonne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMaterielPersonne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMaterielSite> getAssociationMaterielSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMaterielSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMaterielTypeMateriel> getAssociationMaterielTypeMateriel() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMaterielTypeMateriel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMesureCoordinationPlanFeux> getAssociationMesureCoordinationPlanFeux() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMesureCoordinationPlanFeux());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMesureCoordMissionAerienne> getAssociationMesureCoordMissionAerienne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMesureCoordMissionAerienne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMeteorologieSite> getAssociationMeteorologieSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMeteorologieSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMissionAerienneMissionAerienne> getAssociationMissionAerienneMissionAerienne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMissionAerienneMissionAerienne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMissionGenieMissionGenie> getAssociationMissionGenieMissionGenie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMissionGenieMissionGenie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMissionMeleeAction> getAssociationMissionMeleeAction() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMissionMeleeAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMissionMouvementMissionMouvement> getAssociationMissionMouvementMissionMouvement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMissionMouvementMissionMouvement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMissionRenseignementAction> getAssociationMissionRenseignementAction() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMissionRenseignementAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMissionRensObjPlanTraitementObj> getAssociationMissionRensObjPlanTraitementObj() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMissionRensObjPlanTraitementObj());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMissionRensObjTraitementObj> getAssociationMissionRensObjTraitementObj() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMissionRensObjTraitementObj());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationMouvementParRouteMouvementParRoute> getAssociationMouvementParRouteMouvementParRoute() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationMouvementParRouteMouvementParRoute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationObjectifCiblageDocument> getAssociationObjectifCiblageDocument() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationObjectifCiblageDocument());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationObjetInconnuEltCtrl> getAssociationObjetInconnuEltCtrl() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationObjetInconnuEltCtrl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationObjetInconnuEltTopo> getAssociationObjetInconnuEltTopo() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationObjetInconnuEltTopo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationObjetInconnuSite> getAssociationObjetInconnuSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationObjetInconnuSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationObservationObservation> getAssociationObservationObservation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationObservationObservation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationParagraphePOparagraphePO> getAssociationParagraphePOparagraphePO() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationParagraphePOparagraphePO());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonneEltCtrl> getAssociationPersonneEltCtrl() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonneEltCtrl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonneEltTopo> getAssociationPersonneEltTopo() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonneEltTopo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonneEvenement> getAssociationPersonneEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonneEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonneMateriel> getAssociationPersonneMateriel() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonneMateriel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonneMissionAir> getAssociationPersonneMissionAir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonneMissionAir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonneObjetInconnu> getAssociationPersonneObjetInconnu() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonneObjetInconnu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonnePersonne> getAssociationPersonnePersonne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonnePersonne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonnePlanifOperation3D> getAssociationPersonnePlanifOperation3D() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonnePlanifOperation3D());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonneSite> getAssociationPersonneSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonneSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPersonneTypePersonne> getAssociationPersonneTypePersonne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPersonneTypePersonne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPlanificationOperation3DMissionAir> getAssociationPlanificationOperation3DMissionAir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPlanificationOperation3DMissionAir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPlanificationOperation3DMissionASA> getAssociationPlanificationOperation3DMissionASA() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPlanificationOperation3DMissionASA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPlanOuOrdrePlanOuOrdre> getAssociationPlanOuOrdrePlanOuOrdre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPlanOuOrdrePlanOuOrdre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationPlanTraitementObjTraitementObj> getAssociationPlanTraitementObjTraitementObj() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationPlanTraitementObjTraitementObj());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationRenseignementObjMisRenseignementObj> getAssociationRenseignementObjMisRenseignementObj() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationRenseignementObjMisRenseignementObj());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationSiteEltCtrl> getAssociationSiteEltCtrl() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationSiteEltCtrl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationSiteEltTopo> getAssociationSiteEltTopo() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationSiteEltTopo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationSiteEvenement> getAssociationSiteEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationSiteEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationSiteMateriel> getAssociationSiteMateriel() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationSiteMateriel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationSiteMeteorologie> getAssociationSiteMeteorologie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationSiteMeteorologie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationSiteObjetInconnu> getAssociationSiteObjetInconnu() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationSiteObjetInconnu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationSiteSite> getAssociationSiteSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationSiteSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationSiteTypeSite> getAssociationSiteTypeSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationSiteTypeSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationSyntheseDetectionsEvenementNRBC> getAssociationSyntheseDetectionsEvenementNRBC() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationSyntheseDetectionsEvenementNRBC());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationTraitementObjPlanTraitementObj> getAssociationTraitementObjPlanTraitementObj() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationTraitementObjPlanTraitementObj());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteAppuiFeuHelicoptere> getAssociationUniteAppuiFeuHelicoptere() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteAppuiFeuHelicoptere());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteAutreMissionLog> getAssociationUniteAutreMissionLog() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteAutreMissionLog());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteLivraison> getAssociationUniteLivraison() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteLivraison());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionAcqASS> getAssociationUniteMissionAcqASS() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionAcqASS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionAerienne> getAssociationUniteMissionAerienne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionAerienne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionAir> getAssociationUniteMissionAir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionAir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionALATattaque> getAssociationUniteMissionALATattaque() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionALATattaque());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionASA> getAssociationUniteMissionASA() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionASA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionEscorteAF> getAssociationUniteMissionEscorteAF() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionEscorteAF());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionGenie> getAssociationUniteMissionGenie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionGenie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionMelee> getAssociationUniteMissionMelee() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionMelee());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionRensObj> getAssociationUniteMissionRensObj() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionRensObj());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionSic> getAssociationUniteMissionSic() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionSic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionTranspTact> getAssociationUniteMissionTranspTact() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionTranspTact());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMissionUniteAntichar> getAssociationUniteMissionUniteAntichar() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMissionUniteAntichar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteMouvementParRoute> getAssociationUniteMouvementParRoute() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteMouvementParRoute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUnitePlanFeux> getAssociationUnitePlanFeux() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUnitePlanFeux());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUnitePlanifOperation3D> getAssociationUnitePlanifOperation3D() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUnitePlanifOperation3D());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationUniteRenforcementsFeux> getAssociationUniteRenforcementsFeux() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationUniteRenforcementsFeux());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocSymboleTactique> getAssocSymboleTactique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssocSymboleTactique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreAction> getAutreAction() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreAffiliation> getAutreAffiliation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreAffiliation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreCapteurRENS> getAutreCapteurRENS() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreCapteurRENS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreEvenementNucleaire> getAutreEvenementNucleaire() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreEvenementNucleaire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreMenace> getAutreMenace() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreMenace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreMission> getAutreMission() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreMission());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreMissionALAT> getAutreMissionALAT() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreMissionALAT());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreMissionLogistique> getAutreMissionLogistique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreMissionLogistique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreTypeConsommableSystemeArme> getAutreTypeConsommableSystemeArme() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreTypeConsommableSystemeArme());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBesoinsEnRenseignements> getBesoinsEnRenseignements() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_BesoinsEnRenseignements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBilanTirsASS> getBilanTirsASS() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_BilanTirsASS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBrancheNavigation> getBrancheNavigation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_BrancheNavigation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBulletinSondage> getBulletinSondage() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_BulletinSondage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteHebergement> getCapaciteHebergement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteHebergement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteMaintenance> getCapaciteMaintenance() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteMaintenance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteManutention> getCapaciteManutention() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteManutention());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteOperationnelle> getCapaciteOperationnelle() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteOperationnelle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteSoutien> getCapaciteSoutien() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteSoutien());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteTransmission> getCapaciteTransmission() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteTransmission());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapteurDrone> getCapteurDrone() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapteurDrone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapteurLocalisationRadioelectrique> getCapteurLocalisationRadioelectrique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapteurLocalisationRadioelectrique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapteurRadar> getCapteurRadar() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapteurRadar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapteurROHUM> getCapteurROHUM() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapteurROHUM());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCarnetPoints> getCarnetPoints() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CarnetPoints());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeChargementMateriel> getChargementMateriel() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ChargementMateriel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCompteRenduTir> getCompteRenduTir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CompteRenduTir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConflit3D> getConflit3D() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Conflit3D());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsigne> getConsigne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Consigne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsigneLutteAntiaerienneTTA> getConsigneLutteAntiaerienneTTA() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ConsigneLutteAntiaerienneTTA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsigneTir> getConsigneTir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ConsigneTir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCouvertureAerienne> getCouvertureAerienne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CouvertureAerienne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCouvertureASA> getCouvertureASA() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CouvertureASA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDegreClassification> getDegreClassification() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DegreClassification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDemandeTir> getDemandeTir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DemandeTir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDepannageEvacuation> getDepannageEvacuation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DepannageEvacuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeploiementMARTHA> getDeploiementMARTHA() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DeploiementMARTHA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeploiementMoyensASAc3d> getDeploiementMoyensASAc3d() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DeploiementMoyensASAc3d());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDetachementIdentifie> getDetachementIdentifie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DetachementIdentifie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDetachementNonIdentifie> getDetachementNonIdentifie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DetachementNonIdentifie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDirectiveTir> getDirectiveTir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DirectiveTir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEchelon> getEchelon() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Echelon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeElementMeteo> getElementMeteo() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ElementMeteo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEnnemiFutur> getEnnemiFutur() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_EnnemiFutur());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEnTeteParagraphePlanOuOrdre> getEnTeteParagraphePlanOuOrdre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_EnTeteParagraphePlanOuOrdre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtudeDispersion> getEtudeDispersion() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_EtudeDispersion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvenementRENS> getEvenementRENS() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_EvenementRENS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeFaitRenseignement> getFaitRenseignement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_FaitRenseignement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeHoraireManoeuvre> getHoraireManoeuvre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_HoraireManoeuvre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeHypotheseActionENIouAutre> getHypotheseActionENIouAutre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_HypotheseActionENIouAutre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeIndicateurGeostatistique> getIndicateurGeostatistique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_IndicateurGeostatistique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeInterdictionTir> getInterdictionTir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_InterdictionTir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeInterventionGenerale> getInterventionGenerale() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_InterventionGenerale());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeInterventionType> getInterventionType() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_InterventionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeItineraireOuModeleCheminementALAT> getItineraireOuModeleCheminementALAT() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ItineraireOuModeleCheminementALAT());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeJonctionReseau> getJonctionReseau() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_JonctionReseau());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLiaisonReseau> getLiaisonReseau() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_LiaisonReseau());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLigneLivraison> getLigneLivraison() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_LigneLivraison());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeListeMesuresCoordination3D> getListeMesuresCoordination3D() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ListeMesuresCoordination3D());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeListeObjectifsPlanifies> getListeObjectifsPlanifies() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ListeObjectifsPlanifies());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLivraison> getLivraison() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Livraison());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMementoGenie> getMementoGenie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MementoGenie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMenaceAerienne> getMenaceAerienne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MenaceAerienne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMenaceASAeni> getMenaceASAeni() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MenaceASAeni());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMenaceDetection> getMenaceDetection() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MenaceDetection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMenaceFeuxENI> getMenaceFeuxENI() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MenaceFeuxENI());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMenaceGenieENI> getMenaceGenieENI() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MenaceGenieENI());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMenacesAeriennesMissionALAT> getMenacesAeriennesMissionALAT() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MenacesAeriennesMissionALAT());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMesuresProtectionElectronique> getMesuresProtectionElectronique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MesuresProtectionElectronique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMiseEnOeuvreROE> getMiseEnOeuvreROE() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MiseEnOeuvreROE());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionAcquisitionASS> getMissionAcquisitionASS() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionAcquisitionASS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionAerienne> getMissionAerienne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionAerienne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionAir> getMissionAir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionAir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionALATattaque> getMissionALATattaque() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionALATattaque());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionASA> getMissionASA() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionASA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionEscorteOuAppuiFeu> getMissionEscorteOuAppuiFeu() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionEscorteOuAppuiFeu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionFeux> getMissionFeux() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionFeux());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionGenie> getMissionGenie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionGenie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionI3D> getMissionI3D() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionI3D());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionMaintenance> getMissionMaintenance() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionMaintenance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionMelee> getMissionMelee() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionMelee());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionMouvement> getMissionMouvement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionMouvement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionRavitaillement> getMissionRavitaillement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionRavitaillement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionRenseignement> getMissionRenseignement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionRenseignement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionRenseignementObjectif> getMissionRenseignementObjectif() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionRenseignementObjectif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionSarCombat> getMissionSarCombat() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionSarCombat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionSic> getMissionSic() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionSic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionTransportTactique> getMissionTransportTactique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionTransportTactique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionUniteAntichar> getMissionUniteAntichar() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MissionUniteAntichar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeModule> getModule() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Module());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMouvementParRoute> getMouvementParRoute() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MouvementParRoute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensAeriensDontBeneficieGU> getMoyensAeriensDontBeneficieGU() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MoyensAeriensDontBeneficieGU());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensGenie> getMoyensGenie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MoyensGenie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeObjetInconnu> getObjetInconnu() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ObjetInconnu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeObjetLibre> getObjetLibre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ObjetLibre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeObservation> getObservation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Observation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeOrdre> getOrdre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Ordre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeOrganisationSoutienMedical> getOrganisationSoutienMedical() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_OrganisationSoutienMedical());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeOuvrageGenie> getOuvrageGenie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_OuvrageGenie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeOverlay> getOverlay() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Overlay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParagraphePlanOuOrdre> getParagraphePlanOuOrdre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ParagraphePlanOuOrdre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePertesSante> getPertesSante() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PertesSante());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePionReseau> getPionReseau() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PionReseau());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlan> getPlan() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Plan());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlanFeux> getPlanFeux() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PlanFeux());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlanificationCelluleSoutien> getPlanificationCelluleSoutien() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PlanificationCelluleSoutien());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlanificationMouvement> getPlanificationMouvement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PlanificationMouvement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlanificationOperation3D> getPlanificationOperation3D() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PlanificationOperation3D());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlanNumerotationObjectifs> getPlanNumerotationObjectifs() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PlanNumerotationObjectifs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlanTraitementObjectifs> getPlanTraitementObjectifs() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PlanTraitementObjectifs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePointAxe> getPointAxe() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PointAxe());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePointHaut> getPointHaut() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PointHaut());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePointTrajectoire> getPointTrajectoire() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PointTrajectoire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePolitiqueTir> getPolitiqueTir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PolitiqueTir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePorteurSystemeArme> getPorteurSystemeArme() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PorteurSystemeArme());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePossibilitesENI3d> getPossibilitesENI3d() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PossibilitesENI3d());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePosteTir> getPosteTir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PosteTir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePotentielENIfeuSolSol> getPotentielENIfeuSolSol() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PotentielENIfeuSolSol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePrelevementSubordonneIdentifie> getPrelevementSubordonneIdentifie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PrelevementSubordonneIdentifie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePrelevementSubordonneNonIdentifie> getPrelevementSubordonneNonIdentifie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PrelevementSubordonneNonIdentifie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePrevisionObservation> getPrevisionObservation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PrevisionObservation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePrioriteTactique> getPrioriteTactique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PrioriteTactique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePrioriteTechnique> getPrioriteTechnique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PrioriteTechnique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeProcedureIFF> getProcedureIFF() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ProcedureIFF());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeProjetCimic> getProjetCimic() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ProjetCimic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRaidAerienEnnemi> getRaidAerienEnnemi() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_RaidAerienEnnemi());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRapportForce> getRapportForce() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_RapportForce());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRattachementLogistiqueParticulier> getRattachementLogistiqueParticulier() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_RattachementLogistiqueParticulier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRavitaillement> getRavitaillement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Ravitaillement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRechange> getRechange() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Rechange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRenforcementsFeux> getRenforcementsFeux() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_RenforcementsFeux());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRenseignementObjectif> getRenseignementObjectif() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_RenseignementObjectif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReservationUnite> getReservationUnite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ReservationUnite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRouteHelicoptereALAT> getRouteHelicoptereALAT() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_RouteHelicoptereALAT());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSituationConsommable> getSituationConsommable() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SituationConsommable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSituationEffectif> getSituationEffectif() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SituationEffectif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSituationEquipement> getSituationEquipement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SituationEquipement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSituationRadiation> getSituationRadiation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SituationRadiation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSituationVehicule> getSituationVehicule() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SituationVehicule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymboleAnnotation> getSymboleAnnotation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymboleAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymboleCercle> getSymboleCercle() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymboleCercle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymboleFleche> getSymboleFleche() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymboleFleche());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymboleImage> getSymboleImage() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymboleImage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymboleLineique> getSymboleLineique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymboleLineique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymboleNote> getSymboleNote() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymboleNote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymbolePoint> getSymbolePoint() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymbolePoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymbolePostIt> getSymbolePostIt() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymbolePostIt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymboleTactique> getSymboleTactique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymboleTactique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSymboleTexte> getSymboleTexte() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SymboleTexte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSyntheseDetections> getSyntheseDetections() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SyntheseDetections());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSystemeAtterrissageAuxInstruments> getSystemeAtterrissageAuxInstruments() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SystemeAtterrissageAuxInstruments());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTraitementObjectif> getTraitementObjectif() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TraitementObjectif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTravailAideDeploiement> getTravailAideDeploiement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TravailAideDeploiement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeArmementSystemeArme> getTypeArmementSystemeArme() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeArmementSystemeArme());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeCapteur> getTypeCapteur() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeCapteur());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeEquipementSystemeArme> getTypeEquipementSystemeArme() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeEquipementSystemeArme());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeItineraire> getTypeItineraire() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeItineraire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeMunitionSystemeArme> getTypeMunitionSystemeArme() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeMunitionSystemeArme());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeOrganisationMilitaireExecutive> getTypeOrganisationMilitaireExecutive() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeOrganisationMilitaireExecutive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypePorteur> getTypePorteur() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypePorteur());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVarianteTravail> getVarianteTravail() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_VarianteTravail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVehicule> getVehicule() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Vehicule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVol> getVol() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Vol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneAlat> getZoneAlat() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ZoneAlat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneFonctionnelleLogistique> getZoneFonctionnelleLogistique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ZoneFonctionnelleLogistique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneLogistique> getZoneLogistique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ZoneLogistique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneMiseATerre> getZoneMiseATerre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ZoneMiseATerre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneRecherche> getZoneRecherche() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ZoneRecherche());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAdresseElectronique> getAdresseElectronique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AdresseElectronique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAdressePhysique> getAdressePhysique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AdressePhysique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAdresseRadio> getAdresseRadio() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AdresseRadio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAerodrome> getAerodrome() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Aerodrome());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAireStationnement> getAireStationnement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AireStationnement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArticulationMarine> getArticulationMarine() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ArticulationMarine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArticulationTerre> getArticulationTerre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ArticulationTerre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocActiviteContexte> getAssocActiviteContexte() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssocActiviteContexte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocContexteContexte> getAssocContexteContexte() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssocContexteContexte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocContexteInstanceObjet> getAssocContexteInstanceObjet() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssocContexteInstanceObjet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationActiviteCapacite> getAssociationActiviteCapacite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationActiviteCapacite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationAffiliationAffiliation> getAssociationAffiliationAffiliation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationAffiliationAffiliation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationAffiliationInstanceObjet> getAssociationAffiliationInstanceObjet() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationAffiliationInstanceObjet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationAffiliationType> getAssociationAffiliationType() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationAffiliationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationConsommation> getAssociationConsommation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationConsommation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationContexteRapport> getAssociationContexteRapport() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationContexteRapport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationDocumentCapacite> getAssociationDocumentCapacite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationDocumentCapacite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationGroupeInfoOpsEntiteOrganisationnelle> getAssociationGroupeInfoOpsEntiteOrganisationnelle() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationGroupeInfoOpsEntiteOrganisationnelle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationInstanceObjetAdresse> getAssociationInstanceObjetAdresse() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationInstanceObjetAdresse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationInstanceObjetCapacite> getAssociationInstanceObjetCapacite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationInstanceObjetCapacite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationObjectifCiblageObjectifCiblage> getAssociationObjectifCiblageObjectifCiblage() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationObjectifCiblageObjectifCiblage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationProfilDotationTheorique> getAssociationProfilDotationTheorique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationProfilDotationTheorique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationProfilUnite> getAssociationProfilUnite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationProfilUnite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationRacineOperationnelleDocument> getAssociationRacineOperationnelleDocument() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationRacineOperationnelleDocument());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationTemporelleActivite> getAssociationTemporelleActivite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationTemporelleActivite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationTypeCapacite> getAssociationTypeCapacite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssociationTypeCapacite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocListeObjCandListeObjCand> getAssocListeObjCandListeObjCand() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssocListeObjCandListeObjCand());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocPisteAtterDirAppAir> getAssocPisteAtterDirAppAir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AssocPisteAtterDirAppAir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreAdresse> getAutreAdresse() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreAdresse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreArticulation> getAutreArticulation() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreArticulation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreContexte> getAutreContexte() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreContexte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreElementControle> getAutreElementControle() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreElementControle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreEvenement> getAutreEvenement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreEvenement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreEvenementNRBC> getAutreEvenementNRBC() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreEvenementNRBC());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreEvenementRadioactif> getAutreEvenementRadioactif() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreEvenementRadioactif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreListeObjectifs> getAutreListeObjectifs() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreListeObjectifs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreMateriel> getAutreMateriel() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreMateriel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreNom> getAutreNom() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreNom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreObstacle> getAutreObstacle() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreObstacle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreSegmentItineraire> getAutreSegmentItineraire() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreSegmentItineraire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreSite> getAutreSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreTypeBatiment> getAutreTypeBatiment() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreTypeBatiment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreTypeConsommable> getAutreTypeConsommable() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreTypeConsommable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreTypeElementControle> getAutreTypeElementControle() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreTypeElementControle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreTypeEntiteOrganisationnelle> getAutreTypeEntiteOrganisationnelle() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreTypeEntiteOrganisationnelle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreTypeEquipement> getAutreTypeEquipement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreTypeEquipement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreTypeOrganisationGouvernementale> getAutreTypeOrganisationGouvernementale() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreTypeOrganisationGouvernementale());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutreTypeSite> getAutreTypeSite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_AutreTypeSite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBassin> getBassin() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Bassin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBatiment> getBatiment() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Batiment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCaleLancement> getCaleLancement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CaleLancement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCaleSeche> getCaleSeche() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CaleSeche());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteFeux> getCapaciteFeux() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteFeux());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteGenie> getCapaciteGenie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteGenie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteMobilite> getCapaciteMobilite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteMobilite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteStockage> getCapaciteStockage() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteStockage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteSurveillance> getCapaciteSurveillance() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CapaciteSurveillance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCaracteristiqueLogistique> getCaracteristiqueLogistique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CaracteristiqueLogistique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCaracteristiqueTransport> getCaracteristiqueTransport() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CaracteristiqueTransport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeChampMinesMaritime> getChampMinesMaritime() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ChampMinesMaritime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeChampMinesTerrestre> getChampMinesTerrestre() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ChampMinesTerrestre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCharnier> getCharnier() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Charnier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCheminFer> getCheminFer() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CheminFer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCompositionDotationTheoriqueEnType> getCompositionDotationTheoriqueEnType() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_CompositionDotationTheoriqueEnType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConvoi> getConvoi() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Convoi());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDirectionApprocheAir> getDirectionApprocheAir() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DirectionApprocheAir());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDocument> getDocument() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Document());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDotationTheorique> getDotationTheorique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DotationTheorique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDotationTheoriqueInstanceObjet> getDotationTheoriqueInstanceObjet() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_DotationTheoriqueInstanceObjet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeElementTopographie> getElementTopographie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ElementTopographie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEntitePolitique> getEntitePolitique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_EntitePolitique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvenementArmeNucleaire> getEvenementArmeNucleaire() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_EvenementArmeNucleaire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvenementChimiqueEtBiologique> getEvenementChimiqueEtBiologique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_EvenementChimiqueEtBiologique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvenementRadiologique> getEvenementRadiologique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_EvenementRadiologique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeGroupeEthnique> getGroupeEthnique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_GroupeEthnique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeGroupeFonctionnel> getGroupeFonctionnel() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_GroupeFonctionnel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeGroupeIndividus> getGroupeIndividus() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_GroupeIndividus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeGroupeInformationsOperationnelles> getGroupeInformationsOperationnelles() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_GroupeInformationsOperationnelles());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeItineraire> getItineraire() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Itineraire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeJetee> getJetee() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Jetee());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLimite> getLimite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Limite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeListeObjectifsCandidats> getListeObjectifsCandidats() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ListeObjectifsCandidats());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMesureCoordination> getMesureCoordination() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_MesureCoordination());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMouillage> getMouillage() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Mouillage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeObjectifActivite> getObjectifActivite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ObjectifActivite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeObjectifCiblage> getObjectifCiblage() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ObjectifCiblage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePersonne> getPersonne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Personne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePisteAtterrissage> getPisteAtterrissage() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PisteAtterrissage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePointControle3D> getPointControle3D() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PointControle3D());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePont> getPont() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Pont());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePort> getPort() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Port());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePosteAmarrage> getPosteAmarrage() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_PosteAmarrage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeProfil> getProfil() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Profil());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuaiMaritime> getQuaiMaritime() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_QuaiMaritime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRapport> getRapport() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Rapport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRegleEngagement> getRegleEngagement() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_RegleEngagement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReligion> getReligion() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Religion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReseauTelecommunication> getReseauTelecommunication() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ReseauTelecommunication());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRoute> getRoute() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSegmentRouteAerienne> getSegmentRouteAerienne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_SegmentRouteAerienne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeServiceReseau> getServiceReseau() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ServiceReseau());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeStructureOrganisee> getStructureOrganisee() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_StructureOrganisee());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTrancheMeteo> getTrancheMeteo() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TrancheMeteo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeAerodrome> getTypeAerodrome() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeAerodrome());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeAeronef> getTypeAeronef() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeAeronef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeAgentBiologique> getTypeAgentBiologique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeAgentBiologique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeAgentChimique> getTypeAgentChimique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeAgentChimique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeAgentNucleaire> getTypeAgentNucleaire() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeAgentNucleaire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeArme> getTypeArme() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeArme());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeBatimentSurface> getTypeBatimentSurface() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeBatimentSurface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeEquipementElectronique> getTypeEquipementElectronique() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeEquipementElectronique());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeEquipementFerroviaire> getTypeEquipementFerroviaire() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeEquipementFerroviaire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeEquipementGenie> getTypeEquipementGenie() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeEquipementGenie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeEquipementMaritime> getTypeEquipementMaritime() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeEquipementMaritime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeEquipementNRBC> getTypeEquipementNRBC() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeEquipementNRBC());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeGroupeIndividus> getTypeGroupeIndividus() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeGroupeIndividus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeMesureCoordination> getTypeMesureCoordination() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeMesureCoordination());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeMunition> getTypeMunition() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeMunition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeObstacle> getTypeObstacle() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeObstacle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeOrganisationPrivee> getTypeOrganisationPrivee() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeOrganisationPrivee());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypePersonne> getTypePersonne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypePersonne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypePont> getTypePont() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypePont());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypePort> getTypePort() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypePort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypePosteCivil> getTypePosteCivil() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypePosteCivil());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypePosteMilitaire> getTypePosteMilitaire() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypePosteMilitaire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeRegroupementForce> getTypeRegroupementForce() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeRegroupementForce());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeSousMarin> getTypeSousMarin() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeSousMarin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeUnite> getTypeUnite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeUnite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeVehicule> getTypeVehicule() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_TypeVehicule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeUnite> getUnite() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_Unite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneAerienne> getZoneAerienne() {
		return getGroup().list(SchemaPackage.eINSTANCE.getTypeMPGTMessage_ZoneAerienne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBibliotheque() {
		return bibliotheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliotheque(String newBibliotheque) {
		String oldBibliotheque = bibliotheque;
		bibliotheque = newBibliotheque;
		boolean oldBibliothequeESet = bibliothequeESet;
		bibliothequeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MPGT_MESSAGE__BIBLIOTHEQUE, oldBibliotheque, bibliotheque, !oldBibliothequeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBibliotheque() {
		String oldBibliotheque = bibliotheque;
		boolean oldBibliothequeESet = bibliothequeESet;
		bibliotheque = BIBLIOTHEQUE_EDEFAULT;
		bibliothequeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MPGT_MESSAGE__BIBLIOTHEQUE, oldBibliotheque, BIBLIOTHEQUE_EDEFAULT, oldBibliothequeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBibliotheque() {
		return bibliothequeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeAnnexe() {
		return typeAnnexe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAnnexe(String newTypeAnnexe) {
		String oldTypeAnnexe = typeAnnexe;
		typeAnnexe = newTypeAnnexe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ANNEXE, oldTypeAnnexe, typeAnnexe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionDQP() {
		return versionDQP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionDQP(String newVersionDQP) {
		String oldVersionDQP = versionDQP;
		versionDQP = newVersionDQP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_DQP, oldVersionDQP, versionDQP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionGrammaire() {
		return versionGrammaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionGrammaire(String newVersionGrammaire) {
		String oldVersionGrammaire = versionGrammaire;
		versionGrammaire = newVersionGrammaire;
		boolean oldVersionGrammaireESet = versionGrammaireESet;
		versionGrammaireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_GRAMMAIRE, oldVersionGrammaire, versionGrammaire, !oldVersionGrammaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersionGrammaire() {
		String oldVersionGrammaire = versionGrammaire;
		boolean oldVersionGrammaireESet = versionGrammaireESet;
		versionGrammaire = VERSION_GRAMMAIRE_EDEFAULT;
		versionGrammaireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_GRAMMAIRE, oldVersionGrammaire, VERSION_GRAMMAIRE_EDEFAULT, oldVersionGrammaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersionGrammaire() {
		return versionGrammaireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionModele() {
		return versionModele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionModele(String newVersionModele) {
		String oldVersionModele = versionModele;
		versionModele = newVersionModele;
		boolean oldVersionModeleESet = versionModeleESet;
		versionModeleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_MODELE, oldVersionModele, versionModele, !oldVersionModeleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersionModele() {
		String oldVersionModele = versionModele;
		boolean oldVersionModeleESet = versionModeleESet;
		versionModele = VERSION_MODELE_EDEFAULT;
		versionModeleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_MODELE, oldVersionModele, VERSION_MODELE_EDEFAULT, oldVersionModeleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersionModele() {
		return versionModeleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionTypeAnnexe() {
		return versionTypeAnnexe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionTypeAnnexe(String newVersionTypeAnnexe) {
		String oldVersionTypeAnnexe = versionTypeAnnexe;
		versionTypeAnnexe = newVersionTypeAnnexe;
		boolean oldVersionTypeAnnexeESet = versionTypeAnnexeESet;
		versionTypeAnnexeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_TYPE_ANNEXE, oldVersionTypeAnnexe, versionTypeAnnexe, !oldVersionTypeAnnexeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersionTypeAnnexe() {
		String oldVersionTypeAnnexe = versionTypeAnnexe;
		boolean oldVersionTypeAnnexeESet = versionTypeAnnexeESet;
		versionTypeAnnexe = VERSION_TYPE_ANNEXE_EDEFAULT;
		versionTypeAnnexeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_TYPE_ANNEXE, oldVersionTypeAnnexe, VERSION_TYPE_ANNEXE_EDEFAULT, oldVersionTypeAnnexeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersionTypeAnnexe() {
		return versionTypeAnnexeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTION_RENSEIGNEMENT:
				return ((InternalEList<?>)getActionRenseignement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTIVITE_POSTURE:
				return ((InternalEList<?>)getActivitePosture()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERONEF:
				return ((InternalEList<?>)getAeronef()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALERTE_FRAPPE_NUCLEAIRE_AMIE:
				return ((InternalEList<?>)getAlerteFrappeNucleaireAmie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALLURE:
				return ((InternalEList<?>)getAllure()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ANNULATION_INTERDICTION_TIR:
				return ((InternalEList<?>)getAnnulationInterdictionTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__APPUI_FEU_HELICOPTERE:
				return ((InternalEList<?>)getAppuiFeuHelicoptere()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_ASS:
				return ((InternalEList<?>)getArticulationASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_LOGISTIQUE:
				return ((InternalEList<?>)getArticulationLogistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				return ((InternalEList<?>)getAssocEntiteOrgTypeEntiteOrg()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_ACTION:
				return ((InternalEList<?>)getAssociationActionAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getAssociationActionAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_EVENEMENT_NRBC:
				return ((InternalEList<?>)getAssociationActionEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				return ((InternalEList<?>)getAssociationAutreEvenementAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getAssociationAutreEvenementAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				return ((InternalEList<?>)getAssociationAutreEvenementEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				return ((InternalEList<?>)getAssociationConflit3DMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMABLEL_MAJEUR:
				return ((InternalEList<?>)getAssociationConsommablelMajeur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getAssociationConvoiMouvementParRoute()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				return ((InternalEList<?>)getAssociationDepEvacuationDepEvacuation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				return ((InternalEList<?>)getAssociationElementControleEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				return ((InternalEList<?>)getAssociationElementTopographieEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_CTRL:
				return ((InternalEList<?>)getAssociationEltCtrlEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_TOPO:
				return ((InternalEList<?>)getAssociationEltCtrlEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_MATERIEL:
				return ((InternalEList<?>)getAssociationEltCtrlMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_SITE:
				return ((InternalEList<?>)getAssociationEltCtrlSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				return ((InternalEList<?>)getAssociationEltCtrlTypeEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_TOPO_SITE:
				return ((InternalEList<?>)getAssociationEltTopoSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ACTION:
				return ((InternalEList<?>)getAssociationEntiteOrgAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getAssociationEntiteOrganisationnellePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				return ((InternalEList<?>)getAssociationEntiteOrgEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				return ((InternalEList<?>)getAssociationEntiteOrgEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return ((InternalEList<?>)getAssociationEntiteOrgEntiteOrg()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_EVENEMENT:
				return ((InternalEList<?>)getAssociationEntiteOrgEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_MATERIEL:
				return ((InternalEList<?>)getAssociationEntiteOrgMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				return ((InternalEList<?>)getAssociationEntiteOrgObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_PERSONNE:
				return ((InternalEList<?>)getAssociationEntiteOrgPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_SITE:
				return ((InternalEList<?>)getAssociationEntiteOrgSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EQUIPEMENTL_MAJEUR:
				return ((InternalEList<?>)getAssociationEquipementlMajeur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_ACTION:
				return ((InternalEList<?>)getAssociationEvenementNRBCAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getAssociationEvenementNRBCAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				return ((InternalEList<?>)getAssociationEvenementNRBCEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getAssociationEvenementRENSAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				return ((InternalEList<?>)getAssociationEvenementRENSEvenementRENS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getAssociationGroupeInfoOpsPlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_HORAIRE_MANOEUVRE:
				return ((InternalEList<?>)getAssociationHoraireManoeuvre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_LIVRAISON_LIVAISON:
				return ((InternalEList<?>)getAssociationLivraisonLivaison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_CTRL:
				return ((InternalEList<?>)getAssociationMaterielEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_TOPO:
				return ((InternalEList<?>)getAssociationMaterielEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_EVENEMENT:
				return ((InternalEList<?>)getAssociationMaterielEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_MATERIEL:
				return ((InternalEList<?>)getAssociationMaterielMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_METEOROLOGIE:
				return ((InternalEList<?>)getAssociationMaterielMeteorologie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_OBJET_INCONNU:
				return ((InternalEList<?>)getAssociationMaterielObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_PERSONNE:
				return ((InternalEList<?>)getAssociationMaterielPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_SITE:
				return ((InternalEList<?>)getAssociationMaterielSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				return ((InternalEList<?>)getAssociationMaterielTypeMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				return ((InternalEList<?>)getAssociationMesureCoordinationPlanFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				return ((InternalEList<?>)getAssociationMesureCoordMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_METEOROLOGIE_SITE:
				return ((InternalEList<?>)getAssociationMeteorologieSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				return ((InternalEList<?>)getAssociationMissionAerienneMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				return ((InternalEList<?>)getAssociationMissionGenieMissionGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MELEE_ACTION:
				return ((InternalEList<?>)getAssociationMissionMeleeAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				return ((InternalEList<?>)getAssociationMissionMouvementMissionMouvement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				return ((InternalEList<?>)getAssociationMissionRenseignementAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getAssociationMissionRensObjPlanTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getAssociationMissionRensObjTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getAssociationMouvementParRouteMouvementParRoute()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				return ((InternalEList<?>)getAssociationObjectifCiblageDocument()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				return ((InternalEList<?>)getAssociationObjetInconnuEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				return ((InternalEList<?>)getAssociationObjetInconnuEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_SITE:
				return ((InternalEList<?>)getAssociationObjetInconnuSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBSERVATION_OBSERVATION:
				return ((InternalEList<?>)getAssociationObservationObservation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				return ((InternalEList<?>)getAssociationParagraphePOparagraphePO()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_CTRL:
				return ((InternalEList<?>)getAssociationPersonneEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_TOPO:
				return ((InternalEList<?>)getAssociationPersonneEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_EVENEMENT:
				return ((InternalEList<?>)getAssociationPersonneEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MATERIEL:
				return ((InternalEList<?>)getAssociationPersonneMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MISSION_AIR:
				return ((InternalEList<?>)getAssociationPersonneMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_OBJET_INCONNU:
				return ((InternalEList<?>)getAssociationPersonneObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PERSONNE:
				return ((InternalEList<?>)getAssociationPersonnePersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				return ((InternalEList<?>)getAssociationPersonnePlanifOperation3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_SITE:
				return ((InternalEList<?>)getAssociationPersonneSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				return ((InternalEList<?>)getAssociationPersonneTypePersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				return ((InternalEList<?>)getAssociationPlanificationOperation3DMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				return ((InternalEList<?>)getAssociationPlanificationOperation3DMissionASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getAssociationPlanOuOrdrePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getAssociationPlanTraitementObjTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				return ((InternalEList<?>)getAssociationRenseignementObjMisRenseignementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_CTRL:
				return ((InternalEList<?>)getAssociationSiteEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_TOPO:
				return ((InternalEList<?>)getAssociationSiteEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_EVENEMENT:
				return ((InternalEList<?>)getAssociationSiteEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_MATERIEL:
				return ((InternalEList<?>)getAssociationSiteMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_METEOROLOGIE:
				return ((InternalEList<?>)getAssociationSiteMeteorologie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_OBJET_INCONNU:
				return ((InternalEList<?>)getAssociationSiteObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_SITE:
				return ((InternalEList<?>)getAssociationSiteSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_TYPE_SITE:
				return ((InternalEList<?>)getAssociationSiteTypeSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				return ((InternalEList<?>)getAssociationSyntheseDetectionsEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getAssociationTraitementObjPlanTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				return ((InternalEList<?>)getAssociationUniteAppuiFeuHelicoptere()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				return ((InternalEList<?>)getAssociationUniteAutreMissionLog()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_LIVRAISON:
				return ((InternalEList<?>)getAssociationUniteLivraison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				return ((InternalEList<?>)getAssociationUniteMissionAcqASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AERIENNE:
				return ((InternalEList<?>)getAssociationUniteMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AIR:
				return ((InternalEList<?>)getAssociationUniteMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				return ((InternalEList<?>)getAssociationUniteMissionALATattaque()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ASA:
				return ((InternalEList<?>)getAssociationUniteMissionASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				return ((InternalEList<?>)getAssociationUniteMissionEscorteAF()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_GENIE:
				return ((InternalEList<?>)getAssociationUniteMissionGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_MELEE:
				return ((InternalEList<?>)getAssociationUniteMissionMelee()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				return ((InternalEList<?>)getAssociationUniteMissionRensObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_SIC:
				return ((InternalEList<?>)getAssociationUniteMissionSic()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				return ((InternalEList<?>)getAssociationUniteMissionTranspTact()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				return ((InternalEList<?>)getAssociationUniteMissionUniteAntichar()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getAssociationUniteMouvementParRoute()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLAN_FEUX:
				return ((InternalEList<?>)getAssociationUnitePlanFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				return ((InternalEList<?>)getAssociationUnitePlanifOperation3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				return ((InternalEList<?>)getAssociationUniteRenforcementsFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_SYMBOLE_TACTIQUE:
				return ((InternalEList<?>)getAssocSymboleTactique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ACTION:
				return ((InternalEList<?>)getAutreAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_AFFILIATION:
				return ((InternalEList<?>)getAutreAffiliation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CAPTEUR_RENS:
				return ((InternalEList<?>)getAutreCapteurRENS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NUCLEAIRE:
				return ((InternalEList<?>)getAutreEvenementNucleaire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MENACE:
				return ((InternalEList<?>)getAutreMenace()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION:
				return ((InternalEList<?>)getAutreMission()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_ALAT:
				return ((InternalEList<?>)getAutreMissionALAT()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_LOGISTIQUE:
				return ((InternalEList<?>)getAutreMissionLogistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE_SYSTEME_ARME:
				return ((InternalEList<?>)getAutreTypeConsommableSystemeArme()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__BESOINS_EN_RENSEIGNEMENTS:
				return ((InternalEList<?>)getBesoinsEnRenseignements()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__BILAN_TIRS_ASS:
				return ((InternalEList<?>)getBilanTirsASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__BRANCHE_NAVIGATION:
				return ((InternalEList<?>)getBrancheNavigation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__BULLETIN_SONDAGE:
				return ((InternalEList<?>)getBulletinSondage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_HEBERGEMENT:
				return ((InternalEList<?>)getCapaciteHebergement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MAINTENANCE:
				return ((InternalEList<?>)getCapaciteMaintenance()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MANUTENTION:
				return ((InternalEList<?>)getCapaciteManutention()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_OPERATIONNELLE:
				return ((InternalEList<?>)getCapaciteOperationnelle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SOUTIEN:
				return ((InternalEList<?>)getCapaciteSoutien()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_TRANSMISSION:
				return ((InternalEList<?>)getCapaciteTransmission()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_DRONE:
				return ((InternalEList<?>)getCapteurDrone()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_LOCALISATION_RADIOELECTRIQUE:
				return ((InternalEList<?>)getCapteurLocalisationRadioelectrique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_RADAR:
				return ((InternalEList<?>)getCapteurRadar()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_ROHUM:
				return ((InternalEList<?>)getCapteurROHUM()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARNET_POINTS:
				return ((InternalEList<?>)getCarnetPoints()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARGEMENT_MATERIEL:
				return ((InternalEList<?>)getChargementMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPTE_RENDU_TIR:
				return ((InternalEList<?>)getCompteRenduTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONFLIT3_D:
				return ((InternalEList<?>)getConflit3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE:
				return ((InternalEList<?>)getConsigne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_LUTTE_ANTIAERIENNE_TTA:
				return ((InternalEList<?>)getConsigneLutteAntiaerienneTTA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_TIR:
				return ((InternalEList<?>)getConsigneTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_AERIENNE:
				return ((InternalEList<?>)getCouvertureAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_ASA:
				return ((InternalEList<?>)getCouvertureASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEGRE_CLASSIFICATION:
				return ((InternalEList<?>)getDegreClassification()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEMANDE_TIR:
				return ((InternalEList<?>)getDemandeTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPANNAGE_EVACUATION:
				return ((InternalEList<?>)getDepannageEvacuation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MARTHA:
				return ((InternalEList<?>)getDeploiementMARTHA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MOYENS_AS_AC3D:
				return ((InternalEList<?>)getDeploiementMoyensASAc3d()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_IDENTIFIE:
				return ((InternalEList<?>)getDetachementIdentifie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_NON_IDENTIFIE:
				return ((InternalEList<?>)getDetachementNonIdentifie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTIVE_TIR:
				return ((InternalEList<?>)getDirectiveTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ECHELON:
				return ((InternalEList<?>)getEchelon()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_METEO:
				return ((InternalEList<?>)getElementMeteo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENNEMI_FUTUR:
				return ((InternalEList<?>)getEnnemiFutur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getEnTeteParagraphePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ETUDE_DISPERSION:
				return ((InternalEList<?>)getEtudeDispersion()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RENS:
				return ((InternalEList<?>)getEvenementRENS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__FAIT_RENSEIGNEMENT:
				return ((InternalEList<?>)getFaitRenseignement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__HORAIRE_MANOEUVRE:
				return ((InternalEList<?>)getHoraireManoeuvre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__HYPOTHESE_ACTION_EN_IOU_AUTRE:
				return ((InternalEList<?>)getHypotheseActionENIouAutre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__INDICATEUR_GEOSTATISTIQUE:
				return ((InternalEList<?>)getIndicateurGeostatistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERDICTION_TIR:
				return ((InternalEList<?>)getInterdictionTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_GENERALE:
				return ((InternalEList<?>)getInterventionGenerale()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_TYPE:
				return ((InternalEList<?>)getInterventionType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				return ((InternalEList<?>)getItineraireOuModeleCheminementALAT()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__JONCTION_RESEAU:
				return ((InternalEList<?>)getJonctionReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIAISON_RESEAU:
				return ((InternalEList<?>)getLiaisonReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIGNE_LIVRAISON:
				return ((InternalEList<?>)getLigneLivraison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_MESURES_COORDINATION3_D:
				return ((InternalEList<?>)getListeMesuresCoordination3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_PLANIFIES:
				return ((InternalEList<?>)getListeObjectifsPlanifies()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIVRAISON:
				return ((InternalEList<?>)getLivraison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MEMENTO_GENIE:
				return ((InternalEList<?>)getMementoGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AERIENNE:
				return ((InternalEList<?>)getMenaceAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AS_AENI:
				return ((InternalEList<?>)getMenaceASAeni()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_DETECTION:
				return ((InternalEList<?>)getMenaceDetection()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_FEUX_ENI:
				return ((InternalEList<?>)getMenaceFeuxENI()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_GENIE_ENI:
				return ((InternalEList<?>)getMenaceGenieENI()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACES_AERIENNES_MISSION_ALAT:
				return ((InternalEList<?>)getMenacesAeriennesMissionALAT()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURES_PROTECTION_ELECTRONIQUE:
				return ((InternalEList<?>)getMesuresProtectionElectronique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISE_EN_OEUVRE_ROE:
				return ((InternalEList<?>)getMiseEnOeuvreROE()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ACQUISITION_ASS:
				return ((InternalEList<?>)getMissionAcquisitionASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AERIENNE:
				return ((InternalEList<?>)getMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AIR:
				return ((InternalEList<?>)getMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ALA_TATTAQUE:
				return ((InternalEList<?>)getMissionALATattaque()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ASA:
				return ((InternalEList<?>)getMissionASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ESCORTE_OU_APPUI_FEU:
				return ((InternalEList<?>)getMissionEscorteOuAppuiFeu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_FEUX:
				return ((InternalEList<?>)getMissionFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_GENIE:
				return ((InternalEList<?>)getMissionGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_I3D:
				return ((InternalEList<?>)getMissionI3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MAINTENANCE:
				return ((InternalEList<?>)getMissionMaintenance()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MELEE:
				return ((InternalEList<?>)getMissionMelee()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MOUVEMENT:
				return ((InternalEList<?>)getMissionMouvement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RAVITAILLEMENT:
				return ((InternalEList<?>)getMissionRavitaillement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT:
				return ((InternalEList<?>)getMissionRenseignement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT_OBJECTIF:
				return ((InternalEList<?>)getMissionRenseignementObjectif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SAR_COMBAT:
				return ((InternalEList<?>)getMissionSarCombat()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SIC:
				return ((InternalEList<?>)getMissionSic()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_TRANSPORT_TACTIQUE:
				return ((InternalEList<?>)getMissionTransportTactique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_UNITE_ANTICHAR:
				return ((InternalEList<?>)getMissionUniteAntichar()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MODULE:
				return ((InternalEList<?>)getModule()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getMouvementParRoute()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_AERIENS_DONT_BENEFICIE_GU:
				return ((InternalEList<?>)getMoyensAeriensDontBeneficieGU()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_GENIE:
				return ((InternalEList<?>)getMoyensGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_INCONNU:
				return ((InternalEList<?>)getObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_LIBRE:
				return ((InternalEList<?>)getObjetLibre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBSERVATION:
				return ((InternalEList<?>)getObservation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORDRE:
				return ((InternalEList<?>)getOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORGANISATION_SOUTIEN_MEDICAL:
				return ((InternalEList<?>)getOrganisationSoutienMedical()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__OUVRAGE_GENIE:
				return ((InternalEList<?>)getOuvrageGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__OVERLAY:
				return ((InternalEList<?>)getOverlay()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PARAGRAPHE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getParagraphePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERTES_SANTE:
				return ((InternalEList<?>)getPertesSante()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PION_RESEAU:
				return ((InternalEList<?>)getPionReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN:
				return ((InternalEList<?>)getPlan()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_FEUX:
				return ((InternalEList<?>)getPlanFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_CELLULE_SOUTIEN:
				return ((InternalEList<?>)getPlanificationCelluleSoutien()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_MOUVEMENT:
				return ((InternalEList<?>)getPlanificationMouvement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_OPERATION3_D:
				return ((InternalEList<?>)getPlanificationOperation3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_NUMEROTATION_OBJECTIFS:
				return ((InternalEList<?>)getPlanNumerotationObjectifs()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_TRAITEMENT_OBJECTIFS:
				return ((InternalEList<?>)getPlanTraitementObjectifs()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_AXE:
				return ((InternalEList<?>)getPointAxe()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_HAUT:
				return ((InternalEList<?>)getPointHaut()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_TRAJECTOIRE:
				return ((InternalEList<?>)getPointTrajectoire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__POLITIQUE_TIR:
				return ((InternalEList<?>)getPolitiqueTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORTEUR_SYSTEME_ARME:
				return ((InternalEList<?>)getPorteurSystemeArme()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSSIBILITES_ENI_3D:
				return ((InternalEList<?>)getPossibilitesENI3d()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_TIR:
				return ((InternalEList<?>)getPosteTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__POTENTIEL_EN_IFEU_SOL_SOL:
				return ((InternalEList<?>)getPotentielENIfeuSolSol()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_IDENTIFIE:
				return ((InternalEList<?>)getPrelevementSubordonneIdentifie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				return ((InternalEList<?>)getPrelevementSubordonneNonIdentifie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PREVISION_OBSERVATION:
				return ((InternalEList<?>)getPrevisionObservation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TACTIQUE:
				return ((InternalEList<?>)getPrioriteTactique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TECHNIQUE:
				return ((InternalEList<?>)getPrioriteTechnique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROCEDURE_IFF:
				return ((InternalEList<?>)getProcedureIFF()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROJET_CIMIC:
				return ((InternalEList<?>)getProjetCimic()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAID_AERIEN_ENNEMI:
				return ((InternalEList<?>)getRaidAerienEnnemi()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT_FORCE:
				return ((InternalEList<?>)getRapportForce()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RATTACHEMENT_LOGISTIQUE_PARTICULIER:
				return ((InternalEList<?>)getRattachementLogistiqueParticulier()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAVITAILLEMENT:
				return ((InternalEList<?>)getRavitaillement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RECHANGE:
				return ((InternalEList<?>)getRechange()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENFORCEMENTS_FEUX:
				return ((InternalEList<?>)getRenforcementsFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENSEIGNEMENT_OBJECTIF:
				return ((InternalEList<?>)getRenseignementObjectif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESERVATION_UNITE:
				return ((InternalEList<?>)getReservationUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE_HELICOPTERE_ALAT:
				return ((InternalEList<?>)getRouteHelicoptereALAT()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_CONSOMMABLE:
				return ((InternalEList<?>)getSituationConsommable()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EFFECTIF:
				return ((InternalEList<?>)getSituationEffectif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EQUIPEMENT:
				return ((InternalEList<?>)getSituationEquipement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_RADIATION:
				return ((InternalEList<?>)getSituationRadiation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_VEHICULE:
				return ((InternalEList<?>)getSituationVehicule()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_ANNOTATION:
				return ((InternalEList<?>)getSymboleAnnotation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_CERCLE:
				return ((InternalEList<?>)getSymboleCercle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_FLECHE:
				return ((InternalEList<?>)getSymboleFleche()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_IMAGE:
				return ((InternalEList<?>)getSymboleImage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_LINEIQUE:
				return ((InternalEList<?>)getSymboleLineique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_NOTE:
				return ((InternalEList<?>)getSymboleNote()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POINT:
				return ((InternalEList<?>)getSymbolePoint()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POST_IT:
				return ((InternalEList<?>)getSymbolePostIt()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TACTIQUE:
				return ((InternalEList<?>)getSymboleTactique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TEXTE:
				return ((InternalEList<?>)getSymboleTexte()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYNTHESE_DETECTIONS:
				return ((InternalEList<?>)getSyntheseDetections()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS:
				return ((InternalEList<?>)getSystemeAtterrissageAuxInstruments()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAITEMENT_OBJECTIF:
				return ((InternalEList<?>)getTraitementObjectif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAVAIL_AIDE_DEPLOIEMENT:
				return ((InternalEList<?>)getTravailAideDeploiement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARMEMENT_SYSTEME_ARME:
				return ((InternalEList<?>)getTypeArmementSystemeArme()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_CAPTEUR:
				return ((InternalEList<?>)getTypeCapteur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_SYSTEME_ARME:
				return ((InternalEList<?>)getTypeEquipementSystemeArme()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ITINERAIRE:
				return ((InternalEList<?>)getTypeItineraire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION_SYSTEME_ARME:
				return ((InternalEList<?>)getTypeMunitionSystemeArme()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_MILITAIRE_EXECUTIVE:
				return ((InternalEList<?>)getTypeOrganisationMilitaireExecutive()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORTEUR:
				return ((InternalEList<?>)getTypePorteur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__VARIANTE_TRAVAIL:
				return ((InternalEList<?>)getVarianteTravail()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__VEHICULE:
				return ((InternalEList<?>)getVehicule()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__VOL:
				return ((InternalEList<?>)getVol()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_ALAT:
				return ((InternalEList<?>)getZoneAlat()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_FONCTIONNELLE_LOGISTIQUE:
				return ((InternalEList<?>)getZoneFonctionnelleLogistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_LOGISTIQUE:
				return ((InternalEList<?>)getZoneLogistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_MISE_ATERRE:
				return ((InternalEList<?>)getZoneMiseATerre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_RECHERCHE:
				return ((InternalEList<?>)getZoneRecherche()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_ELECTRONIQUE:
				return ((InternalEList<?>)getAdresseElectronique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_PHYSIQUE:
				return ((InternalEList<?>)getAdressePhysique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_RADIO:
				return ((InternalEList<?>)getAdresseRadio()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERODROME:
				return ((InternalEList<?>)getAerodrome()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AIRE_STATIONNEMENT:
				return ((InternalEList<?>)getAireStationnement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_MARINE:
				return ((InternalEList<?>)getArticulationMarine()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_TERRE:
				return ((InternalEList<?>)getArticulationTerre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ACTIVITE_CONTEXTE:
				return ((InternalEList<?>)getAssocActiviteContexte()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_CONTEXTE:
				return ((InternalEList<?>)getAssocContexteContexte()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_INSTANCE_OBJET:
				return ((InternalEList<?>)getAssocContexteInstanceObjet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTIVITE_CAPACITE:
				return ((InternalEList<?>)getAssociationActiviteCapacite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_AFFILIATION:
				return ((InternalEList<?>)getAssociationAffiliationAffiliation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				return ((InternalEList<?>)getAssociationAffiliationInstanceObjet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_TYPE:
				return ((InternalEList<?>)getAssociationAffiliationType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMATION:
				return ((InternalEList<?>)getAssociationConsommation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONTEXTE_RAPPORT:
				return ((InternalEList<?>)getAssociationContexteRapport()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DOCUMENT_CAPACITE:
				return ((InternalEList<?>)getAssociationDocumentCapacite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				return ((InternalEList<?>)getAssociationGroupeInfoOpsEntiteOrganisationnelle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				return ((InternalEList<?>)getAssociationInstanceObjetAdresse()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				return ((InternalEList<?>)getAssociationInstanceObjetCapacite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return ((InternalEList<?>)getAssociationObjectifCiblageObjectifCiblage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				return ((InternalEList<?>)getAssociationProfilDotationTheorique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_UNITE:
				return ((InternalEList<?>)getAssociationProfilUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				return ((InternalEList<?>)getAssociationRacineOperationnelleDocument()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TEMPORELLE_ACTIVITE:
				return ((InternalEList<?>)getAssociationTemporelleActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TYPE_CAPACITE:
				return ((InternalEList<?>)getAssociationTypeCapacite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				return ((InternalEList<?>)getAssocListeObjCandListeObjCand()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_PISTE_ATTER_DIR_APP_AIR:
				return ((InternalEList<?>)getAssocPisteAtterDirAppAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ADRESSE:
				return ((InternalEList<?>)getAutreAdresse()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ARTICULATION:
				return ((InternalEList<?>)getAutreArticulation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CONTEXTE:
				return ((InternalEList<?>)getAutreContexte()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT:
				return ((InternalEList<?>)getAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NRBC:
				return ((InternalEList<?>)getAutreEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_RADIOACTIF:
				return ((InternalEList<?>)getAutreEvenementRadioactif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_LISTE_OBJECTIFS:
				return ((InternalEList<?>)getAutreListeObjectifs()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MATERIEL:
				return ((InternalEList<?>)getAutreMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_NOM:
				return ((InternalEList<?>)getAutreNom()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_OBSTACLE:
				return ((InternalEList<?>)getAutreObstacle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SEGMENT_ITINERAIRE:
				return ((InternalEList<?>)getAutreSegmentItineraire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SITE:
				return ((InternalEList<?>)getAutreSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_BATIMENT:
				return ((InternalEList<?>)getAutreTypeBatiment()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE:
				return ((InternalEList<?>)getAutreTypeConsommable()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAutreTypeElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ENTITE_ORGANISATIONNELLE:
				return ((InternalEList<?>)getAutreTypeEntiteOrganisationnelle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_EQUIPEMENT:
				return ((InternalEList<?>)getAutreTypeEquipement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				return ((InternalEList<?>)getAutreTypeOrganisationGouvernementale()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_SITE:
				return ((InternalEList<?>)getAutreTypeSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__BASSIN:
				return ((InternalEList<?>)getBassin()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__BATIMENT:
				return ((InternalEList<?>)getBatiment()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_LANCEMENT:
				return ((InternalEList<?>)getCaleLancement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_SECHE:
				return ((InternalEList<?>)getCaleSeche()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_FEUX:
				return ((InternalEList<?>)getCapaciteFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_GENIE:
				return ((InternalEList<?>)getCapaciteGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MOBILITE:
				return ((InternalEList<?>)getCapaciteMobilite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_STOCKAGE:
				return ((InternalEList<?>)getCapaciteStockage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SURVEILLANCE:
				return ((InternalEList<?>)getCapaciteSurveillance()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_LOGISTIQUE:
				return ((InternalEList<?>)getCaracteristiqueLogistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_TRANSPORT:
				return ((InternalEList<?>)getCaracteristiqueTransport()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_MARITIME:
				return ((InternalEList<?>)getChampMinesMaritime()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_TERRESTRE:
				return ((InternalEList<?>)getChampMinesTerrestre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARNIER:
				return ((InternalEList<?>)getCharnier()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHEMIN_FER:
				return ((InternalEList<?>)getCheminFer()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				return ((InternalEList<?>)getCompositionDotationTheoriqueEnType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONVOI:
				return ((InternalEList<?>)getConvoi()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTION_APPROCHE_AIR:
				return ((InternalEList<?>)getDirectionApprocheAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE:
				return ((InternalEList<?>)getDotationTheorique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE_INSTANCE_OBJET:
				return ((InternalEList<?>)getDotationTheoriqueInstanceObjet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_TOPOGRAPHIE:
				return ((InternalEList<?>)getElementTopographie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENTITE_POLITIQUE:
				return ((InternalEList<?>)getEntitePolitique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_ARME_NUCLEAIRE:
				return ((InternalEList<?>)getEvenementArmeNucleaire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE:
				return ((InternalEList<?>)getEvenementChimiqueEtBiologique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RADIOLOGIQUE:
				return ((InternalEList<?>)getEvenementRadiologique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_ETHNIQUE:
				return ((InternalEList<?>)getGroupeEthnique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_FONCTIONNEL:
				return ((InternalEList<?>)getGroupeFonctionnel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INDIVIDUS:
				return ((InternalEList<?>)getGroupeIndividus()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INFORMATIONS_OPERATIONNELLES:
				return ((InternalEList<?>)getGroupeInformationsOperationnelles()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE:
				return ((InternalEList<?>)getItineraire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__JETEE:
				return ((InternalEList<?>)getJetee()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIMITE:
				return ((InternalEList<?>)getLimite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_CANDIDATS:
				return ((InternalEList<?>)getListeObjectifsCandidats()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURE_COORDINATION:
				return ((InternalEList<?>)getMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUILLAGE:
				return ((InternalEList<?>)getMouillage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_ACTIVITE:
				return ((InternalEList<?>)getObjectifActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_CIBLAGE:
				return ((InternalEList<?>)getObjectifCiblage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERSONNE:
				return ((InternalEList<?>)getPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PISTE_ATTERRISSAGE:
				return ((InternalEList<?>)getPisteAtterrissage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_CONTROLE3_D:
				return ((InternalEList<?>)getPointControle3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PONT:
				return ((InternalEList<?>)getPont()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_AMARRAGE:
				return ((InternalEList<?>)getPosteAmarrage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROFIL:
				return ((InternalEList<?>)getProfil()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__QUAI_MARITIME:
				return ((InternalEList<?>)getQuaiMaritime()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT:
				return ((InternalEList<?>)getRapport()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__REGLE_ENGAGEMENT:
				return ((InternalEList<?>)getRegleEngagement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RELIGION:
				return ((InternalEList<?>)getReligion()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESEAU_TELECOMMUNICATION:
				return ((InternalEList<?>)getReseauTelecommunication()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SEGMENT_ROUTE_AERIENNE:
				return ((InternalEList<?>)getSegmentRouteAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__SERVICE_RESEAU:
				return ((InternalEList<?>)getServiceReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__STRUCTURE_ORGANISEE:
				return ((InternalEList<?>)getStructureOrganisee()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRANCHE_METEO:
				return ((InternalEList<?>)getTrancheMeteo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERODROME:
				return ((InternalEList<?>)getTypeAerodrome()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERONEF:
				return ((InternalEList<?>)getTypeAeronef()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_BIOLOGIQUE:
				return ((InternalEList<?>)getTypeAgentBiologique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_CHIMIQUE:
				return ((InternalEList<?>)getTypeAgentChimique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_NUCLEAIRE:
				return ((InternalEList<?>)getTypeAgentNucleaire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARME:
				return ((InternalEList<?>)getTypeArme()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_BATIMENT_SURFACE:
				return ((InternalEList<?>)getTypeBatimentSurface()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_ELECTRONIQUE:
				return ((InternalEList<?>)getTypeEquipementElectronique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_FERROVIAIRE:
				return ((InternalEList<?>)getTypeEquipementFerroviaire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_GENIE:
				return ((InternalEList<?>)getTypeEquipementGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_MARITIME:
				return ((InternalEList<?>)getTypeEquipementMaritime()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_NRBC:
				return ((InternalEList<?>)getTypeEquipementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_GROUPE_INDIVIDUS:
				return ((InternalEList<?>)getTypeGroupeIndividus()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MESURE_COORDINATION:
				return ((InternalEList<?>)getTypeMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION:
				return ((InternalEList<?>)getTypeMunition()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_OBSTACLE:
				return ((InternalEList<?>)getTypeObstacle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_PRIVEE:
				return ((InternalEList<?>)getTypeOrganisationPrivee()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PERSONNE:
				return ((InternalEList<?>)getTypePersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PONT:
				return ((InternalEList<?>)getTypePont()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORT:
				return ((InternalEList<?>)getTypePort()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_CIVIL:
				return ((InternalEList<?>)getTypePosteCivil()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_MILITAIRE:
				return ((InternalEList<?>)getTypePosteMilitaire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_REGROUPEMENT_FORCE:
				return ((InternalEList<?>)getTypeRegroupementForce()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_SOUS_MARIN:
				return ((InternalEList<?>)getTypeSousMarin()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_UNITE:
				return ((InternalEList<?>)getTypeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_VEHICULE:
				return ((InternalEList<?>)getTypeVehicule()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__UNITE:
				return ((InternalEList<?>)getUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_AERIENNE:
				return ((InternalEList<?>)getZoneAerienne()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTION_RENSEIGNEMENT:
				return getActionRenseignement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTIVITE_POSTURE:
				return getActivitePosture();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERONEF:
				return getAeronef();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALERTE_FRAPPE_NUCLEAIRE_AMIE:
				return getAlerteFrappeNucleaireAmie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALLURE:
				return getAllure();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ANNULATION_INTERDICTION_TIR:
				return getAnnulationInterdictionTir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__APPUI_FEU_HELICOPTERE:
				return getAppuiFeuHelicoptere();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_ASS:
				return getArticulationASS();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_LOGISTIQUE:
				return getArticulationLogistique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				return getAssocEntiteOrgTypeEntiteOrg();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_ACTION:
				return getAssociationActionAction();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				return getAssociationActionAutreEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_EVENEMENT_NRBC:
				return getAssociationActionEvenementNRBC();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				return getAssociationAutreEvenementAction();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				return getAssociationAutreEvenementAutreEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				return getAssociationAutreEvenementEvenementNRBC();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				return getAssociationConflit3DMissionAerienne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMABLEL_MAJEUR:
				return getAssociationConsommablelMajeur();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				return getAssociationConvoiMouvementParRoute();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				return getAssociationDepEvacuationDepEvacuation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				return getAssociationElementControleEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				return getAssociationElementTopographieEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_CTRL:
				return getAssociationEltCtrlEltCtrl();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_TOPO:
				return getAssociationEltCtrlEltTopo();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_MATERIEL:
				return getAssociationEltCtrlMateriel();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_SITE:
				return getAssociationEltCtrlSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				return getAssociationEltCtrlTypeEltCtrl();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_TOPO_SITE:
				return getAssociationEltTopoSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ACTION:
				return getAssociationEntiteOrgAction();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				return getAssociationEntiteOrganisationnellePlanOuOrdre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				return getAssociationEntiteOrgEltCtrl();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				return getAssociationEntiteOrgEltTopo();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return getAssociationEntiteOrgEntiteOrg();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_EVENEMENT:
				return getAssociationEntiteOrgEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_MATERIEL:
				return getAssociationEntiteOrgMateriel();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				return getAssociationEntiteOrgObjetInconnu();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_PERSONNE:
				return getAssociationEntiteOrgPersonne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_SITE:
				return getAssociationEntiteOrgSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EQUIPEMENTL_MAJEUR:
				return getAssociationEquipementlMajeur();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_ACTION:
				return getAssociationEvenementNRBCAction();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				return getAssociationEvenementNRBCAutreEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				return getAssociationEvenementNRBCEvenementNRBC();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				return getAssociationEvenementRENSAutreEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				return getAssociationEvenementRENSEvenementRENS();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				return getAssociationGroupeInfoOpsPlanOuOrdre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_HORAIRE_MANOEUVRE:
				return getAssociationHoraireManoeuvre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_LIVRAISON_LIVAISON:
				return getAssociationLivraisonLivaison();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_CTRL:
				return getAssociationMaterielEltCtrl();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_TOPO:
				return getAssociationMaterielEltTopo();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_EVENEMENT:
				return getAssociationMaterielEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_MATERIEL:
				return getAssociationMaterielMateriel();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_METEOROLOGIE:
				return getAssociationMaterielMeteorologie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_OBJET_INCONNU:
				return getAssociationMaterielObjetInconnu();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_PERSONNE:
				return getAssociationMaterielPersonne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_SITE:
				return getAssociationMaterielSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				return getAssociationMaterielTypeMateriel();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				return getAssociationMesureCoordinationPlanFeux();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				return getAssociationMesureCoordMissionAerienne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_METEOROLOGIE_SITE:
				return getAssociationMeteorologieSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				return getAssociationMissionAerienneMissionAerienne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				return getAssociationMissionGenieMissionGenie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MELEE_ACTION:
				return getAssociationMissionMeleeAction();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				return getAssociationMissionMouvementMissionMouvement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				return getAssociationMissionRenseignementAction();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				return getAssociationMissionRensObjPlanTraitementObj();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				return getAssociationMissionRensObjTraitementObj();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				return getAssociationMouvementParRouteMouvementParRoute();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				return getAssociationObjectifCiblageDocument();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				return getAssociationObjetInconnuEltCtrl();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				return getAssociationObjetInconnuEltTopo();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_SITE:
				return getAssociationObjetInconnuSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBSERVATION_OBSERVATION:
				return getAssociationObservationObservation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				return getAssociationParagraphePOparagraphePO();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_CTRL:
				return getAssociationPersonneEltCtrl();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_TOPO:
				return getAssociationPersonneEltTopo();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_EVENEMENT:
				return getAssociationPersonneEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MATERIEL:
				return getAssociationPersonneMateriel();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MISSION_AIR:
				return getAssociationPersonneMissionAir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_OBJET_INCONNU:
				return getAssociationPersonneObjetInconnu();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PERSONNE:
				return getAssociationPersonnePersonne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				return getAssociationPersonnePlanifOperation3D();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_SITE:
				return getAssociationPersonneSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				return getAssociationPersonneTypePersonne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				return getAssociationPlanificationOperation3DMissionAir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				return getAssociationPlanificationOperation3DMissionASA();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				return getAssociationPlanOuOrdrePlanOuOrdre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				return getAssociationPlanTraitementObjTraitementObj();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				return getAssociationRenseignementObjMisRenseignementObj();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_CTRL:
				return getAssociationSiteEltCtrl();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_TOPO:
				return getAssociationSiteEltTopo();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_EVENEMENT:
				return getAssociationSiteEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_MATERIEL:
				return getAssociationSiteMateriel();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_METEOROLOGIE:
				return getAssociationSiteMeteorologie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_OBJET_INCONNU:
				return getAssociationSiteObjetInconnu();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_SITE:
				return getAssociationSiteSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_TYPE_SITE:
				return getAssociationSiteTypeSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				return getAssociationSyntheseDetectionsEvenementNRBC();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				return getAssociationTraitementObjPlanTraitementObj();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				return getAssociationUniteAppuiFeuHelicoptere();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				return getAssociationUniteAutreMissionLog();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_LIVRAISON:
				return getAssociationUniteLivraison();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				return getAssociationUniteMissionAcqASS();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AERIENNE:
				return getAssociationUniteMissionAerienne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AIR:
				return getAssociationUniteMissionAir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				return getAssociationUniteMissionALATattaque();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ASA:
				return getAssociationUniteMissionASA();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				return getAssociationUniteMissionEscorteAF();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_GENIE:
				return getAssociationUniteMissionGenie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_MELEE:
				return getAssociationUniteMissionMelee();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				return getAssociationUniteMissionRensObj();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_SIC:
				return getAssociationUniteMissionSic();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				return getAssociationUniteMissionTranspTact();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				return getAssociationUniteMissionUniteAntichar();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				return getAssociationUniteMouvementParRoute();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLAN_FEUX:
				return getAssociationUnitePlanFeux();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				return getAssociationUnitePlanifOperation3D();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				return getAssociationUniteRenforcementsFeux();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_SYMBOLE_TACTIQUE:
				return getAssocSymboleTactique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ACTION:
				return getAutreAction();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_AFFILIATION:
				return getAutreAffiliation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CAPTEUR_RENS:
				return getAutreCapteurRENS();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NUCLEAIRE:
				return getAutreEvenementNucleaire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MENACE:
				return getAutreMenace();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION:
				return getAutreMission();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_ALAT:
				return getAutreMissionALAT();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_LOGISTIQUE:
				return getAutreMissionLogistique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE_SYSTEME_ARME:
				return getAutreTypeConsommableSystemeArme();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BESOINS_EN_RENSEIGNEMENTS:
				return getBesoinsEnRenseignements();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BILAN_TIRS_ASS:
				return getBilanTirsASS();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BRANCHE_NAVIGATION:
				return getBrancheNavigation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BULLETIN_SONDAGE:
				return getBulletinSondage();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_HEBERGEMENT:
				return getCapaciteHebergement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MAINTENANCE:
				return getCapaciteMaintenance();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MANUTENTION:
				return getCapaciteManutention();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_OPERATIONNELLE:
				return getCapaciteOperationnelle();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SOUTIEN:
				return getCapaciteSoutien();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_TRANSMISSION:
				return getCapaciteTransmission();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_DRONE:
				return getCapteurDrone();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_LOCALISATION_RADIOELECTRIQUE:
				return getCapteurLocalisationRadioelectrique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_RADAR:
				return getCapteurRadar();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_ROHUM:
				return getCapteurROHUM();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARNET_POINTS:
				return getCarnetPoints();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARGEMENT_MATERIEL:
				return getChargementMateriel();
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPTE_RENDU_TIR:
				return getCompteRenduTir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONFLIT3_D:
				return getConflit3D();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE:
				return getConsigne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_LUTTE_ANTIAERIENNE_TTA:
				return getConsigneLutteAntiaerienneTTA();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_TIR:
				return getConsigneTir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_AERIENNE:
				return getCouvertureAerienne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_ASA:
				return getCouvertureASA();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEGRE_CLASSIFICATION:
				return getDegreClassification();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEMANDE_TIR:
				return getDemandeTir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPANNAGE_EVACUATION:
				return getDepannageEvacuation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MARTHA:
				return getDeploiementMARTHA();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MOYENS_AS_AC3D:
				return getDeploiementMoyensASAc3d();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_IDENTIFIE:
				return getDetachementIdentifie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_NON_IDENTIFIE:
				return getDetachementNonIdentifie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTIVE_TIR:
				return getDirectiveTir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ECHELON:
				return getEchelon();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_METEO:
				return getElementMeteo();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENNEMI_FUTUR:
				return getEnnemiFutur();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				return getEnTeteParagraphePlanOuOrdre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ETUDE_DISPERSION:
				return getEtudeDispersion();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RENS:
				return getEvenementRENS();
			case SchemaPackage.TYPE_MPGT_MESSAGE__FAIT_RENSEIGNEMENT:
				return getFaitRenseignement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__HORAIRE_MANOEUVRE:
				return getHoraireManoeuvre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__HYPOTHESE_ACTION_EN_IOU_AUTRE:
				return getHypotheseActionENIouAutre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__INDICATEUR_GEOSTATISTIQUE:
				return getIndicateurGeostatistique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERDICTION_TIR:
				return getInterdictionTir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_GENERALE:
				return getInterventionGenerale();
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_TYPE:
				return getInterventionType();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				return getItineraireOuModeleCheminementALAT();
			case SchemaPackage.TYPE_MPGT_MESSAGE__JONCTION_RESEAU:
				return getJonctionReseau();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIAISON_RESEAU:
				return getLiaisonReseau();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIGNE_LIVRAISON:
				return getLigneLivraison();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_MESURES_COORDINATION3_D:
				return getListeMesuresCoordination3D();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_PLANIFIES:
				return getListeObjectifsPlanifies();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIVRAISON:
				return getLivraison();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MEMENTO_GENIE:
				return getMementoGenie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AERIENNE:
				return getMenaceAerienne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AS_AENI:
				return getMenaceASAeni();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_DETECTION:
				return getMenaceDetection();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_FEUX_ENI:
				return getMenaceFeuxENI();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_GENIE_ENI:
				return getMenaceGenieENI();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACES_AERIENNES_MISSION_ALAT:
				return getMenacesAeriennesMissionALAT();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURES_PROTECTION_ELECTRONIQUE:
				return getMesuresProtectionElectronique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISE_EN_OEUVRE_ROE:
				return getMiseEnOeuvreROE();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ACQUISITION_ASS:
				return getMissionAcquisitionASS();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AERIENNE:
				return getMissionAerienne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AIR:
				return getMissionAir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ALA_TATTAQUE:
				return getMissionALATattaque();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ASA:
				return getMissionASA();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ESCORTE_OU_APPUI_FEU:
				return getMissionEscorteOuAppuiFeu();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_FEUX:
				return getMissionFeux();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_GENIE:
				return getMissionGenie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_I3D:
				return getMissionI3D();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MAINTENANCE:
				return getMissionMaintenance();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MELEE:
				return getMissionMelee();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MOUVEMENT:
				return getMissionMouvement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RAVITAILLEMENT:
				return getMissionRavitaillement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT:
				return getMissionRenseignement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT_OBJECTIF:
				return getMissionRenseignementObjectif();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SAR_COMBAT:
				return getMissionSarCombat();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SIC:
				return getMissionSic();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_TRANSPORT_TACTIQUE:
				return getMissionTransportTactique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_UNITE_ANTICHAR:
				return getMissionUniteAntichar();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MODULE:
				return getModule();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUVEMENT_PAR_ROUTE:
				return getMouvementParRoute();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_AERIENS_DONT_BENEFICIE_GU:
				return getMoyensAeriensDontBeneficieGU();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_GENIE:
				return getMoyensGenie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_INCONNU:
				return getObjetInconnu();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_LIBRE:
				return getObjetLibre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBSERVATION:
				return getObservation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORDRE:
				return getOrdre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORGANISATION_SOUTIEN_MEDICAL:
				return getOrganisationSoutienMedical();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OUVRAGE_GENIE:
				return getOuvrageGenie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OVERLAY:
				return getOverlay();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PARAGRAPHE_PLAN_OU_ORDRE:
				return getParagraphePlanOuOrdre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERTES_SANTE:
				return getPertesSante();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PION_RESEAU:
				return getPionReseau();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN:
				return getPlan();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_FEUX:
				return getPlanFeux();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_CELLULE_SOUTIEN:
				return getPlanificationCelluleSoutien();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_MOUVEMENT:
				return getPlanificationMouvement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_OPERATION3_D:
				return getPlanificationOperation3D();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_NUMEROTATION_OBJECTIFS:
				return getPlanNumerotationObjectifs();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_TRAITEMENT_OBJECTIFS:
				return getPlanTraitementObjectifs();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_AXE:
				return getPointAxe();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_HAUT:
				return getPointHaut();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_TRAJECTOIRE:
				return getPointTrajectoire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POLITIQUE_TIR:
				return getPolitiqueTir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORTEUR_SYSTEME_ARME:
				return getPorteurSystemeArme();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSSIBILITES_ENI_3D:
				return getPossibilitesENI3d();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_TIR:
				return getPosteTir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POTENTIEL_EN_IFEU_SOL_SOL:
				return getPotentielENIfeuSolSol();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_IDENTIFIE:
				return getPrelevementSubordonneIdentifie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				return getPrelevementSubordonneNonIdentifie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PREVISION_OBSERVATION:
				return getPrevisionObservation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TACTIQUE:
				return getPrioriteTactique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TECHNIQUE:
				return getPrioriteTechnique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROCEDURE_IFF:
				return getProcedureIFF();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROJET_CIMIC:
				return getProjetCimic();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAID_AERIEN_ENNEMI:
				return getRaidAerienEnnemi();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT_FORCE:
				return getRapportForce();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RATTACHEMENT_LOGISTIQUE_PARTICULIER:
				return getRattachementLogistiqueParticulier();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAVITAILLEMENT:
				return getRavitaillement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RECHANGE:
				return getRechange();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENFORCEMENTS_FEUX:
				return getRenforcementsFeux();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENSEIGNEMENT_OBJECTIF:
				return getRenseignementObjectif();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESERVATION_UNITE:
				return getReservationUnite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE_HELICOPTERE_ALAT:
				return getRouteHelicoptereALAT();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_CONSOMMABLE:
				return getSituationConsommable();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EFFECTIF:
				return getSituationEffectif();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EQUIPEMENT:
				return getSituationEquipement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_RADIATION:
				return getSituationRadiation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_VEHICULE:
				return getSituationVehicule();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_ANNOTATION:
				return getSymboleAnnotation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_CERCLE:
				return getSymboleCercle();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_FLECHE:
				return getSymboleFleche();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_IMAGE:
				return getSymboleImage();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_LINEIQUE:
				return getSymboleLineique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_NOTE:
				return getSymboleNote();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POINT:
				return getSymbolePoint();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POST_IT:
				return getSymbolePostIt();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TACTIQUE:
				return getSymboleTactique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TEXTE:
				return getSymboleTexte();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYNTHESE_DETECTIONS:
				return getSyntheseDetections();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS:
				return getSystemeAtterrissageAuxInstruments();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAITEMENT_OBJECTIF:
				return getTraitementObjectif();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAVAIL_AIDE_DEPLOIEMENT:
				return getTravailAideDeploiement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARMEMENT_SYSTEME_ARME:
				return getTypeArmementSystemeArme();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_CAPTEUR:
				return getTypeCapteur();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_SYSTEME_ARME:
				return getTypeEquipementSystemeArme();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ITINERAIRE:
				return getTypeItineraire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION_SYSTEME_ARME:
				return getTypeMunitionSystemeArme();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_MILITAIRE_EXECUTIVE:
				return getTypeOrganisationMilitaireExecutive();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORTEUR:
				return getTypePorteur();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VARIANTE_TRAVAIL:
				return getVarianteTravail();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VEHICULE:
				return getVehicule();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VOL:
				return getVol();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_ALAT:
				return getZoneAlat();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_FONCTIONNELLE_LOGISTIQUE:
				return getZoneFonctionnelleLogistique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_LOGISTIQUE:
				return getZoneLogistique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_MISE_ATERRE:
				return getZoneMiseATerre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_RECHERCHE:
				return getZoneRecherche();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_ELECTRONIQUE:
				return getAdresseElectronique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_PHYSIQUE:
				return getAdressePhysique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_RADIO:
				return getAdresseRadio();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERODROME:
				return getAerodrome();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AIRE_STATIONNEMENT:
				return getAireStationnement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_MARINE:
				return getArticulationMarine();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_TERRE:
				return getArticulationTerre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ACTIVITE_CONTEXTE:
				return getAssocActiviteContexte();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_CONTEXTE:
				return getAssocContexteContexte();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_INSTANCE_OBJET:
				return getAssocContexteInstanceObjet();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTIVITE_CAPACITE:
				return getAssociationActiviteCapacite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_AFFILIATION:
				return getAssociationAffiliationAffiliation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				return getAssociationAffiliationInstanceObjet();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_TYPE:
				return getAssociationAffiliationType();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMATION:
				return getAssociationConsommation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONTEXTE_RAPPORT:
				return getAssociationContexteRapport();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DOCUMENT_CAPACITE:
				return getAssociationDocumentCapacite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				return getAssociationGroupeInfoOpsEntiteOrganisationnelle();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				return getAssociationInstanceObjetAdresse();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				return getAssociationInstanceObjetCapacite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return getAssociationObjectifCiblageObjectifCiblage();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				return getAssociationProfilDotationTheorique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_UNITE:
				return getAssociationProfilUnite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				return getAssociationRacineOperationnelleDocument();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TEMPORELLE_ACTIVITE:
				return getAssociationTemporelleActivite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TYPE_CAPACITE:
				return getAssociationTypeCapacite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				return getAssocListeObjCandListeObjCand();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_PISTE_ATTER_DIR_APP_AIR:
				return getAssocPisteAtterDirAppAir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ADRESSE:
				return getAutreAdresse();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ARTICULATION:
				return getAutreArticulation();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CONTEXTE:
				return getAutreContexte();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ELEMENT_CONTROLE:
				return getAutreElementControle();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT:
				return getAutreEvenement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NRBC:
				return getAutreEvenementNRBC();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_RADIOACTIF:
				return getAutreEvenementRadioactif();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_LISTE_OBJECTIFS:
				return getAutreListeObjectifs();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MATERIEL:
				return getAutreMateriel();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_NOM:
				return getAutreNom();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_OBSTACLE:
				return getAutreObstacle();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SEGMENT_ITINERAIRE:
				return getAutreSegmentItineraire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SITE:
				return getAutreSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_BATIMENT:
				return getAutreTypeBatiment();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE:
				return getAutreTypeConsommable();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ELEMENT_CONTROLE:
				return getAutreTypeElementControle();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ENTITE_ORGANISATIONNELLE:
				return getAutreTypeEntiteOrganisationnelle();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_EQUIPEMENT:
				return getAutreTypeEquipement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				return getAutreTypeOrganisationGouvernementale();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_SITE:
				return getAutreTypeSite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BASSIN:
				return getBassin();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BATIMENT:
				return getBatiment();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_LANCEMENT:
				return getCaleLancement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_SECHE:
				return getCaleSeche();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_FEUX:
				return getCapaciteFeux();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_GENIE:
				return getCapaciteGenie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MOBILITE:
				return getCapaciteMobilite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_STOCKAGE:
				return getCapaciteStockage();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SURVEILLANCE:
				return getCapaciteSurveillance();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_LOGISTIQUE:
				return getCaracteristiqueLogistique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_TRANSPORT:
				return getCaracteristiqueTransport();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_MARITIME:
				return getChampMinesMaritime();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_TERRESTRE:
				return getChampMinesTerrestre();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARNIER:
				return getCharnier();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHEMIN_FER:
				return getCheminFer();
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				return getCompositionDotationTheoriqueEnType();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONVOI:
				return getConvoi();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTION_APPROCHE_AIR:
				return getDirectionApprocheAir();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOCUMENT:
				return getDocument();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE:
				return getDotationTheorique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE_INSTANCE_OBJET:
				return getDotationTheoriqueInstanceObjet();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_TOPOGRAPHIE:
				return getElementTopographie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENTITE_POLITIQUE:
				return getEntitePolitique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_ARME_NUCLEAIRE:
				return getEvenementArmeNucleaire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE:
				return getEvenementChimiqueEtBiologique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RADIOLOGIQUE:
				return getEvenementRadiologique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_ETHNIQUE:
				return getGroupeEthnique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_FONCTIONNEL:
				return getGroupeFonctionnel();
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INDIVIDUS:
				return getGroupeIndividus();
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INFORMATIONS_OPERATIONNELLES:
				return getGroupeInformationsOperationnelles();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE:
				return getItineraire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__JETEE:
				return getJetee();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIMITE:
				return getLimite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_CANDIDATS:
				return getListeObjectifsCandidats();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURE_COORDINATION:
				return getMesureCoordination();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUILLAGE:
				return getMouillage();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_ACTIVITE:
				return getObjectifActivite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_CIBLAGE:
				return getObjectifCiblage();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERSONNE:
				return getPersonne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PISTE_ATTERRISSAGE:
				return getPisteAtterrissage();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_CONTROLE3_D:
				return getPointControle3D();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PONT:
				return getPont();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORT:
				return getPort();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_AMARRAGE:
				return getPosteAmarrage();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROFIL:
				return getProfil();
			case SchemaPackage.TYPE_MPGT_MESSAGE__QUAI_MARITIME:
				return getQuaiMaritime();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT:
				return getRapport();
			case SchemaPackage.TYPE_MPGT_MESSAGE__REGLE_ENGAGEMENT:
				return getRegleEngagement();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RELIGION:
				return getReligion();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESEAU_TELECOMMUNICATION:
				return getReseauTelecommunication();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE:
				return getRoute();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SEGMENT_ROUTE_AERIENNE:
				return getSegmentRouteAerienne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SERVICE_RESEAU:
				return getServiceReseau();
			case SchemaPackage.TYPE_MPGT_MESSAGE__STRUCTURE_ORGANISEE:
				return getStructureOrganisee();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRANCHE_METEO:
				return getTrancheMeteo();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERODROME:
				return getTypeAerodrome();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERONEF:
				return getTypeAeronef();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_BIOLOGIQUE:
				return getTypeAgentBiologique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_CHIMIQUE:
				return getTypeAgentChimique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_NUCLEAIRE:
				return getTypeAgentNucleaire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARME:
				return getTypeArme();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_BATIMENT_SURFACE:
				return getTypeBatimentSurface();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_ELECTRONIQUE:
				return getTypeEquipementElectronique();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_FERROVIAIRE:
				return getTypeEquipementFerroviaire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_GENIE:
				return getTypeEquipementGenie();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_MARITIME:
				return getTypeEquipementMaritime();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_NRBC:
				return getTypeEquipementNRBC();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_GROUPE_INDIVIDUS:
				return getTypeGroupeIndividus();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MESURE_COORDINATION:
				return getTypeMesureCoordination();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION:
				return getTypeMunition();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_OBSTACLE:
				return getTypeObstacle();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_PRIVEE:
				return getTypeOrganisationPrivee();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PERSONNE:
				return getTypePersonne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PONT:
				return getTypePont();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORT:
				return getTypePort();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_CIVIL:
				return getTypePosteCivil();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_MILITAIRE:
				return getTypePosteMilitaire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_REGROUPEMENT_FORCE:
				return getTypeRegroupementForce();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_SOUS_MARIN:
				return getTypeSousMarin();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_UNITE:
				return getTypeUnite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_VEHICULE:
				return getTypeVehicule();
			case SchemaPackage.TYPE_MPGT_MESSAGE__UNITE:
				return getUnite();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_AERIENNE:
				return getZoneAerienne();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BIBLIOTHEQUE:
				return getBibliotheque();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ANNEXE:
				return getTypeAnnexe();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_DQP:
				return getVersionDQP();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_GRAMMAIRE:
				return getVersionGrammaire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_MODELE:
				return getVersionModele();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_TYPE_ANNEXE:
				return getVersionTypeAnnexe();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTION_RENSEIGNEMENT:
				getActionRenseignement().clear();
				getActionRenseignement().addAll((Collection<? extends TypeActionRenseignement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTIVITE_POSTURE:
				getActivitePosture().clear();
				getActivitePosture().addAll((Collection<? extends TypeActivitePosture>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERONEF:
				getAeronef().clear();
				getAeronef().addAll((Collection<? extends TypeAeronef>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALERTE_FRAPPE_NUCLEAIRE_AMIE:
				getAlerteFrappeNucleaireAmie().clear();
				getAlerteFrappeNucleaireAmie().addAll((Collection<? extends TypeAlerteFrappeNucleaireAmie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALLURE:
				getAllure().clear();
				getAllure().addAll((Collection<? extends TypeAllure>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ANNULATION_INTERDICTION_TIR:
				getAnnulationInterdictionTir().clear();
				getAnnulationInterdictionTir().addAll((Collection<? extends TypeAnnulationInterdictionTir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__APPUI_FEU_HELICOPTERE:
				getAppuiFeuHelicoptere().clear();
				getAppuiFeuHelicoptere().addAll((Collection<? extends TypeAppuiFeuHelicoptere>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_ASS:
				getArticulationASS().clear();
				getArticulationASS().addAll((Collection<? extends TypeArticulationASS>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_LOGISTIQUE:
				getArticulationLogistique().clear();
				getArticulationLogistique().addAll((Collection<? extends TypeArticulationLogistique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				getAssocEntiteOrgTypeEntiteOrg().clear();
				getAssocEntiteOrgTypeEntiteOrg().addAll((Collection<? extends TypeAssocEntiteOrgTypeEntiteOrg>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_ACTION:
				getAssociationActionAction().clear();
				getAssociationActionAction().addAll((Collection<? extends TypeAssociationActionAction>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				getAssociationActionAutreEvenement().clear();
				getAssociationActionAutreEvenement().addAll((Collection<? extends TypeAssociationActionAutreEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_EVENEMENT_NRBC:
				getAssociationActionEvenementNRBC().clear();
				getAssociationActionEvenementNRBC().addAll((Collection<? extends TypeAssociationActionEvenementNRBC>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				getAssociationAutreEvenementAction().clear();
				getAssociationAutreEvenementAction().addAll((Collection<? extends TypeAssociationAutreEvenementAction>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				getAssociationAutreEvenementAutreEvenement().clear();
				getAssociationAutreEvenementAutreEvenement().addAll((Collection<? extends TypeAssociationAutreEvenementAutreEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				getAssociationAutreEvenementEvenementNRBC().clear();
				getAssociationAutreEvenementEvenementNRBC().addAll((Collection<? extends TypeAssociationAutreEvenementEvenementNRBC>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				getAssociationConflit3DMissionAerienne().clear();
				getAssociationConflit3DMissionAerienne().addAll((Collection<? extends TypeAssociationConflit3DMissionAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMABLEL_MAJEUR:
				getAssociationConsommablelMajeur().clear();
				getAssociationConsommablelMajeur().addAll((Collection<? extends TypeAssociationConsommablelMajeur>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				getAssociationConvoiMouvementParRoute().clear();
				getAssociationConvoiMouvementParRoute().addAll((Collection<? extends TypeAssociationConvoiMouvementParRoute>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				getAssociationDepEvacuationDepEvacuation().clear();
				getAssociationDepEvacuationDepEvacuation().addAll((Collection<? extends TypeAssociationDepEvacuationDepEvacuation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				getAssociationElementControleEvenement().clear();
				getAssociationElementControleEvenement().addAll((Collection<? extends TypeAssociationElementControleEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				getAssociationElementTopographieEvenement().clear();
				getAssociationElementTopographieEvenement().addAll((Collection<? extends TypeAssociationElementTopographieEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_CTRL:
				getAssociationEltCtrlEltCtrl().clear();
				getAssociationEltCtrlEltCtrl().addAll((Collection<? extends TypeAssociationEltCtrlEltCtrl>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_TOPO:
				getAssociationEltCtrlEltTopo().clear();
				getAssociationEltCtrlEltTopo().addAll((Collection<? extends TypeAssociationEltCtrlEltTopo>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_MATERIEL:
				getAssociationEltCtrlMateriel().clear();
				getAssociationEltCtrlMateriel().addAll((Collection<? extends TypeAssociationEltCtrlMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_SITE:
				getAssociationEltCtrlSite().clear();
				getAssociationEltCtrlSite().addAll((Collection<? extends TypeAssociationEltCtrlSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				getAssociationEltCtrlTypeEltCtrl().clear();
				getAssociationEltCtrlTypeEltCtrl().addAll((Collection<? extends TypeAssociationEltCtrlTypeEltCtrl>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_TOPO_SITE:
				getAssociationEltTopoSite().clear();
				getAssociationEltTopoSite().addAll((Collection<? extends TypeAssociationEltTopoSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ACTION:
				getAssociationEntiteOrgAction().clear();
				getAssociationEntiteOrgAction().addAll((Collection<? extends TypeAssociationEntiteOrgAction>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				getAssociationEntiteOrganisationnellePlanOuOrdre().clear();
				getAssociationEntiteOrganisationnellePlanOuOrdre().addAll((Collection<? extends TypeAssociationEntiteOrganisationnellePlanOuOrdre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				getAssociationEntiteOrgEltCtrl().clear();
				getAssociationEntiteOrgEltCtrl().addAll((Collection<? extends TypeAssociationEntiteOrgEltCtrl>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				getAssociationEntiteOrgEltTopo().clear();
				getAssociationEntiteOrgEltTopo().addAll((Collection<? extends TypeAssociationEntiteOrgEltTopo>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				getAssociationEntiteOrgEntiteOrg().clear();
				getAssociationEntiteOrgEntiteOrg().addAll((Collection<? extends TypeAssociationEntiteOrgEntiteOrg>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_EVENEMENT:
				getAssociationEntiteOrgEvenement().clear();
				getAssociationEntiteOrgEvenement().addAll((Collection<? extends TypeAssociationEntiteOrgEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_MATERIEL:
				getAssociationEntiteOrgMateriel().clear();
				getAssociationEntiteOrgMateriel().addAll((Collection<? extends TypeAssociationEntiteOrgMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				getAssociationEntiteOrgObjetInconnu().clear();
				getAssociationEntiteOrgObjetInconnu().addAll((Collection<? extends TypeAssociationEntiteOrgObjetInconnu>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_PERSONNE:
				getAssociationEntiteOrgPersonne().clear();
				getAssociationEntiteOrgPersonne().addAll((Collection<? extends TypeAssociationEntiteOrgPersonne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_SITE:
				getAssociationEntiteOrgSite().clear();
				getAssociationEntiteOrgSite().addAll((Collection<? extends TypeAssociationEntiteOrgSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EQUIPEMENTL_MAJEUR:
				getAssociationEquipementlMajeur().clear();
				getAssociationEquipementlMajeur().addAll((Collection<? extends TypeAssociationEquipementlMajeur>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_ACTION:
				getAssociationEvenementNRBCAction().clear();
				getAssociationEvenementNRBCAction().addAll((Collection<? extends TypeAssociationEvenementNRBCAction>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				getAssociationEvenementNRBCAutreEvenement().clear();
				getAssociationEvenementNRBCAutreEvenement().addAll((Collection<? extends TypeAssociationEvenementNRBCAutreEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				getAssociationEvenementNRBCEvenementNRBC().clear();
				getAssociationEvenementNRBCEvenementNRBC().addAll((Collection<? extends TypeAssociationEvenementNRBCEvenementNRBC>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				getAssociationEvenementRENSAutreEvenement().clear();
				getAssociationEvenementRENSAutreEvenement().addAll((Collection<? extends TypeAssociationEvenementRENSAutreEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				getAssociationEvenementRENSEvenementRENS().clear();
				getAssociationEvenementRENSEvenementRENS().addAll((Collection<? extends TypeAssociationEvenementRENSEvenementRENS>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				getAssociationGroupeInfoOpsPlanOuOrdre().clear();
				getAssociationGroupeInfoOpsPlanOuOrdre().addAll((Collection<? extends TypeAssociationGroupeInfoOpsPlanOuOrdre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_HORAIRE_MANOEUVRE:
				getAssociationHoraireManoeuvre().clear();
				getAssociationHoraireManoeuvre().addAll((Collection<? extends TypeAssociationHoraireManoeuvre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_LIVRAISON_LIVAISON:
				getAssociationLivraisonLivaison().clear();
				getAssociationLivraisonLivaison().addAll((Collection<? extends TypeAssociationLivraisonLivaison>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_CTRL:
				getAssociationMaterielEltCtrl().clear();
				getAssociationMaterielEltCtrl().addAll((Collection<? extends TypeAssociationMaterielEltCtrl>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_TOPO:
				getAssociationMaterielEltTopo().clear();
				getAssociationMaterielEltTopo().addAll((Collection<? extends TypeAssociationMaterielEltTopo>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_EVENEMENT:
				getAssociationMaterielEvenement().clear();
				getAssociationMaterielEvenement().addAll((Collection<? extends TypeAssociationMaterielEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_MATERIEL:
				getAssociationMaterielMateriel().clear();
				getAssociationMaterielMateriel().addAll((Collection<? extends TypeAssociationMaterielMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_METEOROLOGIE:
				getAssociationMaterielMeteorologie().clear();
				getAssociationMaterielMeteorologie().addAll((Collection<? extends TypeAssociationMaterielMeteorologie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_OBJET_INCONNU:
				getAssociationMaterielObjetInconnu().clear();
				getAssociationMaterielObjetInconnu().addAll((Collection<? extends TypeAssociationMaterielObjetInconnu>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_PERSONNE:
				getAssociationMaterielPersonne().clear();
				getAssociationMaterielPersonne().addAll((Collection<? extends TypeAssociationMaterielPersonne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_SITE:
				getAssociationMaterielSite().clear();
				getAssociationMaterielSite().addAll((Collection<? extends TypeAssociationMaterielSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				getAssociationMaterielTypeMateriel().clear();
				getAssociationMaterielTypeMateriel().addAll((Collection<? extends TypeAssociationMaterielTypeMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				getAssociationMesureCoordinationPlanFeux().clear();
				getAssociationMesureCoordinationPlanFeux().addAll((Collection<? extends TypeAssociationMesureCoordinationPlanFeux>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				getAssociationMesureCoordMissionAerienne().clear();
				getAssociationMesureCoordMissionAerienne().addAll((Collection<? extends TypeAssociationMesureCoordMissionAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_METEOROLOGIE_SITE:
				getAssociationMeteorologieSite().clear();
				getAssociationMeteorologieSite().addAll((Collection<? extends TypeAssociationMeteorologieSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				getAssociationMissionAerienneMissionAerienne().clear();
				getAssociationMissionAerienneMissionAerienne().addAll((Collection<? extends TypeAssociationMissionAerienneMissionAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				getAssociationMissionGenieMissionGenie().clear();
				getAssociationMissionGenieMissionGenie().addAll((Collection<? extends TypeAssociationMissionGenieMissionGenie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MELEE_ACTION:
				getAssociationMissionMeleeAction().clear();
				getAssociationMissionMeleeAction().addAll((Collection<? extends TypeAssociationMissionMeleeAction>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				getAssociationMissionMouvementMissionMouvement().clear();
				getAssociationMissionMouvementMissionMouvement().addAll((Collection<? extends TypeAssociationMissionMouvementMissionMouvement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				getAssociationMissionRenseignementAction().clear();
				getAssociationMissionRenseignementAction().addAll((Collection<? extends TypeAssociationMissionRenseignementAction>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				getAssociationMissionRensObjPlanTraitementObj().clear();
				getAssociationMissionRensObjPlanTraitementObj().addAll((Collection<? extends TypeAssociationMissionRensObjPlanTraitementObj>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				getAssociationMissionRensObjTraitementObj().clear();
				getAssociationMissionRensObjTraitementObj().addAll((Collection<? extends TypeAssociationMissionRensObjTraitementObj>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				getAssociationMouvementParRouteMouvementParRoute().clear();
				getAssociationMouvementParRouteMouvementParRoute().addAll((Collection<? extends TypeAssociationMouvementParRouteMouvementParRoute>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				getAssociationObjectifCiblageDocument().clear();
				getAssociationObjectifCiblageDocument().addAll((Collection<? extends TypeAssociationObjectifCiblageDocument>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				getAssociationObjetInconnuEltCtrl().clear();
				getAssociationObjetInconnuEltCtrl().addAll((Collection<? extends TypeAssociationObjetInconnuEltCtrl>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				getAssociationObjetInconnuEltTopo().clear();
				getAssociationObjetInconnuEltTopo().addAll((Collection<? extends TypeAssociationObjetInconnuEltTopo>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_SITE:
				getAssociationObjetInconnuSite().clear();
				getAssociationObjetInconnuSite().addAll((Collection<? extends TypeAssociationObjetInconnuSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBSERVATION_OBSERVATION:
				getAssociationObservationObservation().clear();
				getAssociationObservationObservation().addAll((Collection<? extends TypeAssociationObservationObservation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				getAssociationParagraphePOparagraphePO().clear();
				getAssociationParagraphePOparagraphePO().addAll((Collection<? extends TypeAssociationParagraphePOparagraphePO>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_CTRL:
				getAssociationPersonneEltCtrl().clear();
				getAssociationPersonneEltCtrl().addAll((Collection<? extends TypeAssociationPersonneEltCtrl>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_TOPO:
				getAssociationPersonneEltTopo().clear();
				getAssociationPersonneEltTopo().addAll((Collection<? extends TypeAssociationPersonneEltTopo>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_EVENEMENT:
				getAssociationPersonneEvenement().clear();
				getAssociationPersonneEvenement().addAll((Collection<? extends TypeAssociationPersonneEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MATERIEL:
				getAssociationPersonneMateriel().clear();
				getAssociationPersonneMateriel().addAll((Collection<? extends TypeAssociationPersonneMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MISSION_AIR:
				getAssociationPersonneMissionAir().clear();
				getAssociationPersonneMissionAir().addAll((Collection<? extends TypeAssociationPersonneMissionAir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_OBJET_INCONNU:
				getAssociationPersonneObjetInconnu().clear();
				getAssociationPersonneObjetInconnu().addAll((Collection<? extends TypeAssociationPersonneObjetInconnu>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PERSONNE:
				getAssociationPersonnePersonne().clear();
				getAssociationPersonnePersonne().addAll((Collection<? extends TypeAssociationPersonnePersonne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				getAssociationPersonnePlanifOperation3D().clear();
				getAssociationPersonnePlanifOperation3D().addAll((Collection<? extends TypeAssociationPersonnePlanifOperation3D>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_SITE:
				getAssociationPersonneSite().clear();
				getAssociationPersonneSite().addAll((Collection<? extends TypeAssociationPersonneSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				getAssociationPersonneTypePersonne().clear();
				getAssociationPersonneTypePersonne().addAll((Collection<? extends TypeAssociationPersonneTypePersonne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				getAssociationPlanificationOperation3DMissionAir().clear();
				getAssociationPlanificationOperation3DMissionAir().addAll((Collection<? extends TypeAssociationPlanificationOperation3DMissionAir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				getAssociationPlanificationOperation3DMissionASA().clear();
				getAssociationPlanificationOperation3DMissionASA().addAll((Collection<? extends TypeAssociationPlanificationOperation3DMissionASA>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				getAssociationPlanOuOrdrePlanOuOrdre().clear();
				getAssociationPlanOuOrdrePlanOuOrdre().addAll((Collection<? extends TypeAssociationPlanOuOrdrePlanOuOrdre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				getAssociationPlanTraitementObjTraitementObj().clear();
				getAssociationPlanTraitementObjTraitementObj().addAll((Collection<? extends TypeAssociationPlanTraitementObjTraitementObj>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				getAssociationRenseignementObjMisRenseignementObj().clear();
				getAssociationRenseignementObjMisRenseignementObj().addAll((Collection<? extends TypeAssociationRenseignementObjMisRenseignementObj>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_CTRL:
				getAssociationSiteEltCtrl().clear();
				getAssociationSiteEltCtrl().addAll((Collection<? extends TypeAssociationSiteEltCtrl>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_TOPO:
				getAssociationSiteEltTopo().clear();
				getAssociationSiteEltTopo().addAll((Collection<? extends TypeAssociationSiteEltTopo>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_EVENEMENT:
				getAssociationSiteEvenement().clear();
				getAssociationSiteEvenement().addAll((Collection<? extends TypeAssociationSiteEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_MATERIEL:
				getAssociationSiteMateriel().clear();
				getAssociationSiteMateriel().addAll((Collection<? extends TypeAssociationSiteMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_METEOROLOGIE:
				getAssociationSiteMeteorologie().clear();
				getAssociationSiteMeteorologie().addAll((Collection<? extends TypeAssociationSiteMeteorologie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_OBJET_INCONNU:
				getAssociationSiteObjetInconnu().clear();
				getAssociationSiteObjetInconnu().addAll((Collection<? extends TypeAssociationSiteObjetInconnu>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_SITE:
				getAssociationSiteSite().clear();
				getAssociationSiteSite().addAll((Collection<? extends TypeAssociationSiteSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_TYPE_SITE:
				getAssociationSiteTypeSite().clear();
				getAssociationSiteTypeSite().addAll((Collection<? extends TypeAssociationSiteTypeSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				getAssociationSyntheseDetectionsEvenementNRBC().clear();
				getAssociationSyntheseDetectionsEvenementNRBC().addAll((Collection<? extends TypeAssociationSyntheseDetectionsEvenementNRBC>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				getAssociationTraitementObjPlanTraitementObj().clear();
				getAssociationTraitementObjPlanTraitementObj().addAll((Collection<? extends TypeAssociationTraitementObjPlanTraitementObj>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				getAssociationUniteAppuiFeuHelicoptere().clear();
				getAssociationUniteAppuiFeuHelicoptere().addAll((Collection<? extends TypeAssociationUniteAppuiFeuHelicoptere>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				getAssociationUniteAutreMissionLog().clear();
				getAssociationUniteAutreMissionLog().addAll((Collection<? extends TypeAssociationUniteAutreMissionLog>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_LIVRAISON:
				getAssociationUniteLivraison().clear();
				getAssociationUniteLivraison().addAll((Collection<? extends TypeAssociationUniteLivraison>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				getAssociationUniteMissionAcqASS().clear();
				getAssociationUniteMissionAcqASS().addAll((Collection<? extends TypeAssociationUniteMissionAcqASS>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AERIENNE:
				getAssociationUniteMissionAerienne().clear();
				getAssociationUniteMissionAerienne().addAll((Collection<? extends TypeAssociationUniteMissionAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AIR:
				getAssociationUniteMissionAir().clear();
				getAssociationUniteMissionAir().addAll((Collection<? extends TypeAssociationUniteMissionAir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				getAssociationUniteMissionALATattaque().clear();
				getAssociationUniteMissionALATattaque().addAll((Collection<? extends TypeAssociationUniteMissionALATattaque>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ASA:
				getAssociationUniteMissionASA().clear();
				getAssociationUniteMissionASA().addAll((Collection<? extends TypeAssociationUniteMissionASA>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				getAssociationUniteMissionEscorteAF().clear();
				getAssociationUniteMissionEscorteAF().addAll((Collection<? extends TypeAssociationUniteMissionEscorteAF>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_GENIE:
				getAssociationUniteMissionGenie().clear();
				getAssociationUniteMissionGenie().addAll((Collection<? extends TypeAssociationUniteMissionGenie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_MELEE:
				getAssociationUniteMissionMelee().clear();
				getAssociationUniteMissionMelee().addAll((Collection<? extends TypeAssociationUniteMissionMelee>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				getAssociationUniteMissionRensObj().clear();
				getAssociationUniteMissionRensObj().addAll((Collection<? extends TypeAssociationUniteMissionRensObj>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_SIC:
				getAssociationUniteMissionSic().clear();
				getAssociationUniteMissionSic().addAll((Collection<? extends TypeAssociationUniteMissionSic>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				getAssociationUniteMissionTranspTact().clear();
				getAssociationUniteMissionTranspTact().addAll((Collection<? extends TypeAssociationUniteMissionTranspTact>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				getAssociationUniteMissionUniteAntichar().clear();
				getAssociationUniteMissionUniteAntichar().addAll((Collection<? extends TypeAssociationUniteMissionUniteAntichar>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				getAssociationUniteMouvementParRoute().clear();
				getAssociationUniteMouvementParRoute().addAll((Collection<? extends TypeAssociationUniteMouvementParRoute>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLAN_FEUX:
				getAssociationUnitePlanFeux().clear();
				getAssociationUnitePlanFeux().addAll((Collection<? extends TypeAssociationUnitePlanFeux>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				getAssociationUnitePlanifOperation3D().clear();
				getAssociationUnitePlanifOperation3D().addAll((Collection<? extends TypeAssociationUnitePlanifOperation3D>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				getAssociationUniteRenforcementsFeux().clear();
				getAssociationUniteRenforcementsFeux().addAll((Collection<? extends TypeAssociationUniteRenforcementsFeux>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_SYMBOLE_TACTIQUE:
				getAssocSymboleTactique().clear();
				getAssocSymboleTactique().addAll((Collection<? extends TypeAssocSymboleTactique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ACTION:
				getAutreAction().clear();
				getAutreAction().addAll((Collection<? extends TypeAutreAction>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_AFFILIATION:
				getAutreAffiliation().clear();
				getAutreAffiliation().addAll((Collection<? extends TypeAutreAffiliation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CAPTEUR_RENS:
				getAutreCapteurRENS().clear();
				getAutreCapteurRENS().addAll((Collection<? extends TypeAutreCapteurRENS>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NUCLEAIRE:
				getAutreEvenementNucleaire().clear();
				getAutreEvenementNucleaire().addAll((Collection<? extends TypeAutreEvenementNucleaire>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MENACE:
				getAutreMenace().clear();
				getAutreMenace().addAll((Collection<? extends TypeAutreMenace>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION:
				getAutreMission().clear();
				getAutreMission().addAll((Collection<? extends TypeAutreMission>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_ALAT:
				getAutreMissionALAT().clear();
				getAutreMissionALAT().addAll((Collection<? extends TypeAutreMissionALAT>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_LOGISTIQUE:
				getAutreMissionLogistique().clear();
				getAutreMissionLogistique().addAll((Collection<? extends TypeAutreMissionLogistique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE_SYSTEME_ARME:
				getAutreTypeConsommableSystemeArme().clear();
				getAutreTypeConsommableSystemeArme().addAll((Collection<? extends TypeAutreTypeConsommableSystemeArme>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BESOINS_EN_RENSEIGNEMENTS:
				getBesoinsEnRenseignements().clear();
				getBesoinsEnRenseignements().addAll((Collection<? extends TypeBesoinsEnRenseignements>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BILAN_TIRS_ASS:
				getBilanTirsASS().clear();
				getBilanTirsASS().addAll((Collection<? extends TypeBilanTirsASS>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BRANCHE_NAVIGATION:
				getBrancheNavigation().clear();
				getBrancheNavigation().addAll((Collection<? extends TypeBrancheNavigation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BULLETIN_SONDAGE:
				getBulletinSondage().clear();
				getBulletinSondage().addAll((Collection<? extends TypeBulletinSondage>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_HEBERGEMENT:
				getCapaciteHebergement().clear();
				getCapaciteHebergement().addAll((Collection<? extends TypeCapaciteHebergement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MAINTENANCE:
				getCapaciteMaintenance().clear();
				getCapaciteMaintenance().addAll((Collection<? extends TypeCapaciteMaintenance>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MANUTENTION:
				getCapaciteManutention().clear();
				getCapaciteManutention().addAll((Collection<? extends TypeCapaciteManutention>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_OPERATIONNELLE:
				getCapaciteOperationnelle().clear();
				getCapaciteOperationnelle().addAll((Collection<? extends TypeCapaciteOperationnelle>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SOUTIEN:
				getCapaciteSoutien().clear();
				getCapaciteSoutien().addAll((Collection<? extends TypeCapaciteSoutien>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_TRANSMISSION:
				getCapaciteTransmission().clear();
				getCapaciteTransmission().addAll((Collection<? extends TypeCapaciteTransmission>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_DRONE:
				getCapteurDrone().clear();
				getCapteurDrone().addAll((Collection<? extends TypeCapteurDrone>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_LOCALISATION_RADIOELECTRIQUE:
				getCapteurLocalisationRadioelectrique().clear();
				getCapteurLocalisationRadioelectrique().addAll((Collection<? extends TypeCapteurLocalisationRadioelectrique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_RADAR:
				getCapteurRadar().clear();
				getCapteurRadar().addAll((Collection<? extends TypeCapteurRadar>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_ROHUM:
				getCapteurROHUM().clear();
				getCapteurROHUM().addAll((Collection<? extends TypeCapteurROHUM>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARNET_POINTS:
				getCarnetPoints().clear();
				getCarnetPoints().addAll((Collection<? extends TypeCarnetPoints>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARGEMENT_MATERIEL:
				getChargementMateriel().clear();
				getChargementMateriel().addAll((Collection<? extends TypeChargementMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPTE_RENDU_TIR:
				getCompteRenduTir().clear();
				getCompteRenduTir().addAll((Collection<? extends TypeCompteRenduTir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONFLIT3_D:
				getConflit3D().clear();
				getConflit3D().addAll((Collection<? extends TypeConflit3D>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE:
				getConsigne().clear();
				getConsigne().addAll((Collection<? extends TypeConsigne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_LUTTE_ANTIAERIENNE_TTA:
				getConsigneLutteAntiaerienneTTA().clear();
				getConsigneLutteAntiaerienneTTA().addAll((Collection<? extends TypeConsigneLutteAntiaerienneTTA>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_TIR:
				getConsigneTir().clear();
				getConsigneTir().addAll((Collection<? extends TypeConsigneTir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_AERIENNE:
				getCouvertureAerienne().clear();
				getCouvertureAerienne().addAll((Collection<? extends TypeCouvertureAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_ASA:
				getCouvertureASA().clear();
				getCouvertureASA().addAll((Collection<? extends TypeCouvertureASA>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEGRE_CLASSIFICATION:
				getDegreClassification().clear();
				getDegreClassification().addAll((Collection<? extends TypeDegreClassification>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEMANDE_TIR:
				getDemandeTir().clear();
				getDemandeTir().addAll((Collection<? extends TypeDemandeTir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPANNAGE_EVACUATION:
				getDepannageEvacuation().clear();
				getDepannageEvacuation().addAll((Collection<? extends TypeDepannageEvacuation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MARTHA:
				getDeploiementMARTHA().clear();
				getDeploiementMARTHA().addAll((Collection<? extends TypeDeploiementMARTHA>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MOYENS_AS_AC3D:
				getDeploiementMoyensASAc3d().clear();
				getDeploiementMoyensASAc3d().addAll((Collection<? extends TypeDeploiementMoyensASAc3d>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_IDENTIFIE:
				getDetachementIdentifie().clear();
				getDetachementIdentifie().addAll((Collection<? extends TypeDetachementIdentifie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_NON_IDENTIFIE:
				getDetachementNonIdentifie().clear();
				getDetachementNonIdentifie().addAll((Collection<? extends TypeDetachementNonIdentifie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTIVE_TIR:
				getDirectiveTir().clear();
				getDirectiveTir().addAll((Collection<? extends TypeDirectiveTir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ECHELON:
				getEchelon().clear();
				getEchelon().addAll((Collection<? extends TypeEchelon>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_METEO:
				getElementMeteo().clear();
				getElementMeteo().addAll((Collection<? extends TypeElementMeteo>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENNEMI_FUTUR:
				getEnnemiFutur().clear();
				getEnnemiFutur().addAll((Collection<? extends TypeEnnemiFutur>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				getEnTeteParagraphePlanOuOrdre().clear();
				getEnTeteParagraphePlanOuOrdre().addAll((Collection<? extends TypeEnTeteParagraphePlanOuOrdre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ETUDE_DISPERSION:
				getEtudeDispersion().clear();
				getEtudeDispersion().addAll((Collection<? extends TypeEtudeDispersion>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RENS:
				getEvenementRENS().clear();
				getEvenementRENS().addAll((Collection<? extends TypeEvenementRENS>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__FAIT_RENSEIGNEMENT:
				getFaitRenseignement().clear();
				getFaitRenseignement().addAll((Collection<? extends TypeFaitRenseignement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__HORAIRE_MANOEUVRE:
				getHoraireManoeuvre().clear();
				getHoraireManoeuvre().addAll((Collection<? extends TypeHoraireManoeuvre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__HYPOTHESE_ACTION_EN_IOU_AUTRE:
				getHypotheseActionENIouAutre().clear();
				getHypotheseActionENIouAutre().addAll((Collection<? extends TypeHypotheseActionENIouAutre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__INDICATEUR_GEOSTATISTIQUE:
				getIndicateurGeostatistique().clear();
				getIndicateurGeostatistique().addAll((Collection<? extends TypeIndicateurGeostatistique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERDICTION_TIR:
				getInterdictionTir().clear();
				getInterdictionTir().addAll((Collection<? extends TypeInterdictionTir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_GENERALE:
				getInterventionGenerale().clear();
				getInterventionGenerale().addAll((Collection<? extends TypeInterventionGenerale>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_TYPE:
				getInterventionType().clear();
				getInterventionType().addAll((Collection<? extends TypeInterventionType>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				getItineraireOuModeleCheminementALAT().clear();
				getItineraireOuModeleCheminementALAT().addAll((Collection<? extends TypeItineraireOuModeleCheminementALAT>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__JONCTION_RESEAU:
				getJonctionReseau().clear();
				getJonctionReseau().addAll((Collection<? extends TypeJonctionReseau>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIAISON_RESEAU:
				getLiaisonReseau().clear();
				getLiaisonReseau().addAll((Collection<? extends TypeLiaisonReseau>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIGNE_LIVRAISON:
				getLigneLivraison().clear();
				getLigneLivraison().addAll((Collection<? extends TypeLigneLivraison>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_MESURES_COORDINATION3_D:
				getListeMesuresCoordination3D().clear();
				getListeMesuresCoordination3D().addAll((Collection<? extends TypeListeMesuresCoordination3D>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_PLANIFIES:
				getListeObjectifsPlanifies().clear();
				getListeObjectifsPlanifies().addAll((Collection<? extends TypeListeObjectifsPlanifies>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIVRAISON:
				getLivraison().clear();
				getLivraison().addAll((Collection<? extends TypeLivraison>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MEMENTO_GENIE:
				getMementoGenie().clear();
				getMementoGenie().addAll((Collection<? extends TypeMementoGenie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AERIENNE:
				getMenaceAerienne().clear();
				getMenaceAerienne().addAll((Collection<? extends TypeMenaceAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AS_AENI:
				getMenaceASAeni().clear();
				getMenaceASAeni().addAll((Collection<? extends TypeMenaceASAeni>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_DETECTION:
				getMenaceDetection().clear();
				getMenaceDetection().addAll((Collection<? extends TypeMenaceDetection>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_FEUX_ENI:
				getMenaceFeuxENI().clear();
				getMenaceFeuxENI().addAll((Collection<? extends TypeMenaceFeuxENI>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_GENIE_ENI:
				getMenaceGenieENI().clear();
				getMenaceGenieENI().addAll((Collection<? extends TypeMenaceGenieENI>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACES_AERIENNES_MISSION_ALAT:
				getMenacesAeriennesMissionALAT().clear();
				getMenacesAeriennesMissionALAT().addAll((Collection<? extends TypeMenacesAeriennesMissionALAT>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURES_PROTECTION_ELECTRONIQUE:
				getMesuresProtectionElectronique().clear();
				getMesuresProtectionElectronique().addAll((Collection<? extends TypeMesuresProtectionElectronique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISE_EN_OEUVRE_ROE:
				getMiseEnOeuvreROE().clear();
				getMiseEnOeuvreROE().addAll((Collection<? extends TypeMiseEnOeuvreROE>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ACQUISITION_ASS:
				getMissionAcquisitionASS().clear();
				getMissionAcquisitionASS().addAll((Collection<? extends TypeMissionAcquisitionASS>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AERIENNE:
				getMissionAerienne().clear();
				getMissionAerienne().addAll((Collection<? extends TypeMissionAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AIR:
				getMissionAir().clear();
				getMissionAir().addAll((Collection<? extends TypeMissionAir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ALA_TATTAQUE:
				getMissionALATattaque().clear();
				getMissionALATattaque().addAll((Collection<? extends TypeMissionALATattaque>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ASA:
				getMissionASA().clear();
				getMissionASA().addAll((Collection<? extends TypeMissionASA>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ESCORTE_OU_APPUI_FEU:
				getMissionEscorteOuAppuiFeu().clear();
				getMissionEscorteOuAppuiFeu().addAll((Collection<? extends TypeMissionEscorteOuAppuiFeu>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_FEUX:
				getMissionFeux().clear();
				getMissionFeux().addAll((Collection<? extends TypeMissionFeux>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_GENIE:
				getMissionGenie().clear();
				getMissionGenie().addAll((Collection<? extends TypeMissionGenie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_I3D:
				getMissionI3D().clear();
				getMissionI3D().addAll((Collection<? extends TypeMissionI3D>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MAINTENANCE:
				getMissionMaintenance().clear();
				getMissionMaintenance().addAll((Collection<? extends TypeMissionMaintenance>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MELEE:
				getMissionMelee().clear();
				getMissionMelee().addAll((Collection<? extends TypeMissionMelee>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MOUVEMENT:
				getMissionMouvement().clear();
				getMissionMouvement().addAll((Collection<? extends TypeMissionMouvement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RAVITAILLEMENT:
				getMissionRavitaillement().clear();
				getMissionRavitaillement().addAll((Collection<? extends TypeMissionRavitaillement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT:
				getMissionRenseignement().clear();
				getMissionRenseignement().addAll((Collection<? extends TypeMissionRenseignement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT_OBJECTIF:
				getMissionRenseignementObjectif().clear();
				getMissionRenseignementObjectif().addAll((Collection<? extends TypeMissionRenseignementObjectif>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SAR_COMBAT:
				getMissionSarCombat().clear();
				getMissionSarCombat().addAll((Collection<? extends TypeMissionSarCombat>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SIC:
				getMissionSic().clear();
				getMissionSic().addAll((Collection<? extends TypeMissionSic>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_TRANSPORT_TACTIQUE:
				getMissionTransportTactique().clear();
				getMissionTransportTactique().addAll((Collection<? extends TypeMissionTransportTactique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_UNITE_ANTICHAR:
				getMissionUniteAntichar().clear();
				getMissionUniteAntichar().addAll((Collection<? extends TypeMissionUniteAntichar>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MODULE:
				getModule().clear();
				getModule().addAll((Collection<? extends TypeModule>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUVEMENT_PAR_ROUTE:
				getMouvementParRoute().clear();
				getMouvementParRoute().addAll((Collection<? extends TypeMouvementParRoute>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_AERIENS_DONT_BENEFICIE_GU:
				getMoyensAeriensDontBeneficieGU().clear();
				getMoyensAeriensDontBeneficieGU().addAll((Collection<? extends TypeMoyensAeriensDontBeneficieGU>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_GENIE:
				getMoyensGenie().clear();
				getMoyensGenie().addAll((Collection<? extends TypeMoyensGenie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_INCONNU:
				getObjetInconnu().clear();
				getObjetInconnu().addAll((Collection<? extends TypeObjetInconnu>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_LIBRE:
				getObjetLibre().clear();
				getObjetLibre().addAll((Collection<? extends TypeObjetLibre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBSERVATION:
				getObservation().clear();
				getObservation().addAll((Collection<? extends TypeObservation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORDRE:
				getOrdre().clear();
				getOrdre().addAll((Collection<? extends TypeOrdre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORGANISATION_SOUTIEN_MEDICAL:
				getOrganisationSoutienMedical().clear();
				getOrganisationSoutienMedical().addAll((Collection<? extends TypeOrganisationSoutienMedical>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OUVRAGE_GENIE:
				getOuvrageGenie().clear();
				getOuvrageGenie().addAll((Collection<? extends TypeOuvrageGenie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OVERLAY:
				getOverlay().clear();
				getOverlay().addAll((Collection<? extends TypeOverlay>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PARAGRAPHE_PLAN_OU_ORDRE:
				getParagraphePlanOuOrdre().clear();
				getParagraphePlanOuOrdre().addAll((Collection<? extends TypeParagraphePlanOuOrdre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERTES_SANTE:
				getPertesSante().clear();
				getPertesSante().addAll((Collection<? extends TypePertesSante>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PION_RESEAU:
				getPionReseau().clear();
				getPionReseau().addAll((Collection<? extends TypePionReseau>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN:
				getPlan().clear();
				getPlan().addAll((Collection<? extends TypePlan>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_FEUX:
				getPlanFeux().clear();
				getPlanFeux().addAll((Collection<? extends TypePlanFeux>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_CELLULE_SOUTIEN:
				getPlanificationCelluleSoutien().clear();
				getPlanificationCelluleSoutien().addAll((Collection<? extends TypePlanificationCelluleSoutien>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_MOUVEMENT:
				getPlanificationMouvement().clear();
				getPlanificationMouvement().addAll((Collection<? extends TypePlanificationMouvement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_OPERATION3_D:
				getPlanificationOperation3D().clear();
				getPlanificationOperation3D().addAll((Collection<? extends TypePlanificationOperation3D>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_NUMEROTATION_OBJECTIFS:
				getPlanNumerotationObjectifs().clear();
				getPlanNumerotationObjectifs().addAll((Collection<? extends TypePlanNumerotationObjectifs>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_TRAITEMENT_OBJECTIFS:
				getPlanTraitementObjectifs().clear();
				getPlanTraitementObjectifs().addAll((Collection<? extends TypePlanTraitementObjectifs>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_AXE:
				getPointAxe().clear();
				getPointAxe().addAll((Collection<? extends TypePointAxe>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_HAUT:
				getPointHaut().clear();
				getPointHaut().addAll((Collection<? extends TypePointHaut>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_TRAJECTOIRE:
				getPointTrajectoire().clear();
				getPointTrajectoire().addAll((Collection<? extends TypePointTrajectoire>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POLITIQUE_TIR:
				getPolitiqueTir().clear();
				getPolitiqueTir().addAll((Collection<? extends TypePolitiqueTir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORTEUR_SYSTEME_ARME:
				getPorteurSystemeArme().clear();
				getPorteurSystemeArme().addAll((Collection<? extends TypePorteurSystemeArme>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSSIBILITES_ENI_3D:
				getPossibilitesENI3d().clear();
				getPossibilitesENI3d().addAll((Collection<? extends TypePossibilitesENI3d>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_TIR:
				getPosteTir().clear();
				getPosteTir().addAll((Collection<? extends TypePosteTir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POTENTIEL_EN_IFEU_SOL_SOL:
				getPotentielENIfeuSolSol().clear();
				getPotentielENIfeuSolSol().addAll((Collection<? extends TypePotentielENIfeuSolSol>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_IDENTIFIE:
				getPrelevementSubordonneIdentifie().clear();
				getPrelevementSubordonneIdentifie().addAll((Collection<? extends TypePrelevementSubordonneIdentifie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				getPrelevementSubordonneNonIdentifie().clear();
				getPrelevementSubordonneNonIdentifie().addAll((Collection<? extends TypePrelevementSubordonneNonIdentifie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PREVISION_OBSERVATION:
				getPrevisionObservation().clear();
				getPrevisionObservation().addAll((Collection<? extends TypePrevisionObservation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TACTIQUE:
				getPrioriteTactique().clear();
				getPrioriteTactique().addAll((Collection<? extends TypePrioriteTactique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TECHNIQUE:
				getPrioriteTechnique().clear();
				getPrioriteTechnique().addAll((Collection<? extends TypePrioriteTechnique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROCEDURE_IFF:
				getProcedureIFF().clear();
				getProcedureIFF().addAll((Collection<? extends TypeProcedureIFF>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROJET_CIMIC:
				getProjetCimic().clear();
				getProjetCimic().addAll((Collection<? extends TypeProjetCimic>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAID_AERIEN_ENNEMI:
				getRaidAerienEnnemi().clear();
				getRaidAerienEnnemi().addAll((Collection<? extends TypeRaidAerienEnnemi>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT_FORCE:
				getRapportForce().clear();
				getRapportForce().addAll((Collection<? extends TypeRapportForce>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RATTACHEMENT_LOGISTIQUE_PARTICULIER:
				getRattachementLogistiqueParticulier().clear();
				getRattachementLogistiqueParticulier().addAll((Collection<? extends TypeRattachementLogistiqueParticulier>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAVITAILLEMENT:
				getRavitaillement().clear();
				getRavitaillement().addAll((Collection<? extends TypeRavitaillement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RECHANGE:
				getRechange().clear();
				getRechange().addAll((Collection<? extends TypeRechange>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENFORCEMENTS_FEUX:
				getRenforcementsFeux().clear();
				getRenforcementsFeux().addAll((Collection<? extends TypeRenforcementsFeux>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENSEIGNEMENT_OBJECTIF:
				getRenseignementObjectif().clear();
				getRenseignementObjectif().addAll((Collection<? extends TypeRenseignementObjectif>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESERVATION_UNITE:
				getReservationUnite().clear();
				getReservationUnite().addAll((Collection<? extends TypeReservationUnite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE_HELICOPTERE_ALAT:
				getRouteHelicoptereALAT().clear();
				getRouteHelicoptereALAT().addAll((Collection<? extends TypeRouteHelicoptereALAT>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_CONSOMMABLE:
				getSituationConsommable().clear();
				getSituationConsommable().addAll((Collection<? extends TypeSituationConsommable>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EFFECTIF:
				getSituationEffectif().clear();
				getSituationEffectif().addAll((Collection<? extends TypeSituationEffectif>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EQUIPEMENT:
				getSituationEquipement().clear();
				getSituationEquipement().addAll((Collection<? extends TypeSituationEquipement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_RADIATION:
				getSituationRadiation().clear();
				getSituationRadiation().addAll((Collection<? extends TypeSituationRadiation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_VEHICULE:
				getSituationVehicule().clear();
				getSituationVehicule().addAll((Collection<? extends TypeSituationVehicule>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_ANNOTATION:
				getSymboleAnnotation().clear();
				getSymboleAnnotation().addAll((Collection<? extends TypeSymboleAnnotation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_CERCLE:
				getSymboleCercle().clear();
				getSymboleCercle().addAll((Collection<? extends TypeSymboleCercle>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_FLECHE:
				getSymboleFleche().clear();
				getSymboleFleche().addAll((Collection<? extends TypeSymboleFleche>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_IMAGE:
				getSymboleImage().clear();
				getSymboleImage().addAll((Collection<? extends TypeSymboleImage>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_LINEIQUE:
				getSymboleLineique().clear();
				getSymboleLineique().addAll((Collection<? extends TypeSymboleLineique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_NOTE:
				getSymboleNote().clear();
				getSymboleNote().addAll((Collection<? extends TypeSymboleNote>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POINT:
				getSymbolePoint().clear();
				getSymbolePoint().addAll((Collection<? extends TypeSymbolePoint>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POST_IT:
				getSymbolePostIt().clear();
				getSymbolePostIt().addAll((Collection<? extends TypeSymbolePostIt>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TACTIQUE:
				getSymboleTactique().clear();
				getSymboleTactique().addAll((Collection<? extends TypeSymboleTactique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TEXTE:
				getSymboleTexte().clear();
				getSymboleTexte().addAll((Collection<? extends TypeSymboleTexte>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYNTHESE_DETECTIONS:
				getSyntheseDetections().clear();
				getSyntheseDetections().addAll((Collection<? extends TypeSyntheseDetections>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS:
				getSystemeAtterrissageAuxInstruments().clear();
				getSystemeAtterrissageAuxInstruments().addAll((Collection<? extends TypeSystemeAtterrissageAuxInstruments>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAITEMENT_OBJECTIF:
				getTraitementObjectif().clear();
				getTraitementObjectif().addAll((Collection<? extends TypeTraitementObjectif>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAVAIL_AIDE_DEPLOIEMENT:
				getTravailAideDeploiement().clear();
				getTravailAideDeploiement().addAll((Collection<? extends TypeTravailAideDeploiement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARMEMENT_SYSTEME_ARME:
				getTypeArmementSystemeArme().clear();
				getTypeArmementSystemeArme().addAll((Collection<? extends TypeTypeArmementSystemeArme>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_CAPTEUR:
				getTypeCapteur().clear();
				getTypeCapteur().addAll((Collection<? extends TypeTypeCapteur>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_SYSTEME_ARME:
				getTypeEquipementSystemeArme().clear();
				getTypeEquipementSystemeArme().addAll((Collection<? extends TypeTypeEquipementSystemeArme>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ITINERAIRE:
				getTypeItineraire().clear();
				getTypeItineraire().addAll((Collection<? extends TypeTypeItineraire>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION_SYSTEME_ARME:
				getTypeMunitionSystemeArme().clear();
				getTypeMunitionSystemeArme().addAll((Collection<? extends TypeTypeMunitionSystemeArme>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_MILITAIRE_EXECUTIVE:
				getTypeOrganisationMilitaireExecutive().clear();
				getTypeOrganisationMilitaireExecutive().addAll((Collection<? extends TypeTypeOrganisationMilitaireExecutive>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORTEUR:
				getTypePorteur().clear();
				getTypePorteur().addAll((Collection<? extends TypeTypePorteur>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VARIANTE_TRAVAIL:
				getVarianteTravail().clear();
				getVarianteTravail().addAll((Collection<? extends TypeVarianteTravail>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VEHICULE:
				getVehicule().clear();
				getVehicule().addAll((Collection<? extends TypeVehicule>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VOL:
				getVol().clear();
				getVol().addAll((Collection<? extends TypeVol>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_ALAT:
				getZoneAlat().clear();
				getZoneAlat().addAll((Collection<? extends TypeZoneAlat>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_FONCTIONNELLE_LOGISTIQUE:
				getZoneFonctionnelleLogistique().clear();
				getZoneFonctionnelleLogistique().addAll((Collection<? extends TypeZoneFonctionnelleLogistique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_LOGISTIQUE:
				getZoneLogistique().clear();
				getZoneLogistique().addAll((Collection<? extends TypeZoneLogistique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_MISE_ATERRE:
				getZoneMiseATerre().clear();
				getZoneMiseATerre().addAll((Collection<? extends TypeZoneMiseATerre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_RECHERCHE:
				getZoneRecherche().clear();
				getZoneRecherche().addAll((Collection<? extends TypeZoneRecherche>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_ELECTRONIQUE:
				getAdresseElectronique().clear();
				getAdresseElectronique().addAll((Collection<? extends TypeAdresseElectronique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_PHYSIQUE:
				getAdressePhysique().clear();
				getAdressePhysique().addAll((Collection<? extends TypeAdressePhysique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_RADIO:
				getAdresseRadio().clear();
				getAdresseRadio().addAll((Collection<? extends TypeAdresseRadio>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERODROME:
				getAerodrome().clear();
				getAerodrome().addAll((Collection<? extends TypeAerodrome>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AIRE_STATIONNEMENT:
				getAireStationnement().clear();
				getAireStationnement().addAll((Collection<? extends TypeAireStationnement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_MARINE:
				getArticulationMarine().clear();
				getArticulationMarine().addAll((Collection<? extends TypeArticulationMarine>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_TERRE:
				getArticulationTerre().clear();
				getArticulationTerre().addAll((Collection<? extends TypeArticulationTerre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ACTIVITE_CONTEXTE:
				getAssocActiviteContexte().clear();
				getAssocActiviteContexte().addAll((Collection<? extends TypeAssocActiviteContexte>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_CONTEXTE:
				getAssocContexteContexte().clear();
				getAssocContexteContexte().addAll((Collection<? extends TypeAssocContexteContexte>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_INSTANCE_OBJET:
				getAssocContexteInstanceObjet().clear();
				getAssocContexteInstanceObjet().addAll((Collection<? extends TypeAssocContexteInstanceObjet>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTIVITE_CAPACITE:
				getAssociationActiviteCapacite().clear();
				getAssociationActiviteCapacite().addAll((Collection<? extends TypeAssociationActiviteCapacite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_AFFILIATION:
				getAssociationAffiliationAffiliation().clear();
				getAssociationAffiliationAffiliation().addAll((Collection<? extends TypeAssociationAffiliationAffiliation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				getAssociationAffiliationInstanceObjet().clear();
				getAssociationAffiliationInstanceObjet().addAll((Collection<? extends TypeAssociationAffiliationInstanceObjet>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_TYPE:
				getAssociationAffiliationType().clear();
				getAssociationAffiliationType().addAll((Collection<? extends TypeAssociationAffiliationType>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMATION:
				getAssociationConsommation().clear();
				getAssociationConsommation().addAll((Collection<? extends TypeAssociationConsommation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONTEXTE_RAPPORT:
				getAssociationContexteRapport().clear();
				getAssociationContexteRapport().addAll((Collection<? extends TypeAssociationContexteRapport>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DOCUMENT_CAPACITE:
				getAssociationDocumentCapacite().clear();
				getAssociationDocumentCapacite().addAll((Collection<? extends TypeAssociationDocumentCapacite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				getAssociationGroupeInfoOpsEntiteOrganisationnelle().clear();
				getAssociationGroupeInfoOpsEntiteOrganisationnelle().addAll((Collection<? extends TypeAssociationGroupeInfoOpsEntiteOrganisationnelle>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				getAssociationInstanceObjetAdresse().clear();
				getAssociationInstanceObjetAdresse().addAll((Collection<? extends TypeAssociationInstanceObjetAdresse>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				getAssociationInstanceObjetCapacite().clear();
				getAssociationInstanceObjetCapacite().addAll((Collection<? extends TypeAssociationInstanceObjetCapacite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getAssociationObjectifCiblageObjectifCiblage().clear();
				getAssociationObjectifCiblageObjectifCiblage().addAll((Collection<? extends TypeAssociationObjectifCiblageObjectifCiblage>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				getAssociationProfilDotationTheorique().clear();
				getAssociationProfilDotationTheorique().addAll((Collection<? extends TypeAssociationProfilDotationTheorique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_UNITE:
				getAssociationProfilUnite().clear();
				getAssociationProfilUnite().addAll((Collection<? extends TypeAssociationProfilUnite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				getAssociationRacineOperationnelleDocument().clear();
				getAssociationRacineOperationnelleDocument().addAll((Collection<? extends TypeAssociationRacineOperationnelleDocument>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TEMPORELLE_ACTIVITE:
				getAssociationTemporelleActivite().clear();
				getAssociationTemporelleActivite().addAll((Collection<? extends TypeAssociationTemporelleActivite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TYPE_CAPACITE:
				getAssociationTypeCapacite().clear();
				getAssociationTypeCapacite().addAll((Collection<? extends TypeAssociationTypeCapacite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				getAssocListeObjCandListeObjCand().clear();
				getAssocListeObjCandListeObjCand().addAll((Collection<? extends TypeAssocListeObjCandListeObjCand>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_PISTE_ATTER_DIR_APP_AIR:
				getAssocPisteAtterDirAppAir().clear();
				getAssocPisteAtterDirAppAir().addAll((Collection<? extends TypeAssocPisteAtterDirAppAir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ADRESSE:
				getAutreAdresse().clear();
				getAutreAdresse().addAll((Collection<? extends TypeAutreAdresse>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ARTICULATION:
				getAutreArticulation().clear();
				getAutreArticulation().addAll((Collection<? extends TypeAutreArticulation>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CONTEXTE:
				getAutreContexte().clear();
				getAutreContexte().addAll((Collection<? extends TypeAutreContexte>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ELEMENT_CONTROLE:
				getAutreElementControle().clear();
				getAutreElementControle().addAll((Collection<? extends TypeAutreElementControle>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT:
				getAutreEvenement().clear();
				getAutreEvenement().addAll((Collection<? extends TypeAutreEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NRBC:
				getAutreEvenementNRBC().clear();
				getAutreEvenementNRBC().addAll((Collection<? extends TypeAutreEvenementNRBC>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_RADIOACTIF:
				getAutreEvenementRadioactif().clear();
				getAutreEvenementRadioactif().addAll((Collection<? extends TypeAutreEvenementRadioactif>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_LISTE_OBJECTIFS:
				getAutreListeObjectifs().clear();
				getAutreListeObjectifs().addAll((Collection<? extends TypeAutreListeObjectifs>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MATERIEL:
				getAutreMateriel().clear();
				getAutreMateriel().addAll((Collection<? extends TypeAutreMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_NOM:
				getAutreNom().clear();
				getAutreNom().addAll((Collection<? extends TypeAutreNom>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_OBSTACLE:
				getAutreObstacle().clear();
				getAutreObstacle().addAll((Collection<? extends TypeAutreObstacle>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SEGMENT_ITINERAIRE:
				getAutreSegmentItineraire().clear();
				getAutreSegmentItineraire().addAll((Collection<? extends TypeAutreSegmentItineraire>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SITE:
				getAutreSite().clear();
				getAutreSite().addAll((Collection<? extends TypeAutreSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_BATIMENT:
				getAutreTypeBatiment().clear();
				getAutreTypeBatiment().addAll((Collection<? extends TypeAutreTypeBatiment>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE:
				getAutreTypeConsommable().clear();
				getAutreTypeConsommable().addAll((Collection<? extends TypeAutreTypeConsommable>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ELEMENT_CONTROLE:
				getAutreTypeElementControle().clear();
				getAutreTypeElementControle().addAll((Collection<? extends TypeAutreTypeElementControle>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ENTITE_ORGANISATIONNELLE:
				getAutreTypeEntiteOrganisationnelle().clear();
				getAutreTypeEntiteOrganisationnelle().addAll((Collection<? extends TypeAutreTypeEntiteOrganisationnelle>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_EQUIPEMENT:
				getAutreTypeEquipement().clear();
				getAutreTypeEquipement().addAll((Collection<? extends TypeAutreTypeEquipement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				getAutreTypeOrganisationGouvernementale().clear();
				getAutreTypeOrganisationGouvernementale().addAll((Collection<? extends TypeAutreTypeOrganisationGouvernementale>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_SITE:
				getAutreTypeSite().clear();
				getAutreTypeSite().addAll((Collection<? extends TypeAutreTypeSite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BASSIN:
				getBassin().clear();
				getBassin().addAll((Collection<? extends TypeBassin>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BATIMENT:
				getBatiment().clear();
				getBatiment().addAll((Collection<? extends TypeBatiment>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_LANCEMENT:
				getCaleLancement().clear();
				getCaleLancement().addAll((Collection<? extends TypeCaleLancement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_SECHE:
				getCaleSeche().clear();
				getCaleSeche().addAll((Collection<? extends TypeCaleSeche>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_FEUX:
				getCapaciteFeux().clear();
				getCapaciteFeux().addAll((Collection<? extends TypeCapaciteFeux>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_GENIE:
				getCapaciteGenie().clear();
				getCapaciteGenie().addAll((Collection<? extends TypeCapaciteGenie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MOBILITE:
				getCapaciteMobilite().clear();
				getCapaciteMobilite().addAll((Collection<? extends TypeCapaciteMobilite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_STOCKAGE:
				getCapaciteStockage().clear();
				getCapaciteStockage().addAll((Collection<? extends TypeCapaciteStockage>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SURVEILLANCE:
				getCapaciteSurveillance().clear();
				getCapaciteSurveillance().addAll((Collection<? extends TypeCapaciteSurveillance>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_LOGISTIQUE:
				getCaracteristiqueLogistique().clear();
				getCaracteristiqueLogistique().addAll((Collection<? extends TypeCaracteristiqueLogistique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_TRANSPORT:
				getCaracteristiqueTransport().clear();
				getCaracteristiqueTransport().addAll((Collection<? extends TypeCaracteristiqueTransport>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_MARITIME:
				getChampMinesMaritime().clear();
				getChampMinesMaritime().addAll((Collection<? extends TypeChampMinesMaritime>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_TERRESTRE:
				getChampMinesTerrestre().clear();
				getChampMinesTerrestre().addAll((Collection<? extends TypeChampMinesTerrestre>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARNIER:
				getCharnier().clear();
				getCharnier().addAll((Collection<? extends TypeCharnier>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHEMIN_FER:
				getCheminFer().clear();
				getCheminFer().addAll((Collection<? extends TypeCheminFer>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				getCompositionDotationTheoriqueEnType().clear();
				getCompositionDotationTheoriqueEnType().addAll((Collection<? extends TypeCompositionDotationTheoriqueEnType>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONVOI:
				getConvoi().clear();
				getConvoi().addAll((Collection<? extends TypeConvoi>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTION_APPROCHE_AIR:
				getDirectionApprocheAir().clear();
				getDirectionApprocheAir().addAll((Collection<? extends TypeDirectionApprocheAir>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection<? extends TypeDocument>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE:
				getDotationTheorique().clear();
				getDotationTheorique().addAll((Collection<? extends TypeDotationTheorique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE_INSTANCE_OBJET:
				getDotationTheoriqueInstanceObjet().clear();
				getDotationTheoriqueInstanceObjet().addAll((Collection<? extends TypeDotationTheoriqueInstanceObjet>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_TOPOGRAPHIE:
				getElementTopographie().clear();
				getElementTopographie().addAll((Collection<? extends TypeElementTopographie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENTITE_POLITIQUE:
				getEntitePolitique().clear();
				getEntitePolitique().addAll((Collection<? extends TypeEntitePolitique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_ARME_NUCLEAIRE:
				getEvenementArmeNucleaire().clear();
				getEvenementArmeNucleaire().addAll((Collection<? extends TypeEvenementArmeNucleaire>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE:
				getEvenementChimiqueEtBiologique().clear();
				getEvenementChimiqueEtBiologique().addAll((Collection<? extends TypeEvenementChimiqueEtBiologique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RADIOLOGIQUE:
				getEvenementRadiologique().clear();
				getEvenementRadiologique().addAll((Collection<? extends TypeEvenementRadiologique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_ETHNIQUE:
				getGroupeEthnique().clear();
				getGroupeEthnique().addAll((Collection<? extends TypeGroupeEthnique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_FONCTIONNEL:
				getGroupeFonctionnel().clear();
				getGroupeFonctionnel().addAll((Collection<? extends TypeGroupeFonctionnel>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INDIVIDUS:
				getGroupeIndividus().clear();
				getGroupeIndividus().addAll((Collection<? extends TypeGroupeIndividus>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INFORMATIONS_OPERATIONNELLES:
				getGroupeInformationsOperationnelles().clear();
				getGroupeInformationsOperationnelles().addAll((Collection<? extends TypeGroupeInformationsOperationnelles>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE:
				getItineraire().clear();
				getItineraire().addAll((Collection<? extends TypeItineraire>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__JETEE:
				getJetee().clear();
				getJetee().addAll((Collection<? extends TypeJetee>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIMITE:
				getLimite().clear();
				getLimite().addAll((Collection<? extends TypeLimite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_CANDIDATS:
				getListeObjectifsCandidats().clear();
				getListeObjectifsCandidats().addAll((Collection<? extends TypeListeObjectifsCandidats>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURE_COORDINATION:
				getMesureCoordination().clear();
				getMesureCoordination().addAll((Collection<? extends TypeMesureCoordination>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUILLAGE:
				getMouillage().clear();
				getMouillage().addAll((Collection<? extends TypeMouillage>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_ACTIVITE:
				getObjectifActivite().clear();
				getObjectifActivite().addAll((Collection<? extends TypeObjectifActivite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_CIBLAGE:
				getObjectifCiblage().clear();
				getObjectifCiblage().addAll((Collection<? extends TypeObjectifCiblage>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERSONNE:
				getPersonne().clear();
				getPersonne().addAll((Collection<? extends TypePersonne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PISTE_ATTERRISSAGE:
				getPisteAtterrissage().clear();
				getPisteAtterrissage().addAll((Collection<? extends TypePisteAtterrissage>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_CONTROLE3_D:
				getPointControle3D().clear();
				getPointControle3D().addAll((Collection<? extends TypePointControle3D>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PONT:
				getPont().clear();
				getPont().addAll((Collection<? extends TypePont>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends TypePort>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_AMARRAGE:
				getPosteAmarrage().clear();
				getPosteAmarrage().addAll((Collection<? extends TypePosteAmarrage>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROFIL:
				getProfil().clear();
				getProfil().addAll((Collection<? extends TypeProfil>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__QUAI_MARITIME:
				getQuaiMaritime().clear();
				getQuaiMaritime().addAll((Collection<? extends TypeQuaiMaritime>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT:
				getRapport().clear();
				getRapport().addAll((Collection<? extends TypeRapport>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__REGLE_ENGAGEMENT:
				getRegleEngagement().clear();
				getRegleEngagement().addAll((Collection<? extends TypeRegleEngagement>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RELIGION:
				getReligion().clear();
				getReligion().addAll((Collection<? extends TypeReligion>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESEAU_TELECOMMUNICATION:
				getReseauTelecommunication().clear();
				getReseauTelecommunication().addAll((Collection<? extends TypeReseauTelecommunication>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends TypeRoute>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SEGMENT_ROUTE_AERIENNE:
				getSegmentRouteAerienne().clear();
				getSegmentRouteAerienne().addAll((Collection<? extends TypeSegmentRouteAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SERVICE_RESEAU:
				getServiceReseau().clear();
				getServiceReseau().addAll((Collection<? extends TypeServiceReseau>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__STRUCTURE_ORGANISEE:
				getStructureOrganisee().clear();
				getStructureOrganisee().addAll((Collection<? extends TypeStructureOrganisee>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRANCHE_METEO:
				getTrancheMeteo().clear();
				getTrancheMeteo().addAll((Collection<? extends TypeTrancheMeteo>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERODROME:
				getTypeAerodrome().clear();
				getTypeAerodrome().addAll((Collection<? extends TypeTypeAerodrome>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERONEF:
				getTypeAeronef().clear();
				getTypeAeronef().addAll((Collection<? extends TypeTypeAeronef>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_BIOLOGIQUE:
				getTypeAgentBiologique().clear();
				getTypeAgentBiologique().addAll((Collection<? extends TypeTypeAgentBiologique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_CHIMIQUE:
				getTypeAgentChimique().clear();
				getTypeAgentChimique().addAll((Collection<? extends TypeTypeAgentChimique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_NUCLEAIRE:
				getTypeAgentNucleaire().clear();
				getTypeAgentNucleaire().addAll((Collection<? extends TypeTypeAgentNucleaire>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARME:
				getTypeArme().clear();
				getTypeArme().addAll((Collection<? extends TypeTypeArme>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_BATIMENT_SURFACE:
				getTypeBatimentSurface().clear();
				getTypeBatimentSurface().addAll((Collection<? extends TypeTypeBatimentSurface>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_ELECTRONIQUE:
				getTypeEquipementElectronique().clear();
				getTypeEquipementElectronique().addAll((Collection<? extends TypeTypeEquipementElectronique>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_FERROVIAIRE:
				getTypeEquipementFerroviaire().clear();
				getTypeEquipementFerroviaire().addAll((Collection<? extends TypeTypeEquipementFerroviaire>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_GENIE:
				getTypeEquipementGenie().clear();
				getTypeEquipementGenie().addAll((Collection<? extends TypeTypeEquipementGenie>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_MARITIME:
				getTypeEquipementMaritime().clear();
				getTypeEquipementMaritime().addAll((Collection<? extends TypeTypeEquipementMaritime>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_NRBC:
				getTypeEquipementNRBC().clear();
				getTypeEquipementNRBC().addAll((Collection<? extends TypeTypeEquipementNRBC>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_GROUPE_INDIVIDUS:
				getTypeGroupeIndividus().clear();
				getTypeGroupeIndividus().addAll((Collection<? extends TypeTypeGroupeIndividus>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MESURE_COORDINATION:
				getTypeMesureCoordination().clear();
				getTypeMesureCoordination().addAll((Collection<? extends TypeTypeMesureCoordination>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION:
				getTypeMunition().clear();
				getTypeMunition().addAll((Collection<? extends TypeTypeMunition>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_OBSTACLE:
				getTypeObstacle().clear();
				getTypeObstacle().addAll((Collection<? extends TypeTypeObstacle>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_PRIVEE:
				getTypeOrganisationPrivee().clear();
				getTypeOrganisationPrivee().addAll((Collection<? extends TypeTypeOrganisationPrivee>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PERSONNE:
				getTypePersonne().clear();
				getTypePersonne().addAll((Collection<? extends TypeTypePersonne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PONT:
				getTypePont().clear();
				getTypePont().addAll((Collection<? extends TypeTypePont>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORT:
				getTypePort().clear();
				getTypePort().addAll((Collection<? extends TypeTypePort>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_CIVIL:
				getTypePosteCivil().clear();
				getTypePosteCivil().addAll((Collection<? extends TypeTypePosteCivil>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_MILITAIRE:
				getTypePosteMilitaire().clear();
				getTypePosteMilitaire().addAll((Collection<? extends TypeTypePosteMilitaire>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_REGROUPEMENT_FORCE:
				getTypeRegroupementForce().clear();
				getTypeRegroupementForce().addAll((Collection<? extends TypeTypeRegroupementForce>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_SOUS_MARIN:
				getTypeSousMarin().clear();
				getTypeSousMarin().addAll((Collection<? extends TypeTypeSousMarin>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_UNITE:
				getTypeUnite().clear();
				getTypeUnite().addAll((Collection<? extends TypeTypeUnite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_VEHICULE:
				getTypeVehicule().clear();
				getTypeVehicule().addAll((Collection<? extends TypeTypeVehicule>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__UNITE:
				getUnite().clear();
				getUnite().addAll((Collection<? extends TypeUnite>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_AERIENNE:
				getZoneAerienne().clear();
				getZoneAerienne().addAll((Collection<? extends TypeZoneAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BIBLIOTHEQUE:
				setBibliotheque((String)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ANNEXE:
				setTypeAnnexe((String)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_DQP:
				setVersionDQP((String)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_GRAMMAIRE:
				setVersionGrammaire((String)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_MODELE:
				setVersionModele((String)newValue);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_TYPE_ANNEXE:
				setVersionTypeAnnexe((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUP:
				getGroup().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTION_RENSEIGNEMENT:
				getActionRenseignement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTIVITE_POSTURE:
				getActivitePosture().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERONEF:
				getAeronef().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALERTE_FRAPPE_NUCLEAIRE_AMIE:
				getAlerteFrappeNucleaireAmie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALLURE:
				getAllure().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ANNULATION_INTERDICTION_TIR:
				getAnnulationInterdictionTir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__APPUI_FEU_HELICOPTERE:
				getAppuiFeuHelicoptere().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_ASS:
				getArticulationASS().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_LOGISTIQUE:
				getArticulationLogistique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				getAssocEntiteOrgTypeEntiteOrg().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_ACTION:
				getAssociationActionAction().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				getAssociationActionAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_EVENEMENT_NRBC:
				getAssociationActionEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				getAssociationAutreEvenementAction().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				getAssociationAutreEvenementAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				getAssociationAutreEvenementEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				getAssociationConflit3DMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMABLEL_MAJEUR:
				getAssociationConsommablelMajeur().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				getAssociationConvoiMouvementParRoute().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				getAssociationDepEvacuationDepEvacuation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				getAssociationElementControleEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				getAssociationElementTopographieEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_CTRL:
				getAssociationEltCtrlEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_TOPO:
				getAssociationEltCtrlEltTopo().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_MATERIEL:
				getAssociationEltCtrlMateriel().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_SITE:
				getAssociationEltCtrlSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				getAssociationEltCtrlTypeEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_TOPO_SITE:
				getAssociationEltTopoSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ACTION:
				getAssociationEntiteOrgAction().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				getAssociationEntiteOrganisationnellePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				getAssociationEntiteOrgEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				getAssociationEntiteOrgEltTopo().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				getAssociationEntiteOrgEntiteOrg().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_EVENEMENT:
				getAssociationEntiteOrgEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_MATERIEL:
				getAssociationEntiteOrgMateriel().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				getAssociationEntiteOrgObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_PERSONNE:
				getAssociationEntiteOrgPersonne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_SITE:
				getAssociationEntiteOrgSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EQUIPEMENTL_MAJEUR:
				getAssociationEquipementlMajeur().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_ACTION:
				getAssociationEvenementNRBCAction().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				getAssociationEvenementNRBCAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				getAssociationEvenementNRBCEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				getAssociationEvenementRENSAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				getAssociationEvenementRENSEvenementRENS().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				getAssociationGroupeInfoOpsPlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_HORAIRE_MANOEUVRE:
				getAssociationHoraireManoeuvre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_LIVRAISON_LIVAISON:
				getAssociationLivraisonLivaison().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_CTRL:
				getAssociationMaterielEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_TOPO:
				getAssociationMaterielEltTopo().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_EVENEMENT:
				getAssociationMaterielEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_MATERIEL:
				getAssociationMaterielMateriel().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_METEOROLOGIE:
				getAssociationMaterielMeteorologie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_OBJET_INCONNU:
				getAssociationMaterielObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_PERSONNE:
				getAssociationMaterielPersonne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_SITE:
				getAssociationMaterielSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				getAssociationMaterielTypeMateriel().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				getAssociationMesureCoordinationPlanFeux().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				getAssociationMesureCoordMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_METEOROLOGIE_SITE:
				getAssociationMeteorologieSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				getAssociationMissionAerienneMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				getAssociationMissionGenieMissionGenie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MELEE_ACTION:
				getAssociationMissionMeleeAction().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				getAssociationMissionMouvementMissionMouvement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				getAssociationMissionRenseignementAction().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				getAssociationMissionRensObjPlanTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				getAssociationMissionRensObjTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				getAssociationMouvementParRouteMouvementParRoute().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				getAssociationObjectifCiblageDocument().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				getAssociationObjetInconnuEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				getAssociationObjetInconnuEltTopo().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_SITE:
				getAssociationObjetInconnuSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBSERVATION_OBSERVATION:
				getAssociationObservationObservation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				getAssociationParagraphePOparagraphePO().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_CTRL:
				getAssociationPersonneEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_TOPO:
				getAssociationPersonneEltTopo().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_EVENEMENT:
				getAssociationPersonneEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MATERIEL:
				getAssociationPersonneMateriel().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MISSION_AIR:
				getAssociationPersonneMissionAir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_OBJET_INCONNU:
				getAssociationPersonneObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PERSONNE:
				getAssociationPersonnePersonne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				getAssociationPersonnePlanifOperation3D().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_SITE:
				getAssociationPersonneSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				getAssociationPersonneTypePersonne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				getAssociationPlanificationOperation3DMissionAir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				getAssociationPlanificationOperation3DMissionASA().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				getAssociationPlanOuOrdrePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				getAssociationPlanTraitementObjTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				getAssociationRenseignementObjMisRenseignementObj().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_CTRL:
				getAssociationSiteEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_TOPO:
				getAssociationSiteEltTopo().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_EVENEMENT:
				getAssociationSiteEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_MATERIEL:
				getAssociationSiteMateriel().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_METEOROLOGIE:
				getAssociationSiteMeteorologie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_OBJET_INCONNU:
				getAssociationSiteObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_SITE:
				getAssociationSiteSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_TYPE_SITE:
				getAssociationSiteTypeSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				getAssociationSyntheseDetectionsEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				getAssociationTraitementObjPlanTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				getAssociationUniteAppuiFeuHelicoptere().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				getAssociationUniteAutreMissionLog().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_LIVRAISON:
				getAssociationUniteLivraison().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				getAssociationUniteMissionAcqASS().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AERIENNE:
				getAssociationUniteMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AIR:
				getAssociationUniteMissionAir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				getAssociationUniteMissionALATattaque().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ASA:
				getAssociationUniteMissionASA().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				getAssociationUniteMissionEscorteAF().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_GENIE:
				getAssociationUniteMissionGenie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_MELEE:
				getAssociationUniteMissionMelee().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				getAssociationUniteMissionRensObj().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_SIC:
				getAssociationUniteMissionSic().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				getAssociationUniteMissionTranspTact().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				getAssociationUniteMissionUniteAntichar().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				getAssociationUniteMouvementParRoute().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLAN_FEUX:
				getAssociationUnitePlanFeux().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				getAssociationUnitePlanifOperation3D().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				getAssociationUniteRenforcementsFeux().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_SYMBOLE_TACTIQUE:
				getAssocSymboleTactique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ACTION:
				getAutreAction().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_AFFILIATION:
				getAutreAffiliation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CAPTEUR_RENS:
				getAutreCapteurRENS().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NUCLEAIRE:
				getAutreEvenementNucleaire().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MENACE:
				getAutreMenace().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION:
				getAutreMission().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_ALAT:
				getAutreMissionALAT().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_LOGISTIQUE:
				getAutreMissionLogistique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE_SYSTEME_ARME:
				getAutreTypeConsommableSystemeArme().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BESOINS_EN_RENSEIGNEMENTS:
				getBesoinsEnRenseignements().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BILAN_TIRS_ASS:
				getBilanTirsASS().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BRANCHE_NAVIGATION:
				getBrancheNavigation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BULLETIN_SONDAGE:
				getBulletinSondage().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_HEBERGEMENT:
				getCapaciteHebergement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MAINTENANCE:
				getCapaciteMaintenance().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MANUTENTION:
				getCapaciteManutention().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_OPERATIONNELLE:
				getCapaciteOperationnelle().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SOUTIEN:
				getCapaciteSoutien().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_TRANSMISSION:
				getCapaciteTransmission().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_DRONE:
				getCapteurDrone().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_LOCALISATION_RADIOELECTRIQUE:
				getCapteurLocalisationRadioelectrique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_RADAR:
				getCapteurRadar().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_ROHUM:
				getCapteurROHUM().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARNET_POINTS:
				getCarnetPoints().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARGEMENT_MATERIEL:
				getChargementMateriel().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPTE_RENDU_TIR:
				getCompteRenduTir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONFLIT3_D:
				getConflit3D().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE:
				getConsigne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_LUTTE_ANTIAERIENNE_TTA:
				getConsigneLutteAntiaerienneTTA().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_TIR:
				getConsigneTir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_AERIENNE:
				getCouvertureAerienne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_ASA:
				getCouvertureASA().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEGRE_CLASSIFICATION:
				getDegreClassification().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEMANDE_TIR:
				getDemandeTir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPANNAGE_EVACUATION:
				getDepannageEvacuation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MARTHA:
				getDeploiementMARTHA().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MOYENS_AS_AC3D:
				getDeploiementMoyensASAc3d().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_IDENTIFIE:
				getDetachementIdentifie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_NON_IDENTIFIE:
				getDetachementNonIdentifie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTIVE_TIR:
				getDirectiveTir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ECHELON:
				getEchelon().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_METEO:
				getElementMeteo().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENNEMI_FUTUR:
				getEnnemiFutur().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				getEnTeteParagraphePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ETUDE_DISPERSION:
				getEtudeDispersion().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RENS:
				getEvenementRENS().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__FAIT_RENSEIGNEMENT:
				getFaitRenseignement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__HORAIRE_MANOEUVRE:
				getHoraireManoeuvre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__HYPOTHESE_ACTION_EN_IOU_AUTRE:
				getHypotheseActionENIouAutre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__INDICATEUR_GEOSTATISTIQUE:
				getIndicateurGeostatistique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERDICTION_TIR:
				getInterdictionTir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_GENERALE:
				getInterventionGenerale().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_TYPE:
				getInterventionType().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				getItineraireOuModeleCheminementALAT().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__JONCTION_RESEAU:
				getJonctionReseau().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIAISON_RESEAU:
				getLiaisonReseau().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIGNE_LIVRAISON:
				getLigneLivraison().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_MESURES_COORDINATION3_D:
				getListeMesuresCoordination3D().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_PLANIFIES:
				getListeObjectifsPlanifies().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIVRAISON:
				getLivraison().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MEMENTO_GENIE:
				getMementoGenie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AERIENNE:
				getMenaceAerienne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AS_AENI:
				getMenaceASAeni().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_DETECTION:
				getMenaceDetection().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_FEUX_ENI:
				getMenaceFeuxENI().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_GENIE_ENI:
				getMenaceGenieENI().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACES_AERIENNES_MISSION_ALAT:
				getMenacesAeriennesMissionALAT().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURES_PROTECTION_ELECTRONIQUE:
				getMesuresProtectionElectronique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISE_EN_OEUVRE_ROE:
				getMiseEnOeuvreROE().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ACQUISITION_ASS:
				getMissionAcquisitionASS().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AERIENNE:
				getMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AIR:
				getMissionAir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ALA_TATTAQUE:
				getMissionALATattaque().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ASA:
				getMissionASA().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ESCORTE_OU_APPUI_FEU:
				getMissionEscorteOuAppuiFeu().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_FEUX:
				getMissionFeux().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_GENIE:
				getMissionGenie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_I3D:
				getMissionI3D().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MAINTENANCE:
				getMissionMaintenance().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MELEE:
				getMissionMelee().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MOUVEMENT:
				getMissionMouvement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RAVITAILLEMENT:
				getMissionRavitaillement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT:
				getMissionRenseignement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT_OBJECTIF:
				getMissionRenseignementObjectif().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SAR_COMBAT:
				getMissionSarCombat().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SIC:
				getMissionSic().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_TRANSPORT_TACTIQUE:
				getMissionTransportTactique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_UNITE_ANTICHAR:
				getMissionUniteAntichar().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MODULE:
				getModule().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUVEMENT_PAR_ROUTE:
				getMouvementParRoute().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_AERIENS_DONT_BENEFICIE_GU:
				getMoyensAeriensDontBeneficieGU().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_GENIE:
				getMoyensGenie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_INCONNU:
				getObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_LIBRE:
				getObjetLibre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBSERVATION:
				getObservation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORDRE:
				getOrdre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORGANISATION_SOUTIEN_MEDICAL:
				getOrganisationSoutienMedical().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OUVRAGE_GENIE:
				getOuvrageGenie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OVERLAY:
				getOverlay().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PARAGRAPHE_PLAN_OU_ORDRE:
				getParagraphePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERTES_SANTE:
				getPertesSante().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PION_RESEAU:
				getPionReseau().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN:
				getPlan().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_FEUX:
				getPlanFeux().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_CELLULE_SOUTIEN:
				getPlanificationCelluleSoutien().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_MOUVEMENT:
				getPlanificationMouvement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_OPERATION3_D:
				getPlanificationOperation3D().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_NUMEROTATION_OBJECTIFS:
				getPlanNumerotationObjectifs().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_TRAITEMENT_OBJECTIFS:
				getPlanTraitementObjectifs().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_AXE:
				getPointAxe().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_HAUT:
				getPointHaut().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_TRAJECTOIRE:
				getPointTrajectoire().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POLITIQUE_TIR:
				getPolitiqueTir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORTEUR_SYSTEME_ARME:
				getPorteurSystemeArme().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSSIBILITES_ENI_3D:
				getPossibilitesENI3d().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_TIR:
				getPosteTir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POTENTIEL_EN_IFEU_SOL_SOL:
				getPotentielENIfeuSolSol().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_IDENTIFIE:
				getPrelevementSubordonneIdentifie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				getPrelevementSubordonneNonIdentifie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PREVISION_OBSERVATION:
				getPrevisionObservation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TACTIQUE:
				getPrioriteTactique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TECHNIQUE:
				getPrioriteTechnique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROCEDURE_IFF:
				getProcedureIFF().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROJET_CIMIC:
				getProjetCimic().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAID_AERIEN_ENNEMI:
				getRaidAerienEnnemi().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT_FORCE:
				getRapportForce().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RATTACHEMENT_LOGISTIQUE_PARTICULIER:
				getRattachementLogistiqueParticulier().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAVITAILLEMENT:
				getRavitaillement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RECHANGE:
				getRechange().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENFORCEMENTS_FEUX:
				getRenforcementsFeux().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENSEIGNEMENT_OBJECTIF:
				getRenseignementObjectif().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESERVATION_UNITE:
				getReservationUnite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE_HELICOPTERE_ALAT:
				getRouteHelicoptereALAT().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_CONSOMMABLE:
				getSituationConsommable().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EFFECTIF:
				getSituationEffectif().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EQUIPEMENT:
				getSituationEquipement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_RADIATION:
				getSituationRadiation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_VEHICULE:
				getSituationVehicule().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_ANNOTATION:
				getSymboleAnnotation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_CERCLE:
				getSymboleCercle().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_FLECHE:
				getSymboleFleche().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_IMAGE:
				getSymboleImage().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_LINEIQUE:
				getSymboleLineique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_NOTE:
				getSymboleNote().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POINT:
				getSymbolePoint().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POST_IT:
				getSymbolePostIt().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TACTIQUE:
				getSymboleTactique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TEXTE:
				getSymboleTexte().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYNTHESE_DETECTIONS:
				getSyntheseDetections().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS:
				getSystemeAtterrissageAuxInstruments().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAITEMENT_OBJECTIF:
				getTraitementObjectif().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAVAIL_AIDE_DEPLOIEMENT:
				getTravailAideDeploiement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARMEMENT_SYSTEME_ARME:
				getTypeArmementSystemeArme().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_CAPTEUR:
				getTypeCapteur().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_SYSTEME_ARME:
				getTypeEquipementSystemeArme().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ITINERAIRE:
				getTypeItineraire().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION_SYSTEME_ARME:
				getTypeMunitionSystemeArme().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_MILITAIRE_EXECUTIVE:
				getTypeOrganisationMilitaireExecutive().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORTEUR:
				getTypePorteur().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VARIANTE_TRAVAIL:
				getVarianteTravail().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VEHICULE:
				getVehicule().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VOL:
				getVol().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_ALAT:
				getZoneAlat().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_FONCTIONNELLE_LOGISTIQUE:
				getZoneFonctionnelleLogistique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_LOGISTIQUE:
				getZoneLogistique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_MISE_ATERRE:
				getZoneMiseATerre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_RECHERCHE:
				getZoneRecherche().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_ELECTRONIQUE:
				getAdresseElectronique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_PHYSIQUE:
				getAdressePhysique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_RADIO:
				getAdresseRadio().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERODROME:
				getAerodrome().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AIRE_STATIONNEMENT:
				getAireStationnement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_MARINE:
				getArticulationMarine().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_TERRE:
				getArticulationTerre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ACTIVITE_CONTEXTE:
				getAssocActiviteContexte().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_CONTEXTE:
				getAssocContexteContexte().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_INSTANCE_OBJET:
				getAssocContexteInstanceObjet().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTIVITE_CAPACITE:
				getAssociationActiviteCapacite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_AFFILIATION:
				getAssociationAffiliationAffiliation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				getAssociationAffiliationInstanceObjet().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_TYPE:
				getAssociationAffiliationType().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMATION:
				getAssociationConsommation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONTEXTE_RAPPORT:
				getAssociationContexteRapport().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DOCUMENT_CAPACITE:
				getAssociationDocumentCapacite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				getAssociationGroupeInfoOpsEntiteOrganisationnelle().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				getAssociationInstanceObjetAdresse().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				getAssociationInstanceObjetCapacite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getAssociationObjectifCiblageObjectifCiblage().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				getAssociationProfilDotationTheorique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_UNITE:
				getAssociationProfilUnite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				getAssociationRacineOperationnelleDocument().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TEMPORELLE_ACTIVITE:
				getAssociationTemporelleActivite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TYPE_CAPACITE:
				getAssociationTypeCapacite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				getAssocListeObjCandListeObjCand().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_PISTE_ATTER_DIR_APP_AIR:
				getAssocPisteAtterDirAppAir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ADRESSE:
				getAutreAdresse().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ARTICULATION:
				getAutreArticulation().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CONTEXTE:
				getAutreContexte().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ELEMENT_CONTROLE:
				getAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT:
				getAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NRBC:
				getAutreEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_RADIOACTIF:
				getAutreEvenementRadioactif().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_LISTE_OBJECTIFS:
				getAutreListeObjectifs().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MATERIEL:
				getAutreMateriel().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_NOM:
				getAutreNom().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_OBSTACLE:
				getAutreObstacle().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SEGMENT_ITINERAIRE:
				getAutreSegmentItineraire().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SITE:
				getAutreSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_BATIMENT:
				getAutreTypeBatiment().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE:
				getAutreTypeConsommable().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ELEMENT_CONTROLE:
				getAutreTypeElementControle().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ENTITE_ORGANISATIONNELLE:
				getAutreTypeEntiteOrganisationnelle().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_EQUIPEMENT:
				getAutreTypeEquipement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				getAutreTypeOrganisationGouvernementale().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_SITE:
				getAutreTypeSite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BASSIN:
				getBassin().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BATIMENT:
				getBatiment().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_LANCEMENT:
				getCaleLancement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_SECHE:
				getCaleSeche().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_FEUX:
				getCapaciteFeux().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_GENIE:
				getCapaciteGenie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MOBILITE:
				getCapaciteMobilite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_STOCKAGE:
				getCapaciteStockage().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SURVEILLANCE:
				getCapaciteSurveillance().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_LOGISTIQUE:
				getCaracteristiqueLogistique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_TRANSPORT:
				getCaracteristiqueTransport().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_MARITIME:
				getChampMinesMaritime().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_TERRESTRE:
				getChampMinesTerrestre().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARNIER:
				getCharnier().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHEMIN_FER:
				getCheminFer().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				getCompositionDotationTheoriqueEnType().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONVOI:
				getConvoi().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTION_APPROCHE_AIR:
				getDirectionApprocheAir().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOCUMENT:
				getDocument().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE:
				getDotationTheorique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE_INSTANCE_OBJET:
				getDotationTheoriqueInstanceObjet().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_TOPOGRAPHIE:
				getElementTopographie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENTITE_POLITIQUE:
				getEntitePolitique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_ARME_NUCLEAIRE:
				getEvenementArmeNucleaire().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE:
				getEvenementChimiqueEtBiologique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RADIOLOGIQUE:
				getEvenementRadiologique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_ETHNIQUE:
				getGroupeEthnique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_FONCTIONNEL:
				getGroupeFonctionnel().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INDIVIDUS:
				getGroupeIndividus().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INFORMATIONS_OPERATIONNELLES:
				getGroupeInformationsOperationnelles().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE:
				getItineraire().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__JETEE:
				getJetee().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIMITE:
				getLimite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_CANDIDATS:
				getListeObjectifsCandidats().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURE_COORDINATION:
				getMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUILLAGE:
				getMouillage().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_ACTIVITE:
				getObjectifActivite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_CIBLAGE:
				getObjectifCiblage().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERSONNE:
				getPersonne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PISTE_ATTERRISSAGE:
				getPisteAtterrissage().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_CONTROLE3_D:
				getPointControle3D().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PONT:
				getPont().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORT:
				getPort().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_AMARRAGE:
				getPosteAmarrage().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROFIL:
				getProfil().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__QUAI_MARITIME:
				getQuaiMaritime().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT:
				getRapport().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__REGLE_ENGAGEMENT:
				getRegleEngagement().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RELIGION:
				getReligion().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESEAU_TELECOMMUNICATION:
				getReseauTelecommunication().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE:
				getRoute().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SEGMENT_ROUTE_AERIENNE:
				getSegmentRouteAerienne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__SERVICE_RESEAU:
				getServiceReseau().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__STRUCTURE_ORGANISEE:
				getStructureOrganisee().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRANCHE_METEO:
				getTrancheMeteo().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERODROME:
				getTypeAerodrome().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERONEF:
				getTypeAeronef().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_BIOLOGIQUE:
				getTypeAgentBiologique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_CHIMIQUE:
				getTypeAgentChimique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_NUCLEAIRE:
				getTypeAgentNucleaire().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARME:
				getTypeArme().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_BATIMENT_SURFACE:
				getTypeBatimentSurface().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_ELECTRONIQUE:
				getTypeEquipementElectronique().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_FERROVIAIRE:
				getTypeEquipementFerroviaire().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_GENIE:
				getTypeEquipementGenie().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_MARITIME:
				getTypeEquipementMaritime().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_NRBC:
				getTypeEquipementNRBC().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_GROUPE_INDIVIDUS:
				getTypeGroupeIndividus().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MESURE_COORDINATION:
				getTypeMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION:
				getTypeMunition().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_OBSTACLE:
				getTypeObstacle().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_PRIVEE:
				getTypeOrganisationPrivee().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PERSONNE:
				getTypePersonne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PONT:
				getTypePont().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORT:
				getTypePort().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_CIVIL:
				getTypePosteCivil().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_MILITAIRE:
				getTypePosteMilitaire().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_REGROUPEMENT_FORCE:
				getTypeRegroupementForce().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_SOUS_MARIN:
				getTypeSousMarin().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_UNITE:
				getTypeUnite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_VEHICULE:
				getTypeVehicule().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__UNITE:
				getUnite().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_AERIENNE:
				getZoneAerienne().clear();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__BIBLIOTHEQUE:
				unsetBibliotheque();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ANNEXE:
				setTypeAnnexe(TYPE_ANNEXE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_DQP:
				setVersionDQP(VERSION_DQP_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_GRAMMAIRE:
				unsetVersionGrammaire();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_MODELE:
				unsetVersionModele();
				return;
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_TYPE_ANNEXE:
				unsetVersionTypeAnnexe();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUP:
				return group != null && !group.isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTION_RENSEIGNEMENT:
				return !getActionRenseignement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ACTIVITE_POSTURE:
				return !getActivitePosture().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERONEF:
				return !getAeronef().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALERTE_FRAPPE_NUCLEAIRE_AMIE:
				return !getAlerteFrappeNucleaireAmie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ALLURE:
				return !getAllure().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ANNULATION_INTERDICTION_TIR:
				return !getAnnulationInterdictionTir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__APPUI_FEU_HELICOPTERE:
				return !getAppuiFeuHelicoptere().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_ASS:
				return !getArticulationASS().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_LOGISTIQUE:
				return !getArticulationLogistique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				return !getAssocEntiteOrgTypeEntiteOrg().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_ACTION:
				return !getAssociationActionAction().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				return !getAssociationActionAutreEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTION_EVENEMENT_NRBC:
				return !getAssociationActionEvenementNRBC().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				return !getAssociationAutreEvenementAction().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				return !getAssociationAutreEvenementAutreEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				return !getAssociationAutreEvenementEvenementNRBC().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				return !getAssociationConflit3DMissionAerienne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMABLEL_MAJEUR:
				return !getAssociationConsommablelMajeur().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				return !getAssociationConvoiMouvementParRoute().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				return !getAssociationDepEvacuationDepEvacuation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				return !getAssociationElementControleEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				return !getAssociationElementTopographieEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_CTRL:
				return !getAssociationEltCtrlEltCtrl().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_ELT_TOPO:
				return !getAssociationEltCtrlEltTopo().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_MATERIEL:
				return !getAssociationEltCtrlMateriel().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_SITE:
				return !getAssociationEltCtrlSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				return !getAssociationEltCtrlTypeEltCtrl().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ELT_TOPO_SITE:
				return !getAssociationEltTopoSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ACTION:
				return !getAssociationEntiteOrgAction().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				return !getAssociationEntiteOrganisationnellePlanOuOrdre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				return !getAssociationEntiteOrgEltCtrl().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				return !getAssociationEntiteOrgEltTopo().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return !getAssociationEntiteOrgEntiteOrg().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_EVENEMENT:
				return !getAssociationEntiteOrgEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_MATERIEL:
				return !getAssociationEntiteOrgMateriel().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				return !getAssociationEntiteOrgObjetInconnu().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_PERSONNE:
				return !getAssociationEntiteOrgPersonne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ENTITE_ORG_SITE:
				return !getAssociationEntiteOrgSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EQUIPEMENTL_MAJEUR:
				return !getAssociationEquipementlMajeur().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_ACTION:
				return !getAssociationEvenementNRBCAction().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				return !getAssociationEvenementNRBCAutreEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				return !getAssociationEvenementNRBCEvenementNRBC().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				return !getAssociationEvenementRENSAutreEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				return !getAssociationEvenementRENSEvenementRENS().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				return !getAssociationGroupeInfoOpsPlanOuOrdre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_HORAIRE_MANOEUVRE:
				return !getAssociationHoraireManoeuvre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_LIVRAISON_LIVAISON:
				return !getAssociationLivraisonLivaison().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_CTRL:
				return !getAssociationMaterielEltCtrl().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_ELT_TOPO:
				return !getAssociationMaterielEltTopo().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_EVENEMENT:
				return !getAssociationMaterielEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_MATERIEL:
				return !getAssociationMaterielMateriel().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_METEOROLOGIE:
				return !getAssociationMaterielMeteorologie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_OBJET_INCONNU:
				return !getAssociationMaterielObjetInconnu().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_PERSONNE:
				return !getAssociationMaterielPersonne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_SITE:
				return !getAssociationMaterielSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				return !getAssociationMaterielTypeMateriel().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				return !getAssociationMesureCoordinationPlanFeux().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				return !getAssociationMesureCoordMissionAerienne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_METEOROLOGIE_SITE:
				return !getAssociationMeteorologieSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				return !getAssociationMissionAerienneMissionAerienne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				return !getAssociationMissionGenieMissionGenie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MELEE_ACTION:
				return !getAssociationMissionMeleeAction().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				return !getAssociationMissionMouvementMissionMouvement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				return !getAssociationMissionRenseignementAction().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				return !getAssociationMissionRensObjPlanTraitementObj().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				return !getAssociationMissionRensObjTraitementObj().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				return !getAssociationMouvementParRouteMouvementParRoute().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				return !getAssociationObjectifCiblageDocument().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				return !getAssociationObjetInconnuEltCtrl().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				return !getAssociationObjetInconnuEltTopo().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJET_INCONNU_SITE:
				return !getAssociationObjetInconnuSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBSERVATION_OBSERVATION:
				return !getAssociationObservationObservation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				return !getAssociationParagraphePOparagraphePO().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_CTRL:
				return !getAssociationPersonneEltCtrl().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_ELT_TOPO:
				return !getAssociationPersonneEltTopo().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_EVENEMENT:
				return !getAssociationPersonneEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MATERIEL:
				return !getAssociationPersonneMateriel().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_MISSION_AIR:
				return !getAssociationPersonneMissionAir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_OBJET_INCONNU:
				return !getAssociationPersonneObjetInconnu().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PERSONNE:
				return !getAssociationPersonnePersonne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				return !getAssociationPersonnePlanifOperation3D().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_SITE:
				return !getAssociationPersonneSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				return !getAssociationPersonneTypePersonne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				return !getAssociationPlanificationOperation3DMissionAir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				return !getAssociationPlanificationOperation3DMissionASA().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				return !getAssociationPlanOuOrdrePlanOuOrdre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				return !getAssociationPlanTraitementObjTraitementObj().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				return !getAssociationRenseignementObjMisRenseignementObj().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_CTRL:
				return !getAssociationSiteEltCtrl().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_ELT_TOPO:
				return !getAssociationSiteEltTopo().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_EVENEMENT:
				return !getAssociationSiteEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_MATERIEL:
				return !getAssociationSiteMateriel().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_METEOROLOGIE:
				return !getAssociationSiteMeteorologie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_OBJET_INCONNU:
				return !getAssociationSiteObjetInconnu().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_SITE:
				return !getAssociationSiteSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SITE_TYPE_SITE:
				return !getAssociationSiteTypeSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				return !getAssociationSyntheseDetectionsEvenementNRBC().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				return !getAssociationTraitementObjPlanTraitementObj().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				return !getAssociationUniteAppuiFeuHelicoptere().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				return !getAssociationUniteAutreMissionLog().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_LIVRAISON:
				return !getAssociationUniteLivraison().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				return !getAssociationUniteMissionAcqASS().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AERIENNE:
				return !getAssociationUniteMissionAerienne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_AIR:
				return !getAssociationUniteMissionAir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				return !getAssociationUniteMissionALATattaque().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ASA:
				return !getAssociationUniteMissionASA().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				return !getAssociationUniteMissionEscorteAF().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_GENIE:
				return !getAssociationUniteMissionGenie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_MELEE:
				return !getAssociationUniteMissionMelee().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				return !getAssociationUniteMissionRensObj().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_SIC:
				return !getAssociationUniteMissionSic().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				return !getAssociationUniteMissionTranspTact().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				return !getAssociationUniteMissionUniteAntichar().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				return !getAssociationUniteMouvementParRoute().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLAN_FEUX:
				return !getAssociationUnitePlanFeux().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				return !getAssociationUnitePlanifOperation3D().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				return !getAssociationUniteRenforcementsFeux().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_SYMBOLE_TACTIQUE:
				return !getAssocSymboleTactique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ACTION:
				return !getAutreAction().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_AFFILIATION:
				return !getAutreAffiliation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CAPTEUR_RENS:
				return !getAutreCapteurRENS().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NUCLEAIRE:
				return !getAutreEvenementNucleaire().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MENACE:
				return !getAutreMenace().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION:
				return !getAutreMission().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_ALAT:
				return !getAutreMissionALAT().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MISSION_LOGISTIQUE:
				return !getAutreMissionLogistique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE_SYSTEME_ARME:
				return !getAutreTypeConsommableSystemeArme().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BESOINS_EN_RENSEIGNEMENTS:
				return !getBesoinsEnRenseignements().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BILAN_TIRS_ASS:
				return !getBilanTirsASS().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BRANCHE_NAVIGATION:
				return !getBrancheNavigation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BULLETIN_SONDAGE:
				return !getBulletinSondage().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_HEBERGEMENT:
				return !getCapaciteHebergement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MAINTENANCE:
				return !getCapaciteMaintenance().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MANUTENTION:
				return !getCapaciteManutention().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_OPERATIONNELLE:
				return !getCapaciteOperationnelle().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SOUTIEN:
				return !getCapaciteSoutien().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_TRANSMISSION:
				return !getCapaciteTransmission().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_DRONE:
				return !getCapteurDrone().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_LOCALISATION_RADIOELECTRIQUE:
				return !getCapteurLocalisationRadioelectrique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_RADAR:
				return !getCapteurRadar().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPTEUR_ROHUM:
				return !getCapteurROHUM().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARNET_POINTS:
				return !getCarnetPoints().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARGEMENT_MATERIEL:
				return !getChargementMateriel().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPTE_RENDU_TIR:
				return !getCompteRenduTir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONFLIT3_D:
				return !getConflit3D().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE:
				return !getConsigne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_LUTTE_ANTIAERIENNE_TTA:
				return !getConsigneLutteAntiaerienneTTA().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONSIGNE_TIR:
				return !getConsigneTir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_AERIENNE:
				return !getCouvertureAerienne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__COUVERTURE_ASA:
				return !getCouvertureASA().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEGRE_CLASSIFICATION:
				return !getDegreClassification().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEMANDE_TIR:
				return !getDemandeTir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPANNAGE_EVACUATION:
				return !getDepannageEvacuation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MARTHA:
				return !getDeploiementMARTHA().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DEPLOIEMENT_MOYENS_AS_AC3D:
				return !getDeploiementMoyensASAc3d().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_IDENTIFIE:
				return !getDetachementIdentifie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DETACHEMENT_NON_IDENTIFIE:
				return !getDetachementNonIdentifie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTIVE_TIR:
				return !getDirectiveTir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ECHELON:
				return !getEchelon().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_METEO:
				return !getElementMeteo().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENNEMI_FUTUR:
				return !getEnnemiFutur().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				return !getEnTeteParagraphePlanOuOrdre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ETUDE_DISPERSION:
				return !getEtudeDispersion().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RENS:
				return !getEvenementRENS().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__FAIT_RENSEIGNEMENT:
				return !getFaitRenseignement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__HORAIRE_MANOEUVRE:
				return !getHoraireManoeuvre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__HYPOTHESE_ACTION_EN_IOU_AUTRE:
				return !getHypotheseActionENIouAutre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__INDICATEUR_GEOSTATISTIQUE:
				return !getIndicateurGeostatistique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERDICTION_TIR:
				return !getInterdictionTir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_GENERALE:
				return !getInterventionGenerale().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__INTERVENTION_TYPE:
				return !getInterventionType().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				return !getItineraireOuModeleCheminementALAT().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__JONCTION_RESEAU:
				return !getJonctionReseau().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIAISON_RESEAU:
				return !getLiaisonReseau().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIGNE_LIVRAISON:
				return !getLigneLivraison().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_MESURES_COORDINATION3_D:
				return !getListeMesuresCoordination3D().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_PLANIFIES:
				return !getListeObjectifsPlanifies().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIVRAISON:
				return !getLivraison().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MEMENTO_GENIE:
				return !getMementoGenie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AERIENNE:
				return !getMenaceAerienne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_AS_AENI:
				return !getMenaceASAeni().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_DETECTION:
				return !getMenaceDetection().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_FEUX_ENI:
				return !getMenaceFeuxENI().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACE_GENIE_ENI:
				return !getMenaceGenieENI().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MENACES_AERIENNES_MISSION_ALAT:
				return !getMenacesAeriennesMissionALAT().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURES_PROTECTION_ELECTRONIQUE:
				return !getMesuresProtectionElectronique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISE_EN_OEUVRE_ROE:
				return !getMiseEnOeuvreROE().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ACQUISITION_ASS:
				return !getMissionAcquisitionASS().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AERIENNE:
				return !getMissionAerienne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_AIR:
				return !getMissionAir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ALA_TATTAQUE:
				return !getMissionALATattaque().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ASA:
				return !getMissionASA().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_ESCORTE_OU_APPUI_FEU:
				return !getMissionEscorteOuAppuiFeu().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_FEUX:
				return !getMissionFeux().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_GENIE:
				return !getMissionGenie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_I3D:
				return !getMissionI3D().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MAINTENANCE:
				return !getMissionMaintenance().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MELEE:
				return !getMissionMelee().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_MOUVEMENT:
				return !getMissionMouvement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RAVITAILLEMENT:
				return !getMissionRavitaillement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT:
				return !getMissionRenseignement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_RENSEIGNEMENT_OBJECTIF:
				return !getMissionRenseignementObjectif().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SAR_COMBAT:
				return !getMissionSarCombat().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_SIC:
				return !getMissionSic().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_TRANSPORT_TACTIQUE:
				return !getMissionTransportTactique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MISSION_UNITE_ANTICHAR:
				return !getMissionUniteAntichar().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MODULE:
				return !getModule().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUVEMENT_PAR_ROUTE:
				return !getMouvementParRoute().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_AERIENS_DONT_BENEFICIE_GU:
				return !getMoyensAeriensDontBeneficieGU().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOYENS_GENIE:
				return !getMoyensGenie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_INCONNU:
				return !getObjetInconnu().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJET_LIBRE:
				return !getObjetLibre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBSERVATION:
				return !getObservation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORDRE:
				return !getOrdre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ORGANISATION_SOUTIEN_MEDICAL:
				return !getOrganisationSoutienMedical().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OUVRAGE_GENIE:
				return !getOuvrageGenie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OVERLAY:
				return !getOverlay().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PARAGRAPHE_PLAN_OU_ORDRE:
				return !getParagraphePlanOuOrdre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERTES_SANTE:
				return !getPertesSante().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PION_RESEAU:
				return !getPionReseau().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN:
				return !getPlan().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_FEUX:
				return !getPlanFeux().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_CELLULE_SOUTIEN:
				return !getPlanificationCelluleSoutien().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_MOUVEMENT:
				return !getPlanificationMouvement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLANIFICATION_OPERATION3_D:
				return !getPlanificationOperation3D().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_NUMEROTATION_OBJECTIFS:
				return !getPlanNumerotationObjectifs().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PLAN_TRAITEMENT_OBJECTIFS:
				return !getPlanTraitementObjectifs().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_AXE:
				return !getPointAxe().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_HAUT:
				return !getPointHaut().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_TRAJECTOIRE:
				return !getPointTrajectoire().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POLITIQUE_TIR:
				return !getPolitiqueTir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORTEUR_SYSTEME_ARME:
				return !getPorteurSystemeArme().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSSIBILITES_ENI_3D:
				return !getPossibilitesENI3d().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_TIR:
				return !getPosteTir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POTENTIEL_EN_IFEU_SOL_SOL:
				return !getPotentielENIfeuSolSol().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_IDENTIFIE:
				return !getPrelevementSubordonneIdentifie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				return !getPrelevementSubordonneNonIdentifie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PREVISION_OBSERVATION:
				return !getPrevisionObservation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TACTIQUE:
				return !getPrioriteTactique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PRIORITE_TECHNIQUE:
				return !getPrioriteTechnique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROCEDURE_IFF:
				return !getProcedureIFF().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROJET_CIMIC:
				return !getProjetCimic().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAID_AERIEN_ENNEMI:
				return !getRaidAerienEnnemi().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT_FORCE:
				return !getRapportForce().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RATTACHEMENT_LOGISTIQUE_PARTICULIER:
				return !getRattachementLogistiqueParticulier().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAVITAILLEMENT:
				return !getRavitaillement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RECHANGE:
				return !getRechange().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENFORCEMENTS_FEUX:
				return !getRenforcementsFeux().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RENSEIGNEMENT_OBJECTIF:
				return !getRenseignementObjectif().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESERVATION_UNITE:
				return !getReservationUnite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE_HELICOPTERE_ALAT:
				return !getRouteHelicoptereALAT().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_CONSOMMABLE:
				return !getSituationConsommable().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EFFECTIF:
				return !getSituationEffectif().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_EQUIPEMENT:
				return !getSituationEquipement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_RADIATION:
				return !getSituationRadiation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SITUATION_VEHICULE:
				return !getSituationVehicule().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_ANNOTATION:
				return !getSymboleAnnotation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_CERCLE:
				return !getSymboleCercle().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_FLECHE:
				return !getSymboleFleche().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_IMAGE:
				return !getSymboleImage().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_LINEIQUE:
				return !getSymboleLineique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_NOTE:
				return !getSymboleNote().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POINT:
				return !getSymbolePoint().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_POST_IT:
				return !getSymbolePostIt().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TACTIQUE:
				return !getSymboleTactique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYMBOLE_TEXTE:
				return !getSymboleTexte().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYNTHESE_DETECTIONS:
				return !getSyntheseDetections().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS:
				return !getSystemeAtterrissageAuxInstruments().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAITEMENT_OBJECTIF:
				return !getTraitementObjectif().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRAVAIL_AIDE_DEPLOIEMENT:
				return !getTravailAideDeploiement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARMEMENT_SYSTEME_ARME:
				return !getTypeArmementSystemeArme().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_CAPTEUR:
				return !getTypeCapteur().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_SYSTEME_ARME:
				return !getTypeEquipementSystemeArme().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ITINERAIRE:
				return !getTypeItineraire().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION_SYSTEME_ARME:
				return !getTypeMunitionSystemeArme().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_MILITAIRE_EXECUTIVE:
				return !getTypeOrganisationMilitaireExecutive().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORTEUR:
				return !getTypePorteur().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VARIANTE_TRAVAIL:
				return !getVarianteTravail().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VEHICULE:
				return !getVehicule().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VOL:
				return !getVol().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_ALAT:
				return !getZoneAlat().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_FONCTIONNELLE_LOGISTIQUE:
				return !getZoneFonctionnelleLogistique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_LOGISTIQUE:
				return !getZoneLogistique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_MISE_ATERRE:
				return !getZoneMiseATerre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_RECHERCHE:
				return !getZoneRecherche().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_ELECTRONIQUE:
				return !getAdresseElectronique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_PHYSIQUE:
				return !getAdressePhysique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ADRESSE_RADIO:
				return !getAdresseRadio().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AERODROME:
				return !getAerodrome().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AIRE_STATIONNEMENT:
				return !getAireStationnement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_MARINE:
				return !getArticulationMarine().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ARTICULATION_TERRE:
				return !getArticulationTerre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_ACTIVITE_CONTEXTE:
				return !getAssocActiviteContexte().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_CONTEXTE:
				return !getAssocContexteContexte().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_CONTEXTE_INSTANCE_OBJET:
				return !getAssocContexteInstanceObjet().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_ACTIVITE_CAPACITE:
				return !getAssociationActiviteCapacite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_AFFILIATION:
				return !getAssociationAffiliationAffiliation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				return !getAssociationAffiliationInstanceObjet().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_AFFILIATION_TYPE:
				return !getAssociationAffiliationType().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONSOMMATION:
				return !getAssociationConsommation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_CONTEXTE_RAPPORT:
				return !getAssociationContexteRapport().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_DOCUMENT_CAPACITE:
				return !getAssociationDocumentCapacite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				return !getAssociationGroupeInfoOpsEntiteOrganisationnelle().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				return !getAssociationInstanceObjetAdresse().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				return !getAssociationInstanceObjetCapacite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return !getAssociationObjectifCiblageObjectifCiblage().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				return !getAssociationProfilDotationTheorique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_PROFIL_UNITE:
				return !getAssociationProfilUnite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				return !getAssociationRacineOperationnelleDocument().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TEMPORELLE_ACTIVITE:
				return !getAssociationTemporelleActivite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOCIATION_TYPE_CAPACITE:
				return !getAssociationTypeCapacite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				return !getAssocListeObjCandListeObjCand().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ASSOC_PISTE_ATTER_DIR_APP_AIR:
				return !getAssocPisteAtterDirAppAir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ADRESSE:
				return !getAutreAdresse().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ARTICULATION:
				return !getAutreArticulation().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_CONTEXTE:
				return !getAutreContexte().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_ELEMENT_CONTROLE:
				return !getAutreElementControle().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT:
				return !getAutreEvenement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_NRBC:
				return !getAutreEvenementNRBC().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_EVENEMENT_RADIOACTIF:
				return !getAutreEvenementRadioactif().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_LISTE_OBJECTIFS:
				return !getAutreListeObjectifs().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_MATERIEL:
				return !getAutreMateriel().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_NOM:
				return !getAutreNom().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_OBSTACLE:
				return !getAutreObstacle().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SEGMENT_ITINERAIRE:
				return !getAutreSegmentItineraire().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_SITE:
				return !getAutreSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_BATIMENT:
				return !getAutreTypeBatiment().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_CONSOMMABLE:
				return !getAutreTypeConsommable().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ELEMENT_CONTROLE:
				return !getAutreTypeElementControle().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ENTITE_ORGANISATIONNELLE:
				return !getAutreTypeEntiteOrganisationnelle().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_EQUIPEMENT:
				return !getAutreTypeEquipement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				return !getAutreTypeOrganisationGouvernementale().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__AUTRE_TYPE_SITE:
				return !getAutreTypeSite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BASSIN:
				return !getBassin().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BATIMENT:
				return !getBatiment().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_LANCEMENT:
				return !getCaleLancement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CALE_SECHE:
				return !getCaleSeche().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_FEUX:
				return !getCapaciteFeux().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_GENIE:
				return !getCapaciteGenie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_MOBILITE:
				return !getCapaciteMobilite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_STOCKAGE:
				return !getCapaciteStockage().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CAPACITE_SURVEILLANCE:
				return !getCapaciteSurveillance().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_LOGISTIQUE:
				return !getCaracteristiqueLogistique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CARACTERISTIQUE_TRANSPORT:
				return !getCaracteristiqueTransport().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_MARITIME:
				return !getChampMinesMaritime().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHAMP_MINES_TERRESTRE:
				return !getChampMinesTerrestre().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHARNIER:
				return !getCharnier().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CHEMIN_FER:
				return !getCheminFer().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				return !getCompositionDotationTheoriqueEnType().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__CONVOI:
				return !getConvoi().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DIRECTION_APPROCHE_AIR:
				return !getDirectionApprocheAir().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOCUMENT:
				return !getDocument().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE:
				return !getDotationTheorique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__DOTATION_THEORIQUE_INSTANCE_OBJET:
				return !getDotationTheoriqueInstanceObjet().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ELEMENT_TOPOGRAPHIE:
				return !getElementTopographie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ENTITE_POLITIQUE:
				return !getEntitePolitique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_ARME_NUCLEAIRE:
				return !getEvenementArmeNucleaire().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE:
				return !getEvenementChimiqueEtBiologique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__EVENEMENT_RADIOLOGIQUE:
				return !getEvenementRadiologique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_ETHNIQUE:
				return !getGroupeEthnique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_FONCTIONNEL:
				return !getGroupeFonctionnel().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INDIVIDUS:
				return !getGroupeIndividus().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__GROUPE_INFORMATIONS_OPERATIONNELLES:
				return !getGroupeInformationsOperationnelles().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ITINERAIRE:
				return !getItineraire().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__JETEE:
				return !getJetee().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LIMITE:
				return !getLimite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__LISTE_OBJECTIFS_CANDIDATS:
				return !getListeObjectifsCandidats().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MESURE_COORDINATION:
				return !getMesureCoordination().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__MOUILLAGE:
				return !getMouillage().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_ACTIVITE:
				return !getObjectifActivite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__OBJECTIF_CIBLAGE:
				return !getObjectifCiblage().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PERSONNE:
				return !getPersonne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PISTE_ATTERRISSAGE:
				return !getPisteAtterrissage().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POINT_CONTROLE3_D:
				return !getPointControle3D().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PONT:
				return !getPont().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PORT:
				return !getPort().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__POSTE_AMARRAGE:
				return !getPosteAmarrage().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__PROFIL:
				return !getProfil().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__QUAI_MARITIME:
				return !getQuaiMaritime().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RAPPORT:
				return !getRapport().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__REGLE_ENGAGEMENT:
				return !getRegleEngagement().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RELIGION:
				return !getReligion().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__RESEAU_TELECOMMUNICATION:
				return !getReseauTelecommunication().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ROUTE:
				return !getRoute().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SEGMENT_ROUTE_AERIENNE:
				return !getSegmentRouteAerienne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__SERVICE_RESEAU:
				return !getServiceReseau().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__STRUCTURE_ORGANISEE:
				return !getStructureOrganisee().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TRANCHE_METEO:
				return !getTrancheMeteo().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERODROME:
				return !getTypeAerodrome().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AERONEF:
				return !getTypeAeronef().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_BIOLOGIQUE:
				return !getTypeAgentBiologique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_CHIMIQUE:
				return !getTypeAgentChimique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_AGENT_NUCLEAIRE:
				return !getTypeAgentNucleaire().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ARME:
				return !getTypeArme().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_BATIMENT_SURFACE:
				return !getTypeBatimentSurface().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_ELECTRONIQUE:
				return !getTypeEquipementElectronique().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_FERROVIAIRE:
				return !getTypeEquipementFerroviaire().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_GENIE:
				return !getTypeEquipementGenie().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_MARITIME:
				return !getTypeEquipementMaritime().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_EQUIPEMENT_NRBC:
				return !getTypeEquipementNRBC().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_GROUPE_INDIVIDUS:
				return !getTypeGroupeIndividus().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MESURE_COORDINATION:
				return !getTypeMesureCoordination().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_MUNITION:
				return !getTypeMunition().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_OBSTACLE:
				return !getTypeObstacle().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ORGANISATION_PRIVEE:
				return !getTypeOrganisationPrivee().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PERSONNE:
				return !getTypePersonne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PONT:
				return !getTypePont().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_PORT:
				return !getTypePort().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_CIVIL:
				return !getTypePosteCivil().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_POSTE_MILITAIRE:
				return !getTypePosteMilitaire().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_REGROUPEMENT_FORCE:
				return !getTypeRegroupementForce().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_SOUS_MARIN:
				return !getTypeSousMarin().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_UNITE:
				return !getTypeUnite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_VEHICULE:
				return !getTypeVehicule().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__UNITE:
				return !getUnite().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__ZONE_AERIENNE:
				return !getZoneAerienne().isEmpty();
			case SchemaPackage.TYPE_MPGT_MESSAGE__BIBLIOTHEQUE:
				return isSetBibliotheque();
			case SchemaPackage.TYPE_MPGT_MESSAGE__TYPE_ANNEXE:
				return TYPE_ANNEXE_EDEFAULT == null ? typeAnnexe != null : !TYPE_ANNEXE_EDEFAULT.equals(typeAnnexe);
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_DQP:
				return VERSION_DQP_EDEFAULT == null ? versionDQP != null : !VERSION_DQP_EDEFAULT.equals(versionDQP);
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_GRAMMAIRE:
				return isSetVersionGrammaire();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_MODELE:
				return isSetVersionModele();
			case SchemaPackage.TYPE_MPGT_MESSAGE__VERSION_TYPE_ANNEXE:
				return isSetVersionTypeAnnexe();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", bibliotheque: ");
		if (bibliothequeESet) result.append(bibliotheque); else result.append("<unset>");
		result.append(", typeAnnexe: ");
		result.append(typeAnnexe);
		result.append(", versionDQP: ");
		result.append(versionDQP);
		result.append(", versionGrammaire: ");
		if (versionGrammaireESet) result.append(versionGrammaire); else result.append("<unset>");
		result.append(", versionModele: ");
		if (versionModeleESet) result.append(versionModele); else result.append("<unset>");
		result.append(", versionTypeAnnexe: ");
		if (versionTypeAnnexeESet) result.append(versionTypeAnnexe); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMPGTMessageImpl
