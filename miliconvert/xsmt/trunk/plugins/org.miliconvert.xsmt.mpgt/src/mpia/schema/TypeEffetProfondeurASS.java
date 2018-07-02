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
 * A representation of the model object '<em><b>Type Effet Profondeur ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEffetProfondeurASS#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetProfondeurASS#getAutreType <em>Autre Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEffetProfondeurASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EffetProfondeurASS' kind='elementOnly'"
 * @generated
 */
public interface TypeEffetProfondeurASS extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeEffetProfondeurASS_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoEffetTactiqueRecherche getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetProfondeurASS#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeEffetProfondeurASS#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffetProfondeurASS#getType <em>Type</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeEffetProfondeurASS_AutreType()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreType'"
	 * @generated
	 */
	String getAutreType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetProfondeurASS#getAutreType <em>Autre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type</em>' attribute.
	 * @see #getAutreType()
	 * @generated
	 */
	void setAutreType(String value);

} // TypeEffetProfondeurASS
