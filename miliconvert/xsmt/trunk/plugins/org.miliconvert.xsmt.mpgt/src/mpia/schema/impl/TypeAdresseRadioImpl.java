/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAdresseRadio;
import mpia.schema.TypeFrequence;

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
 * An implementation of the model object '<em><b>Type Adresse Radio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAdresseRadioImpl#getIndicatifOperationnel <em>Indicatif Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdresseRadioImpl#getIndicatifRadio <em>Indicatif Radio</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdresseRadioImpl#getAPourFrequenceFrequence <em>APour Frequence Frequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAdresseRadioImpl extends TypeAdresseImpl implements TypeAdresseRadio {
	/**
	 * The default value of the '{@link #getIndicatifOperationnel() <em>Indicatif Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatifOperationnel()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATIF_OPERATIONNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicatifOperationnel() <em>Indicatif Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatifOperationnel()
	 * @generated
	 * @ordered
	 */
	protected String indicatifOperationnel = INDICATIF_OPERATIONNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndicatifRadio() <em>Indicatif Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatifRadio()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATIF_RADIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicatifRadio() <em>Indicatif Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatifRadio()
	 * @generated
	 * @ordered
	 */
	protected String indicatifRadio = INDICATIF_RADIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourFrequenceFrequence() <em>APour Frequence Frequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFrequenceFrequence()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeFrequence> aPourFrequenceFrequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAdresseRadioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAdresseRadio();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndicatifOperationnel() {
		return indicatifOperationnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicatifOperationnel(String newIndicatifOperationnel) {
		String oldIndicatifOperationnel = indicatifOperationnel;
		indicatifOperationnel = newIndicatifOperationnel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_OPERATIONNEL, oldIndicatifOperationnel, indicatifOperationnel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndicatifRadio() {
		return indicatifRadio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicatifRadio(String newIndicatifRadio) {
		String oldIndicatifRadio = indicatifRadio;
		indicatifRadio = newIndicatifRadio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_RADIO, oldIndicatifRadio, indicatifRadio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeFrequence> getAPourFrequenceFrequence() {
		if (aPourFrequenceFrequence == null) {
			aPourFrequenceFrequence = new EObjectContainmentEList<TypeFrequence>(TypeFrequence.class, this, SchemaPackage.TYPE_ADRESSE_RADIO__APOUR_FREQUENCE_FREQUENCE);
		}
		return aPourFrequenceFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ADRESSE_RADIO__APOUR_FREQUENCE_FREQUENCE:
				return ((InternalEList<?>)getAPourFrequenceFrequence()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_OPERATIONNEL:
				return getIndicatifOperationnel();
			case SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_RADIO:
				return getIndicatifRadio();
			case SchemaPackage.TYPE_ADRESSE_RADIO__APOUR_FREQUENCE_FREQUENCE:
				return getAPourFrequenceFrequence();
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
			case SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_OPERATIONNEL:
				setIndicatifOperationnel((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_RADIO:
				setIndicatifRadio((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_RADIO__APOUR_FREQUENCE_FREQUENCE:
				getAPourFrequenceFrequence().clear();
				getAPourFrequenceFrequence().addAll((Collection<? extends TypeFrequence>)newValue);
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
			case SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_OPERATIONNEL:
				setIndicatifOperationnel(INDICATIF_OPERATIONNEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_RADIO:
				setIndicatifRadio(INDICATIF_RADIO_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_RADIO__APOUR_FREQUENCE_FREQUENCE:
				getAPourFrequenceFrequence().clear();
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
			case SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_OPERATIONNEL:
				return INDICATIF_OPERATIONNEL_EDEFAULT == null ? indicatifOperationnel != null : !INDICATIF_OPERATIONNEL_EDEFAULT.equals(indicatifOperationnel);
			case SchemaPackage.TYPE_ADRESSE_RADIO__INDICATIF_RADIO:
				return INDICATIF_RADIO_EDEFAULT == null ? indicatifRadio != null : !INDICATIF_RADIO_EDEFAULT.equals(indicatifRadio);
			case SchemaPackage.TYPE_ADRESSE_RADIO__APOUR_FREQUENCE_FREQUENCE:
				return aPourFrequenceFrequence != null && !aPourFrequenceFrequence.isEmpty();
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
		result.append(" (indicatifOperationnel: ");
		result.append(indicatifOperationnel);
		result.append(", indicatifRadio: ");
		result.append(indicatifRadio);
		result.append(')');
		return result.toString();
	}

} //TypeAdresseRadioImpl
