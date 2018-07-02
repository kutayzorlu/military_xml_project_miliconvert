/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationEvenementRENSAutreEvenement;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Evenement RENS Autre Evenement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationEvenementRENSAutreEvenementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEvenementRENSAutreEvenementImpl#getAssocieCommeSujetEvenementRENS <em>Associe Comme Sujet Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEvenementRENSAutreEvenementImpl#getAssocieCommeObjetAutreEvenement <em>Associe Comme Objet Autre Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEvenementRENSAutreEvenementImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationEvenementRENSAutreEvenement {
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
	 * The cached value of the '{@link #getAssocieCommeSujetEvenementRENS() <em>Associe Comme Sujet Evenement RENS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetEvenementRENS()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetEvenementRENS;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetAutreEvenement() <em>Associe Comme Objet Autre Evenement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetAutreEvenement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEvenementRENSAutreEvenementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationEvenementRENSAutreEvenement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_EVENEMENT_RENS, oldAssocieCommeSujetEvenementRENS, newAssocieCommeSujetEvenementRENS);
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
				msgs = ((InternalEObject)associeCommeSujetEvenementRENS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_EVENEMENT_RENS, null, msgs);
			if (newAssocieCommeSujetEvenementRENS != null)
				msgs = ((InternalEObject)newAssocieCommeSujetEvenementRENS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_EVENEMENT_RENS, null, msgs);
			msgs = basicSetAssocieCommeSujetEvenementRENS(newAssocieCommeSujetEvenementRENS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_EVENEMENT_RENS, newAssocieCommeSujetEvenementRENS, newAssocieCommeSujetEvenementRENS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetAutreEvenement() {
		return associeCommeObjetAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetAutreEvenement(TypeAssociation newAssocieCommeObjetAutreEvenement, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetAutreEvenement = associeCommeObjetAutreEvenement;
		associeCommeObjetAutreEvenement = newAssocieCommeObjetAutreEvenement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT, oldAssocieCommeObjetAutreEvenement, newAssocieCommeObjetAutreEvenement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetAutreEvenement(TypeAssociation newAssocieCommeObjetAutreEvenement) {
		if (newAssocieCommeObjetAutreEvenement != associeCommeObjetAutreEvenement) {
			NotificationChain msgs = null;
			if (associeCommeObjetAutreEvenement != null)
				msgs = ((InternalEObject)associeCommeObjetAutreEvenement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT, null, msgs);
			if (newAssocieCommeObjetAutreEvenement != null)
				msgs = ((InternalEObject)newAssocieCommeObjetAutreEvenement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT, null, msgs);
			msgs = basicSetAssocieCommeObjetAutreEvenement(newAssocieCommeObjetAutreEvenement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT, newAssocieCommeObjetAutreEvenement, newAssocieCommeObjetAutreEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				return basicSetAssocieCommeSujetEvenementRENS(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				return basicSetAssocieCommeObjetAutreEvenement(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				return getAssocieCommeSujetEvenementRENS();
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				return getAssocieCommeObjetAutreEvenement();
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				setAssocieCommeSujetEvenementRENS((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				setAssocieCommeObjetAutreEvenement((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				setAssocieCommeSujetEvenementRENS((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				setAssocieCommeObjetAutreEvenement((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_EVENEMENT_RENS:
				return associeCommeSujetEvenementRENS != null;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				return associeCommeObjetAutreEvenement != null;
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

} //TypeAssociationEvenementRENSAutreEvenementImpl
