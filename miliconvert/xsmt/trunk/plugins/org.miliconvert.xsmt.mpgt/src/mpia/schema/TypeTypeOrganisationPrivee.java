/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Organisation Privee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeOrganisationPrivee#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeOrganisationPrivee#getActivitePrincipale <em>Activite Principale</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeOrganisationPrivee()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeOrganisationPrivee' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeOrganisationPrivee extends TypeTypeEntiteOrganisationnelle {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeOrganisationPriveeCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeOrganisationPriveeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeOrganisationPriveeCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeOrganisationPrivee_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeOrganisationPriveeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeOrganisationPrivee#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeOrganisationPriveeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeOrganisationPriveeCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeOrganisationPrivee#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeOrganisationPriveeCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeOrganisationPrivee#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeOrganisationPriveeCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Activite Principale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActivitePrincipale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Principale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Principale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivitePrincipale
	 * @see #isSetActivitePrincipale()
	 * @see #unsetActivitePrincipale()
	 * @see #setActivitePrincipale(TypeDictionaryDicoActivitePrincipale)
	 * @see mpia.schema.SchemaPackage#getTypeTypeOrganisationPrivee_ActivitePrincipale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ActivitePrincipale'"
	 * @generated
	 */
	TypeDictionaryDicoActivitePrincipale getActivitePrincipale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeOrganisationPrivee#getActivitePrincipale <em>Activite Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Principale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivitePrincipale
	 * @see #isSetActivitePrincipale()
	 * @see #unsetActivitePrincipale()
	 * @see #getActivitePrincipale()
	 * @generated
	 */
	void setActivitePrincipale(TypeDictionaryDicoActivitePrincipale value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeOrganisationPrivee#getActivitePrincipale <em>Activite Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivitePrincipale()
	 * @see #getActivitePrincipale()
	 * @see #setActivitePrincipale(TypeDictionaryDicoActivitePrincipale)
	 * @generated
	 */
	void unsetActivitePrincipale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeOrganisationPrivee#getActivitePrincipale <em>Activite Principale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activite Principale</em>' attribute is set.
	 * @see #unsetActivitePrincipale()
	 * @see #getActivitePrincipale()
	 * @see #setActivitePrincipale(TypeDictionaryDicoActivitePrincipale)
	 * @generated
	 */
	boolean isSetActivitePrincipale();

} // TypeTypeOrganisationPrivee
