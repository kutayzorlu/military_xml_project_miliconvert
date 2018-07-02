/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDeclenchementTir;
import mpia.schema.TypeDemandeEngagementObjectif;
import mpia.schema.TypeDictionaryDicoModaliteFinTir;
import mpia.schema.TypeDictionaryDicoPrioriteTir;
import mpia.schema.TypeDictionaryDicoTrajectoire;
import mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS;
import mpia.schema.TypeEffetTactiqueRecherche;
import mpia.schema.TypeMiseEnPlaceTir;
import mpia.schema.TypeParametresImposes;
import mpia.schema.TypeVisibiliteSurObjectif;
import mpia.schema.TypeVolumeSecuriteASS;
import mpia.schema.TypeZoneSecurite;

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
 * An implementation of the model object '<em><b>Type Demande Engagement Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getUrgenceTir <em>Urgence Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getDateEngagement <em>Date Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getDateLimiteEngagement <em>Date Limite Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getMoyensParticuliers <em>Moyens Particuliers</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getVitesseVent <em>Vitesse Vent</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getDirectionVent <em>Direction Vent</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getTrajectoire <em>Trajectoire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getPrecisionLocalisation <em>Precision Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getSourceAcquisition <em>Source Acquisition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getModaliteFinTir <em>Modalite Fin Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getDemandeUsageTypeArme <em>Demande Usage Type Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getAPourModalitesDeclenchementDeclenchementTir <em>APour Modalites Declenchement Declenchement Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getAPourEffetTactiqueEffetTactiqueRecherche <em>APour Effet Tactique Effet Tactique Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getAPourMiseEnPlaceMiseEnPlaceTir <em>APour Mise En Place Mise En Place Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getAPourPremieresMunitionsParametresImposes <em>APour Premieres Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getAPourSecondesMunitionsParametresImposes <em>APour Secondes Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getDoitRespecterZoneSecurite <em>Doit Respecter Zone Securite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getAPourVisibiliteSurObjectifVisibiliteSurObjectif <em>APour Visibilite Sur Objectif Visibilite Sur Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeEngagementObjectifImpl#getAPourVolumeSecuriteVolumeSecuriteASS <em>APour Volume Securite Volume Securite ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDemandeEngagementObjectifImpl extends EObjectImpl implements TypeDemandeEngagementObjectif {
	/**
	 * The default value of the '{@link #getUrgenceTir() <em>Urgence Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgenceTir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrioriteTir URGENCE_TIR_EDEFAULT = TypeDictionaryDicoPrioriteTir.IMM;

	/**
	 * The cached value of the '{@link #getUrgenceTir() <em>Urgence Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgenceTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrioriteTir urgenceTir = URGENCE_TIR_EDEFAULT;

	/**
	 * This is true if the Urgence Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean urgenceTirESet;

	/**
	 * The default value of the '{@link #getDateEngagement() <em>Date Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEngagement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_ENGAGEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEngagement() <em>Date Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEngagement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateEngagement = DATE_ENGAGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLimiteEngagement() <em>Date Limite Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLimiteEngagement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_LIMITE_ENGAGEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLimiteEngagement() <em>Date Limite Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLimiteEngagement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateLimiteEngagement = DATE_LIMITE_ENGAGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyensParticuliers() <em>Moyens Particuliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensParticuliers()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_PARTICULIERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyensParticuliers() <em>Moyens Particuliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensParticuliers()
	 * @generated
	 * @ordered
	 */
	protected String moyensParticuliers = MOYENS_PARTICULIERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVitesseVent() <em>Vitesse Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseVent()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseVent;

	/**
	 * The cached value of the '{@link #getDirectionVent() <em>Direction Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionVent()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle directionVent;

	/**
	 * The default value of the '{@link #getTrajectoire() <em>Trajectoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoire()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTrajectoire TRAJECTOIRE_EDEFAULT = TypeDictionaryDicoTrajectoire.PLUN;

	/**
	 * The cached value of the '{@link #getTrajectoire() <em>Trajectoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoire()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTrajectoire trajectoire = TRAJECTOIRE_EDEFAULT;

	/**
	 * This is true if the Trajectoire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trajectoireESet;

	/**
	 * The cached value of the '{@link #getPrecisionLocalisation() <em>Precision Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur precisionLocalisation;

	/**
	 * The default value of the '{@link #getSourceAcquisition() <em>Source Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAcquisition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMoyenAcquisitionASS SOURCE_ACQUISITION_EDEFAULT = TypeDictionaryDicoTypeMoyenAcquisitionASS.FIST;

	/**
	 * The cached value of the '{@link #getSourceAcquisition() <em>Source Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAcquisition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMoyenAcquisitionASS sourceAcquisition = SOURCE_ACQUISITION_EDEFAULT;

	/**
	 * This is true if the Source Acquisition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceAcquisitionESet;

	/**
	 * The default value of the '{@link #getModaliteFinTir() <em>Modalite Fin Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteFinTir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModaliteFinTir MODALITE_FIN_TIR_EDEFAULT = TypeDictionaryDicoModaliteFinTir.ENREG;

	/**
	 * The cached value of the '{@link #getModaliteFinTir() <em>Modalite Fin Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteFinTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModaliteFinTir modaliteFinTir = MODALITE_FIN_TIR_EDEFAULT;

	/**
	 * This is true if the Modalite Fin Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modaliteFinTirESet;

	/**
	 * The cached value of the '{@link #getDemandeUsageTypeArme() <em>Demande Usage Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandeUsageTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT demandeUsageTypeArme;

	/**
	 * The cached value of the '{@link #getAPourModalitesDeclenchementDeclenchementTir() <em>APour Modalites Declenchement Declenchement Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModalitesDeclenchementDeclenchementTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDeclenchementTir aPourModalitesDeclenchementDeclenchementTir;

	/**
	 * The cached value of the '{@link #getAPourEffetTactiqueEffetTactiqueRecherche() <em>APour Effet Tactique Effet Tactique Recherche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEffetTactiqueEffetTactiqueRecherche()
	 * @generated
	 * @ordered
	 */
	protected TypeEffetTactiqueRecherche aPourEffetTactiqueEffetTactiqueRecherche;

	/**
	 * The cached value of the '{@link #getAPourMiseEnPlaceMiseEnPlaceTir() <em>APour Mise En Place Mise En Place Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMiseEnPlaceMiseEnPlaceTir()
	 * @generated
	 * @ordered
	 */
	protected TypeMiseEnPlaceTir aPourMiseEnPlaceMiseEnPlaceTir;

	/**
	 * The cached value of the '{@link #getAPourPremieresMunitionsParametresImposes() <em>APour Premieres Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPremieresMunitionsParametresImposes()
	 * @generated
	 * @ordered
	 */
	protected TypeParametresImposes aPourPremieresMunitionsParametresImposes;

	/**
	 * The cached value of the '{@link #getAPourSecondesMunitionsParametresImposes() <em>APour Secondes Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSecondesMunitionsParametresImposes()
	 * @generated
	 * @ordered
	 */
	protected TypeParametresImposes aPourSecondesMunitionsParametresImposes;

	/**
	 * The cached value of the '{@link #getDoitRespecterZoneSecurite() <em>Doit Respecter Zone Securite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoitRespecterZoneSecurite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeZoneSecurite> doitRespecterZoneSecurite;

	/**
	 * The cached value of the '{@link #getAPourVisibiliteSurObjectifVisibiliteSurObjectif() <em>APour Visibilite Sur Objectif Visibilite Sur Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVisibiliteSurObjectifVisibiliteSurObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeVisibiliteSurObjectif aPourVisibiliteSurObjectifVisibiliteSurObjectif;

	/**
	 * The cached value of the '{@link #getAPourVolumeSecuriteVolumeSecuriteASS() <em>APour Volume Securite Volume Securite ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVolumeSecuriteVolumeSecuriteASS()
	 * @generated
	 * @ordered
	 */
	protected TypeVolumeSecuriteASS aPourVolumeSecuriteVolumeSecuriteASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDemandeEngagementObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDemandeEngagementObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrioriteTir getUrgenceTir() {
		return urgenceTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrgenceTir(TypeDictionaryDicoPrioriteTir newUrgenceTir) {
		TypeDictionaryDicoPrioriteTir oldUrgenceTir = urgenceTir;
		urgenceTir = newUrgenceTir == null ? URGENCE_TIR_EDEFAULT : newUrgenceTir;
		boolean oldUrgenceTirESet = urgenceTirESet;
		urgenceTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__URGENCE_TIR, oldUrgenceTir, urgenceTir, !oldUrgenceTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUrgenceTir() {
		TypeDictionaryDicoPrioriteTir oldUrgenceTir = urgenceTir;
		boolean oldUrgenceTirESet = urgenceTirESet;
		urgenceTir = URGENCE_TIR_EDEFAULT;
		urgenceTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__URGENCE_TIR, oldUrgenceTir, URGENCE_TIR_EDEFAULT, oldUrgenceTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUrgenceTir() {
		return urgenceTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateEngagement() {
		return dateEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEngagement(XMLGregorianCalendar newDateEngagement) {
		XMLGregorianCalendar oldDateEngagement = dateEngagement;
		dateEngagement = newDateEngagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_ENGAGEMENT, oldDateEngagement, dateEngagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateLimiteEngagement() {
		return dateLimiteEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLimiteEngagement(XMLGregorianCalendar newDateLimiteEngagement) {
		XMLGregorianCalendar oldDateLimiteEngagement = dateLimiteEngagement;
		dateLimiteEngagement = newDateLimiteEngagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_LIMITE_ENGAGEMENT, oldDateLimiteEngagement, dateLimiteEngagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyensParticuliers() {
		return moyensParticuliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensParticuliers(String newMoyensParticuliers) {
		String oldMoyensParticuliers = moyensParticuliers;
		moyensParticuliers = newMoyensParticuliers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MOYENS_PARTICULIERS, oldMoyensParticuliers, moyensParticuliers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseVent() {
		return vitesseVent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseVent(TypeDataTypeVitesseLineaire newVitesseVent, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseVent = vitesseVent;
		vitesseVent = newVitesseVent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__VITESSE_VENT, oldVitesseVent, newVitesseVent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseVent(TypeDataTypeVitesseLineaire newVitesseVent) {
		if (newVitesseVent != vitesseVent) {
			NotificationChain msgs = null;
			if (vitesseVent != null)
				msgs = ((InternalEObject)vitesseVent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__VITESSE_VENT, null, msgs);
			if (newVitesseVent != null)
				msgs = ((InternalEObject)newVitesseVent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__VITESSE_VENT, null, msgs);
			msgs = basicSetVitesseVent(newVitesseVent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__VITESSE_VENT, newVitesseVent, newVitesseVent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDirectionVent() {
		return directionVent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionVent(TypeDataTypeAngle newDirectionVent, NotificationChain msgs) {
		TypeDataTypeAngle oldDirectionVent = directionVent;
		directionVent = newDirectionVent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DIRECTION_VENT, oldDirectionVent, newDirectionVent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionVent(TypeDataTypeAngle newDirectionVent) {
		if (newDirectionVent != directionVent) {
			NotificationChain msgs = null;
			if (directionVent != null)
				msgs = ((InternalEObject)directionVent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DIRECTION_VENT, null, msgs);
			if (newDirectionVent != null)
				msgs = ((InternalEObject)newDirectionVent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DIRECTION_VENT, null, msgs);
			msgs = basicSetDirectionVent(newDirectionVent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DIRECTION_VENT, newDirectionVent, newDirectionVent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTrajectoire getTrajectoire() {
		return trajectoire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectoire(TypeDictionaryDicoTrajectoire newTrajectoire) {
		TypeDictionaryDicoTrajectoire oldTrajectoire = trajectoire;
		trajectoire = newTrajectoire == null ? TRAJECTOIRE_EDEFAULT : newTrajectoire;
		boolean oldTrajectoireESet = trajectoireESet;
		trajectoireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__TRAJECTOIRE, oldTrajectoire, trajectoire, !oldTrajectoireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrajectoire() {
		TypeDictionaryDicoTrajectoire oldTrajectoire = trajectoire;
		boolean oldTrajectoireESet = trajectoireESet;
		trajectoire = TRAJECTOIRE_EDEFAULT;
		trajectoireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__TRAJECTOIRE, oldTrajectoire, TRAJECTOIRE_EDEFAULT, oldTrajectoireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrajectoire() {
		return trajectoireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPrecisionLocalisation() {
		return precisionLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecisionLocalisation(TypeDataTypeLongueur newPrecisionLocalisation, NotificationChain msgs) {
		TypeDataTypeLongueur oldPrecisionLocalisation = precisionLocalisation;
		precisionLocalisation = newPrecisionLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__PRECISION_LOCALISATION, oldPrecisionLocalisation, newPrecisionLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionLocalisation(TypeDataTypeLongueur newPrecisionLocalisation) {
		if (newPrecisionLocalisation != precisionLocalisation) {
			NotificationChain msgs = null;
			if (precisionLocalisation != null)
				msgs = ((InternalEObject)precisionLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__PRECISION_LOCALISATION, null, msgs);
			if (newPrecisionLocalisation != null)
				msgs = ((InternalEObject)newPrecisionLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__PRECISION_LOCALISATION, null, msgs);
			msgs = basicSetPrecisionLocalisation(newPrecisionLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__PRECISION_LOCALISATION, newPrecisionLocalisation, newPrecisionLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMoyenAcquisitionASS getSourceAcquisition() {
		return sourceAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS newSourceAcquisition) {
		TypeDictionaryDicoTypeMoyenAcquisitionASS oldSourceAcquisition = sourceAcquisition;
		sourceAcquisition = newSourceAcquisition == null ? SOURCE_ACQUISITION_EDEFAULT : newSourceAcquisition;
		boolean oldSourceAcquisitionESet = sourceAcquisitionESet;
		sourceAcquisitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__SOURCE_ACQUISITION, oldSourceAcquisition, sourceAcquisition, !oldSourceAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourceAcquisition() {
		TypeDictionaryDicoTypeMoyenAcquisitionASS oldSourceAcquisition = sourceAcquisition;
		boolean oldSourceAcquisitionESet = sourceAcquisitionESet;
		sourceAcquisition = SOURCE_ACQUISITION_EDEFAULT;
		sourceAcquisitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__SOURCE_ACQUISITION, oldSourceAcquisition, SOURCE_ACQUISITION_EDEFAULT, oldSourceAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceAcquisition() {
		return sourceAcquisitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModaliteFinTir getModaliteFinTir() {
		return modaliteFinTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModaliteFinTir(TypeDictionaryDicoModaliteFinTir newModaliteFinTir) {
		TypeDictionaryDicoModaliteFinTir oldModaliteFinTir = modaliteFinTir;
		modaliteFinTir = newModaliteFinTir == null ? MODALITE_FIN_TIR_EDEFAULT : newModaliteFinTir;
		boolean oldModaliteFinTirESet = modaliteFinTirESet;
		modaliteFinTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MODALITE_FIN_TIR, oldModaliteFinTir, modaliteFinTir, !oldModaliteFinTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModaliteFinTir() {
		TypeDictionaryDicoModaliteFinTir oldModaliteFinTir = modaliteFinTir;
		boolean oldModaliteFinTirESet = modaliteFinTirESet;
		modaliteFinTir = MODALITE_FIN_TIR_EDEFAULT;
		modaliteFinTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MODALITE_FIN_TIR, oldModaliteFinTir, MODALITE_FIN_TIR_EDEFAULT, oldModaliteFinTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModaliteFinTir() {
		return modaliteFinTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getDemandeUsageTypeArme() {
		return demandeUsageTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandeUsageTypeArme(TypeAssociationEXT newDemandeUsageTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldDemandeUsageTypeArme = demandeUsageTypeArme;
		demandeUsageTypeArme = newDemandeUsageTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DEMANDE_USAGE_TYPE_ARME, oldDemandeUsageTypeArme, newDemandeUsageTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandeUsageTypeArme(TypeAssociationEXT newDemandeUsageTypeArme) {
		if (newDemandeUsageTypeArme != demandeUsageTypeArme) {
			NotificationChain msgs = null;
			if (demandeUsageTypeArme != null)
				msgs = ((InternalEObject)demandeUsageTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DEMANDE_USAGE_TYPE_ARME, null, msgs);
			if (newDemandeUsageTypeArme != null)
				msgs = ((InternalEObject)newDemandeUsageTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DEMANDE_USAGE_TYPE_ARME, null, msgs);
			msgs = basicSetDemandeUsageTypeArme(newDemandeUsageTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DEMANDE_USAGE_TYPE_ARME, newDemandeUsageTypeArme, newDemandeUsageTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclenchementTir getAPourModalitesDeclenchementDeclenchementTir() {
		return aPourModalitesDeclenchementDeclenchementTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourModalitesDeclenchementDeclenchementTir(TypeDeclenchementTir newAPourModalitesDeclenchementDeclenchementTir, NotificationChain msgs) {
		TypeDeclenchementTir oldAPourModalitesDeclenchementDeclenchementTir = aPourModalitesDeclenchementDeclenchementTir;
		aPourModalitesDeclenchementDeclenchementTir = newAPourModalitesDeclenchementDeclenchementTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MODALITES_DECLENCHEMENT_DECLENCHEMENT_TIR, oldAPourModalitesDeclenchementDeclenchementTir, newAPourModalitesDeclenchementDeclenchementTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourModalitesDeclenchementDeclenchementTir(TypeDeclenchementTir newAPourModalitesDeclenchementDeclenchementTir) {
		if (newAPourModalitesDeclenchementDeclenchementTir != aPourModalitesDeclenchementDeclenchementTir) {
			NotificationChain msgs = null;
			if (aPourModalitesDeclenchementDeclenchementTir != null)
				msgs = ((InternalEObject)aPourModalitesDeclenchementDeclenchementTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MODALITES_DECLENCHEMENT_DECLENCHEMENT_TIR, null, msgs);
			if (newAPourModalitesDeclenchementDeclenchementTir != null)
				msgs = ((InternalEObject)newAPourModalitesDeclenchementDeclenchementTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MODALITES_DECLENCHEMENT_DECLENCHEMENT_TIR, null, msgs);
			msgs = basicSetAPourModalitesDeclenchementDeclenchementTir(newAPourModalitesDeclenchementDeclenchementTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MODALITES_DECLENCHEMENT_DECLENCHEMENT_TIR, newAPourModalitesDeclenchementDeclenchementTir, newAPourModalitesDeclenchementDeclenchementTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEffetTactiqueRecherche getAPourEffetTactiqueEffetTactiqueRecherche() {
		return aPourEffetTactiqueEffetTactiqueRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourEffetTactiqueEffetTactiqueRecherche(TypeEffetTactiqueRecherche newAPourEffetTactiqueEffetTactiqueRecherche, NotificationChain msgs) {
		TypeEffetTactiqueRecherche oldAPourEffetTactiqueEffetTactiqueRecherche = aPourEffetTactiqueEffetTactiqueRecherche;
		aPourEffetTactiqueEffetTactiqueRecherche = newAPourEffetTactiqueEffetTactiqueRecherche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_EFFET_TACTIQUE_EFFET_TACTIQUE_RECHERCHE, oldAPourEffetTactiqueEffetTactiqueRecherche, newAPourEffetTactiqueEffetTactiqueRecherche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourEffetTactiqueEffetTactiqueRecherche(TypeEffetTactiqueRecherche newAPourEffetTactiqueEffetTactiqueRecherche) {
		if (newAPourEffetTactiqueEffetTactiqueRecherche != aPourEffetTactiqueEffetTactiqueRecherche) {
			NotificationChain msgs = null;
			if (aPourEffetTactiqueEffetTactiqueRecherche != null)
				msgs = ((InternalEObject)aPourEffetTactiqueEffetTactiqueRecherche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_EFFET_TACTIQUE_EFFET_TACTIQUE_RECHERCHE, null, msgs);
			if (newAPourEffetTactiqueEffetTactiqueRecherche != null)
				msgs = ((InternalEObject)newAPourEffetTactiqueEffetTactiqueRecherche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_EFFET_TACTIQUE_EFFET_TACTIQUE_RECHERCHE, null, msgs);
			msgs = basicSetAPourEffetTactiqueEffetTactiqueRecherche(newAPourEffetTactiqueEffetTactiqueRecherche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_EFFET_TACTIQUE_EFFET_TACTIQUE_RECHERCHE, newAPourEffetTactiqueEffetTactiqueRecherche, newAPourEffetTactiqueEffetTactiqueRecherche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMiseEnPlaceTir getAPourMiseEnPlaceMiseEnPlaceTir() {
		return aPourMiseEnPlaceMiseEnPlaceTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMiseEnPlaceMiseEnPlaceTir(TypeMiseEnPlaceTir newAPourMiseEnPlaceMiseEnPlaceTir, NotificationChain msgs) {
		TypeMiseEnPlaceTir oldAPourMiseEnPlaceMiseEnPlaceTir = aPourMiseEnPlaceMiseEnPlaceTir;
		aPourMiseEnPlaceMiseEnPlaceTir = newAPourMiseEnPlaceMiseEnPlaceTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MISE_EN_PLACE_MISE_EN_PLACE_TIR, oldAPourMiseEnPlaceMiseEnPlaceTir, newAPourMiseEnPlaceMiseEnPlaceTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMiseEnPlaceMiseEnPlaceTir(TypeMiseEnPlaceTir newAPourMiseEnPlaceMiseEnPlaceTir) {
		if (newAPourMiseEnPlaceMiseEnPlaceTir != aPourMiseEnPlaceMiseEnPlaceTir) {
			NotificationChain msgs = null;
			if (aPourMiseEnPlaceMiseEnPlaceTir != null)
				msgs = ((InternalEObject)aPourMiseEnPlaceMiseEnPlaceTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MISE_EN_PLACE_MISE_EN_PLACE_TIR, null, msgs);
			if (newAPourMiseEnPlaceMiseEnPlaceTir != null)
				msgs = ((InternalEObject)newAPourMiseEnPlaceMiseEnPlaceTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MISE_EN_PLACE_MISE_EN_PLACE_TIR, null, msgs);
			msgs = basicSetAPourMiseEnPlaceMiseEnPlaceTir(newAPourMiseEnPlaceMiseEnPlaceTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MISE_EN_PLACE_MISE_EN_PLACE_TIR, newAPourMiseEnPlaceMiseEnPlaceTir, newAPourMiseEnPlaceMiseEnPlaceTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParametresImposes getAPourPremieresMunitionsParametresImposes() {
		return aPourPremieresMunitionsParametresImposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPremieresMunitionsParametresImposes(TypeParametresImposes newAPourPremieresMunitionsParametresImposes, NotificationChain msgs) {
		TypeParametresImposes oldAPourPremieresMunitionsParametresImposes = aPourPremieresMunitionsParametresImposes;
		aPourPremieresMunitionsParametresImposes = newAPourPremieresMunitionsParametresImposes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, oldAPourPremieresMunitionsParametresImposes, newAPourPremieresMunitionsParametresImposes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPremieresMunitionsParametresImposes(TypeParametresImposes newAPourPremieresMunitionsParametresImposes) {
		if (newAPourPremieresMunitionsParametresImposes != aPourPremieresMunitionsParametresImposes) {
			NotificationChain msgs = null;
			if (aPourPremieresMunitionsParametresImposes != null)
				msgs = ((InternalEObject)aPourPremieresMunitionsParametresImposes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			if (newAPourPremieresMunitionsParametresImposes != null)
				msgs = ((InternalEObject)newAPourPremieresMunitionsParametresImposes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			msgs = basicSetAPourPremieresMunitionsParametresImposes(newAPourPremieresMunitionsParametresImposes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, newAPourPremieresMunitionsParametresImposes, newAPourPremieresMunitionsParametresImposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParametresImposes getAPourSecondesMunitionsParametresImposes() {
		return aPourSecondesMunitionsParametresImposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSecondesMunitionsParametresImposes(TypeParametresImposes newAPourSecondesMunitionsParametresImposes, NotificationChain msgs) {
		TypeParametresImposes oldAPourSecondesMunitionsParametresImposes = aPourSecondesMunitionsParametresImposes;
		aPourSecondesMunitionsParametresImposes = newAPourSecondesMunitionsParametresImposes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, oldAPourSecondesMunitionsParametresImposes, newAPourSecondesMunitionsParametresImposes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSecondesMunitionsParametresImposes(TypeParametresImposes newAPourSecondesMunitionsParametresImposes) {
		if (newAPourSecondesMunitionsParametresImposes != aPourSecondesMunitionsParametresImposes) {
			NotificationChain msgs = null;
			if (aPourSecondesMunitionsParametresImposes != null)
				msgs = ((InternalEObject)aPourSecondesMunitionsParametresImposes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			if (newAPourSecondesMunitionsParametresImposes != null)
				msgs = ((InternalEObject)newAPourSecondesMunitionsParametresImposes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			msgs = basicSetAPourSecondesMunitionsParametresImposes(newAPourSecondesMunitionsParametresImposes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, newAPourSecondesMunitionsParametresImposes, newAPourSecondesMunitionsParametresImposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneSecurite> getDoitRespecterZoneSecurite() {
		if (doitRespecterZoneSecurite == null) {
			doitRespecterZoneSecurite = new EObjectContainmentEList<TypeZoneSecurite>(TypeZoneSecurite.class, this, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DOIT_RESPECTER_ZONE_SECURITE);
		}
		return doitRespecterZoneSecurite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVisibiliteSurObjectif getAPourVisibiliteSurObjectifVisibiliteSurObjectif() {
		return aPourVisibiliteSurObjectifVisibiliteSurObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourVisibiliteSurObjectifVisibiliteSurObjectif(TypeVisibiliteSurObjectif newAPourVisibiliteSurObjectifVisibiliteSurObjectif, NotificationChain msgs) {
		TypeVisibiliteSurObjectif oldAPourVisibiliteSurObjectifVisibiliteSurObjectif = aPourVisibiliteSurObjectifVisibiliteSurObjectif;
		aPourVisibiliteSurObjectifVisibiliteSurObjectif = newAPourVisibiliteSurObjectifVisibiliteSurObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VISIBILITE_SUR_OBJECTIF_VISIBILITE_SUR_OBJECTIF, oldAPourVisibiliteSurObjectifVisibiliteSurObjectif, newAPourVisibiliteSurObjectifVisibiliteSurObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourVisibiliteSurObjectifVisibiliteSurObjectif(TypeVisibiliteSurObjectif newAPourVisibiliteSurObjectifVisibiliteSurObjectif) {
		if (newAPourVisibiliteSurObjectifVisibiliteSurObjectif != aPourVisibiliteSurObjectifVisibiliteSurObjectif) {
			NotificationChain msgs = null;
			if (aPourVisibiliteSurObjectifVisibiliteSurObjectif != null)
				msgs = ((InternalEObject)aPourVisibiliteSurObjectifVisibiliteSurObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VISIBILITE_SUR_OBJECTIF_VISIBILITE_SUR_OBJECTIF, null, msgs);
			if (newAPourVisibiliteSurObjectifVisibiliteSurObjectif != null)
				msgs = ((InternalEObject)newAPourVisibiliteSurObjectifVisibiliteSurObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VISIBILITE_SUR_OBJECTIF_VISIBILITE_SUR_OBJECTIF, null, msgs);
			msgs = basicSetAPourVisibiliteSurObjectifVisibiliteSurObjectif(newAPourVisibiliteSurObjectifVisibiliteSurObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VISIBILITE_SUR_OBJECTIF_VISIBILITE_SUR_OBJECTIF, newAPourVisibiliteSurObjectifVisibiliteSurObjectif, newAPourVisibiliteSurObjectifVisibiliteSurObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVolumeSecuriteASS getAPourVolumeSecuriteVolumeSecuriteASS() {
		return aPourVolumeSecuriteVolumeSecuriteASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourVolumeSecuriteVolumeSecuriteASS(TypeVolumeSecuriteASS newAPourVolumeSecuriteVolumeSecuriteASS, NotificationChain msgs) {
		TypeVolumeSecuriteASS oldAPourVolumeSecuriteVolumeSecuriteASS = aPourVolumeSecuriteVolumeSecuriteASS;
		aPourVolumeSecuriteVolumeSecuriteASS = newAPourVolumeSecuriteVolumeSecuriteASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VOLUME_SECURITE_VOLUME_SECURITE_ASS, oldAPourVolumeSecuriteVolumeSecuriteASS, newAPourVolumeSecuriteVolumeSecuriteASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourVolumeSecuriteVolumeSecuriteASS(TypeVolumeSecuriteASS newAPourVolumeSecuriteVolumeSecuriteASS) {
		if (newAPourVolumeSecuriteVolumeSecuriteASS != aPourVolumeSecuriteVolumeSecuriteASS) {
			NotificationChain msgs = null;
			if (aPourVolumeSecuriteVolumeSecuriteASS != null)
				msgs = ((InternalEObject)aPourVolumeSecuriteVolumeSecuriteASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VOLUME_SECURITE_VOLUME_SECURITE_ASS, null, msgs);
			if (newAPourVolumeSecuriteVolumeSecuriteASS != null)
				msgs = ((InternalEObject)newAPourVolumeSecuriteVolumeSecuriteASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VOLUME_SECURITE_VOLUME_SECURITE_ASS, null, msgs);
			msgs = basicSetAPourVolumeSecuriteVolumeSecuriteASS(newAPourVolumeSecuriteVolumeSecuriteASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VOLUME_SECURITE_VOLUME_SECURITE_ASS, newAPourVolumeSecuriteVolumeSecuriteASS, newAPourVolumeSecuriteVolumeSecuriteASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__VITESSE_VENT:
				return basicSetVitesseVent(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DIRECTION_VENT:
				return basicSetDirectionVent(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__PRECISION_LOCALISATION:
				return basicSetPrecisionLocalisation(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DEMANDE_USAGE_TYPE_ARME:
				return basicSetDemandeUsageTypeArme(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MODALITES_DECLENCHEMENT_DECLENCHEMENT_TIR:
				return basicSetAPourModalitesDeclenchementDeclenchementTir(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_EFFET_TACTIQUE_EFFET_TACTIQUE_RECHERCHE:
				return basicSetAPourEffetTactiqueEffetTactiqueRecherche(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MISE_EN_PLACE_MISE_EN_PLACE_TIR:
				return basicSetAPourMiseEnPlaceMiseEnPlaceTir(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				return basicSetAPourPremieresMunitionsParametresImposes(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				return basicSetAPourSecondesMunitionsParametresImposes(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DOIT_RESPECTER_ZONE_SECURITE:
				return ((InternalEList<?>)getDoitRespecterZoneSecurite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VISIBILITE_SUR_OBJECTIF_VISIBILITE_SUR_OBJECTIF:
				return basicSetAPourVisibiliteSurObjectifVisibiliteSurObjectif(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VOLUME_SECURITE_VOLUME_SECURITE_ASS:
				return basicSetAPourVolumeSecuriteVolumeSecuriteASS(null, msgs);
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
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__URGENCE_TIR:
				return getUrgenceTir();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_ENGAGEMENT:
				return getDateEngagement();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_LIMITE_ENGAGEMENT:
				return getDateLimiteEngagement();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MOYENS_PARTICULIERS:
				return getMoyensParticuliers();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__VITESSE_VENT:
				return getVitesseVent();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DIRECTION_VENT:
				return getDirectionVent();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__TRAJECTOIRE:
				return getTrajectoire();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__PRECISION_LOCALISATION:
				return getPrecisionLocalisation();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__SOURCE_ACQUISITION:
				return getSourceAcquisition();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MODALITE_FIN_TIR:
				return getModaliteFinTir();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DEMANDE_USAGE_TYPE_ARME:
				return getDemandeUsageTypeArme();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MODALITES_DECLENCHEMENT_DECLENCHEMENT_TIR:
				return getAPourModalitesDeclenchementDeclenchementTir();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_EFFET_TACTIQUE_EFFET_TACTIQUE_RECHERCHE:
				return getAPourEffetTactiqueEffetTactiqueRecherche();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MISE_EN_PLACE_MISE_EN_PLACE_TIR:
				return getAPourMiseEnPlaceMiseEnPlaceTir();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				return getAPourPremieresMunitionsParametresImposes();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				return getAPourSecondesMunitionsParametresImposes();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DOIT_RESPECTER_ZONE_SECURITE:
				return getDoitRespecterZoneSecurite();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VISIBILITE_SUR_OBJECTIF_VISIBILITE_SUR_OBJECTIF:
				return getAPourVisibiliteSurObjectifVisibiliteSurObjectif();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VOLUME_SECURITE_VOLUME_SECURITE_ASS:
				return getAPourVolumeSecuriteVolumeSecuriteASS();
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
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__URGENCE_TIR:
				setUrgenceTir((TypeDictionaryDicoPrioriteTir)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_ENGAGEMENT:
				setDateEngagement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_LIMITE_ENGAGEMENT:
				setDateLimiteEngagement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MOYENS_PARTICULIERS:
				setMoyensParticuliers((String)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__VITESSE_VENT:
				setVitesseVent((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DIRECTION_VENT:
				setDirectionVent((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__TRAJECTOIRE:
				setTrajectoire((TypeDictionaryDicoTrajectoire)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__PRECISION_LOCALISATION:
				setPrecisionLocalisation((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__SOURCE_ACQUISITION:
				setSourceAcquisition((TypeDictionaryDicoTypeMoyenAcquisitionASS)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MODALITE_FIN_TIR:
				setModaliteFinTir((TypeDictionaryDicoModaliteFinTir)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DEMANDE_USAGE_TYPE_ARME:
				setDemandeUsageTypeArme((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MODALITES_DECLENCHEMENT_DECLENCHEMENT_TIR:
				setAPourModalitesDeclenchementDeclenchementTir((TypeDeclenchementTir)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_EFFET_TACTIQUE_EFFET_TACTIQUE_RECHERCHE:
				setAPourEffetTactiqueEffetTactiqueRecherche((TypeEffetTactiqueRecherche)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MISE_EN_PLACE_MISE_EN_PLACE_TIR:
				setAPourMiseEnPlaceMiseEnPlaceTir((TypeMiseEnPlaceTir)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourPremieresMunitionsParametresImposes((TypeParametresImposes)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourSecondesMunitionsParametresImposes((TypeParametresImposes)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DOIT_RESPECTER_ZONE_SECURITE:
				getDoitRespecterZoneSecurite().clear();
				getDoitRespecterZoneSecurite().addAll((Collection<? extends TypeZoneSecurite>)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VISIBILITE_SUR_OBJECTIF_VISIBILITE_SUR_OBJECTIF:
				setAPourVisibiliteSurObjectifVisibiliteSurObjectif((TypeVisibiliteSurObjectif)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VOLUME_SECURITE_VOLUME_SECURITE_ASS:
				setAPourVolumeSecuriteVolumeSecuriteASS((TypeVolumeSecuriteASS)newValue);
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
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__URGENCE_TIR:
				unsetUrgenceTir();
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_ENGAGEMENT:
				setDateEngagement(DATE_ENGAGEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_LIMITE_ENGAGEMENT:
				setDateLimiteEngagement(DATE_LIMITE_ENGAGEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MOYENS_PARTICULIERS:
				setMoyensParticuliers(MOYENS_PARTICULIERS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__VITESSE_VENT:
				setVitesseVent((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DIRECTION_VENT:
				setDirectionVent((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__TRAJECTOIRE:
				unsetTrajectoire();
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__PRECISION_LOCALISATION:
				setPrecisionLocalisation((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__SOURCE_ACQUISITION:
				unsetSourceAcquisition();
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MODALITE_FIN_TIR:
				unsetModaliteFinTir();
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DEMANDE_USAGE_TYPE_ARME:
				setDemandeUsageTypeArme((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MODALITES_DECLENCHEMENT_DECLENCHEMENT_TIR:
				setAPourModalitesDeclenchementDeclenchementTir((TypeDeclenchementTir)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_EFFET_TACTIQUE_EFFET_TACTIQUE_RECHERCHE:
				setAPourEffetTactiqueEffetTactiqueRecherche((TypeEffetTactiqueRecherche)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MISE_EN_PLACE_MISE_EN_PLACE_TIR:
				setAPourMiseEnPlaceMiseEnPlaceTir((TypeMiseEnPlaceTir)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourPremieresMunitionsParametresImposes((TypeParametresImposes)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourSecondesMunitionsParametresImposes((TypeParametresImposes)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DOIT_RESPECTER_ZONE_SECURITE:
				getDoitRespecterZoneSecurite().clear();
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VISIBILITE_SUR_OBJECTIF_VISIBILITE_SUR_OBJECTIF:
				setAPourVisibiliteSurObjectifVisibiliteSurObjectif((TypeVisibiliteSurObjectif)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VOLUME_SECURITE_VOLUME_SECURITE_ASS:
				setAPourVolumeSecuriteVolumeSecuriteASS((TypeVolumeSecuriteASS)null);
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
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__URGENCE_TIR:
				return isSetUrgenceTir();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_ENGAGEMENT:
				return DATE_ENGAGEMENT_EDEFAULT == null ? dateEngagement != null : !DATE_ENGAGEMENT_EDEFAULT.equals(dateEngagement);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DATE_LIMITE_ENGAGEMENT:
				return DATE_LIMITE_ENGAGEMENT_EDEFAULT == null ? dateLimiteEngagement != null : !DATE_LIMITE_ENGAGEMENT_EDEFAULT.equals(dateLimiteEngagement);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MOYENS_PARTICULIERS:
				return MOYENS_PARTICULIERS_EDEFAULT == null ? moyensParticuliers != null : !MOYENS_PARTICULIERS_EDEFAULT.equals(moyensParticuliers);
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__VITESSE_VENT:
				return vitesseVent != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DIRECTION_VENT:
				return directionVent != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__TRAJECTOIRE:
				return isSetTrajectoire();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__PRECISION_LOCALISATION:
				return precisionLocalisation != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__SOURCE_ACQUISITION:
				return isSetSourceAcquisition();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__MODALITE_FIN_TIR:
				return isSetModaliteFinTir();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DEMANDE_USAGE_TYPE_ARME:
				return demandeUsageTypeArme != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MODALITES_DECLENCHEMENT_DECLENCHEMENT_TIR:
				return aPourModalitesDeclenchementDeclenchementTir != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_EFFET_TACTIQUE_EFFET_TACTIQUE_RECHERCHE:
				return aPourEffetTactiqueEffetTactiqueRecherche != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_MISE_EN_PLACE_MISE_EN_PLACE_TIR:
				return aPourMiseEnPlaceMiseEnPlaceTir != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				return aPourPremieresMunitionsParametresImposes != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				return aPourSecondesMunitionsParametresImposes != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__DOIT_RESPECTER_ZONE_SECURITE:
				return doitRespecterZoneSecurite != null && !doitRespecterZoneSecurite.isEmpty();
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VISIBILITE_SUR_OBJECTIF_VISIBILITE_SUR_OBJECTIF:
				return aPourVisibiliteSurObjectifVisibiliteSurObjectif != null;
			case SchemaPackage.TYPE_DEMANDE_ENGAGEMENT_OBJECTIF__APOUR_VOLUME_SECURITE_VOLUME_SECURITE_ASS:
				return aPourVolumeSecuriteVolumeSecuriteASS != null;
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
		result.append(" (urgenceTir: ");
		if (urgenceTirESet) result.append(urgenceTir); else result.append("<unset>");
		result.append(", dateEngagement: ");
		result.append(dateEngagement);
		result.append(", dateLimiteEngagement: ");
		result.append(dateLimiteEngagement);
		result.append(", moyensParticuliers: ");
		result.append(moyensParticuliers);
		result.append(", trajectoire: ");
		if (trajectoireESet) result.append(trajectoire); else result.append("<unset>");
		result.append(", sourceAcquisition: ");
		if (sourceAcquisitionESet) result.append(sourceAcquisition); else result.append("<unset>");
		result.append(", modaliteFinTir: ");
		if (modaliteFinTirESet) result.append(modaliteFinTir); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeDemandeEngagementObjectifImpl
