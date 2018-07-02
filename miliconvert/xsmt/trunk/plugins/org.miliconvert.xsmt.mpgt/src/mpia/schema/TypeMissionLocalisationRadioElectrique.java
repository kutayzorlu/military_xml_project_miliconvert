/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Localisation Radio Electrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getDistance <em>Distance</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getPointLateralDroitPointGeometrique <em>Point Lateral Droit Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getCentreGraviteZoneUtilePointGeometrique <em>Centre Gravite Zone Utile Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getPointStationPrincipalePointGeometrique <em>Point Station Principale Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getPointLateralGauchePointGeometrique <em>Point Lateral Gauche Point Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionLocalisationRadioElectrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MissionLocalisationRadioElectrique' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionLocalisationRadioElectrique extends EObject {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #isSetDistance()
	 * @see #unsetDistance()
	 * @see #setDistance(double)
	 * @see mpia.schema.SchemaPackage#getTypeMissionLocalisationRadioElectrique_Distance()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Distance'"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #isSetDistance()
	 * @see #unsetDistance()
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistance()
	 * @see #getDistance()
	 * @see #setDistance(double)
	 * @generated
	 */
	void unsetDistance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getDistance <em>Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance</em>' attribute is set.
	 * @see #unsetDistance()
	 * @see #getDistance()
	 * @see #setDistance(double)
	 * @generated
	 */
	boolean isSetDistance();

	/**
	 * Returns the value of the '<em><b>Point Lateral Droit Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Lateral Droit Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Lateral Droit Point Geometrique</em>' containment reference.
	 * @see #setPointLateralDroitPointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionLocalisationRadioElectrique_PointLateralDroitPointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='PointLateralDroit_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getPointLateralDroitPointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getPointLateralDroitPointGeometrique <em>Point Lateral Droit Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Lateral Droit Point Geometrique</em>' containment reference.
	 * @see #getPointLateralDroitPointGeometrique()
	 * @generated
	 */
	void setPointLateralDroitPointGeometrique(TypePointGeometrique value);

	/**
	 * Returns the value of the '<em><b>Centre Gravite Zone Utile Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Gravite Zone Utile Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Gravite Zone Utile Point Geometrique</em>' containment reference.
	 * @see #setCentreGraviteZoneUtilePointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionLocalisationRadioElectrique_CentreGraviteZoneUtilePointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='CentreGraviteZoneUtile_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getCentreGraviteZoneUtilePointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getCentreGraviteZoneUtilePointGeometrique <em>Centre Gravite Zone Utile Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Gravite Zone Utile Point Geometrique</em>' containment reference.
	 * @see #getCentreGraviteZoneUtilePointGeometrique()
	 * @generated
	 */
	void setCentreGraviteZoneUtilePointGeometrique(TypePointGeometrique value);

	/**
	 * Returns the value of the '<em><b>Point Station Principale Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Station Principale Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Station Principale Point Geometrique</em>' containment reference.
	 * @see #setPointStationPrincipalePointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionLocalisationRadioElectrique_PointStationPrincipalePointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='PointStationPrincipale_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getPointStationPrincipalePointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getPointStationPrincipalePointGeometrique <em>Point Station Principale Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Station Principale Point Geometrique</em>' containment reference.
	 * @see #getPointStationPrincipalePointGeometrique()
	 * @generated
	 */
	void setPointStationPrincipalePointGeometrique(TypePointGeometrique value);

	/**
	 * Returns the value of the '<em><b>Point Lateral Gauche Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Lateral Gauche Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Lateral Gauche Point Geometrique</em>' containment reference.
	 * @see #setPointLateralGauchePointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionLocalisationRadioElectrique_PointLateralGauchePointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='PointLateralGauche_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getPointLateralGauchePointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionLocalisationRadioElectrique#getPointLateralGauchePointGeometrique <em>Point Lateral Gauche Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Lateral Gauche Point Geometrique</em>' containment reference.
	 * @see #getPointLateralGauchePointGeometrique()
	 * @generated
	 */
	void setPointLateralGauchePointGeometrique(TypePointGeometrique value);

} // TypeMissionLocalisationRadioElectrique
