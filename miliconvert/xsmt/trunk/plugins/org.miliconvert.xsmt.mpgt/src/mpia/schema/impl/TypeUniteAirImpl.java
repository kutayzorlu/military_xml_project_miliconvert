/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeUniteAir;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Unite Air</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUniteAirImpl#getNombreSortiesAeronefsExecutees <em>Nombre Sorties Aeronefs Executees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteAirImpl#getNombreSortiesAeronefsAttendues <em>Nombre Sorties Aeronefs Attendues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUniteAirImpl extends EObjectImpl implements TypeUniteAir {
	/**
	 * The default value of the '{@link #getNombreSortiesAeronefsExecutees() <em>Nombre Sorties Aeronefs Executees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSortiesAeronefsExecutees()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_SORTIES_AERONEFS_EXECUTEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreSortiesAeronefsExecutees() <em>Nombre Sorties Aeronefs Executees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSortiesAeronefsExecutees()
	 * @generated
	 * @ordered
	 */
	protected long nombreSortiesAeronefsExecutees = NOMBRE_SORTIES_AERONEFS_EXECUTEES_EDEFAULT;

	/**
	 * This is true if the Nombre Sorties Aeronefs Executees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreSortiesAeronefsExecuteesESet;

	/**
	 * The default value of the '{@link #getNombreSortiesAeronefsAttendues() <em>Nombre Sorties Aeronefs Attendues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSortiesAeronefsAttendues()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_SORTIES_AERONEFS_ATTENDUES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreSortiesAeronefsAttendues() <em>Nombre Sorties Aeronefs Attendues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSortiesAeronefsAttendues()
	 * @generated
	 * @ordered
	 */
	protected long nombreSortiesAeronefsAttendues = NOMBRE_SORTIES_AERONEFS_ATTENDUES_EDEFAULT;

	/**
	 * This is true if the Nombre Sorties Aeronefs Attendues attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreSortiesAeronefsAttenduesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUniteAirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUniteAir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreSortiesAeronefsExecutees() {
		return nombreSortiesAeronefsExecutees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreSortiesAeronefsExecutees(long newNombreSortiesAeronefsExecutees) {
		long oldNombreSortiesAeronefsExecutees = nombreSortiesAeronefsExecutees;
		nombreSortiesAeronefsExecutees = newNombreSortiesAeronefsExecutees;
		boolean oldNombreSortiesAeronefsExecuteesESet = nombreSortiesAeronefsExecuteesESet;
		nombreSortiesAeronefsExecuteesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_EXECUTEES, oldNombreSortiesAeronefsExecutees, nombreSortiesAeronefsExecutees, !oldNombreSortiesAeronefsExecuteesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreSortiesAeronefsExecutees() {
		long oldNombreSortiesAeronefsExecutees = nombreSortiesAeronefsExecutees;
		boolean oldNombreSortiesAeronefsExecuteesESet = nombreSortiesAeronefsExecuteesESet;
		nombreSortiesAeronefsExecutees = NOMBRE_SORTIES_AERONEFS_EXECUTEES_EDEFAULT;
		nombreSortiesAeronefsExecuteesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_EXECUTEES, oldNombreSortiesAeronefsExecutees, NOMBRE_SORTIES_AERONEFS_EXECUTEES_EDEFAULT, oldNombreSortiesAeronefsExecuteesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreSortiesAeronefsExecutees() {
		return nombreSortiesAeronefsExecuteesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreSortiesAeronefsAttendues() {
		return nombreSortiesAeronefsAttendues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreSortiesAeronefsAttendues(long newNombreSortiesAeronefsAttendues) {
		long oldNombreSortiesAeronefsAttendues = nombreSortiesAeronefsAttendues;
		nombreSortiesAeronefsAttendues = newNombreSortiesAeronefsAttendues;
		boolean oldNombreSortiesAeronefsAttenduesESet = nombreSortiesAeronefsAttenduesESet;
		nombreSortiesAeronefsAttenduesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_ATTENDUES, oldNombreSortiesAeronefsAttendues, nombreSortiesAeronefsAttendues, !oldNombreSortiesAeronefsAttenduesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreSortiesAeronefsAttendues() {
		long oldNombreSortiesAeronefsAttendues = nombreSortiesAeronefsAttendues;
		boolean oldNombreSortiesAeronefsAttenduesESet = nombreSortiesAeronefsAttenduesESet;
		nombreSortiesAeronefsAttendues = NOMBRE_SORTIES_AERONEFS_ATTENDUES_EDEFAULT;
		nombreSortiesAeronefsAttenduesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_ATTENDUES, oldNombreSortiesAeronefsAttendues, NOMBRE_SORTIES_AERONEFS_ATTENDUES_EDEFAULT, oldNombreSortiesAeronefsAttenduesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreSortiesAeronefsAttendues() {
		return nombreSortiesAeronefsAttenduesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_EXECUTEES:
				return new Long(getNombreSortiesAeronefsExecutees());
			case SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_ATTENDUES:
				return new Long(getNombreSortiesAeronefsAttendues());
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
			case SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_EXECUTEES:
				setNombreSortiesAeronefsExecutees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_ATTENDUES:
				setNombreSortiesAeronefsAttendues(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_EXECUTEES:
				unsetNombreSortiesAeronefsExecutees();
				return;
			case SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_ATTENDUES:
				unsetNombreSortiesAeronefsAttendues();
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
			case SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_EXECUTEES:
				return isSetNombreSortiesAeronefsExecutees();
			case SchemaPackage.TYPE_UNITE_AIR__NOMBRE_SORTIES_AERONEFS_ATTENDUES:
				return isSetNombreSortiesAeronefsAttendues();
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
		result.append(" (nombreSortiesAeronefsExecutees: ");
		if (nombreSortiesAeronefsExecuteesESet) result.append(nombreSortiesAeronefsExecutees); else result.append("<unset>");
		result.append(", nombreSortiesAeronefsAttendues: ");
		if (nombreSortiesAeronefsAttenduesESet) result.append(nombreSortiesAeronefsAttendues); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeUniteAirImpl
