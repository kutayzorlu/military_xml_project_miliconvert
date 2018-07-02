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
 * A representation of the model object '<em><b>Type Mission Appui Mobilite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionAppuiMobilite#getCoupureSecheOuHumide <em>Coupure Seche Ou Humide</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAppuiMobilite#getFranchissementAPrevoir <em>Franchissement APrevoir</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAppuiMobilite#getRetablissementItineraire <em>Retablissement Itineraire</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAppuiMobilite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAppuiMobilite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAppuiMobilite#getAPourZoneAFranchirObstacle <em>APour Zone AFranchir Obstacle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionAppuiMobilite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MissionAppuiMobilite' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionAppuiMobilite extends EObject {
	/**
	 * Returns the value of the '<em><b>Coupure Seche Ou Humide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupure Seche Ou Humide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupure Seche Ou Humide</em>' attribute.
	 * @see #setCoupureSecheOuHumide(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAppuiMobilite_CoupureSecheOuHumide()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='CoupureSecheOuHumide'"
	 * @generated
	 */
	String getCoupureSecheOuHumide();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAppuiMobilite#getCoupureSecheOuHumide <em>Coupure Seche Ou Humide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coupure Seche Ou Humide</em>' attribute.
	 * @see #getCoupureSecheOuHumide()
	 * @generated
	 */
	void setCoupureSecheOuHumide(String value);

	/**
	 * Returns the value of the '<em><b>Franchissement APrevoir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Franchissement APrevoir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Franchissement APrevoir</em>' attribute.
	 * @see #setFranchissementAPrevoir(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAppuiMobilite_FranchissementAPrevoir()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='FranchissementAPrevoir'"
	 * @generated
	 */
	String getFranchissementAPrevoir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAppuiMobilite#getFranchissementAPrevoir <em>Franchissement APrevoir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Franchissement APrevoir</em>' attribute.
	 * @see #getFranchissementAPrevoir()
	 * @generated
	 */
	void setFranchissementAPrevoir(String value);

	/**
	 * Returns the value of the '<em><b>Retablissement Itineraire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retablissement Itineraire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retablissement Itineraire</em>' attribute.
	 * @see #setRetablissementItineraire(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAppuiMobilite_RetablissementItineraire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='RetablissementItineraire'"
	 * @generated
	 */
	String getRetablissementItineraire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAppuiMobilite#getRetablissementItineraire <em>Retablissement Itineraire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retablissement Itineraire</em>' attribute.
	 * @see #getRetablissementItineraire()
	 * @generated
	 */
	void setRetablissementItineraire(String value);

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAppuiMobilite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAppuiMobilite#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAppuiMobilite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAppuiMobilite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Zone AFranchir Obstacle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone AFranchir Obstacle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone AFranchir Obstacle</em>' containment reference.
	 * @see #setAPourZoneAFranchirObstacle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAppuiMobilite_APourZoneAFranchirObstacle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Obstacle'"
	 *        extendedMetaData="kind='element' name='APourZoneAFranchir_Obstacle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneAFranchirObstacle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAppuiMobilite#getAPourZoneAFranchirObstacle <em>APour Zone AFranchir Obstacle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone AFranchir Obstacle</em>' containment reference.
	 * @see #getAPourZoneAFranchirObstacle()
	 * @generated
	 */
	void setAPourZoneAFranchirObstacle(TypeAssociation value);

} // TypeMissionAppuiMobilite
