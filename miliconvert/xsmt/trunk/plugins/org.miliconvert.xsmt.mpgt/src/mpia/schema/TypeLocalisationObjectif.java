/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAltitudePression;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Localisation Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLocalisationObjectif#getDeploiement <em>Deploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeLocalisationObjectif#getAltitudeMoyenne <em>Altitude Moyenne</em>}</li>
 *   <li>{@link mpia.schema.TypeLocalisationObjectif#getGrandeDimension <em>Grande Dimension</em>}</li>
 *   <li>{@link mpia.schema.TypeLocalisationObjectif#getPetiteDimension <em>Petite Dimension</em>}</li>
 *   <li>{@link mpia.schema.TypeLocalisationObjectif#getGisementGrandeDimension <em>Gisement Grande Dimension</em>}</li>
 *   <li>{@link mpia.schema.TypeLocalisationObjectif#getAPourPointReferenceCoordonneesLatLong <em>APour Point Reference Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLocalisationObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_LocalisationObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeLocalisationObjectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Deploiement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObjectifCiblageDeploiement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploiement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageDeploiement
	 * @see #isSetDeploiement()
	 * @see #unsetDeploiement()
	 * @see #setDeploiement(TypeDictionaryDicoObjectifCiblageDeploiement)
	 * @see mpia.schema.SchemaPackage#getTypeLocalisationObjectif_Deploiement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Deploiement'"
	 * @generated
	 */
	TypeDictionaryDicoObjectifCiblageDeploiement getDeploiement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLocalisationObjectif#getDeploiement <em>Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageDeploiement
	 * @see #isSetDeploiement()
	 * @see #unsetDeploiement()
	 * @see #getDeploiement()
	 * @generated
	 */
	void setDeploiement(TypeDictionaryDicoObjectifCiblageDeploiement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLocalisationObjectif#getDeploiement <em>Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeploiement()
	 * @see #getDeploiement()
	 * @see #setDeploiement(TypeDictionaryDicoObjectifCiblageDeploiement)
	 * @generated
	 */
	void unsetDeploiement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLocalisationObjectif#getDeploiement <em>Deploiement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deploiement</em>' attribute is set.
	 * @see #unsetDeploiement()
	 * @see #getDeploiement()
	 * @see #setDeploiement(TypeDictionaryDicoObjectifCiblageDeploiement)
	 * @generated
	 */
	boolean isSetDeploiement();

	/**
	 * Returns the value of the '<em><b>Altitude Moyenne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Moyenne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Moyenne</em>' containment reference.
	 * @see #setAltitudeMoyenne(TypeDataTypeAltitudePression)
	 * @see mpia.schema.SchemaPackage#getTypeLocalisationObjectif_AltitudeMoyenne()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AltitudeMoyenne'"
	 * @generated
	 */
	TypeDataTypeAltitudePression getAltitudeMoyenne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLocalisationObjectif#getAltitudeMoyenne <em>Altitude Moyenne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Moyenne</em>' containment reference.
	 * @see #getAltitudeMoyenne()
	 * @generated
	 */
	void setAltitudeMoyenne(TypeDataTypeAltitudePression value);

	/**
	 * Returns the value of the '<em><b>Grande Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grande Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grande Dimension</em>' containment reference.
	 * @see #setGrandeDimension(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeLocalisationObjectif_GrandeDimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GrandeDimension'"
	 * @generated
	 */
	TypeDataTypeLongueur getGrandeDimension();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLocalisationObjectif#getGrandeDimension <em>Grande Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grande Dimension</em>' containment reference.
	 * @see #getGrandeDimension()
	 * @generated
	 */
	void setGrandeDimension(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Petite Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petite Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petite Dimension</em>' containment reference.
	 * @see #setPetiteDimension(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeLocalisationObjectif_PetiteDimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PetiteDimension'"
	 * @generated
	 */
	TypeDataTypeLongueur getPetiteDimension();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLocalisationObjectif#getPetiteDimension <em>Petite Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petite Dimension</em>' containment reference.
	 * @see #getPetiteDimension()
	 * @generated
	 */
	void setPetiteDimension(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Gisement Grande Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gisement Grande Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gisement Grande Dimension</em>' containment reference.
	 * @see #setGisementGrandeDimension(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeLocalisationObjectif_GisementGrandeDimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GisementGrandeDimension'"
	 * @generated
	 */
	TypeDataTypeAngle getGisementGrandeDimension();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLocalisationObjectif#getGisementGrandeDimension <em>Gisement Grande Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gisement Grande Dimension</em>' containment reference.
	 * @see #getGisementGrandeDimension()
	 * @generated
	 */
	void setGisementGrandeDimension(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>APour Point Reference Coordonnees Lat Long</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCoordonneesLatLong}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Point Reference Coordonnees Lat Long</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Point Reference Coordonnees Lat Long</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLocalisationObjectif_APourPointReferenceCoordonneesLatLong()
	 * @model containment="true" required="true" upper="4"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourPointReference_CoordonneesLatLong'"
	 * @generated
	 */
	EList<TypeCoordonneesLatLong> getAPourPointReferenceCoordonneesLatLong();

} // TypeLocalisationObjectif
