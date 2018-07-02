/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeOrganisationEvacuations;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Organisation Evacuations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeOrganisationEvacuationsImpl#getEvacuationsTactiques <em>Evacuations Tactiques</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationEvacuationsImpl#getOrganisationRegulationEtTransit <em>Organisation Regulation Et Transit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationEvacuationsImpl#getOrganisationGeneraleFlux <em>Organisation Generale Flux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationEvacuationsImpl#getEvacuationsStrategiques <em>Evacuations Strategiques</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOrganisationEvacuationsImpl extends EObjectImpl implements TypeOrganisationEvacuations {
	/**
	 * The default value of the '{@link #getEvacuationsTactiques() <em>Evacuations Tactiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvacuationsTactiques()
	 * @generated
	 * @ordered
	 */
	protected static final String EVACUATIONS_TACTIQUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvacuationsTactiques() <em>Evacuations Tactiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvacuationsTactiques()
	 * @generated
	 * @ordered
	 */
	protected String evacuationsTactiques = EVACUATIONS_TACTIQUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganisationRegulationEtTransit() <em>Organisation Regulation Et Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationRegulationEtTransit()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANISATION_REGULATION_ET_TRANSIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganisationRegulationEtTransit() <em>Organisation Regulation Et Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationRegulationEtTransit()
	 * @generated
	 * @ordered
	 */
	protected String organisationRegulationEtTransit = ORGANISATION_REGULATION_ET_TRANSIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganisationGeneraleFlux() <em>Organisation Generale Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationGeneraleFlux()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANISATION_GENERALE_FLUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganisationGeneraleFlux() <em>Organisation Generale Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationGeneraleFlux()
	 * @generated
	 * @ordered
	 */
	protected String organisationGeneraleFlux = ORGANISATION_GENERALE_FLUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvacuationsStrategiques() <em>Evacuations Strategiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvacuationsStrategiques()
	 * @generated
	 * @ordered
	 */
	protected static final String EVACUATIONS_STRATEGIQUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvacuationsStrategiques() <em>Evacuations Strategiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvacuationsStrategiques()
	 * @generated
	 * @ordered
	 */
	protected String evacuationsStrategiques = EVACUATIONS_STRATEGIQUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOrganisationEvacuationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeOrganisationEvacuations();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvacuationsTactiques() {
		return evacuationsTactiques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvacuationsTactiques(String newEvacuationsTactiques) {
		String oldEvacuationsTactiques = evacuationsTactiques;
		evacuationsTactiques = newEvacuationsTactiques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_TACTIQUES, oldEvacuationsTactiques, evacuationsTactiques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganisationRegulationEtTransit() {
		return organisationRegulationEtTransit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisationRegulationEtTransit(String newOrganisationRegulationEtTransit) {
		String oldOrganisationRegulationEtTransit = organisationRegulationEtTransit;
		organisationRegulationEtTransit = newOrganisationRegulationEtTransit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_REGULATION_ET_TRANSIT, oldOrganisationRegulationEtTransit, organisationRegulationEtTransit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganisationGeneraleFlux() {
		return organisationGeneraleFlux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisationGeneraleFlux(String newOrganisationGeneraleFlux) {
		String oldOrganisationGeneraleFlux = organisationGeneraleFlux;
		organisationGeneraleFlux = newOrganisationGeneraleFlux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_GENERALE_FLUX, oldOrganisationGeneraleFlux, organisationGeneraleFlux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvacuationsStrategiques() {
		return evacuationsStrategiques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvacuationsStrategiques(String newEvacuationsStrategiques) {
		String oldEvacuationsStrategiques = evacuationsStrategiques;
		evacuationsStrategiques = newEvacuationsStrategiques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_STRATEGIQUES, oldEvacuationsStrategiques, evacuationsStrategiques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_TACTIQUES:
				return getEvacuationsTactiques();
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_REGULATION_ET_TRANSIT:
				return getOrganisationRegulationEtTransit();
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_GENERALE_FLUX:
				return getOrganisationGeneraleFlux();
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_STRATEGIQUES:
				return getEvacuationsStrategiques();
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
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_TACTIQUES:
				setEvacuationsTactiques((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_REGULATION_ET_TRANSIT:
				setOrganisationRegulationEtTransit((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_GENERALE_FLUX:
				setOrganisationGeneraleFlux((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_STRATEGIQUES:
				setEvacuationsStrategiques((String)newValue);
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
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_TACTIQUES:
				setEvacuationsTactiques(EVACUATIONS_TACTIQUES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_REGULATION_ET_TRANSIT:
				setOrganisationRegulationEtTransit(ORGANISATION_REGULATION_ET_TRANSIT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_GENERALE_FLUX:
				setOrganisationGeneraleFlux(ORGANISATION_GENERALE_FLUX_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_STRATEGIQUES:
				setEvacuationsStrategiques(EVACUATIONS_STRATEGIQUES_EDEFAULT);
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
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_TACTIQUES:
				return EVACUATIONS_TACTIQUES_EDEFAULT == null ? evacuationsTactiques != null : !EVACUATIONS_TACTIQUES_EDEFAULT.equals(evacuationsTactiques);
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_REGULATION_ET_TRANSIT:
				return ORGANISATION_REGULATION_ET_TRANSIT_EDEFAULT == null ? organisationRegulationEtTransit != null : !ORGANISATION_REGULATION_ET_TRANSIT_EDEFAULT.equals(organisationRegulationEtTransit);
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__ORGANISATION_GENERALE_FLUX:
				return ORGANISATION_GENERALE_FLUX_EDEFAULT == null ? organisationGeneraleFlux != null : !ORGANISATION_GENERALE_FLUX_EDEFAULT.equals(organisationGeneraleFlux);
			case SchemaPackage.TYPE_ORGANISATION_EVACUATIONS__EVACUATIONS_STRATEGIQUES:
				return EVACUATIONS_STRATEGIQUES_EDEFAULT == null ? evacuationsStrategiques != null : !EVACUATIONS_STRATEGIQUES_EDEFAULT.equals(evacuationsStrategiques);
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
		result.append(" (evacuationsTactiques: ");
		result.append(evacuationsTactiques);
		result.append(", organisationRegulationEtTransit: ");
		result.append(organisationRegulationEtTransit);
		result.append(", organisationGeneraleFlux: ");
		result.append(organisationGeneraleFlux);
		result.append(", evacuationsStrategiques: ");
		result.append(evacuationsStrategiques);
		result.append(')');
		return result.toString();
	}

} //TypeOrganisationEvacuationsImpl
