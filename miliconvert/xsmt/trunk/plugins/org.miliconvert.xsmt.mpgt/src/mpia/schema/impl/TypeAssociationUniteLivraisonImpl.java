/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationUniteLivraison;
import mpia.schema.TypeDictionaryDicoAssociationUniteLivraisonCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Unite Livraison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteLivraisonImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteLivraisonImpl#getAPourSujetUnite <em>APour Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationUniteLivraisonImpl#getAPourObjetLivraison <em>APour Objet Livraison</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationUniteLivraisonImpl extends TypeAssociationInstanceObjetActiviteImpl implements TypeAssociationUniteLivraison {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationUniteLivraisonCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationUniteLivraisonCategorie.APPR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationUniteLivraisonCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourSujetUnite() <em>APour Sujet Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetUnite;

	/**
	 * The cached value of the '{@link #getAPourObjetLivraison() <em>APour Objet Livraison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetLivraison()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetLivraison;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationUniteLivraisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationUniteLivraison();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationUniteLivraisonCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationUniteLivraisonCategorie newCategorie) {
		TypeDictionaryDicoAssociationUniteLivraisonCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationUniteLivraisonCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourSujetUnite() {
		return aPourSujetUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetUnite(TypeAssociation newAPourSujetUnite, NotificationChain msgs) {
		TypeAssociation oldAPourSujetUnite = aPourSujetUnite;
		aPourSujetUnite = newAPourSujetUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_SUJET_UNITE, oldAPourSujetUnite, newAPourSujetUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetUnite(TypeAssociation newAPourSujetUnite) {
		if (newAPourSujetUnite != aPourSujetUnite) {
			NotificationChain msgs = null;
			if (aPourSujetUnite != null)
				msgs = ((InternalEObject)aPourSujetUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_SUJET_UNITE, null, msgs);
			if (newAPourSujetUnite != null)
				msgs = ((InternalEObject)newAPourSujetUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_SUJET_UNITE, null, msgs);
			msgs = basicSetAPourSujetUnite(newAPourSujetUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_SUJET_UNITE, newAPourSujetUnite, newAPourSujetUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetLivraison() {
		return aPourObjetLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetLivraison(TypeAssociation newAPourObjetLivraison, NotificationChain msgs) {
		TypeAssociation oldAPourObjetLivraison = aPourObjetLivraison;
		aPourObjetLivraison = newAPourObjetLivraison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_OBJET_LIVRAISON, oldAPourObjetLivraison, newAPourObjetLivraison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetLivraison(TypeAssociation newAPourObjetLivraison) {
		if (newAPourObjetLivraison != aPourObjetLivraison) {
			NotificationChain msgs = null;
			if (aPourObjetLivraison != null)
				msgs = ((InternalEObject)aPourObjetLivraison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_OBJET_LIVRAISON, null, msgs);
			if (newAPourObjetLivraison != null)
				msgs = ((InternalEObject)newAPourObjetLivraison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_OBJET_LIVRAISON, null, msgs);
			msgs = basicSetAPourObjetLivraison(newAPourObjetLivraison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_OBJET_LIVRAISON, newAPourObjetLivraison, newAPourObjetLivraison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_SUJET_UNITE:
				return basicSetAPourSujetUnite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_OBJET_LIVRAISON:
				return basicSetAPourObjetLivraison(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_SUJET_UNITE:
				return getAPourSujetUnite();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_OBJET_LIVRAISON:
				return getAPourObjetLivraison();
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationUniteLivraisonCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_OBJET_LIVRAISON:
				setAPourObjetLivraison((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_SUJET_UNITE:
				setAPourSujetUnite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_OBJET_LIVRAISON:
				setAPourObjetLivraison((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_SUJET_UNITE:
				return aPourSujetUnite != null;
			case SchemaPackage.TYPE_ASSOCIATION_UNITE_LIVRAISON__APOUR_OBJET_LIVRAISON:
				return aPourObjetLivraison != null;
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

} //TypeAssociationUniteLivraisonImpl
