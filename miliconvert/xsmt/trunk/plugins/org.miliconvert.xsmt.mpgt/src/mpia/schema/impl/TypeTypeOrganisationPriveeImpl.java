/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoActivitePrincipale;
import mpia.schema.TypeDictionaryDicoTypeOrganisationPriveeCategorie;
import mpia.schema.TypeTypeOrganisationPrivee;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Organisation Privee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeOrganisationPriveeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeOrganisationPriveeImpl#getActivitePrincipale <em>Activite Principale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeOrganisationPriveeImpl extends TypeTypeEntiteOrganisationnelleImpl implements TypeTypeOrganisationPrivee {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeOrganisationPriveeCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeOrganisationPriveeCategorie.AGRCTL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeOrganisationPriveeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getActivitePrincipale() <em>Activite Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitePrincipale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActivitePrincipale ACTIVITE_PRINCIPALE_EDEFAULT = TypeDictionaryDicoActivitePrincipale.AGRCPR;

	/**
	 * The cached value of the '{@link #getActivitePrincipale() <em>Activite Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitePrincipale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActivitePrincipale activitePrincipale = ACTIVITE_PRINCIPALE_EDEFAULT;

	/**
	 * This is true if the Activite Principale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activitePrincipaleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeOrganisationPriveeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeOrganisationPrivee();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeOrganisationPriveeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeOrganisationPriveeCategorie newCategorie) {
		TypeDictionaryDicoTypeOrganisationPriveeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeOrganisationPriveeCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoActivitePrincipale getActivitePrincipale() {
		return activitePrincipale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitePrincipale(TypeDictionaryDicoActivitePrincipale newActivitePrincipale) {
		TypeDictionaryDicoActivitePrincipale oldActivitePrincipale = activitePrincipale;
		activitePrincipale = newActivitePrincipale == null ? ACTIVITE_PRINCIPALE_EDEFAULT : newActivitePrincipale;
		boolean oldActivitePrincipaleESet = activitePrincipaleESet;
		activitePrincipaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__ACTIVITE_PRINCIPALE, oldActivitePrincipale, activitePrincipale, !oldActivitePrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivitePrincipale() {
		TypeDictionaryDicoActivitePrincipale oldActivitePrincipale = activitePrincipale;
		boolean oldActivitePrincipaleESet = activitePrincipaleESet;
		activitePrincipale = ACTIVITE_PRINCIPALE_EDEFAULT;
		activitePrincipaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__ACTIVITE_PRINCIPALE, oldActivitePrincipale, ACTIVITE_PRINCIPALE_EDEFAULT, oldActivitePrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivitePrincipale() {
		return activitePrincipaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__ACTIVITE_PRINCIPALE:
				return getActivitePrincipale();
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
			case SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeOrganisationPriveeCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__ACTIVITE_PRINCIPALE:
				setActivitePrincipale((TypeDictionaryDicoActivitePrincipale)newValue);
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
			case SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__ACTIVITE_PRINCIPALE:
				unsetActivitePrincipale();
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
			case SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_ORGANISATION_PRIVEE__ACTIVITE_PRINCIPALE:
				return isSetActivitePrincipale();
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
		result.append(", activitePrincipale: ");
		if (activitePrincipaleESet) result.append(activitePrincipale); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeOrganisationPriveeImpl
