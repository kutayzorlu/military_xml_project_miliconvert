/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCylindreGeometrique;
import mpia.schema.TypeObjetGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Cylindre Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCylindreGeometriqueImpl#getAPourSectionObjetGeometrique <em>APour Section Objet Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCylindreGeometriqueImpl extends TypeVolumeGeometriqueImpl implements TypeCylindreGeometrique {
	/**
	 * The cached value of the '{@link #getAPourSectionObjetGeometrique() <em>APour Section Objet Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSectionObjetGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeObjetGeometrique aPourSectionObjetGeometrique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCylindreGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCylindreGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjetGeometrique getAPourSectionObjetGeometrique() {
		return aPourSectionObjetGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSectionObjetGeometrique(TypeObjetGeometrique newAPourSectionObjetGeometrique, NotificationChain msgs) {
		TypeObjetGeometrique oldAPourSectionObjetGeometrique = aPourSectionObjetGeometrique;
		aPourSectionObjetGeometrique = newAPourSectionObjetGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE__APOUR_SECTION_OBJET_GEOMETRIQUE, oldAPourSectionObjetGeometrique, newAPourSectionObjetGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSectionObjetGeometrique(TypeObjetGeometrique newAPourSectionObjetGeometrique) {
		if (newAPourSectionObjetGeometrique != aPourSectionObjetGeometrique) {
			NotificationChain msgs = null;
			if (aPourSectionObjetGeometrique != null)
				msgs = ((InternalEObject)aPourSectionObjetGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE__APOUR_SECTION_OBJET_GEOMETRIQUE, null, msgs);
			if (newAPourSectionObjetGeometrique != null)
				msgs = ((InternalEObject)newAPourSectionObjetGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE__APOUR_SECTION_OBJET_GEOMETRIQUE, null, msgs);
			msgs = basicSetAPourSectionObjetGeometrique(newAPourSectionObjetGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE__APOUR_SECTION_OBJET_GEOMETRIQUE, newAPourSectionObjetGeometrique, newAPourSectionObjetGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE__APOUR_SECTION_OBJET_GEOMETRIQUE:
				return basicSetAPourSectionObjetGeometrique(null, msgs);
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
			case SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE__APOUR_SECTION_OBJET_GEOMETRIQUE:
				return getAPourSectionObjetGeometrique();
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
			case SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE__APOUR_SECTION_OBJET_GEOMETRIQUE:
				setAPourSectionObjetGeometrique((TypeObjetGeometrique)newValue);
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
			case SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE__APOUR_SECTION_OBJET_GEOMETRIQUE:
				setAPourSectionObjetGeometrique((TypeObjetGeometrique)null);
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
			case SchemaPackage.TYPE_CYLINDRE_GEOMETRIQUE__APOUR_SECTION_OBJET_GEOMETRIQUE:
				return aPourSectionObjetGeometrique != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeCylindreGeometriqueImpl
