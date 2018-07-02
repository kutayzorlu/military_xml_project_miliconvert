/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePlanParticulier;
import mpia.schema.TypeTravailGenie;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Plan Particulier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanParticulierImpl#getEstComposeTravailGenie <em>Est Compose Travail Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanParticulierImpl#getAPourDesignationAutoriteQualifieUnite <em>APour Designation Autorite Qualifie Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlanParticulierImpl extends EObjectImpl implements TypePlanParticulier {
	/**
	 * The cached value of the '{@link #getEstComposeTravailGenie() <em>Est Compose Travail Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstComposeTravailGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTravailGenie> estComposeTravailGenie;

	/**
	 * The cached value of the '{@link #getAPourDesignationAutoriteQualifieUnite() <em>APour Designation Autorite Qualifie Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDesignationAutoriteQualifieUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourDesignationAutoriteQualifieUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanParticulierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanParticulier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTravailGenie> getEstComposeTravailGenie() {
		if (estComposeTravailGenie == null) {
			estComposeTravailGenie = new EObjectContainmentEList<TypeTravailGenie>(TypeTravailGenie.class, this, SchemaPackage.TYPE_PLAN_PARTICULIER__EST_COMPOSE_TRAVAIL_GENIE);
		}
		return estComposeTravailGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourDesignationAutoriteQualifieUnite() {
		if (aPourDesignationAutoriteQualifieUnite == null) {
			aPourDesignationAutoriteQualifieUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_PLAN_PARTICULIER__APOUR_DESIGNATION_AUTORITE_QUALIFIE_UNITE);
		}
		return aPourDesignationAutoriteQualifieUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLAN_PARTICULIER__EST_COMPOSE_TRAVAIL_GENIE:
				return ((InternalEList<?>)getEstComposeTravailGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_PARTICULIER__APOUR_DESIGNATION_AUTORITE_QUALIFIE_UNITE:
				return ((InternalEList<?>)getAPourDesignationAutoriteQualifieUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PLAN_PARTICULIER__EST_COMPOSE_TRAVAIL_GENIE:
				return getEstComposeTravailGenie();
			case SchemaPackage.TYPE_PLAN_PARTICULIER__APOUR_DESIGNATION_AUTORITE_QUALIFIE_UNITE:
				return getAPourDesignationAutoriteQualifieUnite();
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
			case SchemaPackage.TYPE_PLAN_PARTICULIER__EST_COMPOSE_TRAVAIL_GENIE:
				getEstComposeTravailGenie().clear();
				getEstComposeTravailGenie().addAll((Collection<? extends TypeTravailGenie>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_PARTICULIER__APOUR_DESIGNATION_AUTORITE_QUALIFIE_UNITE:
				getAPourDesignationAutoriteQualifieUnite().clear();
				getAPourDesignationAutoriteQualifieUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_PLAN_PARTICULIER__EST_COMPOSE_TRAVAIL_GENIE:
				getEstComposeTravailGenie().clear();
				return;
			case SchemaPackage.TYPE_PLAN_PARTICULIER__APOUR_DESIGNATION_AUTORITE_QUALIFIE_UNITE:
				getAPourDesignationAutoriteQualifieUnite().clear();
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
			case SchemaPackage.TYPE_PLAN_PARTICULIER__EST_COMPOSE_TRAVAIL_GENIE:
				return estComposeTravailGenie != null && !estComposeTravailGenie.isEmpty();
			case SchemaPackage.TYPE_PLAN_PARTICULIER__APOUR_DESIGNATION_AUTORITE_QUALIFIE_UNITE:
				return aPourDesignationAutoriteQualifieUnite != null && !aPourDesignationAutoriteQualifieUnite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypePlanParticulierImpl
