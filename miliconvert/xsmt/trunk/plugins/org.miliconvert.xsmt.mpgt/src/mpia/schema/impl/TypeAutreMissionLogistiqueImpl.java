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
import mpia.schema.TypeAutreMissionLogistique;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Mission Logistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreMissionLogistiqueImpl#getEstObjetAssociationUniteAutreMissionLog <em>Est Objet Association Unite Autre Mission Log</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreMissionLogistiqueImpl extends TypeMissionLogistiqueImpl implements TypeAutreMissionLogistique {
	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteAutreMissionLog() <em>Est Objet Association Unite Autre Mission Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteAutreMissionLog()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteAutreMissionLog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreMissionLogistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreMissionLogistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteAutreMissionLog() {
		if (estObjetAssociationUniteAutreMissionLog == null) {
			estObjetAssociationUniteAutreMissionLog = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AUTRE_MISSION_LOGISTIQUE__EST_OBJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG);
		}
		return estObjetAssociationUniteAutreMissionLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_MISSION_LOGISTIQUE__EST_OBJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				return ((InternalEList<?>)getEstObjetAssociationUniteAutreMissionLog()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_AUTRE_MISSION_LOGISTIQUE__EST_OBJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				return getEstObjetAssociationUniteAutreMissionLog();
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
			case SchemaPackage.TYPE_AUTRE_MISSION_LOGISTIQUE__EST_OBJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				getEstObjetAssociationUniteAutreMissionLog().clear();
				getEstObjetAssociationUniteAutreMissionLog().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_AUTRE_MISSION_LOGISTIQUE__EST_OBJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				getEstObjetAssociationUniteAutreMissionLog().clear();
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
			case SchemaPackage.TYPE_AUTRE_MISSION_LOGISTIQUE__EST_OBJET_ASSOCIATION_UNITE_AUTRE_MISSION_LOG:
				return estObjetAssociationUniteAutreMissionLog != null && !estObjetAssociationUniteAutreMissionLog.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeAutreMissionLogistiqueImpl
