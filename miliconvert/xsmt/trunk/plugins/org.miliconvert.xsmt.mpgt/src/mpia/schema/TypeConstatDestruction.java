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
 * A representation of the model object '<em><b>Type Constat Destruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConstatDestruction#isDestructionChar <em>Destruction Char</em>}</li>
 *   <li>{@link mpia.schema.TypeConstatDestruction#getNatureForce <em>Nature Force</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConstatDestruction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConstatDestruction' kind='elementOnly'"
 * @generated
 */
public interface TypeConstatDestruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Destruction Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destruction Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destruction Char</em>' attribute.
	 * @see #isSetDestructionChar()
	 * @see #unsetDestructionChar()
	 * @see #setDestructionChar(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeConstatDestruction_DestructionChar()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='DestructionChar'"
	 * @generated
	 */
	boolean isDestructionChar();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConstatDestruction#isDestructionChar <em>Destruction Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destruction Char</em>' attribute.
	 * @see #isSetDestructionChar()
	 * @see #unsetDestructionChar()
	 * @see #isDestructionChar()
	 * @generated
	 */
	void setDestructionChar(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConstatDestruction#isDestructionChar <em>Destruction Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDestructionChar()
	 * @see #isDestructionChar()
	 * @see #setDestructionChar(boolean)
	 * @generated
	 */
	void unsetDestructionChar();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConstatDestruction#isDestructionChar <em>Destruction Char</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Destruction Char</em>' attribute is set.
	 * @see #unsetDestructionChar()
	 * @see #isDestructionChar()
	 * @see #setDestructionChar(boolean)
	 * @generated
	 */
	boolean isSetDestructionChar();

	/**
	 * Returns the value of the '<em><b>Nature Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Force</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Force</em>' attribute.
	 * @see #setNatureForce(String)
	 * @see mpia.schema.SchemaPackage#getTypeConstatDestruction_NatureForce()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='NatureForce'"
	 * @generated
	 */
	String getNatureForce();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConstatDestruction#getNatureForce <em>Nature Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Force</em>' attribute.
	 * @see #getNatureForce()
	 * @generated
	 */
	void setNatureForce(String value);

} // TypeConstatDestruction
