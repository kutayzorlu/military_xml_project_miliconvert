/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationMissionAerienneMissionAerienne;
import mpia.schema.TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Mission Aerienne Mission Aerienne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionAerienneMissionAerienneImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionAerienneMissionAerienneImpl#getAssocieCommeObjetMissionAerienne <em>Associe Comme Objet Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionAerienneMissionAerienneImpl#getAssocieCommeSujetMissionAerienne <em>Associe Comme Sujet Mission Aerienne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMissionAerienneMissionAerienneImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationMissionAerienneMissionAerienne {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie.AIRMOV;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetMissionAerienne() <em>Associe Comme Objet Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetMissionAerienne;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetMissionAerienne() <em>Associe Comme Sujet Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetMissionAerienne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationMissionAerienneMissionAerienneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMissionAerienneMissionAerienne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie newCategorie) {
		TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeObjetMissionAerienne() {
		return associeCommeObjetMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetMissionAerienne(TypeAssociation newAssocieCommeObjetMissionAerienne, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetMissionAerienne = associeCommeObjetMissionAerienne;
		associeCommeObjetMissionAerienne = newAssocieCommeObjetMissionAerienne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE, oldAssocieCommeObjetMissionAerienne, newAssocieCommeObjetMissionAerienne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetMissionAerienne(TypeAssociation newAssocieCommeObjetMissionAerienne) {
		if (newAssocieCommeObjetMissionAerienne != associeCommeObjetMissionAerienne) {
			NotificationChain msgs = null;
			if (associeCommeObjetMissionAerienne != null)
				msgs = ((InternalEObject)associeCommeObjetMissionAerienne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE, null, msgs);
			if (newAssocieCommeObjetMissionAerienne != null)
				msgs = ((InternalEObject)newAssocieCommeObjetMissionAerienne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE, null, msgs);
			msgs = basicSetAssocieCommeObjetMissionAerienne(newAssocieCommeObjetMissionAerienne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE, newAssocieCommeObjetMissionAerienne, newAssocieCommeObjetMissionAerienne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetMissionAerienne() {
		return associeCommeSujetMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetMissionAerienne(TypeAssociation newAssocieCommeSujetMissionAerienne, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetMissionAerienne = associeCommeSujetMissionAerienne;
		associeCommeSujetMissionAerienne = newAssocieCommeSujetMissionAerienne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_SUJET_MISSION_AERIENNE, oldAssocieCommeSujetMissionAerienne, newAssocieCommeSujetMissionAerienne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetMissionAerienne(TypeAssociation newAssocieCommeSujetMissionAerienne) {
		if (newAssocieCommeSujetMissionAerienne != associeCommeSujetMissionAerienne) {
			NotificationChain msgs = null;
			if (associeCommeSujetMissionAerienne != null)
				msgs = ((InternalEObject)associeCommeSujetMissionAerienne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_SUJET_MISSION_AERIENNE, null, msgs);
			if (newAssocieCommeSujetMissionAerienne != null)
				msgs = ((InternalEObject)newAssocieCommeSujetMissionAerienne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_SUJET_MISSION_AERIENNE, null, msgs);
			msgs = basicSetAssocieCommeSujetMissionAerienne(newAssocieCommeSujetMissionAerienne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_SUJET_MISSION_AERIENNE, newAssocieCommeSujetMissionAerienne, newAssocieCommeSujetMissionAerienne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				return basicSetAssocieCommeObjetMissionAerienne(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_SUJET_MISSION_AERIENNE:
				return basicSetAssocieCommeSujetMissionAerienne(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				return getAssocieCommeObjetMissionAerienne();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_SUJET_MISSION_AERIENNE:
				return getAssocieCommeSujetMissionAerienne();
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationMissionAerienneMissionAerienneCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				setAssocieCommeObjetMissionAerienne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_SUJET_MISSION_AERIENNE:
				setAssocieCommeSujetMissionAerienne((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				setAssocieCommeObjetMissionAerienne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_SUJET_MISSION_AERIENNE:
				setAssocieCommeSujetMissionAerienne((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				return associeCommeObjetMissionAerienne != null;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE__ASSOCIE_COMME_SUJET_MISSION_AERIENNE:
				return associeCommeSujetMissionAerienne != null;
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

} //TypeAssociationMissionAerienneMissionAerienneImpl
