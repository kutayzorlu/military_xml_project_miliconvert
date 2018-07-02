/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Symbole Libre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSymboleLibre#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleLibre#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSymboleLibre()
 * @model abstract="true"
 *        extendedMetaData="name='type_SymboleLibre' kind='elementOnly'"
 * @generated
 */
public interface TypeSymboleLibre extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Couleur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #setCouleur(TypeDictionaryDicoCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleLibre_Couleur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Couleur'"
	 * @generated
	 */
	TypeDictionaryDicoCouleur getCouleur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleLibre#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @generated
	 */
	void setCouleur(TypeDictionaryDicoCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleLibre#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoCouleur)
	 * @generated
	 */
	void unsetCouleur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleLibre#getCouleur <em>Couleur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur</em>' attribute is set.
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoCouleur)
	 * @generated
	 */
	boolean isSetCouleur();

	/**
	 * Returns the value of the '<em><b>Est Localise En Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #setEstLocaliseEnLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleLibre_EstLocaliseEnLocalisation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_Localisation'"
	 * @generated
	 */
	TypeLocalisation getEstLocaliseEnLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleLibre#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 */
	void setEstLocaliseEnLocalisation(TypeLocalisation value);

} // TypeSymboleLibre
