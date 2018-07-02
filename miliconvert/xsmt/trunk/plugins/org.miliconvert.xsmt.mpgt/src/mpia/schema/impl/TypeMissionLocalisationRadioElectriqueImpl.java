/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMissionLocalisationRadioElectrique;
import mpia.schema.TypePointGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission Localisation Radio Electrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionLocalisationRadioElectriqueImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionLocalisationRadioElectriqueImpl#getPointLateralDroitPointGeometrique <em>Point Lateral Droit Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionLocalisationRadioElectriqueImpl#getCentreGraviteZoneUtilePointGeometrique <em>Centre Gravite Zone Utile Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionLocalisationRadioElectriqueImpl#getPointStationPrincipalePointGeometrique <em>Point Station Principale Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionLocalisationRadioElectriqueImpl#getPointLateralGauchePointGeometrique <em>Point Lateral Gauche Point Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionLocalisationRadioElectriqueImpl extends EObjectImpl implements TypeMissionLocalisationRadioElectrique {
	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * This is true if the Distance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distanceESet;

	/**
	 * The cached value of the '{@link #getPointLateralDroitPointGeometrique() <em>Point Lateral Droit Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointLateralDroitPointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique pointLateralDroitPointGeometrique;

	/**
	 * The cached value of the '{@link #getCentreGraviteZoneUtilePointGeometrique() <em>Centre Gravite Zone Utile Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreGraviteZoneUtilePointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique centreGraviteZoneUtilePointGeometrique;

	/**
	 * The cached value of the '{@link #getPointStationPrincipalePointGeometrique() <em>Point Station Principale Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointStationPrincipalePointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique pointStationPrincipalePointGeometrique;

	/**
	 * The cached value of the '{@link #getPointLateralGauchePointGeometrique() <em>Point Lateral Gauche Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointLateralGauchePointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique pointLateralGauchePointGeometrique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionLocalisationRadioElectriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionLocalisationRadioElectrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		boolean oldDistanceESet = distanceESet;
		distanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__DISTANCE, oldDistance, distance, !oldDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistance() {
		double oldDistance = distance;
		boolean oldDistanceESet = distanceESet;
		distance = DISTANCE_EDEFAULT;
		distanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__DISTANCE, oldDistance, DISTANCE_EDEFAULT, oldDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistance() {
		return distanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointGeometrique getPointLateralDroitPointGeometrique() {
		return pointLateralDroitPointGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointLateralDroitPointGeometrique(TypePointGeometrique newPointLateralDroitPointGeometrique, NotificationChain msgs) {
		TypePointGeometrique oldPointLateralDroitPointGeometrique = pointLateralDroitPointGeometrique;
		pointLateralDroitPointGeometrique = newPointLateralDroitPointGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_DROIT_POINT_GEOMETRIQUE, oldPointLateralDroitPointGeometrique, newPointLateralDroitPointGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointLateralDroitPointGeometrique(TypePointGeometrique newPointLateralDroitPointGeometrique) {
		if (newPointLateralDroitPointGeometrique != pointLateralDroitPointGeometrique) {
			NotificationChain msgs = null;
			if (pointLateralDroitPointGeometrique != null)
				msgs = ((InternalEObject)pointLateralDroitPointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_DROIT_POINT_GEOMETRIQUE, null, msgs);
			if (newPointLateralDroitPointGeometrique != null)
				msgs = ((InternalEObject)newPointLateralDroitPointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_DROIT_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetPointLateralDroitPointGeometrique(newPointLateralDroitPointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_DROIT_POINT_GEOMETRIQUE, newPointLateralDroitPointGeometrique, newPointLateralDroitPointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointGeometrique getCentreGraviteZoneUtilePointGeometrique() {
		return centreGraviteZoneUtilePointGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCentreGraviteZoneUtilePointGeometrique(TypePointGeometrique newCentreGraviteZoneUtilePointGeometrique, NotificationChain msgs) {
		TypePointGeometrique oldCentreGraviteZoneUtilePointGeometrique = centreGraviteZoneUtilePointGeometrique;
		centreGraviteZoneUtilePointGeometrique = newCentreGraviteZoneUtilePointGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__CENTRE_GRAVITE_ZONE_UTILE_POINT_GEOMETRIQUE, oldCentreGraviteZoneUtilePointGeometrique, newCentreGraviteZoneUtilePointGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreGraviteZoneUtilePointGeometrique(TypePointGeometrique newCentreGraviteZoneUtilePointGeometrique) {
		if (newCentreGraviteZoneUtilePointGeometrique != centreGraviteZoneUtilePointGeometrique) {
			NotificationChain msgs = null;
			if (centreGraviteZoneUtilePointGeometrique != null)
				msgs = ((InternalEObject)centreGraviteZoneUtilePointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__CENTRE_GRAVITE_ZONE_UTILE_POINT_GEOMETRIQUE, null, msgs);
			if (newCentreGraviteZoneUtilePointGeometrique != null)
				msgs = ((InternalEObject)newCentreGraviteZoneUtilePointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__CENTRE_GRAVITE_ZONE_UTILE_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetCentreGraviteZoneUtilePointGeometrique(newCentreGraviteZoneUtilePointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__CENTRE_GRAVITE_ZONE_UTILE_POINT_GEOMETRIQUE, newCentreGraviteZoneUtilePointGeometrique, newCentreGraviteZoneUtilePointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointGeometrique getPointStationPrincipalePointGeometrique() {
		return pointStationPrincipalePointGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointStationPrincipalePointGeometrique(TypePointGeometrique newPointStationPrincipalePointGeometrique, NotificationChain msgs) {
		TypePointGeometrique oldPointStationPrincipalePointGeometrique = pointStationPrincipalePointGeometrique;
		pointStationPrincipalePointGeometrique = newPointStationPrincipalePointGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_STATION_PRINCIPALE_POINT_GEOMETRIQUE, oldPointStationPrincipalePointGeometrique, newPointStationPrincipalePointGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointStationPrincipalePointGeometrique(TypePointGeometrique newPointStationPrincipalePointGeometrique) {
		if (newPointStationPrincipalePointGeometrique != pointStationPrincipalePointGeometrique) {
			NotificationChain msgs = null;
			if (pointStationPrincipalePointGeometrique != null)
				msgs = ((InternalEObject)pointStationPrincipalePointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_STATION_PRINCIPALE_POINT_GEOMETRIQUE, null, msgs);
			if (newPointStationPrincipalePointGeometrique != null)
				msgs = ((InternalEObject)newPointStationPrincipalePointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_STATION_PRINCIPALE_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetPointStationPrincipalePointGeometrique(newPointStationPrincipalePointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_STATION_PRINCIPALE_POINT_GEOMETRIQUE, newPointStationPrincipalePointGeometrique, newPointStationPrincipalePointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointGeometrique getPointLateralGauchePointGeometrique() {
		return pointLateralGauchePointGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointLateralGauchePointGeometrique(TypePointGeometrique newPointLateralGauchePointGeometrique, NotificationChain msgs) {
		TypePointGeometrique oldPointLateralGauchePointGeometrique = pointLateralGauchePointGeometrique;
		pointLateralGauchePointGeometrique = newPointLateralGauchePointGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_GAUCHE_POINT_GEOMETRIQUE, oldPointLateralGauchePointGeometrique, newPointLateralGauchePointGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointLateralGauchePointGeometrique(TypePointGeometrique newPointLateralGauchePointGeometrique) {
		if (newPointLateralGauchePointGeometrique != pointLateralGauchePointGeometrique) {
			NotificationChain msgs = null;
			if (pointLateralGauchePointGeometrique != null)
				msgs = ((InternalEObject)pointLateralGauchePointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_GAUCHE_POINT_GEOMETRIQUE, null, msgs);
			if (newPointLateralGauchePointGeometrique != null)
				msgs = ((InternalEObject)newPointLateralGauchePointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_GAUCHE_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetPointLateralGauchePointGeometrique(newPointLateralGauchePointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_GAUCHE_POINT_GEOMETRIQUE, newPointLateralGauchePointGeometrique, newPointLateralGauchePointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_DROIT_POINT_GEOMETRIQUE:
				return basicSetPointLateralDroitPointGeometrique(null, msgs);
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__CENTRE_GRAVITE_ZONE_UTILE_POINT_GEOMETRIQUE:
				return basicSetCentreGraviteZoneUtilePointGeometrique(null, msgs);
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_STATION_PRINCIPALE_POINT_GEOMETRIQUE:
				return basicSetPointStationPrincipalePointGeometrique(null, msgs);
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_GAUCHE_POINT_GEOMETRIQUE:
				return basicSetPointLateralGauchePointGeometrique(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__DISTANCE:
				return new Double(getDistance());
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_DROIT_POINT_GEOMETRIQUE:
				return getPointLateralDroitPointGeometrique();
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__CENTRE_GRAVITE_ZONE_UTILE_POINT_GEOMETRIQUE:
				return getCentreGraviteZoneUtilePointGeometrique();
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_STATION_PRINCIPALE_POINT_GEOMETRIQUE:
				return getPointStationPrincipalePointGeometrique();
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_GAUCHE_POINT_GEOMETRIQUE:
				return getPointLateralGauchePointGeometrique();
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
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__DISTANCE:
				setDistance(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_DROIT_POINT_GEOMETRIQUE:
				setPointLateralDroitPointGeometrique((TypePointGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__CENTRE_GRAVITE_ZONE_UTILE_POINT_GEOMETRIQUE:
				setCentreGraviteZoneUtilePointGeometrique((TypePointGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_STATION_PRINCIPALE_POINT_GEOMETRIQUE:
				setPointStationPrincipalePointGeometrique((TypePointGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_GAUCHE_POINT_GEOMETRIQUE:
				setPointLateralGauchePointGeometrique((TypePointGeometrique)newValue);
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
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__DISTANCE:
				unsetDistance();
				return;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_DROIT_POINT_GEOMETRIQUE:
				setPointLateralDroitPointGeometrique((TypePointGeometrique)null);
				return;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__CENTRE_GRAVITE_ZONE_UTILE_POINT_GEOMETRIQUE:
				setCentreGraviteZoneUtilePointGeometrique((TypePointGeometrique)null);
				return;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_STATION_PRINCIPALE_POINT_GEOMETRIQUE:
				setPointStationPrincipalePointGeometrique((TypePointGeometrique)null);
				return;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_GAUCHE_POINT_GEOMETRIQUE:
				setPointLateralGauchePointGeometrique((TypePointGeometrique)null);
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
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__DISTANCE:
				return isSetDistance();
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_DROIT_POINT_GEOMETRIQUE:
				return pointLateralDroitPointGeometrique != null;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__CENTRE_GRAVITE_ZONE_UTILE_POINT_GEOMETRIQUE:
				return centreGraviteZoneUtilePointGeometrique != null;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_STATION_PRINCIPALE_POINT_GEOMETRIQUE:
				return pointStationPrincipalePointGeometrique != null;
			case SchemaPackage.TYPE_MISSION_LOCALISATION_RADIO_ELECTRIQUE__POINT_LATERAL_GAUCHE_POINT_GEOMETRIQUE:
				return pointLateralGauchePointGeometrique != null;
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
		result.append(" (distance: ");
		if (distanceESet) result.append(distance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMissionLocalisationRadioElectriqueImpl
