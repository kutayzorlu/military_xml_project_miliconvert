/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Bassin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBassin#getProfondeurAMareeBasse <em>Profondeur AMaree Basse</em>}</li>
 *   <li>{@link mpia.schema.TypeBassin#getChargeEnLourdAcceptable <em>Charge En Lourd Acceptable</em>}</li>
 *   <li>{@link mpia.schema.TypeBassin#getSpecificites <em>Specificites</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBassin()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Bassin' kind='elementOnly'"
 * @generated
 */
public interface TypeBassin extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Profondeur AMaree Basse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profondeur AMaree Basse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profondeur AMaree Basse</em>' containment reference.
	 * @see #setProfondeurAMareeBasse(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeBassin_ProfondeurAMareeBasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProfondeurAMareeBasse'"
	 * @generated
	 */
	TypeDataTypeLongueur getProfondeurAMareeBasse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBassin#getProfondeurAMareeBasse <em>Profondeur AMaree Basse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profondeur AMaree Basse</em>' containment reference.
	 * @see #getProfondeurAMareeBasse()
	 * @generated
	 */
	void setProfondeurAMareeBasse(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Charge En Lourd Acceptable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge En Lourd Acceptable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge En Lourd Acceptable</em>' containment reference.
	 * @see #setChargeEnLourdAcceptable(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeBassin_ChargeEnLourdAcceptable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeEnLourdAcceptable'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeEnLourdAcceptable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBassin#getChargeEnLourdAcceptable <em>Charge En Lourd Acceptable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge En Lourd Acceptable</em>' containment reference.
	 * @see #getChargeEnLourdAcceptable()
	 * @generated
	 */
	void setChargeEnLourdAcceptable(TypeDataTypeMasse value);

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
	 * @see mpia.schema.SchemaPackage#getTypeBassin_Specificites()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Specificites'"
	 * @generated
	 */
	String getSpecificites();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBassin#getSpecificites <em>Specificites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specificites</em>' attribute.
	 * @see #getSpecificites()
	 * @generated
	 */
	void setSpecificites(String value);

} // TypeBassin
