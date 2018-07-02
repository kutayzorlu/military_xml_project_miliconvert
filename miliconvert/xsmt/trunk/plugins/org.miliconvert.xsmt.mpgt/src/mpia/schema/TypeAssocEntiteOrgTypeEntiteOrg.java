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
 * A representation of the model object '<em><b>Type Assoc Entite Org Type Entite Org</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssocEntiteOrgTypeEntiteOrg#getAssocieCommeObjetEntiteOrganisationnelle <em>Associe Comme Objet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocEntiteOrgTypeEntiteOrg#getAssocieCommeTypeTypeEntiteOrganisationnelle <em>Associe Comme Type Type Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssocEntiteOrgTypeEntiteOrg()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssocEntiteOrgTypeEntiteOrg' kind='elementOnly'"
 * @generated
 */
public interface TypeAssocEntiteOrgTypeEntiteOrg extends TypeAssociationInstanceObjetType {
	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Entite Organisationnelle</em>' containment reference.
	 * @see #setAssocieCommeObjetEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssocEntiteOrgTypeEntiteOrg_AssocieCommeObjetEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourType_AssocEntiteOrgTypeEntiteOrg' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeObjetEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocEntiteOrgTypeEntiteOrg#getAssocieCommeObjetEntiteOrganisationnelle <em>Associe Comme Objet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Entite Organisationnelle</em>' containment reference.
	 * @see #getAssocieCommeObjetEntiteOrganisationnelle()
	 * @generated
	 */
	void setAssocieCommeObjetEntiteOrganisationnelle(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Type Type Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Type Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Type Entite Organisationnelle</em>' containment reference.
	 * @see #setAssocieCommeTypeTypeEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssocEntiteOrgTypeEntiteOrg_AssocieCommeTypeTypeEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypeEntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeTypeTypeEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocEntiteOrgTypeEntiteOrg#getAssocieCommeTypeTypeEntiteOrganisationnelle <em>Associe Comme Type Type Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Entite Organisationnelle</em>' containment reference.
	 * @see #getAssocieCommeTypeTypeEntiteOrganisationnelle()
	 * @generated
	 */
	void setAssocieCommeTypeTypeEntiteOrganisationnelle(TypeAssociationEXT value);

} // TypeAssocEntiteOrgTypeEntiteOrg
