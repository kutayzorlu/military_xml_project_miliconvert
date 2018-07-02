/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeTypeConsommableSystemeArme;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Consommable Systeme Arme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableSystemeArmeImpl#getSeuilAlerte <em>Seuil Alerte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableSystemeArmeImpl#getTauxConversion <em>Taux Conversion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeTypeConsommableSystemeArmeImpl extends TypeTypeMaterielImpl implements TypeTypeConsommableSystemeArme {
	/**
	 * The default value of the '{@link #getSeuilAlerte() <em>Seuil Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeuilAlerte()
	 * @generated
	 * @ordered
	 */
	protected static final double SEUIL_ALERTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSeuilAlerte() <em>Seuil Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeuilAlerte()
	 * @generated
	 * @ordered
	 */
	protected double seuilAlerte = SEUIL_ALERTE_EDEFAULT;

	/**
	 * This is true if the Seuil Alerte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean seuilAlerteESet;

	/**
	 * The default value of the '{@link #getTauxConversion() <em>Taux Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxConversion()
	 * @generated
	 * @ordered
	 */
	protected static final double TAUX_CONVERSION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTauxConversion() <em>Taux Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxConversion()
	 * @generated
	 * @ordered
	 */
	protected double tauxConversion = TAUX_CONVERSION_EDEFAULT;

	/**
	 * This is true if the Taux Conversion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tauxConversionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeConsommableSystemeArmeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeConsommableSystemeArme();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeuilAlerte() {
		return seuilAlerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeuilAlerte(double newSeuilAlerte) {
		double oldSeuilAlerte = seuilAlerte;
		seuilAlerte = newSeuilAlerte;
		boolean oldSeuilAlerteESet = seuilAlerteESet;
		seuilAlerteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__SEUIL_ALERTE, oldSeuilAlerte, seuilAlerte, !oldSeuilAlerteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeuilAlerte() {
		double oldSeuilAlerte = seuilAlerte;
		boolean oldSeuilAlerteESet = seuilAlerteESet;
		seuilAlerte = SEUIL_ALERTE_EDEFAULT;
		seuilAlerteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__SEUIL_ALERTE, oldSeuilAlerte, SEUIL_ALERTE_EDEFAULT, oldSeuilAlerteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeuilAlerte() {
		return seuilAlerteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTauxConversion() {
		return tauxConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTauxConversion(double newTauxConversion) {
		double oldTauxConversion = tauxConversion;
		tauxConversion = newTauxConversion;
		boolean oldTauxConversionESet = tauxConversionESet;
		tauxConversionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__TAUX_CONVERSION, oldTauxConversion, tauxConversion, !oldTauxConversionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTauxConversion() {
		double oldTauxConversion = tauxConversion;
		boolean oldTauxConversionESet = tauxConversionESet;
		tauxConversion = TAUX_CONVERSION_EDEFAULT;
		tauxConversionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__TAUX_CONVERSION, oldTauxConversion, TAUX_CONVERSION_EDEFAULT, oldTauxConversionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTauxConversion() {
		return tauxConversionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__SEUIL_ALERTE:
				return new Double(getSeuilAlerte());
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__TAUX_CONVERSION:
				return new Double(getTauxConversion());
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
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__SEUIL_ALERTE:
				setSeuilAlerte(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__TAUX_CONVERSION:
				setTauxConversion(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__SEUIL_ALERTE:
				unsetSeuilAlerte();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__TAUX_CONVERSION:
				unsetTauxConversion();
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
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__SEUIL_ALERTE:
				return isSetSeuilAlerte();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE_SYSTEME_ARME__TAUX_CONVERSION:
				return isSetTauxConversion();
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
		result.append(" (seuilAlerte: ");
		if (seuilAlerteESet) result.append(seuilAlerte); else result.append("<unset>");
		result.append(", tauxConversion: ");
		if (tauxConversionESet) result.append(tauxConversion); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeConsommableSystemeArmeImpl
