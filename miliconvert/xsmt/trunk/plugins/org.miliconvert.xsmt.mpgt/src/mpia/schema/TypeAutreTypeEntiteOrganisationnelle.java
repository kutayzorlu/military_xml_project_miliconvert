/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Type Entite Organisationnelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreTypeEntiteOrganisationnelle#getCategorie <em>Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreTypeEntiteOrganisationnelle()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreTypeEntiteOrganisationnelle' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreTypeEntiteOrganisationnelle extends TypeTypeEntiteOrganisationnelle {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see #setCategorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeEntiteOrganisationnelle_Categorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	String getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeEntiteOrganisationnelle#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(String value);

} // TypeAutreTypeEntiteOrganisationnelle
