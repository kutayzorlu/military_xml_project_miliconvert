/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConeGeometrique;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeObjetGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Cone Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConeGeometriqueImpl#getAPourBaseObjetGeometrique <em>APour Base Objet Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConeGeometriqueImpl#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConeGeometriqueImpl extends TypeVolumeGeometriqueImpl implements TypeConeGeometrique {
	/**
	 * The cached value of the '{@link #getAPourBaseObjetGeometrique() <em>APour Base Objet Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBaseObjetGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeObjetGeometrique aPourBaseObjetGeometrique;

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
	protected TypeConeGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConeGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjetGeometrique getAPourBaseObjetGeometrique() {
		return aPourBaseObjetGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourBaseObjetGeometrique(TypeObjetGeometrique newAPourBaseObjetGeometrique, NotificationChain msgs) {
		TypeObjetGeometrique oldAPourBaseObjetGeometrique = aPourBaseObjetGeometrique;
		aPourBaseObjetGeometrique = newAPourBaseObjetGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_BASE_OBJET_GEOMETRIQUE, oldAPourBaseObjetGeometrique, newAPourBaseObjetGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourBaseObjetGeometrique(TypeObjetGeometrique newAPourBaseObjetGeometrique) {
		if (newAPourBaseObjetGeometrique != aPourBaseObjetGeometrique) {
			NotificationChain msgs = null;
			if (aPourBaseObjetGeometrique != null)
				msgs = ((InternalEObject)aPourBaseObjetGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_BASE_OBJET_GEOMETRIQUE, null, msgs);
			if (newAPourBaseObjetGeometrique != null)
				msgs = ((InternalEObject)newAPourBaseObjetGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_BASE_OBJET_GEOMETRIQUE, null, msgs);
			msgs = basicSetAPourBaseObjetGeometrique(newAPourBaseObjetGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_BASE_OBJET_GEOMETRIQUE, newAPourBaseObjetGeometrique, newAPourBaseObjetGeometrique));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, oldAPourOrigineCoordonneesLatLong, newAPourOrigineCoordonneesLatLong);
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
				msgs = ((InternalEObject)aPourOrigineCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourOrigineCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourOrigineCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourOrigineCoordonneesLatLong(newAPourOrigineCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, newAPourOrigineCoordonneesLatLong, newAPourOrigineCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_BASE_OBJET_GEOMETRIQUE:
				return basicSetAPourBaseObjetGeometrique(null, msgs);
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_BASE_OBJET_GEOMETRIQUE:
				return getAPourBaseObjetGeometrique();
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				return getAPourOrigineCoordonneesLatLong();
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
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_BASE_OBJET_GEOMETRIQUE:
				setAPourBaseObjetGeometrique((TypeObjetGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_BASE_OBJET_GEOMETRIQUE:
				setAPourBaseObjetGeometrique((TypeObjetGeometrique)null);
				return;
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_BASE_OBJET_GEOMETRIQUE:
				return aPourBaseObjetGeometrique != null;
			case SchemaPackage.TYPE_CONE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				return aPourOrigineCoordonneesLatLong != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeConeGeometriqueImpl
