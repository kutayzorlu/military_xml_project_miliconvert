/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Plan Mixte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanMixte#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getDateProposition <em>Date Proposition</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getDateApprobation <em>Date Approbation</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getAPourPlanAideDeploiementPlanParticulier <em>APour Plan Aide Deploiement Plan Particulier</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getAPourPlanAppuiContreMobilitePlanParticulier <em>APour Plan Appui Contre Mobilite Plan Particulier</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getAPourPlanAppuiMobilitePlanParticulier <em>APour Plan Appui Mobilite Plan Particulier</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getAPourPlanificationPlanification <em>APour Planification Planification</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getAPourHypothesePlanification <em>APour Hypothese Planification</em>}</li>
 *   <li>{@link mpia.schema.TypePlanMixte#getAPourCrIncidentCrIncident <em>APour Cr Incident Cr Incident</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanMixte()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PlanMixte' kind='elementOnly'"
 * @generated
 */
public interface TypePlanMixte extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanMixte#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Date Proposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Proposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Proposition</em>' attribute.
	 * @see #setDateProposition(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_DateProposition()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateProposition'"
	 * @generated
	 */
	XMLGregorianCalendar getDateProposition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanMixte#getDateProposition <em>Date Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Proposition</em>' attribute.
	 * @see #getDateProposition()
	 * @generated
	 */
	void setDateProposition(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Approbation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Approbation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Approbation</em>' attribute.
	 * @see #setDateApprobation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_DateApprobation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateApprobation'"
	 * @generated
	 */
	XMLGregorianCalendar getDateApprobation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanMixte#getDateApprobation <em>Date Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Approbation</em>' attribute.
	 * @see #getDateApprobation()
	 * @generated
	 */
	void setDateApprobation(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanMixte#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanMixte#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Plan Aide Deploiement Plan Particulier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Plan Aide Deploiement Plan Particulier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Plan Aide Deploiement Plan Particulier</em>' containment reference.
	 * @see #setAPourPlanAideDeploiementPlanParticulier(TypePlanParticulier)
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_APourPlanAideDeploiementPlanParticulier()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PlanParticulier'"
	 *        extendedMetaData="kind='element' name='APourPlanAideDeploiement_PlanParticulier'"
	 * @generated
	 */
	TypePlanParticulier getAPourPlanAideDeploiementPlanParticulier();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanMixte#getAPourPlanAideDeploiementPlanParticulier <em>APour Plan Aide Deploiement Plan Particulier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Plan Aide Deploiement Plan Particulier</em>' containment reference.
	 * @see #getAPourPlanAideDeploiementPlanParticulier()
	 * @generated
	 */
	void setAPourPlanAideDeploiementPlanParticulier(TypePlanParticulier value);

	/**
	 * Returns the value of the '<em><b>APour Plan Appui Contre Mobilite Plan Particulier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Plan Appui Contre Mobilite Plan Particulier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Plan Appui Contre Mobilite Plan Particulier</em>' containment reference.
	 * @see #setAPourPlanAppuiContreMobilitePlanParticulier(TypePlanParticulier)
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_APourPlanAppuiContreMobilitePlanParticulier()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PlanParticulier'"
	 *        extendedMetaData="kind='element' name='APourPlanAppuiContreMobilite_PlanParticulier'"
	 * @generated
	 */
	TypePlanParticulier getAPourPlanAppuiContreMobilitePlanParticulier();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanMixte#getAPourPlanAppuiContreMobilitePlanParticulier <em>APour Plan Appui Contre Mobilite Plan Particulier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Plan Appui Contre Mobilite Plan Particulier</em>' containment reference.
	 * @see #getAPourPlanAppuiContreMobilitePlanParticulier()
	 * @generated
	 */
	void setAPourPlanAppuiContreMobilitePlanParticulier(TypePlanParticulier value);

	/**
	 * Returns the value of the '<em><b>APour Plan Appui Mobilite Plan Particulier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Plan Appui Mobilite Plan Particulier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Plan Appui Mobilite Plan Particulier</em>' containment reference.
	 * @see #setAPourPlanAppuiMobilitePlanParticulier(TypePlanParticulier)
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_APourPlanAppuiMobilitePlanParticulier()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PlanParticulier'"
	 *        extendedMetaData="kind='element' name='APourPlanAppuiMobilite_PlanParticulier'"
	 * @generated
	 */
	TypePlanParticulier getAPourPlanAppuiMobilitePlanParticulier();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanMixte#getAPourPlanAppuiMobilitePlanParticulier <em>APour Plan Appui Mobilite Plan Particulier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Plan Appui Mobilite Plan Particulier</em>' containment reference.
	 * @see #getAPourPlanAppuiMobilitePlanParticulier()
	 * @generated
	 */
	void setAPourPlanAppuiMobilitePlanParticulier(TypePlanParticulier value);

	/**
	 * Returns the value of the '<em><b>APour Planification Planification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Planification Planification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Planification Planification</em>' containment reference.
	 * @see #setAPourPlanificationPlanification(TypePlanification)
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_APourPlanificationPlanification()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Planification'"
	 *        extendedMetaData="kind='element' name='APourPlanification_Planification'"
	 * @generated
	 */
	TypePlanification getAPourPlanificationPlanification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanMixte#getAPourPlanificationPlanification <em>APour Planification Planification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Planification Planification</em>' containment reference.
	 * @see #getAPourPlanificationPlanification()
	 * @generated
	 */
	void setAPourPlanificationPlanification(TypePlanification value);

	/**
	 * Returns the value of the '<em><b>APour Hypothese Planification</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlanification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Hypothese Planification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Hypothese Planification</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_APourHypothesePlanification()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Planification'"
	 *        extendedMetaData="kind='element' name='APourHypothese_Planification'"
	 * @generated
	 */
	EList<TypePlanification> getAPourHypothesePlanification();

	/**
	 * Returns the value of the '<em><b>APour Cr Incident Cr Incident</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCrIncident}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Cr Incident Cr Incident</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Cr Incident Cr Incident</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanMixte_APourCrIncidentCrIncident()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CrIncident'"
	 *        extendedMetaData="kind='element' name='APourCrIncident_CrIncident'"
	 * @generated
	 */
	EList<TypeCrIncident> getAPourCrIncidentCrIncident();

} // TypePlanMixte
