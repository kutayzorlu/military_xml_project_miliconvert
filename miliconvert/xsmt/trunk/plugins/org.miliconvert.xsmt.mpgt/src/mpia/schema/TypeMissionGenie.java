/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Genie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionGenie#getNumeroMission <em>Numero Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getPrioriteMission <em>Priorite Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#isDelegationPourApprobation <em>Delegation Pour Approbation</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAideAuDeploiement <em>Aide Au Deploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAppuiAContreMobilite <em>Appui AContre Mobilite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAppuiAMobilite <em>Appui AMobilite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getTypeMissionMajeure <em>Type Mission Majeure</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getVersionOrdre <em>Version Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getDateDerniereDescription <em>Date Derniere Description</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getRemiseCr <em>Remise Cr</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getRenforcementPourTravaux <em>Renforcement Pour Travaux</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getTypeMission <em>Type Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getEstSujetAssociationMissionGenieMissionGenie <em>Est Sujet Association Mission Genie Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getEstObjetAssociationMissionGenieMissionGenie <em>Est Objet Association Mission Genie Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAPourZoneMissionAutreElementControle <em>APour Zone Mission Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAPourInstructionCoordinationInstructionCoordination <em>APour Instruction Coordination Instruction Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAPourPlanMixtePlanMixte <em>APour Plan Mixte Plan Mixte</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAPourUniteResponsableSecuriteImmediateUnite <em>APour Unite Responsable Securite Immediate Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAPourCrReconnaissanceCrReconnaissance <em>APour Cr Reconnaissance Cr Reconnaissance</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAPourUniteExecutanteUniteUnite <em>APour Unite Executante Unite Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getAPourComplementMissionAppuiMobilite <em>APour Complement Mission Appui Mobilite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionGenie#getEstObjetAssociationUniteMissionGenie <em>Est Objet Association Unite Mission Genie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionGenie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionGenie' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionGenie extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Numero Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Mission</em>' attribute.
	 * @see #setNumeroMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_NumeroMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012" required="true"
	 *        extendedMetaData="kind='element' name='NumeroMission'"
	 * @generated
	 */
	String getNumeroMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getNumeroMission <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Mission</em>' attribute.
	 * @see #getNumeroMission()
	 * @generated
	 */
	void setNumeroMission(String value);

	/**
	 * Returns the value of the '<em><b>Priorite Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Mission</em>' attribute.
	 * @see #isSetPrioriteMission()
	 * @see #unsetPrioriteMission()
	 * @see #setPrioriteMission(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_PrioriteMission()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='PrioriteMission'"
	 * @generated
	 */
	long getPrioriteMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getPrioriteMission <em>Priorite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite Mission</em>' attribute.
	 * @see #isSetPrioriteMission()
	 * @see #unsetPrioriteMission()
	 * @see #getPrioriteMission()
	 * @generated
	 */
	void setPrioriteMission(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionGenie#getPrioriteMission <em>Priorite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrioriteMission()
	 * @see #getPrioriteMission()
	 * @see #setPrioriteMission(long)
	 * @generated
	 */
	void unsetPrioriteMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionGenie#getPrioriteMission <em>Priorite Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite Mission</em>' attribute is set.
	 * @see #unsetPrioriteMission()
	 * @see #getPrioriteMission()
	 * @see #setPrioriteMission(long)
	 * @generated
	 */
	boolean isSetPrioriteMission();

	/**
	 * Returns the value of the '<em><b>Delegation Pour Approbation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Pour Approbation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Pour Approbation</em>' attribute.
	 * @see #isSetDelegationPourApprobation()
	 * @see #unsetDelegationPourApprobation()
	 * @see #setDelegationPourApprobation(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_DelegationPourApprobation()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DelegationPourApprobation'"
	 * @generated
	 */
	boolean isDelegationPourApprobation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#isDelegationPourApprobation <em>Delegation Pour Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegation Pour Approbation</em>' attribute.
	 * @see #isSetDelegationPourApprobation()
	 * @see #unsetDelegationPourApprobation()
	 * @see #isDelegationPourApprobation()
	 * @generated
	 */
	void setDelegationPourApprobation(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionGenie#isDelegationPourApprobation <em>Delegation Pour Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelegationPourApprobation()
	 * @see #isDelegationPourApprobation()
	 * @see #setDelegationPourApprobation(boolean)
	 * @generated
	 */
	void unsetDelegationPourApprobation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionGenie#isDelegationPourApprobation <em>Delegation Pour Approbation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delegation Pour Approbation</em>' attribute is set.
	 * @see #unsetDelegationPourApprobation()
	 * @see #isDelegationPourApprobation()
	 * @see #setDelegationPourApprobation(boolean)
	 * @generated
	 */
	boolean isSetDelegationPourApprobation();

	/**
	 * Returns the value of the '<em><b>Aide Au Deploiement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionGenieAideAuDeploiement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aide Au Deploiement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aide Au Deploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieAideAuDeploiement
	 * @see #isSetAideAuDeploiement()
	 * @see #unsetAideAuDeploiement()
	 * @see #setAideAuDeploiement(TypeDictionaryDicoMissionGenieAideAuDeploiement)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_AideAuDeploiement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AideAuDeploiement'"
	 * @generated
	 */
	TypeDictionaryDicoMissionGenieAideAuDeploiement getAideAuDeploiement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getAideAuDeploiement <em>Aide Au Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aide Au Deploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieAideAuDeploiement
	 * @see #isSetAideAuDeploiement()
	 * @see #unsetAideAuDeploiement()
	 * @see #getAideAuDeploiement()
	 * @generated
	 */
	void setAideAuDeploiement(TypeDictionaryDicoMissionGenieAideAuDeploiement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionGenie#getAideAuDeploiement <em>Aide Au Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAideAuDeploiement()
	 * @see #getAideAuDeploiement()
	 * @see #setAideAuDeploiement(TypeDictionaryDicoMissionGenieAideAuDeploiement)
	 * @generated
	 */
	void unsetAideAuDeploiement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionGenie#getAideAuDeploiement <em>Aide Au Deploiement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aide Au Deploiement</em>' attribute is set.
	 * @see #unsetAideAuDeploiement()
	 * @see #getAideAuDeploiement()
	 * @see #setAideAuDeploiement(TypeDictionaryDicoMissionGenieAideAuDeploiement)
	 * @generated
	 */
	boolean isSetAideAuDeploiement();

	/**
	 * Returns the value of the '<em><b>Appui AContre Mobilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionGenieAppuiAContreMobilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appui AContre Mobilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appui AContre Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieAppuiAContreMobilite
	 * @see #isSetAppuiAContreMobilite()
	 * @see #unsetAppuiAContreMobilite()
	 * @see #setAppuiAContreMobilite(TypeDictionaryDicoMissionGenieAppuiAContreMobilite)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_AppuiAContreMobilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AppuiAContreMobilite'"
	 * @generated
	 */
	TypeDictionaryDicoMissionGenieAppuiAContreMobilite getAppuiAContreMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getAppuiAContreMobilite <em>Appui AContre Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appui AContre Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieAppuiAContreMobilite
	 * @see #isSetAppuiAContreMobilite()
	 * @see #unsetAppuiAContreMobilite()
	 * @see #getAppuiAContreMobilite()
	 * @generated
	 */
	void setAppuiAContreMobilite(TypeDictionaryDicoMissionGenieAppuiAContreMobilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionGenie#getAppuiAContreMobilite <em>Appui AContre Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppuiAContreMobilite()
	 * @see #getAppuiAContreMobilite()
	 * @see #setAppuiAContreMobilite(TypeDictionaryDicoMissionGenieAppuiAContreMobilite)
	 * @generated
	 */
	void unsetAppuiAContreMobilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionGenie#getAppuiAContreMobilite <em>Appui AContre Mobilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Appui AContre Mobilite</em>' attribute is set.
	 * @see #unsetAppuiAContreMobilite()
	 * @see #getAppuiAContreMobilite()
	 * @see #setAppuiAContreMobilite(TypeDictionaryDicoMissionGenieAppuiAContreMobilite)
	 * @generated
	 */
	boolean isSetAppuiAContreMobilite();

	/**
	 * Returns the value of the '<em><b>Appui AMobilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionGenieAppuiAMobilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appui AMobilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appui AMobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieAppuiAMobilite
	 * @see #isSetAppuiAMobilite()
	 * @see #unsetAppuiAMobilite()
	 * @see #setAppuiAMobilite(TypeDictionaryDicoMissionGenieAppuiAMobilite)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_AppuiAMobilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AppuiAMobilite'"
	 * @generated
	 */
	TypeDictionaryDicoMissionGenieAppuiAMobilite getAppuiAMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getAppuiAMobilite <em>Appui AMobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appui AMobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieAppuiAMobilite
	 * @see #isSetAppuiAMobilite()
	 * @see #unsetAppuiAMobilite()
	 * @see #getAppuiAMobilite()
	 * @generated
	 */
	void setAppuiAMobilite(TypeDictionaryDicoMissionGenieAppuiAMobilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionGenie#getAppuiAMobilite <em>Appui AMobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppuiAMobilite()
	 * @see #getAppuiAMobilite()
	 * @see #setAppuiAMobilite(TypeDictionaryDicoMissionGenieAppuiAMobilite)
	 * @generated
	 */
	void unsetAppuiAMobilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionGenie#getAppuiAMobilite <em>Appui AMobilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Appui AMobilite</em>' attribute is set.
	 * @see #unsetAppuiAMobilite()
	 * @see #getAppuiAMobilite()
	 * @see #setAppuiAMobilite(TypeDictionaryDicoMissionGenieAppuiAMobilite)
	 * @generated
	 */
	boolean isSetAppuiAMobilite();

	/**
	 * Returns the value of the '<em><b>Type Mission Majeure</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionGenieTypeMissionMajeure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission Majeure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission Majeure</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieTypeMissionMajeure
	 * @see #isSetTypeMissionMajeure()
	 * @see #unsetTypeMissionMajeure()
	 * @see #setTypeMissionMajeure(TypeDictionaryDicoMissionGenieTypeMissionMajeure)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_TypeMissionMajeure()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMissionMajeure'"
	 * @generated
	 */
	TypeDictionaryDicoMissionGenieTypeMissionMajeure getTypeMissionMajeure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getTypeMissionMajeure <em>Type Mission Majeure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission Majeure</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieTypeMissionMajeure
	 * @see #isSetTypeMissionMajeure()
	 * @see #unsetTypeMissionMajeure()
	 * @see #getTypeMissionMajeure()
	 * @generated
	 */
	void setTypeMissionMajeure(TypeDictionaryDicoMissionGenieTypeMissionMajeure value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionGenie#getTypeMissionMajeure <em>Type Mission Majeure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMissionMajeure()
	 * @see #getTypeMissionMajeure()
	 * @see #setTypeMissionMajeure(TypeDictionaryDicoMissionGenieTypeMissionMajeure)
	 * @generated
	 */
	void unsetTypeMissionMajeure();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionGenie#getTypeMissionMajeure <em>Type Mission Majeure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission Majeure</em>' attribute is set.
	 * @see #unsetTypeMissionMajeure()
	 * @see #getTypeMissionMajeure()
	 * @see #setTypeMissionMajeure(TypeDictionaryDicoMissionGenieTypeMissionMajeure)
	 * @generated
	 */
	boolean isSetTypeMissionMajeure();

	/**
	 * Returns the value of the '<em><b>Version Ordre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Ordre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Ordre</em>' attribute.
	 * @see #isSetVersionOrdre()
	 * @see #unsetVersionOrdre()
	 * @see #setVersionOrdre(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_VersionOrdre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='VersionOrdre'"
	 * @generated
	 */
	long getVersionOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getVersionOrdre <em>Version Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Ordre</em>' attribute.
	 * @see #isSetVersionOrdre()
	 * @see #unsetVersionOrdre()
	 * @see #getVersionOrdre()
	 * @generated
	 */
	void setVersionOrdre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionGenie#getVersionOrdre <em>Version Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersionOrdre()
	 * @see #getVersionOrdre()
	 * @see #setVersionOrdre(long)
	 * @generated
	 */
	void unsetVersionOrdre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionGenie#getVersionOrdre <em>Version Ordre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version Ordre</em>' attribute is set.
	 * @see #unsetVersionOrdre()
	 * @see #getVersionOrdre()
	 * @see #setVersionOrdre(long)
	 * @generated
	 */
	boolean isSetVersionOrdre();

	/**
	 * Returns the value of the '<em><b>Date Derniere Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Derniere Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Derniere Description</em>' attribute.
	 * @see #setDateDerniereDescription(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_DateDerniereDescription()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDerniereDescription'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDerniereDescription();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getDateDerniereDescription <em>Date Derniere Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Derniere Description</em>' attribute.
	 * @see #getDateDerniereDescription()
	 * @generated
	 */
	void setDateDerniereDescription(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Remise Cr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remise Cr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remise Cr</em>' attribute.
	 * @see #setRemiseCr(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_RemiseCr()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='RemiseCr'"
	 * @generated
	 */
	XMLGregorianCalendar getRemiseCr();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getRemiseCr <em>Remise Cr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remise Cr</em>' attribute.
	 * @see #getRemiseCr()
	 * @generated
	 */
	void setRemiseCr(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Complement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' attribute.
	 * @see #setComplement(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_Complement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Complement'"
	 * @generated
	 */
	String getComplement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getComplement <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' attribute.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(String value);

	/**
	 * Returns the value of the '<em><b>Renforcement Pour Travaux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renforcement Pour Travaux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renforcement Pour Travaux</em>' attribute.
	 * @see #setRenforcementPourTravaux(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_RenforcementPourTravaux()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='RenforcementPourTravaux'"
	 * @generated
	 */
	String getRenforcementPourTravaux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getRenforcementPourTravaux <em>Renforcement Pour Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renforcement Pour Travaux</em>' attribute.
	 * @see #getRenforcementPourTravaux()
	 * @generated
	 */
	void setRenforcementPourTravaux(String value);

	/**
	 * Returns the value of the '<em><b>Type Mission</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionGenieTypeMission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieTypeMission
	 * @see #isSetTypeMission()
	 * @see #unsetTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoMissionGenieTypeMission)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_TypeMission()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMission'"
	 * @generated
	 */
	TypeDictionaryDicoMissionGenieTypeMission getTypeMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getTypeMission <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionGenieTypeMission
	 * @see #isSetTypeMission()
	 * @see #unsetTypeMission()
	 * @see #getTypeMission()
	 * @generated
	 */
	void setTypeMission(TypeDictionaryDicoMissionGenieTypeMission value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionGenie#getTypeMission <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMission()
	 * @see #getTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoMissionGenieTypeMission)
	 * @generated
	 */
	void unsetTypeMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionGenie#getTypeMission <em>Type Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission</em>' attribute is set.
	 * @see #unsetTypeMission()
	 * @see #getTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoMissionGenieTypeMission)
	 * @generated
	 */
	boolean isSetTypeMission();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mission Genie Mission Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mission Genie Mission Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mission Genie Mission Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_EstSujetAssociationMissionGenieMissionGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_MissionGenie' target_entity='type_AssociationMissionGenieMissionGenie'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMissionGenieMissionGenie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMissionGenieMissionGenie();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mission Genie Mission Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mission Genie Mission Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mission Genie Mission Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_EstObjetAssociationMissionGenieMissionGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_MissionGenie' target_entity='type_AssociationMissionGenieMissionGenie'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMissionGenieMissionGenie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMissionGenieMissionGenie();

	/**
	 * Returns the value of the '<em><b>APour Zone Mission Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Mission Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Mission Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneMissionAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_APourZoneMissionAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneMission_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneMissionAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getAPourZoneMissionAutreElementControle <em>APour Zone Mission Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Mission Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneMissionAutreElementControle()
	 * @generated
	 */
	void setAPourZoneMissionAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Instruction Coordination Instruction Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeInstructionCoordination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Instruction Coordination Instruction Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Instruction Coordination Instruction Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_APourInstructionCoordinationInstructionCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_InstructionCoordination'"
	 *        extendedMetaData="kind='element' name='APourInstructionCoordination_InstructionCoordination'"
	 * @generated
	 */
	EList<TypeInstructionCoordination> getAPourInstructionCoordinationInstructionCoordination();

	/**
	 * Returns the value of the '<em><b>APour Plan Mixte Plan Mixte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlanMixte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Plan Mixte Plan Mixte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Plan Mixte Plan Mixte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_APourPlanMixtePlanMixte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PlanMixte'"
	 *        extendedMetaData="kind='element' name='APourPlanMixte_PlanMixte'"
	 * @generated
	 */
	EList<TypePlanMixte> getAPourPlanMixtePlanMixte();

	/**
	 * Returns the value of the '<em><b>APour Unite Responsable Securite Immediate Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Responsable Securite Immediate Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Responsable Securite Immediate Unite</em>' containment reference.
	 * @see #setAPourUniteResponsableSecuriteImmediateUnite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_APourUniteResponsableSecuriteImmediateUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteResponsableSecuriteImmediate_Unite'"
	 * @generated
	 */
	TypeAssociation getAPourUniteResponsableSecuriteImmediateUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getAPourUniteResponsableSecuriteImmediateUnite <em>APour Unite Responsable Securite Immediate Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Responsable Securite Immediate Unite</em>' containment reference.
	 * @see #getAPourUniteResponsableSecuriteImmediateUnite()
	 * @generated
	 */
	void setAPourUniteResponsableSecuriteImmediateUnite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Cr Reconnaissance Cr Reconnaissance</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCrReconnaissance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Cr Reconnaissance Cr Reconnaissance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Cr Reconnaissance Cr Reconnaissance</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_APourCrReconnaissanceCrReconnaissance()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CrReconnaissance'"
	 *        extendedMetaData="kind='element' name='APourCrReconnaissance_CrReconnaissance'"
	 * @generated
	 */
	EList<TypeCrReconnaissance> getAPourCrReconnaissanceCrReconnaissance();

	/**
	 * Returns the value of the '<em><b>APour Unite Executante Unite Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Executante Unite Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Executante Unite Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_APourUniteExecutanteUniteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUniteUnite();

	/**
	 * Returns the value of the '<em><b>APour Complement Mission Appui Mobilite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Complement Mission Appui Mobilite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Complement Mission Appui Mobilite</em>' containment reference.
	 * @see #setAPourComplementMissionAppuiMobilite(TypeMissionAppuiMobilite)
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_APourComplementMissionAppuiMobilite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MissionAppuiMobilite'"
	 *        extendedMetaData="kind='element' name='APourComplement_MissionAppuiMobilite'"
	 * @generated
	 */
	TypeMissionAppuiMobilite getAPourComplementMissionAppuiMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionGenie#getAPourComplementMissionAppuiMobilite <em>APour Complement Mission Appui Mobilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Complement Mission Appui Mobilite</em>' containment reference.
	 * @see #getAPourComplementMissionAppuiMobilite()
	 * @generated
	 */
	void setAPourComplementMissionAppuiMobilite(TypeMissionAppuiMobilite value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionGenie_EstObjetAssociationUniteMissionGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionGenie' target_entity='type_AssociationUniteMissionGenie'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionGenie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionGenie();

} // TypeMissionGenie
