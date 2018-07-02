/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationAutreEvenementAction;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Autre Evenement Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationAutreEvenementActionImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAutreEvenementActionImpl#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAutreEvenementActionImpl#getAssocieCommeSujetAutreEvenement <em>Associe Comme Sujet Autre Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationAutreEvenementActionImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationAutreEvenementAction {
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
	 * The cached value of the '{@link #getAssocieCommeObjetAction() <em>Associe Comme Objet Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetAction()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetAction;

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
	protected TypeAssociationAutreEvenementActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationAutreEvenementAction();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeObjetAction() {
		return associeCommeObjetAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetAction(TypeAssociation newAssocieCommeObjetAction, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetAction = associeCommeObjetAction;
		associeCommeObjetAction = newAssocieCommeObjetAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION, oldAssocieCommeObjetAction, newAssocieCommeObjetAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetAction(TypeAssociation newAssocieCommeObjetAction) {
		if (newAssocieCommeObjetAction != associeCommeObjetAction) {
			NotificationChain msgs = null;
			if (associeCommeObjetAction != null)
				msgs = ((InternalEObject)associeCommeObjetAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION, null, msgs);
			if (newAssocieCommeObjetAction != null)
				msgs = ((InternalEObject)newAssocieCommeObjetAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION, null, msgs);
			msgs = basicSetAssocieCommeObjetAction(newAssocieCommeObjetAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION, newAssocieCommeObjetAction, newAssocieCommeObjetAction));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT, oldAssocieCommeSujetAutreEvenement, newAssocieCommeSujetAutreEvenement);
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
				msgs = ((InternalEObject)associeCommeSujetAutreEvenement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT, null, msgs);
			if (newAssocieCommeSujetAutreEvenement != null)
				msgs = ((InternalEObject)newAssocieCommeSujetAutreEvenement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT, null, msgs);
			msgs = basicSetAssocieCommeSujetAutreEvenement(newAssocieCommeSujetAutreEvenement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT, newAssocieCommeSujetAutreEvenement, newAssocieCommeSujetAutreEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				return basicSetAssocieCommeObjetAction(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
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
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				return getAssocieCommeObjetAction();
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
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
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				setAssocieCommeObjetAction((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
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
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				setAssocieCommeObjetAction((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
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
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				return associeCommeObjetAction != null;
			case SchemaPackage.TYPE_ASSOCIATION_AUTRE_EVENEMENT_ACTION__ASSOCIE_COMME_SUJET_AUTRE_EVENEMENT:
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

} //TypeAssociationAutreEvenementActionImpl
