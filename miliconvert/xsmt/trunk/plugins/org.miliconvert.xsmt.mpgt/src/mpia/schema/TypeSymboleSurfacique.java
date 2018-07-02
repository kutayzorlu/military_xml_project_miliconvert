/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Symbole Surfacique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSymboleSurfacique#getTypeSymbole <em>Type Symbole</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleSurfacique#getStyleTrait <em>Style Trait</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleSurfacique#getEpaisseurTrait <em>Epaisseur Trait</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleSurfacique#getRemplissage <em>Remplissage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSymboleSurfacique()
 * @model abstract="true"
 *        extendedMetaData="name='type_SymboleSurfacique' kind='elementOnly'"
 * @generated
 */
public interface TypeSymboleSurfacique extends TypeSymboleLibre {
	/**
	 * Returns the value of the '<em><b>Type Symbole</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeSurfacique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Symbole</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Symbole</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSurfacique
	 * @see #isSetTypeSymbole()
	 * @see #unsetTypeSymbole()
	 * @see #setTypeSymbole(TypeDictionaryDicoTypeSurfacique)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleSurfacique_TypeSymbole()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeSymbole'"
	 * @generated
	 */
	TypeDictionaryDicoTypeSurfacique getTypeSymbole();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleSurfacique#getTypeSymbole <em>Type Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Symbole</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSurfacique
	 * @see #isSetTypeSymbole()
	 * @see #unsetTypeSymbole()
	 * @see #getTypeSymbole()
	 * @generated
	 */
	void setTypeSymbole(TypeDictionaryDicoTypeSurfacique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleSurfacique#getTypeSymbole <em>Type Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeSymbole()
	 * @see #getTypeSymbole()
	 * @see #setTypeSymbole(TypeDictionaryDicoTypeSurfacique)
	 * @generated
	 */
	void unsetTypeSymbole();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleSurfacique#getTypeSymbole <em>Type Symbole</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Symbole</em>' attribute is set.
	 * @see #unsetTypeSymbole()
	 * @see #getTypeSymbole()
	 * @see #setTypeSymbole(TypeDictionaryDicoTypeSurfacique)
	 * @generated
	 */
	boolean isSetTypeSymbole();

	/**
	 * Returns the value of the '<em><b>Style Trait</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoStyleTrait}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Trait</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Trait</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoStyleTrait
	 * @see #isSetStyleTrait()
	 * @see #unsetStyleTrait()
	 * @see #setStyleTrait(TypeDictionaryDicoStyleTrait)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleSurfacique_StyleTrait()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StyleTrait'"
	 * @generated
	 */
	TypeDictionaryDicoStyleTrait getStyleTrait();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleSurfacique#getStyleTrait <em>Style Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Trait</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoStyleTrait
	 * @see #isSetStyleTrait()
	 * @see #unsetStyleTrait()
	 * @see #getStyleTrait()
	 * @generated
	 */
	void setStyleTrait(TypeDictionaryDicoStyleTrait value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleSurfacique#getStyleTrait <em>Style Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyleTrait()
	 * @see #getStyleTrait()
	 * @see #setStyleTrait(TypeDictionaryDicoStyleTrait)
	 * @generated
	 */
	void unsetStyleTrait();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleSurfacique#getStyleTrait <em>Style Trait</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style Trait</em>' attribute is set.
	 * @see #unsetStyleTrait()
	 * @see #getStyleTrait()
	 * @see #setStyleTrait(TypeDictionaryDicoStyleTrait)
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
	 * @see mpia.schema.SchemaPackage#getTypeSymboleSurfacique_EpaisseurTrait()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EpaisseurTrait'"
	 * @generated
	 */
	TypeDictionaryDicoEpaisseurTrait getEpaisseurTrait();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleSurfacique#getEpaisseurTrait <em>Epaisseur Trait</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleSurfacique#getEpaisseurTrait <em>Epaisseur Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEpaisseurTrait()
	 * @see #getEpaisseurTrait()
	 * @see #setEpaisseurTrait(TypeDictionaryDicoEpaisseurTrait)
	 * @generated
	 */
	void unsetEpaisseurTrait();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleSurfacique#getEpaisseurTrait <em>Epaisseur Trait</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Epaisseur Trait</em>' attribute is set.
	 * @see #unsetEpaisseurTrait()
	 * @see #getEpaisseurTrait()
	 * @see #setEpaisseurTrait(TypeDictionaryDicoEpaisseurTrait)
	 * @generated
	 */
	boolean isSetEpaisseurTrait();

	/**
	 * Returns the value of the '<em><b>Remplissage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoStyleRemplissage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remplissage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remplissage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoStyleRemplissage
	 * @see #isSetRemplissage()
	 * @see #unsetRemplissage()
	 * @see #setRemplissage(TypeDictionaryDicoStyleRemplissage)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleSurfacique_Remplissage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Remplissage'"
	 * @generated
	 */
	TypeDictionaryDicoStyleRemplissage getRemplissage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleSurfacique#getRemplissage <em>Remplissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remplissage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoStyleRemplissage
	 * @see #isSetRemplissage()
	 * @see #unsetRemplissage()
	 * @see #getRemplissage()
	 * @generated
	 */
	void setRemplissage(TypeDictionaryDicoStyleRemplissage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleSurfacique#getRemplissage <em>Remplissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemplissage()
	 * @see #getRemplissage()
	 * @see #setRemplissage(TypeDictionaryDicoStyleRemplissage)
	 * @generated
	 */
	void unsetRemplissage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleSurfacique#getRemplissage <em>Remplissage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remplissage</em>' attribute is set.
	 * @see #unsetRemplissage()
	 * @see #getRemplissage()
	 * @see #setRemplissage(TypeDictionaryDicoStyleRemplissage)
	 * @generated
	 */
	boolean isSetRemplissage();

} // TypeSymboleSurfacique
