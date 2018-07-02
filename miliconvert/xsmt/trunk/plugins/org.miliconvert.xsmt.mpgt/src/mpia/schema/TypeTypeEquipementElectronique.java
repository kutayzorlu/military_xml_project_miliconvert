/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Equipement Electronique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeEquipementElectronique#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipementElectronique#getSousCategorie <em>Sous Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeEquipementElectronique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeEquipementElectronique' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeEquipementElectronique extends TypeTypeEquipement {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeEquipementElectroniqueCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEquipementElectroniqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeEquipementElectroniqueCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipementElectronique_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeEquipementElectroniqueCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipementElectronique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEquipementElectroniqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeEquipementElectroniqueCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEquipementElectronique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeEquipementElectroniqueCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEquipementElectronique#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeEquipementElectroniqueCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipementElectronique_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipementElectronique#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEquipementElectronique#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEquipementElectronique#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeEquipementElectroniqueSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

} // TypeTypeEquipementElectronique
