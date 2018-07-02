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
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;
import mpia.schema.TypeDictionaryDicoEvenementNRBCTypeConteneur;
import mpia.schema.TypeDictionaryDicoEvenementNRBCtypeRejet;
import mpia.schema.TypeDictionaryDicoNatureRejet;
import mpia.schema.TypeDictionaryDicoPuissanceDetonation;
import mpia.schema.TypeEnvironnementTerrainEtVegetation;
import mpia.schema.TypeEvenementNRBC;
import mpia.schema.TypeMoyenDispersion;
import mpia.schema.TypePrelevement;
import mpia.schema.TypeZDVparPeriode;

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
 * An implementation of the model object '<em><b>Type Evenement NRBC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getNumeroSequence <em>Numero Sequence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getNatureRejet <em>Nature Rejet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getPuissanceDetonation <em>Puissance Detonation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getDescriptionROTA <em>Description ROTA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#isDetecte <em>Detecte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#isConfirme <em>Confirme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getDateDetection <em>Date Detection</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getTypeRejet <em>Type Rejet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getTypeConteneur <em>Type Conteneur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getNombreConteneur <em>Nombre Conteneur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#isResultatDommagePotentiel <em>Resultat Dommage Potentiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getCodeAutoriteOrigine <em>Code Autorite Origine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getCodeValidation <em>Code Validation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getCodeCentreControleSecteur <em>Code Centre Controle Secteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getProfondeurZoneDanger <em>Profondeur Zone Danger</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getDureeDangerEnZoneDanger <em>Duree Danger En Zone Danger</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getDureeDangerEnZoneAttaquee <em>Duree Danger En Zone Attaquee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getReferencesGeographiques <em>References Geographiques</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getAPourEnvironnementEnvironnementTerrainEtVegetation <em>APour Environnement Environnement Terrain Et Vegetation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getAPourMoyenDispersionMoyenDispersion <em>APour Moyen Dispersion Moyen Dispersion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getAPourConditionsMeteoTrancheMeteo <em>APour Conditions Meteo Tranche Meteo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getEstDetecteParTypeEquipementNRBC <em>Est Detecte Par Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getEstObjetAssociationSyntheseDetectionsEvenementNRBC <em>Est Objet Association Synthese Detections Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getAPourPrelevementsEffectuesPrelevement <em>APour Prelevements Effectues Prelevement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getAPourZonesContamineesPrevuesAutreElementControle <em>APour Zones Contaminees Prevues Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getAPourZDVparPeriodeZDVparPeriode <em>APour ZD Vpar Periode ZD Vpar Periode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getEstSujetAssociationEvenementNRBCEvenementNRBC <em>Est Sujet Association Evenement NRBC Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getEstObjetAssociationEvenementNRBCEvenementNRBC <em>Est Objet Association Evenement NRBC Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getEstSujetAssociationEvenementNRBCAutreEvenement <em>Est Sujet Association Evenement NRBC Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getEstObjetAssociationAutreEvenementEvenementNRBC <em>Est Objet Association Autre Evenement Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getEstSujetAssociationEvenementNRBCAction <em>Est Sujet Association Evenement NRBC Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementNRBCImpl#getEstObjetAssociationActionEvenementNRBC <em>Est Objet Association Action Evenement NRBC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeEvenementNRBCImpl extends TypeEvenementImpl implements TypeEvenementNRBC {
	/**
	 * The default value of the '{@link #getNumeroSequence() <em>Numero Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSequence()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroSequence() <em>Numero Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSequence()
	 * @generated
	 * @ordered
	 */
	protected String numeroSequence = NUMERO_SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatureRejet() <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureRejet()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoNatureRejet NATURE_REJET_EDEFAULT = TypeDictionaryDicoNatureRejet.ARBRST;

	/**
	 * The cached value of the '{@link #getNatureRejet() <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureRejet()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoNatureRejet natureRejet = NATURE_REJET_EDEFAULT;

	/**
	 * This is true if the Nature Rejet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureRejetESet;

	/**
	 * The default value of the '{@link #getPuissanceDetonation() <em>Puissance Detonation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuissanceDetonation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPuissanceDetonation PUISSANCE_DETONATION_EDEFAULT = TypeDictionaryDicoPuissanceDetonation.ALFA;

	/**
	 * The cached value of the '{@link #getPuissanceDetonation() <em>Puissance Detonation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuissanceDetonation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPuissanceDetonation puissanceDetonation = PUISSANCE_DETONATION_EDEFAULT;

	/**
	 * This is true if the Puissance Detonation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean puissanceDetonationESet;

	/**
	 * The default value of the '{@link #getDescriptionROTA() <em>Description ROTA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionROTA()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoNatureRejet DESCRIPTION_ROTA_EDEFAULT = TypeDictionaryDicoNatureRejet.ARBRST;

	/**
	 * The cached value of the '{@link #getDescriptionROTA() <em>Description ROTA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionROTA()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoNatureRejet descriptionROTA = DESCRIPTION_ROTA_EDEFAULT;

	/**
	 * This is true if the Description ROTA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionROTAESet;

	/**
	 * The default value of the '{@link #isDetecte() <em>Detecte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetecte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETECTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDetecte() <em>Detecte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetecte()
	 * @generated
	 * @ordered
	 */
	protected boolean detecte = DETECTE_EDEFAULT;

	/**
	 * This is true if the Detecte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean detecteESet;

	/**
	 * The default value of the '{@link #isConfirme() <em>Confirme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirme()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIRME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfirme() <em>Confirme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirme()
	 * @generated
	 * @ordered
	 */
	protected boolean confirme = CONFIRME_EDEFAULT;

	/**
	 * This is true if the Confirme attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confirmeESet;

	/**
	 * The default value of the '{@link #getDateDetection() <em>Date Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDetection()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DETECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDetection() <em>Date Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDetection()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDetection = DATE_DETECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeRejet() <em>Type Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRejet()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEvenementNRBCtypeRejet TYPE_REJET_EDEFAULT = TypeDictionaryDicoEvenementNRBCtypeRejet.CONT;

	/**
	 * The cached value of the '{@link #getTypeRejet() <em>Type Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRejet()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEvenementNRBCtypeRejet typeRejet = TYPE_REJET_EDEFAULT;

	/**
	 * This is true if the Type Rejet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeRejetESet;

	/**
	 * The default value of the '{@link #getTypeConteneur() <em>Type Conteneur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConteneur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEvenementNRBCTypeConteneur TYPE_CONTENEUR_EDEFAULT = TypeDictionaryDicoEvenementNRBCTypeConteneur.BOM;

	/**
	 * The cached value of the '{@link #getTypeConteneur() <em>Type Conteneur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConteneur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEvenementNRBCTypeConteneur typeConteneur = TYPE_CONTENEUR_EDEFAULT;

	/**
	 * This is true if the Type Conteneur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeConteneurESet;

	/**
	 * The default value of the '{@link #getNombreConteneur() <em>Nombre Conteneur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreConteneur()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_CONTENEUR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreConteneur() <em>Nombre Conteneur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreConteneur()
	 * @generated
	 * @ordered
	 */
	protected long nombreConteneur = NOMBRE_CONTENEUR_EDEFAULT;

	/**
	 * This is true if the Nombre Conteneur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreConteneurESet;

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
	 * The default value of the '{@link #isResultatDommagePotentiel() <em>Resultat Dommage Potentiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultatDommagePotentiel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULTAT_DOMMAGE_POTENTIEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResultatDommagePotentiel() <em>Resultat Dommage Potentiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultatDommagePotentiel()
	 * @generated
	 * @ordered
	 */
	protected boolean resultatDommagePotentiel = RESULTAT_DOMMAGE_POTENTIEL_EDEFAULT;

	/**
	 * This is true if the Resultat Dommage Potentiel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultatDommagePotentielESet;

	/**
	 * The default value of the '{@link #getCodeAutoriteOrigine() <em>Code Autorite Origine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAutoriteOrigine()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_AUTORITE_ORIGINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeAutoriteOrigine() <em>Code Autorite Origine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAutoriteOrigine()
	 * @generated
	 * @ordered
	 */
	protected String codeAutoriteOrigine = CODE_AUTORITE_ORIGINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeValidation() <em>Code Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeValidation()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_VALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeValidation() <em>Code Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeValidation()
	 * @generated
	 * @ordered
	 */
	protected String codeValidation = CODE_VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeCentreControleSecteur() <em>Code Centre Controle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeCentreControleSecteur()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_CENTRE_CONTROLE_SECTEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeCentreControleSecteur() <em>Code Centre Controle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeCentreControleSecteur()
	 * @generated
	 * @ordered
	 */
	protected String codeCentreControleSecteur = CODE_CENTRE_CONTROLE_SECTEUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProfondeurZoneDanger() <em>Profondeur Zone Danger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeurZoneDanger()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur profondeurZoneDanger;

	/**
	 * The cached value of the '{@link #getDureeDangerEnZoneDanger() <em>Duree Danger En Zone Danger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeDangerEnZoneDanger()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeDangerEnZoneDanger;

	/**
	 * The cached value of the '{@link #getDureeDangerEnZoneAttaquee() <em>Duree Danger En Zone Attaquee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeDangerEnZoneAttaquee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeDangerEnZoneAttaquee;

	/**
	 * The default value of the '{@link #getReferencesGeographiques() <em>References Geographiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesGeographiques()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCES_GEOGRAPHIQUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencesGeographiques() <em>References Geographiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesGeographiques()
	 * @generated
	 * @ordered
	 */
	protected String referencesGeographiques = REFERENCES_GEOGRAPHIQUES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourEnvironnementEnvironnementTerrainEtVegetation() <em>APour Environnement Environnement Terrain Et Vegetation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEnvironnementEnvironnementTerrainEtVegetation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEnvironnementTerrainEtVegetation> aPourEnvironnementEnvironnementTerrainEtVegetation;

	/**
	 * The cached value of the '{@link #getAPourMoyenDispersionMoyenDispersion() <em>APour Moyen Dispersion Moyen Dispersion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyenDispersionMoyenDispersion()
	 * @generated
	 * @ordered
	 */
	protected TypeMoyenDispersion aPourMoyenDispersionMoyenDispersion;

	/**
	 * The cached value of the '{@link #getAPourConditionsMeteoTrancheMeteo() <em>APour Conditions Meteo Tranche Meteo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConditionsMeteoTrancheMeteo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourConditionsMeteoTrancheMeteo;

	/**
	 * The cached value of the '{@link #getEstDetecteParTypeEquipementNRBC() <em>Est Detecte Par Type Equipement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDetecteParTypeEquipementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estDetecteParTypeEquipementNRBC;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationSyntheseDetectionsEvenementNRBC() <em>Est Objet Association Synthese Detections Evenement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationSyntheseDetectionsEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationSyntheseDetectionsEvenementNRBC;

	/**
	 * The cached value of the '{@link #getAPourPrelevementsEffectuesPrelevement() <em>APour Prelevements Effectues Prelevement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPrelevementsEffectuesPrelevement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePrelevement> aPourPrelevementsEffectuesPrelevement;

	/**
	 * The cached value of the '{@link #getAPourZonesContamineesPrevuesAutreElementControle() <em>APour Zones Contaminees Prevues Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZonesContamineesPrevuesAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZonesContamineesPrevuesAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourZDVparPeriodeZDVparPeriode() <em>APour ZD Vpar Periode ZD Vpar Periode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZDVparPeriodeZDVparPeriode()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeZDVparPeriode> aPourZDVparPeriodeZDVparPeriode;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEvenementNRBCEvenementNRBC() <em>Est Sujet Association Evenement NRBC Evenement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEvenementNRBCEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEvenementNRBCEvenementNRBC;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEvenementNRBCEvenementNRBC() <em>Est Objet Association Evenement NRBC Evenement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEvenementNRBCEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEvenementNRBCEvenementNRBC;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEvenementNRBCAutreEvenement() <em>Est Sujet Association Evenement NRBC Autre Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEvenementNRBCAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEvenementNRBCAutreEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationAutreEvenementEvenementNRBC() <em>Est Objet Association Autre Evenement Evenement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationAutreEvenementEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationAutreEvenementEvenementNRBC;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEvenementNRBCAction() <em>Est Sujet Association Evenement NRBC Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEvenementNRBCAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEvenementNRBCAction;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationActionEvenementNRBC() <em>Est Objet Association Action Evenement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationActionEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationActionEvenementNRBC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvenementNRBCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvenementNRBC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroSequence() {
		return numeroSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroSequence(String newNumeroSequence) {
		String oldNumeroSequence = numeroSequence;
		numeroSequence = newNumeroSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__NUMERO_SEQUENCE, oldNumeroSequence, numeroSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoNatureRejet getNatureRejet() {
		return natureRejet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureRejet(TypeDictionaryDicoNatureRejet newNatureRejet) {
		TypeDictionaryDicoNatureRejet oldNatureRejet = natureRejet;
		natureRejet = newNatureRejet == null ? NATURE_REJET_EDEFAULT : newNatureRejet;
		boolean oldNatureRejetESet = natureRejetESet;
		natureRejetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__NATURE_REJET, oldNatureRejet, natureRejet, !oldNatureRejetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureRejet() {
		TypeDictionaryDicoNatureRejet oldNatureRejet = natureRejet;
		boolean oldNatureRejetESet = natureRejetESet;
		natureRejet = NATURE_REJET_EDEFAULT;
		natureRejetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__NATURE_REJET, oldNatureRejet, NATURE_REJET_EDEFAULT, oldNatureRejetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureRejet() {
		return natureRejetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPuissanceDetonation getPuissanceDetonation() {
		return puissanceDetonation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuissanceDetonation(TypeDictionaryDicoPuissanceDetonation newPuissanceDetonation) {
		TypeDictionaryDicoPuissanceDetonation oldPuissanceDetonation = puissanceDetonation;
		puissanceDetonation = newPuissanceDetonation == null ? PUISSANCE_DETONATION_EDEFAULT : newPuissanceDetonation;
		boolean oldPuissanceDetonationESet = puissanceDetonationESet;
		puissanceDetonationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__PUISSANCE_DETONATION, oldPuissanceDetonation, puissanceDetonation, !oldPuissanceDetonationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPuissanceDetonation() {
		TypeDictionaryDicoPuissanceDetonation oldPuissanceDetonation = puissanceDetonation;
		boolean oldPuissanceDetonationESet = puissanceDetonationESet;
		puissanceDetonation = PUISSANCE_DETONATION_EDEFAULT;
		puissanceDetonationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__PUISSANCE_DETONATION, oldPuissanceDetonation, PUISSANCE_DETONATION_EDEFAULT, oldPuissanceDetonationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPuissanceDetonation() {
		return puissanceDetonationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoNatureRejet getDescriptionROTA() {
		return descriptionROTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionROTA(TypeDictionaryDicoNatureRejet newDescriptionROTA) {
		TypeDictionaryDicoNatureRejet oldDescriptionROTA = descriptionROTA;
		descriptionROTA = newDescriptionROTA == null ? DESCRIPTION_ROTA_EDEFAULT : newDescriptionROTA;
		boolean oldDescriptionROTAESet = descriptionROTAESet;
		descriptionROTAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__DESCRIPTION_ROTA, oldDescriptionROTA, descriptionROTA, !oldDescriptionROTAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescriptionROTA() {
		TypeDictionaryDicoNatureRejet oldDescriptionROTA = descriptionROTA;
		boolean oldDescriptionROTAESet = descriptionROTAESet;
		descriptionROTA = DESCRIPTION_ROTA_EDEFAULT;
		descriptionROTAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__DESCRIPTION_ROTA, oldDescriptionROTA, DESCRIPTION_ROTA_EDEFAULT, oldDescriptionROTAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescriptionROTA() {
		return descriptionROTAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDetecte() {
		return detecte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetecte(boolean newDetecte) {
		boolean oldDetecte = detecte;
		detecte = newDetecte;
		boolean oldDetecteESet = detecteESet;
		detecteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__DETECTE, oldDetecte, detecte, !oldDetecteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDetecte() {
		boolean oldDetecte = detecte;
		boolean oldDetecteESet = detecteESet;
		detecte = DETECTE_EDEFAULT;
		detecteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__DETECTE, oldDetecte, DETECTE_EDEFAULT, oldDetecteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDetecte() {
		return detecteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfirme() {
		return confirme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirme(boolean newConfirme) {
		boolean oldConfirme = confirme;
		confirme = newConfirme;
		boolean oldConfirmeESet = confirmeESet;
		confirmeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__CONFIRME, oldConfirme, confirme, !oldConfirmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfirme() {
		boolean oldConfirme = confirme;
		boolean oldConfirmeESet = confirmeESet;
		confirme = CONFIRME_EDEFAULT;
		confirmeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__CONFIRME, oldConfirme, CONFIRME_EDEFAULT, oldConfirmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfirme() {
		return confirmeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDetection() {
		return dateDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDetection(XMLGregorianCalendar newDateDetection) {
		XMLGregorianCalendar oldDateDetection = dateDetection;
		dateDetection = newDateDetection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__DATE_DETECTION, oldDateDetection, dateDetection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEvenementNRBCtypeRejet getTypeRejet() {
		return typeRejet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRejet(TypeDictionaryDicoEvenementNRBCtypeRejet newTypeRejet) {
		TypeDictionaryDicoEvenementNRBCtypeRejet oldTypeRejet = typeRejet;
		typeRejet = newTypeRejet == null ? TYPE_REJET_EDEFAULT : newTypeRejet;
		boolean oldTypeRejetESet = typeRejetESet;
		typeRejetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_REJET, oldTypeRejet, typeRejet, !oldTypeRejetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeRejet() {
		TypeDictionaryDicoEvenementNRBCtypeRejet oldTypeRejet = typeRejet;
		boolean oldTypeRejetESet = typeRejetESet;
		typeRejet = TYPE_REJET_EDEFAULT;
		typeRejetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_REJET, oldTypeRejet, TYPE_REJET_EDEFAULT, oldTypeRejetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeRejet() {
		return typeRejetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEvenementNRBCTypeConteneur getTypeConteneur() {
		return typeConteneur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeConteneur(TypeDictionaryDicoEvenementNRBCTypeConteneur newTypeConteneur) {
		TypeDictionaryDicoEvenementNRBCTypeConteneur oldTypeConteneur = typeConteneur;
		typeConteneur = newTypeConteneur == null ? TYPE_CONTENEUR_EDEFAULT : newTypeConteneur;
		boolean oldTypeConteneurESet = typeConteneurESet;
		typeConteneurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_CONTENEUR, oldTypeConteneur, typeConteneur, !oldTypeConteneurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeConteneur() {
		TypeDictionaryDicoEvenementNRBCTypeConteneur oldTypeConteneur = typeConteneur;
		boolean oldTypeConteneurESet = typeConteneurESet;
		typeConteneur = TYPE_CONTENEUR_EDEFAULT;
		typeConteneurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_CONTENEUR, oldTypeConteneur, TYPE_CONTENEUR_EDEFAULT, oldTypeConteneurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeConteneur() {
		return typeConteneurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreConteneur() {
		return nombreConteneur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreConteneur(long newNombreConteneur) {
		long oldNombreConteneur = nombreConteneur;
		nombreConteneur = newNombreConteneur;
		boolean oldNombreConteneurESet = nombreConteneurESet;
		nombreConteneurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__NOMBRE_CONTENEUR, oldNombreConteneur, nombreConteneur, !oldNombreConteneurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreConteneur() {
		long oldNombreConteneur = nombreConteneur;
		boolean oldNombreConteneurESet = nombreConteneurESet;
		nombreConteneur = NOMBRE_CONTENEUR_EDEFAULT;
		nombreConteneurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__NOMBRE_CONTENEUR, oldNombreConteneur, NOMBRE_CONTENEUR_EDEFAULT, oldNombreConteneurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreConteneur() {
		return nombreConteneurESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__NATIONALITE, oldNationalite, nationalite, !oldNationaliteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__NATIONALITE, oldNationalite, NATIONALITE_EDEFAULT, oldNationaliteESet));
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
	public boolean isResultatDommagePotentiel() {
		return resultatDommagePotentiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultatDommagePotentiel(boolean newResultatDommagePotentiel) {
		boolean oldResultatDommagePotentiel = resultatDommagePotentiel;
		resultatDommagePotentiel = newResultatDommagePotentiel;
		boolean oldResultatDommagePotentielESet = resultatDommagePotentielESet;
		resultatDommagePotentielESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__RESULTAT_DOMMAGE_POTENTIEL, oldResultatDommagePotentiel, resultatDommagePotentiel, !oldResultatDommagePotentielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResultatDommagePotentiel() {
		boolean oldResultatDommagePotentiel = resultatDommagePotentiel;
		boolean oldResultatDommagePotentielESet = resultatDommagePotentielESet;
		resultatDommagePotentiel = RESULTAT_DOMMAGE_POTENTIEL_EDEFAULT;
		resultatDommagePotentielESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_NRBC__RESULTAT_DOMMAGE_POTENTIEL, oldResultatDommagePotentiel, RESULTAT_DOMMAGE_POTENTIEL_EDEFAULT, oldResultatDommagePotentielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResultatDommagePotentiel() {
		return resultatDommagePotentielESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeAutoriteOrigine() {
		return codeAutoriteOrigine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeAutoriteOrigine(String newCodeAutoriteOrigine) {
		String oldCodeAutoriteOrigine = codeAutoriteOrigine;
		codeAutoriteOrigine = newCodeAutoriteOrigine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_AUTORITE_ORIGINE, oldCodeAutoriteOrigine, codeAutoriteOrigine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeValidation() {
		return codeValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeValidation(String newCodeValidation) {
		String oldCodeValidation = codeValidation;
		codeValidation = newCodeValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_VALIDATION, oldCodeValidation, codeValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeCentreControleSecteur() {
		return codeCentreControleSecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeCentreControleSecteur(String newCodeCentreControleSecteur) {
		String oldCodeCentreControleSecteur = codeCentreControleSecteur;
		codeCentreControleSecteur = newCodeCentreControleSecteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_CENTRE_CONTROLE_SECTEUR, oldCodeCentreControleSecteur, codeCentreControleSecteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getProfondeurZoneDanger() {
		return profondeurZoneDanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfondeurZoneDanger(TypeDataTypeLongueur newProfondeurZoneDanger, NotificationChain msgs) {
		TypeDataTypeLongueur oldProfondeurZoneDanger = profondeurZoneDanger;
		profondeurZoneDanger = newProfondeurZoneDanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__PROFONDEUR_ZONE_DANGER, oldProfondeurZoneDanger, newProfondeurZoneDanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondeurZoneDanger(TypeDataTypeLongueur newProfondeurZoneDanger) {
		if (newProfondeurZoneDanger != profondeurZoneDanger) {
			NotificationChain msgs = null;
			if (profondeurZoneDanger != null)
				msgs = ((InternalEObject)profondeurZoneDanger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_NRBC__PROFONDEUR_ZONE_DANGER, null, msgs);
			if (newProfondeurZoneDanger != null)
				msgs = ((InternalEObject)newProfondeurZoneDanger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_NRBC__PROFONDEUR_ZONE_DANGER, null, msgs);
			msgs = basicSetProfondeurZoneDanger(newProfondeurZoneDanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__PROFONDEUR_ZONE_DANGER, newProfondeurZoneDanger, newProfondeurZoneDanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeDangerEnZoneDanger() {
		return dureeDangerEnZoneDanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeDangerEnZoneDanger(TypeDataTypeDuree newDureeDangerEnZoneDanger, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeDangerEnZoneDanger = dureeDangerEnZoneDanger;
		dureeDangerEnZoneDanger = newDureeDangerEnZoneDanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_DANGER, oldDureeDangerEnZoneDanger, newDureeDangerEnZoneDanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeDangerEnZoneDanger(TypeDataTypeDuree newDureeDangerEnZoneDanger) {
		if (newDureeDangerEnZoneDanger != dureeDangerEnZoneDanger) {
			NotificationChain msgs = null;
			if (dureeDangerEnZoneDanger != null)
				msgs = ((InternalEObject)dureeDangerEnZoneDanger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_DANGER, null, msgs);
			if (newDureeDangerEnZoneDanger != null)
				msgs = ((InternalEObject)newDureeDangerEnZoneDanger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_DANGER, null, msgs);
			msgs = basicSetDureeDangerEnZoneDanger(newDureeDangerEnZoneDanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_DANGER, newDureeDangerEnZoneDanger, newDureeDangerEnZoneDanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeDangerEnZoneAttaquee() {
		return dureeDangerEnZoneAttaquee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeDangerEnZoneAttaquee(TypeDataTypeDuree newDureeDangerEnZoneAttaquee, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeDangerEnZoneAttaquee = dureeDangerEnZoneAttaquee;
		dureeDangerEnZoneAttaquee = newDureeDangerEnZoneAttaquee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_ATTAQUEE, oldDureeDangerEnZoneAttaquee, newDureeDangerEnZoneAttaquee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeDangerEnZoneAttaquee(TypeDataTypeDuree newDureeDangerEnZoneAttaquee) {
		if (newDureeDangerEnZoneAttaquee != dureeDangerEnZoneAttaquee) {
			NotificationChain msgs = null;
			if (dureeDangerEnZoneAttaquee != null)
				msgs = ((InternalEObject)dureeDangerEnZoneAttaquee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_ATTAQUEE, null, msgs);
			if (newDureeDangerEnZoneAttaquee != null)
				msgs = ((InternalEObject)newDureeDangerEnZoneAttaquee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_ATTAQUEE, null, msgs);
			msgs = basicSetDureeDangerEnZoneAttaquee(newDureeDangerEnZoneAttaquee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_ATTAQUEE, newDureeDangerEnZoneAttaquee, newDureeDangerEnZoneAttaquee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencesGeographiques() {
		return referencesGeographiques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesGeographiques(String newReferencesGeographiques) {
		String oldReferencesGeographiques = referencesGeographiques;
		referencesGeographiques = newReferencesGeographiques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__REFERENCES_GEOGRAPHIQUES, oldReferencesGeographiques, referencesGeographiques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEnvironnementTerrainEtVegetation> getAPourEnvironnementEnvironnementTerrainEtVegetation() {
		if (aPourEnvironnementEnvironnementTerrainEtVegetation == null) {
			aPourEnvironnementEnvironnementTerrainEtVegetation = new EObjectContainmentEList<TypeEnvironnementTerrainEtVegetation>(TypeEnvironnementTerrainEtVegetation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION);
		}
		return aPourEnvironnementEnvironnementTerrainEtVegetation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMoyenDispersion getAPourMoyenDispersionMoyenDispersion() {
		return aPourMoyenDispersionMoyenDispersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMoyenDispersionMoyenDispersion(TypeMoyenDispersion newAPourMoyenDispersionMoyenDispersion, NotificationChain msgs) {
		TypeMoyenDispersion oldAPourMoyenDispersionMoyenDispersion = aPourMoyenDispersionMoyenDispersion;
		aPourMoyenDispersionMoyenDispersion = newAPourMoyenDispersionMoyenDispersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_MOYEN_DISPERSION_MOYEN_DISPERSION, oldAPourMoyenDispersionMoyenDispersion, newAPourMoyenDispersionMoyenDispersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMoyenDispersionMoyenDispersion(TypeMoyenDispersion newAPourMoyenDispersionMoyenDispersion) {
		if (newAPourMoyenDispersionMoyenDispersion != aPourMoyenDispersionMoyenDispersion) {
			NotificationChain msgs = null;
			if (aPourMoyenDispersionMoyenDispersion != null)
				msgs = ((InternalEObject)aPourMoyenDispersionMoyenDispersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_MOYEN_DISPERSION_MOYEN_DISPERSION, null, msgs);
			if (newAPourMoyenDispersionMoyenDispersion != null)
				msgs = ((InternalEObject)newAPourMoyenDispersionMoyenDispersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_MOYEN_DISPERSION_MOYEN_DISPERSION, null, msgs);
			msgs = basicSetAPourMoyenDispersionMoyenDispersion(newAPourMoyenDispersionMoyenDispersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_MOYEN_DISPERSION_MOYEN_DISPERSION, newAPourMoyenDispersionMoyenDispersion, newAPourMoyenDispersionMoyenDispersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourConditionsMeteoTrancheMeteo() {
		if (aPourConditionsMeteoTrancheMeteo == null) {
			aPourConditionsMeteoTrancheMeteo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_CONDITIONS_METEO_TRANCHE_METEO);
		}
		return aPourConditionsMeteoTrancheMeteo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEstDetecteParTypeEquipementNRBC() {
		if (estDetecteParTypeEquipementNRBC == null) {
			estDetecteParTypeEquipementNRBC = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC);
		}
		return estDetecteParTypeEquipementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationSyntheseDetectionsEvenementNRBC() {
		if (estObjetAssociationSyntheseDetectionsEvenementNRBC == null) {
			estObjetAssociationSyntheseDetectionsEvenementNRBC = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC);
		}
		return estObjetAssociationSyntheseDetectionsEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePrelevement> getAPourPrelevementsEffectuesPrelevement() {
		if (aPourPrelevementsEffectuesPrelevement == null) {
			aPourPrelevementsEffectuesPrelevement = new EObjectContainmentEList<TypePrelevement>(TypePrelevement.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_PRELEVEMENTS_EFFECTUES_PRELEVEMENT);
		}
		return aPourPrelevementsEffectuesPrelevement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZonesContamineesPrevuesAutreElementControle() {
		if (aPourZonesContamineesPrevuesAutreElementControle == null) {
			aPourZonesContamineesPrevuesAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZONES_CONTAMINEES_PREVUES_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZonesContamineesPrevuesAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZDVparPeriode> getAPourZDVparPeriodeZDVparPeriode() {
		if (aPourZDVparPeriodeZDVparPeriode == null) {
			aPourZDVparPeriodeZDVparPeriode = new EObjectContainmentEList<TypeZDVparPeriode>(TypeZDVparPeriode.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZD_VPAR_PERIODE_ZD_VPAR_PERIODE);
		}
		return aPourZDVparPeriodeZDVparPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEvenementNRBCEvenementNRBC() {
		if (estSujetAssociationEvenementNRBCEvenementNRBC == null) {
			estSujetAssociationEvenementNRBCEvenementNRBC = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC);
		}
		return estSujetAssociationEvenementNRBCEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEvenementNRBCEvenementNRBC() {
		if (estObjetAssociationEvenementNRBCEvenementNRBC == null) {
			estObjetAssociationEvenementNRBCEvenementNRBC = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC);
		}
		return estObjetAssociationEvenementNRBCEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEvenementNRBCAutreEvenement() {
		if (estSujetAssociationEvenementNRBCAutreEvenement == null) {
			estSujetAssociationEvenementNRBCAutreEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT);
		}
		return estSujetAssociationEvenementNRBCAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationAutreEvenementEvenementNRBC() {
		if (estObjetAssociationAutreEvenementEvenementNRBC == null) {
			estObjetAssociationAutreEvenementEvenementNRBC = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC);
		}
		return estObjetAssociationAutreEvenementEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEvenementNRBCAction() {
		if (estSujetAssociationEvenementNRBCAction == null) {
			estSujetAssociationEvenementNRBCAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_ACTION);
		}
		return estSujetAssociationEvenementNRBCAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationActionEvenementNRBC() {
		if (estObjetAssociationActionEvenementNRBC == null) {
			estObjetAssociationActionEvenementNRBC = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_ACTION_EVENEMENT_NRBC);
		}
		return estObjetAssociationActionEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVENEMENT_NRBC__PROFONDEUR_ZONE_DANGER:
				return basicSetProfondeurZoneDanger(null, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_DANGER:
				return basicSetDureeDangerEnZoneDanger(null, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_ATTAQUEE:
				return basicSetDureeDangerEnZoneAttaquee(null, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				return ((InternalEList<?>)getAPourEnvironnementEnvironnementTerrainEtVegetation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_MOYEN_DISPERSION_MOYEN_DISPERSION:
				return basicSetAPourMoyenDispersionMoyenDispersion(null, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				return ((InternalEList<?>)getAPourConditionsMeteoTrancheMeteo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				return ((InternalEList<?>)getEstDetecteParTypeEquipementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				return ((InternalEList<?>)getEstObjetAssociationSyntheseDetectionsEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_PRELEVEMENTS_EFFECTUES_PRELEVEMENT:
				return ((InternalEList<?>)getAPourPrelevementsEffectuesPrelevement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZONES_CONTAMINEES_PREVUES_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZonesContamineesPrevuesAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZD_VPAR_PERIODE_ZD_VPAR_PERIODE:
				return ((InternalEList<?>)getAPourZDVparPeriodeZDVparPeriode()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				return ((InternalEList<?>)getEstSujetAssociationEvenementNRBCEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				return ((InternalEList<?>)getEstObjetAssociationEvenementNRBCEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationEvenementNRBCAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				return ((InternalEList<?>)getEstObjetAssociationAutreEvenementEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				return ((InternalEList<?>)getEstSujetAssociationEvenementNRBCAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				return ((InternalEList<?>)getEstObjetAssociationActionEvenementNRBC()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NUMERO_SEQUENCE:
				return getNumeroSequence();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NATURE_REJET:
				return getNatureRejet();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__PUISSANCE_DETONATION:
				return getPuissanceDetonation();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DESCRIPTION_ROTA:
				return getDescriptionROTA();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DETECTE:
				return isDetecte() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CONFIRME:
				return isConfirme() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DATE_DETECTION:
				return getDateDetection();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_REJET:
				return getTypeRejet();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_CONTENEUR:
				return getTypeConteneur();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NOMBRE_CONTENEUR:
				return new Long(getNombreConteneur());
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NATIONALITE:
				return getNationalite();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__RESULTAT_DOMMAGE_POTENTIEL:
				return isResultatDommagePotentiel() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_AUTORITE_ORIGINE:
				return getCodeAutoriteOrigine();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_VALIDATION:
				return getCodeValidation();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_CENTRE_CONTROLE_SECTEUR:
				return getCodeCentreControleSecteur();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__PROFONDEUR_ZONE_DANGER:
				return getProfondeurZoneDanger();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_DANGER:
				return getDureeDangerEnZoneDanger();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_ATTAQUEE:
				return getDureeDangerEnZoneAttaquee();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__REFERENCES_GEOGRAPHIQUES:
				return getReferencesGeographiques();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				return getAPourEnvironnementEnvironnementTerrainEtVegetation();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_MOYEN_DISPERSION_MOYEN_DISPERSION:
				return getAPourMoyenDispersionMoyenDispersion();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				return getAPourConditionsMeteoTrancheMeteo();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				return getEstDetecteParTypeEquipementNRBC();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				return getEstObjetAssociationSyntheseDetectionsEvenementNRBC();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_PRELEVEMENTS_EFFECTUES_PRELEVEMENT:
				return getAPourPrelevementsEffectuesPrelevement();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZONES_CONTAMINEES_PREVUES_AUTRE_ELEMENT_CONTROLE:
				return getAPourZonesContamineesPrevuesAutreElementControle();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZD_VPAR_PERIODE_ZD_VPAR_PERIODE:
				return getAPourZDVparPeriodeZDVparPeriode();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				return getEstSujetAssociationEvenementNRBCEvenementNRBC();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				return getEstObjetAssociationEvenementNRBCEvenementNRBC();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				return getEstSujetAssociationEvenementNRBCAutreEvenement();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				return getEstObjetAssociationAutreEvenementEvenementNRBC();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				return getEstSujetAssociationEvenementNRBCAction();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				return getEstObjetAssociationActionEvenementNRBC();
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
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NUMERO_SEQUENCE:
				setNumeroSequence((String)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NATURE_REJET:
				setNatureRejet((TypeDictionaryDicoNatureRejet)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__PUISSANCE_DETONATION:
				setPuissanceDetonation((TypeDictionaryDicoPuissanceDetonation)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DESCRIPTION_ROTA:
				setDescriptionROTA((TypeDictionaryDicoNatureRejet)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DETECTE:
				setDetecte(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CONFIRME:
				setConfirme(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DATE_DETECTION:
				setDateDetection((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_REJET:
				setTypeRejet((TypeDictionaryDicoEvenementNRBCtypeRejet)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_CONTENEUR:
				setTypeConteneur((TypeDictionaryDicoEvenementNRBCTypeConteneur)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NOMBRE_CONTENEUR:
				setNombreConteneur(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NATIONALITE:
				setNationalite((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__RESULTAT_DOMMAGE_POTENTIEL:
				setResultatDommagePotentiel(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_AUTORITE_ORIGINE:
				setCodeAutoriteOrigine((String)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_VALIDATION:
				setCodeValidation((String)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_CENTRE_CONTROLE_SECTEUR:
				setCodeCentreControleSecteur((String)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__PROFONDEUR_ZONE_DANGER:
				setProfondeurZoneDanger((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_DANGER:
				setDureeDangerEnZoneDanger((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_ATTAQUEE:
				setDureeDangerEnZoneAttaquee((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__REFERENCES_GEOGRAPHIQUES:
				setReferencesGeographiques((String)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				getAPourEnvironnementEnvironnementTerrainEtVegetation().clear();
				getAPourEnvironnementEnvironnementTerrainEtVegetation().addAll((Collection<? extends TypeEnvironnementTerrainEtVegetation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_MOYEN_DISPERSION_MOYEN_DISPERSION:
				setAPourMoyenDispersionMoyenDispersion((TypeMoyenDispersion)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				getAPourConditionsMeteoTrancheMeteo().clear();
				getAPourConditionsMeteoTrancheMeteo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				getEstDetecteParTypeEquipementNRBC().clear();
				getEstDetecteParTypeEquipementNRBC().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				getEstObjetAssociationSyntheseDetectionsEvenementNRBC().clear();
				getEstObjetAssociationSyntheseDetectionsEvenementNRBC().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_PRELEVEMENTS_EFFECTUES_PRELEVEMENT:
				getAPourPrelevementsEffectuesPrelevement().clear();
				getAPourPrelevementsEffectuesPrelevement().addAll((Collection<? extends TypePrelevement>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZONES_CONTAMINEES_PREVUES_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesContamineesPrevuesAutreElementControle().clear();
				getAPourZonesContamineesPrevuesAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZD_VPAR_PERIODE_ZD_VPAR_PERIODE:
				getAPourZDVparPeriodeZDVparPeriode().clear();
				getAPourZDVparPeriodeZDVparPeriode().addAll((Collection<? extends TypeZDVparPeriode>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				getEstSujetAssociationEvenementNRBCEvenementNRBC().clear();
				getEstSujetAssociationEvenementNRBCEvenementNRBC().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				getEstObjetAssociationEvenementNRBCEvenementNRBC().clear();
				getEstObjetAssociationEvenementNRBCEvenementNRBC().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				getEstSujetAssociationEvenementNRBCAutreEvenement().clear();
				getEstSujetAssociationEvenementNRBCAutreEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				getEstObjetAssociationAutreEvenementEvenementNRBC().clear();
				getEstObjetAssociationAutreEvenementEvenementNRBC().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				getEstSujetAssociationEvenementNRBCAction().clear();
				getEstSujetAssociationEvenementNRBCAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				getEstObjetAssociationActionEvenementNRBC().clear();
				getEstObjetAssociationActionEvenementNRBC().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NUMERO_SEQUENCE:
				setNumeroSequence(NUMERO_SEQUENCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NATURE_REJET:
				unsetNatureRejet();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__PUISSANCE_DETONATION:
				unsetPuissanceDetonation();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DESCRIPTION_ROTA:
				unsetDescriptionROTA();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DETECTE:
				unsetDetecte();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CONFIRME:
				unsetConfirme();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DATE_DETECTION:
				setDateDetection(DATE_DETECTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_REJET:
				unsetTypeRejet();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_CONTENEUR:
				unsetTypeConteneur();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NOMBRE_CONTENEUR:
				unsetNombreConteneur();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NATIONALITE:
				unsetNationalite();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__RESULTAT_DOMMAGE_POTENTIEL:
				unsetResultatDommagePotentiel();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_AUTORITE_ORIGINE:
				setCodeAutoriteOrigine(CODE_AUTORITE_ORIGINE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_VALIDATION:
				setCodeValidation(CODE_VALIDATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_CENTRE_CONTROLE_SECTEUR:
				setCodeCentreControleSecteur(CODE_CENTRE_CONTROLE_SECTEUR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__PROFONDEUR_ZONE_DANGER:
				setProfondeurZoneDanger((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_DANGER:
				setDureeDangerEnZoneDanger((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_ATTAQUEE:
				setDureeDangerEnZoneAttaquee((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__REFERENCES_GEOGRAPHIQUES:
				setReferencesGeographiques(REFERENCES_GEOGRAPHIQUES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				getAPourEnvironnementEnvironnementTerrainEtVegetation().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_MOYEN_DISPERSION_MOYEN_DISPERSION:
				setAPourMoyenDispersionMoyenDispersion((TypeMoyenDispersion)null);
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				getAPourConditionsMeteoTrancheMeteo().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				getEstDetecteParTypeEquipementNRBC().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				getEstObjetAssociationSyntheseDetectionsEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_PRELEVEMENTS_EFFECTUES_PRELEVEMENT:
				getAPourPrelevementsEffectuesPrelevement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZONES_CONTAMINEES_PREVUES_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesContamineesPrevuesAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZD_VPAR_PERIODE_ZD_VPAR_PERIODE:
				getAPourZDVparPeriodeZDVparPeriode().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				getEstSujetAssociationEvenementNRBCEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				getEstObjetAssociationEvenementNRBCEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				getEstSujetAssociationEvenementNRBCAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				getEstObjetAssociationAutreEvenementEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				getEstSujetAssociationEvenementNRBCAction().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				getEstObjetAssociationActionEvenementNRBC().clear();
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
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NUMERO_SEQUENCE:
				return NUMERO_SEQUENCE_EDEFAULT == null ? numeroSequence != null : !NUMERO_SEQUENCE_EDEFAULT.equals(numeroSequence);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NATURE_REJET:
				return isSetNatureRejet();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__PUISSANCE_DETONATION:
				return isSetPuissanceDetonation();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DESCRIPTION_ROTA:
				return isSetDescriptionROTA();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DETECTE:
				return isSetDetecte();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CONFIRME:
				return isSetConfirme();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DATE_DETECTION:
				return DATE_DETECTION_EDEFAULT == null ? dateDetection != null : !DATE_DETECTION_EDEFAULT.equals(dateDetection);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_REJET:
				return isSetTypeRejet();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__TYPE_CONTENEUR:
				return isSetTypeConteneur();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NOMBRE_CONTENEUR:
				return isSetNombreConteneur();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__NATIONALITE:
				return isSetNationalite();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__RESULTAT_DOMMAGE_POTENTIEL:
				return isSetResultatDommagePotentiel();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_AUTORITE_ORIGINE:
				return CODE_AUTORITE_ORIGINE_EDEFAULT == null ? codeAutoriteOrigine != null : !CODE_AUTORITE_ORIGINE_EDEFAULT.equals(codeAutoriteOrigine);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_VALIDATION:
				return CODE_VALIDATION_EDEFAULT == null ? codeValidation != null : !CODE_VALIDATION_EDEFAULT.equals(codeValidation);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__CODE_CENTRE_CONTROLE_SECTEUR:
				return CODE_CENTRE_CONTROLE_SECTEUR_EDEFAULT == null ? codeCentreControleSecteur != null : !CODE_CENTRE_CONTROLE_SECTEUR_EDEFAULT.equals(codeCentreControleSecteur);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__PROFONDEUR_ZONE_DANGER:
				return profondeurZoneDanger != null;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_DANGER:
				return dureeDangerEnZoneDanger != null;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__DUREE_DANGER_EN_ZONE_ATTAQUEE:
				return dureeDangerEnZoneAttaquee != null;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__REFERENCES_GEOGRAPHIQUES:
				return REFERENCES_GEOGRAPHIQUES_EDEFAULT == null ? referencesGeographiques != null : !REFERENCES_GEOGRAPHIQUES_EDEFAULT.equals(referencesGeographiques);
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				return aPourEnvironnementEnvironnementTerrainEtVegetation != null && !aPourEnvironnementEnvironnementTerrainEtVegetation.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_MOYEN_DISPERSION_MOYEN_DISPERSION:
				return aPourMoyenDispersionMoyenDispersion != null;
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				return aPourConditionsMeteoTrancheMeteo != null && !aPourConditionsMeteoTrancheMeteo.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				return estDetecteParTypeEquipementNRBC != null && !estDetecteParTypeEquipementNRBC.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				return estObjetAssociationSyntheseDetectionsEvenementNRBC != null && !estObjetAssociationSyntheseDetectionsEvenementNRBC.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_PRELEVEMENTS_EFFECTUES_PRELEVEMENT:
				return aPourPrelevementsEffectuesPrelevement != null && !aPourPrelevementsEffectuesPrelevement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZONES_CONTAMINEES_PREVUES_AUTRE_ELEMENT_CONTROLE:
				return aPourZonesContamineesPrevuesAutreElementControle != null && !aPourZonesContamineesPrevuesAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__APOUR_ZD_VPAR_PERIODE_ZD_VPAR_PERIODE:
				return aPourZDVparPeriodeZDVparPeriode != null && !aPourZDVparPeriodeZDVparPeriode.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				return estSujetAssociationEvenementNRBCEvenementNRBC != null && !estSujetAssociationEvenementNRBCEvenementNRBC.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC:
				return estObjetAssociationEvenementNRBCEvenementNRBC != null && !estObjetAssociationEvenementNRBCEvenementNRBC.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				return estSujetAssociationEvenementNRBCAutreEvenement != null && !estSujetAssociationEvenementNRBCAutreEvenement.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				return estObjetAssociationAutreEvenementEvenementNRBC != null && !estObjetAssociationAutreEvenementEvenementNRBC.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_SUJET_ASSOCIATION_EVENEMENT_NRBC_ACTION:
				return estSujetAssociationEvenementNRBCAction != null && !estSujetAssociationEvenementNRBCAction.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_NRBC__EST_OBJET_ASSOCIATION_ACTION_EVENEMENT_NRBC:
				return estObjetAssociationActionEvenementNRBC != null && !estObjetAssociationActionEvenementNRBC.isEmpty();
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
		result.append(" (numeroSequence: ");
		result.append(numeroSequence);
		result.append(", natureRejet: ");
		if (natureRejetESet) result.append(natureRejet); else result.append("<unset>");
		result.append(", puissanceDetonation: ");
		if (puissanceDetonationESet) result.append(puissanceDetonation); else result.append("<unset>");
		result.append(", descriptionROTA: ");
		if (descriptionROTAESet) result.append(descriptionROTA); else result.append("<unset>");
		result.append(", detecte: ");
		if (detecteESet) result.append(detecte); else result.append("<unset>");
		result.append(", confirme: ");
		if (confirmeESet) result.append(confirme); else result.append("<unset>");
		result.append(", dateDetection: ");
		result.append(dateDetection);
		result.append(", typeRejet: ");
		if (typeRejetESet) result.append(typeRejet); else result.append("<unset>");
		result.append(", typeConteneur: ");
		if (typeConteneurESet) result.append(typeConteneur); else result.append("<unset>");
		result.append(", nombreConteneur: ");
		if (nombreConteneurESet) result.append(nombreConteneur); else result.append("<unset>");
		result.append(", nationalite: ");
		if (nationaliteESet) result.append(nationalite); else result.append("<unset>");
		result.append(", resultatDommagePotentiel: ");
		if (resultatDommagePotentielESet) result.append(resultatDommagePotentiel); else result.append("<unset>");
		result.append(", codeAutoriteOrigine: ");
		result.append(codeAutoriteOrigine);
		result.append(", codeValidation: ");
		result.append(codeValidation);
		result.append(", codeCentreControleSecteur: ");
		result.append(codeCentreControleSecteur);
		result.append(", referencesGeographiques: ");
		result.append(referencesGeographiques);
		result.append(')');
		return result.toString();
	}

} //TypeEvenementNRBCImpl
