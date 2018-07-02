/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Evenement NRBC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getNumeroSequence <em>Numero Sequence</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getNatureRejet <em>Nature Rejet</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getPuissanceDetonation <em>Puissance Detonation</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getDescriptionROTA <em>Description ROTA</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#isDetecte <em>Detecte</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#isConfirme <em>Confirme</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getDateDetection <em>Date Detection</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getTypeRejet <em>Type Rejet</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getTypeConteneur <em>Type Conteneur</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getNombreConteneur <em>Nombre Conteneur</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#isResultatDommagePotentiel <em>Resultat Dommage Potentiel</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getCodeAutoriteOrigine <em>Code Autorite Origine</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getCodeValidation <em>Code Validation</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getCodeCentreControleSecteur <em>Code Centre Controle Secteur</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getProfondeurZoneDanger <em>Profondeur Zone Danger</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getDureeDangerEnZoneDanger <em>Duree Danger En Zone Danger</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getDureeDangerEnZoneAttaquee <em>Duree Danger En Zone Attaquee</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getReferencesGeographiques <em>References Geographiques</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getAPourEnvironnementEnvironnementTerrainEtVegetation <em>APour Environnement Environnement Terrain Et Vegetation</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getAPourMoyenDispersionMoyenDispersion <em>APour Moyen Dispersion Moyen Dispersion</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getAPourConditionsMeteoTrancheMeteo <em>APour Conditions Meteo Tranche Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getEstDetecteParTypeEquipementNRBC <em>Est Detecte Par Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getEstObjetAssociationSyntheseDetectionsEvenementNRBC <em>Est Objet Association Synthese Detections Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getAPourPrelevementsEffectuesPrelevement <em>APour Prelevements Effectues Prelevement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getAPourZonesContamineesPrevuesAutreElementControle <em>APour Zones Contaminees Prevues Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getAPourZDVparPeriodeZDVparPeriode <em>APour ZD Vpar Periode ZD Vpar Periode</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getEstSujetAssociationEvenementNRBCEvenementNRBC <em>Est Sujet Association Evenement NRBC Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getEstObjetAssociationEvenementNRBCEvenementNRBC <em>Est Objet Association Evenement NRBC Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getEstSujetAssociationEvenementNRBCAutreEvenement <em>Est Sujet Association Evenement NRBC Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getEstObjetAssociationAutreEvenementEvenementNRBC <em>Est Objet Association Autre Evenement Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getEstSujetAssociationEvenementNRBCAction <em>Est Sujet Association Evenement NRBC Action</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementNRBC#getEstObjetAssociationActionEvenementNRBC <em>Est Objet Association Action Evenement NRBC</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC()
 * @model abstract="true"
 *        extendedMetaData="name='type_EvenementNRBC' kind='elementOnly'"
 * @generated
 */
public interface TypeEvenementNRBC extends TypeEvenement {
	/**
	 * Returns the value of the '<em><b>Numero Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Sequence</em>' attribute.
	 * @see #setNumeroSequence(String)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_NumeroSequence()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroSequence'"
	 * @generated
	 */
	String getNumeroSequence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getNumeroSequence <em>Numero Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Sequence</em>' attribute.
	 * @see #getNumeroSequence()
	 * @generated
	 */
	void setNumeroSequence(String value);

	/**
	 * Returns the value of the '<em><b>Nature Rejet</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoNatureRejet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Rejet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Rejet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNatureRejet
	 * @see #isSetNatureRejet()
	 * @see #unsetNatureRejet()
	 * @see #setNatureRejet(TypeDictionaryDicoNatureRejet)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_NatureRejet()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NatureRejet'"
	 * @generated
	 */
	TypeDictionaryDicoNatureRejet getNatureRejet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getNatureRejet <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Rejet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNatureRejet
	 * @see #isSetNatureRejet()
	 * @see #unsetNatureRejet()
	 * @see #getNatureRejet()
	 * @generated
	 */
	void setNatureRejet(TypeDictionaryDicoNatureRejet value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#getNatureRejet <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureRejet()
	 * @see #getNatureRejet()
	 * @see #setNatureRejet(TypeDictionaryDicoNatureRejet)
	 * @generated
	 */
	void unsetNatureRejet();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#getNatureRejet <em>Nature Rejet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Rejet</em>' attribute is set.
	 * @see #unsetNatureRejet()
	 * @see #getNatureRejet()
	 * @see #setNatureRejet(TypeDictionaryDicoNatureRejet)
	 * @generated
	 */
	boolean isSetNatureRejet();

	/**
	 * Returns the value of the '<em><b>Puissance Detonation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPuissanceDetonation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puissance Detonation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puissance Detonation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPuissanceDetonation
	 * @see #isSetPuissanceDetonation()
	 * @see #unsetPuissanceDetonation()
	 * @see #setPuissanceDetonation(TypeDictionaryDicoPuissanceDetonation)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_PuissanceDetonation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PuissanceDetonation'"
	 * @generated
	 */
	TypeDictionaryDicoPuissanceDetonation getPuissanceDetonation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getPuissanceDetonation <em>Puissance Detonation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puissance Detonation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPuissanceDetonation
	 * @see #isSetPuissanceDetonation()
	 * @see #unsetPuissanceDetonation()
	 * @see #getPuissanceDetonation()
	 * @generated
	 */
	void setPuissanceDetonation(TypeDictionaryDicoPuissanceDetonation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#getPuissanceDetonation <em>Puissance Detonation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPuissanceDetonation()
	 * @see #getPuissanceDetonation()
	 * @see #setPuissanceDetonation(TypeDictionaryDicoPuissanceDetonation)
	 * @generated
	 */
	void unsetPuissanceDetonation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#getPuissanceDetonation <em>Puissance Detonation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Puissance Detonation</em>' attribute is set.
	 * @see #unsetPuissanceDetonation()
	 * @see #getPuissanceDetonation()
	 * @see #setPuissanceDetonation(TypeDictionaryDicoPuissanceDetonation)
	 * @generated
	 */
	boolean isSetPuissanceDetonation();

	/**
	 * Returns the value of the '<em><b>Description ROTA</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoNatureRejet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description ROTA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description ROTA</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNatureRejet
	 * @see #isSetDescriptionROTA()
	 * @see #unsetDescriptionROTA()
	 * @see #setDescriptionROTA(TypeDictionaryDicoNatureRejet)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_DescriptionROTA()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionROTA'"
	 * @generated
	 */
	TypeDictionaryDicoNatureRejet getDescriptionROTA();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getDescriptionROTA <em>Description ROTA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description ROTA</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNatureRejet
	 * @see #isSetDescriptionROTA()
	 * @see #unsetDescriptionROTA()
	 * @see #getDescriptionROTA()
	 * @generated
	 */
	void setDescriptionROTA(TypeDictionaryDicoNatureRejet value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#getDescriptionROTA <em>Description ROTA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionROTA()
	 * @see #getDescriptionROTA()
	 * @see #setDescriptionROTA(TypeDictionaryDicoNatureRejet)
	 * @generated
	 */
	void unsetDescriptionROTA();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#getDescriptionROTA <em>Description ROTA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description ROTA</em>' attribute is set.
	 * @see #unsetDescriptionROTA()
	 * @see #getDescriptionROTA()
	 * @see #setDescriptionROTA(TypeDictionaryDicoNatureRejet)
	 * @generated
	 */
	boolean isSetDescriptionROTA();

	/**
	 * Returns the value of the '<em><b>Detecte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detecte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detecte</em>' attribute.
	 * @see #isSetDetecte()
	 * @see #unsetDetecte()
	 * @see #setDetecte(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_Detecte()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Detecte'"
	 * @generated
	 */
	boolean isDetecte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#isDetecte <em>Detecte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detecte</em>' attribute.
	 * @see #isSetDetecte()
	 * @see #unsetDetecte()
	 * @see #isDetecte()
	 * @generated
	 */
	void setDetecte(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#isDetecte <em>Detecte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDetecte()
	 * @see #isDetecte()
	 * @see #setDetecte(boolean)
	 * @generated
	 */
	void unsetDetecte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#isDetecte <em>Detecte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Detecte</em>' attribute is set.
	 * @see #unsetDetecte()
	 * @see #isDetecte()
	 * @see #setDetecte(boolean)
	 * @generated
	 */
	boolean isSetDetecte();

	/**
	 * Returns the value of the '<em><b>Confirme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirme</em>' attribute.
	 * @see #isSetConfirme()
	 * @see #unsetConfirme()
	 * @see #setConfirme(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_Confirme()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Confirme'"
	 * @generated
	 */
	boolean isConfirme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#isConfirme <em>Confirme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirme</em>' attribute.
	 * @see #isSetConfirme()
	 * @see #unsetConfirme()
	 * @see #isConfirme()
	 * @generated
	 */
	void setConfirme(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#isConfirme <em>Confirme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfirme()
	 * @see #isConfirme()
	 * @see #setConfirme(boolean)
	 * @generated
	 */
	void unsetConfirme();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#isConfirme <em>Confirme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confirme</em>' attribute is set.
	 * @see #unsetConfirme()
	 * @see #isConfirme()
	 * @see #setConfirme(boolean)
	 * @generated
	 */
	boolean isSetConfirme();

	/**
	 * Returns the value of the '<em><b>Date Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Detection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Detection</em>' attribute.
	 * @see #setDateDetection(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_DateDetection()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDetection'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDetection();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getDateDetection <em>Date Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Detection</em>' attribute.
	 * @see #getDateDetection()
	 * @generated
	 */
	void setDateDetection(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Type Rejet</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEvenementNRBCtypeRejet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Rejet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Rejet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvenementNRBCtypeRejet
	 * @see #isSetTypeRejet()
	 * @see #unsetTypeRejet()
	 * @see #setTypeRejet(TypeDictionaryDicoEvenementNRBCtypeRejet)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_TypeRejet()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeRejet'"
	 * @generated
	 */
	TypeDictionaryDicoEvenementNRBCtypeRejet getTypeRejet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getTypeRejet <em>Type Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Rejet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvenementNRBCtypeRejet
	 * @see #isSetTypeRejet()
	 * @see #unsetTypeRejet()
	 * @see #getTypeRejet()
	 * @generated
	 */
	void setTypeRejet(TypeDictionaryDicoEvenementNRBCtypeRejet value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#getTypeRejet <em>Type Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeRejet()
	 * @see #getTypeRejet()
	 * @see #setTypeRejet(TypeDictionaryDicoEvenementNRBCtypeRejet)
	 * @generated
	 */
	void unsetTypeRejet();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#getTypeRejet <em>Type Rejet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Rejet</em>' attribute is set.
	 * @see #unsetTypeRejet()
	 * @see #getTypeRejet()
	 * @see #setTypeRejet(TypeDictionaryDicoEvenementNRBCtypeRejet)
	 * @generated
	 */
	boolean isSetTypeRejet();

	/**
	 * Returns the value of the '<em><b>Type Conteneur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEvenementNRBCTypeConteneur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Conteneur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Conteneur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvenementNRBCTypeConteneur
	 * @see #isSetTypeConteneur()
	 * @see #unsetTypeConteneur()
	 * @see #setTypeConteneur(TypeDictionaryDicoEvenementNRBCTypeConteneur)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_TypeConteneur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeConteneur'"
	 * @generated
	 */
	TypeDictionaryDicoEvenementNRBCTypeConteneur getTypeConteneur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getTypeConteneur <em>Type Conteneur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Conteneur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvenementNRBCTypeConteneur
	 * @see #isSetTypeConteneur()
	 * @see #unsetTypeConteneur()
	 * @see #getTypeConteneur()
	 * @generated
	 */
	void setTypeConteneur(TypeDictionaryDicoEvenementNRBCTypeConteneur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#getTypeConteneur <em>Type Conteneur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeConteneur()
	 * @see #getTypeConteneur()
	 * @see #setTypeConteneur(TypeDictionaryDicoEvenementNRBCTypeConteneur)
	 * @generated
	 */
	void unsetTypeConteneur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#getTypeConteneur <em>Type Conteneur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Conteneur</em>' attribute is set.
	 * @see #unsetTypeConteneur()
	 * @see #getTypeConteneur()
	 * @see #setTypeConteneur(TypeDictionaryDicoEvenementNRBCTypeConteneur)
	 * @generated
	 */
	boolean isSetTypeConteneur();

	/**
	 * Returns the value of the '<em><b>Nombre Conteneur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Conteneur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Conteneur</em>' attribute.
	 * @see #isSetNombreConteneur()
	 * @see #unsetNombreConteneur()
	 * @see #setNombreConteneur(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_NombreConteneur()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreConteneur'"
	 * @generated
	 */
	long getNombreConteneur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getNombreConteneur <em>Nombre Conteneur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Conteneur</em>' attribute.
	 * @see #isSetNombreConteneur()
	 * @see #unsetNombreConteneur()
	 * @see #getNombreConteneur()
	 * @generated
	 */
	void setNombreConteneur(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#getNombreConteneur <em>Nombre Conteneur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreConteneur()
	 * @see #getNombreConteneur()
	 * @see #setNombreConteneur(long)
	 * @generated
	 */
	void unsetNombreConteneur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#getNombreConteneur <em>Nombre Conteneur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Conteneur</em>' attribute is set.
	 * @see #unsetNombreConteneur()
	 * @see #getNombreConteneur()
	 * @see #setNombreConteneur(long)
	 * @generated
	 */
	boolean isSetNombreConteneur();

	/**
	 * Returns the value of the '<em><b>Nationalite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationalite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_Nationalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nationalite'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @generated
	 */
	void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#getNationalite <em>Nationalite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nationalite</em>' attribute is set.
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	boolean isSetNationalite();

	/**
	 * Returns the value of the '<em><b>Resultat Dommage Potentiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resultat Dommage Potentiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultat Dommage Potentiel</em>' attribute.
	 * @see #isSetResultatDommagePotentiel()
	 * @see #unsetResultatDommagePotentiel()
	 * @see #setResultatDommagePotentiel(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_ResultatDommagePotentiel()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ResultatDommagePotentiel'"
	 * @generated
	 */
	boolean isResultatDommagePotentiel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#isResultatDommagePotentiel <em>Resultat Dommage Potentiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultat Dommage Potentiel</em>' attribute.
	 * @see #isSetResultatDommagePotentiel()
	 * @see #unsetResultatDommagePotentiel()
	 * @see #isResultatDommagePotentiel()
	 * @generated
	 */
	void setResultatDommagePotentiel(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementNRBC#isResultatDommagePotentiel <em>Resultat Dommage Potentiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResultatDommagePotentiel()
	 * @see #isResultatDommagePotentiel()
	 * @see #setResultatDommagePotentiel(boolean)
	 * @generated
	 */
	void unsetResultatDommagePotentiel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementNRBC#isResultatDommagePotentiel <em>Resultat Dommage Potentiel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resultat Dommage Potentiel</em>' attribute is set.
	 * @see #unsetResultatDommagePotentiel()
	 * @see #isResultatDommagePotentiel()
	 * @see #setResultatDommagePotentiel(boolean)
	 * @generated
	 */
	boolean isSetResultatDommagePotentiel();

	/**
	 * Returns the value of the '<em><b>Code Autorite Origine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Autorite Origine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Autorite Origine</em>' attribute.
	 * @see #setCodeAutoriteOrigine(String)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_CodeAutoriteOrigine()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='CodeAutoriteOrigine'"
	 * @generated
	 */
	String getCodeAutoriteOrigine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getCodeAutoriteOrigine <em>Code Autorite Origine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Autorite Origine</em>' attribute.
	 * @see #getCodeAutoriteOrigine()
	 * @generated
	 */
	void setCodeAutoriteOrigine(String value);

	/**
	 * Returns the value of the '<em><b>Code Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Validation</em>' attribute.
	 * @see #setCodeValidation(String)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_CodeValidation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='CodeValidation'"
	 * @generated
	 */
	String getCodeValidation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getCodeValidation <em>Code Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Validation</em>' attribute.
	 * @see #getCodeValidation()
	 * @generated
	 */
	void setCodeValidation(String value);

	/**
	 * Returns the value of the '<em><b>Code Centre Controle Secteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Centre Controle Secteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Centre Controle Secteur</em>' attribute.
	 * @see #setCodeCentreControleSecteur(String)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_CodeCentreControleSecteur()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='CodeCentreControleSecteur'"
	 * @generated
	 */
	String getCodeCentreControleSecteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getCodeCentreControleSecteur <em>Code Centre Controle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Centre Controle Secteur</em>' attribute.
	 * @see #getCodeCentreControleSecteur()
	 * @generated
	 */
	void setCodeCentreControleSecteur(String value);

	/**
	 * Returns the value of the '<em><b>Profondeur Zone Danger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profondeur Zone Danger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profondeur Zone Danger</em>' containment reference.
	 * @see #setProfondeurZoneDanger(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_ProfondeurZoneDanger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProfondeurZoneDanger'"
	 * @generated
	 */
	TypeDataTypeLongueur getProfondeurZoneDanger();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getProfondeurZoneDanger <em>Profondeur Zone Danger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profondeur Zone Danger</em>' containment reference.
	 * @see #getProfondeurZoneDanger()
	 * @generated
	 */
	void setProfondeurZoneDanger(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Duree Danger En Zone Danger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Danger En Zone Danger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Danger En Zone Danger</em>' containment reference.
	 * @see #setDureeDangerEnZoneDanger(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_DureeDangerEnZoneDanger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeDangerEnZoneDanger'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeDangerEnZoneDanger();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getDureeDangerEnZoneDanger <em>Duree Danger En Zone Danger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Danger En Zone Danger</em>' containment reference.
	 * @see #getDureeDangerEnZoneDanger()
	 * @generated
	 */
	void setDureeDangerEnZoneDanger(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Duree Danger En Zone Attaquee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Danger En Zone Attaquee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Danger En Zone Attaquee</em>' containment reference.
	 * @see #setDureeDangerEnZoneAttaquee(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_DureeDangerEnZoneAttaquee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeDangerEnZoneAttaquee'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeDangerEnZoneAttaquee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getDureeDangerEnZoneAttaquee <em>Duree Danger En Zone Attaquee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Danger En Zone Attaquee</em>' containment reference.
	 * @see #getDureeDangerEnZoneAttaquee()
	 * @generated
	 */
	void setDureeDangerEnZoneAttaquee(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>References Geographiques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References Geographiques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References Geographiques</em>' attribute.
	 * @see #setReferencesGeographiques(String)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_ReferencesGeographiques()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='ReferencesGeographiques'"
	 * @generated
	 */
	String getReferencesGeographiques();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getReferencesGeographiques <em>References Geographiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References Geographiques</em>' attribute.
	 * @see #getReferencesGeographiques()
	 * @generated
	 */
	void setReferencesGeographiques(String value);

	/**
	 * Returns the value of the '<em><b>APour Environnement Environnement Terrain Et Vegetation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEnvironnementTerrainEtVegetation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Environnement Environnement Terrain Et Vegetation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Environnement Environnement Terrain Et Vegetation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_APourEnvironnementEnvironnementTerrainEtVegetation()
	 * @model containment="true" upper="20"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EnvironnementTerrainEtVegetation'"
	 *        extendedMetaData="kind='element' name='APourEnvironnement_EnvironnementTerrainEtVegetation'"
	 * @generated
	 */
	EList<TypeEnvironnementTerrainEtVegetation> getAPourEnvironnementEnvironnementTerrainEtVegetation();

	/**
	 * Returns the value of the '<em><b>APour Moyen Dispersion Moyen Dispersion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyen Dispersion Moyen Dispersion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyen Dispersion Moyen Dispersion</em>' containment reference.
	 * @see #setAPourMoyenDispersionMoyenDispersion(TypeMoyenDispersion)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_APourMoyenDispersionMoyenDispersion()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyenDispersion'"
	 *        extendedMetaData="kind='element' name='APourMoyenDispersion_MoyenDispersion'"
	 * @generated
	 */
	TypeMoyenDispersion getAPourMoyenDispersionMoyenDispersion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementNRBC#getAPourMoyenDispersionMoyenDispersion <em>APour Moyen Dispersion Moyen Dispersion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Moyen Dispersion Moyen Dispersion</em>' containment reference.
	 * @see #getAPourMoyenDispersionMoyenDispersion()
	 * @generated
	 */
	void setAPourMoyenDispersionMoyenDispersion(TypeMoyenDispersion value);

	/**
	 * Returns the value of the '<em><b>APour Conditions Meteo Tranche Meteo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Conditions Meteo Tranche Meteo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Conditions Meteo Tranche Meteo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_APourConditionsMeteoTrancheMeteo()
	 * @model containment="true" upper="20"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_EvenementNRBC' target_entity='type_TrancheMeteo'"
	 *        extendedMetaData="kind='element' name='APourConditionsMeteo_TrancheMeteo'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourConditionsMeteoTrancheMeteo();

	/**
	 * Returns the value of the '<em><b>Est Detecte Par Type Equipement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Detecte Par Type Equipement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Detecte Par Type Equipement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_EstDetecteParTypeEquipementNRBC()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipementNRBC'"
	 *        extendedMetaData="kind='element' name='EstDetectePar_TypeEquipementNRBC'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstDetecteParTypeEquipementNRBC();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Synthese Detections Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Synthese Detections Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Synthese Detections Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_EstObjetAssociationSyntheseDetectionsEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_EvenementNRBC' target_entity='type_AssociationSyntheseDetectionsEvenementNRBC'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationSyntheseDetectionsEvenementNRBC'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationSyntheseDetectionsEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>APour Prelevements Effectues Prelevement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePrelevement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Prelevements Effectues Prelevement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Prelevements Effectues Prelevement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_APourPrelevementsEffectuesPrelevement()
	 * @model containment="true" upper="20"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Prelevement'"
	 *        extendedMetaData="kind='element' name='APourPrelevementsEffectues_Prelevement'"
	 * @generated
	 */
	EList<TypePrelevement> getAPourPrelevementsEffectuesPrelevement();

	/**
	 * Returns the value of the '<em><b>APour Zones Contaminees Prevues Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zones Contaminees Prevues Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zones Contaminees Prevues Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_APourZonesContamineesPrevuesAutreElementControle()
	 * @model containment="true" upper="50"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourEvenementNRBCAssociee_EvenementNRBC' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZonesContamineesPrevues_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZonesContamineesPrevuesAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour ZD Vpar Periode ZD Vpar Periode</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZDVparPeriode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour ZD Vpar Periode ZD Vpar Periode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour ZD Vpar Periode ZD Vpar Periode</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_APourZDVparPeriodeZDVparPeriode()
	 * @model containment="true" upper="3"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ZDVparPeriode'"
	 *        extendedMetaData="kind='element' name='APourZDVparPeriode_ZDVparPeriode'"
	 * @generated
	 */
	EList<TypeZDVparPeriode> getAPourZDVparPeriodeZDVparPeriode();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Evenement NRBC Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Evenement NRBC Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Evenement NRBC Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_EstSujetAssociationEvenementNRBCEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_EvenementNRBC' target_entity='type_AssociationEvenementNRBCEvenementNRBC'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEvenementNRBCEvenementNRBC'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEvenementNRBCEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Evenement NRBC Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Evenement NRBC Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Evenement NRBC Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_EstObjetAssociationEvenementNRBCEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_EvenementNRBC' target_entity='type_AssociationEvenementNRBCEvenementNRBC'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEvenementNRBCEvenementNRBC'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEvenementNRBCEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Evenement NRBC Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Evenement NRBC Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Evenement NRBC Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_EstSujetAssociationEvenementNRBCAutreEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_EvenementNRBC' target_entity='type_AssociationEvenementNRBCAutreEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEvenementNRBCAutreEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEvenementNRBCAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Autre Evenement Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Autre Evenement Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Autre Evenement Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_EstObjetAssociationAutreEvenementEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_EvenementNRBC' target_entity='type_AssociationAutreEvenementEvenementNRBC'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationAutreEvenementEvenementNRBC'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationAutreEvenementEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Evenement NRBC Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Evenement NRBC Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Evenement NRBC Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_EstSujetAssociationEvenementNRBCAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_EvenementNRBC' target_entity='type_AssociationEvenementNRBCAction'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEvenementNRBCAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEvenementNRBCAction();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Action Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Action Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Action Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementNRBC_EstObjetAssociationActionEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_EvenementNRBC' target_entity='type_AssociationActionEvenementNRBC'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationActionEvenementNRBC'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationActionEvenementNRBC();

} // TypeEvenementNRBC
