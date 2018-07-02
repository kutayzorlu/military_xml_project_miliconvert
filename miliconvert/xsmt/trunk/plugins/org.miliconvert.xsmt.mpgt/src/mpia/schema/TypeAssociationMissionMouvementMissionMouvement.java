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
 * A representation of the model object '<em><b>Type Association Mission Mouvement Mission Mouvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement#getAssocieCommeObjetMissionMouvement <em>Associe Comme Objet Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement#getAssocieCommeSujetMissionMouvement <em>Associe Comme Sujet Mission Mouvement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionMouvementMissionMouvement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMissionMouvementMissionMouvement' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMissionMouvementMissionMouvement extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionMouvementMissionMouvement_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Mission Mouvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Mission Mouvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Mission Mouvement</em>' containment reference.
	 * @see #setAssocieCommeObjetMissionMouvement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionMouvementMissionMouvement_AssocieCommeObjetMissionMouvement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMissionMouvementMissionMouvement' target_entity='type_MissionMouvement'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_MissionMouvement'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetMissionMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement#getAssocieCommeObjetMissionMouvement <em>Associe Comme Objet Mission Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Mission Mouvement</em>' containment reference.
	 * @see #getAssocieCommeObjetMissionMouvement()
	 * @generated
	 */
	void setAssocieCommeObjetMissionMouvement(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Mission Mouvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Mission Mouvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Mission Mouvement</em>' containment reference.
	 * @see #setAssocieCommeSujetMissionMouvement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionMouvementMissionMouvement_AssocieCommeSujetMissionMouvement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMissionMouvementMissionMouvement' target_entity='type_MissionMouvement'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_MissionMouvement'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetMissionMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionMouvementMissionMouvement#getAssocieCommeSujetMissionMouvement <em>Associe Comme Sujet Mission Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Mission Mouvement</em>' containment reference.
	 * @see #getAssocieCommeSujetMissionMouvement()
	 * @generated
	 */
	void setAssocieCommeSujetMissionMouvement(TypeAssociation value);

} // TypeAssociationMissionMouvementMissionMouvement
