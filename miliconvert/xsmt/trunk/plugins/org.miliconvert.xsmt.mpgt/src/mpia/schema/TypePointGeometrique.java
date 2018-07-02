/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Point Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePointGeometrique#getEstLocaliseParCoordonneesLatLong <em>Est Localise Par Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePointGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PointGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypePointGeometrique extends TypeObjetGeometrique {
	/**
	 * Returns the value of the '<em><b>Est Localise Par Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise Par Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise Par Coordonnees Lat Long</em>' containment reference.
	 * @see #setEstLocaliseParCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypePointGeometrique_EstLocaliseParCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='EstLocalisePar_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getEstLocaliseParCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointGeometrique#getEstLocaliseParCoordonneesLatLong <em>Est Localise Par Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise Par Coordonnees Lat Long</em>' containment reference.
	 * @see #getEstLocaliseParCoordonneesLatLong()
	 * @generated
	 */
	void setEstLocaliseParCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypePointGeometrique
