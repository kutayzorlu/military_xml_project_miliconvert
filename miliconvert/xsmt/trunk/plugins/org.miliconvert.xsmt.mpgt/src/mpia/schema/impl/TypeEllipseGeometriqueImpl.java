/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeEllipseGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ellipse Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEllipseGeometriqueImpl#getAPourPremierPointConjugueCoordonneesLatLong <em>APour Premier Point Conjugue Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEllipseGeometriqueImpl#getAPourSecondPointConjugueCoordonneesLatLong <em>APour Second Point Conjugue Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEllipseGeometriqueImpl#getAPourCentreCoordonneesLatLong <em>APour Centre Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEllipseGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeEllipseGeometrique {
	/**
	 * The cached value of the '{@link #getAPourPremierPointConjugueCoordonneesLatLong() <em>APour Premier Point Conjugue Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPremierPointConjugueCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourPremierPointConjugueCoordonneesLatLong;

	/**
	 * The cached value of the '{@link #getAPourSecondPointConjugueCoordonneesLatLong() <em>APour Second Point Conjugue Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSecondPointConjugueCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourSecondPointConjugueCoordonneesLatLong;

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
	protected TypeEllipseGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEllipseGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourPremierPointConjugueCoordonneesLatLong() {
		return aPourPremierPointConjugueCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPremierPointConjugueCoordonneesLatLong(TypeCoordonneesLatLong newAPourPremierPointConjugueCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourPremierPointConjugueCoordonneesLatLong = aPourPremierPointConjugueCoordonneesLatLong;
		aPourPremierPointConjugueCoordonneesLatLong = newAPourPremierPointConjugueCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_PREMIER_POINT_CONJUGUE_COORDONNEES_LAT_LONG, oldAPourPremierPointConjugueCoordonneesLatLong, newAPourPremierPointConjugueCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPremierPointConjugueCoordonneesLatLong(TypeCoordonneesLatLong newAPourPremierPointConjugueCoordonneesLatLong) {
		if (newAPourPremierPointConjugueCoordonneesLatLong != aPourPremierPointConjugueCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourPremierPointConjugueCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourPremierPointConjugueCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_PREMIER_POINT_CONJUGUE_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourPremierPointConjugueCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourPremierPointConjugueCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_PREMIER_POINT_CONJUGUE_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourPremierPointConjugueCoordonneesLatLong(newAPourPremierPointConjugueCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_PREMIER_POINT_CONJUGUE_COORDONNEES_LAT_LONG, newAPourPremierPointConjugueCoordonneesLatLong, newAPourPremierPointConjugueCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourSecondPointConjugueCoordonneesLatLong() {
		return aPourSecondPointConjugueCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSecondPointConjugueCoordonneesLatLong(TypeCoordonneesLatLong newAPourSecondPointConjugueCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourSecondPointConjugueCoordonneesLatLong = aPourSecondPointConjugueCoordonneesLatLong;
		aPourSecondPointConjugueCoordonneesLatLong = newAPourSecondPointConjugueCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_SECOND_POINT_CONJUGUE_COORDONNEES_LAT_LONG, oldAPourSecondPointConjugueCoordonneesLatLong, newAPourSecondPointConjugueCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSecondPointConjugueCoordonneesLatLong(TypeCoordonneesLatLong newAPourSecondPointConjugueCoordonneesLatLong) {
		if (newAPourSecondPointConjugueCoordonneesLatLong != aPourSecondPointConjugueCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourSecondPointConjugueCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourSecondPointConjugueCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_SECOND_POINT_CONJUGUE_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourSecondPointConjugueCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourSecondPointConjugueCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_SECOND_POINT_CONJUGUE_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourSecondPointConjugueCoordonneesLatLong(newAPourSecondPointConjugueCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_SECOND_POINT_CONJUGUE_COORDONNEES_LAT_LONG, newAPourSecondPointConjugueCoordonneesLatLong, newAPourSecondPointConjugueCoordonneesLatLong));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG, oldAPourCentreCoordonneesLatLong, newAPourCentreCoordonneesLatLong);
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
				msgs = ((InternalEObject)aPourCentreCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourCentreCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourCentreCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourCentreCoordonneesLatLong(newAPourCentreCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG, newAPourCentreCoordonneesLatLong, newAPourCentreCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_PREMIER_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				return basicSetAPourPremierPointConjugueCoordonneesLatLong(null, msgs);
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_SECOND_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				return basicSetAPourSecondPointConjugueCoordonneesLatLong(null, msgs);
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_PREMIER_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				return getAPourPremierPointConjugueCoordonneesLatLong();
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_SECOND_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				return getAPourSecondPointConjugueCoordonneesLatLong();
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_PREMIER_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				setAPourPremierPointConjugueCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
				return;
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_SECOND_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				setAPourSecondPointConjugueCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
				return;
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_PREMIER_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				setAPourPremierPointConjugueCoordonneesLatLong((TypeCoordonneesLatLong)null);
				return;
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_SECOND_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				setAPourSecondPointConjugueCoordonneesLatLong((TypeCoordonneesLatLong)null);
				return;
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_PREMIER_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				return aPourPremierPointConjugueCoordonneesLatLong != null;
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_SECOND_POINT_CONJUGUE_COORDONNEES_LAT_LONG:
				return aPourSecondPointConjugueCoordonneesLatLong != null;
			case SchemaPackage.TYPE_ELLIPSE_GEOMETRIQUE__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				return aPourCentreCoordonneesLatLong != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeEllipseGeometriqueImpl
