/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePotentielENIfeuSolSol;
import mpia.schema.TypeQuantiteTypeArmePourMoyenFeuASSeni;

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
 * An implementation of the model object '<em><b>Type Potentiel EN Ifeu Sol Sol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePotentielENIfeuSolSolImpl#getNombreGlobalBatteries <em>Nombre Global Batteries</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielENIfeuSolSolImpl#getNombreGlobalTubes <em>Nombre Global Tubes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielENIfeuSolSolImpl#getAPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni <em>APour Quantite Moyen Feu AS Seni Quantite Type Arme Pour Moyen Feu AS Seni</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePotentielENIfeuSolSolImpl extends TypeMenaceImpl implements TypePotentielENIfeuSolSol {
	/**
	 * The default value of the '{@link #getNombreGlobalBatteries() <em>Nombre Global Batteries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGlobalBatteries()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_GLOBAL_BATTERIES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreGlobalBatteries() <em>Nombre Global Batteries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGlobalBatteries()
	 * @generated
	 * @ordered
	 */
	protected long nombreGlobalBatteries = NOMBRE_GLOBAL_BATTERIES_EDEFAULT;

	/**
	 * This is true if the Nombre Global Batteries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreGlobalBatteriesESet;

	/**
	 * The default value of the '{@link #getNombreGlobalTubes() <em>Nombre Global Tubes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGlobalTubes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_GLOBAL_TUBES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreGlobalTubes() <em>Nombre Global Tubes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGlobalTubes()
	 * @generated
	 * @ordered
	 */
	protected long nombreGlobalTubes = NOMBRE_GLOBAL_TUBES_EDEFAULT;

	/**
	 * This is true if the Nombre Global Tubes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreGlobalTubesESet;

	/**
	 * The cached value of the '{@link #getAPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni() <em>APour Quantite Moyen Feu AS Seni Quantite Type Arme Pour Moyen Feu AS Seni</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteTypeArmePourMoyenFeuASSeni> aPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePotentielENIfeuSolSolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePotentielENIfeuSolSol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreGlobalBatteries() {
		return nombreGlobalBatteries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreGlobalBatteries(long newNombreGlobalBatteries) {
		long oldNombreGlobalBatteries = nombreGlobalBatteries;
		nombreGlobalBatteries = newNombreGlobalBatteries;
		boolean oldNombreGlobalBatteriesESet = nombreGlobalBatteriesESet;
		nombreGlobalBatteriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_BATTERIES, oldNombreGlobalBatteries, nombreGlobalBatteries, !oldNombreGlobalBatteriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreGlobalBatteries() {
		long oldNombreGlobalBatteries = nombreGlobalBatteries;
		boolean oldNombreGlobalBatteriesESet = nombreGlobalBatteriesESet;
		nombreGlobalBatteries = NOMBRE_GLOBAL_BATTERIES_EDEFAULT;
		nombreGlobalBatteriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_BATTERIES, oldNombreGlobalBatteries, NOMBRE_GLOBAL_BATTERIES_EDEFAULT, oldNombreGlobalBatteriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreGlobalBatteries() {
		return nombreGlobalBatteriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreGlobalTubes() {
		return nombreGlobalTubes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreGlobalTubes(long newNombreGlobalTubes) {
		long oldNombreGlobalTubes = nombreGlobalTubes;
		nombreGlobalTubes = newNombreGlobalTubes;
		boolean oldNombreGlobalTubesESet = nombreGlobalTubesESet;
		nombreGlobalTubesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_TUBES, oldNombreGlobalTubes, nombreGlobalTubes, !oldNombreGlobalTubesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreGlobalTubes() {
		long oldNombreGlobalTubes = nombreGlobalTubes;
		boolean oldNombreGlobalTubesESet = nombreGlobalTubesESet;
		nombreGlobalTubes = NOMBRE_GLOBAL_TUBES_EDEFAULT;
		nombreGlobalTubesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_TUBES, oldNombreGlobalTubes, NOMBRE_GLOBAL_TUBES_EDEFAULT, oldNombreGlobalTubesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreGlobalTubes() {
		return nombreGlobalTubesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteTypeArmePourMoyenFeuASSeni> getAPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni() {
		if (aPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni == null) {
			aPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni = new EObjectContainmentEList<TypeQuantiteTypeArmePourMoyenFeuASSeni>(TypeQuantiteTypeArmePourMoyenFeuASSeni.class, this, SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__APOUR_QUANTITE_MOYEN_FEU_AS_SENI_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI);
		}
		return aPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__APOUR_QUANTITE_MOYEN_FEU_AS_SENI_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI:
				return ((InternalEList<?>)getAPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_BATTERIES:
				return new Long(getNombreGlobalBatteries());
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_TUBES:
				return new Long(getNombreGlobalTubes());
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__APOUR_QUANTITE_MOYEN_FEU_AS_SENI_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI:
				return getAPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni();
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
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_BATTERIES:
				setNombreGlobalBatteries(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_TUBES:
				setNombreGlobalTubes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__APOUR_QUANTITE_MOYEN_FEU_AS_SENI_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI:
				getAPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni().clear();
				getAPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni().addAll((Collection<? extends TypeQuantiteTypeArmePourMoyenFeuASSeni>)newValue);
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
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_BATTERIES:
				unsetNombreGlobalBatteries();
				return;
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_TUBES:
				unsetNombreGlobalTubes();
				return;
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__APOUR_QUANTITE_MOYEN_FEU_AS_SENI_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI:
				getAPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni().clear();
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
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_BATTERIES:
				return isSetNombreGlobalBatteries();
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__NOMBRE_GLOBAL_TUBES:
				return isSetNombreGlobalTubes();
			case SchemaPackage.TYPE_POTENTIEL_EN_IFEU_SOL_SOL__APOUR_QUANTITE_MOYEN_FEU_AS_SENI_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI:
				return aPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni != null && !aPourQuantiteMoyenFeuASSeniQuantiteTypeArmePourMoyenFeuASSeni.isEmpty();
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
		result.append(" (nombreGlobalBatteries: ");
		if (nombreGlobalBatteriesESet) result.append(nombreGlobalBatteries); else result.append("<unset>");
		result.append(", nombreGlobalTubes: ");
		if (nombreGlobalTubesESet) result.append(nombreGlobalTubes); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePotentielENIfeuSolSolImpl
