/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeMissionRohum;
import mpia.schema.TypeLigneGeometrique;
import mpia.schema.TypeMissionRohum;
import mpia.schema.TypePointGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission Rohum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionRohumImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRohumImpl#getAngleSecteur <em>Angle Secteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRohumImpl#getItineraireObserverLigneGeometrique <em>Itineraire Observer Ligne Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRohumImpl#getOrigineSecteurPointGeometrique <em>Origine Secteur Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRohumImpl#getDirectionObservationPointGeometrique <em>Direction Observation Point Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionRohumImpl extends EObjectImpl implements TypeMissionRohum {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMissionRohum TYPE_EDEFAULT = TypeDictionaryDicoTypeMissionRohum.OBS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMissionRohum type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getAngleSecteur() <em>Angle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleSecteur()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLE_SECTEUR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngleSecteur() <em>Angle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleSecteur()
	 * @generated
	 * @ordered
	 */
	protected double angleSecteur = ANGLE_SECTEUR_EDEFAULT;

	/**
	 * This is true if the Angle Secteur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angleSecteurESet;

	/**
	 * The cached value of the '{@link #getItineraireObserverLigneGeometrique() <em>Itineraire Observer Ligne Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItineraireObserverLigneGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeLigneGeometrique itineraireObserverLigneGeometrique;

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
	 * The cached value of the '{@link #getDirectionObservationPointGeometrique() <em>Direction Observation Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionObservationPointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique directionObservationPointGeometrique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionRohumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionRohum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMissionRohum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoTypeMissionRohum newType) {
		TypeDictionaryDicoTypeMissionRohum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ROHUM__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoTypeMissionRohum oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_ROHUM__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngleSecteur() {
		return angleSecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleSecteur(double newAngleSecteur) {
		double oldAngleSecteur = angleSecteur;
		angleSecteur = newAngleSecteur;
		boolean oldAngleSecteurESet = angleSecteurESet;
		angleSecteurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ROHUM__ANGLE_SECTEUR, oldAngleSecteur, angleSecteur, !oldAngleSecteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAngleSecteur() {
		double oldAngleSecteur = angleSecteur;
		boolean oldAngleSecteurESet = angleSecteurESet;
		angleSecteur = ANGLE_SECTEUR_EDEFAULT;
		angleSecteurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_ROHUM__ANGLE_SECTEUR, oldAngleSecteur, ANGLE_SECTEUR_EDEFAULT, oldAngleSecteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAngleSecteur() {
		return angleSecteurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLigneGeometrique getItineraireObserverLigneGeometrique() {
		return itineraireObserverLigneGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItineraireObserverLigneGeometrique(TypeLigneGeometrique newItineraireObserverLigneGeometrique, NotificationChain msgs) {
		TypeLigneGeometrique oldItineraireObserverLigneGeometrique = itineraireObserverLigneGeometrique;
		itineraireObserverLigneGeometrique = newItineraireObserverLigneGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ROHUM__ITINERAIRE_OBSERVER_LIGNE_GEOMETRIQUE, oldItineraireObserverLigneGeometrique, newItineraireObserverLigneGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItineraireObserverLigneGeometrique(TypeLigneGeometrique newItineraireObserverLigneGeometrique) {
		if (newItineraireObserverLigneGeometrique != itineraireObserverLigneGeometrique) {
			NotificationChain msgs = null;
			if (itineraireObserverLigneGeometrique != null)
				msgs = ((InternalEObject)itineraireObserverLigneGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ROHUM__ITINERAIRE_OBSERVER_LIGNE_GEOMETRIQUE, null, msgs);
			if (newItineraireObserverLigneGeometrique != null)
				msgs = ((InternalEObject)newItineraireObserverLigneGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ROHUM__ITINERAIRE_OBSERVER_LIGNE_GEOMETRIQUE, null, msgs);
			msgs = basicSetItineraireObserverLigneGeometrique(newItineraireObserverLigneGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ROHUM__ITINERAIRE_OBSERVER_LIGNE_GEOMETRIQUE, newItineraireObserverLigneGeometrique, newItineraireObserverLigneGeometrique));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ROHUM__ORIGINE_SECTEUR_POINT_GEOMETRIQUE, oldOrigineSecteurPointGeometrique, newOrigineSecteurPointGeometrique);
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
				msgs = ((InternalEObject)origineSecteurPointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ROHUM__ORIGINE_SECTEUR_POINT_GEOMETRIQUE, null, msgs);
			if (newOrigineSecteurPointGeometrique != null)
				msgs = ((InternalEObject)newOrigineSecteurPointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ROHUM__ORIGINE_SECTEUR_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetOrigineSecteurPointGeometrique(newOrigineSecteurPointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ROHUM__ORIGINE_SECTEUR_POINT_GEOMETRIQUE, newOrigineSecteurPointGeometrique, newOrigineSecteurPointGeometrique));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ROHUM__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE, oldDirectionObservationPointGeometrique, newDirectionObservationPointGeometrique);
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
				msgs = ((InternalEObject)directionObservationPointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ROHUM__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE, null, msgs);
			if (newDirectionObservationPointGeometrique != null)
				msgs = ((InternalEObject)newDirectionObservationPointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ROHUM__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetDirectionObservationPointGeometrique(newDirectionObservationPointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ROHUM__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE, newDirectionObservationPointGeometrique, newDirectionObservationPointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_ROHUM__ITINERAIRE_OBSERVER_LIGNE_GEOMETRIQUE:
				return basicSetItineraireObserverLigneGeometrique(null, msgs);
			case SchemaPackage.TYPE_MISSION_ROHUM__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				return basicSetOrigineSecteurPointGeometrique(null, msgs);
			case SchemaPackage.TYPE_MISSION_ROHUM__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				return basicSetDirectionObservationPointGeometrique(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_ROHUM__TYPE:
				return getType();
			case SchemaPackage.TYPE_MISSION_ROHUM__ANGLE_SECTEUR:
				return new Double(getAngleSecteur());
			case SchemaPackage.TYPE_MISSION_ROHUM__ITINERAIRE_OBSERVER_LIGNE_GEOMETRIQUE:
				return getItineraireObserverLigneGeometrique();
			case SchemaPackage.TYPE_MISSION_ROHUM__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				return getOrigineSecteurPointGeometrique();
			case SchemaPackage.TYPE_MISSION_ROHUM__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				return getDirectionObservationPointGeometrique();
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
			case SchemaPackage.TYPE_MISSION_ROHUM__TYPE:
				setType((TypeDictionaryDicoTypeMissionRohum)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ROHUM__ANGLE_SECTEUR:
				setAngleSecteur(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_MISSION_ROHUM__ITINERAIRE_OBSERVER_LIGNE_GEOMETRIQUE:
				setItineraireObserverLigneGeometrique((TypeLigneGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ROHUM__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				setOrigineSecteurPointGeometrique((TypePointGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ROHUM__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				setDirectionObservationPointGeometrique((TypePointGeometrique)newValue);
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
			case SchemaPackage.TYPE_MISSION_ROHUM__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_MISSION_ROHUM__ANGLE_SECTEUR:
				unsetAngleSecteur();
				return;
			case SchemaPackage.TYPE_MISSION_ROHUM__ITINERAIRE_OBSERVER_LIGNE_GEOMETRIQUE:
				setItineraireObserverLigneGeometrique((TypeLigneGeometrique)null);
				return;
			case SchemaPackage.TYPE_MISSION_ROHUM__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				setOrigineSecteurPointGeometrique((TypePointGeometrique)null);
				return;
			case SchemaPackage.TYPE_MISSION_ROHUM__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				setDirectionObservationPointGeometrique((TypePointGeometrique)null);
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
			case SchemaPackage.TYPE_MISSION_ROHUM__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_MISSION_ROHUM__ANGLE_SECTEUR:
				return isSetAngleSecteur();
			case SchemaPackage.TYPE_MISSION_ROHUM__ITINERAIRE_OBSERVER_LIGNE_GEOMETRIQUE:
				return itineraireObserverLigneGeometrique != null;
			case SchemaPackage.TYPE_MISSION_ROHUM__ORIGINE_SECTEUR_POINT_GEOMETRIQUE:
				return origineSecteurPointGeometrique != null;
			case SchemaPackage.TYPE_MISSION_ROHUM__DIRECTION_OBSERVATION_POINT_GEOMETRIQUE:
				return directionObservationPointGeometrique != null;
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", angleSecteur: ");
		if (angleSecteurESet) result.append(angleSecteur); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMissionRohumImpl
