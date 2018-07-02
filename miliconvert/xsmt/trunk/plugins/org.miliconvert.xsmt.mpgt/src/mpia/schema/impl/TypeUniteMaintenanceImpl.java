/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEquipesReparation;
import mpia.schema.TypeMoyensEvacuation;
import mpia.schema.TypeUniteMaintenance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Unite Maintenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUniteMaintenanceImpl#getDateSyntheseMaintenance <em>Date Synthese Maintenance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteMaintenanceImpl#getAPourEvaluationEquipesReparationEquipesReparation <em>APour Evaluation Equipes Reparation Equipes Reparation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteMaintenanceImpl#getAPourEvaluationMoyensEvacuationMoyensEvacuation <em>APour Evaluation Moyens Evacuation Moyens Evacuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUniteMaintenanceImpl extends EObjectImpl implements TypeUniteMaintenance {
	/**
	 * The default value of the '{@link #getDateSyntheseMaintenance() <em>Date Synthese Maintenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSyntheseMaintenance()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_SYNTHESE_MAINTENANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateSyntheseMaintenance() <em>Date Synthese Maintenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSyntheseMaintenance()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateSyntheseMaintenance = DATE_SYNTHESE_MAINTENANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourEvaluationEquipesReparationEquipesReparation() <em>APour Evaluation Equipes Reparation Equipes Reparation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEvaluationEquipesReparationEquipesReparation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEquipesReparation> aPourEvaluationEquipesReparationEquipesReparation;

	/**
	 * The cached value of the '{@link #getAPourEvaluationMoyensEvacuationMoyensEvacuation() <em>APour Evaluation Moyens Evacuation Moyens Evacuation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEvaluationMoyensEvacuationMoyensEvacuation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyensEvacuation> aPourEvaluationMoyensEvacuationMoyensEvacuation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUniteMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUniteMaintenance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateSyntheseMaintenance() {
		return dateSyntheseMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSyntheseMaintenance(XMLGregorianCalendar newDateSyntheseMaintenance) {
		XMLGregorianCalendar oldDateSyntheseMaintenance = dateSyntheseMaintenance;
		dateSyntheseMaintenance = newDateSyntheseMaintenance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_MAINTENANCE__DATE_SYNTHESE_MAINTENANCE, oldDateSyntheseMaintenance, dateSyntheseMaintenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEquipesReparation> getAPourEvaluationEquipesReparationEquipesReparation() {
		if (aPourEvaluationEquipesReparationEquipesReparation == null) {
			aPourEvaluationEquipesReparationEquipesReparation = new EObjectContainmentEList<TypeEquipesReparation>(TypeEquipesReparation.class, this, SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_EQUIPES_REPARATION_EQUIPES_REPARATION);
		}
		return aPourEvaluationEquipesReparationEquipesReparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensEvacuation> getAPourEvaluationMoyensEvacuationMoyensEvacuation() {
		if (aPourEvaluationMoyensEvacuationMoyensEvacuation == null) {
			aPourEvaluationMoyensEvacuationMoyensEvacuation = new EObjectContainmentEList<TypeMoyensEvacuation>(TypeMoyensEvacuation.class, this, SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_MOYENS_EVACUATION_MOYENS_EVACUATION);
		}
		return aPourEvaluationMoyensEvacuationMoyensEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_EQUIPES_REPARATION_EQUIPES_REPARATION:
				return ((InternalEList<?>)getAPourEvaluationEquipesReparationEquipesReparation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_MOYENS_EVACUATION_MOYENS_EVACUATION:
				return ((InternalEList<?>)getAPourEvaluationMoyensEvacuationMoyensEvacuation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__DATE_SYNTHESE_MAINTENANCE:
				return getDateSyntheseMaintenance();
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_EQUIPES_REPARATION_EQUIPES_REPARATION:
				return getAPourEvaluationEquipesReparationEquipesReparation();
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_MOYENS_EVACUATION_MOYENS_EVACUATION:
				return getAPourEvaluationMoyensEvacuationMoyensEvacuation();
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
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__DATE_SYNTHESE_MAINTENANCE:
				setDateSyntheseMaintenance((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_EQUIPES_REPARATION_EQUIPES_REPARATION:
				getAPourEvaluationEquipesReparationEquipesReparation().clear();
				getAPourEvaluationEquipesReparationEquipesReparation().addAll((Collection<? extends TypeEquipesReparation>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_MOYENS_EVACUATION_MOYENS_EVACUATION:
				getAPourEvaluationMoyensEvacuationMoyensEvacuation().clear();
				getAPourEvaluationMoyensEvacuationMoyensEvacuation().addAll((Collection<? extends TypeMoyensEvacuation>)newValue);
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
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__DATE_SYNTHESE_MAINTENANCE:
				setDateSyntheseMaintenance(DATE_SYNTHESE_MAINTENANCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_EQUIPES_REPARATION_EQUIPES_REPARATION:
				getAPourEvaluationEquipesReparationEquipesReparation().clear();
				return;
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_MOYENS_EVACUATION_MOYENS_EVACUATION:
				getAPourEvaluationMoyensEvacuationMoyensEvacuation().clear();
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
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__DATE_SYNTHESE_MAINTENANCE:
				return DATE_SYNTHESE_MAINTENANCE_EDEFAULT == null ? dateSyntheseMaintenance != null : !DATE_SYNTHESE_MAINTENANCE_EDEFAULT.equals(dateSyntheseMaintenance);
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_EQUIPES_REPARATION_EQUIPES_REPARATION:
				return aPourEvaluationEquipesReparationEquipesReparation != null && !aPourEvaluationEquipesReparationEquipesReparation.isEmpty();
			case SchemaPackage.TYPE_UNITE_MAINTENANCE__APOUR_EVALUATION_MOYENS_EVACUATION_MOYENS_EVACUATION:
				return aPourEvaluationMoyensEvacuationMoyensEvacuation != null && !aPourEvaluationMoyensEvacuationMoyensEvacuation.isEmpty();
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
		result.append(" (dateSyntheseMaintenance: ");
		result.append(dateSyntheseMaintenance);
		result.append(')');
		return result.toString();
	}

} //TypeUniteMaintenanceImpl
