/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDoseAbsorbee;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite;
import mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique;
import mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelEtatSante;
import mpia.schema.TypeEtatOperationnelPersonnel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Personnel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelPersonnelImpl#getDisponibilite <em>Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelPersonnelImpl#getEtatPhysique <em>Etat Physique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelPersonnelImpl#getEtatSante <em>Etat Sante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelPersonnelImpl#getDoseRadiation <em>Dose Radiation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelPersonnelImpl#isReserve <em>Reserve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelPersonnelImpl extends TypeEtatOperationnelImpl implements TypeEtatOperationnelPersonnel {
	/**
	 * The default value of the '{@link #getDisponibilite() <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite DISPONIBILITE_EDEFAULT = TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite.ABS;

	/**
	 * The cached value of the '{@link #getDisponibilite() <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite disponibilite = DISPONIBILITE_EDEFAULT;

	/**
	 * This is true if the Disponibilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteESet;

	/**
	 * The default value of the '{@link #getEtatPhysique() <em>Etat Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPhysique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique ETAT_PHYSIQUE_EDEFAULT = TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique.FT;

	/**
	 * The cached value of the '{@link #getEtatPhysique() <em>Etat Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPhysique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique etatPhysique = ETAT_PHYSIQUE_EDEFAULT;

	/**
	 * This is true if the Etat Physique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatPhysiqueESet;

	/**
	 * The default value of the '{@link #getEtatSante() <em>Etat Sante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSante()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelPersonnelEtatSante ETAT_SANTE_EDEFAULT = TypeDictionaryDicoEtatOperationnelPersonnelEtatSante.INJRD;

	/**
	 * The cached value of the '{@link #getEtatSante() <em>Etat Sante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSante()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelPersonnelEtatSante etatSante = ETAT_SANTE_EDEFAULT;

	/**
	 * This is true if the Etat Sante attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatSanteESet;

	/**
	 * The cached value of the '{@link #getDoseRadiation() <em>Dose Radiation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseRadiation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDoseAbsorbee doseRadiation;

	/**
	 * The default value of the '{@link #isReserve() <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserve()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESERVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReserve() <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserve()
	 * @generated
	 * @ordered
	 */
	protected boolean reserve = RESERVE_EDEFAULT;

	/**
	 * This is true if the Reserve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reserveESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelPersonnelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelPersonnel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite getDisponibilite() {
		return disponibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibilite(TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite newDisponibilite) {
		TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite oldDisponibilite = disponibilite;
		disponibilite = newDisponibilite == null ? DISPONIBILITE_EDEFAULT : newDisponibilite;
		boolean oldDisponibiliteESet = disponibiliteESet;
		disponibiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DISPONIBILITE, oldDisponibilite, disponibilite, !oldDisponibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibilite() {
		TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite oldDisponibilite = disponibilite;
		boolean oldDisponibiliteESet = disponibiliteESet;
		disponibilite = DISPONIBILITE_EDEFAULT;
		disponibiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DISPONIBILITE, oldDisponibilite, DISPONIBILITE_EDEFAULT, oldDisponibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibilite() {
		return disponibiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique getEtatPhysique() {
		return etatPhysique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatPhysique(TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique newEtatPhysique) {
		TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique oldEtatPhysique = etatPhysique;
		etatPhysique = newEtatPhysique == null ? ETAT_PHYSIQUE_EDEFAULT : newEtatPhysique;
		boolean oldEtatPhysiqueESet = etatPhysiqueESet;
		etatPhysiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_PHYSIQUE, oldEtatPhysique, etatPhysique, !oldEtatPhysiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatPhysique() {
		TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique oldEtatPhysique = etatPhysique;
		boolean oldEtatPhysiqueESet = etatPhysiqueESet;
		etatPhysique = ETAT_PHYSIQUE_EDEFAULT;
		etatPhysiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_PHYSIQUE, oldEtatPhysique, ETAT_PHYSIQUE_EDEFAULT, oldEtatPhysiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatPhysique() {
		return etatPhysiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelPersonnelEtatSante getEtatSante() {
		return etatSante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatSante(TypeDictionaryDicoEtatOperationnelPersonnelEtatSante newEtatSante) {
		TypeDictionaryDicoEtatOperationnelPersonnelEtatSante oldEtatSante = etatSante;
		etatSante = newEtatSante == null ? ETAT_SANTE_EDEFAULT : newEtatSante;
		boolean oldEtatSanteESet = etatSanteESet;
		etatSanteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_SANTE, oldEtatSante, etatSante, !oldEtatSanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatSante() {
		TypeDictionaryDicoEtatOperationnelPersonnelEtatSante oldEtatSante = etatSante;
		boolean oldEtatSanteESet = etatSanteESet;
		etatSante = ETAT_SANTE_EDEFAULT;
		etatSanteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_SANTE, oldEtatSante, ETAT_SANTE_EDEFAULT, oldEtatSanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatSante() {
		return etatSanteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDoseAbsorbee getDoseRadiation() {
		return doseRadiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseRadiation(TypeDataTypeDoseAbsorbee newDoseRadiation, NotificationChain msgs) {
		TypeDataTypeDoseAbsorbee oldDoseRadiation = doseRadiation;
		doseRadiation = newDoseRadiation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DOSE_RADIATION, oldDoseRadiation, newDoseRadiation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseRadiation(TypeDataTypeDoseAbsorbee newDoseRadiation) {
		if (newDoseRadiation != doseRadiation) {
			NotificationChain msgs = null;
			if (doseRadiation != null)
				msgs = ((InternalEObject)doseRadiation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DOSE_RADIATION, null, msgs);
			if (newDoseRadiation != null)
				msgs = ((InternalEObject)newDoseRadiation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DOSE_RADIATION, null, msgs);
			msgs = basicSetDoseRadiation(newDoseRadiation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DOSE_RADIATION, newDoseRadiation, newDoseRadiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReserve() {
		return reserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserve(boolean newReserve) {
		boolean oldReserve = reserve;
		reserve = newReserve;
		boolean oldReserveESet = reserveESet;
		reserveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__RESERVE, oldReserve, reserve, !oldReserveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReserve() {
		boolean oldReserve = reserve;
		boolean oldReserveESet = reserveESet;
		reserve = RESERVE_EDEFAULT;
		reserveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__RESERVE, oldReserve, RESERVE_EDEFAULT, oldReserveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReserve() {
		return reserveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DOSE_RADIATION:
				return basicSetDoseRadiation(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DISPONIBILITE:
				return getDisponibilite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_PHYSIQUE:
				return getEtatPhysique();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_SANTE:
				return getEtatSante();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DOSE_RADIATION:
				return getDoseRadiation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__RESERVE:
				return isReserve() ? Boolean.TRUE : Boolean.FALSE;
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DISPONIBILITE:
				setDisponibilite((TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_PHYSIQUE:
				setEtatPhysique((TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_SANTE:
				setEtatSante((TypeDictionaryDicoEtatOperationnelPersonnelEtatSante)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DOSE_RADIATION:
				setDoseRadiation((TypeDataTypeDoseAbsorbee)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__RESERVE:
				setReserve(((Boolean)newValue).booleanValue());
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DISPONIBILITE:
				unsetDisponibilite();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_PHYSIQUE:
				unsetEtatPhysique();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_SANTE:
				unsetEtatSante();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DOSE_RADIATION:
				setDoseRadiation((TypeDataTypeDoseAbsorbee)null);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__RESERVE:
				unsetReserve();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DISPONIBILITE:
				return isSetDisponibilite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_PHYSIQUE:
				return isSetEtatPhysique();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__ETAT_SANTE:
				return isSetEtatSante();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__DOSE_RADIATION:
				return doseRadiation != null;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_PERSONNEL__RESERVE:
				return isSetReserve();
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
		result.append(" (disponibilite: ");
		if (disponibiliteESet) result.append(disponibilite); else result.append("<unset>");
		result.append(", etatPhysique: ");
		if (etatPhysiqueESet) result.append(etatPhysique); else result.append("<unset>");
		result.append(", etatSante: ");
		if (etatSanteESet) result.append(etatSante); else result.append("<unset>");
		result.append(", reserve: ");
		if (reserveESet) result.append(reserve); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelPersonnelImpl
