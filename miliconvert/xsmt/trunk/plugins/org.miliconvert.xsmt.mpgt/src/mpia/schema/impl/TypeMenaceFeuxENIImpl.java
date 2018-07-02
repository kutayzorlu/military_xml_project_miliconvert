/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMenaceFeuxENI;
import mpia.schema.TypeMoyenFeuENI;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Menace Feux ENI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMenaceFeuxENIImpl#getACommeMoyenFeuENIMoyenFeuENI <em>AComme Moyen Feu ENI Moyen Feu ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceFeuxENIImpl#getAPourActionsEnvisageesAction <em>APour Actions Envisagees Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceFeuxENIImpl#getAPourZoneFeuxENIAutreElementControle <em>APour Zone Feux ENI Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceFeuxENIImpl#getAPourPCouUniteAMIcibleENIUnite <em>APour PCou Unite AM Icible ENI Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceFeuxENIImpl#getAPourInstallationEtInfrastructureAMIcibleENITypeSite <em>APour Installation Et Infrastructure AM Icible ENI Type Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceFeuxENIImpl#getACommeMaterielSusceptibleEtrePrisAPartieMateriel <em>AComme Materiel Susceptible Etre Pris APartie Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMenaceFeuxENIImpl extends TypeMenaceImpl implements TypeMenaceFeuxENI {
	/**
	 * The cached value of the '{@link #getACommeMoyenFeuENIMoyenFeuENI() <em>AComme Moyen Feu ENI Moyen Feu ENI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeMoyenFeuENIMoyenFeuENI()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyenFeuENI> aCommeMoyenFeuENIMoyenFeuENI;

	/**
	 * The cached value of the '{@link #getAPourActionsEnvisageesAction() <em>APour Actions Envisagees Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourActionsEnvisageesAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourActionsEnvisageesAction;

	/**
	 * The cached value of the '{@link #getAPourZoneFeuxENIAutreElementControle() <em>APour Zone Feux ENI Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneFeuxENIAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneFeuxENIAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourPCouUniteAMIcibleENIUnite() <em>APour PCou Unite AM Icible ENI Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPCouUniteAMIcibleENIUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourPCouUniteAMIcibleENIUnite;

	/**
	 * The cached value of the '{@link #getAPourInstallationEtInfrastructureAMIcibleENITypeSite() <em>APour Installation Et Infrastructure AM Icible ENI Type Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourInstallationEtInfrastructureAMIcibleENITypeSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourInstallationEtInfrastructureAMIcibleENITypeSite;

	/**
	 * The cached value of the '{@link #getACommeMaterielSusceptibleEtrePrisAPartieMateriel() <em>AComme Materiel Susceptible Etre Pris APartie Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeMaterielSusceptibleEtrePrisAPartieMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeMaterielSusceptibleEtrePrisAPartieMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMenaceFeuxENIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMenaceFeuxENI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyenFeuENI> getACommeMoyenFeuENIMoyenFeuENI() {
		if (aCommeMoyenFeuENIMoyenFeuENI == null) {
			aCommeMoyenFeuENIMoyenFeuENI = new EObjectContainmentEList<TypeMoyenFeuENI>(TypeMoyenFeuENI.class, this, SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MOYEN_FEU_ENI_MOYEN_FEU_ENI);
		}
		return aCommeMoyenFeuENIMoyenFeuENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourActionsEnvisageesAction() {
		if (aPourActionsEnvisageesAction == null) {
			aPourActionsEnvisageesAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ACTIONS_ENVISAGEES_ACTION);
		}
		return aPourActionsEnvisageesAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneFeuxENIAutreElementControle() {
		if (aPourZoneFeuxENIAutreElementControle == null) {
			aPourZoneFeuxENIAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ZONE_FEUX_ENI_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneFeuxENIAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourPCouUniteAMIcibleENIUnite() {
		if (aPourPCouUniteAMIcibleENIUnite == null) {
			aPourPCouUniteAMIcibleENIUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_PCOU_UNITE_AM_ICIBLE_ENI_UNITE);
		}
		return aPourPCouUniteAMIcibleENIUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourInstallationEtInfrastructureAMIcibleENITypeSite() {
		if (aPourInstallationEtInfrastructureAMIcibleENITypeSite == null) {
			aPourInstallationEtInfrastructureAMIcibleENITypeSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_INSTALLATION_ET_INFRASTRUCTURE_AM_ICIBLE_ENI_TYPE_SITE);
		}
		return aPourInstallationEtInfrastructureAMIcibleENITypeSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeMaterielSusceptibleEtrePrisAPartieMateriel() {
		if (aCommeMaterielSusceptibleEtrePrisAPartieMateriel == null) {
			aCommeMaterielSusceptibleEtrePrisAPartieMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MATERIEL_SUSCEPTIBLE_ETRE_PRIS_APARTIE_MATERIEL);
		}
		return aCommeMaterielSusceptibleEtrePrisAPartieMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MOYEN_FEU_ENI_MOYEN_FEU_ENI:
				return ((InternalEList<?>)getACommeMoyenFeuENIMoyenFeuENI()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ACTIONS_ENVISAGEES_ACTION:
				return ((InternalEList<?>)getAPourActionsEnvisageesAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ZONE_FEUX_ENI_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneFeuxENIAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_PCOU_UNITE_AM_ICIBLE_ENI_UNITE:
				return ((InternalEList<?>)getAPourPCouUniteAMIcibleENIUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_INSTALLATION_ET_INFRASTRUCTURE_AM_ICIBLE_ENI_TYPE_SITE:
				return ((InternalEList<?>)getAPourInstallationEtInfrastructureAMIcibleENITypeSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MATERIEL_SUSCEPTIBLE_ETRE_PRIS_APARTIE_MATERIEL:
				return ((InternalEList<?>)getACommeMaterielSusceptibleEtrePrisAPartieMateriel()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MOYEN_FEU_ENI_MOYEN_FEU_ENI:
				return getACommeMoyenFeuENIMoyenFeuENI();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ACTIONS_ENVISAGEES_ACTION:
				return getAPourActionsEnvisageesAction();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ZONE_FEUX_ENI_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneFeuxENIAutreElementControle();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_PCOU_UNITE_AM_ICIBLE_ENI_UNITE:
				return getAPourPCouUniteAMIcibleENIUnite();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_INSTALLATION_ET_INFRASTRUCTURE_AM_ICIBLE_ENI_TYPE_SITE:
				return getAPourInstallationEtInfrastructureAMIcibleENITypeSite();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MATERIEL_SUSCEPTIBLE_ETRE_PRIS_APARTIE_MATERIEL:
				return getACommeMaterielSusceptibleEtrePrisAPartieMateriel();
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
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MOYEN_FEU_ENI_MOYEN_FEU_ENI:
				getACommeMoyenFeuENIMoyenFeuENI().clear();
				getACommeMoyenFeuENIMoyenFeuENI().addAll((Collection<? extends TypeMoyenFeuENI>)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ACTIONS_ENVISAGEES_ACTION:
				getAPourActionsEnvisageesAction().clear();
				getAPourActionsEnvisageesAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ZONE_FEUX_ENI_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneFeuxENIAutreElementControle().clear();
				getAPourZoneFeuxENIAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_PCOU_UNITE_AM_ICIBLE_ENI_UNITE:
				getAPourPCouUniteAMIcibleENIUnite().clear();
				getAPourPCouUniteAMIcibleENIUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_INSTALLATION_ET_INFRASTRUCTURE_AM_ICIBLE_ENI_TYPE_SITE:
				getAPourInstallationEtInfrastructureAMIcibleENITypeSite().clear();
				getAPourInstallationEtInfrastructureAMIcibleENITypeSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MATERIEL_SUSCEPTIBLE_ETRE_PRIS_APARTIE_MATERIEL:
				getACommeMaterielSusceptibleEtrePrisAPartieMateriel().clear();
				getACommeMaterielSusceptibleEtrePrisAPartieMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MOYEN_FEU_ENI_MOYEN_FEU_ENI:
				getACommeMoyenFeuENIMoyenFeuENI().clear();
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ACTIONS_ENVISAGEES_ACTION:
				getAPourActionsEnvisageesAction().clear();
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ZONE_FEUX_ENI_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneFeuxENIAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_PCOU_UNITE_AM_ICIBLE_ENI_UNITE:
				getAPourPCouUniteAMIcibleENIUnite().clear();
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_INSTALLATION_ET_INFRASTRUCTURE_AM_ICIBLE_ENI_TYPE_SITE:
				getAPourInstallationEtInfrastructureAMIcibleENITypeSite().clear();
				return;
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MATERIEL_SUSCEPTIBLE_ETRE_PRIS_APARTIE_MATERIEL:
				getACommeMaterielSusceptibleEtrePrisAPartieMateriel().clear();
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
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MOYEN_FEU_ENI_MOYEN_FEU_ENI:
				return aCommeMoyenFeuENIMoyenFeuENI != null && !aCommeMoyenFeuENIMoyenFeuENI.isEmpty();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ACTIONS_ENVISAGEES_ACTION:
				return aPourActionsEnvisageesAction != null && !aPourActionsEnvisageesAction.isEmpty();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_ZONE_FEUX_ENI_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneFeuxENIAutreElementControle != null && !aPourZoneFeuxENIAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_PCOU_UNITE_AM_ICIBLE_ENI_UNITE:
				return aPourPCouUniteAMIcibleENIUnite != null && !aPourPCouUniteAMIcibleENIUnite.isEmpty();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__APOUR_INSTALLATION_ET_INFRASTRUCTURE_AM_ICIBLE_ENI_TYPE_SITE:
				return aPourInstallationEtInfrastructureAMIcibleENITypeSite != null && !aPourInstallationEtInfrastructureAMIcibleENITypeSite.isEmpty();
			case SchemaPackage.TYPE_MENACE_FEUX_ENI__ACOMME_MATERIEL_SUSCEPTIBLE_ETRE_PRIS_APARTIE_MATERIEL:
				return aCommeMaterielSusceptibleEtrePrisAPartieMateriel != null && !aCommeMaterielSusceptibleEtrePrisAPartieMateriel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeMenaceFeuxENIImpl
