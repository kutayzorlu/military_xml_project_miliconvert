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
 * A representation of the model object '<em><b>Type Association Mission Genie Mission Genie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMissionGenieMissionGenie#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionGenieMissionGenie#getAssocieCommeSujetMissionGenie <em>Associe Comme Sujet Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionGenieMissionGenie#getAssocieCommeObjetMissionGenie <em>Associe Comme Objet Mission Genie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionGenieMissionGenie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMissionGenieMissionGenie' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMissionGenieMissionGenie extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionGenieMissionGenie_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionGenieMissionGenie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMissionGenieMissionGenie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMissionGenieMissionGenie#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Mission Genie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Mission Genie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Mission Genie</em>' containment reference.
	 * @see #setAssocieCommeSujetMissionGenie(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionGenieMissionGenie_AssocieCommeSujetMissionGenie()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMissionGenieMissionGenie' target_entity='type_MissionGenie'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_MissionGenie'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetMissionGenie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionGenieMissionGenie#getAssocieCommeSujetMissionGenie <em>Associe Comme Sujet Mission Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Mission Genie</em>' containment reference.
	 * @see #getAssocieCommeSujetMissionGenie()
	 * @generated
	 */
	void setAssocieCommeSujetMissionGenie(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Mission Genie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Mission Genie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Mission Genie</em>' containment reference.
	 * @see #setAssocieCommeObjetMissionGenie(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionGenieMissionGenie_AssocieCommeObjetMissionGenie()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMissionGenieMissionGenie' target_entity='type_MissionGenie'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_MissionGenie'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetMissionGenie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionGenieMissionGenie#getAssocieCommeObjetMissionGenie <em>Associe Comme Objet Mission Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Mission Genie</em>' containment reference.
	 * @see #getAssocieCommeObjetMissionGenie()
	 * @generated
	 */
	void setAssocieCommeObjetMissionGenie(TypeAssociation value);

} // TypeAssociationMissionGenieMissionGenie
