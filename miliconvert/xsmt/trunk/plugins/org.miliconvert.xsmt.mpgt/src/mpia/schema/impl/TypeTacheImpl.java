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
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEffectifOuEnginAffecte;
import mpia.schema.TypeTache;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Tache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getAPourUniteResponsableUnite <em>APour Unite Responsable Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getConcerneTravailAideDeploiement <em>Concerne Travail Aide Deploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getConcerneObstacle <em>Concerne Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getConcerneOuvrageGenie <em>Concerne Ouvrage Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheImpl#getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte <em>APour Engin Ou Effectif Affecte Effectif Ou Engin Affecte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTacheImpl extends EObjectImpl implements TypeTache {
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
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFin = DATE_FIN_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteResponsableUnite() <em>APour Unite Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteResponsableUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteResponsableUnite;

	/**
	 * The cached value of the '{@link #getConcerneTravailAideDeploiement() <em>Concerne Travail Aide Deploiement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTravailAideDeploiement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneTravailAideDeploiement;

	/**
	 * The cached value of the '{@link #getConcerneObstacle() <em>Concerne Obstacle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneObstacle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneObstacle;

	/**
	 * The cached value of the '{@link #getConcerneOuvrageGenie() <em>Concerne Ouvrage Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneOuvrageGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneOuvrageGenie;

	/**
	 * The cached value of the '{@link #getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte() <em>APour Engin Ou Effectif Affecte Effectif Ou Engin Affecte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEffectifOuEnginAffecte> aPourEnginOuEffectifAffecteEffectifOuEnginAffecte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTache();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(XMLGregorianCalendar newDateDebut) {
		XMLGregorianCalendar oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(XMLGregorianCalendar newDateFin) {
		XMLGregorianCalendar oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE__DATE_FIN, oldDateFin, dateFin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteResponsableUnite() {
		return aPourUniteResponsableUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteResponsableUnite(TypeAssociationEXT newAPourUniteResponsableUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteResponsableUnite = aPourUniteResponsableUnite;
		aPourUniteResponsableUnite = newAPourUniteResponsableUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE__APOUR_UNITE_RESPONSABLE_UNITE, oldAPourUniteResponsableUnite, newAPourUniteResponsableUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteResponsableUnite(TypeAssociationEXT newAPourUniteResponsableUnite) {
		if (newAPourUniteResponsableUnite != aPourUniteResponsableUnite) {
			NotificationChain msgs = null;
			if (aPourUniteResponsableUnite != null)
				msgs = ((InternalEObject)aPourUniteResponsableUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TACHE__APOUR_UNITE_RESPONSABLE_UNITE, null, msgs);
			if (newAPourUniteResponsableUnite != null)
				msgs = ((InternalEObject)newAPourUniteResponsableUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TACHE__APOUR_UNITE_RESPONSABLE_UNITE, null, msgs);
			msgs = basicSetAPourUniteResponsableUnite(newAPourUniteResponsableUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE__APOUR_UNITE_RESPONSABLE_UNITE, newAPourUniteResponsableUnite, newAPourUniteResponsableUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneTravailAideDeploiement() {
		if (concerneTravailAideDeploiement == null) {
			concerneTravailAideDeploiement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TACHE__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT);
		}
		return concerneTravailAideDeploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneObstacle() {
		if (concerneObstacle == null) {
			concerneObstacle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TACHE__CONCERNE_OBSTACLE);
		}
		return concerneObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneOuvrageGenie() {
		if (concerneOuvrageGenie == null) {
			concerneOuvrageGenie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TACHE__CONCERNE_OUVRAGE_GENIE);
		}
		return concerneOuvrageGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEffectifOuEnginAffecte> getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte() {
		if (aPourEnginOuEffectifAffecteEffectifOuEnginAffecte == null) {
			aPourEnginOuEffectifAffecteEffectifOuEnginAffecte = new EObjectContainmentEList<TypeEffectifOuEnginAffecte>(TypeEffectifOuEnginAffecte.class, this, SchemaPackage.TYPE_TACHE__APOUR_ENGIN_OU_EFFECTIF_AFFECTE_EFFECTIF_OU_ENGIN_AFFECTE);
		}
		return aPourEnginOuEffectifAffecteEffectifOuEnginAffecte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TACHE__APOUR_UNITE_RESPONSABLE_UNITE:
				return basicSetAPourUniteResponsableUnite(null, msgs);
			case SchemaPackage.TYPE_TACHE__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT:
				return ((InternalEList<?>)getConcerneTravailAideDeploiement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TACHE__CONCERNE_OBSTACLE:
				return ((InternalEList<?>)getConcerneObstacle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TACHE__CONCERNE_OUVRAGE_GENIE:
				return ((InternalEList<?>)getConcerneOuvrageGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TACHE__APOUR_ENGIN_OU_EFFECTIF_AFFECTE_EFFECTIF_OU_ENGIN_AFFECTE:
				return ((InternalEList<?>)getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TACHE__NOM:
				return getNom();
			case SchemaPackage.TYPE_TACHE__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_TACHE__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_TACHE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_TACHE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TACHE__CE:
				return getCE();
			case SchemaPackage.TYPE_TACHE__APOUR_UNITE_RESPONSABLE_UNITE:
				return getAPourUniteResponsableUnite();
			case SchemaPackage.TYPE_TACHE__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT:
				return getConcerneTravailAideDeploiement();
			case SchemaPackage.TYPE_TACHE__CONCERNE_OBSTACLE:
				return getConcerneObstacle();
			case SchemaPackage.TYPE_TACHE__CONCERNE_OUVRAGE_GENIE:
				return getConcerneOuvrageGenie();
			case SchemaPackage.TYPE_TACHE__APOUR_ENGIN_OU_EFFECTIF_AFFECTE_EFFECTIF_OU_ENGIN_AFFECTE:
				return getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte();
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
			case SchemaPackage.TYPE_TACHE__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__DATE_FIN:
				setDateFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__APOUR_UNITE_RESPONSABLE_UNITE:
				setAPourUniteResponsableUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT:
				getConcerneTravailAideDeploiement().clear();
				getConcerneTravailAideDeploiement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__CONCERNE_OBSTACLE:
				getConcerneObstacle().clear();
				getConcerneObstacle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__CONCERNE_OUVRAGE_GENIE:
				getConcerneOuvrageGenie().clear();
				getConcerneOuvrageGenie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TACHE__APOUR_ENGIN_OU_EFFECTIF_AFFECTE_EFFECTIF_OU_ENGIN_AFFECTE:
				getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte().clear();
				getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte().addAll((Collection<? extends TypeEffectifOuEnginAffecte>)newValue);
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
			case SchemaPackage.TYPE_TACHE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TACHE__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TACHE__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TACHE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TACHE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TACHE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TACHE__APOUR_UNITE_RESPONSABLE_UNITE:
				setAPourUniteResponsableUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_TACHE__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT:
				getConcerneTravailAideDeploiement().clear();
				return;
			case SchemaPackage.TYPE_TACHE__CONCERNE_OBSTACLE:
				getConcerneObstacle().clear();
				return;
			case SchemaPackage.TYPE_TACHE__CONCERNE_OUVRAGE_GENIE:
				getConcerneOuvrageGenie().clear();
				return;
			case SchemaPackage.TYPE_TACHE__APOUR_ENGIN_OU_EFFECTIF_AFFECTE_EFFECTIF_OU_ENGIN_AFFECTE:
				getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte().clear();
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
			case SchemaPackage.TYPE_TACHE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_TACHE__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_TACHE__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case SchemaPackage.TYPE_TACHE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_TACHE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TACHE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_TACHE__APOUR_UNITE_RESPONSABLE_UNITE:
				return aPourUniteResponsableUnite != null;
			case SchemaPackage.TYPE_TACHE__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT:
				return concerneTravailAideDeploiement != null && !concerneTravailAideDeploiement.isEmpty();
			case SchemaPackage.TYPE_TACHE__CONCERNE_OBSTACLE:
				return concerneObstacle != null && !concerneObstacle.isEmpty();
			case SchemaPackage.TYPE_TACHE__CONCERNE_OUVRAGE_GENIE:
				return concerneOuvrageGenie != null && !concerneOuvrageGenie.isEmpty();
			case SchemaPackage.TYPE_TACHE__APOUR_ENGIN_OU_EFFECTIF_AFFECTE_EFFECTIF_OU_ENGIN_AFFECTE:
				return aPourEnginOuEffectifAffecteEffectifOuEnginAffecte != null && !aPourEnginOuEffectifAffecteEffectifOuEnginAffecte.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTacheImpl
