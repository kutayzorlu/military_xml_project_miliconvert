/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationUniteMissionASA;
import mpia.schema.TypeDictionaryDicoAssociationUniteMissionASACategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Unite Mission ASA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionASAImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionASAImpl#getAPourSujetUnite <em>APour Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionASAImpl#getAPourObjetMissionASA <em>APour Objet Mission ASA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationUniteMissionASAImpl extends TypeAssociationInstanceObjetActiviteImpl implements TypeAssociationUniteMissionASA {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationUniteMissionASACategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationUniteMissionASACategorie.UNDEFE;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationUniteMissionASACategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourSujetUnite() <em>APour Sujet Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetUnite;

	/**
	 * The cached value of the '{@link #getAPourObjetMissionASA() <em>APour Objet Mission ASA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetMissionASA()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetMissionASA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationUniteMissionASAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationUniteMissionASA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationUniteMissionASACategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationUniteMissionASACategorie newCategorie) {
		TypeDictionaryDicoAssociationUniteMissionASACategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationUniteMissionASACategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourSujetUnite() {
		return aPourSujetUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetUnite(TypeAssociation newAPourSujetUnite, NotificationChain msgs) {
		TypeAssociation oldAPourSujetUnite = aPourSujetUnite;
		aPourSujetUnite = newAPourSujetUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_SUJET_UNITE, oldAPourSujetUnite, newAPourSujetUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetUnite(TypeAssociation newAPourSujetUnite) {
		if (newAPourSujetUnite != aPourSujetUnite) {
			NotificationChain msgs = null;
			if (aPourSujetUnite != null)
				msgs = ((InternalEObject)aPourSujetUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_SUJET_UNITE, null, msgs);
			if (newAPourSujetUnite != null)
				msgs = ((InternalEObject)newAPourSujetUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_SUJET_UNITE, null, msgs);
			msgs = basicSetAPourSujetUnite(newAPourSujetUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_SUJET_UNITE, newAPourSujetUnite, newAPourSujetUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetMissionASA() {
		return aPourObjetMissionASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetMissionASA(TypeAssociation newAPourObjetMissionASA, NotificationChain msgs) {
		TypeAssociation oldAPourObjetMissionASA = aPourObjetMissionASA;
		aPourObjetMissionASA = newAPourObjetMissionASA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_OBJET_MISSION_ASA, oldAPourObjetMissionASA, newAPourObjetMissionASA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetMissionASA(TypeAssociation newAPourObjetMissionASA) {
		if (newAPourObjetMissionASA != aPourObjetMissionASA) {
			NotificationChain msgs = null;
			if (aPourObjetMissionASA != null)
				msgs = ((InternalEObject)aPourObjetMissionASA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_OBJET_MISSION_ASA, null, msgs);
			if (newAPourObjetMissionASA != null)
				msgs = ((InternalEObject)newAPourObjetMissionASA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_OBJET_MISSION_ASA, null, msgs);
			msgs = basicSetAPourObjetMissionASA(newAPourObjetMissionASA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_OBJET_MISSION_ASA, newAPourObjetMissionASA, newAPourObjetMissionASA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_SUJET_UNITE:
				return basicSetAPourSujetUnite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_OBJET_MISSION_ASA:
				return basicSetAPourObjetMissionASA(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_SUJET_UNITE:
				return getAPourSujetUnite();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_OBJET_MISSION_ASA:
				return getAPourObjetMissionASA();
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationUniteMissionASACategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_OBJET_MISSION_ASA:
				setAPourObjetMissionASA((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_OBJET_MISSION_ASA:
				setAPourObjetMissionASA((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_SUJET_UNITE:
				return aPourSujetUnite != null;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ASA__APOUR_OBJET_MISSION_ASA:
				return aPourObjetMissionASA != null;
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

} //TypeAssociationUniteMissionASAImpl
