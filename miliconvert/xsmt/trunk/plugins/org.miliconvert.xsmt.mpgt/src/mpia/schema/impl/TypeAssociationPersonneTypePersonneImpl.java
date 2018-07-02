/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationPersonneTypePersonne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Personne Type Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneTypePersonneImpl#getAssocieCommeTypeTypePersonne <em>Associe Comme Type Type Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneTypePersonneImpl#getAssocieCommeObjetPersonne <em>Associe Comme Objet Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationPersonneTypePersonneImpl extends TypeAssociationInstanceObjetTypeImpl implements TypeAssociationPersonneTypePersonne {
	/**
	 * The cached value of the '{@link #getAssocieCommeTypeTypePersonne() <em>Associe Comme Type Type Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeTypePersonne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeTypeTypePersonne;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetPersonne() <em>Associe Comme Objet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetPersonne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetPersonne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationPersonneTypePersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationPersonneTypePersonne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAssocieCommeTypeTypePersonne() {
		return associeCommeTypeTypePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeTypePersonne(TypeAssociationEXT newAssocieCommeTypeTypePersonne, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeTypeTypePersonne = associeCommeTypeTypePersonne;
		associeCommeTypeTypePersonne = newAssocieCommeTypeTypePersonne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_TYPE_TYPE_PERSONNE, oldAssocieCommeTypeTypePersonne, newAssocieCommeTypeTypePersonne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeTypePersonne(TypeAssociationEXT newAssocieCommeTypeTypePersonne) {
		if (newAssocieCommeTypeTypePersonne != associeCommeTypeTypePersonne) {
			NotificationChain msgs = null;
			if (associeCommeTypeTypePersonne != null)
				msgs = ((InternalEObject)associeCommeTypeTypePersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_TYPE_TYPE_PERSONNE, null, msgs);
			if (newAssocieCommeTypeTypePersonne != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypePersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_TYPE_TYPE_PERSONNE, null, msgs);
			msgs = basicSetAssocieCommeTypeTypePersonne(newAssocieCommeTypeTypePersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_TYPE_TYPE_PERSONNE, newAssocieCommeTypeTypePersonne, newAssocieCommeTypeTypePersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetPersonne() {
		return associeCommeObjetPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetPersonne(TypeAssociation newAssocieCommeObjetPersonne, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetPersonne = associeCommeObjetPersonne;
		associeCommeObjetPersonne = newAssocieCommeObjetPersonne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_OBJET_PERSONNE, oldAssocieCommeObjetPersonne, newAssocieCommeObjetPersonne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetPersonne(TypeAssociation newAssocieCommeObjetPersonne) {
		if (newAssocieCommeObjetPersonne != associeCommeObjetPersonne) {
			NotificationChain msgs = null;
			if (associeCommeObjetPersonne != null)
				msgs = ((InternalEObject)associeCommeObjetPersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_OBJET_PERSONNE, null, msgs);
			if (newAssocieCommeObjetPersonne != null)
				msgs = ((InternalEObject)newAssocieCommeObjetPersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_OBJET_PERSONNE, null, msgs);
			msgs = basicSetAssocieCommeObjetPersonne(newAssocieCommeObjetPersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_OBJET_PERSONNE, newAssocieCommeObjetPersonne, newAssocieCommeObjetPersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				return basicSetAssocieCommeTypeTypePersonne(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_OBJET_PERSONNE:
				return basicSetAssocieCommeObjetPersonne(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				return getAssocieCommeTypeTypePersonne();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_OBJET_PERSONNE:
				return getAssocieCommeObjetPersonne();
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				setAssocieCommeTypeTypePersonne((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_OBJET_PERSONNE:
				setAssocieCommeObjetPersonne((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				setAssocieCommeTypeTypePersonne((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_OBJET_PERSONNE:
				setAssocieCommeObjetPersonne((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				return associeCommeTypeTypePersonne != null;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE__ASSOCIE_COMME_OBJET_PERSONNE:
				return associeCommeObjetPersonne != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAssociationPersonneTypePersonneImpl
