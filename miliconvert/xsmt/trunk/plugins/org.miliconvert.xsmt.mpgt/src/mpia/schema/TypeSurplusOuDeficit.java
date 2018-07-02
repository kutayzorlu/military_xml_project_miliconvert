/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Surplus Ou Deficit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSurplusOuDeficit#getActionsPrises <em>Actions Prises</em>}</li>
 *   <li>{@link mpia.schema.TypeSurplusOuDeficit#getActionsDemandees <em>Actions Demandees</em>}</li>
 *   <li>{@link mpia.schema.TypeSurplusOuDeficit#getDateDebutEffet <em>Date Debut Effet</em>}</li>
 *   <li>{@link mpia.schema.TypeSurplusOuDeficit#getNiveauEffet <em>Niveau Effet</em>}</li>
 *   <li>{@link mpia.schema.TypeSurplusOuDeficit#getEffetOperationnelDeficits <em>Effet Operationnel Deficits</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSurplusOuDeficit()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SurplusOuDeficit' kind='elementOnly'"
 * @generated
 */
public interface TypeSurplusOuDeficit extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions Prises</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Prises</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Prises</em>' attribute.
	 * @see #setActionsPrises(String)
	 * @see mpia.schema.SchemaPackage#getTypeSurplusOuDeficit_ActionsPrises()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ActionsPrises'"
	 * @generated
	 */
	String getActionsPrises();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSurplusOuDeficit#getActionsPrises <em>Actions Prises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions Prises</em>' attribute.
	 * @see #getActionsPrises()
	 * @generated
	 */
	void setActionsPrises(String value);

	/**
	 * Returns the value of the '<em><b>Actions Demandees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Demandees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Demandees</em>' attribute.
	 * @see #setActionsDemandees(String)
	 * @see mpia.schema.SchemaPackage#getTypeSurplusOuDeficit_ActionsDemandees()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ActionsDemandees'"
	 * @generated
	 */
	String getActionsDemandees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSurplusOuDeficit#getActionsDemandees <em>Actions Demandees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions Demandees</em>' attribute.
	 * @see #getActionsDemandees()
	 * @generated
	 */
	void setActionsDemandees(String value);

	/**
	 * Returns the value of the '<em><b>Date Debut Effet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Effet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Effet</em>' attribute.
	 * @see #setDateDebutEffet(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSurplusOuDeficit_DateDebutEffet()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebutEffet'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebutEffet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSurplusOuDeficit#getDateDebutEffet <em>Date Debut Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Effet</em>' attribute.
	 * @see #getDateDebutEffet()
	 * @generated
	 */
	void setDateDebutEffet(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Niveau Effet</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSurplusOuDeficitNiveauEffet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Effet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Effet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSurplusOuDeficitNiveauEffet
	 * @see #isSetNiveauEffet()
	 * @see #unsetNiveauEffet()
	 * @see #setNiveauEffet(TypeDictionaryDicoSurplusOuDeficitNiveauEffet)
	 * @see mpia.schema.SchemaPackage#getTypeSurplusOuDeficit_NiveauEffet()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauEffet'"
	 * @generated
	 */
	TypeDictionaryDicoSurplusOuDeficitNiveauEffet getNiveauEffet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSurplusOuDeficit#getNiveauEffet <em>Niveau Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Effet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSurplusOuDeficitNiveauEffet
	 * @see #isSetNiveauEffet()
	 * @see #unsetNiveauEffet()
	 * @see #getNiveauEffet()
	 * @generated
	 */
	void setNiveauEffet(TypeDictionaryDicoSurplusOuDeficitNiveauEffet value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSurplusOuDeficit#getNiveauEffet <em>Niveau Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauEffet()
	 * @see #getNiveauEffet()
	 * @see #setNiveauEffet(TypeDictionaryDicoSurplusOuDeficitNiveauEffet)
	 * @generated
	 */
	void unsetNiveauEffet();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSurplusOuDeficit#getNiveauEffet <em>Niveau Effet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Effet</em>' attribute is set.
	 * @see #unsetNiveauEffet()
	 * @see #getNiveauEffet()
	 * @see #setNiveauEffet(TypeDictionaryDicoSurplusOuDeficitNiveauEffet)
	 * @generated
	 */
	boolean isSetNiveauEffet();

	/**
	 * Returns the value of the '<em><b>Effet Operationnel Deficits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Operationnel Deficits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Operationnel Deficits</em>' attribute.
	 * @see #setEffetOperationnelDeficits(String)
	 * @see mpia.schema.SchemaPackage#getTypeSurplusOuDeficit_EffetOperationnelDeficits()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='EffetOperationnelDeficits'"
	 * @generated
	 */
	String getEffetOperationnelDeficits();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSurplusOuDeficit#getEffetOperationnelDeficits <em>Effet Operationnel Deficits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Operationnel Deficits</em>' attribute.
	 * @see #getEffetOperationnelDeficits()
	 * @generated
	 */
	void setEffetOperationnelDeficits(String value);

} // TypeSurplusOuDeficit
