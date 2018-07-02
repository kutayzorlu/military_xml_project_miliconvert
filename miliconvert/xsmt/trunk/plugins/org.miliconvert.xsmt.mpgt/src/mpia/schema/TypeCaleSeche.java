/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Cale Seche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaleSeche#getTonnagePouvantEtreSouleve <em>Tonnage Pouvant Etre Souleve</em>}</li>
 *   <li>{@link mpia.schema.TypeCaleSeche#getProfondeurEauDisponible <em>Profondeur Eau Disponible</em>}</li>
 *   <li>{@link mpia.schema.TypeCaleSeche#getCapaciteVoieFerreeSousMarine <em>Capacite Voie Ferree Sous Marine</em>}</li>
 *   <li>{@link mpia.schema.TypeCaleSeche#getSpecificites <em>Specificites</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaleSeche()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CaleSeche' kind='elementOnly'"
 * @generated
 */
public interface TypeCaleSeche extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Tonnage Pouvant Etre Souleve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tonnage Pouvant Etre Souleve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tonnage Pouvant Etre Souleve</em>' attribute.
	 * @see #isSetTonnagePouvantEtreSouleve()
	 * @see #unsetTonnagePouvantEtreSouleve()
	 * @see #setTonnagePouvantEtreSouleve(long)
	 * @see mpia.schema.SchemaPackage#getTypeCaleSeche_TonnagePouvantEtreSouleve()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='TonnagePouvantEtreSouleve'"
	 * @generated
	 */
	long getTonnagePouvantEtreSouleve();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaleSeche#getTonnagePouvantEtreSouleve <em>Tonnage Pouvant Etre Souleve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tonnage Pouvant Etre Souleve</em>' attribute.
	 * @see #isSetTonnagePouvantEtreSouleve()
	 * @see #unsetTonnagePouvantEtreSouleve()
	 * @see #getTonnagePouvantEtreSouleve()
	 * @generated
	 */
	void setTonnagePouvantEtreSouleve(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaleSeche#getTonnagePouvantEtreSouleve <em>Tonnage Pouvant Etre Souleve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTonnagePouvantEtreSouleve()
	 * @see #getTonnagePouvantEtreSouleve()
	 * @see #setTonnagePouvantEtreSouleve(long)
	 * @generated
	 */
	void unsetTonnagePouvantEtreSouleve();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaleSeche#getTonnagePouvantEtreSouleve <em>Tonnage Pouvant Etre Souleve</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tonnage Pouvant Etre Souleve</em>' attribute is set.
	 * @see #unsetTonnagePouvantEtreSouleve()
	 * @see #getTonnagePouvantEtreSouleve()
	 * @see #setTonnagePouvantEtreSouleve(long)
	 * @generated
	 */
	boolean isSetTonnagePouvantEtreSouleve();

	/**
	 * Returns the value of the '<em><b>Profondeur Eau Disponible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profondeur Eau Disponible</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profondeur Eau Disponible</em>' containment reference.
	 * @see #setProfondeurEauDisponible(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCaleSeche_ProfondeurEauDisponible()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProfondeurEauDisponible'"
	 * @generated
	 */
	TypeDataTypeLongueur getProfondeurEauDisponible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaleSeche#getProfondeurEauDisponible <em>Profondeur Eau Disponible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profondeur Eau Disponible</em>' containment reference.
	 * @see #getProfondeurEauDisponible()
	 * @generated
	 */
	void setProfondeurEauDisponible(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Capacite Voie Ferree Sous Marine</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Voie Ferree Sous Marine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Voie Ferree Sous Marine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine
	 * @see #isSetCapaciteVoieFerreeSousMarine()
	 * @see #unsetCapaciteVoieFerreeSousMarine()
	 * @see #setCapaciteVoieFerreeSousMarine(TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine)
	 * @see mpia.schema.SchemaPackage#getTypeCaleSeche_CapaciteVoieFerreeSousMarine()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CapaciteVoieFerreeSousMarine'"
	 * @generated
	 */
	TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine getCapaciteVoieFerreeSousMarine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaleSeche#getCapaciteVoieFerreeSousMarine <em>Capacite Voie Ferree Sous Marine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Voie Ferree Sous Marine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine
	 * @see #isSetCapaciteVoieFerreeSousMarine()
	 * @see #unsetCapaciteVoieFerreeSousMarine()
	 * @see #getCapaciteVoieFerreeSousMarine()
	 * @generated
	 */
	void setCapaciteVoieFerreeSousMarine(TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaleSeche#getCapaciteVoieFerreeSousMarine <em>Capacite Voie Ferree Sous Marine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteVoieFerreeSousMarine()
	 * @see #getCapaciteVoieFerreeSousMarine()
	 * @see #setCapaciteVoieFerreeSousMarine(TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine)
	 * @generated
	 */
	void unsetCapaciteVoieFerreeSousMarine();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaleSeche#getCapaciteVoieFerreeSousMarine <em>Capacite Voie Ferree Sous Marine</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Voie Ferree Sous Marine</em>' attribute is set.
	 * @see #unsetCapaciteVoieFerreeSousMarine()
	 * @see #getCapaciteVoieFerreeSousMarine()
	 * @see #setCapaciteVoieFerreeSousMarine(TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine)
	 * @generated
	 */
	boolean isSetCapaciteVoieFerreeSousMarine();

	/**
	 * Returns the value of the '<em><b>Specificites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specificites</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specificites</em>' attribute.
	 * @see #setSpecificites(String)
	 * @see mpia.schema.SchemaPackage#getTypeCaleSeche_Specificites()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Specificites'"
	 * @generated
	 */
	String getSpecificites();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaleSeche#getSpecificites <em>Specificites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specificites</em>' attribute.
	 * @see #getSpecificites()
	 * @generated
	 */
	void setSpecificites(String value);

} // TypeCaleSeche
