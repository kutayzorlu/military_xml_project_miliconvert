/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPointParticulierItineraireCategorie;
import mpia.schema.TypeDictionaryDicoPointParticulierItineraireSousCategorie;
import mpia.schema.TypePointParticulierItineraire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Point Particulier Itineraire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getNumeroPoint <em>Numero Point</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getGDHactivation <em>GD Hactivation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getGDHpassageOblige <em>GD Hpassage Oblige</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getGDHpassageAuPlusTard <em>GD Hpassage Au Plus Tard</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getGDHpassageAuPlusTot <em>GD Hpassage Au Plus Tot</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getVitesseImposee <em>Vitesse Imposee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getDureeArret <em>Duree Arret</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getRouteAEmprunter <em>Route AEmprunter</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointParticulierItineraireImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePointParticulierItineraireImpl extends EObjectImpl implements TypePointParticulierItineraire {
	/**
	 * The default value of the '{@link #getNumeroPoint() <em>Numero Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPoint()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_POINT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroPoint() <em>Numero Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPoint()
	 * @generated
	 * @ordered
	 */
	protected long numeroPoint = NUMERO_POINT_EDEFAULT;

	/**
	 * This is true if the Numero Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroPointESet;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_BAPTEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected String nomBapteme = NOM_BAPTEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPointParticulierItineraireCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoPointParticulierItineraireCategorie.SPRTPT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPointParticulierItineraireCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPointParticulierItineraireSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoPointParticulierItineraireSousCategorie.PT;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPointParticulierItineraireSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getGDHactivation() <em>GD Hactivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHactivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHactivation() <em>GD Hactivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHactivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHactivation = GD_HACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHpassageOblige() <em>GD Hpassage Oblige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageOblige()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HPASSAGE_OBLIGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHpassageOblige() <em>GD Hpassage Oblige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageOblige()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHpassageOblige = GD_HPASSAGE_OBLIGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHpassageAuPlusTard() <em>GD Hpassage Au Plus Tard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageAuPlusTard()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHpassageAuPlusTard() <em>GD Hpassage Au Plus Tard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageAuPlusTard()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHpassageAuPlusTard = GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHpassageAuPlusTot() <em>GD Hpassage Au Plus Tot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageAuPlusTot()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHpassageAuPlusTot() <em>GD Hpassage Au Plus Tot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageAuPlusTot()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHpassageAuPlusTot = GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVitesseImposee() <em>Vitesse Imposee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseImposee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseImposee;

	/**
	 * The cached value of the '{@link #getDureeArret() <em>Duree Arret</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeArret()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeArret;

	/**
	 * The default value of the '{@link #getRouteAEmprunter() <em>Route AEmprunter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteAEmprunter()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_AEMPRUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteAEmprunter() <em>Route AEmprunter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteAEmprunter()
	 * @generated
	 * @ordered
	 */
	protected String routeAEmprunter = ROUTE_AEMPRUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePointParticulierItineraireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePointParticulierItineraire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroPoint() {
		return numeroPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPoint(long newNumeroPoint) {
		long oldNumeroPoint = numeroPoint;
		numeroPoint = newNumeroPoint;
		boolean oldNumeroPointESet = numeroPointESet;
		numeroPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NUMERO_POINT, oldNumeroPoint, numeroPoint, !oldNumeroPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroPoint() {
		long oldNumeroPoint = numeroPoint;
		boolean oldNumeroPointESet = numeroPointESet;
		numeroPoint = NUMERO_POINT_EDEFAULT;
		numeroPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NUMERO_POINT, oldNumeroPoint, NUMERO_POINT_EDEFAULT, oldNumeroPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroPoint() {
		return numeroPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomBapteme() {
		return nomBapteme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomBapteme(String newNomBapteme) {
		String oldNomBapteme = nomBapteme;
		nomBapteme = newNomBapteme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM_BAPTEME, oldNomBapteme, nomBapteme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPointParticulierItineraireCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoPointParticulierItineraireCategorie newCategorie) {
		TypeDictionaryDicoPointParticulierItineraireCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoPointParticulierItineraireCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoPointParticulierItineraireSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoPointParticulierItineraireSousCategorie newSousCategorie) {
		TypeDictionaryDicoPointParticulierItineraireSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoPointParticulierItineraireSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousCategorie() {
		return sousCategorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHactivation() {
		return gDHactivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHactivation(XMLGregorianCalendar newGDHactivation) {
		XMLGregorianCalendar oldGDHactivation = gDHactivation;
		gDHactivation = newGDHactivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HACTIVATION, oldGDHactivation, gDHactivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHpassageOblige() {
		return gDHpassageOblige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHpassageOblige(XMLGregorianCalendar newGDHpassageOblige) {
		XMLGregorianCalendar oldGDHpassageOblige = gDHpassageOblige;
		gDHpassageOblige = newGDHpassageOblige;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_OBLIGE, oldGDHpassageOblige, gDHpassageOblige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHpassageAuPlusTard() {
		return gDHpassageAuPlusTard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHpassageAuPlusTard(XMLGregorianCalendar newGDHpassageAuPlusTard) {
		XMLGregorianCalendar oldGDHpassageAuPlusTard = gDHpassageAuPlusTard;
		gDHpassageAuPlusTard = newGDHpassageAuPlusTard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TARD, oldGDHpassageAuPlusTard, gDHpassageAuPlusTard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHpassageAuPlusTot() {
		return gDHpassageAuPlusTot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHpassageAuPlusTot(XMLGregorianCalendar newGDHpassageAuPlusTot) {
		XMLGregorianCalendar oldGDHpassageAuPlusTot = gDHpassageAuPlusTot;
		gDHpassageAuPlusTot = newGDHpassageAuPlusTot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TOT, oldGDHpassageAuPlusTot, gDHpassageAuPlusTot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseImposee() {
		return vitesseImposee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseImposee(TypeDataTypeVitesseLineaire newVitesseImposee, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseImposee = vitesseImposee;
		vitesseImposee = newVitesseImposee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__VITESSE_IMPOSEE, oldVitesseImposee, newVitesseImposee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseImposee(TypeDataTypeVitesseLineaire newVitesseImposee) {
		if (newVitesseImposee != vitesseImposee) {
			NotificationChain msgs = null;
			if (vitesseImposee != null)
				msgs = ((InternalEObject)vitesseImposee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__VITESSE_IMPOSEE, null, msgs);
			if (newVitesseImposee != null)
				msgs = ((InternalEObject)newVitesseImposee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__VITESSE_IMPOSEE, null, msgs);
			msgs = basicSetVitesseImposee(newVitesseImposee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__VITESSE_IMPOSEE, newVitesseImposee, newVitesseImposee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeArret() {
		return dureeArret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeArret(TypeDataTypeDuree newDureeArret, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeArret = dureeArret;
		dureeArret = newDureeArret;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__DUREE_ARRET, oldDureeArret, newDureeArret);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeArret(TypeDataTypeDuree newDureeArret) {
		if (newDureeArret != dureeArret) {
			NotificationChain msgs = null;
			if (dureeArret != null)
				msgs = ((InternalEObject)dureeArret).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__DUREE_ARRET, null, msgs);
			if (newDureeArret != null)
				msgs = ((InternalEObject)newDureeArret).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__DUREE_ARRET, null, msgs);
			msgs = basicSetDureeArret(newDureeArret, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__DUREE_ARRET, newDureeArret, newDureeArret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRouteAEmprunter() {
		return routeAEmprunter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteAEmprunter(String newRouteAEmprunter) {
		String oldRouteAEmprunter = routeAEmprunter;
		routeAEmprunter = newRouteAEmprunter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__ROUTE_AEMPRUNTER, oldRouteAEmprunter, routeAEmprunter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__VITESSE_IMPOSEE:
				return basicSetVitesseImposee(null, msgs);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__DUREE_ARRET:
				return basicSetDureeArret(null, msgs);
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
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NUMERO_POINT:
				return new Long(getNumeroPoint());
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM:
				return getNom();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM_BAPTEME:
				return getNomBapteme();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HACTIVATION:
				return getGDHactivation();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_OBLIGE:
				return getGDHpassageOblige();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TARD:
				return getGDHpassageAuPlusTard();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TOT:
				return getGDHpassageAuPlusTot();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__VITESSE_IMPOSEE:
				return getVitesseImposee();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__DUREE_ARRET:
				return getDureeArret();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__ROUTE_AEMPRUNTER:
				return getRouteAEmprunter();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CE:
				return getCE();
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
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NUMERO_POINT:
				setNumeroPoint(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM_BAPTEME:
				setNomBapteme((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoPointParticulierItineraireCategorie)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoPointParticulierItineraireSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HACTIVATION:
				setGDHactivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_OBLIGE:
				setGDHpassageOblige((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TARD:
				setGDHpassageAuPlusTard((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TOT:
				setGDHpassageAuPlusTot((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__VITESSE_IMPOSEE:
				setVitesseImposee((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__DUREE_ARRET:
				setDureeArret((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__ROUTE_AEMPRUNTER:
				setRouteAEmprunter((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NUMERO_POINT:
				unsetNumeroPoint();
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM_BAPTEME:
				setNomBapteme(NOM_BAPTEME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HACTIVATION:
				setGDHactivation(GD_HACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_OBLIGE:
				setGDHpassageOblige(GD_HPASSAGE_OBLIGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TARD:
				setGDHpassageAuPlusTard(GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TOT:
				setGDHpassageAuPlusTot(GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__VITESSE_IMPOSEE:
				setVitesseImposee((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__DUREE_ARRET:
				setDureeArret((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__ROUTE_AEMPRUNTER:
				setRouteAEmprunter(ROUTE_AEMPRUNTER_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NUMERO_POINT:
				return isSetNumeroPoint();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__NOM_BAPTEME:
				return NOM_BAPTEME_EDEFAULT == null ? nomBapteme != null : !NOM_BAPTEME_EDEFAULT.equals(nomBapteme);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HACTIVATION:
				return GD_HACTIVATION_EDEFAULT == null ? gDHactivation != null : !GD_HACTIVATION_EDEFAULT.equals(gDHactivation);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_OBLIGE:
				return GD_HPASSAGE_OBLIGE_EDEFAULT == null ? gDHpassageOblige != null : !GD_HPASSAGE_OBLIGE_EDEFAULT.equals(gDHpassageOblige);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TARD:
				return GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT == null ? gDHpassageAuPlusTard != null : !GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT.equals(gDHpassageAuPlusTard);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__GD_HPASSAGE_AU_PLUS_TOT:
				return GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT == null ? gDHpassageAuPlusTot != null : !GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT.equals(gDHpassageAuPlusTot);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__VITESSE_IMPOSEE:
				return vitesseImposee != null;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__DUREE_ARRET:
				return dureeArret != null;
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__ROUTE_AEMPRUNTER:
				return ROUTE_AEMPRUNTER_EDEFAULT == null ? routeAEmprunter != null : !ROUTE_AEMPRUNTER_EDEFAULT.equals(routeAEmprunter);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_POINT_PARTICULIER_ITINERAIRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (numeroPoint: ");
		if (numeroPointESet) result.append(numeroPoint); else result.append("<unset>");
		result.append(", nom: ");
		result.append(nom);
		result.append(", nomBapteme: ");
		result.append(nomBapteme);
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(", gDHactivation: ");
		result.append(gDHactivation);
		result.append(", gDHpassageOblige: ");
		result.append(gDHpassageOblige);
		result.append(", gDHpassageAuPlusTard: ");
		result.append(gDHpassageAuPlusTard);
		result.append(", gDHpassageAuPlusTot: ");
		result.append(gDHpassageAuPlusTot);
		result.append(", routeAEmprunter: ");
		result.append(routeAEmprunter);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePointParticulierItineraireImpl
