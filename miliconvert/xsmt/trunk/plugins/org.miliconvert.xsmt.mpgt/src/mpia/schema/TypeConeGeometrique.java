/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Cone Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConeGeometrique#getAPourBaseObjetGeometrique <em>APour Base Objet Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeConeGeometrique#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConeGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConeGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeConeGeometrique extends TypeVolumeGeometrique {
	/**
	 * Returns the value of the '<em><b>APour Base Objet Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Base Objet Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Base Objet Geometrique</em>' containment reference.
	 * @see #setAPourBaseObjetGeometrique(TypeObjetGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeConeGeometrique_APourBaseObjetGeometrique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ObjetGeometrique'"
	 *        extendedMetaData="kind='element' name='APourBase_ObjetGeometrique'"
	 * @generated
	 */
	TypeObjetGeometrique getAPourBaseObjetGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConeGeometrique#getAPourBaseObjetGeometrique <em>APour Base Objet Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Base Objet Geometrique</em>' containment reference.
	 * @see #getAPourBaseObjetGeometrique()
	 * @generated
	 */
	void setAPourBaseObjetGeometrique(TypeObjetGeometrique value);

	/**
	 * Returns the value of the '<em><b>APour Origine Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Origine Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Origine Coordonnees Lat Long</em>' containment reference.
	 * @see #setAPourOrigineCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypeConeGeometrique_APourOrigineCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourOrigine_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourOrigineCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConeGeometrique#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Origine Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourOrigineCoordonneesLatLong()
	 * @generated
	 */
	void setAPourOrigineCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypeConeGeometrique
