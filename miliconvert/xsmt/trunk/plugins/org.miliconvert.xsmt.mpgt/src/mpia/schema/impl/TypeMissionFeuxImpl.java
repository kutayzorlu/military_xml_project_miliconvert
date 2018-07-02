/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche;
import mpia.schema.TypeDictionaryDicoMissionFeuxMoyenAcquisition;
import mpia.schema.TypeDictionaryDicoMissionFeuxTypeMission;
import mpia.schema.TypeEffet;
import mpia.schema.TypeMissionFeux;
import mpia.schema.TypeTypeObjectifASS;
import mpia.schema.TypeTypeRepartition;

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
 * An implementation of the model object '<em><b>Type Mission Feux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getTypeMission <em>Type Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getDisponibiliteInstantanee <em>Disponibilite Instantanee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getDisponibiliteDifferee <em>Disponibilite Differee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getEffetsRecherches <em>Effets Recherches</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getEffetRechercheNonRepertorie <em>Effet Recherche Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getModaliteDeclenchementTirs <em>Modalite Declenchement Tirs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getMoyenAcquisition <em>Moyen Acquisition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getMoyenAcquisitionNonRepertorie <em>Moyen Acquisition Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getPreavis <em>Preavis</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getCommentaireSurObjectif <em>Commentaire Sur Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getAPourZoneApplicationFeuxAutreElementControle <em>APour Zone Application Feux Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getRechercheEffet <em>Recherche Effet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getSInteresseATypeObjectifASS <em>SInteresse AType Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getAPourVolumeEnReserveTypeRepartition <em>APour Volume En Reserve Type Repartition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getAPourUniteMeleePrioritaireUnite <em>APour Unite Melee Prioritaire Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionFeuxImpl#getAPourConsommationAlloueeTypeRepartition <em>APour Consommation Allouee Type Repartition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionFeuxImpl extends TypeMissionImpl implements TypeMissionFeux {
	/**
	 * The default value of the '{@link #getTypeMission() <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMission()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionFeuxTypeMission TYPE_MISSION_EDEFAULT = TypeDictionaryDicoMissionFeuxTypeMission.HIGH;

	/**
	 * The cached value of the '{@link #getTypeMission() <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMission()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionFeuxTypeMission typeMission = TYPE_MISSION_EDEFAULT;

	/**
	 * This is true if the Type Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionESet;

	/**
	 * The default value of the '{@link #getDisponibiliteInstantanee() <em>Disponibilite Instantanee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibiliteInstantanee()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPONIBILITE_INSTANTANEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisponibiliteInstantanee() <em>Disponibilite Instantanee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibiliteInstantanee()
	 * @generated
	 * @ordered
	 */
	protected double disponibiliteInstantanee = DISPONIBILITE_INSTANTANEE_EDEFAULT;

	/**
	 * This is true if the Disponibilite Instantanee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteInstantaneeESet;

	/**
	 * The default value of the '{@link #getDisponibiliteDifferee() <em>Disponibilite Differee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibiliteDifferee()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPONIBILITE_DIFFEREE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisponibiliteDifferee() <em>Disponibilite Differee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibiliteDifferee()
	 * @generated
	 * @ordered
	 */
	protected double disponibiliteDifferee = DISPONIBILITE_DIFFEREE_EDEFAULT;

	/**
	 * This is true if the Disponibilite Differee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteDiffereeESet;

	/**
	 * The default value of the '{@link #getEffetsRecherches() <em>Effets Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetsRecherches()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetTactiqueRecherche EFFETS_RECHERCHES_EDEFAULT = TypeDictionaryDicoEffetTactiqueRecherche.NEUT;

	/**
	 * The cached value of the '{@link #getEffetsRecherches() <em>Effets Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetsRecherches()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetTactiqueRecherche effetsRecherches = EFFETS_RECHERCHES_EDEFAULT;

	/**
	 * This is true if the Effets Recherches attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetsRecherchesESet;

	/**
	 * The default value of the '{@link #getEffetRechercheNonRepertorie() <em>Effet Recherche Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRechercheNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFET_RECHERCHE_NON_REPERTORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffetRechercheNonRepertorie() <em>Effet Recherche Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRechercheNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected String effetRechercheNonRepertorie = EFFET_RECHERCHE_NON_REPERTORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModaliteDeclenchementTirs() <em>Modalite Declenchement Tirs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteDeclenchementTirs()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITE_DECLENCHEMENT_TIRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModaliteDeclenchementTirs() <em>Modalite Declenchement Tirs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteDeclenchementTirs()
	 * @generated
	 * @ordered
	 */
	protected String modaliteDeclenchementTirs = MODALITE_DECLENCHEMENT_TIRS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyenAcquisition() <em>Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenAcquisition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionFeuxMoyenAcquisition MOYEN_ACQUISITION_EDEFAULT = TypeDictionaryDicoMissionFeuxMoyenAcquisition.RATAC;

	/**
	 * The cached value of the '{@link #getMoyenAcquisition() <em>Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenAcquisition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionFeuxMoyenAcquisition moyenAcquisition = MOYEN_ACQUISITION_EDEFAULT;

	/**
	 * This is true if the Moyen Acquisition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyenAcquisitionESet;

	/**
	 * The default value of the '{@link #getMoyenAcquisitionNonRepertorie() <em>Moyen Acquisition Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenAcquisitionNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYEN_ACQUISITION_NON_REPERTORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyenAcquisitionNonRepertorie() <em>Moyen Acquisition Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenAcquisitionNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected String moyenAcquisitionNonRepertorie = MOYEN_ACQUISITION_NON_REPERTORIE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreavis() <em>Preavis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreavis()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree preavis;

	/**
	 * The default value of the '{@link #getCommentaireSurObjectif() <em>Commentaire Sur Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSurObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_SUR_OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireSurObjectif() <em>Commentaire Sur Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSurObjectif()
	 * @generated
	 * @ordered
	 */
	protected String commentaireSurObjectif = COMMENTAIRE_SUR_OBJECTIF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourZoneApplicationFeuxAutreElementControle() <em>APour Zone Application Feux Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneApplicationFeuxAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneApplicationFeuxAutreElementControle;

	/**
	 * The cached value of the '{@link #getRechercheEffet() <em>Recherche Effet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechercheEffet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEffet> rechercheEffet;

	/**
	 * The cached value of the '{@link #getSInteresseATypeObjectifASS() <em>SInteresse AType Objectif ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSInteresseATypeObjectifASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeObjectifASS> sInteresseATypeObjectifASS;

	/**
	 * The cached value of the '{@link #getAPourVolumeEnReserveTypeRepartition() <em>APour Volume En Reserve Type Repartition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVolumeEnReserveTypeRepartition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeRepartition> aPourVolumeEnReserveTypeRepartition;

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
	 * The cached value of the '{@link #getAPourUniteMeleePrioritaireUnite() <em>APour Unite Melee Prioritaire Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteMeleePrioritaireUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteMeleePrioritaireUnite;

	/**
	 * The cached value of the '{@link #getAPourConsommationAlloueeTypeRepartition() <em>APour Consommation Allouee Type Repartition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConsommationAlloueeTypeRepartition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeRepartition> aPourConsommationAlloueeTypeRepartition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionFeuxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionFeux();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionFeuxTypeMission getTypeMission() {
		return typeMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMission(TypeDictionaryDicoMissionFeuxTypeMission newTypeMission) {
		TypeDictionaryDicoMissionFeuxTypeMission oldTypeMission = typeMission;
		typeMission = newTypeMission == null ? TYPE_MISSION_EDEFAULT : newTypeMission;
		boolean oldTypeMissionESet = typeMissionESet;
		typeMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__TYPE_MISSION, oldTypeMission, typeMission, !oldTypeMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMission() {
		TypeDictionaryDicoMissionFeuxTypeMission oldTypeMission = typeMission;
		boolean oldTypeMissionESet = typeMissionESet;
		typeMission = TYPE_MISSION_EDEFAULT;
		typeMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_FEUX__TYPE_MISSION, oldTypeMission, TYPE_MISSION_EDEFAULT, oldTypeMissionESet));
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
	public double getDisponibiliteInstantanee() {
		return disponibiliteInstantanee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibiliteInstantanee(double newDisponibiliteInstantanee) {
		double oldDisponibiliteInstantanee = disponibiliteInstantanee;
		disponibiliteInstantanee = newDisponibiliteInstantanee;
		boolean oldDisponibiliteInstantaneeESet = disponibiliteInstantaneeESet;
		disponibiliteInstantaneeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_INSTANTANEE, oldDisponibiliteInstantanee, disponibiliteInstantanee, !oldDisponibiliteInstantaneeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibiliteInstantanee() {
		double oldDisponibiliteInstantanee = disponibiliteInstantanee;
		boolean oldDisponibiliteInstantaneeESet = disponibiliteInstantaneeESet;
		disponibiliteInstantanee = DISPONIBILITE_INSTANTANEE_EDEFAULT;
		disponibiliteInstantaneeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_INSTANTANEE, oldDisponibiliteInstantanee, DISPONIBILITE_INSTANTANEE_EDEFAULT, oldDisponibiliteInstantaneeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibiliteInstantanee() {
		return disponibiliteInstantaneeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDisponibiliteDifferee() {
		return disponibiliteDifferee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibiliteDifferee(double newDisponibiliteDifferee) {
		double oldDisponibiliteDifferee = disponibiliteDifferee;
		disponibiliteDifferee = newDisponibiliteDifferee;
		boolean oldDisponibiliteDiffereeESet = disponibiliteDiffereeESet;
		disponibiliteDiffereeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_DIFFEREE, oldDisponibiliteDifferee, disponibiliteDifferee, !oldDisponibiliteDiffereeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibiliteDifferee() {
		double oldDisponibiliteDifferee = disponibiliteDifferee;
		boolean oldDisponibiliteDiffereeESet = disponibiliteDiffereeESet;
		disponibiliteDifferee = DISPONIBILITE_DIFFEREE_EDEFAULT;
		disponibiliteDiffereeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_DIFFEREE, oldDisponibiliteDifferee, DISPONIBILITE_DIFFEREE_EDEFAULT, oldDisponibiliteDiffereeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibiliteDifferee() {
		return disponibiliteDiffereeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetTactiqueRecherche getEffetsRecherches() {
		return effetsRecherches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetsRecherches(TypeDictionaryDicoEffetTactiqueRecherche newEffetsRecherches) {
		TypeDictionaryDicoEffetTactiqueRecherche oldEffetsRecherches = effetsRecherches;
		effetsRecherches = newEffetsRecherches == null ? EFFETS_RECHERCHES_EDEFAULT : newEffetsRecherches;
		boolean oldEffetsRecherchesESet = effetsRecherchesESet;
		effetsRecherchesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__EFFETS_RECHERCHES, oldEffetsRecherches, effetsRecherches, !oldEffetsRecherchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetsRecherches() {
		TypeDictionaryDicoEffetTactiqueRecherche oldEffetsRecherches = effetsRecherches;
		boolean oldEffetsRecherchesESet = effetsRecherchesESet;
		effetsRecherches = EFFETS_RECHERCHES_EDEFAULT;
		effetsRecherchesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_FEUX__EFFETS_RECHERCHES, oldEffetsRecherches, EFFETS_RECHERCHES_EDEFAULT, oldEffetsRecherchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetsRecherches() {
		return effetsRecherchesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffetRechercheNonRepertorie() {
		return effetRechercheNonRepertorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetRechercheNonRepertorie(String newEffetRechercheNonRepertorie) {
		String oldEffetRechercheNonRepertorie = effetRechercheNonRepertorie;
		effetRechercheNonRepertorie = newEffetRechercheNonRepertorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__EFFET_RECHERCHE_NON_REPERTORIE, oldEffetRechercheNonRepertorie, effetRechercheNonRepertorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModaliteDeclenchementTirs() {
		return modaliteDeclenchementTirs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModaliteDeclenchementTirs(String newModaliteDeclenchementTirs) {
		String oldModaliteDeclenchementTirs = modaliteDeclenchementTirs;
		modaliteDeclenchementTirs = newModaliteDeclenchementTirs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__MODALITE_DECLENCHEMENT_TIRS, oldModaliteDeclenchementTirs, modaliteDeclenchementTirs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionFeuxMoyenAcquisition getMoyenAcquisition() {
		return moyenAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenAcquisition(TypeDictionaryDicoMissionFeuxMoyenAcquisition newMoyenAcquisition) {
		TypeDictionaryDicoMissionFeuxMoyenAcquisition oldMoyenAcquisition = moyenAcquisition;
		moyenAcquisition = newMoyenAcquisition == null ? MOYEN_ACQUISITION_EDEFAULT : newMoyenAcquisition;
		boolean oldMoyenAcquisitionESet = moyenAcquisitionESet;
		moyenAcquisitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION, oldMoyenAcquisition, moyenAcquisition, !oldMoyenAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyenAcquisition() {
		TypeDictionaryDicoMissionFeuxMoyenAcquisition oldMoyenAcquisition = moyenAcquisition;
		boolean oldMoyenAcquisitionESet = moyenAcquisitionESet;
		moyenAcquisition = MOYEN_ACQUISITION_EDEFAULT;
		moyenAcquisitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION, oldMoyenAcquisition, MOYEN_ACQUISITION_EDEFAULT, oldMoyenAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyenAcquisition() {
		return moyenAcquisitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyenAcquisitionNonRepertorie() {
		return moyenAcquisitionNonRepertorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenAcquisitionNonRepertorie(String newMoyenAcquisitionNonRepertorie) {
		String oldMoyenAcquisitionNonRepertorie = moyenAcquisitionNonRepertorie;
		moyenAcquisitionNonRepertorie = newMoyenAcquisitionNonRepertorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION_NON_REPERTORIE, oldMoyenAcquisitionNonRepertorie, moyenAcquisitionNonRepertorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getPreavis() {
		return preavis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreavis(TypeDataTypeDuree newPreavis, NotificationChain msgs) {
		TypeDataTypeDuree oldPreavis = preavis;
		preavis = newPreavis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__PREAVIS, oldPreavis, newPreavis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreavis(TypeDataTypeDuree newPreavis) {
		if (newPreavis != preavis) {
			NotificationChain msgs = null;
			if (preavis != null)
				msgs = ((InternalEObject)preavis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_FEUX__PREAVIS, null, msgs);
			if (newPreavis != null)
				msgs = ((InternalEObject)newPreavis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_FEUX__PREAVIS, null, msgs);
			msgs = basicSetPreavis(newPreavis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__PREAVIS, newPreavis, newPreavis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireSurObjectif() {
		return commentaireSurObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireSurObjectif(String newCommentaireSurObjectif) {
		String oldCommentaireSurObjectif = commentaireSurObjectif;
		commentaireSurObjectif = newCommentaireSurObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_FEUX__COMMENTAIRE_SUR_OBJECTIF, oldCommentaireSurObjectif, commentaireSurObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneApplicationFeuxAutreElementControle() {
		if (aPourZoneApplicationFeuxAutreElementControle == null) {
			aPourZoneApplicationFeuxAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_FEUX__APOUR_ZONE_APPLICATION_FEUX_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneApplicationFeuxAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEffet> getRechercheEffet() {
		if (rechercheEffet == null) {
			rechercheEffet = new EObjectContainmentEList<TypeEffet>(TypeEffet.class, this, SchemaPackage.TYPE_MISSION_FEUX__RECHERCHE_EFFET);
		}
		return rechercheEffet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeObjectifASS> getSInteresseATypeObjectifASS() {
		if (sInteresseATypeObjectifASS == null) {
			sInteresseATypeObjectifASS = new EObjectContainmentEList<TypeTypeObjectifASS>(TypeTypeObjectifASS.class, this, SchemaPackage.TYPE_MISSION_FEUX__SINTERESSE_ATYPE_OBJECTIF_ASS);
		}
		return sInteresseATypeObjectifASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeRepartition> getAPourVolumeEnReserveTypeRepartition() {
		if (aPourVolumeEnReserveTypeRepartition == null) {
			aPourVolumeEnReserveTypeRepartition = new EObjectContainmentEList<TypeTypeRepartition>(TypeTypeRepartition.class, this, SchemaPackage.TYPE_MISSION_FEUX__APOUR_VOLUME_EN_RESERVE_TYPE_REPARTITION);
		}
		return aPourVolumeEnReserveTypeRepartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUnite() {
		if (aPourUniteExecutanteUnite == null) {
			aPourUniteExecutanteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_EXECUTANTE_UNITE);
		}
		return aPourUniteExecutanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteMeleePrioritaireUnite() {
		if (aPourUniteMeleePrioritaireUnite == null) {
			aPourUniteMeleePrioritaireUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_MELEE_PRIORITAIRE_UNITE);
		}
		return aPourUniteMeleePrioritaireUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeRepartition> getAPourConsommationAlloueeTypeRepartition() {
		if (aPourConsommationAlloueeTypeRepartition == null) {
			aPourConsommationAlloueeTypeRepartition = new EObjectContainmentEList<TypeTypeRepartition>(TypeTypeRepartition.class, this, SchemaPackage.TYPE_MISSION_FEUX__APOUR_CONSOMMATION_ALLOUEE_TYPE_REPARTITION);
		}
		return aPourConsommationAlloueeTypeRepartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_FEUX__PREAVIS:
				return basicSetPreavis(null, msgs);
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_ZONE_APPLICATION_FEUX_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneApplicationFeuxAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_FEUX__RECHERCHE_EFFET:
				return ((InternalEList<?>)getRechercheEffet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_FEUX__SINTERESSE_ATYPE_OBJECTIF_ASS:
				return ((InternalEList<?>)getSInteresseATypeObjectifASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_VOLUME_EN_RESERVE_TYPE_REPARTITION:
				return ((InternalEList<?>)getAPourVolumeEnReserveTypeRepartition()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_EXECUTANTE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_MELEE_PRIORITAIRE_UNITE:
				return ((InternalEList<?>)getAPourUniteMeleePrioritaireUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_CONSOMMATION_ALLOUEE_TYPE_REPARTITION:
				return ((InternalEList<?>)getAPourConsommationAlloueeTypeRepartition()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_FEUX__TYPE_MISSION:
				return getTypeMission();
			case SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_INSTANTANEE:
				return new Double(getDisponibiliteInstantanee());
			case SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_DIFFEREE:
				return new Double(getDisponibiliteDifferee());
			case SchemaPackage.TYPE_MISSION_FEUX__EFFETS_RECHERCHES:
				return getEffetsRecherches();
			case SchemaPackage.TYPE_MISSION_FEUX__EFFET_RECHERCHE_NON_REPERTORIE:
				return getEffetRechercheNonRepertorie();
			case SchemaPackage.TYPE_MISSION_FEUX__MODALITE_DECLENCHEMENT_TIRS:
				return getModaliteDeclenchementTirs();
			case SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION:
				return getMoyenAcquisition();
			case SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION_NON_REPERTORIE:
				return getMoyenAcquisitionNonRepertorie();
			case SchemaPackage.TYPE_MISSION_FEUX__PREAVIS:
				return getPreavis();
			case SchemaPackage.TYPE_MISSION_FEUX__COMMENTAIRE_SUR_OBJECTIF:
				return getCommentaireSurObjectif();
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_ZONE_APPLICATION_FEUX_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneApplicationFeuxAutreElementControle();
			case SchemaPackage.TYPE_MISSION_FEUX__RECHERCHE_EFFET:
				return getRechercheEffet();
			case SchemaPackage.TYPE_MISSION_FEUX__SINTERESSE_ATYPE_OBJECTIF_ASS:
				return getSInteresseATypeObjectifASS();
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_VOLUME_EN_RESERVE_TYPE_REPARTITION:
				return getAPourVolumeEnReserveTypeRepartition();
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_EXECUTANTE_UNITE:
				return getAPourUniteExecutanteUnite();
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_MELEE_PRIORITAIRE_UNITE:
				return getAPourUniteMeleePrioritaireUnite();
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_CONSOMMATION_ALLOUEE_TYPE_REPARTITION:
				return getAPourConsommationAlloueeTypeRepartition();
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
			case SchemaPackage.TYPE_MISSION_FEUX__TYPE_MISSION:
				setTypeMission((TypeDictionaryDicoMissionFeuxTypeMission)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_INSTANTANEE:
				setDisponibiliteInstantanee(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_DIFFEREE:
				setDisponibiliteDifferee(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__EFFETS_RECHERCHES:
				setEffetsRecherches((TypeDictionaryDicoEffetTactiqueRecherche)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__EFFET_RECHERCHE_NON_REPERTORIE:
				setEffetRechercheNonRepertorie((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__MODALITE_DECLENCHEMENT_TIRS:
				setModaliteDeclenchementTirs((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION:
				setMoyenAcquisition((TypeDictionaryDicoMissionFeuxMoyenAcquisition)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION_NON_REPERTORIE:
				setMoyenAcquisitionNonRepertorie((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__PREAVIS:
				setPreavis((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__COMMENTAIRE_SUR_OBJECTIF:
				setCommentaireSurObjectif((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_ZONE_APPLICATION_FEUX_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneApplicationFeuxAutreElementControle().clear();
				getAPourZoneApplicationFeuxAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__RECHERCHE_EFFET:
				getRechercheEffet().clear();
				getRechercheEffet().addAll((Collection<? extends TypeEffet>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__SINTERESSE_ATYPE_OBJECTIF_ASS:
				getSInteresseATypeObjectifASS().clear();
				getSInteresseATypeObjectifASS().addAll((Collection<? extends TypeTypeObjectifASS>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_VOLUME_EN_RESERVE_TYPE_REPARTITION:
				getAPourVolumeEnReserveTypeRepartition().clear();
				getAPourVolumeEnReserveTypeRepartition().addAll((Collection<? extends TypeTypeRepartition>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				getAPourUniteExecutanteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_MELEE_PRIORITAIRE_UNITE:
				getAPourUniteMeleePrioritaireUnite().clear();
				getAPourUniteMeleePrioritaireUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_CONSOMMATION_ALLOUEE_TYPE_REPARTITION:
				getAPourConsommationAlloueeTypeRepartition().clear();
				getAPourConsommationAlloueeTypeRepartition().addAll((Collection<? extends TypeTypeRepartition>)newValue);
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
			case SchemaPackage.TYPE_MISSION_FEUX__TYPE_MISSION:
				unsetTypeMission();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_INSTANTANEE:
				unsetDisponibiliteInstantanee();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_DIFFEREE:
				unsetDisponibiliteDifferee();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__EFFETS_RECHERCHES:
				unsetEffetsRecherches();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__EFFET_RECHERCHE_NON_REPERTORIE:
				setEffetRechercheNonRepertorie(EFFET_RECHERCHE_NON_REPERTORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__MODALITE_DECLENCHEMENT_TIRS:
				setModaliteDeclenchementTirs(MODALITE_DECLENCHEMENT_TIRS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION:
				unsetMoyenAcquisition();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION_NON_REPERTORIE:
				setMoyenAcquisitionNonRepertorie(MOYEN_ACQUISITION_NON_REPERTORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__PREAVIS:
				setPreavis((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__COMMENTAIRE_SUR_OBJECTIF:
				setCommentaireSurObjectif(COMMENTAIRE_SUR_OBJECTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_ZONE_APPLICATION_FEUX_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneApplicationFeuxAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__RECHERCHE_EFFET:
				getRechercheEffet().clear();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__SINTERESSE_ATYPE_OBJECTIF_ASS:
				getSInteresseATypeObjectifASS().clear();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_VOLUME_EN_RESERVE_TYPE_REPARTITION:
				getAPourVolumeEnReserveTypeRepartition().clear();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_MELEE_PRIORITAIRE_UNITE:
				getAPourUniteMeleePrioritaireUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_CONSOMMATION_ALLOUEE_TYPE_REPARTITION:
				getAPourConsommationAlloueeTypeRepartition().clear();
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
			case SchemaPackage.TYPE_MISSION_FEUX__TYPE_MISSION:
				return isSetTypeMission();
			case SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_INSTANTANEE:
				return isSetDisponibiliteInstantanee();
			case SchemaPackage.TYPE_MISSION_FEUX__DISPONIBILITE_DIFFEREE:
				return isSetDisponibiliteDifferee();
			case SchemaPackage.TYPE_MISSION_FEUX__EFFETS_RECHERCHES:
				return isSetEffetsRecherches();
			case SchemaPackage.TYPE_MISSION_FEUX__EFFET_RECHERCHE_NON_REPERTORIE:
				return EFFET_RECHERCHE_NON_REPERTORIE_EDEFAULT == null ? effetRechercheNonRepertorie != null : !EFFET_RECHERCHE_NON_REPERTORIE_EDEFAULT.equals(effetRechercheNonRepertorie);
			case SchemaPackage.TYPE_MISSION_FEUX__MODALITE_DECLENCHEMENT_TIRS:
				return MODALITE_DECLENCHEMENT_TIRS_EDEFAULT == null ? modaliteDeclenchementTirs != null : !MODALITE_DECLENCHEMENT_TIRS_EDEFAULT.equals(modaliteDeclenchementTirs);
			case SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION:
				return isSetMoyenAcquisition();
			case SchemaPackage.TYPE_MISSION_FEUX__MOYEN_ACQUISITION_NON_REPERTORIE:
				return MOYEN_ACQUISITION_NON_REPERTORIE_EDEFAULT == null ? moyenAcquisitionNonRepertorie != null : !MOYEN_ACQUISITION_NON_REPERTORIE_EDEFAULT.equals(moyenAcquisitionNonRepertorie);
			case SchemaPackage.TYPE_MISSION_FEUX__PREAVIS:
				return preavis != null;
			case SchemaPackage.TYPE_MISSION_FEUX__COMMENTAIRE_SUR_OBJECTIF:
				return COMMENTAIRE_SUR_OBJECTIF_EDEFAULT == null ? commentaireSurObjectif != null : !COMMENTAIRE_SUR_OBJECTIF_EDEFAULT.equals(commentaireSurObjectif);
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_ZONE_APPLICATION_FEUX_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneApplicationFeuxAutreElementControle != null && !aPourZoneApplicationFeuxAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_FEUX__RECHERCHE_EFFET:
				return rechercheEffet != null && !rechercheEffet.isEmpty();
			case SchemaPackage.TYPE_MISSION_FEUX__SINTERESSE_ATYPE_OBJECTIF_ASS:
				return sInteresseATypeObjectifASS != null && !sInteresseATypeObjectifASS.isEmpty();
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_VOLUME_EN_RESERVE_TYPE_REPARTITION:
				return aPourVolumeEnReserveTypeRepartition != null && !aPourVolumeEnReserveTypeRepartition.isEmpty();
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_EXECUTANTE_UNITE:
				return aPourUniteExecutanteUnite != null && !aPourUniteExecutanteUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_UNITE_MELEE_PRIORITAIRE_UNITE:
				return aPourUniteMeleePrioritaireUnite != null && !aPourUniteMeleePrioritaireUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_FEUX__APOUR_CONSOMMATION_ALLOUEE_TYPE_REPARTITION:
				return aPourConsommationAlloueeTypeRepartition != null && !aPourConsommationAlloueeTypeRepartition.isEmpty();
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
		result.append(" (typeMission: ");
		if (typeMissionESet) result.append(typeMission); else result.append("<unset>");
		result.append(", disponibiliteInstantanee: ");
		if (disponibiliteInstantaneeESet) result.append(disponibiliteInstantanee); else result.append("<unset>");
		result.append(", disponibiliteDifferee: ");
		if (disponibiliteDiffereeESet) result.append(disponibiliteDifferee); else result.append("<unset>");
		result.append(", effetsRecherches: ");
		if (effetsRecherchesESet) result.append(effetsRecherches); else result.append("<unset>");
		result.append(", effetRechercheNonRepertorie: ");
		result.append(effetRechercheNonRepertorie);
		result.append(", modaliteDeclenchementTirs: ");
		result.append(modaliteDeclenchementTirs);
		result.append(", moyenAcquisition: ");
		if (moyenAcquisitionESet) result.append(moyenAcquisition); else result.append("<unset>");
		result.append(", moyenAcquisitionNonRepertorie: ");
		result.append(moyenAcquisitionNonRepertorie);
		result.append(", commentaireSurObjectif: ");
		result.append(commentaireSurObjectif);
		result.append(')');
		return result.toString();
	}

} //TypeMissionFeuxImpl
