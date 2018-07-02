/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationPlanificationOperation3DMissionASA;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Planification Operation3 DMission ASA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanificationOperation3DMissionASAImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanificationOperation3DMissionASAImpl#getAssocieCommeObjetMissionASA <em>Associe Comme Objet Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanificationOperation3DMissionASAImpl#getAssocieCommeSujetPlanificationOperation3D <em>Associe Comme Sujet Planification Operation3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationPlanificationOperation3DMissionASAImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationPlanificationOperation3DMissionASA {
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
	 * The cached value of the '{@link #getAssocieCommeObjetMissionASA() <em>Associe Comme Objet Mission ASA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetMissionASA()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetMissionASA;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetPlanificationOperation3D() <em>Associe Comme Sujet Planification Operation3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetPlanificationOperation3D()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetPlanificationOperation3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationPlanificationOperation3DMissionASAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationPlanificationOperation3DMissionASA();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeObjetMissionASA() {
		return associeCommeObjetMissionASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetMissionASA(TypeAssociation newAssocieCommeObjetMissionASA, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetMissionASA = associeCommeObjetMissionASA;
		associeCommeObjetMissionASA = newAssocieCommeObjetMissionASA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_OBJET_MISSION_ASA, oldAssocieCommeObjetMissionASA, newAssocieCommeObjetMissionASA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetMissionASA(TypeAssociation newAssocieCommeObjetMissionASA) {
		if (newAssocieCommeObjetMissionASA != associeCommeObjetMissionASA) {
			NotificationChain msgs = null;
			if (associeCommeObjetMissionASA != null)
				msgs = ((InternalEObject)associeCommeObjetMissionASA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_OBJET_MISSION_ASA, null, msgs);
			if (newAssocieCommeObjetMissionASA != null)
				msgs = ((InternalEObject)newAssocieCommeObjetMissionASA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_OBJET_MISSION_ASA, null, msgs);
			msgs = basicSetAssocieCommeObjetMissionASA(newAssocieCommeObjetMissionASA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_OBJET_MISSION_ASA, newAssocieCommeObjetMissionASA, newAssocieCommeObjetMissionASA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetPlanificationOperation3D() {
		return associeCommeSujetPlanificationOperation3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetPlanificationOperation3D(TypeAssociation newAssocieCommeSujetPlanificationOperation3D, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetPlanificationOperation3D = associeCommeSujetPlanificationOperation3D;
		associeCommeSujetPlanificationOperation3D = newAssocieCommeSujetPlanificationOperation3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D, oldAssocieCommeSujetPlanificationOperation3D, newAssocieCommeSujetPlanificationOperation3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetPlanificationOperation3D(TypeAssociation newAssocieCommeSujetPlanificationOperation3D) {
		if (newAssocieCommeSujetPlanificationOperation3D != associeCommeSujetPlanificationOperation3D) {
			NotificationChain msgs = null;
			if (associeCommeSujetPlanificationOperation3D != null)
				msgs = ((InternalEObject)associeCommeSujetPlanificationOperation3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D, null, msgs);
			if (newAssocieCommeSujetPlanificationOperation3D != null)
				msgs = ((InternalEObject)newAssocieCommeSujetPlanificationOperation3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D, null, msgs);
			msgs = basicSetAssocieCommeSujetPlanificationOperation3D(newAssocieCommeSujetPlanificationOperation3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D, newAssocieCommeSujetPlanificationOperation3D, newAssocieCommeSujetPlanificationOperation3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_OBJET_MISSION_ASA:
				return basicSetAssocieCommeObjetMissionASA(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
				return basicSetAssocieCommeSujetPlanificationOperation3D(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_OBJET_MISSION_ASA:
				return getAssocieCommeObjetMissionASA();
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
				return getAssocieCommeSujetPlanificationOperation3D();
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
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_OBJET_MISSION_ASA:
				setAssocieCommeObjetMissionASA((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
				setAssocieCommeSujetPlanificationOperation3D((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_OBJET_MISSION_ASA:
				setAssocieCommeObjetMissionASA((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
				setAssocieCommeSujetPlanificationOperation3D((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_OBJET_MISSION_ASA:
				return associeCommeObjetMissionASA != null;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
				return associeCommeSujetPlanificationOperation3D != null;
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

} //TypeAssociationPlanificationOperation3DMissionASAImpl
