/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Adresse Electronique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAdresseElectronique#getAdresseReseau <em>Adresse Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeAdresseElectronique#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeAdresseElectronique#getFournitAccesAServiceReseau <em>Fournit Acces AService Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAdresseElectronique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AdresseElectronique' kind='elementOnly'"
 * @generated
 */
public interface TypeAdresseElectronique extends TypeAdresse {
	/**
	 * Returns the value of the '<em><b>Adresse Reseau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse Reseau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Reseau</em>' attribute.
	 * @see #setAdresseReseau(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdresseElectronique_AdresseReseau()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='AdresseReseau'"
	 * @generated
	 */
	String getAdresseReseau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdresseElectronique#getAdresseReseau <em>Adresse Reseau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse Reseau</em>' attribute.
	 * @see #getAdresseReseau()
	 * @generated
	 */
	void setAdresseReseau(String value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdresseElectronique_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdresseElectronique#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Fournit Acces AService Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fournit Acces AService Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fournit Acces AService Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAdresseElectronique_FournitAccesAServiceReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAccedePar_AdresseElectronique' target_entity='type_ServiceReseau'"
	 *        extendedMetaData="kind='element' name='FournitAccesA_ServiceReseau'"
	 * @generated
	 */
	EList<TypeAssociation> getFournitAccesAServiceReseau();

} // TypeAdresseElectronique
