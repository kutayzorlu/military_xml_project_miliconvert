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
import mpia.schema.TypeConduiteATenir;
import mpia.schema.TypeConsigneParticuliere;
import mpia.schema.TypeDictionaryDicoEchelonEchelon;
import mpia.schema.TypeDureeIntervention;
import mpia.schema.TypeMissionMaintenance;
import mpia.schema.TypeRattachement;
import mpia.schema.TypeUniteMateriel;

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
 * An implementation of the model object '<em><b>Type Mission Maintenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getAllocationsConsenties <em>Allocations Consenties</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getDommagesPrevisionnels <em>Dommages Previsionnels</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getEchelonUniteSoutenue <em>Echelon Unite Soutenue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getForceASoutenir <em>Force ASoutenir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getMissionUlterieure <em>Mission Ulterieure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getRessourcesAttendues <em>Ressources Attendues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getStabiliteEscomptee <em>Stabilite Escomptee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getAPourUniteMettantEnOeuvreMaterielUniteMateriel <em>APour Unite Mettant En Oeuvre Materiel Unite Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getAPourRattachementInterneRattachement <em>APour Rattachement Interne Rattachement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getACommeConduiteATenirConduiteATenir <em>AComme Conduite ATenir Conduite ATenir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getACommeConsigneParticuliereConsigneParticuliere <em>AComme Consigne Particuliere Consigne Particuliere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getAPourDureeDInterventionDureeIntervention <em>APour Duree DIntervention Duree Intervention</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getAPourPrioritesTactiquesPrioriteTactique <em>APour Priorites Tactiques Priorite Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMaintenanceImpl#getAPourPrioritesTechniquesPrioriteTechnique <em>APour Priorites Techniques Priorite Technique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionMaintenanceImpl extends TypeMissionLogistiqueImpl implements TypeMissionMaintenance {
	/**
	 * The default value of the '{@link #getAllocationsConsenties() <em>Allocations Consenties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationsConsenties()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOCATIONS_CONSENTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocationsConsenties() <em>Allocations Consenties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationsConsenties()
	 * @generated
	 * @ordered
	 */
	protected String allocationsConsenties = ALLOCATIONS_CONSENTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDommagesPrevisionnels() <em>Dommages Previsionnels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDommagesPrevisionnels()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMMAGES_PREVISIONNELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDommagesPrevisionnels() <em>Dommages Previsionnels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDommagesPrevisionnels()
	 * @generated
	 * @ordered
	 */
	protected String dommagesPrevisionnels = DOMMAGES_PREVISIONNELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEchelonUniteSoutenue() <em>Echelon Unite Soutenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelonUniteSoutenue()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEchelonEchelon ECHELON_UNITE_SOUTENUE_EDEFAULT = TypeDictionaryDicoEchelonEchelon._1ECH;

	/**
	 * The cached value of the '{@link #getEchelonUniteSoutenue() <em>Echelon Unite Soutenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelonUniteSoutenue()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEchelonEchelon echelonUniteSoutenue = ECHELON_UNITE_SOUTENUE_EDEFAULT;

	/**
	 * This is true if the Echelon Unite Soutenue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelonUniteSoutenueESet;

	/**
	 * The default value of the '{@link #getForceASoutenir() <em>Force ASoutenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceASoutenir()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_ASOUTENIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceASoutenir() <em>Force ASoutenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceASoutenir()
	 * @generated
	 * @ordered
	 */
	protected String forceASoutenir = FORCE_ASOUTENIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissionUlterieure() <em>Mission Ulterieure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionUlterieure()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSION_ULTERIEURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissionUlterieure() <em>Mission Ulterieure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionUlterieure()
	 * @generated
	 * @ordered
	 */
	protected String missionUlterieure = MISSION_ULTERIEURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRessourcesAttendues() <em>Ressources Attendues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourcesAttendues()
	 * @generated
	 * @ordered
	 */
	protected static final String RESSOURCES_ATTENDUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRessourcesAttendues() <em>Ressources Attendues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourcesAttendues()
	 * @generated
	 * @ordered
	 */
	protected String ressourcesAttendues = RESSOURCES_ATTENDUES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStabiliteEscomptee() <em>Stabilite Escomptee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabiliteEscomptee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree stabiliteEscomptee;

	/**
	 * The cached value of the '{@link #getAPourUniteMettantEnOeuvreMaterielUniteMateriel() <em>APour Unite Mettant En Oeuvre Materiel Unite Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteMettantEnOeuvreMaterielUniteMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeUniteMateriel> aPourUniteMettantEnOeuvreMaterielUniteMateriel;

	/**
	 * The cached value of the '{@link #getAPourRattachementInterneRattachement() <em>APour Rattachement Interne Rattachement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRattachementInterneRattachement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRattachement> aPourRattachementInterneRattachement;

	/**
	 * The cached value of the '{@link #getACommeConduiteATenirConduiteATenir() <em>AComme Conduite ATenir Conduite ATenir</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConduiteATenirConduiteATenir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConduiteATenir> aCommeConduiteATenirConduiteATenir;

	/**
	 * The cached value of the '{@link #getACommeConsigneParticuliereConsigneParticuliere() <em>AComme Consigne Particuliere Consigne Particuliere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsigneParticuliereConsigneParticuliere()
	 * @generated
	 * @ordered
	 */
	protected TypeConsigneParticuliere aCommeConsigneParticuliereConsigneParticuliere;

	/**
	 * The cached value of the '{@link #getAPourDureeDInterventionDureeIntervention() <em>APour Duree DIntervention Duree Intervention</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDureeDInterventionDureeIntervention()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDureeIntervention> aPourDureeDInterventionDureeIntervention;

	/**
	 * The cached value of the '{@link #getAPourPrioritesTactiquesPrioriteTactique() <em>APour Priorites Tactiques Priorite Tactique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPrioritesTactiquesPrioriteTactique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourPrioritesTactiquesPrioriteTactique;

	/**
	 * The cached value of the '{@link #getAPourPrioritesTechniquesPrioriteTechnique() <em>APour Priorites Techniques Priorite Technique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPrioritesTechniquesPrioriteTechnique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourPrioritesTechniquesPrioriteTechnique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionMaintenance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllocationsConsenties() {
		return allocationsConsenties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationsConsenties(String newAllocationsConsenties) {
		String oldAllocationsConsenties = allocationsConsenties;
		allocationsConsenties = newAllocationsConsenties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__ALLOCATIONS_CONSENTIES, oldAllocationsConsenties, allocationsConsenties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDommagesPrevisionnels() {
		return dommagesPrevisionnels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDommagesPrevisionnels(String newDommagesPrevisionnels) {
		String oldDommagesPrevisionnels = dommagesPrevisionnels;
		dommagesPrevisionnels = newDommagesPrevisionnels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__DOMMAGES_PREVISIONNELS, oldDommagesPrevisionnels, dommagesPrevisionnels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEchelonEchelon getEchelonUniteSoutenue() {
		return echelonUniteSoutenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelonUniteSoutenue(TypeDictionaryDicoEchelonEchelon newEchelonUniteSoutenue) {
		TypeDictionaryDicoEchelonEchelon oldEchelonUniteSoutenue = echelonUniteSoutenue;
		echelonUniteSoutenue = newEchelonUniteSoutenue == null ? ECHELON_UNITE_SOUTENUE_EDEFAULT : newEchelonUniteSoutenue;
		boolean oldEchelonUniteSoutenueESet = echelonUniteSoutenueESet;
		echelonUniteSoutenueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__ECHELON_UNITE_SOUTENUE, oldEchelonUniteSoutenue, echelonUniteSoutenue, !oldEchelonUniteSoutenueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelonUniteSoutenue() {
		TypeDictionaryDicoEchelonEchelon oldEchelonUniteSoutenue = echelonUniteSoutenue;
		boolean oldEchelonUniteSoutenueESet = echelonUniteSoutenueESet;
		echelonUniteSoutenue = ECHELON_UNITE_SOUTENUE_EDEFAULT;
		echelonUniteSoutenueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_MAINTENANCE__ECHELON_UNITE_SOUTENUE, oldEchelonUniteSoutenue, ECHELON_UNITE_SOUTENUE_EDEFAULT, oldEchelonUniteSoutenueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelonUniteSoutenue() {
		return echelonUniteSoutenueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForceASoutenir() {
		return forceASoutenir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceASoutenir(String newForceASoutenir) {
		String oldForceASoutenir = forceASoutenir;
		forceASoutenir = newForceASoutenir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__FORCE_ASOUTENIR, oldForceASoutenir, forceASoutenir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissionUlterieure() {
		return missionUlterieure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionUlterieure(String newMissionUlterieure) {
		String oldMissionUlterieure = missionUlterieure;
		missionUlterieure = newMissionUlterieure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__MISSION_ULTERIEURE, oldMissionUlterieure, missionUlterieure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRessourcesAttendues() {
		return ressourcesAttendues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessourcesAttendues(String newRessourcesAttendues) {
		String oldRessourcesAttendues = ressourcesAttendues;
		ressourcesAttendues = newRessourcesAttendues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__RESSOURCES_ATTENDUES, oldRessourcesAttendues, ressourcesAttendues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getStabiliteEscomptee() {
		return stabiliteEscomptee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStabiliteEscomptee(TypeDataTypeDuree newStabiliteEscomptee, NotificationChain msgs) {
		TypeDataTypeDuree oldStabiliteEscomptee = stabiliteEscomptee;
		stabiliteEscomptee = newStabiliteEscomptee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__STABILITE_ESCOMPTEE, oldStabiliteEscomptee, newStabiliteEscomptee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStabiliteEscomptee(TypeDataTypeDuree newStabiliteEscomptee) {
		if (newStabiliteEscomptee != stabiliteEscomptee) {
			NotificationChain msgs = null;
			if (stabiliteEscomptee != null)
				msgs = ((InternalEObject)stabiliteEscomptee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_MAINTENANCE__STABILITE_ESCOMPTEE, null, msgs);
			if (newStabiliteEscomptee != null)
				msgs = ((InternalEObject)newStabiliteEscomptee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_MAINTENANCE__STABILITE_ESCOMPTEE, null, msgs);
			msgs = basicSetStabiliteEscomptee(newStabiliteEscomptee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__STABILITE_ESCOMPTEE, newStabiliteEscomptee, newStabiliteEscomptee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeUniteMateriel> getAPourUniteMettantEnOeuvreMaterielUniteMateriel() {
		if (aPourUniteMettantEnOeuvreMaterielUniteMateriel == null) {
			aPourUniteMettantEnOeuvreMaterielUniteMateriel = new EObjectContainmentEList<TypeUniteMateriel>(TypeUniteMateriel.class, this, SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_UNITE_METTANT_EN_OEUVRE_MATERIEL_UNITE_MATERIEL);
		}
		return aPourUniteMettantEnOeuvreMaterielUniteMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRattachement> getAPourRattachementInterneRattachement() {
		if (aPourRattachementInterneRattachement == null) {
			aPourRattachementInterneRattachement = new EObjectContainmentEList<TypeRattachement>(TypeRattachement.class, this, SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_RATTACHEMENT_INTERNE_RATTACHEMENT);
		}
		return aPourRattachementInterneRattachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConduiteATenir> getACommeConduiteATenirConduiteATenir() {
		if (aCommeConduiteATenirConduiteATenir == null) {
			aCommeConduiteATenirConduiteATenir = new EObjectContainmentEList<TypeConduiteATenir>(TypeConduiteATenir.class, this, SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONDUITE_ATENIR_CONDUITE_ATENIR);
		}
		return aCommeConduiteATenirConduiteATenir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConsigneParticuliere getACommeConsigneParticuliereConsigneParticuliere() {
		return aCommeConsigneParticuliereConsigneParticuliere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeConsigneParticuliereConsigneParticuliere(TypeConsigneParticuliere newACommeConsigneParticuliereConsigneParticuliere, NotificationChain msgs) {
		TypeConsigneParticuliere oldACommeConsigneParticuliereConsigneParticuliere = aCommeConsigneParticuliereConsigneParticuliere;
		aCommeConsigneParticuliereConsigneParticuliere = newACommeConsigneParticuliereConsigneParticuliere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONSIGNE_PARTICULIERE_CONSIGNE_PARTICULIERE, oldACommeConsigneParticuliereConsigneParticuliere, newACommeConsigneParticuliereConsigneParticuliere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeConsigneParticuliereConsigneParticuliere(TypeConsigneParticuliere newACommeConsigneParticuliereConsigneParticuliere) {
		if (newACommeConsigneParticuliereConsigneParticuliere != aCommeConsigneParticuliereConsigneParticuliere) {
			NotificationChain msgs = null;
			if (aCommeConsigneParticuliereConsigneParticuliere != null)
				msgs = ((InternalEObject)aCommeConsigneParticuliereConsigneParticuliere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONSIGNE_PARTICULIERE_CONSIGNE_PARTICULIERE, null, msgs);
			if (newACommeConsigneParticuliereConsigneParticuliere != null)
				msgs = ((InternalEObject)newACommeConsigneParticuliereConsigneParticuliere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONSIGNE_PARTICULIERE_CONSIGNE_PARTICULIERE, null, msgs);
			msgs = basicSetACommeConsigneParticuliereConsigneParticuliere(newACommeConsigneParticuliereConsigneParticuliere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONSIGNE_PARTICULIERE_CONSIGNE_PARTICULIERE, newACommeConsigneParticuliereConsigneParticuliere, newACommeConsigneParticuliereConsigneParticuliere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDureeIntervention> getAPourDureeDInterventionDureeIntervention() {
		if (aPourDureeDInterventionDureeIntervention == null) {
			aPourDureeDInterventionDureeIntervention = new EObjectContainmentEList<TypeDureeIntervention>(TypeDureeIntervention.class, this, SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_DUREE_DINTERVENTION_DUREE_INTERVENTION);
		}
		return aPourDureeDInterventionDureeIntervention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourPrioritesTactiquesPrioriteTactique() {
		if (aPourPrioritesTactiquesPrioriteTactique == null) {
			aPourPrioritesTactiquesPrioriteTactique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TACTIQUES_PRIORITE_TACTIQUE);
		}
		return aPourPrioritesTactiquesPrioriteTactique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourPrioritesTechniquesPrioriteTechnique() {
		if (aPourPrioritesTechniquesPrioriteTechnique == null) {
			aPourPrioritesTechniquesPrioriteTechnique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TECHNIQUES_PRIORITE_TECHNIQUE);
		}
		return aPourPrioritesTechniquesPrioriteTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__STABILITE_ESCOMPTEE:
				return basicSetStabiliteEscomptee(null, msgs);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_UNITE_METTANT_EN_OEUVRE_MATERIEL_UNITE_MATERIEL:
				return ((InternalEList<?>)getAPourUniteMettantEnOeuvreMaterielUniteMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_RATTACHEMENT_INTERNE_RATTACHEMENT:
				return ((InternalEList<?>)getAPourRattachementInterneRattachement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONDUITE_ATENIR_CONDUITE_ATENIR:
				return ((InternalEList<?>)getACommeConduiteATenirConduiteATenir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONSIGNE_PARTICULIERE_CONSIGNE_PARTICULIERE:
				return basicSetACommeConsigneParticuliereConsigneParticuliere(null, msgs);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_DUREE_DINTERVENTION_DUREE_INTERVENTION:
				return ((InternalEList<?>)getAPourDureeDInterventionDureeIntervention()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TACTIQUES_PRIORITE_TACTIQUE:
				return ((InternalEList<?>)getAPourPrioritesTactiquesPrioriteTactique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TECHNIQUES_PRIORITE_TECHNIQUE:
				return ((InternalEList<?>)getAPourPrioritesTechniquesPrioriteTechnique()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ALLOCATIONS_CONSENTIES:
				return getAllocationsConsenties();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__DOMMAGES_PREVISIONNELS:
				return getDommagesPrevisionnels();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ECHELON_UNITE_SOUTENUE:
				return getEchelonUniteSoutenue();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__FORCE_ASOUTENIR:
				return getForceASoutenir();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__MISSION_ULTERIEURE:
				return getMissionUlterieure();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__RESSOURCES_ATTENDUES:
				return getRessourcesAttendues();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__STABILITE_ESCOMPTEE:
				return getStabiliteEscomptee();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_UNITE_METTANT_EN_OEUVRE_MATERIEL_UNITE_MATERIEL:
				return getAPourUniteMettantEnOeuvreMaterielUniteMateriel();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_RATTACHEMENT_INTERNE_RATTACHEMENT:
				return getAPourRattachementInterneRattachement();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONDUITE_ATENIR_CONDUITE_ATENIR:
				return getACommeConduiteATenirConduiteATenir();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONSIGNE_PARTICULIERE_CONSIGNE_PARTICULIERE:
				return getACommeConsigneParticuliereConsigneParticuliere();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_DUREE_DINTERVENTION_DUREE_INTERVENTION:
				return getAPourDureeDInterventionDureeIntervention();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TACTIQUES_PRIORITE_TACTIQUE:
				return getAPourPrioritesTactiquesPrioriteTactique();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TECHNIQUES_PRIORITE_TECHNIQUE:
				return getAPourPrioritesTechniquesPrioriteTechnique();
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
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ALLOCATIONS_CONSENTIES:
				setAllocationsConsenties((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__DOMMAGES_PREVISIONNELS:
				setDommagesPrevisionnels((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ECHELON_UNITE_SOUTENUE:
				setEchelonUniteSoutenue((TypeDictionaryDicoEchelonEchelon)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__FORCE_ASOUTENIR:
				setForceASoutenir((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__MISSION_ULTERIEURE:
				setMissionUlterieure((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__RESSOURCES_ATTENDUES:
				setRessourcesAttendues((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__STABILITE_ESCOMPTEE:
				setStabiliteEscomptee((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_UNITE_METTANT_EN_OEUVRE_MATERIEL_UNITE_MATERIEL:
				getAPourUniteMettantEnOeuvreMaterielUniteMateriel().clear();
				getAPourUniteMettantEnOeuvreMaterielUniteMateriel().addAll((Collection<? extends TypeUniteMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_RATTACHEMENT_INTERNE_RATTACHEMENT:
				getAPourRattachementInterneRattachement().clear();
				getAPourRattachementInterneRattachement().addAll((Collection<? extends TypeRattachement>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONDUITE_ATENIR_CONDUITE_ATENIR:
				getACommeConduiteATenirConduiteATenir().clear();
				getACommeConduiteATenirConduiteATenir().addAll((Collection<? extends TypeConduiteATenir>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONSIGNE_PARTICULIERE_CONSIGNE_PARTICULIERE:
				setACommeConsigneParticuliereConsigneParticuliere((TypeConsigneParticuliere)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_DUREE_DINTERVENTION_DUREE_INTERVENTION:
				getAPourDureeDInterventionDureeIntervention().clear();
				getAPourDureeDInterventionDureeIntervention().addAll((Collection<? extends TypeDureeIntervention>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TACTIQUES_PRIORITE_TACTIQUE:
				getAPourPrioritesTactiquesPrioriteTactique().clear();
				getAPourPrioritesTactiquesPrioriteTactique().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TECHNIQUES_PRIORITE_TECHNIQUE:
				getAPourPrioritesTechniquesPrioriteTechnique().clear();
				getAPourPrioritesTechniquesPrioriteTechnique().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ALLOCATIONS_CONSENTIES:
				setAllocationsConsenties(ALLOCATIONS_CONSENTIES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__DOMMAGES_PREVISIONNELS:
				setDommagesPrevisionnels(DOMMAGES_PREVISIONNELS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ECHELON_UNITE_SOUTENUE:
				unsetEchelonUniteSoutenue();
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__FORCE_ASOUTENIR:
				setForceASoutenir(FORCE_ASOUTENIR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__MISSION_ULTERIEURE:
				setMissionUlterieure(MISSION_ULTERIEURE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__RESSOURCES_ATTENDUES:
				setRessourcesAttendues(RESSOURCES_ATTENDUES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__STABILITE_ESCOMPTEE:
				setStabiliteEscomptee((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_UNITE_METTANT_EN_OEUVRE_MATERIEL_UNITE_MATERIEL:
				getAPourUniteMettantEnOeuvreMaterielUniteMateriel().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_RATTACHEMENT_INTERNE_RATTACHEMENT:
				getAPourRattachementInterneRattachement().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONDUITE_ATENIR_CONDUITE_ATENIR:
				getACommeConduiteATenirConduiteATenir().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONSIGNE_PARTICULIERE_CONSIGNE_PARTICULIERE:
				setACommeConsigneParticuliereConsigneParticuliere((TypeConsigneParticuliere)null);
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_DUREE_DINTERVENTION_DUREE_INTERVENTION:
				getAPourDureeDInterventionDureeIntervention().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TACTIQUES_PRIORITE_TACTIQUE:
				getAPourPrioritesTactiquesPrioriteTactique().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TECHNIQUES_PRIORITE_TECHNIQUE:
				getAPourPrioritesTechniquesPrioriteTechnique().clear();
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
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ALLOCATIONS_CONSENTIES:
				return ALLOCATIONS_CONSENTIES_EDEFAULT == null ? allocationsConsenties != null : !ALLOCATIONS_CONSENTIES_EDEFAULT.equals(allocationsConsenties);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__DOMMAGES_PREVISIONNELS:
				return DOMMAGES_PREVISIONNELS_EDEFAULT == null ? dommagesPrevisionnels != null : !DOMMAGES_PREVISIONNELS_EDEFAULT.equals(dommagesPrevisionnels);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ECHELON_UNITE_SOUTENUE:
				return isSetEchelonUniteSoutenue();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__FORCE_ASOUTENIR:
				return FORCE_ASOUTENIR_EDEFAULT == null ? forceASoutenir != null : !FORCE_ASOUTENIR_EDEFAULT.equals(forceASoutenir);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__MISSION_ULTERIEURE:
				return MISSION_ULTERIEURE_EDEFAULT == null ? missionUlterieure != null : !MISSION_ULTERIEURE_EDEFAULT.equals(missionUlterieure);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__RESSOURCES_ATTENDUES:
				return RESSOURCES_ATTENDUES_EDEFAULT == null ? ressourcesAttendues != null : !RESSOURCES_ATTENDUES_EDEFAULT.equals(ressourcesAttendues);
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__STABILITE_ESCOMPTEE:
				return stabiliteEscomptee != null;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_UNITE_METTANT_EN_OEUVRE_MATERIEL_UNITE_MATERIEL:
				return aPourUniteMettantEnOeuvreMaterielUniteMateriel != null && !aPourUniteMettantEnOeuvreMaterielUniteMateriel.isEmpty();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_RATTACHEMENT_INTERNE_RATTACHEMENT:
				return aPourRattachementInterneRattachement != null && !aPourRattachementInterneRattachement.isEmpty();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONDUITE_ATENIR_CONDUITE_ATENIR:
				return aCommeConduiteATenirConduiteATenir != null && !aCommeConduiteATenirConduiteATenir.isEmpty();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__ACOMME_CONSIGNE_PARTICULIERE_CONSIGNE_PARTICULIERE:
				return aCommeConsigneParticuliereConsigneParticuliere != null;
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_DUREE_DINTERVENTION_DUREE_INTERVENTION:
				return aPourDureeDInterventionDureeIntervention != null && !aPourDureeDInterventionDureeIntervention.isEmpty();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TACTIQUES_PRIORITE_TACTIQUE:
				return aPourPrioritesTactiquesPrioriteTactique != null && !aPourPrioritesTactiquesPrioriteTactique.isEmpty();
			case SchemaPackage.TYPE_MISSION_MAINTENANCE__APOUR_PRIORITES_TECHNIQUES_PRIORITE_TECHNIQUE:
				return aPourPrioritesTechniquesPrioriteTechnique != null && !aPourPrioritesTechniquesPrioriteTechnique.isEmpty();
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
		result.append(" (allocationsConsenties: ");
		result.append(allocationsConsenties);
		result.append(", dommagesPrevisionnels: ");
		result.append(dommagesPrevisionnels);
		result.append(", echelonUniteSoutenue: ");
		if (echelonUniteSoutenueESet) result.append(echelonUniteSoutenue); else result.append("<unset>");
		result.append(", forceASoutenir: ");
		result.append(forceASoutenir);
		result.append(", missionUlterieure: ");
		result.append(missionUlterieure);
		result.append(", ressourcesAttendues: ");
		result.append(ressourcesAttendues);
		result.append(')');
		return result.toString();
	}

} //TypeMissionMaintenanceImpl
