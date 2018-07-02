/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePointHaut;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Point Haut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePointHautImpl#getAccessibilite <em>Accessibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointHautImpl#getAmenageabilite <em>Amenageabilite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePointHautImpl extends TypeElementControleImpl implements TypePointHaut {
	/**
	 * The default value of the '{@link #getAccessibilite() <em>Accessibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibilite()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSIBILITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessibilite() <em>Accessibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibilite()
	 * @generated
	 * @ordered
	 */
	protected String accessibilite = ACCESSIBILITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmenageabilite() <em>Amenageabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmenageabilite()
	 * @generated
	 * @ordered
	 */
	protected static final String AMENAGEABILITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmenageabilite() <em>Amenageabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmenageabilite()
	 * @generated
	 * @ordered
	 */
	protected String amenageabilite = AMENAGEABILITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePointHautImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePointHaut();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessibilite() {
		return accessibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessibilite(String newAccessibilite) {
		String oldAccessibilite = accessibilite;
		accessibilite = newAccessibilite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_HAUT__ACCESSIBILITE, oldAccessibilite, accessibilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmenageabilite() {
		return amenageabilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmenageabilite(String newAmenageabilite) {
		String oldAmenageabilite = amenageabilite;
		amenageabilite = newAmenageabilite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_HAUT__AMENAGEABILITE, oldAmenageabilite, amenageabilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_POINT_HAUT__ACCESSIBILITE:
				return getAccessibilite();
			case SchemaPackage.TYPE_POINT_HAUT__AMENAGEABILITE:
				return getAmenageabilite();
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
			case SchemaPackage.TYPE_POINT_HAUT__ACCESSIBILITE:
				setAccessibilite((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_HAUT__AMENAGEABILITE:
				setAmenageabilite((String)newValue);
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
			case SchemaPackage.TYPE_POINT_HAUT__ACCESSIBILITE:
				setAccessibilite(ACCESSIBILITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_HAUT__AMENAGEABILITE:
				setAmenageabilite(AMENAGEABILITE_EDEFAULT);
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
			case SchemaPackage.TYPE_POINT_HAUT__ACCESSIBILITE:
				return ACCESSIBILITE_EDEFAULT == null ? accessibilite != null : !ACCESSIBILITE_EDEFAULT.equals(accessibilite);
			case SchemaPackage.TYPE_POINT_HAUT__AMENAGEABILITE:
				return AMENAGEABILITE_EDEFAULT == null ? amenageabilite != null : !AMENAGEABILITE_EDEFAULT.equals(amenageabilite);
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
		result.append(" (accessibilite: ");
		result.append(accessibilite);
		result.append(", amenageabilite: ");
		result.append(amenageabilite);
		result.append(')');
		return result.toString();
	}

} //TypePointHautImpl
