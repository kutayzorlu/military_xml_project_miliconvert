/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.impl;

import mpia.meta.MetaPackage;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association EXT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.meta.impl.TypeAssociationEXTImpl#getRefCTE <em>Ref CTE</em>}</li>
 *   <li>{@link mpia.meta.impl.TypeAssociationEXTImpl#getRefEXT <em>Ref EXT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEXTImpl extends EObjectImpl implements TypeAssociationEXT {
	/**
	 * The default value of the '{@link #getRefCTE() <em>Ref CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefCTE() <em>Ref CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefCTE()
	 * @generated
	 * @ordered
	 */
	protected String refCTE = REF_CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefEXT() <em>Ref EXT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefEXT()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefEXT() <em>Ref EXT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefEXT()
	 * @generated
	 * @ordered
	 */
	protected String refEXT = REF_EXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEXTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.TYPE_ASSOCIATION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefCTE() {
		return refCTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefCTE(String newRefCTE) {
		String oldRefCTE = refCTE;
		refCTE = newRefCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_ASSOCIATION_EXT__REF_CTE, oldRefCTE, refCTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefEXT() {
		return refEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefEXT(String newRefEXT) {
		String oldRefEXT = refEXT;
		refEXT = newRefEXT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_ASSOCIATION_EXT__REF_EXT, oldRefEXT, refEXT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.TYPE_ASSOCIATION_EXT__REF_CTE:
				return getRefCTE();
			case MetaPackage.TYPE_ASSOCIATION_EXT__REF_EXT:
				return getRefEXT();
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
			case MetaPackage.TYPE_ASSOCIATION_EXT__REF_CTE:
				setRefCTE((String)newValue);
				return;
			case MetaPackage.TYPE_ASSOCIATION_EXT__REF_EXT:
				setRefEXT((String)newValue);
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
			case MetaPackage.TYPE_ASSOCIATION_EXT__REF_CTE:
				setRefCTE(REF_CTE_EDEFAULT);
				return;
			case MetaPackage.TYPE_ASSOCIATION_EXT__REF_EXT:
				setRefEXT(REF_EXT_EDEFAULT);
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
			case MetaPackage.TYPE_ASSOCIATION_EXT__REF_CTE:
				return REF_CTE_EDEFAULT == null ? refCTE != null : !REF_CTE_EDEFAULT.equals(refCTE);
			case MetaPackage.TYPE_ASSOCIATION_EXT__REF_EXT:
				return REF_EXT_EDEFAULT == null ? refEXT != null : !REF_EXT_EDEFAULT.equals(refEXT);
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
		result.append(" (refCTE: ");
		result.append(refCTE);
		result.append(", refEXT: ");
		result.append(refEXT);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationEXTImpl
