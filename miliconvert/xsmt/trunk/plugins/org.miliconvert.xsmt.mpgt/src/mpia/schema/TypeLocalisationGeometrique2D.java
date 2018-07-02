/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Localisation Geometrique2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLocalisationGeometrique2D#getCategorieFormeGeometrique <em>Categorie Forme Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeLocalisationGeometrique2D#getAPourObjetGeometriqueObjetGeometrique <em>APour Objet Geometrique Objet Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLocalisationGeometrique2D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_LocalisationGeometrique2D' kind='elementOnly'"
 * @generated
 */
public interface TypeLocalisationGeometrique2D extends TypeLocalisationGeometrique {
	/**
	 * Returns the value of the '<em><b>Categorie Forme Geometrique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Forme Geometrique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Forme Geometrique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique
	 * @see #isSetCategorieFormeGeometrique()
	 * @see #unsetCategorieFormeGeometrique()
	 * @see #setCategorieFormeGeometrique(TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeLocalisationGeometrique2D_CategorieFormeGeometrique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CategorieFormeGeometrique'"
	 * @generated
	 */
	TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique getCategorieFormeGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLocalisationGeometrique2D#getCategorieFormeGeometrique <em>Categorie Forme Geometrique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Forme Geometrique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique
	 * @see #isSetCategorieFormeGeometrique()
	 * @see #unsetCategorieFormeGeometrique()
	 * @see #getCategorieFormeGeometrique()
	 * @generated
	 */
	void setCategorieFormeGeometrique(TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLocalisationGeometrique2D#getCategorieFormeGeometrique <em>Categorie Forme Geometrique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorieFormeGeometrique()
	 * @see #getCategorieFormeGeometrique()
	 * @see #setCategorieFormeGeometrique(TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique)
	 * @generated
	 */
	void unsetCategorieFormeGeometrique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLocalisationGeometrique2D#getCategorieFormeGeometrique <em>Categorie Forme Geometrique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Forme Geometrique</em>' attribute is set.
	 * @see #unsetCategorieFormeGeometrique()
	 * @see #getCategorieFormeGeometrique()
	 * @see #setCategorieFormeGeometrique(TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique)
	 * @generated
	 */
	boolean isSetCategorieFormeGeometrique();

	/**
	 * Returns the value of the '<em><b>APour Objet Geometrique Objet Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Geometrique Objet Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Geometrique Objet Geometrique</em>' containment reference.
	 * @see #setAPourObjetGeometriqueObjetGeometrique(TypeObjetGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeLocalisationGeometrique2D_APourObjetGeometriqueObjetGeometrique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ObjetGeometrique'"
	 *        extendedMetaData="kind='element' name='APourObjetGeometrique_ObjetGeometrique'"
	 * @generated
	 */
	TypeObjetGeometrique getAPourObjetGeometriqueObjetGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLocalisationGeometrique2D#getAPourObjetGeometriqueObjetGeometrique <em>APour Objet Geometrique Objet Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Geometrique Objet Geometrique</em>' containment reference.
	 * @see #getAPourObjetGeometriqueObjetGeometrique()
	 * @generated
	 */
	void setAPourObjetGeometriqueObjetGeometrique(TypeObjetGeometrique value);

} // TypeLocalisationGeometrique2D
