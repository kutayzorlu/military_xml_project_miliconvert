/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Duree Intervention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDureeIntervention#getMomentDeLAction <em>Moment De LAction</em>}</li>
 *   <li>{@link mpia.schema.TypeDureeIntervention#getDureeMaxNTI1 <em>Duree Max NTI1</em>}</li>
 *   <li>{@link mpia.schema.TypeDureeIntervention#getDureeMaxNTI2 <em>Duree Max NTI2</em>}</li>
 *   <li>{@link mpia.schema.TypeDureeIntervention#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDureeIntervention#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDureeIntervention()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DureeIntervention' kind='elementOnly'"
 * @generated
 */
public interface TypeDureeIntervention extends EObject {
	/**
	 * Returns the value of the '<em><b>Moment De LAction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment De LAction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment De LAction</em>' attribute.
	 * @see #setMomentDeLAction(String)
	 * @see mpia.schema.SchemaPackage#getTypeDureeIntervention_MomentDeLAction()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        extendedMetaData="kind='element' name='MomentDeLAction'"
	 * @generated
	 */
	String getMomentDeLAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDureeIntervention#getMomentDeLAction <em>Moment De LAction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment De LAction</em>' attribute.
	 * @see #getMomentDeLAction()
	 * @generated
	 */
	void setMomentDeLAction(String value);

	/**
	 * Returns the value of the '<em><b>Duree Max NTI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Max NTI1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Max NTI1</em>' containment reference.
	 * @see #setDureeMaxNTI1(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeDureeIntervention_DureeMaxNTI1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeMaxNTI1'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeMaxNTI1();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDureeIntervention#getDureeMaxNTI1 <em>Duree Max NTI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Max NTI1</em>' containment reference.
	 * @see #getDureeMaxNTI1()
	 * @generated
	 */
	void setDureeMaxNTI1(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Duree Max NTI2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Max NTI2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Max NTI2</em>' containment reference.
	 * @see #setDureeMaxNTI2(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeDureeIntervention_DureeMaxNTI2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeMaxNTI2'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeMaxNTI2();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDureeIntervention#getDureeMaxNTI2 <em>Duree Max NTI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Max NTI2</em>' containment reference.
	 * @see #getDureeMaxNTI2()
	 * @generated
	 */
	void setDureeMaxNTI2(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDureeIntervention_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDureeIntervention#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDureeIntervention_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDureeIntervention#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeDureeIntervention
