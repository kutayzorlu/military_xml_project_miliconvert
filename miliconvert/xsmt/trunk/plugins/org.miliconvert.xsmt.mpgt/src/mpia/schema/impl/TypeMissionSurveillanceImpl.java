/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMissionSurveillance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission Surveillance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionSurveillanceImpl#getACommeZoneASurveillerAutreElementControle <em>AComme Zone ASurveiller Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionSurveillanceImpl extends EObjectImpl implements TypeMissionSurveillance {
	/**
	 * The cached value of the '{@link #getACommeZoneASurveillerAutreElementControle() <em>AComme Zone ASurveiller Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeZoneASurveillerAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeZoneASurveillerAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionSurveillanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionSurveillance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeZoneASurveillerAutreElementControle() {
		return aCommeZoneASurveillerAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeZoneASurveillerAutreElementControle(TypeAssociation newACommeZoneASurveillerAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeZoneASurveillerAutreElementControle = aCommeZoneASurveillerAutreElementControle;
		aCommeZoneASurveillerAutreElementControle = newACommeZoneASurveillerAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_SURVEILLANCE__ACOMME_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE, oldACommeZoneASurveillerAutreElementControle, newACommeZoneASurveillerAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeZoneASurveillerAutreElementControle(TypeAssociation newACommeZoneASurveillerAutreElementControle) {
		if (newACommeZoneASurveillerAutreElementControle != aCommeZoneASurveillerAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeZoneASurveillerAutreElementControle != null)
				msgs = ((InternalEObject)aCommeZoneASurveillerAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_SURVEILLANCE__ACOMME_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeZoneASurveillerAutreElementControle != null)
				msgs = ((InternalEObject)newACommeZoneASurveillerAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_SURVEILLANCE__ACOMME_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeZoneASurveillerAutreElementControle(newACommeZoneASurveillerAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_SURVEILLANCE__ACOMME_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE, newACommeZoneASurveillerAutreElementControle, newACommeZoneASurveillerAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_SURVEILLANCE__ACOMME_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeZoneASurveillerAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_SURVEILLANCE__ACOMME_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				return getACommeZoneASurveillerAutreElementControle();
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
			case SchemaPackage.TYPE_MISSION_SURVEILLANCE__ACOMME_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				setACommeZoneASurveillerAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MISSION_SURVEILLANCE__ACOMME_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				setACommeZoneASurveillerAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MISSION_SURVEILLANCE__ACOMME_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				return aCommeZoneASurveillerAutreElementControle != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeMissionSurveillanceImpl
