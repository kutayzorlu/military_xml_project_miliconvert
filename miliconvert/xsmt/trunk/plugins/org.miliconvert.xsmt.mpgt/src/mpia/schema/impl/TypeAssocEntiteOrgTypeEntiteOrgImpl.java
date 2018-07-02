/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssocEntiteOrgTypeEntiteOrg;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Assoc Entite Org Type Entite Org</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssocEntiteOrgTypeEntiteOrgImpl#getAssocieCommeObjetEntiteOrganisationnelle <em>Associe Comme Objet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocEntiteOrgTypeEntiteOrgImpl#getAssocieCommeTypeTypeEntiteOrganisationnelle <em>Associe Comme Type Type Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssocEntiteOrgTypeEntiteOrgImpl extends TypeAssociationInstanceObjetTypeImpl implements TypeAssocEntiteOrgTypeEntiteOrg {
	/**
	 * The cached value of the '{@link #getAssocieCommeObjetEntiteOrganisationnelle() <em>Associe Comme Objet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeObjetEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getAssocieCommeTypeTypeEntiteOrganisationnelle() <em>Associe Comme Type Type Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeTypeEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeTypeTypeEntiteOrganisationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssocEntiteOrgTypeEntiteOrgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssocEntiteOrgTypeEntiteOrg();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAssocieCommeObjetEntiteOrganisationnelle() {
		return associeCommeObjetEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetEntiteOrganisationnelle(TypeAssociationEXT newAssocieCommeObjetEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeObjetEntiteOrganisationnelle = associeCommeObjetEntiteOrganisationnelle;
		associeCommeObjetEntiteOrganisationnelle = newAssocieCommeObjetEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_OBJET_ENTITE_ORGANISATIONNELLE, oldAssocieCommeObjetEntiteOrganisationnelle, newAssocieCommeObjetEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetEntiteOrganisationnelle(TypeAssociationEXT newAssocieCommeObjetEntiteOrganisationnelle) {
		if (newAssocieCommeObjetEntiteOrganisationnelle != associeCommeObjetEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (associeCommeObjetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)associeCommeObjetEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_OBJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAssocieCommeObjetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAssocieCommeObjetEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_OBJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAssocieCommeObjetEntiteOrganisationnelle(newAssocieCommeObjetEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_OBJET_ENTITE_ORGANISATIONNELLE, newAssocieCommeObjetEntiteOrganisationnelle, newAssocieCommeObjetEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAssocieCommeTypeTypeEntiteOrganisationnelle() {
		return associeCommeTypeTypeEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeTypeEntiteOrganisationnelle(TypeAssociationEXT newAssocieCommeTypeTypeEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeTypeTypeEntiteOrganisationnelle = associeCommeTypeTypeEntiteOrganisationnelle;
		associeCommeTypeTypeEntiteOrganisationnelle = newAssocieCommeTypeTypeEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE, oldAssocieCommeTypeTypeEntiteOrganisationnelle, newAssocieCommeTypeTypeEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeTypeEntiteOrganisationnelle(TypeAssociationEXT newAssocieCommeTypeTypeEntiteOrganisationnelle) {
		if (newAssocieCommeTypeTypeEntiteOrganisationnelle != associeCommeTypeTypeEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (associeCommeTypeTypeEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)associeCommeTypeTypeEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAssocieCommeTypeTypeEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypeEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAssocieCommeTypeTypeEntiteOrganisationnelle(newAssocieCommeTypeTypeEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE, newAssocieCommeTypeTypeEntiteOrganisationnelle, newAssocieCommeTypeTypeEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_OBJET_ENTITE_ORGANISATIONNELLE:
				return basicSetAssocieCommeObjetEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				return basicSetAssocieCommeTypeTypeEntiteOrganisationnelle(null, msgs);
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
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_OBJET_ENTITE_ORGANISATIONNELLE:
				return getAssocieCommeObjetEntiteOrganisationnelle();
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				return getAssocieCommeTypeTypeEntiteOrganisationnelle();
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
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_OBJET_ENTITE_ORGANISATIONNELLE:
				setAssocieCommeObjetEntiteOrganisationnelle((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				setAssocieCommeTypeTypeEntiteOrganisationnelle((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_OBJET_ENTITE_ORGANISATIONNELLE:
				setAssocieCommeObjetEntiteOrganisationnelle((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				setAssocieCommeTypeTypeEntiteOrganisationnelle((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_OBJET_ENTITE_ORGANISATIONNELLE:
				return associeCommeObjetEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_ASSOC_ENTITE_ORG_TYPE_ENTITE_ORG__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				return associeCommeTypeTypeEntiteOrganisationnelle != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAssocEntiteOrgTypeEntiteOrgImpl
