/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capacite Stockage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteStockage#getTypeCargaison <em>Type Cargaison</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteStockage#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteStockage#getConditionsStockage <em>Conditions Stockage</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteStockage#getStockeType <em>Stocke Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteStockage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteStockage' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteStockage extends TypeCapacite {
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
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteStockage_TypeCargaison()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeCargaison'"
	 * @generated
	 */
	TypeDictionaryDicoTypeCargaison getTypeCargaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteStockage#getTypeCargaison <em>Type Cargaison</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteStockage#getTypeCargaison <em>Type Cargaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCargaison()
	 * @see #getTypeCargaison()
	 * @see #setTypeCargaison(TypeDictionaryDicoTypeCargaison)
	 * @generated
	 */
	void unsetTypeCargaison();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteStockage#getTypeCargaison <em>Type Cargaison</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteStockageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteStockageType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCapaciteStockageType)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteStockage_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteStockageType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteStockage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteStockageType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCapaciteStockageType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteStockage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteStockageType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteStockage#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteStockageType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Conditions Stockage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteStockageConditionsStockage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions Stockage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions Stockage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteStockageConditionsStockage
	 * @see #isSetConditionsStockage()
	 * @see #unsetConditionsStockage()
	 * @see #setConditionsStockage(TypeDictionaryDicoCapaciteStockageConditionsStockage)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteStockage_ConditionsStockage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConditionsStockage'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteStockageConditionsStockage getConditionsStockage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteStockage#getConditionsStockage <em>Conditions Stockage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions Stockage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteStockageConditionsStockage
	 * @see #isSetConditionsStockage()
	 * @see #unsetConditionsStockage()
	 * @see #getConditionsStockage()
	 * @generated
	 */
	void setConditionsStockage(TypeDictionaryDicoCapaciteStockageConditionsStockage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteStockage#getConditionsStockage <em>Conditions Stockage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionsStockage()
	 * @see #getConditionsStockage()
	 * @see #setConditionsStockage(TypeDictionaryDicoCapaciteStockageConditionsStockage)
	 * @generated
	 */
	void unsetConditionsStockage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteStockage#getConditionsStockage <em>Conditions Stockage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditions Stockage</em>' attribute is set.
	 * @see #unsetConditionsStockage()
	 * @see #getConditionsStockage()
	 * @see #setConditionsStockage(TypeDictionaryDicoCapaciteStockageConditionsStockage)
	 * @generated
	 */
	boolean isSetConditionsStockage();

	/**
	 * Returns the value of the '<em><b>Stocke Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stocke Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stocke Type</em>' containment reference.
	 * @see #setStockeType(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteStockage_StockeType()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='Stocke_Type'"
	 * @generated
	 */
	TypeAssociationEXT getStockeType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteStockage#getStockeType <em>Stocke Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stocke Type</em>' containment reference.
	 * @see #getStockeType()
	 * @generated
	 */
	void setStockeType(TypeAssociationEXT value);

} // TypeCapaciteStockage
