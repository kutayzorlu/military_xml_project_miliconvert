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
import mpia.schema.TypeElementParticulierADefendre;
import mpia.schema.TypeMissionZoneADefendre;

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
 * An implementation of the model object '<em><b>Type Mission Zone ADefendre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionZoneADefendreImpl#getRole <em>Role</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionZoneADefendreImpl#getACommeLocalisationAutreElementControle <em>AComme Localisation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionZoneADefendreImpl#getACommeElementParticulierElementParticulierADefendre <em>AComme Element Particulier Element Particulier ADefendre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionZoneADefendreImpl extends EObjectImpl implements TypeMissionZoneADefendre {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeLocalisationAutreElementControle() <em>AComme Localisation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLocalisationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLocalisationAutreElementControle;

	/**
	 * The cached value of the '{@link #getACommeElementParticulierElementParticulierADefendre() <em>AComme Element Particulier Element Particulier ADefendre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeElementParticulierElementParticulierADefendre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeElementParticulierADefendre> aCommeElementParticulierElementParticulierADefendre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionZoneADefendreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionZoneADefendre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLocalisationAutreElementControle() {
		return aCommeLocalisationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLocalisationAutreElementControle(TypeAssociation newACommeLocalisationAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeLocalisationAutreElementControle = aCommeLocalisationAutreElementControle;
		aCommeLocalisationAutreElementControle = newACommeLocalisationAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE, oldACommeLocalisationAutreElementControle, newACommeLocalisationAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLocalisationAutreElementControle(TypeAssociation newACommeLocalisationAutreElementControle) {
		if (newACommeLocalisationAutreElementControle != aCommeLocalisationAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeLocalisationAutreElementControle != null)
				msgs = ((InternalEObject)aCommeLocalisationAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeLocalisationAutreElementControle != null)
				msgs = ((InternalEObject)newACommeLocalisationAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeLocalisationAutreElementControle(newACommeLocalisationAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE, newACommeLocalisationAutreElementControle, newACommeLocalisationAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeElementParticulierADefendre> getACommeElementParticulierElementParticulierADefendre() {
		if (aCommeElementParticulierElementParticulierADefendre == null) {
			aCommeElementParticulierElementParticulierADefendre = new EObjectContainmentEList<TypeElementParticulierADefendre>(TypeElementParticulierADefendre.class, this, SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_ELEMENT_PARTICULIER_ELEMENT_PARTICULIER_ADEFENDRE);
		}
		return aCommeElementParticulierElementParticulierADefendre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeLocalisationAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_ELEMENT_PARTICULIER_ELEMENT_PARTICULIER_ADEFENDRE:
				return ((InternalEList<?>)getACommeElementParticulierElementParticulierADefendre()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ROLE:
				return getRole();
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return getACommeLocalisationAutreElementControle();
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_ELEMENT_PARTICULIER_ELEMENT_PARTICULIER_ADEFENDRE:
				return getACommeElementParticulierElementParticulierADefendre();
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
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ROLE:
				setRole((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setACommeLocalisationAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_ELEMENT_PARTICULIER_ELEMENT_PARTICULIER_ADEFENDRE:
				getACommeElementParticulierElementParticulierADefendre().clear();
				getACommeElementParticulierElementParticulierADefendre().addAll((Collection<? extends TypeElementParticulierADefendre>)newValue);
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
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setACommeLocalisationAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_ELEMENT_PARTICULIER_ELEMENT_PARTICULIER_ADEFENDRE:
				getACommeElementParticulierElementParticulierADefendre().clear();
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
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return aCommeLocalisationAutreElementControle != null;
			case SchemaPackage.TYPE_MISSION_ZONE_ADEFENDRE__ACOMME_ELEMENT_PARTICULIER_ELEMENT_PARTICULIER_ADEFENDRE:
				return aCommeElementParticulierElementParticulierADefendre != null && !aCommeElementParticulierElementParticulierADefendre.isEmpty();
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
		result.append(" (role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //TypeMissionZoneADefendreImpl
