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
 * A representation of the model object '<em><b>Type Association Site Objet Inconnu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationSiteObjetInconnu#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationSiteObjetInconnu#getAPourObjetObjetInconnu <em>APour Objet Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationSiteObjetInconnu#getAPourSujetSite <em>APour Sujet Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteObjetInconnu()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationSiteObjetInconnu' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationSiteObjetInconnu extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationSiteObjetInconnuCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationSiteObjetInconnuCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteObjetInconnuCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteObjetInconnu_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationSiteObjetInconnuCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteObjetInconnu#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationSiteObjetInconnuCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationSiteObjetInconnuCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationSiteObjetInconnu#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteObjetInconnuCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationSiteObjetInconnu#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteObjetInconnuCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteObjetInconnu_APourObjetObjetInconnu()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationSiteObjetInconnu' target_entity='type_ObjetInconnu'"
	 *        extendedMetaData="kind='element' name='APourObjet_ObjetInconnu'"
	 * @generated
	 */
	TypeAssociation getAPourObjetObjetInconnu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteObjetInconnu#getAPourObjetObjetInconnu <em>APour Objet Objet Inconnu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Objet Inconnu</em>' containment reference.
	 * @see #getAPourObjetObjetInconnu()
	 * @generated
	 */
	void setAPourObjetObjetInconnu(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteObjetInconnu_APourSujetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationSiteObjetInconnu' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourSujet_Site'"
	 * @generated
	 */
	TypeAssociation getAPourSujetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteObjetInconnu#getAPourSujetSite <em>APour Sujet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Site</em>' containment reference.
	 * @see #getAPourSujetSite()
	 * @generated
	 */
	void setAPourSujetSite(TypeAssociation value);

} // TypeAssociationSiteObjetInconnu
