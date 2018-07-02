/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutreMissionALAT;
import mpia.schema.TypeDictionaryDicoAutreMissionALATAutreTypeMission;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Mission ALAT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreMissionALATImpl#getTypeMission <em>Type Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreMissionALATImpl#getAutreTypeMission <em>Autre Type Mission</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreMissionALATImpl extends TypeMissionImpl implements TypeAutreMissionALAT {
	/**
	 * The default value of the '{@link #getTypeMission() <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMission()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreMissionALATAutreTypeMission TYPE_MISSION_EDEFAULT = TypeDictionaryDicoAutreMissionALATAutreTypeMission.ATT;

	/**
	 * The cached value of the '{@link #getTypeMission() <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMission()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreMissionALATAutreTypeMission typeMission = TYPE_MISSION_EDEFAULT;

	/**
	 * This is true if the Type Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionESet;

	/**
	 * The default value of the '{@link #getAutreTypeMission() <em>Autre Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeMission()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeMission() <em>Autre Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeMission()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeMission = AUTRE_TYPE_MISSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreMissionALATImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreMissionALAT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutreMissionALATAutreTypeMission getTypeMission() {
		return typeMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMission(TypeDictionaryDicoAutreMissionALATAutreTypeMission newTypeMission) {
		TypeDictionaryDicoAutreMissionALATAutreTypeMission oldTypeMission = typeMission;
		typeMission = newTypeMission == null ? TYPE_MISSION_EDEFAULT : newTypeMission;
		boolean oldTypeMissionESet = typeMissionESet;
		typeMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_MISSION_ALAT__TYPE_MISSION, oldTypeMission, typeMission, !oldTypeMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMission() {
		TypeDictionaryDicoAutreMissionALATAutreTypeMission oldTypeMission = typeMission;
		boolean oldTypeMissionESet = typeMissionESet;
		typeMission = TYPE_MISSION_EDEFAULT;
		typeMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_MISSION_ALAT__TYPE_MISSION, oldTypeMission, TYPE_MISSION_EDEFAULT, oldTypeMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMission() {
		return typeMissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeMission() {
		return autreTypeMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeMission(String newAutreTypeMission) {
		String oldAutreTypeMission = autreTypeMission;
		autreTypeMission = newAutreTypeMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_MISSION_ALAT__AUTRE_TYPE_MISSION, oldAutreTypeMission, autreTypeMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_MISSION_ALAT__TYPE_MISSION:
				return getTypeMission();
			case SchemaPackage.TYPE_AUTRE_MISSION_ALAT__AUTRE_TYPE_MISSION:
				return getAutreTypeMission();
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
			case SchemaPackage.TYPE_AUTRE_MISSION_ALAT__TYPE_MISSION:
				setTypeMission((TypeDictionaryDicoAutreMissionALATAutreTypeMission)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_MISSION_ALAT__AUTRE_TYPE_MISSION:
				setAutreTypeMission((String)newValue);
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
			case SchemaPackage.TYPE_AUTRE_MISSION_ALAT__TYPE_MISSION:
				unsetTypeMission();
				return;
			case SchemaPackage.TYPE_AUTRE_MISSION_ALAT__AUTRE_TYPE_MISSION:
				setAutreTypeMission(AUTRE_TYPE_MISSION_EDEFAULT);
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
			case SchemaPackage.TYPE_AUTRE_MISSION_ALAT__TYPE_MISSION:
				return isSetTypeMission();
			case SchemaPackage.TYPE_AUTRE_MISSION_ALAT__AUTRE_TYPE_MISSION:
				return AUTRE_TYPE_MISSION_EDEFAULT == null ? autreTypeMission != null : !AUTRE_TYPE_MISSION_EDEFAULT.equals(autreTypeMission);
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
		result.append(" (typeMission: ");
		if (typeMissionESet) result.append(typeMission); else result.append("<unset>");
		result.append(", autreTypeMission: ");
		result.append(autreTypeMission);
		result.append(')');
		return result.toString();
	}

} //TypeAutreMissionALATImpl
