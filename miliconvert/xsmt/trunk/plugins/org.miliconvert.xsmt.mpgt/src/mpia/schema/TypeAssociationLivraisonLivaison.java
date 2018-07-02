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
 * A representation of the model object '<em><b>Type Association Livraison Livaison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationLivraisonLivaison#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationLivraisonLivaison#getAssocieCommeSujetLivraison <em>Associe Comme Sujet Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationLivraisonLivaison#getAssocieCommeObjetLivraison <em>Associe Comme Objet Livraison</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationLivraisonLivaison()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationLivraisonLivaison' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationLivraisonLivaison extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationLivraisonLivaisonCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationLivraisonLivaisonCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationLivraisonLivaisonCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationLivraisonLivaison_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationLivraisonLivaisonCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationLivraisonLivaison#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationLivraisonLivaisonCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationLivraisonLivaisonCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationLivraisonLivaison#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationLivraisonLivaisonCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationLivraisonLivaison#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationLivraisonLivaisonCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Livraison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Livraison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Livraison</em>' containment reference.
	 * @see #setAssocieCommeSujetLivraison(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationLivraisonLivaison_AssocieCommeSujetLivraison()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationLivraisonLivaison' target_entity='type_Livraison'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_Livraison'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetLivraison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationLivraisonLivaison#getAssocieCommeSujetLivraison <em>Associe Comme Sujet Livraison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Livraison</em>' containment reference.
	 * @see #getAssocieCommeSujetLivraison()
	 * @generated
	 */
	void setAssocieCommeSujetLivraison(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Livraison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Livraison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Livraison</em>' containment reference.
	 * @see #setAssocieCommeObjetLivraison(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationLivraisonLivaison_AssocieCommeObjetLivraison()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationLivraisonLivaison' target_entity='type_Livraison'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Livraison'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetLivraison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationLivraisonLivaison#getAssocieCommeObjetLivraison <em>Associe Comme Objet Livraison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Livraison</em>' containment reference.
	 * @see #getAssocieCommeObjetLivraison()
	 * @generated
	 */
	void setAssocieCommeObjetLivraison(TypeAssociation value);

} // TypeAssociationLivraisonLivaison
