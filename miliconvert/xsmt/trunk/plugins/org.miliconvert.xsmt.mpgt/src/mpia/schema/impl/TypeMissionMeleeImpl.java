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
import mpia.schema.TypeAssocInstanceObjetLocalisation;
import mpia.schema.TypeMissionMelee;

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
 * An implementation of the model object '<em><b>Type Mission Melee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionMeleeImpl#getIntitule <em>Intitule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMeleeImpl#getEstSujetAssociationMissionMeleeAction <em>Est Sujet Association Mission Melee Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMeleeImpl#getConcerneEchelon <em>Concerne Echelon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMeleeImpl#getDecritDeploiementUnitesAssocInstanceObjetLocalisation <em>Decrit Deploiement Unites Assoc Instance Objet Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMeleeImpl#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMeleeImpl#getAPourUniteAppuiGenieUnite <em>APour Unite Appui Genie Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionMeleeImpl#getEstObjetAssociationUniteMissionMelee <em>Est Objet Association Unite Mission Melee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionMeleeImpl extends TypeMissionImpl implements TypeMissionMelee {
	/**
	 * The default value of the '{@link #getIntitule() <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntitule()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntitule() <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntitule()
	 * @generated
	 * @ordered
	 */
	protected String intitule = INTITULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMissionMeleeAction() <em>Est Sujet Association Mission Melee Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMissionMeleeAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMissionMeleeAction;

	/**
	 * The cached value of the '{@link #getConcerneEchelon() <em>Concerne Echelon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneEchelon()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneEchelon;

	/**
	 * The cached value of the '{@link #getDecritDeploiementUnitesAssocInstanceObjetLocalisation() <em>Decrit Deploiement Unites Assoc Instance Objet Localisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecritDeploiementUnitesAssocInstanceObjetLocalisation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssocInstanceObjetLocalisation> decritDeploiementUnitesAssocInstanceObjetLocalisation;

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
	 * The cached value of the '{@link #getAPourUniteAppuiGenieUnite() <em>APour Unite Appui Genie Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteAppuiGenieUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteAppuiGenieUnite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionMelee() <em>Est Objet Association Unite Mission Melee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionMelee()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionMelee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionMeleeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionMelee();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntitule() {
		return intitule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntitule(String newIntitule) {
		String oldIntitule = intitule;
		intitule = newIntitule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_MELEE__INTITULE, oldIntitule, intitule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMissionMeleeAction() {
		if (estSujetAssociationMissionMeleeAction == null) {
			estSujetAssociationMissionMeleeAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MELEE__EST_SUJET_ASSOCIATION_MISSION_MELEE_ACTION);
		}
		return estSujetAssociationMissionMeleeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneEchelon() {
		if (concerneEchelon == null) {
			concerneEchelon = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MELEE__CONCERNE_ECHELON);
		}
		return concerneEchelon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocInstanceObjetLocalisation> getDecritDeploiementUnitesAssocInstanceObjetLocalisation() {
		if (decritDeploiementUnitesAssocInstanceObjetLocalisation == null) {
			decritDeploiementUnitesAssocInstanceObjetLocalisation = new EObjectContainmentEList<TypeAssocInstanceObjetLocalisation>(TypeAssocInstanceObjetLocalisation.class, this, SchemaPackage.TYPE_MISSION_MELEE__DECRIT_DEPLOIEMENT_UNITES_ASSOC_INSTANCE_OBJET_LOCALISATION);
		}
		return decritDeploiementUnitesAssocInstanceObjetLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUnite() {
		if (aPourUniteExecutanteUnite == null) {
			aPourUniteExecutanteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_EXECUTANTE_UNITE);
		}
		return aPourUniteExecutanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteAppuiGenieUnite() {
		if (aPourUniteAppuiGenieUnite == null) {
			aPourUniteAppuiGenieUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_APPUI_GENIE_UNITE);
		}
		return aPourUniteAppuiGenieUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionMelee() {
		if (estObjetAssociationUniteMissionMelee == null) {
			estObjetAssociationUniteMissionMelee = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_MELEE__EST_OBJET_ASSOCIATION_UNITE_MISSION_MELEE);
		}
		return estObjetAssociationUniteMissionMelee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_MELEE__EST_SUJET_ASSOCIATION_MISSION_MELEE_ACTION:
				return ((InternalEList<?>)getEstSujetAssociationMissionMeleeAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MELEE__CONCERNE_ECHELON:
				return ((InternalEList<?>)getConcerneEchelon()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MELEE__DECRIT_DEPLOIEMENT_UNITES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				return ((InternalEList<?>)getDecritDeploiementUnitesAssocInstanceObjetLocalisation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_EXECUTANTE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_APPUI_GENIE_UNITE:
				return ((InternalEList<?>)getAPourUniteAppuiGenieUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_MELEE__EST_OBJET_ASSOCIATION_UNITE_MISSION_MELEE:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionMelee()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_MELEE__INTITULE:
				return getIntitule();
			case SchemaPackage.TYPE_MISSION_MELEE__EST_SUJET_ASSOCIATION_MISSION_MELEE_ACTION:
				return getEstSujetAssociationMissionMeleeAction();
			case SchemaPackage.TYPE_MISSION_MELEE__CONCERNE_ECHELON:
				return getConcerneEchelon();
			case SchemaPackage.TYPE_MISSION_MELEE__DECRIT_DEPLOIEMENT_UNITES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				return getDecritDeploiementUnitesAssocInstanceObjetLocalisation();
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_EXECUTANTE_UNITE:
				return getAPourUniteExecutanteUnite();
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_APPUI_GENIE_UNITE:
				return getAPourUniteAppuiGenieUnite();
			case SchemaPackage.TYPE_MISSION_MELEE__EST_OBJET_ASSOCIATION_UNITE_MISSION_MELEE:
				return getEstObjetAssociationUniteMissionMelee();
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
			case SchemaPackage.TYPE_MISSION_MELEE__INTITULE:
				setIntitule((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__EST_SUJET_ASSOCIATION_MISSION_MELEE_ACTION:
				getEstSujetAssociationMissionMeleeAction().clear();
				getEstSujetAssociationMissionMeleeAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__CONCERNE_ECHELON:
				getConcerneEchelon().clear();
				getConcerneEchelon().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__DECRIT_DEPLOIEMENT_UNITES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				getDecritDeploiementUnitesAssocInstanceObjetLocalisation().clear();
				getDecritDeploiementUnitesAssocInstanceObjetLocalisation().addAll((Collection<? extends TypeAssocInstanceObjetLocalisation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				getAPourUniteExecutanteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_APPUI_GENIE_UNITE:
				getAPourUniteAppuiGenieUnite().clear();
				getAPourUniteAppuiGenieUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__EST_OBJET_ASSOCIATION_UNITE_MISSION_MELEE:
				getEstObjetAssociationUniteMissionMelee().clear();
				getEstObjetAssociationUniteMissionMelee().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION_MELEE__INTITULE:
				setIntitule(INTITULE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__EST_SUJET_ASSOCIATION_MISSION_MELEE_ACTION:
				getEstSujetAssociationMissionMeleeAction().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__CONCERNE_ECHELON:
				getConcerneEchelon().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__DECRIT_DEPLOIEMENT_UNITES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				getDecritDeploiementUnitesAssocInstanceObjetLocalisation().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_APPUI_GENIE_UNITE:
				getAPourUniteAppuiGenieUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_MELEE__EST_OBJET_ASSOCIATION_UNITE_MISSION_MELEE:
				getEstObjetAssociationUniteMissionMelee().clear();
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
			case SchemaPackage.TYPE_MISSION_MELEE__INTITULE:
				return INTITULE_EDEFAULT == null ? intitule != null : !INTITULE_EDEFAULT.equals(intitule);
			case SchemaPackage.TYPE_MISSION_MELEE__EST_SUJET_ASSOCIATION_MISSION_MELEE_ACTION:
				return estSujetAssociationMissionMeleeAction != null && !estSujetAssociationMissionMeleeAction.isEmpty();
			case SchemaPackage.TYPE_MISSION_MELEE__CONCERNE_ECHELON:
				return concerneEchelon != null && !concerneEchelon.isEmpty();
			case SchemaPackage.TYPE_MISSION_MELEE__DECRIT_DEPLOIEMENT_UNITES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				return decritDeploiementUnitesAssocInstanceObjetLocalisation != null && !decritDeploiementUnitesAssocInstanceObjetLocalisation.isEmpty();
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_EXECUTANTE_UNITE:
				return aPourUniteExecutanteUnite != null && !aPourUniteExecutanteUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_MELEE__APOUR_UNITE_APPUI_GENIE_UNITE:
				return aPourUniteAppuiGenieUnite != null && !aPourUniteAppuiGenieUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_MELEE__EST_OBJET_ASSOCIATION_UNITE_MISSION_MELEE:
				return estObjetAssociationUniteMissionMelee != null && !estObjetAssociationUniteMissionMelee.isEmpty();
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
		result.append(" (intitule: ");
		result.append(intitule);
		result.append(')');
		return result.toString();
	}

} //TypeMissionMeleeImpl
