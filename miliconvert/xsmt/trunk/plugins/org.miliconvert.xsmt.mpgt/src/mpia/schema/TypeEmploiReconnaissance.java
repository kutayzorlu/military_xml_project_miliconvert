/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Emploi Reconnaissance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEmploiReconnaissance#getModeCouverture <em>Mode Couverture</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiReconnaissance#getTypeImagerie <em>Type Imagerie</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiReconnaissance#getTypeCouverture <em>Type Couverture</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEmploiReconnaissance()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EmploiReconnaissance' kind='elementOnly'"
 * @generated
 */
public interface TypeEmploiReconnaissance extends TypeEmploiRessourceActivite {
	/**
	 * Returns the value of the '<em><b>Mode Couverture</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiReconnaissanceModeCouverture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Couverture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Couverture</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiReconnaissanceModeCouverture
	 * @see #isSetModeCouverture()
	 * @see #unsetModeCouverture()
	 * @see #setModeCouverture(TypeDictionaryDicoEmploiReconnaissanceModeCouverture)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiReconnaissance_ModeCouverture()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeCouverture'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiReconnaissanceModeCouverture getModeCouverture();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiReconnaissance#getModeCouverture <em>Mode Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Couverture</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiReconnaissanceModeCouverture
	 * @see #isSetModeCouverture()
	 * @see #unsetModeCouverture()
	 * @see #getModeCouverture()
	 * @generated
	 */
	void setModeCouverture(TypeDictionaryDicoEmploiReconnaissanceModeCouverture value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiReconnaissance#getModeCouverture <em>Mode Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeCouverture()
	 * @see #getModeCouverture()
	 * @see #setModeCouverture(TypeDictionaryDicoEmploiReconnaissanceModeCouverture)
	 * @generated
	 */
	void unsetModeCouverture();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiReconnaissance#getModeCouverture <em>Mode Couverture</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Couverture</em>' attribute is set.
	 * @see #unsetModeCouverture()
	 * @see #getModeCouverture()
	 * @see #setModeCouverture(TypeDictionaryDicoEmploiReconnaissanceModeCouverture)
	 * @generated
	 */
	boolean isSetModeCouverture();

	/**
	 * Returns the value of the '<em><b>Type Imagerie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiReconnaissanceTypeImagerie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Imagerie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Imagerie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiReconnaissanceTypeImagerie
	 * @see #isSetTypeImagerie()
	 * @see #unsetTypeImagerie()
	 * @see #setTypeImagerie(TypeDictionaryDicoEmploiReconnaissanceTypeImagerie)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiReconnaissance_TypeImagerie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeImagerie'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiReconnaissanceTypeImagerie getTypeImagerie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiReconnaissance#getTypeImagerie <em>Type Imagerie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Imagerie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiReconnaissanceTypeImagerie
	 * @see #isSetTypeImagerie()
	 * @see #unsetTypeImagerie()
	 * @see #getTypeImagerie()
	 * @generated
	 */
	void setTypeImagerie(TypeDictionaryDicoEmploiReconnaissanceTypeImagerie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiReconnaissance#getTypeImagerie <em>Type Imagerie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeImagerie()
	 * @see #getTypeImagerie()
	 * @see #setTypeImagerie(TypeDictionaryDicoEmploiReconnaissanceTypeImagerie)
	 * @generated
	 */
	void unsetTypeImagerie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiReconnaissance#getTypeImagerie <em>Type Imagerie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Imagerie</em>' attribute is set.
	 * @see #unsetTypeImagerie()
	 * @see #getTypeImagerie()
	 * @see #setTypeImagerie(TypeDictionaryDicoEmploiReconnaissanceTypeImagerie)
	 * @generated
	 */
	boolean isSetTypeImagerie();

	/**
	 * Returns the value of the '<em><b>Type Couverture</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiReconnaissanceTypeCouverture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Couverture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Couverture</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiReconnaissanceTypeCouverture
	 * @see #isSetTypeCouverture()
	 * @see #unsetTypeCouverture()
	 * @see #setTypeCouverture(TypeDictionaryDicoEmploiReconnaissanceTypeCouverture)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiReconnaissance_TypeCouverture()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeCouverture'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiReconnaissanceTypeCouverture getTypeCouverture();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiReconnaissance#getTypeCouverture <em>Type Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Couverture</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiReconnaissanceTypeCouverture
	 * @see #isSetTypeCouverture()
	 * @see #unsetTypeCouverture()
	 * @see #getTypeCouverture()
	 * @generated
	 */
	void setTypeCouverture(TypeDictionaryDicoEmploiReconnaissanceTypeCouverture value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiReconnaissance#getTypeCouverture <em>Type Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCouverture()
	 * @see #getTypeCouverture()
	 * @see #setTypeCouverture(TypeDictionaryDicoEmploiReconnaissanceTypeCouverture)
	 * @generated
	 */
	void unsetTypeCouverture();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiReconnaissance#getTypeCouverture <em>Type Couverture</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Couverture</em>' attribute is set.
	 * @see #unsetTypeCouverture()
	 * @see #getTypeCouverture()
	 * @see #setTypeCouverture(TypeDictionaryDicoEmploiReconnaissanceTypeCouverture)
	 * @generated
	 */
	boolean isSetTypeCouverture();

} // TypeEmploiReconnaissance
