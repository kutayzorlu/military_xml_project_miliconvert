/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeZoneAerienne;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Aerienne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneAerienneImpl#getCodeZoneAStatutParticulier <em>Code Zone AStatut Particulier</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneAerienneImpl#getCodeZone <em>Code Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneAerienneImpl extends TypeElementControleImpl implements TypeZoneAerienne {
	/**
	 * The default value of the '{@link #getCodeZoneAStatutParticulier() <em>Code Zone AStatut Particulier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeZoneAStatutParticulier()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_ZONE_ASTATUT_PARTICULIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeZoneAStatutParticulier() <em>Code Zone AStatut Particulier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeZoneAStatutParticulier()
	 * @generated
	 * @ordered
	 */
	protected String codeZoneAStatutParticulier = CODE_ZONE_ASTATUT_PARTICULIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeZone() <em>Code Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeZone()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeZone() <em>Code Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeZone()
	 * @generated
	 * @ordered
	 */
	protected String codeZone = CODE_ZONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneAerienneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneAerienne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeZoneAStatutParticulier() {
		return codeZoneAStatutParticulier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeZoneAStatutParticulier(String newCodeZoneAStatutParticulier) {
		String oldCodeZoneAStatutParticulier = codeZoneAStatutParticulier;
		codeZoneAStatutParticulier = newCodeZoneAStatutParticulier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE_ASTATUT_PARTICULIER, oldCodeZoneAStatutParticulier, codeZoneAStatutParticulier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeZone() {
		return codeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeZone(String newCodeZone) {
		String oldCodeZone = codeZone;
		codeZone = newCodeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE, oldCodeZone, codeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE_ASTATUT_PARTICULIER:
				return getCodeZoneAStatutParticulier();
			case SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE:
				return getCodeZone();
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
			case SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE_ASTATUT_PARTICULIER:
				setCodeZoneAStatutParticulier((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE:
				setCodeZone((String)newValue);
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
			case SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE_ASTATUT_PARTICULIER:
				setCodeZoneAStatutParticulier(CODE_ZONE_ASTATUT_PARTICULIER_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE:
				setCodeZone(CODE_ZONE_EDEFAULT);
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
			case SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE_ASTATUT_PARTICULIER:
				return CODE_ZONE_ASTATUT_PARTICULIER_EDEFAULT == null ? codeZoneAStatutParticulier != null : !CODE_ZONE_ASTATUT_PARTICULIER_EDEFAULT.equals(codeZoneAStatutParticulier);
			case SchemaPackage.TYPE_ZONE_AERIENNE__CODE_ZONE:
				return CODE_ZONE_EDEFAULT == null ? codeZone != null : !CODE_ZONE_EDEFAULT.equals(codeZone);
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
		result.append(" (codeZoneAStatutParticulier: ");
		result.append(codeZoneAStatutParticulier);
		result.append(", codeZone: ");
		result.append(codeZone);
		result.append(')');
		return result.toString();
	}

} //TypeZoneAerienneImpl
