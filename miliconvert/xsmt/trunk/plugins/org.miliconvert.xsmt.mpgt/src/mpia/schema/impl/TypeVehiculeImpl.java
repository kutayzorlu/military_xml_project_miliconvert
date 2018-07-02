/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeVehicule;

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
 * An implementation of the model object '<em><b>Type Vehicule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeVehiculeImpl#getNumeroImmatriculation <em>Numero Immatriculation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVehiculeImpl#getAPourSituationSituationVehicule <em>APour Situation Situation Vehicule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeVehiculeImpl extends TypeMaterielImpl implements TypeVehicule {
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
	 * The cached value of the '{@link #getAPourSituationSituationVehicule() <em>APour Situation Situation Vehicule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSituationSituationVehicule()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourSituationSituationVehicule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVehiculeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeVehicule();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VEHICULE__NUMERO_IMMATRICULATION, oldNumeroImmatriculation, numeroImmatriculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourSituationSituationVehicule() {
		if (aPourSituationSituationVehicule == null) {
			aPourSituationSituationVehicule = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_VEHICULE__APOUR_SITUATION_SITUATION_VEHICULE);
		}
		return aPourSituationSituationVehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_VEHICULE__APOUR_SITUATION_SITUATION_VEHICULE:
				return ((InternalEList<?>)getAPourSituationSituationVehicule()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_VEHICULE__NUMERO_IMMATRICULATION:
				return getNumeroImmatriculation();
			case SchemaPackage.TYPE_VEHICULE__APOUR_SITUATION_SITUATION_VEHICULE:
				return getAPourSituationSituationVehicule();
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
			case SchemaPackage.TYPE_VEHICULE__NUMERO_IMMATRICULATION:
				setNumeroImmatriculation((String)newValue);
				return;
			case SchemaPackage.TYPE_VEHICULE__APOUR_SITUATION_SITUATION_VEHICULE:
				getAPourSituationSituationVehicule().clear();
				getAPourSituationSituationVehicule().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_VEHICULE__NUMERO_IMMATRICULATION:
				setNumeroImmatriculation(NUMERO_IMMATRICULATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VEHICULE__APOUR_SITUATION_SITUATION_VEHICULE:
				getAPourSituationSituationVehicule().clear();
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
			case SchemaPackage.TYPE_VEHICULE__NUMERO_IMMATRICULATION:
				return NUMERO_IMMATRICULATION_EDEFAULT == null ? numeroImmatriculation != null : !NUMERO_IMMATRICULATION_EDEFAULT.equals(numeroImmatriculation);
			case SchemaPackage.TYPE_VEHICULE__APOUR_SITUATION_SITUATION_VEHICULE:
				return aPourSituationSituationVehicule != null && !aPourSituationSituationVehicule.isEmpty();
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

} //TypeVehiculeImpl
