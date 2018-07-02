/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationActionAction;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Action Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationActionActionImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActionActionImpl#getAssocieCommeSujetAction <em>Associe Comme Sujet Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActionActionImpl#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationActionActionImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationActionAction {
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
	 * The cached value of the '{@link #getAssocieCommeSujetAction() <em>Associe Comme Sujet Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetAction()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetAction;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationActionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationActionAction();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeSujetAction() {
		return associeCommeSujetAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetAction(TypeAssociation newAssocieCommeSujetAction, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetAction = associeCommeSujetAction;
		associeCommeSujetAction = newAssocieCommeSujetAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_SUJET_ACTION, oldAssocieCommeSujetAction, newAssocieCommeSujetAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetAction(TypeAssociation newAssocieCommeSujetAction) {
		if (newAssocieCommeSujetAction != associeCommeSujetAction) {
			NotificationChain msgs = null;
			if (associeCommeSujetAction != null)
				msgs = ((InternalEObject)associeCommeSujetAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_SUJET_ACTION, null, msgs);
			if (newAssocieCommeSujetAction != null)
				msgs = ((InternalEObject)newAssocieCommeSujetAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_SUJET_ACTION, null, msgs);
			msgs = basicSetAssocieCommeSujetAction(newAssocieCommeSujetAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_SUJET_ACTION, newAssocieCommeSujetAction, newAssocieCommeSujetAction));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_OBJET_ACTION, oldAssocieCommeObjetAction, newAssocieCommeObjetAction);
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
				msgs = ((InternalEObject)associeCommeObjetAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_OBJET_ACTION, null, msgs);
			if (newAssocieCommeObjetAction != null)
				msgs = ((InternalEObject)newAssocieCommeObjetAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_OBJET_ACTION, null, msgs);
			msgs = basicSetAssocieCommeObjetAction(newAssocieCommeObjetAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_OBJET_ACTION, newAssocieCommeObjetAction, newAssocieCommeObjetAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_SUJET_ACTION:
				return basicSetAssocieCommeSujetAction(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				return basicSetAssocieCommeObjetAction(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_SUJET_ACTION:
				return getAssocieCommeSujetAction();
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				return getAssocieCommeObjetAction();
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_SUJET_ACTION:
				setAssocieCommeSujetAction((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				setAssocieCommeObjetAction((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_SUJET_ACTION:
				setAssocieCommeSujetAction((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				setAssocieCommeObjetAction((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_SUJET_ACTION:
				return associeCommeSujetAction != null;
			case SchemaPackage.TYPE_ASSOCIATION_ACTION_ACTION__ASSOCIE_COMME_OBJET_ACTION:
				return associeCommeObjetAction != null;
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

} //TypeAssociationActionActionImpl
