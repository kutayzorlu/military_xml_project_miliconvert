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
import mpia.schema.TypePlanTraitementObjectifs;

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
 * An implementation of the model object '<em><b>Type Plan Traitement Objectifs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanTraitementObjectifsImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanTraitementObjectifsImpl#getAPourInterventionGeneraleInterventionGenerale <em>APour Intervention Generale Intervention Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanTraitementObjectifsImpl#getEstObjetAssociationMissionRensObjPlanTraitementObj <em>Est Objet Association Mission Rens Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanTraitementObjectifsImpl#getEstObjetAssociationTraitementObjPlanTraitementObj <em>Est Objet Association Traitement Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanTraitementObjectifsImpl#getEstSujetAssociationPlanTraitementObjTraitementObj <em>Est Sujet Association Plan Traitement Obj Traitement Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlanTraitementObjectifsImpl extends TypeActiviteImpl implements TypePlanTraitementObjectifs {
	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourInterventionGeneraleInterventionGenerale() <em>APour Intervention Generale Intervention Generale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourInterventionGeneraleInterventionGenerale()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourInterventionGeneraleInterventionGenerale;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMissionRensObjPlanTraitementObj() <em>Est Objet Association Mission Rens Obj Plan Traitement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMissionRensObjPlanTraitementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMissionRensObjPlanTraitementObj;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationTraitementObjPlanTraitementObj() <em>Est Objet Association Traitement Obj Plan Traitement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationTraitementObjPlanTraitementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationTraitementObjPlanTraitementObj;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPlanTraitementObjTraitementObj() <em>Est Sujet Association Plan Traitement Obj Traitement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPlanTraitementObjTraitementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPlanTraitementObjTraitementObj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanTraitementObjectifsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanTraitementObjectifs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(XMLGregorianCalendar newDateDebut) {
		XMLGregorianCalendar oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourInterventionGeneraleInterventionGenerale() {
		if (aPourInterventionGeneraleInterventionGenerale == null) {
			aPourInterventionGeneraleInterventionGenerale = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE);
		}
		return aPourInterventionGeneraleInterventionGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMissionRensObjPlanTraitementObj() {
		if (estObjetAssociationMissionRensObjPlanTraitementObj == null) {
			estObjetAssociationMissionRensObjPlanTraitementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ);
		}
		return estObjetAssociationMissionRensObjPlanTraitementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationTraitementObjPlanTraitementObj() {
		if (estObjetAssociationTraitementObjPlanTraitementObj == null) {
			estObjetAssociationTraitementObjPlanTraitementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ);
		}
		return estObjetAssociationTraitementObjPlanTraitementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPlanTraitementObjTraitementObj() {
		if (estSujetAssociationPlanTraitementObjTraitementObj == null) {
			estSujetAssociationPlanTraitementObjTraitementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_SUJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ);
		}
		return estSujetAssociationPlanTraitementObjTraitementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				return ((InternalEList<?>)getAPourInterventionGeneraleInterventionGenerale()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getEstObjetAssociationMissionRensObjPlanTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getEstObjetAssociationTraitementObjPlanTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_SUJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getEstSujetAssociationPlanTraitementObjTraitementObj()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				return getAPourInterventionGeneraleInterventionGenerale();
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				return getEstObjetAssociationMissionRensObjPlanTraitementObj();
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				return getEstObjetAssociationTraitementObjPlanTraitementObj();
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_SUJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				return getEstSujetAssociationPlanTraitementObjTraitementObj();
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
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				getAPourInterventionGeneraleInterventionGenerale().clear();
				getAPourInterventionGeneraleInterventionGenerale().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				getEstObjetAssociationMissionRensObjPlanTraitementObj().clear();
				getEstObjetAssociationMissionRensObjPlanTraitementObj().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				getEstObjetAssociationTraitementObjPlanTraitementObj().clear();
				getEstObjetAssociationTraitementObjPlanTraitementObj().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_SUJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				getEstSujetAssociationPlanTraitementObjTraitementObj().clear();
				getEstSujetAssociationPlanTraitementObjTraitementObj().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				getAPourInterventionGeneraleInterventionGenerale().clear();
				return;
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				getEstObjetAssociationMissionRensObjPlanTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				getEstObjetAssociationTraitementObjPlanTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_SUJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				getEstSujetAssociationPlanTraitementObjTraitementObj().clear();
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
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				return aPourInterventionGeneraleInterventionGenerale != null && !aPourInterventionGeneraleInterventionGenerale.isEmpty();
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				return estObjetAssociationMissionRensObjPlanTraitementObj != null && !estObjetAssociationMissionRensObjPlanTraitementObj.isEmpty();
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_OBJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				return estObjetAssociationTraitementObjPlanTraitementObj != null && !estObjetAssociationTraitementObjPlanTraitementObj.isEmpty();
			case SchemaPackage.TYPE_PLAN_TRAITEMENT_OBJECTIFS__EST_SUJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				return estSujetAssociationPlanTraitementObjTraitementObj != null && !estSujetAssociationPlanTraitementObjTraitementObj.isEmpty();
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
		result.append(" (dateDebut: ");
		result.append(dateDebut);
		result.append(')');
		return result.toString();
	}

} //TypePlanTraitementObjectifsImpl
