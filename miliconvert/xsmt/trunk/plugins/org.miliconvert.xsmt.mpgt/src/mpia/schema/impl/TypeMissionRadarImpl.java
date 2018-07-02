/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMissionRadar;
import mpia.schema.TypePointGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission Radar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionRadarImpl#getDirectionObservationPointGeometrique <em>Direction Observation Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRadarImpl#getPointDirectionMissionPointGeometrique <em>Point Direction Mission Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRadarImpl#getOrigineSecteurPointGeometrique <em>Origine Secteur Point Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionRadarImpl extends EObjectImpl implements TypeMissionRadar {
	/**
	 * The cached value of the '{@link #getDirectionObservationPointGeometrique() <em>Direction Observation Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionObservationPointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique directionObservationPointGeometrique;

	/**
	 * The cached value of the '{@link #getPointDirectionMissionPointGeometrique() <em>Point Direction Mission Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointDirectionMissionPointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique pointDirectionMissionPointGeometrique;

	/**
	 * The cached value of the '{@link #getOrigineSecteurPointGeometrique() <em>Origine Secteur Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigineSecteurPointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique origineSecteurPointGeometrique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionRadarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionRadar();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointGeometrique getDirectionObservationPointGeometrique() {
		return directionObservationPointGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionObservationPointGeometrique(TypePointGeometrique newDirectionObservationPointGeometrique, NotificationChain msgs) {
		TypePointGeometrique oldDirectionObservationPointGeometrique = directionObservationPointGeometrique;
		directionObservationPointGeometrique = newDirectionObservationPointGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RADAR__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE, oldDirectionObservationPointGeometrique, newDirectionObservationPointGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionObservationPointGeometrique(TypePointGeometrique newDirectionObservationPointGeometrique) {
		if (newDirectionObservationPointGeometrique != directionObservationPointGeometrique) {
			NotificationChain msgs = null;
			if (directionObservationPointGeometrique != null)
				msgs = ((InternalEObject)directionObservationPointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RADAR__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE, null, msgs);
			if (newDirectionObservationPointGeometrique != null)
				msgs = ((InternalEObject)newDirectionObservationPointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RADAR__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetDirectionObservationPointGeometrique(newDirectionObservationPointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RADAR__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE, newDirectionObservationPointGeometrique, newDirectionObservationPointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointGeometrique getPointDirectionMissionPointGeometrique() {
		return pointDirectionMissionPointGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointDirectionMissionPointGeometrique(TypePointGeometrique newPointDirectionMissionPointGeometrique, NotificationChain msgs) {
		TypePointGeometrique oldPointDirectionMissionPointGeometrique = pointDirectionMissionPointGeometrique;
		pointDirectionMissionPointGeometrique = newPointDirectionMissionPointGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RADAR__POINT_DIRECTION_MISSION_POINT_GEOMETRIQUE, oldPointDirectionMissionPointGeometrique, newPointDirectionMissionPointGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointDirectionMissionPointGeometrique(TypePointGeometrique newPointDirectionMissionPointGeometrique) {
		if (newPointDirectionMissionPointGeometrique != pointDirectionMissionPointGeometrique) {
			NotificationChain msgs = null;
			if (pointDirectionMissionPointGeometrique != null)
				msgs = ((InternalEObject)pointDirectionMissionPointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RADAR__POINT_DIRECTION_MISSION_POINT_GEOMETRIQUE, null, msgs);
			if (newPointDirectionMissionPointGeometrique != null)
				msgs = ((InternalEObject)newPointDirectionMissionPointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RADAR__POINT_DIRECTION_MISSION_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetPointDirectionMissionPointGeometrique(newPointDirectionMissionPointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RADAR__POINT_DIRECTION_MISSION_POINT_GEOMETRIQUE, newPointDirectionMissionPointGeometrique, newPointDirectionMissionPointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointGeometrique getOrigineSecteurPointGeometrique() {
		return origineSecteurPointGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigineSecteurPointGeometrique(TypePointGeometrique newOrigineSecteurPointGeometrique, NotificationChain msgs) {
		TypePointGeometrique oldOrigineSecteurPointGeometrique = origineSecteurPointGeometrique;
		origineSecteurPointGeometrique = newOrigineSecteurPointGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RADAR__ORIGINE_SECTEUR_POINT_GEOMETRIQUE, oldOrigineSecteurPointGeometrique, newOrigineSecteurPointGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigineSecteurPointGeometrique(TypePointGeometrique newOrigineSecteurPointGeometrique) {
		if (newOrigineSecteurPointGeometrique != origineSecteurPointGeometrique) {
			NotificationChain msgs = null;
			if (origineSecteurPointGeometrique != null)
				msgs = ((InternalEObject)origineSecteurPointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RADAR__ORIGINE_SECTEUR_POINT_GEOMETRIQUE, null, msgs);
			if (newOrigineSecteurPointGeometrique != null)
				msgs = ((InternalEObject)newOrigineSecteurPointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RADAR__ORIGINE_SECTEUR_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetOrigineSecteurPointGeometrique(newOrigineSecteurPointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RADAR__ORIGINE_SECTEUR_POINT_GEOMETRIQUE, newOrigineSecteurPointGeometrique, newOrigineSecteurPointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_RADAR__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				return basicSetDirectionObservationPointGeometrique(null, msgs);
			case SchemaPackage.TYPE_MISSION_RADAR__POINT_DIRECTION_MISSION_POINT_GEOMETRIQUE:
				return basicSetPointDirectionMissionPointGeometrique(null, msgs);
			case SchemaPackage.TYPE_MISSION_RADAR__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				return basicSetOrigineSecteurPointGeometrique(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_RADAR__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				return getDirectionObservationPointGeometrique();
			case SchemaPackage.TYPE_MISSION_RADAR__POINT_DIRECTION_MISSION_POINT_GEOMETRIQUE:
				return getPointDirectionMissionPointGeometrique();
			case SchemaPackage.TYPE_MISSION_RADAR__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				return getOrigineSecteurPointGeometrique();
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
			case SchemaPackage.TYPE_MISSION_RADAR__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				setDirectionObservationPointGeometrique((TypePointGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RADAR__POINT_DIRECTION_MISSION_POINT_GEOMETRIQUE:
				setPointDirectionMissionPointGeometrique((TypePointGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RADAR__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				setOrigineSecteurPointGeometrique((TypePointGeometrique)newValue);
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
			case SchemaPackage.TYPE_MISSION_RADAR__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				setDirectionObservationPointGeometrique((TypePointGeometrique)null);
				return;
			case SchemaPackage.TYPE_MISSION_RADAR__POINT_DIRECTION_MISSION_POINT_GEOMETRIQUE:
				setPointDirectionMissionPointGeometrique((TypePointGeometrique)null);
				return;
			case SchemaPackage.TYPE_MISSION_RADAR__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				setOrigineSecteurPointGeometrique((TypePointGeometrique)null);
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
			case SchemaPackage.TYPE_MISSION_RADAR__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				return directionObservationPointGeometrique != null;
			case SchemaPackage.TYPE_MISSION_RADAR__POINT_DIRECTION_MISSION_POINT_GEOMETRIQUE:
				return pointDirectionMissionPointGeometrique != null;
			case SchemaPackage.TYPE_MISSION_RADAR__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				return origineSecteurPointGeometrique != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeMissionRadarImpl
