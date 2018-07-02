/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypePersonne#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypePersonne#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypePersonne#getGrade <em>Grade</em>}</li>
 *   <li>{@link mpia.schema.TypeTypePersonne#getSexe <em>Sexe</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypePersonne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypePersonne' kind='elementOnly'"
 * @generated
 */
public interface TypeTypePersonne extends TypeType {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePersonneCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePersonneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePersonneCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypePersonne_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypePersonneCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePersonne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePersonneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypePersonneCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePersonne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePersonneCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePersonne#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePersonneCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePersonneSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePersonneSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypePersonneSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypePersonne_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypePersonneSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePersonne#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePersonneSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoTypePersonneSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePersonne#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypePersonneSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePersonne#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypePersonneSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePersonneGrade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePersonneGrade
	 * @see #isSetGrade()
	 * @see #unsetGrade()
	 * @see #setGrade(TypeDictionaryDicoTypePersonneGrade)
	 * @see mpia.schema.SchemaPackage#getTypeTypePersonne_Grade()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Grade'"
	 * @generated
	 */
	TypeDictionaryDicoTypePersonneGrade getGrade();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePersonne#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePersonneGrade
	 * @see #isSetGrade()
	 * @see #unsetGrade()
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(TypeDictionaryDicoTypePersonneGrade value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePersonne#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrade()
	 * @see #getGrade()
	 * @see #setGrade(TypeDictionaryDicoTypePersonneGrade)
	 * @generated
	 */
	void unsetGrade();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePersonne#getGrade <em>Grade</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grade</em>' attribute is set.
	 * @see #unsetGrade()
	 * @see #getGrade()
	 * @see #setGrade(TypeDictionaryDicoTypePersonneGrade)
	 * @generated
	 */
	boolean isSetGrade();

	/**
	 * Returns the value of the '<em><b>Sexe</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePersonneSexe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sexe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sexe</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePersonneSexe
	 * @see #isSetSexe()
	 * @see #unsetSexe()
	 * @see #setSexe(TypeDictionaryDicoTypePersonneSexe)
	 * @see mpia.schema.SchemaPackage#getTypeTypePersonne_Sexe()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Sexe'"
	 * @generated
	 */
	TypeDictionaryDicoTypePersonneSexe getSexe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePersonne#getSexe <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sexe</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePersonneSexe
	 * @see #isSetSexe()
	 * @see #unsetSexe()
	 * @see #getSexe()
	 * @generated
	 */
	void setSexe(TypeDictionaryDicoTypePersonneSexe value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePersonne#getSexe <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSexe()
	 * @see #getSexe()
	 * @see #setSexe(TypeDictionaryDicoTypePersonneSexe)
	 * @generated
	 */
	void unsetSexe();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePersonne#getSexe <em>Sexe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sexe</em>' attribute is set.
	 * @see #unsetSexe()
	 * @see #getSexe()
	 * @see #setSexe(TypeDictionaryDicoTypePersonneSexe)
	 * @generated
	 */
	boolean isSetSexe();

} // TypeTypePersonne
