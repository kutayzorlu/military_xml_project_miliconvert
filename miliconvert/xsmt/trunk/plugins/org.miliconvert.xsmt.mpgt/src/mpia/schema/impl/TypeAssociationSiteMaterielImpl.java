/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationSiteMateriel;
import mpia.schema.TypeDictionaryDicoAssociationSiteMaterielCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Site Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationSiteMaterielImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationSiteMaterielImpl#getAPourObjetMateriel <em>APour Objet Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationSiteMaterielImpl#getAPourSujetSite <em>APour Sujet Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationSiteMaterielImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationSiteMateriel {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationSiteMaterielCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationSiteMaterielCategorie.NKN;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationSiteMaterielCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourObjetMateriel() <em>APour Objet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetMateriel;

	/**
	 * The cached value of the '{@link #getAPourSujetSite() <em>APour Sujet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetSite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationSiteMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationSiteMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationSiteMaterielCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationSiteMaterielCategorie newCategorie) {
		TypeDictionaryDicoAssociationSiteMaterielCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationSiteMaterielCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourObjetMateriel() {
		return aPourObjetMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetMateriel(TypeAssociation newAPourObjetMateriel, NotificationChain msgs) {
		TypeAssociation oldAPourObjetMateriel = aPourObjetMateriel;
		aPourObjetMateriel = newAPourObjetMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_OBJET_MATERIEL, oldAPourObjetMateriel, newAPourObjetMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetMateriel(TypeAssociation newAPourObjetMateriel) {
		if (newAPourObjetMateriel != aPourObjetMateriel) {
			NotificationChain msgs = null;
			if (aPourObjetMateriel != null)
				msgs = ((InternalEObject)aPourObjetMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_OBJET_MATERIEL, null, msgs);
			if (newAPourObjetMateriel != null)
				msgs = ((InternalEObject)newAPourObjetMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_OBJET_MATERIEL, null, msgs);
			msgs = basicSetAPourObjetMateriel(newAPourObjetMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_OBJET_MATERIEL, newAPourObjetMateriel, newAPourObjetMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSujetSite() {
		return aPourSujetSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetSite(TypeAssociation newAPourSujetSite, NotificationChain msgs) {
		TypeAssociation oldAPourSujetSite = aPourSujetSite;
		aPourSujetSite = newAPourSujetSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_SUJET_SITE, oldAPourSujetSite, newAPourSujetSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetSite(TypeAssociation newAPourSujetSite) {
		if (newAPourSujetSite != aPourSujetSite) {
			NotificationChain msgs = null;
			if (aPourSujetSite != null)
				msgs = ((InternalEObject)aPourSujetSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_SUJET_SITE, null, msgs);
			if (newAPourSujetSite != null)
				msgs = ((InternalEObject)newAPourSujetSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_SUJET_SITE, null, msgs);
			msgs = basicSetAPourSujetSite(newAPourSujetSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_SUJET_SITE, newAPourSujetSite, newAPourSujetSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_OBJET_MATERIEL:
				return basicSetAPourObjetMateriel(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_SUJET_SITE:
				return basicSetAPourSujetSite(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_OBJET_MATERIEL:
				return getAPourObjetMateriel();
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_SUJET_SITE:
				return getAPourSujetSite();
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationSiteMaterielCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_OBJET_MATERIEL:
				setAPourObjetMateriel((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_SUJET_SITE:
				setAPourSujetSite((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_OBJET_MATERIEL:
				setAPourObjetMateriel((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_SUJET_SITE:
				setAPourSujetSite((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_OBJET_MATERIEL:
				return aPourObjetMateriel != null;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_MATERIEL__APOUR_SUJET_SITE:
				return aPourSujetSite != null;
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
		result.append(')');
		return result.toString();
	}

} //TypeAssociationSiteMaterielImpl
