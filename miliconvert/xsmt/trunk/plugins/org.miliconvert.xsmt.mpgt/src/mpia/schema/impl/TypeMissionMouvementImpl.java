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
import mpia.schema.TypeDictionaryDicoMissionMouvementActiviteCirculation;
import mpia.schema.TypeDictionaryDicoMissionMouvementTypeMissionMouvement;
import mpia.schema.TypeMissionMouvement;

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
 * An implementation of the model object '<em><b>Type Mission Mouvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getNumeroMission <em>Numero Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getTypeMissionMouvement <em>Type Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getActiviteCirculation <em>Activite Circulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getActiviteCirculationTextuelle <em>Activite Circulation Textuelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getDescriptionGenerale <em>Description Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getPrioriteTextuelle <em>Priorite Textuelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getDescriptionEffort <em>Description Effort</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getAttitudeEnFinAction <em>Attitude En Fin Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getActionPreliminaire <em>Action Preliminaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getEstSujetAssociationMissionMouvementMissionMouvement <em>Est Sujet Association Mission Mouvement Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMouvementImpl#getEstObjetAssociationMissionMouvementMissionMouvement <em>Est Objet Association Mission Mouvement Mission Mouvement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionMouvementImpl extends TypeMissionImpl implements TypeMissionMouvement {
	/**
	 * The default value of the '{@link #getNumeroMission() <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMission()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_MISSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroMission() <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMission()
	 * @generated
	 * @ordered
	 */
	protected long numeroMission = NUMERO_MISSION_EDEFAULT;

	/**
	 * This is true if the Numero Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroMissionESet;

	/**
	 * The default value of the '{@link #getTypeMissionMouvement() <em>Type Mission Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionMouvementTypeMissionMouvement TYPE_MISSION_MOUVEMENT_EDEFAULT = TypeDictionaryDicoMissionMouvementTypeMissionMouvement.CIRDO;

	/**
	 * The cached value of the '{@link #getTypeMissionMouvement() <em>Type Mission Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionMouvementTypeMissionMouvement typeMissionMouvement = TYPE_MISSION_MOUVEMENT_EDEFAULT;

	/**
	 * This is true if the Type Mission Mouvement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionMouvementESet;

	/**
	 * The default value of the '{@link #getActiviteCirculation() <em>Activite Circulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteCirculation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionMouvementActiviteCirculation ACTIVITE_CIRCULATION_EDEFAULT = TypeDictionaryDicoMissionMouvementActiviteCirculation.SUPMVT;

	/**
	 * The cached value of the '{@link #getActiviteCirculation() <em>Activite Circulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteCirculation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionMouvementActiviteCirculation activiteCirculation = ACTIVITE_CIRCULATION_EDEFAULT;

	/**
	 * This is true if the Activite Circulation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activiteCirculationESet;

	/**
	 * The default value of the '{@link #getActiviteCirculationTextuelle() <em>Activite Circulation Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteCirculationTextuelle()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITE_CIRCULATION_TEXTUELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiviteCirculationTextuelle() <em>Activite Circulation Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteCirculationTextuelle()
	 * @generated
	 * @ordered
	 */
	protected String activiteCirculationTextuelle = ACTIVITE_CIRCULATION_TEXTUELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionGenerale() <em>Description Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGenerale()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_GENERALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionGenerale() <em>Description Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGenerale()
	 * @generated
	 * @ordered
	 */
	protected String descriptionGenerale = DESCRIPTION_GENERALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrioriteTextuelle() <em>Priorite Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteTextuelle()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITE_TEXTUELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrioriteTextuelle() <em>Priorite Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteTextuelle()
	 * @generated
	 * @ordered
	 */
	protected String prioriteTextuelle = PRIORITE_TEXTUELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionEffort() <em>Description Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionEffort()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EFFORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionEffort() <em>Description Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionEffort()
	 * @generated
	 * @ordered
	 */
	protected String descriptionEffort = DESCRIPTION_EFFORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttitudeEnFinAction() <em>Attitude En Fin Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeEnFinAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTITUDE_EN_FIN_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttitudeEnFinAction() <em>Attitude En Fin Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeEnFinAction()
	 * @generated
	 * @ordered
	 */
	protected String attitudeEnFinAction = ATTITUDE_EN_FIN_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionPreliminaire() <em>Action Preliminaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionPreliminaire()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_PRELIMINAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionPreliminaire() <em>Action Preliminaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionPreliminaire()
	 * @generated
	 * @ordered
	 */
	protected String actionPreliminaire = ACTION_PRELIMINAIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourUniteConcerneeUnite() <em>APour Unite Concernee Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteConcerneeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteConcerneeUnite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMissionMouvementMissionMouvement() <em>Est Sujet Association Mission Mouvement Mission Mouvement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMissionMouvementMissionMouvement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMissionMouvementMissionMouvement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMissionMouvementMissionMouvement() <em>Est Objet Association Mission Mouvement Mission Mouvement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMissionMouvementMissionMouvement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMissionMouvementMissionMouvement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionMouvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionMouvement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroMission() {
		return numeroMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroMission(long newNumeroMission) {
		long oldNumeroMission = numeroMission;
		numeroMission = newNumeroMission;
		boolean oldNumeroMissionESet = numeroMissionESet;
		numeroMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MOUVEMENT__NUMERO_MISSION, oldNumeroMission, numeroMission, !oldNumeroMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroMission() {
		long oldNumeroMission = numeroMission;
		boolean oldNumeroMissionESet = numeroMissionESet;
		numeroMission = NUMERO_MISSION_EDEFAULT;
		numeroMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_MOUVEMENT__NUMERO_MISSION, oldNumeroMission, NUMERO_MISSION_EDEFAULT, oldNumeroMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroMission() {
		return numeroMissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionMouvementTypeMissionMouvement getTypeMissionMouvement() {
		return typeMissionMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionMouvement(TypeDictionaryDicoMissionMouvementTypeMissionMouvement newTypeMissionMouvement) {
		TypeDictionaryDicoMissionMouvementTypeMissionMouvement oldTypeMissionMouvement = typeMissionMouvement;
		typeMissionMouvement = newTypeMissionMouvement == null ? TYPE_MISSION_MOUVEMENT_EDEFAULT : newTypeMissionMouvement;
		boolean oldTypeMissionMouvementESet = typeMissionMouvementESet;
		typeMissionMouvementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MOUVEMENT__TYPE_MISSION_MOUVEMENT, oldTypeMissionMouvement, typeMissionMouvement, !oldTypeMissionMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMissionMouvement() {
		TypeDictionaryDicoMissionMouvementTypeMissionMouvement oldTypeMissionMouvement = typeMissionMouvement;
		boolean oldTypeMissionMouvementESet = typeMissionMouvementESet;
		typeMissionMouvement = TYPE_MISSION_MOUVEMENT_EDEFAULT;
		typeMissionMouvementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_MOUVEMENT__TYPE_MISSION_MOUVEMENT, oldTypeMissionMouvement, TYPE_MISSION_MOUVEMENT_EDEFAULT, oldTypeMissionMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMissionMouvement() {
		return typeMissionMouvementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionMouvementActiviteCirculation getActiviteCirculation() {
		return activiteCirculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiviteCirculation(TypeDictionaryDicoMissionMouvementActiviteCirculation newActiviteCirculation) {
		TypeDictionaryDicoMissionMouvementActiviteCirculation oldActiviteCirculation = activiteCirculation;
		activiteCirculation = newActiviteCirculation == null ? ACTIVITE_CIRCULATION_EDEFAULT : newActiviteCirculation;
		boolean oldActiviteCirculationESet = activiteCirculationESet;
		activiteCirculationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION, oldActiviteCirculation, activiteCirculation, !oldActiviteCirculationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActiviteCirculation() {
		TypeDictionaryDicoMissionMouvementActiviteCirculation oldActiviteCirculation = activiteCirculation;
		boolean oldActiviteCirculationESet = activiteCirculationESet;
		activiteCirculation = ACTIVITE_CIRCULATION_EDEFAULT;
		activiteCirculationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION, oldActiviteCirculation, ACTIVITE_CIRCULATION_EDEFAULT, oldActiviteCirculationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActiviteCirculation() {
		return activiteCirculationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActiviteCirculationTextuelle() {
		return activiteCirculationTextuelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiviteCirculationTextuelle(String newActiviteCirculationTextuelle) {
		String oldActiviteCirculationTextuelle = activiteCirculationTextuelle;
		activiteCirculationTextuelle = newActiviteCirculationTextuelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION_TEXTUELLE, oldActiviteCirculationTextuelle, activiteCirculationTextuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionGenerale() {
		return descriptionGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionGenerale(String newDescriptionGenerale) {
		String oldDescriptionGenerale = descriptionGenerale;
		descriptionGenerale = newDescriptionGenerale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_GENERALE, oldDescriptionGenerale, descriptionGenerale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrioriteTextuelle() {
		return prioriteTextuelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioriteTextuelle(String newPrioriteTextuelle) {
		String oldPrioriteTextuelle = prioriteTextuelle;
		prioriteTextuelle = newPrioriteTextuelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MOUVEMENT__PRIORITE_TEXTUELLE, oldPrioriteTextuelle, prioriteTextuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionEffort() {
		return descriptionEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionEffort(String newDescriptionEffort) {
		String oldDescriptionEffort = descriptionEffort;
		descriptionEffort = newDescriptionEffort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_EFFORT, oldDescriptionEffort, descriptionEffort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttitudeEnFinAction() {
		return attitudeEnFinAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitudeEnFinAction(String newAttitudeEnFinAction) {
		String oldAttitudeEnFinAction = attitudeEnFinAction;
		attitudeEnFinAction = newAttitudeEnFinAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MOUVEMENT__ATTITUDE_EN_FIN_ACTION, oldAttitudeEnFinAction, attitudeEnFinAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionPreliminaire() {
		return actionPreliminaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionPreliminaire(String newActionPreliminaire) {
		String oldActionPreliminaire = actionPreliminaire;
		actionPreliminaire = newActionPreliminaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTION_PRELIMINAIRE, oldActionPreliminaire, actionPreliminaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteConcerneeUnite() {
		if (aPourUniteConcerneeUnite == null) {
			aPourUniteConcerneeUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MOUVEMENT__APOUR_UNITE_CONCERNEE_UNITE);
		}
		return aPourUniteConcerneeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMissionMouvementMissionMouvement() {
		if (estSujetAssociationMissionMouvementMissionMouvement == null) {
			estSujetAssociationMissionMouvementMissionMouvement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_SUJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT);
		}
		return estSujetAssociationMissionMouvementMissionMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMissionMouvementMissionMouvement() {
		if (estObjetAssociationMissionMouvementMissionMouvement == null) {
			estObjetAssociationMissionMouvementMissionMouvement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_OBJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT);
		}
		return estObjetAssociationMissionMouvementMissionMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__APOUR_UNITE_CONCERNEE_UNITE:
				return ((InternalEList<?>)getAPourUniteConcerneeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_SUJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				return ((InternalEList<?>)getEstSujetAssociationMissionMouvementMissionMouvement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_OBJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				return ((InternalEList<?>)getEstObjetAssociationMissionMouvementMissionMouvement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__NUMERO_MISSION:
				return new Long(getNumeroMission());
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__TYPE_MISSION_MOUVEMENT:
				return getTypeMissionMouvement();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION:
				return getActiviteCirculation();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION_TEXTUELLE:
				return getActiviteCirculationTextuelle();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_GENERALE:
				return getDescriptionGenerale();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__PRIORITE_TEXTUELLE:
				return getPrioriteTextuelle();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_EFFORT:
				return getDescriptionEffort();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ATTITUDE_EN_FIN_ACTION:
				return getAttitudeEnFinAction();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTION_PRELIMINAIRE:
				return getActionPreliminaire();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__APOUR_UNITE_CONCERNEE_UNITE:
				return getAPourUniteConcerneeUnite();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_SUJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				return getEstSujetAssociationMissionMouvementMissionMouvement();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_OBJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				return getEstObjetAssociationMissionMouvementMissionMouvement();
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
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__NUMERO_MISSION:
				setNumeroMission(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__TYPE_MISSION_MOUVEMENT:
				setTypeMissionMouvement((TypeDictionaryDicoMissionMouvementTypeMissionMouvement)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION:
				setActiviteCirculation((TypeDictionaryDicoMissionMouvementActiviteCirculation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION_TEXTUELLE:
				setActiviteCirculationTextuelle((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_GENERALE:
				setDescriptionGenerale((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__PRIORITE_TEXTUELLE:
				setPrioriteTextuelle((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_EFFORT:
				setDescriptionEffort((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ATTITUDE_EN_FIN_ACTION:
				setAttitudeEnFinAction((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTION_PRELIMINAIRE:
				setActionPreliminaire((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
				getAPourUniteConcerneeUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_SUJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				getEstSujetAssociationMissionMouvementMissionMouvement().clear();
				getEstSujetAssociationMissionMouvementMissionMouvement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_OBJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				getEstObjetAssociationMissionMouvementMissionMouvement().clear();
				getEstObjetAssociationMissionMouvementMissionMouvement().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__NUMERO_MISSION:
				unsetNumeroMission();
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__TYPE_MISSION_MOUVEMENT:
				unsetTypeMissionMouvement();
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION:
				unsetActiviteCirculation();
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION_TEXTUELLE:
				setActiviteCirculationTextuelle(ACTIVITE_CIRCULATION_TEXTUELLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_GENERALE:
				setDescriptionGenerale(DESCRIPTION_GENERALE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__PRIORITE_TEXTUELLE:
				setPrioriteTextuelle(PRIORITE_TEXTUELLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_EFFORT:
				setDescriptionEffort(DESCRIPTION_EFFORT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ATTITUDE_EN_FIN_ACTION:
				setAttitudeEnFinAction(ATTITUDE_EN_FIN_ACTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTION_PRELIMINAIRE:
				setActionPreliminaire(ACTION_PRELIMINAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_SUJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				getEstSujetAssociationMissionMouvementMissionMouvement().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_OBJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				getEstObjetAssociationMissionMouvementMissionMouvement().clear();
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
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__NUMERO_MISSION:
				return isSetNumeroMission();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__TYPE_MISSION_MOUVEMENT:
				return isSetTypeMissionMouvement();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION:
				return isSetActiviteCirculation();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTIVITE_CIRCULATION_TEXTUELLE:
				return ACTIVITE_CIRCULATION_TEXTUELLE_EDEFAULT == null ? activiteCirculationTextuelle != null : !ACTIVITE_CIRCULATION_TEXTUELLE_EDEFAULT.equals(activiteCirculationTextuelle);
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_GENERALE:
				return DESCRIPTION_GENERALE_EDEFAULT == null ? descriptionGenerale != null : !DESCRIPTION_GENERALE_EDEFAULT.equals(descriptionGenerale);
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__PRIORITE_TEXTUELLE:
				return PRIORITE_TEXTUELLE_EDEFAULT == null ? prioriteTextuelle != null : !PRIORITE_TEXTUELLE_EDEFAULT.equals(prioriteTextuelle);
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__DESCRIPTION_EFFORT:
				return DESCRIPTION_EFFORT_EDEFAULT == null ? descriptionEffort != null : !DESCRIPTION_EFFORT_EDEFAULT.equals(descriptionEffort);
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ATTITUDE_EN_FIN_ACTION:
				return ATTITUDE_EN_FIN_ACTION_EDEFAULT == null ? attitudeEnFinAction != null : !ATTITUDE_EN_FIN_ACTION_EDEFAULT.equals(attitudeEnFinAction);
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__ACTION_PRELIMINAIRE:
				return ACTION_PRELIMINAIRE_EDEFAULT == null ? actionPreliminaire != null : !ACTION_PRELIMINAIRE_EDEFAULT.equals(actionPreliminaire);
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__APOUR_UNITE_CONCERNEE_UNITE:
				return aPourUniteConcerneeUnite != null && !aPourUniteConcerneeUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_SUJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				return estSujetAssociationMissionMouvementMissionMouvement != null && !estSujetAssociationMissionMouvementMissionMouvement.isEmpty();
			case SchemaPackage.TYPE_MISSION_MOUVEMENT__EST_OBJET_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT:
				return estObjetAssociationMissionMouvementMissionMouvement != null && !estObjetAssociationMissionMouvementMissionMouvement.isEmpty();
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
		if (numeroMissionESet) result.append(numeroMission); else result.append("<unset>");
		result.append(", typeMissionMouvement: ");
		if (typeMissionMouvementESet) result.append(typeMissionMouvement); else result.append("<unset>");
		result.append(", activiteCirculation: ");
		if (activiteCirculationESet) result.append(activiteCirculation); else result.append("<unset>");
		result.append(", activiteCirculationTextuelle: ");
		result.append(activiteCirculationTextuelle);
		result.append(", descriptionGenerale: ");
		result.append(descriptionGenerale);
		result.append(", prioriteTextuelle: ");
		result.append(prioriteTextuelle);
		result.append(", descriptionEffort: ");
		result.append(descriptionEffort);
		result.append(", attitudeEnFinAction: ");
		result.append(attitudeEnFinAction);
		result.append(", actionPreliminaire: ");
		result.append(actionPreliminaire);
		result.append(')');
		return result.toString();
	}

} //TypeMissionMouvementImpl
