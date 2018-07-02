/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Surveillance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionSurveillance#getACommeZoneASurveillerAutreElementControle <em>AComme Zone ASurveiller Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionSurveillance()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MissionSurveillance' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionSurveillance extends EObject {
	/**
	 * Returns the value of the '<em><b>AComme Zone ASurveiller Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Zone ASurveiller Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Zone ASurveiller Autre Element Controle</em>' containment reference.
	 * @see #setACommeZoneASurveillerAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionSurveillance_ACommeZoneASurveillerAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeZoneASurveiller_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeZoneASurveillerAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionSurveillance#getACommeZoneASurveillerAutreElementControle <em>AComme Zone ASurveiller Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Zone ASurveiller Autre Element Controle</em>' containment reference.
	 * @see #getACommeZoneASurveillerAutreElementControle()
	 * @generated
	 */
	void setACommeZoneASurveillerAutreElementControle(TypeAssociation value);

} // TypeMissionSurveillance
