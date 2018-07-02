/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationUniteMissionAir;
import mpia.schema.TypeDictionaryDicoAssociationUniteMissionAirCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Unite Mission Air</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionAirImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionAirImpl#getAPourSujetUnite <em>APour Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionAirImpl#getAPourObjetMissionAir <em>APour Objet Mission Air</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationUniteMissionAirImpl extends TypeAssociationInstanceObjetActiviteImpl implements TypeAssociationUniteMissionAir {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationUniteMissionAirCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationUniteMissionAirCategorie.APPR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationUniteMissionAirCategorie categorie = CATEGORIE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourObjetMissionAir() <em>APour Objet Mission Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetMissionAir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetMissionAir;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationUniteMissionAirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationUniteMissionAir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationUniteMissionAirCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationUniteMissionAirCategorie newCategorie) {
		TypeDictionaryDicoAssociationUniteMissionAirCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationUniteMissionAirCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_SUJET_UNITE, oldAPourSujetUnite, newAPourSujetUnite);
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
				msgs = ((InternalEObject)aPourSujetUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_SUJET_UNITE, null, msgs);
			if (newAPourSujetUnite != null)
				msgs = ((InternalEObject)newAPourSujetUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_SUJET_UNITE, null, msgs);
			msgs = basicSetAPourSujetUnite(newAPourSujetUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_SUJET_UNITE, newAPourSujetUnite, newAPourSujetUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetMissionAir() {
		return aPourObjetMissionAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetMissionAir(TypeAssociation newAPourObjetMissionAir, NotificationChain msgs) {
		TypeAssociation oldAPourObjetMissionAir = aPourObjetMissionAir;
		aPourObjetMissionAir = newAPourObjetMissionAir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_OBJET_MISSION_AIR, oldAPourObjetMissionAir, newAPourObjetMissionAir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetMissionAir(TypeAssociation newAPourObjetMissionAir) {
		if (newAPourObjetMissionAir != aPourObjetMissionAir) {
			NotificationChain msgs = null;
			if (aPourObjetMissionAir != null)
				msgs = ((InternalEObject)aPourObjetMissionAir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_OBJET_MISSION_AIR, null, msgs);
			if (newAPourObjetMissionAir != null)
				msgs = ((InternalEObject)newAPourObjetMissionAir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_OBJET_MISSION_AIR, null, msgs);
			msgs = basicSetAPourObjetMissionAir(newAPourObjetMissionAir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_OBJET_MISSION_AIR, newAPourObjetMissionAir, newAPourObjetMissionAir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_SUJET_UNITE:
				return basicSetAPourSujetUnite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_OBJET_MISSION_AIR:
				return basicSetAPourObjetMissionAir(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_SUJET_UNITE:
				return getAPourSujetUnite();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_OBJET_MISSION_AIR:
				return getAPourObjetMissionAir();
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationUniteMissionAirCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_OBJET_MISSION_AIR:
				setAPourObjetMissionAir((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_OBJET_MISSION_AIR:
				setAPourObjetMissionAir((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_SUJET_UNITE:
				return aPourSujetUnite != null;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_AIR__APOUR_OBJET_MISSION_AIR:
				return aPourObjetMissionAir != null;
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

} //TypeAssociationUniteMissionAirImpl
