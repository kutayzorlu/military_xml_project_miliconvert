/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDotationEffectiveConsommable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Dotation Effective Consommable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveConsommableImpl#getAssocieCommeTypeTypeMateriel <em>Associe Comme Type Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveConsommableImpl#getConstitueSituationConsommable <em>Constitue Situation Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDotationEffectiveConsommableImpl extends TypeDotationEffectiveImpl implements TypeDotationEffectiveConsommable {
	/**
	 * The cached value of the '{@link #getAssocieCommeTypeTypeMateriel() <em>Associe Comme Type Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeTypeTypeMateriel;

	/**
	 * The cached value of the '{@link #getConstitueSituationConsommable() <em>Constitue Situation Consommable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstitueSituationConsommable()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> constitueSituationConsommable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDotationEffectiveConsommableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDotationEffectiveConsommable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeTypeTypeMateriel() {
		return associeCommeTypeTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeTypeMateriel(TypeAssociation newAssocieCommeTypeTypeMateriel, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeTypeTypeMateriel = associeCommeTypeTypeMateriel;
		associeCommeTypeTypeMateriel = newAssocieCommeTypeTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, oldAssocieCommeTypeTypeMateriel, newAssocieCommeTypeTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeTypeMateriel(TypeAssociation newAssocieCommeTypeTypeMateriel) {
		if (newAssocieCommeTypeTypeMateriel != associeCommeTypeTypeMateriel) {
			NotificationChain msgs = null;
			if (associeCommeTypeTypeMateriel != null)
				msgs = ((InternalEObject)associeCommeTypeTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, null, msgs);
			if (newAssocieCommeTypeTypeMateriel != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, null, msgs);
			msgs = basicSetAssocieCommeTypeTypeMateriel(newAssocieCommeTypeTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, newAssocieCommeTypeTypeMateriel, newAssocieCommeTypeTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConstitueSituationConsommable() {
		if (constitueSituationConsommable == null) {
			constitueSituationConsommable = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__CONSTITUE_SITUATION_CONSOMMABLE);
		}
		return constitueSituationConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				return basicSetAssocieCommeTypeTypeMateriel(null, msgs);
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__CONSTITUE_SITUATION_CONSOMMABLE:
				return ((InternalEList<?>)getConstitueSituationConsommable()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				return getAssocieCommeTypeTypeMateriel();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__CONSTITUE_SITUATION_CONSOMMABLE:
				return getConstitueSituationConsommable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				setAssocieCommeTypeTypeMateriel((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__CONSTITUE_SITUATION_CONSOMMABLE:
				getConstitueSituationConsommable().clear();
				getConstitueSituationConsommable().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				setAssocieCommeTypeTypeMateriel((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__CONSTITUE_SITUATION_CONSOMMABLE:
				getConstitueSituationConsommable().clear();
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				return associeCommeTypeTypeMateriel != null;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_CONSOMMABLE__CONSTITUE_SITUATION_CONSOMMABLE:
				return constitueSituationConsommable != null && !constitueSituationConsommable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeDotationEffectiveConsommableImpl
