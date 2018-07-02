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
 * A representation of the model object '<em><b>Type Association Mission Aerienne Mission Aerienne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne#getAssocieCommeObjetMissionAerienne <em>Associe Comme Objet Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne#getAssocieCommeSujetMissionAerienne <em>Associe Comme Sujet Mission Aerienne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionAerienneMissionAerienne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMissionAerienneMissionAerienne' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMissionAerienneMissionAerienne extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionAerienneMissionAerienne_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Mission Aerienne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Mission Aerienne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Mission Aerienne</em>' containment reference.
	 * @see #setAssocieCommeObjetMissionAerienne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionAerienneMissionAerienne_AssocieCommeObjetMissionAerienne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMissionAerienneMissionAerienne' target_entity='type_MissionAerienne'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_MissionAerienne'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetMissionAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne#getAssocieCommeObjetMissionAerienne <em>Associe Comme Objet Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Mission Aerienne</em>' containment reference.
	 * @see #getAssocieCommeObjetMissionAerienne()
	 * @generated
	 */
	void setAssocieCommeObjetMissionAerienne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Mission Aerienne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Mission Aerienne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Mission Aerienne</em>' containment reference.
	 * @see #setAssocieCommeSujetMissionAerienne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionAerienneMissionAerienne_AssocieCommeSujetMissionAerienne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMissionAerienneMissionAerienne' target_entity='type_MissionAerienne'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_MissionAerienne'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetMissionAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionAerienneMissionAerienne#getAssocieCommeSujetMissionAerienne <em>Associe Comme Sujet Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Mission Aerienne</em>' containment reference.
	 * @see #getAssocieCommeSujetMissionAerienne()
	 * @generated
	 */
	void setAssocieCommeSujetMissionAerienne(TypeAssociation value);

} // TypeAssociationMissionAerienneMissionAerienne
