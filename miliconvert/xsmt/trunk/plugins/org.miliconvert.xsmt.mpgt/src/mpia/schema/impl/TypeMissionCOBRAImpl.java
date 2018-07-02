/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMissionCOBRAConfianceBatterieENI;
import mpia.schema.TypeDictionaryDicoMissionCOBRATypeMissionCOBRA;
import mpia.schema.TypeMissionCOBRA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission COBRA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionCOBRAImpl#getTypeMissionCOBRA <em>Type Mission COBRA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionCOBRAImpl#getConfianceBatterieENI <em>Confiance Batterie ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionCOBRAImpl#isDelegationTir <em>Delegation Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionCOBRAImpl#getDistanceEntreBatteries <em>Distance Entre Batteries</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionCOBRAImpl#getMissionAlerteurs <em>Mission Alerteurs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionCOBRAImpl#getNombreTirsDelegues <em>Nombre Tirs Delegues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionCOBRAImpl#getNombreMinimumTrajectoires <em>Nombre Minimum Trajectoires</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionCOBRAImpl#getCommentaireDelegationTir <em>Commentaire Delegation Tir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionCOBRAImpl extends EObjectImpl implements TypeMissionCOBRA {
	/**
	 * The default value of the '{@link #getTypeMissionCOBRA() <em>Type Mission COBRA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionCOBRA()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionCOBRATypeMissionCOBRA TYPE_MISSION_COBRA_EDEFAULT = TypeDictionaryDicoMissionCOBRATypeMissionCOBRA.LOCENY;

	/**
	 * The cached value of the '{@link #getTypeMissionCOBRA() <em>Type Mission COBRA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionCOBRA()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionCOBRATypeMissionCOBRA typeMissionCOBRA = TYPE_MISSION_COBRA_EDEFAULT;

	/**
	 * This is true if the Type Mission COBRA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionCOBRAESet;

	/**
	 * The default value of the '{@link #getConfianceBatterieENI() <em>Confiance Batterie ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfianceBatterieENI()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionCOBRAConfianceBatterieENI CONFIANCE_BATTERIE_ENI_EDEFAULT = TypeDictionaryDicoMissionCOBRAConfianceBatterieENI.C;

	/**
	 * The cached value of the '{@link #getConfianceBatterieENI() <em>Confiance Batterie ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfianceBatterieENI()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionCOBRAConfianceBatterieENI confianceBatterieENI = CONFIANCE_BATTERIE_ENI_EDEFAULT;

	/**
	 * This is true if the Confiance Batterie ENI attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confianceBatterieENIESet;

	/**
	 * The default value of the '{@link #isDelegationTir() <em>Delegation Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelegationTir()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELEGATION_TIR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelegationTir() <em>Delegation Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelegationTir()
	 * @generated
	 * @ordered
	 */
	protected boolean delegationTir = DELEGATION_TIR_EDEFAULT;

	/**
	 * This is true if the Delegation Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delegationTirESet;

	/**
	 * The cached value of the '{@link #getDistanceEntreBatteries() <em>Distance Entre Batteries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreBatteries()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceEntreBatteries;

	/**
	 * The default value of the '{@link #getMissionAlerteurs() <em>Mission Alerteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionAlerteurs()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSION_ALERTEURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissionAlerteurs() <em>Mission Alerteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionAlerteurs()
	 * @generated
	 * @ordered
	 */
	protected String missionAlerteurs = MISSION_ALERTEURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreTirsDelegues() <em>Nombre Tirs Delegues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsDelegues()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TIRS_DELEGUES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTirsDelegues() <em>Nombre Tirs Delegues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsDelegues()
	 * @generated
	 * @ordered
	 */
	protected long nombreTirsDelegues = NOMBRE_TIRS_DELEGUES_EDEFAULT;

	/**
	 * This is true if the Nombre Tirs Delegues attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTirsDeleguesESet;

	/**
	 * The default value of the '{@link #getNombreMinimumTrajectoires() <em>Nombre Minimum Trajectoires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMinimumTrajectoires()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MINIMUM_TRAJECTOIRES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMinimumTrajectoires() <em>Nombre Minimum Trajectoires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMinimumTrajectoires()
	 * @generated
	 * @ordered
	 */
	protected long nombreMinimumTrajectoires = NOMBRE_MINIMUM_TRAJECTOIRES_EDEFAULT;

	/**
	 * This is true if the Nombre Minimum Trajectoires attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMinimumTrajectoiresESet;

	/**
	 * The default value of the '{@link #getCommentaireDelegationTir() <em>Commentaire Delegation Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireDelegationTir()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_DELEGATION_TIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireDelegationTir() <em>Commentaire Delegation Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireDelegationTir()
	 * @generated
	 * @ordered
	 */
	protected String commentaireDelegationTir = COMMENTAIRE_DELEGATION_TIR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionCOBRAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionCOBRA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionCOBRATypeMissionCOBRA getTypeMissionCOBRA() {
		return typeMissionCOBRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionCOBRA(TypeDictionaryDicoMissionCOBRATypeMissionCOBRA newTypeMissionCOBRA) {
		TypeDictionaryDicoMissionCOBRATypeMissionCOBRA oldTypeMissionCOBRA = typeMissionCOBRA;
		typeMissionCOBRA = newTypeMissionCOBRA == null ? TYPE_MISSION_COBRA_EDEFAULT : newTypeMissionCOBRA;
		boolean oldTypeMissionCOBRAESet = typeMissionCOBRAESet;
		typeMissionCOBRAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_COBRA__TYPE_MISSION_COBRA, oldTypeMissionCOBRA, typeMissionCOBRA, !oldTypeMissionCOBRAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMissionCOBRA() {
		TypeDictionaryDicoMissionCOBRATypeMissionCOBRA oldTypeMissionCOBRA = typeMissionCOBRA;
		boolean oldTypeMissionCOBRAESet = typeMissionCOBRAESet;
		typeMissionCOBRA = TYPE_MISSION_COBRA_EDEFAULT;
		typeMissionCOBRAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_COBRA__TYPE_MISSION_COBRA, oldTypeMissionCOBRA, TYPE_MISSION_COBRA_EDEFAULT, oldTypeMissionCOBRAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMissionCOBRA() {
		return typeMissionCOBRAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionCOBRAConfianceBatterieENI getConfianceBatterieENI() {
		return confianceBatterieENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfianceBatterieENI(TypeDictionaryDicoMissionCOBRAConfianceBatterieENI newConfianceBatterieENI) {
		TypeDictionaryDicoMissionCOBRAConfianceBatterieENI oldConfianceBatterieENI = confianceBatterieENI;
		confianceBatterieENI = newConfianceBatterieENI == null ? CONFIANCE_BATTERIE_ENI_EDEFAULT : newConfianceBatterieENI;
		boolean oldConfianceBatterieENIESet = confianceBatterieENIESet;
		confianceBatterieENIESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_COBRA__CONFIANCE_BATTERIE_ENI, oldConfianceBatterieENI, confianceBatterieENI, !oldConfianceBatterieENIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfianceBatterieENI() {
		TypeDictionaryDicoMissionCOBRAConfianceBatterieENI oldConfianceBatterieENI = confianceBatterieENI;
		boolean oldConfianceBatterieENIESet = confianceBatterieENIESet;
		confianceBatterieENI = CONFIANCE_BATTERIE_ENI_EDEFAULT;
		confianceBatterieENIESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_COBRA__CONFIANCE_BATTERIE_ENI, oldConfianceBatterieENI, CONFIANCE_BATTERIE_ENI_EDEFAULT, oldConfianceBatterieENIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfianceBatterieENI() {
		return confianceBatterieENIESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelegationTir() {
		return delegationTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegationTir(boolean newDelegationTir) {
		boolean oldDelegationTir = delegationTir;
		delegationTir = newDelegationTir;
		boolean oldDelegationTirESet = delegationTirESet;
		delegationTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_COBRA__DELEGATION_TIR, oldDelegationTir, delegationTir, !oldDelegationTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelegationTir() {
		boolean oldDelegationTir = delegationTir;
		boolean oldDelegationTirESet = delegationTirESet;
		delegationTir = DELEGATION_TIR_EDEFAULT;
		delegationTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_COBRA__DELEGATION_TIR, oldDelegationTir, DELEGATION_TIR_EDEFAULT, oldDelegationTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelegationTir() {
		return delegationTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceEntreBatteries() {
		return distanceEntreBatteries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceEntreBatteries(TypeDataTypeLongueur newDistanceEntreBatteries, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceEntreBatteries = distanceEntreBatteries;
		distanceEntreBatteries = newDistanceEntreBatteries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_COBRA__DISTANCE_ENTRE_BATTERIES, oldDistanceEntreBatteries, newDistanceEntreBatteries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceEntreBatteries(TypeDataTypeLongueur newDistanceEntreBatteries) {
		if (newDistanceEntreBatteries != distanceEntreBatteries) {
			NotificationChain msgs = null;
			if (distanceEntreBatteries != null)
				msgs = ((InternalEObject)distanceEntreBatteries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_COBRA__DISTANCE_ENTRE_BATTERIES, null, msgs);
			if (newDistanceEntreBatteries != null)
				msgs = ((InternalEObject)newDistanceEntreBatteries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_COBRA__DISTANCE_ENTRE_BATTERIES, null, msgs);
			msgs = basicSetDistanceEntreBatteries(newDistanceEntreBatteries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_COBRA__DISTANCE_ENTRE_BATTERIES, newDistanceEntreBatteries, newDistanceEntreBatteries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissionAlerteurs() {
		return missionAlerteurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionAlerteurs(String newMissionAlerteurs) {
		String oldMissionAlerteurs = missionAlerteurs;
		missionAlerteurs = newMissionAlerteurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_COBRA__MISSION_ALERTEURS, oldMissionAlerteurs, missionAlerteurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTirsDelegues() {
		return nombreTirsDelegues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTirsDelegues(long newNombreTirsDelegues) {
		long oldNombreTirsDelegues = nombreTirsDelegues;
		nombreTirsDelegues = newNombreTirsDelegues;
		boolean oldNombreTirsDeleguesESet = nombreTirsDeleguesESet;
		nombreTirsDeleguesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_TIRS_DELEGUES, oldNombreTirsDelegues, nombreTirsDelegues, !oldNombreTirsDeleguesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTirsDelegues() {
		long oldNombreTirsDelegues = nombreTirsDelegues;
		boolean oldNombreTirsDeleguesESet = nombreTirsDeleguesESet;
		nombreTirsDelegues = NOMBRE_TIRS_DELEGUES_EDEFAULT;
		nombreTirsDeleguesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_TIRS_DELEGUES, oldNombreTirsDelegues, NOMBRE_TIRS_DELEGUES_EDEFAULT, oldNombreTirsDeleguesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTirsDelegues() {
		return nombreTirsDeleguesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMinimumTrajectoires() {
		return nombreMinimumTrajectoires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMinimumTrajectoires(long newNombreMinimumTrajectoires) {
		long oldNombreMinimumTrajectoires = nombreMinimumTrajectoires;
		nombreMinimumTrajectoires = newNombreMinimumTrajectoires;
		boolean oldNombreMinimumTrajectoiresESet = nombreMinimumTrajectoiresESet;
		nombreMinimumTrajectoiresESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_MINIMUM_TRAJECTOIRES, oldNombreMinimumTrajectoires, nombreMinimumTrajectoires, !oldNombreMinimumTrajectoiresESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMinimumTrajectoires() {
		long oldNombreMinimumTrajectoires = nombreMinimumTrajectoires;
		boolean oldNombreMinimumTrajectoiresESet = nombreMinimumTrajectoiresESet;
		nombreMinimumTrajectoires = NOMBRE_MINIMUM_TRAJECTOIRES_EDEFAULT;
		nombreMinimumTrajectoiresESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_MINIMUM_TRAJECTOIRES, oldNombreMinimumTrajectoires, NOMBRE_MINIMUM_TRAJECTOIRES_EDEFAULT, oldNombreMinimumTrajectoiresESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMinimumTrajectoires() {
		return nombreMinimumTrajectoiresESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireDelegationTir() {
		return commentaireDelegationTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireDelegationTir(String newCommentaireDelegationTir) {
		String oldCommentaireDelegationTir = commentaireDelegationTir;
		commentaireDelegationTir = newCommentaireDelegationTir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_COBRA__COMMENTAIRE_DELEGATION_TIR, oldCommentaireDelegationTir, commentaireDelegationTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_COBRA__DISTANCE_ENTRE_BATTERIES:
				return basicSetDistanceEntreBatteries(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_COBRA__TYPE_MISSION_COBRA:
				return getTypeMissionCOBRA();
			case SchemaPackage.TYPE_MISSION_COBRA__CONFIANCE_BATTERIE_ENI:
				return getConfianceBatterieENI();
			case SchemaPackage.TYPE_MISSION_COBRA__DELEGATION_TIR:
				return isDelegationTir() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MISSION_COBRA__DISTANCE_ENTRE_BATTERIES:
				return getDistanceEntreBatteries();
			case SchemaPackage.TYPE_MISSION_COBRA__MISSION_ALERTEURS:
				return getMissionAlerteurs();
			case SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_TIRS_DELEGUES:
				return new Long(getNombreTirsDelegues());
			case SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_MINIMUM_TRAJECTOIRES:
				return new Long(getNombreMinimumTrajectoires());
			case SchemaPackage.TYPE_MISSION_COBRA__COMMENTAIRE_DELEGATION_TIR:
				return getCommentaireDelegationTir();
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
			case SchemaPackage.TYPE_MISSION_COBRA__TYPE_MISSION_COBRA:
				setTypeMissionCOBRA((TypeDictionaryDicoMissionCOBRATypeMissionCOBRA)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__CONFIANCE_BATTERIE_ENI:
				setConfianceBatterieENI((TypeDictionaryDicoMissionCOBRAConfianceBatterieENI)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__DELEGATION_TIR:
				setDelegationTir(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__DISTANCE_ENTRE_BATTERIES:
				setDistanceEntreBatteries((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__MISSION_ALERTEURS:
				setMissionAlerteurs((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_TIRS_DELEGUES:
				setNombreTirsDelegues(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_MINIMUM_TRAJECTOIRES:
				setNombreMinimumTrajectoires(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__COMMENTAIRE_DELEGATION_TIR:
				setCommentaireDelegationTir((String)newValue);
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
			case SchemaPackage.TYPE_MISSION_COBRA__TYPE_MISSION_COBRA:
				unsetTypeMissionCOBRA();
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__CONFIANCE_BATTERIE_ENI:
				unsetConfianceBatterieENI();
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__DELEGATION_TIR:
				unsetDelegationTir();
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__DISTANCE_ENTRE_BATTERIES:
				setDistanceEntreBatteries((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__MISSION_ALERTEURS:
				setMissionAlerteurs(MISSION_ALERTEURS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_TIRS_DELEGUES:
				unsetNombreTirsDelegues();
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_MINIMUM_TRAJECTOIRES:
				unsetNombreMinimumTrajectoires();
				return;
			case SchemaPackage.TYPE_MISSION_COBRA__COMMENTAIRE_DELEGATION_TIR:
				setCommentaireDelegationTir(COMMENTAIRE_DELEGATION_TIR_EDEFAULT);
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
			case SchemaPackage.TYPE_MISSION_COBRA__TYPE_MISSION_COBRA:
				return isSetTypeMissionCOBRA();
			case SchemaPackage.TYPE_MISSION_COBRA__CONFIANCE_BATTERIE_ENI:
				return isSetConfianceBatterieENI();
			case SchemaPackage.TYPE_MISSION_COBRA__DELEGATION_TIR:
				return isSetDelegationTir();
			case SchemaPackage.TYPE_MISSION_COBRA__DISTANCE_ENTRE_BATTERIES:
				return distanceEntreBatteries != null;
			case SchemaPackage.TYPE_MISSION_COBRA__MISSION_ALERTEURS:
				return MISSION_ALERTEURS_EDEFAULT == null ? missionAlerteurs != null : !MISSION_ALERTEURS_EDEFAULT.equals(missionAlerteurs);
			case SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_TIRS_DELEGUES:
				return isSetNombreTirsDelegues();
			case SchemaPackage.TYPE_MISSION_COBRA__NOMBRE_MINIMUM_TRAJECTOIRES:
				return isSetNombreMinimumTrajectoires();
			case SchemaPackage.TYPE_MISSION_COBRA__COMMENTAIRE_DELEGATION_TIR:
				return COMMENTAIRE_DELEGATION_TIR_EDEFAULT == null ? commentaireDelegationTir != null : !COMMENTAIRE_DELEGATION_TIR_EDEFAULT.equals(commentaireDelegationTir);
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
		result.append(" (typeMissionCOBRA: ");
		if (typeMissionCOBRAESet) result.append(typeMissionCOBRA); else result.append("<unset>");
		result.append(", confianceBatterieENI: ");
		if (confianceBatterieENIESet) result.append(confianceBatterieENI); else result.append("<unset>");
		result.append(", delegationTir: ");
		if (delegationTirESet) result.append(delegationTir); else result.append("<unset>");
		result.append(", missionAlerteurs: ");
		result.append(missionAlerteurs);
		result.append(", nombreTirsDelegues: ");
		if (nombreTirsDeleguesESet) result.append(nombreTirsDelegues); else result.append("<unset>");
		result.append(", nombreMinimumTrajectoires: ");
		if (nombreMinimumTrajectoiresESet) result.append(nombreMinimumTrajectoires); else result.append("<unset>");
		result.append(", commentaireDelegationTir: ");
		result.append(commentaireDelegationTir);
		result.append(')');
		return result.toString();
	}

} //TypeMissionCOBRAImpl
