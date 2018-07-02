/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEmploiAeronefApprocheDecalee;
import mpia.schema.TypeDictionaryDicoEmploiAeronefCompositionEquipage;
import mpia.schema.TypeDictionaryDicoEmploiAeronefModeDebarquement;
import mpia.schema.TypeDictionaryDicoEmploiAeronefRoleOperationnel;
import mpia.schema.TypeEmploiAeronef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Emploi Aeronef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEmploiAeronefImpl#getApprocheDecalee <em>Approche Decalee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiAeronefImpl#getModeDebarquement <em>Mode Debarquement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiAeronefImpl#isBesoinCompteRenduEnVol <em>Besoin Compte Rendu En Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiAeronefImpl#getDirectionEntree <em>Direction Entree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiAeronefImpl#getDirectionSortie <em>Direction Sortie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiAeronefImpl#getRoleOperationnel <em>Role Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiAeronefImpl#getCompositionEquipage <em>Composition Equipage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEmploiAeronefImpl extends TypeEmploiRessourceActiviteImpl implements TypeEmploiAeronef {
	/**
	 * The default value of the '{@link #getApprocheDecalee() <em>Approche Decalee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprocheDecalee()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiAeronefApprocheDecalee APPROCHE_DECALEE_EDEFAULT = TypeDictionaryDicoEmploiAeronefApprocheDecalee.LEFT;

	/**
	 * The cached value of the '{@link #getApprocheDecalee() <em>Approche Decalee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprocheDecalee()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiAeronefApprocheDecalee approcheDecalee = APPROCHE_DECALEE_EDEFAULT;

	/**
	 * This is true if the Approche Decalee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean approcheDecaleeESet;

	/**
	 * The default value of the '{@link #getModeDebarquement() <em>Mode Debarquement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeDebarquement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiAeronefModeDebarquement MODE_DEBARQUEMENT_EDEFAULT = TypeDictionaryDicoEmploiAeronefModeDebarquement.ABSEIL;

	/**
	 * The cached value of the '{@link #getModeDebarquement() <em>Mode Debarquement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeDebarquement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiAeronefModeDebarquement modeDebarquement = MODE_DEBARQUEMENT_EDEFAULT;

	/**
	 * This is true if the Mode Debarquement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeDebarquementESet;

	/**
	 * The default value of the '{@link #isBesoinCompteRenduEnVol() <em>Besoin Compte Rendu En Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBesoinCompteRenduEnVol()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BESOIN_COMPTE_RENDU_EN_VOL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBesoinCompteRenduEnVol() <em>Besoin Compte Rendu En Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBesoinCompteRenduEnVol()
	 * @generated
	 * @ordered
	 */
	protected boolean besoinCompteRenduEnVol = BESOIN_COMPTE_RENDU_EN_VOL_EDEFAULT;

	/**
	 * This is true if the Besoin Compte Rendu En Vol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean besoinCompteRenduEnVolESet;

	/**
	 * The cached value of the '{@link #getDirectionEntree() <em>Direction Entree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionEntree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle directionEntree;

	/**
	 * The cached value of the '{@link #getDirectionSortie() <em>Direction Sortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionSortie()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle directionSortie;

	/**
	 * The default value of the '{@link #getRoleOperationnel() <em>Role Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleOperationnel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiAeronefRoleOperationnel ROLE_OPERATIONNEL_EDEFAULT = TypeDictionaryDicoEmploiAeronefRoleOperationnel.DEF;

	/**
	 * The cached value of the '{@link #getRoleOperationnel() <em>Role Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleOperationnel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiAeronefRoleOperationnel roleOperationnel = ROLE_OPERATIONNEL_EDEFAULT;

	/**
	 * This is true if the Role Operationnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roleOperationnelESet;

	/**
	 * The default value of the '{@link #getCompositionEquipage() <em>Composition Equipage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionEquipage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiAeronefCompositionEquipage COMPOSITION_EQUIPAGE_EDEFAULT = TypeDictionaryDicoEmploiAeronefCompositionEquipage.AUGMNT;

	/**
	 * The cached value of the '{@link #getCompositionEquipage() <em>Composition Equipage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionEquipage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiAeronefCompositionEquipage compositionEquipage = COMPOSITION_EQUIPAGE_EDEFAULT;

	/**
	 * This is true if the Composition Equipage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compositionEquipageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEmploiAeronefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEmploiAeronef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiAeronefApprocheDecalee getApprocheDecalee() {
		return approcheDecalee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprocheDecalee(TypeDictionaryDicoEmploiAeronefApprocheDecalee newApprocheDecalee) {
		TypeDictionaryDicoEmploiAeronefApprocheDecalee oldApprocheDecalee = approcheDecalee;
		approcheDecalee = newApprocheDecalee == null ? APPROCHE_DECALEE_EDEFAULT : newApprocheDecalee;
		boolean oldApprocheDecaleeESet = approcheDecaleeESet;
		approcheDecaleeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_AERONEF__APPROCHE_DECALEE, oldApprocheDecalee, approcheDecalee, !oldApprocheDecaleeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprocheDecalee() {
		TypeDictionaryDicoEmploiAeronefApprocheDecalee oldApprocheDecalee = approcheDecalee;
		boolean oldApprocheDecaleeESet = approcheDecaleeESet;
		approcheDecalee = APPROCHE_DECALEE_EDEFAULT;
		approcheDecaleeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_AERONEF__APPROCHE_DECALEE, oldApprocheDecalee, APPROCHE_DECALEE_EDEFAULT, oldApprocheDecaleeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprocheDecalee() {
		return approcheDecaleeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiAeronefModeDebarquement getModeDebarquement() {
		return modeDebarquement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeDebarquement(TypeDictionaryDicoEmploiAeronefModeDebarquement newModeDebarquement) {
		TypeDictionaryDicoEmploiAeronefModeDebarquement oldModeDebarquement = modeDebarquement;
		modeDebarquement = newModeDebarquement == null ? MODE_DEBARQUEMENT_EDEFAULT : newModeDebarquement;
		boolean oldModeDebarquementESet = modeDebarquementESet;
		modeDebarquementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_AERONEF__MODE_DEBARQUEMENT, oldModeDebarquement, modeDebarquement, !oldModeDebarquementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeDebarquement() {
		TypeDictionaryDicoEmploiAeronefModeDebarquement oldModeDebarquement = modeDebarquement;
		boolean oldModeDebarquementESet = modeDebarquementESet;
		modeDebarquement = MODE_DEBARQUEMENT_EDEFAULT;
		modeDebarquementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_AERONEF__MODE_DEBARQUEMENT, oldModeDebarquement, MODE_DEBARQUEMENT_EDEFAULT, oldModeDebarquementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeDebarquement() {
		return modeDebarquementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBesoinCompteRenduEnVol() {
		return besoinCompteRenduEnVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBesoinCompteRenduEnVol(boolean newBesoinCompteRenduEnVol) {
		boolean oldBesoinCompteRenduEnVol = besoinCompteRenduEnVol;
		besoinCompteRenduEnVol = newBesoinCompteRenduEnVol;
		boolean oldBesoinCompteRenduEnVolESet = besoinCompteRenduEnVolESet;
		besoinCompteRenduEnVolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_AERONEF__BESOIN_COMPTE_RENDU_EN_VOL, oldBesoinCompteRenduEnVol, besoinCompteRenduEnVol, !oldBesoinCompteRenduEnVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBesoinCompteRenduEnVol() {
		boolean oldBesoinCompteRenduEnVol = besoinCompteRenduEnVol;
		boolean oldBesoinCompteRenduEnVolESet = besoinCompteRenduEnVolESet;
		besoinCompteRenduEnVol = BESOIN_COMPTE_RENDU_EN_VOL_EDEFAULT;
		besoinCompteRenduEnVolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_AERONEF__BESOIN_COMPTE_RENDU_EN_VOL, oldBesoinCompteRenduEnVol, BESOIN_COMPTE_RENDU_EN_VOL_EDEFAULT, oldBesoinCompteRenduEnVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBesoinCompteRenduEnVol() {
		return besoinCompteRenduEnVolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDirectionEntree() {
		return directionEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionEntree(TypeDataTypeAngle newDirectionEntree, NotificationChain msgs) {
		TypeDataTypeAngle oldDirectionEntree = directionEntree;
		directionEntree = newDirectionEntree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_ENTREE, oldDirectionEntree, newDirectionEntree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionEntree(TypeDataTypeAngle newDirectionEntree) {
		if (newDirectionEntree != directionEntree) {
			NotificationChain msgs = null;
			if (directionEntree != null)
				msgs = ((InternalEObject)directionEntree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_ENTREE, null, msgs);
			if (newDirectionEntree != null)
				msgs = ((InternalEObject)newDirectionEntree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_ENTREE, null, msgs);
			msgs = basicSetDirectionEntree(newDirectionEntree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_ENTREE, newDirectionEntree, newDirectionEntree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDirectionSortie() {
		return directionSortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionSortie(TypeDataTypeAngle newDirectionSortie, NotificationChain msgs) {
		TypeDataTypeAngle oldDirectionSortie = directionSortie;
		directionSortie = newDirectionSortie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_SORTIE, oldDirectionSortie, newDirectionSortie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionSortie(TypeDataTypeAngle newDirectionSortie) {
		if (newDirectionSortie != directionSortie) {
			NotificationChain msgs = null;
			if (directionSortie != null)
				msgs = ((InternalEObject)directionSortie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_SORTIE, null, msgs);
			if (newDirectionSortie != null)
				msgs = ((InternalEObject)newDirectionSortie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_SORTIE, null, msgs);
			msgs = basicSetDirectionSortie(newDirectionSortie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_SORTIE, newDirectionSortie, newDirectionSortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiAeronefRoleOperationnel getRoleOperationnel() {
		return roleOperationnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleOperationnel(TypeDictionaryDicoEmploiAeronefRoleOperationnel newRoleOperationnel) {
		TypeDictionaryDicoEmploiAeronefRoleOperationnel oldRoleOperationnel = roleOperationnel;
		roleOperationnel = newRoleOperationnel == null ? ROLE_OPERATIONNEL_EDEFAULT : newRoleOperationnel;
		boolean oldRoleOperationnelESet = roleOperationnelESet;
		roleOperationnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_AERONEF__ROLE_OPERATIONNEL, oldRoleOperationnel, roleOperationnel, !oldRoleOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRoleOperationnel() {
		TypeDictionaryDicoEmploiAeronefRoleOperationnel oldRoleOperationnel = roleOperationnel;
		boolean oldRoleOperationnelESet = roleOperationnelESet;
		roleOperationnel = ROLE_OPERATIONNEL_EDEFAULT;
		roleOperationnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_AERONEF__ROLE_OPERATIONNEL, oldRoleOperationnel, ROLE_OPERATIONNEL_EDEFAULT, oldRoleOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoleOperationnel() {
		return roleOperationnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiAeronefCompositionEquipage getCompositionEquipage() {
		return compositionEquipage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionEquipage(TypeDictionaryDicoEmploiAeronefCompositionEquipage newCompositionEquipage) {
		TypeDictionaryDicoEmploiAeronefCompositionEquipage oldCompositionEquipage = compositionEquipage;
		compositionEquipage = newCompositionEquipage == null ? COMPOSITION_EQUIPAGE_EDEFAULT : newCompositionEquipage;
		boolean oldCompositionEquipageESet = compositionEquipageESet;
		compositionEquipageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_AERONEF__COMPOSITION_EQUIPAGE, oldCompositionEquipage, compositionEquipage, !oldCompositionEquipageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompositionEquipage() {
		TypeDictionaryDicoEmploiAeronefCompositionEquipage oldCompositionEquipage = compositionEquipage;
		boolean oldCompositionEquipageESet = compositionEquipageESet;
		compositionEquipage = COMPOSITION_EQUIPAGE_EDEFAULT;
		compositionEquipageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_AERONEF__COMPOSITION_EQUIPAGE, oldCompositionEquipage, COMPOSITION_EQUIPAGE_EDEFAULT, oldCompositionEquipageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompositionEquipage() {
		return compositionEquipageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_ENTREE:
				return basicSetDirectionEntree(null, msgs);
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_SORTIE:
				return basicSetDirectionSortie(null, msgs);
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
			case SchemaPackage.TYPE_EMPLOI_AERONEF__APPROCHE_DECALEE:
				return getApprocheDecalee();
			case SchemaPackage.TYPE_EMPLOI_AERONEF__MODE_DEBARQUEMENT:
				return getModeDebarquement();
			case SchemaPackage.TYPE_EMPLOI_AERONEF__BESOIN_COMPTE_RENDU_EN_VOL:
				return isBesoinCompteRenduEnVol() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_ENTREE:
				return getDirectionEntree();
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_SORTIE:
				return getDirectionSortie();
			case SchemaPackage.TYPE_EMPLOI_AERONEF__ROLE_OPERATIONNEL:
				return getRoleOperationnel();
			case SchemaPackage.TYPE_EMPLOI_AERONEF__COMPOSITION_EQUIPAGE:
				return getCompositionEquipage();
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
			case SchemaPackage.TYPE_EMPLOI_AERONEF__APPROCHE_DECALEE:
				setApprocheDecalee((TypeDictionaryDicoEmploiAeronefApprocheDecalee)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__MODE_DEBARQUEMENT:
				setModeDebarquement((TypeDictionaryDicoEmploiAeronefModeDebarquement)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__BESOIN_COMPTE_RENDU_EN_VOL:
				setBesoinCompteRenduEnVol(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_ENTREE:
				setDirectionEntree((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_SORTIE:
				setDirectionSortie((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__ROLE_OPERATIONNEL:
				setRoleOperationnel((TypeDictionaryDicoEmploiAeronefRoleOperationnel)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__COMPOSITION_EQUIPAGE:
				setCompositionEquipage((TypeDictionaryDicoEmploiAeronefCompositionEquipage)newValue);
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
			case SchemaPackage.TYPE_EMPLOI_AERONEF__APPROCHE_DECALEE:
				unsetApprocheDecalee();
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__MODE_DEBARQUEMENT:
				unsetModeDebarquement();
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__BESOIN_COMPTE_RENDU_EN_VOL:
				unsetBesoinCompteRenduEnVol();
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_ENTREE:
				setDirectionEntree((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_SORTIE:
				setDirectionSortie((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__ROLE_OPERATIONNEL:
				unsetRoleOperationnel();
				return;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__COMPOSITION_EQUIPAGE:
				unsetCompositionEquipage();
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
			case SchemaPackage.TYPE_EMPLOI_AERONEF__APPROCHE_DECALEE:
				return isSetApprocheDecalee();
			case SchemaPackage.TYPE_EMPLOI_AERONEF__MODE_DEBARQUEMENT:
				return isSetModeDebarquement();
			case SchemaPackage.TYPE_EMPLOI_AERONEF__BESOIN_COMPTE_RENDU_EN_VOL:
				return isSetBesoinCompteRenduEnVol();
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_ENTREE:
				return directionEntree != null;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__DIRECTION_SORTIE:
				return directionSortie != null;
			case SchemaPackage.TYPE_EMPLOI_AERONEF__ROLE_OPERATIONNEL:
				return isSetRoleOperationnel();
			case SchemaPackage.TYPE_EMPLOI_AERONEF__COMPOSITION_EQUIPAGE:
				return isSetCompositionEquipage();
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
		result.append(" (approcheDecalee: ");
		if (approcheDecaleeESet) result.append(approcheDecalee); else result.append("<unset>");
		result.append(", modeDebarquement: ");
		if (modeDebarquementESet) result.append(modeDebarquement); else result.append("<unset>");
		result.append(", besoinCompteRenduEnVol: ");
		if (besoinCompteRenduEnVolESet) result.append(besoinCompteRenduEnVol); else result.append("<unset>");
		result.append(", roleOperationnel: ");
		if (roleOperationnelESet) result.append(roleOperationnel); else result.append("<unset>");
		result.append(", compositionEquipage: ");
		if (compositionEquipageESet) result.append(compositionEquipage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEmploiAeronefImpl
