/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Zone ADefendre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionZoneADefendre#getRole <em>Role</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionZoneADefendre#getACommeLocalisationAutreElementControle <em>AComme Localisation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionZoneADefendre#getACommeElementParticulierElementParticulierADefendre <em>AComme Element Particulier Element Particulier ADefendre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionZoneADefendre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MissionZoneADefendre' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionZoneADefendre extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionZoneADefendre_Role()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Role'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionZoneADefendre#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>AComme Localisation Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Localisation Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Localisation Autre Element Controle</em>' containment reference.
	 * @see #setACommeLocalisationAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionZoneADefendre_ACommeLocalisationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeLocalisation_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeLocalisationAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionZoneADefendre#getACommeLocalisationAutreElementControle <em>AComme Localisation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Localisation Autre Element Controle</em>' containment reference.
	 * @see #getACommeLocalisationAutreElementControle()
	 * @generated
	 */
	void setACommeLocalisationAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Element Particulier Element Particulier ADefendre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeElementParticulierADefendre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Element Particulier Element Particulier ADefendre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Element Particulier Element Particulier ADefendre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionZoneADefendre_ACommeElementParticulierElementParticulierADefendre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ElementParticulierADefendre'"
	 *        extendedMetaData="kind='element' name='ACommeElementParticulier_ElementParticulierADefendre'"
	 * @generated
	 */
	EList<TypeElementParticulierADefendre> getACommeElementParticulierElementParticulierADefendre();

} // TypeMissionZoneADefendre
