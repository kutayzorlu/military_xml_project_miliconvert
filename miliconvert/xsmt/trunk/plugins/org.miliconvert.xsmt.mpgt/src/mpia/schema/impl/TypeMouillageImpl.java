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
import mpia.schema.TypeDictionaryDicoDirection;
import mpia.schema.TypeDictionaryDicoMouillageModeAmarrage;
import mpia.schema.TypeDictionaryDicoMouillageNatureFond;
import mpia.schema.TypeMouillage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mouillage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMouillageImpl#getTirantEauAMareeBasse <em>Tirant Eau AMaree Basse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouillageImpl#getTirantEauMaximal <em>Tirant Eau Maximal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouillageImpl#getTonnageMaximal <em>Tonnage Maximal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouillageImpl#getNatureFond <em>Nature Fond</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouillageImpl#getModeAmarrage <em>Mode Amarrage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouillageImpl#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouillageImpl#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouillageImpl#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMouillageImpl extends TypeSiteImpl implements TypeMouillage {
	/**
	 * The cached value of the '{@link #getTirantEauAMareeBasse() <em>Tirant Eau AMaree Basse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTirantEauAMareeBasse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur tirantEauAMareeBasse;

	/**
	 * The cached value of the '{@link #getTirantEauMaximal() <em>Tirant Eau Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTirantEauMaximal()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur tirantEauMaximal;

	/**
	 * The default value of the '{@link #getTonnageMaximal() <em>Tonnage Maximal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonnageMaximal()
	 * @generated
	 * @ordered
	 */
	protected static final long TONNAGE_MAXIMAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTonnageMaximal() <em>Tonnage Maximal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonnageMaximal()
	 * @generated
	 * @ordered
	 */
	protected long tonnageMaximal = TONNAGE_MAXIMAL_EDEFAULT;

	/**
	 * This is true if the Tonnage Maximal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tonnageMaximalESet;

	/**
	 * The default value of the '{@link #getNatureFond() <em>Nature Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureFond()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMouillageNatureFond NATURE_FOND_EDEFAULT = TypeDictionaryDicoMouillageNatureFond.BOULDR;

	/**
	 * The cached value of the '{@link #getNatureFond() <em>Nature Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureFond()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMouillageNatureFond natureFond = NATURE_FOND_EDEFAULT;

	/**
	 * This is true if the Nature Fond attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureFondESet;

	/**
	 * The default value of the '{@link #getModeAmarrage() <em>Mode Amarrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeAmarrage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMouillageModeAmarrage MODE_AMARRAGE_EDEFAULT = TypeDictionaryDicoMouillageModeAmarrage.BUOY;

	/**
	 * The cached value of the '{@link #getModeAmarrage() <em>Mode Amarrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeAmarrage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMouillageModeAmarrage modeAmarrage = MODE_AMARRAGE_EDEFAULT;

	/**
	 * This is true if the Mode Amarrage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeAmarrageESet;

	/**
	 * The default value of the '{@link #getDirectionPredominanteVent() <em>Direction Predominante Vent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionPredominanteVent()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDirection DIRECTION_PREDOMINANTE_VENT_EDEFAULT = TypeDictionaryDicoDirection.N;

	/**
	 * The cached value of the '{@link #getDirectionPredominanteVent() <em>Direction Predominante Vent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionPredominanteVent()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDirection directionPredominanteVent = DIRECTION_PREDOMINANTE_VENT_EDEFAULT;

	/**
	 * This is true if the Direction Predominante Vent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionPredominanteVentESet;

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
	protected TypeMouillageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMouillage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getTirantEauAMareeBasse() {
		return tirantEauAMareeBasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTirantEauAMareeBasse(TypeDataTypeLongueur newTirantEauAMareeBasse, NotificationChain msgs) {
		TypeDataTypeLongueur oldTirantEauAMareeBasse = tirantEauAMareeBasse;
		tirantEauAMareeBasse = newTirantEauAMareeBasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_AMAREE_BASSE, oldTirantEauAMareeBasse, newTirantEauAMareeBasse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTirantEauAMareeBasse(TypeDataTypeLongueur newTirantEauAMareeBasse) {
		if (newTirantEauAMareeBasse != tirantEauAMareeBasse) {
			NotificationChain msgs = null;
			if (tirantEauAMareeBasse != null)
				msgs = ((InternalEObject)tirantEauAMareeBasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_AMAREE_BASSE, null, msgs);
			if (newTirantEauAMareeBasse != null)
				msgs = ((InternalEObject)newTirantEauAMareeBasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_AMAREE_BASSE, null, msgs);
			msgs = basicSetTirantEauAMareeBasse(newTirantEauAMareeBasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_AMAREE_BASSE, newTirantEauAMareeBasse, newTirantEauAMareeBasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getTirantEauMaximal() {
		return tirantEauMaximal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTirantEauMaximal(TypeDataTypeLongueur newTirantEauMaximal, NotificationChain msgs) {
		TypeDataTypeLongueur oldTirantEauMaximal = tirantEauMaximal;
		tirantEauMaximal = newTirantEauMaximal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_MAXIMAL, oldTirantEauMaximal, newTirantEauMaximal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTirantEauMaximal(TypeDataTypeLongueur newTirantEauMaximal) {
		if (newTirantEauMaximal != tirantEauMaximal) {
			NotificationChain msgs = null;
			if (tirantEauMaximal != null)
				msgs = ((InternalEObject)tirantEauMaximal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_MAXIMAL, null, msgs);
			if (newTirantEauMaximal != null)
				msgs = ((InternalEObject)newTirantEauMaximal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_MAXIMAL, null, msgs);
			msgs = basicSetTirantEauMaximal(newTirantEauMaximal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_MAXIMAL, newTirantEauMaximal, newTirantEauMaximal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTonnageMaximal() {
		return tonnageMaximal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTonnageMaximal(long newTonnageMaximal) {
		long oldTonnageMaximal = tonnageMaximal;
		tonnageMaximal = newTonnageMaximal;
		boolean oldTonnageMaximalESet = tonnageMaximalESet;
		tonnageMaximalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__TONNAGE_MAXIMAL, oldTonnageMaximal, tonnageMaximal, !oldTonnageMaximalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTonnageMaximal() {
		long oldTonnageMaximal = tonnageMaximal;
		boolean oldTonnageMaximalESet = tonnageMaximalESet;
		tonnageMaximal = TONNAGE_MAXIMAL_EDEFAULT;
		tonnageMaximalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOUILLAGE__TONNAGE_MAXIMAL, oldTonnageMaximal, TONNAGE_MAXIMAL_EDEFAULT, oldTonnageMaximalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTonnageMaximal() {
		return tonnageMaximalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMouillageNatureFond getNatureFond() {
		return natureFond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureFond(TypeDictionaryDicoMouillageNatureFond newNatureFond) {
		TypeDictionaryDicoMouillageNatureFond oldNatureFond = natureFond;
		natureFond = newNatureFond == null ? NATURE_FOND_EDEFAULT : newNatureFond;
		boolean oldNatureFondESet = natureFondESet;
		natureFondESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__NATURE_FOND, oldNatureFond, natureFond, !oldNatureFondESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureFond() {
		TypeDictionaryDicoMouillageNatureFond oldNatureFond = natureFond;
		boolean oldNatureFondESet = natureFondESet;
		natureFond = NATURE_FOND_EDEFAULT;
		natureFondESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOUILLAGE__NATURE_FOND, oldNatureFond, NATURE_FOND_EDEFAULT, oldNatureFondESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureFond() {
		return natureFondESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMouillageModeAmarrage getModeAmarrage() {
		return modeAmarrage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeAmarrage(TypeDictionaryDicoMouillageModeAmarrage newModeAmarrage) {
		TypeDictionaryDicoMouillageModeAmarrage oldModeAmarrage = modeAmarrage;
		modeAmarrage = newModeAmarrage == null ? MODE_AMARRAGE_EDEFAULT : newModeAmarrage;
		boolean oldModeAmarrageESet = modeAmarrageESet;
		modeAmarrageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__MODE_AMARRAGE, oldModeAmarrage, modeAmarrage, !oldModeAmarrageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeAmarrage() {
		TypeDictionaryDicoMouillageModeAmarrage oldModeAmarrage = modeAmarrage;
		boolean oldModeAmarrageESet = modeAmarrageESet;
		modeAmarrage = MODE_AMARRAGE_EDEFAULT;
		modeAmarrageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOUILLAGE__MODE_AMARRAGE, oldModeAmarrage, MODE_AMARRAGE_EDEFAULT, oldModeAmarrageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeAmarrage() {
		return modeAmarrageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDirection getDirectionPredominanteVent() {
		return directionPredominanteVent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionPredominanteVent(TypeDictionaryDicoDirection newDirectionPredominanteVent) {
		TypeDictionaryDicoDirection oldDirectionPredominanteVent = directionPredominanteVent;
		directionPredominanteVent = newDirectionPredominanteVent == null ? DIRECTION_PREDOMINANTE_VENT_EDEFAULT : newDirectionPredominanteVent;
		boolean oldDirectionPredominanteVentESet = directionPredominanteVentESet;
		directionPredominanteVentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__DIRECTION_PREDOMINANTE_VENT, oldDirectionPredominanteVent, directionPredominanteVent, !oldDirectionPredominanteVentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirectionPredominanteVent() {
		TypeDictionaryDicoDirection oldDirectionPredominanteVent = directionPredominanteVent;
		boolean oldDirectionPredominanteVentESet = directionPredominanteVentESet;
		directionPredominanteVent = DIRECTION_PREDOMINANTE_VENT_EDEFAULT;
		directionPredominanteVentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOUILLAGE__DIRECTION_PREDOMINANTE_VENT, oldDirectionPredominanteVent, DIRECTION_PREDOMINANTE_VENT_EDEFAULT, oldDirectionPredominanteVentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectionPredominanteVent() {
		return directionPredominanteVentESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR, oldChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour);
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
				msgs = ((InternalEObject)chargeExplosiveLimiteJour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			if (newChargeExplosiveLimiteJour != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteJour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			msgs = basicSetChargeExplosiveLimiteJour(newChargeExplosiveLimiteJour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR, newChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT, oldChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit);
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
				msgs = ((InternalEObject)chargeExplosiveLimiteNuit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			if (newChargeExplosiveLimiteNuit != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteNuit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			msgs = basicSetChargeExplosiveLimiteNuit(newChargeExplosiveLimiteNuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT, newChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_AMAREE_BASSE:
				return basicSetTirantEauAMareeBasse(null, msgs);
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_MAXIMAL:
				return basicSetTirantEauMaximal(null, msgs);
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return basicSetChargeExplosiveLimiteJour(null, msgs);
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
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
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_AMAREE_BASSE:
				return getTirantEauAMareeBasse();
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_MAXIMAL:
				return getTirantEauMaximal();
			case SchemaPackage.TYPE_MOUILLAGE__TONNAGE_MAXIMAL:
				return new Long(getTonnageMaximal());
			case SchemaPackage.TYPE_MOUILLAGE__NATURE_FOND:
				return getNatureFond();
			case SchemaPackage.TYPE_MOUILLAGE__MODE_AMARRAGE:
				return getModeAmarrage();
			case SchemaPackage.TYPE_MOUILLAGE__DIRECTION_PREDOMINANTE_VENT:
				return getDirectionPredominanteVent();
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return getChargeExplosiveLimiteJour();
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
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
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_AMAREE_BASSE:
				setTirantEauAMareeBasse((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_MAXIMAL:
				setTirantEauMaximal((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_MOUILLAGE__TONNAGE_MAXIMAL:
				setTonnageMaximal(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOUILLAGE__NATURE_FOND:
				setNatureFond((TypeDictionaryDicoMouillageNatureFond)newValue);
				return;
			case SchemaPackage.TYPE_MOUILLAGE__MODE_AMARRAGE:
				setModeAmarrage((TypeDictionaryDicoMouillageModeAmarrage)newValue);
				return;
			case SchemaPackage.TYPE_MOUILLAGE__DIRECTION_PREDOMINANTE_VENT:
				setDirectionPredominanteVent((TypeDictionaryDicoDirection)newValue);
				return;
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
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
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_AMAREE_BASSE:
				setTirantEauAMareeBasse((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_MAXIMAL:
				setTirantEauMaximal((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_MOUILLAGE__TONNAGE_MAXIMAL:
				unsetTonnageMaximal();
				return;
			case SchemaPackage.TYPE_MOUILLAGE__NATURE_FOND:
				unsetNatureFond();
				return;
			case SchemaPackage.TYPE_MOUILLAGE__MODE_AMARRAGE:
				unsetModeAmarrage();
				return;
			case SchemaPackage.TYPE_MOUILLAGE__DIRECTION_PREDOMINANTE_VENT:
				unsetDirectionPredominanteVent();
				return;
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
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
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_AMAREE_BASSE:
				return tirantEauAMareeBasse != null;
			case SchemaPackage.TYPE_MOUILLAGE__TIRANT_EAU_MAXIMAL:
				return tirantEauMaximal != null;
			case SchemaPackage.TYPE_MOUILLAGE__TONNAGE_MAXIMAL:
				return isSetTonnageMaximal();
			case SchemaPackage.TYPE_MOUILLAGE__NATURE_FOND:
				return isSetNatureFond();
			case SchemaPackage.TYPE_MOUILLAGE__MODE_AMARRAGE:
				return isSetModeAmarrage();
			case SchemaPackage.TYPE_MOUILLAGE__DIRECTION_PREDOMINANTE_VENT:
				return isSetDirectionPredominanteVent();
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return chargeExplosiveLimiteJour != null;
			case SchemaPackage.TYPE_MOUILLAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
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
		result.append(" (tonnageMaximal: ");
		if (tonnageMaximalESet) result.append(tonnageMaximal); else result.append("<unset>");
		result.append(", natureFond: ");
		if (natureFondESet) result.append(natureFond); else result.append("<unset>");
		result.append(", modeAmarrage: ");
		if (modeAmarrageESet) result.append(modeAmarrage); else result.append("<unset>");
		result.append(", directionPredominanteVent: ");
		if (directionPredominanteVentESet) result.append(directionPredominanteVent); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMouillageImpl
