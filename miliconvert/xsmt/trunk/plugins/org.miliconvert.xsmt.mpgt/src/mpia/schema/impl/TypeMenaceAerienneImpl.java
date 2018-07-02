/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAngle;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoAltitude;
import mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVitesseRaid;
import mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVolumeRaid;
import mpia.schema.TypeMenaceAerienne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Menace Aerienne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMenaceAerienneImpl#getDirectionDeplacement <em>Direction Deplacement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceAerienneImpl#getAltitudeMenace <em>Altitude Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceAerienneImpl#getVitesseMenace <em>Vitesse Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceAerienneImpl#getVolumeMenace <em>Volume Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceAerienneImpl#getACommeTypeAeronefTypeAeronef <em>AComme Type Aeronef Type Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMenaceAerienneImpl extends TypeMenaceImpl implements TypeMenaceAerienne {
	/**
	 * The cached value of the '{@link #getDirectionDeplacement() <em>Direction Deplacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionDeplacement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle directionDeplacement;

	/**
	 * The default value of the '{@link #getAltitudeMenace() <em>Altitude Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMenace()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAltitude ALTITUDE_MENACE_EDEFAULT = TypeDictionaryDicoAltitude.VL;

	/**
	 * The cached value of the '{@link #getAltitudeMenace() <em>Altitude Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMenace()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAltitude altitudeMenace = ALTITUDE_MENACE_EDEFAULT;

	/**
	 * This is true if the Altitude Menace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altitudeMenaceESet;

	/**
	 * The default value of the '{@link #getVitesseMenace() <em>Vitesse Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMenace()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRaidAerienEnnemiVitesseRaid VITESSE_MENACE_EDEFAULT = TypeDictionaryDicoRaidAerienEnnemiVitesseRaid.SLOW;

	/**
	 * The cached value of the '{@link #getVitesseMenace() <em>Vitesse Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMenace()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRaidAerienEnnemiVitesseRaid vitesseMenace = VITESSE_MENACE_EDEFAULT;

	/**
	 * This is true if the Vitesse Menace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseMenaceESet;

	/**
	 * The default value of the '{@link #getVolumeMenace() <em>Volume Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeMenace()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRaidAerienEnnemiVolumeRaid VOLUME_MENACE_EDEFAULT = TypeDictionaryDicoRaidAerienEnnemiVolumeRaid.ONE;

	/**
	 * The cached value of the '{@link #getVolumeMenace() <em>Volume Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeMenace()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRaidAerienEnnemiVolumeRaid volumeMenace = VOLUME_MENACE_EDEFAULT;

	/**
	 * This is true if the Volume Menace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volumeMenaceESet;

	/**
	 * The cached value of the '{@link #getACommeTypeAeronefTypeAeronef() <em>AComme Type Aeronef Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTypeAeronefTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeTypeAeronefTypeAeronef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMenaceAerienneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMenaceAerienne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDirectionDeplacement() {
		return directionDeplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionDeplacement(TypeDataTypeAngle newDirectionDeplacement, NotificationChain msgs) {
		TypeDataTypeAngle oldDirectionDeplacement = directionDeplacement;
		directionDeplacement = newDirectionDeplacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_AERIENNE__DIRECTION_DEPLACEMENT, oldDirectionDeplacement, newDirectionDeplacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionDeplacement(TypeDataTypeAngle newDirectionDeplacement) {
		if (newDirectionDeplacement != directionDeplacement) {
			NotificationChain msgs = null;
			if (directionDeplacement != null)
				msgs = ((InternalEObject)directionDeplacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_AERIENNE__DIRECTION_DEPLACEMENT, null, msgs);
			if (newDirectionDeplacement != null)
				msgs = ((InternalEObject)newDirectionDeplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_AERIENNE__DIRECTION_DEPLACEMENT, null, msgs);
			msgs = basicSetDirectionDeplacement(newDirectionDeplacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_AERIENNE__DIRECTION_DEPLACEMENT, newDirectionDeplacement, newDirectionDeplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAltitude getAltitudeMenace() {
		return altitudeMenace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeMenace(TypeDictionaryDicoAltitude newAltitudeMenace) {
		TypeDictionaryDicoAltitude oldAltitudeMenace = altitudeMenace;
		altitudeMenace = newAltitudeMenace == null ? ALTITUDE_MENACE_EDEFAULT : newAltitudeMenace;
		boolean oldAltitudeMenaceESet = altitudeMenaceESet;
		altitudeMenaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_AERIENNE__ALTITUDE_MENACE, oldAltitudeMenace, altitudeMenace, !oldAltitudeMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAltitudeMenace() {
		TypeDictionaryDicoAltitude oldAltitudeMenace = altitudeMenace;
		boolean oldAltitudeMenaceESet = altitudeMenaceESet;
		altitudeMenace = ALTITUDE_MENACE_EDEFAULT;
		altitudeMenaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACE_AERIENNE__ALTITUDE_MENACE, oldAltitudeMenace, ALTITUDE_MENACE_EDEFAULT, oldAltitudeMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAltitudeMenace() {
		return altitudeMenaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRaidAerienEnnemiVitesseRaid getVitesseMenace() {
		return vitesseMenace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMenace(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid newVitesseMenace) {
		TypeDictionaryDicoRaidAerienEnnemiVitesseRaid oldVitesseMenace = vitesseMenace;
		vitesseMenace = newVitesseMenace == null ? VITESSE_MENACE_EDEFAULT : newVitesseMenace;
		boolean oldVitesseMenaceESet = vitesseMenaceESet;
		vitesseMenaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_AERIENNE__VITESSE_MENACE, oldVitesseMenace, vitesseMenace, !oldVitesseMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseMenace() {
		TypeDictionaryDicoRaidAerienEnnemiVitesseRaid oldVitesseMenace = vitesseMenace;
		boolean oldVitesseMenaceESet = vitesseMenaceESet;
		vitesseMenace = VITESSE_MENACE_EDEFAULT;
		vitesseMenaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACE_AERIENNE__VITESSE_MENACE, oldVitesseMenace, VITESSE_MENACE_EDEFAULT, oldVitesseMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseMenace() {
		return vitesseMenaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRaidAerienEnnemiVolumeRaid getVolumeMenace() {
		return volumeMenace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeMenace(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid newVolumeMenace) {
		TypeDictionaryDicoRaidAerienEnnemiVolumeRaid oldVolumeMenace = volumeMenace;
		volumeMenace = newVolumeMenace == null ? VOLUME_MENACE_EDEFAULT : newVolumeMenace;
		boolean oldVolumeMenaceESet = volumeMenaceESet;
		volumeMenaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_AERIENNE__VOLUME_MENACE, oldVolumeMenace, volumeMenace, !oldVolumeMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolumeMenace() {
		TypeDictionaryDicoRaidAerienEnnemiVolumeRaid oldVolumeMenace = volumeMenace;
		boolean oldVolumeMenaceESet = volumeMenaceESet;
		volumeMenace = VOLUME_MENACE_EDEFAULT;
		volumeMenaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACE_AERIENNE__VOLUME_MENACE, oldVolumeMenace, VOLUME_MENACE_EDEFAULT, oldVolumeMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolumeMenace() {
		return volumeMenaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeTypeAeronefTypeAeronef() {
		return aCommeTypeAeronefTypeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeTypeAeronefTypeAeronef(TypeAssociationEXT newACommeTypeAeronefTypeAeronef, NotificationChain msgs) {
		TypeAssociationEXT oldACommeTypeAeronefTypeAeronef = aCommeTypeAeronefTypeAeronef;
		aCommeTypeAeronefTypeAeronef = newACommeTypeAeronefTypeAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_AERIENNE__ACOMME_TYPE_AERONEF_TYPE_AERONEF, oldACommeTypeAeronefTypeAeronef, newACommeTypeAeronefTypeAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeTypeAeronefTypeAeronef(TypeAssociationEXT newACommeTypeAeronefTypeAeronef) {
		if (newACommeTypeAeronefTypeAeronef != aCommeTypeAeronefTypeAeronef) {
			NotificationChain msgs = null;
			if (aCommeTypeAeronefTypeAeronef != null)
				msgs = ((InternalEObject)aCommeTypeAeronefTypeAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_AERIENNE__ACOMME_TYPE_AERONEF_TYPE_AERONEF, null, msgs);
			if (newACommeTypeAeronefTypeAeronef != null)
				msgs = ((InternalEObject)newACommeTypeAeronefTypeAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_AERIENNE__ACOMME_TYPE_AERONEF_TYPE_AERONEF, null, msgs);
			msgs = basicSetACommeTypeAeronefTypeAeronef(newACommeTypeAeronefTypeAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_AERIENNE__ACOMME_TYPE_AERONEF_TYPE_AERONEF, newACommeTypeAeronefTypeAeronef, newACommeTypeAeronefTypeAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MENACE_AERIENNE__DIRECTION_DEPLACEMENT:
				return basicSetDirectionDeplacement(null, msgs);
			case SchemaPackage.TYPE_MENACE_AERIENNE__ACOMME_TYPE_AERONEF_TYPE_AERONEF:
				return basicSetACommeTypeAeronefTypeAeronef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_MENACE_AERIENNE__DIRECTION_DEPLACEMENT:
				return getDirectionDeplacement();
			case SchemaPackage.TYPE_MENACE_AERIENNE__ALTITUDE_MENACE:
				return getAltitudeMenace();
			case SchemaPackage.TYPE_MENACE_AERIENNE__VITESSE_MENACE:
				return getVitesseMenace();
			case SchemaPackage.TYPE_MENACE_AERIENNE__VOLUME_MENACE:
				return getVolumeMenace();
			case SchemaPackage.TYPE_MENACE_AERIENNE__ACOMME_TYPE_AERONEF_TYPE_AERONEF:
				return getACommeTypeAeronefTypeAeronef();
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
			case SchemaPackage.TYPE_MENACE_AERIENNE__DIRECTION_DEPLACEMENT:
				setDirectionDeplacement((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_AERIENNE__ALTITUDE_MENACE:
				setAltitudeMenace((TypeDictionaryDicoAltitude)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_AERIENNE__VITESSE_MENACE:
				setVitesseMenace((TypeDictionaryDicoRaidAerienEnnemiVitesseRaid)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_AERIENNE__VOLUME_MENACE:
				setVolumeMenace((TypeDictionaryDicoRaidAerienEnnemiVolumeRaid)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_AERIENNE__ACOMME_TYPE_AERONEF_TYPE_AERONEF:
				setACommeTypeAeronefTypeAeronef((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_MENACE_AERIENNE__DIRECTION_DEPLACEMENT:
				setDirectionDeplacement((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_MENACE_AERIENNE__ALTITUDE_MENACE:
				unsetAltitudeMenace();
				return;
			case SchemaPackage.TYPE_MENACE_AERIENNE__VITESSE_MENACE:
				unsetVitesseMenace();
				return;
			case SchemaPackage.TYPE_MENACE_AERIENNE__VOLUME_MENACE:
				unsetVolumeMenace();
				return;
			case SchemaPackage.TYPE_MENACE_AERIENNE__ACOMME_TYPE_AERONEF_TYPE_AERONEF:
				setACommeTypeAeronefTypeAeronef((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_MENACE_AERIENNE__DIRECTION_DEPLACEMENT:
				return directionDeplacement != null;
			case SchemaPackage.TYPE_MENACE_AERIENNE__ALTITUDE_MENACE:
				return isSetAltitudeMenace();
			case SchemaPackage.TYPE_MENACE_AERIENNE__VITESSE_MENACE:
				return isSetVitesseMenace();
			case SchemaPackage.TYPE_MENACE_AERIENNE__VOLUME_MENACE:
				return isSetVolumeMenace();
			case SchemaPackage.TYPE_MENACE_AERIENNE__ACOMME_TYPE_AERONEF_TYPE_AERONEF:
				return aCommeTypeAeronefTypeAeronef != null;
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
		result.append(" (altitudeMenace: ");
		if (altitudeMenaceESet) result.append(altitudeMenace); else result.append("<unset>");
		result.append(", vitesseMenace: ");
		if (vitesseMenaceESet) result.append(vitesseMenace); else result.append("<unset>");
		result.append(", volumeMenace: ");
		if (volumeMenaceESet) result.append(volumeMenace); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMenaceAerienneImpl
