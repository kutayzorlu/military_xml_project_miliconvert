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
 * A representation of the model object '<em><b>Type Type Porteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypePorteur#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypePorteur#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypePorteur#getAPourSIOEmetteurUnite <em>APour SIO Emetteur Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypePorteur()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypePorteur' kind='elementOnly'"
 * @generated
 */
public interface TypeTypePorteur extends TypeType {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePorteurCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePorteurCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePorteurCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypePorteur_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypePorteurCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePorteur#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePorteurCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypePorteurCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePorteur#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePorteurCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePorteur#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePorteurCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeTypePorteur_AutreCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreCategorie'"
	 * @generated
	 */
	String getAutreCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePorteur#getAutreCategorie <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Categorie</em>' attribute.
	 * @see #getAutreCategorie()
	 * @generated
	 */
	void setAutreCategorie(String value);

	/**
	 * Returns the value of the '<em><b>APour SIO Emetteur Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour SIO Emetteur Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour SIO Emetteur Unite</em>' containment reference.
	 * @see #setAPourSIOEmetteurUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeTypePorteur_APourSIOEmetteurUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourSIOEmetteur_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourSIOEmetteurUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePorteur#getAPourSIOEmetteurUnite <em>APour SIO Emetteur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour SIO Emetteur Unite</em>' containment reference.
	 * @see #getAPourSIOEmetteurUnite()
	 * @generated
	 */
	void setAPourSIOEmetteurUnite(TypeAssociationEXT value);

} // TypeTypePorteur
