/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEssieu;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Essieu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEssieuImpl#getNumeroEssieu <em>Numero Essieu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEssieuImpl#getCharge <em>Charge</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEssieuImpl#getEmpattement <em>Empattement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEssieuImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEssieuImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEssieuImpl extends EObjectImpl implements TypeEssieu {
	/**
	 * The default value of the '{@link #getNumeroEssieu() <em>Numero Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEssieu()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_ESSIEU_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroEssieu() <em>Numero Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEssieu()
	 * @generated
	 * @ordered
	 */
	protected long numeroEssieu = NUMERO_ESSIEU_EDEFAULT;

	/**
	 * This is true if the Numero Essieu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroEssieuESet;

	/**
	 * The default value of the '{@link #getCharge() <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge()
	 * @generated
	 * @ordered
	 */
	protected static final long CHARGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCharge() <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge()
	 * @generated
	 * @ordered
	 */
	protected long charge = CHARGE_EDEFAULT;

	/**
	 * This is true if the Charge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargeESet;

	/**
	 * The cached value of the '{@link #getEmpattement() <em>Empattement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpattement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur empattement;

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
	protected TypeEssieuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEssieu();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroEssieu() {
		return numeroEssieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroEssieu(long newNumeroEssieu) {
		long oldNumeroEssieu = numeroEssieu;
		numeroEssieu = newNumeroEssieu;
		boolean oldNumeroEssieuESet = numeroEssieuESet;
		numeroEssieuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ESSIEU__NUMERO_ESSIEU, oldNumeroEssieu, numeroEssieu, !oldNumeroEssieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroEssieu() {
		long oldNumeroEssieu = numeroEssieu;
		boolean oldNumeroEssieuESet = numeroEssieuESet;
		numeroEssieu = NUMERO_ESSIEU_EDEFAULT;
		numeroEssieuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ESSIEU__NUMERO_ESSIEU, oldNumeroEssieu, NUMERO_ESSIEU_EDEFAULT, oldNumeroEssieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroEssieu() {
		return numeroEssieuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCharge() {
		return charge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharge(long newCharge) {
		long oldCharge = charge;
		charge = newCharge;
		boolean oldChargeESet = chargeESet;
		chargeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ESSIEU__CHARGE, oldCharge, charge, !oldChargeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCharge() {
		long oldCharge = charge;
		boolean oldChargeESet = chargeESet;
		charge = CHARGE_EDEFAULT;
		chargeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ESSIEU__CHARGE, oldCharge, CHARGE_EDEFAULT, oldChargeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCharge() {
		return chargeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getEmpattement() {
		return empattement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpattement(TypeDataTypeLongueur newEmpattement, NotificationChain msgs) {
		TypeDataTypeLongueur oldEmpattement = empattement;
		empattement = newEmpattement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ESSIEU__EMPATTEMENT, oldEmpattement, newEmpattement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpattement(TypeDataTypeLongueur newEmpattement) {
		if (newEmpattement != empattement) {
			NotificationChain msgs = null;
			if (empattement != null)
				msgs = ((InternalEObject)empattement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ESSIEU__EMPATTEMENT, null, msgs);
			if (newEmpattement != null)
				msgs = ((InternalEObject)newEmpattement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ESSIEU__EMPATTEMENT, null, msgs);
			msgs = basicSetEmpattement(newEmpattement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ESSIEU__EMPATTEMENT, newEmpattement, newEmpattement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ESSIEU__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ESSIEU__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ESSIEU__EMPATTEMENT:
				return basicSetEmpattement(null, msgs);
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
			case SchemaPackage.TYPE_ESSIEU__NUMERO_ESSIEU:
				return new Long(getNumeroEssieu());
			case SchemaPackage.TYPE_ESSIEU__CHARGE:
				return new Long(getCharge());
			case SchemaPackage.TYPE_ESSIEU__EMPATTEMENT:
				return getEmpattement();
			case SchemaPackage.TYPE_ESSIEU__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ESSIEU__CE:
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
			case SchemaPackage.TYPE_ESSIEU__NUMERO_ESSIEU:
				setNumeroEssieu(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ESSIEU__CHARGE:
				setCharge(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ESSIEU__EMPATTEMENT:
				setEmpattement((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ESSIEU__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ESSIEU__CE:
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
			case SchemaPackage.TYPE_ESSIEU__NUMERO_ESSIEU:
				unsetNumeroEssieu();
				return;
			case SchemaPackage.TYPE_ESSIEU__CHARGE:
				unsetCharge();
				return;
			case SchemaPackage.TYPE_ESSIEU__EMPATTEMENT:
				setEmpattement((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ESSIEU__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ESSIEU__CE:
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
			case SchemaPackage.TYPE_ESSIEU__NUMERO_ESSIEU:
				return isSetNumeroEssieu();
			case SchemaPackage.TYPE_ESSIEU__CHARGE:
				return isSetCharge();
			case SchemaPackage.TYPE_ESSIEU__EMPATTEMENT:
				return empattement != null;
			case SchemaPackage.TYPE_ESSIEU__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ESSIEU__CE:
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
		result.append(" (numeroEssieu: ");
		if (numeroEssieuESet) result.append(numeroEssieu); else result.append("<unset>");
		result.append(", charge: ");
		if (chargeESet) result.append(charge); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEssieuImpl
