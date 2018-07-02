/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Consigne Geographique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsigneGeographique#getAdresseRadioAdresse <em>Adresse Radio Adresse</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypeZoneZoneAlat <em>Est Consigne Type Zone Zone Alat</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypeLigneAutreElementControle <em>Est Consigne Type Ligne Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypeItineraireItineraireOuModeleCheminementALAT <em>Est Consigne Type Itineraire Itineraire Ou Modele Cheminement ALAT</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypePointPointControle3D <em>Est Consigne Type Point Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypeRouteRouteHelicoptereALAT <em>Est Consigne Type Route Route Helicoptere ALAT</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsigneGeographique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConsigneGeographique' kind='elementOnly'"
 * @generated
 */
public interface TypeConsigneGeographique extends EObject {
	/**
	 * Returns the value of the '<em><b>Adresse Radio Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse Radio Adresse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Radio Adresse</em>' containment reference.
	 * @see #setAdresseRadioAdresse(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneGeographique_AdresseRadioAdresse()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Adresse'"
	 *        extendedMetaData="kind='element' name='AdresseRadio_Adresse'"
	 * @generated
	 */
	TypeAssociation getAdresseRadioAdresse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneGeographique#getAdresseRadioAdresse <em>Adresse Radio Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse Radio Adresse</em>' containment reference.
	 * @see #getAdresseRadioAdresse()
	 * @generated
	 */
	void setAdresseRadioAdresse(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Consigne Type Zone Zone Alat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Consigne Type Zone Zone Alat</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Consigne Type Zone Zone Alat</em>' containment reference.
	 * @see #setEstConsigneTypeZoneZoneAlat(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneGeographique_EstConsigneTypeZoneZoneAlat()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ZoneAlat'"
	 *        extendedMetaData="kind='element' name='EstConsigneTypeZone_ZoneAlat'"
	 * @generated
	 */
	TypeAssociation getEstConsigneTypeZoneZoneAlat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypeZoneZoneAlat <em>Est Consigne Type Zone Zone Alat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Consigne Type Zone Zone Alat</em>' containment reference.
	 * @see #getEstConsigneTypeZoneZoneAlat()
	 * @generated
	 */
	void setEstConsigneTypeZoneZoneAlat(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Consigne Type Ligne Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Consigne Type Ligne Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Consigne Type Ligne Autre Element Controle</em>' containment reference.
	 * @see #setEstConsigneTypeLigneAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneGeographique_EstConsigneTypeLigneAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='EstConsigneTypeLigne_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getEstConsigneTypeLigneAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypeLigneAutreElementControle <em>Est Consigne Type Ligne Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Consigne Type Ligne Autre Element Controle</em>' containment reference.
	 * @see #getEstConsigneTypeLigneAutreElementControle()
	 * @generated
	 */
	void setEstConsigneTypeLigneAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Consigne Type Itineraire Itineraire Ou Modele Cheminement ALAT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Consigne Type Itineraire Itineraire Ou Modele Cheminement ALAT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Consigne Type Itineraire Itineraire Ou Modele Cheminement ALAT</em>' containment reference.
	 * @see #setEstConsigneTypeItineraireItineraireOuModeleCheminementALAT(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneGeographique_EstConsigneTypeItineraireItineraireOuModeleCheminementALAT()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ItineraireOuModeleCheminementALAT'"
	 *        extendedMetaData="kind='element' name='EstConsigneTypeItineraire_ItineraireOuModeleCheminementALAT'"
	 * @generated
	 */
	TypeAssociation getEstConsigneTypeItineraireItineraireOuModeleCheminementALAT();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypeItineraireItineraireOuModeleCheminementALAT <em>Est Consigne Type Itineraire Itineraire Ou Modele Cheminement ALAT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Consigne Type Itineraire Itineraire Ou Modele Cheminement ALAT</em>' containment reference.
	 * @see #getEstConsigneTypeItineraireItineraireOuModeleCheminementALAT()
	 * @generated
	 */
	void setEstConsigneTypeItineraireItineraireOuModeleCheminementALAT(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Consigne Type Point Point Controle3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Consigne Type Point Point Controle3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Consigne Type Point Point Controle3 D</em>' containment reference.
	 * @see #setEstConsigneTypePointPointControle3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneGeographique_EstConsigneTypePointPointControle3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PointControle3D'"
	 *        extendedMetaData="kind='element' name='EstConsigneTypePoint_PointControle3D'"
	 * @generated
	 */
	TypeAssociation getEstConsigneTypePointPointControle3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypePointPointControle3D <em>Est Consigne Type Point Point Controle3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Consigne Type Point Point Controle3 D</em>' containment reference.
	 * @see #getEstConsigneTypePointPointControle3D()
	 * @generated
	 */
	void setEstConsigneTypePointPointControle3D(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Consigne Type Route Route Helicoptere ALAT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Consigne Type Route Route Helicoptere ALAT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Consigne Type Route Route Helicoptere ALAT</em>' containment reference.
	 * @see #setEstConsigneTypeRouteRouteHelicoptereALAT(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneGeographique_EstConsigneTypeRouteRouteHelicoptereALAT()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_RouteHelicoptereALAT'"
	 *        extendedMetaData="kind='element' name='EstConsigneTypeRoute_RouteHelicoptereALAT'"
	 * @generated
	 */
	TypeAssociation getEstConsigneTypeRouteRouteHelicoptereALAT();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneGeographique#getEstConsigneTypeRouteRouteHelicoptereALAT <em>Est Consigne Type Route Route Helicoptere ALAT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Consigne Type Route Route Helicoptere ALAT</em>' containment reference.
	 * @see #getEstConsigneTypeRouteRouteHelicoptereALAT()
	 * @generated
	 */
	void setEstConsigneTypeRouteRouteHelicoptereALAT(TypeAssociation value);

} // TypeConsigneGeographique
