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
 * A representation of the model object '<em><b>Type Mission Defense Particuliere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionDefenseParticuliere#getACommeDefenseParticuliereElementParticulierADefendre <em>AComme Defense Particuliere Element Particulier ADefendre</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionDefenseParticuliere#getACommeDefenseAuProfitUniteDefenseAuProfitUnite <em>AComme Defense Au Profit Unite Defense Au Profit Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionDefenseParticuliere#getACommeDefenseAccompagnementDefenseAccompagnement <em>AComme Defense Accompagnement Defense Accompagnement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionDefenseParticuliere()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MissionDefenseParticuliere' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionDefenseParticuliere extends EObject {
	/**
	 * Returns the value of the '<em><b>AComme Defense Particuliere Element Particulier ADefendre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Defense Particuliere Element Particulier ADefendre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Defense Particuliere Element Particulier ADefendre</em>' containment reference.
	 * @see #setACommeDefenseParticuliereElementParticulierADefendre(TypeElementParticulierADefendre)
	 * @see mpia.schema.SchemaPackage#getTypeMissionDefenseParticuliere_ACommeDefenseParticuliereElementParticulierADefendre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ElementParticulierADefendre'"
	 *        extendedMetaData="kind='element' name='ACommeDefenseParticuliere_ElementParticulierADefendre'"
	 * @generated
	 */
	TypeElementParticulierADefendre getACommeDefenseParticuliereElementParticulierADefendre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionDefenseParticuliere#getACommeDefenseParticuliereElementParticulierADefendre <em>AComme Defense Particuliere Element Particulier ADefendre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Defense Particuliere Element Particulier ADefendre</em>' containment reference.
	 * @see #getACommeDefenseParticuliereElementParticulierADefendre()
	 * @generated
	 */
	void setACommeDefenseParticuliereElementParticulierADefendre(TypeElementParticulierADefendre value);

	/**
	 * Returns the value of the '<em><b>AComme Defense Au Profit Unite Defense Au Profit Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Defense Au Profit Unite Defense Au Profit Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Defense Au Profit Unite Defense Au Profit Unite</em>' containment reference.
	 * @see #setACommeDefenseAuProfitUniteDefenseAuProfitUnite(TypeDefenseAuProfitUnite)
	 * @see mpia.schema.SchemaPackage#getTypeMissionDefenseParticuliere_ACommeDefenseAuProfitUniteDefenseAuProfitUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DefenseAuProfitUnite'"
	 *        extendedMetaData="kind='element' name='ACommeDefenseAuProfitUnite_DefenseAuProfitUnite'"
	 * @generated
	 */
	TypeDefenseAuProfitUnite getACommeDefenseAuProfitUniteDefenseAuProfitUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionDefenseParticuliere#getACommeDefenseAuProfitUniteDefenseAuProfitUnite <em>AComme Defense Au Profit Unite Defense Au Profit Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Defense Au Profit Unite Defense Au Profit Unite</em>' containment reference.
	 * @see #getACommeDefenseAuProfitUniteDefenseAuProfitUnite()
	 * @generated
	 */
	void setACommeDefenseAuProfitUniteDefenseAuProfitUnite(TypeDefenseAuProfitUnite value);

	/**
	 * Returns the value of the '<em><b>AComme Defense Accompagnement Defense Accompagnement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Defense Accompagnement Defense Accompagnement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Defense Accompagnement Defense Accompagnement</em>' containment reference.
	 * @see #setACommeDefenseAccompagnementDefenseAccompagnement(TypeDefenseAccompagnement)
	 * @see mpia.schema.SchemaPackage#getTypeMissionDefenseParticuliere_ACommeDefenseAccompagnementDefenseAccompagnement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DefenseAccompagnement'"
	 *        extendedMetaData="kind='element' name='ACommeDefenseAccompagnement_DefenseAccompagnement'"
	 * @generated
	 */
	TypeDefenseAccompagnement getACommeDefenseAccompagnementDefenseAccompagnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionDefenseParticuliere#getACommeDefenseAccompagnementDefenseAccompagnement <em>AComme Defense Accompagnement Defense Accompagnement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Defense Accompagnement Defense Accompagnement</em>' containment reference.
	 * @see #getACommeDefenseAccompagnementDefenseAccompagnement()
	 * @generated
	 */
	void setACommeDefenseAccompagnementDefenseAccompagnement(TypeDefenseAccompagnement value);

} // TypeMissionDefenseParticuliere
