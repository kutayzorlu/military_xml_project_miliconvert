/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationUniteMissionMelee;
import mpia.schema.TypeDictionaryDicoAssociationUniteMissionMeleeCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Unite Mission Melee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionMeleeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionMeleeImpl#getAPourSujetUnite <em>APour Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionMeleeImpl#getAPourObjetMissionMelee <em>APour Objet Mission Melee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationUniteMissionMeleeImpl extends TypeAssociationInstanceObjetActiviteImpl implements TypeAssociationUniteMissionMelee {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationUniteMissionMeleeCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationUniteMissionMeleeCategorie.CONTRL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationUniteMissionMeleeCategorie categorie = CATEGORIE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourObjetMissionMelee() <em>APour Objet Mission Melee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetMissionMelee()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetMissionMelee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationUniteMissionMeleeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationUniteMissionMelee();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationUniteMissionMeleeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationUniteMissionMeleeCategorie newCategorie) {
		TypeDictionaryDicoAssociationUniteMissionMeleeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationUniteMissionMeleeCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_SUJET_UNITE, oldAPourSujetUnite, newAPourSujetUnite);
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
				msgs = ((InternalEObject)aPourSujetUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_SUJET_UNITE, null, msgs);
			if (newAPourSujetUnite != null)
				msgs = ((InternalEObject)newAPourSujetUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_SUJET_UNITE, null, msgs);
			msgs = basicSetAPourSujetUnite(newAPourSujetUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_SUJET_UNITE, newAPourSujetUnite, newAPourSujetUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetMissionMelee() {
		return aPourObjetMissionMelee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetMissionMelee(TypeAssociation newAPourObjetMissionMelee, NotificationChain msgs) {
		TypeAssociation oldAPourObjetMissionMelee = aPourObjetMissionMelee;
		aPourObjetMissionMelee = newAPourObjetMissionMelee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_OBJET_MISSION_MELEE, oldAPourObjetMissionMelee, newAPourObjetMissionMelee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetMissionMelee(TypeAssociation newAPourObjetMissionMelee) {
		if (newAPourObjetMissionMelee != aPourObjetMissionMelee) {
			NotificationChain msgs = null;
			if (aPourObjetMissionMelee != null)
				msgs = ((InternalEObject)aPourObjetMissionMelee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_OBJET_MISSION_MELEE, null, msgs);
			if (newAPourObjetMissionMelee != null)
				msgs = ((InternalEObject)newAPourObjetMissionMelee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_OBJET_MISSION_MELEE, null, msgs);
			msgs = basicSetAPourObjetMissionMelee(newAPourObjetMissionMelee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_OBJET_MISSION_MELEE, newAPourObjetMissionMelee, newAPourObjetMissionMelee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_SUJET_UNITE:
				return basicSetAPourSujetUnite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_OBJET_MISSION_MELEE:
				return basicSetAPourObjetMissionMelee(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_SUJET_UNITE:
				return getAPourSujetUnite();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_OBJET_MISSION_MELEE:
				return getAPourObjetMissionMelee();
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationUniteMissionMeleeCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_OBJET_MISSION_MELEE:
				setAPourObjetMissionMelee((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_OBJET_MISSION_MELEE:
				setAPourObjetMissionMelee((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_SUJET_UNITE:
				return aPourSujetUnite != null;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_MELEE__APOUR_OBJET_MISSION_MELEE:
				return aPourObjetMissionMelee != null;
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

} //TypeAssociationUniteMissionMeleeImpl
