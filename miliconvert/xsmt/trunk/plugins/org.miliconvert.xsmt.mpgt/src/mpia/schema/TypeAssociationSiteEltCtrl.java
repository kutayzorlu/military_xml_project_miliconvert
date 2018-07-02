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
 * A representation of the model object '<em><b>Type Association Site Elt Ctrl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationSiteEltCtrl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationSiteEltCtrl#getAPourObjetElementControle <em>APour Objet Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationSiteEltCtrl#getAPourSujetSite <em>APour Sujet Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteEltCtrl()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationSiteEltCtrl' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationSiteEltCtrl extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationSiteEltCtrlCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationSiteEltCtrlCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteEltCtrlCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteEltCtrl_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationSiteEltCtrlCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteEltCtrl#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationSiteEltCtrlCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationSiteEltCtrlCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationSiteEltCtrl#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteEltCtrlCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationSiteEltCtrl#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteEltCtrlCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Objet Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Element Controle</em>' containment reference.
	 * @see #setAPourObjetElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteEltCtrl_APourObjetElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationSiteEltCtrl' target_entity='type_ElementControle'"
	 *        extendedMetaData="kind='element' name='APourObjet_ElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourObjetElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteEltCtrl#getAPourObjetElementControle <em>APour Objet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Element Controle</em>' containment reference.
	 * @see #getAPourObjetElementControle()
	 * @generated
	 */
	void setAPourObjetElementControle(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteEltCtrl_APourSujetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationSiteEltCtrl' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourSujet_Site'"
	 * @generated
	 */
	TypeAssociation getAPourSujetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteEltCtrl#getAPourSujetSite <em>APour Sujet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Site</em>' containment reference.
	 * @see #getAPourSujetSite()
	 * @generated
	 */
	void setAPourSujetSite(TypeAssociation value);

} // TypeAssociationSiteEltCtrl
