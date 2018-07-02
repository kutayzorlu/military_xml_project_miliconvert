/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLigneGeometrique;
import mpia.schema.TypeMissionDrone;
import mpia.schema.TypePassePhoto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionDroneImpl#getFicelleLigneGeometrique <em>Ficelle Ligne Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionDroneImpl#getPassesPhotoPassePhoto <em>Passes Photo Passe Photo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionDroneImpl extends EObjectImpl implements TypeMissionDrone {
	/**
	 * The cached value of the '{@link #getFicelleLigneGeometrique() <em>Ficelle Ligne Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFicelleLigneGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeLigneGeometrique ficelleLigneGeometrique;

	/**
	 * The cached value of the '{@link #getPassesPhotoPassePhoto() <em>Passes Photo Passe Photo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassesPhotoPassePhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePassePhoto> passesPhotoPassePhoto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionDroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionDrone();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLigneGeometrique getFicelleLigneGeometrique() {
		return ficelleLigneGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFicelleLigneGeometrique(TypeLigneGeometrique newFicelleLigneGeometrique, NotificationChain msgs) {
		TypeLigneGeometrique oldFicelleLigneGeometrique = ficelleLigneGeometrique;
		ficelleLigneGeometrique = newFicelleLigneGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_DRONE__FICELLE_LIGNE_GEOMETRIQUE, oldFicelleLigneGeometrique, newFicelleLigneGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFicelleLigneGeometrique(TypeLigneGeometrique newFicelleLigneGeometrique) {
		if (newFicelleLigneGeometrique != ficelleLigneGeometrique) {
			NotificationChain msgs = null;
			if (ficelleLigneGeometrique != null)
				msgs = ((InternalEObject)ficelleLigneGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_DRONE__FICELLE_LIGNE_GEOMETRIQUE, null, msgs);
			if (newFicelleLigneGeometrique != null)
				msgs = ((InternalEObject)newFicelleLigneGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_DRONE__FICELLE_LIGNE_GEOMETRIQUE, null, msgs);
			msgs = basicSetFicelleLigneGeometrique(newFicelleLigneGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_DRONE__FICELLE_LIGNE_GEOMETRIQUE, newFicelleLigneGeometrique, newFicelleLigneGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePassePhoto> getPassesPhotoPassePhoto() {
		if (passesPhotoPassePhoto == null) {
			passesPhotoPassePhoto = new EObjectContainmentEList<TypePassePhoto>(TypePassePhoto.class, this, SchemaPackage.TYPE_MISSION_DRONE__PASSES_PHOTO_PASSE_PHOTO);
		}
		return passesPhotoPassePhoto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_DRONE__FICELLE_LIGNE_GEOMETRIQUE:
				return basicSetFicelleLigneGeometrique(null, msgs);
			case SchemaPackage.TYPE_MISSION_DRONE__PASSES_PHOTO_PASSE_PHOTO:
				return ((InternalEList<?>)getPassesPhotoPassePhoto()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_DRONE__FICELLE_LIGNE_GEOMETRIQUE:
				return getFicelleLigneGeometrique();
			case SchemaPackage.TYPE_MISSION_DRONE__PASSES_PHOTO_PASSE_PHOTO:
				return getPassesPhotoPassePhoto();
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
			case SchemaPackage.TYPE_MISSION_DRONE__FICELLE_LIGNE_GEOMETRIQUE:
				setFicelleLigneGeometrique((TypeLigneGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_DRONE__PASSES_PHOTO_PASSE_PHOTO:
				getPassesPhotoPassePhoto().clear();
				getPassesPhotoPassePhoto().addAll((Collection<? extends TypePassePhoto>)newValue);
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
			case SchemaPackage.TYPE_MISSION_DRONE__FICELLE_LIGNE_GEOMETRIQUE:
				setFicelleLigneGeometrique((TypeLigneGeometrique)null);
				return;
			case SchemaPackage.TYPE_MISSION_DRONE__PASSES_PHOTO_PASSE_PHOTO:
				getPassesPhotoPassePhoto().clear();
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
			case SchemaPackage.TYPE_MISSION_DRONE__FICELLE_LIGNE_GEOMETRIQUE:
				return ficelleLigneGeometrique != null;
			case SchemaPackage.TYPE_MISSION_DRONE__PASSES_PHOTO_PASSE_PHOTO:
				return passesPhotoPassePhoto != null && !passesPhotoPassePhoto.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeMissionDroneImpl
