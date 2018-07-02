/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Mission ALAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreMissionALAT#getTypeMission <em>Type Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreMissionALAT#getAutreTypeMission <em>Autre Type Mission</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreMissionALAT()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreMissionALAT' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreMissionALAT extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Type Mission</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreMissionALATAutreTypeMission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreMissionALATAutreTypeMission
	 * @see #isSetTypeMission()
	 * @see #unsetTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoAutreMissionALATAutreTypeMission)
	 * @see mpia.schema.SchemaPackage#getTypeAutreMissionALAT_TypeMission()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeMission'"
	 * @generated
	 */
	TypeDictionaryDicoAutreMissionALATAutreTypeMission getTypeMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreMissionALAT#getTypeMission <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreMissionALATAutreTypeMission
	 * @see #isSetTypeMission()
	 * @see #unsetTypeMission()
	 * @see #getTypeMission()
	 * @generated
	 */
	void setTypeMission(TypeDictionaryDicoAutreMissionALATAutreTypeMission value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreMissionALAT#getTypeMission <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMission()
	 * @see #getTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoAutreMissionALATAutreTypeMission)
	 * @generated
	 */
	void unsetTypeMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreMissionALAT#getTypeMission <em>Type Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission</em>' attribute is set.
	 * @see #unsetTypeMission()
	 * @see #getTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoAutreMissionALATAutreTypeMission)
	 * @generated
	 */
	boolean isSetTypeMission();

	/**
	 * Returns the value of the '<em><b>Autre Type Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Mission</em>' attribute.
	 * @see #setAutreTypeMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeAutreMissionALAT_AutreTypeMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='AutreTypeMission'"
	 * @generated
	 */
	String getAutreTypeMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreMissionALAT#getAutreTypeMission <em>Autre Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type Mission</em>' attribute.
	 * @see #getAutreTypeMission()
	 * @generated
	 */
	void setAutreTypeMission(String value);

} // TypeAutreMissionALAT
