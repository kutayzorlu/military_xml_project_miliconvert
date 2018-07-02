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
 * A representation of the model object '<em><b>Type Type Mission Aerienne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeMissionAerienne#getTypeMissionAerienne <em>Type Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMissionAerienne#getAutreTypeMissionAerienne <em>Autre Type Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMissionAerienne#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMissionAerienne#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeMissionAerienne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TypeMissionAerienne' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeMissionAerienne extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Mission Aerienne</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission Aerienne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission Aerienne</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne
	 * @see #isSetTypeMissionAerienne()
	 * @see #unsetTypeMissionAerienne()
	 * @see #setTypeMissionAerienne(TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMissionAerienne_TypeMissionAerienne()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMissionAerienne'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne getTypeMissionAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMissionAerienne#getTypeMissionAerienne <em>Type Mission Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission Aerienne</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne
	 * @see #isSetTypeMissionAerienne()
	 * @see #unsetTypeMissionAerienne()
	 * @see #getTypeMissionAerienne()
	 * @generated
	 */
	void setTypeMissionAerienne(TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeMissionAerienne#getTypeMissionAerienne <em>Type Mission Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMissionAerienne()
	 * @see #getTypeMissionAerienne()
	 * @see #setTypeMissionAerienne(TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne)
	 * @generated
	 */
	void unsetTypeMissionAerienne();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeMissionAerienne#getTypeMissionAerienne <em>Type Mission Aerienne</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission Aerienne</em>' attribute is set.
	 * @see #unsetTypeMissionAerienne()
	 * @see #getTypeMissionAerienne()
	 * @see #setTypeMissionAerienne(TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne)
	 * @generated
	 */
	boolean isSetTypeMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Autre Type Mission Aerienne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Mission Aerienne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Mission Aerienne</em>' attribute.
	 * @see #setAutreTypeMissionAerienne(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMissionAerienne_AutreTypeMissionAerienne()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='AutreTypeMissionAerienne'"
	 * @generated
	 */
	String getAutreTypeMissionAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMissionAerienne#getAutreTypeMissionAerienne <em>Autre Type Mission Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type Mission Aerienne</em>' attribute.
	 * @see #getAutreTypeMissionAerienne()
	 * @generated
	 */
	void setAutreTypeMissionAerienne(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeTypeMissionAerienne_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMissionAerienne#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeMissionAerienne_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMissionAerienne#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeTypeMissionAerienne
