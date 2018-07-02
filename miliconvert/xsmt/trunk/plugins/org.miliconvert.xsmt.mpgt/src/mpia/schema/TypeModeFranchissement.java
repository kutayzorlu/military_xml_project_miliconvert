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
 * A representation of the model object '<em><b>Type Mode Franchissement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModeFranchissement#getModeFranchissement <em>Mode Franchissement</em>}</li>
 *   <li>{@link mpia.schema.TypeModeFranchissement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeModeFranchissement#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModeFranchissement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModeFranchissement' kind='elementOnly'"
 * @generated
 */
public interface TypeModeFranchissement extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode Franchissement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModeFranchissement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Franchissement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Franchissement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeFranchissement
	 * @see #isSetModeFranchissement()
	 * @see #unsetModeFranchissement()
	 * @see #setModeFranchissement(TypeDictionaryDicoModeFranchissement)
	 * @see mpia.schema.SchemaPackage#getTypeModeFranchissement_ModeFranchissement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeFranchissement'"
	 * @generated
	 */
	TypeDictionaryDicoModeFranchissement getModeFranchissement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModeFranchissement#getModeFranchissement <em>Mode Franchissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Franchissement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeFranchissement
	 * @see #isSetModeFranchissement()
	 * @see #unsetModeFranchissement()
	 * @see #getModeFranchissement()
	 * @generated
	 */
	void setModeFranchissement(TypeDictionaryDicoModeFranchissement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModeFranchissement#getModeFranchissement <em>Mode Franchissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeFranchissement()
	 * @see #getModeFranchissement()
	 * @see #setModeFranchissement(TypeDictionaryDicoModeFranchissement)
	 * @generated
	 */
	void unsetModeFranchissement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModeFranchissement#getModeFranchissement <em>Mode Franchissement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Franchissement</em>' attribute is set.
	 * @see #unsetModeFranchissement()
	 * @see #getModeFranchissement()
	 * @see #setModeFranchissement(TypeDictionaryDicoModeFranchissement)
	 * @generated
	 */
	boolean isSetModeFranchissement();

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
	 * @see mpia.schema.SchemaPackage#getTypeModeFranchissement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModeFranchissement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeModeFranchissement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModeFranchissement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeModeFranchissement
