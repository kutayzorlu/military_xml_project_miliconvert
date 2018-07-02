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
import mpia.schema.TypeEntiteOrganisationnelle;
import mpia.schema.TypeEtatLiaison;
import mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle;

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
 * An implementation of the model object '<em><b>Type Entite Organisationnelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getCodeIdentification <em>Code Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getAPourTypeAssocEntiteOrgTypeEntiteOrg <em>APour Type Assoc Entite Org Type Entite Org</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getAPourEtatEtatOperationnelEntiteOrganisationnelle <em>APour Etat Etat Operationnel Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstSujetAssociationEntiteOrgEntiteOrg <em>Est Sujet Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstObjetAssociationEntiteOrgEntiteOrg <em>Est Objet Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstSujetAssociationEntiteOrgMateriel <em>Est Sujet Association Entite Org Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstSujetAssociationEntiteOrgPersonne <em>Est Sujet Association Entite Org Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstSujetAssociationEntiteOrgAction <em>Est Sujet Association Entite Org Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstSujetAssociationEntiteOrgEvenement <em>Est Sujet Association Entite Org Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstSujetAssociationEntiteOrgSite <em>Est Sujet Association Entite Org Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstSujetAssociationEntiteOrgEltCtrl <em>Est Sujet Association Entite Org Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getAPourEtatLiaisonEtatLiaison <em>APour Etat Liaison Etat Liaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getRedigeRapport <em>Redige Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstEntitePlusHautNiveauArticulation <em>Est Entite Plus Haut Niveau Articulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstCreateurRegleEngagement <em>Est Createur Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre <em>ARole Dans Association Entite Organisationnelle Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle <em>APour Role Dans Association Groupe Info Ops Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstSujetAssociationEntiteOrgEltTopo <em>Est Sujet Association Entite Org Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntiteOrganisationnelleImpl#getEstSujetAssociationEntiteOrgObjetInconnu <em>Est Sujet Association Entite Org Objet Inconnu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeEntiteOrganisationnelleImpl extends TypeInstanceObjetImpl implements TypeEntiteOrganisationnelle {
	/**
	 * The default value of the '{@link #getCodeIdentification() <em>Code Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeIdentification() <em>Code Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeIdentification()
	 * @generated
	 * @ordered
	 */
	protected String codeIdentification = CODE_IDENTIFICATION_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourTypeAssocEntiteOrgTypeEntiteOrg() <em>APour Type Assoc Entite Org Type Entite Org</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeAssocEntiteOrgTypeEntiteOrg()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourTypeAssocEntiteOrgTypeEntiteOrg;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatOperationnelEntiteOrganisationnelle() <em>APour Etat Etat Operationnel Entite Organisationnelle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatOperationnelEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatOperationnelEntiteOrganisationnelle> aPourEtatEtatOperationnelEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEntiteOrgEntiteOrg() <em>Est Sujet Association Entite Org Entite Org</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEntiteOrgEntiteOrg()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEntiteOrgEntiteOrg;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEntiteOrgEntiteOrg() <em>Est Objet Association Entite Org Entite Org</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEntiteOrgEntiteOrg()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEntiteOrgEntiteOrg;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEntiteOrgMateriel() <em>Est Sujet Association Entite Org Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEntiteOrgMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEntiteOrgMateriel;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEntiteOrgPersonne() <em>Est Sujet Association Entite Org Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEntiteOrgPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEntiteOrgPersonne;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEntiteOrgAction() <em>Est Sujet Association Entite Org Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEntiteOrgAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEntiteOrgAction;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEntiteOrgEvenement() <em>Est Sujet Association Entite Org Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEntiteOrgEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEntiteOrgEvenement;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEntiteOrgSite() <em>Est Sujet Association Entite Org Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEntiteOrgSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEntiteOrgSite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEntiteOrgEltCtrl() <em>Est Sujet Association Entite Org Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEntiteOrgEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEntiteOrgEltCtrl;

	/**
	 * The cached value of the '{@link #getAPourEtatLiaisonEtatLiaison() <em>APour Etat Liaison Etat Liaison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatLiaisonEtatLiaison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatLiaison> aPourEtatLiaisonEtatLiaison;

	/**
	 * The cached value of the '{@link #getRedigeRapport() <em>Redige Rapport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedigeRapport()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> redigeRapport;

	/**
	 * The cached value of the '{@link #getEstEntitePlusHautNiveauArticulation() <em>Est Entite Plus Haut Niveau Articulation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEntitePlusHautNiveauArticulation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estEntitePlusHautNiveauArticulation;

	/**
	 * The cached value of the '{@link #getEstCreateurRegleEngagement() <em>Est Createur Regle Engagement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCreateurRegleEngagement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estCreateurRegleEngagement;

	/**
	 * The cached value of the '{@link #getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre() <em>ARole Dans Association Entite Organisationnelle Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aRoleDansAssociationEntiteOrganisationnellePlanOuOrdre;

	/**
	 * The cached value of the '{@link #getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle() <em>APour Role Dans Association Groupe Info Ops Entite Organisationnelle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEntiteOrgEltTopo() <em>Est Sujet Association Entite Org Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEntiteOrgEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEntiteOrgEltTopo;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEntiteOrgObjetInconnu() <em>Est Sujet Association Entite Org Objet Inconnu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEntiteOrgObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEntiteOrgObjetInconnu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEntiteOrganisationnelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEntiteOrganisationnelle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeIdentification() {
		return codeIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeIdentification(String newCodeIdentification) {
		String oldCodeIdentification = codeIdentification;
		codeIdentification = newCodeIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__CODE_IDENTIFICATION, oldCodeIdentification, codeIdentification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__NATIONALITE, oldNationalite, nationalite, !oldNationaliteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__NATIONALITE, oldNationalite, NATIONALITE_EDEFAULT, oldNationaliteESet));
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
	public EList<TypeAssociation> getAPourTypeAssocEntiteOrgTypeEntiteOrg() {
		if (aPourTypeAssocEntiteOrgTypeEntiteOrg == null) {
			aPourTypeAssocEntiteOrgTypeEntiteOrg = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG);
		}
		return aPourTypeAssocEntiteOrgTypeEntiteOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatOperationnelEntiteOrganisationnelle> getAPourEtatEtatOperationnelEntiteOrganisationnelle() {
		if (aPourEtatEtatOperationnelEntiteOrganisationnelle == null) {
			aPourEtatEtatOperationnelEntiteOrganisationnelle = new EObjectContainmentEList<TypeEtatOperationnelEntiteOrganisationnelle>(TypeEtatOperationnelEntiteOrganisationnelle.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE);
		}
		return aPourEtatEtatOperationnelEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEntiteOrgEntiteOrg() {
		if (estSujetAssociationEntiteOrgEntiteOrg == null) {
			estSujetAssociationEntiteOrgEntiteOrg = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG);
		}
		return estSujetAssociationEntiteOrgEntiteOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEntiteOrgEntiteOrg() {
		if (estObjetAssociationEntiteOrgEntiteOrg == null) {
			estObjetAssociationEntiteOrgEntiteOrg = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG);
		}
		return estObjetAssociationEntiteOrgEntiteOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEntiteOrgMateriel() {
		if (estSujetAssociationEntiteOrgMateriel == null) {
			estSujetAssociationEntiteOrgMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_MATERIEL);
		}
		return estSujetAssociationEntiteOrgMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEntiteOrgPersonne() {
		if (estSujetAssociationEntiteOrgPersonne == null) {
			estSujetAssociationEntiteOrgPersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_PERSONNE);
		}
		return estSujetAssociationEntiteOrgPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEntiteOrgAction() {
		if (estSujetAssociationEntiteOrgAction == null) {
			estSujetAssociationEntiteOrgAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ACTION);
		}
		return estSujetAssociationEntiteOrgAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEntiteOrgEvenement() {
		if (estSujetAssociationEntiteOrgEvenement == null) {
			estSujetAssociationEntiteOrgEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_EVENEMENT);
		}
		return estSujetAssociationEntiteOrgEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEntiteOrgSite() {
		if (estSujetAssociationEntiteOrgSite == null) {
			estSujetAssociationEntiteOrgSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_SITE);
		}
		return estSujetAssociationEntiteOrgSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEntiteOrgEltCtrl() {
		if (estSujetAssociationEntiteOrgEltCtrl == null) {
			estSujetAssociationEntiteOrgEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL);
		}
		return estSujetAssociationEntiteOrgEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatLiaison> getAPourEtatLiaisonEtatLiaison() {
		if (aPourEtatLiaisonEtatLiaison == null) {
			aPourEtatLiaisonEtatLiaison = new EObjectContainmentEList<TypeEtatLiaison>(TypeEtatLiaison.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_LIAISON_ETAT_LIAISON);
		}
		return aPourEtatLiaisonEtatLiaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getRedigeRapport() {
		if (redigeRapport == null) {
			redigeRapport = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__REDIGE_RAPPORT);
		}
		return redigeRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstEntitePlusHautNiveauArticulation() {
		if (estEntitePlusHautNiveauArticulation == null) {
			estEntitePlusHautNiveauArticulation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_ENTITE_PLUS_HAUT_NIVEAU_ARTICULATION);
		}
		return estEntitePlusHautNiveauArticulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstCreateurRegleEngagement() {
		if (estCreateurRegleEngagement == null) {
			estCreateurRegleEngagement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_CREATEUR_REGLE_ENGAGEMENT);
		}
		return estCreateurRegleEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre() {
		if (aRoleDansAssociationEntiteOrganisationnellePlanOuOrdre == null) {
			aRoleDansAssociationEntiteOrganisationnellePlanOuOrdre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__AROLE_DANS_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE);
		}
		return aRoleDansAssociationEntiteOrganisationnellePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle() {
		if (aPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle == null) {
			aPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ROLE_DANS_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE);
		}
		return aPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEntiteOrgEltTopo() {
		if (estSujetAssociationEntiteOrgEltTopo == null) {
			estSujetAssociationEntiteOrgEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO);
		}
		return estSujetAssociationEntiteOrgEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEntiteOrgObjetInconnu() {
		if (estSujetAssociationEntiteOrgObjetInconnu == null) {
			estSujetAssociationEntiteOrgObjetInconnu = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU);
		}
		return estSujetAssociationEntiteOrgObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				return ((InternalEList<?>)getAPourTypeAssocEntiteOrgTypeEntiteOrg()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE:
				return ((InternalEList<?>)getAPourEtatEtatOperationnelEntiteOrganisationnelle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return ((InternalEList<?>)getEstSujetAssociationEntiteOrgEntiteOrg()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return ((InternalEList<?>)getEstObjetAssociationEntiteOrgEntiteOrg()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				return ((InternalEList<?>)getEstSujetAssociationEntiteOrgMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				return ((InternalEList<?>)getEstSujetAssociationEntiteOrgPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ACTION:
				return ((InternalEList<?>)getEstSujetAssociationEntiteOrgAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationEntiteOrgEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_SITE:
				return ((InternalEList<?>)getEstSujetAssociationEntiteOrgSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				return ((InternalEList<?>)getEstSujetAssociationEntiteOrgEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_LIAISON_ETAT_LIAISON:
				return ((InternalEList<?>)getAPourEtatLiaisonEtatLiaison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__REDIGE_RAPPORT:
				return ((InternalEList<?>)getRedigeRapport()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_ENTITE_PLUS_HAUT_NIVEAU_ARTICULATION:
				return ((InternalEList<?>)getEstEntitePlusHautNiveauArticulation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_CREATEUR_REGLE_ENGAGEMENT:
				return ((InternalEList<?>)getEstCreateurRegleEngagement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__AROLE_DANS_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ROLE_DANS_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				return ((InternalEList<?>)getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				return ((InternalEList<?>)getEstSujetAssociationEntiteOrgEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				return ((InternalEList<?>)getEstSujetAssociationEntiteOrgObjetInconnu()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__CODE_IDENTIFICATION:
				return getCodeIdentification();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__NATIONALITE:
				return getNationalite();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				return getAPourTypeAssocEntiteOrgTypeEntiteOrg();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE:
				return getAPourEtatEtatOperationnelEntiteOrganisationnelle();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return getEstSujetAssociationEntiteOrgEntiteOrg();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return getEstObjetAssociationEntiteOrgEntiteOrg();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				return getEstSujetAssociationEntiteOrgMateriel();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				return getEstSujetAssociationEntiteOrgPersonne();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ACTION:
				return getEstSujetAssociationEntiteOrgAction();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				return getEstSujetAssociationEntiteOrgEvenement();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_SITE:
				return getEstSujetAssociationEntiteOrgSite();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				return getEstSujetAssociationEntiteOrgEltCtrl();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_LIAISON_ETAT_LIAISON:
				return getAPourEtatLiaisonEtatLiaison();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__REDIGE_RAPPORT:
				return getRedigeRapport();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_ENTITE_PLUS_HAUT_NIVEAU_ARTICULATION:
				return getEstEntitePlusHautNiveauArticulation();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_CREATEUR_REGLE_ENGAGEMENT:
				return getEstCreateurRegleEngagement();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__AROLE_DANS_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				return getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ROLE_DANS_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				return getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				return getEstSujetAssociationEntiteOrgEltTopo();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				return getEstSujetAssociationEntiteOrgObjetInconnu();
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
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__CODE_IDENTIFICATION:
				setCodeIdentification((String)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__NATIONALITE:
				setNationalite((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				getAPourTypeAssocEntiteOrgTypeEntiteOrg().clear();
				getAPourTypeAssocEntiteOrgTypeEntiteOrg().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE:
				getAPourEtatEtatOperationnelEntiteOrganisationnelle().clear();
				getAPourEtatEtatOperationnelEntiteOrganisationnelle().addAll((Collection<? extends TypeEtatOperationnelEntiteOrganisationnelle>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				getEstSujetAssociationEntiteOrgEntiteOrg().clear();
				getEstSujetAssociationEntiteOrgEntiteOrg().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				getEstObjetAssociationEntiteOrgEntiteOrg().clear();
				getEstObjetAssociationEntiteOrgEntiteOrg().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				getEstSujetAssociationEntiteOrgMateriel().clear();
				getEstSujetAssociationEntiteOrgMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				getEstSujetAssociationEntiteOrgPersonne().clear();
				getEstSujetAssociationEntiteOrgPersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ACTION:
				getEstSujetAssociationEntiteOrgAction().clear();
				getEstSujetAssociationEntiteOrgAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				getEstSujetAssociationEntiteOrgEvenement().clear();
				getEstSujetAssociationEntiteOrgEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_SITE:
				getEstSujetAssociationEntiteOrgSite().clear();
				getEstSujetAssociationEntiteOrgSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				getEstSujetAssociationEntiteOrgEltCtrl().clear();
				getEstSujetAssociationEntiteOrgEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_LIAISON_ETAT_LIAISON:
				getAPourEtatLiaisonEtatLiaison().clear();
				getAPourEtatLiaisonEtatLiaison().addAll((Collection<? extends TypeEtatLiaison>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__REDIGE_RAPPORT:
				getRedigeRapport().clear();
				getRedigeRapport().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_ENTITE_PLUS_HAUT_NIVEAU_ARTICULATION:
				getEstEntitePlusHautNiveauArticulation().clear();
				getEstEntitePlusHautNiveauArticulation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_CREATEUR_REGLE_ENGAGEMENT:
				getEstCreateurRegleEngagement().clear();
				getEstCreateurRegleEngagement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__AROLE_DANS_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre().clear();
				getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ROLE_DANS_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle().clear();
				getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				getEstSujetAssociationEntiteOrgEltTopo().clear();
				getEstSujetAssociationEntiteOrgEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				getEstSujetAssociationEntiteOrgObjetInconnu().clear();
				getEstSujetAssociationEntiteOrgObjetInconnu().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__CODE_IDENTIFICATION:
				setCodeIdentification(CODE_IDENTIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__NATIONALITE:
				unsetNationalite();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				getAPourTypeAssocEntiteOrgTypeEntiteOrg().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE:
				getAPourEtatEtatOperationnelEntiteOrganisationnelle().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				getEstSujetAssociationEntiteOrgEntiteOrg().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				getEstObjetAssociationEntiteOrgEntiteOrg().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				getEstSujetAssociationEntiteOrgMateriel().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				getEstSujetAssociationEntiteOrgPersonne().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ACTION:
				getEstSujetAssociationEntiteOrgAction().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				getEstSujetAssociationEntiteOrgEvenement().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_SITE:
				getEstSujetAssociationEntiteOrgSite().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				getEstSujetAssociationEntiteOrgEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_LIAISON_ETAT_LIAISON:
				getAPourEtatLiaisonEtatLiaison().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__REDIGE_RAPPORT:
				getRedigeRapport().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_ENTITE_PLUS_HAUT_NIVEAU_ARTICULATION:
				getEstEntitePlusHautNiveauArticulation().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_CREATEUR_REGLE_ENGAGEMENT:
				getEstCreateurRegleEngagement().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__AROLE_DANS_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ROLE_DANS_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				getEstSujetAssociationEntiteOrgEltTopo().clear();
				return;
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				getEstSujetAssociationEntiteOrgObjetInconnu().clear();
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
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__CODE_IDENTIFICATION:
				return CODE_IDENTIFICATION_EDEFAULT == null ? codeIdentification != null : !CODE_IDENTIFICATION_EDEFAULT.equals(codeIdentification);
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__NATIONALITE:
				return isSetNationalite();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG:
				return aPourTypeAssocEntiteOrgTypeEntiteOrg != null && !aPourTypeAssocEntiteOrgTypeEntiteOrg.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE:
				return aPourEtatEtatOperationnelEntiteOrganisationnelle != null && !aPourEtatEtatOperationnelEntiteOrganisationnelle.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return estSujetAssociationEntiteOrgEntiteOrg != null && !estSujetAssociationEntiteOrgEntiteOrg.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return estObjetAssociationEntiteOrgEntiteOrg != null && !estObjetAssociationEntiteOrgEntiteOrg.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				return estSujetAssociationEntiteOrgMateriel != null && !estSujetAssociationEntiteOrgMateriel.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				return estSujetAssociationEntiteOrgPersonne != null && !estSujetAssociationEntiteOrgPersonne.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ACTION:
				return estSujetAssociationEntiteOrgAction != null && !estSujetAssociationEntiteOrgAction.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_EVENEMENT:
				return estSujetAssociationEntiteOrgEvenement != null && !estSujetAssociationEntiteOrgEvenement.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_SITE:
				return estSujetAssociationEntiteOrgSite != null && !estSujetAssociationEntiteOrgSite.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_CTRL:
				return estSujetAssociationEntiteOrgEltCtrl != null && !estSujetAssociationEntiteOrgEltCtrl.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_LIAISON_ETAT_LIAISON:
				return aPourEtatLiaisonEtatLiaison != null && !aPourEtatLiaisonEtatLiaison.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__REDIGE_RAPPORT:
				return redigeRapport != null && !redigeRapport.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_ENTITE_PLUS_HAUT_NIVEAU_ARTICULATION:
				return estEntitePlusHautNiveauArticulation != null && !estEntitePlusHautNiveauArticulation.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_CREATEUR_REGLE_ENGAGEMENT:
				return estCreateurRegleEngagement != null && !estCreateurRegleEngagement.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__AROLE_DANS_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				return aRoleDansAssociationEntiteOrganisationnellePlanOuOrdre != null && !aRoleDansAssociationEntiteOrganisationnellePlanOuOrdre.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__APOUR_ROLE_DANS_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				return aPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle != null && !aPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				return estSujetAssociationEntiteOrgEltTopo != null && !estSujetAssociationEntiteOrgEltTopo.isEmpty();
			case SchemaPackage.TYPE_ENTITE_ORGANISATIONNELLE__EST_SUJET_ASSOCIATION_ENTITE_ORG_OBJET_INCONNU:
				return estSujetAssociationEntiteOrgObjetInconnu != null && !estSujetAssociationEntiteOrgObjetInconnu.isEmpty();
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
		result.append(" (codeIdentification: ");
		result.append(codeIdentification);
		result.append(", nationalite: ");
		if (nationaliteESet) result.append(nationalite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEntiteOrganisationnelleImpl
