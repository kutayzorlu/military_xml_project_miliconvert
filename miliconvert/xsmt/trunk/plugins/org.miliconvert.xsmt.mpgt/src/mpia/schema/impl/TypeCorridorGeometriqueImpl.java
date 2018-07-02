/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeCorridorGeometrique;

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
 * An implementation of the model object '<em><b>Type Corridor Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCorridorGeometriqueImpl#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCorridorGeometriqueImpl#getAPourCheminementCoordonneesLatLong <em>APour Cheminement Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCorridorGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeCorridorGeometrique {
	/**
	 * The cached value of the '{@link #getLargeur() <em>Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeur;

	/**
	 * The cached value of the '{@link #getAPourCheminementCoordonneesLatLong() <em>APour Cheminement Coordonnees Lat Long</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCheminementCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCoordonneesLatLong> aPourCheminementCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCorridorGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCorridorGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeur() {
		return largeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeur(TypeDataTypeLongueur newLargeur, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeur = largeur;
		largeur = newLargeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__LARGEUR, oldLargeur, newLargeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeur(TypeDataTypeLongueur newLargeur) {
		if (newLargeur != largeur) {
			NotificationChain msgs = null;
			if (largeur != null)
				msgs = ((InternalEObject)largeur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__LARGEUR, null, msgs);
			if (newLargeur != null)
				msgs = ((InternalEObject)newLargeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__LARGEUR, null, msgs);
			msgs = basicSetLargeur(newLargeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__LARGEUR, newLargeur, newLargeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCoordonneesLatLong> getAPourCheminementCoordonneesLatLong() {
		if (aPourCheminementCoordonneesLatLong == null) {
			aPourCheminementCoordonneesLatLong = new EObjectContainmentEList<TypeCoordonneesLatLong>(TypeCoordonneesLatLong.class, this, SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__APOUR_CHEMINEMENT_COORDONNEES_LAT_LONG);
		}
		return aPourCheminementCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__LARGEUR:
				return basicSetLargeur(null, msgs);
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__APOUR_CHEMINEMENT_COORDONNEES_LAT_LONG:
				return ((InternalEList<?>)getAPourCheminementCoordonneesLatLong()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__LARGEUR:
				return getLargeur();
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__APOUR_CHEMINEMENT_COORDONNEES_LAT_LONG:
				return getAPourCheminementCoordonneesLatLong();
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
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__LARGEUR:
				setLargeur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__APOUR_CHEMINEMENT_COORDONNEES_LAT_LONG:
				getAPourCheminementCoordonneesLatLong().clear();
				getAPourCheminementCoordonneesLatLong().addAll((Collection<? extends TypeCoordonneesLatLong>)newValue);
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
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__LARGEUR:
				setLargeur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__APOUR_CHEMINEMENT_COORDONNEES_LAT_LONG:
				getAPourCheminementCoordonneesLatLong().clear();
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
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__LARGEUR:
				return largeur != null;
			case SchemaPackage.TYPE_CORRIDOR_GEOMETRIQUE__APOUR_CHEMINEMENT_COORDONNEES_LAT_LONG:
				return aPourCheminementCoordonneesLatLong != null && !aPourCheminementCoordonneesLatLong.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeCorridorGeometriqueImpl
