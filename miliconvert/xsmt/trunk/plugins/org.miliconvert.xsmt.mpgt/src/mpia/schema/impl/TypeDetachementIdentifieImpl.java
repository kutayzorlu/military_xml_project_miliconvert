/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDetachementIdentifie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Detachement Identifie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDetachementIdentifieImpl#getTypeDetach <em>Type Detach</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementIdentifieImpl#getMoyensPersonnel <em>Moyens Personnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementIdentifieImpl#getMoyensEnMateriel <em>Moyens En Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementIdentifieImpl#getModaliteMission <em>Modalite Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementIdentifieImpl#getACommeLienVersOrigineAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Origine Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementIdentifieImpl#getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDetachementIdentifieImpl extends TypePrelevementDetachementImpl implements TypeDetachementIdentifie {
	/**
	 * The default value of the '{@link #getTypeDetach() <em>Type Detach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDetach()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DETACH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeDetach() <em>Type Detach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDetach()
	 * @generated
	 * @ordered
	 */
	protected String typeDetach = TYPE_DETACH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyensPersonnel() <em>Moyens Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensPersonnel()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_PERSONNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyensPersonnel() <em>Moyens Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensPersonnel()
	 * @generated
	 * @ordered
	 */
	protected String moyensPersonnel = MOYENS_PERSONNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyensEnMateriel() <em>Moyens En Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensEnMateriel()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_EN_MATERIEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyensEnMateriel() <em>Moyens En Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensEnMateriel()
	 * @generated
	 * @ordered
	 */
	protected String moyensEnMateriel = MOYENS_EN_MATERIEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModaliteMission() <em>Modalite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteMission()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITE_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModaliteMission() <em>Modalite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteMission()
	 * @generated
	 * @ordered
	 */
	protected String modaliteMission = MODALITE_MISSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeLienVersOrigineAssociationEntiteOrgEntiteOrg() <em>AComme Lien Vers Origine Association Entite Org Entite Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLienVersOrigineAssociationEntiteOrgEntiteOrg()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLienVersOrigineAssociationEntiteOrgEntiteOrg;

	/**
	 * The cached value of the '{@link #getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg() <em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDetachementIdentifieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDetachementIdentifie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeDetach() {
		return typeDetach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDetach(String newTypeDetach) {
		String oldTypeDetach = typeDetach;
		typeDetach = newTypeDetach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__TYPE_DETACH, oldTypeDetach, typeDetach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyensPersonnel() {
		return moyensPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensPersonnel(String newMoyensPersonnel) {
		String oldMoyensPersonnel = moyensPersonnel;
		moyensPersonnel = newMoyensPersonnel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_PERSONNEL, oldMoyensPersonnel, moyensPersonnel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyensEnMateriel() {
		return moyensEnMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensEnMateriel(String newMoyensEnMateriel) {
		String oldMoyensEnMateriel = moyensEnMateriel;
		moyensEnMateriel = newMoyensEnMateriel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_EN_MATERIEL, oldMoyensEnMateriel, moyensEnMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModaliteMission() {
		return modaliteMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModaliteMission(String newModaliteMission) {
		String oldModaliteMission = modaliteMission;
		modaliteMission = newModaliteMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MODALITE_MISSION, oldModaliteMission, modaliteMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLienVersOrigineAssociationEntiteOrgEntiteOrg() {
		return aCommeLienVersOrigineAssociationEntiteOrgEntiteOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLienVersOrigineAssociationEntiteOrgEntiteOrg(TypeAssociation newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg, NotificationChain msgs) {
		TypeAssociation oldACommeLienVersOrigineAssociationEntiteOrgEntiteOrg = aCommeLienVersOrigineAssociationEntiteOrgEntiteOrg;
		aCommeLienVersOrigineAssociationEntiteOrgEntiteOrg = newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_ORIGINE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, oldACommeLienVersOrigineAssociationEntiteOrgEntiteOrg, newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLienVersOrigineAssociationEntiteOrgEntiteOrg(TypeAssociation newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg) {
		if (newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg != aCommeLienVersOrigineAssociationEntiteOrgEntiteOrg) {
			NotificationChain msgs = null;
			if (aCommeLienVersOrigineAssociationEntiteOrgEntiteOrg != null)
				msgs = ((InternalEObject)aCommeLienVersOrigineAssociationEntiteOrgEntiteOrg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_ORIGINE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, null, msgs);
			if (newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg != null)
				msgs = ((InternalEObject)newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_ORIGINE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, null, msgs);
			msgs = basicSetACommeLienVersOrigineAssociationEntiteOrgEntiteOrg(newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_ORIGINE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg, newACommeLienVersOrigineAssociationEntiteOrgEntiteOrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg() {
		return aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg(TypeAssociation newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg, NotificationChain msgs) {
		TypeAssociation oldACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg = aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg;
		aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg = newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, oldACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg, newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg(TypeAssociation newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg) {
		if (newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg != aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg) {
			NotificationChain msgs = null;
			if (aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg != null)
				msgs = ((InternalEObject)aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, null, msgs);
			if (newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg != null)
				msgs = ((InternalEObject)newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, null, msgs);
			msgs = basicSetACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg(newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg, newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_ORIGINE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return basicSetACommeLienVersOrigineAssociationEntiteOrgEntiteOrg(null, msgs);
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return basicSetACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg(null, msgs);
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
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__TYPE_DETACH:
				return getTypeDetach();
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_PERSONNEL:
				return getMoyensPersonnel();
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_EN_MATERIEL:
				return getMoyensEnMateriel();
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MODALITE_MISSION:
				return getModaliteMission();
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_ORIGINE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return getACommeLienVersOrigineAssociationEntiteOrgEntiteOrg();
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg();
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
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__TYPE_DETACH:
				setTypeDetach((String)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_PERSONNEL:
				setMoyensPersonnel((String)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_EN_MATERIEL:
				setMoyensEnMateriel((String)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MODALITE_MISSION:
				setModaliteMission((String)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_ORIGINE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				setACommeLienVersOrigineAssociationEntiteOrgEntiteOrg((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				setACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__TYPE_DETACH:
				setTypeDetach(TYPE_DETACH_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_PERSONNEL:
				setMoyensPersonnel(MOYENS_PERSONNEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_EN_MATERIEL:
				setMoyensEnMateriel(MOYENS_EN_MATERIEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MODALITE_MISSION:
				setModaliteMission(MODALITE_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_ORIGINE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				setACommeLienVersOrigineAssociationEntiteOrgEntiteOrg((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				setACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg((TypeAssociation)null);
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
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__TYPE_DETACH:
				return TYPE_DETACH_EDEFAULT == null ? typeDetach != null : !TYPE_DETACH_EDEFAULT.equals(typeDetach);
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_PERSONNEL:
				return MOYENS_PERSONNEL_EDEFAULT == null ? moyensPersonnel != null : !MOYENS_PERSONNEL_EDEFAULT.equals(moyensPersonnel);
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MOYENS_EN_MATERIEL:
				return MOYENS_EN_MATERIEL_EDEFAULT == null ? moyensEnMateriel != null : !MOYENS_EN_MATERIEL_EDEFAULT.equals(moyensEnMateriel);
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__MODALITE_MISSION:
				return MODALITE_MISSION_EDEFAULT == null ? modaliteMission != null : !MODALITE_MISSION_EDEFAULT.equals(modaliteMission);
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_ORIGINE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return aCommeLienVersOrigineAssociationEntiteOrgEntiteOrg != null;
			case SchemaPackage.TYPE_DETACHEMENT_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg != null;
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
		result.append(" (typeDetach: ");
		result.append(typeDetach);
		result.append(", moyensPersonnel: ");
		result.append(moyensPersonnel);
		result.append(", moyensEnMateriel: ");
		result.append(moyensEnMateriel);
		result.append(", modaliteMission: ");
		result.append(modaliteMission);
		result.append(')');
		return result.toString();
	}

} //TypeDetachementIdentifieImpl
