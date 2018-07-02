/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMoyensTriage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Moyens Triage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyensTriageImpl#getVolumeForceMin <em>Volume Force Min</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensTriageImpl#getVolumeForceMax <em>Volume Force Max</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensTriageImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensTriageImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensTriageImpl#getConcerneTypeUniteTypeUnite <em>Concerne Type Unite Type Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensTriageImpl#getConcerneUnTypeEquipementTypeEquipement <em>Concerne Un Type Equipement Type Equipement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensTriageImpl#getAPourUniteTriageUnite <em>APour Unite Triage Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyensTriageImpl extends EObjectImpl implements TypeMoyensTriage {
	/**
	 * The default value of the '{@link #getVolumeForceMin() <em>Volume Force Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeForceMin()
	 * @generated
	 * @ordered
	 */
	protected static final long VOLUME_FORCE_MIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVolumeForceMin() <em>Volume Force Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeForceMin()
	 * @generated
	 * @ordered
	 */
	protected long volumeForceMin = VOLUME_FORCE_MIN_EDEFAULT;

	/**
	 * This is true if the Volume Force Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volumeForceMinESet;

	/**
	 * The default value of the '{@link #getVolumeForceMax() <em>Volume Force Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeForceMax()
	 * @generated
	 * @ordered
	 */
	protected static final long VOLUME_FORCE_MAX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVolumeForceMax() <em>Volume Force Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeForceMax()
	 * @generated
	 * @ordered
	 */
	protected long volumeForceMax = VOLUME_FORCE_MAX_EDEFAULT;

	/**
	 * This is true if the Volume Force Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volumeForceMaxESet;

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
	 * The cached value of the '{@link #getConcerneTypeUniteTypeUnite() <em>Concerne Type Unite Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeUniteTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeUniteTypeUnite;

	/**
	 * The cached value of the '{@link #getConcerneUnTypeEquipementTypeEquipement() <em>Concerne Un Type Equipement Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneUnTypeEquipementTypeEquipement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneUnTypeEquipementTypeEquipement;

	/**
	 * The cached value of the '{@link #getAPourUniteTriageUnite() <em>APour Unite Triage Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteTriageUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteTriageUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyensTriageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyensTriage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVolumeForceMin() {
		return volumeForceMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeForceMin(long newVolumeForceMin) {
		long oldVolumeForceMin = volumeForceMin;
		volumeForceMin = newVolumeForceMin;
		boolean oldVolumeForceMinESet = volumeForceMinESet;
		volumeForceMinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MIN, oldVolumeForceMin, volumeForceMin, !oldVolumeForceMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolumeForceMin() {
		long oldVolumeForceMin = volumeForceMin;
		boolean oldVolumeForceMinESet = volumeForceMinESet;
		volumeForceMin = VOLUME_FORCE_MIN_EDEFAULT;
		volumeForceMinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MIN, oldVolumeForceMin, VOLUME_FORCE_MIN_EDEFAULT, oldVolumeForceMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolumeForceMin() {
		return volumeForceMinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVolumeForceMax() {
		return volumeForceMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeForceMax(long newVolumeForceMax) {
		long oldVolumeForceMax = volumeForceMax;
		volumeForceMax = newVolumeForceMax;
		boolean oldVolumeForceMaxESet = volumeForceMaxESet;
		volumeForceMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MAX, oldVolumeForceMax, volumeForceMax, !oldVolumeForceMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolumeForceMax() {
		long oldVolumeForceMax = volumeForceMax;
		boolean oldVolumeForceMaxESet = volumeForceMaxESet;
		volumeForceMax = VOLUME_FORCE_MAX_EDEFAULT;
		volumeForceMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MAX, oldVolumeForceMax, VOLUME_FORCE_MAX_EDEFAULT, oldVolumeForceMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolumeForceMax() {
		return volumeForceMaxESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeUniteTypeUnite() {
		return concerneTypeUniteTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeUniteTypeUnite(TypeAssociationEXT newConcerneTypeUniteTypeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeUniteTypeUnite = concerneTypeUniteTypeUnite;
		concerneTypeUniteTypeUnite = newConcerneTypeUniteTypeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_TYPE_UNITE_TYPE_UNITE, oldConcerneTypeUniteTypeUnite, newConcerneTypeUniteTypeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeUniteTypeUnite(TypeAssociationEXT newConcerneTypeUniteTypeUnite) {
		if (newConcerneTypeUniteTypeUnite != concerneTypeUniteTypeUnite) {
			NotificationChain msgs = null;
			if (concerneTypeUniteTypeUnite != null)
				msgs = ((InternalEObject)concerneTypeUniteTypeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_TYPE_UNITE_TYPE_UNITE, null, msgs);
			if (newConcerneTypeUniteTypeUnite != null)
				msgs = ((InternalEObject)newConcerneTypeUniteTypeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_TYPE_UNITE_TYPE_UNITE, null, msgs);
			msgs = basicSetConcerneTypeUniteTypeUnite(newConcerneTypeUniteTypeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_TYPE_UNITE_TYPE_UNITE, newConcerneTypeUniteTypeUnite, newConcerneTypeUniteTypeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneUnTypeEquipementTypeEquipement() {
		return concerneUnTypeEquipementTypeEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneUnTypeEquipementTypeEquipement(TypeAssociationEXT newConcerneUnTypeEquipementTypeEquipement, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneUnTypeEquipementTypeEquipement = concerneUnTypeEquipementTypeEquipement;
		concerneUnTypeEquipementTypeEquipement = newConcerneUnTypeEquipementTypeEquipement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_UN_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT, oldConcerneUnTypeEquipementTypeEquipement, newConcerneUnTypeEquipementTypeEquipement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneUnTypeEquipementTypeEquipement(TypeAssociationEXT newConcerneUnTypeEquipementTypeEquipement) {
		if (newConcerneUnTypeEquipementTypeEquipement != concerneUnTypeEquipementTypeEquipement) {
			NotificationChain msgs = null;
			if (concerneUnTypeEquipementTypeEquipement != null)
				msgs = ((InternalEObject)concerneUnTypeEquipementTypeEquipement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_UN_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT, null, msgs);
			if (newConcerneUnTypeEquipementTypeEquipement != null)
				msgs = ((InternalEObject)newConcerneUnTypeEquipementTypeEquipement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_UN_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT, null, msgs);
			msgs = basicSetConcerneUnTypeEquipementTypeEquipement(newConcerneUnTypeEquipementTypeEquipement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_UN_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT, newConcerneUnTypeEquipementTypeEquipement, newConcerneUnTypeEquipementTypeEquipement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteTriageUnite() {
		return aPourUniteTriageUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteTriageUnite(TypeAssociationEXT newAPourUniteTriageUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteTriageUnite = aPourUniteTriageUnite;
		aPourUniteTriageUnite = newAPourUniteTriageUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__APOUR_UNITE_TRIAGE_UNITE, oldAPourUniteTriageUnite, newAPourUniteTriageUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteTriageUnite(TypeAssociationEXT newAPourUniteTriageUnite) {
		if (newAPourUniteTriageUnite != aPourUniteTriageUnite) {
			NotificationChain msgs = null;
			if (aPourUniteTriageUnite != null)
				msgs = ((InternalEObject)aPourUniteTriageUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_TRIAGE__APOUR_UNITE_TRIAGE_UNITE, null, msgs);
			if (newAPourUniteTriageUnite != null)
				msgs = ((InternalEObject)newAPourUniteTriageUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_TRIAGE__APOUR_UNITE_TRIAGE_UNITE, null, msgs);
			msgs = basicSetAPourUniteTriageUnite(newAPourUniteTriageUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_TRIAGE__APOUR_UNITE_TRIAGE_UNITE, newAPourUniteTriageUnite, newAPourUniteTriageUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_TYPE_UNITE_TYPE_UNITE:
				return basicSetConcerneTypeUniteTypeUnite(null, msgs);
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_UN_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				return basicSetConcerneUnTypeEquipementTypeEquipement(null, msgs);
			case SchemaPackage.TYPE_MOYENS_TRIAGE__APOUR_UNITE_TRIAGE_UNITE:
				return basicSetAPourUniteTriageUnite(null, msgs);
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
			case SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MIN:
				return new Long(getVolumeForceMin());
			case SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MAX:
				return new Long(getVolumeForceMax());
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_TYPE_UNITE_TYPE_UNITE:
				return getConcerneTypeUniteTypeUnite();
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_UN_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				return getConcerneUnTypeEquipementTypeEquipement();
			case SchemaPackage.TYPE_MOYENS_TRIAGE__APOUR_UNITE_TRIAGE_UNITE:
				return getAPourUniteTriageUnite();
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
			case SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MIN:
				setVolumeForceMin(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MAX:
				setVolumeForceMax(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_TYPE_UNITE_TYPE_UNITE:
				setConcerneTypeUniteTypeUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_UN_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				setConcerneUnTypeEquipementTypeEquipement((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__APOUR_UNITE_TRIAGE_UNITE:
				setAPourUniteTriageUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MIN:
				unsetVolumeForceMin();
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MAX:
				unsetVolumeForceMax();
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_TYPE_UNITE_TYPE_UNITE:
				setConcerneTypeUniteTypeUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_UN_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				setConcerneUnTypeEquipementTypeEquipement((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__APOUR_UNITE_TRIAGE_UNITE:
				setAPourUniteTriageUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MIN:
				return isSetVolumeForceMin();
			case SchemaPackage.TYPE_MOYENS_TRIAGE__VOLUME_FORCE_MAX:
				return isSetVolumeForceMax();
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_TYPE_UNITE_TYPE_UNITE:
				return concerneTypeUniteTypeUnite != null;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__CONCERNE_UN_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				return concerneUnTypeEquipementTypeEquipement != null;
			case SchemaPackage.TYPE_MOYENS_TRIAGE__APOUR_UNITE_TRIAGE_UNITE:
				return aPourUniteTriageUnite != null;
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
		result.append(" (volumeForceMin: ");
		if (volumeForceMinESet) result.append(volumeForceMin); else result.append("<unset>");
		result.append(", volumeForceMax: ");
		if (volumeForceMaxESet) result.append(volumeForceMax); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyensTriageImpl
