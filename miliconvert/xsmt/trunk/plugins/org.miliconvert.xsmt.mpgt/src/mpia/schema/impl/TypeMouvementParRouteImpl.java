/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCompteRenduMouvement;
import mpia.schema.TypeContraintesMouvement;
import mpia.schema.TypeDictionaryDicoMouvementParRouteCategorie;
import mpia.schema.TypeIncidentMouvement;
import mpia.schema.TypeMouvementParRoute;

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
 * An implementation of the model object '<em><b>Type Mouvement Par Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getCadreOperation <em>Cadre Operation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getDateDebutMouvement <em>Date Debut Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getDemandeParticuliere <em>Demande Particuliere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getLibellePlan <em>Libelle Plan</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getNomCodeMouvement <em>Nom Code Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getNomCodePlan <em>Nom Code Plan</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getResponsableAttributionMouvement <em>Responsable Attribution Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getEstSujetAssociationMouvementParRouteMouvementParRoute <em>Est Sujet Association Mouvement Par Route Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getEstObjetAssociationMouvementParRouteMouvementParRoute <em>Est Objet Association Mouvement Par Route Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getEstObjetAssociationConvoiMouvementParRoute <em>Est Objet Association Convoi Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getAPourContraintesMouvementContraintesMouvement <em>APour Contraintes Mouvement Contraintes Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getADonneLieuAuCompteRenduMouvementCompteRenduMouvement <em>ADonne Lieu Au Compte Rendu Mouvement Compte Rendu Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getAPourIncidentMouvementIncidentMouvement <em>APour Incident Mouvement Incident Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getAPourUniteFaisantMouvementUnite <em>APour Unite Faisant Mouvement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getAPourItineraireItineraire <em>APour Itineraire Itineraire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMouvementParRouteImpl#getEstObjetAssociationUniteMouvementParRoute <em>Est Objet Association Unite Mouvement Par Route</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMouvementParRouteImpl extends TypeActiviteImpl implements TypeMouvementParRoute {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMouvementParRouteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoMouvementParRouteCategorie.ALLOCROA;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMouvementParRouteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getCadreOperation() <em>Cadre Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCadreOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String CADRE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCadreOperation() <em>Cadre Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCadreOperation()
	 * @generated
	 * @ordered
	 */
	protected String cadreOperation = CADRE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDebutMouvement() <em>Date Debut Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_MOUVEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebutMouvement() <em>Date Debut Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutMouvement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebutMouvement = DATE_DEBUT_MOUVEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDemandeParticuliere() <em>Demande Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandeParticuliere()
	 * @generated
	 * @ordered
	 */
	protected static final String DEMANDE_PARTICULIERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDemandeParticuliere() <em>Demande Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandeParticuliere()
	 * @generated
	 * @ordered
	 */
	protected String demandeParticuliere = DEMANDE_PARTICULIERE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibellePlan() <em>Libelle Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibellePlan()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_PLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibellePlan() <em>Libelle Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibellePlan()
	 * @generated
	 * @ordered
	 */
	protected String libellePlan = LIBELLE_PLAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomCodeMouvement() <em>Nom Code Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCodeMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_CODE_MOUVEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomCodeMouvement() <em>Nom Code Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCodeMouvement()
	 * @generated
	 * @ordered
	 */
	protected String nomCodeMouvement = NOM_CODE_MOUVEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomCodePlan() <em>Nom Code Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCodePlan()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_CODE_PLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomCodePlan() <em>Nom Code Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCodePlan()
	 * @generated
	 * @ordered
	 */
	protected String nomCodePlan = NOM_CODE_PLAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsableAttributionMouvement() <em>Responsable Attribution Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableAttributionMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSABLE_ATTRIBUTION_MOUVEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsableAttributionMouvement() <em>Responsable Attribution Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableAttributionMouvement()
	 * @generated
	 * @ordered
	 */
	protected String responsableAttributionMouvement = RESPONSABLE_ATTRIBUTION_MOUVEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMouvementParRouteMouvementParRoute() <em>Est Sujet Association Mouvement Par Route Mouvement Par Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMouvementParRouteMouvementParRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMouvementParRouteMouvementParRoute;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMouvementParRouteMouvementParRoute() <em>Est Objet Association Mouvement Par Route Mouvement Par Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMouvementParRouteMouvementParRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMouvementParRouteMouvementParRoute;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationConvoiMouvementParRoute() <em>Est Objet Association Convoi Mouvement Par Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationConvoiMouvementParRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationConvoiMouvementParRoute;

	/**
	 * The cached value of the '{@link #getAPourContraintesMouvementContraintesMouvement() <em>APour Contraintes Mouvement Contraintes Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourContraintesMouvementContraintesMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeContraintesMouvement aPourContraintesMouvementContraintesMouvement;

	/**
	 * The cached value of the '{@link #getADonneLieuAuCompteRenduMouvementCompteRenduMouvement() <em>ADonne Lieu Au Compte Rendu Mouvement Compte Rendu Mouvement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADonneLieuAuCompteRenduMouvementCompteRenduMouvement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCompteRenduMouvement> aDonneLieuAuCompteRenduMouvementCompteRenduMouvement;

	/**
	 * The cached value of the '{@link #getAPourIncidentMouvementIncidentMouvement() <em>APour Incident Mouvement Incident Mouvement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourIncidentMouvementIncidentMouvement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeIncidentMouvement> aPourIncidentMouvementIncidentMouvement;

	/**
	 * The cached value of the '{@link #getAPourUniteFaisantMouvementUnite() <em>APour Unite Faisant Mouvement Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteFaisantMouvementUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteFaisantMouvementUnite;

	/**
	 * The cached value of the '{@link #getAPourItineraireItineraire() <em>APour Itineraire Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourItineraireItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourItineraireItineraire;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMouvementParRoute() <em>Est Objet Association Unite Mouvement Par Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMouvementParRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMouvementParRoute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMouvementParRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMouvementParRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMouvementParRouteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoMouvementParRouteCategorie newCategorie) {
		TypeDictionaryDicoMouvementParRouteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoMouvementParRouteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCadreOperation() {
		return cadreOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCadreOperation(String newCadreOperation) {
		String oldCadreOperation = cadreOperation;
		cadreOperation = newCadreOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CADRE_OPERATION, oldCadreOperation, cadreOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebutMouvement() {
		return dateDebutMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutMouvement(XMLGregorianCalendar newDateDebutMouvement) {
		XMLGregorianCalendar oldDateDebutMouvement = dateDebutMouvement;
		dateDebutMouvement = newDateDebutMouvement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DATE_DEBUT_MOUVEMENT, oldDateDebutMouvement, dateDebutMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDemandeParticuliere() {
		return demandeParticuliere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandeParticuliere(String newDemandeParticuliere) {
		String oldDemandeParticuliere = demandeParticuliere;
		demandeParticuliere = newDemandeParticuliere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DEMANDE_PARTICULIERE, oldDemandeParticuliere, demandeParticuliere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibellePlan() {
		return libellePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibellePlan(String newLibellePlan) {
		String oldLibellePlan = libellePlan;
		libellePlan = newLibellePlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__LIBELLE_PLAN, oldLibellePlan, libellePlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomCodeMouvement() {
		return nomCodeMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomCodeMouvement(String newNomCodeMouvement) {
		String oldNomCodeMouvement = nomCodeMouvement;
		nomCodeMouvement = newNomCodeMouvement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_MOUVEMENT, oldNomCodeMouvement, nomCodeMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomCodePlan() {
		return nomCodePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomCodePlan(String newNomCodePlan) {
		String oldNomCodePlan = nomCodePlan;
		nomCodePlan = newNomCodePlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_PLAN, oldNomCodePlan, nomCodePlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsableAttributionMouvement() {
		return responsableAttributionMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsableAttributionMouvement(String newResponsableAttributionMouvement) {
		String oldResponsableAttributionMouvement = responsableAttributionMouvement;
		responsableAttributionMouvement = newResponsableAttributionMouvement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__RESPONSABLE_ATTRIBUTION_MOUVEMENT, oldResponsableAttributionMouvement, responsableAttributionMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMouvementParRouteMouvementParRoute() {
		if (estSujetAssociationMouvementParRouteMouvementParRoute == null) {
			estSujetAssociationMouvementParRouteMouvementParRoute = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_SUJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE);
		}
		return estSujetAssociationMouvementParRouteMouvementParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMouvementParRouteMouvementParRoute() {
		if (estObjetAssociationMouvementParRouteMouvementParRoute == null) {
			estObjetAssociationMouvementParRouteMouvementParRoute = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE);
		}
		return estObjetAssociationMouvementParRouteMouvementParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationConvoiMouvementParRoute() {
		if (estObjetAssociationConvoiMouvementParRoute == null) {
			estObjetAssociationConvoiMouvementParRoute = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE);
		}
		return estObjetAssociationConvoiMouvementParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContraintesMouvement getAPourContraintesMouvementContraintesMouvement() {
		return aPourContraintesMouvementContraintesMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourContraintesMouvementContraintesMouvement(TypeContraintesMouvement newAPourContraintesMouvementContraintesMouvement, NotificationChain msgs) {
		TypeContraintesMouvement oldAPourContraintesMouvementContraintesMouvement = aPourContraintesMouvementContraintesMouvement;
		aPourContraintesMouvementContraintesMouvement = newAPourContraintesMouvementContraintesMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_CONTRAINTES_MOUVEMENT_CONTRAINTES_MOUVEMENT, oldAPourContraintesMouvementContraintesMouvement, newAPourContraintesMouvementContraintesMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourContraintesMouvementContraintesMouvement(TypeContraintesMouvement newAPourContraintesMouvementContraintesMouvement) {
		if (newAPourContraintesMouvementContraintesMouvement != aPourContraintesMouvementContraintesMouvement) {
			NotificationChain msgs = null;
			if (aPourContraintesMouvementContraintesMouvement != null)
				msgs = ((InternalEObject)aPourContraintesMouvementContraintesMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_CONTRAINTES_MOUVEMENT_CONTRAINTES_MOUVEMENT, null, msgs);
			if (newAPourContraintesMouvementContraintesMouvement != null)
				msgs = ((InternalEObject)newAPourContraintesMouvementContraintesMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_CONTRAINTES_MOUVEMENT_CONTRAINTES_MOUVEMENT, null, msgs);
			msgs = basicSetAPourContraintesMouvementContraintesMouvement(newAPourContraintesMouvementContraintesMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_CONTRAINTES_MOUVEMENT_CONTRAINTES_MOUVEMENT, newAPourContraintesMouvementContraintesMouvement, newAPourContraintesMouvementContraintesMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCompteRenduMouvement> getADonneLieuAuCompteRenduMouvementCompteRenduMouvement() {
		if (aDonneLieuAuCompteRenduMouvementCompteRenduMouvement == null) {
			aDonneLieuAuCompteRenduMouvementCompteRenduMouvement = new EObjectContainmentEList<TypeCompteRenduMouvement>(TypeCompteRenduMouvement.class, this, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__ADONNE_LIEU_AU_COMPTE_RENDU_MOUVEMENT_COMPTE_RENDU_MOUVEMENT);
		}
		return aDonneLieuAuCompteRenduMouvementCompteRenduMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeIncidentMouvement> getAPourIncidentMouvementIncidentMouvement() {
		if (aPourIncidentMouvementIncidentMouvement == null) {
			aPourIncidentMouvementIncidentMouvement = new EObjectContainmentEList<TypeIncidentMouvement>(TypeIncidentMouvement.class, this, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_INCIDENT_MOUVEMENT_INCIDENT_MOUVEMENT);
		}
		return aPourIncidentMouvementIncidentMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteFaisantMouvementUnite() {
		if (aPourUniteFaisantMouvementUnite == null) {
			aPourUniteFaisantMouvementUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_UNITE_FAISANT_MOUVEMENT_UNITE);
		}
		return aPourUniteFaisantMouvementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourItineraireItineraire() {
		if (aPourItineraireItineraire == null) {
			aPourItineraireItineraire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_ITINERAIRE_ITINERAIRE);
		}
		return aPourItineraireItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMouvementParRoute() {
		if (estObjetAssociationUniteMouvementParRoute == null) {
			estObjetAssociationUniteMouvementParRoute = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE);
		}
		return estObjetAssociationUniteMouvementParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_SUJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getEstSujetAssociationMouvementParRouteMouvementParRoute()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getEstObjetAssociationMouvementParRouteMouvementParRoute()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getEstObjetAssociationConvoiMouvementParRoute()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_CONTRAINTES_MOUVEMENT_CONTRAINTES_MOUVEMENT:
				return basicSetAPourContraintesMouvementContraintesMouvement(null, msgs);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__ADONNE_LIEU_AU_COMPTE_RENDU_MOUVEMENT_COMPTE_RENDU_MOUVEMENT:
				return ((InternalEList<?>)getADonneLieuAuCompteRenduMouvementCompteRenduMouvement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_INCIDENT_MOUVEMENT_INCIDENT_MOUVEMENT:
				return ((InternalEList<?>)getAPourIncidentMouvementIncidentMouvement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_UNITE_FAISANT_MOUVEMENT_UNITE:
				return ((InternalEList<?>)getAPourUniteFaisantMouvementUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_ITINERAIRE_ITINERAIRE:
				return ((InternalEList<?>)getAPourItineraireItineraire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getEstObjetAssociationUniteMouvementParRoute()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CADRE_OPERATION:
				return getCadreOperation();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DATE_DEBUT_MOUVEMENT:
				return getDateDebutMouvement();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DEMANDE_PARTICULIERE:
				return getDemandeParticuliere();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__LIBELLE_PLAN:
				return getLibellePlan();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_MOUVEMENT:
				return getNomCodeMouvement();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_PLAN:
				return getNomCodePlan();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__RESPONSABLE_ATTRIBUTION_MOUVEMENT:
				return getResponsableAttributionMouvement();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_SUJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				return getEstSujetAssociationMouvementParRouteMouvementParRoute();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				return getEstObjetAssociationMouvementParRouteMouvementParRoute();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				return getEstObjetAssociationConvoiMouvementParRoute();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_CONTRAINTES_MOUVEMENT_CONTRAINTES_MOUVEMENT:
				return getAPourContraintesMouvementContraintesMouvement();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__ADONNE_LIEU_AU_COMPTE_RENDU_MOUVEMENT_COMPTE_RENDU_MOUVEMENT:
				return getADonneLieuAuCompteRenduMouvementCompteRenduMouvement();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_INCIDENT_MOUVEMENT_INCIDENT_MOUVEMENT:
				return getAPourIncidentMouvementIncidentMouvement();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_UNITE_FAISANT_MOUVEMENT_UNITE:
				return getAPourUniteFaisantMouvementUnite();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_ITINERAIRE_ITINERAIRE:
				return getAPourItineraireItineraire();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				return getEstObjetAssociationUniteMouvementParRoute();
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
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				setCategorie((TypeDictionaryDicoMouvementParRouteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CADRE_OPERATION:
				setCadreOperation((String)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DATE_DEBUT_MOUVEMENT:
				setDateDebutMouvement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DEMANDE_PARTICULIERE:
				setDemandeParticuliere((String)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__LIBELLE_PLAN:
				setLibellePlan((String)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_MOUVEMENT:
				setNomCodeMouvement((String)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_PLAN:
				setNomCodePlan((String)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__RESPONSABLE_ATTRIBUTION_MOUVEMENT:
				setResponsableAttributionMouvement((String)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_SUJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				getEstSujetAssociationMouvementParRouteMouvementParRoute().clear();
				getEstSujetAssociationMouvementParRouteMouvementParRoute().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				getEstObjetAssociationMouvementParRouteMouvementParRoute().clear();
				getEstObjetAssociationMouvementParRouteMouvementParRoute().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				getEstObjetAssociationConvoiMouvementParRoute().clear();
				getEstObjetAssociationConvoiMouvementParRoute().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_CONTRAINTES_MOUVEMENT_CONTRAINTES_MOUVEMENT:
				setAPourContraintesMouvementContraintesMouvement((TypeContraintesMouvement)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__ADONNE_LIEU_AU_COMPTE_RENDU_MOUVEMENT_COMPTE_RENDU_MOUVEMENT:
				getADonneLieuAuCompteRenduMouvementCompteRenduMouvement().clear();
				getADonneLieuAuCompteRenduMouvementCompteRenduMouvement().addAll((Collection<? extends TypeCompteRenduMouvement>)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_INCIDENT_MOUVEMENT_INCIDENT_MOUVEMENT:
				getAPourIncidentMouvementIncidentMouvement().clear();
				getAPourIncidentMouvementIncidentMouvement().addAll((Collection<? extends TypeIncidentMouvement>)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_UNITE_FAISANT_MOUVEMENT_UNITE:
				getAPourUniteFaisantMouvementUnite().clear();
				getAPourUniteFaisantMouvementUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_ITINERAIRE_ITINERAIRE:
				getAPourItineraireItineraire().clear();
				getAPourItineraireItineraire().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				getEstObjetAssociationUniteMouvementParRoute().clear();
				getEstObjetAssociationUniteMouvementParRoute().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CADRE_OPERATION:
				setCadreOperation(CADRE_OPERATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DATE_DEBUT_MOUVEMENT:
				setDateDebutMouvement(DATE_DEBUT_MOUVEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DEMANDE_PARTICULIERE:
				setDemandeParticuliere(DEMANDE_PARTICULIERE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__LIBELLE_PLAN:
				setLibellePlan(LIBELLE_PLAN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_MOUVEMENT:
				setNomCodeMouvement(NOM_CODE_MOUVEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_PLAN:
				setNomCodePlan(NOM_CODE_PLAN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__RESPONSABLE_ATTRIBUTION_MOUVEMENT:
				setResponsableAttributionMouvement(RESPONSABLE_ATTRIBUTION_MOUVEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_SUJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				getEstSujetAssociationMouvementParRouteMouvementParRoute().clear();
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				getEstObjetAssociationMouvementParRouteMouvementParRoute().clear();
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				getEstObjetAssociationConvoiMouvementParRoute().clear();
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_CONTRAINTES_MOUVEMENT_CONTRAINTES_MOUVEMENT:
				setAPourContraintesMouvementContraintesMouvement((TypeContraintesMouvement)null);
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__ADONNE_LIEU_AU_COMPTE_RENDU_MOUVEMENT_COMPTE_RENDU_MOUVEMENT:
				getADonneLieuAuCompteRenduMouvementCompteRenduMouvement().clear();
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_INCIDENT_MOUVEMENT_INCIDENT_MOUVEMENT:
				getAPourIncidentMouvementIncidentMouvement().clear();
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_UNITE_FAISANT_MOUVEMENT_UNITE:
				getAPourUniteFaisantMouvementUnite().clear();
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_ITINERAIRE_ITINERAIRE:
				getAPourItineraireItineraire().clear();
				return;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				getEstObjetAssociationUniteMouvementParRoute().clear();
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
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__CADRE_OPERATION:
				return CADRE_OPERATION_EDEFAULT == null ? cadreOperation != null : !CADRE_OPERATION_EDEFAULT.equals(cadreOperation);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DATE_DEBUT_MOUVEMENT:
				return DATE_DEBUT_MOUVEMENT_EDEFAULT == null ? dateDebutMouvement != null : !DATE_DEBUT_MOUVEMENT_EDEFAULT.equals(dateDebutMouvement);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__DEMANDE_PARTICULIERE:
				return DEMANDE_PARTICULIERE_EDEFAULT == null ? demandeParticuliere != null : !DEMANDE_PARTICULIERE_EDEFAULT.equals(demandeParticuliere);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__LIBELLE_PLAN:
				return LIBELLE_PLAN_EDEFAULT == null ? libellePlan != null : !LIBELLE_PLAN_EDEFAULT.equals(libellePlan);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_MOUVEMENT:
				return NOM_CODE_MOUVEMENT_EDEFAULT == null ? nomCodeMouvement != null : !NOM_CODE_MOUVEMENT_EDEFAULT.equals(nomCodeMouvement);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__NOM_CODE_PLAN:
				return NOM_CODE_PLAN_EDEFAULT == null ? nomCodePlan != null : !NOM_CODE_PLAN_EDEFAULT.equals(nomCodePlan);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__RESPONSABLE_ATTRIBUTION_MOUVEMENT:
				return RESPONSABLE_ATTRIBUTION_MOUVEMENT_EDEFAULT == null ? responsableAttributionMouvement != null : !RESPONSABLE_ATTRIBUTION_MOUVEMENT_EDEFAULT.equals(responsableAttributionMouvement);
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_SUJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				return estSujetAssociationMouvementParRouteMouvementParRoute != null && !estSujetAssociationMouvementParRouteMouvementParRoute.isEmpty();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE:
				return estObjetAssociationMouvementParRouteMouvementParRoute != null && !estObjetAssociationMouvementParRouteMouvementParRoute.isEmpty();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				return estObjetAssociationConvoiMouvementParRoute != null && !estObjetAssociationConvoiMouvementParRoute.isEmpty();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_CONTRAINTES_MOUVEMENT_CONTRAINTES_MOUVEMENT:
				return aPourContraintesMouvementContraintesMouvement != null;
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__ADONNE_LIEU_AU_COMPTE_RENDU_MOUVEMENT_COMPTE_RENDU_MOUVEMENT:
				return aDonneLieuAuCompteRenduMouvementCompteRenduMouvement != null && !aDonneLieuAuCompteRenduMouvementCompteRenduMouvement.isEmpty();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_INCIDENT_MOUVEMENT_INCIDENT_MOUVEMENT:
				return aPourIncidentMouvementIncidentMouvement != null && !aPourIncidentMouvementIncidentMouvement.isEmpty();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_UNITE_FAISANT_MOUVEMENT_UNITE:
				return aPourUniteFaisantMouvementUnite != null && !aPourUniteFaisantMouvementUnite.isEmpty();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__APOUR_ITINERAIRE_ITINERAIRE:
				return aPourItineraireItineraire != null && !aPourItineraireItineraire.isEmpty();
			case SchemaPackage.TYPE_MOUVEMENT_PAR_ROUTE__EST_OBJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				return estObjetAssociationUniteMouvementParRoute != null && !estObjetAssociationUniteMouvementParRoute.isEmpty();
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", cadreOperation: ");
		result.append(cadreOperation);
		result.append(", dateDebutMouvement: ");
		result.append(dateDebutMouvement);
		result.append(", demandeParticuliere: ");
		result.append(demandeParticuliere);
		result.append(", libellePlan: ");
		result.append(libellePlan);
		result.append(", nomCodeMouvement: ");
		result.append(nomCodeMouvement);
		result.append(", nomCodePlan: ");
		result.append(nomCodePlan);
		result.append(", responsableAttributionMouvement: ");
		result.append(responsableAttributionMouvement);
		result.append(')');
		return result.toString();
	}

} //TypeMouvementParRouteImpl
