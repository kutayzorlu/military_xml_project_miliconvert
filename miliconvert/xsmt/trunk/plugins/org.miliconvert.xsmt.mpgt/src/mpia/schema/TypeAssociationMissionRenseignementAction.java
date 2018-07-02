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
 * A representation of the model object '<em><b>Type Association Mission Renseignement Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMissionRenseignementAction#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionRenseignementAction#getAssocieCommeSujetMissionRenseignement <em>Associe Comme Sujet Mission Renseignement</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionRenseignementAction#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRenseignementAction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMissionRenseignementAction' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMissionRenseignementAction extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMissionRenseignementActionCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMissionRenseignementActionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionRenseignementActionCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRenseignementAction_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMissionRenseignementActionCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionRenseignementAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMissionRenseignementActionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMissionRenseignementActionCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMissionRenseignementAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionRenseignementActionCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMissionRenseignementAction#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionRenseignementActionCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Mission Renseignement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Mission Renseignement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Mission Renseignement</em>' containment reference.
	 * @see #setAssocieCommeSujetMissionRenseignement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRenseignementAction_AssocieCommeSujetMissionRenseignement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMissionRenseignementAction' target_entity='type_MissionRenseignement'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_MissionRenseignement'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetMissionRenseignement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionRenseignementAction#getAssocieCommeSujetMissionRenseignement <em>Associe Comme Sujet Mission Renseignement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Mission Renseignement</em>' containment reference.
	 * @see #getAssocieCommeSujetMissionRenseignement()
	 * @generated
	 */
	void setAssocieCommeSujetMissionRenseignement(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRenseignementAction_AssocieCommeObjetAction()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMissionRenseignementAction' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Action'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionRenseignementAction#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Action</em>' containment reference.
	 * @see #getAssocieCommeObjetAction()
	 * @generated
	 */
	void setAssocieCommeObjetAction(TypeAssociation value);

} // TypeAssociationMissionRenseignementAction
