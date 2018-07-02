/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Poste Militaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypePosteMilitaire#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypePosteMilitaire#getGrade <em>Grade</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypePosteMilitaire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypePosteMilitaire' kind='elementOnly'"
 * @generated
 */
public interface TypeTypePosteMilitaire extends TypeTypeOrganisationGouvernementale {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePosteMilitaireCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePosteMilitaireCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePosteMilitaireCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypePosteMilitaire_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypePosteMilitaireCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePosteMilitaire#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePosteMilitaireCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypePosteMilitaireCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePosteMilitaire#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePosteMilitaireCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePosteMilitaire#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePosteMilitaireCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePosteMilitaireGrade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePosteMilitaireGrade
	 * @see #isSetGrade()
	 * @see #unsetGrade()
	 * @see #setGrade(TypeDictionaryDicoTypePosteMilitaireGrade)
	 * @see mpia.schema.SchemaPackage#getTypeTypePosteMilitaire_Grade()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Grade'"
	 * @generated
	 */
	TypeDictionaryDicoTypePosteMilitaireGrade getGrade();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePosteMilitaire#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePosteMilitaireGrade
	 * @see #isSetGrade()
	 * @see #unsetGrade()
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(TypeDictionaryDicoTypePosteMilitaireGrade value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePosteMilitaire#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrade()
	 * @see #getGrade()
	 * @see #setGrade(TypeDictionaryDicoTypePosteMilitaireGrade)
	 * @generated
	 */
	void unsetGrade();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePosteMilitaire#getGrade <em>Grade</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grade</em>' attribute is set.
	 * @see #unsetGrade()
	 * @see #getGrade()
	 * @see #setGrade(TypeDictionaryDicoTypePosteMilitaireGrade)
	 * @generated
	 */
	boolean isSetGrade();

} // TypeTypePosteMilitaire
