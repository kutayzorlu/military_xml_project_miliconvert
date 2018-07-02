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
import mpia.schema.TypeDictionaryDicoTypeVecteur;
import mpia.schema.TypeMissionDrone;
import mpia.schema.TypeMissionLocalisationRadioElectrique;
import mpia.schema.TypeMissionRadar;
import mpia.schema.TypeMissionRenseignement;
import mpia.schema.TypeMissionRohum;

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
 * An implementation of the model object '<em><b>Type Mission Renseignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getEffortOuPriorite <em>Effort Ou Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getProcedureCRaAppliquer <em>Procedure CRa Appliquer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getPrescriptionParticuliere <em>Prescription Particuliere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getTypeTechniqueAMettreEnOeuvre <em>Type Technique AMettre En Oeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getEstSujetAssociationMissionRenseignementAction <em>Est Sujet Association Mission Renseignement Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getAPourUniteAppuiGenieUnite <em>APour Unite Appui Genie Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getMissionDroneMissionDrone <em>Mission Drone Mission Drone</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getCapteurCapteurRENS <em>Capteur Capteur RENS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getMissionRadarMissionRadar <em>Mission Radar Mission Radar</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique <em>Mission Localisation Radioelectrique Mission Localisation Radio Electrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getMissionROHUMMissionRohum <em>Mission ROHUM Mission Rohum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getAPourZoneRecherchePrioritaireZoneRecherche <em>APour Zone Recherche Prioritaire Zone Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementImpl#getACommeEmplacementObservationAutreElementControle <em>AComme Emplacement Observation Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionRenseignementImpl extends TypeMissionImpl implements TypeMissionRenseignement {
	/**
	 * The default value of the '{@link #getEffortOuPriorite() <em>Effort Ou Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortOuPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFORT_OU_PRIORITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffortOuPriorite() <em>Effort Ou Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortOuPriorite()
	 * @generated
	 * @ordered
	 */
	protected String effortOuPriorite = EFFORT_OU_PRIORITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcedureCRaAppliquer() <em>Procedure CRa Appliquer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureCRaAppliquer()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_CRA_APPLIQUER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcedureCRaAppliquer() <em>Procedure CRa Appliquer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureCRaAppliquer()
	 * @generated
	 * @ordered
	 */
	protected String procedureCRaAppliquer = PROCEDURE_CRA_APPLIQUER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrescriptionParticuliere() <em>Prescription Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionParticuliere()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESCRIPTION_PARTICULIERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrescriptionParticuliere() <em>Prescription Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionParticuliere()
	 * @generated
	 * @ordered
	 */
	protected String prescriptionParticuliere = PRESCRIPTION_PARTICULIERE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeTechniqueAMettreEnOeuvre() <em>Type Technique AMettre En Oeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTechniqueAMettreEnOeuvre()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeVecteur TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE_EDEFAULT = TypeDictionaryDicoTypeVecteur.SAT;

	/**
	 * The cached value of the '{@link #getTypeTechniqueAMettreEnOeuvre() <em>Type Technique AMettre En Oeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTechniqueAMettreEnOeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeVecteur typeTechniqueAMettreEnOeuvre = TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE_EDEFAULT;

	/**
	 * This is true if the Type Technique AMettre En Oeuvre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeTechniqueAMettreEnOeuvreESet;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMissionRenseignementAction() <em>Est Sujet Association Mission Renseignement Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMissionRenseignementAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMissionRenseignementAction;

	/**
	 * The cached value of the '{@link #getAPourUniteAppuiGenieUnite() <em>APour Unite Appui Genie Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteAppuiGenieUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteAppuiGenieUnite;

	/**
	 * The cached value of the '{@link #getMissionDroneMissionDrone() <em>Mission Drone Mission Drone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionDroneMissionDrone()
	 * @generated
	 * @ordered
	 */
	protected TypeMissionDrone missionDroneMissionDrone;

	/**
	 * The cached value of the '{@link #getCapteurCapteurRENS() <em>Capteur Capteur RENS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapteurCapteurRENS()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation capteurCapteurRENS;

	/**
	 * The cached value of the '{@link #getMissionRadarMissionRadar() <em>Mission Radar Mission Radar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionRadarMissionRadar()
	 * @generated
	 * @ordered
	 */
	protected TypeMissionRadar missionRadarMissionRadar;

	/**
	 * The cached value of the '{@link #getMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique() <em>Mission Localisation Radioelectrique Mission Localisation Radio Electrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique()
	 * @generated
	 * @ordered
	 */
	protected TypeMissionLocalisationRadioElectrique missionLocalisationRadioelectriqueMissionLocalisationRadioElectrique;

	/**
	 * The cached value of the '{@link #getMissionROHUMMissionRohum() <em>Mission ROHUM Mission Rohum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionROHUMMissionRohum()
	 * @generated
	 * @ordered
	 */
	protected TypeMissionRohum missionROHUMMissionRohum;

	/**
	 * The cached value of the '{@link #getAPourZoneRecherchePrioritaireZoneRecherche() <em>APour Zone Recherche Prioritaire Zone Recherche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneRecherchePrioritaireZoneRecherche()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneRecherchePrioritaireZoneRecherche;

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
	 * The cached value of the '{@link #getACommeEmplacementObservationAutreElementControle() <em>AComme Emplacement Observation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeEmplacementObservationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeEmplacementObservationAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionRenseignementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionRenseignement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffortOuPriorite() {
		return effortOuPriorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffortOuPriorite(String newEffortOuPriorite) {
		String oldEffortOuPriorite = effortOuPriorite;
		effortOuPriorite = newEffortOuPriorite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EFFORT_OU_PRIORITE, oldEffortOuPriorite, effortOuPriorite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcedureCRaAppliquer() {
		return procedureCRaAppliquer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureCRaAppliquer(String newProcedureCRaAppliquer) {
		String oldProcedureCRaAppliquer = procedureCRaAppliquer;
		procedureCRaAppliquer = newProcedureCRaAppliquer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PROCEDURE_CRA_APPLIQUER, oldProcedureCRaAppliquer, procedureCRaAppliquer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrescriptionParticuliere() {
		return prescriptionParticuliere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptionParticuliere(String newPrescriptionParticuliere) {
		String oldPrescriptionParticuliere = prescriptionParticuliere;
		prescriptionParticuliere = newPrescriptionParticuliere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PRESCRIPTION_PARTICULIERE, oldPrescriptionParticuliere, prescriptionParticuliere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeVecteur getTypeTechniqueAMettreEnOeuvre() {
		return typeTechniqueAMettreEnOeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTechniqueAMettreEnOeuvre(TypeDictionaryDicoTypeVecteur newTypeTechniqueAMettreEnOeuvre) {
		TypeDictionaryDicoTypeVecteur oldTypeTechniqueAMettreEnOeuvre = typeTechniqueAMettreEnOeuvre;
		typeTechniqueAMettreEnOeuvre = newTypeTechniqueAMettreEnOeuvre == null ? TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE_EDEFAULT : newTypeTechniqueAMettreEnOeuvre;
		boolean oldTypeTechniqueAMettreEnOeuvreESet = typeTechniqueAMettreEnOeuvreESet;
		typeTechniqueAMettreEnOeuvreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE, oldTypeTechniqueAMettreEnOeuvre, typeTechniqueAMettreEnOeuvre, !oldTypeTechniqueAMettreEnOeuvreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeTechniqueAMettreEnOeuvre() {
		TypeDictionaryDicoTypeVecteur oldTypeTechniqueAMettreEnOeuvre = typeTechniqueAMettreEnOeuvre;
		boolean oldTypeTechniqueAMettreEnOeuvreESet = typeTechniqueAMettreEnOeuvreESet;
		typeTechniqueAMettreEnOeuvre = TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE_EDEFAULT;
		typeTechniqueAMettreEnOeuvreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE, oldTypeTechniqueAMettreEnOeuvre, TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE_EDEFAULT, oldTypeTechniqueAMettreEnOeuvreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeTechniqueAMettreEnOeuvre() {
		return typeTechniqueAMettreEnOeuvreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMissionRenseignementAction() {
		if (estSujetAssociationMissionRenseignementAction == null) {
			estSujetAssociationMissionRenseignementAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EST_SUJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION);
		}
		return estSujetAssociationMissionRenseignementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteAppuiGenieUnite() {
		if (aPourUniteAppuiGenieUnite == null) {
			aPourUniteAppuiGenieUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_APPUI_GENIE_UNITE);
		}
		return aPourUniteAppuiGenieUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissionDrone getMissionDroneMissionDrone() {
		return missionDroneMissionDrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissionDroneMissionDrone(TypeMissionDrone newMissionDroneMissionDrone, NotificationChain msgs) {
		TypeMissionDrone oldMissionDroneMissionDrone = missionDroneMissionDrone;
		missionDroneMissionDrone = newMissionDroneMissionDrone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_DRONE_MISSION_DRONE, oldMissionDroneMissionDrone, newMissionDroneMissionDrone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionDroneMissionDrone(TypeMissionDrone newMissionDroneMissionDrone) {
		if (newMissionDroneMissionDrone != missionDroneMissionDrone) {
			NotificationChain msgs = null;
			if (missionDroneMissionDrone != null)
				msgs = ((InternalEObject)missionDroneMissionDrone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_DRONE_MISSION_DRONE, null, msgs);
			if (newMissionDroneMissionDrone != null)
				msgs = ((InternalEObject)newMissionDroneMissionDrone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_DRONE_MISSION_DRONE, null, msgs);
			msgs = basicSetMissionDroneMissionDrone(newMissionDroneMissionDrone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_DRONE_MISSION_DRONE, newMissionDroneMissionDrone, newMissionDroneMissionDrone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getCapteurCapteurRENS() {
		return capteurCapteurRENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapteurCapteurRENS(TypeAssociation newCapteurCapteurRENS, NotificationChain msgs) {
		TypeAssociation oldCapteurCapteurRENS = capteurCapteurRENS;
		capteurCapteurRENS = newCapteurCapteurRENS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__CAPTEUR_CAPTEUR_RENS, oldCapteurCapteurRENS, newCapteurCapteurRENS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapteurCapteurRENS(TypeAssociation newCapteurCapteurRENS) {
		if (newCapteurCapteurRENS != capteurCapteurRENS) {
			NotificationChain msgs = null;
			if (capteurCapteurRENS != null)
				msgs = ((InternalEObject)capteurCapteurRENS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__CAPTEUR_CAPTEUR_RENS, null, msgs);
			if (newCapteurCapteurRENS != null)
				msgs = ((InternalEObject)newCapteurCapteurRENS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__CAPTEUR_CAPTEUR_RENS, null, msgs);
			msgs = basicSetCapteurCapteurRENS(newCapteurCapteurRENS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__CAPTEUR_CAPTEUR_RENS, newCapteurCapteurRENS, newCapteurCapteurRENS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissionRadar getMissionRadarMissionRadar() {
		return missionRadarMissionRadar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissionRadarMissionRadar(TypeMissionRadar newMissionRadarMissionRadar, NotificationChain msgs) {
		TypeMissionRadar oldMissionRadarMissionRadar = missionRadarMissionRadar;
		missionRadarMissionRadar = newMissionRadarMissionRadar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_RADAR_MISSION_RADAR, oldMissionRadarMissionRadar, newMissionRadarMissionRadar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionRadarMissionRadar(TypeMissionRadar newMissionRadarMissionRadar) {
		if (newMissionRadarMissionRadar != missionRadarMissionRadar) {
			NotificationChain msgs = null;
			if (missionRadarMissionRadar != null)
				msgs = ((InternalEObject)missionRadarMissionRadar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_RADAR_MISSION_RADAR, null, msgs);
			if (newMissionRadarMissionRadar != null)
				msgs = ((InternalEObject)newMissionRadarMissionRadar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_RADAR_MISSION_RADAR, null, msgs);
			msgs = basicSetMissionRadarMissionRadar(newMissionRadarMissionRadar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_RADAR_MISSION_RADAR, newMissionRadarMissionRadar, newMissionRadarMissionRadar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissionLocalisationRadioElectrique getMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique() {
		return missionLocalisationRadioelectriqueMissionLocalisationRadioElectrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique(TypeMissionLocalisationRadioElectrique newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique, NotificationChain msgs) {
		TypeMissionLocalisationRadioElectrique oldMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique = missionLocalisationRadioelectriqueMissionLocalisationRadioElectrique;
		missionLocalisationRadioelectriqueMissionLocalisationRadioElectrique = newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_LOCALISATION_RADIOELECTRIQUE_MISSION_LOCALISATION_RADIO_ELECTRIQUE, oldMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique, newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique(TypeMissionLocalisationRadioElectrique newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique) {
		if (newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique != missionLocalisationRadioelectriqueMissionLocalisationRadioElectrique) {
			NotificationChain msgs = null;
			if (missionLocalisationRadioelectriqueMissionLocalisationRadioElectrique != null)
				msgs = ((InternalEObject)missionLocalisationRadioelectriqueMissionLocalisationRadioElectrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_LOCALISATION_RADIOELECTRIQUE_MISSION_LOCALISATION_RADIO_ELECTRIQUE, null, msgs);
			if (newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique != null)
				msgs = ((InternalEObject)newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_LOCALISATION_RADIOELECTRIQUE_MISSION_LOCALISATION_RADIO_ELECTRIQUE, null, msgs);
			msgs = basicSetMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique(newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_LOCALISATION_RADIOELECTRIQUE_MISSION_LOCALISATION_RADIO_ELECTRIQUE, newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique, newMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissionRohum getMissionROHUMMissionRohum() {
		return missionROHUMMissionRohum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissionROHUMMissionRohum(TypeMissionRohum newMissionROHUMMissionRohum, NotificationChain msgs) {
		TypeMissionRohum oldMissionROHUMMissionRohum = missionROHUMMissionRohum;
		missionROHUMMissionRohum = newMissionROHUMMissionRohum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_ROHUM_MISSION_ROHUM, oldMissionROHUMMissionRohum, newMissionROHUMMissionRohum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionROHUMMissionRohum(TypeMissionRohum newMissionROHUMMissionRohum) {
		if (newMissionROHUMMissionRohum != missionROHUMMissionRohum) {
			NotificationChain msgs = null;
			if (missionROHUMMissionRohum != null)
				msgs = ((InternalEObject)missionROHUMMissionRohum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_ROHUM_MISSION_ROHUM, null, msgs);
			if (newMissionROHUMMissionRohum != null)
				msgs = ((InternalEObject)newMissionROHUMMissionRohum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_ROHUM_MISSION_ROHUM, null, msgs);
			msgs = basicSetMissionROHUMMissionRohum(newMissionROHUMMissionRohum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_ROHUM_MISSION_ROHUM, newMissionROHUMMissionRohum, newMissionROHUMMissionRohum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneRecherchePrioritaireZoneRecherche() {
		return aPourZoneRecherchePrioritaireZoneRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneRecherchePrioritaireZoneRecherche(TypeAssociation newAPourZoneRecherchePrioritaireZoneRecherche, NotificationChain msgs) {
		TypeAssociation oldAPourZoneRecherchePrioritaireZoneRecherche = aPourZoneRecherchePrioritaireZoneRecherche;
		aPourZoneRecherchePrioritaireZoneRecherche = newAPourZoneRecherchePrioritaireZoneRecherche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_ZONE_RECHERCHE_PRIORITAIRE_ZONE_RECHERCHE, oldAPourZoneRecherchePrioritaireZoneRecherche, newAPourZoneRecherchePrioritaireZoneRecherche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneRecherchePrioritaireZoneRecherche(TypeAssociation newAPourZoneRecherchePrioritaireZoneRecherche) {
		if (newAPourZoneRecherchePrioritaireZoneRecherche != aPourZoneRecherchePrioritaireZoneRecherche) {
			NotificationChain msgs = null;
			if (aPourZoneRecherchePrioritaireZoneRecherche != null)
				msgs = ((InternalEObject)aPourZoneRecherchePrioritaireZoneRecherche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_ZONE_RECHERCHE_PRIORITAIRE_ZONE_RECHERCHE, null, msgs);
			if (newAPourZoneRecherchePrioritaireZoneRecherche != null)
				msgs = ((InternalEObject)newAPourZoneRecherchePrioritaireZoneRecherche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_ZONE_RECHERCHE_PRIORITAIRE_ZONE_RECHERCHE, null, msgs);
			msgs = basicSetAPourZoneRecherchePrioritaireZoneRecherche(newAPourZoneRecherchePrioritaireZoneRecherche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_ZONE_RECHERCHE_PRIORITAIRE_ZONE_RECHERCHE, newAPourZoneRecherchePrioritaireZoneRecherche, newAPourZoneRecherchePrioritaireZoneRecherche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUnite() {
		if (aPourUniteExecutanteUnite == null) {
			aPourUniteExecutanteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_EXECUTANTE_UNITE);
		}
		return aPourUniteExecutanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeEmplacementObservationAutreElementControle() {
		return aCommeEmplacementObservationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeEmplacementObservationAutreElementControle(TypeAssociation newACommeEmplacementObservationAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeEmplacementObservationAutreElementControle = aCommeEmplacementObservationAutreElementControle;
		aCommeEmplacementObservationAutreElementControle = newACommeEmplacementObservationAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__ACOMME_EMPLACEMENT_OBSERVATION_AUTRE_ELEMENT_CONTROLE, oldACommeEmplacementObservationAutreElementControle, newACommeEmplacementObservationAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeEmplacementObservationAutreElementControle(TypeAssociation newACommeEmplacementObservationAutreElementControle) {
		if (newACommeEmplacementObservationAutreElementControle != aCommeEmplacementObservationAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeEmplacementObservationAutreElementControle != null)
				msgs = ((InternalEObject)aCommeEmplacementObservationAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__ACOMME_EMPLACEMENT_OBSERVATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeEmplacementObservationAutreElementControle != null)
				msgs = ((InternalEObject)newACommeEmplacementObservationAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__ACOMME_EMPLACEMENT_OBSERVATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeEmplacementObservationAutreElementControle(newACommeEmplacementObservationAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__ACOMME_EMPLACEMENT_OBSERVATION_AUTRE_ELEMENT_CONTROLE, newACommeEmplacementObservationAutreElementControle, newACommeEmplacementObservationAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EST_SUJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				return ((InternalEList<?>)getEstSujetAssociationMissionRenseignementAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_APPUI_GENIE_UNITE:
				return ((InternalEList<?>)getAPourUniteAppuiGenieUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_DRONE_MISSION_DRONE:
				return basicSetMissionDroneMissionDrone(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__CAPTEUR_CAPTEUR_RENS:
				return basicSetCapteurCapteurRENS(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_RADAR_MISSION_RADAR:
				return basicSetMissionRadarMissionRadar(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_LOCALISATION_RADIOELECTRIQUE_MISSION_LOCALISATION_RADIO_ELECTRIQUE:
				return basicSetMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_ROHUM_MISSION_ROHUM:
				return basicSetMissionROHUMMissionRohum(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_ZONE_RECHERCHE_PRIORITAIRE_ZONE_RECHERCHE:
				return basicSetAPourZoneRecherchePrioritaireZoneRecherche(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_EXECUTANTE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__ACOMME_EMPLACEMENT_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeEmplacementObservationAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EFFORT_OU_PRIORITE:
				return getEffortOuPriorite();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PROCEDURE_CRA_APPLIQUER:
				return getProcedureCRaAppliquer();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PRESCRIPTION_PARTICULIERE:
				return getPrescriptionParticuliere();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE:
				return getTypeTechniqueAMettreEnOeuvre();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EST_SUJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				return getEstSujetAssociationMissionRenseignementAction();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_APPUI_GENIE_UNITE:
				return getAPourUniteAppuiGenieUnite();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_DRONE_MISSION_DRONE:
				return getMissionDroneMissionDrone();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__CAPTEUR_CAPTEUR_RENS:
				return getCapteurCapteurRENS();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_RADAR_MISSION_RADAR:
				return getMissionRadarMissionRadar();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_LOCALISATION_RADIOELECTRIQUE_MISSION_LOCALISATION_RADIO_ELECTRIQUE:
				return getMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_ROHUM_MISSION_ROHUM:
				return getMissionROHUMMissionRohum();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_ZONE_RECHERCHE_PRIORITAIRE_ZONE_RECHERCHE:
				return getAPourZoneRecherchePrioritaireZoneRecherche();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_EXECUTANTE_UNITE:
				return getAPourUniteExecutanteUnite();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__ACOMME_EMPLACEMENT_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				return getACommeEmplacementObservationAutreElementControle();
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
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EFFORT_OU_PRIORITE:
				setEffortOuPriorite((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PROCEDURE_CRA_APPLIQUER:
				setProcedureCRaAppliquer((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PRESCRIPTION_PARTICULIERE:
				setPrescriptionParticuliere((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE:
				setTypeTechniqueAMettreEnOeuvre((TypeDictionaryDicoTypeVecteur)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EST_SUJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				getEstSujetAssociationMissionRenseignementAction().clear();
				getEstSujetAssociationMissionRenseignementAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_APPUI_GENIE_UNITE:
				getAPourUniteAppuiGenieUnite().clear();
				getAPourUniteAppuiGenieUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_DRONE_MISSION_DRONE:
				setMissionDroneMissionDrone((TypeMissionDrone)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__CAPTEUR_CAPTEUR_RENS:
				setCapteurCapteurRENS((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_RADAR_MISSION_RADAR:
				setMissionRadarMissionRadar((TypeMissionRadar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_LOCALISATION_RADIOELECTRIQUE_MISSION_LOCALISATION_RADIO_ELECTRIQUE:
				setMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique((TypeMissionLocalisationRadioElectrique)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_ROHUM_MISSION_ROHUM:
				setMissionROHUMMissionRohum((TypeMissionRohum)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_ZONE_RECHERCHE_PRIORITAIRE_ZONE_RECHERCHE:
				setAPourZoneRecherchePrioritaireZoneRecherche((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				getAPourUniteExecutanteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__ACOMME_EMPLACEMENT_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				setACommeEmplacementObservationAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EFFORT_OU_PRIORITE:
				setEffortOuPriorite(EFFORT_OU_PRIORITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PROCEDURE_CRA_APPLIQUER:
				setProcedureCRaAppliquer(PROCEDURE_CRA_APPLIQUER_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PRESCRIPTION_PARTICULIERE:
				setPrescriptionParticuliere(PRESCRIPTION_PARTICULIERE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE:
				unsetTypeTechniqueAMettreEnOeuvre();
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EST_SUJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				getEstSujetAssociationMissionRenseignementAction().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_APPUI_GENIE_UNITE:
				getAPourUniteAppuiGenieUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_DRONE_MISSION_DRONE:
				setMissionDroneMissionDrone((TypeMissionDrone)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__CAPTEUR_CAPTEUR_RENS:
				setCapteurCapteurRENS((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_RADAR_MISSION_RADAR:
				setMissionRadarMissionRadar((TypeMissionRadar)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_LOCALISATION_RADIOELECTRIQUE_MISSION_LOCALISATION_RADIO_ELECTRIQUE:
				setMissionLocalisationRadioelectriqueMissionLocalisationRadioElectrique((TypeMissionLocalisationRadioElectrique)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_ROHUM_MISSION_ROHUM:
				setMissionROHUMMissionRohum((TypeMissionRohum)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_ZONE_RECHERCHE_PRIORITAIRE_ZONE_RECHERCHE:
				setAPourZoneRecherchePrioritaireZoneRecherche((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__ACOMME_EMPLACEMENT_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				setACommeEmplacementObservationAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EFFORT_OU_PRIORITE:
				return EFFORT_OU_PRIORITE_EDEFAULT == null ? effortOuPriorite != null : !EFFORT_OU_PRIORITE_EDEFAULT.equals(effortOuPriorite);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PROCEDURE_CRA_APPLIQUER:
				return PROCEDURE_CRA_APPLIQUER_EDEFAULT == null ? procedureCRaAppliquer != null : !PROCEDURE_CRA_APPLIQUER_EDEFAULT.equals(procedureCRaAppliquer);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__PRESCRIPTION_PARTICULIERE:
				return PRESCRIPTION_PARTICULIERE_EDEFAULT == null ? prescriptionParticuliere != null : !PRESCRIPTION_PARTICULIERE_EDEFAULT.equals(prescriptionParticuliere);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__TYPE_TECHNIQUE_AMETTRE_EN_OEUVRE:
				return isSetTypeTechniqueAMettreEnOeuvre();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__EST_SUJET_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION:
				return estSujetAssociationMissionRenseignementAction != null && !estSujetAssociationMissionRenseignementAction.isEmpty();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_APPUI_GENIE_UNITE:
				return aPourUniteAppuiGenieUnite != null && !aPourUniteAppuiGenieUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_DRONE_MISSION_DRONE:
				return missionDroneMissionDrone != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__CAPTEUR_CAPTEUR_RENS:
				return capteurCapteurRENS != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_RADAR_MISSION_RADAR:
				return missionRadarMissionRadar != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_LOCALISATION_RADIOELECTRIQUE_MISSION_LOCALISATION_RADIO_ELECTRIQUE:
				return missionLocalisationRadioelectriqueMissionLocalisationRadioElectrique != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__MISSION_ROHUM_MISSION_ROHUM:
				return missionROHUMMissionRohum != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_ZONE_RECHERCHE_PRIORITAIRE_ZONE_RECHERCHE:
				return aPourZoneRecherchePrioritaireZoneRecherche != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__APOUR_UNITE_EXECUTANTE_UNITE:
				return aPourUniteExecutanteUnite != null && !aPourUniteExecutanteUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT__ACOMME_EMPLACEMENT_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				return aCommeEmplacementObservationAutreElementControle != null;
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
		result.append(" (effortOuPriorite: ");
		result.append(effortOuPriorite);
		result.append(", procedureCRaAppliquer: ");
		result.append(procedureCRaAppliquer);
		result.append(", prescriptionParticuliere: ");
		result.append(prescriptionParticuliere);
		result.append(", typeTechniqueAMettreEnOeuvre: ");
		if (typeTechniqueAMettreEnOeuvreESet) result.append(typeTechniqueAMettreEnOeuvre); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMissionRenseignementImpl
