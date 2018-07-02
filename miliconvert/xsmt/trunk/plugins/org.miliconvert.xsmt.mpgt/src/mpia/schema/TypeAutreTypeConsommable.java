/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Type Consommable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreTypeConsommable#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreTypeConsommable#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreTypeConsommable#getAutreSousCategorie <em>Autre Sous Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreTypeConsommable()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreTypeConsommable' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreTypeConsommable extends TypeTypeConsommable {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreTypeConsommableCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeConsommableCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeConsommableCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeConsommable_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreTypeConsommableCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeConsommable#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeConsommableCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAutreTypeConsommableCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreTypeConsommable#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeConsommableCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreTypeConsommable#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeConsommableCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreTypeConsommableSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeConsommableSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAutreTypeConsommableSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeConsommable_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreTypeConsommableSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeConsommable#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeConsommableSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoAutreTypeConsommableSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreTypeConsommable#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAutreTypeConsommableSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreTypeConsommable#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAutreTypeConsommableSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Autre Sous Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Sous Categorie</em>' attribute.
	 * @see #setAutreSousCategorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeConsommable_AutreSousCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreSousCategorie'"
	 * @generated
	 */
	String getAutreSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeConsommable#getAutreSousCategorie <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Sous Categorie</em>' attribute.
	 * @see #getAutreSousCategorie()
	 * @generated
	 */
	void setAutreSousCategorie(String value);

} // TypeAutreTypeConsommable
