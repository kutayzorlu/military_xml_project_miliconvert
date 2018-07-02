/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Aire Polyarc Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAirePolyarcGeometrique#getRayon <em>Rayon</em>}</li>
 *   <li>{@link mpia.schema.TypeAirePolyarcGeometrique#getAngleDernierPoint <em>Angle Dernier Point</em>}</li>
 *   <li>{@link mpia.schema.TypeAirePolyarcGeometrique#getAnglePremierPoint <em>Angle Premier Point</em>}</li>
 *   <li>{@link mpia.schema.TypeAirePolyarcGeometrique#getAPourFrontierePartielleCoordonneesLatLong <em>APour Frontiere Partielle Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.TypeAirePolyarcGeometrique#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAirePolyarcGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AirePolyarcGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeAirePolyarcGeometrique extends TypeObjetGeometrique {
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
	 * @see mpia.schema.SchemaPackage#getTypeAirePolyarcGeometrique_Rayon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Rayon'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayon();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAirePolyarcGeometrique#getRayon <em>Rayon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon</em>' containment reference.
	 * @see #getRayon()
	 * @generated
	 */
	void setRayon(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Angle Dernier Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Dernier Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Dernier Point</em>' containment reference.
	 * @see #setAngleDernierPoint(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeAirePolyarcGeometrique_AngleDernierPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AngleDernierPoint'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleDernierPoint();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAirePolyarcGeometrique#getAngleDernierPoint <em>Angle Dernier Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Dernier Point</em>' containment reference.
	 * @see #getAngleDernierPoint()
	 * @generated
	 */
	void setAngleDernierPoint(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Angle Premier Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Premier Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Premier Point</em>' containment reference.
	 * @see #setAnglePremierPoint(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeAirePolyarcGeometrique_AnglePremierPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AnglePremierPoint'"
	 * @generated
	 */
	TypeDataTypeAngle getAnglePremierPoint();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAirePolyarcGeometrique#getAnglePremierPoint <em>Angle Premier Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Premier Point</em>' containment reference.
	 * @see #getAnglePremierPoint()
	 * @generated
	 */
	void setAnglePremierPoint(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>APour Frontiere Partielle Coordonnees Lat Long</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCoordonneesLatLong}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Frontiere Partielle Coordonnees Lat Long</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Frontiere Partielle Coordonnees Lat Long</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAirePolyarcGeometrique_APourFrontierePartielleCoordonneesLatLong()
	 * @model containment="true" lower="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourFrontierePartielle_CoordonneesLatLong'"
	 * @generated
	 */
	EList<TypeCoordonneesLatLong> getAPourFrontierePartielleCoordonneesLatLong();

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
	 * @see mpia.schema.SchemaPackage#getTypeAirePolyarcGeometrique_APourOrigineCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourOrigine_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourOrigineCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAirePolyarcGeometrique#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Origine Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourOrigineCoordonneesLatLong()
	 * @generated
	 */
	void setAPourOrigineCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypeAirePolyarcGeometrique
