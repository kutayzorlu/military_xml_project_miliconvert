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
 * A representation of the model object '<em><b>Type Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvaluation#getElementsLogistiquesLimitants <em>Elements Logistiques Limitants</em>}</li>
 *   <li>{@link mpia.schema.TypeEvaluation#getAppreciation <em>Appreciation</em>}</li>
 *   <li>{@link mpia.schema.TypeEvaluation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEvaluation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEvaluation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvaluation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Evaluation' kind='elementOnly'"
 * @generated
 */
public interface TypeEvaluation extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements Logistiques Limitants</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEvaluationElementsLogistiquesLimitants}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements Logistiques Limitants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Logistiques Limitants</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvaluationElementsLogistiquesLimitants
	 * @see #isSetElementsLogistiquesLimitants()
	 * @see #unsetElementsLogistiquesLimitants()
	 * @see #setElementsLogistiquesLimitants(TypeDictionaryDicoEvaluationElementsLogistiquesLimitants)
	 * @see mpia.schema.SchemaPackage#getTypeEvaluation_ElementsLogistiquesLimitants()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ElementsLogistiquesLimitants'"
	 * @generated
	 */
	TypeDictionaryDicoEvaluationElementsLogistiquesLimitants getElementsLogistiquesLimitants();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvaluation#getElementsLogistiquesLimitants <em>Elements Logistiques Limitants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements Logistiques Limitants</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvaluationElementsLogistiquesLimitants
	 * @see #isSetElementsLogistiquesLimitants()
	 * @see #unsetElementsLogistiquesLimitants()
	 * @see #getElementsLogistiquesLimitants()
	 * @generated
	 */
	void setElementsLogistiquesLimitants(TypeDictionaryDicoEvaluationElementsLogistiquesLimitants value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvaluation#getElementsLogistiquesLimitants <em>Elements Logistiques Limitants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementsLogistiquesLimitants()
	 * @see #getElementsLogistiquesLimitants()
	 * @see #setElementsLogistiquesLimitants(TypeDictionaryDicoEvaluationElementsLogistiquesLimitants)
	 * @generated
	 */
	void unsetElementsLogistiquesLimitants();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvaluation#getElementsLogistiquesLimitants <em>Elements Logistiques Limitants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elements Logistiques Limitants</em>' attribute is set.
	 * @see #unsetElementsLogistiquesLimitants()
	 * @see #getElementsLogistiquesLimitants()
	 * @see #setElementsLogistiquesLimitants(TypeDictionaryDicoEvaluationElementsLogistiquesLimitants)
	 * @generated
	 */
	boolean isSetElementsLogistiquesLimitants();

	/**
	 * Returns the value of the '<em><b>Appreciation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appreciation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appreciation</em>' attribute.
	 * @see #setAppreciation(String)
	 * @see mpia.schema.SchemaPackage#getTypeEvaluation_Appreciation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000" required="true"
	 *        extendedMetaData="kind='element' name='Appreciation'"
	 * @generated
	 */
	String getAppreciation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvaluation#getAppreciation <em>Appreciation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appreciation</em>' attribute.
	 * @see #getAppreciation()
	 * @generated
	 */
	void setAppreciation(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEvaluation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvaluation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEvaluation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvaluation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEvaluation_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvaluation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeEvaluation
