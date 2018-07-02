/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteFeux;
import mpia.schema.TypeDictionaryDicoCapaciteFeuxCategorie;
import mpia.schema.TypeDictionaryDicoCapaciteFeuxType;
import mpia.schema.TypeDictionaryDicoCapaciteFeuxTypeGeneralArme;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Feux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteFeuxImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteFeuxImpl#getTypeGeneralArme <em>Type General Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteFeuxImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteFeuxImpl#getAssocieCommeMunitionsTypeMunition <em>Associe Comme Munitions Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteFeuxImpl extends TypeCapaciteImpl implements TypeCapaciteFeux {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteFeuxCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCapaciteFeuxCategorie.AIRAIR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteFeuxCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getTypeGeneralArme() <em>Type General Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGeneralArme()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteFeuxTypeGeneralArme TYPE_GENERAL_ARME_EDEFAULT = TypeDictionaryDicoCapaciteFeuxTypeGeneralArme.CONV;

	/**
	 * The cached value of the '{@link #getTypeGeneralArme() <em>Type General Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGeneralArme()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteFeuxTypeGeneralArme typeGeneralArme = TYPE_GENERAL_ARME_EDEFAULT;

	/**
	 * This is true if the Type General Arme attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeGeneralArmeESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteFeuxType TYPE_EDEFAULT = TypeDictionaryDicoCapaciteFeuxType.BRTFIR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteFeuxType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeMunitionsTypeMunition() <em>Associe Comme Munitions Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeMunitionsTypeMunition()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeMunitionsTypeMunition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteFeuxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteFeux();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteFeuxCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCapaciteFeuxCategorie newCategorie) {
		TypeDictionaryDicoCapaciteFeuxCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_FEUX__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCapaciteFeuxCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_FEUX__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoCapaciteFeuxTypeGeneralArme getTypeGeneralArme() {
		return typeGeneralArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeGeneralArme(TypeDictionaryDicoCapaciteFeuxTypeGeneralArme newTypeGeneralArme) {
		TypeDictionaryDicoCapaciteFeuxTypeGeneralArme oldTypeGeneralArme = typeGeneralArme;
		typeGeneralArme = newTypeGeneralArme == null ? TYPE_GENERAL_ARME_EDEFAULT : newTypeGeneralArme;
		boolean oldTypeGeneralArmeESet = typeGeneralArmeESet;
		typeGeneralArmeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_FEUX__TYPE_GENERAL_ARME, oldTypeGeneralArme, typeGeneralArme, !oldTypeGeneralArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeGeneralArme() {
		TypeDictionaryDicoCapaciteFeuxTypeGeneralArme oldTypeGeneralArme = typeGeneralArme;
		boolean oldTypeGeneralArmeESet = typeGeneralArmeESet;
		typeGeneralArme = TYPE_GENERAL_ARME_EDEFAULT;
		typeGeneralArmeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_FEUX__TYPE_GENERAL_ARME, oldTypeGeneralArme, TYPE_GENERAL_ARME_EDEFAULT, oldTypeGeneralArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeGeneralArme() {
		return typeGeneralArmeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteFeuxType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoCapaciteFeuxType newType) {
		TypeDictionaryDicoCapaciteFeuxType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_FEUX__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoCapaciteFeuxType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_FEUX__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public TypeAssociationEXT getAssocieCommeMunitionsTypeMunition() {
		return associeCommeMunitionsTypeMunition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeMunitionsTypeMunition(TypeAssociationEXT newAssocieCommeMunitionsTypeMunition, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeMunitionsTypeMunition = associeCommeMunitionsTypeMunition;
		associeCommeMunitionsTypeMunition = newAssocieCommeMunitionsTypeMunition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_FEUX__ASSOCIE_COMME_MUNITIONS_TYPE_MUNITION, oldAssocieCommeMunitionsTypeMunition, newAssocieCommeMunitionsTypeMunition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeMunitionsTypeMunition(TypeAssociationEXT newAssocieCommeMunitionsTypeMunition) {
		if (newAssocieCommeMunitionsTypeMunition != associeCommeMunitionsTypeMunition) {
			NotificationChain msgs = null;
			if (associeCommeMunitionsTypeMunition != null)
				msgs = ((InternalEObject)associeCommeMunitionsTypeMunition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_FEUX__ASSOCIE_COMME_MUNITIONS_TYPE_MUNITION, null, msgs);
			if (newAssocieCommeMunitionsTypeMunition != null)
				msgs = ((InternalEObject)newAssocieCommeMunitionsTypeMunition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_FEUX__ASSOCIE_COMME_MUNITIONS_TYPE_MUNITION, null, msgs);
			msgs = basicSetAssocieCommeMunitionsTypeMunition(newAssocieCommeMunitionsTypeMunition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_FEUX__ASSOCIE_COMME_MUNITIONS_TYPE_MUNITION, newAssocieCommeMunitionsTypeMunition, newAssocieCommeMunitionsTypeMunition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_FEUX__ASSOCIE_COMME_MUNITIONS_TYPE_MUNITION:
				return basicSetAssocieCommeMunitionsTypeMunition(null, msgs);
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
			case SchemaPackage.TYPE_CAPACITE_FEUX__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_CAPACITE_FEUX__TYPE_GENERAL_ARME:
				return getTypeGeneralArme();
			case SchemaPackage.TYPE_CAPACITE_FEUX__TYPE:
				return getType();
			case SchemaPackage.TYPE_CAPACITE_FEUX__ASSOCIE_COMME_MUNITIONS_TYPE_MUNITION:
				return getAssocieCommeMunitionsTypeMunition();
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
			case SchemaPackage.TYPE_CAPACITE_FEUX__CATEGORIE:
				setCategorie((TypeDictionaryDicoCapaciteFeuxCategorie)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_FEUX__TYPE_GENERAL_ARME:
				setTypeGeneralArme((TypeDictionaryDicoCapaciteFeuxTypeGeneralArme)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_FEUX__TYPE:
				setType((TypeDictionaryDicoCapaciteFeuxType)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_FEUX__ASSOCIE_COMME_MUNITIONS_TYPE_MUNITION:
				setAssocieCommeMunitionsTypeMunition((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_CAPACITE_FEUX__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_CAPACITE_FEUX__TYPE_GENERAL_ARME:
				unsetTypeGeneralArme();
				return;
			case SchemaPackage.TYPE_CAPACITE_FEUX__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_CAPACITE_FEUX__ASSOCIE_COMME_MUNITIONS_TYPE_MUNITION:
				setAssocieCommeMunitionsTypeMunition((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_CAPACITE_FEUX__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_CAPACITE_FEUX__TYPE_GENERAL_ARME:
				return isSetTypeGeneralArme();
			case SchemaPackage.TYPE_CAPACITE_FEUX__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_CAPACITE_FEUX__ASSOCIE_COMME_MUNITIONS_TYPE_MUNITION:
				return associeCommeMunitionsTypeMunition != null;
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
		result.append(", typeGeneralArme: ");
		if (typeGeneralArmeESet) result.append(typeGeneralArme); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteFeuxImpl
