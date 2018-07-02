/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDistanceVerticaleGeometrique;
import mpia.schema.TypeVolumeGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Volume Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeVolumeGeometriqueImpl#getAPourPlafondDistanceVerticaleGeometrique <em>APour Plafond Distance Verticale Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeGeometriqueImpl#getAPourPlancherDistanceVerticaleGeometrique <em>APour Plancher Distance Verticale Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeVolumeGeometriqueImpl extends EObjectImpl implements TypeVolumeGeometrique {
	/**
	 * The cached value of the '{@link #getAPourPlafondDistanceVerticaleGeometrique() <em>APour Plafond Distance Verticale Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPlafondDistanceVerticaleGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeDistanceVerticaleGeometrique aPourPlafondDistanceVerticaleGeometrique;

	/**
	 * The cached value of the '{@link #getAPourPlancherDistanceVerticaleGeometrique() <em>APour Plancher Distance Verticale Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPlancherDistanceVerticaleGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeDistanceVerticaleGeometrique aPourPlancherDistanceVerticaleGeometrique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVolumeGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeVolumeGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDistanceVerticaleGeometrique getAPourPlafondDistanceVerticaleGeometrique() {
		return aPourPlafondDistanceVerticaleGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPlafondDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique newAPourPlafondDistanceVerticaleGeometrique, NotificationChain msgs) {
		TypeDistanceVerticaleGeometrique oldAPourPlafondDistanceVerticaleGeometrique = aPourPlafondDistanceVerticaleGeometrique;
		aPourPlafondDistanceVerticaleGeometrique = newAPourPlafondDistanceVerticaleGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE, oldAPourPlafondDistanceVerticaleGeometrique, newAPourPlafondDistanceVerticaleGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPlafondDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique newAPourPlafondDistanceVerticaleGeometrique) {
		if (newAPourPlafondDistanceVerticaleGeometrique != aPourPlafondDistanceVerticaleGeometrique) {
			NotificationChain msgs = null;
			if (aPourPlafondDistanceVerticaleGeometrique != null)
				msgs = ((InternalEObject)aPourPlafondDistanceVerticaleGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE, null, msgs);
			if (newAPourPlafondDistanceVerticaleGeometrique != null)
				msgs = ((InternalEObject)newAPourPlafondDistanceVerticaleGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE, null, msgs);
			msgs = basicSetAPourPlafondDistanceVerticaleGeometrique(newAPourPlafondDistanceVerticaleGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE, newAPourPlafondDistanceVerticaleGeometrique, newAPourPlafondDistanceVerticaleGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDistanceVerticaleGeometrique getAPourPlancherDistanceVerticaleGeometrique() {
		return aPourPlancherDistanceVerticaleGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPlancherDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique newAPourPlancherDistanceVerticaleGeometrique, NotificationChain msgs) {
		TypeDistanceVerticaleGeometrique oldAPourPlancherDistanceVerticaleGeometrique = aPourPlancherDistanceVerticaleGeometrique;
		aPourPlancherDistanceVerticaleGeometrique = newAPourPlancherDistanceVerticaleGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE, oldAPourPlancherDistanceVerticaleGeometrique, newAPourPlancherDistanceVerticaleGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPlancherDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique newAPourPlancherDistanceVerticaleGeometrique) {
		if (newAPourPlancherDistanceVerticaleGeometrique != aPourPlancherDistanceVerticaleGeometrique) {
			NotificationChain msgs = null;
			if (aPourPlancherDistanceVerticaleGeometrique != null)
				msgs = ((InternalEObject)aPourPlancherDistanceVerticaleGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE, null, msgs);
			if (newAPourPlancherDistanceVerticaleGeometrique != null)
				msgs = ((InternalEObject)newAPourPlancherDistanceVerticaleGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE, null, msgs);
			msgs = basicSetAPourPlancherDistanceVerticaleGeometrique(newAPourPlancherDistanceVerticaleGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE, newAPourPlancherDistanceVerticaleGeometrique, newAPourPlancherDistanceVerticaleGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				return basicSetAPourPlafondDistanceVerticaleGeometrique(null, msgs);
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				return basicSetAPourPlancherDistanceVerticaleGeometrique(null, msgs);
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
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				return getAPourPlafondDistanceVerticaleGeometrique();
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				return getAPourPlancherDistanceVerticaleGeometrique();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				setAPourPlafondDistanceVerticaleGeometrique((TypeDistanceVerticaleGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				setAPourPlancherDistanceVerticaleGeometrique((TypeDistanceVerticaleGeometrique)newValue);
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
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				setAPourPlafondDistanceVerticaleGeometrique((TypeDistanceVerticaleGeometrique)null);
				return;
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				setAPourPlancherDistanceVerticaleGeometrique((TypeDistanceVerticaleGeometrique)null);
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
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				return aPourPlafondDistanceVerticaleGeometrique != null;
			case SchemaPackage.TYPE_VOLUME_GEOMETRIQUE__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				return aPourPlancherDistanceVerticaleGeometrique != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeVolumeGeometriqueImpl
