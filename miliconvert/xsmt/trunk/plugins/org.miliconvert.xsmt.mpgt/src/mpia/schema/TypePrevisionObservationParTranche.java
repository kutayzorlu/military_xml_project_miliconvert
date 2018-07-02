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
 * A representation of the model object '<em><b>Type Prevision Observation Par Tranche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneAtmosphere <em>Concerne Atmosphere</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservationParTranche#getConcernePrecipitation <em>Concerne Precipitation</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneCouvertureNuageuse <em>Concerne Couverture Nuageuse</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneLumiere <em>Concerne Lumiere</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneVisibilite <em>Concerne Visibilite</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneAutrePhenomeneMeteorologique <em>Concerne Autre Phenomene Meteorologique</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneVent <em>Concerne Vent</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneGivrage <em>Concerne Givrage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePrevisionObservationParTranche()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PrevisionObservationParTranche' kind='elementOnly'"
 * @generated
 */
public interface TypePrevisionObservationParTranche extends EObject {
	/**
	 * Returns the value of the '<em><b>Concerne Atmosphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Atmosphere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Atmosphere</em>' containment reference.
	 * @see #setConcerneAtmosphere(TypeAtmosphere)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservationParTranche_ConcerneAtmosphere()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Atmosphere'"
	 *        extendedMetaData="kind='element' name='Concerne_Atmosphere'"
	 * @generated
	 */
	TypeAtmosphere getConcerneAtmosphere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneAtmosphere <em>Concerne Atmosphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Atmosphere</em>' containment reference.
	 * @see #getConcerneAtmosphere()
	 * @generated
	 */
	void setConcerneAtmosphere(TypeAtmosphere value);

	/**
	 * Returns the value of the '<em><b>Concerne Precipitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Precipitation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Precipitation</em>' containment reference.
	 * @see #setConcernePrecipitation(TypePrecipitation)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservationParTranche_ConcernePrecipitation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Precipitation'"
	 *        extendedMetaData="kind='element' name='Concerne_Precipitation'"
	 * @generated
	 */
	TypePrecipitation getConcernePrecipitation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservationParTranche#getConcernePrecipitation <em>Concerne Precipitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Precipitation</em>' containment reference.
	 * @see #getConcernePrecipitation()
	 * @generated
	 */
	void setConcernePrecipitation(TypePrecipitation value);

	/**
	 * Returns the value of the '<em><b>Concerne Couverture Nuageuse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Couverture Nuageuse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Couverture Nuageuse</em>' containment reference.
	 * @see #setConcerneCouvertureNuageuse(TypeCouvertureNuageuse)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservationParTranche_ConcerneCouvertureNuageuse()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CouvertureNuageuse'"
	 *        extendedMetaData="kind='element' name='Concerne_CouvertureNuageuse'"
	 * @generated
	 */
	TypeCouvertureNuageuse getConcerneCouvertureNuageuse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneCouvertureNuageuse <em>Concerne Couverture Nuageuse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Couverture Nuageuse</em>' containment reference.
	 * @see #getConcerneCouvertureNuageuse()
	 * @generated
	 */
	void setConcerneCouvertureNuageuse(TypeCouvertureNuageuse value);

	/**
	 * Returns the value of the '<em><b>Concerne Lumiere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Lumiere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Lumiere</em>' containment reference.
	 * @see #setConcerneLumiere(TypeLumiere)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservationParTranche_ConcerneLumiere()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Lumiere'"
	 *        extendedMetaData="kind='element' name='Concerne_Lumiere'"
	 * @generated
	 */
	TypeLumiere getConcerneLumiere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneLumiere <em>Concerne Lumiere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Lumiere</em>' containment reference.
	 * @see #getConcerneLumiere()
	 * @generated
	 */
	void setConcerneLumiere(TypeLumiere value);

	/**
	 * Returns the value of the '<em><b>Concerne Visibilite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Visibilite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Visibilite</em>' containment reference.
	 * @see #setConcerneVisibilite(TypeVisibilite)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservationParTranche_ConcerneVisibilite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Visibilite'"
	 *        extendedMetaData="kind='element' name='Concerne_Visibilite'"
	 * @generated
	 */
	TypeVisibilite getConcerneVisibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneVisibilite <em>Concerne Visibilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Visibilite</em>' containment reference.
	 * @see #getConcerneVisibilite()
	 * @generated
	 */
	void setConcerneVisibilite(TypeVisibilite value);

	/**
	 * Returns the value of the '<em><b>Concerne Autre Phenomene Meteorologique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Autre Phenomene Meteorologique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Autre Phenomene Meteorologique</em>' containment reference.
	 * @see #setConcerneAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservationParTranche_ConcerneAutrePhenomeneMeteorologique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AutrePhenomeneMeteorologique'"
	 *        extendedMetaData="kind='element' name='Concerne_AutrePhenomeneMeteorologique'"
	 * @generated
	 */
	TypeAutrePhenomeneMeteorologique getConcerneAutrePhenomeneMeteorologique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneAutrePhenomeneMeteorologique <em>Concerne Autre Phenomene Meteorologique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Autre Phenomene Meteorologique</em>' containment reference.
	 * @see #getConcerneAutrePhenomeneMeteorologique()
	 * @generated
	 */
	void setConcerneAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique value);

	/**
	 * Returns the value of the '<em><b>Concerne Vent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Vent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Vent</em>' containment reference.
	 * @see #setConcerneVent(TypeVent)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservationParTranche_ConcerneVent()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Vent'"
	 *        extendedMetaData="kind='element' name='Concerne_Vent'"
	 * @generated
	 */
	TypeVent getConcerneVent();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneVent <em>Concerne Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Vent</em>' containment reference.
	 * @see #getConcerneVent()
	 * @generated
	 */
	void setConcerneVent(TypeVent value);

	/**
	 * Returns the value of the '<em><b>Concerne Givrage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Givrage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Givrage</em>' containment reference.
	 * @see #setConcerneGivrage(TypeGivrage)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservationParTranche_ConcerneGivrage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Givrage'"
	 *        extendedMetaData="kind='element' name='Concerne_Givrage'"
	 * @generated
	 */
	TypeGivrage getConcerneGivrage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservationParTranche#getConcerneGivrage <em>Concerne Givrage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Givrage</em>' containment reference.
	 * @see #getConcerneGivrage()
	 * @generated
	 */
	void setConcerneGivrage(TypeGivrage value);

} // TypePrevisionObservationParTranche
