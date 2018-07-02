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
import mpia.schema.TypeHypotheseActionENIouAutre;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Hypothese Action EN Iou Autre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeHypotheseActionENIouAutreImpl#getComporteAction <em>Comporte Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeHypotheseActionENIouAutreImpl extends TypeRacineOperationnelleImpl implements TypeHypotheseActionENIouAutre {
	/**
	 * The cached value of the '{@link #getComporteAction() <em>Comporte Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComporteAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> comporteAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeHypotheseActionENIouAutreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeHypotheseActionENIouAutre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getComporteAction() {
		if (comporteAction == null) {
			comporteAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_HYPOTHESE_ACTION_EN_IOU_AUTRE__COMPORTE_ACTION);
		}
		return comporteAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_HYPOTHESE_ACTION_EN_IOU_AUTRE__COMPORTE_ACTION:
				return ((InternalEList<?>)getComporteAction()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_HYPOTHESE_ACTION_EN_IOU_AUTRE__COMPORTE_ACTION:
				return getComporteAction();
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
			case SchemaPackage.TYPE_HYPOTHESE_ACTION_EN_IOU_AUTRE__COMPORTE_ACTION:
				getComporteAction().clear();
				getComporteAction().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_HYPOTHESE_ACTION_EN_IOU_AUTRE__COMPORTE_ACTION:
				getComporteAction().clear();
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
			case SchemaPackage.TYPE_HYPOTHESE_ACTION_EN_IOU_AUTRE__COMPORTE_ACTION:
				return comporteAction != null && !comporteAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeHypotheseActionENIouAutreImpl
