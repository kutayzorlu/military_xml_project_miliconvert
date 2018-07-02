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
 * A representation of the model object '<em><b>Type Association Entite Org Objet Inconnu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu#getAPourObjetObjetInconnu <em>APour Objet Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgObjetInconnu()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEntiteOrgObjetInconnu' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEntiteOrgObjetInconnu extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationEntiteOrgObjetInconnuCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgObjetInconnuCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgObjetInconnuCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgObjetInconnu_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationEntiteOrgObjetInconnuCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgObjetInconnuCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationEntiteOrgObjetInconnuCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgObjetInconnuCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgObjetInconnuCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Objet Objet Inconnu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Objet Inconnu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Objet Inconnu</em>' containment reference.
	 * @see #setAPourObjetObjetInconnu(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgObjetInconnu_APourObjetObjetInconnu()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEntiteOrgObjetInconnu' target_entity='type_ObjetInconnu'"
	 *        extendedMetaData="kind='element' name='APourObjet_ObjetInconnu'"
	 * @generated
	 */
	TypeAssociation getAPourObjetObjetInconnu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu#getAPourObjetObjetInconnu <em>APour Objet Objet Inconnu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Objet Inconnu</em>' containment reference.
	 * @see #getAPourObjetObjetInconnu()
	 * @generated
	 */
	void setAPourObjetObjetInconnu(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgObjetInconnu_APourSujetEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEntiteOrgObjetInconnu' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourSujet_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAPourSujetEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgObjetInconnu#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference.
	 * @see #getAPourSujetEntiteOrganisationnelle()
	 * @generated
	 */
	void setAPourSujetEntiteOrganisationnelle(TypeAssociationEXT value);

} // TypeAssociationEntiteOrgObjetInconnu
