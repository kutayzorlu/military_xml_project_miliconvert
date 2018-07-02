/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapteurRadar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capteur Radar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapteurRadarImpl#getAngleOrientation <em>Angle Orientation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapteurRadarImpl#getRayonSecteur <em>Rayon Secteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapteurRadarImpl#getAngleSecteur <em>Angle Secteur</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapteurRadarImpl extends TypeCapteurRENSImpl implements TypeCapteurRadar {
	/**
	 * The default value of the '{@link #getAngleOrientation() <em>Angle Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLE_ORIENTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngleOrientation() <em>Angle Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOrientation()
	 * @generated
	 * @ordered
	 */
	protected double angleOrientation = ANGLE_ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Angle Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angleOrientationESet;

	/**
	 * The default value of the '{@link #getRayonSecteur() <em>Rayon Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonSecteur()
	 * @generated
	 * @ordered
	 */
	protected static final double RAYON_SECTEUR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRayonSecteur() <em>Rayon Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonSecteur()
	 * @generated
	 * @ordered
	 */
	protected double rayonSecteur = RAYON_SECTEUR_EDEFAULT;

	/**
	 * This is true if the Rayon Secteur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rayonSecteurESet;

	/**
	 * The default value of the '{@link #getAngleSecteur() <em>Angle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleSecteur()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLE_SECTEUR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngleSecteur() <em>Angle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleSecteur()
	 * @generated
	 * @ordered
	 */
	protected double angleSecteur = ANGLE_SECTEUR_EDEFAULT;

	/**
	 * This is true if the Angle Secteur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angleSecteurESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapteurRadarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapteurRadar();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngleOrientation() {
		return angleOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleOrientation(double newAngleOrientation) {
		double oldAngleOrientation = angleOrientation;
		angleOrientation = newAngleOrientation;
		boolean oldAngleOrientationESet = angleOrientationESet;
		angleOrientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_ORIENTATION, oldAngleOrientation, angleOrientation, !oldAngleOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAngleOrientation() {
		double oldAngleOrientation = angleOrientation;
		boolean oldAngleOrientationESet = angleOrientationESet;
		angleOrientation = ANGLE_ORIENTATION_EDEFAULT;
		angleOrientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_ORIENTATION, oldAngleOrientation, ANGLE_ORIENTATION_EDEFAULT, oldAngleOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAngleOrientation() {
		return angleOrientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRayonSecteur() {
		return rayonSecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonSecteur(double newRayonSecteur) {
		double oldRayonSecteur = rayonSecteur;
		rayonSecteur = newRayonSecteur;
		boolean oldRayonSecteurESet = rayonSecteurESet;
		rayonSecteurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPTEUR_RADAR__RAYON_SECTEUR, oldRayonSecteur, rayonSecteur, !oldRayonSecteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRayonSecteur() {
		double oldRayonSecteur = rayonSecteur;
		boolean oldRayonSecteurESet = rayonSecteurESet;
		rayonSecteur = RAYON_SECTEUR_EDEFAULT;
		rayonSecteurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPTEUR_RADAR__RAYON_SECTEUR, oldRayonSecteur, RAYON_SECTEUR_EDEFAULT, oldRayonSecteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRayonSecteur() {
		return rayonSecteurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngleSecteur() {
		return angleSecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleSecteur(double newAngleSecteur) {
		double oldAngleSecteur = angleSecteur;
		angleSecteur = newAngleSecteur;
		boolean oldAngleSecteurESet = angleSecteurESet;
		angleSecteurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_SECTEUR, oldAngleSecteur, angleSecteur, !oldAngleSecteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAngleSecteur() {
		double oldAngleSecteur = angleSecteur;
		boolean oldAngleSecteurESet = angleSecteurESet;
		angleSecteur = ANGLE_SECTEUR_EDEFAULT;
		angleSecteurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_SECTEUR, oldAngleSecteur, ANGLE_SECTEUR_EDEFAULT, oldAngleSecteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAngleSecteur() {
		return angleSecteurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_ORIENTATION:
				return new Double(getAngleOrientation());
			case SchemaPackage.TYPE_CAPTEUR_RADAR__RAYON_SECTEUR:
				return new Double(getRayonSecteur());
			case SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_SECTEUR:
				return new Double(getAngleSecteur());
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
			case SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_ORIENTATION:
				setAngleOrientation(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CAPTEUR_RADAR__RAYON_SECTEUR:
				setRayonSecteur(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_SECTEUR:
				setAngleSecteur(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_ORIENTATION:
				unsetAngleOrientation();
				return;
			case SchemaPackage.TYPE_CAPTEUR_RADAR__RAYON_SECTEUR:
				unsetRayonSecteur();
				return;
			case SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_SECTEUR:
				unsetAngleSecteur();
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
			case SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_ORIENTATION:
				return isSetAngleOrientation();
			case SchemaPackage.TYPE_CAPTEUR_RADAR__RAYON_SECTEUR:
				return isSetRayonSecteur();
			case SchemaPackage.TYPE_CAPTEUR_RADAR__ANGLE_SECTEUR:
				return isSetAngleSecteur();
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
		result.append(" (angleOrientation: ");
		if (angleOrientationESet) result.append(angleOrientation); else result.append("<unset>");
		result.append(", rayonSecteur: ");
		if (rayonSecteurESet) result.append(rayonSecteur); else result.append("<unset>");
		result.append(", angleSecteur: ");
		if (angleSecteurESet) result.append(angleSecteur); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapteurRadarImpl
