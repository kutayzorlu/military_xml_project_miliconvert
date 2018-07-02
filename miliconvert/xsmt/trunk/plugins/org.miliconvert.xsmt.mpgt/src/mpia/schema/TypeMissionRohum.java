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
 * A representation of the model object '<em><b>Type Mission Rohum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionRohum#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRohum#getAngleSecteur <em>Angle Secteur</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRohum#getItineraireObserverLigneGeometrique <em>Itineraire Observer Ligne Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRohum#getOrigineSecteurPointGeometrique <em>Origine Secteur Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRohum#getDirectionObservationPointGeometrique <em>Direction Observation Point Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionRohum()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MissionRohum' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionRohum extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMissionRohum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionRohum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoTypeMissionRohum)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRohum_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMissionRohum getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRohum#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionRohum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoTypeMissionRohum value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionRohum#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoTypeMissionRohum)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionRohum#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoTypeMissionRohum)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Angle Secteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Secteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Secteur</em>' attribute.
	 * @see #isSetAngleSecteur()
	 * @see #unsetAngleSecteur()
	 * @see #setAngleSecteur(double)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRohum_AngleSecteur()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='AngleSecteur'"
	 * @generated
	 */
	double getAngleSecteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRohum#getAngleSecteur <em>Angle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Secteur</em>' attribute.
	 * @see #isSetAngleSecteur()
	 * @see #unsetAngleSecteur()
	 * @see #getAngleSecteur()
	 * @generated
	 */
	void setAngleSecteur(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionRohum#getAngleSecteur <em>Angle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngleSecteur()
	 * @see #getAngleSecteur()
	 * @see #setAngleSecteur(double)
	 * @generated
	 */
	void unsetAngleSecteur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionRohum#getAngleSecteur <em>Angle Secteur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angle Secteur</em>' attribute is set.
	 * @see #unsetAngleSecteur()
	 * @see #getAngleSecteur()
	 * @see #setAngleSecteur(double)
	 * @generated
	 */
	boolean isSetAngleSecteur();

	/**
	 * Returns the value of the '<em><b>Itineraire Observer Ligne Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itineraire Observer Ligne Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itineraire Observer Ligne Geometrique</em>' containment reference.
	 * @see #setItineraireObserverLigneGeometrique(TypeLigneGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRohum_ItineraireObserverLigneGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LigneGeometrique'"
	 *        extendedMetaData="kind='element' name='ItineraireObserver_LigneGeometrique'"
	 * @generated
	 */
	TypeLigneGeometrique getItineraireObserverLigneGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRohum#getItineraireObserverLigneGeometrique <em>Itineraire Observer Ligne Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itineraire Observer Ligne Geometrique</em>' containment reference.
	 * @see #getItineraireObserverLigneGeometrique()
	 * @generated
	 */
	void setItineraireObserverLigneGeometrique(TypeLigneGeometrique value);

	/**
	 * Returns the value of the '<em><b>Origine Secteur Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origine Secteur Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origine Secteur Point Geometrique</em>' containment reference.
	 * @see #setOrigineSecteurPointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRohum_OrigineSecteurPointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='OrigineSecteur_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getOrigineSecteurPointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRohum#getOrigineSecteurPointGeometrique <em>Origine Secteur Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origine Secteur Point Geometrique</em>' containment reference.
	 * @see #getOrigineSecteurPointGeometrique()
	 * @generated
	 */
	void setOrigineSecteurPointGeometrique(TypePointGeometrique value);

	/**
	 * Returns the value of the '<em><b>Direction Observation Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Observation Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Observation Point Geometrique</em>' containment reference.
	 * @see #setDirectionObservationPointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRohum_DirectionObservationPointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='DirectionObservation_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getDirectionObservationPointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRohum#getDirectionObservationPointGeometrique <em>Direction Observation Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Observation Point Geometrique</em>' containment reference.
	 * @see #getDirectionObservationPointGeometrique()
	 * @generated
	 */
	void setDirectionObservationPointGeometrique(TypePointGeometrique value);

} // TypeMissionRohum
