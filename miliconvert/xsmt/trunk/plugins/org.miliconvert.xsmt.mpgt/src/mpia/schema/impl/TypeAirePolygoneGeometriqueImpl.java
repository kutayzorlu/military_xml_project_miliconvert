/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAirePolygoneGeometrique;
import mpia.schema.TypeCoordonneesLatLong;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Aire Polygone Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAirePolygoneGeometriqueImpl#getAPourFrontiereCoordonneesLatLong <em>APour Frontiere Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAirePolygoneGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeAirePolygoneGeometrique {
	/**
	 * The cached value of the '{@link #getAPourFrontiereCoordonneesLatLong() <em>APour Frontiere Coordonnees Lat Long</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFrontiereCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCoordonneesLatLong> aPourFrontiereCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAirePolygoneGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAirePolygoneGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCoordonneesLatLong> getAPourFrontiereCoordonneesLatLong() {
		if (aPourFrontiereCoordonneesLatLong == null) {
			aPourFrontiereCoordonneesLatLong = new EObjectContainmentEList<TypeCoordonneesLatLong>(TypeCoordonneesLatLong.class, this, SchemaPackage.TYPE_AIRE_POLYGONE_GEOMETRIQUE__APOUR_FRONTIERE_COORDONNEES_LAT_LONG);
		}
		return aPourFrontiereCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AIRE_POLYGONE_GEOMETRIQUE__APOUR_FRONTIERE_COORDONNEES_LAT_LONG:
				return ((InternalEList<?>)getAPourFrontiereCoordonneesLatLong()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_AIRE_POLYGONE_GEOMETRIQUE__APOUR_FRONTIERE_COORDONNEES_LAT_LONG:
				return getAPourFrontiereCoordonneesLatLong();
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
			case SchemaPackage.TYPE_AIRE_POLYGONE_GEOMETRIQUE__APOUR_FRONTIERE_COORDONNEES_LAT_LONG:
				getAPourFrontiereCoordonneesLatLong().clear();
				getAPourFrontiereCoordonneesLatLong().addAll((Collection<? extends TypeCoordonneesLatLong>)newValue);
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
			case SchemaPackage.TYPE_AIRE_POLYGONE_GEOMETRIQUE__APOUR_FRONTIERE_COORDONNEES_LAT_LONG:
				getAPourFrontiereCoordonneesLatLong().clear();
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
			case SchemaPackage.TYPE_AIRE_POLYGONE_GEOMETRIQUE__APOUR_FRONTIERE_COORDONNEES_LAT_LONG:
				return aPourFrontiereCoordonneesLatLong != null && !aPourFrontiereCoordonneesLatLong.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeAirePolygoneGeometriqueImpl
