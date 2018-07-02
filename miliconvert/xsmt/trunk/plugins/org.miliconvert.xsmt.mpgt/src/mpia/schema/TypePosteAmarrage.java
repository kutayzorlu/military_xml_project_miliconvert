/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVolume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Poste Amarrage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getProfondeurAMareeBasse <em>Profondeur AMaree Basse</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getLargeurMaximale <em>Largeur Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getChargeEnLourdAcceptable <em>Charge En Lourd Acceptable</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getCapaciteMaximale <em>Capacite Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getNombreMaximumBatiment <em>Nombre Maximum Batiment</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getTypeBatimentPrincipal <em>Type Batiment Principal</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#isRoulage <em>Roulage</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getTempsRotation <em>Temps Rotation</em>}</li>
 *   <li>{@link mpia.schema.TypePosteAmarrage#getSpecificites <em>Specificites</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PosteAmarrage' kind='elementOnly'"
 * @generated
 */
public interface TypePosteAmarrage extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Profondeur AMaree Basse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profondeur AMaree Basse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profondeur AMaree Basse</em>' containment reference.
	 * @see #setProfondeurAMareeBasse(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_ProfondeurAMareeBasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProfondeurAMareeBasse'"
	 * @generated
	 */
	TypeDataTypeLongueur getProfondeurAMareeBasse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getProfondeurAMareeBasse <em>Profondeur AMaree Basse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profondeur AMaree Basse</em>' containment reference.
	 * @see #getProfondeurAMareeBasse()
	 * @generated
	 */
	void setProfondeurAMareeBasse(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Largeur Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Maximale</em>' containment reference.
	 * @see #setLargeurMaximale(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_LargeurMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurMaximale'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getLargeurMaximale <em>Largeur Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Maximale</em>' containment reference.
	 * @see #getLargeurMaximale()
	 * @generated
	 */
	void setLargeurMaximale(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Charge En Lourd Acceptable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge En Lourd Acceptable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge En Lourd Acceptable</em>' containment reference.
	 * @see #setChargeEnLourdAcceptable(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_ChargeEnLourdAcceptable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeEnLourdAcceptable'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeEnLourdAcceptable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getChargeEnLourdAcceptable <em>Charge En Lourd Acceptable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge En Lourd Acceptable</em>' containment reference.
	 * @see #getChargeEnLourdAcceptable()
	 * @generated
	 */
	void setChargeEnLourdAcceptable(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Capacite Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Maximale</em>' containment reference.
	 * @see #setCapaciteMaximale(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_CapaciteMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapaciteMaximale'"
	 * @generated
	 */
	TypeDataTypeVolume getCapaciteMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getCapaciteMaximale <em>Capacite Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Maximale</em>' containment reference.
	 * @see #getCapaciteMaximale()
	 * @generated
	 */
	void setCapaciteMaximale(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Nombre Maximum Batiment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Maximum Batiment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Maximum Batiment</em>' attribute.
	 * @see #isSetNombreMaximumBatiment()
	 * @see #unsetNombreMaximumBatiment()
	 * @see #setNombreMaximumBatiment(long)
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_NombreMaximumBatiment()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreMaximumBatiment'"
	 * @generated
	 */
	long getNombreMaximumBatiment();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getNombreMaximumBatiment <em>Nombre Maximum Batiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Maximum Batiment</em>' attribute.
	 * @see #isSetNombreMaximumBatiment()
	 * @see #unsetNombreMaximumBatiment()
	 * @see #getNombreMaximumBatiment()
	 * @generated
	 */
	void setNombreMaximumBatiment(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePosteAmarrage#getNombreMaximumBatiment <em>Nombre Maximum Batiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaximumBatiment()
	 * @see #getNombreMaximumBatiment()
	 * @see #setNombreMaximumBatiment(long)
	 * @generated
	 */
	void unsetNombreMaximumBatiment();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePosteAmarrage#getNombreMaximumBatiment <em>Nombre Maximum Batiment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Maximum Batiment</em>' attribute is set.
	 * @see #unsetNombreMaximumBatiment()
	 * @see #getNombreMaximumBatiment()
	 * @see #setNombreMaximumBatiment(long)
	 * @generated
	 */
	boolean isSetNombreMaximumBatiment();

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
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_ChargeExplosiveLimiteJour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteJour'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_ChargeExplosiveLimiteNuit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteNuit'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Explosive Limite Nuit</em>' containment reference.
	 * @see #getChargeExplosiveLimiteNuit()
	 * @generated
	 */
	void setChargeExplosiveLimiteNuit(TypeDataTypeMasse value);

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
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_DesserteRailDisponible()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DesserteRailDisponible'"
	 * @generated
	 */
	boolean isDesserteRailDisponible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypePosteAmarrage#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDesserteRailDisponible()
	 * @see #isDesserteRailDisponible()
	 * @see #setDesserteRailDisponible(boolean)
	 * @generated
	 */
	void unsetDesserteRailDisponible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePosteAmarrage#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Type Batiment Principal</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Batiment Principal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Batiment Principal</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal
	 * @see #isSetTypeBatimentPrincipal()
	 * @see #unsetTypeBatimentPrincipal()
	 * @see #setTypeBatimentPrincipal(TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal)
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_TypeBatimentPrincipal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeBatimentPrincipal'"
	 * @generated
	 */
	TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal getTypeBatimentPrincipal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getTypeBatimentPrincipal <em>Type Batiment Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Batiment Principal</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal
	 * @see #isSetTypeBatimentPrincipal()
	 * @see #unsetTypeBatimentPrincipal()
	 * @see #getTypeBatimentPrincipal()
	 * @generated
	 */
	void setTypeBatimentPrincipal(TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePosteAmarrage#getTypeBatimentPrincipal <em>Type Batiment Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeBatimentPrincipal()
	 * @see #getTypeBatimentPrincipal()
	 * @see #setTypeBatimentPrincipal(TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal)
	 * @generated
	 */
	void unsetTypeBatimentPrincipal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePosteAmarrage#getTypeBatimentPrincipal <em>Type Batiment Principal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Batiment Principal</em>' attribute is set.
	 * @see #unsetTypeBatimentPrincipal()
	 * @see #getTypeBatimentPrincipal()
	 * @see #setTypeBatimentPrincipal(TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal)
	 * @generated
	 */
	boolean isSetTypeBatimentPrincipal();

	/**
	 * Returns the value of the '<em><b>Roulage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roulage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roulage</em>' attribute.
	 * @see #isSetRoulage()
	 * @see #unsetRoulage()
	 * @see #setRoulage(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_Roulage()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Roulage'"
	 * @generated
	 */
	boolean isRoulage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#isRoulage <em>Roulage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roulage</em>' attribute.
	 * @see #isSetRoulage()
	 * @see #unsetRoulage()
	 * @see #isRoulage()
	 * @generated
	 */
	void setRoulage(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePosteAmarrage#isRoulage <em>Roulage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoulage()
	 * @see #isRoulage()
	 * @see #setRoulage(boolean)
	 * @generated
	 */
	void unsetRoulage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePosteAmarrage#isRoulage <em>Roulage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Roulage</em>' attribute is set.
	 * @see #unsetRoulage()
	 * @see #isRoulage()
	 * @see #setRoulage(boolean)
	 * @generated
	 */
	boolean isSetRoulage();

	/**
	 * Returns the value of the '<em><b>Temps Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps Rotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Rotation</em>' containment reference.
	 * @see #setTempsRotation(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_TempsRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TempsRotation'"
	 * @generated
	 */
	TypeDataTypeDuree getTempsRotation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getTempsRotation <em>Temps Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Rotation</em>' containment reference.
	 * @see #getTempsRotation()
	 * @generated
	 */
	void setTempsRotation(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Specificites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specificites</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specificites</em>' attribute.
	 * @see #setSpecificites(String)
	 * @see mpia.schema.SchemaPackage#getTypePosteAmarrage_Specificites()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Specificites'"
	 * @generated
	 */
	String getSpecificites();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteAmarrage#getSpecificites <em>Specificites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specificites</em>' attribute.
	 * @see #getSpecificites()
	 * @generated
	 */
	void setSpecificites(String value);

} // TypePosteAmarrage
