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
 * A representation of the model object '<em><b>Type Association Elt Ctrl Elt Ctrl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEltCtrlEltCtrl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEltCtrlEltCtrl#getAPourSujetElementControle <em>APour Sujet Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEltCtrlEltCtrl#getAPourObjetElementControle <em>APour Objet Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlEltCtrl()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEltCtrlEltCtrl' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEltCtrlEltCtrl extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlEltCtrl_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltCtrlEltCtrl#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEltCtrlEltCtrl#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEltCtrlEltCtrl#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Element Controle</em>' containment reference.
	 * @see #setAPourSujetElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlEltCtrl_APourSujetElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEltCtrlEltCtrl' target_entity='type_ElementControle'"
	 *        extendedMetaData="kind='element' name='APourSujet_ElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourSujetElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltCtrlEltCtrl#getAPourSujetElementControle <em>APour Sujet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Element Controle</em>' containment reference.
	 * @see #getAPourSujetElementControle()
	 * @generated
	 */
	void setAPourSujetElementControle(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlEltCtrl_APourObjetElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEltCtrlEltCtrl' target_entity='type_ElementControle'"
	 *        extendedMetaData="kind='element' name='APourObjet_ElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourObjetElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltCtrlEltCtrl#getAPourObjetElementControle <em>APour Objet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Element Controle</em>' containment reference.
	 * @see #getAPourObjetElementControle()
	 * @generated
	 */
	void setAPourObjetElementControle(TypeAssociation value);

} // TypeAssociationEltCtrlEltCtrl
