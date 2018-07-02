/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capacite Manutention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteManutention#getTypeCargaison <em>Type Cargaison</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteManutention#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteManutention#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteManutention()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteManutention' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteManutention extends TypeCapacite {
	/**
	 * Returns the value of the '<em><b>Type Cargaison</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeCargaison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Cargaison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Cargaison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeCargaison
	 * @see #isSetTypeCargaison()
	 * @see #unsetTypeCargaison()
	 * @see #setTypeCargaison(TypeDictionaryDicoTypeCargaison)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteManutention_TypeCargaison()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeCargaison'"
	 * @generated
	 */
	TypeDictionaryDicoTypeCargaison getTypeCargaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteManutention#getTypeCargaison <em>Type Cargaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Cargaison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeCargaison
	 * @see #isSetTypeCargaison()
	 * @see #unsetTypeCargaison()
	 * @see #getTypeCargaison()
	 * @generated
	 */
	void setTypeCargaison(TypeDictionaryDicoTypeCargaison value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteManutention#getTypeCargaison <em>Type Cargaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCargaison()
	 * @see #getTypeCargaison()
	 * @see #setTypeCargaison(TypeDictionaryDicoTypeCargaison)
	 * @generated
	 */
	void unsetTypeCargaison();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteManutention#getTypeCargaison <em>Type Cargaison</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Cargaison</em>' attribute is set.
	 * @see #unsetTypeCargaison()
	 * @see #getTypeCargaison()
	 * @see #setTypeCargaison(TypeDictionaryDicoTypeCargaison)
	 * @generated
	 */
	boolean isSetTypeCargaison();

	/**
	 * Returns the value of the '<em><b>Type Action</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteManutentionTypeAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Action</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteManutentionTypeAction
	 * @see #isSetTypeAction()
	 * @see #unsetTypeAction()
	 * @see #setTypeAction(TypeDictionaryDicoCapaciteManutentionTypeAction)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteManutention_TypeAction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeAction'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteManutentionTypeAction getTypeAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteManutention#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Action</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteManutentionTypeAction
	 * @see #isSetTypeAction()
	 * @see #unsetTypeAction()
	 * @see #getTypeAction()
	 * @generated
	 */
	void setTypeAction(TypeDictionaryDicoCapaciteManutentionTypeAction value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteManutention#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeAction()
	 * @see #getTypeAction()
	 * @see #setTypeAction(TypeDictionaryDicoCapaciteManutentionTypeAction)
	 * @generated
	 */
	void unsetTypeAction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteManutention#getTypeAction <em>Type Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Action</em>' attribute is set.
	 * @see #unsetTypeAction()
	 * @see #getTypeAction()
	 * @see #setTypeAction(TypeDictionaryDicoCapaciteManutentionTypeAction)
	 * @generated
	 */
	boolean isSetTypeAction();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteManutentionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteManutentionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCapaciteManutentionType)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteManutention_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteManutentionType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteManutention#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteManutentionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCapaciteManutentionType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteManutention#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteManutentionType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteManutention#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteManutentionType)
	 * @generated
	 */
	boolean isSetType();

} // TypeCapaciteManutention
