/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capacite Mobilite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteMobilite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteMobilite#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteMobilite#getTypeTerrain <em>Type Terrain</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteMobilite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteMobilite' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteMobilite extends TypeCapacite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteMobiliteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMobiliteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteMobiliteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteMobilite_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteMobiliteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteMobilite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMobiliteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCapaciteMobiliteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteMobilite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteMobiliteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteMobilite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteMobiliteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteMobiliteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMobiliteType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCapaciteMobiliteType)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteMobilite_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteMobiliteType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteMobilite#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMobiliteType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCapaciteMobiliteType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteMobilite#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteMobiliteType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteMobilite#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteMobiliteType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Type Terrain</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteMobiliteTypeTerrain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Terrain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Terrain</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMobiliteTypeTerrain
	 * @see #isSetTypeTerrain()
	 * @see #unsetTypeTerrain()
	 * @see #setTypeTerrain(TypeDictionaryDicoCapaciteMobiliteTypeTerrain)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteMobilite_TypeTerrain()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeTerrain'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteMobiliteTypeTerrain getTypeTerrain();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteMobilite#getTypeTerrain <em>Type Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Terrain</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMobiliteTypeTerrain
	 * @see #isSetTypeTerrain()
	 * @see #unsetTypeTerrain()
	 * @see #getTypeTerrain()
	 * @generated
	 */
	void setTypeTerrain(TypeDictionaryDicoCapaciteMobiliteTypeTerrain value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteMobilite#getTypeTerrain <em>Type Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeTerrain()
	 * @see #getTypeTerrain()
	 * @see #setTypeTerrain(TypeDictionaryDicoCapaciteMobiliteTypeTerrain)
	 * @generated
	 */
	void unsetTypeTerrain();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteMobilite#getTypeTerrain <em>Type Terrain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Terrain</em>' attribute is set.
	 * @see #unsetTypeTerrain()
	 * @see #getTypeTerrain()
	 * @see #setTypeTerrain(TypeDictionaryDicoCapaciteMobiliteTypeTerrain)
	 * @generated
	 */
	boolean isSetTypeTerrain();

} // TypeCapaciteMobilite
