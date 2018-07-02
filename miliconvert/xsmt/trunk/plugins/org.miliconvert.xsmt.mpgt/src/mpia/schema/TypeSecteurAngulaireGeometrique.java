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
 * A representation of the model object '<em><b>Type Secteur Angulaire Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSecteurAngulaireGeometrique#getRayonGauche <em>Rayon Gauche</em>}</li>
 *   <li>{@link mpia.schema.TypeSecteurAngulaireGeometrique#getRayonDroit <em>Rayon Droit</em>}</li>
 *   <li>{@link mpia.schema.TypeSecteurAngulaireGeometrique#getLimiteGauche <em>Limite Gauche</em>}</li>
 *   <li>{@link mpia.schema.TypeSecteurAngulaireGeometrique#getGisementDroit <em>Gisement Droit</em>}</li>
 *   <li>{@link mpia.schema.TypeSecteurAngulaireGeometrique#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSecteurAngulaireGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SecteurAngulaireGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeSecteurAngulaireGeometrique extends TypeObjetGeometrique {
	/**
	 * Returns the value of the '<em><b>Rayon Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Gauche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Gauche</em>' containment reference.
	 * @see #setRayonGauche(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSecteurAngulaireGeometrique_RayonGauche()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RayonGauche'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayonGauche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurAngulaireGeometrique#getRayonGauche <em>Rayon Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Gauche</em>' containment reference.
	 * @see #getRayonGauche()
	 * @generated
	 */
	void setRayonGauche(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Rayon Droit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Droit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Droit</em>' containment reference.
	 * @see #setRayonDroit(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSecteurAngulaireGeometrique_RayonDroit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RayonDroit'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayonDroit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurAngulaireGeometrique#getRayonDroit <em>Rayon Droit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Droit</em>' containment reference.
	 * @see #getRayonDroit()
	 * @generated
	 */
	void setRayonDroit(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Limite Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite Gauche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite Gauche</em>' containment reference.
	 * @see #setLimiteGauche(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeSecteurAngulaireGeometrique_LimiteGauche()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LimiteGauche'"
	 * @generated
	 */
	TypeDataTypeAngle getLimiteGauche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurAngulaireGeometrique#getLimiteGauche <em>Limite Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite Gauche</em>' containment reference.
	 * @see #getLimiteGauche()
	 * @generated
	 */
	void setLimiteGauche(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Gisement Droit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gisement Droit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gisement Droit</em>' containment reference.
	 * @see #setGisementDroit(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeSecteurAngulaireGeometrique_GisementDroit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GisementDroit'"
	 * @generated
	 */
	TypeDataTypeAngle getGisementDroit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurAngulaireGeometrique#getGisementDroit <em>Gisement Droit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gisement Droit</em>' containment reference.
	 * @see #getGisementDroit()
	 * @generated
	 */
	void setGisementDroit(TypeDataTypeAngle value);

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
	 * @see mpia.schema.SchemaPackage#getTypeSecteurAngulaireGeometrique_APourOrigineCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourOrigine_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourOrigineCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSecteurAngulaireGeometrique#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Origine Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourOrigineCoordonneesLatLong()
	 * @generated
	 */
	void setAPourOrigineCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypeSecteurAngulaireGeometrique
