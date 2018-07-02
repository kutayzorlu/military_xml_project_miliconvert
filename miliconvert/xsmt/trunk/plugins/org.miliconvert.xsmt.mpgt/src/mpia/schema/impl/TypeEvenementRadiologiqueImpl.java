/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEvenementRadiologique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Evenement Radiologique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvenementRadiologiqueImpl#getPourcentageIsotope <em>Pourcentage Isotope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEvenementRadiologiqueImpl extends TypeEvenementRadioactifImpl implements TypeEvenementRadiologique {
	/**
	 * The default value of the '{@link #getPourcentageIsotope() <em>Pourcentage Isotope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageIsotope()
	 * @generated
	 * @ordered
	 */
	protected static final double POURCENTAGE_ISOTOPE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPourcentageIsotope() <em>Pourcentage Isotope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageIsotope()
	 * @generated
	 * @ordered
	 */
	protected double pourcentageIsotope = POURCENTAGE_ISOTOPE_EDEFAULT;

	/**
	 * This is true if the Pourcentage Isotope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageIsotopeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvenementRadiologiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvenementRadiologique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPourcentageIsotope() {
		return pourcentageIsotope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageIsotope(double newPourcentageIsotope) {
		double oldPourcentageIsotope = pourcentageIsotope;
		pourcentageIsotope = newPourcentageIsotope;
		boolean oldPourcentageIsotopeESet = pourcentageIsotopeESet;
		pourcentageIsotopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_RADIOLOGIQUE__POURCENTAGE_ISOTOPE, oldPourcentageIsotope, pourcentageIsotope, !oldPourcentageIsotopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageIsotope() {
		double oldPourcentageIsotope = pourcentageIsotope;
		boolean oldPourcentageIsotopeESet = pourcentageIsotopeESet;
		pourcentageIsotope = POURCENTAGE_ISOTOPE_EDEFAULT;
		pourcentageIsotopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_RADIOLOGIQUE__POURCENTAGE_ISOTOPE, oldPourcentageIsotope, POURCENTAGE_ISOTOPE_EDEFAULT, oldPourcentageIsotopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageIsotope() {
		return pourcentageIsotopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVENEMENT_RADIOLOGIQUE__POURCENTAGE_ISOTOPE:
				return new Double(getPourcentageIsotope());
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
			case SchemaPackage.TYPE_EVENEMENT_RADIOLOGIQUE__POURCENTAGE_ISOTOPE:
				setPourcentageIsotope(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_EVENEMENT_RADIOLOGIQUE__POURCENTAGE_ISOTOPE:
				unsetPourcentageIsotope();
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
			case SchemaPackage.TYPE_EVENEMENT_RADIOLOGIQUE__POURCENTAGE_ISOTOPE:
				return isSetPourcentageIsotope();
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
		result.append(" (pourcentageIsotope: ");
		if (pourcentageIsotopeESet) result.append(pourcentageIsotope); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEvenementRadiologiqueImpl
