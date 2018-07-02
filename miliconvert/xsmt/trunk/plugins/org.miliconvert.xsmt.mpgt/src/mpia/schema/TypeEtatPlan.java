/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatPlan#getEtatPreparation <em>Etat Preparation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatPlan#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatPlan#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatPlan#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatPlan#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatPlan()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatPlan' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Etat Preparation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatPlanEtatPreparation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Preparation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Preparation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatPlanEtatPreparation
	 * @see #isSetEtatPreparation()
	 * @see #unsetEtatPreparation()
	 * @see #setEtatPreparation(TypeDictionaryDicoEtatPlanEtatPreparation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatPlan_EtatPreparation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='EtatPreparation'"
	 * @generated
	 */
	TypeDictionaryDicoEtatPlanEtatPreparation getEtatPreparation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatPlan#getEtatPreparation <em>Etat Preparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Preparation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatPlanEtatPreparation
	 * @see #isSetEtatPreparation()
	 * @see #unsetEtatPreparation()
	 * @see #getEtatPreparation()
	 * @generated
	 */
	void setEtatPreparation(TypeDictionaryDicoEtatPlanEtatPreparation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatPlan#getEtatPreparation <em>Etat Preparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatPreparation()
	 * @see #getEtatPreparation()
	 * @see #setEtatPreparation(TypeDictionaryDicoEtatPlanEtatPreparation)
	 * @generated
	 */
	void unsetEtatPreparation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatPlan#getEtatPreparation <em>Etat Preparation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Preparation</em>' attribute is set.
	 * @see #unsetEtatPreparation()
	 * @see #getEtatPreparation()
	 * @see #setEtatPreparation(TypeDictionaryDicoEtatPlanEtatPreparation)
	 * @generated
	 */
	boolean isSetEtatPreparation();

	/**
	 * Returns the value of the '<em><b>Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatPlanEtat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatPlanEtat
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #setEtat(TypeDictionaryDicoEtatPlanEtat)
	 * @see mpia.schema.SchemaPackage#getTypeEtatPlan_Etat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Etat'"
	 * @generated
	 */
	TypeDictionaryDicoEtatPlanEtat getEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatPlan#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatPlanEtat
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(TypeDictionaryDicoEtatPlanEtat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatPlan#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoEtatPlanEtat)
	 * @generated
	 */
	void unsetEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatPlan#getEtat <em>Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat</em>' attribute is set.
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoEtatPlanEtat)
	 * @generated
	 */
	boolean isSetEtat();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEtatPlan_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Date'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatPlan#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(TypeDataTypeDateHeure value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatPlan_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatPlan#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatPlan_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatPlan#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEtatPlan
