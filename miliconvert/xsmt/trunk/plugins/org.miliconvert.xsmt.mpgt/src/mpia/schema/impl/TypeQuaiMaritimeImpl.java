/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoQuaiMaritimeManipulationConteneurs;
import mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeAmarrage;
import mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement;
import mpia.schema.TypeDictionaryDicoQuaiMaritimeTypeStockage;
import mpia.schema.TypeQuaiMaritime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Quai Maritime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getAmplitudeMaximale <em>Amplitude Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getTirantEau <em>Tirant Eau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getChargeEnLourdMaximale <em>Charge En Lourd Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getTypeAmarrage <em>Type Amarrage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getTypeStockage <em>Type Stockage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getHauteurQuai <em>Hauteur Quai</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getTypeGrueDechargement <em>Type Grue Dechargement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getChargeMaximalePourGrue <em>Charge Maximale Pour Grue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getManipulationConteneurs <em>Manipulation Conteneurs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getPoidsMaximalConteneur <em>Poids Maximal Conteneur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuaiMaritimeImpl#getLongueurMaximaleConteneur <em>Longueur Maximale Conteneur</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeQuaiMaritimeImpl extends TypeSiteImpl implements TypeQuaiMaritime {
	/**
	 * The cached value of the '{@link #getAmplitudeMaximale() <em>Amplitude Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplitudeMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur amplitudeMaximale;

	/**
	 * The cached value of the '{@link #getTirantEau() <em>Tirant Eau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTirantEau()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur tirantEau;

	/**
	 * The cached value of the '{@link #getChargeEnLourdMaximale() <em>Charge En Lourd Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeEnLourdMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeEnLourdMaximale;

	/**
	 * The default value of the '{@link #isDesserteRailDisponible() <em>Desserte Rail Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesserteRailDisponible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESSERTE_RAIL_DISPONIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDesserteRailDisponible() <em>Desserte Rail Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesserteRailDisponible()
	 * @generated
	 * @ordered
	 */
	protected boolean desserteRailDisponible = DESSERTE_RAIL_DISPONIBLE_EDEFAULT;

	/**
	 * This is true if the Desserte Rail Disponible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean desserteRailDisponibleESet;

	/**
	 * The default value of the '{@link #getNombreMaximumWagons() <em>Nombre Maximum Wagons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaximumWagons()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAXIMUM_WAGONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaximumWagons() <em>Nombre Maximum Wagons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaximumWagons()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaximumWagons = NOMBRE_MAXIMUM_WAGONS_EDEFAULT;

	/**
	 * This is true if the Nombre Maximum Wagons attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaximumWagonsESet;

	/**
	 * The cached value of the '{@link #getChargeExplosiveLimiteJour() <em>Charge Explosive Limite Jour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeExplosiveLimiteJour()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeExplosiveLimiteJour;

	/**
	 * The cached value of the '{@link #getChargeExplosiveLimiteNuit() <em>Charge Explosive Limite Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeExplosiveLimiteNuit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeExplosiveLimiteNuit;

	/**
	 * The default value of the '{@link #getTypeAmarrage() <em>Type Amarrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAmarrage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoQuaiMaritimeTypeAmarrage TYPE_AMARRAGE_EDEFAULT = TypeDictionaryDicoQuaiMaritimeTypeAmarrage.QUAY;

	/**
	 * The cached value of the '{@link #getTypeAmarrage() <em>Type Amarrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAmarrage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoQuaiMaritimeTypeAmarrage typeAmarrage = TYPE_AMARRAGE_EDEFAULT;

	/**
	 * This is true if the Type Amarrage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeAmarrageESet;

	/**
	 * The default value of the '{@link #getTypeStockage() <em>Type Stockage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeStockage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoQuaiMaritimeTypeStockage TYPE_STOCKAGE_EDEFAULT = TypeDictionaryDicoQuaiMaritimeTypeStockage.GRNSIL;

	/**
	 * The cached value of the '{@link #getTypeStockage() <em>Type Stockage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeStockage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoQuaiMaritimeTypeStockage typeStockage = TYPE_STOCKAGE_EDEFAULT;

	/**
	 * This is true if the Type Stockage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeStockageESet;

	/**
	 * The cached value of the '{@link #getHauteurQuai() <em>Hauteur Quai</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurQuai()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteurQuai;

	/**
	 * The default value of the '{@link #getTypeGrueDechargement() <em>Type Grue Dechargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGrueDechargement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement TYPE_GRUE_DECHARGEMENT_EDEFAULT = TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement.FLTCRN;

	/**
	 * The cached value of the '{@link #getTypeGrueDechargement() <em>Type Grue Dechargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGrueDechargement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement typeGrueDechargement = TYPE_GRUE_DECHARGEMENT_EDEFAULT;

	/**
	 * This is true if the Type Grue Dechargement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeGrueDechargementESet;

	/**
	 * The cached value of the '{@link #getChargeMaximalePourGrue() <em>Charge Maximale Pour Grue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeMaximalePourGrue()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeMaximalePourGrue;

	/**
	 * The default value of the '{@link #getManipulationConteneurs() <em>Manipulation Conteneurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManipulationConteneurs()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoQuaiMaritimeManipulationConteneurs MANIPULATION_CONTENEURS_EDEFAULT = TypeDictionaryDicoQuaiMaritimeManipulationConteneurs.CNTSTR;

	/**
	 * The cached value of the '{@link #getManipulationConteneurs() <em>Manipulation Conteneurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManipulationConteneurs()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoQuaiMaritimeManipulationConteneurs manipulationConteneurs = MANIPULATION_CONTENEURS_EDEFAULT;

	/**
	 * This is true if the Manipulation Conteneurs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean manipulationConteneursESet;

	/**
	 * The cached value of the '{@link #getPoidsMaximalConteneur() <em>Poids Maximal Conteneur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoidsMaximalConteneur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse poidsMaximalConteneur;

	/**
	 * The cached value of the '{@link #getLongueurMaximaleConteneur() <em>Longueur Maximale Conteneur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurMaximaleConteneur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueurMaximaleConteneur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeQuaiMaritimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeQuaiMaritime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getAmplitudeMaximale() {
		return amplitudeMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmplitudeMaximale(TypeDataTypeLongueur newAmplitudeMaximale, NotificationChain msgs) {
		TypeDataTypeLongueur oldAmplitudeMaximale = amplitudeMaximale;
		amplitudeMaximale = newAmplitudeMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__AMPLITUDE_MAXIMALE, oldAmplitudeMaximale, newAmplitudeMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmplitudeMaximale(TypeDataTypeLongueur newAmplitudeMaximale) {
		if (newAmplitudeMaximale != amplitudeMaximale) {
			NotificationChain msgs = null;
			if (amplitudeMaximale != null)
				msgs = ((InternalEObject)amplitudeMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__AMPLITUDE_MAXIMALE, null, msgs);
			if (newAmplitudeMaximale != null)
				msgs = ((InternalEObject)newAmplitudeMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__AMPLITUDE_MAXIMALE, null, msgs);
			msgs = basicSetAmplitudeMaximale(newAmplitudeMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__AMPLITUDE_MAXIMALE, newAmplitudeMaximale, newAmplitudeMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getTirantEau() {
		return tirantEau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTirantEau(TypeDataTypeLongueur newTirantEau, NotificationChain msgs) {
		TypeDataTypeLongueur oldTirantEau = tirantEau;
		tirantEau = newTirantEau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__TIRANT_EAU, oldTirantEau, newTirantEau);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTirantEau(TypeDataTypeLongueur newTirantEau) {
		if (newTirantEau != tirantEau) {
			NotificationChain msgs = null;
			if (tirantEau != null)
				msgs = ((InternalEObject)tirantEau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__TIRANT_EAU, null, msgs);
			if (newTirantEau != null)
				msgs = ((InternalEObject)newTirantEau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__TIRANT_EAU, null, msgs);
			msgs = basicSetTirantEau(newTirantEau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__TIRANT_EAU, newTirantEau, newTirantEau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeEnLourdMaximale() {
		return chargeEnLourdMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeEnLourdMaximale(TypeDataTypeMasse newChargeEnLourdMaximale, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeEnLourdMaximale = chargeEnLourdMaximale;
		chargeEnLourdMaximale = newChargeEnLourdMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EN_LOURD_MAXIMALE, oldChargeEnLourdMaximale, newChargeEnLourdMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeEnLourdMaximale(TypeDataTypeMasse newChargeEnLourdMaximale) {
		if (newChargeEnLourdMaximale != chargeEnLourdMaximale) {
			NotificationChain msgs = null;
			if (chargeEnLourdMaximale != null)
				msgs = ((InternalEObject)chargeEnLourdMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EN_LOURD_MAXIMALE, null, msgs);
			if (newChargeEnLourdMaximale != null)
				msgs = ((InternalEObject)newChargeEnLourdMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EN_LOURD_MAXIMALE, null, msgs);
			msgs = basicSetChargeEnLourdMaximale(newChargeEnLourdMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EN_LOURD_MAXIMALE, newChargeEnLourdMaximale, newChargeEnLourdMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDesserteRailDisponible() {
		return desserteRailDisponible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesserteRailDisponible(boolean newDesserteRailDisponible) {
		boolean oldDesserteRailDisponible = desserteRailDisponible;
		desserteRailDisponible = newDesserteRailDisponible;
		boolean oldDesserteRailDisponibleESet = desserteRailDisponibleESet;
		desserteRailDisponibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__DESSERTE_RAIL_DISPONIBLE, oldDesserteRailDisponible, desserteRailDisponible, !oldDesserteRailDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDesserteRailDisponible() {
		boolean oldDesserteRailDisponible = desserteRailDisponible;
		boolean oldDesserteRailDisponibleESet = desserteRailDisponibleESet;
		desserteRailDisponible = DESSERTE_RAIL_DISPONIBLE_EDEFAULT;
		desserteRailDisponibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUAI_MARITIME__DESSERTE_RAIL_DISPONIBLE, oldDesserteRailDisponible, DESSERTE_RAIL_DISPONIBLE_EDEFAULT, oldDesserteRailDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDesserteRailDisponible() {
		return desserteRailDisponibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaximumWagons() {
		return nombreMaximumWagons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaximumWagons(long newNombreMaximumWagons) {
		long oldNombreMaximumWagons = nombreMaximumWagons;
		nombreMaximumWagons = newNombreMaximumWagons;
		boolean oldNombreMaximumWagonsESet = nombreMaximumWagonsESet;
		nombreMaximumWagonsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__NOMBRE_MAXIMUM_WAGONS, oldNombreMaximumWagons, nombreMaximumWagons, !oldNombreMaximumWagonsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaximumWagons() {
		long oldNombreMaximumWagons = nombreMaximumWagons;
		boolean oldNombreMaximumWagonsESet = nombreMaximumWagonsESet;
		nombreMaximumWagons = NOMBRE_MAXIMUM_WAGONS_EDEFAULT;
		nombreMaximumWagonsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUAI_MARITIME__NOMBRE_MAXIMUM_WAGONS, oldNombreMaximumWagons, NOMBRE_MAXIMUM_WAGONS_EDEFAULT, oldNombreMaximumWagonsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaximumWagons() {
		return nombreMaximumWagonsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeExplosiveLimiteJour() {
		return chargeExplosiveLimiteJour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeExplosiveLimiteJour(TypeDataTypeMasse newChargeExplosiveLimiteJour, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeExplosiveLimiteJour = chargeExplosiveLimiteJour;
		chargeExplosiveLimiteJour = newChargeExplosiveLimiteJour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_JOUR, oldChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeExplosiveLimiteJour(TypeDataTypeMasse newChargeExplosiveLimiteJour) {
		if (newChargeExplosiveLimiteJour != chargeExplosiveLimiteJour) {
			NotificationChain msgs = null;
			if (chargeExplosiveLimiteJour != null)
				msgs = ((InternalEObject)chargeExplosiveLimiteJour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			if (newChargeExplosiveLimiteJour != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteJour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			msgs = basicSetChargeExplosiveLimiteJour(newChargeExplosiveLimiteJour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_JOUR, newChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeExplosiveLimiteNuit() {
		return chargeExplosiveLimiteNuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeExplosiveLimiteNuit(TypeDataTypeMasse newChargeExplosiveLimiteNuit, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeExplosiveLimiteNuit = chargeExplosiveLimiteNuit;
		chargeExplosiveLimiteNuit = newChargeExplosiveLimiteNuit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_NUIT, oldChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeExplosiveLimiteNuit(TypeDataTypeMasse newChargeExplosiveLimiteNuit) {
		if (newChargeExplosiveLimiteNuit != chargeExplosiveLimiteNuit) {
			NotificationChain msgs = null;
			if (chargeExplosiveLimiteNuit != null)
				msgs = ((InternalEObject)chargeExplosiveLimiteNuit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			if (newChargeExplosiveLimiteNuit != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteNuit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			msgs = basicSetChargeExplosiveLimiteNuit(newChargeExplosiveLimiteNuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_NUIT, newChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoQuaiMaritimeTypeAmarrage getTypeAmarrage() {
		return typeAmarrage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAmarrage(TypeDictionaryDicoQuaiMaritimeTypeAmarrage newTypeAmarrage) {
		TypeDictionaryDicoQuaiMaritimeTypeAmarrage oldTypeAmarrage = typeAmarrage;
		typeAmarrage = newTypeAmarrage == null ? TYPE_AMARRAGE_EDEFAULT : newTypeAmarrage;
		boolean oldTypeAmarrageESet = typeAmarrageESet;
		typeAmarrageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__TYPE_AMARRAGE, oldTypeAmarrage, typeAmarrage, !oldTypeAmarrageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeAmarrage() {
		TypeDictionaryDicoQuaiMaritimeTypeAmarrage oldTypeAmarrage = typeAmarrage;
		boolean oldTypeAmarrageESet = typeAmarrageESet;
		typeAmarrage = TYPE_AMARRAGE_EDEFAULT;
		typeAmarrageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUAI_MARITIME__TYPE_AMARRAGE, oldTypeAmarrage, TYPE_AMARRAGE_EDEFAULT, oldTypeAmarrageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeAmarrage() {
		return typeAmarrageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoQuaiMaritimeTypeStockage getTypeStockage() {
		return typeStockage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeStockage(TypeDictionaryDicoQuaiMaritimeTypeStockage newTypeStockage) {
		TypeDictionaryDicoQuaiMaritimeTypeStockage oldTypeStockage = typeStockage;
		typeStockage = newTypeStockage == null ? TYPE_STOCKAGE_EDEFAULT : newTypeStockage;
		boolean oldTypeStockageESet = typeStockageESet;
		typeStockageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__TYPE_STOCKAGE, oldTypeStockage, typeStockage, !oldTypeStockageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeStockage() {
		TypeDictionaryDicoQuaiMaritimeTypeStockage oldTypeStockage = typeStockage;
		boolean oldTypeStockageESet = typeStockageESet;
		typeStockage = TYPE_STOCKAGE_EDEFAULT;
		typeStockageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUAI_MARITIME__TYPE_STOCKAGE, oldTypeStockage, TYPE_STOCKAGE_EDEFAULT, oldTypeStockageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeStockage() {
		return typeStockageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteurQuai() {
		return hauteurQuai;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteurQuai(TypeDataTypeLongueur newHauteurQuai, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteurQuai = hauteurQuai;
		hauteurQuai = newHauteurQuai;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__HAUTEUR_QUAI, oldHauteurQuai, newHauteurQuai);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurQuai(TypeDataTypeLongueur newHauteurQuai) {
		if (newHauteurQuai != hauteurQuai) {
			NotificationChain msgs = null;
			if (hauteurQuai != null)
				msgs = ((InternalEObject)hauteurQuai).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__HAUTEUR_QUAI, null, msgs);
			if (newHauteurQuai != null)
				msgs = ((InternalEObject)newHauteurQuai).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__HAUTEUR_QUAI, null, msgs);
			msgs = basicSetHauteurQuai(newHauteurQuai, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__HAUTEUR_QUAI, newHauteurQuai, newHauteurQuai));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement getTypeGrueDechargement() {
		return typeGrueDechargement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeGrueDechargement(TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement newTypeGrueDechargement) {
		TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement oldTypeGrueDechargement = typeGrueDechargement;
		typeGrueDechargement = newTypeGrueDechargement == null ? TYPE_GRUE_DECHARGEMENT_EDEFAULT : newTypeGrueDechargement;
		boolean oldTypeGrueDechargementESet = typeGrueDechargementESet;
		typeGrueDechargementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__TYPE_GRUE_DECHARGEMENT, oldTypeGrueDechargement, typeGrueDechargement, !oldTypeGrueDechargementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeGrueDechargement() {
		TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement oldTypeGrueDechargement = typeGrueDechargement;
		boolean oldTypeGrueDechargementESet = typeGrueDechargementESet;
		typeGrueDechargement = TYPE_GRUE_DECHARGEMENT_EDEFAULT;
		typeGrueDechargementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUAI_MARITIME__TYPE_GRUE_DECHARGEMENT, oldTypeGrueDechargement, TYPE_GRUE_DECHARGEMENT_EDEFAULT, oldTypeGrueDechargementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeGrueDechargement() {
		return typeGrueDechargementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeMaximalePourGrue() {
		return chargeMaximalePourGrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeMaximalePourGrue(TypeDataTypeMasse newChargeMaximalePourGrue, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeMaximalePourGrue = chargeMaximalePourGrue;
		chargeMaximalePourGrue = newChargeMaximalePourGrue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_MAXIMALE_POUR_GRUE, oldChargeMaximalePourGrue, newChargeMaximalePourGrue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeMaximalePourGrue(TypeDataTypeMasse newChargeMaximalePourGrue) {
		if (newChargeMaximalePourGrue != chargeMaximalePourGrue) {
			NotificationChain msgs = null;
			if (chargeMaximalePourGrue != null)
				msgs = ((InternalEObject)chargeMaximalePourGrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_MAXIMALE_POUR_GRUE, null, msgs);
			if (newChargeMaximalePourGrue != null)
				msgs = ((InternalEObject)newChargeMaximalePourGrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_MAXIMALE_POUR_GRUE, null, msgs);
			msgs = basicSetChargeMaximalePourGrue(newChargeMaximalePourGrue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_MAXIMALE_POUR_GRUE, newChargeMaximalePourGrue, newChargeMaximalePourGrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoQuaiMaritimeManipulationConteneurs getManipulationConteneurs() {
		return manipulationConteneurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManipulationConteneurs(TypeDictionaryDicoQuaiMaritimeManipulationConteneurs newManipulationConteneurs) {
		TypeDictionaryDicoQuaiMaritimeManipulationConteneurs oldManipulationConteneurs = manipulationConteneurs;
		manipulationConteneurs = newManipulationConteneurs == null ? MANIPULATION_CONTENEURS_EDEFAULT : newManipulationConteneurs;
		boolean oldManipulationConteneursESet = manipulationConteneursESet;
		manipulationConteneursESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__MANIPULATION_CONTENEURS, oldManipulationConteneurs, manipulationConteneurs, !oldManipulationConteneursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetManipulationConteneurs() {
		TypeDictionaryDicoQuaiMaritimeManipulationConteneurs oldManipulationConteneurs = manipulationConteneurs;
		boolean oldManipulationConteneursESet = manipulationConteneursESet;
		manipulationConteneurs = MANIPULATION_CONTENEURS_EDEFAULT;
		manipulationConteneursESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUAI_MARITIME__MANIPULATION_CONTENEURS, oldManipulationConteneurs, MANIPULATION_CONTENEURS_EDEFAULT, oldManipulationConteneursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetManipulationConteneurs() {
		return manipulationConteneursESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getPoidsMaximalConteneur() {
		return poidsMaximalConteneur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoidsMaximalConteneur(TypeDataTypeMasse newPoidsMaximalConteneur, NotificationChain msgs) {
		TypeDataTypeMasse oldPoidsMaximalConteneur = poidsMaximalConteneur;
		poidsMaximalConteneur = newPoidsMaximalConteneur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__POIDS_MAXIMAL_CONTENEUR, oldPoidsMaximalConteneur, newPoidsMaximalConteneur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoidsMaximalConteneur(TypeDataTypeMasse newPoidsMaximalConteneur) {
		if (newPoidsMaximalConteneur != poidsMaximalConteneur) {
			NotificationChain msgs = null;
			if (poidsMaximalConteneur != null)
				msgs = ((InternalEObject)poidsMaximalConteneur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__POIDS_MAXIMAL_CONTENEUR, null, msgs);
			if (newPoidsMaximalConteneur != null)
				msgs = ((InternalEObject)newPoidsMaximalConteneur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__POIDS_MAXIMAL_CONTENEUR, null, msgs);
			msgs = basicSetPoidsMaximalConteneur(newPoidsMaximalConteneur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__POIDS_MAXIMAL_CONTENEUR, newPoidsMaximalConteneur, newPoidsMaximalConteneur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueurMaximaleConteneur() {
		return longueurMaximaleConteneur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueurMaximaleConteneur(TypeDataTypeLongueur newLongueurMaximaleConteneur, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueurMaximaleConteneur = longueurMaximaleConteneur;
		longueurMaximaleConteneur = newLongueurMaximaleConteneur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__LONGUEUR_MAXIMALE_CONTENEUR, oldLongueurMaximaleConteneur, newLongueurMaximaleConteneur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurMaximaleConteneur(TypeDataTypeLongueur newLongueurMaximaleConteneur) {
		if (newLongueurMaximaleConteneur != longueurMaximaleConteneur) {
			NotificationChain msgs = null;
			if (longueurMaximaleConteneur != null)
				msgs = ((InternalEObject)longueurMaximaleConteneur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__LONGUEUR_MAXIMALE_CONTENEUR, null, msgs);
			if (newLongueurMaximaleConteneur != null)
				msgs = ((InternalEObject)newLongueurMaximaleConteneur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUAI_MARITIME__LONGUEUR_MAXIMALE_CONTENEUR, null, msgs);
			msgs = basicSetLongueurMaximaleConteneur(newLongueurMaximaleConteneur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUAI_MARITIME__LONGUEUR_MAXIMALE_CONTENEUR, newLongueurMaximaleConteneur, newLongueurMaximaleConteneur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUAI_MARITIME__AMPLITUDE_MAXIMALE:
				return basicSetAmplitudeMaximale(null, msgs);
			case SchemaPackage.TYPE_QUAI_MARITIME__TIRANT_EAU:
				return basicSetTirantEau(null, msgs);
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EN_LOURD_MAXIMALE:
				return basicSetChargeEnLourdMaximale(null, msgs);
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return basicSetChargeExplosiveLimiteJour(null, msgs);
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return basicSetChargeExplosiveLimiteNuit(null, msgs);
			case SchemaPackage.TYPE_QUAI_MARITIME__HAUTEUR_QUAI:
				return basicSetHauteurQuai(null, msgs);
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_MAXIMALE_POUR_GRUE:
				return basicSetChargeMaximalePourGrue(null, msgs);
			case SchemaPackage.TYPE_QUAI_MARITIME__POIDS_MAXIMAL_CONTENEUR:
				return basicSetPoidsMaximalConteneur(null, msgs);
			case SchemaPackage.TYPE_QUAI_MARITIME__LONGUEUR_MAXIMALE_CONTENEUR:
				return basicSetLongueurMaximaleConteneur(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUAI_MARITIME__AMPLITUDE_MAXIMALE:
				return getAmplitudeMaximale();
			case SchemaPackage.TYPE_QUAI_MARITIME__TIRANT_EAU:
				return getTirantEau();
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EN_LOURD_MAXIMALE:
				return getChargeEnLourdMaximale();
			case SchemaPackage.TYPE_QUAI_MARITIME__DESSERTE_RAIL_DISPONIBLE:
				return isDesserteRailDisponible() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_QUAI_MARITIME__NOMBRE_MAXIMUM_WAGONS:
				return new Long(getNombreMaximumWagons());
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return getChargeExplosiveLimiteJour();
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return getChargeExplosiveLimiteNuit();
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_AMARRAGE:
				return getTypeAmarrage();
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_STOCKAGE:
				return getTypeStockage();
			case SchemaPackage.TYPE_QUAI_MARITIME__HAUTEUR_QUAI:
				return getHauteurQuai();
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_GRUE_DECHARGEMENT:
				return getTypeGrueDechargement();
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_MAXIMALE_POUR_GRUE:
				return getChargeMaximalePourGrue();
			case SchemaPackage.TYPE_QUAI_MARITIME__MANIPULATION_CONTENEURS:
				return getManipulationConteneurs();
			case SchemaPackage.TYPE_QUAI_MARITIME__POIDS_MAXIMAL_CONTENEUR:
				return getPoidsMaximalConteneur();
			case SchemaPackage.TYPE_QUAI_MARITIME__LONGUEUR_MAXIMALE_CONTENEUR:
				return getLongueurMaximaleConteneur();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUAI_MARITIME__AMPLITUDE_MAXIMALE:
				setAmplitudeMaximale((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__TIRANT_EAU:
				setTirantEau((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EN_LOURD_MAXIMALE:
				setChargeEnLourdMaximale((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__DESSERTE_RAIL_DISPONIBLE:
				setDesserteRailDisponible(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__NOMBRE_MAXIMUM_WAGONS:
				setNombreMaximumWagons(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				setChargeExplosiveLimiteNuit((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_AMARRAGE:
				setTypeAmarrage((TypeDictionaryDicoQuaiMaritimeTypeAmarrage)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_STOCKAGE:
				setTypeStockage((TypeDictionaryDicoQuaiMaritimeTypeStockage)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__HAUTEUR_QUAI:
				setHauteurQuai((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_GRUE_DECHARGEMENT:
				setTypeGrueDechargement((TypeDictionaryDicoQuaiMaritimeTypeGrueDechargement)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_MAXIMALE_POUR_GRUE:
				setChargeMaximalePourGrue((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__MANIPULATION_CONTENEURS:
				setManipulationConteneurs((TypeDictionaryDicoQuaiMaritimeManipulationConteneurs)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__POIDS_MAXIMAL_CONTENEUR:
				setPoidsMaximalConteneur((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__LONGUEUR_MAXIMALE_CONTENEUR:
				setLongueurMaximaleConteneur((TypeDataTypeLongueur)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUAI_MARITIME__AMPLITUDE_MAXIMALE:
				setAmplitudeMaximale((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__TIRANT_EAU:
				setTirantEau((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EN_LOURD_MAXIMALE:
				setChargeEnLourdMaximale((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__DESSERTE_RAIL_DISPONIBLE:
				unsetDesserteRailDisponible();
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__NOMBRE_MAXIMUM_WAGONS:
				unsetNombreMaximumWagons();
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				setChargeExplosiveLimiteNuit((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_AMARRAGE:
				unsetTypeAmarrage();
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_STOCKAGE:
				unsetTypeStockage();
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__HAUTEUR_QUAI:
				setHauteurQuai((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_GRUE_DECHARGEMENT:
				unsetTypeGrueDechargement();
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_MAXIMALE_POUR_GRUE:
				setChargeMaximalePourGrue((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__MANIPULATION_CONTENEURS:
				unsetManipulationConteneurs();
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__POIDS_MAXIMAL_CONTENEUR:
				setPoidsMaximalConteneur((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_QUAI_MARITIME__LONGUEUR_MAXIMALE_CONTENEUR:
				setLongueurMaximaleConteneur((TypeDataTypeLongueur)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUAI_MARITIME__AMPLITUDE_MAXIMALE:
				return amplitudeMaximale != null;
			case SchemaPackage.TYPE_QUAI_MARITIME__TIRANT_EAU:
				return tirantEau != null;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EN_LOURD_MAXIMALE:
				return chargeEnLourdMaximale != null;
			case SchemaPackage.TYPE_QUAI_MARITIME__DESSERTE_RAIL_DISPONIBLE:
				return isSetDesserteRailDisponible();
			case SchemaPackage.TYPE_QUAI_MARITIME__NOMBRE_MAXIMUM_WAGONS:
				return isSetNombreMaximumWagons();
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return chargeExplosiveLimiteJour != null;
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return chargeExplosiveLimiteNuit != null;
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_AMARRAGE:
				return isSetTypeAmarrage();
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_STOCKAGE:
				return isSetTypeStockage();
			case SchemaPackage.TYPE_QUAI_MARITIME__HAUTEUR_QUAI:
				return hauteurQuai != null;
			case SchemaPackage.TYPE_QUAI_MARITIME__TYPE_GRUE_DECHARGEMENT:
				return isSetTypeGrueDechargement();
			case SchemaPackage.TYPE_QUAI_MARITIME__CHARGE_MAXIMALE_POUR_GRUE:
				return chargeMaximalePourGrue != null;
			case SchemaPackage.TYPE_QUAI_MARITIME__MANIPULATION_CONTENEURS:
				return isSetManipulationConteneurs();
			case SchemaPackage.TYPE_QUAI_MARITIME__POIDS_MAXIMAL_CONTENEUR:
				return poidsMaximalConteneur != null;
			case SchemaPackage.TYPE_QUAI_MARITIME__LONGUEUR_MAXIMALE_CONTENEUR:
				return longueurMaximaleConteneur != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (desserteRailDisponible: ");
		if (desserteRailDisponibleESet) result.append(desserteRailDisponible); else result.append("<unset>");
		result.append(", nombreMaximumWagons: ");
		if (nombreMaximumWagonsESet) result.append(nombreMaximumWagons); else result.append("<unset>");
		result.append(", typeAmarrage: ");
		if (typeAmarrageESet) result.append(typeAmarrage); else result.append("<unset>");
		result.append(", typeStockage: ");
		if (typeStockageESet) result.append(typeStockage); else result.append("<unset>");
		result.append(", typeGrueDechargement: ");
		if (typeGrueDechargementESet) result.append(typeGrueDechargement); else result.append("<unset>");
		result.append(", manipulationConteneurs: ");
		if (manipulationConteneursESet) result.append(manipulationConteneurs); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeQuaiMaritimeImpl
