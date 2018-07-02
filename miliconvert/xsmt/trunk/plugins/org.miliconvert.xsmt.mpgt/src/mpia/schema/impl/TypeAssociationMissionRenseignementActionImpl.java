/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationMissionRenseignementAction;
import mpia.schema.TypeDictionaryDicoAssociationMissionRenseignementActionCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Mission Renseignement Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionRenseignementActionImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionRenseignementActionImpl#getAssocieCommeSujetMissionRenseignement <em>Associe Comme Sujet Mission Renseignement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionRenseignementActionImpl#getAssocieCommeObjetAction <em>Associe Comme Objet Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMissionRenseignementActionImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationMissionRenseignementAction {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationMissionRenseignementActionCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationMissionRenseignementActionCategorie.ISAPRQ;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationMissionRenseignementActionCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetMissionRenseignement() <em>Associe Comme Sujet Mission Renseignement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetMissionRenseignement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetMissionRenseignement;

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
	protected TypeAssociationMissionRenseignementActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMissionRenseignementAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationMissionRenseignementActionCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationMissionRenseignementActionCategorie newCategorie) {
		TypeDictionaryDicoAssociationMissionRenseignementActionCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationMissionRenseignementActionCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeSujetMissionRenseignement() {
		return associeCommeSujetMissionRenseignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetMissionRenseignement(TypeAssociation newAssocieCommeSujetMissionRenseignement, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetMissionRenseignement = associeCommeSujetMissionRenseignement;
		associeCommeSujetMissionRenseignement = newAssocieCommeSujetMissionRenseignement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT, oldAssocieCommeSujetMissionRenseignement, newAssocieCommeSujetMissionRenseignement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetMissionRenseignement(TypeAssociation newAssocieCommeSujetMissionRenseignement) {
		if (newAssocieCommeSujetMissionRenseignement != associeCommeSujetMissionRenseignement) {
			NotificationChain msgs = null;
			if (associeCommeSujetMissionRenseignement != null)
				msgs = ((InternalEObject)associeCommeSujetMissionRenseignement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT, null, msgs);
			if (newAssocieCommeSujetMissionRenseignement != null)
				msgs = ((InternalEObject)newAssocieCommeSujetMissionRenseignement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT, null, msgs);
			msgs = basicSetAssocieCommeSujetMissionRenseignement(newAssocieCommeSujetMissionRenseignement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT, newAssocieCommeSujetMissionRenseignement, newAssocieCommeSujetMissionRenseignement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION, oldAssocieCommeObjetAction, newAssocieCommeObjetAction);
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
				msgs = ((InternalEObject)associeCommeObjetAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION, null, msgs);
			if (newAssocieCommeObjetAction != null)
				msgs = ((InternalEObject)newAssocieCommeObjetAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION, null, msgs);
			msgs = basicSetAssocieCommeObjetAction(newAssocieCommeObjetAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION, newAssocieCommeObjetAction, newAssocieCommeObjetAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT:
				return basicSetAssocieCommeSujetMissionRenseignement(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT:
				return getAssocieCommeSujetMissionRenseignement();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationMissionRenseignementActionCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT:
				setAssocieCommeSujetMissionRenseignement((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT:
				setAssocieCommeSujetMissionRenseignement((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT:
				return associeCommeSujetMissionRenseignement != null;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENSEIGNEMENT_ACTION__ASSOCIE_COMME_OBJET_ACTION:
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

} //TypeAssociationMissionRenseignementActionImpl
