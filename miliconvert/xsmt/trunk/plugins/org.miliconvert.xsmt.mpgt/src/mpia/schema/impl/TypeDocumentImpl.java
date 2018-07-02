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
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDocumentModeTransmission;
import mpia.schema.TypeDictionaryDicoDocumentPhaseCycleVie;
import mpia.schema.TypeDictionaryDicoDocumentSupport;
import mpia.schema.TypeDictionaryDicoDocumentType;
import mpia.schema.TypeDictionaryDicoDocumentVerification;
import mpia.schema.TypeDictionaryDicoLangue;
import mpia.schema.TypeDocument;

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
 * An implementation of the model object '<em><b>Type Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getPhaseCycleVie <em>Phase Cycle Vie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getTitreCourt <em>Titre Court</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getVerification <em>Verification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getSujet <em>Sujet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getMotsCles <em>Mots Cles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getAuteur <em>Auteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getLangue <em>Langue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getCheminAcces <em>Chemin Acces</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getEmplacement <em>Emplacement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getSupport <em>Support</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getSourceInformatique <em>Source Informatique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getTailleFichierInformatique <em>Taille Fichier Informatique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getTaillePhysique <em>Taille Physique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getDateCreation <em>Date Creation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getDateModification <em>Date Modification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getDateApprobation <em>Date Approbation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getDatePublication <em>Date Publication</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getDebutValidite <em>Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getFinValidite <em>Fin Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getModeTransmission <em>Mode Transmission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getRestrictionsDiffusion <em>Restrictions Diffusion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getObservations <em>Observations</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getDocumenteAssociationObjectifCiblageDocument <em>Documente Association Objectif Ciblage Document</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getDocumenteCapaciteAssociationDocumentCapacite <em>Documente Capacite Association Document Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentImpl#getDocumenteAssociationRacineOperationnelleDocument <em>Documente Association Racine Operationnelle Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDocumentImpl extends TypeRacineOperationnelleImpl implements TypeDocument {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDocumentType TYPE_EDEFAULT = TypeDictionaryDicoDocumentType.ADMDOC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDocumentType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getPhaseCycleVie() <em>Phase Cycle Vie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCycleVie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDocumentPhaseCycleVie PHASE_CYCLE_VIE_EDEFAULT = TypeDictionaryDicoDocumentPhaseCycleVie.DRAFT;

	/**
	 * The cached value of the '{@link #getPhaseCycleVie() <em>Phase Cycle Vie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCycleVie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDocumentPhaseCycleVie phaseCycleVie = PHASE_CYCLE_VIE_EDEFAULT;

	/**
	 * This is true if the Phase Cycle Vie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCycleVieESet;

	/**
	 * The default value of the '{@link #getTitreCourt() <em>Titre Court</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitreCourt()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_COURT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitreCourt() <em>Titre Court</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitreCourt()
	 * @generated
	 * @ordered
	 */
	protected String titreCourt = TITRE_COURT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerification() <em>Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerification()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDocumentVerification VERIFICATION_EDEFAULT = TypeDictionaryDicoDocumentVerification.REFVER;

	/**
	 * The cached value of the '{@link #getVerification() <em>Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerification()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDocumentVerification verification = VERIFICATION_EDEFAULT;

	/**
	 * This is true if the Verification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verificationESet;

	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSujet() <em>Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSujet()
	 * @generated
	 * @ordered
	 */
	protected static final String SUJET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSujet() <em>Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSujet()
	 * @generated
	 * @ordered
	 */
	protected String sujet = SUJET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotsCles() <em>Mots Cles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotsCles()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTS_CLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotsCles() <em>Mots Cles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotsCles()
	 * @generated
	 * @ordered
	 */
	protected String motsCles = MOTS_CLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuteur() <em>Auteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteur()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuteur() <em>Auteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteur()
	 * @generated
	 * @ordered
	 */
	protected String auteur = AUTEUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangue() <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangue()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLangue LANGUE_EDEFAULT = TypeDictionaryDicoLangue.AFGHAN;

	/**
	 * The cached value of the '{@link #getLangue() <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangue()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLangue langue = LANGUE_EDEFAULT;

	/**
	 * This is true if the Langue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean langueESet;

	/**
	 * The default value of the '{@link #getCheminAcces() <em>Chemin Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheminAcces()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEMIN_ACCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheminAcces() <em>Chemin Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheminAcces()
	 * @generated
	 * @ordered
	 */
	protected String cheminAcces = CHEMIN_ACCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmplacement() <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplacement()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplacement() <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplacement()
	 * @generated
	 * @ordered
	 */
	protected String emplacement = EMPLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupport() <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDocumentSupport SUPPORT_EDEFAULT = TypeDictionaryDicoDocumentSupport.ELCFLN;

	/**
	 * The cached value of the '{@link #getSupport() <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDocumentSupport support = SUPPORT_EDEFAULT;

	/**
	 * This is true if the Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean supportESet;

	/**
	 * The default value of the '{@link #getSourceInformatique() <em>Source Informatique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInformatique()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_INFORMATIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceInformatique() <em>Source Informatique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInformatique()
	 * @generated
	 * @ordered
	 */
	protected String sourceInformatique = SOURCE_INFORMATIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTailleFichierInformatique() <em>Taille Fichier Informatique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleFichierInformatique()
	 * @generated
	 * @ordered
	 */
	protected static final String TAILLE_FICHIER_INFORMATIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTailleFichierInformatique() <em>Taille Fichier Informatique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleFichierInformatique()
	 * @generated
	 * @ordered
	 */
	protected String tailleFichierInformatique = TAILLE_FICHIER_INFORMATIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaillePhysique() <em>Taille Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaillePhysique()
	 * @generated
	 * @ordered
	 */
	protected static final String TAILLE_PHYSIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaillePhysique() <em>Taille Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaillePhysique()
	 * @generated
	 * @ordered
	 */
	protected String taillePhysique = TAILLE_PHYSIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateCreation() <em>Date Creation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateCreation;

	/**
	 * The default value of the '{@link #getDateModification() <em>Date Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModification()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_MODIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateModification() <em>Date Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModification()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateModification = DATE_MODIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateApprobation() <em>Date Approbation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateApprobation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateApprobation;

	/**
	 * The cached value of the '{@link #getDatePublication() <em>Date Publication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePublication()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure datePublication;

	/**
	 * The cached value of the '{@link #getDebutValidite() <em>Debut Validite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutValidite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure debutValidite;

	/**
	 * The cached value of the '{@link #getFinValidite() <em>Fin Validite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinValidite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure finValidite;

	/**
	 * The default value of the '{@link #getModeTransmission() <em>Mode Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeTransmission()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDocumentModeTransmission MODE_TRANSMISSION_EDEFAULT = TypeDictionaryDicoDocumentModeTransmission.COUMSG;

	/**
	 * The cached value of the '{@link #getModeTransmission() <em>Mode Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeTransmission()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDocumentModeTransmission modeTransmission = MODE_TRANSMISSION_EDEFAULT;

	/**
	 * This is true if the Mode Transmission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeTransmissionESet;

	/**
	 * The default value of the '{@link #getRestrictionsDiffusion() <em>Restrictions Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionsDiffusion()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTRICTIONS_DIFFUSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestrictionsDiffusion() <em>Restrictions Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionsDiffusion()
	 * @generated
	 * @ordered
	 */
	protected String restrictionsDiffusion = RESTRICTIONS_DIFFUSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservations() <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservations() <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected String observations = OBSERVATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourDegreClassificationDegreClassification() <em>APour Degre Classification Degre Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDegreClassificationDegreClassification()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourDegreClassificationDegreClassification;

	/**
	 * The cached value of the '{@link #getDocumenteAssociationObjectifCiblageDocument() <em>Documente Association Objectif Ciblage Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumenteAssociationObjectifCiblageDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> documenteAssociationObjectifCiblageDocument;

	/**
	 * The cached value of the '{@link #getDocumenteCapaciteAssociationDocumentCapacite() <em>Documente Capacite Association Document Capacite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumenteCapaciteAssociationDocumentCapacite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> documenteCapaciteAssociationDocumentCapacite;

	/**
	 * The cached value of the '{@link #getDocumenteAssociationRacineOperationnelleDocument() <em>Documente Association Racine Operationnelle Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumenteAssociationRacineOperationnelleDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> documenteAssociationRacineOperationnelleDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDocumentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoDocumentType newType) {
		TypeDictionaryDicoDocumentType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoDocumentType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOCUMENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public TypeDictionaryDicoDocumentPhaseCycleVie getPhaseCycleVie() {
		return phaseCycleVie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCycleVie(TypeDictionaryDicoDocumentPhaseCycleVie newPhaseCycleVie) {
		TypeDictionaryDicoDocumentPhaseCycleVie oldPhaseCycleVie = phaseCycleVie;
		phaseCycleVie = newPhaseCycleVie == null ? PHASE_CYCLE_VIE_EDEFAULT : newPhaseCycleVie;
		boolean oldPhaseCycleVieESet = phaseCycleVieESet;
		phaseCycleVieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__PHASE_CYCLE_VIE, oldPhaseCycleVie, phaseCycleVie, !oldPhaseCycleVieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhaseCycleVie() {
		TypeDictionaryDicoDocumentPhaseCycleVie oldPhaseCycleVie = phaseCycleVie;
		boolean oldPhaseCycleVieESet = phaseCycleVieESet;
		phaseCycleVie = PHASE_CYCLE_VIE_EDEFAULT;
		phaseCycleVieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOCUMENT__PHASE_CYCLE_VIE, oldPhaseCycleVie, PHASE_CYCLE_VIE_EDEFAULT, oldPhaseCycleVieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhaseCycleVie() {
		return phaseCycleVieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitreCourt() {
		return titreCourt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitreCourt(String newTitreCourt) {
		String oldTitreCourt = titreCourt;
		titreCourt = newTitreCourt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__TITRE_COURT, oldTitreCourt, titreCourt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDocumentVerification getVerification() {
		return verification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerification(TypeDictionaryDicoDocumentVerification newVerification) {
		TypeDictionaryDicoDocumentVerification oldVerification = verification;
		verification = newVerification == null ? VERIFICATION_EDEFAULT : newVerification;
		boolean oldVerificationESet = verificationESet;
		verificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__VERIFICATION, oldVerification, verification, !oldVerificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerification() {
		TypeDictionaryDicoDocumentVerification oldVerification = verification;
		boolean oldVerificationESet = verificationESet;
		verification = VERIFICATION_EDEFAULT;
		verificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOCUMENT__VERIFICATION, oldVerification, VERIFICATION_EDEFAULT, oldVerificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerification() {
		return verificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSujet() {
		return sujet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSujet(String newSujet) {
		String oldSujet = sujet;
		sujet = newSujet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__SUJET, oldSujet, sujet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotsCles() {
		return motsCles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotsCles(String newMotsCles) {
		String oldMotsCles = motsCles;
		motsCles = newMotsCles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__MOTS_CLES, oldMotsCles, motsCles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuteur(String newAuteur) {
		String oldAuteur = auteur;
		auteur = newAuteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__AUTEUR, oldAuteur, auteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLangue getLangue() {
		return langue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangue(TypeDictionaryDicoLangue newLangue) {
		TypeDictionaryDicoLangue oldLangue = langue;
		langue = newLangue == null ? LANGUE_EDEFAULT : newLangue;
		boolean oldLangueESet = langueESet;
		langueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__LANGUE, oldLangue, langue, !oldLangueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLangue() {
		TypeDictionaryDicoLangue oldLangue = langue;
		boolean oldLangueESet = langueESet;
		langue = LANGUE_EDEFAULT;
		langueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOCUMENT__LANGUE, oldLangue, LANGUE_EDEFAULT, oldLangueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLangue() {
		return langueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheminAcces() {
		return cheminAcces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheminAcces(String newCheminAcces) {
		String oldCheminAcces = cheminAcces;
		cheminAcces = newCheminAcces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__CHEMIN_ACCES, oldCheminAcces, cheminAcces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmplacement() {
		return emplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmplacement(String newEmplacement) {
		String oldEmplacement = emplacement;
		emplacement = newEmplacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__EMPLACEMENT, oldEmplacement, emplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDocumentSupport getSupport() {
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupport(TypeDictionaryDicoDocumentSupport newSupport) {
		TypeDictionaryDicoDocumentSupport oldSupport = support;
		support = newSupport == null ? SUPPORT_EDEFAULT : newSupport;
		boolean oldSupportESet = supportESet;
		supportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__SUPPORT, oldSupport, support, !oldSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSupport() {
		TypeDictionaryDicoDocumentSupport oldSupport = support;
		boolean oldSupportESet = supportESet;
		support = SUPPORT_EDEFAULT;
		supportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOCUMENT__SUPPORT, oldSupport, SUPPORT_EDEFAULT, oldSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSupport() {
		return supportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceInformatique() {
		return sourceInformatique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceInformatique(String newSourceInformatique) {
		String oldSourceInformatique = sourceInformatique;
		sourceInformatique = newSourceInformatique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__SOURCE_INFORMATIQUE, oldSourceInformatique, sourceInformatique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTailleFichierInformatique() {
		return tailleFichierInformatique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTailleFichierInformatique(String newTailleFichierInformatique) {
		String oldTailleFichierInformatique = tailleFichierInformatique;
		tailleFichierInformatique = newTailleFichierInformatique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__TAILLE_FICHIER_INFORMATIQUE, oldTailleFichierInformatique, tailleFichierInformatique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaillePhysique() {
		return taillePhysique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaillePhysique(String newTaillePhysique) {
		String oldTaillePhysique = taillePhysique;
		taillePhysique = newTaillePhysique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__TAILLE_PHYSIQUE, oldTaillePhysique, taillePhysique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateCreation() {
		return dateCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateCreation(TypeDataTypeDateHeure newDateCreation, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateCreation = dateCreation;
		dateCreation = newDateCreation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__DATE_CREATION, oldDateCreation, newDateCreation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreation(TypeDataTypeDateHeure newDateCreation) {
		if (newDateCreation != dateCreation) {
			NotificationChain msgs = null;
			if (dateCreation != null)
				msgs = ((InternalEObject)dateCreation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__DATE_CREATION, null, msgs);
			if (newDateCreation != null)
				msgs = ((InternalEObject)newDateCreation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__DATE_CREATION, null, msgs);
			msgs = basicSetDateCreation(newDateCreation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__DATE_CREATION, newDateCreation, newDateCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateModification() {
		return dateModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateModification(XMLGregorianCalendar newDateModification) {
		XMLGregorianCalendar oldDateModification = dateModification;
		dateModification = newDateModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__DATE_MODIFICATION, oldDateModification, dateModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateApprobation() {
		return dateApprobation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateApprobation(TypeDataTypeDateHeure newDateApprobation, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateApprobation = dateApprobation;
		dateApprobation = newDateApprobation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__DATE_APPROBATION, oldDateApprobation, newDateApprobation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateApprobation(TypeDataTypeDateHeure newDateApprobation) {
		if (newDateApprobation != dateApprobation) {
			NotificationChain msgs = null;
			if (dateApprobation != null)
				msgs = ((InternalEObject)dateApprobation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__DATE_APPROBATION, null, msgs);
			if (newDateApprobation != null)
				msgs = ((InternalEObject)newDateApprobation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__DATE_APPROBATION, null, msgs);
			msgs = basicSetDateApprobation(newDateApprobation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__DATE_APPROBATION, newDateApprobation, newDateApprobation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDatePublication() {
		return datePublication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatePublication(TypeDataTypeDateHeure newDatePublication, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDatePublication = datePublication;
		datePublication = newDatePublication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__DATE_PUBLICATION, oldDatePublication, newDatePublication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePublication(TypeDataTypeDateHeure newDatePublication) {
		if (newDatePublication != datePublication) {
			NotificationChain msgs = null;
			if (datePublication != null)
				msgs = ((InternalEObject)datePublication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__DATE_PUBLICATION, null, msgs);
			if (newDatePublication != null)
				msgs = ((InternalEObject)newDatePublication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__DATE_PUBLICATION, null, msgs);
			msgs = basicSetDatePublication(newDatePublication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__DATE_PUBLICATION, newDatePublication, newDatePublication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDebutValidite() {
		return debutValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebutValidite(TypeDataTypeDateHeure newDebutValidite, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDebutValidite = debutValidite;
		debutValidite = newDebutValidite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__DEBUT_VALIDITE, oldDebutValidite, newDebutValidite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutValidite(TypeDataTypeDateHeure newDebutValidite) {
		if (newDebutValidite != debutValidite) {
			NotificationChain msgs = null;
			if (debutValidite != null)
				msgs = ((InternalEObject)debutValidite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__DEBUT_VALIDITE, null, msgs);
			if (newDebutValidite != null)
				msgs = ((InternalEObject)newDebutValidite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__DEBUT_VALIDITE, null, msgs);
			msgs = basicSetDebutValidite(newDebutValidite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__DEBUT_VALIDITE, newDebutValidite, newDebutValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getFinValidite() {
		return finValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinValidite(TypeDataTypeDateHeure newFinValidite, NotificationChain msgs) {
		TypeDataTypeDateHeure oldFinValidite = finValidite;
		finValidite = newFinValidite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__FIN_VALIDITE, oldFinValidite, newFinValidite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinValidite(TypeDataTypeDateHeure newFinValidite) {
		if (newFinValidite != finValidite) {
			NotificationChain msgs = null;
			if (finValidite != null)
				msgs = ((InternalEObject)finValidite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__FIN_VALIDITE, null, msgs);
			if (newFinValidite != null)
				msgs = ((InternalEObject)newFinValidite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__FIN_VALIDITE, null, msgs);
			msgs = basicSetFinValidite(newFinValidite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__FIN_VALIDITE, newFinValidite, newFinValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDocumentModeTransmission getModeTransmission() {
		return modeTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeTransmission(TypeDictionaryDicoDocumentModeTransmission newModeTransmission) {
		TypeDictionaryDicoDocumentModeTransmission oldModeTransmission = modeTransmission;
		modeTransmission = newModeTransmission == null ? MODE_TRANSMISSION_EDEFAULT : newModeTransmission;
		boolean oldModeTransmissionESet = modeTransmissionESet;
		modeTransmissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__MODE_TRANSMISSION, oldModeTransmission, modeTransmission, !oldModeTransmissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeTransmission() {
		TypeDictionaryDicoDocumentModeTransmission oldModeTransmission = modeTransmission;
		boolean oldModeTransmissionESet = modeTransmissionESet;
		modeTransmission = MODE_TRANSMISSION_EDEFAULT;
		modeTransmissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOCUMENT__MODE_TRANSMISSION, oldModeTransmission, MODE_TRANSMISSION_EDEFAULT, oldModeTransmissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeTransmission() {
		return modeTransmissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestrictionsDiffusion() {
		return restrictionsDiffusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionsDiffusion(String newRestrictionsDiffusion) {
		String oldRestrictionsDiffusion = restrictionsDiffusion;
		restrictionsDiffusion = newRestrictionsDiffusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__RESTRICTIONS_DIFFUSION, oldRestrictionsDiffusion, restrictionsDiffusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservations() {
		return observations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservations(String newObservations) {
		String oldObservations = observations;
		observations = newObservations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__OBSERVATIONS, oldObservations, observations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourDegreClassificationDegreClassification() {
		return aPourDegreClassificationDegreClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDegreClassificationDegreClassification(TypeAssociation newAPourDegreClassificationDegreClassification, NotificationChain msgs) {
		TypeAssociation oldAPourDegreClassificationDegreClassification = aPourDegreClassificationDegreClassification;
		aPourDegreClassificationDegreClassification = newAPourDegreClassificationDegreClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, oldAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDegreClassificationDegreClassification(TypeAssociation newAPourDegreClassificationDegreClassification) {
		if (newAPourDegreClassificationDegreClassification != aPourDegreClassificationDegreClassification) {
			NotificationChain msgs = null;
			if (aPourDegreClassificationDegreClassification != null)
				msgs = ((InternalEObject)aPourDegreClassificationDegreClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			if (newAPourDegreClassificationDegreClassification != null)
				msgs = ((InternalEObject)newAPourDegreClassificationDegreClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOCUMENT__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			msgs = basicSetAPourDegreClassificationDegreClassification(newAPourDegreClassificationDegreClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, newAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDocumenteAssociationObjectifCiblageDocument() {
		if (documenteAssociationObjectifCiblageDocument == null) {
			documenteAssociationObjectifCiblageDocument = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT);
		}
		return documenteAssociationObjectifCiblageDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDocumenteCapaciteAssociationDocumentCapacite() {
		if (documenteCapaciteAssociationDocumentCapacite == null) {
			documenteCapaciteAssociationDocumentCapacite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_CAPACITE_ASSOCIATION_DOCUMENT_CAPACITE);
		}
		return documenteCapaciteAssociationDocumentCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDocumenteAssociationRacineOperationnelleDocument() {
		if (documenteAssociationRacineOperationnelleDocument == null) {
			documenteAssociationRacineOperationnelleDocument = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT);
		}
		return documenteAssociationRacineOperationnelleDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOCUMENT__DATE_CREATION:
				return basicSetDateCreation(null, msgs);
			case SchemaPackage.TYPE_DOCUMENT__DATE_APPROBATION:
				return basicSetDateApprobation(null, msgs);
			case SchemaPackage.TYPE_DOCUMENT__DATE_PUBLICATION:
				return basicSetDatePublication(null, msgs);
			case SchemaPackage.TYPE_DOCUMENT__DEBUT_VALIDITE:
				return basicSetDebutValidite(null, msgs);
			case SchemaPackage.TYPE_DOCUMENT__FIN_VALIDITE:
				return basicSetFinValidite(null, msgs);
			case SchemaPackage.TYPE_DOCUMENT__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return basicSetAPourDegreClassificationDegreClassification(null, msgs);
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				return ((InternalEList<?>)getDocumenteAssociationObjectifCiblageDocument()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_CAPACITE_ASSOCIATION_DOCUMENT_CAPACITE:
				return ((InternalEList<?>)getDocumenteCapaciteAssociationDocumentCapacite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				return ((InternalEList<?>)getDocumenteAssociationRacineOperationnelleDocument()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DOCUMENT__TYPE:
				return getType();
			case SchemaPackage.TYPE_DOCUMENT__PHASE_CYCLE_VIE:
				return getPhaseCycleVie();
			case SchemaPackage.TYPE_DOCUMENT__TITRE_COURT:
				return getTitreCourt();
			case SchemaPackage.TYPE_DOCUMENT__REFERENCE:
				return getReference();
			case SchemaPackage.TYPE_DOCUMENT__VERIFICATION:
				return getVerification();
			case SchemaPackage.TYPE_DOCUMENT__TITRE:
				return getTitre();
			case SchemaPackage.TYPE_DOCUMENT__VERSION:
				return getVersion();
			case SchemaPackage.TYPE_DOCUMENT__SUJET:
				return getSujet();
			case SchemaPackage.TYPE_DOCUMENT__MOTS_CLES:
				return getMotsCles();
			case SchemaPackage.TYPE_DOCUMENT__AUTEUR:
				return getAuteur();
			case SchemaPackage.TYPE_DOCUMENT__LANGUE:
				return getLangue();
			case SchemaPackage.TYPE_DOCUMENT__CHEMIN_ACCES:
				return getCheminAcces();
			case SchemaPackage.TYPE_DOCUMENT__EMPLACEMENT:
				return getEmplacement();
			case SchemaPackage.TYPE_DOCUMENT__FORMAT:
				return getFormat();
			case SchemaPackage.TYPE_DOCUMENT__SUPPORT:
				return getSupport();
			case SchemaPackage.TYPE_DOCUMENT__SOURCE_INFORMATIQUE:
				return getSourceInformatique();
			case SchemaPackage.TYPE_DOCUMENT__TAILLE_FICHIER_INFORMATIQUE:
				return getTailleFichierInformatique();
			case SchemaPackage.TYPE_DOCUMENT__TAILLE_PHYSIQUE:
				return getTaillePhysique();
			case SchemaPackage.TYPE_DOCUMENT__DATE_CREATION:
				return getDateCreation();
			case SchemaPackage.TYPE_DOCUMENT__DATE_MODIFICATION:
				return getDateModification();
			case SchemaPackage.TYPE_DOCUMENT__DATE_APPROBATION:
				return getDateApprobation();
			case SchemaPackage.TYPE_DOCUMENT__DATE_PUBLICATION:
				return getDatePublication();
			case SchemaPackage.TYPE_DOCUMENT__DEBUT_VALIDITE:
				return getDebutValidite();
			case SchemaPackage.TYPE_DOCUMENT__FIN_VALIDITE:
				return getFinValidite();
			case SchemaPackage.TYPE_DOCUMENT__MODE_TRANSMISSION:
				return getModeTransmission();
			case SchemaPackage.TYPE_DOCUMENT__RESTRICTIONS_DIFFUSION:
				return getRestrictionsDiffusion();
			case SchemaPackage.TYPE_DOCUMENT__OBSERVATIONS:
				return getObservations();
			case SchemaPackage.TYPE_DOCUMENT__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return getAPourDegreClassificationDegreClassification();
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				return getDocumenteAssociationObjectifCiblageDocument();
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_CAPACITE_ASSOCIATION_DOCUMENT_CAPACITE:
				return getDocumenteCapaciteAssociationDocumentCapacite();
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				return getDocumenteAssociationRacineOperationnelleDocument();
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
			case SchemaPackage.TYPE_DOCUMENT__TYPE:
				setType((TypeDictionaryDicoDocumentType)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__PHASE_CYCLE_VIE:
				setPhaseCycleVie((TypeDictionaryDicoDocumentPhaseCycleVie)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__TITRE_COURT:
				setTitreCourt((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__REFERENCE:
				setReference((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__VERIFICATION:
				setVerification((TypeDictionaryDicoDocumentVerification)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__TITRE:
				setTitre((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__VERSION:
				setVersion((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__SUJET:
				setSujet((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__MOTS_CLES:
				setMotsCles((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__AUTEUR:
				setAuteur((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__LANGUE:
				setLangue((TypeDictionaryDicoLangue)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__CHEMIN_ACCES:
				setCheminAcces((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__EMPLACEMENT:
				setEmplacement((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__FORMAT:
				setFormat((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__SUPPORT:
				setSupport((TypeDictionaryDicoDocumentSupport)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__SOURCE_INFORMATIQUE:
				setSourceInformatique((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__TAILLE_FICHIER_INFORMATIQUE:
				setTailleFichierInformatique((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__TAILLE_PHYSIQUE:
				setTaillePhysique((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DATE_CREATION:
				setDateCreation((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DATE_MODIFICATION:
				setDateModification((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DATE_APPROBATION:
				setDateApprobation((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DATE_PUBLICATION:
				setDatePublication((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DEBUT_VALIDITE:
				setDebutValidite((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__FIN_VALIDITE:
				setFinValidite((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__MODE_TRANSMISSION:
				setModeTransmission((TypeDictionaryDicoDocumentModeTransmission)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__RESTRICTIONS_DIFFUSION:
				setRestrictionsDiffusion((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__OBSERVATIONS:
				setObservations((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				getDocumenteAssociationObjectifCiblageDocument().clear();
				getDocumenteAssociationObjectifCiblageDocument().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_CAPACITE_ASSOCIATION_DOCUMENT_CAPACITE:
				getDocumenteCapaciteAssociationDocumentCapacite().clear();
				getDocumenteCapaciteAssociationDocumentCapacite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				getDocumenteAssociationRacineOperationnelleDocument().clear();
				getDocumenteAssociationRacineOperationnelleDocument().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_DOCUMENT__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_DOCUMENT__PHASE_CYCLE_VIE:
				unsetPhaseCycleVie();
				return;
			case SchemaPackage.TYPE_DOCUMENT__TITRE_COURT:
				setTitreCourt(TITRE_COURT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__VERIFICATION:
				unsetVerification();
				return;
			case SchemaPackage.TYPE_DOCUMENT__TITRE:
				setTitre(TITRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__SUJET:
				setSujet(SUJET_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__MOTS_CLES:
				setMotsCles(MOTS_CLES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__AUTEUR:
				setAuteur(AUTEUR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__LANGUE:
				unsetLangue();
				return;
			case SchemaPackage.TYPE_DOCUMENT__CHEMIN_ACCES:
				setCheminAcces(CHEMIN_ACCES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__EMPLACEMENT:
				setEmplacement(EMPLACEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__SUPPORT:
				unsetSupport();
				return;
			case SchemaPackage.TYPE_DOCUMENT__SOURCE_INFORMATIQUE:
				setSourceInformatique(SOURCE_INFORMATIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__TAILLE_FICHIER_INFORMATIQUE:
				setTailleFichierInformatique(TAILLE_FICHIER_INFORMATIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__TAILLE_PHYSIQUE:
				setTaillePhysique(TAILLE_PHYSIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DATE_CREATION:
				setDateCreation((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DATE_MODIFICATION:
				setDateModification(DATE_MODIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DATE_APPROBATION:
				setDateApprobation((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DATE_PUBLICATION:
				setDatePublication((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DEBUT_VALIDITE:
				setDebutValidite((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_DOCUMENT__FIN_VALIDITE:
				setFinValidite((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_DOCUMENT__MODE_TRANSMISSION:
				unsetModeTransmission();
				return;
			case SchemaPackage.TYPE_DOCUMENT__RESTRICTIONS_DIFFUSION:
				setRestrictionsDiffusion(RESTRICTIONS_DIFFUSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__OBSERVATIONS:
				setObservations(OBSERVATIONS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				getDocumenteAssociationObjectifCiblageDocument().clear();
				return;
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_CAPACITE_ASSOCIATION_DOCUMENT_CAPACITE:
				getDocumenteCapaciteAssociationDocumentCapacite().clear();
				return;
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				getDocumenteAssociationRacineOperationnelleDocument().clear();
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
			case SchemaPackage.TYPE_DOCUMENT__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_DOCUMENT__PHASE_CYCLE_VIE:
				return isSetPhaseCycleVie();
			case SchemaPackage.TYPE_DOCUMENT__TITRE_COURT:
				return TITRE_COURT_EDEFAULT == null ? titreCourt != null : !TITRE_COURT_EDEFAULT.equals(titreCourt);
			case SchemaPackage.TYPE_DOCUMENT__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case SchemaPackage.TYPE_DOCUMENT__VERIFICATION:
				return isSetVerification();
			case SchemaPackage.TYPE_DOCUMENT__TITRE:
				return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
			case SchemaPackage.TYPE_DOCUMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SchemaPackage.TYPE_DOCUMENT__SUJET:
				return SUJET_EDEFAULT == null ? sujet != null : !SUJET_EDEFAULT.equals(sujet);
			case SchemaPackage.TYPE_DOCUMENT__MOTS_CLES:
				return MOTS_CLES_EDEFAULT == null ? motsCles != null : !MOTS_CLES_EDEFAULT.equals(motsCles);
			case SchemaPackage.TYPE_DOCUMENT__AUTEUR:
				return AUTEUR_EDEFAULT == null ? auteur != null : !AUTEUR_EDEFAULT.equals(auteur);
			case SchemaPackage.TYPE_DOCUMENT__LANGUE:
				return isSetLangue();
			case SchemaPackage.TYPE_DOCUMENT__CHEMIN_ACCES:
				return CHEMIN_ACCES_EDEFAULT == null ? cheminAcces != null : !CHEMIN_ACCES_EDEFAULT.equals(cheminAcces);
			case SchemaPackage.TYPE_DOCUMENT__EMPLACEMENT:
				return EMPLACEMENT_EDEFAULT == null ? emplacement != null : !EMPLACEMENT_EDEFAULT.equals(emplacement);
			case SchemaPackage.TYPE_DOCUMENT__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case SchemaPackage.TYPE_DOCUMENT__SUPPORT:
				return isSetSupport();
			case SchemaPackage.TYPE_DOCUMENT__SOURCE_INFORMATIQUE:
				return SOURCE_INFORMATIQUE_EDEFAULT == null ? sourceInformatique != null : !SOURCE_INFORMATIQUE_EDEFAULT.equals(sourceInformatique);
			case SchemaPackage.TYPE_DOCUMENT__TAILLE_FICHIER_INFORMATIQUE:
				return TAILLE_FICHIER_INFORMATIQUE_EDEFAULT == null ? tailleFichierInformatique != null : !TAILLE_FICHIER_INFORMATIQUE_EDEFAULT.equals(tailleFichierInformatique);
			case SchemaPackage.TYPE_DOCUMENT__TAILLE_PHYSIQUE:
				return TAILLE_PHYSIQUE_EDEFAULT == null ? taillePhysique != null : !TAILLE_PHYSIQUE_EDEFAULT.equals(taillePhysique);
			case SchemaPackage.TYPE_DOCUMENT__DATE_CREATION:
				return dateCreation != null;
			case SchemaPackage.TYPE_DOCUMENT__DATE_MODIFICATION:
				return DATE_MODIFICATION_EDEFAULT == null ? dateModification != null : !DATE_MODIFICATION_EDEFAULT.equals(dateModification);
			case SchemaPackage.TYPE_DOCUMENT__DATE_APPROBATION:
				return dateApprobation != null;
			case SchemaPackage.TYPE_DOCUMENT__DATE_PUBLICATION:
				return datePublication != null;
			case SchemaPackage.TYPE_DOCUMENT__DEBUT_VALIDITE:
				return debutValidite != null;
			case SchemaPackage.TYPE_DOCUMENT__FIN_VALIDITE:
				return finValidite != null;
			case SchemaPackage.TYPE_DOCUMENT__MODE_TRANSMISSION:
				return isSetModeTransmission();
			case SchemaPackage.TYPE_DOCUMENT__RESTRICTIONS_DIFFUSION:
				return RESTRICTIONS_DIFFUSION_EDEFAULT == null ? restrictionsDiffusion != null : !RESTRICTIONS_DIFFUSION_EDEFAULT.equals(restrictionsDiffusion);
			case SchemaPackage.TYPE_DOCUMENT__OBSERVATIONS:
				return OBSERVATIONS_EDEFAULT == null ? observations != null : !OBSERVATIONS_EDEFAULT.equals(observations);
			case SchemaPackage.TYPE_DOCUMENT__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return aPourDegreClassificationDegreClassification != null;
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				return documenteAssociationObjectifCiblageDocument != null && !documenteAssociationObjectifCiblageDocument.isEmpty();
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_CAPACITE_ASSOCIATION_DOCUMENT_CAPACITE:
				return documenteCapaciteAssociationDocumentCapacite != null && !documenteCapaciteAssociationDocumentCapacite.isEmpty();
			case SchemaPackage.TYPE_DOCUMENT__DOCUMENTE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				return documenteAssociationRacineOperationnelleDocument != null && !documenteAssociationRacineOperationnelleDocument.isEmpty();
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", phaseCycleVie: ");
		if (phaseCycleVieESet) result.append(phaseCycleVie); else result.append("<unset>");
		result.append(", titreCourt: ");
		result.append(titreCourt);
		result.append(", reference: ");
		result.append(reference);
		result.append(", verification: ");
		if (verificationESet) result.append(verification); else result.append("<unset>");
		result.append(", titre: ");
		result.append(titre);
		result.append(", version: ");
		result.append(version);
		result.append(", sujet: ");
		result.append(sujet);
		result.append(", motsCles: ");
		result.append(motsCles);
		result.append(", auteur: ");
		result.append(auteur);
		result.append(", langue: ");
		if (langueESet) result.append(langue); else result.append("<unset>");
		result.append(", cheminAcces: ");
		result.append(cheminAcces);
		result.append(", emplacement: ");
		result.append(emplacement);
		result.append(", format: ");
		result.append(format);
		result.append(", support: ");
		if (supportESet) result.append(support); else result.append("<unset>");
		result.append(", sourceInformatique: ");
		result.append(sourceInformatique);
		result.append(", tailleFichierInformatique: ");
		result.append(tailleFichierInformatique);
		result.append(", taillePhysique: ");
		result.append(taillePhysique);
		result.append(", dateModification: ");
		result.append(dateModification);
		result.append(", modeTransmission: ");
		if (modeTransmissionESet) result.append(modeTransmission); else result.append("<unset>");
		result.append(", restrictionsDiffusion: ");
		result.append(restrictionsDiffusion);
		result.append(", observations: ");
		result.append(observations);
		result.append(')');
		return result.toString();
	}

} //TypeDocumentImpl
