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
import mpia.schema.TypeDetailEvenement;
import mpia.schema.TypeEtatEvenement;
import mpia.schema.TypeEvenement;
import mpia.schema.TypeRessourceActivite;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Evenement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvenementImpl#getEstDetailleParDetailEvenement <em>Est Detaille Par Detail Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementImpl#getAPourEtatEtatEvenement <em>APour Etat Etat Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementImpl#getEstObjetAssociationEntiteOrgEvenement <em>Est Objet Association Entite Org Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementImpl#getEstObjetAssociationPersonneEvenement <em>Est Objet Association Personne Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementImpl#getEstObjetAssociationMaterielEvenement <em>Est Objet Association Materiel Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementImpl#getEstObjetAssociationSiteEvenement <em>Est Objet Association Site Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementImpl#getEstObjetAssociationElementControleEvenement <em>Est Objet Association Element Controle Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementImpl#getEstObjetAssociationElementTopographieEvenement <em>Est Objet Association Element Topographie Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementImpl#getAPourRessourceRessourceActivite <em>APour Ressource Ressource Activite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeEvenementImpl extends TypeActiviteImpl implements TypeEvenement {
	/**
	 * The cached value of the '{@link #getEstDetailleParDetailEvenement() <em>Est Detaille Par Detail Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDetailleParDetailEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDetailEvenement> estDetailleParDetailEvenement;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatEvenement() <em>APour Etat Etat Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatEvenement> aPourEtatEtatEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEntiteOrgEvenement() <em>Est Objet Association Entite Org Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEntiteOrgEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEntiteOrgEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPersonneEvenement() <em>Est Objet Association Personne Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPersonneEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPersonneEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMaterielEvenement() <em>Est Objet Association Materiel Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMaterielEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMaterielEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationSiteEvenement() <em>Est Objet Association Site Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationSiteEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationSiteEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationElementControleEvenement() <em>Est Objet Association Element Controle Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationElementControleEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationElementControleEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationElementTopographieEvenement() <em>Est Objet Association Element Topographie Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationElementTopographieEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationElementTopographieEvenement;

	/**
	 * The cached value of the '{@link #getAPourRessourceRessourceActivite() <em>APour Ressource Ressource Activite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRessourceRessourceActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceActivite> aPourRessourceRessourceActivite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvenementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvenement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDetailEvenement> getEstDetailleParDetailEvenement() {
		if (estDetailleParDetailEvenement == null) {
			estDetailleParDetailEvenement = new EObjectContainmentEList<TypeDetailEvenement>(TypeDetailEvenement.class, this, SchemaPackage.TYPE_EVENEMENT__EST_DETAILLE_PAR_DETAIL_EVENEMENT);
		}
		return estDetailleParDetailEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatEvenement> getAPourEtatEtatEvenement() {
		if (aPourEtatEtatEvenement == null) {
			aPourEtatEtatEvenement = new EObjectContainmentEList<TypeEtatEvenement>(TypeEtatEvenement.class, this, SchemaPackage.TYPE_EVENEMENT__APOUR_ETAT_ETAT_EVENEMENT);
		}
		return aPourEtatEtatEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEntiteOrgEvenement() {
		if (estObjetAssociationEntiteOrgEvenement == null) {
			estObjetAssociationEntiteOrgEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ENTITE_ORG_EVENEMENT);
		}
		return estObjetAssociationEntiteOrgEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPersonneEvenement() {
		if (estObjetAssociationPersonneEvenement == null) {
			estObjetAssociationPersonneEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_PERSONNE_EVENEMENT);
		}
		return estObjetAssociationPersonneEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMaterielEvenement() {
		if (estObjetAssociationMaterielEvenement == null) {
			estObjetAssociationMaterielEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_MATERIEL_EVENEMENT);
		}
		return estObjetAssociationMaterielEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationSiteEvenement() {
		if (estObjetAssociationSiteEvenement == null) {
			estObjetAssociationSiteEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_SITE_EVENEMENT);
		}
		return estObjetAssociationSiteEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationElementControleEvenement() {
		if (estObjetAssociationElementControleEvenement == null) {
			estObjetAssociationElementControleEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT);
		}
		return estObjetAssociationElementControleEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationElementTopographieEvenement() {
		if (estObjetAssociationElementTopographieEvenement == null) {
			estObjetAssociationElementTopographieEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT);
		}
		return estObjetAssociationElementTopographieEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceActivite> getAPourRessourceRessourceActivite() {
		if (aPourRessourceRessourceActivite == null) {
			aPourRessourceRessourceActivite = new EObjectContainmentEList<TypeRessourceActivite>(TypeRessourceActivite.class, this, SchemaPackage.TYPE_EVENEMENT__APOUR_RESSOURCE_RESSOURCE_ACTIVITE);
		}
		return aPourRessourceRessourceActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVENEMENT__EST_DETAILLE_PAR_DETAIL_EVENEMENT:
				return ((InternalEList<?>)getEstDetailleParDetailEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT__APOUR_ETAT_ETAT_EVENEMENT:
				return ((InternalEList<?>)getAPourEtatEtatEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationEntiteOrgEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_PERSONNE_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationPersonneEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_MATERIEL_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationMaterielEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_SITE_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationSiteEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationElementControleEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationElementTopographieEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				return ((InternalEList<?>)getAPourRessourceRessourceActivite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_EVENEMENT__EST_DETAILLE_PAR_DETAIL_EVENEMENT:
				return getEstDetailleParDetailEvenement();
			case SchemaPackage.TYPE_EVENEMENT__APOUR_ETAT_ETAT_EVENEMENT:
				return getAPourEtatEtatEvenement();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				return getEstObjetAssociationEntiteOrgEvenement();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_PERSONNE_EVENEMENT:
				return getEstObjetAssociationPersonneEvenement();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_MATERIEL_EVENEMENT:
				return getEstObjetAssociationMaterielEvenement();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_SITE_EVENEMENT:
				return getEstObjetAssociationSiteEvenement();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				return getEstObjetAssociationElementControleEvenement();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				return getEstObjetAssociationElementTopographieEvenement();
			case SchemaPackage.TYPE_EVENEMENT__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				return getAPourRessourceRessourceActivite();
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
			case SchemaPackage.TYPE_EVENEMENT__EST_DETAILLE_PAR_DETAIL_EVENEMENT:
				getEstDetailleParDetailEvenement().clear();
				getEstDetailleParDetailEvenement().addAll((Collection<? extends TypeDetailEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT__APOUR_ETAT_ETAT_EVENEMENT:
				getAPourEtatEtatEvenement().clear();
				getAPourEtatEtatEvenement().addAll((Collection<? extends TypeEtatEvenement>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				getEstObjetAssociationEntiteOrgEvenement().clear();
				getEstObjetAssociationEntiteOrgEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_PERSONNE_EVENEMENT:
				getEstObjetAssociationPersonneEvenement().clear();
				getEstObjetAssociationPersonneEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_MATERIEL_EVENEMENT:
				getEstObjetAssociationMaterielEvenement().clear();
				getEstObjetAssociationMaterielEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_SITE_EVENEMENT:
				getEstObjetAssociationSiteEvenement().clear();
				getEstObjetAssociationSiteEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				getEstObjetAssociationElementControleEvenement().clear();
				getEstObjetAssociationElementControleEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				getEstObjetAssociationElementTopographieEvenement().clear();
				getEstObjetAssociationElementTopographieEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				getAPourRessourceRessourceActivite().clear();
				getAPourRessourceRessourceActivite().addAll((Collection<? extends TypeRessourceActivite>)newValue);
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
			case SchemaPackage.TYPE_EVENEMENT__EST_DETAILLE_PAR_DETAIL_EVENEMENT:
				getEstDetailleParDetailEvenement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT__APOUR_ETAT_ETAT_EVENEMENT:
				getAPourEtatEtatEvenement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				getEstObjetAssociationEntiteOrgEvenement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_PERSONNE_EVENEMENT:
				getEstObjetAssociationPersonneEvenement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_MATERIEL_EVENEMENT:
				getEstObjetAssociationMaterielEvenement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_SITE_EVENEMENT:
				getEstObjetAssociationSiteEvenement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				getEstObjetAssociationElementControleEvenement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				getEstObjetAssociationElementTopographieEvenement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				getAPourRessourceRessourceActivite().clear();
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
			case SchemaPackage.TYPE_EVENEMENT__EST_DETAILLE_PAR_DETAIL_EVENEMENT:
				return estDetailleParDetailEvenement != null && !estDetailleParDetailEvenement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT__APOUR_ETAT_ETAT_EVENEMENT:
				return aPourEtatEtatEvenement != null && !aPourEtatEtatEvenement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				return estObjetAssociationEntiteOrgEvenement != null && !estObjetAssociationEntiteOrgEvenement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_PERSONNE_EVENEMENT:
				return estObjetAssociationPersonneEvenement != null && !estObjetAssociationPersonneEvenement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_MATERIEL_EVENEMENT:
				return estObjetAssociationMaterielEvenement != null && !estObjetAssociationMaterielEvenement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_SITE_EVENEMENT:
				return estObjetAssociationSiteEvenement != null && !estObjetAssociationSiteEvenement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				return estObjetAssociationElementControleEvenement != null && !estObjetAssociationElementControleEvenement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT__EST_OBJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				return estObjetAssociationElementTopographieEvenement != null && !estObjetAssociationElementTopographieEvenement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				return aPourRessourceRessourceActivite != null && !aPourRessourceRessourceActivite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeEvenementImpl
