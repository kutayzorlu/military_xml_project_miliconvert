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
 * A representation of the model object '<em><b>Type Quai Maritime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getAmplitudeMaximale <em>Amplitude Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getTirantEau <em>Tirant Eau</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getChargeEnLourdMaximale <em>Charge En Lourd Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getTypeAmarrage <em>Type Amarrage</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getTypeStockage <em>Type Stockage</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getHauteurQuai <em>Hauteur Quai</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getTypeGrueDechargement <em>Type Grue Dechargement</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getChargeMaximalePourGrue <em>Charge Maximale Pour Grue</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getManipulationConteneurs <em>Manipulation Conteneurs</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getPoidsMaximalConteneur <em>Poids Maximal Conteneur</em>}</li>
 *   <li>{@link mpia.schema.TypeQuaiMaritime#getLongueurMaximaleConteneur <em>Longueur Maximale Conteneur</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_QuaiMaritime' kind='elementOnly'"
 * @generated
 */
public interface TypeQuaiMaritime extends TypeSite {
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
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_AmplitudeMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AmplitudeMaximale'"
	 * @generated
	 */
	TypeDataTypeLongueur getAmplitudeMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getAmplitudeMaximale <em>Amplitude Maximale</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_TirantEau()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TirantEau'"
	 * @generated
	 */
	TypeDataTypeLongueur getTirantEau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getTirantEau <em>Tirant Eau</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_ChargeEnLourdMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeEnLourdMaximale'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeEnLourdMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getChargeEnLourdMaximale <em>Charge En Lourd Maximale</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_DesserteRailDisponible()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DesserteRailDisponible'"
	 * @generated
	 */
	boolean isDesserteRailDisponible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeQuaiMaritime#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDesserteRailDisponible()
	 * @see #isDesserteRailDisponible()
	 * @see #setDesserteRailDisponible(boolean)
	 * @generated
	 */
	void unsetDesserteRailDisponible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuaiMaritime#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_NombreMaximumWagons()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreMaximumWagons'"
	 * @generated
	 */
	long getNombreMaximumWagons();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeQuaiMaritime#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaximumWagons()
	 * @see #getNombreMaximumWagons()
	 * @see #setNombreMaximumWagons(long)
	 * @generated
	 */
	void unsetNombreMaximumWagons();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuaiMaritime#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_ChargeExplosiveLimiteJour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteJour'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_ChargeExplosiveLimiteNuit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteNuit'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Explosive Limite Nuit</em>' containment reference.
	 * @see #getChargeExplosiveLimiteNuit()
	 * @generated
	 */
	void setChargeExplosiveLimiteNuit(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Type Amarrage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeAmarrage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Amarrage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Amarrage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeAmarrage
	 * @see #isSetTypeAmarrage()
	 * @see #unsetTypeAmarrage()
	 * @see #setTypeAmarrage(TypeDictionaryDicoQuaiMaritimeTypeAmarrage)
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_TypeAmarrage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeAmarrage'"
	 * @generated
	 */
	TypeDictionaryDicoQuaiMaritimeTypeAmarrage getTypeAmarrage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getTypeAmarrage <em>Type Amarrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Amarrage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeAmarrage
	 * @see #isSetTypeAmarrage()
	 * @see #unsetTypeAmarrage()
	 * @see #getTypeAmarrage()
	 * @generated
	 */
	void setTypeAmarrage(TypeDictionaryDicoQuaiMaritimeTypeAmarrage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuaiMaritime#getTypeAmarrage <em>Type Amarrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeAmarrage()
	 * @see #getTypeAmarrage()
	 * @see #setTypeAmarrage(TypeDictionaryDicoQuaiMaritimeTypeAmarrage)
	 * @generated
	 */
	void unsetTypeAmarrage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuaiMaritime#getTypeAmarrage <em>Type Amarrage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Amarrage</em>' attribute is set.
	 * @see #unsetTypeAmarrage()
	 * @see #getTypeAmarrage()
	 * @see #setTypeAmarrage(TypeDictionaryDicoQuaiMaritimeTypeAmarrage)
	 * @generated
	 */
	boolean isSetTypeAmarrage();

	/**
	 * Returns the value of the '<em><b>Type Stockage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeStockage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Stockage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Stockage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeStockage
	 * @see #isSetTypeStockage()
	 * @see #unsetTypeStockage()
	 * @see #setTypeStockage(TypeDictionaryDicoQuaiMaritimeTypeStockage)
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_TypeStockage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeStockage'"
	 * @generated
	 */
	TypeDictionaryDicoQuaiMaritimeTypeStockage getTypeStockage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getTypeStockage <em>Type Stockage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Stockage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeStockage
	 * @see #isSetTypeStockage()
	 * @see #unsetTypeStockage()
	 * @see #getTypeStockage()
	 * @generated
	 */
	void setTypeStockage(TypeDictionaryDicoQuaiMaritimeTypeStockage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuaiMaritime#getTypeStockage <em>Type Stockage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeStockage()
	 * @see #getTypeStockage()
	 * @see #setTypeStockage(TypeDictionaryDicoQuaiMaritimeTypeStockage)
	 * @generated
	 */
	void unsetTypeStockage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuaiMaritime#getTypeStockage <em>Type Stockage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Stockage</em>' attribute is set.
	 * @see #unsetTypeStockage()
	 * @see #getTypeStockage()
	 * @see #setTypeStockage(TypeDictionaryDicoQuaiMaritimeTypeStockage)
	 * @generated
	 */
	boolean isSetTypeStockage();

	/**
	 * Returns the value of the '<em><b>Hauteur Quai</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Quai</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Quai</em>' containment reference.
	 * @see #setHauteurQuai(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_HauteurQuai()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HauteurQuai'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteurQuai();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getHauteurQuai <em>Hauteur Quai</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Quai</em>' containment reference.
	 * @see #getHauteurQuai()
	 * @generated
	 */
	void setHauteurQuai(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Type Grue Dechargement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Grue Dechargement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Grue Dechargement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement
	 * @see #isSetTypeGrueDechargement()
	 * @see #unsetTypeGrueDechargement()
	 * @see #setTypeGrueDechargement(TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement)
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_TypeGrueDechargement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeGrueDechargement'"
	 * @generated
	 */
	TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement getTypeGrueDechargement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getTypeGrueDechargement <em>Type Grue Dechargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Grue Dechargement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement
	 * @see #isSetTypeGrueDechargement()
	 * @see #unsetTypeGrueDechargement()
	 * @see #getTypeGrueDechargement()
	 * @generated
	 */
	void setTypeGrueDechargement(TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuaiMaritime#getTypeGrueDechargement <em>Type Grue Dechargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeGrueDechargement()
	 * @see #getTypeGrueDechargement()
	 * @see #setTypeGrueDechargement(TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement)
	 * @generated
	 */
	void unsetTypeGrueDechargement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuaiMaritime#getTypeGrueDechargement <em>Type Grue Dechargement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Grue Dechargement</em>' attribute is set.
	 * @see #unsetTypeGrueDechargement()
	 * @see #getTypeGrueDechargement()
	 * @see #setTypeGrueDechargement(TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement)
	 * @generated
	 */
	boolean isSetTypeGrueDechargement();

	/**
	 * Returns the value of the '<em><b>Charge Maximale Pour Grue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Maximale Pour Grue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Maximale Pour Grue</em>' containment reference.
	 * @see #setChargeMaximalePourGrue(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_ChargeMaximalePourGrue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeMaximalePourGrue'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeMaximalePourGrue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getChargeMaximalePourGrue <em>Charge Maximale Pour Grue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Maximale Pour Grue</em>' containment reference.
	 * @see #getChargeMaximalePourGrue()
	 * @generated
	 */
	void setChargeMaximalePourGrue(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Manipulation Conteneurs</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoQuaiMaritimeManipulationConteneurs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manipulation Conteneurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manipulation Conteneurs</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoQuaiMaritimeManipulationConteneurs
	 * @see #isSetManipulationConteneurs()
	 * @see #unsetManipulationConteneurs()
	 * @see #setManipulationConteneurs(TypeDictionaryDicoQuaiMaritimeManipulationConteneurs)
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_ManipulationConteneurs()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ManipulationConteneurs'"
	 * @generated
	 */
	TypeDictionaryDicoQuaiMaritimeManipulationConteneurs getManipulationConteneurs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getManipulationConteneurs <em>Manipulation Conteneurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manipulation Conteneurs</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoQuaiMaritimeManipulationConteneurs
	 * @see #isSetManipulationConteneurs()
	 * @see #unsetManipulationConteneurs()
	 * @see #getManipulationConteneurs()
	 * @generated
	 */
	void setManipulationConteneurs(TypeDictionaryDicoQuaiMaritimeManipulationConteneurs value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuaiMaritime#getManipulationConteneurs <em>Manipulation Conteneurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManipulationConteneurs()
	 * @see #getManipulationConteneurs()
	 * @see #setManipulationConteneurs(TypeDictionaryDicoQuaiMaritimeManipulationConteneurs)
	 * @generated
	 */
	void unsetManipulationConteneurs();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuaiMaritime#getManipulationConteneurs <em>Manipulation Conteneurs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Manipulation Conteneurs</em>' attribute is set.
	 * @see #unsetManipulationConteneurs()
	 * @see #getManipulationConteneurs()
	 * @see #setManipulationConteneurs(TypeDictionaryDicoQuaiMaritimeManipulationConteneurs)
	 * @generated
	 */
	boolean isSetManipulationConteneurs();

	/**
	 * Returns the value of the '<em><b>Poids Maximal Conteneur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poids Maximal Conteneur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids Maximal Conteneur</em>' containment reference.
	 * @see #setPoidsMaximalConteneur(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_PoidsMaximalConteneur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PoidsMaximalConteneur'"
	 * @generated
	 */
	TypeDataTypeMasse getPoidsMaximalConteneur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getPoidsMaximalConteneur <em>Poids Maximal Conteneur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids Maximal Conteneur</em>' containment reference.
	 * @see #getPoidsMaximalConteneur()
	 * @generated
	 */
	void setPoidsMaximalConteneur(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Longueur Maximale Conteneur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Maximale Conteneur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Maximale Conteneur</em>' containment reference.
	 * @see #setLongueurMaximaleConteneur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeQuaiMaritime_LongueurMaximaleConteneur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongueurMaximaleConteneur'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueurMaximaleConteneur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuaiMaritime#getLongueurMaximaleConteneur <em>Longueur Maximale Conteneur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Maximale Conteneur</em>' containment reference.
	 * @see #getLongueurMaximaleConteneur()
	 * @generated
	 */
	void setLongueurMaximaleConteneur(TypeDataTypeLongueur value);

} // TypeQuaiMaritime
