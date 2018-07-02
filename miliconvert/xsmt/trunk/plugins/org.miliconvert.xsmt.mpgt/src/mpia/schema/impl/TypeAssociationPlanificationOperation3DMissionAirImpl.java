/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationPlanificationOperation3DMissionAir;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Planification Operation3 DMission Air</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanificationOperation3DMissionAirImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanificationOperation3DMissionAirImpl#getAssocieCommeObjetMissionAir <em>Associe Comme Objet Mission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanificationOperation3DMissionAirImpl#getAssocieCommeSujetPlanificationOperation3D <em>Associe Comme Sujet Planification Operation3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationPlanificationOperation3DMissionAirImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationPlanificationOperation3DMissionAir {
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
	 * The cached value of the '{@link #getAssocieCommeObjetMissionAir() <em>Associe Comme Objet Mission Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetMissionAir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetMissionAir;

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
	protected TypeAssociationPlanificationOperation3DMissionAirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationPlanificationOperation3DMissionAir();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeObjetMissionAir() {
		return associeCommeObjetMissionAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetMissionAir(TypeAssociation newAssocieCommeObjetMissionAir, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetMissionAir = associeCommeObjetMissionAir;
		associeCommeObjetMissionAir = newAssocieCommeObjetMissionAir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_OBJET_MISSION_AIR, oldAssocieCommeObjetMissionAir, newAssocieCommeObjetMissionAir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetMissionAir(TypeAssociation newAssocieCommeObjetMissionAir) {
		if (newAssocieCommeObjetMissionAir != associeCommeObjetMissionAir) {
			NotificationChain msgs = null;
			if (associeCommeObjetMissionAir != null)
				msgs = ((InternalEObject)associeCommeObjetMissionAir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_OBJET_MISSION_AIR, null, msgs);
			if (newAssocieCommeObjetMissionAir != null)
				msgs = ((InternalEObject)newAssocieCommeObjetMissionAir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_OBJET_MISSION_AIR, null, msgs);
			msgs = basicSetAssocieCommeObjetMissionAir(newAssocieCommeObjetMissionAir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_OBJET_MISSION_AIR, newAssocieCommeObjetMissionAir, newAssocieCommeObjetMissionAir));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D, oldAssocieCommeSujetPlanificationOperation3D, newAssocieCommeSujetPlanificationOperation3D);
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
				msgs = ((InternalEObject)associeCommeSujetPlanificationOperation3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D, null, msgs);
			if (newAssocieCommeSujetPlanificationOperation3D != null)
				msgs = ((InternalEObject)newAssocieCommeSujetPlanificationOperation3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D, null, msgs);
			msgs = basicSetAssocieCommeSujetPlanificationOperation3D(newAssocieCommeSujetPlanificationOperation3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D, newAssocieCommeSujetPlanificationOperation3D, newAssocieCommeSujetPlanificationOperation3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_OBJET_MISSION_AIR:
				return basicSetAssocieCommeObjetMissionAir(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
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
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_OBJET_MISSION_AIR:
				return getAssocieCommeObjetMissionAir();
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
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
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_OBJET_MISSION_AIR:
				setAssocieCommeObjetMissionAir((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
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
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_OBJET_MISSION_AIR:
				setAssocieCommeObjetMissionAir((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
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
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_OBJET_MISSION_AIR:
				return associeCommeObjetMissionAir != null;
			case SchemaPackage.TYPE_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR__ASSOCIE_COMME_SUJET_PLANIFICATION_OPERATION3_D:
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

} //TypeAssociationPlanificationOperation3DMissionAirImpl
