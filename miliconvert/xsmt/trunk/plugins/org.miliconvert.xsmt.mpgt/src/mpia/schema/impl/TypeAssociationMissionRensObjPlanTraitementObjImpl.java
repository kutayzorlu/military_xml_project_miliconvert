/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Mission Rens Obj Plan Traitement Obj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionRensObjPlanTraitementObjImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionRensObjPlanTraitementObjImpl#getAssocieCommeObjetPlanTraitementObjectifs <em>Associe Comme Objet Plan Traitement Objectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionRensObjPlanTraitementObjImpl#getAssocieCommeSujetMissionRenseignementObjectif <em>Associe Comme Sujet Mission Renseignement Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMissionRensObjPlanTraitementObjImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationMissionRensObjPlanTraitementObj {
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
	 * The cached value of the '{@link #getAssocieCommeObjetPlanTraitementObjectifs() <em>Associe Comme Objet Plan Traitement Objectifs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetPlanTraitementObjectifs()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetPlanTraitementObjectifs;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetMissionRenseignementObjectif() <em>Associe Comme Sujet Mission Renseignement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetMissionRenseignementObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetMissionRenseignementObjectif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationMissionRensObjPlanTraitementObjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMissionRensObjPlanTraitementObj();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS, oldAssocieCommeObjetPlanTraitementObjectifs, newAssocieCommeObjetPlanTraitementObjectifs);
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
				msgs = ((InternalEObject)associeCommeObjetPlanTraitementObjectifs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS, null, msgs);
			if (newAssocieCommeObjetPlanTraitementObjectifs != null)
				msgs = ((InternalEObject)newAssocieCommeObjetPlanTraitementObjectifs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS, null, msgs);
			msgs = basicSetAssocieCommeObjetPlanTraitementObjectifs(newAssocieCommeObjetPlanTraitementObjectifs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS, newAssocieCommeObjetPlanTraitementObjectifs, newAssocieCommeObjetPlanTraitementObjectifs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetMissionRenseignementObjectif() {
		return associeCommeSujetMissionRenseignementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetMissionRenseignementObjectif(TypeAssociation newAssocieCommeSujetMissionRenseignementObjectif, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetMissionRenseignementObjectif = associeCommeSujetMissionRenseignementObjectif;
		associeCommeSujetMissionRenseignementObjectif = newAssocieCommeSujetMissionRenseignementObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT_OBJECTIF, oldAssocieCommeSujetMissionRenseignementObjectif, newAssocieCommeSujetMissionRenseignementObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetMissionRenseignementObjectif(TypeAssociation newAssocieCommeSujetMissionRenseignementObjectif) {
		if (newAssocieCommeSujetMissionRenseignementObjectif != associeCommeSujetMissionRenseignementObjectif) {
			NotificationChain msgs = null;
			if (associeCommeSujetMissionRenseignementObjectif != null)
				msgs = ((InternalEObject)associeCommeSujetMissionRenseignementObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT_OBJECTIF, null, msgs);
			if (newAssocieCommeSujetMissionRenseignementObjectif != null)
				msgs = ((InternalEObject)newAssocieCommeSujetMissionRenseignementObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT_OBJECTIF, null, msgs);
			msgs = basicSetAssocieCommeSujetMissionRenseignementObjectif(newAssocieCommeSujetMissionRenseignementObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT_OBJECTIF, newAssocieCommeSujetMissionRenseignementObjectif, newAssocieCommeSujetMissionRenseignementObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				return basicSetAssocieCommeObjetPlanTraitementObjectifs(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				return basicSetAssocieCommeSujetMissionRenseignementObjectif(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				return getAssocieCommeObjetPlanTraitementObjectifs();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				return getAssocieCommeSujetMissionRenseignementObjectif();
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleUARCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				setAssocieCommeObjetPlanTraitementObjectifs((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				setAssocieCommeSujetMissionRenseignementObjectif((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				setAssocieCommeObjetPlanTraitementObjectifs((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				setAssocieCommeSujetMissionRenseignementObjectif((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_OBJET_PLAN_TRAITEMENT_OBJECTIFS:
				return associeCommeObjetPlanTraitementObjectifs != null;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ__ASSOCIE_COMME_SUJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				return associeCommeSujetMissionRenseignementObjectif != null;
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

} //TypeAssociationMissionRensObjPlanTraitementObjImpl
