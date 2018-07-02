/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parametres Zone Retombees</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeParametresZoneRetombees#getLigneRadialeDroite <em>Ligne Radiale Droite</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresZoneRetombees#getDistanceZone1 <em>Distance Zone1</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresZoneRetombees#getLigneRadialeGauche <em>Ligne Radiale Gauche</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresZoneRetombees#getRayonNuage <em>Rayon Nuage</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresZoneRetombees#getVitesseVentResultant <em>Vitesse Vent Resultant</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeParametresZoneRetombees()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ParametresZoneRetombees' kind='elementOnly'"
 * @generated
 */
public interface TypeParametresZoneRetombees extends EObject {
	/**
	 * Returns the value of the '<em><b>Ligne Radiale Droite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ligne Radiale Droite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ligne Radiale Droite</em>' containment reference.
	 * @see #setLigneRadialeDroite(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeParametresZoneRetombees_LigneRadialeDroite()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LigneRadialeDroite'"
	 * @generated
	 */
	TypeDataTypeAngle getLigneRadialeDroite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresZoneRetombees#getLigneRadialeDroite <em>Ligne Radiale Droite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ligne Radiale Droite</em>' containment reference.
	 * @see #getLigneRadialeDroite()
	 * @generated
	 */
	void setLigneRadialeDroite(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Distance Zone1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Zone1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Zone1</em>' containment reference.
	 * @see #setDistanceZone1(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeParametresZoneRetombees_DistanceZone1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DistanceZone1'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceZone1();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresZoneRetombees#getDistanceZone1 <em>Distance Zone1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Zone1</em>' containment reference.
	 * @see #getDistanceZone1()
	 * @generated
	 */
	void setDistanceZone1(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Ligne Radiale Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ligne Radiale Gauche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ligne Radiale Gauche</em>' containment reference.
	 * @see #setLigneRadialeGauche(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeParametresZoneRetombees_LigneRadialeGauche()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LigneRadialeGauche'"
	 * @generated
	 */
	TypeDataTypeAngle getLigneRadialeGauche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresZoneRetombees#getLigneRadialeGauche <em>Ligne Radiale Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ligne Radiale Gauche</em>' containment reference.
	 * @see #getLigneRadialeGauche()
	 * @generated
	 */
	void setLigneRadialeGauche(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Rayon Nuage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Nuage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Nuage</em>' containment reference.
	 * @see #setRayonNuage(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeParametresZoneRetombees_RayonNuage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RayonNuage'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayonNuage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresZoneRetombees#getRayonNuage <em>Rayon Nuage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Nuage</em>' containment reference.
	 * @see #getRayonNuage()
	 * @generated
	 */
	void setRayonNuage(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Vitesse Vent Resultant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Vent Resultant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Vent Resultant</em>' containment reference.
	 * @see #setVitesseVentResultant(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeParametresZoneRetombees_VitesseVentResultant()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VitesseVentResultant'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseVentResultant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresZoneRetombees#getVitesseVentResultant <em>Vitesse Vent Resultant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Vent Resultant</em>' containment reference.
	 * @see #getVitesseVentResultant()
	 * @generated
	 */
	void setVitesseVentResultant(TypeDataTypeVitesseLineaire value);

} // TypeParametresZoneRetombees
