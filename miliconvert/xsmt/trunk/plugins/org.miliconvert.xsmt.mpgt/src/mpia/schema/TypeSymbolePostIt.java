/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Symbole Post It</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSymbolePostIt#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link mpia.schema.TypeSymbolePostIt#isGras <em>Gras</em>}</li>
 *   <li>{@link mpia.schema.TypeSymbolePostIt#isItalique <em>Italique</em>}</li>
 *   <li>{@link mpia.schema.TypeSymbolePostIt#getCouleurTexte <em>Couleur Texte</em>}</li>
 *   <li>{@link mpia.schema.TypeSymbolePostIt#isSouligne <em>Souligne</em>}</li>
 *   <li>{@link mpia.schema.TypeSymbolePostIt#isOmbre <em>Ombre</em>}</li>
 *   <li>{@link mpia.schema.TypeSymbolePostIt#getMarge <em>Marge</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSymbolePostIt()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SymbolePostIt' kind='elementOnly'"
 * @generated
 */
public interface TypeSymbolePostIt extends TypeSymboleLibre {
	/**
	 * Returns the value of the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle</em>' attribute.
	 * @see #setLibelle(String)
	 * @see mpia.schema.SchemaPackage#getTypeSymbolePostIt_Libelle()
	 * @model dataType="mpia.meta.TypeString"
	 *        extendedMetaData="kind='element' name='Libelle'"
	 * @generated
	 */
	String getLibelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymbolePostIt#getLibelle <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle</em>' attribute.
	 * @see #getLibelle()
	 * @generated
	 */
	void setLibelle(String value);

	/**
	 * Returns the value of the '<em><b>Gras</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gras</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gras</em>' attribute.
	 * @see #isSetGras()
	 * @see #unsetGras()
	 * @see #setGras(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSymbolePostIt_Gras()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Gras'"
	 * @generated
	 */
	boolean isGras();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymbolePostIt#isGras <em>Gras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gras</em>' attribute.
	 * @see #isSetGras()
	 * @see #unsetGras()
	 * @see #isGras()
	 * @generated
	 */
	void setGras(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymbolePostIt#isGras <em>Gras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGras()
	 * @see #isGras()
	 * @see #setGras(boolean)
	 * @generated
	 */
	void unsetGras();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymbolePostIt#isGras <em>Gras</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gras</em>' attribute is set.
	 * @see #unsetGras()
	 * @see #isGras()
	 * @see #setGras(boolean)
	 * @generated
	 */
	boolean isSetGras();

	/**
	 * Returns the value of the '<em><b>Italique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italique</em>' attribute.
	 * @see #isSetItalique()
	 * @see #unsetItalique()
	 * @see #setItalique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSymbolePostIt_Italique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Italique'"
	 * @generated
	 */
	boolean isItalique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymbolePostIt#isItalique <em>Italique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italique</em>' attribute.
	 * @see #isSetItalique()
	 * @see #unsetItalique()
	 * @see #isItalique()
	 * @generated
	 */
	void setItalique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymbolePostIt#isItalique <em>Italique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItalique()
	 * @see #isItalique()
	 * @see #setItalique(boolean)
	 * @generated
	 */
	void unsetItalique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymbolePostIt#isItalique <em>Italique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Italique</em>' attribute is set.
	 * @see #unsetItalique()
	 * @see #isItalique()
	 * @see #setItalique(boolean)
	 * @generated
	 */
	boolean isSetItalique();

	/**
	 * Returns the value of the '<em><b>Couleur Texte</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Texte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Texte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurTexte()
	 * @see #unsetCouleurTexte()
	 * @see #setCouleurTexte(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeSymbolePostIt_CouleurTexte()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurTexte'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleurTexte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymbolePostIt#getCouleurTexte <em>Couleur Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Texte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurTexte()
	 * @see #unsetCouleurTexte()
	 * @see #getCouleurTexte()
	 * @generated
	 */
	void setCouleurTexte(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymbolePostIt#getCouleurTexte <em>Couleur Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurTexte()
	 * @see #getCouleurTexte()
	 * @see #setCouleurTexte(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleurTexte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymbolePostIt#getCouleurTexte <em>Couleur Texte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Texte</em>' attribute is set.
	 * @see #unsetCouleurTexte()
	 * @see #getCouleurTexte()
	 * @see #setCouleurTexte(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleurTexte();

	/**
	 * Returns the value of the '<em><b>Souligne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Souligne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Souligne</em>' attribute.
	 * @see #isSetSouligne()
	 * @see #unsetSouligne()
	 * @see #setSouligne(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSymbolePostIt_Souligne()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Souligne'"
	 * @generated
	 */
	boolean isSouligne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymbolePostIt#isSouligne <em>Souligne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Souligne</em>' attribute.
	 * @see #isSetSouligne()
	 * @see #unsetSouligne()
	 * @see #isSouligne()
	 * @generated
	 */
	void setSouligne(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymbolePostIt#isSouligne <em>Souligne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSouligne()
	 * @see #isSouligne()
	 * @see #setSouligne(boolean)
	 * @generated
	 */
	void unsetSouligne();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymbolePostIt#isSouligne <em>Souligne</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Souligne</em>' attribute is set.
	 * @see #unsetSouligne()
	 * @see #isSouligne()
	 * @see #setSouligne(boolean)
	 * @generated
	 */
	boolean isSetSouligne();

	/**
	 * Returns the value of the '<em><b>Ombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ombre</em>' attribute.
	 * @see #isSetOmbre()
	 * @see #unsetOmbre()
	 * @see #setOmbre(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSymbolePostIt_Ombre()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Ombre'"
	 * @generated
	 */
	boolean isOmbre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymbolePostIt#isOmbre <em>Ombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ombre</em>' attribute.
	 * @see #isSetOmbre()
	 * @see #unsetOmbre()
	 * @see #isOmbre()
	 * @generated
	 */
	void setOmbre(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymbolePostIt#isOmbre <em>Ombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOmbre()
	 * @see #isOmbre()
	 * @see #setOmbre(boolean)
	 * @generated
	 */
	void unsetOmbre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymbolePostIt#isOmbre <em>Ombre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ombre</em>' attribute is set.
	 * @see #unsetOmbre()
	 * @see #isOmbre()
	 * @see #setOmbre(boolean)
	 * @generated
	 */
	boolean isSetOmbre();

	/**
	 * Returns the value of the '<em><b>Marge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marge</em>' attribute.
	 * @see #isSetMarge()
	 * @see #unsetMarge()
	 * @see #setMarge(long)
	 * @see mpia.schema.SchemaPackage#getTypeSymbolePostIt_Marge()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='Marge'"
	 * @generated
	 */
	long getMarge();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymbolePostIt#getMarge <em>Marge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marge</em>' attribute.
	 * @see #isSetMarge()
	 * @see #unsetMarge()
	 * @see #getMarge()
	 * @generated
	 */
	void setMarge(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymbolePostIt#getMarge <em>Marge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarge()
	 * @see #getMarge()
	 * @see #setMarge(long)
	 * @generated
	 */
	void unsetMarge();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymbolePostIt#getMarge <em>Marge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marge</em>' attribute is set.
	 * @see #unsetMarge()
	 * @see #getMarge()
	 * @see #setMarge(long)
	 * @generated
	 */
	boolean isSetMarge();

} // TypeSymbolePostIt
