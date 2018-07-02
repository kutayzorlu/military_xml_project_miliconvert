/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteManutention;
import mpia.schema.TypeDictionaryDicoCapaciteManutentionType;
import mpia.schema.TypeDictionaryDicoCapaciteManutentionTypeAction;
import mpia.schema.TypeDictionaryDicoTypeCargaison;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Manutention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteManutentionImpl#getTypeCargaison <em>Type Cargaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteManutentionImpl#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteManutentionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteManutentionImpl extends TypeCapaciteImpl implements TypeCapaciteManutention {
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
	 * The default value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteManutentionTypeAction TYPE_ACTION_EDEFAULT = TypeDictionaryDicoCapaciteManutentionTypeAction.HOIST;

	/**
	 * The cached value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteManutentionTypeAction typeAction = TYPE_ACTION_EDEFAULT;

	/**
	 * This is true if the Type Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeActionESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteManutentionType TYPE_EDEFAULT = TypeDictionaryDicoCapaciteManutentionType.BLKLIQ;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteManutentionType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteManutentionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteManutention();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_CARGAISON, oldTypeCargaison, typeCargaison, !oldTypeCargaisonESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_CARGAISON, oldTypeCargaison, TYPE_CARGAISON_EDEFAULT, oldTypeCargaisonESet));
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
	public TypeDictionaryDicoCapaciteManutentionTypeAction getTypeAction() {
		return typeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAction(TypeDictionaryDicoCapaciteManutentionTypeAction newTypeAction) {
		TypeDictionaryDicoCapaciteManutentionTypeAction oldTypeAction = typeAction;
		typeAction = newTypeAction == null ? TYPE_ACTION_EDEFAULT : newTypeAction;
		boolean oldTypeActionESet = typeActionESet;
		typeActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_ACTION, oldTypeAction, typeAction, !oldTypeActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeAction() {
		TypeDictionaryDicoCapaciteManutentionTypeAction oldTypeAction = typeAction;
		boolean oldTypeActionESet = typeActionESet;
		typeAction = TYPE_ACTION_EDEFAULT;
		typeActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_ACTION, oldTypeAction, TYPE_ACTION_EDEFAULT, oldTypeActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeAction() {
		return typeActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteManutentionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoCapaciteManutentionType newType) {
		TypeDictionaryDicoCapaciteManutentionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoCapaciteManutentionType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_CARGAISON:
				return getTypeCargaison();
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_ACTION:
				return getTypeAction();
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE:
				return getType();
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
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_CARGAISON:
				setTypeCargaison((TypeDictionaryDicoTypeCargaison)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_ACTION:
				setTypeAction((TypeDictionaryDicoCapaciteManutentionTypeAction)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE:
				setType((TypeDictionaryDicoCapaciteManutentionType)newValue);
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
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_CARGAISON:
				unsetTypeCargaison();
				return;
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_ACTION:
				unsetTypeAction();
				return;
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE:
				unsetType();
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
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_CARGAISON:
				return isSetTypeCargaison();
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE_ACTION:
				return isSetTypeAction();
			case SchemaPackage.TYPE_CAPACITE_MANUTENTION__TYPE:
				return isSetType();
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
		result.append(", typeAction: ");
		if (typeActionESet) result.append(typeAction); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteManutentionImpl
