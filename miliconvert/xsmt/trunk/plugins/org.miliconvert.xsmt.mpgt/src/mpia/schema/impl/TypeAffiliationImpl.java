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
import mpia.schema.TypeAffiliation;
import mpia.schema.TypeLangue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Affiliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAffiliationImpl#getAPourLangueLangue <em>APour Langue Langue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAffiliationImpl#getEstObjetAssociationAffiliationAffiliation <em>Est Objet Association Affiliation Affiliation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAffiliationImpl#getEstSujetAssociationAffiliationAffiliation <em>Est Sujet Association Affiliation Affiliation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeAffiliationImpl extends TypeRacineOperationnelleImpl implements TypeAffiliation {
	/**
	 * The cached value of the '{@link #getAPourLangueLangue() <em>APour Langue Langue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLangueLangue()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeLangue> aPourLangueLangue;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationAffiliationAffiliation() <em>Est Objet Association Affiliation Affiliation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationAffiliationAffiliation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationAffiliationAffiliation;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationAffiliationAffiliation() <em>Est Sujet Association Affiliation Affiliation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationAffiliationAffiliation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationAffiliationAffiliation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAffiliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAffiliation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLangue> getAPourLangueLangue() {
		if (aPourLangueLangue == null) {
			aPourLangueLangue = new EObjectContainmentEList<TypeLangue>(TypeLangue.class, this, SchemaPackage.TYPE_AFFILIATION__APOUR_LANGUE_LANGUE);
		}
		return aPourLangueLangue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationAffiliationAffiliation() {
		if (estObjetAssociationAffiliationAffiliation == null) {
			estObjetAssociationAffiliationAffiliation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AFFILIATION__EST_OBJET_ASSOCIATION_AFFILIATION_AFFILIATION);
		}
		return estObjetAssociationAffiliationAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationAffiliationAffiliation() {
		if (estSujetAssociationAffiliationAffiliation == null) {
			estSujetAssociationAffiliationAffiliation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AFFILIATION__EST_SUJET_ASSOCIATION_AFFILIATION_AFFILIATION);
		}
		return estSujetAssociationAffiliationAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AFFILIATION__APOUR_LANGUE_LANGUE:
				return ((InternalEList<?>)getAPourLangueLangue()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AFFILIATION__EST_OBJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				return ((InternalEList<?>)getEstObjetAssociationAffiliationAffiliation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AFFILIATION__EST_SUJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				return ((InternalEList<?>)getEstSujetAssociationAffiliationAffiliation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_AFFILIATION__APOUR_LANGUE_LANGUE:
				return getAPourLangueLangue();
			case SchemaPackage.TYPE_AFFILIATION__EST_OBJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				return getEstObjetAssociationAffiliationAffiliation();
			case SchemaPackage.TYPE_AFFILIATION__EST_SUJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				return getEstSujetAssociationAffiliationAffiliation();
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
			case SchemaPackage.TYPE_AFFILIATION__APOUR_LANGUE_LANGUE:
				getAPourLangueLangue().clear();
				getAPourLangueLangue().addAll((Collection<? extends TypeLangue>)newValue);
				return;
			case SchemaPackage.TYPE_AFFILIATION__EST_OBJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				getEstObjetAssociationAffiliationAffiliation().clear();
				getEstObjetAssociationAffiliationAffiliation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_AFFILIATION__EST_SUJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				getEstSujetAssociationAffiliationAffiliation().clear();
				getEstSujetAssociationAffiliationAffiliation().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_AFFILIATION__APOUR_LANGUE_LANGUE:
				getAPourLangueLangue().clear();
				return;
			case SchemaPackage.TYPE_AFFILIATION__EST_OBJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				getEstObjetAssociationAffiliationAffiliation().clear();
				return;
			case SchemaPackage.TYPE_AFFILIATION__EST_SUJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				getEstSujetAssociationAffiliationAffiliation().clear();
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
			case SchemaPackage.TYPE_AFFILIATION__APOUR_LANGUE_LANGUE:
				return aPourLangueLangue != null && !aPourLangueLangue.isEmpty();
			case SchemaPackage.TYPE_AFFILIATION__EST_OBJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				return estObjetAssociationAffiliationAffiliation != null && !estObjetAssociationAffiliationAffiliation.isEmpty();
			case SchemaPackage.TYPE_AFFILIATION__EST_SUJET_ASSOCIATION_AFFILIATION_AFFILIATION:
				return estSujetAssociationAffiliationAffiliation != null && !estSujetAssociationAffiliationAffiliation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeAffiliationImpl
