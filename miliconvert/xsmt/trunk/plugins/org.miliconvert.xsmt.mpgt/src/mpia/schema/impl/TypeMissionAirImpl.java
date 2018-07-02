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
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAltitudePression;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeArmementMissionAppuiAerien;
import mpia.schema.TypeDictionaryDicoConfidentialiteOTAN;
import mpia.schema.TypeDictionaryDicoMissionAirCategorie;
import mpia.schema.TypeDictionaryDicoMissionAirIndicateurMissionResiduel;
import mpia.schema.TypeDictionaryDicoMissionAppuiAerienButMission;
import mpia.schema.TypeDictionaryDicoMissionAppuiAerienEchelleImage;
import mpia.schema.TypeDictionaryDicoMissionAppuiAerienMoyenLivraison;
import mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeCR;
import mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeCopie;
import mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeMission;
import mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien;
import mpia.schema.TypeDictionaryDicoMissionAppuiAerienVueSenseur;
import mpia.schema.TypeMissionAir;
import mpia.schema.TypePhaseMissionAppuiAerien;
import mpia.schema.TypeRessourceActiviteType;
import mpia.schema.TypeTacheAppuiAerien;

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
 * An implementation of the model object '<em><b>Type Mission Air</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getNumeroMission <em>Numero Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getTypeMission <em>Type Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getNumeroMissionGroupement <em>Numero Mission Groupement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAdresseLivraison <em>Adresse Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAltitudeAGL <em>Altitude AGL</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAltitudeObjectif <em>Altitude Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAutoriteDemandant <em>Autorite Demandant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getButMission <em>But Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getCommentaireDetails <em>Commentaire Details</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getConfidentialiteOTAN <em>Confidentialite OTAN</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getDateLivraison <em>Date Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getDateRenseignement <em>Date Renseignement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getEchelleImage <em>Echelle Image</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getIndicateurMissionResiduel <em>Indicateur Mission Residuel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getMoyenLivraison <em>Moyen Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getNombreCopies <em>Nombre Copies</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getNoSerieDemande <em>No Serie Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getNumeroEvenement <em>Numero Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getNumeroPontAerien <em>Numero Pont Aerien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getSignalAppelGroupement <em>Signal Appel Groupement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getTypeCopie <em>Type Copie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getTypeCR <em>Type CR</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getTypeSecondaireMission <em>Type Secondaire Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getTypeSenseurAerien <em>Type Senseur Aerien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getValeurEchelle <em>Valeur Echelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getVueSenseur <em>Vue Senseur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getEstObjetAssociationPlanificationOperation3DMissionAir <em>Est Objet Association Planification Operation3 DMission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAPourGroupementUnite <em>APour Groupement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAPourAdresseAdresse <em>APour Adresse Adresse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAPourArmementsArmementMissionAppuiAerien <em>APour Armements Armement Mission Appui Aerien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAPourPhasesPhaseMissionAppuiAerien <em>APour Phases Phase Mission Appui Aerien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAPourTachesTacheAppuiAerien <em>APour Taches Tache Appui Aerien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAPourTypeRessourceRessourceActiviteType <em>APour Type Ressource Ressource Activite Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getEstObjetAssociationUniteMissionAir <em>Est Objet Association Unite Mission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getEstObjetAssociationPersonneMissionAir <em>Est Objet Association Personne Mission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAPourPointsRecuperationAutreElementControle <em>APour Points Recuperation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAirImpl#getAPourPointDepartAutreElementControle <em>APour Point Depart Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionAirImpl extends TypeMissionImpl implements TypeMissionAir {
	/**
	 * The default value of the '{@link #getNumeroMission() <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMission()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroMission() <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMission()
	 * @generated
	 * @ordered
	 */
	protected String numeroMission = NUMERO_MISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAirCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoMissionAirCategorie.AIR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAirCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getTypeMission() <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMission()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAppuiAerienTypeMission TYPE_MISSION_EDEFAULT = TypeDictionaryDicoMissionAppuiAerienTypeMission.ADMLF;

	/**
	 * The cached value of the '{@link #getTypeMission() <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMission()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAppuiAerienTypeMission typeMission = TYPE_MISSION_EDEFAULT;

	/**
	 * This is true if the Type Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionESet;

	/**
	 * The default value of the '{@link #getNumeroMissionGroupement() <em>Numero Mission Groupement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMissionGroupement()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_MISSION_GROUPEMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroMissionGroupement() <em>Numero Mission Groupement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMissionGroupement()
	 * @generated
	 * @ordered
	 */
	protected long numeroMissionGroupement = NUMERO_MISSION_GROUPEMENT_EDEFAULT;

	/**
	 * This is true if the Numero Mission Groupement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroMissionGroupementESet;

	/**
	 * The default value of the '{@link #getAdresseLivraison() <em>Adresse Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseLivraison()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_LIVRAISON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresseLivraison() <em>Adresse Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseLivraison()
	 * @generated
	 * @ordered
	 */
	protected String adresseLivraison = ADRESSE_LIVRAISON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAltitudeAGL() <em>Altitude AGL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeAGL()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAltitudePression altitudeAGL;

	/**
	 * The cached value of the '{@link #getAltitudeObjectif() <em>Altitude Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAltitudePression altitudeObjectif;

	/**
	 * The default value of the '{@link #getAutoriteDemandant() <em>Autorite Demandant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoriteDemandant()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTORITE_DEMANDANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoriteDemandant() <em>Autorite Demandant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoriteDemandant()
	 * @generated
	 * @ordered
	 */
	protected String autoriteDemandant = AUTORITE_DEMANDANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getButMission() <em>But Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButMission()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAppuiAerienButMission BUT_MISSION_EDEFAULT = TypeDictionaryDicoMissionAppuiAerienButMission.C;

	/**
	 * The cached value of the '{@link #getButMission() <em>But Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButMission()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAppuiAerienButMission butMission = BUT_MISSION_EDEFAULT;

	/**
	 * This is true if the But Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean butMissionESet;

	/**
	 * The default value of the '{@link #getCommentaireDetails() <em>Commentaire Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireDetails() <em>Commentaire Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireDetails()
	 * @generated
	 * @ordered
	 */
	protected String commentaireDetails = COMMENTAIRE_DETAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentialiteOTAN() <em>Confidentialite OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialiteOTAN()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConfidentialiteOTAN CONFIDENTIALITE_OTAN_EDEFAULT = TypeDictionaryDicoConfidentialiteOTAN.NU;

	/**
	 * The cached value of the '{@link #getConfidentialiteOTAN() <em>Confidentialite OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialiteOTAN()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConfidentialiteOTAN confidentialiteOTAN = CONFIDENTIALITE_OTAN_EDEFAULT;

	/**
	 * This is true if the Confidentialite OTAN attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confidentialiteOTANESet;

	/**
	 * The default value of the '{@link #getDateLivraison() <em>Date Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLivraison()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_LIVRAISON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLivraison() <em>Date Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLivraison()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateLivraison = DATE_LIVRAISON_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateRenseignement() <em>Date Renseignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRenseignement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_RENSEIGNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateRenseignement() <em>Date Renseignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRenseignement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateRenseignement = DATE_RENSEIGNEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEchelleImage() <em>Echelle Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelleImage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAppuiAerienEchelleImage ECHELLE_IMAGE_EDEFAULT = TypeDictionaryDicoMissionAppuiAerienEchelleImage.BEPOS;

	/**
	 * The cached value of the '{@link #getEchelleImage() <em>Echelle Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelleImage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAppuiAerienEchelleImage echelleImage = ECHELLE_IMAGE_EDEFAULT;

	/**
	 * This is true if the Echelle Image attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelleImageESet;

	/**
	 * The default value of the '{@link #getIndicateurMissionResiduel() <em>Indicateur Mission Residuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicateurMissionResiduel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAirIndicateurMissionResiduel INDICATEUR_MISSION_RESIDUEL_EDEFAULT = TypeDictionaryDicoMissionAirIndicateurMissionResiduel.F;

	/**
	 * The cached value of the '{@link #getIndicateurMissionResiduel() <em>Indicateur Mission Residuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicateurMissionResiduel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAirIndicateurMissionResiduel indicateurMissionResiduel = INDICATEUR_MISSION_RESIDUEL_EDEFAULT;

	/**
	 * This is true if the Indicateur Mission Residuel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indicateurMissionResiduelESet;

	/**
	 * The default value of the '{@link #getMoyenLivraison() <em>Moyen Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenLivraison()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAppuiAerienMoyenLivraison MOYEN_LIVRAISON_EDEFAULT = TypeDictionaryDicoMissionAppuiAerienMoyenLivraison.ADPMODEMLINK;

	/**
	 * The cached value of the '{@link #getMoyenLivraison() <em>Moyen Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenLivraison()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAppuiAerienMoyenLivraison moyenLivraison = MOYEN_LIVRAISON_EDEFAULT;

	/**
	 * This is true if the Moyen Livraison attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyenLivraisonESet;

	/**
	 * The default value of the '{@link #getNombreCopies() <em>Nombre Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCopies()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_COPIES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreCopies() <em>Nombre Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCopies()
	 * @generated
	 * @ordered
	 */
	protected long nombreCopies = NOMBRE_COPIES_EDEFAULT;

	/**
	 * This is true if the Nombre Copies attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreCopiesESet;

	/**
	 * The default value of the '{@link #getNoSerieDemande() <em>No Serie Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSerieDemande()
	 * @generated
	 * @ordered
	 */
	protected static final long NO_SERIE_DEMANDE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNoSerieDemande() <em>No Serie Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSerieDemande()
	 * @generated
	 * @ordered
	 */
	protected long noSerieDemande = NO_SERIE_DEMANDE_EDEFAULT;

	/**
	 * This is true if the No Serie Demande attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noSerieDemandeESet;

	/**
	 * The default value of the '{@link #getNumeroEvenement() <em>Numero Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEvenement()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_EVENEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroEvenement() <em>Numero Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEvenement()
	 * @generated
	 * @ordered
	 */
	protected String numeroEvenement = NUMERO_EVENEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroPontAerien() <em>Numero Pont Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPontAerien()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_PONT_AERIEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroPontAerien() <em>Numero Pont Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPontAerien()
	 * @generated
	 * @ordered
	 */
	protected String numeroPontAerien = NUMERO_PONT_AERIEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalAppelGroupement() <em>Signal Appel Groupement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalAppelGroupement()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_APPEL_GROUPEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalAppelGroupement() <em>Signal Appel Groupement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalAppelGroupement()
	 * @generated
	 * @ordered
	 */
	protected String signalAppelGroupement = SIGNAL_APPEL_GROUPEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeCopie() <em>Type Copie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCopie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAppuiAerienTypeCopie TYPE_COPIE_EDEFAULT = TypeDictionaryDicoMissionAppuiAerienTypeCopie.NOS;

	/**
	 * The cached value of the '{@link #getTypeCopie() <em>Type Copie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCopie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAppuiAerienTypeCopie typeCopie = TYPE_COPIE_EDEFAULT;

	/**
	 * This is true if the Type Copie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCopieESet;

	/**
	 * The default value of the '{@link #getTypeCR() <em>Type CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCR()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAppuiAerienTypeCR TYPE_CR_EDEFAULT = TypeDictionaryDicoMissionAppuiAerienTypeCR.INFLIGHTREP;

	/**
	 * The cached value of the '{@link #getTypeCR() <em>Type CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCR()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAppuiAerienTypeCR typeCR = TYPE_CR_EDEFAULT;

	/**
	 * This is true if the Type CR attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCRESet;

	/**
	 * The default value of the '{@link #getTypeSecondaireMission() <em>Type Secondaire Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSecondaireMission()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAppuiAerienTypeMission TYPE_SECONDAIRE_MISSION_EDEFAULT = TypeDictionaryDicoMissionAppuiAerienTypeMission.ADMLF;

	/**
	 * The cached value of the '{@link #getTypeSecondaireMission() <em>Type Secondaire Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSecondaireMission()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAppuiAerienTypeMission typeSecondaireMission = TYPE_SECONDAIRE_MISSION_EDEFAULT;

	/**
	 * This is true if the Type Secondaire Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeSecondaireMissionESet;

	/**
	 * The default value of the '{@link #getTypeSenseurAerien() <em>Type Senseur Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSenseurAerien()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien TYPE_SENSEUR_AERIEN_EDEFAULT = TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien.BEST;

	/**
	 * The cached value of the '{@link #getTypeSenseurAerien() <em>Type Senseur Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSenseurAerien()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien typeSenseurAerien = TYPE_SENSEUR_AERIEN_EDEFAULT;

	/**
	 * This is true if the Type Senseur Aerien attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeSenseurAerienESet;

	/**
	 * The default value of the '{@link #getValeurEchelle() <em>Valeur Echelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurEchelle()
	 * @generated
	 * @ordered
	 */
	protected static final long VALEUR_ECHELLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValeurEchelle() <em>Valeur Echelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurEchelle()
	 * @generated
	 * @ordered
	 */
	protected long valeurEchelle = VALEUR_ECHELLE_EDEFAULT;

	/**
	 * This is true if the Valeur Echelle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeurEchelleESet;

	/**
	 * The default value of the '{@link #getVueSenseur() <em>Vue Senseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVueSenseur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAppuiAerienVueSenseur VUE_SENSEUR_EDEFAULT = TypeDictionaryDicoMissionAppuiAerienVueSenseur.FWD;

	/**
	 * The cached value of the '{@link #getVueSenseur() <em>Vue Senseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVueSenseur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAppuiAerienVueSenseur vueSenseur = VUE_SENSEUR_EDEFAULT;

	/**
	 * This is true if the Vue Senseur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vueSenseurESet;

	/**
	 * The cached value of the '{@link #getAPourUniteExecutanteUnite() <em>APour Unite Executante Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteExecutanteUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteExecutanteUnite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPlanificationOperation3DMissionAir() <em>Est Objet Association Planification Operation3 DMission Air</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPlanificationOperation3DMissionAir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPlanificationOperation3DMissionAir;

	/**
	 * The cached value of the '{@link #getAPourGroupementUnite() <em>APour Groupement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourGroupementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourGroupementUnite;

	/**
	 * The cached value of the '{@link #getAPourAdresseAdresse() <em>APour Adresse Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAdresseAdresse()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourAdresseAdresse;

	/**
	 * The cached value of the '{@link #getAPourArmementsArmementMissionAppuiAerien() <em>APour Armements Armement Mission Appui Aerien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourArmementsArmementMissionAppuiAerien()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArmementMissionAppuiAerien> aPourArmementsArmementMissionAppuiAerien;

	/**
	 * The cached value of the '{@link #getAPourPhasesPhaseMissionAppuiAerien() <em>APour Phases Phase Mission Appui Aerien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPhasesPhaseMissionAppuiAerien()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePhaseMissionAppuiAerien> aPourPhasesPhaseMissionAppuiAerien;

	/**
	 * The cached value of the '{@link #getAPourTachesTacheAppuiAerien() <em>APour Taches Tache Appui Aerien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTachesTacheAppuiAerien()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTacheAppuiAerien> aPourTachesTacheAppuiAerien;

	/**
	 * The cached value of the '{@link #getAPourTypeRessourceRessourceActiviteType() <em>APour Type Ressource Ressource Activite Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeRessourceRessourceActiviteType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceActiviteType> aPourTypeRessourceRessourceActiviteType;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionAir() <em>Est Objet Association Unite Mission Air</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionAir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionAir;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPersonneMissionAir() <em>Est Objet Association Personne Mission Air</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPersonneMissionAir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPersonneMissionAir;

	/**
	 * The cached value of the '{@link #getAPourPointsRecuperationAutreElementControle() <em>APour Points Recuperation Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPointsRecuperationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourPointsRecuperationAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourPointDepartAutreElementControle() <em>APour Point Depart Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPointDepartAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourPointDepartAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionAirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionAir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroMission() {
		return numeroMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroMission(String newNumeroMission) {
		String oldNumeroMission = numeroMission;
		numeroMission = newNumeroMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION, oldNumeroMission, numeroMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAirCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoMissionAirCategorie newCategorie) {
		TypeDictionaryDicoMissionAirCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoMissionAirCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoMissionAppuiAerienTypeMission getTypeMission() {
		return typeMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMission(TypeDictionaryDicoMissionAppuiAerienTypeMission newTypeMission) {
		TypeDictionaryDicoMissionAppuiAerienTypeMission oldTypeMission = typeMission;
		typeMission = newTypeMission == null ? TYPE_MISSION_EDEFAULT : newTypeMission;
		boolean oldTypeMissionESet = typeMissionESet;
		typeMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__TYPE_MISSION, oldTypeMission, typeMission, !oldTypeMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMission() {
		TypeDictionaryDicoMissionAppuiAerienTypeMission oldTypeMission = typeMission;
		boolean oldTypeMissionESet = typeMissionESet;
		typeMission = TYPE_MISSION_EDEFAULT;
		typeMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__TYPE_MISSION, oldTypeMission, TYPE_MISSION_EDEFAULT, oldTypeMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMission() {
		return typeMissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroMissionGroupement() {
		return numeroMissionGroupement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroMissionGroupement(long newNumeroMissionGroupement) {
		long oldNumeroMissionGroupement = numeroMissionGroupement;
		numeroMissionGroupement = newNumeroMissionGroupement;
		boolean oldNumeroMissionGroupementESet = numeroMissionGroupementESet;
		numeroMissionGroupementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION_GROUPEMENT, oldNumeroMissionGroupement, numeroMissionGroupement, !oldNumeroMissionGroupementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroMissionGroupement() {
		long oldNumeroMissionGroupement = numeroMissionGroupement;
		boolean oldNumeroMissionGroupementESet = numeroMissionGroupementESet;
		numeroMissionGroupement = NUMERO_MISSION_GROUPEMENT_EDEFAULT;
		numeroMissionGroupementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION_GROUPEMENT, oldNumeroMissionGroupement, NUMERO_MISSION_GROUPEMENT_EDEFAULT, oldNumeroMissionGroupementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroMissionGroupement() {
		return numeroMissionGroupementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresseLivraison(String newAdresseLivraison) {
		String oldAdresseLivraison = adresseLivraison;
		adresseLivraison = newAdresseLivraison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__ADRESSE_LIVRAISON, oldAdresseLivraison, adresseLivraison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAltitudePression getAltitudeAGL() {
		return altitudeAGL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeAGL(TypeDataTypeAltitudePression newAltitudeAGL, NotificationChain msgs) {
		TypeDataTypeAltitudePression oldAltitudeAGL = altitudeAGL;
		altitudeAGL = newAltitudeAGL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_AGL, oldAltitudeAGL, newAltitudeAGL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeAGL(TypeDataTypeAltitudePression newAltitudeAGL) {
		if (newAltitudeAGL != altitudeAGL) {
			NotificationChain msgs = null;
			if (altitudeAGL != null)
				msgs = ((InternalEObject)altitudeAGL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_AGL, null, msgs);
			if (newAltitudeAGL != null)
				msgs = ((InternalEObject)newAltitudeAGL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_AGL, null, msgs);
			msgs = basicSetAltitudeAGL(newAltitudeAGL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_AGL, newAltitudeAGL, newAltitudeAGL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAltitudePression getAltitudeObjectif() {
		return altitudeObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeObjectif(TypeDataTypeAltitudePression newAltitudeObjectif, NotificationChain msgs) {
		TypeDataTypeAltitudePression oldAltitudeObjectif = altitudeObjectif;
		altitudeObjectif = newAltitudeObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_OBJECTIF, oldAltitudeObjectif, newAltitudeObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeObjectif(TypeDataTypeAltitudePression newAltitudeObjectif) {
		if (newAltitudeObjectif != altitudeObjectif) {
			NotificationChain msgs = null;
			if (altitudeObjectif != null)
				msgs = ((InternalEObject)altitudeObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_OBJECTIF, null, msgs);
			if (newAltitudeObjectif != null)
				msgs = ((InternalEObject)newAltitudeObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_OBJECTIF, null, msgs);
			msgs = basicSetAltitudeObjectif(newAltitudeObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_OBJECTIF, newAltitudeObjectif, newAltitudeObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoriteDemandant() {
		return autoriteDemandant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoriteDemandant(String newAutoriteDemandant) {
		String oldAutoriteDemandant = autoriteDemandant;
		autoriteDemandant = newAutoriteDemandant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__AUTORITE_DEMANDANT, oldAutoriteDemandant, autoriteDemandant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAppuiAerienButMission getButMission() {
		return butMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButMission(TypeDictionaryDicoMissionAppuiAerienButMission newButMission) {
		TypeDictionaryDicoMissionAppuiAerienButMission oldButMission = butMission;
		butMission = newButMission == null ? BUT_MISSION_EDEFAULT : newButMission;
		boolean oldButMissionESet = butMissionESet;
		butMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__BUT_MISSION, oldButMission, butMission, !oldButMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetButMission() {
		TypeDictionaryDicoMissionAppuiAerienButMission oldButMission = butMission;
		boolean oldButMissionESet = butMissionESet;
		butMission = BUT_MISSION_EDEFAULT;
		butMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__BUT_MISSION, oldButMission, BUT_MISSION_EDEFAULT, oldButMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetButMission() {
		return butMissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireDetails() {
		return commentaireDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireDetails(String newCommentaireDetails) {
		String oldCommentaireDetails = commentaireDetails;
		commentaireDetails = newCommentaireDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__COMMENTAIRE_DETAILS, oldCommentaireDetails, commentaireDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConfidentialiteOTAN getConfidentialiteOTAN() {
		return confidentialiteOTAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentialiteOTAN(TypeDictionaryDicoConfidentialiteOTAN newConfidentialiteOTAN) {
		TypeDictionaryDicoConfidentialiteOTAN oldConfidentialiteOTAN = confidentialiteOTAN;
		confidentialiteOTAN = newConfidentialiteOTAN == null ? CONFIDENTIALITE_OTAN_EDEFAULT : newConfidentialiteOTAN;
		boolean oldConfidentialiteOTANESet = confidentialiteOTANESet;
		confidentialiteOTANESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__CONFIDENTIALITE_OTAN, oldConfidentialiteOTAN, confidentialiteOTAN, !oldConfidentialiteOTANESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfidentialiteOTAN() {
		TypeDictionaryDicoConfidentialiteOTAN oldConfidentialiteOTAN = confidentialiteOTAN;
		boolean oldConfidentialiteOTANESet = confidentialiteOTANESet;
		confidentialiteOTAN = CONFIDENTIALITE_OTAN_EDEFAULT;
		confidentialiteOTANESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__CONFIDENTIALITE_OTAN, oldConfidentialiteOTAN, CONFIDENTIALITE_OTAN_EDEFAULT, oldConfidentialiteOTANESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfidentialiteOTAN() {
		return confidentialiteOTANESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateLivraison() {
		return dateLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLivraison(XMLGregorianCalendar newDateLivraison) {
		XMLGregorianCalendar oldDateLivraison = dateLivraison;
		dateLivraison = newDateLivraison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__DATE_LIVRAISON, oldDateLivraison, dateLivraison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateRenseignement() {
		return dateRenseignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateRenseignement(XMLGregorianCalendar newDateRenseignement) {
		XMLGregorianCalendar oldDateRenseignement = dateRenseignement;
		dateRenseignement = newDateRenseignement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__DATE_RENSEIGNEMENT, oldDateRenseignement, dateRenseignement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAppuiAerienEchelleImage getEchelleImage() {
		return echelleImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelleImage(TypeDictionaryDicoMissionAppuiAerienEchelleImage newEchelleImage) {
		TypeDictionaryDicoMissionAppuiAerienEchelleImage oldEchelleImage = echelleImage;
		echelleImage = newEchelleImage == null ? ECHELLE_IMAGE_EDEFAULT : newEchelleImage;
		boolean oldEchelleImageESet = echelleImageESet;
		echelleImageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__ECHELLE_IMAGE, oldEchelleImage, echelleImage, !oldEchelleImageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelleImage() {
		TypeDictionaryDicoMissionAppuiAerienEchelleImage oldEchelleImage = echelleImage;
		boolean oldEchelleImageESet = echelleImageESet;
		echelleImage = ECHELLE_IMAGE_EDEFAULT;
		echelleImageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__ECHELLE_IMAGE, oldEchelleImage, ECHELLE_IMAGE_EDEFAULT, oldEchelleImageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelleImage() {
		return echelleImageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAirIndicateurMissionResiduel getIndicateurMissionResiduel() {
		return indicateurMissionResiduel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicateurMissionResiduel(TypeDictionaryDicoMissionAirIndicateurMissionResiduel newIndicateurMissionResiduel) {
		TypeDictionaryDicoMissionAirIndicateurMissionResiduel oldIndicateurMissionResiduel = indicateurMissionResiduel;
		indicateurMissionResiduel = newIndicateurMissionResiduel == null ? INDICATEUR_MISSION_RESIDUEL_EDEFAULT : newIndicateurMissionResiduel;
		boolean oldIndicateurMissionResiduelESet = indicateurMissionResiduelESet;
		indicateurMissionResiduelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__INDICATEUR_MISSION_RESIDUEL, oldIndicateurMissionResiduel, indicateurMissionResiduel, !oldIndicateurMissionResiduelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndicateurMissionResiduel() {
		TypeDictionaryDicoMissionAirIndicateurMissionResiduel oldIndicateurMissionResiduel = indicateurMissionResiduel;
		boolean oldIndicateurMissionResiduelESet = indicateurMissionResiduelESet;
		indicateurMissionResiduel = INDICATEUR_MISSION_RESIDUEL_EDEFAULT;
		indicateurMissionResiduelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__INDICATEUR_MISSION_RESIDUEL, oldIndicateurMissionResiduel, INDICATEUR_MISSION_RESIDUEL_EDEFAULT, oldIndicateurMissionResiduelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndicateurMissionResiduel() {
		return indicateurMissionResiduelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAppuiAerienMoyenLivraison getMoyenLivraison() {
		return moyenLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenLivraison(TypeDictionaryDicoMissionAppuiAerienMoyenLivraison newMoyenLivraison) {
		TypeDictionaryDicoMissionAppuiAerienMoyenLivraison oldMoyenLivraison = moyenLivraison;
		moyenLivraison = newMoyenLivraison == null ? MOYEN_LIVRAISON_EDEFAULT : newMoyenLivraison;
		boolean oldMoyenLivraisonESet = moyenLivraisonESet;
		moyenLivraisonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__MOYEN_LIVRAISON, oldMoyenLivraison, moyenLivraison, !oldMoyenLivraisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyenLivraison() {
		TypeDictionaryDicoMissionAppuiAerienMoyenLivraison oldMoyenLivraison = moyenLivraison;
		boolean oldMoyenLivraisonESet = moyenLivraisonESet;
		moyenLivraison = MOYEN_LIVRAISON_EDEFAULT;
		moyenLivraisonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__MOYEN_LIVRAISON, oldMoyenLivraison, MOYEN_LIVRAISON_EDEFAULT, oldMoyenLivraisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyenLivraison() {
		return moyenLivraisonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreCopies() {
		return nombreCopies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreCopies(long newNombreCopies) {
		long oldNombreCopies = nombreCopies;
		nombreCopies = newNombreCopies;
		boolean oldNombreCopiesESet = nombreCopiesESet;
		nombreCopiesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__NOMBRE_COPIES, oldNombreCopies, nombreCopies, !oldNombreCopiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreCopies() {
		long oldNombreCopies = nombreCopies;
		boolean oldNombreCopiesESet = nombreCopiesESet;
		nombreCopies = NOMBRE_COPIES_EDEFAULT;
		nombreCopiesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__NOMBRE_COPIES, oldNombreCopies, NOMBRE_COPIES_EDEFAULT, oldNombreCopiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreCopies() {
		return nombreCopiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNoSerieDemande() {
		return noSerieDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoSerieDemande(long newNoSerieDemande) {
		long oldNoSerieDemande = noSerieDemande;
		noSerieDemande = newNoSerieDemande;
		boolean oldNoSerieDemandeESet = noSerieDemandeESet;
		noSerieDemandeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__NO_SERIE_DEMANDE, oldNoSerieDemande, noSerieDemande, !oldNoSerieDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNoSerieDemande() {
		long oldNoSerieDemande = noSerieDemande;
		boolean oldNoSerieDemandeESet = noSerieDemandeESet;
		noSerieDemande = NO_SERIE_DEMANDE_EDEFAULT;
		noSerieDemandeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__NO_SERIE_DEMANDE, oldNoSerieDemande, NO_SERIE_DEMANDE_EDEFAULT, oldNoSerieDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNoSerieDemande() {
		return noSerieDemandeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroEvenement() {
		return numeroEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroEvenement(String newNumeroEvenement) {
		String oldNumeroEvenement = numeroEvenement;
		numeroEvenement = newNumeroEvenement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__NUMERO_EVENEMENT, oldNumeroEvenement, numeroEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroPontAerien() {
		return numeroPontAerien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPontAerien(String newNumeroPontAerien) {
		String oldNumeroPontAerien = numeroPontAerien;
		numeroPontAerien = newNumeroPontAerien;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__NUMERO_PONT_AERIEN, oldNumeroPontAerien, numeroPontAerien));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignalAppelGroupement() {
		return signalAppelGroupement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalAppelGroupement(String newSignalAppelGroupement) {
		String oldSignalAppelGroupement = signalAppelGroupement;
		signalAppelGroupement = newSignalAppelGroupement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__SIGNAL_APPEL_GROUPEMENT, oldSignalAppelGroupement, signalAppelGroupement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAppuiAerienTypeCopie getTypeCopie() {
		return typeCopie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCopie(TypeDictionaryDicoMissionAppuiAerienTypeCopie newTypeCopie) {
		TypeDictionaryDicoMissionAppuiAerienTypeCopie oldTypeCopie = typeCopie;
		typeCopie = newTypeCopie == null ? TYPE_COPIE_EDEFAULT : newTypeCopie;
		boolean oldTypeCopieESet = typeCopieESet;
		typeCopieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__TYPE_COPIE, oldTypeCopie, typeCopie, !oldTypeCopieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCopie() {
		TypeDictionaryDicoMissionAppuiAerienTypeCopie oldTypeCopie = typeCopie;
		boolean oldTypeCopieESet = typeCopieESet;
		typeCopie = TYPE_COPIE_EDEFAULT;
		typeCopieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__TYPE_COPIE, oldTypeCopie, TYPE_COPIE_EDEFAULT, oldTypeCopieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCopie() {
		return typeCopieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAppuiAerienTypeCR getTypeCR() {
		return typeCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCR(TypeDictionaryDicoMissionAppuiAerienTypeCR newTypeCR) {
		TypeDictionaryDicoMissionAppuiAerienTypeCR oldTypeCR = typeCR;
		typeCR = newTypeCR == null ? TYPE_CR_EDEFAULT : newTypeCR;
		boolean oldTypeCRESet = typeCRESet;
		typeCRESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__TYPE_CR, oldTypeCR, typeCR, !oldTypeCRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCR() {
		TypeDictionaryDicoMissionAppuiAerienTypeCR oldTypeCR = typeCR;
		boolean oldTypeCRESet = typeCRESet;
		typeCR = TYPE_CR_EDEFAULT;
		typeCRESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__TYPE_CR, oldTypeCR, TYPE_CR_EDEFAULT, oldTypeCRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCR() {
		return typeCRESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAppuiAerienTypeMission getTypeSecondaireMission() {
		return typeSecondaireMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSecondaireMission(TypeDictionaryDicoMissionAppuiAerienTypeMission newTypeSecondaireMission) {
		TypeDictionaryDicoMissionAppuiAerienTypeMission oldTypeSecondaireMission = typeSecondaireMission;
		typeSecondaireMission = newTypeSecondaireMission == null ? TYPE_SECONDAIRE_MISSION_EDEFAULT : newTypeSecondaireMission;
		boolean oldTypeSecondaireMissionESet = typeSecondaireMissionESet;
		typeSecondaireMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__TYPE_SECONDAIRE_MISSION, oldTypeSecondaireMission, typeSecondaireMission, !oldTypeSecondaireMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeSecondaireMission() {
		TypeDictionaryDicoMissionAppuiAerienTypeMission oldTypeSecondaireMission = typeSecondaireMission;
		boolean oldTypeSecondaireMissionESet = typeSecondaireMissionESet;
		typeSecondaireMission = TYPE_SECONDAIRE_MISSION_EDEFAULT;
		typeSecondaireMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__TYPE_SECONDAIRE_MISSION, oldTypeSecondaireMission, TYPE_SECONDAIRE_MISSION_EDEFAULT, oldTypeSecondaireMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeSecondaireMission() {
		return typeSecondaireMissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien getTypeSenseurAerien() {
		return typeSenseurAerien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSenseurAerien(TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien newTypeSenseurAerien) {
		TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien oldTypeSenseurAerien = typeSenseurAerien;
		typeSenseurAerien = newTypeSenseurAerien == null ? TYPE_SENSEUR_AERIEN_EDEFAULT : newTypeSenseurAerien;
		boolean oldTypeSenseurAerienESet = typeSenseurAerienESet;
		typeSenseurAerienESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__TYPE_SENSEUR_AERIEN, oldTypeSenseurAerien, typeSenseurAerien, !oldTypeSenseurAerienESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeSenseurAerien() {
		TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien oldTypeSenseurAerien = typeSenseurAerien;
		boolean oldTypeSenseurAerienESet = typeSenseurAerienESet;
		typeSenseurAerien = TYPE_SENSEUR_AERIEN_EDEFAULT;
		typeSenseurAerienESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__TYPE_SENSEUR_AERIEN, oldTypeSenseurAerien, TYPE_SENSEUR_AERIEN_EDEFAULT, oldTypeSenseurAerienESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeSenseurAerien() {
		return typeSenseurAerienESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValeurEchelle() {
		return valeurEchelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeurEchelle(long newValeurEchelle) {
		long oldValeurEchelle = valeurEchelle;
		valeurEchelle = newValeurEchelle;
		boolean oldValeurEchelleESet = valeurEchelleESet;
		valeurEchelleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__VALEUR_ECHELLE, oldValeurEchelle, valeurEchelle, !oldValeurEchelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeurEchelle() {
		long oldValeurEchelle = valeurEchelle;
		boolean oldValeurEchelleESet = valeurEchelleESet;
		valeurEchelle = VALEUR_ECHELLE_EDEFAULT;
		valeurEchelleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__VALEUR_ECHELLE, oldValeurEchelle, VALEUR_ECHELLE_EDEFAULT, oldValeurEchelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeurEchelle() {
		return valeurEchelleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAppuiAerienVueSenseur getVueSenseur() {
		return vueSenseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVueSenseur(TypeDictionaryDicoMissionAppuiAerienVueSenseur newVueSenseur) {
		TypeDictionaryDicoMissionAppuiAerienVueSenseur oldVueSenseur = vueSenseur;
		vueSenseur = newVueSenseur == null ? VUE_SENSEUR_EDEFAULT : newVueSenseur;
		boolean oldVueSenseurESet = vueSenseurESet;
		vueSenseurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__VUE_SENSEUR, oldVueSenseur, vueSenseur, !oldVueSenseurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVueSenseur() {
		TypeDictionaryDicoMissionAppuiAerienVueSenseur oldVueSenseur = vueSenseur;
		boolean oldVueSenseurESet = vueSenseurESet;
		vueSenseur = VUE_SENSEUR_EDEFAULT;
		vueSenseurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AIR__VUE_SENSEUR, oldVueSenseur, VUE_SENSEUR_EDEFAULT, oldVueSenseurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVueSenseur() {
		return vueSenseurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUnite() {
		if (aPourUniteExecutanteUnite == null) {
			aPourUniteExecutanteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AIR__APOUR_UNITE_EXECUTANTE_UNITE);
		}
		return aPourUniteExecutanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPlanificationOperation3DMissionAir() {
		if (estObjetAssociationPlanificationOperation3DMissionAir == null) {
			estObjetAssociationPlanificationOperation3DMissionAir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR);
		}
		return estObjetAssociationPlanificationOperation3DMissionAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourGroupementUnite() {
		return aPourGroupementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourGroupementUnite(TypeAssociationEXT newAPourGroupementUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourGroupementUnite = aPourGroupementUnite;
		aPourGroupementUnite = newAPourGroupementUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__APOUR_GROUPEMENT_UNITE, oldAPourGroupementUnite, newAPourGroupementUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourGroupementUnite(TypeAssociationEXT newAPourGroupementUnite) {
		if (newAPourGroupementUnite != aPourGroupementUnite) {
			NotificationChain msgs = null;
			if (aPourGroupementUnite != null)
				msgs = ((InternalEObject)aPourGroupementUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__APOUR_GROUPEMENT_UNITE, null, msgs);
			if (newAPourGroupementUnite != null)
				msgs = ((InternalEObject)newAPourGroupementUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__APOUR_GROUPEMENT_UNITE, null, msgs);
			msgs = basicSetAPourGroupementUnite(newAPourGroupementUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__APOUR_GROUPEMENT_UNITE, newAPourGroupementUnite, newAPourGroupementUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourAdresseAdresse() {
		return aPourAdresseAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourAdresseAdresse(TypeAssociation newAPourAdresseAdresse, NotificationChain msgs) {
		TypeAssociation oldAPourAdresseAdresse = aPourAdresseAdresse;
		aPourAdresseAdresse = newAPourAdresseAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__APOUR_ADRESSE_ADRESSE, oldAPourAdresseAdresse, newAPourAdresseAdresse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourAdresseAdresse(TypeAssociation newAPourAdresseAdresse) {
		if (newAPourAdresseAdresse != aPourAdresseAdresse) {
			NotificationChain msgs = null;
			if (aPourAdresseAdresse != null)
				msgs = ((InternalEObject)aPourAdresseAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__APOUR_ADRESSE_ADRESSE, null, msgs);
			if (newAPourAdresseAdresse != null)
				msgs = ((InternalEObject)newAPourAdresseAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__APOUR_ADRESSE_ADRESSE, null, msgs);
			msgs = basicSetAPourAdresseAdresse(newAPourAdresseAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__APOUR_ADRESSE_ADRESSE, newAPourAdresseAdresse, newAPourAdresseAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArmementMissionAppuiAerien> getAPourArmementsArmementMissionAppuiAerien() {
		if (aPourArmementsArmementMissionAppuiAerien == null) {
			aPourArmementsArmementMissionAppuiAerien = new EObjectContainmentEList<TypeArmementMissionAppuiAerien>(TypeArmementMissionAppuiAerien.class, this, SchemaPackage.TYPE_MISSION_AIR__APOUR_ARMEMENTS_ARMEMENT_MISSION_APPUI_AERIEN);
		}
		return aPourArmementsArmementMissionAppuiAerien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePhaseMissionAppuiAerien> getAPourPhasesPhaseMissionAppuiAerien() {
		if (aPourPhasesPhaseMissionAppuiAerien == null) {
			aPourPhasesPhaseMissionAppuiAerien = new EObjectContainmentEList<TypePhaseMissionAppuiAerien>(TypePhaseMissionAppuiAerien.class, this, SchemaPackage.TYPE_MISSION_AIR__APOUR_PHASES_PHASE_MISSION_APPUI_AERIEN);
		}
		return aPourPhasesPhaseMissionAppuiAerien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTacheAppuiAerien> getAPourTachesTacheAppuiAerien() {
		if (aPourTachesTacheAppuiAerien == null) {
			aPourTachesTacheAppuiAerien = new EObjectContainmentEList<TypeTacheAppuiAerien>(TypeTacheAppuiAerien.class, this, SchemaPackage.TYPE_MISSION_AIR__APOUR_TACHES_TACHE_APPUI_AERIEN);
		}
		return aPourTachesTacheAppuiAerien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteType() {
		if (aPourTypeRessourceRessourceActiviteType == null) {
			aPourTypeRessourceRessourceActiviteType = new EObjectContainmentEList<TypeRessourceActiviteType>(TypeRessourceActiviteType.class, this, SchemaPackage.TYPE_MISSION_AIR__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE);
		}
		return aPourTypeRessourceRessourceActiviteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionAir() {
		if (estObjetAssociationUniteMissionAir == null) {
			estObjetAssociationUniteMissionAir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_UNITE_MISSION_AIR);
		}
		return estObjetAssociationUniteMissionAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPersonneMissionAir() {
		if (estObjetAssociationPersonneMissionAir == null) {
			estObjetAssociationPersonneMissionAir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PERSONNE_MISSION_AIR);
		}
		return estObjetAssociationPersonneMissionAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourPointsRecuperationAutreElementControle() {
		if (aPourPointsRecuperationAutreElementControle == null) {
			aPourPointsRecuperationAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AIR__APOUR_POINTS_RECUPERATION_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourPointsRecuperationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourPointDepartAutreElementControle() {
		return aPourPointDepartAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPointDepartAutreElementControle(TypeAssociation newAPourPointDepartAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourPointDepartAutreElementControle = aPourPointDepartAutreElementControle;
		aPourPointDepartAutreElementControle = newAPourPointDepartAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__APOUR_POINT_DEPART_AUTRE_ELEMENT_CONTROLE, oldAPourPointDepartAutreElementControle, newAPourPointDepartAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPointDepartAutreElementControle(TypeAssociation newAPourPointDepartAutreElementControle) {
		if (newAPourPointDepartAutreElementControle != aPourPointDepartAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourPointDepartAutreElementControle != null)
				msgs = ((InternalEObject)aPourPointDepartAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__APOUR_POINT_DEPART_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourPointDepartAutreElementControle != null)
				msgs = ((InternalEObject)newAPourPointDepartAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AIR__APOUR_POINT_DEPART_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourPointDepartAutreElementControle(newAPourPointDepartAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AIR__APOUR_POINT_DEPART_AUTRE_ELEMENT_CONTROLE, newAPourPointDepartAutreElementControle, newAPourPointDepartAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_AGL:
				return basicSetAltitudeAGL(null, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_OBJECTIF:
				return basicSetAltitudeObjectif(null, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_UNITE_EXECUTANTE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				return ((InternalEList<?>)getEstObjetAssociationPlanificationOperation3DMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_GROUPEMENT_UNITE:
				return basicSetAPourGroupementUnite(null, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ADRESSE_ADRESSE:
				return basicSetAPourAdresseAdresse(null, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ARMEMENTS_ARMEMENT_MISSION_APPUI_AERIEN:
				return ((InternalEList<?>)getAPourArmementsArmementMissionAppuiAerien()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_PHASES_PHASE_MISSION_APPUI_AERIEN:
				return ((InternalEList<?>)getAPourPhasesPhaseMissionAppuiAerien()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TACHES_TACHE_APPUI_AERIEN:
				return ((InternalEList<?>)getAPourTachesTacheAppuiAerien()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return ((InternalEList<?>)getAPourTypeRessourceRessourceActiviteType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_UNITE_MISSION_AIR:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				return ((InternalEList<?>)getEstObjetAssociationPersonneMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINTS_RECUPERATION_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourPointsRecuperationAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINT_DEPART_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourPointDepartAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION:
				return getNumeroMission();
			case SchemaPackage.TYPE_MISSION_AIR__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_MISSION:
				return getTypeMission();
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION_GROUPEMENT:
				return new Long(getNumeroMissionGroupement());
			case SchemaPackage.TYPE_MISSION_AIR__ADRESSE_LIVRAISON:
				return getAdresseLivraison();
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_AGL:
				return getAltitudeAGL();
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_OBJECTIF:
				return getAltitudeObjectif();
			case SchemaPackage.TYPE_MISSION_AIR__AUTORITE_DEMANDANT:
				return getAutoriteDemandant();
			case SchemaPackage.TYPE_MISSION_AIR__BUT_MISSION:
				return getButMission();
			case SchemaPackage.TYPE_MISSION_AIR__COMMENTAIRE_DETAILS:
				return getCommentaireDetails();
			case SchemaPackage.TYPE_MISSION_AIR__CONFIDENTIALITE_OTAN:
				return getConfidentialiteOTAN();
			case SchemaPackage.TYPE_MISSION_AIR__DATE_LIVRAISON:
				return getDateLivraison();
			case SchemaPackage.TYPE_MISSION_AIR__DATE_RENSEIGNEMENT:
				return getDateRenseignement();
			case SchemaPackage.TYPE_MISSION_AIR__ECHELLE_IMAGE:
				return getEchelleImage();
			case SchemaPackage.TYPE_MISSION_AIR__INDICATEUR_MISSION_RESIDUEL:
				return getIndicateurMissionResiduel();
			case SchemaPackage.TYPE_MISSION_AIR__MOYEN_LIVRAISON:
				return getMoyenLivraison();
			case SchemaPackage.TYPE_MISSION_AIR__NOMBRE_COPIES:
				return new Long(getNombreCopies());
			case SchemaPackage.TYPE_MISSION_AIR__NO_SERIE_DEMANDE:
				return new Long(getNoSerieDemande());
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_EVENEMENT:
				return getNumeroEvenement();
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_PONT_AERIEN:
				return getNumeroPontAerien();
			case SchemaPackage.TYPE_MISSION_AIR__SIGNAL_APPEL_GROUPEMENT:
				return getSignalAppelGroupement();
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_COPIE:
				return getTypeCopie();
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_CR:
				return getTypeCR();
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_SECONDAIRE_MISSION:
				return getTypeSecondaireMission();
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_SENSEUR_AERIEN:
				return getTypeSenseurAerien();
			case SchemaPackage.TYPE_MISSION_AIR__VALEUR_ECHELLE:
				return new Long(getValeurEchelle());
			case SchemaPackage.TYPE_MISSION_AIR__VUE_SENSEUR:
				return getVueSenseur();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_UNITE_EXECUTANTE_UNITE:
				return getAPourUniteExecutanteUnite();
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				return getEstObjetAssociationPlanificationOperation3DMissionAir();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_GROUPEMENT_UNITE:
				return getAPourGroupementUnite();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ADRESSE_ADRESSE:
				return getAPourAdresseAdresse();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ARMEMENTS_ARMEMENT_MISSION_APPUI_AERIEN:
				return getAPourArmementsArmementMissionAppuiAerien();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_PHASES_PHASE_MISSION_APPUI_AERIEN:
				return getAPourPhasesPhaseMissionAppuiAerien();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TACHES_TACHE_APPUI_AERIEN:
				return getAPourTachesTacheAppuiAerien();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return getAPourTypeRessourceRessourceActiviteType();
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_UNITE_MISSION_AIR:
				return getEstObjetAssociationUniteMissionAir();
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				return getEstObjetAssociationPersonneMissionAir();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINTS_RECUPERATION_AUTRE_ELEMENT_CONTROLE:
				return getAPourPointsRecuperationAutreElementControle();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINT_DEPART_AUTRE_ELEMENT_CONTROLE:
				return getAPourPointDepartAutreElementControle();
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
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION:
				setNumeroMission((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__CATEGORIE:
				setCategorie((TypeDictionaryDicoMissionAirCategorie)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_MISSION:
				setTypeMission((TypeDictionaryDicoMissionAppuiAerienTypeMission)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION_GROUPEMENT:
				setNumeroMissionGroupement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_AIR__ADRESSE_LIVRAISON:
				setAdresseLivraison((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_AGL:
				setAltitudeAGL((TypeDataTypeAltitudePression)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_OBJECTIF:
				setAltitudeObjectif((TypeDataTypeAltitudePression)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__AUTORITE_DEMANDANT:
				setAutoriteDemandant((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__BUT_MISSION:
				setButMission((TypeDictionaryDicoMissionAppuiAerienButMission)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__COMMENTAIRE_DETAILS:
				setCommentaireDetails((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__CONFIDENTIALITE_OTAN:
				setConfidentialiteOTAN((TypeDictionaryDicoConfidentialiteOTAN)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__DATE_LIVRAISON:
				setDateLivraison((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__DATE_RENSEIGNEMENT:
				setDateRenseignement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__ECHELLE_IMAGE:
				setEchelleImage((TypeDictionaryDicoMissionAppuiAerienEchelleImage)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__INDICATEUR_MISSION_RESIDUEL:
				setIndicateurMissionResiduel((TypeDictionaryDicoMissionAirIndicateurMissionResiduel)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__MOYEN_LIVRAISON:
				setMoyenLivraison((TypeDictionaryDicoMissionAppuiAerienMoyenLivraison)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NOMBRE_COPIES:
				setNombreCopies(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NO_SERIE_DEMANDE:
				setNoSerieDemande(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_EVENEMENT:
				setNumeroEvenement((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_PONT_AERIEN:
				setNumeroPontAerien((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__SIGNAL_APPEL_GROUPEMENT:
				setSignalAppelGroupement((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_COPIE:
				setTypeCopie((TypeDictionaryDicoMissionAppuiAerienTypeCopie)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_CR:
				setTypeCR((TypeDictionaryDicoMissionAppuiAerienTypeCR)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_SECONDAIRE_MISSION:
				setTypeSecondaireMission((TypeDictionaryDicoMissionAppuiAerienTypeMission)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_SENSEUR_AERIEN:
				setTypeSenseurAerien((TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__VALEUR_ECHELLE:
				setValeurEchelle(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_AIR__VUE_SENSEUR:
				setVueSenseur((TypeDictionaryDicoMissionAppuiAerienVueSenseur)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				getAPourUniteExecutanteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				getEstObjetAssociationPlanificationOperation3DMissionAir().clear();
				getEstObjetAssociationPlanificationOperation3DMissionAir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_GROUPEMENT_UNITE:
				setAPourGroupementUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ADRESSE_ADRESSE:
				setAPourAdresseAdresse((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ARMEMENTS_ARMEMENT_MISSION_APPUI_AERIEN:
				getAPourArmementsArmementMissionAppuiAerien().clear();
				getAPourArmementsArmementMissionAppuiAerien().addAll((Collection<? extends TypeArmementMissionAppuiAerien>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_PHASES_PHASE_MISSION_APPUI_AERIEN:
				getAPourPhasesPhaseMissionAppuiAerien().clear();
				getAPourPhasesPhaseMissionAppuiAerien().addAll((Collection<? extends TypePhaseMissionAppuiAerien>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TACHES_TACHE_APPUI_AERIEN:
				getAPourTachesTacheAppuiAerien().clear();
				getAPourTachesTacheAppuiAerien().addAll((Collection<? extends TypeTacheAppuiAerien>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteType().clear();
				getAPourTypeRessourceRessourceActiviteType().addAll((Collection<? extends TypeRessourceActiviteType>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_UNITE_MISSION_AIR:
				getEstObjetAssociationUniteMissionAir().clear();
				getEstObjetAssociationUniteMissionAir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				getEstObjetAssociationPersonneMissionAir().clear();
				getEstObjetAssociationPersonneMissionAir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINTS_RECUPERATION_AUTRE_ELEMENT_CONTROLE:
				getAPourPointsRecuperationAutreElementControle().clear();
				getAPourPointsRecuperationAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINT_DEPART_AUTRE_ELEMENT_CONTROLE:
				setAPourPointDepartAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION:
				setNumeroMission(NUMERO_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_MISSION:
				unsetTypeMission();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION_GROUPEMENT:
				unsetNumeroMissionGroupement();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__ADRESSE_LIVRAISON:
				setAdresseLivraison(ADRESSE_LIVRAISON_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_AGL:
				setAltitudeAGL((TypeDataTypeAltitudePression)null);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_OBJECTIF:
				setAltitudeObjectif((TypeDataTypeAltitudePression)null);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__AUTORITE_DEMANDANT:
				setAutoriteDemandant(AUTORITE_DEMANDANT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__BUT_MISSION:
				unsetButMission();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__COMMENTAIRE_DETAILS:
				setCommentaireDetails(COMMENTAIRE_DETAILS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__CONFIDENTIALITE_OTAN:
				unsetConfidentialiteOTAN();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__DATE_LIVRAISON:
				setDateLivraison(DATE_LIVRAISON_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__DATE_RENSEIGNEMENT:
				setDateRenseignement(DATE_RENSEIGNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__ECHELLE_IMAGE:
				unsetEchelleImage();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__INDICATEUR_MISSION_RESIDUEL:
				unsetIndicateurMissionResiduel();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__MOYEN_LIVRAISON:
				unsetMoyenLivraison();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NOMBRE_COPIES:
				unsetNombreCopies();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NO_SERIE_DEMANDE:
				unsetNoSerieDemande();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_EVENEMENT:
				setNumeroEvenement(NUMERO_EVENEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_PONT_AERIEN:
				setNumeroPontAerien(NUMERO_PONT_AERIEN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__SIGNAL_APPEL_GROUPEMENT:
				setSignalAppelGroupement(SIGNAL_APPEL_GROUPEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_COPIE:
				unsetTypeCopie();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_CR:
				unsetTypeCR();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_SECONDAIRE_MISSION:
				unsetTypeSecondaireMission();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_SENSEUR_AERIEN:
				unsetTypeSenseurAerien();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__VALEUR_ECHELLE:
				unsetValeurEchelle();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__VUE_SENSEUR:
				unsetVueSenseur();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				getEstObjetAssociationPlanificationOperation3DMissionAir().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_GROUPEMENT_UNITE:
				setAPourGroupementUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ADRESSE_ADRESSE:
				setAPourAdresseAdresse((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ARMEMENTS_ARMEMENT_MISSION_APPUI_AERIEN:
				getAPourArmementsArmementMissionAppuiAerien().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_PHASES_PHASE_MISSION_APPUI_AERIEN:
				getAPourPhasesPhaseMissionAppuiAerien().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TACHES_TACHE_APPUI_AERIEN:
				getAPourTachesTacheAppuiAerien().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteType().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_UNITE_MISSION_AIR:
				getEstObjetAssociationUniteMissionAir().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				getEstObjetAssociationPersonneMissionAir().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINTS_RECUPERATION_AUTRE_ELEMENT_CONTROLE:
				getAPourPointsRecuperationAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINT_DEPART_AUTRE_ELEMENT_CONTROLE:
				setAPourPointDepartAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION:
				return NUMERO_MISSION_EDEFAULT == null ? numeroMission != null : !NUMERO_MISSION_EDEFAULT.equals(numeroMission);
			case SchemaPackage.TYPE_MISSION_AIR__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_MISSION:
				return isSetTypeMission();
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_MISSION_GROUPEMENT:
				return isSetNumeroMissionGroupement();
			case SchemaPackage.TYPE_MISSION_AIR__ADRESSE_LIVRAISON:
				return ADRESSE_LIVRAISON_EDEFAULT == null ? adresseLivraison != null : !ADRESSE_LIVRAISON_EDEFAULT.equals(adresseLivraison);
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_AGL:
				return altitudeAGL != null;
			case SchemaPackage.TYPE_MISSION_AIR__ALTITUDE_OBJECTIF:
				return altitudeObjectif != null;
			case SchemaPackage.TYPE_MISSION_AIR__AUTORITE_DEMANDANT:
				return AUTORITE_DEMANDANT_EDEFAULT == null ? autoriteDemandant != null : !AUTORITE_DEMANDANT_EDEFAULT.equals(autoriteDemandant);
			case SchemaPackage.TYPE_MISSION_AIR__BUT_MISSION:
				return isSetButMission();
			case SchemaPackage.TYPE_MISSION_AIR__COMMENTAIRE_DETAILS:
				return COMMENTAIRE_DETAILS_EDEFAULT == null ? commentaireDetails != null : !COMMENTAIRE_DETAILS_EDEFAULT.equals(commentaireDetails);
			case SchemaPackage.TYPE_MISSION_AIR__CONFIDENTIALITE_OTAN:
				return isSetConfidentialiteOTAN();
			case SchemaPackage.TYPE_MISSION_AIR__DATE_LIVRAISON:
				return DATE_LIVRAISON_EDEFAULT == null ? dateLivraison != null : !DATE_LIVRAISON_EDEFAULT.equals(dateLivraison);
			case SchemaPackage.TYPE_MISSION_AIR__DATE_RENSEIGNEMENT:
				return DATE_RENSEIGNEMENT_EDEFAULT == null ? dateRenseignement != null : !DATE_RENSEIGNEMENT_EDEFAULT.equals(dateRenseignement);
			case SchemaPackage.TYPE_MISSION_AIR__ECHELLE_IMAGE:
				return isSetEchelleImage();
			case SchemaPackage.TYPE_MISSION_AIR__INDICATEUR_MISSION_RESIDUEL:
				return isSetIndicateurMissionResiduel();
			case SchemaPackage.TYPE_MISSION_AIR__MOYEN_LIVRAISON:
				return isSetMoyenLivraison();
			case SchemaPackage.TYPE_MISSION_AIR__NOMBRE_COPIES:
				return isSetNombreCopies();
			case SchemaPackage.TYPE_MISSION_AIR__NO_SERIE_DEMANDE:
				return isSetNoSerieDemande();
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_EVENEMENT:
				return NUMERO_EVENEMENT_EDEFAULT == null ? numeroEvenement != null : !NUMERO_EVENEMENT_EDEFAULT.equals(numeroEvenement);
			case SchemaPackage.TYPE_MISSION_AIR__NUMERO_PONT_AERIEN:
				return NUMERO_PONT_AERIEN_EDEFAULT == null ? numeroPontAerien != null : !NUMERO_PONT_AERIEN_EDEFAULT.equals(numeroPontAerien);
			case SchemaPackage.TYPE_MISSION_AIR__SIGNAL_APPEL_GROUPEMENT:
				return SIGNAL_APPEL_GROUPEMENT_EDEFAULT == null ? signalAppelGroupement != null : !SIGNAL_APPEL_GROUPEMENT_EDEFAULT.equals(signalAppelGroupement);
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_COPIE:
				return isSetTypeCopie();
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_CR:
				return isSetTypeCR();
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_SECONDAIRE_MISSION:
				return isSetTypeSecondaireMission();
			case SchemaPackage.TYPE_MISSION_AIR__TYPE_SENSEUR_AERIEN:
				return isSetTypeSenseurAerien();
			case SchemaPackage.TYPE_MISSION_AIR__VALEUR_ECHELLE:
				return isSetValeurEchelle();
			case SchemaPackage.TYPE_MISSION_AIR__VUE_SENSEUR:
				return isSetVueSenseur();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_UNITE_EXECUTANTE_UNITE:
				return aPourUniteExecutanteUnite != null && !aPourUniteExecutanteUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				return estObjetAssociationPlanificationOperation3DMissionAir != null && !estObjetAssociationPlanificationOperation3DMissionAir.isEmpty();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_GROUPEMENT_UNITE:
				return aPourGroupementUnite != null;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ADRESSE_ADRESSE:
				return aPourAdresseAdresse != null;
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_ARMEMENTS_ARMEMENT_MISSION_APPUI_AERIEN:
				return aPourArmementsArmementMissionAppuiAerien != null && !aPourArmementsArmementMissionAppuiAerien.isEmpty();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_PHASES_PHASE_MISSION_APPUI_AERIEN:
				return aPourPhasesPhaseMissionAppuiAerien != null && !aPourPhasesPhaseMissionAppuiAerien.isEmpty();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TACHES_TACHE_APPUI_AERIEN:
				return aPourTachesTacheAppuiAerien != null && !aPourTachesTacheAppuiAerien.isEmpty();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return aPourTypeRessourceRessourceActiviteType != null && !aPourTypeRessourceRessourceActiviteType.isEmpty();
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_UNITE_MISSION_AIR:
				return estObjetAssociationUniteMissionAir != null && !estObjetAssociationUniteMissionAir.isEmpty();
			case SchemaPackage.TYPE_MISSION_AIR__EST_OBJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				return estObjetAssociationPersonneMissionAir != null && !estObjetAssociationPersonneMissionAir.isEmpty();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINTS_RECUPERATION_AUTRE_ELEMENT_CONTROLE:
				return aPourPointsRecuperationAutreElementControle != null && !aPourPointsRecuperationAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_AIR__APOUR_POINT_DEPART_AUTRE_ELEMENT_CONTROLE:
				return aPourPointDepartAutreElementControle != null;
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
		result.append(" (numeroMission: ");
		result.append(numeroMission);
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", typeMission: ");
		if (typeMissionESet) result.append(typeMission); else result.append("<unset>");
		result.append(", numeroMissionGroupement: ");
		if (numeroMissionGroupementESet) result.append(numeroMissionGroupement); else result.append("<unset>");
		result.append(", adresseLivraison: ");
		result.append(adresseLivraison);
		result.append(", autoriteDemandant: ");
		result.append(autoriteDemandant);
		result.append(", butMission: ");
		if (butMissionESet) result.append(butMission); else result.append("<unset>");
		result.append(", commentaireDetails: ");
		result.append(commentaireDetails);
		result.append(", confidentialiteOTAN: ");
		if (confidentialiteOTANESet) result.append(confidentialiteOTAN); else result.append("<unset>");
		result.append(", dateLivraison: ");
		result.append(dateLivraison);
		result.append(", dateRenseignement: ");
		result.append(dateRenseignement);
		result.append(", echelleImage: ");
		if (echelleImageESet) result.append(echelleImage); else result.append("<unset>");
		result.append(", indicateurMissionResiduel: ");
		if (indicateurMissionResiduelESet) result.append(indicateurMissionResiduel); else result.append("<unset>");
		result.append(", moyenLivraison: ");
		if (moyenLivraisonESet) result.append(moyenLivraison); else result.append("<unset>");
		result.append(", nombreCopies: ");
		if (nombreCopiesESet) result.append(nombreCopies); else result.append("<unset>");
		result.append(", noSerieDemande: ");
		if (noSerieDemandeESet) result.append(noSerieDemande); else result.append("<unset>");
		result.append(", numeroEvenement: ");
		result.append(numeroEvenement);
		result.append(", numeroPontAerien: ");
		result.append(numeroPontAerien);
		result.append(", signalAppelGroupement: ");
		result.append(signalAppelGroupement);
		result.append(", typeCopie: ");
		if (typeCopieESet) result.append(typeCopie); else result.append("<unset>");
		result.append(", typeCR: ");
		if (typeCRESet) result.append(typeCR); else result.append("<unset>");
		result.append(", typeSecondaireMission: ");
		if (typeSecondaireMissionESet) result.append(typeSecondaireMission); else result.append("<unset>");
		result.append(", typeSenseurAerien: ");
		if (typeSenseurAerienESet) result.append(typeSenseurAerien); else result.append("<unset>");
		result.append(", valeurEchelle: ");
		if (valeurEchelleESet) result.append(valeurEchelle); else result.append("<unset>");
		result.append(", vueSenseur: ");
		if (vueSenseurESet) result.append(vueSenseur); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMissionAirImpl
