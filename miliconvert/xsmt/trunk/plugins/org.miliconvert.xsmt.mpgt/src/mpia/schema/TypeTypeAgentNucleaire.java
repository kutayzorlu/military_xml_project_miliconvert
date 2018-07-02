/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Agent Nucleaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeAgentNucleaire#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentNucleaire#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentNucleaire#getRadiation <em>Radiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeAgentNucleaire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeAgentNucleaire' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeAgentNucleaire extends TypeTypeConsommable {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAgentNucleaireCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentNucleaireCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAgentNucleaireCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentNucleaire_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAgentNucleaireCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentNucleaire#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentNucleaireCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeAgentNucleaireCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAgentNucleaire#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAgentNucleaireCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAgentNucleaire#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAgentNucleaireCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Autre Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Categorie</em>' attribute.
	 * @see #setAutreCategorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentNucleaire_AutreCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='AutreCategorie'"
	 * @generated
	 */
	String getAutreCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentNucleaire#getAutreCategorie <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Categorie</em>' attribute.
	 * @see #getAutreCategorie()
	 * @generated
	 */
	void setAutreCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Radiation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAgentNucleaireRadiation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radiation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radiation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentNucleaireRadiation
	 * @see #isSetRadiation()
	 * @see #unsetRadiation()
	 * @see #setRadiation(TypeDictionaryDicoTypeAgentNucleaireRadiation)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentNucleaire_Radiation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Radiation'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAgentNucleaireRadiation getRadiation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentNucleaire#getRadiation <em>Radiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radiation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentNucleaireRadiation
	 * @see #isSetRadiation()
	 * @see #unsetRadiation()
	 * @see #getRadiation()
	 * @generated
	 */
	void setRadiation(TypeDictionaryDicoTypeAgentNucleaireRadiation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAgentNucleaire#getRadiation <em>Radiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadiation()
	 * @see #getRadiation()
	 * @see #setRadiation(TypeDictionaryDicoTypeAgentNucleaireRadiation)
	 * @generated
	 */
	void unsetRadiation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAgentNucleaire#getRadiation <em>Radiation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radiation</em>' attribute is set.
	 * @see #unsetRadiation()
	 * @see #getRadiation()
	 * @see #setRadiation(TypeDictionaryDicoTypeAgentNucleaireRadiation)
	 * @generated
	 */
	boolean isSetRadiation();

} // TypeTypeAgentNucleaire
