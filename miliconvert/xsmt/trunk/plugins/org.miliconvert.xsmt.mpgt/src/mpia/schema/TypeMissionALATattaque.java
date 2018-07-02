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
 * A representation of the model object '<em><b>Type Mission ALA Tattaque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getDescriptionMission <em>Description Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getEffetsTactiquesRecherches <em>Effets Tactiques Recherches</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getTypeAppui <em>Type Appui</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getAPourUniteAlatUnite <em>APour Unite Alat Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getAPourUniteAppuiUnite <em>APour Unite Appui Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getEstObjetAssociationUniteMissionALATattaque <em>Est Objet Association Unite Mission ALA Tattaque</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getACommeMunitionsConsommeeConsommationEnMunitions <em>AComme Munitions Consommee Consommation En Munitions</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getAPourZoneAttenteDeENIAutreElementControle <em>APour Zone Attente De ENI Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getAPourZoneInterventionAutreElementControle <em>APour Zone Intervention Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionALATattaque#getAPourItineraireRoutierItineraire <em>APour Itineraire Routier Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionALATattaque' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionALATattaque extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Description Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Mission</em>' attribute.
	 * @see #setDescriptionMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_DescriptionMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='DescriptionMission'"
	 * @generated
	 */
	String getDescriptionMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionALATattaque#getDescriptionMission <em>Description Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Mission</em>' attribute.
	 * @see #getDescriptionMission()
	 * @generated
	 */
	void setDescriptionMission(String value);

	/**
	 * Returns the value of the '<em><b>Effets Tactiques Recherches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effets Tactiques Recherches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effets Tactiques Recherches</em>' attribute.
	 * @see #setEffetsTactiquesRecherches(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_EffetsTactiquesRecherches()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='EffetsTactiquesRecherches'"
	 * @generated
	 */
	String getEffetsTactiquesRecherches();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionALATattaque#getEffetsTactiquesRecherches <em>Effets Tactiques Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effets Tactiques Recherches</em>' attribute.
	 * @see #getEffetsTactiquesRecherches()
	 * @generated
	 */
	void setEffetsTactiquesRecherches(String value);

	/**
	 * Returns the value of the '<em><b>Type Appui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Appui</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Appui</em>' attribute.
	 * @see #setTypeAppui(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_TypeAppui()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='TypeAppui'"
	 * @generated
	 */
	String getTypeAppui();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionALATattaque#getTypeAppui <em>Type Appui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Appui</em>' attribute.
	 * @see #getTypeAppui()
	 * @generated
	 */
	void setTypeAppui(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Alat Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Alat Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Alat Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_APourUniteAlatUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteAlat_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteAlatUnite();

	/**
	 * Returns the value of the '<em><b>APour Unite Appui Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Appui Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Appui Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_APourUniteAppuiUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteAppui_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteAppuiUnite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission ALA Tattaque</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission ALA Tattaque</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission ALA Tattaque</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_EstObjetAssociationUniteMissionALATattaque()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionALATattaque' target_entity='type_AssociationUniteMissionALATattaque'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionALATattaque'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionALATattaque();

	/**
	 * Returns the value of the '<em><b>AComme Munitions Consommee Consommation En Munitions</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsommationEnMunitions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Munitions Consommee Consommation En Munitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Munitions Consommee Consommation En Munitions</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_ACommeMunitionsConsommeeConsommationEnMunitions()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsommationEnMunitions'"
	 *        extendedMetaData="kind='element' name='ACommeMunitionsConsommee_ConsommationEnMunitions'"
	 * @generated
	 */
	EList<TypeConsommationEnMunitions> getACommeMunitionsConsommeeConsommationEnMunitions();

	/**
	 * Returns the value of the '<em><b>APour Zone Attente De ENI Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Attente De ENI Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Attente De ENI Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_APourZoneAttenteDeENIAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneAttenteDeENI_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneAttenteDeENIAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Zone Intervention Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Intervention Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Intervention Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_APourZoneInterventionAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneIntervention_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneInterventionAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Itineraire Routier Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Itineraire Routier Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Itineraire Routier Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionALATattaque_APourItineraireRoutierItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Itineraire'"
	 *        extendedMetaData="kind='element' name='APourItineraireRoutier_Itineraire'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourItineraireRoutierItineraire();

} // TypeMissionALATattaque
