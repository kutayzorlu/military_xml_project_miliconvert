/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiquesMouvement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Caracteristiques Mouvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesMouvementImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesMouvementImpl#getChargeParEssieu <em>Charge Par Essieu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesMouvementImpl#getRayonBraquageMax <em>Rayon Braquage Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaracteristiquesMouvementImpl extends EObjectImpl implements TypeCaracteristiquesMouvement {
	/**
	 * The default value of the '{@link #getClasse() <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected static final long CLASSE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClasse() <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected long classe = CLASSE_EDEFAULT;

	/**
	 * This is true if the Classe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classeESet;

	/**
	 * The default value of the '{@link #getChargeParEssieu() <em>Charge Par Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeParEssieu()
	 * @generated
	 * @ordered
	 */
	protected static final double CHARGE_PAR_ESSIEU_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getChargeParEssieu() <em>Charge Par Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeParEssieu()
	 * @generated
	 * @ordered
	 */
	protected double chargeParEssieu = CHARGE_PAR_ESSIEU_EDEFAULT;

	/**
	 * This is true if the Charge Par Essieu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargeParEssieuESet;

	/**
	 * The default value of the '{@link #getRayonBraquageMax() <em>Rayon Braquage Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonBraquageMax()
	 * @generated
	 * @ordered
	 */
	protected static final double RAYON_BRAQUAGE_MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRayonBraquageMax() <em>Rayon Braquage Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonBraquageMax()
	 * @generated
	 * @ordered
	 */
	protected double rayonBraquageMax = RAYON_BRAQUAGE_MAX_EDEFAULT;

	/**
	 * This is true if the Rayon Braquage Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rayonBraquageMaxESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCaracteristiquesMouvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaracteristiquesMouvement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClasse() {
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasse(long newClasse) {
		long oldClasse = classe;
		classe = newClasse;
		boolean oldClasseESet = classeESet;
		classeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CLASSE, oldClasse, classe, !oldClasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClasse() {
		long oldClasse = classe;
		boolean oldClasseESet = classeESet;
		classe = CLASSE_EDEFAULT;
		classeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CLASSE, oldClasse, CLASSE_EDEFAULT, oldClasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClasse() {
		return classeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getChargeParEssieu() {
		return chargeParEssieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeParEssieu(double newChargeParEssieu) {
		double oldChargeParEssieu = chargeParEssieu;
		chargeParEssieu = newChargeParEssieu;
		boolean oldChargeParEssieuESet = chargeParEssieuESet;
		chargeParEssieuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CHARGE_PAR_ESSIEU, oldChargeParEssieu, chargeParEssieu, !oldChargeParEssieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChargeParEssieu() {
		double oldChargeParEssieu = chargeParEssieu;
		boolean oldChargeParEssieuESet = chargeParEssieuESet;
		chargeParEssieu = CHARGE_PAR_ESSIEU_EDEFAULT;
		chargeParEssieuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CHARGE_PAR_ESSIEU, oldChargeParEssieu, CHARGE_PAR_ESSIEU_EDEFAULT, oldChargeParEssieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChargeParEssieu() {
		return chargeParEssieuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRayonBraquageMax() {
		return rayonBraquageMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonBraquageMax(double newRayonBraquageMax) {
		double oldRayonBraquageMax = rayonBraquageMax;
		rayonBraquageMax = newRayonBraquageMax;
		boolean oldRayonBraquageMaxESet = rayonBraquageMaxESet;
		rayonBraquageMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__RAYON_BRAQUAGE_MAX, oldRayonBraquageMax, rayonBraquageMax, !oldRayonBraquageMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRayonBraquageMax() {
		double oldRayonBraquageMax = rayonBraquageMax;
		boolean oldRayonBraquageMaxESet = rayonBraquageMaxESet;
		rayonBraquageMax = RAYON_BRAQUAGE_MAX_EDEFAULT;
		rayonBraquageMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__RAYON_BRAQUAGE_MAX, oldRayonBraquageMax, RAYON_BRAQUAGE_MAX_EDEFAULT, oldRayonBraquageMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRayonBraquageMax() {
		return rayonBraquageMaxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CLASSE:
				return new Long(getClasse());
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CHARGE_PAR_ESSIEU:
				return new Double(getChargeParEssieu());
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__RAYON_BRAQUAGE_MAX:
				return new Double(getRayonBraquageMax());
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CLASSE:
				setClasse(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CHARGE_PAR_ESSIEU:
				setChargeParEssieu(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__RAYON_BRAQUAGE_MAX:
				setRayonBraquageMax(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CLASSE:
				unsetClasse();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CHARGE_PAR_ESSIEU:
				unsetChargeParEssieu();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__RAYON_BRAQUAGE_MAX:
				unsetRayonBraquageMax();
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CLASSE:
				return isSetClasse();
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__CHARGE_PAR_ESSIEU:
				return isSetChargeParEssieu();
			case SchemaPackage.TYPE_CARACTERISTIQUES_MOUVEMENT__RAYON_BRAQUAGE_MAX:
				return isSetRayonBraquageMax();
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
		result.append(" (classe: ");
		if (classeESet) result.append(classe); else result.append("<unset>");
		result.append(", chargeParEssieu: ");
		if (chargeParEssieuESet) result.append(chargeParEssieu); else result.append("<unset>");
		result.append(", rayonBraquageMax: ");
		if (rayonBraquageMaxESet) result.append(rayonBraquageMax); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCaracteristiquesMouvementImpl
