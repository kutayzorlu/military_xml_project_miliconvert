/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeAltitudePression;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Volume Securite ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVolumeSecuriteASS#getGrandeDimension <em>Grande Dimension</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeSecuriteASS#getPetiteDimension <em>Petite Dimension</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeSecuriteASS#getGisementGrandeDimension <em>Gisement Grande Dimension</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeSecuriteASS#getAltitudeMinimum <em>Altitude Minimum</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeSecuriteASS#getAltitudeMaximum <em>Altitude Maximum</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeSecuriteASS#getDebutValidite <em>Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeSecuriteASS#getFinValidite <em>Fin Validite</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeSecuriteASS#getAPourCentreCoordonneesLatLong <em>APour Centre Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVolumeSecuriteASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_VolumeSecuriteASS' kind='elementOnly'"
 * @generated
 */
public interface TypeVolumeSecuriteASS extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeVolumeSecuriteASS_GrandeDimension()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GrandeDimension'"
	 * @generated
	 */
	TypeDataTypeLongueur getGrandeDimension();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeSecuriteASS#getGrandeDimension <em>Grande Dimension</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeVolumeSecuriteASS_PetiteDimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PetiteDimension'"
	 * @generated
	 */
	TypeDataTypeLongueur getPetiteDimension();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeSecuriteASS#getPetiteDimension <em>Petite Dimension</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeVolumeSecuriteASS_GisementGrandeDimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GisementGrandeDimension'"
	 * @generated
	 */
	TypeDataTypeAngle getGisementGrandeDimension();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeSecuriteASS#getGisementGrandeDimension <em>Gisement Grande Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gisement Grande Dimension</em>' containment reference.
	 * @see #getGisementGrandeDimension()
	 * @generated
	 */
	void setGisementGrandeDimension(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Altitude Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Minimum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Minimum</em>' containment reference.
	 * @see #setAltitudeMinimum(TypeDataTypeAltitudePression)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeSecuriteASS_AltitudeMinimum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AltitudeMinimum'"
	 * @generated
	 */
	TypeDataTypeAltitudePression getAltitudeMinimum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeSecuriteASS#getAltitudeMinimum <em>Altitude Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Minimum</em>' containment reference.
	 * @see #getAltitudeMinimum()
	 * @generated
	 */
	void setAltitudeMinimum(TypeDataTypeAltitudePression value);

	/**
	 * Returns the value of the '<em><b>Altitude Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Maximum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Maximum</em>' containment reference.
	 * @see #setAltitudeMaximum(TypeDataTypeAltitudePression)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeSecuriteASS_AltitudeMaximum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AltitudeMaximum'"
	 * @generated
	 */
	TypeDataTypeAltitudePression getAltitudeMaximum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeSecuriteASS#getAltitudeMaximum <em>Altitude Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Maximum</em>' containment reference.
	 * @see #getAltitudeMaximum()
	 * @generated
	 */
	void setAltitudeMaximum(TypeDataTypeAltitudePression value);

	/**
	 * Returns the value of the '<em><b>Debut Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Validite</em>' attribute.
	 * @see #setDebutValidite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeSecuriteASS_DebutValidite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutValidite'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeSecuriteASS#getDebutValidite <em>Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Validite</em>' attribute.
	 * @see #getDebutValidite()
	 * @generated
	 */
	void setDebutValidite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Validite</em>' attribute.
	 * @see #setFinValidite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeSecuriteASS_FinValidite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinValidite'"
	 * @generated
	 */
	XMLGregorianCalendar getFinValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeSecuriteASS#getFinValidite <em>Fin Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Validite</em>' attribute.
	 * @see #getFinValidite()
	 * @generated
	 */
	void setFinValidite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>APour Centre Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Centre Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Centre Coordonnees Lat Long</em>' containment reference.
	 * @see #setAPourCentreCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeSecuriteASS_APourCentreCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourCentre_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourCentreCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeSecuriteASS#getAPourCentreCoordonneesLatLong <em>APour Centre Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Centre Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourCentreCoordonneesLatLong()
	 * @generated
	 */
	void setAPourCentreCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypeVolumeSecuriteASS
