/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutreTypeEquipement;
import mpia.schema.TypeDictionaryDicoAutreTypeEquipementCategorie;
import mpia.schema.TypeDictionaryDicoAutreTypeEquipementSousCategorie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Type Equipement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreTypeEquipementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreTypeEquipementImpl#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreTypeEquipementImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreTypeEquipementImpl extends TypeTypeEquipementImpl implements TypeAutreTypeEquipement {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreTypeEquipementCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAutreTypeEquipementCategorie.BCNLGT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreTypeEquipementCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getAutreCategorie() <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_CATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreCategorie() <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreCategorie()
	 * @generated
	 * @ordered
	 */
	protected String autreCategorie = AUTRE_CATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreTypeEquipementSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoAutreTypeEquipementSousCategorie.BOOM;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreTypeEquipementSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreTypeEquipementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreTypeEquipement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutreTypeEquipementCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAutreTypeEquipementCategorie newCategorie) {
		TypeDictionaryDicoAutreTypeEquipementCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAutreTypeEquipementCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getAutreCategorie() {
		return autreCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreCategorie(String newAutreCategorie) {
		String oldAutreCategorie = autreCategorie;
		autreCategorie = newAutreCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__AUTRE_CATEGORIE, oldAutreCategorie, autreCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutreTypeEquipementSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoAutreTypeEquipementSousCategorie newSousCategorie) {
		TypeDictionaryDicoAutreTypeEquipementSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoAutreTypeEquipementSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousCategorie() {
		return sousCategorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__AUTRE_CATEGORIE:
				return getAutreCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__SOUS_CATEGORIE:
				return getSousCategorie();
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
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAutreTypeEquipementCategorie)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__AUTRE_CATEGORIE:
				setAutreCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoAutreTypeEquipementSousCategorie)newValue);
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
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__AUTRE_CATEGORIE:
				setAutreCategorie(AUTRE_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__SOUS_CATEGORIE:
				unsetSousCategorie();
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
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__AUTRE_CATEGORIE:
				return AUTRE_CATEGORIE_EDEFAULT == null ? autreCategorie != null : !AUTRE_CATEGORIE_EDEFAULT.equals(autreCategorie);
			case SchemaPackage.TYPE_AUTRE_TYPE_EQUIPEMENT__SOUS_CATEGORIE:
				return isSetSousCategorie();
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
		result.append(", autreCategorie: ");
		result.append(autreCategorie);
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAutreTypeEquipementImpl
