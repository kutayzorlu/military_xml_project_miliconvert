/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCompteRenduMouvement;
import mpia.schema.TypeDictionaryDicoCompteRenduMouvementCategorie;
import mpia.schema.TypeLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Compte Rendu Mouvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getGDHpassageTete <em>GD Hpassage Tete</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getGDHpassageQueue <em>GD Hpassage Queue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getCommentaireOuDemande <em>Commentaire Ou Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduMouvementImpl#getEstLocaliseParLocalisation <em>Est Localise Par Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCompteRenduMouvementImpl extends EObjectImpl implements TypeCompteRenduMouvement {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompteRenduMouvementCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCompteRenduMouvementCategorie.START;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompteRenduMouvementCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getGDHpassageTete() <em>GD Hpassage Tete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageTete()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HPASSAGE_TETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHpassageTete() <em>GD Hpassage Tete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageTete()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHpassageTete = GD_HPASSAGE_TETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHpassageQueue() <em>GD Hpassage Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageQueue()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HPASSAGE_QUEUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHpassageQueue() <em>GD Hpassage Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageQueue()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHpassageQueue = GD_HPASSAGE_QUEUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreTotalVehiculesAChenilles() <em>Nombre Total Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TOTAL_VEHICULES_ACHENILLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTotalVehiculesAChenilles() <em>Nombre Total Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected long nombreTotalVehiculesAChenilles = NOMBRE_TOTAL_VEHICULES_ACHENILLES_EDEFAULT;

	/**
	 * This is true if the Nombre Total Vehicules AChenilles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTotalVehiculesAChenillesESet;

	/**
	 * The default value of the '{@link #getNombreTotalVehiculesARoues() <em>Nombre Total Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalVehiculesARoues()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TOTAL_VEHICULES_AROUES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTotalVehiculesARoues() <em>Nombre Total Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalVehiculesARoues()
	 * @generated
	 * @ordered
	 */
	protected long nombreTotalVehiculesARoues = NOMBRE_TOTAL_VEHICULES_AROUES_EDEFAULT;

	/**
	 * This is true if the Nombre Total Vehicules ARoues attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTotalVehiculesARouesESet;

	/**
	 * The default value of the '{@link #getCommentaireOuDemande() <em>Commentaire Ou Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireOuDemande()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_OU_DEMANDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireOuDemande() <em>Commentaire Ou Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireOuDemande()
	 * @generated
	 * @ordered
	 */
	protected String commentaireOuDemande = COMMENTAIRE_OU_DEMANDE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteRendantCompteUnite() <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteRendantCompteUnite;

	/**
	 * The cached value of the '{@link #getEstLocaliseParLocalisation() <em>Est Localise Par Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseParLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation estLocaliseParLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCompteRenduMouvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCompteRenduMouvement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompteRenduMouvementCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCompteRenduMouvementCategorie newCategorie) {
		TypeDictionaryDicoCompteRenduMouvementCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCompteRenduMouvementCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public XMLGregorianCalendar getGDHpassageTete() {
		return gDHpassageTete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHpassageTete(XMLGregorianCalendar newGDHpassageTete) {
		XMLGregorianCalendar oldGDHpassageTete = gDHpassageTete;
		gDHpassageTete = newGDHpassageTete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_TETE, oldGDHpassageTete, gDHpassageTete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHpassageQueue() {
		return gDHpassageQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHpassageQueue(XMLGregorianCalendar newGDHpassageQueue) {
		XMLGregorianCalendar oldGDHpassageQueue = gDHpassageQueue;
		gDHpassageQueue = newGDHpassageQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_QUEUE, oldGDHpassageQueue, gDHpassageQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTotalVehiculesAChenilles() {
		return nombreTotalVehiculesAChenilles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTotalVehiculesAChenilles(long newNombreTotalVehiculesAChenilles) {
		long oldNombreTotalVehiculesAChenilles = nombreTotalVehiculesAChenilles;
		nombreTotalVehiculesAChenilles = newNombreTotalVehiculesAChenilles;
		boolean oldNombreTotalVehiculesAChenillesESet = nombreTotalVehiculesAChenillesESet;
		nombreTotalVehiculesAChenillesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES, oldNombreTotalVehiculesAChenilles, nombreTotalVehiculesAChenilles, !oldNombreTotalVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTotalVehiculesAChenilles() {
		long oldNombreTotalVehiculesAChenilles = nombreTotalVehiculesAChenilles;
		boolean oldNombreTotalVehiculesAChenillesESet = nombreTotalVehiculesAChenillesESet;
		nombreTotalVehiculesAChenilles = NOMBRE_TOTAL_VEHICULES_ACHENILLES_EDEFAULT;
		nombreTotalVehiculesAChenillesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES, oldNombreTotalVehiculesAChenilles, NOMBRE_TOTAL_VEHICULES_ACHENILLES_EDEFAULT, oldNombreTotalVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTotalVehiculesAChenilles() {
		return nombreTotalVehiculesAChenillesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTotalVehiculesARoues() {
		return nombreTotalVehiculesARoues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTotalVehiculesARoues(long newNombreTotalVehiculesARoues) {
		long oldNombreTotalVehiculesARoues = nombreTotalVehiculesARoues;
		nombreTotalVehiculesARoues = newNombreTotalVehiculesARoues;
		boolean oldNombreTotalVehiculesARouesESet = nombreTotalVehiculesARouesESet;
		nombreTotalVehiculesARouesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES, oldNombreTotalVehiculesARoues, nombreTotalVehiculesARoues, !oldNombreTotalVehiculesARouesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTotalVehiculesARoues() {
		long oldNombreTotalVehiculesARoues = nombreTotalVehiculesARoues;
		boolean oldNombreTotalVehiculesARouesESet = nombreTotalVehiculesARouesESet;
		nombreTotalVehiculesARoues = NOMBRE_TOTAL_VEHICULES_AROUES_EDEFAULT;
		nombreTotalVehiculesARouesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES, oldNombreTotalVehiculesARoues, NOMBRE_TOTAL_VEHICULES_AROUES_EDEFAULT, oldNombreTotalVehiculesARouesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTotalVehiculesARoues() {
		return nombreTotalVehiculesARouesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireOuDemande() {
		return commentaireOuDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireOuDemande(String newCommentaireOuDemande) {
		String oldCommentaireOuDemande = commentaireOuDemande;
		commentaireOuDemande = newCommentaireOuDemande;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__COMMENTAIRE_OU_DEMANDE, oldCommentaireOuDemande, commentaireOuDemande));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteRendantCompteUnite() {
		return aPourUniteRendantCompteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteRendantCompteUnite = aPourUniteRendantCompteUnite;
		aPourUniteRendantCompteUnite = newAPourUniteRendantCompteUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, oldAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite) {
		if (newAPourUniteRendantCompteUnite != aPourUniteRendantCompteUnite) {
			NotificationChain msgs = null;
			if (aPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)aPourUniteRendantCompteUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			if (newAPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)newAPourUniteRendantCompteUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			msgs = basicSetAPourUniteRendantCompteUnite(newAPourUniteRendantCompteUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, newAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getEstLocaliseParLocalisation() {
		return estLocaliseParLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseParLocalisation(TypeLocalisation newEstLocaliseParLocalisation, NotificationChain msgs) {
		TypeLocalisation oldEstLocaliseParLocalisation = estLocaliseParLocalisation;
		estLocaliseParLocalisation = newEstLocaliseParLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__EST_LOCALISE_PAR_LOCALISATION, oldEstLocaliseParLocalisation, newEstLocaliseParLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseParLocalisation(TypeLocalisation newEstLocaliseParLocalisation) {
		if (newEstLocaliseParLocalisation != estLocaliseParLocalisation) {
			NotificationChain msgs = null;
			if (estLocaliseParLocalisation != null)
				msgs = ((InternalEObject)estLocaliseParLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__EST_LOCALISE_PAR_LOCALISATION, null, msgs);
			if (newEstLocaliseParLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseParLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__EST_LOCALISE_PAR_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseParLocalisation(newEstLocaliseParLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__EST_LOCALISE_PAR_LOCALISATION, newEstLocaliseParLocalisation, newEstLocaliseParLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return basicSetAPourUniteRendantCompteUnite(null, msgs);
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__EST_LOCALISE_PAR_LOCALISATION:
				return basicSetEstLocaliseParLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_TETE:
				return getGDHpassageTete();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_QUEUE:
				return getGDHpassageQueue();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES:
				return new Long(getNombreTotalVehiculesAChenilles());
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES:
				return new Long(getNombreTotalVehiculesARoues());
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__COMMENTAIRE_OU_DEMANDE:
				return getCommentaireOuDemande();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return getAPourUniteRendantCompteUnite();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__EST_LOCALISE_PAR_LOCALISATION:
				return getEstLocaliseParLocalisation();
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
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoCompteRenduMouvementCategorie)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_TETE:
				setGDHpassageTete((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_QUEUE:
				setGDHpassageQueue((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES:
				setNombreTotalVehiculesAChenilles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES:
				setNombreTotalVehiculesARoues(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__COMMENTAIRE_OU_DEMANDE:
				setCommentaireOuDemande((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__EST_LOCALISE_PAR_LOCALISATION:
				setEstLocaliseParLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_TETE:
				setGDHpassageTete(GD_HPASSAGE_TETE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_QUEUE:
				setGDHpassageQueue(GD_HPASSAGE_QUEUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES:
				unsetNombreTotalVehiculesAChenilles();
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES:
				unsetNombreTotalVehiculesARoues();
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__COMMENTAIRE_OU_DEMANDE:
				setCommentaireOuDemande(COMMENTAIRE_OU_DEMANDE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__EST_LOCALISE_PAR_LOCALISATION:
				setEstLocaliseParLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_TETE:
				return GD_HPASSAGE_TETE_EDEFAULT == null ? gDHpassageTete != null : !GD_HPASSAGE_TETE_EDEFAULT.equals(gDHpassageTete);
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__GD_HPASSAGE_QUEUE:
				return GD_HPASSAGE_QUEUE_EDEFAULT == null ? gDHpassageQueue != null : !GD_HPASSAGE_QUEUE_EDEFAULT.equals(gDHpassageQueue);
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES:
				return isSetNombreTotalVehiculesAChenilles();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES:
				return isSetNombreTotalVehiculesARoues();
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__COMMENTAIRE_OU_DEMANDE:
				return COMMENTAIRE_OU_DEMANDE_EDEFAULT == null ? commentaireOuDemande != null : !COMMENTAIRE_OU_DEMANDE_EDEFAULT.equals(commentaireOuDemande);
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return aPourUniteRendantCompteUnite != null;
			case SchemaPackage.TYPE_COMPTE_RENDU_MOUVEMENT__EST_LOCALISE_PAR_LOCALISATION:
				return estLocaliseParLocalisation != null;
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
		result.append(", gDHpassageTete: ");
		result.append(gDHpassageTete);
		result.append(", gDHpassageQueue: ");
		result.append(gDHpassageQueue);
		result.append(", nombreTotalVehiculesAChenilles: ");
		if (nombreTotalVehiculesAChenillesESet) result.append(nombreTotalVehiculesAChenilles); else result.append("<unset>");
		result.append(", nombreTotalVehiculesARoues: ");
		if (nombreTotalVehiculesARouesESet) result.append(nombreTotalVehiculesARoues); else result.append("<unset>");
		result.append(", commentaireOuDemande: ");
		result.append(commentaireOuDemande);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCompteRenduMouvementImpl
