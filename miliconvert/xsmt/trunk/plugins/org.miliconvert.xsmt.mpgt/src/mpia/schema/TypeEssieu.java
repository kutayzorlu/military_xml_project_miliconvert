/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Essieu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEssieu#getNumeroEssieu <em>Numero Essieu</em>}</li>
 *   <li>{@link mpia.schema.TypeEssieu#getCharge <em>Charge</em>}</li>
 *   <li>{@link mpia.schema.TypeEssieu#getEmpattement <em>Empattement</em>}</li>
 *   <li>{@link mpia.schema.TypeEssieu#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEssieu#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEssieu()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Essieu' kind='elementOnly'"
 * @generated
 */
public interface TypeEssieu extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Essieu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Essieu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Essieu</em>' attribute.
	 * @see #isSetNumeroEssieu()
	 * @see #unsetNumeroEssieu()
	 * @see #setNumeroEssieu(long)
	 * @see mpia.schema.SchemaPackage#getTypeEssieu_NumeroEssieu()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NumeroEssieu'"
	 * @generated
	 */
	long getNumeroEssieu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEssieu#getNumeroEssieu <em>Numero Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Essieu</em>' attribute.
	 * @see #isSetNumeroEssieu()
	 * @see #unsetNumeroEssieu()
	 * @see #getNumeroEssieu()
	 * @generated
	 */
	void setNumeroEssieu(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEssieu#getNumeroEssieu <em>Numero Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroEssieu()
	 * @see #getNumeroEssieu()
	 * @see #setNumeroEssieu(long)
	 * @generated
	 */
	void unsetNumeroEssieu();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEssieu#getNumeroEssieu <em>Numero Essieu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Essieu</em>' attribute is set.
	 * @see #unsetNumeroEssieu()
	 * @see #getNumeroEssieu()
	 * @see #setNumeroEssieu(long)
	 * @generated
	 */
	boolean isSetNumeroEssieu();

	/**
	 * Returns the value of the '<em><b>Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge</em>' attribute.
	 * @see #isSetCharge()
	 * @see #unsetCharge()
	 * @see #setCharge(long)
	 * @see mpia.schema.SchemaPackage#getTypeEssieu_Charge()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='Charge'"
	 * @generated
	 */
	long getCharge();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEssieu#getCharge <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge</em>' attribute.
	 * @see #isSetCharge()
	 * @see #unsetCharge()
	 * @see #getCharge()
	 * @generated
	 */
	void setCharge(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEssieu#getCharge <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCharge()
	 * @see #getCharge()
	 * @see #setCharge(long)
	 * @generated
	 */
	void unsetCharge();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEssieu#getCharge <em>Charge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charge</em>' attribute is set.
	 * @see #unsetCharge()
	 * @see #getCharge()
	 * @see #setCharge(long)
	 * @generated
	 */
	boolean isSetCharge();

	/**
	 * Returns the value of the '<em><b>Empattement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empattement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empattement</em>' containment reference.
	 * @see #setEmpattement(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeEssieu_Empattement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Empattement'"
	 * @generated
	 */
	TypeDataTypeLongueur getEmpattement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEssieu#getEmpattement <em>Empattement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empattement</em>' containment reference.
	 * @see #getEmpattement()
	 * @generated
	 */
	void setEmpattement(TypeDataTypeLongueur value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEssieu_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEssieu#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEssieu_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEssieu#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEssieu
