/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMoyenDispersionMoyenLancement;
import mpia.schema.TypeMoyenDispersion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Moyen Dispersion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyenDispersionImpl#getQuantiteMoyensLancement <em>Quantite Moyens Lancement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenDispersionImpl#getMoyenLancementNonRepertorie <em>Moyen Lancement Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenDispersionImpl#getMoyenLancement <em>Moyen Lancement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyenDispersionImpl extends EObjectImpl implements TypeMoyenDispersion {
	/**
	 * The default value of the '{@link #getQuantiteMoyensLancement() <em>Quantite Moyens Lancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMoyensLancement()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MOYENS_LANCEMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMoyensLancement() <em>Quantite Moyens Lancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMoyensLancement()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMoyensLancement = QUANTITE_MOYENS_LANCEMENT_EDEFAULT;

	/**
	 * This is true if the Quantite Moyens Lancement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMoyensLancementESet;

	/**
	 * The default value of the '{@link #getMoyenLancementNonRepertorie() <em>Moyen Lancement Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenLancementNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYEN_LANCEMENT_NON_REPERTORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyenLancementNonRepertorie() <em>Moyen Lancement Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenLancementNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected String moyenLancementNonRepertorie = MOYEN_LANCEMENT_NON_REPERTORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyenLancement() <em>Moyen Lancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenLancement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMoyenDispersionMoyenLancement MOYEN_LANCEMENT_EDEFAULT = TypeDictionaryDicoMoyenDispersionMoyenLancement.AIR;

	/**
	 * The cached value of the '{@link #getMoyenLancement() <em>Moyen Lancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenLancement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMoyenDispersionMoyenLancement moyenLancement = MOYEN_LANCEMENT_EDEFAULT;

	/**
	 * This is true if the Moyen Lancement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyenLancementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyenDispersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyenDispersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMoyensLancement() {
		return quantiteMoyensLancement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMoyensLancement(long newQuantiteMoyensLancement) {
		long oldQuantiteMoyensLancement = quantiteMoyensLancement;
		quantiteMoyensLancement = newQuantiteMoyensLancement;
		boolean oldQuantiteMoyensLancementESet = quantiteMoyensLancementESet;
		quantiteMoyensLancementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_DISPERSION__QUANTITE_MOYENS_LANCEMENT, oldQuantiteMoyensLancement, quantiteMoyensLancement, !oldQuantiteMoyensLancementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMoyensLancement() {
		long oldQuantiteMoyensLancement = quantiteMoyensLancement;
		boolean oldQuantiteMoyensLancementESet = quantiteMoyensLancementESet;
		quantiteMoyensLancement = QUANTITE_MOYENS_LANCEMENT_EDEFAULT;
		quantiteMoyensLancementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYEN_DISPERSION__QUANTITE_MOYENS_LANCEMENT, oldQuantiteMoyensLancement, QUANTITE_MOYENS_LANCEMENT_EDEFAULT, oldQuantiteMoyensLancementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMoyensLancement() {
		return quantiteMoyensLancementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyenLancementNonRepertorie() {
		return moyenLancementNonRepertorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenLancementNonRepertorie(String newMoyenLancementNonRepertorie) {
		String oldMoyenLancementNonRepertorie = moyenLancementNonRepertorie;
		moyenLancementNonRepertorie = newMoyenLancementNonRepertorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT_NON_REPERTORIE, oldMoyenLancementNonRepertorie, moyenLancementNonRepertorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMoyenDispersionMoyenLancement getMoyenLancement() {
		return moyenLancement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenLancement(TypeDictionaryDicoMoyenDispersionMoyenLancement newMoyenLancement) {
		TypeDictionaryDicoMoyenDispersionMoyenLancement oldMoyenLancement = moyenLancement;
		moyenLancement = newMoyenLancement == null ? MOYEN_LANCEMENT_EDEFAULT : newMoyenLancement;
		boolean oldMoyenLancementESet = moyenLancementESet;
		moyenLancementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT, oldMoyenLancement, moyenLancement, !oldMoyenLancementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyenLancement() {
		TypeDictionaryDicoMoyenDispersionMoyenLancement oldMoyenLancement = moyenLancement;
		boolean oldMoyenLancementESet = moyenLancementESet;
		moyenLancement = MOYEN_LANCEMENT_EDEFAULT;
		moyenLancementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT, oldMoyenLancement, MOYEN_LANCEMENT_EDEFAULT, oldMoyenLancementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyenLancement() {
		return moyenLancementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYEN_DISPERSION__QUANTITE_MOYENS_LANCEMENT:
				return new Long(getQuantiteMoyensLancement());
			case SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT_NON_REPERTORIE:
				return getMoyenLancementNonRepertorie();
			case SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT:
				return getMoyenLancement();
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
			case SchemaPackage.TYPE_MOYEN_DISPERSION__QUANTITE_MOYENS_LANCEMENT:
				setQuantiteMoyensLancement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT_NON_REPERTORIE:
				setMoyenLancementNonRepertorie((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT:
				setMoyenLancement((TypeDictionaryDicoMoyenDispersionMoyenLancement)newValue);
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
			case SchemaPackage.TYPE_MOYEN_DISPERSION__QUANTITE_MOYENS_LANCEMENT:
				unsetQuantiteMoyensLancement();
				return;
			case SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT_NON_REPERTORIE:
				setMoyenLancementNonRepertorie(MOYEN_LANCEMENT_NON_REPERTORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT:
				unsetMoyenLancement();
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
			case SchemaPackage.TYPE_MOYEN_DISPERSION__QUANTITE_MOYENS_LANCEMENT:
				return isSetQuantiteMoyensLancement();
			case SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT_NON_REPERTORIE:
				return MOYEN_LANCEMENT_NON_REPERTORIE_EDEFAULT == null ? moyenLancementNonRepertorie != null : !MOYEN_LANCEMENT_NON_REPERTORIE_EDEFAULT.equals(moyenLancementNonRepertorie);
			case SchemaPackage.TYPE_MOYEN_DISPERSION__MOYEN_LANCEMENT:
				return isSetMoyenLancement();
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
		result.append(" (quantiteMoyensLancement: ");
		if (quantiteMoyensLancementESet) result.append(quantiteMoyensLancement); else result.append("<unset>");
		result.append(", moyenLancementNonRepertorie: ");
		result.append(moyenLancementNonRepertorie);
		result.append(", moyenLancement: ");
		if (moyenLancementESet) result.append(moyenLancement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMoyenDispersionImpl
