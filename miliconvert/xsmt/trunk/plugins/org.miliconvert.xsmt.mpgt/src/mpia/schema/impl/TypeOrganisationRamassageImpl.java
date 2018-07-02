/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeOrganisationRamassage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Organisation Ramassage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeOrganisationRamassageImpl#getOrganisationTriage <em>Organisation Triage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationRamassageImpl#getReleveEtCondMedicalPrimaire <em>Releve Et Cond Medical Primaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOrganisationRamassageImpl extends EObjectImpl implements TypeOrganisationRamassage {
	/**
	 * The default value of the '{@link #getOrganisationTriage() <em>Organisation Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationTriage()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANISATION_TRIAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganisationTriage() <em>Organisation Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationTriage()
	 * @generated
	 * @ordered
	 */
	protected String organisationTriage = ORGANISATION_TRIAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleveEtCondMedicalPrimaire() <em>Releve Et Cond Medical Primaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleveEtCondMedicalPrimaire()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEVE_ET_COND_MEDICAL_PRIMAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleveEtCondMedicalPrimaire() <em>Releve Et Cond Medical Primaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleveEtCondMedicalPrimaire()
	 * @generated
	 * @ordered
	 */
	protected String releveEtCondMedicalPrimaire = RELEVE_ET_COND_MEDICAL_PRIMAIRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOrganisationRamassageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeOrganisationRamassage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganisationTriage() {
		return organisationTriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisationTriage(String newOrganisationTriage) {
		String oldOrganisationTriage = organisationTriage;
		organisationTriage = newOrganisationTriage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__ORGANISATION_TRIAGE, oldOrganisationTriage, organisationTriage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReleveEtCondMedicalPrimaire() {
		return releveEtCondMedicalPrimaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleveEtCondMedicalPrimaire(String newReleveEtCondMedicalPrimaire) {
		String oldReleveEtCondMedicalPrimaire = releveEtCondMedicalPrimaire;
		releveEtCondMedicalPrimaire = newReleveEtCondMedicalPrimaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__RELEVE_ET_COND_MEDICAL_PRIMAIRE, oldReleveEtCondMedicalPrimaire, releveEtCondMedicalPrimaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__ORGANISATION_TRIAGE:
				return getOrganisationTriage();
			case SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__RELEVE_ET_COND_MEDICAL_PRIMAIRE:
				return getReleveEtCondMedicalPrimaire();
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
			case SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__ORGANISATION_TRIAGE:
				setOrganisationTriage((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__RELEVE_ET_COND_MEDICAL_PRIMAIRE:
				setReleveEtCondMedicalPrimaire((String)newValue);
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
			case SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__ORGANISATION_TRIAGE:
				setOrganisationTriage(ORGANISATION_TRIAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__RELEVE_ET_COND_MEDICAL_PRIMAIRE:
				setReleveEtCondMedicalPrimaire(RELEVE_ET_COND_MEDICAL_PRIMAIRE_EDEFAULT);
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
			case SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__ORGANISATION_TRIAGE:
				return ORGANISATION_TRIAGE_EDEFAULT == null ? organisationTriage != null : !ORGANISATION_TRIAGE_EDEFAULT.equals(organisationTriage);
			case SchemaPackage.TYPE_ORGANISATION_RAMASSAGE__RELEVE_ET_COND_MEDICAL_PRIMAIRE:
				return RELEVE_ET_COND_MEDICAL_PRIMAIRE_EDEFAULT == null ? releveEtCondMedicalPrimaire != null : !RELEVE_ET_COND_MEDICAL_PRIMAIRE_EDEFAULT.equals(releveEtCondMedicalPrimaire);
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
		result.append(" (organisationTriage: ");
		result.append(organisationTriage);
		result.append(", releveEtCondMedicalPrimaire: ");
		result.append(releveEtCondMedicalPrimaire);
		result.append(')');
		return result.toString();
	}

} //TypeOrganisationRamassageImpl
