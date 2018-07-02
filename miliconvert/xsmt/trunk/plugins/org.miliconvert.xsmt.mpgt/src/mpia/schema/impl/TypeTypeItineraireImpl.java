/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeItineraireCategorie;
import mpia.schema.TypeDictionaryDicoTypeItineraireSousCategorie;
import mpia.schema.TypeTypeItineraire;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Itineraire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeItineraireImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeItineraireImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeItineraireImpl#getSousCategorieTextuelle <em>Sous Categorie Textuelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeItineraireImpl extends TypeTypeElementControleImpl implements TypeTypeItineraire {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeItineraireCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeItineraireCategorie.MANNET;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeItineraireCategorie categorie = CATEGORIE_EDEFAULT;

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
	protected static final TypeDictionaryDicoTypeItineraireSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeItineraireSousCategorie.ADVRTE;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeItineraireSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

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
	protected TypeTypeItineraireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeItineraire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeItineraireCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeItineraireCategorie newCategorie) {
		TypeDictionaryDicoTypeItineraireCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ITINERAIRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeItineraireCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ITINERAIRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoTypeItineraireSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoTypeItineraireSousCategorie newSousCategorie) {
		TypeDictionaryDicoTypeItineraireSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoTypeItineraireSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE_TEXTUELLE, oldSousCategorieTextuelle, sousCategorieTextuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE_TEXTUELLE:
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
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeItineraireCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoTypeItineraireSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE_TEXTUELLE:
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
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE_TEXTUELLE:
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
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_TYPE_ITINERAIRE__SOUS_CATEGORIE_TEXTUELLE:
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

} //TypeTypeItineraireImpl
