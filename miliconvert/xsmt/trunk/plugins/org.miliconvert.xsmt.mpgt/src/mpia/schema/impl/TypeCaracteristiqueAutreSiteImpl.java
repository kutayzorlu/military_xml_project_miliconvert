/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiqueAutreSite;
import mpia.schema.TypeDictionaryDicoCaracteristiqueAutreSiteSousType;
import mpia.schema.TypeDictionaryDicoCaracteristiqueAutreSiteType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Caracteristique Autre Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueAutreSiteImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueAutreSiteImpl#getSousType <em>Sous Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaracteristiqueAutreSiteImpl extends EObjectImpl implements TypeCaracteristiqueAutreSite {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCaracteristiqueAutreSiteType TYPE_EDEFAULT = TypeDictionaryDicoCaracteristiqueAutreSiteType.DEPOT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCaracteristiqueAutreSiteType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getSousType() <em>Sous Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCaracteristiqueAutreSiteSousType SOUS_TYPE_EDEFAULT = TypeDictionaryDicoCaracteristiqueAutreSiteSousType.AMMCCH;

	/**
	 * The cached value of the '{@link #getSousType() <em>Sous Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCaracteristiqueAutreSiteSousType sousType = SOUS_TYPE_EDEFAULT;

	/**
	 * This is true if the Sous Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCaracteristiqueAutreSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaracteristiqueAutreSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCaracteristiqueAutreSiteType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoCaracteristiqueAutreSiteType newType) {
		TypeDictionaryDicoCaracteristiqueAutreSiteType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoCaracteristiqueAutreSiteType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCaracteristiqueAutreSiteSousType getSousType() {
		return sousType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousType(TypeDictionaryDicoCaracteristiqueAutreSiteSousType newSousType) {
		TypeDictionaryDicoCaracteristiqueAutreSiteSousType oldSousType = sousType;
		sousType = newSousType == null ? SOUS_TYPE_EDEFAULT : newSousType;
		boolean oldSousTypeESet = sousTypeESet;
		sousTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__SOUS_TYPE, oldSousType, sousType, !oldSousTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousType() {
		TypeDictionaryDicoCaracteristiqueAutreSiteSousType oldSousType = sousType;
		boolean oldSousTypeESet = sousTypeESet;
		sousType = SOUS_TYPE_EDEFAULT;
		sousTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__SOUS_TYPE, oldSousType, SOUS_TYPE_EDEFAULT, oldSousTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousType() {
		return sousTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__TYPE:
				return getType();
			case SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__SOUS_TYPE:
				return getSousType();
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__TYPE:
				setType((TypeDictionaryDicoCaracteristiqueAutreSiteType)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__SOUS_TYPE:
				setSousType((TypeDictionaryDicoCaracteristiqueAutreSiteSousType)newValue);
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__SOUS_TYPE:
				unsetSousType();
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_CARACTERISTIQUE_AUTRE_SITE__SOUS_TYPE:
				return isSetSousType();
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", sousType: ");
		if (sousTypeESet) result.append(sousType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCaracteristiqueAutreSiteImpl
