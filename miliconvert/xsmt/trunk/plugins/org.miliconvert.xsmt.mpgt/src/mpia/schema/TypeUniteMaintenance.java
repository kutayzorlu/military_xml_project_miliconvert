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
 * A representation of the model object '<em><b>Type Unite Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUniteMaintenance#getDateSyntheseMaintenance <em>Date Synthese Maintenance</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteMaintenance#getAPourEvaluationEquipesReparationEquipesReparation <em>APour Evaluation Equipes Reparation Equipes Reparation</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteMaintenance#getAPourEvaluationMoyensEvacuationMoyensEvacuation <em>APour Evaluation Moyens Evacuation Moyens Evacuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUniteMaintenance()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_UniteMaintenance' kind='elementOnly'"
 * @generated
 */
public interface TypeUniteMaintenance extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Synthese Maintenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Synthese Maintenance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Synthese Maintenance</em>' attribute.
	 * @see #setDateSyntheseMaintenance(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeUniteMaintenance_DateSyntheseMaintenance()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateSyntheseMaintenance'"
	 * @generated
	 */
	XMLGregorianCalendar getDateSyntheseMaintenance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteMaintenance#getDateSyntheseMaintenance <em>Date Synthese Maintenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Synthese Maintenance</em>' attribute.
	 * @see #getDateSyntheseMaintenance()
	 * @generated
	 */
	void setDateSyntheseMaintenance(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>APour Evaluation Equipes Reparation Equipes Reparation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEquipesReparation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Evaluation Equipes Reparation Equipes Reparation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Evaluation Equipes Reparation Equipes Reparation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteMaintenance_APourEvaluationEquipesReparationEquipesReparation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EquipesReparation'"
	 *        extendedMetaData="kind='element' name='APourEvaluationEquipesReparation_EquipesReparation'"
	 * @generated
	 */
	EList<TypeEquipesReparation> getAPourEvaluationEquipesReparationEquipesReparation();

	/**
	 * Returns the value of the '<em><b>APour Evaluation Moyens Evacuation Moyens Evacuation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensEvacuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Evaluation Moyens Evacuation Moyens Evacuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Evaluation Moyens Evacuation Moyens Evacuation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteMaintenance_APourEvaluationMoyensEvacuationMoyensEvacuation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyensEvacuation'"
	 *        extendedMetaData="kind='element' name='APourEvaluationMoyensEvacuation_MoyensEvacuation'"
	 * @generated
	 */
	EList<TypeMoyensEvacuation> getAPourEvaluationMoyensEvacuationMoyensEvacuation();

} // TypeUniteMaintenance
