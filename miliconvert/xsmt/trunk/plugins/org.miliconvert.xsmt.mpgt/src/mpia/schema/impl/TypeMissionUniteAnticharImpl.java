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
import mpia.schema.TypeMissionUniteAntichar;

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
 * An implementation of the model object '<em><b>Type Mission Unite Antichar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionUniteAnticharImpl#getDescriptionGeneraleMission <em>Description Generale Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionUniteAnticharImpl#getEffetsTactiquesRecherches <em>Effets Tactiques Recherches</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionUniteAnticharImpl#getAPourZoneABattreFeuxAutreElementControle <em>APour Zone ABattre Feux Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionUniteAnticharImpl#getAPourZoneASurveillerAutreElementControle <em>APour Zone ASurveiller Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionUniteAnticharImpl#getACommeMunitionsConsommeeConsommationEnMunitions <em>AComme Munitions Consommee Consommation En Munitions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionUniteAnticharImpl#getAPourItineraireDeplacementItineraire <em>APour Itineraire Deplacement Itineraire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionUniteAnticharImpl#getAPourUniteAntiCharUnite <em>APour Unite Anti Char Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionUniteAnticharImpl#getEstObjetAssociationUniteMissionUniteAntichar <em>Est Objet Association Unite Mission Unite Antichar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionUniteAnticharImpl extends TypeMissionImpl implements TypeMissionUniteAntichar {
	/**
	 * The default value of the '{@link #getDescriptionGeneraleMission() <em>Description Generale Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGeneraleMission()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_GENERALE_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionGeneraleMission() <em>Description Generale Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGeneraleMission()
	 * @generated
	 * @ordered
	 */
	protected String descriptionGeneraleMission = DESCRIPTION_GENERALE_MISSION_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourZoneABattreFeuxAutreElementControle() <em>APour Zone ABattre Feux Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneABattreFeuxAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneABattreFeuxAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourZoneASurveillerAutreElementControle() <em>APour Zone ASurveiller Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneASurveillerAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneASurveillerAutreElementControle;

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
	 * The cached value of the '{@link #getAPourItineraireDeplacementItineraire() <em>APour Itineraire Deplacement Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourItineraireDeplacementItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourItineraireDeplacementItineraire;

	/**
	 * The cached value of the '{@link #getAPourUniteAntiCharUnite() <em>APour Unite Anti Char Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteAntiCharUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteAntiCharUnite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionUniteAntichar() <em>Est Objet Association Unite Mission Unite Antichar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionUniteAntichar()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionUniteAntichar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionUniteAnticharImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionUniteAntichar();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionGeneraleMission() {
		return descriptionGeneraleMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionGeneraleMission(String newDescriptionGeneraleMission) {
		String oldDescriptionGeneraleMission = descriptionGeneraleMission;
		descriptionGeneraleMission = newDescriptionGeneraleMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__DESCRIPTION_GENERALE_MISSION, oldDescriptionGeneraleMission, descriptionGeneraleMission));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EFFETS_TACTIQUES_RECHERCHES, oldEffetsTactiquesRecherches, effetsTactiquesRecherches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneABattreFeuxAutreElementControle() {
		if (aPourZoneABattreFeuxAutreElementControle == null) {
			aPourZoneABattreFeuxAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ABATTRE_FEUX_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneABattreFeuxAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneASurveillerAutreElementControle() {
		if (aPourZoneASurveillerAutreElementControle == null) {
			aPourZoneASurveillerAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneASurveillerAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsommationEnMunitions> getACommeMunitionsConsommeeConsommationEnMunitions() {
		if (aCommeMunitionsConsommeeConsommationEnMunitions == null) {
			aCommeMunitionsConsommeeConsommationEnMunitions = new EObjectContainmentEList<TypeConsommationEnMunitions>(TypeConsommationEnMunitions.class, this, SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS);
		}
		return aCommeMunitionsConsommeeConsommationEnMunitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourItineraireDeplacementItineraire() {
		if (aPourItineraireDeplacementItineraire == null) {
			aPourItineraireDeplacementItineraire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ITINERAIRE_DEPLACEMENT_ITINERAIRE);
		}
		return aPourItineraireDeplacementItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteAntiCharUnite() {
		if (aPourUniteAntiCharUnite == null) {
			aPourUniteAntiCharUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_UNITE_ANTI_CHAR_UNITE);
		}
		return aPourUniteAntiCharUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionUniteAntichar() {
		if (estObjetAssociationUniteMissionUniteAntichar == null) {
			estObjetAssociationUniteMissionUniteAntichar = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EST_OBJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR);
		}
		return estObjetAssociationUniteMissionUniteAntichar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ABATTRE_FEUX_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneABattreFeuxAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneASurveillerAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				return ((InternalEList<?>)getACommeMunitionsConsommeeConsommationEnMunitions()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ITINERAIRE_DEPLACEMENT_ITINERAIRE:
				return ((InternalEList<?>)getAPourItineraireDeplacementItineraire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_UNITE_ANTI_CHAR_UNITE:
				return ((InternalEList<?>)getAPourUniteAntiCharUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EST_OBJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionUniteAntichar()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__DESCRIPTION_GENERALE_MISSION:
				return getDescriptionGeneraleMission();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EFFETS_TACTIQUES_RECHERCHES:
				return getEffetsTactiquesRecherches();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ABATTRE_FEUX_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneABattreFeuxAutreElementControle();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneASurveillerAutreElementControle();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				return getACommeMunitionsConsommeeConsommationEnMunitions();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ITINERAIRE_DEPLACEMENT_ITINERAIRE:
				return getAPourItineraireDeplacementItineraire();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_UNITE_ANTI_CHAR_UNITE:
				return getAPourUniteAntiCharUnite();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EST_OBJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				return getEstObjetAssociationUniteMissionUniteAntichar();
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
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__DESCRIPTION_GENERALE_MISSION:
				setDescriptionGeneraleMission((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EFFETS_TACTIQUES_RECHERCHES:
				setEffetsTactiquesRecherches((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ABATTRE_FEUX_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneABattreFeuxAutreElementControle().clear();
				getAPourZoneABattreFeuxAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneASurveillerAutreElementControle().clear();
				getAPourZoneASurveillerAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				getACommeMunitionsConsommeeConsommationEnMunitions().clear();
				getACommeMunitionsConsommeeConsommationEnMunitions().addAll((Collection<? extends TypeConsommationEnMunitions>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ITINERAIRE_DEPLACEMENT_ITINERAIRE:
				getAPourItineraireDeplacementItineraire().clear();
				getAPourItineraireDeplacementItineraire().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_UNITE_ANTI_CHAR_UNITE:
				getAPourUniteAntiCharUnite().clear();
				getAPourUniteAntiCharUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EST_OBJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				getEstObjetAssociationUniteMissionUniteAntichar().clear();
				getEstObjetAssociationUniteMissionUniteAntichar().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__DESCRIPTION_GENERALE_MISSION:
				setDescriptionGeneraleMission(DESCRIPTION_GENERALE_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EFFETS_TACTIQUES_RECHERCHES:
				setEffetsTactiquesRecherches(EFFETS_TACTIQUES_RECHERCHES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ABATTRE_FEUX_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneABattreFeuxAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneASurveillerAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				getACommeMunitionsConsommeeConsommationEnMunitions().clear();
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ITINERAIRE_DEPLACEMENT_ITINERAIRE:
				getAPourItineraireDeplacementItineraire().clear();
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_UNITE_ANTI_CHAR_UNITE:
				getAPourUniteAntiCharUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EST_OBJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				getEstObjetAssociationUniteMissionUniteAntichar().clear();
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
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__DESCRIPTION_GENERALE_MISSION:
				return DESCRIPTION_GENERALE_MISSION_EDEFAULT == null ? descriptionGeneraleMission != null : !DESCRIPTION_GENERALE_MISSION_EDEFAULT.equals(descriptionGeneraleMission);
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EFFETS_TACTIQUES_RECHERCHES:
				return EFFETS_TACTIQUES_RECHERCHES_EDEFAULT == null ? effetsTactiquesRecherches != null : !EFFETS_TACTIQUES_RECHERCHES_EDEFAULT.equals(effetsTactiquesRecherches);
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ABATTRE_FEUX_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneABattreFeuxAutreElementControle != null && !aPourZoneABattreFeuxAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneASurveillerAutreElementControle != null && !aPourZoneASurveillerAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__ACOMME_MUNITIONS_CONSOMMEE_CONSOMMATION_EN_MUNITIONS:
				return aCommeMunitionsConsommeeConsommationEnMunitions != null && !aCommeMunitionsConsommeeConsommationEnMunitions.isEmpty();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_ITINERAIRE_DEPLACEMENT_ITINERAIRE:
				return aPourItineraireDeplacementItineraire != null && !aPourItineraireDeplacementItineraire.isEmpty();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__APOUR_UNITE_ANTI_CHAR_UNITE:
				return aPourUniteAntiCharUnite != null && !aPourUniteAntiCharUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_UNITE_ANTICHAR__EST_OBJET_ASSOCIATION_UNITE_MISSION_UNITE_ANTICHAR:
				return estObjetAssociationUniteMissionUniteAntichar != null && !estObjetAssociationUniteMissionUniteAntichar.isEmpty();
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
		result.append(" (descriptionGeneraleMission: ");
		result.append(descriptionGeneraleMission);
		result.append(", effetsTactiquesRecherches: ");
		result.append(effetsTactiquesRecherches);
		result.append(')');
		return result.toString();
	}

} //TypeMissionUniteAnticharImpl
