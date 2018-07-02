/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapteurDrone;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capteur Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapteurDroneImpl#getDureeVol <em>Duree Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapteurDroneImpl#getLongueurMaxPassePhoto <em>Longueur Max Passe Photo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapteurDroneImpl#getLongueurMaxFicelle <em>Longueur Max Ficelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapteurDroneImpl extends TypeCapteurRENSImpl implements TypeCapteurDrone {
	/**
	 * The default value of the '{@link #getDureeVol() <em>Duree Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeVol()
	 * @generated
	 * @ordered
	 */
	protected static final long DUREE_VOL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDureeVol() <em>Duree Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeVol()
	 * @generated
	 * @ordered
	 */
	protected long dureeVol = DUREE_VOL_EDEFAULT;

	/**
	 * This is true if the Duree Vol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dureeVolESet;

	/**
	 * The default value of the '{@link #getLongueurMaxPassePhoto() <em>Longueur Max Passe Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurMaxPassePhoto()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGUEUR_MAX_PASSE_PHOTO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongueurMaxPassePhoto() <em>Longueur Max Passe Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurMaxPassePhoto()
	 * @generated
	 * @ordered
	 */
	protected double longueurMaxPassePhoto = LONGUEUR_MAX_PASSE_PHOTO_EDEFAULT;

	/**
	 * This is true if the Longueur Max Passe Photo attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longueurMaxPassePhotoESet;

	/**
	 * The default value of the '{@link #getLongueurMaxFicelle() <em>Longueur Max Ficelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurMaxFicelle()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGUEUR_MAX_FICELLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongueurMaxFicelle() <em>Longueur Max Ficelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurMaxFicelle()
	 * @generated
	 * @ordered
	 */
	protected double longueurMaxFicelle = LONGUEUR_MAX_FICELLE_EDEFAULT;

	/**
	 * This is true if the Longueur Max Ficelle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longueurMaxFicelleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapteurDroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapteurDrone();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDureeVol() {
		return dureeVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeVol(long newDureeVol) {
		long oldDureeVol = dureeVol;
		dureeVol = newDureeVol;
		boolean oldDureeVolESet = dureeVolESet;
		dureeVolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPTEUR_DRONE__DUREE_VOL, oldDureeVol, dureeVol, !oldDureeVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDureeVol() {
		long oldDureeVol = dureeVol;
		boolean oldDureeVolESet = dureeVolESet;
		dureeVol = DUREE_VOL_EDEFAULT;
		dureeVolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPTEUR_DRONE__DUREE_VOL, oldDureeVol, DUREE_VOL_EDEFAULT, oldDureeVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDureeVol() {
		return dureeVolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongueurMaxPassePhoto() {
		return longueurMaxPassePhoto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurMaxPassePhoto(double newLongueurMaxPassePhoto) {
		double oldLongueurMaxPassePhoto = longueurMaxPassePhoto;
		longueurMaxPassePhoto = newLongueurMaxPassePhoto;
		boolean oldLongueurMaxPassePhotoESet = longueurMaxPassePhotoESet;
		longueurMaxPassePhotoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_PASSE_PHOTO, oldLongueurMaxPassePhoto, longueurMaxPassePhoto, !oldLongueurMaxPassePhotoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongueurMaxPassePhoto() {
		double oldLongueurMaxPassePhoto = longueurMaxPassePhoto;
		boolean oldLongueurMaxPassePhotoESet = longueurMaxPassePhotoESet;
		longueurMaxPassePhoto = LONGUEUR_MAX_PASSE_PHOTO_EDEFAULT;
		longueurMaxPassePhotoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_PASSE_PHOTO, oldLongueurMaxPassePhoto, LONGUEUR_MAX_PASSE_PHOTO_EDEFAULT, oldLongueurMaxPassePhotoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongueurMaxPassePhoto() {
		return longueurMaxPassePhotoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongueurMaxFicelle() {
		return longueurMaxFicelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurMaxFicelle(double newLongueurMaxFicelle) {
		double oldLongueurMaxFicelle = longueurMaxFicelle;
		longueurMaxFicelle = newLongueurMaxFicelle;
		boolean oldLongueurMaxFicelleESet = longueurMaxFicelleESet;
		longueurMaxFicelleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_FICELLE, oldLongueurMaxFicelle, longueurMaxFicelle, !oldLongueurMaxFicelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongueurMaxFicelle() {
		double oldLongueurMaxFicelle = longueurMaxFicelle;
		boolean oldLongueurMaxFicelleESet = longueurMaxFicelleESet;
		longueurMaxFicelle = LONGUEUR_MAX_FICELLE_EDEFAULT;
		longueurMaxFicelleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_FICELLE, oldLongueurMaxFicelle, LONGUEUR_MAX_FICELLE_EDEFAULT, oldLongueurMaxFicelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongueurMaxFicelle() {
		return longueurMaxFicelleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPTEUR_DRONE__DUREE_VOL:
				return new Long(getDureeVol());
			case SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_PASSE_PHOTO:
				return new Double(getLongueurMaxPassePhoto());
			case SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_FICELLE:
				return new Double(getLongueurMaxFicelle());
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
			case SchemaPackage.TYPE_CAPTEUR_DRONE__DUREE_VOL:
				setDureeVol(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_PASSE_PHOTO:
				setLongueurMaxPassePhoto(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_FICELLE:
				setLongueurMaxFicelle(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_CAPTEUR_DRONE__DUREE_VOL:
				unsetDureeVol();
				return;
			case SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_PASSE_PHOTO:
				unsetLongueurMaxPassePhoto();
				return;
			case SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_FICELLE:
				unsetLongueurMaxFicelle();
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
			case SchemaPackage.TYPE_CAPTEUR_DRONE__DUREE_VOL:
				return isSetDureeVol();
			case SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_PASSE_PHOTO:
				return isSetLongueurMaxPassePhoto();
			case SchemaPackage.TYPE_CAPTEUR_DRONE__LONGUEUR_MAX_FICELLE:
				return isSetLongueurMaxFicelle();
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
		result.append(" (dureeVol: ");
		if (dureeVolESet) result.append(dureeVol); else result.append("<unset>");
		result.append(", longueurMaxPassePhoto: ");
		if (longueurMaxPassePhotoESet) result.append(longueurMaxPassePhoto); else result.append("<unset>");
		result.append(", longueurMaxFicelle: ");
		if (longueurMaxFicelleESet) result.append(longueurMaxFicelle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapteurDroneImpl
