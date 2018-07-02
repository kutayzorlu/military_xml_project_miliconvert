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
 * A representation of the model object '<em><b>Type Type Mission I3D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeMissionI3D#getTypeMissionI3DnonRepertorie <em>Type Mission I3 Dnon Repertorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMissionI3D#getTypeMissionI3D <em>Type Mission I3D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeMissionI3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TypeMissionI3D' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeMissionI3D extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Mission I3 Dnon Repertorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission I3 Dnon Repertorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission I3 Dnon Repertorie</em>' attribute.
	 * @see #setTypeMissionI3DnonRepertorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMissionI3D_TypeMissionI3DnonRepertorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeMissionI3DnonRepertorie'"
	 * @generated
	 */
	String getTypeMissionI3DnonRepertorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMissionI3D#getTypeMissionI3DnonRepertorie <em>Type Mission I3 Dnon Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission I3 Dnon Repertorie</em>' attribute.
	 * @see #getTypeMissionI3DnonRepertorie()
	 * @generated
	 */
	void setTypeMissionI3DnonRepertorie(String value);

	/**
	 * Returns the value of the '<em><b>Type Mission I3D</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMissionI3DTypeMissionI3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission I3D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission I3D</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionI3DTypeMissionI3D
	 * @see #isSetTypeMissionI3D()
	 * @see #unsetTypeMissionI3D()
	 * @see #setTypeMissionI3D(TypeDictionaryDicoTypeMissionI3DTypeMissionI3D)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMissionI3D_TypeMissionI3D()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeMissionI3D'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMissionI3DTypeMissionI3D getTypeMissionI3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMissionI3D#getTypeMissionI3D <em>Type Mission I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission I3D</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionI3DTypeMissionI3D
	 * @see #isSetTypeMissionI3D()
	 * @see #unsetTypeMissionI3D()
	 * @see #getTypeMissionI3D()
	 * @generated
	 */
	void setTypeMissionI3D(TypeDictionaryDicoTypeMissionI3DTypeMissionI3D value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeMissionI3D#getTypeMissionI3D <em>Type Mission I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMissionI3D()
	 * @see #getTypeMissionI3D()
	 * @see #setTypeMissionI3D(TypeDictionaryDicoTypeMissionI3DTypeMissionI3D)
	 * @generated
	 */
	void unsetTypeMissionI3D();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeMissionI3D#getTypeMissionI3D <em>Type Mission I3D</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission I3D</em>' attribute is set.
	 * @see #unsetTypeMissionI3D()
	 * @see #getTypeMissionI3D()
	 * @see #setTypeMissionI3D(TypeDictionaryDicoTypeMissionI3DTypeMissionI3D)
	 * @generated
	 */
	boolean isSetTypeMissionI3D();

} // TypeTypeMissionI3D
