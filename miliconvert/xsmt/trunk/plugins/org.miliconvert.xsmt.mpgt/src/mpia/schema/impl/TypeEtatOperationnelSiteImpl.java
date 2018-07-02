/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiqueComplementaireObstacle;
import mpia.schema.TypeDictionaryDicoActivation;
import mpia.schema.TypeDictionaryDicoEtatDemolition;
import mpia.schema.TypeDictionaryDicoEtatDeploiement;
import mpia.schema.TypeDictionaryDicoEtatOperationnel;
import mpia.schema.TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie;
import mpia.schema.TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation;
import mpia.schema.TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat;
import mpia.schema.TypeDictionaryDicoEtatOperationnelSiteSecurite;
import mpia.schema.TypeDictionaryDicoPresenceMines;
import mpia.schema.TypeEtatOperationnelAerodrome;
import mpia.schema.TypeEtatOperationnelChampMinesMaritime;
import mpia.schema.TypeEtatOperationnelMedical;
import mpia.schema.TypeEtatOperationnelSite;

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
 * An implementation of the model object '<em><b>Type Etat Operationnel Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getGDHdebutActivation <em>GD Hdebut Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getGDHfinActivation <em>GD Hfin Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#isReserve <em>Reserve</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getCapaciteRestante <em>Capacite Restante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getSecurite <em>Securite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getPresenceMines <em>Presence Mines</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getActiviteEnnemie <em>Activite Ennemie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getEtatDeploiement <em>Etat Deploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getNiveauRealisation <em>Niveau Realisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getEtatDemolition <em>Etat Demolition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#isProgrammeOccupation <em>Programme Occupation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle <em>APour Caracteristiques Obstacle Caracteristique Complementaire Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getACommeEtatOperationnelAerodromeEtatOperationnelAerodrome <em>AComme Etat Operationnel Aerodrome Etat Operationnel Aerodrome</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getACommeSituationMedicaleEtatOperationnelMedical <em>AComme Situation Medicale Etat Operationnel Medical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelSiteImpl#getACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime <em>AComme Etat Operationnel Champ Mines Maritime Etat Operationnel Champ Mines Maritime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelSiteImpl extends TypeEtatOperationnelImpl implements TypeEtatOperationnelSite {
	/**
	 * The default value of the '{@link #getEtatOperationnel() <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatOperationnel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnel ETAT_OPERATIONNEL_EDEFAULT = TypeDictionaryDicoEtatOperationnel.OPR;

	/**
	 * The cached value of the '{@link #getEtatOperationnel() <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatOperationnel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnel etatOperationnel = ETAT_OPERATIONNEL_EDEFAULT;

	/**
	 * This is true if the Etat Operationnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatOperationnelESet;

	/**
	 * The default value of the '{@link #getQualificatifEtat() <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat QUALIFICATIF_ETAT_EDEFAULT = TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat.DENIED;

	/**
	 * The cached value of the '{@link #getQualificatifEtat() <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;

	/**
	 * This is true if the Qualificatif Etat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifEtatESet;

	/**
	 * The default value of the '{@link #getActivation() <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActivation ACTIVATION_EDEFAULT = TypeDictionaryDicoActivation.ACTIVE;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActivation activation = ACTIVATION_EDEFAULT;

	/**
	 * This is true if the Activation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activationESet;

	/**
	 * The default value of the '{@link #getGDHdebutActivation() <em>GD Hdebut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HDEBUT_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHdebutActivation() <em>GD Hdebut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHdebutActivation = GD_HDEBUT_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHfinActivation() <em>GD Hfin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfinActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HFIN_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHfinActivation() <em>GD Hfin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfinActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHfinActivation = GD_HFIN_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isReserve() <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserve()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESERVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReserve() <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserve()
	 * @generated
	 * @ordered
	 */
	protected boolean reserve = RESERVE_EDEFAULT;

	/**
	 * This is true if the Reserve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reserveESet;

	/**
	 * The default value of the '{@link #getCapaciteRestante() <em>Capacite Restante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteRestante()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITE_RESTANTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCapaciteRestante() <em>Capacite Restante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteRestante()
	 * @generated
	 * @ordered
	 */
	protected double capaciteRestante = CAPACITE_RESTANTE_EDEFAULT;

	/**
	 * This is true if the Capacite Restante attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteRestanteESet;

	/**
	 * The default value of the '{@link #getSecurite() <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelSiteSecurite SECURITE_EDEFAULT = TypeDictionaryDicoEtatOperationnelSiteSecurite.GUARDD;

	/**
	 * The cached value of the '{@link #getSecurite() <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelSiteSecurite securite = SECURITE_EDEFAULT;

	/**
	 * This is true if the Securite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securiteESet;

	/**
	 * The default value of the '{@link #getPresenceMines() <em>Presence Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenceMines()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPresenceMines PRESENCE_MINES_EDEFAULT = TypeDictionaryDicoPresenceMines.NO;

	/**
	 * The cached value of the '{@link #getPresenceMines() <em>Presence Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenceMines()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPresenceMines presenceMines = PRESENCE_MINES_EDEFAULT;

	/**
	 * This is true if the Presence Mines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presenceMinesESet;

	/**
	 * The default value of the '{@link #getActiviteEnnemie() <em>Activite Ennemie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteEnnemie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie ACTIVITE_ENNEMIE_EDEFAULT = TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie.COLD;

	/**
	 * The cached value of the '{@link #getActiviteEnnemie() <em>Activite Ennemie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteEnnemie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie activiteEnnemie = ACTIVITE_ENNEMIE_EDEFAULT;

	/**
	 * This is true if the Activite Ennemie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activiteEnnemieESet;

	/**
	 * The default value of the '{@link #getEtatDeploiement() <em>Etat Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDeploiement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatDeploiement ETAT_DEPLOIEMENT_EDEFAULT = TypeDictionaryDicoEtatDeploiement.DPLD;

	/**
	 * The cached value of the '{@link #getEtatDeploiement() <em>Etat Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDeploiement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatDeploiement etatDeploiement = ETAT_DEPLOIEMENT_EDEFAULT;

	/**
	 * This is true if the Etat Deploiement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatDeploiementESet;

	/**
	 * The default value of the '{@link #getNiveauRealisation() <em>Niveau Realisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauRealisation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation NIVEAU_REALISATION_EDEFAULT = TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation.STARTED;

	/**
	 * The cached value of the '{@link #getNiveauRealisation() <em>Niveau Realisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauRealisation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation niveauRealisation = NIVEAU_REALISATION_EDEFAULT;

	/**
	 * This is true if the Niveau Realisation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauRealisationESet;

	/**
	 * The default value of the '{@link #getEtatDemolition() <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemolition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatDemolition ETAT_DEMOLITION_EDEFAULT = TypeDictionaryDicoEtatDemolition.ABNDIN;

	/**
	 * The cached value of the '{@link #getEtatDemolition() <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemolition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatDemolition etatDemolition = ETAT_DEMOLITION_EDEFAULT;

	/**
	 * This is true if the Etat Demolition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatDemolitionESet;

	/**
	 * The default value of the '{@link #isProgrammeOccupation() <em>Programme Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProgrammeOccupation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROGRAMME_OCCUPATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProgrammeOccupation() <em>Programme Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProgrammeOccupation()
	 * @generated
	 * @ordered
	 */
	protected boolean programmeOccupation = PROGRAMME_OCCUPATION_EDEFAULT;

	/**
	 * This is true if the Programme Occupation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean programmeOccupationESet;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle() <em>APour Caracteristiques Obstacle Caracteristique Complementaire Obstacle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCaracteristiqueComplementaireObstacle> aPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle;

	/**
	 * The cached value of the '{@link #getACommeEtatOperationnelAerodromeEtatOperationnelAerodrome() <em>AComme Etat Operationnel Aerodrome Etat Operationnel Aerodrome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeEtatOperationnelAerodromeEtatOperationnelAerodrome()
	 * @generated
	 * @ordered
	 */
	protected TypeEtatOperationnelAerodrome aCommeEtatOperationnelAerodromeEtatOperationnelAerodrome;

	/**
	 * The cached value of the '{@link #getACommeSituationMedicaleEtatOperationnelMedical() <em>AComme Situation Medicale Etat Operationnel Medical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeSituationMedicaleEtatOperationnelMedical()
	 * @generated
	 * @ordered
	 */
	protected TypeEtatOperationnelMedical aCommeSituationMedicaleEtatOperationnelMedical;

	/**
	 * The cached value of the '{@link #getACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime() <em>AComme Etat Operationnel Champ Mines Maritime Etat Operationnel Champ Mines Maritime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime()
	 * @generated
	 * @ordered
	 */
	protected TypeEtatOperationnelChampMinesMaritime aCommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnel getEtatOperationnel() {
		return etatOperationnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatOperationnel(TypeDictionaryDicoEtatOperationnel newEtatOperationnel) {
		TypeDictionaryDicoEtatOperationnel oldEtatOperationnel = etatOperationnel;
		etatOperationnel = newEtatOperationnel == null ? ETAT_OPERATIONNEL_EDEFAULT : newEtatOperationnel;
		boolean oldEtatOperationnelESet = etatOperationnelESet;
		etatOperationnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_OPERATIONNEL, oldEtatOperationnel, etatOperationnel, !oldEtatOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatOperationnel() {
		TypeDictionaryDicoEtatOperationnel oldEtatOperationnel = etatOperationnel;
		boolean oldEtatOperationnelESet = etatOperationnelESet;
		etatOperationnel = ETAT_OPERATIONNEL_EDEFAULT;
		etatOperationnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_OPERATIONNEL, oldEtatOperationnel, ETAT_OPERATIONNEL_EDEFAULT, oldEtatOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatOperationnel() {
		return etatOperationnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat getQualificatifEtat() {
		return qualificatifEtat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat newQualificatifEtat) {
		TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		qualificatifEtat = newQualificatifEtat == null ? QUALIFICATIF_ETAT_EDEFAULT : newQualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__QUALIFICATIF_ETAT, oldQualificatifEtat, qualificatifEtat, !oldQualificatifEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifEtat() {
		TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;
		qualificatifEtatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__QUALIFICATIF_ETAT, oldQualificatifEtat, QUALIFICATIF_ETAT_EDEFAULT, oldQualificatifEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifEtat() {
		return qualificatifEtatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActivation getActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation(TypeDictionaryDicoActivation newActivation) {
		TypeDictionaryDicoActivation oldActivation = activation;
		activation = newActivation == null ? ACTIVATION_EDEFAULT : newActivation;
		boolean oldActivationESet = activationESet;
		activationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVATION, oldActivation, activation, !oldActivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivation() {
		TypeDictionaryDicoActivation oldActivation = activation;
		boolean oldActivationESet = activationESet;
		activation = ACTIVATION_EDEFAULT;
		activationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVATION, oldActivation, ACTIVATION_EDEFAULT, oldActivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivation() {
		return activationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHdebutActivation() {
		return gDHdebutActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHdebutActivation(XMLGregorianCalendar newGDHdebutActivation) {
		XMLGregorianCalendar oldGDHdebutActivation = gDHdebutActivation;
		gDHdebutActivation = newGDHdebutActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HDEBUT_ACTIVATION, oldGDHdebutActivation, gDHdebutActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHfinActivation() {
		return gDHfinActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHfinActivation(XMLGregorianCalendar newGDHfinActivation) {
		XMLGregorianCalendar oldGDHfinActivation = gDHfinActivation;
		gDHfinActivation = newGDHfinActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HFIN_ACTIVATION, oldGDHfinActivation, gDHfinActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReserve() {
		return reserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserve(boolean newReserve) {
		boolean oldReserve = reserve;
		reserve = newReserve;
		boolean oldReserveESet = reserveESet;
		reserveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__RESERVE, oldReserve, reserve, !oldReserveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReserve() {
		boolean oldReserve = reserve;
		boolean oldReserveESet = reserveESet;
		reserve = RESERVE_EDEFAULT;
		reserveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__RESERVE, oldReserve, RESERVE_EDEFAULT, oldReserveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReserve() {
		return reserveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapaciteRestante() {
		return capaciteRestante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteRestante(double newCapaciteRestante) {
		double oldCapaciteRestante = capaciteRestante;
		capaciteRestante = newCapaciteRestante;
		boolean oldCapaciteRestanteESet = capaciteRestanteESet;
		capaciteRestanteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__CAPACITE_RESTANTE, oldCapaciteRestante, capaciteRestante, !oldCapaciteRestanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteRestante() {
		double oldCapaciteRestante = capaciteRestante;
		boolean oldCapaciteRestanteESet = capaciteRestanteESet;
		capaciteRestante = CAPACITE_RESTANTE_EDEFAULT;
		capaciteRestanteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__CAPACITE_RESTANTE, oldCapaciteRestante, CAPACITE_RESTANTE_EDEFAULT, oldCapaciteRestanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteRestante() {
		return capaciteRestanteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelSiteSecurite getSecurite() {
		return securite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurite(TypeDictionaryDicoEtatOperationnelSiteSecurite newSecurite) {
		TypeDictionaryDicoEtatOperationnelSiteSecurite oldSecurite = securite;
		securite = newSecurite == null ? SECURITE_EDEFAULT : newSecurite;
		boolean oldSecuriteESet = securiteESet;
		securiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__SECURITE, oldSecurite, securite, !oldSecuriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurite() {
		TypeDictionaryDicoEtatOperationnelSiteSecurite oldSecurite = securite;
		boolean oldSecuriteESet = securiteESet;
		securite = SECURITE_EDEFAULT;
		securiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__SECURITE, oldSecurite, SECURITE_EDEFAULT, oldSecuriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurite() {
		return securiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPresenceMines getPresenceMines() {
		return presenceMines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresenceMines(TypeDictionaryDicoPresenceMines newPresenceMines) {
		TypeDictionaryDicoPresenceMines oldPresenceMines = presenceMines;
		presenceMines = newPresenceMines == null ? PRESENCE_MINES_EDEFAULT : newPresenceMines;
		boolean oldPresenceMinesESet = presenceMinesESet;
		presenceMinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PRESENCE_MINES, oldPresenceMines, presenceMines, !oldPresenceMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPresenceMines() {
		TypeDictionaryDicoPresenceMines oldPresenceMines = presenceMines;
		boolean oldPresenceMinesESet = presenceMinesESet;
		presenceMines = PRESENCE_MINES_EDEFAULT;
		presenceMinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PRESENCE_MINES, oldPresenceMines, PRESENCE_MINES_EDEFAULT, oldPresenceMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPresenceMines() {
		return presenceMinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie getActiviteEnnemie() {
		return activiteEnnemie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiviteEnnemie(TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie newActiviteEnnemie) {
		TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie oldActiviteEnnemie = activiteEnnemie;
		activiteEnnemie = newActiviteEnnemie == null ? ACTIVITE_ENNEMIE_EDEFAULT : newActiviteEnnemie;
		boolean oldActiviteEnnemieESet = activiteEnnemieESet;
		activiteEnnemieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVITE_ENNEMIE, oldActiviteEnnemie, activiteEnnemie, !oldActiviteEnnemieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActiviteEnnemie() {
		TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie oldActiviteEnnemie = activiteEnnemie;
		boolean oldActiviteEnnemieESet = activiteEnnemieESet;
		activiteEnnemie = ACTIVITE_ENNEMIE_EDEFAULT;
		activiteEnnemieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVITE_ENNEMIE, oldActiviteEnnemie, ACTIVITE_ENNEMIE_EDEFAULT, oldActiviteEnnemieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActiviteEnnemie() {
		return activiteEnnemieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatDeploiement getEtatDeploiement() {
		return etatDeploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatDeploiement(TypeDictionaryDicoEtatDeploiement newEtatDeploiement) {
		TypeDictionaryDicoEtatDeploiement oldEtatDeploiement = etatDeploiement;
		etatDeploiement = newEtatDeploiement == null ? ETAT_DEPLOIEMENT_EDEFAULT : newEtatDeploiement;
		boolean oldEtatDeploiementESet = etatDeploiementESet;
		etatDeploiementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEPLOIEMENT, oldEtatDeploiement, etatDeploiement, !oldEtatDeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatDeploiement() {
		TypeDictionaryDicoEtatDeploiement oldEtatDeploiement = etatDeploiement;
		boolean oldEtatDeploiementESet = etatDeploiementESet;
		etatDeploiement = ETAT_DEPLOIEMENT_EDEFAULT;
		etatDeploiementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEPLOIEMENT, oldEtatDeploiement, ETAT_DEPLOIEMENT_EDEFAULT, oldEtatDeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatDeploiement() {
		return etatDeploiementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation getNiveauRealisation() {
		return niveauRealisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauRealisation(TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation newNiveauRealisation) {
		TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation oldNiveauRealisation = niveauRealisation;
		niveauRealisation = newNiveauRealisation == null ? NIVEAU_REALISATION_EDEFAULT : newNiveauRealisation;
		boolean oldNiveauRealisationESet = niveauRealisationESet;
		niveauRealisationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__NIVEAU_REALISATION, oldNiveauRealisation, niveauRealisation, !oldNiveauRealisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauRealisation() {
		TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation oldNiveauRealisation = niveauRealisation;
		boolean oldNiveauRealisationESet = niveauRealisationESet;
		niveauRealisation = NIVEAU_REALISATION_EDEFAULT;
		niveauRealisationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__NIVEAU_REALISATION, oldNiveauRealisation, NIVEAU_REALISATION_EDEFAULT, oldNiveauRealisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauRealisation() {
		return niveauRealisationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatDemolition getEtatDemolition() {
		return etatDemolition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatDemolition(TypeDictionaryDicoEtatDemolition newEtatDemolition) {
		TypeDictionaryDicoEtatDemolition oldEtatDemolition = etatDemolition;
		etatDemolition = newEtatDemolition == null ? ETAT_DEMOLITION_EDEFAULT : newEtatDemolition;
		boolean oldEtatDemolitionESet = etatDemolitionESet;
		etatDemolitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEMOLITION, oldEtatDemolition, etatDemolition, !oldEtatDemolitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatDemolition() {
		TypeDictionaryDicoEtatDemolition oldEtatDemolition = etatDemolition;
		boolean oldEtatDemolitionESet = etatDemolitionESet;
		etatDemolition = ETAT_DEMOLITION_EDEFAULT;
		etatDemolitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEMOLITION, oldEtatDemolition, ETAT_DEMOLITION_EDEFAULT, oldEtatDemolitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatDemolition() {
		return etatDemolitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProgrammeOccupation() {
		return programmeOccupation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgrammeOccupation(boolean newProgrammeOccupation) {
		boolean oldProgrammeOccupation = programmeOccupation;
		programmeOccupation = newProgrammeOccupation;
		boolean oldProgrammeOccupationESet = programmeOccupationESet;
		programmeOccupationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PROGRAMME_OCCUPATION, oldProgrammeOccupation, programmeOccupation, !oldProgrammeOccupationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProgrammeOccupation() {
		boolean oldProgrammeOccupation = programmeOccupation;
		boolean oldProgrammeOccupationESet = programmeOccupationESet;
		programmeOccupation = PROGRAMME_OCCUPATION_EDEFAULT;
		programmeOccupationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PROGRAMME_OCCUPATION, oldProgrammeOccupation, PROGRAMME_OCCUPATION_EDEFAULT, oldProgrammeOccupationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProgrammeOccupation() {
		return programmeOccupationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCaracteristiqueComplementaireObstacle> getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle() {
		if (aPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle == null) {
			aPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle = new EObjectContainmentEList<TypeCaracteristiqueComplementaireObstacle>(TypeCaracteristiqueComplementaireObstacle.class, this, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__APOUR_CARACTERISTIQUES_OBSTACLE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE);
		}
		return aPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEtatOperationnelAerodrome getACommeEtatOperationnelAerodromeEtatOperationnelAerodrome() {
		return aCommeEtatOperationnelAerodromeEtatOperationnelAerodrome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeEtatOperationnelAerodromeEtatOperationnelAerodrome(TypeEtatOperationnelAerodrome newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome, NotificationChain msgs) {
		TypeEtatOperationnelAerodrome oldACommeEtatOperationnelAerodromeEtatOperationnelAerodrome = aCommeEtatOperationnelAerodromeEtatOperationnelAerodrome;
		aCommeEtatOperationnelAerodromeEtatOperationnelAerodrome = newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_AERODROME_ETAT_OPERATIONNEL_AERODROME, oldACommeEtatOperationnelAerodromeEtatOperationnelAerodrome, newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeEtatOperationnelAerodromeEtatOperationnelAerodrome(TypeEtatOperationnelAerodrome newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome) {
		if (newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome != aCommeEtatOperationnelAerodromeEtatOperationnelAerodrome) {
			NotificationChain msgs = null;
			if (aCommeEtatOperationnelAerodromeEtatOperationnelAerodrome != null)
				msgs = ((InternalEObject)aCommeEtatOperationnelAerodromeEtatOperationnelAerodrome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_AERODROME_ETAT_OPERATIONNEL_AERODROME, null, msgs);
			if (newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome != null)
				msgs = ((InternalEObject)newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_AERODROME_ETAT_OPERATIONNEL_AERODROME, null, msgs);
			msgs = basicSetACommeEtatOperationnelAerodromeEtatOperationnelAerodrome(newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_AERODROME_ETAT_OPERATIONNEL_AERODROME, newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome, newACommeEtatOperationnelAerodromeEtatOperationnelAerodrome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEtatOperationnelMedical getACommeSituationMedicaleEtatOperationnelMedical() {
		return aCommeSituationMedicaleEtatOperationnelMedical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeSituationMedicaleEtatOperationnelMedical(TypeEtatOperationnelMedical newACommeSituationMedicaleEtatOperationnelMedical, NotificationChain msgs) {
		TypeEtatOperationnelMedical oldACommeSituationMedicaleEtatOperationnelMedical = aCommeSituationMedicaleEtatOperationnelMedical;
		aCommeSituationMedicaleEtatOperationnelMedical = newACommeSituationMedicaleEtatOperationnelMedical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_SITUATION_MEDICALE_ETAT_OPERATIONNEL_MEDICAL, oldACommeSituationMedicaleEtatOperationnelMedical, newACommeSituationMedicaleEtatOperationnelMedical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeSituationMedicaleEtatOperationnelMedical(TypeEtatOperationnelMedical newACommeSituationMedicaleEtatOperationnelMedical) {
		if (newACommeSituationMedicaleEtatOperationnelMedical != aCommeSituationMedicaleEtatOperationnelMedical) {
			NotificationChain msgs = null;
			if (aCommeSituationMedicaleEtatOperationnelMedical != null)
				msgs = ((InternalEObject)aCommeSituationMedicaleEtatOperationnelMedical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_SITUATION_MEDICALE_ETAT_OPERATIONNEL_MEDICAL, null, msgs);
			if (newACommeSituationMedicaleEtatOperationnelMedical != null)
				msgs = ((InternalEObject)newACommeSituationMedicaleEtatOperationnelMedical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_SITUATION_MEDICALE_ETAT_OPERATIONNEL_MEDICAL, null, msgs);
			msgs = basicSetACommeSituationMedicaleEtatOperationnelMedical(newACommeSituationMedicaleEtatOperationnelMedical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_SITUATION_MEDICALE_ETAT_OPERATIONNEL_MEDICAL, newACommeSituationMedicaleEtatOperationnelMedical, newACommeSituationMedicaleEtatOperationnelMedical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEtatOperationnelChampMinesMaritime getACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime() {
		return aCommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime(TypeEtatOperationnelChampMinesMaritime newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime, NotificationChain msgs) {
		TypeEtatOperationnelChampMinesMaritime oldACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime = aCommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime;
		aCommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime = newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME, oldACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime, newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime(TypeEtatOperationnelChampMinesMaritime newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime) {
		if (newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime != aCommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime) {
			NotificationChain msgs = null;
			if (aCommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime != null)
				msgs = ((InternalEObject)aCommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME, null, msgs);
			if (newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime != null)
				msgs = ((InternalEObject)newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME, null, msgs);
			msgs = basicSetACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime(newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME, newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime, newACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__APOUR_CARACTERISTIQUES_OBSTACLE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE:
				return ((InternalEList<?>)getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_AERODROME_ETAT_OPERATIONNEL_AERODROME:
				return basicSetACommeEtatOperationnelAerodromeEtatOperationnelAerodrome(null, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_SITUATION_MEDICALE_ETAT_OPERATIONNEL_MEDICAL:
				return basicSetACommeSituationMedicaleEtatOperationnelMedical(null, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME:
				return basicSetACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_OPERATIONNEL:
				return getEtatOperationnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__QUALIFICATIF_ETAT:
				return getQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVATION:
				return getActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HDEBUT_ACTIVATION:
				return getGDHdebutActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HFIN_ACTIVATION:
				return getGDHfinActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__RESERVE:
				return isReserve() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__CAPACITE_RESTANTE:
				return new Double(getCapaciteRestante());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__SECURITE:
				return getSecurite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PRESENCE_MINES:
				return getPresenceMines();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVITE_ENNEMIE:
				return getActiviteEnnemie();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEPLOIEMENT:
				return getEtatDeploiement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__NIVEAU_REALISATION:
				return getNiveauRealisation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEMOLITION:
				return getEtatDemolition();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PROGRAMME_OCCUPATION:
				return isProgrammeOccupation() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__APOUR_CARACTERISTIQUES_OBSTACLE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE:
				return getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_AERODROME_ETAT_OPERATIONNEL_AERODROME:
				return getACommeEtatOperationnelAerodromeEtatOperationnelAerodrome();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_SITUATION_MEDICALE_ETAT_OPERATIONNEL_MEDICAL:
				return getACommeSituationMedicaleEtatOperationnelMedical();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME:
				return getACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_OPERATIONNEL:
				setEtatOperationnel((TypeDictionaryDicoEtatOperationnel)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__QUALIFICATIF_ETAT:
				setQualificatifEtat((TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVATION:
				setActivation((TypeDictionaryDicoActivation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HDEBUT_ACTIVATION:
				setGDHdebutActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HFIN_ACTIVATION:
				setGDHfinActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__RESERVE:
				setReserve(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__CAPACITE_RESTANTE:
				setCapaciteRestante(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__SECURITE:
				setSecurite((TypeDictionaryDicoEtatOperationnelSiteSecurite)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PRESENCE_MINES:
				setPresenceMines((TypeDictionaryDicoPresenceMines)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVITE_ENNEMIE:
				setActiviteEnnemie((TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEPLOIEMENT:
				setEtatDeploiement((TypeDictionaryDicoEtatDeploiement)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__NIVEAU_REALISATION:
				setNiveauRealisation((TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEMOLITION:
				setEtatDemolition((TypeDictionaryDicoEtatDemolition)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PROGRAMME_OCCUPATION:
				setProgrammeOccupation(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__APOUR_CARACTERISTIQUES_OBSTACLE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE:
				getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle().clear();
				getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle().addAll((Collection<? extends TypeCaracteristiqueComplementaireObstacle>)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_AERODROME_ETAT_OPERATIONNEL_AERODROME:
				setACommeEtatOperationnelAerodromeEtatOperationnelAerodrome((TypeEtatOperationnelAerodrome)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_SITUATION_MEDICALE_ETAT_OPERATIONNEL_MEDICAL:
				setACommeSituationMedicaleEtatOperationnelMedical((TypeEtatOperationnelMedical)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME:
				setACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime((TypeEtatOperationnelChampMinesMaritime)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_OPERATIONNEL:
				unsetEtatOperationnel();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__QUALIFICATIF_ETAT:
				unsetQualificatifEtat();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVATION:
				unsetActivation();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HDEBUT_ACTIVATION:
				setGDHdebutActivation(GD_HDEBUT_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HFIN_ACTIVATION:
				setGDHfinActivation(GD_HFIN_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__RESERVE:
				unsetReserve();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__CAPACITE_RESTANTE:
				unsetCapaciteRestante();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__SECURITE:
				unsetSecurite();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PRESENCE_MINES:
				unsetPresenceMines();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVITE_ENNEMIE:
				unsetActiviteEnnemie();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEPLOIEMENT:
				unsetEtatDeploiement();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__NIVEAU_REALISATION:
				unsetNiveauRealisation();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEMOLITION:
				unsetEtatDemolition();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PROGRAMME_OCCUPATION:
				unsetProgrammeOccupation();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__APOUR_CARACTERISTIQUES_OBSTACLE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE:
				getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle().clear();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_AERODROME_ETAT_OPERATIONNEL_AERODROME:
				setACommeEtatOperationnelAerodromeEtatOperationnelAerodrome((TypeEtatOperationnelAerodrome)null);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_SITUATION_MEDICALE_ETAT_OPERATIONNEL_MEDICAL:
				setACommeSituationMedicaleEtatOperationnelMedical((TypeEtatOperationnelMedical)null);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME:
				setACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime((TypeEtatOperationnelChampMinesMaritime)null);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_OPERATIONNEL:
				return isSetEtatOperationnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__QUALIFICATIF_ETAT:
				return isSetQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVATION:
				return isSetActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HDEBUT_ACTIVATION:
				return GD_HDEBUT_ACTIVATION_EDEFAULT == null ? gDHdebutActivation != null : !GD_HDEBUT_ACTIVATION_EDEFAULT.equals(gDHdebutActivation);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__GD_HFIN_ACTIVATION:
				return GD_HFIN_ACTIVATION_EDEFAULT == null ? gDHfinActivation != null : !GD_HFIN_ACTIVATION_EDEFAULT.equals(gDHfinActivation);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__RESERVE:
				return isSetReserve();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__CAPACITE_RESTANTE:
				return isSetCapaciteRestante();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__SECURITE:
				return isSetSecurite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PRESENCE_MINES:
				return isSetPresenceMines();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACTIVITE_ENNEMIE:
				return isSetActiviteEnnemie();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEPLOIEMENT:
				return isSetEtatDeploiement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__NIVEAU_REALISATION:
				return isSetNiveauRealisation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ETAT_DEMOLITION:
				return isSetEtatDemolition();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__PROGRAMME_OCCUPATION:
				return isSetProgrammeOccupation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__APOUR_CARACTERISTIQUES_OBSTACLE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE:
				return aPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle != null && !aPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle.isEmpty();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_AERODROME_ETAT_OPERATIONNEL_AERODROME:
				return aCommeEtatOperationnelAerodromeEtatOperationnelAerodrome != null;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_SITUATION_MEDICALE_ETAT_OPERATIONNEL_MEDICAL:
				return aCommeSituationMedicaleEtatOperationnelMedical != null;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_SITE__ACOMME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME:
				return aCommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime != null;
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
		result.append(" (etatOperationnel: ");
		if (etatOperationnelESet) result.append(etatOperationnel); else result.append("<unset>");
		result.append(", qualificatifEtat: ");
		if (qualificatifEtatESet) result.append(qualificatifEtat); else result.append("<unset>");
		result.append(", activation: ");
		if (activationESet) result.append(activation); else result.append("<unset>");
		result.append(", gDHdebutActivation: ");
		result.append(gDHdebutActivation);
		result.append(", gDHfinActivation: ");
		result.append(gDHfinActivation);
		result.append(", reserve: ");
		if (reserveESet) result.append(reserve); else result.append("<unset>");
		result.append(", capaciteRestante: ");
		if (capaciteRestanteESet) result.append(capaciteRestante); else result.append("<unset>");
		result.append(", securite: ");
		if (securiteESet) result.append(securite); else result.append("<unset>");
		result.append(", presenceMines: ");
		if (presenceMinesESet) result.append(presenceMines); else result.append("<unset>");
		result.append(", activiteEnnemie: ");
		if (activiteEnnemieESet) result.append(activiteEnnemie); else result.append("<unset>");
		result.append(", etatDeploiement: ");
		if (etatDeploiementESet) result.append(etatDeploiement); else result.append("<unset>");
		result.append(", niveauRealisation: ");
		if (niveauRealisationESet) result.append(niveauRealisation); else result.append("<unset>");
		result.append(", etatDemolition: ");
		if (etatDemolitionESet) result.append(etatDemolition); else result.append("<unset>");
		result.append(", programmeOccupation: ");
		if (programmeOccupationESet) result.append(programmeOccupation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelSiteImpl
