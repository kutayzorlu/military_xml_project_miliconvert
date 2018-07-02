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
 * A representation of the model object '<em><b>Type Vehicule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVehicule#getNumeroImmatriculation <em>Numero Immatriculation</em>}</li>
 *   <li>{@link mpia.schema.TypeVehicule#getAPourSituationSituationVehicule <em>APour Situation Situation Vehicule</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVehicule()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Vehicule' kind='elementOnly'"
 * @generated
 */
public interface TypeVehicule extends TypeMateriel {
	/**
	 * Returns the value of the '<em><b>Numero Immatriculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Immatriculation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Immatriculation</em>' attribute.
	 * @see #setNumeroImmatriculation(String)
	 * @see mpia.schema.SchemaPackage#getTypeVehicule_NumeroImmatriculation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroImmatriculation'"
	 * @generated
	 */
	String getNumeroImmatriculation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVehicule#getNumeroImmatriculation <em>Numero Immatriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Immatriculation</em>' attribute.
	 * @see #getNumeroImmatriculation()
	 * @generated
	 */
	void setNumeroImmatriculation(String value);

	/**
	 * Returns the value of the '<em><b>APour Situation Situation Vehicule</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Situation Situation Vehicule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Situation Situation Vehicule</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeVehicule_APourSituationSituationVehicule()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_Vehicule' target_entity='type_SituationVehicule'"
	 *        extendedMetaData="kind='element' name='APourSituation_SituationVehicule'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourSituationSituationVehicule();

} // TypeVehicule
