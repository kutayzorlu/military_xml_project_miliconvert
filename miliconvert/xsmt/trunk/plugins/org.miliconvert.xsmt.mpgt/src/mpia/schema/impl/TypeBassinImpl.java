/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBassin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Bassin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBassinImpl#getProfondeurAMareeBasse <em>Profondeur AMaree Basse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBassinImpl#getChargeEnLourdAcceptable <em>Charge En Lourd Acceptable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBassinImpl#getSpecificites <em>Specificites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBassinImpl extends TypeSiteImpl implements TypeBassin {
	/**
	 * The cached value of the '{@link #getProfondeurAMareeBasse() <em>Profondeur AMaree Basse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeurAMareeBasse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur profondeurAMareeBasse;

	/**
	 * The cached value of the '{@link #getChargeEnLourdAcceptable() <em>Charge En Lourd Acceptable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeEnLourdAcceptable()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeEnLourdAcceptable;

	/**
	 * The default value of the '{@link #getSpecificites() <em>Specificites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificites()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICITES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificites() <em>Specificites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificites()
	 * @generated
	 * @ordered
	 */
	protected String specificites = SPECIFICITES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBassinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBassin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getProfondeurAMareeBasse() {
		return profondeurAMareeBasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfondeurAMareeBasse(TypeDataTypeLongueur newProfondeurAMareeBasse, NotificationChain msgs) {
		TypeDataTypeLongueur oldProfondeurAMareeBasse = profondeurAMareeBasse;
		profondeurAMareeBasse = newProfondeurAMareeBasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BASSIN__PROFONDEUR_AMAREE_BASSE, oldProfondeurAMareeBasse, newProfondeurAMareeBasse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondeurAMareeBasse(TypeDataTypeLongueur newProfondeurAMareeBasse) {
		if (newProfondeurAMareeBasse != profondeurAMareeBasse) {
			NotificationChain msgs = null;
			if (profondeurAMareeBasse != null)
				msgs = ((InternalEObject)profondeurAMareeBasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BASSIN__PROFONDEUR_AMAREE_BASSE, null, msgs);
			if (newProfondeurAMareeBasse != null)
				msgs = ((InternalEObject)newProfondeurAMareeBasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BASSIN__PROFONDEUR_AMAREE_BASSE, null, msgs);
			msgs = basicSetProfondeurAMareeBasse(newProfondeurAMareeBasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BASSIN__PROFONDEUR_AMAREE_BASSE, newProfondeurAMareeBasse, newProfondeurAMareeBasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeEnLourdAcceptable() {
		return chargeEnLourdAcceptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeEnLourdAcceptable(TypeDataTypeMasse newChargeEnLourdAcceptable, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeEnLourdAcceptable = chargeEnLourdAcceptable;
		chargeEnLourdAcceptable = newChargeEnLourdAcceptable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BASSIN__CHARGE_EN_LOURD_ACCEPTABLE, oldChargeEnLourdAcceptable, newChargeEnLourdAcceptable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeEnLourdAcceptable(TypeDataTypeMasse newChargeEnLourdAcceptable) {
		if (newChargeEnLourdAcceptable != chargeEnLourdAcceptable) {
			NotificationChain msgs = null;
			if (chargeEnLourdAcceptable != null)
				msgs = ((InternalEObject)chargeEnLourdAcceptable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BASSIN__CHARGE_EN_LOURD_ACCEPTABLE, null, msgs);
			if (newChargeEnLourdAcceptable != null)
				msgs = ((InternalEObject)newChargeEnLourdAcceptable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BASSIN__CHARGE_EN_LOURD_ACCEPTABLE, null, msgs);
			msgs = basicSetChargeEnLourdAcceptable(newChargeEnLourdAcceptable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BASSIN__CHARGE_EN_LOURD_ACCEPTABLE, newChargeEnLourdAcceptable, newChargeEnLourdAcceptable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificites() {
		return specificites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificites(String newSpecificites) {
		String oldSpecificites = specificites;
		specificites = newSpecificites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BASSIN__SPECIFICITES, oldSpecificites, specificites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BASSIN__PROFONDEUR_AMAREE_BASSE:
				return basicSetProfondeurAMareeBasse(null, msgs);
			case SchemaPackage.TYPE_BASSIN__CHARGE_EN_LOURD_ACCEPTABLE:
				return basicSetChargeEnLourdAcceptable(null, msgs);
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
			case SchemaPackage.TYPE_BASSIN__PROFONDEUR_AMAREE_BASSE:
				return getProfondeurAMareeBasse();
			case SchemaPackage.TYPE_BASSIN__CHARGE_EN_LOURD_ACCEPTABLE:
				return getChargeEnLourdAcceptable();
			case SchemaPackage.TYPE_BASSIN__SPECIFICITES:
				return getSpecificites();
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
			case SchemaPackage.TYPE_BASSIN__PROFONDEUR_AMAREE_BASSE:
				setProfondeurAMareeBasse((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_BASSIN__CHARGE_EN_LOURD_ACCEPTABLE:
				setChargeEnLourdAcceptable((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_BASSIN__SPECIFICITES:
				setSpecificites((String)newValue);
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
			case SchemaPackage.TYPE_BASSIN__PROFONDEUR_AMAREE_BASSE:
				setProfondeurAMareeBasse((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_BASSIN__CHARGE_EN_LOURD_ACCEPTABLE:
				setChargeEnLourdAcceptable((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_BASSIN__SPECIFICITES:
				setSpecificites(SPECIFICITES_EDEFAULT);
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
			case SchemaPackage.TYPE_BASSIN__PROFONDEUR_AMAREE_BASSE:
				return profondeurAMareeBasse != null;
			case SchemaPackage.TYPE_BASSIN__CHARGE_EN_LOURD_ACCEPTABLE:
				return chargeEnLourdAcceptable != null;
			case SchemaPackage.TYPE_BASSIN__SPECIFICITES:
				return SPECIFICITES_EDEFAULT == null ? specificites != null : !SPECIFICITES_EDEFAULT.equals(specificites);
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
		result.append(" (specificites: ");
		result.append(specificites);
		result.append(')');
		return result.toString();
	}

} //TypeBassinImpl
