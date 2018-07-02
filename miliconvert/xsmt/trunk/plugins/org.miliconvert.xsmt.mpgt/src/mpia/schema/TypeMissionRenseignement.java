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
 * A representation of the model object '<em><b>Type Mission Renseignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getEffortOuPriorite <em>Effort Ou Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getProcedureCRaAppliquer <em>Procedure CRa Appliquer</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getPrescriptionParticuliere <em>Prescription Particuliere</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getTypeTechniqueAMettreEnOeuvre <em>Type Technique AMettre En Oeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getEstSujetAssociationMissionRenseignementAction <em>Est Sujet Association Mission Renseignement Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getAPourUniteAppuiGenieUnite <em>APour Unite Appui Genie Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getMissionDroneMissionDrone <em>Mission Drone Mission Drone</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getCapteurCapteurRENS <em>Capteur Capteur RENS</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getMissionRadarMissionRadar <em>Mission Radar Mission Radar</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique <em>Mission Localisation Radioelectrique Mission Localisation Radio Electrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getMissionROHUMMissionRohum <em>Mission ROHUM Mission Rohum</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getAPourZoneRecherchePrioritaireZoneRecherche <em>APour Zone Recherche Prioritaire Zone Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignement#getACommeEmplacementObservationAutreElementControle <em>AComme Emplacement Observation Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionRenseignement' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionRenseignement extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Effort Ou Priorite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effort Ou Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effort Ou Priorite</em>' attribute.
	 * @see #setEffortOuPriorite(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_EffortOuPriorite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='EffortOuPriorite'"
	 * @generated
	 */
	String getEffortOuPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getEffortOuPriorite <em>Effort Ou Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort Ou Priorite</em>' attribute.
	 * @see #getEffortOuPriorite()
	 * @generated
	 */
	void setEffortOuPriorite(String value);

	/**
	 * Returns the value of the '<em><b>Procedure CRa Appliquer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure CRa Appliquer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure CRa Appliquer</em>' attribute.
	 * @see #setProcedureCRaAppliquer(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_ProcedureCRaAppliquer()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ProcedureCRaAppliquer'"
	 * @generated
	 */
	String getProcedureCRaAppliquer();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getProcedureCRaAppliquer <em>Procedure CRa Appliquer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure CRa Appliquer</em>' attribute.
	 * @see #getProcedureCRaAppliquer()
	 * @generated
	 */
	void setProcedureCRaAppliquer(String value);

	/**
	 * Returns the value of the '<em><b>Prescription Particuliere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription Particuliere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription Particuliere</em>' attribute.
	 * @see #setPrescriptionParticuliere(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_PrescriptionParticuliere()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='PrescriptionParticuliere'"
	 * @generated
	 */
	String getPrescriptionParticuliere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getPrescriptionParticuliere <em>Prescription Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription Particuliere</em>' attribute.
	 * @see #getPrescriptionParticuliere()
	 * @generated
	 */
	void setPrescriptionParticuliere(String value);

	/**
	 * Returns the value of the '<em><b>Type Technique AMettre En Oeuvre</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeVecteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Technique AMettre En Oeuvre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Technique AMettre En Oeuvre</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVecteur
	 * @see #isSetTypeTechniqueAMettreEnOeuvre()
	 * @see #unsetTypeTechniqueAMettreEnOeuvre()
	 * @see #setTypeTechniqueAMettreEnOeuvre(TypeDictionaryDicoTypeVecteur)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_TypeTechniqueAMettreEnOeuvre()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeTechniqueAMettreEnOeuvre'"
	 * @generated
	 */
	TypeDictionaryDicoTypeVecteur getTypeTechniqueAMettreEnOeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getTypeTechniqueAMettreEnOeuvre <em>Type Technique AMettre En Oeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Technique AMettre En Oeuvre</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVecteur
	 * @see #isSetTypeTechniqueAMettreEnOeuvre()
	 * @see #unsetTypeTechniqueAMettreEnOeuvre()
	 * @see #getTypeTechniqueAMettreEnOeuvre()
	 * @generated
	 */
	void setTypeTechniqueAMettreEnOeuvre(TypeDictionaryDicoTypeVecteur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionRenseignement#getTypeTechniqueAMettreEnOeuvre <em>Type Technique AMettre En Oeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeTechniqueAMettreEnOeuvre()
	 * @see #getTypeTechniqueAMettreEnOeuvre()
	 * @see #setTypeTechniqueAMettreEnOeuvre(TypeDictionaryDicoTypeVecteur)
	 * @generated
	 */
	void unsetTypeTechniqueAMettreEnOeuvre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionRenseignement#getTypeTechniqueAMettreEnOeuvre <em>Type Technique AMettre En Oeuvre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Technique AMettre En Oeuvre</em>' attribute is set.
	 * @see #unsetTypeTechniqueAMettreEnOeuvre()
	 * @see #getTypeTechniqueAMettreEnOeuvre()
	 * @see #setTypeTechniqueAMettreEnOeuvre(TypeDictionaryDicoTypeVecteur)
	 * @generated
	 */
	boolean isSetTypeTechniqueAMettreEnOeuvre();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mission Renseignement Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mission Renseignement Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mission Renseignement Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_EstSujetAssociationMissionRenseignementAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_MissionRenseignement' target_entity='type_AssociationMissionRenseignementAction'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMissionRenseignementAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMissionRenseignementAction();

	/**
	 * Returns the value of the '<em><b>APour Unite Appui Genie Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Appui Genie Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Appui Genie Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_APourUniteAppuiGenieUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteAppuiGenie_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteAppuiGenieUnite();

	/**
	 * Returns the value of the '<em><b>Mission Drone Mission Drone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Drone Mission Drone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Drone Mission Drone</em>' containment reference.
	 * @see #setMissionDroneMissionDrone(TypeMissionDrone)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_MissionDroneMissionDrone()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MissionDrone'"
	 *        extendedMetaData="kind='element' name='MissionDrone_MissionDrone'"
	 * @generated
	 */
	TypeMissionDrone getMissionDroneMissionDrone();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getMissionDroneMissionDrone <em>Mission Drone Mission Drone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Drone Mission Drone</em>' containment reference.
	 * @see #getMissionDroneMissionDrone()
	 * @generated
	 */
	void setMissionDroneMissionDrone(TypeMissionDrone value);

	/**
	 * Returns the value of the '<em><b>Capteur Capteur RENS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capteur Capteur RENS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capteur Capteur RENS</em>' containment reference.
	 * @see #setCapteurCapteurRENS(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_CapteurCapteurRENS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Missions_MissionRenseignement' target_entity='type_CapteurRENS'"
	 *        extendedMetaData="kind='element' name='Capteur_CapteurRENS'"
	 * @generated
	 */
	TypeAssociation getCapteurCapteurRENS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getCapteurCapteurRENS <em>Capteur Capteur RENS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capteur Capteur RENS</em>' containment reference.
	 * @see #getCapteurCapteurRENS()
	 * @generated
	 */
	void setCapteurCapteurRENS(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Mission Radar Mission Radar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Radar Mission Radar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Radar Mission Radar</em>' containment reference.
	 * @see #setMissionRadarMissionRadar(TypeMissionRadar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_MissionRadarMissionRadar()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MissionRadar'"
	 *        extendedMetaData="kind='element' name='MissionRadar_MissionRadar'"
	 * @generated
	 */
	TypeMissionRadar getMissionRadarMissionRadar();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getMissionRadarMissionRadar <em>Mission Radar Mission Radar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Radar Mission Radar</em>' containment reference.
	 * @see #getMissionRadarMissionRadar()
	 * @generated
	 */
	void setMissionRadarMissionRadar(TypeMissionRadar value);

	/**
	 * Returns the value of the '<em><b>Mission Localisation Radioelectrique Mission Localisation Radio Electrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Localisation Radioelectrique Mission Localisation Radio Electrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Localisation Radioelectrique Mission Localisation Radio Electrique</em>' containment reference.
	 * @see #setMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique(TypeMissionLocalisationRadioElectrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_MissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MissionLocalisationRadioElectrique'"
	 *        extendedMetaData="kind='element' name='MissionLocalisationRadioelectrique_MissionLocalisationRadioElectrique'"
	 * @generated
	 */
	TypeMissionLocalisationRadioElectrique getMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique <em>Mission Localisation Radioelectrique Mission Localisation Radio Electrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Localisation Radioelectrique Mission Localisation Radio Electrique</em>' containment reference.
	 * @see #getMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique()
	 * @generated
	 */
	void setMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique(TypeMissionLocalisationRadioElectrique value);

	/**
	 * Returns the value of the '<em><b>Mission ROHUM Mission Rohum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission ROHUM Mission Rohum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission ROHUM Mission Rohum</em>' containment reference.
	 * @see #setMissionROHUMMissionRohum(TypeMissionRohum)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_MissionROHUMMissionRohum()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MissionRohum'"
	 *        extendedMetaData="kind='element' name='MissionROHUM_MissionRohum'"
	 * @generated
	 */
	TypeMissionRohum getMissionROHUMMissionRohum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getMissionROHUMMissionRohum <em>Mission ROHUM Mission Rohum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission ROHUM Mission Rohum</em>' containment reference.
	 * @see #getMissionROHUMMissionRohum()
	 * @generated
	 */
	void setMissionROHUMMissionRohum(TypeMissionRohum value);

	/**
	 * Returns the value of the '<em><b>APour Zone Recherche Prioritaire Zone Recherche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Recherche Prioritaire Zone Recherche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Recherche Prioritaire Zone Recherche</em>' containment reference.
	 * @see #setAPourZoneRecherchePrioritaireZoneRecherche(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_APourZoneRecherchePrioritaireZoneRecherche()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ZoneRecherche'"
	 *        extendedMetaData="kind='element' name='APourZoneRecherchePrioritaire_ZoneRecherche'"
	 * @generated
	 */
	TypeAssociation getAPourZoneRecherchePrioritaireZoneRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getAPourZoneRecherchePrioritaireZoneRecherche <em>APour Zone Recherche Prioritaire Zone Recherche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Recherche Prioritaire Zone Recherche</em>' containment reference.
	 * @see #getAPourZoneRecherchePrioritaireZoneRecherche()
	 * @generated
	 */
	void setAPourZoneRecherchePrioritaireZoneRecherche(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Unite Executante Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Executante Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Executante Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_APourUniteExecutanteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUnite();

	/**
	 * Returns the value of the '<em><b>AComme Emplacement Observation Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Emplacement Observation Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Emplacement Observation Autre Element Controle</em>' containment reference.
	 * @see #setACommeEmplacementObservationAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignement_ACommeEmplacementObservationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeEmplacementObservation_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeEmplacementObservationAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignement#getACommeEmplacementObservationAutreElementControle <em>AComme Emplacement Observation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Emplacement Observation Autre Element Controle</em>' containment reference.
	 * @see #getACommeEmplacementObservationAutreElementControle()
	 * @generated
	 */
	void setACommeEmplacementObservationAutreElementControle(TypeAssociation value);

} // TypeMissionRenseignement
