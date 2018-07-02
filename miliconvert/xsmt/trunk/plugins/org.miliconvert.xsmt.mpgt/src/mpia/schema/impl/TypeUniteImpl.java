/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAzimut;
import mpia.schema.TypeCalendrierCourrier;
import mpia.schema.TypeCaracteristiquesSIO;
import mpia.schema.TypeCentreLLAPI;
import mpia.schema.TypeCentreNC23;
import mpia.schema.TypeConsommationExplosifs;
import mpia.schema.TypeConsommationMines;
import mpia.schema.TypeEtatSic;
import mpia.schema.TypeEvacuationSanitaire;
import mpia.schema.TypeEvenement4D;
import mpia.schema.TypeGroupement;
import mpia.schema.TypeMoyenCommunication;
import mpia.schema.TypeMoyenInvestigation;
import mpia.schema.TypeOrganismeControle;
import mpia.schema.TypeQuantiteElementENIDetruit;
import mpia.schema.TypeQuantiteMateriel;
import mpia.schema.TypeSyntheseSante;
import mpia.schema.TypeUnite;
import mpia.schema.TypeUnite4D;
import mpia.schema.TypeUniteASS;
import mpia.schema.TypeUniteAir;
import mpia.schema.TypeUniteBeneficiaireMateriel;
import mpia.schema.TypeUniteLogistique;
import mpia.schema.TypeUniteMaintenance;
import mpia.schema.TypeZoneDiffusion;

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
 * An implementation of the model object '<em><b>Type Unite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getNomFormelCourt <em>Nom Formel Court</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#isModele <em>Modele</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstEquipeDuSIOCaracteristiquesSIO <em>Est Equipe Du SIO Caracteristiques SIO</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteRenforcementsFeux <em>Est Sujet Association Unite Renforcements Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourSituationEquipementSituationEquipement <em>APour Situation Equipement Situation Equipement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourSituationConsommableSituationConsommable <em>APour Situation Consommable Situation Consommable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourSituationEffectifSituationEffectif <em>APour Situation Effectif Situation Effectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getCalendrierCourrierCalendrierCourrier <em>Calendrier Courrier Calendrier Courrier</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEtatDuSicEtatSic <em>Etat Du Sic Etat Sic</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEvenement4DEvenement4D <em>Evenement4 DEvenement4 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getMoyensCommunicationMoyenCommunication <em>Moyens Communication Moyen Communication</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourDirectionObservationAzimut <em>APour Direction Observation Azimut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getReporteQuantiteElementENIDetruit <em>Reporte Quantite Element ENI Detruit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getReporteQuantiteMateriel <em>Reporte Quantite Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getDemandeEvacuationSanitaire <em>Demande Evacuation Sanitaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getCaracteristiques4DUnite4D <em>Caracteristiques4 DUnite4 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourConsommableMajeurAssociationConsommableMajeur <em>APour Consommable Majeur Association Consommable Majeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getFormeLeGroupementGroupement <em>Forme Le Groupement Groupement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourZoneEchangeAutreElementControle <em>APour Zone Echange Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstFourniPourPrelevementSubordonneNonIdentifie <em>Est Fourni Pour Prelevement Subordonne Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getBeneficiePrelevementSubordonneNonIdentifie <em>Beneficie Prelevement Subordonne Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourActiviteActivitePosture <em>APour Activite Activite Posture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourCaracteristiquesCentreNC23CentreNC23 <em>APour Caracteristiques Centre NC23 Centre NC23</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourCaracteristiquesCentreLLAPICentreLLAPI <em>APour Caracteristiques Centre LLAPI Centre LLAPI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getACommeSituationDesStocksFaitParEntrepotAutreSite <em>AComme Situation Des Stocks Fait Par Entrepot Autre Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs <em>AComme Consommation Autorisee En Explosifs Consommation Explosifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getACommeConsommationAutoriseeEnMinesConsommationMines <em>AComme Consommation Autorisee En Mines Consommation Mines</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourSyntheseSanteSyntheseSante <em>APour Synthese Sante Synthese Sante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEmetInterventionGenerale <em>Emet Intervention Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getACommeMoyenInvestigationMoyenInvestigation <em>AComme Moyen Investigation Moyen Investigation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourCaracteristiquesOrganismeControleOrganismeControle <em>APour Caracteristiques Organisme Controle Organisme Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique <em>AComme Situation Des Stocks Fait Par Zone Logistique Zone Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourCaracteristiquesLogistiquesUniteLogistique <em>APour Caracteristiques Logistiques Unite Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourCaracteristiquesMaintenanceUniteMaintenance <em>APour Caracteristiques Maintenance Unite Maintenance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourCaracteristiquesUniteASSUniteASS <em>APour Caracteristiques Unite ASS Unite ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourCaracteristiquesUniteAirUniteAir <em>APour Caracteristiques Unite Air Unite Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel <em>APour Materiels Genie Alloues Unite Beneficiaire Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourEquipementMajeurAssociationEquipementlMajeur <em>APour Equipement Majeur Association Equipementl Majeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourZoneResponsabiliteAutreElementControle <em>APour Zone Responsabilite Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteLivraison <em>Est Sujet Association Unite Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionEscorteAF <em>Est Sujet Association Unite Mission Escorte AF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteAutreMissionLog <em>Est Sujet Association Unite Autre Mission Log</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionAir <em>Est Sujet Association Unite Mission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionGenie <em>Est Sujet Association Unite Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUnitePlanifOperation3D <em>Est Sujet Association Unite Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionAcqASS <em>Est Sujet Association Unite Mission Acq ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionAerienne <em>Est Sujet Association Unite Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionALATattaque <em>Est Sujet Association Unite Mission ALA Tattaque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionASA <em>Est Sujet Association Unite Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteAppuiFeuHelicoptere <em>Est Sujet Association Unite Appui Feu Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourZoneDiffusionZoneDiffusion <em>APour Zone Diffusion Zone Diffusion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionTranspTact <em>Est Sujet Association Unite Mission Transp Tact</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionRensObj <em>Est Sujet Association Unite Mission Rens Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMouvementParRoute <em>Est Sujet Association Unite Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUnitePlanFeux <em>Est Sujet Association Unite Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionMelee <em>Est Sujet Association Unite Mission Melee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionUniteAntichar <em>Est Sujet Association Unite Mission Unite Antichar</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationUniteMissionSic <em>Est Sujet Association Unite Mission Sic</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getBeneficieArticulationASS <em>Beneficie Articulation ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstFourniPourDetachementNonIdentifie <em>Est Fourni Pour Detachement Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getACommeAutoriteGuidageConsigne <em>AComme Autorite Guidage Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstInteresseeParFaitRenseignement <em>Est Interessee Par Fait Renseignement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique <em>APour Mesures Protection Electronique Mesures Protection Electronique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getBeneficieDetachementNonIdentifie <em>Beneficie Detachement Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstAOrigineObservationObservation <em>Est AOrigine Observation Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstSujetAssociationProfilUnite <em>Est Sujet Association Profil Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteImpl#getEstFourniPourArticulationASS <em>Est Fourni Pour Articulation ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUniteImpl extends TypeEntiteOrganisationnelleImpl implements TypeUnite {
	/**
	 * The default value of the '{@link #getNomFormelCourt() <em>Nom Formel Court</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomFormelCourt()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_FORMEL_COURT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomFormelCourt() <em>Nom Formel Court</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomFormelCourt()
	 * @generated
	 * @ordered
	 */
	protected String nomFormelCourt = NOM_FORMEL_COURT_EDEFAULT;

	/**
	 * The default value of the '{@link #isModele() <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModele()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODELE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModele() <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModele()
	 * @generated
	 * @ordered
	 */
	protected boolean modele = MODELE_EDEFAULT;

	/**
	 * This is true if the Modele attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeleESet;

	/**
	 * The cached value of the '{@link #getEstEquipeDuSIOCaracteristiquesSIO() <em>Est Equipe Du SIO Caracteristiques SIO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEquipeDuSIOCaracteristiquesSIO()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCaracteristiquesSIO> estEquipeDuSIOCaracteristiquesSIO;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteRenforcementsFeux() <em>Est Sujet Association Unite Renforcements Feux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteRenforcementsFeux()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteRenforcementsFeux;

	/**
	 * The cached value of the '{@link #getAPourSituationEquipementSituationEquipement() <em>APour Situation Equipement Situation Equipement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSituationEquipementSituationEquipement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourSituationEquipementSituationEquipement;

	/**
	 * The cached value of the '{@link #getAPourSituationConsommableSituationConsommable() <em>APour Situation Consommable Situation Consommable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSituationConsommableSituationConsommable()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourSituationConsommableSituationConsommable;

	/**
	 * The cached value of the '{@link #getAPourSituationEffectifSituationEffectif() <em>APour Situation Effectif Situation Effectif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSituationEffectifSituationEffectif()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourSituationEffectifSituationEffectif;

	/**
	 * The cached value of the '{@link #getCalendrierCourrierCalendrierCourrier() <em>Calendrier Courrier Calendrier Courrier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendrierCourrierCalendrierCourrier()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCalendrierCourrier> calendrierCourrierCalendrierCourrier;

	/**
	 * The cached value of the '{@link #getEtatDuSicEtatSic() <em>Etat Du Sic Etat Sic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDuSicEtatSic()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatSic> etatDuSicEtatSic;

	/**
	 * The cached value of the '{@link #getEvenement4DEvenement4D() <em>Evenement4 DEvenement4 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvenement4DEvenement4D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEvenement4D> evenement4DEvenement4D;

	/**
	 * The cached value of the '{@link #getMoyensCommunicationMoyenCommunication() <em>Moyens Communication Moyen Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensCommunicationMoyenCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyenCommunication> moyensCommunicationMoyenCommunication;

	/**
	 * The cached value of the '{@link #getAPourDirectionObservationAzimut() <em>APour Direction Observation Azimut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDirectionObservationAzimut()
	 * @generated
	 * @ordered
	 */
	protected TypeAzimut aPourDirectionObservationAzimut;

	/**
	 * The cached value of the '{@link #getReporteQuantiteElementENIDetruit() <em>Reporte Quantite Element ENI Detruit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporteQuantiteElementENIDetruit()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteElementENIDetruit> reporteQuantiteElementENIDetruit;

	/**
	 * The cached value of the '{@link #getReporteQuantiteMateriel() <em>Reporte Quantite Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporteQuantiteMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteMateriel> reporteQuantiteMateriel;

	/**
	 * The cached value of the '{@link #getDemandeEvacuationSanitaire() <em>Demande Evacuation Sanitaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandeEvacuationSanitaire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEvacuationSanitaire> demandeEvacuationSanitaire;

	/**
	 * The cached value of the '{@link #getCaracteristiques4DUnite4D() <em>Caracteristiques4 DUnite4 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristiques4DUnite4D()
	 * @generated
	 * @ordered
	 */
	protected TypeUnite4D caracteristiques4DUnite4D;

	/**
	 * The cached value of the '{@link #getAPourConsommableMajeurAssociationConsommableMajeur() <em>APour Consommable Majeur Association Consommable Majeur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConsommableMajeurAssociationConsommableMajeur()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourConsommableMajeurAssociationConsommableMajeur;

	/**
	 * The cached value of the '{@link #getFormeLeGroupementGroupement() <em>Forme Le Groupement Groupement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormeLeGroupementGroupement()
	 * @generated
	 * @ordered
	 */
	protected TypeGroupement formeLeGroupementGroupement;

	/**
	 * The cached value of the '{@link #getAPourZoneEchangeAutreElementControle() <em>APour Zone Echange Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneEchangeAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneEchangeAutreElementControle;

	/**
	 * The cached value of the '{@link #getEstFourniPourPrelevementSubordonneNonIdentifie() <em>Est Fourni Pour Prelevement Subordonne Non Identifie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstFourniPourPrelevementSubordonneNonIdentifie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estFourniPourPrelevementSubordonneNonIdentifie;

	/**
	 * The cached value of the '{@link #getBeneficiePrelevementSubordonneNonIdentifie() <em>Beneficie Prelevement Subordonne Non Identifie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiePrelevementSubordonneNonIdentifie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> beneficiePrelevementSubordonneNonIdentifie;

	/**
	 * The cached value of the '{@link #getAPourActiviteActivitePosture() <em>APour Activite Activite Posture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourActiviteActivitePosture()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourActiviteActivitePosture;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesCentreNC23CentreNC23() <em>APour Caracteristiques Centre NC23 Centre NC23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesCentreNC23CentreNC23()
	 * @generated
	 * @ordered
	 */
	protected TypeCentreNC23 aPourCaracteristiquesCentreNC23CentreNC23;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesCentreLLAPICentreLLAPI() <em>APour Caracteristiques Centre LLAPI Centre LLAPI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesCentreLLAPICentreLLAPI()
	 * @generated
	 * @ordered
	 */
	protected TypeCentreLLAPI aPourCaracteristiquesCentreLLAPICentreLLAPI;

	/**
	 * The cached value of the '{@link #getACommeSituationDesStocksFaitParEntrepotAutreSite() <em>AComme Situation Des Stocks Fait Par Entrepot Autre Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeSituationDesStocksFaitParEntrepotAutreSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeSituationDesStocksFaitParEntrepotAutreSite;

	/**
	 * The cached value of the '{@link #getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs() <em>AComme Consommation Autorisee En Explosifs Consommation Explosifs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConsommationExplosifs> aCommeConsommationAutoriseeEnExplosifsConsommationExplosifs;

	/**
	 * The cached value of the '{@link #getACommeConsommationAutoriseeEnMinesConsommationMines() <em>AComme Consommation Autorisee En Mines Consommation Mines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsommationAutoriseeEnMinesConsommationMines()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConsommationMines> aCommeConsommationAutoriseeEnMinesConsommationMines;

	/**
	 * The cached value of the '{@link #getAPourSyntheseSanteSyntheseSante() <em>APour Synthese Sante Synthese Sante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSyntheseSanteSyntheseSante()
	 * @generated
	 * @ordered
	 */
	protected TypeSyntheseSante aPourSyntheseSanteSyntheseSante;

	/**
	 * The cached value of the '{@link #getEmetInterventionGenerale() <em>Emet Intervention Generale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmetInterventionGenerale()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> emetInterventionGenerale;

	/**
	 * The cached value of the '{@link #getACommeMoyenInvestigationMoyenInvestigation() <em>AComme Moyen Investigation Moyen Investigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeMoyenInvestigationMoyenInvestigation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyenInvestigation> aCommeMoyenInvestigationMoyenInvestigation;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesOrganismeControleOrganismeControle() <em>APour Caracteristiques Organisme Controle Organisme Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesOrganismeControleOrganismeControle()
	 * @generated
	 * @ordered
	 */
	protected TypeOrganismeControle aPourCaracteristiquesOrganismeControleOrganismeControle;

	/**
	 * The cached value of the '{@link #getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique() <em>AComme Situation Des Stocks Fait Par Zone Logistique Zone Logistique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesLogistiquesUniteLogistique() <em>APour Caracteristiques Logistiques Unite Logistique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesLogistiquesUniteLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeUniteLogistique aPourCaracteristiquesLogistiquesUniteLogistique;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesMaintenanceUniteMaintenance() <em>APour Caracteristiques Maintenance Unite Maintenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesMaintenanceUniteMaintenance()
	 * @generated
	 * @ordered
	 */
	protected TypeUniteMaintenance aPourCaracteristiquesMaintenanceUniteMaintenance;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesUniteASSUniteASS() <em>APour Caracteristiques Unite ASS Unite ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesUniteASSUniteASS()
	 * @generated
	 * @ordered
	 */
	protected TypeUniteASS aPourCaracteristiquesUniteASSUniteASS;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesUniteAirUniteAir() <em>APour Caracteristiques Unite Air Unite Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesUniteAirUniteAir()
	 * @generated
	 * @ordered
	 */
	protected TypeUniteAir aPourCaracteristiquesUniteAirUniteAir;

	/**
	 * The cached value of the '{@link #getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel() <em>APour Materiels Genie Alloues Unite Beneficiaire Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeUniteBeneficiaireMateriel> aPourMaterielsGenieAllouesUniteBeneficiaireMateriel;

	/**
	 * The cached value of the '{@link #getAPourEquipementMajeurAssociationEquipementlMajeur() <em>APour Equipement Majeur Association Equipementl Majeur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEquipementMajeurAssociationEquipementlMajeur()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourEquipementMajeurAssociationEquipementlMajeur;

	/**
	 * The cached value of the '{@link #getAPourZoneResponsabiliteAutreElementControle() <em>APour Zone Responsabilite Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneResponsabiliteAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneResponsabiliteAutreElementControle;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteLivraison() <em>Est Sujet Association Unite Livraison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteLivraison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteLivraison;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionEscorteAF() <em>Est Sujet Association Unite Mission Escorte AF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionEscorteAF()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionEscorteAF;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteAutreMissionLog() <em>Est Sujet Association Unite Autre Mission Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteAutreMissionLog()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteAutreMissionLog;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionAir() <em>Est Sujet Association Unite Mission Air</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionAir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionAir;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionGenie() <em>Est Sujet Association Unite Mission Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionGenie;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUnitePlanifOperation3D() <em>Est Sujet Association Unite Planif Operation3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUnitePlanifOperation3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUnitePlanifOperation3D;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionAcqASS() <em>Est Sujet Association Unite Mission Acq ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionAcqASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionAcqASS;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionAerienne() <em>Est Sujet Association Unite Mission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionAerienne;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionALATattaque() <em>Est Sujet Association Unite Mission ALA Tattaque</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionALATattaque()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionALATattaque;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionASA() <em>Est Sujet Association Unite Mission ASA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionASA()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionASA;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteAppuiFeuHelicoptere() <em>Est Sujet Association Unite Appui Feu Helicoptere</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteAppuiFeuHelicoptere()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteAppuiFeuHelicoptere;

	/**
	 * The cached value of the '{@link #getAPourZoneDiffusionZoneDiffusion() <em>APour Zone Diffusion Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneDiffusionZoneDiffusion()
	 * @generated
	 * @ordered
	 */
	protected TypeZoneDiffusion aPourZoneDiffusionZoneDiffusion;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionTranspTact() <em>Est Sujet Association Unite Mission Transp Tact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionTranspTact()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionTranspTact;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionRensObj() <em>Est Sujet Association Unite Mission Rens Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionRensObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionRensObj;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMouvementParRoute() <em>Est Sujet Association Unite Mouvement Par Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMouvementParRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMouvementParRoute;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUnitePlanFeux() <em>Est Sujet Association Unite Plan Feux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUnitePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUnitePlanFeux;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionMelee() <em>Est Sujet Association Unite Mission Melee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionMelee()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionMelee;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionUniteAntichar() <em>Est Sujet Association Unite Mission Unite Antichar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionUniteAntichar()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionUniteAntichar;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationUniteMissionSic() <em>Est Sujet Association Unite Mission Sic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationUniteMissionSic()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationUniteMissionSic;

	/**
	 * The cached value of the '{@link #getBeneficieArticulationASS() <em>Beneficie Articulation ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficieArticulationASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> beneficieArticulationASS;

	/**
	 * The cached value of the '{@link #getEstFourniPourDetachementNonIdentifie() <em>Est Fourni Pour Detachement Non Identifie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstFourniPourDetachementNonIdentifie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estFourniPourDetachementNonIdentifie;

	/**
	 * The cached value of the '{@link #getACommeAutoriteGuidageConsigne() <em>AComme Autorite Guidage Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeAutoriteGuidageConsigne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeAutoriteGuidageConsigne;

	/**
	 * The cached value of the '{@link #getEstInteresseeParFaitRenseignement() <em>Est Interessee Par Fait Renseignement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstInteresseeParFaitRenseignement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estInteresseeParFaitRenseignement;

	/**
	 * The cached value of the '{@link #getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique() <em>APour Mesures Protection Electronique Mesures Protection Electronique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourMesuresProtectionElectroniqueMesuresProtectionElectronique;

	/**
	 * The cached value of the '{@link #getBeneficieDetachementNonIdentifie() <em>Beneficie Detachement Non Identifie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficieDetachementNonIdentifie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> beneficieDetachementNonIdentifie;

	/**
	 * The cached value of the '{@link #getEstAOrigineObservationObservation() <em>Est AOrigine Observation Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAOrigineObservationObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estAOrigineObservationObservation;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationProfilUnite() <em>Est Sujet Association Profil Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationProfilUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationProfilUnite;

	/**
	 * The cached value of the '{@link #getEstFourniPourArticulationASS() <em>Est Fourni Pour Articulation ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstFourniPourArticulationASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estFourniPourArticulationASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUniteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUnite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomFormelCourt() {
		return nomFormelCourt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomFormelCourt(String newNomFormelCourt) {
		String oldNomFormelCourt = nomFormelCourt;
		nomFormelCourt = newNomFormelCourt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__NOM_FORMEL_COURT, oldNomFormelCourt, nomFormelCourt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModele() {
		return modele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModele(boolean newModele) {
		boolean oldModele = modele;
		modele = newModele;
		boolean oldModeleESet = modeleESet;
		modeleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__MODELE, oldModele, modele, !oldModeleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModele() {
		boolean oldModele = modele;
		boolean oldModeleESet = modeleESet;
		modele = MODELE_EDEFAULT;
		modeleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE__MODELE, oldModele, MODELE_EDEFAULT, oldModeleESet));
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
	public EList<TypeCaracteristiquesSIO> getEstEquipeDuSIOCaracteristiquesSIO() {
		if (estEquipeDuSIOCaracteristiquesSIO == null) {
			estEquipeDuSIOCaracteristiquesSIO = new EObjectContainmentEList<TypeCaracteristiquesSIO>(TypeCaracteristiquesSIO.class, this, SchemaPackage.TYPE_UNITE__EST_EQUIPE_DU_SIO_CARACTERISTIQUES_SIO);
		}
		return estEquipeDuSIOCaracteristiquesSIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteRenforcementsFeux() {
		if (estSujetAssociationUniteRenforcementsFeux == null) {
			estSujetAssociationUniteRenforcementsFeux = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX);
		}
		return estSujetAssociationUniteRenforcementsFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourSituationEquipementSituationEquipement() {
		if (aPourSituationEquipementSituationEquipement == null) {
			aPourSituationEquipementSituationEquipement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EQUIPEMENT_SITUATION_EQUIPEMENT);
		}
		return aPourSituationEquipementSituationEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourSituationConsommableSituationConsommable() {
		if (aPourSituationConsommableSituationConsommable == null) {
			aPourSituationConsommableSituationConsommable = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__APOUR_SITUATION_CONSOMMABLE_SITUATION_CONSOMMABLE);
		}
		return aPourSituationConsommableSituationConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourSituationEffectifSituationEffectif() {
		if (aPourSituationEffectifSituationEffectif == null) {
			aPourSituationEffectifSituationEffectif = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EFFECTIF_SITUATION_EFFECTIF);
		}
		return aPourSituationEffectifSituationEffectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCalendrierCourrier> getCalendrierCourrierCalendrierCourrier() {
		if (calendrierCourrierCalendrierCourrier == null) {
			calendrierCourrierCalendrierCourrier = new EObjectContainmentEList<TypeCalendrierCourrier>(TypeCalendrierCourrier.class, this, SchemaPackage.TYPE_UNITE__CALENDRIER_COURRIER_CALENDRIER_COURRIER);
		}
		return calendrierCourrierCalendrierCourrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatSic> getEtatDuSicEtatSic() {
		if (etatDuSicEtatSic == null) {
			etatDuSicEtatSic = new EObjectContainmentEList<TypeEtatSic>(TypeEtatSic.class, this, SchemaPackage.TYPE_UNITE__ETAT_DU_SIC_ETAT_SIC);
		}
		return etatDuSicEtatSic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvenement4D> getEvenement4DEvenement4D() {
		if (evenement4DEvenement4D == null) {
			evenement4DEvenement4D = new EObjectContainmentEList<TypeEvenement4D>(TypeEvenement4D.class, this, SchemaPackage.TYPE_UNITE__EVENEMENT4_DEVENEMENT4_D);
		}
		return evenement4DEvenement4D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyenCommunication> getMoyensCommunicationMoyenCommunication() {
		if (moyensCommunicationMoyenCommunication == null) {
			moyensCommunicationMoyenCommunication = new EObjectContainmentEList<TypeMoyenCommunication>(TypeMoyenCommunication.class, this, SchemaPackage.TYPE_UNITE__MOYENS_COMMUNICATION_MOYEN_COMMUNICATION);
		}
		return moyensCommunicationMoyenCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAzimut getAPourDirectionObservationAzimut() {
		return aPourDirectionObservationAzimut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDirectionObservationAzimut(TypeAzimut newAPourDirectionObservationAzimut, NotificationChain msgs) {
		TypeAzimut oldAPourDirectionObservationAzimut = aPourDirectionObservationAzimut;
		aPourDirectionObservationAzimut = newAPourDirectionObservationAzimut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_DIRECTION_OBSERVATION_AZIMUT, oldAPourDirectionObservationAzimut, newAPourDirectionObservationAzimut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDirectionObservationAzimut(TypeAzimut newAPourDirectionObservationAzimut) {
		if (newAPourDirectionObservationAzimut != aPourDirectionObservationAzimut) {
			NotificationChain msgs = null;
			if (aPourDirectionObservationAzimut != null)
				msgs = ((InternalEObject)aPourDirectionObservationAzimut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_DIRECTION_OBSERVATION_AZIMUT, null, msgs);
			if (newAPourDirectionObservationAzimut != null)
				msgs = ((InternalEObject)newAPourDirectionObservationAzimut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_DIRECTION_OBSERVATION_AZIMUT, null, msgs);
			msgs = basicSetAPourDirectionObservationAzimut(newAPourDirectionObservationAzimut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_DIRECTION_OBSERVATION_AZIMUT, newAPourDirectionObservationAzimut, newAPourDirectionObservationAzimut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteElementENIDetruit> getReporteQuantiteElementENIDetruit() {
		if (reporteQuantiteElementENIDetruit == null) {
			reporteQuantiteElementENIDetruit = new EObjectContainmentEList<TypeQuantiteElementENIDetruit>(TypeQuantiteElementENIDetruit.class, this, SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_ELEMENT_ENI_DETRUIT);
		}
		return reporteQuantiteElementENIDetruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteMateriel> getReporteQuantiteMateriel() {
		if (reporteQuantiteMateriel == null) {
			reporteQuantiteMateriel = new EObjectContainmentEList<TypeQuantiteMateriel>(TypeQuantiteMateriel.class, this, SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_MATERIEL);
		}
		return reporteQuantiteMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvacuationSanitaire> getDemandeEvacuationSanitaire() {
		if (demandeEvacuationSanitaire == null) {
			demandeEvacuationSanitaire = new EObjectContainmentEList<TypeEvacuationSanitaire>(TypeEvacuationSanitaire.class, this, SchemaPackage.TYPE_UNITE__DEMANDE_EVACUATION_SANITAIRE);
		}
		return demandeEvacuationSanitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUnite4D getCaracteristiques4DUnite4D() {
		return caracteristiques4DUnite4D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracteristiques4DUnite4D(TypeUnite4D newCaracteristiques4DUnite4D, NotificationChain msgs) {
		TypeUnite4D oldCaracteristiques4DUnite4D = caracteristiques4DUnite4D;
		caracteristiques4DUnite4D = newCaracteristiques4DUnite4D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__CARACTERISTIQUES4_DUNITE4_D, oldCaracteristiques4DUnite4D, newCaracteristiques4DUnite4D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracteristiques4DUnite4D(TypeUnite4D newCaracteristiques4DUnite4D) {
		if (newCaracteristiques4DUnite4D != caracteristiques4DUnite4D) {
			NotificationChain msgs = null;
			if (caracteristiques4DUnite4D != null)
				msgs = ((InternalEObject)caracteristiques4DUnite4D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__CARACTERISTIQUES4_DUNITE4_D, null, msgs);
			if (newCaracteristiques4DUnite4D != null)
				msgs = ((InternalEObject)newCaracteristiques4DUnite4D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__CARACTERISTIQUES4_DUNITE4_D, null, msgs);
			msgs = basicSetCaracteristiques4DUnite4D(newCaracteristiques4DUnite4D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__CARACTERISTIQUES4_DUNITE4_D, newCaracteristiques4DUnite4D, newCaracteristiques4DUnite4D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourConsommableMajeurAssociationConsommableMajeur() {
		if (aPourConsommableMajeurAssociationConsommableMajeur == null) {
			aPourConsommableMajeurAssociationConsommableMajeur = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__APOUR_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR);
		}
		return aPourConsommableMajeurAssociationConsommableMajeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGroupement getFormeLeGroupementGroupement() {
		return formeLeGroupementGroupement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormeLeGroupementGroupement(TypeGroupement newFormeLeGroupementGroupement, NotificationChain msgs) {
		TypeGroupement oldFormeLeGroupementGroupement = formeLeGroupementGroupement;
		formeLeGroupementGroupement = newFormeLeGroupementGroupement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__FORME_LE_GROUPEMENT_GROUPEMENT, oldFormeLeGroupementGroupement, newFormeLeGroupementGroupement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormeLeGroupementGroupement(TypeGroupement newFormeLeGroupementGroupement) {
		if (newFormeLeGroupementGroupement != formeLeGroupementGroupement) {
			NotificationChain msgs = null;
			if (formeLeGroupementGroupement != null)
				msgs = ((InternalEObject)formeLeGroupementGroupement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__FORME_LE_GROUPEMENT_GROUPEMENT, null, msgs);
			if (newFormeLeGroupementGroupement != null)
				msgs = ((InternalEObject)newFormeLeGroupementGroupement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__FORME_LE_GROUPEMENT_GROUPEMENT, null, msgs);
			msgs = basicSetFormeLeGroupementGroupement(newFormeLeGroupementGroupement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__FORME_LE_GROUPEMENT_GROUPEMENT, newFormeLeGroupementGroupement, newFormeLeGroupementGroupement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneEchangeAutreElementControle() {
		return aPourZoneEchangeAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneEchangeAutreElementControle(TypeAssociation newAPourZoneEchangeAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneEchangeAutreElementControle = aPourZoneEchangeAutreElementControle;
		aPourZoneEchangeAutreElementControle = newAPourZoneEchangeAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_ZONE_ECHANGE_AUTRE_ELEMENT_CONTROLE, oldAPourZoneEchangeAutreElementControle, newAPourZoneEchangeAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneEchangeAutreElementControle(TypeAssociation newAPourZoneEchangeAutreElementControle) {
		if (newAPourZoneEchangeAutreElementControle != aPourZoneEchangeAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneEchangeAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneEchangeAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_ZONE_ECHANGE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneEchangeAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneEchangeAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_ZONE_ECHANGE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneEchangeAutreElementControle(newAPourZoneEchangeAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_ZONE_ECHANGE_AUTRE_ELEMENT_CONTROLE, newAPourZoneEchangeAutreElementControle, newAPourZoneEchangeAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstFourniPourPrelevementSubordonneNonIdentifie() {
		if (estFourniPourPrelevementSubordonneNonIdentifie == null) {
			estFourniPourPrelevementSubordonneNonIdentifie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE);
		}
		return estFourniPourPrelevementSubordonneNonIdentifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getBeneficiePrelevementSubordonneNonIdentifie() {
		if (beneficiePrelevementSubordonneNonIdentifie == null) {
			beneficiePrelevementSubordonneNonIdentifie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__BENEFICIE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE);
		}
		return beneficiePrelevementSubordonneNonIdentifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourActiviteActivitePosture() {
		if (aPourActiviteActivitePosture == null) {
			aPourActiviteActivitePosture = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__APOUR_ACTIVITE_ACTIVITE_POSTURE);
		}
		return aPourActiviteActivitePosture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCentreNC23 getAPourCaracteristiquesCentreNC23CentreNC23() {
		return aPourCaracteristiquesCentreNC23CentreNC23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesCentreNC23CentreNC23(TypeCentreNC23 newAPourCaracteristiquesCentreNC23CentreNC23, NotificationChain msgs) {
		TypeCentreNC23 oldAPourCaracteristiquesCentreNC23CentreNC23 = aPourCaracteristiquesCentreNC23CentreNC23;
		aPourCaracteristiquesCentreNC23CentreNC23 = newAPourCaracteristiquesCentreNC23CentreNC23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_NC23_CENTRE_NC23, oldAPourCaracteristiquesCentreNC23CentreNC23, newAPourCaracteristiquesCentreNC23CentreNC23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesCentreNC23CentreNC23(TypeCentreNC23 newAPourCaracteristiquesCentreNC23CentreNC23) {
		if (newAPourCaracteristiquesCentreNC23CentreNC23 != aPourCaracteristiquesCentreNC23CentreNC23) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesCentreNC23CentreNC23 != null)
				msgs = ((InternalEObject)aPourCaracteristiquesCentreNC23CentreNC23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_NC23_CENTRE_NC23, null, msgs);
			if (newAPourCaracteristiquesCentreNC23CentreNC23 != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesCentreNC23CentreNC23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_NC23_CENTRE_NC23, null, msgs);
			msgs = basicSetAPourCaracteristiquesCentreNC23CentreNC23(newAPourCaracteristiquesCentreNC23CentreNC23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_NC23_CENTRE_NC23, newAPourCaracteristiquesCentreNC23CentreNC23, newAPourCaracteristiquesCentreNC23CentreNC23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCentreLLAPI getAPourCaracteristiquesCentreLLAPICentreLLAPI() {
		return aPourCaracteristiquesCentreLLAPICentreLLAPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesCentreLLAPICentreLLAPI(TypeCentreLLAPI newAPourCaracteristiquesCentreLLAPICentreLLAPI, NotificationChain msgs) {
		TypeCentreLLAPI oldAPourCaracteristiquesCentreLLAPICentreLLAPI = aPourCaracteristiquesCentreLLAPICentreLLAPI;
		aPourCaracteristiquesCentreLLAPICentreLLAPI = newAPourCaracteristiquesCentreLLAPICentreLLAPI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_LLAPI_CENTRE_LLAPI, oldAPourCaracteristiquesCentreLLAPICentreLLAPI, newAPourCaracteristiquesCentreLLAPICentreLLAPI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesCentreLLAPICentreLLAPI(TypeCentreLLAPI newAPourCaracteristiquesCentreLLAPICentreLLAPI) {
		if (newAPourCaracteristiquesCentreLLAPICentreLLAPI != aPourCaracteristiquesCentreLLAPICentreLLAPI) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesCentreLLAPICentreLLAPI != null)
				msgs = ((InternalEObject)aPourCaracteristiquesCentreLLAPICentreLLAPI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_LLAPI_CENTRE_LLAPI, null, msgs);
			if (newAPourCaracteristiquesCentreLLAPICentreLLAPI != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesCentreLLAPICentreLLAPI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_LLAPI_CENTRE_LLAPI, null, msgs);
			msgs = basicSetAPourCaracteristiquesCentreLLAPICentreLLAPI(newAPourCaracteristiquesCentreLLAPICentreLLAPI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_LLAPI_CENTRE_LLAPI, newAPourCaracteristiquesCentreLLAPICentreLLAPI, newAPourCaracteristiquesCentreLLAPICentreLLAPI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeSituationDesStocksFaitParEntrepotAutreSite() {
		if (aCommeSituationDesStocksFaitParEntrepotAutreSite == null) {
			aCommeSituationDesStocksFaitParEntrepotAutreSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ENTREPOT_AUTRE_SITE);
		}
		return aCommeSituationDesStocksFaitParEntrepotAutreSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsommationExplosifs> getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs() {
		if (aCommeConsommationAutoriseeEnExplosifsConsommationExplosifs == null) {
			aCommeConsommationAutoriseeEnExplosifsConsommationExplosifs = new EObjectContainmentEList<TypeConsommationExplosifs>(TypeConsommationExplosifs.class, this, SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_EXPLOSIFS_CONSOMMATION_EXPLOSIFS);
		}
		return aCommeConsommationAutoriseeEnExplosifsConsommationExplosifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsommationMines> getACommeConsommationAutoriseeEnMinesConsommationMines() {
		if (aCommeConsommationAutoriseeEnMinesConsommationMines == null) {
			aCommeConsommationAutoriseeEnMinesConsommationMines = new EObjectContainmentEList<TypeConsommationMines>(TypeConsommationMines.class, this, SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_MINES_CONSOMMATION_MINES);
		}
		return aCommeConsommationAutoriseeEnMinesConsommationMines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSyntheseSante getAPourSyntheseSanteSyntheseSante() {
		return aPourSyntheseSanteSyntheseSante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSyntheseSanteSyntheseSante(TypeSyntheseSante newAPourSyntheseSanteSyntheseSante, NotificationChain msgs) {
		TypeSyntheseSante oldAPourSyntheseSanteSyntheseSante = aPourSyntheseSanteSyntheseSante;
		aPourSyntheseSanteSyntheseSante = newAPourSyntheseSanteSyntheseSante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_SYNTHESE_SANTE_SYNTHESE_SANTE, oldAPourSyntheseSanteSyntheseSante, newAPourSyntheseSanteSyntheseSante);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSyntheseSanteSyntheseSante(TypeSyntheseSante newAPourSyntheseSanteSyntheseSante) {
		if (newAPourSyntheseSanteSyntheseSante != aPourSyntheseSanteSyntheseSante) {
			NotificationChain msgs = null;
			if (aPourSyntheseSanteSyntheseSante != null)
				msgs = ((InternalEObject)aPourSyntheseSanteSyntheseSante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_SYNTHESE_SANTE_SYNTHESE_SANTE, null, msgs);
			if (newAPourSyntheseSanteSyntheseSante != null)
				msgs = ((InternalEObject)newAPourSyntheseSanteSyntheseSante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_SYNTHESE_SANTE_SYNTHESE_SANTE, null, msgs);
			msgs = basicSetAPourSyntheseSanteSyntheseSante(newAPourSyntheseSanteSyntheseSante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_SYNTHESE_SANTE_SYNTHESE_SANTE, newAPourSyntheseSanteSyntheseSante, newAPourSyntheseSanteSyntheseSante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEmetInterventionGenerale() {
		if (emetInterventionGenerale == null) {
			emetInterventionGenerale = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EMET_INTERVENTION_GENERALE);
		}
		return emetInterventionGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyenInvestigation> getACommeMoyenInvestigationMoyenInvestigation() {
		if (aCommeMoyenInvestigationMoyenInvestigation == null) {
			aCommeMoyenInvestigationMoyenInvestigation = new EObjectContainmentEList<TypeMoyenInvestigation>(TypeMoyenInvestigation.class, this, SchemaPackage.TYPE_UNITE__ACOMME_MOYEN_INVESTIGATION_MOYEN_INVESTIGATION);
		}
		return aCommeMoyenInvestigationMoyenInvestigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOrganismeControle getAPourCaracteristiquesOrganismeControleOrganismeControle() {
		return aPourCaracteristiquesOrganismeControleOrganismeControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesOrganismeControleOrganismeControle(TypeOrganismeControle newAPourCaracteristiquesOrganismeControleOrganismeControle, NotificationChain msgs) {
		TypeOrganismeControle oldAPourCaracteristiquesOrganismeControleOrganismeControle = aPourCaracteristiquesOrganismeControleOrganismeControle;
		aPourCaracteristiquesOrganismeControleOrganismeControle = newAPourCaracteristiquesOrganismeControleOrganismeControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_ORGANISME_CONTROLE_ORGANISME_CONTROLE, oldAPourCaracteristiquesOrganismeControleOrganismeControle, newAPourCaracteristiquesOrganismeControleOrganismeControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesOrganismeControleOrganismeControle(TypeOrganismeControle newAPourCaracteristiquesOrganismeControleOrganismeControle) {
		if (newAPourCaracteristiquesOrganismeControleOrganismeControle != aPourCaracteristiquesOrganismeControleOrganismeControle) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesOrganismeControleOrganismeControle != null)
				msgs = ((InternalEObject)aPourCaracteristiquesOrganismeControleOrganismeControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_ORGANISME_CONTROLE_ORGANISME_CONTROLE, null, msgs);
			if (newAPourCaracteristiquesOrganismeControleOrganismeControle != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesOrganismeControleOrganismeControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_ORGANISME_CONTROLE_ORGANISME_CONTROLE, null, msgs);
			msgs = basicSetAPourCaracteristiquesOrganismeControleOrganismeControle(newAPourCaracteristiquesOrganismeControleOrganismeControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_ORGANISME_CONTROLE_ORGANISME_CONTROLE, newAPourCaracteristiquesOrganismeControleOrganismeControle, newAPourCaracteristiquesOrganismeControleOrganismeControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique() {
		if (aCommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique == null) {
			aCommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ZONE_LOGISTIQUE_ZONE_LOGISTIQUE);
		}
		return aCommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUniteLogistique getAPourCaracteristiquesLogistiquesUniteLogistique() {
		return aPourCaracteristiquesLogistiquesUniteLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesLogistiquesUniteLogistique(TypeUniteLogistique newAPourCaracteristiquesLogistiquesUniteLogistique, NotificationChain msgs) {
		TypeUniteLogistique oldAPourCaracteristiquesLogistiquesUniteLogistique = aPourCaracteristiquesLogistiquesUniteLogistique;
		aPourCaracteristiquesLogistiquesUniteLogistique = newAPourCaracteristiquesLogistiquesUniteLogistique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_LOGISTIQUES_UNITE_LOGISTIQUE, oldAPourCaracteristiquesLogistiquesUniteLogistique, newAPourCaracteristiquesLogistiquesUniteLogistique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesLogistiquesUniteLogistique(TypeUniteLogistique newAPourCaracteristiquesLogistiquesUniteLogistique) {
		if (newAPourCaracteristiquesLogistiquesUniteLogistique != aPourCaracteristiquesLogistiquesUniteLogistique) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesLogistiquesUniteLogistique != null)
				msgs = ((InternalEObject)aPourCaracteristiquesLogistiquesUniteLogistique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_LOGISTIQUES_UNITE_LOGISTIQUE, null, msgs);
			if (newAPourCaracteristiquesLogistiquesUniteLogistique != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesLogistiquesUniteLogistique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_LOGISTIQUES_UNITE_LOGISTIQUE, null, msgs);
			msgs = basicSetAPourCaracteristiquesLogistiquesUniteLogistique(newAPourCaracteristiquesLogistiquesUniteLogistique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_LOGISTIQUES_UNITE_LOGISTIQUE, newAPourCaracteristiquesLogistiquesUniteLogistique, newAPourCaracteristiquesLogistiquesUniteLogistique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUniteMaintenance getAPourCaracteristiquesMaintenanceUniteMaintenance() {
		return aPourCaracteristiquesMaintenanceUniteMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesMaintenanceUniteMaintenance(TypeUniteMaintenance newAPourCaracteristiquesMaintenanceUniteMaintenance, NotificationChain msgs) {
		TypeUniteMaintenance oldAPourCaracteristiquesMaintenanceUniteMaintenance = aPourCaracteristiquesMaintenanceUniteMaintenance;
		aPourCaracteristiquesMaintenanceUniteMaintenance = newAPourCaracteristiquesMaintenanceUniteMaintenance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_MAINTENANCE_UNITE_MAINTENANCE, oldAPourCaracteristiquesMaintenanceUniteMaintenance, newAPourCaracteristiquesMaintenanceUniteMaintenance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesMaintenanceUniteMaintenance(TypeUniteMaintenance newAPourCaracteristiquesMaintenanceUniteMaintenance) {
		if (newAPourCaracteristiquesMaintenanceUniteMaintenance != aPourCaracteristiquesMaintenanceUniteMaintenance) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesMaintenanceUniteMaintenance != null)
				msgs = ((InternalEObject)aPourCaracteristiquesMaintenanceUniteMaintenance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_MAINTENANCE_UNITE_MAINTENANCE, null, msgs);
			if (newAPourCaracteristiquesMaintenanceUniteMaintenance != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesMaintenanceUniteMaintenance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_MAINTENANCE_UNITE_MAINTENANCE, null, msgs);
			msgs = basicSetAPourCaracteristiquesMaintenanceUniteMaintenance(newAPourCaracteristiquesMaintenanceUniteMaintenance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_MAINTENANCE_UNITE_MAINTENANCE, newAPourCaracteristiquesMaintenanceUniteMaintenance, newAPourCaracteristiquesMaintenanceUniteMaintenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUniteASS getAPourCaracteristiquesUniteASSUniteASS() {
		return aPourCaracteristiquesUniteASSUniteASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesUniteASSUniteASS(TypeUniteASS newAPourCaracteristiquesUniteASSUniteASS, NotificationChain msgs) {
		TypeUniteASS oldAPourCaracteristiquesUniteASSUniteASS = aPourCaracteristiquesUniteASSUniteASS;
		aPourCaracteristiquesUniteASSUniteASS = newAPourCaracteristiquesUniteASSUniteASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_ASS_UNITE_ASS, oldAPourCaracteristiquesUniteASSUniteASS, newAPourCaracteristiquesUniteASSUniteASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesUniteASSUniteASS(TypeUniteASS newAPourCaracteristiquesUniteASSUniteASS) {
		if (newAPourCaracteristiquesUniteASSUniteASS != aPourCaracteristiquesUniteASSUniteASS) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesUniteASSUniteASS != null)
				msgs = ((InternalEObject)aPourCaracteristiquesUniteASSUniteASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_ASS_UNITE_ASS, null, msgs);
			if (newAPourCaracteristiquesUniteASSUniteASS != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesUniteASSUniteASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_ASS_UNITE_ASS, null, msgs);
			msgs = basicSetAPourCaracteristiquesUniteASSUniteASS(newAPourCaracteristiquesUniteASSUniteASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_ASS_UNITE_ASS, newAPourCaracteristiquesUniteASSUniteASS, newAPourCaracteristiquesUniteASSUniteASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUniteAir getAPourCaracteristiquesUniteAirUniteAir() {
		return aPourCaracteristiquesUniteAirUniteAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesUniteAirUniteAir(TypeUniteAir newAPourCaracteristiquesUniteAirUniteAir, NotificationChain msgs) {
		TypeUniteAir oldAPourCaracteristiquesUniteAirUniteAir = aPourCaracteristiquesUniteAirUniteAir;
		aPourCaracteristiquesUniteAirUniteAir = newAPourCaracteristiquesUniteAirUniteAir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_AIR_UNITE_AIR, oldAPourCaracteristiquesUniteAirUniteAir, newAPourCaracteristiquesUniteAirUniteAir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesUniteAirUniteAir(TypeUniteAir newAPourCaracteristiquesUniteAirUniteAir) {
		if (newAPourCaracteristiquesUniteAirUniteAir != aPourCaracteristiquesUniteAirUniteAir) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesUniteAirUniteAir != null)
				msgs = ((InternalEObject)aPourCaracteristiquesUniteAirUniteAir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_AIR_UNITE_AIR, null, msgs);
			if (newAPourCaracteristiquesUniteAirUniteAir != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesUniteAirUniteAir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_AIR_UNITE_AIR, null, msgs);
			msgs = basicSetAPourCaracteristiquesUniteAirUniteAir(newAPourCaracteristiquesUniteAirUniteAir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_AIR_UNITE_AIR, newAPourCaracteristiquesUniteAirUniteAir, newAPourCaracteristiquesUniteAirUniteAir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeUniteBeneficiaireMateriel> getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel() {
		if (aPourMaterielsGenieAllouesUniteBeneficiaireMateriel == null) {
			aPourMaterielsGenieAllouesUniteBeneficiaireMateriel = new EObjectContainmentEList<TypeUniteBeneficiaireMateriel>(TypeUniteBeneficiaireMateriel.class, this, SchemaPackage.TYPE_UNITE__APOUR_MATERIELS_GENIE_ALLOUES_UNITE_BENEFICIAIRE_MATERIEL);
		}
		return aPourMaterielsGenieAllouesUniteBeneficiaireMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourEquipementMajeurAssociationEquipementlMajeur() {
		if (aPourEquipementMajeurAssociationEquipementlMajeur == null) {
			aPourEquipementMajeurAssociationEquipementlMajeur = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__APOUR_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR);
		}
		return aPourEquipementMajeurAssociationEquipementlMajeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneResponsabiliteAutreElementControle() {
		return aPourZoneResponsabiliteAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneResponsabiliteAutreElementControle(TypeAssociation newAPourZoneResponsabiliteAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneResponsabiliteAutreElementControle = aPourZoneResponsabiliteAutreElementControle;
		aPourZoneResponsabiliteAutreElementControle = newAPourZoneResponsabiliteAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_ZONE_RESPONSABILITE_AUTRE_ELEMENT_CONTROLE, oldAPourZoneResponsabiliteAutreElementControle, newAPourZoneResponsabiliteAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneResponsabiliteAutreElementControle(TypeAssociation newAPourZoneResponsabiliteAutreElementControle) {
		if (newAPourZoneResponsabiliteAutreElementControle != aPourZoneResponsabiliteAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneResponsabiliteAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneResponsabiliteAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_ZONE_RESPONSABILITE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneResponsabiliteAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneResponsabiliteAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_ZONE_RESPONSABILITE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneResponsabiliteAutreElementControle(newAPourZoneResponsabiliteAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_ZONE_RESPONSABILITE_AUTRE_ELEMENT_CONTROLE, newAPourZoneResponsabiliteAutreElementControle, newAPourZoneResponsabiliteAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteLivraison() {
		if (estSujetAssociationUniteLivraison == null) {
			estSujetAssociationUniteLivraison = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_LIVRAISON);
		}
		return estSujetAssociationUniteLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionEscorteAF() {
		if (estSujetAssociationUniteMissionEscorteAF == null) {
			estSujetAssociationUniteMissionEscorteAF = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF);
		}
		return estSujetAssociationUniteMissionEscorteAF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteAutreMissionLog() {
		if (estSujetAssociationUniteAutreMissionLog == null) {
			estSujetAssociationUniteAutreMissionLog = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG);
		}
		return estSujetAssociationUniteAutreMissionLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionAir() {
		if (estSujetAssociationUniteMissionAir == null) {
			estSujetAssociationUniteMissionAir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AIR);
		}
		return estSujetAssociationUniteMissionAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionGenie() {
		if (estSujetAssociationUniteMissionGenie == null) {
			estSujetAssociationUniteMissionGenie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_GENIE);
		}
		return estSujetAssociationUniteMissionGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUnitePlanifOperation3D() {
		if (estSujetAssociationUnitePlanifOperation3D == null) {
			estSujetAssociationUnitePlanifOperation3D = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D);
		}
		return estSujetAssociationUnitePlanifOperation3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionAcqASS() {
		if (estSujetAssociationUniteMissionAcqASS == null) {
			estSujetAssociationUniteMissionAcqASS = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS);
		}
		return estSujetAssociationUniteMissionAcqASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionAerienne() {
		if (estSujetAssociationUniteMissionAerienne == null) {
			estSujetAssociationUniteMissionAerienne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AERIENNE);
		}
		return estSujetAssociationUniteMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionALATattaque() {
		if (estSujetAssociationUniteMissionALATattaque == null) {
			estSujetAssociationUniteMissionALATattaque = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE);
		}
		return estSujetAssociationUniteMissionALATattaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionASA() {
		if (estSujetAssociationUniteMissionASA == null) {
			estSujetAssociationUniteMissionASA = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ASA);
		}
		return estSujetAssociationUniteMissionASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteAppuiFeuHelicoptere() {
		if (estSujetAssociationUniteAppuiFeuHelicoptere == null) {
			estSujetAssociationUniteAppuiFeuHelicoptere = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE);
		}
		return estSujetAssociationUniteAppuiFeuHelicoptere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeZoneDiffusion getAPourZoneDiffusionZoneDiffusion() {
		return aPourZoneDiffusionZoneDiffusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneDiffusionZoneDiffusion(TypeZoneDiffusion newAPourZoneDiffusionZoneDiffusion, NotificationChain msgs) {
		TypeZoneDiffusion oldAPourZoneDiffusionZoneDiffusion = aPourZoneDiffusionZoneDiffusion;
		aPourZoneDiffusionZoneDiffusion = newAPourZoneDiffusionZoneDiffusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_ZONE_DIFFUSION_ZONE_DIFFUSION, oldAPourZoneDiffusionZoneDiffusion, newAPourZoneDiffusionZoneDiffusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneDiffusionZoneDiffusion(TypeZoneDiffusion newAPourZoneDiffusionZoneDiffusion) {
		if (newAPourZoneDiffusionZoneDiffusion != aPourZoneDiffusionZoneDiffusion) {
			NotificationChain msgs = null;
			if (aPourZoneDiffusionZoneDiffusion != null)
				msgs = ((InternalEObject)aPourZoneDiffusionZoneDiffusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_ZONE_DIFFUSION_ZONE_DIFFUSION, null, msgs);
			if (newAPourZoneDiffusionZoneDiffusion != null)
				msgs = ((InternalEObject)newAPourZoneDiffusionZoneDiffusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__APOUR_ZONE_DIFFUSION_ZONE_DIFFUSION, null, msgs);
			msgs = basicSetAPourZoneDiffusionZoneDiffusion(newAPourZoneDiffusionZoneDiffusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__APOUR_ZONE_DIFFUSION_ZONE_DIFFUSION, newAPourZoneDiffusionZoneDiffusion, newAPourZoneDiffusionZoneDiffusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionTranspTact() {
		if (estSujetAssociationUniteMissionTranspTact == null) {
			estSujetAssociationUniteMissionTranspTact = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT);
		}
		return estSujetAssociationUniteMissionTranspTact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionRensObj() {
		if (estSujetAssociationUniteMissionRensObj == null) {
			estSujetAssociationUniteMissionRensObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ);
		}
		return estSujetAssociationUniteMissionRensObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMouvementParRoute() {
		if (estSujetAssociationUniteMouvementParRoute == null) {
			estSujetAssociationUniteMouvementParRoute = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE);
		}
		return estSujetAssociationUniteMouvementParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUnitePlanFeux() {
		if (estSujetAssociationUnitePlanFeux == null) {
			estSujetAssociationUnitePlanFeux = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLAN_FEUX);
		}
		return estSujetAssociationUnitePlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionMelee() {
		if (estSujetAssociationUniteMissionMelee == null) {
			estSujetAssociationUniteMissionMelee = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_MELEE);
		}
		return estSujetAssociationUniteMissionMelee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionUniteAntichar() {
		if (estSujetAssociationUniteMissionUniteAntichar == null) {
			estSujetAssociationUniteMissionUniteAntichar = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR);
		}
		return estSujetAssociationUniteMissionUniteAntichar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationUniteMissionSic() {
		if (estSujetAssociationUniteMissionSic == null) {
			estSujetAssociationUniteMissionSic = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_SIC);
		}
		return estSujetAssociationUniteMissionSic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getBeneficieArticulationASS() {
		if (beneficieArticulationASS == null) {
			beneficieArticulationASS = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__BENEFICIE_ARTICULATION_ASS);
		}
		return beneficieArticulationASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstFourniPourDetachementNonIdentifie() {
		if (estFourniPourDetachementNonIdentifie == null) {
			estFourniPourDetachementNonIdentifie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_DETACHEMENT_NON_IDENTIFIE);
		}
		return estFourniPourDetachementNonIdentifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeAutoriteGuidageConsigne() {
		return aCommeAutoriteGuidageConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeAutoriteGuidageConsigne(TypeAssociation newACommeAutoriteGuidageConsigne, NotificationChain msgs) {
		TypeAssociation oldACommeAutoriteGuidageConsigne = aCommeAutoriteGuidageConsigne;
		aCommeAutoriteGuidageConsigne = newACommeAutoriteGuidageConsigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__ACOMME_AUTORITE_GUIDAGE_CONSIGNE, oldACommeAutoriteGuidageConsigne, newACommeAutoriteGuidageConsigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeAutoriteGuidageConsigne(TypeAssociation newACommeAutoriteGuidageConsigne) {
		if (newACommeAutoriteGuidageConsigne != aCommeAutoriteGuidageConsigne) {
			NotificationChain msgs = null;
			if (aCommeAutoriteGuidageConsigne != null)
				msgs = ((InternalEObject)aCommeAutoriteGuidageConsigne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__ACOMME_AUTORITE_GUIDAGE_CONSIGNE, null, msgs);
			if (newACommeAutoriteGuidageConsigne != null)
				msgs = ((InternalEObject)newACommeAutoriteGuidageConsigne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE__ACOMME_AUTORITE_GUIDAGE_CONSIGNE, null, msgs);
			msgs = basicSetACommeAutoriteGuidageConsigne(newACommeAutoriteGuidageConsigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE__ACOMME_AUTORITE_GUIDAGE_CONSIGNE, newACommeAutoriteGuidageConsigne, newACommeAutoriteGuidageConsigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstInteresseeParFaitRenseignement() {
		if (estInteresseeParFaitRenseignement == null) {
			estInteresseeParFaitRenseignement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_INTERESSEE_PAR_FAIT_RENSEIGNEMENT);
		}
		return estInteresseeParFaitRenseignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique() {
		if (aPourMesuresProtectionElectroniqueMesuresProtectionElectronique == null) {
			aPourMesuresProtectionElectroniqueMesuresProtectionElectronique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__APOUR_MESURES_PROTECTION_ELECTRONIQUE_MESURES_PROTECTION_ELECTRONIQUE);
		}
		return aPourMesuresProtectionElectroniqueMesuresProtectionElectronique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getBeneficieDetachementNonIdentifie() {
		if (beneficieDetachementNonIdentifie == null) {
			beneficieDetachementNonIdentifie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__BENEFICIE_DETACHEMENT_NON_IDENTIFIE);
		}
		return beneficieDetachementNonIdentifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstAOrigineObservationObservation() {
		if (estAOrigineObservationObservation == null) {
			estAOrigineObservationObservation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_AORIGINE_OBSERVATION_OBSERVATION);
		}
		return estAOrigineObservationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationProfilUnite() {
		if (estSujetAssociationProfilUnite == null) {
			estSujetAssociationProfilUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_PROFIL_UNITE);
		}
		return estSujetAssociationProfilUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstFourniPourArticulationASS() {
		if (estFourniPourArticulationASS == null) {
			estFourniPourArticulationASS = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_ARTICULATION_ASS);
		}
		return estFourniPourArticulationASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE__EST_EQUIPE_DU_SIO_CARACTERISTIQUES_SIO:
				return ((InternalEList<?>)getEstEquipeDuSIOCaracteristiquesSIO()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				return ((InternalEList<?>)getEstSujetAssociationUniteRenforcementsFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EQUIPEMENT_SITUATION_EQUIPEMENT:
				return ((InternalEList<?>)getAPourSituationEquipementSituationEquipement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_CONSOMMABLE_SITUATION_CONSOMMABLE:
				return ((InternalEList<?>)getAPourSituationConsommableSituationConsommable()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EFFECTIF_SITUATION_EFFECTIF:
				return ((InternalEList<?>)getAPourSituationEffectifSituationEffectif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__CALENDRIER_COURRIER_CALENDRIER_COURRIER:
				return ((InternalEList<?>)getCalendrierCourrierCalendrierCourrier()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__ETAT_DU_SIC_ETAT_SIC:
				return ((InternalEList<?>)getEtatDuSicEtatSic()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EVENEMENT4_DEVENEMENT4_D:
				return ((InternalEList<?>)getEvenement4DEvenement4D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__MOYENS_COMMUNICATION_MOYEN_COMMUNICATION:
				return ((InternalEList<?>)getMoyensCommunicationMoyenCommunication()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_DIRECTION_OBSERVATION_AZIMUT:
				return basicSetAPourDirectionObservationAzimut(null, msgs);
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_ELEMENT_ENI_DETRUIT:
				return ((InternalEList<?>)getReporteQuantiteElementENIDetruit()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_MATERIEL:
				return ((InternalEList<?>)getReporteQuantiteMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__DEMANDE_EVACUATION_SANITAIRE:
				return ((InternalEList<?>)getDemandeEvacuationSanitaire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__CARACTERISTIQUES4_DUNITE4_D:
				return basicSetCaracteristiques4DUnite4D(null, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				return ((InternalEList<?>)getAPourConsommableMajeurAssociationConsommableMajeur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__FORME_LE_GROUPEMENT_GROUPEMENT:
				return basicSetFormeLeGroupementGroupement(null, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_ECHANGE_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneEchangeAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				return ((InternalEList<?>)getEstFourniPourPrelevementSubordonneNonIdentifie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__BENEFICIE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				return ((InternalEList<?>)getBeneficiePrelevementSubordonneNonIdentifie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				return ((InternalEList<?>)getAPourActiviteActivitePosture()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_NC23_CENTRE_NC23:
				return basicSetAPourCaracteristiquesCentreNC23CentreNC23(null, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_LLAPI_CENTRE_LLAPI:
				return basicSetAPourCaracteristiquesCentreLLAPICentreLLAPI(null, msgs);
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ENTREPOT_AUTRE_SITE:
				return ((InternalEList<?>)getACommeSituationDesStocksFaitParEntrepotAutreSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_EXPLOSIFS_CONSOMMATION_EXPLOSIFS:
				return ((InternalEList<?>)getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_MINES_CONSOMMATION_MINES:
				return ((InternalEList<?>)getACommeConsommationAutoriseeEnMinesConsommationMines()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_SYNTHESE_SANTE_SYNTHESE_SANTE:
				return basicSetAPourSyntheseSanteSyntheseSante(null, msgs);
			case SchemaPackage.TYPE_UNITE__EMET_INTERVENTION_GENERALE:
				return ((InternalEList<?>)getEmetInterventionGenerale()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__ACOMME_MOYEN_INVESTIGATION_MOYEN_INVESTIGATION:
				return ((InternalEList<?>)getACommeMoyenInvestigationMoyenInvestigation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_ORGANISME_CONTROLE_ORGANISME_CONTROLE:
				return basicSetAPourCaracteristiquesOrganismeControleOrganismeControle(null, msgs);
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ZONE_LOGISTIQUE_ZONE_LOGISTIQUE:
				return ((InternalEList<?>)getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_LOGISTIQUES_UNITE_LOGISTIQUE:
				return basicSetAPourCaracteristiquesLogistiquesUniteLogistique(null, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_MAINTENANCE_UNITE_MAINTENANCE:
				return basicSetAPourCaracteristiquesMaintenanceUniteMaintenance(null, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_ASS_UNITE_ASS:
				return basicSetAPourCaracteristiquesUniteASSUniteASS(null, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_AIR_UNITE_AIR:
				return basicSetAPourCaracteristiquesUniteAirUniteAir(null, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_MATERIELS_GENIE_ALLOUES_UNITE_BENEFICIAIRE_MATERIEL:
				return ((InternalEList<?>)getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				return ((InternalEList<?>)getAPourEquipementMajeurAssociationEquipementlMajeur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_RESPONSABILITE_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneResponsabiliteAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_LIVRAISON:
				return ((InternalEList<?>)getEstSujetAssociationUniteLivraison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionEscorteAF()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				return ((InternalEList<?>)getEstSujetAssociationUniteAutreMissionLog()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AIR:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_GENIE:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				return ((InternalEList<?>)getEstSujetAssociationUnitePlanifOperation3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionAcqASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionALATattaque()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ASA:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				return ((InternalEList<?>)getEstSujetAssociationUniteAppuiFeuHelicoptere()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_DIFFUSION_ZONE_DIFFUSION:
				return basicSetAPourZoneDiffusionZoneDiffusion(null, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionTranspTact()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionRensObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getEstSujetAssociationUniteMouvementParRoute()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLAN_FEUX:
				return ((InternalEList<?>)getEstSujetAssociationUnitePlanFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_MELEE:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionMelee()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionUniteAntichar()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_SIC:
				return ((InternalEList<?>)getEstSujetAssociationUniteMissionSic()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__BENEFICIE_ARTICULATION_ASS:
				return ((InternalEList<?>)getBeneficieArticulationASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_DETACHEMENT_NON_IDENTIFIE:
				return ((InternalEList<?>)getEstFourniPourDetachementNonIdentifie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__ACOMME_AUTORITE_GUIDAGE_CONSIGNE:
				return basicSetACommeAutoriteGuidageConsigne(null, msgs);
			case SchemaPackage.TYPE_UNITE__EST_INTERESSEE_PAR_FAIT_RENSEIGNEMENT:
				return ((InternalEList<?>)getEstInteresseeParFaitRenseignement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__APOUR_MESURES_PROTECTION_ELECTRONIQUE_MESURES_PROTECTION_ELECTRONIQUE:
				return ((InternalEList<?>)getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__BENEFICIE_DETACHEMENT_NON_IDENTIFIE:
				return ((InternalEList<?>)getBeneficieDetachementNonIdentifie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_AORIGINE_OBSERVATION_OBSERVATION:
				return ((InternalEList<?>)getEstAOrigineObservationObservation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_PROFIL_UNITE:
				return ((InternalEList<?>)getEstSujetAssociationProfilUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_ARTICULATION_ASS:
				return ((InternalEList<?>)getEstFourniPourArticulationASS()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_UNITE__NOM_FORMEL_COURT:
				return getNomFormelCourt();
			case SchemaPackage.TYPE_UNITE__MODELE:
				return isModele() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_UNITE__EST_EQUIPE_DU_SIO_CARACTERISTIQUES_SIO:
				return getEstEquipeDuSIOCaracteristiquesSIO();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				return getEstSujetAssociationUniteRenforcementsFeux();
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EQUIPEMENT_SITUATION_EQUIPEMENT:
				return getAPourSituationEquipementSituationEquipement();
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_CONSOMMABLE_SITUATION_CONSOMMABLE:
				return getAPourSituationConsommableSituationConsommable();
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EFFECTIF_SITUATION_EFFECTIF:
				return getAPourSituationEffectifSituationEffectif();
			case SchemaPackage.TYPE_UNITE__CALENDRIER_COURRIER_CALENDRIER_COURRIER:
				return getCalendrierCourrierCalendrierCourrier();
			case SchemaPackage.TYPE_UNITE__ETAT_DU_SIC_ETAT_SIC:
				return getEtatDuSicEtatSic();
			case SchemaPackage.TYPE_UNITE__EVENEMENT4_DEVENEMENT4_D:
				return getEvenement4DEvenement4D();
			case SchemaPackage.TYPE_UNITE__MOYENS_COMMUNICATION_MOYEN_COMMUNICATION:
				return getMoyensCommunicationMoyenCommunication();
			case SchemaPackage.TYPE_UNITE__APOUR_DIRECTION_OBSERVATION_AZIMUT:
				return getAPourDirectionObservationAzimut();
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_ELEMENT_ENI_DETRUIT:
				return getReporteQuantiteElementENIDetruit();
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_MATERIEL:
				return getReporteQuantiteMateriel();
			case SchemaPackage.TYPE_UNITE__DEMANDE_EVACUATION_SANITAIRE:
				return getDemandeEvacuationSanitaire();
			case SchemaPackage.TYPE_UNITE__CARACTERISTIQUES4_DUNITE4_D:
				return getCaracteristiques4DUnite4D();
			case SchemaPackage.TYPE_UNITE__APOUR_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				return getAPourConsommableMajeurAssociationConsommableMajeur();
			case SchemaPackage.TYPE_UNITE__FORME_LE_GROUPEMENT_GROUPEMENT:
				return getFormeLeGroupementGroupement();
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_ECHANGE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneEchangeAutreElementControle();
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				return getEstFourniPourPrelevementSubordonneNonIdentifie();
			case SchemaPackage.TYPE_UNITE__BENEFICIE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				return getBeneficiePrelevementSubordonneNonIdentifie();
			case SchemaPackage.TYPE_UNITE__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				return getAPourActiviteActivitePosture();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_NC23_CENTRE_NC23:
				return getAPourCaracteristiquesCentreNC23CentreNC23();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_LLAPI_CENTRE_LLAPI:
				return getAPourCaracteristiquesCentreLLAPICentreLLAPI();
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ENTREPOT_AUTRE_SITE:
				return getACommeSituationDesStocksFaitParEntrepotAutreSite();
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_EXPLOSIFS_CONSOMMATION_EXPLOSIFS:
				return getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs();
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_MINES_CONSOMMATION_MINES:
				return getACommeConsommationAutoriseeEnMinesConsommationMines();
			case SchemaPackage.TYPE_UNITE__APOUR_SYNTHESE_SANTE_SYNTHESE_SANTE:
				return getAPourSyntheseSanteSyntheseSante();
			case SchemaPackage.TYPE_UNITE__EMET_INTERVENTION_GENERALE:
				return getEmetInterventionGenerale();
			case SchemaPackage.TYPE_UNITE__ACOMME_MOYEN_INVESTIGATION_MOYEN_INVESTIGATION:
				return getACommeMoyenInvestigationMoyenInvestigation();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_ORGANISME_CONTROLE_ORGANISME_CONTROLE:
				return getAPourCaracteristiquesOrganismeControleOrganismeControle();
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ZONE_LOGISTIQUE_ZONE_LOGISTIQUE:
				return getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_LOGISTIQUES_UNITE_LOGISTIQUE:
				return getAPourCaracteristiquesLogistiquesUniteLogistique();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_MAINTENANCE_UNITE_MAINTENANCE:
				return getAPourCaracteristiquesMaintenanceUniteMaintenance();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_ASS_UNITE_ASS:
				return getAPourCaracteristiquesUniteASSUniteASS();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_AIR_UNITE_AIR:
				return getAPourCaracteristiquesUniteAirUniteAir();
			case SchemaPackage.TYPE_UNITE__APOUR_MATERIELS_GENIE_ALLOUES_UNITE_BENEFICIAIRE_MATERIEL:
				return getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel();
			case SchemaPackage.TYPE_UNITE__APOUR_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				return getAPourEquipementMajeurAssociationEquipementlMajeur();
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_RESPONSABILITE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneResponsabiliteAutreElementControle();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_LIVRAISON:
				return getEstSujetAssociationUniteLivraison();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				return getEstSujetAssociationUniteMissionEscorteAF();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				return getEstSujetAssociationUniteAutreMissionLog();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AIR:
				return getEstSujetAssociationUniteMissionAir();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_GENIE:
				return getEstSujetAssociationUniteMissionGenie();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				return getEstSujetAssociationUnitePlanifOperation3D();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				return getEstSujetAssociationUniteMissionAcqASS();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				return getEstSujetAssociationUniteMissionAerienne();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				return getEstSujetAssociationUniteMissionALATattaque();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ASA:
				return getEstSujetAssociationUniteMissionASA();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				return getEstSujetAssociationUniteAppuiFeuHelicoptere();
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_DIFFUSION_ZONE_DIFFUSION:
				return getAPourZoneDiffusionZoneDiffusion();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				return getEstSujetAssociationUniteMissionTranspTact();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				return getEstSujetAssociationUniteMissionRensObj();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				return getEstSujetAssociationUniteMouvementParRoute();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLAN_FEUX:
				return getEstSujetAssociationUnitePlanFeux();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_MELEE:
				return getEstSujetAssociationUniteMissionMelee();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				return getEstSujetAssociationUniteMissionUniteAntichar();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_SIC:
				return getEstSujetAssociationUniteMissionSic();
			case SchemaPackage.TYPE_UNITE__BENEFICIE_ARTICULATION_ASS:
				return getBeneficieArticulationASS();
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_DETACHEMENT_NON_IDENTIFIE:
				return getEstFourniPourDetachementNonIdentifie();
			case SchemaPackage.TYPE_UNITE__ACOMME_AUTORITE_GUIDAGE_CONSIGNE:
				return getACommeAutoriteGuidageConsigne();
			case SchemaPackage.TYPE_UNITE__EST_INTERESSEE_PAR_FAIT_RENSEIGNEMENT:
				return getEstInteresseeParFaitRenseignement();
			case SchemaPackage.TYPE_UNITE__APOUR_MESURES_PROTECTION_ELECTRONIQUE_MESURES_PROTECTION_ELECTRONIQUE:
				return getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique();
			case SchemaPackage.TYPE_UNITE__BENEFICIE_DETACHEMENT_NON_IDENTIFIE:
				return getBeneficieDetachementNonIdentifie();
			case SchemaPackage.TYPE_UNITE__EST_AORIGINE_OBSERVATION_OBSERVATION:
				return getEstAOrigineObservationObservation();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_PROFIL_UNITE:
				return getEstSujetAssociationProfilUnite();
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_ARTICULATION_ASS:
				return getEstFourniPourArticulationASS();
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
			case SchemaPackage.TYPE_UNITE__NOM_FORMEL_COURT:
				setNomFormelCourt((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__MODELE:
				setModele(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_UNITE__EST_EQUIPE_DU_SIO_CARACTERISTIQUES_SIO:
				getEstEquipeDuSIOCaracteristiquesSIO().clear();
				getEstEquipeDuSIOCaracteristiquesSIO().addAll((Collection<? extends TypeCaracteristiquesSIO>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				getEstSujetAssociationUniteRenforcementsFeux().clear();
				getEstSujetAssociationUniteRenforcementsFeux().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EQUIPEMENT_SITUATION_EQUIPEMENT:
				getAPourSituationEquipementSituationEquipement().clear();
				getAPourSituationEquipementSituationEquipement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_CONSOMMABLE_SITUATION_CONSOMMABLE:
				getAPourSituationConsommableSituationConsommable().clear();
				getAPourSituationConsommableSituationConsommable().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EFFECTIF_SITUATION_EFFECTIF:
				getAPourSituationEffectifSituationEffectif().clear();
				getAPourSituationEffectifSituationEffectif().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__CALENDRIER_COURRIER_CALENDRIER_COURRIER:
				getCalendrierCourrierCalendrierCourrier().clear();
				getCalendrierCourrierCalendrierCourrier().addAll((Collection<? extends TypeCalendrierCourrier>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__ETAT_DU_SIC_ETAT_SIC:
				getEtatDuSicEtatSic().clear();
				getEtatDuSicEtatSic().addAll((Collection<? extends TypeEtatSic>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EVENEMENT4_DEVENEMENT4_D:
				getEvenement4DEvenement4D().clear();
				getEvenement4DEvenement4D().addAll((Collection<? extends TypeEvenement4D>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__MOYENS_COMMUNICATION_MOYEN_COMMUNICATION:
				getMoyensCommunicationMoyenCommunication().clear();
				getMoyensCommunicationMoyenCommunication().addAll((Collection<? extends TypeMoyenCommunication>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_DIRECTION_OBSERVATION_AZIMUT:
				setAPourDirectionObservationAzimut((TypeAzimut)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_ELEMENT_ENI_DETRUIT:
				getReporteQuantiteElementENIDetruit().clear();
				getReporteQuantiteElementENIDetruit().addAll((Collection<? extends TypeQuantiteElementENIDetruit>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_MATERIEL:
				getReporteQuantiteMateriel().clear();
				getReporteQuantiteMateriel().addAll((Collection<? extends TypeQuantiteMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__DEMANDE_EVACUATION_SANITAIRE:
				getDemandeEvacuationSanitaire().clear();
				getDemandeEvacuationSanitaire().addAll((Collection<? extends TypeEvacuationSanitaire>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__CARACTERISTIQUES4_DUNITE4_D:
				setCaracteristiques4DUnite4D((TypeUnite4D)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				getAPourConsommableMajeurAssociationConsommableMajeur().clear();
				getAPourConsommableMajeurAssociationConsommableMajeur().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__FORME_LE_GROUPEMENT_GROUPEMENT:
				setFormeLeGroupementGroupement((TypeGroupement)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_ECHANGE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneEchangeAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				getEstFourniPourPrelevementSubordonneNonIdentifie().clear();
				getEstFourniPourPrelevementSubordonneNonIdentifie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__BENEFICIE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				getBeneficiePrelevementSubordonneNonIdentifie().clear();
				getBeneficiePrelevementSubordonneNonIdentifie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				getAPourActiviteActivitePosture().clear();
				getAPourActiviteActivitePosture().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_NC23_CENTRE_NC23:
				setAPourCaracteristiquesCentreNC23CentreNC23((TypeCentreNC23)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_LLAPI_CENTRE_LLAPI:
				setAPourCaracteristiquesCentreLLAPICentreLLAPI((TypeCentreLLAPI)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ENTREPOT_AUTRE_SITE:
				getACommeSituationDesStocksFaitParEntrepotAutreSite().clear();
				getACommeSituationDesStocksFaitParEntrepotAutreSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_EXPLOSIFS_CONSOMMATION_EXPLOSIFS:
				getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs().clear();
				getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs().addAll((Collection<? extends TypeConsommationExplosifs>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_MINES_CONSOMMATION_MINES:
				getACommeConsommationAutoriseeEnMinesConsommationMines().clear();
				getACommeConsommationAutoriseeEnMinesConsommationMines().addAll((Collection<? extends TypeConsommationMines>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_SYNTHESE_SANTE_SYNTHESE_SANTE:
				setAPourSyntheseSanteSyntheseSante((TypeSyntheseSante)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EMET_INTERVENTION_GENERALE:
				getEmetInterventionGenerale().clear();
				getEmetInterventionGenerale().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_MOYEN_INVESTIGATION_MOYEN_INVESTIGATION:
				getACommeMoyenInvestigationMoyenInvestigation().clear();
				getACommeMoyenInvestigationMoyenInvestigation().addAll((Collection<? extends TypeMoyenInvestigation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_ORGANISME_CONTROLE_ORGANISME_CONTROLE:
				setAPourCaracteristiquesOrganismeControleOrganismeControle((TypeOrganismeControle)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ZONE_LOGISTIQUE_ZONE_LOGISTIQUE:
				getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique().clear();
				getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_LOGISTIQUES_UNITE_LOGISTIQUE:
				setAPourCaracteristiquesLogistiquesUniteLogistique((TypeUniteLogistique)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_MAINTENANCE_UNITE_MAINTENANCE:
				setAPourCaracteristiquesMaintenanceUniteMaintenance((TypeUniteMaintenance)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_ASS_UNITE_ASS:
				setAPourCaracteristiquesUniteASSUniteASS((TypeUniteASS)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_AIR_UNITE_AIR:
				setAPourCaracteristiquesUniteAirUniteAir((TypeUniteAir)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_MATERIELS_GENIE_ALLOUES_UNITE_BENEFICIAIRE_MATERIEL:
				getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel().clear();
				getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel().addAll((Collection<? extends TypeUniteBeneficiaireMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				getAPourEquipementMajeurAssociationEquipementlMajeur().clear();
				getAPourEquipementMajeurAssociationEquipementlMajeur().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_RESPONSABILITE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneResponsabiliteAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_LIVRAISON:
				getEstSujetAssociationUniteLivraison().clear();
				getEstSujetAssociationUniteLivraison().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				getEstSujetAssociationUniteMissionEscorteAF().clear();
				getEstSujetAssociationUniteMissionEscorteAF().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				getEstSujetAssociationUniteAutreMissionLog().clear();
				getEstSujetAssociationUniteAutreMissionLog().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AIR:
				getEstSujetAssociationUniteMissionAir().clear();
				getEstSujetAssociationUniteMissionAir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_GENIE:
				getEstSujetAssociationUniteMissionGenie().clear();
				getEstSujetAssociationUniteMissionGenie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				getEstSujetAssociationUnitePlanifOperation3D().clear();
				getEstSujetAssociationUnitePlanifOperation3D().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				getEstSujetAssociationUniteMissionAcqASS().clear();
				getEstSujetAssociationUniteMissionAcqASS().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				getEstSujetAssociationUniteMissionAerienne().clear();
				getEstSujetAssociationUniteMissionAerienne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				getEstSujetAssociationUniteMissionALATattaque().clear();
				getEstSujetAssociationUniteMissionALATattaque().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ASA:
				getEstSujetAssociationUniteMissionASA().clear();
				getEstSujetAssociationUniteMissionASA().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				getEstSujetAssociationUniteAppuiFeuHelicoptere().clear();
				getEstSujetAssociationUniteAppuiFeuHelicoptere().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_DIFFUSION_ZONE_DIFFUSION:
				setAPourZoneDiffusionZoneDiffusion((TypeZoneDiffusion)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				getEstSujetAssociationUniteMissionTranspTact().clear();
				getEstSujetAssociationUniteMissionTranspTact().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				getEstSujetAssociationUniteMissionRensObj().clear();
				getEstSujetAssociationUniteMissionRensObj().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				getEstSujetAssociationUniteMouvementParRoute().clear();
				getEstSujetAssociationUniteMouvementParRoute().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLAN_FEUX:
				getEstSujetAssociationUnitePlanFeux().clear();
				getEstSujetAssociationUnitePlanFeux().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_MELEE:
				getEstSujetAssociationUniteMissionMelee().clear();
				getEstSujetAssociationUniteMissionMelee().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				getEstSujetAssociationUniteMissionUniteAntichar().clear();
				getEstSujetAssociationUniteMissionUniteAntichar().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_SIC:
				getEstSujetAssociationUniteMissionSic().clear();
				getEstSujetAssociationUniteMissionSic().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__BENEFICIE_ARTICULATION_ASS:
				getBeneficieArticulationASS().clear();
				getBeneficieArticulationASS().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_DETACHEMENT_NON_IDENTIFIE:
				getEstFourniPourDetachementNonIdentifie().clear();
				getEstFourniPourDetachementNonIdentifie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_AUTORITE_GUIDAGE_CONSIGNE:
				setACommeAutoriteGuidageConsigne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_INTERESSEE_PAR_FAIT_RENSEIGNEMENT:
				getEstInteresseeParFaitRenseignement().clear();
				getEstInteresseeParFaitRenseignement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_MESURES_PROTECTION_ELECTRONIQUE_MESURES_PROTECTION_ELECTRONIQUE:
				getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique().clear();
				getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__BENEFICIE_DETACHEMENT_NON_IDENTIFIE:
				getBeneficieDetachementNonIdentifie().clear();
				getBeneficieDetachementNonIdentifie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_AORIGINE_OBSERVATION_OBSERVATION:
				getEstAOrigineObservationObservation().clear();
				getEstAOrigineObservationObservation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_PROFIL_UNITE:
				getEstSujetAssociationProfilUnite().clear();
				getEstSujetAssociationProfilUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_ARTICULATION_ASS:
				getEstFourniPourArticulationASS().clear();
				getEstFourniPourArticulationASS().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_UNITE__NOM_FORMEL_COURT:
				setNomFormelCourt(NOM_FORMEL_COURT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE__MODELE:
				unsetModele();
				return;
			case SchemaPackage.TYPE_UNITE__EST_EQUIPE_DU_SIO_CARACTERISTIQUES_SIO:
				getEstEquipeDuSIOCaracteristiquesSIO().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				getEstSujetAssociationUniteRenforcementsFeux().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EQUIPEMENT_SITUATION_EQUIPEMENT:
				getAPourSituationEquipementSituationEquipement().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_CONSOMMABLE_SITUATION_CONSOMMABLE:
				getAPourSituationConsommableSituationConsommable().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EFFECTIF_SITUATION_EFFECTIF:
				getAPourSituationEffectifSituationEffectif().clear();
				return;
			case SchemaPackage.TYPE_UNITE__CALENDRIER_COURRIER_CALENDRIER_COURRIER:
				getCalendrierCourrierCalendrierCourrier().clear();
				return;
			case SchemaPackage.TYPE_UNITE__ETAT_DU_SIC_ETAT_SIC:
				getEtatDuSicEtatSic().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EVENEMENT4_DEVENEMENT4_D:
				getEvenement4DEvenement4D().clear();
				return;
			case SchemaPackage.TYPE_UNITE__MOYENS_COMMUNICATION_MOYEN_COMMUNICATION:
				getMoyensCommunicationMoyenCommunication().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_DIRECTION_OBSERVATION_AZIMUT:
				setAPourDirectionObservationAzimut((TypeAzimut)null);
				return;
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_ELEMENT_ENI_DETRUIT:
				getReporteQuantiteElementENIDetruit().clear();
				return;
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_MATERIEL:
				getReporteQuantiteMateriel().clear();
				return;
			case SchemaPackage.TYPE_UNITE__DEMANDE_EVACUATION_SANITAIRE:
				getDemandeEvacuationSanitaire().clear();
				return;
			case SchemaPackage.TYPE_UNITE__CARACTERISTIQUES4_DUNITE4_D:
				setCaracteristiques4DUnite4D((TypeUnite4D)null);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				getAPourConsommableMajeurAssociationConsommableMajeur().clear();
				return;
			case SchemaPackage.TYPE_UNITE__FORME_LE_GROUPEMENT_GROUPEMENT:
				setFormeLeGroupementGroupement((TypeGroupement)null);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_ECHANGE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneEchangeAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				getEstFourniPourPrelevementSubordonneNonIdentifie().clear();
				return;
			case SchemaPackage.TYPE_UNITE__BENEFICIE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				getBeneficiePrelevementSubordonneNonIdentifie().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				getAPourActiviteActivitePosture().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_NC23_CENTRE_NC23:
				setAPourCaracteristiquesCentreNC23CentreNC23((TypeCentreNC23)null);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_LLAPI_CENTRE_LLAPI:
				setAPourCaracteristiquesCentreLLAPICentreLLAPI((TypeCentreLLAPI)null);
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ENTREPOT_AUTRE_SITE:
				getACommeSituationDesStocksFaitParEntrepotAutreSite().clear();
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_EXPLOSIFS_CONSOMMATION_EXPLOSIFS:
				getACommeConsommationAutoriseeEnExplosifsConsommationExplosifs().clear();
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_MINES_CONSOMMATION_MINES:
				getACommeConsommationAutoriseeEnMinesConsommationMines().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_SYNTHESE_SANTE_SYNTHESE_SANTE:
				setAPourSyntheseSanteSyntheseSante((TypeSyntheseSante)null);
				return;
			case SchemaPackage.TYPE_UNITE__EMET_INTERVENTION_GENERALE:
				getEmetInterventionGenerale().clear();
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_MOYEN_INVESTIGATION_MOYEN_INVESTIGATION:
				getACommeMoyenInvestigationMoyenInvestigation().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_ORGANISME_CONTROLE_ORGANISME_CONTROLE:
				setAPourCaracteristiquesOrganismeControleOrganismeControle((TypeOrganismeControle)null);
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ZONE_LOGISTIQUE_ZONE_LOGISTIQUE:
				getACommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_LOGISTIQUES_UNITE_LOGISTIQUE:
				setAPourCaracteristiquesLogistiquesUniteLogistique((TypeUniteLogistique)null);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_MAINTENANCE_UNITE_MAINTENANCE:
				setAPourCaracteristiquesMaintenanceUniteMaintenance((TypeUniteMaintenance)null);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_ASS_UNITE_ASS:
				setAPourCaracteristiquesUniteASSUniteASS((TypeUniteASS)null);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_AIR_UNITE_AIR:
				setAPourCaracteristiquesUniteAirUniteAir((TypeUniteAir)null);
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_MATERIELS_GENIE_ALLOUES_UNITE_BENEFICIAIRE_MATERIEL:
				getAPourMaterielsGenieAllouesUniteBeneficiaireMateriel().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				getAPourEquipementMajeurAssociationEquipementlMajeur().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_RESPONSABILITE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneResponsabiliteAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_LIVRAISON:
				getEstSujetAssociationUniteLivraison().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				getEstSujetAssociationUniteMissionEscorteAF().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				getEstSujetAssociationUniteAutreMissionLog().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AIR:
				getEstSujetAssociationUniteMissionAir().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_GENIE:
				getEstSujetAssociationUniteMissionGenie().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				getEstSujetAssociationUnitePlanifOperation3D().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				getEstSujetAssociationUniteMissionAcqASS().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				getEstSujetAssociationUniteMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				getEstSujetAssociationUniteMissionALATattaque().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ASA:
				getEstSujetAssociationUniteMissionASA().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				getEstSujetAssociationUniteAppuiFeuHelicoptere().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_DIFFUSION_ZONE_DIFFUSION:
				setAPourZoneDiffusionZoneDiffusion((TypeZoneDiffusion)null);
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				getEstSujetAssociationUniteMissionTranspTact().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				getEstSujetAssociationUniteMissionRensObj().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				getEstSujetAssociationUniteMouvementParRoute().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLAN_FEUX:
				getEstSujetAssociationUnitePlanFeux().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_MELEE:
				getEstSujetAssociationUniteMissionMelee().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				getEstSujetAssociationUniteMissionUniteAntichar().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_SIC:
				getEstSujetAssociationUniteMissionSic().clear();
				return;
			case SchemaPackage.TYPE_UNITE__BENEFICIE_ARTICULATION_ASS:
				getBeneficieArticulationASS().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_DETACHEMENT_NON_IDENTIFIE:
				getEstFourniPourDetachementNonIdentifie().clear();
				return;
			case SchemaPackage.TYPE_UNITE__ACOMME_AUTORITE_GUIDAGE_CONSIGNE:
				setACommeAutoriteGuidageConsigne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_UNITE__EST_INTERESSEE_PAR_FAIT_RENSEIGNEMENT:
				getEstInteresseeParFaitRenseignement().clear();
				return;
			case SchemaPackage.TYPE_UNITE__APOUR_MESURES_PROTECTION_ELECTRONIQUE_MESURES_PROTECTION_ELECTRONIQUE:
				getAPourMesuresProtectionElectroniqueMesuresProtectionElectronique().clear();
				return;
			case SchemaPackage.TYPE_UNITE__BENEFICIE_DETACHEMENT_NON_IDENTIFIE:
				getBeneficieDetachementNonIdentifie().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_AORIGINE_OBSERVATION_OBSERVATION:
				getEstAOrigineObservationObservation().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_PROFIL_UNITE:
				getEstSujetAssociationProfilUnite().clear();
				return;
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_ARTICULATION_ASS:
				getEstFourniPourArticulationASS().clear();
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
			case SchemaPackage.TYPE_UNITE__NOM_FORMEL_COURT:
				return NOM_FORMEL_COURT_EDEFAULT == null ? nomFormelCourt != null : !NOM_FORMEL_COURT_EDEFAULT.equals(nomFormelCourt);
			case SchemaPackage.TYPE_UNITE__MODELE:
				return isSetModele();
			case SchemaPackage.TYPE_UNITE__EST_EQUIPE_DU_SIO_CARACTERISTIQUES_SIO:
				return estEquipeDuSIOCaracteristiquesSIO != null && !estEquipeDuSIOCaracteristiquesSIO.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				return estSujetAssociationUniteRenforcementsFeux != null && !estSujetAssociationUniteRenforcementsFeux.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EQUIPEMENT_SITUATION_EQUIPEMENT:
				return aPourSituationEquipementSituationEquipement != null && !aPourSituationEquipementSituationEquipement.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_CONSOMMABLE_SITUATION_CONSOMMABLE:
				return aPourSituationConsommableSituationConsommable != null && !aPourSituationConsommableSituationConsommable.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_SITUATION_EFFECTIF_SITUATION_EFFECTIF:
				return aPourSituationEffectifSituationEffectif != null && !aPourSituationEffectifSituationEffectif.isEmpty();
			case SchemaPackage.TYPE_UNITE__CALENDRIER_COURRIER_CALENDRIER_COURRIER:
				return calendrierCourrierCalendrierCourrier != null && !calendrierCourrierCalendrierCourrier.isEmpty();
			case SchemaPackage.TYPE_UNITE__ETAT_DU_SIC_ETAT_SIC:
				return etatDuSicEtatSic != null && !etatDuSicEtatSic.isEmpty();
			case SchemaPackage.TYPE_UNITE__EVENEMENT4_DEVENEMENT4_D:
				return evenement4DEvenement4D != null && !evenement4DEvenement4D.isEmpty();
			case SchemaPackage.TYPE_UNITE__MOYENS_COMMUNICATION_MOYEN_COMMUNICATION:
				return moyensCommunicationMoyenCommunication != null && !moyensCommunicationMoyenCommunication.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_DIRECTION_OBSERVATION_AZIMUT:
				return aPourDirectionObservationAzimut != null;
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_ELEMENT_ENI_DETRUIT:
				return reporteQuantiteElementENIDetruit != null && !reporteQuantiteElementENIDetruit.isEmpty();
			case SchemaPackage.TYPE_UNITE__REPORTE_QUANTITE_MATERIEL:
				return reporteQuantiteMateriel != null && !reporteQuantiteMateriel.isEmpty();
			case SchemaPackage.TYPE_UNITE__DEMANDE_EVACUATION_SANITAIRE:
				return demandeEvacuationSanitaire != null && !demandeEvacuationSanitaire.isEmpty();
			case SchemaPackage.TYPE_UNITE__CARACTERISTIQUES4_DUNITE4_D:
				return caracteristiques4DUnite4D != null;
			case SchemaPackage.TYPE_UNITE__APOUR_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				return aPourConsommableMajeurAssociationConsommableMajeur != null && !aPourConsommableMajeurAssociationConsommableMajeur.isEmpty();
			case SchemaPackage.TYPE_UNITE__FORME_LE_GROUPEMENT_GROUPEMENT:
				return formeLeGroupementGroupement != null;
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_ECHANGE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneEchangeAutreElementControle != null;
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				return estFourniPourPrelevementSubordonneNonIdentifie != null && !estFourniPourPrelevementSubordonneNonIdentifie.isEmpty();
			case SchemaPackage.TYPE_UNITE__BENEFICIE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE:
				return beneficiePrelevementSubordonneNonIdentifie != null && !beneficiePrelevementSubordonneNonIdentifie.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				return aPourActiviteActivitePosture != null && !aPourActiviteActivitePosture.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_NC23_CENTRE_NC23:
				return aPourCaracteristiquesCentreNC23CentreNC23 != null;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_CENTRE_LLAPI_CENTRE_LLAPI:
				return aPourCaracteristiquesCentreLLAPICentreLLAPI != null;
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ENTREPOT_AUTRE_SITE:
				return aCommeSituationDesStocksFaitParEntrepotAutreSite != null && !aCommeSituationDesStocksFaitParEntrepotAutreSite.isEmpty();
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_EXPLOSIFS_CONSOMMATION_EXPLOSIFS:
				return aCommeConsommationAutoriseeEnExplosifsConsommationExplosifs != null && !aCommeConsommationAutoriseeEnExplosifsConsommationExplosifs.isEmpty();
			case SchemaPackage.TYPE_UNITE__ACOMME_CONSOMMATION_AUTORISEE_EN_MINES_CONSOMMATION_MINES:
				return aCommeConsommationAutoriseeEnMinesConsommationMines != null && !aCommeConsommationAutoriseeEnMinesConsommationMines.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_SYNTHESE_SANTE_SYNTHESE_SANTE:
				return aPourSyntheseSanteSyntheseSante != null;
			case SchemaPackage.TYPE_UNITE__EMET_INTERVENTION_GENERALE:
				return emetInterventionGenerale != null && !emetInterventionGenerale.isEmpty();
			case SchemaPackage.TYPE_UNITE__ACOMME_MOYEN_INVESTIGATION_MOYEN_INVESTIGATION:
				return aCommeMoyenInvestigationMoyenInvestigation != null && !aCommeMoyenInvestigationMoyenInvestigation.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_ORGANISME_CONTROLE_ORGANISME_CONTROLE:
				return aPourCaracteristiquesOrganismeControleOrganismeControle != null;
			case SchemaPackage.TYPE_UNITE__ACOMME_SITUATION_DES_STOCKS_FAIT_PAR_ZONE_LOGISTIQUE_ZONE_LOGISTIQUE:
				return aCommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique != null && !aCommeSituationDesStocksFaitParZoneLogistiqueZoneLogistique.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_LOGISTIQUES_UNITE_LOGISTIQUE:
				return aPourCaracteristiquesLogistiquesUniteLogistique != null;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_MAINTENANCE_UNITE_MAINTENANCE:
				return aPourCaracteristiquesMaintenanceUniteMaintenance != null;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_ASS_UNITE_ASS:
				return aPourCaracteristiquesUniteASSUniteASS != null;
			case SchemaPackage.TYPE_UNITE__APOUR_CARACTERISTIQUES_UNITE_AIR_UNITE_AIR:
				return aPourCaracteristiquesUniteAirUniteAir != null;
			case SchemaPackage.TYPE_UNITE__APOUR_MATERIELS_GENIE_ALLOUES_UNITE_BENEFICIAIRE_MATERIEL:
				return aPourMaterielsGenieAllouesUniteBeneficiaireMateriel != null && !aPourMaterielsGenieAllouesUniteBeneficiaireMateriel.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				return aPourEquipementMajeurAssociationEquipementlMajeur != null && !aPourEquipementMajeurAssociationEquipementlMajeur.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_RESPONSABILITE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneResponsabiliteAutreElementControle != null;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_LIVRAISON:
				return estSujetAssociationUniteLivraison != null && !estSujetAssociationUniteLivraison.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				return estSujetAssociationUniteMissionEscorteAF != null && !estSujetAssociationUniteMissionEscorteAF.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				return estSujetAssociationUniteAutreMissionLog != null && !estSujetAssociationUniteAutreMissionLog.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AIR:
				return estSujetAssociationUniteMissionAir != null && !estSujetAssociationUniteMissionAir.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_GENIE:
				return estSujetAssociationUniteMissionGenie != null && !estSujetAssociationUniteMissionGenie.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				return estSujetAssociationUnitePlanifOperation3D != null && !estSujetAssociationUnitePlanifOperation3D.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				return estSujetAssociationUniteMissionAcqASS != null && !estSujetAssociationUniteMissionAcqASS.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				return estSujetAssociationUniteMissionAerienne != null && !estSujetAssociationUniteMissionAerienne.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				return estSujetAssociationUniteMissionALATattaque != null && !estSujetAssociationUniteMissionALATattaque.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_ASA:
				return estSujetAssociationUniteMissionASA != null && !estSujetAssociationUniteMissionASA.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				return estSujetAssociationUniteAppuiFeuHelicoptere != null && !estSujetAssociationUniteAppuiFeuHelicoptere.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_ZONE_DIFFUSION_ZONE_DIFFUSION:
				return aPourZoneDiffusionZoneDiffusion != null;
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				return estSujetAssociationUniteMissionTranspTact != null && !estSujetAssociationUniteMissionTranspTact.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				return estSujetAssociationUniteMissionRensObj != null && !estSujetAssociationUniteMissionRensObj.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MOUVEMENT_PAR_ROUTE:
				return estSujetAssociationUniteMouvementParRoute != null && !estSujetAssociationUniteMouvementParRoute.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_PLAN_FEUX:
				return estSujetAssociationUnitePlanFeux != null && !estSujetAssociationUnitePlanFeux.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_MELEE:
				return estSujetAssociationUniteMissionMelee != null && !estSujetAssociationUniteMissionMelee.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				return estSujetAssociationUniteMissionUniteAntichar != null && !estSujetAssociationUniteMissionUniteAntichar.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_UNITE_MISSION_SIC:
				return estSujetAssociationUniteMissionSic != null && !estSujetAssociationUniteMissionSic.isEmpty();
			case SchemaPackage.TYPE_UNITE__BENEFICIE_ARTICULATION_ASS:
				return beneficieArticulationASS != null && !beneficieArticulationASS.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_DETACHEMENT_NON_IDENTIFIE:
				return estFourniPourDetachementNonIdentifie != null && !estFourniPourDetachementNonIdentifie.isEmpty();
			case SchemaPackage.TYPE_UNITE__ACOMME_AUTORITE_GUIDAGE_CONSIGNE:
				return aCommeAutoriteGuidageConsigne != null;
			case SchemaPackage.TYPE_UNITE__EST_INTERESSEE_PAR_FAIT_RENSEIGNEMENT:
				return estInteresseeParFaitRenseignement != null && !estInteresseeParFaitRenseignement.isEmpty();
			case SchemaPackage.TYPE_UNITE__APOUR_MESURES_PROTECTION_ELECTRONIQUE_MESURES_PROTECTION_ELECTRONIQUE:
				return aPourMesuresProtectionElectroniqueMesuresProtectionElectronique != null && !aPourMesuresProtectionElectroniqueMesuresProtectionElectronique.isEmpty();
			case SchemaPackage.TYPE_UNITE__BENEFICIE_DETACHEMENT_NON_IDENTIFIE:
				return beneficieDetachementNonIdentifie != null && !beneficieDetachementNonIdentifie.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_AORIGINE_OBSERVATION_OBSERVATION:
				return estAOrigineObservationObservation != null && !estAOrigineObservationObservation.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_SUJET_ASSOCIATION_PROFIL_UNITE:
				return estSujetAssociationProfilUnite != null && !estSujetAssociationProfilUnite.isEmpty();
			case SchemaPackage.TYPE_UNITE__EST_FOURNI_POUR_ARTICULATION_ASS:
				return estFourniPourArticulationASS != null && !estFourniPourArticulationASS.isEmpty();
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
		result.append(" (nomFormelCourt: ");
		result.append(nomFormelCourt);
		result.append(", modele: ");
		if (modeleESet) result.append(modele); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeUniteImpl
