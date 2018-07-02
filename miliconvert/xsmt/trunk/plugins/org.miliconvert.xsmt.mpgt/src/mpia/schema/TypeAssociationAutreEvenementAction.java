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
 * A representation of the model object '<em><b>Type Association Autre Evenement Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationAutreEvenementAction#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAutreEvenementAction#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAutreEvenementAction#getAssocieCommeSujetAutreEvenement <em>Associe Comme Sujet Autre Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationAutreEvenementAction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationAutreEvenementAction' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationAutreEvenementAction extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAutreEvenementAction_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAutreEvenementAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationAutreEvenementAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationAutreEvenementAction#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Action</em>' containment reference.
	 * @see #setAssocieCommeObjetAction(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAutreEvenementAction_AssocieCommeObjetAction()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationAutreEvenementAction' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Action'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAutreEvenementAction#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Action</em>' containment reference.
	 * @see #getAssocieCommeObjetAction()
	 * @generated
	 */
	void setAssocieCommeObjetAction(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Autre Evenement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Autre Evenement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Autre Evenement</em>' containment reference.
	 * @see #setAssocieCommeSujetAutreEvenement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAutreEvenementAction_AssocieCommeSujetAutreEvenement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationAutreEvenementAction' target_entity='type_AutreEvenement'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_AutreEvenement'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetAutreEvenement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAutreEvenementAction#getAssocieCommeSujetAutreEvenement <em>Associe Comme Sujet Autre Evenement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Autre Evenement</em>' containment reference.
	 * @see #getAssocieCommeSujetAutreEvenement()
	 * @generated
	 */
	void setAssocieCommeSujetAutreEvenement(TypeAssociation value);

} // TypeAssociationAutreEvenementAction
