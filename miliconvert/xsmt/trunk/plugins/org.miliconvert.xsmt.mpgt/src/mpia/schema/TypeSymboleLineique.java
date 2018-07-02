/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Symbole Lineique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSymboleLineique#getTypeLineique <em>Type Lineique</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleLineique#getStyleTrait <em>Style Trait</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleLineique#getEpaisseurTrait <em>Epaisseur Trait</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSymboleLineique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SymboleLineique' kind='elementOnly'"
 * @generated
 */
public interface TypeSymboleLineique extends TypeSymboleLibre {
	/**
	 * Returns the value of the '<em><b>Type Lineique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeLineique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Lineique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Lineique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeLineique
	 * @see #isSetTypeLineique()
	 * @see #unsetTypeLineique()
	 * @see #setTypeLineique(TypeDictionaryDicoTypeLineique)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleLineique_TypeLineique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeLineique'"
	 * @generated
	 */
	TypeDictionaryDicoTypeLineique getTypeLineique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleLineique#getTypeLineique <em>Type Lineique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Lineique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeLineique
	 * @see #isSetTypeLineique()
	 * @see #unsetTypeLineique()
	 * @see #getTypeLineique()
	 * @generated
	 */
	void setTypeLineique(TypeDictionaryDicoTypeLineique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleLineique#getTypeLineique <em>Type Lineique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeLineique()
	 * @see #getTypeLineique()
	 * @see #setTypeLineique(TypeDictionaryDicoTypeLineique)
	 * @generated
	 */
	void unsetTypeLineique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleLineique#getTypeLineique <em>Type Lineique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Lineique</em>' attribute is set.
	 * @see #unsetTypeLineique()
	 * @see #getTypeLineique()
	 * @see #setTypeLineique(TypeDictionaryDicoTypeLineique)
	 * @generated
	 */
	boolean isSetTypeLineique();

	/**
	 * Returns the value of the '<em><b>Style Trait</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoStyleTraitEtendu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Trait</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Trait</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoStyleTraitEtendu
	 * @see #isSetStyleTrait()
	 * @see #unsetStyleTrait()
	 * @see #setStyleTrait(TypeDictionaryDicoStyleTraitEtendu)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleLineique_StyleTrait()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StyleTrait'"
	 * @generated
	 */
	TypeDictionaryDicoStyleTraitEtendu getStyleTrait();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleLineique#getStyleTrait <em>Style Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Trait</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoStyleTraitEtendu
	 * @see #isSetStyleTrait()
	 * @see #unsetStyleTrait()
	 * @see #getStyleTrait()
	 * @generated
	 */
	void setStyleTrait(TypeDictionaryDicoStyleTraitEtendu value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleLineique#getStyleTrait <em>Style Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyleTrait()
	 * @see #getStyleTrait()
	 * @see #setStyleTrait(TypeDictionaryDicoStyleTraitEtendu)
	 * @generated
	 */
	void unsetStyleTrait();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleLineique#getStyleTrait <em>Style Trait</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style Trait</em>' attribute is set.
	 * @see #unsetStyleTrait()
	 * @see #getStyleTrait()
	 * @see #setStyleTrait(TypeDictionaryDicoStyleTraitEtendu)
	 * @generated
	 */
	boolean isSetStyleTrait();

	/**
	 * Returns the value of the '<em><b>Epaisseur Trait</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEpaisseurTrait}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epaisseur Trait</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epaisseur Trait</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEpaisseurTrait
	 * @see #isSetEpaisseurTrait()
	 * @see #unsetEpaisseurTrait()
	 * @see #setEpaisseurTrait(TypeDictionaryDicoEpaisseurTrait)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleLineique_EpaisseurTrait()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EpaisseurTrait'"
	 * @generated
	 */
	TypeDictionaryDicoEpaisseurTrait getEpaisseurTrait();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleLineique#getEpaisseurTrait <em>Epaisseur Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epaisseur Trait</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEpaisseurTrait
	 * @see #isSetEpaisseurTrait()
	 * @see #unsetEpaisseurTrait()
	 * @see #getEpaisseurTrait()
	 * @generated
	 */
	void setEpaisseurTrait(TypeDictionaryDicoEpaisseurTrait value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleLineique#getEpaisseurTrait <em>Epaisseur Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEpaisseurTrait()
	 * @see #getEpaisseurTrait()
	 * @see #setEpaisseurTrait(TypeDictionaryDicoEpaisseurTrait)
	 * @generated
	 */
	void unsetEpaisseurTrait();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleLineique#getEpaisseurTrait <em>Epaisseur Trait</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Epaisseur Trait</em>' attribute is set.
	 * @see #unsetEpaisseurTrait()
	 * @see #getEpaisseurTrait()
	 * @see #setEpaisseurTrait(TypeDictionaryDicoEpaisseurTrait)
	 * @generated
	 */
	boolean isSetEpaisseurTrait();

} // TypeSymboleLineique
