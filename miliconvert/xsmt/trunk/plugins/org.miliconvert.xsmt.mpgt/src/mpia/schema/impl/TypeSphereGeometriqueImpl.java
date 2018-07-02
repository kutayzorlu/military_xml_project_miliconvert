/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCercleGeometrique;
import mpia.schema.TypeSphereGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Sphere Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSphereGeometriqueImpl#getAPourCercleReferenceCercleGeometrique <em>APour Cercle Reference Cercle Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSphereGeometriqueImpl extends TypeVolumeGeometriqueImpl implements TypeSphereGeometrique {
	/**
	 * The cached value of the '{@link #getAPourCercleReferenceCercleGeometrique() <em>APour Cercle Reference Cercle Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCercleReferenceCercleGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeCercleGeometrique aPourCercleReferenceCercleGeometrique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSphereGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSphereGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCercleGeometrique getAPourCercleReferenceCercleGeometrique() {
		return aPourCercleReferenceCercleGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCercleReferenceCercleGeometrique(TypeCercleGeometrique newAPourCercleReferenceCercleGeometrique, NotificationChain msgs) {
		TypeCercleGeometrique oldAPourCercleReferenceCercleGeometrique = aPourCercleReferenceCercleGeometrique;
		aPourCercleReferenceCercleGeometrique = newAPourCercleReferenceCercleGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SPHERE_GEOMETRIQUE__APOUR_CERCLE_REFERENCE_CERCLE_GEOMETRIQUE, oldAPourCercleReferenceCercleGeometrique, newAPourCercleReferenceCercleGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCercleReferenceCercleGeometrique(TypeCercleGeometrique newAPourCercleReferenceCercleGeometrique) {
		if (newAPourCercleReferenceCercleGeometrique != aPourCercleReferenceCercleGeometrique) {
			NotificationChain msgs = null;
			if (aPourCercleReferenceCercleGeometrique != null)
				msgs = ((InternalEObject)aPourCercleReferenceCercleGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SPHERE_GEOMETRIQUE__APOUR_CERCLE_REFERENCE_CERCLE_GEOMETRIQUE, null, msgs);
			if (newAPourCercleReferenceCercleGeometrique != null)
				msgs = ((InternalEObject)newAPourCercleReferenceCercleGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SPHERE_GEOMETRIQUE__APOUR_CERCLE_REFERENCE_CERCLE_GEOMETRIQUE, null, msgs);
			msgs = basicSetAPourCercleReferenceCercleGeometrique(newAPourCercleReferenceCercleGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SPHERE_GEOMETRIQUE__APOUR_CERCLE_REFERENCE_CERCLE_GEOMETRIQUE, newAPourCercleReferenceCercleGeometrique, newAPourCercleReferenceCercleGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SPHERE_GEOMETRIQUE__APOUR_CERCLE_REFERENCE_CERCLE_GEOMETRIQUE:
				return basicSetAPourCercleReferenceCercleGeometrique(null, msgs);
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
			case SchemaPackage.TYPE_SPHERE_GEOMETRIQUE__APOUR_CERCLE_REFERENCE_CERCLE_GEOMETRIQUE:
				return getAPourCercleReferenceCercleGeometrique();
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
			case SchemaPackage.TYPE_SPHERE_GEOMETRIQUE__APOUR_CERCLE_REFERENCE_CERCLE_GEOMETRIQUE:
				setAPourCercleReferenceCercleGeometrique((TypeCercleGeometrique)newValue);
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
			case SchemaPackage.TYPE_SPHERE_GEOMETRIQUE__APOUR_CERCLE_REFERENCE_CERCLE_GEOMETRIQUE:
				setAPourCercleReferenceCercleGeometrique((TypeCercleGeometrique)null);
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
			case SchemaPackage.TYPE_SPHERE_GEOMETRIQUE__APOUR_CERCLE_REFERENCE_CERCLE_GEOMETRIQUE:
				return aPourCercleReferenceCercleGeometrique != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeSphereGeometriqueImpl
