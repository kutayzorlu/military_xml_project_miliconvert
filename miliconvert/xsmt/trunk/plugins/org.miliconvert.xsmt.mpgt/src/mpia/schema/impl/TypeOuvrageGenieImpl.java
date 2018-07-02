/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeOuvrageGenie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ouvrage Genie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeOuvrageGenieImpl#getNumeroOuvrage <em>Numero Ouvrage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOuvrageGenieImpl extends TypeSiteImpl implements TypeOuvrageGenie {
	/**
	 * The default value of the '{@link #getNumeroOuvrage() <em>Numero Ouvrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOuvrage()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_OUVRAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroOuvrage() <em>Numero Ouvrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOuvrage()
	 * @generated
	 * @ordered
	 */
	protected String numeroOuvrage = NUMERO_OUVRAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOuvrageGenieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeOuvrageGenie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroOuvrage() {
		return numeroOuvrage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroOuvrage(String newNumeroOuvrage) {
		String oldNumeroOuvrage = numeroOuvrage;
		numeroOuvrage = newNumeroOuvrage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OUVRAGE_GENIE__NUMERO_OUVRAGE, oldNumeroOuvrage, numeroOuvrage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_OUVRAGE_GENIE__NUMERO_OUVRAGE:
				return getNumeroOuvrage();
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
			case SchemaPackage.TYPE_OUVRAGE_GENIE__NUMERO_OUVRAGE:
				setNumeroOuvrage((String)newValue);
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
			case SchemaPackage.TYPE_OUVRAGE_GENIE__NUMERO_OUVRAGE:
				setNumeroOuvrage(NUMERO_OUVRAGE_EDEFAULT);
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
			case SchemaPackage.TYPE_OUVRAGE_GENIE__NUMERO_OUVRAGE:
				return NUMERO_OUVRAGE_EDEFAULT == null ? numeroOuvrage != null : !NUMERO_OUVRAGE_EDEFAULT.equals(numeroOuvrage);
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
		result.append(" (numeroOuvrage: ");
		result.append(numeroOuvrage);
		result.append(')');
		return result.toString();
	}

} //TypeOuvrageGenieImpl
