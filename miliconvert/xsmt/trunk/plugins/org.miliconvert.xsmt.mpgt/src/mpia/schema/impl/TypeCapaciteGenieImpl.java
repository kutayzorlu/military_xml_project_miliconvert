/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteGenie;
import mpia.schema.TypeDictionaryDicoCapaciteGenieCategorie;
import mpia.schema.TypeDictionaryDicoCapaciteGenieType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Genie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteGenieImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteGenieImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteGenieImpl#getSiteHauteur <em>Site Hauteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteGenieImpl#getSiteLongueur <em>Site Longueur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteGenieImpl#getSiteLargeur <em>Site Largeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteGenieImpl#getAssocieCommeSiteTypeSite <em>Associe Comme Site Type Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteGenieImpl extends TypeCapaciteImpl implements TypeCapaciteGenie {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteGenieCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCapaciteGenieCategorie.BRCH;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteGenieCategorie categorie = CATEGORIE_EDEFAULT;

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
	protected static final TypeDictionaryDicoCapaciteGenieType TYPE_EDEFAULT = TypeDictionaryDicoCapaciteGenieType.RATE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteGenieType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getSiteHauteur() <em>Site Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteHauteur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur siteHauteur;

	/**
	 * The cached value of the '{@link #getSiteLongueur() <em>Site Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteLongueur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur siteLongueur;

	/**
	 * The cached value of the '{@link #getSiteLargeur() <em>Site Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteLargeur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur siteLargeur;

	/**
	 * The cached value of the '{@link #getAssocieCommeSiteTypeSite() <em>Associe Comme Site Type Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSiteTypeSite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSiteTypeSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteGenieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteGenie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteGenieCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCapaciteGenieCategorie newCategorie) {
		TypeDictionaryDicoCapaciteGenieCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCapaciteGenieCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_GENIE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoCapaciteGenieType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoCapaciteGenieType newType) {
		TypeDictionaryDicoCapaciteGenieType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoCapaciteGenieType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_GENIE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public TypeDataTypeLongueur getSiteHauteur() {
		return siteHauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteHauteur(TypeDataTypeLongueur newSiteHauteur, NotificationChain msgs) {
		TypeDataTypeLongueur oldSiteHauteur = siteHauteur;
		siteHauteur = newSiteHauteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__SITE_HAUTEUR, oldSiteHauteur, newSiteHauteur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteHauteur(TypeDataTypeLongueur newSiteHauteur) {
		if (newSiteHauteur != siteHauteur) {
			NotificationChain msgs = null;
			if (siteHauteur != null)
				msgs = ((InternalEObject)siteHauteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_GENIE__SITE_HAUTEUR, null, msgs);
			if (newSiteHauteur != null)
				msgs = ((InternalEObject)newSiteHauteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_GENIE__SITE_HAUTEUR, null, msgs);
			msgs = basicSetSiteHauteur(newSiteHauteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__SITE_HAUTEUR, newSiteHauteur, newSiteHauteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getSiteLongueur() {
		return siteLongueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteLongueur(TypeDataTypeLongueur newSiteLongueur, NotificationChain msgs) {
		TypeDataTypeLongueur oldSiteLongueur = siteLongueur;
		siteLongueur = newSiteLongueur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LONGUEUR, oldSiteLongueur, newSiteLongueur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteLongueur(TypeDataTypeLongueur newSiteLongueur) {
		if (newSiteLongueur != siteLongueur) {
			NotificationChain msgs = null;
			if (siteLongueur != null)
				msgs = ((InternalEObject)siteLongueur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LONGUEUR, null, msgs);
			if (newSiteLongueur != null)
				msgs = ((InternalEObject)newSiteLongueur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LONGUEUR, null, msgs);
			msgs = basicSetSiteLongueur(newSiteLongueur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LONGUEUR, newSiteLongueur, newSiteLongueur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getSiteLargeur() {
		return siteLargeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteLargeur(TypeDataTypeLongueur newSiteLargeur, NotificationChain msgs) {
		TypeDataTypeLongueur oldSiteLargeur = siteLargeur;
		siteLargeur = newSiteLargeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LARGEUR, oldSiteLargeur, newSiteLargeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteLargeur(TypeDataTypeLongueur newSiteLargeur) {
		if (newSiteLargeur != siteLargeur) {
			NotificationChain msgs = null;
			if (siteLargeur != null)
				msgs = ((InternalEObject)siteLargeur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LARGEUR, null, msgs);
			if (newSiteLargeur != null)
				msgs = ((InternalEObject)newSiteLargeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LARGEUR, null, msgs);
			msgs = basicSetSiteLargeur(newSiteLargeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LARGEUR, newSiteLargeur, newSiteLargeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSiteTypeSite() {
		return associeCommeSiteTypeSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSiteTypeSite(TypeAssociation newAssocieCommeSiteTypeSite, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSiteTypeSite = associeCommeSiteTypeSite;
		associeCommeSiteTypeSite = newAssocieCommeSiteTypeSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__ASSOCIE_COMME_SITE_TYPE_SITE, oldAssocieCommeSiteTypeSite, newAssocieCommeSiteTypeSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSiteTypeSite(TypeAssociation newAssocieCommeSiteTypeSite) {
		if (newAssocieCommeSiteTypeSite != associeCommeSiteTypeSite) {
			NotificationChain msgs = null;
			if (associeCommeSiteTypeSite != null)
				msgs = ((InternalEObject)associeCommeSiteTypeSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_GENIE__ASSOCIE_COMME_SITE_TYPE_SITE, null, msgs);
			if (newAssocieCommeSiteTypeSite != null)
				msgs = ((InternalEObject)newAssocieCommeSiteTypeSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CAPACITE_GENIE__ASSOCIE_COMME_SITE_TYPE_SITE, null, msgs);
			msgs = basicSetAssocieCommeSiteTypeSite(newAssocieCommeSiteTypeSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_GENIE__ASSOCIE_COMME_SITE_TYPE_SITE, newAssocieCommeSiteTypeSite, newAssocieCommeSiteTypeSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_HAUTEUR:
				return basicSetSiteHauteur(null, msgs);
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LONGUEUR:
				return basicSetSiteLongueur(null, msgs);
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LARGEUR:
				return basicSetSiteLargeur(null, msgs);
			case SchemaPackage.TYPE_CAPACITE_GENIE__ASSOCIE_COMME_SITE_TYPE_SITE:
				return basicSetAssocieCommeSiteTypeSite(null, msgs);
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
			case SchemaPackage.TYPE_CAPACITE_GENIE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_CAPACITE_GENIE__TYPE:
				return getType();
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_HAUTEUR:
				return getSiteHauteur();
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LONGUEUR:
				return getSiteLongueur();
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LARGEUR:
				return getSiteLargeur();
			case SchemaPackage.TYPE_CAPACITE_GENIE__ASSOCIE_COMME_SITE_TYPE_SITE:
				return getAssocieCommeSiteTypeSite();
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
			case SchemaPackage.TYPE_CAPACITE_GENIE__CATEGORIE:
				setCategorie((TypeDictionaryDicoCapaciteGenieCategorie)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__TYPE:
				setType((TypeDictionaryDicoCapaciteGenieType)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_HAUTEUR:
				setSiteHauteur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LONGUEUR:
				setSiteLongueur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LARGEUR:
				setSiteLargeur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__ASSOCIE_COMME_SITE_TYPE_SITE:
				setAssocieCommeSiteTypeSite((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_CAPACITE_GENIE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_HAUTEUR:
				setSiteHauteur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LONGUEUR:
				setSiteLongueur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LARGEUR:
				setSiteLargeur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CAPACITE_GENIE__ASSOCIE_COMME_SITE_TYPE_SITE:
				setAssocieCommeSiteTypeSite((TypeAssociation)null);
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
			case SchemaPackage.TYPE_CAPACITE_GENIE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_CAPACITE_GENIE__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_HAUTEUR:
				return siteHauteur != null;
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LONGUEUR:
				return siteLongueur != null;
			case SchemaPackage.TYPE_CAPACITE_GENIE__SITE_LARGEUR:
				return siteLargeur != null;
			case SchemaPackage.TYPE_CAPACITE_GENIE__ASSOCIE_COMME_SITE_TYPE_SITE:
				return associeCommeSiteTypeSite != null;
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

} //TypeCapaciteGenieImpl
