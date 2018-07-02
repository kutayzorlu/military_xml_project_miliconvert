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

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCrReconnaissance;
import mpia.schema.TypeDictionaryDicoMissionGenieAideAuDeploiement;
import mpia.schema.TypeDictionaryDicoMissionGenieAppuiAContreMobilite;
import mpia.schema.TypeDictionaryDicoMissionGenieAppuiAMobilite;
import mpia.schema.TypeDictionaryDicoMissionGenieTypeMission;
import mpia.schema.TypeDictionaryDicoMissionGenieTypeMissionMajeure;
import mpia.schema.TypeInstructionCoordination;
import mpia.schema.TypeMissionAppuiMobilite;
import mpia.schema.TypeMissionGenie;
import mpia.schema.TypePlanMixte;

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
 * An implementation of the model object '<em><b>Type Mission Genie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getNumeroMission <em>Numero Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getPrioriteMission <em>Priorite Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#isDelegationPourApprobation <em>Delegation Pour Approbation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAideAuDeploiement <em>Aide Au Deploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAppuiAContreMobilite <em>Appui AContre Mobilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAppuiAMobilite <em>Appui AMobilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getTypeMissionMajeure <em>Type Mission Majeure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getVersionOrdre <em>Version Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getDateDerniereDescription <em>Date Derniere Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getRemiseCr <em>Remise Cr</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getRenforcementPourTravaux <em>Renforcement Pour Travaux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getTypeMission <em>Type Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getEstSujetAssociationMissionGenieMissionGenie <em>Est Sujet Association Mission Genie Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getEstObjetAssociationMissionGenieMissionGenie <em>Est Objet Association Mission Genie Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAPourZoneMissionAutreElementControle <em>APour Zone Mission Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAPourInstructionCoordinationInstructionCoordination <em>APour Instruction Coordination Instruction Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAPourPlanMixtePlanMixte <em>APour Plan Mixte Plan Mixte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAPourUniteResponsableSecuriteImmediateUnite <em>APour Unite Responsable Securite Immediate Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAPourCrReconnaissanceCrReconnaissance <em>APour Cr Reconnaissance Cr Reconnaissance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAPourUniteExecutanteUniteUnite <em>APour Unite Executante Unite Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getAPourComplementMissionAppuiMobilite <em>APour Complement Mission Appui Mobilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionGenieImpl#getEstObjetAssociationUniteMissionGenie <em>Est Objet Association Unite Mission Genie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionGenieImpl extends TypeMissionImpl implements TypeMissionGenie {
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
	 * The default value of the '{@link #getPrioriteMission() <em>Priorite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteMission()
	 * @generated
	 * @ordered
	 */
	protected static final long PRIORITE_MISSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPrioriteMission() <em>Priorite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteMission()
	 * @generated
	 * @ordered
	 */
	protected long prioriteMission = PRIORITE_MISSION_EDEFAULT;

	/**
	 * This is true if the Priorite Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteMissionESet;

	/**
	 * The default value of the '{@link #isDelegationPourApprobation() <em>Delegation Pour Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelegationPourApprobation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELEGATION_POUR_APPROBATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelegationPourApprobation() <em>Delegation Pour Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelegationPourApprobation()
	 * @generated
	 * @ordered
	 */
	protected boolean delegationPourApprobation = DELEGATION_POUR_APPROBATION_EDEFAULT;

	/**
	 * This is true if the Delegation Pour Approbation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delegationPourApprobationESet;

	/**
	 * The default value of the '{@link #getAideAuDeploiement() <em>Aide Au Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAideAuDeploiement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionGenieAideAuDeploiement AIDE_AU_DEPLOIEMENT_EDEFAULT = TypeDictionaryDicoMissionGenieAideAuDeploiement.HTD1;

	/**
	 * The cached value of the '{@link #getAideAuDeploiement() <em>Aide Au Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAideAuDeploiement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionGenieAideAuDeploiement aideAuDeploiement = AIDE_AU_DEPLOIEMENT_EDEFAULT;

	/**
	 * This is true if the Aide Au Deploiement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aideAuDeploiementESet;

	/**
	 * The default value of the '{@link #getAppuiAContreMobilite() <em>Appui AContre Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppuiAContreMobilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionGenieAppuiAContreMobilite APPUI_ACONTRE_MOBILITE_EDEFAULT = TypeDictionaryDicoMissionGenieAppuiAContreMobilite.STPMIN;

	/**
	 * The cached value of the '{@link #getAppuiAContreMobilite() <em>Appui AContre Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppuiAContreMobilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionGenieAppuiAContreMobilite appuiAContreMobilite = APPUI_ACONTRE_MOBILITE_EDEFAULT;

	/**
	 * This is true if the Appui AContre Mobilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appuiAContreMobiliteESet;

	/**
	 * The default value of the '{@link #getAppuiAMobilite() <em>Appui AMobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppuiAMobilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionGenieAppuiAMobilite APPUI_AMOBILITE_EDEFAULT = TypeDictionaryDicoMissionGenieAppuiAMobilite.OPEN;

	/**
	 * The cached value of the '{@link #getAppuiAMobilite() <em>Appui AMobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppuiAMobilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionGenieAppuiAMobilite appuiAMobilite = APPUI_AMOBILITE_EDEFAULT;

	/**
	 * This is true if the Appui AMobilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appuiAMobiliteESet;

	/**
	 * The default value of the '{@link #getTypeMissionMajeure() <em>Type Mission Majeure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionMajeure()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionGenieTypeMissionMajeure TYPE_MISSION_MAJEURE_EDEFAULT = TypeDictionaryDicoMissionGenieTypeMissionMajeure.CMOB;

	/**
	 * The cached value of the '{@link #getTypeMissionMajeure() <em>Type Mission Majeure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionMajeure()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionGenieTypeMissionMajeure typeMissionMajeure = TYPE_MISSION_MAJEURE_EDEFAULT;

	/**
	 * This is true if the Type Mission Majeure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionMajeureESet;

	/**
	 * The default value of the '{@link #getVersionOrdre() <em>Version Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionOrdre()
	 * @generated
	 * @ordered
	 */
	protected static final long VERSION_ORDRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVersionOrdre() <em>Version Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionOrdre()
	 * @generated
	 * @ordered
	 */
	protected long versionOrdre = VERSION_ORDRE_EDEFAULT;

	/**
	 * This is true if the Version Ordre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionOrdreESet;

	/**
	 * The default value of the '{@link #getDateDerniereDescription() <em>Date Derniere Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDerniereDescription()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DERNIERE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDerniereDescription() <em>Date Derniere Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDerniereDescription()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDerniereDescription = DATE_DERNIERE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemiseCr() <em>Remise Cr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemiseCr()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REMISE_CR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemiseCr() <em>Remise Cr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemiseCr()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar remiseCr = REMISE_CR_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected String complement = COMPLEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenforcementPourTravaux() <em>Renforcement Pour Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenforcementPourTravaux()
	 * @generated
	 * @ordered
	 */
	protected static final String RENFORCEMENT_POUR_TRAVAUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRenforcementPourTravaux() <em>Renforcement Pour Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenforcementPourTravaux()
	 * @generated
	 * @ordered
	 */
	protected String renforcementPourTravaux = RENFORCEMENT_POUR_TRAVAUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeMission() <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMission()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionGenieTypeMission TYPE_MISSION_EDEFAULT = TypeDictionaryDicoMissionGenieTypeMission.SPEC;

	/**
	 * The cached value of the '{@link #getTypeMission() <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMission()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionGenieTypeMission typeMission = TYPE_MISSION_EDEFAULT;

	/**
	 * This is true if the Type Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionESet;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMissionGenieMissionGenie() <em>Est Sujet Association Mission Genie Mission Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMissionGenieMissionGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMissionGenieMissionGenie;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMissionGenieMissionGenie() <em>Est Objet Association Mission Genie Mission Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMissionGenieMissionGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMissionGenieMissionGenie;

	/**
	 * The cached value of the '{@link #getAPourZoneMissionAutreElementControle() <em>APour Zone Mission Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneMissionAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneMissionAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourInstructionCoordinationInstructionCoordination() <em>APour Instruction Coordination Instruction Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourInstructionCoordinationInstructionCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeInstructionCoordination> aPourInstructionCoordinationInstructionCoordination;

	/**
	 * The cached value of the '{@link #getAPourPlanMixtePlanMixte() <em>APour Plan Mixte Plan Mixte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPlanMixtePlanMixte()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePlanMixte> aPourPlanMixtePlanMixte;

	/**
	 * The cached value of the '{@link #getAPourUniteResponsableSecuriteImmediateUnite() <em>APour Unite Responsable Securite Immediate Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteResponsableSecuriteImmediateUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourUniteResponsableSecuriteImmediateUnite;

	/**
	 * The cached value of the '{@link #getAPourCrReconnaissanceCrReconnaissance() <em>APour Cr Reconnaissance Cr Reconnaissance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCrReconnaissanceCrReconnaissance()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCrReconnaissance> aPourCrReconnaissanceCrReconnaissance;

	/**
	 * The cached value of the '{@link #getAPourUniteExecutanteUniteUnite() <em>APour Unite Executante Unite Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteExecutanteUniteUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteExecutanteUniteUnite;

	/**
	 * The cached value of the '{@link #getAPourComplementMissionAppuiMobilite() <em>APour Complement Mission Appui Mobilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourComplementMissionAppuiMobilite()
	 * @generated
	 * @ordered
	 */
	protected TypeMissionAppuiMobilite aPourComplementMissionAppuiMobilite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionGenie() <em>Est Objet Association Unite Mission Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionGenie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionGenieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionGenie();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__NUMERO_MISSION, oldNumeroMission, numeroMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPrioriteMission() {
		return prioriteMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioriteMission(long newPrioriteMission) {
		long oldPrioriteMission = prioriteMission;
		prioriteMission = newPrioriteMission;
		boolean oldPrioriteMissionESet = prioriteMissionESet;
		prioriteMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__PRIORITE_MISSION, oldPrioriteMission, prioriteMission, !oldPrioriteMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrioriteMission() {
		long oldPrioriteMission = prioriteMission;
		boolean oldPrioriteMissionESet = prioriteMissionESet;
		prioriteMission = PRIORITE_MISSION_EDEFAULT;
		prioriteMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_GENIE__PRIORITE_MISSION, oldPrioriteMission, PRIORITE_MISSION_EDEFAULT, oldPrioriteMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrioriteMission() {
		return prioriteMissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelegationPourApprobation() {
		return delegationPourApprobation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegationPourApprobation(boolean newDelegationPourApprobation) {
		boolean oldDelegationPourApprobation = delegationPourApprobation;
		delegationPourApprobation = newDelegationPourApprobation;
		boolean oldDelegationPourApprobationESet = delegationPourApprobationESet;
		delegationPourApprobationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__DELEGATION_POUR_APPROBATION, oldDelegationPourApprobation, delegationPourApprobation, !oldDelegationPourApprobationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelegationPourApprobation() {
		boolean oldDelegationPourApprobation = delegationPourApprobation;
		boolean oldDelegationPourApprobationESet = delegationPourApprobationESet;
		delegationPourApprobation = DELEGATION_POUR_APPROBATION_EDEFAULT;
		delegationPourApprobationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_GENIE__DELEGATION_POUR_APPROBATION, oldDelegationPourApprobation, DELEGATION_POUR_APPROBATION_EDEFAULT, oldDelegationPourApprobationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelegationPourApprobation() {
		return delegationPourApprobationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionGenieAideAuDeploiement getAideAuDeploiement() {
		return aideAuDeploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAideAuDeploiement(TypeDictionaryDicoMissionGenieAideAuDeploiement newAideAuDeploiement) {
		TypeDictionaryDicoMissionGenieAideAuDeploiement oldAideAuDeploiement = aideAuDeploiement;
		aideAuDeploiement = newAideAuDeploiement == null ? AIDE_AU_DEPLOIEMENT_EDEFAULT : newAideAuDeploiement;
		boolean oldAideAuDeploiementESet = aideAuDeploiementESet;
		aideAuDeploiementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__AIDE_AU_DEPLOIEMENT, oldAideAuDeploiement, aideAuDeploiement, !oldAideAuDeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAideAuDeploiement() {
		TypeDictionaryDicoMissionGenieAideAuDeploiement oldAideAuDeploiement = aideAuDeploiement;
		boolean oldAideAuDeploiementESet = aideAuDeploiementESet;
		aideAuDeploiement = AIDE_AU_DEPLOIEMENT_EDEFAULT;
		aideAuDeploiementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_GENIE__AIDE_AU_DEPLOIEMENT, oldAideAuDeploiement, AIDE_AU_DEPLOIEMENT_EDEFAULT, oldAideAuDeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAideAuDeploiement() {
		return aideAuDeploiementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionGenieAppuiAContreMobilite getAppuiAContreMobilite() {
		return appuiAContreMobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppuiAContreMobilite(TypeDictionaryDicoMissionGenieAppuiAContreMobilite newAppuiAContreMobilite) {
		TypeDictionaryDicoMissionGenieAppuiAContreMobilite oldAppuiAContreMobilite = appuiAContreMobilite;
		appuiAContreMobilite = newAppuiAContreMobilite == null ? APPUI_ACONTRE_MOBILITE_EDEFAULT : newAppuiAContreMobilite;
		boolean oldAppuiAContreMobiliteESet = appuiAContreMobiliteESet;
		appuiAContreMobiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__APPUI_ACONTRE_MOBILITE, oldAppuiAContreMobilite, appuiAContreMobilite, !oldAppuiAContreMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppuiAContreMobilite() {
		TypeDictionaryDicoMissionGenieAppuiAContreMobilite oldAppuiAContreMobilite = appuiAContreMobilite;
		boolean oldAppuiAContreMobiliteESet = appuiAContreMobiliteESet;
		appuiAContreMobilite = APPUI_ACONTRE_MOBILITE_EDEFAULT;
		appuiAContreMobiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_GENIE__APPUI_ACONTRE_MOBILITE, oldAppuiAContreMobilite, APPUI_ACONTRE_MOBILITE_EDEFAULT, oldAppuiAContreMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppuiAContreMobilite() {
		return appuiAContreMobiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionGenieAppuiAMobilite getAppuiAMobilite() {
		return appuiAMobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppuiAMobilite(TypeDictionaryDicoMissionGenieAppuiAMobilite newAppuiAMobilite) {
		TypeDictionaryDicoMissionGenieAppuiAMobilite oldAppuiAMobilite = appuiAMobilite;
		appuiAMobilite = newAppuiAMobilite == null ? APPUI_AMOBILITE_EDEFAULT : newAppuiAMobilite;
		boolean oldAppuiAMobiliteESet = appuiAMobiliteESet;
		appuiAMobiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__APPUI_AMOBILITE, oldAppuiAMobilite, appuiAMobilite, !oldAppuiAMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppuiAMobilite() {
		TypeDictionaryDicoMissionGenieAppuiAMobilite oldAppuiAMobilite = appuiAMobilite;
		boolean oldAppuiAMobiliteESet = appuiAMobiliteESet;
		appuiAMobilite = APPUI_AMOBILITE_EDEFAULT;
		appuiAMobiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_GENIE__APPUI_AMOBILITE, oldAppuiAMobilite, APPUI_AMOBILITE_EDEFAULT, oldAppuiAMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppuiAMobilite() {
		return appuiAMobiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionGenieTypeMissionMajeure getTypeMissionMajeure() {
		return typeMissionMajeure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionMajeure(TypeDictionaryDicoMissionGenieTypeMissionMajeure newTypeMissionMajeure) {
		TypeDictionaryDicoMissionGenieTypeMissionMajeure oldTypeMissionMajeure = typeMissionMajeure;
		typeMissionMajeure = newTypeMissionMajeure == null ? TYPE_MISSION_MAJEURE_EDEFAULT : newTypeMissionMajeure;
		boolean oldTypeMissionMajeureESet = typeMissionMajeureESet;
		typeMissionMajeureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION_MAJEURE, oldTypeMissionMajeure, typeMissionMajeure, !oldTypeMissionMajeureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMissionMajeure() {
		TypeDictionaryDicoMissionGenieTypeMissionMajeure oldTypeMissionMajeure = typeMissionMajeure;
		boolean oldTypeMissionMajeureESet = typeMissionMajeureESet;
		typeMissionMajeure = TYPE_MISSION_MAJEURE_EDEFAULT;
		typeMissionMajeureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION_MAJEURE, oldTypeMissionMajeure, TYPE_MISSION_MAJEURE_EDEFAULT, oldTypeMissionMajeureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMissionMajeure() {
		return typeMissionMajeureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVersionOrdre() {
		return versionOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionOrdre(long newVersionOrdre) {
		long oldVersionOrdre = versionOrdre;
		versionOrdre = newVersionOrdre;
		boolean oldVersionOrdreESet = versionOrdreESet;
		versionOrdreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__VERSION_ORDRE, oldVersionOrdre, versionOrdre, !oldVersionOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersionOrdre() {
		long oldVersionOrdre = versionOrdre;
		boolean oldVersionOrdreESet = versionOrdreESet;
		versionOrdre = VERSION_ORDRE_EDEFAULT;
		versionOrdreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_GENIE__VERSION_ORDRE, oldVersionOrdre, VERSION_ORDRE_EDEFAULT, oldVersionOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersionOrdre() {
		return versionOrdreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDerniereDescription() {
		return dateDerniereDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDerniereDescription(XMLGregorianCalendar newDateDerniereDescription) {
		XMLGregorianCalendar oldDateDerniereDescription = dateDerniereDescription;
		dateDerniereDescription = newDateDerniereDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__DATE_DERNIERE_DESCRIPTION, oldDateDerniereDescription, dateDerniereDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRemiseCr() {
		return remiseCr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemiseCr(XMLGregorianCalendar newRemiseCr) {
		XMLGregorianCalendar oldRemiseCr = remiseCr;
		remiseCr = newRemiseCr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__REMISE_CR, oldRemiseCr, remiseCr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplement(String newComplement) {
		String oldComplement = complement;
		complement = newComplement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__COMPLEMENT, oldComplement, complement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRenforcementPourTravaux() {
		return renforcementPourTravaux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenforcementPourTravaux(String newRenforcementPourTravaux) {
		String oldRenforcementPourTravaux = renforcementPourTravaux;
		renforcementPourTravaux = newRenforcementPourTravaux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__RENFORCEMENT_POUR_TRAVAUX, oldRenforcementPourTravaux, renforcementPourTravaux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionGenieTypeMission getTypeMission() {
		return typeMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMission(TypeDictionaryDicoMissionGenieTypeMission newTypeMission) {
		TypeDictionaryDicoMissionGenieTypeMission oldTypeMission = typeMission;
		typeMission = newTypeMission == null ? TYPE_MISSION_EDEFAULT : newTypeMission;
		boolean oldTypeMissionESet = typeMissionESet;
		typeMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION, oldTypeMission, typeMission, !oldTypeMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMission() {
		TypeDictionaryDicoMissionGenieTypeMission oldTypeMission = typeMission;
		boolean oldTypeMissionESet = typeMissionESet;
		typeMission = TYPE_MISSION_EDEFAULT;
		typeMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION, oldTypeMission, TYPE_MISSION_EDEFAULT, oldTypeMissionESet));
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
	public EList<TypeAssociation> getEstSujetAssociationMissionGenieMissionGenie() {
		if (estSujetAssociationMissionGenieMissionGenie == null) {
			estSujetAssociationMissionGenieMissionGenie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_GENIE__EST_SUJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE);
		}
		return estSujetAssociationMissionGenieMissionGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMissionGenieMissionGenie() {
		if (estObjetAssociationMissionGenieMissionGenie == null) {
			estObjetAssociationMissionGenieMissionGenie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE);
		}
		return estObjetAssociationMissionGenieMissionGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneMissionAutreElementControle() {
		return aPourZoneMissionAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneMissionAutreElementControle(TypeAssociation newAPourZoneMissionAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneMissionAutreElementControle = aPourZoneMissionAutreElementControle;
		aPourZoneMissionAutreElementControle = newAPourZoneMissionAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__APOUR_ZONE_MISSION_AUTRE_ELEMENT_CONTROLE, oldAPourZoneMissionAutreElementControle, newAPourZoneMissionAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneMissionAutreElementControle(TypeAssociation newAPourZoneMissionAutreElementControle) {
		if (newAPourZoneMissionAutreElementControle != aPourZoneMissionAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneMissionAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneMissionAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_GENIE__APOUR_ZONE_MISSION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneMissionAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneMissionAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_GENIE__APOUR_ZONE_MISSION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneMissionAutreElementControle(newAPourZoneMissionAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__APOUR_ZONE_MISSION_AUTRE_ELEMENT_CONTROLE, newAPourZoneMissionAutreElementControle, newAPourZoneMissionAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeInstructionCoordination> getAPourInstructionCoordinationInstructionCoordination() {
		if (aPourInstructionCoordinationInstructionCoordination == null) {
			aPourInstructionCoordinationInstructionCoordination = new EObjectContainmentEList<TypeInstructionCoordination>(TypeInstructionCoordination.class, this, SchemaPackage.TYPE_MISSION_GENIE__APOUR_INSTRUCTION_COORDINATION_INSTRUCTION_COORDINATION);
		}
		return aPourInstructionCoordinationInstructionCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlanMixte> getAPourPlanMixtePlanMixte() {
		if (aPourPlanMixtePlanMixte == null) {
			aPourPlanMixtePlanMixte = new EObjectContainmentEList<TypePlanMixte>(TypePlanMixte.class, this, SchemaPackage.TYPE_MISSION_GENIE__APOUR_PLAN_MIXTE_PLAN_MIXTE);
		}
		return aPourPlanMixtePlanMixte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourUniteResponsableSecuriteImmediateUnite() {
		return aPourUniteResponsableSecuriteImmediateUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteResponsableSecuriteImmediateUnite(TypeAssociation newAPourUniteResponsableSecuriteImmediateUnite, NotificationChain msgs) {
		TypeAssociation oldAPourUniteResponsableSecuriteImmediateUnite = aPourUniteResponsableSecuriteImmediateUnite;
		aPourUniteResponsableSecuriteImmediateUnite = newAPourUniteResponsableSecuriteImmediateUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_RESPONSABLE_SECURITE_IMMEDIATE_UNITE, oldAPourUniteResponsableSecuriteImmediateUnite, newAPourUniteResponsableSecuriteImmediateUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteResponsableSecuriteImmediateUnite(TypeAssociation newAPourUniteResponsableSecuriteImmediateUnite) {
		if (newAPourUniteResponsableSecuriteImmediateUnite != aPourUniteResponsableSecuriteImmediateUnite) {
			NotificationChain msgs = null;
			if (aPourUniteResponsableSecuriteImmediateUnite != null)
				msgs = ((InternalEObject)aPourUniteResponsableSecuriteImmediateUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_RESPONSABLE_SECURITE_IMMEDIATE_UNITE, null, msgs);
			if (newAPourUniteResponsableSecuriteImmediateUnite != null)
				msgs = ((InternalEObject)newAPourUniteResponsableSecuriteImmediateUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_RESPONSABLE_SECURITE_IMMEDIATE_UNITE, null, msgs);
			msgs = basicSetAPourUniteResponsableSecuriteImmediateUnite(newAPourUniteResponsableSecuriteImmediateUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_RESPONSABLE_SECURITE_IMMEDIATE_UNITE, newAPourUniteResponsableSecuriteImmediateUnite, newAPourUniteResponsableSecuriteImmediateUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCrReconnaissance> getAPourCrReconnaissanceCrReconnaissance() {
		if (aPourCrReconnaissanceCrReconnaissance == null) {
			aPourCrReconnaissanceCrReconnaissance = new EObjectContainmentEList<TypeCrReconnaissance>(TypeCrReconnaissance.class, this, SchemaPackage.TYPE_MISSION_GENIE__APOUR_CR_RECONNAISSANCE_CR_RECONNAISSANCE);
		}
		return aPourCrReconnaissanceCrReconnaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUniteUnite() {
		if (aPourUniteExecutanteUniteUnite == null) {
			aPourUniteExecutanteUniteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_EXECUTANTE_UNITE_UNITE);
		}
		return aPourUniteExecutanteUniteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissionAppuiMobilite getAPourComplementMissionAppuiMobilite() {
		return aPourComplementMissionAppuiMobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourComplementMissionAppuiMobilite(TypeMissionAppuiMobilite newAPourComplementMissionAppuiMobilite, NotificationChain msgs) {
		TypeMissionAppuiMobilite oldAPourComplementMissionAppuiMobilite = aPourComplementMissionAppuiMobilite;
		aPourComplementMissionAppuiMobilite = newAPourComplementMissionAppuiMobilite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__APOUR_COMPLEMENT_MISSION_APPUI_MOBILITE, oldAPourComplementMissionAppuiMobilite, newAPourComplementMissionAppuiMobilite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourComplementMissionAppuiMobilite(TypeMissionAppuiMobilite newAPourComplementMissionAppuiMobilite) {
		if (newAPourComplementMissionAppuiMobilite != aPourComplementMissionAppuiMobilite) {
			NotificationChain msgs = null;
			if (aPourComplementMissionAppuiMobilite != null)
				msgs = ((InternalEObject)aPourComplementMissionAppuiMobilite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_GENIE__APOUR_COMPLEMENT_MISSION_APPUI_MOBILITE, null, msgs);
			if (newAPourComplementMissionAppuiMobilite != null)
				msgs = ((InternalEObject)newAPourComplementMissionAppuiMobilite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_GENIE__APOUR_COMPLEMENT_MISSION_APPUI_MOBILITE, null, msgs);
			msgs = basicSetAPourComplementMissionAppuiMobilite(newAPourComplementMissionAppuiMobilite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_GENIE__APOUR_COMPLEMENT_MISSION_APPUI_MOBILITE, newAPourComplementMissionAppuiMobilite, newAPourComplementMissionAppuiMobilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionGenie() {
		if (estObjetAssociationUniteMissionGenie == null) {
			estObjetAssociationUniteMissionGenie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_UNITE_MISSION_GENIE);
		}
		return estObjetAssociationUniteMissionGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_GENIE__EST_SUJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				return ((InternalEList<?>)getEstSujetAssociationMissionGenieMissionGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				return ((InternalEList<?>)getEstObjetAssociationMissionGenieMissionGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_ZONE_MISSION_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneMissionAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_INSTRUCTION_COORDINATION_INSTRUCTION_COORDINATION:
				return ((InternalEList<?>)getAPourInstructionCoordinationInstructionCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_PLAN_MIXTE_PLAN_MIXTE:
				return ((InternalEList<?>)getAPourPlanMixtePlanMixte()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_RESPONSABLE_SECURITE_IMMEDIATE_UNITE:
				return basicSetAPourUniteResponsableSecuriteImmediateUnite(null, msgs);
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_CR_RECONNAISSANCE_CR_RECONNAISSANCE:
				return ((InternalEList<?>)getAPourCrReconnaissanceCrReconnaissance()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_EXECUTANTE_UNITE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUniteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_COMPLEMENT_MISSION_APPUI_MOBILITE:
				return basicSetAPourComplementMissionAppuiMobilite(null, msgs);
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_UNITE_MISSION_GENIE:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionGenie()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_GENIE__NUMERO_MISSION:
				return getNumeroMission();
			case SchemaPackage.TYPE_MISSION_GENIE__PRIORITE_MISSION:
				return new Long(getPrioriteMission());
			case SchemaPackage.TYPE_MISSION_GENIE__DELEGATION_POUR_APPROBATION:
				return isDelegationPourApprobation() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MISSION_GENIE__AIDE_AU_DEPLOIEMENT:
				return getAideAuDeploiement();
			case SchemaPackage.TYPE_MISSION_GENIE__APPUI_ACONTRE_MOBILITE:
				return getAppuiAContreMobilite();
			case SchemaPackage.TYPE_MISSION_GENIE__APPUI_AMOBILITE:
				return getAppuiAMobilite();
			case SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION_MAJEURE:
				return getTypeMissionMajeure();
			case SchemaPackage.TYPE_MISSION_GENIE__VERSION_ORDRE:
				return new Long(getVersionOrdre());
			case SchemaPackage.TYPE_MISSION_GENIE__DATE_DERNIERE_DESCRIPTION:
				return getDateDerniereDescription();
			case SchemaPackage.TYPE_MISSION_GENIE__REMISE_CR:
				return getRemiseCr();
			case SchemaPackage.TYPE_MISSION_GENIE__COMPLEMENT:
				return getComplement();
			case SchemaPackage.TYPE_MISSION_GENIE__RENFORCEMENT_POUR_TRAVAUX:
				return getRenforcementPourTravaux();
			case SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION:
				return getTypeMission();
			case SchemaPackage.TYPE_MISSION_GENIE__EST_SUJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				return getEstSujetAssociationMissionGenieMissionGenie();
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				return getEstObjetAssociationMissionGenieMissionGenie();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_ZONE_MISSION_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneMissionAutreElementControle();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_INSTRUCTION_COORDINATION_INSTRUCTION_COORDINATION:
				return getAPourInstructionCoordinationInstructionCoordination();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_PLAN_MIXTE_PLAN_MIXTE:
				return getAPourPlanMixtePlanMixte();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_RESPONSABLE_SECURITE_IMMEDIATE_UNITE:
				return getAPourUniteResponsableSecuriteImmediateUnite();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_CR_RECONNAISSANCE_CR_RECONNAISSANCE:
				return getAPourCrReconnaissanceCrReconnaissance();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_EXECUTANTE_UNITE_UNITE:
				return getAPourUniteExecutanteUniteUnite();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_COMPLEMENT_MISSION_APPUI_MOBILITE:
				return getAPourComplementMissionAppuiMobilite();
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_UNITE_MISSION_GENIE:
				return getEstObjetAssociationUniteMissionGenie();
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
			case SchemaPackage.TYPE_MISSION_GENIE__NUMERO_MISSION:
				setNumeroMission((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__PRIORITE_MISSION:
				setPrioriteMission(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__DELEGATION_POUR_APPROBATION:
				setDelegationPourApprobation(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__AIDE_AU_DEPLOIEMENT:
				setAideAuDeploiement((TypeDictionaryDicoMissionGenieAideAuDeploiement)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APPUI_ACONTRE_MOBILITE:
				setAppuiAContreMobilite((TypeDictionaryDicoMissionGenieAppuiAContreMobilite)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APPUI_AMOBILITE:
				setAppuiAMobilite((TypeDictionaryDicoMissionGenieAppuiAMobilite)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION_MAJEURE:
				setTypeMissionMajeure((TypeDictionaryDicoMissionGenieTypeMissionMajeure)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__VERSION_ORDRE:
				setVersionOrdre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__DATE_DERNIERE_DESCRIPTION:
				setDateDerniereDescription((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__REMISE_CR:
				setRemiseCr((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__COMPLEMENT:
				setComplement((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__RENFORCEMENT_POUR_TRAVAUX:
				setRenforcementPourTravaux((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION:
				setTypeMission((TypeDictionaryDicoMissionGenieTypeMission)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__EST_SUJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				getEstSujetAssociationMissionGenieMissionGenie().clear();
				getEstSujetAssociationMissionGenieMissionGenie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				getEstObjetAssociationMissionGenieMissionGenie().clear();
				getEstObjetAssociationMissionGenieMissionGenie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_ZONE_MISSION_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneMissionAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_INSTRUCTION_COORDINATION_INSTRUCTION_COORDINATION:
				getAPourInstructionCoordinationInstructionCoordination().clear();
				getAPourInstructionCoordinationInstructionCoordination().addAll((Collection<? extends TypeInstructionCoordination>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_PLAN_MIXTE_PLAN_MIXTE:
				getAPourPlanMixtePlanMixte().clear();
				getAPourPlanMixtePlanMixte().addAll((Collection<? extends TypePlanMixte>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_RESPONSABLE_SECURITE_IMMEDIATE_UNITE:
				setAPourUniteResponsableSecuriteImmediateUnite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_CR_RECONNAISSANCE_CR_RECONNAISSANCE:
				getAPourCrReconnaissanceCrReconnaissance().clear();
				getAPourCrReconnaissanceCrReconnaissance().addAll((Collection<? extends TypeCrReconnaissance>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_EXECUTANTE_UNITE_UNITE:
				getAPourUniteExecutanteUniteUnite().clear();
				getAPourUniteExecutanteUniteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_COMPLEMENT_MISSION_APPUI_MOBILITE:
				setAPourComplementMissionAppuiMobilite((TypeMissionAppuiMobilite)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_UNITE_MISSION_GENIE:
				getEstObjetAssociationUniteMissionGenie().clear();
				getEstObjetAssociationUniteMissionGenie().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION_GENIE__NUMERO_MISSION:
				setNumeroMission(NUMERO_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__PRIORITE_MISSION:
				unsetPrioriteMission();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__DELEGATION_POUR_APPROBATION:
				unsetDelegationPourApprobation();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__AIDE_AU_DEPLOIEMENT:
				unsetAideAuDeploiement();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APPUI_ACONTRE_MOBILITE:
				unsetAppuiAContreMobilite();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APPUI_AMOBILITE:
				unsetAppuiAMobilite();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION_MAJEURE:
				unsetTypeMissionMajeure();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__VERSION_ORDRE:
				unsetVersionOrdre();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__DATE_DERNIERE_DESCRIPTION:
				setDateDerniereDescription(DATE_DERNIERE_DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__REMISE_CR:
				setRemiseCr(REMISE_CR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__COMPLEMENT:
				setComplement(COMPLEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__RENFORCEMENT_POUR_TRAVAUX:
				setRenforcementPourTravaux(RENFORCEMENT_POUR_TRAVAUX_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION:
				unsetTypeMission();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__EST_SUJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				getEstSujetAssociationMissionGenieMissionGenie().clear();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				getEstObjetAssociationMissionGenieMissionGenie().clear();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_ZONE_MISSION_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneMissionAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_INSTRUCTION_COORDINATION_INSTRUCTION_COORDINATION:
				getAPourInstructionCoordinationInstructionCoordination().clear();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_PLAN_MIXTE_PLAN_MIXTE:
				getAPourPlanMixtePlanMixte().clear();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_RESPONSABLE_SECURITE_IMMEDIATE_UNITE:
				setAPourUniteResponsableSecuriteImmediateUnite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_CR_RECONNAISSANCE_CR_RECONNAISSANCE:
				getAPourCrReconnaissanceCrReconnaissance().clear();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_EXECUTANTE_UNITE_UNITE:
				getAPourUniteExecutanteUniteUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_COMPLEMENT_MISSION_APPUI_MOBILITE:
				setAPourComplementMissionAppuiMobilite((TypeMissionAppuiMobilite)null);
				return;
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_UNITE_MISSION_GENIE:
				getEstObjetAssociationUniteMissionGenie().clear();
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
			case SchemaPackage.TYPE_MISSION_GENIE__NUMERO_MISSION:
				return NUMERO_MISSION_EDEFAULT == null ? numeroMission != null : !NUMERO_MISSION_EDEFAULT.equals(numeroMission);
			case SchemaPackage.TYPE_MISSION_GENIE__PRIORITE_MISSION:
				return isSetPrioriteMission();
			case SchemaPackage.TYPE_MISSION_GENIE__DELEGATION_POUR_APPROBATION:
				return isSetDelegationPourApprobation();
			case SchemaPackage.TYPE_MISSION_GENIE__AIDE_AU_DEPLOIEMENT:
				return isSetAideAuDeploiement();
			case SchemaPackage.TYPE_MISSION_GENIE__APPUI_ACONTRE_MOBILITE:
				return isSetAppuiAContreMobilite();
			case SchemaPackage.TYPE_MISSION_GENIE__APPUI_AMOBILITE:
				return isSetAppuiAMobilite();
			case SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION_MAJEURE:
				return isSetTypeMissionMajeure();
			case SchemaPackage.TYPE_MISSION_GENIE__VERSION_ORDRE:
				return isSetVersionOrdre();
			case SchemaPackage.TYPE_MISSION_GENIE__DATE_DERNIERE_DESCRIPTION:
				return DATE_DERNIERE_DESCRIPTION_EDEFAULT == null ? dateDerniereDescription != null : !DATE_DERNIERE_DESCRIPTION_EDEFAULT.equals(dateDerniereDescription);
			case SchemaPackage.TYPE_MISSION_GENIE__REMISE_CR:
				return REMISE_CR_EDEFAULT == null ? remiseCr != null : !REMISE_CR_EDEFAULT.equals(remiseCr);
			case SchemaPackage.TYPE_MISSION_GENIE__COMPLEMENT:
				return COMPLEMENT_EDEFAULT == null ? complement != null : !COMPLEMENT_EDEFAULT.equals(complement);
			case SchemaPackage.TYPE_MISSION_GENIE__RENFORCEMENT_POUR_TRAVAUX:
				return RENFORCEMENT_POUR_TRAVAUX_EDEFAULT == null ? renforcementPourTravaux != null : !RENFORCEMENT_POUR_TRAVAUX_EDEFAULT.equals(renforcementPourTravaux);
			case SchemaPackage.TYPE_MISSION_GENIE__TYPE_MISSION:
				return isSetTypeMission();
			case SchemaPackage.TYPE_MISSION_GENIE__EST_SUJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				return estSujetAssociationMissionGenieMissionGenie != null && !estSujetAssociationMissionGenieMissionGenie.isEmpty();
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_MISSION_GENIE_MISSION_GENIE:
				return estObjetAssociationMissionGenieMissionGenie != null && !estObjetAssociationMissionGenieMissionGenie.isEmpty();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_ZONE_MISSION_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneMissionAutreElementControle != null;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_INSTRUCTION_COORDINATION_INSTRUCTION_COORDINATION:
				return aPourInstructionCoordinationInstructionCoordination != null && !aPourInstructionCoordinationInstructionCoordination.isEmpty();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_PLAN_MIXTE_PLAN_MIXTE:
				return aPourPlanMixtePlanMixte != null && !aPourPlanMixtePlanMixte.isEmpty();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_RESPONSABLE_SECURITE_IMMEDIATE_UNITE:
				return aPourUniteResponsableSecuriteImmediateUnite != null;
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_CR_RECONNAISSANCE_CR_RECONNAISSANCE:
				return aPourCrReconnaissanceCrReconnaissance != null && !aPourCrReconnaissanceCrReconnaissance.isEmpty();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_UNITE_EXECUTANTE_UNITE_UNITE:
				return aPourUniteExecutanteUniteUnite != null && !aPourUniteExecutanteUniteUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_GENIE__APOUR_COMPLEMENT_MISSION_APPUI_MOBILITE:
				return aPourComplementMissionAppuiMobilite != null;
			case SchemaPackage.TYPE_MISSION_GENIE__EST_OBJET_ASSOCIATION_UNITE_MISSION_GENIE:
				return estObjetAssociationUniteMissionGenie != null && !estObjetAssociationUniteMissionGenie.isEmpty();
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
		result.append(", prioriteMission: ");
		if (prioriteMissionESet) result.append(prioriteMission); else result.append("<unset>");
		result.append(", delegationPourApprobation: ");
		if (delegationPourApprobationESet) result.append(delegationPourApprobation); else result.append("<unset>");
		result.append(", aideAuDeploiement: ");
		if (aideAuDeploiementESet) result.append(aideAuDeploiement); else result.append("<unset>");
		result.append(", appuiAContreMobilite: ");
		if (appuiAContreMobiliteESet) result.append(appuiAContreMobilite); else result.append("<unset>");
		result.append(", appuiAMobilite: ");
		if (appuiAMobiliteESet) result.append(appuiAMobilite); else result.append("<unset>");
		result.append(", typeMissionMajeure: ");
		if (typeMissionMajeureESet) result.append(typeMissionMajeure); else result.append("<unset>");
		result.append(", versionOrdre: ");
		if (versionOrdreESet) result.append(versionOrdre); else result.append("<unset>");
		result.append(", dateDerniereDescription: ");
		result.append(dateDerniereDescription);
		result.append(", remiseCr: ");
		result.append(remiseCr);
		result.append(", complement: ");
		result.append(complement);
		result.append(", renforcementPourTravaux: ");
		result.append(renforcementPourTravaux);
		result.append(", typeMission: ");
		if (typeMissionESet) result.append(typeMission); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMissionGenieImpl
