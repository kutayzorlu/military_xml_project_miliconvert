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
import mpia.schema.TypeBlessesParPeriode;
import mpia.schema.TypeConsommableSante;
import mpia.schema.TypeEvacuationPatients;
import mpia.schema.TypeEvacuationsParPeriode;
import mpia.schema.TypePertesParPeriode;
import mpia.schema.TypeSyntheseSante;

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
 * An implementation of the model object '<em><b>Type Synthese Sante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCapaciteEvacuationDisponible <em>Capacite Evacuation Disponible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCapaciteEvacuationMoyenAir <em>Capacite Evacuation Moyen Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCapaciteEvacuationMoyenMer <em>Capacite Evacuation Moyen Mer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCapaciteEvacuationMoyenRail <em>Capacite Evacuation Moyen Rail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCapaciteEvacuationMoyenTerre <em>Capacite Evacuation Moyen Terre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCapaciteMoyenAir <em>Capacite Moyen Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCapaciteMoyenTerre <em>Capacite Moyen Terre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCommentaireEvacuation <em>Commentaire Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCommentaireRamassage <em>Commentaire Ramassage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCommentaireSituationChirurgicale <em>Commentaire Situation Chirurgicale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCommentaireSituationHopitaux <em>Commentaire Situation Hopitaux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCommentaireSituationRessources <em>Commentaire Situation Ressources</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCommentaireSituationSang <em>Commentaire Situation Sang</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCommentaireTriage <em>Commentaire Triage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getNombreEquipesChirurgicalesDeployes <em>Nombre Equipes Chirurgicales Deployes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getNombreJoursFonctionnementRestants <em>Nombre Jours Fonctionnement Restants</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getNombreLitsDeployesDisponibles <em>Nombre Lits Deployes Disponibles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getNombreLitsDeployesInfrastructure <em>Nombre Lits Deployes Infrastructure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getNombreLitsDeployesOccupes <em>Nombre Lits Deployes Occupes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getNombrePostesNRBC <em>Nombre Postes NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getNombrePostesSecours <em>Nombre Postes Secours</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getNombreSectionsTriageExistantes <em>Nombre Sections Triage Existantes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getNombreUnitesSangReserve <em>Nombre Unites Sang Reserve</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getPotentielBrules <em>Potentiel Brules</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getPotentielChirurgical <em>Potentiel Chirurgical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getSituationEpidemies <em>Situation Epidemies</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getSituationPertesMassives <em>Situation Pertes Massives</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getDateSyntheseSante <em>Date Synthese Sante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getEvacuationPatientsEvacuationPatients <em>Evacuation Patients Evacuation Patients</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getPertesParPeriodePertesParPeriode <em>Pertes Par Periode Pertes Par Periode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getEvacuationsParPeriodeEvacuationsParPeriode <em>Evacuations Par Periode Evacuations Par Periode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getConsommablesSanteConsommableSante <em>Consommables Sante Consommable Sante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseSanteImpl#getACommeBlessesParPeriodeBlessesParPeriode <em>AComme Blesses Par Periode Blesses Par Periode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSyntheseSanteImpl extends EObjectImpl implements TypeSyntheseSante {
	/**
	 * The default value of the '{@link #getCapaciteEvacuationDisponible() <em>Capacite Evacuation Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationDisponible()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_EVACUATION_DISPONIBLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteEvacuationDisponible() <em>Capacite Evacuation Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationDisponible()
	 * @generated
	 * @ordered
	 */
	protected long capaciteEvacuationDisponible = CAPACITE_EVACUATION_DISPONIBLE_EDEFAULT;

	/**
	 * This is true if the Capacite Evacuation Disponible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteEvacuationDisponibleESet;

	/**
	 * The default value of the '{@link #getCapaciteEvacuationMoyenAir() <em>Capacite Evacuation Moyen Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationMoyenAir()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_EVACUATION_MOYEN_AIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteEvacuationMoyenAir() <em>Capacite Evacuation Moyen Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationMoyenAir()
	 * @generated
	 * @ordered
	 */
	protected long capaciteEvacuationMoyenAir = CAPACITE_EVACUATION_MOYEN_AIR_EDEFAULT;

	/**
	 * This is true if the Capacite Evacuation Moyen Air attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteEvacuationMoyenAirESet;

	/**
	 * The default value of the '{@link #getCapaciteEvacuationMoyenMer() <em>Capacite Evacuation Moyen Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationMoyenMer()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_EVACUATION_MOYEN_MER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteEvacuationMoyenMer() <em>Capacite Evacuation Moyen Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationMoyenMer()
	 * @generated
	 * @ordered
	 */
	protected long capaciteEvacuationMoyenMer = CAPACITE_EVACUATION_MOYEN_MER_EDEFAULT;

	/**
	 * This is true if the Capacite Evacuation Moyen Mer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteEvacuationMoyenMerESet;

	/**
	 * The default value of the '{@link #getCapaciteEvacuationMoyenRail() <em>Capacite Evacuation Moyen Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationMoyenRail()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_EVACUATION_MOYEN_RAIL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteEvacuationMoyenRail() <em>Capacite Evacuation Moyen Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationMoyenRail()
	 * @generated
	 * @ordered
	 */
	protected long capaciteEvacuationMoyenRail = CAPACITE_EVACUATION_MOYEN_RAIL_EDEFAULT;

	/**
	 * This is true if the Capacite Evacuation Moyen Rail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteEvacuationMoyenRailESet;

	/**
	 * The default value of the '{@link #getCapaciteEvacuationMoyenTerre() <em>Capacite Evacuation Moyen Terre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationMoyenTerre()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_EVACUATION_MOYEN_TERRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteEvacuationMoyenTerre() <em>Capacite Evacuation Moyen Terre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEvacuationMoyenTerre()
	 * @generated
	 * @ordered
	 */
	protected long capaciteEvacuationMoyenTerre = CAPACITE_EVACUATION_MOYEN_TERRE_EDEFAULT;

	/**
	 * This is true if the Capacite Evacuation Moyen Terre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteEvacuationMoyenTerreESet;

	/**
	 * The default value of the '{@link #getCapaciteMoyenAir() <em>Capacite Moyen Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteMoyenAir()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_MOYEN_AIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteMoyenAir() <em>Capacite Moyen Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteMoyenAir()
	 * @generated
	 * @ordered
	 */
	protected long capaciteMoyenAir = CAPACITE_MOYEN_AIR_EDEFAULT;

	/**
	 * This is true if the Capacite Moyen Air attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteMoyenAirESet;

	/**
	 * The default value of the '{@link #getCapaciteMoyenTerre() <em>Capacite Moyen Terre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteMoyenTerre()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_MOYEN_TERRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteMoyenTerre() <em>Capacite Moyen Terre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteMoyenTerre()
	 * @generated
	 * @ordered
	 */
	protected long capaciteMoyenTerre = CAPACITE_MOYEN_TERRE_EDEFAULT;

	/**
	 * This is true if the Capacite Moyen Terre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteMoyenTerreESet;

	/**
	 * The default value of the '{@link #getCommentaireEvacuation() <em>Commentaire Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireEvacuation()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EVACUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireEvacuation() <em>Commentaire Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireEvacuation()
	 * @generated
	 * @ordered
	 */
	protected String commentaireEvacuation = COMMENTAIRE_EVACUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaireRamassage() <em>Commentaire Ramassage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireRamassage()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_RAMASSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireRamassage() <em>Commentaire Ramassage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireRamassage()
	 * @generated
	 * @ordered
	 */
	protected String commentaireRamassage = COMMENTAIRE_RAMASSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaireSituationChirurgicale() <em>Commentaire Situation Chirurgicale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSituationChirurgicale()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_SITUATION_CHIRURGICALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireSituationChirurgicale() <em>Commentaire Situation Chirurgicale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSituationChirurgicale()
	 * @generated
	 * @ordered
	 */
	protected String commentaireSituationChirurgicale = COMMENTAIRE_SITUATION_CHIRURGICALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaireSituationHopitaux() <em>Commentaire Situation Hopitaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSituationHopitaux()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_SITUATION_HOPITAUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireSituationHopitaux() <em>Commentaire Situation Hopitaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSituationHopitaux()
	 * @generated
	 * @ordered
	 */
	protected String commentaireSituationHopitaux = COMMENTAIRE_SITUATION_HOPITAUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaireSituationRessources() <em>Commentaire Situation Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSituationRessources()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_SITUATION_RESSOURCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireSituationRessources() <em>Commentaire Situation Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSituationRessources()
	 * @generated
	 * @ordered
	 */
	protected String commentaireSituationRessources = COMMENTAIRE_SITUATION_RESSOURCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaireSituationSang() <em>Commentaire Situation Sang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSituationSang()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_SITUATION_SANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireSituationSang() <em>Commentaire Situation Sang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSituationSang()
	 * @generated
	 * @ordered
	 */
	protected String commentaireSituationSang = COMMENTAIRE_SITUATION_SANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaireTriage() <em>Commentaire Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireTriage()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_TRIAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireTriage() <em>Commentaire Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireTriage()
	 * @generated
	 * @ordered
	 */
	protected String commentaireTriage = COMMENTAIRE_TRIAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreEquipesChirurgicalesDeployes() <em>Nombre Equipes Chirurgicales Deployes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEquipesChirurgicalesDeployes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEquipesChirurgicalesDeployes() <em>Nombre Equipes Chirurgicales Deployes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEquipesChirurgicalesDeployes()
	 * @generated
	 * @ordered
	 */
	protected long nombreEquipesChirurgicalesDeployes = NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES_EDEFAULT;

	/**
	 * This is true if the Nombre Equipes Chirurgicales Deployes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEquipesChirurgicalesDeployesESet;

	/**
	 * The default value of the '{@link #getNombreJoursFonctionnementRestants() <em>Nombre Jours Fonctionnement Restants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreJoursFonctionnementRestants()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNombreJoursFonctionnementRestants() <em>Nombre Jours Fonctionnement Restants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreJoursFonctionnementRestants()
	 * @generated
	 * @ordered
	 */
	protected double nombreJoursFonctionnementRestants = NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS_EDEFAULT;

	/**
	 * This is true if the Nombre Jours Fonctionnement Restants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreJoursFonctionnementRestantsESet;

	/**
	 * The default value of the '{@link #getNombreLitsDeployesDisponibles() <em>Nombre Lits Deployes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreLitsDeployesDisponibles()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_LITS_DEPLOYES_DISPONIBLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreLitsDeployesDisponibles() <em>Nombre Lits Deployes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreLitsDeployesDisponibles()
	 * @generated
	 * @ordered
	 */
	protected long nombreLitsDeployesDisponibles = NOMBRE_LITS_DEPLOYES_DISPONIBLES_EDEFAULT;

	/**
	 * This is true if the Nombre Lits Deployes Disponibles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreLitsDeployesDisponiblesESet;

	/**
	 * The default value of the '{@link #getNombreLitsDeployesInfrastructure() <em>Nombre Lits Deployes Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreLitsDeployesInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreLitsDeployesInfrastructure() <em>Nombre Lits Deployes Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreLitsDeployesInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected long nombreLitsDeployesInfrastructure = NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE_EDEFAULT;

	/**
	 * This is true if the Nombre Lits Deployes Infrastructure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreLitsDeployesInfrastructureESet;

	/**
	 * The default value of the '{@link #getNombreLitsDeployesOccupes() <em>Nombre Lits Deployes Occupes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreLitsDeployesOccupes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_LITS_DEPLOYES_OCCUPES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreLitsDeployesOccupes() <em>Nombre Lits Deployes Occupes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreLitsDeployesOccupes()
	 * @generated
	 * @ordered
	 */
	protected long nombreLitsDeployesOccupes = NOMBRE_LITS_DEPLOYES_OCCUPES_EDEFAULT;

	/**
	 * This is true if the Nombre Lits Deployes Occupes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreLitsDeployesOccupesESet;

	/**
	 * The default value of the '{@link #getNombrePostesNRBC() <em>Nombre Postes NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePostesNRBC()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_POSTES_NRBC_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePostesNRBC() <em>Nombre Postes NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePostesNRBC()
	 * @generated
	 * @ordered
	 */
	protected long nombrePostesNRBC = NOMBRE_POSTES_NRBC_EDEFAULT;

	/**
	 * This is true if the Nombre Postes NRBC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePostesNRBCESet;

	/**
	 * The default value of the '{@link #getNombrePostesSecours() <em>Nombre Postes Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePostesSecours()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_POSTES_SECOURS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePostesSecours() <em>Nombre Postes Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePostesSecours()
	 * @generated
	 * @ordered
	 */
	protected long nombrePostesSecours = NOMBRE_POSTES_SECOURS_EDEFAULT;

	/**
	 * This is true if the Nombre Postes Secours attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePostesSecoursESet;

	/**
	 * The default value of the '{@link #getNombreSectionsTriageExistantes() <em>Nombre Sections Triage Existantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSectionsTriageExistantes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_SECTIONS_TRIAGE_EXISTANTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreSectionsTriageExistantes() <em>Nombre Sections Triage Existantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSectionsTriageExistantes()
	 * @generated
	 * @ordered
	 */
	protected long nombreSectionsTriageExistantes = NOMBRE_SECTIONS_TRIAGE_EXISTANTES_EDEFAULT;

	/**
	 * This is true if the Nombre Sections Triage Existantes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreSectionsTriageExistantesESet;

	/**
	 * The default value of the '{@link #getNombreUnitesSangReserve() <em>Nombre Unites Sang Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreUnitesSangReserve()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_UNITES_SANG_RESERVE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreUnitesSangReserve() <em>Nombre Unites Sang Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreUnitesSangReserve()
	 * @generated
	 * @ordered
	 */
	protected long nombreUnitesSangReserve = NOMBRE_UNITES_SANG_RESERVE_EDEFAULT;

	/**
	 * This is true if the Nombre Unites Sang Reserve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreUnitesSangReserveESet;

	/**
	 * The default value of the '{@link #getPotentielBrules() <em>Potentiel Brules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentielBrules()
	 * @generated
	 * @ordered
	 */
	protected static final long POTENTIEL_BRULES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPotentielBrules() <em>Potentiel Brules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentielBrules()
	 * @generated
	 * @ordered
	 */
	protected long potentielBrules = POTENTIEL_BRULES_EDEFAULT;

	/**
	 * This is true if the Potentiel Brules attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean potentielBrulesESet;

	/**
	 * The default value of the '{@link #getPotentielChirurgical() <em>Potentiel Chirurgical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentielChirurgical()
	 * @generated
	 * @ordered
	 */
	protected static final long POTENTIEL_CHIRURGICAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPotentielChirurgical() <em>Potentiel Chirurgical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentielChirurgical()
	 * @generated
	 * @ordered
	 */
	protected long potentielChirurgical = POTENTIEL_CHIRURGICAL_EDEFAULT;

	/**
	 * This is true if the Potentiel Chirurgical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean potentielChirurgicalESet;

	/**
	 * The default value of the '{@link #getSituationEpidemies() <em>Situation Epidemies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationEpidemies()
	 * @generated
	 * @ordered
	 */
	protected static final String SITUATION_EPIDEMIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSituationEpidemies() <em>Situation Epidemies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationEpidemies()
	 * @generated
	 * @ordered
	 */
	protected String situationEpidemies = SITUATION_EPIDEMIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSituationPertesMassives() <em>Situation Pertes Massives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationPertesMassives()
	 * @generated
	 * @ordered
	 */
	protected static final String SITUATION_PERTES_MASSIVES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSituationPertesMassives() <em>Situation Pertes Massives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationPertesMassives()
	 * @generated
	 * @ordered
	 */
	protected String situationPertesMassives = SITUATION_PERTES_MASSIVES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateSyntheseSante() <em>Date Synthese Sante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSyntheseSante()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_SYNTHESE_SANTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateSyntheseSante() <em>Date Synthese Sante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSyntheseSante()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateSyntheseSante = DATE_SYNTHESE_SANTE_EDEFAULT;

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
	 * The cached value of the '{@link #getEvacuationPatientsEvacuationPatients() <em>Evacuation Patients Evacuation Patients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvacuationPatientsEvacuationPatients()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEvacuationPatients> evacuationPatientsEvacuationPatients;

	/**
	 * The cached value of the '{@link #getPertesParPeriodePertesParPeriode() <em>Pertes Par Periode Pertes Par Periode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertesParPeriodePertesParPeriode()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePertesParPeriode> pertesParPeriodePertesParPeriode;

	/**
	 * The cached value of the '{@link #getEvacuationsParPeriodeEvacuationsParPeriode() <em>Evacuations Par Periode Evacuations Par Periode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvacuationsParPeriodeEvacuationsParPeriode()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEvacuationsParPeriode> evacuationsParPeriodeEvacuationsParPeriode;

	/**
	 * The cached value of the '{@link #getConsommablesSanteConsommableSante() <em>Consommables Sante Consommable Sante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommablesSanteConsommableSante()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConsommableSante> consommablesSanteConsommableSante;

	/**
	 * The cached value of the '{@link #getACommeBlessesParPeriodeBlessesParPeriode() <em>AComme Blesses Par Periode Blesses Par Periode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeBlessesParPeriodeBlessesParPeriode()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBlessesParPeriode> aCommeBlessesParPeriodeBlessesParPeriode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSyntheseSanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSyntheseSante();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteEvacuationDisponible() {
		return capaciteEvacuationDisponible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteEvacuationDisponible(long newCapaciteEvacuationDisponible) {
		long oldCapaciteEvacuationDisponible = capaciteEvacuationDisponible;
		capaciteEvacuationDisponible = newCapaciteEvacuationDisponible;
		boolean oldCapaciteEvacuationDisponibleESet = capaciteEvacuationDisponibleESet;
		capaciteEvacuationDisponibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_DISPONIBLE, oldCapaciteEvacuationDisponible, capaciteEvacuationDisponible, !oldCapaciteEvacuationDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteEvacuationDisponible() {
		long oldCapaciteEvacuationDisponible = capaciteEvacuationDisponible;
		boolean oldCapaciteEvacuationDisponibleESet = capaciteEvacuationDisponibleESet;
		capaciteEvacuationDisponible = CAPACITE_EVACUATION_DISPONIBLE_EDEFAULT;
		capaciteEvacuationDisponibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_DISPONIBLE, oldCapaciteEvacuationDisponible, CAPACITE_EVACUATION_DISPONIBLE_EDEFAULT, oldCapaciteEvacuationDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteEvacuationDisponible() {
		return capaciteEvacuationDisponibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteEvacuationMoyenAir() {
		return capaciteEvacuationMoyenAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteEvacuationMoyenAir(long newCapaciteEvacuationMoyenAir) {
		long oldCapaciteEvacuationMoyenAir = capaciteEvacuationMoyenAir;
		capaciteEvacuationMoyenAir = newCapaciteEvacuationMoyenAir;
		boolean oldCapaciteEvacuationMoyenAirESet = capaciteEvacuationMoyenAirESet;
		capaciteEvacuationMoyenAirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_AIR, oldCapaciteEvacuationMoyenAir, capaciteEvacuationMoyenAir, !oldCapaciteEvacuationMoyenAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteEvacuationMoyenAir() {
		long oldCapaciteEvacuationMoyenAir = capaciteEvacuationMoyenAir;
		boolean oldCapaciteEvacuationMoyenAirESet = capaciteEvacuationMoyenAirESet;
		capaciteEvacuationMoyenAir = CAPACITE_EVACUATION_MOYEN_AIR_EDEFAULT;
		capaciteEvacuationMoyenAirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_AIR, oldCapaciteEvacuationMoyenAir, CAPACITE_EVACUATION_MOYEN_AIR_EDEFAULT, oldCapaciteEvacuationMoyenAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteEvacuationMoyenAir() {
		return capaciteEvacuationMoyenAirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteEvacuationMoyenMer() {
		return capaciteEvacuationMoyenMer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteEvacuationMoyenMer(long newCapaciteEvacuationMoyenMer) {
		long oldCapaciteEvacuationMoyenMer = capaciteEvacuationMoyenMer;
		capaciteEvacuationMoyenMer = newCapaciteEvacuationMoyenMer;
		boolean oldCapaciteEvacuationMoyenMerESet = capaciteEvacuationMoyenMerESet;
		capaciteEvacuationMoyenMerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_MER, oldCapaciteEvacuationMoyenMer, capaciteEvacuationMoyenMer, !oldCapaciteEvacuationMoyenMerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteEvacuationMoyenMer() {
		long oldCapaciteEvacuationMoyenMer = capaciteEvacuationMoyenMer;
		boolean oldCapaciteEvacuationMoyenMerESet = capaciteEvacuationMoyenMerESet;
		capaciteEvacuationMoyenMer = CAPACITE_EVACUATION_MOYEN_MER_EDEFAULT;
		capaciteEvacuationMoyenMerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_MER, oldCapaciteEvacuationMoyenMer, CAPACITE_EVACUATION_MOYEN_MER_EDEFAULT, oldCapaciteEvacuationMoyenMerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteEvacuationMoyenMer() {
		return capaciteEvacuationMoyenMerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteEvacuationMoyenRail() {
		return capaciteEvacuationMoyenRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteEvacuationMoyenRail(long newCapaciteEvacuationMoyenRail) {
		long oldCapaciteEvacuationMoyenRail = capaciteEvacuationMoyenRail;
		capaciteEvacuationMoyenRail = newCapaciteEvacuationMoyenRail;
		boolean oldCapaciteEvacuationMoyenRailESet = capaciteEvacuationMoyenRailESet;
		capaciteEvacuationMoyenRailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_RAIL, oldCapaciteEvacuationMoyenRail, capaciteEvacuationMoyenRail, !oldCapaciteEvacuationMoyenRailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteEvacuationMoyenRail() {
		long oldCapaciteEvacuationMoyenRail = capaciteEvacuationMoyenRail;
		boolean oldCapaciteEvacuationMoyenRailESet = capaciteEvacuationMoyenRailESet;
		capaciteEvacuationMoyenRail = CAPACITE_EVACUATION_MOYEN_RAIL_EDEFAULT;
		capaciteEvacuationMoyenRailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_RAIL, oldCapaciteEvacuationMoyenRail, CAPACITE_EVACUATION_MOYEN_RAIL_EDEFAULT, oldCapaciteEvacuationMoyenRailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteEvacuationMoyenRail() {
		return capaciteEvacuationMoyenRailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteEvacuationMoyenTerre() {
		return capaciteEvacuationMoyenTerre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteEvacuationMoyenTerre(long newCapaciteEvacuationMoyenTerre) {
		long oldCapaciteEvacuationMoyenTerre = capaciteEvacuationMoyenTerre;
		capaciteEvacuationMoyenTerre = newCapaciteEvacuationMoyenTerre;
		boolean oldCapaciteEvacuationMoyenTerreESet = capaciteEvacuationMoyenTerreESet;
		capaciteEvacuationMoyenTerreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_TERRE, oldCapaciteEvacuationMoyenTerre, capaciteEvacuationMoyenTerre, !oldCapaciteEvacuationMoyenTerreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteEvacuationMoyenTerre() {
		long oldCapaciteEvacuationMoyenTerre = capaciteEvacuationMoyenTerre;
		boolean oldCapaciteEvacuationMoyenTerreESet = capaciteEvacuationMoyenTerreESet;
		capaciteEvacuationMoyenTerre = CAPACITE_EVACUATION_MOYEN_TERRE_EDEFAULT;
		capaciteEvacuationMoyenTerreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_TERRE, oldCapaciteEvacuationMoyenTerre, CAPACITE_EVACUATION_MOYEN_TERRE_EDEFAULT, oldCapaciteEvacuationMoyenTerreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteEvacuationMoyenTerre() {
		return capaciteEvacuationMoyenTerreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteMoyenAir() {
		return capaciteMoyenAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteMoyenAir(long newCapaciteMoyenAir) {
		long oldCapaciteMoyenAir = capaciteMoyenAir;
		capaciteMoyenAir = newCapaciteMoyenAir;
		boolean oldCapaciteMoyenAirESet = capaciteMoyenAirESet;
		capaciteMoyenAirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_AIR, oldCapaciteMoyenAir, capaciteMoyenAir, !oldCapaciteMoyenAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteMoyenAir() {
		long oldCapaciteMoyenAir = capaciteMoyenAir;
		boolean oldCapaciteMoyenAirESet = capaciteMoyenAirESet;
		capaciteMoyenAir = CAPACITE_MOYEN_AIR_EDEFAULT;
		capaciteMoyenAirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_AIR, oldCapaciteMoyenAir, CAPACITE_MOYEN_AIR_EDEFAULT, oldCapaciteMoyenAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteMoyenAir() {
		return capaciteMoyenAirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteMoyenTerre() {
		return capaciteMoyenTerre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteMoyenTerre(long newCapaciteMoyenTerre) {
		long oldCapaciteMoyenTerre = capaciteMoyenTerre;
		capaciteMoyenTerre = newCapaciteMoyenTerre;
		boolean oldCapaciteMoyenTerreESet = capaciteMoyenTerreESet;
		capaciteMoyenTerreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_TERRE, oldCapaciteMoyenTerre, capaciteMoyenTerre, !oldCapaciteMoyenTerreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteMoyenTerre() {
		long oldCapaciteMoyenTerre = capaciteMoyenTerre;
		boolean oldCapaciteMoyenTerreESet = capaciteMoyenTerreESet;
		capaciteMoyenTerre = CAPACITE_MOYEN_TERRE_EDEFAULT;
		capaciteMoyenTerreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_TERRE, oldCapaciteMoyenTerre, CAPACITE_MOYEN_TERRE_EDEFAULT, oldCapaciteMoyenTerreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteMoyenTerre() {
		return capaciteMoyenTerreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireEvacuation() {
		return commentaireEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireEvacuation(String newCommentaireEvacuation) {
		String oldCommentaireEvacuation = commentaireEvacuation;
		commentaireEvacuation = newCommentaireEvacuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_EVACUATION, oldCommentaireEvacuation, commentaireEvacuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireRamassage() {
		return commentaireRamassage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireRamassage(String newCommentaireRamassage) {
		String oldCommentaireRamassage = commentaireRamassage;
		commentaireRamassage = newCommentaireRamassage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_RAMASSAGE, oldCommentaireRamassage, commentaireRamassage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireSituationChirurgicale() {
		return commentaireSituationChirurgicale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireSituationChirurgicale(String newCommentaireSituationChirurgicale) {
		String oldCommentaireSituationChirurgicale = commentaireSituationChirurgicale;
		commentaireSituationChirurgicale = newCommentaireSituationChirurgicale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_CHIRURGICALE, oldCommentaireSituationChirurgicale, commentaireSituationChirurgicale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireSituationHopitaux() {
		return commentaireSituationHopitaux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireSituationHopitaux(String newCommentaireSituationHopitaux) {
		String oldCommentaireSituationHopitaux = commentaireSituationHopitaux;
		commentaireSituationHopitaux = newCommentaireSituationHopitaux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_HOPITAUX, oldCommentaireSituationHopitaux, commentaireSituationHopitaux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireSituationRessources() {
		return commentaireSituationRessources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireSituationRessources(String newCommentaireSituationRessources) {
		String oldCommentaireSituationRessources = commentaireSituationRessources;
		commentaireSituationRessources = newCommentaireSituationRessources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_RESSOURCES, oldCommentaireSituationRessources, commentaireSituationRessources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireSituationSang() {
		return commentaireSituationSang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireSituationSang(String newCommentaireSituationSang) {
		String oldCommentaireSituationSang = commentaireSituationSang;
		commentaireSituationSang = newCommentaireSituationSang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_SANG, oldCommentaireSituationSang, commentaireSituationSang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireTriage() {
		return commentaireTriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireTriage(String newCommentaireTriage) {
		String oldCommentaireTriage = commentaireTriage;
		commentaireTriage = newCommentaireTriage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_TRIAGE, oldCommentaireTriage, commentaireTriage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEquipesChirurgicalesDeployes() {
		return nombreEquipesChirurgicalesDeployes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEquipesChirurgicalesDeployes(long newNombreEquipesChirurgicalesDeployes) {
		long oldNombreEquipesChirurgicalesDeployes = nombreEquipesChirurgicalesDeployes;
		nombreEquipesChirurgicalesDeployes = newNombreEquipesChirurgicalesDeployes;
		boolean oldNombreEquipesChirurgicalesDeployesESet = nombreEquipesChirurgicalesDeployesESet;
		nombreEquipesChirurgicalesDeployesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES, oldNombreEquipesChirurgicalesDeployes, nombreEquipesChirurgicalesDeployes, !oldNombreEquipesChirurgicalesDeployesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEquipesChirurgicalesDeployes() {
		long oldNombreEquipesChirurgicalesDeployes = nombreEquipesChirurgicalesDeployes;
		boolean oldNombreEquipesChirurgicalesDeployesESet = nombreEquipesChirurgicalesDeployesESet;
		nombreEquipesChirurgicalesDeployes = NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES_EDEFAULT;
		nombreEquipesChirurgicalesDeployesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES, oldNombreEquipesChirurgicalesDeployes, NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES_EDEFAULT, oldNombreEquipesChirurgicalesDeployesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEquipesChirurgicalesDeployes() {
		return nombreEquipesChirurgicalesDeployesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNombreJoursFonctionnementRestants() {
		return nombreJoursFonctionnementRestants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreJoursFonctionnementRestants(double newNombreJoursFonctionnementRestants) {
		double oldNombreJoursFonctionnementRestants = nombreJoursFonctionnementRestants;
		nombreJoursFonctionnementRestants = newNombreJoursFonctionnementRestants;
		boolean oldNombreJoursFonctionnementRestantsESet = nombreJoursFonctionnementRestantsESet;
		nombreJoursFonctionnementRestantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS, oldNombreJoursFonctionnementRestants, nombreJoursFonctionnementRestants, !oldNombreJoursFonctionnementRestantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreJoursFonctionnementRestants() {
		double oldNombreJoursFonctionnementRestants = nombreJoursFonctionnementRestants;
		boolean oldNombreJoursFonctionnementRestantsESet = nombreJoursFonctionnementRestantsESet;
		nombreJoursFonctionnementRestants = NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS_EDEFAULT;
		nombreJoursFonctionnementRestantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS, oldNombreJoursFonctionnementRestants, NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS_EDEFAULT, oldNombreJoursFonctionnementRestantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreJoursFonctionnementRestants() {
		return nombreJoursFonctionnementRestantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreLitsDeployesDisponibles() {
		return nombreLitsDeployesDisponibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreLitsDeployesDisponibles(long newNombreLitsDeployesDisponibles) {
		long oldNombreLitsDeployesDisponibles = nombreLitsDeployesDisponibles;
		nombreLitsDeployesDisponibles = newNombreLitsDeployesDisponibles;
		boolean oldNombreLitsDeployesDisponiblesESet = nombreLitsDeployesDisponiblesESet;
		nombreLitsDeployesDisponiblesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_DISPONIBLES, oldNombreLitsDeployesDisponibles, nombreLitsDeployesDisponibles, !oldNombreLitsDeployesDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreLitsDeployesDisponibles() {
		long oldNombreLitsDeployesDisponibles = nombreLitsDeployesDisponibles;
		boolean oldNombreLitsDeployesDisponiblesESet = nombreLitsDeployesDisponiblesESet;
		nombreLitsDeployesDisponibles = NOMBRE_LITS_DEPLOYES_DISPONIBLES_EDEFAULT;
		nombreLitsDeployesDisponiblesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_DISPONIBLES, oldNombreLitsDeployesDisponibles, NOMBRE_LITS_DEPLOYES_DISPONIBLES_EDEFAULT, oldNombreLitsDeployesDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreLitsDeployesDisponibles() {
		return nombreLitsDeployesDisponiblesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreLitsDeployesInfrastructure() {
		return nombreLitsDeployesInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreLitsDeployesInfrastructure(long newNombreLitsDeployesInfrastructure) {
		long oldNombreLitsDeployesInfrastructure = nombreLitsDeployesInfrastructure;
		nombreLitsDeployesInfrastructure = newNombreLitsDeployesInfrastructure;
		boolean oldNombreLitsDeployesInfrastructureESet = nombreLitsDeployesInfrastructureESet;
		nombreLitsDeployesInfrastructureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE, oldNombreLitsDeployesInfrastructure, nombreLitsDeployesInfrastructure, !oldNombreLitsDeployesInfrastructureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreLitsDeployesInfrastructure() {
		long oldNombreLitsDeployesInfrastructure = nombreLitsDeployesInfrastructure;
		boolean oldNombreLitsDeployesInfrastructureESet = nombreLitsDeployesInfrastructureESet;
		nombreLitsDeployesInfrastructure = NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE_EDEFAULT;
		nombreLitsDeployesInfrastructureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE, oldNombreLitsDeployesInfrastructure, NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE_EDEFAULT, oldNombreLitsDeployesInfrastructureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreLitsDeployesInfrastructure() {
		return nombreLitsDeployesInfrastructureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreLitsDeployesOccupes() {
		return nombreLitsDeployesOccupes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreLitsDeployesOccupes(long newNombreLitsDeployesOccupes) {
		long oldNombreLitsDeployesOccupes = nombreLitsDeployesOccupes;
		nombreLitsDeployesOccupes = newNombreLitsDeployesOccupes;
		boolean oldNombreLitsDeployesOccupesESet = nombreLitsDeployesOccupesESet;
		nombreLitsDeployesOccupesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_OCCUPES, oldNombreLitsDeployesOccupes, nombreLitsDeployesOccupes, !oldNombreLitsDeployesOccupesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreLitsDeployesOccupes() {
		long oldNombreLitsDeployesOccupes = nombreLitsDeployesOccupes;
		boolean oldNombreLitsDeployesOccupesESet = nombreLitsDeployesOccupesESet;
		nombreLitsDeployesOccupes = NOMBRE_LITS_DEPLOYES_OCCUPES_EDEFAULT;
		nombreLitsDeployesOccupesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_OCCUPES, oldNombreLitsDeployesOccupes, NOMBRE_LITS_DEPLOYES_OCCUPES_EDEFAULT, oldNombreLitsDeployesOccupesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreLitsDeployesOccupes() {
		return nombreLitsDeployesOccupesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePostesNRBC() {
		return nombrePostesNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePostesNRBC(long newNombrePostesNRBC) {
		long oldNombrePostesNRBC = nombrePostesNRBC;
		nombrePostesNRBC = newNombrePostesNRBC;
		boolean oldNombrePostesNRBCESet = nombrePostesNRBCESet;
		nombrePostesNRBCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_NRBC, oldNombrePostesNRBC, nombrePostesNRBC, !oldNombrePostesNRBCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePostesNRBC() {
		long oldNombrePostesNRBC = nombrePostesNRBC;
		boolean oldNombrePostesNRBCESet = nombrePostesNRBCESet;
		nombrePostesNRBC = NOMBRE_POSTES_NRBC_EDEFAULT;
		nombrePostesNRBCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_NRBC, oldNombrePostesNRBC, NOMBRE_POSTES_NRBC_EDEFAULT, oldNombrePostesNRBCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePostesNRBC() {
		return nombrePostesNRBCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePostesSecours() {
		return nombrePostesSecours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePostesSecours(long newNombrePostesSecours) {
		long oldNombrePostesSecours = nombrePostesSecours;
		nombrePostesSecours = newNombrePostesSecours;
		boolean oldNombrePostesSecoursESet = nombrePostesSecoursESet;
		nombrePostesSecoursESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_SECOURS, oldNombrePostesSecours, nombrePostesSecours, !oldNombrePostesSecoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePostesSecours() {
		long oldNombrePostesSecours = nombrePostesSecours;
		boolean oldNombrePostesSecoursESet = nombrePostesSecoursESet;
		nombrePostesSecours = NOMBRE_POSTES_SECOURS_EDEFAULT;
		nombrePostesSecoursESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_SECOURS, oldNombrePostesSecours, NOMBRE_POSTES_SECOURS_EDEFAULT, oldNombrePostesSecoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePostesSecours() {
		return nombrePostesSecoursESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreSectionsTriageExistantes() {
		return nombreSectionsTriageExistantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreSectionsTriageExistantes(long newNombreSectionsTriageExistantes) {
		long oldNombreSectionsTriageExistantes = nombreSectionsTriageExistantes;
		nombreSectionsTriageExistantes = newNombreSectionsTriageExistantes;
		boolean oldNombreSectionsTriageExistantesESet = nombreSectionsTriageExistantesESet;
		nombreSectionsTriageExistantesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_SECTIONS_TRIAGE_EXISTANTES, oldNombreSectionsTriageExistantes, nombreSectionsTriageExistantes, !oldNombreSectionsTriageExistantesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreSectionsTriageExistantes() {
		long oldNombreSectionsTriageExistantes = nombreSectionsTriageExistantes;
		boolean oldNombreSectionsTriageExistantesESet = nombreSectionsTriageExistantesESet;
		nombreSectionsTriageExistantes = NOMBRE_SECTIONS_TRIAGE_EXISTANTES_EDEFAULT;
		nombreSectionsTriageExistantesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_SECTIONS_TRIAGE_EXISTANTES, oldNombreSectionsTriageExistantes, NOMBRE_SECTIONS_TRIAGE_EXISTANTES_EDEFAULT, oldNombreSectionsTriageExistantesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreSectionsTriageExistantes() {
		return nombreSectionsTriageExistantesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreUnitesSangReserve() {
		return nombreUnitesSangReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreUnitesSangReserve(long newNombreUnitesSangReserve) {
		long oldNombreUnitesSangReserve = nombreUnitesSangReserve;
		nombreUnitesSangReserve = newNombreUnitesSangReserve;
		boolean oldNombreUnitesSangReserveESet = nombreUnitesSangReserveESet;
		nombreUnitesSangReserveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_UNITES_SANG_RESERVE, oldNombreUnitesSangReserve, nombreUnitesSangReserve, !oldNombreUnitesSangReserveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreUnitesSangReserve() {
		long oldNombreUnitesSangReserve = nombreUnitesSangReserve;
		boolean oldNombreUnitesSangReserveESet = nombreUnitesSangReserveESet;
		nombreUnitesSangReserve = NOMBRE_UNITES_SANG_RESERVE_EDEFAULT;
		nombreUnitesSangReserveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_UNITES_SANG_RESERVE, oldNombreUnitesSangReserve, NOMBRE_UNITES_SANG_RESERVE_EDEFAULT, oldNombreUnitesSangReserveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreUnitesSangReserve() {
		return nombreUnitesSangReserveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPotentielBrules() {
		return potentielBrules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotentielBrules(long newPotentielBrules) {
		long oldPotentielBrules = potentielBrules;
		potentielBrules = newPotentielBrules;
		boolean oldPotentielBrulesESet = potentielBrulesESet;
		potentielBrulesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_BRULES, oldPotentielBrules, potentielBrules, !oldPotentielBrulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPotentielBrules() {
		long oldPotentielBrules = potentielBrules;
		boolean oldPotentielBrulesESet = potentielBrulesESet;
		potentielBrules = POTENTIEL_BRULES_EDEFAULT;
		potentielBrulesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_BRULES, oldPotentielBrules, POTENTIEL_BRULES_EDEFAULT, oldPotentielBrulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPotentielBrules() {
		return potentielBrulesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPotentielChirurgical() {
		return potentielChirurgical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotentielChirurgical(long newPotentielChirurgical) {
		long oldPotentielChirurgical = potentielChirurgical;
		potentielChirurgical = newPotentielChirurgical;
		boolean oldPotentielChirurgicalESet = potentielChirurgicalESet;
		potentielChirurgicalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_CHIRURGICAL, oldPotentielChirurgical, potentielChirurgical, !oldPotentielChirurgicalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPotentielChirurgical() {
		long oldPotentielChirurgical = potentielChirurgical;
		boolean oldPotentielChirurgicalESet = potentielChirurgicalESet;
		potentielChirurgical = POTENTIEL_CHIRURGICAL_EDEFAULT;
		potentielChirurgicalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_CHIRURGICAL, oldPotentielChirurgical, POTENTIEL_CHIRURGICAL_EDEFAULT, oldPotentielChirurgicalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPotentielChirurgical() {
		return potentielChirurgicalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSituationEpidemies() {
		return situationEpidemies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituationEpidemies(String newSituationEpidemies) {
		String oldSituationEpidemies = situationEpidemies;
		situationEpidemies = newSituationEpidemies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_EPIDEMIES, oldSituationEpidemies, situationEpidemies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSituationPertesMassives() {
		return situationPertesMassives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituationPertesMassives(String newSituationPertesMassives) {
		String oldSituationPertesMassives = situationPertesMassives;
		situationPertesMassives = newSituationPertesMassives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_PERTES_MASSIVES, oldSituationPertesMassives, situationPertesMassives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateSyntheseSante() {
		return dateSyntheseSante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSyntheseSante(XMLGregorianCalendar newDateSyntheseSante) {
		XMLGregorianCalendar oldDateSyntheseSante = dateSyntheseSante;
		dateSyntheseSante = newDateSyntheseSante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__DATE_SYNTHESE_SANTE, oldDateSyntheseSante, dateSyntheseSante));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_SANTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvacuationPatients> getEvacuationPatientsEvacuationPatients() {
		if (evacuationPatientsEvacuationPatients == null) {
			evacuationPatientsEvacuationPatients = new EObjectContainmentEList<TypeEvacuationPatients>(TypeEvacuationPatients.class, this, SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATION_PATIENTS_EVACUATION_PATIENTS);
		}
		return evacuationPatientsEvacuationPatients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePertesParPeriode> getPertesParPeriodePertesParPeriode() {
		if (pertesParPeriodePertesParPeriode == null) {
			pertesParPeriodePertesParPeriode = new EObjectContainmentEList<TypePertesParPeriode>(TypePertesParPeriode.class, this, SchemaPackage.TYPE_SYNTHESE_SANTE__PERTES_PAR_PERIODE_PERTES_PAR_PERIODE);
		}
		return pertesParPeriodePertesParPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvacuationsParPeriode> getEvacuationsParPeriodeEvacuationsParPeriode() {
		if (evacuationsParPeriodeEvacuationsParPeriode == null) {
			evacuationsParPeriodeEvacuationsParPeriode = new EObjectContainmentEList<TypeEvacuationsParPeriode>(TypeEvacuationsParPeriode.class, this, SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATIONS_PAR_PERIODE_EVACUATIONS_PAR_PERIODE);
		}
		return evacuationsParPeriodeEvacuationsParPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsommableSante> getConsommablesSanteConsommableSante() {
		if (consommablesSanteConsommableSante == null) {
			consommablesSanteConsommableSante = new EObjectContainmentEList<TypeConsommableSante>(TypeConsommableSante.class, this, SchemaPackage.TYPE_SYNTHESE_SANTE__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE);
		}
		return consommablesSanteConsommableSante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBlessesParPeriode> getACommeBlessesParPeriodeBlessesParPeriode() {
		if (aCommeBlessesParPeriodeBlessesParPeriode == null) {
			aCommeBlessesParPeriodeBlessesParPeriode = new EObjectContainmentEList<TypeBlessesParPeriode>(TypeBlessesParPeriode.class, this, SchemaPackage.TYPE_SYNTHESE_SANTE__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE);
		}
		return aCommeBlessesParPeriodeBlessesParPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				return ((InternalEList<?>)getEvacuationPatientsEvacuationPatients()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				return ((InternalEList<?>)getPertesParPeriodePertesParPeriode()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATIONS_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				return ((InternalEList<?>)getEvacuationsParPeriodeEvacuationsParPeriode()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				return ((InternalEList<?>)getConsommablesSanteConsommableSante()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				return ((InternalEList<?>)getACommeBlessesParPeriodeBlessesParPeriode()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_DISPONIBLE:
				return new Long(getCapaciteEvacuationDisponible());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_AIR:
				return new Long(getCapaciteEvacuationMoyenAir());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_MER:
				return new Long(getCapaciteEvacuationMoyenMer());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_RAIL:
				return new Long(getCapaciteEvacuationMoyenRail());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_TERRE:
				return new Long(getCapaciteEvacuationMoyenTerre());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_AIR:
				return new Long(getCapaciteMoyenAir());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_TERRE:
				return new Long(getCapaciteMoyenTerre());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_EVACUATION:
				return getCommentaireEvacuation();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_RAMASSAGE:
				return getCommentaireRamassage();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_CHIRURGICALE:
				return getCommentaireSituationChirurgicale();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_HOPITAUX:
				return getCommentaireSituationHopitaux();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_RESSOURCES:
				return getCommentaireSituationRessources();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_SANG:
				return getCommentaireSituationSang();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_TRIAGE:
				return getCommentaireTriage();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES:
				return new Long(getNombreEquipesChirurgicalesDeployes());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS:
				return new Double(getNombreJoursFonctionnementRestants());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_DISPONIBLES:
				return new Long(getNombreLitsDeployesDisponibles());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE:
				return new Long(getNombreLitsDeployesInfrastructure());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_OCCUPES:
				return new Long(getNombreLitsDeployesOccupes());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_NRBC:
				return new Long(getNombrePostesNRBC());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_SECOURS:
				return new Long(getNombrePostesSecours());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_SECTIONS_TRIAGE_EXISTANTES:
				return new Long(getNombreSectionsTriageExistantes());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_UNITES_SANG_RESERVE:
				return new Long(getNombreUnitesSangReserve());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_BRULES:
				return new Long(getPotentielBrules());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_CHIRURGICAL:
				return new Long(getPotentielChirurgical());
			case SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_EPIDEMIES:
				return getSituationEpidemies();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_PERTES_MASSIVES:
				return getSituationPertesMassives();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__DATE_SYNTHESE_SANTE:
				return getDateSyntheseSante();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CE:
				return getCE();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				return getEvacuationPatientsEvacuationPatients();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				return getPertesParPeriodePertesParPeriode();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATIONS_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				return getEvacuationsParPeriodeEvacuationsParPeriode();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				return getConsommablesSanteConsommableSante();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				return getACommeBlessesParPeriodeBlessesParPeriode();
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
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_DISPONIBLE:
				setCapaciteEvacuationDisponible(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_AIR:
				setCapaciteEvacuationMoyenAir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_MER:
				setCapaciteEvacuationMoyenMer(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_RAIL:
				setCapaciteEvacuationMoyenRail(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_TERRE:
				setCapaciteEvacuationMoyenTerre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_AIR:
				setCapaciteMoyenAir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_TERRE:
				setCapaciteMoyenTerre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_EVACUATION:
				setCommentaireEvacuation((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_RAMASSAGE:
				setCommentaireRamassage((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_CHIRURGICALE:
				setCommentaireSituationChirurgicale((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_HOPITAUX:
				setCommentaireSituationHopitaux((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_RESSOURCES:
				setCommentaireSituationRessources((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_SANG:
				setCommentaireSituationSang((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_TRIAGE:
				setCommentaireTriage((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES:
				setNombreEquipesChirurgicalesDeployes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS:
				setNombreJoursFonctionnementRestants(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_DISPONIBLES:
				setNombreLitsDeployesDisponibles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE:
				setNombreLitsDeployesInfrastructure(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_OCCUPES:
				setNombreLitsDeployesOccupes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_NRBC:
				setNombrePostesNRBC(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_SECOURS:
				setNombrePostesSecours(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_SECTIONS_TRIAGE_EXISTANTES:
				setNombreSectionsTriageExistantes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_UNITES_SANG_RESERVE:
				setNombreUnitesSangReserve(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_BRULES:
				setPotentielBrules(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_CHIRURGICAL:
				setPotentielChirurgical(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_EPIDEMIES:
				setSituationEpidemies((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_PERTES_MASSIVES:
				setSituationPertesMassives((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__DATE_SYNTHESE_SANTE:
				setDateSyntheseSante((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				getEvacuationPatientsEvacuationPatients().clear();
				getEvacuationPatientsEvacuationPatients().addAll((Collection<? extends TypeEvacuationPatients>)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				getPertesParPeriodePertesParPeriode().clear();
				getPertesParPeriodePertesParPeriode().addAll((Collection<? extends TypePertesParPeriode>)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATIONS_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				getEvacuationsParPeriodeEvacuationsParPeriode().clear();
				getEvacuationsParPeriodeEvacuationsParPeriode().addAll((Collection<? extends TypeEvacuationsParPeriode>)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				getConsommablesSanteConsommableSante().clear();
				getConsommablesSanteConsommableSante().addAll((Collection<? extends TypeConsommableSante>)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				getACommeBlessesParPeriodeBlessesParPeriode().clear();
				getACommeBlessesParPeriodeBlessesParPeriode().addAll((Collection<? extends TypeBlessesParPeriode>)newValue);
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
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_DISPONIBLE:
				unsetCapaciteEvacuationDisponible();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_AIR:
				unsetCapaciteEvacuationMoyenAir();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_MER:
				unsetCapaciteEvacuationMoyenMer();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_RAIL:
				unsetCapaciteEvacuationMoyenRail();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_TERRE:
				unsetCapaciteEvacuationMoyenTerre();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_AIR:
				unsetCapaciteMoyenAir();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_TERRE:
				unsetCapaciteMoyenTerre();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_EVACUATION:
				setCommentaireEvacuation(COMMENTAIRE_EVACUATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_RAMASSAGE:
				setCommentaireRamassage(COMMENTAIRE_RAMASSAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_CHIRURGICALE:
				setCommentaireSituationChirurgicale(COMMENTAIRE_SITUATION_CHIRURGICALE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_HOPITAUX:
				setCommentaireSituationHopitaux(COMMENTAIRE_SITUATION_HOPITAUX_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_RESSOURCES:
				setCommentaireSituationRessources(COMMENTAIRE_SITUATION_RESSOURCES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_SANG:
				setCommentaireSituationSang(COMMENTAIRE_SITUATION_SANG_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_TRIAGE:
				setCommentaireTriage(COMMENTAIRE_TRIAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES:
				unsetNombreEquipesChirurgicalesDeployes();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS:
				unsetNombreJoursFonctionnementRestants();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_DISPONIBLES:
				unsetNombreLitsDeployesDisponibles();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE:
				unsetNombreLitsDeployesInfrastructure();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_OCCUPES:
				unsetNombreLitsDeployesOccupes();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_NRBC:
				unsetNombrePostesNRBC();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_SECOURS:
				unsetNombrePostesSecours();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_SECTIONS_TRIAGE_EXISTANTES:
				unsetNombreSectionsTriageExistantes();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_UNITES_SANG_RESERVE:
				unsetNombreUnitesSangReserve();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_BRULES:
				unsetPotentielBrules();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_CHIRURGICAL:
				unsetPotentielChirurgical();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_EPIDEMIES:
				setSituationEpidemies(SITUATION_EPIDEMIES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_PERTES_MASSIVES:
				setSituationPertesMassives(SITUATION_PERTES_MASSIVES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__DATE_SYNTHESE_SANTE:
				setDateSyntheseSante(DATE_SYNTHESE_SANTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				getEvacuationPatientsEvacuationPatients().clear();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				getPertesParPeriodePertesParPeriode().clear();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATIONS_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				getEvacuationsParPeriodeEvacuationsParPeriode().clear();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				getConsommablesSanteConsommableSante().clear();
				return;
			case SchemaPackage.TYPE_SYNTHESE_SANTE__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				getACommeBlessesParPeriodeBlessesParPeriode().clear();
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
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_DISPONIBLE:
				return isSetCapaciteEvacuationDisponible();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_AIR:
				return isSetCapaciteEvacuationMoyenAir();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_MER:
				return isSetCapaciteEvacuationMoyenMer();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_RAIL:
				return isSetCapaciteEvacuationMoyenRail();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_EVACUATION_MOYEN_TERRE:
				return isSetCapaciteEvacuationMoyenTerre();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_AIR:
				return isSetCapaciteMoyenAir();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CAPACITE_MOYEN_TERRE:
				return isSetCapaciteMoyenTerre();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_EVACUATION:
				return COMMENTAIRE_EVACUATION_EDEFAULT == null ? commentaireEvacuation != null : !COMMENTAIRE_EVACUATION_EDEFAULT.equals(commentaireEvacuation);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_RAMASSAGE:
				return COMMENTAIRE_RAMASSAGE_EDEFAULT == null ? commentaireRamassage != null : !COMMENTAIRE_RAMASSAGE_EDEFAULT.equals(commentaireRamassage);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_CHIRURGICALE:
				return COMMENTAIRE_SITUATION_CHIRURGICALE_EDEFAULT == null ? commentaireSituationChirurgicale != null : !COMMENTAIRE_SITUATION_CHIRURGICALE_EDEFAULT.equals(commentaireSituationChirurgicale);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_HOPITAUX:
				return COMMENTAIRE_SITUATION_HOPITAUX_EDEFAULT == null ? commentaireSituationHopitaux != null : !COMMENTAIRE_SITUATION_HOPITAUX_EDEFAULT.equals(commentaireSituationHopitaux);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_RESSOURCES:
				return COMMENTAIRE_SITUATION_RESSOURCES_EDEFAULT == null ? commentaireSituationRessources != null : !COMMENTAIRE_SITUATION_RESSOURCES_EDEFAULT.equals(commentaireSituationRessources);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_SITUATION_SANG:
				return COMMENTAIRE_SITUATION_SANG_EDEFAULT == null ? commentaireSituationSang != null : !COMMENTAIRE_SITUATION_SANG_EDEFAULT.equals(commentaireSituationSang);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__COMMENTAIRE_TRIAGE:
				return COMMENTAIRE_TRIAGE_EDEFAULT == null ? commentaireTriage != null : !COMMENTAIRE_TRIAGE_EDEFAULT.equals(commentaireTriage);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_EQUIPES_CHIRURGICALES_DEPLOYES:
				return isSetNombreEquipesChirurgicalesDeployes();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_JOURS_FONCTIONNEMENT_RESTANTS:
				return isSetNombreJoursFonctionnementRestants();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_DISPONIBLES:
				return isSetNombreLitsDeployesDisponibles();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_INFRASTRUCTURE:
				return isSetNombreLitsDeployesInfrastructure();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_LITS_DEPLOYES_OCCUPES:
				return isSetNombreLitsDeployesOccupes();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_NRBC:
				return isSetNombrePostesNRBC();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_POSTES_SECOURS:
				return isSetNombrePostesSecours();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_SECTIONS_TRIAGE_EXISTANTES:
				return isSetNombreSectionsTriageExistantes();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__NOMBRE_UNITES_SANG_RESERVE:
				return isSetNombreUnitesSangReserve();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_BRULES:
				return isSetPotentielBrules();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__POTENTIEL_CHIRURGICAL:
				return isSetPotentielChirurgical();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_EPIDEMIES:
				return SITUATION_EPIDEMIES_EDEFAULT == null ? situationEpidemies != null : !SITUATION_EPIDEMIES_EDEFAULT.equals(situationEpidemies);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__SITUATION_PERTES_MASSIVES:
				return SITUATION_PERTES_MASSIVES_EDEFAULT == null ? situationPertesMassives != null : !SITUATION_PERTES_MASSIVES_EDEFAULT.equals(situationPertesMassives);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__DATE_SYNTHESE_SANTE:
				return DATE_SYNTHESE_SANTE_EDEFAULT == null ? dateSyntheseSante != null : !DATE_SYNTHESE_SANTE_EDEFAULT.equals(dateSyntheseSante);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATION_PATIENTS_EVACUATION_PATIENTS:
				return evacuationPatientsEvacuationPatients != null && !evacuationPatientsEvacuationPatients.isEmpty();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__PERTES_PAR_PERIODE_PERTES_PAR_PERIODE:
				return pertesParPeriodePertesParPeriode != null && !pertesParPeriodePertesParPeriode.isEmpty();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__EVACUATIONS_PAR_PERIODE_EVACUATIONS_PAR_PERIODE:
				return evacuationsParPeriodeEvacuationsParPeriode != null && !evacuationsParPeriodeEvacuationsParPeriode.isEmpty();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__CONSOMMABLES_SANTE_CONSOMMABLE_SANTE:
				return consommablesSanteConsommableSante != null && !consommablesSanteConsommableSante.isEmpty();
			case SchemaPackage.TYPE_SYNTHESE_SANTE__ACOMME_BLESSES_PAR_PERIODE_BLESSES_PAR_PERIODE:
				return aCommeBlessesParPeriodeBlessesParPeriode != null && !aCommeBlessesParPeriodeBlessesParPeriode.isEmpty();
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
		result.append(" (capaciteEvacuationDisponible: ");
		if (capaciteEvacuationDisponibleESet) result.append(capaciteEvacuationDisponible); else result.append("<unset>");
		result.append(", capaciteEvacuationMoyenAir: ");
		if (capaciteEvacuationMoyenAirESet) result.append(capaciteEvacuationMoyenAir); else result.append("<unset>");
		result.append(", capaciteEvacuationMoyenMer: ");
		if (capaciteEvacuationMoyenMerESet) result.append(capaciteEvacuationMoyenMer); else result.append("<unset>");
		result.append(", capaciteEvacuationMoyenRail: ");
		if (capaciteEvacuationMoyenRailESet) result.append(capaciteEvacuationMoyenRail); else result.append("<unset>");
		result.append(", capaciteEvacuationMoyenTerre: ");
		if (capaciteEvacuationMoyenTerreESet) result.append(capaciteEvacuationMoyenTerre); else result.append("<unset>");
		result.append(", capaciteMoyenAir: ");
		if (capaciteMoyenAirESet) result.append(capaciteMoyenAir); else result.append("<unset>");
		result.append(", capaciteMoyenTerre: ");
		if (capaciteMoyenTerreESet) result.append(capaciteMoyenTerre); else result.append("<unset>");
		result.append(", commentaireEvacuation: ");
		result.append(commentaireEvacuation);
		result.append(", commentaireRamassage: ");
		result.append(commentaireRamassage);
		result.append(", commentaireSituationChirurgicale: ");
		result.append(commentaireSituationChirurgicale);
		result.append(", commentaireSituationHopitaux: ");
		result.append(commentaireSituationHopitaux);
		result.append(", commentaireSituationRessources: ");
		result.append(commentaireSituationRessources);
		result.append(", commentaireSituationSang: ");
		result.append(commentaireSituationSang);
		result.append(", commentaireTriage: ");
		result.append(commentaireTriage);
		result.append(", nombreEquipesChirurgicalesDeployes: ");
		if (nombreEquipesChirurgicalesDeployesESet) result.append(nombreEquipesChirurgicalesDeployes); else result.append("<unset>");
		result.append(", nombreJoursFonctionnementRestants: ");
		if (nombreJoursFonctionnementRestantsESet) result.append(nombreJoursFonctionnementRestants); else result.append("<unset>");
		result.append(", nombreLitsDeployesDisponibles: ");
		if (nombreLitsDeployesDisponiblesESet) result.append(nombreLitsDeployesDisponibles); else result.append("<unset>");
		result.append(", nombreLitsDeployesInfrastructure: ");
		if (nombreLitsDeployesInfrastructureESet) result.append(nombreLitsDeployesInfrastructure); else result.append("<unset>");
		result.append(", nombreLitsDeployesOccupes: ");
		if (nombreLitsDeployesOccupesESet) result.append(nombreLitsDeployesOccupes); else result.append("<unset>");
		result.append(", nombrePostesNRBC: ");
		if (nombrePostesNRBCESet) result.append(nombrePostesNRBC); else result.append("<unset>");
		result.append(", nombrePostesSecours: ");
		if (nombrePostesSecoursESet) result.append(nombrePostesSecours); else result.append("<unset>");
		result.append(", nombreSectionsTriageExistantes: ");
		if (nombreSectionsTriageExistantesESet) result.append(nombreSectionsTriageExistantes); else result.append("<unset>");
		result.append(", nombreUnitesSangReserve: ");
		if (nombreUnitesSangReserveESet) result.append(nombreUnitesSangReserve); else result.append("<unset>");
		result.append(", potentielBrules: ");
		if (potentielBrulesESet) result.append(potentielBrules); else result.append("<unset>");
		result.append(", potentielChirurgical: ");
		if (potentielChirurgicalESet) result.append(potentielChirurgical); else result.append("<unset>");
		result.append(", situationEpidemies: ");
		result.append(situationEpidemies);
		result.append(", situationPertesMassives: ");
		result.append(situationPertesMassives);
		result.append(", dateSyntheseSante: ");
		result.append(dateSyntheseSante);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeSyntheseSanteImpl
