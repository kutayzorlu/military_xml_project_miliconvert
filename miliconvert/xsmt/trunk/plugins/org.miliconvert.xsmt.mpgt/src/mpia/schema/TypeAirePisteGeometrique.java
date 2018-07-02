/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Aire Piste Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAirePisteGeometrique#getLargeurDroite <em>Largeur Droite</em>}</li>
 *   <li>{@link mpia.schema.TypeAirePisteGeometrique#getLargeurGauche <em>Largeur Gauche</em>}</li>
 *   <li>{@link mpia.schema.TypeAirePisteGeometrique#getAPourFinCoordonneesLatLong <em>APour Fin Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.TypeAirePisteGeometrique#getAPourDebutCoordonneesLatLong <em>APour Debut Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAirePisteGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AirePisteGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeAirePisteGeometrique extends TypeObjetGeometrique {
	/**
	 * Returns the value of the '<em><b>Largeur Droite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Droite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Droite</em>' containment reference.
	 * @see #setLargeurDroite(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeAirePisteGeometrique_LargeurDroite()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LargeurDroite'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurDroite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAirePisteGeometrique#getLargeurDroite <em>Largeur Droite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Droite</em>' containment reference.
	 * @see #getLargeurDroite()
	 * @generated
	 */
	void setLargeurDroite(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Largeur Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Gauche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Gauche</em>' containment reference.
	 * @see #setLargeurGauche(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeAirePisteGeometrique_LargeurGauche()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LargeurGauche'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurGauche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAirePisteGeometrique#getLargeurGauche <em>Largeur Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Gauche</em>' containment reference.
	 * @see #getLargeurGauche()
	 * @generated
	 */
	void setLargeurGauche(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>APour Fin Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Fin Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Fin Coordonnees Lat Long</em>' containment reference.
	 * @see #setAPourFinCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypeAirePisteGeometrique_APourFinCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourFin_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourFinCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAirePisteGeometrique#getAPourFinCoordonneesLatLong <em>APour Fin Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Fin Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourFinCoordonneesLatLong()
	 * @generated
	 */
	void setAPourFinCoordonneesLatLong(TypeCoordonneesLatLong value);

	/**
	 * Returns the value of the '<em><b>APour Debut Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Debut Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Debut Coordonnees Lat Long</em>' containment reference.
	 * @see #setAPourDebutCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypeAirePisteGeometrique_APourDebutCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourDebut_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourDebutCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAirePisteGeometrique#getAPourDebutCoordonneesLatLong <em>APour Debut Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Debut Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourDebutCoordonneesLatLong()
	 * @generated
	 */
	void setAPourDebutCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypeAirePisteGeometrique
