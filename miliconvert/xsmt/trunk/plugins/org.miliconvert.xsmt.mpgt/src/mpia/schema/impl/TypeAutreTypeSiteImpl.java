/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutreTypeSite;
import mpia.schema.TypeDictionaryDicoAutreTypeSiteCategorie;
import mpia.schema.TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Type Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreTypeSiteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreTypeSiteImpl#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreTypeSiteImpl#getStatutAdministratifLocalite <em>Statut Administratif Localite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreTypeSiteImpl extends TypeTypeSiteImpl implements TypeAutreTypeSite {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreTypeSiteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAutreTypeSiteCategorie.ACCOM;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreTypeSiteCategorie categorie = CATEGORIE_EDEFAULT;

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
	 * The default value of the '{@link #getStatutAdministratifLocalite() <em>Statut Administratif Localite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatutAdministratifLocalite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite STATUT_ADMINISTRATIF_LOCALITE_EDEFAULT = TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite.CPTL;

	/**
	 * The cached value of the '{@link #getStatutAdministratifLocalite() <em>Statut Administratif Localite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatutAdministratifLocalite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite statutAdministratifLocalite = STATUT_ADMINISTRATIF_LOCALITE_EDEFAULT;

	/**
	 * This is true if the Statut Administratif Localite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statutAdministratifLocaliteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreTypeSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreTypeSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutreTypeSiteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAutreTypeSiteCategorie newCategorie) {
		TypeDictionaryDicoAutreTypeSiteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_TYPE_SITE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAutreTypeSiteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_TYPE_SITE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_TYPE_SITE__AUTRE_CATEGORIE, oldAutreCategorie, autreCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite getStatutAdministratifLocalite() {
		return statutAdministratifLocalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatutAdministratifLocalite(TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite newStatutAdministratifLocalite) {
		TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite oldStatutAdministratifLocalite = statutAdministratifLocalite;
		statutAdministratifLocalite = newStatutAdministratifLocalite == null ? STATUT_ADMINISTRATIF_LOCALITE_EDEFAULT : newStatutAdministratifLocalite;
		boolean oldStatutAdministratifLocaliteESet = statutAdministratifLocaliteESet;
		statutAdministratifLocaliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_TYPE_SITE__STATUT_ADMINISTRATIF_LOCALITE, oldStatutAdministratifLocalite, statutAdministratifLocalite, !oldStatutAdministratifLocaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatutAdministratifLocalite() {
		TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite oldStatutAdministratifLocalite = statutAdministratifLocalite;
		boolean oldStatutAdministratifLocaliteESet = statutAdministratifLocaliteESet;
		statutAdministratifLocalite = STATUT_ADMINISTRATIF_LOCALITE_EDEFAULT;
		statutAdministratifLocaliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_TYPE_SITE__STATUT_ADMINISTRATIF_LOCALITE, oldStatutAdministratifLocalite, STATUT_ADMINISTRATIF_LOCALITE_EDEFAULT, oldStatutAdministratifLocaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatutAdministratifLocalite() {
		return statutAdministratifLocaliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__AUTRE_CATEGORIE:
				return getAutreCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__STATUT_ADMINISTRATIF_LOCALITE:
				return getStatutAdministratifLocalite();
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
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAutreTypeSiteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__AUTRE_CATEGORIE:
				setAutreCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__STATUT_ADMINISTRATIF_LOCALITE:
				setStatutAdministratifLocalite((TypeDictionaryDicoAutreTypeSiteStatutAdministratifLocalite)newValue);
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
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__AUTRE_CATEGORIE:
				setAutreCategorie(AUTRE_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__STATUT_ADMINISTRATIF_LOCALITE:
				unsetStatutAdministratifLocalite();
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
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__AUTRE_CATEGORIE:
				return AUTRE_CATEGORIE_EDEFAULT == null ? autreCategorie != null : !AUTRE_CATEGORIE_EDEFAULT.equals(autreCategorie);
			case SchemaPackage.TYPE_AUTRE_TYPE_SITE__STATUT_ADMINISTRATIF_LOCALITE:
				return isSetStatutAdministratifLocalite();
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
		result.append(", statutAdministratifLocalite: ");
		if (statutAdministratifLocaliteESet) result.append(statutAdministratifLocalite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAutreTypeSiteImpl
