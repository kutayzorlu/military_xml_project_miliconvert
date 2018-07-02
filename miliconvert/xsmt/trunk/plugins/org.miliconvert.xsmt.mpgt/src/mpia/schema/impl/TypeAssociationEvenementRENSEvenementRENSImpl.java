/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationEvenementRENSEvenementRENS;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Evenement RENS Evenement RENS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationEvenementRENSEvenementRENSImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEvenementRENSEvenementRENSImpl#getAssocieCommeObjetEvenementRENS <em>Associe Comme Objet Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEvenementRENSEvenementRENSImpl#getAssocieCommeSujetEvenementRENS <em>Associe Comme Sujet Evenement RENS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEvenementRENSEvenementRENSImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationEvenementRENSEvenementRENS {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie.HSA;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetEvenementRENS() <em>Associe Comme Objet Evenement RENS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetEvenementRENS()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetEvenementRENS;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetEvenementRENS() <em>Associe Comme Sujet Evenement RENS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetEvenementRENS()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetEvenementRENS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEvenementRENSEvenementRENSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationEvenementRENSEvenementRENS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie newCategorie) {
		TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeObjetEvenementRENS() {
		return associeCommeObjetEvenementRENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetEvenementRENS(TypeAssociation newAssocieCommeObjetEvenementRENS, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetEvenementRENS = associeCommeObjetEvenementRENS;
		associeCommeObjetEvenementRENS = newAssocieCommeObjetEvenementRENS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_OBJET_EVENEMENT_RENS, oldAssocieCommeObjetEvenementRENS, newAssocieCommeObjetEvenementRENS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetEvenementRENS(TypeAssociation newAssocieCommeObjetEvenementRENS) {
		if (newAssocieCommeObjetEvenementRENS != associeCommeObjetEvenementRENS) {
			NotificationChain msgs = null;
			if (associeCommeObjetEvenementRENS != null)
				msgs = ((InternalEObject)associeCommeObjetEvenementRENS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_OBJET_EVENEMENT_RENS, null, msgs);
			if (newAssocieCommeObjetEvenementRENS != null)
				msgs = ((InternalEObject)newAssocieCommeObjetEvenementRENS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_OBJET_EVENEMENT_RENS, null, msgs);
			msgs = basicSetAssocieCommeObjetEvenementRENS(newAssocieCommeObjetEvenementRENS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_OBJET_EVENEMENT_RENS, newAssocieCommeObjetEvenementRENS, newAssocieCommeObjetEvenementRENS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetEvenementRENS() {
		return associeCommeSujetEvenementRENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetEvenementRENS(TypeAssociation newAssocieCommeSujetEvenementRENS, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetEvenementRENS = associeCommeSujetEvenementRENS;
		associeCommeSujetEvenementRENS = newAssocieCommeSujetEvenementRENS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_SUJET_EVENEMENT_RENS, oldAssocieCommeSujetEvenementRENS, newAssocieCommeSujetEvenementRENS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetEvenementRENS(TypeAssociation newAssocieCommeSujetEvenementRENS) {
		if (newAssocieCommeSujetEvenementRENS != associeCommeSujetEvenementRENS) {
			NotificationChain msgs = null;
			if (associeCommeSujetEvenementRENS != null)
				msgs = ((InternalEObject)associeCommeSujetEvenementRENS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_SUJET_EVENEMENT_RENS, null, msgs);
			if (newAssocieCommeSujetEvenementRENS != null)
				msgs = ((InternalEObject)newAssocieCommeSujetEvenementRENS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_SUJET_EVENEMENT_RENS, null, msgs);
			msgs = basicSetAssocieCommeSujetEvenementRENS(newAssocieCommeSujetEvenementRENS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_SUJET_EVENEMENT_RENS, newAssocieCommeSujetEvenementRENS, newAssocieCommeSujetEvenementRENS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_OBJET_EVENEMENT_RENS:
				return basicSetAssocieCommeObjetEvenementRENS(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				return basicSetAssocieCommeSujetEvenementRENS(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_OBJET_EVENEMENT_RENS:
				return getAssocieCommeObjetEvenementRENS();
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				return getAssocieCommeSujetEvenementRENS();
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_OBJET_EVENEMENT_RENS:
				setAssocieCommeObjetEvenementRENS((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				setAssocieCommeSujetEvenementRENS((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_OBJET_EVENEMENT_RENS:
				setAssocieCommeObjetEvenementRENS((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				setAssocieCommeSujetEvenementRENS((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_OBJET_EVENEMENT_RENS:
				return associeCommeObjetEvenementRENS != null;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				return associeCommeSujetEvenementRENS != null;
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

} //TypeAssociationEvenementRENSEvenementRENSImpl
