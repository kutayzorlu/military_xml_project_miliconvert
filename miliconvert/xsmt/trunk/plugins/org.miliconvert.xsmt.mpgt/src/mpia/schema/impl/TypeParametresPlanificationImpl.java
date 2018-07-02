/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;
import mpia.schema.TypeDictionaryDicoModeCalculDeplacement;
import mpia.schema.TypeDictionaryDicoNiveau;
import mpia.schema.TypeDictionaryDicoTypeDeplacement;
import mpia.schema.TypeParametresPlanification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parametres Planification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#isArretSurHalte <em>Arret Sur Halte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getDistanceEntreVehiculesArret <em>Distance Entre Vehicules Arret</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getIntervalleEntreRames <em>Intervalle Entre Rames</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getLongueurMaxVehicule <em>Longueur Max Vehicule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getDebutNuit <em>Debut Nuit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getFinNuit <em>Fin Nuit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getDistanceEntreVehicules <em>Distance Entre Vehicules</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getIntervalleEntreFormation <em>Intervalle Entre Formation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getIntervalleEntreRegiments <em>Intervalle Entre Regiments</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getModeCalcul <em>Mode Calcul</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getNiveauGU <em>Niveau GU</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getResponsableAttributMvt <em>Responsable Attribut Mvt</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getVitesseJourSurAutoroute <em>Vitesse Jour Sur Autoroute</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getVitesseJourSurRouteSpe <em>Vitesse Jour Sur Route Spe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getIdentifiantMouvement <em>Identifiant Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getTypeDeplacement <em>Type Deplacement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getVitesseJourSurRoute <em>Vitesse Jour Sur Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getVitesseNuitSurAutoroute <em>Vitesse Nuit Sur Autoroute</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getVitesseNuitSurRoute <em>Vitesse Nuit Sur Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getVitesseNuitSurRouteSpeciale <em>Vitesse Nuit Sur Route Speciale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresPlanificationImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeParametresPlanificationImpl extends EObjectImpl implements TypeParametresPlanification {
	/**
	 * The default value of the '{@link #isArretSurHalte() <em>Arret Sur Halte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArretSurHalte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARRET_SUR_HALTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArretSurHalte() <em>Arret Sur Halte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArretSurHalte()
	 * @generated
	 * @ordered
	 */
	protected boolean arretSurHalte = ARRET_SUR_HALTE_EDEFAULT;

	/**
	 * This is true if the Arret Sur Halte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arretSurHalteESet;

	/**
	 * The default value of the '{@link #getDistanceEntreVehiculesArret() <em>Distance Entre Vehicules Arret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreVehiculesArret()
	 * @generated
	 * @ordered
	 */
	protected static final long DISTANCE_ENTRE_VEHICULES_ARRET_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDistanceEntreVehiculesArret() <em>Distance Entre Vehicules Arret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreVehiculesArret()
	 * @generated
	 * @ordered
	 */
	protected long distanceEntreVehiculesArret = DISTANCE_ENTRE_VEHICULES_ARRET_EDEFAULT;

	/**
	 * This is true if the Distance Entre Vehicules Arret attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distanceEntreVehiculesArretESet;

	/**
	 * The default value of the '{@link #getIntervalleEntreRames() <em>Intervalle Entre Rames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleEntreRames()
	 * @generated
	 * @ordered
	 */
	protected static final long INTERVALLE_ENTRE_RAMES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIntervalleEntreRames() <em>Intervalle Entre Rames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleEntreRames()
	 * @generated
	 * @ordered
	 */
	protected long intervalleEntreRames = INTERVALLE_ENTRE_RAMES_EDEFAULT;

	/**
	 * This is true if the Intervalle Entre Rames attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intervalleEntreRamesESet;

	/**
	 * The default value of the '{@link #getLongueurMaxVehicule() <em>Longueur Max Vehicule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurMaxVehicule()
	 * @generated
	 * @ordered
	 */
	protected static final long LONGUEUR_MAX_VEHICULE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLongueurMaxVehicule() <em>Longueur Max Vehicule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurMaxVehicule()
	 * @generated
	 * @ordered
	 */
	protected long longueurMaxVehicule = LONGUEUR_MAX_VEHICULE_EDEFAULT;

	/**
	 * This is true if the Longueur Max Vehicule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longueurMaxVehiculeESet;

	/**
	 * The default value of the '{@link #getDebutNuit() <em>Debut Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutNuit()
	 * @generated
	 * @ordered
	 */
	protected static final long DEBUT_NUIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDebutNuit() <em>Debut Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutNuit()
	 * @generated
	 * @ordered
	 */
	protected long debutNuit = DEBUT_NUIT_EDEFAULT;

	/**
	 * This is true if the Debut Nuit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean debutNuitESet;

	/**
	 * The default value of the '{@link #getFinNuit() <em>Fin Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinNuit()
	 * @generated
	 * @ordered
	 */
	protected static final long FIN_NUIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFinNuit() <em>Fin Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinNuit()
	 * @generated
	 * @ordered
	 */
	protected long finNuit = FIN_NUIT_EDEFAULT;

	/**
	 * This is true if the Fin Nuit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finNuitESet;

	/**
	 * The default value of the '{@link #getDistanceEntreVehicules() <em>Distance Entre Vehicules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreVehicules()
	 * @generated
	 * @ordered
	 */
	protected static final long DISTANCE_ENTRE_VEHICULES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDistanceEntreVehicules() <em>Distance Entre Vehicules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreVehicules()
	 * @generated
	 * @ordered
	 */
	protected long distanceEntreVehicules = DISTANCE_ENTRE_VEHICULES_EDEFAULT;

	/**
	 * This is true if the Distance Entre Vehicules attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distanceEntreVehiculesESet;

	/**
	 * The default value of the '{@link #getIntervalleEntreFormation() <em>Intervalle Entre Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleEntreFormation()
	 * @generated
	 * @ordered
	 */
	protected static final long INTERVALLE_ENTRE_FORMATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIntervalleEntreFormation() <em>Intervalle Entre Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleEntreFormation()
	 * @generated
	 * @ordered
	 */
	protected long intervalleEntreFormation = INTERVALLE_ENTRE_FORMATION_EDEFAULT;

	/**
	 * This is true if the Intervalle Entre Formation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intervalleEntreFormationESet;

	/**
	 * The default value of the '{@link #getIntervalleEntreRegiments() <em>Intervalle Entre Regiments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleEntreRegiments()
	 * @generated
	 * @ordered
	 */
	protected static final long INTERVALLE_ENTRE_REGIMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIntervalleEntreRegiments() <em>Intervalle Entre Regiments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleEntreRegiments()
	 * @generated
	 * @ordered
	 */
	protected long intervalleEntreRegiments = INTERVALLE_ENTRE_REGIMENTS_EDEFAULT;

	/**
	 * This is true if the Intervalle Entre Regiments attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intervalleEntreRegimentsESet;

	/**
	 * The default value of the '{@link #getModeCalcul() <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeCalcul()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModeCalculDeplacement MODE_CALCUL_EDEFAULT = TypeDictionaryDicoModeCalculDeplacement.CONTINU;

	/**
	 * The cached value of the '{@link #getModeCalcul() <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeCalcul()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModeCalculDeplacement modeCalcul = MODE_CALCUL_EDEFAULT;

	/**
	 * This is true if the Mode Calcul attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeCalculESet;

	/**
	 * The default value of the '{@link #getNiveauGU() <em>Niveau GU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauGU()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoNiveau NIVEAU_GU_EDEFAULT = TypeDictionaryDicoNiveau.AG;

	/**
	 * The cached value of the '{@link #getNiveauGU() <em>Niveau GU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauGU()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoNiveau niveauGU = NIVEAU_GU_EDEFAULT;

	/**
	 * This is true if the Niveau GU attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauGUESet;

	/**
	 * The default value of the '{@link #getResponsableAttributMvt() <em>Responsable Attribut Mvt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableAttributMvt()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSABLE_ATTRIBUT_MVT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsableAttributMvt() <em>Responsable Attribut Mvt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableAttributMvt()
	 * @generated
	 * @ordered
	 */
	protected String responsableAttributMvt = RESPONSABLE_ATTRIBUT_MVT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVitesseJourSurAutoroute() <em>Vitesse Jour Sur Autoroute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseJourSurAutoroute()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_JOUR_SUR_AUTOROUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseJourSurAutoroute() <em>Vitesse Jour Sur Autoroute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseJourSurAutoroute()
	 * @generated
	 * @ordered
	 */
	protected double vitesseJourSurAutoroute = VITESSE_JOUR_SUR_AUTOROUTE_EDEFAULT;

	/**
	 * This is true if the Vitesse Jour Sur Autoroute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseJourSurAutorouteESet;

	/**
	 * The default value of the '{@link #getVitesseJourSurRouteSpe() <em>Vitesse Jour Sur Route Spe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseJourSurRouteSpe()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_JOUR_SUR_ROUTE_SPE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseJourSurRouteSpe() <em>Vitesse Jour Sur Route Spe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseJourSurRouteSpe()
	 * @generated
	 * @ordered
	 */
	protected double vitesseJourSurRouteSpe = VITESSE_JOUR_SUR_ROUTE_SPE_EDEFAULT;

	/**
	 * This is true if the Vitesse Jour Sur Route Spe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseJourSurRouteSpeESet;

	/**
	 * The default value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntitePolitiqueTrigramme NATIONALITE_EDEFAULT = TypeDictionaryDicoEntitePolitiqueTrigramme.ATG;

	/**
	 * The cached value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntitePolitiqueTrigramme nationalite = NATIONALITE_EDEFAULT;

	/**
	 * This is true if the Nationalite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nationaliteESet;

	/**
	 * The default value of the '{@link #getIdentifiantMouvement() <em>Identifiant Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_MOUVEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantMouvement() <em>Identifiant Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantMouvement()
	 * @generated
	 * @ordered
	 */
	protected String identifiantMouvement = IDENTIFIANT_MOUVEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeDeplacement() <em>Type Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeplacement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeDeplacement TYPE_DEPLACEMENT_EDEFAULT = TypeDictionaryDicoTypeDeplacement.BY_DAY_AND_NIGHT;

	/**
	 * The cached value of the '{@link #getTypeDeplacement() <em>Type Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeplacement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeDeplacement typeDeplacement = TYPE_DEPLACEMENT_EDEFAULT;

	/**
	 * This is true if the Type Deplacement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDeplacementESet;

	/**
	 * The default value of the '{@link #getVitesseJourSurRoute() <em>Vitesse Jour Sur Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseJourSurRoute()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_JOUR_SUR_ROUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseJourSurRoute() <em>Vitesse Jour Sur Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseJourSurRoute()
	 * @generated
	 * @ordered
	 */
	protected double vitesseJourSurRoute = VITESSE_JOUR_SUR_ROUTE_EDEFAULT;

	/**
	 * This is true if the Vitesse Jour Sur Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseJourSurRouteESet;

	/**
	 * The default value of the '{@link #getVitesseNuitSurAutoroute() <em>Vitesse Nuit Sur Autoroute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseNuitSurAutoroute()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_NUIT_SUR_AUTOROUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseNuitSurAutoroute() <em>Vitesse Nuit Sur Autoroute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseNuitSurAutoroute()
	 * @generated
	 * @ordered
	 */
	protected double vitesseNuitSurAutoroute = VITESSE_NUIT_SUR_AUTOROUTE_EDEFAULT;

	/**
	 * This is true if the Vitesse Nuit Sur Autoroute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseNuitSurAutorouteESet;

	/**
	 * The default value of the '{@link #getVitesseNuitSurRoute() <em>Vitesse Nuit Sur Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseNuitSurRoute()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_NUIT_SUR_ROUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseNuitSurRoute() <em>Vitesse Nuit Sur Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseNuitSurRoute()
	 * @generated
	 * @ordered
	 */
	protected double vitesseNuitSurRoute = VITESSE_NUIT_SUR_ROUTE_EDEFAULT;

	/**
	 * This is true if the Vitesse Nuit Sur Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseNuitSurRouteESet;

	/**
	 * The default value of the '{@link #getVitesseNuitSurRouteSpeciale() <em>Vitesse Nuit Sur Route Speciale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseNuitSurRouteSpeciale()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_NUIT_SUR_ROUTE_SPECIALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseNuitSurRouteSpeciale() <em>Vitesse Nuit Sur Route Speciale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseNuitSurRouteSpeciale()
	 * @generated
	 * @ordered
	 */
	protected double vitesseNuitSurRouteSpeciale = VITESSE_NUIT_SUR_ROUTE_SPECIALE_EDEFAULT;

	/**
	 * This is true if the Vitesse Nuit Sur Route Speciale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseNuitSurRouteSpecialeESet;

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
	protected TypeParametresPlanificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeParametresPlanification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArretSurHalte() {
		return arretSurHalte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArretSurHalte(boolean newArretSurHalte) {
		boolean oldArretSurHalte = arretSurHalte;
		arretSurHalte = newArretSurHalte;
		boolean oldArretSurHalteESet = arretSurHalteESet;
		arretSurHalteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__ARRET_SUR_HALTE, oldArretSurHalte, arretSurHalte, !oldArretSurHalteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArretSurHalte() {
		boolean oldArretSurHalte = arretSurHalte;
		boolean oldArretSurHalteESet = arretSurHalteESet;
		arretSurHalte = ARRET_SUR_HALTE_EDEFAULT;
		arretSurHalteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__ARRET_SUR_HALTE, oldArretSurHalte, ARRET_SUR_HALTE_EDEFAULT, oldArretSurHalteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArretSurHalte() {
		return arretSurHalteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDistanceEntreVehiculesArret() {
		return distanceEntreVehiculesArret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceEntreVehiculesArret(long newDistanceEntreVehiculesArret) {
		long oldDistanceEntreVehiculesArret = distanceEntreVehiculesArret;
		distanceEntreVehiculesArret = newDistanceEntreVehiculesArret;
		boolean oldDistanceEntreVehiculesArretESet = distanceEntreVehiculesArretESet;
		distanceEntreVehiculesArretESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES_ARRET, oldDistanceEntreVehiculesArret, distanceEntreVehiculesArret, !oldDistanceEntreVehiculesArretESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistanceEntreVehiculesArret() {
		long oldDistanceEntreVehiculesArret = distanceEntreVehiculesArret;
		boolean oldDistanceEntreVehiculesArretESet = distanceEntreVehiculesArretESet;
		distanceEntreVehiculesArret = DISTANCE_ENTRE_VEHICULES_ARRET_EDEFAULT;
		distanceEntreVehiculesArretESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES_ARRET, oldDistanceEntreVehiculesArret, DISTANCE_ENTRE_VEHICULES_ARRET_EDEFAULT, oldDistanceEntreVehiculesArretESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistanceEntreVehiculesArret() {
		return distanceEntreVehiculesArretESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIntervalleEntreRames() {
		return intervalleEntreRames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalleEntreRames(long newIntervalleEntreRames) {
		long oldIntervalleEntreRames = intervalleEntreRames;
		intervalleEntreRames = newIntervalleEntreRames;
		boolean oldIntervalleEntreRamesESet = intervalleEntreRamesESet;
		intervalleEntreRamesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_RAMES, oldIntervalleEntreRames, intervalleEntreRames, !oldIntervalleEntreRamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntervalleEntreRames() {
		long oldIntervalleEntreRames = intervalleEntreRames;
		boolean oldIntervalleEntreRamesESet = intervalleEntreRamesESet;
		intervalleEntreRames = INTERVALLE_ENTRE_RAMES_EDEFAULT;
		intervalleEntreRamesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_RAMES, oldIntervalleEntreRames, INTERVALLE_ENTRE_RAMES_EDEFAULT, oldIntervalleEntreRamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntervalleEntreRames() {
		return intervalleEntreRamesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLongueurMaxVehicule() {
		return longueurMaxVehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurMaxVehicule(long newLongueurMaxVehicule) {
		long oldLongueurMaxVehicule = longueurMaxVehicule;
		longueurMaxVehicule = newLongueurMaxVehicule;
		boolean oldLongueurMaxVehiculeESet = longueurMaxVehiculeESet;
		longueurMaxVehiculeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__LONGUEUR_MAX_VEHICULE, oldLongueurMaxVehicule, longueurMaxVehicule, !oldLongueurMaxVehiculeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongueurMaxVehicule() {
		long oldLongueurMaxVehicule = longueurMaxVehicule;
		boolean oldLongueurMaxVehiculeESet = longueurMaxVehiculeESet;
		longueurMaxVehicule = LONGUEUR_MAX_VEHICULE_EDEFAULT;
		longueurMaxVehiculeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__LONGUEUR_MAX_VEHICULE, oldLongueurMaxVehicule, LONGUEUR_MAX_VEHICULE_EDEFAULT, oldLongueurMaxVehiculeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongueurMaxVehicule() {
		return longueurMaxVehiculeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDebutNuit() {
		return debutNuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutNuit(long newDebutNuit) {
		long oldDebutNuit = debutNuit;
		debutNuit = newDebutNuit;
		boolean oldDebutNuitESet = debutNuitESet;
		debutNuitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DEBUT_NUIT, oldDebutNuit, debutNuit, !oldDebutNuitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDebutNuit() {
		long oldDebutNuit = debutNuit;
		boolean oldDebutNuitESet = debutNuitESet;
		debutNuit = DEBUT_NUIT_EDEFAULT;
		debutNuitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DEBUT_NUIT, oldDebutNuit, DEBUT_NUIT_EDEFAULT, oldDebutNuitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDebutNuit() {
		return debutNuitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFinNuit() {
		return finNuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinNuit(long newFinNuit) {
		long oldFinNuit = finNuit;
		finNuit = newFinNuit;
		boolean oldFinNuitESet = finNuitESet;
		finNuitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__FIN_NUIT, oldFinNuit, finNuit, !oldFinNuitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFinNuit() {
		long oldFinNuit = finNuit;
		boolean oldFinNuitESet = finNuitESet;
		finNuit = FIN_NUIT_EDEFAULT;
		finNuitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__FIN_NUIT, oldFinNuit, FIN_NUIT_EDEFAULT, oldFinNuitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFinNuit() {
		return finNuitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDistanceEntreVehicules() {
		return distanceEntreVehicules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceEntreVehicules(long newDistanceEntreVehicules) {
		long oldDistanceEntreVehicules = distanceEntreVehicules;
		distanceEntreVehicules = newDistanceEntreVehicules;
		boolean oldDistanceEntreVehiculesESet = distanceEntreVehiculesESet;
		distanceEntreVehiculesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES, oldDistanceEntreVehicules, distanceEntreVehicules, !oldDistanceEntreVehiculesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistanceEntreVehicules() {
		long oldDistanceEntreVehicules = distanceEntreVehicules;
		boolean oldDistanceEntreVehiculesESet = distanceEntreVehiculesESet;
		distanceEntreVehicules = DISTANCE_ENTRE_VEHICULES_EDEFAULT;
		distanceEntreVehiculesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES, oldDistanceEntreVehicules, DISTANCE_ENTRE_VEHICULES_EDEFAULT, oldDistanceEntreVehiculesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistanceEntreVehicules() {
		return distanceEntreVehiculesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIntervalleEntreFormation() {
		return intervalleEntreFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalleEntreFormation(long newIntervalleEntreFormation) {
		long oldIntervalleEntreFormation = intervalleEntreFormation;
		intervalleEntreFormation = newIntervalleEntreFormation;
		boolean oldIntervalleEntreFormationESet = intervalleEntreFormationESet;
		intervalleEntreFormationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_FORMATION, oldIntervalleEntreFormation, intervalleEntreFormation, !oldIntervalleEntreFormationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntervalleEntreFormation() {
		long oldIntervalleEntreFormation = intervalleEntreFormation;
		boolean oldIntervalleEntreFormationESet = intervalleEntreFormationESet;
		intervalleEntreFormation = INTERVALLE_ENTRE_FORMATION_EDEFAULT;
		intervalleEntreFormationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_FORMATION, oldIntervalleEntreFormation, INTERVALLE_ENTRE_FORMATION_EDEFAULT, oldIntervalleEntreFormationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntervalleEntreFormation() {
		return intervalleEntreFormationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIntervalleEntreRegiments() {
		return intervalleEntreRegiments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalleEntreRegiments(long newIntervalleEntreRegiments) {
		long oldIntervalleEntreRegiments = intervalleEntreRegiments;
		intervalleEntreRegiments = newIntervalleEntreRegiments;
		boolean oldIntervalleEntreRegimentsESet = intervalleEntreRegimentsESet;
		intervalleEntreRegimentsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_REGIMENTS, oldIntervalleEntreRegiments, intervalleEntreRegiments, !oldIntervalleEntreRegimentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntervalleEntreRegiments() {
		long oldIntervalleEntreRegiments = intervalleEntreRegiments;
		boolean oldIntervalleEntreRegimentsESet = intervalleEntreRegimentsESet;
		intervalleEntreRegiments = INTERVALLE_ENTRE_REGIMENTS_EDEFAULT;
		intervalleEntreRegimentsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_REGIMENTS, oldIntervalleEntreRegiments, INTERVALLE_ENTRE_REGIMENTS_EDEFAULT, oldIntervalleEntreRegimentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntervalleEntreRegiments() {
		return intervalleEntreRegimentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModeCalculDeplacement getModeCalcul() {
		return modeCalcul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeCalcul(TypeDictionaryDicoModeCalculDeplacement newModeCalcul) {
		TypeDictionaryDicoModeCalculDeplacement oldModeCalcul = modeCalcul;
		modeCalcul = newModeCalcul == null ? MODE_CALCUL_EDEFAULT : newModeCalcul;
		boolean oldModeCalculESet = modeCalculESet;
		modeCalculESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__MODE_CALCUL, oldModeCalcul, modeCalcul, !oldModeCalculESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeCalcul() {
		TypeDictionaryDicoModeCalculDeplacement oldModeCalcul = modeCalcul;
		boolean oldModeCalculESet = modeCalculESet;
		modeCalcul = MODE_CALCUL_EDEFAULT;
		modeCalculESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__MODE_CALCUL, oldModeCalcul, MODE_CALCUL_EDEFAULT, oldModeCalculESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeCalcul() {
		return modeCalculESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoNiveau getNiveauGU() {
		return niveauGU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauGU(TypeDictionaryDicoNiveau newNiveauGU) {
		TypeDictionaryDicoNiveau oldNiveauGU = niveauGU;
		niveauGU = newNiveauGU == null ? NIVEAU_GU_EDEFAULT : newNiveauGU;
		boolean oldNiveauGUESet = niveauGUESet;
		niveauGUESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NIVEAU_GU, oldNiveauGU, niveauGU, !oldNiveauGUESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauGU() {
		TypeDictionaryDicoNiveau oldNiveauGU = niveauGU;
		boolean oldNiveauGUESet = niveauGUESet;
		niveauGU = NIVEAU_GU_EDEFAULT;
		niveauGUESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NIVEAU_GU, oldNiveauGU, NIVEAU_GU_EDEFAULT, oldNiveauGUESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauGU() {
		return niveauGUESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsableAttributMvt() {
		return responsableAttributMvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsableAttributMvt(String newResponsableAttributMvt) {
		String oldResponsableAttributMvt = responsableAttributMvt;
		responsableAttributMvt = newResponsableAttributMvt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__RESPONSABLE_ATTRIBUT_MVT, oldResponsableAttributMvt, responsableAttributMvt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseJourSurAutoroute() {
		return vitesseJourSurAutoroute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseJourSurAutoroute(double newVitesseJourSurAutoroute) {
		double oldVitesseJourSurAutoroute = vitesseJourSurAutoroute;
		vitesseJourSurAutoroute = newVitesseJourSurAutoroute;
		boolean oldVitesseJourSurAutorouteESet = vitesseJourSurAutorouteESet;
		vitesseJourSurAutorouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_AUTOROUTE, oldVitesseJourSurAutoroute, vitesseJourSurAutoroute, !oldVitesseJourSurAutorouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseJourSurAutoroute() {
		double oldVitesseJourSurAutoroute = vitesseJourSurAutoroute;
		boolean oldVitesseJourSurAutorouteESet = vitesseJourSurAutorouteESet;
		vitesseJourSurAutoroute = VITESSE_JOUR_SUR_AUTOROUTE_EDEFAULT;
		vitesseJourSurAutorouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_AUTOROUTE, oldVitesseJourSurAutoroute, VITESSE_JOUR_SUR_AUTOROUTE_EDEFAULT, oldVitesseJourSurAutorouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseJourSurAutoroute() {
		return vitesseJourSurAutorouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseJourSurRouteSpe() {
		return vitesseJourSurRouteSpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseJourSurRouteSpe(double newVitesseJourSurRouteSpe) {
		double oldVitesseJourSurRouteSpe = vitesseJourSurRouteSpe;
		vitesseJourSurRouteSpe = newVitesseJourSurRouteSpe;
		boolean oldVitesseJourSurRouteSpeESet = vitesseJourSurRouteSpeESet;
		vitesseJourSurRouteSpeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE_SPE, oldVitesseJourSurRouteSpe, vitesseJourSurRouteSpe, !oldVitesseJourSurRouteSpeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseJourSurRouteSpe() {
		double oldVitesseJourSurRouteSpe = vitesseJourSurRouteSpe;
		boolean oldVitesseJourSurRouteSpeESet = vitesseJourSurRouteSpeESet;
		vitesseJourSurRouteSpe = VITESSE_JOUR_SUR_ROUTE_SPE_EDEFAULT;
		vitesseJourSurRouteSpeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE_SPE, oldVitesseJourSurRouteSpe, VITESSE_JOUR_SUR_ROUTE_SPE_EDEFAULT, oldVitesseJourSurRouteSpeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseJourSurRouteSpe() {
		return vitesseJourSurRouteSpeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite() {
		return nationalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme newNationalite) {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		nationalite = newNationalite == null ? NATIONALITE_EDEFAULT : newNationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationaliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NATIONALITE, oldNationalite, nationalite, !oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNationalite() {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationalite = NATIONALITE_EDEFAULT;
		nationaliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NATIONALITE, oldNationalite, NATIONALITE_EDEFAULT, oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNationalite() {
		return nationaliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiantMouvement() {
		return identifiantMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantMouvement(String newIdentifiantMouvement) {
		String oldIdentifiantMouvement = identifiantMouvement;
		identifiantMouvement = newIdentifiantMouvement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__IDENTIFIANT_MOUVEMENT, oldIdentifiantMouvement, identifiantMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeDeplacement getTypeDeplacement() {
		return typeDeplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDeplacement(TypeDictionaryDicoTypeDeplacement newTypeDeplacement) {
		TypeDictionaryDicoTypeDeplacement oldTypeDeplacement = typeDeplacement;
		typeDeplacement = newTypeDeplacement == null ? TYPE_DEPLACEMENT_EDEFAULT : newTypeDeplacement;
		boolean oldTypeDeplacementESet = typeDeplacementESet;
		typeDeplacementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__TYPE_DEPLACEMENT, oldTypeDeplacement, typeDeplacement, !oldTypeDeplacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDeplacement() {
		TypeDictionaryDicoTypeDeplacement oldTypeDeplacement = typeDeplacement;
		boolean oldTypeDeplacementESet = typeDeplacementESet;
		typeDeplacement = TYPE_DEPLACEMENT_EDEFAULT;
		typeDeplacementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__TYPE_DEPLACEMENT, oldTypeDeplacement, TYPE_DEPLACEMENT_EDEFAULT, oldTypeDeplacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDeplacement() {
		return typeDeplacementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseJourSurRoute() {
		return vitesseJourSurRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseJourSurRoute(double newVitesseJourSurRoute) {
		double oldVitesseJourSurRoute = vitesseJourSurRoute;
		vitesseJourSurRoute = newVitesseJourSurRoute;
		boolean oldVitesseJourSurRouteESet = vitesseJourSurRouteESet;
		vitesseJourSurRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE, oldVitesseJourSurRoute, vitesseJourSurRoute, !oldVitesseJourSurRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseJourSurRoute() {
		double oldVitesseJourSurRoute = vitesseJourSurRoute;
		boolean oldVitesseJourSurRouteESet = vitesseJourSurRouteESet;
		vitesseJourSurRoute = VITESSE_JOUR_SUR_ROUTE_EDEFAULT;
		vitesseJourSurRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE, oldVitesseJourSurRoute, VITESSE_JOUR_SUR_ROUTE_EDEFAULT, oldVitesseJourSurRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseJourSurRoute() {
		return vitesseJourSurRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseNuitSurAutoroute() {
		return vitesseNuitSurAutoroute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseNuitSurAutoroute(double newVitesseNuitSurAutoroute) {
		double oldVitesseNuitSurAutoroute = vitesseNuitSurAutoroute;
		vitesseNuitSurAutoroute = newVitesseNuitSurAutoroute;
		boolean oldVitesseNuitSurAutorouteESet = vitesseNuitSurAutorouteESet;
		vitesseNuitSurAutorouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_AUTOROUTE, oldVitesseNuitSurAutoroute, vitesseNuitSurAutoroute, !oldVitesseNuitSurAutorouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseNuitSurAutoroute() {
		double oldVitesseNuitSurAutoroute = vitesseNuitSurAutoroute;
		boolean oldVitesseNuitSurAutorouteESet = vitesseNuitSurAutorouteESet;
		vitesseNuitSurAutoroute = VITESSE_NUIT_SUR_AUTOROUTE_EDEFAULT;
		vitesseNuitSurAutorouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_AUTOROUTE, oldVitesseNuitSurAutoroute, VITESSE_NUIT_SUR_AUTOROUTE_EDEFAULT, oldVitesseNuitSurAutorouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseNuitSurAutoroute() {
		return vitesseNuitSurAutorouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseNuitSurRoute() {
		return vitesseNuitSurRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseNuitSurRoute(double newVitesseNuitSurRoute) {
		double oldVitesseNuitSurRoute = vitesseNuitSurRoute;
		vitesseNuitSurRoute = newVitesseNuitSurRoute;
		boolean oldVitesseNuitSurRouteESet = vitesseNuitSurRouteESet;
		vitesseNuitSurRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE, oldVitesseNuitSurRoute, vitesseNuitSurRoute, !oldVitesseNuitSurRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseNuitSurRoute() {
		double oldVitesseNuitSurRoute = vitesseNuitSurRoute;
		boolean oldVitesseNuitSurRouteESet = vitesseNuitSurRouteESet;
		vitesseNuitSurRoute = VITESSE_NUIT_SUR_ROUTE_EDEFAULT;
		vitesseNuitSurRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE, oldVitesseNuitSurRoute, VITESSE_NUIT_SUR_ROUTE_EDEFAULT, oldVitesseNuitSurRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseNuitSurRoute() {
		return vitesseNuitSurRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseNuitSurRouteSpeciale() {
		return vitesseNuitSurRouteSpeciale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseNuitSurRouteSpeciale(double newVitesseNuitSurRouteSpeciale) {
		double oldVitesseNuitSurRouteSpeciale = vitesseNuitSurRouteSpeciale;
		vitesseNuitSurRouteSpeciale = newVitesseNuitSurRouteSpeciale;
		boolean oldVitesseNuitSurRouteSpecialeESet = vitesseNuitSurRouteSpecialeESet;
		vitesseNuitSurRouteSpecialeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE_SPECIALE, oldVitesseNuitSurRouteSpeciale, vitesseNuitSurRouteSpeciale, !oldVitesseNuitSurRouteSpecialeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseNuitSurRouteSpeciale() {
		double oldVitesseNuitSurRouteSpeciale = vitesseNuitSurRouteSpeciale;
		boolean oldVitesseNuitSurRouteSpecialeESet = vitesseNuitSurRouteSpecialeESet;
		vitesseNuitSurRouteSpeciale = VITESSE_NUIT_SUR_ROUTE_SPECIALE_EDEFAULT;
		vitesseNuitSurRouteSpecialeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE_SPECIALE, oldVitesseNuitSurRouteSpeciale, VITESSE_NUIT_SUR_ROUTE_SPECIALE_EDEFAULT, oldVitesseNuitSurRouteSpecialeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseNuitSurRouteSpeciale() {
		return vitesseNuitSurRouteSpecialeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__ARRET_SUR_HALTE:
				return isArretSurHalte() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES_ARRET:
				return new Long(getDistanceEntreVehiculesArret());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_RAMES:
				return new Long(getIntervalleEntreRames());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__LONGUEUR_MAX_VEHICULE:
				return new Long(getLongueurMaxVehicule());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DEBUT_NUIT:
				return new Long(getDebutNuit());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__FIN_NUIT:
				return new Long(getFinNuit());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES:
				return new Long(getDistanceEntreVehicules());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_FORMATION:
				return new Long(getIntervalleEntreFormation());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_REGIMENTS:
				return new Long(getIntervalleEntreRegiments());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__MODE_CALCUL:
				return getModeCalcul();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NIVEAU_GU:
				return getNiveauGU();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__RESPONSABLE_ATTRIBUT_MVT:
				return getResponsableAttributMvt();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_AUTOROUTE:
				return new Double(getVitesseJourSurAutoroute());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE_SPE:
				return new Double(getVitesseJourSurRouteSpe());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NATIONALITE:
				return getNationalite();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__IDENTIFIANT_MOUVEMENT:
				return getIdentifiantMouvement();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__TYPE_DEPLACEMENT:
				return getTypeDeplacement();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE:
				return new Double(getVitesseJourSurRoute());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_AUTOROUTE:
				return new Double(getVitesseNuitSurAutoroute());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE:
				return new Double(getVitesseNuitSurRoute());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE_SPECIALE:
				return new Double(getVitesseNuitSurRouteSpeciale());
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CE:
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
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__ARRET_SUR_HALTE:
				setArretSurHalte(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES_ARRET:
				setDistanceEntreVehiculesArret(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_RAMES:
				setIntervalleEntreRames(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__LONGUEUR_MAX_VEHICULE:
				setLongueurMaxVehicule(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DEBUT_NUIT:
				setDebutNuit(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__FIN_NUIT:
				setFinNuit(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES:
				setDistanceEntreVehicules(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_FORMATION:
				setIntervalleEntreFormation(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_REGIMENTS:
				setIntervalleEntreRegiments(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__MODE_CALCUL:
				setModeCalcul((TypeDictionaryDicoModeCalculDeplacement)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NIVEAU_GU:
				setNiveauGU((TypeDictionaryDicoNiveau)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__RESPONSABLE_ATTRIBUT_MVT:
				setResponsableAttributMvt((String)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_AUTOROUTE:
				setVitesseJourSurAutoroute(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE_SPE:
				setVitesseJourSurRouteSpe(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NATIONALITE:
				setNationalite((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__IDENTIFIANT_MOUVEMENT:
				setIdentifiantMouvement((String)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__TYPE_DEPLACEMENT:
				setTypeDeplacement((TypeDictionaryDicoTypeDeplacement)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE:
				setVitesseJourSurRoute(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_AUTOROUTE:
				setVitesseNuitSurAutoroute(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE:
				setVitesseNuitSurRoute(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE_SPECIALE:
				setVitesseNuitSurRouteSpeciale(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CE:
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
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__ARRET_SUR_HALTE:
				unsetArretSurHalte();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES_ARRET:
				unsetDistanceEntreVehiculesArret();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_RAMES:
				unsetIntervalleEntreRames();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__LONGUEUR_MAX_VEHICULE:
				unsetLongueurMaxVehicule();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DEBUT_NUIT:
				unsetDebutNuit();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__FIN_NUIT:
				unsetFinNuit();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES:
				unsetDistanceEntreVehicules();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_FORMATION:
				unsetIntervalleEntreFormation();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_REGIMENTS:
				unsetIntervalleEntreRegiments();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__MODE_CALCUL:
				unsetModeCalcul();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NIVEAU_GU:
				unsetNiveauGU();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__RESPONSABLE_ATTRIBUT_MVT:
				setResponsableAttributMvt(RESPONSABLE_ATTRIBUT_MVT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_AUTOROUTE:
				unsetVitesseJourSurAutoroute();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE_SPE:
				unsetVitesseJourSurRouteSpe();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NATIONALITE:
				unsetNationalite();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__IDENTIFIANT_MOUVEMENT:
				setIdentifiantMouvement(IDENTIFIANT_MOUVEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__TYPE_DEPLACEMENT:
				unsetTypeDeplacement();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE:
				unsetVitesseJourSurRoute();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_AUTOROUTE:
				unsetVitesseNuitSurAutoroute();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE:
				unsetVitesseNuitSurRoute();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE_SPECIALE:
				unsetVitesseNuitSurRouteSpeciale();
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CE:
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
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__ARRET_SUR_HALTE:
				return isSetArretSurHalte();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES_ARRET:
				return isSetDistanceEntreVehiculesArret();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_RAMES:
				return isSetIntervalleEntreRames();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__LONGUEUR_MAX_VEHICULE:
				return isSetLongueurMaxVehicule();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DEBUT_NUIT:
				return isSetDebutNuit();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__FIN_NUIT:
				return isSetFinNuit();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__DISTANCE_ENTRE_VEHICULES:
				return isSetDistanceEntreVehicules();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_FORMATION:
				return isSetIntervalleEntreFormation();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__INTERVALLE_ENTRE_REGIMENTS:
				return isSetIntervalleEntreRegiments();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__MODE_CALCUL:
				return isSetModeCalcul();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NIVEAU_GU:
				return isSetNiveauGU();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__RESPONSABLE_ATTRIBUT_MVT:
				return RESPONSABLE_ATTRIBUT_MVT_EDEFAULT == null ? responsableAttributMvt != null : !RESPONSABLE_ATTRIBUT_MVT_EDEFAULT.equals(responsableAttributMvt);
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_AUTOROUTE:
				return isSetVitesseJourSurAutoroute();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE_SPE:
				return isSetVitesseJourSurRouteSpe();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__NATIONALITE:
				return isSetNationalite();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__IDENTIFIANT_MOUVEMENT:
				return IDENTIFIANT_MOUVEMENT_EDEFAULT == null ? identifiantMouvement != null : !IDENTIFIANT_MOUVEMENT_EDEFAULT.equals(identifiantMouvement);
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__TYPE_DEPLACEMENT:
				return isSetTypeDeplacement();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_JOUR_SUR_ROUTE:
				return isSetVitesseJourSurRoute();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_AUTOROUTE:
				return isSetVitesseNuitSurAutoroute();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE:
				return isSetVitesseNuitSurRoute();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__VITESSE_NUIT_SUR_ROUTE_SPECIALE:
				return isSetVitesseNuitSurRouteSpeciale();
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PARAMETRES_PLANIFICATION__CE:
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
		result.append(" (arretSurHalte: ");
		if (arretSurHalteESet) result.append(arretSurHalte); else result.append("<unset>");
		result.append(", distanceEntreVehiculesArret: ");
		if (distanceEntreVehiculesArretESet) result.append(distanceEntreVehiculesArret); else result.append("<unset>");
		result.append(", intervalleEntreRames: ");
		if (intervalleEntreRamesESet) result.append(intervalleEntreRames); else result.append("<unset>");
		result.append(", longueurMaxVehicule: ");
		if (longueurMaxVehiculeESet) result.append(longueurMaxVehicule); else result.append("<unset>");
		result.append(", debutNuit: ");
		if (debutNuitESet) result.append(debutNuit); else result.append("<unset>");
		result.append(", finNuit: ");
		if (finNuitESet) result.append(finNuit); else result.append("<unset>");
		result.append(", distanceEntreVehicules: ");
		if (distanceEntreVehiculesESet) result.append(distanceEntreVehicules); else result.append("<unset>");
		result.append(", intervalleEntreFormation: ");
		if (intervalleEntreFormationESet) result.append(intervalleEntreFormation); else result.append("<unset>");
		result.append(", intervalleEntreRegiments: ");
		if (intervalleEntreRegimentsESet) result.append(intervalleEntreRegiments); else result.append("<unset>");
		result.append(", modeCalcul: ");
		if (modeCalculESet) result.append(modeCalcul); else result.append("<unset>");
		result.append(", niveauGU: ");
		if (niveauGUESet) result.append(niveauGU); else result.append("<unset>");
		result.append(", responsableAttributMvt: ");
		result.append(responsableAttributMvt);
		result.append(", vitesseJourSurAutoroute: ");
		if (vitesseJourSurAutorouteESet) result.append(vitesseJourSurAutoroute); else result.append("<unset>");
		result.append(", vitesseJourSurRouteSpe: ");
		if (vitesseJourSurRouteSpeESet) result.append(vitesseJourSurRouteSpe); else result.append("<unset>");
		result.append(", nationalite: ");
		if (nationaliteESet) result.append(nationalite); else result.append("<unset>");
		result.append(", identifiantMouvement: ");
		result.append(identifiantMouvement);
		result.append(", typeDeplacement: ");
		if (typeDeplacementESet) result.append(typeDeplacement); else result.append("<unset>");
		result.append(", vitesseJourSurRoute: ");
		if (vitesseJourSurRouteESet) result.append(vitesseJourSurRoute); else result.append("<unset>");
		result.append(", vitesseNuitSurAutoroute: ");
		if (vitesseNuitSurAutorouteESet) result.append(vitesseNuitSurAutoroute); else result.append("<unset>");
		result.append(", vitesseNuitSurRoute: ");
		if (vitesseNuitSurRouteESet) result.append(vitesseNuitSurRoute); else result.append("<unset>");
		result.append(", vitesseNuitSurRouteSpeciale: ");
		if (vitesseNuitSurRouteSpecialeESet) result.append(vitesseNuitSurRouteSpeciale); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeParametresPlanificationImpl
