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
 * A representation of the model object '<em><b>Type Langue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLangue#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeLangue#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeLangue#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLangue()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Langue' kind='elementOnly'"
 * @generated
 */
public interface TypeLangue extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLangue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLangue
	 * @see #isSetNom()
	 * @see #unsetNom()
	 * @see #setNom(TypeDictionaryDicoLangue)
	 * @see mpia.schema.SchemaPackage#getTypeLangue_Nom()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	TypeDictionaryDicoLangue getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLangue#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLangue
	 * @see #isSetNom()
	 * @see #unsetNom()
	 * @see #getNom()
	 * @generated
	 */
	void setNom(TypeDictionaryDicoLangue value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLangue#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNom()
	 * @see #getNom()
	 * @see #setNom(TypeDictionaryDicoLangue)
	 * @generated
	 */
	void unsetNom();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLangue#getNom <em>Nom</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nom</em>' attribute is set.
	 * @see #unsetNom()
	 * @see #getNom()
	 * @see #setNom(TypeDictionaryDicoLangue)
	 * @generated
	 */
	boolean isSetNom();

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
	 * @see mpia.schema.SchemaPackage#getTypeLangue_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLangue#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeLangue_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLangue#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeLangue
