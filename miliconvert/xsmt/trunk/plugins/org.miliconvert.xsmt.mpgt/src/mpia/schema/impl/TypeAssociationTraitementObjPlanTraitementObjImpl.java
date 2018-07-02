/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationTraitementObjPlanTraitementObj;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Traitement Obj Plan Traitement Obj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationTraitementObjPlanTraitementObjImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationTraitementObjPlanTraitementObjImpl#getAssocieCommeSujetTraitementObjectif <em>Associe Comme Sujet Traitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationTraitementObjPlanTraitementObjImpl#getAssocieCommeObjetPlanTraitementObjectifs <em>Associe Comme Objet Plan Traitement Objectifs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationTraitementObjPlanTraitementObjImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationTraitementObjPlanTraitementObj {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationFonctionnelleUARCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationFonctionnelleUARCategorie.UAR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationFonctionnelleUARCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetTraitementObjectif() <em>Associe Comme Sujet Traitement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetTraitementObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetTraitementObjectif;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetPlanTraitementObjectifs() <em>Associe Comme Objet Plan Traitement Objectifs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetPlanTraitementObjectifs()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetPlanTraitementObjectifs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationTraitementObjPlanTraitementObjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationTraitementObjPlanTraitementObj();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationFonctionnelleUARCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie newCategorie) {
		TypeDictionaryDicoAssociationFonctionnelleUARCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationFonctionnelleUARCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeSujetTraitementObjectif() {
		return associeCommeSujetTraitementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetTraitementObjectif(TypeAssociation newAssocieCommeSujetTraitementObjectif, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetTraitementObjectif = associeCommeSujetTraitementObjectif;
		associeCommeSujetTraitementObjectif = newAssocieCommeSujetTraitementObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_TRAITEMENT_OBJECTIF, oldAssocieCommeSujetTraitementObjectif, newAssocieCommeSujetTraitementObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetTraitementObjectif(TypeAssociation newAssocieCommeSujetTraitementObjectif) {
		if (newAssocieCommeSujetTraitementObjectif != associeCommeSujetTraitementObjectif) {
			NotificationChain msgs = null;
			if (associeCommeSujetTraitementObjectif != null)
				msgs = ((InternalEObject)associeCommeSujetTraitementObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_TRAITEMENT_OBJECTIF, null, msgs);
			if (newAssocieCommeSujetTraitementObjectif != null)
				msgs = ((InternalEObject)newAssocieCommeSujetTraitementObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_TRAITEMENT_OBJECTIF, null, msgs);
			msgs = basicSetAssocieCommeSujetTraitementObjectif(newAssocieCommeSujetTraitementObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_TRAITEMENT_OBJECTIF, newAssocieCommeSujetTraitementObjectif, newAssocieCommeSujetTraitementObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetPlanTraitementObjectifs() {
		return associeCommeObjetPlanTraitementObjectifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetPlanTraitementObjectifs(TypeAssociation newAssocieCommeObjetPlanTraitementObjectifs, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetPlanTraitementObjectifs = associeCommeObjetPlanTraitementObjectifs;
		associeCommeObjetPlanTraitementObjectifs = newAssocieCommeObjetPlanTraitementObjectifs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS, oldAssocieCommeObjetPlanTraitementObjectifs, newAssocieCommeObjetPlanTraitementObjectifs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetPlanTraitementObjectifs(TypeAssociation newAssocieCommeObjetPlanTraitementObjectifs) {
		if (newAssocieCommeObjetPlanTraitementObjectifs != associeCommeObjetPlanTraitementObjectifs) {
			NotificationChain msgs = null;
			if (associeCommeObjetPlanTraitementObjectifs != null)
				msgs = ((InternalEObject)associeCommeObjetPlanTraitementObjectifs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS, null, msgs);
			if (newAssocieCommeObjetPlanTraitementObjectifs != null)
				msgs = ((InternalEObject)newAssocieCommeObjetPlanTraitementObjectifs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS, null, msgs);
			msgs = basicSetAssocieCommeObjetPlanTraitementObjectifs(newAssocieCommeObjetPlanTraitementObjectifs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS, newAssocieCommeObjetPlanTraitementObjectifs, newAssocieCommeObjetPlanTraitementObjectifs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_TRAITEMENT_OBJECTIF:
				return basicSetAssocieCommeSujetTraitementObjectif(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				return basicSetAssocieCommeObjetPlanTraitementObjectifs(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_TRAITEMENT_OBJECTIF:
				return getAssocieCommeSujetTraitementObjectif();
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				return getAssocieCommeObjetPlanTraitementObjectifs();
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
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleUARCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_TRAITEMENT_OBJECTIF:
				setAssocieCommeSujetTraitementObjectif((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				setAssocieCommeObjetPlanTraitementObjectifs((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_TRAITEMENT_OBJECTIF:
				setAssocieCommeSujetTraitementObjectif((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				setAssocieCommeObjetPlanTraitementObjectifs((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_TRAITEMENT_OBJECTIF:
				return associeCommeSujetTraitementObjectif != null;
			case SchemaPackage.TYPE_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				return associeCommeObjetPlanTraitementObjectifs != null;
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

} //TypeAssociationTraitementObjPlanTraitementObjImpl
