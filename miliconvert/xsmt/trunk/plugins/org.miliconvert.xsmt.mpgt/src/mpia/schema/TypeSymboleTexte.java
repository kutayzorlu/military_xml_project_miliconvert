/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Symbole Texte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSymboleTexte#getTexte <em>Texte</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTexte#getTailleTexte <em>Taille Texte</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSymboleTexte()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SymboleTexte' kind='elementOnly'"
 * @generated
 */
public interface TypeSymboleTexte extends TypeSymboleLibre {
	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTexte_Texte()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Texte'"
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTexte#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

	/**
	 * Returns the value of the '<em><b>Taille Texte</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTailleTexte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille Texte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Texte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTailleTexte
	 * @see #isSetTailleTexte()
	 * @see #unsetTailleTexte()
	 * @see #setTailleTexte(TypeDictionaryDicoTailleTexte)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTexte_TailleTexte()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TailleTexte'"
	 * @generated
	 */
	TypeDictionaryDicoTailleTexte getTailleTexte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTexte#getTailleTexte <em>Taille Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Texte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTailleTexte
	 * @see #isSetTailleTexte()
	 * @see #unsetTailleTexte()
	 * @see #getTailleTexte()
	 * @generated
	 */
	void setTailleTexte(TypeDictionaryDicoTailleTexte value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTexte#getTailleTexte <em>Taille Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTailleTexte()
	 * @see #getTailleTexte()
	 * @see #setTailleTexte(TypeDictionaryDicoTailleTexte)
	 * @generated
	 */
	void unsetTailleTexte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTexte#getTailleTexte <em>Taille Texte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taille Texte</em>' attribute is set.
	 * @see #unsetTailleTexte()
	 * @see #getTailleTexte()
	 * @see #setTailleTexte(TypeDictionaryDicoTailleTexte)
	 * @generated
	 */
	boolean isSetTailleTexte();

} // TypeSymboleTexte
