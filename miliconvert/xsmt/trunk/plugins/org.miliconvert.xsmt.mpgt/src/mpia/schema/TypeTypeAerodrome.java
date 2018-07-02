/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Aerodrome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeAerodrome#getUsagePrincipal <em>Usage Principal</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeAerodrome()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeAerodrome' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeAerodrome extends TypeTypeSite {
	/**
	 * Returns the value of the '<em><b>Usage Principal</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAerodromeUsagePrincipal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Principal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Principal</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAerodromeUsagePrincipal
	 * @see #isSetUsagePrincipal()
	 * @see #unsetUsagePrincipal()
	 * @see #setUsagePrincipal(TypeDictionaryDicoTypeAerodromeUsagePrincipal)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAerodrome_UsagePrincipal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='UsagePrincipal'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAerodromeUsagePrincipal getUsagePrincipal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAerodrome#getUsagePrincipal <em>Usage Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Principal</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAerodromeUsagePrincipal
	 * @see #isSetUsagePrincipal()
	 * @see #unsetUsagePrincipal()
	 * @see #getUsagePrincipal()
	 * @generated
	 */
	void setUsagePrincipal(TypeDictionaryDicoTypeAerodromeUsagePrincipal value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAerodrome#getUsagePrincipal <em>Usage Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsagePrincipal()
	 * @see #getUsagePrincipal()
	 * @see #setUsagePrincipal(TypeDictionaryDicoTypeAerodromeUsagePrincipal)
	 * @generated
	 */
	void unsetUsagePrincipal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAerodrome#getUsagePrincipal <em>Usage Principal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Principal</em>' attribute is set.
	 * @see #unsetUsagePrincipal()
	 * @see #getUsagePrincipal()
	 * @see #setUsagePrincipal(TypeDictionaryDicoTypeAerodromeUsagePrincipal)
	 * @generated
	 */
	boolean isSetUsagePrincipal();

} // TypeTypeAerodrome
