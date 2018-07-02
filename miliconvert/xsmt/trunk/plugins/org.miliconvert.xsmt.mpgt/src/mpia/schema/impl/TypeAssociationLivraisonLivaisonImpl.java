/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationLivraisonLivaison;
import mpia.schema.TypeDictionaryDicoAssociationLivraisonLivaisonCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Livraison Livaison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationLivraisonLivaisonImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationLivraisonLivaisonImpl#getAssocieCommeSujetLivraison <em>Associe Comme Sujet Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationLivraisonLivaisonImpl#getAssocieCommeObjetLivraison <em>Associe Comme Objet Livraison</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationLivraisonLivaisonImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationLivraisonLivaison {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationLivraisonLivaisonCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationLivraisonLivaisonCategorie.DELREQ;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationLivraisonLivaisonCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetLivraison() <em>Associe Comme Sujet Livraison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetLivraison()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetLivraison;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetLivraison() <em>Associe Comme Objet Livraison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetLivraison()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetLivraison;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationLivraisonLivaisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationLivraisonLivaison();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationLivraisonLivaisonCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationLivraisonLivaisonCategorie newCategorie) {
		TypeDictionaryDicoAssociationLivraisonLivaisonCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationLivraisonLivaisonCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeSujetLivraison() {
		return associeCommeSujetLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetLivraison(TypeAssociation newAssocieCommeSujetLivraison, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetLivraison = associeCommeSujetLivraison;
		associeCommeSujetLivraison = newAssocieCommeSujetLivraison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_SUJET_LIVRAISON, oldAssocieCommeSujetLivraison, newAssocieCommeSujetLivraison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetLivraison(TypeAssociation newAssocieCommeSujetLivraison) {
		if (newAssocieCommeSujetLivraison != associeCommeSujetLivraison) {
			NotificationChain msgs = null;
			if (associeCommeSujetLivraison != null)
				msgs = ((InternalEObject)associeCommeSujetLivraison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_SUJET_LIVRAISON, null, msgs);
			if (newAssocieCommeSujetLivraison != null)
				msgs = ((InternalEObject)newAssocieCommeSujetLivraison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_SUJET_LIVRAISON, null, msgs);
			msgs = basicSetAssocieCommeSujetLivraison(newAssocieCommeSujetLivraison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_SUJET_LIVRAISON, newAssocieCommeSujetLivraison, newAssocieCommeSujetLivraison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetLivraison() {
		return associeCommeObjetLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetLivraison(TypeAssociation newAssocieCommeObjetLivraison, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetLivraison = associeCommeObjetLivraison;
		associeCommeObjetLivraison = newAssocieCommeObjetLivraison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_OBJET_LIVRAISON, oldAssocieCommeObjetLivraison, newAssocieCommeObjetLivraison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetLivraison(TypeAssociation newAssocieCommeObjetLivraison) {
		if (newAssocieCommeObjetLivraison != associeCommeObjetLivraison) {
			NotificationChain msgs = null;
			if (associeCommeObjetLivraison != null)
				msgs = ((InternalEObject)associeCommeObjetLivraison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_OBJET_LIVRAISON, null, msgs);
			if (newAssocieCommeObjetLivraison != null)
				msgs = ((InternalEObject)newAssocieCommeObjetLivraison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_OBJET_LIVRAISON, null, msgs);
			msgs = basicSetAssocieCommeObjetLivraison(newAssocieCommeObjetLivraison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_OBJET_LIVRAISON, newAssocieCommeObjetLivraison, newAssocieCommeObjetLivraison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_SUJET_LIVRAISON:
				return basicSetAssocieCommeSujetLivraison(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_OBJET_LIVRAISON:
				return basicSetAssocieCommeObjetLivraison(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_SUJET_LIVRAISON:
				return getAssocieCommeSujetLivraison();
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_OBJET_LIVRAISON:
				return getAssocieCommeObjetLivraison();
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
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationLivraisonLivaisonCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_SUJET_LIVRAISON:
				setAssocieCommeSujetLivraison((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_OBJET_LIVRAISON:
				setAssocieCommeObjetLivraison((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_SUJET_LIVRAISON:
				setAssocieCommeSujetLivraison((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_OBJET_LIVRAISON:
				setAssocieCommeObjetLivraison((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_SUJET_LIVRAISON:
				return associeCommeSujetLivraison != null;
			case SchemaPackage.TYPE_ASSOCIATION_LIVRAISON_LIVAISON__ASSOCIE_COMME_OBJET_LIVRAISON:
				return associeCommeObjetLivraison != null;
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

} //TypeAssociationLivraisonLivaisonImpl
