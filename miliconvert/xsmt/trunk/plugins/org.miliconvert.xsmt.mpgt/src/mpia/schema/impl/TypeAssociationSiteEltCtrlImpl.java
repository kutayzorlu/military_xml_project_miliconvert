/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationSiteEltCtrl;
import mpia.schema.TypeDictionaryDicoAssociationSiteEltCtrlCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Site Elt Ctrl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationSiteEltCtrlImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationSiteEltCtrlImpl#getAPourObjetElementControle <em>APour Objet Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationSiteEltCtrlImpl#getAPourSujetSite <em>APour Sujet Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationSiteEltCtrlImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationSiteEltCtrl {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationSiteEltCtrlCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationSiteEltCtrlCategorie.ISAFBY;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationSiteEltCtrlCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourObjetElementControle() <em>APour Objet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetElementControle;

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
	protected TypeAssociationSiteEltCtrlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationSiteEltCtrl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationSiteEltCtrlCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationSiteEltCtrlCategorie newCategorie) {
		TypeDictionaryDicoAssociationSiteEltCtrlCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationSiteEltCtrlCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourObjetElementControle() {
		return aPourObjetElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetElementControle(TypeAssociation newAPourObjetElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourObjetElementControle = aPourObjetElementControle;
		aPourObjetElementControle = newAPourObjetElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE, oldAPourObjetElementControle, newAPourObjetElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetElementControle(TypeAssociation newAPourObjetElementControle) {
		if (newAPourObjetElementControle != aPourObjetElementControle) {
			NotificationChain msgs = null;
			if (aPourObjetElementControle != null)
				msgs = ((InternalEObject)aPourObjetElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE, null, msgs);
			if (newAPourObjetElementControle != null)
				msgs = ((InternalEObject)newAPourObjetElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourObjetElementControle(newAPourObjetElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE, newAPourObjetElementControle, newAPourObjetElementControle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_SUJET_SITE, oldAPourSujetSite, newAPourSujetSite);
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
				msgs = ((InternalEObject)aPourSujetSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_SUJET_SITE, null, msgs);
			if (newAPourSujetSite != null)
				msgs = ((InternalEObject)newAPourSujetSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_SUJET_SITE, null, msgs);
			msgs = basicSetAPourSujetSite(newAPourSujetSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_SUJET_SITE, newAPourSujetSite, newAPourSujetSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				return basicSetAPourObjetElementControle(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_SUJET_SITE:
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				return getAPourObjetElementControle();
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_SUJET_SITE:
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationSiteEltCtrlCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				setAPourObjetElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_SUJET_SITE:
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				setAPourObjetElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_SUJET_SITE:
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
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				return aPourObjetElementControle != null;
			case SchemaPackage.TYPE_ASSOCIATION_SITE_ELT_CTRL__APOUR_SUJET_SITE:
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

} //TypeAssociationSiteEltCtrlImpl
