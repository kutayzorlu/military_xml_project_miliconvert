/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.impl;

import java.math.BigDecimal;

import mpia.meta.MetaPackage;
import mpia.meta.TypeDataTypeLongitude;
import mpia.meta.TypeDictionnaryUniteCode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Data Type Longitude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.meta.impl.TypeDataTypeLongitudeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link mpia.meta.impl.TypeDataTypeLongitudeImpl#getUnite <em>Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDataTypeLongitudeImpl extends EObjectImpl implements TypeDataTypeLongitude {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnite() <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionnaryUniteCode UNITE_EDEFAULT = TypeDictionnaryUniteCode.D;

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
	protected TypeDataTypeLongitudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.TYPE_DATA_TYPE_LONGITUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BigDecimal newValue) {
		BigDecimal oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_DATA_TYPE_LONGITUDE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_DATA_TYPE_LONGITUDE__UNITE, oldUnite, unite, !oldUniteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetaPackage.TYPE_DATA_TYPE_LONGITUDE__UNITE, oldUnite, UNITE_EDEFAULT, oldUniteESet));
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
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE__VALUE:
				return getValue();
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE__UNITE:
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
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE__VALUE:
				setValue((BigDecimal)newValue);
				return;
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE__UNITE:
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
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE__UNITE:
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
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE__UNITE:
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
		result.append(value);
		result.append(", unite: ");
		if (uniteESet) result.append(unite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeDataTypeLongitudeImpl
