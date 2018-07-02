/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Type Organisation Gouvernementale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getSousCategorie <em>Sous Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreTypeOrganisationGouvernementale()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreTypeOrganisationGouvernementale' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreTypeOrganisationGouvernementale extends TypeTypeOrganisationGouvernementale {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeOrganisationGouvernementale_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Autre Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Categorie</em>' attribute.
	 * @see #setAutreCategorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeOrganisationGouvernementale_AutreCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreCategorie'"
	 * @generated
	 */
	String getAutreCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getAutreCategorie <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Categorie</em>' attribute.
	 * @see #getAutreCategorie()
	 * @generated
	 */
	void setAutreCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreTypeOrganisationGouvernementaleSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeOrganisationGouvernementaleSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAutreTypeOrganisationGouvernementaleSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeOrganisationGouvernementale_SousCategorie()
	 * @model unsettable="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreTypeOrganisationGouvernementaleSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeOrganisationGouvernementaleSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoAutreTypeOrganisationGouvernementaleSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAutreTypeOrganisationGouvernementaleSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreTypeOrganisationGouvernementale#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAutreTypeOrganisationGouvernementaleSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

} // TypeAutreTypeOrganisationGouvernementale
