/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Adresse Physique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAdressePhysique#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAdressePhysique#getNomResidence <em>Nom Residence</em>}</li>
 *   <li>{@link mpia.schema.TypeAdressePhysique#getBoiteAuxLettres <em>Boite Aux Lettres</em>}</li>
 *   <li>{@link mpia.schema.TypeAdressePhysique#getNumero <em>Numero</em>}</li>
 *   <li>{@link mpia.schema.TypeAdressePhysique#getNomRue <em>Nom Rue</em>}</li>
 *   <li>{@link mpia.schema.TypeAdressePhysique#getBoitePostale <em>Boite Postale</em>}</li>
 *   <li>{@link mpia.schema.TypeAdressePhysique#getCodePostal <em>Code Postal</em>}</li>
 *   <li>{@link mpia.schema.TypeAdressePhysique#getVille <em>Ville</em>}</li>
 *   <li>{@link mpia.schema.TypeAdressePhysique#getRegionGeographique <em>Region Geographique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AdressePhysique' kind='elementOnly'"
 * @generated
 */
public interface TypeAdressePhysique extends TypeAdresse {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAdressePhysiqueCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAdressePhysiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAdressePhysiqueCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAdressePhysiqueCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdressePhysique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAdressePhysiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAdressePhysiqueCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAdressePhysique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAdressePhysiqueCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAdressePhysique#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAdressePhysiqueCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Nom Residence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Residence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Residence</em>' attribute.
	 * @see #setNomResidence(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique_NomResidence()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='NomResidence'"
	 * @generated
	 */
	String getNomResidence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdressePhysique#getNomResidence <em>Nom Residence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Residence</em>' attribute.
	 * @see #getNomResidence()
	 * @generated
	 */
	void setNomResidence(String value);

	/**
	 * Returns the value of the '<em><b>Boite Aux Lettres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boite Aux Lettres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boite Aux Lettres</em>' attribute.
	 * @see #setBoiteAuxLettres(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique_BoiteAuxLettres()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='BoiteAuxLettres'"
	 * @generated
	 */
	String getBoiteAuxLettres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdressePhysique#getBoiteAuxLettres <em>Boite Aux Lettres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boite Aux Lettres</em>' attribute.
	 * @see #getBoiteAuxLettres()
	 * @generated
	 */
	void setBoiteAuxLettres(String value);

	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique_Numero()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Numero'"
	 * @generated
	 */
	String getNumero();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdressePhysique#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(String value);

	/**
	 * Returns the value of the '<em><b>Nom Rue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Rue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Rue</em>' attribute.
	 * @see #setNomRue(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique_NomRue()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='NomRue'"
	 * @generated
	 */
	String getNomRue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdressePhysique#getNomRue <em>Nom Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Rue</em>' attribute.
	 * @see #getNomRue()
	 * @generated
	 */
	void setNomRue(String value);

	/**
	 * Returns the value of the '<em><b>Boite Postale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boite Postale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boite Postale</em>' attribute.
	 * @see #setBoitePostale(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique_BoitePostale()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='BoitePostale'"
	 * @generated
	 */
	String getBoitePostale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdressePhysique#getBoitePostale <em>Boite Postale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boite Postale</em>' attribute.
	 * @see #getBoitePostale()
	 * @generated
	 */
	void setBoitePostale(String value);

	/**
	 * Returns the value of the '<em><b>Code Postal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Postal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Postal</em>' attribute.
	 * @see #setCodePostal(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique_CodePostal()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='CodePostal'"
	 * @generated
	 */
	String getCodePostal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdressePhysique#getCodePostal <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Postal</em>' attribute.
	 * @see #getCodePostal()
	 * @generated
	 */
	void setCodePostal(String value);

	/**
	 * Returns the value of the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ville</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ville</em>' attribute.
	 * @see #setVille(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique_Ville()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Ville'"
	 * @generated
	 */
	String getVille();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdressePhysique#getVille <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ville</em>' attribute.
	 * @see #getVille()
	 * @generated
	 */
	void setVille(String value);

	/**
	 * Returns the value of the '<em><b>Region Geographique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Geographique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Geographique</em>' attribute.
	 * @see #setRegionGeographique(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdressePhysique_RegionGeographique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='RegionGeographique'"
	 * @generated
	 */
	String getRegionGeographique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdressePhysique#getRegionGeographique <em>Region Geographique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Geographique</em>' attribute.
	 * @see #getRegionGeographique()
	 * @generated
	 */
	void setRegionGeographique(String value);

} // TypeAdressePhysique
