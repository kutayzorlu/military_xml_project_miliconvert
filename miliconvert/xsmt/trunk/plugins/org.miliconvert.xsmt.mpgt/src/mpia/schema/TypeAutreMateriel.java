/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreMateriel#getMobilite <em>Mobilite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreMateriel()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreMateriel' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreMateriel extends TypeMateriel {
	/**
	 * Returns the value of the '<em><b>Mobilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMobilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMobilite
	 * @see #isSetMobilite()
	 * @see #unsetMobilite()
	 * @see #setMobilite(TypeDictionaryDicoTypeMobilite)
	 * @see mpia.schema.SchemaPackage#getTypeAutreMateriel_Mobilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Mobilite'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMobilite getMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreMateriel#getMobilite <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMobilite
	 * @see #isSetMobilite()
	 * @see #unsetMobilite()
	 * @see #getMobilite()
	 * @generated
	 */
	void setMobilite(TypeDictionaryDicoTypeMobilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreMateriel#getMobilite <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMobilite()
	 * @see #getMobilite()
	 * @see #setMobilite(TypeDictionaryDicoTypeMobilite)
	 * @generated
	 */
	void unsetMobilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreMateriel#getMobilite <em>Mobilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mobilite</em>' attribute is set.
	 * @see #unsetMobilite()
	 * @see #getMobilite()
	 * @see #setMobilite(TypeDictionaryDicoTypeMobilite)
	 * @generated
	 */
	boolean isSetMobilite();

} // TypeAutreMateriel
