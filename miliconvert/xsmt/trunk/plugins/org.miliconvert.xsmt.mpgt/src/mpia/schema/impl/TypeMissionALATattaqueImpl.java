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
import mpia.schema.TypeConsommationEnMunitions;
import mpia.schema.TypeMissionALATattaque;

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
 * An implementation of the model object '<em><b>Type Mission ALA Tattaque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getDescriptionMission <em>Description Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getEffetsTactiquesRecherches <em>Effets Tactiques Recherches</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getTypeAppui <em>Type Appui</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getAPourUniteAlatUnite <em>APour Unite Alat Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getAPourUniteAppuiUnite <em>APour Unite Appui Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getEstObjetAssociationUniteMissionALATattaque <em>Est Objet Association Unite Mission ALA Tattaque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getACommeMunitionsConsommeeConsommationEnMunitions <em>AComme Munitions Consommee Consommation En Munitions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getAPourZoneAttenteDeENIAutreElementControle <em>APour Zone Attente De ENI Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getAPourZoneInterventionAutreElementControle <em>APour Zone Intervention Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionALATattaqueImpl#getAPourItineraireRoutierItineraire <em>APour Itineraire Routier Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionALATattaqueImpl extends TypeMissionImpl implements TypeMissionALATattaque {
	/**
	 * The default value of the '{@link #getDescriptionMission() <em>Description Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMission()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionMission() <em>Description Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMission()
	 * @generated
	 * @ordered
	 */
	protected String descriptionMission = DESCRIPTION_MISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffetsTactiquesRecherches() <em>Effets Tactiques Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetsTactiquesRecherches()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFETS_TACTIQUES_RECHERCHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffetsTactiquesRecherches() <em>Effets Tactiques Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetsTactiquesRecherches()
	 * @generated
	 * @ordered
	 */
	protected String effetsTactiquesRecherches = EFFETS_TACTIQUES_RECHERCHES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeAppui() <em>Type Appui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAppui()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_APPUI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAppui() <em>Type Appui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAppui()
	 * @generated
	 * @ordered
	 */
	protected String typeAppui = TYPE_APPUI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourUniteAlatUnite() <em>APour Unite Alat Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteAlatUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteAlatUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteAppuiUnite() <em>APour Unite Appui Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteAppuiUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteAppuiUnite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionALATattaque() <em>Est Objet Association Unite Mission ALA Tattaque</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionALATattaque()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionALATattaque;

	/**
	 * The cached value of the '{@link #getACommeMunitionsConsommeeConsommationEnMunitions() <em>AComme Munitions Consommee Consommation En Munitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeMunitionsConsommeeConsommationEnMunitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConsommationEnMunitions> aCommeMunitionsConsommeeConsommationEnMunitions;

	/**
	 * The cached value of the '{@link #getAPourZoneAttenteDeENIAutreElementControle() <em>APour Zone Attente De ENI Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneAttenteDeENIAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneAttenteDeENIAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourZoneInterventionAutreElementControle() <em>APour Zone Intervention Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneInterventionAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneInterventionAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourItineraireRoutierItineraire() <em>APour Itineraire Routier Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourItineraireRoutierItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourItineraireRoutierItineraire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionALATattaqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionALATattaque();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionMission() {
		return descriptionMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionMission(String newDescriptionMission) {
		String oldDescriptionMission = descriptionMission;
		descriptionMission = newDescriptionMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__DESCRIPTION_MISSION, oldDescriptionMission, descriptionMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffetsTactiquesRecherches() {
		return effetsTactiquesRecherches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetsTactiquesRecherches(String newEffetsTactiquesRecherches) {
		String oldEffetsTactiquesRecherches = effetsTactiquesRecherches;
		effetsTactiquesRecherches = newEffetsTactiquesRecherches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EFFETS_TACTIQUES_RECHERCHES, oldEffetsTactiquesRecherches, effetsTactiquesRecherches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeAppui() {
		return typeAppui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAppui(String newTypeAppui) {
		String oldTypeAppui = typeAppui;
		typeAppui = newTypeAppui;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__TYPE_APPUI, oldTypeAppui, typeAppui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteAlatUnite() {
		if (aPourUniteAlatUnite == null) {
			aPourUniteAlatUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_ALAT_UNITE);
		}
		return aPourUniteAlatUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteAppuiUnite() {
		if (aPourUniteAppuiUnite == null) {
			aPourUniteAppuiUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_APPUI_UNITE);
		}
		return aPourUniteAppuiUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionALATattaque() {
		if (estObjetAssociationUniteMissionALATattaque == null) {
			estObjetAssociationUniteMissionALATattaque = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE);
		}
		return estObjetAssociationUniteMissionALATattaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsommationEnMunitions> getACommeMunitionsConsommeeConsommationEnMunitions() {
		if (aCommeMunitionsConsommeeConsommationEnMunitions == null) {
			aCommeMunitionsConsommeeConsommationEnMunitions = new EObjectContainmentEList<TypeConsommationEnMunitions>(TypeConsommationEnMunitions.class, this, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS);
		}
		return aCommeMunitionsConsommeeConsommationEnMunitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneAttenteDeENIAutreElementControle() {
		if (aPourZoneAttenteDeENIAutreElementControle == null) {
			aPourZoneAttenteDeENIAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_ATTENTE_DE_ENI_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneAttenteDeENIAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneInterventionAutreElementControle() {
		if (aPourZoneInterventionAutreElementControle == null) {
			aPourZoneInterventionAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_INTERVENTION_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneInterventionAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourItineraireRoutierItineraire() {
		if (aPourItineraireRoutierItineraire == null) {
			aPourItineraireRoutierItineraire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ITINERAIRE_ROUTIER_ITINERAIRE);
		}
		return aPourItineraireRoutierItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_ALAT_UNITE:
				return ((InternalEList<?>)getAPourUniteAlatUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_APPUI_UNITE:
				return ((InternalEList<?>)getAPourUniteAppuiUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionALATattaque()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				return ((InternalEList<?>)getACommeMunitionsConsommeeConsommationEnMunitions()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_ATTENTE_DE_ENI_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneAttenteDeENIAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_INTERVENTION_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneInterventionAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ITINERAIRE_ROUTIER_ITINERAIRE:
				return ((InternalEList<?>)getAPourItineraireRoutierItineraire()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__DESCRIPTION_MISSION:
				return getDescriptionMission();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EFFETS_TACTIQUES_RECHERCHES:
				return getEffetsTactiquesRecherches();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__TYPE_APPUI:
				return getTypeAppui();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_ALAT_UNITE:
				return getAPourUniteAlatUnite();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_APPUI_UNITE:
				return getAPourUniteAppuiUnite();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				return getEstObjetAssociationUniteMissionALATattaque();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				return getACommeMunitionsConsommeeConsommationEnMunitions();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_ATTENTE_DE_ENI_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneAttenteDeENIAutreElementControle();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_INTERVENTION_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneInterventionAutreElementControle();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ITINERAIRE_ROUTIER_ITINERAIRE:
				return getAPourItineraireRoutierItineraire();
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
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__DESCRIPTION_MISSION:
				setDescriptionMission((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EFFETS_TACTIQUES_RECHERCHES:
				setEffetsTactiquesRecherches((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__TYPE_APPUI:
				setTypeAppui((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_ALAT_UNITE:
				getAPourUniteAlatUnite().clear();
				getAPourUniteAlatUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_APPUI_UNITE:
				getAPourUniteAppuiUnite().clear();
				getAPourUniteAppuiUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				getEstObjetAssociationUniteMissionALATattaque().clear();
				getEstObjetAssociationUniteMissionALATattaque().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				getACommeMunitionsConsommeeConsommationEnMunitions().clear();
				getACommeMunitionsConsommeeConsommationEnMunitions().addAll((Collection<? extends TypeConsommationEnMunitions>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_ATTENTE_DE_ENI_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneAttenteDeENIAutreElementControle().clear();
				getAPourZoneAttenteDeENIAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_INTERVENTION_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneInterventionAutreElementControle().clear();
				getAPourZoneInterventionAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ITINERAIRE_ROUTIER_ITINERAIRE:
				getAPourItineraireRoutierItineraire().clear();
				getAPourItineraireRoutierItineraire().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__DESCRIPTION_MISSION:
				setDescriptionMission(DESCRIPTION_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EFFETS_TACTIQUES_RECHERCHES:
				setEffetsTactiquesRecherches(EFFETS_TACTIQUES_RECHERCHES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__TYPE_APPUI:
				setTypeAppui(TYPE_APPUI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_ALAT_UNITE:
				getAPourUniteAlatUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_APPUI_UNITE:
				getAPourUniteAppuiUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				getEstObjetAssociationUniteMissionALATattaque().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				getACommeMunitionsConsommeeConsommationEnMunitions().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_ATTENTE_DE_ENI_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneAttenteDeENIAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_INTERVENTION_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneInterventionAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ITINERAIRE_ROUTIER_ITINERAIRE:
				getAPourItineraireRoutierItineraire().clear();
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
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__DESCRIPTION_MISSION:
				return DESCRIPTION_MISSION_EDEFAULT == null ? descriptionMission != null : !DESCRIPTION_MISSION_EDEFAULT.equals(descriptionMission);
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EFFETS_TACTIQUES_RECHERCHES:
				return EFFETS_TACTIQUES_RECHERCHES_EDEFAULT == null ? effetsTactiquesRecherches != null : !EFFETS_TACTIQUES_RECHERCHES_EDEFAULT.equals(effetsTactiquesRecherches);
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__TYPE_APPUI:
				return TYPE_APPUI_EDEFAULT == null ? typeAppui != null : !TYPE_APPUI_EDEFAULT.equals(typeAppui);
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_ALAT_UNITE:
				return aPourUniteAlatUnite != null && !aPourUniteAlatUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_UNITE_APPUI_UNITE:
				return aPourUniteAppuiUnite != null && !aPourUniteAppuiUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE:
				return estObjetAssociationUniteMissionALATattaque != null && !estObjetAssociationUniteMissionALATattaque.isEmpty();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				return aCommeMunitionsConsommeeConsommationEnMunitions != null && !aCommeMunitionsConsommeeConsommationEnMunitions.isEmpty();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_ATTENTE_DE_ENI_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneAttenteDeENIAutreElementControle != null && !aPourZoneAttenteDeENIAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ZONE_INTERVENTION_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneInterventionAutreElementControle != null && !aPourZoneInterventionAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_ALA_TATTAQUE__APOUR_ITINERAIRE_ROUTIER_ITINERAIRE:
				return aPourItineraireRoutierItineraire != null && !aPourItineraireRoutierItineraire.isEmpty();
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
		result.append(" (descriptionMission: ");
		result.append(descriptionMission);
		result.append(", effetsTactiquesRecherches: ");
		result.append(effetsTactiquesRecherches);
		result.append(", typeAppui: ");
		result.append(typeAppui);
		result.append(')');
		return result.toString();
	}

} //TypeMissionALATattaqueImpl
