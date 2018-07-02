/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordination4D;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Coordination4 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCoordination4DImpl#getDomaineRestriction <em>Domaine Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCoordination4DImpl extends EObjectImpl implements TypeCoordination4D {
	/**
	 * The default value of the '{@link #getDomaineRestriction() <em>Domaine Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaineRestriction()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAINE_RESTRICTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomaineRestriction() <em>Domaine Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaineRestriction()
	 * @generated
	 * @ordered
	 */
	protected String domaineRestriction = DOMAINE_RESTRICTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCoordination4DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCoordination4D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomaineRestriction() {
		return domaineRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaineRestriction(String newDomaineRestriction) {
		String oldDomaineRestriction = domaineRestriction;
		domaineRestriction = newDomaineRestriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COORDINATION4_D__DOMAINE_RESTRICTION, oldDomaineRestriction, domaineRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_COORDINATION4_D__DOMAINE_RESTRICTION:
				return getDomaineRestriction();
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
			case SchemaPackage.TYPE_COORDINATION4_D__DOMAINE_RESTRICTION:
				setDomaineRestriction((String)newValue);
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
			case SchemaPackage.TYPE_COORDINATION4_D__DOMAINE_RESTRICTION:
				setDomaineRestriction(DOMAINE_RESTRICTION_EDEFAULT);
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
			case SchemaPackage.TYPE_COORDINATION4_D__DOMAINE_RESTRICTION:
				return DOMAINE_RESTRICTION_EDEFAULT == null ? domaineRestriction != null : !DOMAINE_RESTRICTION_EDEFAULT.equals(domaineRestriction);
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
		result.append(" (domaineRestriction: ");
		result.append(domaineRestriction);
		result.append(')');
		return result.toString();
	}

} //TypeCoordination4DImpl
