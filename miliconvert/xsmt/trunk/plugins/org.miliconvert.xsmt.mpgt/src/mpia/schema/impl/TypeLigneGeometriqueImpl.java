/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeLigneGeometrique;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ligne Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLigneGeometriqueImpl#getAPourLocalisationCoordonneesLatLong <em>APour Localisation Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLigneGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeLigneGeometrique {
	/**
	 * The cached value of the '{@link #getAPourLocalisationCoordonneesLatLong() <em>APour Localisation Coordonnees Lat Long</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCoordonneesLatLong> aPourLocalisationCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLigneGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLigneGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCoordonneesLatLong> getAPourLocalisationCoordonneesLatLong() {
		if (aPourLocalisationCoordonneesLatLong == null) {
			aPourLocalisationCoordonneesLatLong = new EObjectContainmentEList<TypeCoordonneesLatLong>(TypeCoordonneesLatLong.class, this, SchemaPackage.TYPE_LIGNE_GEOMETRIQUE__APOUR_LOCALISATION_COORDONNEES_LAT_LONG);
		}
		return aPourLocalisationCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LIGNE_GEOMETRIQUE__APOUR_LOCALISATION_COORDONNEES_LAT_LONG:
				return ((InternalEList<?>)getAPourLocalisationCoordonneesLatLong()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_LIGNE_GEOMETRIQUE__APOUR_LOCALISATION_COORDONNEES_LAT_LONG:
				return getAPourLocalisationCoordonneesLatLong();
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
			case SchemaPackage.TYPE_LIGNE_GEOMETRIQUE__APOUR_LOCALISATION_COORDONNEES_LAT_LONG:
				getAPourLocalisationCoordonneesLatLong().clear();
				getAPourLocalisationCoordonneesLatLong().addAll((Collection<? extends TypeCoordonneesLatLong>)newValue);
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
			case SchemaPackage.TYPE_LIGNE_GEOMETRIQUE__APOUR_LOCALISATION_COORDONNEES_LAT_LONG:
				getAPourLocalisationCoordonneesLatLong().clear();
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
			case SchemaPackage.TYPE_LIGNE_GEOMETRIQUE__APOUR_LOCALISATION_COORDONNEES_LAT_LONG:
				return aPourLocalisationCoordonneesLatLong != null && !aPourLocalisationCoordonneesLatLong.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeLigneGeometriqueImpl
