/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConfiguration;
import mpia.schema.TypeDictionaryDicoTypeAeronefCategorie;
import mpia.schema.TypeDictionaryDicoTypeAeronefCharge;
import mpia.schema.TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage;
import mpia.schema.TypeDictionaryDicoTypeAeronefDesignationPilotage;
import mpia.schema.TypeDictionaryDicoTypeAeronefEntrainement;
import mpia.schema.TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol;
import mpia.schema.TypeDictionaryDicoTypeAeronefMissionPrincipale;
import mpia.schema.TypeDictionaryDicoTypeAeronefModele;
import mpia.schema.TypeDictionaryDicoTypeAeronefQualificatifMeteo;
import mpia.schema.TypeDictionaryDicoTypeAeronefRayonAction;
import mpia.schema.TypeDictionaryDicoTypeAeronefRole;
import mpia.schema.TypeDictionaryDicoTypeAeronefTypeAeronef;
import mpia.schema.TypeDictionaryDicoTypeAeronefUsage;
import mpia.schema.TypeEquipementHelicoptere;
import mpia.schema.TypeTypeAeronef;

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
 * An implementation of the model object '<em><b>Type Type Aeronef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getTypeAeronef <em>Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getTypeAeronefNonRepertorie <em>Type Aeronef Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getModele <em>Modele</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getRole <em>Role</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getMissionPrincipale <em>Mission Principale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getEntrainement <em>Entrainement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getQualificatifMeteo <em>Qualificatif Meteo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getDesignationPilotage <em>Designation Pilotage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getDecollageEtAtterrissage <em>Decollage Et Atterrissage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getMaterielRavitaillementEnVol <em>Materiel Ravitaillement En Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getCharge <em>Charge</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getRayonAction <em>Rayon Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getEnvergure <em>Envergure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getPlafondMax <em>Plafond Max</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getPlafondPoser <em>Plafond Poser</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getVitesseMaxTransit <em>Vitesse Max Transit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getVitessePuissanceMinimum <em>Vitesse Puissance Minimum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getConsommationHoraireStationFixe <em>Consommation Horaire Station Fixe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getConsommationHoraireTransit <em>Consommation Horaire Transit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getAPourConfigurationConfiguration <em>APour Configuration Configuration</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAeronefImpl#getAPourEquipementEquipementHelicoptere <em>APour Equipement Equipement Helicoptere</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeAeronefImpl extends TypeTypeEquipementImpl implements TypeTypeAeronef {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeAeronefCategorie.FIXWNG;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getTypeAeronef() <em>Type Aeronef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefTypeAeronef TYPE_AERONEF_EDEFAULT = TypeDictionaryDicoTypeAeronefTypeAeronef.AUTOGY;

	/**
	 * The cached value of the '{@link #getTypeAeronef() <em>Type Aeronef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefTypeAeronef typeAeronef = TYPE_AERONEF_EDEFAULT;

	/**
	 * This is true if the Type Aeronef attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeAeronefESet;

	/**
	 * The default value of the '{@link #getTypeAeronefNonRepertorie() <em>Type Aeronef Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAeronefNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_AERONEF_NON_REPERTORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAeronefNonRepertorie() <em>Type Aeronef Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAeronefNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected String typeAeronefNonRepertorie = TYPE_AERONEF_NON_REPERTORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModele() <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModele()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefModele MODELE_EDEFAULT = TypeDictionaryDicoTypeAeronefModele._1049;

	/**
	 * The cached value of the '{@link #getModele() <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModele()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefModele modele = MODELE_EDEFAULT;

	/**
	 * This is true if the Modele attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeleESet;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefUsage USAGE_EDEFAULT = TypeDictionaryDicoTypeAeronefUsage.CIVIL;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefUsage usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefRole ROLE_EDEFAULT = TypeDictionaryDicoTypeAeronefRole.DEF;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefRole role = ROLE_EDEFAULT;

	/**
	 * This is true if the Role attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roleESet;

	/**
	 * The default value of the '{@link #getMissionPrincipale() <em>Mission Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionPrincipale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefMissionPrincipale MISSION_PRINCIPALE_EDEFAULT = TypeDictionaryDicoTypeAeronefMissionPrincipale.ACP;

	/**
	 * The cached value of the '{@link #getMissionPrincipale() <em>Mission Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionPrincipale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefMissionPrincipale missionPrincipale = MISSION_PRINCIPALE_EDEFAULT;

	/**
	 * This is true if the Mission Principale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean missionPrincipaleESet;

	/**
	 * The default value of the '{@link #getEntrainement() <em>Entrainement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrainement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefEntrainement ENTRAINEMENT_EDEFAULT = TypeDictionaryDicoTypeAeronefEntrainement.NO;

	/**
	 * The cached value of the '{@link #getEntrainement() <em>Entrainement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrainement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefEntrainement entrainement = ENTRAINEMENT_EDEFAULT;

	/**
	 * This is true if the Entrainement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entrainementESet;

	/**
	 * The default value of the '{@link #getQualificatifMeteo() <em>Qualificatif Meteo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifMeteo()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefQualificatifMeteo QUALIFICATIF_METEO_EDEFAULT = TypeDictionaryDicoTypeAeronefQualificatifMeteo.ALL;

	/**
	 * The cached value of the '{@link #getQualificatifMeteo() <em>Qualificatif Meteo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifMeteo()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefQualificatifMeteo qualificatifMeteo = QUALIFICATIF_METEO_EDEFAULT;

	/**
	 * This is true if the Qualificatif Meteo attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifMeteoESet;

	/**
	 * The default value of the '{@link #getDesignationPilotage() <em>Designation Pilotage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignationPilotage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefDesignationPilotage DESIGNATION_PILOTAGE_EDEFAULT = TypeDictionaryDicoTypeAeronefDesignationPilotage.MANNED;

	/**
	 * The cached value of the '{@link #getDesignationPilotage() <em>Designation Pilotage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignationPilotage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefDesignationPilotage designationPilotage = DESIGNATION_PILOTAGE_EDEFAULT;

	/**
	 * This is true if the Designation Pilotage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean designationPilotageESet;

	/**
	 * The default value of the '{@link #getDecollageEtAtterrissage() <em>Decollage Et Atterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecollageEtAtterrissage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage DECOLLAGE_ET_ATTERRISSAGE_EDEFAULT = TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage.STOL;

	/**
	 * The cached value of the '{@link #getDecollageEtAtterrissage() <em>Decollage Et Atterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecollageEtAtterrissage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage decollageEtAtterrissage = DECOLLAGE_ET_ATTERRISSAGE_EDEFAULT;

	/**
	 * This is true if the Decollage Et Atterrissage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean decollageEtAtterrissageESet;

	/**
	 * The default value of the '{@link #getMaterielRavitaillementEnVol() <em>Materiel Ravitaillement En Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterielRavitaillementEnVol()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol MATERIEL_RAVITAILLEMENT_EN_VOL_EDEFAULT = TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol.BOOM;

	/**
	 * The cached value of the '{@link #getMaterielRavitaillementEnVol() <em>Materiel Ravitaillement En Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterielRavitaillementEnVol()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol materielRavitaillementEnVol = MATERIEL_RAVITAILLEMENT_EN_VOL_EDEFAULT;

	/**
	 * This is true if the Materiel Ravitaillement En Vol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean materielRavitaillementEnVolESet;

	/**
	 * The default value of the '{@link #getCharge() <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefCharge CHARGE_EDEFAULT = TypeDictionaryDicoTypeAeronefCharge.HEAVY;

	/**
	 * The cached value of the '{@link #getCharge() <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefCharge charge = CHARGE_EDEFAULT;

	/**
	 * This is true if the Charge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargeESet;

	/**
	 * The default value of the '{@link #getRayonAction() <em>Rayon Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonAction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAeronefRayonAction RAYON_ACTION_EDEFAULT = TypeDictionaryDicoTypeAeronefRayonAction.LONG;

	/**
	 * The cached value of the '{@link #getRayonAction() <em>Rayon Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonAction()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAeronefRayonAction rayonAction = RAYON_ACTION_EDEFAULT;

	/**
	 * This is true if the Rayon Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rayonActionESet;

	/**
	 * The cached value of the '{@link #getEnvergure() <em>Envergure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvergure()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur envergure;

	/**
	 * The default value of the '{@link #getPlafondMax() <em>Plafond Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlafondMax()
	 * @generated
	 * @ordered
	 */
	protected static final long PLAFOND_MAX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPlafondMax() <em>Plafond Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlafondMax()
	 * @generated
	 * @ordered
	 */
	protected long plafondMax = PLAFOND_MAX_EDEFAULT;

	/**
	 * This is true if the Plafond Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plafondMaxESet;

	/**
	 * The default value of the '{@link #getPlafondPoser() <em>Plafond Poser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlafondPoser()
	 * @generated
	 * @ordered
	 */
	protected static final long PLAFOND_POSER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPlafondPoser() <em>Plafond Poser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlafondPoser()
	 * @generated
	 * @ordered
	 */
	protected long plafondPoser = PLAFOND_POSER_EDEFAULT;

	/**
	 * This is true if the Plafond Poser attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plafondPoserESet;

	/**
	 * The cached value of the '{@link #getVitesseMaxTransit() <em>Vitesse Max Transit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMaxTransit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseMaxTransit;

	/**
	 * The cached value of the '{@link #getVitessePuissanceMinimum() <em>Vitesse Puissance Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitessePuissanceMinimum()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitessePuissanceMinimum;

	/**
	 * The default value of the '{@link #getConsommationHoraireStationFixe() <em>Consommation Horaire Station Fixe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommationHoraireStationFixe()
	 * @generated
	 * @ordered
	 */
	protected static final long CONSOMMATION_HORAIRE_STATION_FIXE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConsommationHoraireStationFixe() <em>Consommation Horaire Station Fixe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommationHoraireStationFixe()
	 * @generated
	 * @ordered
	 */
	protected long consommationHoraireStationFixe = CONSOMMATION_HORAIRE_STATION_FIXE_EDEFAULT;

	/**
	 * This is true if the Consommation Horaire Station Fixe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consommationHoraireStationFixeESet;

	/**
	 * The default value of the '{@link #getConsommationHoraireTransit() <em>Consommation Horaire Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommationHoraireTransit()
	 * @generated
	 * @ordered
	 */
	protected static final long CONSOMMATION_HORAIRE_TRANSIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConsommationHoraireTransit() <em>Consommation Horaire Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommationHoraireTransit()
	 * @generated
	 * @ordered
	 */
	protected long consommationHoraireTransit = CONSOMMATION_HORAIRE_TRANSIT_EDEFAULT;

	/**
	 * This is true if the Consommation Horaire Transit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consommationHoraireTransitESet;

	/**
	 * The cached value of the '{@link #getAPourConfigurationConfiguration() <em>APour Configuration Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConfigurationConfiguration()
	 * @generated
	 * @ordered
	 */
	protected TypeConfiguration aPourConfigurationConfiguration;

	/**
	 * The cached value of the '{@link #getAPourEquipementEquipementHelicoptere() <em>APour Equipement Equipement Helicoptere</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEquipementEquipementHelicoptere()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEquipementHelicoptere> aPourEquipementEquipementHelicoptere;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeAeronefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeAeronef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeAeronefCategorie newCategorie) {
		TypeDictionaryDicoTypeAeronefCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeAeronefCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoTypeAeronefTypeAeronef getTypeAeronef() {
		return typeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAeronef(TypeDictionaryDicoTypeAeronefTypeAeronef newTypeAeronef) {
		TypeDictionaryDicoTypeAeronefTypeAeronef oldTypeAeronef = typeAeronef;
		typeAeronef = newTypeAeronef == null ? TYPE_AERONEF_EDEFAULT : newTypeAeronef;
		boolean oldTypeAeronefESet = typeAeronefESet;
		typeAeronefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF, oldTypeAeronef, typeAeronef, !oldTypeAeronefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeAeronef() {
		TypeDictionaryDicoTypeAeronefTypeAeronef oldTypeAeronef = typeAeronef;
		boolean oldTypeAeronefESet = typeAeronefESet;
		typeAeronef = TYPE_AERONEF_EDEFAULT;
		typeAeronefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF, oldTypeAeronef, TYPE_AERONEF_EDEFAULT, oldTypeAeronefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeAeronef() {
		return typeAeronefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeAeronefNonRepertorie() {
		return typeAeronefNonRepertorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAeronefNonRepertorie(String newTypeAeronefNonRepertorie) {
		String oldTypeAeronefNonRepertorie = typeAeronefNonRepertorie;
		typeAeronefNonRepertorie = newTypeAeronefNonRepertorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF_NON_REPERTORIE, oldTypeAeronefNonRepertorie, typeAeronefNonRepertorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefModele getModele() {
		return modele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModele(TypeDictionaryDicoTypeAeronefModele newModele) {
		TypeDictionaryDicoTypeAeronefModele oldModele = modele;
		modele = newModele == null ? MODELE_EDEFAULT : newModele;
		boolean oldModeleESet = modeleESet;
		modeleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__MODELE, oldModele, modele, !oldModeleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModele() {
		TypeDictionaryDicoTypeAeronefModele oldModele = modele;
		boolean oldModeleESet = modeleESet;
		modele = MODELE_EDEFAULT;
		modeleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__MODELE, oldModele, MODELE_EDEFAULT, oldModeleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModele() {
		return modeleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefUsage getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(TypeDictionaryDicoTypeAeronefUsage newUsage) {
		TypeDictionaryDicoTypeAeronefUsage oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		boolean oldUsageESet = usageESet;
		usageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__USAGE, oldUsage, usage, !oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		TypeDictionaryDicoTypeAeronefUsage oldUsage = usage;
		boolean oldUsageESet = usageESet;
		usage = USAGE_EDEFAULT;
		usageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__USAGE, oldUsage, USAGE_EDEFAULT, oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(TypeDictionaryDicoTypeAeronefRole newRole) {
		TypeDictionaryDicoTypeAeronefRole oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		boolean oldRoleESet = roleESet;
		roleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__ROLE, oldRole, role, !oldRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRole() {
		TypeDictionaryDicoTypeAeronefRole oldRole = role;
		boolean oldRoleESet = roleESet;
		role = ROLE_EDEFAULT;
		roleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__ROLE, oldRole, ROLE_EDEFAULT, oldRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRole() {
		return roleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefMissionPrincipale getMissionPrincipale() {
		return missionPrincipale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionPrincipale(TypeDictionaryDicoTypeAeronefMissionPrincipale newMissionPrincipale) {
		TypeDictionaryDicoTypeAeronefMissionPrincipale oldMissionPrincipale = missionPrincipale;
		missionPrincipale = newMissionPrincipale == null ? MISSION_PRINCIPALE_EDEFAULT : newMissionPrincipale;
		boolean oldMissionPrincipaleESet = missionPrincipaleESet;
		missionPrincipaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__MISSION_PRINCIPALE, oldMissionPrincipale, missionPrincipale, !oldMissionPrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMissionPrincipale() {
		TypeDictionaryDicoTypeAeronefMissionPrincipale oldMissionPrincipale = missionPrincipale;
		boolean oldMissionPrincipaleESet = missionPrincipaleESet;
		missionPrincipale = MISSION_PRINCIPALE_EDEFAULT;
		missionPrincipaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__MISSION_PRINCIPALE, oldMissionPrincipale, MISSION_PRINCIPALE_EDEFAULT, oldMissionPrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMissionPrincipale() {
		return missionPrincipaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefEntrainement getEntrainement() {
		return entrainement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrainement(TypeDictionaryDicoTypeAeronefEntrainement newEntrainement) {
		TypeDictionaryDicoTypeAeronefEntrainement oldEntrainement = entrainement;
		entrainement = newEntrainement == null ? ENTRAINEMENT_EDEFAULT : newEntrainement;
		boolean oldEntrainementESet = entrainementESet;
		entrainementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__ENTRAINEMENT, oldEntrainement, entrainement, !oldEntrainementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEntrainement() {
		TypeDictionaryDicoTypeAeronefEntrainement oldEntrainement = entrainement;
		boolean oldEntrainementESet = entrainementESet;
		entrainement = ENTRAINEMENT_EDEFAULT;
		entrainementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__ENTRAINEMENT, oldEntrainement, ENTRAINEMENT_EDEFAULT, oldEntrainementESet));
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
	public TypeDictionaryDicoTypeAeronefQualificatifMeteo getQualificatifMeteo() {
		return qualificatifMeteo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifMeteo(TypeDictionaryDicoTypeAeronefQualificatifMeteo newQualificatifMeteo) {
		TypeDictionaryDicoTypeAeronefQualificatifMeteo oldQualificatifMeteo = qualificatifMeteo;
		qualificatifMeteo = newQualificatifMeteo == null ? QUALIFICATIF_METEO_EDEFAULT : newQualificatifMeteo;
		boolean oldQualificatifMeteoESet = qualificatifMeteoESet;
		qualificatifMeteoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__QUALIFICATIF_METEO, oldQualificatifMeteo, qualificatifMeteo, !oldQualificatifMeteoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifMeteo() {
		TypeDictionaryDicoTypeAeronefQualificatifMeteo oldQualificatifMeteo = qualificatifMeteo;
		boolean oldQualificatifMeteoESet = qualificatifMeteoESet;
		qualificatifMeteo = QUALIFICATIF_METEO_EDEFAULT;
		qualificatifMeteoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__QUALIFICATIF_METEO, oldQualificatifMeteo, QUALIFICATIF_METEO_EDEFAULT, oldQualificatifMeteoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifMeteo() {
		return qualificatifMeteoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefDesignationPilotage getDesignationPilotage() {
		return designationPilotage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignationPilotage(TypeDictionaryDicoTypeAeronefDesignationPilotage newDesignationPilotage) {
		TypeDictionaryDicoTypeAeronefDesignationPilotage oldDesignationPilotage = designationPilotage;
		designationPilotage = newDesignationPilotage == null ? DESIGNATION_PILOTAGE_EDEFAULT : newDesignationPilotage;
		boolean oldDesignationPilotageESet = designationPilotageESet;
		designationPilotageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__DESIGNATION_PILOTAGE, oldDesignationPilotage, designationPilotage, !oldDesignationPilotageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDesignationPilotage() {
		TypeDictionaryDicoTypeAeronefDesignationPilotage oldDesignationPilotage = designationPilotage;
		boolean oldDesignationPilotageESet = designationPilotageESet;
		designationPilotage = DESIGNATION_PILOTAGE_EDEFAULT;
		designationPilotageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__DESIGNATION_PILOTAGE, oldDesignationPilotage, DESIGNATION_PILOTAGE_EDEFAULT, oldDesignationPilotageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDesignationPilotage() {
		return designationPilotageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage getDecollageEtAtterrissage() {
		return decollageEtAtterrissage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecollageEtAtterrissage(TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage newDecollageEtAtterrissage) {
		TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage oldDecollageEtAtterrissage = decollageEtAtterrissage;
		decollageEtAtterrissage = newDecollageEtAtterrissage == null ? DECOLLAGE_ET_ATTERRISSAGE_EDEFAULT : newDecollageEtAtterrissage;
		boolean oldDecollageEtAtterrissageESet = decollageEtAtterrissageESet;
		decollageEtAtterrissageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__DECOLLAGE_ET_ATTERRISSAGE, oldDecollageEtAtterrissage, decollageEtAtterrissage, !oldDecollageEtAtterrissageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDecollageEtAtterrissage() {
		TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage oldDecollageEtAtterrissage = decollageEtAtterrissage;
		boolean oldDecollageEtAtterrissageESet = decollageEtAtterrissageESet;
		decollageEtAtterrissage = DECOLLAGE_ET_ATTERRISSAGE_EDEFAULT;
		decollageEtAtterrissageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__DECOLLAGE_ET_ATTERRISSAGE, oldDecollageEtAtterrissage, DECOLLAGE_ET_ATTERRISSAGE_EDEFAULT, oldDecollageEtAtterrissageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDecollageEtAtterrissage() {
		return decollageEtAtterrissageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol getMaterielRavitaillementEnVol() {
		return materielRavitaillementEnVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterielRavitaillementEnVol(TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol newMaterielRavitaillementEnVol) {
		TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol oldMaterielRavitaillementEnVol = materielRavitaillementEnVol;
		materielRavitaillementEnVol = newMaterielRavitaillementEnVol == null ? MATERIEL_RAVITAILLEMENT_EN_VOL_EDEFAULT : newMaterielRavitaillementEnVol;
		boolean oldMaterielRavitaillementEnVolESet = materielRavitaillementEnVolESet;
		materielRavitaillementEnVolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__MATERIEL_RAVITAILLEMENT_EN_VOL, oldMaterielRavitaillementEnVol, materielRavitaillementEnVol, !oldMaterielRavitaillementEnVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaterielRavitaillementEnVol() {
		TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol oldMaterielRavitaillementEnVol = materielRavitaillementEnVol;
		boolean oldMaterielRavitaillementEnVolESet = materielRavitaillementEnVolESet;
		materielRavitaillementEnVol = MATERIEL_RAVITAILLEMENT_EN_VOL_EDEFAULT;
		materielRavitaillementEnVolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__MATERIEL_RAVITAILLEMENT_EN_VOL, oldMaterielRavitaillementEnVol, MATERIEL_RAVITAILLEMENT_EN_VOL_EDEFAULT, oldMaterielRavitaillementEnVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaterielRavitaillementEnVol() {
		return materielRavitaillementEnVolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefCharge getCharge() {
		return charge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharge(TypeDictionaryDicoTypeAeronefCharge newCharge) {
		TypeDictionaryDicoTypeAeronefCharge oldCharge = charge;
		charge = newCharge == null ? CHARGE_EDEFAULT : newCharge;
		boolean oldChargeESet = chargeESet;
		chargeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__CHARGE, oldCharge, charge, !oldChargeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCharge() {
		TypeDictionaryDicoTypeAeronefCharge oldCharge = charge;
		boolean oldChargeESet = chargeESet;
		charge = CHARGE_EDEFAULT;
		chargeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__CHARGE, oldCharge, CHARGE_EDEFAULT, oldChargeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCharge() {
		return chargeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAeronefRayonAction getRayonAction() {
		return rayonAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonAction(TypeDictionaryDicoTypeAeronefRayonAction newRayonAction) {
		TypeDictionaryDicoTypeAeronefRayonAction oldRayonAction = rayonAction;
		rayonAction = newRayonAction == null ? RAYON_ACTION_EDEFAULT : newRayonAction;
		boolean oldRayonActionESet = rayonActionESet;
		rayonActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__RAYON_ACTION, oldRayonAction, rayonAction, !oldRayonActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRayonAction() {
		TypeDictionaryDicoTypeAeronefRayonAction oldRayonAction = rayonAction;
		boolean oldRayonActionESet = rayonActionESet;
		rayonAction = RAYON_ACTION_EDEFAULT;
		rayonActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__RAYON_ACTION, oldRayonAction, RAYON_ACTION_EDEFAULT, oldRayonActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRayonAction() {
		return rayonActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getEnvergure() {
		return envergure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvergure(TypeDataTypeLongueur newEnvergure, NotificationChain msgs) {
		TypeDataTypeLongueur oldEnvergure = envergure;
		envergure = newEnvergure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__ENVERGURE, oldEnvergure, newEnvergure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvergure(TypeDataTypeLongueur newEnvergure) {
		if (newEnvergure != envergure) {
			NotificationChain msgs = null;
			if (envergure != null)
				msgs = ((InternalEObject)envergure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_AERONEF__ENVERGURE, null, msgs);
			if (newEnvergure != null)
				msgs = ((InternalEObject)newEnvergure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_AERONEF__ENVERGURE, null, msgs);
			msgs = basicSetEnvergure(newEnvergure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__ENVERGURE, newEnvergure, newEnvergure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPlafondMax() {
		return plafondMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlafondMax(long newPlafondMax) {
		long oldPlafondMax = plafondMax;
		plafondMax = newPlafondMax;
		boolean oldPlafondMaxESet = plafondMaxESet;
		plafondMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_MAX, oldPlafondMax, plafondMax, !oldPlafondMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlafondMax() {
		long oldPlafondMax = plafondMax;
		boolean oldPlafondMaxESet = plafondMaxESet;
		plafondMax = PLAFOND_MAX_EDEFAULT;
		plafondMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_MAX, oldPlafondMax, PLAFOND_MAX_EDEFAULT, oldPlafondMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlafondMax() {
		return plafondMaxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPlafondPoser() {
		return plafondPoser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlafondPoser(long newPlafondPoser) {
		long oldPlafondPoser = plafondPoser;
		plafondPoser = newPlafondPoser;
		boolean oldPlafondPoserESet = plafondPoserESet;
		plafondPoserESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_POSER, oldPlafondPoser, plafondPoser, !oldPlafondPoserESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlafondPoser() {
		long oldPlafondPoser = plafondPoser;
		boolean oldPlafondPoserESet = plafondPoserESet;
		plafondPoser = PLAFOND_POSER_EDEFAULT;
		plafondPoserESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_POSER, oldPlafondPoser, PLAFOND_POSER_EDEFAULT, oldPlafondPoserESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlafondPoser() {
		return plafondPoserESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseMaxTransit() {
		return vitesseMaxTransit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseMaxTransit(TypeDataTypeVitesseLineaire newVitesseMaxTransit, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseMaxTransit = vitesseMaxTransit;
		vitesseMaxTransit = newVitesseMaxTransit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_MAX_TRANSIT, oldVitesseMaxTransit, newVitesseMaxTransit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMaxTransit(TypeDataTypeVitesseLineaire newVitesseMaxTransit) {
		if (newVitesseMaxTransit != vitesseMaxTransit) {
			NotificationChain msgs = null;
			if (vitesseMaxTransit != null)
				msgs = ((InternalEObject)vitesseMaxTransit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_MAX_TRANSIT, null, msgs);
			if (newVitesseMaxTransit != null)
				msgs = ((InternalEObject)newVitesseMaxTransit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_MAX_TRANSIT, null, msgs);
			msgs = basicSetVitesseMaxTransit(newVitesseMaxTransit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_MAX_TRANSIT, newVitesseMaxTransit, newVitesseMaxTransit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitessePuissanceMinimum() {
		return vitessePuissanceMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitessePuissanceMinimum(TypeDataTypeVitesseLineaire newVitessePuissanceMinimum, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitessePuissanceMinimum = vitessePuissanceMinimum;
		vitessePuissanceMinimum = newVitessePuissanceMinimum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_PUISSANCE_MINIMUM, oldVitessePuissanceMinimum, newVitessePuissanceMinimum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitessePuissanceMinimum(TypeDataTypeVitesseLineaire newVitessePuissanceMinimum) {
		if (newVitessePuissanceMinimum != vitessePuissanceMinimum) {
			NotificationChain msgs = null;
			if (vitessePuissanceMinimum != null)
				msgs = ((InternalEObject)vitessePuissanceMinimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_PUISSANCE_MINIMUM, null, msgs);
			if (newVitessePuissanceMinimum != null)
				msgs = ((InternalEObject)newVitessePuissanceMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_PUISSANCE_MINIMUM, null, msgs);
			msgs = basicSetVitessePuissanceMinimum(newVitessePuissanceMinimum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_PUISSANCE_MINIMUM, newVitessePuissanceMinimum, newVitessePuissanceMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getConsommationHoraireStationFixe() {
		return consommationHoraireStationFixe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsommationHoraireStationFixe(long newConsommationHoraireStationFixe) {
		long oldConsommationHoraireStationFixe = consommationHoraireStationFixe;
		consommationHoraireStationFixe = newConsommationHoraireStationFixe;
		boolean oldConsommationHoraireStationFixeESet = consommationHoraireStationFixeESet;
		consommationHoraireStationFixeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_STATION_FIXE, oldConsommationHoraireStationFixe, consommationHoraireStationFixe, !oldConsommationHoraireStationFixeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsommationHoraireStationFixe() {
		long oldConsommationHoraireStationFixe = consommationHoraireStationFixe;
		boolean oldConsommationHoraireStationFixeESet = consommationHoraireStationFixeESet;
		consommationHoraireStationFixe = CONSOMMATION_HORAIRE_STATION_FIXE_EDEFAULT;
		consommationHoraireStationFixeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_STATION_FIXE, oldConsommationHoraireStationFixe, CONSOMMATION_HORAIRE_STATION_FIXE_EDEFAULT, oldConsommationHoraireStationFixeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsommationHoraireStationFixe() {
		return consommationHoraireStationFixeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getConsommationHoraireTransit() {
		return consommationHoraireTransit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsommationHoraireTransit(long newConsommationHoraireTransit) {
		long oldConsommationHoraireTransit = consommationHoraireTransit;
		consommationHoraireTransit = newConsommationHoraireTransit;
		boolean oldConsommationHoraireTransitESet = consommationHoraireTransitESet;
		consommationHoraireTransitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_TRANSIT, oldConsommationHoraireTransit, consommationHoraireTransit, !oldConsommationHoraireTransitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsommationHoraireTransit() {
		long oldConsommationHoraireTransit = consommationHoraireTransit;
		boolean oldConsommationHoraireTransitESet = consommationHoraireTransitESet;
		consommationHoraireTransit = CONSOMMATION_HORAIRE_TRANSIT_EDEFAULT;
		consommationHoraireTransitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_TRANSIT, oldConsommationHoraireTransit, CONSOMMATION_HORAIRE_TRANSIT_EDEFAULT, oldConsommationHoraireTransitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsommationHoraireTransit() {
		return consommationHoraireTransitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConfiguration getAPourConfigurationConfiguration() {
		return aPourConfigurationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourConfigurationConfiguration(TypeConfiguration newAPourConfigurationConfiguration, NotificationChain msgs) {
		TypeConfiguration oldAPourConfigurationConfiguration = aPourConfigurationConfiguration;
		aPourConfigurationConfiguration = newAPourConfigurationConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__APOUR_CONFIGURATION_CONFIGURATION, oldAPourConfigurationConfiguration, newAPourConfigurationConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourConfigurationConfiguration(TypeConfiguration newAPourConfigurationConfiguration) {
		if (newAPourConfigurationConfiguration != aPourConfigurationConfiguration) {
			NotificationChain msgs = null;
			if (aPourConfigurationConfiguration != null)
				msgs = ((InternalEObject)aPourConfigurationConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_AERONEF__APOUR_CONFIGURATION_CONFIGURATION, null, msgs);
			if (newAPourConfigurationConfiguration != null)
				msgs = ((InternalEObject)newAPourConfigurationConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_AERONEF__APOUR_CONFIGURATION_CONFIGURATION, null, msgs);
			msgs = basicSetAPourConfigurationConfiguration(newAPourConfigurationConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AERONEF__APOUR_CONFIGURATION_CONFIGURATION, newAPourConfigurationConfiguration, newAPourConfigurationConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEquipementHelicoptere> getAPourEquipementEquipementHelicoptere() {
		if (aPourEquipementEquipementHelicoptere == null) {
			aPourEquipementEquipementHelicoptere = new EObjectContainmentEList<TypeEquipementHelicoptere>(TypeEquipementHelicoptere.class, this, SchemaPackage.TYPE_TYPE_AERONEF__APOUR_EQUIPEMENT_EQUIPEMENT_HELICOPTERE);
		}
		return aPourEquipementEquipementHelicoptere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_AERONEF__ENVERGURE:
				return basicSetEnvergure(null, msgs);
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_MAX_TRANSIT:
				return basicSetVitesseMaxTransit(null, msgs);
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_PUISSANCE_MINIMUM:
				return basicSetVitessePuissanceMinimum(null, msgs);
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_CONFIGURATION_CONFIGURATION:
				return basicSetAPourConfigurationConfiguration(null, msgs);
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_EQUIPEMENT_EQUIPEMENT_HELICOPTERE:
				return ((InternalEList<?>)getAPourEquipementEquipementHelicoptere()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TYPE_AERONEF__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF:
				return getTypeAeronef();
			case SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF_NON_REPERTORIE:
				return getTypeAeronefNonRepertorie();
			case SchemaPackage.TYPE_TYPE_AERONEF__MODELE:
				return getModele();
			case SchemaPackage.TYPE_TYPE_AERONEF__USAGE:
				return getUsage();
			case SchemaPackage.TYPE_TYPE_AERONEF__ROLE:
				return getRole();
			case SchemaPackage.TYPE_TYPE_AERONEF__MISSION_PRINCIPALE:
				return getMissionPrincipale();
			case SchemaPackage.TYPE_TYPE_AERONEF__ENTRAINEMENT:
				return getEntrainement();
			case SchemaPackage.TYPE_TYPE_AERONEF__QUALIFICATIF_METEO:
				return getQualificatifMeteo();
			case SchemaPackage.TYPE_TYPE_AERONEF__DESIGNATION_PILOTAGE:
				return getDesignationPilotage();
			case SchemaPackage.TYPE_TYPE_AERONEF__DECOLLAGE_ET_ATTERRISSAGE:
				return getDecollageEtAtterrissage();
			case SchemaPackage.TYPE_TYPE_AERONEF__MATERIEL_RAVITAILLEMENT_EN_VOL:
				return getMaterielRavitaillementEnVol();
			case SchemaPackage.TYPE_TYPE_AERONEF__CHARGE:
				return getCharge();
			case SchemaPackage.TYPE_TYPE_AERONEF__RAYON_ACTION:
				return getRayonAction();
			case SchemaPackage.TYPE_TYPE_AERONEF__ENVERGURE:
				return getEnvergure();
			case SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_MAX:
				return new Long(getPlafondMax());
			case SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_POSER:
				return new Long(getPlafondPoser());
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_MAX_TRANSIT:
				return getVitesseMaxTransit();
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_PUISSANCE_MINIMUM:
				return getVitessePuissanceMinimum();
			case SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_STATION_FIXE:
				return new Long(getConsommationHoraireStationFixe());
			case SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_TRANSIT:
				return new Long(getConsommationHoraireTransit());
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_CONFIGURATION_CONFIGURATION:
				return getAPourConfigurationConfiguration();
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_EQUIPEMENT_EQUIPEMENT_HELICOPTERE:
				return getAPourEquipementEquipementHelicoptere();
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
			case SchemaPackage.TYPE_TYPE_AERONEF__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeAeronefCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF:
				setTypeAeronef((TypeDictionaryDicoTypeAeronefTypeAeronef)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF_NON_REPERTORIE:
				setTypeAeronefNonRepertorie((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__MODELE:
				setModele((TypeDictionaryDicoTypeAeronefModele)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__USAGE:
				setUsage((TypeDictionaryDicoTypeAeronefUsage)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__ROLE:
				setRole((TypeDictionaryDicoTypeAeronefRole)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__MISSION_PRINCIPALE:
				setMissionPrincipale((TypeDictionaryDicoTypeAeronefMissionPrincipale)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__ENTRAINEMENT:
				setEntrainement((TypeDictionaryDicoTypeAeronefEntrainement)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__QUALIFICATIF_METEO:
				setQualificatifMeteo((TypeDictionaryDicoTypeAeronefQualificatifMeteo)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__DESIGNATION_PILOTAGE:
				setDesignationPilotage((TypeDictionaryDicoTypeAeronefDesignationPilotage)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__DECOLLAGE_ET_ATTERRISSAGE:
				setDecollageEtAtterrissage((TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__MATERIEL_RAVITAILLEMENT_EN_VOL:
				setMaterielRavitaillementEnVol((TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__CHARGE:
				setCharge((TypeDictionaryDicoTypeAeronefCharge)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__RAYON_ACTION:
				setRayonAction((TypeDictionaryDicoTypeAeronefRayonAction)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__ENVERGURE:
				setEnvergure((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_MAX:
				setPlafondMax(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_POSER:
				setPlafondPoser(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_MAX_TRANSIT:
				setVitesseMaxTransit((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_PUISSANCE_MINIMUM:
				setVitessePuissanceMinimum((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_STATION_FIXE:
				setConsommationHoraireStationFixe(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_TRANSIT:
				setConsommationHoraireTransit(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_CONFIGURATION_CONFIGURATION:
				setAPourConfigurationConfiguration((TypeConfiguration)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_EQUIPEMENT_EQUIPEMENT_HELICOPTERE:
				getAPourEquipementEquipementHelicoptere().clear();
				getAPourEquipementEquipementHelicoptere().addAll((Collection<? extends TypeEquipementHelicoptere>)newValue);
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
			case SchemaPackage.TYPE_TYPE_AERONEF__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF:
				unsetTypeAeronef();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF_NON_REPERTORIE:
				setTypeAeronefNonRepertorie(TYPE_AERONEF_NON_REPERTORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__MODELE:
				unsetModele();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__USAGE:
				unsetUsage();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__ROLE:
				unsetRole();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__MISSION_PRINCIPALE:
				unsetMissionPrincipale();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__ENTRAINEMENT:
				unsetEntrainement();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__QUALIFICATIF_METEO:
				unsetQualificatifMeteo();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__DESIGNATION_PILOTAGE:
				unsetDesignationPilotage();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__DECOLLAGE_ET_ATTERRISSAGE:
				unsetDecollageEtAtterrissage();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__MATERIEL_RAVITAILLEMENT_EN_VOL:
				unsetMaterielRavitaillementEnVol();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__CHARGE:
				unsetCharge();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__RAYON_ACTION:
				unsetRayonAction();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__ENVERGURE:
				setEnvergure((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_MAX:
				unsetPlafondMax();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_POSER:
				unsetPlafondPoser();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_MAX_TRANSIT:
				setVitesseMaxTransit((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_PUISSANCE_MINIMUM:
				setVitessePuissanceMinimum((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_STATION_FIXE:
				unsetConsommationHoraireStationFixe();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_TRANSIT:
				unsetConsommationHoraireTransit();
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_CONFIGURATION_CONFIGURATION:
				setAPourConfigurationConfiguration((TypeConfiguration)null);
				return;
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_EQUIPEMENT_EQUIPEMENT_HELICOPTERE:
				getAPourEquipementEquipementHelicoptere().clear();
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
			case SchemaPackage.TYPE_TYPE_AERONEF__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF:
				return isSetTypeAeronef();
			case SchemaPackage.TYPE_TYPE_AERONEF__TYPE_AERONEF_NON_REPERTORIE:
				return TYPE_AERONEF_NON_REPERTORIE_EDEFAULT == null ? typeAeronefNonRepertorie != null : !TYPE_AERONEF_NON_REPERTORIE_EDEFAULT.equals(typeAeronefNonRepertorie);
			case SchemaPackage.TYPE_TYPE_AERONEF__MODELE:
				return isSetModele();
			case SchemaPackage.TYPE_TYPE_AERONEF__USAGE:
				return isSetUsage();
			case SchemaPackage.TYPE_TYPE_AERONEF__ROLE:
				return isSetRole();
			case SchemaPackage.TYPE_TYPE_AERONEF__MISSION_PRINCIPALE:
				return isSetMissionPrincipale();
			case SchemaPackage.TYPE_TYPE_AERONEF__ENTRAINEMENT:
				return isSetEntrainement();
			case SchemaPackage.TYPE_TYPE_AERONEF__QUALIFICATIF_METEO:
				return isSetQualificatifMeteo();
			case SchemaPackage.TYPE_TYPE_AERONEF__DESIGNATION_PILOTAGE:
				return isSetDesignationPilotage();
			case SchemaPackage.TYPE_TYPE_AERONEF__DECOLLAGE_ET_ATTERRISSAGE:
				return isSetDecollageEtAtterrissage();
			case SchemaPackage.TYPE_TYPE_AERONEF__MATERIEL_RAVITAILLEMENT_EN_VOL:
				return isSetMaterielRavitaillementEnVol();
			case SchemaPackage.TYPE_TYPE_AERONEF__CHARGE:
				return isSetCharge();
			case SchemaPackage.TYPE_TYPE_AERONEF__RAYON_ACTION:
				return isSetRayonAction();
			case SchemaPackage.TYPE_TYPE_AERONEF__ENVERGURE:
				return envergure != null;
			case SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_MAX:
				return isSetPlafondMax();
			case SchemaPackage.TYPE_TYPE_AERONEF__PLAFOND_POSER:
				return isSetPlafondPoser();
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_MAX_TRANSIT:
				return vitesseMaxTransit != null;
			case SchemaPackage.TYPE_TYPE_AERONEF__VITESSE_PUISSANCE_MINIMUM:
				return vitessePuissanceMinimum != null;
			case SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_STATION_FIXE:
				return isSetConsommationHoraireStationFixe();
			case SchemaPackage.TYPE_TYPE_AERONEF__CONSOMMATION_HORAIRE_TRANSIT:
				return isSetConsommationHoraireTransit();
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_CONFIGURATION_CONFIGURATION:
				return aPourConfigurationConfiguration != null;
			case SchemaPackage.TYPE_TYPE_AERONEF__APOUR_EQUIPEMENT_EQUIPEMENT_HELICOPTERE:
				return aPourEquipementEquipementHelicoptere != null && !aPourEquipementEquipementHelicoptere.isEmpty();
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
		result.append(", typeAeronef: ");
		if (typeAeronefESet) result.append(typeAeronef); else result.append("<unset>");
		result.append(", typeAeronefNonRepertorie: ");
		result.append(typeAeronefNonRepertorie);
		result.append(", modele: ");
		if (modeleESet) result.append(modele); else result.append("<unset>");
		result.append(", usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(", role: ");
		if (roleESet) result.append(role); else result.append("<unset>");
		result.append(", missionPrincipale: ");
		if (missionPrincipaleESet) result.append(missionPrincipale); else result.append("<unset>");
		result.append(", entrainement: ");
		if (entrainementESet) result.append(entrainement); else result.append("<unset>");
		result.append(", qualificatifMeteo: ");
		if (qualificatifMeteoESet) result.append(qualificatifMeteo); else result.append("<unset>");
		result.append(", designationPilotage: ");
		if (designationPilotageESet) result.append(designationPilotage); else result.append("<unset>");
		result.append(", decollageEtAtterrissage: ");
		if (decollageEtAtterrissageESet) result.append(decollageEtAtterrissage); else result.append("<unset>");
		result.append(", materielRavitaillementEnVol: ");
		if (materielRavitaillementEnVolESet) result.append(materielRavitaillementEnVol); else result.append("<unset>");
		result.append(", charge: ");
		if (chargeESet) result.append(charge); else result.append("<unset>");
		result.append(", rayonAction: ");
		if (rayonActionESet) result.append(rayonAction); else result.append("<unset>");
		result.append(", plafondMax: ");
		if (plafondMaxESet) result.append(plafondMax); else result.append("<unset>");
		result.append(", plafondPoser: ");
		if (plafondPoserESet) result.append(plafondPoser); else result.append("<unset>");
		result.append(", consommationHoraireStationFixe: ");
		if (consommationHoraireStationFixeESet) result.append(consommationHoraireStationFixe); else result.append("<unset>");
		result.append(", consommationHoraireTransit: ");
		if (consommationHoraireTransitESet) result.append(consommationHoraireTransit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeAeronefImpl
