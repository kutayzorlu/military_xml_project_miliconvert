/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDefenseAccompagnement;
import mpia.schema.TypeDefenseAuProfitUnite;
import mpia.schema.TypeElementParticulierADefendre;
import mpia.schema.TypeMissionDefenseParticuliere;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission Defense Particuliere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionDefenseParticuliereImpl#getACommeDefenseParticuliereElementParticulierADefendre <em>AComme Defense Particuliere Element Particulier ADefendre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionDefenseParticuliereImpl#getACommeDefenseAuProfitUniteDefenseAuProfitUnite <em>AComme Defense Au Profit Unite Defense Au Profit Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionDefenseParticuliereImpl#getACommeDefenseAccompagnementDefenseAccompagnement <em>AComme Defense Accompagnement Defense Accompagnement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionDefenseParticuliereImpl extends EObjectImpl implements TypeMissionDefenseParticuliere {
	/**
	 * The cached value of the '{@link #getACommeDefenseParticuliereElementParticulierADefendre() <em>AComme Defense Particuliere Element Particulier ADefendre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeDefenseParticuliereElementParticulierADefendre()
	 * @generated
	 * @ordered
	 */
	protected TypeElementParticulierADefendre aCommeDefenseParticuliereElementParticulierADefendre;

	/**
	 * The cached value of the '{@link #getACommeDefenseAuProfitUniteDefenseAuProfitUnite() <em>AComme Defense Au Profit Unite Defense Au Profit Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeDefenseAuProfitUniteDefenseAuProfitUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeDefenseAuProfitUnite aCommeDefenseAuProfitUniteDefenseAuProfitUnite;

	/**
	 * The cached value of the '{@link #getACommeDefenseAccompagnementDefenseAccompagnement() <em>AComme Defense Accompagnement Defense Accompagnement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeDefenseAccompagnementDefenseAccompagnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDefenseAccompagnement aCommeDefenseAccompagnementDefenseAccompagnement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionDefenseParticuliereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionDefenseParticuliere();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElementParticulierADefendre getACommeDefenseParticuliereElementParticulierADefendre() {
		return aCommeDefenseParticuliereElementParticulierADefendre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeDefenseParticuliereElementParticulierADefendre(TypeElementParticulierADefendre newACommeDefenseParticuliereElementParticulierADefendre, NotificationChain msgs) {
		TypeElementParticulierADefendre oldACommeDefenseParticuliereElementParticulierADefendre = aCommeDefenseParticuliereElementParticulierADefendre;
		aCommeDefenseParticuliereElementParticulierADefendre = newACommeDefenseParticuliereElementParticulierADefendre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_PARTICULIERE_ELEMENT_PARTICULIER_ADEFENDRE, oldACommeDefenseParticuliereElementParticulierADefendre, newACommeDefenseParticuliereElementParticulierADefendre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeDefenseParticuliereElementParticulierADefendre(TypeElementParticulierADefendre newACommeDefenseParticuliereElementParticulierADefendre) {
		if (newACommeDefenseParticuliereElementParticulierADefendre != aCommeDefenseParticuliereElementParticulierADefendre) {
			NotificationChain msgs = null;
			if (aCommeDefenseParticuliereElementParticulierADefendre != null)
				msgs = ((InternalEObject)aCommeDefenseParticuliereElementParticulierADefendre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_PARTICULIERE_ELEMENT_PARTICULIER_ADEFENDRE, null, msgs);
			if (newACommeDefenseParticuliereElementParticulierADefendre != null)
				msgs = ((InternalEObject)newACommeDefenseParticuliereElementParticulierADefendre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_PARTICULIERE_ELEMENT_PARTICULIER_ADEFENDRE, null, msgs);
			msgs = basicSetACommeDefenseParticuliereElementParticulierADefendre(newACommeDefenseParticuliereElementParticulierADefendre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_PARTICULIERE_ELEMENT_PARTICULIER_ADEFENDRE, newACommeDefenseParticuliereElementParticulierADefendre, newACommeDefenseParticuliereElementParticulierADefendre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefenseAuProfitUnite getACommeDefenseAuProfitUniteDefenseAuProfitUnite() {
		return aCommeDefenseAuProfitUniteDefenseAuProfitUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeDefenseAuProfitUniteDefenseAuProfitUnite(TypeDefenseAuProfitUnite newACommeDefenseAuProfitUniteDefenseAuProfitUnite, NotificationChain msgs) {
		TypeDefenseAuProfitUnite oldACommeDefenseAuProfitUniteDefenseAuProfitUnite = aCommeDefenseAuProfitUniteDefenseAuProfitUnite;
		aCommeDefenseAuProfitUniteDefenseAuProfitUnite = newACommeDefenseAuProfitUniteDefenseAuProfitUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_AU_PROFIT_UNITE_DEFENSE_AU_PROFIT_UNITE, oldACommeDefenseAuProfitUniteDefenseAuProfitUnite, newACommeDefenseAuProfitUniteDefenseAuProfitUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeDefenseAuProfitUniteDefenseAuProfitUnite(TypeDefenseAuProfitUnite newACommeDefenseAuProfitUniteDefenseAuProfitUnite) {
		if (newACommeDefenseAuProfitUniteDefenseAuProfitUnite != aCommeDefenseAuProfitUniteDefenseAuProfitUnite) {
			NotificationChain msgs = null;
			if (aCommeDefenseAuProfitUniteDefenseAuProfitUnite != null)
				msgs = ((InternalEObject)aCommeDefenseAuProfitUniteDefenseAuProfitUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_AU_PROFIT_UNITE_DEFENSE_AU_PROFIT_UNITE, null, msgs);
			if (newACommeDefenseAuProfitUniteDefenseAuProfitUnite != null)
				msgs = ((InternalEObject)newACommeDefenseAuProfitUniteDefenseAuProfitUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_AU_PROFIT_UNITE_DEFENSE_AU_PROFIT_UNITE, null, msgs);
			msgs = basicSetACommeDefenseAuProfitUniteDefenseAuProfitUnite(newACommeDefenseAuProfitUniteDefenseAuProfitUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_AU_PROFIT_UNITE_DEFENSE_AU_PROFIT_UNITE, newACommeDefenseAuProfitUniteDefenseAuProfitUnite, newACommeDefenseAuProfitUniteDefenseAuProfitUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefenseAccompagnement getACommeDefenseAccompagnementDefenseAccompagnement() {
		return aCommeDefenseAccompagnementDefenseAccompagnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeDefenseAccompagnementDefenseAccompagnement(TypeDefenseAccompagnement newACommeDefenseAccompagnementDefenseAccompagnement, NotificationChain msgs) {
		TypeDefenseAccompagnement oldACommeDefenseAccompagnementDefenseAccompagnement = aCommeDefenseAccompagnementDefenseAccompagnement;
		aCommeDefenseAccompagnementDefenseAccompagnement = newACommeDefenseAccompagnementDefenseAccompagnement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_ACCOMPAGNEMENT_DEFENSE_ACCOMPAGNEMENT, oldACommeDefenseAccompagnementDefenseAccompagnement, newACommeDefenseAccompagnementDefenseAccompagnement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeDefenseAccompagnementDefenseAccompagnement(TypeDefenseAccompagnement newACommeDefenseAccompagnementDefenseAccompagnement) {
		if (newACommeDefenseAccompagnementDefenseAccompagnement != aCommeDefenseAccompagnementDefenseAccompagnement) {
			NotificationChain msgs = null;
			if (aCommeDefenseAccompagnementDefenseAccompagnement != null)
				msgs = ((InternalEObject)aCommeDefenseAccompagnementDefenseAccompagnement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_ACCOMPAGNEMENT_DEFENSE_ACCOMPAGNEMENT, null, msgs);
			if (newACommeDefenseAccompagnementDefenseAccompagnement != null)
				msgs = ((InternalEObject)newACommeDefenseAccompagnementDefenseAccompagnement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_ACCOMPAGNEMENT_DEFENSE_ACCOMPAGNEMENT, null, msgs);
			msgs = basicSetACommeDefenseAccompagnementDefenseAccompagnement(newACommeDefenseAccompagnementDefenseAccompagnement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_ACCOMPAGNEMENT_DEFENSE_ACCOMPAGNEMENT, newACommeDefenseAccompagnementDefenseAccompagnement, newACommeDefenseAccompagnementDefenseAccompagnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_PARTICULIERE_ELEMENT_PARTICULIER_ADEFENDRE:
				return basicSetACommeDefenseParticuliereElementParticulierADefendre(null, msgs);
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_AU_PROFIT_UNITE_DEFENSE_AU_PROFIT_UNITE:
				return basicSetACommeDefenseAuProfitUniteDefenseAuProfitUnite(null, msgs);
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_ACCOMPAGNEMENT_DEFENSE_ACCOMPAGNEMENT:
				return basicSetACommeDefenseAccompagnementDefenseAccompagnement(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_PARTICULIERE_ELEMENT_PARTICULIER_ADEFENDRE:
				return getACommeDefenseParticuliereElementParticulierADefendre();
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_AU_PROFIT_UNITE_DEFENSE_AU_PROFIT_UNITE:
				return getACommeDefenseAuProfitUniteDefenseAuProfitUnite();
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_ACCOMPAGNEMENT_DEFENSE_ACCOMPAGNEMENT:
				return getACommeDefenseAccompagnementDefenseAccompagnement();
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
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_PARTICULIERE_ELEMENT_PARTICULIER_ADEFENDRE:
				setACommeDefenseParticuliereElementParticulierADefendre((TypeElementParticulierADefendre)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_AU_PROFIT_UNITE_DEFENSE_AU_PROFIT_UNITE:
				setACommeDefenseAuProfitUniteDefenseAuProfitUnite((TypeDefenseAuProfitUnite)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_ACCOMPAGNEMENT_DEFENSE_ACCOMPAGNEMENT:
				setACommeDefenseAccompagnementDefenseAccompagnement((TypeDefenseAccompagnement)newValue);
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
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_PARTICULIERE_ELEMENT_PARTICULIER_ADEFENDRE:
				setACommeDefenseParticuliereElementParticulierADefendre((TypeElementParticulierADefendre)null);
				return;
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_AU_PROFIT_UNITE_DEFENSE_AU_PROFIT_UNITE:
				setACommeDefenseAuProfitUniteDefenseAuProfitUnite((TypeDefenseAuProfitUnite)null);
				return;
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_ACCOMPAGNEMENT_DEFENSE_ACCOMPAGNEMENT:
				setACommeDefenseAccompagnementDefenseAccompagnement((TypeDefenseAccompagnement)null);
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
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_PARTICULIERE_ELEMENT_PARTICULIER_ADEFENDRE:
				return aCommeDefenseParticuliereElementParticulierADefendre != null;
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_AU_PROFIT_UNITE_DEFENSE_AU_PROFIT_UNITE:
				return aCommeDefenseAuProfitUniteDefenseAuProfitUnite != null;
			case SchemaPackage.TYPE_MISSION_DEFENSE_PARTICULIERE__ACOMME_DEFENSE_ACCOMPAGNEMENT_DEFENSE_ACCOMPAGNEMENT:
				return aCommeDefenseAccompagnementDefenseAccompagnement != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeMissionDefenseParticuliereImpl
