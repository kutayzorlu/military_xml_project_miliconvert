/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Camp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCamp#getHommes <em>Hommes</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getCodeStanag3596 <em>Code Stanag3596</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getSituationPhysique <em>Situation Physique</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getNbPersonnesPresentes <em>Nb Personnes Presentes</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getTypePopulation <em>Type Population</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getNationaliteOccupants <em>Nationalite Occupants</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getEnfants <em>Enfants</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getFemmes <em>Femmes</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getConditionsGenerales <em>Conditions Generales</em>}</li>
 *   <li>{@link mpia.schema.TypeCamp#getAttitude <em>Attitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCamp()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Camp' kind='elementOnly'"
 * @generated
 */
public interface TypeCamp extends EObject {
	/**
	 * Returns the value of the '<em><b>Hommes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hommes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hommes</em>' attribute.
	 * @see #isSetHommes()
	 * @see #unsetHommes()
	 * @see #setHommes(long)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_Hommes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='Hommes'"
	 * @generated
	 */
	long getHommes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getHommes <em>Hommes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hommes</em>' attribute.
	 * @see #isSetHommes()
	 * @see #unsetHommes()
	 * @see #getHommes()
	 * @generated
	 */
	void setHommes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCamp#getHommes <em>Hommes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHommes()
	 * @see #getHommes()
	 * @see #setHommes(long)
	 * @generated
	 */
	void unsetHommes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCamp#getHommes <em>Hommes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hommes</em>' attribute is set.
	 * @see #unsetHommes()
	 * @see #getHommes()
	 * @see #setHommes(long)
	 * @generated
	 */
	boolean isSetHommes();

	/**
	 * Returns the value of the '<em><b>Code Stanag3596</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Stanag3596</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Stanag3596</em>' attribute.
	 * @see #setCodeStanag3596(String)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_CodeStanag3596()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='CodeStanag3596'"
	 * @generated
	 */
	String getCodeStanag3596();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getCodeStanag3596 <em>Code Stanag3596</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Stanag3596</em>' attribute.
	 * @see #getCodeStanag3596()
	 * @generated
	 */
	void setCodeStanag3596(String value);

	/**
	 * Returns the value of the '<em><b>Situation Physique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Physique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Physique</em>' attribute.
	 * @see #setSituationPhysique(String)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_SituationPhysique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='SituationPhysique'"
	 * @generated
	 */
	String getSituationPhysique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getSituationPhysique <em>Situation Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation Physique</em>' attribute.
	 * @see #getSituationPhysique()
	 * @generated
	 */
	void setSituationPhysique(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCampType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCampType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCampType)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCampType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCampType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCampType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCamp#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCampType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCamp#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCampType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Nb Personnes Presentes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Personnes Presentes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Personnes Presentes</em>' attribute.
	 * @see #isSetNbPersonnesPresentes()
	 * @see #unsetNbPersonnesPresentes()
	 * @see #setNbPersonnesPresentes(long)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_NbPersonnesPresentes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NbPersonnesPresentes'"
	 * @generated
	 */
	long getNbPersonnesPresentes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getNbPersonnesPresentes <em>Nb Personnes Presentes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Personnes Presentes</em>' attribute.
	 * @see #isSetNbPersonnesPresentes()
	 * @see #unsetNbPersonnesPresentes()
	 * @see #getNbPersonnesPresentes()
	 * @generated
	 */
	void setNbPersonnesPresentes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCamp#getNbPersonnesPresentes <em>Nb Personnes Presentes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbPersonnesPresentes()
	 * @see #getNbPersonnesPresentes()
	 * @see #setNbPersonnesPresentes(long)
	 * @generated
	 */
	void unsetNbPersonnesPresentes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCamp#getNbPersonnesPresentes <em>Nb Personnes Presentes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Personnes Presentes</em>' attribute is set.
	 * @see #unsetNbPersonnesPresentes()
	 * @see #getNbPersonnesPresentes()
	 * @see #setNbPersonnesPresentes(long)
	 * @generated
	 */
	boolean isSetNbPersonnesPresentes();

	/**
	 * Returns the value of the '<em><b>Type Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Population</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Population</em>' attribute.
	 * @see #setTypePopulation(String)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_TypePopulation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='TypePopulation'"
	 * @generated
	 */
	String getTypePopulation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getTypePopulation <em>Type Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Population</em>' attribute.
	 * @see #getTypePopulation()
	 * @generated
	 */
	void setTypePopulation(String value);

	/**
	 * Returns the value of the '<em><b>Nationalite Occupants</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationalite Occupants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationalite Occupants</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationaliteOccupants()
	 * @see #unsetNationaliteOccupants()
	 * @see #setNationaliteOccupants(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_NationaliteOccupants()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NationaliteOccupants'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationaliteOccupants();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getNationaliteOccupants <em>Nationalite Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationalite Occupants</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationaliteOccupants()
	 * @see #unsetNationaliteOccupants()
	 * @see #getNationaliteOccupants()
	 * @generated
	 */
	void setNationaliteOccupants(TypeDictionaryDicoEntitePolitiqueTrigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCamp#getNationaliteOccupants <em>Nationalite Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationaliteOccupants()
	 * @see #getNationaliteOccupants()
	 * @see #setNationaliteOccupants(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationaliteOccupants();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCamp#getNationaliteOccupants <em>Nationalite Occupants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nationalite Occupants</em>' attribute is set.
	 * @see #unsetNationaliteOccupants()
	 * @see #getNationaliteOccupants()
	 * @see #setNationaliteOccupants(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	boolean isSetNationaliteOccupants();

	/**
	 * Returns the value of the '<em><b>Enfants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enfants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enfants</em>' attribute.
	 * @see #isSetEnfants()
	 * @see #unsetEnfants()
	 * @see #setEnfants(long)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_Enfants()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='Enfants'"
	 * @generated
	 */
	long getEnfants();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getEnfants <em>Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enfants</em>' attribute.
	 * @see #isSetEnfants()
	 * @see #unsetEnfants()
	 * @see #getEnfants()
	 * @generated
	 */
	void setEnfants(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCamp#getEnfants <em>Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnfants()
	 * @see #getEnfants()
	 * @see #setEnfants(long)
	 * @generated
	 */
	void unsetEnfants();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCamp#getEnfants <em>Enfants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enfants</em>' attribute is set.
	 * @see #unsetEnfants()
	 * @see #getEnfants()
	 * @see #setEnfants(long)
	 * @generated
	 */
	boolean isSetEnfants();

	/**
	 * Returns the value of the '<em><b>Femmes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Femmes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Femmes</em>' attribute.
	 * @see #isSetFemmes()
	 * @see #unsetFemmes()
	 * @see #setFemmes(long)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_Femmes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='Femmes'"
	 * @generated
	 */
	long getFemmes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getFemmes <em>Femmes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Femmes</em>' attribute.
	 * @see #isSetFemmes()
	 * @see #unsetFemmes()
	 * @see #getFemmes()
	 * @generated
	 */
	void setFemmes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCamp#getFemmes <em>Femmes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFemmes()
	 * @see #getFemmes()
	 * @see #setFemmes(long)
	 * @generated
	 */
	void unsetFemmes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCamp#getFemmes <em>Femmes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Femmes</em>' attribute is set.
	 * @see #unsetFemmes()
	 * @see #getFemmes()
	 * @see #setFemmes(long)
	 * @generated
	 */
	boolean isSetFemmes();

	/**
	 * Returns the value of the '<em><b>Conditions Generales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions Generales</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions Generales</em>' attribute.
	 * @see #setConditionsGenerales(String)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_ConditionsGenerales()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ConditionsGenerales'"
	 * @generated
	 */
	String getConditionsGenerales();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getConditionsGenerales <em>Conditions Generales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions Generales</em>' attribute.
	 * @see #getConditionsGenerales()
	 * @generated
	 */
	void setConditionsGenerales(String value);

	/**
	 * Returns the value of the '<em><b>Attitude</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoComportement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComportement
	 * @see #isSetAttitude()
	 * @see #unsetAttitude()
	 * @see #setAttitude(TypeDictionaryDicoComportement)
	 * @see mpia.schema.SchemaPackage#getTypeCamp_Attitude()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Attitude'"
	 * @generated
	 */
	TypeDictionaryDicoComportement getAttitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCamp#getAttitude <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComportement
	 * @see #isSetAttitude()
	 * @see #unsetAttitude()
	 * @see #getAttitude()
	 * @generated
	 */
	void setAttitude(TypeDictionaryDicoComportement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCamp#getAttitude <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttitude()
	 * @see #getAttitude()
	 * @see #setAttitude(TypeDictionaryDicoComportement)
	 * @generated
	 */
	void unsetAttitude();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCamp#getAttitude <em>Attitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attitude</em>' attribute is set.
	 * @see #unsetAttitude()
	 * @see #getAttitude()
	 * @see #setAttitude(TypeDictionaryDicoComportement)
	 * @generated
	 */
	boolean isSetAttitude();

} // TypeCamp
