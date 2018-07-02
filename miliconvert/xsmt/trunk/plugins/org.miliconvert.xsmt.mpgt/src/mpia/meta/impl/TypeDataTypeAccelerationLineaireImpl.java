/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.impl;

import mpia.meta.MetaPackage;
import mpia.meta.TypeDataTypeAccelerationLineaire;
import mpia.meta.TypeDictionnaryUniteCode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Data Type Acceleration Lineaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.meta.impl.TypeDataTypeAccelerationLineaireImpl#getValue <em>Value</em>}</li>
 *   <li>{@link mpia.meta.impl.TypeDataTypeAccelerationLineaireImpl#getUnite <em>Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDataTypeAccelerationLineaireImpl extends EObjectImpl implements TypeDataTypeAccelerationLineaire {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getUnite() <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionnaryUniteCode UNITE_EDEFAULT = TypeDictionnaryUniteCode.SU;

	/**
	 * The cached value of the '{@link #getUnite() <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionnaryUniteCode unite = UNITE_EDEFAULT;

	/**
	 * This is true if the Unite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDataTypeAccelerationLineaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		double oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionnaryUniteCode getUnite() {
		return unite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnite(TypeDictionnaryUniteCode newUnite) {
		TypeDictionnaryUniteCode oldUnite = unite;
		unite = newUnite == null ? UNITE_EDEFAULT : newUnite;
		boolean oldUniteESet = uniteESet;
		uniteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__UNITE, oldUnite, unite, !oldUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnite() {
		TypeDictionnaryUniteCode oldUnite = unite;
		boolean oldUniteESet = uniteESet;
		unite = UNITE_EDEFAULT;
		uniteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__UNITE, oldUnite, UNITE_EDEFAULT, oldUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnite() {
		return uniteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__VALUE:
				return new Double(getValue());
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__UNITE:
				return getUnite();
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
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__VALUE:
				setValue(((Double)newValue).doubleValue());
				return;
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__UNITE:
				setUnite((TypeDictionnaryUniteCode)newValue);
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
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__VALUE:
				unsetValue();
				return;
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__UNITE:
				unsetUnite();
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
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__VALUE:
				return isSetValue();
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__UNITE:
				return isSetUnite();
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", unite: ");
		if (uniteESet) result.append(unite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeDataTypeAccelerationLineaireImpl
