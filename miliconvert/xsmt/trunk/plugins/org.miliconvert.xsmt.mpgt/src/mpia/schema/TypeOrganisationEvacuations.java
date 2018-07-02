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
 * A representation of the model object '<em><b>Type Organisation Evacuations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeOrganisationEvacuations#getEvacuationsTactiques <em>Evacuations Tactiques</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationEvacuations#getOrganisationRegulationEtTransit <em>Organisation Regulation Et Transit</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationEvacuations#getOrganisationGeneraleFlux <em>Organisation Generale Flux</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationEvacuations#getEvacuationsStrategiques <em>Evacuations Strategiques</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeOrganisationEvacuations()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_OrganisationEvacuations' kind='elementOnly'"
 * @generated
 */
public interface TypeOrganisationEvacuations extends EObject {
	/**
	 * Returns the value of the '<em><b>Evacuations Tactiques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evacuations Tactiques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evacuations Tactiques</em>' attribute.
	 * @see #setEvacuationsTactiques(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationEvacuations_EvacuationsTactiques()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='EvacuationsTactiques'"
	 * @generated
	 */
	String getEvacuationsTactiques();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationEvacuations#getEvacuationsTactiques <em>Evacuations Tactiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evacuations Tactiques</em>' attribute.
	 * @see #getEvacuationsTactiques()
	 * @generated
	 */
	void setEvacuationsTactiques(String value);

	/**
	 * Returns the value of the '<em><b>Organisation Regulation Et Transit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation Regulation Et Transit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation Regulation Et Transit</em>' attribute.
	 * @see #setOrganisationRegulationEtTransit(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationEvacuations_OrganisationRegulationEtTransit()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='OrganisationRegulationEtTransit'"
	 * @generated
	 */
	String getOrganisationRegulationEtTransit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationEvacuations#getOrganisationRegulationEtTransit <em>Organisation Regulation Et Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation Regulation Et Transit</em>' attribute.
	 * @see #getOrganisationRegulationEtTransit()
	 * @generated
	 */
	void setOrganisationRegulationEtTransit(String value);

	/**
	 * Returns the value of the '<em><b>Organisation Generale Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation Generale Flux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation Generale Flux</em>' attribute.
	 * @see #setOrganisationGeneraleFlux(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationEvacuations_OrganisationGeneraleFlux()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='OrganisationGeneraleFlux'"
	 * @generated
	 */
	String getOrganisationGeneraleFlux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationEvacuations#getOrganisationGeneraleFlux <em>Organisation Generale Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation Generale Flux</em>' attribute.
	 * @see #getOrganisationGeneraleFlux()
	 * @generated
	 */
	void setOrganisationGeneraleFlux(String value);

	/**
	 * Returns the value of the '<em><b>Evacuations Strategiques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evacuations Strategiques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evacuations Strategiques</em>' attribute.
	 * @see #setEvacuationsStrategiques(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationEvacuations_EvacuationsStrategiques()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='EvacuationsStrategiques'"
	 * @generated
	 */
	String getEvacuationsStrategiques();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationEvacuations#getEvacuationsStrategiques <em>Evacuations Strategiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evacuations Strategiques</em>' attribute.
	 * @see #getEvacuationsStrategiques()
	 * @generated
	 */
	void setEvacuationsStrategiques(String value);

} // TypeOrganisationEvacuations
