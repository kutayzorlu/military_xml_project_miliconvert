/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEvacuationDestination;
import mpia.schema.TypeEvacuationPatients;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Evacuation Patients</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvacuationPatientsImpl#getNbPatientsCouches <em>Nb Patients Couches</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationPatientsImpl#getNbPatientsAssis <em>Nb Patients Assis</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationPatientsImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationPatientsImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationPatientsImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEvacuationPatientsImpl extends EObjectImpl implements TypeEvacuationPatients {
	/**
	 * The default value of the '{@link #getNbPatientsCouches() <em>Nb Patients Couches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPatientsCouches()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_PATIENTS_COUCHES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbPatientsCouches() <em>Nb Patients Couches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPatientsCouches()
	 * @generated
	 * @ordered
	 */
	protected long nbPatientsCouches = NB_PATIENTS_COUCHES_EDEFAULT;

	/**
	 * This is true if the Nb Patients Couches attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbPatientsCouchesESet;

	/**
	 * The default value of the '{@link #getNbPatientsAssis() <em>Nb Patients Assis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPatientsAssis()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_PATIENTS_ASSIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbPatientsAssis() <em>Nb Patients Assis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPatientsAssis()
	 * @generated
	 * @ordered
	 */
	protected long nbPatientsAssis = NB_PATIENTS_ASSIS_EDEFAULT;

	/**
	 * This is true if the Nb Patients Assis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbPatientsAssisESet;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEvacuationDestination DESTINATION_EDEFAULT = TypeDictionaryDicoEvacuationDestination.RETDTY;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEvacuationDestination destination = DESTINATION_EDEFAULT;

	/**
	 * This is true if the Destination attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean destinationESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvacuationPatientsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvacuationPatients();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbPatientsCouches() {
		return nbPatientsCouches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPatientsCouches(long newNbPatientsCouches) {
		long oldNbPatientsCouches = nbPatientsCouches;
		nbPatientsCouches = newNbPatientsCouches;
		boolean oldNbPatientsCouchesESet = nbPatientsCouchesESet;
		nbPatientsCouchesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_COUCHES, oldNbPatientsCouches, nbPatientsCouches, !oldNbPatientsCouchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbPatientsCouches() {
		long oldNbPatientsCouches = nbPatientsCouches;
		boolean oldNbPatientsCouchesESet = nbPatientsCouchesESet;
		nbPatientsCouches = NB_PATIENTS_COUCHES_EDEFAULT;
		nbPatientsCouchesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_COUCHES, oldNbPatientsCouches, NB_PATIENTS_COUCHES_EDEFAULT, oldNbPatientsCouchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbPatientsCouches() {
		return nbPatientsCouchesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbPatientsAssis() {
		return nbPatientsAssis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPatientsAssis(long newNbPatientsAssis) {
		long oldNbPatientsAssis = nbPatientsAssis;
		nbPatientsAssis = newNbPatientsAssis;
		boolean oldNbPatientsAssisESet = nbPatientsAssisESet;
		nbPatientsAssisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_ASSIS, oldNbPatientsAssis, nbPatientsAssis, !oldNbPatientsAssisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbPatientsAssis() {
		long oldNbPatientsAssis = nbPatientsAssis;
		boolean oldNbPatientsAssisESet = nbPatientsAssisESet;
		nbPatientsAssis = NB_PATIENTS_ASSIS_EDEFAULT;
		nbPatientsAssisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_ASSIS, oldNbPatientsAssis, NB_PATIENTS_ASSIS_EDEFAULT, oldNbPatientsAssisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbPatientsAssis() {
		return nbPatientsAssisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEvacuationDestination getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(TypeDictionaryDicoEvacuationDestination newDestination) {
		TypeDictionaryDicoEvacuationDestination oldDestination = destination;
		destination = newDestination == null ? DESTINATION_EDEFAULT : newDestination;
		boolean oldDestinationESet = destinationESet;
		destinationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_PATIENTS__DESTINATION, oldDestination, destination, !oldDestinationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDestination() {
		TypeDictionaryDicoEvacuationDestination oldDestination = destination;
		boolean oldDestinationESet = destinationESet;
		destination = DESTINATION_EDEFAULT;
		destinationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_PATIENTS__DESTINATION, oldDestination, DESTINATION_EDEFAULT, oldDestinationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDestination() {
		return destinationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_PATIENTS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_PATIENTS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_COUCHES:
				return new Long(getNbPatientsCouches());
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_ASSIS:
				return new Long(getNbPatientsAssis());
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__DESTINATION:
				return getDestination();
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__CE:
				return getCE();
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
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_COUCHES:
				setNbPatientsCouches(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_ASSIS:
				setNbPatientsAssis(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__DESTINATION:
				setDestination((TypeDictionaryDicoEvacuationDestination)newValue);
				return;
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_COUCHES:
				unsetNbPatientsCouches();
				return;
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_ASSIS:
				unsetNbPatientsAssis();
				return;
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__DESTINATION:
				unsetDestination();
				return;
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_COUCHES:
				return isSetNbPatientsCouches();
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__NB_PATIENTS_ASSIS:
				return isSetNbPatientsAssis();
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__DESTINATION:
				return isSetDestination();
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EVACUATION_PATIENTS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (nbPatientsCouches: ");
		if (nbPatientsCouchesESet) result.append(nbPatientsCouches); else result.append("<unset>");
		result.append(", nbPatientsAssis: ");
		if (nbPatientsAssisESet) result.append(nbPatientsAssis); else result.append("<unset>");
		result.append(", destination: ");
		if (destinationESet) result.append(destination); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEvacuationPatientsImpl
