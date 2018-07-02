/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiqueGroupeIndividus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Caracteristique Groupe Individus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueGroupeIndividusImpl#getNombreIndividus <em>Nombre Individus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaracteristiqueGroupeIndividusImpl extends EObjectImpl implements TypeCaracteristiqueGroupeIndividus {
	/**
	 * The default value of the '{@link #getNombreIndividus() <em>Nombre Individus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreIndividus()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_INDIVIDUS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreIndividus() <em>Nombre Individus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreIndividus()
	 * @generated
	 * @ordered
	 */
	protected long nombreIndividus = NOMBRE_INDIVIDUS_EDEFAULT;

	/**
	 * This is true if the Nombre Individus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreIndividusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCaracteristiqueGroupeIndividusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaracteristiqueGroupeIndividus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreIndividus() {
		return nombreIndividus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreIndividus(long newNombreIndividus) {
		long oldNombreIndividus = nombreIndividus;
		nombreIndividus = newNombreIndividus;
		boolean oldNombreIndividusESet = nombreIndividusESet;
		nombreIndividusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_GROUPE_INDIVIDUS__NOMBRE_INDIVIDUS, oldNombreIndividus, nombreIndividus, !oldNombreIndividusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreIndividus() {
		long oldNombreIndividus = nombreIndividus;
		boolean oldNombreIndividusESet = nombreIndividusESet;
		nombreIndividus = NOMBRE_INDIVIDUS_EDEFAULT;
		nombreIndividusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_GROUPE_INDIVIDUS__NOMBRE_INDIVIDUS, oldNombreIndividus, NOMBRE_INDIVIDUS_EDEFAULT, oldNombreIndividusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreIndividus() {
		return nombreIndividusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CARACTERISTIQUE_GROUPE_INDIVIDUS__NOMBRE_INDIVIDUS:
				return new Long(getNombreIndividus());
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_GROUPE_INDIVIDUS__NOMBRE_INDIVIDUS:
				setNombreIndividus(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_GROUPE_INDIVIDUS__NOMBRE_INDIVIDUS:
				unsetNombreIndividus();
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_GROUPE_INDIVIDUS__NOMBRE_INDIVIDUS:
				return isSetNombreIndividus();
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
		result.append(" (nombreIndividus: ");
		if (nombreIndividusESet) result.append(nombreIndividus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCaracteristiqueGroupeIndividusImpl
