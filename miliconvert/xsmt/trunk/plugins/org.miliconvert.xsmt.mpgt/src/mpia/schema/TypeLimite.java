/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Limite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLimite#getCategorieAdministrative <em>Categorie Administrative</em>}</li>
 *   <li>{@link mpia.schema.TypeLimite#getNiveau <em>Niveau</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLimite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Limite' kind='elementOnly'"
 * @generated
 */
public interface TypeLimite extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Categorie Administrative</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLimiteCategorieAdministrative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Administrative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Administrative</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLimiteCategorieAdministrative
	 * @see #isSetCategorieAdministrative()
	 * @see #unsetCategorieAdministrative()
	 * @see #setCategorieAdministrative(TypeDictionaryDicoLimiteCategorieAdministrative)
	 * @see mpia.schema.SchemaPackage#getTypeLimite_CategorieAdministrative()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CategorieAdministrative'"
	 * @generated
	 */
	TypeDictionaryDicoLimiteCategorieAdministrative getCategorieAdministrative();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLimite#getCategorieAdministrative <em>Categorie Administrative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Administrative</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLimiteCategorieAdministrative
	 * @see #isSetCategorieAdministrative()
	 * @see #unsetCategorieAdministrative()
	 * @see #getCategorieAdministrative()
	 * @generated
	 */
	void setCategorieAdministrative(TypeDictionaryDicoLimiteCategorieAdministrative value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLimite#getCategorieAdministrative <em>Categorie Administrative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorieAdministrative()
	 * @see #getCategorieAdministrative()
	 * @see #setCategorieAdministrative(TypeDictionaryDicoLimiteCategorieAdministrative)
	 * @generated
	 */
	void unsetCategorieAdministrative();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLimite#getCategorieAdministrative <em>Categorie Administrative</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Administrative</em>' attribute is set.
	 * @see #unsetCategorieAdministrative()
	 * @see #getCategorieAdministrative()
	 * @see #setCategorieAdministrative(TypeDictionaryDicoLimiteCategorieAdministrative)
	 * @generated
	 */
	boolean isSetCategorieAdministrative();

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoNiveau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #setNiveau(TypeDictionaryDicoNiveau)
	 * @see mpia.schema.SchemaPackage#getTypeLimite_Niveau()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Niveau'"
	 * @generated
	 */
	TypeDictionaryDicoNiveau getNiveau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLimite#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(TypeDictionaryDicoNiveau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLimite#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoNiveau)
	 * @generated
	 */
	void unsetNiveau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLimite#getNiveau <em>Niveau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau</em>' attribute is set.
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoNiveau)
	 * @generated
	 */
	boolean isSetNiveau();

} // TypeLimite
