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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Prelevement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePrelevement#getTypePrelevement <em>Type Prelevement</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getDateReleve <em>Date Releve</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getNiveauDebitDose <em>Niveau Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getUniteMesureDebitDose <em>Unite Mesure Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getNiveauDose <em>Niveau Dose</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getUniteMesureDose <em>Unite Mesure Dose</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getNiveauContamination <em>Niveau Contamination</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getUniteMesureContamination <em>Unite Mesure Contamination</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getEvolutionDebitDose <em>Evolution Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getTauxReelDecroissance <em>Taux Reel Decroissance</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getDateDetection <em>Date Detection</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getUtiliseTypeEquipementNRBC <em>Utilise Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getEstLocaliseParLocalisationGeometrique2D <em>Est Localise Par Localisation Geometrique2 D</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getAPourEnvironnementEnvironnementTerrainEtVegetation <em>APour Environnement Environnement Terrain Et Vegetation</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevement#getAPourConditionsMeteoTrancheMeteo <em>APour Conditions Meteo Tranche Meteo</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePrelevement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Prelevement' kind='elementOnly'"
 * @generated
 */
public interface TypePrelevement extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Prelevement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrelevementTypePrelevement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Prelevement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Prelevement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrelevementTypePrelevement
	 * @see #isSetTypePrelevement()
	 * @see #unsetTypePrelevement()
	 * @see #setTypePrelevement(TypeDictionaryDicoPrelevementTypePrelevement)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_TypePrelevement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypePrelevement'"
	 * @generated
	 */
	TypeDictionaryDicoPrelevementTypePrelevement getTypePrelevement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getTypePrelevement <em>Type Prelevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Prelevement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrelevementTypePrelevement
	 * @see #isSetTypePrelevement()
	 * @see #unsetTypePrelevement()
	 * @see #getTypePrelevement()
	 * @generated
	 */
	void setTypePrelevement(TypeDictionaryDicoPrelevementTypePrelevement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getTypePrelevement <em>Type Prelevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePrelevement()
	 * @see #getTypePrelevement()
	 * @see #setTypePrelevement(TypeDictionaryDicoPrelevementTypePrelevement)
	 * @generated
	 */
	void unsetTypePrelevement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getTypePrelevement <em>Type Prelevement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Prelevement</em>' attribute is set.
	 * @see #unsetTypePrelevement()
	 * @see #getTypePrelevement()
	 * @see #setTypePrelevement(TypeDictionaryDicoPrelevementTypePrelevement)
	 * @generated
	 */
	boolean isSetTypePrelevement();

	/**
	 * Returns the value of the '<em><b>Date Releve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Releve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Releve</em>' attribute.
	 * @see #setDateReleve(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_DateReleve()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateReleve'"
	 * @generated
	 */
	XMLGregorianCalendar getDateReleve();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getDateReleve <em>Date Releve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Releve</em>' attribute.
	 * @see #getDateReleve()
	 * @generated
	 */
	void setDateReleve(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Niveau Debit Dose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Debit Dose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Debit Dose</em>' attribute.
	 * @see #isSetNiveauDebitDose()
	 * @see #unsetNiveauDebitDose()
	 * @see #setNiveauDebitDose(double)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_NiveauDebitDose()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='NiveauDebitDose'"
	 * @generated
	 */
	double getNiveauDebitDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getNiveauDebitDose <em>Niveau Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Debit Dose</em>' attribute.
	 * @see #isSetNiveauDebitDose()
	 * @see #unsetNiveauDebitDose()
	 * @see #getNiveauDebitDose()
	 * @generated
	 */
	void setNiveauDebitDose(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getNiveauDebitDose <em>Niveau Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauDebitDose()
	 * @see #getNiveauDebitDose()
	 * @see #setNiveauDebitDose(double)
	 * @generated
	 */
	void unsetNiveauDebitDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getNiveauDebitDose <em>Niveau Debit Dose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Debit Dose</em>' attribute is set.
	 * @see #unsetNiveauDebitDose()
	 * @see #getNiveauDebitDose()
	 * @see #setNiveauDebitDose(double)
	 * @generated
	 */
	boolean isSetNiveauDebitDose();

	/**
	 * Returns the value of the '<em><b>Unite Mesure Debit Dose</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoUniteDebitDoseDosage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite Mesure Debit Dose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite Mesure Debit Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteDebitDoseDosage
	 * @see #isSetUniteMesureDebitDose()
	 * @see #unsetUniteMesureDebitDose()
	 * @see #setUniteMesureDebitDose(TypeDictionaryDicoUniteDebitDoseDosage)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_UniteMesureDebitDose()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UniteMesureDebitDose'"
	 * @generated
	 */
	TypeDictionaryDicoUniteDebitDoseDosage getUniteMesureDebitDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getUniteMesureDebitDose <em>Unite Mesure Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite Mesure Debit Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteDebitDoseDosage
	 * @see #isSetUniteMesureDebitDose()
	 * @see #unsetUniteMesureDebitDose()
	 * @see #getUniteMesureDebitDose()
	 * @generated
	 */
	void setUniteMesureDebitDose(TypeDictionaryDicoUniteDebitDoseDosage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getUniteMesureDebitDose <em>Unite Mesure Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniteMesureDebitDose()
	 * @see #getUniteMesureDebitDose()
	 * @see #setUniteMesureDebitDose(TypeDictionaryDicoUniteDebitDoseDosage)
	 * @generated
	 */
	void unsetUniteMesureDebitDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getUniteMesureDebitDose <em>Unite Mesure Debit Dose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unite Mesure Debit Dose</em>' attribute is set.
	 * @see #unsetUniteMesureDebitDose()
	 * @see #getUniteMesureDebitDose()
	 * @see #setUniteMesureDebitDose(TypeDictionaryDicoUniteDebitDoseDosage)
	 * @generated
	 */
	boolean isSetUniteMesureDebitDose();

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
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_NiveauDose()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='NiveauDose'"
	 * @generated
	 */
	double getNiveauDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getNiveauDose <em>Niveau Dose</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getNiveauDose <em>Niveau Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauDose()
	 * @see #getNiveauDose()
	 * @see #setNiveauDose(double)
	 * @generated
	 */
	void unsetNiveauDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getNiveauDose <em>Niveau Dose</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Unite Mesure Dose</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoUniteNiveauDose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite Mesure Dose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite Mesure Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteNiveauDose
	 * @see #isSetUniteMesureDose()
	 * @see #unsetUniteMesureDose()
	 * @see #setUniteMesureDose(TypeDictionaryDicoUniteNiveauDose)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_UniteMesureDose()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UniteMesureDose'"
	 * @generated
	 */
	TypeDictionaryDicoUniteNiveauDose getUniteMesureDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getUniteMesureDose <em>Unite Mesure Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite Mesure Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteNiveauDose
	 * @see #isSetUniteMesureDose()
	 * @see #unsetUniteMesureDose()
	 * @see #getUniteMesureDose()
	 * @generated
	 */
	void setUniteMesureDose(TypeDictionaryDicoUniteNiveauDose value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getUniteMesureDose <em>Unite Mesure Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniteMesureDose()
	 * @see #getUniteMesureDose()
	 * @see #setUniteMesureDose(TypeDictionaryDicoUniteNiveauDose)
	 * @generated
	 */
	void unsetUniteMesureDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getUniteMesureDose <em>Unite Mesure Dose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unite Mesure Dose</em>' attribute is set.
	 * @see #unsetUniteMesureDose()
	 * @see #getUniteMesureDose()
	 * @see #setUniteMesureDose(TypeDictionaryDicoUniteNiveauDose)
	 * @generated
	 */
	boolean isSetUniteMesureDose();

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
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_NiveauContamination()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='NiveauContamination'"
	 * @generated
	 */
	double getNiveauContamination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getNiveauContamination <em>Niveau Contamination</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getNiveauContamination <em>Niveau Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauContamination()
	 * @see #getNiveauContamination()
	 * @see #setNiveauContamination(double)
	 * @generated
	 */
	void unsetNiveauContamination();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getNiveauContamination <em>Niveau Contamination</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Unite Mesure Contamination</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoUniteNiveauContamination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite Mesure Contamination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite Mesure Contamination</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteNiveauContamination
	 * @see #isSetUniteMesureContamination()
	 * @see #unsetUniteMesureContamination()
	 * @see #setUniteMesureContamination(TypeDictionaryDicoUniteNiveauContamination)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_UniteMesureContamination()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UniteMesureContamination'"
	 * @generated
	 */
	TypeDictionaryDicoUniteNiveauContamination getUniteMesureContamination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getUniteMesureContamination <em>Unite Mesure Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite Mesure Contamination</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteNiveauContamination
	 * @see #isSetUniteMesureContamination()
	 * @see #unsetUniteMesureContamination()
	 * @see #getUniteMesureContamination()
	 * @generated
	 */
	void setUniteMesureContamination(TypeDictionaryDicoUniteNiveauContamination value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getUniteMesureContamination <em>Unite Mesure Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniteMesureContamination()
	 * @see #getUniteMesureContamination()
	 * @see #setUniteMesureContamination(TypeDictionaryDicoUniteNiveauContamination)
	 * @generated
	 */
	void unsetUniteMesureContamination();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getUniteMesureContamination <em>Unite Mesure Contamination</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unite Mesure Contamination</em>' attribute is set.
	 * @see #unsetUniteMesureContamination()
	 * @see #getUniteMesureContamination()
	 * @see #setUniteMesureContamination(TypeDictionaryDicoUniteNiveauContamination)
	 * @generated
	 */
	boolean isSetUniteMesureContamination();

	/**
	 * Returns the value of the '<em><b>Evolution Debit Dose</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrelevementEvolutionDebitDose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Debit Dose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Debit Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrelevementEvolutionDebitDose
	 * @see #isSetEvolutionDebitDose()
	 * @see #unsetEvolutionDebitDose()
	 * @see #setEvolutionDebitDose(TypeDictionaryDicoPrelevementEvolutionDebitDose)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_EvolutionDebitDose()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EvolutionDebitDose'"
	 * @generated
	 */
	TypeDictionaryDicoPrelevementEvolutionDebitDose getEvolutionDebitDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getEvolutionDebitDose <em>Evolution Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Debit Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrelevementEvolutionDebitDose
	 * @see #isSetEvolutionDebitDose()
	 * @see #unsetEvolutionDebitDose()
	 * @see #getEvolutionDebitDose()
	 * @generated
	 */
	void setEvolutionDebitDose(TypeDictionaryDicoPrelevementEvolutionDebitDose value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getEvolutionDebitDose <em>Evolution Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEvolutionDebitDose()
	 * @see #getEvolutionDebitDose()
	 * @see #setEvolutionDebitDose(TypeDictionaryDicoPrelevementEvolutionDebitDose)
	 * @generated
	 */
	void unsetEvolutionDebitDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getEvolutionDebitDose <em>Evolution Debit Dose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Evolution Debit Dose</em>' attribute is set.
	 * @see #unsetEvolutionDebitDose()
	 * @see #getEvolutionDebitDose()
	 * @see #setEvolutionDebitDose(TypeDictionaryDicoPrelevementEvolutionDebitDose)
	 * @generated
	 */
	boolean isSetEvolutionDebitDose();

	/**
	 * Returns the value of the '<em><b>Taux Reel Decroissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taux Reel Decroissance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taux Reel Decroissance</em>' attribute.
	 * @see #isSetTauxReelDecroissance()
	 * @see #unsetTauxReelDecroissance()
	 * @see #setTauxReelDecroissance(double)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_TauxReelDecroissance()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='TauxReelDecroissance'"
	 * @generated
	 */
	double getTauxReelDecroissance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getTauxReelDecroissance <em>Taux Reel Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taux Reel Decroissance</em>' attribute.
	 * @see #isSetTauxReelDecroissance()
	 * @see #unsetTauxReelDecroissance()
	 * @see #getTauxReelDecroissance()
	 * @generated
	 */
	void setTauxReelDecroissance(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getTauxReelDecroissance <em>Taux Reel Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTauxReelDecroissance()
	 * @see #getTauxReelDecroissance()
	 * @see #setTauxReelDecroissance(double)
	 * @generated
	 */
	void unsetTauxReelDecroissance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getTauxReelDecroissance <em>Taux Reel Decroissance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taux Reel Decroissance</em>' attribute is set.
	 * @see #unsetTauxReelDecroissance()
	 * @see #getTauxReelDecroissance()
	 * @see #setTauxReelDecroissance(double)
	 * @generated
	 */
	boolean isSetTauxReelDecroissance();

	/**
	 * Returns the value of the '<em><b>Taux Relatif Decroissance</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrelevementTauxRelatifDecroissance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taux Relatif Decroissance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taux Relatif Decroissance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrelevementTauxRelatifDecroissance
	 * @see #isSetTauxRelatifDecroissance()
	 * @see #unsetTauxRelatifDecroissance()
	 * @see #setTauxRelatifDecroissance(TypeDictionaryDicoPrelevementTauxRelatifDecroissance)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_TauxRelatifDecroissance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TauxRelatifDecroissance'"
	 * @generated
	 */
	TypeDictionaryDicoPrelevementTauxRelatifDecroissance getTauxRelatifDecroissance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taux Relatif Decroissance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrelevementTauxRelatifDecroissance
	 * @see #isSetTauxRelatifDecroissance()
	 * @see #unsetTauxRelatifDecroissance()
	 * @see #getTauxRelatifDecroissance()
	 * @generated
	 */
	void setTauxRelatifDecroissance(TypeDictionaryDicoPrelevementTauxRelatifDecroissance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevement#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTauxRelatifDecroissance()
	 * @see #getTauxRelatifDecroissance()
	 * @see #setTauxRelatifDecroissance(TypeDictionaryDicoPrelevementTauxRelatifDecroissance)
	 * @generated
	 */
	void unsetTauxRelatifDecroissance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevement#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taux Relatif Decroissance</em>' attribute is set.
	 * @see #unsetTauxRelatifDecroissance()
	 * @see #getTauxRelatifDecroissance()
	 * @see #setTauxRelatifDecroissance(TypeDictionaryDicoPrelevementTauxRelatifDecroissance)
	 * @generated
	 */
	boolean isSetTauxRelatifDecroissance();

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
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_DateDetection()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDetection'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDetection();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getDateDetection <em>Date Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Detection</em>' attribute.
	 * @see #getDateDetection()
	 * @generated
	 */
	void setDateDetection(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Utilise Type Equipement NRBC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilise Type Equipement NRBC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilise Type Equipement NRBC</em>' containment reference.
	 * @see #setUtiliseTypeEquipementNRBC(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_UtiliseTypeEquipementNRBC()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipementNRBC'"
	 *        extendedMetaData="kind='element' name='Utilise_TypeEquipementNRBC'"
	 * @generated
	 */
	TypeAssociationEXT getUtiliseTypeEquipementNRBC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getUtiliseTypeEquipementNRBC <em>Utilise Type Equipement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilise Type Equipement NRBC</em>' containment reference.
	 * @see #getUtiliseTypeEquipementNRBC()
	 * @generated
	 */
	void setUtiliseTypeEquipementNRBC(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Localise Par Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise Par Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise Par Localisation Geometrique2 D</em>' containment reference.
	 * @see #setEstLocaliseParLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_EstLocaliseParLocalisationGeometrique2D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='EstLocalisePar_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getEstLocaliseParLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getEstLocaliseParLocalisationGeometrique2D <em>Est Localise Par Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise Par Localisation Geometrique2 D</em>' containment reference.
	 * @see #getEstLocaliseParLocalisationGeometrique2D()
	 * @generated
	 */
	void setEstLocaliseParLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

	/**
	 * Returns the value of the '<em><b>APour Environnement Environnement Terrain Et Vegetation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Environnement Environnement Terrain Et Vegetation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Environnement Environnement Terrain Et Vegetation</em>' containment reference.
	 * @see #setAPourEnvironnementEnvironnementTerrainEtVegetation(TypeEnvironnementTerrainEtVegetation)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_APourEnvironnementEnvironnementTerrainEtVegetation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EnvironnementTerrainEtVegetation'"
	 *        extendedMetaData="kind='element' name='APourEnvironnement_EnvironnementTerrainEtVegetation'"
	 * @generated
	 */
	TypeEnvironnementTerrainEtVegetation getAPourEnvironnementEnvironnementTerrainEtVegetation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getAPourEnvironnementEnvironnementTerrainEtVegetation <em>APour Environnement Environnement Terrain Et Vegetation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Environnement Environnement Terrain Et Vegetation</em>' containment reference.
	 * @see #getAPourEnvironnementEnvironnementTerrainEtVegetation()
	 * @generated
	 */
	void setAPourEnvironnementEnvironnementTerrainEtVegetation(TypeEnvironnementTerrainEtVegetation value);

	/**
	 * Returns the value of the '<em><b>APour Conditions Meteo Tranche Meteo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Conditions Meteo Tranche Meteo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Conditions Meteo Tranche Meteo</em>' containment reference.
	 * @see #setAPourConditionsMeteoTrancheMeteo(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePrelevement_APourConditionsMeteoTrancheMeteo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TrancheMeteo'"
	 *        extendedMetaData="kind='element' name='APourConditionsMeteo_TrancheMeteo'"
	 * @generated
	 */
	TypeAssociation getAPourConditionsMeteoTrancheMeteo();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevement#getAPourConditionsMeteoTrancheMeteo <em>APour Conditions Meteo Tranche Meteo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Conditions Meteo Tranche Meteo</em>' containment reference.
	 * @see #getAPourConditionsMeteoTrancheMeteo()
	 * @generated
	 */
	void setAPourConditionsMeteoTrancheMeteo(TypeAssociation value);

} // TypePrelevement
