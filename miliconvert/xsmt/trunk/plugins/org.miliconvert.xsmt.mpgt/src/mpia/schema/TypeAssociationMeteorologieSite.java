/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Meteorologie Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMeteorologieSite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMeteorologieSite#getAPourObjetSite <em>APour Objet Site</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMeteorologieSite#getAPourSujetElementMeteo <em>APour Sujet Element Meteo</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMeteorologieSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMeteorologieSite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMeteorologieSite extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMeteorologieSiteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMeteorologieSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMeteorologieSiteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMeteorologieSite_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMeteorologieSiteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMeteorologieSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMeteorologieSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMeteorologieSiteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMeteorologieSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMeteorologieSiteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMeteorologieSite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMeteorologieSiteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Objet Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Site</em>' containment reference.
	 * @see #setAPourObjetSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMeteorologieSite_APourObjetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMeteorologieSite' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourObjet_Site'"
	 * @generated
	 */
	TypeAssociation getAPourObjetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMeteorologieSite#getAPourObjetSite <em>APour Objet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Site</em>' containment reference.
	 * @see #getAPourObjetSite()
	 * @generated
	 */
	void setAPourObjetSite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Element Meteo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Element Meteo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Element Meteo</em>' containment reference.
	 * @see #setAPourSujetElementMeteo(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMeteorologieSite_APourSujetElementMeteo()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMeteorologieSite' target_entity='type_ElementMeteo'"
	 *        extendedMetaData="kind='element' name='APourSujet_ElementMeteo'"
	 * @generated
	 */
	TypeAssociation getAPourSujetElementMeteo();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMeteorologieSite#getAPourSujetElementMeteo <em>APour Sujet Element Meteo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Element Meteo</em>' containment reference.
	 * @see #getAPourSujetElementMeteo()
	 * @generated
	 */
	void setAPourSujetElementMeteo(TypeAssociation value);

} // TypeAssociationMeteorologieSite
