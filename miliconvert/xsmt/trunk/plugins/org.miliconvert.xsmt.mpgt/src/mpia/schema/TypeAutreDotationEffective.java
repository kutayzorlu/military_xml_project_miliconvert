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
 * A representation of the model object '<em><b>Type Autre Dotation Effective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreDotationEffective#getAssocieCommeTypeTypeEntiteOrganisationnelle <em>Associe Comme Type Type Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreDotationEffective#getAssocieCommeTypeTypeSite <em>Associe Comme Type Type Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreDotationEffective()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AutreDotationEffective' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreDotationEffective extends TypeDotationEffective {
	/**
	 * Returns the value of the '<em><b>Associe Comme Type Type Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Type Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Type Entite Organisationnelle</em>' containment reference.
	 * @see #setAssocieCommeTypeTypeEntiteOrganisationnelle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAutreDotationEffective_AssocieCommeTypeTypeEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypeEntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeTypeTypeEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreDotationEffective#getAssocieCommeTypeTypeEntiteOrganisationnelle <em>Associe Comme Type Type Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Entite Organisationnelle</em>' containment reference.
	 * @see #getAssocieCommeTypeTypeEntiteOrganisationnelle()
	 * @generated
	 */
	void setAssocieCommeTypeTypeEntiteOrganisationnelle(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAutreDotationEffective_AssocieCommeTypeTypeSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeSite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypeSite'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeTypeTypeSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreDotationEffective#getAssocieCommeTypeTypeSite <em>Associe Comme Type Type Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Site</em>' containment reference.
	 * @see #getAssocieCommeTypeTypeSite()
	 * @generated
	 */
	void setAssocieCommeTypeTypeSite(TypeAssociation value);

} // TypeAutreDotationEffective
