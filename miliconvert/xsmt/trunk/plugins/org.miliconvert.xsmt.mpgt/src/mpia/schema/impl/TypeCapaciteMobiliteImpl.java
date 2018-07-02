/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteMobilite;
import mpia.schema.TypeDictionaryDicoCapaciteMobiliteCategorie;
import mpia.schema.TypeDictionaryDicoCapaciteMobiliteType;
import mpia.schema.TypeDictionaryDicoCapaciteMobiliteTypeTerrain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Mobilite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteMobiliteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteMobiliteImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteMobiliteImpl#getTypeTerrain <em>Type Terrain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteMobiliteImpl extends TypeCapaciteImpl implements TypeCapaciteMobilite {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteMobiliteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCapaciteMobiliteCategorie.AIRBRN;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteMobiliteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteMobiliteType TYPE_EDEFAULT = TypeDictionaryDicoCapaciteMobiliteType.MALTID;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteMobiliteType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getTypeTerrain() <em>Type Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTerrain()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteMobiliteTypeTerrain TYPE_TERRAIN_EDEFAULT = TypeDictionaryDicoCapaciteMobiliteTypeTerrain.CRSCTY;

	/**
	 * The cached value of the '{@link #getTypeTerrain() <em>Type Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTerrain()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteMobiliteTypeTerrain typeTerrain = TYPE_TERRAIN_EDEFAULT;

	/**
	 * This is true if the Type Terrain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeTerrainESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteMobiliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteMobilite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteMobiliteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCapaciteMobiliteCategorie newCategorie) {
		TypeDictionaryDicoCapaciteMobiliteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_MOBILITE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCapaciteMobiliteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_MOBILITE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoCapaciteMobiliteType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoCapaciteMobiliteType newType) {
		TypeDictionaryDicoCapaciteMobiliteType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoCapaciteMobiliteType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public TypeDictionaryDicoCapaciteMobiliteTypeTerrain getTypeTerrain() {
		return typeTerrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTerrain(TypeDictionaryDicoCapaciteMobiliteTypeTerrain newTypeTerrain) {
		TypeDictionaryDicoCapaciteMobiliteTypeTerrain oldTypeTerrain = typeTerrain;
		typeTerrain = newTypeTerrain == null ? TYPE_TERRAIN_EDEFAULT : newTypeTerrain;
		boolean oldTypeTerrainESet = typeTerrainESet;
		typeTerrainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE_TERRAIN, oldTypeTerrain, typeTerrain, !oldTypeTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeTerrain() {
		TypeDictionaryDicoCapaciteMobiliteTypeTerrain oldTypeTerrain = typeTerrain;
		boolean oldTypeTerrainESet = typeTerrainESet;
		typeTerrain = TYPE_TERRAIN_EDEFAULT;
		typeTerrainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE_TERRAIN, oldTypeTerrain, TYPE_TERRAIN_EDEFAULT, oldTypeTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeTerrain() {
		return typeTerrainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE:
				return getType();
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE_TERRAIN:
				return getTypeTerrain();
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
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__CATEGORIE:
				setCategorie((TypeDictionaryDicoCapaciteMobiliteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE:
				setType((TypeDictionaryDicoCapaciteMobiliteType)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE_TERRAIN:
				setTypeTerrain((TypeDictionaryDicoCapaciteMobiliteTypeTerrain)newValue);
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
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE_TERRAIN:
				unsetTypeTerrain();
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
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_CAPACITE_MOBILITE__TYPE_TERRAIN:
				return isSetTypeTerrain();
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
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", typeTerrain: ");
		if (typeTerrainESet) result.append(typeTerrain); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteMobiliteImpl
