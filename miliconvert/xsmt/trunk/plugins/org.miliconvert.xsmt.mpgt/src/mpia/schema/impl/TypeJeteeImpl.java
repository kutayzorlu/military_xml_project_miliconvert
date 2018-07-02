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
import mpia.schema.TypeJetee;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Jetee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeJeteeImpl#getAmplitudeMaximale <em>Amplitude Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJeteeImpl#getTirantEau <em>Tirant Eau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJeteeImpl#getChargeEnLourdMaximale <em>Charge En Lourd Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJeteeImpl#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJeteeImpl#getNombreMaximumWagons <em>Nombre Maximum Wagons</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJeteeImpl#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJeteeImpl#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeJeteeImpl extends TypeSiteImpl implements TypeJetee {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeJeteeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeJetee();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__AMPLITUDE_MAXIMALE, oldAmplitudeMaximale, newAmplitudeMaximale);
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
				msgs = ((InternalEObject)amplitudeMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__AMPLITUDE_MAXIMALE, null, msgs);
			if (newAmplitudeMaximale != null)
				msgs = ((InternalEObject)newAmplitudeMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__AMPLITUDE_MAXIMALE, null, msgs);
			msgs = basicSetAmplitudeMaximale(newAmplitudeMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__AMPLITUDE_MAXIMALE, newAmplitudeMaximale, newAmplitudeMaximale));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__TIRANT_EAU, oldTirantEau, newTirantEau);
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
				msgs = ((InternalEObject)tirantEau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__TIRANT_EAU, null, msgs);
			if (newTirantEau != null)
				msgs = ((InternalEObject)newTirantEau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__TIRANT_EAU, null, msgs);
			msgs = basicSetTirantEau(newTirantEau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__TIRANT_EAU, newTirantEau, newTirantEau));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__CHARGE_EN_LOURD_MAXIMALE, oldChargeEnLourdMaximale, newChargeEnLourdMaximale);
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
				msgs = ((InternalEObject)chargeEnLourdMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__CHARGE_EN_LOURD_MAXIMALE, null, msgs);
			if (newChargeEnLourdMaximale != null)
				msgs = ((InternalEObject)newChargeEnLourdMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__CHARGE_EN_LOURD_MAXIMALE, null, msgs);
			msgs = basicSetChargeEnLourdMaximale(newChargeEnLourdMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__CHARGE_EN_LOURD_MAXIMALE, newChargeEnLourdMaximale, newChargeEnLourdMaximale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__DESSERTE_RAIL_DISPONIBLE, oldDesserteRailDisponible, desserteRailDisponible, !oldDesserteRailDisponibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_JETEE__DESSERTE_RAIL_DISPONIBLE, oldDesserteRailDisponible, DESSERTE_RAIL_DISPONIBLE_EDEFAULT, oldDesserteRailDisponibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__NOMBRE_MAXIMUM_WAGONS, oldNombreMaximumWagons, nombreMaximumWagons, !oldNombreMaximumWagonsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_JETEE__NOMBRE_MAXIMUM_WAGONS, oldNombreMaximumWagons, NOMBRE_MAXIMUM_WAGONS_EDEFAULT, oldNombreMaximumWagonsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_JOUR, oldChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour);
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
				msgs = ((InternalEObject)chargeExplosiveLimiteJour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			if (newChargeExplosiveLimiteJour != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteJour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			msgs = basicSetChargeExplosiveLimiteJour(newChargeExplosiveLimiteJour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_JOUR, newChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_NUIT, oldChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit);
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
				msgs = ((InternalEObject)chargeExplosiveLimiteNuit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			if (newChargeExplosiveLimiteNuit != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteNuit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			msgs = basicSetChargeExplosiveLimiteNuit(newChargeExplosiveLimiteNuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_NUIT, newChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_JETEE__AMPLITUDE_MAXIMALE:
				return basicSetAmplitudeMaximale(null, msgs);
			case SchemaPackage.TYPE_JETEE__TIRANT_EAU:
				return basicSetTirantEau(null, msgs);
			case SchemaPackage.TYPE_JETEE__CHARGE_EN_LOURD_MAXIMALE:
				return basicSetChargeEnLourdMaximale(null, msgs);
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return basicSetChargeExplosiveLimiteJour(null, msgs);
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return basicSetChargeExplosiveLimiteNuit(null, msgs);
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
			case SchemaPackage.TYPE_JETEE__AMPLITUDE_MAXIMALE:
				return getAmplitudeMaximale();
			case SchemaPackage.TYPE_JETEE__TIRANT_EAU:
				return getTirantEau();
			case SchemaPackage.TYPE_JETEE__CHARGE_EN_LOURD_MAXIMALE:
				return getChargeEnLourdMaximale();
			case SchemaPackage.TYPE_JETEE__DESSERTE_RAIL_DISPONIBLE:
				return isDesserteRailDisponible() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_JETEE__NOMBRE_MAXIMUM_WAGONS:
				return new Long(getNombreMaximumWagons());
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return getChargeExplosiveLimiteJour();
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return getChargeExplosiveLimiteNuit();
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
			case SchemaPackage.TYPE_JETEE__AMPLITUDE_MAXIMALE:
				setAmplitudeMaximale((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_JETEE__TIRANT_EAU:
				setTirantEau((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_JETEE__CHARGE_EN_LOURD_MAXIMALE:
				setChargeEnLourdMaximale((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_JETEE__DESSERTE_RAIL_DISPONIBLE:
				setDesserteRailDisponible(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_JETEE__NOMBRE_MAXIMUM_WAGONS:
				setNombreMaximumWagons(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				setChargeExplosiveLimiteNuit((TypeDataTypeMasse)newValue);
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
			case SchemaPackage.TYPE_JETEE__AMPLITUDE_MAXIMALE:
				setAmplitudeMaximale((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_JETEE__TIRANT_EAU:
				setTirantEau((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_JETEE__CHARGE_EN_LOURD_MAXIMALE:
				setChargeEnLourdMaximale((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_JETEE__DESSERTE_RAIL_DISPONIBLE:
				unsetDesserteRailDisponible();
				return;
			case SchemaPackage.TYPE_JETEE__NOMBRE_MAXIMUM_WAGONS:
				unsetNombreMaximumWagons();
				return;
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				setChargeExplosiveLimiteNuit((TypeDataTypeMasse)null);
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
			case SchemaPackage.TYPE_JETEE__AMPLITUDE_MAXIMALE:
				return amplitudeMaximale != null;
			case SchemaPackage.TYPE_JETEE__TIRANT_EAU:
				return tirantEau != null;
			case SchemaPackage.TYPE_JETEE__CHARGE_EN_LOURD_MAXIMALE:
				return chargeEnLourdMaximale != null;
			case SchemaPackage.TYPE_JETEE__DESSERTE_RAIL_DISPONIBLE:
				return isSetDesserteRailDisponible();
			case SchemaPackage.TYPE_JETEE__NOMBRE_MAXIMUM_WAGONS:
				return isSetNombreMaximumWagons();
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return chargeExplosiveLimiteJour != null;
			case SchemaPackage.TYPE_JETEE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return chargeExplosiveLimiteNuit != null;
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
		result.append(')');
		return result.toString();
	}

} //TypeJeteeImpl
