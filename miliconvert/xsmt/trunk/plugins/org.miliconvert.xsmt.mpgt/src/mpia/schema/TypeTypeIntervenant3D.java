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
 * A representation of the model object '<em><b>Type Type Intervenant3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeIntervenant3D#getTypeIntervenant3D <em>Type Intervenant3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeIntervenant3D#getAutreTypeIntervenant3D <em>Autre Type Intervenant3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeIntervenant3D#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeIntervenant3D#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeIntervenant3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TypeIntervenant3D' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeIntervenant3D extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Intervenant3 D</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeIntervenant3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Intervenant3 D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Intervenant3 D</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeIntervenant3D
	 * @see #isSetTypeIntervenant3D()
	 * @see #unsetTypeIntervenant3D()
	 * @see #setTypeIntervenant3D(TypeDictionaryDicoTypeIntervenant3D)
	 * @see mpia.schema.SchemaPackage#getTypeTypeIntervenant3D_TypeIntervenant3D()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeIntervenant3D'"
	 * @generated
	 */
	TypeDictionaryDicoTypeIntervenant3D getTypeIntervenant3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeIntervenant3D#getTypeIntervenant3D <em>Type Intervenant3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Intervenant3 D</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeIntervenant3D
	 * @see #isSetTypeIntervenant3D()
	 * @see #unsetTypeIntervenant3D()
	 * @see #getTypeIntervenant3D()
	 * @generated
	 */
	void setTypeIntervenant3D(TypeDictionaryDicoTypeIntervenant3D value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeIntervenant3D#getTypeIntervenant3D <em>Type Intervenant3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeIntervenant3D()
	 * @see #getTypeIntervenant3D()
	 * @see #setTypeIntervenant3D(TypeDictionaryDicoTypeIntervenant3D)
	 * @generated
	 */
	void unsetTypeIntervenant3D();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeIntervenant3D#getTypeIntervenant3D <em>Type Intervenant3 D</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Intervenant3 D</em>' attribute is set.
	 * @see #unsetTypeIntervenant3D()
	 * @see #getTypeIntervenant3D()
	 * @see #setTypeIntervenant3D(TypeDictionaryDicoTypeIntervenant3D)
	 * @generated
	 */
	boolean isSetTypeIntervenant3D();

	/**
	 * Returns the value of the '<em><b>Autre Type Intervenant3 D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Intervenant3 D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Intervenant3 D</em>' attribute.
	 * @see #setAutreTypeIntervenant3D(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeIntervenant3D_AutreTypeIntervenant3D()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='AutreTypeIntervenant3D'"
	 * @generated
	 */
	String getAutreTypeIntervenant3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeIntervenant3D#getAutreTypeIntervenant3D <em>Autre Type Intervenant3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type Intervenant3 D</em>' attribute.
	 * @see #getAutreTypeIntervenant3D()
	 * @generated
	 */
	void setAutreTypeIntervenant3D(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeTypeIntervenant3D_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeIntervenant3D#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeIntervenant3D_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeIntervenant3D#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeTypeIntervenant3D
