/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Fonctionnelle Logistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneFonctionnelleLogistique#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneFonctionnelleLogistique#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneFonctionnelleLogistique#getAPourLocalisationPCLocalisation <em>APour Localisation PC Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneFonctionnelleLogistique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ZoneFonctionnelleLogistique' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneFonctionnelleLogistique extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Domaine</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDomaineLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domaine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDomaineLogistique
	 * @see #isSetDomaine()
	 * @see #unsetDomaine()
	 * @see #setDomaine(TypeDictionaryDicoDomaineLogistique)
	 * @see mpia.schema.SchemaPackage#getTypeZoneFonctionnelleLogistique_Domaine()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Domaine'"
	 * @generated
	 */
	TypeDictionaryDicoDomaineLogistique getDomaine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneFonctionnelleLogistique#getDomaine <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDomaineLogistique
	 * @see #isSetDomaine()
	 * @see #unsetDomaine()
	 * @see #getDomaine()
	 * @generated
	 */
	void setDomaine(TypeDictionaryDicoDomaineLogistique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneFonctionnelleLogistique#getDomaine <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDomaine()
	 * @see #getDomaine()
	 * @see #setDomaine(TypeDictionaryDicoDomaineLogistique)
	 * @generated
	 */
	void unsetDomaine();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneFonctionnelleLogistique#getDomaine <em>Domaine</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Domaine</em>' attribute is set.
	 * @see #unsetDomaine()
	 * @see #getDomaine()
	 * @see #setDomaine(TypeDictionaryDicoDomaineLogistique)
	 * @generated
	 */
	boolean isSetDomaine();

	/**
	 * Returns the value of the '<em><b>Complement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' attribute.
	 * @see #setComplement(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneFonctionnelleLogistique_Complement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Complement'"
	 * @generated
	 */
	String getComplement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneFonctionnelleLogistique#getComplement <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' attribute.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(String value);

	/**
	 * Returns the value of the '<em><b>APour Localisation PC Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation PC Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation PC Localisation</em>' containment reference.
	 * @see #setAPourLocalisationPCLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeZoneFonctionnelleLogistique_APourLocalisationPCLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='APourLocalisationPC_Localisation'"
	 * @generated
	 */
	TypeLocalisation getAPourLocalisationPCLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneFonctionnelleLogistique#getAPourLocalisationPCLocalisation <em>APour Localisation PC Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation PC Localisation</em>' containment reference.
	 * @see #getAPourLocalisationPCLocalisation()
	 * @generated
	 */
	void setAPourLocalisationPCLocalisation(TypeLocalisation value);

} // TypeZoneFonctionnelleLogistique
