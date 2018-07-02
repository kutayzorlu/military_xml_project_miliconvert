/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCharnier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Charnier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCharnierImpl#getNumeroIdentification <em>Numero Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCharnierImpl#getNombreIndividus <em>Nombre Individus</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCharnierImpl#getNombreFosses <em>Nombre Fosses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCharnierImpl extends TypeSiteImpl implements TypeCharnier {
	/**
	 * The default value of the '{@link #getNumeroIdentification() <em>Numero Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroIdentification() <em>Numero Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroIdentification()
	 * @generated
	 * @ordered
	 */
	protected String numeroIdentification = NUMERO_IDENTIFICATION_EDEFAULT;

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
	 * The default value of the '{@link #getNombreFosses() <em>Nombre Fosses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreFosses()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_FOSSES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreFosses() <em>Nombre Fosses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreFosses()
	 * @generated
	 * @ordered
	 */
	protected long nombreFosses = NOMBRE_FOSSES_EDEFAULT;

	/**
	 * This is true if the Nombre Fosses attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreFossesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCharnierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCharnier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroIdentification() {
		return numeroIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroIdentification(String newNumeroIdentification) {
		String oldNumeroIdentification = numeroIdentification;
		numeroIdentification = newNumeroIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARNIER__NUMERO_IDENTIFICATION, oldNumeroIdentification, numeroIdentification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARNIER__NOMBRE_INDIVIDUS, oldNombreIndividus, nombreIndividus, !oldNombreIndividusESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHARNIER__NOMBRE_INDIVIDUS, oldNombreIndividus, NOMBRE_INDIVIDUS_EDEFAULT, oldNombreIndividusESet));
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
	public long getNombreFosses() {
		return nombreFosses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreFosses(long newNombreFosses) {
		long oldNombreFosses = nombreFosses;
		nombreFosses = newNombreFosses;
		boolean oldNombreFossesESet = nombreFossesESet;
		nombreFossesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARNIER__NOMBRE_FOSSES, oldNombreFosses, nombreFosses, !oldNombreFossesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreFosses() {
		long oldNombreFosses = nombreFosses;
		boolean oldNombreFossesESet = nombreFossesESet;
		nombreFosses = NOMBRE_FOSSES_EDEFAULT;
		nombreFossesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHARNIER__NOMBRE_FOSSES, oldNombreFosses, NOMBRE_FOSSES_EDEFAULT, oldNombreFossesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreFosses() {
		return nombreFossesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CHARNIER__NUMERO_IDENTIFICATION:
				return getNumeroIdentification();
			case SchemaPackage.TYPE_CHARNIER__NOMBRE_INDIVIDUS:
				return new Long(getNombreIndividus());
			case SchemaPackage.TYPE_CHARNIER__NOMBRE_FOSSES:
				return new Long(getNombreFosses());
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
			case SchemaPackage.TYPE_CHARNIER__NUMERO_IDENTIFICATION:
				setNumeroIdentification((String)newValue);
				return;
			case SchemaPackage.TYPE_CHARNIER__NOMBRE_INDIVIDUS:
				setNombreIndividus(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHARNIER__NOMBRE_FOSSES:
				setNombreFosses(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_CHARNIER__NUMERO_IDENTIFICATION:
				setNumeroIdentification(NUMERO_IDENTIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CHARNIER__NOMBRE_INDIVIDUS:
				unsetNombreIndividus();
				return;
			case SchemaPackage.TYPE_CHARNIER__NOMBRE_FOSSES:
				unsetNombreFosses();
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
			case SchemaPackage.TYPE_CHARNIER__NUMERO_IDENTIFICATION:
				return NUMERO_IDENTIFICATION_EDEFAULT == null ? numeroIdentification != null : !NUMERO_IDENTIFICATION_EDEFAULT.equals(numeroIdentification);
			case SchemaPackage.TYPE_CHARNIER__NOMBRE_INDIVIDUS:
				return isSetNombreIndividus();
			case SchemaPackage.TYPE_CHARNIER__NOMBRE_FOSSES:
				return isSetNombreFosses();
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
		result.append(" (numeroIdentification: ");
		result.append(numeroIdentification);
		result.append(", nombreIndividus: ");
		if (nombreIndividusESet) result.append(nombreIndividus); else result.append("<unset>");
		result.append(", nombreFosses: ");
		if (nombreFossesESet) result.append(nombreFosses); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCharnierImpl
