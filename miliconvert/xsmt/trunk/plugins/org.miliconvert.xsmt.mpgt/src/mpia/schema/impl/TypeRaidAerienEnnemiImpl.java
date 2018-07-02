/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoAltitude;
import mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVitesseRaid;
import mpia.schema.TypeDictionaryDicoRaidAerienEnnemiVolumeRaid;
import mpia.schema.TypeRaidAerienEnnemi;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Raid Aerien Ennemi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRaidAerienEnnemiImpl#getVolumeRaid <em>Volume Raid</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRaidAerienEnnemiImpl#getVitesseRaid <em>Vitesse Raid</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRaidAerienEnnemiImpl#isContreMesureElectronique <em>Contre Mesure Electronique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRaidAerienEnnemiImpl#getAltitudeRaid <em>Altitude Raid</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRaidAerienEnnemiImpl#getACommeTypeAeronefConstituantRaidTypeAeronef <em>AComme Type Aeronef Constituant Raid Type Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRaidAerienEnnemiImpl extends TypeEvenementImpl implements TypeRaidAerienEnnemi {
	/**
	 * The default value of the '{@link #getVolumeRaid() <em>Volume Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeRaid()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRaidAerienEnnemiVolumeRaid VOLUME_RAID_EDEFAULT = TypeDictionaryDicoRaidAerienEnnemiVolumeRaid.ONE;

	/**
	 * The cached value of the '{@link #getVolumeRaid() <em>Volume Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeRaid()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRaidAerienEnnemiVolumeRaid volumeRaid = VOLUME_RAID_EDEFAULT;

	/**
	 * This is true if the Volume Raid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volumeRaidESet;

	/**
	 * The default value of the '{@link #getVitesseRaid() <em>Vitesse Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseRaid()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRaidAerienEnnemiVitesseRaid VITESSE_RAID_EDEFAULT = TypeDictionaryDicoRaidAerienEnnemiVitesseRaid.SLOW;

	/**
	 * The cached value of the '{@link #getVitesseRaid() <em>Vitesse Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseRaid()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRaidAerienEnnemiVitesseRaid vitesseRaid = VITESSE_RAID_EDEFAULT;

	/**
	 * This is true if the Vitesse Raid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseRaidESet;

	/**
	 * The default value of the '{@link #isContreMesureElectronique() <em>Contre Mesure Electronique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContreMesureElectronique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTRE_MESURE_ELECTRONIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContreMesureElectronique() <em>Contre Mesure Electronique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContreMesureElectronique()
	 * @generated
	 * @ordered
	 */
	protected boolean contreMesureElectronique = CONTRE_MESURE_ELECTRONIQUE_EDEFAULT;

	/**
	 * This is true if the Contre Mesure Electronique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contreMesureElectroniqueESet;

	/**
	 * The default value of the '{@link #getAltitudeRaid() <em>Altitude Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeRaid()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAltitude ALTITUDE_RAID_EDEFAULT = TypeDictionaryDicoAltitude.VL;

	/**
	 * The cached value of the '{@link #getAltitudeRaid() <em>Altitude Raid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeRaid()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAltitude altitudeRaid = ALTITUDE_RAID_EDEFAULT;

	/**
	 * This is true if the Altitude Raid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altitudeRaidESet;

	/**
	 * The cached value of the '{@link #getACommeTypeAeronefConstituantRaidTypeAeronef() <em>AComme Type Aeronef Constituant Raid Type Aeronef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTypeAeronefConstituantRaidTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aCommeTypeAeronefConstituantRaidTypeAeronef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRaidAerienEnnemiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRaidAerienEnnemi();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRaidAerienEnnemiVolumeRaid getVolumeRaid() {
		return volumeRaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeRaid(TypeDictionaryDicoRaidAerienEnnemiVolumeRaid newVolumeRaid) {
		TypeDictionaryDicoRaidAerienEnnemiVolumeRaid oldVolumeRaid = volumeRaid;
		volumeRaid = newVolumeRaid == null ? VOLUME_RAID_EDEFAULT : newVolumeRaid;
		boolean oldVolumeRaidESet = volumeRaidESet;
		volumeRaidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VOLUME_RAID, oldVolumeRaid, volumeRaid, !oldVolumeRaidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolumeRaid() {
		TypeDictionaryDicoRaidAerienEnnemiVolumeRaid oldVolumeRaid = volumeRaid;
		boolean oldVolumeRaidESet = volumeRaidESet;
		volumeRaid = VOLUME_RAID_EDEFAULT;
		volumeRaidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VOLUME_RAID, oldVolumeRaid, VOLUME_RAID_EDEFAULT, oldVolumeRaidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolumeRaid() {
		return volumeRaidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRaidAerienEnnemiVitesseRaid getVitesseRaid() {
		return vitesseRaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseRaid(TypeDictionaryDicoRaidAerienEnnemiVitesseRaid newVitesseRaid) {
		TypeDictionaryDicoRaidAerienEnnemiVitesseRaid oldVitesseRaid = vitesseRaid;
		vitesseRaid = newVitesseRaid == null ? VITESSE_RAID_EDEFAULT : newVitesseRaid;
		boolean oldVitesseRaidESet = vitesseRaidESet;
		vitesseRaidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VITESSE_RAID, oldVitesseRaid, vitesseRaid, !oldVitesseRaidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseRaid() {
		TypeDictionaryDicoRaidAerienEnnemiVitesseRaid oldVitesseRaid = vitesseRaid;
		boolean oldVitesseRaidESet = vitesseRaidESet;
		vitesseRaid = VITESSE_RAID_EDEFAULT;
		vitesseRaidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VITESSE_RAID, oldVitesseRaid, VITESSE_RAID_EDEFAULT, oldVitesseRaidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseRaid() {
		return vitesseRaidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContreMesureElectronique() {
		return contreMesureElectronique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContreMesureElectronique(boolean newContreMesureElectronique) {
		boolean oldContreMesureElectronique = contreMesureElectronique;
		contreMesureElectronique = newContreMesureElectronique;
		boolean oldContreMesureElectroniqueESet = contreMesureElectroniqueESet;
		contreMesureElectroniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__CONTRE_MESURE_ELECTRONIQUE, oldContreMesureElectronique, contreMesureElectronique, !oldContreMesureElectroniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContreMesureElectronique() {
		boolean oldContreMesureElectronique = contreMesureElectronique;
		boolean oldContreMesureElectroniqueESet = contreMesureElectroniqueESet;
		contreMesureElectronique = CONTRE_MESURE_ELECTRONIQUE_EDEFAULT;
		contreMesureElectroniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__CONTRE_MESURE_ELECTRONIQUE, oldContreMesureElectronique, CONTRE_MESURE_ELECTRONIQUE_EDEFAULT, oldContreMesureElectroniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContreMesureElectronique() {
		return contreMesureElectroniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAltitude getAltitudeRaid() {
		return altitudeRaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeRaid(TypeDictionaryDicoAltitude newAltitudeRaid) {
		TypeDictionaryDicoAltitude oldAltitudeRaid = altitudeRaid;
		altitudeRaid = newAltitudeRaid == null ? ALTITUDE_RAID_EDEFAULT : newAltitudeRaid;
		boolean oldAltitudeRaidESet = altitudeRaidESet;
		altitudeRaidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ALTITUDE_RAID, oldAltitudeRaid, altitudeRaid, !oldAltitudeRaidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAltitudeRaid() {
		TypeDictionaryDicoAltitude oldAltitudeRaid = altitudeRaid;
		boolean oldAltitudeRaidESet = altitudeRaidESet;
		altitudeRaid = ALTITUDE_RAID_EDEFAULT;
		altitudeRaidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ALTITUDE_RAID, oldAltitudeRaid, ALTITUDE_RAID_EDEFAULT, oldAltitudeRaidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAltitudeRaid() {
		return altitudeRaidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getACommeTypeAeronefConstituantRaidTypeAeronef() {
		if (aCommeTypeAeronefConstituantRaidTypeAeronef == null) {
			aCommeTypeAeronefConstituantRaidTypeAeronef = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ACOMME_TYPE_AERONEF_CONSTITUANT_RAID_TYPE_AERONEF);
		}
		return aCommeTypeAeronefConstituantRaidTypeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ACOMME_TYPE_AERONEF_CONSTITUANT_RAID_TYPE_AERONEF:
				return ((InternalEList<?>)getACommeTypeAeronefConstituantRaidTypeAeronef()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VOLUME_RAID:
				return getVolumeRaid();
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VITESSE_RAID:
				return getVitesseRaid();
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__CONTRE_MESURE_ELECTRONIQUE:
				return isContreMesureElectronique() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ALTITUDE_RAID:
				return getAltitudeRaid();
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ACOMME_TYPE_AERONEF_CONSTITUANT_RAID_TYPE_AERONEF:
				return getACommeTypeAeronefConstituantRaidTypeAeronef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VOLUME_RAID:
				setVolumeRaid((TypeDictionaryDicoRaidAerienEnnemiVolumeRaid)newValue);
				return;
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VITESSE_RAID:
				setVitesseRaid((TypeDictionaryDicoRaidAerienEnnemiVitesseRaid)newValue);
				return;
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__CONTRE_MESURE_ELECTRONIQUE:
				setContreMesureElectronique(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ALTITUDE_RAID:
				setAltitudeRaid((TypeDictionaryDicoAltitude)newValue);
				return;
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ACOMME_TYPE_AERONEF_CONSTITUANT_RAID_TYPE_AERONEF:
				getACommeTypeAeronefConstituantRaidTypeAeronef().clear();
				getACommeTypeAeronefConstituantRaidTypeAeronef().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VOLUME_RAID:
				unsetVolumeRaid();
				return;
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VITESSE_RAID:
				unsetVitesseRaid();
				return;
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__CONTRE_MESURE_ELECTRONIQUE:
				unsetContreMesureElectronique();
				return;
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ALTITUDE_RAID:
				unsetAltitudeRaid();
				return;
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ACOMME_TYPE_AERONEF_CONSTITUANT_RAID_TYPE_AERONEF:
				getACommeTypeAeronefConstituantRaidTypeAeronef().clear();
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
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VOLUME_RAID:
				return isSetVolumeRaid();
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__VITESSE_RAID:
				return isSetVitesseRaid();
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__CONTRE_MESURE_ELECTRONIQUE:
				return isSetContreMesureElectronique();
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ALTITUDE_RAID:
				return isSetAltitudeRaid();
			case SchemaPackage.TYPE_RAID_AERIEN_ENNEMI__ACOMME_TYPE_AERONEF_CONSTITUANT_RAID_TYPE_AERONEF:
				return aCommeTypeAeronefConstituantRaidTypeAeronef != null && !aCommeTypeAeronefConstituantRaidTypeAeronef.isEmpty();
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
		result.append(" (volumeRaid: ");
		if (volumeRaidESet) result.append(volumeRaid); else result.append("<unset>");
		result.append(", vitesseRaid: ");
		if (vitesseRaidESet) result.append(vitesseRaid); else result.append("<unset>");
		result.append(", contreMesureElectronique: ");
		if (contreMesureElectroniqueESet) result.append(contreMesureElectronique); else result.append("<unset>");
		result.append(", altitudeRaid: ");
		if (altitudeRaidESet) result.append(altitudeRaid); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeRaidAerienEnnemiImpl
