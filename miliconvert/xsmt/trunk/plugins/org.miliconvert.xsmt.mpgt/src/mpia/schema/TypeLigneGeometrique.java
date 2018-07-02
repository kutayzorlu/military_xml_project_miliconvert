/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ligne Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLigneGeometrique#getAPourLocalisationCoordonneesLatLong <em>APour Localisation Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLigneGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_LigneGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeLigneGeometrique extends TypeObjetGeometrique {
	/**
	 * Returns the value of the '<em><b>APour Localisation Coordonnees Lat Long</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCoordonneesLatLong}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Coordonnees Lat Long</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Coordonnees Lat Long</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLigneGeometrique_APourLocalisationCoordonneesLatLong()
	 * @model containment="true" lower="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourLocalisation_CoordonneesLatLong'"
	 * @generated
	 */
	EList<TypeCoordonneesLatLong> getAPourLocalisationCoordonneesLatLong();

} // TypeLigneGeometrique
