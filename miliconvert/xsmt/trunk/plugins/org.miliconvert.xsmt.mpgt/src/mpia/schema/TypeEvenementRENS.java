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
 * A representation of the model object '<em><b>Type Evenement RENS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvenementRENS#getCategorieEvenement <em>Categorie Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementRENS#getEstSujetAssociationEvenementRENSEvenementRENS <em>Est Sujet Association Evenement RENS Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementRENS#getEstObjetAssociationEvenementRENSEvenementRENS <em>Est Objet Association Evenement RENS Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementRENS#getEstSujetAssociationEvenementRENSAutreEvenement <em>Est Sujet Association Evenement RENS Autre Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvenementRENS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_EvenementRENS' kind='elementOnly'"
 * @generated
 */
public interface TypeEvenementRENS extends TypeEvenement {
	/**
	 * Returns the value of the '<em><b>Categorie Evenement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Evenement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Evenement</em>' attribute.
	 * @see #setCategorieEvenement(String)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementRENS_CategorieEvenement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='CategorieEvenement'"
	 * @generated
	 */
	String getCategorieEvenement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementRENS#getCategorieEvenement <em>Categorie Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Evenement</em>' attribute.
	 * @see #getCategorieEvenement()
	 * @generated
	 */
	void setCategorieEvenement(String value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Evenement RENS Evenement RENS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Evenement RENS Evenement RENS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Evenement RENS Evenement RENS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementRENS_EstSujetAssociationEvenementRENSEvenementRENS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_EvenementRENS' target_entity='type_AssociationEvenementRENSEvenementRENS'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEvenementRENSEvenementRENS'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEvenementRENSEvenementRENS();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Evenement RENS Evenement RENS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Evenement RENS Evenement RENS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Evenement RENS Evenement RENS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementRENS_EstObjetAssociationEvenementRENSEvenementRENS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_EvenementRENS' target_entity='type_AssociationEvenementRENSEvenementRENS'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEvenementRENSEvenementRENS'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEvenementRENSEvenementRENS();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Evenement RENS Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Evenement RENS Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Evenement RENS Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementRENS_EstSujetAssociationEvenementRENSAutreEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_EvenementRENS' target_entity='type_AssociationEvenementRENSAutreEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEvenementRENSAutreEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEvenementRENSAutreEvenement();

} // TypeEvenementRENS
