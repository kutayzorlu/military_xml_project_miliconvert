/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapteurRENS;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capteur RENS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapteurRENSImpl#getMissionsMissionRenseignement <em>Missions Mission Renseignement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeCapteurRENSImpl extends TypeEntiteOrganisationnelleImpl implements TypeCapteurRENS {
	/**
	 * The cached value of the '{@link #getMissionsMissionRenseignement() <em>Missions Mission Renseignement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionsMissionRenseignement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> missionsMissionRenseignement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapteurRENSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapteurRENS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getMissionsMissionRenseignement() {
		if (missionsMissionRenseignement == null) {
			missionsMissionRenseignement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CAPTEUR_RENS__MISSIONS_MISSION_RENSEIGNEMENT);
		}
		return missionsMissionRenseignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPTEUR_RENS__MISSIONS_MISSION_RENSEIGNEMENT:
				return ((InternalEList<?>)getMissionsMissionRenseignement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CAPTEUR_RENS__MISSIONS_MISSION_RENSEIGNEMENT:
				return getMissionsMissionRenseignement();
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
			case SchemaPackage.TYPE_CAPTEUR_RENS__MISSIONS_MISSION_RENSEIGNEMENT:
				getMissionsMissionRenseignement().clear();
				getMissionsMissionRenseignement().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CAPTEUR_RENS__MISSIONS_MISSION_RENSEIGNEMENT:
				getMissionsMissionRenseignement().clear();
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
			case SchemaPackage.TYPE_CAPTEUR_RENS__MISSIONS_MISSION_RENSEIGNEMENT:
				return missionsMissionRenseignement != null && !missionsMissionRenseignement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeCapteurRENSImpl
