/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAirePolyarcGeometrique;
import mpia.schema.TypeCoordonneesLatLong;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Aire Polyarc Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAirePolyarcGeometriqueImpl#getRayon <em>Rayon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAirePolyarcGeometriqueImpl#getAngleDernierPoint <em>Angle Dernier Point</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAirePolyarcGeometriqueImpl#getAnglePremierPoint <em>Angle Premier Point</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAirePolyarcGeometriqueImpl#getAPourFrontierePartielleCoordonneesLatLong <em>APour Frontiere Partielle Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAirePolyarcGeometriqueImpl#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAirePolyarcGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeAirePolyarcGeometrique {
	/**
	 * The cached value of the '{@link #getRayon() <em>Rayon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayon()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayon;

	/**
	 * The cached value of the '{@link #getAngleDernierPoint() <em>Angle Dernier Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleDernierPoint()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleDernierPoint;

	/**
	 * The cached value of the '{@link #getAnglePremierPoint() <em>Angle Premier Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnglePremierPoint()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle anglePremierPoint;

	/**
	 * The cached value of the '{@link #getAPourFrontierePartielleCoordonneesLatLong() <em>APour Frontiere Partielle Coordonnees Lat Long</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFrontierePartielleCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCoordonneesLatLong> aPourFrontierePartielleCoordonneesLatLong;

	/**
	 * The cached value of the '{@link #getAPourOrigineCoordonneesLatLong() <em>APour Origine Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourOrigineCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourOrigineCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAirePolyarcGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAirePolyarcGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayon() {
		return rayon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayon(TypeDataTypeLongueur newRayon, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayon = rayon;
		rayon = newRayon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__RAYON, oldRayon, newRayon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayon(TypeDataTypeLongueur newRayon) {
		if (newRayon != rayon) {
			NotificationChain msgs = null;
			if (rayon != null)
				msgs = ((InternalEObject)rayon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__RAYON, null, msgs);
			if (newRayon != null)
				msgs = ((InternalEObject)newRayon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__RAYON, null, msgs);
			msgs = basicSetRayon(newRayon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__RAYON, newRayon, newRayon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleDernierPoint() {
		return angleDernierPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleDernierPoint(TypeDataTypeAngle newAngleDernierPoint, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleDernierPoint = angleDernierPoint;
		angleDernierPoint = newAngleDernierPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_DERNIER_POINT, oldAngleDernierPoint, newAngleDernierPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleDernierPoint(TypeDataTypeAngle newAngleDernierPoint) {
		if (newAngleDernierPoint != angleDernierPoint) {
			NotificationChain msgs = null;
			if (angleDernierPoint != null)
				msgs = ((InternalEObject)angleDernierPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_DERNIER_POINT, null, msgs);
			if (newAngleDernierPoint != null)
				msgs = ((InternalEObject)newAngleDernierPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_DERNIER_POINT, null, msgs);
			msgs = basicSetAngleDernierPoint(newAngleDernierPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_DERNIER_POINT, newAngleDernierPoint, newAngleDernierPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAnglePremierPoint() {
		return anglePremierPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnglePremierPoint(TypeDataTypeAngle newAnglePremierPoint, NotificationChain msgs) {
		TypeDataTypeAngle oldAnglePremierPoint = anglePremierPoint;
		anglePremierPoint = newAnglePremierPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_PREMIER_POINT, oldAnglePremierPoint, newAnglePremierPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnglePremierPoint(TypeDataTypeAngle newAnglePremierPoint) {
		if (newAnglePremierPoint != anglePremierPoint) {
			NotificationChain msgs = null;
			if (anglePremierPoint != null)
				msgs = ((InternalEObject)anglePremierPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_PREMIER_POINT, null, msgs);
			if (newAnglePremierPoint != null)
				msgs = ((InternalEObject)newAnglePremierPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_PREMIER_POINT, null, msgs);
			msgs = basicSetAnglePremierPoint(newAnglePremierPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_PREMIER_POINT, newAnglePremierPoint, newAnglePremierPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCoordonneesLatLong> getAPourFrontierePartielleCoordonneesLatLong() {
		if (aPourFrontierePartielleCoordonneesLatLong == null) {
			aPourFrontierePartielleCoordonneesLatLong = new EObjectContainmentEList<TypeCoordonneesLatLong>(TypeCoordonneesLatLong.class, this, SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_FRONTIERE_PARTIELLE_COORDONNEES_LAT_LONG);
		}
		return aPourFrontierePartielleCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourOrigineCoordonneesLatLong() {
		return aPourOrigineCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourOrigineCoordonneesLatLong(TypeCoordonneesLatLong newAPourOrigineCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourOrigineCoordonneesLatLong = aPourOrigineCoordonneesLatLong;
		aPourOrigineCoordonneesLatLong = newAPourOrigineCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, oldAPourOrigineCoordonneesLatLong, newAPourOrigineCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourOrigineCoordonneesLatLong(TypeCoordonneesLatLong newAPourOrigineCoordonneesLatLong) {
		if (newAPourOrigineCoordonneesLatLong != aPourOrigineCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourOrigineCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourOrigineCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourOrigineCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourOrigineCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourOrigineCoordonneesLatLong(newAPourOrigineCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, newAPourOrigineCoordonneesLatLong, newAPourOrigineCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__RAYON:
				return basicSetRayon(null, msgs);
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_DERNIER_POINT:
				return basicSetAngleDernierPoint(null, msgs);
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_PREMIER_POINT:
				return basicSetAnglePremierPoint(null, msgs);
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_FRONTIERE_PARTIELLE_COORDONNEES_LAT_LONG:
				return ((InternalEList<?>)getAPourFrontierePartielleCoordonneesLatLong()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				return basicSetAPourOrigineCoordonneesLatLong(null, msgs);
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
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__RAYON:
				return getRayon();
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_DERNIER_POINT:
				return getAngleDernierPoint();
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_PREMIER_POINT:
				return getAnglePremierPoint();
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_FRONTIERE_PARTIELLE_COORDONNEES_LAT_LONG:
				return getAPourFrontierePartielleCoordonneesLatLong();
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				return getAPourOrigineCoordonneesLatLong();
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
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__RAYON:
				setRayon((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_DERNIER_POINT:
				setAngleDernierPoint((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_PREMIER_POINT:
				setAnglePremierPoint((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_FRONTIERE_PARTIELLE_COORDONNEES_LAT_LONG:
				getAPourFrontierePartielleCoordonneesLatLong().clear();
				getAPourFrontierePartielleCoordonneesLatLong().addAll((Collection<? extends TypeCoordonneesLatLong>)newValue);
				return;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				setAPourOrigineCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
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
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__RAYON:
				setRayon((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_DERNIER_POINT:
				setAngleDernierPoint((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_PREMIER_POINT:
				setAnglePremierPoint((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_FRONTIERE_PARTIELLE_COORDONNEES_LAT_LONG:
				getAPourFrontierePartielleCoordonneesLatLong().clear();
				return;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				setAPourOrigineCoordonneesLatLong((TypeCoordonneesLatLong)null);
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
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__RAYON:
				return rayon != null;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_DERNIER_POINT:
				return angleDernierPoint != null;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__ANGLE_PREMIER_POINT:
				return anglePremierPoint != null;
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_FRONTIERE_PARTIELLE_COORDONNEES_LAT_LONG:
				return aPourFrontierePartielleCoordonneesLatLong != null && !aPourFrontierePartielleCoordonneesLatLong.isEmpty();
			case SchemaPackage.TYPE_AIRE_POLYARC_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				return aPourOrigineCoordonneesLatLong != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAirePolyarcGeometriqueImpl
