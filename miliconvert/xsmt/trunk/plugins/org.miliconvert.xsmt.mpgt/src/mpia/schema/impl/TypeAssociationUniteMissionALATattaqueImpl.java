/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationUniteMissionALATattaque;
import mpia.schema.TypeDictionaryDicoAssociationUniteMissionALATattaqueCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Unite Mission ALA Tattaque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionALATattaqueImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionALATattaqueImpl#getAPourSujetUnite <em>APour Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteMissionALATattaqueImpl#getAPourObjetMissionALATattaque <em>APour Objet Mission ALA Tattaque</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationUniteMissionALATattaqueImpl extends TypeAssociationInstanceObjetActiviteImpl implements TypeAssociationUniteMissionALATattaque {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationUniteMissionALATattaqueCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationUniteMissionALATattaqueCategorie.UNPRIO;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationUniteMissionALATattaqueCategorie categorie = CATEGORIE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourObjetMissionALATattaque() <em>APour Objet Mission ALA Tattaque</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetMissionALATattaque()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetMissionALATattaque;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationUniteMissionALATattaqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationUniteMissionALATattaque();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationUniteMissionALATattaqueCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationUniteMissionALATattaqueCategorie newCategorie) {
		TypeDictionaryDicoAssociationUniteMissionALATattaqueCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationUniteMissionALATattaqueCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_SUJET_UNITE, oldAPourSujetUnite, newAPourSujetUnite);
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
				msgs = ((InternalEObject)aPourSujetUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_SUJET_UNITE, null, msgs);
			if (newAPourSujetUnite != null)
				msgs = ((InternalEObject)newAPourSujetUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_SUJET_UNITE, null, msgs);
			msgs = basicSetAPourSujetUnite(newAPourSujetUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_SUJET_UNITE, newAPourSujetUnite, newAPourSujetUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetMissionALATattaque() {
		return aPourObjetMissionALATattaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetMissionALATattaque(TypeAssociation newAPourObjetMissionALATattaque, NotificationChain msgs) {
		TypeAssociation oldAPourObjetMissionALATattaque = aPourObjetMissionALATattaque;
		aPourObjetMissionALATattaque = newAPourObjetMissionALATattaque;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_OBJET_MISSION_ALA_TATTAQUE, oldAPourObjetMissionALATattaque, newAPourObjetMissionALATattaque);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetMissionALATattaque(TypeAssociation newAPourObjetMissionALATattaque) {
		if (newAPourObjetMissionALATattaque != aPourObjetMissionALATattaque) {
			NotificationChain msgs = null;
			if (aPourObjetMissionALATattaque != null)
				msgs = ((InternalEObject)aPourObjetMissionALATattaque).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_OBJET_MISSION_ALA_TATTAQUE, null, msgs);
			if (newAPourObjetMissionALATattaque != null)
				msgs = ((InternalEObject)newAPourObjetMissionALATattaque).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_OBJET_MISSION_ALA_TATTAQUE, null, msgs);
			msgs = basicSetAPourObjetMissionALATattaque(newAPourObjetMissionALATattaque, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_OBJET_MISSION_ALA_TATTAQUE, newAPourObjetMissionALATattaque, newAPourObjetMissionALATattaque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_SUJET_UNITE:
				return basicSetAPourSujetUnite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_OBJET_MISSION_ALA_TATTAQUE:
				return basicSetAPourObjetMissionALATattaque(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_SUJET_UNITE:
				return getAPourSujetUnite();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_OBJET_MISSION_ALA_TATTAQUE:
				return getAPourObjetMissionALATattaque();
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationUniteMissionALATattaqueCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_OBJET_MISSION_ALA_TATTAQUE:
				setAPourObjetMissionALATattaque((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_OBJET_MISSION_ALA_TATTAQUE:
				setAPourObjetMissionALATattaque((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_SUJET_UNITE:
				return aPourSujetUnite != null;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_MISSION_ALA_TATTAQUE__APOUR_OBJET_MISSION_ALA_TATTAQUE:
				return aPourObjetMissionALATattaque != null;
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

} //TypeAssociationUniteMissionALATattaqueImpl
