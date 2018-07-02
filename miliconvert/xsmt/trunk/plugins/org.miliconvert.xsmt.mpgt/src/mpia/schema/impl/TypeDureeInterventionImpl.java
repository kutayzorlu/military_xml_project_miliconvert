/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDureeIntervention;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Duree Intervention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDureeInterventionImpl#getMomentDeLAction <em>Moment De LAction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDureeInterventionImpl#getDureeMaxNTI1 <em>Duree Max NTI1</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDureeInterventionImpl#getDureeMaxNTI2 <em>Duree Max NTI2</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDureeInterventionImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDureeInterventionImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDureeInterventionImpl extends EObjectImpl implements TypeDureeIntervention {
	/**
	 * The default value of the '{@link #getMomentDeLAction() <em>Moment De LAction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentDeLAction()
	 * @generated
	 * @ordered
	 */
	protected static final String MOMENT_DE_LACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentDeLAction() <em>Moment De LAction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentDeLAction()
	 * @generated
	 * @ordered
	 */
	protected String momentDeLAction = MOMENT_DE_LACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeMaxNTI1() <em>Duree Max NTI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeMaxNTI1()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeMaxNTI1;

	/**
	 * The cached value of the '{@link #getDureeMaxNTI2() <em>Duree Max NTI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeMaxNTI2()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeMaxNTI2;

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
	protected TypeDureeInterventionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDureeIntervention();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMomentDeLAction() {
		return momentDeLAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentDeLAction(String newMomentDeLAction) {
		String oldMomentDeLAction = momentDeLAction;
		momentDeLAction = newMomentDeLAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DUREE_INTERVENTION__MOMENT_DE_LACTION, oldMomentDeLAction, momentDeLAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeMaxNTI1() {
		return dureeMaxNTI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeMaxNTI1(TypeDataTypeDuree newDureeMaxNTI1, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeMaxNTI1 = dureeMaxNTI1;
		dureeMaxNTI1 = newDureeMaxNTI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI1, oldDureeMaxNTI1, newDureeMaxNTI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeMaxNTI1(TypeDataTypeDuree newDureeMaxNTI1) {
		if (newDureeMaxNTI1 != dureeMaxNTI1) {
			NotificationChain msgs = null;
			if (dureeMaxNTI1 != null)
				msgs = ((InternalEObject)dureeMaxNTI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI1, null, msgs);
			if (newDureeMaxNTI1 != null)
				msgs = ((InternalEObject)newDureeMaxNTI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI1, null, msgs);
			msgs = basicSetDureeMaxNTI1(newDureeMaxNTI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI1, newDureeMaxNTI1, newDureeMaxNTI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeMaxNTI2() {
		return dureeMaxNTI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeMaxNTI2(TypeDataTypeDuree newDureeMaxNTI2, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeMaxNTI2 = dureeMaxNTI2;
		dureeMaxNTI2 = newDureeMaxNTI2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI2, oldDureeMaxNTI2, newDureeMaxNTI2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeMaxNTI2(TypeDataTypeDuree newDureeMaxNTI2) {
		if (newDureeMaxNTI2 != dureeMaxNTI2) {
			NotificationChain msgs = null;
			if (dureeMaxNTI2 != null)
				msgs = ((InternalEObject)dureeMaxNTI2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI2, null, msgs);
			if (newDureeMaxNTI2 != null)
				msgs = ((InternalEObject)newDureeMaxNTI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI2, null, msgs);
			msgs = basicSetDureeMaxNTI2(newDureeMaxNTI2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI2, newDureeMaxNTI2, newDureeMaxNTI2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DUREE_INTERVENTION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DUREE_INTERVENTION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI1:
				return basicSetDureeMaxNTI1(null, msgs);
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI2:
				return basicSetDureeMaxNTI2(null, msgs);
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
			case SchemaPackage.TYPE_DUREE_INTERVENTION__MOMENT_DE_LACTION:
				return getMomentDeLAction();
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI1:
				return getDureeMaxNTI1();
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI2:
				return getDureeMaxNTI2();
			case SchemaPackage.TYPE_DUREE_INTERVENTION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DUREE_INTERVENTION__CE:
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
			case SchemaPackage.TYPE_DUREE_INTERVENTION__MOMENT_DE_LACTION:
				setMomentDeLAction((String)newValue);
				return;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI1:
				setDureeMaxNTI1((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI2:
				setDureeMaxNTI2((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__CE:
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
			case SchemaPackage.TYPE_DUREE_INTERVENTION__MOMENT_DE_LACTION:
				setMomentDeLAction(MOMENT_DE_LACTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI1:
				setDureeMaxNTI1((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI2:
				setDureeMaxNTI2((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__CE:
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
			case SchemaPackage.TYPE_DUREE_INTERVENTION__MOMENT_DE_LACTION:
				return MOMENT_DE_LACTION_EDEFAULT == null ? momentDeLAction != null : !MOMENT_DE_LACTION_EDEFAULT.equals(momentDeLAction);
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI1:
				return dureeMaxNTI1 != null;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__DUREE_MAX_NTI2:
				return dureeMaxNTI2 != null;
			case SchemaPackage.TYPE_DUREE_INTERVENTION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DUREE_INTERVENTION__CE:
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
		result.append(" (momentDeLAction: ");
		result.append(momentDeLAction);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDureeInterventionImpl
