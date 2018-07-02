/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationSiteTypeSite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Site Type Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationSiteTypeSiteImpl#getAssocieCommeObjetSite <em>Associe Comme Objet Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationSiteTypeSiteImpl#getAssocieCommeTypeTypeSite <em>Associe Comme Type Type Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationSiteTypeSiteImpl extends TypeAssociationInstanceObjetTypeImpl implements TypeAssociationSiteTypeSite {
	/**
	 * The cached value of the '{@link #getAssocieCommeObjetSite() <em>Associe Comme Objet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetSite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetSite;

	/**
	 * The cached value of the '{@link #getAssocieCommeTypeTypeSite() <em>Associe Comme Type Type Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeTypeSite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeTypeTypeSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationSiteTypeSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationSiteTypeSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetSite() {
		return associeCommeObjetSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetSite(TypeAssociation newAssocieCommeObjetSite, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetSite = associeCommeObjetSite;
		associeCommeObjetSite = newAssocieCommeObjetSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_OBJET_SITE, oldAssocieCommeObjetSite, newAssocieCommeObjetSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetSite(TypeAssociation newAssocieCommeObjetSite) {
		if (newAssocieCommeObjetSite != associeCommeObjetSite) {
			NotificationChain msgs = null;
			if (associeCommeObjetSite != null)
				msgs = ((InternalEObject)associeCommeObjetSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_OBJET_SITE, null, msgs);
			if (newAssocieCommeObjetSite != null)
				msgs = ((InternalEObject)newAssocieCommeObjetSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_OBJET_SITE, null, msgs);
			msgs = basicSetAssocieCommeObjetSite(newAssocieCommeObjetSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_OBJET_SITE, newAssocieCommeObjetSite, newAssocieCommeObjetSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeTypeTypeSite() {
		return associeCommeTypeTypeSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeTypeSite(TypeAssociation newAssocieCommeTypeTypeSite, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeTypeTypeSite = associeCommeTypeTypeSite;
		associeCommeTypeTypeSite = newAssocieCommeTypeTypeSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_TYPE_TYPE_SITE, oldAssocieCommeTypeTypeSite, newAssocieCommeTypeTypeSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeTypeSite(TypeAssociation newAssocieCommeTypeTypeSite) {
		if (newAssocieCommeTypeTypeSite != associeCommeTypeTypeSite) {
			NotificationChain msgs = null;
			if (associeCommeTypeTypeSite != null)
				msgs = ((InternalEObject)associeCommeTypeTypeSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_TYPE_TYPE_SITE, null, msgs);
			if (newAssocieCommeTypeTypeSite != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypeSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_TYPE_TYPE_SITE, null, msgs);
			msgs = basicSetAssocieCommeTypeTypeSite(newAssocieCommeTypeTypeSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_TYPE_TYPE_SITE, newAssocieCommeTypeTypeSite, newAssocieCommeTypeTypeSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_OBJET_SITE:
				return basicSetAssocieCommeObjetSite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_TYPE_TYPE_SITE:
				return basicSetAssocieCommeTypeTypeSite(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_OBJET_SITE:
				return getAssocieCommeObjetSite();
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_TYPE_TYPE_SITE:
				return getAssocieCommeTypeTypeSite();
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_OBJET_SITE:
				setAssocieCommeObjetSite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_TYPE_TYPE_SITE:
				setAssocieCommeTypeTypeSite((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_OBJET_SITE:
				setAssocieCommeObjetSite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_TYPE_TYPE_SITE:
				setAssocieCommeTypeTypeSite((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_OBJET_SITE:
				return associeCommeObjetSite != null;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_TYPE_SITE__ASSOCIE_COMME_TYPE_TYPE_SITE:
				return associeCommeTypeTypeSite != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAssociationSiteTypeSiteImpl
