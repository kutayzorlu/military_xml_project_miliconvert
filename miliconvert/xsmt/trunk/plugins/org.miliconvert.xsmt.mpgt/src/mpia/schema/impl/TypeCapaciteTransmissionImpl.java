/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteTransmission;
import mpia.schema.TypeDictionaryDicoCapaciteTransmissionCategorie;
import mpia.schema.TypeDictionaryDicoCapaciteTransmissionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Transmission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteTransmissionImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteTransmissionImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteTransmissionImpl#getEstDefinieAvecTypeEquipementElectronique <em>Est Definie Avec Type Equipement Electronique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteTransmissionImpl extends TypeCapaciteImpl implements TypeCapaciteTransmission {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteTransmissionCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCapaciteTransmissionCategorie.RECEIV;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteTransmissionCategorie categorie = CATEGORIE_EDEFAULT;

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
	protected static final TypeDictionaryDicoCapaciteTransmissionType TYPE_EDEFAULT = TypeDictionaryDicoCapaciteTransmissionType.MAXFRQ;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteTransmissionType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getEstDefinieAvecTypeEquipementElectronique() <em>Est Definie Avec Type Equipement Electronique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDefinieAvecTypeEquipementElectronique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estDefinieAvecTypeEquipementElectronique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteTransmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteTransmission();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteTransmissionCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCapaciteTransmissionCategorie newCategorie) {
		TypeDictionaryDicoCapaciteTransmissionCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_TRANSMISSION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCapaciteTransmissionCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_TRANSMISSION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoCapaciteTransmissionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoCapaciteTransmissionType newType) {
		TypeDictionaryDicoCapaciteTransmissionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_TRANSMISSION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoCapaciteTransmissionType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_TRANSMISSION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public TypeAssociationEXT getEstDefinieAvecTypeEquipementElectronique() {
		return estDefinieAvecTypeEquipementElectronique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDefinieAvecTypeEquipementElectronique(TypeAssociationEXT newEstDefinieAvecTypeEquipementElectronique, NotificationChain msgs) {
		TypeAssociationEXT oldEstDefinieAvecTypeEquipementElectronique = estDefinieAvecTypeEquipementElectronique;
		estDefinieAvecTypeEquipementElectronique = newEstDefinieAvecTypeEquipementElectronique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_TRANSMISSION__EST_DEFINIE_AVEC_TYPE_EQUIPEMENT_ELECTRONIQUE, oldEstDefinieAvecTypeEquipementElectronique, newEstDefinieAvecTypeEquipementElectronique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDefinieAvecTypeEquipementElectronique(TypeAssociationEXT newEstDefinieAvecTypeEquipementElectronique) {
		if (newEstDefinieAvecTypeEquipementElectronique != estDefinieAvecTypeEquipementElectronique) {
			NotificationChain msgs = null;
			if (estDefinieAvecTypeEquipementElectronique != null)
				msgs = ((InternalEObject)estDefinieAvecTypeEquipementElectronique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_TRANSMISSION__EST_DEFINIE_AVEC_TYPE_EQUIPEMENT_ELECTRONIQUE, null, msgs);
			if (newEstDefinieAvecTypeEquipementElectronique != null)
				msgs = ((InternalEObject)newEstDefinieAvecTypeEquipementElectronique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_TRANSMISSION__EST_DEFINIE_AVEC_TYPE_EQUIPEMENT_ELECTRONIQUE, null, msgs);
			msgs = basicSetEstDefinieAvecTypeEquipementElectronique(newEstDefinieAvecTypeEquipementElectronique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_TRANSMISSION__EST_DEFINIE_AVEC_TYPE_EQUIPEMENT_ELECTRONIQUE, newEstDefinieAvecTypeEquipementElectronique, newEstDefinieAvecTypeEquipementElectronique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__EST_DEFINIE_AVEC_TYPE_EQUIPEMENT_ELECTRONIQUE:
				return basicSetEstDefinieAvecTypeEquipementElectronique(null, msgs);
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
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__TYPE:
				return getType();
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__EST_DEFINIE_AVEC_TYPE_EQUIPEMENT_ELECTRONIQUE:
				return getEstDefinieAvecTypeEquipementElectronique();
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
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__CATEGORIE:
				setCategorie((TypeDictionaryDicoCapaciteTransmissionCategorie)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__TYPE:
				setType((TypeDictionaryDicoCapaciteTransmissionType)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__EST_DEFINIE_AVEC_TYPE_EQUIPEMENT_ELECTRONIQUE:
				setEstDefinieAvecTypeEquipementElectronique((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__EST_DEFINIE_AVEC_TYPE_EQUIPEMENT_ELECTRONIQUE:
				setEstDefinieAvecTypeEquipementElectronique((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_CAPACITE_TRANSMISSION__EST_DEFINIE_AVEC_TYPE_EQUIPEMENT_ELECTRONIQUE:
				return estDefinieAvecTypeEquipementElectronique != null;
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
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteTransmissionImpl
