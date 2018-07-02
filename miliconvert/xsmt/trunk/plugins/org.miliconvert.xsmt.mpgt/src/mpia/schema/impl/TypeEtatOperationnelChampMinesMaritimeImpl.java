/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur;
import mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines;
import mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM;
import mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace;
import mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat;
import mpia.schema.TypeEtatOperationnelChampMinesMaritime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Champ Mines Maritime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getCodeCouleur <em>Code Couleur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getNiveauEscompteMCM <em>Niveau Escompte MCM</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getNiveauMenace <em>Niveau Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getPourcentageMenace <em>Pourcentage Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getQuantiteMines <em>Quantite Mines</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getMoyensDetectionMines <em>Moyens Detection Mines</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getNombreMinesDetectees <em>Nombre Mines Detectees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getQuantiteMinesDetectees <em>Quantite Mines Detectees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getMouillage <em>Mouillage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelChampMinesMaritimeImpl#getProfondeurDragage <em>Profondeur Dragage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelChampMinesMaritimeImpl extends EObjectImpl implements TypeEtatOperationnelChampMinesMaritime {
	/**
	 * The default value of the '{@link #getQualificatifEtat() <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat QUALIFICATIF_ETAT_EDEFAULT = TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat.CLOSED;

	/**
	 * The cached value of the '{@link #getQualificatifEtat() <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;

	/**
	 * This is true if the Qualificatif Etat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifEtatESet;

	/**
	 * The default value of the '{@link #getCodeCouleur() <em>Code Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeCouleur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur CODE_COULEUR_EDEFAULT = TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur.GREEN;

	/**
	 * The cached value of the '{@link #getCodeCouleur() <em>Code Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeCouleur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur codeCouleur = CODE_COULEUR_EDEFAULT;

	/**
	 * This is true if the Code Couleur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeCouleurESet;

	/**
	 * The default value of the '{@link #getNiveauEscompteMCM() <em>Niveau Escompte MCM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEscompteMCM()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM NIVEAU_ESCOMPTE_MCM_EDEFAULT = TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM.HVYMCM;

	/**
	 * The cached value of the '{@link #getNiveauEscompteMCM() <em>Niveau Escompte MCM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEscompteMCM()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM niveauEscompteMCM = NIVEAU_ESCOMPTE_MCM_EDEFAULT;

	/**
	 * This is true if the Niveau Escompte MCM attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauEscompteMCMESet;

	/**
	 * The default value of the '{@link #getNiveauMenace() <em>Niveau Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauMenace()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace NIVEAU_MENACE_EDEFAULT = TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace.LITTLE;

	/**
	 * The cached value of the '{@link #getNiveauMenace() <em>Niveau Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauMenace()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace niveauMenace = NIVEAU_MENACE_EDEFAULT;

	/**
	 * This is true if the Niveau Menace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauMenaceESet;

	/**
	 * The default value of the '{@link #getPourcentageMenace() <em>Pourcentage Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageMenace()
	 * @generated
	 * @ordered
	 */
	protected static final double POURCENTAGE_MENACE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPourcentageMenace() <em>Pourcentage Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageMenace()
	 * @generated
	 * @ordered
	 */
	protected double pourcentageMenace = POURCENTAGE_MENACE_EDEFAULT;

	/**
	 * This is true if the Pourcentage Menace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageMenaceESet;

	/**
	 * The default value of the '{@link #getQuantiteMines() <em>Quantite Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMines()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MINES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMines() <em>Quantite Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMines()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMines = QUANTITE_MINES_EDEFAULT;

	/**
	 * This is true if the Quantite Mines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMinesESet;

	/**
	 * The default value of the '{@link #getMoyensDetectionMines() <em>Moyens Detection Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensDetectionMines()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines MOYENS_DETECTION_MINES_EDEFAULT = TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines.SGHTD;

	/**
	 * The cached value of the '{@link #getMoyensDetectionMines() <em>Moyens Detection Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensDetectionMines()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines moyensDetectionMines = MOYENS_DETECTION_MINES_EDEFAULT;

	/**
	 * This is true if the Moyens Detection Mines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyensDetectionMinesESet;

	/**
	 * The default value of the '{@link #getNombreMinesDetectees() <em>Nombre Mines Detectees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMinesDetectees()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MINES_DETECTEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMinesDetectees() <em>Nombre Mines Detectees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMinesDetectees()
	 * @generated
	 * @ordered
	 */
	protected long nombreMinesDetectees = NOMBRE_MINES_DETECTEES_EDEFAULT;

	/**
	 * This is true if the Nombre Mines Detectees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMinesDetecteesESet;

	/**
	 * The default value of the '{@link #getQuantiteMinesDetectees() <em>Quantite Mines Detectees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMinesDetectees()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MINES_DETECTEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMinesDetectees() <em>Quantite Mines Detectees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMinesDetectees()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMinesDetectees = QUANTITE_MINES_DETECTEES_EDEFAULT;

	/**
	 * This is true if the Quantite Mines Detectees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMinesDetecteesESet;

	/**
	 * The default value of the '{@link #getMouillage() <em>Mouillage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouillage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage MOUILLAGE_EDEFAULT = TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage.INITAL;

	/**
	 * The cached value of the '{@link #getMouillage() <em>Mouillage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouillage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage mouillage = MOUILLAGE_EDEFAULT;

	/**
	 * This is true if the Mouillage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mouillageESet;

	/**
	 * The cached value of the '{@link #getProfondeurDragage() <em>Profondeur Dragage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeurDragage()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur profondeurDragage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelChampMinesMaritimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelChampMinesMaritime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat getQualificatifEtat() {
		return qualificatifEtat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat newQualificatifEtat) {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		qualificatifEtat = newQualificatifEtat == null ? QUALIFICATIF_ETAT_EDEFAULT : newQualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUALIFICATIF_ETAT, oldQualificatifEtat, qualificatifEtat, !oldQualificatifEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifEtat() {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;
		qualificatifEtatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUALIFICATIF_ETAT, oldQualificatifEtat, QUALIFICATIF_ETAT_EDEFAULT, oldQualificatifEtatESet));
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
	public TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur getCodeCouleur() {
		return codeCouleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeCouleur(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur newCodeCouleur) {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur oldCodeCouleur = codeCouleur;
		codeCouleur = newCodeCouleur == null ? CODE_COULEUR_EDEFAULT : newCodeCouleur;
		boolean oldCodeCouleurESet = codeCouleurESet;
		codeCouleurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__CODE_COULEUR, oldCodeCouleur, codeCouleur, !oldCodeCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCodeCouleur() {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur oldCodeCouleur = codeCouleur;
		boolean oldCodeCouleurESet = codeCouleurESet;
		codeCouleur = CODE_COULEUR_EDEFAULT;
		codeCouleurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__CODE_COULEUR, oldCodeCouleur, CODE_COULEUR_EDEFAULT, oldCodeCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCodeCouleur() {
		return codeCouleurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM getNiveauEscompteMCM() {
		return niveauEscompteMCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauEscompteMCM(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM newNiveauEscompteMCM) {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM oldNiveauEscompteMCM = niveauEscompteMCM;
		niveauEscompteMCM = newNiveauEscompteMCM == null ? NIVEAU_ESCOMPTE_MCM_EDEFAULT : newNiveauEscompteMCM;
		boolean oldNiveauEscompteMCMESet = niveauEscompteMCMESet;
		niveauEscompteMCMESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_ESCOMPTE_MCM, oldNiveauEscompteMCM, niveauEscompteMCM, !oldNiveauEscompteMCMESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauEscompteMCM() {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM oldNiveauEscompteMCM = niveauEscompteMCM;
		boolean oldNiveauEscompteMCMESet = niveauEscompteMCMESet;
		niveauEscompteMCM = NIVEAU_ESCOMPTE_MCM_EDEFAULT;
		niveauEscompteMCMESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_ESCOMPTE_MCM, oldNiveauEscompteMCM, NIVEAU_ESCOMPTE_MCM_EDEFAULT, oldNiveauEscompteMCMESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauEscompteMCM() {
		return niveauEscompteMCMESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace getNiveauMenace() {
		return niveauMenace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauMenace(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace newNiveauMenace) {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace oldNiveauMenace = niveauMenace;
		niveauMenace = newNiveauMenace == null ? NIVEAU_MENACE_EDEFAULT : newNiveauMenace;
		boolean oldNiveauMenaceESet = niveauMenaceESet;
		niveauMenaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_MENACE, oldNiveauMenace, niveauMenace, !oldNiveauMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauMenace() {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace oldNiveauMenace = niveauMenace;
		boolean oldNiveauMenaceESet = niveauMenaceESet;
		niveauMenace = NIVEAU_MENACE_EDEFAULT;
		niveauMenaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_MENACE, oldNiveauMenace, NIVEAU_MENACE_EDEFAULT, oldNiveauMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauMenace() {
		return niveauMenaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPourcentageMenace() {
		return pourcentageMenace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageMenace(double newPourcentageMenace) {
		double oldPourcentageMenace = pourcentageMenace;
		pourcentageMenace = newPourcentageMenace;
		boolean oldPourcentageMenaceESet = pourcentageMenaceESet;
		pourcentageMenaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__POURCENTAGE_MENACE, oldPourcentageMenace, pourcentageMenace, !oldPourcentageMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageMenace() {
		double oldPourcentageMenace = pourcentageMenace;
		boolean oldPourcentageMenaceESet = pourcentageMenaceESet;
		pourcentageMenace = POURCENTAGE_MENACE_EDEFAULT;
		pourcentageMenaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__POURCENTAGE_MENACE, oldPourcentageMenace, POURCENTAGE_MENACE_EDEFAULT, oldPourcentageMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageMenace() {
		return pourcentageMenaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMines() {
		return quantiteMines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMines(long newQuantiteMines) {
		long oldQuantiteMines = quantiteMines;
		quantiteMines = newQuantiteMines;
		boolean oldQuantiteMinesESet = quantiteMinesESet;
		quantiteMinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES, oldQuantiteMines, quantiteMines, !oldQuantiteMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMines() {
		long oldQuantiteMines = quantiteMines;
		boolean oldQuantiteMinesESet = quantiteMinesESet;
		quantiteMines = QUANTITE_MINES_EDEFAULT;
		quantiteMinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES, oldQuantiteMines, QUANTITE_MINES_EDEFAULT, oldQuantiteMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMines() {
		return quantiteMinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines getMoyensDetectionMines() {
		return moyensDetectionMines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensDetectionMines(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines newMoyensDetectionMines) {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines oldMoyensDetectionMines = moyensDetectionMines;
		moyensDetectionMines = newMoyensDetectionMines == null ? MOYENS_DETECTION_MINES_EDEFAULT : newMoyensDetectionMines;
		boolean oldMoyensDetectionMinesESet = moyensDetectionMinesESet;
		moyensDetectionMinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOYENS_DETECTION_MINES, oldMoyensDetectionMines, moyensDetectionMines, !oldMoyensDetectionMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyensDetectionMines() {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines oldMoyensDetectionMines = moyensDetectionMines;
		boolean oldMoyensDetectionMinesESet = moyensDetectionMinesESet;
		moyensDetectionMines = MOYENS_DETECTION_MINES_EDEFAULT;
		moyensDetectionMinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOYENS_DETECTION_MINES, oldMoyensDetectionMines, MOYENS_DETECTION_MINES_EDEFAULT, oldMoyensDetectionMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyensDetectionMines() {
		return moyensDetectionMinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMinesDetectees() {
		return nombreMinesDetectees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMinesDetectees(long newNombreMinesDetectees) {
		long oldNombreMinesDetectees = nombreMinesDetectees;
		nombreMinesDetectees = newNombreMinesDetectees;
		boolean oldNombreMinesDetecteesESet = nombreMinesDetecteesESet;
		nombreMinesDetecteesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NOMBRE_MINES_DETECTEES, oldNombreMinesDetectees, nombreMinesDetectees, !oldNombreMinesDetecteesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMinesDetectees() {
		long oldNombreMinesDetectees = nombreMinesDetectees;
		boolean oldNombreMinesDetecteesESet = nombreMinesDetecteesESet;
		nombreMinesDetectees = NOMBRE_MINES_DETECTEES_EDEFAULT;
		nombreMinesDetecteesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NOMBRE_MINES_DETECTEES, oldNombreMinesDetectees, NOMBRE_MINES_DETECTEES_EDEFAULT, oldNombreMinesDetecteesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMinesDetectees() {
		return nombreMinesDetecteesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMinesDetectees() {
		return quantiteMinesDetectees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMinesDetectees(long newQuantiteMinesDetectees) {
		long oldQuantiteMinesDetectees = quantiteMinesDetectees;
		quantiteMinesDetectees = newQuantiteMinesDetectees;
		boolean oldQuantiteMinesDetecteesESet = quantiteMinesDetecteesESet;
		quantiteMinesDetecteesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES_DETECTEES, oldQuantiteMinesDetectees, quantiteMinesDetectees, !oldQuantiteMinesDetecteesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMinesDetectees() {
		long oldQuantiteMinesDetectees = quantiteMinesDetectees;
		boolean oldQuantiteMinesDetecteesESet = quantiteMinesDetecteesESet;
		quantiteMinesDetectees = QUANTITE_MINES_DETECTEES_EDEFAULT;
		quantiteMinesDetecteesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES_DETECTEES, oldQuantiteMinesDetectees, QUANTITE_MINES_DETECTEES_EDEFAULT, oldQuantiteMinesDetecteesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMinesDetectees() {
		return quantiteMinesDetecteesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage getMouillage() {
		return mouillage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMouillage(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage newMouillage) {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage oldMouillage = mouillage;
		mouillage = newMouillage == null ? MOUILLAGE_EDEFAULT : newMouillage;
		boolean oldMouillageESet = mouillageESet;
		mouillageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOUILLAGE, oldMouillage, mouillage, !oldMouillageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMouillage() {
		TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage oldMouillage = mouillage;
		boolean oldMouillageESet = mouillageESet;
		mouillage = MOUILLAGE_EDEFAULT;
		mouillageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOUILLAGE, oldMouillage, MOUILLAGE_EDEFAULT, oldMouillageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMouillage() {
		return mouillageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getProfondeurDragage() {
		return profondeurDragage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfondeurDragage(TypeDataTypeLongueur newProfondeurDragage, NotificationChain msgs) {
		TypeDataTypeLongueur oldProfondeurDragage = profondeurDragage;
		profondeurDragage = newProfondeurDragage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__PROFONDEUR_DRAGAGE, oldProfondeurDragage, newProfondeurDragage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondeurDragage(TypeDataTypeLongueur newProfondeurDragage) {
		if (newProfondeurDragage != profondeurDragage) {
			NotificationChain msgs = null;
			if (profondeurDragage != null)
				msgs = ((InternalEObject)profondeurDragage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__PROFONDEUR_DRAGAGE, null, msgs);
			if (newProfondeurDragage != null)
				msgs = ((InternalEObject)newProfondeurDragage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__PROFONDEUR_DRAGAGE, null, msgs);
			msgs = basicSetProfondeurDragage(newProfondeurDragage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__PROFONDEUR_DRAGAGE, newProfondeurDragage, newProfondeurDragage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__PROFONDEUR_DRAGAGE:
				return basicSetProfondeurDragage(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUALIFICATIF_ETAT:
				return getQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__CODE_COULEUR:
				return getCodeCouleur();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_ESCOMPTE_MCM:
				return getNiveauEscompteMCM();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_MENACE:
				return getNiveauMenace();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__POURCENTAGE_MENACE:
				return new Double(getPourcentageMenace());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES:
				return new Long(getQuantiteMines());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOYENS_DETECTION_MINES:
				return getMoyensDetectionMines();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NOMBRE_MINES_DETECTEES:
				return new Long(getNombreMinesDetectees());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES_DETECTEES:
				return new Long(getQuantiteMinesDetectees());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOUILLAGE:
				return getMouillage();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__PROFONDEUR_DRAGAGE:
				return getProfondeurDragage();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUALIFICATIF_ETAT:
				setQualificatifEtat((TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__CODE_COULEUR:
				setCodeCouleur((TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_ESCOMPTE_MCM:
				setNiveauEscompteMCM((TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_MENACE:
				setNiveauMenace((TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__POURCENTAGE_MENACE:
				setPourcentageMenace(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES:
				setQuantiteMines(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOYENS_DETECTION_MINES:
				setMoyensDetectionMines((TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NOMBRE_MINES_DETECTEES:
				setNombreMinesDetectees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES_DETECTEES:
				setQuantiteMinesDetectees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOUILLAGE:
				setMouillage((TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__PROFONDEUR_DRAGAGE:
				setProfondeurDragage((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUALIFICATIF_ETAT:
				unsetQualificatifEtat();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__CODE_COULEUR:
				unsetCodeCouleur();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_ESCOMPTE_MCM:
				unsetNiveauEscompteMCM();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_MENACE:
				unsetNiveauMenace();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__POURCENTAGE_MENACE:
				unsetPourcentageMenace();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES:
				unsetQuantiteMines();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOYENS_DETECTION_MINES:
				unsetMoyensDetectionMines();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NOMBRE_MINES_DETECTEES:
				unsetNombreMinesDetectees();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES_DETECTEES:
				unsetQuantiteMinesDetectees();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOUILLAGE:
				unsetMouillage();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__PROFONDEUR_DRAGAGE:
				setProfondeurDragage((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUALIFICATIF_ETAT:
				return isSetQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__CODE_COULEUR:
				return isSetCodeCouleur();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_ESCOMPTE_MCM:
				return isSetNiveauEscompteMCM();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NIVEAU_MENACE:
				return isSetNiveauMenace();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__POURCENTAGE_MENACE:
				return isSetPourcentageMenace();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES:
				return isSetQuantiteMines();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOYENS_DETECTION_MINES:
				return isSetMoyensDetectionMines();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__NOMBRE_MINES_DETECTEES:
				return isSetNombreMinesDetectees();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__QUANTITE_MINES_DETECTEES:
				return isSetQuantiteMinesDetectees();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__MOUILLAGE:
				return isSetMouillage();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_CHAMP_MINES_MARITIME__PROFONDEUR_DRAGAGE:
				return profondeurDragage != null;
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
		result.append(" (qualificatifEtat: ");
		if (qualificatifEtatESet) result.append(qualificatifEtat); else result.append("<unset>");
		result.append(", codeCouleur: ");
		if (codeCouleurESet) result.append(codeCouleur); else result.append("<unset>");
		result.append(", niveauEscompteMCM: ");
		if (niveauEscompteMCMESet) result.append(niveauEscompteMCM); else result.append("<unset>");
		result.append(", niveauMenace: ");
		if (niveauMenaceESet) result.append(niveauMenace); else result.append("<unset>");
		result.append(", pourcentageMenace: ");
		if (pourcentageMenaceESet) result.append(pourcentageMenace); else result.append("<unset>");
		result.append(", quantiteMines: ");
		if (quantiteMinesESet) result.append(quantiteMines); else result.append("<unset>");
		result.append(", moyensDetectionMines: ");
		if (moyensDetectionMinesESet) result.append(moyensDetectionMines); else result.append("<unset>");
		result.append(", nombreMinesDetectees: ");
		if (nombreMinesDetecteesESet) result.append(nombreMinesDetectees); else result.append("<unset>");
		result.append(", quantiteMinesDetectees: ");
		if (quantiteMinesDetecteesESet) result.append(quantiteMinesDetectees); else result.append("<unset>");
		result.append(", mouillage: ");
		if (mouillageESet) result.append(mouillage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelChampMinesMaritimeImpl
