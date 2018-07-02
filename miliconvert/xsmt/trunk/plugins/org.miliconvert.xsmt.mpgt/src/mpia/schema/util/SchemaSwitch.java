/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.util;

import java.util.List;

import mpia.schema.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage
 * @generated
 */
public class SchemaSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchemaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaSwitch() {
		if (modelPackage == null) {
			modelPackage = SchemaPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SchemaPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ACTION: {
				TypeAction typeAction = (TypeAction)theEObject;
				T result = caseTypeAction(typeAction);
				if (result == null) result = caseTypeActivite(typeAction);
				if (result == null) result = caseTypeRacineOperationnelle(typeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ACTION3_DENI: {
				TypeAction3Deni typeAction3Deni = (TypeAction3Deni)theEObject;
				T result = caseTypeAction3Deni(typeAction3Deni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ACTION_AS_AENI: {
				TypeActionASAeni typeActionASAeni = (TypeActionASAeni)theEObject;
				T result = caseTypeActionASAeni(typeActionASAeni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ACTION_GENIE_ENI: {
				TypeActionGenieENI typeActionGenieENI = (TypeActionGenieENI)theEObject;
				T result = caseTypeActionGenieENI(typeActionGenieENI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT: {
				TypeActionRenseignement typeActionRenseignement = (TypeActionRenseignement)theEObject;
				T result = caseTypeActionRenseignement(typeActionRenseignement);
				if (result == null) result = caseTypeAction(typeActionRenseignement);
				if (result == null) result = caseTypeActivite(typeActionRenseignement);
				if (result == null) result = caseTypeRacineOperationnelle(typeActionRenseignement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ACTIVITE: {
				TypeActivite typeActivite = (TypeActivite)theEObject;
				T result = caseTypeActivite(typeActivite);
				if (result == null) result = caseTypeRacineOperationnelle(typeActivite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ACTIVITE_POSTURE: {
				TypeActivitePosture typeActivitePosture = (TypeActivitePosture)theEObject;
				T result = caseTypeActivitePosture(typeActivitePosture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ACTIVITE_SUR_POINT_CONTROLE3_D: {
				TypeActiviteSurPointControle3D typeActiviteSurPointControle3D = (TypeActiviteSurPointControle3D)theEObject;
				T result = caseTypeActiviteSurPointControle3D(typeActiviteSurPointControle3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ADRESSE: {
				TypeAdresse typeAdresse = (TypeAdresse)theEObject;
				T result = caseTypeAdresse(typeAdresse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE: {
				TypeAdresseElectronique typeAdresseElectronique = (TypeAdresseElectronique)theEObject;
				T result = caseTypeAdresseElectronique(typeAdresseElectronique);
				if (result == null) result = caseTypeAdresse(typeAdresseElectronique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE: {
				TypeAdressePhysique typeAdressePhysique = (TypeAdressePhysique)theEObject;
				T result = caseTypeAdressePhysique(typeAdressePhysique);
				if (result == null) result = caseTypeAdresse(typeAdressePhysique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ADRESSE_RADIO: {
				TypeAdresseRadio typeAdresseRadio = (TypeAdresseRadio)theEObject;
				T result = caseTypeAdresseRadio(typeAdresseRadio);
				if (result == null) result = caseTypeAdresse(typeAdresseRadio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AERODROME: {
				TypeAerodrome typeAerodrome = (TypeAerodrome)theEObject;
				T result = caseTypeAerodrome(typeAerodrome);
				if (result == null) result = caseTypeSite(typeAerodrome);
				if (result == null) result = caseTypeInstanceObjet(typeAerodrome);
				if (result == null) result = caseTypeRacineOperationnelle(typeAerodrome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AERONEF: {
				TypeAeronef typeAeronef = (TypeAeronef)theEObject;
				T result = caseTypeAeronef(typeAeronef);
				if (result == null) result = caseTypeMateriel(typeAeronef);
				if (result == null) result = caseTypeInstanceObjet(typeAeronef);
				if (result == null) result = caseTypeRacineOperationnelle(typeAeronef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AFFILIATION: {
				TypeAffiliation typeAffiliation = (TypeAffiliation)theEObject;
				T result = caseTypeAffiliation(typeAffiliation);
				if (result == null) result = caseTypeRacineOperationnelle(typeAffiliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE: {
				TypeAirePisteGeometrique typeAirePisteGeometrique = (TypeAirePisteGeometrique)theEObject;
				T result = caseTypeAirePisteGeometrique(typeAirePisteGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeAirePisteGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE: {
				TypeAirePolyarcGeometrique typeAirePolyarcGeometrique = (TypeAirePolyarcGeometrique)theEObject;
				T result = caseTypeAirePolyarcGeometrique(typeAirePolyarcGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeAirePolyarcGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AIRE_POLYGONE_GEOMETRIQUE: {
				TypeAirePolygoneGeometrique typeAirePolygoneGeometrique = (TypeAirePolygoneGeometrique)theEObject;
				T result = caseTypeAirePolygoneGeometrique(typeAirePolygoneGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeAirePolygoneGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AIRE_STATIONNEMENT: {
				TypeAireStationnement typeAireStationnement = (TypeAireStationnement)theEObject;
				T result = caseTypeAireStationnement(typeAireStationnement);
				if (result == null) result = caseTypeSite(typeAireStationnement);
				if (result == null) result = caseTypeInstanceObjet(typeAireStationnement);
				if (result == null) result = caseTypeRacineOperationnelle(typeAireStationnement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE: {
				TypeAlerteFrappeNucleaireAmie typeAlerteFrappeNucleaireAmie = (TypeAlerteFrappeNucleaireAmie)theEObject;
				T result = caseTypeAlerteFrappeNucleaireAmie(typeAlerteFrappeNucleaireAmie);
				if (result == null) result = caseTypeEvenement(typeAlerteFrappeNucleaireAmie);
				if (result == null) result = caseTypeActivite(typeAlerteFrappeNucleaireAmie);
				if (result == null) result = caseTypeRacineOperationnelle(typeAlerteFrappeNucleaireAmie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ALLURE: {
				TypeAllure typeAllure = (TypeAllure)theEObject;
				T result = caseTypeAllure(typeAllure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ANNULATION_IFF: {
				TypeAnnulationIFF typeAnnulationIFF = (TypeAnnulationIFF)theEObject;
				T result = caseTypeAnnulationIFF(typeAnnulationIFF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR: {
				TypeAnnulationInterdictionTir typeAnnulationInterdictionTir = (TypeAnnulationInterdictionTir)theEObject;
				T result = caseTypeAnnulationInterdictionTir(typeAnnulationInterdictionTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE: {
				TypeApercuDestinatairePlanOuOrdre typeApercuDestinatairePlanOuOrdre = (TypeApercuDestinatairePlanOuOrdre)theEObject;
				T result = caseTypeApercuDestinatairePlanOuOrdre(typeApercuDestinatairePlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE: {
				TypeAppuiFeuHelicoptere typeAppuiFeuHelicoptere = (TypeAppuiFeuHelicoptere)theEObject;
				T result = caseTypeAppuiFeuHelicoptere(typeAppuiFeuHelicoptere);
				if (result == null) result = caseTypeMission(typeAppuiFeuHelicoptere);
				if (result == null) result = caseTypeActivite(typeAppuiFeuHelicoptere);
				if (result == null) result = caseTypeRacineOperationnelle(typeAppuiFeuHelicoptere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN: {
				TypeArmementMissionAppuiAerien typeArmementMissionAppuiAerien = (TypeArmementMissionAppuiAerien)theEObject;
				T result = caseTypeArmementMissionAppuiAerien(typeArmementMissionAppuiAerien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ARTICULATION: {
				TypeArticulation typeArticulation = (TypeArticulation)theEObject;
				T result = caseTypeArticulation(typeArticulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ARTICULATION_ASS: {
				TypeArticulationASS typeArticulationASS = (TypeArticulationASS)theEObject;
				T result = caseTypeArticulationASS(typeArticulationASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE: {
				TypeArticulationLogistique typeArticulationLogistique = (TypeArticulationLogistique)theEObject;
				T result = caseTypeArticulationLogistique(typeArticulationLogistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ARTICULATION_MARINE: {
				TypeArticulationMarine typeArticulationMarine = (TypeArticulationMarine)theEObject;
				T result = caseTypeArticulationMarine(typeArticulationMarine);
				if (result == null) result = caseTypeArticulation(typeArticulationMarine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL: {
				TypeArticulationSoutienMedical typeArticulationSoutienMedical = (TypeArticulationSoutienMedical)theEObject;
				T result = caseTypeArticulationSoutienMedical(typeArticulationSoutienMedical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ARTICULATION_TERRE: {
				TypeArticulationTerre typeArticulationTerre = (TypeArticulationTerre)theEObject;
				T result = caseTypeArticulationTerre(typeArticulationTerre);
				if (result == null) result = caseTypeArticulation(typeArticulationTerre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE: {
				TypeAssocActiviteContexte typeAssocActiviteContexte = (TypeAssocActiviteContexte)theEObject;
				T result = caseTypeAssocActiviteContexte(typeAssocActiviteContexte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION: {
				TypeAssocConsigneLocalisation typeAssocConsigneLocalisation = (TypeAssocConsigneLocalisation)theEObject;
				T result = caseTypeAssocConsigneLocalisation(typeAssocConsigneLocalisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE: {
				TypeAssocContexteContexte typeAssocContexteContexte = (TypeAssocContexteContexte)theEObject;
				T result = caseTypeAssocContexteContexte(typeAssocContexteContexte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET: {
				TypeAssocContexteInstanceObjet typeAssocContexteInstanceObjet = (TypeAssocContexteInstanceObjet)theEObject;
				T result = caseTypeAssocContexteInstanceObjet(typeAssocContexteInstanceObjet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG: {
				TypeAssocEntiteOrgTypeEntiteOrg typeAssocEntiteOrgTypeEntiteOrg = (TypeAssocEntiteOrgTypeEntiteOrg)theEObject;
				T result = caseTypeAssocEntiteOrgTypeEntiteOrg(typeAssocEntiteOrgTypeEntiteOrg);
				if (result == null) result = caseTypeAssociationInstanceObjetType(typeAssocEntiteOrgTypeEntiteOrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION: {
				TypeAssociationActionAction typeAssociationActionAction = (TypeAssociationActionAction)theEObject;
				T result = caseTypeAssociationActionAction(typeAssociationActionAction);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationActionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_AUTRE_EVENEMENT: {
				TypeAssociationActionAutreEvenement typeAssociationActionAutreEvenement = (TypeAssociationActionAutreEvenement)theEObject;
				T result = caseTypeAssociationActionAutreEvenement(typeAssociationActionAutreEvenement);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationActionAutreEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_EVENEMENT_NRBC: {
				TypeAssociationActionEvenementNRBC typeAssociationActionEvenementNRBC = (TypeAssociationActionEvenementNRBC)theEObject;
				T result = caseTypeAssociationActionEvenementNRBC(typeAssociationActionEvenementNRBC);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationActionEvenementNRBC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE: {
				TypeAssociationActiviteCapacite typeAssociationActiviteCapacite = (TypeAssociationActiviteCapacite)theEObject;
				T result = caseTypeAssociationActiviteCapacite(typeAssociationActiviteCapacite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION: {
				TypeAssociationActiviteLocalisation typeAssociationActiviteLocalisation = (TypeAssociationActiviteLocalisation)theEObject;
				T result = caseTypeAssociationActiviteLocalisation(typeAssociationActiviteLocalisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION: {
				TypeAssociationAffiliationAffiliation typeAssociationAffiliationAffiliation = (TypeAssociationAffiliationAffiliation)theEObject;
				T result = caseTypeAssociationAffiliationAffiliation(typeAssociationAffiliationAffiliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET: {
				TypeAssociationAffiliationInstanceObjet typeAssociationAffiliationInstanceObjet = (TypeAssociationAffiliationInstanceObjet)theEObject;
				T result = caseTypeAssociationAffiliationInstanceObjet(typeAssociationAffiliationInstanceObjet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE: {
				TypeAssociationAffiliationType typeAssociationAffiliationType = (TypeAssociationAffiliationType)theEObject;
				T result = caseTypeAssociationAffiliationType(typeAssociationAffiliationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION: {
				TypeAssociationAutreEvenementAction typeAssociationAutreEvenementAction = (TypeAssociationAutreEvenementAction)theEObject;
				T result = caseTypeAssociationAutreEvenementAction(typeAssociationAutreEvenementAction);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationAutreEvenementAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT: {
				TypeAssociationAutreEvenementAutreEvenement typeAssociationAutreEvenementAutreEvenement = (TypeAssociationAutreEvenementAutreEvenement)theEObject;
				T result = caseTypeAssociationAutreEvenementAutreEvenement(typeAssociationAutreEvenementAutreEvenement);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationAutreEvenementAutreEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC: {
				TypeAssociationAutreEvenementEvenementNRBC typeAssociationAutreEvenementEvenementNRBC = (TypeAssociationAutreEvenementEvenementNRBC)theEObject;
				T result = caseTypeAssociationAutreEvenementEvenementNRBC(typeAssociationAutreEvenementEvenementNRBC);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationAutreEvenementEvenementNRBC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE: {
				TypeAssociationConflit3DMissionAerienne typeAssociationConflit3DMissionAerienne = (TypeAssociationConflit3DMissionAerienne)theEObject;
				T result = caseTypeAssociationConflit3DMissionAerienne(typeAssociationConflit3DMissionAerienne);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationConflit3DMissionAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR: {
				TypeAssociationConsommablelMajeur typeAssociationConsommablelMajeur = (TypeAssociationConsommablelMajeur)theEObject;
				T result = caseTypeAssociationConsommablelMajeur(typeAssociationConsommablelMajeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION: {
				TypeAssociationConsommation typeAssociationConsommation = (TypeAssociationConsommation)theEObject;
				T result = caseTypeAssociationConsommation(typeAssociationConsommation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT: {
				TypeAssociationContenuParagraphePlanOuOrdreDocument typeAssociationContenuParagraphePlanOuOrdreDocument = (TypeAssociationContenuParagraphePlanOuOrdreDocument)theEObject;
				T result = caseTypeAssociationContenuParagraphePlanOuOrdreDocument(typeAssociationContenuParagraphePlanOuOrdreDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT: {
				TypeAssociationContexteRapport typeAssociationContexteRapport = (TypeAssociationContexteRapport)theEObject;
				T result = caseTypeAssociationContexteRapport(typeAssociationContexteRapport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE: {
				TypeAssociationConvoiMouvementParRoute typeAssociationConvoiMouvementParRoute = (TypeAssociationConvoiMouvementParRoute)theEObject;
				T result = caseTypeAssociationConvoiMouvementParRoute(typeAssociationConvoiMouvementParRoute);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationConvoiMouvementParRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION: {
				TypeAssociationDepEvacuationDepEvacuation typeAssociationDepEvacuationDepEvacuation = (TypeAssociationDepEvacuationDepEvacuation)theEObject;
				T result = caseTypeAssociationDepEvacuationDepEvacuation(typeAssociationDepEvacuationDepEvacuation);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationDepEvacuationDepEvacuation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE: {
				TypeAssociationDocumentCapacite typeAssociationDocumentCapacite = (TypeAssociationDocumentCapacite)theEObject;
				T result = caseTypeAssociationDocumentCapacite(typeAssociationDocumentCapacite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT: {
				TypeAssociationElementControleEvenement typeAssociationElementControleEvenement = (TypeAssociationElementControleEvenement)theEObject;
				T result = caseTypeAssociationElementControleEvenement(typeAssociationElementControleEvenement);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationElementControleEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT: {
				TypeAssociationElementTopographieEvenement typeAssociationElementTopographieEvenement = (TypeAssociationElementTopographieEvenement)theEObject;
				T result = caseTypeAssociationElementTopographieEvenement(typeAssociationElementTopographieEvenement);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationElementTopographieEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_ELT_CTRL: {
				TypeAssociationEltCtrlEltCtrl typeAssociationEltCtrlEltCtrl = (TypeAssociationEltCtrlEltCtrl)theEObject;
				T result = caseTypeAssociationEltCtrlEltCtrl(typeAssociationEltCtrlEltCtrl);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEltCtrlEltCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_ELT_TOPO: {
				TypeAssociationEltCtrlEltTopo typeAssociationEltCtrlEltTopo = (TypeAssociationEltCtrlEltTopo)theEObject;
				T result = caseTypeAssociationEltCtrlEltTopo(typeAssociationEltCtrlEltTopo);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEltCtrlEltTopo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_MATERIEL: {
				TypeAssociationEltCtrlMateriel typeAssociationEltCtrlMateriel = (TypeAssociationEltCtrlMateriel)theEObject;
				T result = caseTypeAssociationEltCtrlMateriel(typeAssociationEltCtrlMateriel);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEltCtrlMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_SITE: {
				TypeAssociationEltCtrlSite typeAssociationEltCtrlSite = (TypeAssociationEltCtrlSite)theEObject;
				T result = caseTypeAssociationEltCtrlSite(typeAssociationEltCtrlSite);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEltCtrlSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL: {
				TypeAssociationEltCtrlTypeEltCtrl typeAssociationEltCtrlTypeEltCtrl = (TypeAssociationEltCtrlTypeEltCtrl)theEObject;
				T result = caseTypeAssociationEltCtrlTypeEltCtrl(typeAssociationEltCtrlTypeEltCtrl);
				if (result == null) result = caseTypeAssociationInstanceObjetType(typeAssociationEltCtrlTypeEltCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE: {
				TypeAssociationEltTopoSite typeAssociationEltTopoSite = (TypeAssociationEltTopoSite)theEObject;
				T result = caseTypeAssociationEltTopoSite(typeAssociationEltTopoSite);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEltTopoSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION: {
				TypeAssociationEntiteOrgAction typeAssociationEntiteOrgAction = (TypeAssociationEntiteOrgAction)theEObject;
				T result = caseTypeAssociationEntiteOrgAction(typeAssociationEntiteOrgAction);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationEntiteOrgAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE: {
				TypeAssociationEntiteOrganisationnellePlanOuOrdre typeAssociationEntiteOrganisationnellePlanOuOrdre = (TypeAssociationEntiteOrganisationnellePlanOuOrdre)theEObject;
				T result = caseTypeAssociationEntiteOrganisationnellePlanOuOrdre(typeAssociationEntiteOrganisationnellePlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_CTRL: {
				TypeAssociationEntiteOrgEltCtrl typeAssociationEntiteOrgEltCtrl = (TypeAssociationEntiteOrgEltCtrl)theEObject;
				T result = caseTypeAssociationEntiteOrgEltCtrl(typeAssociationEntiteOrgEltCtrl);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEntiteOrgEltCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO: {
				TypeAssociationEntiteOrgEltTopo typeAssociationEntiteOrgEltTopo = (TypeAssociationEntiteOrgEltTopo)theEObject;
				T result = caseTypeAssociationEntiteOrgEltTopo(typeAssociationEntiteOrgEltTopo);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEntiteOrgEltTopo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG: {
				TypeAssociationEntiteOrgEntiteOrg typeAssociationEntiteOrgEntiteOrg = (TypeAssociationEntiteOrgEntiteOrg)theEObject;
				T result = caseTypeAssociationEntiteOrgEntiteOrg(typeAssociationEntiteOrgEntiteOrg);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEntiteOrgEntiteOrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_EVENEMENT: {
				TypeAssociationEntiteOrgEvenement typeAssociationEntiteOrgEvenement = (TypeAssociationEntiteOrgEvenement)theEObject;
				T result = caseTypeAssociationEntiteOrgEvenement(typeAssociationEntiteOrgEvenement);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationEntiteOrgEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_MATERIEL: {
				TypeAssociationEntiteOrgMateriel typeAssociationEntiteOrgMateriel = (TypeAssociationEntiteOrgMateriel)theEObject;
				T result = caseTypeAssociationEntiteOrgMateriel(typeAssociationEntiteOrgMateriel);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEntiteOrgMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU: {
				TypeAssociationEntiteOrgObjetInconnu typeAssociationEntiteOrgObjetInconnu = (TypeAssociationEntiteOrgObjetInconnu)theEObject;
				T result = caseTypeAssociationEntiteOrgObjetInconnu(typeAssociationEntiteOrgObjetInconnu);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEntiteOrgObjetInconnu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_PERSONNE: {
				TypeAssociationEntiteOrgPersonne typeAssociationEntiteOrgPersonne = (TypeAssociationEntiteOrgPersonne)theEObject;
				T result = caseTypeAssociationEntiteOrgPersonne(typeAssociationEntiteOrgPersonne);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEntiteOrgPersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_SITE: {
				TypeAssociationEntiteOrgSite typeAssociationEntiteOrgSite = (TypeAssociationEntiteOrgSite)theEObject;
				T result = caseTypeAssociationEntiteOrgSite(typeAssociationEntiteOrgSite);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationEntiteOrgSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_EQUIPEMENTL_MAJEUR: {
				TypeAssociationEquipementlMajeur typeAssociationEquipementlMajeur = (TypeAssociationEquipementlMajeur)theEObject;
				T result = caseTypeAssociationEquipementlMajeur(typeAssociationEquipementlMajeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_ACTION: {
				TypeAssociationEvenementNRBCAction typeAssociationEvenementNRBCAction = (TypeAssociationEvenementNRBCAction)theEObject;
				T result = caseTypeAssociationEvenementNRBCAction(typeAssociationEvenementNRBCAction);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationEvenementNRBCAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT: {
				TypeAssociationEvenementNRBCAutreEvenement typeAssociationEvenementNRBCAutreEvenement = (TypeAssociationEvenementNRBCAutreEvenement)theEObject;
				T result = caseTypeAssociationEvenementNRBCAutreEvenement(typeAssociationEvenementNRBCAutreEvenement);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationEvenementNRBCAutreEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC: {
				TypeAssociationEvenementNRBCEvenementNRBC typeAssociationEvenementNRBCEvenementNRBC = (TypeAssociationEvenementNRBCEvenementNRBC)theEObject;
				T result = caseTypeAssociationEvenementNRBCEvenementNRBC(typeAssociationEvenementNRBCEvenementNRBC);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationEvenementNRBCEvenementNRBC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT: {
				TypeAssociationEvenementRENSAutreEvenement typeAssociationEvenementRENSAutreEvenement = (TypeAssociationEvenementRENSAutreEvenement)theEObject;
				T result = caseTypeAssociationEvenementRENSAutreEvenement(typeAssociationEvenementRENSAutreEvenement);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationEvenementRENSAutreEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS: {
				TypeAssociationEvenementRENSEvenementRENS typeAssociationEvenementRENSEvenementRENS = (TypeAssociationEvenementRENSEvenementRENS)theEObject;
				T result = caseTypeAssociationEvenementRENSEvenementRENS(typeAssociationEvenementRENSEvenementRENS);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationEvenementRENSEvenementRENS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE: {
				TypeAssociationFonctionnelleActivite typeAssociationFonctionnelleActivite = (TypeAssociationFonctionnelleActivite)theEObject;
				T result = caseTypeAssociationFonctionnelleActivite(typeAssociationFonctionnelleActivite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE: {
				TypeAssociationGroupeInfoOpsEntiteOrganisationnelle typeAssociationGroupeInfoOpsEntiteOrganisationnelle = (TypeAssociationGroupeInfoOpsEntiteOrganisationnelle)theEObject;
				T result = caseTypeAssociationGroupeInfoOpsEntiteOrganisationnelle(typeAssociationGroupeInfoOpsEntiteOrganisationnelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE: {
				TypeAssociationGroupeInfoOpsPlanOuOrdre typeAssociationGroupeInfoOpsPlanOuOrdre = (TypeAssociationGroupeInfoOpsPlanOuOrdre)theEObject;
				T result = caseTypeAssociationGroupeInfoOpsPlanOuOrdre(typeAssociationGroupeInfoOpsPlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE: {
				TypeAssociationHoraireManoeuvre typeAssociationHoraireManoeuvre = (TypeAssociationHoraireManoeuvre)theEObject;
				T result = caseTypeAssociationHoraireManoeuvre(typeAssociationHoraireManoeuvre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ACTIVITE: {
				TypeAssociationInstanceObjetActivite typeAssociationInstanceObjetActivite = (TypeAssociationInstanceObjetActivite)theEObject;
				T result = caseTypeAssociationInstanceObjetActivite(typeAssociationInstanceObjetActivite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE: {
				TypeAssociationInstanceObjetAdresse typeAssociationInstanceObjetAdresse = (TypeAssociationInstanceObjetAdresse)theEObject;
				T result = caseTypeAssociationInstanceObjetAdresse(typeAssociationInstanceObjetAdresse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE: {
				TypeAssociationInstanceObjetCapacite typeAssociationInstanceObjetCapacite = (TypeAssociationInstanceObjetCapacite)theEObject;
				T result = caseTypeAssociationInstanceObjetCapacite(typeAssociationInstanceObjetCapacite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_INSTANCE_OBJET: {
				TypeAssociationInstanceObjetInstanceObjet typeAssociationInstanceObjetInstanceObjet = (TypeAssociationInstanceObjetInstanceObjet)theEObject;
				T result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationInstanceObjetInstanceObjet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_TYPE: {
				TypeAssociationInstanceObjetType typeAssociationInstanceObjetType = (TypeAssociationInstanceObjetType)theEObject;
				T result = caseTypeAssociationInstanceObjetType(typeAssociationInstanceObjetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON: {
				TypeAssociationLivraisonLivaison typeAssociationLivraisonLivaison = (TypeAssociationLivraisonLivaison)theEObject;
				T result = caseTypeAssociationLivraisonLivaison(typeAssociationLivraisonLivaison);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationLivraisonLivaison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_CTRL: {
				TypeAssociationMaterielEltCtrl typeAssociationMaterielEltCtrl = (TypeAssociationMaterielEltCtrl)theEObject;
				T result = caseTypeAssociationMaterielEltCtrl(typeAssociationMaterielEltCtrl);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationMaterielEltCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO: {
				TypeAssociationMaterielEltTopo typeAssociationMaterielEltTopo = (TypeAssociationMaterielEltTopo)theEObject;
				T result = caseTypeAssociationMaterielEltTopo(typeAssociationMaterielEltTopo);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationMaterielEltTopo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_EVENEMENT: {
				TypeAssociationMaterielEvenement typeAssociationMaterielEvenement = (TypeAssociationMaterielEvenement)theEObject;
				T result = caseTypeAssociationMaterielEvenement(typeAssociationMaterielEvenement);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationMaterielEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_MATERIEL: {
				TypeAssociationMaterielMateriel typeAssociationMaterielMateriel = (TypeAssociationMaterielMateriel)theEObject;
				T result = caseTypeAssociationMaterielMateriel(typeAssociationMaterielMateriel);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationMaterielMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_METEOROLOGIE: {
				TypeAssociationMaterielMeteorologie typeAssociationMaterielMeteorologie = (TypeAssociationMaterielMeteorologie)theEObject;
				T result = caseTypeAssociationMaterielMeteorologie(typeAssociationMaterielMeteorologie);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationMaterielMeteorologie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_OBJET_INCONNU: {
				TypeAssociationMaterielObjetInconnu typeAssociationMaterielObjetInconnu = (TypeAssociationMaterielObjetInconnu)theEObject;
				T result = caseTypeAssociationMaterielObjetInconnu(typeAssociationMaterielObjetInconnu);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationMaterielObjetInconnu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE: {
				TypeAssociationMaterielPersonne typeAssociationMaterielPersonne = (TypeAssociationMaterielPersonne)theEObject;
				T result = caseTypeAssociationMaterielPersonne(typeAssociationMaterielPersonne);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationMaterielPersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_SITE: {
				TypeAssociationMaterielSite typeAssociationMaterielSite = (TypeAssociationMaterielSite)theEObject;
				T result = caseTypeAssociationMaterielSite(typeAssociationMaterielSite);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationMaterielSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL: {
				TypeAssociationMaterielTypeMateriel typeAssociationMaterielTypeMateriel = (TypeAssociationMaterielTypeMateriel)theEObject;
				T result = caseTypeAssociationMaterielTypeMateriel(typeAssociationMaterielTypeMateriel);
				if (result == null) result = caseTypeAssociationInstanceObjetType(typeAssociationMaterielTypeMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX: {
				TypeAssociationMesureCoordinationPlanFeux typeAssociationMesureCoordinationPlanFeux = (TypeAssociationMesureCoordinationPlanFeux)theEObject;
				T result = caseTypeAssociationMesureCoordinationPlanFeux(typeAssociationMesureCoordinationPlanFeux);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationMesureCoordinationPlanFeux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE: {
				TypeAssociationMesureCoordMissionAerienne typeAssociationMesureCoordMissionAerienne = (TypeAssociationMesureCoordMissionAerienne)theEObject;
				T result = caseTypeAssociationMesureCoordMissionAerienne(typeAssociationMesureCoordMissionAerienne);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationMesureCoordMissionAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_METEOROLOGIE_SITE: {
				TypeAssociationMeteorologieSite typeAssociationMeteorologieSite = (TypeAssociationMeteorologieSite)theEObject;
				T result = caseTypeAssociationMeteorologieSite(typeAssociationMeteorologieSite);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationMeteorologieSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE: {
				TypeAssociationMissionAerienneMissionAerienne typeAssociationMissionAerienneMissionAerienne = (TypeAssociationMissionAerienneMissionAerienne)theEObject;
				T result = caseTypeAssociationMissionAerienneMissionAerienne(typeAssociationMissionAerienneMissionAerienne);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationMissionAerienneMissionAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE: {
				TypeAssociationMissionGenieMissionGenie typeAssociationMissionGenieMissionGenie = (TypeAssociationMissionGenieMissionGenie)theEObject;
				T result = caseTypeAssociationMissionGenieMissionGenie(typeAssociationMissionGenieMissionGenie);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationMissionGenieMissionGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MELEE_ACTION: {
				TypeAssociationMissionMeleeAction typeAssociationMissionMeleeAction = (TypeAssociationMissionMeleeAction)theEObject;
				T result = caseTypeAssociationMissionMeleeAction(typeAssociationMissionMeleeAction);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationMissionMeleeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT: {
				TypeAssociationMissionMouvementMissionMouvement typeAssociationMissionMouvementMissionMouvement = (TypeAssociationMissionMouvementMissionMouvement)theEObject;
				T result = caseTypeAssociationMissionMouvementMissionMouvement(typeAssociationMissionMouvementMissionMouvement);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationMissionMouvementMissionMouvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION: {
				TypeAssociationMissionRenseignementAction typeAssociationMissionRenseignementAction = (TypeAssociationMissionRenseignementAction)theEObject;
				T result = caseTypeAssociationMissionRenseignementAction(typeAssociationMissionRenseignementAction);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationMissionRenseignementAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ: {
				TypeAssociationMissionRensObjPlanTraitementObj typeAssociationMissionRensObjPlanTraitementObj = (TypeAssociationMissionRensObjPlanTraitementObj)theEObject;
				T result = caseTypeAssociationMissionRensObjPlanTraitementObj(typeAssociationMissionRensObjPlanTraitementObj);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationMissionRensObjPlanTraitementObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ: {
				TypeAssociationMissionRensObjTraitementObj typeAssociationMissionRensObjTraitementObj = (TypeAssociationMissionRensObjTraitementObj)theEObject;
				T result = caseTypeAssociationMissionRensObjTraitementObj(typeAssociationMissionRensObjTraitementObj);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationMissionRensObjTraitementObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE: {
				TypeAssociationMouvementParRouteMouvementParRoute typeAssociationMouvementParRouteMouvementParRoute = (TypeAssociationMouvementParRouteMouvementParRoute)theEObject;
				T result = caseTypeAssociationMouvementParRouteMouvementParRoute(typeAssociationMouvementParRouteMouvementParRoute);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationMouvementParRouteMouvementParRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION: {
				TypeAssociationObjectifActiviteLocalisation typeAssociationObjectifActiviteLocalisation = (TypeAssociationObjectifActiviteLocalisation)theEObject;
				T result = caseTypeAssociationObjectifActiviteLocalisation(typeAssociationObjectifActiviteLocalisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT: {
				TypeAssociationObjectifCiblageDocument typeAssociationObjectifCiblageDocument = (TypeAssociationObjectifCiblageDocument)theEObject;
				T result = caseTypeAssociationObjectifCiblageDocument(typeAssociationObjectifCiblageDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_LOCALISATION: {
				TypeAssociationObjectifCiblageLocalisation typeAssociationObjectifCiblageLocalisation = (TypeAssociationObjectifCiblageLocalisation)theEObject;
				T result = caseTypeAssociationObjectifCiblageLocalisation(typeAssociationObjectifCiblageLocalisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE: {
				TypeAssociationObjectifCiblageObjectifCiblage typeAssociationObjectifCiblageObjectifCiblage = (TypeAssociationObjectifCiblageObjectifCiblage)theEObject;
				T result = caseTypeAssociationObjectifCiblageObjectifCiblage(typeAssociationObjectifCiblageObjectifCiblage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_CTRL: {
				TypeAssociationObjetInconnuEltCtrl typeAssociationObjetInconnuEltCtrl = (TypeAssociationObjetInconnuEltCtrl)theEObject;
				T result = caseTypeAssociationObjetInconnuEltCtrl(typeAssociationObjetInconnuEltCtrl);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationObjetInconnuEltCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO: {
				TypeAssociationObjetInconnuEltTopo typeAssociationObjetInconnuEltTopo = (TypeAssociationObjetInconnuEltTopo)theEObject;
				T result = caseTypeAssociationObjetInconnuEltTopo(typeAssociationObjetInconnuEltTopo);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationObjetInconnuEltTopo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_SITE: {
				TypeAssociationObjetInconnuSite typeAssociationObjetInconnuSite = (TypeAssociationObjetInconnuSite)theEObject;
				T result = caseTypeAssociationObjetInconnuSite(typeAssociationObjetInconnuSite);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationObjetInconnuSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION: {
				TypeAssociationObservationObservation typeAssociationObservationObservation = (TypeAssociationObservationObservation)theEObject;
				T result = caseTypeAssociationObservationObservation(typeAssociationObservationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO: {
				TypeAssociationParagraphePOparagraphePO typeAssociationParagraphePOparagraphePO = (TypeAssociationParagraphePOparagraphePO)theEObject;
				T result = caseTypeAssociationParagraphePOparagraphePO(typeAssociationParagraphePOparagraphePO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL: {
				TypeAssociationPersonneEltCtrl typeAssociationPersonneEltCtrl = (TypeAssociationPersonneEltCtrl)theEObject;
				T result = caseTypeAssociationPersonneEltCtrl(typeAssociationPersonneEltCtrl);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationPersonneEltCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO: {
				TypeAssociationPersonneEltTopo typeAssociationPersonneEltTopo = (TypeAssociationPersonneEltTopo)theEObject;
				T result = caseTypeAssociationPersonneEltTopo(typeAssociationPersonneEltTopo);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationPersonneEltTopo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_EVENEMENT: {
				TypeAssociationPersonneEvenement typeAssociationPersonneEvenement = (TypeAssociationPersonneEvenement)theEObject;
				T result = caseTypeAssociationPersonneEvenement(typeAssociationPersonneEvenement);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationPersonneEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL: {
				TypeAssociationPersonneMateriel typeAssociationPersonneMateriel = (TypeAssociationPersonneMateriel)theEObject;
				T result = caseTypeAssociationPersonneMateriel(typeAssociationPersonneMateriel);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationPersonneMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MISSION_AIR: {
				TypeAssociationPersonneMissionAir typeAssociationPersonneMissionAir = (TypeAssociationPersonneMissionAir)theEObject;
				T result = caseTypeAssociationPersonneMissionAir(typeAssociationPersonneMissionAir);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationPersonneMissionAir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_OBJET_INCONNU: {
				TypeAssociationPersonneObjetInconnu typeAssociationPersonneObjetInconnu = (TypeAssociationPersonneObjetInconnu)theEObject;
				T result = caseTypeAssociationPersonneObjetInconnu(typeAssociationPersonneObjetInconnu);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationPersonneObjetInconnu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE: {
				TypeAssociationPersonnePersonne typeAssociationPersonnePersonne = (TypeAssociationPersonnePersonne)theEObject;
				T result = caseTypeAssociationPersonnePersonne(typeAssociationPersonnePersonne);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationPersonnePersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D: {
				TypeAssociationPersonnePlanifOperation3D typeAssociationPersonnePlanifOperation3D = (TypeAssociationPersonnePlanifOperation3D)theEObject;
				T result = caseTypeAssociationPersonnePlanifOperation3D(typeAssociationPersonnePlanifOperation3D);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationPersonnePlanifOperation3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_SITE: {
				TypeAssociationPersonneSite typeAssociationPersonneSite = (TypeAssociationPersonneSite)theEObject;
				T result = caseTypeAssociationPersonneSite(typeAssociationPersonneSite);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationPersonneSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE: {
				TypeAssociationPersonneTypePersonne typeAssociationPersonneTypePersonne = (TypeAssociationPersonneTypePersonne)theEObject;
				T result = caseTypeAssociationPersonneTypePersonne(typeAssociationPersonneTypePersonne);
				if (result == null) result = caseTypeAssociationInstanceObjetType(typeAssociationPersonneTypePersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR: {
				TypeAssociationPlanificationOperation3DMissionAir typeAssociationPlanificationOperation3DMissionAir = (TypeAssociationPlanificationOperation3DMissionAir)theEObject;
				T result = caseTypeAssociationPlanificationOperation3DMissionAir(typeAssociationPlanificationOperation3DMissionAir);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationPlanificationOperation3DMissionAir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA: {
				TypeAssociationPlanificationOperation3DMissionASA typeAssociationPlanificationOperation3DMissionASA = (TypeAssociationPlanificationOperation3DMissionASA)theEObject;
				T result = caseTypeAssociationPlanificationOperation3DMissionASA(typeAssociationPlanificationOperation3DMissionASA);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationPlanificationOperation3DMissionASA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE: {
				TypeAssociationPlanOuOrdrePlanOuOrdre typeAssociationPlanOuOrdrePlanOuOrdre = (TypeAssociationPlanOuOrdrePlanOuOrdre)theEObject;
				T result = caseTypeAssociationPlanOuOrdrePlanOuOrdre(typeAssociationPlanOuOrdrePlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ: {
				TypeAssociationPlanTraitementObjTraitementObj typeAssociationPlanTraitementObjTraitementObj = (TypeAssociationPlanTraitementObjTraitementObj)theEObject;
				T result = caseTypeAssociationPlanTraitementObjTraitementObj(typeAssociationPlanTraitementObjTraitementObj);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationPlanTraitementObjTraitementObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE: {
				TypeAssociationProfilDotationTheorique typeAssociationProfilDotationTheorique = (TypeAssociationProfilDotationTheorique)theEObject;
				T result = caseTypeAssociationProfilDotationTheorique(typeAssociationProfilDotationTheorique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE: {
				TypeAssociationProfilUnite typeAssociationProfilUnite = (TypeAssociationProfilUnite)theEObject;
				T result = caseTypeAssociationProfilUnite(typeAssociationProfilUnite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT: {
				TypeAssociationRacineOperationnelleDocument typeAssociationRacineOperationnelleDocument = (TypeAssociationRacineOperationnelleDocument)theEObject;
				T result = caseTypeAssociationRacineOperationnelleDocument(typeAssociationRacineOperationnelleDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ: {
				TypeAssociationRenseignementObjMisRenseignementObj typeAssociationRenseignementObjMisRenseignementObj = (TypeAssociationRenseignementObjMisRenseignementObj)theEObject;
				T result = caseTypeAssociationRenseignementObjMisRenseignementObj(typeAssociationRenseignementObjMisRenseignementObj);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationRenseignementObjMisRenseignementObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL: {
				TypeAssociationSiteEltCtrl typeAssociationSiteEltCtrl = (TypeAssociationSiteEltCtrl)theEObject;
				T result = caseTypeAssociationSiteEltCtrl(typeAssociationSiteEltCtrl);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationSiteEltCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_TOPO: {
				TypeAssociationSiteEltTopo typeAssociationSiteEltTopo = (TypeAssociationSiteEltTopo)theEObject;
				T result = caseTypeAssociationSiteEltTopo(typeAssociationSiteEltTopo);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationSiteEltTopo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_SITE_EVENEMENT: {
				TypeAssociationSiteEvenement typeAssociationSiteEvenement = (TypeAssociationSiteEvenement)theEObject;
				T result = caseTypeAssociationSiteEvenement(typeAssociationSiteEvenement);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationSiteEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL: {
				TypeAssociationSiteMateriel typeAssociationSiteMateriel = (TypeAssociationSiteMateriel)theEObject;
				T result = caseTypeAssociationSiteMateriel(typeAssociationSiteMateriel);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationSiteMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_SITE_METEOROLOGIE: {
				TypeAssociationSiteMeteorologie typeAssociationSiteMeteorologie = (TypeAssociationSiteMeteorologie)theEObject;
				T result = caseTypeAssociationSiteMeteorologie(typeAssociationSiteMeteorologie);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationSiteMeteorologie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_SITE_OBJET_INCONNU: {
				TypeAssociationSiteObjetInconnu typeAssociationSiteObjetInconnu = (TypeAssociationSiteObjetInconnu)theEObject;
				T result = caseTypeAssociationSiteObjetInconnu(typeAssociationSiteObjetInconnu);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationSiteObjetInconnu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_SITE_SITE: {
				TypeAssociationSiteSite typeAssociationSiteSite = (TypeAssociationSiteSite)theEObject;
				T result = caseTypeAssociationSiteSite(typeAssociationSiteSite);
				if (result == null) result = caseTypeAssociationInstanceObjetInstanceObjet(typeAssociationSiteSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE: {
				TypeAssociationSiteTypeSite typeAssociationSiteTypeSite = (TypeAssociationSiteTypeSite)theEObject;
				T result = caseTypeAssociationSiteTypeSite(typeAssociationSiteTypeSite);
				if (result == null) result = caseTypeAssociationInstanceObjetType(typeAssociationSiteTypeSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC: {
				TypeAssociationSyntheseDetectionsEvenementNRBC typeAssociationSyntheseDetectionsEvenementNRBC = (TypeAssociationSyntheseDetectionsEvenementNRBC)theEObject;
				T result = caseTypeAssociationSyntheseDetectionsEvenementNRBC(typeAssociationSyntheseDetectionsEvenementNRBC);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationSyntheseDetectionsEvenementNRBC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE: {
				TypeAssociationTemporelleActivite typeAssociationTemporelleActivite = (TypeAssociationTemporelleActivite)theEObject;
				T result = caseTypeAssociationTemporelleActivite(typeAssociationTemporelleActivite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ: {
				TypeAssociationTraitementObjPlanTraitementObj typeAssociationTraitementObjPlanTraitementObj = (TypeAssociationTraitementObjPlanTraitementObj)theEObject;
				T result = caseTypeAssociationTraitementObjPlanTraitementObj(typeAssociationTraitementObjPlanTraitementObj);
				if (result == null) result = caseTypeAssociationFonctionnelleActivite(typeAssociationTraitementObjPlanTraitementObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_TYPE_CAPACITE: {
				TypeAssociationTypeCapacite typeAssociationTypeCapacite = (TypeAssociationTypeCapacite)theEObject;
				T result = caseTypeAssociationTypeCapacite(typeAssociationTypeCapacite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE: {
				TypeAssociationUniteAppuiFeuHelicoptere typeAssociationUniteAppuiFeuHelicoptere = (TypeAssociationUniteAppuiFeuHelicoptere)theEObject;
				T result = caseTypeAssociationUniteAppuiFeuHelicoptere(typeAssociationUniteAppuiFeuHelicoptere);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteAppuiFeuHelicoptere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_AUTRE_MISSION_LOG: {
				TypeAssociationUniteAutreMissionLog typeAssociationUniteAutreMissionLog = (TypeAssociationUniteAutreMissionLog)theEObject;
				T result = caseTypeAssociationUniteAutreMissionLog(typeAssociationUniteAutreMissionLog);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteAutreMissionLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON: {
				TypeAssociationUniteLivraison typeAssociationUniteLivraison = (TypeAssociationUniteLivraison)theEObject;
				T result = caseTypeAssociationUniteLivraison(typeAssociationUniteLivraison);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteLivraison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ACQ_ASS: {
				TypeAssociationUniteMissionAcqASS typeAssociationUniteMissionAcqASS = (TypeAssociationUniteMissionAcqASS)theEObject;
				T result = caseTypeAssociationUniteMissionAcqASS(typeAssociationUniteMissionAcqASS);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionAcqASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AERIENNE: {
				TypeAssociationUniteMissionAerienne typeAssociationUniteMissionAerienne = (TypeAssociationUniteMissionAerienne)theEObject;
				T result = caseTypeAssociationUniteMissionAerienne(typeAssociationUniteMissionAerienne);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR: {
				TypeAssociationUniteMissionAir typeAssociationUniteMissionAir = (TypeAssociationUniteMissionAir)theEObject;
				T result = caseTypeAssociationUniteMissionAir(typeAssociationUniteMissionAir);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionAir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE: {
				TypeAssociationUniteMissionALATattaque typeAssociationUniteMissionALATattaque = (TypeAssociationUniteMissionALATattaque)theEObject;
				T result = caseTypeAssociationUniteMissionALATattaque(typeAssociationUniteMissionALATattaque);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionALATattaque);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA: {
				TypeAssociationUniteMissionASA typeAssociationUniteMissionASA = (TypeAssociationUniteMissionASA)theEObject;
				T result = caseTypeAssociationUniteMissionASA(typeAssociationUniteMissionASA);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionASA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ESCORTE_AF: {
				TypeAssociationUniteMissionEscorteAF typeAssociationUniteMissionEscorteAF = (TypeAssociationUniteMissionEscorteAF)theEObject;
				T result = caseTypeAssociationUniteMissionEscorteAF(typeAssociationUniteMissionEscorteAF);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionEscorteAF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_GENIE: {
				TypeAssociationUniteMissionGenie typeAssociationUniteMissionGenie = (TypeAssociationUniteMissionGenie)theEObject;
				T result = caseTypeAssociationUniteMissionGenie(typeAssociationUniteMissionGenie);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE: {
				TypeAssociationUniteMissionMelee typeAssociationUniteMissionMelee = (TypeAssociationUniteMissionMelee)theEObject;
				T result = caseTypeAssociationUniteMissionMelee(typeAssociationUniteMissionMelee);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionMelee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_RENS_OBJ: {
				TypeAssociationUniteMissionRensObj typeAssociationUniteMissionRensObj = (TypeAssociationUniteMissionRensObj)theEObject;
				T result = caseTypeAssociationUniteMissionRensObj(typeAssociationUniteMissionRensObj);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionRensObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_SIC: {
				TypeAssociationUniteMissionSic typeAssociationUniteMissionSic = (TypeAssociationUniteMissionSic)theEObject;
				T result = caseTypeAssociationUniteMissionSic(typeAssociationUniteMissionSic);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionSic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_TRANSP_TACT: {
				TypeAssociationUniteMissionTranspTact typeAssociationUniteMissionTranspTact = (TypeAssociationUniteMissionTranspTact)theEObject;
				T result = caseTypeAssociationUniteMissionTranspTact(typeAssociationUniteMissionTranspTact);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionTranspTact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR: {
				TypeAssociationUniteMissionUniteAntichar typeAssociationUniteMissionUniteAntichar = (TypeAssociationUniteMissionUniteAntichar)theEObject;
				T result = caseTypeAssociationUniteMissionUniteAntichar(typeAssociationUniteMissionUniteAntichar);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMissionUniteAntichar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE: {
				TypeAssociationUniteMouvementParRoute typeAssociationUniteMouvementParRoute = (TypeAssociationUniteMouvementParRoute)theEObject;
				T result = caseTypeAssociationUniteMouvementParRoute(typeAssociationUniteMouvementParRoute);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteMouvementParRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_PLAN_FEUX: {
				TypeAssociationUnitePlanFeux typeAssociationUnitePlanFeux = (TypeAssociationUnitePlanFeux)theEObject;
				T result = caseTypeAssociationUnitePlanFeux(typeAssociationUnitePlanFeux);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUnitePlanFeux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_PLANIF_OPERATION3_D: {
				TypeAssociationUnitePlanifOperation3D typeAssociationUnitePlanifOperation3D = (TypeAssociationUnitePlanifOperation3D)theEObject;
				T result = caseTypeAssociationUnitePlanifOperation3D(typeAssociationUnitePlanifOperation3D);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUnitePlanifOperation3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX: {
				TypeAssociationUniteRenforcementsFeux typeAssociationUniteRenforcementsFeux = (TypeAssociationUniteRenforcementsFeux)theEObject;
				T result = caseTypeAssociationUniteRenforcementsFeux(typeAssociationUniteRenforcementsFeux);
				if (result == null) result = caseTypeAssociationInstanceObjetActivite(typeAssociationUniteRenforcementsFeux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION: {
				TypeAssocInstanceObjetLocalisation typeAssocInstanceObjetLocalisation = (TypeAssocInstanceObjetLocalisation)theEObject;
				T result = caseTypeAssocInstanceObjetLocalisation(typeAssocInstanceObjetLocalisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND: {
				TypeAssocListeObjCandListeObjCand typeAssocListeObjCandListeObjCand = (TypeAssocListeObjCandListeObjCand)theEObject;
				T result = caseTypeAssocListeObjCandListeObjCand(typeAssocListeObjCandListeObjCand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR: {
				TypeAssocPisteAtterDirAppAir typeAssocPisteAtterDirAppAir = (TypeAssocPisteAtterDirAppAir)theEObject;
				T result = caseTypeAssocPisteAtterDirAppAir(typeAssocPisteAtterDirAppAir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE: {
				TypeAssocSymboleTactique typeAssocSymboleTactique = (TypeAssocSymboleTactique)theEObject;
				T result = caseTypeAssocSymboleTactique(typeAssocSymboleTactique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ATMOSPHERE: {
				TypeAtmosphere typeAtmosphere = (TypeAtmosphere)theEObject;
				T result = caseTypeAtmosphere(typeAtmosphere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTONOMIE_MODULE: {
				TypeAutonomieModule typeAutonomieModule = (TypeAutonomieModule)theEObject;
				T result = caseTypeAutonomieModule(typeAutonomieModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTORISATION_LISTE_OBJECTIFS_CANDIDATS: {
				TypeAutorisationListeObjectifsCandidats typeAutorisationListeObjectifsCandidats = (TypeAutorisationListeObjectifsCandidats)theEObject;
				T result = caseTypeAutorisationListeObjectifsCandidats(typeAutorisationListeObjectifsCandidats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE: {
				TypeAutorisationObjectifCiblage typeAutorisationObjectifCiblage = (TypeAutorisationObjectifCiblage)theEObject;
				T result = caseTypeAutorisationObjectifCiblage(typeAutorisationObjectifCiblage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_ACTION: {
				TypeAutreAction typeAutreAction = (TypeAutreAction)theEObject;
				T result = caseTypeAutreAction(typeAutreAction);
				if (result == null) result = caseTypeAction(typeAutreAction);
				if (result == null) result = caseTypeActivite(typeAutreAction);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_ADRESSE: {
				TypeAutreAdresse typeAutreAdresse = (TypeAutreAdresse)theEObject;
				T result = caseTypeAutreAdresse(typeAutreAdresse);
				if (result == null) result = caseTypeAdresse(typeAutreAdresse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_AFFILIATION: {
				TypeAutreAffiliation typeAutreAffiliation = (TypeAutreAffiliation)theEObject;
				T result = caseTypeAutreAffiliation(typeAutreAffiliation);
				if (result == null) result = caseTypeAffiliation(typeAutreAffiliation);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreAffiliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_ARTICULATION: {
				TypeAutreArticulation typeAutreArticulation = (TypeAutreArticulation)theEObject;
				T result = caseTypeAutreArticulation(typeAutreArticulation);
				if (result == null) result = caseTypeArticulation(typeAutreArticulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_CAPTEUR_RENS: {
				TypeAutreCapteurRENS typeAutreCapteurRENS = (TypeAutreCapteurRENS)theEObject;
				T result = caseTypeAutreCapteurRENS(typeAutreCapteurRENS);
				if (result == null) result = caseTypeCapteurRENS(typeAutreCapteurRENS);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeAutreCapteurRENS);
				if (result == null) result = caseTypeInstanceObjet(typeAutreCapteurRENS);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreCapteurRENS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_CONTEXTE: {
				TypeAutreContexte typeAutreContexte = (TypeAutreContexte)theEObject;
				T result = caseTypeAutreContexte(typeAutreContexte);
				if (result == null) result = caseTypeContexte(typeAutreContexte);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreContexte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE: {
				TypeAutreDotationEffective typeAutreDotationEffective = (TypeAutreDotationEffective)theEObject;
				T result = caseTypeAutreDotationEffective(typeAutreDotationEffective);
				if (result == null) result = caseTypeDotationEffective(typeAutreDotationEffective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE: {
				TypeAutreElementControle typeAutreElementControle = (TypeAutreElementControle)theEObject;
				T result = caseTypeAutreElementControle(typeAutreElementControle);
				if (result == null) result = caseTypeElementControle(typeAutreElementControle);
				if (result == null) result = caseTypeInstanceObjet(typeAutreElementControle);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreElementControle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_EMPLOI: {
				TypeAutreEmploi typeAutreEmploi = (TypeAutreEmploi)theEObject;
				T result = caseTypeAutreEmploi(typeAutreEmploi);
				if (result == null) result = caseTypeEmploiRessourceActivite(typeAutreEmploi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_EVENEMENT: {
				TypeAutreEvenement typeAutreEvenement = (TypeAutreEvenement)theEObject;
				T result = caseTypeAutreEvenement(typeAutreEvenement);
				if (result == null) result = caseTypeEvenement(typeAutreEvenement);
				if (result == null) result = caseTypeActivite(typeAutreEvenement);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_EVENEMENT_NRBC: {
				TypeAutreEvenementNRBC typeAutreEvenementNRBC = (TypeAutreEvenementNRBC)theEObject;
				T result = caseTypeAutreEvenementNRBC(typeAutreEvenementNRBC);
				if (result == null) result = caseTypeEvenementNRBC(typeAutreEvenementNRBC);
				if (result == null) result = caseTypeEvenement(typeAutreEvenementNRBC);
				if (result == null) result = caseTypeActivite(typeAutreEvenementNRBC);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreEvenementNRBC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_EVENEMENT_NUCLEAIRE: {
				TypeAutreEvenementNucleaire typeAutreEvenementNucleaire = (TypeAutreEvenementNucleaire)theEObject;
				T result = caseTypeAutreEvenementNucleaire(typeAutreEvenementNucleaire);
				if (result == null) result = caseTypeEvenementNucleaire(typeAutreEvenementNucleaire);
				if (result == null) result = caseTypeEvenementRadioactif(typeAutreEvenementNucleaire);
				if (result == null) result = caseTypeEvenementNRBC(typeAutreEvenementNucleaire);
				if (result == null) result = caseTypeEvenement(typeAutreEvenementNucleaire);
				if (result == null) result = caseTypeActivite(typeAutreEvenementNucleaire);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreEvenementNucleaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_EVENEMENT_RADIOACTIF: {
				TypeAutreEvenementRadioactif typeAutreEvenementRadioactif = (TypeAutreEvenementRadioactif)theEObject;
				T result = caseTypeAutreEvenementRadioactif(typeAutreEvenementRadioactif);
				if (result == null) result = caseTypeEvenementRadioactif(typeAutreEvenementRadioactif);
				if (result == null) result = caseTypeEvenementNRBC(typeAutreEvenementRadioactif);
				if (result == null) result = caseTypeEvenement(typeAutreEvenementRadioactif);
				if (result == null) result = caseTypeActivite(typeAutreEvenementRadioactif);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreEvenementRadioactif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_LISTE_OBJECTIFS: {
				TypeAutreListeObjectifs typeAutreListeObjectifs = (TypeAutreListeObjectifs)theEObject;
				T result = caseTypeAutreListeObjectifs(typeAutreListeObjectifs);
				if (result == null) result = caseTypeListeObjectifs(typeAutreListeObjectifs);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreListeObjectifs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_MATERIEL: {
				TypeAutreMateriel typeAutreMateriel = (TypeAutreMateriel)theEObject;
				T result = caseTypeAutreMateriel(typeAutreMateriel);
				if (result == null) result = caseTypeMateriel(typeAutreMateriel);
				if (result == null) result = caseTypeInstanceObjet(typeAutreMateriel);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_MENACE: {
				TypeAutreMenace typeAutreMenace = (TypeAutreMenace)theEObject;
				T result = caseTypeAutreMenace(typeAutreMenace);
				if (result == null) result = caseTypeMenace(typeAutreMenace);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreMenace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_MISSION: {
				TypeAutreMission typeAutreMission = (TypeAutreMission)theEObject;
				T result = caseTypeAutreMission(typeAutreMission);
				if (result == null) result = caseTypeMission(typeAutreMission);
				if (result == null) result = caseTypeActivite(typeAutreMission);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreMission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_MISSION_ALAT: {
				TypeAutreMissionALAT typeAutreMissionALAT = (TypeAutreMissionALAT)theEObject;
				T result = caseTypeAutreMissionALAT(typeAutreMissionALAT);
				if (result == null) result = caseTypeMission(typeAutreMissionALAT);
				if (result == null) result = caseTypeActivite(typeAutreMissionALAT);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreMissionALAT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_MISSION_LOGISTIQUE: {
				TypeAutreMissionLogistique typeAutreMissionLogistique = (TypeAutreMissionLogistique)theEObject;
				T result = caseTypeAutreMissionLogistique(typeAutreMissionLogistique);
				if (result == null) result = caseTypeMissionLogistique(typeAutreMissionLogistique);
				if (result == null) result = caseTypeMission(typeAutreMissionLogistique);
				if (result == null) result = caseTypeActivite(typeAutreMissionLogistique);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreMissionLogistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_NOM: {
				TypeAutreNom typeAutreNom = (TypeAutreNom)theEObject;
				T result = caseTypeAutreNom(typeAutreNom);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreNom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_OBJECTIF_ACTIVITE_TYPE: {
				TypeAutreObjectifActiviteType typeAutreObjectifActiviteType = (TypeAutreObjectifActiviteType)theEObject;
				T result = caseTypeAutreObjectifActiviteType(typeAutreObjectifActiviteType);
				if (result == null) result = caseTypeObjectifActiviteType(typeAutreObjectifActiviteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_OBSTACLE: {
				TypeAutreObstacle typeAutreObstacle = (TypeAutreObstacle)theEObject;
				T result = caseTypeAutreObstacle(typeAutreObstacle);
				if (result == null) result = caseTypeObstacle(typeAutreObstacle);
				if (result == null) result = caseTypeSite(typeAutreObstacle);
				if (result == null) result = caseTypeInstanceObjet(typeAutreObstacle);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreObstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_PHENOMENE_METEOROLOGIQUE: {
				TypeAutrePhenomeneMeteorologique typeAutrePhenomeneMeteorologique = (TypeAutrePhenomeneMeteorologique)theEObject;
				T result = caseTypeAutrePhenomeneMeteorologique(typeAutrePhenomeneMeteorologique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_SEGMENT_ITINERAIRE: {
				TypeAutreSegmentItineraire typeAutreSegmentItineraire = (TypeAutreSegmentItineraire)theEObject;
				T result = caseTypeAutreSegmentItineraire(typeAutreSegmentItineraire);
				if (result == null) result = caseTypeSegmentItineraire(typeAutreSegmentItineraire);
				if (result == null) result = caseTypeElementControle(typeAutreSegmentItineraire);
				if (result == null) result = caseTypeInstanceObjet(typeAutreSegmentItineraire);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreSegmentItineraire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_SITE: {
				TypeAutreSite typeAutreSite = (TypeAutreSite)theEObject;
				T result = caseTypeAutreSite(typeAutreSite);
				if (result == null) result = caseTypeSite(typeAutreSite);
				if (result == null) result = caseTypeInstanceObjet(typeAutreSite);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_TYPE_BATIMENT: {
				TypeAutreTypeBatiment typeAutreTypeBatiment = (TypeAutreTypeBatiment)theEObject;
				T result = caseTypeAutreTypeBatiment(typeAutreTypeBatiment);
				if (result == null) result = caseTypeTypeBatiment(typeAutreTypeBatiment);
				if (result == null) result = caseTypeTypeEquipement(typeAutreTypeBatiment);
				if (result == null) result = caseTypeTypeMateriel(typeAutreTypeBatiment);
				if (result == null) result = caseTypeType(typeAutreTypeBatiment);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreTypeBatiment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_TYPE_CONSOMMABLE: {
				TypeAutreTypeConsommable typeAutreTypeConsommable = (TypeAutreTypeConsommable)theEObject;
				T result = caseTypeAutreTypeConsommable(typeAutreTypeConsommable);
				if (result == null) result = caseTypeTypeConsommable(typeAutreTypeConsommable);
				if (result == null) result = caseTypeTypeMateriel(typeAutreTypeConsommable);
				if (result == null) result = caseTypeType(typeAutreTypeConsommable);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreTypeConsommable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_TYPE_CONSOMMABLE_SYSTEME_ARME: {
				TypeAutreTypeConsommableSystemeArme typeAutreTypeConsommableSystemeArme = (TypeAutreTypeConsommableSystemeArme)theEObject;
				T result = caseTypeAutreTypeConsommableSystemeArme(typeAutreTypeConsommableSystemeArme);
				if (result == null) result = caseTypeTypeConsommableSystemeArme(typeAutreTypeConsommableSystemeArme);
				if (result == null) result = caseTypeTypeMateriel(typeAutreTypeConsommableSystemeArme);
				if (result == null) result = caseTypeType(typeAutreTypeConsommableSystemeArme);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreTypeConsommableSystemeArme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE: {
				TypeAutreTypeElementControle typeAutreTypeElementControle = (TypeAutreTypeElementControle)theEObject;
				T result = caseTypeAutreTypeElementControle(typeAutreTypeElementControle);
				if (result == null) result = caseTypeTypeElementControle(typeAutreTypeElementControle);
				if (result == null) result = caseTypeType(typeAutreTypeElementControle);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreTypeElementControle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_TYPE_ENTITE_ORGANISATIONNELLE: {
				TypeAutreTypeEntiteOrganisationnelle typeAutreTypeEntiteOrganisationnelle = (TypeAutreTypeEntiteOrganisationnelle)theEObject;
				T result = caseTypeAutreTypeEntiteOrganisationnelle(typeAutreTypeEntiteOrganisationnelle);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeAutreTypeEntiteOrganisationnelle);
				if (result == null) result = caseTypeType(typeAutreTypeEntiteOrganisationnelle);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreTypeEntiteOrganisationnelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT: {
				TypeAutreTypeEquipement typeAutreTypeEquipement = (TypeAutreTypeEquipement)theEObject;
				T result = caseTypeAutreTypeEquipement(typeAutreTypeEquipement);
				if (result == null) result = caseTypeTypeEquipement(typeAutreTypeEquipement);
				if (result == null) result = caseTypeTypeMateriel(typeAutreTypeEquipement);
				if (result == null) result = caseTypeType(typeAutreTypeEquipement);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreTypeEquipement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_TYPE_ORGANISATION_GOUVERNEMENTALE: {
				TypeAutreTypeOrganisationGouvernementale typeAutreTypeOrganisationGouvernementale = (TypeAutreTypeOrganisationGouvernementale)theEObject;
				T result = caseTypeAutreTypeOrganisationGouvernementale(typeAutreTypeOrganisationGouvernementale);
				if (result == null) result = caseTypeTypeOrganisationGouvernementale(typeAutreTypeOrganisationGouvernementale);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeAutreTypeOrganisationGouvernementale);
				if (result == null) result = caseTypeType(typeAutreTypeOrganisationGouvernementale);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreTypeOrganisationGouvernementale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE: {
				TypeAutreTypeSite typeAutreTypeSite = (TypeAutreTypeSite)theEObject;
				T result = caseTypeAutreTypeSite(typeAutreTypeSite);
				if (result == null) result = caseTypeTypeSite(typeAutreTypeSite);
				if (result == null) result = caseTypeType(typeAutreTypeSite);
				if (result == null) result = caseTypeRacineOperationnelle(typeAutreTypeSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE: {
				TypeAvancementTravailGenie typeAvancementTravailGenie = (TypeAvancementTravailGenie)theEObject;
				T result = caseTypeAvancementTravailGenie(typeAvancementTravailGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AXE: {
				TypeAxe typeAxe = (TypeAxe)theEObject;
				T result = caseTypeAxe(typeAxe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_AZIMUT: {
				TypeAzimut typeAzimut = (TypeAzimut)theEObject;
				T result = caseTypeAzimut(typeAzimut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE: {
				TypeBaseCalculNecessaire typeBaseCalculNecessaire = (TypeBaseCalculNecessaire)theEObject;
				T result = caseTypeBaseCalculNecessaire(typeBaseCalculNecessaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BASSIN: {
				TypeBassin typeBassin = (TypeBassin)theEObject;
				T result = caseTypeBassin(typeBassin);
				if (result == null) result = caseTypeSite(typeBassin);
				if (result == null) result = caseTypeInstanceObjet(typeBassin);
				if (result == null) result = caseTypeRacineOperationnelle(typeBassin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BATIMENT: {
				TypeBatiment typeBatiment = (TypeBatiment)theEObject;
				T result = caseTypeBatiment(typeBatiment);
				if (result == null) result = caseTypeMateriel(typeBatiment);
				if (result == null) result = caseTypeInstanceObjet(typeBatiment);
				if (result == null) result = caseTypeRacineOperationnelle(typeBatiment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT: {
				TypeBesoinEnCarburant typeBesoinEnCarburant = (TypeBesoinEnCarburant)theEObject;
				T result = caseTypeBesoinEnCarburant(typeBesoinEnCarburant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT: {
				TypeBesoinRaccordement typeBesoinRaccordement = (TypeBesoinRaccordement)theEObject;
				T result = caseTypeBesoinRaccordement(typeBesoinRaccordement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS: {
				TypeBesoinsEnRenseignements typeBesoinsEnRenseignements = (TypeBesoinsEnRenseignements)theEObject;
				T result = caseTypeBesoinsEnRenseignements(typeBesoinsEnRenseignements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BILAN_MODULE: {
				TypeBilanModule typeBilanModule = (TypeBilanModule)theEObject;
				T result = caseTypeBilanModule(typeBilanModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BILAN_TIRS_ASS: {
				TypeBilanTirsASS typeBilanTirsASS = (TypeBilanTirsASS)theEObject;
				T result = caseTypeBilanTirsASS(typeBilanTirsASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE: {
				TypeBilanTirsASSsurZone typeBilanTirsASSsurZone = (TypeBilanTirsASSsurZone)theEObject;
				T result = caseTypeBilanTirsASSsurZone(typeBilanTirsASSsurZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE: {
				TypeBlessesParPeriode typeBlessesParPeriode = (TypeBlessesParPeriode)theEObject;
				T result = caseTypeBlessesParPeriode(typeBlessesParPeriode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BRANCHE_EUROGRID: {
				TypeBrancheEurogrid typeBrancheEurogrid = (TypeBrancheEurogrid)theEObject;
				T result = caseTypeBrancheEurogrid(typeBrancheEurogrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION: {
				TypeBrancheNavigation typeBrancheNavigation = (TypeBrancheNavigation)theEObject;
				T result = caseTypeBrancheNavigation(typeBrancheNavigation);
				if (result == null) result = caseTypeElementControle(typeBrancheNavigation);
				if (result == null) result = caseTypeInstanceObjet(typeBrancheNavigation);
				if (result == null) result = caseTypeRacineOperationnelle(typeBrancheNavigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_BULLETIN_SONDAGE: {
				TypeBulletinSondage typeBulletinSondage = (TypeBulletinSondage)theEObject;
				T result = caseTypeBulletinSondage(typeBulletinSondage);
				if (result == null) result = caseTypeInstanceObjet(typeBulletinSondage);
				if (result == null) result = caseTypeRacineOperationnelle(typeBulletinSondage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CALE_LANCEMENT: {
				TypeCaleLancement typeCaleLancement = (TypeCaleLancement)theEObject;
				T result = caseTypeCaleLancement(typeCaleLancement);
				if (result == null) result = caseTypeSite(typeCaleLancement);
				if (result == null) result = caseTypeInstanceObjet(typeCaleLancement);
				if (result == null) result = caseTypeRacineOperationnelle(typeCaleLancement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CALENDRIER_COURRIER: {
				TypeCalendrierCourrier typeCalendrierCourrier = (TypeCalendrierCourrier)theEObject;
				T result = caseTypeCalendrierCourrier(typeCalendrierCourrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CALE_SECHE: {
				TypeCaleSeche typeCaleSeche = (TypeCaleSeche)theEObject;
				T result = caseTypeCaleSeche(typeCaleSeche);
				if (result == null) result = caseTypeSite(typeCaleSeche);
				if (result == null) result = caseTypeInstanceObjet(typeCaleSeche);
				if (result == null) result = caseTypeRacineOperationnelle(typeCaleSeche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAMP: {
				TypeCamp typeCamp = (TypeCamp)theEObject;
				T result = caseTypeCamp(typeCamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE: {
				TypeCapacite typeCapacite = (TypeCapacite)theEObject;
				T result = caseTypeCapacite(typeCapacite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_FEUX: {
				TypeCapaciteFeux typeCapaciteFeux = (TypeCapaciteFeux)theEObject;
				T result = caseTypeCapaciteFeux(typeCapaciteFeux);
				if (result == null) result = caseTypeCapacite(typeCapaciteFeux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_GENIE: {
				TypeCapaciteGenie typeCapaciteGenie = (TypeCapaciteGenie)theEObject;
				T result = caseTypeCapaciteGenie(typeCapaciteGenie);
				if (result == null) result = caseTypeCapacite(typeCapaciteGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT: {
				TypeCapaciteHebergement typeCapaciteHebergement = (TypeCapaciteHebergement)theEObject;
				T result = caseTypeCapaciteHebergement(typeCapaciteHebergement);
				if (result == null) result = caseTypeCapacite(typeCapaciteHebergement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE: {
				TypeCapaciteMaintenance typeCapaciteMaintenance = (TypeCapaciteMaintenance)theEObject;
				T result = caseTypeCapaciteMaintenance(typeCapaciteMaintenance);
				if (result == null) result = caseTypeCapacite(typeCapaciteMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION: {
				TypeCapaciteManutention typeCapaciteManutention = (TypeCapaciteManutention)theEObject;
				T result = caseTypeCapaciteManutention(typeCapaciteManutention);
				if (result == null) result = caseTypeCapacite(typeCapaciteManutention);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_MOBILITE: {
				TypeCapaciteMobilite typeCapaciteMobilite = (TypeCapaciteMobilite)theEObject;
				T result = caseTypeCapaciteMobilite(typeCapaciteMobilite);
				if (result == null) result = caseTypeCapacite(typeCapaciteMobilite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS: {
				TypeCapaciteObservationASS typeCapaciteObservationASS = (TypeCapaciteObservationASS)theEObject;
				T result = caseTypeCapaciteObservationASS(typeCapaciteObservationASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE: {
				TypeCapaciteOperationnelle typeCapaciteOperationnelle = (TypeCapaciteOperationnelle)theEObject;
				T result = caseTypeCapaciteOperationnelle(typeCapaciteOperationnelle);
				if (result == null) result = caseTypeCapacite(typeCapaciteOperationnelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_RESEAU: {
				TypeCapaciteReseau typeCapaciteReseau = (TypeCapaciteReseau)theEObject;
				T result = caseTypeCapaciteReseau(typeCapaciteReseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_SOUTIEN: {
				TypeCapaciteSoutien typeCapaciteSoutien = (TypeCapaciteSoutien)theEObject;
				T result = caseTypeCapaciteSoutien(typeCapaciteSoutien);
				if (result == null) result = caseTypeCapacite(typeCapaciteSoutien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE: {
				TypeCapaciteStockage typeCapaciteStockage = (TypeCapaciteStockage)theEObject;
				T result = caseTypeCapaciteStockage(typeCapaciteStockage);
				if (result == null) result = caseTypeCapacite(typeCapaciteStockage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_SURVEILLANCE: {
				TypeCapaciteSurveillance typeCapaciteSurveillance = (TypeCapaciteSurveillance)theEObject;
				T result = caseTypeCapaciteSurveillance(typeCapaciteSurveillance);
				if (result == null) result = caseTypeCapacite(typeCapaciteSurveillance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION: {
				TypeCapaciteTransmission typeCapaciteTransmission = (TypeCapaciteTransmission)theEObject;
				T result = caseTypeCapaciteTransmission(typeCapaciteTransmission);
				if (result == null) result = caseTypeCapacite(typeCapaciteTransmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPTEUR_DRONE: {
				TypeCapteurDrone typeCapteurDrone = (TypeCapteurDrone)theEObject;
				T result = caseTypeCapteurDrone(typeCapteurDrone);
				if (result == null) result = caseTypeCapteurRENS(typeCapteurDrone);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeCapteurDrone);
				if (result == null) result = caseTypeInstanceObjet(typeCapteurDrone);
				if (result == null) result = caseTypeRacineOperationnelle(typeCapteurDrone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE: {
				TypeCapteurLocalisationRadioelectrique typeCapteurLocalisationRadioelectrique = (TypeCapteurLocalisationRadioelectrique)theEObject;
				T result = caseTypeCapteurLocalisationRadioelectrique(typeCapteurLocalisationRadioelectrique);
				if (result == null) result = caseTypeCapteurRENS(typeCapteurLocalisationRadioelectrique);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeCapteurLocalisationRadioelectrique);
				if (result == null) result = caseTypeInstanceObjet(typeCapteurLocalisationRadioelectrique);
				if (result == null) result = caseTypeRacineOperationnelle(typeCapteurLocalisationRadioelectrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPTEUR_RADAR: {
				TypeCapteurRadar typeCapteurRadar = (TypeCapteurRadar)theEObject;
				T result = caseTypeCapteurRadar(typeCapteurRadar);
				if (result == null) result = caseTypeCapteurRENS(typeCapteurRadar);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeCapteurRadar);
				if (result == null) result = caseTypeInstanceObjet(typeCapteurRadar);
				if (result == null) result = caseTypeRacineOperationnelle(typeCapteurRadar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPTEUR_RENS: {
				TypeCapteurRENS typeCapteurRENS = (TypeCapteurRENS)theEObject;
				T result = caseTypeCapteurRENS(typeCapteurRENS);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeCapteurRENS);
				if (result == null) result = caseTypeInstanceObjet(typeCapteurRENS);
				if (result == null) result = caseTypeRacineOperationnelle(typeCapteurRENS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CAPTEUR_ROHUM: {
				TypeCapteurROHUM typeCapteurROHUM = (TypeCapteurROHUM)theEObject;
				T result = caseTypeCapteurROHUM(typeCapteurROHUM);
				if (result == null) result = caseTypeCapteurRENS(typeCapteurROHUM);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeCapteurROHUM);
				if (result == null) result = caseTypeInstanceObjet(typeCapteurROHUM);
				if (result == null) result = caseTypeRacineOperationnelle(typeCapteurROHUM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE: {
				TypeCaracteristiqueAutreSite typeCaracteristiqueAutreSite = (TypeCaracteristiqueAutreSite)theEObject;
				T result = caseTypeCaracteristiqueAutreSite(typeCaracteristiqueAutreSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE: {
				TypeCaracteristiqueComplementaireObstacle typeCaracteristiqueComplementaireObstacle = (TypeCaracteristiqueComplementaireObstacle)theEObject;
				T result = caseTypeCaracteristiqueComplementaireObstacle(typeCaracteristiqueComplementaireObstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARACTERISTIQUE_GROUPE_INDIVIDUS: {
				TypeCaracteristiqueGroupeIndividus typeCaracteristiqueGroupeIndividus = (TypeCaracteristiqueGroupeIndividus)theEObject;
				T result = caseTypeCaracteristiqueGroupeIndividus(typeCaracteristiqueGroupeIndividus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE: {
				TypeCaracteristiqueLogistique typeCaracteristiqueLogistique = (TypeCaracteristiqueLogistique)theEObject;
				T result = caseTypeCaracteristiqueLogistique(typeCaracteristiqueLogistique);
				if (result == null) result = caseTypeRacineOperationnelle(typeCaracteristiqueLogistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION: {
				TypeCaracteristiquesAssocInstanceObjetLocalisation typeCaracteristiquesAssocInstanceObjetLocalisation = (TypeCaracteristiquesAssocInstanceObjetLocalisation)theEObject;
				T result = caseTypeCaracteristiquesAssocInstanceObjetLocalisation(typeCaracteristiquesAssocInstanceObjetLocalisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT: {
				TypeCaracteristiquesMouvement typeCaracteristiquesMouvement = (TypeCaracteristiquesMouvement)theEObject;
				T result = caseTypeCaracteristiquesMouvement(typeCaracteristiquesMouvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO: {
				TypeCaracteristiquesSIO typeCaracteristiquesSIO = (TypeCaracteristiquesSIO)theEObject;
				T result = caseTypeCaracteristiquesSIO(typeCaracteristiquesSIO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT: {
				TypeCaracteristiqueTransport typeCaracteristiqueTransport = (TypeCaracteristiqueTransport)theEObject;
				T result = caseTypeCaracteristiqueTransport(typeCaracteristiqueTransport);
				if (result == null) result = caseTypeRacineOperationnelle(typeCaracteristiqueTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE: {
				TypeCaracteristiqueZoneContaminee typeCaracteristiqueZoneContaminee = (TypeCaracteristiqueZoneContaminee)theEObject;
				T result = caseTypeCaracteristiqueZoneContaminee(typeCaracteristiqueZoneContaminee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CARNET_POINTS: {
				TypeCarnetPoints typeCarnetPoints = (TypeCarnetPoints)theEObject;
				T result = caseTypeCarnetPoints(typeCarnetPoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CELLULE_SOUTIEN: {
				TypeCelluleSoutien typeCelluleSoutien = (TypeCelluleSoutien)theEObject;
				T result = caseTypeCelluleSoutien(typeCelluleSoutien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CENTRE_ASA: {
				TypeCentreASA typeCentreASA = (TypeCentreASA)theEObject;
				T result = caseTypeCentreASA(typeCentreASA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CENTRE_LLAPI: {
				TypeCentreLLAPI typeCentreLLAPI = (TypeCentreLLAPI)theEObject;
				T result = caseTypeCentreLLAPI(typeCentreLLAPI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CENTRE_NC23: {
				TypeCentreNC23 typeCentreNC23 = (TypeCentreNC23)theEObject;
				T result = caseTypeCentreNC23(typeCentreNC23);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE: {
				TypeCercleGeometrique typeCercleGeometrique = (TypeCercleGeometrique)theEObject;
				T result = caseTypeCercleGeometrique(typeCercleGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeCercleGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CHAMP_MINES: {
				TypeChampMines typeChampMines = (TypeChampMines)theEObject;
				T result = caseTypeChampMines(typeChampMines);
				if (result == null) result = caseTypeObstacle(typeChampMines);
				if (result == null) result = caseTypeSite(typeChampMines);
				if (result == null) result = caseTypeInstanceObjet(typeChampMines);
				if (result == null) result = caseTypeRacineOperationnelle(typeChampMines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME: {
				TypeChampMinesMaritime typeChampMinesMaritime = (TypeChampMinesMaritime)theEObject;
				T result = caseTypeChampMinesMaritime(typeChampMinesMaritime);
				if (result == null) result = caseTypeChampMines(typeChampMinesMaritime);
				if (result == null) result = caseTypeObstacle(typeChampMinesMaritime);
				if (result == null) result = caseTypeSite(typeChampMinesMaritime);
				if (result == null) result = caseTypeInstanceObjet(typeChampMinesMaritime);
				if (result == null) result = caseTypeRacineOperationnelle(typeChampMinesMaritime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES: {
				TypeChampMinesMaritimeDommagesEstimes typeChampMinesMaritimeDommagesEstimes = (TypeChampMinesMaritimeDommagesEstimes)theEObject;
				T result = caseTypeChampMinesMaritimeDommagesEstimes(typeChampMinesMaritimeDommagesEstimes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE: {
				TypeChampMinesTerrestre typeChampMinesTerrestre = (TypeChampMinesTerrestre)theEObject;
				T result = caseTypeChampMinesTerrestre(typeChampMinesTerrestre);
				if (result == null) result = caseTypeChampMines(typeChampMinesTerrestre);
				if (result == null) result = caseTypeObstacle(typeChampMinesTerrestre);
				if (result == null) result = caseTypeSite(typeChampMinesTerrestre);
				if (result == null) result = caseTypeInstanceObjet(typeChampMinesTerrestre);
				if (result == null) result = caseTypeRacineOperationnelle(typeChampMinesTerrestre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CHARGEMENT: {
				TypeChargement typeChargement = (TypeChargement)theEObject;
				T result = caseTypeChargement(typeChargement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL: {
				TypeChargementMateriel typeChargementMateriel = (TypeChargementMateriel)theEObject;
				T result = caseTypeChargementMateriel(typeChargementMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CHARNIER: {
				TypeCharnier typeCharnier = (TypeCharnier)theEObject;
				T result = caseTypeCharnier(typeCharnier);
				if (result == null) result = caseTypeSite(typeCharnier);
				if (result == null) result = caseTypeInstanceObjet(typeCharnier);
				if (result == null) result = caseTypeRacineOperationnelle(typeCharnier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CHEMIN_FER: {
				TypeCheminFer typeCheminFer = (TypeCheminFer)theEObject;
				T result = caseTypeCheminFer(typeCheminFer);
				if (result == null) result = caseTypeSite(typeCheminFer);
				if (result == null) result = caseTypeInstanceObjet(typeCheminFer);
				if (result == null) result = caseTypeRacineOperationnelle(typeCheminFer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE: {
				TypeCompetenceLinguistique typeCompetenceLinguistique = (TypeCompetenceLinguistique)theEObject;
				T result = caseTypeCompetenceLinguistique(typeCompetenceLinguistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COMPORTEMENT: {
				TypeComportement typeComportement = (TypeComportement)theEObject;
				T result = caseTypeComportement(typeComportement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS: {
				TypeComportementSecours typeComportementSecours = (TypeComportementSecours)theEObject;
				T result = caseTypeComportementSecours(typeComportementSecours);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COMPOSANTE_APPUI: {
				TypeComposanteAppui typeComposanteAppui = (TypeComposanteAppui)theEObject;
				T result = caseTypeComposanteAppui(typeComposanteAppui);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE: {
				TypeCompositionDotationTheoriqueEnType typeCompositionDotationTheoriqueEnType = (TypeCompositionDotationTheoriqueEnType)theEObject;
				T result = caseTypeCompositionDotationTheoriqueEnType(typeCompositionDotationTheoriqueEnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COMPTAGE: {
				TypeComptage typeComptage = (TypeComptage)theEObject;
				T result = caseTypeComptage(typeComptage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COMPTAGE_PAR_ACTIVITE: {
				TypeComptageParActivite typeComptageParActivite = (TypeComptageParActivite)theEObject;
				T result = caseTypeComptageParActivite(typeComptageParActivite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT: {
				TypeCompteRenduMouvement typeCompteRenduMouvement = (TypeCompteRenduMouvement)theEObject;
				T result = caseTypeCompteRenduMouvement(typeCompteRenduMouvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR: {
				TypeCompteRenduTir typeCompteRenduTir = (TypeCompteRenduTir)theEObject;
				T result = caseTypeCompteRenduTir(typeCompteRenduTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONDUITE_ATENIR: {
				TypeConduiteATenir typeConduiteATenir = (TypeConduiteATenir)theEObject;
				T result = caseTypeConduiteATenir(typeConduiteATenir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE: {
				TypeConeGeometrique typeConeGeometrique = (TypeConeGeometrique)theEObject;
				T result = caseTypeConeGeometrique(typeConeGeometrique);
				if (result == null) result = caseTypeVolumeGeometrique(typeConeGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONFIGURATION: {
				TypeConfiguration typeConfiguration = (TypeConfiguration)theEObject;
				T result = caseTypeConfiguration(typeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONFLIT3_D: {
				TypeConflit3D typeConflit3D = (TypeConflit3D)theEObject;
				T result = caseTypeConflit3D(typeConflit3D);
				if (result == null) result = caseTypeEvenement(typeConflit3D);
				if (result == null) result = caseTypeActivite(typeConflit3D);
				if (result == null) result = caseTypeRacineOperationnelle(typeConflit3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSIGNE: {
				TypeConsigne typeConsigne = (TypeConsigne)theEObject;
				T result = caseTypeConsigne(typeConsigne);
				if (result == null) result = caseTypeRacineOperationnelle(typeConsigne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE: {
				TypeConsigneGeographique typeConsigneGeographique = (TypeConsigneGeographique)theEObject;
				T result = caseTypeConsigneGeographique(typeConsigneGeographique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA: {
				TypeConsigneLutteAntiaerienneTTA typeConsigneLutteAntiaerienneTTA = (TypeConsigneLutteAntiaerienneTTA)theEObject;
				T result = caseTypeConsigneLutteAntiaerienneTTA(typeConsigneLutteAntiaerienneTTA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE: {
				TypeConsigneParticuliere typeConsigneParticuliere = (TypeConsigneParticuliere)theEObject;
				T result = caseTypeConsigneParticuliere(typeConsigneParticuliere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA: {
				TypeConsignesGeneralesTirASA typeConsignesGeneralesTirASA = (TypeConsignesGeneralesTirASA)theEObject;
				T result = caseTypeConsignesGeneralesTirASA(typeConsignesGeneralesTirASA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSIGNE_TIR: {
				TypeConsigneTir typeConsigneTir = (TypeConsigneTir)theEObject;
				T result = caseTypeConsigneTir(typeConsigneTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE: {
				TypeConsommableSante typeConsommableSante = (TypeConsommableSante)theEObject;
				T result = caseTypeConsommableSante(typeConsommableSante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE: {
				TypeConsommationAutorisee typeConsommationAutorisee = (TypeConsommationAutorisee)theEObject;
				T result = caseTypeConsommationAutorisee(typeConsommationAutorisee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS: {
				TypeConsommationEnMunitions typeConsommationEnMunitions = (TypeConsommationEnMunitions)theEObject;
				T result = caseTypeConsommationEnMunitions(typeConsommationEnMunitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS: {
				TypeConsommationExplosifs typeConsommationExplosifs = (TypeConsommationExplosifs)theEObject;
				T result = caseTypeConsommationExplosifs(typeConsommationExplosifs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSOMMATION_MINES: {
				TypeConsommationMines typeConsommationMines = (TypeConsommationMines)theEObject;
				T result = caseTypeConsommationMines(typeConsommationMines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSTAT_DESTRUCTION: {
				TypeConstatDestruction typeConstatDestruction = (TypeConstatDestruction)theEObject;
				T result = caseTypeConstatDestruction(typeConstatDestruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSTAT_FORCE: {
				TypeConstatForce typeConstatForce = (TypeConstatForce)theEObject;
				T result = caseTypeConstatForce(typeConstatForce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSTAT_POPULATION: {
				TypeConstatPopulation typeConstatPopulation = (TypeConstatPopulation)theEObject;
				T result = caseTypeConstatPopulation(typeConstatPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONSTAT_TERRAIN: {
				TypeConstatTerrain typeConstatTerrain = (TypeConstatTerrain)theEObject;
				T result = caseTypeConstatTerrain(typeConstatTerrain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE: {
				TypeContenuParagraphePlanOuOrdre typeContenuParagraphePlanOuOrdre = (TypeContenuParagraphePlanOuOrdre)theEObject;
				T result = caseTypeContenuParagraphePlanOuOrdre(typeContenuParagraphePlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONTENU_TEXTUEL: {
				TypeContenuTextuel typeContenuTextuel = (TypeContenuTextuel)theEObject;
				T result = caseTypeContenuTextuel(typeContenuTextuel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONTEXTE: {
				TypeContexte typeContexte = (TypeContexte)theEObject;
				T result = caseTypeContexte(typeContexte);
				if (result == null) result = caseTypeRacineOperationnelle(typeContexte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT: {
				TypeContraintesMouvement typeContraintesMouvement = (TypeContraintesMouvement)theEObject;
				T result = caseTypeContraintesMouvement(typeContraintesMouvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CONVOI: {
				TypeConvoi typeConvoi = (TypeConvoi)theEObject;
				T result = caseTypeConvoi(typeConvoi);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeConvoi);
				if (result == null) result = caseTypeInstanceObjet(typeConvoi);
				if (result == null) result = caseTypeRacineOperationnelle(typeConvoi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COORDINATION4_D: {
				TypeCoordination4D typeCoordination4D = (TypeCoordination4D)theEObject;
				T result = caseTypeCoordination4D(typeCoordination4D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG: {
				TypeCoordonneesLatLong typeCoordonneesLatLong = (TypeCoordonneesLatLong)theEObject;
				T result = caseTypeCoordonneesLatLong(typeCoordonneesLatLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE: {
				TypeCorridorGeometrique typeCorridorGeometrique = (TypeCorridorGeometrique)theEObject;
				T result = caseTypeCorridorGeometrique(typeCorridorGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeCorridorGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE: {
				TypeCouvertureAerienne typeCouvertureAerienne = (TypeCouvertureAerienne)theEObject;
				T result = caseTypeCouvertureAerienne(typeCouvertureAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COUVERTURE_ASA: {
				TypeCouvertureASA typeCouvertureASA = (TypeCouvertureASA)theEObject;
				T result = caseTypeCouvertureASA(typeCouvertureASA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE: {
				TypeCouvertureNuageuse typeCouvertureNuageuse = (TypeCouvertureNuageuse)theEObject;
				T result = caseTypeCouvertureNuageuse(typeCouvertureNuageuse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CRACTIVITE_ASS: {
				TypeCRactiviteASS typeCRactiviteASS = (TypeCRactiviteASS)theEObject;
				T result = caseTypeCRactiviteASS(typeCRactiviteASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CREVALUATION_DEGATS: {
				TypeCRevaluationDegats typeCRevaluationDegats = (TypeCRevaluationDegats)theEObject;
				T result = caseTypeCRevaluationDegats(typeCRevaluationDegats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION: {
				TypeCRfinMissionAcquisition typeCRfinMissionAcquisition = (TypeCRfinMissionAcquisition)theEObject;
				T result = caseTypeCRfinMissionAcquisition(typeCRfinMissionAcquisition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CR_INCIDENT: {
				TypeCrIncident typeCrIncident = (TypeCrIncident)theEObject;
				T result = caseTypeCrIncident(typeCrIncident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION: {
				TypeCriteresIdentification typeCriteresIdentification = (TypeCriteresIdentification)theEObject;
				T result = caseTypeCriteresIdentification(typeCriteresIdentification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN: {
				TypeCRmouvementAerien typeCRmouvementAerien = (TypeCRmouvementAerien)theEObject;
				T result = caseTypeCRmouvementAerien(typeCRmouvementAerien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CRPLAN_FEUX: {
				TypeCRplanFeux typeCRplanFeux = (TypeCRplanFeux)theEObject;
				T result = caseTypeCRplanFeux(typeCRplanFeux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CR_RECONNAISSANCE: {
				TypeCrReconnaissance typeCrReconnaissance = (TypeCrReconnaissance)theEObject;
				T result = caseTypeCrReconnaissance(typeCrReconnaissance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF: {
				TypeCRrenseignementObjectif typeCRrenseignementObjectif = (TypeCRrenseignementObjectif)theEObject;
				T result = caseTypeCRrenseignementObjectif(typeCRrenseignementObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF: {
				TypeCRtraitementObjectif typeCRtraitementObjectif = (TypeCRtraitementObjectif)theEObject;
				T result = caseTypeCRtraitementObjectif(typeCRtraitementObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE: {
				TypeCylindreGeometrique typeCylindreGeometrique = (TypeCylindreGeometrique)theEObject;
				T result = caseTypeCylindreGeometrique(typeCylindreGeometrique);
				if (result == null) result = caseTypeVolumeGeometrique(typeCylindreGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DATATION: {
				TypeDatation typeDatation = (TypeDatation)theEObject;
				T result = caseTypeDatation(typeDatation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR: {
				TypeDeclenchementTir typeDeclenchementTir = (TypeDeclenchementTir)theEObject;
				T result = caseTypeDeclenchementTir(typeDeclenchementTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEFENSE_ACCOMPAGNEMENT: {
				TypeDefenseAccompagnement typeDefenseAccompagnement = (TypeDefenseAccompagnement)theEObject;
				T result = caseTypeDefenseAccompagnement(typeDefenseAccompagnement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE: {
				TypeDefenseAuProfitUnite typeDefenseAuProfitUnite = (TypeDefenseAuProfitUnite)theEObject;
				T result = caseTypeDefenseAuProfitUnite(typeDefenseAuProfitUnite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION: {
				TypeDegreClassification typeDegreClassification = (TypeDegreClassification)theEObject;
				T result = caseTypeDegreClassification(typeDegreClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF: {
				TypeDemandeEngagementObjectif typeDemandeEngagementObjectif = (TypeDemandeEngagementObjectif)theEObject;
				T result = caseTypeDemandeEngagementObjectif(typeDemandeEngagementObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEMANDE_TIR: {
				TypeDemandeTir typeDemandeTir = (TypeDemandeTir)theEObject;
				T result = caseTypeDemandeTir(typeDemandeTir);
				if (result == null) result = caseTypeActivite(typeDemandeTir);
				if (result == null) result = caseTypeRacineOperationnelle(typeDemandeTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION: {
				TypeDepannageEvacuation typeDepannageEvacuation = (TypeDepannageEvacuation)theEObject;
				T result = caseTypeDepannageEvacuation(typeDepannageEvacuation);
				if (result == null) result = caseTypeActivite(typeDepannageEvacuation);
				if (result == null) result = caseTypeRacineOperationnelle(typeDepannageEvacuation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE: {
				TypeDeplacementPersonne typeDeplacementPersonne = (TypeDeplacementPersonne)theEObject;
				T result = caseTypeDeplacementPersonne(typeDeplacementPersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEPLOIEMENT: {
				TypeDeploiement typeDeploiement = (TypeDeploiement)theEObject;
				T result = caseTypeDeploiement(typeDeploiement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA: {
				TypeDeploiementMARTHA typeDeploiementMARTHA = (TypeDeploiementMARTHA)theEObject;
				T result = caseTypeDeploiementMARTHA(typeDeploiementMARTHA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D: {
				TypeDeploiementMoyensASAc3d typeDeploiementMoyensASAc3d = (TypeDeploiementMoyensASAc3d)theEObject;
				T result = caseTypeDeploiementMoyensASAc3d(typeDeploiementMoyensASAc3d);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DEPOT_ACREER: {
				TypeDepotACreer typeDepotACreer = (TypeDepotACreer)theEObject;
				T result = caseTypeDepotACreer(typeDepotACreer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DESCRIPTION_PERSONNE: {
				TypeDescriptionPersonne typeDescriptionPersonne = (TypeDescriptionPersonne)theEObject;
				T result = caseTypeDescriptionPersonne(typeDescriptionPersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI: {
				TypeDesignationUniteOuEquipementENI typeDesignationUniteOuEquipementENI = (TypeDesignationUniteOuEquipementENI)theEObject;
				T result = caseTypeDesignationUniteOuEquipementENI(typeDesignationUniteOuEquipementENI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE: {
				TypeDestinatairePlanOuOrdre typeDestinatairePlanOuOrdre = (TypeDestinatairePlanOuOrdre)theEObject;
				T result = caseTypeDestinatairePlanOuOrdre(typeDestinatairePlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE: {
				TypeDetachementIdentifie typeDetachementIdentifie = (TypeDetachementIdentifie)theEObject;
				T result = caseTypeDetachementIdentifie(typeDetachementIdentifie);
				if (result == null) result = caseTypePrelevementDetachement(typeDetachementIdentifie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE: {
				TypeDetachementNonIdentifie typeDetachementNonIdentifie = (TypeDetachementNonIdentifie)theEObject;
				T result = caseTypeDetachementNonIdentifie(typeDetachementNonIdentifie);
				if (result == null) result = caseTypePrelevementDetachement(typeDetachementNonIdentifie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DETAIL_EVENEMENT: {
				TypeDetailEvenement typeDetailEvenement = (TypeDetailEvenement)theEObject;
				T result = caseTypeDetailEvenement(typeDetailEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DIRECTION_APPROCHE_AIR: {
				TypeDirectionApprocheAir typeDirectionApprocheAir = (TypeDirectionApprocheAir)theEObject;
				T result = caseTypeDirectionApprocheAir(typeDirectionApprocheAir);
				if (result == null) result = caseTypeElementControle(typeDirectionApprocheAir);
				if (result == null) result = caseTypeInstanceObjet(typeDirectionApprocheAir);
				if (result == null) result = caseTypeRacineOperationnelle(typeDirectionApprocheAir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA: {
				TypeDirectiveEMCONpourUniteASA typeDirectiveEMCONpourUniteASA = (TypeDirectiveEMCONpourUniteASA)theEObject;
				T result = caseTypeDirectiveEMCONpourUniteASA(typeDirectiveEMCONpourUniteASA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DIRECTIVES_WEZ: {
				TypeDirectivesWEZ typeDirectivesWEZ = (TypeDirectivesWEZ)theEObject;
				T result = caseTypeDirectivesWEZ(typeDirectivesWEZ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DIRECTIVE_TIR: {
				TypeDirectiveTir typeDirectiveTir = (TypeDirectiveTir)theEObject;
				T result = caseTypeDirectiveTir(typeDirectiveTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX: {
				TypeDisponibilitePourPlanFeux typeDisponibilitePourPlanFeux = (TypeDisponibilitePourPlanFeux)theEObject;
				T result = caseTypeDisponibilitePourPlanFeux(typeDisponibilitePourPlanFeux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE: {
				TypeDistanceVerticaleGeometrique typeDistanceVerticaleGeometrique = (TypeDistanceVerticaleGeometrique)theEObject;
				T result = caseTypeDistanceVerticaleGeometrique(typeDistanceVerticaleGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOCUMENT: {
				TypeDocument typeDocument = (TypeDocument)theEObject;
				T result = caseTypeDocument(typeDocument);
				if (result == null) result = caseTypeRacineOperationnelle(typeDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE: {
				TypeDocumentIdentificationPersonne typeDocumentIdentificationPersonne = (TypeDocumentIdentificationPersonne)theEObject;
				T result = caseTypeDocumentIdentificationPersonne(typeDocumentIdentificationPersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE: {
				TypeDomaineActiviteCentre typeDomaineActiviteCentre = (TypeDomaineActiviteCentre)theEObject;
				T result = caseTypeDomaineActiviteCentre(typeDomaineActiviteCentre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE: {
				TypeDoseRadiationAbsorbe typeDoseRadiationAbsorbe = (TypeDoseRadiationAbsorbe)theEObject;
				T result = caseTypeDoseRadiationAbsorbe(typeDoseRadiationAbsorbe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE: {
				TypeDotationEffective typeDotationEffective = (TypeDotationEffective)theEObject;
				T result = caseTypeDotationEffective(typeDotationEffective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE: {
				TypeDotationEffectiveConsommable typeDotationEffectiveConsommable = (TypeDotationEffectiveConsommable)theEObject;
				T result = caseTypeDotationEffectiveConsommable(typeDotationEffectiveConsommable);
				if (result == null) result = caseTypeDotationEffective(typeDotationEffectiveConsommable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF: {
				TypeDotationEffectiveEffectif typeDotationEffectiveEffectif = (TypeDotationEffectiveEffectif)theEObject;
				T result = caseTypeDotationEffectiveEffectif(typeDotationEffectiveEffectif);
				if (result == null) result = caseTypeDotationEffective(typeDotationEffectiveEffectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT: {
				TypeDotationEffectiveEquipement typeDotationEffectiveEquipement = (TypeDotationEffectiveEquipement)theEObject;
				T result = caseTypeDotationEffectiveEquipement(typeDotationEffectiveEquipement);
				if (result == null) result = caseTypeDotationEffective(typeDotationEffectiveEquipement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOTATION_THEORIQUE: {
				TypeDotationTheorique typeDotationTheorique = (TypeDotationTheorique)theEObject;
				T result = caseTypeDotationTheorique(typeDotationTheorique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET: {
				TypeDotationTheoriqueInstanceObjet typeDotationTheoriqueInstanceObjet = (TypeDotationTheoriqueInstanceObjet)theEObject;
				T result = caseTypeDotationTheoriqueInstanceObjet(typeDotationTheoriqueInstanceObjet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_DUREE_INTERVENTION: {
				TypeDureeIntervention typeDureeIntervention = (TypeDureeIntervention)theEObject;
				T result = caseTypeDureeIntervention(typeDureeIntervention);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ECHELON: {
				TypeEchelon typeEchelon = (TypeEchelon)theEObject;
				T result = caseTypeEchelon(typeEchelon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE: {
				TypeEffectifNecessaire typeEffectifNecessaire = (TypeEffectifNecessaire)theEObject;
				T result = caseTypeEffectifNecessaire(typeEffectifNecessaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE: {
				TypeEffectifOuEnginAffecte typeEffectifOuEnginAffecte = (TypeEffectifOuEnginAffecte)theEObject;
				T result = caseTypeEffectifOuEnginAffecte(typeEffectifOuEnginAffecte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFET: {
				TypeEffet typeEffet = (TypeEffet)theEObject;
				T result = caseTypeEffet(typeEffet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS: {
				TypeEffetAuContactASS typeEffetAuContactASS = (TypeEffetAuContactASS)theEObject;
				T result = caseTypeEffetAuContactASS(typeEffetAuContactASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFET_CONSTATE: {
				TypeEffetConstate typeEffetConstate = (TypeEffetConstate)theEObject;
				T result = caseTypeEffetConstate(typeEffetConstate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFET_PROFONDEUR_ASS: {
				TypeEffetProfondeurASS typeEffetProfondeurASS = (TypeEffetProfondeurASS)theEObject;
				T result = caseTypeEffetProfondeurASS(typeEffetProfondeurASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET: {
				TypeEffetSurInstanceObjet typeEffetSurInstanceObjet = (TypeEffetSurInstanceObjet)theEObject;
				T result = caseTypeEffetSurInstanceObjet(typeEffetSurInstanceObjet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFET_SUR_TYPE: {
				TypeEffetSurType typeEffetSurType = (TypeEffetSurType)theEObject;
				T result = caseTypeEffetSurType(typeEffetSurType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE: {
				TypeEffetTactiqueRecherche typeEffetTactiqueRecherche = (TypeEffetTactiqueRecherche)theEObject;
				T result = caseTypeEffetTactiqueRecherche(typeEffetTactiqueRecherche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI: {
				TypeEffetTactiqueRechercheParENI typeEffetTactiqueRechercheParENI = (TypeEffetTactiqueRechercheParENI)theEObject;
				T result = caseTypeEffetTactiqueRechercheParENI(typeEffetTactiqueRechercheParENI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE: {
				TypeEfficaciteProbabiliste typeEfficaciteProbabiliste = (TypeEfficaciteProbabiliste)theEObject;
				T result = caseTypeEfficaciteProbabiliste(typeEfficaciteProbabiliste);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ELEMENT_CONTEXTE: {
				TypeElementContexte typeElementContexte = (TypeElementContexte)theEObject;
				T result = caseTypeElementContexte(typeElementContexte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ELEMENT_CONTROLE: {
				TypeElementControle typeElementControle = (TypeElementControle)theEObject;
				T result = caseTypeElementControle(typeElementControle);
				if (result == null) result = caseTypeInstanceObjet(typeElementControle);
				if (result == null) result = caseTypeRacineOperationnelle(typeElementControle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION: {
				TypeElementCRintermediaireAcquisition typeElementCRintermediaireAcquisition = (TypeElementCRintermediaireAcquisition)theEObject;
				T result = caseTypeElementCRintermediaireAcquisition(typeElementCRintermediaireAcquisition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ELEMENT_METEO: {
				TypeElementMeteo typeElementMeteo = (TypeElementMeteo)theEObject;
				T result = caseTypeElementMeteo(typeElementMeteo);
				if (result == null) result = caseTypeInstanceObjet(typeElementMeteo);
				if (result == null) result = caseTypeRacineOperationnelle(typeElementMeteo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE: {
				TypeElementParticulierADefendre typeElementParticulierADefendre = (TypeElementParticulierADefendre)theEObject;
				T result = caseTypeElementParticulierADefendre(typeElementParticulierADefendre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE: {
				TypeElementTopographie typeElementTopographie = (TypeElementTopographie)theEObject;
				T result = caseTypeElementTopographie(typeElementTopographie);
				if (result == null) result = caseTypeInstanceObjet(typeElementTopographie);
				if (result == null) result = caseTypeRacineOperationnelle(typeElementTopographie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ELEMENT_VITAL: {
				TypeElementVital typeElementVital = (TypeElementVital)theEObject;
				T result = caseTypeElementVital(typeElementVital);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE: {
				TypeEllipseGeometrique typeEllipseGeometrique = (TypeEllipseGeometrique)theEObject;
				T result = caseTypeEllipseGeometrique(typeEllipseGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeEllipseGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EMPLOI: {
				TypeEmploi typeEmploi = (TypeEmploi)theEObject;
				T result = caseTypeEmploi(typeEmploi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EMPLOI_AERONEF: {
				TypeEmploiAeronef typeEmploiAeronef = (TypeEmploiAeronef)theEObject;
				T result = caseTypeEmploiAeronef(typeEmploiAeronef);
				if (result == null) result = caseTypeEmploiRessourceActivite(typeEmploiAeronef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE: {
				TypeEmploiFrequence typeEmploiFrequence = (TypeEmploiFrequence)theEObject;
				T result = caseTypeEmploiFrequence(typeEmploiFrequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EMPLOI_GUERRE_ELECTRONIQUE: {
				TypeEmploiGuerreElectronique typeEmploiGuerreElectronique = (TypeEmploiGuerreElectronique)theEObject;
				T result = caseTypeEmploiGuerreElectronique(typeEmploiGuerreElectronique);
				if (result == null) result = caseTypeEmploiRessourceActivite(typeEmploiGuerreElectronique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EMPLOI_MARITIME: {
				TypeEmploiMaritime typeEmploiMaritime = (TypeEmploiMaritime)theEObject;
				T result = caseTypeEmploiMaritime(typeEmploiMaritime);
				if (result == null) result = caseTypeEmploiRessourceActivite(typeEmploiMaritime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE: {
				TypeEmploiReconnaissance typeEmploiReconnaissance = (TypeEmploiReconnaissance)theEObject;
				T result = caseTypeEmploiReconnaissance(typeEmploiReconnaissance);
				if (result == null) result = caseTypeEmploiRessourceActivite(typeEmploiReconnaissance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE: {
				TypeEmploiRessourceActivite typeEmploiRessourceActivite = (TypeEmploiRessourceActivite)theEObject;
				T result = caseTypeEmploiRessourceActivite(typeEmploiRessourceActivite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION: {
				TypeEngagementAvecDelegation typeEngagementAvecDelegation = (TypeEngagementAvecDelegation)theEObject;
				T result = caseTypeEngagementAvecDelegation(typeEngagementAvecDelegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ENNEMI_FUTUR: {
				TypeEnnemiFutur typeEnnemiFutur = (TypeEnnemiFutur)theEObject;
				T result = caseTypeEnnemiFutur(typeEnnemiFutur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE: {
				TypeEnTeteParagraphePlanOuOrdre typeEnTeteParagraphePlanOuOrdre = (TypeEnTeteParagraphePlanOuOrdre)theEObject;
				T result = caseTypeEnTeteParagraphePlanOuOrdre(typeEnTeteParagraphePlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE: {
				TypeEntetePlanOuOrdre typeEntetePlanOuOrdre = (TypeEntetePlanOuOrdre)theEObject;
				T result = caseTypeEntetePlanOuOrdre(typeEntetePlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE: {
				TypeEntiteOrganisationnelle typeEntiteOrganisationnelle = (TypeEntiteOrganisationnelle)theEObject;
				T result = caseTypeEntiteOrganisationnelle(typeEntiteOrganisationnelle);
				if (result == null) result = caseTypeInstanceObjet(typeEntiteOrganisationnelle);
				if (result == null) result = caseTypeRacineOperationnelle(typeEntiteOrganisationnelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ENTITE_POLITIQUE: {
				TypeEntitePolitique typeEntitePolitique = (TypeEntitePolitique)theEObject;
				T result = caseTypeEntitePolitique(typeEntitePolitique);
				if (result == null) result = caseTypeAffiliation(typeEntitePolitique);
				if (result == null) result = caseTypeRacineOperationnelle(typeEntitePolitique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION: {
				TypeEnvironnementTerrainEtVegetation typeEnvironnementTerrainEtVegetation = (TypeEnvironnementTerrainEtVegetation)theEObject;
				T result = caseTypeEnvironnementTerrainEtVegetation(typeEnvironnementTerrainEtVegetation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EQUIPEMENT_HELICOPTERE: {
				TypeEquipementHelicoptere typeEquipementHelicoptere = (TypeEquipementHelicoptere)theEObject;
				T result = caseTypeEquipementHelicoptere(typeEquipementHelicoptere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE: {
				TypeEquipementOuRessourceEnQuantite typeEquipementOuRessourceEnQuantite = (TypeEquipementOuRessourceEnQuantite)theEObject;
				T result = caseTypeEquipementOuRessourceEnQuantite(typeEquipementOuRessourceEnQuantite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EQUIPES_REPARATION: {
				TypeEquipesReparation typeEquipesReparation = (TypeEquipesReparation)theEObject;
				T result = caseTypeEquipesReparation(typeEquipesReparation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ESSIEU: {
				TypeEssieu typeEssieu = (TypeEssieu)theEObject;
				T result = caseTypeEssieu(typeEssieu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_ACTION: {
				TypeEtatAction typeEtatAction = (TypeEtatAction)theEObject;
				T result = caseTypeEtatAction(typeEtatAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA: {
				TypeEtatAlerteUniteASA typeEtatAlerteUniteASA = (TypeEtatAlerteUniteASA)theEObject;
				T result = caseTypeEtatAlerteUniteASA(typeEtatAlerteUniteASA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_ASSOCIATION: {
				TypeEtatAssociation typeEtatAssociation = (TypeEtatAssociation)theEObject;
				T result = caseTypeEtatAssociation(typeEtatAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_CIVIL: {
				TypeEtatCivil typeEtatCivil = (TypeEtatCivil)theEObject;
				T result = caseTypeEtatCivil(typeEtatCivil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE: {
				TypeEtatElementContexte typeEtatElementContexte = (TypeEtatElementContexte)theEObject;
				T result = caseTypeEtatElementContexte(typeEtatElementContexte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_EVENEMENT: {
				TypeEtatEvenement typeEtatEvenement = (TypeEtatEvenement)theEObject;
				T result = caseTypeEtatEvenement(typeEtatEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_LIAISON: {
				TypeEtatLiaison typeEtatLiaison = (TypeEtatLiaison)theEObject;
				T result = caseTypeEtatLiaison(typeEtatLiaison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL: {
				TypeEtatOperationnel typeEtatOperationnel = (TypeEtatOperationnel)theEObject;
				T result = caseTypeEtatOperationnel(typeEtatOperationnel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME: {
				TypeEtatOperationnelAerodrome typeEtatOperationnelAerodrome = (TypeEtatOperationnelAerodrome)theEObject;
				T result = caseTypeEtatOperationnelAerodrome(typeEtatOperationnelAerodrome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME: {
				TypeEtatOperationnelChampMinesMaritime typeEtatOperationnelChampMinesMaritime = (TypeEtatOperationnelChampMinesMaritime)theEObject;
				T result = caseTypeEtatOperationnelChampMinesMaritime(typeEtatOperationnelChampMinesMaritime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE: {
				TypeEtatOperationnelElementControle typeEtatOperationnelElementControle = (TypeEtatOperationnelElementControle)theEObject;
				T result = caseTypeEtatOperationnelElementControle(typeEtatOperationnelElementControle);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelElementControle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE: {
				TypeEtatOperationnelElementTopographie typeEtatOperationnelElementTopographie = (TypeEtatOperationnelElementTopographie)theEObject;
				T result = caseTypeEtatOperationnelElementTopographie(typeEtatOperationnelElementTopographie);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelElementTopographie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE: {
				TypeEtatOperationnelElementTopographieFluide typeEtatOperationnelElementTopographieFluide = (TypeEtatOperationnelElementTopographieFluide)theEObject;
				T result = caseTypeEtatOperationnelElementTopographieFluide(typeEtatOperationnelElementTopographieFluide);
				if (result == null) result = caseTypeEtatOperationnelElementTopographie(typeEtatOperationnelElementTopographieFluide);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelElementTopographieFluide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE: {
				TypeEtatOperationnelElementTopographieLiquide typeEtatOperationnelElementTopographieLiquide = (TypeEtatOperationnelElementTopographieLiquide)theEObject;
				T result = caseTypeEtatOperationnelElementTopographieLiquide(typeEtatOperationnelElementTopographieLiquide);
				if (result == null) result = caseTypeEtatOperationnelElementTopographie(typeEtatOperationnelElementTopographieLiquide);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelElementTopographieLiquide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE: {
				TypeEtatOperationnelElementTopographieSolide typeEtatOperationnelElementTopographieSolide = (TypeEtatOperationnelElementTopographieSolide)theEObject;
				T result = caseTypeEtatOperationnelElementTopographieSolide(typeEtatOperationnelElementTopographieSolide);
				if (result == null) result = caseTypeEtatOperationnelElementTopographie(typeEtatOperationnelElementTopographieSolide);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelElementTopographieSolide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE: {
				TypeEtatOperationnelEntiteOrganisationnelle typeEtatOperationnelEntiteOrganisationnelle = (TypeEtatOperationnelEntiteOrganisationnelle)theEObject;
				T result = caseTypeEtatOperationnelEntiteOrganisationnelle(typeEtatOperationnelEntiteOrganisationnelle);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelEntiteOrganisationnelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL: {
				TypeEtatOperationnelMateriel typeEtatOperationnelMateriel = (TypeEtatOperationnelMateriel)theEObject;
				T result = caseTypeEtatOperationnelMateriel(typeEtatOperationnelMateriel);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL: {
				TypeEtatOperationnelMedical typeEtatOperationnelMedical = (TypeEtatOperationnelMedical)theEObject;
				T result = caseTypeEtatOperationnelMedical(typeEtatOperationnelMedical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE: {
				TypeEtatOperationnelMine typeEtatOperationnelMine = (TypeEtatOperationnelMine)theEObject;
				T result = caseTypeEtatOperationnelMine(typeEtatOperationnelMine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_OBJET_INCONNU: {
				TypeEtatOperationnelObjetInconnu typeEtatOperationnelObjetInconnu = (TypeEtatOperationnelObjetInconnu)theEObject;
				T result = caseTypeEtatOperationnelObjetInconnu(typeEtatOperationnelObjetInconnu);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelObjetInconnu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL: {
				TypeEtatOperationnelPersonnel typeEtatOperationnelPersonnel = (TypeEtatOperationnelPersonnel)theEObject;
				T result = caseTypeEtatOperationnelPersonnel(typeEtatOperationnelPersonnel);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelPersonnel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE: {
				TypeEtatOperationnelSite typeEtatOperationnelSite = (TypeEtatOperationnelSite)theEObject;
				T result = caseTypeEtatOperationnelSite(typeEtatOperationnelSite);
				if (result == null) result = caseTypeEtatOperationnel(typeEtatOperationnelSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO: {
				TypeEtatOperationnelUXO typeEtatOperationnelUXO = (TypeEtatOperationnelUXO)theEObject;
				T result = caseTypeEtatOperationnelUXO(typeEtatOperationnelUXO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_ORDRE: {
				TypeEtatOrdre typeEtatOrdre = (TypeEtatOrdre)theEObject;
				T result = caseTypeEtatOrdre(typeEtatOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_PLAN: {
				TypeEtatPlan typeEtatPlan = (TypeEtatPlan)theEObject;
				T result = caseTypeEtatPlan(typeEtatPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT: {
				TypeEtatRegleEngagement typeEtatRegleEngagement = (TypeEtatRegleEngagement)theEObject;
				T result = caseTypeEtatRegleEngagement(typeEtatRegleEngagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_SERVICE_RESEAU: {
				TypeEtatServiceReseau typeEtatServiceReseau = (TypeEtatServiceReseau)theEObject;
				T result = caseTypeEtatServiceReseau(typeEtatServiceReseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETAT_SIC: {
				TypeEtatSic typeEtatSic = (TypeEtatSic)theEObject;
				T result = caseTypeEtatSic(typeEtatSic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ETUDE_DISPERSION: {
				TypeEtudeDispersion typeEtudeDispersion = (TypeEtudeDispersion)theEObject;
				T result = caseTypeEtudeDispersion(typeEtudeDispersion);
				if (result == null) result = caseTypeActivite(typeEtudeDispersion);
				if (result == null) result = caseTypeRacineOperationnelle(typeEtudeDispersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVACUATION_PATIENTS: {
				TypeEvacuationPatients typeEvacuationPatients = (TypeEvacuationPatients)theEObject;
				T result = caseTypeEvacuationPatients(typeEvacuationPatients);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE: {
				TypeEvacuationSanitaire typeEvacuationSanitaire = (TypeEvacuationSanitaire)theEObject;
				T result = caseTypeEvacuationSanitaire(typeEvacuationSanitaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVACUATIONS_PAR_PERIODE: {
				TypeEvacuationsParPeriode typeEvacuationsParPeriode = (TypeEvacuationsParPeriode)theEObject;
				T result = caseTypeEvacuationsParPeriode(typeEvacuationsParPeriode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVALUATION: {
				TypeEvaluation typeEvaluation = (TypeEvaluation)theEObject;
				T result = caseTypeEvaluation(typeEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVENEMENT: {
				TypeEvenement typeEvenement = (TypeEvenement)theEObject;
				T result = caseTypeEvenement(typeEvenement);
				if (result == null) result = caseTypeActivite(typeEvenement);
				if (result == null) result = caseTypeRacineOperationnelle(typeEvenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVENEMENT4_D: {
				TypeEvenement4D typeEvenement4D = (TypeEvenement4D)theEObject;
				T result = caseTypeEvenement4D(typeEvenement4D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE: {
				TypeEvenementArmeNucleaire typeEvenementArmeNucleaire = (TypeEvenementArmeNucleaire)theEObject;
				T result = caseTypeEvenementArmeNucleaire(typeEvenementArmeNucleaire);
				if (result == null) result = caseTypeEvenementNucleaire(typeEvenementArmeNucleaire);
				if (result == null) result = caseTypeEvenementRadioactif(typeEvenementArmeNucleaire);
				if (result == null) result = caseTypeEvenementNRBC(typeEvenementArmeNucleaire);
				if (result == null) result = caseTypeEvenement(typeEvenementArmeNucleaire);
				if (result == null) result = caseTypeActivite(typeEvenementArmeNucleaire);
				if (result == null) result = caseTypeRacineOperationnelle(typeEvenementArmeNucleaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE: {
				TypeEvenementChimiqueEtBiologique typeEvenementChimiqueEtBiologique = (TypeEvenementChimiqueEtBiologique)theEObject;
				T result = caseTypeEvenementChimiqueEtBiologique(typeEvenementChimiqueEtBiologique);
				if (result == null) result = caseTypeEvenementNRBC(typeEvenementChimiqueEtBiologique);
				if (result == null) result = caseTypeEvenement(typeEvenementChimiqueEtBiologique);
				if (result == null) result = caseTypeActivite(typeEvenementChimiqueEtBiologique);
				if (result == null) result = caseTypeRacineOperationnelle(typeEvenementChimiqueEtBiologique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVENEMENT_NRBC: {
				TypeEvenementNRBC typeEvenementNRBC = (TypeEvenementNRBC)theEObject;
				T result = caseTypeEvenementNRBC(typeEvenementNRBC);
				if (result == null) result = caseTypeEvenement(typeEvenementNRBC);
				if (result == null) result = caseTypeActivite(typeEvenementNRBC);
				if (result == null) result = caseTypeRacineOperationnelle(typeEvenementNRBC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVENEMENT_NUCLEAIRE: {
				TypeEvenementNucleaire typeEvenementNucleaire = (TypeEvenementNucleaire)theEObject;
				T result = caseTypeEvenementNucleaire(typeEvenementNucleaire);
				if (result == null) result = caseTypeEvenementRadioactif(typeEvenementNucleaire);
				if (result == null) result = caseTypeEvenementNRBC(typeEvenementNucleaire);
				if (result == null) result = caseTypeEvenement(typeEvenementNucleaire);
				if (result == null) result = caseTypeActivite(typeEvenementNucleaire);
				if (result == null) result = caseTypeRacineOperationnelle(typeEvenementNucleaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVENEMENT_RADIOACTIF: {
				TypeEvenementRadioactif typeEvenementRadioactif = (TypeEvenementRadioactif)theEObject;
				T result = caseTypeEvenementRadioactif(typeEvenementRadioactif);
				if (result == null) result = caseTypeEvenementNRBC(typeEvenementRadioactif);
				if (result == null) result = caseTypeEvenement(typeEvenementRadioactif);
				if (result == null) result = caseTypeActivite(typeEvenementRadioactif);
				if (result == null) result = caseTypeRacineOperationnelle(typeEvenementRadioactif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVENEMENT_RADIOLOGIQUE: {
				TypeEvenementRadiologique typeEvenementRadiologique = (TypeEvenementRadiologique)theEObject;
				T result = caseTypeEvenementRadiologique(typeEvenementRadiologique);
				if (result == null) result = caseTypeEvenementRadioactif(typeEvenementRadiologique);
				if (result == null) result = caseTypeEvenementNRBC(typeEvenementRadiologique);
				if (result == null) result = caseTypeEvenement(typeEvenementRadiologique);
				if (result == null) result = caseTypeActivite(typeEvenementRadiologique);
				if (result == null) result = caseTypeRacineOperationnelle(typeEvenementRadiologique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_EVENEMENT_RENS: {
				TypeEvenementRENS typeEvenementRENS = (TypeEvenementRENS)theEObject;
				T result = caseTypeEvenementRENS(typeEvenementRENS);
				if (result == null) result = caseTypeEvenement(typeEvenementRENS);
				if (result == null) result = caseTypeActivite(typeEvenementRENS);
				if (result == null) result = caseTypeRacineOperationnelle(typeEvenementRENS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT: {
				TypeFaitRenseignement typeFaitRenseignement = (TypeFaitRenseignement)theEObject;
				T result = caseTypeFaitRenseignement(typeFaitRenseignement);
				if (result == null) result = caseTypeRacineOperationnelle(typeFaitRenseignement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_FIN_INTERDICTION: {
				TypeFinInterdiction typeFinInterdiction = (TypeFinInterdiction)theEObject;
				T result = caseTypeFinInterdiction(typeFinInterdiction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_FONCTION_PERSONNE: {
				TypeFonctionPersonne typeFonctionPersonne = (TypeFonctionPersonne)theEObject;
				T result = caseTypeFonctionPersonne(typeFonctionPersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_FREQUENCE: {
				TypeFrequence typeFrequence = (TypeFrequence)theEObject;
				T result = caseTypeFrequence(typeFrequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_GABARIT_PORTEE: {
				TypeGabaritPortee typeGabaritPortee = (TypeGabaritPortee)theEObject;
				T result = caseTypeGabaritPortee(typeGabaritPortee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_GIVRAGE: {
				TypeGivrage typeGivrage = (TypeGivrage)theEObject;
				T result = caseTypeGivrage(typeGivrage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_GROUPE_ETHNIQUE: {
				TypeGroupeEthnique typeGroupeEthnique = (TypeGroupeEthnique)theEObject;
				T result = caseTypeGroupeEthnique(typeGroupeEthnique);
				if (result == null) result = caseTypeAffiliation(typeGroupeEthnique);
				if (result == null) result = caseTypeRacineOperationnelle(typeGroupeEthnique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_GROUPE_FONCTIONNEL: {
				TypeGroupeFonctionnel typeGroupeFonctionnel = (TypeGroupeFonctionnel)theEObject;
				T result = caseTypeGroupeFonctionnel(typeGroupeFonctionnel);
				if (result == null) result = caseTypeAffiliation(typeGroupeFonctionnel);
				if (result == null) result = caseTypeRacineOperationnelle(typeGroupeFonctionnel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS: {
				TypeGroupeIndividus typeGroupeIndividus = (TypeGroupeIndividus)theEObject;
				T result = caseTypeGroupeIndividus(typeGroupeIndividus);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeGroupeIndividus);
				if (result == null) result = caseTypeInstanceObjet(typeGroupeIndividus);
				if (result == null) result = caseTypeRacineOperationnelle(typeGroupeIndividus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES: {
				TypeGroupeInformationsOperationnelles typeGroupeInformationsOperationnelles = (TypeGroupeInformationsOperationnelles)theEObject;
				T result = caseTypeGroupeInformationsOperationnelles(typeGroupeInformationsOperationnelles);
				if (result == null) result = caseTypeContexte(typeGroupeInformationsOperationnelles);
				if (result == null) result = caseTypeRacineOperationnelle(typeGroupeInformationsOperationnelles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_GROUPEMENT: {
				TypeGroupement typeGroupement = (TypeGroupement)theEObject;
				T result = caseTypeGroupement(typeGroupement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE: {
				TypeHippodromeGeometrique typeHippodromeGeometrique = (TypeHippodromeGeometrique)theEObject;
				T result = caseTypeHippodromeGeometrique(typeHippodromeGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeHippodromeGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE: {
				TypeHoraireManoeuvre typeHoraireManoeuvre = (TypeHoraireManoeuvre)theEObject;
				T result = caseTypeHoraireManoeuvre(typeHoraireManoeuvre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_HYPOTHESE_ACTION_EN_IOU_AUTRE: {
				TypeHypotheseActionENIouAutre typeHypotheseActionENIouAutre = (TypeHypotheseActionENIouAutre)theEObject;
				T result = caseTypeHypotheseActionENIouAutre(typeHypotheseActionENIouAutre);
				if (result == null) result = caseTypeRacineOperationnelle(typeHypotheseActionENIouAutre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT: {
				TypeIncidentMouvement typeIncidentMouvement = (TypeIncidentMouvement)theEObject;
				T result = caseTypeIncidentMouvement(typeIncidentMouvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE: {
				TypeIndicateurGeostatistique typeIndicateurGeostatistique = (TypeIndicateurGeostatistique)theEObject;
				T result = caseTypeIndicateurGeostatistique(typeIndicateurGeostatistique);
				if (result == null) result = caseTypeRacineOperationnelle(typeIndicateurGeostatistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_INFRASTRUCTURE: {
				TypeInfrastructure typeInfrastructure = (TypeInfrastructure)theEObject;
				T result = caseTypeInfrastructure(typeInfrastructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_INSTANCE_OBJET: {
				TypeInstanceObjet typeInstanceObjet = (TypeInstanceObjet)theEObject;
				T result = caseTypeInstanceObjet(typeInstanceObjet);
				if (result == null) result = caseTypeRacineOperationnelle(typeInstanceObjet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION: {
				TypeInstructionCoordination typeInstructionCoordination = (TypeInstructionCoordination)theEObject;
				T result = caseTypeInstructionCoordination(typeInstructionCoordination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_INTERDICTION_TIR: {
				TypeInterdictionTir typeInterdictionTir = (TypeInterdictionTir)theEObject;
				T result = caseTypeInterdictionTir(typeInterdictionTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_INTERVENTION_GENERALE: {
				TypeInterventionGenerale typeInterventionGenerale = (TypeInterventionGenerale)theEObject;
				T result = caseTypeInterventionGenerale(typeInterventionGenerale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_INTERVENTION_TYPE: {
				TypeInterventionType typeInterventionType = (TypeInterventionType)theEObject;
				T result = caseTypeInterventionType(typeInterventionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ITINERAIRE: {
				TypeItineraire typeItineraire = (TypeItineraire)theEObject;
				T result = caseTypeItineraire(typeItineraire);
				if (result == null) result = caseTypeElementControle(typeItineraire);
				if (result == null) result = caseTypeInstanceObjet(typeItineraire);
				if (result == null) result = caseTypeRacineOperationnelle(typeItineraire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT: {
				TypeItineraireFranchissementOuContournement typeItineraireFranchissementOuContournement = (TypeItineraireFranchissementOuContournement)theEObject;
				T result = caseTypeItineraireFranchissementOuContournement(typeItineraireFranchissementOuContournement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT: {
				TypeItineraireOuModeleCheminementALAT typeItineraireOuModeleCheminementALAT = (TypeItineraireOuModeleCheminementALAT)theEObject;
				T result = caseTypeItineraireOuModeleCheminementALAT(typeItineraireOuModeleCheminementALAT);
				if (result == null) result = caseTypeElementControle(typeItineraireOuModeleCheminementALAT);
				if (result == null) result = caseTypeInstanceObjet(typeItineraireOuModeleCheminementALAT);
				if (result == null) result = caseTypeRacineOperationnelle(typeItineraireOuModeleCheminementALAT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_JALON: {
				TypeJalon typeJalon = (TypeJalon)theEObject;
				T result = caseTypeJalon(typeJalon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_JETEE: {
				TypeJetee typeJetee = (TypeJetee)theEObject;
				T result = caseTypeJetee(typeJetee);
				if (result == null) result = caseTypeSite(typeJetee);
				if (result == null) result = caseTypeInstanceObjet(typeJetee);
				if (result == null) result = caseTypeRacineOperationnelle(typeJetee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_JONCTION_RESEAU: {
				TypeJonctionReseau typeJonctionReseau = (TypeJonctionReseau)theEObject;
				T result = caseTypeJonctionReseau(typeJonctionReseau);
				if (result == null) result = caseTypeRacineOperationnelle(typeJonctionReseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LANGUE: {
				TypeLangue typeLangue = (TypeLangue)theEObject;
				T result = caseTypeLangue(typeLangue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LIAISON: {
				TypeLiaison typeLiaison = (TypeLiaison)theEObject;
				T result = caseTypeLiaison(typeLiaison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE: {
				TypeLiaisonPhysique typeLiaisonPhysique = (TypeLiaisonPhysique)theEObject;
				T result = caseTypeLiaisonPhysique(typeLiaisonPhysique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LIAISON_RESEAU: {
				TypeLiaisonReseau typeLiaisonReseau = (TypeLiaisonReseau)theEObject;
				T result = caseTypeLiaisonReseau(typeLiaisonReseau);
				if (result == null) result = caseTypeRacineOperationnelle(typeLiaisonReseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LIGNE_GEOMETRIQUE: {
				TypeLigneGeometrique typeLigneGeometrique = (TypeLigneGeometrique)theEObject;
				T result = caseTypeLigneGeometrique(typeLigneGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeLigneGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LIGNE_LIVRAISON: {
				TypeLigneLivraison typeLigneLivraison = (TypeLigneLivraison)theEObject;
				T result = caseTypeLigneLivraison(typeLigneLivraison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LIGNE_RECHANGE: {
				TypeLigneRechange typeLigneRechange = (TypeLigneRechange)theEObject;
				T result = caseTypeLigneRechange(typeLigneRechange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LIMITE: {
				TypeLimite typeLimite = (TypeLimite)theEObject;
				T result = caseTypeLimite(typeLimite);
				if (result == null) result = caseTypeElementControle(typeLimite);
				if (result == null) result = caseTypeInstanceObjet(typeLimite);
				if (result == null) result = caseTypeRacineOperationnelle(typeLimite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D: {
				TypeListeMesuresCoordination3D typeListeMesuresCoordination3D = (TypeListeMesuresCoordination3D)theEObject;
				T result = caseTypeListeMesuresCoordination3D(typeListeMesuresCoordination3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LISTE_OBJECTIFS: {
				TypeListeObjectifs typeListeObjectifs = (TypeListeObjectifs)theEObject;
				T result = caseTypeListeObjectifs(typeListeObjectifs);
				if (result == null) result = caseTypeRacineOperationnelle(typeListeObjectifs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS: {
				TypeListeObjectifsCandidats typeListeObjectifsCandidats = (TypeListeObjectifsCandidats)theEObject;
				T result = caseTypeListeObjectifsCandidats(typeListeObjectifsCandidats);
				if (result == null) result = caseTypeListeObjectifs(typeListeObjectifsCandidats);
				if (result == null) result = caseTypeRacineOperationnelle(typeListeObjectifsCandidats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES: {
				TypeListeObjectifsPlanifies typeListeObjectifsPlanifies = (TypeListeObjectifsPlanifies)theEObject;
				T result = caseTypeListeObjectifsPlanifies(typeListeObjectifsPlanifies);
				if (result == null) result = caseTypeListeObjectifs(typeListeObjectifsPlanifies);
				if (result == null) result = caseTypeRacineOperationnelle(typeListeObjectifsPlanifies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LIVRAISON: {
				TypeLivraison typeLivraison = (TypeLivraison)theEObject;
				T result = caseTypeLivraison(typeLivraison);
				if (result == null) result = caseTypeActivite(typeLivraison);
				if (result == null) result = caseTypeRacineOperationnelle(typeLivraison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LOCALISATION: {
				TypeLocalisation typeLocalisation = (TypeLocalisation)theEObject;
				T result = caseTypeLocalisation(typeLocalisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE: {
				TypeLocalisationGeometrique typeLocalisationGeometrique = (TypeLocalisationGeometrique)theEObject;
				T result = caseTypeLocalisationGeometrique(typeLocalisationGeometrique);
				if (result == null) result = caseTypeLocalisation(typeLocalisationGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D: {
				TypeLocalisationGeometrique2D typeLocalisationGeometrique2D = (TypeLocalisationGeometrique2D)theEObject;
				T result = caseTypeLocalisationGeometrique2D(typeLocalisationGeometrique2D);
				if (result == null) result = caseTypeLocalisationGeometrique(typeLocalisationGeometrique2D);
				if (result == null) result = caseTypeLocalisation(typeLocalisationGeometrique2D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D: {
				TypeLocalisationGeometrique3D typeLocalisationGeometrique3D = (TypeLocalisationGeometrique3D)theEObject;
				T result = caseTypeLocalisationGeometrique3D(typeLocalisationGeometrique3D);
				if (result == null) result = caseTypeLocalisationGeometrique(typeLocalisationGeometrique3D);
				if (result == null) result = caseTypeLocalisation(typeLocalisationGeometrique3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LOCALISATION_INDEFINIE: {
				TypeLocalisationIndefinie typeLocalisationIndefinie = (TypeLocalisationIndefinie)theEObject;
				T result = caseTypeLocalisationIndefinie(typeLocalisationIndefinie);
				if (result == null) result = caseTypeLocalisation(typeLocalisationIndefinie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF: {
				TypeLocalisationObjectif typeLocalisationObjectif = (TypeLocalisationObjectif)theEObject;
				T result = caseTypeLocalisationObjectif(typeLocalisationObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_LUMIERE: {
				TypeLumiere typeLumiere = (TypeLumiere)theEObject;
				T result = caseTypeLumiere(typeLumiere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER: {
				TypeManutentionAEffectuer typeManutentionAEffectuer = (TypeManutentionAEffectuer)theEObject;
				T result = caseTypeManutentionAEffectuer(typeManutentionAEffectuer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF: {
				TypeMarquageObjectif typeMarquageObjectif = (TypeMarquageObjectif)theEObject;
				T result = caseTypeMarquageObjectif(typeMarquageObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MATERIEL: {
				TypeMateriel typeMateriel = (TypeMateriel)theEObject;
				T result = caseTypeMateriel(typeMateriel);
				if (result == null) result = caseTypeInstanceObjet(typeMateriel);
				if (result == null) result = caseTypeRacineOperationnelle(typeMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MEMENTO_GENIE: {
				TypeMementoGenie typeMementoGenie = (TypeMementoGenie)theEObject;
				T result = caseTypeMementoGenie(typeMementoGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MENACE: {
				TypeMenace typeMenace = (TypeMenace)theEObject;
				T result = caseTypeMenace(typeMenace);
				if (result == null) result = caseTypeRacineOperationnelle(typeMenace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MENACE_AERIENNE: {
				TypeMenaceAerienne typeMenaceAerienne = (TypeMenaceAerienne)theEObject;
				T result = caseTypeMenaceAerienne(typeMenaceAerienne);
				if (result == null) result = caseTypeMenace(typeMenaceAerienne);
				if (result == null) result = caseTypeRacineOperationnelle(typeMenaceAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MENACE_AS_AENI: {
				TypeMenaceASAeni typeMenaceASAeni = (TypeMenaceASAeni)theEObject;
				T result = caseTypeMenaceASAeni(typeMenaceASAeni);
				if (result == null) result = caseTypeMenace(typeMenaceASAeni);
				if (result == null) result = caseTypeRacineOperationnelle(typeMenaceASAeni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MENACE_DETECTION: {
				TypeMenaceDetection typeMenaceDetection = (TypeMenaceDetection)theEObject;
				T result = caseTypeMenaceDetection(typeMenaceDetection);
				if (result == null) result = caseTypeMenace(typeMenaceDetection);
				if (result == null) result = caseTypeRacineOperationnelle(typeMenaceDetection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MENACE_FEUX_ENI: {
				TypeMenaceFeuxENI typeMenaceFeuxENI = (TypeMenaceFeuxENI)theEObject;
				T result = caseTypeMenaceFeuxENI(typeMenaceFeuxENI);
				if (result == null) result = caseTypeMenace(typeMenaceFeuxENI);
				if (result == null) result = caseTypeRacineOperationnelle(typeMenaceFeuxENI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MENACE_GENIE_ENI: {
				TypeMenaceGenieENI typeMenaceGenieENI = (TypeMenaceGenieENI)theEObject;
				T result = caseTypeMenaceGenieENI(typeMenaceGenieENI);
				if (result == null) result = caseTypeMenace(typeMenaceGenieENI);
				if (result == null) result = caseTypeRacineOperationnelle(typeMenaceGenieENI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE: {
				TypeMenacePrioritaire typeMenacePrioritaire = (TypeMenacePrioritaire)theEObject;
				T result = caseTypeMenacePrioritaire(typeMenacePrioritaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT: {
				TypeMenacesAeriennesMissionALAT typeMenacesAeriennesMissionALAT = (TypeMenacesAeriennesMissionALAT)theEObject;
				T result = caseTypeMenacesAeriennesMissionALAT(typeMenacesAeriennesMissionALAT);
				if (result == null) result = caseTypeMenace(typeMenacesAeriennesMissionALAT);
				if (result == null) result = caseTypeRacineOperationnelle(typeMenacesAeriennesMissionALAT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MESURE_COORDINATION: {
				TypeMesureCoordination typeMesureCoordination = (TypeMesureCoordination)theEObject;
				T result = caseTypeMesureCoordination(typeMesureCoordination);
				if (result == null) result = caseTypeElementControle(typeMesureCoordination);
				if (result == null) result = caseTypeInstanceObjet(typeMesureCoordination);
				if (result == null) result = caseTypeRacineOperationnelle(typeMesureCoordination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MESURE_NUAGE: {
				TypeMesureNuage typeMesureNuage = (TypeMesureNuage)theEObject;
				T result = caseTypeMesureNuage(typeMesureNuage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE: {
				TypeMesuresProtectionElectronique typeMesuresProtectionElectronique = (TypeMesuresProtectionElectronique)theEObject;
				T result = caseTypeMesuresProtectionElectronique(typeMesuresProtectionElectronique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MINE_EXPLOSIF: {
				TypeMineExplosif typeMineExplosif = (TypeMineExplosif)theEObject;
				T result = caseTypeMineExplosif(typeMineExplosif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE: {
				TypeMiseEnOeuvreROE typeMiseEnOeuvreROE = (TypeMiseEnOeuvreROE)theEObject;
				T result = caseTypeMiseEnOeuvreROE(typeMiseEnOeuvreROE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISE_EN_PLACE: {
				TypeMiseEnPlace typeMiseEnPlace = (TypeMiseEnPlace)theEObject;
				T result = caseTypeMiseEnPlace(typeMiseEnPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISE_EN_PLACE_TIR: {
				TypeMiseEnPlaceTir typeMiseEnPlaceTir = (TypeMiseEnPlaceTir)theEObject;
				T result = caseTypeMiseEnPlaceTir(typeMiseEnPlaceTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION: {
				TypeMission typeMission = (TypeMission)theEObject;
				T result = caseTypeMission(typeMission);
				if (result == null) result = caseTypeActivite(typeMission);
				if (result == null) result = caseTypeRacineOperationnelle(typeMission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS: {
				TypeMissionAcquisitionASS typeMissionAcquisitionASS = (TypeMissionAcquisitionASS)theEObject;
				T result = caseTypeMissionAcquisitionASS(typeMissionAcquisitionASS);
				if (result == null) result = caseTypeMission(typeMissionAcquisitionASS);
				if (result == null) result = caseTypeActivite(typeMissionAcquisitionASS);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionAcquisitionASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_AERIENNE: {
				TypeMissionAerienne typeMissionAerienne = (TypeMissionAerienne)theEObject;
				T result = caseTypeMissionAerienne(typeMissionAerienne);
				if (result == null) result = caseTypeMission(typeMissionAerienne);
				if (result == null) result = caseTypeActivite(typeMissionAerienne);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_AIR: {
				TypeMissionAir typeMissionAir = (TypeMissionAir)theEObject;
				T result = caseTypeMissionAir(typeMissionAir);
				if (result == null) result = caseTypeMission(typeMissionAir);
				if (result == null) result = caseTypeActivite(typeMissionAir);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionAir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE: {
				TypeMissionALATattaque typeMissionALATattaque = (TypeMissionALATattaque)theEObject;
				T result = caseTypeMissionALATattaque(typeMissionALATattaque);
				if (result == null) result = caseTypeMission(typeMissionALATattaque);
				if (result == null) result = caseTypeActivite(typeMissionALATattaque);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionALATattaque);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE: {
				TypeMissionAppuiMobilite typeMissionAppuiMobilite = (TypeMissionAppuiMobilite)theEObject;
				T result = caseTypeMissionAppuiMobilite(typeMissionAppuiMobilite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_ASA: {
				TypeMissionASA typeMissionASA = (TypeMissionASA)theEObject;
				T result = caseTypeMissionASA(typeMissionASA);
				if (result == null) result = caseTypeMission(typeMissionASA);
				if (result == null) result = caseTypeActivite(typeMissionASA);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionASA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_COBRA: {
				TypeMissionCOBRA typeMissionCOBRA = (TypeMissionCOBRA)theEObject;
				T result = caseTypeMissionCOBRA(typeMissionCOBRA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE: {
				TypeMissionDefenseParticuliere typeMissionDefenseParticuliere = (TypeMissionDefenseParticuliere)theEObject;
				T result = caseTypeMissionDefenseParticuliere(typeMissionDefenseParticuliere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_DRONE: {
				TypeMissionDrone typeMissionDrone = (TypeMissionDrone)theEObject;
				T result = caseTypeMissionDrone(typeMissionDrone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU: {
				TypeMissionEscorteOuAppuiFeu typeMissionEscorteOuAppuiFeu = (TypeMissionEscorteOuAppuiFeu)theEObject;
				T result = caseTypeMissionEscorteOuAppuiFeu(typeMissionEscorteOuAppuiFeu);
				if (result == null) result = caseTypeMission(typeMissionEscorteOuAppuiFeu);
				if (result == null) result = caseTypeActivite(typeMissionEscorteOuAppuiFeu);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionEscorteOuAppuiFeu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_FEUX: {
				TypeMissionFeux typeMissionFeux = (TypeMissionFeux)theEObject;
				T result = caseTypeMissionFeux(typeMissionFeux);
				if (result == null) result = caseTypeMission(typeMissionFeux);
				if (result == null) result = caseTypeActivite(typeMissionFeux);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionFeux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_GENIE: {
				TypeMissionGenie typeMissionGenie = (TypeMissionGenie)theEObject;
				T result = caseTypeMissionGenie(typeMissionGenie);
				if (result == null) result = caseTypeMission(typeMissionGenie);
				if (result == null) result = caseTypeActivite(typeMissionGenie);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_I3D: {
				TypeMissionI3D typeMissionI3D = (TypeMissionI3D)theEObject;
				T result = caseTypeMissionI3D(typeMissionI3D);
				if (result == null) result = caseTypeMission(typeMissionI3D);
				if (result == null) result = caseTypeActivite(typeMissionI3D);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionI3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE: {
				TypeMissionLocalisationRadioElectrique typeMissionLocalisationRadioElectrique = (TypeMissionLocalisationRadioElectrique)theEObject;
				T result = caseTypeMissionLocalisationRadioElectrique(typeMissionLocalisationRadioElectrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE: {
				TypeMissionLogistique typeMissionLogistique = (TypeMissionLogistique)theEObject;
				T result = caseTypeMissionLogistique(typeMissionLogistique);
				if (result == null) result = caseTypeMission(typeMissionLogistique);
				if (result == null) result = caseTypeActivite(typeMissionLogistique);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionLogistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_MAINTENANCE: {
				TypeMissionMaintenance typeMissionMaintenance = (TypeMissionMaintenance)theEObject;
				T result = caseTypeMissionMaintenance(typeMissionMaintenance);
				if (result == null) result = caseTypeMissionLogistique(typeMissionMaintenance);
				if (result == null) result = caseTypeMission(typeMissionMaintenance);
				if (result == null) result = caseTypeActivite(typeMissionMaintenance);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_MELEE: {
				TypeMissionMelee typeMissionMelee = (TypeMissionMelee)theEObject;
				T result = caseTypeMissionMelee(typeMissionMelee);
				if (result == null) result = caseTypeMission(typeMissionMelee);
				if (result == null) result = caseTypeActivite(typeMissionMelee);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionMelee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_MOUVEMENT: {
				TypeMissionMouvement typeMissionMouvement = (TypeMissionMouvement)theEObject;
				T result = caseTypeMissionMouvement(typeMissionMouvement);
				if (result == null) result = caseTypeMission(typeMissionMouvement);
				if (result == null) result = caseTypeActivite(typeMissionMouvement);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionMouvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_RADAR: {
				TypeMissionRadar typeMissionRadar = (TypeMissionRadar)theEObject;
				T result = caseTypeMissionRadar(typeMissionRadar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT: {
				TypeMissionRavitaillement typeMissionRavitaillement = (TypeMissionRavitaillement)theEObject;
				T result = caseTypeMissionRavitaillement(typeMissionRavitaillement);
				if (result == null) result = caseTypeMissionLogistique(typeMissionRavitaillement);
				if (result == null) result = caseTypeMission(typeMissionRavitaillement);
				if (result == null) result = caseTypeActivite(typeMissionRavitaillement);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionRavitaillement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT: {
				TypeMissionRenseignement typeMissionRenseignement = (TypeMissionRenseignement)theEObject;
				T result = caseTypeMissionRenseignement(typeMissionRenseignement);
				if (result == null) result = caseTypeMission(typeMissionRenseignement);
				if (result == null) result = caseTypeActivite(typeMissionRenseignement);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionRenseignement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF: {
				TypeMissionRenseignementObjectif typeMissionRenseignementObjectif = (TypeMissionRenseignementObjectif)theEObject;
				T result = caseTypeMissionRenseignementObjectif(typeMissionRenseignementObjectif);
				if (result == null) result = caseTypeMission(typeMissionRenseignementObjectif);
				if (result == null) result = caseTypeActivite(typeMissionRenseignementObjectif);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionRenseignementObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_ROHUM: {
				TypeMissionRohum typeMissionRohum = (TypeMissionRohum)theEObject;
				T result = caseTypeMissionRohum(typeMissionRohum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_SAR_COMBAT: {
				TypeMissionSarCombat typeMissionSarCombat = (TypeMissionSarCombat)theEObject;
				T result = caseTypeMissionSarCombat(typeMissionSarCombat);
				if (result == null) result = caseTypeMission(typeMissionSarCombat);
				if (result == null) result = caseTypeActivite(typeMissionSarCombat);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionSarCombat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_SIC: {
				TypeMissionSic typeMissionSic = (TypeMissionSic)theEObject;
				T result = caseTypeMissionSic(typeMissionSic);
				if (result == null) result = caseTypeMission(typeMissionSic);
				if (result == null) result = caseTypeActivite(typeMissionSic);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionSic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_SURVEILLANCE: {
				TypeMissionSurveillance typeMissionSurveillance = (TypeMissionSurveillance)theEObject;
				T result = caseTypeMissionSurveillance(typeMissionSurveillance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE: {
				TypeMissionTransportTactique typeMissionTransportTactique = (TypeMissionTransportTactique)theEObject;
				T result = caseTypeMissionTransportTactique(typeMissionTransportTactique);
				if (result == null) result = caseTypeMission(typeMissionTransportTactique);
				if (result == null) result = caseTypeActivite(typeMissionTransportTactique);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionTransportTactique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR: {
				TypeMissionUniteAntichar typeMissionUniteAntichar = (TypeMissionUniteAntichar)theEObject;
				T result = caseTypeMissionUniteAntichar(typeMissionUniteAntichar);
				if (result == null) result = caseTypeMission(typeMissionUniteAntichar);
				if (result == null) result = caseTypeActivite(typeMissionUniteAntichar);
				if (result == null) result = caseTypeRacineOperationnelle(typeMissionUniteAntichar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE: {
				TypeMissionZoneADefendre typeMissionZoneADefendre = (TypeMissionZoneADefendre)theEObject;
				T result = caseTypeMissionZoneADefendre(typeMissionZoneADefendre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOBILITE: {
				TypeMobilite typeMobilite = (TypeMobilite)theEObject;
				T result = caseTypeMobilite(typeMobilite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITE: {
				TypeModalite typeModalite = (TypeModalite)theEObject;
				T result = caseTypeModalite(typeModalite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITE_LIVRAISON: {
				TypeModaliteLivraison typeModaliteLivraison = (TypeModaliteLivraison)theEObject;
				T result = caseTypeModaliteLivraison(typeModaliteLivraison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITE_OBTENTION: {
				TypeModaliteObtention typeModaliteObtention = (TypeModaliteObtention)theEObject;
				T result = caseTypeModaliteObtention(typeModaliteObtention);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITE_PERCEPTION: {
				TypeModalitePerception typeModalitePerception = (TypeModalitePerception)theEObject;
				T result = caseTypeModalitePerception(typeModalitePerception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF: {
				TypeModalitesAcquisitionObjectif typeModalitesAcquisitionObjectif = (TypeModalitesAcquisitionObjectif)theEObject;
				T result = caseTypeModalitesAcquisitionObjectif(typeModalitesAcquisitionObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS: {
				TypeModalitesEvaluationDegats typeModalitesEvaluationDegats = (TypeModalitesEvaluationDegats)theEObject;
				T result = caseTypeModalitesEvaluationDegats(typeModalitesEvaluationDegats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR: {
				TypeModalitesMiseEnPlaceTir typeModalitesMiseEnPlaceTir = (TypeModalitesMiseEnPlaceTir)theEObject;
				T result = caseTypeModalitesMiseEnPlaceTir(typeModalitesMiseEnPlaceTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE: {
				TypeModaliteSoutienLogistique typeModaliteSoutienLogistique = (TypeModaliteSoutienLogistique)theEObject;
				T result = caseTypeModaliteSoutienLogistique(typeModaliteSoutienLogistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT: {
				TypeModalitesRavitaillement typeModalitesRavitaillement = (TypeModalitesRavitaillement)theEObject;
				T result = caseTypeModalitesRavitaillement(typeModalitesRavitaillement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS: {
				TypeModaliteTransfertAutoriteASS typeModaliteTransfertAutoriteASS = (TypeModaliteTransfertAutoriteASS)theEObject;
				T result = caseTypeModaliteTransfertAutoriteASS(typeModaliteTransfertAutoriteASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT: {
				TypeModeFranchissement typeModeFranchissement = (TypeModeFranchissement)theEObject;
				T result = caseTypeModeFranchissement(typeModeFranchissement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MODULE: {
				TypeModule typeModule = (TypeModule)theEObject;
				T result = caseTypeModule(typeModule);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeModule);
				if (result == null) result = caseTypeInstanceObjet(typeModule);
				if (result == null) result = caseTypeRacineOperationnelle(typeModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOUILLAGE: {
				TypeMouillage typeMouillage = (TypeMouillage)theEObject;
				T result = caseTypeMouillage(typeMouillage);
				if (result == null) result = caseTypeSite(typeMouillage);
				if (result == null) result = caseTypeInstanceObjet(typeMouillage);
				if (result == null) result = caseTypeRacineOperationnelle(typeMouillage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE: {
				TypeMouvementParRoute typeMouvementParRoute = (TypeMouvementParRoute)theEObject;
				T result = caseTypeMouvementParRoute(typeMouvementParRoute);
				if (result == null) result = caseTypeActivite(typeMouvementParRoute);
				if (result == null) result = caseTypeRacineOperationnelle(typeMouvementParRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION: {
				TypeMoyenCommunication typeMoyenCommunication = (TypeMoyenCommunication)theEObject;
				T result = caseTypeMoyenCommunication(typeMoyenCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYEN_DEPANNAGE: {
				TypeMoyenDepannage typeMoyenDepannage = (TypeMoyenDepannage)theEObject;
				T result = caseTypeMoyenDepannage(typeMoyenDepannage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYEN_DISPERSION: {
				TypeMoyenDispersion typeMoyenDispersion = (TypeMoyenDispersion)theEObject;
				T result = caseTypeMoyenDispersion(typeMoyenDispersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYEN_FEU_ENI: {
				TypeMoyenFeuENI typeMoyenFeuENI = (TypeMoyenFeuENI)theEObject;
				T result = caseTypeMoyenFeuENI(typeMoyenFeuENI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION: {
				TypeMoyenInvestigation typeMoyenInvestigation = (TypeMoyenInvestigation)theEObject;
				T result = caseTypeMoyenInvestigation(typeMoyenInvestigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL: {
				TypeMoyenPourSoutienMedical typeMoyenPourSoutienMedical = (TypeMoyenPourSoutienMedical)theEObject;
				T result = caseTypeMoyenPourSoutienMedical(typeMoyenPourSoutienMedical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU: {
				TypeMoyensAeriensDontBeneficieGU typeMoyensAeriensDontBeneficieGU = (TypeMoyensAeriensDontBeneficieGU)theEObject;
				T result = caseTypeMoyensAeriensDontBeneficieGU(typeMoyensAeriensDontBeneficieGU);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYENS_ENI: {
				TypeMoyensENI typeMoyensENI = (TypeMoyensENI)theEObject;
				T result = caseTypeMoyensENI(typeMoyensENI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES: {
				TypeMoyensENIutilises typeMoyensENIutilises = (TypeMoyensENIutilises)theEObject;
				T result = caseTypeMoyensENIutilises(typeMoyensENIutilises);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYENS_EVACUATION: {
				TypeMoyensEvacuation typeMoyensEvacuation = (TypeMoyensEvacuation)theEObject;
				T result = caseTypeMoyensEvacuation(typeMoyensEvacuation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYENS_GENIE: {
				TypeMoyensGenie typeMoyensGenie = (TypeMoyensGenie)theEObject;
				T result = caseTypeMoyensGenie(typeMoyensGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES: {
				TypeMoyensNecessaires typeMoyensNecessaires = (TypeMoyensNecessaires)theEObject;
				T result = caseTypeMoyensNecessaires(typeMoyensNecessaires);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYENS_NIVEAU4: {
				TypeMoyensNiveau4 typeMoyensNiveau4 = (TypeMoyensNiveau4)theEObject;
				T result = caseTypeMoyensNiveau4(typeMoyensNiveau4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MOYENS_TRIAGE: {
				TypeMoyensTriage typeMoyensTriage = (TypeMoyensTriage)theEObject;
				T result = caseTypeMoyensTriage(typeMoyensTriage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MPGT_MESSAGE: {
				TypeMPGTMessage typeMPGTMessage = (TypeMPGTMessage)theEObject;
				T result = caseTypeMPGTMessage(typeMPGTMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT: {
				TypeMunitionsConsommeesSurPoint typeMunitionsConsommeesSurPoint = (TypeMunitionsConsommeesSurPoint)theEObject;
				T result = caseTypeMunitionsConsommeesSurPoint(typeMunitionsConsommeesSurPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_NATURE_INFORMATIONS: {
				TypeNatureInformations typeNatureInformations = (TypeNatureInformations)theEObject;
				T result = caseTypeNatureInformations(typeNatureInformations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR: {
				TypeNiveauAMaintenir typeNiveauAMaintenir = (TypeNiveauAMaintenir)theEObject;
				T result = caseTypeNiveauAMaintenir(typeNiveauAMaintenir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJECTIF3_D: {
				TypeObjectif3D typeObjectif3D = (TypeObjectif3D)theEObject;
				T result = caseTypeObjectif3D(typeObjectif3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE: {
				TypeObjectifActivite typeObjectifActivite = (TypeObjectifActivite)theEObject;
				T result = caseTypeObjectifActivite(typeObjectifActivite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE: {
				TypeObjectifActiviteType typeObjectifActiviteType = (TypeObjectifActiviteType)theEObject;
				T result = caseTypeObjectifActiviteType(typeObjectifActiviteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE: {
				TypeObjectifActiviteTypeProductionImage typeObjectifActiviteTypeProductionImage = (TypeObjectifActiviteTypeProductionImage)theEObject;
				T result = caseTypeObjectifActiviteTypeProductionImage(typeObjectifActiviteTypeProductionImage);
				if (result == null) result = caseTypeObjectifActiviteType(typeObjectifActiviteTypeProductionImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJECTIF_ALAT: {
				TypeObjectifAlat typeObjectifAlat = (TypeObjectifAlat)theEObject;
				T result = caseTypeObjectifAlat(typeObjectifAlat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJECTIF_ASS: {
				TypeObjectifASS typeObjectifASS = (TypeObjectifASS)theEObject;
				T result = caseTypeObjectifASS(typeObjectifASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE: {
				TypeObjectifCiblage typeObjectifCiblage = (TypeObjectifCiblage)theEObject;
				T result = caseTypeObjectifCiblage(typeObjectifCiblage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR: {
				TypeObjectifMajeur typeObjectifMajeur = (TypeObjectifMajeur)theEObject;
				T result = caseTypeObjectifMajeur(typeObjectifMajeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJET_GEOMETRIQUE: {
				TypeObjetGeometrique typeObjetGeometrique = (TypeObjetGeometrique)theEObject;
				T result = caseTypeObjetGeometrique(typeObjetGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJET_INCONNU: {
				TypeObjetInconnu typeObjetInconnu = (TypeObjetInconnu)theEObject;
				T result = caseTypeObjetInconnu(typeObjetInconnu);
				if (result == null) result = caseTypeInstanceObjet(typeObjetInconnu);
				if (result == null) result = caseTypeRacineOperationnelle(typeObjetInconnu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBJET_LIBRE: {
				TypeObjetLibre typeObjetLibre = (TypeObjetLibre)theEObject;
				T result = caseTypeObjetLibre(typeObjetLibre);
				if (result == null) result = caseTypeRacineOperationnelle(typeObjetLibre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBSERVATION: {
				TypeObservation typeObservation = (TypeObservation)theEObject;
				T result = caseTypeObservation(typeObservation);
				if (result == null) result = caseTypeRacineOperationnelle(typeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OBSTACLE: {
				TypeObstacle typeObstacle = (TypeObstacle)theEObject;
				T result = caseTypeObstacle(typeObstacle);
				if (result == null) result = caseTypeSite(typeObstacle);
				if (result == null) result = caseTypeInstanceObjet(typeObstacle);
				if (result == null) result = caseTypeRacineOperationnelle(typeObstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OCCUPATION_LITS: {
				TypeOccupationLits typeOccupationLits = (TypeOccupationLits)theEObject;
				T result = caseTypeOccupationLits(typeOccupationLits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ORDRE: {
				TypeOrdre typeOrdre = (TypeOrdre)theEObject;
				T result = caseTypeOrdre(typeOrdre);
				if (result == null) result = caseTypePlanOuOrdre(typeOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS: {
				TypeOrganisationEvacuations typeOrganisationEvacuations = (TypeOrganisationEvacuations)theEObject;
				T result = caseTypeOrganisationEvacuations(typeOrganisationEvacuations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ORGANISATION_RAMASSAGE: {
				TypeOrganisationRamassage typeOrganisationRamassage = (TypeOrganisationRamassage)theEObject;
				T result = caseTypeOrganisationRamassage(typeOrganisationRamassage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL: {
				TypeOrganisationSoutienMedical typeOrganisationSoutienMedical = (TypeOrganisationSoutienMedical)theEObject;
				T result = caseTypeOrganisationSoutienMedical(typeOrganisationSoutienMedical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT: {
				TypeOrganisationTraitement typeOrganisationTraitement = (TypeOrganisationTraitement)theEObject;
				T result = caseTypeOrganisationTraitement(typeOrganisationTraitement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE: {
				TypeOrganisationTriage typeOrganisationTriage = (TypeOrganisationTriage)theEObject;
				T result = caseTypeOrganisationTriage(typeOrganisationTriage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ORGANISME_CONTROLE: {
				TypeOrganismeControle typeOrganismeControle = (TypeOrganismeControle)theEObject;
				T result = caseTypeOrganismeControle(typeOrganismeControle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OUVRAGE_GENIE: {
				TypeOuvrageGenie typeOuvrageGenie = (TypeOuvrageGenie)theEObject;
				T result = caseTypeOuvrageGenie(typeOuvrageGenie);
				if (result == null) result = caseTypeSite(typeOuvrageGenie);
				if (result == null) result = caseTypeInstanceObjet(typeOuvrageGenie);
				if (result == null) result = caseTypeRacineOperationnelle(typeOuvrageGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_OVERLAY: {
				TypeOverlay typeOverlay = (TypeOverlay)theEObject;
				T result = caseTypeOverlay(typeOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PALIER_SONDAGE: {
				TypePalierSondage typePalierSondage = (TypePalierSondage)theEObject;
				T result = caseTypePalierSondage(typePalierSondage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE: {
				TypeParagraphePlanOuOrdre typeParagraphePlanOuOrdre = (TypeParagraphePlanOuOrdre)theEObject;
				T result = caseTypeParagraphePlanOuOrdre(typeParagraphePlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES: {
				TypeParametresImposes typeParametresImposes = (TypeParametresImposes)theEObject;
				T result = caseTypeParametresImposes(typeParametresImposes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION: {
				TypeParametresPlanification typeParametresPlanification = (TypeParametresPlanification)theEObject;
				T result = caseTypeParametresPlanification(typeParametresPlanification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES: {
				TypeParametresZoneRetombees typeParametresZoneRetombees = (TypeParametresZoneRetombees)theEObject;
				T result = caseTypeParametresZoneRetombees(typeParametresZoneRetombees);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PASSAGE_MODULE: {
				TypePassageModule typePassageModule = (TypePassageModule)theEObject;
				T result = caseTypePassageModule(typePassageModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PASSE_PHOTO: {
				TypePassePhoto typePassePhoto = (TypePassePhoto)theEObject;
				T result = caseTypePassePhoto(typePassePhoto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PERIODE: {
				TypePeriode typePeriode = (TypePeriode)theEObject;
				T result = caseTypePeriode(typePeriode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PERIODE3_D: {
				TypePeriode3D typePeriode3D = (TypePeriode3D)theEObject;
				T result = caseTypePeriode3D(typePeriode3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PERSONNE: {
				TypePersonne typePersonne = (TypePersonne)theEObject;
				T result = caseTypePersonne(typePersonne);
				if (result == null) result = caseTypeInstanceObjet(typePersonne);
				if (result == null) result = caseTypeRacineOperationnelle(typePersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE: {
				TypePersonneMilitaire typePersonneMilitaire = (TypePersonneMilitaire)theEObject;
				T result = caseTypePersonneMilitaire(typePersonneMilitaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE: {
				TypePertesParPeriode typePertesParPeriode = (TypePertesParPeriode)theEObject;
				T result = caseTypePertesParPeriode(typePertesParPeriode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PERTES_SANTE: {
				TypePertesSante typePertesSante = (TypePertesSante)theEObject;
				T result = caseTypePertesSante(typePertesSante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON: {
				TypePertesSanteParEchelon typePertesSanteParEchelon = (TypePertesSanteParEchelon)theEObject;
				T result = caseTypePertesSanteParEchelon(typePertesSanteParEchelon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_UNITE: {
				TypePertesSanteParUnite typePertesSanteParUnite = (TypePertesSanteParUnite)theEObject;
				T result = caseTypePertesSanteParUnite(typePertesSanteParUnite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN: {
				TypePhaseMissionAppuiAerien typePhaseMissionAppuiAerien = (TypePhaseMissionAppuiAerien)theEObject;
				T result = caseTypePhaseMissionAppuiAerien(typePhaseMissionAppuiAerien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PHASE_TRAJET: {
				TypePhaseTrajet typePhaseTrajet = (TypePhaseTrajet)theEObject;
				T result = caseTypePhaseTrajet(typePhaseTrajet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PHASE_VOL_DRONE: {
				TypePhaseVolDrone typePhaseVolDrone = (TypePhaseVolDrone)theEObject;
				T result = caseTypePhaseVolDrone(typePhaseVolDrone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PION_RESEAU: {
				TypePionReseau typePionReseau = (TypePionReseau)theEObject;
				T result = caseTypePionReseau(typePionReseau);
				if (result == null) result = caseTypeSite(typePionReseau);
				if (result == null) result = caseTypeInstanceObjet(typePionReseau);
				if (result == null) result = caseTypeRacineOperationnelle(typePionReseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE: {
				TypePisteAtterrissage typePisteAtterrissage = (TypePisteAtterrissage)theEObject;
				T result = caseTypePisteAtterrissage(typePisteAtterrissage);
				if (result == null) result = caseTypeSite(typePisteAtterrissage);
				if (result == null) result = caseTypeInstanceObjet(typePisteAtterrissage);
				if (result == null) result = caseTypeRacineOperationnelle(typePisteAtterrissage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION: {
				TypePlageNumerotation typePlageNumerotation = (TypePlageNumerotation)theEObject;
				T result = caseTypePlageNumerotation(typePlageNumerotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLAN: {
				TypePlan typePlan = (TypePlan)theEObject;
				T result = caseTypePlan(typePlan);
				if (result == null) result = caseTypePlanOuOrdre(typePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLAN_FEUX: {
				TypePlanFeux typePlanFeux = (TypePlanFeux)theEObject;
				T result = caseTypePlanFeux(typePlanFeux);
				if (result == null) result = caseTypeActivite(typePlanFeux);
				if (result == null) result = caseTypeRacineOperationnelle(typePlanFeux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLANIFICATION: {
				TypePlanification typePlanification = (TypePlanification)theEObject;
				T result = caseTypePlanification(typePlanification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN: {
				TypePlanificationCelluleSoutien typePlanificationCelluleSoutien = (TypePlanificationCelluleSoutien)theEObject;
				T result = caseTypePlanificationCelluleSoutien(typePlanificationCelluleSoutien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT: {
				TypePlanificationMouvement typePlanificationMouvement = (TypePlanificationMouvement)theEObject;
				T result = caseTypePlanificationMouvement(typePlanificationMouvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D: {
				TypePlanificationOperation3D typePlanificationOperation3D = (TypePlanificationOperation3D)theEObject;
				T result = caseTypePlanificationOperation3D(typePlanificationOperation3D);
				if (result == null) result = caseTypeMission(typePlanificationOperation3D);
				if (result == null) result = caseTypeActivite(typePlanificationOperation3D);
				if (result == null) result = caseTypeRacineOperationnelle(typePlanificationOperation3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLAN_MIXTE: {
				TypePlanMixte typePlanMixte = (TypePlanMixte)theEObject;
				T result = caseTypePlanMixte(typePlanMixte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS: {
				TypePlanNumerotationObjectifs typePlanNumerotationObjectifs = (TypePlanNumerotationObjectifs)theEObject;
				T result = caseTypePlanNumerotationObjectifs(typePlanNumerotationObjectifs);
				if (result == null) result = caseTypeRacineOperationnelle(typePlanNumerotationObjectifs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLAN_OU_ORDRE: {
				TypePlanOuOrdre typePlanOuOrdre = (TypePlanOuOrdre)theEObject;
				T result = caseTypePlanOuOrdre(typePlanOuOrdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLAN_PARTICULIER: {
				TypePlanParticulier typePlanParticulier = (TypePlanParticulier)theEObject;
				T result = caseTypePlanParticulier(typePlanParticulier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS: {
				TypePlanTraitementObjectifs typePlanTraitementObjectifs = (TypePlanTraitementObjectifs)theEObject;
				T result = caseTypePlanTraitementObjectifs(typePlanTraitementObjectifs);
				if (result == null) result = caseTypeActivite(typePlanTraitementObjectifs);
				if (result == null) result = caseTypeRacineOperationnelle(typePlanTraitementObjectifs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POINT_AXE: {
				TypePointAxe typePointAxe = (TypePointAxe)theEObject;
				T result = caseTypePointAxe(typePointAxe);
				if (result == null) result = caseTypeElementControle(typePointAxe);
				if (result == null) result = caseTypeInstanceObjet(typePointAxe);
				if (result == null) result = caseTypeRacineOperationnelle(typePointAxe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POINT_CONTROLE3_D: {
				TypePointControle3D typePointControle3D = (TypePointControle3D)theEObject;
				T result = caseTypePointControle3D(typePointControle3D);
				if (result == null) result = caseTypeElementControle(typePointControle3D);
				if (result == null) result = caseTypeInstanceObjet(typePointControle3D);
				if (result == null) result = caseTypeRacineOperationnelle(typePointControle3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POINT_GEOMETRIQUE: {
				TypePointGeometrique typePointGeometrique = (TypePointGeometrique)theEObject;
				T result = caseTypePointGeometrique(typePointGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typePointGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POINT_HAUT: {
				TypePointHaut typePointHaut = (TypePointHaut)theEObject;
				T result = caseTypePointHaut(typePointHaut);
				if (result == null) result = caseTypeElementControle(typePointHaut);
				if (result == null) result = caseTypeInstanceObjet(typePointHaut);
				if (result == null) result = caseTypeRacineOperationnelle(typePointHaut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POINT_MOBILE: {
				TypePointMobile typePointMobile = (TypePointMobile)theEObject;
				T result = caseTypePointMobile(typePointMobile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE: {
				TypePointParticulierItineraire typePointParticulierItineraire = (TypePointParticulierItineraire)theEObject;
				T result = caseTypePointParticulierItineraire(typePointParticulierItineraire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE: {
				TypePointTrajectoire typePointTrajectoire = (TypePointTrajectoire)theEObject;
				T result = caseTypePointTrajectoire(typePointTrajectoire);
				if (result == null) result = caseTypeElementControle(typePointTrajectoire);
				if (result == null) result = caseTypeInstanceObjet(typePointTrajectoire);
				if (result == null) result = caseTypeRacineOperationnelle(typePointTrajectoire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POINT_USAGER: {
				TypePointUsager typePointUsager = (TypePointUsager)theEObject;
				T result = caseTypePointUsager(typePointUsager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POLITIQUE_TIR: {
				TypePolitiqueTir typePolitiqueTir = (TypePolitiqueTir)theEObject;
				T result = caseTypePolitiqueTir(typePolitiqueTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF: {
				TypePolitiqueTirAeronef typePolitiqueTirAeronef = (TypePolitiqueTirAeronef)theEObject;
				T result = caseTypePolitiqueTirAeronef(typePolitiqueTirAeronef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PONT: {
				TypePont typePont = (TypePont)theEObject;
				T result = caseTypePont(typePont);
				if (result == null) result = caseTypeSite(typePont);
				if (result == null) result = caseTypeInstanceObjet(typePont);
				if (result == null) result = caseTypeRacineOperationnelle(typePont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PORT: {
				TypePort typePort = (TypePort)theEObject;
				T result = caseTypePort(typePort);
				if (result == null) result = caseTypeSite(typePort);
				if (result == null) result = caseTypeInstanceObjet(typePort);
				if (result == null) result = caseTypeRacineOperationnelle(typePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PORTEUR_SYSTEME_ARME: {
				TypePorteurSystemeArme typePorteurSystemeArme = (TypePorteurSystemeArme)theEObject;
				T result = caseTypePorteurSystemeArme(typePorteurSystemeArme);
				if (result == null) result = caseTypeMateriel(typePorteurSystemeArme);
				if (result == null) result = caseTypeInstanceObjet(typePorteurSystemeArme);
				if (result == null) result = caseTypeRacineOperationnelle(typePorteurSystemeArme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA: {
				TypePositionCentreASA typePositionCentreASA = (TypePositionCentreASA)theEObject;
				T result = caseTypePositionCentreASA(typePositionCentreASA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POSITION_PLOTS: {
				TypePositionPlots typePositionPlots = (TypePositionPlots)theEObject;
				T result = caseTypePositionPlots(typePositionPlots);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D: {
				TypePossibilitesENI3d typePossibilitesENI3d = (TypePossibilitesENI3d)theEObject;
				T result = caseTypePossibilitesENI3d(typePossibilitesENI3d);
				if (result == null) result = caseTypeMenace(typePossibilitesENI3d);
				if (result == null) result = caseTypeRacineOperationnelle(typePossibilitesENI3d);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POSTE_AMARRAGE: {
				TypePosteAmarrage typePosteAmarrage = (TypePosteAmarrage)theEObject;
				T result = caseTypePosteAmarrage(typePosteAmarrage);
				if (result == null) result = caseTypeSite(typePosteAmarrage);
				if (result == null) result = caseTypeInstanceObjet(typePosteAmarrage);
				if (result == null) result = caseTypeRacineOperationnelle(typePosteAmarrage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POSTE_TIR: {
				TypePosteTir typePosteTir = (TypePosteTir)theEObject;
				T result = caseTypePosteTir(typePosteTir);
				if (result == null) result = caseTypeElementControle(typePosteTir);
				if (result == null) result = caseTypeInstanceObjet(typePosteTir);
				if (result == null) result = caseTypeRacineOperationnelle(typePosteTir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POTENTIEL_AERONEF: {
				TypePotentielAeronef typePotentielAeronef = (TypePotentielAeronef)theEObject;
				T result = caseTypePotentielAeronef(typePotentielAeronef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL: {
				TypePotentielENIfeuSolSol typePotentielENIfeuSolSol = (TypePotentielENIfeuSolSol)theEObject;
				T result = caseTypePotentielENIfeuSolSol(typePotentielENIfeuSolSol);
				if (result == null) result = caseTypeMenace(typePotentielENIfeuSolSol);
				if (result == null) result = caseTypeRacineOperationnelle(typePotentielENIfeuSolSol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PRECIPITATION: {
				TypePrecipitation typePrecipitation = (TypePrecipitation)theEObject;
				T result = caseTypePrecipitation(typePrecipitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PRELEVEMENT: {
				TypePrelevement typePrelevement = (TypePrelevement)theEObject;
				T result = caseTypePrelevement(typePrelevement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT: {
				TypePrelevementDetachement typePrelevementDetachement = (TypePrelevementDetachement)theEObject;
				T result = caseTypePrelevementDetachement(typePrelevementDetachement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE: {
				TypePrelevementSubordonneIdentifie typePrelevementSubordonneIdentifie = (TypePrelevementSubordonneIdentifie)theEObject;
				T result = caseTypePrelevementSubordonneIdentifie(typePrelevementSubordonneIdentifie);
				if (result == null) result = caseTypePrelevementDetachement(typePrelevementSubordonneIdentifie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE: {
				TypePrelevementSubordonneNonIdentifie typePrelevementSubordonneNonIdentifie = (TypePrelevementSubordonneNonIdentifie)theEObject;
				T result = caseTypePrelevementSubordonneNonIdentifie(typePrelevementSubordonneNonIdentifie);
				if (result == null) result = caseTypePrelevementDetachement(typePrelevementSubordonneNonIdentifie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PREVISION_OBSERVATION: {
				TypePrevisionObservation typePrevisionObservation = (TypePrevisionObservation)theEObject;
				T result = caseTypePrevisionObservation(typePrevisionObservation);
				if (result == null) result = caseTypeInstanceObjet(typePrevisionObservation);
				if (result == null) result = caseTypeRacineOperationnelle(typePrevisionObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE: {
				TypePrevisionObservationParTranche typePrevisionObservationParTranche = (TypePrevisionObservationParTranche)theEObject;
				T result = caseTypePrevisionObservationParTranche(typePrevisionObservationParTranche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PRIORITE: {
				TypePriorite typePriorite = (TypePriorite)theEObject;
				T result = caseTypePriorite(typePriorite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE: {
				TypePrioriteTactique typePrioriteTactique = (TypePrioriteTactique)theEObject;
				T result = caseTypePrioriteTactique(typePrioriteTactique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE: {
				TypePrioriteTactiqueLogistique typePrioriteTactiqueLogistique = (TypePrioriteTactiqueLogistique)theEObject;
				T result = caseTypePrioriteTactiqueLogistique(typePrioriteTactiqueLogistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE: {
				TypePrioriteTechnique typePrioriteTechnique = (TypePrioriteTechnique)theEObject;
				T result = caseTypePrioriteTechnique(typePrioriteTechnique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PROCEDURE_IFF: {
				TypeProcedureIFF typeProcedureIFF = (TypeProcedureIFF)theEObject;
				T result = caseTypeProcedureIFF(typeProcedureIFF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PROFIL: {
				TypeProfil typeProfil = (TypeProfil)theEObject;
				T result = caseTypeProfil(typeProfil);
				if (result == null) result = caseTypeRacineOperationnelle(typeProfil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PROJET_CIMIC: {
				TypeProjetCimic typeProjetCimic = (TypeProjetCimic)theEObject;
				T result = caseTypeProjetCimic(typeProjetCimic);
				if (result == null) result = caseTypeActivite(typeProjetCimic);
				if (result == null) result = caseTypeRacineOperationnelle(typeProjetCimic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_PROTECTION_PERSONNEL: {
				TypeProtectionPersonnel typeProtectionPersonnel = (TypeProtectionPersonnel)theEObject;
				T result = caseTypeProtectionPersonnel(typeProtectionPersonnel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUAI_MARITIME: {
				TypeQuaiMaritime typeQuaiMaritime = (TypeQuaiMaritime)theEObject;
				T result = caseTypeQuaiMaritime(typeQuaiMaritime);
				if (result == null) result = caseTypeSite(typeQuaiMaritime);
				if (result == null) result = caseTypeInstanceObjet(typeQuaiMaritime);
				if (result == null) result = caseTypeRacineOperationnelle(typeQuaiMaritime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_CONSOMMEE: {
				TypeQuantiteConsommee typeQuantiteConsommee = (TypeQuantiteConsommee)theEObject;
				T result = caseTypeQuantiteConsommee(typeQuantiteConsommee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_ELEMENT_ENI_DETRUIT: {
				TypeQuantiteElementENIDetruit typeQuantiteElementENIDetruit = (TypeQuantiteElementENIDetruit)theEObject;
				T result = caseTypeQuantiteElementENIDetruit(typeQuantiteElementENIDetruit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR: {
				TypeQuantiteMaintenir typeQuantiteMaintenir = (TypeQuantiteMaintenir)theEObject;
				T result = caseTypeQuantiteMaintenir(typeQuantiteMaintenir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_MATERIEL: {
				TypeQuantiteMateriel typeQuantiteMateriel = (TypeQuantiteMateriel)theEObject;
				T result = caseTypeQuantiteMateriel(typeQuantiteMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN: {
				TypeQuantiteMaterielOuMoyen typeQuantiteMaterielOuMoyen = (TypeQuantiteMaterielOuMoyen)theEObject;
				T result = caseTypeQuantiteMaterielOuMoyen(typeQuantiteMaterielOuMoyen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS: {
				TypeQuantiteMoyensTirASS typeQuantiteMoyensTirASS = (TypeQuantiteMoyensTirASS)theEObject;
				T result = caseTypeQuantiteMoyensTirASS(typeQuantiteMoyensTirASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI: {
				TypeQuantiteTypeArmePourMoyenFeuASSeni typeQuantiteTypeArmePourMoyenFeuASSeni = (TypeQuantiteTypeArmePourMoyenFeuASSeni)theEObject;
				T result = caseTypeQuantiteTypeArmePourMoyenFeuASSeni(typeQuantiteTypeArmePourMoyenFeuASSeni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT: {
				TypeQuantiteTypeEquipement typeQuantiteTypeEquipement = (TypeQuantiteTypeEquipement)theEObject;
				T result = caseTypeQuantiteTypeEquipement(typeQuantiteTypeEquipement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE: {
				TypeQuantiteTypeObserve typeQuantiteTypeObserve = (TypeQuantiteTypeObserve)theEObject;
				T result = caseTypeQuantiteTypeObserve(typeQuantiteTypeObserve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_QUANTITE_TYPE_UNITE: {
				TypeQuantiteTypeUnite typeQuantiteTypeUnite = (TypeQuantiteTypeUnite)theEObject;
				T result = caseTypeQuantiteTypeUnite(typeQuantiteTypeUnite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE: {
				TypeRacineOperationnelle typeRacineOperationnelle = (TypeRacineOperationnelle)theEObject;
				T result = caseTypeRacineOperationnelle(typeRacineOperationnelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI: {
				TypeRaidAerienEnnemi typeRaidAerienEnnemi = (TypeRaidAerienEnnemi)theEObject;
				T result = caseTypeRaidAerienEnnemi(typeRaidAerienEnnemi);
				if (result == null) result = caseTypeEvenement(typeRaidAerienEnnemi);
				if (result == null) result = caseTypeActivite(typeRaidAerienEnnemi);
				if (result == null) result = caseTypeRacineOperationnelle(typeRaidAerienEnnemi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RAPPORT: {
				TypeRapport typeRapport = (TypeRapport)theEObject;
				T result = caseTypeRapport(typeRapport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RAPPORT_FORCE: {
				TypeRapportForce typeRapportForce = (TypeRapportForce)theEObject;
				T result = caseTypeRapportForce(typeRapportForce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RATTACHEMENT: {
				TypeRattachement typeRattachement = (TypeRattachement)theEObject;
				T result = caseTypeRattachement(typeRattachement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER: {
				TypeRattachementLogistiqueParticulier typeRattachementLogistiqueParticulier = (TypeRattachementLogistiqueParticulier)theEObject;
				T result = caseTypeRattachementLogistiqueParticulier(typeRattachementLogistiqueParticulier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT: {
				TypeRattachementOuAbonnement typeRattachementOuAbonnement = (TypeRattachementOuAbonnement)theEObject;
				T result = caseTypeRattachementOuAbonnement(typeRattachementOuAbonnement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RAVITAILLEMENT: {
				TypeRavitaillement typeRavitaillement = (TypeRavitaillement)theEObject;
				T result = caseTypeRavitaillement(typeRavitaillement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT: {
				TypeReactionsMentalesAuCombat typeReactionsMentalesAuCombat = (TypeReactionsMentalesAuCombat)theEObject;
				T result = caseTypeReactionsMentalesAuCombat(typeReactionsMentalesAuCombat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RECHANGE: {
				TypeRechange typeRechange = (TypeRechange)theEObject;
				T result = caseTypeRechange(typeRechange);
				if (result == null) result = caseTypeActivite(typeRechange);
				if (result == null) result = caseTypeRacineOperationnelle(typeRechange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RECONNAISSANCE: {
				TypeReconnaissance typeReconnaissance = (TypeReconnaissance)theEObject;
				T result = caseTypeReconnaissance(typeReconnaissance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT: {
				TypeRegleEngagement typeRegleEngagement = (TypeRegleEngagement)theEObject;
				T result = caseTypeRegleEngagement(typeRegleEngagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION: {
				TypeRegleEngagementAction typeRegleEngagementAction = (TypeRegleEngagementAction)theEObject;
				T result = caseTypeRegleEngagementAction(typeRegleEngagementAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_REGLEMENTATION: {
				TypeReglementation typeReglementation = (TypeReglementation)theEObject;
				T result = caseTypeReglementation(typeReglementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RELIGION: {
				TypeReligion typeReligion = (TypeReligion)theEObject;
				T result = caseTypeReligion(typeReligion);
				if (result == null) result = caseTypeAffiliation(typeReligion);
				if (result == null) result = caseTypeRacineOperationnelle(typeReligion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX: {
				TypeRenforcementsFeux typeRenforcementsFeux = (TypeRenforcementsFeux)theEObject;
				T result = caseTypeRenforcementsFeux(typeRenforcementsFeux);
				if (result == null) result = caseTypeMission(typeRenforcementsFeux);
				if (result == null) result = caseTypeActivite(typeRenforcementsFeux);
				if (result == null) result = caseTypeRacineOperationnelle(typeRenforcementsFeux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF: {
				TypeRenseignementObjectif typeRenseignementObjectif = (TypeRenseignementObjectif)theEObject;
				T result = caseTypeRenseignementObjectif(typeRenseignementObjectif);
				if (result == null) result = caseTypeActivite(typeRenseignementObjectif);
				if (result == null) result = caseTypeRacineOperationnelle(typeRenseignementObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION: {
				TypeReseauTelecommunication typeReseauTelecommunication = (TypeReseauTelecommunication)theEObject;
				T result = caseTypeReseauTelecommunication(typeReseauTelecommunication);
				if (result == null) result = caseTypeSite(typeReseauTelecommunication);
				if (result == null) result = caseTypeInstanceObjet(typeReseauTelecommunication);
				if (result == null) result = caseTypeRacineOperationnelle(typeReseauTelecommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RESERVATION_UNITE: {
				TypeReservationUnite typeReservationUnite = (TypeReservationUnite)theEObject;
				T result = caseTypeReservationUnite(typeReservationUnite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE: {
				TypeRessourceActivite typeRessourceActivite = (TypeRessourceActivite)theEObject;
				T result = caseTypeRessourceActivite(typeRessourceActivite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET: {
				TypeRessourceActiviteInstanceObjet typeRessourceActiviteInstanceObjet = (TypeRessourceActiviteInstanceObjet)theEObject;
				T result = caseTypeRessourceActiviteInstanceObjet(typeRessourceActiviteInstanceObjet);
				if (result == null) result = caseTypeRessourceActivite(typeRessourceActiviteInstanceObjet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE: {
				TypeRessourceActiviteType typeRessourceActiviteType = (TypeRessourceActiviteType)theEObject;
				T result = caseTypeRessourceActiviteType(typeRessourceActiviteType);
				if (result == null) result = caseTypeRessourceActivite(typeRessourceActiviteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE: {
				TypeRessourceAttendue typeRessourceAttendue = (TypeRessourceAttendue)theEObject;
				T result = caseTypeRessourceAttendue(typeRessourceAttendue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE: {
				TypeRessourceElementaire typeRessourceElementaire = (TypeRessourceElementaire)theEObject;
				T result = caseTypeRessourceElementaire(typeRessourceElementaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER: {
				TypeRessourcesALivrerOuADistribuer typeRessourcesALivrerOuADistribuer = (TypeRessourcesALivrerOuADistribuer)theEObject;
				T result = caseTypeRessourcesALivrerOuADistribuer(typeRessourcesALivrerOuADistribuer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF: {
				TypeResultatTraitementObjectif typeResultatTraitementObjectif = (TypeResultatTraitementObjectif)theEObject;
				T result = caseTypeResultatTraitementObjectif(typeResultatTraitementObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION: {
				TypeROEparOrganisation typeROEparOrganisation = (TypeROEparOrganisation)theEObject;
				T result = caseTypeROEparOrganisation(typeROEparOrganisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ROUTE: {
				TypeRoute typeRoute = (TypeRoute)theEObject;
				T result = caseTypeRoute(typeRoute);
				if (result == null) result = caseTypeSite(typeRoute);
				if (result == null) result = caseTypeInstanceObjet(typeRoute);
				if (result == null) result = caseTypeRacineOperationnelle(typeRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT: {
				TypeRouteHelicoptereALAT typeRouteHelicoptereALAT = (TypeRouteHelicoptereALAT)theEObject;
				T result = caseTypeRouteHelicoptereALAT(typeRouteHelicoptereALAT);
				if (result == null) result = caseTypeElementControle(typeRouteHelicoptereALAT);
				if (result == null) result = caseTypeInstanceObjet(typeRouteHelicoptereALAT);
				if (result == null) result = caseTypeRacineOperationnelle(typeRouteHelicoptereALAT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE: {
				TypeSecteurAngulaireGeometrique typeSecteurAngulaireGeometrique = (TypeSecteurAngulaireGeometrique)theEObject;
				T result = caseTypeSecteurAngulaireGeometrique(typeSecteurAngulaireGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeSecteurAngulaireGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE: {
				TypeSecteurGeometrique typeSecteurGeometrique = (TypeSecteurGeometrique)theEObject;
				T result = caseTypeSecteurGeometrique(typeSecteurGeometrique);
				if (result == null) result = caseTypeObjetGeometrique(typeSecteurGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SEGMENT_ITINERAIRE: {
				TypeSegmentItineraire typeSegmentItineraire = (TypeSegmentItineraire)theEObject;
				T result = caseTypeSegmentItineraire(typeSegmentItineraire);
				if (result == null) result = caseTypeElementControle(typeSegmentItineraire);
				if (result == null) result = caseTypeInstanceObjet(typeSegmentItineraire);
				if (result == null) result = caseTypeRacineOperationnelle(typeSegmentItineraire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE: {
				TypeSegmentRouteAerienne typeSegmentRouteAerienne = (TypeSegmentRouteAerienne)theEObject;
				T result = caseTypeSegmentRouteAerienne(typeSegmentRouteAerienne);
				if (result == null) result = caseTypeSegmentItineraire(typeSegmentRouteAerienne);
				if (result == null) result = caseTypeElementControle(typeSegmentRouteAerienne);
				if (result == null) result = caseTypeInstanceObjet(typeSegmentRouteAerienne);
				if (result == null) result = caseTypeRacineOperationnelle(typeSegmentRouteAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE: {
				TypeSerieGeostatistique typeSerieGeostatistique = (TypeSerieGeostatistique)theEObject;
				T result = caseTypeSerieGeostatistique(typeSerieGeostatistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SERVICE_RESEAU: {
				TypeServiceReseau typeServiceReseau = (TypeServiceReseau)theEObject;
				T result = caseTypeServiceReseau(typeServiceReseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SITE: {
				TypeSite typeSite = (TypeSite)theEObject;
				T result = caseTypeSite(typeSite);
				if (result == null) result = caseTypeInstanceObjet(typeSite);
				if (result == null) result = caseTypeRacineOperationnelle(typeSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SITE_PRODUCTION: {
				TypeSiteProduction typeSiteProduction = (TypeSiteProduction)theEObject;
				T result = caseTypeSiteProduction(typeSiteProduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SITE_SOIN: {
				TypeSiteSoin typeSiteSoin = (TypeSiteSoin)theEObject;
				T result = caseTypeSiteSoin(typeSiteSoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SITUATION_CONSOMMABLE: {
				TypeSituationConsommable typeSituationConsommable = (TypeSituationConsommable)theEObject;
				T result = caseTypeSituationConsommable(typeSituationConsommable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SITUATION_EFFECTIF: {
				TypeSituationEffectif typeSituationEffectif = (TypeSituationEffectif)theEObject;
				T result = caseTypeSituationEffectif(typeSituationEffectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SITUATION_EQUIPEMENT: {
				TypeSituationEquipement typeSituationEquipement = (TypeSituationEquipement)theEObject;
				T result = caseTypeSituationEquipement(typeSituationEquipement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SITUATION_RADIATION: {
				TypeSituationRadiation typeSituationRadiation = (TypeSituationRadiation)theEObject;
				T result = caseTypeSituationRadiation(typeSituationRadiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SITUATION_VEHICULE: {
				TypeSituationVehicule typeSituationVehicule = (TypeSituationVehicule)theEObject;
				T result = caseTypeSituationVehicule(typeSituationVehicule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SPECIALITE_MAINTENANCE_OU_DEPANNAGE: {
				TypeSpecialiteMaintenanceOuDepannage typeSpecialiteMaintenanceOuDepannage = (TypeSpecialiteMaintenanceOuDepannage)theEObject;
				T result = caseTypeSpecialiteMaintenanceOuDepannage(typeSpecialiteMaintenanceOuDepannage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE: {
				TypeSpecialitePersonne typeSpecialitePersonne = (TypeSpecialitePersonne)theEObject;
				T result = caseTypeSpecialitePersonne(typeSpecialitePersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SPHERE_GEOMETRIQUE: {
				TypeSphereGeometrique typeSphereGeometrique = (TypeSphereGeometrique)theEObject;
				T result = caseTypeSphereGeometrique(typeSphereGeometrique);
				if (result == null) result = caseTypeVolumeGeometrique(typeSphereGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION: {
				TypeStadeAlerteEmission typeStadeAlerteEmission = (TypeStadeAlerteEmission)theEObject;
				T result = caseTypeStadeAlerteEmission(typeStadeAlerteEmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_STOCK_AMAINTENIR: {
				TypeStockAMaintenir typeStockAMaintenir = (TypeStockAMaintenir)theEObject;
				T result = caseTypeStockAMaintenir(typeStockAMaintenir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_STRUCTURE_ORGANISEE: {
				TypeStructureOrganisee typeStructureOrganisee = (TypeStructureOrganisee)theEObject;
				T result = caseTypeStructureOrganisee(typeStructureOrganisee);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeStructureOrganisee);
				if (result == null) result = caseTypeInstanceObjet(typeStructureOrganisee);
				if (result == null) result = caseTypeRacineOperationnelle(typeStructureOrganisee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SUIVI_DEMANDE: {
				TypeSuiviDemande typeSuiviDemande = (TypeSuiviDemande)theEObject;
				T result = caseTypeSuiviDemande(typeSuiviDemande);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SUIVI_MEDICAL: {
				TypeSuiviMedical typeSuiviMedical = (TypeSuiviMedical)theEObject;
				T result = caseTypeSuiviMedical(typeSuiviMedical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT: {
				TypeSurplusOuDeficit typeSurplusOuDeficit = (TypeSurplusOuDeficit)theEObject;
				T result = caseTypeSurplusOuDeficit(typeSurplusOuDeficit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_ANNOTATION: {
				TypeSymboleAnnotation typeSymboleAnnotation = (TypeSymboleAnnotation)theEObject;
				T result = caseTypeSymboleAnnotation(typeSymboleAnnotation);
				if (result == null) result = caseTypeSymboleLibre(typeSymboleAnnotation);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymboleAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_CERCLE: {
				TypeSymboleCercle typeSymboleCercle = (TypeSymboleCercle)theEObject;
				T result = caseTypeSymboleCercle(typeSymboleCercle);
				if (result == null) result = caseTypeSymboleSurfacique(typeSymboleCercle);
				if (result == null) result = caseTypeSymboleLibre(typeSymboleCercle);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymboleCercle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_FLECHE: {
				TypeSymboleFleche typeSymboleFleche = (TypeSymboleFleche)theEObject;
				T result = caseTypeSymboleFleche(typeSymboleFleche);
				if (result == null) result = caseTypeSymboleSurfacique(typeSymboleFleche);
				if (result == null) result = caseTypeSymboleLibre(typeSymboleFleche);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymboleFleche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_IMAGE: {
				TypeSymboleImage typeSymboleImage = (TypeSymboleImage)theEObject;
				T result = caseTypeSymboleImage(typeSymboleImage);
				if (result == null) result = caseTypeSymboleLibre(typeSymboleImage);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymboleImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_LIBRE: {
				TypeSymboleLibre typeSymboleLibre = (TypeSymboleLibre)theEObject;
				T result = caseTypeSymboleLibre(typeSymboleLibre);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymboleLibre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE: {
				TypeSymboleLineique typeSymboleLineique = (TypeSymboleLineique)theEObject;
				T result = caseTypeSymboleLineique(typeSymboleLineique);
				if (result == null) result = caseTypeSymboleLibre(typeSymboleLineique);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymboleLineique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_NOTE: {
				TypeSymboleNote typeSymboleNote = (TypeSymboleNote)theEObject;
				T result = caseTypeSymboleNote(typeSymboleNote);
				if (result == null) result = caseTypeSymboleLibre(typeSymboleNote);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymboleNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_POINT: {
				TypeSymbolePoint typeSymbolePoint = (TypeSymbolePoint)theEObject;
				T result = caseTypeSymbolePoint(typeSymbolePoint);
				if (result == null) result = caseTypeSymboleLibre(typeSymbolePoint);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymbolePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_POST_IT: {
				TypeSymbolePostIt typeSymbolePostIt = (TypeSymbolePostIt)theEObject;
				T result = caseTypeSymbolePostIt(typeSymbolePostIt);
				if (result == null) result = caseTypeSymboleLibre(typeSymbolePostIt);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymbolePostIt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE: {
				TypeSymboleSurfacique typeSymboleSurfacique = (TypeSymboleSurfacique)theEObject;
				T result = caseTypeSymboleSurfacique(typeSymboleSurfacique);
				if (result == null) result = caseTypeSymboleLibre(typeSymboleSurfacique);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymboleSurfacique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE: {
				TypeSymboleTactique typeSymboleTactique = (TypeSymboleTactique)theEObject;
				T result = caseTypeSymboleTactique(typeSymboleTactique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYMBOLE_TEXTE: {
				TypeSymboleTexte typeSymboleTexte = (TypeSymboleTexte)theEObject;
				T result = caseTypeSymboleTexte(typeSymboleTexte);
				if (result == null) result = caseTypeSymboleLibre(typeSymboleTexte);
				if (result == null) result = caseTypeRacineOperationnelle(typeSymboleTexte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS: {
				TypeSyntheseDetections typeSyntheseDetections = (TypeSyntheseDetections)theEObject;
				T result = caseTypeSyntheseDetections(typeSyntheseDetections);
				if (result == null) result = caseTypeActivite(typeSyntheseDetections);
				if (result == null) result = caseTypeRacineOperationnelle(typeSyntheseDetections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYNTHESE_SANTE: {
				TypeSyntheseSante typeSyntheseSante = (TypeSyntheseSante)theEObject;
				T result = caseTypeSyntheseSante(typeSyntheseSante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS: {
				TypeSystemeAtterrissageAuxInstruments typeSystemeAtterrissageAuxInstruments = (TypeSystemeAtterrissageAuxInstruments)theEObject;
				T result = caseTypeSystemeAtterrissageAuxInstruments(typeSystemeAtterrissageAuxInstruments);
				if (result == null) result = caseTypeMateriel(typeSystemeAtterrissageAuxInstruments);
				if (result == null) result = caseTypeInstanceObjet(typeSystemeAtterrissageAuxInstruments);
				if (result == null) result = caseTypeRacineOperationnelle(typeSystemeAtterrissageAuxInstruments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TACHE: {
				TypeTache typeTache = (TypeTache)theEObject;
				T result = caseTypeTache(typeTache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN: {
				TypeTacheAppuiAerien typeTacheAppuiAerien = (TypeTacheAppuiAerien)theEObject;
				T result = caseTypeTacheAppuiAerien(typeTacheAppuiAerien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF: {
				TypeTirsParObjectif typeTirsParObjectif = (TypeTirsParObjectif)theEObject;
				T result = caseTypeTirsParObjectif(typeTirsParObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF: {
				TypeTraitementObjectif typeTraitementObjectif = (TypeTraitementObjectif)theEObject;
				T result = caseTypeTraitementObjectif(typeTraitementObjectif);
				if (result == null) result = caseTypeActivite(typeTraitementObjectif);
				if (result == null) result = caseTypeRacineOperationnelle(typeTraitementObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TRAITEMENT_PATIENTS: {
				TypeTraitementPatients typeTraitementPatients = (TypeTraitementPatients)theEObject;
				T result = caseTypeTraitementPatients(typeTraitementPatients);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TRANCHE_METEO: {
				TypeTrancheMeteo typeTrancheMeteo = (TypeTrancheMeteo)theEObject;
				T result = caseTypeTrancheMeteo(typeTrancheMeteo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TRANSFERT_DOTATION: {
				TypeTransfertDotation typeTransfertDotation = (TypeTransfertDotation)theEObject;
				T result = caseTypeTransfertDotation(typeTransfertDotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT: {
				TypeTravailAideDeploiement typeTravailAideDeploiement = (TypeTravailAideDeploiement)theEObject;
				T result = caseTypeTravailAideDeploiement(typeTravailAideDeploiement);
				if (result == null) result = caseTypeRacineOperationnelle(typeTravailAideDeploiement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TRAVAIL_GENIE: {
				TypeTravailGenie typeTravailGenie = (TypeTravailGenie)theEObject;
				T result = caseTypeTravailGenie(typeTravailGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TRIAGE: {
				TypeTriage typeTriage = (TypeTriage)theEObject;
				T result = caseTypeTriage(typeTriage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE: {
				TypeType typeType = (TypeType)theEObject;
				T result = caseTypeType(typeType);
				if (result == null) result = caseTypeRacineOperationnelle(typeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_AERODROME: {
				TypeTypeAerodrome typeTypeAerodrome = (TypeTypeAerodrome)theEObject;
				T result = caseTypeTypeAerodrome(typeTypeAerodrome);
				if (result == null) result = caseTypeTypeSite(typeTypeAerodrome);
				if (result == null) result = caseTypeType(typeTypeAerodrome);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeAerodrome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_AERONEF: {
				TypeTypeAeronef typeTypeAeronef = (TypeTypeAeronef)theEObject;
				T result = caseTypeTypeAeronef(typeTypeAeronef);
				if (result == null) result = caseTypeTypeEquipement(typeTypeAeronef);
				if (result == null) result = caseTypeTypeMateriel(typeTypeAeronef);
				if (result == null) result = caseTypeType(typeTypeAeronef);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeAeronef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE: {
				TypeTypeAgentBiologique typeTypeAgentBiologique = (TypeTypeAgentBiologique)theEObject;
				T result = caseTypeTypeAgentBiologique(typeTypeAgentBiologique);
				if (result == null) result = caseTypeTypeConsommable(typeTypeAgentBiologique);
				if (result == null) result = caseTypeTypeMateriel(typeTypeAgentBiologique);
				if (result == null) result = caseTypeType(typeTypeAgentBiologique);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeAgentBiologique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE: {
				TypeTypeAgentChimique typeTypeAgentChimique = (TypeTypeAgentChimique)theEObject;
				T result = caseTypeTypeAgentChimique(typeTypeAgentChimique);
				if (result == null) result = caseTypeTypeConsommable(typeTypeAgentChimique);
				if (result == null) result = caseTypeTypeMateriel(typeTypeAgentChimique);
				if (result == null) result = caseTypeType(typeTypeAgentChimique);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeAgentChimique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE: {
				TypeTypeAgentNucleaire typeTypeAgentNucleaire = (TypeTypeAgentNucleaire)theEObject;
				T result = caseTypeTypeAgentNucleaire(typeTypeAgentNucleaire);
				if (result == null) result = caseTypeTypeConsommable(typeTypeAgentNucleaire);
				if (result == null) result = caseTypeTypeMateriel(typeTypeAgentNucleaire);
				if (result == null) result = caseTypeType(typeTypeAgentNucleaire);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeAgentNucleaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_ARME: {
				TypeTypeArme typeTypeArme = (TypeTypeArme)theEObject;
				T result = caseTypeTypeArme(typeTypeArme);
				if (result == null) result = caseTypeTypeEquipement(typeTypeArme);
				if (result == null) result = caseTypeTypeMateriel(typeTypeArme);
				if (result == null) result = caseTypeType(typeTypeArme);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeArme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_ARMEMENT_SYSTEME_ARME: {
				TypeTypeArmementSystemeArme typeTypeArmementSystemeArme = (TypeTypeArmementSystemeArme)theEObject;
				T result = caseTypeTypeArmementSystemeArme(typeTypeArmementSystemeArme);
				if (result == null) result = caseTypeTypeConsommableSystemeArme(typeTypeArmementSystemeArme);
				if (result == null) result = caseTypeTypeMateriel(typeTypeArmementSystemeArme);
				if (result == null) result = caseTypeType(typeTypeArmementSystemeArme);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeArmementSystemeArme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_BATIMENT: {
				TypeTypeBatiment typeTypeBatiment = (TypeTypeBatiment)theEObject;
				T result = caseTypeTypeBatiment(typeTypeBatiment);
				if (result == null) result = caseTypeTypeEquipement(typeTypeBatiment);
				if (result == null) result = caseTypeTypeMateriel(typeTypeBatiment);
				if (result == null) result = caseTypeType(typeTypeBatiment);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeBatiment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT: {
				TypeTypeBatimentParticipant typeTypeBatimentParticipant = (TypeTypeBatimentParticipant)theEObject;
				T result = caseTypeTypeBatimentParticipant(typeTypeBatimentParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE: {
				TypeTypeBatimentSurface typeTypeBatimentSurface = (TypeTypeBatimentSurface)theEObject;
				T result = caseTypeTypeBatimentSurface(typeTypeBatimentSurface);
				if (result == null) result = caseTypeTypeBatiment(typeTypeBatimentSurface);
				if (result == null) result = caseTypeTypeEquipement(typeTypeBatimentSurface);
				if (result == null) result = caseTypeTypeMateriel(typeTypeBatimentSurface);
				if (result == null) result = caseTypeType(typeTypeBatimentSurface);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeBatimentSurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_CAPTEUR: {
				TypeTypeCapteur typeTypeCapteur = (TypeTypeCapteur)theEObject;
				T result = caseTypeTypeCapteur(typeTypeCapteur);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeTypeCapteur);
				if (result == null) result = caseTypeType(typeTypeCapteur);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeCapteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE: {
				TypeTypeConsommable typeTypeConsommable = (TypeTypeConsommable)theEObject;
				T result = caseTypeTypeConsommable(typeTypeConsommable);
				if (result == null) result = caseTypeTypeMateriel(typeTypeConsommable);
				if (result == null) result = caseTypeType(typeTypeConsommable);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeConsommable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME: {
				TypeTypeConsommableSystemeArme typeTypeConsommableSystemeArme = (TypeTypeConsommableSystemeArme)theEObject;
				T result = caseTypeTypeConsommableSystemeArme(typeTypeConsommableSystemeArme);
				if (result == null) result = caseTypeTypeMateriel(typeTypeConsommableSystemeArme);
				if (result == null) result = caseTypeType(typeTypeConsommableSystemeArme);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeConsommableSystemeArme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_ELEMENT_CONTROLE: {
				TypeTypeElementControle typeTypeElementControle = (TypeTypeElementControle)theEObject;
				T result = caseTypeTypeElementControle(typeTypeElementControle);
				if (result == null) result = caseTypeType(typeTypeElementControle);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeElementControle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE: {
				TypeTypeEntiteOrganisationnelle typeTypeEntiteOrganisationnelle = (TypeTypeEntiteOrganisationnelle)theEObject;
				T result = caseTypeTypeEntiteOrganisationnelle(typeTypeEntiteOrganisationnelle);
				if (result == null) result = caseTypeType(typeTypeEntiteOrganisationnelle);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeEntiteOrganisationnelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT: {
				TypeTypeEquipement typeTypeEquipement = (TypeTypeEquipement)theEObject;
				T result = caseTypeTypeEquipement(typeTypeEquipement);
				if (result == null) result = caseTypeTypeMateriel(typeTypeEquipement);
				if (result == null) result = caseTypeType(typeTypeEquipement);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeEquipement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS: {
				TypeTypeEquipementASS typeTypeEquipementASS = (TypeTypeEquipementASS)theEObject;
				T result = caseTypeTypeEquipementASS(typeTypeEquipementASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ELECTRONIQUE: {
				TypeTypeEquipementElectronique typeTypeEquipementElectronique = (TypeTypeEquipementElectronique)theEObject;
				T result = caseTypeTypeEquipementElectronique(typeTypeEquipementElectronique);
				if (result == null) result = caseTypeTypeEquipement(typeTypeEquipementElectronique);
				if (result == null) result = caseTypeTypeMateriel(typeTypeEquipementElectronique);
				if (result == null) result = caseTypeType(typeTypeEquipementElectronique);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeEquipementElectronique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_FERROVIAIRE: {
				TypeTypeEquipementFerroviaire typeTypeEquipementFerroviaire = (TypeTypeEquipementFerroviaire)theEObject;
				T result = caseTypeTypeEquipementFerroviaire(typeTypeEquipementFerroviaire);
				if (result == null) result = caseTypeTypeEquipement(typeTypeEquipementFerroviaire);
				if (result == null) result = caseTypeTypeMateriel(typeTypeEquipementFerroviaire);
				if (result == null) result = caseTypeType(typeTypeEquipementFerroviaire);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeEquipementFerroviaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_GENIE: {
				TypeTypeEquipementGenie typeTypeEquipementGenie = (TypeTypeEquipementGenie)theEObject;
				T result = caseTypeTypeEquipementGenie(typeTypeEquipementGenie);
				if (result == null) result = caseTypeTypeEquipement(typeTypeEquipementGenie);
				if (result == null) result = caseTypeTypeMateriel(typeTypeEquipementGenie);
				if (result == null) result = caseTypeType(typeTypeEquipementGenie);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeEquipementGenie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_MARITIME: {
				TypeTypeEquipementMaritime typeTypeEquipementMaritime = (TypeTypeEquipementMaritime)theEObject;
				T result = caseTypeTypeEquipementMaritime(typeTypeEquipementMaritime);
				if (result == null) result = caseTypeTypeEquipement(typeTypeEquipementMaritime);
				if (result == null) result = caseTypeTypeMateriel(typeTypeEquipementMaritime);
				if (result == null) result = caseTypeType(typeTypeEquipementMaritime);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeEquipementMaritime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_NRBC: {
				TypeTypeEquipementNRBC typeTypeEquipementNRBC = (TypeTypeEquipementNRBC)theEObject;
				T result = caseTypeTypeEquipementNRBC(typeTypeEquipementNRBC);
				if (result == null) result = caseTypeTypeEquipement(typeTypeEquipementNRBC);
				if (result == null) result = caseTypeTypeMateriel(typeTypeEquipementNRBC);
				if (result == null) result = caseTypeType(typeTypeEquipementNRBC);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeEquipementNRBC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_SYSTEME_ARME: {
				TypeTypeEquipementSystemeArme typeTypeEquipementSystemeArme = (TypeTypeEquipementSystemeArme)theEObject;
				T result = caseTypeTypeEquipementSystemeArme(typeTypeEquipementSystemeArme);
				if (result == null) result = caseTypeTypeConsommableSystemeArme(typeTypeEquipementSystemeArme);
				if (result == null) result = caseTypeTypeMateriel(typeTypeEquipementSystemeArme);
				if (result == null) result = caseTypeType(typeTypeEquipementSystemeArme);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeEquipementSystemeArme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_GROUPE_INDIVIDUS: {
				TypeTypeGroupeIndividus typeTypeGroupeIndividus = (TypeTypeGroupeIndividus)theEObject;
				T result = caseTypeTypeGroupeIndividus(typeTypeGroupeIndividus);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeTypeGroupeIndividus);
				if (result == null) result = caseTypeType(typeTypeGroupeIndividus);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeGroupeIndividus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D: {
				TypeTypeIntervenant3D typeTypeIntervenant3D = (TypeTypeIntervenant3D)theEObject;
				T result = caseTypeTypeIntervenant3D(typeTypeIntervenant3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_ITINERAIRE: {
				TypeTypeItineraire typeTypeItineraire = (TypeTypeItineraire)theEObject;
				T result = caseTypeTypeItineraire(typeTypeItineraire);
				if (result == null) result = caseTypeTypeElementControle(typeTypeItineraire);
				if (result == null) result = caseTypeType(typeTypeItineraire);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeItineraire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_MATERIEL: {
				TypeTypeMateriel typeTypeMateriel = (TypeTypeMateriel)theEObject;
				T result = caseTypeTypeMateriel(typeTypeMateriel);
				if (result == null) result = caseTypeType(typeTypeMateriel);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_MESURE_COORDINATION: {
				TypeTypeMesureCoordination typeTypeMesureCoordination = (TypeTypeMesureCoordination)theEObject;
				T result = caseTypeTypeMesureCoordination(typeTypeMesureCoordination);
				if (result == null) result = caseTypeTypeElementControle(typeTypeMesureCoordination);
				if (result == null) result = caseTypeType(typeTypeMesureCoordination);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeMesureCoordination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE: {
				TypeTypeMissionAerienne typeTypeMissionAerienne = (TypeTypeMissionAerienne)theEObject;
				T result = caseTypeTypeMissionAerienne(typeTypeMissionAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_MISSION_I3D: {
				TypeTypeMissionI3D typeTypeMissionI3D = (TypeTypeMissionI3D)theEObject;
				T result = caseTypeTypeMissionI3D(typeTypeMissionI3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_MOYEN_MANQUANT: {
				TypeTypeMoyenManquant typeTypeMoyenManquant = (TypeTypeMoyenManquant)theEObject;
				T result = caseTypeTypeMoyenManquant(typeTypeMoyenManquant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_MUNITION: {
				TypeTypeMunition typeTypeMunition = (TypeTypeMunition)theEObject;
				T result = caseTypeTypeMunition(typeTypeMunition);
				if (result == null) result = caseTypeTypeConsommable(typeTypeMunition);
				if (result == null) result = caseTypeTypeMateriel(typeTypeMunition);
				if (result == null) result = caseTypeType(typeTypeMunition);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeMunition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_MUNITION_SYSTEME_ARME: {
				TypeTypeMunitionSystemeArme typeTypeMunitionSystemeArme = (TypeTypeMunitionSystemeArme)theEObject;
				T result = caseTypeTypeMunitionSystemeArme(typeTypeMunitionSystemeArme);
				if (result == null) result = caseTypeTypeConsommableSystemeArme(typeTypeMunitionSystemeArme);
				if (result == null) result = caseTypeTypeMateriel(typeTypeMunitionSystemeArme);
				if (result == null) result = caseTypeType(typeTypeMunitionSystemeArme);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeMunitionSystemeArme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS: {
				TypeTypeObjectifASS typeTypeObjectifASS = (TypeTypeObjectifASS)theEObject;
				T result = caseTypeTypeObjectifASS(typeTypeObjectifASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR: {
				TypeTypeObjectifMajeur typeTypeObjectifMajeur = (TypeTypeObjectifMajeur)theEObject;
				T result = caseTypeTypeObjectifMajeur(typeTypeObjectifMajeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_OBSTACLE: {
				TypeTypeObstacle typeTypeObstacle = (TypeTypeObstacle)theEObject;
				T result = caseTypeTypeObstacle(typeTypeObstacle);
				if (result == null) result = caseTypeTypeSite(typeTypeObstacle);
				if (result == null) result = caseTypeType(typeTypeObstacle);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeObstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE: {
				TypeTypeOrganisationGouvernementale typeTypeOrganisationGouvernementale = (TypeTypeOrganisationGouvernementale)theEObject;
				T result = caseTypeTypeOrganisationGouvernementale(typeTypeOrganisationGouvernementale);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeTypeOrganisationGouvernementale);
				if (result == null) result = caseTypeType(typeTypeOrganisationGouvernementale);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeOrganisationGouvernementale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_ORGANISATION_MILITAIRE_EXECUTIVE: {
				TypeTypeOrganisationMilitaireExecutive typeTypeOrganisationMilitaireExecutive = (TypeTypeOrganisationMilitaireExecutive)theEObject;
				T result = caseTypeTypeOrganisationMilitaireExecutive(typeTypeOrganisationMilitaireExecutive);
				if (result == null) result = caseTypeTypeOrganisationGouvernementale(typeTypeOrganisationMilitaireExecutive);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeTypeOrganisationMilitaireExecutive);
				if (result == null) result = caseTypeType(typeTypeOrganisationMilitaireExecutive);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeOrganisationMilitaireExecutive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE: {
				TypeTypeOrganisationPrivee typeTypeOrganisationPrivee = (TypeTypeOrganisationPrivee)theEObject;
				T result = caseTypeTypeOrganisationPrivee(typeTypeOrganisationPrivee);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeTypeOrganisationPrivee);
				if (result == null) result = caseTypeType(typeTypeOrganisationPrivee);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeOrganisationPrivee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_PERSONNE: {
				TypeTypePersonne typeTypePersonne = (TypeTypePersonne)theEObject;
				T result = caseTypeTypePersonne(typeTypePersonne);
				if (result == null) result = caseTypeType(typeTypePersonne);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypePersonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_PONT: {
				TypeTypePont typeTypePont = (TypeTypePont)theEObject;
				T result = caseTypeTypePont(typeTypePont);
				if (result == null) result = caseTypeTypeSite(typeTypePont);
				if (result == null) result = caseTypeType(typeTypePont);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypePont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_PORT: {
				TypeTypePort typeTypePort = (TypeTypePort)theEObject;
				T result = caseTypeTypePort(typeTypePort);
				if (result == null) result = caseTypeTypeSite(typeTypePort);
				if (result == null) result = caseTypeType(typeTypePort);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_PORTEUR: {
				TypeTypePorteur typeTypePorteur = (TypeTypePorteur)theEObject;
				T result = caseTypeTypePorteur(typeTypePorteur);
				if (result == null) result = caseTypeType(typeTypePorteur);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypePorteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_POSTE_CIVIL: {
				TypeTypePosteCivil typeTypePosteCivil = (TypeTypePosteCivil)theEObject;
				T result = caseTypeTypePosteCivil(typeTypePosteCivil);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeTypePosteCivil);
				if (result == null) result = caseTypeType(typeTypePosteCivil);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypePosteCivil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE: {
				TypeTypePosteMilitaire typeTypePosteMilitaire = (TypeTypePosteMilitaire)theEObject;
				T result = caseTypeTypePosteMilitaire(typeTypePosteMilitaire);
				if (result == null) result = caseTypeTypeOrganisationGouvernementale(typeTypePosteMilitaire);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeTypePosteMilitaire);
				if (result == null) result = caseTypeType(typeTypePosteMilitaire);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypePosteMilitaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_REGROUPEMENT_FORCE: {
				TypeTypeRegroupementForce typeTypeRegroupementForce = (TypeTypeRegroupementForce)theEObject;
				T result = caseTypeTypeRegroupementForce(typeTypeRegroupementForce);
				if (result == null) result = caseTypeTypeOrganisationGouvernementale(typeTypeRegroupementForce);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeTypeRegroupementForce);
				if (result == null) result = caseTypeType(typeTypeRegroupementForce);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeRegroupementForce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_REPARTITION: {
				TypeTypeRepartition typeTypeRepartition = (TypeTypeRepartition)theEObject;
				T result = caseTypeTypeRepartition(typeTypeRepartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_SITE: {
				TypeTypeSite typeTypeSite = (TypeTypeSite)theEObject;
				T result = caseTypeTypeSite(typeTypeSite);
				if (result == null) result = caseTypeType(typeTypeSite);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN: {
				TypeTypeSousMarin typeTypeSousMarin = (TypeTypeSousMarin)theEObject;
				T result = caseTypeTypeSousMarin(typeTypeSousMarin);
				if (result == null) result = caseTypeTypeBatiment(typeTypeSousMarin);
				if (result == null) result = caseTypeTypeEquipement(typeTypeSousMarin);
				if (result == null) result = caseTypeTypeMateriel(typeTypeSousMarin);
				if (result == null) result = caseTypeType(typeTypeSousMarin);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeSousMarin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME: {
				TypeTypeSousSysteme typeTypeSousSysteme = (TypeTypeSousSysteme)theEObject;
				T result = caseTypeTypeSousSysteme(typeTypeSousSysteme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_UNITE: {
				TypeTypeUnite typeTypeUnite = (TypeTypeUnite)theEObject;
				T result = caseTypeTypeUnite(typeTypeUnite);
				if (result == null) result = caseTypeTypeOrganisationGouvernementale(typeTypeUnite);
				if (result == null) result = caseTypeTypeEntiteOrganisationnelle(typeTypeUnite);
				if (result == null) result = caseTypeType(typeTypeUnite);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeUnite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_TYPE_VEHICULE: {
				TypeTypeVehicule typeTypeVehicule = (TypeTypeVehicule)theEObject;
				T result = caseTypeTypeVehicule(typeTypeVehicule);
				if (result == null) result = caseTypeTypeEquipement(typeTypeVehicule);
				if (result == null) result = caseTypeTypeMateriel(typeTypeVehicule);
				if (result == null) result = caseTypeType(typeTypeVehicule);
				if (result == null) result = caseTypeRacineOperationnelle(typeTypeVehicule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE: {
				TypeUnite typeUnite = (TypeUnite)theEObject;
				T result = caseTypeUnite(typeUnite);
				if (result == null) result = caseTypeEntiteOrganisationnelle(typeUnite);
				if (result == null) result = caseTypeInstanceObjet(typeUnite);
				if (result == null) result = caseTypeRacineOperationnelle(typeUnite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE4_D: {
				TypeUnite4D typeUnite4D = (TypeUnite4D)theEObject;
				T result = caseTypeUnite4D(typeUnite4D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE_AIR: {
				TypeUniteAir typeUniteAir = (TypeUniteAir)theEObject;
				T result = caseTypeUniteAir(typeUniteAir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE_ASS: {
				TypeUniteASS typeUniteASS = (TypeUniteASS)theEObject;
				T result = caseTypeUniteASS(typeUniteASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL: {
				TypeUniteBeneficiaireMateriel typeUniteBeneficiaireMateriel = (TypeUniteBeneficiaireMateriel)theEObject;
				T result = caseTypeUniteBeneficiaireMateriel(typeUniteBeneficiaireMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE_COOPERANTE: {
				TypeUniteCooperante typeUniteCooperante = (TypeUniteCooperante)theEObject;
				T result = caseTypeUniteCooperante(typeUniteCooperante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE: {
				TypeUniteLogistique typeUniteLogistique = (TypeUniteLogistique)theEObject;
				T result = caseTypeUniteLogistique(typeUniteLogistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE_MAINTENANCE: {
				TypeUniteMaintenance typeUniteMaintenance = (TypeUniteMaintenance)theEObject;
				T result = caseTypeUniteMaintenance(typeUniteMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE_MATERIEL: {
				TypeUniteMateriel typeUniteMateriel = (TypeUniteMateriel)theEObject;
				T result = caseTypeUniteMateriel(typeUniteMateriel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE: {
				TypeUniteParticipante typeUniteParticipante = (TypeUniteParticipante)theEObject;
				T result = caseTypeUniteParticipante(typeUniteParticipante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_UTILISATION_IFF: {
				TypeUtilisationIFF typeUtilisationIFF = (TypeUtilisationIFF)theEObject;
				T result = caseTypeUtilisationIFF(typeUtilisationIFF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL: {
				TypeVarianteTravail typeVarianteTravail = (TypeVarianteTravail)theEObject;
				T result = caseTypeVarianteTravail(typeVarianteTravail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VEHICULE: {
				TypeVehicule typeVehicule = (TypeVehicule)theEObject;
				T result = caseTypeVehicule(typeVehicule);
				if (result == null) result = caseTypeMateriel(typeVehicule);
				if (result == null) result = caseTypeInstanceObjet(typeVehicule);
				if (result == null) result = caseTypeRacineOperationnelle(typeVehicule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL: {
				TypeVehiculeExceptionnel typeVehiculeExceptionnel = (TypeVehiculeExceptionnel)theEObject;
				T result = caseTypeVehiculeExceptionnel(typeVehiculeExceptionnel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VENT: {
				TypeVent typeVent = (TypeVent)theEObject;
				T result = caseTypeVent(typeVent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VISIBILITE: {
				TypeVisibilite typeVisibilite = (TypeVisibilite)theEObject;
				T result = caseTypeVisibilite(typeVisibilite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF: {
				TypeVisibiliteSurObjectif typeVisibiliteSurObjectif = (TypeVisibiliteSurObjectif)theEObject;
				T result = caseTypeVisibiliteSurObjectif(typeVisibiliteSurObjectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VOL: {
				TypeVol typeVol = (TypeVol)theEObject;
				T result = caseTypeVol(typeVol);
				if (result == null) result = caseTypeRacineOperationnelle(typeVol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE: {
				TypeVolumeGeometrique typeVolumeGeometrique = (TypeVolumeGeometrique)theEObject;
				T result = caseTypeVolumeGeometrique(typeVolumeGeometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS: {
				TypeVolumeMunitionsASS typeVolumeMunitionsASS = (TypeVolumeMunitionsASS)theEObject;
				T result = caseTypeVolumeMunitionsASS(typeVolumeMunitionsASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS: {
				TypeVolumeSecuriteASS typeVolumeSecuriteASS = (TypeVolumeSecuriteASS)theEObject;
				T result = caseTypeVolumeSecuriteASS(typeVolumeSecuriteASS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE: {
				TypeZDVparPeriode typeZDVparPeriode = (TypeZDVparPeriode)theEObject;
				T result = caseTypeZDVparPeriode(typeZDVparPeriode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_ACQUISITION: {
				TypeZoneAcquisition typeZoneAcquisition = (TypeZoneAcquisition)theEObject;
				T result = caseTypeZoneAcquisition(typeZoneAcquisition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_AERIENNE: {
				TypeZoneAerienne typeZoneAerienne = (TypeZoneAerienne)theEObject;
				T result = caseTypeZoneAerienne(typeZoneAerienne);
				if (result == null) result = caseTypeElementControle(typeZoneAerienne);
				if (result == null) result = caseTypeInstanceObjet(typeZoneAerienne);
				if (result == null) result = caseTypeRacineOperationnelle(typeZoneAerienne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_ALAT: {
				TypeZoneAlat typeZoneAlat = (TypeZoneAlat)theEObject;
				T result = caseTypeZoneAlat(typeZoneAlat);
				if (result == null) result = caseTypeElementControle(typeZoneAlat);
				if (result == null) result = caseTypeInstanceObjet(typeZoneAlat);
				if (result == null) result = caseTypeRacineOperationnelle(typeZoneAlat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_COUVERTE: {
				TypeZoneCouverte typeZoneCouverte = (TypeZoneCouverte)theEObject;
				T result = caseTypeZoneCouverte(typeZoneCouverte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_DIFFUSION: {
				TypeZoneDiffusion typeZoneDiffusion = (TypeZoneDiffusion)theEObject;
				T result = caseTypeZoneDiffusion(typeZoneDiffusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE: {
				TypeZoneFonctionnelleLogistique typeZoneFonctionnelleLogistique = (TypeZoneFonctionnelleLogistique)theEObject;
				T result = caseTypeZoneFonctionnelleLogistique(typeZoneFonctionnelleLogistique);
				if (result == null) result = caseTypeElementControle(typeZoneFonctionnelleLogistique);
				if (result == null) result = caseTypeInstanceObjet(typeZoneFonctionnelleLogistique);
				if (result == null) result = caseTypeRacineOperationnelle(typeZoneFonctionnelleLogistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_INTERVENTION: {
				TypeZoneIntervention typeZoneIntervention = (TypeZoneIntervention)theEObject;
				T result = caseTypeZoneIntervention(typeZoneIntervention);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE: {
				TypeZoneLogistique typeZoneLogistique = (TypeZoneLogistique)theEObject;
				T result = caseTypeZoneLogistique(typeZoneLogistique);
				if (result == null) result = caseTypeElementControle(typeZoneLogistique);
				if (result == null) result = caseTypeInstanceObjet(typeZoneLogistique);
				if (result == null) result = caseTypeRacineOperationnelle(typeZoneLogistique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE: {
				TypeZoneMiseATerre typeZoneMiseATerre = (TypeZoneMiseATerre)theEObject;
				T result = caseTypeZoneMiseATerre(typeZoneMiseATerre);
				if (result == null) result = caseTypeElementControle(typeZoneMiseATerre);
				if (result == null) result = caseTypeInstanceObjet(typeZoneMiseATerre);
				if (result == null) result = caseTypeRacineOperationnelle(typeZoneMiseATerre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_RECHERCHE: {
				TypeZoneRecherche typeZoneRecherche = (TypeZoneRecherche)theEObject;
				T result = caseTypeZoneRecherche(typeZoneRecherche);
				if (result == null) result = caseTypeElementControle(typeZoneRecherche);
				if (result == null) result = caseTypeInstanceObjet(typeZoneRecherche);
				if (result == null) result = caseTypeRacineOperationnelle(typeZoneRecherche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_RISQUE: {
				TypeZoneRisque typeZoneRisque = (TypeZoneRisque)theEObject;
				T result = caseTypeZoneRisque(typeZoneRisque);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONE_SECURITE: {
				TypeZoneSecurite typeZoneSecurite = (TypeZoneSecurite)theEObject;
				T result = caseTypeZoneSecurite(typeZoneSecurite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES: {
				TypeZonesImplantationProposees typeZonesImplantationProposees = (TypeZonesImplantationProposees)theEObject;
				T result = caseTypeZonesImplantationProposees(typeZonesImplantationProposees);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAction(TypeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Action3 Deni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Action3 Deni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAction3Deni(TypeAction3Deni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Action AS Aeni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Action AS Aeni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeActionASAeni(TypeActionASAeni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Action Genie ENI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Action Genie ENI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeActionGenieENI(TypeActionGenieENI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Action Renseignement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Action Renseignement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeActionRenseignement(TypeActionRenseignement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeActivite(TypeActivite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Activite Posture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Activite Posture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeActivitePosture(TypeActivitePosture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Activite Sur Point Controle3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Activite Sur Point Controle3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeActiviteSurPointControle3D(TypeActiviteSurPointControle3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Adresse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Adresse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAdresse(TypeAdresse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Adresse Electronique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Adresse Electronique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAdresseElectronique(TypeAdresseElectronique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Adresse Physique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Adresse Physique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAdressePhysique(TypeAdressePhysique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Adresse Radio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Adresse Radio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAdresseRadio(TypeAdresseRadio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Aerodrome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Aerodrome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAerodrome(TypeAerodrome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Aeronef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Aeronef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAeronef(TypeAeronef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Affiliation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Affiliation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAffiliation(TypeAffiliation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Aire Piste Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Aire Piste Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAirePisteGeometrique(TypeAirePisteGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Aire Polyarc Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Aire Polyarc Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAirePolyarcGeometrique(TypeAirePolyarcGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Aire Polygone Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Aire Polygone Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAirePolygoneGeometrique(TypeAirePolygoneGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Aire Stationnement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Aire Stationnement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAireStationnement(TypeAireStationnement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Alerte Frappe Nucleaire Amie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Alerte Frappe Nucleaire Amie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAlerteFrappeNucleaireAmie(TypeAlerteFrappeNucleaireAmie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Allure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Allure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAllure(TypeAllure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Annulation IFF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Annulation IFF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAnnulationIFF(TypeAnnulationIFF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Annulation Interdiction Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Annulation Interdiction Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAnnulationInterdictionTir(TypeAnnulationInterdictionTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Apercu Destinataire Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Apercu Destinataire Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeApercuDestinatairePlanOuOrdre(TypeApercuDestinatairePlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Appui Feu Helicoptere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Appui Feu Helicoptere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAppuiFeuHelicoptere(TypeAppuiFeuHelicoptere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Armement Mission Appui Aerien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Armement Mission Appui Aerien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArmementMissionAppuiAerien(TypeArmementMissionAppuiAerien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Articulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Articulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArticulation(TypeArticulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Articulation ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Articulation ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArticulationASS(TypeArticulationASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Articulation Logistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Articulation Logistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArticulationLogistique(TypeArticulationLogistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Articulation Marine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Articulation Marine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArticulationMarine(TypeArticulationMarine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Articulation Soutien Medical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Articulation Soutien Medical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArticulationSoutienMedical(TypeArticulationSoutienMedical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Articulation Terre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Articulation Terre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArticulationTerre(TypeArticulationTerre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Assoc Activite Contexte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Assoc Activite Contexte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssocActiviteContexte(TypeAssocActiviteContexte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Assoc Consigne Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Assoc Consigne Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssocConsigneLocalisation(TypeAssocConsigneLocalisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Assoc Contexte Contexte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Assoc Contexte Contexte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssocContexteContexte(TypeAssocContexteContexte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Assoc Contexte Instance Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Assoc Contexte Instance Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssocContexteInstanceObjet(TypeAssocContexteInstanceObjet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Assoc Entite Org Type Entite Org</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Assoc Entite Org Type Entite Org</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssocEntiteOrgTypeEntiteOrg(TypeAssocEntiteOrgTypeEntiteOrg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Action Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Action Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationActionAction(TypeAssociationActionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Action Autre Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Action Autre Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationActionAutreEvenement(TypeAssociationActionAutreEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Action Evenement NRBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Action Evenement NRBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationActionEvenementNRBC(TypeAssociationActionEvenementNRBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Activite Capacite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Activite Capacite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationActiviteCapacite(TypeAssociationActiviteCapacite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Activite Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Activite Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationActiviteLocalisation(TypeAssociationActiviteLocalisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Affiliation Affiliation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Affiliation Affiliation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationAffiliationAffiliation(TypeAssociationAffiliationAffiliation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Affiliation Instance Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Affiliation Instance Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationAffiliationInstanceObjet(TypeAssociationAffiliationInstanceObjet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Affiliation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Affiliation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationAffiliationType(TypeAssociationAffiliationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Autre Evenement Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Autre Evenement Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationAutreEvenementAction(TypeAssociationAutreEvenementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Autre Evenement Autre Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Autre Evenement Autre Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationAutreEvenementAutreEvenement(TypeAssociationAutreEvenementAutreEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Autre Evenement Evenement NRBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Autre Evenement Evenement NRBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationAutreEvenementEvenementNRBC(TypeAssociationAutreEvenementEvenementNRBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Conflit3 DMission Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Conflit3 DMission Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationConflit3DMissionAerienne(TypeAssociationConflit3DMissionAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Consommablel Majeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Consommablel Majeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationConsommablelMajeur(TypeAssociationConsommablelMajeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Consommation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Consommation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationConsommation(TypeAssociationConsommation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Contenu Paragraphe Plan Ou Ordre Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Contenu Paragraphe Plan Ou Ordre Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationContenuParagraphePlanOuOrdreDocument(TypeAssociationContenuParagraphePlanOuOrdreDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Contexte Rapport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Contexte Rapport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationContexteRapport(TypeAssociationContexteRapport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Convoi Mouvement Par Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Convoi Mouvement Par Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationConvoiMouvementParRoute(TypeAssociationConvoiMouvementParRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Dep Evacuation Dep Evacuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Dep Evacuation Dep Evacuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationDepEvacuationDepEvacuation(TypeAssociationDepEvacuationDepEvacuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Document Capacite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Document Capacite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationDocumentCapacite(TypeAssociationDocumentCapacite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Element Controle Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Element Controle Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationElementControleEvenement(TypeAssociationElementControleEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Element Topographie Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Element Topographie Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationElementTopographieEvenement(TypeAssociationElementTopographieEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Elt Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Elt Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEltCtrlEltCtrl(TypeAssociationEltCtrlEltCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Elt Topo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Elt Topo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEltCtrlEltTopo(TypeAssociationEltCtrlEltTopo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEltCtrlMateriel(TypeAssociationEltCtrlMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEltCtrlSite(TypeAssociationEltCtrlSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Type Elt Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Elt Ctrl Type Elt Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEltCtrlTypeEltCtrl(TypeAssociationEltCtrlTypeEltCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Elt Topo Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Elt Topo Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEltTopoSite(TypeAssociationEltTopoSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Org Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Org Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrgAction(TypeAssociationEntiteOrgAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Organisationnelle Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Organisationnelle Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrganisationnellePlanOuOrdre(TypeAssociationEntiteOrganisationnellePlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Org Elt Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Org Elt Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrgEltCtrl(TypeAssociationEntiteOrgEltCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Org Elt Topo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Org Elt Topo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrgEltTopo(TypeAssociationEntiteOrgEltTopo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Org Entite Org</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Org Entite Org</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrgEntiteOrg(TypeAssociationEntiteOrgEntiteOrg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Org Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Org Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrgEvenement(TypeAssociationEntiteOrgEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Org Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Org Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrgMateriel(TypeAssociationEntiteOrgMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Org Objet Inconnu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Org Objet Inconnu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrgObjetInconnu(TypeAssociationEntiteOrgObjetInconnu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Org Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Org Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrgPersonne(TypeAssociationEntiteOrgPersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Entite Org Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Entite Org Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEntiteOrgSite(TypeAssociationEntiteOrgSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Equipementl Majeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Equipementl Majeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEquipementlMajeur(TypeAssociationEquipementlMajeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Evenement NRBC Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Evenement NRBC Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEvenementNRBCAction(TypeAssociationEvenementNRBCAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Evenement NRBC Autre Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Evenement NRBC Autre Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEvenementNRBCAutreEvenement(TypeAssociationEvenementNRBCAutreEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Evenement NRBC Evenement NRBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Evenement NRBC Evenement NRBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEvenementNRBCEvenementNRBC(TypeAssociationEvenementNRBCEvenementNRBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Evenement RENS Autre Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Evenement RENS Autre Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEvenementRENSAutreEvenement(TypeAssociationEvenementRENSAutreEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Evenement RENS Evenement RENS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Evenement RENS Evenement RENS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEvenementRENSEvenementRENS(TypeAssociationEvenementRENSEvenementRENS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Fonctionnelle Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Fonctionnelle Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationFonctionnelleActivite(TypeAssociationFonctionnelleActivite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Groupe Info Ops Entite Organisationnelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Groupe Info Ops Entite Organisationnelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationGroupeInfoOpsEntiteOrganisationnelle(TypeAssociationGroupeInfoOpsEntiteOrganisationnelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Groupe Info Ops Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Groupe Info Ops Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationGroupeInfoOpsPlanOuOrdre(TypeAssociationGroupeInfoOpsPlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Horaire Manoeuvre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Horaire Manoeuvre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationHoraireManoeuvre(TypeAssociationHoraireManoeuvre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Instance Objet Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Instance Objet Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationInstanceObjetActivite(TypeAssociationInstanceObjetActivite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Instance Objet Adresse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Instance Objet Adresse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationInstanceObjetAdresse(TypeAssociationInstanceObjetAdresse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Instance Objet Capacite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Instance Objet Capacite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationInstanceObjetCapacite(TypeAssociationInstanceObjetCapacite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Instance Objet Instance Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Instance Objet Instance Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationInstanceObjetInstanceObjet(TypeAssociationInstanceObjetInstanceObjet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Instance Objet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Instance Objet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationInstanceObjetType(TypeAssociationInstanceObjetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Livraison Livaison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Livraison Livaison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationLivraisonLivaison(TypeAssociationLivraisonLivaison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Materiel Elt Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Materiel Elt Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMaterielEltCtrl(TypeAssociationMaterielEltCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Materiel Elt Topo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Materiel Elt Topo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMaterielEltTopo(TypeAssociationMaterielEltTopo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Materiel Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Materiel Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMaterielEvenement(TypeAssociationMaterielEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Materiel Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Materiel Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMaterielMateriel(TypeAssociationMaterielMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Materiel Meteorologie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Materiel Meteorologie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMaterielMeteorologie(TypeAssociationMaterielMeteorologie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Materiel Objet Inconnu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Materiel Objet Inconnu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMaterielObjetInconnu(TypeAssociationMaterielObjetInconnu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Materiel Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Materiel Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMaterielPersonne(TypeAssociationMaterielPersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Materiel Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Materiel Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMaterielSite(TypeAssociationMaterielSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Materiel Type Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Materiel Type Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMaterielTypeMateriel(TypeAssociationMaterielTypeMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mesure Coordination Plan Feux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mesure Coordination Plan Feux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMesureCoordinationPlanFeux(TypeAssociationMesureCoordinationPlanFeux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mesure Coord Mission Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mesure Coord Mission Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMesureCoordMissionAerienne(TypeAssociationMesureCoordMissionAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Meteorologie Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Meteorologie Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMeteorologieSite(TypeAssociationMeteorologieSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mission Aerienne Mission Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mission Aerienne Mission Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMissionAerienneMissionAerienne(TypeAssociationMissionAerienneMissionAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mission Genie Mission Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mission Genie Mission Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMissionGenieMissionGenie(TypeAssociationMissionGenieMissionGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mission Melee Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mission Melee Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMissionMeleeAction(TypeAssociationMissionMeleeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mission Mouvement Mission Mouvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mission Mouvement Mission Mouvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMissionMouvementMissionMouvement(TypeAssociationMissionMouvementMissionMouvement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mission Renseignement Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mission Renseignement Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMissionRenseignementAction(TypeAssociationMissionRenseignementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mission Rens Obj Plan Traitement Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mission Rens Obj Plan Traitement Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMissionRensObjPlanTraitementObj(TypeAssociationMissionRensObjPlanTraitementObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mission Rens Obj Traitement Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mission Rens Obj Traitement Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMissionRensObjTraitementObj(TypeAssociationMissionRensObjTraitementObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Mouvement Par Route Mouvement Par Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Mouvement Par Route Mouvement Par Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationMouvementParRouteMouvementParRoute(TypeAssociationMouvementParRouteMouvementParRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Objectif Activite Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Objectif Activite Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationObjectifActiviteLocalisation(TypeAssociationObjectifActiviteLocalisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Objectif Ciblage Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Objectif Ciblage Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationObjectifCiblageDocument(TypeAssociationObjectifCiblageDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Objectif Ciblage Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Objectif Ciblage Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationObjectifCiblageLocalisation(TypeAssociationObjectifCiblageLocalisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Objectif Ciblage Objectif Ciblage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Objectif Ciblage Objectif Ciblage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationObjectifCiblageObjectifCiblage(TypeAssociationObjectifCiblageObjectifCiblage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Objet Inconnu Elt Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Objet Inconnu Elt Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationObjetInconnuEltCtrl(TypeAssociationObjetInconnuEltCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Objet Inconnu Elt Topo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Objet Inconnu Elt Topo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationObjetInconnuEltTopo(TypeAssociationObjetInconnuEltTopo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Objet Inconnu Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Objet Inconnu Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationObjetInconnuSite(TypeAssociationObjetInconnuSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Observation Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Observation Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationObservationObservation(TypeAssociationObservationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Paragraphe POparagraphe PO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Paragraphe POparagraphe PO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationParagraphePOparagraphePO(TypeAssociationParagraphePOparagraphePO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Elt Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Elt Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonneEltCtrl(TypeAssociationPersonneEltCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Elt Topo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Elt Topo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonneEltTopo(TypeAssociationPersonneEltTopo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonneEvenement(TypeAssociationPersonneEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonneMateriel(TypeAssociationPersonneMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Mission Air</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Mission Air</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonneMissionAir(TypeAssociationPersonneMissionAir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Objet Inconnu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Objet Inconnu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonneObjetInconnu(TypeAssociationPersonneObjetInconnu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonnePersonne(TypeAssociationPersonnePersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Planif Operation3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Planif Operation3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonnePlanifOperation3D(TypeAssociationPersonnePlanifOperation3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonneSite(TypeAssociationPersonneSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Personne Type Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Personne Type Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPersonneTypePersonne(TypeAssociationPersonneTypePersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Planification Operation3 DMission Air</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Planification Operation3 DMission Air</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPlanificationOperation3DMissionAir(TypeAssociationPlanificationOperation3DMissionAir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Planification Operation3 DMission ASA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Planification Operation3 DMission ASA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPlanificationOperation3DMissionASA(TypeAssociationPlanificationOperation3DMissionASA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Plan Ou Ordre Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Plan Ou Ordre Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPlanOuOrdrePlanOuOrdre(TypeAssociationPlanOuOrdrePlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Plan Traitement Obj Traitement Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Plan Traitement Obj Traitement Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationPlanTraitementObjTraitementObj(TypeAssociationPlanTraitementObjTraitementObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Profil Dotation Theorique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Profil Dotation Theorique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationProfilDotationTheorique(TypeAssociationProfilDotationTheorique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Profil Unite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Profil Unite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationProfilUnite(TypeAssociationProfilUnite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Racine Operationnelle Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Racine Operationnelle Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationRacineOperationnelleDocument(TypeAssociationRacineOperationnelleDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Renseignement Obj Mis Renseignement Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Renseignement Obj Mis Renseignement Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationRenseignementObjMisRenseignementObj(TypeAssociationRenseignementObjMisRenseignementObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Site Elt Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Site Elt Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationSiteEltCtrl(TypeAssociationSiteEltCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Site Elt Topo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Site Elt Topo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationSiteEltTopo(TypeAssociationSiteEltTopo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Site Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Site Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationSiteEvenement(TypeAssociationSiteEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Site Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Site Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationSiteMateriel(TypeAssociationSiteMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Site Meteorologie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Site Meteorologie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationSiteMeteorologie(TypeAssociationSiteMeteorologie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Site Objet Inconnu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Site Objet Inconnu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationSiteObjetInconnu(TypeAssociationSiteObjetInconnu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Site Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Site Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationSiteSite(TypeAssociationSiteSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Site Type Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Site Type Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationSiteTypeSite(TypeAssociationSiteTypeSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Synthese Detections Evenement NRBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Synthese Detections Evenement NRBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationSyntheseDetectionsEvenementNRBC(TypeAssociationSyntheseDetectionsEvenementNRBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Temporelle Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Temporelle Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationTemporelleActivite(TypeAssociationTemporelleActivite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Traitement Obj Plan Traitement Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Traitement Obj Plan Traitement Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationTraitementObjPlanTraitementObj(TypeAssociationTraitementObjPlanTraitementObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Type Capacite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Type Capacite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationTypeCapacite(TypeAssociationTypeCapacite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Appui Feu Helicoptere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Appui Feu Helicoptere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteAppuiFeuHelicoptere(TypeAssociationUniteAppuiFeuHelicoptere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Autre Mission Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Autre Mission Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteAutreMissionLog(TypeAssociationUniteAutreMissionLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Livraison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Livraison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteLivraison(TypeAssociationUniteLivraison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Acq ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Acq ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionAcqASS(TypeAssociationUniteMissionAcqASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionAerienne(TypeAssociationUniteMissionAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Air</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Air</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionAir(TypeAssociationUniteMissionAir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission ALA Tattaque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission ALA Tattaque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionALATattaque(TypeAssociationUniteMissionALATattaque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission ASA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission ASA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionASA(TypeAssociationUniteMissionASA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Escorte AF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Escorte AF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionEscorteAF(TypeAssociationUniteMissionEscorteAF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionGenie(TypeAssociationUniteMissionGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Melee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Melee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionMelee(TypeAssociationUniteMissionMelee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Rens Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Rens Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionRensObj(TypeAssociationUniteMissionRensObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Sic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Sic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionSic(TypeAssociationUniteMissionSic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Transp Tact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Transp Tact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionTranspTact(TypeAssociationUniteMissionTranspTact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mission Unite Antichar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mission Unite Antichar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMissionUniteAntichar(TypeAssociationUniteMissionUniteAntichar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Mouvement Par Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Mouvement Par Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteMouvementParRoute(TypeAssociationUniteMouvementParRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Plan Feux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Plan Feux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUnitePlanFeux(TypeAssociationUnitePlanFeux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Planif Operation3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Planif Operation3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUnitePlanifOperation3D(TypeAssociationUnitePlanifOperation3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association Unite Renforcements Feux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association Unite Renforcements Feux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationUniteRenforcementsFeux(TypeAssociationUniteRenforcementsFeux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Assoc Instance Objet Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Assoc Instance Objet Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssocInstanceObjetLocalisation(TypeAssocInstanceObjetLocalisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Assoc Liste Obj Cand Liste Obj Cand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Assoc Liste Obj Cand Liste Obj Cand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssocListeObjCandListeObjCand(TypeAssocListeObjCandListeObjCand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Assoc Piste Atter Dir App Air</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Assoc Piste Atter Dir App Air</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssocPisteAtterDirAppAir(TypeAssocPisteAtterDirAppAir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Assoc Symbole Tactique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Assoc Symbole Tactique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssocSymboleTactique(TypeAssocSymboleTactique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Atmosphere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Atmosphere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAtmosphere(TypeAtmosphere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autonomie Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autonomie Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutonomieModule(TypeAutonomieModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autorisation Liste Objectifs Candidats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autorisation Liste Objectifs Candidats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutorisationListeObjectifsCandidats(TypeAutorisationListeObjectifsCandidats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autorisation Objectif Ciblage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autorisation Objectif Ciblage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutorisationObjectifCiblage(TypeAutorisationObjectifCiblage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreAction(TypeAutreAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Adresse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Adresse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreAdresse(TypeAutreAdresse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Affiliation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Affiliation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreAffiliation(TypeAutreAffiliation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Articulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Articulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreArticulation(TypeAutreArticulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Capteur RENS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Capteur RENS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreCapteurRENS(TypeAutreCapteurRENS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Contexte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Contexte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreContexte(TypeAutreContexte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Dotation Effective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Dotation Effective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreDotationEffective(TypeAutreDotationEffective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Element Controle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Element Controle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreElementControle(TypeAutreElementControle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Emploi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Emploi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreEmploi(TypeAutreEmploi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreEvenement(TypeAutreEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Evenement NRBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Evenement NRBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreEvenementNRBC(TypeAutreEvenementNRBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Evenement Nucleaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Evenement Nucleaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreEvenementNucleaire(TypeAutreEvenementNucleaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Evenement Radioactif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Evenement Radioactif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreEvenementRadioactif(TypeAutreEvenementRadioactif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Liste Objectifs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Liste Objectifs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreListeObjectifs(TypeAutreListeObjectifs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreMateriel(TypeAutreMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Menace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Menace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreMenace(TypeAutreMenace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreMission(TypeAutreMission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Mission ALAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Mission ALAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreMissionALAT(TypeAutreMissionALAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Mission Logistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Mission Logistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreMissionLogistique(TypeAutreMissionLogistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Nom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Nom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreNom(TypeAutreNom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Objectif Activite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Objectif Activite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreObjectifActiviteType(TypeAutreObjectifActiviteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Obstacle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreObstacle(TypeAutreObstacle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Phenomene Meteorologique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Phenomene Meteorologique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Segment Itineraire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Segment Itineraire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreSegmentItineraire(TypeAutreSegmentItineraire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreSite(TypeAutreSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Type Batiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Type Batiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreTypeBatiment(TypeAutreTypeBatiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Type Consommable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Type Consommable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreTypeConsommable(TypeAutreTypeConsommable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Type Consommable Systeme Arme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Type Consommable Systeme Arme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreTypeConsommableSystemeArme(TypeAutreTypeConsommableSystemeArme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Type Element Controle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Type Element Controle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreTypeElementControle(TypeAutreTypeElementControle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Type Entite Organisationnelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Type Entite Organisationnelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreTypeEntiteOrganisationnelle(TypeAutreTypeEntiteOrganisationnelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Type Equipement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Type Equipement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreTypeEquipement(TypeAutreTypeEquipement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Type Organisation Gouvernementale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Type Organisation Gouvernementale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreTypeOrganisationGouvernementale(TypeAutreTypeOrganisationGouvernementale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Autre Type Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Autre Type Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAutreTypeSite(TypeAutreTypeSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Avancement Travail Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Avancement Travail Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAvancementTravailGenie(TypeAvancementTravailGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Axe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Axe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAxe(TypeAxe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Azimut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Azimut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAzimut(TypeAzimut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Base Calcul Necessaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Base Calcul Necessaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBaseCalculNecessaire(TypeBaseCalculNecessaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Bassin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Bassin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBassin(TypeBassin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Batiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Batiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBatiment(TypeBatiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Besoin En Carburant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Besoin En Carburant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBesoinEnCarburant(TypeBesoinEnCarburant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Besoin Raccordement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Besoin Raccordement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBesoinRaccordement(TypeBesoinRaccordement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Besoins En Renseignements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Besoins En Renseignements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBesoinsEnRenseignements(TypeBesoinsEnRenseignements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Bilan Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Bilan Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBilanModule(TypeBilanModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Bilan Tirs ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Bilan Tirs ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBilanTirsASS(TypeBilanTirsASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Bilan Tirs AS Ssur Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Bilan Tirs AS Ssur Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBilanTirsASSsurZone(TypeBilanTirsASSsurZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Blesses Par Periode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Blesses Par Periode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBlessesParPeriode(TypeBlessesParPeriode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Branche Eurogrid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Branche Eurogrid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBrancheEurogrid(TypeBrancheEurogrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Branche Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Branche Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBrancheNavigation(TypeBrancheNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Bulletin Sondage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Bulletin Sondage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBulletinSondage(TypeBulletinSondage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Cale Lancement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Cale Lancement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaleLancement(TypeCaleLancement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Calendrier Courrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Calendrier Courrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCalendrierCourrier(TypeCalendrierCourrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Cale Seche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Cale Seche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaleSeche(TypeCaleSeche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Camp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Camp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCamp(TypeCamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapacite(TypeCapacite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Feux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Feux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteFeux(TypeCapaciteFeux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteGenie(TypeCapaciteGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Hebergement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Hebergement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteHebergement(TypeCapaciteHebergement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteMaintenance(TypeCapaciteMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Manutention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Manutention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteManutention(TypeCapaciteManutention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Mobilite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Mobilite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteMobilite(TypeCapaciteMobilite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Observation ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Observation ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteObservationASS(TypeCapaciteObservationASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Operationnelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Operationnelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteOperationnelle(TypeCapaciteOperationnelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Reseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Reseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteReseau(TypeCapaciteReseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Soutien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Soutien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteSoutien(TypeCapaciteSoutien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Stockage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Stockage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteStockage(TypeCapaciteStockage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Surveillance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Surveillance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteSurveillance(TypeCapaciteSurveillance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capacite Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capacite Transmission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapaciteTransmission(TypeCapaciteTransmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capteur Drone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capteur Drone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapteurDrone(TypeCapteurDrone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capteur Localisation Radioelectrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capteur Localisation Radioelectrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapteurLocalisationRadioelectrique(TypeCapteurLocalisationRadioelectrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capteur Radar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capteur Radar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapteurRadar(TypeCapteurRadar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capteur RENS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capteur RENS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapteurRENS(TypeCapteurRENS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Capteur ROHUM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Capteur ROHUM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCapteurROHUM(TypeCapteurROHUM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Caracteristique Autre Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Caracteristique Autre Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaracteristiqueAutreSite(TypeCaracteristiqueAutreSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Caracteristique Complementaire Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Caracteristique Complementaire Obstacle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaracteristiqueComplementaireObstacle(TypeCaracteristiqueComplementaireObstacle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Caracteristique Groupe Individus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Caracteristique Groupe Individus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaracteristiqueGroupeIndividus(TypeCaracteristiqueGroupeIndividus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Caracteristique Logistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Caracteristique Logistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaracteristiqueLogistique(TypeCaracteristiqueLogistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Caracteristiques Assoc Instance Objet Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Caracteristiques Assoc Instance Objet Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaracteristiquesAssocInstanceObjetLocalisation(TypeCaracteristiquesAssocInstanceObjetLocalisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Caracteristiques Mouvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Caracteristiques Mouvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaracteristiquesMouvement(TypeCaracteristiquesMouvement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Caracteristiques SIO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Caracteristiques SIO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaracteristiquesSIO(TypeCaracteristiquesSIO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Caracteristique Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Caracteristique Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaracteristiqueTransport(TypeCaracteristiqueTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Caracteristique Zone Contaminee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Caracteristique Zone Contaminee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCaracteristiqueZoneContaminee(TypeCaracteristiqueZoneContaminee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Carnet Points</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Carnet Points</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCarnetPoints(TypeCarnetPoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Cellule Soutien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Cellule Soutien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCelluleSoutien(TypeCelluleSoutien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Centre ASA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Centre ASA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCentreASA(TypeCentreASA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Centre LLAPI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Centre LLAPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCentreLLAPI(TypeCentreLLAPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Centre NC23</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Centre NC23</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCentreNC23(TypeCentreNC23 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Cercle Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Cercle Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCercleGeometrique(TypeCercleGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Champ Mines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Champ Mines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeChampMines(TypeChampMines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Champ Mines Maritime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Champ Mines Maritime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeChampMinesMaritime(TypeChampMinesMaritime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Champ Mines Maritime Dommages Estimes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Champ Mines Maritime Dommages Estimes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeChampMinesMaritimeDommagesEstimes(TypeChampMinesMaritimeDommagesEstimes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Champ Mines Terrestre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Champ Mines Terrestre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeChampMinesTerrestre(TypeChampMinesTerrestre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Chargement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Chargement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeChargement(TypeChargement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Chargement Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Chargement Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeChargementMateriel(TypeChargementMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Charnier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Charnier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCharnier(TypeCharnier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Chemin Fer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Chemin Fer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCheminFer(TypeCheminFer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Competence Linguistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Competence Linguistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCompetenceLinguistique(TypeCompetenceLinguistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Comportement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Comportement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeComportement(TypeComportement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Comportement Secours</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Comportement Secours</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeComportementSecours(TypeComportementSecours object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Composante Appui</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Composante Appui</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeComposanteAppui(TypeComposanteAppui object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Composition Dotation Theorique En Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Composition Dotation Theorique En Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCompositionDotationTheoriqueEnType(TypeCompositionDotationTheoriqueEnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Comptage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Comptage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeComptage(TypeComptage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Comptage Par Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Comptage Par Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeComptageParActivite(TypeComptageParActivite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Compte Rendu Mouvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Compte Rendu Mouvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCompteRenduMouvement(TypeCompteRenduMouvement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Compte Rendu Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Compte Rendu Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCompteRenduTir(TypeCompteRenduTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Conduite ATenir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Conduite ATenir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConduiteATenir(TypeConduiteATenir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Cone Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Cone Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConeGeometrique(TypeConeGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConfiguration(TypeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Conflit3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Conflit3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConflit3D(TypeConflit3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consigne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consigne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsigne(TypeConsigne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consigne Geographique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consigne Geographique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsigneGeographique(TypeConsigneGeographique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consigne Lutte Antiaerienne TTA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consigne Lutte Antiaerienne TTA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsigneLutteAntiaerienneTTA(TypeConsigneLutteAntiaerienneTTA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consigne Particuliere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consigne Particuliere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsigneParticuliere(TypeConsigneParticuliere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consignes Generales Tir ASA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consignes Generales Tir ASA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsignesGeneralesTirASA(TypeConsignesGeneralesTirASA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consigne Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consigne Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsigneTir(TypeConsigneTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consommable Sante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consommable Sante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsommableSante(TypeConsommableSante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consommation Autorisee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consommation Autorisee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsommationAutorisee(TypeConsommationAutorisee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consommation En Munitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consommation En Munitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsommationEnMunitions(TypeConsommationEnMunitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consommation Explosifs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consommation Explosifs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsommationExplosifs(TypeConsommationExplosifs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Consommation Mines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Consommation Mines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConsommationMines(TypeConsommationMines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Constat Destruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Constat Destruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConstatDestruction(TypeConstatDestruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Constat Force</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Constat Force</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConstatForce(TypeConstatForce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Constat Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Constat Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConstatPopulation(TypeConstatPopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Constat Terrain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Constat Terrain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConstatTerrain(TypeConstatTerrain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Contenu Paragraphe Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Contenu Paragraphe Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeContenuParagraphePlanOuOrdre(TypeContenuParagraphePlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Contenu Textuel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Contenu Textuel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeContenuTextuel(TypeContenuTextuel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Contexte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Contexte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeContexte(TypeContexte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Contraintes Mouvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Contraintes Mouvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeContraintesMouvement(TypeContraintesMouvement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Convoi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Convoi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConvoi(TypeConvoi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Coordination4 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Coordination4 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCoordination4D(TypeCoordination4D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Coordonnees Lat Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Coordonnees Lat Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCoordonneesLatLong(TypeCoordonneesLatLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Corridor Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Corridor Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCorridorGeometrique(TypeCorridorGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Couverture Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Couverture Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCouvertureAerienne(TypeCouvertureAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Couverture ASA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Couverture ASA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCouvertureASA(TypeCouvertureASA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Couverture Nuageuse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Couverture Nuageuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCouvertureNuageuse(TypeCouvertureNuageuse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CRactivite ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CRactivite ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCRactiviteASS(TypeCRactiviteASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CRevaluation Degats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CRevaluation Degats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCRevaluationDegats(TypeCRevaluationDegats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CRfin Mission Acquisition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CRfin Mission Acquisition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCRfinMissionAcquisition(TypeCRfinMissionAcquisition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Cr Incident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Cr Incident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCrIncident(TypeCrIncident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Criteres Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Criteres Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCriteresIdentification(TypeCriteresIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CRmouvement Aerien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CRmouvement Aerien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCRmouvementAerien(TypeCRmouvementAerien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CRplan Feux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CRplan Feux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCRplanFeux(TypeCRplanFeux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Cr Reconnaissance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Cr Reconnaissance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCrReconnaissance(TypeCrReconnaissance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CRrenseignement Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CRrenseignement Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCRrenseignementObjectif(TypeCRrenseignementObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CRtraitement Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CRtraitement Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCRtraitementObjectif(TypeCRtraitementObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Cylindre Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Cylindre Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCylindreGeometrique(TypeCylindreGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Datation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Datation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDatation(TypeDatation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declenchement Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declenchement Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclenchementTir(TypeDeclenchementTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Defense Accompagnement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Defense Accompagnement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefenseAccompagnement(TypeDefenseAccompagnement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Defense Au Profit Unite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Defense Au Profit Unite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefenseAuProfitUnite(TypeDefenseAuProfitUnite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Degre Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Degre Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDegreClassification(TypeDegreClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Demande Engagement Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Demande Engagement Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDemandeEngagementObjectif(TypeDemandeEngagementObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Demande Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Demande Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDemandeTir(TypeDemandeTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Depannage Evacuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Depannage Evacuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDepannageEvacuation(TypeDepannageEvacuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Deplacement Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Deplacement Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeplacementPersonne(TypeDeplacementPersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Deploiement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Deploiement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeploiement(TypeDeploiement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Deploiement MARTHA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Deploiement MARTHA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeploiementMARTHA(TypeDeploiementMARTHA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Deploiement Moyens AS Ac3d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Deploiement Moyens AS Ac3d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeploiementMoyensASAc3d(TypeDeploiementMoyensASAc3d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Depot ACreer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Depot ACreer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDepotACreer(TypeDepotACreer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Description Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Description Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDescriptionPersonne(TypeDescriptionPersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Designation Unite Ou Equipement ENI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Designation Unite Ou Equipement ENI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDesignationUniteOuEquipementENI(TypeDesignationUniteOuEquipementENI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Destinataire Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Destinataire Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDestinatairePlanOuOrdre(TypeDestinatairePlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Detachement Identifie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Detachement Identifie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDetachementIdentifie(TypeDetachementIdentifie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Detachement Non Identifie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Detachement Non Identifie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDetachementNonIdentifie(TypeDetachementNonIdentifie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Detail Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Detail Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDetailEvenement(TypeDetailEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Direction Approche Air</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Direction Approche Air</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDirectionApprocheAir(TypeDirectionApprocheAir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Directive EMCO Npour Unite ASA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Directive EMCO Npour Unite ASA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDirectiveEMCONpourUniteASA(TypeDirectiveEMCONpourUniteASA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Directives WEZ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Directives WEZ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDirectivesWEZ(TypeDirectivesWEZ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Directive Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Directive Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDirectiveTir(TypeDirectiveTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Disponibilite Pour Plan Feux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Disponibilite Pour Plan Feux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDisponibilitePourPlanFeux(TypeDisponibilitePourPlanFeux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Distance Verticale Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Distance Verticale Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDocument(TypeDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Document Identification Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Document Identification Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDocumentIdentificationPersonne(TypeDocumentIdentificationPersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Domaine Activite Centre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Domaine Activite Centre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDomaineActiviteCentre(TypeDomaineActiviteCentre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Dose Radiation Absorbe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Dose Radiation Absorbe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDoseRadiationAbsorbe(TypeDoseRadiationAbsorbe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Dotation Effective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Dotation Effective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDotationEffective(TypeDotationEffective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Dotation Effective Consommable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Dotation Effective Consommable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDotationEffectiveConsommable(TypeDotationEffectiveConsommable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Dotation Effective Effectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Dotation Effective Effectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDotationEffectiveEffectif(TypeDotationEffectiveEffectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Dotation Effective Equipement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Dotation Effective Equipement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDotationEffectiveEquipement(TypeDotationEffectiveEquipement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Dotation Theorique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Dotation Theorique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDotationTheorique(TypeDotationTheorique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Dotation Theorique Instance Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Dotation Theorique Instance Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDotationTheoriqueInstanceObjet(TypeDotationTheoriqueInstanceObjet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Duree Intervention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Duree Intervention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDureeIntervention(TypeDureeIntervention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Echelon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Echelon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEchelon(TypeEchelon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effectif Necessaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effectif Necessaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffectifNecessaire(TypeEffectifNecessaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effectif Ou Engin Affecte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effectif Ou Engin Affecte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffectifOuEnginAffecte(TypeEffectifOuEnginAffecte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffet(TypeEffet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effet Au Contact ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effet Au Contact ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffetAuContactASS(TypeEffetAuContactASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effet Constate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effet Constate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffetConstate(TypeEffetConstate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effet Profondeur ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effet Profondeur ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffetProfondeurASS(TypeEffetProfondeurASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effet Sur Instance Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effet Sur Instance Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffetSurInstanceObjet(TypeEffetSurInstanceObjet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effet Sur Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effet Sur Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffetSurType(TypeEffetSurType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effet Tactique Recherche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effet Tactique Recherche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffetTactiqueRecherche(TypeEffetTactiqueRecherche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Effet Tactique Recherche Par ENI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Effet Tactique Recherche Par ENI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEffetTactiqueRechercheParENI(TypeEffetTactiqueRechercheParENI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Efficacite Probabiliste</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Efficacite Probabiliste</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEfficaciteProbabiliste(TypeEfficaciteProbabiliste object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Element Contexte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Element Contexte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeElementContexte(TypeElementContexte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Element Controle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Element Controle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeElementControle(TypeElementControle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Element CRintermediaire Acquisition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Element CRintermediaire Acquisition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeElementCRintermediaireAcquisition(TypeElementCRintermediaireAcquisition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Element Meteo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Element Meteo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeElementMeteo(TypeElementMeteo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Element Particulier ADefendre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Element Particulier ADefendre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeElementParticulierADefendre(TypeElementParticulierADefendre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Element Topographie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Element Topographie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeElementTopographie(TypeElementTopographie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Element Vital</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Element Vital</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeElementVital(TypeElementVital object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ellipse Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ellipse Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEllipseGeometrique(TypeEllipseGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Emploi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Emploi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEmploi(TypeEmploi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Emploi Aeronef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Emploi Aeronef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEmploiAeronef(TypeEmploiAeronef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Emploi Frequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Emploi Frequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEmploiFrequence(TypeEmploiFrequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Emploi Guerre Electronique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Emploi Guerre Electronique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEmploiGuerreElectronique(TypeEmploiGuerreElectronique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Emploi Maritime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Emploi Maritime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEmploiMaritime(TypeEmploiMaritime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Emploi Reconnaissance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Emploi Reconnaissance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEmploiReconnaissance(TypeEmploiReconnaissance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Emploi Ressource Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Emploi Ressource Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEmploiRessourceActivite(TypeEmploiRessourceActivite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Engagement Avec Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Engagement Avec Delegation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEngagementAvecDelegation(TypeEngagementAvecDelegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ennemi Futur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ennemi Futur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEnnemiFutur(TypeEnnemiFutur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type En Tete Paragraphe Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type En Tete Paragraphe Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEnTeteParagraphePlanOuOrdre(TypeEnTeteParagraphePlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Entete Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Entete Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEntetePlanOuOrdre(TypeEntetePlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Entite Organisationnelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Entite Organisationnelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEntiteOrganisationnelle(TypeEntiteOrganisationnelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Entite Politique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Entite Politique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEntitePolitique(TypeEntitePolitique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Environnement Terrain Et Vegetation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Environnement Terrain Et Vegetation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEnvironnementTerrainEtVegetation(TypeEnvironnementTerrainEtVegetation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Equipement Helicoptere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Equipement Helicoptere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEquipementHelicoptere(TypeEquipementHelicoptere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Equipement Ou Ressource En Quantite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Equipement Ou Ressource En Quantite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEquipementOuRessourceEnQuantite(TypeEquipementOuRessourceEnQuantite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Equipes Reparation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Equipes Reparation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEquipesReparation(TypeEquipesReparation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Essieu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Essieu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEssieu(TypeEssieu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatAction(TypeEtatAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Alerte Unite ASA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Alerte Unite ASA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatAlerteUniteASA(TypeEtatAlerteUniteASA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatAssociation(TypeEtatAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Civil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Civil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatCivil(TypeEtatCivil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Element Contexte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Element Contexte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatElementContexte(TypeEtatElementContexte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatEvenement(TypeEtatEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Liaison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Liaison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatLiaison(TypeEtatLiaison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnel(TypeEtatOperationnel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Aerodrome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Aerodrome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelAerodrome(TypeEtatOperationnelAerodrome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Champ Mines Maritime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Champ Mines Maritime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelChampMinesMaritime(TypeEtatOperationnelChampMinesMaritime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Controle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Controle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelElementControle(TypeEtatOperationnelElementControle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Topographie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Topographie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelElementTopographie(TypeEtatOperationnelElementTopographie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Topographie Fluide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Topographie Fluide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelElementTopographieFluide(TypeEtatOperationnelElementTopographieFluide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Topographie Liquide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Topographie Liquide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelElementTopographieLiquide(TypeEtatOperationnelElementTopographieLiquide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Topographie Solide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Element Topographie Solide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelElementTopographieSolide(TypeEtatOperationnelElementTopographieSolide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Entite Organisationnelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Entite Organisationnelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelEntiteOrganisationnelle(TypeEtatOperationnelEntiteOrganisationnelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelMateriel(TypeEtatOperationnelMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Medical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Medical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelMedical(TypeEtatOperationnelMedical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Mine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Mine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelMine(TypeEtatOperationnelMine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Objet Inconnu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Objet Inconnu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelObjetInconnu(TypeEtatOperationnelObjetInconnu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Personnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Personnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelPersonnel(TypeEtatOperationnelPersonnel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelSite(TypeEtatOperationnelSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Operationnel UXO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Operationnel UXO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOperationnelUXO(TypeEtatOperationnelUXO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatOrdre(TypeEtatOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatPlan(TypeEtatPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Regle Engagement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Regle Engagement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatRegleEngagement(TypeEtatRegleEngagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Service Reseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Service Reseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatServiceReseau(TypeEtatServiceReseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etat Sic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etat Sic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtatSic(TypeEtatSic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Etude Dispersion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Etude Dispersion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEtudeDispersion(TypeEtudeDispersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evacuation Patients</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evacuation Patients</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvacuationPatients(TypeEvacuationPatients object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evacuation Sanitaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evacuation Sanitaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvacuationSanitaire(TypeEvacuationSanitaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evacuations Par Periode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evacuations Par Periode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvacuationsParPeriode(TypeEvacuationsParPeriode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvaluation(TypeEvaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvenement(TypeEvenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evenement4 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evenement4 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvenement4D(TypeEvenement4D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evenement Arme Nucleaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evenement Arme Nucleaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvenementArmeNucleaire(TypeEvenementArmeNucleaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evenement Chimique Et Biologique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evenement Chimique Et Biologique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvenementChimiqueEtBiologique(TypeEvenementChimiqueEtBiologique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evenement NRBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evenement NRBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvenementNRBC(TypeEvenementNRBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evenement Nucleaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evenement Nucleaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvenementNucleaire(TypeEvenementNucleaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evenement Radioactif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evenement Radioactif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvenementRadioactif(TypeEvenementRadioactif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evenement Radiologique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evenement Radiologique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvenementRadiologique(TypeEvenementRadiologique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Evenement RENS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Evenement RENS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEvenementRENS(TypeEvenementRENS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Fait Renseignement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Fait Renseignement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeFaitRenseignement(TypeFaitRenseignement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Fin Interdiction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Fin Interdiction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeFinInterdiction(TypeFinInterdiction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Fonction Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Fonction Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeFonctionPersonne(TypeFonctionPersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Frequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Frequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeFrequence(TypeFrequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Gabarit Portee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Gabarit Portee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeGabaritPortee(TypeGabaritPortee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Givrage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Givrage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeGivrage(TypeGivrage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Groupe Ethnique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Groupe Ethnique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeGroupeEthnique(TypeGroupeEthnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Groupe Fonctionnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Groupe Fonctionnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeGroupeFonctionnel(TypeGroupeFonctionnel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Groupe Individus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Groupe Individus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeGroupeIndividus(TypeGroupeIndividus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Groupe Informations Operationnelles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Groupe Informations Operationnelles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeGroupeInformationsOperationnelles(TypeGroupeInformationsOperationnelles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Groupement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Groupement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeGroupement(TypeGroupement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Hippodrome Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Hippodrome Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeHippodromeGeometrique(TypeHippodromeGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Horaire Manoeuvre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Horaire Manoeuvre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeHoraireManoeuvre(TypeHoraireManoeuvre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Hypothese Action EN Iou Autre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Hypothese Action EN Iou Autre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeHypotheseActionENIouAutre(TypeHypotheseActionENIouAutre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Incident Mouvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Incident Mouvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeIncidentMouvement(TypeIncidentMouvement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Indicateur Geostatistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Indicateur Geostatistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeIndicateurGeostatistique(TypeIndicateurGeostatistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Infrastructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeInfrastructure(TypeInfrastructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Instance Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Instance Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeInstanceObjet(TypeInstanceObjet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Instruction Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Instruction Coordination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeInstructionCoordination(TypeInstructionCoordination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Interdiction Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Interdiction Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeInterdictionTir(TypeInterdictionTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Intervention Generale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Intervention Generale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeInterventionGenerale(TypeInterventionGenerale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Intervention Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Intervention Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeInterventionType(TypeInterventionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Itineraire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Itineraire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeItineraire(TypeItineraire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Itineraire Franchissement Ou Contournement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Itineraire Franchissement Ou Contournement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeItineraireFranchissementOuContournement(TypeItineraireFranchissementOuContournement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Itineraire Ou Modele Cheminement ALAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Itineraire Ou Modele Cheminement ALAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeItineraireOuModeleCheminementALAT(TypeItineraireOuModeleCheminementALAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Jalon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Jalon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeJalon(TypeJalon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Jetee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Jetee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeJetee(TypeJetee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Jonction Reseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Jonction Reseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeJonctionReseau(TypeJonctionReseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Langue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Langue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLangue(TypeLangue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Liaison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Liaison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLiaison(TypeLiaison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Liaison Physique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Liaison Physique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLiaisonPhysique(TypeLiaisonPhysique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Liaison Reseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Liaison Reseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLiaisonReseau(TypeLiaisonReseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ligne Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ligne Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLigneGeometrique(TypeLigneGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ligne Livraison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ligne Livraison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLigneLivraison(TypeLigneLivraison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ligne Rechange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ligne Rechange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLigneRechange(TypeLigneRechange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Limite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Limite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLimite(TypeLimite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Liste Mesures Coordination3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Liste Mesures Coordination3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeListeMesuresCoordination3D(TypeListeMesuresCoordination3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Liste Objectifs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Liste Objectifs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeListeObjectifs(TypeListeObjectifs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Liste Objectifs Candidats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Liste Objectifs Candidats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeListeObjectifsCandidats(TypeListeObjectifsCandidats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Liste Objectifs Planifies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Liste Objectifs Planifies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeListeObjectifsPlanifies(TypeListeObjectifsPlanifies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Livraison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Livraison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLivraison(TypeLivraison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLocalisation(TypeLocalisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Localisation Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Localisation Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLocalisationGeometrique(TypeLocalisationGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Localisation Geometrique2 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Localisation Geometrique2 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLocalisationGeometrique2D(TypeLocalisationGeometrique2D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Localisation Geometrique3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Localisation Geometrique3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLocalisationGeometrique3D(TypeLocalisationGeometrique3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Localisation Indefinie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Localisation Indefinie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLocalisationIndefinie(TypeLocalisationIndefinie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Localisation Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Localisation Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLocalisationObjectif(TypeLocalisationObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Lumiere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Lumiere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLumiere(TypeLumiere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Manutention AEffectuer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Manutention AEffectuer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeManutentionAEffectuer(TypeManutentionAEffectuer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Marquage Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Marquage Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMarquageObjectif(TypeMarquageObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMateriel(TypeMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Memento Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Memento Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMementoGenie(TypeMementoGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Menace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Menace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMenace(TypeMenace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Menace Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Menace Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMenaceAerienne(TypeMenaceAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Menace AS Aeni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Menace AS Aeni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMenaceASAeni(TypeMenaceASAeni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Menace Detection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Menace Detection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMenaceDetection(TypeMenaceDetection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Menace Feux ENI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Menace Feux ENI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMenaceFeuxENI(TypeMenaceFeuxENI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Menace Genie ENI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Menace Genie ENI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMenaceGenieENI(TypeMenaceGenieENI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Menace Prioritaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Menace Prioritaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMenacePrioritaire(TypeMenacePrioritaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Menaces Aeriennes Mission ALAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Menaces Aeriennes Mission ALAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMenacesAeriennesMissionALAT(TypeMenacesAeriennesMissionALAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mesure Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mesure Coordination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMesureCoordination(TypeMesureCoordination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mesure Nuage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mesure Nuage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMesureNuage(TypeMesureNuage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mesures Protection Electronique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mesures Protection Electronique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMesuresProtectionElectronique(TypeMesuresProtectionElectronique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mine Explosif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mine Explosif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMineExplosif(TypeMineExplosif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mise En Oeuvre ROE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mise En Oeuvre ROE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMiseEnOeuvreROE(TypeMiseEnOeuvreROE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mise En Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mise En Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMiseEnPlace(TypeMiseEnPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mise En Place Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mise En Place Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMiseEnPlaceTir(TypeMiseEnPlaceTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMission(TypeMission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Acquisition ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Acquisition ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionAcquisitionASS(TypeMissionAcquisitionASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionAerienne(TypeMissionAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Air</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Air</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionAir(TypeMissionAir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission ALA Tattaque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission ALA Tattaque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionALATattaque(TypeMissionALATattaque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Appui Mobilite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Appui Mobilite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionAppuiMobilite(TypeMissionAppuiMobilite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission ASA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission ASA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionASA(TypeMissionASA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission COBRA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission COBRA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionCOBRA(TypeMissionCOBRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Defense Particuliere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Defense Particuliere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionDefenseParticuliere(TypeMissionDefenseParticuliere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Drone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Drone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionDrone(TypeMissionDrone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Escorte Ou Appui Feu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Escorte Ou Appui Feu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionEscorteOuAppuiFeu(TypeMissionEscorteOuAppuiFeu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Feux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Feux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionFeux(TypeMissionFeux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionGenie(TypeMissionGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission I3D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission I3D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionI3D(TypeMissionI3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Localisation Radio Electrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Localisation Radio Electrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionLocalisationRadioElectrique(TypeMissionLocalisationRadioElectrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Logistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Logistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionLogistique(TypeMissionLogistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionMaintenance(TypeMissionMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Melee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Melee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionMelee(TypeMissionMelee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Mouvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Mouvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionMouvement(TypeMissionMouvement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Radar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Radar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionRadar(TypeMissionRadar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Ravitaillement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Ravitaillement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionRavitaillement(TypeMissionRavitaillement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Renseignement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Renseignement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionRenseignement(TypeMissionRenseignement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Renseignement Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Renseignement Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionRenseignementObjectif(TypeMissionRenseignementObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Rohum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Rohum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionRohum(TypeMissionRohum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Sar Combat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Sar Combat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionSarCombat(TypeMissionSarCombat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Sic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Sic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionSic(TypeMissionSic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Surveillance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Surveillance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionSurveillance(TypeMissionSurveillance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Transport Tactique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Transport Tactique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionTransportTactique(TypeMissionTransportTactique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Unite Antichar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Unite Antichar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionUniteAntichar(TypeMissionUniteAntichar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mission Zone ADefendre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mission Zone ADefendre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMissionZoneADefendre(TypeMissionZoneADefendre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mobilite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mobilite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMobilite(TypeMobilite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModalite(TypeModalite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalite Livraison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalite Livraison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModaliteLivraison(TypeModaliteLivraison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalite Obtention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalite Obtention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModaliteObtention(TypeModaliteObtention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalite Perception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalite Perception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModalitePerception(TypeModalitePerception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalites Acquisition Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalites Acquisition Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModalitesAcquisitionObjectif(TypeModalitesAcquisitionObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalites Evaluation Degats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalites Evaluation Degats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModalitesEvaluationDegats(TypeModalitesEvaluationDegats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalites Mise En Place Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalites Mise En Place Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModalitesMiseEnPlaceTir(TypeModalitesMiseEnPlaceTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalite Soutien Logistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalite Soutien Logistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModaliteSoutienLogistique(TypeModaliteSoutienLogistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalites Ravitaillement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalites Ravitaillement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModalitesRavitaillement(TypeModalitesRavitaillement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Modalite Transfert Autorite ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Modalite Transfert Autorite ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModaliteTransfertAutoriteASS(TypeModaliteTransfertAutoriteASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mode Franchissement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mode Franchissement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModeFranchissement(TypeModeFranchissement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModule(TypeModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mouillage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mouillage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMouillage(TypeMouillage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mouvement Par Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mouvement Par Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMouvementParRoute(TypeMouvementParRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyen Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyen Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyenCommunication(TypeMoyenCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyen Depannage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyen Depannage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyenDepannage(TypeMoyenDepannage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyen Dispersion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyen Dispersion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyenDispersion(TypeMoyenDispersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyen Feu ENI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyen Feu ENI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyenFeuENI(TypeMoyenFeuENI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyen Investigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyen Investigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyenInvestigation(TypeMoyenInvestigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyen Pour Soutien Medical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyen Pour Soutien Medical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyenPourSoutienMedical(TypeMoyenPourSoutienMedical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyens Aeriens Dont Beneficie GU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyens Aeriens Dont Beneficie GU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyensAeriensDontBeneficieGU(TypeMoyensAeriensDontBeneficieGU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyens ENI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyens ENI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyensENI(TypeMoyensENI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyens EN Iutilises</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyens EN Iutilises</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyensENIutilises(TypeMoyensENIutilises object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyens Evacuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyens Evacuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyensEvacuation(TypeMoyensEvacuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyens Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyens Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyensGenie(TypeMoyensGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyens Necessaires</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyens Necessaires</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyensNecessaires(TypeMoyensNecessaires object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyens Niveau4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyens Niveau4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyensNiveau4(TypeMoyensNiveau4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Moyens Triage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Moyens Triage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMoyensTriage(TypeMoyensTriage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type MPGT Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type MPGT Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMPGTMessage(TypeMPGTMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Munitions Consommees Sur Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Munitions Consommees Sur Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMunitionsConsommeesSurPoint(TypeMunitionsConsommeesSurPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Nature Informations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Nature Informations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNatureInformations(TypeNatureInformations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Niveau AMaintenir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Niveau AMaintenir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNiveauAMaintenir(TypeNiveauAMaintenir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objectif3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objectif3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjectif3D(TypeObjectif3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objectif Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objectif Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjectifActivite(TypeObjectifActivite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objectif Activite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objectif Activite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjectifActiviteType(TypeObjectifActiviteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objectif Activite Type Production Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objectif Activite Type Production Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjectifActiviteTypeProductionImage(TypeObjectifActiviteTypeProductionImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objectif Alat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objectif Alat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjectifAlat(TypeObjectifAlat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objectif ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objectif ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjectifASS(TypeObjectifASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objectif Ciblage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objectif Ciblage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjectifCiblage(TypeObjectifCiblage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objectif Majeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objectif Majeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjectifMajeur(TypeObjectifMajeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objet Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objet Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjetGeometrique(TypeObjetGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objet Inconnu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objet Inconnu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjetInconnu(TypeObjetInconnu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Objet Libre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Objet Libre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjetLibre(TypeObjetLibre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObservation(TypeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Obstacle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObstacle(TypeObstacle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Occupation Lits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Occupation Lits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOccupationLits(TypeOccupationLits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOrdre(TypeOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Organisation Evacuations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Organisation Evacuations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOrganisationEvacuations(TypeOrganisationEvacuations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Organisation Ramassage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Organisation Ramassage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOrganisationRamassage(TypeOrganisationRamassage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Organisation Soutien Medical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Organisation Soutien Medical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOrganisationSoutienMedical(TypeOrganisationSoutienMedical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Organisation Traitement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Organisation Traitement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOrganisationTraitement(TypeOrganisationTraitement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Organisation Triage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Organisation Triage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOrganisationTriage(TypeOrganisationTriage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Organisme Controle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Organisme Controle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOrganismeControle(TypeOrganismeControle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ouvrage Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ouvrage Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOuvrageGenie(TypeOuvrageGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOverlay(TypeOverlay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Palier Sondage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Palier Sondage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePalierSondage(TypePalierSondage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Paragraphe Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Paragraphe Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParagraphePlanOuOrdre(TypeParagraphePlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parametres Imposes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parametres Imposes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParametresImposes(TypeParametresImposes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parametres Planification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parametres Planification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParametresPlanification(TypeParametresPlanification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parametres Zone Retombees</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parametres Zone Retombees</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParametresZoneRetombees(TypeParametresZoneRetombees object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Passage Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Passage Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePassageModule(TypePassageModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Passe Photo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Passe Photo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePassePhoto(TypePassePhoto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Periode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Periode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePeriode(TypePeriode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Periode3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Periode3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePeriode3D(TypePeriode3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePersonne(TypePersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Personne Militaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Personne Militaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePersonneMilitaire(TypePersonneMilitaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Pertes Par Periode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Pertes Par Periode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePertesParPeriode(TypePertesParPeriode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Pertes Sante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Pertes Sante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePertesSante(TypePertesSante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Pertes Sante Par Echelon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Pertes Sante Par Echelon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePertesSanteParEchelon(TypePertesSanteParEchelon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Pertes Sante Par Unite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Pertes Sante Par Unite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePertesSanteParUnite(TypePertesSanteParUnite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Phase Mission Appui Aerien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Phase Mission Appui Aerien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePhaseMissionAppuiAerien(TypePhaseMissionAppuiAerien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Phase Trajet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Phase Trajet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePhaseTrajet(TypePhaseTrajet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Phase Vol Drone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Phase Vol Drone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePhaseVolDrone(TypePhaseVolDrone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Pion Reseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Pion Reseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePionReseau(TypePionReseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Piste Atterrissage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Piste Atterrissage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePisteAtterrissage(TypePisteAtterrissage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Plage Numerotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Plage Numerotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlageNumerotation(TypePlageNumerotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlan(TypePlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Plan Feux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Plan Feux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanFeux(TypePlanFeux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Planification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Planification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanification(TypePlanification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Planification Cellule Soutien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Planification Cellule Soutien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanificationCelluleSoutien(TypePlanificationCelluleSoutien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Planification Mouvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Planification Mouvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanificationMouvement(TypePlanificationMouvement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Planification Operation3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Planification Operation3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanificationOperation3D(TypePlanificationOperation3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Plan Mixte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Plan Mixte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanMixte(TypePlanMixte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Plan Numerotation Objectifs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Plan Numerotation Objectifs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanNumerotationObjectifs(TypePlanNumerotationObjectifs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Plan Ou Ordre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Plan Ou Ordre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanOuOrdre(TypePlanOuOrdre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Plan Particulier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Plan Particulier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanParticulier(TypePlanParticulier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Plan Traitement Objectifs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Plan Traitement Objectifs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePlanTraitementObjectifs(TypePlanTraitementObjectifs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Point Axe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Point Axe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointAxe(TypePointAxe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Point Controle3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Point Controle3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointControle3D(TypePointControle3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Point Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Point Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointGeometrique(TypePointGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Point Haut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Point Haut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointHaut(TypePointHaut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Point Mobile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Point Mobile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointMobile(TypePointMobile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Point Particulier Itineraire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Point Particulier Itineraire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointParticulierItineraire(TypePointParticulierItineraire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Point Trajectoire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Point Trajectoire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointTrajectoire(TypePointTrajectoire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Point Usager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Point Usager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointUsager(TypePointUsager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Politique Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Politique Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePolitiqueTir(TypePolitiqueTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Politique Tir Aeronef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Politique Tir Aeronef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePolitiqueTirAeronef(TypePolitiqueTirAeronef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Pont</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Pont</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePont(TypePont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePort(TypePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Porteur Systeme Arme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Porteur Systeme Arme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePorteurSystemeArme(TypePorteurSystemeArme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Position Centre ASA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Position Centre ASA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePositionCentreASA(TypePositionCentreASA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Position Plots</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Position Plots</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePositionPlots(TypePositionPlots object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Possibilites ENI 3d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Possibilites ENI 3d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePossibilitesENI3d(TypePossibilitesENI3d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Poste Amarrage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Poste Amarrage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePosteAmarrage(TypePosteAmarrage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Poste Tir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Poste Tir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePosteTir(TypePosteTir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Potentiel Aeronef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Potentiel Aeronef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePotentielAeronef(TypePotentielAeronef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Potentiel EN Ifeu Sol Sol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Potentiel EN Ifeu Sol Sol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePotentielENIfeuSolSol(TypePotentielENIfeuSolSol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Precipitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Precipitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrecipitation(TypePrecipitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Prelevement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Prelevement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrelevement(TypePrelevement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Prelevement Detachement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Prelevement Detachement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrelevementDetachement(TypePrelevementDetachement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Prelevement Subordonne Identifie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Prelevement Subordonne Identifie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrelevementSubordonneIdentifie(TypePrelevementSubordonneIdentifie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Prelevement Subordonne Non Identifie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Prelevement Subordonne Non Identifie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrelevementSubordonneNonIdentifie(TypePrelevementSubordonneNonIdentifie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Prevision Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Prevision Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrevisionObservation(TypePrevisionObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Prevision Observation Par Tranche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Prevision Observation Par Tranche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrevisionObservationParTranche(TypePrevisionObservationParTranche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Priorite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Priorite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePriorite(TypePriorite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Priorite Tactique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Priorite Tactique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrioriteTactique(TypePrioriteTactique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Priorite Tactique Logistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Priorite Tactique Logistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrioriteTactiqueLogistique(TypePrioriteTactiqueLogistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Priorite Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Priorite Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrioriteTechnique(TypePrioriteTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Procedure IFF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Procedure IFF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeProcedureIFF(TypeProcedureIFF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Profil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Profil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeProfil(TypeProfil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Projet Cimic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Projet Cimic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeProjetCimic(TypeProjetCimic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Protection Personnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Protection Personnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeProtectionPersonnel(TypeProtectionPersonnel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quai Maritime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quai Maritime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuaiMaritime(TypeQuaiMaritime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Consommee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Consommee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteConsommee(TypeQuantiteConsommee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Element ENI Detruit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Element ENI Detruit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteElementENIDetruit(TypeQuantiteElementENIDetruit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Maintenir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Maintenir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteMaintenir(TypeQuantiteMaintenir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteMateriel(TypeQuantiteMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Materiel Ou Moyen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Materiel Ou Moyen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteMaterielOuMoyen(TypeQuantiteMaterielOuMoyen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Moyens Tir ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Moyens Tir ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteMoyensTirASS(TypeQuantiteMoyensTirASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Type Arme Pour Moyen Feu AS Seni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Type Arme Pour Moyen Feu AS Seni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteTypeArmePourMoyenFeuASSeni(TypeQuantiteTypeArmePourMoyenFeuASSeni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Type Equipement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Type Equipement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteTypeEquipement(TypeQuantiteTypeEquipement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Type Observe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Type Observe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteTypeObserve(TypeQuantiteTypeObserve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Quantite Type Unite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Quantite Type Unite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQuantiteTypeUnite(TypeQuantiteTypeUnite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Racine Operationnelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Racine Operationnelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRacineOperationnelle(TypeRacineOperationnelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Raid Aerien Ennemi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Raid Aerien Ennemi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRaidAerienEnnemi(TypeRaidAerienEnnemi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Rapport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Rapport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRapport(TypeRapport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Rapport Force</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Rapport Force</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRapportForce(TypeRapportForce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Rattachement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Rattachement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRattachement(TypeRattachement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Rattachement Logistique Particulier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Rattachement Logistique Particulier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRattachementLogistiqueParticulier(TypeRattachementLogistiqueParticulier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Rattachement Ou Abonnement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Rattachement Ou Abonnement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRattachementOuAbonnement(TypeRattachementOuAbonnement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ravitaillement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ravitaillement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRavitaillement(TypeRavitaillement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reactions Mentales Au Combat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reactions Mentales Au Combat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReactionsMentalesAuCombat(TypeReactionsMentalesAuCombat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Rechange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Rechange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRechange(TypeRechange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reconnaissance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reconnaissance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReconnaissance(TypeReconnaissance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Regle Engagement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Regle Engagement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRegleEngagement(TypeRegleEngagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Regle Engagement Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Regle Engagement Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRegleEngagementAction(TypeRegleEngagementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reglementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reglementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReglementation(TypeReglementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Religion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Religion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReligion(TypeReligion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Renforcements Feux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Renforcements Feux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRenforcementsFeux(TypeRenforcementsFeux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Renseignement Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Renseignement Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRenseignementObjectif(TypeRenseignementObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reseau Telecommunication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reseau Telecommunication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReseauTelecommunication(TypeReseauTelecommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reservation Unite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reservation Unite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReservationUnite(TypeReservationUnite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ressource Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ressource Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRessourceActivite(TypeRessourceActivite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ressource Activite Instance Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ressource Activite Instance Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRessourceActiviteInstanceObjet(TypeRessourceActiviteInstanceObjet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ressource Activite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ressource Activite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRessourceActiviteType(TypeRessourceActiviteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ressource Attendue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ressource Attendue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRessourceAttendue(TypeRessourceAttendue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ressource Elementaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ressource Elementaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRessourceElementaire(TypeRessourceElementaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ressources ALivrer Ou ADistribuer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ressources ALivrer Ou ADistribuer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRessourcesALivrerOuADistribuer(TypeRessourcesALivrerOuADistribuer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Resultat Traitement Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Resultat Traitement Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeResultatTraitementObjectif(TypeResultatTraitementObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type RO Epar Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type RO Epar Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeROEparOrganisation(TypeROEparOrganisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRoute(TypeRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Route Helicoptere ALAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Route Helicoptere ALAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRouteHelicoptereALAT(TypeRouteHelicoptereALAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Secteur Angulaire Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Secteur Angulaire Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSecteurAngulaireGeometrique(TypeSecteurAngulaireGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Secteur Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Secteur Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSecteurGeometrique(TypeSecteurGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Segment Itineraire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Segment Itineraire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSegmentItineraire(TypeSegmentItineraire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Segment Route Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Segment Route Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSegmentRouteAerienne(TypeSegmentRouteAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Serie Geostatistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Serie Geostatistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSerieGeostatistique(TypeSerieGeostatistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Service Reseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Service Reseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeServiceReseau(TypeServiceReseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSite(TypeSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Site Production</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Site Production</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSiteProduction(TypeSiteProduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Site Soin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Site Soin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSiteSoin(TypeSiteSoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Situation Consommable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Situation Consommable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSituationConsommable(TypeSituationConsommable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Situation Effectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Situation Effectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSituationEffectif(TypeSituationEffectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Situation Equipement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Situation Equipement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSituationEquipement(TypeSituationEquipement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Situation Radiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Situation Radiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSituationRadiation(TypeSituationRadiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Situation Vehicule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Situation Vehicule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSituationVehicule(TypeSituationVehicule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Specialite Maintenance Ou Depannage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Specialite Maintenance Ou Depannage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSpecialiteMaintenanceOuDepannage(TypeSpecialiteMaintenanceOuDepannage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Specialite Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Specialite Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSpecialitePersonne(TypeSpecialitePersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Sphere Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Sphere Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSphereGeometrique(TypeSphereGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Stade Alerte Emission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Stade Alerte Emission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeStadeAlerteEmission(TypeStadeAlerteEmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Stock AMaintenir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Stock AMaintenir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeStockAMaintenir(TypeStockAMaintenir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Structure Organisee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Structure Organisee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeStructureOrganisee(TypeStructureOrganisee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Suivi Demande</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Suivi Demande</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSuiviDemande(TypeSuiviDemande object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Suivi Medical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Suivi Medical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSuiviMedical(TypeSuiviMedical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Surplus Ou Deficit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Surplus Ou Deficit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSurplusOuDeficit(TypeSurplusOuDeficit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleAnnotation(TypeSymboleAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Cercle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Cercle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleCercle(TypeSymboleCercle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Fleche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Fleche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleFleche(TypeSymboleFleche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleImage(TypeSymboleImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Libre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Libre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleLibre(TypeSymboleLibre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Lineique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Lineique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleLineique(TypeSymboleLineique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleNote(TypeSymboleNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymbolePoint(TypeSymbolePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Post It</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Post It</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymbolePostIt(TypeSymbolePostIt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Surfacique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Surfacique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleSurfacique(TypeSymboleSurfacique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Tactique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Tactique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleTactique(TypeSymboleTactique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Symbole Texte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Symbole Texte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSymboleTexte(TypeSymboleTexte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Synthese Detections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Synthese Detections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSyntheseDetections(TypeSyntheseDetections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Synthese Sante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Synthese Sante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSyntheseSante(TypeSyntheseSante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Systeme Atterrissage Aux Instruments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Systeme Atterrissage Aux Instruments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSystemeAtterrissageAuxInstruments(TypeSystemeAtterrissageAuxInstruments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Tache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Tache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTache(TypeTache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Tache Appui Aerien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Tache Appui Aerien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTacheAppuiAerien(TypeTacheAppuiAerien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Tirs Par Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Tirs Par Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTirsParObjectif(TypeTirsParObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Traitement Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Traitement Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTraitementObjectif(TypeTraitementObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Traitement Patients</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Traitement Patients</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTraitementPatients(TypeTraitementPatients object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Tranche Meteo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Tranche Meteo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTrancheMeteo(TypeTrancheMeteo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Transfert Dotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Transfert Dotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTransfertDotation(TypeTransfertDotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Travail Aide Deploiement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Travail Aide Deploiement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTravailAideDeploiement(TypeTravailAideDeploiement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Travail Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Travail Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTravailGenie(TypeTravailGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Triage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Triage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTriage(TypeTriage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType(TypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Aerodrome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Aerodrome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeAerodrome(TypeTypeAerodrome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Aeronef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Aeronef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeAeronef(TypeTypeAeronef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Agent Biologique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Agent Biologique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeAgentBiologique(TypeTypeAgentBiologique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Agent Chimique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Agent Chimique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeAgentChimique(TypeTypeAgentChimique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Agent Nucleaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Agent Nucleaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeAgentNucleaire(TypeTypeAgentNucleaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Arme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Arme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeArme(TypeTypeArme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Armement Systeme Arme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Armement Systeme Arme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeArmementSystemeArme(TypeTypeArmementSystemeArme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Batiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Batiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeBatiment(TypeTypeBatiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Batiment Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Batiment Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeBatimentParticipant(TypeTypeBatimentParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Batiment Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Batiment Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeBatimentSurface(TypeTypeBatimentSurface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Capteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Capteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeCapteur(TypeTypeCapteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Consommable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Consommable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeConsommable(TypeTypeConsommable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Consommable Systeme Arme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Consommable Systeme Arme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeConsommableSystemeArme(TypeTypeConsommableSystemeArme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Element Controle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Element Controle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeElementControle(TypeTypeElementControle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Entite Organisationnelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Entite Organisationnelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeEntiteOrganisationnelle(TypeTypeEntiteOrganisationnelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Equipement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Equipement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeEquipement(TypeTypeEquipement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Equipement ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Equipement ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeEquipementASS(TypeTypeEquipementASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Equipement Electronique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Equipement Electronique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeEquipementElectronique(TypeTypeEquipementElectronique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Equipement Ferroviaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Equipement Ferroviaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeEquipementFerroviaire(TypeTypeEquipementFerroviaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Equipement Genie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Equipement Genie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeEquipementGenie(TypeTypeEquipementGenie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Equipement Maritime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Equipement Maritime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeEquipementMaritime(TypeTypeEquipementMaritime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Equipement NRBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Equipement NRBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeEquipementNRBC(TypeTypeEquipementNRBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Equipement Systeme Arme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Equipement Systeme Arme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeEquipementSystemeArme(TypeTypeEquipementSystemeArme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Groupe Individus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Groupe Individus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeGroupeIndividus(TypeTypeGroupeIndividus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Intervenant3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Intervenant3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeIntervenant3D(TypeTypeIntervenant3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Itineraire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Itineraire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeItineraire(TypeTypeItineraire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeMateriel(TypeTypeMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Mesure Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Mesure Coordination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeMesureCoordination(TypeTypeMesureCoordination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Mission Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Mission Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeMissionAerienne(TypeTypeMissionAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Mission I3D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Mission I3D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeMissionI3D(TypeTypeMissionI3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Moyen Manquant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Moyen Manquant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeMoyenManquant(TypeTypeMoyenManquant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Munition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Munition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeMunition(TypeTypeMunition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Munition Systeme Arme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Munition Systeme Arme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeMunitionSystemeArme(TypeTypeMunitionSystemeArme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Objectif ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Objectif ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeObjectifASS(TypeTypeObjectifASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Objectif Majeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Objectif Majeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeObjectifMajeur(TypeTypeObjectifMajeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Obstacle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeObstacle(TypeTypeObstacle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Organisation Gouvernementale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Organisation Gouvernementale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeOrganisationGouvernementale(TypeTypeOrganisationGouvernementale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Organisation Militaire Executive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Organisation Militaire Executive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeOrganisationMilitaireExecutive(TypeTypeOrganisationMilitaireExecutive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Organisation Privee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Organisation Privee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeOrganisationPrivee(TypeTypeOrganisationPrivee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypePersonne(TypeTypePersonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Pont</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Pont</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypePont(TypeTypePont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypePort(TypeTypePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Porteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Porteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypePorteur(TypeTypePorteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Poste Civil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Poste Civil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypePosteCivil(TypeTypePosteCivil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Poste Militaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Poste Militaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypePosteMilitaire(TypeTypePosteMilitaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Regroupement Force</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Regroupement Force</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeRegroupementForce(TypeTypeRegroupementForce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Repartition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Repartition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeRepartition(TypeTypeRepartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeSite(TypeTypeSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Sous Marin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Sous Marin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeSousMarin(TypeTypeSousMarin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Sous Systeme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Sous Systeme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeSousSysteme(TypeTypeSousSysteme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Unite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Unite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeUnite(TypeTypeUnite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type Vehicule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type Vehicule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTypeVehicule(TypeTypeVehicule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUnite(TypeUnite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite4 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite4 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUnite4D(TypeUnite4D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite Air</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite Air</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUniteAir(TypeUniteAir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUniteASS(TypeUniteASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite Beneficiaire Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite Beneficiaire Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUniteBeneficiaireMateriel(TypeUniteBeneficiaireMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite Cooperante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite Cooperante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUniteCooperante(TypeUniteCooperante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite Logistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite Logistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUniteLogistique(TypeUniteLogistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUniteMaintenance(TypeUniteMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite Materiel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUniteMateriel(TypeUniteMateriel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unite Participante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unite Participante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUniteParticipante(TypeUniteParticipante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Utilisation IFF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Utilisation IFF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUtilisationIFF(TypeUtilisationIFF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Variante Travail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Variante Travail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVarianteTravail(TypeVarianteTravail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Vehicule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Vehicule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVehicule(TypeVehicule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Vehicule Exceptionnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Vehicule Exceptionnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVehiculeExceptionnel(TypeVehiculeExceptionnel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Vent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Vent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVent(TypeVent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Visibilite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Visibilite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVisibilite(TypeVisibilite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Visibilite Sur Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Visibilite Sur Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVisibiliteSurObjectif(TypeVisibiliteSurObjectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Vol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Vol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVol(TypeVol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Volume Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Volume Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVolumeGeometrique(TypeVolumeGeometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Volume Munitions ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Volume Munitions ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVolumeMunitionsASS(TypeVolumeMunitionsASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Volume Securite ASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Volume Securite ASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVolumeSecuriteASS(TypeVolumeSecuriteASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type ZD Vpar Periode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type ZD Vpar Periode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZDVparPeriode(TypeZDVparPeriode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Acquisition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Acquisition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneAcquisition(TypeZoneAcquisition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Aerienne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Aerienne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneAerienne(TypeZoneAerienne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Alat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Alat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneAlat(TypeZoneAlat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Couverte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Couverte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneCouverte(TypeZoneCouverte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Diffusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Diffusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneDiffusion(TypeZoneDiffusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Fonctionnelle Logistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Fonctionnelle Logistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneFonctionnelleLogistique(TypeZoneFonctionnelleLogistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Intervention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Intervention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneIntervention(TypeZoneIntervention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Logistique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Logistique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneLogistique(TypeZoneLogistique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Mise ATerre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Mise ATerre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneMiseATerre(TypeZoneMiseATerre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Recherche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Recherche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneRecherche(TypeZoneRecherche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Risque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Risque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneRisque(TypeZoneRisque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Securite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Securite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneSecurite(TypeZoneSecurite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zones Implantation Proposees</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zones Implantation Proposees</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZonesImplantationProposees(TypeZonesImplantationProposees object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SchemaSwitch
