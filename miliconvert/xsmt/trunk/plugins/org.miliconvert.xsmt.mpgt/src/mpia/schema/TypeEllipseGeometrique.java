/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ellipse Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEllipseGeometrique#getAPourPremierPointConjugueCoordonneesLatLong <em>APour Premier Point Conjugue Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.TypeEllipseGeometrique#getAPourSecondPointConjugueCoordonneesLatLong <em>APour Second Point Conjugue Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.TypeEllipseGeometrique#getAPourCentreCoordonneesLatLong <em>APour Centre Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEllipseGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EllipseGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeEllipseGeometrique extends TypeObjetGeometrique {
	/**
	 * Returns the value of the '<em><b>APour Premier Point Conjugue Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Premier Point Conjugue Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Premier Point Conjugue Coordonnees Lat Long</em>' containment reference.
	 * @see #setAPourPremierPointConjugueCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypeEllipseGeometrique_APourPremierPointConjugueCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourPremierPointConjugue_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourPremierPointConjugueCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEllipseGeometrique#getAPourPremierPointConjugueCoordonneesLatLong <em>APour Premier Point Conjugue Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Premier Point Conjugue Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourPremierPointConjugueCoordonneesLatLong()
	 * @generated
	 */
	void setAPourPremierPointConjugueCoordonneesLatLong(TypeCoordonneesLatLong value);

	/**
	 * Returns the value of the '<em><b>APour Second Point Conjugue Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Second Point Conjugue Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Second Point Conjugue Coordonnees Lat Long</em>' containment reference.
	 * @see #setAPourSecondPointConjugueCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypeEllipseGeometrique_APourSecondPointConjugueCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourSecondPointConjugue_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourSecondPointConjugueCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEllipseGeometrique#getAPourSecondPointConjugueCoordonneesLatLong <em>APour Second Point Conjugue Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Second Point Conjugue Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourSecondPointConjugueCoordonneesLatLong()
	 * @generated
	 */
	void setAPourSecondPointConjugueCoordonneesLatLong(TypeCoordonneesLatLong value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEllipseGeometrique_APourCentreCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourCentre_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourCentreCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEllipseGeometrique#getAPourCentreCoordonneesLatLong <em>APour Centre Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Centre Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourCentreCoordonneesLatLong()
	 * @generated
	 */
	void setAPourCentreCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypeEllipseGeometrique
