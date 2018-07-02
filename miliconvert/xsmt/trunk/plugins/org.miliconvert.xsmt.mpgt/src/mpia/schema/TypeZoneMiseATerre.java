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
 * A representation of the model object '<em><b>Type Zone Mise ATerre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneMiseATerre#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneMiseATerre#getAxeApproche <em>Axe Approche</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneMiseATerre#getAxeLargage <em>Axe Largage</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneMiseATerre#getPenetrometrie <em>Penetrometrie</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneMiseATerre#getHomologation <em>Homologation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneMiseATerre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ZoneMiseATerre' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneMiseATerre extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeZoneMiseATerre_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Orientation'"
	 * @generated
	 */
	TypeDataTypeAngle getOrientation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneMiseATerre#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Axe Approche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axe Approche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axe Approche</em>' containment reference.
	 * @see #setAxeApproche(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeZoneMiseATerre_AxeApproche()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AxeApproche'"
	 * @generated
	 */
	TypeDataTypeAngle getAxeApproche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneMiseATerre#getAxeApproche <em>Axe Approche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axe Approche</em>' containment reference.
	 * @see #getAxeApproche()
	 * @generated
	 */
	void setAxeApproche(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Axe Largage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axe Largage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axe Largage</em>' containment reference.
	 * @see #setAxeLargage(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeZoneMiseATerre_AxeLargage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AxeLargage'"
	 * @generated
	 */
	TypeDataTypeAngle getAxeLargage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneMiseATerre#getAxeLargage <em>Axe Largage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axe Largage</em>' containment reference.
	 * @see #getAxeLargage()
	 * @generated
	 */
	void setAxeLargage(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Penetrometrie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penetrometrie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penetrometrie</em>' attribute.
	 * @see #isSetPenetrometrie()
	 * @see #unsetPenetrometrie()
	 * @see #setPenetrometrie(long)
	 * @see mpia.schema.SchemaPackage#getTypeZoneMiseATerre_Penetrometrie()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='Penetrometrie'"
	 * @generated
	 */
	long getPenetrometrie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneMiseATerre#getPenetrometrie <em>Penetrometrie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penetrometrie</em>' attribute.
	 * @see #isSetPenetrometrie()
	 * @see #unsetPenetrometrie()
	 * @see #getPenetrometrie()
	 * @generated
	 */
	void setPenetrometrie(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneMiseATerre#getPenetrometrie <em>Penetrometrie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPenetrometrie()
	 * @see #getPenetrometrie()
	 * @see #setPenetrometrie(long)
	 * @generated
	 */
	void unsetPenetrometrie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneMiseATerre#getPenetrometrie <em>Penetrometrie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Penetrometrie</em>' attribute is set.
	 * @see #unsetPenetrometrie()
	 * @see #getPenetrometrie()
	 * @see #setPenetrometrie(long)
	 * @generated
	 */
	boolean isSetPenetrometrie();

	/**
	 * Returns the value of the '<em><b>Homologation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneMiseTerreHomologation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Homologation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homologation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneMiseTerreHomologation
	 * @see #isSetHomologation()
	 * @see #unsetHomologation()
	 * @see #setHomologation(TypeDictionaryDicoZoneMiseTerreHomologation)
	 * @see mpia.schema.SchemaPackage#getTypeZoneMiseATerre_Homologation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Homologation'"
	 * @generated
	 */
	TypeDictionaryDicoZoneMiseTerreHomologation getHomologation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneMiseATerre#getHomologation <em>Homologation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homologation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneMiseTerreHomologation
	 * @see #isSetHomologation()
	 * @see #unsetHomologation()
	 * @see #getHomologation()
	 * @generated
	 */
	void setHomologation(TypeDictionaryDicoZoneMiseTerreHomologation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneMiseATerre#getHomologation <em>Homologation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHomologation()
	 * @see #getHomologation()
	 * @see #setHomologation(TypeDictionaryDicoZoneMiseTerreHomologation)
	 * @generated
	 */
	void unsetHomologation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneMiseATerre#getHomologation <em>Homologation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Homologation</em>' attribute is set.
	 * @see #unsetHomologation()
	 * @see #getHomologation()
	 * @see #setHomologation(TypeDictionaryDicoZoneMiseTerreHomologation)
	 * @generated
	 */
	boolean isSetHomologation();

} // TypeZoneMiseATerre
