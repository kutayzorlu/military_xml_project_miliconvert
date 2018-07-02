/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePrelevementSubordonneIdentifie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Prelevement Subordonne Identifie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneIdentifieImpl#getACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Fournisseur Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneIdentifieImpl#getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePrelevementSubordonneIdentifieImpl extends TypePrelevementDetachementImpl implements TypePrelevementSubordonneIdentifie {
	/**
	 * The cached value of the '{@link #getACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg() <em>AComme Lien Vers Fournisseur Association Entite Org Entite Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLienVersFournisseurAssociationEntiteOrgEntiteOrg;

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
	protected TypePrelevementSubordonneIdentifieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePrelevementSubordonneIdentifie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg() {
		return aCommeLienVersFournisseurAssociationEntiteOrgEntiteOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg(TypeAssociation newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg, NotificationChain msgs) {
		TypeAssociation oldACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg = aCommeLienVersFournisseurAssociationEntiteOrgEntiteOrg;
		aCommeLienVersFournisseurAssociationEntiteOrgEntiteOrg = newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_FOURNISSEUR_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, oldACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg, newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg(TypeAssociation newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg) {
		if (newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg != aCommeLienVersFournisseurAssociationEntiteOrgEntiteOrg) {
			NotificationChain msgs = null;
			if (aCommeLienVersFournisseurAssociationEntiteOrgEntiteOrg != null)
				msgs = ((InternalEObject)aCommeLienVersFournisseurAssociationEntiteOrgEntiteOrg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_FOURNISSEUR_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, null, msgs);
			if (newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg != null)
				msgs = ((InternalEObject)newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_FOURNISSEUR_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, null, msgs);
			msgs = basicSetACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg(newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_FOURNISSEUR_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg, newACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, oldACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg, newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg);
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
				msgs = ((InternalEObject)aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, null, msgs);
			if (newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg != null)
				msgs = ((InternalEObject)newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, null, msgs);
			msgs = basicSetACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg(newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG, newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg, newACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_FOURNISSEUR_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return basicSetACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
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
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_FOURNISSEUR_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return getACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
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
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_FOURNISSEUR_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				setACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
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
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_FOURNISSEUR_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				setACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
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
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_FOURNISSEUR_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return aCommeLienVersFournisseurAssociationEntiteOrgEntiteOrg != null;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_IDENTIFIE__ACOMME_LIEN_VERS_BENEFICIAIRE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return aCommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg != null;
		}
		return super.eIsSet(featureID);
	}

} //TypePrelevementSubordonneIdentifieImpl
