/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Unite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUnite#getNomFormelCourt <em>Nom Formel Court</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#isModele <em>Modele</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstEquipeDuSIOCaracteristiquesSIO <em>Est Equipe Du SIO Caracteristiques SIO</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteRenforcementsFeux <em>Est Sujet Association Unite Renforcements Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourSituationEquipementSituationEquipement <em>APour Situation Equipement Situation Equipement</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourSituationConsommableSituationConsommable <em>APour Situation Consommable Situation Consommable</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourSituationEffectifSituationEffectif <em>APour Situation Effectif Situation Effectif</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getCalendrierCourrierCalendrierCourrier <em>Calendrier Courrier Calendrier Courrier</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEtatDuSicEtatSic <em>Etat Du Sic Etat Sic</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEvenement4DEvenement4D <em>Evenement4 DEvenement4 D</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getMoyensCommunicationMoyenCommunication <em>Moyens Communication Moyen Communication</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourDirectionObservationAzimut <em>APour Direction Observation Azimut</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getReporteQuantiteElementENIDetruit <em>Reporte Quantite Element ENI Detruit</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getReporteQuantiteMateriel <em>Reporte Quantite Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getDemandeEvacuationSanitaire <em>Demande Evacuation Sanitaire</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getCaracteristiques4DUnite4D <em>Caracteristiques4 DUnite4 D</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourConsommableMajeurAssociationConsommableMajeur <em>APour Consommable Majeur Association Consommable Majeur</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getFormeLeGroupementGroupement <em>Forme Le Groupement Groupement</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourZoneEchangeAutreElementControle <em>APour Zone Echange Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstFourniPourPrelevementSubordonneNonIdentifie <em>Est Fourni Pour Prelevement Subordonne Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getBeneficiePrelevementSubordonneNonIdentifie <em>Beneficie Prelevement Subordonne Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourActiviteActivitePosture <em>APour Activite Activite Posture</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourCaracteristiquesCentreNC23CentreNC23 <em>APour Caracteristiques Centre NC23 Centre NC23</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourCaracteristiquesCentreLLAPICentreLLAPI <em>APour Caracteristiques Centre LLAPI Centre LLAPI</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getACommeSituationDesStocksFaitParEntrepotAutreSite <em>AComme Situation Des Stocks Fait Par Entrepot Autre Site</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs <em>AComme Consommation Autorisee En Explosifs Consommation Explosifs</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getACommeConsommationAutoriseeEnMinesConsommationMines <em>AComme Consommation Autorisee En Mines Consommation Mines</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourSyntheseSanteSyntheseSante <em>APour Synthese Sante Synthese Sante</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEmetInterventionGenerale <em>Emet Intervention Generale</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getACommeMoyenInvestigationMoyenInvestigation <em>AComme Moyen Investigation Moyen Investigation</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourCaracteristiquesOrganismeControleOrganismeControle <em>APour Caracteristiques Organisme Controle Organisme Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique <em>AComme Situation Des Stocks Fait Par Zone Logistique Zone Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourCaracteristiquesLogistiquesUniteLogistique <em>APour Caracteristiques Logistiques Unite Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourCaracteristiquesMaintenanceUniteMaintenance <em>APour Caracteristiques Maintenance Unite Maintenance</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourCaracteristiquesUniteASSUniteASS <em>APour Caracteristiques Unite ASS Unite ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourCaracteristiquesUniteAirUniteAir <em>APour Caracteristiques Unite Air Unite Air</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel <em>APour Materiels Genie Alloues Unite Beneficiaire Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourEquipementMajeurAssociationEquipementlMajeur <em>APour Equipement Majeur Association Equipementl Majeur</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourZoneResponsabiliteAutreElementControle <em>APour Zone Responsabilite Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteLivraison <em>Est Sujet Association Unite Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionEscorteAF <em>Est Sujet Association Unite Mission Escorte AF</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteAutreMissionLog <em>Est Sujet Association Unite Autre Mission Log</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionAir <em>Est Sujet Association Unite Mission Air</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionGenie <em>Est Sujet Association Unite Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUnitePlanifOperation3D <em>Est Sujet Association Unite Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionAcqASS <em>Est Sujet Association Unite Mission Acq ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionAerienne <em>Est Sujet Association Unite Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionALATattaque <em>Est Sujet Association Unite Mission ALA Tattaque</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionASA <em>Est Sujet Association Unite Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteAppuiFeuHelicoptere <em>Est Sujet Association Unite Appui Feu Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourZoneDiffusionZoneDiffusion <em>APour Zone Diffusion Zone Diffusion</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionTranspTact <em>Est Sujet Association Unite Mission Transp Tact</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionRensObj <em>Est Sujet Association Unite Mission Rens Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMouvementParRoute <em>Est Sujet Association Unite Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUnitePlanFeux <em>Est Sujet Association Unite Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionMelee <em>Est Sujet Association Unite Mission Melee</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionUniteAntichar <em>Est Sujet Association Unite Mission Unite Antichar</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationUniteMissionSic <em>Est Sujet Association Unite Mission Sic</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getBeneficieArticulationASS <em>Beneficie Articulation ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstFourniPourDetachementNonIdentifie <em>Est Fourni Pour Detachement Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getACommeAutoriteGuidageConsigne <em>AComme Autorite Guidage Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstInteresseeParFaitRenseignement <em>Est Interessee Par Fait Renseignement</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique <em>APour Mesures Protection Electronique Mesures Protection Electronique</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getBeneficieDetachementNonIdentifie <em>Beneficie Detachement Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstAOrigineObservationObservation <em>Est AOrigine Observation Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstSujetAssociationProfilUnite <em>Est Sujet Association Profil Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite#getEstFourniPourArticulationASS <em>Est Fourni Pour Articulation ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUnite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Unite' kind='elementOnly'"
 * @generated
 */
public interface TypeUnite extends TypeEntiteOrganisationnelle {
	/**
	 * Returns the value of the '<em><b>Nom Formel Court</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Formel Court</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Formel Court</em>' attribute.
	 * @see #setNomFormelCourt(String)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_NomFormelCourt()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='NomFormelCourt'"
	 * @generated
	 */
	String getNomFormelCourt();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getNomFormelCourt <em>Nom Formel Court</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Formel Court</em>' attribute.
	 * @see #getNomFormelCourt()
	 * @generated
	 */
	void setNomFormelCourt(String value);

	/**
	 * Returns the value of the '<em><b>Modele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modele</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modele</em>' attribute.
	 * @see #isSetModele()
	 * @see #unsetModele()
	 * @see #setModele(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_Modele()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Modele'"
	 * @generated
	 */
	boolean isModele();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#isModele <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modele</em>' attribute.
	 * @see #isSetModele()
	 * @see #unsetModele()
	 * @see #isModele()
	 * @generated
	 */
	void setModele(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUnite#isModele <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModele()
	 * @see #isModele()
	 * @see #setModele(boolean)
	 * @generated
	 */
	void unsetModele();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUnite#isModele <em>Modele</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modele</em>' attribute is set.
	 * @see #unsetModele()
	 * @see #isModele()
	 * @see #setModele(boolean)
	 * @generated
	 */
	boolean isSetModele();

	/**
	 * Returns the value of the '<em><b>Est Equipe Du SIO Caracteristiques SIO</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCaracteristiquesSIO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Equipe Du SIO Caracteristiques SIO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Equipe Du SIO Caracteristiques SIO</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstEquipeDuSIOCaracteristiquesSIO()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CaracteristiquesSIO'"
	 *        extendedMetaData="kind='element' name='EstEquipeDuSIO_CaracteristiquesSIO'"
	 * @generated
	 */
	EList<TypeCaracteristiquesSIO> getEstEquipeDuSIOCaracteristiquesSIO();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Renforcements Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Renforcements Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Renforcements Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteRenforcementsFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteRenforcementsFeux'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteRenforcementsFeux'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteRenforcementsFeux();

	/**
	 * Returns the value of the '<em><b>APour Situation Equipement Situation Equipement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Situation Equipement Situation Equipement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Situation Equipement Situation Equipement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourSituationEquipementSituationEquipement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EmisePar_Unite' target_entity='type_SituationEquipement'"
	 *        extendedMetaData="kind='element' name='APourSituationEquipement_SituationEquipement'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourSituationEquipementSituationEquipement();

	/**
	 * Returns the value of the '<em><b>APour Situation Consommable Situation Consommable</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Situation Consommable Situation Consommable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Situation Consommable Situation Consommable</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourSituationConsommableSituationConsommable()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EmisePar_Unite' target_entity='type_SituationConsommable'"
	 *        extendedMetaData="kind='element' name='APourSituationConsommable_SituationConsommable'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourSituationConsommableSituationConsommable();

	/**
	 * Returns the value of the '<em><b>APour Situation Effectif Situation Effectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Situation Effectif Situation Effectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Situation Effectif Situation Effectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourSituationEffectifSituationEffectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EmisePar_Unite' target_entity='type_SituationEffectif'"
	 *        extendedMetaData="kind='element' name='APourSituationEffectif_SituationEffectif'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourSituationEffectifSituationEffectif();

	/**
	 * Returns the value of the '<em><b>Calendrier Courrier Calendrier Courrier</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCalendrierCourrier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendrier Courrier Calendrier Courrier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendrier Courrier Calendrier Courrier</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_CalendrierCourrierCalendrierCourrier()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CalendrierCourrier'"
	 *        extendedMetaData="kind='element' name='CalendrierCourrier_CalendrierCourrier'"
	 * @generated
	 */
	EList<TypeCalendrierCourrier> getCalendrierCourrierCalendrierCourrier();

	/**
	 * Returns the value of the '<em><b>Etat Du Sic Etat Sic</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatSic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Du Sic Etat Sic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Du Sic Etat Sic</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EtatDuSicEtatSic()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatSic'"
	 *        extendedMetaData="kind='element' name='EtatDuSic_EtatSic'"
	 * @generated
	 */
	EList<TypeEtatSic> getEtatDuSicEtatSic();

	/**
	 * Returns the value of the '<em><b>Evenement4 DEvenement4 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvenement4D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evenement4 DEvenement4 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenement4 DEvenement4 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_Evenement4DEvenement4D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Evenement4D'"
	 *        extendedMetaData="kind='element' name='Evenement4D_Evenement4D'"
	 * @generated
	 */
	EList<TypeEvenement4D> getEvenement4DEvenement4D();

	/**
	 * Returns the value of the '<em><b>Moyens Communication Moyen Communication</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyenCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Communication Moyen Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Communication Moyen Communication</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_MoyensCommunicationMoyenCommunication()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyenCommunication'"
	 *        extendedMetaData="kind='element' name='MoyensCommunication_MoyenCommunication'"
	 * @generated
	 */
	EList<TypeMoyenCommunication> getMoyensCommunicationMoyenCommunication();

	/**
	 * Returns the value of the '<em><b>APour Direction Observation Azimut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Direction Observation Azimut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Direction Observation Azimut</em>' containment reference.
	 * @see #setAPourDirectionObservationAzimut(TypeAzimut)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourDirectionObservationAzimut()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Azimut'"
	 *        extendedMetaData="kind='element' name='APourDirectionObservation_Azimut'"
	 * @generated
	 */
	TypeAzimut getAPourDirectionObservationAzimut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourDirectionObservationAzimut <em>APour Direction Observation Azimut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Direction Observation Azimut</em>' containment reference.
	 * @see #getAPourDirectionObservationAzimut()
	 * @generated
	 */
	void setAPourDirectionObservationAzimut(TypeAzimut value);

	/**
	 * Returns the value of the '<em><b>Reporte Quantite Element ENI Detruit</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteElementENIDetruit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporte Quantite Element ENI Detruit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporte Quantite Element ENI Detruit</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_ReporteQuantiteElementENIDetruit()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteElementENIDetruit'"
	 *        extendedMetaData="kind='element' name='Reporte_QuantiteElementENIDetruit'"
	 * @generated
	 */
	EList<TypeQuantiteElementENIDetruit> getReporteQuantiteElementENIDetruit();

	/**
	 * Returns the value of the '<em><b>Reporte Quantite Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporte Quantite Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporte Quantite Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_ReporteQuantiteMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteMateriel'"
	 *        extendedMetaData="kind='element' name='Reporte_QuantiteMateriel'"
	 * @generated
	 */
	EList<TypeQuantiteMateriel> getReporteQuantiteMateriel();

	/**
	 * Returns the value of the '<em><b>Demande Evacuation Sanitaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvacuationSanitaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demande Evacuation Sanitaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demande Evacuation Sanitaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_DemandeEvacuationSanitaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EvacuationSanitaire'"
	 *        extendedMetaData="kind='element' name='Demande_EvacuationSanitaire'"
	 * @generated
	 */
	EList<TypeEvacuationSanitaire> getDemandeEvacuationSanitaire();

	/**
	 * Returns the value of the '<em><b>Caracteristiques4 DUnite4 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteristiques4 DUnite4 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristiques4 DUnite4 D</em>' containment reference.
	 * @see #setCaracteristiques4DUnite4D(TypeUnite4D)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_Caracteristiques4DUnite4D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Unite4D'"
	 *        extendedMetaData="kind='element' name='Caracteristiques4D_Unite4D'"
	 * @generated
	 */
	TypeUnite4D getCaracteristiques4DUnite4D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getCaracteristiques4DUnite4D <em>Caracteristiques4 DUnite4 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteristiques4 DUnite4 D</em>' containment reference.
	 * @see #getCaracteristiques4DUnite4D()
	 * @generated
	 */
	void setCaracteristiques4DUnite4D(TypeUnite4D value);

	/**
	 * Returns the value of the '<em><b>APour Consommable Majeur Association Consommable Majeur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Consommable Majeur Association Consommable Majeur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Consommable Majeur Association Consommable Majeur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourConsommableMajeurAssociationConsommableMajeur()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeUnite_Unite' target_entity='type_AssociationConsommablelMajeur'"
	 *        extendedMetaData="kind='element' name='APourConsommableMajeur_AssociationConsommableMajeur'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourConsommableMajeurAssociationConsommableMajeur();

	/**
	 * Returns the value of the '<em><b>Forme Le Groupement Groupement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forme Le Groupement Groupement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forme Le Groupement Groupement</em>' containment reference.
	 * @see #setFormeLeGroupementGroupement(TypeGroupement)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_FormeLeGroupementGroupement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Groupement'"
	 *        extendedMetaData="kind='element' name='FormeLeGroupement_Groupement'"
	 * @generated
	 */
	TypeGroupement getFormeLeGroupementGroupement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getFormeLeGroupementGroupement <em>Forme Le Groupement Groupement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forme Le Groupement Groupement</em>' containment reference.
	 * @see #getFormeLeGroupementGroupement()
	 * @generated
	 */
	void setFormeLeGroupementGroupement(TypeGroupement value);

	/**
	 * Returns the value of the '<em><b>APour Zone Echange Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Echange Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Echange Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneEchangeAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourZoneEchangeAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneEchange_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneEchangeAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourZoneEchangeAutreElementControle <em>APour Zone Echange Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Echange Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneEchangeAutreElementControle()
	 * @generated
	 */
	void setAPourZoneEchangeAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Fourni Pour Prelevement Subordonne Non Identifie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Fourni Pour Prelevement Subordonne Non Identifie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Fourni Pour Prelevement Subordonne Non Identifie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstFourniPourPrelevementSubordonneNonIdentifie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeUniteFournisseur_Unite' target_entity='type_PrelevementSubordonneNonIdentifie'"
	 *        extendedMetaData="kind='element' name='EstFourniPour_PrelevementSubordonneNonIdentifie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstFourniPourPrelevementSubordonneNonIdentifie();

	/**
	 * Returns the value of the '<em><b>Beneficie Prelevement Subordonne Non Identifie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beneficie Prelevement Subordonne Non Identifie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beneficie Prelevement Subordonne Non Identifie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_BeneficiePrelevementSubordonneNonIdentifie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeUniteBeneficiaire_Unite' target_entity='type_PrelevementSubordonneNonIdentifie'"
	 *        extendedMetaData="kind='element' name='Beneficie_PrelevementSubordonneNonIdentifie'"
	 * @generated
	 */
	EList<TypeAssociation> getBeneficiePrelevementSubordonneNonIdentifie();

	/**
	 * Returns the value of the '<em><b>APour Activite Activite Posture</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Activite Activite Posture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Activite Activite Posture</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourActiviteActivitePosture()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_Unite' target_entity='type_ActivitePosture'"
	 *        extendedMetaData="kind='element' name='APourActivite_ActivitePosture'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourActiviteActivitePosture();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Centre NC23 Centre NC23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Centre NC23 Centre NC23</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Centre NC23 Centre NC23</em>' containment reference.
	 * @see #setAPourCaracteristiquesCentreNC23CentreNC23(TypeCentreNC23)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourCaracteristiquesCentreNC23CentreNC23()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CentreNC23'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesCentreNC23_CentreNC23'"
	 * @generated
	 */
	TypeCentreNC23 getAPourCaracteristiquesCentreNC23CentreNC23();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourCaracteristiquesCentreNC23CentreNC23 <em>APour Caracteristiques Centre NC23 Centre NC23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Centre NC23 Centre NC23</em>' containment reference.
	 * @see #getAPourCaracteristiquesCentreNC23CentreNC23()
	 * @generated
	 */
	void setAPourCaracteristiquesCentreNC23CentreNC23(TypeCentreNC23 value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Centre LLAPI Centre LLAPI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Centre LLAPI Centre LLAPI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Centre LLAPI Centre LLAPI</em>' containment reference.
	 * @see #setAPourCaracteristiquesCentreLLAPICentreLLAPI(TypeCentreLLAPI)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourCaracteristiquesCentreLLAPICentreLLAPI()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CentreLLAPI'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesCentreLLAPI_CentreLLAPI'"
	 * @generated
	 */
	TypeCentreLLAPI getAPourCaracteristiquesCentreLLAPICentreLLAPI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourCaracteristiquesCentreLLAPICentreLLAPI <em>APour Caracteristiques Centre LLAPI Centre LLAPI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Centre LLAPI Centre LLAPI</em>' containment reference.
	 * @see #getAPourCaracteristiquesCentreLLAPICentreLLAPI()
	 * @generated
	 */
	void setAPourCaracteristiquesCentreLLAPICentreLLAPI(TypeCentreLLAPI value);

	/**
	 * Returns the value of the '<em><b>AComme Situation Des Stocks Fait Par Entrepot Autre Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Situation Des Stocks Fait Par Entrepot Autre Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Situation Des Stocks Fait Par Entrepot Autre Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_ACommeSituationDesStocksFaitParEntrepotAutreSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreSite'"
	 *        extendedMetaData="kind='element' name='ACommeSituationDesStocksFaitParEntrepot_AutreSite'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeSituationDesStocksFaitParEntrepotAutreSite();

	/**
	 * Returns the value of the '<em><b>AComme Consommation Autorisee En Explosifs Consommation Explosifs</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsommationExplosifs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consommation Autorisee En Explosifs Consommation Explosifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consommation Autorisee En Explosifs Consommation Explosifs</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_ACommeConsommationAutoriseeEnExplosifsConsommationExplosifs()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsommationExplosifs'"
	 *        extendedMetaData="kind='element' name='ACommeConsommationAutoriseeEnExplosifs_ConsommationExplosifs'"
	 * @generated
	 */
	EList<TypeConsommationExplosifs> getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs();

	/**
	 * Returns the value of the '<em><b>AComme Consommation Autorisee En Mines Consommation Mines</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsommationMines}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consommation Autorisee En Mines Consommation Mines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consommation Autorisee En Mines Consommation Mines</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_ACommeConsommationAutoriseeEnMinesConsommationMines()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsommationMines'"
	 *        extendedMetaData="kind='element' name='ACommeConsommationAutoriseeEnMines_ConsommationMines'"
	 * @generated
	 */
	EList<TypeConsommationMines> getACommeConsommationAutoriseeEnMinesConsommationMines();

	/**
	 * Returns the value of the '<em><b>APour Synthese Sante Synthese Sante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Synthese Sante Synthese Sante</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Synthese Sante Synthese Sante</em>' containment reference.
	 * @see #setAPourSyntheseSanteSyntheseSante(TypeSyntheseSante)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourSyntheseSanteSyntheseSante()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_SyntheseSante'"
	 *        extendedMetaData="kind='element' name='APourSyntheseSante_SyntheseSante'"
	 * @generated
	 */
	TypeSyntheseSante getAPourSyntheseSanteSyntheseSante();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourSyntheseSanteSyntheseSante <em>APour Synthese Sante Synthese Sante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Synthese Sante Synthese Sante</em>' containment reference.
	 * @see #getAPourSyntheseSanteSyntheseSante()
	 * @generated
	 */
	void setAPourSyntheseSanteSyntheseSante(TypeSyntheseSante value);

	/**
	 * Returns the value of the '<em><b>Emet Intervention Generale</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emet Intervention Generale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emet Intervention Generale</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EmetInterventionGenerale()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourDonneurOrdre_Unite' target_entity='type_InterventionGenerale'"
	 *        extendedMetaData="kind='element' name='Emet_InterventionGenerale'"
	 * @generated
	 */
	EList<TypeAssociation> getEmetInterventionGenerale();

	/**
	 * Returns the value of the '<em><b>AComme Moyen Investigation Moyen Investigation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyenInvestigation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Moyen Investigation Moyen Investigation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Moyen Investigation Moyen Investigation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_ACommeMoyenInvestigationMoyenInvestigation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyenInvestigation'"
	 *        extendedMetaData="kind='element' name='ACommeMoyenInvestigation_MoyenInvestigation'"
	 * @generated
	 */
	EList<TypeMoyenInvestigation> getACommeMoyenInvestigationMoyenInvestigation();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Organisme Controle Organisme Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Organisme Controle Organisme Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Organisme Controle Organisme Controle</em>' containment reference.
	 * @see #setAPourCaracteristiquesOrganismeControleOrganismeControle(TypeOrganismeControle)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourCaracteristiquesOrganismeControleOrganismeControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_OrganismeControle'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesOrganismeControle_OrganismeControle'"
	 * @generated
	 */
	TypeOrganismeControle getAPourCaracteristiquesOrganismeControleOrganismeControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourCaracteristiquesOrganismeControleOrganismeControle <em>APour Caracteristiques Organisme Controle Organisme Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Organisme Controle Organisme Controle</em>' containment reference.
	 * @see #getAPourCaracteristiquesOrganismeControleOrganismeControle()
	 * @generated
	 */
	void setAPourCaracteristiquesOrganismeControleOrganismeControle(TypeOrganismeControle value);

	/**
	 * Returns the value of the '<em><b>AComme Situation Des Stocks Fait Par Zone Logistique Zone Logistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Situation Des Stocks Fait Par Zone Logistique Zone Logistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Situation Des Stocks Fait Par Zone Logistique Zone Logistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_ACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ZoneLogistique'"
	 *        extendedMetaData="kind='element' name='ACommeSituationDesStocksFaitParZoneLogistique_ZoneLogistique'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Logistiques Unite Logistique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Logistiques Unite Logistique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Logistiques Unite Logistique</em>' containment reference.
	 * @see #setAPourCaracteristiquesLogistiquesUniteLogistique(TypeUniteLogistique)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourCaracteristiquesLogistiquesUniteLogistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_UniteLogistique'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesLogistiques_UniteLogistique'"
	 * @generated
	 */
	TypeUniteLogistique getAPourCaracteristiquesLogistiquesUniteLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourCaracteristiquesLogistiquesUniteLogistique <em>APour Caracteristiques Logistiques Unite Logistique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Logistiques Unite Logistique</em>' containment reference.
	 * @see #getAPourCaracteristiquesLogistiquesUniteLogistique()
	 * @generated
	 */
	void setAPourCaracteristiquesLogistiquesUniteLogistique(TypeUniteLogistique value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Maintenance Unite Maintenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Maintenance Unite Maintenance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Maintenance Unite Maintenance</em>' containment reference.
	 * @see #setAPourCaracteristiquesMaintenanceUniteMaintenance(TypeUniteMaintenance)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourCaracteristiquesMaintenanceUniteMaintenance()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_UniteMaintenance'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesMaintenance_UniteMaintenance'"
	 * @generated
	 */
	TypeUniteMaintenance getAPourCaracteristiquesMaintenanceUniteMaintenance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourCaracteristiquesMaintenanceUniteMaintenance <em>APour Caracteristiques Maintenance Unite Maintenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Maintenance Unite Maintenance</em>' containment reference.
	 * @see #getAPourCaracteristiquesMaintenanceUniteMaintenance()
	 * @generated
	 */
	void setAPourCaracteristiquesMaintenanceUniteMaintenance(TypeUniteMaintenance value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Unite ASS Unite ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Unite ASS Unite ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Unite ASS Unite ASS</em>' containment reference.
	 * @see #setAPourCaracteristiquesUniteASSUniteASS(TypeUniteASS)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourCaracteristiquesUniteASSUniteASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_UniteASS'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesUniteASS_UniteASS'"
	 * @generated
	 */
	TypeUniteASS getAPourCaracteristiquesUniteASSUniteASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourCaracteristiquesUniteASSUniteASS <em>APour Caracteristiques Unite ASS Unite ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Unite ASS Unite ASS</em>' containment reference.
	 * @see #getAPourCaracteristiquesUniteASSUniteASS()
	 * @generated
	 */
	void setAPourCaracteristiquesUniteASSUniteASS(TypeUniteASS value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Unite Air Unite Air</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Unite Air Unite Air</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Unite Air Unite Air</em>' containment reference.
	 * @see #setAPourCaracteristiquesUniteAirUniteAir(TypeUniteAir)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourCaracteristiquesUniteAirUniteAir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_UniteAir'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesUniteAir_UniteAir'"
	 * @generated
	 */
	TypeUniteAir getAPourCaracteristiquesUniteAirUniteAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourCaracteristiquesUniteAirUniteAir <em>APour Caracteristiques Unite Air Unite Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Unite Air Unite Air</em>' containment reference.
	 * @see #getAPourCaracteristiquesUniteAirUniteAir()
	 * @generated
	 */
	void setAPourCaracteristiquesUniteAirUniteAir(TypeUniteAir value);

	/**
	 * Returns the value of the '<em><b>APour Materiels Genie Alloues Unite Beneficiaire Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeUniteBeneficiaireMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Materiels Genie Alloues Unite Beneficiaire Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Materiels Genie Alloues Unite Beneficiaire Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourMaterielsGenieAllouesUniteBeneficiaireMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_UniteBeneficiaireMateriel'"
	 *        extendedMetaData="kind='element' name='APourMaterielsGenieAlloues_UniteBeneficiaireMateriel'"
	 * @generated
	 */
	EList<TypeUniteBeneficiaireMateriel> getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel();

	/**
	 * Returns the value of the '<em><b>APour Equipement Majeur Association Equipementl Majeur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Equipement Majeur Association Equipementl Majeur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Equipement Majeur Association Equipementl Majeur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourEquipementMajeurAssociationEquipementlMajeur()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeUnite_Unite' target_entity='type_AssociationEquipementlMajeur'"
	 *        extendedMetaData="kind='element' name='APourEquipementMajeur_AssociationEquipementlMajeur'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourEquipementMajeurAssociationEquipementlMajeur();

	/**
	 * Returns the value of the '<em><b>APour Zone Responsabilite Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Responsabilite Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Responsabilite Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneResponsabiliteAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourZoneResponsabiliteAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneResponsabilite_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneResponsabiliteAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourZoneResponsabiliteAutreElementControle <em>APour Zone Responsabilite Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Responsabilite Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneResponsabiliteAutreElementControle()
	 * @generated
	 */
	void setAPourZoneResponsabiliteAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Livraison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Livraison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Livraison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteLivraison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteLivraison'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteLivraison'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteLivraison();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Escorte AF</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Escorte AF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Escorte AF</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionEscorteAF()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionEscorteAF'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionEscorteAF'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionEscorteAF();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Autre Mission Log</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Autre Mission Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Autre Mission Log</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteAutreMissionLog()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteAutreMissionLog'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteAutreMissionLog'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteAutreMissionLog();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionAir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionAir'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionAir'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionAir();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionGenie'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionGenie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionGenie();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Planif Operation3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Planif Operation3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Planif Operation3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUnitePlanifOperation3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUnitePlanifOperation3D'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUnitePlanifOperation3D'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUnitePlanifOperation3D();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Acq ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Acq ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Acq ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionAcqASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionAcqASS'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionAcqASS'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionAcqASS();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionAerienne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission ALA Tattaque</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission ALA Tattaque</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission ALA Tattaque</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionALATattaque()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionALATattaque'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionALATattaque'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionALATattaque();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionASA()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionASA'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionASA'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionASA();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Appui Feu Helicoptere</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Appui Feu Helicoptere</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Appui Feu Helicoptere</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteAppuiFeuHelicoptere()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteAppuiFeuHelicoptere'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteAppuiFeuHelicoptere'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteAppuiFeuHelicoptere();

	/**
	 * Returns the value of the '<em><b>APour Zone Diffusion Zone Diffusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Diffusion Zone Diffusion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Diffusion Zone Diffusion</em>' containment reference.
	 * @see #setAPourZoneDiffusionZoneDiffusion(TypeZoneDiffusion)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourZoneDiffusionZoneDiffusion()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ZoneDiffusion'"
	 *        extendedMetaData="kind='element' name='APourZoneDiffusion_ZoneDiffusion'"
	 * @generated
	 */
	TypeZoneDiffusion getAPourZoneDiffusionZoneDiffusion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getAPourZoneDiffusionZoneDiffusion <em>APour Zone Diffusion Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Diffusion Zone Diffusion</em>' containment reference.
	 * @see #getAPourZoneDiffusionZoneDiffusion()
	 * @generated
	 */
	void setAPourZoneDiffusionZoneDiffusion(TypeZoneDiffusion value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Transp Tact</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Transp Tact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Transp Tact</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionTranspTact()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionTranspTact'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionTranspTact'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionTranspTact();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Rens Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Rens Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Rens Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionRensObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionRensObj'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionRensObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionRensObj();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMouvementParRoute()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMouvementParRoute'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMouvementParRoute'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMouvementParRoute();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Plan Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Plan Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Plan Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUnitePlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUnitePlanFeux'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUnitePlanFeux'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUnitePlanFeux();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Melee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Melee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Melee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionMelee()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionMelee'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionMelee'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionMelee();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Unite Antichar</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Unite Antichar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Unite Antichar</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionUniteAntichar()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionUniteAntichar'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionUniteAntichar'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionUniteAntichar();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Unite Mission Sic</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Unite Mission Sic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Unite Mission Sic</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationUniteMissionSic()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Unite' target_entity='type_AssociationUniteMissionSic'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationUniteMissionSic'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationUniteMissionSic();

	/**
	 * Returns the value of the '<em><b>Beneficie Articulation ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beneficie Articulation ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beneficie Articulation ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_BeneficieArticulationASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeUniteBeneficiaire_Unite' target_entity='type_ArticulationASS'"
	 *        extendedMetaData="kind='element' name='Beneficie_ArticulationASS'"
	 * @generated
	 */
	EList<TypeAssociation> getBeneficieArticulationASS();

	/**
	 * Returns the value of the '<em><b>Est Fourni Pour Detachement Non Identifie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Fourni Pour Detachement Non Identifie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Fourni Pour Detachement Non Identifie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstFourniPourDetachementNonIdentifie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeUniteFournisseur_Unite' target_entity='type_DetachementNonIdentifie'"
	 *        extendedMetaData="kind='element' name='EstFourniPour_DetachementNonIdentifie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstFourniPourDetachementNonIdentifie();

	/**
	 * Returns the value of the '<em><b>AComme Autorite Guidage Consigne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Autorite Guidage Consigne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Autorite Guidage Consigne</em>' containment reference.
	 * @see #setACommeAutoriteGuidageConsigne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeUnite_ACommeAutoriteGuidageConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='ACommeAutoriteGuidage_Consigne'"
	 * @generated
	 */
	TypeAssociation getACommeAutoriteGuidageConsigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite#getACommeAutoriteGuidageConsigne <em>AComme Autorite Guidage Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Autorite Guidage Consigne</em>' containment reference.
	 * @see #getACommeAutoriteGuidageConsigne()
	 * @generated
	 */
	void setACommeAutoriteGuidageConsigne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Interessee Par Fait Renseignement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Interessee Par Fait Renseignement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Interessee Par Fait Renseignement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstInteresseeParFaitRenseignement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeAutoriteInteressee_Unite' target_entity='type_FaitRenseignement'"
	 *        extendedMetaData="kind='element' name='EstInteresseePar_FaitRenseignement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstInteresseeParFaitRenseignement();

	/**
	 * Returns the value of the '<em><b>APour Mesures Protection Electronique Mesures Protection Electronique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mesures Protection Electronique Mesures Protection Electronique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mesures Protection Electronique Mesures Protection Electronique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_APourMesuresProtectionElectroniqueMesuresProtectionElectronique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourUniteConcernee_Unite' target_entity='type_MesuresProtectionElectronique'"
	 *        extendedMetaData="kind='element' name='APourMesuresProtectionElectronique_MesuresProtectionElectronique'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique();

	/**
	 * Returns the value of the '<em><b>Beneficie Detachement Non Identifie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beneficie Detachement Non Identifie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beneficie Detachement Non Identifie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_BeneficieDetachementNonIdentifie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeUniteBeneficiaire_Unite' target_entity='type_DetachementNonIdentifie'"
	 *        extendedMetaData="kind='element' name='Beneficie_DetachementNonIdentifie'"
	 * @generated
	 */
	EList<TypeAssociation> getBeneficieDetachementNonIdentifie();

	/**
	 * Returns the value of the '<em><b>Est AOrigine Observation Observation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est AOrigine Observation Observation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est AOrigine Observation Observation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstAOrigineObservationObservation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeOrigineRenseignement_Unite' target_entity='type_Observation'"
	 *        extendedMetaData="kind='element' name='EstAOrigineObservation_Observation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstAOrigineObservationObservation();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Profil Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Profil Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Profil Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstSujetAssociationProfilUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Unite' target_entity='type_AssociationProfilUnite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationProfilUnite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationProfilUnite();

	/**
	 * Returns the value of the '<em><b>Est Fourni Pour Articulation ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Fourni Pour Articulation ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Fourni Pour Articulation ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUnite_EstFourniPourArticulationASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeUniteFournisseur_Unite' target_entity='type_ArticulationASS'"
	 *        extendedMetaData="kind='element' name='EstFourniPour_ArticulationASS'"
	 * @generated
	 */
	EList<TypeAssociation> getEstFourniPourArticulationASS();

} // TypeUnite
