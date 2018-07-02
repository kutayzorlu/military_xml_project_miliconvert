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
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;
import mpia.schema.TypeEtatOperationnelObjetInconnu;
import mpia.schema.TypeObjetInconnu;

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
 * An implementation of the model object '<em><b>Type Objet Inconnu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjetInconnuImpl#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetInconnuImpl#getAPourEtatEtatOperationnelObjetInconnu <em>APour Etat Etat Operationnel Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetInconnuImpl#getEstSujetAssociationObjetInconnuEltCtrl <em>Est Sujet Association Objet Inconnu Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetInconnuImpl#getEstSujetAssociationObjetInconnuEltTopo <em>Est Sujet Association Objet Inconnu Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetInconnuImpl#getEstSujetAssociationObjetInconnuSite <em>Est Sujet Association Objet Inconnu Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetInconnuImpl#getEstObjetAssociationEntiteOrgObjetInconnu <em>Est Objet Association Entite Org Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetInconnuImpl#getEstObjetAssociationPersonneObjetInconnu <em>Est Objet Association Personne Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetInconnuImpl#getEstObjetAssociationSiteObjetInconnu <em>Est Objet Association Site Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetInconnuImpl#getEstObjetAssociationMaterielObjetInconnu <em>Est Objet Association Materiel Objet Inconnu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjetInconnuImpl extends TypeInstanceObjetImpl implements TypeObjetInconnu {
	/**
	 * The default value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntitePolitiqueTrigramme NATIONALITE_EDEFAULT = TypeDictionaryDicoEntitePolitiqueTrigramme.ATG;

	/**
	 * The cached value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntitePolitiqueTrigramme nationalite = NATIONALITE_EDEFAULT;

	/**
	 * This is true if the Nationalite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nationaliteESet;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatOperationnelObjetInconnu() <em>APour Etat Etat Operationnel Objet Inconnu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatOperationnelObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatOperationnelObjetInconnu> aPourEtatEtatOperationnelObjetInconnu;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationObjetInconnuEltCtrl() <em>Est Sujet Association Objet Inconnu Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationObjetInconnuEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationObjetInconnuEltCtrl;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationObjetInconnuEltTopo() <em>Est Sujet Association Objet Inconnu Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationObjetInconnuEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationObjetInconnuEltTopo;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationObjetInconnuSite() <em>Est Sujet Association Objet Inconnu Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationObjetInconnuSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationObjetInconnuSite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEntiteOrgObjetInconnu() <em>Est Objet Association Entite Org Objet Inconnu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEntiteOrgObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEntiteOrgObjetInconnu;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPersonneObjetInconnu() <em>Est Objet Association Personne Objet Inconnu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPersonneObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPersonneObjetInconnu;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationSiteObjetInconnu() <em>Est Objet Association Site Objet Inconnu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationSiteObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationSiteObjetInconnu;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMaterielObjetInconnu() <em>Est Objet Association Materiel Objet Inconnu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMaterielObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMaterielObjetInconnu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjetInconnuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjetInconnu();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite() {
		return nationalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme newNationalite) {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		nationalite = newNationalite == null ? NATIONALITE_EDEFAULT : newNationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationaliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJET_INCONNU__NATIONALITE, oldNationalite, nationalite, !oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNationalite() {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationalite = NATIONALITE_EDEFAULT;
		nationaliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJET_INCONNU__NATIONALITE, oldNationalite, NATIONALITE_EDEFAULT, oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNationalite() {
		return nationaliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatOperationnelObjetInconnu> getAPourEtatEtatOperationnelObjetInconnu() {
		if (aPourEtatEtatOperationnelObjetInconnu == null) {
			aPourEtatEtatOperationnelObjetInconnu = new EObjectContainmentEList<TypeEtatOperationnelObjetInconnu>(TypeEtatOperationnelObjetInconnu.class, this, SchemaPackage.TYPE_OBJET_INCONNU__APOUR_ETAT_ETAT_OPERATIONNEL_OBJET_INCONNU);
		}
		return aPourEtatEtatOperationnelObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationObjetInconnuEltCtrl() {
		if (estSujetAssociationObjetInconnuEltCtrl == null) {
			estSujetAssociationObjetInconnuEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL);
		}
		return estSujetAssociationObjetInconnuEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationObjetInconnuEltTopo() {
		if (estSujetAssociationObjetInconnuEltTopo == null) {
			estSujetAssociationObjetInconnuEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO);
		}
		return estSujetAssociationObjetInconnuEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationObjetInconnuSite() {
		if (estSujetAssociationObjetInconnuSite == null) {
			estSujetAssociationObjetInconnuSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_SITE);
		}
		return estSujetAssociationObjetInconnuSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEntiteOrgObjetInconnu() {
		if (estObjetAssociationEntiteOrgObjetInconnu == null) {
			estObjetAssociationEntiteOrgObjetInconnu = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU);
		}
		return estObjetAssociationEntiteOrgObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPersonneObjetInconnu() {
		if (estObjetAssociationPersonneObjetInconnu == null) {
			estObjetAssociationPersonneObjetInconnu = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_PERSONNE_OBJET_INCONNU);
		}
		return estObjetAssociationPersonneObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationSiteObjetInconnu() {
		if (estObjetAssociationSiteObjetInconnu == null) {
			estObjetAssociationSiteObjetInconnu = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_SITE_OBJET_INCONNU);
		}
		return estObjetAssociationSiteObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMaterielObjetInconnu() {
		if (estObjetAssociationMaterielObjetInconnu == null) {
			estObjetAssociationMaterielObjetInconnu = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_MATERIEL_OBJET_INCONNU);
		}
		return estObjetAssociationMaterielObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJET_INCONNU__APOUR_ETAT_ETAT_OPERATIONNEL_OBJET_INCONNU:
				return ((InternalEList<?>)getAPourEtatEtatOperationnelObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				return ((InternalEList<?>)getEstSujetAssociationObjetInconnuEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				return ((InternalEList<?>)getEstSujetAssociationObjetInconnuEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_SITE:
				return ((InternalEList<?>)getEstSujetAssociationObjetInconnuSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				return ((InternalEList<?>)getEstObjetAssociationEntiteOrgObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				return ((InternalEList<?>)getEstObjetAssociationPersonneObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_SITE_OBJET_INCONNU:
				return ((InternalEList<?>)getEstObjetAssociationSiteObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				return ((InternalEList<?>)getEstObjetAssociationMaterielObjetInconnu()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_OBJET_INCONNU__NATIONALITE:
				return getNationalite();
			case SchemaPackage.TYPE_OBJET_INCONNU__APOUR_ETAT_ETAT_OPERATIONNEL_OBJET_INCONNU:
				return getAPourEtatEtatOperationnelObjetInconnu();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				return getEstSujetAssociationObjetInconnuEltCtrl();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				return getEstSujetAssociationObjetInconnuEltTopo();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_SITE:
				return getEstSujetAssociationObjetInconnuSite();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				return getEstObjetAssociationEntiteOrgObjetInconnu();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				return getEstObjetAssociationPersonneObjetInconnu();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_SITE_OBJET_INCONNU:
				return getEstObjetAssociationSiteObjetInconnu();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				return getEstObjetAssociationMaterielObjetInconnu();
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
			case SchemaPackage.TYPE_OBJET_INCONNU__NATIONALITE:
				setNationalite((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__APOUR_ETAT_ETAT_OPERATIONNEL_OBJET_INCONNU:
				getAPourEtatEtatOperationnelObjetInconnu().clear();
				getAPourEtatEtatOperationnelObjetInconnu().addAll((Collection<? extends TypeEtatOperationnelObjetInconnu>)newValue);
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				getEstSujetAssociationObjetInconnuEltCtrl().clear();
				getEstSujetAssociationObjetInconnuEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				getEstSujetAssociationObjetInconnuEltTopo().clear();
				getEstSujetAssociationObjetInconnuEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_SITE:
				getEstSujetAssociationObjetInconnuSite().clear();
				getEstSujetAssociationObjetInconnuSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				getEstObjetAssociationEntiteOrgObjetInconnu().clear();
				getEstObjetAssociationEntiteOrgObjetInconnu().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				getEstObjetAssociationPersonneObjetInconnu().clear();
				getEstObjetAssociationPersonneObjetInconnu().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_SITE_OBJET_INCONNU:
				getEstObjetAssociationSiteObjetInconnu().clear();
				getEstObjetAssociationSiteObjetInconnu().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				getEstObjetAssociationMaterielObjetInconnu().clear();
				getEstObjetAssociationMaterielObjetInconnu().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_OBJET_INCONNU__NATIONALITE:
				unsetNationalite();
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__APOUR_ETAT_ETAT_OPERATIONNEL_OBJET_INCONNU:
				getAPourEtatEtatOperationnelObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				getEstSujetAssociationObjetInconnuEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				getEstSujetAssociationObjetInconnuEltTopo().clear();
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_SITE:
				getEstSujetAssociationObjetInconnuSite().clear();
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				getEstObjetAssociationEntiteOrgObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				getEstObjetAssociationPersonneObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_SITE_OBJET_INCONNU:
				getEstObjetAssociationSiteObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				getEstObjetAssociationMaterielObjetInconnu().clear();
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
			case SchemaPackage.TYPE_OBJET_INCONNU__NATIONALITE:
				return isSetNationalite();
			case SchemaPackage.TYPE_OBJET_INCONNU__APOUR_ETAT_ETAT_OPERATIONNEL_OBJET_INCONNU:
				return aPourEtatEtatOperationnelObjetInconnu != null && !aPourEtatEtatOperationnelObjetInconnu.isEmpty();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				return estSujetAssociationObjetInconnuEltCtrl != null && !estSujetAssociationObjetInconnuEltCtrl.isEmpty();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				return estSujetAssociationObjetInconnuEltTopo != null && !estSujetAssociationObjetInconnuEltTopo.isEmpty();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_SUJET_ASSOCIATION_OBJET_INCONNU_SITE:
				return estSujetAssociationObjetInconnuSite != null && !estSujetAssociationObjetInconnuSite.isEmpty();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				return estObjetAssociationEntiteOrgObjetInconnu != null && !estObjetAssociationEntiteOrgObjetInconnu.isEmpty();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				return estObjetAssociationPersonneObjetInconnu != null && !estObjetAssociationPersonneObjetInconnu.isEmpty();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_SITE_OBJET_INCONNU:
				return estObjetAssociationSiteObjetInconnu != null && !estObjetAssociationSiteObjetInconnu.isEmpty();
			case SchemaPackage.TYPE_OBJET_INCONNU__EST_OBJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				return estObjetAssociationMaterielObjetInconnu != null && !estObjetAssociationMaterielObjetInconnu.isEmpty();
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
		result.append(" (nationalite: ");
		if (nationaliteESet) result.append(nationalite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeObjetInconnuImpl
