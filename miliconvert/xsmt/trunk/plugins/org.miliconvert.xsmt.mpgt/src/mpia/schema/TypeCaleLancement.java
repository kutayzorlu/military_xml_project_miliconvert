/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Cale Lancement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaleLancement#getAngle <em>Angle</em>}</li>
 *   <li>{@link mpia.schema.TypeCaleLancement#getCaracteresSpecifiques <em>Caracteres Specifiques</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaleLancement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CaleLancement' kind='elementOnly'"
 * @generated
 */
public interface TypeCaleLancement extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeCaleLancement_Angle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Angle'"
	 * @generated
	 */
	TypeDataTypeAngle getAngle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaleLancement#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Caracteres Specifiques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteres Specifiques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteres Specifiques</em>' attribute.
	 * @see #setCaracteresSpecifiques(String)
	 * @see mpia.schema.SchemaPackage#getTypeCaleLancement_CaracteresSpecifiques()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='CaracteresSpecifiques'"
	 * @generated
	 */
	String getCaracteresSpecifiques();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaleLancement#getCaracteresSpecifiques <em>Caracteres Specifiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteres Specifiques</em>' attribute.
	 * @see #getCaracteresSpecifiques()
	 * @generated
	 */
	void setCaracteresSpecifiques(String value);

} // TypeCaleLancement
