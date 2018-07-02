/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Sphere Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSphereGeometrique#getAPourCercleReferenceCercleGeometrique <em>APour Cercle Reference Cercle Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSphereGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SphereGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeSphereGeometrique extends TypeVolumeGeometrique {
	/**
	 * Returns the value of the '<em><b>APour Cercle Reference Cercle Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Cercle Reference Cercle Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Cercle Reference Cercle Geometrique</em>' containment reference.
	 * @see #setAPourCercleReferenceCercleGeometrique(TypeCercleGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeSphereGeometrique_APourCercleReferenceCercleGeometrique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CercleGeometrique'"
	 *        extendedMetaData="kind='element' name='APourCercleReference_CercleGeometrique'"
	 * @generated
	 */
	TypeCercleGeometrique getAPourCercleReferenceCercleGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSphereGeometrique#getAPourCercleReferenceCercleGeometrique <em>APour Cercle Reference Cercle Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Cercle Reference Cercle Geometrique</em>' containment reference.
	 * @see #getAPourCercleReferenceCercleGeometrique()
	 * @generated
	 */
	void setAPourCercleReferenceCercleGeometrique(TypeCercleGeometrique value);

} // TypeSphereGeometrique
