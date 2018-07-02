/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Arme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeArme#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeArme#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeArme#getAutreSousCategorie <em>Autre Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeArme#getModele <em>Modele</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeArme#getDiametreTube <em>Diametre Tube</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeArme#getCalibre <em>Calibre</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeArme#isGuidage <em>Guidage</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeArme#getMoyensIFF <em>Moyens IFF</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeArme()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeArme' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeArme extends TypeTypeEquipement {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeArmeCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeArmeCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeArme_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeArmeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeArme#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeArmeCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeArme#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeArmeCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeArme#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeArmeCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeArmeSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeArmeSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeArme_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeArmeSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeArme#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoTypeArmeSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeArme#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeArmeSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeArme#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeArmeSousCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeArme_AutreSousCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='AutreSousCategorie'"
	 * @generated
	 */
	String getAutreSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeArme#getAutreSousCategorie <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Sous Categorie</em>' attribute.
	 * @see #getAutreSousCategorie()
	 * @generated
	 */
	void setAutreSousCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Modele</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeArmeModele}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modele</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modele</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeModele
	 * @see #isSetModele()
	 * @see #unsetModele()
	 * @see #setModele(TypeDictionaryDicoTypeArmeModele)
	 * @see mpia.schema.SchemaPackage#getTypeTypeArme_Modele()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Modele'"
	 * @generated
	 */
	TypeDictionaryDicoTypeArmeModele getModele();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeArme#getModele <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modele</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeModele
	 * @see #isSetModele()
	 * @see #unsetModele()
	 * @see #getModele()
	 * @generated
	 */
	void setModele(TypeDictionaryDicoTypeArmeModele value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeArme#getModele <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModele()
	 * @see #getModele()
	 * @see #setModele(TypeDictionaryDicoTypeArmeModele)
	 * @generated
	 */
	void unsetModele();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeArme#getModele <em>Modele</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modele</em>' attribute is set.
	 * @see #unsetModele()
	 * @see #getModele()
	 * @see #setModele(TypeDictionaryDicoTypeArmeModele)
	 * @generated
	 */
	boolean isSetModele();

	/**
	 * Returns the value of the '<em><b>Diametre Tube</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeArmeDiametreTube}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diametre Tube</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diametre Tube</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeDiametreTube
	 * @see #isSetDiametreTube()
	 * @see #unsetDiametreTube()
	 * @see #setDiametreTube(TypeDictionaryDicoTypeArmeDiametreTube)
	 * @see mpia.schema.SchemaPackage#getTypeTypeArme_DiametreTube()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DiametreTube'"
	 * @generated
	 */
	TypeDictionaryDicoTypeArmeDiametreTube getDiametreTube();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeArme#getDiametreTube <em>Diametre Tube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diametre Tube</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeDiametreTube
	 * @see #isSetDiametreTube()
	 * @see #unsetDiametreTube()
	 * @see #getDiametreTube()
	 * @generated
	 */
	void setDiametreTube(TypeDictionaryDicoTypeArmeDiametreTube value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeArme#getDiametreTube <em>Diametre Tube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiametreTube()
	 * @see #getDiametreTube()
	 * @see #setDiametreTube(TypeDictionaryDicoTypeArmeDiametreTube)
	 * @generated
	 */
	void unsetDiametreTube();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeArme#getDiametreTube <em>Diametre Tube</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diametre Tube</em>' attribute is set.
	 * @see #unsetDiametreTube()
	 * @see #getDiametreTube()
	 * @see #setDiametreTube(TypeDictionaryDicoTypeArmeDiametreTube)
	 * @generated
	 */
	boolean isSetDiametreTube();

	/**
	 * Returns the value of the '<em><b>Calibre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibre</em>' attribute.
	 * @see #setCalibre(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeArme_Calibre()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Calibre'"
	 * @generated
	 */
	String getCalibre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeArme#getCalibre <em>Calibre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibre</em>' attribute.
	 * @see #getCalibre()
	 * @generated
	 */
	void setCalibre(String value);

	/**
	 * Returns the value of the '<em><b>Guidage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guidage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guidage</em>' attribute.
	 * @see #isSetGuidage()
	 * @see #unsetGuidage()
	 * @see #setGuidage(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeTypeArme_Guidage()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Guidage'"
	 * @generated
	 */
	boolean isGuidage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeArme#isGuidage <em>Guidage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guidage</em>' attribute.
	 * @see #isSetGuidage()
	 * @see #unsetGuidage()
	 * @see #isGuidage()
	 * @generated
	 */
	void setGuidage(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeArme#isGuidage <em>Guidage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGuidage()
	 * @see #isGuidage()
	 * @see #setGuidage(boolean)
	 * @generated
	 */
	void unsetGuidage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeArme#isGuidage <em>Guidage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Guidage</em>' attribute is set.
	 * @see #unsetGuidage()
	 * @see #isGuidage()
	 * @see #setGuidage(boolean)
	 * @generated
	 */
	boolean isSetGuidage();

	/**
	 * Returns the value of the '<em><b>Moyens IFF</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeArmeMoyensIFF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens IFF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens IFF</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeMoyensIFF
	 * @see #isSetMoyensIFF()
	 * @see #unsetMoyensIFF()
	 * @see #setMoyensIFF(TypeDictionaryDicoTypeArmeMoyensIFF)
	 * @see mpia.schema.SchemaPackage#getTypeTypeArme_MoyensIFF()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MoyensIFF'"
	 * @generated
	 */
	TypeDictionaryDicoTypeArmeMoyensIFF getMoyensIFF();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeArme#getMoyensIFF <em>Moyens IFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens IFF</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeArmeMoyensIFF
	 * @see #isSetMoyensIFF()
	 * @see #unsetMoyensIFF()
	 * @see #getMoyensIFF()
	 * @generated
	 */
	void setMoyensIFF(TypeDictionaryDicoTypeArmeMoyensIFF value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeArme#getMoyensIFF <em>Moyens IFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyensIFF()
	 * @see #getMoyensIFF()
	 * @see #setMoyensIFF(TypeDictionaryDicoTypeArmeMoyensIFF)
	 * @generated
	 */
	void unsetMoyensIFF();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeArme#getMoyensIFF <em>Moyens IFF</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyens IFF</em>' attribute is set.
	 * @see #unsetMoyensIFF()
	 * @see #getMoyensIFF()
	 * @see #setMoyensIFF(TypeDictionaryDicoTypeArmeMoyensIFF)
	 * @generated
	 */
	boolean isSetMoyensIFF();

} // TypeTypeArme
