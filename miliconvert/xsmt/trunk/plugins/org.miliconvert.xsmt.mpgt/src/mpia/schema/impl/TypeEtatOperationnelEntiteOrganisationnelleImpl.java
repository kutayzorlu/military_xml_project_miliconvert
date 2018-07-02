/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeDoseAbsorbee;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiqueGroupeIndividus;
import mpia.schema.TypeDictionaryDicoEtatDeploiement;
import mpia.schema.TypeDictionaryDicoEtatOperationnel;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement;
import mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique;
import mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Entite Organisationnelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getFonctionPC <em>Fonction PC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEchelon <em>Echelon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getDisponibilite <em>Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getGDHDisponibilite <em>GDH Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEtatEngagement <em>Etat Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getGDHdebutActivation <em>GD Hdebut Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getGDHfinActivation <em>GD Hfin Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEtatFormation <em>Etat Formation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getAutreEtatFormation <em>Autre Etat Formation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEtatDeploiement <em>Etat Deploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getAutreDeploiement <em>Autre Deploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEtatCapteur <em>Etat Capteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getTempsReponse <em>Temps Reponse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEntrainement <em>Entrainement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getRenforcement <em>Renforcement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#isReserve <em>Reserve</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getConsigneTir <em>Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getProtectionNRBC <em>Protection NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getDoseRadiation <em>Dose Radiation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getNiveauAlerte <em>Niveau Alerte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getStatutLogistique <em>Statut Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEtatPersonnel <em>Etat Personnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getFatiguePersonnel <em>Fatigue Personnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEtatEquipements <em>Etat Equipements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEtatMunitions <em>Etat Munitions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getEtatCarburants <em>Etat Carburants</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getPointRendezVous <em>Point Rendez Vous</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getPointsOuPCFleche <em>Points Ou PC Fleche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelEntiteOrganisationnelleImpl#getAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus <em>APour Caracteristique Groupe Individus Caracteristique Groupe Individus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelEntiteOrganisationnelleImpl extends TypeEtatOperationnelImpl implements TypeEtatOperationnelEntiteOrganisationnelle {
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
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat QUALIFICATIF_ETAT_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat.DSTRYD;

	/**
	 * The cached value of the '{@link #getQualificatifEtat() <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;

	/**
	 * This is true if the Qualificatif Etat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifEtatESet;

	/**
	 * The default value of the '{@link #getFonctionPC() <em>Fonction PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionPC()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC FONCTION_PC_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC.ADVNCP;

	/**
	 * The cached value of the '{@link #getFonctionPC() <em>Fonction PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionPC()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC fonctionPC = FONCTION_PC_EDEFAULT;

	/**
	 * This is true if the Fonction PC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fonctionPCESet;

	/**
	 * The default value of the '{@link #getEchelon() <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelon()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon ECHELON_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon._1;

	/**
	 * The cached value of the '{@link #getEchelon() <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelon()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon echelon = ECHELON_EDEFAULT;

	/**
	 * This is true if the Echelon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelonESet;

	/**
	 * The default value of the '{@link #getDisponibilite() <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite DISPONIBILITE_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite.AFT30D;

	/**
	 * The cached value of the '{@link #getDisponibilite() <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite disponibilite = DISPONIBILITE_EDEFAULT;

	/**
	 * This is true if the Disponibilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteESet;

	/**
	 * The default value of the '{@link #getGDHDisponibilite() <em>GDH Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_DISPONIBILITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHDisponibilite() <em>GDH Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHDisponibilite = GDH_DISPONIBILITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatEngagement() <em>Etat Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatEngagement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement ETAT_ENGAGEMENT_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement.COMM;

	/**
	 * The cached value of the '{@link #getEtatEngagement() <em>Etat Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatEngagement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement etatEngagement = ETAT_ENGAGEMENT_EDEFAULT;

	/**
	 * This is true if the Etat Engagement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatEngagementESet;

	/**
	 * The default value of the '{@link #getActivation() <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation ACTIVATION_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation.INACT;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation activation = ACTIVATION_EDEFAULT;

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
	 * The default value of the '{@link #getEtatFormation() <em>Etat Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatFormation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation ETAT_FORMATION_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation.CONT;

	/**
	 * The cached value of the '{@link #getEtatFormation() <em>Etat Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatFormation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation etatFormation = ETAT_FORMATION_EDEFAULT;

	/**
	 * This is true if the Etat Formation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatFormationESet;

	/**
	 * The default value of the '{@link #getAutreEtatFormation() <em>Autre Etat Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEtatFormation()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_ETAT_FORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreEtatFormation() <em>Autre Etat Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEtatFormation()
	 * @generated
	 * @ordered
	 */
	protected String autreEtatFormation = AUTRE_ETAT_FORMATION_EDEFAULT;

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
	 * The default value of the '{@link #getAutreDeploiement() <em>Autre Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreDeploiement()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_DEPLOIEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreDeploiement() <em>Autre Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreDeploiement()
	 * @generated
	 * @ordered
	 */
	protected String autreDeploiement = AUTRE_DEPLOIEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatCapteur() <em>Etat Capteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatCapteur()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAT_CAPTEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtatCapteur() <em>Etat Capteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatCapteur()
	 * @generated
	 * @ordered
	 */
	protected String etatCapteur = ETAT_CAPTEUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTempsReponse() <em>Temps Reponse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsReponse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree tempsReponse;

	/**
	 * The default value of the '{@link #getEntrainement() <em>Entrainement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrainement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement ENTRAINEMENT_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement.AMBER;

	/**
	 * The cached value of the '{@link #getEntrainement() <em>Entrainement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrainement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement entrainement = ENTRAINEMENT_EDEFAULT;

	/**
	 * This is true if the Entrainement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entrainementESet;

	/**
	 * The default value of the '{@link #getRenforcement() <em>Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenforcement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement RENFORCEMENT_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement.DETD;

	/**
	 * The cached value of the '{@link #getRenforcement() <em>Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenforcement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement renforcement = RENFORCEMENT_EDEFAULT;

	/**
	 * This is true if the Renforcement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean renforcementESet;

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
	 * The default value of the '{@link #getConsigneTir() <em>Consigne Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir CONSIGNE_TIR_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir.HLDFIR;

	/**
	 * The cached value of the '{@link #getConsigneTir() <em>Consigne Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir consigneTir = CONSIGNE_TIR_EDEFAULT;

	/**
	 * This is true if the Consigne Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consigneTirESet;

	/**
	 * The default value of the '{@link #getProtectionNRBC() <em>Protection NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionNRBC()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC PROTECTION_NRBC_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC.MOPPRY;

	/**
	 * The cached value of the '{@link #getProtectionNRBC() <em>Protection NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionNRBC()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC protectionNRBC = PROTECTION_NRBC_EDEFAULT;

	/**
	 * This is true if the Protection NRBC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectionNRBCESet;

	/**
	 * The cached value of the '{@link #getDoseRadiation() <em>Dose Radiation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseRadiation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDoseAbsorbee doseRadiation;

	/**
	 * The default value of the '{@link #getNiveauAlerte() <em>Niveau Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauAlerte()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte NIVEAU_ALERTE_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte.BTLSTN;

	/**
	 * The cached value of the '{@link #getNiveauAlerte() <em>Niveau Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauAlerte()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte niveauAlerte = NIVEAU_ALERTE_EDEFAULT;

	/**
	 * This is true if the Niveau Alerte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauAlerteESet;

	/**
	 * The default value of the '{@link #getStatutLogistique() <em>Statut Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatutLogistique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique STATUT_LOGISTIQUE_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique.SIERRA;

	/**
	 * The cached value of the '{@link #getStatutLogistique() <em>Statut Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatutLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique statutLogistique = STATUT_LOGISTIQUE_EDEFAULT;

	/**
	 * This is true if the Statut Logistique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statutLogistiqueESet;

	/**
	 * The default value of the '{@link #getEtatPersonnel() <em>Etat Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPersonnel()
	 * @generated
	 * @ordered
	 */
	protected static final double ETAT_PERSONNEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEtatPersonnel() <em>Etat Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPersonnel()
	 * @generated
	 * @ordered
	 */
	protected double etatPersonnel = ETAT_PERSONNEL_EDEFAULT;

	/**
	 * This is true if the Etat Personnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatPersonnelESet;

	/**
	 * The default value of the '{@link #getFatiguePersonnel() <em>Fatigue Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFatiguePersonnel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel FATIGUE_PERSONNEL_EDEFAULT = TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel._1;

	/**
	 * The cached value of the '{@link #getFatiguePersonnel() <em>Fatigue Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFatiguePersonnel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel fatiguePersonnel = FATIGUE_PERSONNEL_EDEFAULT;

	/**
	 * This is true if the Fatigue Personnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fatiguePersonnelESet;

	/**
	 * The default value of the '{@link #getEtatEquipements() <em>Etat Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatEquipements()
	 * @generated
	 * @ordered
	 */
	protected static final double ETAT_EQUIPEMENTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEtatEquipements() <em>Etat Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatEquipements()
	 * @generated
	 * @ordered
	 */
	protected double etatEquipements = ETAT_EQUIPEMENTS_EDEFAULT;

	/**
	 * This is true if the Etat Equipements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatEquipementsESet;

	/**
	 * The default value of the '{@link #getEtatMunitions() <em>Etat Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatMunitions()
	 * @generated
	 * @ordered
	 */
	protected static final double ETAT_MUNITIONS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEtatMunitions() <em>Etat Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatMunitions()
	 * @generated
	 * @ordered
	 */
	protected double etatMunitions = ETAT_MUNITIONS_EDEFAULT;

	/**
	 * This is true if the Etat Munitions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatMunitionsESet;

	/**
	 * The default value of the '{@link #getEtatCarburants() <em>Etat Carburants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatCarburants()
	 * @generated
	 * @ordered
	 */
	protected static final double ETAT_CARBURANTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEtatCarburants() <em>Etat Carburants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatCarburants()
	 * @generated
	 * @ordered
	 */
	protected double etatCarburants = ETAT_CARBURANTS_EDEFAULT;

	/**
	 * This is true if the Etat Carburants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatCarburantsESet;

	/**
	 * The default value of the '{@link #getPointRendezVous() <em>Point Rendez Vous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointRendezVous()
	 * @generated
	 * @ordered
	 */
	protected static final String POINT_RENDEZ_VOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointRendezVous() <em>Point Rendez Vous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointRendezVous()
	 * @generated
	 * @ordered
	 */
	protected String pointRendezVous = POINT_RENDEZ_VOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointsOuPCFleche() <em>Points Ou PC Fleche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsOuPCFleche()
	 * @generated
	 * @ordered
	 */
	protected static final String POINTS_OU_PC_FLECHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointsOuPCFleche() <em>Points Ou PC Fleche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsOuPCFleche()
	 * @generated
	 * @ordered
	 */
	protected String pointsOuPCFleche = POINTS_OU_PC_FLECHE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus() <em>APour Caracteristique Groupe Individus Caracteristique Groupe Individus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus()
	 * @generated
	 * @ordered
	 */
	protected TypeCaracteristiqueGroupeIndividus aPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelEntiteOrganisationnelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelEntiteOrganisationnelle();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_OPERATIONNEL, oldEtatOperationnel, etatOperationnel, !oldEtatOperationnelESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_OPERATIONNEL, oldEtatOperationnel, ETAT_OPERATIONNEL_EDEFAULT, oldEtatOperationnelESet));
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
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat getQualificatifEtat() {
		return qualificatifEtat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat newQualificatifEtat) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		qualificatifEtat = newQualificatifEtat == null ? QUALIFICATIF_ETAT_EDEFAULT : newQualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__QUALIFICATIF_ETAT, oldQualificatifEtat, qualificatifEtat, !oldQualificatifEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifEtat() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;
		qualificatifEtatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__QUALIFICATIF_ETAT, oldQualificatifEtat, QUALIFICATIF_ETAT_EDEFAULT, oldQualificatifEtatESet));
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
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC getFonctionPC() {
		return fonctionPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionPC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC newFonctionPC) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC oldFonctionPC = fonctionPC;
		fonctionPC = newFonctionPC == null ? FONCTION_PC_EDEFAULT : newFonctionPC;
		boolean oldFonctionPCESet = fonctionPCESet;
		fonctionPCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FONCTION_PC, oldFonctionPC, fonctionPC, !oldFonctionPCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFonctionPC() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC oldFonctionPC = fonctionPC;
		boolean oldFonctionPCESet = fonctionPCESet;
		fonctionPC = FONCTION_PC_EDEFAULT;
		fonctionPCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FONCTION_PC, oldFonctionPC, FONCTION_PC_EDEFAULT, oldFonctionPCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFonctionPC() {
		return fonctionPCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon getEchelon() {
		return echelon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelon(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon newEchelon) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon oldEchelon = echelon;
		echelon = newEchelon == null ? ECHELON_EDEFAULT : newEchelon;
		boolean oldEchelonESet = echelonESet;
		echelonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ECHELON, oldEchelon, echelon, !oldEchelonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelon() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon oldEchelon = echelon;
		boolean oldEchelonESet = echelonESet;
		echelon = ECHELON_EDEFAULT;
		echelonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ECHELON, oldEchelon, ECHELON_EDEFAULT, oldEchelonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelon() {
		return echelonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite getDisponibilite() {
		return disponibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibilite(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite newDisponibilite) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite oldDisponibilite = disponibilite;
		disponibilite = newDisponibilite == null ? DISPONIBILITE_EDEFAULT : newDisponibilite;
		boolean oldDisponibiliteESet = disponibiliteESet;
		disponibiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DISPONIBILITE, oldDisponibilite, disponibilite, !oldDisponibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibilite() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite oldDisponibilite = disponibilite;
		boolean oldDisponibiliteESet = disponibiliteESet;
		disponibilite = DISPONIBILITE_EDEFAULT;
		disponibiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DISPONIBILITE, oldDisponibilite, DISPONIBILITE_EDEFAULT, oldDisponibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibilite() {
		return disponibiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHDisponibilite() {
		return gDHDisponibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHDisponibilite(XMLGregorianCalendar newGDHDisponibilite) {
		XMLGregorianCalendar oldGDHDisponibilite = gDHDisponibilite;
		gDHDisponibilite = newGDHDisponibilite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GDH_DISPONIBILITE, oldGDHDisponibilite, gDHDisponibilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement getEtatEngagement() {
		return etatEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatEngagement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement newEtatEngagement) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement oldEtatEngagement = etatEngagement;
		etatEngagement = newEtatEngagement == null ? ETAT_ENGAGEMENT_EDEFAULT : newEtatEngagement;
		boolean oldEtatEngagementESet = etatEngagementESet;
		etatEngagementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_ENGAGEMENT, oldEtatEngagement, etatEngagement, !oldEtatEngagementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatEngagement() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement oldEtatEngagement = etatEngagement;
		boolean oldEtatEngagementESet = etatEngagementESet;
		etatEngagement = ETAT_ENGAGEMENT_EDEFAULT;
		etatEngagementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_ENGAGEMENT, oldEtatEngagement, ETAT_ENGAGEMENT_EDEFAULT, oldEtatEngagementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatEngagement() {
		return etatEngagementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation getActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation newActivation) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation oldActivation = activation;
		activation = newActivation == null ? ACTIVATION_EDEFAULT : newActivation;
		boolean oldActivationESet = activationESet;
		activationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ACTIVATION, oldActivation, activation, !oldActivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivation() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation oldActivation = activation;
		boolean oldActivationESet = activationESet;
		activation = ACTIVATION_EDEFAULT;
		activationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ACTIVATION, oldActivation, ACTIVATION_EDEFAULT, oldActivationESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HDEBUT_ACTIVATION, oldGDHdebutActivation, gDHdebutActivation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HFIN_ACTIVATION, oldGDHfinActivation, gDHfinActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation getEtatFormation() {
		return etatFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatFormation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation newEtatFormation) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation oldEtatFormation = etatFormation;
		etatFormation = newEtatFormation == null ? ETAT_FORMATION_EDEFAULT : newEtatFormation;
		boolean oldEtatFormationESet = etatFormationESet;
		etatFormationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_FORMATION, oldEtatFormation, etatFormation, !oldEtatFormationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatFormation() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation oldEtatFormation = etatFormation;
		boolean oldEtatFormationESet = etatFormationESet;
		etatFormation = ETAT_FORMATION_EDEFAULT;
		etatFormationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_FORMATION, oldEtatFormation, ETAT_FORMATION_EDEFAULT, oldEtatFormationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatFormation() {
		return etatFormationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreEtatFormation() {
		return autreEtatFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreEtatFormation(String newAutreEtatFormation) {
		String oldAutreEtatFormation = autreEtatFormation;
		autreEtatFormation = newAutreEtatFormation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_ETAT_FORMATION, oldAutreEtatFormation, autreEtatFormation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_DEPLOIEMENT, oldEtatDeploiement, etatDeploiement, !oldEtatDeploiementESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_DEPLOIEMENT, oldEtatDeploiement, ETAT_DEPLOIEMENT_EDEFAULT, oldEtatDeploiementESet));
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
	public String getAutreDeploiement() {
		return autreDeploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreDeploiement(String newAutreDeploiement) {
		String oldAutreDeploiement = autreDeploiement;
		autreDeploiement = newAutreDeploiement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_DEPLOIEMENT, oldAutreDeploiement, autreDeploiement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtatCapteur() {
		return etatCapteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatCapteur(String newEtatCapteur) {
		String oldEtatCapteur = etatCapteur;
		etatCapteur = newEtatCapteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CAPTEUR, oldEtatCapteur, etatCapteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getTempsReponse() {
		return tempsReponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTempsReponse(TypeDataTypeDuree newTempsReponse, NotificationChain msgs) {
		TypeDataTypeDuree oldTempsReponse = tempsReponse;
		tempsReponse = newTempsReponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__TEMPS_REPONSE, oldTempsReponse, newTempsReponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempsReponse(TypeDataTypeDuree newTempsReponse) {
		if (newTempsReponse != tempsReponse) {
			NotificationChain msgs = null;
			if (tempsReponse != null)
				msgs = ((InternalEObject)tempsReponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__TEMPS_REPONSE, null, msgs);
			if (newTempsReponse != null)
				msgs = ((InternalEObject)newTempsReponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__TEMPS_REPONSE, null, msgs);
			msgs = basicSetTempsReponse(newTempsReponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__TEMPS_REPONSE, newTempsReponse, newTempsReponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement getEntrainement() {
		return entrainement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrainement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement newEntrainement) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement oldEntrainement = entrainement;
		entrainement = newEntrainement == null ? ENTRAINEMENT_EDEFAULT : newEntrainement;
		boolean oldEntrainementESet = entrainementESet;
		entrainementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ENTRAINEMENT, oldEntrainement, entrainement, !oldEntrainementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEntrainement() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement oldEntrainement = entrainement;
		boolean oldEntrainementESet = entrainementESet;
		entrainement = ENTRAINEMENT_EDEFAULT;
		entrainementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ENTRAINEMENT, oldEntrainement, ENTRAINEMENT_EDEFAULT, oldEntrainementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEntrainement() {
		return entrainementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement getRenforcement() {
		return renforcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenforcement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement newRenforcement) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement oldRenforcement = renforcement;
		renforcement = newRenforcement == null ? RENFORCEMENT_EDEFAULT : newRenforcement;
		boolean oldRenforcementESet = renforcementESet;
		renforcementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RENFORCEMENT, oldRenforcement, renforcement, !oldRenforcementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRenforcement() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement oldRenforcement = renforcement;
		boolean oldRenforcementESet = renforcementESet;
		renforcement = RENFORCEMENT_EDEFAULT;
		renforcementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RENFORCEMENT, oldRenforcement, RENFORCEMENT_EDEFAULT, oldRenforcementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRenforcement() {
		return renforcementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RESERVE, oldReserve, reserve, !oldReserveESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RESERVE, oldReserve, RESERVE_EDEFAULT, oldReserveESet));
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
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir getConsigneTir() {
		return consigneTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigneTir(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir newConsigneTir) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir oldConsigneTir = consigneTir;
		consigneTir = newConsigneTir == null ? CONSIGNE_TIR_EDEFAULT : newConsigneTir;
		boolean oldConsigneTirESet = consigneTirESet;
		consigneTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__CONSIGNE_TIR, oldConsigneTir, consigneTir, !oldConsigneTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsigneTir() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir oldConsigneTir = consigneTir;
		boolean oldConsigneTirESet = consigneTirESet;
		consigneTir = CONSIGNE_TIR_EDEFAULT;
		consigneTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__CONSIGNE_TIR, oldConsigneTir, CONSIGNE_TIR_EDEFAULT, oldConsigneTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsigneTir() {
		return consigneTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC getProtectionNRBC() {
		return protectionNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionNRBC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC newProtectionNRBC) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC oldProtectionNRBC = protectionNRBC;
		protectionNRBC = newProtectionNRBC == null ? PROTECTION_NRBC_EDEFAULT : newProtectionNRBC;
		boolean oldProtectionNRBCESet = protectionNRBCESet;
		protectionNRBCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__PROTECTION_NRBC, oldProtectionNRBC, protectionNRBC, !oldProtectionNRBCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtectionNRBC() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC oldProtectionNRBC = protectionNRBC;
		boolean oldProtectionNRBCESet = protectionNRBCESet;
		protectionNRBC = PROTECTION_NRBC_EDEFAULT;
		protectionNRBCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__PROTECTION_NRBC, oldProtectionNRBC, PROTECTION_NRBC_EDEFAULT, oldProtectionNRBCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtectionNRBC() {
		return protectionNRBCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDoseAbsorbee getDoseRadiation() {
		return doseRadiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseRadiation(TypeDataTypeDoseAbsorbee newDoseRadiation, NotificationChain msgs) {
		TypeDataTypeDoseAbsorbee oldDoseRadiation = doseRadiation;
		doseRadiation = newDoseRadiation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DOSE_RADIATION, oldDoseRadiation, newDoseRadiation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseRadiation(TypeDataTypeDoseAbsorbee newDoseRadiation) {
		if (newDoseRadiation != doseRadiation) {
			NotificationChain msgs = null;
			if (doseRadiation != null)
				msgs = ((InternalEObject)doseRadiation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DOSE_RADIATION, null, msgs);
			if (newDoseRadiation != null)
				msgs = ((InternalEObject)newDoseRadiation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DOSE_RADIATION, null, msgs);
			msgs = basicSetDoseRadiation(newDoseRadiation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DOSE_RADIATION, newDoseRadiation, newDoseRadiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte getNiveauAlerte() {
		return niveauAlerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauAlerte(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte newNiveauAlerte) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte oldNiveauAlerte = niveauAlerte;
		niveauAlerte = newNiveauAlerte == null ? NIVEAU_ALERTE_EDEFAULT : newNiveauAlerte;
		boolean oldNiveauAlerteESet = niveauAlerteESet;
		niveauAlerteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__NIVEAU_ALERTE, oldNiveauAlerte, niveauAlerte, !oldNiveauAlerteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauAlerte() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte oldNiveauAlerte = niveauAlerte;
		boolean oldNiveauAlerteESet = niveauAlerteESet;
		niveauAlerte = NIVEAU_ALERTE_EDEFAULT;
		niveauAlerteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__NIVEAU_ALERTE, oldNiveauAlerte, NIVEAU_ALERTE_EDEFAULT, oldNiveauAlerteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauAlerte() {
		return niveauAlerteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique getStatutLogistique() {
		return statutLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatutLogistique(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique newStatutLogistique) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique oldStatutLogistique = statutLogistique;
		statutLogistique = newStatutLogistique == null ? STATUT_LOGISTIQUE_EDEFAULT : newStatutLogistique;
		boolean oldStatutLogistiqueESet = statutLogistiqueESet;
		statutLogistiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__STATUT_LOGISTIQUE, oldStatutLogistique, statutLogistique, !oldStatutLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatutLogistique() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique oldStatutLogistique = statutLogistique;
		boolean oldStatutLogistiqueESet = statutLogistiqueESet;
		statutLogistique = STATUT_LOGISTIQUE_EDEFAULT;
		statutLogistiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__STATUT_LOGISTIQUE, oldStatutLogistique, STATUT_LOGISTIQUE_EDEFAULT, oldStatutLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatutLogistique() {
		return statutLogistiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEtatPersonnel() {
		return etatPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatPersonnel(double newEtatPersonnel) {
		double oldEtatPersonnel = etatPersonnel;
		etatPersonnel = newEtatPersonnel;
		boolean oldEtatPersonnelESet = etatPersonnelESet;
		etatPersonnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_PERSONNEL, oldEtatPersonnel, etatPersonnel, !oldEtatPersonnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatPersonnel() {
		double oldEtatPersonnel = etatPersonnel;
		boolean oldEtatPersonnelESet = etatPersonnelESet;
		etatPersonnel = ETAT_PERSONNEL_EDEFAULT;
		etatPersonnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_PERSONNEL, oldEtatPersonnel, ETAT_PERSONNEL_EDEFAULT, oldEtatPersonnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatPersonnel() {
		return etatPersonnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel getFatiguePersonnel() {
		return fatiguePersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFatiguePersonnel(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel newFatiguePersonnel) {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel oldFatiguePersonnel = fatiguePersonnel;
		fatiguePersonnel = newFatiguePersonnel == null ? FATIGUE_PERSONNEL_EDEFAULT : newFatiguePersonnel;
		boolean oldFatiguePersonnelESet = fatiguePersonnelESet;
		fatiguePersonnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FATIGUE_PERSONNEL, oldFatiguePersonnel, fatiguePersonnel, !oldFatiguePersonnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFatiguePersonnel() {
		TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel oldFatiguePersonnel = fatiguePersonnel;
		boolean oldFatiguePersonnelESet = fatiguePersonnelESet;
		fatiguePersonnel = FATIGUE_PERSONNEL_EDEFAULT;
		fatiguePersonnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FATIGUE_PERSONNEL, oldFatiguePersonnel, FATIGUE_PERSONNEL_EDEFAULT, oldFatiguePersonnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFatiguePersonnel() {
		return fatiguePersonnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEtatEquipements() {
		return etatEquipements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatEquipements(double newEtatEquipements) {
		double oldEtatEquipements = etatEquipements;
		etatEquipements = newEtatEquipements;
		boolean oldEtatEquipementsESet = etatEquipementsESet;
		etatEquipementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_EQUIPEMENTS, oldEtatEquipements, etatEquipements, !oldEtatEquipementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatEquipements() {
		double oldEtatEquipements = etatEquipements;
		boolean oldEtatEquipementsESet = etatEquipementsESet;
		etatEquipements = ETAT_EQUIPEMENTS_EDEFAULT;
		etatEquipementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_EQUIPEMENTS, oldEtatEquipements, ETAT_EQUIPEMENTS_EDEFAULT, oldEtatEquipementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatEquipements() {
		return etatEquipementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEtatMunitions() {
		return etatMunitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatMunitions(double newEtatMunitions) {
		double oldEtatMunitions = etatMunitions;
		etatMunitions = newEtatMunitions;
		boolean oldEtatMunitionsESet = etatMunitionsESet;
		etatMunitionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_MUNITIONS, oldEtatMunitions, etatMunitions, !oldEtatMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatMunitions() {
		double oldEtatMunitions = etatMunitions;
		boolean oldEtatMunitionsESet = etatMunitionsESet;
		etatMunitions = ETAT_MUNITIONS_EDEFAULT;
		etatMunitionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_MUNITIONS, oldEtatMunitions, ETAT_MUNITIONS_EDEFAULT, oldEtatMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatMunitions() {
		return etatMunitionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEtatCarburants() {
		return etatCarburants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatCarburants(double newEtatCarburants) {
		double oldEtatCarburants = etatCarburants;
		etatCarburants = newEtatCarburants;
		boolean oldEtatCarburantsESet = etatCarburantsESet;
		etatCarburantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CARBURANTS, oldEtatCarburants, etatCarburants, !oldEtatCarburantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatCarburants() {
		double oldEtatCarburants = etatCarburants;
		boolean oldEtatCarburantsESet = etatCarburantsESet;
		etatCarburants = ETAT_CARBURANTS_EDEFAULT;
		etatCarburantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CARBURANTS, oldEtatCarburants, ETAT_CARBURANTS_EDEFAULT, oldEtatCarburantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatCarburants() {
		return etatCarburantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointRendezVous() {
		return pointRendezVous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointRendezVous(String newPointRendezVous) {
		String oldPointRendezVous = pointRendezVous;
		pointRendezVous = newPointRendezVous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINT_RENDEZ_VOUS, oldPointRendezVous, pointRendezVous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointsOuPCFleche() {
		return pointsOuPCFleche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsOuPCFleche(String newPointsOuPCFleche) {
		String oldPointsOuPCFleche = pointsOuPCFleche;
		pointsOuPCFleche = newPointsOuPCFleche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINTS_OU_PC_FLECHE, oldPointsOuPCFleche, pointsOuPCFleche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCaracteristiqueGroupeIndividus getAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus() {
		return aPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus(TypeCaracteristiqueGroupeIndividus newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus, NotificationChain msgs) {
		TypeCaracteristiqueGroupeIndividus oldAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus = aPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus;
		aPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus = newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__APOUR_CARACTERISTIQUE_GROUPE_INDIVIDUS_CARACTERISTIQUE_GROUPE_INDIVIDUS, oldAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus, newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus(TypeCaracteristiqueGroupeIndividus newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus) {
		if (newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus != aPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus) {
			NotificationChain msgs = null;
			if (aPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus != null)
				msgs = ((InternalEObject)aPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__APOUR_CARACTERISTIQUE_GROUPE_INDIVIDUS_CARACTERISTIQUE_GROUPE_INDIVIDUS, null, msgs);
			if (newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus != null)
				msgs = ((InternalEObject)newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__APOUR_CARACTERISTIQUE_GROUPE_INDIVIDUS_CARACTERISTIQUE_GROUPE_INDIVIDUS, null, msgs);
			msgs = basicSetAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus(newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__APOUR_CARACTERISTIQUE_GROUPE_INDIVIDUS_CARACTERISTIQUE_GROUPE_INDIVIDUS, newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus, newAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__TEMPS_REPONSE:
				return basicSetTempsReponse(null, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DOSE_RADIATION:
				return basicSetDoseRadiation(null, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__APOUR_CARACTERISTIQUE_GROUPE_INDIVIDUS_CARACTERISTIQUE_GROUPE_INDIVIDUS:
				return basicSetAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_OPERATIONNEL:
				return getEtatOperationnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__QUALIFICATIF_ETAT:
				return getQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FONCTION_PC:
				return getFonctionPC();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ECHELON:
				return getEchelon();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DISPONIBILITE:
				return getDisponibilite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GDH_DISPONIBILITE:
				return getGDHDisponibilite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_ENGAGEMENT:
				return getEtatEngagement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ACTIVATION:
				return getActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HDEBUT_ACTIVATION:
				return getGDHdebutActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HFIN_ACTIVATION:
				return getGDHfinActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_FORMATION:
				return getEtatFormation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_ETAT_FORMATION:
				return getAutreEtatFormation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_DEPLOIEMENT:
				return getEtatDeploiement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_DEPLOIEMENT:
				return getAutreDeploiement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CAPTEUR:
				return getEtatCapteur();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__TEMPS_REPONSE:
				return getTempsReponse();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ENTRAINEMENT:
				return getEntrainement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RENFORCEMENT:
				return getRenforcement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RESERVE:
				return isReserve() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__CONSIGNE_TIR:
				return getConsigneTir();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__PROTECTION_NRBC:
				return getProtectionNRBC();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DOSE_RADIATION:
				return getDoseRadiation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__NIVEAU_ALERTE:
				return getNiveauAlerte();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__STATUT_LOGISTIQUE:
				return getStatutLogistique();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_PERSONNEL:
				return new Double(getEtatPersonnel());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FATIGUE_PERSONNEL:
				return getFatiguePersonnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_EQUIPEMENTS:
				return new Double(getEtatEquipements());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_MUNITIONS:
				return new Double(getEtatMunitions());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CARBURANTS:
				return new Double(getEtatCarburants());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINT_RENDEZ_VOUS:
				return getPointRendezVous();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINTS_OU_PC_FLECHE:
				return getPointsOuPCFleche();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__APOUR_CARACTERISTIQUE_GROUPE_INDIVIDUS_CARACTERISTIQUE_GROUPE_INDIVIDUS:
				return getAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_OPERATIONNEL:
				setEtatOperationnel((TypeDictionaryDicoEtatOperationnel)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__QUALIFICATIF_ETAT:
				setQualificatifEtat((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FONCTION_PC:
				setFonctionPC((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ECHELON:
				setEchelon((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DISPONIBILITE:
				setDisponibilite((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GDH_DISPONIBILITE:
				setGDHDisponibilite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_ENGAGEMENT:
				setEtatEngagement((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ACTIVATION:
				setActivation((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HDEBUT_ACTIVATION:
				setGDHdebutActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HFIN_ACTIVATION:
				setGDHfinActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_FORMATION:
				setEtatFormation((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_ETAT_FORMATION:
				setAutreEtatFormation((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_DEPLOIEMENT:
				setEtatDeploiement((TypeDictionaryDicoEtatDeploiement)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_DEPLOIEMENT:
				setAutreDeploiement((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CAPTEUR:
				setEtatCapteur((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__TEMPS_REPONSE:
				setTempsReponse((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ENTRAINEMENT:
				setEntrainement((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RENFORCEMENT:
				setRenforcement((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RESERVE:
				setReserve(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__CONSIGNE_TIR:
				setConsigneTir((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__PROTECTION_NRBC:
				setProtectionNRBC((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DOSE_RADIATION:
				setDoseRadiation((TypeDataTypeDoseAbsorbee)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__NIVEAU_ALERTE:
				setNiveauAlerte((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__STATUT_LOGISTIQUE:
				setStatutLogistique((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_PERSONNEL:
				setEtatPersonnel(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FATIGUE_PERSONNEL:
				setFatiguePersonnel((TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_EQUIPEMENTS:
				setEtatEquipements(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_MUNITIONS:
				setEtatMunitions(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CARBURANTS:
				setEtatCarburants(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINT_RENDEZ_VOUS:
				setPointRendezVous((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINTS_OU_PC_FLECHE:
				setPointsOuPCFleche((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__APOUR_CARACTERISTIQUE_GROUPE_INDIVIDUS_CARACTERISTIQUE_GROUPE_INDIVIDUS:
				setAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus((TypeCaracteristiqueGroupeIndividus)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_OPERATIONNEL:
				unsetEtatOperationnel();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__QUALIFICATIF_ETAT:
				unsetQualificatifEtat();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FONCTION_PC:
				unsetFonctionPC();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ECHELON:
				unsetEchelon();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DISPONIBILITE:
				unsetDisponibilite();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GDH_DISPONIBILITE:
				setGDHDisponibilite(GDH_DISPONIBILITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_ENGAGEMENT:
				unsetEtatEngagement();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ACTIVATION:
				unsetActivation();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HDEBUT_ACTIVATION:
				setGDHdebutActivation(GD_HDEBUT_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HFIN_ACTIVATION:
				setGDHfinActivation(GD_HFIN_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_FORMATION:
				unsetEtatFormation();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_ETAT_FORMATION:
				setAutreEtatFormation(AUTRE_ETAT_FORMATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_DEPLOIEMENT:
				unsetEtatDeploiement();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_DEPLOIEMENT:
				setAutreDeploiement(AUTRE_DEPLOIEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CAPTEUR:
				setEtatCapteur(ETAT_CAPTEUR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__TEMPS_REPONSE:
				setTempsReponse((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ENTRAINEMENT:
				unsetEntrainement();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RENFORCEMENT:
				unsetRenforcement();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RESERVE:
				unsetReserve();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__CONSIGNE_TIR:
				unsetConsigneTir();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__PROTECTION_NRBC:
				unsetProtectionNRBC();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DOSE_RADIATION:
				setDoseRadiation((TypeDataTypeDoseAbsorbee)null);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__NIVEAU_ALERTE:
				unsetNiveauAlerte();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__STATUT_LOGISTIQUE:
				unsetStatutLogistique();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_PERSONNEL:
				unsetEtatPersonnel();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FATIGUE_PERSONNEL:
				unsetFatiguePersonnel();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_EQUIPEMENTS:
				unsetEtatEquipements();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_MUNITIONS:
				unsetEtatMunitions();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CARBURANTS:
				unsetEtatCarburants();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINT_RENDEZ_VOUS:
				setPointRendezVous(POINT_RENDEZ_VOUS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINTS_OU_PC_FLECHE:
				setPointsOuPCFleche(POINTS_OU_PC_FLECHE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__APOUR_CARACTERISTIQUE_GROUPE_INDIVIDUS_CARACTERISTIQUE_GROUPE_INDIVIDUS:
				setAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus((TypeCaracteristiqueGroupeIndividus)null);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_OPERATIONNEL:
				return isSetEtatOperationnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__QUALIFICATIF_ETAT:
				return isSetQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FONCTION_PC:
				return isSetFonctionPC();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ECHELON:
				return isSetEchelon();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DISPONIBILITE:
				return isSetDisponibilite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GDH_DISPONIBILITE:
				return GDH_DISPONIBILITE_EDEFAULT == null ? gDHDisponibilite != null : !GDH_DISPONIBILITE_EDEFAULT.equals(gDHDisponibilite);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_ENGAGEMENT:
				return isSetEtatEngagement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ACTIVATION:
				return isSetActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HDEBUT_ACTIVATION:
				return GD_HDEBUT_ACTIVATION_EDEFAULT == null ? gDHdebutActivation != null : !GD_HDEBUT_ACTIVATION_EDEFAULT.equals(gDHdebutActivation);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__GD_HFIN_ACTIVATION:
				return GD_HFIN_ACTIVATION_EDEFAULT == null ? gDHfinActivation != null : !GD_HFIN_ACTIVATION_EDEFAULT.equals(gDHfinActivation);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_FORMATION:
				return isSetEtatFormation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_ETAT_FORMATION:
				return AUTRE_ETAT_FORMATION_EDEFAULT == null ? autreEtatFormation != null : !AUTRE_ETAT_FORMATION_EDEFAULT.equals(autreEtatFormation);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_DEPLOIEMENT:
				return isSetEtatDeploiement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__AUTRE_DEPLOIEMENT:
				return AUTRE_DEPLOIEMENT_EDEFAULT == null ? autreDeploiement != null : !AUTRE_DEPLOIEMENT_EDEFAULT.equals(autreDeploiement);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CAPTEUR:
				return ETAT_CAPTEUR_EDEFAULT == null ? etatCapteur != null : !ETAT_CAPTEUR_EDEFAULT.equals(etatCapteur);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__TEMPS_REPONSE:
				return tempsReponse != null;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ENTRAINEMENT:
				return isSetEntrainement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RENFORCEMENT:
				return isSetRenforcement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__RESERVE:
				return isSetReserve();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__CONSIGNE_TIR:
				return isSetConsigneTir();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__PROTECTION_NRBC:
				return isSetProtectionNRBC();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__DOSE_RADIATION:
				return doseRadiation != null;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__NIVEAU_ALERTE:
				return isSetNiveauAlerte();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__STATUT_LOGISTIQUE:
				return isSetStatutLogistique();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_PERSONNEL:
				return isSetEtatPersonnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__FATIGUE_PERSONNEL:
				return isSetFatiguePersonnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_EQUIPEMENTS:
				return isSetEtatEquipements();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_MUNITIONS:
				return isSetEtatMunitions();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__ETAT_CARBURANTS:
				return isSetEtatCarburants();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINT_RENDEZ_VOUS:
				return POINT_RENDEZ_VOUS_EDEFAULT == null ? pointRendezVous != null : !POINT_RENDEZ_VOUS_EDEFAULT.equals(pointRendezVous);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__POINTS_OU_PC_FLECHE:
				return POINTS_OU_PC_FLECHE_EDEFAULT == null ? pointsOuPCFleche != null : !POINTS_OU_PC_FLECHE_EDEFAULT.equals(pointsOuPCFleche);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ENTITE_ORGANISATIONNELLE__APOUR_CARACTERISTIQUE_GROUPE_INDIVIDUS_CARACTERISTIQUE_GROUPE_INDIVIDUS:
				return aPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus != null;
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
		result.append(", fonctionPC: ");
		if (fonctionPCESet) result.append(fonctionPC); else result.append("<unset>");
		result.append(", echelon: ");
		if (echelonESet) result.append(echelon); else result.append("<unset>");
		result.append(", disponibilite: ");
		if (disponibiliteESet) result.append(disponibilite); else result.append("<unset>");
		result.append(", gDHDisponibilite: ");
		result.append(gDHDisponibilite);
		result.append(", etatEngagement: ");
		if (etatEngagementESet) result.append(etatEngagement); else result.append("<unset>");
		result.append(", activation: ");
		if (activationESet) result.append(activation); else result.append("<unset>");
		result.append(", gDHdebutActivation: ");
		result.append(gDHdebutActivation);
		result.append(", gDHfinActivation: ");
		result.append(gDHfinActivation);
		result.append(", etatFormation: ");
		if (etatFormationESet) result.append(etatFormation); else result.append("<unset>");
		result.append(", autreEtatFormation: ");
		result.append(autreEtatFormation);
		result.append(", etatDeploiement: ");
		if (etatDeploiementESet) result.append(etatDeploiement); else result.append("<unset>");
		result.append(", autreDeploiement: ");
		result.append(autreDeploiement);
		result.append(", etatCapteur: ");
		result.append(etatCapteur);
		result.append(", entrainement: ");
		if (entrainementESet) result.append(entrainement); else result.append("<unset>");
		result.append(", renforcement: ");
		if (renforcementESet) result.append(renforcement); else result.append("<unset>");
		result.append(", reserve: ");
		if (reserveESet) result.append(reserve); else result.append("<unset>");
		result.append(", consigneTir: ");
		if (consigneTirESet) result.append(consigneTir); else result.append("<unset>");
		result.append(", protectionNRBC: ");
		if (protectionNRBCESet) result.append(protectionNRBC); else result.append("<unset>");
		result.append(", niveauAlerte: ");
		if (niveauAlerteESet) result.append(niveauAlerte); else result.append("<unset>");
		result.append(", statutLogistique: ");
		if (statutLogistiqueESet) result.append(statutLogistique); else result.append("<unset>");
		result.append(", etatPersonnel: ");
		if (etatPersonnelESet) result.append(etatPersonnel); else result.append("<unset>");
		result.append(", fatiguePersonnel: ");
		if (fatiguePersonnelESet) result.append(fatiguePersonnel); else result.append("<unset>");
		result.append(", etatEquipements: ");
		if (etatEquipementsESet) result.append(etatEquipements); else result.append("<unset>");
		result.append(", etatMunitions: ");
		if (etatMunitionsESet) result.append(etatMunitions); else result.append("<unset>");
		result.append(", etatCarburants: ");
		if (etatCarburantsESet) result.append(etatCarburants); else result.append("<unset>");
		result.append(", pointRendezVous: ");
		result.append(pointRendezVous);
		result.append(", pointsOuPCFleche: ");
		result.append(pointsOuPCFleche);
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelEntiteOrganisationnelleImpl
