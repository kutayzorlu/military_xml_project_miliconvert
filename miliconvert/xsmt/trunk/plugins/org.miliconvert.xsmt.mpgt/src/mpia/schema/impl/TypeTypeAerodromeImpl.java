/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeAerodromeUsagePrincipal;
import mpia.schema.TypeTypeAerodrome;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Aerodrome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeAerodromeImpl#getUsagePrincipal <em>Usage Principal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeAerodromeImpl extends TypeTypeSiteImpl implements TypeTypeAerodrome {
	/**
	 * The default value of the '{@link #getUsagePrincipal() <em>Usage Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagePrincipal()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAerodromeUsagePrincipal USAGE_PRINCIPAL_EDEFAULT = TypeDictionaryDicoTypeAerodromeUsagePrincipal.A;

	/**
	 * The cached value of the '{@link #getUsagePrincipal() <em>Usage Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagePrincipal()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAerodromeUsagePrincipal usagePrincipal = USAGE_PRINCIPAL_EDEFAULT;

	/**
	 * This is true if the Usage Principal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usagePrincipalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeAerodromeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeAerodrome();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAerodromeUsagePrincipal getUsagePrincipal() {
		return usagePrincipal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsagePrincipal(TypeDictionaryDicoTypeAerodromeUsagePrincipal newUsagePrincipal) {
		TypeDictionaryDicoTypeAerodromeUsagePrincipal oldUsagePrincipal = usagePrincipal;
		usagePrincipal = newUsagePrincipal == null ? USAGE_PRINCIPAL_EDEFAULT : newUsagePrincipal;
		boolean oldUsagePrincipalESet = usagePrincipalESet;
		usagePrincipalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERODROME__USAGE_PRINCIPAL, oldUsagePrincipal, usagePrincipal, !oldUsagePrincipalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsagePrincipal() {
		TypeDictionaryDicoTypeAerodromeUsagePrincipal oldUsagePrincipal = usagePrincipal;
		boolean oldUsagePrincipalESet = usagePrincipalESet;
		usagePrincipal = USAGE_PRINCIPAL_EDEFAULT;
		usagePrincipalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERODROME__USAGE_PRINCIPAL, oldUsagePrincipal, USAGE_PRINCIPAL_EDEFAULT, oldUsagePrincipalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsagePrincipal() {
		return usagePrincipalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_AERODROME__USAGE_PRINCIPAL:
				return getUsagePrincipal();
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
			case SchemaPackage.TYPE_TYPE_AERODROME__USAGE_PRINCIPAL:
				setUsagePrincipal((TypeDictionaryDicoTypeAerodromeUsagePrincipal)newValue);
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
			case SchemaPackage.TYPE_TYPE_AERODROME__USAGE_PRINCIPAL:
				unsetUsagePrincipal();
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
			case SchemaPackage.TYPE_TYPE_AERODROME__USAGE_PRINCIPAL:
				return isSetUsagePrincipal();
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
		result.append(" (usagePrincipal: ");
		if (usagePrincipalESet) result.append(usagePrincipal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeAerodromeImpl
