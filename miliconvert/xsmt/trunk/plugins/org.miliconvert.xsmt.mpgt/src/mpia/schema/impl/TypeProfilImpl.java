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
import mpia.schema.TypeProfil;

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
 * An implementation of the model object '<em><b>Type Profil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeProfilImpl#getProfileId <em>Profile Id</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProfilImpl#getEstObjetAssociationProfilUnite <em>Est Objet Association Profil Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProfilImpl#getEstProfilAssociationProfilDotationTheorique <em>Est Profil Association Profil Dotation Theorique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeProfilImpl extends TypeRacineOperationnelleImpl implements TypeProfil {
	/**
	 * The default value of the '{@link #getProfileId() <em>Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileId() <em>Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileId()
	 * @generated
	 * @ordered
	 */
	protected String profileId = PROFILE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationProfilUnite() <em>Est Objet Association Profil Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationProfilUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationProfilUnite;

	/**
	 * The cached value of the '{@link #getEstProfilAssociationProfilDotationTheorique() <em>Est Profil Association Profil Dotation Theorique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstProfilAssociationProfilDotationTheorique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estProfilAssociationProfilDotationTheorique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeProfilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeProfil();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileId() {
		return profileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileId(String newProfileId) {
		String oldProfileId = profileId;
		profileId = newProfileId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROFIL__PROFILE_ID, oldProfileId, profileId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationProfilUnite() {
		if (estObjetAssociationProfilUnite == null) {
			estObjetAssociationProfilUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PROFIL__EST_OBJET_ASSOCIATION_PROFIL_UNITE);
		}
		return estObjetAssociationProfilUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstProfilAssociationProfilDotationTheorique() {
		if (estProfilAssociationProfilDotationTheorique == null) {
			estProfilAssociationProfilDotationTheorique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PROFIL__EST_PROFIL_ASSOCIATION_PROFIL_DOTATION_THEORIQUE);
		}
		return estProfilAssociationProfilDotationTheorique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PROFIL__EST_OBJET_ASSOCIATION_PROFIL_UNITE:
				return ((InternalEList<?>)getEstObjetAssociationProfilUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PROFIL__EST_PROFIL_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				return ((InternalEList<?>)getEstProfilAssociationProfilDotationTheorique()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PROFIL__PROFILE_ID:
				return getProfileId();
			case SchemaPackage.TYPE_PROFIL__EST_OBJET_ASSOCIATION_PROFIL_UNITE:
				return getEstObjetAssociationProfilUnite();
			case SchemaPackage.TYPE_PROFIL__EST_PROFIL_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				return getEstProfilAssociationProfilDotationTheorique();
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
			case SchemaPackage.TYPE_PROFIL__PROFILE_ID:
				setProfileId((String)newValue);
				return;
			case SchemaPackage.TYPE_PROFIL__EST_OBJET_ASSOCIATION_PROFIL_UNITE:
				getEstObjetAssociationProfilUnite().clear();
				getEstObjetAssociationProfilUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PROFIL__EST_PROFIL_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				getEstProfilAssociationProfilDotationTheorique().clear();
				getEstProfilAssociationProfilDotationTheorique().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_PROFIL__PROFILE_ID:
				setProfileId(PROFILE_ID_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROFIL__EST_OBJET_ASSOCIATION_PROFIL_UNITE:
				getEstObjetAssociationProfilUnite().clear();
				return;
			case SchemaPackage.TYPE_PROFIL__EST_PROFIL_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				getEstProfilAssociationProfilDotationTheorique().clear();
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
			case SchemaPackage.TYPE_PROFIL__PROFILE_ID:
				return PROFILE_ID_EDEFAULT == null ? profileId != null : !PROFILE_ID_EDEFAULT.equals(profileId);
			case SchemaPackage.TYPE_PROFIL__EST_OBJET_ASSOCIATION_PROFIL_UNITE:
				return estObjetAssociationProfilUnite != null && !estObjetAssociationProfilUnite.isEmpty();
			case SchemaPackage.TYPE_PROFIL__EST_PROFIL_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				return estProfilAssociationProfilDotationTheorique != null && !estProfilAssociationProfilDotationTheorique.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (profileId: ");
		result.append(profileId);
		result.append(')');
		return result.toString();
	}

} //TypeProfilImpl
