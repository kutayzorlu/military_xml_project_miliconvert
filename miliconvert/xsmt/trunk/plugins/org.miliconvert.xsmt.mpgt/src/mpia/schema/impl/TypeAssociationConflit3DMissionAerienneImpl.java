/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationConflit3DMissionAerienne;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Conflit3 DMission Aerienne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationConflit3DMissionAerienneImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConflit3DMissionAerienneImpl#getAssocieCommeObjetMissionAerienne <em>Associe Comme Objet Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConflit3DMissionAerienneImpl#getAssocieCommeSujetConflit3D <em>Associe Comme Sujet Conflit3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationConflit3DMissionAerienneImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationConflit3DMissionAerienne {
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
	 * The cached value of the '{@link #getAssocieCommeObjetMissionAerienne() <em>Associe Comme Objet Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetMissionAerienne;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetConflit3D() <em>Associe Comme Sujet Conflit3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetConflit3D()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetConflit3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationConflit3DMissionAerienneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationConflit3DMissionAerienne();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE, oldAssocieCommeObjetMissionAerienne, newAssocieCommeObjetMissionAerienne);
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
				msgs = ((InternalEObject)associeCommeObjetMissionAerienne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE, null, msgs);
			if (newAssocieCommeObjetMissionAerienne != null)
				msgs = ((InternalEObject)newAssocieCommeObjetMissionAerienne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE, null, msgs);
			msgs = basicSetAssocieCommeObjetMissionAerienne(newAssocieCommeObjetMissionAerienne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE, newAssocieCommeObjetMissionAerienne, newAssocieCommeObjetMissionAerienne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetConflit3D() {
		return associeCommeSujetConflit3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetConflit3D(TypeAssociation newAssocieCommeSujetConflit3D, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetConflit3D = associeCommeSujetConflit3D;
		associeCommeSujetConflit3D = newAssocieCommeSujetConflit3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_SUJET_CONFLIT3_D, oldAssocieCommeSujetConflit3D, newAssocieCommeSujetConflit3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetConflit3D(TypeAssociation newAssocieCommeSujetConflit3D) {
		if (newAssocieCommeSujetConflit3D != associeCommeSujetConflit3D) {
			NotificationChain msgs = null;
			if (associeCommeSujetConflit3D != null)
				msgs = ((InternalEObject)associeCommeSujetConflit3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_SUJET_CONFLIT3_D, null, msgs);
			if (newAssocieCommeSujetConflit3D != null)
				msgs = ((InternalEObject)newAssocieCommeSujetConflit3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_SUJET_CONFLIT3_D, null, msgs);
			msgs = basicSetAssocieCommeSujetConflit3D(newAssocieCommeSujetConflit3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_SUJET_CONFLIT3_D, newAssocieCommeSujetConflit3D, newAssocieCommeSujetConflit3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				return basicSetAssocieCommeObjetMissionAerienne(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_SUJET_CONFLIT3_D:
				return basicSetAssocieCommeSujetConflit3D(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				return getAssocieCommeObjetMissionAerienne();
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_SUJET_CONFLIT3_D:
				return getAssocieCommeSujetConflit3D();
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
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleUARCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				setAssocieCommeObjetMissionAerienne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_SUJET_CONFLIT3_D:
				setAssocieCommeSujetConflit3D((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				setAssocieCommeObjetMissionAerienne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_SUJET_CONFLIT3_D:
				setAssocieCommeSujetConflit3D((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_OBJET_MISSION_AERIENNE:
				return associeCommeObjetMissionAerienne != null;
			case SchemaPackage.TYPE_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE__ASSOCIE_COMME_SUJET_CONFLIT3_D:
				return associeCommeSujetConflit3D != null;
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

} //TypeAssociationConflit3DMissionAerienneImpl
