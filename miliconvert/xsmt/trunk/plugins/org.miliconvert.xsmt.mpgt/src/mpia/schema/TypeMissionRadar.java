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
 * A representation of the model object '<em><b>Type Mission Radar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionRadar#getDirectionObservationPointGeometrique <em>Direction Observation Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRadar#getPointDirectionMissionPointGeometrique <em>Point Direction Mission Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRadar#getOrigineSecteurPointGeometrique <em>Origine Secteur Point Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionRadar()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MissionRadar' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionRadar extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction Observation Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Observation Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Observation Point Geometrique</em>' containment reference.
	 * @see #setDirectionObservationPointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRadar_DirectionObservationPointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='DirectionObservation_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getDirectionObservationPointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRadar#getDirectionObservationPointGeometrique <em>Direction Observation Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Observation Point Geometrique</em>' containment reference.
	 * @see #getDirectionObservationPointGeometrique()
	 * @generated
	 */
	void setDirectionObservationPointGeometrique(TypePointGeometrique value);

	/**
	 * Returns the value of the '<em><b>Point Direction Mission Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Direction Mission Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Direction Mission Point Geometrique</em>' containment reference.
	 * @see #setPointDirectionMissionPointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRadar_PointDirectionMissionPointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='PointDirectionMission_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getPointDirectionMissionPointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRadar#getPointDirectionMissionPointGeometrique <em>Point Direction Mission Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Direction Mission Point Geometrique</em>' containment reference.
	 * @see #getPointDirectionMissionPointGeometrique()
	 * @generated
	 */
	void setPointDirectionMissionPointGeometrique(TypePointGeometrique value);

	/**
	 * Returns the value of the '<em><b>Origine Secteur Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origine Secteur Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origine Secteur Point Geometrique</em>' containment reference.
	 * @see #setOrigineSecteurPointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRadar_OrigineSecteurPointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='OrigineSecteur_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getOrigineSecteurPointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRadar#getOrigineSecteurPointGeometrique <em>Origine Secteur Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origine Secteur Point Geometrique</em>' containment reference.
	 * @see #getOrigineSecteurPointGeometrique()
	 * @generated
	 */
	void setOrigineSecteurPointGeometrique(TypePointGeometrique value);

} // TypeMissionRadar
