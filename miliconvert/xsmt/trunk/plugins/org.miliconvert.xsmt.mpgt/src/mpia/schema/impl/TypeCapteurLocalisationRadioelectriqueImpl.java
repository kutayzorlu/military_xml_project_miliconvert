/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapteurLocalisationRadioelectrique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capteur Localisation Radioelectrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapteurLocalisationRadioelectriqueImpl#getLongeurCoteZoneUtile <em>Longeur Cote Zone Utile</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapteurLocalisationRadioelectriqueImpl#getLongeurCoteZoneEcoute <em>Longeur Cote Zone Ecoute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapteurLocalisationRadioelectriqueImpl extends TypeCapteurRENSImpl implements TypeCapteurLocalisationRadioelectrique {
	/**
	 * The default value of the '{@link #getLongeurCoteZoneUtile() <em>Longeur Cote Zone Utile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongeurCoteZoneUtile()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGEUR_COTE_ZONE_UTILE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongeurCoteZoneUtile() <em>Longeur Cote Zone Utile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongeurCoteZoneUtile()
	 * @generated
	 * @ordered
	 */
	protected double longeurCoteZoneUtile = LONGEUR_COTE_ZONE_UTILE_EDEFAULT;

	/**
	 * This is true if the Longeur Cote Zone Utile attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longeurCoteZoneUtileESet;

	/**
	 * The default value of the '{@link #getLongeurCoteZoneEcoute() <em>Longeur Cote Zone Ecoute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongeurCoteZoneEcoute()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGEUR_COTE_ZONE_ECOUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongeurCoteZoneEcoute() <em>Longeur Cote Zone Ecoute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongeurCoteZoneEcoute()
	 * @generated
	 * @ordered
	 */
	protected double longeurCoteZoneEcoute = LONGEUR_COTE_ZONE_ECOUTE_EDEFAULT;

	/**
	 * This is true if the Longeur Cote Zone Ecoute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longeurCoteZoneEcouteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapteurLocalisationRadioelectriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapteurLocalisationRadioelectrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongeurCoteZoneUtile() {
		return longeurCoteZoneUtile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongeurCoteZoneUtile(double newLongeurCoteZoneUtile) {
		double oldLongeurCoteZoneUtile = longeurCoteZoneUtile;
		longeurCoteZoneUtile = newLongeurCoteZoneUtile;
		boolean oldLongeurCoteZoneUtileESet = longeurCoteZoneUtileESet;
		longeurCoteZoneUtileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_UTILE, oldLongeurCoteZoneUtile, longeurCoteZoneUtile, !oldLongeurCoteZoneUtileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongeurCoteZoneUtile() {
		double oldLongeurCoteZoneUtile = longeurCoteZoneUtile;
		boolean oldLongeurCoteZoneUtileESet = longeurCoteZoneUtileESet;
		longeurCoteZoneUtile = LONGEUR_COTE_ZONE_UTILE_EDEFAULT;
		longeurCoteZoneUtileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_UTILE, oldLongeurCoteZoneUtile, LONGEUR_COTE_ZONE_UTILE_EDEFAULT, oldLongeurCoteZoneUtileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongeurCoteZoneUtile() {
		return longeurCoteZoneUtileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongeurCoteZoneEcoute() {
		return longeurCoteZoneEcoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongeurCoteZoneEcoute(double newLongeurCoteZoneEcoute) {
		double oldLongeurCoteZoneEcoute = longeurCoteZoneEcoute;
		longeurCoteZoneEcoute = newLongeurCoteZoneEcoute;
		boolean oldLongeurCoteZoneEcouteESet = longeurCoteZoneEcouteESet;
		longeurCoteZoneEcouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_ECOUTE, oldLongeurCoteZoneEcoute, longeurCoteZoneEcoute, !oldLongeurCoteZoneEcouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongeurCoteZoneEcoute() {
		double oldLongeurCoteZoneEcoute = longeurCoteZoneEcoute;
		boolean oldLongeurCoteZoneEcouteESet = longeurCoteZoneEcouteESet;
		longeurCoteZoneEcoute = LONGEUR_COTE_ZONE_ECOUTE_EDEFAULT;
		longeurCoteZoneEcouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_ECOUTE, oldLongeurCoteZoneEcoute, LONGEUR_COTE_ZONE_ECOUTE_EDEFAULT, oldLongeurCoteZoneEcouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongeurCoteZoneEcoute() {
		return longeurCoteZoneEcouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_UTILE:
				return new Double(getLongeurCoteZoneUtile());
			case SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_ECOUTE:
				return new Double(getLongeurCoteZoneEcoute());
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
			case SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_UTILE:
				setLongeurCoteZoneUtile(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_ECOUTE:
				setLongeurCoteZoneEcoute(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_UTILE:
				unsetLongeurCoteZoneUtile();
				return;
			case SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_ECOUTE:
				unsetLongeurCoteZoneEcoute();
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
			case SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_UTILE:
				return isSetLongeurCoteZoneUtile();
			case SchemaPackage.TYPE_CAPTEUR_LOCALISATION_RADIOELECTRIQUE__LONGEUR_COTE_ZONE_ECOUTE:
				return isSetLongeurCoteZoneEcoute();
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
		result.append(" (longeurCoteZoneUtile: ");
		if (longeurCoteZoneUtileESet) result.append(longeurCoteZoneUtile); else result.append("<unset>");
		result.append(", longeurCoteZoneEcoute: ");
		if (longeurCoteZoneEcouteESet) result.append(longeurCoteZoneEcoute); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapteurLocalisationRadioelectriqueImpl
