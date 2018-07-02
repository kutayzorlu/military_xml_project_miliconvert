/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBlessesParPeriode;
import mpia.schema.TypeConsommableSante;
import mpia.schema.TypeEtatOperationnelMedical;
import mpia.schema.TypeEvacuationPatients;
import mpia.schema.TypeEvacuationsParPeriode;
import mpia.schema.TypeOccupationLits;
import mpia.schema.TypePertesParPeriode;
import mpia.schema.TypeTraitementPatients;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Medical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMedicalImpl#getChirurgieRestanteJ <em>Chirurgie Restante J</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMedicalImpl#getConsommablesSanteConsommableSante <em>Consommables Sante Consommable Sante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMedicalImpl#getACommeBlessesParPeriodeBlessesParPeriode <em>AComme Blesses Par Periode Blesses Par Periode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMedicalImpl#getACommeEvacuationPatientsEvacuationPatients <em>AComme Evacuation Patients Evacuation Patients</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMedicalImpl#getACommeEvacuationParPeriodeEvacuationsParPeriode <em>AComme Evacuation Par Periode Evacuations Par Periode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMedicalImpl#getACommeOccupationLitsOccupationLits <em>AComme Occupation Lits Occupation Lits</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMedicalImpl#getACommePertesParPeriodePertesParPeriode <em>AComme Pertes Par Periode Pertes Par Periode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMedicalImpl#getACommeTraitementPatientsTraitementPatients <em>AComme Traitement Patients Traitement Patients</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelMedicalImpl extends EObjectImpl implements TypeEtatOperationnelMedical {
	/**
	 * The cached value of the '{@link #getChirurgieRestanteJ() <em>Chirurgie Restante J</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChirurgieRestanteJ()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree chirurgieRestanteJ;

	/**
	 * The cached value of the '{@link #getConsommablesSanteConsommableSante() <em>Consommables Sante Consommable Sante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommablesSanteConsommableSante()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConsommableSante> consommablesSanteConsommableSante;

	/**
	 * The cached value of the '{@link #getACommeBlessesParPeriodeBlessesParPeriode() <em>AComme Blesses Par Periode Blesses Par Periode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeBlessesParPeriodeBlessesParPeriode()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBlessesParPeriode> aCommeBlessesParPeriodeBlessesParPeriode;

	/**
	 * The cached value of the '{@link #getACommeEvacuationPatientsEvacuationPatients() <em>AComme Evacuation Patients Evacuation Patients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeEvacuationPatientsEvacuationPatients()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEvacuationPatients> aCommeEvacuationPatientsEvacuationPatients;

	/**
	 * The cached value of the '{@link #getACommeEvacuationParPeriodeEvacuationsParPeriode() <em>AComme Evacuation Par Periode Evacuations Par Periode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeEvacuationParPeriodeEvacuationsParPeriode()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEvacuationsParPeriode> aCommeEvacuationParPeriodeEvacuationsParPeriode;

	/**
	 * The cached value of the '{@link #getACommeOccupationLitsOccupationLits() <em>AComme Occupation Lits Occupation Lits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeOccupationLitsOccupationLits()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeOccupationLits> aCommeOccupationLitsOccupationLits;

	/**
	 * The cached value of the '{@link #getACommePertesParPeriodePertesParPeriode() <em>AComme Pertes Par Periode Pertes Par Periode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePertesParPeriodePertesParPeriode()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePertesParPeriode> aCommePertesParPeriodePertesParPeriode;

	/**
	 * The cached value of the '{@link #getACommeTraitementPatientsTraitementPatients() <em>AComme Traitement Patients Traitement Patients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTraitementPatientsTraitementPatients()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTraitementPatients> aCommeTraitementPatientsTraitementPatients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelMedicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelMedical();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getChirurgieRestanteJ() {
		return chirurgieRestanteJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChirurgieRestanteJ(TypeDataTypeDuree newChirurgieRestanteJ, NotificationChain msgs) {
		TypeDataTypeDuree oldChirurgieRestanteJ = chirurgieRestanteJ;
		chirurgieRestanteJ = newChirurgieRestanteJ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CHIRURGIE_RESTANTE_J, oldChirurgieRestanteJ, newChirurgieRestanteJ);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChirurgieRestanteJ(TypeDataTypeDuree newChirurgieRestanteJ) {
		if (newChirurgieRestanteJ != chirurgieRestanteJ) {
			NotificationChain msgs = null;
			if (chirurgieRestanteJ != null)
				msgs = ((InternalEObject)chirurgieRestanteJ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CHIRURGIE_RESTANTE_J, null, msgs);
			if (newChirurgieRestanteJ != null)
				msgs = ((InternalEObject)newChirurgieRestanteJ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CHIRURGIE_RESTANTE_J, null, msgs);
			msgs = basicSetChirurgieRestanteJ(newChirurgieRestanteJ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CHIRURGIE_RESTANTE_J, newChirurgieRestanteJ, newChirurgieRestanteJ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsommableSante> getConsommablesSanteConsommableSante() {
		if (consommablesSanteConsommableSante == null) {
			consommablesSanteConsommableSante = new EObjectContainmentEList<TypeConsommableSante>(TypeConsommableSante.class, this, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE);
		}
		return consommablesSanteConsommableSante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBlessesParPeriode> getACommeBlessesParPeriodeBlessesParPeriode() {
		if (aCommeBlessesParPeriodeBlessesParPeriode == null) {
			aCommeBlessesParPeriodeBlessesParPeriode = new EObjectContainmentEList<TypeBlessesParPeriode>(TypeBlessesParPeriode.class, this, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE);
		}
		return aCommeBlessesParPeriodeBlessesParPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvacuationPatients> getACommeEvacuationPatientsEvacuationPatients() {
		if (aCommeEvacuationPatientsEvacuationPatients == null) {
			aCommeEvacuationPatientsEvacuationPatients = new EObjectContainmentEList<TypeEvacuationPatients>(TypeEvacuationPatients.class, this, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PATIENTS_EVACUATION_PATIENTS);
		}
		return aCommeEvacuationPatientsEvacuationPatients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvacuationsParPeriode> getACommeEvacuationParPeriodeEvacuationsParPeriode() {
		if (aCommeEvacuationParPeriodeEvacuationsParPeriode == null) {
			aCommeEvacuationParPeriodeEvacuationsParPeriode = new EObjectContainmentEList<TypeEvacuationsParPeriode>(TypeEvacuationsParPeriode.class, this, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PAR_PERIODE_EVACUATIONS_PAR_PERIODE);
		}
		return aCommeEvacuationParPeriodeEvacuationsParPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeOccupationLits> getACommeOccupationLitsOccupationLits() {
		if (aCommeOccupationLitsOccupationLits == null) {
			aCommeOccupationLitsOccupationLits = new EObjectContainmentEList<TypeOccupationLits>(TypeOccupationLits.class, this, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_OCCUPATION_LITS_OCCUPATION_LITS);
		}
		return aCommeOccupationLitsOccupationLits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePertesParPeriode> getACommePertesParPeriodePertesParPeriode() {
		if (aCommePertesParPeriodePertesParPeriode == null) {
			aCommePertesParPeriodePertesParPeriode = new EObjectContainmentEList<TypePertesParPeriode>(TypePertesParPeriode.class, this, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_PERTES_PAR_PERIODE_PERTES_PAR_PERIODE);
		}
		return aCommePertesParPeriodePertesParPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTraitementPatients> getACommeTraitementPatientsTraitementPatients() {
		if (aCommeTraitementPatientsTraitementPatients == null) {
			aCommeTraitementPatientsTraitementPatients = new EObjectContainmentEList<TypeTraitementPatients>(TypeTraitementPatients.class, this, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_TRAITEMENT_PATIENTS_TRAITEMENT_PATIENTS);
		}
		return aCommeTraitementPatientsTraitementPatients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CHIRURGIE_RESTANTE_J:
				return basicSetChirurgieRestanteJ(null, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				return ((InternalEList<?>)getConsommablesSanteConsommableSante()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				return ((InternalEList<?>)getACommeBlessesParPeriodeBlessesParPeriode()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				return ((InternalEList<?>)getACommeEvacuationPatientsEvacuationPatients()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				return ((InternalEList<?>)getACommeEvacuationParPeriodeEvacuationsParPeriode()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_OCCUPATION_LITS_OCCUPATION_LITS:
				return ((InternalEList<?>)getACommeOccupationLitsOccupationLits()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				return ((InternalEList<?>)getACommePertesParPeriodePertesParPeriode()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_TRAITEMENT_PATIENTS_TRAITEMENT_PATIENTS:
				return ((InternalEList<?>)getACommeTraitementPatientsTraitementPatients()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CHIRURGIE_RESTANTE_J:
				return getChirurgieRestanteJ();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				return getConsommablesSanteConsommableSante();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				return getACommeBlessesParPeriodeBlessesParPeriode();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				return getACommeEvacuationPatientsEvacuationPatients();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				return getACommeEvacuationParPeriodeEvacuationsParPeriode();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_OCCUPATION_LITS_OCCUPATION_LITS:
				return getACommeOccupationLitsOccupationLits();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				return getACommePertesParPeriodePertesParPeriode();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_TRAITEMENT_PATIENTS_TRAITEMENT_PATIENTS:
				return getACommeTraitementPatientsTraitementPatients();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CHIRURGIE_RESTANTE_J:
				setChirurgieRestanteJ((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				getConsommablesSanteConsommableSante().clear();
				getConsommablesSanteConsommableSante().addAll((Collection<? extends TypeConsommableSante>)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				getACommeBlessesParPeriodeBlessesParPeriode().clear();
				getACommeBlessesParPeriodeBlessesParPeriode().addAll((Collection<? extends TypeBlessesParPeriode>)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				getACommeEvacuationPatientsEvacuationPatients().clear();
				getACommeEvacuationPatientsEvacuationPatients().addAll((Collection<? extends TypeEvacuationPatients>)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				getACommeEvacuationParPeriodeEvacuationsParPeriode().clear();
				getACommeEvacuationParPeriodeEvacuationsParPeriode().addAll((Collection<? extends TypeEvacuationsParPeriode>)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_OCCUPATION_LITS_OCCUPATION_LITS:
				getACommeOccupationLitsOccupationLits().clear();
				getACommeOccupationLitsOccupationLits().addAll((Collection<? extends TypeOccupationLits>)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				getACommePertesParPeriodePertesParPeriode().clear();
				getACommePertesParPeriodePertesParPeriode().addAll((Collection<? extends TypePertesParPeriode>)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_TRAITEMENT_PATIENTS_TRAITEMENT_PATIENTS:
				getACommeTraitementPatientsTraitementPatients().clear();
				getACommeTraitementPatientsTraitementPatients().addAll((Collection<? extends TypeTraitementPatients>)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CHIRURGIE_RESTANTE_J:
				setChirurgieRestanteJ((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				getConsommablesSanteConsommableSante().clear();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				getACommeBlessesParPeriodeBlessesParPeriode().clear();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				getACommeEvacuationPatientsEvacuationPatients().clear();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				getACommeEvacuationParPeriodeEvacuationsParPeriode().clear();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_OCCUPATION_LITS_OCCUPATION_LITS:
				getACommeOccupationLitsOccupationLits().clear();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				getACommePertesParPeriodePertesParPeriode().clear();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_TRAITEMENT_PATIENTS_TRAITEMENT_PATIENTS:
				getACommeTraitementPatientsTraitementPatients().clear();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CHIRURGIE_RESTANTE_J:
				return chirurgieRestanteJ != null;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				return consommablesSanteConsommableSante != null && !consommablesSanteConsommableSante.isEmpty();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				return aCommeBlessesParPeriodeBlessesParPeriode != null && !aCommeBlessesParPeriodeBlessesParPeriode.isEmpty();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				return aCommeEvacuationPatientsEvacuationPatients != null && !aCommeEvacuationPatientsEvacuationPatients.isEmpty();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_EVACUATION_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				return aCommeEvacuationParPeriodeEvacuationsParPeriode != null && !aCommeEvacuationParPeriodeEvacuationsParPeriode.isEmpty();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_OCCUPATION_LITS_OCCUPATION_LITS:
				return aCommeOccupationLitsOccupationLits != null && !aCommeOccupationLitsOccupationLits.isEmpty();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				return aCommePertesParPeriodePertesParPeriode != null && !aCommePertesParPeriodePertesParPeriode.isEmpty();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MEDICAL__ACOMME_TRAITEMENT_PATIENTS_TRAITEMENT_PATIENTS:
				return aCommeTraitementPatientsTraitementPatients != null && !aCommeTraitementPatientsTraitementPatients.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeEtatOperationnelMedicalImpl
