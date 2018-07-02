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
import mpia.schema.TypeAvancementTravailGenie;
import mpia.schema.TypeDictionaryDicoPlanNiveauPlanification;
import mpia.schema.TypeDictionaryDicoPlanSerieTravail;
import mpia.schema.TypeQuantiteConsommee;
import mpia.schema.TypeTravailGenie;

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
 * An implementation of the model object '<em><b>Type Travail Genie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getSerieTravail <em>Serie Travail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getNiveauPlanification <em>Niveau Planification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getConditionDeMiseEnOeuvre <em>Condition De Mise En Oeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getDateFinEstimee <em>Date Fin Estimee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getAPourTravailAideDeploiementTravailAideDeploiement <em>APour Travail Aide Deploiement Travail Aide Deploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getAPourOuvrageOrganisationOuvrageGenie <em>APour Ouvrage Organisation Ouvrage Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getAPourObstacleObstacle <em>APour Obstacle Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getAPourMoyensGenieMoyensGenie <em>APour Moyens Genie Moyens Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getADonnelieuCRAvancementAvancementTravailGenie <em>ADonnelieu CR Avancement Avancement Travail Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailGenieImpl#getAConsommeQuantiteConsommee <em>AConsomme Quantite Consommee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTravailGenieImpl extends EObjectImpl implements TypeTravailGenie {
	/**
	 * The default value of the '{@link #getSerieTravail() <em>Serie Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerieTravail()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPlanSerieTravail SERIE_TRAVAIL_EDEFAULT = TypeDictionaryDicoPlanSerieTravail.M;

	/**
	 * The cached value of the '{@link #getSerieTravail() <em>Serie Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerieTravail()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPlanSerieTravail serieTravail = SERIE_TRAVAIL_EDEFAULT;

	/**
	 * This is true if the Serie Travail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serieTravailESet;

	/**
	 * The default value of the '{@link #getNiveauPlanification() <em>Niveau Planification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauPlanification()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPlanNiveauPlanification NIVEAU_PLANIFICATION_EDEFAULT = TypeDictionaryDicoPlanNiveauPlanification.CRE;

	/**
	 * The cached value of the '{@link #getNiveauPlanification() <em>Niveau Planification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauPlanification()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPlanNiveauPlanification niveauPlanification = NIVEAU_PLANIFICATION_EDEFAULT;

	/**
	 * This is true if the Niveau Planification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauPlanificationESet;

	/**
	 * The default value of the '{@link #getConditionDeMiseEnOeuvre() <em>Condition De Mise En Oeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDeMiseEnOeuvre()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_DE_MISE_EN_OEUVRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionDeMiseEnOeuvre() <em>Condition De Mise En Oeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDeMiseEnOeuvre()
	 * @generated
	 * @ordered
	 */
	protected String conditionDeMiseEnOeuvre = CONDITION_DE_MISE_EN_OEUVRE_EDEFAULT;

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
	 * The default value of the '{@link #getDateFinEstimee() <em>Date Fin Estimee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinEstimee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_ESTIMEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFinEstimee() <em>Date Fin Estimee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinEstimee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFinEstimee = DATE_FIN_ESTIMEE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourTravailAideDeploiementTravailAideDeploiement() <em>APour Travail Aide Deploiement Travail Aide Deploiement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTravailAideDeploiementTravailAideDeploiement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourTravailAideDeploiementTravailAideDeploiement;

	/**
	 * The cached value of the '{@link #getAPourOuvrageOrganisationOuvrageGenie() <em>APour Ouvrage Organisation Ouvrage Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourOuvrageOrganisationOuvrageGenie()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourOuvrageOrganisationOuvrageGenie;

	/**
	 * The cached value of the '{@link #getAPourObstacleObstacle() <em>APour Obstacle Obstacle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObstacleObstacle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObstacleObstacle;

	/**
	 * The cached value of the '{@link #getAPourMoyensGenieMoyensGenie() <em>APour Moyens Genie Moyens Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensGenieMoyensGenie()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourMoyensGenieMoyensGenie;

	/**
	 * The cached value of the '{@link #getADonnelieuCRAvancementAvancementTravailGenie() <em>ADonnelieu CR Avancement Avancement Travail Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADonnelieuCRAvancementAvancementTravailGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAvancementTravailGenie> aDonnelieuCRAvancementAvancementTravailGenie;

	/**
	 * The cached value of the '{@link #getAConsommeQuantiteConsommee() <em>AConsomme Quantite Consommee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAConsommeQuantiteConsommee()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteConsommee> aConsommeQuantiteConsommee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTravailGenieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTravailGenie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPlanSerieTravail getSerieTravail() {
		return serieTravail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerieTravail(TypeDictionaryDicoPlanSerieTravail newSerieTravail) {
		TypeDictionaryDicoPlanSerieTravail oldSerieTravail = serieTravail;
		serieTravail = newSerieTravail == null ? SERIE_TRAVAIL_EDEFAULT : newSerieTravail;
		boolean oldSerieTravailESet = serieTravailESet;
		serieTravailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__SERIE_TRAVAIL, oldSerieTravail, serieTravail, !oldSerieTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSerieTravail() {
		TypeDictionaryDicoPlanSerieTravail oldSerieTravail = serieTravail;
		boolean oldSerieTravailESet = serieTravailESet;
		serieTravail = SERIE_TRAVAIL_EDEFAULT;
		serieTravailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRAVAIL_GENIE__SERIE_TRAVAIL, oldSerieTravail, SERIE_TRAVAIL_EDEFAULT, oldSerieTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSerieTravail() {
		return serieTravailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPlanNiveauPlanification getNiveauPlanification() {
		return niveauPlanification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauPlanification(TypeDictionaryDicoPlanNiveauPlanification newNiveauPlanification) {
		TypeDictionaryDicoPlanNiveauPlanification oldNiveauPlanification = niveauPlanification;
		niveauPlanification = newNiveauPlanification == null ? NIVEAU_PLANIFICATION_EDEFAULT : newNiveauPlanification;
		boolean oldNiveauPlanificationESet = niveauPlanificationESet;
		niveauPlanificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__NIVEAU_PLANIFICATION, oldNiveauPlanification, niveauPlanification, !oldNiveauPlanificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauPlanification() {
		TypeDictionaryDicoPlanNiveauPlanification oldNiveauPlanification = niveauPlanification;
		boolean oldNiveauPlanificationESet = niveauPlanificationESet;
		niveauPlanification = NIVEAU_PLANIFICATION_EDEFAULT;
		niveauPlanificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRAVAIL_GENIE__NIVEAU_PLANIFICATION, oldNiveauPlanification, NIVEAU_PLANIFICATION_EDEFAULT, oldNiveauPlanificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauPlanification() {
		return niveauPlanificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionDeMiseEnOeuvre() {
		return conditionDeMiseEnOeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionDeMiseEnOeuvre(String newConditionDeMiseEnOeuvre) {
		String oldConditionDeMiseEnOeuvre = conditionDeMiseEnOeuvre;
		conditionDeMiseEnOeuvre = newConditionDeMiseEnOeuvre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__CONDITION_DE_MISE_EN_OEUVRE, oldConditionDeMiseEnOeuvre, conditionDeMiseEnOeuvre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFinEstimee() {
		return dateFinEstimee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinEstimee(XMLGregorianCalendar newDateFinEstimee) {
		XMLGregorianCalendar oldDateFinEstimee = dateFinEstimee;
		dateFinEstimee = newDateFinEstimee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_FIN_ESTIMEE, oldDateFinEstimee, dateFinEstimee));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourTravailAideDeploiementTravailAideDeploiement() {
		return aPourTravailAideDeploiementTravailAideDeploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTravailAideDeploiementTravailAideDeploiement(TypeAssociation newAPourTravailAideDeploiementTravailAideDeploiement, NotificationChain msgs) {
		TypeAssociation oldAPourTravailAideDeploiementTravailAideDeploiement = aPourTravailAideDeploiementTravailAideDeploiement;
		aPourTravailAideDeploiementTravailAideDeploiement = newAPourTravailAideDeploiementTravailAideDeploiement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT, oldAPourTravailAideDeploiementTravailAideDeploiement, newAPourTravailAideDeploiementTravailAideDeploiement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTravailAideDeploiementTravailAideDeploiement(TypeAssociation newAPourTravailAideDeploiementTravailAideDeploiement) {
		if (newAPourTravailAideDeploiementTravailAideDeploiement != aPourTravailAideDeploiementTravailAideDeploiement) {
			NotificationChain msgs = null;
			if (aPourTravailAideDeploiementTravailAideDeploiement != null)
				msgs = ((InternalEObject)aPourTravailAideDeploiementTravailAideDeploiement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT, null, msgs);
			if (newAPourTravailAideDeploiementTravailAideDeploiement != null)
				msgs = ((InternalEObject)newAPourTravailAideDeploiementTravailAideDeploiement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT, null, msgs);
			msgs = basicSetAPourTravailAideDeploiementTravailAideDeploiement(newAPourTravailAideDeploiementTravailAideDeploiement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT, newAPourTravailAideDeploiementTravailAideDeploiement, newAPourTravailAideDeploiementTravailAideDeploiement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourOuvrageOrganisationOuvrageGenie() {
		return aPourOuvrageOrganisationOuvrageGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourOuvrageOrganisationOuvrageGenie(TypeAssociation newAPourOuvrageOrganisationOuvrageGenie, NotificationChain msgs) {
		TypeAssociation oldAPourOuvrageOrganisationOuvrageGenie = aPourOuvrageOrganisationOuvrageGenie;
		aPourOuvrageOrganisationOuvrageGenie = newAPourOuvrageOrganisationOuvrageGenie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OUVRAGE_ORGANISATION_OUVRAGE_GENIE, oldAPourOuvrageOrganisationOuvrageGenie, newAPourOuvrageOrganisationOuvrageGenie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourOuvrageOrganisationOuvrageGenie(TypeAssociation newAPourOuvrageOrganisationOuvrageGenie) {
		if (newAPourOuvrageOrganisationOuvrageGenie != aPourOuvrageOrganisationOuvrageGenie) {
			NotificationChain msgs = null;
			if (aPourOuvrageOrganisationOuvrageGenie != null)
				msgs = ((InternalEObject)aPourOuvrageOrganisationOuvrageGenie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OUVRAGE_ORGANISATION_OUVRAGE_GENIE, null, msgs);
			if (newAPourOuvrageOrganisationOuvrageGenie != null)
				msgs = ((InternalEObject)newAPourOuvrageOrganisationOuvrageGenie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OUVRAGE_ORGANISATION_OUVRAGE_GENIE, null, msgs);
			msgs = basicSetAPourOuvrageOrganisationOuvrageGenie(newAPourOuvrageOrganisationOuvrageGenie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OUVRAGE_ORGANISATION_OUVRAGE_GENIE, newAPourOuvrageOrganisationOuvrageGenie, newAPourOuvrageOrganisationOuvrageGenie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObstacleObstacle() {
		return aPourObstacleObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObstacleObstacle(TypeAssociation newAPourObstacleObstacle, NotificationChain msgs) {
		TypeAssociation oldAPourObstacleObstacle = aPourObstacleObstacle;
		aPourObstacleObstacle = newAPourObstacleObstacle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OBSTACLE_OBSTACLE, oldAPourObstacleObstacle, newAPourObstacleObstacle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObstacleObstacle(TypeAssociation newAPourObstacleObstacle) {
		if (newAPourObstacleObstacle != aPourObstacleObstacle) {
			NotificationChain msgs = null;
			if (aPourObstacleObstacle != null)
				msgs = ((InternalEObject)aPourObstacleObstacle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OBSTACLE_OBSTACLE, null, msgs);
			if (newAPourObstacleObstacle != null)
				msgs = ((InternalEObject)newAPourObstacleObstacle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OBSTACLE_OBSTACLE, null, msgs);
			msgs = basicSetAPourObstacleObstacle(newAPourObstacleObstacle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OBSTACLE_OBSTACLE, newAPourObstacleObstacle, newAPourObstacleObstacle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourMoyensGenieMoyensGenie() {
		return aPourMoyensGenieMoyensGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMoyensGenieMoyensGenie(TypeAssociation newAPourMoyensGenieMoyensGenie, NotificationChain msgs) {
		TypeAssociation oldAPourMoyensGenieMoyensGenie = aPourMoyensGenieMoyensGenie;
		aPourMoyensGenieMoyensGenie = newAPourMoyensGenieMoyensGenie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_MOYENS_GENIE_MOYENS_GENIE, oldAPourMoyensGenieMoyensGenie, newAPourMoyensGenieMoyensGenie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMoyensGenieMoyensGenie(TypeAssociation newAPourMoyensGenieMoyensGenie) {
		if (newAPourMoyensGenieMoyensGenie != aPourMoyensGenieMoyensGenie) {
			NotificationChain msgs = null;
			if (aPourMoyensGenieMoyensGenie != null)
				msgs = ((InternalEObject)aPourMoyensGenieMoyensGenie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_MOYENS_GENIE_MOYENS_GENIE, null, msgs);
			if (newAPourMoyensGenieMoyensGenie != null)
				msgs = ((InternalEObject)newAPourMoyensGenieMoyensGenie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_MOYENS_GENIE_MOYENS_GENIE, null, msgs);
			msgs = basicSetAPourMoyensGenieMoyensGenie(newAPourMoyensGenieMoyensGenie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_MOYENS_GENIE_MOYENS_GENIE, newAPourMoyensGenieMoyensGenie, newAPourMoyensGenieMoyensGenie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAvancementTravailGenie> getADonnelieuCRAvancementAvancementTravailGenie() {
		if (aDonnelieuCRAvancementAvancementTravailGenie == null) {
			aDonnelieuCRAvancementAvancementTravailGenie = new EObjectContainmentEList<TypeAvancementTravailGenie>(TypeAvancementTravailGenie.class, this, SchemaPackage.TYPE_TRAVAIL_GENIE__ADONNELIEU_CR_AVANCEMENT_AVANCEMENT_TRAVAIL_GENIE);
		}
		return aDonnelieuCRAvancementAvancementTravailGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteConsommee> getAConsommeQuantiteConsommee() {
		if (aConsommeQuantiteConsommee == null) {
			aConsommeQuantiteConsommee = new EObjectContainmentEList<TypeQuantiteConsommee>(TypeQuantiteConsommee.class, this, SchemaPackage.TYPE_TRAVAIL_GENIE__ACONSOMME_QUANTITE_CONSOMMEE);
		}
		return aConsommeQuantiteConsommee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				return basicSetAPourTravailAideDeploiementTravailAideDeploiement(null, msgs);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OUVRAGE_ORGANISATION_OUVRAGE_GENIE:
				return basicSetAPourOuvrageOrganisationOuvrageGenie(null, msgs);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OBSTACLE_OBSTACLE:
				return basicSetAPourObstacleObstacle(null, msgs);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_MOYENS_GENIE_MOYENS_GENIE:
				return basicSetAPourMoyensGenieMoyensGenie(null, msgs);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ADONNELIEU_CR_AVANCEMENT_AVANCEMENT_TRAVAIL_GENIE:
				return ((InternalEList<?>)getADonnelieuCRAvancementAvancementTravailGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ACONSOMME_QUANTITE_CONSOMMEE:
				return ((InternalEList<?>)getAConsommeQuantiteConsommee()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TRAVAIL_GENIE__SERIE_TRAVAIL:
				return getSerieTravail();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__NIVEAU_PLANIFICATION:
				return getNiveauPlanification();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CONDITION_DE_MISE_EN_OEUVRE:
				return getConditionDeMiseEnOeuvre();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_FIN_ESTIMEE:
				return getDateFinEstimee();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CE:
				return getCE();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				return getAPourTravailAideDeploiementTravailAideDeploiement();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OUVRAGE_ORGANISATION_OUVRAGE_GENIE:
				return getAPourOuvrageOrganisationOuvrageGenie();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OBSTACLE_OBSTACLE:
				return getAPourObstacleObstacle();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_MOYENS_GENIE_MOYENS_GENIE:
				return getAPourMoyensGenieMoyensGenie();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ADONNELIEU_CR_AVANCEMENT_AVANCEMENT_TRAVAIL_GENIE:
				return getADonnelieuCRAvancementAvancementTravailGenie();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ACONSOMME_QUANTITE_CONSOMMEE:
				return getAConsommeQuantiteConsommee();
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
			case SchemaPackage.TYPE_TRAVAIL_GENIE__SERIE_TRAVAIL:
				setSerieTravail((TypeDictionaryDicoPlanSerieTravail)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__NIVEAU_PLANIFICATION:
				setNiveauPlanification((TypeDictionaryDicoPlanNiveauPlanification)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CONDITION_DE_MISE_EN_OEUVRE:
				setConditionDeMiseEnOeuvre((String)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_FIN_ESTIMEE:
				setDateFinEstimee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				setAPourTravailAideDeploiementTravailAideDeploiement((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OUVRAGE_ORGANISATION_OUVRAGE_GENIE:
				setAPourOuvrageOrganisationOuvrageGenie((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OBSTACLE_OBSTACLE:
				setAPourObstacleObstacle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_MOYENS_GENIE_MOYENS_GENIE:
				setAPourMoyensGenieMoyensGenie((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ADONNELIEU_CR_AVANCEMENT_AVANCEMENT_TRAVAIL_GENIE:
				getADonnelieuCRAvancementAvancementTravailGenie().clear();
				getADonnelieuCRAvancementAvancementTravailGenie().addAll((Collection<? extends TypeAvancementTravailGenie>)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ACONSOMME_QUANTITE_CONSOMMEE:
				getAConsommeQuantiteConsommee().clear();
				getAConsommeQuantiteConsommee().addAll((Collection<? extends TypeQuantiteConsommee>)newValue);
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
			case SchemaPackage.TYPE_TRAVAIL_GENIE__SERIE_TRAVAIL:
				unsetSerieTravail();
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__NIVEAU_PLANIFICATION:
				unsetNiveauPlanification();
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CONDITION_DE_MISE_EN_OEUVRE:
				setConditionDeMiseEnOeuvre(CONDITION_DE_MISE_EN_OEUVRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_FIN_ESTIMEE:
				setDateFinEstimee(DATE_FIN_ESTIMEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				setAPourTravailAideDeploiementTravailAideDeploiement((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OUVRAGE_ORGANISATION_OUVRAGE_GENIE:
				setAPourOuvrageOrganisationOuvrageGenie((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OBSTACLE_OBSTACLE:
				setAPourObstacleObstacle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_MOYENS_GENIE_MOYENS_GENIE:
				setAPourMoyensGenieMoyensGenie((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ADONNELIEU_CR_AVANCEMENT_AVANCEMENT_TRAVAIL_GENIE:
				getADonnelieuCRAvancementAvancementTravailGenie().clear();
				return;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ACONSOMME_QUANTITE_CONSOMMEE:
				getAConsommeQuantiteConsommee().clear();
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
			case SchemaPackage.TYPE_TRAVAIL_GENIE__SERIE_TRAVAIL:
				return isSetSerieTravail();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__NIVEAU_PLANIFICATION:
				return isSetNiveauPlanification();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CONDITION_DE_MISE_EN_OEUVRE:
				return CONDITION_DE_MISE_EN_OEUVRE_EDEFAULT == null ? conditionDeMiseEnOeuvre != null : !CONDITION_DE_MISE_EN_OEUVRE_EDEFAULT.equals(conditionDeMiseEnOeuvre);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__DATE_FIN_ESTIMEE:
				return DATE_FIN_ESTIMEE_EDEFAULT == null ? dateFinEstimee != null : !DATE_FIN_ESTIMEE_EDEFAULT.equals(dateFinEstimee);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				return aPourTravailAideDeploiementTravailAideDeploiement != null;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OUVRAGE_ORGANISATION_OUVRAGE_GENIE:
				return aPourOuvrageOrganisationOuvrageGenie != null;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_OBSTACLE_OBSTACLE:
				return aPourObstacleObstacle != null;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__APOUR_MOYENS_GENIE_MOYENS_GENIE:
				return aPourMoyensGenieMoyensGenie != null;
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ADONNELIEU_CR_AVANCEMENT_AVANCEMENT_TRAVAIL_GENIE:
				return aDonnelieuCRAvancementAvancementTravailGenie != null && !aDonnelieuCRAvancementAvancementTravailGenie.isEmpty();
			case SchemaPackage.TYPE_TRAVAIL_GENIE__ACONSOMME_QUANTITE_CONSOMMEE:
				return aConsommeQuantiteConsommee != null && !aConsommeQuantiteConsommee.isEmpty();
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
		result.append(" (serieTravail: ");
		if (serieTravailESet) result.append(serieTravail); else result.append("<unset>");
		result.append(", niveauPlanification: ");
		if (niveauPlanificationESet) result.append(niveauPlanification); else result.append("<unset>");
		result.append(", conditionDeMiseEnOeuvre: ");
		result.append(conditionDeMiseEnOeuvre);
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFinEstimee: ");
		result.append(dateFinEstimee);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTravailGenieImpl
