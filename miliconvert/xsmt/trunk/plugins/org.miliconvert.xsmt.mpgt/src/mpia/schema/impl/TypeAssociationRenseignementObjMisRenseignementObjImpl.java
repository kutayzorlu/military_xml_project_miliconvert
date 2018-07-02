/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleHSACategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Renseignement Obj Mis Renseignement Obj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationRenseignementObjMisRenseignementObjImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationRenseignementObjMisRenseignementObjImpl#getAssocieCommeObjetMissionRenseignementObjectif <em>Associe Comme Objet Mission Renseignement Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationRenseignementObjMisRenseignementObjImpl#getAssocieCommeSujetRenseignementObjectif <em>Associe Comme Sujet Renseignement Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationRenseignementObjMisRenseignementObjImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationRenseignementObjMisRenseignementObj {
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
	 * The cached value of the '{@link #getAssocieCommeObjetMissionRenseignementObjectif() <em>Associe Comme Objet Mission Renseignement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetMissionRenseignementObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetMissionRenseignementObjectif;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetRenseignementObjectif() <em>Associe Comme Sujet Renseignement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetRenseignementObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetRenseignementObjectif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationRenseignementObjMisRenseignementObjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationRenseignementObjMisRenseignementObj();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeObjetMissionRenseignementObjectif() {
		return associeCommeObjetMissionRenseignementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetMissionRenseignementObjectif(TypeAssociation newAssocieCommeObjetMissionRenseignementObjectif, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetMissionRenseignementObjectif = associeCommeObjetMissionRenseignementObjectif;
		associeCommeObjetMissionRenseignementObjectif = newAssocieCommeObjetMissionRenseignementObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_OBJET_MISSION_RENSEIGNEMENT_OBJECTIF, oldAssocieCommeObjetMissionRenseignementObjectif, newAssocieCommeObjetMissionRenseignementObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetMissionRenseignementObjectif(TypeAssociation newAssocieCommeObjetMissionRenseignementObjectif) {
		if (newAssocieCommeObjetMissionRenseignementObjectif != associeCommeObjetMissionRenseignementObjectif) {
			NotificationChain msgs = null;
			if (associeCommeObjetMissionRenseignementObjectif != null)
				msgs = ((InternalEObject)associeCommeObjetMissionRenseignementObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_OBJET_MISSION_RENSEIGNEMENT_OBJECTIF, null, msgs);
			if (newAssocieCommeObjetMissionRenseignementObjectif != null)
				msgs = ((InternalEObject)newAssocieCommeObjetMissionRenseignementObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_OBJET_MISSION_RENSEIGNEMENT_OBJECTIF, null, msgs);
			msgs = basicSetAssocieCommeObjetMissionRenseignementObjectif(newAssocieCommeObjetMissionRenseignementObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_OBJET_MISSION_RENSEIGNEMENT_OBJECTIF, newAssocieCommeObjetMissionRenseignementObjectif, newAssocieCommeObjetMissionRenseignementObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetRenseignementObjectif() {
		return associeCommeSujetRenseignementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetRenseignementObjectif(TypeAssociation newAssocieCommeSujetRenseignementObjectif, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetRenseignementObjectif = associeCommeSujetRenseignementObjectif;
		associeCommeSujetRenseignementObjectif = newAssocieCommeSujetRenseignementObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_SUJET_RENSEIGNEMENT_OBJECTIF, oldAssocieCommeSujetRenseignementObjectif, newAssocieCommeSujetRenseignementObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetRenseignementObjectif(TypeAssociation newAssocieCommeSujetRenseignementObjectif) {
		if (newAssocieCommeSujetRenseignementObjectif != associeCommeSujetRenseignementObjectif) {
			NotificationChain msgs = null;
			if (associeCommeSujetRenseignementObjectif != null)
				msgs = ((InternalEObject)associeCommeSujetRenseignementObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_SUJET_RENSEIGNEMENT_OBJECTIF, null, msgs);
			if (newAssocieCommeSujetRenseignementObjectif != null)
				msgs = ((InternalEObject)newAssocieCommeSujetRenseignementObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_SUJET_RENSEIGNEMENT_OBJECTIF, null, msgs);
			msgs = basicSetAssocieCommeSujetRenseignementObjectif(newAssocieCommeSujetRenseignementObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_SUJET_RENSEIGNEMENT_OBJECTIF, newAssocieCommeSujetRenseignementObjectif, newAssocieCommeSujetRenseignementObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_OBJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				return basicSetAssocieCommeObjetMissionRenseignementObjectif(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_SUJET_RENSEIGNEMENT_OBJECTIF:
				return basicSetAssocieCommeSujetRenseignementObjectif(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_OBJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				return getAssocieCommeObjetMissionRenseignementObjectif();
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_SUJET_RENSEIGNEMENT_OBJECTIF:
				return getAssocieCommeSujetRenseignementObjectif();
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
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleHSACategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_OBJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				setAssocieCommeObjetMissionRenseignementObjectif((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_SUJET_RENSEIGNEMENT_OBJECTIF:
				setAssocieCommeSujetRenseignementObjectif((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_OBJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				setAssocieCommeObjetMissionRenseignementObjectif((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_SUJET_RENSEIGNEMENT_OBJECTIF:
				setAssocieCommeSujetRenseignementObjectif((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_OBJET_MISSION_RENSEIGNEMENT_OBJECTIF:
				return associeCommeObjetMissionRenseignementObjectif != null;
			case SchemaPackage.TYPE_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ__ASSOCIE_COMME_SUJET_RENSEIGNEMENT_OBJECTIF:
				return associeCommeSujetRenseignementObjectif != null;
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

} //TypeAssociationRenseignementObjMisRenseignementObjImpl
