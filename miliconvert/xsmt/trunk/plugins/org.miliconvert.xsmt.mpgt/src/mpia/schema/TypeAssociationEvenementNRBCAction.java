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
 * A representation of the model object '<em><b>Type Association Evenement NRBC Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEvenementNRBCAction#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEvenementNRBCAction#getAssocieCommeSujetEvenementNRBC <em>Associe Comme Sujet Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEvenementNRBCAction#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementNRBCAction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEvenementNRBCAction' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEvenementNRBCAction extends TypeAssociationFonctionnelleActivite {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementNRBCAction_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEvenementNRBCAction#getCategorie <em>Categorie</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEvenementNRBCAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEvenementNRBCAction#getCategorie <em>Categorie</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Associe Comme Sujet Evenement NRBC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Evenement NRBC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Evenement NRBC</em>' containment reference.
	 * @see #setAssocieCommeSujetEvenementNRBC(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementNRBCAction_AssocieCommeSujetEvenementNRBC()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEvenementNRBCAction' target_entity='type_EvenementNRBC'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_EvenementNRBC'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetEvenementNRBC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEvenementNRBCAction#getAssocieCommeSujetEvenementNRBC <em>Associe Comme Sujet Evenement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Evenement NRBC</em>' containment reference.
	 * @see #getAssocieCommeSujetEvenementNRBC()
	 * @generated
	 */
	void setAssocieCommeSujetEvenementNRBC(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementNRBCAction_AssocieCommeObjetAction()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEvenementNRBCAction' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Action'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEvenementNRBCAction#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Action</em>' containment reference.
	 * @see #getAssocieCommeObjetAction()
	 * @generated
	 */
	void setAssocieCommeObjetAction(TypeAssociation value);

} // TypeAssociationEvenementNRBCAction
