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
 * A representation of the model object '<em><b>Type Cercle Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCercleGeometrique#getRayon <em>Rayon</em>}</li>
 *   <li>{@link mpia.schema.TypeCercleGeometrique#getAPourCentreCoordonneesLatLong <em>APour Centre Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCercleGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CercleGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeCercleGeometrique extends TypeObjetGeometrique {
	/**
	 * Returns the value of the '<em><b>Rayon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon</em>' containment reference.
	 * @see #setRayon(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCercleGeometrique_Rayon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Rayon'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayon();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCercleGeometrique#getRayon <em>Rayon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon</em>' containment reference.
	 * @see #getRayon()
	 * @generated
	 */
	void setRayon(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>APour Centre Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Centre Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Centre Coordonnees Lat Long</em>' containment reference.
	 * @see #setAPourCentreCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypeCercleGeometrique_APourCentreCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourCentre_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourCentreCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCercleGeometrique#getAPourCentreCoordonneesLatLong <em>APour Centre Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Centre Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourCentreCoordonneesLatLong()
	 * @generated
	 */
	void setAPourCentreCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypeCercleGeometrique
