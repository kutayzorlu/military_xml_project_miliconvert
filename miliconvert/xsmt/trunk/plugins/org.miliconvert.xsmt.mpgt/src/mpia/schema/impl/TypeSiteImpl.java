/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCamp;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;
import mpia.schema.TypeDictionaryDicoSiteMateriauPrincipalConstruction;
import mpia.schema.TypeEtatOperationnelSite;
import mpia.schema.TypeLiaisonPhysique;
import mpia.schema.TypeSite;
import mpia.schema.TypeSiteProduction;
import mpia.schema.TypeSiteSoin;
import mpia.schema.TypeZoneIntervention;
import mpia.schema.TypeZoneRisque;

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
 * An implementation of the model object '<em><b>Type Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getProfondeur <em>Profondeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getCapaciteAccueil <em>Capacite Accueil</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getCapaciteHebergement <em>Capacite Hebergement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getDescriptionHebergement <em>Description Hebergement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getMateriauPrincipalConstruction <em>Materiau Principal Construction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getAPourTypeAssociationSiteTypeSite <em>APour Type Association Site Type Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getAPourEtatEtatOperationnelSite <em>APour Etat Etat Operationnel Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstObjetAssociationEntiteOrgSite <em>Est Objet Association Entite Org Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getCaracZoneRisqueZoneRisque <em>Carac Zone Risque Zone Risque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getCaracAutreZoneInterventionZoneIntervention <em>Carac Autre Zone Intervention Zone Intervention</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getCaracCampCamp <em>Carac Camp Camp</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getCaracSiteSoinSiteSoin <em>Carac Site Soin Site Soin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getCaracSiteProductionSiteProduction <em>Carac Site Production Site Production</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getCaracLiaisonPhysiqueLiaisonPhysique <em>Carac Liaison Physique Liaison Physique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstSujetAssociationSiteEvenement <em>Est Sujet Association Site Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstSujetAssociationSiteEltCtrl <em>Est Sujet Association Site Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstObjetAssociationSiteSite <em>Est Objet Association Site Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstSujetAssociationSiteSite <em>Est Sujet Association Site Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique <em>APour Caracteristique Logistique Caracteristique Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstObjetAssociationEltCtrlSite <em>Est Objet Association Elt Ctrl Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstObjetAssociationEltTopoSite <em>Est Objet Association Elt Topo Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstSujetAssociationSiteEltTopo <em>Est Sujet Association Site Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstObjetAssociationMaterielSite <em>Est Objet Association Materiel Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstSujetAssociationSiteMateriel <em>Est Sujet Association Site Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstObjetAssociationPersonneSite <em>Est Objet Association Personne Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstObjetAssociationMeteorologieSite <em>Est Objet Association Meteorologie Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstSujetAssociationSiteMeteorologie <em>Est Sujet Association Site Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstObjetAssociationObjetInconnuSite <em>Est Objet Association Objet Inconnu Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteImpl#getEstSujetAssociationSiteObjetInconnu <em>Est Sujet Association Site Objet Inconnu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeSiteImpl extends TypeInstanceObjetImpl implements TypeSite {
	/**
	 * The default value of the '{@link #getIdentification() <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentification() <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected String identification = IDENTIFICATION_EDEFAULT;

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
	 * The cached value of the '{@link #getLongueur() <em>Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueur;

	/**
	 * The cached value of the '{@link #getLargeur() <em>Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeur;

	/**
	 * The cached value of the '{@link #getProfondeur() <em>Profondeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur profondeur;

	/**
	 * The cached value of the '{@link #getHauteur() <em>Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteur;

	/**
	 * The default value of the '{@link #getCapaciteAccueil() <em>Capacite Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteAccueil()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_ACCUEIL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteAccueil() <em>Capacite Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteAccueil()
	 * @generated
	 * @ordered
	 */
	protected long capaciteAccueil = CAPACITE_ACCUEIL_EDEFAULT;

	/**
	 * This is true if the Capacite Accueil attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteAccueilESet;

	/**
	 * The default value of the '{@link #getCapaciteHebergement() <em>Capacite Hebergement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteHebergement()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_HEBERGEMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteHebergement() <em>Capacite Hebergement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteHebergement()
	 * @generated
	 * @ordered
	 */
	protected long capaciteHebergement = CAPACITE_HEBERGEMENT_EDEFAULT;

	/**
	 * This is true if the Capacite Hebergement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteHebergementESet;

	/**
	 * The default value of the '{@link #getDescriptionHebergement() <em>Description Hebergement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionHebergement()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_HEBERGEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionHebergement() <em>Description Hebergement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionHebergement()
	 * @generated
	 * @ordered
	 */
	protected String descriptionHebergement = DESCRIPTION_HEBERGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMateriauPrincipalConstruction() <em>Materiau Principal Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMateriauPrincipalConstruction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSiteMateriauPrincipalConstruction MATERIAU_PRINCIPAL_CONSTRUCTION_EDEFAULT = TypeDictionaryDicoSiteMateriauPrincipalConstruction.ASPHLT;

	/**
	 * The cached value of the '{@link #getMateriauPrincipalConstruction() <em>Materiau Principal Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMateriauPrincipalConstruction()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSiteMateriauPrincipalConstruction materiauPrincipalConstruction = MATERIAU_PRINCIPAL_CONSTRUCTION_EDEFAULT;

	/**
	 * This is true if the Materiau Principal Construction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean materiauPrincipalConstructionESet;

	/**
	 * The cached value of the '{@link #getAPourTypeAssociationSiteTypeSite() <em>APour Type Association Site Type Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeAssociationSiteTypeSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourTypeAssociationSiteTypeSite;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatOperationnelSite() <em>APour Etat Etat Operationnel Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatOperationnelSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatOperationnelSite> aPourEtatEtatOperationnelSite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEntiteOrgSite() <em>Est Objet Association Entite Org Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEntiteOrgSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEntiteOrgSite;

	/**
	 * The cached value of the '{@link #getCaracZoneRisqueZoneRisque() <em>Carac Zone Risque Zone Risque</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracZoneRisqueZoneRisque()
	 * @generated
	 * @ordered
	 */
	protected TypeZoneRisque caracZoneRisqueZoneRisque;

	/**
	 * The cached value of the '{@link #getCaracAutreZoneInterventionZoneIntervention() <em>Carac Autre Zone Intervention Zone Intervention</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracAutreZoneInterventionZoneIntervention()
	 * @generated
	 * @ordered
	 */
	protected TypeZoneIntervention caracAutreZoneInterventionZoneIntervention;

	/**
	 * The cached value of the '{@link #getCaracCampCamp() <em>Carac Camp Camp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracCampCamp()
	 * @generated
	 * @ordered
	 */
	protected TypeCamp caracCampCamp;

	/**
	 * The cached value of the '{@link #getCaracSiteSoinSiteSoin() <em>Carac Site Soin Site Soin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracSiteSoinSiteSoin()
	 * @generated
	 * @ordered
	 */
	protected TypeSiteSoin caracSiteSoinSiteSoin;

	/**
	 * The cached value of the '{@link #getCaracSiteProductionSiteProduction() <em>Carac Site Production Site Production</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracSiteProductionSiteProduction()
	 * @generated
	 * @ordered
	 */
	protected TypeSiteProduction caracSiteProductionSiteProduction;

	/**
	 * The cached value of the '{@link #getCaracLiaisonPhysiqueLiaisonPhysique() <em>Carac Liaison Physique Liaison Physique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracLiaisonPhysiqueLiaisonPhysique()
	 * @generated
	 * @ordered
	 */
	protected TypeLiaisonPhysique caracLiaisonPhysiqueLiaisonPhysique;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationSiteEvenement() <em>Est Sujet Association Site Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationSiteEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationSiteEvenement;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationSiteEltCtrl() <em>Est Sujet Association Site Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationSiteEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationSiteEltCtrl;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationSiteSite() <em>Est Objet Association Site Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationSiteSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationSiteSite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationSiteSite() <em>Est Sujet Association Site Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationSiteSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationSiteSite;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique() <em>APour Caracteristique Logistique Caracteristique Logistique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourCaracteristiqueLogistiqueCaracteristiqueLogistique;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEltCtrlSite() <em>Est Objet Association Elt Ctrl Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEltCtrlSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEltCtrlSite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEltTopoSite() <em>Est Objet Association Elt Topo Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEltTopoSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEltTopoSite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationSiteEltTopo() <em>Est Sujet Association Site Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationSiteEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationSiteEltTopo;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMaterielSite() <em>Est Objet Association Materiel Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMaterielSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMaterielSite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationSiteMateriel() <em>Est Sujet Association Site Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationSiteMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationSiteMateriel;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPersonneSite() <em>Est Objet Association Personne Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPersonneSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPersonneSite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMeteorologieSite() <em>Est Objet Association Meteorologie Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMeteorologieSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMeteorologieSite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationSiteMeteorologie() <em>Est Sujet Association Site Meteorologie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationSiteMeteorologie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationSiteMeteorologie;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationObjetInconnuSite() <em>Est Objet Association Objet Inconnu Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationObjetInconnuSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationObjetInconnuSite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationSiteObjetInconnu() <em>Est Sujet Association Site Objet Inconnu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationSiteObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationSiteObjetInconnu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentification() {
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentification(String newIdentification) {
		String oldIdentification = identification;
		identification = newIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__IDENTIFICATION, oldIdentification, identification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__NATIONALITE, oldNationalite, nationalite, !oldNationaliteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE__NATIONALITE, oldNationalite, NATIONALITE_EDEFAULT, oldNationaliteESet));
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
	public TypeDataTypeLongueur getLongueur() {
		return longueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueur(TypeDataTypeLongueur newLongueur, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueur = longueur;
		longueur = newLongueur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__LONGUEUR, oldLongueur, newLongueur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueur(TypeDataTypeLongueur newLongueur) {
		if (newLongueur != longueur) {
			NotificationChain msgs = null;
			if (longueur != null)
				msgs = ((InternalEObject)longueur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__LONGUEUR, null, msgs);
			if (newLongueur != null)
				msgs = ((InternalEObject)newLongueur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__LONGUEUR, null, msgs);
			msgs = basicSetLongueur(newLongueur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__LONGUEUR, newLongueur, newLongueur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeur() {
		return largeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeur(TypeDataTypeLongueur newLargeur, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeur = largeur;
		largeur = newLargeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__LARGEUR, oldLargeur, newLargeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeur(TypeDataTypeLongueur newLargeur) {
		if (newLargeur != largeur) {
			NotificationChain msgs = null;
			if (largeur != null)
				msgs = ((InternalEObject)largeur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__LARGEUR, null, msgs);
			if (newLargeur != null)
				msgs = ((InternalEObject)newLargeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__LARGEUR, null, msgs);
			msgs = basicSetLargeur(newLargeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__LARGEUR, newLargeur, newLargeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getProfondeur() {
		return profondeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfondeur(TypeDataTypeLongueur newProfondeur, NotificationChain msgs) {
		TypeDataTypeLongueur oldProfondeur = profondeur;
		profondeur = newProfondeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__PROFONDEUR, oldProfondeur, newProfondeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondeur(TypeDataTypeLongueur newProfondeur) {
		if (newProfondeur != profondeur) {
			NotificationChain msgs = null;
			if (profondeur != null)
				msgs = ((InternalEObject)profondeur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__PROFONDEUR, null, msgs);
			if (newProfondeur != null)
				msgs = ((InternalEObject)newProfondeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__PROFONDEUR, null, msgs);
			msgs = basicSetProfondeur(newProfondeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__PROFONDEUR, newProfondeur, newProfondeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteur() {
		return hauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteur(TypeDataTypeLongueur newHauteur, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteur = hauteur;
		hauteur = newHauteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__HAUTEUR, oldHauteur, newHauteur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteur(TypeDataTypeLongueur newHauteur) {
		if (newHauteur != hauteur) {
			NotificationChain msgs = null;
			if (hauteur != null)
				msgs = ((InternalEObject)hauteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__HAUTEUR, null, msgs);
			if (newHauteur != null)
				msgs = ((InternalEObject)newHauteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__HAUTEUR, null, msgs);
			msgs = basicSetHauteur(newHauteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__HAUTEUR, newHauteur, newHauteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteAccueil() {
		return capaciteAccueil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteAccueil(long newCapaciteAccueil) {
		long oldCapaciteAccueil = capaciteAccueil;
		capaciteAccueil = newCapaciteAccueil;
		boolean oldCapaciteAccueilESet = capaciteAccueilESet;
		capaciteAccueilESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CAPACITE_ACCUEIL, oldCapaciteAccueil, capaciteAccueil, !oldCapaciteAccueilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteAccueil() {
		long oldCapaciteAccueil = capaciteAccueil;
		boolean oldCapaciteAccueilESet = capaciteAccueilESet;
		capaciteAccueil = CAPACITE_ACCUEIL_EDEFAULT;
		capaciteAccueilESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE__CAPACITE_ACCUEIL, oldCapaciteAccueil, CAPACITE_ACCUEIL_EDEFAULT, oldCapaciteAccueilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteAccueil() {
		return capaciteAccueilESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteHebergement() {
		return capaciteHebergement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteHebergement(long newCapaciteHebergement) {
		long oldCapaciteHebergement = capaciteHebergement;
		capaciteHebergement = newCapaciteHebergement;
		boolean oldCapaciteHebergementESet = capaciteHebergementESet;
		capaciteHebergementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CAPACITE_HEBERGEMENT, oldCapaciteHebergement, capaciteHebergement, !oldCapaciteHebergementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteHebergement() {
		long oldCapaciteHebergement = capaciteHebergement;
		boolean oldCapaciteHebergementESet = capaciteHebergementESet;
		capaciteHebergement = CAPACITE_HEBERGEMENT_EDEFAULT;
		capaciteHebergementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE__CAPACITE_HEBERGEMENT, oldCapaciteHebergement, CAPACITE_HEBERGEMENT_EDEFAULT, oldCapaciteHebergementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteHebergement() {
		return capaciteHebergementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionHebergement() {
		return descriptionHebergement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionHebergement(String newDescriptionHebergement) {
		String oldDescriptionHebergement = descriptionHebergement;
		descriptionHebergement = newDescriptionHebergement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__DESCRIPTION_HEBERGEMENT, oldDescriptionHebergement, descriptionHebergement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSiteMateriauPrincipalConstruction getMateriauPrincipalConstruction() {
		return materiauPrincipalConstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMateriauPrincipalConstruction(TypeDictionaryDicoSiteMateriauPrincipalConstruction newMateriauPrincipalConstruction) {
		TypeDictionaryDicoSiteMateriauPrincipalConstruction oldMateriauPrincipalConstruction = materiauPrincipalConstruction;
		materiauPrincipalConstruction = newMateriauPrincipalConstruction == null ? MATERIAU_PRINCIPAL_CONSTRUCTION_EDEFAULT : newMateriauPrincipalConstruction;
		boolean oldMateriauPrincipalConstructionESet = materiauPrincipalConstructionESet;
		materiauPrincipalConstructionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__MATERIAU_PRINCIPAL_CONSTRUCTION, oldMateriauPrincipalConstruction, materiauPrincipalConstruction, !oldMateriauPrincipalConstructionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMateriauPrincipalConstruction() {
		TypeDictionaryDicoSiteMateriauPrincipalConstruction oldMateriauPrincipalConstruction = materiauPrincipalConstruction;
		boolean oldMateriauPrincipalConstructionESet = materiauPrincipalConstructionESet;
		materiauPrincipalConstruction = MATERIAU_PRINCIPAL_CONSTRUCTION_EDEFAULT;
		materiauPrincipalConstructionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE__MATERIAU_PRINCIPAL_CONSTRUCTION, oldMateriauPrincipalConstruction, MATERIAU_PRINCIPAL_CONSTRUCTION_EDEFAULT, oldMateriauPrincipalConstructionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMateriauPrincipalConstruction() {
		return materiauPrincipalConstructionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourTypeAssociationSiteTypeSite() {
		if (aPourTypeAssociationSiteTypeSite == null) {
			aPourTypeAssociationSiteTypeSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__APOUR_TYPE_ASSOCIATION_SITE_TYPE_SITE);
		}
		return aPourTypeAssociationSiteTypeSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatOperationnelSite> getAPourEtatEtatOperationnelSite() {
		if (aPourEtatEtatOperationnelSite == null) {
			aPourEtatEtatOperationnelSite = new EObjectContainmentEList<TypeEtatOperationnelSite>(TypeEtatOperationnelSite.class, this, SchemaPackage.TYPE_SITE__APOUR_ETAT_ETAT_OPERATIONNEL_SITE);
		}
		return aPourEtatEtatOperationnelSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEntiteOrgSite() {
		if (estObjetAssociationEntiteOrgSite == null) {
			estObjetAssociationEntiteOrgSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ENTITE_ORG_SITE);
		}
		return estObjetAssociationEntiteOrgSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeZoneRisque getCaracZoneRisqueZoneRisque() {
		return caracZoneRisqueZoneRisque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracZoneRisqueZoneRisque(TypeZoneRisque newCaracZoneRisqueZoneRisque, NotificationChain msgs) {
		TypeZoneRisque oldCaracZoneRisqueZoneRisque = caracZoneRisqueZoneRisque;
		caracZoneRisqueZoneRisque = newCaracZoneRisqueZoneRisque;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_ZONE_RISQUE_ZONE_RISQUE, oldCaracZoneRisqueZoneRisque, newCaracZoneRisqueZoneRisque);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracZoneRisqueZoneRisque(TypeZoneRisque newCaracZoneRisqueZoneRisque) {
		if (newCaracZoneRisqueZoneRisque != caracZoneRisqueZoneRisque) {
			NotificationChain msgs = null;
			if (caracZoneRisqueZoneRisque != null)
				msgs = ((InternalEObject)caracZoneRisqueZoneRisque).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_ZONE_RISQUE_ZONE_RISQUE, null, msgs);
			if (newCaracZoneRisqueZoneRisque != null)
				msgs = ((InternalEObject)newCaracZoneRisqueZoneRisque).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_ZONE_RISQUE_ZONE_RISQUE, null, msgs);
			msgs = basicSetCaracZoneRisqueZoneRisque(newCaracZoneRisqueZoneRisque, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_ZONE_RISQUE_ZONE_RISQUE, newCaracZoneRisqueZoneRisque, newCaracZoneRisqueZoneRisque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeZoneIntervention getCaracAutreZoneInterventionZoneIntervention() {
		return caracAutreZoneInterventionZoneIntervention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracAutreZoneInterventionZoneIntervention(TypeZoneIntervention newCaracAutreZoneInterventionZoneIntervention, NotificationChain msgs) {
		TypeZoneIntervention oldCaracAutreZoneInterventionZoneIntervention = caracAutreZoneInterventionZoneIntervention;
		caracAutreZoneInterventionZoneIntervention = newCaracAutreZoneInterventionZoneIntervention;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_AUTRE_ZONE_INTERVENTION_ZONE_INTERVENTION, oldCaracAutreZoneInterventionZoneIntervention, newCaracAutreZoneInterventionZoneIntervention);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracAutreZoneInterventionZoneIntervention(TypeZoneIntervention newCaracAutreZoneInterventionZoneIntervention) {
		if (newCaracAutreZoneInterventionZoneIntervention != caracAutreZoneInterventionZoneIntervention) {
			NotificationChain msgs = null;
			if (caracAutreZoneInterventionZoneIntervention != null)
				msgs = ((InternalEObject)caracAutreZoneInterventionZoneIntervention).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_AUTRE_ZONE_INTERVENTION_ZONE_INTERVENTION, null, msgs);
			if (newCaracAutreZoneInterventionZoneIntervention != null)
				msgs = ((InternalEObject)newCaracAutreZoneInterventionZoneIntervention).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_AUTRE_ZONE_INTERVENTION_ZONE_INTERVENTION, null, msgs);
			msgs = basicSetCaracAutreZoneInterventionZoneIntervention(newCaracAutreZoneInterventionZoneIntervention, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_AUTRE_ZONE_INTERVENTION_ZONE_INTERVENTION, newCaracAutreZoneInterventionZoneIntervention, newCaracAutreZoneInterventionZoneIntervention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCamp getCaracCampCamp() {
		return caracCampCamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracCampCamp(TypeCamp newCaracCampCamp, NotificationChain msgs) {
		TypeCamp oldCaracCampCamp = caracCampCamp;
		caracCampCamp = newCaracCampCamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_CAMP_CAMP, oldCaracCampCamp, newCaracCampCamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracCampCamp(TypeCamp newCaracCampCamp) {
		if (newCaracCampCamp != caracCampCamp) {
			NotificationChain msgs = null;
			if (caracCampCamp != null)
				msgs = ((InternalEObject)caracCampCamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_CAMP_CAMP, null, msgs);
			if (newCaracCampCamp != null)
				msgs = ((InternalEObject)newCaracCampCamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_CAMP_CAMP, null, msgs);
			msgs = basicSetCaracCampCamp(newCaracCampCamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_CAMP_CAMP, newCaracCampCamp, newCaracCampCamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSiteSoin getCaracSiteSoinSiteSoin() {
		return caracSiteSoinSiteSoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracSiteSoinSiteSoin(TypeSiteSoin newCaracSiteSoinSiteSoin, NotificationChain msgs) {
		TypeSiteSoin oldCaracSiteSoinSiteSoin = caracSiteSoinSiteSoin;
		caracSiteSoinSiteSoin = newCaracSiteSoinSiteSoin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_SITE_SOIN_SITE_SOIN, oldCaracSiteSoinSiteSoin, newCaracSiteSoinSiteSoin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracSiteSoinSiteSoin(TypeSiteSoin newCaracSiteSoinSiteSoin) {
		if (newCaracSiteSoinSiteSoin != caracSiteSoinSiteSoin) {
			NotificationChain msgs = null;
			if (caracSiteSoinSiteSoin != null)
				msgs = ((InternalEObject)caracSiteSoinSiteSoin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_SITE_SOIN_SITE_SOIN, null, msgs);
			if (newCaracSiteSoinSiteSoin != null)
				msgs = ((InternalEObject)newCaracSiteSoinSiteSoin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_SITE_SOIN_SITE_SOIN, null, msgs);
			msgs = basicSetCaracSiteSoinSiteSoin(newCaracSiteSoinSiteSoin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_SITE_SOIN_SITE_SOIN, newCaracSiteSoinSiteSoin, newCaracSiteSoinSiteSoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSiteProduction getCaracSiteProductionSiteProduction() {
		return caracSiteProductionSiteProduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracSiteProductionSiteProduction(TypeSiteProduction newCaracSiteProductionSiteProduction, NotificationChain msgs) {
		TypeSiteProduction oldCaracSiteProductionSiteProduction = caracSiteProductionSiteProduction;
		caracSiteProductionSiteProduction = newCaracSiteProductionSiteProduction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_SITE_PRODUCTION_SITE_PRODUCTION, oldCaracSiteProductionSiteProduction, newCaracSiteProductionSiteProduction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracSiteProductionSiteProduction(TypeSiteProduction newCaracSiteProductionSiteProduction) {
		if (newCaracSiteProductionSiteProduction != caracSiteProductionSiteProduction) {
			NotificationChain msgs = null;
			if (caracSiteProductionSiteProduction != null)
				msgs = ((InternalEObject)caracSiteProductionSiteProduction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_SITE_PRODUCTION_SITE_PRODUCTION, null, msgs);
			if (newCaracSiteProductionSiteProduction != null)
				msgs = ((InternalEObject)newCaracSiteProductionSiteProduction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_SITE_PRODUCTION_SITE_PRODUCTION, null, msgs);
			msgs = basicSetCaracSiteProductionSiteProduction(newCaracSiteProductionSiteProduction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_SITE_PRODUCTION_SITE_PRODUCTION, newCaracSiteProductionSiteProduction, newCaracSiteProductionSiteProduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLiaisonPhysique getCaracLiaisonPhysiqueLiaisonPhysique() {
		return caracLiaisonPhysiqueLiaisonPhysique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracLiaisonPhysiqueLiaisonPhysique(TypeLiaisonPhysique newCaracLiaisonPhysiqueLiaisonPhysique, NotificationChain msgs) {
		TypeLiaisonPhysique oldCaracLiaisonPhysiqueLiaisonPhysique = caracLiaisonPhysiqueLiaisonPhysique;
		caracLiaisonPhysiqueLiaisonPhysique = newCaracLiaisonPhysiqueLiaisonPhysique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_LIAISON_PHYSIQUE_LIAISON_PHYSIQUE, oldCaracLiaisonPhysiqueLiaisonPhysique, newCaracLiaisonPhysiqueLiaisonPhysique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracLiaisonPhysiqueLiaisonPhysique(TypeLiaisonPhysique newCaracLiaisonPhysiqueLiaisonPhysique) {
		if (newCaracLiaisonPhysiqueLiaisonPhysique != caracLiaisonPhysiqueLiaisonPhysique) {
			NotificationChain msgs = null;
			if (caracLiaisonPhysiqueLiaisonPhysique != null)
				msgs = ((InternalEObject)caracLiaisonPhysiqueLiaisonPhysique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_LIAISON_PHYSIQUE_LIAISON_PHYSIQUE, null, msgs);
			if (newCaracLiaisonPhysiqueLiaisonPhysique != null)
				msgs = ((InternalEObject)newCaracLiaisonPhysiqueLiaisonPhysique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITE__CARAC_LIAISON_PHYSIQUE_LIAISON_PHYSIQUE, null, msgs);
			msgs = basicSetCaracLiaisonPhysiqueLiaisonPhysique(newCaracLiaisonPhysiqueLiaisonPhysique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE__CARAC_LIAISON_PHYSIQUE_LIAISON_PHYSIQUE, newCaracLiaisonPhysiqueLiaisonPhysique, newCaracLiaisonPhysiqueLiaisonPhysique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationSiteEvenement() {
		if (estSujetAssociationSiteEvenement == null) {
			estSujetAssociationSiteEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_EVENEMENT);
		}
		return estSujetAssociationSiteEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationSiteEltCtrl() {
		if (estSujetAssociationSiteEltCtrl == null) {
			estSujetAssociationSiteEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_CTRL);
		}
		return estSujetAssociationSiteEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationSiteSite() {
		if (estObjetAssociationSiteSite == null) {
			estObjetAssociationSiteSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_SITE_SITE);
		}
		return estObjetAssociationSiteSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationSiteSite() {
		if (estSujetAssociationSiteSite == null) {
			estSujetAssociationSiteSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_SITE);
		}
		return estSujetAssociationSiteSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique() {
		if (aPourCaracteristiqueLogistiqueCaracteristiqueLogistique == null) {
			aPourCaracteristiqueLogistiqueCaracteristiqueLogistique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__APOUR_CARACTERISTIQUE_LOGISTIQUE_CARACTERISTIQUE_LOGISTIQUE);
		}
		return aPourCaracteristiqueLogistiqueCaracteristiqueLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEltCtrlSite() {
		if (estObjetAssociationEltCtrlSite == null) {
			estObjetAssociationEltCtrlSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_CTRL_SITE);
		}
		return estObjetAssociationEltCtrlSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEltTopoSite() {
		if (estObjetAssociationEltTopoSite == null) {
			estObjetAssociationEltTopoSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_TOPO_SITE);
		}
		return estObjetAssociationEltTopoSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationSiteEltTopo() {
		if (estSujetAssociationSiteEltTopo == null) {
			estSujetAssociationSiteEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_TOPO);
		}
		return estSujetAssociationSiteEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMaterielSite() {
		if (estObjetAssociationMaterielSite == null) {
			estObjetAssociationMaterielSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_MATERIEL_SITE);
		}
		return estObjetAssociationMaterielSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationSiteMateriel() {
		if (estSujetAssociationSiteMateriel == null) {
			estSujetAssociationSiteMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_MATERIEL);
		}
		return estSujetAssociationSiteMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPersonneSite() {
		if (estObjetAssociationPersonneSite == null) {
			estObjetAssociationPersonneSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_PERSONNE_SITE);
		}
		return estObjetAssociationPersonneSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMeteorologieSite() {
		if (estObjetAssociationMeteorologieSite == null) {
			estObjetAssociationMeteorologieSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_METEOROLOGIE_SITE);
		}
		return estObjetAssociationMeteorologieSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationSiteMeteorologie() {
		if (estSujetAssociationSiteMeteorologie == null) {
			estSujetAssociationSiteMeteorologie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_METEOROLOGIE);
		}
		return estSujetAssociationSiteMeteorologie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationObjetInconnuSite() {
		if (estObjetAssociationObjetInconnuSite == null) {
			estObjetAssociationObjetInconnuSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_SITE);
		}
		return estObjetAssociationObjetInconnuSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationSiteObjetInconnu() {
		if (estSujetAssociationSiteObjetInconnu == null) {
			estSujetAssociationSiteObjetInconnu = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_OBJET_INCONNU);
		}
		return estSujetAssociationSiteObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SITE__LONGUEUR:
				return basicSetLongueur(null, msgs);
			case SchemaPackage.TYPE_SITE__LARGEUR:
				return basicSetLargeur(null, msgs);
			case SchemaPackage.TYPE_SITE__PROFONDEUR:
				return basicSetProfondeur(null, msgs);
			case SchemaPackage.TYPE_SITE__HAUTEUR:
				return basicSetHauteur(null, msgs);
			case SchemaPackage.TYPE_SITE__APOUR_TYPE_ASSOCIATION_SITE_TYPE_SITE:
				return ((InternalEList<?>)getAPourTypeAssociationSiteTypeSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__APOUR_ETAT_ETAT_OPERATIONNEL_SITE:
				return ((InternalEList<?>)getAPourEtatEtatOperationnelSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ENTITE_ORG_SITE:
				return ((InternalEList<?>)getEstObjetAssociationEntiteOrgSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__CARAC_ZONE_RISQUE_ZONE_RISQUE:
				return basicSetCaracZoneRisqueZoneRisque(null, msgs);
			case SchemaPackage.TYPE_SITE__CARAC_AUTRE_ZONE_INTERVENTION_ZONE_INTERVENTION:
				return basicSetCaracAutreZoneInterventionZoneIntervention(null, msgs);
			case SchemaPackage.TYPE_SITE__CARAC_CAMP_CAMP:
				return basicSetCaracCampCamp(null, msgs);
			case SchemaPackage.TYPE_SITE__CARAC_SITE_SOIN_SITE_SOIN:
				return basicSetCaracSiteSoinSiteSoin(null, msgs);
			case SchemaPackage.TYPE_SITE__CARAC_SITE_PRODUCTION_SITE_PRODUCTION:
				return basicSetCaracSiteProductionSiteProduction(null, msgs);
			case SchemaPackage.TYPE_SITE__CARAC_LIAISON_PHYSIQUE_LIAISON_PHYSIQUE:
				return basicSetCaracLiaisonPhysiqueLiaisonPhysique(null, msgs);
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationSiteEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_CTRL:
				return ((InternalEList<?>)getEstSujetAssociationSiteEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_SITE_SITE:
				return ((InternalEList<?>)getEstObjetAssociationSiteSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_SITE:
				return ((InternalEList<?>)getEstSujetAssociationSiteSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__APOUR_CARACTERISTIQUE_LOGISTIQUE_CARACTERISTIQUE_LOGISTIQUE:
				return ((InternalEList<?>)getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_CTRL_SITE:
				return ((InternalEList<?>)getEstObjetAssociationEltCtrlSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_TOPO_SITE:
				return ((InternalEList<?>)getEstObjetAssociationEltTopoSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_TOPO:
				return ((InternalEList<?>)getEstSujetAssociationSiteEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_MATERIEL_SITE:
				return ((InternalEList<?>)getEstObjetAssociationMaterielSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_MATERIEL:
				return ((InternalEList<?>)getEstSujetAssociationSiteMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_PERSONNE_SITE:
				return ((InternalEList<?>)getEstObjetAssociationPersonneSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_METEOROLOGIE_SITE:
				return ((InternalEList<?>)getEstObjetAssociationMeteorologieSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_METEOROLOGIE:
				return ((InternalEList<?>)getEstSujetAssociationSiteMeteorologie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_SITE:
				return ((InternalEList<?>)getEstObjetAssociationObjetInconnuSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_OBJET_INCONNU:
				return ((InternalEList<?>)getEstSujetAssociationSiteObjetInconnu()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_SITE__IDENTIFICATION:
				return getIdentification();
			case SchemaPackage.TYPE_SITE__NATIONALITE:
				return getNationalite();
			case SchemaPackage.TYPE_SITE__LONGUEUR:
				return getLongueur();
			case SchemaPackage.TYPE_SITE__LARGEUR:
				return getLargeur();
			case SchemaPackage.TYPE_SITE__PROFONDEUR:
				return getProfondeur();
			case SchemaPackage.TYPE_SITE__HAUTEUR:
				return getHauteur();
			case SchemaPackage.TYPE_SITE__CAPACITE_ACCUEIL:
				return new Long(getCapaciteAccueil());
			case SchemaPackage.TYPE_SITE__CAPACITE_HEBERGEMENT:
				return new Long(getCapaciteHebergement());
			case SchemaPackage.TYPE_SITE__DESCRIPTION_HEBERGEMENT:
				return getDescriptionHebergement();
			case SchemaPackage.TYPE_SITE__MATERIAU_PRINCIPAL_CONSTRUCTION:
				return getMateriauPrincipalConstruction();
			case SchemaPackage.TYPE_SITE__APOUR_TYPE_ASSOCIATION_SITE_TYPE_SITE:
				return getAPourTypeAssociationSiteTypeSite();
			case SchemaPackage.TYPE_SITE__APOUR_ETAT_ETAT_OPERATIONNEL_SITE:
				return getAPourEtatEtatOperationnelSite();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ENTITE_ORG_SITE:
				return getEstObjetAssociationEntiteOrgSite();
			case SchemaPackage.TYPE_SITE__CARAC_ZONE_RISQUE_ZONE_RISQUE:
				return getCaracZoneRisqueZoneRisque();
			case SchemaPackage.TYPE_SITE__CARAC_AUTRE_ZONE_INTERVENTION_ZONE_INTERVENTION:
				return getCaracAutreZoneInterventionZoneIntervention();
			case SchemaPackage.TYPE_SITE__CARAC_CAMP_CAMP:
				return getCaracCampCamp();
			case SchemaPackage.TYPE_SITE__CARAC_SITE_SOIN_SITE_SOIN:
				return getCaracSiteSoinSiteSoin();
			case SchemaPackage.TYPE_SITE__CARAC_SITE_PRODUCTION_SITE_PRODUCTION:
				return getCaracSiteProductionSiteProduction();
			case SchemaPackage.TYPE_SITE__CARAC_LIAISON_PHYSIQUE_LIAISON_PHYSIQUE:
				return getCaracLiaisonPhysiqueLiaisonPhysique();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_EVENEMENT:
				return getEstSujetAssociationSiteEvenement();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_CTRL:
				return getEstSujetAssociationSiteEltCtrl();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_SITE_SITE:
				return getEstObjetAssociationSiteSite();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_SITE:
				return getEstSujetAssociationSiteSite();
			case SchemaPackage.TYPE_SITE__APOUR_CARACTERISTIQUE_LOGISTIQUE_CARACTERISTIQUE_LOGISTIQUE:
				return getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_CTRL_SITE:
				return getEstObjetAssociationEltCtrlSite();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_TOPO_SITE:
				return getEstObjetAssociationEltTopoSite();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_TOPO:
				return getEstSujetAssociationSiteEltTopo();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_MATERIEL_SITE:
				return getEstObjetAssociationMaterielSite();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_MATERIEL:
				return getEstSujetAssociationSiteMateriel();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_PERSONNE_SITE:
				return getEstObjetAssociationPersonneSite();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_METEOROLOGIE_SITE:
				return getEstObjetAssociationMeteorologieSite();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_METEOROLOGIE:
				return getEstSujetAssociationSiteMeteorologie();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_SITE:
				return getEstObjetAssociationObjetInconnuSite();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_OBJET_INCONNU:
				return getEstSujetAssociationSiteObjetInconnu();
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
			case SchemaPackage.TYPE_SITE__IDENTIFICATION:
				setIdentification((String)newValue);
				return;
			case SchemaPackage.TYPE_SITE__NATIONALITE:
				setNationalite((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_SITE__LONGUEUR:
				setLongueur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SITE__LARGEUR:
				setLargeur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SITE__PROFONDEUR:
				setProfondeur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SITE__HAUTEUR:
				setHauteur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SITE__CAPACITE_ACCUEIL:
				setCapaciteAccueil(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SITE__CAPACITE_HEBERGEMENT:
				setCapaciteHebergement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SITE__DESCRIPTION_HEBERGEMENT:
				setDescriptionHebergement((String)newValue);
				return;
			case SchemaPackage.TYPE_SITE__MATERIAU_PRINCIPAL_CONSTRUCTION:
				setMateriauPrincipalConstruction((TypeDictionaryDicoSiteMateriauPrincipalConstruction)newValue);
				return;
			case SchemaPackage.TYPE_SITE__APOUR_TYPE_ASSOCIATION_SITE_TYPE_SITE:
				getAPourTypeAssociationSiteTypeSite().clear();
				getAPourTypeAssociationSiteTypeSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__APOUR_ETAT_ETAT_OPERATIONNEL_SITE:
				getAPourEtatEtatOperationnelSite().clear();
				getAPourEtatEtatOperationnelSite().addAll((Collection<? extends TypeEtatOperationnelSite>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ENTITE_ORG_SITE:
				getEstObjetAssociationEntiteOrgSite().clear();
				getEstObjetAssociationEntiteOrgSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_ZONE_RISQUE_ZONE_RISQUE:
				setCaracZoneRisqueZoneRisque((TypeZoneRisque)newValue);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_AUTRE_ZONE_INTERVENTION_ZONE_INTERVENTION:
				setCaracAutreZoneInterventionZoneIntervention((TypeZoneIntervention)newValue);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_CAMP_CAMP:
				setCaracCampCamp((TypeCamp)newValue);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_SITE_SOIN_SITE_SOIN:
				setCaracSiteSoinSiteSoin((TypeSiteSoin)newValue);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_SITE_PRODUCTION_SITE_PRODUCTION:
				setCaracSiteProductionSiteProduction((TypeSiteProduction)newValue);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_LIAISON_PHYSIQUE_LIAISON_PHYSIQUE:
				setCaracLiaisonPhysiqueLiaisonPhysique((TypeLiaisonPhysique)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_EVENEMENT:
				getEstSujetAssociationSiteEvenement().clear();
				getEstSujetAssociationSiteEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_CTRL:
				getEstSujetAssociationSiteEltCtrl().clear();
				getEstSujetAssociationSiteEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_SITE_SITE:
				getEstObjetAssociationSiteSite().clear();
				getEstObjetAssociationSiteSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_SITE:
				getEstSujetAssociationSiteSite().clear();
				getEstSujetAssociationSiteSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__APOUR_CARACTERISTIQUE_LOGISTIQUE_CARACTERISTIQUE_LOGISTIQUE:
				getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique().clear();
				getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_CTRL_SITE:
				getEstObjetAssociationEltCtrlSite().clear();
				getEstObjetAssociationEltCtrlSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_TOPO_SITE:
				getEstObjetAssociationEltTopoSite().clear();
				getEstObjetAssociationEltTopoSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_TOPO:
				getEstSujetAssociationSiteEltTopo().clear();
				getEstSujetAssociationSiteEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_MATERIEL_SITE:
				getEstObjetAssociationMaterielSite().clear();
				getEstObjetAssociationMaterielSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_MATERIEL:
				getEstSujetAssociationSiteMateriel().clear();
				getEstSujetAssociationSiteMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_PERSONNE_SITE:
				getEstObjetAssociationPersonneSite().clear();
				getEstObjetAssociationPersonneSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_METEOROLOGIE_SITE:
				getEstObjetAssociationMeteorologieSite().clear();
				getEstObjetAssociationMeteorologieSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_METEOROLOGIE:
				getEstSujetAssociationSiteMeteorologie().clear();
				getEstSujetAssociationSiteMeteorologie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_SITE:
				getEstObjetAssociationObjetInconnuSite().clear();
				getEstObjetAssociationObjetInconnuSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_OBJET_INCONNU:
				getEstSujetAssociationSiteObjetInconnu().clear();
				getEstSujetAssociationSiteObjetInconnu().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_SITE__IDENTIFICATION:
				setIdentification(IDENTIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITE__NATIONALITE:
				unsetNationalite();
				return;
			case SchemaPackage.TYPE_SITE__LONGUEUR:
				setLongueur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SITE__LARGEUR:
				setLargeur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SITE__PROFONDEUR:
				setProfondeur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SITE__HAUTEUR:
				setHauteur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SITE__CAPACITE_ACCUEIL:
				unsetCapaciteAccueil();
				return;
			case SchemaPackage.TYPE_SITE__CAPACITE_HEBERGEMENT:
				unsetCapaciteHebergement();
				return;
			case SchemaPackage.TYPE_SITE__DESCRIPTION_HEBERGEMENT:
				setDescriptionHebergement(DESCRIPTION_HEBERGEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITE__MATERIAU_PRINCIPAL_CONSTRUCTION:
				unsetMateriauPrincipalConstruction();
				return;
			case SchemaPackage.TYPE_SITE__APOUR_TYPE_ASSOCIATION_SITE_TYPE_SITE:
				getAPourTypeAssociationSiteTypeSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__APOUR_ETAT_ETAT_OPERATIONNEL_SITE:
				getAPourEtatEtatOperationnelSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ENTITE_ORG_SITE:
				getEstObjetAssociationEntiteOrgSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__CARAC_ZONE_RISQUE_ZONE_RISQUE:
				setCaracZoneRisqueZoneRisque((TypeZoneRisque)null);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_AUTRE_ZONE_INTERVENTION_ZONE_INTERVENTION:
				setCaracAutreZoneInterventionZoneIntervention((TypeZoneIntervention)null);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_CAMP_CAMP:
				setCaracCampCamp((TypeCamp)null);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_SITE_SOIN_SITE_SOIN:
				setCaracSiteSoinSiteSoin((TypeSiteSoin)null);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_SITE_PRODUCTION_SITE_PRODUCTION:
				setCaracSiteProductionSiteProduction((TypeSiteProduction)null);
				return;
			case SchemaPackage.TYPE_SITE__CARAC_LIAISON_PHYSIQUE_LIAISON_PHYSIQUE:
				setCaracLiaisonPhysiqueLiaisonPhysique((TypeLiaisonPhysique)null);
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_EVENEMENT:
				getEstSujetAssociationSiteEvenement().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_CTRL:
				getEstSujetAssociationSiteEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_SITE_SITE:
				getEstObjetAssociationSiteSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_SITE:
				getEstSujetAssociationSiteSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__APOUR_CARACTERISTIQUE_LOGISTIQUE_CARACTERISTIQUE_LOGISTIQUE:
				getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_CTRL_SITE:
				getEstObjetAssociationEltCtrlSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_TOPO_SITE:
				getEstObjetAssociationEltTopoSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_TOPO:
				getEstSujetAssociationSiteEltTopo().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_MATERIEL_SITE:
				getEstObjetAssociationMaterielSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_MATERIEL:
				getEstSujetAssociationSiteMateriel().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_PERSONNE_SITE:
				getEstObjetAssociationPersonneSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_METEOROLOGIE_SITE:
				getEstObjetAssociationMeteorologieSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_METEOROLOGIE:
				getEstSujetAssociationSiteMeteorologie().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_SITE:
				getEstObjetAssociationObjetInconnuSite().clear();
				return;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_OBJET_INCONNU:
				getEstSujetAssociationSiteObjetInconnu().clear();
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
			case SchemaPackage.TYPE_SITE__IDENTIFICATION:
				return IDENTIFICATION_EDEFAULT == null ? identification != null : !IDENTIFICATION_EDEFAULT.equals(identification);
			case SchemaPackage.TYPE_SITE__NATIONALITE:
				return isSetNationalite();
			case SchemaPackage.TYPE_SITE__LONGUEUR:
				return longueur != null;
			case SchemaPackage.TYPE_SITE__LARGEUR:
				return largeur != null;
			case SchemaPackage.TYPE_SITE__PROFONDEUR:
				return profondeur != null;
			case SchemaPackage.TYPE_SITE__HAUTEUR:
				return hauteur != null;
			case SchemaPackage.TYPE_SITE__CAPACITE_ACCUEIL:
				return isSetCapaciteAccueil();
			case SchemaPackage.TYPE_SITE__CAPACITE_HEBERGEMENT:
				return isSetCapaciteHebergement();
			case SchemaPackage.TYPE_SITE__DESCRIPTION_HEBERGEMENT:
				return DESCRIPTION_HEBERGEMENT_EDEFAULT == null ? descriptionHebergement != null : !DESCRIPTION_HEBERGEMENT_EDEFAULT.equals(descriptionHebergement);
			case SchemaPackage.TYPE_SITE__MATERIAU_PRINCIPAL_CONSTRUCTION:
				return isSetMateriauPrincipalConstruction();
			case SchemaPackage.TYPE_SITE__APOUR_TYPE_ASSOCIATION_SITE_TYPE_SITE:
				return aPourTypeAssociationSiteTypeSite != null && !aPourTypeAssociationSiteTypeSite.isEmpty();
			case SchemaPackage.TYPE_SITE__APOUR_ETAT_ETAT_OPERATIONNEL_SITE:
				return aPourEtatEtatOperationnelSite != null && !aPourEtatEtatOperationnelSite.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ENTITE_ORG_SITE:
				return estObjetAssociationEntiteOrgSite != null && !estObjetAssociationEntiteOrgSite.isEmpty();
			case SchemaPackage.TYPE_SITE__CARAC_ZONE_RISQUE_ZONE_RISQUE:
				return caracZoneRisqueZoneRisque != null;
			case SchemaPackage.TYPE_SITE__CARAC_AUTRE_ZONE_INTERVENTION_ZONE_INTERVENTION:
				return caracAutreZoneInterventionZoneIntervention != null;
			case SchemaPackage.TYPE_SITE__CARAC_CAMP_CAMP:
				return caracCampCamp != null;
			case SchemaPackage.TYPE_SITE__CARAC_SITE_SOIN_SITE_SOIN:
				return caracSiteSoinSiteSoin != null;
			case SchemaPackage.TYPE_SITE__CARAC_SITE_PRODUCTION_SITE_PRODUCTION:
				return caracSiteProductionSiteProduction != null;
			case SchemaPackage.TYPE_SITE__CARAC_LIAISON_PHYSIQUE_LIAISON_PHYSIQUE:
				return caracLiaisonPhysiqueLiaisonPhysique != null;
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_EVENEMENT:
				return estSujetAssociationSiteEvenement != null && !estSujetAssociationSiteEvenement.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_CTRL:
				return estSujetAssociationSiteEltCtrl != null && !estSujetAssociationSiteEltCtrl.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_SITE_SITE:
				return estObjetAssociationSiteSite != null && !estObjetAssociationSiteSite.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_SITE:
				return estSujetAssociationSiteSite != null && !estSujetAssociationSiteSite.isEmpty();
			case SchemaPackage.TYPE_SITE__APOUR_CARACTERISTIQUE_LOGISTIQUE_CARACTERISTIQUE_LOGISTIQUE:
				return aPourCaracteristiqueLogistiqueCaracteristiqueLogistique != null && !aPourCaracteristiqueLogistiqueCaracteristiqueLogistique.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_CTRL_SITE:
				return estObjetAssociationEltCtrlSite != null && !estObjetAssociationEltCtrlSite.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_ELT_TOPO_SITE:
				return estObjetAssociationEltTopoSite != null && !estObjetAssociationEltTopoSite.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_ELT_TOPO:
				return estSujetAssociationSiteEltTopo != null && !estSujetAssociationSiteEltTopo.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_MATERIEL_SITE:
				return estObjetAssociationMaterielSite != null && !estObjetAssociationMaterielSite.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_MATERIEL:
				return estSujetAssociationSiteMateriel != null && !estSujetAssociationSiteMateriel.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_PERSONNE_SITE:
				return estObjetAssociationPersonneSite != null && !estObjetAssociationPersonneSite.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_METEOROLOGIE_SITE:
				return estObjetAssociationMeteorologieSite != null && !estObjetAssociationMeteorologieSite.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_METEOROLOGIE:
				return estSujetAssociationSiteMeteorologie != null && !estSujetAssociationSiteMeteorologie.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_SITE:
				return estObjetAssociationObjetInconnuSite != null && !estObjetAssociationObjetInconnuSite.isEmpty();
			case SchemaPackage.TYPE_SITE__EST_SUJET_ASSOCIATION_SITE_OBJET_INCONNU:
				return estSujetAssociationSiteObjetInconnu != null && !estSujetAssociationSiteObjetInconnu.isEmpty();
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
		result.append(" (identification: ");
		result.append(identification);
		result.append(", nationalite: ");
		if (nationaliteESet) result.append(nationalite); else result.append("<unset>");
		result.append(", capaciteAccueil: ");
		if (capaciteAccueilESet) result.append(capaciteAccueil); else result.append("<unset>");
		result.append(", capaciteHebergement: ");
		if (capaciteHebergementESet) result.append(capaciteHebergement); else result.append("<unset>");
		result.append(", descriptionHebergement: ");
		result.append(descriptionHebergement);
		result.append(", materiauPrincipalConstruction: ");
		if (materiauPrincipalConstructionESet) result.append(materiauPrincipalConstruction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSiteImpl
