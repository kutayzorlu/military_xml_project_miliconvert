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
 * A representation of the model object '<em><b>Type Caracteristique Autre Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaracteristiqueAutreSite#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueAutreSite#getSousType <em>Sous Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueAutreSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CaracteristiqueAutreSite' kind='elementOnly'"
 * @generated
 */
public interface TypeCaracteristiqueAutreSite extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCaracteristiqueAutreSiteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiqueAutreSiteType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCaracteristiqueAutreSiteType)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueAutreSite_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCaracteristiqueAutreSiteType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueAutreSite#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiqueAutreSiteType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCaracteristiqueAutreSiteType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueAutreSite#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCaracteristiqueAutreSiteType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueAutreSite#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCaracteristiqueAutreSiteType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Sous Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCaracteristiqueAutreSiteSousType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiqueAutreSiteSousType
	 * @see #isSetSousType()
	 * @see #unsetSousType()
	 * @see #setSousType(TypeDictionaryDicoCaracteristiqueAutreSiteSousType)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueAutreSite_SousType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousType'"
	 * @generated
	 */
	TypeDictionaryDicoCaracteristiqueAutreSiteSousType getSousType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueAutreSite#getSousType <em>Sous Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiqueAutreSiteSousType
	 * @see #isSetSousType()
	 * @see #unsetSousType()
	 * @see #getSousType()
	 * @generated
	 */
	void setSousType(TypeDictionaryDicoCaracteristiqueAutreSiteSousType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueAutreSite#getSousType <em>Sous Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousType()
	 * @see #getSousType()
	 * @see #setSousType(TypeDictionaryDicoCaracteristiqueAutreSiteSousType)
	 * @generated
	 */
	void unsetSousType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueAutreSite#getSousType <em>Sous Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Type</em>' attribute is set.
	 * @see #unsetSousType()
	 * @see #getSousType()
	 * @see #setSousType(TypeDictionaryDicoCaracteristiqueAutreSiteSousType)
	 * @generated
	 */
	boolean isSetSousType();

} // TypeCaracteristiqueAutreSite
