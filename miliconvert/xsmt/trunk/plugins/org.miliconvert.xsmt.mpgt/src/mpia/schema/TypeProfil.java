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
 * A representation of the model object '<em><b>Type Profil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeProfil#getProfileId <em>Profile Id</em>}</li>
 *   <li>{@link mpia.schema.TypeProfil#getEstObjetAssociationProfilUnite <em>Est Objet Association Profil Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeProfil#getEstProfilAssociationProfilDotationTheorique <em>Est Profil Association Profil Dotation Theorique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeProfil()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Profil' kind='elementOnly'"
 * @generated
 */
public interface TypeProfil extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Profile Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Id</em>' attribute.
	 * @see #setProfileId(String)
	 * @see mpia.schema.SchemaPackage#getTypeProfil_ProfileId()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='ProfileId'"
	 * @generated
	 */
	String getProfileId();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProfil#getProfileId <em>Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Id</em>' attribute.
	 * @see #getProfileId()
	 * @generated
	 */
	void setProfileId(String value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Profil Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Profil Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Profil Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeProfil_EstObjetAssociationProfilUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Profil' target_entity='type_AssociationProfilUnite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationProfilUnite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationProfilUnite();

	/**
	 * Returns the value of the '<em><b>Est Profil Association Profil Dotation Theorique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Profil Association Profil Dotation Theorique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Profil Association Profil Dotation Theorique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeProfil_EstProfilAssociationProfilDotationTheorique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeProfil_Profil' target_entity='type_AssociationProfilDotationTheorique'"
	 *        extendedMetaData="kind='element' name='EstProfil_AssociationProfilDotationTheorique'"
	 * @generated
	 */
	EList<TypeAssociation> getEstProfilAssociationProfilDotationTheorique();

} // TypeProfil
