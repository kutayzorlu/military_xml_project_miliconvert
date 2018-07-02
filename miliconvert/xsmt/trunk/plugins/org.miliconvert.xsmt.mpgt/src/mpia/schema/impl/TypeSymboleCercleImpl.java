/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeSymboleCercle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Symbole Cercle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSymboleCercleImpl#getRayon <em>Rayon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSymboleCercleImpl extends TypeSymboleSurfaciqueImpl implements TypeSymboleCercle {
	/**
	 * The cached value of the '{@link #getRayon() <em>Rayon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayon()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSymboleCercleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSymboleCercle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayon() {
		return rayon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayon(TypeDataTypeLongueur newRayon, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayon = rayon;
		rayon = newRayon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_CERCLE__RAYON, oldRayon, newRayon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayon(TypeDataTypeLongueur newRayon) {
		if (newRayon != rayon) {
			NotificationChain msgs = null;
			if (rayon != null)
				msgs = ((InternalEObject)rayon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYMBOLE_CERCLE__RAYON, null, msgs);
			if (newRayon != null)
				msgs = ((InternalEObject)newRayon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYMBOLE_CERCLE__RAYON, null, msgs);
			msgs = basicSetRayon(newRayon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_CERCLE__RAYON, newRayon, newRayon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYMBOLE_CERCLE__RAYON:
				return basicSetRayon(null, msgs);
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
			case SchemaPackage.TYPE_SYMBOLE_CERCLE__RAYON:
				return getRayon();
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
			case SchemaPackage.TYPE_SYMBOLE_CERCLE__RAYON:
				setRayon((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_SYMBOLE_CERCLE__RAYON:
				setRayon((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_SYMBOLE_CERCLE__RAYON:
				return rayon != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeSymboleCercleImpl
