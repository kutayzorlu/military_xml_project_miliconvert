/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Type Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreTypeSite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreTypeSite#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreTypeSite#getStatutAdministratifLocalite <em>Statut Administratif Localite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreTypeSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreTypeSite' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreTypeSite extends TypeTypeSite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreTypeSiteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeSiteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeSite_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreTypeSiteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAutreTypeSiteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreTypeSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeSiteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreTypeSite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeSiteCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeSite_AutreCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreCategorie'"
	 * @generated
	 */
	String getAutreCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeSite#getAutreCategorie <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Categorie</em>' attribute.
	 * @see #getAutreCategorie()
	 * @generated
	 */
	void setAutreCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Statut Administratif Localite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statut Administratif Localite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut Administratif Localite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite
	 * @see #isSetStatutAdministratifLocalite()
	 * @see #unsetStatutAdministratifLocalite()
	 * @see #setStatutAdministratifLocalite(TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeSite_StatutAdministratifLocalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StatutAdministratifLocalite'"
	 * @generated
	 */
	TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite getStatutAdministratifLocalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeSite#getStatutAdministratifLocalite <em>Statut Administratif Localite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut Administratif Localite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite
	 * @see #isSetStatutAdministratifLocalite()
	 * @see #unsetStatutAdministratifLocalite()
	 * @see #getStatutAdministratifLocalite()
	 * @generated
	 */
	void setStatutAdministratifLocalite(TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreTypeSite#getStatutAdministratifLocalite <em>Statut Administratif Localite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatutAdministratifLocalite()
	 * @see #getStatutAdministratifLocalite()
	 * @see #setStatutAdministratifLocalite(TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite)
	 * @generated
	 */
	void unsetStatutAdministratifLocalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreTypeSite#getStatutAdministratifLocalite <em>Statut Administratif Localite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Statut Administratif Localite</em>' attribute is set.
	 * @see #unsetStatutAdministratifLocalite()
	 * @see #getStatutAdministratifLocalite()
	 * @see #setStatutAdministratifLocalite(TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite)
	 * @generated
	 */
	boolean isSetStatutAdministratifLocalite();

} // TypeAutreTypeSite
