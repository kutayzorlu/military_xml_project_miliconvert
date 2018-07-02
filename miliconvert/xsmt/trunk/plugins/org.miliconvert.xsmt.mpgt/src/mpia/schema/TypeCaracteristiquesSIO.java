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
 * A representation of the model object '<em><b>Type Caracteristiques SIO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaracteristiquesSIO#getTypeSIO <em>Type SIO</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesSIO#isPrincipal <em>Principal</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesSIO#getTrigramme <em>Trigramme</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesSIO#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesSIO#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesSIO()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CaracteristiquesSIO' kind='elementOnly'"
 * @generated
 */
public interface TypeCaracteristiquesSIO extends EObject {
	/**
	 * Returns the value of the '<em><b>Type SIO</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCaracteristiquesSIOTypeSIO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type SIO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type SIO</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiquesSIOTypeSIO
	 * @see #isSetTypeSIO()
	 * @see #unsetTypeSIO()
	 * @see #setTypeSIO(TypeDictionaryDicoCaracteristiquesSIOTypeSIO)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesSIO_TypeSIO()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeSIO'"
	 * @generated
	 */
	TypeDictionaryDicoCaracteristiquesSIOTypeSIO getTypeSIO();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesSIO#getTypeSIO <em>Type SIO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type SIO</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiquesSIOTypeSIO
	 * @see #isSetTypeSIO()
	 * @see #unsetTypeSIO()
	 * @see #getTypeSIO()
	 * @generated
	 */
	void setTypeSIO(TypeDictionaryDicoCaracteristiquesSIOTypeSIO value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesSIO#getTypeSIO <em>Type SIO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeSIO()
	 * @see #getTypeSIO()
	 * @see #setTypeSIO(TypeDictionaryDicoCaracteristiquesSIOTypeSIO)
	 * @generated
	 */
	void unsetTypeSIO();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesSIO#getTypeSIO <em>Type SIO</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type SIO</em>' attribute is set.
	 * @see #unsetTypeSIO()
	 * @see #getTypeSIO()
	 * @see #setTypeSIO(TypeDictionaryDicoCaracteristiquesSIOTypeSIO)
	 * @generated
	 */
	boolean isSetTypeSIO();

	/**
	 * Returns the value of the '<em><b>Principal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principal</em>' attribute.
	 * @see #isSetPrincipal()
	 * @see #unsetPrincipal()
	 * @see #setPrincipal(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesSIO_Principal()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Principal'"
	 * @generated
	 */
	boolean isPrincipal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesSIO#isPrincipal <em>Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal</em>' attribute.
	 * @see #isSetPrincipal()
	 * @see #unsetPrincipal()
	 * @see #isPrincipal()
	 * @generated
	 */
	void setPrincipal(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesSIO#isPrincipal <em>Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrincipal()
	 * @see #isPrincipal()
	 * @see #setPrincipal(boolean)
	 * @generated
	 */
	void unsetPrincipal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesSIO#isPrincipal <em>Principal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Principal</em>' attribute is set.
	 * @see #unsetPrincipal()
	 * @see #isPrincipal()
	 * @see #setPrincipal(boolean)
	 * @generated
	 */
	boolean isSetPrincipal();

	/**
	 * Returns the value of the '<em><b>Trigramme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigramme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigramme</em>' attribute.
	 * @see #setTrigramme(String)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesSIO_Trigramme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='Trigramme'"
	 * @generated
	 */
	String getTrigramme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesSIO#getTrigramme <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigramme</em>' attribute.
	 * @see #getTrigramme()
	 * @generated
	 */
	void setTrigramme(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesSIO_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesSIO#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesSIO_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesSIO#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeCaracteristiquesSIO
