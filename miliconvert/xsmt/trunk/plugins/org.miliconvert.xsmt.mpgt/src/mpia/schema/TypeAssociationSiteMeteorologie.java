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
 * A representation of the model object '<em><b>Type Association Site Meteorologie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationSiteMeteorologie#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationSiteMeteorologie#getAPourObjetElementMeteo <em>APour Objet Element Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationSiteMeteorologie#getAPourSujetSite <em>APour Sujet Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteMeteorologie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationSiteMeteorologie' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationSiteMeteorologie extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationSiteMeteorologieCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationSiteMeteorologieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteMeteorologieCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteMeteorologie_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationSiteMeteorologieCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteMeteorologie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationSiteMeteorologieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationSiteMeteorologieCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationSiteMeteorologie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteMeteorologieCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationSiteMeteorologie#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteMeteorologieCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Objet Element Meteo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Element Meteo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Element Meteo</em>' containment reference.
	 * @see #setAPourObjetElementMeteo(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteMeteorologie_APourObjetElementMeteo()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationSiteMeteorologie' target_entity='type_ElementMeteo'"
	 *        extendedMetaData="kind='element' name='APourObjet_ElementMeteo'"
	 * @generated
	 */
	TypeAssociation getAPourObjetElementMeteo();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteMeteorologie#getAPourObjetElementMeteo <em>APour Objet Element Meteo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Element Meteo</em>' containment reference.
	 * @see #getAPourObjetElementMeteo()
	 * @generated
	 */
	void setAPourObjetElementMeteo(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Site</em>' containment reference.
	 * @see #setAPourSujetSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteMeteorologie_APourSujetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationSiteMeteorologie' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourSujet_Site'"
	 * @generated
	 */
	TypeAssociation getAPourSujetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteMeteorologie#getAPourSujetSite <em>APour Sujet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Site</em>' containment reference.
	 * @see #getAPourSujetSite()
	 * @generated
	 */
	void setAPourSujetSite(TypeAssociation value);

} // TypeAssociationSiteMeteorologie
