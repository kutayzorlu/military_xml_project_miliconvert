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
 * A representation of the model object '<em><b>Type Association Objet Inconnu Elt Ctrl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationObjetInconnuEltCtrl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjetInconnuEltCtrl#getAPourObjetElementControle <em>APour Objet Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjetInconnuEltCtrl#getAPourSujetObjetInconnu <em>APour Sujet Objet Inconnu</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuEltCtrl()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationObjetInconnuEltCtrl' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationObjetInconnuEltCtrl extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationObjetInconnuEltCtrlCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationObjetInconnuEltCtrlCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjetInconnuEltCtrlCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuEltCtrl_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationObjetInconnuEltCtrlCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltCtrl#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationObjetInconnuEltCtrlCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationObjetInconnuEltCtrlCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltCtrl#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjetInconnuEltCtrlCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltCtrl#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjetInconnuEltCtrlCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuEltCtrl_APourObjetElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationObjetInconnuEltCtrl' target_entity='type_ElementControle'"
	 *        extendedMetaData="kind='element' name='APourObjet_ElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourObjetElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltCtrl#getAPourObjetElementControle <em>APour Objet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Element Controle</em>' containment reference.
	 * @see #getAPourObjetElementControle()
	 * @generated
	 */
	void setAPourObjetElementControle(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuEltCtrl_APourSujetObjetInconnu()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationObjetInconnuEltCtrl' target_entity='type_ObjetInconnu'"
	 *        extendedMetaData="kind='element' name='APourSujet_ObjetInconnu'"
	 * @generated
	 */
	TypeAssociation getAPourSujetObjetInconnu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltCtrl#getAPourSujetObjetInconnu <em>APour Sujet Objet Inconnu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Objet Inconnu</em>' containment reference.
	 * @see #getAPourSujetObjetInconnu()
	 * @generated
	 */
	void setAPourSujetObjetInconnu(TypeAssociation value);

} // TypeAssociationObjetInconnuEltCtrl
