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
 * A representation of the model object '<em><b>Type Association Planification Operation3 DMission ASA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA#getAssocieCommeObjetMissionASA <em>Associe Comme Objet Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA#getAssocieCommeSujetPlanificationOperation3D <em>Associe Comme Sujet Planification Operation3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanificationOperation3DMissionASA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationPlanificationOperation3DMissionASA' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationPlanificationOperation3DMissionASA extends TypeAssociationFonctionnelleActivite {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanificationOperation3DMissionASA_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA#getCategorie <em>Categorie</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA#getCategorie <em>Categorie</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Associe Comme Objet Mission ASA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Mission ASA</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Mission ASA</em>' containment reference.
	 * @see #setAssocieCommeObjetMissionASA(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanificationOperation3DMissionASA_AssocieCommeObjetMissionASA()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationPlanificationOperation3DMissionASA' target_entity='type_MissionASA'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_MissionASA'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetMissionASA();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA#getAssocieCommeObjetMissionASA <em>Associe Comme Objet Mission ASA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Mission ASA</em>' containment reference.
	 * @see #getAssocieCommeObjetMissionASA()
	 * @generated
	 */
	void setAssocieCommeObjetMissionASA(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Planification Operation3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Planification Operation3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Planification Operation3 D</em>' containment reference.
	 * @see #setAssocieCommeSujetPlanificationOperation3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanificationOperation3DMissionASA_AssocieCommeSujetPlanificationOperation3D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationPlanificationOperation3DMissionASA' target_entity='type_PlanificationOperation3D'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_PlanificationOperation3D'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetPlanificationOperation3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanificationOperation3DMissionASA#getAssocieCommeSujetPlanificationOperation3D <em>Associe Comme Sujet Planification Operation3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Planification Operation3 D</em>' containment reference.
	 * @see #getAssocieCommeSujetPlanificationOperation3D()
	 * @generated
	 */
	void setAssocieCommeSujetPlanificationOperation3D(TypeAssociation value);

} // TypeAssociationPlanificationOperation3DMissionASA
