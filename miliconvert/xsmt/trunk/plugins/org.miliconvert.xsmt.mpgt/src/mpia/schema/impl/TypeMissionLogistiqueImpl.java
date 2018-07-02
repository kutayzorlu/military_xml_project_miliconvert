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
import mpia.schema.TypeMissionLogistique;

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
 * An implementation of the model object '<em><b>Type Mission Logistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionLogistiqueImpl#getIntitule <em>Intitule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionLogistiqueImpl#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionLogistiqueImpl#getAPourZoneExecutionAutreElementControle <em>APour Zone Execution Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeMissionLogistiqueImpl extends TypeMissionImpl implements TypeMissionLogistique {
	/**
	 * The default value of the '{@link #getIntitule() <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntitule()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntitule() <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntitule()
	 * @generated
	 * @ordered
	 */
	protected String intitule = INTITULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourUniteConcerneeUnite() <em>APour Unite Concernee Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteConcerneeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteConcerneeUnite;

	/**
	 * The cached value of the '{@link #getAPourZoneExecutionAutreElementControle() <em>APour Zone Execution Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneExecutionAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneExecutionAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionLogistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionLogistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntitule() {
		return intitule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntitule(String newIntitule) {
		String oldIntitule = intitule;
		intitule = newIntitule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOGISTIQUE__INTITULE, oldIntitule, intitule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteConcerneeUnite() {
		if (aPourUniteConcerneeUnite == null) {
			aPourUniteConcerneeUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_UNITE_CONCERNEE_UNITE);
		}
		return aPourUniteConcerneeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneExecutionAutreElementControle() {
		return aPourZoneExecutionAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneExecutionAutreElementControle(TypeAssociation newAPourZoneExecutionAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneExecutionAutreElementControle = aPourZoneExecutionAutreElementControle;
		aPourZoneExecutionAutreElementControle = newAPourZoneExecutionAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_ZONE_EXECUTION_AUTRE_ELEMENT_CONTROLE, oldAPourZoneExecutionAutreElementControle, newAPourZoneExecutionAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneExecutionAutreElementControle(TypeAssociation newAPourZoneExecutionAutreElementControle) {
		if (newAPourZoneExecutionAutreElementControle != aPourZoneExecutionAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneExecutionAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneExecutionAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_ZONE_EXECUTION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneExecutionAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneExecutionAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_ZONE_EXECUTION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneExecutionAutreElementControle(newAPourZoneExecutionAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_ZONE_EXECUTION_AUTRE_ELEMENT_CONTROLE, newAPourZoneExecutionAutreElementControle, newAPourZoneExecutionAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				return ((InternalEList<?>)getAPourUniteConcerneeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_ZONE_EXECUTION_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneExecutionAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__INTITULE:
				return getIntitule();
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				return getAPourUniteConcerneeUnite();
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_ZONE_EXECUTION_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneExecutionAutreElementControle();
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
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__INTITULE:
				setIntitule((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
				getAPourUniteConcerneeUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_ZONE_EXECUTION_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneExecutionAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__INTITULE:
				setIntitule(INTITULE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_ZONE_EXECUTION_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneExecutionAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__INTITULE:
				return INTITULE_EDEFAULT == null ? intitule != null : !INTITULE_EDEFAULT.equals(intitule);
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				return aPourUniteConcerneeUnite != null && !aPourUniteConcerneeUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_LOGISTIQUE__APOUR_ZONE_EXECUTION_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneExecutionAutreElementControle != null;
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
		result.append(" (intitule: ");
		result.append(intitule);
		result.append(')');
		return result.toString();
	}

} //TypeMissionLogistiqueImpl
