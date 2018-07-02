/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationMesureCoordinationPlanFeux;
import mpia.schema.TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Mesure Coordination Plan Feux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMesureCoordinationPlanFeuxImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMesureCoordinationPlanFeuxImpl#getAPourSujetMesureCoordination <em>APour Sujet Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMesureCoordinationPlanFeuxImpl#getAPourObjetPlanFeux <em>APour Objet Plan Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMesureCoordinationPlanFeuxImpl extends TypeAssociationInstanceObjetActiviteImpl implements TypeAssociationMesureCoordinationPlanFeux {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie.REFER;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourSujetMesureCoordination() <em>APour Sujet Mesure Coordination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourObjetPlanFeux() <em>APour Objet Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetPlanFeux()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetPlanFeux;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationMesureCoordinationPlanFeuxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMesureCoordinationPlanFeux();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie newCategorie) {
		TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSujetMesureCoordination() {
		return aPourSujetMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetMesureCoordination(TypeAssociation newAPourSujetMesureCoordination, NotificationChain msgs) {
		TypeAssociation oldAPourSujetMesureCoordination = aPourSujetMesureCoordination;
		aPourSujetMesureCoordination = newAPourSujetMesureCoordination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_SUJET_MESURE_COORDINATION, oldAPourSujetMesureCoordination, newAPourSujetMesureCoordination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetMesureCoordination(TypeAssociation newAPourSujetMesureCoordination) {
		if (newAPourSujetMesureCoordination != aPourSujetMesureCoordination) {
			NotificationChain msgs = null;
			if (aPourSujetMesureCoordination != null)
				msgs = ((InternalEObject)aPourSujetMesureCoordination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_SUJET_MESURE_COORDINATION, null, msgs);
			if (newAPourSujetMesureCoordination != null)
				msgs = ((InternalEObject)newAPourSujetMesureCoordination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_SUJET_MESURE_COORDINATION, null, msgs);
			msgs = basicSetAPourSujetMesureCoordination(newAPourSujetMesureCoordination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_SUJET_MESURE_COORDINATION, newAPourSujetMesureCoordination, newAPourSujetMesureCoordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetPlanFeux() {
		return aPourObjetPlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetPlanFeux(TypeAssociation newAPourObjetPlanFeux, NotificationChain msgs) {
		TypeAssociation oldAPourObjetPlanFeux = aPourObjetPlanFeux;
		aPourObjetPlanFeux = newAPourObjetPlanFeux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_OBJET_PLAN_FEUX, oldAPourObjetPlanFeux, newAPourObjetPlanFeux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetPlanFeux(TypeAssociation newAPourObjetPlanFeux) {
		if (newAPourObjetPlanFeux != aPourObjetPlanFeux) {
			NotificationChain msgs = null;
			if (aPourObjetPlanFeux != null)
				msgs = ((InternalEObject)aPourObjetPlanFeux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_OBJET_PLAN_FEUX, null, msgs);
			if (newAPourObjetPlanFeux != null)
				msgs = ((InternalEObject)newAPourObjetPlanFeux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_OBJET_PLAN_FEUX, null, msgs);
			msgs = basicSetAPourObjetPlanFeux(newAPourObjetPlanFeux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_OBJET_PLAN_FEUX, newAPourObjetPlanFeux, newAPourObjetPlanFeux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_SUJET_MESURE_COORDINATION:
				return basicSetAPourSujetMesureCoordination(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_OBJET_PLAN_FEUX:
				return basicSetAPourObjetPlanFeux(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_SUJET_MESURE_COORDINATION:
				return getAPourSujetMesureCoordination();
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_OBJET_PLAN_FEUX:
				return getAPourObjetPlanFeux();
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
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_SUJET_MESURE_COORDINATION:
				setAPourSujetMesureCoordination((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_OBJET_PLAN_FEUX:
				setAPourObjetPlanFeux((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_SUJET_MESURE_COORDINATION:
				setAPourSujetMesureCoordination((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_OBJET_PLAN_FEUX:
				setAPourObjetPlanFeux((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_SUJET_MESURE_COORDINATION:
				return aPourSujetMesureCoordination != null;
			case SchemaPackage.TYPE_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX__APOUR_OBJET_PLAN_FEUX:
				return aPourObjetPlanFeux != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationMesureCoordinationPlanFeuxImpl
