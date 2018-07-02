/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Effet Au Contact ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEffetAuContactASS#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetAuContactASS#getAutreType <em>Autre Type</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetAuContactASS#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetAuContactASS#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetAuContactASS#getAppuieUnite <em>Appuie Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEffetAuContactASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EffetAuContactASS' kind='elementOnly'"
 * @generated
 */
public interface TypeEffetAuContactASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @see mpia.schema.SchemaPackage#getTypeEffetAuContactASS_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoEffetTactiqueRecherche getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetAuContactASS#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoEffetTactiqueRecherche value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffetAuContactASS#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffetAuContactASS#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Autre Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type</em>' attribute.
	 * @see #setAutreType(String)
	 * @see mpia.schema.SchemaPackage#getTypeEffetAuContactASS_AutreType()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreType'"
	 * @generated
	 */
	String getAutreType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetAuContactASS#getAutreType <em>Autre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type</em>' attribute.
	 * @see #getAutreType()
	 * @generated
	 */
	void setAutreType(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEffetAuContactASS_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetAuContactASS#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEffetAuContactASS_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetAuContactASS#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Appuie Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appuie Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appuie Unite</em>' containment reference.
	 * @see #setAppuieUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeEffetAuContactASS_AppuieUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='Appuie_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAppuieUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetAuContactASS#getAppuieUnite <em>Appuie Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appuie Unite</em>' containment reference.
	 * @see #getAppuieUnite()
	 * @generated
	 */
	void setAppuieUnite(TypeAssociationEXT value);

} // TypeEffetAuContactASS
