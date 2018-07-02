/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Symbole Fleche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSymboleFleche#getLargeurFleche <em>Largeur Fleche</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSymboleFleche()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SymboleFleche' kind='elementOnly'"
 * @generated
 */
public interface TypeSymboleFleche extends TypeSymboleSurfacique {
	/**
	 * Returns the value of the '<em><b>Largeur Fleche</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLargeurFleche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Fleche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Fleche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLargeurFleche
	 * @see #isSetLargeurFleche()
	 * @see #unsetLargeurFleche()
	 * @see #setLargeurFleche(TypeDictionaryDicoLargeurFleche)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleFleche_LargeurFleche()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='LargeurFleche'"
	 * @generated
	 */
	TypeDictionaryDicoLargeurFleche getLargeurFleche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleFleche#getLargeurFleche <em>Largeur Fleche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Fleche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLargeurFleche
	 * @see #isSetLargeurFleche()
	 * @see #unsetLargeurFleche()
	 * @see #getLargeurFleche()
	 * @generated
	 */
	void setLargeurFleche(TypeDictionaryDicoLargeurFleche value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleFleche#getLargeurFleche <em>Largeur Fleche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLargeurFleche()
	 * @see #getLargeurFleche()
	 * @see #setLargeurFleche(TypeDictionaryDicoLargeurFleche)
	 * @generated
	 */
	void unsetLargeurFleche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleFleche#getLargeurFleche <em>Largeur Fleche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Largeur Fleche</em>' attribute is set.
	 * @see #unsetLargeurFleche()
	 * @see #getLargeurFleche()
	 * @see #setLargeurFleche(TypeDictionaryDicoLargeurFleche)
	 * @generated
	 */
	boolean isSetLargeurFleche();

} // TypeSymboleFleche
