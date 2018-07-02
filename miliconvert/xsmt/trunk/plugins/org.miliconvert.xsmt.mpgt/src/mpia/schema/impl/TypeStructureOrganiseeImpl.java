/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeStructureOrganisee;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Structure Organisee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeStructureOrganiseeImpl#getNombreEmployes <em>Nombre Employes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeStructureOrganiseeImpl#getNombreAdherents <em>Nombre Adherents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeStructureOrganiseeImpl extends TypeEntiteOrganisationnelleImpl implements TypeStructureOrganisee {
	/**
	 * The default value of the '{@link #getNombreEmployes() <em>Nombre Employes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEmployes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_EMPLOYES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEmployes() <em>Nombre Employes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEmployes()
	 * @generated
	 * @ordered
	 */
	protected long nombreEmployes = NOMBRE_EMPLOYES_EDEFAULT;

	/**
	 * This is true if the Nombre Employes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEmployesESet;

	/**
	 * The default value of the '{@link #getNombreAdherents() <em>Nombre Adherents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAdherents()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ADHERENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreAdherents() <em>Nombre Adherents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAdherents()
	 * @generated
	 * @ordered
	 */
	protected long nombreAdherents = NOMBRE_ADHERENTS_EDEFAULT;

	/**
	 * This is true if the Nombre Adherents attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreAdherentsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeStructureOrganiseeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeStructureOrganisee();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEmployes() {
		return nombreEmployes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEmployes(long newNombreEmployes) {
		long oldNombreEmployes = nombreEmployes;
		nombreEmployes = newNombreEmployes;
		boolean oldNombreEmployesESet = nombreEmployesESet;
		nombreEmployesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_EMPLOYES, oldNombreEmployes, nombreEmployes, !oldNombreEmployesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEmployes() {
		long oldNombreEmployes = nombreEmployes;
		boolean oldNombreEmployesESet = nombreEmployesESet;
		nombreEmployes = NOMBRE_EMPLOYES_EDEFAULT;
		nombreEmployesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_EMPLOYES, oldNombreEmployes, NOMBRE_EMPLOYES_EDEFAULT, oldNombreEmployesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEmployes() {
		return nombreEmployesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreAdherents() {
		return nombreAdherents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAdherents(long newNombreAdherents) {
		long oldNombreAdherents = nombreAdherents;
		nombreAdherents = newNombreAdherents;
		boolean oldNombreAdherentsESet = nombreAdherentsESet;
		nombreAdherentsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_ADHERENTS, oldNombreAdherents, nombreAdherents, !oldNombreAdherentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreAdherents() {
		long oldNombreAdherents = nombreAdherents;
		boolean oldNombreAdherentsESet = nombreAdherentsESet;
		nombreAdherents = NOMBRE_ADHERENTS_EDEFAULT;
		nombreAdherentsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_ADHERENTS, oldNombreAdherents, NOMBRE_ADHERENTS_EDEFAULT, oldNombreAdherentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreAdherents() {
		return nombreAdherentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_EMPLOYES:
				return new Long(getNombreEmployes());
			case SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_ADHERENTS:
				return new Long(getNombreAdherents());
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
			case SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_EMPLOYES:
				setNombreEmployes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_ADHERENTS:
				setNombreAdherents(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_EMPLOYES:
				unsetNombreEmployes();
				return;
			case SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_ADHERENTS:
				unsetNombreAdherents();
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
			case SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_EMPLOYES:
				return isSetNombreEmployes();
			case SchemaPackage.TYPE_STRUCTURE_ORGANISEE__NOMBRE_ADHERENTS:
				return isSetNombreAdherents();
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
		result.append(" (nombreEmployes: ");
		if (nombreEmployesESet) result.append(nombreEmployes); else result.append("<unset>");
		result.append(", nombreAdherents: ");
		if (nombreAdherentsESet) result.append(nombreAdherents); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeStructureOrganiseeImpl
