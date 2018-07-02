/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mouillage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMouillage#getTirantEauAMareeBasse <em>Tirant Eau AMaree Basse</em>}</li>
 *   <li>{@link mpia.schema.TypeMouillage#getTirantEauMaximal <em>Tirant Eau Maximal</em>}</li>
 *   <li>{@link mpia.schema.TypeMouillage#getTonnageMaximal <em>Tonnage Maximal</em>}</li>
 *   <li>{@link mpia.schema.TypeMouillage#getNatureFond <em>Nature Fond</em>}</li>
 *   <li>{@link mpia.schema.TypeMouillage#getModeAmarrage <em>Mode Amarrage</em>}</li>
 *   <li>{@link mpia.schema.TypeMouillage#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}</li>
 *   <li>{@link mpia.schema.TypeMouillage#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.TypeMouillage#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMouillage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Mouillage' kind='elementOnly'"
 * @generated
 */
public interface TypeMouillage extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Tirant Eau AMaree Basse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tirant Eau AMaree Basse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tirant Eau AMaree Basse</em>' containment reference.
	 * @see #setTirantEauAMareeBasse(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeMouillage_TirantEauAMareeBasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TirantEauAMareeBasse'"
	 * @generated
	 */
	TypeDataTypeLongueur getTirantEauAMareeBasse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouillage#getTirantEauAMareeBasse <em>Tirant Eau AMaree Basse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tirant Eau AMaree Basse</em>' containment reference.
	 * @see #getTirantEauAMareeBasse()
	 * @generated
	 */
	void setTirantEauAMareeBasse(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Tirant Eau Maximal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tirant Eau Maximal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tirant Eau Maximal</em>' containment reference.
	 * @see #setTirantEauMaximal(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeMouillage_TirantEauMaximal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TirantEauMaximal'"
	 * @generated
	 */
	TypeDataTypeLongueur getTirantEauMaximal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouillage#getTirantEauMaximal <em>Tirant Eau Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tirant Eau Maximal</em>' containment reference.
	 * @see #getTirantEauMaximal()
	 * @generated
	 */
	void setTirantEauMaximal(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Tonnage Maximal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tonnage Maximal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tonnage Maximal</em>' attribute.
	 * @see #isSetTonnageMaximal()
	 * @see #unsetTonnageMaximal()
	 * @see #setTonnageMaximal(long)
	 * @see mpia.schema.SchemaPackage#getTypeMouillage_TonnageMaximal()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='TonnageMaximal'"
	 * @generated
	 */
	long getTonnageMaximal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouillage#getTonnageMaximal <em>Tonnage Maximal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tonnage Maximal</em>' attribute.
	 * @see #isSetTonnageMaximal()
	 * @see #unsetTonnageMaximal()
	 * @see #getTonnageMaximal()
	 * @generated
	 */
	void setTonnageMaximal(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMouillage#getTonnageMaximal <em>Tonnage Maximal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTonnageMaximal()
	 * @see #getTonnageMaximal()
	 * @see #setTonnageMaximal(long)
	 * @generated
	 */
	void unsetTonnageMaximal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMouillage#getTonnageMaximal <em>Tonnage Maximal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tonnage Maximal</em>' attribute is set.
	 * @see #unsetTonnageMaximal()
	 * @see #getTonnageMaximal()
	 * @see #setTonnageMaximal(long)
	 * @generated
	 */
	boolean isSetTonnageMaximal();

	/**
	 * Returns the value of the '<em><b>Nature Fond</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMouillageNatureFond}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Fond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Fond</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMouillageNatureFond
	 * @see #isSetNatureFond()
	 * @see #unsetNatureFond()
	 * @see #setNatureFond(TypeDictionaryDicoMouillageNatureFond)
	 * @see mpia.schema.SchemaPackage#getTypeMouillage_NatureFond()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NatureFond'"
	 * @generated
	 */
	TypeDictionaryDicoMouillageNatureFond getNatureFond();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouillage#getNatureFond <em>Nature Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Fond</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMouillageNatureFond
	 * @see #isSetNatureFond()
	 * @see #unsetNatureFond()
	 * @see #getNatureFond()
	 * @generated
	 */
	void setNatureFond(TypeDictionaryDicoMouillageNatureFond value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMouillage#getNatureFond <em>Nature Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureFond()
	 * @see #getNatureFond()
	 * @see #setNatureFond(TypeDictionaryDicoMouillageNatureFond)
	 * @generated
	 */
	void unsetNatureFond();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMouillage#getNatureFond <em>Nature Fond</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Fond</em>' attribute is set.
	 * @see #unsetNatureFond()
	 * @see #getNatureFond()
	 * @see #setNatureFond(TypeDictionaryDicoMouillageNatureFond)
	 * @generated
	 */
	boolean isSetNatureFond();

	/**
	 * Returns the value of the '<em><b>Mode Amarrage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMouillageModeAmarrage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Amarrage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Amarrage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMouillageModeAmarrage
	 * @see #isSetModeAmarrage()
	 * @see #unsetModeAmarrage()
	 * @see #setModeAmarrage(TypeDictionaryDicoMouillageModeAmarrage)
	 * @see mpia.schema.SchemaPackage#getTypeMouillage_ModeAmarrage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeAmarrage'"
	 * @generated
	 */
	TypeDictionaryDicoMouillageModeAmarrage getModeAmarrage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouillage#getModeAmarrage <em>Mode Amarrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Amarrage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMouillageModeAmarrage
	 * @see #isSetModeAmarrage()
	 * @see #unsetModeAmarrage()
	 * @see #getModeAmarrage()
	 * @generated
	 */
	void setModeAmarrage(TypeDictionaryDicoMouillageModeAmarrage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMouillage#getModeAmarrage <em>Mode Amarrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeAmarrage()
	 * @see #getModeAmarrage()
	 * @see #setModeAmarrage(TypeDictionaryDicoMouillageModeAmarrage)
	 * @generated
	 */
	void unsetModeAmarrage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMouillage#getModeAmarrage <em>Mode Amarrage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Amarrage</em>' attribute is set.
	 * @see #unsetModeAmarrage()
	 * @see #getModeAmarrage()
	 * @see #setModeAmarrage(TypeDictionaryDicoMouillageModeAmarrage)
	 * @generated
	 */
	boolean isSetModeAmarrage();

	/**
	 * Returns the value of the '<em><b>Direction Predominante Vent</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Predominante Vent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Predominante Vent</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirection
	 * @see #isSetDirectionPredominanteVent()
	 * @see #unsetDirectionPredominanteVent()
	 * @see #setDirectionPredominanteVent(TypeDictionaryDicoDirection)
	 * @see mpia.schema.SchemaPackage#getTypeMouillage_DirectionPredominanteVent()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DirectionPredominanteVent'"
	 * @generated
	 */
	TypeDictionaryDicoDirection getDirectionPredominanteVent();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouillage#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Predominante Vent</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirection
	 * @see #isSetDirectionPredominanteVent()
	 * @see #unsetDirectionPredominanteVent()
	 * @see #getDirectionPredominanteVent()
	 * @generated
	 */
	void setDirectionPredominanteVent(TypeDictionaryDicoDirection value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMouillage#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectionPredominanteVent()
	 * @see #getDirectionPredominanteVent()
	 * @see #setDirectionPredominanteVent(TypeDictionaryDicoDirection)
	 * @generated
	 */
	void unsetDirectionPredominanteVent();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMouillage#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction Predominante Vent</em>' attribute is set.
	 * @see #unsetDirectionPredominanteVent()
	 * @see #getDirectionPredominanteVent()
	 * @see #setDirectionPredominanteVent(TypeDictionaryDicoDirection)
	 * @generated
	 */
	boolean isSetDirectionPredominanteVent();

	/**
	 * Returns the value of the '<em><b>Charge Explosive Limite Jour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Explosive Limite Jour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Explosive Limite Jour</em>' containment reference.
	 * @see #setChargeExplosiveLimiteJour(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeMouillage_ChargeExplosiveLimiteJour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteJour'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouillage#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Explosive Limite Jour</em>' containment reference.
	 * @see #getChargeExplosiveLimiteJour()
	 * @generated
	 */
	void setChargeExplosiveLimiteJour(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Charge Explosive Limite Nuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Explosive Limite Nuit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Explosive Limite Nuit</em>' containment reference.
	 * @see #setChargeExplosiveLimiteNuit(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeMouillage_ChargeExplosiveLimiteNuit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteNuit'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouillage#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Explosive Limite Nuit</em>' containment reference.
	 * @see #getChargeExplosiveLimiteNuit()
	 * @generated
	 */
	void setChargeExplosiveLimiteNuit(TypeDataTypeMasse value);

} // TypeMouillage
