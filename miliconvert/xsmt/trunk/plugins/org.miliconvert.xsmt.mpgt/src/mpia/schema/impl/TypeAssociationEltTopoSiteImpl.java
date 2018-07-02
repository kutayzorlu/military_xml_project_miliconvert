/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationEltTopoSite;
import mpia.schema.TypeDictionaryDicoAssociationEltTopoSiteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Elt Topo Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationEltTopoSiteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEltTopoSiteImpl#getAPourSujetElementTopographie <em>APour Sujet Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEltTopoSiteImpl#getAPourObjetSite <em>APour Objet Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEltTopoSiteImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationEltTopoSite {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationEltTopoSiteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationEltTopoSiteCategorie.SERVES;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationEltTopoSiteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourSujetElementTopographie() <em>APour Sujet Element Topographie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetElementTopographie()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetElementTopographie;

	/**
	 * The cached value of the '{@link #getAPourObjetSite() <em>APour Objet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetSite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEltTopoSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationEltTopoSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationEltTopoSiteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationEltTopoSiteCategorie newCategorie) {
		TypeDictionaryDicoAssociationEltTopoSiteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationEltTopoSiteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourSujetElementTopographie() {
		return aPourSujetElementTopographie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetElementTopographie(TypeAssociation newAPourSujetElementTopographie, NotificationChain msgs) {
		TypeAssociation oldAPourSujetElementTopographie = aPourSujetElementTopographie;
		aPourSujetElementTopographie = newAPourSujetElementTopographie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_SUJET_ELEMENT_TOPOGRAPHIE, oldAPourSujetElementTopographie, newAPourSujetElementTopographie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetElementTopographie(TypeAssociation newAPourSujetElementTopographie) {
		if (newAPourSujetElementTopographie != aPourSujetElementTopographie) {
			NotificationChain msgs = null;
			if (aPourSujetElementTopographie != null)
				msgs = ((InternalEObject)aPourSujetElementTopographie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_SUJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			if (newAPourSujetElementTopographie != null)
				msgs = ((InternalEObject)newAPourSujetElementTopographie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_SUJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			msgs = basicSetAPourSujetElementTopographie(newAPourSujetElementTopographie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_SUJET_ELEMENT_TOPOGRAPHIE, newAPourSujetElementTopographie, newAPourSujetElementTopographie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetSite() {
		return aPourObjetSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetSite(TypeAssociation newAPourObjetSite, NotificationChain msgs) {
		TypeAssociation oldAPourObjetSite = aPourObjetSite;
		aPourObjetSite = newAPourObjetSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_OBJET_SITE, oldAPourObjetSite, newAPourObjetSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetSite(TypeAssociation newAPourObjetSite) {
		if (newAPourObjetSite != aPourObjetSite) {
			NotificationChain msgs = null;
			if (aPourObjetSite != null)
				msgs = ((InternalEObject)aPourObjetSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_OBJET_SITE, null, msgs);
			if (newAPourObjetSite != null)
				msgs = ((InternalEObject)newAPourObjetSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_OBJET_SITE, null, msgs);
			msgs = basicSetAPourObjetSite(newAPourObjetSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_OBJET_SITE, newAPourObjetSite, newAPourObjetSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				return basicSetAPourSujetElementTopographie(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_OBJET_SITE:
				return basicSetAPourObjetSite(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				return getAPourSujetElementTopographie();
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_OBJET_SITE:
				return getAPourObjetSite();
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
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationEltTopoSiteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				setAPourSujetElementTopographie((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_OBJET_SITE:
				setAPourObjetSite((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				setAPourSujetElementTopographie((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_OBJET_SITE:
				setAPourObjetSite((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				return aPourSujetElementTopographie != null;
			case SchemaPackage.TYPE_ASSOCIATION_ELT_TOPO_SITE__APOUR_OBJET_SITE:
				return aPourObjetSite != null;
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

} //TypeAssociationEltTopoSiteImpl
