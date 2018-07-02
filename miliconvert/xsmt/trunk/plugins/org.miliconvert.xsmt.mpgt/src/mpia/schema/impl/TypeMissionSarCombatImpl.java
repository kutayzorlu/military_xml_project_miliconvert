/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMissionSarCombat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission Sar Combat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionSarCombatImpl#getAttitudeEnFinDAction <em>Attitude En Fin DAction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionSarCombatImpl extends TypeMissionImpl implements TypeMissionSarCombat {
	/**
	 * The default value of the '{@link #getAttitudeEnFinDAction() <em>Attitude En Fin DAction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeEnFinDAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTITUDE_EN_FIN_DACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttitudeEnFinDAction() <em>Attitude En Fin DAction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeEnFinDAction()
	 * @generated
	 * @ordered
	 */
	protected String attitudeEnFinDAction = ATTITUDE_EN_FIN_DACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionSarCombatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionSarCombat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttitudeEnFinDAction() {
		return attitudeEnFinDAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitudeEnFinDAction(String newAttitudeEnFinDAction) {
		String oldAttitudeEnFinDAction = attitudeEnFinDAction;
		attitudeEnFinDAction = newAttitudeEnFinDAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_SAR_COMBAT__ATTITUDE_EN_FIN_DACTION, oldAttitudeEnFinDAction, attitudeEnFinDAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_SAR_COMBAT__ATTITUDE_EN_FIN_DACTION:
				return getAttitudeEnFinDAction();
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
			case SchemaPackage.TYPE_MISSION_SAR_COMBAT__ATTITUDE_EN_FIN_DACTION:
				setAttitudeEnFinDAction((String)newValue);
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
			case SchemaPackage.TYPE_MISSION_SAR_COMBAT__ATTITUDE_EN_FIN_DACTION:
				setAttitudeEnFinDAction(ATTITUDE_EN_FIN_DACTION_EDEFAULT);
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
			case SchemaPackage.TYPE_MISSION_SAR_COMBAT__ATTITUDE_EN_FIN_DACTION:
				return ATTITUDE_EN_FIN_DACTION_EDEFAULT == null ? attitudeEnFinDAction != null : !ATTITUDE_EN_FIN_DACTION_EDEFAULT.equals(attitudeEnFinDAction);
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
		result.append(" (attitudeEnFinDAction: ");
		result.append(attitudeEnFinDAction);
		result.append(')');
		return result.toString();
	}

} //TypeMissionSarCombatImpl
