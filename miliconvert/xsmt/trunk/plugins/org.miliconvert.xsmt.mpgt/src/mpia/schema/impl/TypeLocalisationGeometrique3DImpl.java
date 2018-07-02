/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLocalisationGeometrique3D;
import mpia.schema.TypeVolumeGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Localisation Geometrique3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLocalisationGeometrique3DImpl#getAPourVolumeGeometriqueVolumeGeometrique <em>APour Volume Geometrique Volume Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLocalisationGeometrique3DImpl extends TypeLocalisationGeometriqueImpl implements TypeLocalisationGeometrique3D {
	/**
	 * The cached value of the '{@link #getAPourVolumeGeometriqueVolumeGeometrique() <em>APour Volume Geometrique Volume Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVolumeGeometriqueVolumeGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeVolumeGeometrique aPourVolumeGeometriqueVolumeGeometrique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLocalisationGeometrique3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLocalisationGeometrique3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVolumeGeometrique getAPourVolumeGeometriqueVolumeGeometrique() {
		return aPourVolumeGeometriqueVolumeGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourVolumeGeometriqueVolumeGeometrique(TypeVolumeGeometrique newAPourVolumeGeometriqueVolumeGeometrique, NotificationChain msgs) {
		TypeVolumeGeometrique oldAPourVolumeGeometriqueVolumeGeometrique = aPourVolumeGeometriqueVolumeGeometrique;
		aPourVolumeGeometriqueVolumeGeometrique = newAPourVolumeGeometriqueVolumeGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D__APOUR_VOLUME_GEOMETRIQUE_VOLUME_GEOMETRIQUE, oldAPourVolumeGeometriqueVolumeGeometrique, newAPourVolumeGeometriqueVolumeGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourVolumeGeometriqueVolumeGeometrique(TypeVolumeGeometrique newAPourVolumeGeometriqueVolumeGeometrique) {
		if (newAPourVolumeGeometriqueVolumeGeometrique != aPourVolumeGeometriqueVolumeGeometrique) {
			NotificationChain msgs = null;
			if (aPourVolumeGeometriqueVolumeGeometrique != null)
				msgs = ((InternalEObject)aPourVolumeGeometriqueVolumeGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D__APOUR_VOLUME_GEOMETRIQUE_VOLUME_GEOMETRIQUE, null, msgs);
			if (newAPourVolumeGeometriqueVolumeGeometrique != null)
				msgs = ((InternalEObject)newAPourVolumeGeometriqueVolumeGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D__APOUR_VOLUME_GEOMETRIQUE_VOLUME_GEOMETRIQUE, null, msgs);
			msgs = basicSetAPourVolumeGeometriqueVolumeGeometrique(newAPourVolumeGeometriqueVolumeGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D__APOUR_VOLUME_GEOMETRIQUE_VOLUME_GEOMETRIQUE, newAPourVolumeGeometriqueVolumeGeometrique, newAPourVolumeGeometriqueVolumeGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D__APOUR_VOLUME_GEOMETRIQUE_VOLUME_GEOMETRIQUE:
				return basicSetAPourVolumeGeometriqueVolumeGeometrique(null, msgs);
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
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D__APOUR_VOLUME_GEOMETRIQUE_VOLUME_GEOMETRIQUE:
				return getAPourVolumeGeometriqueVolumeGeometrique();
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
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D__APOUR_VOLUME_GEOMETRIQUE_VOLUME_GEOMETRIQUE:
				setAPourVolumeGeometriqueVolumeGeometrique((TypeVolumeGeometrique)newValue);
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
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D__APOUR_VOLUME_GEOMETRIQUE_VOLUME_GEOMETRIQUE:
				setAPourVolumeGeometriqueVolumeGeometrique((TypeVolumeGeometrique)null);
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
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE3_D__APOUR_VOLUME_GEOMETRIQUE_VOLUME_GEOMETRIQUE:
				return aPourVolumeGeometriqueVolumeGeometrique != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeLocalisationGeometrique3DImpl
