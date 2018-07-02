/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAngle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Menace Aerienne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMenaceAerienne#getDirectionDeplacement <em>Direction Deplacement</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceAerienne#getAltitudeMenace <em>Altitude Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceAerienne#getVitesseMenace <em>Vitesse Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceAerienne#getVolumeMenace <em>Volume Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceAerienne#getACommeTypeAeronefTypeAeronef <em>AComme Type Aeronef Type Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMenaceAerienne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MenaceAerienne' kind='elementOnly'"
 * @generated
 */
public interface TypeMenaceAerienne extends TypeMenace {
	/**
	 * Returns the value of the '<em><b>Direction Deplacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Deplacement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Deplacement</em>' containment reference.
	 * @see #setDirectionDeplacement(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceAerienne_DirectionDeplacement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DirectionDeplacement'"
	 * @generated
	 */
	TypeDataTypeAngle getDirectionDeplacement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceAerienne#getDirectionDeplacement <em>Direction Deplacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Deplacement</em>' containment reference.
	 * @see #getDirectionDeplacement()
	 * @generated
	 */
	void setDirectionDeplacement(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Altitude Menace</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAltitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Menace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAltitude
	 * @see #isSetAltitudeMenace()
	 * @see #unsetAltitudeMenace()
	 * @see #setAltitudeMenace(TypeDictionaryDicoAltitude)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceAerienne_AltitudeMenace()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AltitudeMenace'"
	 * @generated
	 */
	TypeDictionaryDicoAltitude getAltitudeMenace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceAerienne#getAltitudeMenace <em>Altitude Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAltitude
	 * @see #isSetAltitudeMenace()
	 * @see #unsetAltitudeMenace()
	 * @see #getAltitudeMenace()
	 * @generated
	 */
	void setAltitudeMenace(TypeDictionaryDicoAltitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenaceAerienne#getAltitudeMenace <em>Altitude Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitudeMenace()
	 * @see #getAltitudeMenace()
	 * @see #setAltitudeMenace(TypeDictionaryDicoAltitude)
	 * @generated
	 */
	void unsetAltitudeMenace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenaceAerienne#getAltitudeMenace <em>Altitude Menace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Altitude Menace</em>' attribute is set.
	 * @see #unsetAltitudeMenace()
	 * @see #getAltitudeMenace()
	 * @see #setAltitudeMenace(TypeDictionaryDicoAltitude)
	 * @generated
	 */
	boolean isSetAltitudeMenace();

	/**
	 * Returns the value of the '<em><b>Vitesse Menace</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVitesseRaid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Menace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVitesseRaid
	 * @see #isSetVitesseMenace()
	 * @see #unsetVitesseMenace()
	 * @see #setVitesseMenace(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceAerienne_VitesseMenace()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='VitesseMenace'"
	 * @generated
	 */
	TypeDictionaryDicoRaidAerienEnnemiVitesseRaid getVitesseMenace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceAerienne#getVitesseMenace <em>Vitesse Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVitesseRaid
	 * @see #isSetVitesseMenace()
	 * @see #unsetVitesseMenace()
	 * @see #getVitesseMenace()
	 * @generated
	 */
	void setVitesseMenace(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenaceAerienne#getVitesseMenace <em>Vitesse Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseMenace()
	 * @see #getVitesseMenace()
	 * @see #setVitesseMenace(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid)
	 * @generated
	 */
	void unsetVitesseMenace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenaceAerienne#getVitesseMenace <em>Vitesse Menace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Menace</em>' attribute is set.
	 * @see #unsetVitesseMenace()
	 * @see #getVitesseMenace()
	 * @see #setVitesseMenace(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid)
	 * @generated
	 */
	boolean isSetVitesseMenace();

	/**
	 * Returns the value of the '<em><b>Volume Menace</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVolumeRaid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Menace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVolumeRaid
	 * @see #isSetVolumeMenace()
	 * @see #unsetVolumeMenace()
	 * @see #setVolumeMenace(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceAerienne_VolumeMenace()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='VolumeMenace'"
	 * @generated
	 */
	TypeDictionaryDicoRaidAerienEnnemiVolumeRaid getVolumeMenace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceAerienne#getVolumeMenace <em>Volume Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVolumeRaid
	 * @see #isSetVolumeMenace()
	 * @see #unsetVolumeMenace()
	 * @see #getVolumeMenace()
	 * @generated
	 */
	void setVolumeMenace(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenaceAerienne#getVolumeMenace <em>Volume Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeMenace()
	 * @see #getVolumeMenace()
	 * @see #setVolumeMenace(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid)
	 * @generated
	 */
	void unsetVolumeMenace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenaceAerienne#getVolumeMenace <em>Volume Menace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Menace</em>' attribute is set.
	 * @see #unsetVolumeMenace()
	 * @see #getVolumeMenace()
	 * @see #setVolumeMenace(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid)
	 * @generated
	 */
	boolean isSetVolumeMenace();

	/**
	 * Returns the value of the '<em><b>AComme Type Aeronef Type Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Type Aeronef Type Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Type Aeronef Type Aeronef</em>' containment reference.
	 * @see #setACommeTypeAeronefTypeAeronef(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceAerienne_ACommeTypeAeronefTypeAeronef()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeAeronef'"
	 *        extendedMetaData="kind='element' name='ACommeTypeAeronef_TypeAeronef'"
	 * @generated
	 */
	TypeAssociationEXT getACommeTypeAeronefTypeAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceAerienne#getACommeTypeAeronefTypeAeronef <em>AComme Type Aeronef Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Type Aeronef Type Aeronef</em>' containment reference.
	 * @see #getACommeTypeAeronefTypeAeronef()
	 * @generated
	 */
	void setACommeTypeAeronefTypeAeronef(TypeAssociationEXT value);

} // TypeMenaceAerienne
