/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAzimut;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Azimut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAzimutImpl#getDirectionObservation <em>Direction Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAzimutImpl extends EObjectImpl implements TypeAzimut {
	/**
	 * The cached value of the '{@link #getDirectionObservation() <em>Direction Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionObservation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle directionObservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAzimutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAzimut();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDirectionObservation() {
		return directionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionObservation(TypeDataTypeAngle newDirectionObservation, NotificationChain msgs) {
		TypeDataTypeAngle oldDirectionObservation = directionObservation;
		directionObservation = newDirectionObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AZIMUT__DIRECTION_OBSERVATION, oldDirectionObservation, newDirectionObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionObservation(TypeDataTypeAngle newDirectionObservation) {
		if (newDirectionObservation != directionObservation) {
			NotificationChain msgs = null;
			if (directionObservation != null)
				msgs = ((InternalEObject)directionObservation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AZIMUT__DIRECTION_OBSERVATION, null, msgs);
			if (newDirectionObservation != null)
				msgs = ((InternalEObject)newDirectionObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AZIMUT__DIRECTION_OBSERVATION, null, msgs);
			msgs = basicSetDirectionObservation(newDirectionObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AZIMUT__DIRECTION_OBSERVATION, newDirectionObservation, newDirectionObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AZIMUT__DIRECTION_OBSERVATION:
				return basicSetDirectionObservation(null, msgs);
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
			case SchemaPackage.TYPE_AZIMUT__DIRECTION_OBSERVATION:
				return getDirectionObservation();
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
			case SchemaPackage.TYPE_AZIMUT__DIRECTION_OBSERVATION:
				setDirectionObservation((TypeDataTypeAngle)newValue);
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
			case SchemaPackage.TYPE_AZIMUT__DIRECTION_OBSERVATION:
				setDirectionObservation((TypeDataTypeAngle)null);
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
			case SchemaPackage.TYPE_AZIMUT__DIRECTION_OBSERVATION:
				return directionObservation != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAzimutImpl
