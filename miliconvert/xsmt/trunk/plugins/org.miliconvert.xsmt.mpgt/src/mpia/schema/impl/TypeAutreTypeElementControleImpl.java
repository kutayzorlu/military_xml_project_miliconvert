/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutreTypeElementControle;
import mpia.schema.TypeDictionaryDicoAutreTypeElementControleCategorie;
import mpia.schema.TypeDictionaryDicoAutreTypeElementControleSousCategorie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Type Element Controle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreTypeElementControleImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreTypeElementControleImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreTypeElementControleImpl#getSousCategorieTextuelle <em>Sous Categorie Textuelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreTypeElementControleImpl extends TypeTypeElementControleImpl implements TypeAutreTypeElementControle {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreTypeElementControleCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAutreTypeElementControleCategorie.AIRGEN;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreTypeElementControleCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreTypeElementControleSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoAutreTypeElementControleSousCategorie.AIRH;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreTypeElementControleSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getSousCategorieTextuelle() <em>Sous Categorie Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorieTextuelle()
	 * @generated
	 * @ordered
	 */
	protected static final String SOUS_CATEGORIE_TEXTUELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSousCategorieTextuelle() <em>Sous Categorie Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorieTextuelle()
	 * @generated
	 * @ordered
	 */
	protected String sousCategorieTextuelle = SOUS_CATEGORIE_TEXTUELLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreTypeElementControleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreTypeElementControle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutreTypeElementControleCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAutreTypeElementControleCategorie newCategorie) {
		TypeDictionaryDicoAutreTypeElementControleCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAutreTypeElementControleCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoAutreTypeElementControleSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoAutreTypeElementControleSousCategorie newSousCategorie) {
		TypeDictionaryDicoAutreTypeElementControleSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoAutreTypeElementControleSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
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
	public String getSousCategorieTextuelle() {
		return sousCategorieTextuelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorieTextuelle(String newSousCategorieTextuelle) {
		String oldSousCategorieTextuelle = sousCategorieTextuelle;
		sousCategorieTextuelle = newSousCategorieTextuelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE_TEXTUELLE, oldSousCategorieTextuelle, sousCategorieTextuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE_TEXTUELLE:
				return getSousCategorieTextuelle();
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
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAutreTypeElementControleCategorie)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoAutreTypeElementControleSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE_TEXTUELLE:
				setSousCategorieTextuelle((String)newValue);
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
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE_TEXTUELLE:
				setSousCategorieTextuelle(SOUS_CATEGORIE_TEXTUELLE_EDEFAULT);
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
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_ELEMENT_CONTROLE__SOUS_CATEGORIE_TEXTUELLE:
				return SOUS_CATEGORIE_TEXTUELLE_EDEFAULT == null ? sousCategorieTextuelle != null : !SOUS_CATEGORIE_TEXTUELLE_EDEFAULT.equals(sousCategorieTextuelle);
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
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(", sousCategorieTextuelle: ");
		result.append(sousCategorieTextuelle);
		result.append(')');
		return result.toString();
	}

} //TypeAutreTypeElementControleImpl
