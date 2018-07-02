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
 * A representation of the model object '<em><b>Type Evacuation Patients</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvacuationPatients#getNbPatientsCouches <em>Nb Patients Couches</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationPatients#getNbPatientsAssis <em>Nb Patients Assis</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationPatients#getDestination <em>Destination</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationPatients#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationPatients#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvacuationPatients()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EvacuationPatients' kind='elementOnly'"
 * @generated
 */
public interface TypeEvacuationPatients extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Patients Couches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Patients Couches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Patients Couches</em>' attribute.
	 * @see #isSetNbPatientsCouches()
	 * @see #unsetNbPatientsCouches()
	 * @see #setNbPatientsCouches(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationPatients_NbPatientsCouches()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='NbPatientsCouches'"
	 * @generated
	 */
	long getNbPatientsCouches();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationPatients#getNbPatientsCouches <em>Nb Patients Couches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Patients Couches</em>' attribute.
	 * @see #isSetNbPatientsCouches()
	 * @see #unsetNbPatientsCouches()
	 * @see #getNbPatientsCouches()
	 * @generated
	 */
	void setNbPatientsCouches(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationPatients#getNbPatientsCouches <em>Nb Patients Couches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbPatientsCouches()
	 * @see #getNbPatientsCouches()
	 * @see #setNbPatientsCouches(long)
	 * @generated
	 */
	void unsetNbPatientsCouches();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationPatients#getNbPatientsCouches <em>Nb Patients Couches</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Patients Couches</em>' attribute is set.
	 * @see #unsetNbPatientsCouches()
	 * @see #getNbPatientsCouches()
	 * @see #setNbPatientsCouches(long)
	 * @generated
	 */
	boolean isSetNbPatientsCouches();

	/**
	 * Returns the value of the '<em><b>Nb Patients Assis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Patients Assis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Patients Assis</em>' attribute.
	 * @see #isSetNbPatientsAssis()
	 * @see #unsetNbPatientsAssis()
	 * @see #setNbPatientsAssis(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationPatients_NbPatientsAssis()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='NbPatientsAssis'"
	 * @generated
	 */
	long getNbPatientsAssis();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationPatients#getNbPatientsAssis <em>Nb Patients Assis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Patients Assis</em>' attribute.
	 * @see #isSetNbPatientsAssis()
	 * @see #unsetNbPatientsAssis()
	 * @see #getNbPatientsAssis()
	 * @generated
	 */
	void setNbPatientsAssis(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationPatients#getNbPatientsAssis <em>Nb Patients Assis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbPatientsAssis()
	 * @see #getNbPatientsAssis()
	 * @see #setNbPatientsAssis(long)
	 * @generated
	 */
	void unsetNbPatientsAssis();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationPatients#getNbPatientsAssis <em>Nb Patients Assis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Patients Assis</em>' attribute is set.
	 * @see #unsetNbPatientsAssis()
	 * @see #getNbPatientsAssis()
	 * @see #setNbPatientsAssis(long)
	 * @generated
	 */
	boolean isSetNbPatientsAssis();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEvacuationDestination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvacuationDestination
	 * @see #isSetDestination()
	 * @see #unsetDestination()
	 * @see #setDestination(TypeDictionaryDicoEvacuationDestination)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationPatients_Destination()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Destination'"
	 * @generated
	 */
	TypeDictionaryDicoEvacuationDestination getDestination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationPatients#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvacuationDestination
	 * @see #isSetDestination()
	 * @see #unsetDestination()
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(TypeDictionaryDicoEvacuationDestination value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationPatients#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDestination()
	 * @see #getDestination()
	 * @see #setDestination(TypeDictionaryDicoEvacuationDestination)
	 * @generated
	 */
	void unsetDestination();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationPatients#getDestination <em>Destination</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Destination</em>' attribute is set.
	 * @see #unsetDestination()
	 * @see #getDestination()
	 * @see #setDestination(TypeDictionaryDicoEvacuationDestination)
	 * @generated
	 */
	boolean isSetDestination();

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
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationPatients_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationPatients#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationPatients_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationPatients#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEvacuationPatients
