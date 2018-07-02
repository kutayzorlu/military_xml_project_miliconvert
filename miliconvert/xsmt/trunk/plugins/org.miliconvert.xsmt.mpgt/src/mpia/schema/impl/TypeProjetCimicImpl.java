/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDeviseProjetCimic;
import mpia.schema.TypeDictionaryDicoDomaineProjetCimic;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;
import mpia.schema.TypeDictionaryDicoEtatProjetCimic;
import mpia.schema.TypeDictionaryDicoTypeProjetCimic;
import mpia.schema.TypeProjetCimic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Projet Cimic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getEtatDemande <em>Etat Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getOrganismeBeneficiaire <em>Organisme Beneficiaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getOrigineDemande <em>Origine Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getImpact <em>Impact</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getInitiative <em>Initiative</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getSituationDemande <em>Situation Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getPilote <em>Pilote</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getPiloteAssistant <em>Pilote Assistant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getOrigineFonds <em>Origine Fonds</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getBudgetDevise <em>Budget Devise</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getBudgetMontant <em>Budget Montant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getDepenseMontant <em>Depense Montant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getEtatTravaux <em>Etat Travaux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getPourcentAvancement <em>Pourcent Avancement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getLieu <em>Lieu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getMunicipalite <em>Municipalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getNation <em>Nation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getGdhPrevisionnelDebut <em>Gdh Previsionnel Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getGdhPrevisionnelFin <em>Gdh Previsionnel Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getGdhReelDebut <em>Gdh Reel Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getGdhReelFin <em>Gdh Reel Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getDocumentCommunication <em>Document Communication</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getDocumentFaisabilite <em>Document Faisabilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProjetCimicImpl#getCouleurRGB <em>Couleur RGB</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeProjetCimicImpl extends TypeActiviteImpl implements TypeProjetCimic {
	/**
	 * The default value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected String identifiant = IDENTIFIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeProjetCimic TYPE_EDEFAULT = TypeDictionaryDicoTypeProjetCimic.CIV;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeProjetCimic type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDomaineProjetCimic DOMAINE_EDEFAULT = TypeDictionaryDicoDomaineProjetCimic.AGRI;

	/**
	 * The cached value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDomaineProjetCimic domaine = DOMAINE_EDEFAULT;

	/**
	 * This is true if the Domaine attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean domaineESet;

	/**
	 * The default value of the '{@link #getEtatDemande() <em>Etat Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemande()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatProjetCimic ETAT_DEMANDE_EDEFAULT = TypeDictionaryDicoEtatProjetCimic.PENDING;

	/**
	 * The cached value of the '{@link #getEtatDemande() <em>Etat Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemande()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatProjetCimic etatDemande = ETAT_DEMANDE_EDEFAULT;

	/**
	 * This is true if the Etat Demande attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatDemandeESet;

	/**
	 * The default value of the '{@link #getOrganismeBeneficiaire() <em>Organisme Beneficiaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganismeBeneficiaire()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANISME_BENEFICIAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganismeBeneficiaire() <em>Organisme Beneficiaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganismeBeneficiaire()
	 * @generated
	 * @ordered
	 */
	protected String organismeBeneficiaire = ORGANISME_BENEFICIAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigineDemande() <em>Origine Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigineDemande()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINE_DEMANDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigineDemande() <em>Origine Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigineDemande()
	 * @generated
	 * @ordered
	 */
	protected String origineDemande = ORIGINE_DEMANDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected String objectif = OBJECTIF_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected String impact = IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitiative() <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiative()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiative() <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiative()
	 * @generated
	 * @ordered
	 */
	protected String initiative = INITIATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSituationDemande() <em>Situation Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationDemande()
	 * @generated
	 * @ordered
	 */
	protected static final String SITUATION_DEMANDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSituationDemande() <em>Situation Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationDemande()
	 * @generated
	 * @ordered
	 */
	protected String situationDemande = SITUATION_DEMANDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPilote() <em>Pilote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPilote()
	 * @generated
	 * @ordered
	 */
	protected static final String PILOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPilote() <em>Pilote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPilote()
	 * @generated
	 * @ordered
	 */
	protected String pilote = PILOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPiloteAssistant() <em>Pilote Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiloteAssistant()
	 * @generated
	 * @ordered
	 */
	protected static final String PILOTE_ASSISTANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPiloteAssistant() <em>Pilote Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiloteAssistant()
	 * @generated
	 * @ordered
	 */
	protected String piloteAssistant = PILOTE_ASSISTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigineFonds() <em>Origine Fonds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigineFonds()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINE_FONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigineFonds() <em>Origine Fonds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigineFonds()
	 * @generated
	 * @ordered
	 */
	protected String origineFonds = ORIGINE_FONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBudgetDevise() <em>Budget Devise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetDevise()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDeviseProjetCimic BUDGET_DEVISE_EDEFAULT = TypeDictionaryDicoDeviseProjetCimic.EURO;

	/**
	 * The cached value of the '{@link #getBudgetDevise() <em>Budget Devise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetDevise()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDeviseProjetCimic budgetDevise = BUDGET_DEVISE_EDEFAULT;

	/**
	 * This is true if the Budget Devise attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean budgetDeviseESet;

	/**
	 * The default value of the '{@link #getBudgetMontant() <em>Budget Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetMontant()
	 * @generated
	 * @ordered
	 */
	protected static final double BUDGET_MONTANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBudgetMontant() <em>Budget Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetMontant()
	 * @generated
	 * @ordered
	 */
	protected double budgetMontant = BUDGET_MONTANT_EDEFAULT;

	/**
	 * This is true if the Budget Montant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean budgetMontantESet;

	/**
	 * The default value of the '{@link #getDepenseMontant() <em>Depense Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepenseMontant()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPENSE_MONTANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepenseMontant() <em>Depense Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepenseMontant()
	 * @generated
	 * @ordered
	 */
	protected double depenseMontant = DEPENSE_MONTANT_EDEFAULT;

	/**
	 * This is true if the Depense Montant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean depenseMontantESet;

	/**
	 * The default value of the '{@link #getEtatTravaux() <em>Etat Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatTravaux()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatProjetCimic ETAT_TRAVAUX_EDEFAULT = TypeDictionaryDicoEtatProjetCimic.PENDING;

	/**
	 * The cached value of the '{@link #getEtatTravaux() <em>Etat Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatTravaux()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatProjetCimic etatTravaux = ETAT_TRAVAUX_EDEFAULT;

	/**
	 * This is true if the Etat Travaux attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatTravauxESet;

	/**
	 * The default value of the '{@link #getPourcentAvancement() <em>Pourcent Avancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentAvancement()
	 * @generated
	 * @ordered
	 */
	protected static final long POURCENT_AVANCEMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPourcentAvancement() <em>Pourcent Avancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentAvancement()
	 * @generated
	 * @ordered
	 */
	protected long pourcentAvancement = POURCENT_AVANCEMENT_EDEFAULT;

	/**
	 * This is true if the Pourcent Avancement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentAvancementESet;

	/**
	 * The default value of the '{@link #getLieu() <em>Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieu()
	 * @generated
	 * @ordered
	 */
	protected static final String LIEU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLieu() <em>Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieu()
	 * @generated
	 * @ordered
	 */
	protected String lieu = LIEU_EDEFAULT;

	/**
	 * The default value of the '{@link #getMunicipalite() <em>Municipalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunicipalite()
	 * @generated
	 * @ordered
	 */
	protected static final String MUNICIPALITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMunicipalite() <em>Municipalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunicipalite()
	 * @generated
	 * @ordered
	 */
	protected String municipalite = MUNICIPALITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNation() <em>Nation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntitePolitiqueTrigramme NATION_EDEFAULT = TypeDictionaryDicoEntitePolitiqueTrigramme.ATG;

	/**
	 * The cached value of the '{@link #getNation() <em>Nation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntitePolitiqueTrigramme nation = NATION_EDEFAULT;

	/**
	 * This is true if the Nation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nationESet;

	/**
	 * The default value of the '{@link #getGdhPrevisionnelDebut() <em>Gdh Previsionnel Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhPrevisionnelDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_PREVISIONNEL_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGdhPrevisionnelDebut() <em>Gdh Previsionnel Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhPrevisionnelDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gdhPrevisionnelDebut = GDH_PREVISIONNEL_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGdhPrevisionnelFin() <em>Gdh Previsionnel Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhPrevisionnelFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_PREVISIONNEL_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGdhPrevisionnelFin() <em>Gdh Previsionnel Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhPrevisionnelFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gdhPrevisionnelFin = GDH_PREVISIONNEL_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGdhReelDebut() <em>Gdh Reel Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhReelDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_REEL_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGdhReelDebut() <em>Gdh Reel Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhReelDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gdhReelDebut = GDH_REEL_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGdhReelFin() <em>Gdh Reel Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhReelFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_REEL_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGdhReelFin() <em>Gdh Reel Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhReelFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gdhReelFin = GDH_REEL_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentCommunication() <em>Document Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_COMMUNICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentCommunication() <em>Document Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCommunication()
	 * @generated
	 * @ordered
	 */
	protected String documentCommunication = DOCUMENT_COMMUNICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentFaisabilite() <em>Document Faisabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFaisabilite()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_FAISABILITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentFaisabilite() <em>Document Faisabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFaisabilite()
	 * @generated
	 * @ordered
	 */
	protected String documentFaisabilite = DOCUMENT_FAISABILITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCouleurRGB() <em>Couleur RGB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurRGB()
	 * @generated
	 * @ordered
	 */
	protected static final String COULEUR_RGB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCouleurRGB() <em>Couleur RGB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurRGB()
	 * @generated
	 * @ordered
	 */
	protected String couleurRGB = COULEUR_RGB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeProjetCimicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeProjetCimic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiant(String newIdentifiant) {
		String oldIdentifiant = identifiant;
		identifiant = newIdentifiant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__IDENTIFIANT, oldIdentifiant, identifiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeProjetCimic getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoTypeProjetCimic newType) {
		TypeDictionaryDicoTypeProjetCimic oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoTypeProjetCimic oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROJET_CIMIC__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDomaineProjetCimic getDomaine() {
		return domaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaine(TypeDictionaryDicoDomaineProjetCimic newDomaine) {
		TypeDictionaryDicoDomaineProjetCimic oldDomaine = domaine;
		domaine = newDomaine == null ? DOMAINE_EDEFAULT : newDomaine;
		boolean oldDomaineESet = domaineESet;
		domaineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__DOMAINE, oldDomaine, domaine, !oldDomaineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDomaine() {
		TypeDictionaryDicoDomaineProjetCimic oldDomaine = domaine;
		boolean oldDomaineESet = domaineESet;
		domaine = DOMAINE_EDEFAULT;
		domaineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROJET_CIMIC__DOMAINE, oldDomaine, DOMAINE_EDEFAULT, oldDomaineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomaine() {
		return domaineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatProjetCimic getEtatDemande() {
		return etatDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatDemande(TypeDictionaryDicoEtatProjetCimic newEtatDemande) {
		TypeDictionaryDicoEtatProjetCimic oldEtatDemande = etatDemande;
		etatDemande = newEtatDemande == null ? ETAT_DEMANDE_EDEFAULT : newEtatDemande;
		boolean oldEtatDemandeESet = etatDemandeESet;
		etatDemandeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__ETAT_DEMANDE, oldEtatDemande, etatDemande, !oldEtatDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatDemande() {
		TypeDictionaryDicoEtatProjetCimic oldEtatDemande = etatDemande;
		boolean oldEtatDemandeESet = etatDemandeESet;
		etatDemande = ETAT_DEMANDE_EDEFAULT;
		etatDemandeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROJET_CIMIC__ETAT_DEMANDE, oldEtatDemande, ETAT_DEMANDE_EDEFAULT, oldEtatDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatDemande() {
		return etatDemandeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganismeBeneficiaire() {
		return organismeBeneficiaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganismeBeneficiaire(String newOrganismeBeneficiaire) {
		String oldOrganismeBeneficiaire = organismeBeneficiaire;
		organismeBeneficiaire = newOrganismeBeneficiaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__ORGANISME_BENEFICIAIRE, oldOrganismeBeneficiaire, organismeBeneficiaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigineDemande() {
		return origineDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigineDemande(String newOrigineDemande) {
		String oldOrigineDemande = origineDemande;
		origineDemande = newOrigineDemande;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_DEMANDE, oldOrigineDemande, origineDemande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectif() {
		return objectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectif(String newObjectif) {
		String oldObjectif = objectif;
		objectif = newObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__OBJECTIF, oldObjectif, objectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpact() {
		return impact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpact(String newImpact) {
		String oldImpact = impact;
		impact = newImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__IMPACT, oldImpact, impact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitiative() {
		return initiative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiative(String newInitiative) {
		String oldInitiative = initiative;
		initiative = newInitiative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__INITIATIVE, oldInitiative, initiative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSituationDemande() {
		return situationDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituationDemande(String newSituationDemande) {
		String oldSituationDemande = situationDemande;
		situationDemande = newSituationDemande;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__SITUATION_DEMANDE, oldSituationDemande, situationDemande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPilote() {
		return pilote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPilote(String newPilote) {
		String oldPilote = pilote;
		pilote = newPilote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__PILOTE, oldPilote, pilote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPiloteAssistant() {
		return piloteAssistant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPiloteAssistant(String newPiloteAssistant) {
		String oldPiloteAssistant = piloteAssistant;
		piloteAssistant = newPiloteAssistant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__PILOTE_ASSISTANT, oldPiloteAssistant, piloteAssistant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigineFonds() {
		return origineFonds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigineFonds(String newOrigineFonds) {
		String oldOrigineFonds = origineFonds;
		origineFonds = newOrigineFonds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_FONDS, oldOrigineFonds, origineFonds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDeviseProjetCimic getBudgetDevise() {
		return budgetDevise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBudgetDevise(TypeDictionaryDicoDeviseProjetCimic newBudgetDevise) {
		TypeDictionaryDicoDeviseProjetCimic oldBudgetDevise = budgetDevise;
		budgetDevise = newBudgetDevise == null ? BUDGET_DEVISE_EDEFAULT : newBudgetDevise;
		boolean oldBudgetDeviseESet = budgetDeviseESet;
		budgetDeviseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_DEVISE, oldBudgetDevise, budgetDevise, !oldBudgetDeviseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBudgetDevise() {
		TypeDictionaryDicoDeviseProjetCimic oldBudgetDevise = budgetDevise;
		boolean oldBudgetDeviseESet = budgetDeviseESet;
		budgetDevise = BUDGET_DEVISE_EDEFAULT;
		budgetDeviseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_DEVISE, oldBudgetDevise, BUDGET_DEVISE_EDEFAULT, oldBudgetDeviseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBudgetDevise() {
		return budgetDeviseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBudgetMontant() {
		return budgetMontant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBudgetMontant(double newBudgetMontant) {
		double oldBudgetMontant = budgetMontant;
		budgetMontant = newBudgetMontant;
		boolean oldBudgetMontantESet = budgetMontantESet;
		budgetMontantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_MONTANT, oldBudgetMontant, budgetMontant, !oldBudgetMontantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBudgetMontant() {
		double oldBudgetMontant = budgetMontant;
		boolean oldBudgetMontantESet = budgetMontantESet;
		budgetMontant = BUDGET_MONTANT_EDEFAULT;
		budgetMontantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_MONTANT, oldBudgetMontant, BUDGET_MONTANT_EDEFAULT, oldBudgetMontantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBudgetMontant() {
		return budgetMontantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepenseMontant() {
		return depenseMontant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepenseMontant(double newDepenseMontant) {
		double oldDepenseMontant = depenseMontant;
		depenseMontant = newDepenseMontant;
		boolean oldDepenseMontantESet = depenseMontantESet;
		depenseMontantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__DEPENSE_MONTANT, oldDepenseMontant, depenseMontant, !oldDepenseMontantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDepenseMontant() {
		double oldDepenseMontant = depenseMontant;
		boolean oldDepenseMontantESet = depenseMontantESet;
		depenseMontant = DEPENSE_MONTANT_EDEFAULT;
		depenseMontantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROJET_CIMIC__DEPENSE_MONTANT, oldDepenseMontant, DEPENSE_MONTANT_EDEFAULT, oldDepenseMontantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDepenseMontant() {
		return depenseMontantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatProjetCimic getEtatTravaux() {
		return etatTravaux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatTravaux(TypeDictionaryDicoEtatProjetCimic newEtatTravaux) {
		TypeDictionaryDicoEtatProjetCimic oldEtatTravaux = etatTravaux;
		etatTravaux = newEtatTravaux == null ? ETAT_TRAVAUX_EDEFAULT : newEtatTravaux;
		boolean oldEtatTravauxESet = etatTravauxESet;
		etatTravauxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__ETAT_TRAVAUX, oldEtatTravaux, etatTravaux, !oldEtatTravauxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatTravaux() {
		TypeDictionaryDicoEtatProjetCimic oldEtatTravaux = etatTravaux;
		boolean oldEtatTravauxESet = etatTravauxESet;
		etatTravaux = ETAT_TRAVAUX_EDEFAULT;
		etatTravauxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROJET_CIMIC__ETAT_TRAVAUX, oldEtatTravaux, ETAT_TRAVAUX_EDEFAULT, oldEtatTravauxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatTravaux() {
		return etatTravauxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPourcentAvancement() {
		return pourcentAvancement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentAvancement(long newPourcentAvancement) {
		long oldPourcentAvancement = pourcentAvancement;
		pourcentAvancement = newPourcentAvancement;
		boolean oldPourcentAvancementESet = pourcentAvancementESet;
		pourcentAvancementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__POURCENT_AVANCEMENT, oldPourcentAvancement, pourcentAvancement, !oldPourcentAvancementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentAvancement() {
		long oldPourcentAvancement = pourcentAvancement;
		boolean oldPourcentAvancementESet = pourcentAvancementESet;
		pourcentAvancement = POURCENT_AVANCEMENT_EDEFAULT;
		pourcentAvancementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROJET_CIMIC__POURCENT_AVANCEMENT, oldPourcentAvancement, POURCENT_AVANCEMENT_EDEFAULT, oldPourcentAvancementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentAvancement() {
		return pourcentAvancementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLieu() {
		return lieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLieu(String newLieu) {
		String oldLieu = lieu;
		lieu = newLieu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__LIEU, oldLieu, lieu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMunicipalite() {
		return municipalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMunicipalite(String newMunicipalite) {
		String oldMunicipalite = municipalite;
		municipalite = newMunicipalite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__MUNICIPALITE, oldMunicipalite, municipalite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntitePolitiqueTrigramme getNation() {
		return nation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNation(TypeDictionaryDicoEntitePolitiqueTrigramme newNation) {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNation = nation;
		nation = newNation == null ? NATION_EDEFAULT : newNation;
		boolean oldNationESet = nationESet;
		nationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__NATION, oldNation, nation, !oldNationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNation() {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNation = nation;
		boolean oldNationESet = nationESet;
		nation = NATION_EDEFAULT;
		nationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROJET_CIMIC__NATION, oldNation, NATION_EDEFAULT, oldNationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNation() {
		return nationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGdhPrevisionnelDebut() {
		return gdhPrevisionnelDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdhPrevisionnelDebut(XMLGregorianCalendar newGdhPrevisionnelDebut) {
		XMLGregorianCalendar oldGdhPrevisionnelDebut = gdhPrevisionnelDebut;
		gdhPrevisionnelDebut = newGdhPrevisionnelDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_DEBUT, oldGdhPrevisionnelDebut, gdhPrevisionnelDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGdhPrevisionnelFin() {
		return gdhPrevisionnelFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdhPrevisionnelFin(XMLGregorianCalendar newGdhPrevisionnelFin) {
		XMLGregorianCalendar oldGdhPrevisionnelFin = gdhPrevisionnelFin;
		gdhPrevisionnelFin = newGdhPrevisionnelFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_FIN, oldGdhPrevisionnelFin, gdhPrevisionnelFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGdhReelDebut() {
		return gdhReelDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdhReelDebut(XMLGregorianCalendar newGdhReelDebut) {
		XMLGregorianCalendar oldGdhReelDebut = gdhReelDebut;
		gdhReelDebut = newGdhReelDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_DEBUT, oldGdhReelDebut, gdhReelDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGdhReelFin() {
		return gdhReelFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdhReelFin(XMLGregorianCalendar newGdhReelFin) {
		XMLGregorianCalendar oldGdhReelFin = gdhReelFin;
		gdhReelFin = newGdhReelFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_FIN, oldGdhReelFin, gdhReelFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentCommunication() {
		return documentCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentCommunication(String newDocumentCommunication) {
		String oldDocumentCommunication = documentCommunication;
		documentCommunication = newDocumentCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_COMMUNICATION, oldDocumentCommunication, documentCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentFaisabilite() {
		return documentFaisabilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentFaisabilite(String newDocumentFaisabilite) {
		String oldDocumentFaisabilite = documentFaisabilite;
		documentFaisabilite = newDocumentFaisabilite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_FAISABILITE, oldDocumentFaisabilite, documentFaisabilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCouleurRGB() {
		return couleurRGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurRGB(String newCouleurRGB) {
		String oldCouleurRGB = couleurRGB;
		couleurRGB = newCouleurRGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROJET_CIMIC__COULEUR_RGB, oldCouleurRGB, couleurRGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_PROJET_CIMIC__IDENTIFIANT:
				return getIdentifiant();
			case SchemaPackage.TYPE_PROJET_CIMIC__TYPE:
				return getType();
			case SchemaPackage.TYPE_PROJET_CIMIC__DOMAINE:
				return getDomaine();
			case SchemaPackage.TYPE_PROJET_CIMIC__ETAT_DEMANDE:
				return getEtatDemande();
			case SchemaPackage.TYPE_PROJET_CIMIC__ORGANISME_BENEFICIAIRE:
				return getOrganismeBeneficiaire();
			case SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_DEMANDE:
				return getOrigineDemande();
			case SchemaPackage.TYPE_PROJET_CIMIC__OBJECTIF:
				return getObjectif();
			case SchemaPackage.TYPE_PROJET_CIMIC__IMPACT:
				return getImpact();
			case SchemaPackage.TYPE_PROJET_CIMIC__INITIATIVE:
				return getInitiative();
			case SchemaPackage.TYPE_PROJET_CIMIC__SITUATION_DEMANDE:
				return getSituationDemande();
			case SchemaPackage.TYPE_PROJET_CIMIC__PILOTE:
				return getPilote();
			case SchemaPackage.TYPE_PROJET_CIMIC__PILOTE_ASSISTANT:
				return getPiloteAssistant();
			case SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_FONDS:
				return getOrigineFonds();
			case SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_DEVISE:
				return getBudgetDevise();
			case SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_MONTANT:
				return new Double(getBudgetMontant());
			case SchemaPackage.TYPE_PROJET_CIMIC__DEPENSE_MONTANT:
				return new Double(getDepenseMontant());
			case SchemaPackage.TYPE_PROJET_CIMIC__ETAT_TRAVAUX:
				return getEtatTravaux();
			case SchemaPackage.TYPE_PROJET_CIMIC__POURCENT_AVANCEMENT:
				return new Long(getPourcentAvancement());
			case SchemaPackage.TYPE_PROJET_CIMIC__LIEU:
				return getLieu();
			case SchemaPackage.TYPE_PROJET_CIMIC__MUNICIPALITE:
				return getMunicipalite();
			case SchemaPackage.TYPE_PROJET_CIMIC__NATION:
				return getNation();
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_DEBUT:
				return getGdhPrevisionnelDebut();
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_FIN:
				return getGdhPrevisionnelFin();
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_DEBUT:
				return getGdhReelDebut();
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_FIN:
				return getGdhReelFin();
			case SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_COMMUNICATION:
				return getDocumentCommunication();
			case SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_FAISABILITE:
				return getDocumentFaisabilite();
			case SchemaPackage.TYPE_PROJET_CIMIC__COULEUR_RGB:
				return getCouleurRGB();
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
			case SchemaPackage.TYPE_PROJET_CIMIC__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__TYPE:
				setType((TypeDictionaryDicoTypeProjetCimic)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__DOMAINE:
				setDomaine((TypeDictionaryDicoDomaineProjetCimic)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ETAT_DEMANDE:
				setEtatDemande((TypeDictionaryDicoEtatProjetCimic)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ORGANISME_BENEFICIAIRE:
				setOrganismeBeneficiaire((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_DEMANDE:
				setOrigineDemande((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__OBJECTIF:
				setObjectif((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__IMPACT:
				setImpact((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__INITIATIVE:
				setInitiative((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__SITUATION_DEMANDE:
				setSituationDemande((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__PILOTE:
				setPilote((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__PILOTE_ASSISTANT:
				setPiloteAssistant((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_FONDS:
				setOrigineFonds((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_DEVISE:
				setBudgetDevise((TypeDictionaryDicoDeviseProjetCimic)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_MONTANT:
				setBudgetMontant(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__DEPENSE_MONTANT:
				setDepenseMontant(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ETAT_TRAVAUX:
				setEtatTravaux((TypeDictionaryDicoEtatProjetCimic)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__POURCENT_AVANCEMENT:
				setPourcentAvancement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__LIEU:
				setLieu((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__MUNICIPALITE:
				setMunicipalite((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__NATION:
				setNation((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_DEBUT:
				setGdhPrevisionnelDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_FIN:
				setGdhPrevisionnelFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_DEBUT:
				setGdhReelDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_FIN:
				setGdhReelFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_COMMUNICATION:
				setDocumentCommunication((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_FAISABILITE:
				setDocumentFaisabilite((String)newValue);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__COULEUR_RGB:
				setCouleurRGB((String)newValue);
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
			case SchemaPackage.TYPE_PROJET_CIMIC__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__DOMAINE:
				unsetDomaine();
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ETAT_DEMANDE:
				unsetEtatDemande();
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ORGANISME_BENEFICIAIRE:
				setOrganismeBeneficiaire(ORGANISME_BENEFICIAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_DEMANDE:
				setOrigineDemande(ORIGINE_DEMANDE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__OBJECTIF:
				setObjectif(OBJECTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__IMPACT:
				setImpact(IMPACT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__INITIATIVE:
				setInitiative(INITIATIVE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__SITUATION_DEMANDE:
				setSituationDemande(SITUATION_DEMANDE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__PILOTE:
				setPilote(PILOTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__PILOTE_ASSISTANT:
				setPiloteAssistant(PILOTE_ASSISTANT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_FONDS:
				setOrigineFonds(ORIGINE_FONDS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_DEVISE:
				unsetBudgetDevise();
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_MONTANT:
				unsetBudgetMontant();
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__DEPENSE_MONTANT:
				unsetDepenseMontant();
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__ETAT_TRAVAUX:
				unsetEtatTravaux();
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__POURCENT_AVANCEMENT:
				unsetPourcentAvancement();
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__LIEU:
				setLieu(LIEU_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__MUNICIPALITE:
				setMunicipalite(MUNICIPALITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__NATION:
				unsetNation();
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_DEBUT:
				setGdhPrevisionnelDebut(GDH_PREVISIONNEL_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_FIN:
				setGdhPrevisionnelFin(GDH_PREVISIONNEL_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_DEBUT:
				setGdhReelDebut(GDH_REEL_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_FIN:
				setGdhReelFin(GDH_REEL_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_COMMUNICATION:
				setDocumentCommunication(DOCUMENT_COMMUNICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_FAISABILITE:
				setDocumentFaisabilite(DOCUMENT_FAISABILITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROJET_CIMIC__COULEUR_RGB:
				setCouleurRGB(COULEUR_RGB_EDEFAULT);
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
			case SchemaPackage.TYPE_PROJET_CIMIC__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case SchemaPackage.TYPE_PROJET_CIMIC__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_PROJET_CIMIC__DOMAINE:
				return isSetDomaine();
			case SchemaPackage.TYPE_PROJET_CIMIC__ETAT_DEMANDE:
				return isSetEtatDemande();
			case SchemaPackage.TYPE_PROJET_CIMIC__ORGANISME_BENEFICIAIRE:
				return ORGANISME_BENEFICIAIRE_EDEFAULT == null ? organismeBeneficiaire != null : !ORGANISME_BENEFICIAIRE_EDEFAULT.equals(organismeBeneficiaire);
			case SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_DEMANDE:
				return ORIGINE_DEMANDE_EDEFAULT == null ? origineDemande != null : !ORIGINE_DEMANDE_EDEFAULT.equals(origineDemande);
			case SchemaPackage.TYPE_PROJET_CIMIC__OBJECTIF:
				return OBJECTIF_EDEFAULT == null ? objectif != null : !OBJECTIF_EDEFAULT.equals(objectif);
			case SchemaPackage.TYPE_PROJET_CIMIC__IMPACT:
				return IMPACT_EDEFAULT == null ? impact != null : !IMPACT_EDEFAULT.equals(impact);
			case SchemaPackage.TYPE_PROJET_CIMIC__INITIATIVE:
				return INITIATIVE_EDEFAULT == null ? initiative != null : !INITIATIVE_EDEFAULT.equals(initiative);
			case SchemaPackage.TYPE_PROJET_CIMIC__SITUATION_DEMANDE:
				return SITUATION_DEMANDE_EDEFAULT == null ? situationDemande != null : !SITUATION_DEMANDE_EDEFAULT.equals(situationDemande);
			case SchemaPackage.TYPE_PROJET_CIMIC__PILOTE:
				return PILOTE_EDEFAULT == null ? pilote != null : !PILOTE_EDEFAULT.equals(pilote);
			case SchemaPackage.TYPE_PROJET_CIMIC__PILOTE_ASSISTANT:
				return PILOTE_ASSISTANT_EDEFAULT == null ? piloteAssistant != null : !PILOTE_ASSISTANT_EDEFAULT.equals(piloteAssistant);
			case SchemaPackage.TYPE_PROJET_CIMIC__ORIGINE_FONDS:
				return ORIGINE_FONDS_EDEFAULT == null ? origineFonds != null : !ORIGINE_FONDS_EDEFAULT.equals(origineFonds);
			case SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_DEVISE:
				return isSetBudgetDevise();
			case SchemaPackage.TYPE_PROJET_CIMIC__BUDGET_MONTANT:
				return isSetBudgetMontant();
			case SchemaPackage.TYPE_PROJET_CIMIC__DEPENSE_MONTANT:
				return isSetDepenseMontant();
			case SchemaPackage.TYPE_PROJET_CIMIC__ETAT_TRAVAUX:
				return isSetEtatTravaux();
			case SchemaPackage.TYPE_PROJET_CIMIC__POURCENT_AVANCEMENT:
				return isSetPourcentAvancement();
			case SchemaPackage.TYPE_PROJET_CIMIC__LIEU:
				return LIEU_EDEFAULT == null ? lieu != null : !LIEU_EDEFAULT.equals(lieu);
			case SchemaPackage.TYPE_PROJET_CIMIC__MUNICIPALITE:
				return MUNICIPALITE_EDEFAULT == null ? municipalite != null : !MUNICIPALITE_EDEFAULT.equals(municipalite);
			case SchemaPackage.TYPE_PROJET_CIMIC__NATION:
				return isSetNation();
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_DEBUT:
				return GDH_PREVISIONNEL_DEBUT_EDEFAULT == null ? gdhPrevisionnelDebut != null : !GDH_PREVISIONNEL_DEBUT_EDEFAULT.equals(gdhPrevisionnelDebut);
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_PREVISIONNEL_FIN:
				return GDH_PREVISIONNEL_FIN_EDEFAULT == null ? gdhPrevisionnelFin != null : !GDH_PREVISIONNEL_FIN_EDEFAULT.equals(gdhPrevisionnelFin);
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_DEBUT:
				return GDH_REEL_DEBUT_EDEFAULT == null ? gdhReelDebut != null : !GDH_REEL_DEBUT_EDEFAULT.equals(gdhReelDebut);
			case SchemaPackage.TYPE_PROJET_CIMIC__GDH_REEL_FIN:
				return GDH_REEL_FIN_EDEFAULT == null ? gdhReelFin != null : !GDH_REEL_FIN_EDEFAULT.equals(gdhReelFin);
			case SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_COMMUNICATION:
				return DOCUMENT_COMMUNICATION_EDEFAULT == null ? documentCommunication != null : !DOCUMENT_COMMUNICATION_EDEFAULT.equals(documentCommunication);
			case SchemaPackage.TYPE_PROJET_CIMIC__DOCUMENT_FAISABILITE:
				return DOCUMENT_FAISABILITE_EDEFAULT == null ? documentFaisabilite != null : !DOCUMENT_FAISABILITE_EDEFAULT.equals(documentFaisabilite);
			case SchemaPackage.TYPE_PROJET_CIMIC__COULEUR_RGB:
				return COULEUR_RGB_EDEFAULT == null ? couleurRGB != null : !COULEUR_RGB_EDEFAULT.equals(couleurRGB);
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
		result.append(" (identifiant: ");
		result.append(identifiant);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", domaine: ");
		if (domaineESet) result.append(domaine); else result.append("<unset>");
		result.append(", etatDemande: ");
		if (etatDemandeESet) result.append(etatDemande); else result.append("<unset>");
		result.append(", organismeBeneficiaire: ");
		result.append(organismeBeneficiaire);
		result.append(", origineDemande: ");
		result.append(origineDemande);
		result.append(", objectif: ");
		result.append(objectif);
		result.append(", impact: ");
		result.append(impact);
		result.append(", initiative: ");
		result.append(initiative);
		result.append(", situationDemande: ");
		result.append(situationDemande);
		result.append(", pilote: ");
		result.append(pilote);
		result.append(", piloteAssistant: ");
		result.append(piloteAssistant);
		result.append(", origineFonds: ");
		result.append(origineFonds);
		result.append(", budgetDevise: ");
		if (budgetDeviseESet) result.append(budgetDevise); else result.append("<unset>");
		result.append(", budgetMontant: ");
		if (budgetMontantESet) result.append(budgetMontant); else result.append("<unset>");
		result.append(", depenseMontant: ");
		if (depenseMontantESet) result.append(depenseMontant); else result.append("<unset>");
		result.append(", etatTravaux: ");
		if (etatTravauxESet) result.append(etatTravaux); else result.append("<unset>");
		result.append(", pourcentAvancement: ");
		if (pourcentAvancementESet) result.append(pourcentAvancement); else result.append("<unset>");
		result.append(", lieu: ");
		result.append(lieu);
		result.append(", municipalite: ");
		result.append(municipalite);
		result.append(", nation: ");
		if (nationESet) result.append(nation); else result.append("<unset>");
		result.append(", gdhPrevisionnelDebut: ");
		result.append(gdhPrevisionnelDebut);
		result.append(", gdhPrevisionnelFin: ");
		result.append(gdhPrevisionnelFin);
		result.append(", gdhReelDebut: ");
		result.append(gdhReelDebut);
		result.append(", gdhReelFin: ");
		result.append(gdhReelFin);
		result.append(", documentCommunication: ");
		result.append(documentCommunication);
		result.append(", documentFaisabilite: ");
		result.append(documentFaisabilite);
		result.append(", couleurRGB: ");
		result.append(couleurRGB);
		result.append(')');
		return result.toString();
	}

} //TypeProjetCimicImpl
