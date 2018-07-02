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
import mpia.schema.TypeElementControle;
import mpia.schema.TypeEtatOperationnelElementControle;

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
 * An implementation of the model object '<em><b>Type Element Controle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getAPourTypeAssociationEltCtrlTypeEltCtrl <em>APour Type Association Elt Ctrl Type Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getAPourEtatEtatOperationnelElementControle <em>APour Etat Etat Operationnel Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstObjetAssociationEntiteOrgEltCtrl <em>Est Objet Association Entite Org Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstSujetAssociationEltCtrlEltCtrl <em>Est Sujet Association Elt Ctrl Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstObjetAssociationEltCtrlEltCtrl <em>Est Objet Association Elt Ctrl Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstSujetAssociationEltCtrlEltTopo <em>Est Sujet Association Elt Ctrl Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstSujetAssociationEltCtrlSite <em>Est Sujet Association Elt Ctrl Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstSujetAssociationElementControleEvenement <em>Est Sujet Association Element Controle Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstObjetAssociationSiteEltCtrl <em>Est Objet Association Site Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstObjetAssociationPersonneEltCtrl <em>Est Objet Association Personne Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstObjetAssociationMaterielEltCtrl <em>Est Objet Association Materiel Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstSujetAssociationEltCtrlMateriel <em>Est Sujet Association Elt Ctrl Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementControleImpl#getEstObjetAssociationObjetInconnuEltCtrl <em>Est Objet Association Objet Inconnu Elt Ctrl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeElementControleImpl extends TypeInstanceObjetImpl implements TypeElementControle {
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
	 * The cached value of the '{@link #getAPourTypeAssociationEltCtrlTypeEltCtrl() <em>APour Type Association Elt Ctrl Type Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeAssociationEltCtrlTypeEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourTypeAssociationEltCtrlTypeEltCtrl;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatOperationnelElementControle() <em>APour Etat Etat Operationnel Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatOperationnelElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatOperationnelElementControle> aPourEtatEtatOperationnelElementControle;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEntiteOrgEltCtrl() <em>Est Objet Association Entite Org Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEntiteOrgEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEntiteOrgEltCtrl;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEltCtrlEltCtrl() <em>Est Sujet Association Elt Ctrl Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEltCtrlEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEltCtrlEltCtrl;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEltCtrlEltCtrl() <em>Est Objet Association Elt Ctrl Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEltCtrlEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEltCtrlEltCtrl;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEltCtrlEltTopo() <em>Est Sujet Association Elt Ctrl Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEltCtrlEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEltCtrlEltTopo;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEltCtrlSite() <em>Est Sujet Association Elt Ctrl Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEltCtrlSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEltCtrlSite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationElementControleEvenement() <em>Est Sujet Association Element Controle Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationElementControleEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationElementControleEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationSiteEltCtrl() <em>Est Objet Association Site Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationSiteEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationSiteEltCtrl;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPersonneEltCtrl() <em>Est Objet Association Personne Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPersonneEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPersonneEltCtrl;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMaterielEltCtrl() <em>Est Objet Association Materiel Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMaterielEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMaterielEltCtrl;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEltCtrlMateriel() <em>Est Sujet Association Elt Ctrl Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEltCtrlMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEltCtrlMateriel;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationObjetInconnuEltCtrl() <em>Est Objet Association Objet Inconnu Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationObjetInconnuEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationObjetInconnuEltCtrl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeElementControleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeElementControle();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_CONTROLE__NATIONALITE, oldNationalite, nationalite, !oldNationaliteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_CONTROLE__NATIONALITE, oldNationalite, NATIONALITE_EDEFAULT, oldNationaliteESet));
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
	public EList<TypeAssociation> getAPourTypeAssociationEltCtrlTypeEltCtrl() {
		if (aPourTypeAssociationEltCtrlTypeEltCtrl == null) {
			aPourTypeAssociationEltCtrlTypeEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL);
		}
		return aPourTypeAssociationEltCtrlTypeEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatOperationnelElementControle> getAPourEtatEtatOperationnelElementControle() {
		if (aPourEtatEtatOperationnelElementControle == null) {
			aPourEtatEtatOperationnelElementControle = new EObjectContainmentEList<TypeEtatOperationnelElementControle>(TypeEtatOperationnelElementControle.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_CONTROLE);
		}
		return aPourEtatEtatOperationnelElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEntiteOrgEltCtrl() {
		if (estObjetAssociationEntiteOrgEltCtrl == null) {
			estObjetAssociationEntiteOrgEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL);
		}
		return estObjetAssociationEntiteOrgEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEltCtrlEltCtrl() {
		if (estSujetAssociationEltCtrlEltCtrl == null) {
			estSujetAssociationEltCtrlEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_CTRL);
		}
		return estSujetAssociationEltCtrlEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEltCtrlEltCtrl() {
		if (estObjetAssociationEltCtrlEltCtrl == null) {
			estObjetAssociationEltCtrlEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_CTRL);
		}
		return estObjetAssociationEltCtrlEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEltCtrlEltTopo() {
		if (estSujetAssociationEltCtrlEltTopo == null) {
			estSujetAssociationEltCtrlEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_TOPO);
		}
		return estSujetAssociationEltCtrlEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEltCtrlSite() {
		if (estSujetAssociationEltCtrlSite == null) {
			estSujetAssociationEltCtrlSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_SITE);
		}
		return estSujetAssociationEltCtrlSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationElementControleEvenement() {
		if (estSujetAssociationElementControleEvenement == null) {
			estSujetAssociationElementControleEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT);
		}
		return estSujetAssociationElementControleEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationSiteEltCtrl() {
		if (estObjetAssociationSiteEltCtrl == null) {
			estObjetAssociationSiteEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_SITE_ELT_CTRL);
		}
		return estObjetAssociationSiteEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPersonneEltCtrl() {
		if (estObjetAssociationPersonneEltCtrl == null) {
			estObjetAssociationPersonneEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_CTRL);
		}
		return estObjetAssociationPersonneEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMaterielEltCtrl() {
		if (estObjetAssociationMaterielEltCtrl == null) {
			estObjetAssociationMaterielEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_CTRL);
		}
		return estObjetAssociationMaterielEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEltCtrlMateriel() {
		if (estSujetAssociationEltCtrlMateriel == null) {
			estSujetAssociationEltCtrlMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_MATERIEL);
		}
		return estSujetAssociationEltCtrlMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationObjetInconnuEltCtrl() {
		if (estObjetAssociationObjetInconnuEltCtrl == null) {
			estObjetAssociationObjetInconnuEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL);
		}
		return estObjetAssociationObjetInconnuEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				return ((InternalEList<?>)getAPourTypeAssociationEltCtrlTypeEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourEtatEtatOperationnelElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				return ((InternalEList<?>)getEstObjetAssociationEntiteOrgEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				return ((InternalEList<?>)getEstSujetAssociationEltCtrlEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				return ((InternalEList<?>)getEstObjetAssociationEltCtrlEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				return ((InternalEList<?>)getEstSujetAssociationEltCtrlEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_SITE:
				return ((InternalEList<?>)getEstSujetAssociationEltCtrlSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationElementControleEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_SITE_ELT_CTRL:
				return ((InternalEList<?>)getEstObjetAssociationSiteEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				return ((InternalEList<?>)getEstObjetAssociationPersonneEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				return ((InternalEList<?>)getEstObjetAssociationMaterielEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				return ((InternalEList<?>)getEstSujetAssociationEltCtrlMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				return ((InternalEList<?>)getEstObjetAssociationObjetInconnuEltCtrl()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__NATIONALITE:
				return getNationalite();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				return getAPourTypeAssociationEltCtrlTypeEltCtrl();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_CONTROLE:
				return getAPourEtatEtatOperationnelElementControle();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				return getEstObjetAssociationEntiteOrgEltCtrl();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				return getEstSujetAssociationEltCtrlEltCtrl();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				return getEstObjetAssociationEltCtrlEltCtrl();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				return getEstSujetAssociationEltCtrlEltTopo();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_SITE:
				return getEstSujetAssociationEltCtrlSite();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				return getEstSujetAssociationElementControleEvenement();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_SITE_ELT_CTRL:
				return getEstObjetAssociationSiteEltCtrl();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				return getEstObjetAssociationPersonneEltCtrl();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				return getEstObjetAssociationMaterielEltCtrl();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				return getEstSujetAssociationEltCtrlMateriel();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				return getEstObjetAssociationObjetInconnuEltCtrl();
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
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__NATIONALITE:
				setNationalite((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				getAPourTypeAssociationEltCtrlTypeEltCtrl().clear();
				getAPourTypeAssociationEltCtrlTypeEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_CONTROLE:
				getAPourEtatEtatOperationnelElementControle().clear();
				getAPourEtatEtatOperationnelElementControle().addAll((Collection<? extends TypeEtatOperationnelElementControle>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				getEstObjetAssociationEntiteOrgEltCtrl().clear();
				getEstObjetAssociationEntiteOrgEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				getEstSujetAssociationEltCtrlEltCtrl().clear();
				getEstSujetAssociationEltCtrlEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				getEstObjetAssociationEltCtrlEltCtrl().clear();
				getEstObjetAssociationEltCtrlEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				getEstSujetAssociationEltCtrlEltTopo().clear();
				getEstSujetAssociationEltCtrlEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_SITE:
				getEstSujetAssociationEltCtrlSite().clear();
				getEstSujetAssociationEltCtrlSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				getEstSujetAssociationElementControleEvenement().clear();
				getEstSujetAssociationElementControleEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_SITE_ELT_CTRL:
				getEstObjetAssociationSiteEltCtrl().clear();
				getEstObjetAssociationSiteEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				getEstObjetAssociationPersonneEltCtrl().clear();
				getEstObjetAssociationPersonneEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				getEstObjetAssociationMaterielEltCtrl().clear();
				getEstObjetAssociationMaterielEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				getEstSujetAssociationEltCtrlMateriel().clear();
				getEstSujetAssociationEltCtrlMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				getEstObjetAssociationObjetInconnuEltCtrl().clear();
				getEstObjetAssociationObjetInconnuEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__NATIONALITE:
				unsetNationalite();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				getAPourTypeAssociationEltCtrlTypeEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_CONTROLE:
				getAPourEtatEtatOperationnelElementControle().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				getEstObjetAssociationEntiteOrgEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				getEstSujetAssociationEltCtrlEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				getEstObjetAssociationEltCtrlEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				getEstSujetAssociationEltCtrlEltTopo().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_SITE:
				getEstSujetAssociationEltCtrlSite().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				getEstSujetAssociationElementControleEvenement().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_SITE_ELT_CTRL:
				getEstObjetAssociationSiteEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				getEstObjetAssociationPersonneEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				getEstObjetAssociationMaterielEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				getEstSujetAssociationEltCtrlMateriel().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				getEstObjetAssociationObjetInconnuEltCtrl().clear();
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
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__NATIONALITE:
				return isSetNationalite();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL:
				return aPourTypeAssociationEltCtrlTypeEltCtrl != null && !aPourTypeAssociationEltCtrlTypeEltCtrl.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_CONTROLE:
				return aPourEtatEtatOperationnelElementControle != null && !aPourEtatEtatOperationnelElementControle.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				return estObjetAssociationEntiteOrgEltCtrl != null && !estObjetAssociationEntiteOrgEltCtrl.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				return estSujetAssociationEltCtrlEltCtrl != null && !estSujetAssociationEltCtrlEltCtrl.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_CTRL:
				return estObjetAssociationEltCtrlEltCtrl != null && !estObjetAssociationEltCtrlEltCtrl.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				return estSujetAssociationEltCtrlEltTopo != null && !estSujetAssociationEltCtrlEltTopo.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_SITE:
				return estSujetAssociationEltCtrlSite != null && !estSujetAssociationEltCtrlSite.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELEMENT_CONTROLE_EVENEMENT:
				return estSujetAssociationElementControleEvenement != null && !estSujetAssociationElementControleEvenement.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_SITE_ELT_CTRL:
				return estObjetAssociationSiteEltCtrl != null && !estObjetAssociationSiteEltCtrl.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				return estObjetAssociationPersonneEltCtrl != null && !estObjetAssociationPersonneEltCtrl.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				return estObjetAssociationMaterielEltCtrl != null && !estObjetAssociationMaterielEltCtrl.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_SUJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				return estSujetAssociationEltCtrlMateriel != null && !estSujetAssociationEltCtrlMateriel.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_CONTROLE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_CTRL:
				return estObjetAssociationObjetInconnuEltCtrl != null && !estObjetAssociationObjetInconnuEltCtrl.isEmpty();
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

} //TypeElementControleImpl
