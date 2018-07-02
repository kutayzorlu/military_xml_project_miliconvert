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
 * A representation of the model object '<em><b>Type Jetee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeJetee#getAmplitudeMaximale <em>Amplitude Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeJetee#getTirantEau <em>Tirant Eau</em>}</li>
 *   <li>{@link mpia.schema.TypeJetee#getChargeEnLourdMaximale <em>Charge En Lourd Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeJetee#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}</li>
 *   <li>{@link mpia.schema.TypeJetee#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}</li>
 *   <li>{@link mpia.schema.TypeJetee#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.TypeJetee#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeJetee()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Jetee' kind='elementOnly'"
 * @generated
 */
public interface TypeJetee extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Amplitude Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amplitude Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amplitude Maximale</em>' containment reference.
	 * @see #setAmplitudeMaximale(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeJetee_AmplitudeMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AmplitudeMaximale'"
	 * @generated
	 */
	TypeDataTypeLongueur getAmplitudeMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJetee#getAmplitudeMaximale <em>Amplitude Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amplitude Maximale</em>' containment reference.
	 * @see #getAmplitudeMaximale()
	 * @generated
	 */
	void setAmplitudeMaximale(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Tirant Eau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tirant Eau</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tirant Eau</em>' containment reference.
	 * @see #setTirantEau(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeJetee_TirantEau()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TirantEau'"
	 * @generated
	 */
	TypeDataTypeLongueur getTirantEau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJetee#getTirantEau <em>Tirant Eau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tirant Eau</em>' containment reference.
	 * @see #getTirantEau()
	 * @generated
	 */
	void setTirantEau(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Charge En Lourd Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge En Lourd Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge En Lourd Maximale</em>' containment reference.
	 * @see #setChargeEnLourdMaximale(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeJetee_ChargeEnLourdMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeEnLourdMaximale'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeEnLourdMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJetee#getChargeEnLourdMaximale <em>Charge En Lourd Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge En Lourd Maximale</em>' containment reference.
	 * @see #getChargeEnLourdMaximale()
	 * @generated
	 */
	void setChargeEnLourdMaximale(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Desserte Rail Disponible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desserte Rail Disponible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desserte Rail Disponible</em>' attribute.
	 * @see #isSetDesserteRailDisponible()
	 * @see #unsetDesserteRailDisponible()
	 * @see #setDesserteRailDisponible(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeJetee_DesserteRailDisponible()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DesserteRailDisponible'"
	 * @generated
	 */
	boolean isDesserteRailDisponible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJetee#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desserte Rail Disponible</em>' attribute.
	 * @see #isSetDesserteRailDisponible()
	 * @see #unsetDesserteRailDisponible()
	 * @see #isDesserteRailDisponible()
	 * @generated
	 */
	void setDesserteRailDisponible(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeJetee#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDesserteRailDisponible()
	 * @see #isDesserteRailDisponible()
	 * @see #setDesserteRailDisponible(boolean)
	 * @generated
	 */
	void unsetDesserteRailDisponible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeJetee#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Desserte Rail Disponible</em>' attribute is set.
	 * @see #unsetDesserteRailDisponible()
	 * @see #isDesserteRailDisponible()
	 * @see #setDesserteRailDisponible(boolean)
	 * @generated
	 */
	boolean isSetDesserteRailDisponible();

	/**
	 * Returns the value of the '<em><b>Nombre Maximum Wagons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Maximum Wagons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Maximum Wagons</em>' attribute.
	 * @see #isSetNombreMaximumWagons()
	 * @see #unsetNombreMaximumWagons()
	 * @see #setNombreMaximumWagons(long)
	 * @see mpia.schema.SchemaPackage#getTypeJetee_NombreMaximumWagons()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreMaximumWagons'"
	 * @generated
	 */
	long getNombreMaximumWagons();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJetee#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Maximum Wagons</em>' attribute.
	 * @see #isSetNombreMaximumWagons()
	 * @see #unsetNombreMaximumWagons()
	 * @see #getNombreMaximumWagons()
	 * @generated
	 */
	void setNombreMaximumWagons(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeJetee#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaximumWagons()
	 * @see #getNombreMaximumWagons()
	 * @see #setNombreMaximumWagons(long)
	 * @generated
	 */
	void unsetNombreMaximumWagons();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeJetee#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Maximum Wagons</em>' attribute is set.
	 * @see #unsetNombreMaximumWagons()
	 * @see #getNombreMaximumWagons()
	 * @see #setNombreMaximumWagons(long)
	 * @generated
	 */
	boolean isSetNombreMaximumWagons();

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
	 * @see mpia.schema.SchemaPackage#getTypeJetee_ChargeExplosiveLimiteJour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteJour'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJetee#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeJetee_ChargeExplosiveLimiteNuit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteNuit'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJetee#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Explosive Limite Nuit</em>' containment reference.
	 * @see #getChargeExplosiveLimiteNuit()
	 * @generated
	 */
	void setChargeExplosiveLimiteNuit(TypeDataTypeMasse value);

} // TypeJetee
