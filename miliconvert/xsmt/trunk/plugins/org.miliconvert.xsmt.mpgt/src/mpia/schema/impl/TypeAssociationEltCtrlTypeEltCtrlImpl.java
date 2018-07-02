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
import mpia.schema.TypeAssociationEltCtrlTypeEltCtrl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Elt Ctrl Type Elt Ctrl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationEltCtrlTypeEltCtrlImpl#getAssocieCommeObjetElementControle <em>Associe Comme Objet Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEltCtrlTypeEltCtrlImpl#getAssocieCommeTypeTypeElementControle <em>Associe Comme Type Type Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEltCtrlTypeEltCtrlImpl extends TypeAssociationInstanceObjetTypeImpl implements TypeAssociationEltCtrlTypeEltCtrl {
	/**
	 * The cached value of the '{@link #getAssocieCommeObjetElementControle() <em>Associe Comme Objet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetElementControle;

	/**
	 * The cached value of the '{@link #getAssocieCommeTypeTypeElementControle() <em>Associe Comme Type Type Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeTypeElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeTypeTypeElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEltCtrlTypeEltCtrlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationEltCtrlTypeEltCtrl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetElementControle() {
		return associeCommeObjetElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetElementControle(TypeAssociation newAssocieCommeObjetElementControle, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetElementControle = associeCommeObjetElementControle;
		associeCommeObjetElementControle = newAssocieCommeObjetElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_OBJET_ELEMENT_CONTROLE, oldAssocieCommeObjetElementControle, newAssocieCommeObjetElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetElementControle(TypeAssociation newAssocieCommeObjetElementControle) {
		if (newAssocieCommeObjetElementControle != associeCommeObjetElementControle) {
			NotificationChain msgs = null;
			if (associeCommeObjetElementControle != null)
				msgs = ((InternalEObject)associeCommeObjetElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_OBJET_ELEMENT_CONTROLE, null, msgs);
			if (newAssocieCommeObjetElementControle != null)
				msgs = ((InternalEObject)newAssocieCommeObjetElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_OBJET_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAssocieCommeObjetElementControle(newAssocieCommeObjetElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_OBJET_ELEMENT_CONTROLE, newAssocieCommeObjetElementControle, newAssocieCommeObjetElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAssocieCommeTypeTypeElementControle() {
		return associeCommeTypeTypeElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeTypeElementControle(TypeAssociationEXT newAssocieCommeTypeTypeElementControle, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeTypeTypeElementControle = associeCommeTypeTypeElementControle;
		associeCommeTypeTypeElementControle = newAssocieCommeTypeTypeElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_TYPE_TYPE_ELEMENT_CONTROLE, oldAssocieCommeTypeTypeElementControle, newAssocieCommeTypeTypeElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeTypeElementControle(TypeAssociationEXT newAssocieCommeTypeTypeElementControle) {
		if (newAssocieCommeTypeTypeElementControle != associeCommeTypeTypeElementControle) {
			NotificationChain msgs = null;
			if (associeCommeTypeTypeElementControle != null)
				msgs = ((InternalEObject)associeCommeTypeTypeElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_TYPE_TYPE_ELEMENT_CONTROLE, null, msgs);
			if (newAssocieCommeTypeTypeElementControle != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypeElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_TYPE_TYPE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAssocieCommeTypeTypeElementControle(newAssocieCommeTypeTypeElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_TYPE_TYPE_ELEMENT_CONTROLE, newAssocieCommeTypeTypeElementControle, newAssocieCommeTypeTypeElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_OBJET_ELEMENT_CONTROLE:
				return basicSetAssocieCommeObjetElementControle(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_TYPE_TYPE_ELEMENT_CONTROLE:
				return basicSetAssocieCommeTypeTypeElementControle(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_OBJET_ELEMENT_CONTROLE:
				return getAssocieCommeObjetElementControle();
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_TYPE_TYPE_ELEMENT_CONTROLE:
				return getAssocieCommeTypeTypeElementControle();
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
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_OBJET_ELEMENT_CONTROLE:
				setAssocieCommeObjetElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_TYPE_TYPE_ELEMENT_CONTROLE:
				setAssocieCommeTypeTypeElementControle((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_OBJET_ELEMENT_CONTROLE:
				setAssocieCommeObjetElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_TYPE_TYPE_ELEMENT_CONTROLE:
				setAssocieCommeTypeTypeElementControle((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_OBJET_ELEMENT_CONTROLE:
				return associeCommeObjetElementControle != null;
			case SchemaPackage.TYPE_ASSOCIATION_ELT_CTRL_TYPE_ELT_CTRL__ASSOCIE_COMME_TYPE_TYPE_ELEMENT_CONTROLE:
				return associeCommeTypeTypeElementControle != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAssociationEltCtrlTypeEltCtrlImpl
