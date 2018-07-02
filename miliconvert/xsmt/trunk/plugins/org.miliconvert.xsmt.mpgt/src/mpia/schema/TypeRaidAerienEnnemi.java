/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Raid Aerien Ennemi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRaidAerienEnnemi#getVolumeRaid <em>Volume Raid</em>}</li>
 *   <li>{@link mpia.schema.TypeRaidAerienEnnemi#getVitesseRaid <em>Vitesse Raid</em>}</li>
 *   <li>{@link mpia.schema.TypeRaidAerienEnnemi#isContreMesureElectronique <em>Contre Mesure Electronique</em>}</li>
 *   <li>{@link mpia.schema.TypeRaidAerienEnnemi#getAltitudeRaid <em>Altitude Raid</em>}</li>
 *   <li>{@link mpia.schema.TypeRaidAerienEnnemi#getACommeTypeAeronefConstituantRaidTypeAeronef <em>AComme Type Aeronef Constituant Raid Type Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRaidAerienEnnemi()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_RaidAerienEnnemi' kind='elementOnly'"
 * @generated
 */
public interface TypeRaidAerienEnnemi extends TypeEvenement {
	/**
	 * Returns the value of the '<em><b>Volume Raid</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVolumeRaid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Raid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Raid</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVolumeRaid
	 * @see #isSetVolumeRaid()
	 * @see #unsetVolumeRaid()
	 * @see #setVolumeRaid(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid)
	 * @see mpia.schema.SchemaPackage#getTypeRaidAerienEnnemi_VolumeRaid()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='VolumeRaid'"
	 * @generated
	 */
	TypeDictionaryDicoRaidAerienEnnemiVolumeRaid getVolumeRaid();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#getVolumeRaid <em>Volume Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Raid</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVolumeRaid
	 * @see #isSetVolumeRaid()
	 * @see #unsetVolumeRaid()
	 * @see #getVolumeRaid()
	 * @generated
	 */
	void setVolumeRaid(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#getVolumeRaid <em>Volume Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeRaid()
	 * @see #getVolumeRaid()
	 * @see #setVolumeRaid(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid)
	 * @generated
	 */
	void unsetVolumeRaid();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#getVolumeRaid <em>Volume Raid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Raid</em>' attribute is set.
	 * @see #unsetVolumeRaid()
	 * @see #getVolumeRaid()
	 * @see #setVolumeRaid(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid)
	 * @generated
	 */
	boolean isSetVolumeRaid();

	/**
	 * Returns the value of the '<em><b>Vitesse Raid</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVitesseRaid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Raid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Raid</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVitesseRaid
	 * @see #isSetVitesseRaid()
	 * @see #unsetVitesseRaid()
	 * @see #setVitesseRaid(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid)
	 * @see mpia.schema.SchemaPackage#getTypeRaidAerienEnnemi_VitesseRaid()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='VitesseRaid'"
	 * @generated
	 */
	TypeDictionaryDicoRaidAerienEnnemiVitesseRaid getVitesseRaid();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#getVitesseRaid <em>Vitesse Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Raid</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVitesseRaid
	 * @see #isSetVitesseRaid()
	 * @see #unsetVitesseRaid()
	 * @see #getVitesseRaid()
	 * @generated
	 */
	void setVitesseRaid(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#getVitesseRaid <em>Vitesse Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseRaid()
	 * @see #getVitesseRaid()
	 * @see #setVitesseRaid(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid)
	 * @generated
	 */
	void unsetVitesseRaid();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#getVitesseRaid <em>Vitesse Raid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Raid</em>' attribute is set.
	 * @see #unsetVitesseRaid()
	 * @see #getVitesseRaid()
	 * @see #setVitesseRaid(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid)
	 * @generated
	 */
	boolean isSetVitesseRaid();

	/**
	 * Returns the value of the '<em><b>Contre Mesure Electronique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contre Mesure Electronique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contre Mesure Electronique</em>' attribute.
	 * @see #isSetContreMesureElectronique()
	 * @see #unsetContreMesureElectronique()
	 * @see #setContreMesureElectronique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeRaidAerienEnnemi_ContreMesureElectronique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ContreMesureElectronique'"
	 * @generated
	 */
	boolean isContreMesureElectronique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#isContreMesureElectronique <em>Contre Mesure Electronique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contre Mesure Electronique</em>' attribute.
	 * @see #isSetContreMesureElectronique()
	 * @see #unsetContreMesureElectronique()
	 * @see #isContreMesureElectronique()
	 * @generated
	 */
	void setContreMesureElectronique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#isContreMesureElectronique <em>Contre Mesure Electronique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContreMesureElectronique()
	 * @see #isContreMesureElectronique()
	 * @see #setContreMesureElectronique(boolean)
	 * @generated
	 */
	void unsetContreMesureElectronique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#isContreMesureElectronique <em>Contre Mesure Electronique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contre Mesure Electronique</em>' attribute is set.
	 * @see #unsetContreMesureElectronique()
	 * @see #isContreMesureElectronique()
	 * @see #setContreMesureElectronique(boolean)
	 * @generated
	 */
	boolean isSetContreMesureElectronique();

	/**
	 * Returns the value of the '<em><b>Altitude Raid</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAltitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Raid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Raid</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAltitude
	 * @see #isSetAltitudeRaid()
	 * @see #unsetAltitudeRaid()
	 * @see #setAltitudeRaid(TypeDictionaryDicoAltitude)
	 * @see mpia.schema.SchemaPackage#getTypeRaidAerienEnnemi_AltitudeRaid()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AltitudeRaid'"
	 * @generated
	 */
	TypeDictionaryDicoAltitude getAltitudeRaid();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#getAltitudeRaid <em>Altitude Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Raid</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAltitude
	 * @see #isSetAltitudeRaid()
	 * @see #unsetAltitudeRaid()
	 * @see #getAltitudeRaid()
	 * @generated
	 */
	void setAltitudeRaid(TypeDictionaryDicoAltitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#getAltitudeRaid <em>Altitude Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitudeRaid()
	 * @see #getAltitudeRaid()
	 * @see #setAltitudeRaid(TypeDictionaryDicoAltitude)
	 * @generated
	 */
	void unsetAltitudeRaid();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRaidAerienEnnemi#getAltitudeRaid <em>Altitude Raid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Altitude Raid</em>' attribute is set.
	 * @see #unsetAltitudeRaid()
	 * @see #getAltitudeRaid()
	 * @see #setAltitudeRaid(TypeDictionaryDicoAltitude)
	 * @generated
	 */
	boolean isSetAltitudeRaid();

	/**
	 * Returns the value of the '<em><b>AComme Type Aeronef Constituant Raid Type Aeronef</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Type Aeronef Constituant Raid Type Aeronef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Type Aeronef Constituant Raid Type Aeronef</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRaidAerienEnnemi_ACommeTypeAeronefConstituantRaidTypeAeronef()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeAeronef'"
	 *        extendedMetaData="kind='element' name='ACommeTypeAeronefConstituantRaid_TypeAeronef'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getACommeTypeAeronefConstituantRaidTypeAeronef();

} // TypeRaidAerienEnnemi
