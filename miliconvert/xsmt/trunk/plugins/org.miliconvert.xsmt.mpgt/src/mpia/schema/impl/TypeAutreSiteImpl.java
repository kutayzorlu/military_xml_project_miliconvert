/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutreSite;
import mpia.schema.TypeCaracteristiqueAutreSite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreSiteImpl#getCaracAutreSiteCaracteristiqueAutreSite <em>Carac Autre Site Caracteristique Autre Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreSiteImpl extends TypeSiteImpl implements TypeAutreSite {
	/**
	 * The cached value of the '{@link #getCaracAutreSiteCaracteristiqueAutreSite() <em>Carac Autre Site Caracteristique Autre Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracAutreSiteCaracteristiqueAutreSite()
	 * @generated
	 * @ordered
	 */
	protected TypeCaracteristiqueAutreSite caracAutreSiteCaracteristiqueAutreSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCaracteristiqueAutreSite getCaracAutreSiteCaracteristiqueAutreSite() {
		return caracAutreSiteCaracteristiqueAutreSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracAutreSiteCaracteristiqueAutreSite(TypeCaracteristiqueAutreSite newCaracAutreSiteCaracteristiqueAutreSite, NotificationChain msgs) {
		TypeCaracteristiqueAutreSite oldCaracAutreSiteCaracteristiqueAutreSite = caracAutreSiteCaracteristiqueAutreSite;
		caracAutreSiteCaracteristiqueAutreSite = newCaracAutreSiteCaracteristiqueAutreSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_SITE__CARAC_AUTRE_SITE_CARACTERISTIQUE_AUTRE_SITE, oldCaracAutreSiteCaracteristiqueAutreSite, newCaracAutreSiteCaracteristiqueAutreSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracAutreSiteCaracteristiqueAutreSite(TypeCaracteristiqueAutreSite newCaracAutreSiteCaracteristiqueAutreSite) {
		if (newCaracAutreSiteCaracteristiqueAutreSite != caracAutreSiteCaracteristiqueAutreSite) {
			NotificationChain msgs = null;
			if (caracAutreSiteCaracteristiqueAutreSite != null)
				msgs = ((InternalEObject)caracAutreSiteCaracteristiqueAutreSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_SITE__CARAC_AUTRE_SITE_CARACTERISTIQUE_AUTRE_SITE, null, msgs);
			if (newCaracAutreSiteCaracteristiqueAutreSite != null)
				msgs = ((InternalEObject)newCaracAutreSiteCaracteristiqueAutreSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_SITE__CARAC_AUTRE_SITE_CARACTERISTIQUE_AUTRE_SITE, null, msgs);
			msgs = basicSetCaracAutreSiteCaracteristiqueAutreSite(newCaracAutreSiteCaracteristiqueAutreSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_SITE__CARAC_AUTRE_SITE_CARACTERISTIQUE_AUTRE_SITE, newCaracAutreSiteCaracteristiqueAutreSite, newCaracAutreSiteCaracteristiqueAutreSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_SITE__CARAC_AUTRE_SITE_CARACTERISTIQUE_AUTRE_SITE:
				return basicSetCaracAutreSiteCaracteristiqueAutreSite(null, msgs);
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
			case SchemaPackage.TYPE_AUTRE_SITE__CARAC_AUTRE_SITE_CARACTERISTIQUE_AUTRE_SITE:
				return getCaracAutreSiteCaracteristiqueAutreSite();
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
			case SchemaPackage.TYPE_AUTRE_SITE__CARAC_AUTRE_SITE_CARACTERISTIQUE_AUTRE_SITE:
				setCaracAutreSiteCaracteristiqueAutreSite((TypeCaracteristiqueAutreSite)newValue);
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
			case SchemaPackage.TYPE_AUTRE_SITE__CARAC_AUTRE_SITE_CARACTERISTIQUE_AUTRE_SITE:
				setCaracAutreSiteCaracteristiqueAutreSite((TypeCaracteristiqueAutreSite)null);
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
			case SchemaPackage.TYPE_AUTRE_SITE__CARAC_AUTRE_SITE_CARACTERISTIQUE_AUTRE_SITE:
				return caracAutreSiteCaracteristiqueAutreSite != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAutreSiteImpl
