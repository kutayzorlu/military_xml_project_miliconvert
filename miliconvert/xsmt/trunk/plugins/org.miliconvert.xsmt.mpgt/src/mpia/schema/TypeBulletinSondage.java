/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeAltitudePression;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypePression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Bulletin Sondage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBulletinSondage#getIdStation <em>Id Station</em>}</li>
 *   <li>{@link mpia.schema.TypeBulletinSondage#getDateValiditeObservation <em>Date Validite Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeBulletinSondage#getDureeValiditeObservation <em>Duree Validite Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeBulletinSondage#getPressionLocaleStation <em>Pression Locale Station</em>}</li>
 *   <li>{@link mpia.schema.TypeBulletinSondage#getAltitudeLocaleStation <em>Altitude Locale Station</em>}</li>
 *   <li>{@link mpia.schema.TypeBulletinSondage#getSeComposePalierSondage <em>Se Compose Palier Sondage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBulletinSondage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_BulletinSondage' kind='elementOnly'"
 * @generated
 */
public interface TypeBulletinSondage extends TypeInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Id Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Station</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Station</em>' attribute.
	 * @see #setIdStation(String)
	 * @see mpia.schema.SchemaPackage#getTypeBulletinSondage_IdStation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='IdStation'"
	 * @generated
	 */
	String getIdStation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBulletinSondage#getIdStation <em>Id Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Station</em>' attribute.
	 * @see #getIdStation()
	 * @generated
	 */
	void setIdStation(String value);

	/**
	 * Returns the value of the '<em><b>Date Validite Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Validite Observation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Validite Observation</em>' attribute.
	 * @see #setDateValiditeObservation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeBulletinSondage_DateValiditeObservation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateValiditeObservation'"
	 * @generated
	 */
	XMLGregorianCalendar getDateValiditeObservation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBulletinSondage#getDateValiditeObservation <em>Date Validite Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Validite Observation</em>' attribute.
	 * @see #getDateValiditeObservation()
	 * @generated
	 */
	void setDateValiditeObservation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Duree Validite Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Validite Observation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Validite Observation</em>' containment reference.
	 * @see #setDureeValiditeObservation(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeBulletinSondage_DureeValiditeObservation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DureeValiditeObservation'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeValiditeObservation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBulletinSondage#getDureeValiditeObservation <em>Duree Validite Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Validite Observation</em>' containment reference.
	 * @see #getDureeValiditeObservation()
	 * @generated
	 */
	void setDureeValiditeObservation(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Pression Locale Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pression Locale Station</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pression Locale Station</em>' containment reference.
	 * @see #setPressionLocaleStation(TypeDataTypePression)
	 * @see mpia.schema.SchemaPackage#getTypeBulletinSondage_PressionLocaleStation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PressionLocaleStation'"
	 * @generated
	 */
	TypeDataTypePression getPressionLocaleStation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBulletinSondage#getPressionLocaleStation <em>Pression Locale Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pression Locale Station</em>' containment reference.
	 * @see #getPressionLocaleStation()
	 * @generated
	 */
	void setPressionLocaleStation(TypeDataTypePression value);

	/**
	 * Returns the value of the '<em><b>Altitude Locale Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Locale Station</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Locale Station</em>' containment reference.
	 * @see #setAltitudeLocaleStation(TypeDataTypeAltitudePression)
	 * @see mpia.schema.SchemaPackage#getTypeBulletinSondage_AltitudeLocaleStation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AltitudeLocaleStation'"
	 * @generated
	 */
	TypeDataTypeAltitudePression getAltitudeLocaleStation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBulletinSondage#getAltitudeLocaleStation <em>Altitude Locale Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Locale Station</em>' containment reference.
	 * @see #getAltitudeLocaleStation()
	 * @generated
	 */
	void setAltitudeLocaleStation(TypeDataTypeAltitudePression value);

	/**
	 * Returns the value of the '<em><b>Se Compose Palier Sondage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePalierSondage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Compose Palier Sondage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Compose Palier Sondage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBulletinSondage_SeComposePalierSondage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PalierSondage'"
	 *        extendedMetaData="kind='element' name='SeCompose_PalierSondage'"
	 * @generated
	 */
	EList<TypePalierSondage> getSeComposePalierSondage();

} // TypeBulletinSondage
