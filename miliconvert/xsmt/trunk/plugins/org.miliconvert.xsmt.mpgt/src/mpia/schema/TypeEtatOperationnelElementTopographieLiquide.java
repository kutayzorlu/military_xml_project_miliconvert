/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Element Topographie Liquide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getEtatMer <em>Etat Mer</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getEtatSurface <em>Etat Surface</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getDirectionOndes <em>Direction Ondes</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieLiquide()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelElementTopographieLiquide' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelElementTopographieLiquide extends TypeEtatOperationnelElementTopographie {
	/**
	 * Returns the value of the '<em><b>Etat Mer</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Mer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Mer</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer
	 * @see #isSetEtatMer()
	 * @see #unsetEtatMer()
	 * @see #setEtatMer(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieLiquide_EtatMer()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatMer'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer getEtatMer();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getEtatMer <em>Etat Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Mer</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer
	 * @see #isSetEtatMer()
	 * @see #unsetEtatMer()
	 * @see #getEtatMer()
	 * @generated
	 */
	void setEtatMer(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getEtatMer <em>Etat Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatMer()
	 * @see #getEtatMer()
	 * @see #setEtatMer(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer)
	 * @generated
	 */
	void unsetEtatMer();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getEtatMer <em>Etat Mer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Mer</em>' attribute is set.
	 * @see #unsetEtatMer()
	 * @see #getEtatMer()
	 * @see #setEtatMer(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer)
	 * @generated
	 */
	boolean isSetEtatMer();

	/**
	 * Returns the value of the '<em><b>Etat Surface</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Surface</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface
	 * @see #isSetEtatSurface()
	 * @see #unsetEtatSurface()
	 * @see #setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieLiquide_EtatSurface()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatSurface'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface getEtatSurface();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getEtatSurface <em>Etat Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Surface</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface
	 * @see #isSetEtatSurface()
	 * @see #unsetEtatSurface()
	 * @see #getEtatSurface()
	 * @generated
	 */
	void setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getEtatSurface <em>Etat Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatSurface()
	 * @see #getEtatSurface()
	 * @see #setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface)
	 * @generated
	 */
	void unsetEtatSurface();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getEtatSurface <em>Etat Surface</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Surface</em>' attribute is set.
	 * @see #unsetEtatSurface()
	 * @see #getEtatSurface()
	 * @see #setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface)
	 * @generated
	 */
	boolean isSetEtatSurface();

	/**
	 * Returns the value of the '<em><b>Direction Ondes</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Ondes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Ondes</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirection
	 * @see #isSetDirectionOndes()
	 * @see #unsetDirectionOndes()
	 * @see #setDirectionOndes(TypeDictionaryDicoDirection)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieLiquide_DirectionOndes()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DirectionOndes'"
	 * @generated
	 */
	TypeDictionaryDicoDirection getDirectionOndes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getDirectionOndes <em>Direction Ondes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Ondes</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirection
	 * @see #isSetDirectionOndes()
	 * @see #unsetDirectionOndes()
	 * @see #getDirectionOndes()
	 * @generated
	 */
	void setDirectionOndes(TypeDictionaryDicoDirection value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getDirectionOndes <em>Direction Ondes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectionOndes()
	 * @see #getDirectionOndes()
	 * @see #setDirectionOndes(TypeDictionaryDicoDirection)
	 * @generated
	 */
	void unsetDirectionOndes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieLiquide#getDirectionOndes <em>Direction Ondes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction Ondes</em>' attribute is set.
	 * @see #unsetDirectionOndes()
	 * @see #getDirectionOndes()
	 * @see #setDirectionOndes(TypeDictionaryDicoDirection)
	 * @generated
	 */
	boolean isSetDirectionOndes();

} // TypeEtatOperationnelElementTopographieLiquide
