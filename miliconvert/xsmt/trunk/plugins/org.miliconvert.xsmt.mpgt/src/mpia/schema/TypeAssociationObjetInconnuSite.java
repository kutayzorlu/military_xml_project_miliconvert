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
 * A representation of the model object '<em><b>Type Association Objet Inconnu Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationObjetInconnuSite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjetInconnuSite#getAPourSujetObjetInconnu <em>APour Sujet Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjetInconnuSite#getAPourObjetSite <em>APour Objet Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationObjetInconnuSite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationObjetInconnuSite extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationObjetInconnuSiteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationObjetInconnuSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjetInconnuSiteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuSite_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationObjetInconnuSiteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationObjetInconnuSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationObjetInconnuSiteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjetInconnuSiteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationObjetInconnuSite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjetInconnuSiteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Objet Inconnu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Objet Inconnu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Objet Inconnu</em>' containment reference.
	 * @see #setAPourSujetObjetInconnu(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuSite_APourSujetObjetInconnu()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationObjetInconnuSite' target_entity='type_ObjetInconnu'"
	 *        extendedMetaData="kind='element' name='APourSujet_ObjetInconnu'"
	 * @generated
	 */
	TypeAssociation getAPourSujetObjetInconnu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuSite#getAPourSujetObjetInconnu <em>APour Sujet Objet Inconnu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Objet Inconnu</em>' containment reference.
	 * @see #getAPourSujetObjetInconnu()
	 * @generated
	 */
	void setAPourSujetObjetInconnu(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuSite_APourObjetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationObjetInconnuSite' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourObjet_Site'"
	 * @generated
	 */
	TypeAssociation getAPourObjetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuSite#getAPourObjetSite <em>APour Objet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Site</em>' containment reference.
	 * @see #getAPourObjetSite()
	 * @generated
	 */
	void setAPourObjetSite(TypeAssociation value);

} // TypeAssociationObjetInconnuSite
