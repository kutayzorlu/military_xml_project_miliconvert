/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Azimut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAzimut#getDirectionObservation <em>Direction Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAzimut()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Azimut' kind='elementOnly'"
 * @generated
 */
public interface TypeAzimut extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Observation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Observation</em>' containment reference.
	 * @see #setDirectionObservation(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeAzimut_DirectionObservation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DirectionObservation'"
	 * @generated
	 */
	TypeDataTypeAngle getDirectionObservation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAzimut#getDirectionObservation <em>Direction Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Observation</em>' containment reference.
	 * @see #getDirectionObservation()
	 * @generated
	 */
	void setDirectionObservation(TypeDataTypeAngle value);

} // TypeAzimut
