/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.util;

import mpia.schema.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage
 * @generated
 */
public class SchemaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchemaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchemaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaSwitch<Adapter> modelSwitch =
		new SchemaSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseTypeAction(TypeAction object) {
				return createTypeActionAdapter();
			}
			@Override
			public Adapter caseTypeAction3Deni(TypeAction3Deni object) {
				return createTypeAction3DeniAdapter();
			}
			@Override
			public Adapter caseTypeActionASAeni(TypeActionASAeni object) {
				return createTypeActionASAeniAdapter();
			}
			@Override
			public Adapter caseTypeActionGenieENI(TypeActionGenieENI object) {
				return createTypeActionGenieENIAdapter();
			}
			@Override
			public Adapter caseTypeActionRenseignement(TypeActionRenseignement object) {
				return createTypeActionRenseignementAdapter();
			}
			@Override
			public Adapter caseTypeActivite(TypeActivite object) {
				return createTypeActiviteAdapter();
			}
			@Override
			public Adapter caseTypeActivitePosture(TypeActivitePosture object) {
				return createTypeActivitePostureAdapter();
			}
			@Override
			public Adapter caseTypeActiviteSurPointControle3D(TypeActiviteSurPointControle3D object) {
				return createTypeActiviteSurPointControle3DAdapter();
			}
			@Override
			public Adapter caseTypeAdresse(TypeAdresse object) {
				return createTypeAdresseAdapter();
			}
			@Override
			public Adapter caseTypeAdresseElectronique(TypeAdresseElectronique object) {
				return createTypeAdresseElectroniqueAdapter();
			}
			@Override
			public Adapter caseTypeAdressePhysique(TypeAdressePhysique object) {
				return createTypeAdressePhysiqueAdapter();
			}
			@Override
			public Adapter caseTypeAdresseRadio(TypeAdresseRadio object) {
				return createTypeAdresseRadioAdapter();
			}
			@Override
			public Adapter caseTypeAerodrome(TypeAerodrome object) {
				return createTypeAerodromeAdapter();
			}
			@Override
			public Adapter caseTypeAeronef(TypeAeronef object) {
				return createTypeAeronefAdapter();
			}
			@Override
			public Adapter caseTypeAffiliation(TypeAffiliation object) {
				return createTypeAffiliationAdapter();
			}
			@Override
			public Adapter caseTypeAirePisteGeometrique(TypeAirePisteGeometrique object) {
				return createTypeAirePisteGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeAirePolyarcGeometrique(TypeAirePolyarcGeometrique object) {
				return createTypeAirePolyarcGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeAirePolygoneGeometrique(TypeAirePolygoneGeometrique object) {
				return createTypeAirePolygoneGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeAireStationnement(TypeAireStationnement object) {
				return createTypeAireStationnementAdapter();
			}
			@Override
			public Adapter caseTypeAlerteFrappeNucleaireAmie(TypeAlerteFrappeNucleaireAmie object) {
				return createTypeAlerteFrappeNucleaireAmieAdapter();
			}
			@Override
			public Adapter caseTypeAllure(TypeAllure object) {
				return createTypeAllureAdapter();
			}
			@Override
			public Adapter caseTypeAnnulationIFF(TypeAnnulationIFF object) {
				return createTypeAnnulationIFFAdapter();
			}
			@Override
			public Adapter caseTypeAnnulationInterdictionTir(TypeAnnulationInterdictionTir object) {
				return createTypeAnnulationInterdictionTirAdapter();
			}
			@Override
			public Adapter caseTypeApercuDestinatairePlanOuOrdre(TypeApercuDestinatairePlanOuOrdre object) {
				return createTypeApercuDestinatairePlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypeAppuiFeuHelicoptere(TypeAppuiFeuHelicoptere object) {
				return createTypeAppuiFeuHelicoptereAdapter();
			}
			@Override
			public Adapter caseTypeArmementMissionAppuiAerien(TypeArmementMissionAppuiAerien object) {
				return createTypeArmementMissionAppuiAerienAdapter();
			}
			@Override
			public Adapter caseTypeArticulation(TypeArticulation object) {
				return createTypeArticulationAdapter();
			}
			@Override
			public Adapter caseTypeArticulationASS(TypeArticulationASS object) {
				return createTypeArticulationASSAdapter();
			}
			@Override
			public Adapter caseTypeArticulationLogistique(TypeArticulationLogistique object) {
				return createTypeArticulationLogistiqueAdapter();
			}
			@Override
			public Adapter caseTypeArticulationMarine(TypeArticulationMarine object) {
				return createTypeArticulationMarineAdapter();
			}
			@Override
			public Adapter caseTypeArticulationSoutienMedical(TypeArticulationSoutienMedical object) {
				return createTypeArticulationSoutienMedicalAdapter();
			}
			@Override
			public Adapter caseTypeArticulationTerre(TypeArticulationTerre object) {
				return createTypeArticulationTerreAdapter();
			}
			@Override
			public Adapter caseTypeAssocActiviteContexte(TypeAssocActiviteContexte object) {
				return createTypeAssocActiviteContexteAdapter();
			}
			@Override
			public Adapter caseTypeAssocConsigneLocalisation(TypeAssocConsigneLocalisation object) {
				return createTypeAssocConsigneLocalisationAdapter();
			}
			@Override
			public Adapter caseTypeAssocContexteContexte(TypeAssocContexteContexte object) {
				return createTypeAssocContexteContexteAdapter();
			}
			@Override
			public Adapter caseTypeAssocContexteInstanceObjet(TypeAssocContexteInstanceObjet object) {
				return createTypeAssocContexteInstanceObjetAdapter();
			}
			@Override
			public Adapter caseTypeAssocEntiteOrgTypeEntiteOrg(TypeAssocEntiteOrgTypeEntiteOrg object) {
				return createTypeAssocEntiteOrgTypeEntiteOrgAdapter();
			}
			@Override
			public Adapter caseTypeAssociationActionAction(TypeAssociationActionAction object) {
				return createTypeAssociationActionActionAdapter();
			}
			@Override
			public Adapter caseTypeAssociationActionAutreEvenement(TypeAssociationActionAutreEvenement object) {
				return createTypeAssociationActionAutreEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationActionEvenementNRBC(TypeAssociationActionEvenementNRBC object) {
				return createTypeAssociationActionEvenementNRBCAdapter();
			}
			@Override
			public Adapter caseTypeAssociationActiviteCapacite(TypeAssociationActiviteCapacite object) {
				return createTypeAssociationActiviteCapaciteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationActiviteLocalisation(TypeAssociationActiviteLocalisation object) {
				return createTypeAssociationActiviteLocalisationAdapter();
			}
			@Override
			public Adapter caseTypeAssociationAffiliationAffiliation(TypeAssociationAffiliationAffiliation object) {
				return createTypeAssociationAffiliationAffiliationAdapter();
			}
			@Override
			public Adapter caseTypeAssociationAffiliationInstanceObjet(TypeAssociationAffiliationInstanceObjet object) {
				return createTypeAssociationAffiliationInstanceObjetAdapter();
			}
			@Override
			public Adapter caseTypeAssociationAffiliationType(TypeAssociationAffiliationType object) {
				return createTypeAssociationAffiliationTypeAdapter();
			}
			@Override
			public Adapter caseTypeAssociationAutreEvenementAction(TypeAssociationAutreEvenementAction object) {
				return createTypeAssociationAutreEvenementActionAdapter();
			}
			@Override
			public Adapter caseTypeAssociationAutreEvenementAutreEvenement(TypeAssociationAutreEvenementAutreEvenement object) {
				return createTypeAssociationAutreEvenementAutreEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationAutreEvenementEvenementNRBC(TypeAssociationAutreEvenementEvenementNRBC object) {
				return createTypeAssociationAutreEvenementEvenementNRBCAdapter();
			}
			@Override
			public Adapter caseTypeAssociationConflit3DMissionAerienne(TypeAssociationConflit3DMissionAerienne object) {
				return createTypeAssociationConflit3DMissionAerienneAdapter();
			}
			@Override
			public Adapter caseTypeAssociationConsommablelMajeur(TypeAssociationConsommablelMajeur object) {
				return createTypeAssociationConsommablelMajeurAdapter();
			}
			@Override
			public Adapter caseTypeAssociationConsommation(TypeAssociationConsommation object) {
				return createTypeAssociationConsommationAdapter();
			}
			@Override
			public Adapter caseTypeAssociationContenuParagraphePlanOuOrdreDocument(TypeAssociationContenuParagraphePlanOuOrdreDocument object) {
				return createTypeAssociationContenuParagraphePlanOuOrdreDocumentAdapter();
			}
			@Override
			public Adapter caseTypeAssociationContexteRapport(TypeAssociationContexteRapport object) {
				return createTypeAssociationContexteRapportAdapter();
			}
			@Override
			public Adapter caseTypeAssociationConvoiMouvementParRoute(TypeAssociationConvoiMouvementParRoute object) {
				return createTypeAssociationConvoiMouvementParRouteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationDepEvacuationDepEvacuation(TypeAssociationDepEvacuationDepEvacuation object) {
				return createTypeAssociationDepEvacuationDepEvacuationAdapter();
			}
			@Override
			public Adapter caseTypeAssociationDocumentCapacite(TypeAssociationDocumentCapacite object) {
				return createTypeAssociationDocumentCapaciteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationElementControleEvenement(TypeAssociationElementControleEvenement object) {
				return createTypeAssociationElementControleEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationElementTopographieEvenement(TypeAssociationElementTopographieEvenement object) {
				return createTypeAssociationElementTopographieEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEltCtrlEltCtrl(TypeAssociationEltCtrlEltCtrl object) {
				return createTypeAssociationEltCtrlEltCtrlAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEltCtrlEltTopo(TypeAssociationEltCtrlEltTopo object) {
				return createTypeAssociationEltCtrlEltTopoAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEltCtrlMateriel(TypeAssociationEltCtrlMateriel object) {
				return createTypeAssociationEltCtrlMaterielAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEltCtrlSite(TypeAssociationEltCtrlSite object) {
				return createTypeAssociationEltCtrlSiteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEltCtrlTypeEltCtrl(TypeAssociationEltCtrlTypeEltCtrl object) {
				return createTypeAssociationEltCtrlTypeEltCtrlAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEltTopoSite(TypeAssociationEltTopoSite object) {
				return createTypeAssociationEltTopoSiteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrgAction(TypeAssociationEntiteOrgAction object) {
				return createTypeAssociationEntiteOrgActionAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrganisationnellePlanOuOrdre(TypeAssociationEntiteOrganisationnellePlanOuOrdre object) {
				return createTypeAssociationEntiteOrganisationnellePlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrgEltCtrl(TypeAssociationEntiteOrgEltCtrl object) {
				return createTypeAssociationEntiteOrgEltCtrlAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrgEltTopo(TypeAssociationEntiteOrgEltTopo object) {
				return createTypeAssociationEntiteOrgEltTopoAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrgEntiteOrg(TypeAssociationEntiteOrgEntiteOrg object) {
				return createTypeAssociationEntiteOrgEntiteOrgAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrgEvenement(TypeAssociationEntiteOrgEvenement object) {
				return createTypeAssociationEntiteOrgEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrgMateriel(TypeAssociationEntiteOrgMateriel object) {
				return createTypeAssociationEntiteOrgMaterielAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrgObjetInconnu(TypeAssociationEntiteOrgObjetInconnu object) {
				return createTypeAssociationEntiteOrgObjetInconnuAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrgPersonne(TypeAssociationEntiteOrgPersonne object) {
				return createTypeAssociationEntiteOrgPersonneAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEntiteOrgSite(TypeAssociationEntiteOrgSite object) {
				return createTypeAssociationEntiteOrgSiteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEquipementlMajeur(TypeAssociationEquipementlMajeur object) {
				return createTypeAssociationEquipementlMajeurAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEvenementNRBCAction(TypeAssociationEvenementNRBCAction object) {
				return createTypeAssociationEvenementNRBCActionAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEvenementNRBCAutreEvenement(TypeAssociationEvenementNRBCAutreEvenement object) {
				return createTypeAssociationEvenementNRBCAutreEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEvenementNRBCEvenementNRBC(TypeAssociationEvenementNRBCEvenementNRBC object) {
				return createTypeAssociationEvenementNRBCEvenementNRBCAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEvenementRENSAutreEvenement(TypeAssociationEvenementRENSAutreEvenement object) {
				return createTypeAssociationEvenementRENSAutreEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEvenementRENSEvenementRENS(TypeAssociationEvenementRENSEvenementRENS object) {
				return createTypeAssociationEvenementRENSEvenementRENSAdapter();
			}
			@Override
			public Adapter caseTypeAssociationFonctionnelleActivite(TypeAssociationFonctionnelleActivite object) {
				return createTypeAssociationFonctionnelleActiviteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationGroupeInfoOpsEntiteOrganisationnelle(TypeAssociationGroupeInfoOpsEntiteOrganisationnelle object) {
				return createTypeAssociationGroupeInfoOpsEntiteOrganisationnelleAdapter();
			}
			@Override
			public Adapter caseTypeAssociationGroupeInfoOpsPlanOuOrdre(TypeAssociationGroupeInfoOpsPlanOuOrdre object) {
				return createTypeAssociationGroupeInfoOpsPlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypeAssociationHoraireManoeuvre(TypeAssociationHoraireManoeuvre object) {
				return createTypeAssociationHoraireManoeuvreAdapter();
			}
			@Override
			public Adapter caseTypeAssociationInstanceObjetActivite(TypeAssociationInstanceObjetActivite object) {
				return createTypeAssociationInstanceObjetActiviteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationInstanceObjetAdresse(TypeAssociationInstanceObjetAdresse object) {
				return createTypeAssociationInstanceObjetAdresseAdapter();
			}
			@Override
			public Adapter caseTypeAssociationInstanceObjetCapacite(TypeAssociationInstanceObjetCapacite object) {
				return createTypeAssociationInstanceObjetCapaciteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationInstanceObjetInstanceObjet(TypeAssociationInstanceObjetInstanceObjet object) {
				return createTypeAssociationInstanceObjetInstanceObjetAdapter();
			}
			@Override
			public Adapter caseTypeAssociationInstanceObjetType(TypeAssociationInstanceObjetType object) {
				return createTypeAssociationInstanceObjetTypeAdapter();
			}
			@Override
			public Adapter caseTypeAssociationLivraisonLivaison(TypeAssociationLivraisonLivaison object) {
				return createTypeAssociationLivraisonLivaisonAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMaterielEltCtrl(TypeAssociationMaterielEltCtrl object) {
				return createTypeAssociationMaterielEltCtrlAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMaterielEltTopo(TypeAssociationMaterielEltTopo object) {
				return createTypeAssociationMaterielEltTopoAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMaterielEvenement(TypeAssociationMaterielEvenement object) {
				return createTypeAssociationMaterielEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMaterielMateriel(TypeAssociationMaterielMateriel object) {
				return createTypeAssociationMaterielMaterielAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMaterielMeteorologie(TypeAssociationMaterielMeteorologie object) {
				return createTypeAssociationMaterielMeteorologieAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMaterielObjetInconnu(TypeAssociationMaterielObjetInconnu object) {
				return createTypeAssociationMaterielObjetInconnuAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMaterielPersonne(TypeAssociationMaterielPersonne object) {
				return createTypeAssociationMaterielPersonneAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMaterielSite(TypeAssociationMaterielSite object) {
				return createTypeAssociationMaterielSiteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMaterielTypeMateriel(TypeAssociationMaterielTypeMateriel object) {
				return createTypeAssociationMaterielTypeMaterielAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMesureCoordinationPlanFeux(TypeAssociationMesureCoordinationPlanFeux object) {
				return createTypeAssociationMesureCoordinationPlanFeuxAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMesureCoordMissionAerienne(TypeAssociationMesureCoordMissionAerienne object) {
				return createTypeAssociationMesureCoordMissionAerienneAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMeteorologieSite(TypeAssociationMeteorologieSite object) {
				return createTypeAssociationMeteorologieSiteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMissionAerienneMissionAerienne(TypeAssociationMissionAerienneMissionAerienne object) {
				return createTypeAssociationMissionAerienneMissionAerienneAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMissionGenieMissionGenie(TypeAssociationMissionGenieMissionGenie object) {
				return createTypeAssociationMissionGenieMissionGenieAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMissionMeleeAction(TypeAssociationMissionMeleeAction object) {
				return createTypeAssociationMissionMeleeActionAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMissionMouvementMissionMouvement(TypeAssociationMissionMouvementMissionMouvement object) {
				return createTypeAssociationMissionMouvementMissionMouvementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMissionRenseignementAction(TypeAssociationMissionRenseignementAction object) {
				return createTypeAssociationMissionRenseignementActionAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMissionRensObjPlanTraitementObj(TypeAssociationMissionRensObjPlanTraitementObj object) {
				return createTypeAssociationMissionRensObjPlanTraitementObjAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMissionRensObjTraitementObj(TypeAssociationMissionRensObjTraitementObj object) {
				return createTypeAssociationMissionRensObjTraitementObjAdapter();
			}
			@Override
			public Adapter caseTypeAssociationMouvementParRouteMouvementParRoute(TypeAssociationMouvementParRouteMouvementParRoute object) {
				return createTypeAssociationMouvementParRouteMouvementParRouteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationObjectifActiviteLocalisation(TypeAssociationObjectifActiviteLocalisation object) {
				return createTypeAssociationObjectifActiviteLocalisationAdapter();
			}
			@Override
			public Adapter caseTypeAssociationObjectifCiblageDocument(TypeAssociationObjectifCiblageDocument object) {
				return createTypeAssociationObjectifCiblageDocumentAdapter();
			}
			@Override
			public Adapter caseTypeAssociationObjectifCiblageLocalisation(TypeAssociationObjectifCiblageLocalisation object) {
				return createTypeAssociationObjectifCiblageLocalisationAdapter();
			}
			@Override
			public Adapter caseTypeAssociationObjectifCiblageObjectifCiblage(TypeAssociationObjectifCiblageObjectifCiblage object) {
				return createTypeAssociationObjectifCiblageObjectifCiblageAdapter();
			}
			@Override
			public Adapter caseTypeAssociationObjetInconnuEltCtrl(TypeAssociationObjetInconnuEltCtrl object) {
				return createTypeAssociationObjetInconnuEltCtrlAdapter();
			}
			@Override
			public Adapter caseTypeAssociationObjetInconnuEltTopo(TypeAssociationObjetInconnuEltTopo object) {
				return createTypeAssociationObjetInconnuEltTopoAdapter();
			}
			@Override
			public Adapter caseTypeAssociationObjetInconnuSite(TypeAssociationObjetInconnuSite object) {
				return createTypeAssociationObjetInconnuSiteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationObservationObservation(TypeAssociationObservationObservation object) {
				return createTypeAssociationObservationObservationAdapter();
			}
			@Override
			public Adapter caseTypeAssociationParagraphePOparagraphePO(TypeAssociationParagraphePOparagraphePO object) {
				return createTypeAssociationParagraphePOparagraphePOAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonneEltCtrl(TypeAssociationPersonneEltCtrl object) {
				return createTypeAssociationPersonneEltCtrlAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonneEltTopo(TypeAssociationPersonneEltTopo object) {
				return createTypeAssociationPersonneEltTopoAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonneEvenement(TypeAssociationPersonneEvenement object) {
				return createTypeAssociationPersonneEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonneMateriel(TypeAssociationPersonneMateriel object) {
				return createTypeAssociationPersonneMaterielAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonneMissionAir(TypeAssociationPersonneMissionAir object) {
				return createTypeAssociationPersonneMissionAirAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonneObjetInconnu(TypeAssociationPersonneObjetInconnu object) {
				return createTypeAssociationPersonneObjetInconnuAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonnePersonne(TypeAssociationPersonnePersonne object) {
				return createTypeAssociationPersonnePersonneAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonnePlanifOperation3D(TypeAssociationPersonnePlanifOperation3D object) {
				return createTypeAssociationPersonnePlanifOperation3DAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonneSite(TypeAssociationPersonneSite object) {
				return createTypeAssociationPersonneSiteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPersonneTypePersonne(TypeAssociationPersonneTypePersonne object) {
				return createTypeAssociationPersonneTypePersonneAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPlanificationOperation3DMissionAir(TypeAssociationPlanificationOperation3DMissionAir object) {
				return createTypeAssociationPlanificationOperation3DMissionAirAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPlanificationOperation3DMissionASA(TypeAssociationPlanificationOperation3DMissionASA object) {
				return createTypeAssociationPlanificationOperation3DMissionASAAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPlanOuOrdrePlanOuOrdre(TypeAssociationPlanOuOrdrePlanOuOrdre object) {
				return createTypeAssociationPlanOuOrdrePlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypeAssociationPlanTraitementObjTraitementObj(TypeAssociationPlanTraitementObjTraitementObj object) {
				return createTypeAssociationPlanTraitementObjTraitementObjAdapter();
			}
			@Override
			public Adapter caseTypeAssociationProfilDotationTheorique(TypeAssociationProfilDotationTheorique object) {
				return createTypeAssociationProfilDotationTheoriqueAdapter();
			}
			@Override
			public Adapter caseTypeAssociationProfilUnite(TypeAssociationProfilUnite object) {
				return createTypeAssociationProfilUniteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationRacineOperationnelleDocument(TypeAssociationRacineOperationnelleDocument object) {
				return createTypeAssociationRacineOperationnelleDocumentAdapter();
			}
			@Override
			public Adapter caseTypeAssociationRenseignementObjMisRenseignementObj(TypeAssociationRenseignementObjMisRenseignementObj object) {
				return createTypeAssociationRenseignementObjMisRenseignementObjAdapter();
			}
			@Override
			public Adapter caseTypeAssociationSiteEltCtrl(TypeAssociationSiteEltCtrl object) {
				return createTypeAssociationSiteEltCtrlAdapter();
			}
			@Override
			public Adapter caseTypeAssociationSiteEltTopo(TypeAssociationSiteEltTopo object) {
				return createTypeAssociationSiteEltTopoAdapter();
			}
			@Override
			public Adapter caseTypeAssociationSiteEvenement(TypeAssociationSiteEvenement object) {
				return createTypeAssociationSiteEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAssociationSiteMateriel(TypeAssociationSiteMateriel object) {
				return createTypeAssociationSiteMaterielAdapter();
			}
			@Override
			public Adapter caseTypeAssociationSiteMeteorologie(TypeAssociationSiteMeteorologie object) {
				return createTypeAssociationSiteMeteorologieAdapter();
			}
			@Override
			public Adapter caseTypeAssociationSiteObjetInconnu(TypeAssociationSiteObjetInconnu object) {
				return createTypeAssociationSiteObjetInconnuAdapter();
			}
			@Override
			public Adapter caseTypeAssociationSiteSite(TypeAssociationSiteSite object) {
				return createTypeAssociationSiteSiteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationSiteTypeSite(TypeAssociationSiteTypeSite object) {
				return createTypeAssociationSiteTypeSiteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationSyntheseDetectionsEvenementNRBC(TypeAssociationSyntheseDetectionsEvenementNRBC object) {
				return createTypeAssociationSyntheseDetectionsEvenementNRBCAdapter();
			}
			@Override
			public Adapter caseTypeAssociationTemporelleActivite(TypeAssociationTemporelleActivite object) {
				return createTypeAssociationTemporelleActiviteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationTraitementObjPlanTraitementObj(TypeAssociationTraitementObjPlanTraitementObj object) {
				return createTypeAssociationTraitementObjPlanTraitementObjAdapter();
			}
			@Override
			public Adapter caseTypeAssociationTypeCapacite(TypeAssociationTypeCapacite object) {
				return createTypeAssociationTypeCapaciteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteAppuiFeuHelicoptere(TypeAssociationUniteAppuiFeuHelicoptere object) {
				return createTypeAssociationUniteAppuiFeuHelicoptereAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteAutreMissionLog(TypeAssociationUniteAutreMissionLog object) {
				return createTypeAssociationUniteAutreMissionLogAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteLivraison(TypeAssociationUniteLivraison object) {
				return createTypeAssociationUniteLivraisonAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionAcqASS(TypeAssociationUniteMissionAcqASS object) {
				return createTypeAssociationUniteMissionAcqASSAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionAerienne(TypeAssociationUniteMissionAerienne object) {
				return createTypeAssociationUniteMissionAerienneAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionAir(TypeAssociationUniteMissionAir object) {
				return createTypeAssociationUniteMissionAirAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionALATattaque(TypeAssociationUniteMissionALATattaque object) {
				return createTypeAssociationUniteMissionALATattaqueAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionASA(TypeAssociationUniteMissionASA object) {
				return createTypeAssociationUniteMissionASAAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionEscorteAF(TypeAssociationUniteMissionEscorteAF object) {
				return createTypeAssociationUniteMissionEscorteAFAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionGenie(TypeAssociationUniteMissionGenie object) {
				return createTypeAssociationUniteMissionGenieAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionMelee(TypeAssociationUniteMissionMelee object) {
				return createTypeAssociationUniteMissionMeleeAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionRensObj(TypeAssociationUniteMissionRensObj object) {
				return createTypeAssociationUniteMissionRensObjAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionSic(TypeAssociationUniteMissionSic object) {
				return createTypeAssociationUniteMissionSicAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionTranspTact(TypeAssociationUniteMissionTranspTact object) {
				return createTypeAssociationUniteMissionTranspTactAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMissionUniteAntichar(TypeAssociationUniteMissionUniteAntichar object) {
				return createTypeAssociationUniteMissionUniteAnticharAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteMouvementParRoute(TypeAssociationUniteMouvementParRoute object) {
				return createTypeAssociationUniteMouvementParRouteAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUnitePlanFeux(TypeAssociationUnitePlanFeux object) {
				return createTypeAssociationUnitePlanFeuxAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUnitePlanifOperation3D(TypeAssociationUnitePlanifOperation3D object) {
				return createTypeAssociationUnitePlanifOperation3DAdapter();
			}
			@Override
			public Adapter caseTypeAssociationUniteRenforcementsFeux(TypeAssociationUniteRenforcementsFeux object) {
				return createTypeAssociationUniteRenforcementsFeuxAdapter();
			}
			@Override
			public Adapter caseTypeAssocInstanceObjetLocalisation(TypeAssocInstanceObjetLocalisation object) {
				return createTypeAssocInstanceObjetLocalisationAdapter();
			}
			@Override
			public Adapter caseTypeAssocListeObjCandListeObjCand(TypeAssocListeObjCandListeObjCand object) {
				return createTypeAssocListeObjCandListeObjCandAdapter();
			}
			@Override
			public Adapter caseTypeAssocPisteAtterDirAppAir(TypeAssocPisteAtterDirAppAir object) {
				return createTypeAssocPisteAtterDirAppAirAdapter();
			}
			@Override
			public Adapter caseTypeAssocSymboleTactique(TypeAssocSymboleTactique object) {
				return createTypeAssocSymboleTactiqueAdapter();
			}
			@Override
			public Adapter caseTypeAtmosphere(TypeAtmosphere object) {
				return createTypeAtmosphereAdapter();
			}
			@Override
			public Adapter caseTypeAutonomieModule(TypeAutonomieModule object) {
				return createTypeAutonomieModuleAdapter();
			}
			@Override
			public Adapter caseTypeAutorisationListeObjectifsCandidats(TypeAutorisationListeObjectifsCandidats object) {
				return createTypeAutorisationListeObjectifsCandidatsAdapter();
			}
			@Override
			public Adapter caseTypeAutorisationObjectifCiblage(TypeAutorisationObjectifCiblage object) {
				return createTypeAutorisationObjectifCiblageAdapter();
			}
			@Override
			public Adapter caseTypeAutreAction(TypeAutreAction object) {
				return createTypeAutreActionAdapter();
			}
			@Override
			public Adapter caseTypeAutreAdresse(TypeAutreAdresse object) {
				return createTypeAutreAdresseAdapter();
			}
			@Override
			public Adapter caseTypeAutreAffiliation(TypeAutreAffiliation object) {
				return createTypeAutreAffiliationAdapter();
			}
			@Override
			public Adapter caseTypeAutreArticulation(TypeAutreArticulation object) {
				return createTypeAutreArticulationAdapter();
			}
			@Override
			public Adapter caseTypeAutreCapteurRENS(TypeAutreCapteurRENS object) {
				return createTypeAutreCapteurRENSAdapter();
			}
			@Override
			public Adapter caseTypeAutreContexte(TypeAutreContexte object) {
				return createTypeAutreContexteAdapter();
			}
			@Override
			public Adapter caseTypeAutreDotationEffective(TypeAutreDotationEffective object) {
				return createTypeAutreDotationEffectiveAdapter();
			}
			@Override
			public Adapter caseTypeAutreElementControle(TypeAutreElementControle object) {
				return createTypeAutreElementControleAdapter();
			}
			@Override
			public Adapter caseTypeAutreEmploi(TypeAutreEmploi object) {
				return createTypeAutreEmploiAdapter();
			}
			@Override
			public Adapter caseTypeAutreEvenement(TypeAutreEvenement object) {
				return createTypeAutreEvenementAdapter();
			}
			@Override
			public Adapter caseTypeAutreEvenementNRBC(TypeAutreEvenementNRBC object) {
				return createTypeAutreEvenementNRBCAdapter();
			}
			@Override
			public Adapter caseTypeAutreEvenementNucleaire(TypeAutreEvenementNucleaire object) {
				return createTypeAutreEvenementNucleaireAdapter();
			}
			@Override
			public Adapter caseTypeAutreEvenementRadioactif(TypeAutreEvenementRadioactif object) {
				return createTypeAutreEvenementRadioactifAdapter();
			}
			@Override
			public Adapter caseTypeAutreListeObjectifs(TypeAutreListeObjectifs object) {
				return createTypeAutreListeObjectifsAdapter();
			}
			@Override
			public Adapter caseTypeAutreMateriel(TypeAutreMateriel object) {
				return createTypeAutreMaterielAdapter();
			}
			@Override
			public Adapter caseTypeAutreMenace(TypeAutreMenace object) {
				return createTypeAutreMenaceAdapter();
			}
			@Override
			public Adapter caseTypeAutreMission(TypeAutreMission object) {
				return createTypeAutreMissionAdapter();
			}
			@Override
			public Adapter caseTypeAutreMissionALAT(TypeAutreMissionALAT object) {
				return createTypeAutreMissionALATAdapter();
			}
			@Override
			public Adapter caseTypeAutreMissionLogistique(TypeAutreMissionLogistique object) {
				return createTypeAutreMissionLogistiqueAdapter();
			}
			@Override
			public Adapter caseTypeAutreNom(TypeAutreNom object) {
				return createTypeAutreNomAdapter();
			}
			@Override
			public Adapter caseTypeAutreObjectifActiviteType(TypeAutreObjectifActiviteType object) {
				return createTypeAutreObjectifActiviteTypeAdapter();
			}
			@Override
			public Adapter caseTypeAutreObstacle(TypeAutreObstacle object) {
				return createTypeAutreObstacleAdapter();
			}
			@Override
			public Adapter caseTypeAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique object) {
				return createTypeAutrePhenomeneMeteorologiqueAdapter();
			}
			@Override
			public Adapter caseTypeAutreSegmentItineraire(TypeAutreSegmentItineraire object) {
				return createTypeAutreSegmentItineraireAdapter();
			}
			@Override
			public Adapter caseTypeAutreSite(TypeAutreSite object) {
				return createTypeAutreSiteAdapter();
			}
			@Override
			public Adapter caseTypeAutreTypeBatiment(TypeAutreTypeBatiment object) {
				return createTypeAutreTypeBatimentAdapter();
			}
			@Override
			public Adapter caseTypeAutreTypeConsommable(TypeAutreTypeConsommable object) {
				return createTypeAutreTypeConsommableAdapter();
			}
			@Override
			public Adapter caseTypeAutreTypeConsommableSystemeArme(TypeAutreTypeConsommableSystemeArme object) {
				return createTypeAutreTypeConsommableSystemeArmeAdapter();
			}
			@Override
			public Adapter caseTypeAutreTypeElementControle(TypeAutreTypeElementControle object) {
				return createTypeAutreTypeElementControleAdapter();
			}
			@Override
			public Adapter caseTypeAutreTypeEntiteOrganisationnelle(TypeAutreTypeEntiteOrganisationnelle object) {
				return createTypeAutreTypeEntiteOrganisationnelleAdapter();
			}
			@Override
			public Adapter caseTypeAutreTypeEquipement(TypeAutreTypeEquipement object) {
				return createTypeAutreTypeEquipementAdapter();
			}
			@Override
			public Adapter caseTypeAutreTypeOrganisationGouvernementale(TypeAutreTypeOrganisationGouvernementale object) {
				return createTypeAutreTypeOrganisationGouvernementaleAdapter();
			}
			@Override
			public Adapter caseTypeAutreTypeSite(TypeAutreTypeSite object) {
				return createTypeAutreTypeSiteAdapter();
			}
			@Override
			public Adapter caseTypeAvancementTravailGenie(TypeAvancementTravailGenie object) {
				return createTypeAvancementTravailGenieAdapter();
			}
			@Override
			public Adapter caseTypeAxe(TypeAxe object) {
				return createTypeAxeAdapter();
			}
			@Override
			public Adapter caseTypeAzimut(TypeAzimut object) {
				return createTypeAzimutAdapter();
			}
			@Override
			public Adapter caseTypeBaseCalculNecessaire(TypeBaseCalculNecessaire object) {
				return createTypeBaseCalculNecessaireAdapter();
			}
			@Override
			public Adapter caseTypeBassin(TypeBassin object) {
				return createTypeBassinAdapter();
			}
			@Override
			public Adapter caseTypeBatiment(TypeBatiment object) {
				return createTypeBatimentAdapter();
			}
			@Override
			public Adapter caseTypeBesoinEnCarburant(TypeBesoinEnCarburant object) {
				return createTypeBesoinEnCarburantAdapter();
			}
			@Override
			public Adapter caseTypeBesoinRaccordement(TypeBesoinRaccordement object) {
				return createTypeBesoinRaccordementAdapter();
			}
			@Override
			public Adapter caseTypeBesoinsEnRenseignements(TypeBesoinsEnRenseignements object) {
				return createTypeBesoinsEnRenseignementsAdapter();
			}
			@Override
			public Adapter caseTypeBilanModule(TypeBilanModule object) {
				return createTypeBilanModuleAdapter();
			}
			@Override
			public Adapter caseTypeBilanTirsASS(TypeBilanTirsASS object) {
				return createTypeBilanTirsASSAdapter();
			}
			@Override
			public Adapter caseTypeBilanTirsASSsurZone(TypeBilanTirsASSsurZone object) {
				return createTypeBilanTirsASSsurZoneAdapter();
			}
			@Override
			public Adapter caseTypeBlessesParPeriode(TypeBlessesParPeriode object) {
				return createTypeBlessesParPeriodeAdapter();
			}
			@Override
			public Adapter caseTypeBrancheEurogrid(TypeBrancheEurogrid object) {
				return createTypeBrancheEurogridAdapter();
			}
			@Override
			public Adapter caseTypeBrancheNavigation(TypeBrancheNavigation object) {
				return createTypeBrancheNavigationAdapter();
			}
			@Override
			public Adapter caseTypeBulletinSondage(TypeBulletinSondage object) {
				return createTypeBulletinSondageAdapter();
			}
			@Override
			public Adapter caseTypeCaleLancement(TypeCaleLancement object) {
				return createTypeCaleLancementAdapter();
			}
			@Override
			public Adapter caseTypeCalendrierCourrier(TypeCalendrierCourrier object) {
				return createTypeCalendrierCourrierAdapter();
			}
			@Override
			public Adapter caseTypeCaleSeche(TypeCaleSeche object) {
				return createTypeCaleSecheAdapter();
			}
			@Override
			public Adapter caseTypeCamp(TypeCamp object) {
				return createTypeCampAdapter();
			}
			@Override
			public Adapter caseTypeCapacite(TypeCapacite object) {
				return createTypeCapaciteAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteFeux(TypeCapaciteFeux object) {
				return createTypeCapaciteFeuxAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteGenie(TypeCapaciteGenie object) {
				return createTypeCapaciteGenieAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteHebergement(TypeCapaciteHebergement object) {
				return createTypeCapaciteHebergementAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteMaintenance(TypeCapaciteMaintenance object) {
				return createTypeCapaciteMaintenanceAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteManutention(TypeCapaciteManutention object) {
				return createTypeCapaciteManutentionAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteMobilite(TypeCapaciteMobilite object) {
				return createTypeCapaciteMobiliteAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteObservationASS(TypeCapaciteObservationASS object) {
				return createTypeCapaciteObservationASSAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteOperationnelle(TypeCapaciteOperationnelle object) {
				return createTypeCapaciteOperationnelleAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteReseau(TypeCapaciteReseau object) {
				return createTypeCapaciteReseauAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteSoutien(TypeCapaciteSoutien object) {
				return createTypeCapaciteSoutienAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteStockage(TypeCapaciteStockage object) {
				return createTypeCapaciteStockageAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteSurveillance(TypeCapaciteSurveillance object) {
				return createTypeCapaciteSurveillanceAdapter();
			}
			@Override
			public Adapter caseTypeCapaciteTransmission(TypeCapaciteTransmission object) {
				return createTypeCapaciteTransmissionAdapter();
			}
			@Override
			public Adapter caseTypeCapteurDrone(TypeCapteurDrone object) {
				return createTypeCapteurDroneAdapter();
			}
			@Override
			public Adapter caseTypeCapteurLocalisationRadioelectrique(TypeCapteurLocalisationRadioelectrique object) {
				return createTypeCapteurLocalisationRadioelectriqueAdapter();
			}
			@Override
			public Adapter caseTypeCapteurRadar(TypeCapteurRadar object) {
				return createTypeCapteurRadarAdapter();
			}
			@Override
			public Adapter caseTypeCapteurRENS(TypeCapteurRENS object) {
				return createTypeCapteurRENSAdapter();
			}
			@Override
			public Adapter caseTypeCapteurROHUM(TypeCapteurROHUM object) {
				return createTypeCapteurROHUMAdapter();
			}
			@Override
			public Adapter caseTypeCaracteristiqueAutreSite(TypeCaracteristiqueAutreSite object) {
				return createTypeCaracteristiqueAutreSiteAdapter();
			}
			@Override
			public Adapter caseTypeCaracteristiqueComplementaireObstacle(TypeCaracteristiqueComplementaireObstacle object) {
				return createTypeCaracteristiqueComplementaireObstacleAdapter();
			}
			@Override
			public Adapter caseTypeCaracteristiqueGroupeIndividus(TypeCaracteristiqueGroupeIndividus object) {
				return createTypeCaracteristiqueGroupeIndividusAdapter();
			}
			@Override
			public Adapter caseTypeCaracteristiqueLogistique(TypeCaracteristiqueLogistique object) {
				return createTypeCaracteristiqueLogistiqueAdapter();
			}
			@Override
			public Adapter caseTypeCaracteristiquesAssocInstanceObjetLocalisation(TypeCaracteristiquesAssocInstanceObjetLocalisation object) {
				return createTypeCaracteristiquesAssocInstanceObjetLocalisationAdapter();
			}
			@Override
			public Adapter caseTypeCaracteristiquesMouvement(TypeCaracteristiquesMouvement object) {
				return createTypeCaracteristiquesMouvementAdapter();
			}
			@Override
			public Adapter caseTypeCaracteristiquesSIO(TypeCaracteristiquesSIO object) {
				return createTypeCaracteristiquesSIOAdapter();
			}
			@Override
			public Adapter caseTypeCaracteristiqueTransport(TypeCaracteristiqueTransport object) {
				return createTypeCaracteristiqueTransportAdapter();
			}
			@Override
			public Adapter caseTypeCaracteristiqueZoneContaminee(TypeCaracteristiqueZoneContaminee object) {
				return createTypeCaracteristiqueZoneContamineeAdapter();
			}
			@Override
			public Adapter caseTypeCarnetPoints(TypeCarnetPoints object) {
				return createTypeCarnetPointsAdapter();
			}
			@Override
			public Adapter caseTypeCelluleSoutien(TypeCelluleSoutien object) {
				return createTypeCelluleSoutienAdapter();
			}
			@Override
			public Adapter caseTypeCentreASA(TypeCentreASA object) {
				return createTypeCentreASAAdapter();
			}
			@Override
			public Adapter caseTypeCentreLLAPI(TypeCentreLLAPI object) {
				return createTypeCentreLLAPIAdapter();
			}
			@Override
			public Adapter caseTypeCentreNC23(TypeCentreNC23 object) {
				return createTypeCentreNC23Adapter();
			}
			@Override
			public Adapter caseTypeCercleGeometrique(TypeCercleGeometrique object) {
				return createTypeCercleGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeChampMines(TypeChampMines object) {
				return createTypeChampMinesAdapter();
			}
			@Override
			public Adapter caseTypeChampMinesMaritime(TypeChampMinesMaritime object) {
				return createTypeChampMinesMaritimeAdapter();
			}
			@Override
			public Adapter caseTypeChampMinesMaritimeDommagesEstimes(TypeChampMinesMaritimeDommagesEstimes object) {
				return createTypeChampMinesMaritimeDommagesEstimesAdapter();
			}
			@Override
			public Adapter caseTypeChampMinesTerrestre(TypeChampMinesTerrestre object) {
				return createTypeChampMinesTerrestreAdapter();
			}
			@Override
			public Adapter caseTypeChargement(TypeChargement object) {
				return createTypeChargementAdapter();
			}
			@Override
			public Adapter caseTypeChargementMateriel(TypeChargementMateriel object) {
				return createTypeChargementMaterielAdapter();
			}
			@Override
			public Adapter caseTypeCharnier(TypeCharnier object) {
				return createTypeCharnierAdapter();
			}
			@Override
			public Adapter caseTypeCheminFer(TypeCheminFer object) {
				return createTypeCheminFerAdapter();
			}
			@Override
			public Adapter caseTypeCompetenceLinguistique(TypeCompetenceLinguistique object) {
				return createTypeCompetenceLinguistiqueAdapter();
			}
			@Override
			public Adapter caseTypeComportement(TypeComportement object) {
				return createTypeComportementAdapter();
			}
			@Override
			public Adapter caseTypeComportementSecours(TypeComportementSecours object) {
				return createTypeComportementSecoursAdapter();
			}
			@Override
			public Adapter caseTypeComposanteAppui(TypeComposanteAppui object) {
				return createTypeComposanteAppuiAdapter();
			}
			@Override
			public Adapter caseTypeCompositionDotationTheoriqueEnType(TypeCompositionDotationTheoriqueEnType object) {
				return createTypeCompositionDotationTheoriqueEnTypeAdapter();
			}
			@Override
			public Adapter caseTypeComptage(TypeComptage object) {
				return createTypeComptageAdapter();
			}
			@Override
			public Adapter caseTypeComptageParActivite(TypeComptageParActivite object) {
				return createTypeComptageParActiviteAdapter();
			}
			@Override
			public Adapter caseTypeCompteRenduMouvement(TypeCompteRenduMouvement object) {
				return createTypeCompteRenduMouvementAdapter();
			}
			@Override
			public Adapter caseTypeCompteRenduTir(TypeCompteRenduTir object) {
				return createTypeCompteRenduTirAdapter();
			}
			@Override
			public Adapter caseTypeConduiteATenir(TypeConduiteATenir object) {
				return createTypeConduiteATenirAdapter();
			}
			@Override
			public Adapter caseTypeConeGeometrique(TypeConeGeometrique object) {
				return createTypeConeGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeConfiguration(TypeConfiguration object) {
				return createTypeConfigurationAdapter();
			}
			@Override
			public Adapter caseTypeConflit3D(TypeConflit3D object) {
				return createTypeConflit3DAdapter();
			}
			@Override
			public Adapter caseTypeConsigne(TypeConsigne object) {
				return createTypeConsigneAdapter();
			}
			@Override
			public Adapter caseTypeConsigneGeographique(TypeConsigneGeographique object) {
				return createTypeConsigneGeographiqueAdapter();
			}
			@Override
			public Adapter caseTypeConsigneLutteAntiaerienneTTA(TypeConsigneLutteAntiaerienneTTA object) {
				return createTypeConsigneLutteAntiaerienneTTAAdapter();
			}
			@Override
			public Adapter caseTypeConsigneParticuliere(TypeConsigneParticuliere object) {
				return createTypeConsigneParticuliereAdapter();
			}
			@Override
			public Adapter caseTypeConsignesGeneralesTirASA(TypeConsignesGeneralesTirASA object) {
				return createTypeConsignesGeneralesTirASAAdapter();
			}
			@Override
			public Adapter caseTypeConsigneTir(TypeConsigneTir object) {
				return createTypeConsigneTirAdapter();
			}
			@Override
			public Adapter caseTypeConsommableSante(TypeConsommableSante object) {
				return createTypeConsommableSanteAdapter();
			}
			@Override
			public Adapter caseTypeConsommationAutorisee(TypeConsommationAutorisee object) {
				return createTypeConsommationAutoriseeAdapter();
			}
			@Override
			public Adapter caseTypeConsommationEnMunitions(TypeConsommationEnMunitions object) {
				return createTypeConsommationEnMunitionsAdapter();
			}
			@Override
			public Adapter caseTypeConsommationExplosifs(TypeConsommationExplosifs object) {
				return createTypeConsommationExplosifsAdapter();
			}
			@Override
			public Adapter caseTypeConsommationMines(TypeConsommationMines object) {
				return createTypeConsommationMinesAdapter();
			}
			@Override
			public Adapter caseTypeConstatDestruction(TypeConstatDestruction object) {
				return createTypeConstatDestructionAdapter();
			}
			@Override
			public Adapter caseTypeConstatForce(TypeConstatForce object) {
				return createTypeConstatForceAdapter();
			}
			@Override
			public Adapter caseTypeConstatPopulation(TypeConstatPopulation object) {
				return createTypeConstatPopulationAdapter();
			}
			@Override
			public Adapter caseTypeConstatTerrain(TypeConstatTerrain object) {
				return createTypeConstatTerrainAdapter();
			}
			@Override
			public Adapter caseTypeContenuParagraphePlanOuOrdre(TypeContenuParagraphePlanOuOrdre object) {
				return createTypeContenuParagraphePlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypeContenuTextuel(TypeContenuTextuel object) {
				return createTypeContenuTextuelAdapter();
			}
			@Override
			public Adapter caseTypeContexte(TypeContexte object) {
				return createTypeContexteAdapter();
			}
			@Override
			public Adapter caseTypeContraintesMouvement(TypeContraintesMouvement object) {
				return createTypeContraintesMouvementAdapter();
			}
			@Override
			public Adapter caseTypeConvoi(TypeConvoi object) {
				return createTypeConvoiAdapter();
			}
			@Override
			public Adapter caseTypeCoordination4D(TypeCoordination4D object) {
				return createTypeCoordination4DAdapter();
			}
			@Override
			public Adapter caseTypeCoordonneesLatLong(TypeCoordonneesLatLong object) {
				return createTypeCoordonneesLatLongAdapter();
			}
			@Override
			public Adapter caseTypeCorridorGeometrique(TypeCorridorGeometrique object) {
				return createTypeCorridorGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeCouvertureAerienne(TypeCouvertureAerienne object) {
				return createTypeCouvertureAerienneAdapter();
			}
			@Override
			public Adapter caseTypeCouvertureASA(TypeCouvertureASA object) {
				return createTypeCouvertureASAAdapter();
			}
			@Override
			public Adapter caseTypeCouvertureNuageuse(TypeCouvertureNuageuse object) {
				return createTypeCouvertureNuageuseAdapter();
			}
			@Override
			public Adapter caseTypeCRactiviteASS(TypeCRactiviteASS object) {
				return createTypeCRactiviteASSAdapter();
			}
			@Override
			public Adapter caseTypeCRevaluationDegats(TypeCRevaluationDegats object) {
				return createTypeCRevaluationDegatsAdapter();
			}
			@Override
			public Adapter caseTypeCRfinMissionAcquisition(TypeCRfinMissionAcquisition object) {
				return createTypeCRfinMissionAcquisitionAdapter();
			}
			@Override
			public Adapter caseTypeCrIncident(TypeCrIncident object) {
				return createTypeCrIncidentAdapter();
			}
			@Override
			public Adapter caseTypeCriteresIdentification(TypeCriteresIdentification object) {
				return createTypeCriteresIdentificationAdapter();
			}
			@Override
			public Adapter caseTypeCRmouvementAerien(TypeCRmouvementAerien object) {
				return createTypeCRmouvementAerienAdapter();
			}
			@Override
			public Adapter caseTypeCRplanFeux(TypeCRplanFeux object) {
				return createTypeCRplanFeuxAdapter();
			}
			@Override
			public Adapter caseTypeCrReconnaissance(TypeCrReconnaissance object) {
				return createTypeCrReconnaissanceAdapter();
			}
			@Override
			public Adapter caseTypeCRrenseignementObjectif(TypeCRrenseignementObjectif object) {
				return createTypeCRrenseignementObjectifAdapter();
			}
			@Override
			public Adapter caseTypeCRtraitementObjectif(TypeCRtraitementObjectif object) {
				return createTypeCRtraitementObjectifAdapter();
			}
			@Override
			public Adapter caseTypeCylindreGeometrique(TypeCylindreGeometrique object) {
				return createTypeCylindreGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeDatation(TypeDatation object) {
				return createTypeDatationAdapter();
			}
			@Override
			public Adapter caseTypeDeclenchementTir(TypeDeclenchementTir object) {
				return createTypeDeclenchementTirAdapter();
			}
			@Override
			public Adapter caseTypeDefenseAccompagnement(TypeDefenseAccompagnement object) {
				return createTypeDefenseAccompagnementAdapter();
			}
			@Override
			public Adapter caseTypeDefenseAuProfitUnite(TypeDefenseAuProfitUnite object) {
				return createTypeDefenseAuProfitUniteAdapter();
			}
			@Override
			public Adapter caseTypeDegreClassification(TypeDegreClassification object) {
				return createTypeDegreClassificationAdapter();
			}
			@Override
			public Adapter caseTypeDemandeEngagementObjectif(TypeDemandeEngagementObjectif object) {
				return createTypeDemandeEngagementObjectifAdapter();
			}
			@Override
			public Adapter caseTypeDemandeTir(TypeDemandeTir object) {
				return createTypeDemandeTirAdapter();
			}
			@Override
			public Adapter caseTypeDepannageEvacuation(TypeDepannageEvacuation object) {
				return createTypeDepannageEvacuationAdapter();
			}
			@Override
			public Adapter caseTypeDeplacementPersonne(TypeDeplacementPersonne object) {
				return createTypeDeplacementPersonneAdapter();
			}
			@Override
			public Adapter caseTypeDeploiement(TypeDeploiement object) {
				return createTypeDeploiementAdapter();
			}
			@Override
			public Adapter caseTypeDeploiementMARTHA(TypeDeploiementMARTHA object) {
				return createTypeDeploiementMARTHAAdapter();
			}
			@Override
			public Adapter caseTypeDeploiementMoyensASAc3d(TypeDeploiementMoyensASAc3d object) {
				return createTypeDeploiementMoyensASAc3dAdapter();
			}
			@Override
			public Adapter caseTypeDepotACreer(TypeDepotACreer object) {
				return createTypeDepotACreerAdapter();
			}
			@Override
			public Adapter caseTypeDescriptionPersonne(TypeDescriptionPersonne object) {
				return createTypeDescriptionPersonneAdapter();
			}
			@Override
			public Adapter caseTypeDesignationUniteOuEquipementENI(TypeDesignationUniteOuEquipementENI object) {
				return createTypeDesignationUniteOuEquipementENIAdapter();
			}
			@Override
			public Adapter caseTypeDestinatairePlanOuOrdre(TypeDestinatairePlanOuOrdre object) {
				return createTypeDestinatairePlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypeDetachementIdentifie(TypeDetachementIdentifie object) {
				return createTypeDetachementIdentifieAdapter();
			}
			@Override
			public Adapter caseTypeDetachementNonIdentifie(TypeDetachementNonIdentifie object) {
				return createTypeDetachementNonIdentifieAdapter();
			}
			@Override
			public Adapter caseTypeDetailEvenement(TypeDetailEvenement object) {
				return createTypeDetailEvenementAdapter();
			}
			@Override
			public Adapter caseTypeDirectionApprocheAir(TypeDirectionApprocheAir object) {
				return createTypeDirectionApprocheAirAdapter();
			}
			@Override
			public Adapter caseTypeDirectiveEMCONpourUniteASA(TypeDirectiveEMCONpourUniteASA object) {
				return createTypeDirectiveEMCONpourUniteASAAdapter();
			}
			@Override
			public Adapter caseTypeDirectivesWEZ(TypeDirectivesWEZ object) {
				return createTypeDirectivesWEZAdapter();
			}
			@Override
			public Adapter caseTypeDirectiveTir(TypeDirectiveTir object) {
				return createTypeDirectiveTirAdapter();
			}
			@Override
			public Adapter caseTypeDisponibilitePourPlanFeux(TypeDisponibilitePourPlanFeux object) {
				return createTypeDisponibilitePourPlanFeuxAdapter();
			}
			@Override
			public Adapter caseTypeDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique object) {
				return createTypeDistanceVerticaleGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeDocument(TypeDocument object) {
				return createTypeDocumentAdapter();
			}
			@Override
			public Adapter caseTypeDocumentIdentificationPersonne(TypeDocumentIdentificationPersonne object) {
				return createTypeDocumentIdentificationPersonneAdapter();
			}
			@Override
			public Adapter caseTypeDomaineActiviteCentre(TypeDomaineActiviteCentre object) {
				return createTypeDomaineActiviteCentreAdapter();
			}
			@Override
			public Adapter caseTypeDoseRadiationAbsorbe(TypeDoseRadiationAbsorbe object) {
				return createTypeDoseRadiationAbsorbeAdapter();
			}
			@Override
			public Adapter caseTypeDotationEffective(TypeDotationEffective object) {
				return createTypeDotationEffectiveAdapter();
			}
			@Override
			public Adapter caseTypeDotationEffectiveConsommable(TypeDotationEffectiveConsommable object) {
				return createTypeDotationEffectiveConsommableAdapter();
			}
			@Override
			public Adapter caseTypeDotationEffectiveEffectif(TypeDotationEffectiveEffectif object) {
				return createTypeDotationEffectiveEffectifAdapter();
			}
			@Override
			public Adapter caseTypeDotationEffectiveEquipement(TypeDotationEffectiveEquipement object) {
				return createTypeDotationEffectiveEquipementAdapter();
			}
			@Override
			public Adapter caseTypeDotationTheorique(TypeDotationTheorique object) {
				return createTypeDotationTheoriqueAdapter();
			}
			@Override
			public Adapter caseTypeDotationTheoriqueInstanceObjet(TypeDotationTheoriqueInstanceObjet object) {
				return createTypeDotationTheoriqueInstanceObjetAdapter();
			}
			@Override
			public Adapter caseTypeDureeIntervention(TypeDureeIntervention object) {
				return createTypeDureeInterventionAdapter();
			}
			@Override
			public Adapter caseTypeEchelon(TypeEchelon object) {
				return createTypeEchelonAdapter();
			}
			@Override
			public Adapter caseTypeEffectifNecessaire(TypeEffectifNecessaire object) {
				return createTypeEffectifNecessaireAdapter();
			}
			@Override
			public Adapter caseTypeEffectifOuEnginAffecte(TypeEffectifOuEnginAffecte object) {
				return createTypeEffectifOuEnginAffecteAdapter();
			}
			@Override
			public Adapter caseTypeEffet(TypeEffet object) {
				return createTypeEffetAdapter();
			}
			@Override
			public Adapter caseTypeEffetAuContactASS(TypeEffetAuContactASS object) {
				return createTypeEffetAuContactASSAdapter();
			}
			@Override
			public Adapter caseTypeEffetConstate(TypeEffetConstate object) {
				return createTypeEffetConstateAdapter();
			}
			@Override
			public Adapter caseTypeEffetProfondeurASS(TypeEffetProfondeurASS object) {
				return createTypeEffetProfondeurASSAdapter();
			}
			@Override
			public Adapter caseTypeEffetSurInstanceObjet(TypeEffetSurInstanceObjet object) {
				return createTypeEffetSurInstanceObjetAdapter();
			}
			@Override
			public Adapter caseTypeEffetSurType(TypeEffetSurType object) {
				return createTypeEffetSurTypeAdapter();
			}
			@Override
			public Adapter caseTypeEffetTactiqueRecherche(TypeEffetTactiqueRecherche object) {
				return createTypeEffetTactiqueRechercheAdapter();
			}
			@Override
			public Adapter caseTypeEffetTactiqueRechercheParENI(TypeEffetTactiqueRechercheParENI object) {
				return createTypeEffetTactiqueRechercheParENIAdapter();
			}
			@Override
			public Adapter caseTypeEfficaciteProbabiliste(TypeEfficaciteProbabiliste object) {
				return createTypeEfficaciteProbabilisteAdapter();
			}
			@Override
			public Adapter caseTypeElementContexte(TypeElementContexte object) {
				return createTypeElementContexteAdapter();
			}
			@Override
			public Adapter caseTypeElementControle(TypeElementControle object) {
				return createTypeElementControleAdapter();
			}
			@Override
			public Adapter caseTypeElementCRintermediaireAcquisition(TypeElementCRintermediaireAcquisition object) {
				return createTypeElementCRintermediaireAcquisitionAdapter();
			}
			@Override
			public Adapter caseTypeElementMeteo(TypeElementMeteo object) {
				return createTypeElementMeteoAdapter();
			}
			@Override
			public Adapter caseTypeElementParticulierADefendre(TypeElementParticulierADefendre object) {
				return createTypeElementParticulierADefendreAdapter();
			}
			@Override
			public Adapter caseTypeElementTopographie(TypeElementTopographie object) {
				return createTypeElementTopographieAdapter();
			}
			@Override
			public Adapter caseTypeElementVital(TypeElementVital object) {
				return createTypeElementVitalAdapter();
			}
			@Override
			public Adapter caseTypeEllipseGeometrique(TypeEllipseGeometrique object) {
				return createTypeEllipseGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeEmploi(TypeEmploi object) {
				return createTypeEmploiAdapter();
			}
			@Override
			public Adapter caseTypeEmploiAeronef(TypeEmploiAeronef object) {
				return createTypeEmploiAeronefAdapter();
			}
			@Override
			public Adapter caseTypeEmploiFrequence(TypeEmploiFrequence object) {
				return createTypeEmploiFrequenceAdapter();
			}
			@Override
			public Adapter caseTypeEmploiGuerreElectronique(TypeEmploiGuerreElectronique object) {
				return createTypeEmploiGuerreElectroniqueAdapter();
			}
			@Override
			public Adapter caseTypeEmploiMaritime(TypeEmploiMaritime object) {
				return createTypeEmploiMaritimeAdapter();
			}
			@Override
			public Adapter caseTypeEmploiReconnaissance(TypeEmploiReconnaissance object) {
				return createTypeEmploiReconnaissanceAdapter();
			}
			@Override
			public Adapter caseTypeEmploiRessourceActivite(TypeEmploiRessourceActivite object) {
				return createTypeEmploiRessourceActiviteAdapter();
			}
			@Override
			public Adapter caseTypeEngagementAvecDelegation(TypeEngagementAvecDelegation object) {
				return createTypeEngagementAvecDelegationAdapter();
			}
			@Override
			public Adapter caseTypeEnnemiFutur(TypeEnnemiFutur object) {
				return createTypeEnnemiFuturAdapter();
			}
			@Override
			public Adapter caseTypeEnTeteParagraphePlanOuOrdre(TypeEnTeteParagraphePlanOuOrdre object) {
				return createTypeEnTeteParagraphePlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypeEntetePlanOuOrdre(TypeEntetePlanOuOrdre object) {
				return createTypeEntetePlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypeEntiteOrganisationnelle(TypeEntiteOrganisationnelle object) {
				return createTypeEntiteOrganisationnelleAdapter();
			}
			@Override
			public Adapter caseTypeEntitePolitique(TypeEntitePolitique object) {
				return createTypeEntitePolitiqueAdapter();
			}
			@Override
			public Adapter caseTypeEnvironnementTerrainEtVegetation(TypeEnvironnementTerrainEtVegetation object) {
				return createTypeEnvironnementTerrainEtVegetationAdapter();
			}
			@Override
			public Adapter caseTypeEquipementHelicoptere(TypeEquipementHelicoptere object) {
				return createTypeEquipementHelicoptereAdapter();
			}
			@Override
			public Adapter caseTypeEquipementOuRessourceEnQuantite(TypeEquipementOuRessourceEnQuantite object) {
				return createTypeEquipementOuRessourceEnQuantiteAdapter();
			}
			@Override
			public Adapter caseTypeEquipesReparation(TypeEquipesReparation object) {
				return createTypeEquipesReparationAdapter();
			}
			@Override
			public Adapter caseTypeEssieu(TypeEssieu object) {
				return createTypeEssieuAdapter();
			}
			@Override
			public Adapter caseTypeEtatAction(TypeEtatAction object) {
				return createTypeEtatActionAdapter();
			}
			@Override
			public Adapter caseTypeEtatAlerteUniteASA(TypeEtatAlerteUniteASA object) {
				return createTypeEtatAlerteUniteASAAdapter();
			}
			@Override
			public Adapter caseTypeEtatAssociation(TypeEtatAssociation object) {
				return createTypeEtatAssociationAdapter();
			}
			@Override
			public Adapter caseTypeEtatCivil(TypeEtatCivil object) {
				return createTypeEtatCivilAdapter();
			}
			@Override
			public Adapter caseTypeEtatElementContexte(TypeEtatElementContexte object) {
				return createTypeEtatElementContexteAdapter();
			}
			@Override
			public Adapter caseTypeEtatEvenement(TypeEtatEvenement object) {
				return createTypeEtatEvenementAdapter();
			}
			@Override
			public Adapter caseTypeEtatLiaison(TypeEtatLiaison object) {
				return createTypeEtatLiaisonAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnel(TypeEtatOperationnel object) {
				return createTypeEtatOperationnelAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelAerodrome(TypeEtatOperationnelAerodrome object) {
				return createTypeEtatOperationnelAerodromeAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelChampMinesMaritime(TypeEtatOperationnelChampMinesMaritime object) {
				return createTypeEtatOperationnelChampMinesMaritimeAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelElementControle(TypeEtatOperationnelElementControle object) {
				return createTypeEtatOperationnelElementControleAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelElementTopographie(TypeEtatOperationnelElementTopographie object) {
				return createTypeEtatOperationnelElementTopographieAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelElementTopographieFluide(TypeEtatOperationnelElementTopographieFluide object) {
				return createTypeEtatOperationnelElementTopographieFluideAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelElementTopographieLiquide(TypeEtatOperationnelElementTopographieLiquide object) {
				return createTypeEtatOperationnelElementTopographieLiquideAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelElementTopographieSolide(TypeEtatOperationnelElementTopographieSolide object) {
				return createTypeEtatOperationnelElementTopographieSolideAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelEntiteOrganisationnelle(TypeEtatOperationnelEntiteOrganisationnelle object) {
				return createTypeEtatOperationnelEntiteOrganisationnelleAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelMateriel(TypeEtatOperationnelMateriel object) {
				return createTypeEtatOperationnelMaterielAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelMedical(TypeEtatOperationnelMedical object) {
				return createTypeEtatOperationnelMedicalAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelMine(TypeEtatOperationnelMine object) {
				return createTypeEtatOperationnelMineAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelObjetInconnu(TypeEtatOperationnelObjetInconnu object) {
				return createTypeEtatOperationnelObjetInconnuAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelPersonnel(TypeEtatOperationnelPersonnel object) {
				return createTypeEtatOperationnelPersonnelAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelSite(TypeEtatOperationnelSite object) {
				return createTypeEtatOperationnelSiteAdapter();
			}
			@Override
			public Adapter caseTypeEtatOperationnelUXO(TypeEtatOperationnelUXO object) {
				return createTypeEtatOperationnelUXOAdapter();
			}
			@Override
			public Adapter caseTypeEtatOrdre(TypeEtatOrdre object) {
				return createTypeEtatOrdreAdapter();
			}
			@Override
			public Adapter caseTypeEtatPlan(TypeEtatPlan object) {
				return createTypeEtatPlanAdapter();
			}
			@Override
			public Adapter caseTypeEtatRegleEngagement(TypeEtatRegleEngagement object) {
				return createTypeEtatRegleEngagementAdapter();
			}
			@Override
			public Adapter caseTypeEtatServiceReseau(TypeEtatServiceReseau object) {
				return createTypeEtatServiceReseauAdapter();
			}
			@Override
			public Adapter caseTypeEtatSic(TypeEtatSic object) {
				return createTypeEtatSicAdapter();
			}
			@Override
			public Adapter caseTypeEtudeDispersion(TypeEtudeDispersion object) {
				return createTypeEtudeDispersionAdapter();
			}
			@Override
			public Adapter caseTypeEvacuationPatients(TypeEvacuationPatients object) {
				return createTypeEvacuationPatientsAdapter();
			}
			@Override
			public Adapter caseTypeEvacuationSanitaire(TypeEvacuationSanitaire object) {
				return createTypeEvacuationSanitaireAdapter();
			}
			@Override
			public Adapter caseTypeEvacuationsParPeriode(TypeEvacuationsParPeriode object) {
				return createTypeEvacuationsParPeriodeAdapter();
			}
			@Override
			public Adapter caseTypeEvaluation(TypeEvaluation object) {
				return createTypeEvaluationAdapter();
			}
			@Override
			public Adapter caseTypeEvenement(TypeEvenement object) {
				return createTypeEvenementAdapter();
			}
			@Override
			public Adapter caseTypeEvenement4D(TypeEvenement4D object) {
				return createTypeEvenement4DAdapter();
			}
			@Override
			public Adapter caseTypeEvenementArmeNucleaire(TypeEvenementArmeNucleaire object) {
				return createTypeEvenementArmeNucleaireAdapter();
			}
			@Override
			public Adapter caseTypeEvenementChimiqueEtBiologique(TypeEvenementChimiqueEtBiologique object) {
				return createTypeEvenementChimiqueEtBiologiqueAdapter();
			}
			@Override
			public Adapter caseTypeEvenementNRBC(TypeEvenementNRBC object) {
				return createTypeEvenementNRBCAdapter();
			}
			@Override
			public Adapter caseTypeEvenementNucleaire(TypeEvenementNucleaire object) {
				return createTypeEvenementNucleaireAdapter();
			}
			@Override
			public Adapter caseTypeEvenementRadioactif(TypeEvenementRadioactif object) {
				return createTypeEvenementRadioactifAdapter();
			}
			@Override
			public Adapter caseTypeEvenementRadiologique(TypeEvenementRadiologique object) {
				return createTypeEvenementRadiologiqueAdapter();
			}
			@Override
			public Adapter caseTypeEvenementRENS(TypeEvenementRENS object) {
				return createTypeEvenementRENSAdapter();
			}
			@Override
			public Adapter caseTypeFaitRenseignement(TypeFaitRenseignement object) {
				return createTypeFaitRenseignementAdapter();
			}
			@Override
			public Adapter caseTypeFinInterdiction(TypeFinInterdiction object) {
				return createTypeFinInterdictionAdapter();
			}
			@Override
			public Adapter caseTypeFonctionPersonne(TypeFonctionPersonne object) {
				return createTypeFonctionPersonneAdapter();
			}
			@Override
			public Adapter caseTypeFrequence(TypeFrequence object) {
				return createTypeFrequenceAdapter();
			}
			@Override
			public Adapter caseTypeGabaritPortee(TypeGabaritPortee object) {
				return createTypeGabaritPorteeAdapter();
			}
			@Override
			public Adapter caseTypeGivrage(TypeGivrage object) {
				return createTypeGivrageAdapter();
			}
			@Override
			public Adapter caseTypeGroupeEthnique(TypeGroupeEthnique object) {
				return createTypeGroupeEthniqueAdapter();
			}
			@Override
			public Adapter caseTypeGroupeFonctionnel(TypeGroupeFonctionnel object) {
				return createTypeGroupeFonctionnelAdapter();
			}
			@Override
			public Adapter caseTypeGroupeIndividus(TypeGroupeIndividus object) {
				return createTypeGroupeIndividusAdapter();
			}
			@Override
			public Adapter caseTypeGroupeInformationsOperationnelles(TypeGroupeInformationsOperationnelles object) {
				return createTypeGroupeInformationsOperationnellesAdapter();
			}
			@Override
			public Adapter caseTypeGroupement(TypeGroupement object) {
				return createTypeGroupementAdapter();
			}
			@Override
			public Adapter caseTypeHippodromeGeometrique(TypeHippodromeGeometrique object) {
				return createTypeHippodromeGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeHoraireManoeuvre(TypeHoraireManoeuvre object) {
				return createTypeHoraireManoeuvreAdapter();
			}
			@Override
			public Adapter caseTypeHypotheseActionENIouAutre(TypeHypotheseActionENIouAutre object) {
				return createTypeHypotheseActionENIouAutreAdapter();
			}
			@Override
			public Adapter caseTypeIncidentMouvement(TypeIncidentMouvement object) {
				return createTypeIncidentMouvementAdapter();
			}
			@Override
			public Adapter caseTypeIndicateurGeostatistique(TypeIndicateurGeostatistique object) {
				return createTypeIndicateurGeostatistiqueAdapter();
			}
			@Override
			public Adapter caseTypeInfrastructure(TypeInfrastructure object) {
				return createTypeInfrastructureAdapter();
			}
			@Override
			public Adapter caseTypeInstanceObjet(TypeInstanceObjet object) {
				return createTypeInstanceObjetAdapter();
			}
			@Override
			public Adapter caseTypeInstructionCoordination(TypeInstructionCoordination object) {
				return createTypeInstructionCoordinationAdapter();
			}
			@Override
			public Adapter caseTypeInterdictionTir(TypeInterdictionTir object) {
				return createTypeInterdictionTirAdapter();
			}
			@Override
			public Adapter caseTypeInterventionGenerale(TypeInterventionGenerale object) {
				return createTypeInterventionGeneraleAdapter();
			}
			@Override
			public Adapter caseTypeInterventionType(TypeInterventionType object) {
				return createTypeInterventionTypeAdapter();
			}
			@Override
			public Adapter caseTypeItineraire(TypeItineraire object) {
				return createTypeItineraireAdapter();
			}
			@Override
			public Adapter caseTypeItineraireFranchissementOuContournement(TypeItineraireFranchissementOuContournement object) {
				return createTypeItineraireFranchissementOuContournementAdapter();
			}
			@Override
			public Adapter caseTypeItineraireOuModeleCheminementALAT(TypeItineraireOuModeleCheminementALAT object) {
				return createTypeItineraireOuModeleCheminementALATAdapter();
			}
			@Override
			public Adapter caseTypeJalon(TypeJalon object) {
				return createTypeJalonAdapter();
			}
			@Override
			public Adapter caseTypeJetee(TypeJetee object) {
				return createTypeJeteeAdapter();
			}
			@Override
			public Adapter caseTypeJonctionReseau(TypeJonctionReseau object) {
				return createTypeJonctionReseauAdapter();
			}
			@Override
			public Adapter caseTypeLangue(TypeLangue object) {
				return createTypeLangueAdapter();
			}
			@Override
			public Adapter caseTypeLiaison(TypeLiaison object) {
				return createTypeLiaisonAdapter();
			}
			@Override
			public Adapter caseTypeLiaisonPhysique(TypeLiaisonPhysique object) {
				return createTypeLiaisonPhysiqueAdapter();
			}
			@Override
			public Adapter caseTypeLiaisonReseau(TypeLiaisonReseau object) {
				return createTypeLiaisonReseauAdapter();
			}
			@Override
			public Adapter caseTypeLigneGeometrique(TypeLigneGeometrique object) {
				return createTypeLigneGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeLigneLivraison(TypeLigneLivraison object) {
				return createTypeLigneLivraisonAdapter();
			}
			@Override
			public Adapter caseTypeLigneRechange(TypeLigneRechange object) {
				return createTypeLigneRechangeAdapter();
			}
			@Override
			public Adapter caseTypeLimite(TypeLimite object) {
				return createTypeLimiteAdapter();
			}
			@Override
			public Adapter caseTypeListeMesuresCoordination3D(TypeListeMesuresCoordination3D object) {
				return createTypeListeMesuresCoordination3DAdapter();
			}
			@Override
			public Adapter caseTypeListeObjectifs(TypeListeObjectifs object) {
				return createTypeListeObjectifsAdapter();
			}
			@Override
			public Adapter caseTypeListeObjectifsCandidats(TypeListeObjectifsCandidats object) {
				return createTypeListeObjectifsCandidatsAdapter();
			}
			@Override
			public Adapter caseTypeListeObjectifsPlanifies(TypeListeObjectifsPlanifies object) {
				return createTypeListeObjectifsPlanifiesAdapter();
			}
			@Override
			public Adapter caseTypeLivraison(TypeLivraison object) {
				return createTypeLivraisonAdapter();
			}
			@Override
			public Adapter caseTypeLocalisation(TypeLocalisation object) {
				return createTypeLocalisationAdapter();
			}
			@Override
			public Adapter caseTypeLocalisationGeometrique(TypeLocalisationGeometrique object) {
				return createTypeLocalisationGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeLocalisationGeometrique2D(TypeLocalisationGeometrique2D object) {
				return createTypeLocalisationGeometrique2DAdapter();
			}
			@Override
			public Adapter caseTypeLocalisationGeometrique3D(TypeLocalisationGeometrique3D object) {
				return createTypeLocalisationGeometrique3DAdapter();
			}
			@Override
			public Adapter caseTypeLocalisationIndefinie(TypeLocalisationIndefinie object) {
				return createTypeLocalisationIndefinieAdapter();
			}
			@Override
			public Adapter caseTypeLocalisationObjectif(TypeLocalisationObjectif object) {
				return createTypeLocalisationObjectifAdapter();
			}
			@Override
			public Adapter caseTypeLumiere(TypeLumiere object) {
				return createTypeLumiereAdapter();
			}
			@Override
			public Adapter caseTypeManutentionAEffectuer(TypeManutentionAEffectuer object) {
				return createTypeManutentionAEffectuerAdapter();
			}
			@Override
			public Adapter caseTypeMarquageObjectif(TypeMarquageObjectif object) {
				return createTypeMarquageObjectifAdapter();
			}
			@Override
			public Adapter caseTypeMateriel(TypeMateriel object) {
				return createTypeMaterielAdapter();
			}
			@Override
			public Adapter caseTypeMementoGenie(TypeMementoGenie object) {
				return createTypeMementoGenieAdapter();
			}
			@Override
			public Adapter caseTypeMenace(TypeMenace object) {
				return createTypeMenaceAdapter();
			}
			@Override
			public Adapter caseTypeMenaceAerienne(TypeMenaceAerienne object) {
				return createTypeMenaceAerienneAdapter();
			}
			@Override
			public Adapter caseTypeMenaceASAeni(TypeMenaceASAeni object) {
				return createTypeMenaceASAeniAdapter();
			}
			@Override
			public Adapter caseTypeMenaceDetection(TypeMenaceDetection object) {
				return createTypeMenaceDetectionAdapter();
			}
			@Override
			public Adapter caseTypeMenaceFeuxENI(TypeMenaceFeuxENI object) {
				return createTypeMenaceFeuxENIAdapter();
			}
			@Override
			public Adapter caseTypeMenaceGenieENI(TypeMenaceGenieENI object) {
				return createTypeMenaceGenieENIAdapter();
			}
			@Override
			public Adapter caseTypeMenacePrioritaire(TypeMenacePrioritaire object) {
				return createTypeMenacePrioritaireAdapter();
			}
			@Override
			public Adapter caseTypeMenacesAeriennesMissionALAT(TypeMenacesAeriennesMissionALAT object) {
				return createTypeMenacesAeriennesMissionALATAdapter();
			}
			@Override
			public Adapter caseTypeMesureCoordination(TypeMesureCoordination object) {
				return createTypeMesureCoordinationAdapter();
			}
			@Override
			public Adapter caseTypeMesureNuage(TypeMesureNuage object) {
				return createTypeMesureNuageAdapter();
			}
			@Override
			public Adapter caseTypeMesuresProtectionElectronique(TypeMesuresProtectionElectronique object) {
				return createTypeMesuresProtectionElectroniqueAdapter();
			}
			@Override
			public Adapter caseTypeMineExplosif(TypeMineExplosif object) {
				return createTypeMineExplosifAdapter();
			}
			@Override
			public Adapter caseTypeMiseEnOeuvreROE(TypeMiseEnOeuvreROE object) {
				return createTypeMiseEnOeuvreROEAdapter();
			}
			@Override
			public Adapter caseTypeMiseEnPlace(TypeMiseEnPlace object) {
				return createTypeMiseEnPlaceAdapter();
			}
			@Override
			public Adapter caseTypeMiseEnPlaceTir(TypeMiseEnPlaceTir object) {
				return createTypeMiseEnPlaceTirAdapter();
			}
			@Override
			public Adapter caseTypeMission(TypeMission object) {
				return createTypeMissionAdapter();
			}
			@Override
			public Adapter caseTypeMissionAcquisitionASS(TypeMissionAcquisitionASS object) {
				return createTypeMissionAcquisitionASSAdapter();
			}
			@Override
			public Adapter caseTypeMissionAerienne(TypeMissionAerienne object) {
				return createTypeMissionAerienneAdapter();
			}
			@Override
			public Adapter caseTypeMissionAir(TypeMissionAir object) {
				return createTypeMissionAirAdapter();
			}
			@Override
			public Adapter caseTypeMissionALATattaque(TypeMissionALATattaque object) {
				return createTypeMissionALATattaqueAdapter();
			}
			@Override
			public Adapter caseTypeMissionAppuiMobilite(TypeMissionAppuiMobilite object) {
				return createTypeMissionAppuiMobiliteAdapter();
			}
			@Override
			public Adapter caseTypeMissionASA(TypeMissionASA object) {
				return createTypeMissionASAAdapter();
			}
			@Override
			public Adapter caseTypeMissionCOBRA(TypeMissionCOBRA object) {
				return createTypeMissionCOBRAAdapter();
			}
			@Override
			public Adapter caseTypeMissionDefenseParticuliere(TypeMissionDefenseParticuliere object) {
				return createTypeMissionDefenseParticuliereAdapter();
			}
			@Override
			public Adapter caseTypeMissionDrone(TypeMissionDrone object) {
				return createTypeMissionDroneAdapter();
			}
			@Override
			public Adapter caseTypeMissionEscorteOuAppuiFeu(TypeMissionEscorteOuAppuiFeu object) {
				return createTypeMissionEscorteOuAppuiFeuAdapter();
			}
			@Override
			public Adapter caseTypeMissionFeux(TypeMissionFeux object) {
				return createTypeMissionFeuxAdapter();
			}
			@Override
			public Adapter caseTypeMissionGenie(TypeMissionGenie object) {
				return createTypeMissionGenieAdapter();
			}
			@Override
			public Adapter caseTypeMissionI3D(TypeMissionI3D object) {
				return createTypeMissionI3DAdapter();
			}
			@Override
			public Adapter caseTypeMissionLocalisationRadioElectrique(TypeMissionLocalisationRadioElectrique object) {
				return createTypeMissionLocalisationRadioElectriqueAdapter();
			}
			@Override
			public Adapter caseTypeMissionLogistique(TypeMissionLogistique object) {
				return createTypeMissionLogistiqueAdapter();
			}
			@Override
			public Adapter caseTypeMissionMaintenance(TypeMissionMaintenance object) {
				return createTypeMissionMaintenanceAdapter();
			}
			@Override
			public Adapter caseTypeMissionMelee(TypeMissionMelee object) {
				return createTypeMissionMeleeAdapter();
			}
			@Override
			public Adapter caseTypeMissionMouvement(TypeMissionMouvement object) {
				return createTypeMissionMouvementAdapter();
			}
			@Override
			public Adapter caseTypeMissionRadar(TypeMissionRadar object) {
				return createTypeMissionRadarAdapter();
			}
			@Override
			public Adapter caseTypeMissionRavitaillement(TypeMissionRavitaillement object) {
				return createTypeMissionRavitaillementAdapter();
			}
			@Override
			public Adapter caseTypeMissionRenseignement(TypeMissionRenseignement object) {
				return createTypeMissionRenseignementAdapter();
			}
			@Override
			public Adapter caseTypeMissionRenseignementObjectif(TypeMissionRenseignementObjectif object) {
				return createTypeMissionRenseignementObjectifAdapter();
			}
			@Override
			public Adapter caseTypeMissionRohum(TypeMissionRohum object) {
				return createTypeMissionRohumAdapter();
			}
			@Override
			public Adapter caseTypeMissionSarCombat(TypeMissionSarCombat object) {
				return createTypeMissionSarCombatAdapter();
			}
			@Override
			public Adapter caseTypeMissionSic(TypeMissionSic object) {
				return createTypeMissionSicAdapter();
			}
			@Override
			public Adapter caseTypeMissionSurveillance(TypeMissionSurveillance object) {
				return createTypeMissionSurveillanceAdapter();
			}
			@Override
			public Adapter caseTypeMissionTransportTactique(TypeMissionTransportTactique object) {
				return createTypeMissionTransportTactiqueAdapter();
			}
			@Override
			public Adapter caseTypeMissionUniteAntichar(TypeMissionUniteAntichar object) {
				return createTypeMissionUniteAnticharAdapter();
			}
			@Override
			public Adapter caseTypeMissionZoneADefendre(TypeMissionZoneADefendre object) {
				return createTypeMissionZoneADefendreAdapter();
			}
			@Override
			public Adapter caseTypeMobilite(TypeMobilite object) {
				return createTypeMobiliteAdapter();
			}
			@Override
			public Adapter caseTypeModalite(TypeModalite object) {
				return createTypeModaliteAdapter();
			}
			@Override
			public Adapter caseTypeModaliteLivraison(TypeModaliteLivraison object) {
				return createTypeModaliteLivraisonAdapter();
			}
			@Override
			public Adapter caseTypeModaliteObtention(TypeModaliteObtention object) {
				return createTypeModaliteObtentionAdapter();
			}
			@Override
			public Adapter caseTypeModalitePerception(TypeModalitePerception object) {
				return createTypeModalitePerceptionAdapter();
			}
			@Override
			public Adapter caseTypeModalitesAcquisitionObjectif(TypeModalitesAcquisitionObjectif object) {
				return createTypeModalitesAcquisitionObjectifAdapter();
			}
			@Override
			public Adapter caseTypeModalitesEvaluationDegats(TypeModalitesEvaluationDegats object) {
				return createTypeModalitesEvaluationDegatsAdapter();
			}
			@Override
			public Adapter caseTypeModalitesMiseEnPlaceTir(TypeModalitesMiseEnPlaceTir object) {
				return createTypeModalitesMiseEnPlaceTirAdapter();
			}
			@Override
			public Adapter caseTypeModaliteSoutienLogistique(TypeModaliteSoutienLogistique object) {
				return createTypeModaliteSoutienLogistiqueAdapter();
			}
			@Override
			public Adapter caseTypeModalitesRavitaillement(TypeModalitesRavitaillement object) {
				return createTypeModalitesRavitaillementAdapter();
			}
			@Override
			public Adapter caseTypeModaliteTransfertAutoriteASS(TypeModaliteTransfertAutoriteASS object) {
				return createTypeModaliteTransfertAutoriteASSAdapter();
			}
			@Override
			public Adapter caseTypeModeFranchissement(TypeModeFranchissement object) {
				return createTypeModeFranchissementAdapter();
			}
			@Override
			public Adapter caseTypeModule(TypeModule object) {
				return createTypeModuleAdapter();
			}
			@Override
			public Adapter caseTypeMouillage(TypeMouillage object) {
				return createTypeMouillageAdapter();
			}
			@Override
			public Adapter caseTypeMouvementParRoute(TypeMouvementParRoute object) {
				return createTypeMouvementParRouteAdapter();
			}
			@Override
			public Adapter caseTypeMoyenCommunication(TypeMoyenCommunication object) {
				return createTypeMoyenCommunicationAdapter();
			}
			@Override
			public Adapter caseTypeMoyenDepannage(TypeMoyenDepannage object) {
				return createTypeMoyenDepannageAdapter();
			}
			@Override
			public Adapter caseTypeMoyenDispersion(TypeMoyenDispersion object) {
				return createTypeMoyenDispersionAdapter();
			}
			@Override
			public Adapter caseTypeMoyenFeuENI(TypeMoyenFeuENI object) {
				return createTypeMoyenFeuENIAdapter();
			}
			@Override
			public Adapter caseTypeMoyenInvestigation(TypeMoyenInvestigation object) {
				return createTypeMoyenInvestigationAdapter();
			}
			@Override
			public Adapter caseTypeMoyenPourSoutienMedical(TypeMoyenPourSoutienMedical object) {
				return createTypeMoyenPourSoutienMedicalAdapter();
			}
			@Override
			public Adapter caseTypeMoyensAeriensDontBeneficieGU(TypeMoyensAeriensDontBeneficieGU object) {
				return createTypeMoyensAeriensDontBeneficieGUAdapter();
			}
			@Override
			public Adapter caseTypeMoyensENI(TypeMoyensENI object) {
				return createTypeMoyensENIAdapter();
			}
			@Override
			public Adapter caseTypeMoyensENIutilises(TypeMoyensENIutilises object) {
				return createTypeMoyensENIutilisesAdapter();
			}
			@Override
			public Adapter caseTypeMoyensEvacuation(TypeMoyensEvacuation object) {
				return createTypeMoyensEvacuationAdapter();
			}
			@Override
			public Adapter caseTypeMoyensGenie(TypeMoyensGenie object) {
				return createTypeMoyensGenieAdapter();
			}
			@Override
			public Adapter caseTypeMoyensNecessaires(TypeMoyensNecessaires object) {
				return createTypeMoyensNecessairesAdapter();
			}
			@Override
			public Adapter caseTypeMoyensNiveau4(TypeMoyensNiveau4 object) {
				return createTypeMoyensNiveau4Adapter();
			}
			@Override
			public Adapter caseTypeMoyensTriage(TypeMoyensTriage object) {
				return createTypeMoyensTriageAdapter();
			}
			@Override
			public Adapter caseTypeMPGTMessage(TypeMPGTMessage object) {
				return createTypeMPGTMessageAdapter();
			}
			@Override
			public Adapter caseTypeMunitionsConsommeesSurPoint(TypeMunitionsConsommeesSurPoint object) {
				return createTypeMunitionsConsommeesSurPointAdapter();
			}
			@Override
			public Adapter caseTypeNatureInformations(TypeNatureInformations object) {
				return createTypeNatureInformationsAdapter();
			}
			@Override
			public Adapter caseTypeNiveauAMaintenir(TypeNiveauAMaintenir object) {
				return createTypeNiveauAMaintenirAdapter();
			}
			@Override
			public Adapter caseTypeObjectif3D(TypeObjectif3D object) {
				return createTypeObjectif3DAdapter();
			}
			@Override
			public Adapter caseTypeObjectifActivite(TypeObjectifActivite object) {
				return createTypeObjectifActiviteAdapter();
			}
			@Override
			public Adapter caseTypeObjectifActiviteType(TypeObjectifActiviteType object) {
				return createTypeObjectifActiviteTypeAdapter();
			}
			@Override
			public Adapter caseTypeObjectifActiviteTypeProductionImage(TypeObjectifActiviteTypeProductionImage object) {
				return createTypeObjectifActiviteTypeProductionImageAdapter();
			}
			@Override
			public Adapter caseTypeObjectifAlat(TypeObjectifAlat object) {
				return createTypeObjectifAlatAdapter();
			}
			@Override
			public Adapter caseTypeObjectifASS(TypeObjectifASS object) {
				return createTypeObjectifASSAdapter();
			}
			@Override
			public Adapter caseTypeObjectifCiblage(TypeObjectifCiblage object) {
				return createTypeObjectifCiblageAdapter();
			}
			@Override
			public Adapter caseTypeObjectifMajeur(TypeObjectifMajeur object) {
				return createTypeObjectifMajeurAdapter();
			}
			@Override
			public Adapter caseTypeObjetGeometrique(TypeObjetGeometrique object) {
				return createTypeObjetGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeObjetInconnu(TypeObjetInconnu object) {
				return createTypeObjetInconnuAdapter();
			}
			@Override
			public Adapter caseTypeObjetLibre(TypeObjetLibre object) {
				return createTypeObjetLibreAdapter();
			}
			@Override
			public Adapter caseTypeObservation(TypeObservation object) {
				return createTypeObservationAdapter();
			}
			@Override
			public Adapter caseTypeObstacle(TypeObstacle object) {
				return createTypeObstacleAdapter();
			}
			@Override
			public Adapter caseTypeOccupationLits(TypeOccupationLits object) {
				return createTypeOccupationLitsAdapter();
			}
			@Override
			public Adapter caseTypeOrdre(TypeOrdre object) {
				return createTypeOrdreAdapter();
			}
			@Override
			public Adapter caseTypeOrganisationEvacuations(TypeOrganisationEvacuations object) {
				return createTypeOrganisationEvacuationsAdapter();
			}
			@Override
			public Adapter caseTypeOrganisationRamassage(TypeOrganisationRamassage object) {
				return createTypeOrganisationRamassageAdapter();
			}
			@Override
			public Adapter caseTypeOrganisationSoutienMedical(TypeOrganisationSoutienMedical object) {
				return createTypeOrganisationSoutienMedicalAdapter();
			}
			@Override
			public Adapter caseTypeOrganisationTraitement(TypeOrganisationTraitement object) {
				return createTypeOrganisationTraitementAdapter();
			}
			@Override
			public Adapter caseTypeOrganisationTriage(TypeOrganisationTriage object) {
				return createTypeOrganisationTriageAdapter();
			}
			@Override
			public Adapter caseTypeOrganismeControle(TypeOrganismeControle object) {
				return createTypeOrganismeControleAdapter();
			}
			@Override
			public Adapter caseTypeOuvrageGenie(TypeOuvrageGenie object) {
				return createTypeOuvrageGenieAdapter();
			}
			@Override
			public Adapter caseTypeOverlay(TypeOverlay object) {
				return createTypeOverlayAdapter();
			}
			@Override
			public Adapter caseTypePalierSondage(TypePalierSondage object) {
				return createTypePalierSondageAdapter();
			}
			@Override
			public Adapter caseTypeParagraphePlanOuOrdre(TypeParagraphePlanOuOrdre object) {
				return createTypeParagraphePlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypeParametresImposes(TypeParametresImposes object) {
				return createTypeParametresImposesAdapter();
			}
			@Override
			public Adapter caseTypeParametresPlanification(TypeParametresPlanification object) {
				return createTypeParametresPlanificationAdapter();
			}
			@Override
			public Adapter caseTypeParametresZoneRetombees(TypeParametresZoneRetombees object) {
				return createTypeParametresZoneRetombeesAdapter();
			}
			@Override
			public Adapter caseTypePassageModule(TypePassageModule object) {
				return createTypePassageModuleAdapter();
			}
			@Override
			public Adapter caseTypePassePhoto(TypePassePhoto object) {
				return createTypePassePhotoAdapter();
			}
			@Override
			public Adapter caseTypePeriode(TypePeriode object) {
				return createTypePeriodeAdapter();
			}
			@Override
			public Adapter caseTypePeriode3D(TypePeriode3D object) {
				return createTypePeriode3DAdapter();
			}
			@Override
			public Adapter caseTypePersonne(TypePersonne object) {
				return createTypePersonneAdapter();
			}
			@Override
			public Adapter caseTypePersonneMilitaire(TypePersonneMilitaire object) {
				return createTypePersonneMilitaireAdapter();
			}
			@Override
			public Adapter caseTypePertesParPeriode(TypePertesParPeriode object) {
				return createTypePertesParPeriodeAdapter();
			}
			@Override
			public Adapter caseTypePertesSante(TypePertesSante object) {
				return createTypePertesSanteAdapter();
			}
			@Override
			public Adapter caseTypePertesSanteParEchelon(TypePertesSanteParEchelon object) {
				return createTypePertesSanteParEchelonAdapter();
			}
			@Override
			public Adapter caseTypePertesSanteParUnite(TypePertesSanteParUnite object) {
				return createTypePertesSanteParUniteAdapter();
			}
			@Override
			public Adapter caseTypePhaseMissionAppuiAerien(TypePhaseMissionAppuiAerien object) {
				return createTypePhaseMissionAppuiAerienAdapter();
			}
			@Override
			public Adapter caseTypePhaseTrajet(TypePhaseTrajet object) {
				return createTypePhaseTrajetAdapter();
			}
			@Override
			public Adapter caseTypePhaseVolDrone(TypePhaseVolDrone object) {
				return createTypePhaseVolDroneAdapter();
			}
			@Override
			public Adapter caseTypePionReseau(TypePionReseau object) {
				return createTypePionReseauAdapter();
			}
			@Override
			public Adapter caseTypePisteAtterrissage(TypePisteAtterrissage object) {
				return createTypePisteAtterrissageAdapter();
			}
			@Override
			public Adapter caseTypePlageNumerotation(TypePlageNumerotation object) {
				return createTypePlageNumerotationAdapter();
			}
			@Override
			public Adapter caseTypePlan(TypePlan object) {
				return createTypePlanAdapter();
			}
			@Override
			public Adapter caseTypePlanFeux(TypePlanFeux object) {
				return createTypePlanFeuxAdapter();
			}
			@Override
			public Adapter caseTypePlanification(TypePlanification object) {
				return createTypePlanificationAdapter();
			}
			@Override
			public Adapter caseTypePlanificationCelluleSoutien(TypePlanificationCelluleSoutien object) {
				return createTypePlanificationCelluleSoutienAdapter();
			}
			@Override
			public Adapter caseTypePlanificationMouvement(TypePlanificationMouvement object) {
				return createTypePlanificationMouvementAdapter();
			}
			@Override
			public Adapter caseTypePlanificationOperation3D(TypePlanificationOperation3D object) {
				return createTypePlanificationOperation3DAdapter();
			}
			@Override
			public Adapter caseTypePlanMixte(TypePlanMixte object) {
				return createTypePlanMixteAdapter();
			}
			@Override
			public Adapter caseTypePlanNumerotationObjectifs(TypePlanNumerotationObjectifs object) {
				return createTypePlanNumerotationObjectifsAdapter();
			}
			@Override
			public Adapter caseTypePlanOuOrdre(TypePlanOuOrdre object) {
				return createTypePlanOuOrdreAdapter();
			}
			@Override
			public Adapter caseTypePlanParticulier(TypePlanParticulier object) {
				return createTypePlanParticulierAdapter();
			}
			@Override
			public Adapter caseTypePlanTraitementObjectifs(TypePlanTraitementObjectifs object) {
				return createTypePlanTraitementObjectifsAdapter();
			}
			@Override
			public Adapter caseTypePointAxe(TypePointAxe object) {
				return createTypePointAxeAdapter();
			}
			@Override
			public Adapter caseTypePointControle3D(TypePointControle3D object) {
				return createTypePointControle3DAdapter();
			}
			@Override
			public Adapter caseTypePointGeometrique(TypePointGeometrique object) {
				return createTypePointGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypePointHaut(TypePointHaut object) {
				return createTypePointHautAdapter();
			}
			@Override
			public Adapter caseTypePointMobile(TypePointMobile object) {
				return createTypePointMobileAdapter();
			}
			@Override
			public Adapter caseTypePointParticulierItineraire(TypePointParticulierItineraire object) {
				return createTypePointParticulierItineraireAdapter();
			}
			@Override
			public Adapter caseTypePointTrajectoire(TypePointTrajectoire object) {
				return createTypePointTrajectoireAdapter();
			}
			@Override
			public Adapter caseTypePointUsager(TypePointUsager object) {
				return createTypePointUsagerAdapter();
			}
			@Override
			public Adapter caseTypePolitiqueTir(TypePolitiqueTir object) {
				return createTypePolitiqueTirAdapter();
			}
			@Override
			public Adapter caseTypePolitiqueTirAeronef(TypePolitiqueTirAeronef object) {
				return createTypePolitiqueTirAeronefAdapter();
			}
			@Override
			public Adapter caseTypePont(TypePont object) {
				return createTypePontAdapter();
			}
			@Override
			public Adapter caseTypePort(TypePort object) {
				return createTypePortAdapter();
			}
			@Override
			public Adapter caseTypePorteurSystemeArme(TypePorteurSystemeArme object) {
				return createTypePorteurSystemeArmeAdapter();
			}
			@Override
			public Adapter caseTypePositionCentreASA(TypePositionCentreASA object) {
				return createTypePositionCentreASAAdapter();
			}
			@Override
			public Adapter caseTypePositionPlots(TypePositionPlots object) {
				return createTypePositionPlotsAdapter();
			}
			@Override
			public Adapter caseTypePossibilitesENI3d(TypePossibilitesENI3d object) {
				return createTypePossibilitesENI3dAdapter();
			}
			@Override
			public Adapter caseTypePosteAmarrage(TypePosteAmarrage object) {
				return createTypePosteAmarrageAdapter();
			}
			@Override
			public Adapter caseTypePosteTir(TypePosteTir object) {
				return createTypePosteTirAdapter();
			}
			@Override
			public Adapter caseTypePotentielAeronef(TypePotentielAeronef object) {
				return createTypePotentielAeronefAdapter();
			}
			@Override
			public Adapter caseTypePotentielENIfeuSolSol(TypePotentielENIfeuSolSol object) {
				return createTypePotentielENIfeuSolSolAdapter();
			}
			@Override
			public Adapter caseTypePrecipitation(TypePrecipitation object) {
				return createTypePrecipitationAdapter();
			}
			@Override
			public Adapter caseTypePrelevement(TypePrelevement object) {
				return createTypePrelevementAdapter();
			}
			@Override
			public Adapter caseTypePrelevementDetachement(TypePrelevementDetachement object) {
				return createTypePrelevementDetachementAdapter();
			}
			@Override
			public Adapter caseTypePrelevementSubordonneIdentifie(TypePrelevementSubordonneIdentifie object) {
				return createTypePrelevementSubordonneIdentifieAdapter();
			}
			@Override
			public Adapter caseTypePrelevementSubordonneNonIdentifie(TypePrelevementSubordonneNonIdentifie object) {
				return createTypePrelevementSubordonneNonIdentifieAdapter();
			}
			@Override
			public Adapter caseTypePrevisionObservation(TypePrevisionObservation object) {
				return createTypePrevisionObservationAdapter();
			}
			@Override
			public Adapter caseTypePrevisionObservationParTranche(TypePrevisionObservationParTranche object) {
				return createTypePrevisionObservationParTrancheAdapter();
			}
			@Override
			public Adapter caseTypePriorite(TypePriorite object) {
				return createTypePrioriteAdapter();
			}
			@Override
			public Adapter caseTypePrioriteTactique(TypePrioriteTactique object) {
				return createTypePrioriteTactiqueAdapter();
			}
			@Override
			public Adapter caseTypePrioriteTactiqueLogistique(TypePrioriteTactiqueLogistique object) {
				return createTypePrioriteTactiqueLogistiqueAdapter();
			}
			@Override
			public Adapter caseTypePrioriteTechnique(TypePrioriteTechnique object) {
				return createTypePrioriteTechniqueAdapter();
			}
			@Override
			public Adapter caseTypeProcedureIFF(TypeProcedureIFF object) {
				return createTypeProcedureIFFAdapter();
			}
			@Override
			public Adapter caseTypeProfil(TypeProfil object) {
				return createTypeProfilAdapter();
			}
			@Override
			public Adapter caseTypeProjetCimic(TypeProjetCimic object) {
				return createTypeProjetCimicAdapter();
			}
			@Override
			public Adapter caseTypeProtectionPersonnel(TypeProtectionPersonnel object) {
				return createTypeProtectionPersonnelAdapter();
			}
			@Override
			public Adapter caseTypeQuaiMaritime(TypeQuaiMaritime object) {
				return createTypeQuaiMaritimeAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteConsommee(TypeQuantiteConsommee object) {
				return createTypeQuantiteConsommeeAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteElementENIDetruit(TypeQuantiteElementENIDetruit object) {
				return createTypeQuantiteElementENIDetruitAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteMaintenir(TypeQuantiteMaintenir object) {
				return createTypeQuantiteMaintenirAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteMateriel(TypeQuantiteMateriel object) {
				return createTypeQuantiteMaterielAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteMaterielOuMoyen(TypeQuantiteMaterielOuMoyen object) {
				return createTypeQuantiteMaterielOuMoyenAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteMoyensTirASS(TypeQuantiteMoyensTirASS object) {
				return createTypeQuantiteMoyensTirASSAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteTypeArmePourMoyenFeuASSeni(TypeQuantiteTypeArmePourMoyenFeuASSeni object) {
				return createTypeQuantiteTypeArmePourMoyenFeuASSeniAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteTypeEquipement(TypeQuantiteTypeEquipement object) {
				return createTypeQuantiteTypeEquipementAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteTypeObserve(TypeQuantiteTypeObserve object) {
				return createTypeQuantiteTypeObserveAdapter();
			}
			@Override
			public Adapter caseTypeQuantiteTypeUnite(TypeQuantiteTypeUnite object) {
				return createTypeQuantiteTypeUniteAdapter();
			}
			@Override
			public Adapter caseTypeRacineOperationnelle(TypeRacineOperationnelle object) {
				return createTypeRacineOperationnelleAdapter();
			}
			@Override
			public Adapter caseTypeRaidAerienEnnemi(TypeRaidAerienEnnemi object) {
				return createTypeRaidAerienEnnemiAdapter();
			}
			@Override
			public Adapter caseTypeRapport(TypeRapport object) {
				return createTypeRapportAdapter();
			}
			@Override
			public Adapter caseTypeRapportForce(TypeRapportForce object) {
				return createTypeRapportForceAdapter();
			}
			@Override
			public Adapter caseTypeRattachement(TypeRattachement object) {
				return createTypeRattachementAdapter();
			}
			@Override
			public Adapter caseTypeRattachementLogistiqueParticulier(TypeRattachementLogistiqueParticulier object) {
				return createTypeRattachementLogistiqueParticulierAdapter();
			}
			@Override
			public Adapter caseTypeRattachementOuAbonnement(TypeRattachementOuAbonnement object) {
				return createTypeRattachementOuAbonnementAdapter();
			}
			@Override
			public Adapter caseTypeRavitaillement(TypeRavitaillement object) {
				return createTypeRavitaillementAdapter();
			}
			@Override
			public Adapter caseTypeReactionsMentalesAuCombat(TypeReactionsMentalesAuCombat object) {
				return createTypeReactionsMentalesAuCombatAdapter();
			}
			@Override
			public Adapter caseTypeRechange(TypeRechange object) {
				return createTypeRechangeAdapter();
			}
			@Override
			public Adapter caseTypeReconnaissance(TypeReconnaissance object) {
				return createTypeReconnaissanceAdapter();
			}
			@Override
			public Adapter caseTypeRegleEngagement(TypeRegleEngagement object) {
				return createTypeRegleEngagementAdapter();
			}
			@Override
			public Adapter caseTypeRegleEngagementAction(TypeRegleEngagementAction object) {
				return createTypeRegleEngagementActionAdapter();
			}
			@Override
			public Adapter caseTypeReglementation(TypeReglementation object) {
				return createTypeReglementationAdapter();
			}
			@Override
			public Adapter caseTypeReligion(TypeReligion object) {
				return createTypeReligionAdapter();
			}
			@Override
			public Adapter caseTypeRenforcementsFeux(TypeRenforcementsFeux object) {
				return createTypeRenforcementsFeuxAdapter();
			}
			@Override
			public Adapter caseTypeRenseignementObjectif(TypeRenseignementObjectif object) {
				return createTypeRenseignementObjectifAdapter();
			}
			@Override
			public Adapter caseTypeReseauTelecommunication(TypeReseauTelecommunication object) {
				return createTypeReseauTelecommunicationAdapter();
			}
			@Override
			public Adapter caseTypeReservationUnite(TypeReservationUnite object) {
				return createTypeReservationUniteAdapter();
			}
			@Override
			public Adapter caseTypeRessourceActivite(TypeRessourceActivite object) {
				return createTypeRessourceActiviteAdapter();
			}
			@Override
			public Adapter caseTypeRessourceActiviteInstanceObjet(TypeRessourceActiviteInstanceObjet object) {
				return createTypeRessourceActiviteInstanceObjetAdapter();
			}
			@Override
			public Adapter caseTypeRessourceActiviteType(TypeRessourceActiviteType object) {
				return createTypeRessourceActiviteTypeAdapter();
			}
			@Override
			public Adapter caseTypeRessourceAttendue(TypeRessourceAttendue object) {
				return createTypeRessourceAttendueAdapter();
			}
			@Override
			public Adapter caseTypeRessourceElementaire(TypeRessourceElementaire object) {
				return createTypeRessourceElementaireAdapter();
			}
			@Override
			public Adapter caseTypeRessourcesALivrerOuADistribuer(TypeRessourcesALivrerOuADistribuer object) {
				return createTypeRessourcesALivrerOuADistribuerAdapter();
			}
			@Override
			public Adapter caseTypeResultatTraitementObjectif(TypeResultatTraitementObjectif object) {
				return createTypeResultatTraitementObjectifAdapter();
			}
			@Override
			public Adapter caseTypeROEparOrganisation(TypeROEparOrganisation object) {
				return createTypeROEparOrganisationAdapter();
			}
			@Override
			public Adapter caseTypeRoute(TypeRoute object) {
				return createTypeRouteAdapter();
			}
			@Override
			public Adapter caseTypeRouteHelicoptereALAT(TypeRouteHelicoptereALAT object) {
				return createTypeRouteHelicoptereALATAdapter();
			}
			@Override
			public Adapter caseTypeSecteurAngulaireGeometrique(TypeSecteurAngulaireGeometrique object) {
				return createTypeSecteurAngulaireGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeSecteurGeometrique(TypeSecteurGeometrique object) {
				return createTypeSecteurGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeSegmentItineraire(TypeSegmentItineraire object) {
				return createTypeSegmentItineraireAdapter();
			}
			@Override
			public Adapter caseTypeSegmentRouteAerienne(TypeSegmentRouteAerienne object) {
				return createTypeSegmentRouteAerienneAdapter();
			}
			@Override
			public Adapter caseTypeSerieGeostatistique(TypeSerieGeostatistique object) {
				return createTypeSerieGeostatistiqueAdapter();
			}
			@Override
			public Adapter caseTypeServiceReseau(TypeServiceReseau object) {
				return createTypeServiceReseauAdapter();
			}
			@Override
			public Adapter caseTypeSite(TypeSite object) {
				return createTypeSiteAdapter();
			}
			@Override
			public Adapter caseTypeSiteProduction(TypeSiteProduction object) {
				return createTypeSiteProductionAdapter();
			}
			@Override
			public Adapter caseTypeSiteSoin(TypeSiteSoin object) {
				return createTypeSiteSoinAdapter();
			}
			@Override
			public Adapter caseTypeSituationConsommable(TypeSituationConsommable object) {
				return createTypeSituationConsommableAdapter();
			}
			@Override
			public Adapter caseTypeSituationEffectif(TypeSituationEffectif object) {
				return createTypeSituationEffectifAdapter();
			}
			@Override
			public Adapter caseTypeSituationEquipement(TypeSituationEquipement object) {
				return createTypeSituationEquipementAdapter();
			}
			@Override
			public Adapter caseTypeSituationRadiation(TypeSituationRadiation object) {
				return createTypeSituationRadiationAdapter();
			}
			@Override
			public Adapter caseTypeSituationVehicule(TypeSituationVehicule object) {
				return createTypeSituationVehiculeAdapter();
			}
			@Override
			public Adapter caseTypeSpecialiteMaintenanceOuDepannage(TypeSpecialiteMaintenanceOuDepannage object) {
				return createTypeSpecialiteMaintenanceOuDepannageAdapter();
			}
			@Override
			public Adapter caseTypeSpecialitePersonne(TypeSpecialitePersonne object) {
				return createTypeSpecialitePersonneAdapter();
			}
			@Override
			public Adapter caseTypeSphereGeometrique(TypeSphereGeometrique object) {
				return createTypeSphereGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeStadeAlerteEmission(TypeStadeAlerteEmission object) {
				return createTypeStadeAlerteEmissionAdapter();
			}
			@Override
			public Adapter caseTypeStockAMaintenir(TypeStockAMaintenir object) {
				return createTypeStockAMaintenirAdapter();
			}
			@Override
			public Adapter caseTypeStructureOrganisee(TypeStructureOrganisee object) {
				return createTypeStructureOrganiseeAdapter();
			}
			@Override
			public Adapter caseTypeSuiviDemande(TypeSuiviDemande object) {
				return createTypeSuiviDemandeAdapter();
			}
			@Override
			public Adapter caseTypeSuiviMedical(TypeSuiviMedical object) {
				return createTypeSuiviMedicalAdapter();
			}
			@Override
			public Adapter caseTypeSurplusOuDeficit(TypeSurplusOuDeficit object) {
				return createTypeSurplusOuDeficitAdapter();
			}
			@Override
			public Adapter caseTypeSymboleAnnotation(TypeSymboleAnnotation object) {
				return createTypeSymboleAnnotationAdapter();
			}
			@Override
			public Adapter caseTypeSymboleCercle(TypeSymboleCercle object) {
				return createTypeSymboleCercleAdapter();
			}
			@Override
			public Adapter caseTypeSymboleFleche(TypeSymboleFleche object) {
				return createTypeSymboleFlecheAdapter();
			}
			@Override
			public Adapter caseTypeSymboleImage(TypeSymboleImage object) {
				return createTypeSymboleImageAdapter();
			}
			@Override
			public Adapter caseTypeSymboleLibre(TypeSymboleLibre object) {
				return createTypeSymboleLibreAdapter();
			}
			@Override
			public Adapter caseTypeSymboleLineique(TypeSymboleLineique object) {
				return createTypeSymboleLineiqueAdapter();
			}
			@Override
			public Adapter caseTypeSymboleNote(TypeSymboleNote object) {
				return createTypeSymboleNoteAdapter();
			}
			@Override
			public Adapter caseTypeSymbolePoint(TypeSymbolePoint object) {
				return createTypeSymbolePointAdapter();
			}
			@Override
			public Adapter caseTypeSymbolePostIt(TypeSymbolePostIt object) {
				return createTypeSymbolePostItAdapter();
			}
			@Override
			public Adapter caseTypeSymboleSurfacique(TypeSymboleSurfacique object) {
				return createTypeSymboleSurfaciqueAdapter();
			}
			@Override
			public Adapter caseTypeSymboleTactique(TypeSymboleTactique object) {
				return createTypeSymboleTactiqueAdapter();
			}
			@Override
			public Adapter caseTypeSymboleTexte(TypeSymboleTexte object) {
				return createTypeSymboleTexteAdapter();
			}
			@Override
			public Adapter caseTypeSyntheseDetections(TypeSyntheseDetections object) {
				return createTypeSyntheseDetectionsAdapter();
			}
			@Override
			public Adapter caseTypeSyntheseSante(TypeSyntheseSante object) {
				return createTypeSyntheseSanteAdapter();
			}
			@Override
			public Adapter caseTypeSystemeAtterrissageAuxInstruments(TypeSystemeAtterrissageAuxInstruments object) {
				return createTypeSystemeAtterrissageAuxInstrumentsAdapter();
			}
			@Override
			public Adapter caseTypeTache(TypeTache object) {
				return createTypeTacheAdapter();
			}
			@Override
			public Adapter caseTypeTacheAppuiAerien(TypeTacheAppuiAerien object) {
				return createTypeTacheAppuiAerienAdapter();
			}
			@Override
			public Adapter caseTypeTirsParObjectif(TypeTirsParObjectif object) {
				return createTypeTirsParObjectifAdapter();
			}
			@Override
			public Adapter caseTypeTraitementObjectif(TypeTraitementObjectif object) {
				return createTypeTraitementObjectifAdapter();
			}
			@Override
			public Adapter caseTypeTraitementPatients(TypeTraitementPatients object) {
				return createTypeTraitementPatientsAdapter();
			}
			@Override
			public Adapter caseTypeTrancheMeteo(TypeTrancheMeteo object) {
				return createTypeTrancheMeteoAdapter();
			}
			@Override
			public Adapter caseTypeTransfertDotation(TypeTransfertDotation object) {
				return createTypeTransfertDotationAdapter();
			}
			@Override
			public Adapter caseTypeTravailAideDeploiement(TypeTravailAideDeploiement object) {
				return createTypeTravailAideDeploiementAdapter();
			}
			@Override
			public Adapter caseTypeTravailGenie(TypeTravailGenie object) {
				return createTypeTravailGenieAdapter();
			}
			@Override
			public Adapter caseTypeTriage(TypeTriage object) {
				return createTypeTriageAdapter();
			}
			@Override
			public Adapter caseTypeType(TypeType object) {
				return createTypeTypeAdapter();
			}
			@Override
			public Adapter caseTypeTypeAerodrome(TypeTypeAerodrome object) {
				return createTypeTypeAerodromeAdapter();
			}
			@Override
			public Adapter caseTypeTypeAeronef(TypeTypeAeronef object) {
				return createTypeTypeAeronefAdapter();
			}
			@Override
			public Adapter caseTypeTypeAgentBiologique(TypeTypeAgentBiologique object) {
				return createTypeTypeAgentBiologiqueAdapter();
			}
			@Override
			public Adapter caseTypeTypeAgentChimique(TypeTypeAgentChimique object) {
				return createTypeTypeAgentChimiqueAdapter();
			}
			@Override
			public Adapter caseTypeTypeAgentNucleaire(TypeTypeAgentNucleaire object) {
				return createTypeTypeAgentNucleaireAdapter();
			}
			@Override
			public Adapter caseTypeTypeArme(TypeTypeArme object) {
				return createTypeTypeArmeAdapter();
			}
			@Override
			public Adapter caseTypeTypeArmementSystemeArme(TypeTypeArmementSystemeArme object) {
				return createTypeTypeArmementSystemeArmeAdapter();
			}
			@Override
			public Adapter caseTypeTypeBatiment(TypeTypeBatiment object) {
				return createTypeTypeBatimentAdapter();
			}
			@Override
			public Adapter caseTypeTypeBatimentParticipant(TypeTypeBatimentParticipant object) {
				return createTypeTypeBatimentParticipantAdapter();
			}
			@Override
			public Adapter caseTypeTypeBatimentSurface(TypeTypeBatimentSurface object) {
				return createTypeTypeBatimentSurfaceAdapter();
			}
			@Override
			public Adapter caseTypeTypeCapteur(TypeTypeCapteur object) {
				return createTypeTypeCapteurAdapter();
			}
			@Override
			public Adapter caseTypeTypeConsommable(TypeTypeConsommable object) {
				return createTypeTypeConsommableAdapter();
			}
			@Override
			public Adapter caseTypeTypeConsommableSystemeArme(TypeTypeConsommableSystemeArme object) {
				return createTypeTypeConsommableSystemeArmeAdapter();
			}
			@Override
			public Adapter caseTypeTypeElementControle(TypeTypeElementControle object) {
				return createTypeTypeElementControleAdapter();
			}
			@Override
			public Adapter caseTypeTypeEntiteOrganisationnelle(TypeTypeEntiteOrganisationnelle object) {
				return createTypeTypeEntiteOrganisationnelleAdapter();
			}
			@Override
			public Adapter caseTypeTypeEquipement(TypeTypeEquipement object) {
				return createTypeTypeEquipementAdapter();
			}
			@Override
			public Adapter caseTypeTypeEquipementASS(TypeTypeEquipementASS object) {
				return createTypeTypeEquipementASSAdapter();
			}
			@Override
			public Adapter caseTypeTypeEquipementElectronique(TypeTypeEquipementElectronique object) {
				return createTypeTypeEquipementElectroniqueAdapter();
			}
			@Override
			public Adapter caseTypeTypeEquipementFerroviaire(TypeTypeEquipementFerroviaire object) {
				return createTypeTypeEquipementFerroviaireAdapter();
			}
			@Override
			public Adapter caseTypeTypeEquipementGenie(TypeTypeEquipementGenie object) {
				return createTypeTypeEquipementGenieAdapter();
			}
			@Override
			public Adapter caseTypeTypeEquipementMaritime(TypeTypeEquipementMaritime object) {
				return createTypeTypeEquipementMaritimeAdapter();
			}
			@Override
			public Adapter caseTypeTypeEquipementNRBC(TypeTypeEquipementNRBC object) {
				return createTypeTypeEquipementNRBCAdapter();
			}
			@Override
			public Adapter caseTypeTypeEquipementSystemeArme(TypeTypeEquipementSystemeArme object) {
				return createTypeTypeEquipementSystemeArmeAdapter();
			}
			@Override
			public Adapter caseTypeTypeGroupeIndividus(TypeTypeGroupeIndividus object) {
				return createTypeTypeGroupeIndividusAdapter();
			}
			@Override
			public Adapter caseTypeTypeIntervenant3D(TypeTypeIntervenant3D object) {
				return createTypeTypeIntervenant3DAdapter();
			}
			@Override
			public Adapter caseTypeTypeItineraire(TypeTypeItineraire object) {
				return createTypeTypeItineraireAdapter();
			}
			@Override
			public Adapter caseTypeTypeMateriel(TypeTypeMateriel object) {
				return createTypeTypeMaterielAdapter();
			}
			@Override
			public Adapter caseTypeTypeMesureCoordination(TypeTypeMesureCoordination object) {
				return createTypeTypeMesureCoordinationAdapter();
			}
			@Override
			public Adapter caseTypeTypeMissionAerienne(TypeTypeMissionAerienne object) {
				return createTypeTypeMissionAerienneAdapter();
			}
			@Override
			public Adapter caseTypeTypeMissionI3D(TypeTypeMissionI3D object) {
				return createTypeTypeMissionI3DAdapter();
			}
			@Override
			public Adapter caseTypeTypeMoyenManquant(TypeTypeMoyenManquant object) {
				return createTypeTypeMoyenManquantAdapter();
			}
			@Override
			public Adapter caseTypeTypeMunition(TypeTypeMunition object) {
				return createTypeTypeMunitionAdapter();
			}
			@Override
			public Adapter caseTypeTypeMunitionSystemeArme(TypeTypeMunitionSystemeArme object) {
				return createTypeTypeMunitionSystemeArmeAdapter();
			}
			@Override
			public Adapter caseTypeTypeObjectifASS(TypeTypeObjectifASS object) {
				return createTypeTypeObjectifASSAdapter();
			}
			@Override
			public Adapter caseTypeTypeObjectifMajeur(TypeTypeObjectifMajeur object) {
				return createTypeTypeObjectifMajeurAdapter();
			}
			@Override
			public Adapter caseTypeTypeObstacle(TypeTypeObstacle object) {
				return createTypeTypeObstacleAdapter();
			}
			@Override
			public Adapter caseTypeTypeOrganisationGouvernementale(TypeTypeOrganisationGouvernementale object) {
				return createTypeTypeOrganisationGouvernementaleAdapter();
			}
			@Override
			public Adapter caseTypeTypeOrganisationMilitaireExecutive(TypeTypeOrganisationMilitaireExecutive object) {
				return createTypeTypeOrganisationMilitaireExecutiveAdapter();
			}
			@Override
			public Adapter caseTypeTypeOrganisationPrivee(TypeTypeOrganisationPrivee object) {
				return createTypeTypeOrganisationPriveeAdapter();
			}
			@Override
			public Adapter caseTypeTypePersonne(TypeTypePersonne object) {
				return createTypeTypePersonneAdapter();
			}
			@Override
			public Adapter caseTypeTypePont(TypeTypePont object) {
				return createTypeTypePontAdapter();
			}
			@Override
			public Adapter caseTypeTypePort(TypeTypePort object) {
				return createTypeTypePortAdapter();
			}
			@Override
			public Adapter caseTypeTypePorteur(TypeTypePorteur object) {
				return createTypeTypePorteurAdapter();
			}
			@Override
			public Adapter caseTypeTypePosteCivil(TypeTypePosteCivil object) {
				return createTypeTypePosteCivilAdapter();
			}
			@Override
			public Adapter caseTypeTypePosteMilitaire(TypeTypePosteMilitaire object) {
				return createTypeTypePosteMilitaireAdapter();
			}
			@Override
			public Adapter caseTypeTypeRegroupementForce(TypeTypeRegroupementForce object) {
				return createTypeTypeRegroupementForceAdapter();
			}
			@Override
			public Adapter caseTypeTypeRepartition(TypeTypeRepartition object) {
				return createTypeTypeRepartitionAdapter();
			}
			@Override
			public Adapter caseTypeTypeSite(TypeTypeSite object) {
				return createTypeTypeSiteAdapter();
			}
			@Override
			public Adapter caseTypeTypeSousMarin(TypeTypeSousMarin object) {
				return createTypeTypeSousMarinAdapter();
			}
			@Override
			public Adapter caseTypeTypeSousSysteme(TypeTypeSousSysteme object) {
				return createTypeTypeSousSystemeAdapter();
			}
			@Override
			public Adapter caseTypeTypeUnite(TypeTypeUnite object) {
				return createTypeTypeUniteAdapter();
			}
			@Override
			public Adapter caseTypeTypeVehicule(TypeTypeVehicule object) {
				return createTypeTypeVehiculeAdapter();
			}
			@Override
			public Adapter caseTypeUnite(TypeUnite object) {
				return createTypeUniteAdapter();
			}
			@Override
			public Adapter caseTypeUnite4D(TypeUnite4D object) {
				return createTypeUnite4DAdapter();
			}
			@Override
			public Adapter caseTypeUniteAir(TypeUniteAir object) {
				return createTypeUniteAirAdapter();
			}
			@Override
			public Adapter caseTypeUniteASS(TypeUniteASS object) {
				return createTypeUniteASSAdapter();
			}
			@Override
			public Adapter caseTypeUniteBeneficiaireMateriel(TypeUniteBeneficiaireMateriel object) {
				return createTypeUniteBeneficiaireMaterielAdapter();
			}
			@Override
			public Adapter caseTypeUniteCooperante(TypeUniteCooperante object) {
				return createTypeUniteCooperanteAdapter();
			}
			@Override
			public Adapter caseTypeUniteLogistique(TypeUniteLogistique object) {
				return createTypeUniteLogistiqueAdapter();
			}
			@Override
			public Adapter caseTypeUniteMaintenance(TypeUniteMaintenance object) {
				return createTypeUniteMaintenanceAdapter();
			}
			@Override
			public Adapter caseTypeUniteMateriel(TypeUniteMateriel object) {
				return createTypeUniteMaterielAdapter();
			}
			@Override
			public Adapter caseTypeUniteParticipante(TypeUniteParticipante object) {
				return createTypeUniteParticipanteAdapter();
			}
			@Override
			public Adapter caseTypeUtilisationIFF(TypeUtilisationIFF object) {
				return createTypeUtilisationIFFAdapter();
			}
			@Override
			public Adapter caseTypeVarianteTravail(TypeVarianteTravail object) {
				return createTypeVarianteTravailAdapter();
			}
			@Override
			public Adapter caseTypeVehicule(TypeVehicule object) {
				return createTypeVehiculeAdapter();
			}
			@Override
			public Adapter caseTypeVehiculeExceptionnel(TypeVehiculeExceptionnel object) {
				return createTypeVehiculeExceptionnelAdapter();
			}
			@Override
			public Adapter caseTypeVent(TypeVent object) {
				return createTypeVentAdapter();
			}
			@Override
			public Adapter caseTypeVisibilite(TypeVisibilite object) {
				return createTypeVisibiliteAdapter();
			}
			@Override
			public Adapter caseTypeVisibiliteSurObjectif(TypeVisibiliteSurObjectif object) {
				return createTypeVisibiliteSurObjectifAdapter();
			}
			@Override
			public Adapter caseTypeVol(TypeVol object) {
				return createTypeVolAdapter();
			}
			@Override
			public Adapter caseTypeVolumeGeometrique(TypeVolumeGeometrique object) {
				return createTypeVolumeGeometriqueAdapter();
			}
			@Override
			public Adapter caseTypeVolumeMunitionsASS(TypeVolumeMunitionsASS object) {
				return createTypeVolumeMunitionsASSAdapter();
			}
			@Override
			public Adapter caseTypeVolumeSecuriteASS(TypeVolumeSecuriteASS object) {
				return createTypeVolumeSecuriteASSAdapter();
			}
			@Override
			public Adapter caseTypeZDVparPeriode(TypeZDVparPeriode object) {
				return createTypeZDVparPeriodeAdapter();
			}
			@Override
			public Adapter caseTypeZoneAcquisition(TypeZoneAcquisition object) {
				return createTypeZoneAcquisitionAdapter();
			}
			@Override
			public Adapter caseTypeZoneAerienne(TypeZoneAerienne object) {
				return createTypeZoneAerienneAdapter();
			}
			@Override
			public Adapter caseTypeZoneAlat(TypeZoneAlat object) {
				return createTypeZoneAlatAdapter();
			}
			@Override
			public Adapter caseTypeZoneCouverte(TypeZoneCouverte object) {
				return createTypeZoneCouverteAdapter();
			}
			@Override
			public Adapter caseTypeZoneDiffusion(TypeZoneDiffusion object) {
				return createTypeZoneDiffusionAdapter();
			}
			@Override
			public Adapter caseTypeZoneFonctionnelleLogistique(TypeZoneFonctionnelleLogistique object) {
				return createTypeZoneFonctionnelleLogistiqueAdapter();
			}
			@Override
			public Adapter caseTypeZoneIntervention(TypeZoneIntervention object) {
				return createTypeZoneInterventionAdapter();
			}
			@Override
			public Adapter caseTypeZoneLogistique(TypeZoneLogistique object) {
				return createTypeZoneLogistiqueAdapter();
			}
			@Override
			public Adapter caseTypeZoneMiseATerre(TypeZoneMiseATerre object) {
				return createTypeZoneMiseATerreAdapter();
			}
			@Override
			public Adapter caseTypeZoneRecherche(TypeZoneRecherche object) {
				return createTypeZoneRechercheAdapter();
			}
			@Override
			public Adapter caseTypeZoneRisque(TypeZoneRisque object) {
				return createTypeZoneRisqueAdapter();
			}
			@Override
			public Adapter caseTypeZoneSecurite(TypeZoneSecurite object) {
				return createTypeZoneSecuriteAdapter();
			}
			@Override
			public Adapter caseTypeZonesImplantationProposees(TypeZonesImplantationProposees object) {
				return createTypeZonesImplantationProposeesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAction
	 * @generated
	 */
	public Adapter createTypeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAction3Deni <em>Type Action3 Deni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAction3Deni
	 * @generated
	 */
	public Adapter createTypeAction3DeniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeActionASAeni <em>Type Action AS Aeni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeActionASAeni
	 * @generated
	 */
	public Adapter createTypeActionASAeniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeActionGenieENI <em>Type Action Genie ENI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeActionGenieENI
	 * @generated
	 */
	public Adapter createTypeActionGenieENIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeActionRenseignement <em>Type Action Renseignement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeActionRenseignement
	 * @generated
	 */
	public Adapter createTypeActionRenseignementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeActivite <em>Type Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeActivite
	 * @generated
	 */
	public Adapter createTypeActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeActivitePosture <em>Type Activite Posture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeActivitePosture
	 * @generated
	 */
	public Adapter createTypeActivitePostureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeActiviteSurPointControle3D <em>Type Activite Sur Point Controle3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeActiviteSurPointControle3D
	 * @generated
	 */
	public Adapter createTypeActiviteSurPointControle3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAdresse <em>Type Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAdresse
	 * @generated
	 */
	public Adapter createTypeAdresseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAdresseElectronique <em>Type Adresse Electronique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAdresseElectronique
	 * @generated
	 */
	public Adapter createTypeAdresseElectroniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAdressePhysique <em>Type Adresse Physique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAdressePhysique
	 * @generated
	 */
	public Adapter createTypeAdressePhysiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAdresseRadio <em>Type Adresse Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAdresseRadio
	 * @generated
	 */
	public Adapter createTypeAdresseRadioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAerodrome <em>Type Aerodrome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAerodrome
	 * @generated
	 */
	public Adapter createTypeAerodromeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAeronef <em>Type Aeronef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAeronef
	 * @generated
	 */
	public Adapter createTypeAeronefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAffiliation <em>Type Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAffiliation
	 * @generated
	 */
	public Adapter createTypeAffiliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAirePisteGeometrique <em>Type Aire Piste Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAirePisteGeometrique
	 * @generated
	 */
	public Adapter createTypeAirePisteGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAirePolyarcGeometrique <em>Type Aire Polyarc Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAirePolyarcGeometrique
	 * @generated
	 */
	public Adapter createTypeAirePolyarcGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAirePolygoneGeometrique <em>Type Aire Polygone Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAirePolygoneGeometrique
	 * @generated
	 */
	public Adapter createTypeAirePolygoneGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAireStationnement <em>Type Aire Stationnement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAireStationnement
	 * @generated
	 */
	public Adapter createTypeAireStationnementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie <em>Type Alerte Frappe Nucleaire Amie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAlerteFrappeNucleaireAmie
	 * @generated
	 */
	public Adapter createTypeAlerteFrappeNucleaireAmieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAllure <em>Type Allure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAllure
	 * @generated
	 */
	public Adapter createTypeAllureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAnnulationIFF <em>Type Annulation IFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAnnulationIFF
	 * @generated
	 */
	public Adapter createTypeAnnulationIFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAnnulationInterdictionTir <em>Type Annulation Interdiction Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAnnulationInterdictionTir
	 * @generated
	 */
	public Adapter createTypeAnnulationInterdictionTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeApercuDestinatairePlanOuOrdre <em>Type Apercu Destinataire Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeApercuDestinatairePlanOuOrdre
	 * @generated
	 */
	public Adapter createTypeApercuDestinatairePlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAppuiFeuHelicoptere <em>Type Appui Feu Helicoptere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAppuiFeuHelicoptere
	 * @generated
	 */
	public Adapter createTypeAppuiFeuHelicoptereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeArmementMissionAppuiAerien <em>Type Armement Mission Appui Aerien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeArmementMissionAppuiAerien
	 * @generated
	 */
	public Adapter createTypeArmementMissionAppuiAerienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeArticulation <em>Type Articulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeArticulation
	 * @generated
	 */
	public Adapter createTypeArticulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeArticulationASS <em>Type Articulation ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeArticulationASS
	 * @generated
	 */
	public Adapter createTypeArticulationASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeArticulationLogistique <em>Type Articulation Logistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeArticulationLogistique
	 * @generated
	 */
	public Adapter createTypeArticulationLogistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeArticulationMarine <em>Type Articulation Marine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeArticulationMarine
	 * @generated
	 */
	public Adapter createTypeArticulationMarineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeArticulationSoutienMedical <em>Type Articulation Soutien Medical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeArticulationSoutienMedical
	 * @generated
	 */
	public Adapter createTypeArticulationSoutienMedicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeArticulationTerre <em>Type Articulation Terre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeArticulationTerre
	 * @generated
	 */
	public Adapter createTypeArticulationTerreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssocActiviteContexte <em>Type Assoc Activite Contexte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssocActiviteContexte
	 * @generated
	 */
	public Adapter createTypeAssocActiviteContexteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssocConsigneLocalisation <em>Type Assoc Consigne Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssocConsigneLocalisation
	 * @generated
	 */
	public Adapter createTypeAssocConsigneLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssocContexteContexte <em>Type Assoc Contexte Contexte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssocContexteContexte
	 * @generated
	 */
	public Adapter createTypeAssocContexteContexteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssocContexteInstanceObjet <em>Type Assoc Contexte Instance Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssocContexteInstanceObjet
	 * @generated
	 */
	public Adapter createTypeAssocContexteInstanceObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssocEntiteOrgTypeEntiteOrg <em>Type Assoc Entite Org Type Entite Org</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssocEntiteOrgTypeEntiteOrg
	 * @generated
	 */
	public Adapter createTypeAssocEntiteOrgTypeEntiteOrgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationActionAction <em>Type Association Action Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationActionAction
	 * @generated
	 */
	public Adapter createTypeAssociationActionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationActionAutreEvenement <em>Type Association Action Autre Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationActionAutreEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationActionAutreEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationActionEvenementNRBC <em>Type Association Action Evenement NRBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationActionEvenementNRBC
	 * @generated
	 */
	public Adapter createTypeAssociationActionEvenementNRBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationActiviteCapacite <em>Type Association Activite Capacite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationActiviteCapacite
	 * @generated
	 */
	public Adapter createTypeAssociationActiviteCapaciteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationActiviteLocalisation <em>Type Association Activite Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationActiviteLocalisation
	 * @generated
	 */
	public Adapter createTypeAssociationActiviteLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationAffiliationAffiliation <em>Type Association Affiliation Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationAffiliationAffiliation
	 * @generated
	 */
	public Adapter createTypeAssociationAffiliationAffiliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet <em>Type Association Affiliation Instance Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationAffiliationInstanceObjet
	 * @generated
	 */
	public Adapter createTypeAssociationAffiliationInstanceObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationAffiliationType <em>Type Association Affiliation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationAffiliationType
	 * @generated
	 */
	public Adapter createTypeAssociationAffiliationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationAutreEvenementAction <em>Type Association Autre Evenement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationAutreEvenementAction
	 * @generated
	 */
	public Adapter createTypeAssociationAutreEvenementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationAutreEvenementAutreEvenement <em>Type Association Autre Evenement Autre Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationAutreEvenementAutreEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationAutreEvenementAutreEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationAutreEvenementEvenementNRBC <em>Type Association Autre Evenement Evenement NRBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationAutreEvenementEvenementNRBC
	 * @generated
	 */
	public Adapter createTypeAssociationAutreEvenementEvenementNRBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationConflit3DMissionAerienne <em>Type Association Conflit3 DMission Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationConflit3DMissionAerienne
	 * @generated
	 */
	public Adapter createTypeAssociationConflit3DMissionAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationConsommablelMajeur <em>Type Association Consommablel Majeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationConsommablelMajeur
	 * @generated
	 */
	public Adapter createTypeAssociationConsommablelMajeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationConsommation <em>Type Association Consommation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationConsommation
	 * @generated
	 */
	public Adapter createTypeAssociationConsommationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument <em>Type Association Contenu Paragraphe Plan Ou Ordre Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument
	 * @generated
	 */
	public Adapter createTypeAssociationContenuParagraphePlanOuOrdreDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationContexteRapport <em>Type Association Contexte Rapport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationContexteRapport
	 * @generated
	 */
	public Adapter createTypeAssociationContexteRapportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationConvoiMouvementParRoute <em>Type Association Convoi Mouvement Par Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationConvoiMouvementParRoute
	 * @generated
	 */
	public Adapter createTypeAssociationConvoiMouvementParRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationDepEvacuationDepEvacuation <em>Type Association Dep Evacuation Dep Evacuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationDepEvacuationDepEvacuation
	 * @generated
	 */
	public Adapter createTypeAssociationDepEvacuationDepEvacuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationDocumentCapacite <em>Type Association Document Capacite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationDocumentCapacite
	 * @generated
	 */
	public Adapter createTypeAssociationDocumentCapaciteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationElementControleEvenement <em>Type Association Element Controle Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationElementControleEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationElementControleEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationElementTopographieEvenement <em>Type Association Element Topographie Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationElementTopographieEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationElementTopographieEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEltCtrlEltCtrl <em>Type Association Elt Ctrl Elt Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEltCtrlEltCtrl
	 * @generated
	 */
	public Adapter createTypeAssociationEltCtrlEltCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEltCtrlEltTopo <em>Type Association Elt Ctrl Elt Topo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEltCtrlEltTopo
	 * @generated
	 */
	public Adapter createTypeAssociationEltCtrlEltTopoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEltCtrlMateriel <em>Type Association Elt Ctrl Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEltCtrlMateriel
	 * @generated
	 */
	public Adapter createTypeAssociationEltCtrlMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEltCtrlSite <em>Type Association Elt Ctrl Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEltCtrlSite
	 * @generated
	 */
	public Adapter createTypeAssociationEltCtrlSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEltCtrlTypeEltCtrl <em>Type Association Elt Ctrl Type Elt Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEltCtrlTypeEltCtrl
	 * @generated
	 */
	public Adapter createTypeAssociationEltCtrlTypeEltCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEltTopoSite <em>Type Association Elt Topo Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEltTopoSite
	 * @generated
	 */
	public Adapter createTypeAssociationEltTopoSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrgAction <em>Type Association Entite Org Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrgAction
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrgActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrganisationnellePlanOuOrdre <em>Type Association Entite Organisationnelle Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrganisationnellePlanOuOrdre
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrganisationnellePlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrgEltCtrl <em>Type Association Entite Org Elt Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrgEltCtrl
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrgEltCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrgEltTopo <em>Type Association Entite Org Elt Topo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrgEltTopo
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrgEltTopoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg <em>Type Association Entite Org Entite Org</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrgEntiteOrg
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrgEntiteOrgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrgEvenement <em>Type Association Entite Org Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrgEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrgEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrgMateriel <em>Type Association Entite Org Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrgMateriel
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrgMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu <em>Type Association Entite Org Objet Inconnu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrgObjetInconnu
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrgObjetInconnuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrgPersonne <em>Type Association Entite Org Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrgPersonne
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrgPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEntiteOrgSite <em>Type Association Entite Org Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEntiteOrgSite
	 * @generated
	 */
	public Adapter createTypeAssociationEntiteOrgSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEquipementlMajeur <em>Type Association Equipementl Majeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEquipementlMajeur
	 * @generated
	 */
	public Adapter createTypeAssociationEquipementlMajeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEvenementNRBCAction <em>Type Association Evenement NRBC Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEvenementNRBCAction
	 * @generated
	 */
	public Adapter createTypeAssociationEvenementNRBCActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEvenementNRBCAutreEvenement <em>Type Association Evenement NRBC Autre Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEvenementNRBCAutreEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationEvenementNRBCAutreEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEvenementNRBCEvenementNRBC <em>Type Association Evenement NRBC Evenement NRBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEvenementNRBCEvenementNRBC
	 * @generated
	 */
	public Adapter createTypeAssociationEvenementNRBCEvenementNRBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement <em>Type Association Evenement RENS Autre Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEvenementRENSAutreEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationEvenementRENSAutreEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS <em>Type Association Evenement RENS Evenement RENS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationEvenementRENSEvenementRENS
	 * @generated
	 */
	public Adapter createTypeAssociationEvenementRENSEvenementRENSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationFonctionnelleActivite <em>Type Association Fonctionnelle Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationFonctionnelleActivite
	 * @generated
	 */
	public Adapter createTypeAssociationFonctionnelleActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle <em>Type Association Groupe Info Ops Entite Organisationnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle
	 * @generated
	 */
	public Adapter createTypeAssociationGroupeInfoOpsEntiteOrganisationnelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationGroupeInfoOpsPlanOuOrdre <em>Type Association Groupe Info Ops Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationGroupeInfoOpsPlanOuOrdre
	 * @generated
	 */
	public Adapter createTypeAssociationGroupeInfoOpsPlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationHoraireManoeuvre <em>Type Association Horaire Manoeuvre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationHoraireManoeuvre
	 * @generated
	 */
	public Adapter createTypeAssociationHoraireManoeuvreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationInstanceObjetActivite <em>Type Association Instance Objet Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationInstanceObjetActivite
	 * @generated
	 */
	public Adapter createTypeAssociationInstanceObjetActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationInstanceObjetAdresse <em>Type Association Instance Objet Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationInstanceObjetAdresse
	 * @generated
	 */
	public Adapter createTypeAssociationInstanceObjetAdresseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationInstanceObjetCapacite <em>Type Association Instance Objet Capacite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationInstanceObjetCapacite
	 * @generated
	 */
	public Adapter createTypeAssociationInstanceObjetCapaciteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationInstanceObjetInstanceObjet <em>Type Association Instance Objet Instance Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationInstanceObjetInstanceObjet
	 * @generated
	 */
	public Adapter createTypeAssociationInstanceObjetInstanceObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationInstanceObjetType <em>Type Association Instance Objet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationInstanceObjetType
	 * @generated
	 */
	public Adapter createTypeAssociationInstanceObjetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationLivraisonLivaison <em>Type Association Livraison Livaison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationLivraisonLivaison
	 * @generated
	 */
	public Adapter createTypeAssociationLivraisonLivaisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMaterielEltCtrl <em>Type Association Materiel Elt Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMaterielEltCtrl
	 * @generated
	 */
	public Adapter createTypeAssociationMaterielEltCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMaterielEltTopo <em>Type Association Materiel Elt Topo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMaterielEltTopo
	 * @generated
	 */
	public Adapter createTypeAssociationMaterielEltTopoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMaterielEvenement <em>Type Association Materiel Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMaterielEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationMaterielEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMaterielMateriel <em>Type Association Materiel Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMaterielMateriel
	 * @generated
	 */
	public Adapter createTypeAssociationMaterielMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMaterielMeteorologie <em>Type Association Materiel Meteorologie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMaterielMeteorologie
	 * @generated
	 */
	public Adapter createTypeAssociationMaterielMeteorologieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMaterielObjetInconnu <em>Type Association Materiel Objet Inconnu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMaterielObjetInconnu
	 * @generated
	 */
	public Adapter createTypeAssociationMaterielObjetInconnuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMaterielPersonne <em>Type Association Materiel Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMaterielPersonne
	 * @generated
	 */
	public Adapter createTypeAssociationMaterielPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMaterielSite <em>Type Association Materiel Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMaterielSite
	 * @generated
	 */
	public Adapter createTypeAssociationMaterielSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMaterielTypeMateriel <em>Type Association Materiel Type Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMaterielTypeMateriel
	 * @generated
	 */
	public Adapter createTypeAssociationMaterielTypeMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux <em>Type Association Mesure Coordination Plan Feux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMesureCoordinationPlanFeux
	 * @generated
	 */
	public Adapter createTypeAssociationMesureCoordinationPlanFeuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMesureCoordMissionAerienne <em>Type Association Mesure Coord Mission Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMesureCoordMissionAerienne
	 * @generated
	 */
	public Adapter createTypeAssociationMesureCoordMissionAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMeteorologieSite <em>Type Association Meteorologie Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMeteorologieSite
	 * @generated
	 */
	public Adapter createTypeAssociationMeteorologieSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne <em>Type Association Mission Aerienne Mission Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMissionAerienneMissionAerienne
	 * @generated
	 */
	public Adapter createTypeAssociationMissionAerienneMissionAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMissionGenieMissionGenie <em>Type Association Mission Genie Mission Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMissionGenieMissionGenie
	 * @generated
	 */
	public Adapter createTypeAssociationMissionGenieMissionGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMissionMeleeAction <em>Type Association Mission Melee Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMissionMeleeAction
	 * @generated
	 */
	public Adapter createTypeAssociationMissionMeleeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement <em>Type Association Mission Mouvement Mission Mouvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMissionMouvementMissionMouvement
	 * @generated
	 */
	public Adapter createTypeAssociationMissionMouvementMissionMouvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMissionRenseignementAction <em>Type Association Mission Renseignement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMissionRenseignementAction
	 * @generated
	 */
	public Adapter createTypeAssociationMissionRenseignementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj <em>Type Association Mission Rens Obj Plan Traitement Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj
	 * @generated
	 */
	public Adapter createTypeAssociationMissionRensObjPlanTraitementObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMissionRensObjTraitementObj <em>Type Association Mission Rens Obj Traitement Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMissionRensObjTraitementObj
	 * @generated
	 */
	public Adapter createTypeAssociationMissionRensObjTraitementObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute <em>Type Association Mouvement Par Route Mouvement Par Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute
	 * @generated
	 */
	public Adapter createTypeAssociationMouvementParRouteMouvementParRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation <em>Type Association Objectif Activite Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationObjectifActiviteLocalisation
	 * @generated
	 */
	public Adapter createTypeAssociationObjectifActiviteLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationObjectifCiblageDocument <em>Type Association Objectif Ciblage Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationObjectifCiblageDocument
	 * @generated
	 */
	public Adapter createTypeAssociationObjectifCiblageDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationObjectifCiblageLocalisation <em>Type Association Objectif Ciblage Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationObjectifCiblageLocalisation
	 * @generated
	 */
	public Adapter createTypeAssociationObjectifCiblageLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage <em>Type Association Objectif Ciblage Objectif Ciblage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage
	 * @generated
	 */
	public Adapter createTypeAssociationObjectifCiblageObjectifCiblageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationObjetInconnuEltCtrl <em>Type Association Objet Inconnu Elt Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationObjetInconnuEltCtrl
	 * @generated
	 */
	public Adapter createTypeAssociationObjetInconnuEltCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationObjetInconnuEltTopo <em>Type Association Objet Inconnu Elt Topo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationObjetInconnuEltTopo
	 * @generated
	 */
	public Adapter createTypeAssociationObjetInconnuEltTopoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationObjetInconnuSite <em>Type Association Objet Inconnu Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationObjetInconnuSite
	 * @generated
	 */
	public Adapter createTypeAssociationObjetInconnuSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationObservationObservation <em>Type Association Observation Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationObservationObservation
	 * @generated
	 */
	public Adapter createTypeAssociationObservationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationParagraphePOparagraphePO <em>Type Association Paragraphe POparagraphe PO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationParagraphePOparagraphePO
	 * @generated
	 */
	public Adapter createTypeAssociationParagraphePOparagraphePOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonneEltCtrl <em>Type Association Personne Elt Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonneEltCtrl
	 * @generated
	 */
	public Adapter createTypeAssociationPersonneEltCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonneEltTopo <em>Type Association Personne Elt Topo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonneEltTopo
	 * @generated
	 */
	public Adapter createTypeAssociationPersonneEltTopoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonneEvenement <em>Type Association Personne Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonneEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationPersonneEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonneMateriel <em>Type Association Personne Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonneMateriel
	 * @generated
	 */
	public Adapter createTypeAssociationPersonneMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonneMissionAir <em>Type Association Personne Mission Air</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonneMissionAir
	 * @generated
	 */
	public Adapter createTypeAssociationPersonneMissionAirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonneObjetInconnu <em>Type Association Personne Objet Inconnu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonneObjetInconnu
	 * @generated
	 */
	public Adapter createTypeAssociationPersonneObjetInconnuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonnePersonne <em>Type Association Personne Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonnePersonne
	 * @generated
	 */
	public Adapter createTypeAssociationPersonnePersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonnePlanifOperation3D <em>Type Association Personne Planif Operation3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonnePlanifOperation3D
	 * @generated
	 */
	public Adapter createTypeAssociationPersonnePlanifOperation3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonneSite <em>Type Association Personne Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonneSite
	 * @generated
	 */
	public Adapter createTypeAssociationPersonneSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPersonneTypePersonne <em>Type Association Personne Type Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPersonneTypePersonne
	 * @generated
	 */
	public Adapter createTypeAssociationPersonneTypePersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionAir <em>Type Association Planification Operation3 DMission Air</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPlanificationOperation3DMissionAir
	 * @generated
	 */
	public Adapter createTypeAssociationPlanificationOperation3DMissionAirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA <em>Type Association Planification Operation3 DMission ASA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPlanificationOperation3DMissionASA
	 * @generated
	 */
	public Adapter createTypeAssociationPlanificationOperation3DMissionASAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre <em>Type Association Plan Ou Ordre Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre
	 * @generated
	 */
	public Adapter createTypeAssociationPlanOuOrdrePlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj <em>Type Association Plan Traitement Obj Traitement Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationPlanTraitementObjTraitementObj
	 * @generated
	 */
	public Adapter createTypeAssociationPlanTraitementObjTraitementObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationProfilDotationTheorique <em>Type Association Profil Dotation Theorique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationProfilDotationTheorique
	 * @generated
	 */
	public Adapter createTypeAssociationProfilDotationTheoriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationProfilUnite <em>Type Association Profil Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationProfilUnite
	 * @generated
	 */
	public Adapter createTypeAssociationProfilUniteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument <em>Type Association Racine Operationnelle Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationRacineOperationnelleDocument
	 * @generated
	 */
	public Adapter createTypeAssociationRacineOperationnelleDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj <em>Type Association Renseignement Obj Mis Renseignement Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj
	 * @generated
	 */
	public Adapter createTypeAssociationRenseignementObjMisRenseignementObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationSiteEltCtrl <em>Type Association Site Elt Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationSiteEltCtrl
	 * @generated
	 */
	public Adapter createTypeAssociationSiteEltCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationSiteEltTopo <em>Type Association Site Elt Topo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationSiteEltTopo
	 * @generated
	 */
	public Adapter createTypeAssociationSiteEltTopoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationSiteEvenement <em>Type Association Site Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationSiteEvenement
	 * @generated
	 */
	public Adapter createTypeAssociationSiteEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationSiteMateriel <em>Type Association Site Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationSiteMateriel
	 * @generated
	 */
	public Adapter createTypeAssociationSiteMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationSiteMeteorologie <em>Type Association Site Meteorologie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationSiteMeteorologie
	 * @generated
	 */
	public Adapter createTypeAssociationSiteMeteorologieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationSiteObjetInconnu <em>Type Association Site Objet Inconnu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationSiteObjetInconnu
	 * @generated
	 */
	public Adapter createTypeAssociationSiteObjetInconnuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationSiteSite <em>Type Association Site Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationSiteSite
	 * @generated
	 */
	public Adapter createTypeAssociationSiteSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationSiteTypeSite <em>Type Association Site Type Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationSiteTypeSite
	 * @generated
	 */
	public Adapter createTypeAssociationSiteTypeSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationSyntheseDetectionsEvenementNRBC <em>Type Association Synthese Detections Evenement NRBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationSyntheseDetectionsEvenementNRBC
	 * @generated
	 */
	public Adapter createTypeAssociationSyntheseDetectionsEvenementNRBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationTemporelleActivite <em>Type Association Temporelle Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationTemporelleActivite
	 * @generated
	 */
	public Adapter createTypeAssociationTemporelleActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj <em>Type Association Traitement Obj Plan Traitement Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationTraitementObjPlanTraitementObj
	 * @generated
	 */
	public Adapter createTypeAssociationTraitementObjPlanTraitementObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationTypeCapacite <em>Type Association Type Capacite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationTypeCapacite
	 * @generated
	 */
	public Adapter createTypeAssociationTypeCapaciteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere <em>Type Association Unite Appui Feu Helicoptere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere
	 * @generated
	 */
	public Adapter createTypeAssociationUniteAppuiFeuHelicoptereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteAutreMissionLog <em>Type Association Unite Autre Mission Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteAutreMissionLog
	 * @generated
	 */
	public Adapter createTypeAssociationUniteAutreMissionLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteLivraison <em>Type Association Unite Livraison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteLivraison
	 * @generated
	 */
	public Adapter createTypeAssociationUniteLivraisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionAcqASS <em>Type Association Unite Mission Acq ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionAcqASS
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionAcqASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionAerienne <em>Type Association Unite Mission Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionAerienne
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionAir <em>Type Association Unite Mission Air</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionAir
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionAirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionALATattaque <em>Type Association Unite Mission ALA Tattaque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionALATattaque
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionALATattaqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionASA <em>Type Association Unite Mission ASA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionASA
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionASAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionEscorteAF <em>Type Association Unite Mission Escorte AF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionEscorteAF
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionEscorteAFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionGenie <em>Type Association Unite Mission Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionGenie
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionMelee <em>Type Association Unite Mission Melee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionMelee
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionMeleeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionRensObj <em>Type Association Unite Mission Rens Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionRensObj
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionRensObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionSic <em>Type Association Unite Mission Sic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionSic
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionSicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionTranspTact <em>Type Association Unite Mission Transp Tact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionTranspTact
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionTranspTactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMissionUniteAntichar <em>Type Association Unite Mission Unite Antichar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMissionUniteAntichar
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMissionUniteAnticharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteMouvementParRoute <em>Type Association Unite Mouvement Par Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteMouvementParRoute
	 * @generated
	 */
	public Adapter createTypeAssociationUniteMouvementParRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUnitePlanFeux <em>Type Association Unite Plan Feux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUnitePlanFeux
	 * @generated
	 */
	public Adapter createTypeAssociationUnitePlanFeuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUnitePlanifOperation3D <em>Type Association Unite Planif Operation3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUnitePlanifOperation3D
	 * @generated
	 */
	public Adapter createTypeAssociationUnitePlanifOperation3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssociationUniteRenforcementsFeux <em>Type Association Unite Renforcements Feux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssociationUniteRenforcementsFeux
	 * @generated
	 */
	public Adapter createTypeAssociationUniteRenforcementsFeuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssocInstanceObjetLocalisation <em>Type Assoc Instance Objet Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssocInstanceObjetLocalisation
	 * @generated
	 */
	public Adapter createTypeAssocInstanceObjetLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssocListeObjCandListeObjCand <em>Type Assoc Liste Obj Cand Liste Obj Cand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssocListeObjCandListeObjCand
	 * @generated
	 */
	public Adapter createTypeAssocListeObjCandListeObjCandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssocPisteAtterDirAppAir <em>Type Assoc Piste Atter Dir App Air</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssocPisteAtterDirAppAir
	 * @generated
	 */
	public Adapter createTypeAssocPisteAtterDirAppAirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAssocSymboleTactique <em>Type Assoc Symbole Tactique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAssocSymboleTactique
	 * @generated
	 */
	public Adapter createTypeAssocSymboleTactiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAtmosphere <em>Type Atmosphere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAtmosphere
	 * @generated
	 */
	public Adapter createTypeAtmosphereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutonomieModule <em>Type Autonomie Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutonomieModule
	 * @generated
	 */
	public Adapter createTypeAutonomieModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats <em>Type Autorisation Liste Objectifs Candidats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutorisationListeObjectifsCandidats
	 * @generated
	 */
	public Adapter createTypeAutorisationListeObjectifsCandidatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutorisationObjectifCiblage <em>Type Autorisation Objectif Ciblage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutorisationObjectifCiblage
	 * @generated
	 */
	public Adapter createTypeAutorisationObjectifCiblageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreAction <em>Type Autre Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreAction
	 * @generated
	 */
	public Adapter createTypeAutreActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreAdresse <em>Type Autre Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreAdresse
	 * @generated
	 */
	public Adapter createTypeAutreAdresseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreAffiliation <em>Type Autre Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreAffiliation
	 * @generated
	 */
	public Adapter createTypeAutreAffiliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreArticulation <em>Type Autre Articulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreArticulation
	 * @generated
	 */
	public Adapter createTypeAutreArticulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreCapteurRENS <em>Type Autre Capteur RENS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreCapteurRENS
	 * @generated
	 */
	public Adapter createTypeAutreCapteurRENSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreContexte <em>Type Autre Contexte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreContexte
	 * @generated
	 */
	public Adapter createTypeAutreContexteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreDotationEffective <em>Type Autre Dotation Effective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreDotationEffective
	 * @generated
	 */
	public Adapter createTypeAutreDotationEffectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreElementControle <em>Type Autre Element Controle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreElementControle
	 * @generated
	 */
	public Adapter createTypeAutreElementControleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreEmploi <em>Type Autre Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreEmploi
	 * @generated
	 */
	public Adapter createTypeAutreEmploiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreEvenement <em>Type Autre Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreEvenement
	 * @generated
	 */
	public Adapter createTypeAutreEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreEvenementNRBC <em>Type Autre Evenement NRBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreEvenementNRBC
	 * @generated
	 */
	public Adapter createTypeAutreEvenementNRBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreEvenementNucleaire <em>Type Autre Evenement Nucleaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreEvenementNucleaire
	 * @generated
	 */
	public Adapter createTypeAutreEvenementNucleaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreEvenementRadioactif <em>Type Autre Evenement Radioactif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreEvenementRadioactif
	 * @generated
	 */
	public Adapter createTypeAutreEvenementRadioactifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreListeObjectifs <em>Type Autre Liste Objectifs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreListeObjectifs
	 * @generated
	 */
	public Adapter createTypeAutreListeObjectifsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreMateriel <em>Type Autre Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreMateriel
	 * @generated
	 */
	public Adapter createTypeAutreMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreMenace <em>Type Autre Menace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreMenace
	 * @generated
	 */
	public Adapter createTypeAutreMenaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreMission <em>Type Autre Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreMission
	 * @generated
	 */
	public Adapter createTypeAutreMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreMissionALAT <em>Type Autre Mission ALAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreMissionALAT
	 * @generated
	 */
	public Adapter createTypeAutreMissionALATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreMissionLogistique <em>Type Autre Mission Logistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreMissionLogistique
	 * @generated
	 */
	public Adapter createTypeAutreMissionLogistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreNom <em>Type Autre Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreNom
	 * @generated
	 */
	public Adapter createTypeAutreNomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreObjectifActiviteType <em>Type Autre Objectif Activite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreObjectifActiviteType
	 * @generated
	 */
	public Adapter createTypeAutreObjectifActiviteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreObstacle <em>Type Autre Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreObstacle
	 * @generated
	 */
	public Adapter createTypeAutreObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutrePhenomeneMeteorologique <em>Type Autre Phenomene Meteorologique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutrePhenomeneMeteorologique
	 * @generated
	 */
	public Adapter createTypeAutrePhenomeneMeteorologiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreSegmentItineraire <em>Type Autre Segment Itineraire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreSegmentItineraire
	 * @generated
	 */
	public Adapter createTypeAutreSegmentItineraireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreSite <em>Type Autre Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreSite
	 * @generated
	 */
	public Adapter createTypeAutreSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreTypeBatiment <em>Type Autre Type Batiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreTypeBatiment
	 * @generated
	 */
	public Adapter createTypeAutreTypeBatimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreTypeConsommable <em>Type Autre Type Consommable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreTypeConsommable
	 * @generated
	 */
	public Adapter createTypeAutreTypeConsommableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreTypeConsommableSystemeArme <em>Type Autre Type Consommable Systeme Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreTypeConsommableSystemeArme
	 * @generated
	 */
	public Adapter createTypeAutreTypeConsommableSystemeArmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreTypeElementControle <em>Type Autre Type Element Controle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreTypeElementControle
	 * @generated
	 */
	public Adapter createTypeAutreTypeElementControleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreTypeEntiteOrganisationnelle <em>Type Autre Type Entite Organisationnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreTypeEntiteOrganisationnelle
	 * @generated
	 */
	public Adapter createTypeAutreTypeEntiteOrganisationnelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreTypeEquipement <em>Type Autre Type Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreTypeEquipement
	 * @generated
	 */
	public Adapter createTypeAutreTypeEquipementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale <em>Type Autre Type Organisation Gouvernementale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreTypeOrganisationGouvernementale
	 * @generated
	 */
	public Adapter createTypeAutreTypeOrganisationGouvernementaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAutreTypeSite <em>Type Autre Type Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAutreTypeSite
	 * @generated
	 */
	public Adapter createTypeAutreTypeSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAvancementTravailGenie <em>Type Avancement Travail Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAvancementTravailGenie
	 * @generated
	 */
	public Adapter createTypeAvancementTravailGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAxe <em>Type Axe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAxe
	 * @generated
	 */
	public Adapter createTypeAxeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeAzimut <em>Type Azimut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeAzimut
	 * @generated
	 */
	public Adapter createTypeAzimutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBaseCalculNecessaire <em>Type Base Calcul Necessaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBaseCalculNecessaire
	 * @generated
	 */
	public Adapter createTypeBaseCalculNecessaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBassin <em>Type Bassin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBassin
	 * @generated
	 */
	public Adapter createTypeBassinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBatiment <em>Type Batiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBatiment
	 * @generated
	 */
	public Adapter createTypeBatimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBesoinEnCarburant <em>Type Besoin En Carburant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBesoinEnCarburant
	 * @generated
	 */
	public Adapter createTypeBesoinEnCarburantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBesoinRaccordement <em>Type Besoin Raccordement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBesoinRaccordement
	 * @generated
	 */
	public Adapter createTypeBesoinRaccordementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBesoinsEnRenseignements <em>Type Besoins En Renseignements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBesoinsEnRenseignements
	 * @generated
	 */
	public Adapter createTypeBesoinsEnRenseignementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBilanModule <em>Type Bilan Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBilanModule
	 * @generated
	 */
	public Adapter createTypeBilanModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBilanTirsASS <em>Type Bilan Tirs ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBilanTirsASS
	 * @generated
	 */
	public Adapter createTypeBilanTirsASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBilanTirsASSsurZone <em>Type Bilan Tirs AS Ssur Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBilanTirsASSsurZone
	 * @generated
	 */
	public Adapter createTypeBilanTirsASSsurZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBlessesParPeriode <em>Type Blesses Par Periode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBlessesParPeriode
	 * @generated
	 */
	public Adapter createTypeBlessesParPeriodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBrancheEurogrid <em>Type Branche Eurogrid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBrancheEurogrid
	 * @generated
	 */
	public Adapter createTypeBrancheEurogridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBrancheNavigation <em>Type Branche Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBrancheNavigation
	 * @generated
	 */
	public Adapter createTypeBrancheNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeBulletinSondage <em>Type Bulletin Sondage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeBulletinSondage
	 * @generated
	 */
	public Adapter createTypeBulletinSondageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaleLancement <em>Type Cale Lancement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaleLancement
	 * @generated
	 */
	public Adapter createTypeCaleLancementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCalendrierCourrier <em>Type Calendrier Courrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCalendrierCourrier
	 * @generated
	 */
	public Adapter createTypeCalendrierCourrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaleSeche <em>Type Cale Seche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaleSeche
	 * @generated
	 */
	public Adapter createTypeCaleSecheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCamp <em>Type Camp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCamp
	 * @generated
	 */
	public Adapter createTypeCampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapacite <em>Type Capacite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapacite
	 * @generated
	 */
	public Adapter createTypeCapaciteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteFeux <em>Type Capacite Feux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteFeux
	 * @generated
	 */
	public Adapter createTypeCapaciteFeuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteGenie <em>Type Capacite Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteGenie
	 * @generated
	 */
	public Adapter createTypeCapaciteGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteHebergement <em>Type Capacite Hebergement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteHebergement
	 * @generated
	 */
	public Adapter createTypeCapaciteHebergementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteMaintenance <em>Type Capacite Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteMaintenance
	 * @generated
	 */
	public Adapter createTypeCapaciteMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteManutention <em>Type Capacite Manutention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteManutention
	 * @generated
	 */
	public Adapter createTypeCapaciteManutentionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteMobilite <em>Type Capacite Mobilite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteMobilite
	 * @generated
	 */
	public Adapter createTypeCapaciteMobiliteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteObservationASS <em>Type Capacite Observation ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteObservationASS
	 * @generated
	 */
	public Adapter createTypeCapaciteObservationASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteOperationnelle <em>Type Capacite Operationnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteOperationnelle
	 * @generated
	 */
	public Adapter createTypeCapaciteOperationnelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteReseau <em>Type Capacite Reseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteReseau
	 * @generated
	 */
	public Adapter createTypeCapaciteReseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteSoutien <em>Type Capacite Soutien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteSoutien
	 * @generated
	 */
	public Adapter createTypeCapaciteSoutienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteStockage <em>Type Capacite Stockage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteStockage
	 * @generated
	 */
	public Adapter createTypeCapaciteStockageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteSurveillance <em>Type Capacite Surveillance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteSurveillance
	 * @generated
	 */
	public Adapter createTypeCapaciteSurveillanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapaciteTransmission <em>Type Capacite Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapaciteTransmission
	 * @generated
	 */
	public Adapter createTypeCapaciteTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapteurDrone <em>Type Capteur Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapteurDrone
	 * @generated
	 */
	public Adapter createTypeCapteurDroneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapteurLocalisationRadioelectrique <em>Type Capteur Localisation Radioelectrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapteurLocalisationRadioelectrique
	 * @generated
	 */
	public Adapter createTypeCapteurLocalisationRadioelectriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapteurRadar <em>Type Capteur Radar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapteurRadar
	 * @generated
	 */
	public Adapter createTypeCapteurRadarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapteurRENS <em>Type Capteur RENS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapteurRENS
	 * @generated
	 */
	public Adapter createTypeCapteurRENSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCapteurROHUM <em>Type Capteur ROHUM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCapteurROHUM
	 * @generated
	 */
	public Adapter createTypeCapteurROHUMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaracteristiqueAutreSite <em>Type Caracteristique Autre Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaracteristiqueAutreSite
	 * @generated
	 */
	public Adapter createTypeCaracteristiqueAutreSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaracteristiqueComplementaireObstacle <em>Type Caracteristique Complementaire Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaracteristiqueComplementaireObstacle
	 * @generated
	 */
	public Adapter createTypeCaracteristiqueComplementaireObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaracteristiqueGroupeIndividus <em>Type Caracteristique Groupe Individus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaracteristiqueGroupeIndividus
	 * @generated
	 */
	public Adapter createTypeCaracteristiqueGroupeIndividusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaracteristiqueLogistique <em>Type Caracteristique Logistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaracteristiqueLogistique
	 * @generated
	 */
	public Adapter createTypeCaracteristiqueLogistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation <em>Type Caracteristiques Assoc Instance Objet Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation
	 * @generated
	 */
	public Adapter createTypeCaracteristiquesAssocInstanceObjetLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaracteristiquesMouvement <em>Type Caracteristiques Mouvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaracteristiquesMouvement
	 * @generated
	 */
	public Adapter createTypeCaracteristiquesMouvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaracteristiquesSIO <em>Type Caracteristiques SIO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaracteristiquesSIO
	 * @generated
	 */
	public Adapter createTypeCaracteristiquesSIOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaracteristiqueTransport <em>Type Caracteristique Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaracteristiqueTransport
	 * @generated
	 */
	public Adapter createTypeCaracteristiqueTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCaracteristiqueZoneContaminee <em>Type Caracteristique Zone Contaminee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCaracteristiqueZoneContaminee
	 * @generated
	 */
	public Adapter createTypeCaracteristiqueZoneContamineeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCarnetPoints <em>Type Carnet Points</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCarnetPoints
	 * @generated
	 */
	public Adapter createTypeCarnetPointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCelluleSoutien <em>Type Cellule Soutien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCelluleSoutien
	 * @generated
	 */
	public Adapter createTypeCelluleSoutienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCentreASA <em>Type Centre ASA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCentreASA
	 * @generated
	 */
	public Adapter createTypeCentreASAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCentreLLAPI <em>Type Centre LLAPI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCentreLLAPI
	 * @generated
	 */
	public Adapter createTypeCentreLLAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCentreNC23 <em>Type Centre NC23</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCentreNC23
	 * @generated
	 */
	public Adapter createTypeCentreNC23Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCercleGeometrique <em>Type Cercle Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCercleGeometrique
	 * @generated
	 */
	public Adapter createTypeCercleGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeChampMines <em>Type Champ Mines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeChampMines
	 * @generated
	 */
	public Adapter createTypeChampMinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeChampMinesMaritime <em>Type Champ Mines Maritime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeChampMinesMaritime
	 * @generated
	 */
	public Adapter createTypeChampMinesMaritimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes <em>Type Champ Mines Maritime Dommages Estimes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeChampMinesMaritimeDommagesEstimes
	 * @generated
	 */
	public Adapter createTypeChampMinesMaritimeDommagesEstimesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeChampMinesTerrestre <em>Type Champ Mines Terrestre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeChampMinesTerrestre
	 * @generated
	 */
	public Adapter createTypeChampMinesTerrestreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeChargement <em>Type Chargement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeChargement
	 * @generated
	 */
	public Adapter createTypeChargementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeChargementMateriel <em>Type Chargement Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeChargementMateriel
	 * @generated
	 */
	public Adapter createTypeChargementMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCharnier <em>Type Charnier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCharnier
	 * @generated
	 */
	public Adapter createTypeCharnierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCheminFer <em>Type Chemin Fer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCheminFer
	 * @generated
	 */
	public Adapter createTypeCheminFerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCompetenceLinguistique <em>Type Competence Linguistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCompetenceLinguistique
	 * @generated
	 */
	public Adapter createTypeCompetenceLinguistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeComportement <em>Type Comportement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeComportement
	 * @generated
	 */
	public Adapter createTypeComportementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeComportementSecours <em>Type Comportement Secours</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeComportementSecours
	 * @generated
	 */
	public Adapter createTypeComportementSecoursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeComposanteAppui <em>Type Composante Appui</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeComposanteAppui
	 * @generated
	 */
	public Adapter createTypeComposanteAppuiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType <em>Type Composition Dotation Theorique En Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCompositionDotationTheoriqueEnType
	 * @generated
	 */
	public Adapter createTypeCompositionDotationTheoriqueEnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeComptage <em>Type Comptage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeComptage
	 * @generated
	 */
	public Adapter createTypeComptageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeComptageParActivite <em>Type Comptage Par Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeComptageParActivite
	 * @generated
	 */
	public Adapter createTypeComptageParActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCompteRenduMouvement <em>Type Compte Rendu Mouvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCompteRenduMouvement
	 * @generated
	 */
	public Adapter createTypeCompteRenduMouvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCompteRenduTir <em>Type Compte Rendu Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCompteRenduTir
	 * @generated
	 */
	public Adapter createTypeCompteRenduTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConduiteATenir <em>Type Conduite ATenir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConduiteATenir
	 * @generated
	 */
	public Adapter createTypeConduiteATenirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConeGeometrique <em>Type Cone Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConeGeometrique
	 * @generated
	 */
	public Adapter createTypeConeGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConfiguration <em>Type Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConfiguration
	 * @generated
	 */
	public Adapter createTypeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConflit3D <em>Type Conflit3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConflit3D
	 * @generated
	 */
	public Adapter createTypeConflit3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsigne <em>Type Consigne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsigne
	 * @generated
	 */
	public Adapter createTypeConsigneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsigneGeographique <em>Type Consigne Geographique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsigneGeographique
	 * @generated
	 */
	public Adapter createTypeConsigneGeographiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA <em>Type Consigne Lutte Antiaerienne TTA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsigneLutteAntiaerienneTTA
	 * @generated
	 */
	public Adapter createTypeConsigneLutteAntiaerienneTTAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsigneParticuliere <em>Type Consigne Particuliere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsigneParticuliere
	 * @generated
	 */
	public Adapter createTypeConsigneParticuliereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsignesGeneralesTirASA <em>Type Consignes Generales Tir ASA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsignesGeneralesTirASA
	 * @generated
	 */
	public Adapter createTypeConsignesGeneralesTirASAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsigneTir <em>Type Consigne Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsigneTir
	 * @generated
	 */
	public Adapter createTypeConsigneTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsommableSante <em>Type Consommable Sante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsommableSante
	 * @generated
	 */
	public Adapter createTypeConsommableSanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsommationAutorisee <em>Type Consommation Autorisee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsommationAutorisee
	 * @generated
	 */
	public Adapter createTypeConsommationAutoriseeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsommationEnMunitions <em>Type Consommation En Munitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsommationEnMunitions
	 * @generated
	 */
	public Adapter createTypeConsommationEnMunitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsommationExplosifs <em>Type Consommation Explosifs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsommationExplosifs
	 * @generated
	 */
	public Adapter createTypeConsommationExplosifsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConsommationMines <em>Type Consommation Mines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConsommationMines
	 * @generated
	 */
	public Adapter createTypeConsommationMinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConstatDestruction <em>Type Constat Destruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConstatDestruction
	 * @generated
	 */
	public Adapter createTypeConstatDestructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConstatForce <em>Type Constat Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConstatForce
	 * @generated
	 */
	public Adapter createTypeConstatForceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConstatPopulation <em>Type Constat Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConstatPopulation
	 * @generated
	 */
	public Adapter createTypeConstatPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConstatTerrain <em>Type Constat Terrain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConstatTerrain
	 * @generated
	 */
	public Adapter createTypeConstatTerrainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre <em>Type Contenu Paragraphe Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeContenuParagraphePlanOuOrdre
	 * @generated
	 */
	public Adapter createTypeContenuParagraphePlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeContenuTextuel <em>Type Contenu Textuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeContenuTextuel
	 * @generated
	 */
	public Adapter createTypeContenuTextuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeContexte <em>Type Contexte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeContexte
	 * @generated
	 */
	public Adapter createTypeContexteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeContraintesMouvement <em>Type Contraintes Mouvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeContraintesMouvement
	 * @generated
	 */
	public Adapter createTypeContraintesMouvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeConvoi <em>Type Convoi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeConvoi
	 * @generated
	 */
	public Adapter createTypeConvoiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCoordination4D <em>Type Coordination4 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCoordination4D
	 * @generated
	 */
	public Adapter createTypeCoordination4DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCoordonneesLatLong <em>Type Coordonnees Lat Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCoordonneesLatLong
	 * @generated
	 */
	public Adapter createTypeCoordonneesLatLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCorridorGeometrique <em>Type Corridor Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCorridorGeometrique
	 * @generated
	 */
	public Adapter createTypeCorridorGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCouvertureAerienne <em>Type Couverture Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCouvertureAerienne
	 * @generated
	 */
	public Adapter createTypeCouvertureAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCouvertureASA <em>Type Couverture ASA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCouvertureASA
	 * @generated
	 */
	public Adapter createTypeCouvertureASAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCouvertureNuageuse <em>Type Couverture Nuageuse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCouvertureNuageuse
	 * @generated
	 */
	public Adapter createTypeCouvertureNuageuseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCRactiviteASS <em>Type CRactivite ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCRactiviteASS
	 * @generated
	 */
	public Adapter createTypeCRactiviteASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCRevaluationDegats <em>Type CRevaluation Degats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCRevaluationDegats
	 * @generated
	 */
	public Adapter createTypeCRevaluationDegatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCRfinMissionAcquisition <em>Type CRfin Mission Acquisition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCRfinMissionAcquisition
	 * @generated
	 */
	public Adapter createTypeCRfinMissionAcquisitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCrIncident <em>Type Cr Incident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCrIncident
	 * @generated
	 */
	public Adapter createTypeCrIncidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCriteresIdentification <em>Type Criteres Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCriteresIdentification
	 * @generated
	 */
	public Adapter createTypeCriteresIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCRmouvementAerien <em>Type CRmouvement Aerien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCRmouvementAerien
	 * @generated
	 */
	public Adapter createTypeCRmouvementAerienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCRplanFeux <em>Type CRplan Feux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCRplanFeux
	 * @generated
	 */
	public Adapter createTypeCRplanFeuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCrReconnaissance <em>Type Cr Reconnaissance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCrReconnaissance
	 * @generated
	 */
	public Adapter createTypeCrReconnaissanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCRrenseignementObjectif <em>Type CRrenseignement Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCRrenseignementObjectif
	 * @generated
	 */
	public Adapter createTypeCRrenseignementObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCRtraitementObjectif <em>Type CRtraitement Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCRtraitementObjectif
	 * @generated
	 */
	public Adapter createTypeCRtraitementObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeCylindreGeometrique <em>Type Cylindre Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeCylindreGeometrique
	 * @generated
	 */
	public Adapter createTypeCylindreGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDatation <em>Type Datation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDatation
	 * @generated
	 */
	public Adapter createTypeDatationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDeclenchementTir <em>Type Declenchement Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDeclenchementTir
	 * @generated
	 */
	public Adapter createTypeDeclenchementTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDefenseAccompagnement <em>Type Defense Accompagnement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDefenseAccompagnement
	 * @generated
	 */
	public Adapter createTypeDefenseAccompagnementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDefenseAuProfitUnite <em>Type Defense Au Profit Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDefenseAuProfitUnite
	 * @generated
	 */
	public Adapter createTypeDefenseAuProfitUniteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDegreClassification <em>Type Degre Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDegreClassification
	 * @generated
	 */
	public Adapter createTypeDegreClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDemandeEngagementObjectif <em>Type Demande Engagement Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDemandeEngagementObjectif
	 * @generated
	 */
	public Adapter createTypeDemandeEngagementObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDemandeTir <em>Type Demande Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDemandeTir
	 * @generated
	 */
	public Adapter createTypeDemandeTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDepannageEvacuation <em>Type Depannage Evacuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDepannageEvacuation
	 * @generated
	 */
	public Adapter createTypeDepannageEvacuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDeplacementPersonne <em>Type Deplacement Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDeplacementPersonne
	 * @generated
	 */
	public Adapter createTypeDeplacementPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDeploiement <em>Type Deploiement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDeploiement
	 * @generated
	 */
	public Adapter createTypeDeploiementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDeploiementMARTHA <em>Type Deploiement MARTHA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDeploiementMARTHA
	 * @generated
	 */
	public Adapter createTypeDeploiementMARTHAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDeploiementMoyensASAc3d <em>Type Deploiement Moyens AS Ac3d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDeploiementMoyensASAc3d
	 * @generated
	 */
	public Adapter createTypeDeploiementMoyensASAc3dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDepotACreer <em>Type Depot ACreer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDepotACreer
	 * @generated
	 */
	public Adapter createTypeDepotACreerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDescriptionPersonne <em>Type Description Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDescriptionPersonne
	 * @generated
	 */
	public Adapter createTypeDescriptionPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDesignationUniteOuEquipementENI <em>Type Designation Unite Ou Equipement ENI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDesignationUniteOuEquipementENI
	 * @generated
	 */
	public Adapter createTypeDesignationUniteOuEquipementENIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDestinatairePlanOuOrdre <em>Type Destinataire Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDestinatairePlanOuOrdre
	 * @generated
	 */
	public Adapter createTypeDestinatairePlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDetachementIdentifie <em>Type Detachement Identifie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDetachementIdentifie
	 * @generated
	 */
	public Adapter createTypeDetachementIdentifieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDetachementNonIdentifie <em>Type Detachement Non Identifie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDetachementNonIdentifie
	 * @generated
	 */
	public Adapter createTypeDetachementNonIdentifieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDetailEvenement <em>Type Detail Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDetailEvenement
	 * @generated
	 */
	public Adapter createTypeDetailEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDirectionApprocheAir <em>Type Direction Approche Air</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDirectionApprocheAir
	 * @generated
	 */
	public Adapter createTypeDirectionApprocheAirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA <em>Type Directive EMCO Npour Unite ASA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDirectiveEMCONpourUniteASA
	 * @generated
	 */
	public Adapter createTypeDirectiveEMCONpourUniteASAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDirectivesWEZ <em>Type Directives WEZ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDirectivesWEZ
	 * @generated
	 */
	public Adapter createTypeDirectivesWEZAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDirectiveTir <em>Type Directive Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDirectiveTir
	 * @generated
	 */
	public Adapter createTypeDirectiveTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDisponibilitePourPlanFeux <em>Type Disponibilite Pour Plan Feux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDisponibilitePourPlanFeux
	 * @generated
	 */
	public Adapter createTypeDisponibilitePourPlanFeuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDistanceVerticaleGeometrique <em>Type Distance Verticale Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDistanceVerticaleGeometrique
	 * @generated
	 */
	public Adapter createTypeDistanceVerticaleGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDocument <em>Type Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDocument
	 * @generated
	 */
	public Adapter createTypeDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDocumentIdentificationPersonne <em>Type Document Identification Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDocumentIdentificationPersonne
	 * @generated
	 */
	public Adapter createTypeDocumentIdentificationPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDomaineActiviteCentre <em>Type Domaine Activite Centre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDomaineActiviteCentre
	 * @generated
	 */
	public Adapter createTypeDomaineActiviteCentreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDoseRadiationAbsorbe <em>Type Dose Radiation Absorbe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDoseRadiationAbsorbe
	 * @generated
	 */
	public Adapter createTypeDoseRadiationAbsorbeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDotationEffective <em>Type Dotation Effective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDotationEffective
	 * @generated
	 */
	public Adapter createTypeDotationEffectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDotationEffectiveConsommable <em>Type Dotation Effective Consommable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDotationEffectiveConsommable
	 * @generated
	 */
	public Adapter createTypeDotationEffectiveConsommableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDotationEffectiveEffectif <em>Type Dotation Effective Effectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDotationEffectiveEffectif
	 * @generated
	 */
	public Adapter createTypeDotationEffectiveEffectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDotationEffectiveEquipement <em>Type Dotation Effective Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDotationEffectiveEquipement
	 * @generated
	 */
	public Adapter createTypeDotationEffectiveEquipementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDotationTheorique <em>Type Dotation Theorique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDotationTheorique
	 * @generated
	 */
	public Adapter createTypeDotationTheoriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDotationTheoriqueInstanceObjet <em>Type Dotation Theorique Instance Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDotationTheoriqueInstanceObjet
	 * @generated
	 */
	public Adapter createTypeDotationTheoriqueInstanceObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeDureeIntervention <em>Type Duree Intervention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeDureeIntervention
	 * @generated
	 */
	public Adapter createTypeDureeInterventionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEchelon <em>Type Echelon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEchelon
	 * @generated
	 */
	public Adapter createTypeEchelonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffectifNecessaire <em>Type Effectif Necessaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffectifNecessaire
	 * @generated
	 */
	public Adapter createTypeEffectifNecessaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffectifOuEnginAffecte <em>Type Effectif Ou Engin Affecte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffectifOuEnginAffecte
	 * @generated
	 */
	public Adapter createTypeEffectifOuEnginAffecteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffet <em>Type Effet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffet
	 * @generated
	 */
	public Adapter createTypeEffetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffetAuContactASS <em>Type Effet Au Contact ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffetAuContactASS
	 * @generated
	 */
	public Adapter createTypeEffetAuContactASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffetConstate <em>Type Effet Constate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffetConstate
	 * @generated
	 */
	public Adapter createTypeEffetConstateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffetProfondeurASS <em>Type Effet Profondeur ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffetProfondeurASS
	 * @generated
	 */
	public Adapter createTypeEffetProfondeurASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffetSurInstanceObjet <em>Type Effet Sur Instance Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffetSurInstanceObjet
	 * @generated
	 */
	public Adapter createTypeEffetSurInstanceObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffetSurType <em>Type Effet Sur Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffetSurType
	 * @generated
	 */
	public Adapter createTypeEffetSurTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffetTactiqueRecherche <em>Type Effet Tactique Recherche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffetTactiqueRecherche
	 * @generated
	 */
	public Adapter createTypeEffetTactiqueRechercheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEffetTactiqueRechercheParENI <em>Type Effet Tactique Recherche Par ENI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEffetTactiqueRechercheParENI
	 * @generated
	 */
	public Adapter createTypeEffetTactiqueRechercheParENIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEfficaciteProbabiliste <em>Type Efficacite Probabiliste</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEfficaciteProbabiliste
	 * @generated
	 */
	public Adapter createTypeEfficaciteProbabilisteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeElementContexte <em>Type Element Contexte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeElementContexte
	 * @generated
	 */
	public Adapter createTypeElementContexteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeElementControle <em>Type Element Controle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeElementControle
	 * @generated
	 */
	public Adapter createTypeElementControleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeElementCRintermediaireAcquisition <em>Type Element CRintermediaire Acquisition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeElementCRintermediaireAcquisition
	 * @generated
	 */
	public Adapter createTypeElementCRintermediaireAcquisitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeElementMeteo <em>Type Element Meteo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeElementMeteo
	 * @generated
	 */
	public Adapter createTypeElementMeteoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeElementParticulierADefendre <em>Type Element Particulier ADefendre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeElementParticulierADefendre
	 * @generated
	 */
	public Adapter createTypeElementParticulierADefendreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeElementTopographie <em>Type Element Topographie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeElementTopographie
	 * @generated
	 */
	public Adapter createTypeElementTopographieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeElementVital <em>Type Element Vital</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeElementVital
	 * @generated
	 */
	public Adapter createTypeElementVitalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEllipseGeometrique <em>Type Ellipse Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEllipseGeometrique
	 * @generated
	 */
	public Adapter createTypeEllipseGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEmploi <em>Type Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEmploi
	 * @generated
	 */
	public Adapter createTypeEmploiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEmploiAeronef <em>Type Emploi Aeronef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEmploiAeronef
	 * @generated
	 */
	public Adapter createTypeEmploiAeronefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEmploiFrequence <em>Type Emploi Frequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEmploiFrequence
	 * @generated
	 */
	public Adapter createTypeEmploiFrequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEmploiGuerreElectronique <em>Type Emploi Guerre Electronique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEmploiGuerreElectronique
	 * @generated
	 */
	public Adapter createTypeEmploiGuerreElectroniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEmploiMaritime <em>Type Emploi Maritime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEmploiMaritime
	 * @generated
	 */
	public Adapter createTypeEmploiMaritimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEmploiReconnaissance <em>Type Emploi Reconnaissance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEmploiReconnaissance
	 * @generated
	 */
	public Adapter createTypeEmploiReconnaissanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEmploiRessourceActivite <em>Type Emploi Ressource Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEmploiRessourceActivite
	 * @generated
	 */
	public Adapter createTypeEmploiRessourceActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEngagementAvecDelegation <em>Type Engagement Avec Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEngagementAvecDelegation
	 * @generated
	 */
	public Adapter createTypeEngagementAvecDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEnnemiFutur <em>Type Ennemi Futur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEnnemiFutur
	 * @generated
	 */
	public Adapter createTypeEnnemiFuturAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre <em>Type En Tete Paragraphe Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEnTeteParagraphePlanOuOrdre
	 * @generated
	 */
	public Adapter createTypeEnTeteParagraphePlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEntetePlanOuOrdre <em>Type Entete Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEntetePlanOuOrdre
	 * @generated
	 */
	public Adapter createTypeEntetePlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEntiteOrganisationnelle <em>Type Entite Organisationnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEntiteOrganisationnelle
	 * @generated
	 */
	public Adapter createTypeEntiteOrganisationnelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEntitePolitique <em>Type Entite Politique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEntitePolitique
	 * @generated
	 */
	public Adapter createTypeEntitePolitiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEnvironnementTerrainEtVegetation <em>Type Environnement Terrain Et Vegetation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEnvironnementTerrainEtVegetation
	 * @generated
	 */
	public Adapter createTypeEnvironnementTerrainEtVegetationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEquipementHelicoptere <em>Type Equipement Helicoptere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEquipementHelicoptere
	 * @generated
	 */
	public Adapter createTypeEquipementHelicoptereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite <em>Type Equipement Ou Ressource En Quantite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEquipementOuRessourceEnQuantite
	 * @generated
	 */
	public Adapter createTypeEquipementOuRessourceEnQuantiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEquipesReparation <em>Type Equipes Reparation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEquipesReparation
	 * @generated
	 */
	public Adapter createTypeEquipesReparationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEssieu <em>Type Essieu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEssieu
	 * @generated
	 */
	public Adapter createTypeEssieuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatAction <em>Type Etat Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatAction
	 * @generated
	 */
	public Adapter createTypeEtatActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatAlerteUniteASA <em>Type Etat Alerte Unite ASA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatAlerteUniteASA
	 * @generated
	 */
	public Adapter createTypeEtatAlerteUniteASAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatAssociation <em>Type Etat Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatAssociation
	 * @generated
	 */
	public Adapter createTypeEtatAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatCivil <em>Type Etat Civil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatCivil
	 * @generated
	 */
	public Adapter createTypeEtatCivilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatElementContexte <em>Type Etat Element Contexte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatElementContexte
	 * @generated
	 */
	public Adapter createTypeEtatElementContexteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatEvenement <em>Type Etat Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatEvenement
	 * @generated
	 */
	public Adapter createTypeEtatEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatLiaison <em>Type Etat Liaison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatLiaison
	 * @generated
	 */
	public Adapter createTypeEtatLiaisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnel <em>Type Etat Operationnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnel
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelAerodrome <em>Type Etat Operationnel Aerodrome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelAerodrome
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelAerodromeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime <em>Type Etat Operationnel Champ Mines Maritime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelChampMinesMaritime
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelChampMinesMaritimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelElementControle <em>Type Etat Operationnel Element Controle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelElementControle
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelElementControleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelElementTopographie <em>Type Etat Operationnel Element Topographie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelElementTopographie
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelElementTopographieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide <em>Type Etat Operationnel Element Topographie Fluide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelElementTopographieFluide
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelElementTopographieFluideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide <em>Type Etat Operationnel Element Topographie Liquide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelElementTopographieLiquide
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelElementTopographieLiquideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide <em>Type Etat Operationnel Element Topographie Solide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelElementTopographieSolide
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelElementTopographieSolideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle <em>Type Etat Operationnel Entite Organisationnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelEntiteOrganisationnelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelMateriel <em>Type Etat Operationnel Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelMateriel
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelMedical <em>Type Etat Operationnel Medical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelMedical
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelMedicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelMine <em>Type Etat Operationnel Mine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelMine
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelMineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelObjetInconnu <em>Type Etat Operationnel Objet Inconnu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelObjetInconnu
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelObjetInconnuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelPersonnel <em>Type Etat Operationnel Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelPersonnel
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelPersonnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelSite <em>Type Etat Operationnel Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelSite
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOperationnelUXO <em>Type Etat Operationnel UXO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOperationnelUXO
	 * @generated
	 */
	public Adapter createTypeEtatOperationnelUXOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatOrdre <em>Type Etat Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatOrdre
	 * @generated
	 */
	public Adapter createTypeEtatOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatPlan <em>Type Etat Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatPlan
	 * @generated
	 */
	public Adapter createTypeEtatPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatRegleEngagement <em>Type Etat Regle Engagement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatRegleEngagement
	 * @generated
	 */
	public Adapter createTypeEtatRegleEngagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatServiceReseau <em>Type Etat Service Reseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatServiceReseau
	 * @generated
	 */
	public Adapter createTypeEtatServiceReseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtatSic <em>Type Etat Sic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtatSic
	 * @generated
	 */
	public Adapter createTypeEtatSicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEtudeDispersion <em>Type Etude Dispersion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEtudeDispersion
	 * @generated
	 */
	public Adapter createTypeEtudeDispersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvacuationPatients <em>Type Evacuation Patients</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvacuationPatients
	 * @generated
	 */
	public Adapter createTypeEvacuationPatientsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvacuationSanitaire <em>Type Evacuation Sanitaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvacuationSanitaire
	 * @generated
	 */
	public Adapter createTypeEvacuationSanitaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvacuationsParPeriode <em>Type Evacuations Par Periode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvacuationsParPeriode
	 * @generated
	 */
	public Adapter createTypeEvacuationsParPeriodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvaluation <em>Type Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvaluation
	 * @generated
	 */
	public Adapter createTypeEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvenement <em>Type Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvenement
	 * @generated
	 */
	public Adapter createTypeEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvenement4D <em>Type Evenement4 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvenement4D
	 * @generated
	 */
	public Adapter createTypeEvenement4DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvenementArmeNucleaire <em>Type Evenement Arme Nucleaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvenementArmeNucleaire
	 * @generated
	 */
	public Adapter createTypeEvenementArmeNucleaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvenementChimiqueEtBiologique <em>Type Evenement Chimique Et Biologique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvenementChimiqueEtBiologique
	 * @generated
	 */
	public Adapter createTypeEvenementChimiqueEtBiologiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvenementNRBC <em>Type Evenement NRBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvenementNRBC
	 * @generated
	 */
	public Adapter createTypeEvenementNRBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvenementNucleaire <em>Type Evenement Nucleaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvenementNucleaire
	 * @generated
	 */
	public Adapter createTypeEvenementNucleaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvenementRadioactif <em>Type Evenement Radioactif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvenementRadioactif
	 * @generated
	 */
	public Adapter createTypeEvenementRadioactifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvenementRadiologique <em>Type Evenement Radiologique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvenementRadiologique
	 * @generated
	 */
	public Adapter createTypeEvenementRadiologiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeEvenementRENS <em>Type Evenement RENS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeEvenementRENS
	 * @generated
	 */
	public Adapter createTypeEvenementRENSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeFaitRenseignement <em>Type Fait Renseignement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeFaitRenseignement
	 * @generated
	 */
	public Adapter createTypeFaitRenseignementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeFinInterdiction <em>Type Fin Interdiction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeFinInterdiction
	 * @generated
	 */
	public Adapter createTypeFinInterdictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeFonctionPersonne <em>Type Fonction Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeFonctionPersonne
	 * @generated
	 */
	public Adapter createTypeFonctionPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeFrequence <em>Type Frequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeFrequence
	 * @generated
	 */
	public Adapter createTypeFrequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeGabaritPortee <em>Type Gabarit Portee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeGabaritPortee
	 * @generated
	 */
	public Adapter createTypeGabaritPorteeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeGivrage <em>Type Givrage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeGivrage
	 * @generated
	 */
	public Adapter createTypeGivrageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeGroupeEthnique <em>Type Groupe Ethnique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeGroupeEthnique
	 * @generated
	 */
	public Adapter createTypeGroupeEthniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeGroupeFonctionnel <em>Type Groupe Fonctionnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeGroupeFonctionnel
	 * @generated
	 */
	public Adapter createTypeGroupeFonctionnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeGroupeIndividus <em>Type Groupe Individus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeGroupeIndividus
	 * @generated
	 */
	public Adapter createTypeGroupeIndividusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeGroupeInformationsOperationnelles <em>Type Groupe Informations Operationnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeGroupeInformationsOperationnelles
	 * @generated
	 */
	public Adapter createTypeGroupeInformationsOperationnellesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeGroupement <em>Type Groupement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeGroupement
	 * @generated
	 */
	public Adapter createTypeGroupementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeHippodromeGeometrique <em>Type Hippodrome Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeHippodromeGeometrique
	 * @generated
	 */
	public Adapter createTypeHippodromeGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeHoraireManoeuvre <em>Type Horaire Manoeuvre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeHoraireManoeuvre
	 * @generated
	 */
	public Adapter createTypeHoraireManoeuvreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeHypotheseActionENIouAutre <em>Type Hypothese Action EN Iou Autre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeHypotheseActionENIouAutre
	 * @generated
	 */
	public Adapter createTypeHypotheseActionENIouAutreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeIncidentMouvement <em>Type Incident Mouvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeIncidentMouvement
	 * @generated
	 */
	public Adapter createTypeIncidentMouvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeIndicateurGeostatistique <em>Type Indicateur Geostatistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeIndicateurGeostatistique
	 * @generated
	 */
	public Adapter createTypeIndicateurGeostatistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeInfrastructure <em>Type Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeInfrastructure
	 * @generated
	 */
	public Adapter createTypeInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeInstanceObjet <em>Type Instance Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeInstanceObjet
	 * @generated
	 */
	public Adapter createTypeInstanceObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeInstructionCoordination <em>Type Instruction Coordination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeInstructionCoordination
	 * @generated
	 */
	public Adapter createTypeInstructionCoordinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeInterdictionTir <em>Type Interdiction Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeInterdictionTir
	 * @generated
	 */
	public Adapter createTypeInterdictionTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeInterventionGenerale <em>Type Intervention Generale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeInterventionGenerale
	 * @generated
	 */
	public Adapter createTypeInterventionGeneraleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeInterventionType <em>Type Intervention Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeInterventionType
	 * @generated
	 */
	public Adapter createTypeInterventionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeItineraire <em>Type Itineraire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeItineraire
	 * @generated
	 */
	public Adapter createTypeItineraireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeItineraireFranchissementOuContournement <em>Type Itineraire Franchissement Ou Contournement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeItineraireFranchissementOuContournement
	 * @generated
	 */
	public Adapter createTypeItineraireFranchissementOuContournementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeItineraireOuModeleCheminementALAT <em>Type Itineraire Ou Modele Cheminement ALAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeItineraireOuModeleCheminementALAT
	 * @generated
	 */
	public Adapter createTypeItineraireOuModeleCheminementALATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeJalon <em>Type Jalon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeJalon
	 * @generated
	 */
	public Adapter createTypeJalonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeJetee <em>Type Jetee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeJetee
	 * @generated
	 */
	public Adapter createTypeJeteeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeJonctionReseau <em>Type Jonction Reseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeJonctionReseau
	 * @generated
	 */
	public Adapter createTypeJonctionReseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLangue <em>Type Langue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLangue
	 * @generated
	 */
	public Adapter createTypeLangueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLiaison <em>Type Liaison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLiaison
	 * @generated
	 */
	public Adapter createTypeLiaisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLiaisonPhysique <em>Type Liaison Physique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLiaisonPhysique
	 * @generated
	 */
	public Adapter createTypeLiaisonPhysiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLiaisonReseau <em>Type Liaison Reseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLiaisonReseau
	 * @generated
	 */
	public Adapter createTypeLiaisonReseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLigneGeometrique <em>Type Ligne Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLigneGeometrique
	 * @generated
	 */
	public Adapter createTypeLigneGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLigneLivraison <em>Type Ligne Livraison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLigneLivraison
	 * @generated
	 */
	public Adapter createTypeLigneLivraisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLigneRechange <em>Type Ligne Rechange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLigneRechange
	 * @generated
	 */
	public Adapter createTypeLigneRechangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLimite <em>Type Limite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLimite
	 * @generated
	 */
	public Adapter createTypeLimiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeListeMesuresCoordination3D <em>Type Liste Mesures Coordination3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeListeMesuresCoordination3D
	 * @generated
	 */
	public Adapter createTypeListeMesuresCoordination3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeListeObjectifs <em>Type Liste Objectifs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeListeObjectifs
	 * @generated
	 */
	public Adapter createTypeListeObjectifsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeListeObjectifsCandidats <em>Type Liste Objectifs Candidats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeListeObjectifsCandidats
	 * @generated
	 */
	public Adapter createTypeListeObjectifsCandidatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeListeObjectifsPlanifies <em>Type Liste Objectifs Planifies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeListeObjectifsPlanifies
	 * @generated
	 */
	public Adapter createTypeListeObjectifsPlanifiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLivraison <em>Type Livraison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLivraison
	 * @generated
	 */
	public Adapter createTypeLivraisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLocalisation <em>Type Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLocalisation
	 * @generated
	 */
	public Adapter createTypeLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLocalisationGeometrique <em>Type Localisation Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLocalisationGeometrique
	 * @generated
	 */
	public Adapter createTypeLocalisationGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLocalisationGeometrique2D <em>Type Localisation Geometrique2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLocalisationGeometrique2D
	 * @generated
	 */
	public Adapter createTypeLocalisationGeometrique2DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLocalisationGeometrique3D <em>Type Localisation Geometrique3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLocalisationGeometrique3D
	 * @generated
	 */
	public Adapter createTypeLocalisationGeometrique3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLocalisationIndefinie <em>Type Localisation Indefinie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLocalisationIndefinie
	 * @generated
	 */
	public Adapter createTypeLocalisationIndefinieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLocalisationObjectif <em>Type Localisation Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLocalisationObjectif
	 * @generated
	 */
	public Adapter createTypeLocalisationObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeLumiere <em>Type Lumiere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeLumiere
	 * @generated
	 */
	public Adapter createTypeLumiereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeManutentionAEffectuer <em>Type Manutention AEffectuer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeManutentionAEffectuer
	 * @generated
	 */
	public Adapter createTypeManutentionAEffectuerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMarquageObjectif <em>Type Marquage Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMarquageObjectif
	 * @generated
	 */
	public Adapter createTypeMarquageObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMateriel <em>Type Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMateriel
	 * @generated
	 */
	public Adapter createTypeMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMementoGenie <em>Type Memento Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMementoGenie
	 * @generated
	 */
	public Adapter createTypeMementoGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMenace <em>Type Menace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMenace
	 * @generated
	 */
	public Adapter createTypeMenaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMenaceAerienne <em>Type Menace Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMenaceAerienne
	 * @generated
	 */
	public Adapter createTypeMenaceAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMenaceASAeni <em>Type Menace AS Aeni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMenaceASAeni
	 * @generated
	 */
	public Adapter createTypeMenaceASAeniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMenaceDetection <em>Type Menace Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMenaceDetection
	 * @generated
	 */
	public Adapter createTypeMenaceDetectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMenaceFeuxENI <em>Type Menace Feux ENI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMenaceFeuxENI
	 * @generated
	 */
	public Adapter createTypeMenaceFeuxENIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMenaceGenieENI <em>Type Menace Genie ENI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMenaceGenieENI
	 * @generated
	 */
	public Adapter createTypeMenaceGenieENIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMenacePrioritaire <em>Type Menace Prioritaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMenacePrioritaire
	 * @generated
	 */
	public Adapter createTypeMenacePrioritaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMenacesAeriennesMissionALAT <em>Type Menaces Aeriennes Mission ALAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMenacesAeriennesMissionALAT
	 * @generated
	 */
	public Adapter createTypeMenacesAeriennesMissionALATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMesureCoordination <em>Type Mesure Coordination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMesureCoordination
	 * @generated
	 */
	public Adapter createTypeMesureCoordinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMesureNuage <em>Type Mesure Nuage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMesureNuage
	 * @generated
	 */
	public Adapter createTypeMesureNuageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMesuresProtectionElectronique <em>Type Mesures Protection Electronique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMesuresProtectionElectronique
	 * @generated
	 */
	public Adapter createTypeMesuresProtectionElectroniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMineExplosif <em>Type Mine Explosif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMineExplosif
	 * @generated
	 */
	public Adapter createTypeMineExplosifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMiseEnOeuvreROE <em>Type Mise En Oeuvre ROE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMiseEnOeuvreROE
	 * @generated
	 */
	public Adapter createTypeMiseEnOeuvreROEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMiseEnPlace <em>Type Mise En Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMiseEnPlace
	 * @generated
	 */
	public Adapter createTypeMiseEnPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMiseEnPlaceTir <em>Type Mise En Place Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMiseEnPlaceTir
	 * @generated
	 */
	public Adapter createTypeMiseEnPlaceTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMission <em>Type Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMission
	 * @generated
	 */
	public Adapter createTypeMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionAcquisitionASS <em>Type Mission Acquisition ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionAcquisitionASS
	 * @generated
	 */
	public Adapter createTypeMissionAcquisitionASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionAerienne <em>Type Mission Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionAerienne
	 * @generated
	 */
	public Adapter createTypeMissionAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionAir <em>Type Mission Air</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionAir
	 * @generated
	 */
	public Adapter createTypeMissionAirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionALATattaque <em>Type Mission ALA Tattaque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionALATattaque
	 * @generated
	 */
	public Adapter createTypeMissionALATattaqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionAppuiMobilite <em>Type Mission Appui Mobilite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionAppuiMobilite
	 * @generated
	 */
	public Adapter createTypeMissionAppuiMobiliteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionASA <em>Type Mission ASA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionASA
	 * @generated
	 */
	public Adapter createTypeMissionASAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionCOBRA <em>Type Mission COBRA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionCOBRA
	 * @generated
	 */
	public Adapter createTypeMissionCOBRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionDefenseParticuliere <em>Type Mission Defense Particuliere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionDefenseParticuliere
	 * @generated
	 */
	public Adapter createTypeMissionDefenseParticuliereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionDrone <em>Type Mission Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionDrone
	 * @generated
	 */
	public Adapter createTypeMissionDroneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionEscorteOuAppuiFeu <em>Type Mission Escorte Ou Appui Feu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionEscorteOuAppuiFeu
	 * @generated
	 */
	public Adapter createTypeMissionEscorteOuAppuiFeuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionFeux <em>Type Mission Feux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionFeux
	 * @generated
	 */
	public Adapter createTypeMissionFeuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionGenie <em>Type Mission Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionGenie
	 * @generated
	 */
	public Adapter createTypeMissionGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionI3D <em>Type Mission I3D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionI3D
	 * @generated
	 */
	public Adapter createTypeMissionI3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionLocalisationRadioElectrique <em>Type Mission Localisation Radio Electrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionLocalisationRadioElectrique
	 * @generated
	 */
	public Adapter createTypeMissionLocalisationRadioElectriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionLogistique <em>Type Mission Logistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionLogistique
	 * @generated
	 */
	public Adapter createTypeMissionLogistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionMaintenance <em>Type Mission Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionMaintenance
	 * @generated
	 */
	public Adapter createTypeMissionMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionMelee <em>Type Mission Melee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionMelee
	 * @generated
	 */
	public Adapter createTypeMissionMeleeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionMouvement <em>Type Mission Mouvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionMouvement
	 * @generated
	 */
	public Adapter createTypeMissionMouvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionRadar <em>Type Mission Radar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionRadar
	 * @generated
	 */
	public Adapter createTypeMissionRadarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionRavitaillement <em>Type Mission Ravitaillement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionRavitaillement
	 * @generated
	 */
	public Adapter createTypeMissionRavitaillementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionRenseignement <em>Type Mission Renseignement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionRenseignement
	 * @generated
	 */
	public Adapter createTypeMissionRenseignementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionRenseignementObjectif <em>Type Mission Renseignement Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionRenseignementObjectif
	 * @generated
	 */
	public Adapter createTypeMissionRenseignementObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionRohum <em>Type Mission Rohum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionRohum
	 * @generated
	 */
	public Adapter createTypeMissionRohumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionSarCombat <em>Type Mission Sar Combat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionSarCombat
	 * @generated
	 */
	public Adapter createTypeMissionSarCombatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionSic <em>Type Mission Sic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionSic
	 * @generated
	 */
	public Adapter createTypeMissionSicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionSurveillance <em>Type Mission Surveillance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionSurveillance
	 * @generated
	 */
	public Adapter createTypeMissionSurveillanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionTransportTactique <em>Type Mission Transport Tactique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionTransportTactique
	 * @generated
	 */
	public Adapter createTypeMissionTransportTactiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionUniteAntichar <em>Type Mission Unite Antichar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionUniteAntichar
	 * @generated
	 */
	public Adapter createTypeMissionUniteAnticharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMissionZoneADefendre <em>Type Mission Zone ADefendre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMissionZoneADefendre
	 * @generated
	 */
	public Adapter createTypeMissionZoneADefendreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMobilite <em>Type Mobilite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMobilite
	 * @generated
	 */
	public Adapter createTypeMobiliteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModalite <em>Type Modalite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModalite
	 * @generated
	 */
	public Adapter createTypeModaliteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModaliteLivraison <em>Type Modalite Livraison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModaliteLivraison
	 * @generated
	 */
	public Adapter createTypeModaliteLivraisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModaliteObtention <em>Type Modalite Obtention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModaliteObtention
	 * @generated
	 */
	public Adapter createTypeModaliteObtentionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModalitePerception <em>Type Modalite Perception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModalitePerception
	 * @generated
	 */
	public Adapter createTypeModalitePerceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModalitesAcquisitionObjectif <em>Type Modalites Acquisition Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModalitesAcquisitionObjectif
	 * @generated
	 */
	public Adapter createTypeModalitesAcquisitionObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModalitesEvaluationDegats <em>Type Modalites Evaluation Degats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModalitesEvaluationDegats
	 * @generated
	 */
	public Adapter createTypeModalitesEvaluationDegatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModalitesMiseEnPlaceTir <em>Type Modalites Mise En Place Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModalitesMiseEnPlaceTir
	 * @generated
	 */
	public Adapter createTypeModalitesMiseEnPlaceTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModaliteSoutienLogistique <em>Type Modalite Soutien Logistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModaliteSoutienLogistique
	 * @generated
	 */
	public Adapter createTypeModaliteSoutienLogistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModalitesRavitaillement <em>Type Modalites Ravitaillement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModalitesRavitaillement
	 * @generated
	 */
	public Adapter createTypeModalitesRavitaillementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModaliteTransfertAutoriteASS <em>Type Modalite Transfert Autorite ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModaliteTransfertAutoriteASS
	 * @generated
	 */
	public Adapter createTypeModaliteTransfertAutoriteASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModeFranchissement <em>Type Mode Franchissement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModeFranchissement
	 * @generated
	 */
	public Adapter createTypeModeFranchissementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeModule <em>Type Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeModule
	 * @generated
	 */
	public Adapter createTypeModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMouillage <em>Type Mouillage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMouillage
	 * @generated
	 */
	public Adapter createTypeMouillageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMouvementParRoute <em>Type Mouvement Par Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMouvementParRoute
	 * @generated
	 */
	public Adapter createTypeMouvementParRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyenCommunication <em>Type Moyen Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyenCommunication
	 * @generated
	 */
	public Adapter createTypeMoyenCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyenDepannage <em>Type Moyen Depannage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyenDepannage
	 * @generated
	 */
	public Adapter createTypeMoyenDepannageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyenDispersion <em>Type Moyen Dispersion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyenDispersion
	 * @generated
	 */
	public Adapter createTypeMoyenDispersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyenFeuENI <em>Type Moyen Feu ENI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyenFeuENI
	 * @generated
	 */
	public Adapter createTypeMoyenFeuENIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyenInvestigation <em>Type Moyen Investigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyenInvestigation
	 * @generated
	 */
	public Adapter createTypeMoyenInvestigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyenPourSoutienMedical <em>Type Moyen Pour Soutien Medical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyenPourSoutienMedical
	 * @generated
	 */
	public Adapter createTypeMoyenPourSoutienMedicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU <em>Type Moyens Aeriens Dont Beneficie GU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyensAeriensDontBeneficieGU
	 * @generated
	 */
	public Adapter createTypeMoyensAeriensDontBeneficieGUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyensENI <em>Type Moyens ENI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyensENI
	 * @generated
	 */
	public Adapter createTypeMoyensENIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyensENIutilises <em>Type Moyens EN Iutilises</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyensENIutilises
	 * @generated
	 */
	public Adapter createTypeMoyensENIutilisesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyensEvacuation <em>Type Moyens Evacuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyensEvacuation
	 * @generated
	 */
	public Adapter createTypeMoyensEvacuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyensGenie <em>Type Moyens Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyensGenie
	 * @generated
	 */
	public Adapter createTypeMoyensGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyensNecessaires <em>Type Moyens Necessaires</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyensNecessaires
	 * @generated
	 */
	public Adapter createTypeMoyensNecessairesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyensNiveau4 <em>Type Moyens Niveau4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyensNiveau4
	 * @generated
	 */
	public Adapter createTypeMoyensNiveau4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMoyensTriage <em>Type Moyens Triage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMoyensTriage
	 * @generated
	 */
	public Adapter createTypeMoyensTriageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMPGTMessage <em>Type MPGT Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMPGTMessage
	 * @generated
	 */
	public Adapter createTypeMPGTMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeMunitionsConsommeesSurPoint <em>Type Munitions Consommees Sur Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeMunitionsConsommeesSurPoint
	 * @generated
	 */
	public Adapter createTypeMunitionsConsommeesSurPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeNatureInformations <em>Type Nature Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeNatureInformations
	 * @generated
	 */
	public Adapter createTypeNatureInformationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeNiveauAMaintenir <em>Type Niveau AMaintenir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeNiveauAMaintenir
	 * @generated
	 */
	public Adapter createTypeNiveauAMaintenirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjectif3D <em>Type Objectif3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjectif3D
	 * @generated
	 */
	public Adapter createTypeObjectif3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjectifActivite <em>Type Objectif Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjectifActivite
	 * @generated
	 */
	public Adapter createTypeObjectifActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjectifActiviteType <em>Type Objectif Activite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjectifActiviteType
	 * @generated
	 */
	public Adapter createTypeObjectifActiviteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjectifActiviteTypeProductionImage <em>Type Objectif Activite Type Production Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjectifActiviteTypeProductionImage
	 * @generated
	 */
	public Adapter createTypeObjectifActiviteTypeProductionImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjectifAlat <em>Type Objectif Alat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjectifAlat
	 * @generated
	 */
	public Adapter createTypeObjectifAlatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjectifASS <em>Type Objectif ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjectifASS
	 * @generated
	 */
	public Adapter createTypeObjectifASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjectifCiblage <em>Type Objectif Ciblage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjectifCiblage
	 * @generated
	 */
	public Adapter createTypeObjectifCiblageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjectifMajeur <em>Type Objectif Majeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjectifMajeur
	 * @generated
	 */
	public Adapter createTypeObjectifMajeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjetGeometrique <em>Type Objet Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjetGeometrique
	 * @generated
	 */
	public Adapter createTypeObjetGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjetInconnu <em>Type Objet Inconnu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjetInconnu
	 * @generated
	 */
	public Adapter createTypeObjetInconnuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObjetLibre <em>Type Objet Libre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObjetLibre
	 * @generated
	 */
	public Adapter createTypeObjetLibreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObservation <em>Type Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObservation
	 * @generated
	 */
	public Adapter createTypeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeObstacle <em>Type Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeObstacle
	 * @generated
	 */
	public Adapter createTypeObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOccupationLits <em>Type Occupation Lits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOccupationLits
	 * @generated
	 */
	public Adapter createTypeOccupationLitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOrdre <em>Type Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOrdre
	 * @generated
	 */
	public Adapter createTypeOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOrganisationEvacuations <em>Type Organisation Evacuations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOrganisationEvacuations
	 * @generated
	 */
	public Adapter createTypeOrganisationEvacuationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOrganisationRamassage <em>Type Organisation Ramassage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOrganisationRamassage
	 * @generated
	 */
	public Adapter createTypeOrganisationRamassageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOrganisationSoutienMedical <em>Type Organisation Soutien Medical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOrganisationSoutienMedical
	 * @generated
	 */
	public Adapter createTypeOrganisationSoutienMedicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOrganisationTraitement <em>Type Organisation Traitement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOrganisationTraitement
	 * @generated
	 */
	public Adapter createTypeOrganisationTraitementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOrganisationTriage <em>Type Organisation Triage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOrganisationTriage
	 * @generated
	 */
	public Adapter createTypeOrganisationTriageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOrganismeControle <em>Type Organisme Controle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOrganismeControle
	 * @generated
	 */
	public Adapter createTypeOrganismeControleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOuvrageGenie <em>Type Ouvrage Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOuvrageGenie
	 * @generated
	 */
	public Adapter createTypeOuvrageGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeOverlay <em>Type Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeOverlay
	 * @generated
	 */
	public Adapter createTypeOverlayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePalierSondage <em>Type Palier Sondage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePalierSondage
	 * @generated
	 */
	public Adapter createTypePalierSondageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeParagraphePlanOuOrdre <em>Type Paragraphe Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeParagraphePlanOuOrdre
	 * @generated
	 */
	public Adapter createTypeParagraphePlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeParametresImposes <em>Type Parametres Imposes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeParametresImposes
	 * @generated
	 */
	public Adapter createTypeParametresImposesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeParametresPlanification <em>Type Parametres Planification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeParametresPlanification
	 * @generated
	 */
	public Adapter createTypeParametresPlanificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeParametresZoneRetombees <em>Type Parametres Zone Retombees</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeParametresZoneRetombees
	 * @generated
	 */
	public Adapter createTypeParametresZoneRetombeesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePassageModule <em>Type Passage Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePassageModule
	 * @generated
	 */
	public Adapter createTypePassageModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePassePhoto <em>Type Passe Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePassePhoto
	 * @generated
	 */
	public Adapter createTypePassePhotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePeriode <em>Type Periode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePeriode
	 * @generated
	 */
	public Adapter createTypePeriodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePeriode3D <em>Type Periode3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePeriode3D
	 * @generated
	 */
	public Adapter createTypePeriode3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePersonne <em>Type Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePersonne
	 * @generated
	 */
	public Adapter createTypePersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePersonneMilitaire <em>Type Personne Militaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePersonneMilitaire
	 * @generated
	 */
	public Adapter createTypePersonneMilitaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePertesParPeriode <em>Type Pertes Par Periode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePertesParPeriode
	 * @generated
	 */
	public Adapter createTypePertesParPeriodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePertesSante <em>Type Pertes Sante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePertesSante
	 * @generated
	 */
	public Adapter createTypePertesSanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePertesSanteParEchelon <em>Type Pertes Sante Par Echelon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePertesSanteParEchelon
	 * @generated
	 */
	public Adapter createTypePertesSanteParEchelonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePertesSanteParUnite <em>Type Pertes Sante Par Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePertesSanteParUnite
	 * @generated
	 */
	public Adapter createTypePertesSanteParUniteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePhaseMissionAppuiAerien <em>Type Phase Mission Appui Aerien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePhaseMissionAppuiAerien
	 * @generated
	 */
	public Adapter createTypePhaseMissionAppuiAerienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePhaseTrajet <em>Type Phase Trajet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePhaseTrajet
	 * @generated
	 */
	public Adapter createTypePhaseTrajetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePhaseVolDrone <em>Type Phase Vol Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePhaseVolDrone
	 * @generated
	 */
	public Adapter createTypePhaseVolDroneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePionReseau <em>Type Pion Reseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePionReseau
	 * @generated
	 */
	public Adapter createTypePionReseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePisteAtterrissage <em>Type Piste Atterrissage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePisteAtterrissage
	 * @generated
	 */
	public Adapter createTypePisteAtterrissageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlageNumerotation <em>Type Plage Numerotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlageNumerotation
	 * @generated
	 */
	public Adapter createTypePlageNumerotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlan <em>Type Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlan
	 * @generated
	 */
	public Adapter createTypePlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanFeux <em>Type Plan Feux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanFeux
	 * @generated
	 */
	public Adapter createTypePlanFeuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanification <em>Type Planification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanification
	 * @generated
	 */
	public Adapter createTypePlanificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanificationCelluleSoutien <em>Type Planification Cellule Soutien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanificationCelluleSoutien
	 * @generated
	 */
	public Adapter createTypePlanificationCelluleSoutienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanificationMouvement <em>Type Planification Mouvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanificationMouvement
	 * @generated
	 */
	public Adapter createTypePlanificationMouvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanificationOperation3D <em>Type Planification Operation3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanificationOperation3D
	 * @generated
	 */
	public Adapter createTypePlanificationOperation3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanMixte <em>Type Plan Mixte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanMixte
	 * @generated
	 */
	public Adapter createTypePlanMixteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanNumerotationObjectifs <em>Type Plan Numerotation Objectifs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanNumerotationObjectifs
	 * @generated
	 */
	public Adapter createTypePlanNumerotationObjectifsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanOuOrdre <em>Type Plan Ou Ordre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanOuOrdre
	 * @generated
	 */
	public Adapter createTypePlanOuOrdreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanParticulier <em>Type Plan Particulier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanParticulier
	 * @generated
	 */
	public Adapter createTypePlanParticulierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePlanTraitementObjectifs <em>Type Plan Traitement Objectifs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePlanTraitementObjectifs
	 * @generated
	 */
	public Adapter createTypePlanTraitementObjectifsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePointAxe <em>Type Point Axe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePointAxe
	 * @generated
	 */
	public Adapter createTypePointAxeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePointControle3D <em>Type Point Controle3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePointControle3D
	 * @generated
	 */
	public Adapter createTypePointControle3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePointGeometrique <em>Type Point Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePointGeometrique
	 * @generated
	 */
	public Adapter createTypePointGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePointHaut <em>Type Point Haut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePointHaut
	 * @generated
	 */
	public Adapter createTypePointHautAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePointMobile <em>Type Point Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePointMobile
	 * @generated
	 */
	public Adapter createTypePointMobileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePointParticulierItineraire <em>Type Point Particulier Itineraire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePointParticulierItineraire
	 * @generated
	 */
	public Adapter createTypePointParticulierItineraireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePointTrajectoire <em>Type Point Trajectoire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePointTrajectoire
	 * @generated
	 */
	public Adapter createTypePointTrajectoireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePointUsager <em>Type Point Usager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePointUsager
	 * @generated
	 */
	public Adapter createTypePointUsagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePolitiqueTir <em>Type Politique Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePolitiqueTir
	 * @generated
	 */
	public Adapter createTypePolitiqueTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePolitiqueTirAeronef <em>Type Politique Tir Aeronef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePolitiqueTirAeronef
	 * @generated
	 */
	public Adapter createTypePolitiqueTirAeronefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePont <em>Type Pont</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePont
	 * @generated
	 */
	public Adapter createTypePontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePort <em>Type Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePort
	 * @generated
	 */
	public Adapter createTypePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePorteurSystemeArme <em>Type Porteur Systeme Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePorteurSystemeArme
	 * @generated
	 */
	public Adapter createTypePorteurSystemeArmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePositionCentreASA <em>Type Position Centre ASA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePositionCentreASA
	 * @generated
	 */
	public Adapter createTypePositionCentreASAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePositionPlots <em>Type Position Plots</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePositionPlots
	 * @generated
	 */
	public Adapter createTypePositionPlotsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePossibilitesENI3d <em>Type Possibilites ENI 3d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePossibilitesENI3d
	 * @generated
	 */
	public Adapter createTypePossibilitesENI3dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePosteAmarrage <em>Type Poste Amarrage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePosteAmarrage
	 * @generated
	 */
	public Adapter createTypePosteAmarrageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePosteTir <em>Type Poste Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePosteTir
	 * @generated
	 */
	public Adapter createTypePosteTirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePotentielAeronef <em>Type Potentiel Aeronef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePotentielAeronef
	 * @generated
	 */
	public Adapter createTypePotentielAeronefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePotentielENIfeuSolSol <em>Type Potentiel EN Ifeu Sol Sol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePotentielENIfeuSolSol
	 * @generated
	 */
	public Adapter createTypePotentielENIfeuSolSolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrecipitation <em>Type Precipitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrecipitation
	 * @generated
	 */
	public Adapter createTypePrecipitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrelevement <em>Type Prelevement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrelevement
	 * @generated
	 */
	public Adapter createTypePrelevementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrelevementDetachement <em>Type Prelevement Detachement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrelevementDetachement
	 * @generated
	 */
	public Adapter createTypePrelevementDetachementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrelevementSubordonneIdentifie <em>Type Prelevement Subordonne Identifie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrelevementSubordonneIdentifie
	 * @generated
	 */
	public Adapter createTypePrelevementSubordonneIdentifieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie <em>Type Prelevement Subordonne Non Identifie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrelevementSubordonneNonIdentifie
	 * @generated
	 */
	public Adapter createTypePrelevementSubordonneNonIdentifieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrevisionObservation <em>Type Prevision Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrevisionObservation
	 * @generated
	 */
	public Adapter createTypePrevisionObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrevisionObservationParTranche <em>Type Prevision Observation Par Tranche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrevisionObservationParTranche
	 * @generated
	 */
	public Adapter createTypePrevisionObservationParTrancheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePriorite <em>Type Priorite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePriorite
	 * @generated
	 */
	public Adapter createTypePrioriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrioriteTactique <em>Type Priorite Tactique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrioriteTactique
	 * @generated
	 */
	public Adapter createTypePrioriteTactiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrioriteTactiqueLogistique <em>Type Priorite Tactique Logistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrioriteTactiqueLogistique
	 * @generated
	 */
	public Adapter createTypePrioriteTactiqueLogistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypePrioriteTechnique <em>Type Priorite Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypePrioriteTechnique
	 * @generated
	 */
	public Adapter createTypePrioriteTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeProcedureIFF <em>Type Procedure IFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeProcedureIFF
	 * @generated
	 */
	public Adapter createTypeProcedureIFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeProfil <em>Type Profil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeProfil
	 * @generated
	 */
	public Adapter createTypeProfilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeProjetCimic <em>Type Projet Cimic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeProjetCimic
	 * @generated
	 */
	public Adapter createTypeProjetCimicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeProtectionPersonnel <em>Type Protection Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeProtectionPersonnel
	 * @generated
	 */
	public Adapter createTypeProtectionPersonnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuaiMaritime <em>Type Quai Maritime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuaiMaritime
	 * @generated
	 */
	public Adapter createTypeQuaiMaritimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteConsommee <em>Type Quantite Consommee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteConsommee
	 * @generated
	 */
	public Adapter createTypeQuantiteConsommeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteElementENIDetruit <em>Type Quantite Element ENI Detruit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteElementENIDetruit
	 * @generated
	 */
	public Adapter createTypeQuantiteElementENIDetruitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteMaintenir <em>Type Quantite Maintenir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteMaintenir
	 * @generated
	 */
	public Adapter createTypeQuantiteMaintenirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteMateriel <em>Type Quantite Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteMateriel
	 * @generated
	 */
	public Adapter createTypeQuantiteMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteMaterielOuMoyen <em>Type Quantite Materiel Ou Moyen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteMaterielOuMoyen
	 * @generated
	 */
	public Adapter createTypeQuantiteMaterielOuMoyenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteMoyensTirASS <em>Type Quantite Moyens Tir ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteMoyensTirASS
	 * @generated
	 */
	public Adapter createTypeQuantiteMoyensTirASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteTypeArmePourMoyenFeuASSeni <em>Type Quantite Type Arme Pour Moyen Feu AS Seni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteTypeArmePourMoyenFeuASSeni
	 * @generated
	 */
	public Adapter createTypeQuantiteTypeArmePourMoyenFeuASSeniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteTypeEquipement <em>Type Quantite Type Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteTypeEquipement
	 * @generated
	 */
	public Adapter createTypeQuantiteTypeEquipementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteTypeObserve <em>Type Quantite Type Observe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteTypeObserve
	 * @generated
	 */
	public Adapter createTypeQuantiteTypeObserveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeQuantiteTypeUnite <em>Type Quantite Type Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeQuantiteTypeUnite
	 * @generated
	 */
	public Adapter createTypeQuantiteTypeUniteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRacineOperationnelle <em>Type Racine Operationnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRacineOperationnelle
	 * @generated
	 */
	public Adapter createTypeRacineOperationnelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRaidAerienEnnemi <em>Type Raid Aerien Ennemi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRaidAerienEnnemi
	 * @generated
	 */
	public Adapter createTypeRaidAerienEnnemiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRapport <em>Type Rapport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRapport
	 * @generated
	 */
	public Adapter createTypeRapportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRapportForce <em>Type Rapport Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRapportForce
	 * @generated
	 */
	public Adapter createTypeRapportForceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRattachement <em>Type Rattachement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRattachement
	 * @generated
	 */
	public Adapter createTypeRattachementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRattachementLogistiqueParticulier <em>Type Rattachement Logistique Particulier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRattachementLogistiqueParticulier
	 * @generated
	 */
	public Adapter createTypeRattachementLogistiqueParticulierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRattachementOuAbonnement <em>Type Rattachement Ou Abonnement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRattachementOuAbonnement
	 * @generated
	 */
	public Adapter createTypeRattachementOuAbonnementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRavitaillement <em>Type Ravitaillement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRavitaillement
	 * @generated
	 */
	public Adapter createTypeRavitaillementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeReactionsMentalesAuCombat <em>Type Reactions Mentales Au Combat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeReactionsMentalesAuCombat
	 * @generated
	 */
	public Adapter createTypeReactionsMentalesAuCombatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRechange <em>Type Rechange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRechange
	 * @generated
	 */
	public Adapter createTypeRechangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeReconnaissance <em>Type Reconnaissance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeReconnaissance
	 * @generated
	 */
	public Adapter createTypeReconnaissanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRegleEngagement <em>Type Regle Engagement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRegleEngagement
	 * @generated
	 */
	public Adapter createTypeRegleEngagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRegleEngagementAction <em>Type Regle Engagement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRegleEngagementAction
	 * @generated
	 */
	public Adapter createTypeRegleEngagementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeReglementation <em>Type Reglementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeReglementation
	 * @generated
	 */
	public Adapter createTypeReglementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeReligion <em>Type Religion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeReligion
	 * @generated
	 */
	public Adapter createTypeReligionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRenforcementsFeux <em>Type Renforcements Feux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRenforcementsFeux
	 * @generated
	 */
	public Adapter createTypeRenforcementsFeuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRenseignementObjectif <em>Type Renseignement Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRenseignementObjectif
	 * @generated
	 */
	public Adapter createTypeRenseignementObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeReseauTelecommunication <em>Type Reseau Telecommunication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeReseauTelecommunication
	 * @generated
	 */
	public Adapter createTypeReseauTelecommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeReservationUnite <em>Type Reservation Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeReservationUnite
	 * @generated
	 */
	public Adapter createTypeReservationUniteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRessourceActivite <em>Type Ressource Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRessourceActivite
	 * @generated
	 */
	public Adapter createTypeRessourceActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRessourceActiviteInstanceObjet <em>Type Ressource Activite Instance Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRessourceActiviteInstanceObjet
	 * @generated
	 */
	public Adapter createTypeRessourceActiviteInstanceObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRessourceActiviteType <em>Type Ressource Activite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRessourceActiviteType
	 * @generated
	 */
	public Adapter createTypeRessourceActiviteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRessourceAttendue <em>Type Ressource Attendue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRessourceAttendue
	 * @generated
	 */
	public Adapter createTypeRessourceAttendueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRessourceElementaire <em>Type Ressource Elementaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRessourceElementaire
	 * @generated
	 */
	public Adapter createTypeRessourceElementaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRessourcesALivrerOuADistribuer <em>Type Ressources ALivrer Ou ADistribuer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRessourcesALivrerOuADistribuer
	 * @generated
	 */
	public Adapter createTypeRessourcesALivrerOuADistribuerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeResultatTraitementObjectif <em>Type Resultat Traitement Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeResultatTraitementObjectif
	 * @generated
	 */
	public Adapter createTypeResultatTraitementObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeROEparOrganisation <em>Type RO Epar Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeROEparOrganisation
	 * @generated
	 */
	public Adapter createTypeROEparOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRoute <em>Type Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRoute
	 * @generated
	 */
	public Adapter createTypeRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeRouteHelicoptereALAT <em>Type Route Helicoptere ALAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeRouteHelicoptereALAT
	 * @generated
	 */
	public Adapter createTypeRouteHelicoptereALATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSecteurAngulaireGeometrique <em>Type Secteur Angulaire Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSecteurAngulaireGeometrique
	 * @generated
	 */
	public Adapter createTypeSecteurAngulaireGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSecteurGeometrique <em>Type Secteur Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSecteurGeometrique
	 * @generated
	 */
	public Adapter createTypeSecteurGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSegmentItineraire <em>Type Segment Itineraire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSegmentItineraire
	 * @generated
	 */
	public Adapter createTypeSegmentItineraireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSegmentRouteAerienne <em>Type Segment Route Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSegmentRouteAerienne
	 * @generated
	 */
	public Adapter createTypeSegmentRouteAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSerieGeostatistique <em>Type Serie Geostatistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSerieGeostatistique
	 * @generated
	 */
	public Adapter createTypeSerieGeostatistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeServiceReseau <em>Type Service Reseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeServiceReseau
	 * @generated
	 */
	public Adapter createTypeServiceReseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSite <em>Type Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSite
	 * @generated
	 */
	public Adapter createTypeSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSiteProduction <em>Type Site Production</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSiteProduction
	 * @generated
	 */
	public Adapter createTypeSiteProductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSiteSoin <em>Type Site Soin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSiteSoin
	 * @generated
	 */
	public Adapter createTypeSiteSoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSituationConsommable <em>Type Situation Consommable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSituationConsommable
	 * @generated
	 */
	public Adapter createTypeSituationConsommableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSituationEffectif <em>Type Situation Effectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSituationEffectif
	 * @generated
	 */
	public Adapter createTypeSituationEffectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSituationEquipement <em>Type Situation Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSituationEquipement
	 * @generated
	 */
	public Adapter createTypeSituationEquipementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSituationRadiation <em>Type Situation Radiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSituationRadiation
	 * @generated
	 */
	public Adapter createTypeSituationRadiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSituationVehicule <em>Type Situation Vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSituationVehicule
	 * @generated
	 */
	public Adapter createTypeSituationVehiculeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage <em>Type Specialite Maintenance Ou Depannage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSpecialiteMaintenanceOuDepannage
	 * @generated
	 */
	public Adapter createTypeSpecialiteMaintenanceOuDepannageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSpecialitePersonne <em>Type Specialite Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSpecialitePersonne
	 * @generated
	 */
	public Adapter createTypeSpecialitePersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSphereGeometrique <em>Type Sphere Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSphereGeometrique
	 * @generated
	 */
	public Adapter createTypeSphereGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeStadeAlerteEmission <em>Type Stade Alerte Emission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeStadeAlerteEmission
	 * @generated
	 */
	public Adapter createTypeStadeAlerteEmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeStockAMaintenir <em>Type Stock AMaintenir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeStockAMaintenir
	 * @generated
	 */
	public Adapter createTypeStockAMaintenirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeStructureOrganisee <em>Type Structure Organisee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeStructureOrganisee
	 * @generated
	 */
	public Adapter createTypeStructureOrganiseeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSuiviDemande <em>Type Suivi Demande</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSuiviDemande
	 * @generated
	 */
	public Adapter createTypeSuiviDemandeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSuiviMedical <em>Type Suivi Medical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSuiviMedical
	 * @generated
	 */
	public Adapter createTypeSuiviMedicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSurplusOuDeficit <em>Type Surplus Ou Deficit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSurplusOuDeficit
	 * @generated
	 */
	public Adapter createTypeSurplusOuDeficitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleAnnotation <em>Type Symbole Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleAnnotation
	 * @generated
	 */
	public Adapter createTypeSymboleAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleCercle <em>Type Symbole Cercle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleCercle
	 * @generated
	 */
	public Adapter createTypeSymboleCercleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleFleche <em>Type Symbole Fleche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleFleche
	 * @generated
	 */
	public Adapter createTypeSymboleFlecheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleImage <em>Type Symbole Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleImage
	 * @generated
	 */
	public Adapter createTypeSymboleImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleLibre <em>Type Symbole Libre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleLibre
	 * @generated
	 */
	public Adapter createTypeSymboleLibreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleLineique <em>Type Symbole Lineique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleLineique
	 * @generated
	 */
	public Adapter createTypeSymboleLineiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleNote <em>Type Symbole Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleNote
	 * @generated
	 */
	public Adapter createTypeSymboleNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymbolePoint <em>Type Symbole Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymbolePoint
	 * @generated
	 */
	public Adapter createTypeSymbolePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymbolePostIt <em>Type Symbole Post It</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymbolePostIt
	 * @generated
	 */
	public Adapter createTypeSymbolePostItAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleSurfacique <em>Type Symbole Surfacique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleSurfacique
	 * @generated
	 */
	public Adapter createTypeSymboleSurfaciqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleTactique <em>Type Symbole Tactique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleTactique
	 * @generated
	 */
	public Adapter createTypeSymboleTactiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSymboleTexte <em>Type Symbole Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSymboleTexte
	 * @generated
	 */
	public Adapter createTypeSymboleTexteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSyntheseDetections <em>Type Synthese Detections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSyntheseDetections
	 * @generated
	 */
	public Adapter createTypeSyntheseDetectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSyntheseSante <em>Type Synthese Sante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSyntheseSante
	 * @generated
	 */
	public Adapter createTypeSyntheseSanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments <em>Type Systeme Atterrissage Aux Instruments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeSystemeAtterrissageAuxInstruments
	 * @generated
	 */
	public Adapter createTypeSystemeAtterrissageAuxInstrumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTache <em>Type Tache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTache
	 * @generated
	 */
	public Adapter createTypeTacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTacheAppuiAerien <em>Type Tache Appui Aerien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTacheAppuiAerien
	 * @generated
	 */
	public Adapter createTypeTacheAppuiAerienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTirsParObjectif <em>Type Tirs Par Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTirsParObjectif
	 * @generated
	 */
	public Adapter createTypeTirsParObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTraitementObjectif <em>Type Traitement Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTraitementObjectif
	 * @generated
	 */
	public Adapter createTypeTraitementObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTraitementPatients <em>Type Traitement Patients</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTraitementPatients
	 * @generated
	 */
	public Adapter createTypeTraitementPatientsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTrancheMeteo <em>Type Tranche Meteo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTrancheMeteo
	 * @generated
	 */
	public Adapter createTypeTrancheMeteoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTransfertDotation <em>Type Transfert Dotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTransfertDotation
	 * @generated
	 */
	public Adapter createTypeTransfertDotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTravailAideDeploiement <em>Type Travail Aide Deploiement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTravailAideDeploiement
	 * @generated
	 */
	public Adapter createTypeTravailAideDeploiementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTravailGenie <em>Type Travail Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTravailGenie
	 * @generated
	 */
	public Adapter createTypeTravailGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTriage <em>Type Triage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTriage
	 * @generated
	 */
	public Adapter createTypeTriageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeType
	 * @generated
	 */
	public Adapter createTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeAerodrome <em>Type Type Aerodrome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeAerodrome
	 * @generated
	 */
	public Adapter createTypeTypeAerodromeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeAeronef <em>Type Type Aeronef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeAeronef
	 * @generated
	 */
	public Adapter createTypeTypeAeronefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeAgentBiologique <em>Type Type Agent Biologique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeAgentBiologique
	 * @generated
	 */
	public Adapter createTypeTypeAgentBiologiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeAgentChimique <em>Type Type Agent Chimique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeAgentChimique
	 * @generated
	 */
	public Adapter createTypeTypeAgentChimiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeAgentNucleaire <em>Type Type Agent Nucleaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeAgentNucleaire
	 * @generated
	 */
	public Adapter createTypeTypeAgentNucleaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeArme <em>Type Type Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeArme
	 * @generated
	 */
	public Adapter createTypeTypeArmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeArmementSystemeArme <em>Type Type Armement Systeme Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeArmementSystemeArme
	 * @generated
	 */
	public Adapter createTypeTypeArmementSystemeArmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeBatiment <em>Type Type Batiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeBatiment
	 * @generated
	 */
	public Adapter createTypeTypeBatimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeBatimentParticipant <em>Type Type Batiment Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeBatimentParticipant
	 * @generated
	 */
	public Adapter createTypeTypeBatimentParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeBatimentSurface <em>Type Type Batiment Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeBatimentSurface
	 * @generated
	 */
	public Adapter createTypeTypeBatimentSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeCapteur <em>Type Type Capteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeCapteur
	 * @generated
	 */
	public Adapter createTypeTypeCapteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeConsommable <em>Type Type Consommable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeConsommable
	 * @generated
	 */
	public Adapter createTypeTypeConsommableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeConsommableSystemeArme <em>Type Type Consommable Systeme Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeConsommableSystemeArme
	 * @generated
	 */
	public Adapter createTypeTypeConsommableSystemeArmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeElementControle <em>Type Type Element Controle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeElementControle
	 * @generated
	 */
	public Adapter createTypeTypeElementControleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeEntiteOrganisationnelle <em>Type Type Entite Organisationnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeEntiteOrganisationnelle
	 * @generated
	 */
	public Adapter createTypeTypeEntiteOrganisationnelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeEquipement <em>Type Type Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeEquipement
	 * @generated
	 */
	public Adapter createTypeTypeEquipementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeEquipementASS <em>Type Type Equipement ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeEquipementASS
	 * @generated
	 */
	public Adapter createTypeTypeEquipementASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeEquipementElectronique <em>Type Type Equipement Electronique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeEquipementElectronique
	 * @generated
	 */
	public Adapter createTypeTypeEquipementElectroniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeEquipementFerroviaire <em>Type Type Equipement Ferroviaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeEquipementFerroviaire
	 * @generated
	 */
	public Adapter createTypeTypeEquipementFerroviaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeEquipementGenie <em>Type Type Equipement Genie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeEquipementGenie
	 * @generated
	 */
	public Adapter createTypeTypeEquipementGenieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeEquipementMaritime <em>Type Type Equipement Maritime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeEquipementMaritime
	 * @generated
	 */
	public Adapter createTypeTypeEquipementMaritimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeEquipementNRBC <em>Type Type Equipement NRBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeEquipementNRBC
	 * @generated
	 */
	public Adapter createTypeTypeEquipementNRBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeEquipementSystemeArme <em>Type Type Equipement Systeme Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeEquipementSystemeArme
	 * @generated
	 */
	public Adapter createTypeTypeEquipementSystemeArmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeGroupeIndividus <em>Type Type Groupe Individus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeGroupeIndividus
	 * @generated
	 */
	public Adapter createTypeTypeGroupeIndividusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeIntervenant3D <em>Type Type Intervenant3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeIntervenant3D
	 * @generated
	 */
	public Adapter createTypeTypeIntervenant3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeItineraire <em>Type Type Itineraire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeItineraire
	 * @generated
	 */
	public Adapter createTypeTypeItineraireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeMateriel <em>Type Type Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeMateriel
	 * @generated
	 */
	public Adapter createTypeTypeMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeMesureCoordination <em>Type Type Mesure Coordination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeMesureCoordination
	 * @generated
	 */
	public Adapter createTypeTypeMesureCoordinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeMissionAerienne <em>Type Type Mission Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeMissionAerienne
	 * @generated
	 */
	public Adapter createTypeTypeMissionAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeMissionI3D <em>Type Type Mission I3D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeMissionI3D
	 * @generated
	 */
	public Adapter createTypeTypeMissionI3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeMoyenManquant <em>Type Type Moyen Manquant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeMoyenManquant
	 * @generated
	 */
	public Adapter createTypeTypeMoyenManquantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeMunition <em>Type Type Munition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeMunition
	 * @generated
	 */
	public Adapter createTypeTypeMunitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeMunitionSystemeArme <em>Type Type Munition Systeme Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeMunitionSystemeArme
	 * @generated
	 */
	public Adapter createTypeTypeMunitionSystemeArmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeObjectifASS <em>Type Type Objectif ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeObjectifASS
	 * @generated
	 */
	public Adapter createTypeTypeObjectifASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeObjectifMajeur <em>Type Type Objectif Majeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeObjectifMajeur
	 * @generated
	 */
	public Adapter createTypeTypeObjectifMajeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeObstacle <em>Type Type Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeObstacle
	 * @generated
	 */
	public Adapter createTypeTypeObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeOrganisationGouvernementale <em>Type Type Organisation Gouvernementale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeOrganisationGouvernementale
	 * @generated
	 */
	public Adapter createTypeTypeOrganisationGouvernementaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeOrganisationMilitaireExecutive <em>Type Type Organisation Militaire Executive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeOrganisationMilitaireExecutive
	 * @generated
	 */
	public Adapter createTypeTypeOrganisationMilitaireExecutiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeOrganisationPrivee <em>Type Type Organisation Privee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeOrganisationPrivee
	 * @generated
	 */
	public Adapter createTypeTypeOrganisationPriveeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypePersonne <em>Type Type Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypePersonne
	 * @generated
	 */
	public Adapter createTypeTypePersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypePont <em>Type Type Pont</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypePont
	 * @generated
	 */
	public Adapter createTypeTypePontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypePort <em>Type Type Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypePort
	 * @generated
	 */
	public Adapter createTypeTypePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypePorteur <em>Type Type Porteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypePorteur
	 * @generated
	 */
	public Adapter createTypeTypePorteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypePosteCivil <em>Type Type Poste Civil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypePosteCivil
	 * @generated
	 */
	public Adapter createTypeTypePosteCivilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypePosteMilitaire <em>Type Type Poste Militaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypePosteMilitaire
	 * @generated
	 */
	public Adapter createTypeTypePosteMilitaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeRegroupementForce <em>Type Type Regroupement Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeRegroupementForce
	 * @generated
	 */
	public Adapter createTypeTypeRegroupementForceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeRepartition <em>Type Type Repartition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeRepartition
	 * @generated
	 */
	public Adapter createTypeTypeRepartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeSite <em>Type Type Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeSite
	 * @generated
	 */
	public Adapter createTypeTypeSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeSousMarin <em>Type Type Sous Marin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeSousMarin
	 * @generated
	 */
	public Adapter createTypeTypeSousMarinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeSousSysteme <em>Type Type Sous Systeme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeSousSysteme
	 * @generated
	 */
	public Adapter createTypeTypeSousSystemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeUnite <em>Type Type Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeUnite
	 * @generated
	 */
	public Adapter createTypeTypeUniteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeTypeVehicule <em>Type Type Vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeTypeVehicule
	 * @generated
	 */
	public Adapter createTypeTypeVehiculeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUnite <em>Type Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUnite
	 * @generated
	 */
	public Adapter createTypeUniteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUnite4D <em>Type Unite4 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUnite4D
	 * @generated
	 */
	public Adapter createTypeUnite4DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUniteAir <em>Type Unite Air</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUniteAir
	 * @generated
	 */
	public Adapter createTypeUniteAirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUniteASS <em>Type Unite ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUniteASS
	 * @generated
	 */
	public Adapter createTypeUniteASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUniteBeneficiaireMateriel <em>Type Unite Beneficiaire Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUniteBeneficiaireMateriel
	 * @generated
	 */
	public Adapter createTypeUniteBeneficiaireMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUniteCooperante <em>Type Unite Cooperante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUniteCooperante
	 * @generated
	 */
	public Adapter createTypeUniteCooperanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUniteLogistique <em>Type Unite Logistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUniteLogistique
	 * @generated
	 */
	public Adapter createTypeUniteLogistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUniteMaintenance <em>Type Unite Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUniteMaintenance
	 * @generated
	 */
	public Adapter createTypeUniteMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUniteMateriel <em>Type Unite Materiel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUniteMateriel
	 * @generated
	 */
	public Adapter createTypeUniteMaterielAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUniteParticipante <em>Type Unite Participante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUniteParticipante
	 * @generated
	 */
	public Adapter createTypeUniteParticipanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeUtilisationIFF <em>Type Utilisation IFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeUtilisationIFF
	 * @generated
	 */
	public Adapter createTypeUtilisationIFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVarianteTravail <em>Type Variante Travail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVarianteTravail
	 * @generated
	 */
	public Adapter createTypeVarianteTravailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVehicule <em>Type Vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVehicule
	 * @generated
	 */
	public Adapter createTypeVehiculeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVehiculeExceptionnel <em>Type Vehicule Exceptionnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVehiculeExceptionnel
	 * @generated
	 */
	public Adapter createTypeVehiculeExceptionnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVent <em>Type Vent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVent
	 * @generated
	 */
	public Adapter createTypeVentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVisibilite <em>Type Visibilite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVisibilite
	 * @generated
	 */
	public Adapter createTypeVisibiliteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVisibiliteSurObjectif <em>Type Visibilite Sur Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVisibiliteSurObjectif
	 * @generated
	 */
	public Adapter createTypeVisibiliteSurObjectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVol <em>Type Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVol
	 * @generated
	 */
	public Adapter createTypeVolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVolumeGeometrique <em>Type Volume Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVolumeGeometrique
	 * @generated
	 */
	public Adapter createTypeVolumeGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVolumeMunitionsASS <em>Type Volume Munitions ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVolumeMunitionsASS
	 * @generated
	 */
	public Adapter createTypeVolumeMunitionsASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeVolumeSecuriteASS <em>Type Volume Securite ASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeVolumeSecuriteASS
	 * @generated
	 */
	public Adapter createTypeVolumeSecuriteASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZDVparPeriode <em>Type ZD Vpar Periode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZDVparPeriode
	 * @generated
	 */
	public Adapter createTypeZDVparPeriodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneAcquisition <em>Type Zone Acquisition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneAcquisition
	 * @generated
	 */
	public Adapter createTypeZoneAcquisitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneAerienne <em>Type Zone Aerienne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneAerienne
	 * @generated
	 */
	public Adapter createTypeZoneAerienneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneAlat <em>Type Zone Alat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneAlat
	 * @generated
	 */
	public Adapter createTypeZoneAlatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneCouverte <em>Type Zone Couverte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneCouverte
	 * @generated
	 */
	public Adapter createTypeZoneCouverteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneDiffusion <em>Type Zone Diffusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneDiffusion
	 * @generated
	 */
	public Adapter createTypeZoneDiffusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneFonctionnelleLogistique <em>Type Zone Fonctionnelle Logistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneFonctionnelleLogistique
	 * @generated
	 */
	public Adapter createTypeZoneFonctionnelleLogistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneIntervention <em>Type Zone Intervention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneIntervention
	 * @generated
	 */
	public Adapter createTypeZoneInterventionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneLogistique <em>Type Zone Logistique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneLogistique
	 * @generated
	 */
	public Adapter createTypeZoneLogistiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneMiseATerre <em>Type Zone Mise ATerre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneMiseATerre
	 * @generated
	 */
	public Adapter createTypeZoneMiseATerreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneRecherche <em>Type Zone Recherche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneRecherche
	 * @generated
	 */
	public Adapter createTypeZoneRechercheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneRisque <em>Type Zone Risque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneRisque
	 * @generated
	 */
	public Adapter createTypeZoneRisqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZoneSecurite <em>Type Zone Securite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZoneSecurite
	 * @generated
	 */
	public Adapter createTypeZoneSecuriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.schema.TypeZonesImplantationProposees <em>Type Zones Implantation Proposees</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.schema.TypeZonesImplantationProposees
	 * @generated
	 */
	public Adapter createTypeZonesImplantationProposeesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchemaAdapterFactory
