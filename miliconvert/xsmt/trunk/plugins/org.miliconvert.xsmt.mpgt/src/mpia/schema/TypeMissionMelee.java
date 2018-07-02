/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Melee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionMelee#getIntitule <em>Intitule</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMelee#getEstSujetAssociationMissionMeleeAction <em>Est Sujet Association Mission Melee Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMelee#getConcerneEchelon <em>Concerne Echelon</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMelee#getDecritDeploiementUnitesAssocInstanceObjetLocalisation <em>Decrit Deploiement Unites Assoc Instance Objet Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMelee#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMelee#getAPourUniteAppuiGenieUnite <em>APour Unite Appui Genie Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMelee#getEstObjetAssociationUniteMissionMelee <em>Est Objet Association Unite Mission Melee</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionMelee()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionMelee' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionMelee extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intitule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule</em>' attribute.
	 * @see #setIntitule(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMelee_Intitule()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Intitule'"
	 * @generated
	 */
	String getIntitule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMelee#getIntitule <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule</em>' attribute.
	 * @see #getIntitule()
	 * @generated
	 */
	void setIntitule(String value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mission Melee Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mission Melee Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mission Melee Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMelee_EstSujetAssociationMissionMeleeAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_MissionMelee' target_entity='type_AssociationMissionMeleeAction'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMissionMeleeAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMissionMeleeAction();

	/**
	 * Returns the value of the '<em><b>Concerne Echelon</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Echelon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Echelon</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMelee_ConcerneEchelon()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstApplique_MissionMelee' target_entity='type_Echelon'"
	 *        extendedMetaData="kind='element' name='Concerne_Echelon'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneEchelon();

	/**
	 * Returns the value of the '<em><b>Decrit Deploiement Unites Assoc Instance Objet Localisation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocInstanceObjetLocalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrit Deploiement Unites Assoc Instance Objet Localisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrit Deploiement Unites Assoc Instance Objet Localisation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMelee_DecritDeploiementUnitesAssocInstanceObjetLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AssocInstanceObjetLocalisation'"
	 *        extendedMetaData="kind='element' name='DecritDeploiementUnites_AssocInstanceObjetLocalisation'"
	 * @generated
	 */
	EList<TypeAssocInstanceObjetLocalisation> getDecritDeploiementUnitesAssocInstanceObjetLocalisation();

	/**
	 * Returns the value of the '<em><b>APour Unite Executante Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Executante Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Executante Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMelee_APourUniteExecutanteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUnite();

	/**
	 * Returns the value of the '<em><b>APour Unite Appui Genie Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Appui Genie Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Appui Genie Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMelee_APourUniteAppuiGenieUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteAppuiGenie_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteAppuiGenieUnite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Melee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Melee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Melee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMelee_EstObjetAssociationUniteMissionMelee()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionMelee' target_entity='type_AssociationUniteMissionMelee'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionMelee'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionMelee();

} // TypeMissionMelee
