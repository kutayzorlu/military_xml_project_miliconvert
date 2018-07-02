/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEquipesReparationDomaineReparation;
import mpia.schema.TypeDictionaryDicoEquipesReparationRegimeTravail;
import mpia.schema.TypeDictionaryDicoEquipesReparationSpecialiteReparation;
import mpia.schema.TypeEquipesReparation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Equipes Reparation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEquipesReparationImpl#getDomaineReparation <em>Domaine Reparation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipesReparationImpl#getSpecialiteReparation <em>Specialite Reparation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipesReparationImpl#getEquipesExistantes <em>Equipes Existantes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipesReparationImpl#getEquipesDisponibles <em>Equipes Disponibles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipesReparationImpl#getChargeTravail <em>Charge Travail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipesReparationImpl#getRegimeTravail <em>Regime Travail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipesReparationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipesReparationImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEquipesReparationImpl extends EObjectImpl implements TypeEquipesReparation {
	/**
	 * The default value of the '{@link #getDomaineReparation() <em>Domaine Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaineReparation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEquipesReparationDomaineReparation DOMAINE_REPARATION_EDEFAULT = TypeDictionaryDicoEquipesReparationDomaineReparation.AERO;

	/**
	 * The cached value of the '{@link #getDomaineReparation() <em>Domaine Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaineReparation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEquipesReparationDomaineReparation domaineReparation = DOMAINE_REPARATION_EDEFAULT;

	/**
	 * This is true if the Domaine Reparation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean domaineReparationESet;

	/**
	 * The default value of the '{@link #getSpecialiteReparation() <em>Specialite Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteReparation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEquipesReparationSpecialiteReparation SPECIALITE_REPARATION_EDEFAULT = TypeDictionaryDicoEquipesReparationSpecialiteReparation.CM;

	/**
	 * The cached value of the '{@link #getSpecialiteReparation() <em>Specialite Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteReparation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEquipesReparationSpecialiteReparation specialiteReparation = SPECIALITE_REPARATION_EDEFAULT;

	/**
	 * This is true if the Specialite Reparation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialiteReparationESet;

	/**
	 * The default value of the '{@link #getEquipesExistantes() <em>Equipes Existantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipesExistantes()
	 * @generated
	 * @ordered
	 */
	protected static final long EQUIPES_EXISTANTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEquipesExistantes() <em>Equipes Existantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipesExistantes()
	 * @generated
	 * @ordered
	 */
	protected long equipesExistantes = EQUIPES_EXISTANTES_EDEFAULT;

	/**
	 * This is true if the Equipes Existantes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean equipesExistantesESet;

	/**
	 * The default value of the '{@link #getEquipesDisponibles() <em>Equipes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipesDisponibles()
	 * @generated
	 * @ordered
	 */
	protected static final long EQUIPES_DISPONIBLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEquipesDisponibles() <em>Equipes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipesDisponibles()
	 * @generated
	 * @ordered
	 */
	protected long equipesDisponibles = EQUIPES_DISPONIBLES_EDEFAULT;

	/**
	 * This is true if the Equipes Disponibles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean equipesDisponiblesESet;

	/**
	 * The default value of the '{@link #getChargeTravail() <em>Charge Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeTravail()
	 * @generated
	 * @ordered
	 */
	protected static final double CHARGE_TRAVAIL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getChargeTravail() <em>Charge Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeTravail()
	 * @generated
	 * @ordered
	 */
	protected double chargeTravail = CHARGE_TRAVAIL_EDEFAULT;

	/**
	 * This is true if the Charge Travail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargeTravailESet;

	/**
	 * The default value of the '{@link #getRegimeTravail() <em>Regime Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegimeTravail()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEquipesReparationRegimeTravail REGIME_TRAVAIL_EDEFAULT = TypeDictionaryDicoEquipesReparationRegimeTravail._1;

	/**
	 * The cached value of the '{@link #getRegimeTravail() <em>Regime Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegimeTravail()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEquipesReparationRegimeTravail regimeTravail = REGIME_TRAVAIL_EDEFAULT;

	/**
	 * This is true if the Regime Travail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regimeTravailESet;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEquipesReparationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEquipesReparation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEquipesReparationDomaineReparation getDomaineReparation() {
		return domaineReparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaineReparation(TypeDictionaryDicoEquipesReparationDomaineReparation newDomaineReparation) {
		TypeDictionaryDicoEquipesReparationDomaineReparation oldDomaineReparation = domaineReparation;
		domaineReparation = newDomaineReparation == null ? DOMAINE_REPARATION_EDEFAULT : newDomaineReparation;
		boolean oldDomaineReparationESet = domaineReparationESet;
		domaineReparationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPES_REPARATION__DOMAINE_REPARATION, oldDomaineReparation, domaineReparation, !oldDomaineReparationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDomaineReparation() {
		TypeDictionaryDicoEquipesReparationDomaineReparation oldDomaineReparation = domaineReparation;
		boolean oldDomaineReparationESet = domaineReparationESet;
		domaineReparation = DOMAINE_REPARATION_EDEFAULT;
		domaineReparationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EQUIPES_REPARATION__DOMAINE_REPARATION, oldDomaineReparation, DOMAINE_REPARATION_EDEFAULT, oldDomaineReparationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomaineReparation() {
		return domaineReparationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEquipesReparationSpecialiteReparation getSpecialiteReparation() {
		return specialiteReparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialiteReparation(TypeDictionaryDicoEquipesReparationSpecialiteReparation newSpecialiteReparation) {
		TypeDictionaryDicoEquipesReparationSpecialiteReparation oldSpecialiteReparation = specialiteReparation;
		specialiteReparation = newSpecialiteReparation == null ? SPECIALITE_REPARATION_EDEFAULT : newSpecialiteReparation;
		boolean oldSpecialiteReparationESet = specialiteReparationESet;
		specialiteReparationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPES_REPARATION__SPECIALITE_REPARATION, oldSpecialiteReparation, specialiteReparation, !oldSpecialiteReparationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecialiteReparation() {
		TypeDictionaryDicoEquipesReparationSpecialiteReparation oldSpecialiteReparation = specialiteReparation;
		boolean oldSpecialiteReparationESet = specialiteReparationESet;
		specialiteReparation = SPECIALITE_REPARATION_EDEFAULT;
		specialiteReparationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EQUIPES_REPARATION__SPECIALITE_REPARATION, oldSpecialiteReparation, SPECIALITE_REPARATION_EDEFAULT, oldSpecialiteReparationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecialiteReparation() {
		return specialiteReparationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEquipesExistantes() {
		return equipesExistantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipesExistantes(long newEquipesExistantes) {
		long oldEquipesExistantes = equipesExistantes;
		equipesExistantes = newEquipesExistantes;
		boolean oldEquipesExistantesESet = equipesExistantesESet;
		equipesExistantesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_EXISTANTES, oldEquipesExistantes, equipesExistantes, !oldEquipesExistantesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEquipesExistantes() {
		long oldEquipesExistantes = equipesExistantes;
		boolean oldEquipesExistantesESet = equipesExistantesESet;
		equipesExistantes = EQUIPES_EXISTANTES_EDEFAULT;
		equipesExistantesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_EXISTANTES, oldEquipesExistantes, EQUIPES_EXISTANTES_EDEFAULT, oldEquipesExistantesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEquipesExistantes() {
		return equipesExistantesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEquipesDisponibles() {
		return equipesDisponibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipesDisponibles(long newEquipesDisponibles) {
		long oldEquipesDisponibles = equipesDisponibles;
		equipesDisponibles = newEquipesDisponibles;
		boolean oldEquipesDisponiblesESet = equipesDisponiblesESet;
		equipesDisponiblesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_DISPONIBLES, oldEquipesDisponibles, equipesDisponibles, !oldEquipesDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEquipesDisponibles() {
		long oldEquipesDisponibles = equipesDisponibles;
		boolean oldEquipesDisponiblesESet = equipesDisponiblesESet;
		equipesDisponibles = EQUIPES_DISPONIBLES_EDEFAULT;
		equipesDisponiblesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_DISPONIBLES, oldEquipesDisponibles, EQUIPES_DISPONIBLES_EDEFAULT, oldEquipesDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEquipesDisponibles() {
		return equipesDisponiblesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getChargeTravail() {
		return chargeTravail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeTravail(double newChargeTravail) {
		double oldChargeTravail = chargeTravail;
		chargeTravail = newChargeTravail;
		boolean oldChargeTravailESet = chargeTravailESet;
		chargeTravailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPES_REPARATION__CHARGE_TRAVAIL, oldChargeTravail, chargeTravail, !oldChargeTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChargeTravail() {
		double oldChargeTravail = chargeTravail;
		boolean oldChargeTravailESet = chargeTravailESet;
		chargeTravail = CHARGE_TRAVAIL_EDEFAULT;
		chargeTravailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EQUIPES_REPARATION__CHARGE_TRAVAIL, oldChargeTravail, CHARGE_TRAVAIL_EDEFAULT, oldChargeTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChargeTravail() {
		return chargeTravailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEquipesReparationRegimeTravail getRegimeTravail() {
		return regimeTravail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegimeTravail(TypeDictionaryDicoEquipesReparationRegimeTravail newRegimeTravail) {
		TypeDictionaryDicoEquipesReparationRegimeTravail oldRegimeTravail = regimeTravail;
		regimeTravail = newRegimeTravail == null ? REGIME_TRAVAIL_EDEFAULT : newRegimeTravail;
		boolean oldRegimeTravailESet = regimeTravailESet;
		regimeTravailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPES_REPARATION__REGIME_TRAVAIL, oldRegimeTravail, regimeTravail, !oldRegimeTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegimeTravail() {
		TypeDictionaryDicoEquipesReparationRegimeTravail oldRegimeTravail = regimeTravail;
		boolean oldRegimeTravailESet = regimeTravailESet;
		regimeTravail = REGIME_TRAVAIL_EDEFAULT;
		regimeTravailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EQUIPES_REPARATION__REGIME_TRAVAIL, oldRegimeTravail, REGIME_TRAVAIL_EDEFAULT, oldRegimeTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegimeTravail() {
		return regimeTravailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPES_REPARATION__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPES_REPARATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_EQUIPES_REPARATION__DOMAINE_REPARATION:
				return getDomaineReparation();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__SPECIALITE_REPARATION:
				return getSpecialiteReparation();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_EXISTANTES:
				return new Long(getEquipesExistantes());
			case SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_DISPONIBLES:
				return new Long(getEquipesDisponibles());
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CHARGE_TRAVAIL:
				return new Double(getChargeTravail());
			case SchemaPackage.TYPE_EQUIPES_REPARATION__REGIME_TRAVAIL:
				return getRegimeTravail();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CE:
				return getCE();
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
			case SchemaPackage.TYPE_EQUIPES_REPARATION__DOMAINE_REPARATION:
				setDomaineReparation((TypeDictionaryDicoEquipesReparationDomaineReparation)newValue);
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__SPECIALITE_REPARATION:
				setSpecialiteReparation((TypeDictionaryDicoEquipesReparationSpecialiteReparation)newValue);
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_EXISTANTES:
				setEquipesExistantes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_DISPONIBLES:
				setEquipesDisponibles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CHARGE_TRAVAIL:
				setChargeTravail(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__REGIME_TRAVAIL:
				setRegimeTravail((TypeDictionaryDicoEquipesReparationRegimeTravail)newValue);
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_EQUIPES_REPARATION__DOMAINE_REPARATION:
				unsetDomaineReparation();
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__SPECIALITE_REPARATION:
				unsetSpecialiteReparation();
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_EXISTANTES:
				unsetEquipesExistantes();
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_DISPONIBLES:
				unsetEquipesDisponibles();
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CHARGE_TRAVAIL:
				unsetChargeTravail();
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__REGIME_TRAVAIL:
				unsetRegimeTravail();
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_EQUIPES_REPARATION__DOMAINE_REPARATION:
				return isSetDomaineReparation();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__SPECIALITE_REPARATION:
				return isSetSpecialiteReparation();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_EXISTANTES:
				return isSetEquipesExistantes();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__EQUIPES_DISPONIBLES:
				return isSetEquipesDisponibles();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CHARGE_TRAVAIL:
				return isSetChargeTravail();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__REGIME_TRAVAIL:
				return isSetRegimeTravail();
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EQUIPES_REPARATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (domaineReparation: ");
		if (domaineReparationESet) result.append(domaineReparation); else result.append("<unset>");
		result.append(", specialiteReparation: ");
		if (specialiteReparationESet) result.append(specialiteReparation); else result.append("<unset>");
		result.append(", equipesExistantes: ");
		if (equipesExistantesESet) result.append(equipesExistantes); else result.append("<unset>");
		result.append(", equipesDisponibles: ");
		if (equipesDisponiblesESet) result.append(equipesDisponibles); else result.append("<unset>");
		result.append(", chargeTravail: ");
		if (chargeTravailESet) result.append(chargeTravail); else result.append("<unset>");
		result.append(", regimeTravail: ");
		if (regimeTravailESet) result.append(regimeTravail); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEquipesReparationImpl
