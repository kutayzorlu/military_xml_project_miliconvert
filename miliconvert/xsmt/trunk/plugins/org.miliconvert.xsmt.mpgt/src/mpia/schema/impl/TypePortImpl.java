/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDirection;
import mpia.schema.TypeDictionaryDicoPortDurabilite;
import mpia.schema.TypeDictionaryDicoPortInstallationsDisponibles;
import mpia.schema.TypeDictionaryDicoPortQualiteAbri;
import mpia.schema.TypeDictionaryDicoPortTypeCapaciteAntiIncendie;
import mpia.schema.TypeDictionaryDicoPortTypePlein;
import mpia.schema.TypeDictionaryDicoPrecisionVitesse;
import mpia.schema.TypePort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getTirantEauMaximum <em>Tirant Eau Maximum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getTonnageMaximumAutorise <em>Tonnage Maximum Autorise</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isPiloteNecessaire <em>Pilote Necessaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isProximiteAeroport <em>Proximite Aeroport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isLimitationEnHauteur <em>Limitation En Hauteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getQualiteAbri <em>Qualite Abri</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getDurabilite <em>Durabilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isDisponibilitePilote <em>Disponibilite Pilote</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isDisponibiliteRemorqueur <em>Disponibilite Remorqueur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isEncadrementConvoi <em>Encadrement Convoi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getLargeurCouloir <em>Largeur Couloir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getLongueurMaximale <em>Longueur Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getLargeurMaximale <em>Largeur Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getAmplitudeMaximaleMaree <em>Amplitude Maximale Maree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getAmplitudeMinimaleMaree <em>Amplitude Minimale Maree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getVitesseMoyenneMaree <em>Vitesse Moyenne Maree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getDetailsRelatifsAuxMarees <em>Details Relatifs Aux Marees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getVitesseMaximaleVentDominant <em>Vitesse Maximale Vent Dominant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getVitesseMaximaleEnregistree <em>Vitesse Maximale Enregistree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getInstallationsDisponibles <em>Installations Disponibles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isPossibiliteFairePlein <em>Possibilite Faire Plein</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getTypePlein <em>Type Plein</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getDetailsLiesAuPlein <em>Details Lies Au Plein</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isEauDisponible <em>Eau Disponible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isExistenceCapaciteAntiIncendie <em>Existence Capacite Anti Incendie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getTypeCapaciteAntiIncendie <em>Type Capacite Anti Incendie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isFacilitesTransit <em>Facilites Transit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isCapaciteAGererPassagers <em>Capacite AGerer Passagers</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isInstallationsTraitementPetroliers <em>Installations Traitement Petroliers</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isSecurisationBiologique <em>Securisation Biologique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isCapaciteReceptionLestSouille <em>Capacite Reception Lest Souille</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isInstallationsDemagnetisation <em>Installations Demagnetisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isPossibiliteUsageAccon <em>Possibilite Usage Accon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isTransportParAcconage <em>Transport Par Acconage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isZonePourTourner <em>Zone Pour Tourner</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isObligationMessageHeureArriveePrevue <em>Obligation Message Heure Arrivee Prevue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isDouaneOuServicesImmigration <em>Douane Ou Services Immigration</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isEntreeRestreintePourCauseForteHoule <em>Entree Restreinte Pour Cause Forte Houle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#isEntreeRestreintePourCauseGlace <em>Entree Restreinte Pour Cause Glace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getMesuresRestrictionEntree <em>Mesures Restriction Entree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePortImpl#getDetailsSaisonniers <em>Details Saisonniers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePortImpl extends TypeSiteImpl implements TypePort {
	/**
	 * The cached value of the '{@link #getTirantEauMaximum() <em>Tirant Eau Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTirantEauMaximum()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur tirantEauMaximum;

	/**
	 * The default value of the '{@link #getTonnageMaximumAutorise() <em>Tonnage Maximum Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonnageMaximumAutorise()
	 * @generated
	 * @ordered
	 */
	protected static final long TONNAGE_MAXIMUM_AUTORISE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTonnageMaximumAutorise() <em>Tonnage Maximum Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonnageMaximumAutorise()
	 * @generated
	 * @ordered
	 */
	protected long tonnageMaximumAutorise = TONNAGE_MAXIMUM_AUTORISE_EDEFAULT;

	/**
	 * This is true if the Tonnage Maximum Autorise attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tonnageMaximumAutoriseESet;

	/**
	 * The default value of the '{@link #isPiloteNecessaire() <em>Pilote Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPiloteNecessaire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PILOTE_NECESSAIRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPiloteNecessaire() <em>Pilote Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPiloteNecessaire()
	 * @generated
	 * @ordered
	 */
	protected boolean piloteNecessaire = PILOTE_NECESSAIRE_EDEFAULT;

	/**
	 * This is true if the Pilote Necessaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean piloteNecessaireESet;

	/**
	 * The default value of the '{@link #isProximiteAeroport() <em>Proximite Aeroport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProximiteAeroport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROXIMITE_AEROPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProximiteAeroport() <em>Proximite Aeroport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProximiteAeroport()
	 * @generated
	 * @ordered
	 */
	protected boolean proximiteAeroport = PROXIMITE_AEROPORT_EDEFAULT;

	/**
	 * This is true if the Proximite Aeroport attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean proximiteAeroportESet;

	/**
	 * The cached value of the '{@link #getChargeExplosiveLimiteJour() <em>Charge Explosive Limite Jour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeExplosiveLimiteJour()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeExplosiveLimiteJour;

	/**
	 * The cached value of the '{@link #getChargeExplosiveLimiteNuit() <em>Charge Explosive Limite Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeExplosiveLimiteNuit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeExplosiveLimiteNuit;

	/**
	 * The default value of the '{@link #isLimitationEnHauteur() <em>Limitation En Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimitationEnHauteur()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIMITATION_EN_HAUTEUR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLimitationEnHauteur() <em>Limitation En Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimitationEnHauteur()
	 * @generated
	 * @ordered
	 */
	protected boolean limitationEnHauteur = LIMITATION_EN_HAUTEUR_EDEFAULT;

	/**
	 * This is true if the Limitation En Hauteur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean limitationEnHauteurESet;

	/**
	 * The default value of the '{@link #getQualiteAbri() <em>Qualite Abri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualiteAbri()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPortQualiteAbri QUALITE_ABRI_EDEFAULT = TypeDictionaryDicoPortQualiteAbri.E;

	/**
	 * The cached value of the '{@link #getQualiteAbri() <em>Qualite Abri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualiteAbri()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPortQualiteAbri qualiteAbri = QUALITE_ABRI_EDEFAULT;

	/**
	 * This is true if the Qualite Abri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualiteAbriESet;

	/**
	 * The default value of the '{@link #getDurabilite() <em>Durabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurabilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPortDurabilite DURABILITE_EDEFAULT = TypeDictionaryDicoPortDurabilite.PERMAN;

	/**
	 * The cached value of the '{@link #getDurabilite() <em>Durabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurabilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPortDurabilite durabilite = DURABILITE_EDEFAULT;

	/**
	 * This is true if the Durabilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durabiliteESet;

	/**
	 * The default value of the '{@link #isDisponibilitePilote() <em>Disponibilite Pilote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisponibilitePilote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPONIBILITE_PILOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisponibilitePilote() <em>Disponibilite Pilote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisponibilitePilote()
	 * @generated
	 * @ordered
	 */
	protected boolean disponibilitePilote = DISPONIBILITE_PILOTE_EDEFAULT;

	/**
	 * This is true if the Disponibilite Pilote attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibilitePiloteESet;

	/**
	 * The default value of the '{@link #isDisponibiliteRemorqueur() <em>Disponibilite Remorqueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisponibiliteRemorqueur()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPONIBILITE_REMORQUEUR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisponibiliteRemorqueur() <em>Disponibilite Remorqueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisponibiliteRemorqueur()
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteRemorqueur = DISPONIBILITE_REMORQUEUR_EDEFAULT;

	/**
	 * This is true if the Disponibilite Remorqueur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteRemorqueurESet;

	/**
	 * The default value of the '{@link #isEncadrementConvoi() <em>Encadrement Convoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncadrementConvoi()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCADREMENT_CONVOI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncadrementConvoi() <em>Encadrement Convoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncadrementConvoi()
	 * @generated
	 * @ordered
	 */
	protected boolean encadrementConvoi = ENCADREMENT_CONVOI_EDEFAULT;

	/**
	 * This is true if the Encadrement Convoi attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encadrementConvoiESet;

	/**
	 * The cached value of the '{@link #getLargeurCouloir() <em>Largeur Couloir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurCouloir()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurCouloir;

	/**
	 * The cached value of the '{@link #getLongueurMaximale() <em>Longueur Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueurMaximale;

	/**
	 * The cached value of the '{@link #getLargeurMaximale() <em>Largeur Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurMaximale;

	/**
	 * The cached value of the '{@link #getAmplitudeMaximaleMaree() <em>Amplitude Maximale Maree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplitudeMaximaleMaree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur amplitudeMaximaleMaree;

	/**
	 * The cached value of the '{@link #getAmplitudeMinimaleMaree() <em>Amplitude Minimale Maree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplitudeMinimaleMaree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur amplitudeMinimaleMaree;

	/**
	 * The cached value of the '{@link #getVitesseMoyenneMaree() <em>Vitesse Moyenne Maree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMoyenneMaree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseMoyenneMaree;

	/**
	 * The default value of the '{@link #getDetailsRelatifsAuxMarees() <em>Details Relatifs Aux Marees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailsRelatifsAuxMarees()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_RELATIFS_AUX_MAREES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailsRelatifsAuxMarees() <em>Details Relatifs Aux Marees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailsRelatifsAuxMarees()
	 * @generated
	 * @ordered
	 */
	protected String detailsRelatifsAuxMarees = DETAILS_RELATIFS_AUX_MAREES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectionPredominanteVent() <em>Direction Predominante Vent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionPredominanteVent()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDirection DIRECTION_PREDOMINANTE_VENT_EDEFAULT = TypeDictionaryDicoDirection.N;

	/**
	 * The cached value of the '{@link #getDirectionPredominanteVent() <em>Direction Predominante Vent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionPredominanteVent()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDirection directionPredominanteVent = DIRECTION_PREDOMINANTE_VENT_EDEFAULT;

	/**
	 * This is true if the Direction Predominante Vent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionPredominanteVentESet;

	/**
	 * The default value of the '{@link #getVitesseMaximaleVentDominant() <em>Vitesse Maximale Vent Dominant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMaximaleVentDominant()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrecisionVitesse VITESSE_MAXIMALE_VENT_DOMINANT_EDEFAULT = TypeDictionaryDicoPrecisionVitesse.KPH;

	/**
	 * The cached value of the '{@link #getVitesseMaximaleVentDominant() <em>Vitesse Maximale Vent Dominant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMaximaleVentDominant()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrecisionVitesse vitesseMaximaleVentDominant = VITESSE_MAXIMALE_VENT_DOMINANT_EDEFAULT;

	/**
	 * This is true if the Vitesse Maximale Vent Dominant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseMaximaleVentDominantESet;

	/**
	 * The cached value of the '{@link #getVitesseMaximaleEnregistree() <em>Vitesse Maximale Enregistree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMaximaleEnregistree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseMaximaleEnregistree;

	/**
	 * The default value of the '{@link #getInstallationsDisponibles() <em>Installations Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationsDisponibles()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPortInstallationsDisponibles INSTALLATIONS_DISPONIBLES_EDEFAULT = TypeDictionaryDicoPortInstallationsDisponibles.ROROFL;

	/**
	 * The cached value of the '{@link #getInstallationsDisponibles() <em>Installations Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationsDisponibles()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPortInstallationsDisponibles installationsDisponibles = INSTALLATIONS_DISPONIBLES_EDEFAULT;

	/**
	 * This is true if the Installations Disponibles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean installationsDisponiblesESet;

	/**
	 * The default value of the '{@link #isPossibiliteFairePlein() <em>Possibilite Faire Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPossibiliteFairePlein()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSSIBILITE_FAIRE_PLEIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPossibiliteFairePlein() <em>Possibilite Faire Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPossibiliteFairePlein()
	 * @generated
	 * @ordered
	 */
	protected boolean possibiliteFairePlein = POSSIBILITE_FAIRE_PLEIN_EDEFAULT;

	/**
	 * This is true if the Possibilite Faire Plein attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean possibiliteFairePleinESet;

	/**
	 * The default value of the '{@link #getTypePlein() <em>Type Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePlein()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPortTypePlein TYPE_PLEIN_EDEFAULT = TypeDictionaryDicoPortTypePlein.BKRBRG;

	/**
	 * The cached value of the '{@link #getTypePlein() <em>Type Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePlein()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPortTypePlein typePlein = TYPE_PLEIN_EDEFAULT;

	/**
	 * This is true if the Type Plein attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePleinESet;

	/**
	 * The default value of the '{@link #getDetailsLiesAuPlein() <em>Details Lies Au Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailsLiesAuPlein()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_LIES_AU_PLEIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailsLiesAuPlein() <em>Details Lies Au Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailsLiesAuPlein()
	 * @generated
	 * @ordered
	 */
	protected String detailsLiesAuPlein = DETAILS_LIES_AU_PLEIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isEauDisponible() <em>Eau Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEauDisponible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EAU_DISPONIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEauDisponible() <em>Eau Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEauDisponible()
	 * @generated
	 * @ordered
	 */
	protected boolean eauDisponible = EAU_DISPONIBLE_EDEFAULT;

	/**
	 * This is true if the Eau Disponible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eauDisponibleESet;

	/**
	 * The default value of the '{@link #isExistenceCapaciteAntiIncendie() <em>Existence Capacite Anti Incendie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExistenceCapaciteAntiIncendie()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXISTENCE_CAPACITE_ANTI_INCENDIE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExistenceCapaciteAntiIncendie() <em>Existence Capacite Anti Incendie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExistenceCapaciteAntiIncendie()
	 * @generated
	 * @ordered
	 */
	protected boolean existenceCapaciteAntiIncendie = EXISTENCE_CAPACITE_ANTI_INCENDIE_EDEFAULT;

	/**
	 * This is true if the Existence Capacite Anti Incendie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean existenceCapaciteAntiIncendieESet;

	/**
	 * The default value of the '{@link #getTypeCapaciteAntiIncendie() <em>Type Capacite Anti Incendie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCapaciteAntiIncendie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPortTypeCapaciteAntiIncendie TYPE_CAPACITE_ANTI_INCENDIE_EDEFAULT = TypeDictionaryDicoPortTypeCapaciteAntiIncendie.AFLOAT;

	/**
	 * The cached value of the '{@link #getTypeCapaciteAntiIncendie() <em>Type Capacite Anti Incendie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCapaciteAntiIncendie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPortTypeCapaciteAntiIncendie typeCapaciteAntiIncendie = TYPE_CAPACITE_ANTI_INCENDIE_EDEFAULT;

	/**
	 * This is true if the Type Capacite Anti Incendie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCapaciteAntiIncendieESet;

	/**
	 * The default value of the '{@link #isFacilitesTransit() <em>Facilites Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFacilitesTransit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FACILITES_TRANSIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFacilitesTransit() <em>Facilites Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFacilitesTransit()
	 * @generated
	 * @ordered
	 */
	protected boolean facilitesTransit = FACILITES_TRANSIT_EDEFAULT;

	/**
	 * This is true if the Facilites Transit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean facilitesTransitESet;

	/**
	 * The default value of the '{@link #isCapaciteAGererPassagers() <em>Capacite AGerer Passagers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapaciteAGererPassagers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAPACITE_AGERER_PASSAGERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCapaciteAGererPassagers() <em>Capacite AGerer Passagers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapaciteAGererPassagers()
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteAGererPassagers = CAPACITE_AGERER_PASSAGERS_EDEFAULT;

	/**
	 * This is true if the Capacite AGerer Passagers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteAGererPassagersESet;

	/**
	 * The default value of the '{@link #isInstallationsTraitementPetroliers() <em>Installations Traitement Petroliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstallationsTraitementPetroliers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTALLATIONS_TRAITEMENT_PETROLIERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstallationsTraitementPetroliers() <em>Installations Traitement Petroliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstallationsTraitementPetroliers()
	 * @generated
	 * @ordered
	 */
	protected boolean installationsTraitementPetroliers = INSTALLATIONS_TRAITEMENT_PETROLIERS_EDEFAULT;

	/**
	 * This is true if the Installations Traitement Petroliers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean installationsTraitementPetroliersESet;

	/**
	 * The default value of the '{@link #isSecurisationBiologique() <em>Securisation Biologique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurisationBiologique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SECURISATION_BIOLOGIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSecurisationBiologique() <em>Securisation Biologique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurisationBiologique()
	 * @generated
	 * @ordered
	 */
	protected boolean securisationBiologique = SECURISATION_BIOLOGIQUE_EDEFAULT;

	/**
	 * This is true if the Securisation Biologique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securisationBiologiqueESet;

	/**
	 * The default value of the '{@link #isCapaciteReceptionLestSouille() <em>Capacite Reception Lest Souille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapaciteReceptionLestSouille()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAPACITE_RECEPTION_LEST_SOUILLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCapaciteReceptionLestSouille() <em>Capacite Reception Lest Souille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapaciteReceptionLestSouille()
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteReceptionLestSouille = CAPACITE_RECEPTION_LEST_SOUILLE_EDEFAULT;

	/**
	 * This is true if the Capacite Reception Lest Souille attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteReceptionLestSouilleESet;

	/**
	 * The default value of the '{@link #isInstallationsDemagnetisation() <em>Installations Demagnetisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstallationsDemagnetisation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTALLATIONS_DEMAGNETISATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstallationsDemagnetisation() <em>Installations Demagnetisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstallationsDemagnetisation()
	 * @generated
	 * @ordered
	 */
	protected boolean installationsDemagnetisation = INSTALLATIONS_DEMAGNETISATION_EDEFAULT;

	/**
	 * This is true if the Installations Demagnetisation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean installationsDemagnetisationESet;

	/**
	 * The default value of the '{@link #isPossibiliteUsageAccon() <em>Possibilite Usage Accon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPossibiliteUsageAccon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSSIBILITE_USAGE_ACCON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPossibiliteUsageAccon() <em>Possibilite Usage Accon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPossibiliteUsageAccon()
	 * @generated
	 * @ordered
	 */
	protected boolean possibiliteUsageAccon = POSSIBILITE_USAGE_ACCON_EDEFAULT;

	/**
	 * This is true if the Possibilite Usage Accon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean possibiliteUsageAcconESet;

	/**
	 * The default value of the '{@link #isTransportParAcconage() <em>Transport Par Acconage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParAcconage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORT_PAR_ACCONAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportParAcconage() <em>Transport Par Acconage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParAcconage()
	 * @generated
	 * @ordered
	 */
	protected boolean transportParAcconage = TRANSPORT_PAR_ACCONAGE_EDEFAULT;

	/**
	 * This is true if the Transport Par Acconage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportParAcconageESet;

	/**
	 * The default value of the '{@link #isZonePourTourner() <em>Zone Pour Tourner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZonePourTourner()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZONE_POUR_TOURNER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZonePourTourner() <em>Zone Pour Tourner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZonePourTourner()
	 * @generated
	 * @ordered
	 */
	protected boolean zonePourTourner = ZONE_POUR_TOURNER_EDEFAULT;

	/**
	 * This is true if the Zone Pour Tourner attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zonePourTournerESet;

	/**
	 * The default value of the '{@link #isObligationMessageHeureArriveePrevue() <em>Obligation Message Heure Arrivee Prevue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligationMessageHeureArriveePrevue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObligationMessageHeureArriveePrevue() <em>Obligation Message Heure Arrivee Prevue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligationMessageHeureArriveePrevue()
	 * @generated
	 * @ordered
	 */
	protected boolean obligationMessageHeureArriveePrevue = OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE_EDEFAULT;

	/**
	 * This is true if the Obligation Message Heure Arrivee Prevue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean obligationMessageHeureArriveePrevueESet;

	/**
	 * The default value of the '{@link #isDouaneOuServicesImmigration() <em>Douane Ou Services Immigration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDouaneOuServicesImmigration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOUANE_OU_SERVICES_IMMIGRATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDouaneOuServicesImmigration() <em>Douane Ou Services Immigration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDouaneOuServicesImmigration()
	 * @generated
	 * @ordered
	 */
	protected boolean douaneOuServicesImmigration = DOUANE_OU_SERVICES_IMMIGRATION_EDEFAULT;

	/**
	 * This is true if the Douane Ou Services Immigration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean douaneOuServicesImmigrationESet;

	/**
	 * The default value of the '{@link #isEntreeRestreintePourCauseForteHoule() <em>Entree Restreinte Pour Cause Forte Houle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntreeRestreintePourCauseForteHoule()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEntreeRestreintePourCauseForteHoule() <em>Entree Restreinte Pour Cause Forte Houle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntreeRestreintePourCauseForteHoule()
	 * @generated
	 * @ordered
	 */
	protected boolean entreeRestreintePourCauseForteHoule = ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE_EDEFAULT;

	/**
	 * This is true if the Entree Restreinte Pour Cause Forte Houle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entreeRestreintePourCauseForteHouleESet;

	/**
	 * The default value of the '{@link #isEntreeRestreintePourCauseGlace() <em>Entree Restreinte Pour Cause Glace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntreeRestreintePourCauseGlace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTREE_RESTREINTE_POUR_CAUSE_GLACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEntreeRestreintePourCauseGlace() <em>Entree Restreinte Pour Cause Glace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntreeRestreintePourCauseGlace()
	 * @generated
	 * @ordered
	 */
	protected boolean entreeRestreintePourCauseGlace = ENTREE_RESTREINTE_POUR_CAUSE_GLACE_EDEFAULT;

	/**
	 * This is true if the Entree Restreinte Pour Cause Glace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entreeRestreintePourCauseGlaceESet;

	/**
	 * The default value of the '{@link #getMesuresRestrictionEntree() <em>Mesures Restriction Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresRestrictionEntree()
	 * @generated
	 * @ordered
	 */
	protected static final String MESURES_RESTRICTION_ENTREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMesuresRestrictionEntree() <em>Mesures Restriction Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresRestrictionEntree()
	 * @generated
	 * @ordered
	 */
	protected String mesuresRestrictionEntree = MESURES_RESTRICTION_ENTREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailsSaisonniers() <em>Details Saisonniers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailsSaisonniers()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_SAISONNIERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailsSaisonniers() <em>Details Saisonniers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailsSaisonniers()
	 * @generated
	 * @ordered
	 */
	protected String detailsSaisonniers = DETAILS_SAISONNIERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getTirantEauMaximum() {
		return tirantEauMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTirantEauMaximum(TypeDataTypeLongueur newTirantEauMaximum, NotificationChain msgs) {
		TypeDataTypeLongueur oldTirantEauMaximum = tirantEauMaximum;
		tirantEauMaximum = newTirantEauMaximum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__TIRANT_EAU_MAXIMUM, oldTirantEauMaximum, newTirantEauMaximum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTirantEauMaximum(TypeDataTypeLongueur newTirantEauMaximum) {
		if (newTirantEauMaximum != tirantEauMaximum) {
			NotificationChain msgs = null;
			if (tirantEauMaximum != null)
				msgs = ((InternalEObject)tirantEauMaximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__TIRANT_EAU_MAXIMUM, null, msgs);
			if (newTirantEauMaximum != null)
				msgs = ((InternalEObject)newTirantEauMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__TIRANT_EAU_MAXIMUM, null, msgs);
			msgs = basicSetTirantEauMaximum(newTirantEauMaximum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__TIRANT_EAU_MAXIMUM, newTirantEauMaximum, newTirantEauMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTonnageMaximumAutorise() {
		return tonnageMaximumAutorise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTonnageMaximumAutorise(long newTonnageMaximumAutorise) {
		long oldTonnageMaximumAutorise = tonnageMaximumAutorise;
		tonnageMaximumAutorise = newTonnageMaximumAutorise;
		boolean oldTonnageMaximumAutoriseESet = tonnageMaximumAutoriseESet;
		tonnageMaximumAutoriseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__TONNAGE_MAXIMUM_AUTORISE, oldTonnageMaximumAutorise, tonnageMaximumAutorise, !oldTonnageMaximumAutoriseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTonnageMaximumAutorise() {
		long oldTonnageMaximumAutorise = tonnageMaximumAutorise;
		boolean oldTonnageMaximumAutoriseESet = tonnageMaximumAutoriseESet;
		tonnageMaximumAutorise = TONNAGE_MAXIMUM_AUTORISE_EDEFAULT;
		tonnageMaximumAutoriseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__TONNAGE_MAXIMUM_AUTORISE, oldTonnageMaximumAutorise, TONNAGE_MAXIMUM_AUTORISE_EDEFAULT, oldTonnageMaximumAutoriseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTonnageMaximumAutorise() {
		return tonnageMaximumAutoriseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPiloteNecessaire() {
		return piloteNecessaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPiloteNecessaire(boolean newPiloteNecessaire) {
		boolean oldPiloteNecessaire = piloteNecessaire;
		piloteNecessaire = newPiloteNecessaire;
		boolean oldPiloteNecessaireESet = piloteNecessaireESet;
		piloteNecessaireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__PILOTE_NECESSAIRE, oldPiloteNecessaire, piloteNecessaire, !oldPiloteNecessaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPiloteNecessaire() {
		boolean oldPiloteNecessaire = piloteNecessaire;
		boolean oldPiloteNecessaireESet = piloteNecessaireESet;
		piloteNecessaire = PILOTE_NECESSAIRE_EDEFAULT;
		piloteNecessaireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__PILOTE_NECESSAIRE, oldPiloteNecessaire, PILOTE_NECESSAIRE_EDEFAULT, oldPiloteNecessaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPiloteNecessaire() {
		return piloteNecessaireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProximiteAeroport() {
		return proximiteAeroport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProximiteAeroport(boolean newProximiteAeroport) {
		boolean oldProximiteAeroport = proximiteAeroport;
		proximiteAeroport = newProximiteAeroport;
		boolean oldProximiteAeroportESet = proximiteAeroportESet;
		proximiteAeroportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__PROXIMITE_AEROPORT, oldProximiteAeroport, proximiteAeroport, !oldProximiteAeroportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProximiteAeroport() {
		boolean oldProximiteAeroport = proximiteAeroport;
		boolean oldProximiteAeroportESet = proximiteAeroportESet;
		proximiteAeroport = PROXIMITE_AEROPORT_EDEFAULT;
		proximiteAeroportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__PROXIMITE_AEROPORT, oldProximiteAeroport, PROXIMITE_AEROPORT_EDEFAULT, oldProximiteAeroportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProximiteAeroport() {
		return proximiteAeroportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeExplosiveLimiteJour() {
		return chargeExplosiveLimiteJour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeExplosiveLimiteJour(TypeDataTypeMasse newChargeExplosiveLimiteJour, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeExplosiveLimiteJour = chargeExplosiveLimiteJour;
		chargeExplosiveLimiteJour = newChargeExplosiveLimiteJour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_JOUR, oldChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeExplosiveLimiteJour(TypeDataTypeMasse newChargeExplosiveLimiteJour) {
		if (newChargeExplosiveLimiteJour != chargeExplosiveLimiteJour) {
			NotificationChain msgs = null;
			if (chargeExplosiveLimiteJour != null)
				msgs = ((InternalEObject)chargeExplosiveLimiteJour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			if (newChargeExplosiveLimiteJour != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteJour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			msgs = basicSetChargeExplosiveLimiteJour(newChargeExplosiveLimiteJour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_JOUR, newChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeExplosiveLimiteNuit() {
		return chargeExplosiveLimiteNuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeExplosiveLimiteNuit(TypeDataTypeMasse newChargeExplosiveLimiteNuit, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeExplosiveLimiteNuit = chargeExplosiveLimiteNuit;
		chargeExplosiveLimiteNuit = newChargeExplosiveLimiteNuit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_NUIT, oldChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeExplosiveLimiteNuit(TypeDataTypeMasse newChargeExplosiveLimiteNuit) {
		if (newChargeExplosiveLimiteNuit != chargeExplosiveLimiteNuit) {
			NotificationChain msgs = null;
			if (chargeExplosiveLimiteNuit != null)
				msgs = ((InternalEObject)chargeExplosiveLimiteNuit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			if (newChargeExplosiveLimiteNuit != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteNuit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			msgs = basicSetChargeExplosiveLimiteNuit(newChargeExplosiveLimiteNuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_NUIT, newChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLimitationEnHauteur() {
		return limitationEnHauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitationEnHauteur(boolean newLimitationEnHauteur) {
		boolean oldLimitationEnHauteur = limitationEnHauteur;
		limitationEnHauteur = newLimitationEnHauteur;
		boolean oldLimitationEnHauteurESet = limitationEnHauteurESet;
		limitationEnHauteurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__LIMITATION_EN_HAUTEUR, oldLimitationEnHauteur, limitationEnHauteur, !oldLimitationEnHauteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLimitationEnHauteur() {
		boolean oldLimitationEnHauteur = limitationEnHauteur;
		boolean oldLimitationEnHauteurESet = limitationEnHauteurESet;
		limitationEnHauteur = LIMITATION_EN_HAUTEUR_EDEFAULT;
		limitationEnHauteurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__LIMITATION_EN_HAUTEUR, oldLimitationEnHauteur, LIMITATION_EN_HAUTEUR_EDEFAULT, oldLimitationEnHauteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLimitationEnHauteur() {
		return limitationEnHauteurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPortQualiteAbri getQualiteAbri() {
		return qualiteAbri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualiteAbri(TypeDictionaryDicoPortQualiteAbri newQualiteAbri) {
		TypeDictionaryDicoPortQualiteAbri oldQualiteAbri = qualiteAbri;
		qualiteAbri = newQualiteAbri == null ? QUALITE_ABRI_EDEFAULT : newQualiteAbri;
		boolean oldQualiteAbriESet = qualiteAbriESet;
		qualiteAbriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__QUALITE_ABRI, oldQualiteAbri, qualiteAbri, !oldQualiteAbriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualiteAbri() {
		TypeDictionaryDicoPortQualiteAbri oldQualiteAbri = qualiteAbri;
		boolean oldQualiteAbriESet = qualiteAbriESet;
		qualiteAbri = QUALITE_ABRI_EDEFAULT;
		qualiteAbriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__QUALITE_ABRI, oldQualiteAbri, QUALITE_ABRI_EDEFAULT, oldQualiteAbriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualiteAbri() {
		return qualiteAbriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPortDurabilite getDurabilite() {
		return durabilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurabilite(TypeDictionaryDicoPortDurabilite newDurabilite) {
		TypeDictionaryDicoPortDurabilite oldDurabilite = durabilite;
		durabilite = newDurabilite == null ? DURABILITE_EDEFAULT : newDurabilite;
		boolean oldDurabiliteESet = durabiliteESet;
		durabiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__DURABILITE, oldDurabilite, durabilite, !oldDurabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDurabilite() {
		TypeDictionaryDicoPortDurabilite oldDurabilite = durabilite;
		boolean oldDurabiliteESet = durabiliteESet;
		durabilite = DURABILITE_EDEFAULT;
		durabiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__DURABILITE, oldDurabilite, DURABILITE_EDEFAULT, oldDurabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDurabilite() {
		return durabiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisponibilitePilote() {
		return disponibilitePilote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibilitePilote(boolean newDisponibilitePilote) {
		boolean oldDisponibilitePilote = disponibilitePilote;
		disponibilitePilote = newDisponibilitePilote;
		boolean oldDisponibilitePiloteESet = disponibilitePiloteESet;
		disponibilitePiloteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__DISPONIBILITE_PILOTE, oldDisponibilitePilote, disponibilitePilote, !oldDisponibilitePiloteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibilitePilote() {
		boolean oldDisponibilitePilote = disponibilitePilote;
		boolean oldDisponibilitePiloteESet = disponibilitePiloteESet;
		disponibilitePilote = DISPONIBILITE_PILOTE_EDEFAULT;
		disponibilitePiloteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__DISPONIBILITE_PILOTE, oldDisponibilitePilote, DISPONIBILITE_PILOTE_EDEFAULT, oldDisponibilitePiloteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibilitePilote() {
		return disponibilitePiloteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisponibiliteRemorqueur() {
		return disponibiliteRemorqueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibiliteRemorqueur(boolean newDisponibiliteRemorqueur) {
		boolean oldDisponibiliteRemorqueur = disponibiliteRemorqueur;
		disponibiliteRemorqueur = newDisponibiliteRemorqueur;
		boolean oldDisponibiliteRemorqueurESet = disponibiliteRemorqueurESet;
		disponibiliteRemorqueurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__DISPONIBILITE_REMORQUEUR, oldDisponibiliteRemorqueur, disponibiliteRemorqueur, !oldDisponibiliteRemorqueurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibiliteRemorqueur() {
		boolean oldDisponibiliteRemorqueur = disponibiliteRemorqueur;
		boolean oldDisponibiliteRemorqueurESet = disponibiliteRemorqueurESet;
		disponibiliteRemorqueur = DISPONIBILITE_REMORQUEUR_EDEFAULT;
		disponibiliteRemorqueurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__DISPONIBILITE_REMORQUEUR, oldDisponibiliteRemorqueur, DISPONIBILITE_REMORQUEUR_EDEFAULT, oldDisponibiliteRemorqueurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibiliteRemorqueur() {
		return disponibiliteRemorqueurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEncadrementConvoi() {
		return encadrementConvoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncadrementConvoi(boolean newEncadrementConvoi) {
		boolean oldEncadrementConvoi = encadrementConvoi;
		encadrementConvoi = newEncadrementConvoi;
		boolean oldEncadrementConvoiESet = encadrementConvoiESet;
		encadrementConvoiESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__ENCADREMENT_CONVOI, oldEncadrementConvoi, encadrementConvoi, !oldEncadrementConvoiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncadrementConvoi() {
		boolean oldEncadrementConvoi = encadrementConvoi;
		boolean oldEncadrementConvoiESet = encadrementConvoiESet;
		encadrementConvoi = ENCADREMENT_CONVOI_EDEFAULT;
		encadrementConvoiESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__ENCADREMENT_CONVOI, oldEncadrementConvoi, ENCADREMENT_CONVOI_EDEFAULT, oldEncadrementConvoiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEncadrementConvoi() {
		return encadrementConvoiESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurCouloir() {
		return largeurCouloir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurCouloir(TypeDataTypeLongueur newLargeurCouloir, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurCouloir = largeurCouloir;
		largeurCouloir = newLargeurCouloir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__LARGEUR_COULOIR, oldLargeurCouloir, newLargeurCouloir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurCouloir(TypeDataTypeLongueur newLargeurCouloir) {
		if (newLargeurCouloir != largeurCouloir) {
			NotificationChain msgs = null;
			if (largeurCouloir != null)
				msgs = ((InternalEObject)largeurCouloir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__LARGEUR_COULOIR, null, msgs);
			if (newLargeurCouloir != null)
				msgs = ((InternalEObject)newLargeurCouloir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__LARGEUR_COULOIR, null, msgs);
			msgs = basicSetLargeurCouloir(newLargeurCouloir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__LARGEUR_COULOIR, newLargeurCouloir, newLargeurCouloir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueurMaximale() {
		return longueurMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueurMaximale(TypeDataTypeLongueur newLongueurMaximale, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueurMaximale = longueurMaximale;
		longueurMaximale = newLongueurMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__LONGUEUR_MAXIMALE, oldLongueurMaximale, newLongueurMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurMaximale(TypeDataTypeLongueur newLongueurMaximale) {
		if (newLongueurMaximale != longueurMaximale) {
			NotificationChain msgs = null;
			if (longueurMaximale != null)
				msgs = ((InternalEObject)longueurMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__LONGUEUR_MAXIMALE, null, msgs);
			if (newLongueurMaximale != null)
				msgs = ((InternalEObject)newLongueurMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__LONGUEUR_MAXIMALE, null, msgs);
			msgs = basicSetLongueurMaximale(newLongueurMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__LONGUEUR_MAXIMALE, newLongueurMaximale, newLongueurMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurMaximale() {
		return largeurMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurMaximale(TypeDataTypeLongueur newLargeurMaximale, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurMaximale = largeurMaximale;
		largeurMaximale = newLargeurMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__LARGEUR_MAXIMALE, oldLargeurMaximale, newLargeurMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurMaximale(TypeDataTypeLongueur newLargeurMaximale) {
		if (newLargeurMaximale != largeurMaximale) {
			NotificationChain msgs = null;
			if (largeurMaximale != null)
				msgs = ((InternalEObject)largeurMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__LARGEUR_MAXIMALE, null, msgs);
			if (newLargeurMaximale != null)
				msgs = ((InternalEObject)newLargeurMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__LARGEUR_MAXIMALE, null, msgs);
			msgs = basicSetLargeurMaximale(newLargeurMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__LARGEUR_MAXIMALE, newLargeurMaximale, newLargeurMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getAmplitudeMaximaleMaree() {
		return amplitudeMaximaleMaree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmplitudeMaximaleMaree(TypeDataTypeLongueur newAmplitudeMaximaleMaree, NotificationChain msgs) {
		TypeDataTypeLongueur oldAmplitudeMaximaleMaree = amplitudeMaximaleMaree;
		amplitudeMaximaleMaree = newAmplitudeMaximaleMaree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__AMPLITUDE_MAXIMALE_MAREE, oldAmplitudeMaximaleMaree, newAmplitudeMaximaleMaree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmplitudeMaximaleMaree(TypeDataTypeLongueur newAmplitudeMaximaleMaree) {
		if (newAmplitudeMaximaleMaree != amplitudeMaximaleMaree) {
			NotificationChain msgs = null;
			if (amplitudeMaximaleMaree != null)
				msgs = ((InternalEObject)amplitudeMaximaleMaree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__AMPLITUDE_MAXIMALE_MAREE, null, msgs);
			if (newAmplitudeMaximaleMaree != null)
				msgs = ((InternalEObject)newAmplitudeMaximaleMaree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__AMPLITUDE_MAXIMALE_MAREE, null, msgs);
			msgs = basicSetAmplitudeMaximaleMaree(newAmplitudeMaximaleMaree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__AMPLITUDE_MAXIMALE_MAREE, newAmplitudeMaximaleMaree, newAmplitudeMaximaleMaree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getAmplitudeMinimaleMaree() {
		return amplitudeMinimaleMaree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmplitudeMinimaleMaree(TypeDataTypeLongueur newAmplitudeMinimaleMaree, NotificationChain msgs) {
		TypeDataTypeLongueur oldAmplitudeMinimaleMaree = amplitudeMinimaleMaree;
		amplitudeMinimaleMaree = newAmplitudeMinimaleMaree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__AMPLITUDE_MINIMALE_MAREE, oldAmplitudeMinimaleMaree, newAmplitudeMinimaleMaree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmplitudeMinimaleMaree(TypeDataTypeLongueur newAmplitudeMinimaleMaree) {
		if (newAmplitudeMinimaleMaree != amplitudeMinimaleMaree) {
			NotificationChain msgs = null;
			if (amplitudeMinimaleMaree != null)
				msgs = ((InternalEObject)amplitudeMinimaleMaree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__AMPLITUDE_MINIMALE_MAREE, null, msgs);
			if (newAmplitudeMinimaleMaree != null)
				msgs = ((InternalEObject)newAmplitudeMinimaleMaree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__AMPLITUDE_MINIMALE_MAREE, null, msgs);
			msgs = basicSetAmplitudeMinimaleMaree(newAmplitudeMinimaleMaree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__AMPLITUDE_MINIMALE_MAREE, newAmplitudeMinimaleMaree, newAmplitudeMinimaleMaree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseMoyenneMaree() {
		return vitesseMoyenneMaree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseMoyenneMaree(TypeDataTypeVitesseLineaire newVitesseMoyenneMaree, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseMoyenneMaree = vitesseMoyenneMaree;
		vitesseMoyenneMaree = newVitesseMoyenneMaree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__VITESSE_MOYENNE_MAREE, oldVitesseMoyenneMaree, newVitesseMoyenneMaree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMoyenneMaree(TypeDataTypeVitesseLineaire newVitesseMoyenneMaree) {
		if (newVitesseMoyenneMaree != vitesseMoyenneMaree) {
			NotificationChain msgs = null;
			if (vitesseMoyenneMaree != null)
				msgs = ((InternalEObject)vitesseMoyenneMaree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__VITESSE_MOYENNE_MAREE, null, msgs);
			if (newVitesseMoyenneMaree != null)
				msgs = ((InternalEObject)newVitesseMoyenneMaree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__VITESSE_MOYENNE_MAREE, null, msgs);
			msgs = basicSetVitesseMoyenneMaree(newVitesseMoyenneMaree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__VITESSE_MOYENNE_MAREE, newVitesseMoyenneMaree, newVitesseMoyenneMaree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailsRelatifsAuxMarees() {
		return detailsRelatifsAuxMarees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailsRelatifsAuxMarees(String newDetailsRelatifsAuxMarees) {
		String oldDetailsRelatifsAuxMarees = detailsRelatifsAuxMarees;
		detailsRelatifsAuxMarees = newDetailsRelatifsAuxMarees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__DETAILS_RELATIFS_AUX_MAREES, oldDetailsRelatifsAuxMarees, detailsRelatifsAuxMarees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDirection getDirectionPredominanteVent() {
		return directionPredominanteVent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionPredominanteVent(TypeDictionaryDicoDirection newDirectionPredominanteVent) {
		TypeDictionaryDicoDirection oldDirectionPredominanteVent = directionPredominanteVent;
		directionPredominanteVent = newDirectionPredominanteVent == null ? DIRECTION_PREDOMINANTE_VENT_EDEFAULT : newDirectionPredominanteVent;
		boolean oldDirectionPredominanteVentESet = directionPredominanteVentESet;
		directionPredominanteVentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__DIRECTION_PREDOMINANTE_VENT, oldDirectionPredominanteVent, directionPredominanteVent, !oldDirectionPredominanteVentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirectionPredominanteVent() {
		TypeDictionaryDicoDirection oldDirectionPredominanteVent = directionPredominanteVent;
		boolean oldDirectionPredominanteVentESet = directionPredominanteVentESet;
		directionPredominanteVent = DIRECTION_PREDOMINANTE_VENT_EDEFAULT;
		directionPredominanteVentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__DIRECTION_PREDOMINANTE_VENT, oldDirectionPredominanteVent, DIRECTION_PREDOMINANTE_VENT_EDEFAULT, oldDirectionPredominanteVentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectionPredominanteVent() {
		return directionPredominanteVentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrecisionVitesse getVitesseMaximaleVentDominant() {
		return vitesseMaximaleVentDominant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMaximaleVentDominant(TypeDictionaryDicoPrecisionVitesse newVitesseMaximaleVentDominant) {
		TypeDictionaryDicoPrecisionVitesse oldVitesseMaximaleVentDominant = vitesseMaximaleVentDominant;
		vitesseMaximaleVentDominant = newVitesseMaximaleVentDominant == null ? VITESSE_MAXIMALE_VENT_DOMINANT_EDEFAULT : newVitesseMaximaleVentDominant;
		boolean oldVitesseMaximaleVentDominantESet = vitesseMaximaleVentDominantESet;
		vitesseMaximaleVentDominantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_VENT_DOMINANT, oldVitesseMaximaleVentDominant, vitesseMaximaleVentDominant, !oldVitesseMaximaleVentDominantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseMaximaleVentDominant() {
		TypeDictionaryDicoPrecisionVitesse oldVitesseMaximaleVentDominant = vitesseMaximaleVentDominant;
		boolean oldVitesseMaximaleVentDominantESet = vitesseMaximaleVentDominantESet;
		vitesseMaximaleVentDominant = VITESSE_MAXIMALE_VENT_DOMINANT_EDEFAULT;
		vitesseMaximaleVentDominantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_VENT_DOMINANT, oldVitesseMaximaleVentDominant, VITESSE_MAXIMALE_VENT_DOMINANT_EDEFAULT, oldVitesseMaximaleVentDominantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseMaximaleVentDominant() {
		return vitesseMaximaleVentDominantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseMaximaleEnregistree() {
		return vitesseMaximaleEnregistree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseMaximaleEnregistree(TypeDataTypeVitesseLineaire newVitesseMaximaleEnregistree, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseMaximaleEnregistree = vitesseMaximaleEnregistree;
		vitesseMaximaleEnregistree = newVitesseMaximaleEnregistree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_ENREGISTREE, oldVitesseMaximaleEnregistree, newVitesseMaximaleEnregistree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMaximaleEnregistree(TypeDataTypeVitesseLineaire newVitesseMaximaleEnregistree) {
		if (newVitesseMaximaleEnregistree != vitesseMaximaleEnregistree) {
			NotificationChain msgs = null;
			if (vitesseMaximaleEnregistree != null)
				msgs = ((InternalEObject)vitesseMaximaleEnregistree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_ENREGISTREE, null, msgs);
			if (newVitesseMaximaleEnregistree != null)
				msgs = ((InternalEObject)newVitesseMaximaleEnregistree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_ENREGISTREE, null, msgs);
			msgs = basicSetVitesseMaximaleEnregistree(newVitesseMaximaleEnregistree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_ENREGISTREE, newVitesseMaximaleEnregistree, newVitesseMaximaleEnregistree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPortInstallationsDisponibles getInstallationsDisponibles() {
		return installationsDisponibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallationsDisponibles(TypeDictionaryDicoPortInstallationsDisponibles newInstallationsDisponibles) {
		TypeDictionaryDicoPortInstallationsDisponibles oldInstallationsDisponibles = installationsDisponibles;
		installationsDisponibles = newInstallationsDisponibles == null ? INSTALLATIONS_DISPONIBLES_EDEFAULT : newInstallationsDisponibles;
		boolean oldInstallationsDisponiblesESet = installationsDisponiblesESet;
		installationsDisponiblesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__INSTALLATIONS_DISPONIBLES, oldInstallationsDisponibles, installationsDisponibles, !oldInstallationsDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstallationsDisponibles() {
		TypeDictionaryDicoPortInstallationsDisponibles oldInstallationsDisponibles = installationsDisponibles;
		boolean oldInstallationsDisponiblesESet = installationsDisponiblesESet;
		installationsDisponibles = INSTALLATIONS_DISPONIBLES_EDEFAULT;
		installationsDisponiblesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__INSTALLATIONS_DISPONIBLES, oldInstallationsDisponibles, INSTALLATIONS_DISPONIBLES_EDEFAULT, oldInstallationsDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstallationsDisponibles() {
		return installationsDisponiblesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPossibiliteFairePlein() {
		return possibiliteFairePlein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossibiliteFairePlein(boolean newPossibiliteFairePlein) {
		boolean oldPossibiliteFairePlein = possibiliteFairePlein;
		possibiliteFairePlein = newPossibiliteFairePlein;
		boolean oldPossibiliteFairePleinESet = possibiliteFairePleinESet;
		possibiliteFairePleinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__POSSIBILITE_FAIRE_PLEIN, oldPossibiliteFairePlein, possibiliteFairePlein, !oldPossibiliteFairePleinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPossibiliteFairePlein() {
		boolean oldPossibiliteFairePlein = possibiliteFairePlein;
		boolean oldPossibiliteFairePleinESet = possibiliteFairePleinESet;
		possibiliteFairePlein = POSSIBILITE_FAIRE_PLEIN_EDEFAULT;
		possibiliteFairePleinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__POSSIBILITE_FAIRE_PLEIN, oldPossibiliteFairePlein, POSSIBILITE_FAIRE_PLEIN_EDEFAULT, oldPossibiliteFairePleinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPossibiliteFairePlein() {
		return possibiliteFairePleinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPortTypePlein getTypePlein() {
		return typePlein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePlein(TypeDictionaryDicoPortTypePlein newTypePlein) {
		TypeDictionaryDicoPortTypePlein oldTypePlein = typePlein;
		typePlein = newTypePlein == null ? TYPE_PLEIN_EDEFAULT : newTypePlein;
		boolean oldTypePleinESet = typePleinESet;
		typePleinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__TYPE_PLEIN, oldTypePlein, typePlein, !oldTypePleinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePlein() {
		TypeDictionaryDicoPortTypePlein oldTypePlein = typePlein;
		boolean oldTypePleinESet = typePleinESet;
		typePlein = TYPE_PLEIN_EDEFAULT;
		typePleinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__TYPE_PLEIN, oldTypePlein, TYPE_PLEIN_EDEFAULT, oldTypePleinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypePlein() {
		return typePleinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailsLiesAuPlein() {
		return detailsLiesAuPlein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailsLiesAuPlein(String newDetailsLiesAuPlein) {
		String oldDetailsLiesAuPlein = detailsLiesAuPlein;
		detailsLiesAuPlein = newDetailsLiesAuPlein;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__DETAILS_LIES_AU_PLEIN, oldDetailsLiesAuPlein, detailsLiesAuPlein));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEauDisponible() {
		return eauDisponible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEauDisponible(boolean newEauDisponible) {
		boolean oldEauDisponible = eauDisponible;
		eauDisponible = newEauDisponible;
		boolean oldEauDisponibleESet = eauDisponibleESet;
		eauDisponibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__EAU_DISPONIBLE, oldEauDisponible, eauDisponible, !oldEauDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEauDisponible() {
		boolean oldEauDisponible = eauDisponible;
		boolean oldEauDisponibleESet = eauDisponibleESet;
		eauDisponible = EAU_DISPONIBLE_EDEFAULT;
		eauDisponibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__EAU_DISPONIBLE, oldEauDisponible, EAU_DISPONIBLE_EDEFAULT, oldEauDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEauDisponible() {
		return eauDisponibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExistenceCapaciteAntiIncendie() {
		return existenceCapaciteAntiIncendie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExistenceCapaciteAntiIncendie(boolean newExistenceCapaciteAntiIncendie) {
		boolean oldExistenceCapaciteAntiIncendie = existenceCapaciteAntiIncendie;
		existenceCapaciteAntiIncendie = newExistenceCapaciteAntiIncendie;
		boolean oldExistenceCapaciteAntiIncendieESet = existenceCapaciteAntiIncendieESet;
		existenceCapaciteAntiIncendieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__EXISTENCE_CAPACITE_ANTI_INCENDIE, oldExistenceCapaciteAntiIncendie, existenceCapaciteAntiIncendie, !oldExistenceCapaciteAntiIncendieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExistenceCapaciteAntiIncendie() {
		boolean oldExistenceCapaciteAntiIncendie = existenceCapaciteAntiIncendie;
		boolean oldExistenceCapaciteAntiIncendieESet = existenceCapaciteAntiIncendieESet;
		existenceCapaciteAntiIncendie = EXISTENCE_CAPACITE_ANTI_INCENDIE_EDEFAULT;
		existenceCapaciteAntiIncendieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__EXISTENCE_CAPACITE_ANTI_INCENDIE, oldExistenceCapaciteAntiIncendie, EXISTENCE_CAPACITE_ANTI_INCENDIE_EDEFAULT, oldExistenceCapaciteAntiIncendieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExistenceCapaciteAntiIncendie() {
		return existenceCapaciteAntiIncendieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPortTypeCapaciteAntiIncendie getTypeCapaciteAntiIncendie() {
		return typeCapaciteAntiIncendie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCapaciteAntiIncendie(TypeDictionaryDicoPortTypeCapaciteAntiIncendie newTypeCapaciteAntiIncendie) {
		TypeDictionaryDicoPortTypeCapaciteAntiIncendie oldTypeCapaciteAntiIncendie = typeCapaciteAntiIncendie;
		typeCapaciteAntiIncendie = newTypeCapaciteAntiIncendie == null ? TYPE_CAPACITE_ANTI_INCENDIE_EDEFAULT : newTypeCapaciteAntiIncendie;
		boolean oldTypeCapaciteAntiIncendieESet = typeCapaciteAntiIncendieESet;
		typeCapaciteAntiIncendieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__TYPE_CAPACITE_ANTI_INCENDIE, oldTypeCapaciteAntiIncendie, typeCapaciteAntiIncendie, !oldTypeCapaciteAntiIncendieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCapaciteAntiIncendie() {
		TypeDictionaryDicoPortTypeCapaciteAntiIncendie oldTypeCapaciteAntiIncendie = typeCapaciteAntiIncendie;
		boolean oldTypeCapaciteAntiIncendieESet = typeCapaciteAntiIncendieESet;
		typeCapaciteAntiIncendie = TYPE_CAPACITE_ANTI_INCENDIE_EDEFAULT;
		typeCapaciteAntiIncendieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__TYPE_CAPACITE_ANTI_INCENDIE, oldTypeCapaciteAntiIncendie, TYPE_CAPACITE_ANTI_INCENDIE_EDEFAULT, oldTypeCapaciteAntiIncendieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCapaciteAntiIncendie() {
		return typeCapaciteAntiIncendieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFacilitesTransit() {
		return facilitesTransit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilitesTransit(boolean newFacilitesTransit) {
		boolean oldFacilitesTransit = facilitesTransit;
		facilitesTransit = newFacilitesTransit;
		boolean oldFacilitesTransitESet = facilitesTransitESet;
		facilitesTransitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__FACILITES_TRANSIT, oldFacilitesTransit, facilitesTransit, !oldFacilitesTransitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFacilitesTransit() {
		boolean oldFacilitesTransit = facilitesTransit;
		boolean oldFacilitesTransitESet = facilitesTransitESet;
		facilitesTransit = FACILITES_TRANSIT_EDEFAULT;
		facilitesTransitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__FACILITES_TRANSIT, oldFacilitesTransit, FACILITES_TRANSIT_EDEFAULT, oldFacilitesTransitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFacilitesTransit() {
		return facilitesTransitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCapaciteAGererPassagers() {
		return capaciteAGererPassagers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteAGererPassagers(boolean newCapaciteAGererPassagers) {
		boolean oldCapaciteAGererPassagers = capaciteAGererPassagers;
		capaciteAGererPassagers = newCapaciteAGererPassagers;
		boolean oldCapaciteAGererPassagersESet = capaciteAGererPassagersESet;
		capaciteAGererPassagersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__CAPACITE_AGERER_PASSAGERS, oldCapaciteAGererPassagers, capaciteAGererPassagers, !oldCapaciteAGererPassagersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteAGererPassagers() {
		boolean oldCapaciteAGererPassagers = capaciteAGererPassagers;
		boolean oldCapaciteAGererPassagersESet = capaciteAGererPassagersESet;
		capaciteAGererPassagers = CAPACITE_AGERER_PASSAGERS_EDEFAULT;
		capaciteAGererPassagersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__CAPACITE_AGERER_PASSAGERS, oldCapaciteAGererPassagers, CAPACITE_AGERER_PASSAGERS_EDEFAULT, oldCapaciteAGererPassagersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteAGererPassagers() {
		return capaciteAGererPassagersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstallationsTraitementPetroliers() {
		return installationsTraitementPetroliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallationsTraitementPetroliers(boolean newInstallationsTraitementPetroliers) {
		boolean oldInstallationsTraitementPetroliers = installationsTraitementPetroliers;
		installationsTraitementPetroliers = newInstallationsTraitementPetroliers;
		boolean oldInstallationsTraitementPetroliersESet = installationsTraitementPetroliersESet;
		installationsTraitementPetroliersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__INSTALLATIONS_TRAITEMENT_PETROLIERS, oldInstallationsTraitementPetroliers, installationsTraitementPetroliers, !oldInstallationsTraitementPetroliersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstallationsTraitementPetroliers() {
		boolean oldInstallationsTraitementPetroliers = installationsTraitementPetroliers;
		boolean oldInstallationsTraitementPetroliersESet = installationsTraitementPetroliersESet;
		installationsTraitementPetroliers = INSTALLATIONS_TRAITEMENT_PETROLIERS_EDEFAULT;
		installationsTraitementPetroliersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__INSTALLATIONS_TRAITEMENT_PETROLIERS, oldInstallationsTraitementPetroliers, INSTALLATIONS_TRAITEMENT_PETROLIERS_EDEFAULT, oldInstallationsTraitementPetroliersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstallationsTraitementPetroliers() {
		return installationsTraitementPetroliersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSecurisationBiologique() {
		return securisationBiologique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurisationBiologique(boolean newSecurisationBiologique) {
		boolean oldSecurisationBiologique = securisationBiologique;
		securisationBiologique = newSecurisationBiologique;
		boolean oldSecurisationBiologiqueESet = securisationBiologiqueESet;
		securisationBiologiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__SECURISATION_BIOLOGIQUE, oldSecurisationBiologique, securisationBiologique, !oldSecurisationBiologiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurisationBiologique() {
		boolean oldSecurisationBiologique = securisationBiologique;
		boolean oldSecurisationBiologiqueESet = securisationBiologiqueESet;
		securisationBiologique = SECURISATION_BIOLOGIQUE_EDEFAULT;
		securisationBiologiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__SECURISATION_BIOLOGIQUE, oldSecurisationBiologique, SECURISATION_BIOLOGIQUE_EDEFAULT, oldSecurisationBiologiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurisationBiologique() {
		return securisationBiologiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCapaciteReceptionLestSouille() {
		return capaciteReceptionLestSouille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteReceptionLestSouille(boolean newCapaciteReceptionLestSouille) {
		boolean oldCapaciteReceptionLestSouille = capaciteReceptionLestSouille;
		capaciteReceptionLestSouille = newCapaciteReceptionLestSouille;
		boolean oldCapaciteReceptionLestSouilleESet = capaciteReceptionLestSouilleESet;
		capaciteReceptionLestSouilleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__CAPACITE_RECEPTION_LEST_SOUILLE, oldCapaciteReceptionLestSouille, capaciteReceptionLestSouille, !oldCapaciteReceptionLestSouilleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteReceptionLestSouille() {
		boolean oldCapaciteReceptionLestSouille = capaciteReceptionLestSouille;
		boolean oldCapaciteReceptionLestSouilleESet = capaciteReceptionLestSouilleESet;
		capaciteReceptionLestSouille = CAPACITE_RECEPTION_LEST_SOUILLE_EDEFAULT;
		capaciteReceptionLestSouilleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__CAPACITE_RECEPTION_LEST_SOUILLE, oldCapaciteReceptionLestSouille, CAPACITE_RECEPTION_LEST_SOUILLE_EDEFAULT, oldCapaciteReceptionLestSouilleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteReceptionLestSouille() {
		return capaciteReceptionLestSouilleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstallationsDemagnetisation() {
		return installationsDemagnetisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallationsDemagnetisation(boolean newInstallationsDemagnetisation) {
		boolean oldInstallationsDemagnetisation = installationsDemagnetisation;
		installationsDemagnetisation = newInstallationsDemagnetisation;
		boolean oldInstallationsDemagnetisationESet = installationsDemagnetisationESet;
		installationsDemagnetisationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__INSTALLATIONS_DEMAGNETISATION, oldInstallationsDemagnetisation, installationsDemagnetisation, !oldInstallationsDemagnetisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstallationsDemagnetisation() {
		boolean oldInstallationsDemagnetisation = installationsDemagnetisation;
		boolean oldInstallationsDemagnetisationESet = installationsDemagnetisationESet;
		installationsDemagnetisation = INSTALLATIONS_DEMAGNETISATION_EDEFAULT;
		installationsDemagnetisationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__INSTALLATIONS_DEMAGNETISATION, oldInstallationsDemagnetisation, INSTALLATIONS_DEMAGNETISATION_EDEFAULT, oldInstallationsDemagnetisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstallationsDemagnetisation() {
		return installationsDemagnetisationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPossibiliteUsageAccon() {
		return possibiliteUsageAccon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossibiliteUsageAccon(boolean newPossibiliteUsageAccon) {
		boolean oldPossibiliteUsageAccon = possibiliteUsageAccon;
		possibiliteUsageAccon = newPossibiliteUsageAccon;
		boolean oldPossibiliteUsageAcconESet = possibiliteUsageAcconESet;
		possibiliteUsageAcconESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__POSSIBILITE_USAGE_ACCON, oldPossibiliteUsageAccon, possibiliteUsageAccon, !oldPossibiliteUsageAcconESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPossibiliteUsageAccon() {
		boolean oldPossibiliteUsageAccon = possibiliteUsageAccon;
		boolean oldPossibiliteUsageAcconESet = possibiliteUsageAcconESet;
		possibiliteUsageAccon = POSSIBILITE_USAGE_ACCON_EDEFAULT;
		possibiliteUsageAcconESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__POSSIBILITE_USAGE_ACCON, oldPossibiliteUsageAccon, POSSIBILITE_USAGE_ACCON_EDEFAULT, oldPossibiliteUsageAcconESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPossibiliteUsageAccon() {
		return possibiliteUsageAcconESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportParAcconage() {
		return transportParAcconage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportParAcconage(boolean newTransportParAcconage) {
		boolean oldTransportParAcconage = transportParAcconage;
		transportParAcconage = newTransportParAcconage;
		boolean oldTransportParAcconageESet = transportParAcconageESet;
		transportParAcconageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__TRANSPORT_PAR_ACCONAGE, oldTransportParAcconage, transportParAcconage, !oldTransportParAcconageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportParAcconage() {
		boolean oldTransportParAcconage = transportParAcconage;
		boolean oldTransportParAcconageESet = transportParAcconageESet;
		transportParAcconage = TRANSPORT_PAR_ACCONAGE_EDEFAULT;
		transportParAcconageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__TRANSPORT_PAR_ACCONAGE, oldTransportParAcconage, TRANSPORT_PAR_ACCONAGE_EDEFAULT, oldTransportParAcconageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportParAcconage() {
		return transportParAcconageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZonePourTourner() {
		return zonePourTourner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZonePourTourner(boolean newZonePourTourner) {
		boolean oldZonePourTourner = zonePourTourner;
		zonePourTourner = newZonePourTourner;
		boolean oldZonePourTournerESet = zonePourTournerESet;
		zonePourTournerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__ZONE_POUR_TOURNER, oldZonePourTourner, zonePourTourner, !oldZonePourTournerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZonePourTourner() {
		boolean oldZonePourTourner = zonePourTourner;
		boolean oldZonePourTournerESet = zonePourTournerESet;
		zonePourTourner = ZONE_POUR_TOURNER_EDEFAULT;
		zonePourTournerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__ZONE_POUR_TOURNER, oldZonePourTourner, ZONE_POUR_TOURNER_EDEFAULT, oldZonePourTournerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZonePourTourner() {
		return zonePourTournerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObligationMessageHeureArriveePrevue() {
		return obligationMessageHeureArriveePrevue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObligationMessageHeureArriveePrevue(boolean newObligationMessageHeureArriveePrevue) {
		boolean oldObligationMessageHeureArriveePrevue = obligationMessageHeureArriveePrevue;
		obligationMessageHeureArriveePrevue = newObligationMessageHeureArriveePrevue;
		boolean oldObligationMessageHeureArriveePrevueESet = obligationMessageHeureArriveePrevueESet;
		obligationMessageHeureArriveePrevueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE, oldObligationMessageHeureArriveePrevue, obligationMessageHeureArriveePrevue, !oldObligationMessageHeureArriveePrevueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObligationMessageHeureArriveePrevue() {
		boolean oldObligationMessageHeureArriveePrevue = obligationMessageHeureArriveePrevue;
		boolean oldObligationMessageHeureArriveePrevueESet = obligationMessageHeureArriveePrevueESet;
		obligationMessageHeureArriveePrevue = OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE_EDEFAULT;
		obligationMessageHeureArriveePrevueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE, oldObligationMessageHeureArriveePrevue, OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE_EDEFAULT, oldObligationMessageHeureArriveePrevueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObligationMessageHeureArriveePrevue() {
		return obligationMessageHeureArriveePrevueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDouaneOuServicesImmigration() {
		return douaneOuServicesImmigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouaneOuServicesImmigration(boolean newDouaneOuServicesImmigration) {
		boolean oldDouaneOuServicesImmigration = douaneOuServicesImmigration;
		douaneOuServicesImmigration = newDouaneOuServicesImmigration;
		boolean oldDouaneOuServicesImmigrationESet = douaneOuServicesImmigrationESet;
		douaneOuServicesImmigrationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__DOUANE_OU_SERVICES_IMMIGRATION, oldDouaneOuServicesImmigration, douaneOuServicesImmigration, !oldDouaneOuServicesImmigrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDouaneOuServicesImmigration() {
		boolean oldDouaneOuServicesImmigration = douaneOuServicesImmigration;
		boolean oldDouaneOuServicesImmigrationESet = douaneOuServicesImmigrationESet;
		douaneOuServicesImmigration = DOUANE_OU_SERVICES_IMMIGRATION_EDEFAULT;
		douaneOuServicesImmigrationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__DOUANE_OU_SERVICES_IMMIGRATION, oldDouaneOuServicesImmigration, DOUANE_OU_SERVICES_IMMIGRATION_EDEFAULT, oldDouaneOuServicesImmigrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDouaneOuServicesImmigration() {
		return douaneOuServicesImmigrationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEntreeRestreintePourCauseForteHoule() {
		return entreeRestreintePourCauseForteHoule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntreeRestreintePourCauseForteHoule(boolean newEntreeRestreintePourCauseForteHoule) {
		boolean oldEntreeRestreintePourCauseForteHoule = entreeRestreintePourCauseForteHoule;
		entreeRestreintePourCauseForteHoule = newEntreeRestreintePourCauseForteHoule;
		boolean oldEntreeRestreintePourCauseForteHouleESet = entreeRestreintePourCauseForteHouleESet;
		entreeRestreintePourCauseForteHouleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE, oldEntreeRestreintePourCauseForteHoule, entreeRestreintePourCauseForteHoule, !oldEntreeRestreintePourCauseForteHouleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEntreeRestreintePourCauseForteHoule() {
		boolean oldEntreeRestreintePourCauseForteHoule = entreeRestreintePourCauseForteHoule;
		boolean oldEntreeRestreintePourCauseForteHouleESet = entreeRestreintePourCauseForteHouleESet;
		entreeRestreintePourCauseForteHoule = ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE_EDEFAULT;
		entreeRestreintePourCauseForteHouleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE, oldEntreeRestreintePourCauseForteHoule, ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE_EDEFAULT, oldEntreeRestreintePourCauseForteHouleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEntreeRestreintePourCauseForteHoule() {
		return entreeRestreintePourCauseForteHouleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEntreeRestreintePourCauseGlace() {
		return entreeRestreintePourCauseGlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntreeRestreintePourCauseGlace(boolean newEntreeRestreintePourCauseGlace) {
		boolean oldEntreeRestreintePourCauseGlace = entreeRestreintePourCauseGlace;
		entreeRestreintePourCauseGlace = newEntreeRestreintePourCauseGlace;
		boolean oldEntreeRestreintePourCauseGlaceESet = entreeRestreintePourCauseGlaceESet;
		entreeRestreintePourCauseGlaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_GLACE, oldEntreeRestreintePourCauseGlace, entreeRestreintePourCauseGlace, !oldEntreeRestreintePourCauseGlaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEntreeRestreintePourCauseGlace() {
		boolean oldEntreeRestreintePourCauseGlace = entreeRestreintePourCauseGlace;
		boolean oldEntreeRestreintePourCauseGlaceESet = entreeRestreintePourCauseGlaceESet;
		entreeRestreintePourCauseGlace = ENTREE_RESTREINTE_POUR_CAUSE_GLACE_EDEFAULT;
		entreeRestreintePourCauseGlaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_GLACE, oldEntreeRestreintePourCauseGlace, ENTREE_RESTREINTE_POUR_CAUSE_GLACE_EDEFAULT, oldEntreeRestreintePourCauseGlaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEntreeRestreintePourCauseGlace() {
		return entreeRestreintePourCauseGlaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMesuresRestrictionEntree() {
		return mesuresRestrictionEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesuresRestrictionEntree(String newMesuresRestrictionEntree) {
		String oldMesuresRestrictionEntree = mesuresRestrictionEntree;
		mesuresRestrictionEntree = newMesuresRestrictionEntree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__MESURES_RESTRICTION_ENTREE, oldMesuresRestrictionEntree, mesuresRestrictionEntree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailsSaisonniers() {
		return detailsSaisonniers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailsSaisonniers(String newDetailsSaisonniers) {
		String oldDetailsSaisonniers = detailsSaisonniers;
		detailsSaisonniers = newDetailsSaisonniers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PORT__DETAILS_SAISONNIERS, oldDetailsSaisonniers, detailsSaisonniers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PORT__TIRANT_EAU_MAXIMUM:
				return basicSetTirantEauMaximum(null, msgs);
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return basicSetChargeExplosiveLimiteJour(null, msgs);
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return basicSetChargeExplosiveLimiteNuit(null, msgs);
			case SchemaPackage.TYPE_PORT__LARGEUR_COULOIR:
				return basicSetLargeurCouloir(null, msgs);
			case SchemaPackage.TYPE_PORT__LONGUEUR_MAXIMALE:
				return basicSetLongueurMaximale(null, msgs);
			case SchemaPackage.TYPE_PORT__LARGEUR_MAXIMALE:
				return basicSetLargeurMaximale(null, msgs);
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MAXIMALE_MAREE:
				return basicSetAmplitudeMaximaleMaree(null, msgs);
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MINIMALE_MAREE:
				return basicSetAmplitudeMinimaleMaree(null, msgs);
			case SchemaPackage.TYPE_PORT__VITESSE_MOYENNE_MAREE:
				return basicSetVitesseMoyenneMaree(null, msgs);
			case SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_ENREGISTREE:
				return basicSetVitesseMaximaleEnregistree(null, msgs);
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
			case SchemaPackage.TYPE_PORT__TIRANT_EAU_MAXIMUM:
				return getTirantEauMaximum();
			case SchemaPackage.TYPE_PORT__TONNAGE_MAXIMUM_AUTORISE:
				return new Long(getTonnageMaximumAutorise());
			case SchemaPackage.TYPE_PORT__PILOTE_NECESSAIRE:
				return isPiloteNecessaire() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__PROXIMITE_AEROPORT:
				return isProximiteAeroport() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return getChargeExplosiveLimiteJour();
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return getChargeExplosiveLimiteNuit();
			case SchemaPackage.TYPE_PORT__LIMITATION_EN_HAUTEUR:
				return isLimitationEnHauteur() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__QUALITE_ABRI:
				return getQualiteAbri();
			case SchemaPackage.TYPE_PORT__DURABILITE:
				return getDurabilite();
			case SchemaPackage.TYPE_PORT__DISPONIBILITE_PILOTE:
				return isDisponibilitePilote() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__DISPONIBILITE_REMORQUEUR:
				return isDisponibiliteRemorqueur() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__ENCADREMENT_CONVOI:
				return isEncadrementConvoi() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__LARGEUR_COULOIR:
				return getLargeurCouloir();
			case SchemaPackage.TYPE_PORT__LONGUEUR_MAXIMALE:
				return getLongueurMaximale();
			case SchemaPackage.TYPE_PORT__LARGEUR_MAXIMALE:
				return getLargeurMaximale();
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MAXIMALE_MAREE:
				return getAmplitudeMaximaleMaree();
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MINIMALE_MAREE:
				return getAmplitudeMinimaleMaree();
			case SchemaPackage.TYPE_PORT__VITESSE_MOYENNE_MAREE:
				return getVitesseMoyenneMaree();
			case SchemaPackage.TYPE_PORT__DETAILS_RELATIFS_AUX_MAREES:
				return getDetailsRelatifsAuxMarees();
			case SchemaPackage.TYPE_PORT__DIRECTION_PREDOMINANTE_VENT:
				return getDirectionPredominanteVent();
			case SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_VENT_DOMINANT:
				return getVitesseMaximaleVentDominant();
			case SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_ENREGISTREE:
				return getVitesseMaximaleEnregistree();
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_DISPONIBLES:
				return getInstallationsDisponibles();
			case SchemaPackage.TYPE_PORT__POSSIBILITE_FAIRE_PLEIN:
				return isPossibiliteFairePlein() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__TYPE_PLEIN:
				return getTypePlein();
			case SchemaPackage.TYPE_PORT__DETAILS_LIES_AU_PLEIN:
				return getDetailsLiesAuPlein();
			case SchemaPackage.TYPE_PORT__EAU_DISPONIBLE:
				return isEauDisponible() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__EXISTENCE_CAPACITE_ANTI_INCENDIE:
				return isExistenceCapaciteAntiIncendie() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__TYPE_CAPACITE_ANTI_INCENDIE:
				return getTypeCapaciteAntiIncendie();
			case SchemaPackage.TYPE_PORT__FACILITES_TRANSIT:
				return isFacilitesTransit() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__CAPACITE_AGERER_PASSAGERS:
				return isCapaciteAGererPassagers() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_TRAITEMENT_PETROLIERS:
				return isInstallationsTraitementPetroliers() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__SECURISATION_BIOLOGIQUE:
				return isSecurisationBiologique() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__CAPACITE_RECEPTION_LEST_SOUILLE:
				return isCapaciteReceptionLestSouille() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_DEMAGNETISATION:
				return isInstallationsDemagnetisation() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__POSSIBILITE_USAGE_ACCON:
				return isPossibiliteUsageAccon() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__TRANSPORT_PAR_ACCONAGE:
				return isTransportParAcconage() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__ZONE_POUR_TOURNER:
				return isZonePourTourner() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE:
				return isObligationMessageHeureArriveePrevue() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__DOUANE_OU_SERVICES_IMMIGRATION:
				return isDouaneOuServicesImmigration() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE:
				return isEntreeRestreintePourCauseForteHoule() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_GLACE:
				return isEntreeRestreintePourCauseGlace() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PORT__MESURES_RESTRICTION_ENTREE:
				return getMesuresRestrictionEntree();
			case SchemaPackage.TYPE_PORT__DETAILS_SAISONNIERS:
				return getDetailsSaisonniers();
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
			case SchemaPackage.TYPE_PORT__TIRANT_EAU_MAXIMUM:
				setTirantEauMaximum((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PORT__TONNAGE_MAXIMUM_AUTORISE:
				setTonnageMaximumAutorise(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PORT__PILOTE_NECESSAIRE:
				setPiloteNecessaire(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__PROXIMITE_AEROPORT:
				setProximiteAeroport(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				setChargeExplosiveLimiteNuit((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_PORT__LIMITATION_EN_HAUTEUR:
				setLimitationEnHauteur(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__QUALITE_ABRI:
				setQualiteAbri((TypeDictionaryDicoPortQualiteAbri)newValue);
				return;
			case SchemaPackage.TYPE_PORT__DURABILITE:
				setDurabilite((TypeDictionaryDicoPortDurabilite)newValue);
				return;
			case SchemaPackage.TYPE_PORT__DISPONIBILITE_PILOTE:
				setDisponibilitePilote(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__DISPONIBILITE_REMORQUEUR:
				setDisponibiliteRemorqueur(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__ENCADREMENT_CONVOI:
				setEncadrementConvoi(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__LARGEUR_COULOIR:
				setLargeurCouloir((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PORT__LONGUEUR_MAXIMALE:
				setLongueurMaximale((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PORT__LARGEUR_MAXIMALE:
				setLargeurMaximale((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MAXIMALE_MAREE:
				setAmplitudeMaximaleMaree((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MINIMALE_MAREE:
				setAmplitudeMinimaleMaree((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PORT__VITESSE_MOYENNE_MAREE:
				setVitesseMoyenneMaree((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_PORT__DETAILS_RELATIFS_AUX_MAREES:
				setDetailsRelatifsAuxMarees((String)newValue);
				return;
			case SchemaPackage.TYPE_PORT__DIRECTION_PREDOMINANTE_VENT:
				setDirectionPredominanteVent((TypeDictionaryDicoDirection)newValue);
				return;
			case SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_VENT_DOMINANT:
				setVitesseMaximaleVentDominant((TypeDictionaryDicoPrecisionVitesse)newValue);
				return;
			case SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_ENREGISTREE:
				setVitesseMaximaleEnregistree((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_DISPONIBLES:
				setInstallationsDisponibles((TypeDictionaryDicoPortInstallationsDisponibles)newValue);
				return;
			case SchemaPackage.TYPE_PORT__POSSIBILITE_FAIRE_PLEIN:
				setPossibiliteFairePlein(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__TYPE_PLEIN:
				setTypePlein((TypeDictionaryDicoPortTypePlein)newValue);
				return;
			case SchemaPackage.TYPE_PORT__DETAILS_LIES_AU_PLEIN:
				setDetailsLiesAuPlein((String)newValue);
				return;
			case SchemaPackage.TYPE_PORT__EAU_DISPONIBLE:
				setEauDisponible(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__EXISTENCE_CAPACITE_ANTI_INCENDIE:
				setExistenceCapaciteAntiIncendie(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__TYPE_CAPACITE_ANTI_INCENDIE:
				setTypeCapaciteAntiIncendie((TypeDictionaryDicoPortTypeCapaciteAntiIncendie)newValue);
				return;
			case SchemaPackage.TYPE_PORT__FACILITES_TRANSIT:
				setFacilitesTransit(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__CAPACITE_AGERER_PASSAGERS:
				setCapaciteAGererPassagers(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_TRAITEMENT_PETROLIERS:
				setInstallationsTraitementPetroliers(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__SECURISATION_BIOLOGIQUE:
				setSecurisationBiologique(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__CAPACITE_RECEPTION_LEST_SOUILLE:
				setCapaciteReceptionLestSouille(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_DEMAGNETISATION:
				setInstallationsDemagnetisation(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__POSSIBILITE_USAGE_ACCON:
				setPossibiliteUsageAccon(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__TRANSPORT_PAR_ACCONAGE:
				setTransportParAcconage(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__ZONE_POUR_TOURNER:
				setZonePourTourner(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE:
				setObligationMessageHeureArriveePrevue(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__DOUANE_OU_SERVICES_IMMIGRATION:
				setDouaneOuServicesImmigration(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE:
				setEntreeRestreintePourCauseForteHoule(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_GLACE:
				setEntreeRestreintePourCauseGlace(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PORT__MESURES_RESTRICTION_ENTREE:
				setMesuresRestrictionEntree((String)newValue);
				return;
			case SchemaPackage.TYPE_PORT__DETAILS_SAISONNIERS:
				setDetailsSaisonniers((String)newValue);
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
			case SchemaPackage.TYPE_PORT__TIRANT_EAU_MAXIMUM:
				setTirantEauMaximum((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PORT__TONNAGE_MAXIMUM_AUTORISE:
				unsetTonnageMaximumAutorise();
				return;
			case SchemaPackage.TYPE_PORT__PILOTE_NECESSAIRE:
				unsetPiloteNecessaire();
				return;
			case SchemaPackage.TYPE_PORT__PROXIMITE_AEROPORT:
				unsetProximiteAeroport();
				return;
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				setChargeExplosiveLimiteNuit((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_PORT__LIMITATION_EN_HAUTEUR:
				unsetLimitationEnHauteur();
				return;
			case SchemaPackage.TYPE_PORT__QUALITE_ABRI:
				unsetQualiteAbri();
				return;
			case SchemaPackage.TYPE_PORT__DURABILITE:
				unsetDurabilite();
				return;
			case SchemaPackage.TYPE_PORT__DISPONIBILITE_PILOTE:
				unsetDisponibilitePilote();
				return;
			case SchemaPackage.TYPE_PORT__DISPONIBILITE_REMORQUEUR:
				unsetDisponibiliteRemorqueur();
				return;
			case SchemaPackage.TYPE_PORT__ENCADREMENT_CONVOI:
				unsetEncadrementConvoi();
				return;
			case SchemaPackage.TYPE_PORT__LARGEUR_COULOIR:
				setLargeurCouloir((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PORT__LONGUEUR_MAXIMALE:
				setLongueurMaximale((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PORT__LARGEUR_MAXIMALE:
				setLargeurMaximale((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MAXIMALE_MAREE:
				setAmplitudeMaximaleMaree((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MINIMALE_MAREE:
				setAmplitudeMinimaleMaree((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PORT__VITESSE_MOYENNE_MAREE:
				setVitesseMoyenneMaree((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_PORT__DETAILS_RELATIFS_AUX_MAREES:
				setDetailsRelatifsAuxMarees(DETAILS_RELATIFS_AUX_MAREES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PORT__DIRECTION_PREDOMINANTE_VENT:
				unsetDirectionPredominanteVent();
				return;
			case SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_VENT_DOMINANT:
				unsetVitesseMaximaleVentDominant();
				return;
			case SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_ENREGISTREE:
				setVitesseMaximaleEnregistree((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_DISPONIBLES:
				unsetInstallationsDisponibles();
				return;
			case SchemaPackage.TYPE_PORT__POSSIBILITE_FAIRE_PLEIN:
				unsetPossibiliteFairePlein();
				return;
			case SchemaPackage.TYPE_PORT__TYPE_PLEIN:
				unsetTypePlein();
				return;
			case SchemaPackage.TYPE_PORT__DETAILS_LIES_AU_PLEIN:
				setDetailsLiesAuPlein(DETAILS_LIES_AU_PLEIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PORT__EAU_DISPONIBLE:
				unsetEauDisponible();
				return;
			case SchemaPackage.TYPE_PORT__EXISTENCE_CAPACITE_ANTI_INCENDIE:
				unsetExistenceCapaciteAntiIncendie();
				return;
			case SchemaPackage.TYPE_PORT__TYPE_CAPACITE_ANTI_INCENDIE:
				unsetTypeCapaciteAntiIncendie();
				return;
			case SchemaPackage.TYPE_PORT__FACILITES_TRANSIT:
				unsetFacilitesTransit();
				return;
			case SchemaPackage.TYPE_PORT__CAPACITE_AGERER_PASSAGERS:
				unsetCapaciteAGererPassagers();
				return;
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_TRAITEMENT_PETROLIERS:
				unsetInstallationsTraitementPetroliers();
				return;
			case SchemaPackage.TYPE_PORT__SECURISATION_BIOLOGIQUE:
				unsetSecurisationBiologique();
				return;
			case SchemaPackage.TYPE_PORT__CAPACITE_RECEPTION_LEST_SOUILLE:
				unsetCapaciteReceptionLestSouille();
				return;
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_DEMAGNETISATION:
				unsetInstallationsDemagnetisation();
				return;
			case SchemaPackage.TYPE_PORT__POSSIBILITE_USAGE_ACCON:
				unsetPossibiliteUsageAccon();
				return;
			case SchemaPackage.TYPE_PORT__TRANSPORT_PAR_ACCONAGE:
				unsetTransportParAcconage();
				return;
			case SchemaPackage.TYPE_PORT__ZONE_POUR_TOURNER:
				unsetZonePourTourner();
				return;
			case SchemaPackage.TYPE_PORT__OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE:
				unsetObligationMessageHeureArriveePrevue();
				return;
			case SchemaPackage.TYPE_PORT__DOUANE_OU_SERVICES_IMMIGRATION:
				unsetDouaneOuServicesImmigration();
				return;
			case SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE:
				unsetEntreeRestreintePourCauseForteHoule();
				return;
			case SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_GLACE:
				unsetEntreeRestreintePourCauseGlace();
				return;
			case SchemaPackage.TYPE_PORT__MESURES_RESTRICTION_ENTREE:
				setMesuresRestrictionEntree(MESURES_RESTRICTION_ENTREE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PORT__DETAILS_SAISONNIERS:
				setDetailsSaisonniers(DETAILS_SAISONNIERS_EDEFAULT);
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
			case SchemaPackage.TYPE_PORT__TIRANT_EAU_MAXIMUM:
				return tirantEauMaximum != null;
			case SchemaPackage.TYPE_PORT__TONNAGE_MAXIMUM_AUTORISE:
				return isSetTonnageMaximumAutorise();
			case SchemaPackage.TYPE_PORT__PILOTE_NECESSAIRE:
				return isSetPiloteNecessaire();
			case SchemaPackage.TYPE_PORT__PROXIMITE_AEROPORT:
				return isSetProximiteAeroport();
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return chargeExplosiveLimiteJour != null;
			case SchemaPackage.TYPE_PORT__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return chargeExplosiveLimiteNuit != null;
			case SchemaPackage.TYPE_PORT__LIMITATION_EN_HAUTEUR:
				return isSetLimitationEnHauteur();
			case SchemaPackage.TYPE_PORT__QUALITE_ABRI:
				return isSetQualiteAbri();
			case SchemaPackage.TYPE_PORT__DURABILITE:
				return isSetDurabilite();
			case SchemaPackage.TYPE_PORT__DISPONIBILITE_PILOTE:
				return isSetDisponibilitePilote();
			case SchemaPackage.TYPE_PORT__DISPONIBILITE_REMORQUEUR:
				return isSetDisponibiliteRemorqueur();
			case SchemaPackage.TYPE_PORT__ENCADREMENT_CONVOI:
				return isSetEncadrementConvoi();
			case SchemaPackage.TYPE_PORT__LARGEUR_COULOIR:
				return largeurCouloir != null;
			case SchemaPackage.TYPE_PORT__LONGUEUR_MAXIMALE:
				return longueurMaximale != null;
			case SchemaPackage.TYPE_PORT__LARGEUR_MAXIMALE:
				return largeurMaximale != null;
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MAXIMALE_MAREE:
				return amplitudeMaximaleMaree != null;
			case SchemaPackage.TYPE_PORT__AMPLITUDE_MINIMALE_MAREE:
				return amplitudeMinimaleMaree != null;
			case SchemaPackage.TYPE_PORT__VITESSE_MOYENNE_MAREE:
				return vitesseMoyenneMaree != null;
			case SchemaPackage.TYPE_PORT__DETAILS_RELATIFS_AUX_MAREES:
				return DETAILS_RELATIFS_AUX_MAREES_EDEFAULT == null ? detailsRelatifsAuxMarees != null : !DETAILS_RELATIFS_AUX_MAREES_EDEFAULT.equals(detailsRelatifsAuxMarees);
			case SchemaPackage.TYPE_PORT__DIRECTION_PREDOMINANTE_VENT:
				return isSetDirectionPredominanteVent();
			case SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_VENT_DOMINANT:
				return isSetVitesseMaximaleVentDominant();
			case SchemaPackage.TYPE_PORT__VITESSE_MAXIMALE_ENREGISTREE:
				return vitesseMaximaleEnregistree != null;
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_DISPONIBLES:
				return isSetInstallationsDisponibles();
			case SchemaPackage.TYPE_PORT__POSSIBILITE_FAIRE_PLEIN:
				return isSetPossibiliteFairePlein();
			case SchemaPackage.TYPE_PORT__TYPE_PLEIN:
				return isSetTypePlein();
			case SchemaPackage.TYPE_PORT__DETAILS_LIES_AU_PLEIN:
				return DETAILS_LIES_AU_PLEIN_EDEFAULT == null ? detailsLiesAuPlein != null : !DETAILS_LIES_AU_PLEIN_EDEFAULT.equals(detailsLiesAuPlein);
			case SchemaPackage.TYPE_PORT__EAU_DISPONIBLE:
				return isSetEauDisponible();
			case SchemaPackage.TYPE_PORT__EXISTENCE_CAPACITE_ANTI_INCENDIE:
				return isSetExistenceCapaciteAntiIncendie();
			case SchemaPackage.TYPE_PORT__TYPE_CAPACITE_ANTI_INCENDIE:
				return isSetTypeCapaciteAntiIncendie();
			case SchemaPackage.TYPE_PORT__FACILITES_TRANSIT:
				return isSetFacilitesTransit();
			case SchemaPackage.TYPE_PORT__CAPACITE_AGERER_PASSAGERS:
				return isSetCapaciteAGererPassagers();
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_TRAITEMENT_PETROLIERS:
				return isSetInstallationsTraitementPetroliers();
			case SchemaPackage.TYPE_PORT__SECURISATION_BIOLOGIQUE:
				return isSetSecurisationBiologique();
			case SchemaPackage.TYPE_PORT__CAPACITE_RECEPTION_LEST_SOUILLE:
				return isSetCapaciteReceptionLestSouille();
			case SchemaPackage.TYPE_PORT__INSTALLATIONS_DEMAGNETISATION:
				return isSetInstallationsDemagnetisation();
			case SchemaPackage.TYPE_PORT__POSSIBILITE_USAGE_ACCON:
				return isSetPossibiliteUsageAccon();
			case SchemaPackage.TYPE_PORT__TRANSPORT_PAR_ACCONAGE:
				return isSetTransportParAcconage();
			case SchemaPackage.TYPE_PORT__ZONE_POUR_TOURNER:
				return isSetZonePourTourner();
			case SchemaPackage.TYPE_PORT__OBLIGATION_MESSAGE_HEURE_ARRIVEE_PREVUE:
				return isSetObligationMessageHeureArriveePrevue();
			case SchemaPackage.TYPE_PORT__DOUANE_OU_SERVICES_IMMIGRATION:
				return isSetDouaneOuServicesImmigration();
			case SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_FORTE_HOULE:
				return isSetEntreeRestreintePourCauseForteHoule();
			case SchemaPackage.TYPE_PORT__ENTREE_RESTREINTE_POUR_CAUSE_GLACE:
				return isSetEntreeRestreintePourCauseGlace();
			case SchemaPackage.TYPE_PORT__MESURES_RESTRICTION_ENTREE:
				return MESURES_RESTRICTION_ENTREE_EDEFAULT == null ? mesuresRestrictionEntree != null : !MESURES_RESTRICTION_ENTREE_EDEFAULT.equals(mesuresRestrictionEntree);
			case SchemaPackage.TYPE_PORT__DETAILS_SAISONNIERS:
				return DETAILS_SAISONNIERS_EDEFAULT == null ? detailsSaisonniers != null : !DETAILS_SAISONNIERS_EDEFAULT.equals(detailsSaisonniers);
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
		result.append(" (tonnageMaximumAutorise: ");
		if (tonnageMaximumAutoriseESet) result.append(tonnageMaximumAutorise); else result.append("<unset>");
		result.append(", piloteNecessaire: ");
		if (piloteNecessaireESet) result.append(piloteNecessaire); else result.append("<unset>");
		result.append(", proximiteAeroport: ");
		if (proximiteAeroportESet) result.append(proximiteAeroport); else result.append("<unset>");
		result.append(", limitationEnHauteur: ");
		if (limitationEnHauteurESet) result.append(limitationEnHauteur); else result.append("<unset>");
		result.append(", qualiteAbri: ");
		if (qualiteAbriESet) result.append(qualiteAbri); else result.append("<unset>");
		result.append(", durabilite: ");
		if (durabiliteESet) result.append(durabilite); else result.append("<unset>");
		result.append(", disponibilitePilote: ");
		if (disponibilitePiloteESet) result.append(disponibilitePilote); else result.append("<unset>");
		result.append(", disponibiliteRemorqueur: ");
		if (disponibiliteRemorqueurESet) result.append(disponibiliteRemorqueur); else result.append("<unset>");
		result.append(", encadrementConvoi: ");
		if (encadrementConvoiESet) result.append(encadrementConvoi); else result.append("<unset>");
		result.append(", detailsRelatifsAuxMarees: ");
		result.append(detailsRelatifsAuxMarees);
		result.append(", directionPredominanteVent: ");
		if (directionPredominanteVentESet) result.append(directionPredominanteVent); else result.append("<unset>");
		result.append(", vitesseMaximaleVentDominant: ");
		if (vitesseMaximaleVentDominantESet) result.append(vitesseMaximaleVentDominant); else result.append("<unset>");
		result.append(", installationsDisponibles: ");
		if (installationsDisponiblesESet) result.append(installationsDisponibles); else result.append("<unset>");
		result.append(", possibiliteFairePlein: ");
		if (possibiliteFairePleinESet) result.append(possibiliteFairePlein); else result.append("<unset>");
		result.append(", typePlein: ");
		if (typePleinESet) result.append(typePlein); else result.append("<unset>");
		result.append(", detailsLiesAuPlein: ");
		result.append(detailsLiesAuPlein);
		result.append(", eauDisponible: ");
		if (eauDisponibleESet) result.append(eauDisponible); else result.append("<unset>");
		result.append(", existenceCapaciteAntiIncendie: ");
		if (existenceCapaciteAntiIncendieESet) result.append(existenceCapaciteAntiIncendie); else result.append("<unset>");
		result.append(", typeCapaciteAntiIncendie: ");
		if (typeCapaciteAntiIncendieESet) result.append(typeCapaciteAntiIncendie); else result.append("<unset>");
		result.append(", facilitesTransit: ");
		if (facilitesTransitESet) result.append(facilitesTransit); else result.append("<unset>");
		result.append(", capaciteAGererPassagers: ");
		if (capaciteAGererPassagersESet) result.append(capaciteAGererPassagers); else result.append("<unset>");
		result.append(", installationsTraitementPetroliers: ");
		if (installationsTraitementPetroliersESet) result.append(installationsTraitementPetroliers); else result.append("<unset>");
		result.append(", securisationBiologique: ");
		if (securisationBiologiqueESet) result.append(securisationBiologique); else result.append("<unset>");
		result.append(", capaciteReceptionLestSouille: ");
		if (capaciteReceptionLestSouilleESet) result.append(capaciteReceptionLestSouille); else result.append("<unset>");
		result.append(", installationsDemagnetisation: ");
		if (installationsDemagnetisationESet) result.append(installationsDemagnetisation); else result.append("<unset>");
		result.append(", possibiliteUsageAccon: ");
		if (possibiliteUsageAcconESet) result.append(possibiliteUsageAccon); else result.append("<unset>");
		result.append(", transportParAcconage: ");
		if (transportParAcconageESet) result.append(transportParAcconage); else result.append("<unset>");
		result.append(", zonePourTourner: ");
		if (zonePourTournerESet) result.append(zonePourTourner); else result.append("<unset>");
		result.append(", obligationMessageHeureArriveePrevue: ");
		if (obligationMessageHeureArriveePrevueESet) result.append(obligationMessageHeureArriveePrevue); else result.append("<unset>");
		result.append(", douaneOuServicesImmigration: ");
		if (douaneOuServicesImmigrationESet) result.append(douaneOuServicesImmigration); else result.append("<unset>");
		result.append(", entreeRestreintePourCauseForteHoule: ");
		if (entreeRestreintePourCauseForteHouleESet) result.append(entreeRestreintePourCauseForteHoule); else result.append("<unset>");
		result.append(", entreeRestreintePourCauseGlace: ");
		if (entreeRestreintePourCauseGlaceESet) result.append(entreeRestreintePourCauseGlace); else result.append("<unset>");
		result.append(", mesuresRestrictionEntree: ");
		result.append(mesuresRestrictionEntree);
		result.append(", detailsSaisonniers: ");
		result.append(detailsSaisonniers);
		result.append(')');
		return result.toString();
	}

} //TypePortImpl
