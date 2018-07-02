/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Cylindre Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCylindreGeometrique#getAPourSectionObjetGeometrique <em>APour Section Objet Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCylindreGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CylindreGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeCylindreGeometrique extends TypeVolumeGeometrique {
	/**
	 * Returns the value of the '<em><b>APour Section Objet Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Section Objet Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Section Objet Geometrique</em>' containment reference.
	 * @see #setAPourSectionObjetGeometrique(TypeObjetGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeCylindreGeometrique_APourSectionObjetGeometrique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ObjetGeometrique'"
	 *        extendedMetaData="kind='element' name='APourSection_ObjetGeometrique'"
	 * @generated
	 */
	TypeObjetGeometrique getAPourSectionObjetGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCylindreGeometrique#getAPourSectionObjetGeometrique <em>APour Section Objet Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Section Objet Geometrique</em>' containment reference.
	 * @see #getAPourSectionObjetGeometrique()
	 * @generated
	 */
	void setAPourSectionObjetGeometrique(TypeObjetGeometrique value);

} // TypeCylindreGeometrique
