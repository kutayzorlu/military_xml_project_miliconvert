/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePorteurSystemeArme;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Porteur Systeme Arme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePorteurSystemeArmeImpl#getNumeroImmatriculation <em>Numero Immatriculation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePorteurSystemeArmeImpl extends TypeMaterielImpl implements TypePorteurSystemeArme {
	/**
	 * The default value of the '{@link #getNumeroImmatriculation() <em>Numero Immatriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroImmatriculation()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_IMMATRICULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroImmatriculation() <em>Numero Immatriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroImmatriculation()
	 * @generated
	 * @ordered
	 */
	protected String numeroImmatriculation = NUMERO_IMMATRICULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePorteurSystemeArmeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePorteurSystemeArme();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroImmatriculation() {
		return numeroImmatriculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroImmatriculation(String newNumeroImmatriculation) {
		String oldNumeroImmatriculation = numeroImmatriculation;
		numeroImmatriculation = newNumeroImmatriculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORTEUR_SYSTEME_ARME__NUMERO_IMMATRICULATION, oldNumeroImmatriculation, numeroImmatriculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_PORTEUR_SYSTEME_ARME__NUMERO_IMMATRICULATION:
				return getNumeroImmatriculation();
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
			case SchemaPackage.TYPE_PORTEUR_SYSTEME_ARME__NUMERO_IMMATRICULATION:
				setNumeroImmatriculation((String)newValue);
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
			case SchemaPackage.TYPE_PORTEUR_SYSTEME_ARME__NUMERO_IMMATRICULATION:
				setNumeroImmatriculation(NUMERO_IMMATRICULATION_EDEFAULT);
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
			case SchemaPackage.TYPE_PORTEUR_SYSTEME_ARME__NUMERO_IMMATRICULATION:
				return NUMERO_IMMATRICULATION_EDEFAULT == null ? numeroImmatriculation != null : !NUMERO_IMMATRICULATION_EDEFAULT.equals(numeroImmatriculation);
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
		result.append(" (numeroImmatriculation: ");
		result.append(numeroImmatriculation);
		result.append(')');
		return result.toString();
	}

} //TypePorteurSystemeArmeImpl
