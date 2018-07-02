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
 * A representation of the model object '<em><b>Type Association Mission Melee Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMissionMeleeAction#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionMeleeAction#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionMeleeAction#getAssocieCommeSujetMissionMelee <em>Associe Comme Sujet Mission Melee</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionMeleeAction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMissionMeleeAction' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMissionMeleeAction extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationFonctionnelleHSACategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleHSACategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionMeleeAction_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleHSACategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionMeleeAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleHSACategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMissionMeleeAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMissionMeleeAction#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionMeleeAction_AssocieCommeObjetAction()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMissionMeleeAction' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Action'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionMeleeAction#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Action</em>' containment reference.
	 * @see #getAssocieCommeObjetAction()
	 * @generated
	 */
	void setAssocieCommeObjetAction(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Mission Melee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Mission Melee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Mission Melee</em>' containment reference.
	 * @see #setAssocieCommeSujetMissionMelee(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionMeleeAction_AssocieCommeSujetMissionMelee()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMissionMeleeAction' target_entity='type_MissionMelee'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_MissionMelee'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetMissionMelee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionMeleeAction#getAssocieCommeSujetMissionMelee <em>Associe Comme Sujet Mission Melee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Mission Melee</em>' containment reference.
	 * @see #getAssocieCommeSujetMissionMelee()
	 * @generated
	 */
	void setAssocieCommeSujetMissionMelee(TypeAssociation value);

} // TypeAssociationMissionMeleeAction
