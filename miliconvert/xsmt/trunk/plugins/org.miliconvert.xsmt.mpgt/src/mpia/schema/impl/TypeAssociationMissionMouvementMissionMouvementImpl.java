/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationMissionMouvementMissionMouvement;
import mpia.schema.TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Mission Mouvement Mission Mouvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionMouvementMissionMouvementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionMouvementMissionMouvementImpl#getAssocieCommeObjetMissionMouvement <em>Associe Comme Objet Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionMouvementMissionMouvementImpl#getAssocieCommeSujetMissionMouvement <em>Associe Comme Sujet Mission Mouvement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMissionMouvementMissionMouvementImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationMissionMouvementMissionMouvement {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie.ENABLE;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetMissionMouvement() <em>Associe Comme Objet Mission Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetMissionMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetMissionMouvement;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetMissionMouvement() <em>Associe Comme Sujet Mission Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetMissionMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetMissionMouvement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationMissionMouvementMissionMouvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMissionMouvementMissionMouvement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie newCategorie) {
		TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeObjetMissionMouvement() {
		return associeCommeObjetMissionMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetMissionMouvement(TypeAssociation newAssocieCommeObjetMissionMouvement, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetMissionMouvement = associeCommeObjetMissionMouvement;
		associeCommeObjetMissionMouvement = newAssocieCommeObjetMissionMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_OBJET_MISSION_MOUVEMENT, oldAssocieCommeObjetMissionMouvement, newAssocieCommeObjetMissionMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetMissionMouvement(TypeAssociation newAssocieCommeObjetMissionMouvement) {
		if (newAssocieCommeObjetMissionMouvement != associeCommeObjetMissionMouvement) {
			NotificationChain msgs = null;
			if (associeCommeObjetMissionMouvement != null)
				msgs = ((InternalEObject)associeCommeObjetMissionMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_OBJET_MISSION_MOUVEMENT, null, msgs);
			if (newAssocieCommeObjetMissionMouvement != null)
				msgs = ((InternalEObject)newAssocieCommeObjetMissionMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_OBJET_MISSION_MOUVEMENT, null, msgs);
			msgs = basicSetAssocieCommeObjetMissionMouvement(newAssocieCommeObjetMissionMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_OBJET_MISSION_MOUVEMENT, newAssocieCommeObjetMissionMouvement, newAssocieCommeObjetMissionMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetMissionMouvement() {
		return associeCommeSujetMissionMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetMissionMouvement(TypeAssociation newAssocieCommeSujetMissionMouvement, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetMissionMouvement = associeCommeSujetMissionMouvement;
		associeCommeSujetMissionMouvement = newAssocieCommeSujetMissionMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_SUJET_MISSION_MOUVEMENT, oldAssocieCommeSujetMissionMouvement, newAssocieCommeSujetMissionMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetMissionMouvement(TypeAssociation newAssocieCommeSujetMissionMouvement) {
		if (newAssocieCommeSujetMissionMouvement != associeCommeSujetMissionMouvement) {
			NotificationChain msgs = null;
			if (associeCommeSujetMissionMouvement != null)
				msgs = ((InternalEObject)associeCommeSujetMissionMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_SUJET_MISSION_MOUVEMENT, null, msgs);
			if (newAssocieCommeSujetMissionMouvement != null)
				msgs = ((InternalEObject)newAssocieCommeSujetMissionMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_SUJET_MISSION_MOUVEMENT, null, msgs);
			msgs = basicSetAssocieCommeSujetMissionMouvement(newAssocieCommeSujetMissionMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_SUJET_MISSION_MOUVEMENT, newAssocieCommeSujetMissionMouvement, newAssocieCommeSujetMissionMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_OBJET_MISSION_MOUVEMENT:
				return basicSetAssocieCommeObjetMissionMouvement(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_SUJET_MISSION_MOUVEMENT:
				return basicSetAssocieCommeSujetMissionMouvement(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_OBJET_MISSION_MOUVEMENT:
				return getAssocieCommeObjetMissionMouvement();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_SUJET_MISSION_MOUVEMENT:
				return getAssocieCommeSujetMissionMouvement();
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationMissionMouvementMissionMouvementCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_OBJET_MISSION_MOUVEMENT:
				setAssocieCommeObjetMissionMouvement((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_SUJET_MISSION_MOUVEMENT:
				setAssocieCommeSujetMissionMouvement((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_OBJET_MISSION_MOUVEMENT:
				setAssocieCommeObjetMissionMouvement((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_SUJET_MISSION_MOUVEMENT:
				setAssocieCommeSujetMissionMouvement((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_OBJET_MISSION_MOUVEMENT:
				return associeCommeObjetMissionMouvement != null;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_MOUVEMENT_MISSION_MOUVEMENT__ASSOCIE_COMME_SUJET_MISSION_MOUVEMENT:
				return associeCommeSujetMissionMouvement != null;
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

} //TypeAssociationMissionMouvementMissionMouvementImpl
