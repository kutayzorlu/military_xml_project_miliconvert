/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose;
import mpia.schema.TypeDoseRadiationAbsorbe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Dose Radiation Absorbe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDoseRadiationAbsorbeImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDoseRadiationAbsorbeImpl#getTrancheDose <em>Tranche Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDoseRadiationAbsorbeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDoseRadiationAbsorbeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDoseRadiationAbsorbeImpl#getEstQuantiteAbsorbePourTypePersonne <em>Est Quantite Absorbe Pour Type Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDoseRadiationAbsorbeImpl extends EObjectImpl implements TypeDoseRadiationAbsorbe {
	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected double quantite = QUANTITE_EDEFAULT;

	/**
	 * This is true if the Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteESet;

	/**
	 * The default value of the '{@link #getTrancheDose() <em>Tranche Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrancheDose()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose TRANCHE_DOSE_EDEFAULT = TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose._025;

	/**
	 * The cached value of the '{@link #getTrancheDose() <em>Tranche Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrancheDose()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose trancheDose = TRANCHE_DOSE_EDEFAULT;

	/**
	 * This is true if the Tranche Dose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trancheDoseESet;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstQuantiteAbsorbePourTypePersonne() <em>Est Quantite Absorbe Pour Type Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstQuantiteAbsorbePourTypePersonne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estQuantiteAbsorbePourTypePersonne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDoseRadiationAbsorbeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDoseRadiationAbsorbe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(double newQuantite) {
		double oldQuantite = quantite;
		quantite = newQuantite;
		boolean oldQuantiteESet = quantiteESet;
		quantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantite() {
		double oldQuantite = quantite;
		boolean oldQuantiteESet = quantiteESet;
		quantite = QUANTITE_EDEFAULT;
		quantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantite() {
		return quantiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose getTrancheDose() {
		return trancheDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrancheDose(TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose newTrancheDose) {
		TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose oldTrancheDose = trancheDose;
		trancheDose = newTrancheDose == null ? TRANCHE_DOSE_EDEFAULT : newTrancheDose;
		boolean oldTrancheDoseESet = trancheDoseESet;
		trancheDoseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__TRANCHE_DOSE, oldTrancheDose, trancheDose, !oldTrancheDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrancheDose() {
		TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose oldTrancheDose = trancheDose;
		boolean oldTrancheDoseESet = trancheDoseESet;
		trancheDose = TRANCHE_DOSE_EDEFAULT;
		trancheDoseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__TRANCHE_DOSE, oldTrancheDose, TRANCHE_DOSE_EDEFAULT, oldTrancheDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrancheDose() {
		return trancheDoseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstQuantiteAbsorbePourTypePersonne() {
		return estQuantiteAbsorbePourTypePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstQuantiteAbsorbePourTypePersonne(TypeAssociationEXT newEstQuantiteAbsorbePourTypePersonne, NotificationChain msgs) {
		TypeAssociationEXT oldEstQuantiteAbsorbePourTypePersonne = estQuantiteAbsorbePourTypePersonne;
		estQuantiteAbsorbePourTypePersonne = newEstQuantiteAbsorbePourTypePersonne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__EST_QUANTITE_ABSORBE_POUR_TYPE_PERSONNE, oldEstQuantiteAbsorbePourTypePersonne, newEstQuantiteAbsorbePourTypePersonne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstQuantiteAbsorbePourTypePersonne(TypeAssociationEXT newEstQuantiteAbsorbePourTypePersonne) {
		if (newEstQuantiteAbsorbePourTypePersonne != estQuantiteAbsorbePourTypePersonne) {
			NotificationChain msgs = null;
			if (estQuantiteAbsorbePourTypePersonne != null)
				msgs = ((InternalEObject)estQuantiteAbsorbePourTypePersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__EST_QUANTITE_ABSORBE_POUR_TYPE_PERSONNE, null, msgs);
			if (newEstQuantiteAbsorbePourTypePersonne != null)
				msgs = ((InternalEObject)newEstQuantiteAbsorbePourTypePersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__EST_QUANTITE_ABSORBE_POUR_TYPE_PERSONNE, null, msgs);
			msgs = basicSetEstQuantiteAbsorbePourTypePersonne(newEstQuantiteAbsorbePourTypePersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__EST_QUANTITE_ABSORBE_POUR_TYPE_PERSONNE, newEstQuantiteAbsorbePourTypePersonne, newEstQuantiteAbsorbePourTypePersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__EST_QUANTITE_ABSORBE_POUR_TYPE_PERSONNE:
				return basicSetEstQuantiteAbsorbePourTypePersonne(null, msgs);
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
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__QUANTITE:
				return new Double(getQuantite());
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__TRANCHE_DOSE:
				return getTrancheDose();
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CE:
				return getCE();
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__EST_QUANTITE_ABSORBE_POUR_TYPE_PERSONNE:
				return getEstQuantiteAbsorbePourTypePersonne();
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
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__QUANTITE:
				setQuantite(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__TRANCHE_DOSE:
				setTrancheDose((TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose)newValue);
				return;
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__EST_QUANTITE_ABSORBE_POUR_TYPE_PERSONNE:
				setEstQuantiteAbsorbePourTypePersonne((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__TRANCHE_DOSE:
				unsetTrancheDose();
				return;
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__EST_QUANTITE_ABSORBE_POUR_TYPE_PERSONNE:
				setEstQuantiteAbsorbePourTypePersonne((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__TRANCHE_DOSE:
				return isSetTrancheDose();
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DOSE_RADIATION_ABSORBE__EST_QUANTITE_ABSORBE_POUR_TYPE_PERSONNE:
				return estQuantiteAbsorbePourTypePersonne != null;
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
		result.append(" (quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(", trancheDose: ");
		if (trancheDoseESet) result.append(trancheDose); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDoseRadiationAbsorbeImpl
