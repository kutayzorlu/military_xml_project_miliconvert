/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capacite Soutien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteSoutien#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteSoutien#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteSoutien()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteSoutien' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteSoutien extends TypeCapacite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteSoutienCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteSoutienCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteSoutienCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteSoutien_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteSoutienCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteSoutien#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteSoutienCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCapaciteSoutienCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteSoutien#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteSoutienCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteSoutien#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteSoutienCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteSoutienType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteSoutienType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCapaciteSoutienType)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteSoutien_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteSoutienType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteSoutien#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteSoutienType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCapaciteSoutienType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteSoutien#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteSoutienType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteSoutien#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteSoutienType)
	 * @generated
	 */
	boolean isSetType();

} // TypeCapaciteSoutien
