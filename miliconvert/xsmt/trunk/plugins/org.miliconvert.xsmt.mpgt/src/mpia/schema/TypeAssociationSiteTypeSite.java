/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Site Type Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationSiteTypeSite#getAssocieCommeObjetSite <em>Associe Comme Objet Site</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationSiteTypeSite#getAssocieCommeTypeTypeSite <em>Associe Comme Type Type Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteTypeSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationSiteTypeSite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationSiteTypeSite extends TypeAssociationInstanceObjetType {
	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Site</em>' containment reference.
	 * @see #setAssocieCommeObjetSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteTypeSite_AssocieCommeObjetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourType_AssociationSiteTypeSite' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Site'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteTypeSite#getAssocieCommeObjetSite <em>Associe Comme Objet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Site</em>' containment reference.
	 * @see #getAssocieCommeObjetSite()
	 * @generated
	 */
	void setAssocieCommeObjetSite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Type Type Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Type Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Type Site</em>' containment reference.
	 * @see #setAssocieCommeTypeTypeSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteTypeSite_AssocieCommeTypeTypeSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeSite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypeSite'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeTypeTypeSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteTypeSite#getAssocieCommeTypeTypeSite <em>Associe Comme Type Type Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Site</em>' containment reference.
	 * @see #getAssocieCommeTypeTypeSite()
	 * @generated
	 */
	void setAssocieCommeTypeTypeSite(TypeAssociation value);

} // TypeAssociationSiteTypeSite
