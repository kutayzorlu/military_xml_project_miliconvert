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
 * A representation of the model object '<em><b>Type Capacite Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteTransmission#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteTransmission#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteTransmission#getEstDefinieAvecTypeEquipementElectronique <em>Est Definie Avec Type Equipement Electronique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteTransmission()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteTransmission' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteTransmission extends TypeCapacite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteTransmissionCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteTransmissionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteTransmissionCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteTransmission_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteTransmissionCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteTransmission#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteTransmissionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCapaciteTransmissionCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteTransmission#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteTransmissionCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteTransmission#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteTransmissionCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteTransmissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteTransmissionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCapaciteTransmissionType)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteTransmission_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteTransmissionType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteTransmission#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteTransmissionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCapaciteTransmissionType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteTransmission#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteTransmissionType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteTransmission#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteTransmissionType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Est Definie Avec Type Equipement Electronique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Definie Avec Type Equipement Electronique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Definie Avec Type Equipement Electronique</em>' containment reference.
	 * @see #setEstDefinieAvecTypeEquipementElectronique(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteTransmission_EstDefinieAvecTypeEquipementElectronique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipementElectronique'"
	 *        extendedMetaData="kind='element' name='EstDefinieAvec_TypeEquipementElectronique'"
	 * @generated
	 */
	TypeAssociationEXT getEstDefinieAvecTypeEquipementElectronique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteTransmission#getEstDefinieAvecTypeEquipementElectronique <em>Est Definie Avec Type Equipement Electronique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Definie Avec Type Equipement Electronique</em>' containment reference.
	 * @see #getEstDefinieAvecTypeEquipementElectronique()
	 * @generated
	 */
	void setEstDefinieAvecTypeEquipementElectronique(TypeAssociationEXT value);

} // TypeCapaciteTransmission
