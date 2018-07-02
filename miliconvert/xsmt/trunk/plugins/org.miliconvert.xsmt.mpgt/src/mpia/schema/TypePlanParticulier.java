/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Plan Particulier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanParticulier#getEstComposeTravailGenie <em>Est Compose Travail Genie</em>}</li>
 *   <li>{@link mpia.schema.TypePlanParticulier#getAPourDesignationAutoriteQualifieUnite <em>APour Designation Autorite Qualifie Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanParticulier()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PlanParticulier' kind='elementOnly'"
 * @generated
 */
public interface TypePlanParticulier extends EObject {
	/**
	 * Returns the value of the '<em><b>Est Compose Travail Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTravailGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Compose Travail Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Compose Travail Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanParticulier_EstComposeTravailGenie()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TravailGenie'"
	 *        extendedMetaData="kind='element' name='EstCompose_TravailGenie'"
	 * @generated
	 */
	EList<TypeTravailGenie> getEstComposeTravailGenie();

	/**
	 * Returns the value of the '<em><b>APour Designation Autorite Qualifie Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Designation Autorite Qualifie Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Designation Autorite Qualifie Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanParticulier_APourDesignationAutoriteQualifieUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourDesignationAutoriteQualifie_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourDesignationAutoriteQualifieUnite();

} // TypePlanParticulier
