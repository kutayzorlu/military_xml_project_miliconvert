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
 * A representation of the model object '<em><b>Type Mission Unite Antichar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionUniteAntichar#getDescriptionGeneraleMission <em>Description Generale Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionUniteAntichar#getEffetsTactiquesRecherches <em>Effets Tactiques Recherches</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionUniteAntichar#getAPourZoneABattreFeuxAutreElementControle <em>APour Zone ABattre Feux Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionUniteAntichar#getAPourZoneASurveillerAutreElementControle <em>APour Zone ASurveiller Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionUniteAntichar#getACommeMunitionsConsommeeConsommationEnMunitions <em>AComme Munitions Consommee Consommation En Munitions</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionUniteAntichar#getAPourItineraireDeplacementItineraire <em>APour Itineraire Deplacement Itineraire</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionUniteAntichar#getAPourUniteAntiCharUnite <em>APour Unite Anti Char Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionUniteAntichar#getEstObjetAssociationUniteMissionUniteAntichar <em>Est Objet Association Unite Mission Unite Antichar</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionUniteAntichar()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionUniteAntichar' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionUniteAntichar extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Description Generale Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Generale Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Generale Mission</em>' attribute.
	 * @see #setDescriptionGeneraleMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionUniteAntichar_DescriptionGeneraleMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        extendedMetaData="kind='element' name='DescriptionGeneraleMission'"
	 * @generated
	 */
	String getDescriptionGeneraleMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionUniteAntichar#getDescriptionGeneraleMission <em>Description Generale Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Generale Mission</em>' attribute.
	 * @see #getDescriptionGeneraleMission()
	 * @generated
	 */
	void setDescriptionGeneraleMission(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMissionUniteAntichar_EffetsTactiquesRecherches()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='EffetsTactiquesRecherches'"
	 * @generated
	 */
	String getEffetsTactiquesRecherches();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionUniteAntichar#getEffetsTactiquesRecherches <em>Effets Tactiques Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effets Tactiques Recherches</em>' attribute.
	 * @see #getEffetsTactiquesRecherches()
	 * @generated
	 */
	void setEffetsTactiquesRecherches(String value);

	/**
	 * Returns the value of the '<em><b>APour Zone ABattre Feux Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone ABattre Feux Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone ABattre Feux Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionUniteAntichar_APourZoneABattreFeuxAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneABattreFeux_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneABattreFeuxAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Zone ASurveiller Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone ASurveiller Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone ASurveiller Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionUniteAntichar_APourZoneASurveillerAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneASurveiller_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneASurveillerAutreElementControle();

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
	 * @see mpia.schema.SchemaPackage#getTypeMissionUniteAntichar_ACommeMunitionsConsommeeConsommationEnMunitions()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsommationEnMunitions'"
	 *        extendedMetaData="kind='element' name='ACommeMunitionsConsommee_ConsommationEnMunitions'"
	 * @generated
	 */
	EList<TypeConsommationEnMunitions> getACommeMunitionsConsommeeConsommationEnMunitions();

	/**
	 * Returns the value of the '<em><b>APour Itineraire Deplacement Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Itineraire Deplacement Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Itineraire Deplacement Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionUniteAntichar_APourItineraireDeplacementItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Itineraire'"
	 *        extendedMetaData="kind='element' name='APourItineraireDeplacement_Itineraire'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourItineraireDeplacementItineraire();

	/**
	 * Returns the value of the '<em><b>APour Unite Anti Char Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Anti Char Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Anti Char Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionUniteAntichar_APourUniteAntiCharUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteAntiChar_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteAntiCharUnite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Unite Antichar</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Unite Antichar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Unite Antichar</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionUniteAntichar_EstObjetAssociationUniteMissionUniteAntichar()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionUniteAntichar' target_entity='type_AssociationUniteMissionUniteAntichar'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionUniteAntichar'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionUniteAntichar();

} // TypeMissionUniteAntichar
