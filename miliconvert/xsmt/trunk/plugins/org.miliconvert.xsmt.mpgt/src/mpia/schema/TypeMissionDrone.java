/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionDrone#getFicelleLigneGeometrique <em>Ficelle Ligne Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionDrone#getPassesPhotoPassePhoto <em>Passes Photo Passe Photo</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionDrone()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MissionDrone' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionDrone extends EObject {
	/**
	 * Returns the value of the '<em><b>Ficelle Ligne Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ficelle Ligne Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ficelle Ligne Geometrique</em>' containment reference.
	 * @see #setFicelleLigneGeometrique(TypeLigneGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeMissionDrone_FicelleLigneGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LigneGeometrique'"
	 *        extendedMetaData="kind='element' name='Ficelle_LigneGeometrique'"
	 * @generated
	 */
	TypeLigneGeometrique getFicelleLigneGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionDrone#getFicelleLigneGeometrique <em>Ficelle Ligne Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ficelle Ligne Geometrique</em>' containment reference.
	 * @see #getFicelleLigneGeometrique()
	 * @generated
	 */
	void setFicelleLigneGeometrique(TypeLigneGeometrique value);

	/**
	 * Returns the value of the '<em><b>Passes Photo Passe Photo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePassePhoto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passes Photo Passe Photo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passes Photo Passe Photo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionDrone_PassesPhotoPassePhoto()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PassePhoto'"
	 *        extendedMetaData="kind='element' name='PassesPhoto_PassePhoto'"
	 * @generated
	 */
	EList<TypePassePhoto> getPassesPhotoPassePhoto();

} // TypeMissionDrone
