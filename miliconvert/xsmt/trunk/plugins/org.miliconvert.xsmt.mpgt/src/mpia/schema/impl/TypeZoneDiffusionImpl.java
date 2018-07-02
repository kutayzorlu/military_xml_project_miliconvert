/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeZoneDiffusion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Diffusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneDiffusionImpl#getLargZoneDiffusion <em>Larg Zone Diffusion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneDiffusionImpl#getHautZoneDiffusion <em>Haut Zone Diffusion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneDiffusionImpl extends EObjectImpl implements TypeZoneDiffusion {
	/**
	 * The cached value of the '{@link #getLargZoneDiffusion() <em>Larg Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargZoneDiffusion()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largZoneDiffusion;

	/**
	 * The cached value of the '{@link #getHautZoneDiffusion() <em>Haut Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHautZoneDiffusion()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hautZoneDiffusion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneDiffusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneDiffusion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargZoneDiffusion() {
		return largZoneDiffusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargZoneDiffusion(TypeDataTypeLongueur newLargZoneDiffusion, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargZoneDiffusion = largZoneDiffusion;
		largZoneDiffusion = newLargZoneDiffusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_DIFFUSION__LARG_ZONE_DIFFUSION, oldLargZoneDiffusion, newLargZoneDiffusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargZoneDiffusion(TypeDataTypeLongueur newLargZoneDiffusion) {
		if (newLargZoneDiffusion != largZoneDiffusion) {
			NotificationChain msgs = null;
			if (largZoneDiffusion != null)
				msgs = ((InternalEObject)largZoneDiffusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_DIFFUSION__LARG_ZONE_DIFFUSION, null, msgs);
			if (newLargZoneDiffusion != null)
				msgs = ((InternalEObject)newLargZoneDiffusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_DIFFUSION__LARG_ZONE_DIFFUSION, null, msgs);
			msgs = basicSetLargZoneDiffusion(newLargZoneDiffusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_DIFFUSION__LARG_ZONE_DIFFUSION, newLargZoneDiffusion, newLargZoneDiffusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHautZoneDiffusion() {
		return hautZoneDiffusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHautZoneDiffusion(TypeDataTypeLongueur newHautZoneDiffusion, NotificationChain msgs) {
		TypeDataTypeLongueur oldHautZoneDiffusion = hautZoneDiffusion;
		hautZoneDiffusion = newHautZoneDiffusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_DIFFUSION__HAUT_ZONE_DIFFUSION, oldHautZoneDiffusion, newHautZoneDiffusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHautZoneDiffusion(TypeDataTypeLongueur newHautZoneDiffusion) {
		if (newHautZoneDiffusion != hautZoneDiffusion) {
			NotificationChain msgs = null;
			if (hautZoneDiffusion != null)
				msgs = ((InternalEObject)hautZoneDiffusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_DIFFUSION__HAUT_ZONE_DIFFUSION, null, msgs);
			if (newHautZoneDiffusion != null)
				msgs = ((InternalEObject)newHautZoneDiffusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_DIFFUSION__HAUT_ZONE_DIFFUSION, null, msgs);
			msgs = basicSetHautZoneDiffusion(newHautZoneDiffusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_DIFFUSION__HAUT_ZONE_DIFFUSION, newHautZoneDiffusion, newHautZoneDiffusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_DIFFUSION__LARG_ZONE_DIFFUSION:
				return basicSetLargZoneDiffusion(null, msgs);
			case SchemaPackage.TYPE_ZONE_DIFFUSION__HAUT_ZONE_DIFFUSION:
				return basicSetHautZoneDiffusion(null, msgs);
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
			case SchemaPackage.TYPE_ZONE_DIFFUSION__LARG_ZONE_DIFFUSION:
				return getLargZoneDiffusion();
			case SchemaPackage.TYPE_ZONE_DIFFUSION__HAUT_ZONE_DIFFUSION:
				return getHautZoneDiffusion();
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
			case SchemaPackage.TYPE_ZONE_DIFFUSION__LARG_ZONE_DIFFUSION:
				setLargZoneDiffusion((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_DIFFUSION__HAUT_ZONE_DIFFUSION:
				setHautZoneDiffusion((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_ZONE_DIFFUSION__LARG_ZONE_DIFFUSION:
				setLargZoneDiffusion((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ZONE_DIFFUSION__HAUT_ZONE_DIFFUSION:
				setHautZoneDiffusion((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_ZONE_DIFFUSION__LARG_ZONE_DIFFUSION:
				return largZoneDiffusion != null;
			case SchemaPackage.TYPE_ZONE_DIFFUSION__HAUT_ZONE_DIFFUSION:
				return hautZoneDiffusion != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeZoneDiffusionImpl
