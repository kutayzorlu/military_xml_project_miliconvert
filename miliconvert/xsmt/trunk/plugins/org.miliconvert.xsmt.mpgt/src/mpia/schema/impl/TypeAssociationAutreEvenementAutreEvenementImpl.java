/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationAutreEvenementAutreEvenement;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Autre Evenement Autre Evenement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationAutreEvenementAutreEvenementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAutreEvenementAutreEvenementImpl#getAssocieCommeObjetAutreEvenement <em>Associe Comme Objet Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAutreEvenementAutreEvenementImpl#getAssocieCommeSujetAutreEvenement <em>Associe Comme Sujet Autre Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationAutreEvenementAutreEvenementImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationAutreEvenementAutreEvenement {
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
	 * The cached value of the '{@link #getAssocieCommeObjetAutreEvenement() <em>Associe Comme Objet Autre Evenement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetAutreEvenement;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetAutreEvenement() <em>Associe Comme Sujet Autre Evenement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetAutreEvenement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationAutreEvenementAutreEvenementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationAutreEvenementAutreEvenement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT, oldAssocieCommeObjetAutreEvenement, newAssocieCommeObjetAutreEvenement);
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
				msgs = ((InternalEObject)associeCommeObjetAutreEvenement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT, null, msgs);
			if (newAssocieCommeObjetAutreEvenement != null)
				msgs = ((InternalEObject)newAssocieCommeObjetAutreEvenement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT, null, msgs);
			msgs = basicSetAssocieCommeObjetAutreEvenement(newAssocieCommeObjetAutreEvenement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT, newAssocieCommeObjetAutreEvenement, newAssocieCommeObjetAutreEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetAutreEvenement() {
		return associeCommeSujetAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetAutreEvenement(TypeAssociation newAssocieCommeSujetAutreEvenement, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetAutreEvenement = associeCommeSujetAutreEvenement;
		associeCommeSujetAutreEvenement = newAssocieCommeSujetAutreEvenement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT, oldAssocieCommeSujetAutreEvenement, newAssocieCommeSujetAutreEvenement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetAutreEvenement(TypeAssociation newAssocieCommeSujetAutreEvenement) {
		if (newAssocieCommeSujetAutreEvenement != associeCommeSujetAutreEvenement) {
			NotificationChain msgs = null;
			if (associeCommeSujetAutreEvenement != null)
				msgs = ((InternalEObject)associeCommeSujetAutreEvenement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT, null, msgs);
			if (newAssocieCommeSujetAutreEvenement != null)
				msgs = ((InternalEObject)newAssocieCommeSujetAutreEvenement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT, null, msgs);
			msgs = basicSetAssocieCommeSujetAutreEvenement(newAssocieCommeSujetAutreEvenement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT, newAssocieCommeSujetAutreEvenement, newAssocieCommeSujetAutreEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				return basicSetAssocieCommeObjetAutreEvenement(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
				return basicSetAssocieCommeSujetAutreEvenement(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				return getAssocieCommeObjetAutreEvenement();
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
				return getAssocieCommeSujetAutreEvenement();
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
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				setAssocieCommeObjetAutreEvenement((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
				setAssocieCommeSujetAutreEvenement((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				setAssocieCommeObjetAutreEvenement((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
				setAssocieCommeSujetAutreEvenement((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_OBJET_AUTRE_EVENEMENT:
				return associeCommeObjetAutreEvenement != null;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
				return associeCommeSujetAutreEvenement != null;
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

} //TypeAssociationAutreEvenementAutreEvenementImpl
