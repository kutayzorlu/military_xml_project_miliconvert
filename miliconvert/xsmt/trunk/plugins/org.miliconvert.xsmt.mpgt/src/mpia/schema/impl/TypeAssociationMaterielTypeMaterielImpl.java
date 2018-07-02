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
import mpia.schema.TypeAssociationMaterielTypeMateriel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Materiel Type Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMaterielTypeMaterielImpl#getAssocieCommeTypeTypeMateriel <em>Associe Comme Type Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMaterielTypeMaterielImpl#getAssocieCommeObjetMateriel <em>Associe Comme Objet Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMaterielTypeMaterielImpl extends TypeAssociationInstanceObjetTypeImpl implements TypeAssociationMaterielTypeMateriel {
	/**
	 * The cached value of the '{@link #getAssocieCommeTypeTypeMateriel() <em>Associe Comme Type Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeTypeTypeMateriel;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetMateriel() <em>Associe Comme Objet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationMaterielTypeMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMaterielTypeMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAssocieCommeTypeTypeMateriel() {
		return associeCommeTypeTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeTypeMateriel(TypeAssociationEXT newAssocieCommeTypeTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeTypeTypeMateriel = associeCommeTypeTypeMateriel;
		associeCommeTypeTypeMateriel = newAssocieCommeTypeTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, oldAssocieCommeTypeTypeMateriel, newAssocieCommeTypeTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeTypeMateriel(TypeAssociationEXT newAssocieCommeTypeTypeMateriel) {
		if (newAssocieCommeTypeTypeMateriel != associeCommeTypeTypeMateriel) {
			NotificationChain msgs = null;
			if (associeCommeTypeTypeMateriel != null)
				msgs = ((InternalEObject)associeCommeTypeTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, null, msgs);
			if (newAssocieCommeTypeTypeMateriel != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, null, msgs);
			msgs = basicSetAssocieCommeTypeTypeMateriel(newAssocieCommeTypeTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, newAssocieCommeTypeTypeMateriel, newAssocieCommeTypeTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetMateriel() {
		return associeCommeObjetMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetMateriel(TypeAssociation newAssocieCommeObjetMateriel, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetMateriel = associeCommeObjetMateriel;
		associeCommeObjetMateriel = newAssocieCommeObjetMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_OBJET_MATERIEL, oldAssocieCommeObjetMateriel, newAssocieCommeObjetMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetMateriel(TypeAssociation newAssocieCommeObjetMateriel) {
		if (newAssocieCommeObjetMateriel != associeCommeObjetMateriel) {
			NotificationChain msgs = null;
			if (associeCommeObjetMateriel != null)
				msgs = ((InternalEObject)associeCommeObjetMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_OBJET_MATERIEL, null, msgs);
			if (newAssocieCommeObjetMateriel != null)
				msgs = ((InternalEObject)newAssocieCommeObjetMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_OBJET_MATERIEL, null, msgs);
			msgs = basicSetAssocieCommeObjetMateriel(newAssocieCommeObjetMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_OBJET_MATERIEL, newAssocieCommeObjetMateriel, newAssocieCommeObjetMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				return basicSetAssocieCommeTypeTypeMateriel(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_OBJET_MATERIEL:
				return basicSetAssocieCommeObjetMateriel(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				return getAssocieCommeTypeTypeMateriel();
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_OBJET_MATERIEL:
				return getAssocieCommeObjetMateriel();
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				setAssocieCommeTypeTypeMateriel((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_OBJET_MATERIEL:
				setAssocieCommeObjetMateriel((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				setAssocieCommeTypeTypeMateriel((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_OBJET_MATERIEL:
				setAssocieCommeObjetMateriel((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				return associeCommeTypeTypeMateriel != null;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL__ASSOCIE_COMME_OBJET_MATERIEL:
				return associeCommeObjetMateriel != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAssociationMaterielTypeMaterielImpl
