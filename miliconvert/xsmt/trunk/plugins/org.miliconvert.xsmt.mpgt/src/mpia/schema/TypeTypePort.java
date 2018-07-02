/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypePort#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypePort#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypePort#getSituationGeographique <em>Situation Geographique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypePort()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypePort' kind='elementOnly'"
 * @generated
 */
public interface TypeTypePort extends TypeTypeSite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePortCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePortCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePortCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypePort_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypePortCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePort#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePortCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypePortCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePort#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePortCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePort#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypePortCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePortSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePortSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypePortSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypePort_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypePortSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePort#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePortSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoTypePortSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePort#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypePortSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePort#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypePortSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Situation Geographique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePortSituationGeographique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Geographique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Geographique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePortSituationGeographique
	 * @see #isSetSituationGeographique()
	 * @see #unsetSituationGeographique()
	 * @see #setSituationGeographique(TypeDictionaryDicoTypePortSituationGeographique)
	 * @see mpia.schema.SchemaPackage#getTypeTypePort_SituationGeographique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SituationGeographique'"
	 * @generated
	 */
	TypeDictionaryDicoTypePortSituationGeographique getSituationGeographique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypePort#getSituationGeographique <em>Situation Geographique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation Geographique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePortSituationGeographique
	 * @see #isSetSituationGeographique()
	 * @see #unsetSituationGeographique()
	 * @see #getSituationGeographique()
	 * @generated
	 */
	void setSituationGeographique(TypeDictionaryDicoTypePortSituationGeographique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypePort#getSituationGeographique <em>Situation Geographique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSituationGeographique()
	 * @see #getSituationGeographique()
	 * @see #setSituationGeographique(TypeDictionaryDicoTypePortSituationGeographique)
	 * @generated
	 */
	void unsetSituationGeographique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypePort#getSituationGeographique <em>Situation Geographique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Situation Geographique</em>' attribute is set.
	 * @see #unsetSituationGeographique()
	 * @see #getSituationGeographique()
	 * @see #setSituationGeographique(TypeDictionaryDicoTypePortSituationGeographique)
	 * @generated
	 */
	boolean isSetSituationGeographique();

} // TypeTypePort
