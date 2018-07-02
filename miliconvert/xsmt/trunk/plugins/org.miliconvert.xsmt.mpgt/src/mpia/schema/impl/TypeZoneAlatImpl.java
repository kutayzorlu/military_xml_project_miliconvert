/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeZoneAlat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Alat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneAlatImpl#getSensParcours <em>Sens Parcours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneAlatImpl extends TypeElementControleImpl implements TypeZoneAlat {
	/**
	 * The default value of the '{@link #getSensParcours() <em>Sens Parcours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensParcours()
	 * @generated
	 * @ordered
	 */
	protected static final String SENS_PARCOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensParcours() <em>Sens Parcours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensParcours()
	 * @generated
	 * @ordered
	 */
	protected String sensParcours = SENS_PARCOURS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneAlatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneAlat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSensParcours() {
		return sensParcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensParcours(String newSensParcours) {
		String oldSensParcours = sensParcours;
		sensParcours = newSensParcours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_ALAT__SENS_PARCOURS, oldSensParcours, sensParcours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_ALAT__SENS_PARCOURS:
				return getSensParcours();
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
			case SchemaPackage.TYPE_ZONE_ALAT__SENS_PARCOURS:
				setSensParcours((String)newValue);
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
			case SchemaPackage.TYPE_ZONE_ALAT__SENS_PARCOURS:
				setSensParcours(SENS_PARCOURS_EDEFAULT);
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
			case SchemaPackage.TYPE_ZONE_ALAT__SENS_PARCOURS:
				return SENS_PARCOURS_EDEFAULT == null ? sensParcours != null : !SENS_PARCOURS_EDEFAULT.equals(sensParcours);
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
		result.append(" (sensParcours: ");
		result.append(sensParcours);
		result.append(')');
		return result.toString();
	}

} //TypeZoneAlatImpl
