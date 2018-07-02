/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Corridor Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCorridorGeometrique#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.TypeCorridorGeometrique#getAPourCheminementCoordonneesLatLong <em>APour Cheminement Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCorridorGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CorridorGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeCorridorGeometrique extends TypeObjetGeometrique {
	/**
	 * Returns the value of the '<em><b>Largeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur</em>' containment reference.
	 * @see #setLargeur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCorridorGeometrique_Largeur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Largeur'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCorridorGeometrique#getLargeur <em>Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur</em>' containment reference.
	 * @see #getLargeur()
	 * @generated
	 */
	void setLargeur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>APour Cheminement Coordonnees Lat Long</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCoordonneesLatLong}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Cheminement Coordonnees Lat Long</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Cheminement Coordonnees Lat Long</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCorridorGeometrique_APourCheminementCoordonneesLatLong()
	 * @model containment="true" lower="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourCheminement_CoordonneesLatLong'"
	 * @generated
	 */
	EList<TypeCoordonneesLatLong> getAPourCheminementCoordonneesLatLong();

} // TypeCorridorGeometrique
