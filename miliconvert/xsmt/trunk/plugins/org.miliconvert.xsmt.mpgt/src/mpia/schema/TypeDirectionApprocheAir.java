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
 * A representation of the model object '<em><b>Type Direction Approche Air</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDirectionApprocheAir#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectionApprocheAir#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDirectionApprocheAir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DirectionApprocheAir' kind='elementOnly'"
 * @generated
 */
public interface TypeDirectionApprocheAir extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDirectionApprocheAirCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirectionApprocheAirCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDirectionApprocheAirCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeDirectionApprocheAir_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoDirectionApprocheAirCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectionApprocheAir#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirectionApprocheAirCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoDirectionApprocheAirCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDirectionApprocheAir#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDirectionApprocheAirCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDirectionApprocheAir#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDirectionApprocheAirCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeDirectionApprocheAir_Angle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Angle'"
	 * @generated
	 */
	TypeDataTypeAngle getAngle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectionApprocheAir#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(TypeDataTypeAngle value);

} // TypeDirectionApprocheAir
