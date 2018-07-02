/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Logistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionLogistique#getIntitule <em>Intitule</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionLogistique#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionLogistique#getAPourZoneExecutionAutreElementControle <em>APour Zone Execution Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionLogistique()
 * @model abstract="true"
 *        extendedMetaData="name='type_MissionLogistique' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionLogistique extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intitule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule</em>' attribute.
	 * @see #setIntitule(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionLogistique_Intitule()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Intitule'"
	 * @generated
	 */
	String getIntitule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionLogistique#getIntitule <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule</em>' attribute.
	 * @see #getIntitule()
	 * @generated
	 */
	void setIntitule(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Concernee Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Concernee Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Concernee Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionLogistique_APourUniteConcerneeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteConcernee_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteConcerneeUnite();

	/**
	 * Returns the value of the '<em><b>APour Zone Execution Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Execution Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Execution Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneExecutionAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionLogistique_APourZoneExecutionAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneExecution_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneExecutionAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionLogistique#getAPourZoneExecutionAutreElementControle <em>APour Zone Execution Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Execution Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneExecutionAutreElementControle()
	 * @generated
	 */
	void setAPourZoneExecutionAutreElementControle(TypeAssociation value);

} // TypeMissionLogistique
