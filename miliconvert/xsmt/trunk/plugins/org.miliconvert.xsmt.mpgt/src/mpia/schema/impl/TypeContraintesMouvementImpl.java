/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeContraintesMouvement;
import mpia.schema.TypeVehiculeExceptionnel;

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
 * An implementation of the model object '<em><b>Type Contraintes Mouvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getAutorouteLongueurEncombrement <em>Autoroute Longueur Encombrement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getAutorouteDureeEcoulement <em>Autoroute Duree Ecoulement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getAutorouteDistanceEntreVehicules <em>Autoroute Distance Entre Vehicules</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getAutorouteVitesseMoyenne <em>Autoroute Vitesse Moyenne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getContraintesColonnes <em>Contraintes Colonnes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getIntervalleTempsEntreRames <em>Intervalle Temps Entre Rames</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getIntervalleTempsEntreGroupementsMarche <em>Intervalle Temps Entre Groupements Marche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getConsignesParticulieres <em>Consignes Particulieres</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getHauteurMaximaleVehicules <em>Hauteur Maximale Vehicules</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getIntervalleTempsEntreUniteMarche <em>Intervalle Temps Entre Unite Marche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getLargeurMaximaleVehicule <em>Largeur Maximale Vehicule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getMesuresPrecautionsOTAN <em>Mesures Precautions OTAN</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getNombreRames <em>Nombre Rames</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getNombreVehiculesAChenilles <em>Nombre Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getNombreVehiculesPlusLourd <em>Nombre Vehicules Plus Lourd</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getLongueurMaximaleVehicule <em>Longueur Maximale Vehicule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getNombreGroupementsMarche <em>Nombre Groupements Marche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getNombreUniteMarche <em>Nombre Unite Marche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getNombreVehiculesARoues <em>Nombre Vehicules ARoues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getPoidsVehiculePlusLourd <em>Poids Vehicule Plus Lourd</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getPTRAplusLourdAChenilles <em>PTR Aplus Lourd AChenilles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getRayonBraquageMaximal <em>Rayon Braquage Maximal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getRouteDureeEcoulement <em>Route Duree Ecoulement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getRouteVitesseMoyenne <em>Route Vitesse Moyenne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getPTRAplusLourdARoues <em>PTR Aplus Lourd ARoues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getRouteDistanceEntreVehicules <em>Route Distance Entre Vehicules</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getRouteLongueurEncombrement <em>Route Longueur Encombrement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getTypeVehiculePlusLourd <em>Type Vehicule Plus Lourd</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContraintesMouvementImpl#getACommeVehiculePlusContraignantVehiculeExceptionnel <em>AComme Vehicule Plus Contraignant Vehicule Exceptionnel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeContraintesMouvementImpl extends EObjectImpl implements TypeContraintesMouvement {
	/**
	 * The cached value of the '{@link #getAutorouteLongueurEncombrement() <em>Autoroute Longueur Encombrement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutorouteLongueurEncombrement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur autorouteLongueurEncombrement;

	/**
	 * The cached value of the '{@link #getAutorouteDureeEcoulement() <em>Autoroute Duree Ecoulement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutorouteDureeEcoulement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree autorouteDureeEcoulement;

	/**
	 * The cached value of the '{@link #getAutorouteDistanceEntreVehicules() <em>Autoroute Distance Entre Vehicules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutorouteDistanceEntreVehicules()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur autorouteDistanceEntreVehicules;

	/**
	 * The cached value of the '{@link #getAutorouteVitesseMoyenne() <em>Autoroute Vitesse Moyenne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutorouteVitesseMoyenne()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire autorouteVitesseMoyenne;

	/**
	 * The default value of the '{@link #getContraintesColonnes() <em>Contraintes Colonnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintesColonnes()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRAINTES_COLONNES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContraintesColonnes() <em>Contraintes Colonnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintesColonnes()
	 * @generated
	 * @ordered
	 */
	protected String contraintesColonnes = CONTRAINTES_COLONNES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntervalleTempsEntreRames() <em>Intervalle Temps Entre Rames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleTempsEntreRames()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree intervalleTempsEntreRames;

	/**
	 * The cached value of the '{@link #getIntervalleTempsEntreGroupementsMarche() <em>Intervalle Temps Entre Groupements Marche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleTempsEntreGroupementsMarche()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree intervalleTempsEntreGroupementsMarche;

	/**
	 * The default value of the '{@link #getConsignesParticulieres() <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignesParticulieres()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSIGNES_PARTICULIERES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsignesParticulieres() <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignesParticulieres()
	 * @generated
	 * @ordered
	 */
	protected String consignesParticulieres = CONSIGNES_PARTICULIERES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHauteurMaximaleVehicules() <em>Hauteur Maximale Vehicules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurMaximaleVehicules()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteurMaximaleVehicules;

	/**
	 * The cached value of the '{@link #getIntervalleTempsEntreUniteMarche() <em>Intervalle Temps Entre Unite Marche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleTempsEntreUniteMarche()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree intervalleTempsEntreUniteMarche;

	/**
	 * The default value of the '{@link #getClasseMilMaxPourVehiculesARoue() <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @generated
	 * @ordered
	 */
	protected static final long CLASSE_MIL_MAX_POUR_VEHICULES_AROUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClasseMilMaxPourVehiculesARoue() <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @generated
	 * @ordered
	 */
	protected long classeMilMaxPourVehiculesARoue = CLASSE_MIL_MAX_POUR_VEHICULES_AROUE_EDEFAULT;

	/**
	 * This is true if the Classe Mil Max Pour Vehicules ARoue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classeMilMaxPourVehiculesARoueESet;

	/**
	 * The default value of the '{@link #getClasseMiMaxPourVehiculesAChenilles() <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected static final long CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClasseMiMaxPourVehiculesAChenilles() <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected long classeMiMaxPourVehiculesAChenilles = CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES_EDEFAULT;

	/**
	 * This is true if the Classe Mi Max Pour Vehicules AChenilles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classeMiMaxPourVehiculesAChenillesESet;

	/**
	 * The cached value of the '{@link #getLargeurMaximaleVehicule() <em>Largeur Maximale Vehicule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurMaximaleVehicule()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurMaximaleVehicule;

	/**
	 * The default value of the '{@link #getMesuresPrecautionsOTAN() <em>Mesures Precautions OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresPrecautionsOTAN()
	 * @generated
	 * @ordered
	 */
	protected static final String MESURES_PRECAUTIONS_OTAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMesuresPrecautionsOTAN() <em>Mesures Precautions OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresPrecautionsOTAN()
	 * @generated
	 * @ordered
	 */
	protected String mesuresPrecautionsOTAN = MESURES_PRECAUTIONS_OTAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreRames() <em>Nombre Rames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRames()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_RAMES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreRames() <em>Nombre Rames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRames()
	 * @generated
	 * @ordered
	 */
	protected long nombreRames = NOMBRE_RAMES_EDEFAULT;

	/**
	 * This is true if the Nombre Rames attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreRamesESet;

	/**
	 * The default value of the '{@link #getNombreVehiculesAChenilles() <em>Nombre Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VEHICULES_ACHENILLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVehiculesAChenilles() <em>Nombre Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected long nombreVehiculesAChenilles = NOMBRE_VEHICULES_ACHENILLES_EDEFAULT;

	/**
	 * This is true if the Nombre Vehicules AChenilles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVehiculesAChenillesESet;

	/**
	 * The default value of the '{@link #getNombreVehiculesPlusLourd() <em>Nombre Vehicules Plus Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesPlusLourd()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VEHICULES_PLUS_LOURD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVehiculesPlusLourd() <em>Nombre Vehicules Plus Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesPlusLourd()
	 * @generated
	 * @ordered
	 */
	protected long nombreVehiculesPlusLourd = NOMBRE_VEHICULES_PLUS_LOURD_EDEFAULT;

	/**
	 * This is true if the Nombre Vehicules Plus Lourd attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVehiculesPlusLourdESet;

	/**
	 * The cached value of the '{@link #getLongueurMaximaleVehicule() <em>Longueur Maximale Vehicule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurMaximaleVehicule()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueurMaximaleVehicule;

	/**
	 * The default value of the '{@link #getNombreGroupementsMarche() <em>Nombre Groupements Marche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGroupementsMarche()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_GROUPEMENTS_MARCHE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreGroupementsMarche() <em>Nombre Groupements Marche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGroupementsMarche()
	 * @generated
	 * @ordered
	 */
	protected long nombreGroupementsMarche = NOMBRE_GROUPEMENTS_MARCHE_EDEFAULT;

	/**
	 * This is true if the Nombre Groupements Marche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreGroupementsMarcheESet;

	/**
	 * The default value of the '{@link #getNombreUniteMarche() <em>Nombre Unite Marche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreUniteMarche()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_UNITE_MARCHE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreUniteMarche() <em>Nombre Unite Marche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreUniteMarche()
	 * @generated
	 * @ordered
	 */
	protected long nombreUniteMarche = NOMBRE_UNITE_MARCHE_EDEFAULT;

	/**
	 * This is true if the Nombre Unite Marche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreUniteMarcheESet;

	/**
	 * The default value of the '{@link #getNombreVehiculesARoues() <em>Nombre Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesARoues()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VEHICULES_AROUES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVehiculesARoues() <em>Nombre Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesARoues()
	 * @generated
	 * @ordered
	 */
	protected long nombreVehiculesARoues = NOMBRE_VEHICULES_AROUES_EDEFAULT;

	/**
	 * This is true if the Nombre Vehicules ARoues attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVehiculesARouesESet;

	/**
	 * The cached value of the '{@link #getPoidsVehiculePlusLourd() <em>Poids Vehicule Plus Lourd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoidsVehiculePlusLourd()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse poidsVehiculePlusLourd;

	/**
	 * The cached value of the '{@link #getPTRAplusLourdAChenilles() <em>PTR Aplus Lourd AChenilles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTRAplusLourdAChenilles()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse pTRAplusLourdAChenilles;

	/**
	 * The cached value of the '{@link #getRayonBraquageMaximal() <em>Rayon Braquage Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonBraquageMaximal()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayonBraquageMaximal;

	/**
	 * The cached value of the '{@link #getRouteDureeEcoulement() <em>Route Duree Ecoulement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDureeEcoulement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree routeDureeEcoulement;

	/**
	 * The cached value of the '{@link #getRouteVitesseMoyenne() <em>Route Vitesse Moyenne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteVitesseMoyenne()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire routeVitesseMoyenne;

	/**
	 * The cached value of the '{@link #getPTRAplusLourdARoues() <em>PTR Aplus Lourd ARoues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTRAplusLourdARoues()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse pTRAplusLourdARoues;

	/**
	 * The cached value of the '{@link #getRouteDistanceEntreVehicules() <em>Route Distance Entre Vehicules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDistanceEntreVehicules()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur routeDistanceEntreVehicules;

	/**
	 * The cached value of the '{@link #getRouteLongueurEncombrement() <em>Route Longueur Encombrement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteLongueurEncombrement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur routeLongueurEncombrement;

	/**
	 * The default value of the '{@link #getTypeVehiculePlusLourd() <em>Type Vehicule Plus Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVehiculePlusLourd()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_VEHICULE_PLUS_LOURD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeVehiculePlusLourd() <em>Type Vehicule Plus Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVehiculePlusLourd()
	 * @generated
	 * @ordered
	 */
	protected String typeVehiculePlusLourd = TYPE_VEHICULE_PLUS_LOURD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeVehiculePlusContraignantVehiculeExceptionnel() <em>AComme Vehicule Plus Contraignant Vehicule Exceptionnel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeVehiculePlusContraignantVehiculeExceptionnel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVehiculeExceptionnel> aCommeVehiculePlusContraignantVehiculeExceptionnel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeContraintesMouvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeContraintesMouvement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getAutorouteLongueurEncombrement() {
		return autorouteLongueurEncombrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutorouteLongueurEncombrement(TypeDataTypeLongueur newAutorouteLongueurEncombrement, NotificationChain msgs) {
		TypeDataTypeLongueur oldAutorouteLongueurEncombrement = autorouteLongueurEncombrement;
		autorouteLongueurEncombrement = newAutorouteLongueurEncombrement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_LONGUEUR_ENCOMBREMENT, oldAutorouteLongueurEncombrement, newAutorouteLongueurEncombrement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutorouteLongueurEncombrement(TypeDataTypeLongueur newAutorouteLongueurEncombrement) {
		if (newAutorouteLongueurEncombrement != autorouteLongueurEncombrement) {
			NotificationChain msgs = null;
			if (autorouteLongueurEncombrement != null)
				msgs = ((InternalEObject)autorouteLongueurEncombrement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_LONGUEUR_ENCOMBREMENT, null, msgs);
			if (newAutorouteLongueurEncombrement != null)
				msgs = ((InternalEObject)newAutorouteLongueurEncombrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_LONGUEUR_ENCOMBREMENT, null, msgs);
			msgs = basicSetAutorouteLongueurEncombrement(newAutorouteLongueurEncombrement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_LONGUEUR_ENCOMBREMENT, newAutorouteLongueurEncombrement, newAutorouteLongueurEncombrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getAutorouteDureeEcoulement() {
		return autorouteDureeEcoulement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutorouteDureeEcoulement(TypeDataTypeDuree newAutorouteDureeEcoulement, NotificationChain msgs) {
		TypeDataTypeDuree oldAutorouteDureeEcoulement = autorouteDureeEcoulement;
		autorouteDureeEcoulement = newAutorouteDureeEcoulement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DUREE_ECOULEMENT, oldAutorouteDureeEcoulement, newAutorouteDureeEcoulement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutorouteDureeEcoulement(TypeDataTypeDuree newAutorouteDureeEcoulement) {
		if (newAutorouteDureeEcoulement != autorouteDureeEcoulement) {
			NotificationChain msgs = null;
			if (autorouteDureeEcoulement != null)
				msgs = ((InternalEObject)autorouteDureeEcoulement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DUREE_ECOULEMENT, null, msgs);
			if (newAutorouteDureeEcoulement != null)
				msgs = ((InternalEObject)newAutorouteDureeEcoulement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DUREE_ECOULEMENT, null, msgs);
			msgs = basicSetAutorouteDureeEcoulement(newAutorouteDureeEcoulement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DUREE_ECOULEMENT, newAutorouteDureeEcoulement, newAutorouteDureeEcoulement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getAutorouteDistanceEntreVehicules() {
		return autorouteDistanceEntreVehicules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutorouteDistanceEntreVehicules(TypeDataTypeLongueur newAutorouteDistanceEntreVehicules, NotificationChain msgs) {
		TypeDataTypeLongueur oldAutorouteDistanceEntreVehicules = autorouteDistanceEntreVehicules;
		autorouteDistanceEntreVehicules = newAutorouteDistanceEntreVehicules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DISTANCE_ENTRE_VEHICULES, oldAutorouteDistanceEntreVehicules, newAutorouteDistanceEntreVehicules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutorouteDistanceEntreVehicules(TypeDataTypeLongueur newAutorouteDistanceEntreVehicules) {
		if (newAutorouteDistanceEntreVehicules != autorouteDistanceEntreVehicules) {
			NotificationChain msgs = null;
			if (autorouteDistanceEntreVehicules != null)
				msgs = ((InternalEObject)autorouteDistanceEntreVehicules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DISTANCE_ENTRE_VEHICULES, null, msgs);
			if (newAutorouteDistanceEntreVehicules != null)
				msgs = ((InternalEObject)newAutorouteDistanceEntreVehicules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DISTANCE_ENTRE_VEHICULES, null, msgs);
			msgs = basicSetAutorouteDistanceEntreVehicules(newAutorouteDistanceEntreVehicules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DISTANCE_ENTRE_VEHICULES, newAutorouteDistanceEntreVehicules, newAutorouteDistanceEntreVehicules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getAutorouteVitesseMoyenne() {
		return autorouteVitesseMoyenne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutorouteVitesseMoyenne(TypeDataTypeVitesseLineaire newAutorouteVitesseMoyenne, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldAutorouteVitesseMoyenne = autorouteVitesseMoyenne;
		autorouteVitesseMoyenne = newAutorouteVitesseMoyenne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_VITESSE_MOYENNE, oldAutorouteVitesseMoyenne, newAutorouteVitesseMoyenne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutorouteVitesseMoyenne(TypeDataTypeVitesseLineaire newAutorouteVitesseMoyenne) {
		if (newAutorouteVitesseMoyenne != autorouteVitesseMoyenne) {
			NotificationChain msgs = null;
			if (autorouteVitesseMoyenne != null)
				msgs = ((InternalEObject)autorouteVitesseMoyenne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_VITESSE_MOYENNE, null, msgs);
			if (newAutorouteVitesseMoyenne != null)
				msgs = ((InternalEObject)newAutorouteVitesseMoyenne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_VITESSE_MOYENNE, null, msgs);
			msgs = basicSetAutorouteVitesseMoyenne(newAutorouteVitesseMoyenne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_VITESSE_MOYENNE, newAutorouteVitesseMoyenne, newAutorouteVitesseMoyenne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContraintesColonnes() {
		return contraintesColonnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraintesColonnes(String newContraintesColonnes) {
		String oldContraintesColonnes = contraintesColonnes;
		contraintesColonnes = newContraintesColonnes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONTRAINTES_COLONNES, oldContraintesColonnes, contraintesColonnes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getIntervalleTempsEntreRames() {
		return intervalleTempsEntreRames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalleTempsEntreRames(TypeDataTypeDuree newIntervalleTempsEntreRames, NotificationChain msgs) {
		TypeDataTypeDuree oldIntervalleTempsEntreRames = intervalleTempsEntreRames;
		intervalleTempsEntreRames = newIntervalleTempsEntreRames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_RAMES, oldIntervalleTempsEntreRames, newIntervalleTempsEntreRames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalleTempsEntreRames(TypeDataTypeDuree newIntervalleTempsEntreRames) {
		if (newIntervalleTempsEntreRames != intervalleTempsEntreRames) {
			NotificationChain msgs = null;
			if (intervalleTempsEntreRames != null)
				msgs = ((InternalEObject)intervalleTempsEntreRames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_RAMES, null, msgs);
			if (newIntervalleTempsEntreRames != null)
				msgs = ((InternalEObject)newIntervalleTempsEntreRames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_RAMES, null, msgs);
			msgs = basicSetIntervalleTempsEntreRames(newIntervalleTempsEntreRames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_RAMES, newIntervalleTempsEntreRames, newIntervalleTempsEntreRames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getIntervalleTempsEntreGroupementsMarche() {
		return intervalleTempsEntreGroupementsMarche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalleTempsEntreGroupementsMarche(TypeDataTypeDuree newIntervalleTempsEntreGroupementsMarche, NotificationChain msgs) {
		TypeDataTypeDuree oldIntervalleTempsEntreGroupementsMarche = intervalleTempsEntreGroupementsMarche;
		intervalleTempsEntreGroupementsMarche = newIntervalleTempsEntreGroupementsMarche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_GROUPEMENTS_MARCHE, oldIntervalleTempsEntreGroupementsMarche, newIntervalleTempsEntreGroupementsMarche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalleTempsEntreGroupementsMarche(TypeDataTypeDuree newIntervalleTempsEntreGroupementsMarche) {
		if (newIntervalleTempsEntreGroupementsMarche != intervalleTempsEntreGroupementsMarche) {
			NotificationChain msgs = null;
			if (intervalleTempsEntreGroupementsMarche != null)
				msgs = ((InternalEObject)intervalleTempsEntreGroupementsMarche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_GROUPEMENTS_MARCHE, null, msgs);
			if (newIntervalleTempsEntreGroupementsMarche != null)
				msgs = ((InternalEObject)newIntervalleTempsEntreGroupementsMarche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_GROUPEMENTS_MARCHE, null, msgs);
			msgs = basicSetIntervalleTempsEntreGroupementsMarche(newIntervalleTempsEntreGroupementsMarche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_GROUPEMENTS_MARCHE, newIntervalleTempsEntreGroupementsMarche, newIntervalleTempsEntreGroupementsMarche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsignesParticulieres() {
		return consignesParticulieres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsignesParticulieres(String newConsignesParticulieres) {
		String oldConsignesParticulieres = consignesParticulieres;
		consignesParticulieres = newConsignesParticulieres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONSIGNES_PARTICULIERES, oldConsignesParticulieres, consignesParticulieres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteurMaximaleVehicules() {
		return hauteurMaximaleVehicules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteurMaximaleVehicules(TypeDataTypeLongueur newHauteurMaximaleVehicules, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteurMaximaleVehicules = hauteurMaximaleVehicules;
		hauteurMaximaleVehicules = newHauteurMaximaleVehicules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__HAUTEUR_MAXIMALE_VEHICULES, oldHauteurMaximaleVehicules, newHauteurMaximaleVehicules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurMaximaleVehicules(TypeDataTypeLongueur newHauteurMaximaleVehicules) {
		if (newHauteurMaximaleVehicules != hauteurMaximaleVehicules) {
			NotificationChain msgs = null;
			if (hauteurMaximaleVehicules != null)
				msgs = ((InternalEObject)hauteurMaximaleVehicules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__HAUTEUR_MAXIMALE_VEHICULES, null, msgs);
			if (newHauteurMaximaleVehicules != null)
				msgs = ((InternalEObject)newHauteurMaximaleVehicules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__HAUTEUR_MAXIMALE_VEHICULES, null, msgs);
			msgs = basicSetHauteurMaximaleVehicules(newHauteurMaximaleVehicules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__HAUTEUR_MAXIMALE_VEHICULES, newHauteurMaximaleVehicules, newHauteurMaximaleVehicules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getIntervalleTempsEntreUniteMarche() {
		return intervalleTempsEntreUniteMarche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalleTempsEntreUniteMarche(TypeDataTypeDuree newIntervalleTempsEntreUniteMarche, NotificationChain msgs) {
		TypeDataTypeDuree oldIntervalleTempsEntreUniteMarche = intervalleTempsEntreUniteMarche;
		intervalleTempsEntreUniteMarche = newIntervalleTempsEntreUniteMarche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_UNITE_MARCHE, oldIntervalleTempsEntreUniteMarche, newIntervalleTempsEntreUniteMarche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalleTempsEntreUniteMarche(TypeDataTypeDuree newIntervalleTempsEntreUniteMarche) {
		if (newIntervalleTempsEntreUniteMarche != intervalleTempsEntreUniteMarche) {
			NotificationChain msgs = null;
			if (intervalleTempsEntreUniteMarche != null)
				msgs = ((InternalEObject)intervalleTempsEntreUniteMarche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_UNITE_MARCHE, null, msgs);
			if (newIntervalleTempsEntreUniteMarche != null)
				msgs = ((InternalEObject)newIntervalleTempsEntreUniteMarche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_UNITE_MARCHE, null, msgs);
			msgs = basicSetIntervalleTempsEntreUniteMarche(newIntervalleTempsEntreUniteMarche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_UNITE_MARCHE, newIntervalleTempsEntreUniteMarche, newIntervalleTempsEntreUniteMarche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClasseMilMaxPourVehiculesARoue() {
		return classeMilMaxPourVehiculesARoue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasseMilMaxPourVehiculesARoue(long newClasseMilMaxPourVehiculesARoue) {
		long oldClasseMilMaxPourVehiculesARoue = classeMilMaxPourVehiculesARoue;
		classeMilMaxPourVehiculesARoue = newClasseMilMaxPourVehiculesARoue;
		boolean oldClasseMilMaxPourVehiculesARoueESet = classeMilMaxPourVehiculesARoueESet;
		classeMilMaxPourVehiculesARoueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE, oldClasseMilMaxPourVehiculesARoue, classeMilMaxPourVehiculesARoue, !oldClasseMilMaxPourVehiculesARoueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClasseMilMaxPourVehiculesARoue() {
		long oldClasseMilMaxPourVehiculesARoue = classeMilMaxPourVehiculesARoue;
		boolean oldClasseMilMaxPourVehiculesARoueESet = classeMilMaxPourVehiculesARoueESet;
		classeMilMaxPourVehiculesARoue = CLASSE_MIL_MAX_POUR_VEHICULES_AROUE_EDEFAULT;
		classeMilMaxPourVehiculesARoueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE, oldClasseMilMaxPourVehiculesARoue, CLASSE_MIL_MAX_POUR_VEHICULES_AROUE_EDEFAULT, oldClasseMilMaxPourVehiculesARoueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClasseMilMaxPourVehiculesARoue() {
		return classeMilMaxPourVehiculesARoueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClasseMiMaxPourVehiculesAChenilles() {
		return classeMiMaxPourVehiculesAChenilles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasseMiMaxPourVehiculesAChenilles(long newClasseMiMaxPourVehiculesAChenilles) {
		long oldClasseMiMaxPourVehiculesAChenilles = classeMiMaxPourVehiculesAChenilles;
		classeMiMaxPourVehiculesAChenilles = newClasseMiMaxPourVehiculesAChenilles;
		boolean oldClasseMiMaxPourVehiculesAChenillesESet = classeMiMaxPourVehiculesAChenillesESet;
		classeMiMaxPourVehiculesAChenillesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES, oldClasseMiMaxPourVehiculesAChenilles, classeMiMaxPourVehiculesAChenilles, !oldClasseMiMaxPourVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClasseMiMaxPourVehiculesAChenilles() {
		long oldClasseMiMaxPourVehiculesAChenilles = classeMiMaxPourVehiculesAChenilles;
		boolean oldClasseMiMaxPourVehiculesAChenillesESet = classeMiMaxPourVehiculesAChenillesESet;
		classeMiMaxPourVehiculesAChenilles = CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES_EDEFAULT;
		classeMiMaxPourVehiculesAChenillesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES, oldClasseMiMaxPourVehiculesAChenilles, CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES_EDEFAULT, oldClasseMiMaxPourVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClasseMiMaxPourVehiculesAChenilles() {
		return classeMiMaxPourVehiculesAChenillesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurMaximaleVehicule() {
		return largeurMaximaleVehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurMaximaleVehicule(TypeDataTypeLongueur newLargeurMaximaleVehicule, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurMaximaleVehicule = largeurMaximaleVehicule;
		largeurMaximaleVehicule = newLargeurMaximaleVehicule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LARGEUR_MAXIMALE_VEHICULE, oldLargeurMaximaleVehicule, newLargeurMaximaleVehicule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurMaximaleVehicule(TypeDataTypeLongueur newLargeurMaximaleVehicule) {
		if (newLargeurMaximaleVehicule != largeurMaximaleVehicule) {
			NotificationChain msgs = null;
			if (largeurMaximaleVehicule != null)
				msgs = ((InternalEObject)largeurMaximaleVehicule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LARGEUR_MAXIMALE_VEHICULE, null, msgs);
			if (newLargeurMaximaleVehicule != null)
				msgs = ((InternalEObject)newLargeurMaximaleVehicule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LARGEUR_MAXIMALE_VEHICULE, null, msgs);
			msgs = basicSetLargeurMaximaleVehicule(newLargeurMaximaleVehicule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LARGEUR_MAXIMALE_VEHICULE, newLargeurMaximaleVehicule, newLargeurMaximaleVehicule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMesuresPrecautionsOTAN() {
		return mesuresPrecautionsOTAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesuresPrecautionsOTAN(String newMesuresPrecautionsOTAN) {
		String oldMesuresPrecautionsOTAN = mesuresPrecautionsOTAN;
		mesuresPrecautionsOTAN = newMesuresPrecautionsOTAN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__MESURES_PRECAUTIONS_OTAN, oldMesuresPrecautionsOTAN, mesuresPrecautionsOTAN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreRames() {
		return nombreRames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreRames(long newNombreRames) {
		long oldNombreRames = nombreRames;
		nombreRames = newNombreRames;
		boolean oldNombreRamesESet = nombreRamesESet;
		nombreRamesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_RAMES, oldNombreRames, nombreRames, !oldNombreRamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreRames() {
		long oldNombreRames = nombreRames;
		boolean oldNombreRamesESet = nombreRamesESet;
		nombreRames = NOMBRE_RAMES_EDEFAULT;
		nombreRamesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_RAMES, oldNombreRames, NOMBRE_RAMES_EDEFAULT, oldNombreRamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreRames() {
		return nombreRamesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVehiculesAChenilles() {
		return nombreVehiculesAChenilles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVehiculesAChenilles(long newNombreVehiculesAChenilles) {
		long oldNombreVehiculesAChenilles = nombreVehiculesAChenilles;
		nombreVehiculesAChenilles = newNombreVehiculesAChenilles;
		boolean oldNombreVehiculesAChenillesESet = nombreVehiculesAChenillesESet;
		nombreVehiculesAChenillesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES, oldNombreVehiculesAChenilles, nombreVehiculesAChenilles, !oldNombreVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVehiculesAChenilles() {
		long oldNombreVehiculesAChenilles = nombreVehiculesAChenilles;
		boolean oldNombreVehiculesAChenillesESet = nombreVehiculesAChenillesESet;
		nombreVehiculesAChenilles = NOMBRE_VEHICULES_ACHENILLES_EDEFAULT;
		nombreVehiculesAChenillesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES, oldNombreVehiculesAChenilles, NOMBRE_VEHICULES_ACHENILLES_EDEFAULT, oldNombreVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVehiculesAChenilles() {
		return nombreVehiculesAChenillesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVehiculesPlusLourd() {
		return nombreVehiculesPlusLourd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVehiculesPlusLourd(long newNombreVehiculesPlusLourd) {
		long oldNombreVehiculesPlusLourd = nombreVehiculesPlusLourd;
		nombreVehiculesPlusLourd = newNombreVehiculesPlusLourd;
		boolean oldNombreVehiculesPlusLourdESet = nombreVehiculesPlusLourdESet;
		nombreVehiculesPlusLourdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_PLUS_LOURD, oldNombreVehiculesPlusLourd, nombreVehiculesPlusLourd, !oldNombreVehiculesPlusLourdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVehiculesPlusLourd() {
		long oldNombreVehiculesPlusLourd = nombreVehiculesPlusLourd;
		boolean oldNombreVehiculesPlusLourdESet = nombreVehiculesPlusLourdESet;
		nombreVehiculesPlusLourd = NOMBRE_VEHICULES_PLUS_LOURD_EDEFAULT;
		nombreVehiculesPlusLourdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_PLUS_LOURD, oldNombreVehiculesPlusLourd, NOMBRE_VEHICULES_PLUS_LOURD_EDEFAULT, oldNombreVehiculesPlusLourdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVehiculesPlusLourd() {
		return nombreVehiculesPlusLourdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueurMaximaleVehicule() {
		return longueurMaximaleVehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueurMaximaleVehicule(TypeDataTypeLongueur newLongueurMaximaleVehicule, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueurMaximaleVehicule = longueurMaximaleVehicule;
		longueurMaximaleVehicule = newLongueurMaximaleVehicule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LONGUEUR_MAXIMALE_VEHICULE, oldLongueurMaximaleVehicule, newLongueurMaximaleVehicule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurMaximaleVehicule(TypeDataTypeLongueur newLongueurMaximaleVehicule) {
		if (newLongueurMaximaleVehicule != longueurMaximaleVehicule) {
			NotificationChain msgs = null;
			if (longueurMaximaleVehicule != null)
				msgs = ((InternalEObject)longueurMaximaleVehicule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LONGUEUR_MAXIMALE_VEHICULE, null, msgs);
			if (newLongueurMaximaleVehicule != null)
				msgs = ((InternalEObject)newLongueurMaximaleVehicule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LONGUEUR_MAXIMALE_VEHICULE, null, msgs);
			msgs = basicSetLongueurMaximaleVehicule(newLongueurMaximaleVehicule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LONGUEUR_MAXIMALE_VEHICULE, newLongueurMaximaleVehicule, newLongueurMaximaleVehicule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreGroupementsMarche() {
		return nombreGroupementsMarche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreGroupementsMarche(long newNombreGroupementsMarche) {
		long oldNombreGroupementsMarche = nombreGroupementsMarche;
		nombreGroupementsMarche = newNombreGroupementsMarche;
		boolean oldNombreGroupementsMarcheESet = nombreGroupementsMarcheESet;
		nombreGroupementsMarcheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_GROUPEMENTS_MARCHE, oldNombreGroupementsMarche, nombreGroupementsMarche, !oldNombreGroupementsMarcheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreGroupementsMarche() {
		long oldNombreGroupementsMarche = nombreGroupementsMarche;
		boolean oldNombreGroupementsMarcheESet = nombreGroupementsMarcheESet;
		nombreGroupementsMarche = NOMBRE_GROUPEMENTS_MARCHE_EDEFAULT;
		nombreGroupementsMarcheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_GROUPEMENTS_MARCHE, oldNombreGroupementsMarche, NOMBRE_GROUPEMENTS_MARCHE_EDEFAULT, oldNombreGroupementsMarcheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreGroupementsMarche() {
		return nombreGroupementsMarcheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreUniteMarche() {
		return nombreUniteMarche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreUniteMarche(long newNombreUniteMarche) {
		long oldNombreUniteMarche = nombreUniteMarche;
		nombreUniteMarche = newNombreUniteMarche;
		boolean oldNombreUniteMarcheESet = nombreUniteMarcheESet;
		nombreUniteMarcheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_UNITE_MARCHE, oldNombreUniteMarche, nombreUniteMarche, !oldNombreUniteMarcheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreUniteMarche() {
		long oldNombreUniteMarche = nombreUniteMarche;
		boolean oldNombreUniteMarcheESet = nombreUniteMarcheESet;
		nombreUniteMarche = NOMBRE_UNITE_MARCHE_EDEFAULT;
		nombreUniteMarcheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_UNITE_MARCHE, oldNombreUniteMarche, NOMBRE_UNITE_MARCHE_EDEFAULT, oldNombreUniteMarcheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreUniteMarche() {
		return nombreUniteMarcheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVehiculesARoues() {
		return nombreVehiculesARoues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVehiculesARoues(long newNombreVehiculesARoues) {
		long oldNombreVehiculesARoues = nombreVehiculesARoues;
		nombreVehiculesARoues = newNombreVehiculesARoues;
		boolean oldNombreVehiculesARouesESet = nombreVehiculesARouesESet;
		nombreVehiculesARouesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_AROUES, oldNombreVehiculesARoues, nombreVehiculesARoues, !oldNombreVehiculesARouesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVehiculesARoues() {
		long oldNombreVehiculesARoues = nombreVehiculesARoues;
		boolean oldNombreVehiculesARouesESet = nombreVehiculesARouesESet;
		nombreVehiculesARoues = NOMBRE_VEHICULES_AROUES_EDEFAULT;
		nombreVehiculesARouesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_AROUES, oldNombreVehiculesARoues, NOMBRE_VEHICULES_AROUES_EDEFAULT, oldNombreVehiculesARouesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVehiculesARoues() {
		return nombreVehiculesARouesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getPoidsVehiculePlusLourd() {
		return poidsVehiculePlusLourd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoidsVehiculePlusLourd(TypeDataTypeMasse newPoidsVehiculePlusLourd, NotificationChain msgs) {
		TypeDataTypeMasse oldPoidsVehiculePlusLourd = poidsVehiculePlusLourd;
		poidsVehiculePlusLourd = newPoidsVehiculePlusLourd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__POIDS_VEHICULE_PLUS_LOURD, oldPoidsVehiculePlusLourd, newPoidsVehiculePlusLourd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoidsVehiculePlusLourd(TypeDataTypeMasse newPoidsVehiculePlusLourd) {
		if (newPoidsVehiculePlusLourd != poidsVehiculePlusLourd) {
			NotificationChain msgs = null;
			if (poidsVehiculePlusLourd != null)
				msgs = ((InternalEObject)poidsVehiculePlusLourd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__POIDS_VEHICULE_PLUS_LOURD, null, msgs);
			if (newPoidsVehiculePlusLourd != null)
				msgs = ((InternalEObject)newPoidsVehiculePlusLourd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__POIDS_VEHICULE_PLUS_LOURD, null, msgs);
			msgs = basicSetPoidsVehiculePlusLourd(newPoidsVehiculePlusLourd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__POIDS_VEHICULE_PLUS_LOURD, newPoidsVehiculePlusLourd, newPoidsVehiculePlusLourd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getPTRAplusLourdAChenilles() {
		return pTRAplusLourdAChenilles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTRAplusLourdAChenilles(TypeDataTypeMasse newPTRAplusLourdAChenilles, NotificationChain msgs) {
		TypeDataTypeMasse oldPTRAplusLourdAChenilles = pTRAplusLourdAChenilles;
		pTRAplusLourdAChenilles = newPTRAplusLourdAChenilles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_ACHENILLES, oldPTRAplusLourdAChenilles, newPTRAplusLourdAChenilles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTRAplusLourdAChenilles(TypeDataTypeMasse newPTRAplusLourdAChenilles) {
		if (newPTRAplusLourdAChenilles != pTRAplusLourdAChenilles) {
			NotificationChain msgs = null;
			if (pTRAplusLourdAChenilles != null)
				msgs = ((InternalEObject)pTRAplusLourdAChenilles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_ACHENILLES, null, msgs);
			if (newPTRAplusLourdAChenilles != null)
				msgs = ((InternalEObject)newPTRAplusLourdAChenilles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_ACHENILLES, null, msgs);
			msgs = basicSetPTRAplusLourdAChenilles(newPTRAplusLourdAChenilles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_ACHENILLES, newPTRAplusLourdAChenilles, newPTRAplusLourdAChenilles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayonBraquageMaximal() {
		return rayonBraquageMaximal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayonBraquageMaximal(TypeDataTypeLongueur newRayonBraquageMaximal, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayonBraquageMaximal = rayonBraquageMaximal;
		rayonBraquageMaximal = newRayonBraquageMaximal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__RAYON_BRAQUAGE_MAXIMAL, oldRayonBraquageMaximal, newRayonBraquageMaximal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonBraquageMaximal(TypeDataTypeLongueur newRayonBraquageMaximal) {
		if (newRayonBraquageMaximal != rayonBraquageMaximal) {
			NotificationChain msgs = null;
			if (rayonBraquageMaximal != null)
				msgs = ((InternalEObject)rayonBraquageMaximal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__RAYON_BRAQUAGE_MAXIMAL, null, msgs);
			if (newRayonBraquageMaximal != null)
				msgs = ((InternalEObject)newRayonBraquageMaximal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__RAYON_BRAQUAGE_MAXIMAL, null, msgs);
			msgs = basicSetRayonBraquageMaximal(newRayonBraquageMaximal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__RAYON_BRAQUAGE_MAXIMAL, newRayonBraquageMaximal, newRayonBraquageMaximal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getRouteDureeEcoulement() {
		return routeDureeEcoulement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteDureeEcoulement(TypeDataTypeDuree newRouteDureeEcoulement, NotificationChain msgs) {
		TypeDataTypeDuree oldRouteDureeEcoulement = routeDureeEcoulement;
		routeDureeEcoulement = newRouteDureeEcoulement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DUREE_ECOULEMENT, oldRouteDureeEcoulement, newRouteDureeEcoulement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteDureeEcoulement(TypeDataTypeDuree newRouteDureeEcoulement) {
		if (newRouteDureeEcoulement != routeDureeEcoulement) {
			NotificationChain msgs = null;
			if (routeDureeEcoulement != null)
				msgs = ((InternalEObject)routeDureeEcoulement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DUREE_ECOULEMENT, null, msgs);
			if (newRouteDureeEcoulement != null)
				msgs = ((InternalEObject)newRouteDureeEcoulement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DUREE_ECOULEMENT, null, msgs);
			msgs = basicSetRouteDureeEcoulement(newRouteDureeEcoulement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DUREE_ECOULEMENT, newRouteDureeEcoulement, newRouteDureeEcoulement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getRouteVitesseMoyenne() {
		return routeVitesseMoyenne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteVitesseMoyenne(TypeDataTypeVitesseLineaire newRouteVitesseMoyenne, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldRouteVitesseMoyenne = routeVitesseMoyenne;
		routeVitesseMoyenne = newRouteVitesseMoyenne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_VITESSE_MOYENNE, oldRouteVitesseMoyenne, newRouteVitesseMoyenne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteVitesseMoyenne(TypeDataTypeVitesseLineaire newRouteVitesseMoyenne) {
		if (newRouteVitesseMoyenne != routeVitesseMoyenne) {
			NotificationChain msgs = null;
			if (routeVitesseMoyenne != null)
				msgs = ((InternalEObject)routeVitesseMoyenne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_VITESSE_MOYENNE, null, msgs);
			if (newRouteVitesseMoyenne != null)
				msgs = ((InternalEObject)newRouteVitesseMoyenne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_VITESSE_MOYENNE, null, msgs);
			msgs = basicSetRouteVitesseMoyenne(newRouteVitesseMoyenne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_VITESSE_MOYENNE, newRouteVitesseMoyenne, newRouteVitesseMoyenne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getPTRAplusLourdARoues() {
		return pTRAplusLourdARoues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTRAplusLourdARoues(TypeDataTypeMasse newPTRAplusLourdARoues, NotificationChain msgs) {
		TypeDataTypeMasse oldPTRAplusLourdARoues = pTRAplusLourdARoues;
		pTRAplusLourdARoues = newPTRAplusLourdARoues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_AROUES, oldPTRAplusLourdARoues, newPTRAplusLourdARoues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTRAplusLourdARoues(TypeDataTypeMasse newPTRAplusLourdARoues) {
		if (newPTRAplusLourdARoues != pTRAplusLourdARoues) {
			NotificationChain msgs = null;
			if (pTRAplusLourdARoues != null)
				msgs = ((InternalEObject)pTRAplusLourdARoues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_AROUES, null, msgs);
			if (newPTRAplusLourdARoues != null)
				msgs = ((InternalEObject)newPTRAplusLourdARoues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_AROUES, null, msgs);
			msgs = basicSetPTRAplusLourdARoues(newPTRAplusLourdARoues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_AROUES, newPTRAplusLourdARoues, newPTRAplusLourdARoues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRouteDistanceEntreVehicules() {
		return routeDistanceEntreVehicules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteDistanceEntreVehicules(TypeDataTypeLongueur newRouteDistanceEntreVehicules, NotificationChain msgs) {
		TypeDataTypeLongueur oldRouteDistanceEntreVehicules = routeDistanceEntreVehicules;
		routeDistanceEntreVehicules = newRouteDistanceEntreVehicules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DISTANCE_ENTRE_VEHICULES, oldRouteDistanceEntreVehicules, newRouteDistanceEntreVehicules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteDistanceEntreVehicules(TypeDataTypeLongueur newRouteDistanceEntreVehicules) {
		if (newRouteDistanceEntreVehicules != routeDistanceEntreVehicules) {
			NotificationChain msgs = null;
			if (routeDistanceEntreVehicules != null)
				msgs = ((InternalEObject)routeDistanceEntreVehicules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DISTANCE_ENTRE_VEHICULES, null, msgs);
			if (newRouteDistanceEntreVehicules != null)
				msgs = ((InternalEObject)newRouteDistanceEntreVehicules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DISTANCE_ENTRE_VEHICULES, null, msgs);
			msgs = basicSetRouteDistanceEntreVehicules(newRouteDistanceEntreVehicules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DISTANCE_ENTRE_VEHICULES, newRouteDistanceEntreVehicules, newRouteDistanceEntreVehicules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRouteLongueurEncombrement() {
		return routeLongueurEncombrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteLongueurEncombrement(TypeDataTypeLongueur newRouteLongueurEncombrement, NotificationChain msgs) {
		TypeDataTypeLongueur oldRouteLongueurEncombrement = routeLongueurEncombrement;
		routeLongueurEncombrement = newRouteLongueurEncombrement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_LONGUEUR_ENCOMBREMENT, oldRouteLongueurEncombrement, newRouteLongueurEncombrement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteLongueurEncombrement(TypeDataTypeLongueur newRouteLongueurEncombrement) {
		if (newRouteLongueurEncombrement != routeLongueurEncombrement) {
			NotificationChain msgs = null;
			if (routeLongueurEncombrement != null)
				msgs = ((InternalEObject)routeLongueurEncombrement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_LONGUEUR_ENCOMBREMENT, null, msgs);
			if (newRouteLongueurEncombrement != null)
				msgs = ((InternalEObject)newRouteLongueurEncombrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_LONGUEUR_ENCOMBREMENT, null, msgs);
			msgs = basicSetRouteLongueurEncombrement(newRouteLongueurEncombrement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_LONGUEUR_ENCOMBREMENT, newRouteLongueurEncombrement, newRouteLongueurEncombrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeVehiculePlusLourd() {
		return typeVehiculePlusLourd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVehiculePlusLourd(String newTypeVehiculePlusLourd) {
		String oldTypeVehiculePlusLourd = typeVehiculePlusLourd;
		typeVehiculePlusLourd = newTypeVehiculePlusLourd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__TYPE_VEHICULE_PLUS_LOURD, oldTypeVehiculePlusLourd, typeVehiculePlusLourd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVehiculeExceptionnel> getACommeVehiculePlusContraignantVehiculeExceptionnel() {
		if (aCommeVehiculePlusContraignantVehiculeExceptionnel == null) {
			aCommeVehiculePlusContraignantVehiculeExceptionnel = new EObjectContainmentEList<TypeVehiculeExceptionnel>(TypeVehiculeExceptionnel.class, this, SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ACOMME_VEHICULE_PLUS_CONTRAIGNANT_VEHICULE_EXCEPTIONNEL);
		}
		return aCommeVehiculePlusContraignantVehiculeExceptionnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_LONGUEUR_ENCOMBREMENT:
				return basicSetAutorouteLongueurEncombrement(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DUREE_ECOULEMENT:
				return basicSetAutorouteDureeEcoulement(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DISTANCE_ENTRE_VEHICULES:
				return basicSetAutorouteDistanceEntreVehicules(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_VITESSE_MOYENNE:
				return basicSetAutorouteVitesseMoyenne(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_RAMES:
				return basicSetIntervalleTempsEntreRames(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_GROUPEMENTS_MARCHE:
				return basicSetIntervalleTempsEntreGroupementsMarche(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__HAUTEUR_MAXIMALE_VEHICULES:
				return basicSetHauteurMaximaleVehicules(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_UNITE_MARCHE:
				return basicSetIntervalleTempsEntreUniteMarche(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LARGEUR_MAXIMALE_VEHICULE:
				return basicSetLargeurMaximaleVehicule(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LONGUEUR_MAXIMALE_VEHICULE:
				return basicSetLongueurMaximaleVehicule(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__POIDS_VEHICULE_PLUS_LOURD:
				return basicSetPoidsVehiculePlusLourd(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_ACHENILLES:
				return basicSetPTRAplusLourdAChenilles(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__RAYON_BRAQUAGE_MAXIMAL:
				return basicSetRayonBraquageMaximal(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DUREE_ECOULEMENT:
				return basicSetRouteDureeEcoulement(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_VITESSE_MOYENNE:
				return basicSetRouteVitesseMoyenne(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_AROUES:
				return basicSetPTRAplusLourdARoues(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DISTANCE_ENTRE_VEHICULES:
				return basicSetRouteDistanceEntreVehicules(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_LONGUEUR_ENCOMBREMENT:
				return basicSetRouteLongueurEncombrement(null, msgs);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ACOMME_VEHICULE_PLUS_CONTRAIGNANT_VEHICULE_EXCEPTIONNEL:
				return ((InternalEList<?>)getACommeVehiculePlusContraignantVehiculeExceptionnel()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_LONGUEUR_ENCOMBREMENT:
				return getAutorouteLongueurEncombrement();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DUREE_ECOULEMENT:
				return getAutorouteDureeEcoulement();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DISTANCE_ENTRE_VEHICULES:
				return getAutorouteDistanceEntreVehicules();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_VITESSE_MOYENNE:
				return getAutorouteVitesseMoyenne();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONTRAINTES_COLONNES:
				return getContraintesColonnes();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_RAMES:
				return getIntervalleTempsEntreRames();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_GROUPEMENTS_MARCHE:
				return getIntervalleTempsEntreGroupementsMarche();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONSIGNES_PARTICULIERES:
				return getConsignesParticulieres();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__HAUTEUR_MAXIMALE_VEHICULES:
				return getHauteurMaximaleVehicules();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_UNITE_MARCHE:
				return getIntervalleTempsEntreUniteMarche();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE:
				return new Long(getClasseMilMaxPourVehiculesARoue());
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES:
				return new Long(getClasseMiMaxPourVehiculesAChenilles());
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LARGEUR_MAXIMALE_VEHICULE:
				return getLargeurMaximaleVehicule();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__MESURES_PRECAUTIONS_OTAN:
				return getMesuresPrecautionsOTAN();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_RAMES:
				return new Long(getNombreRames());
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES:
				return new Long(getNombreVehiculesAChenilles());
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_PLUS_LOURD:
				return new Long(getNombreVehiculesPlusLourd());
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LONGUEUR_MAXIMALE_VEHICULE:
				return getLongueurMaximaleVehicule();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_GROUPEMENTS_MARCHE:
				return new Long(getNombreGroupementsMarche());
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_UNITE_MARCHE:
				return new Long(getNombreUniteMarche());
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_AROUES:
				return new Long(getNombreVehiculesARoues());
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__POIDS_VEHICULE_PLUS_LOURD:
				return getPoidsVehiculePlusLourd();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_ACHENILLES:
				return getPTRAplusLourdAChenilles();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__RAYON_BRAQUAGE_MAXIMAL:
				return getRayonBraquageMaximal();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DUREE_ECOULEMENT:
				return getRouteDureeEcoulement();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_VITESSE_MOYENNE:
				return getRouteVitesseMoyenne();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_AROUES:
				return getPTRAplusLourdARoues();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DISTANCE_ENTRE_VEHICULES:
				return getRouteDistanceEntreVehicules();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_LONGUEUR_ENCOMBREMENT:
				return getRouteLongueurEncombrement();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__TYPE_VEHICULE_PLUS_LOURD:
				return getTypeVehiculePlusLourd();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ACOMME_VEHICULE_PLUS_CONTRAIGNANT_VEHICULE_EXCEPTIONNEL:
				return getACommeVehiculePlusContraignantVehiculeExceptionnel();
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
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_LONGUEUR_ENCOMBREMENT:
				setAutorouteLongueurEncombrement((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DUREE_ECOULEMENT:
				setAutorouteDureeEcoulement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DISTANCE_ENTRE_VEHICULES:
				setAutorouteDistanceEntreVehicules((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_VITESSE_MOYENNE:
				setAutorouteVitesseMoyenne((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONTRAINTES_COLONNES:
				setContraintesColonnes((String)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_RAMES:
				setIntervalleTempsEntreRames((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_GROUPEMENTS_MARCHE:
				setIntervalleTempsEntreGroupementsMarche((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONSIGNES_PARTICULIERES:
				setConsignesParticulieres((String)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__HAUTEUR_MAXIMALE_VEHICULES:
				setHauteurMaximaleVehicules((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_UNITE_MARCHE:
				setIntervalleTempsEntreUniteMarche((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE:
				setClasseMilMaxPourVehiculesARoue(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES:
				setClasseMiMaxPourVehiculesAChenilles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LARGEUR_MAXIMALE_VEHICULE:
				setLargeurMaximaleVehicule((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__MESURES_PRECAUTIONS_OTAN:
				setMesuresPrecautionsOTAN((String)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_RAMES:
				setNombreRames(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES:
				setNombreVehiculesAChenilles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_PLUS_LOURD:
				setNombreVehiculesPlusLourd(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LONGUEUR_MAXIMALE_VEHICULE:
				setLongueurMaximaleVehicule((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_GROUPEMENTS_MARCHE:
				setNombreGroupementsMarche(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_UNITE_MARCHE:
				setNombreUniteMarche(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_AROUES:
				setNombreVehiculesARoues(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__POIDS_VEHICULE_PLUS_LOURD:
				setPoidsVehiculePlusLourd((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_ACHENILLES:
				setPTRAplusLourdAChenilles((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__RAYON_BRAQUAGE_MAXIMAL:
				setRayonBraquageMaximal((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DUREE_ECOULEMENT:
				setRouteDureeEcoulement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_VITESSE_MOYENNE:
				setRouteVitesseMoyenne((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_AROUES:
				setPTRAplusLourdARoues((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DISTANCE_ENTRE_VEHICULES:
				setRouteDistanceEntreVehicules((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_LONGUEUR_ENCOMBREMENT:
				setRouteLongueurEncombrement((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__TYPE_VEHICULE_PLUS_LOURD:
				setTypeVehiculePlusLourd((String)newValue);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ACOMME_VEHICULE_PLUS_CONTRAIGNANT_VEHICULE_EXCEPTIONNEL:
				getACommeVehiculePlusContraignantVehiculeExceptionnel().clear();
				getACommeVehiculePlusContraignantVehiculeExceptionnel().addAll((Collection<? extends TypeVehiculeExceptionnel>)newValue);
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
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_LONGUEUR_ENCOMBREMENT:
				setAutorouteLongueurEncombrement((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DUREE_ECOULEMENT:
				setAutorouteDureeEcoulement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DISTANCE_ENTRE_VEHICULES:
				setAutorouteDistanceEntreVehicules((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_VITESSE_MOYENNE:
				setAutorouteVitesseMoyenne((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONTRAINTES_COLONNES:
				setContraintesColonnes(CONTRAINTES_COLONNES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_RAMES:
				setIntervalleTempsEntreRames((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_GROUPEMENTS_MARCHE:
				setIntervalleTempsEntreGroupementsMarche((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONSIGNES_PARTICULIERES:
				setConsignesParticulieres(CONSIGNES_PARTICULIERES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__HAUTEUR_MAXIMALE_VEHICULES:
				setHauteurMaximaleVehicules((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_UNITE_MARCHE:
				setIntervalleTempsEntreUniteMarche((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE:
				unsetClasseMilMaxPourVehiculesARoue();
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES:
				unsetClasseMiMaxPourVehiculesAChenilles();
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LARGEUR_MAXIMALE_VEHICULE:
				setLargeurMaximaleVehicule((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__MESURES_PRECAUTIONS_OTAN:
				setMesuresPrecautionsOTAN(MESURES_PRECAUTIONS_OTAN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_RAMES:
				unsetNombreRames();
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES:
				unsetNombreVehiculesAChenilles();
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_PLUS_LOURD:
				unsetNombreVehiculesPlusLourd();
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LONGUEUR_MAXIMALE_VEHICULE:
				setLongueurMaximaleVehicule((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_GROUPEMENTS_MARCHE:
				unsetNombreGroupementsMarche();
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_UNITE_MARCHE:
				unsetNombreUniteMarche();
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_AROUES:
				unsetNombreVehiculesARoues();
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__POIDS_VEHICULE_PLUS_LOURD:
				setPoidsVehiculePlusLourd((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_ACHENILLES:
				setPTRAplusLourdAChenilles((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__RAYON_BRAQUAGE_MAXIMAL:
				setRayonBraquageMaximal((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DUREE_ECOULEMENT:
				setRouteDureeEcoulement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_VITESSE_MOYENNE:
				setRouteVitesseMoyenne((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_AROUES:
				setPTRAplusLourdARoues((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DISTANCE_ENTRE_VEHICULES:
				setRouteDistanceEntreVehicules((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_LONGUEUR_ENCOMBREMENT:
				setRouteLongueurEncombrement((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__TYPE_VEHICULE_PLUS_LOURD:
				setTypeVehiculePlusLourd(TYPE_VEHICULE_PLUS_LOURD_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ACOMME_VEHICULE_PLUS_CONTRAIGNANT_VEHICULE_EXCEPTIONNEL:
				getACommeVehiculePlusContraignantVehiculeExceptionnel().clear();
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
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_LONGUEUR_ENCOMBREMENT:
				return autorouteLongueurEncombrement != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DUREE_ECOULEMENT:
				return autorouteDureeEcoulement != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_DISTANCE_ENTRE_VEHICULES:
				return autorouteDistanceEntreVehicules != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__AUTOROUTE_VITESSE_MOYENNE:
				return autorouteVitesseMoyenne != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONTRAINTES_COLONNES:
				return CONTRAINTES_COLONNES_EDEFAULT == null ? contraintesColonnes != null : !CONTRAINTES_COLONNES_EDEFAULT.equals(contraintesColonnes);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_RAMES:
				return intervalleTempsEntreRames != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_GROUPEMENTS_MARCHE:
				return intervalleTempsEntreGroupementsMarche != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CONSIGNES_PARTICULIERES:
				return CONSIGNES_PARTICULIERES_EDEFAULT == null ? consignesParticulieres != null : !CONSIGNES_PARTICULIERES_EDEFAULT.equals(consignesParticulieres);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__HAUTEUR_MAXIMALE_VEHICULES:
				return hauteurMaximaleVehicules != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__INTERVALLE_TEMPS_ENTRE_UNITE_MARCHE:
				return intervalleTempsEntreUniteMarche != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE:
				return isSetClasseMilMaxPourVehiculesARoue();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES:
				return isSetClasseMiMaxPourVehiculesAChenilles();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LARGEUR_MAXIMALE_VEHICULE:
				return largeurMaximaleVehicule != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__MESURES_PRECAUTIONS_OTAN:
				return MESURES_PRECAUTIONS_OTAN_EDEFAULT == null ? mesuresPrecautionsOTAN != null : !MESURES_PRECAUTIONS_OTAN_EDEFAULT.equals(mesuresPrecautionsOTAN);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_RAMES:
				return isSetNombreRames();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES:
				return isSetNombreVehiculesAChenilles();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_PLUS_LOURD:
				return isSetNombreVehiculesPlusLourd();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__LONGUEUR_MAXIMALE_VEHICULE:
				return longueurMaximaleVehicule != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_GROUPEMENTS_MARCHE:
				return isSetNombreGroupementsMarche();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_UNITE_MARCHE:
				return isSetNombreUniteMarche();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__NOMBRE_VEHICULES_AROUES:
				return isSetNombreVehiculesARoues();
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__POIDS_VEHICULE_PLUS_LOURD:
				return poidsVehiculePlusLourd != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_ACHENILLES:
				return pTRAplusLourdAChenilles != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__RAYON_BRAQUAGE_MAXIMAL:
				return rayonBraquageMaximal != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DUREE_ECOULEMENT:
				return routeDureeEcoulement != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_VITESSE_MOYENNE:
				return routeVitesseMoyenne != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__PTR_APLUS_LOURD_AROUES:
				return pTRAplusLourdARoues != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_DISTANCE_ENTRE_VEHICULES:
				return routeDistanceEntreVehicules != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ROUTE_LONGUEUR_ENCOMBREMENT:
				return routeLongueurEncombrement != null;
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__TYPE_VEHICULE_PLUS_LOURD:
				return TYPE_VEHICULE_PLUS_LOURD_EDEFAULT == null ? typeVehiculePlusLourd != null : !TYPE_VEHICULE_PLUS_LOURD_EDEFAULT.equals(typeVehiculePlusLourd);
			case SchemaPackage.TYPE_CONTRAINTES_MOUVEMENT__ACOMME_VEHICULE_PLUS_CONTRAIGNANT_VEHICULE_EXCEPTIONNEL:
				return aCommeVehiculePlusContraignantVehiculeExceptionnel != null && !aCommeVehiculePlusContraignantVehiculeExceptionnel.isEmpty();
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
		result.append(" (contraintesColonnes: ");
		result.append(contraintesColonnes);
		result.append(", consignesParticulieres: ");
		result.append(consignesParticulieres);
		result.append(", classeMilMaxPourVehiculesARoue: ");
		if (classeMilMaxPourVehiculesARoueESet) result.append(classeMilMaxPourVehiculesARoue); else result.append("<unset>");
		result.append(", classeMiMaxPourVehiculesAChenilles: ");
		if (classeMiMaxPourVehiculesAChenillesESet) result.append(classeMiMaxPourVehiculesAChenilles); else result.append("<unset>");
		result.append(", mesuresPrecautionsOTAN: ");
		result.append(mesuresPrecautionsOTAN);
		result.append(", nombreRames: ");
		if (nombreRamesESet) result.append(nombreRames); else result.append("<unset>");
		result.append(", nombreVehiculesAChenilles: ");
		if (nombreVehiculesAChenillesESet) result.append(nombreVehiculesAChenilles); else result.append("<unset>");
		result.append(", nombreVehiculesPlusLourd: ");
		if (nombreVehiculesPlusLourdESet) result.append(nombreVehiculesPlusLourd); else result.append("<unset>");
		result.append(", nombreGroupementsMarche: ");
		if (nombreGroupementsMarcheESet) result.append(nombreGroupementsMarche); else result.append("<unset>");
		result.append(", nombreUniteMarche: ");
		if (nombreUniteMarcheESet) result.append(nombreUniteMarche); else result.append("<unset>");
		result.append(", nombreVehiculesARoues: ");
		if (nombreVehiculesARouesESet) result.append(nombreVehiculesARoues); else result.append("<unset>");
		result.append(", typeVehiculePlusLourd: ");
		result.append(typeVehiculePlusLourd);
		result.append(')');
		return result.toString();
	}

} //TypeContraintesMouvementImpl
