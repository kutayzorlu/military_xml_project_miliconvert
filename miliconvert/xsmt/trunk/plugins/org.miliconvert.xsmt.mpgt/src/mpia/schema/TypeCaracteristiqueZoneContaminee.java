/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Caracteristique Zone Contaminee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getEffetsRecherches <em>Effets Recherches</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getDebutPersistance <em>Debut Persistance</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getFinPersistance <em>Fin Persistance</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauContamination <em>Niveau Contamination</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteNiveauContamination <em>Unite Niveau Contamination</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getFiabiliteContamination <em>Fiabilite Contamination</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDanger <em>Niveau Danger</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getPourcentageNiveauDanger <em>Pourcentage Niveau Danger</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDose <em>Niveau Dose</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteNiveauDose <em>Unite Niveau Dose</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDebitDoseDosage <em>Niveau Debit Dose Dosage</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteDebitDoseDosage <em>Unite Debit Dose Dosage</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getAgentsContaminantsTypeConsommable <em>Agents Contaminants Type Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CaracteristiqueZoneContaminee' kind='elementOnly'"
 * @generated
 */
public interface TypeCaracteristiqueZoneContaminee extends EObject {
	/**
	 * Returns the value of the '<em><b>Effets Recherches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effets Recherches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effets Recherches</em>' attribute.
	 * @see #setEffetsRecherches(String)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_EffetsRecherches()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='EffetsRecherches'"
	 * @generated
	 */
	String getEffetsRecherches();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getEffetsRecherches <em>Effets Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effets Recherches</em>' attribute.
	 * @see #getEffetsRecherches()
	 * @generated
	 */
	void setEffetsRecherches(String value);

	/**
	 * Returns the value of the '<em><b>Debut Persistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Persistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Persistance</em>' attribute.
	 * @see #setDebutPersistance(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_DebutPersistance()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutPersistance'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutPersistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getDebutPersistance <em>Debut Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Persistance</em>' attribute.
	 * @see #getDebutPersistance()
	 * @generated
	 */
	void setDebutPersistance(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Persistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Persistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Persistance</em>' attribute.
	 * @see #setFinPersistance(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_FinPersistance()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinPersistance'"
	 * @generated
	 */
	XMLGregorianCalendar getFinPersistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getFinPersistance <em>Fin Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Persistance</em>' attribute.
	 * @see #getFinPersistance()
	 * @generated
	 */
	void setFinPersistance(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Niveau Contamination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Contamination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Contamination</em>' attribute.
	 * @see #isSetNiveauContamination()
	 * @see #unsetNiveauContamination()
	 * @see #setNiveauContamination(double)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_NiveauContamination()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='NiveauContamination'"
	 * @generated
	 */
	double getNiveauContamination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauContamination <em>Niveau Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Contamination</em>' attribute.
	 * @see #isSetNiveauContamination()
	 * @see #unsetNiveauContamination()
	 * @see #getNiveauContamination()
	 * @generated
	 */
	void setNiveauContamination(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauContamination <em>Niveau Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauContamination()
	 * @see #getNiveauContamination()
	 * @see #setNiveauContamination(double)
	 * @generated
	 */
	void unsetNiveauContamination();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauContamination <em>Niveau Contamination</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Contamination</em>' attribute is set.
	 * @see #unsetNiveauContamination()
	 * @see #getNiveauContamination()
	 * @see #setNiveauContamination(double)
	 * @generated
	 */
	boolean isSetNiveauContamination();

	/**
	 * Returns the value of the '<em><b>Unite Niveau Contamination</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoUniteNiveauContamination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite Niveau Contamination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite Niveau Contamination</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteNiveauContamination
	 * @see #isSetUniteNiveauContamination()
	 * @see #unsetUniteNiveauContamination()
	 * @see #setUniteNiveauContamination(TypeDictionaryDicoUniteNiveauContamination)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_UniteNiveauContamination()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UniteNiveauContamination'"
	 * @generated
	 */
	TypeDictionaryDicoUniteNiveauContamination getUniteNiveauContamination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteNiveauContamination <em>Unite Niveau Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite Niveau Contamination</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteNiveauContamination
	 * @see #isSetUniteNiveauContamination()
	 * @see #unsetUniteNiveauContamination()
	 * @see #getUniteNiveauContamination()
	 * @generated
	 */
	void setUniteNiveauContamination(TypeDictionaryDicoUniteNiveauContamination value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteNiveauContamination <em>Unite Niveau Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniteNiveauContamination()
	 * @see #getUniteNiveauContamination()
	 * @see #setUniteNiveauContamination(TypeDictionaryDicoUniteNiveauContamination)
	 * @generated
	 */
	void unsetUniteNiveauContamination();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteNiveauContamination <em>Unite Niveau Contamination</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unite Niveau Contamination</em>' attribute is set.
	 * @see #unsetUniteNiveauContamination()
	 * @see #getUniteNiveauContamination()
	 * @see #setUniteNiveauContamination(TypeDictionaryDicoUniteNiveauContamination)
	 * @generated
	 */
	boolean isSetUniteNiveauContamination();

	/**
	 * Returns the value of the '<em><b>Fiabilite Contamination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiabilite Contamination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiabilite Contamination</em>' attribute.
	 * @see #isSetFiabiliteContamination()
	 * @see #unsetFiabiliteContamination()
	 * @see #setFiabiliteContamination(double)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_FiabiliteContamination()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='FiabiliteContamination'"
	 * @generated
	 */
	double getFiabiliteContamination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getFiabiliteContamination <em>Fiabilite Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiabilite Contamination</em>' attribute.
	 * @see #isSetFiabiliteContamination()
	 * @see #unsetFiabiliteContamination()
	 * @see #getFiabiliteContamination()
	 * @generated
	 */
	void setFiabiliteContamination(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getFiabiliteContamination <em>Fiabilite Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFiabiliteContamination()
	 * @see #getFiabiliteContamination()
	 * @see #setFiabiliteContamination(double)
	 * @generated
	 */
	void unsetFiabiliteContamination();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getFiabiliteContamination <em>Fiabilite Contamination</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fiabilite Contamination</em>' attribute is set.
	 * @see #unsetFiabiliteContamination()
	 * @see #getFiabiliteContamination()
	 * @see #setFiabiliteContamination(double)
	 * @generated
	 */
	boolean isSetFiabiliteContamination();

	/**
	 * Returns the value of the '<em><b>Niveau Danger</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneContamineeNiveauDanger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Danger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Danger</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneContamineeNiveauDanger
	 * @see #isSetNiveauDanger()
	 * @see #unsetNiveauDanger()
	 * @see #setNiveauDanger(TypeDictionaryDicoZoneContamineeNiveauDanger)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_NiveauDanger()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauDanger'"
	 * @generated
	 */
	TypeDictionaryDicoZoneContamineeNiveauDanger getNiveauDanger();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDanger <em>Niveau Danger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Danger</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneContamineeNiveauDanger
	 * @see #isSetNiveauDanger()
	 * @see #unsetNiveauDanger()
	 * @see #getNiveauDanger()
	 * @generated
	 */
	void setNiveauDanger(TypeDictionaryDicoZoneContamineeNiveauDanger value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDanger <em>Niveau Danger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauDanger()
	 * @see #getNiveauDanger()
	 * @see #setNiveauDanger(TypeDictionaryDicoZoneContamineeNiveauDanger)
	 * @generated
	 */
	void unsetNiveauDanger();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDanger <em>Niveau Danger</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Danger</em>' attribute is set.
	 * @see #unsetNiveauDanger()
	 * @see #getNiveauDanger()
	 * @see #setNiveauDanger(TypeDictionaryDicoZoneContamineeNiveauDanger)
	 * @generated
	 */
	boolean isSetNiveauDanger();

	/**
	 * Returns the value of the '<em><b>Pourcentage Niveau Danger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Niveau Danger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Niveau Danger</em>' attribute.
	 * @see #isSetPourcentageNiveauDanger()
	 * @see #unsetPourcentageNiveauDanger()
	 * @see #setPourcentageNiveauDanger(double)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_PourcentageNiveauDanger()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='PourcentageNiveauDanger'"
	 * @generated
	 */
	double getPourcentageNiveauDanger();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getPourcentageNiveauDanger <em>Pourcentage Niveau Danger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Niveau Danger</em>' attribute.
	 * @see #isSetPourcentageNiveauDanger()
	 * @see #unsetPourcentageNiveauDanger()
	 * @see #getPourcentageNiveauDanger()
	 * @generated
	 */
	void setPourcentageNiveauDanger(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getPourcentageNiveauDanger <em>Pourcentage Niveau Danger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageNiveauDanger()
	 * @see #getPourcentageNiveauDanger()
	 * @see #setPourcentageNiveauDanger(double)
	 * @generated
	 */
	void unsetPourcentageNiveauDanger();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getPourcentageNiveauDanger <em>Pourcentage Niveau Danger</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Niveau Danger</em>' attribute is set.
	 * @see #unsetPourcentageNiveauDanger()
	 * @see #getPourcentageNiveauDanger()
	 * @see #setPourcentageNiveauDanger(double)
	 * @generated
	 */
	boolean isSetPourcentageNiveauDanger();

	/**
	 * Returns the value of the '<em><b>Niveau Dose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Dose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Dose</em>' attribute.
	 * @see #isSetNiveauDose()
	 * @see #unsetNiveauDose()
	 * @see #setNiveauDose(double)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_NiveauDose()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='NiveauDose'"
	 * @generated
	 */
	double getNiveauDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDose <em>Niveau Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Dose</em>' attribute.
	 * @see #isSetNiveauDose()
	 * @see #unsetNiveauDose()
	 * @see #getNiveauDose()
	 * @generated
	 */
	void setNiveauDose(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDose <em>Niveau Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauDose()
	 * @see #getNiveauDose()
	 * @see #setNiveauDose(double)
	 * @generated
	 */
	void unsetNiveauDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDose <em>Niveau Dose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Dose</em>' attribute is set.
	 * @see #unsetNiveauDose()
	 * @see #getNiveauDose()
	 * @see #setNiveauDose(double)
	 * @generated
	 */
	boolean isSetNiveauDose();

	/**
	 * Returns the value of the '<em><b>Unite Niveau Dose</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoUniteNiveauDose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite Niveau Dose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite Niveau Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteNiveauDose
	 * @see #isSetUniteNiveauDose()
	 * @see #unsetUniteNiveauDose()
	 * @see #setUniteNiveauDose(TypeDictionaryDicoUniteNiveauDose)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_UniteNiveauDose()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UniteNiveauDose'"
	 * @generated
	 */
	TypeDictionaryDicoUniteNiveauDose getUniteNiveauDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteNiveauDose <em>Unite Niveau Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite Niveau Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteNiveauDose
	 * @see #isSetUniteNiveauDose()
	 * @see #unsetUniteNiveauDose()
	 * @see #getUniteNiveauDose()
	 * @generated
	 */
	void setUniteNiveauDose(TypeDictionaryDicoUniteNiveauDose value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteNiveauDose <em>Unite Niveau Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniteNiveauDose()
	 * @see #getUniteNiveauDose()
	 * @see #setUniteNiveauDose(TypeDictionaryDicoUniteNiveauDose)
	 * @generated
	 */
	void unsetUniteNiveauDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteNiveauDose <em>Unite Niveau Dose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unite Niveau Dose</em>' attribute is set.
	 * @see #unsetUniteNiveauDose()
	 * @see #getUniteNiveauDose()
	 * @see #setUniteNiveauDose(TypeDictionaryDicoUniteNiveauDose)
	 * @generated
	 */
	boolean isSetUniteNiveauDose();

	/**
	 * Returns the value of the '<em><b>Niveau Debit Dose Dosage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Debit Dose Dosage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Debit Dose Dosage</em>' attribute.
	 * @see #isSetNiveauDebitDoseDosage()
	 * @see #unsetNiveauDebitDoseDosage()
	 * @see #setNiveauDebitDoseDosage(double)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_NiveauDebitDoseDosage()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='NiveauDebitDoseDosage'"
	 * @generated
	 */
	double getNiveauDebitDoseDosage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDebitDoseDosage <em>Niveau Debit Dose Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Debit Dose Dosage</em>' attribute.
	 * @see #isSetNiveauDebitDoseDosage()
	 * @see #unsetNiveauDebitDoseDosage()
	 * @see #getNiveauDebitDoseDosage()
	 * @generated
	 */
	void setNiveauDebitDoseDosage(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDebitDoseDosage <em>Niveau Debit Dose Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauDebitDoseDosage()
	 * @see #getNiveauDebitDoseDosage()
	 * @see #setNiveauDebitDoseDosage(double)
	 * @generated
	 */
	void unsetNiveauDebitDoseDosage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getNiveauDebitDoseDosage <em>Niveau Debit Dose Dosage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Debit Dose Dosage</em>' attribute is set.
	 * @see #unsetNiveauDebitDoseDosage()
	 * @see #getNiveauDebitDoseDosage()
	 * @see #setNiveauDebitDoseDosage(double)
	 * @generated
	 */
	boolean isSetNiveauDebitDoseDosage();

	/**
	 * Returns the value of the '<em><b>Unite Debit Dose Dosage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoUniteDebitDoseDosage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite Debit Dose Dosage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite Debit Dose Dosage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteDebitDoseDosage
	 * @see #isSetUniteDebitDoseDosage()
	 * @see #unsetUniteDebitDoseDosage()
	 * @see #setUniteDebitDoseDosage(TypeDictionaryDicoUniteDebitDoseDosage)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_UniteDebitDoseDosage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UniteDebitDoseDosage'"
	 * @generated
	 */
	TypeDictionaryDicoUniteDebitDoseDosage getUniteDebitDoseDosage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteDebitDoseDosage <em>Unite Debit Dose Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite Debit Dose Dosage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteDebitDoseDosage
	 * @see #isSetUniteDebitDoseDosage()
	 * @see #unsetUniteDebitDoseDosage()
	 * @see #getUniteDebitDoseDosage()
	 * @generated
	 */
	void setUniteDebitDoseDosage(TypeDictionaryDicoUniteDebitDoseDosage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteDebitDoseDosage <em>Unite Debit Dose Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniteDebitDoseDosage()
	 * @see #getUniteDebitDoseDosage()
	 * @see #setUniteDebitDoseDosage(TypeDictionaryDicoUniteDebitDoseDosage)
	 * @generated
	 */
	void unsetUniteDebitDoseDosage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueZoneContaminee#getUniteDebitDoseDosage <em>Unite Debit Dose Dosage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unite Debit Dose Dosage</em>' attribute is set.
	 * @see #unsetUniteDebitDoseDosage()
	 * @see #getUniteDebitDoseDosage()
	 * @see #setUniteDebitDoseDosage(TypeDictionaryDicoUniteDebitDoseDosage)
	 * @generated
	 */
	boolean isSetUniteDebitDoseDosage();

	/**
	 * Returns the value of the '<em><b>Agents Contaminants Type Consommable</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents Contaminants Type Consommable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents Contaminants Type Consommable</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueZoneContaminee_AgentsContaminantsTypeConsommable()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeConsommable'"
	 *        extendedMetaData="kind='element' name='AgentsContaminants_TypeConsommable'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAgentsContaminantsTypeConsommable();

} // TypeCaracteristiqueZoneContaminee
