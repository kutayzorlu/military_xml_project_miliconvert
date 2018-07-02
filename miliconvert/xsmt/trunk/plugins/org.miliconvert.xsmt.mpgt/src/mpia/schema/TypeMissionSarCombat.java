/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Sar Combat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionSarCombat#getAttitudeEnFinDAction <em>Attitude En Fin DAction</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionSarCombat()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionSarCombat' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionSarCombat extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Attitude En Fin DAction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude En Fin DAction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude En Fin DAction</em>' attribute.
	 * @see #setAttitudeEnFinDAction(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionSarCombat_AttitudeEnFinDAction()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='AttitudeEnFinDAction'"
	 * @generated
	 */
	String getAttitudeEnFinDAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionSarCombat#getAttitudeEnFinDAction <em>Attitude En Fin DAction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude En Fin DAction</em>' attribute.
	 * @see #getAttitudeEnFinDAction()
	 * @generated
	 */
	void setAttitudeEnFinDAction(String value);

} // TypeMissionSarCombat
