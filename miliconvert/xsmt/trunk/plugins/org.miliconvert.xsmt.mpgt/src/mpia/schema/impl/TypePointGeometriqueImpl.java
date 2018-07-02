/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypePointGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Point Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePointGeometriqueImpl#getEstLocaliseParCoordonneesLatLong <em>Est Localise Par Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePointGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypePointGeometrique {
	/**
	 * The cached value of the '{@link #getEstLocaliseParCoordonneesLatLong() <em>Est Localise Par Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseParCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong estLocaliseParCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePointGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePointGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getEstLocaliseParCoordonneesLatLong() {
		return estLocaliseParCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseParCoordonneesLatLong(TypeCoordonneesLatLong newEstLocaliseParCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldEstLocaliseParCoordonneesLatLong = estLocaliseParCoordonneesLatLong;
		estLocaliseParCoordonneesLatLong = newEstLocaliseParCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_GEOMETRIQUE__EST_LOCALISE_PAR_COORDONNEES_LAT_LONG, oldEstLocaliseParCoordonneesLatLong, newEstLocaliseParCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseParCoordonneesLatLong(TypeCoordonneesLatLong newEstLocaliseParCoordonneesLatLong) {
		if (newEstLocaliseParCoordonneesLatLong != estLocaliseParCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (estLocaliseParCoordonneesLatLong != null)
				msgs = ((InternalEObject)estLocaliseParCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_GEOMETRIQUE__EST_LOCALISE_PAR_COORDONNEES_LAT_LONG, null, msgs);
			if (newEstLocaliseParCoordonneesLatLong != null)
				msgs = ((InternalEObject)newEstLocaliseParCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_GEOMETRIQUE__EST_LOCALISE_PAR_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetEstLocaliseParCoordonneesLatLong(newEstLocaliseParCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_GEOMETRIQUE__EST_LOCALISE_PAR_COORDONNEES_LAT_LONG, newEstLocaliseParCoordonneesLatLong, newEstLocaliseParCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POINT_GEOMETRIQUE__EST_LOCALISE_PAR_COORDONNEES_LAT_LONG:
				return basicSetEstLocaliseParCoordonneesLatLong(null, msgs);
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
			case SchemaPackage.TYPE_POINT_GEOMETRIQUE__EST_LOCALISE_PAR_COORDONNEES_LAT_LONG:
				return getEstLocaliseParCoordonneesLatLong();
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
			case SchemaPackage.TYPE_POINT_GEOMETRIQUE__EST_LOCALISE_PAR_COORDONNEES_LAT_LONG:
				setEstLocaliseParCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
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
			case SchemaPackage.TYPE_POINT_GEOMETRIQUE__EST_LOCALISE_PAR_COORDONNEES_LAT_LONG:
				setEstLocaliseParCoordonneesLatLong((TypeCoordonneesLatLong)null);
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
			case SchemaPackage.TYPE_POINT_GEOMETRIQUE__EST_LOCALISE_PAR_COORDONNEES_LAT_LONG:
				return estLocaliseParCoordonneesLatLong != null;
		}
		return super.eIsSet(featureID);
	}

} //TypePointGeometriqueImpl
