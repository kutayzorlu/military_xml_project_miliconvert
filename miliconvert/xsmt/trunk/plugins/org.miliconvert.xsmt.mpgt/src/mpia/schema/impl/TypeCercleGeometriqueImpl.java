/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCercleGeometrique;
import mpia.schema.TypeCoordonneesLatLong;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Cercle Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCercleGeometriqueImpl#getRayon <em>Rayon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCercleGeometriqueImpl#getAPourCentreCoordonneesLatLong <em>APour Centre Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCercleGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeCercleGeometrique {
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
	 * The cached value of the '{@link #getAPourCentreCoordonneesLatLong() <em>APour Centre Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCentreCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourCentreCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCercleGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCercleGeometrique();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__RAYON, oldRayon, newRayon);
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
				msgs = ((InternalEObject)rayon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__RAYON, null, msgs);
			if (newRayon != null)
				msgs = ((InternalEObject)newRayon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__RAYON, null, msgs);
			msgs = basicSetRayon(newRayon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__RAYON, newRayon, newRayon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourCentreCoordonneesLatLong() {
		return aPourCentreCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCentreCoordonneesLatLong(TypeCoordonneesLatLong newAPourCentreCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourCentreCoordonneesLatLong = aPourCentreCoordonneesLatLong;
		aPourCentreCoordonneesLatLong = newAPourCentreCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG, oldAPourCentreCoordonneesLatLong, newAPourCentreCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCentreCoordonneesLatLong(TypeCoordonneesLatLong newAPourCentreCoordonneesLatLong) {
		if (newAPourCentreCoordonneesLatLong != aPourCentreCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourCentreCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourCentreCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourCentreCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourCentreCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourCentreCoordonneesLatLong(newAPourCentreCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG, newAPourCentreCoordonneesLatLong, newAPourCentreCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__RAYON:
				return basicSetRayon(null, msgs);
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				return basicSetAPourCentreCoordonneesLatLong(null, msgs);
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
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__RAYON:
				return getRayon();
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				return getAPourCentreCoordonneesLatLong();
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
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__RAYON:
				setRayon((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				setAPourCentreCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
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
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__RAYON:
				setRayon((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				setAPourCentreCoordonneesLatLong((TypeCoordonneesLatLong)null);
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
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__RAYON:
				return rayon != null;
			case SchemaPackage.TYPE_CERCLE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				return aPourCentreCoordonneesLatLong != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeCercleGeometriqueImpl
