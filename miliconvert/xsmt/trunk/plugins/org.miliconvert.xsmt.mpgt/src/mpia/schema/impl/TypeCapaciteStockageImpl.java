/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteStockage;
import mpia.schema.TypeDictionaryDicoCapaciteStockageConditionsStockage;
import mpia.schema.TypeDictionaryDicoCapaciteStockageType;
import mpia.schema.TypeDictionaryDicoTypeCargaison;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Stockage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteStockageImpl#getTypeCargaison <em>Type Cargaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteStockageImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteStockageImpl#getConditionsStockage <em>Conditions Stockage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteStockageImpl#getStockeType <em>Stocke Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteStockageImpl extends TypeCapaciteImpl implements TypeCapaciteStockage {
	/**
	 * The default value of the '{@link #getTypeCargaison() <em>Type Cargaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCargaison()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeCargaison TYPE_CARGAISON_EDEFAULT = TypeDictionaryDicoTypeCargaison.ACFT;

	/**
	 * The cached value of the '{@link #getTypeCargaison() <em>Type Cargaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCargaison()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeCargaison typeCargaison = TYPE_CARGAISON_EDEFAULT;

	/**
	 * This is true if the Type Cargaison attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCargaisonESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteStockageType TYPE_EDEFAULT = TypeDictionaryDicoCapaciteStockageType.BLKLIQ;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteStockageType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getConditionsStockage() <em>Conditions Stockage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsStockage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteStockageConditionsStockage CONDITIONS_STOCKAGE_EDEFAULT = TypeDictionaryDicoCapaciteStockageConditionsStockage.CC;

	/**
	 * The cached value of the '{@link #getConditionsStockage() <em>Conditions Stockage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsStockage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteStockageConditionsStockage conditionsStockage = CONDITIONS_STOCKAGE_EDEFAULT;

	/**
	 * This is true if the Conditions Stockage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionsStockageESet;

	/**
	 * The cached value of the '{@link #getStockeType() <em>Stocke Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockeType()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT stockeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteStockageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteStockage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeCargaison getTypeCargaison() {
		return typeCargaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCargaison(TypeDictionaryDicoTypeCargaison newTypeCargaison) {
		TypeDictionaryDicoTypeCargaison oldTypeCargaison = typeCargaison;
		typeCargaison = newTypeCargaison == null ? TYPE_CARGAISON_EDEFAULT : newTypeCargaison;
		boolean oldTypeCargaisonESet = typeCargaisonESet;
		typeCargaisonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE_CARGAISON, oldTypeCargaison, typeCargaison, !oldTypeCargaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCargaison() {
		TypeDictionaryDicoTypeCargaison oldTypeCargaison = typeCargaison;
		boolean oldTypeCargaisonESet = typeCargaisonESet;
		typeCargaison = TYPE_CARGAISON_EDEFAULT;
		typeCargaisonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE_CARGAISON, oldTypeCargaison, TYPE_CARGAISON_EDEFAULT, oldTypeCargaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCargaison() {
		return typeCargaisonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteStockageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoCapaciteStockageType newType) {
		TypeDictionaryDicoCapaciteStockageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoCapaciteStockageType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public TypeDictionaryDicoCapaciteStockageConditionsStockage getConditionsStockage() {
		return conditionsStockage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionsStockage(TypeDictionaryDicoCapaciteStockageConditionsStockage newConditionsStockage) {
		TypeDictionaryDicoCapaciteStockageConditionsStockage oldConditionsStockage = conditionsStockage;
		conditionsStockage = newConditionsStockage == null ? CONDITIONS_STOCKAGE_EDEFAULT : newConditionsStockage;
		boolean oldConditionsStockageESet = conditionsStockageESet;
		conditionsStockageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_STOCKAGE__CONDITIONS_STOCKAGE, oldConditionsStockage, conditionsStockage, !oldConditionsStockageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionsStockage() {
		TypeDictionaryDicoCapaciteStockageConditionsStockage oldConditionsStockage = conditionsStockage;
		boolean oldConditionsStockageESet = conditionsStockageESet;
		conditionsStockage = CONDITIONS_STOCKAGE_EDEFAULT;
		conditionsStockageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_STOCKAGE__CONDITIONS_STOCKAGE, oldConditionsStockage, CONDITIONS_STOCKAGE_EDEFAULT, oldConditionsStockageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionsStockage() {
		return conditionsStockageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getStockeType() {
		return stockeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockeType(TypeAssociationEXT newStockeType, NotificationChain msgs) {
		TypeAssociationEXT oldStockeType = stockeType;
		stockeType = newStockeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_STOCKAGE__STOCKE_TYPE, oldStockeType, newStockeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockeType(TypeAssociationEXT newStockeType) {
		if (newStockeType != stockeType) {
			NotificationChain msgs = null;
			if (stockeType != null)
				msgs = ((InternalEObject)stockeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_STOCKAGE__STOCKE_TYPE, null, msgs);
			if (newStockeType != null)
				msgs = ((InternalEObject)newStockeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_STOCKAGE__STOCKE_TYPE, null, msgs);
			msgs = basicSetStockeType(newStockeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_STOCKAGE__STOCKE_TYPE, newStockeType, newStockeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__STOCKE_TYPE:
				return basicSetStockeType(null, msgs);
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
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE_CARGAISON:
				return getTypeCargaison();
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE:
				return getType();
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__CONDITIONS_STOCKAGE:
				return getConditionsStockage();
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__STOCKE_TYPE:
				return getStockeType();
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
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE_CARGAISON:
				setTypeCargaison((TypeDictionaryDicoTypeCargaison)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE:
				setType((TypeDictionaryDicoCapaciteStockageType)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__CONDITIONS_STOCKAGE:
				setConditionsStockage((TypeDictionaryDicoCapaciteStockageConditionsStockage)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__STOCKE_TYPE:
				setStockeType((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE_CARGAISON:
				unsetTypeCargaison();
				return;
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__CONDITIONS_STOCKAGE:
				unsetConditionsStockage();
				return;
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__STOCKE_TYPE:
				setStockeType((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE_CARGAISON:
				return isSetTypeCargaison();
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__CONDITIONS_STOCKAGE:
				return isSetConditionsStockage();
			case SchemaPackage.TYPE_CAPACITE_STOCKAGE__STOCKE_TYPE:
				return stockeType != null;
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
		result.append(" (typeCargaison: ");
		if (typeCargaisonESet) result.append(typeCargaison); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", conditionsStockage: ");
		if (conditionsStockageESet) result.append(conditionsStockage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteStockageImpl
