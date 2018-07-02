/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Volume Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVolumeGeometrique#getAPourPlafondDistanceVerticaleGeometrique <em>APour Plafond Distance Verticale Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeGeometrique#getAPourPlancherDistanceVerticaleGeometrique <em>APour Plancher Distance Verticale Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVolumeGeometrique()
 * @model abstract="true"
 *        annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_VolumeGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeVolumeGeometrique extends EObject {
	/**
	 * Returns the value of the '<em><b>APour Plafond Distance Verticale Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Plafond Distance Verticale Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Plafond Distance Verticale Geometrique</em>' containment reference.
	 * @see #setAPourPlafondDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeGeometrique_APourPlafondDistanceVerticaleGeometrique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DistanceVerticaleGeometrique'"
	 *        extendedMetaData="kind='element' name='APourPlafond_DistanceVerticaleGeometrique'"
	 * @generated
	 */
	TypeDistanceVerticaleGeometrique getAPourPlafondDistanceVerticaleGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeGeometrique#getAPourPlafondDistanceVerticaleGeometrique <em>APour Plafond Distance Verticale Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Plafond Distance Verticale Geometrique</em>' containment reference.
	 * @see #getAPourPlafondDistanceVerticaleGeometrique()
	 * @generated
	 */
	void setAPourPlafondDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique value);

	/**
	 * Returns the value of the '<em><b>APour Plancher Distance Verticale Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Plancher Distance Verticale Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Plancher Distance Verticale Geometrique</em>' containment reference.
	 * @see #setAPourPlancherDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeGeometrique_APourPlancherDistanceVerticaleGeometrique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DistanceVerticaleGeometrique'"
	 *        extendedMetaData="kind='element' name='APourPlancher_DistanceVerticaleGeometrique'"
	 * @generated
	 */
	TypeDistanceVerticaleGeometrique getAPourPlancherDistanceVerticaleGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeGeometrique#getAPourPlancherDistanceVerticaleGeometrique <em>APour Plancher Distance Verticale Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Plancher Distance Verticale Geometrique</em>' containment reference.
	 * @see #getAPourPlancherDistanceVerticaleGeometrique()
	 * @generated
	 */
	void setAPourPlancherDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique value);

} // TypeVolumeGeometrique
