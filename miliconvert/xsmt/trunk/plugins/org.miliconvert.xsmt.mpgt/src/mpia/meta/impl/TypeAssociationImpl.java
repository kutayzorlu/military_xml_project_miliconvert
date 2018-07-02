/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.impl;

import mpia.meta.MetaPackage;
import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.meta.impl.TypeAssociationImpl#getRefCTE <em>Ref CTE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationImpl extends EObjectImpl implements TypeAssociation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.TYPE_ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_ASSOCIATION__REF_CTE, oldRefCTE, refCTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.TYPE_ASSOCIATION__REF_CTE:
				return getRefCTE();
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
			case MetaPackage.TYPE_ASSOCIATION__REF_CTE:
				setRefCTE((String)newValue);
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
			case MetaPackage.TYPE_ASSOCIATION__REF_CTE:
				setRefCTE(REF_CTE_EDEFAULT);
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
			case MetaPackage.TYPE_ASSOCIATION__REF_CTE:
				return REF_CTE_EDEFAULT == null ? refCTE != null : !REF_CTE_EDEFAULT.equals(refCTE);
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
		result.append(')');
		return result.toString();
	}

} //TypeAssociationImpl
