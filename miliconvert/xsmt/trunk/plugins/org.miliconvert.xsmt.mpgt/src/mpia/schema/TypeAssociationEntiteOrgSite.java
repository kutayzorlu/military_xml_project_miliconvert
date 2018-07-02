/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Entite Org Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgSite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgSite#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgSite#getAPourObjetSite <em>APour Objet Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEntiteOrgSite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEntiteOrgSite extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationEntiteOrgSiteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgSiteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgSite_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationEntiteOrgSiteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationEntiteOrgSiteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgSiteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEntiteOrgSite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgSiteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference.
	 * @see #setAPourSujetEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgSite_APourSujetEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEntiteOrgSite' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourSujet_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAPourSujetEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgSite#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference.
	 * @see #getAPourSujetEntiteOrganisationnelle()
	 * @generated
	 */
	void setAPourSujetEntiteOrganisationnelle(TypeAssociationEXT value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgSite_APourObjetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEntiteOrgSite' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourObjet_Site'"
	 * @generated
	 */
	TypeAssociation getAPourObjetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgSite#getAPourObjetSite <em>APour Objet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Site</em>' containment reference.
	 * @see #getAPourObjetSite()
	 * @generated
	 */
	void setAPourObjetSite(TypeAssociation value);

} // TypeAssociationEntiteOrgSite
