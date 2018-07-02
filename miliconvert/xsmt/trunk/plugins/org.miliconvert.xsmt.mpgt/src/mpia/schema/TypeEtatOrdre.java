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
 * A representation of the model object '<em><b>Type Etat Ordre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOrdre#getEtatExecution <em>Etat Execution</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOrdre#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOrdre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOrdre#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOrdre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOrdre' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOrdre extends EObject {
	/**
	 * Returns the value of the '<em><b>Etat Execution</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOrdreEtatExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Execution</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOrdreEtatExecution
	 * @see #isSetEtatExecution()
	 * @see #unsetEtatExecution()
	 * @see #setEtatExecution(TypeDictionaryDicoEtatOrdreEtatExecution)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOrdre_EtatExecution()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='EtatExecution'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOrdreEtatExecution getEtatExecution();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOrdre#getEtatExecution <em>Etat Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Execution</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOrdreEtatExecution
	 * @see #isSetEtatExecution()
	 * @see #unsetEtatExecution()
	 * @see #getEtatExecution()
	 * @generated
	 */
	void setEtatExecution(TypeDictionaryDicoEtatOrdreEtatExecution value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOrdre#getEtatExecution <em>Etat Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatExecution()
	 * @see #getEtatExecution()
	 * @see #setEtatExecution(TypeDictionaryDicoEtatOrdreEtatExecution)
	 * @generated
	 */
	void unsetEtatExecution();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOrdre#getEtatExecution <em>Etat Execution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Execution</em>' attribute is set.
	 * @see #unsetEtatExecution()
	 * @see #getEtatExecution()
	 * @see #setEtatExecution(TypeDictionaryDicoEtatOrdreEtatExecution)
	 * @generated
	 */
	boolean isSetEtatExecution();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOrdre_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Date'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOrdre#getDate <em>Date</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOrdre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOrdre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOrdre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOrdre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEtatOrdre
