/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMissionAcquisitionASSPriorite;
import mpia.schema.TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition;
import mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS;
import mpia.schema.TypeMissionAcquisitionASS;
import mpia.schema.TypeMissionCOBRA;
import mpia.schema.TypeTypeObjectifASS;

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
 * An implementation of the model object '<em><b>Type Mission Acquisition ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getTypeMissionAcquisition <em>Type Mission Acquisition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getNomResponsableCoordination <em>Nom Responsable Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getFonctionResponsableCoordination <em>Fonction Responsable Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getNomResponsableRattachement <em>Nom Responsable Rattachement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getModaliteMiseEnPlace <em>Modalite Mise En Place</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getModalitesParticulieresTirs <em>Modalites Particulieres Tirs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getFonctionResponsableRattachement <em>Fonction Responsable Rattachement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getAPourZoneObservationAutreElementControle <em>APour Zone Observation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getAPourCaracteristiquesMissionCOBRAMissionCOBRA <em>APour Caracteristiques Mission COBRA Mission COBRA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getSInteresseATypeObjectifASS <em>SInteresse AType Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getAPourFonctionResponsableCoordinationTypePosteMilitaire <em>APour Fonction Responsable Coordination Type Poste Militaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getAPourFonctionResponsableRattachementTypePosteMilitaire <em>APour Fonction Responsable Rattachement Type Poste Militaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getAPourUniteExecutanteTirUnite <em>APour Unite Executante Tir Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getEstObjetAssociationUniteMissionAcqASS <em>Est Objet Association Unite Mission Acq ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAcquisitionASSImpl#getAPourTypesObjectifsType <em>APour Types Objectifs Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionAcquisitionASSImpl extends TypeMissionImpl implements TypeMissionAcquisitionASS {
	/**
	 * The default value of the '{@link #getTypeMissionAcquisition() <em>Type Mission Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionAcquisition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition TYPE_MISSION_ACQUISITION_EDEFAULT = TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition.SURV2D;

	/**
	 * The cached value of the '{@link #getTypeMissionAcquisition() <em>Type Mission Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionAcquisition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition typeMissionAcquisition = TYPE_MISSION_ACQUISITION_EDEFAULT;

	/**
	 * This is true if the Type Mission Acquisition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionAcquisitionESet;

	/**
	 * The default value of the '{@link #getTypeMoyenAcquisition() <em>Type Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenAcquisition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMoyenAcquisitionASS TYPE_MOYEN_ACQUISITION_EDEFAULT = TypeDictionaryDicoTypeMoyenAcquisitionASS.FIST;

	/**
	 * The cached value of the '{@link #getTypeMoyenAcquisition() <em>Type Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenAcquisition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMoyenAcquisitionASS typeMoyenAcquisition = TYPE_MOYEN_ACQUISITION_EDEFAULT;

	/**
	 * This is true if the Type Moyen Acquisition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMoyenAcquisitionESet;

	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAcquisitionASSPriorite PRIORITE_EDEFAULT = TypeDictionaryDicoMissionAcquisitionASSPriorite._1;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAcquisitionASSPriorite priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

	/**
	 * The default value of the '{@link #getNomResponsableCoordination() <em>Nom Responsable Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomResponsableCoordination()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_RESPONSABLE_COORDINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomResponsableCoordination() <em>Nom Responsable Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomResponsableCoordination()
	 * @generated
	 * @ordered
	 */
	protected String nomResponsableCoordination = NOM_RESPONSABLE_COORDINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFonctionResponsableCoordination() <em>Fonction Responsable Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionResponsableCoordination()
	 * @generated
	 * @ordered
	 */
	protected static final String FONCTION_RESPONSABLE_COORDINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFonctionResponsableCoordination() <em>Fonction Responsable Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionResponsableCoordination()
	 * @generated
	 * @ordered
	 */
	protected String fonctionResponsableCoordination = FONCTION_RESPONSABLE_COORDINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomResponsableRattachement() <em>Nom Responsable Rattachement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomResponsableRattachement()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_RESPONSABLE_RATTACHEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomResponsableRattachement() <em>Nom Responsable Rattachement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomResponsableRattachement()
	 * @generated
	 * @ordered
	 */
	protected String nomResponsableRattachement = NOM_RESPONSABLE_RATTACHEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getModaliteMiseEnPlace() <em>Modalite Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteMiseEnPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITE_MISE_EN_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModaliteMiseEnPlace() <em>Modalite Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteMiseEnPlace()
	 * @generated
	 * @ordered
	 */
	protected String modaliteMiseEnPlace = MODALITE_MISE_EN_PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModalitesParticulieresTirs() <em>Modalites Particulieres Tirs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresTirs()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITES_PARTICULIERES_TIRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModalitesParticulieresTirs() <em>Modalites Particulieres Tirs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresTirs()
	 * @generated
	 * @ordered
	 */
	protected String modalitesParticulieresTirs = MODALITES_PARTICULIERES_TIRS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFonctionResponsableRattachement() <em>Fonction Responsable Rattachement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionResponsableRattachement()
	 * @generated
	 * @ordered
	 */
	protected static final String FONCTION_RESPONSABLE_RATTACHEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFonctionResponsableRattachement() <em>Fonction Responsable Rattachement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionResponsableRattachement()
	 * @generated
	 * @ordered
	 */
	protected String fonctionResponsableRattachement = FONCTION_RESPONSABLE_RATTACHEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourZoneObservationAutreElementControle() <em>APour Zone Observation Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneObservationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneObservationAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesMissionCOBRAMissionCOBRA() <em>APour Caracteristiques Mission COBRA Mission COBRA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesMissionCOBRAMissionCOBRA()
	 * @generated
	 * @ordered
	 */
	protected TypeMissionCOBRA aPourCaracteristiquesMissionCOBRAMissionCOBRA;

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
	 * The cached value of the '{@link #getAPourFonctionResponsableCoordinationTypePosteMilitaire() <em>APour Fonction Responsable Coordination Type Poste Militaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFonctionResponsableCoordinationTypePosteMilitaire()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourFonctionResponsableCoordinationTypePosteMilitaire;

	/**
	 * The cached value of the '{@link #getAPourFonctionResponsableRattachementTypePosteMilitaire() <em>APour Fonction Responsable Rattachement Type Poste Militaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFonctionResponsableRattachementTypePosteMilitaire()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourFonctionResponsableRattachementTypePosteMilitaire;

	/**
	 * The cached value of the '{@link #getAPourUniteExecutanteTirUnite() <em>APour Unite Executante Tir Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteExecutanteTirUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteExecutanteTirUnite;

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
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionAcqASS() <em>Est Objet Association Unite Mission Acq ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionAcqASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionAcqASS;

	/**
	 * The cached value of the '{@link #getAPourTypesObjectifsType() <em>APour Types Objectifs Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypesObjectifsType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourTypesObjectifsType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionAcquisitionASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionAcquisitionASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition getTypeMissionAcquisition() {
		return typeMissionAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionAcquisition(TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition newTypeMissionAcquisition) {
		TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition oldTypeMissionAcquisition = typeMissionAcquisition;
		typeMissionAcquisition = newTypeMissionAcquisition == null ? TYPE_MISSION_ACQUISITION_EDEFAULT : newTypeMissionAcquisition;
		boolean oldTypeMissionAcquisitionESet = typeMissionAcquisitionESet;
		typeMissionAcquisitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MISSION_ACQUISITION, oldTypeMissionAcquisition, typeMissionAcquisition, !oldTypeMissionAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMissionAcquisition() {
		TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition oldTypeMissionAcquisition = typeMissionAcquisition;
		boolean oldTypeMissionAcquisitionESet = typeMissionAcquisitionESet;
		typeMissionAcquisition = TYPE_MISSION_ACQUISITION_EDEFAULT;
		typeMissionAcquisitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MISSION_ACQUISITION, oldTypeMissionAcquisition, TYPE_MISSION_ACQUISITION_EDEFAULT, oldTypeMissionAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMissionAcquisition() {
		return typeMissionAcquisitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMoyenAcquisitionASS getTypeMoyenAcquisition() {
		return typeMoyenAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS newTypeMoyenAcquisition) {
		TypeDictionaryDicoTypeMoyenAcquisitionASS oldTypeMoyenAcquisition = typeMoyenAcquisition;
		typeMoyenAcquisition = newTypeMoyenAcquisition == null ? TYPE_MOYEN_ACQUISITION_EDEFAULT : newTypeMoyenAcquisition;
		boolean oldTypeMoyenAcquisitionESet = typeMoyenAcquisitionESet;
		typeMoyenAcquisitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MOYEN_ACQUISITION, oldTypeMoyenAcquisition, typeMoyenAcquisition, !oldTypeMoyenAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMoyenAcquisition() {
		TypeDictionaryDicoTypeMoyenAcquisitionASS oldTypeMoyenAcquisition = typeMoyenAcquisition;
		boolean oldTypeMoyenAcquisitionESet = typeMoyenAcquisitionESet;
		typeMoyenAcquisition = TYPE_MOYEN_ACQUISITION_EDEFAULT;
		typeMoyenAcquisitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MOYEN_ACQUISITION, oldTypeMoyenAcquisition, TYPE_MOYEN_ACQUISITION_EDEFAULT, oldTypeMoyenAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMoyenAcquisition() {
		return typeMoyenAcquisitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAcquisitionASSPriorite getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoMissionAcquisitionASSPriorite newPriorite) {
		TypeDictionaryDicoMissionAcquisitionASSPriorite oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoMissionAcquisitionASSPriorite oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriorite() {
		return prioriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomResponsableCoordination() {
		return nomResponsableCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomResponsableCoordination(String newNomResponsableCoordination) {
		String oldNomResponsableCoordination = nomResponsableCoordination;
		nomResponsableCoordination = newNomResponsableCoordination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_COORDINATION, oldNomResponsableCoordination, nomResponsableCoordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFonctionResponsableCoordination() {
		return fonctionResponsableCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionResponsableCoordination(String newFonctionResponsableCoordination) {
		String oldFonctionResponsableCoordination = fonctionResponsableCoordination;
		fonctionResponsableCoordination = newFonctionResponsableCoordination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_COORDINATION, oldFonctionResponsableCoordination, fonctionResponsableCoordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomResponsableRattachement() {
		return nomResponsableRattachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomResponsableRattachement(String newNomResponsableRattachement) {
		String oldNomResponsableRattachement = nomResponsableRattachement;
		nomResponsableRattachement = newNomResponsableRattachement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_RATTACHEMENT, oldNomResponsableRattachement, nomResponsableRattachement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModaliteMiseEnPlace() {
		return modaliteMiseEnPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModaliteMiseEnPlace(String newModaliteMiseEnPlace) {
		String oldModaliteMiseEnPlace = modaliteMiseEnPlace;
		modaliteMiseEnPlace = newModaliteMiseEnPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITE_MISE_EN_PLACE, oldModaliteMiseEnPlace, modaliteMiseEnPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModalitesParticulieresTirs() {
		return modalitesParticulieresTirs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalitesParticulieresTirs(String newModalitesParticulieresTirs) {
		String oldModalitesParticulieresTirs = modalitesParticulieresTirs;
		modalitesParticulieresTirs = newModalitesParticulieresTirs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITES_PARTICULIERES_TIRS, oldModalitesParticulieresTirs, modalitesParticulieresTirs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFonctionResponsableRattachement() {
		return fonctionResponsableRattachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionResponsableRattachement(String newFonctionResponsableRattachement) {
		String oldFonctionResponsableRattachement = fonctionResponsableRattachement;
		fonctionResponsableRattachement = newFonctionResponsableRattachement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_RATTACHEMENT, oldFonctionResponsableRattachement, fonctionResponsableRattachement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneObservationAutreElementControle() {
		if (aPourZoneObservationAutreElementControle == null) {
			aPourZoneObservationAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_ZONE_OBSERVATION_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneObservationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissionCOBRA getAPourCaracteristiquesMissionCOBRAMissionCOBRA() {
		return aPourCaracteristiquesMissionCOBRAMissionCOBRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesMissionCOBRAMissionCOBRA(TypeMissionCOBRA newAPourCaracteristiquesMissionCOBRAMissionCOBRA, NotificationChain msgs) {
		TypeMissionCOBRA oldAPourCaracteristiquesMissionCOBRAMissionCOBRA = aPourCaracteristiquesMissionCOBRAMissionCOBRA;
		aPourCaracteristiquesMissionCOBRAMissionCOBRA = newAPourCaracteristiquesMissionCOBRAMissionCOBRA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_CARACTERISTIQUES_MISSION_COBRA_MISSION_COBRA, oldAPourCaracteristiquesMissionCOBRAMissionCOBRA, newAPourCaracteristiquesMissionCOBRAMissionCOBRA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesMissionCOBRAMissionCOBRA(TypeMissionCOBRA newAPourCaracteristiquesMissionCOBRAMissionCOBRA) {
		if (newAPourCaracteristiquesMissionCOBRAMissionCOBRA != aPourCaracteristiquesMissionCOBRAMissionCOBRA) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesMissionCOBRAMissionCOBRA != null)
				msgs = ((InternalEObject)aPourCaracteristiquesMissionCOBRAMissionCOBRA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_CARACTERISTIQUES_MISSION_COBRA_MISSION_COBRA, null, msgs);
			if (newAPourCaracteristiquesMissionCOBRAMissionCOBRA != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesMissionCOBRAMissionCOBRA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_CARACTERISTIQUES_MISSION_COBRA_MISSION_COBRA, null, msgs);
			msgs = basicSetAPourCaracteristiquesMissionCOBRAMissionCOBRA(newAPourCaracteristiquesMissionCOBRAMissionCOBRA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_CARACTERISTIQUES_MISSION_COBRA_MISSION_COBRA, newAPourCaracteristiquesMissionCOBRAMissionCOBRA, newAPourCaracteristiquesMissionCOBRAMissionCOBRA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeObjectifASS> getSInteresseATypeObjectifASS() {
		if (sInteresseATypeObjectifASS == null) {
			sInteresseATypeObjectifASS = new EObjectContainmentEList<TypeTypeObjectifASS>(TypeTypeObjectifASS.class, this, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__SINTERESSE_ATYPE_OBJECTIF_ASS);
		}
		return sInteresseATypeObjectifASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourFonctionResponsableCoordinationTypePosteMilitaire() {
		return aPourFonctionResponsableCoordinationTypePosteMilitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFonctionResponsableCoordinationTypePosteMilitaire(TypeAssociationEXT newAPourFonctionResponsableCoordinationTypePosteMilitaire, NotificationChain msgs) {
		TypeAssociationEXT oldAPourFonctionResponsableCoordinationTypePosteMilitaire = aPourFonctionResponsableCoordinationTypePosteMilitaire;
		aPourFonctionResponsableCoordinationTypePosteMilitaire = newAPourFonctionResponsableCoordinationTypePosteMilitaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_COORDINATION_TYPE_POSTE_MILITAIRE, oldAPourFonctionResponsableCoordinationTypePosteMilitaire, newAPourFonctionResponsableCoordinationTypePosteMilitaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFonctionResponsableCoordinationTypePosteMilitaire(TypeAssociationEXT newAPourFonctionResponsableCoordinationTypePosteMilitaire) {
		if (newAPourFonctionResponsableCoordinationTypePosteMilitaire != aPourFonctionResponsableCoordinationTypePosteMilitaire) {
			NotificationChain msgs = null;
			if (aPourFonctionResponsableCoordinationTypePosteMilitaire != null)
				msgs = ((InternalEObject)aPourFonctionResponsableCoordinationTypePosteMilitaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_COORDINATION_TYPE_POSTE_MILITAIRE, null, msgs);
			if (newAPourFonctionResponsableCoordinationTypePosteMilitaire != null)
				msgs = ((InternalEObject)newAPourFonctionResponsableCoordinationTypePosteMilitaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_COORDINATION_TYPE_POSTE_MILITAIRE, null, msgs);
			msgs = basicSetAPourFonctionResponsableCoordinationTypePosteMilitaire(newAPourFonctionResponsableCoordinationTypePosteMilitaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_COORDINATION_TYPE_POSTE_MILITAIRE, newAPourFonctionResponsableCoordinationTypePosteMilitaire, newAPourFonctionResponsableCoordinationTypePosteMilitaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourFonctionResponsableRattachementTypePosteMilitaire() {
		return aPourFonctionResponsableRattachementTypePosteMilitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFonctionResponsableRattachementTypePosteMilitaire(TypeAssociationEXT newAPourFonctionResponsableRattachementTypePosteMilitaire, NotificationChain msgs) {
		TypeAssociationEXT oldAPourFonctionResponsableRattachementTypePosteMilitaire = aPourFonctionResponsableRattachementTypePosteMilitaire;
		aPourFonctionResponsableRattachementTypePosteMilitaire = newAPourFonctionResponsableRattachementTypePosteMilitaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_RATTACHEMENT_TYPE_POSTE_MILITAIRE, oldAPourFonctionResponsableRattachementTypePosteMilitaire, newAPourFonctionResponsableRattachementTypePosteMilitaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFonctionResponsableRattachementTypePosteMilitaire(TypeAssociationEXT newAPourFonctionResponsableRattachementTypePosteMilitaire) {
		if (newAPourFonctionResponsableRattachementTypePosteMilitaire != aPourFonctionResponsableRattachementTypePosteMilitaire) {
			NotificationChain msgs = null;
			if (aPourFonctionResponsableRattachementTypePosteMilitaire != null)
				msgs = ((InternalEObject)aPourFonctionResponsableRattachementTypePosteMilitaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_RATTACHEMENT_TYPE_POSTE_MILITAIRE, null, msgs);
			if (newAPourFonctionResponsableRattachementTypePosteMilitaire != null)
				msgs = ((InternalEObject)newAPourFonctionResponsableRattachementTypePosteMilitaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_RATTACHEMENT_TYPE_POSTE_MILITAIRE, null, msgs);
			msgs = basicSetAPourFonctionResponsableRattachementTypePosteMilitaire(newAPourFonctionResponsableRattachementTypePosteMilitaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_RATTACHEMENT_TYPE_POSTE_MILITAIRE, newAPourFonctionResponsableRattachementTypePosteMilitaire, newAPourFonctionResponsableRattachementTypePosteMilitaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteTirUnite() {
		if (aPourUniteExecutanteTirUnite == null) {
			aPourUniteExecutanteTirUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_TIR_UNITE);
		}
		return aPourUniteExecutanteTirUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUnite() {
		if (aPourUniteExecutanteUnite == null) {
			aPourUniteExecutanteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_UNITE);
		}
		return aPourUniteExecutanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionAcqASS() {
		if (estObjetAssociationUniteMissionAcqASS == null) {
			estObjetAssociationUniteMissionAcqASS = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__EST_OBJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS);
		}
		return estObjetAssociationUniteMissionAcqASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourTypesObjectifsType() {
		if (aPourTypesObjectifsType == null) {
			aPourTypesObjectifsType = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_TYPES_OBJECTIFS_TYPE);
		}
		return aPourTypesObjectifsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_ZONE_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneObservationAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_CARACTERISTIQUES_MISSION_COBRA_MISSION_COBRA:
				return basicSetAPourCaracteristiquesMissionCOBRAMissionCOBRA(null, msgs);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__SINTERESSE_ATYPE_OBJECTIF_ASS:
				return ((InternalEList<?>)getSInteresseATypeObjectifASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_COORDINATION_TYPE_POSTE_MILITAIRE:
				return basicSetAPourFonctionResponsableCoordinationTypePosteMilitaire(null, msgs);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_RATTACHEMENT_TYPE_POSTE_MILITAIRE:
				return basicSetAPourFonctionResponsableRattachementTypePosteMilitaire(null, msgs);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_TIR_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteTirUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__EST_OBJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionAcqASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_TYPES_OBJECTIFS_TYPE:
				return ((InternalEList<?>)getAPourTypesObjectifsType()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MISSION_ACQUISITION:
				return getTypeMissionAcquisition();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MOYEN_ACQUISITION:
				return getTypeMoyenAcquisition();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_COORDINATION:
				return getNomResponsableCoordination();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_COORDINATION:
				return getFonctionResponsableCoordination();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_RATTACHEMENT:
				return getNomResponsableRattachement();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITE_MISE_EN_PLACE:
				return getModaliteMiseEnPlace();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITES_PARTICULIERES_TIRS:
				return getModalitesParticulieresTirs();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_RATTACHEMENT:
				return getFonctionResponsableRattachement();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_ZONE_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneObservationAutreElementControle();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_CARACTERISTIQUES_MISSION_COBRA_MISSION_COBRA:
				return getAPourCaracteristiquesMissionCOBRAMissionCOBRA();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__SINTERESSE_ATYPE_OBJECTIF_ASS:
				return getSInteresseATypeObjectifASS();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_COORDINATION_TYPE_POSTE_MILITAIRE:
				return getAPourFonctionResponsableCoordinationTypePosteMilitaire();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_RATTACHEMENT_TYPE_POSTE_MILITAIRE:
				return getAPourFonctionResponsableRattachementTypePosteMilitaire();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_TIR_UNITE:
				return getAPourUniteExecutanteTirUnite();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_UNITE:
				return getAPourUniteExecutanteUnite();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__EST_OBJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				return getEstObjetAssociationUniteMissionAcqASS();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_TYPES_OBJECTIFS_TYPE:
				return getAPourTypesObjectifsType();
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
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MISSION_ACQUISITION:
				setTypeMissionAcquisition((TypeDictionaryDicoMissionAcquisitionASSTypeMissionAcquisition)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MOYEN_ACQUISITION:
				setTypeMoyenAcquisition((TypeDictionaryDicoTypeMoyenAcquisitionASS)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__PRIORITE:
				setPriorite((TypeDictionaryDicoMissionAcquisitionASSPriorite)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_COORDINATION:
				setNomResponsableCoordination((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_COORDINATION:
				setFonctionResponsableCoordination((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_RATTACHEMENT:
				setNomResponsableRattachement((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITE_MISE_EN_PLACE:
				setModaliteMiseEnPlace((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITES_PARTICULIERES_TIRS:
				setModalitesParticulieresTirs((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_RATTACHEMENT:
				setFonctionResponsableRattachement((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_ZONE_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneObservationAutreElementControle().clear();
				getAPourZoneObservationAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_CARACTERISTIQUES_MISSION_COBRA_MISSION_COBRA:
				setAPourCaracteristiquesMissionCOBRAMissionCOBRA((TypeMissionCOBRA)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__SINTERESSE_ATYPE_OBJECTIF_ASS:
				getSInteresseATypeObjectifASS().clear();
				getSInteresseATypeObjectifASS().addAll((Collection<? extends TypeTypeObjectifASS>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_COORDINATION_TYPE_POSTE_MILITAIRE:
				setAPourFonctionResponsableCoordinationTypePosteMilitaire((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_RATTACHEMENT_TYPE_POSTE_MILITAIRE:
				setAPourFonctionResponsableRattachementTypePosteMilitaire((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_TIR_UNITE:
				getAPourUniteExecutanteTirUnite().clear();
				getAPourUniteExecutanteTirUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				getAPourUniteExecutanteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__EST_OBJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				getEstObjetAssociationUniteMissionAcqASS().clear();
				getEstObjetAssociationUniteMissionAcqASS().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_TYPES_OBJECTIFS_TYPE:
				getAPourTypesObjectifsType().clear();
				getAPourTypesObjectifsType().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MISSION_ACQUISITION:
				unsetTypeMissionAcquisition();
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MOYEN_ACQUISITION:
				unsetTypeMoyenAcquisition();
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_COORDINATION:
				setNomResponsableCoordination(NOM_RESPONSABLE_COORDINATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_COORDINATION:
				setFonctionResponsableCoordination(FONCTION_RESPONSABLE_COORDINATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_RATTACHEMENT:
				setNomResponsableRattachement(NOM_RESPONSABLE_RATTACHEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITE_MISE_EN_PLACE:
				setModaliteMiseEnPlace(MODALITE_MISE_EN_PLACE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITES_PARTICULIERES_TIRS:
				setModalitesParticulieresTirs(MODALITES_PARTICULIERES_TIRS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_RATTACHEMENT:
				setFonctionResponsableRattachement(FONCTION_RESPONSABLE_RATTACHEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_ZONE_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneObservationAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_CARACTERISTIQUES_MISSION_COBRA_MISSION_COBRA:
				setAPourCaracteristiquesMissionCOBRAMissionCOBRA((TypeMissionCOBRA)null);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__SINTERESSE_ATYPE_OBJECTIF_ASS:
				getSInteresseATypeObjectifASS().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_COORDINATION_TYPE_POSTE_MILITAIRE:
				setAPourFonctionResponsableCoordinationTypePosteMilitaire((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_RATTACHEMENT_TYPE_POSTE_MILITAIRE:
				setAPourFonctionResponsableRattachementTypePosteMilitaire((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_TIR_UNITE:
				getAPourUniteExecutanteTirUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__EST_OBJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				getEstObjetAssociationUniteMissionAcqASS().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_TYPES_OBJECTIFS_TYPE:
				getAPourTypesObjectifsType().clear();
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
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MISSION_ACQUISITION:
				return isSetTypeMissionAcquisition();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__TYPE_MOYEN_ACQUISITION:
				return isSetTypeMoyenAcquisition();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_COORDINATION:
				return NOM_RESPONSABLE_COORDINATION_EDEFAULT == null ? nomResponsableCoordination != null : !NOM_RESPONSABLE_COORDINATION_EDEFAULT.equals(nomResponsableCoordination);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_COORDINATION:
				return FONCTION_RESPONSABLE_COORDINATION_EDEFAULT == null ? fonctionResponsableCoordination != null : !FONCTION_RESPONSABLE_COORDINATION_EDEFAULT.equals(fonctionResponsableCoordination);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__NOM_RESPONSABLE_RATTACHEMENT:
				return NOM_RESPONSABLE_RATTACHEMENT_EDEFAULT == null ? nomResponsableRattachement != null : !NOM_RESPONSABLE_RATTACHEMENT_EDEFAULT.equals(nomResponsableRattachement);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITE_MISE_EN_PLACE:
				return MODALITE_MISE_EN_PLACE_EDEFAULT == null ? modaliteMiseEnPlace != null : !MODALITE_MISE_EN_PLACE_EDEFAULT.equals(modaliteMiseEnPlace);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__MODALITES_PARTICULIERES_TIRS:
				return MODALITES_PARTICULIERES_TIRS_EDEFAULT == null ? modalitesParticulieresTirs != null : !MODALITES_PARTICULIERES_TIRS_EDEFAULT.equals(modalitesParticulieresTirs);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__FONCTION_RESPONSABLE_RATTACHEMENT:
				return FONCTION_RESPONSABLE_RATTACHEMENT_EDEFAULT == null ? fonctionResponsableRattachement != null : !FONCTION_RESPONSABLE_RATTACHEMENT_EDEFAULT.equals(fonctionResponsableRattachement);
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_ZONE_OBSERVATION_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneObservationAutreElementControle != null && !aPourZoneObservationAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_CARACTERISTIQUES_MISSION_COBRA_MISSION_COBRA:
				return aPourCaracteristiquesMissionCOBRAMissionCOBRA != null;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__SINTERESSE_ATYPE_OBJECTIF_ASS:
				return sInteresseATypeObjectifASS != null && !sInteresseATypeObjectifASS.isEmpty();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_COORDINATION_TYPE_POSTE_MILITAIRE:
				return aPourFonctionResponsableCoordinationTypePosteMilitaire != null;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_FONCTION_RESPONSABLE_RATTACHEMENT_TYPE_POSTE_MILITAIRE:
				return aPourFonctionResponsableRattachementTypePosteMilitaire != null;
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_TIR_UNITE:
				return aPourUniteExecutanteTirUnite != null && !aPourUniteExecutanteTirUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_UNITE_EXECUTANTE_UNITE:
				return aPourUniteExecutanteUnite != null && !aPourUniteExecutanteUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__EST_OBJET_ASSOCIATION_UNITE_MISSION_ACQ_ASS:
				return estObjetAssociationUniteMissionAcqASS != null && !estObjetAssociationUniteMissionAcqASS.isEmpty();
			case SchemaPackage.TYPE_MISSION_ACQUISITION_ASS__APOUR_TYPES_OBJECTIFS_TYPE:
				return aPourTypesObjectifsType != null && !aPourTypesObjectifsType.isEmpty();
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
		result.append(" (typeMissionAcquisition: ");
		if (typeMissionAcquisitionESet) result.append(typeMissionAcquisition); else result.append("<unset>");
		result.append(", typeMoyenAcquisition: ");
		if (typeMoyenAcquisitionESet) result.append(typeMoyenAcquisition); else result.append("<unset>");
		result.append(", priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", nomResponsableCoordination: ");
		result.append(nomResponsableCoordination);
		result.append(", fonctionResponsableCoordination: ");
		result.append(fonctionResponsableCoordination);
		result.append(", nomResponsableRattachement: ");
		result.append(nomResponsableRattachement);
		result.append(", modaliteMiseEnPlace: ");
		result.append(modaliteMiseEnPlace);
		result.append(", modalitesParticulieresTirs: ");
		result.append(modalitesParticulieresTirs);
		result.append(", fonctionResponsableRattachement: ");
		result.append(fonctionResponsableRattachement);
		result.append(')');
		return result.toString();
	}

} //TypeMissionAcquisitionASSImpl
