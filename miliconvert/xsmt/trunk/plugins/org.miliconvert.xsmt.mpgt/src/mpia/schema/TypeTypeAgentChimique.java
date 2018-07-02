/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Agent Chimique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeAgentChimique#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentChimique#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentChimique#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentChimique#getAutreSousCategorie <em>Autre Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentChimique#getPersistance <em>Persistance</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeAgentChimique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeAgentChimique' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeAgentChimique extends TypeTypeConsommable {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAgentChimiqueCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentChimiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAgentChimiqueCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentChimique_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAgentChimiqueCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentChimique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentChimiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeAgentChimiqueCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAgentChimique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAgentChimiqueCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAgentChimique#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAgentChimiqueCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentChimique_AutreCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='AutreCategorie'"
	 * @generated
	 */
	String getAutreCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentChimique#getAutreCategorie <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Categorie</em>' attribute.
	 * @see #getAutreCategorie()
	 * @generated
	 */
	void setAutreCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAgentChimiqueSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentChimiqueSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeAgentChimiqueSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentChimique_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAgentChimiqueSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentChimique#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentChimiqueSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoTypeAgentChimiqueSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAgentChimique#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeAgentChimiqueSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAgentChimique#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeAgentChimiqueSousCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentChimique_AutreSousCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='AutreSousCategorie'"
	 * @generated
	 */
	String getAutreSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentChimique#getAutreSousCategorie <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Sous Categorie</em>' attribute.
	 * @see #getAutreSousCategorie()
	 * @generated
	 */
	void setAutreSousCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Persistance</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPersistance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPersistance
	 * @see #isSetPersistance()
	 * @see #unsetPersistance()
	 * @see #setPersistance(TypeDictionaryDicoPersistance)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentChimique_Persistance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Persistance'"
	 * @generated
	 */
	TypeDictionaryDicoPersistance getPersistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentChimique#getPersistance <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPersistance
	 * @see #isSetPersistance()
	 * @see #unsetPersistance()
	 * @see #getPersistance()
	 * @generated
	 */
	void setPersistance(TypeDictionaryDicoPersistance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAgentChimique#getPersistance <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistance()
	 * @see #getPersistance()
	 * @see #setPersistance(TypeDictionaryDicoPersistance)
	 * @generated
	 */
	void unsetPersistance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAgentChimique#getPersistance <em>Persistance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistance</em>' attribute is set.
	 * @see #unsetPersistance()
	 * @see #getPersistance()
	 * @see #setPersistance(TypeDictionaryDicoPersistance)
	 * @generated
	 */
	boolean isSetPersistance();

} // TypeTypeAgentChimique
