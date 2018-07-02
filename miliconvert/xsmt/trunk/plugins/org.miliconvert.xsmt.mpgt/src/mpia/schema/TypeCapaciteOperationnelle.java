/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capacite Operationnelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteOperationnelle#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteOperationnelle#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteOperationnelle#getQualificatif <em>Qualificatif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteOperationnelle()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteOperationnelle' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteOperationnelle extends TypeCapacite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteOperationnelleCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteOperationnelleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteOperationnelleCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteOperationnelle_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteOperationnelleCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteOperationnelle#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteOperationnelleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCapaciteOperationnelleCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteOperationnelle#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteOperationnelleCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteOperationnelle#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteOperationnelleCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteOperationnelleNiveau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteOperationnelleNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #setNiveau(TypeDictionaryDicoCapaciteOperationnelleNiveau)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteOperationnelle_Niveau()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Niveau'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteOperationnelleNiveau getNiveau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteOperationnelle#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteOperationnelleNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(TypeDictionaryDicoCapaciteOperationnelleNiveau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteOperationnelle#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoCapaciteOperationnelleNiveau)
	 * @generated
	 */
	void unsetNiveau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteOperationnelle#getNiveau <em>Niveau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau</em>' attribute is set.
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoCapaciteOperationnelleNiveau)
	 * @generated
	 */
	boolean isSetNiveau();

	/**
	 * Returns the value of the '<em><b>Qualificatif</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteOperationnelleQualificatif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteOperationnelleQualificatif
	 * @see #isSetQualificatif()
	 * @see #unsetQualificatif()
	 * @see #setQualificatif(TypeDictionaryDicoCapaciteOperationnelleQualificatif)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteOperationnelle_Qualificatif()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Qualificatif'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteOperationnelleQualificatif getQualificatif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteOperationnelle#getQualificatif <em>Qualificatif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteOperationnelleQualificatif
	 * @see #isSetQualificatif()
	 * @see #unsetQualificatif()
	 * @see #getQualificatif()
	 * @generated
	 */
	void setQualificatif(TypeDictionaryDicoCapaciteOperationnelleQualificatif value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteOperationnelle#getQualificatif <em>Qualificatif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatif()
	 * @see #getQualificatif()
	 * @see #setQualificatif(TypeDictionaryDicoCapaciteOperationnelleQualificatif)
	 * @generated
	 */
	void unsetQualificatif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteOperationnelle#getQualificatif <em>Qualificatif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif</em>' attribute is set.
	 * @see #unsetQualificatif()
	 * @see #getQualificatif()
	 * @see #setQualificatif(TypeDictionaryDicoCapaciteOperationnelleQualificatif)
	 * @generated
	 */
	boolean isSetQualificatif();

} // TypeCapaciteOperationnelle
