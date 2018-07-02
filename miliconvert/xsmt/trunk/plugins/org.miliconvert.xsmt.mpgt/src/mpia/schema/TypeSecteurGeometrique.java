/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Secteur Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSecteurGeometrique#getRayonMinimal <em>Rayon Minimal</em>}</li>
 *   <li>{@link mpia.schema.TypeSecteurGeometrique#getRayonMaximal <em>Rayon Maximal</em>}</li>
 *   <li>{@link mpia.schema.TypeSecteurGeometrique#getLargeurAngulaire <em>Largeur Angulaire</em>}</li>
 *   <li>{@link mpia.schema.TypeSecteurGeometrique#getAngleAvecNord <em>Angle Avec Nord</em>}</li>
 *   <li>{@link mpia.schema.TypeSecteurGeometrique#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSecteurGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SecteurGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeSecteurGeometrique extends TypeObjetGeometrique {
	/**
	 * Returns the value of the '<em><b>Rayon Minimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Minimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Minimal</em>' containment reference.
	 * @see #setRayonMinimal(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSecteurGeometrique_RayonMinimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RayonMinimal'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayonMinimal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurGeometrique#getRayonMinimal <em>Rayon Minimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Minimal</em>' containment reference.
	 * @see #getRayonMinimal()
	 * @generated
	 */
	void setRayonMinimal(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Rayon Maximal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Maximal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Maximal</em>' containment reference.
	 * @see #setRayonMaximal(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSecteurGeometrique_RayonMaximal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RayonMaximal'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayonMaximal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurGeometrique#getRayonMaximal <em>Rayon Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Maximal</em>' containment reference.
	 * @see #getRayonMaximal()
	 * @generated
	 */
	void setRayonMaximal(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Largeur Angulaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Angulaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Angulaire</em>' containment reference.
	 * @see #setLargeurAngulaire(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeSecteurGeometrique_LargeurAngulaire()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LargeurAngulaire'"
	 * @generated
	 */
	TypeDataTypeAngle getLargeurAngulaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurGeometrique#getLargeurAngulaire <em>Largeur Angulaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Angulaire</em>' containment reference.
	 * @see #getLargeurAngulaire()
	 * @generated
	 */
	void setLargeurAngulaire(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Angle Avec Nord</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Avec Nord</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Avec Nord</em>' containment reference.
	 * @see #setAngleAvecNord(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeSecteurGeometrique_AngleAvecNord()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AngleAvecNord'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleAvecNord();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurGeometrique#getAngleAvecNord <em>Angle Avec Nord</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Avec Nord</em>' containment reference.
	 * @see #getAngleAvecNord()
	 * @generated
	 */
	void setAngleAvecNord(TypeDataTypeAngle value);

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
	 * @see mpia.schema.SchemaPackage#getTypeSecteurGeometrique_APourOrigineCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourOrigine_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourOrigineCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurGeometrique#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Origine Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourOrigineCoordonneesLatLong()
	 * @generated
	 */
	void setAPourOrigineCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypeSecteurGeometrique
