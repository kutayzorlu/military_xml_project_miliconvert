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
 * A representation of the model object '<em><b>Type Capacite Feux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteFeux#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteFeux#getTypeGeneralArme <em>Type General Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteFeux#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteFeux#getAssocieCommeMunitionsTypeMunition <em>Associe Comme Munitions Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteFeux()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteFeux' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteFeux extends TypeCapacite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteFeuxCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteFeuxCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteFeuxCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteFeux_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteFeuxCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteFeux#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteFeuxCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCapaciteFeuxCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteFeux#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteFeuxCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteFeux#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteFeuxCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type General Arme</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteFeuxTypeGeneralArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type General Arme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type General Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteFeuxTypeGeneralArme
	 * @see #isSetTypeGeneralArme()
	 * @see #unsetTypeGeneralArme()
	 * @see #setTypeGeneralArme(TypeDictionaryDicoCapaciteFeuxTypeGeneralArme)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteFeux_TypeGeneralArme()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeGeneralArme'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteFeuxTypeGeneralArme getTypeGeneralArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteFeux#getTypeGeneralArme <em>Type General Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type General Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteFeuxTypeGeneralArme
	 * @see #isSetTypeGeneralArme()
	 * @see #unsetTypeGeneralArme()
	 * @see #getTypeGeneralArme()
	 * @generated
	 */
	void setTypeGeneralArme(TypeDictionaryDicoCapaciteFeuxTypeGeneralArme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteFeux#getTypeGeneralArme <em>Type General Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeGeneralArme()
	 * @see #getTypeGeneralArme()
	 * @see #setTypeGeneralArme(TypeDictionaryDicoCapaciteFeuxTypeGeneralArme)
	 * @generated
	 */
	void unsetTypeGeneralArme();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteFeux#getTypeGeneralArme <em>Type General Arme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type General Arme</em>' attribute is set.
	 * @see #unsetTypeGeneralArme()
	 * @see #getTypeGeneralArme()
	 * @see #setTypeGeneralArme(TypeDictionaryDicoCapaciteFeuxTypeGeneralArme)
	 * @generated
	 */
	boolean isSetTypeGeneralArme();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteFeuxType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteFeuxType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCapaciteFeuxType)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteFeux_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteFeuxType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteFeux#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteFeuxType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCapaciteFeuxType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteFeux#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteFeuxType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteFeux#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteFeuxType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Associe Comme Munitions Type Munition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Munitions Type Munition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Munitions Type Munition</em>' containment reference.
	 * @see #setAssocieCommeMunitionsTypeMunition(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteFeux_AssocieCommeMunitionsTypeMunition()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstTypeMunitionsAssocie_CapaciteFeux' target_entity='type_TypeMunition'"
	 *        extendedMetaData="kind='element' name='AssocieCommeMunitions_TypeMunition'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeMunitionsTypeMunition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteFeux#getAssocieCommeMunitionsTypeMunition <em>Associe Comme Munitions Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Munitions Type Munition</em>' containment reference.
	 * @see #getAssocieCommeMunitionsTypeMunition()
	 * @generated
	 */
	void setAssocieCommeMunitionsTypeMunition(TypeAssociationEXT value);

} // TypeCapaciteFeux
