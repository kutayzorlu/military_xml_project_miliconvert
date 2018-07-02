/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Localisation Geometrique3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLocalisationGeometrique3D#getAPourVolumeGeometriqueVolumeGeometrique <em>APour Volume Geometrique Volume Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLocalisationGeometrique3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_LocalisationGeometrique3D' kind='elementOnly'"
 * @generated
 */
public interface TypeLocalisationGeometrique3D extends TypeLocalisationGeometrique {
	/**
	 * Returns the value of the '<em><b>APour Volume Geometrique Volume Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Volume Geometrique Volume Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Volume Geometrique Volume Geometrique</em>' containment reference.
	 * @see #setAPourVolumeGeometriqueVolumeGeometrique(TypeVolumeGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeLocalisationGeometrique3D_APourVolumeGeometriqueVolumeGeometrique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeGeometrique'"
	 *        extendedMetaData="kind='element' name='APourVolumeGeometrique_VolumeGeometrique'"
	 * @generated
	 */
	TypeVolumeGeometrique getAPourVolumeGeometriqueVolumeGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLocalisationGeometrique3D#getAPourVolumeGeometriqueVolumeGeometrique <em>APour Volume Geometrique Volume Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Volume Geometrique Volume Geometrique</em>' containment reference.
	 * @see #getAPourVolumeGeometriqueVolumeGeometrique()
	 * @generated
	 */
	void setAPourVolumeGeometriqueVolumeGeometrique(TypeVolumeGeometrique value);

} // TypeLocalisationGeometrique3D
