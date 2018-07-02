/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutreDotationEffective;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Dotation Effective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreDotationEffectiveImpl#getAssocieCommeTypeTypeEntiteOrganisationnelle <em>Associe Comme Type Type Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreDotationEffectiveImpl#getAssocieCommeTypeTypeSite <em>Associe Comme Type Type Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreDotationEffectiveImpl extends TypeDotationEffectiveImpl implements TypeAutreDotationEffective {
	/**
	 * The cached value of the '{@link #getAssocieCommeTypeTypeEntiteOrganisationnelle() <em>Associe Comme Type Type Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeTypeEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeTypeTypeEntiteOrganisationnelle;

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
	protected TypeAutreDotationEffectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreDotationEffective();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeTypeTypeEntiteOrganisationnelle() {
		return associeCommeTypeTypeEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeTypeEntiteOrganisationnelle(TypeAssociation newAssocieCommeTypeTypeEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeTypeTypeEntiteOrganisationnelle = associeCommeTypeTypeEntiteOrganisationnelle;
		associeCommeTypeTypeEntiteOrganisationnelle = newAssocieCommeTypeTypeEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE, oldAssocieCommeTypeTypeEntiteOrganisationnelle, newAssocieCommeTypeTypeEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeTypeEntiteOrganisationnelle(TypeAssociation newAssocieCommeTypeTypeEntiteOrganisationnelle) {
		if (newAssocieCommeTypeTypeEntiteOrganisationnelle != associeCommeTypeTypeEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (associeCommeTypeTypeEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)associeCommeTypeTypeEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAssocieCommeTypeTypeEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypeEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAssocieCommeTypeTypeEntiteOrganisationnelle(newAssocieCommeTypeTypeEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE, newAssocieCommeTypeTypeEntiteOrganisationnelle, newAssocieCommeTypeTypeEntiteOrganisationnelle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_SITE, oldAssocieCommeTypeTypeSite, newAssocieCommeTypeTypeSite);
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
				msgs = ((InternalEObject)associeCommeTypeTypeSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_SITE, null, msgs);
			if (newAssocieCommeTypeTypeSite != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypeSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_SITE, null, msgs);
			msgs = basicSetAssocieCommeTypeTypeSite(newAssocieCommeTypeTypeSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_SITE, newAssocieCommeTypeTypeSite, newAssocieCommeTypeTypeSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				return basicSetAssocieCommeTypeTypeEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_SITE:
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
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				return getAssocieCommeTypeTypeEntiteOrganisationnelle();
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_SITE:
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
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				setAssocieCommeTypeTypeEntiteOrganisationnelle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_SITE:
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
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				setAssocieCommeTypeTypeEntiteOrganisationnelle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_SITE:
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
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_ENTITE_ORGANISATIONNELLE:
				return associeCommeTypeTypeEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_AUTRE_DOTATION_EFFECTIVE__ASSOCIE_COMME_TYPE_TYPE_SITE:
				return associeCommeTypeTypeSite != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAutreDotationEffectiveImpl
