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
import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAction;
import mpia.schema.TypeDictionaryDicoActionCategorie;
import mpia.schema.TypeDictionaryDicoActionCodeHeureDebut;
import mpia.schema.TypeDictionaryDicoActionCodeJourDebut;
import mpia.schema.TypeDictionaryDicoActionDegreSurete;
import mpia.schema.TypeDictionaryDicoActionImpactMeteorologie;
import mpia.schema.TypeDictionaryDicoActionNiveauOperationnel;
import mpia.schema.TypeDictionaryDicoActionPriorite;
import mpia.schema.TypeDictionaryDicoActionPropriete;
import mpia.schema.TypeDictionaryDicoActionQualificatifActivite;
import mpia.schema.TypeDictionaryDicoActionQualificatifDateDebut;
import mpia.schema.TypeDictionaryDicoActionQualificatifDateFin;
import mpia.schema.TypeDictionaryDicoActionTypeAction;
import mpia.schema.TypeDictionaryDicoDatePrecision;
import mpia.schema.TypeEtatAction;
import mpia.schema.TypeRegleEngagementAction;
import mpia.schema.TypeRessourceActivite;
import mpia.schema.TypeUniteCooperante;

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
 * An implementation of the model object '<em><b>Type Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getDescriptionGeneraleAction <em>Description Generale Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getDescriptionGeneraleObjectif <em>Description Generale Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#isEffortPrincipal <em>Effort Principal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getQualificatifActivite <em>Qualificatif Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getPropriete <em>Propriete</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#isFictive <em>Fictive</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getDateDebutPrevue <em>Date Debut Prevue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getQualificatifDateDebut <em>Qualificatif Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getGDHLimiteInfDebut <em>GDH Limite Inf Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getDateFinPrevue <em>Date Fin Prevue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getQualificatifDateFin <em>Qualificatif Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getGDHLimiteSupFin <em>GDH Limite Sup Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getDureeMinimale <em>Duree Minimale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getDureeEstimee <em>Duree Estimee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getDureeMaximale <em>Duree Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getPreavisEventuel <em>Preavis Eventuel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getComplements <em>Complements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getNumeroAction <em>Numero Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getNiveauOperationnel <em>Niveau Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getDegreSurete <em>Degre Surete</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getImpactMeteorologie <em>Impact Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getPrecisionDateDebut <em>Precision Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getCodeHeureDebut <em>Code Heure Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getPrecisionDateFin <em>Precision Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getCodeJourDebut <em>Code Jour Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getAPourEtatEtatAction <em>APour Etat Etat Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getNecessiteArticulation <em>Necessite Articulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getEstObjetAssociationEntiteOrgAction <em>Est Objet Association Entite Org Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getAPourUniteSoutUniteSicUniteCooperante <em>APour Unite Sout Unite Sic Unite Cooperante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getAPourZoneRechercheZoneRecherche <em>APour Zone Recherche Zone Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getAPourRessourceRessourceActivite <em>APour Ressource Ressource Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getEstObjetAssociationMissionMeleeAction <em>Est Objet Association Mission Melee Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getEstObjetAssociationMissionRenseignementAction <em>Est Objet Association Mission Renseignement Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getACommeListeObjectifsCandidatsListeObjectifsCandidats <em>AComme Liste Objectifs Candidats Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getEstObjetAssociationActionAction <em>Est Objet Association Action Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getEstSujetAssociationActionAction <em>Est Sujet Association Action Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getEstObjetAssociationEvenementNRBCAction <em>Est Objet Association Evenement NRBC Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getEstSujetAssociationActionEvenementNRBC <em>Est Sujet Association Action Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getEstObjetAssociationAutreEvenementAction <em>Est Objet Association Autre Evenement Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getEstSujetAssociationActionAutreEvenement <em>Est Sujet Association Action Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionImpl#getAPourRegleEngagementRegleEngagementAction <em>APour Regle Engagement Regle Engagement Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeActionImpl extends TypeActiviteImpl implements TypeAction {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoActionCategorie.ORD;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionTypeAction TYPE_ACTION_EDEFAULT = TypeDictionaryDicoActionTypeAction.INTL;

	/**
	 * The cached value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionTypeAction typeAction = TYPE_ACTION_EDEFAULT;

	/**
	 * This is true if the Type Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeActionESet;

	/**
	 * The default value of the '{@link #getDescriptionGeneraleAction() <em>Description Generale Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGeneraleAction()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_GENERALE_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionGeneraleAction() <em>Description Generale Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGeneraleAction()
	 * @generated
	 * @ordered
	 */
	protected String descriptionGeneraleAction = DESCRIPTION_GENERALE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionPriorite PRIORITE_EDEFAULT = TypeDictionaryDicoActionPriorite._1;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionPriorite priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

	/**
	 * The default value of the '{@link #getDescriptionGeneraleObjectif() <em>Description Generale Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGeneraleObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionGeneraleObjectif() <em>Description Generale Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGeneraleObjectif()
	 * @generated
	 * @ordered
	 */
	protected String descriptionGeneraleObjectif = DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT;

	/**
	 * The default value of the '{@link #isEffortPrincipal() <em>Effort Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEffortPrincipal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EFFORT_PRINCIPAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEffortPrincipal() <em>Effort Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEffortPrincipal()
	 * @generated
	 * @ordered
	 */
	protected boolean effortPrincipal = EFFORT_PRINCIPAL_EDEFAULT;

	/**
	 * This is true if the Effort Principal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effortPrincipalESet;

	/**
	 * The default value of the '{@link #getQualificatifActivite() <em>Qualificatif Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifActivite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionQualificatifActivite QUALIFICATIF_ACTIVITE_EDEFAULT = TypeDictionaryDicoActionQualificatifActivite.UNIQUE;

	/**
	 * The cached value of the '{@link #getQualificatifActivite() <em>Qualificatif Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionQualificatifActivite qualificatifActivite = QUALIFICATIF_ACTIVITE_EDEFAULT;

	/**
	 * This is true if the Qualificatif Activite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifActiviteESet;

	/**
	 * The default value of the '{@link #getPropriete() <em>Propriete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropriete()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionPropriete PROPRIETE_EDEFAULT = TypeDictionaryDicoActionPropriete.COVERT;

	/**
	 * The cached value of the '{@link #getPropriete() <em>Propriete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropriete()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionPropriete propriete = PROPRIETE_EDEFAULT;

	/**
	 * This is true if the Propriete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean proprieteESet;

	/**
	 * The default value of the '{@link #isFictive() <em>Fictive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFictive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FICTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFictive() <em>Fictive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFictive()
	 * @generated
	 * @ordered
	 */
	protected boolean fictive = FICTIVE_EDEFAULT;

	/**
	 * This is true if the Fictive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fictiveESet;

	/**
	 * The cached value of the '{@link #getDateDebutPrevue() <em>Date Debut Prevue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutPrevue()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDebutPrevue;

	/**
	 * The default value of the '{@link #getQualificatifDateDebut() <em>Qualificatif Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionQualificatifDateDebut QUALIFICATIF_DATE_DEBUT_EDEFAULT = TypeDictionaryDicoActionQualificatifDateDebut.AFT;

	/**
	 * The cached value of the '{@link #getQualificatifDateDebut() <em>Qualificatif Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifDateDebut()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionQualificatifDateDebut qualificatifDateDebut = QUALIFICATIF_DATE_DEBUT_EDEFAULT;

	/**
	 * This is true if the Qualificatif Date Debut attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifDateDebutESet;

	/**
	 * The default value of the '{@link #getGDHLimiteInfDebut() <em>GDH Limite Inf Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHLimiteInfDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_LIMITE_INF_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHLimiteInfDebut() <em>GDH Limite Inf Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHLimiteInfDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHLimiteInfDebut = GDH_LIMITE_INF_DEBUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateFinPrevue() <em>Date Fin Prevue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinPrevue()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateFinPrevue;

	/**
	 * The default value of the '{@link #getQualificatifDateFin() <em>Qualificatif Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionQualificatifDateFin QUALIFICATIF_DATE_FIN_EDEFAULT = TypeDictionaryDicoActionQualificatifDateFin.AFT;

	/**
	 * The cached value of the '{@link #getQualificatifDateFin() <em>Qualificatif Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifDateFin()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionQualificatifDateFin qualificatifDateFin = QUALIFICATIF_DATE_FIN_EDEFAULT;

	/**
	 * This is true if the Qualificatif Date Fin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifDateFinESet;

	/**
	 * The default value of the '{@link #getGDHLimiteSupFin() <em>GDH Limite Sup Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHLimiteSupFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_LIMITE_SUP_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHLimiteSupFin() <em>GDH Limite Sup Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHLimiteSupFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHLimiteSupFin = GDH_LIMITE_SUP_FIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeMinimale() <em>Duree Minimale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeMinimale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeMinimale;

	/**
	 * The cached value of the '{@link #getDureeEstimee() <em>Duree Estimee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeEstimee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeEstimee;

	/**
	 * The cached value of the '{@link #getDureeMaximale() <em>Duree Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeMaximale;

	/**
	 * The cached value of the '{@link #getPreavisEventuel() <em>Preavis Eventuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreavisEventuel()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree preavisEventuel;

	/**
	 * The default value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected String complements = COMPLEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroAction() <em>Numero Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroAction()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_ACTION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroAction() <em>Numero Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroAction()
	 * @generated
	 * @ordered
	 */
	protected long numeroAction = NUMERO_ACTION_EDEFAULT;

	/**
	 * This is true if the Numero Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroActionESet;

	/**
	 * The default value of the '{@link #getNiveauOperationnel() <em>Niveau Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauOperationnel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionNiveauOperationnel NIVEAU_OPERATIONNEL_EDEFAULT = TypeDictionaryDicoActionNiveauOperationnel.STRTGC;

	/**
	 * The cached value of the '{@link #getNiveauOperationnel() <em>Niveau Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauOperationnel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionNiveauOperationnel niveauOperationnel = NIVEAU_OPERATIONNEL_EDEFAULT;

	/**
	 * This is true if the Niveau Operationnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauOperationnelESet;

	/**
	 * The default value of the '{@link #getDegreSurete() <em>Degre Surete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSurete()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionDegreSurete DEGRE_SURETE_EDEFAULT = TypeDictionaryDicoActionDegreSurete.ALPHA;

	/**
	 * The cached value of the '{@link #getDegreSurete() <em>Degre Surete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSurete()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionDegreSurete degreSurete = DEGRE_SURETE_EDEFAULT;

	/**
	 * This is true if the Degre Surete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean degreSureteESet;

	/**
	 * The default value of the '{@link #getImpactMeteorologie() <em>Impact Meteorologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactMeteorologie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionImpactMeteorologie IMPACT_METEOROLOGIE_EDEFAULT = TypeDictionaryDicoActionImpactMeteorologie.ACCPTB;

	/**
	 * The cached value of the '{@link #getImpactMeteorologie() <em>Impact Meteorologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactMeteorologie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionImpactMeteorologie impactMeteorologie = IMPACT_METEOROLOGIE_EDEFAULT;

	/**
	 * This is true if the Impact Meteorologie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impactMeteorologieESet;

	/**
	 * The default value of the '{@link #getPrecisionDateDebut() <em>Precision Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDatePrecision PRECISION_DATE_DEBUT_EDEFAULT = TypeDictionaryDicoDatePrecision.DAY;

	/**
	 * The cached value of the '{@link #getPrecisionDateDebut() <em>Precision Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionDateDebut()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDatePrecision precisionDateDebut = PRECISION_DATE_DEBUT_EDEFAULT;

	/**
	 * This is true if the Precision Date Debut attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionDateDebutESet;

	/**
	 * The default value of the '{@link #getCodeHeureDebut() <em>Code Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionCodeHeureDebut CODE_HEURE_DEBUT_EDEFAULT = TypeDictionaryDicoActionCodeHeureDebut.F;

	/**
	 * The cached value of the '{@link #getCodeHeureDebut() <em>Code Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionCodeHeureDebut codeHeureDebut = CODE_HEURE_DEBUT_EDEFAULT;

	/**
	 * This is true if the Code Heure Debut attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeHeureDebutESet;

	/**
	 * The default value of the '{@link #getPrecisionDateFin() <em>Precision Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDatePrecision PRECISION_DATE_FIN_EDEFAULT = TypeDictionaryDicoDatePrecision.DAY;

	/**
	 * The cached value of the '{@link #getPrecisionDateFin() <em>Precision Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionDateFin()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDatePrecision precisionDateFin = PRECISION_DATE_FIN_EDEFAULT;

	/**
	 * This is true if the Precision Date Fin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionDateFinESet;

	/**
	 * The default value of the '{@link #getCodeJourDebut() <em>Code Jour Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeJourDebut()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionCodeJourDebut CODE_JOUR_DEBUT_EDEFAULT = TypeDictionaryDicoActionCodeJourDebut.C;

	/**
	 * The cached value of the '{@link #getCodeJourDebut() <em>Code Jour Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeJourDebut()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionCodeJourDebut codeJourDebut = CODE_JOUR_DEBUT_EDEFAULT;

	/**
	 * This is true if the Code Jour Debut attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeJourDebutESet;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatAction() <em>APour Etat Etat Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatAction> aPourEtatEtatAction;

	/**
	 * The cached value of the '{@link #getNecessiteArticulation() <em>Necessite Articulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNecessiteArticulation()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation necessiteArticulation;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEntiteOrgAction() <em>Est Objet Association Entite Org Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEntiteOrgAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEntiteOrgAction;

	/**
	 * The cached value of the '{@link #getAPourUniteSoutUniteSicUniteCooperante() <em>APour Unite Sout Unite Sic Unite Cooperante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteSoutUniteSicUniteCooperante()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeUniteCooperante> aPourUniteSoutUniteSicUniteCooperante;

	/**
	 * The cached value of the '{@link #getAPourZoneRechercheZoneRecherche() <em>APour Zone Recherche Zone Recherche</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneRechercheZoneRecherche()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneRechercheZoneRecherche;

	/**
	 * The cached value of the '{@link #getAPourRessourceRessourceActivite() <em>APour Ressource Ressource Activite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRessourceRessourceActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceActivite> aPourRessourceRessourceActivite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMissionMeleeAction() <em>Est Objet Association Mission Melee Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMissionMeleeAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMissionMeleeAction;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMissionRenseignementAction() <em>Est Objet Association Mission Renseignement Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMissionRenseignementAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMissionRenseignementAction;

	/**
	 * The cached value of the '{@link #getACommeListeObjectifsCandidatsListeObjectifsCandidats() <em>AComme Liste Objectifs Candidats Liste Objectifs Candidats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeListeObjectifsCandidatsListeObjectifsCandidats()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeListeObjectifsCandidatsListeObjectifsCandidats;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationActionAction() <em>Est Objet Association Action Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationActionAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationActionAction;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationActionAction() <em>Est Sujet Association Action Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationActionAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationActionAction;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEvenementNRBCAction() <em>Est Objet Association Evenement NRBC Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEvenementNRBCAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEvenementNRBCAction;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationActionEvenementNRBC() <em>Est Sujet Association Action Evenement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationActionEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationActionEvenementNRBC;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationAutreEvenementAction() <em>Est Objet Association Autre Evenement Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationAutreEvenementAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationAutreEvenementAction;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationActionAutreEvenement() <em>Est Sujet Association Action Autre Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationActionAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationActionAutreEvenement;

	/**
	 * The cached value of the '{@link #getAPourRegleEngagementRegleEngagementAction() <em>APour Regle Engagement Regle Engagement Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRegleEngagementRegleEngagementAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRegleEngagementAction> aPourRegleEngagementRegleEngagementAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoActionCategorie newCategorie) {
		TypeDictionaryDicoActionCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoActionCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoActionTypeAction getTypeAction() {
		return typeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAction(TypeDictionaryDicoActionTypeAction newTypeAction) {
		TypeDictionaryDicoActionTypeAction oldTypeAction = typeAction;
		typeAction = newTypeAction == null ? TYPE_ACTION_EDEFAULT : newTypeAction;
		boolean oldTypeActionESet = typeActionESet;
		typeActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__TYPE_ACTION, oldTypeAction, typeAction, !oldTypeActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeAction() {
		TypeDictionaryDicoActionTypeAction oldTypeAction = typeAction;
		boolean oldTypeActionESet = typeActionESet;
		typeAction = TYPE_ACTION_EDEFAULT;
		typeActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__TYPE_ACTION, oldTypeAction, TYPE_ACTION_EDEFAULT, oldTypeActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeAction() {
		return typeActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionGeneraleAction() {
		return descriptionGeneraleAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionGeneraleAction(String newDescriptionGeneraleAction) {
		String oldDescriptionGeneraleAction = descriptionGeneraleAction;
		descriptionGeneraleAction = newDescriptionGeneraleAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_ACTION, oldDescriptionGeneraleAction, descriptionGeneraleAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionPriorite getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoActionPriorite newPriorite) {
		TypeDictionaryDicoActionPriorite oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoActionPriorite oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriorite() {
		return prioriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionGeneraleObjectif() {
		return descriptionGeneraleObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionGeneraleObjectif(String newDescriptionGeneraleObjectif) {
		String oldDescriptionGeneraleObjectif = descriptionGeneraleObjectif;
		descriptionGeneraleObjectif = newDescriptionGeneraleObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_OBJECTIF, oldDescriptionGeneraleObjectif, descriptionGeneraleObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEffortPrincipal() {
		return effortPrincipal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffortPrincipal(boolean newEffortPrincipal) {
		boolean oldEffortPrincipal = effortPrincipal;
		effortPrincipal = newEffortPrincipal;
		boolean oldEffortPrincipalESet = effortPrincipalESet;
		effortPrincipalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__EFFORT_PRINCIPAL, oldEffortPrincipal, effortPrincipal, !oldEffortPrincipalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffortPrincipal() {
		boolean oldEffortPrincipal = effortPrincipal;
		boolean oldEffortPrincipalESet = effortPrincipalESet;
		effortPrincipal = EFFORT_PRINCIPAL_EDEFAULT;
		effortPrincipalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__EFFORT_PRINCIPAL, oldEffortPrincipal, EFFORT_PRINCIPAL_EDEFAULT, oldEffortPrincipalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffortPrincipal() {
		return effortPrincipalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionQualificatifActivite getQualificatifActivite() {
		return qualificatifActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifActivite(TypeDictionaryDicoActionQualificatifActivite newQualificatifActivite) {
		TypeDictionaryDicoActionQualificatifActivite oldQualificatifActivite = qualificatifActivite;
		qualificatifActivite = newQualificatifActivite == null ? QUALIFICATIF_ACTIVITE_EDEFAULT : newQualificatifActivite;
		boolean oldQualificatifActiviteESet = qualificatifActiviteESet;
		qualificatifActiviteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__QUALIFICATIF_ACTIVITE, oldQualificatifActivite, qualificatifActivite, !oldQualificatifActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifActivite() {
		TypeDictionaryDicoActionQualificatifActivite oldQualificatifActivite = qualificatifActivite;
		boolean oldQualificatifActiviteESet = qualificatifActiviteESet;
		qualificatifActivite = QUALIFICATIF_ACTIVITE_EDEFAULT;
		qualificatifActiviteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__QUALIFICATIF_ACTIVITE, oldQualificatifActivite, QUALIFICATIF_ACTIVITE_EDEFAULT, oldQualificatifActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifActivite() {
		return qualificatifActiviteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionPropriete getPropriete() {
		return propriete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropriete(TypeDictionaryDicoActionPropriete newPropriete) {
		TypeDictionaryDicoActionPropriete oldPropriete = propriete;
		propriete = newPropriete == null ? PROPRIETE_EDEFAULT : newPropriete;
		boolean oldProprieteESet = proprieteESet;
		proprieteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__PROPRIETE, oldPropriete, propriete, !oldProprieteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropriete() {
		TypeDictionaryDicoActionPropriete oldPropriete = propriete;
		boolean oldProprieteESet = proprieteESet;
		propriete = PROPRIETE_EDEFAULT;
		proprieteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__PROPRIETE, oldPropriete, PROPRIETE_EDEFAULT, oldProprieteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropriete() {
		return proprieteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFictive() {
		return fictive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFictive(boolean newFictive) {
		boolean oldFictive = fictive;
		fictive = newFictive;
		boolean oldFictiveESet = fictiveESet;
		fictiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__FICTIVE, oldFictive, fictive, !oldFictiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFictive() {
		boolean oldFictive = fictive;
		boolean oldFictiveESet = fictiveESet;
		fictive = FICTIVE_EDEFAULT;
		fictiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__FICTIVE, oldFictive, FICTIVE_EDEFAULT, oldFictiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFictive() {
		return fictiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDebutPrevue() {
		return dateDebutPrevue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDebutPrevue(TypeDataTypeDateHeure newDateDebutPrevue, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDebutPrevue = dateDebutPrevue;
		dateDebutPrevue = newDateDebutPrevue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DATE_DEBUT_PREVUE, oldDateDebutPrevue, newDateDebutPrevue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutPrevue(TypeDataTypeDateHeure newDateDebutPrevue) {
		if (newDateDebutPrevue != dateDebutPrevue) {
			NotificationChain msgs = null;
			if (dateDebutPrevue != null)
				msgs = ((InternalEObject)dateDebutPrevue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DATE_DEBUT_PREVUE, null, msgs);
			if (newDateDebutPrevue != null)
				msgs = ((InternalEObject)newDateDebutPrevue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DATE_DEBUT_PREVUE, null, msgs);
			msgs = basicSetDateDebutPrevue(newDateDebutPrevue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DATE_DEBUT_PREVUE, newDateDebutPrevue, newDateDebutPrevue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionQualificatifDateDebut getQualificatifDateDebut() {
		return qualificatifDateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifDateDebut(TypeDictionaryDicoActionQualificatifDateDebut newQualificatifDateDebut) {
		TypeDictionaryDicoActionQualificatifDateDebut oldQualificatifDateDebut = qualificatifDateDebut;
		qualificatifDateDebut = newQualificatifDateDebut == null ? QUALIFICATIF_DATE_DEBUT_EDEFAULT : newQualificatifDateDebut;
		boolean oldQualificatifDateDebutESet = qualificatifDateDebutESet;
		qualificatifDateDebutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_DEBUT, oldQualificatifDateDebut, qualificatifDateDebut, !oldQualificatifDateDebutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifDateDebut() {
		TypeDictionaryDicoActionQualificatifDateDebut oldQualificatifDateDebut = qualificatifDateDebut;
		boolean oldQualificatifDateDebutESet = qualificatifDateDebutESet;
		qualificatifDateDebut = QUALIFICATIF_DATE_DEBUT_EDEFAULT;
		qualificatifDateDebutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_DEBUT, oldQualificatifDateDebut, QUALIFICATIF_DATE_DEBUT_EDEFAULT, oldQualificatifDateDebutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifDateDebut() {
		return qualificatifDateDebutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHLimiteInfDebut() {
		return gDHLimiteInfDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHLimiteInfDebut(XMLGregorianCalendar newGDHLimiteInfDebut) {
		XMLGregorianCalendar oldGDHLimiteInfDebut = gDHLimiteInfDebut;
		gDHLimiteInfDebut = newGDHLimiteInfDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__GDH_LIMITE_INF_DEBUT, oldGDHLimiteInfDebut, gDHLimiteInfDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateFinPrevue() {
		return dateFinPrevue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateFinPrevue(TypeDataTypeDateHeure newDateFinPrevue, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateFinPrevue = dateFinPrevue;
		dateFinPrevue = newDateFinPrevue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DATE_FIN_PREVUE, oldDateFinPrevue, newDateFinPrevue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinPrevue(TypeDataTypeDateHeure newDateFinPrevue) {
		if (newDateFinPrevue != dateFinPrevue) {
			NotificationChain msgs = null;
			if (dateFinPrevue != null)
				msgs = ((InternalEObject)dateFinPrevue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DATE_FIN_PREVUE, null, msgs);
			if (newDateFinPrevue != null)
				msgs = ((InternalEObject)newDateFinPrevue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DATE_FIN_PREVUE, null, msgs);
			msgs = basicSetDateFinPrevue(newDateFinPrevue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DATE_FIN_PREVUE, newDateFinPrevue, newDateFinPrevue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionQualificatifDateFin getQualificatifDateFin() {
		return qualificatifDateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifDateFin(TypeDictionaryDicoActionQualificatifDateFin newQualificatifDateFin) {
		TypeDictionaryDicoActionQualificatifDateFin oldQualificatifDateFin = qualificatifDateFin;
		qualificatifDateFin = newQualificatifDateFin == null ? QUALIFICATIF_DATE_FIN_EDEFAULT : newQualificatifDateFin;
		boolean oldQualificatifDateFinESet = qualificatifDateFinESet;
		qualificatifDateFinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_FIN, oldQualificatifDateFin, qualificatifDateFin, !oldQualificatifDateFinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifDateFin() {
		TypeDictionaryDicoActionQualificatifDateFin oldQualificatifDateFin = qualificatifDateFin;
		boolean oldQualificatifDateFinESet = qualificatifDateFinESet;
		qualificatifDateFin = QUALIFICATIF_DATE_FIN_EDEFAULT;
		qualificatifDateFinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_FIN, oldQualificatifDateFin, QUALIFICATIF_DATE_FIN_EDEFAULT, oldQualificatifDateFinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifDateFin() {
		return qualificatifDateFinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHLimiteSupFin() {
		return gDHLimiteSupFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHLimiteSupFin(XMLGregorianCalendar newGDHLimiteSupFin) {
		XMLGregorianCalendar oldGDHLimiteSupFin = gDHLimiteSupFin;
		gDHLimiteSupFin = newGDHLimiteSupFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__GDH_LIMITE_SUP_FIN, oldGDHLimiteSupFin, gDHLimiteSupFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeMinimale() {
		return dureeMinimale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeMinimale(TypeDataTypeDuree newDureeMinimale, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeMinimale = dureeMinimale;
		dureeMinimale = newDureeMinimale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DUREE_MINIMALE, oldDureeMinimale, newDureeMinimale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeMinimale(TypeDataTypeDuree newDureeMinimale) {
		if (newDureeMinimale != dureeMinimale) {
			NotificationChain msgs = null;
			if (dureeMinimale != null)
				msgs = ((InternalEObject)dureeMinimale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DUREE_MINIMALE, null, msgs);
			if (newDureeMinimale != null)
				msgs = ((InternalEObject)newDureeMinimale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DUREE_MINIMALE, null, msgs);
			msgs = basicSetDureeMinimale(newDureeMinimale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DUREE_MINIMALE, newDureeMinimale, newDureeMinimale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeEstimee() {
		return dureeEstimee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeEstimee(TypeDataTypeDuree newDureeEstimee, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeEstimee = dureeEstimee;
		dureeEstimee = newDureeEstimee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DUREE_ESTIMEE, oldDureeEstimee, newDureeEstimee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeEstimee(TypeDataTypeDuree newDureeEstimee) {
		if (newDureeEstimee != dureeEstimee) {
			NotificationChain msgs = null;
			if (dureeEstimee != null)
				msgs = ((InternalEObject)dureeEstimee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DUREE_ESTIMEE, null, msgs);
			if (newDureeEstimee != null)
				msgs = ((InternalEObject)newDureeEstimee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DUREE_ESTIMEE, null, msgs);
			msgs = basicSetDureeEstimee(newDureeEstimee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DUREE_ESTIMEE, newDureeEstimee, newDureeEstimee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeMaximale() {
		return dureeMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeMaximale(TypeDataTypeDuree newDureeMaximale, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeMaximale = dureeMaximale;
		dureeMaximale = newDureeMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DUREE_MAXIMALE, oldDureeMaximale, newDureeMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeMaximale(TypeDataTypeDuree newDureeMaximale) {
		if (newDureeMaximale != dureeMaximale) {
			NotificationChain msgs = null;
			if (dureeMaximale != null)
				msgs = ((InternalEObject)dureeMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DUREE_MAXIMALE, null, msgs);
			if (newDureeMaximale != null)
				msgs = ((InternalEObject)newDureeMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__DUREE_MAXIMALE, null, msgs);
			msgs = basicSetDureeMaximale(newDureeMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DUREE_MAXIMALE, newDureeMaximale, newDureeMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getPreavisEventuel() {
		return preavisEventuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreavisEventuel(TypeDataTypeDuree newPreavisEventuel, NotificationChain msgs) {
		TypeDataTypeDuree oldPreavisEventuel = preavisEventuel;
		preavisEventuel = newPreavisEventuel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__PREAVIS_EVENTUEL, oldPreavisEventuel, newPreavisEventuel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreavisEventuel(TypeDataTypeDuree newPreavisEventuel) {
		if (newPreavisEventuel != preavisEventuel) {
			NotificationChain msgs = null;
			if (preavisEventuel != null)
				msgs = ((InternalEObject)preavisEventuel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__PREAVIS_EVENTUEL, null, msgs);
			if (newPreavisEventuel != null)
				msgs = ((InternalEObject)newPreavisEventuel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__PREAVIS_EVENTUEL, null, msgs);
			msgs = basicSetPreavisEventuel(newPreavisEventuel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__PREAVIS_EVENTUEL, newPreavisEventuel, newPreavisEventuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplements() {
		return complements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplements(String newComplements) {
		String oldComplements = complements;
		complements = newComplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__COMPLEMENTS, oldComplements, complements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroAction() {
		return numeroAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroAction(long newNumeroAction) {
		long oldNumeroAction = numeroAction;
		numeroAction = newNumeroAction;
		boolean oldNumeroActionESet = numeroActionESet;
		numeroActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__NUMERO_ACTION, oldNumeroAction, numeroAction, !oldNumeroActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroAction() {
		long oldNumeroAction = numeroAction;
		boolean oldNumeroActionESet = numeroActionESet;
		numeroAction = NUMERO_ACTION_EDEFAULT;
		numeroActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__NUMERO_ACTION, oldNumeroAction, NUMERO_ACTION_EDEFAULT, oldNumeroActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroAction() {
		return numeroActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionNiveauOperationnel getNiveauOperationnel() {
		return niveauOperationnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauOperationnel(TypeDictionaryDicoActionNiveauOperationnel newNiveauOperationnel) {
		TypeDictionaryDicoActionNiveauOperationnel oldNiveauOperationnel = niveauOperationnel;
		niveauOperationnel = newNiveauOperationnel == null ? NIVEAU_OPERATIONNEL_EDEFAULT : newNiveauOperationnel;
		boolean oldNiveauOperationnelESet = niveauOperationnelESet;
		niveauOperationnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__NIVEAU_OPERATIONNEL, oldNiveauOperationnel, niveauOperationnel, !oldNiveauOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauOperationnel() {
		TypeDictionaryDicoActionNiveauOperationnel oldNiveauOperationnel = niveauOperationnel;
		boolean oldNiveauOperationnelESet = niveauOperationnelESet;
		niveauOperationnel = NIVEAU_OPERATIONNEL_EDEFAULT;
		niveauOperationnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__NIVEAU_OPERATIONNEL, oldNiveauOperationnel, NIVEAU_OPERATIONNEL_EDEFAULT, oldNiveauOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauOperationnel() {
		return niveauOperationnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionDegreSurete getDegreSurete() {
		return degreSurete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreSurete(TypeDictionaryDicoActionDegreSurete newDegreSurete) {
		TypeDictionaryDicoActionDegreSurete oldDegreSurete = degreSurete;
		degreSurete = newDegreSurete == null ? DEGRE_SURETE_EDEFAULT : newDegreSurete;
		boolean oldDegreSureteESet = degreSureteESet;
		degreSureteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__DEGRE_SURETE, oldDegreSurete, degreSurete, !oldDegreSureteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDegreSurete() {
		TypeDictionaryDicoActionDegreSurete oldDegreSurete = degreSurete;
		boolean oldDegreSureteESet = degreSureteESet;
		degreSurete = DEGRE_SURETE_EDEFAULT;
		degreSureteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__DEGRE_SURETE, oldDegreSurete, DEGRE_SURETE_EDEFAULT, oldDegreSureteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDegreSurete() {
		return degreSureteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionImpactMeteorologie getImpactMeteorologie() {
		return impactMeteorologie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactMeteorologie(TypeDictionaryDicoActionImpactMeteorologie newImpactMeteorologie) {
		TypeDictionaryDicoActionImpactMeteorologie oldImpactMeteorologie = impactMeteorologie;
		impactMeteorologie = newImpactMeteorologie == null ? IMPACT_METEOROLOGIE_EDEFAULT : newImpactMeteorologie;
		boolean oldImpactMeteorologieESet = impactMeteorologieESet;
		impactMeteorologieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__IMPACT_METEOROLOGIE, oldImpactMeteorologie, impactMeteorologie, !oldImpactMeteorologieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpactMeteorologie() {
		TypeDictionaryDicoActionImpactMeteorologie oldImpactMeteorologie = impactMeteorologie;
		boolean oldImpactMeteorologieESet = impactMeteorologieESet;
		impactMeteorologie = IMPACT_METEOROLOGIE_EDEFAULT;
		impactMeteorologieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__IMPACT_METEOROLOGIE, oldImpactMeteorologie, IMPACT_METEOROLOGIE_EDEFAULT, oldImpactMeteorologieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpactMeteorologie() {
		return impactMeteorologieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDatePrecision getPrecisionDateDebut() {
		return precisionDateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionDateDebut(TypeDictionaryDicoDatePrecision newPrecisionDateDebut) {
		TypeDictionaryDicoDatePrecision oldPrecisionDateDebut = precisionDateDebut;
		precisionDateDebut = newPrecisionDateDebut == null ? PRECISION_DATE_DEBUT_EDEFAULT : newPrecisionDateDebut;
		boolean oldPrecisionDateDebutESet = precisionDateDebutESet;
		precisionDateDebutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__PRECISION_DATE_DEBUT, oldPrecisionDateDebut, precisionDateDebut, !oldPrecisionDateDebutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionDateDebut() {
		TypeDictionaryDicoDatePrecision oldPrecisionDateDebut = precisionDateDebut;
		boolean oldPrecisionDateDebutESet = precisionDateDebutESet;
		precisionDateDebut = PRECISION_DATE_DEBUT_EDEFAULT;
		precisionDateDebutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__PRECISION_DATE_DEBUT, oldPrecisionDateDebut, PRECISION_DATE_DEBUT_EDEFAULT, oldPrecisionDateDebutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionDateDebut() {
		return precisionDateDebutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionCodeHeureDebut getCodeHeureDebut() {
		return codeHeureDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeHeureDebut(TypeDictionaryDicoActionCodeHeureDebut newCodeHeureDebut) {
		TypeDictionaryDicoActionCodeHeureDebut oldCodeHeureDebut = codeHeureDebut;
		codeHeureDebut = newCodeHeureDebut == null ? CODE_HEURE_DEBUT_EDEFAULT : newCodeHeureDebut;
		boolean oldCodeHeureDebutESet = codeHeureDebutESet;
		codeHeureDebutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__CODE_HEURE_DEBUT, oldCodeHeureDebut, codeHeureDebut, !oldCodeHeureDebutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCodeHeureDebut() {
		TypeDictionaryDicoActionCodeHeureDebut oldCodeHeureDebut = codeHeureDebut;
		boolean oldCodeHeureDebutESet = codeHeureDebutESet;
		codeHeureDebut = CODE_HEURE_DEBUT_EDEFAULT;
		codeHeureDebutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__CODE_HEURE_DEBUT, oldCodeHeureDebut, CODE_HEURE_DEBUT_EDEFAULT, oldCodeHeureDebutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCodeHeureDebut() {
		return codeHeureDebutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDatePrecision getPrecisionDateFin() {
		return precisionDateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionDateFin(TypeDictionaryDicoDatePrecision newPrecisionDateFin) {
		TypeDictionaryDicoDatePrecision oldPrecisionDateFin = precisionDateFin;
		precisionDateFin = newPrecisionDateFin == null ? PRECISION_DATE_FIN_EDEFAULT : newPrecisionDateFin;
		boolean oldPrecisionDateFinESet = precisionDateFinESet;
		precisionDateFinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__PRECISION_DATE_FIN, oldPrecisionDateFin, precisionDateFin, !oldPrecisionDateFinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionDateFin() {
		TypeDictionaryDicoDatePrecision oldPrecisionDateFin = precisionDateFin;
		boolean oldPrecisionDateFinESet = precisionDateFinESet;
		precisionDateFin = PRECISION_DATE_FIN_EDEFAULT;
		precisionDateFinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__PRECISION_DATE_FIN, oldPrecisionDateFin, PRECISION_DATE_FIN_EDEFAULT, oldPrecisionDateFinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionDateFin() {
		return precisionDateFinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionCodeJourDebut getCodeJourDebut() {
		return codeJourDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeJourDebut(TypeDictionaryDicoActionCodeJourDebut newCodeJourDebut) {
		TypeDictionaryDicoActionCodeJourDebut oldCodeJourDebut = codeJourDebut;
		codeJourDebut = newCodeJourDebut == null ? CODE_JOUR_DEBUT_EDEFAULT : newCodeJourDebut;
		boolean oldCodeJourDebutESet = codeJourDebutESet;
		codeJourDebutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__CODE_JOUR_DEBUT, oldCodeJourDebut, codeJourDebut, !oldCodeJourDebutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCodeJourDebut() {
		TypeDictionaryDicoActionCodeJourDebut oldCodeJourDebut = codeJourDebut;
		boolean oldCodeJourDebutESet = codeJourDebutESet;
		codeJourDebut = CODE_JOUR_DEBUT_EDEFAULT;
		codeJourDebutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION__CODE_JOUR_DEBUT, oldCodeJourDebut, CODE_JOUR_DEBUT_EDEFAULT, oldCodeJourDebutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCodeJourDebut() {
		return codeJourDebutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatAction> getAPourEtatEtatAction() {
		if (aPourEtatEtatAction == null) {
			aPourEtatEtatAction = new EObjectContainmentEList<TypeEtatAction>(TypeEtatAction.class, this, SchemaPackage.TYPE_ACTION__APOUR_ETAT_ETAT_ACTION);
		}
		return aPourEtatEtatAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getNecessiteArticulation() {
		return necessiteArticulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNecessiteArticulation(TypeAssociation newNecessiteArticulation, NotificationChain msgs) {
		TypeAssociation oldNecessiteArticulation = necessiteArticulation;
		necessiteArticulation = newNecessiteArticulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__NECESSITE_ARTICULATION, oldNecessiteArticulation, newNecessiteArticulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNecessiteArticulation(TypeAssociation newNecessiteArticulation) {
		if (newNecessiteArticulation != necessiteArticulation) {
			NotificationChain msgs = null;
			if (necessiteArticulation != null)
				msgs = ((InternalEObject)necessiteArticulation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__NECESSITE_ARTICULATION, null, msgs);
			if (newNecessiteArticulation != null)
				msgs = ((InternalEObject)newNecessiteArticulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__NECESSITE_ARTICULATION, null, msgs);
			msgs = basicSetNecessiteArticulation(newNecessiteArticulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__NECESSITE_ARTICULATION, newNecessiteArticulation, newNecessiteArticulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEntiteOrgAction() {
		if (estObjetAssociationEntiteOrgAction == null) {
			estObjetAssociationEntiteOrgAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ENTITE_ORG_ACTION);
		}
		return estObjetAssociationEntiteOrgAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeUniteCooperante> getAPourUniteSoutUniteSicUniteCooperante() {
		if (aPourUniteSoutUniteSicUniteCooperante == null) {
			aPourUniteSoutUniteSicUniteCooperante = new EObjectContainmentEList<TypeUniteCooperante>(TypeUniteCooperante.class, this, SchemaPackage.TYPE_ACTION__APOUR_UNITE_SOUT_UNITE_SIC_UNITE_COOPERANTE);
		}
		return aPourUniteSoutUniteSicUniteCooperante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneRechercheZoneRecherche() {
		if (aPourZoneRechercheZoneRecherche == null) {
			aPourZoneRechercheZoneRecherche = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__APOUR_ZONE_RECHERCHE_ZONE_RECHERCHE);
		}
		return aPourZoneRechercheZoneRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceActivite> getAPourRessourceRessourceActivite() {
		if (aPourRessourceRessourceActivite == null) {
			aPourRessourceRessourceActivite = new EObjectContainmentEList<TypeRessourceActivite>(TypeRessourceActivite.class, this, SchemaPackage.TYPE_ACTION__APOUR_RESSOURCE_RESSOURCE_ACTIVITE);
		}
		return aPourRessourceRessourceActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMissionMeleeAction() {
		if (estObjetAssociationMissionMeleeAction == null) {
			estObjetAssociationMissionMeleeAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_MELEE_ACTION);
		}
		return estObjetAssociationMissionMeleeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMissionRenseignementAction() {
		if (estObjetAssociationMissionRenseignementAction == null) {
			estObjetAssociationMissionRenseignementAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION);
		}
		return estObjetAssociationMissionRenseignementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeListeObjectifsCandidatsListeObjectifsCandidats() {
		return aCommeListeObjectifsCandidatsListeObjectifsCandidats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeListeObjectifsCandidatsListeObjectifsCandidats(TypeAssociation newACommeListeObjectifsCandidatsListeObjectifsCandidats, NotificationChain msgs) {
		TypeAssociation oldACommeListeObjectifsCandidatsListeObjectifsCandidats = aCommeListeObjectifsCandidatsListeObjectifsCandidats;
		aCommeListeObjectifsCandidatsListeObjectifsCandidats = newACommeListeObjectifsCandidatsListeObjectifsCandidats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__ACOMME_LISTE_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS, oldACommeListeObjectifsCandidatsListeObjectifsCandidats, newACommeListeObjectifsCandidatsListeObjectifsCandidats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeListeObjectifsCandidatsListeObjectifsCandidats(TypeAssociation newACommeListeObjectifsCandidatsListeObjectifsCandidats) {
		if (newACommeListeObjectifsCandidatsListeObjectifsCandidats != aCommeListeObjectifsCandidatsListeObjectifsCandidats) {
			NotificationChain msgs = null;
			if (aCommeListeObjectifsCandidatsListeObjectifsCandidats != null)
				msgs = ((InternalEObject)aCommeListeObjectifsCandidatsListeObjectifsCandidats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__ACOMME_LISTE_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS, null, msgs);
			if (newACommeListeObjectifsCandidatsListeObjectifsCandidats != null)
				msgs = ((InternalEObject)newACommeListeObjectifsCandidatsListeObjectifsCandidats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION__ACOMME_LISTE_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS, null, msgs);
			msgs = basicSetACommeListeObjectifsCandidatsListeObjectifsCandidats(newACommeListeObjectifsCandidatsListeObjectifsCandidats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION__ACOMME_LISTE_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS, newACommeListeObjectifsCandidatsListeObjectifsCandidats, newACommeListeObjectifsCandidatsListeObjectifsCandidats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationActionAction() {
		if (estObjetAssociationActionAction == null) {
			estObjetAssociationActionAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ACTION_ACTION);
		}
		return estObjetAssociationActionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationActionAction() {
		if (estSujetAssociationActionAction == null) {
			estSujetAssociationActionAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_ACTION);
		}
		return estSujetAssociationActionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEvenementNRBCAction() {
		if (estObjetAssociationEvenementNRBCAction == null) {
			estObjetAssociationEvenementNRBCAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_ACTION);
		}
		return estObjetAssociationEvenementNRBCAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationActionEvenementNRBC() {
		if (estSujetAssociationActionEvenementNRBC == null) {
			estSujetAssociationActionEvenementNRBC = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_EVENEMENT_NRBC);
		}
		return estSujetAssociationActionEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationAutreEvenementAction() {
		if (estObjetAssociationAutreEvenementAction == null) {
			estObjetAssociationAutreEvenementAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION);
		}
		return estObjetAssociationAutreEvenementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationActionAutreEvenement() {
		if (estSujetAssociationActionAutreEvenement == null) {
			estSujetAssociationActionAutreEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT);
		}
		return estSujetAssociationActionAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRegleEngagementAction> getAPourRegleEngagementRegleEngagementAction() {
		if (aPourRegleEngagementRegleEngagementAction == null) {
			aPourRegleEngagementRegleEngagementAction = new EObjectContainmentEList<TypeRegleEngagementAction>(TypeRegleEngagementAction.class, this, SchemaPackage.TYPE_ACTION__APOUR_REGLE_ENGAGEMENT_REGLE_ENGAGEMENT_ACTION);
		}
		return aPourRegleEngagementRegleEngagementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ACTION__DATE_DEBUT_PREVUE:
				return basicSetDateDebutPrevue(null, msgs);
			case SchemaPackage.TYPE_ACTION__DATE_FIN_PREVUE:
				return basicSetDateFinPrevue(null, msgs);
			case SchemaPackage.TYPE_ACTION__DUREE_MINIMALE:
				return basicSetDureeMinimale(null, msgs);
			case SchemaPackage.TYPE_ACTION__DUREE_ESTIMEE:
				return basicSetDureeEstimee(null, msgs);
			case SchemaPackage.TYPE_ACTION__DUREE_MAXIMALE:
				return basicSetDureeMaximale(null, msgs);
			case SchemaPackage.TYPE_ACTION__PREAVIS_EVENTUEL:
				return basicSetPreavisEventuel(null, msgs);
			case SchemaPackage.TYPE_ACTION__APOUR_ETAT_ETAT_ACTION:
				return ((InternalEList<?>)getAPourEtatEtatAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__NECESSITE_ARTICULATION:
				return basicSetNecessiteArticulation(null, msgs);
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ENTITE_ORG_ACTION:
				return ((InternalEList<?>)getEstObjetAssociationEntiteOrgAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__APOUR_UNITE_SOUT_UNITE_SIC_UNITE_COOPERANTE:
				return ((InternalEList<?>)getAPourUniteSoutUniteSicUniteCooperante()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__APOUR_ZONE_RECHERCHE_ZONE_RECHERCHE:
				return ((InternalEList<?>)getAPourZoneRechercheZoneRecherche()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				return ((InternalEList<?>)getAPourRessourceRessourceActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_MELEE_ACTION:
				return ((InternalEList<?>)getEstObjetAssociationMissionMeleeAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				return ((InternalEList<?>)getEstObjetAssociationMissionRenseignementAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__ACOMME_LISTE_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				return basicSetACommeListeObjectifsCandidatsListeObjectifsCandidats(null, msgs);
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ACTION_ACTION:
				return ((InternalEList<?>)getEstObjetAssociationActionAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_ACTION:
				return ((InternalEList<?>)getEstSujetAssociationActionAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				return ((InternalEList<?>)getEstObjetAssociationEvenementNRBCAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				return ((InternalEList<?>)getEstSujetAssociationActionEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				return ((InternalEList<?>)getEstObjetAssociationAutreEvenementAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationActionAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION__APOUR_REGLE_ENGAGEMENT_REGLE_ENGAGEMENT_ACTION:
				return ((InternalEList<?>)getAPourRegleEngagementRegleEngagementAction()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ACTION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ACTION__TYPE_ACTION:
				return getTypeAction();
			case SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_ACTION:
				return getDescriptionGeneraleAction();
			case SchemaPackage.TYPE_ACTION__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_OBJECTIF:
				return getDescriptionGeneraleObjectif();
			case SchemaPackage.TYPE_ACTION__EFFORT_PRINCIPAL:
				return isEffortPrincipal() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_ACTIVITE:
				return getQualificatifActivite();
			case SchemaPackage.TYPE_ACTION__PROPRIETE:
				return getPropriete();
			case SchemaPackage.TYPE_ACTION__FICTIVE:
				return isFictive() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ACTION__DATE_DEBUT_PREVUE:
				return getDateDebutPrevue();
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_DEBUT:
				return getQualificatifDateDebut();
			case SchemaPackage.TYPE_ACTION__GDH_LIMITE_INF_DEBUT:
				return getGDHLimiteInfDebut();
			case SchemaPackage.TYPE_ACTION__DATE_FIN_PREVUE:
				return getDateFinPrevue();
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_FIN:
				return getQualificatifDateFin();
			case SchemaPackage.TYPE_ACTION__GDH_LIMITE_SUP_FIN:
				return getGDHLimiteSupFin();
			case SchemaPackage.TYPE_ACTION__DUREE_MINIMALE:
				return getDureeMinimale();
			case SchemaPackage.TYPE_ACTION__DUREE_ESTIMEE:
				return getDureeEstimee();
			case SchemaPackage.TYPE_ACTION__DUREE_MAXIMALE:
				return getDureeMaximale();
			case SchemaPackage.TYPE_ACTION__PREAVIS_EVENTUEL:
				return getPreavisEventuel();
			case SchemaPackage.TYPE_ACTION__COMPLEMENTS:
				return getComplements();
			case SchemaPackage.TYPE_ACTION__NUMERO_ACTION:
				return new Long(getNumeroAction());
			case SchemaPackage.TYPE_ACTION__NIVEAU_OPERATIONNEL:
				return getNiveauOperationnel();
			case SchemaPackage.TYPE_ACTION__DEGRE_SURETE:
				return getDegreSurete();
			case SchemaPackage.TYPE_ACTION__IMPACT_METEOROLOGIE:
				return getImpactMeteorologie();
			case SchemaPackage.TYPE_ACTION__PRECISION_DATE_DEBUT:
				return getPrecisionDateDebut();
			case SchemaPackage.TYPE_ACTION__CODE_HEURE_DEBUT:
				return getCodeHeureDebut();
			case SchemaPackage.TYPE_ACTION__PRECISION_DATE_FIN:
				return getPrecisionDateFin();
			case SchemaPackage.TYPE_ACTION__CODE_JOUR_DEBUT:
				return getCodeJourDebut();
			case SchemaPackage.TYPE_ACTION__APOUR_ETAT_ETAT_ACTION:
				return getAPourEtatEtatAction();
			case SchemaPackage.TYPE_ACTION__NECESSITE_ARTICULATION:
				return getNecessiteArticulation();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ENTITE_ORG_ACTION:
				return getEstObjetAssociationEntiteOrgAction();
			case SchemaPackage.TYPE_ACTION__APOUR_UNITE_SOUT_UNITE_SIC_UNITE_COOPERANTE:
				return getAPourUniteSoutUniteSicUniteCooperante();
			case SchemaPackage.TYPE_ACTION__APOUR_ZONE_RECHERCHE_ZONE_RECHERCHE:
				return getAPourZoneRechercheZoneRecherche();
			case SchemaPackage.TYPE_ACTION__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				return getAPourRessourceRessourceActivite();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_MELEE_ACTION:
				return getEstObjetAssociationMissionMeleeAction();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				return getEstObjetAssociationMissionRenseignementAction();
			case SchemaPackage.TYPE_ACTION__ACOMME_LISTE_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				return getACommeListeObjectifsCandidatsListeObjectifsCandidats();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ACTION_ACTION:
				return getEstObjetAssociationActionAction();
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_ACTION:
				return getEstSujetAssociationActionAction();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				return getEstObjetAssociationEvenementNRBCAction();
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				return getEstSujetAssociationActionEvenementNRBC();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				return getEstObjetAssociationAutreEvenementAction();
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				return getEstSujetAssociationActionAutreEvenement();
			case SchemaPackage.TYPE_ACTION__APOUR_REGLE_ENGAGEMENT_REGLE_ENGAGEMENT_ACTION:
				return getAPourRegleEngagementRegleEngagementAction();
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
			case SchemaPackage.TYPE_ACTION__CATEGORIE:
				setCategorie((TypeDictionaryDicoActionCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__TYPE_ACTION:
				setTypeAction((TypeDictionaryDicoActionTypeAction)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_ACTION:
				setDescriptionGeneraleAction((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__PRIORITE:
				setPriorite((TypeDictionaryDicoActionPriorite)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_OBJECTIF:
				setDescriptionGeneraleObjectif((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EFFORT_PRINCIPAL:
				setEffortPrincipal(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_ACTIVITE:
				setQualificatifActivite((TypeDictionaryDicoActionQualificatifActivite)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__PROPRIETE:
				setPropriete((TypeDictionaryDicoActionPropriete)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__FICTIVE:
				setFictive(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ACTION__DATE_DEBUT_PREVUE:
				setDateDebutPrevue((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_DEBUT:
				setQualificatifDateDebut((TypeDictionaryDicoActionQualificatifDateDebut)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__GDH_LIMITE_INF_DEBUT:
				setGDHLimiteInfDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__DATE_FIN_PREVUE:
				setDateFinPrevue((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_FIN:
				setQualificatifDateFin((TypeDictionaryDicoActionQualificatifDateFin)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__GDH_LIMITE_SUP_FIN:
				setGDHLimiteSupFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__DUREE_MINIMALE:
				setDureeMinimale((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__DUREE_ESTIMEE:
				setDureeEstimee((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__DUREE_MAXIMALE:
				setDureeMaximale((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__PREAVIS_EVENTUEL:
				setPreavisEventuel((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__COMPLEMENTS:
				setComplements((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__NUMERO_ACTION:
				setNumeroAction(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ACTION__NIVEAU_OPERATIONNEL:
				setNiveauOperationnel((TypeDictionaryDicoActionNiveauOperationnel)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__DEGRE_SURETE:
				setDegreSurete((TypeDictionaryDicoActionDegreSurete)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__IMPACT_METEOROLOGIE:
				setImpactMeteorologie((TypeDictionaryDicoActionImpactMeteorologie)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__PRECISION_DATE_DEBUT:
				setPrecisionDateDebut((TypeDictionaryDicoDatePrecision)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__CODE_HEURE_DEBUT:
				setCodeHeureDebut((TypeDictionaryDicoActionCodeHeureDebut)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__PRECISION_DATE_FIN:
				setPrecisionDateFin((TypeDictionaryDicoDatePrecision)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__CODE_JOUR_DEBUT:
				setCodeJourDebut((TypeDictionaryDicoActionCodeJourDebut)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_ETAT_ETAT_ACTION:
				getAPourEtatEtatAction().clear();
				getAPourEtatEtatAction().addAll((Collection<? extends TypeEtatAction>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__NECESSITE_ARTICULATION:
				setNecessiteArticulation((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ENTITE_ORG_ACTION:
				getEstObjetAssociationEntiteOrgAction().clear();
				getEstObjetAssociationEntiteOrgAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_UNITE_SOUT_UNITE_SIC_UNITE_COOPERANTE:
				getAPourUniteSoutUniteSicUniteCooperante().clear();
				getAPourUniteSoutUniteSicUniteCooperante().addAll((Collection<? extends TypeUniteCooperante>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_ZONE_RECHERCHE_ZONE_RECHERCHE:
				getAPourZoneRechercheZoneRecherche().clear();
				getAPourZoneRechercheZoneRecherche().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				getAPourRessourceRessourceActivite().clear();
				getAPourRessourceRessourceActivite().addAll((Collection<? extends TypeRessourceActivite>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_MELEE_ACTION:
				getEstObjetAssociationMissionMeleeAction().clear();
				getEstObjetAssociationMissionMeleeAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				getEstObjetAssociationMissionRenseignementAction().clear();
				getEstObjetAssociationMissionRenseignementAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__ACOMME_LISTE_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				setACommeListeObjectifsCandidatsListeObjectifsCandidats((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ACTION_ACTION:
				getEstObjetAssociationActionAction().clear();
				getEstObjetAssociationActionAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_ACTION:
				getEstSujetAssociationActionAction().clear();
				getEstSujetAssociationActionAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				getEstObjetAssociationEvenementNRBCAction().clear();
				getEstObjetAssociationEvenementNRBCAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				getEstSujetAssociationActionEvenementNRBC().clear();
				getEstSujetAssociationActionEvenementNRBC().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				getEstObjetAssociationAutreEvenementAction().clear();
				getEstObjetAssociationAutreEvenementAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				getEstSujetAssociationActionAutreEvenement().clear();
				getEstSujetAssociationActionAutreEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_REGLE_ENGAGEMENT_REGLE_ENGAGEMENT_ACTION:
				getAPourRegleEngagementRegleEngagementAction().clear();
				getAPourRegleEngagementRegleEngagementAction().addAll((Collection<? extends TypeRegleEngagementAction>)newValue);
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
			case SchemaPackage.TYPE_ACTION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ACTION__TYPE_ACTION:
				unsetTypeAction();
				return;
			case SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_ACTION:
				setDescriptionGeneraleAction(DESCRIPTION_GENERALE_ACTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_OBJECTIF:
				setDescriptionGeneraleObjectif(DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION__EFFORT_PRINCIPAL:
				unsetEffortPrincipal();
				return;
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_ACTIVITE:
				unsetQualificatifActivite();
				return;
			case SchemaPackage.TYPE_ACTION__PROPRIETE:
				unsetPropriete();
				return;
			case SchemaPackage.TYPE_ACTION__FICTIVE:
				unsetFictive();
				return;
			case SchemaPackage.TYPE_ACTION__DATE_DEBUT_PREVUE:
				setDateDebutPrevue((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_DEBUT:
				unsetQualificatifDateDebut();
				return;
			case SchemaPackage.TYPE_ACTION__GDH_LIMITE_INF_DEBUT:
				setGDHLimiteInfDebut(GDH_LIMITE_INF_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION__DATE_FIN_PREVUE:
				setDateFinPrevue((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_FIN:
				unsetQualificatifDateFin();
				return;
			case SchemaPackage.TYPE_ACTION__GDH_LIMITE_SUP_FIN:
				setGDHLimiteSupFin(GDH_LIMITE_SUP_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION__DUREE_MINIMALE:
				setDureeMinimale((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_ACTION__DUREE_ESTIMEE:
				setDureeEstimee((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_ACTION__DUREE_MAXIMALE:
				setDureeMaximale((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_ACTION__PREAVIS_EVENTUEL:
				setPreavisEventuel((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_ACTION__COMPLEMENTS:
				setComplements(COMPLEMENTS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION__NUMERO_ACTION:
				unsetNumeroAction();
				return;
			case SchemaPackage.TYPE_ACTION__NIVEAU_OPERATIONNEL:
				unsetNiveauOperationnel();
				return;
			case SchemaPackage.TYPE_ACTION__DEGRE_SURETE:
				unsetDegreSurete();
				return;
			case SchemaPackage.TYPE_ACTION__IMPACT_METEOROLOGIE:
				unsetImpactMeteorologie();
				return;
			case SchemaPackage.TYPE_ACTION__PRECISION_DATE_DEBUT:
				unsetPrecisionDateDebut();
				return;
			case SchemaPackage.TYPE_ACTION__CODE_HEURE_DEBUT:
				unsetCodeHeureDebut();
				return;
			case SchemaPackage.TYPE_ACTION__PRECISION_DATE_FIN:
				unsetPrecisionDateFin();
				return;
			case SchemaPackage.TYPE_ACTION__CODE_JOUR_DEBUT:
				unsetCodeJourDebut();
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_ETAT_ETAT_ACTION:
				getAPourEtatEtatAction().clear();
				return;
			case SchemaPackage.TYPE_ACTION__NECESSITE_ARTICULATION:
				setNecessiteArticulation((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ENTITE_ORG_ACTION:
				getEstObjetAssociationEntiteOrgAction().clear();
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_UNITE_SOUT_UNITE_SIC_UNITE_COOPERANTE:
				getAPourUniteSoutUniteSicUniteCooperante().clear();
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_ZONE_RECHERCHE_ZONE_RECHERCHE:
				getAPourZoneRechercheZoneRecherche().clear();
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				getAPourRessourceRessourceActivite().clear();
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_MELEE_ACTION:
				getEstObjetAssociationMissionMeleeAction().clear();
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				getEstObjetAssociationMissionRenseignementAction().clear();
				return;
			case SchemaPackage.TYPE_ACTION__ACOMME_LISTE_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				setACommeListeObjectifsCandidatsListeObjectifsCandidats((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ACTION_ACTION:
				getEstObjetAssociationActionAction().clear();
				return;
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_ACTION:
				getEstSujetAssociationActionAction().clear();
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				getEstObjetAssociationEvenementNRBCAction().clear();
				return;
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				getEstSujetAssociationActionEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				getEstObjetAssociationAutreEvenementAction().clear();
				return;
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				getEstSujetAssociationActionAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_ACTION__APOUR_REGLE_ENGAGEMENT_REGLE_ENGAGEMENT_ACTION:
				getAPourRegleEngagementRegleEngagementAction().clear();
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
			case SchemaPackage.TYPE_ACTION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ACTION__TYPE_ACTION:
				return isSetTypeAction();
			case SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_ACTION:
				return DESCRIPTION_GENERALE_ACTION_EDEFAULT == null ? descriptionGeneraleAction != null : !DESCRIPTION_GENERALE_ACTION_EDEFAULT.equals(descriptionGeneraleAction);
			case SchemaPackage.TYPE_ACTION__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_ACTION__DESCRIPTION_GENERALE_OBJECTIF:
				return DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT == null ? descriptionGeneraleObjectif != null : !DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT.equals(descriptionGeneraleObjectif);
			case SchemaPackage.TYPE_ACTION__EFFORT_PRINCIPAL:
				return isSetEffortPrincipal();
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_ACTIVITE:
				return isSetQualificatifActivite();
			case SchemaPackage.TYPE_ACTION__PROPRIETE:
				return isSetPropriete();
			case SchemaPackage.TYPE_ACTION__FICTIVE:
				return isSetFictive();
			case SchemaPackage.TYPE_ACTION__DATE_DEBUT_PREVUE:
				return dateDebutPrevue != null;
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_DEBUT:
				return isSetQualificatifDateDebut();
			case SchemaPackage.TYPE_ACTION__GDH_LIMITE_INF_DEBUT:
				return GDH_LIMITE_INF_DEBUT_EDEFAULT == null ? gDHLimiteInfDebut != null : !GDH_LIMITE_INF_DEBUT_EDEFAULT.equals(gDHLimiteInfDebut);
			case SchemaPackage.TYPE_ACTION__DATE_FIN_PREVUE:
				return dateFinPrevue != null;
			case SchemaPackage.TYPE_ACTION__QUALIFICATIF_DATE_FIN:
				return isSetQualificatifDateFin();
			case SchemaPackage.TYPE_ACTION__GDH_LIMITE_SUP_FIN:
				return GDH_LIMITE_SUP_FIN_EDEFAULT == null ? gDHLimiteSupFin != null : !GDH_LIMITE_SUP_FIN_EDEFAULT.equals(gDHLimiteSupFin);
			case SchemaPackage.TYPE_ACTION__DUREE_MINIMALE:
				return dureeMinimale != null;
			case SchemaPackage.TYPE_ACTION__DUREE_ESTIMEE:
				return dureeEstimee != null;
			case SchemaPackage.TYPE_ACTION__DUREE_MAXIMALE:
				return dureeMaximale != null;
			case SchemaPackage.TYPE_ACTION__PREAVIS_EVENTUEL:
				return preavisEventuel != null;
			case SchemaPackage.TYPE_ACTION__COMPLEMENTS:
				return COMPLEMENTS_EDEFAULT == null ? complements != null : !COMPLEMENTS_EDEFAULT.equals(complements);
			case SchemaPackage.TYPE_ACTION__NUMERO_ACTION:
				return isSetNumeroAction();
			case SchemaPackage.TYPE_ACTION__NIVEAU_OPERATIONNEL:
				return isSetNiveauOperationnel();
			case SchemaPackage.TYPE_ACTION__DEGRE_SURETE:
				return isSetDegreSurete();
			case SchemaPackage.TYPE_ACTION__IMPACT_METEOROLOGIE:
				return isSetImpactMeteorologie();
			case SchemaPackage.TYPE_ACTION__PRECISION_DATE_DEBUT:
				return isSetPrecisionDateDebut();
			case SchemaPackage.TYPE_ACTION__CODE_HEURE_DEBUT:
				return isSetCodeHeureDebut();
			case SchemaPackage.TYPE_ACTION__PRECISION_DATE_FIN:
				return isSetPrecisionDateFin();
			case SchemaPackage.TYPE_ACTION__CODE_JOUR_DEBUT:
				return isSetCodeJourDebut();
			case SchemaPackage.TYPE_ACTION__APOUR_ETAT_ETAT_ACTION:
				return aPourEtatEtatAction != null && !aPourEtatEtatAction.isEmpty();
			case SchemaPackage.TYPE_ACTION__NECESSITE_ARTICULATION:
				return necessiteArticulation != null;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ENTITE_ORG_ACTION:
				return estObjetAssociationEntiteOrgAction != null && !estObjetAssociationEntiteOrgAction.isEmpty();
			case SchemaPackage.TYPE_ACTION__APOUR_UNITE_SOUT_UNITE_SIC_UNITE_COOPERANTE:
				return aPourUniteSoutUniteSicUniteCooperante != null && !aPourUniteSoutUniteSicUniteCooperante.isEmpty();
			case SchemaPackage.TYPE_ACTION__APOUR_ZONE_RECHERCHE_ZONE_RECHERCHE:
				return aPourZoneRechercheZoneRecherche != null && !aPourZoneRechercheZoneRecherche.isEmpty();
			case SchemaPackage.TYPE_ACTION__APOUR_RESSOURCE_RESSOURCE_ACTIVITE:
				return aPourRessourceRessourceActivite != null && !aPourRessourceRessourceActivite.isEmpty();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_MELEE_ACTION:
				return estObjetAssociationMissionMeleeAction != null && !estObjetAssociationMissionMeleeAction.isEmpty();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				return estObjetAssociationMissionRenseignementAction != null && !estObjetAssociationMissionRenseignementAction.isEmpty();
			case SchemaPackage.TYPE_ACTION__ACOMME_LISTE_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				return aCommeListeObjectifsCandidatsListeObjectifsCandidats != null;
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_ACTION_ACTION:
				return estObjetAssociationActionAction != null && !estObjetAssociationActionAction.isEmpty();
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_ACTION:
				return estSujetAssociationActionAction != null && !estSujetAssociationActionAction.isEmpty();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				return estObjetAssociationEvenementNRBCAction != null && !estObjetAssociationEvenementNRBCAction.isEmpty();
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				return estSujetAssociationActionEvenementNRBC != null && !estSujetAssociationActionEvenementNRBC.isEmpty();
			case SchemaPackage.TYPE_ACTION__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				return estObjetAssociationAutreEvenementAction != null && !estObjetAssociationAutreEvenementAction.isEmpty();
			case SchemaPackage.TYPE_ACTION__EST_SUJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				return estSujetAssociationActionAutreEvenement != null && !estSujetAssociationActionAutreEvenement.isEmpty();
			case SchemaPackage.TYPE_ACTION__APOUR_REGLE_ENGAGEMENT_REGLE_ENGAGEMENT_ACTION:
				return aPourRegleEngagementRegleEngagementAction != null && !aPourRegleEngagementRegleEngagementAction.isEmpty();
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
		result.append(", typeAction: ");
		if (typeActionESet) result.append(typeAction); else result.append("<unset>");
		result.append(", descriptionGeneraleAction: ");
		result.append(descriptionGeneraleAction);
		result.append(", priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", descriptionGeneraleObjectif: ");
		result.append(descriptionGeneraleObjectif);
		result.append(", effortPrincipal: ");
		if (effortPrincipalESet) result.append(effortPrincipal); else result.append("<unset>");
		result.append(", qualificatifActivite: ");
		if (qualificatifActiviteESet) result.append(qualificatifActivite); else result.append("<unset>");
		result.append(", propriete: ");
		if (proprieteESet) result.append(propriete); else result.append("<unset>");
		result.append(", fictive: ");
		if (fictiveESet) result.append(fictive); else result.append("<unset>");
		result.append(", qualificatifDateDebut: ");
		if (qualificatifDateDebutESet) result.append(qualificatifDateDebut); else result.append("<unset>");
		result.append(", gDHLimiteInfDebut: ");
		result.append(gDHLimiteInfDebut);
		result.append(", qualificatifDateFin: ");
		if (qualificatifDateFinESet) result.append(qualificatifDateFin); else result.append("<unset>");
		result.append(", gDHLimiteSupFin: ");
		result.append(gDHLimiteSupFin);
		result.append(", complements: ");
		result.append(complements);
		result.append(", numeroAction: ");
		if (numeroActionESet) result.append(numeroAction); else result.append("<unset>");
		result.append(", niveauOperationnel: ");
		if (niveauOperationnelESet) result.append(niveauOperationnel); else result.append("<unset>");
		result.append(", degreSurete: ");
		if (degreSureteESet) result.append(degreSurete); else result.append("<unset>");
		result.append(", impactMeteorologie: ");
		if (impactMeteorologieESet) result.append(impactMeteorologie); else result.append("<unset>");
		result.append(", precisionDateDebut: ");
		if (precisionDateDebutESet) result.append(precisionDateDebut); else result.append("<unset>");
		result.append(", codeHeureDebut: ");
		if (codeHeureDebutESet) result.append(codeHeureDebut); else result.append("<unset>");
		result.append(", precisionDateFin: ");
		if (precisionDateFinESet) result.append(precisionDateFin); else result.append("<unset>");
		result.append(", codeJourDebut: ");
		if (codeJourDebutESet) result.append(codeJourDebut); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeActionImpl
