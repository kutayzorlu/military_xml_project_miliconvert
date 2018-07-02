/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Acquisition ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getTypeMissionAcquisition <em>Type Mission Acquisition</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getNomResponsableCoordination <em>Nom Responsable Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getFonctionResponsableCoordination <em>Fonction Responsable Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getNomResponsableRattachement <em>Nom Responsable Rattachement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getModaliteMiseEnPlace <em>Modalite Mise En Place</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getModalitesParticulieresTirs <em>Modalites Particulieres Tirs</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getFonctionResponsableRattachement <em>Fonction Responsable Rattachement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getAPourZoneObservationAutreElementControle <em>APour Zone Observation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getAPourCaracteristiquesMissionCOBRAMissionCOBRA <em>APour Caracteristiques Mission COBRA Mission COBRA</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getSInteresseATypeObjectifASS <em>SInteresse AType Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getAPourFonctionResponsableCoordinationTypePosteMilitaire <em>APour Fonction Responsable Coordination Type Poste Militaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getAPourFonctionResponsableRattachementTypePosteMilitaire <em>APour Fonction Responsable Rattachement Type Poste Militaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getAPourUniteExecutanteTirUnite <em>APour Unite Executante Tir Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getEstObjetAssociationUniteMissionAcqASS <em>Est Objet Association Unite Mission Acq ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAcquisitionASS#getAPourTypesObjectifsType <em>APour Types Objectifs Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionAcquisitionASS' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionAcquisitionASS extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Type Mission Acquisition</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission Acquisition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition
	 * @see #isSetTypeMissionAcquisition()
	 * @see #unsetTypeMissionAcquisition()
	 * @see #setTypeMissionAcquisition(TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_TypeMissionAcquisition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMissionAcquisition'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition getTypeMissionAcquisition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getTypeMissionAcquisition <em>Type Mission Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition
	 * @see #isSetTypeMissionAcquisition()
	 * @see #unsetTypeMissionAcquisition()
	 * @see #getTypeMissionAcquisition()
	 * @generated
	 */
	void setTypeMissionAcquisition(TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getTypeMissionAcquisition <em>Type Mission Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMissionAcquisition()
	 * @see #getTypeMissionAcquisition()
	 * @see #setTypeMissionAcquisition(TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition)
	 * @generated
	 */
	void unsetTypeMissionAcquisition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getTypeMissionAcquisition <em>Type Mission Acquisition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission Acquisition</em>' attribute is set.
	 * @see #unsetTypeMissionAcquisition()
	 * @see #getTypeMissionAcquisition()
	 * @see #setTypeMissionAcquisition(TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition)
	 * @generated
	 */
	boolean isSetTypeMissionAcquisition();

	/**
	 * Returns the value of the '<em><b>Type Moyen Acquisition</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Moyen Acquisition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Moyen Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS
	 * @see #isSetTypeMoyenAcquisition()
	 * @see #unsetTypeMoyenAcquisition()
	 * @see #setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_TypeMoyenAcquisition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMoyenAcquisition'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMoyenAcquisitionASS getTypeMoyenAcquisition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Moyen Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS
	 * @see #isSetTypeMoyenAcquisition()
	 * @see #unsetTypeMoyenAcquisition()
	 * @see #getTypeMoyenAcquisition()
	 * @generated
	 */
	void setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMoyenAcquisition()
	 * @see #getTypeMoyenAcquisition()
	 * @see #setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS)
	 * @generated
	 */
	void unsetTypeMoyenAcquisition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Moyen Acquisition</em>' attribute is set.
	 * @see #unsetTypeMoyenAcquisition()
	 * @see #getTypeMoyenAcquisition()
	 * @see #setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS)
	 * @generated
	 */
	boolean isSetTypeMoyenAcquisition();

	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAcquisitionASSPriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAcquisitionASSPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoMissionAcquisitionASSPriorite)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_Priorite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAcquisitionASSPriorite getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAcquisitionASSPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoMissionAcquisitionASSPriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoMissionAcquisitionASSPriorite)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoMissionAcquisitionASSPriorite)
	 * @generated
	 */
	boolean isSetPriorite();

	/**
	 * Returns the value of the '<em><b>Nom Responsable Coordination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Responsable Coordination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Responsable Coordination</em>' attribute.
	 * @see #setNomResponsableCoordination(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_NomResponsableCoordination()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='NomResponsableCoordination'"
	 * @generated
	 */
	String getNomResponsableCoordination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getNomResponsableCoordination <em>Nom Responsable Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Responsable Coordination</em>' attribute.
	 * @see #getNomResponsableCoordination()
	 * @generated
	 */
	void setNomResponsableCoordination(String value);

	/**
	 * Returns the value of the '<em><b>Fonction Responsable Coordination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction Responsable Coordination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction Responsable Coordination</em>' attribute.
	 * @see #setFonctionResponsableCoordination(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_FonctionResponsableCoordination()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='FonctionResponsableCoordination'"
	 * @generated
	 */
	String getFonctionResponsableCoordination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getFonctionResponsableCoordination <em>Fonction Responsable Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction Responsable Coordination</em>' attribute.
	 * @see #getFonctionResponsableCoordination()
	 * @generated
	 */
	void setFonctionResponsableCoordination(String value);

	/**
	 * Returns the value of the '<em><b>Nom Responsable Rattachement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Responsable Rattachement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Responsable Rattachement</em>' attribute.
	 * @see #setNomResponsableRattachement(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_NomResponsableRattachement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='NomResponsableRattachement'"
	 * @generated
	 */
	String getNomResponsableRattachement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getNomResponsableRattachement <em>Nom Responsable Rattachement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Responsable Rattachement</em>' attribute.
	 * @see #getNomResponsableRattachement()
	 * @generated
	 */
	void setNomResponsableRattachement(String value);

	/**
	 * Returns the value of the '<em><b>Modalite Mise En Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalite Mise En Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalite Mise En Place</em>' attribute.
	 * @see #setModaliteMiseEnPlace(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_ModaliteMiseEnPlace()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='ModaliteMiseEnPlace'"
	 * @generated
	 */
	String getModaliteMiseEnPlace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getModaliteMiseEnPlace <em>Modalite Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalite Mise En Place</em>' attribute.
	 * @see #getModaliteMiseEnPlace()
	 * @generated
	 */
	void setModaliteMiseEnPlace(String value);

	/**
	 * Returns the value of the '<em><b>Modalites Particulieres Tirs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalites Particulieres Tirs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalites Particulieres Tirs</em>' attribute.
	 * @see #setModalitesParticulieresTirs(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_ModalitesParticulieresTirs()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ModalitesParticulieresTirs'"
	 * @generated
	 */
	String getModalitesParticulieresTirs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getModalitesParticulieresTirs <em>Modalites Particulieres Tirs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalites Particulieres Tirs</em>' attribute.
	 * @see #getModalitesParticulieresTirs()
	 * @generated
	 */
	void setModalitesParticulieresTirs(String value);

	/**
	 * Returns the value of the '<em><b>Fonction Responsable Rattachement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction Responsable Rattachement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction Responsable Rattachement</em>' attribute.
	 * @see #setFonctionResponsableRattachement(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_FonctionResponsableRattachement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='FonctionResponsableRattachement'"
	 * @generated
	 */
	String getFonctionResponsableRattachement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getFonctionResponsableRattachement <em>Fonction Responsable Rattachement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction Responsable Rattachement</em>' attribute.
	 * @see #getFonctionResponsableRattachement()
	 * @generated
	 */
	void setFonctionResponsableRattachement(String value);

	/**
	 * Returns the value of the '<em><b>APour Zone Observation Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Observation Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Observation Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_APourZoneObservationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneObservation_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneObservationAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Mission COBRA Mission COBRA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Mission COBRA Mission COBRA</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Mission COBRA Mission COBRA</em>' containment reference.
	 * @see #setAPourCaracteristiquesMissionCOBRAMissionCOBRA(TypeMissionCOBRA)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_APourCaracteristiquesMissionCOBRAMissionCOBRA()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MissionCOBRA'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesMissionCOBRA_MissionCOBRA'"
	 * @generated
	 */
	TypeMissionCOBRA getAPourCaracteristiquesMissionCOBRAMissionCOBRA();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getAPourCaracteristiquesMissionCOBRAMissionCOBRA <em>APour Caracteristiques Mission COBRA Mission COBRA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Mission COBRA Mission COBRA</em>' containment reference.
	 * @see #getAPourCaracteristiquesMissionCOBRAMissionCOBRA()
	 * @generated
	 */
	void setAPourCaracteristiquesMissionCOBRAMissionCOBRA(TypeMissionCOBRA value);

	/**
	 * Returns the value of the '<em><b>SInteresse AType Objectif ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeObjectifASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SInteresse AType Objectif ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SInteresse AType Objectif ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_SInteresseATypeObjectifASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeObjectifASS'"
	 *        extendedMetaData="kind='element' name='SInteresseA_TypeObjectifASS'"
	 * @generated
	 */
	EList<TypeTypeObjectifASS> getSInteresseATypeObjectifASS();

	/**
	 * Returns the value of the '<em><b>APour Fonction Responsable Coordination Type Poste Militaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Fonction Responsable Coordination Type Poste Militaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Fonction Responsable Coordination Type Poste Militaire</em>' containment reference.
	 * @see #setAPourFonctionResponsableCoordinationTypePosteMilitaire(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_APourFonctionResponsableCoordinationTypePosteMilitaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypePosteMilitaire'"
	 *        extendedMetaData="kind='element' name='APourFonctionResponsableCoordination_TypePosteMilitaire'"
	 * @generated
	 */
	TypeAssociationEXT getAPourFonctionResponsableCoordinationTypePosteMilitaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getAPourFonctionResponsableCoordinationTypePosteMilitaire <em>APour Fonction Responsable Coordination Type Poste Militaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Fonction Responsable Coordination Type Poste Militaire</em>' containment reference.
	 * @see #getAPourFonctionResponsableCoordinationTypePosteMilitaire()
	 * @generated
	 */
	void setAPourFonctionResponsableCoordinationTypePosteMilitaire(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Fonction Responsable Rattachement Type Poste Militaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Fonction Responsable Rattachement Type Poste Militaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Fonction Responsable Rattachement Type Poste Militaire</em>' containment reference.
	 * @see #setAPourFonctionResponsableRattachementTypePosteMilitaire(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_APourFonctionResponsableRattachementTypePosteMilitaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypePosteMilitaire'"
	 *        extendedMetaData="kind='element' name='APourFonctionResponsableRattachement_TypePosteMilitaire'"
	 * @generated
	 */
	TypeAssociationEXT getAPourFonctionResponsableRattachementTypePosteMilitaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAcquisitionASS#getAPourFonctionResponsableRattachementTypePosteMilitaire <em>APour Fonction Responsable Rattachement Type Poste Militaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Fonction Responsable Rattachement Type Poste Militaire</em>' containment reference.
	 * @see #getAPourFonctionResponsableRattachementTypePosteMilitaire()
	 * @generated
	 */
	void setAPourFonctionResponsableRattachementTypePosteMilitaire(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite Executante Tir Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Executante Tir Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Executante Tir Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_APourUniteExecutanteTirUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutanteTir_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteTirUnite();

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
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_APourUniteExecutanteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUnite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Acq ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Acq ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Acq ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_EstObjetAssociationUniteMissionAcqASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionAcquisitionASS' target_entity='type_AssociationUniteMissionAcqASS'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionAcqASS'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionAcqASS();

	/**
	 * Returns the value of the '<em><b>APour Types Objectifs Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Types Objectifs Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Types Objectifs Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAcquisitionASS_APourTypesObjectifsType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='APourTypesObjectifs_Type'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourTypesObjectifsType();

} // TypeMissionAcquisitionASS
