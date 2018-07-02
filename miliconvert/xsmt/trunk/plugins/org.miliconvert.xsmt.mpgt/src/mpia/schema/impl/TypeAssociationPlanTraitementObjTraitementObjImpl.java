/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationPlanTraitementObjTraitementObj;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleHSACategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Plan Traitement Obj Traitement Obj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanTraitementObjTraitementObjImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanTraitementObjTraitementObjImpl#getAssocieCommeObjetTraitementObjectif <em>Associe Comme Objet Traitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanTraitementObjTraitementObjImpl#getAssocieCommeSujetPlanTraitementObjectifs <em>Associe Comme Sujet Plan Traitement Objectifs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationPlanTraitementObjTraitementObjImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationPlanTraitementObjTraitementObj {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationFonctionnelleHSACategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationFonctionnelleHSACategorie.HSA;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationFonctionnelleHSACategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetTraitementObjectif() <em>Associe Comme Objet Traitement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetTraitementObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetTraitementObjectif;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetPlanTraitementObjectifs() <em>Associe Comme Sujet Plan Traitement Objectifs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetPlanTraitementObjectifs()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetPlanTraitementObjectifs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationPlanTraitementObjTraitementObjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationPlanTraitementObjTraitementObj();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationFonctionnelleHSACategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie newCategorie) {
		TypeDictionaryDicoAssociationFonctionnelleHSACategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationFonctionnelleHSACategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeObjetTraitementObjectif() {
		return associeCommeObjetTraitementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetTraitementObjectif(TypeAssociation newAssocieCommeObjetTraitementObjectif, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetTraitementObjectif = associeCommeObjetTraitementObjectif;
		associeCommeObjetTraitementObjectif = newAssocieCommeObjetTraitementObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_TRAITEMENT_OBJECTIF, oldAssocieCommeObjetTraitementObjectif, newAssocieCommeObjetTraitementObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetTraitementObjectif(TypeAssociation newAssocieCommeObjetTraitementObjectif) {
		if (newAssocieCommeObjetTraitementObjectif != associeCommeObjetTraitementObjectif) {
			NotificationChain msgs = null;
			if (associeCommeObjetTraitementObjectif != null)
				msgs = ((InternalEObject)associeCommeObjetTraitementObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_TRAITEMENT_OBJECTIF, null, msgs);
			if (newAssocieCommeObjetTraitementObjectif != null)
				msgs = ((InternalEObject)newAssocieCommeObjetTraitementObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_TRAITEMENT_OBJECTIF, null, msgs);
			msgs = basicSetAssocieCommeObjetTraitementObjectif(newAssocieCommeObjetTraitementObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_TRAITEMENT_OBJECTIF, newAssocieCommeObjetTraitementObjectif, newAssocieCommeObjetTraitementObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetPlanTraitementObjectifs() {
		return associeCommeSujetPlanTraitementObjectifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetPlanTraitementObjectifs(TypeAssociation newAssocieCommeSujetPlanTraitementObjectifs, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetPlanTraitementObjectifs = associeCommeSujetPlanTraitementObjectifs;
		associeCommeSujetPlanTraitementObjectifs = newAssocieCommeSujetPlanTraitementObjectifs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_PLAN_TRAITEMENT_OBJECTIFS, oldAssocieCommeSujetPlanTraitementObjectifs, newAssocieCommeSujetPlanTraitementObjectifs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetPlanTraitementObjectifs(TypeAssociation newAssocieCommeSujetPlanTraitementObjectifs) {
		if (newAssocieCommeSujetPlanTraitementObjectifs != associeCommeSujetPlanTraitementObjectifs) {
			NotificationChain msgs = null;
			if (associeCommeSujetPlanTraitementObjectifs != null)
				msgs = ((InternalEObject)associeCommeSujetPlanTraitementObjectifs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_PLAN_TRAITEMENT_OBJECTIFS, null, msgs);
			if (newAssocieCommeSujetPlanTraitementObjectifs != null)
				msgs = ((InternalEObject)newAssocieCommeSujetPlanTraitementObjectifs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_PLAN_TRAITEMENT_OBJECTIFS, null, msgs);
			msgs = basicSetAssocieCommeSujetPlanTraitementObjectifs(newAssocieCommeSujetPlanTraitementObjectifs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_PLAN_TRAITEMENT_OBJECTIFS, newAssocieCommeSujetPlanTraitementObjectifs, newAssocieCommeSujetPlanTraitementObjectifs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_TRAITEMENT_OBJECTIF:
				return basicSetAssocieCommeObjetTraitementObjectif(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_PLAN_TRAITEMENT_OBJECTIFS:
				return basicSetAssocieCommeSujetPlanTraitementObjectifs(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_TRAITEMENT_OBJECTIF:
				return getAssocieCommeObjetTraitementObjectif();
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_PLAN_TRAITEMENT_OBJECTIFS:
				return getAssocieCommeSujetPlanTraitementObjectifs();
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
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleHSACategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_TRAITEMENT_OBJECTIF:
				setAssocieCommeObjetTraitementObjectif((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_PLAN_TRAITEMENT_OBJECTIFS:
				setAssocieCommeSujetPlanTraitementObjectifs((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_TRAITEMENT_OBJECTIF:
				setAssocieCommeObjetTraitementObjectif((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_PLAN_TRAITEMENT_OBJECTIFS:
				setAssocieCommeSujetPlanTraitementObjectifs((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_TRAITEMENT_OBJECTIF:
				return associeCommeObjetTraitementObjectif != null;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_PLAN_TRAITEMENT_OBJECTIFS:
				return associeCommeSujetPlanTraitementObjectifs != null;
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

} //TypeAssociationPlanTraitementObjTraitementObjImpl
