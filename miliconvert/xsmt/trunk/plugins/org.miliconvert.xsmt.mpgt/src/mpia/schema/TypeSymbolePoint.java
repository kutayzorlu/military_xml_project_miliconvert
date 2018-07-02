/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Symbole Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSymbolePoint#getMarqueur <em>Marqueur</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSymbolePoint()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SymbolePoint' kind='elementOnly'"
 * @generated
 */
public interface TypeSymbolePoint extends TypeSymboleLibre {
	/**
	 * Returns the value of the '<em><b>Marqueur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixMarqueur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marqueur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marqueur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixMarqueur
	 * @see #isSetMarqueur()
	 * @see #unsetMarqueur()
	 * @see #setMarqueur(TypeDictionaryDicoChoixMarqueur)
	 * @see mpia.schema.SchemaPackage#getTypeSymbolePoint_Marqueur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Marqueur'"
	 * @generated
	 */
	TypeDictionaryDicoChoixMarqueur getMarqueur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymbolePoint#getMarqueur <em>Marqueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marqueur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixMarqueur
	 * @see #isSetMarqueur()
	 * @see #unsetMarqueur()
	 * @see #getMarqueur()
	 * @generated
	 */
	void setMarqueur(TypeDictionaryDicoChoixMarqueur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymbolePoint#getMarqueur <em>Marqueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarqueur()
	 * @see #getMarqueur()
	 * @see #setMarqueur(TypeDictionaryDicoChoixMarqueur)
	 * @generated
	 */
	void unsetMarqueur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymbolePoint#getMarqueur <em>Marqueur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marqueur</em>' attribute is set.
	 * @see #unsetMarqueur()
	 * @see #getMarqueur()
	 * @see #setMarqueur(TypeDictionaryDicoChoixMarqueur)
	 * @generated
	 */
	boolean isSetMarqueur();

} // TypeSymbolePoint
