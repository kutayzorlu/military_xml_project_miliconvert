/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationMissionGenieMissionGenie;
import mpia.schema.TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Mission Genie Mission Genie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionGenieMissionGenieImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionGenieMissionGenieImpl#getAssocieCommeSujetMissionGenie <em>Associe Comme Sujet Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMissionGenieMissionGenieImpl#getAssocieCommeObjetMissionGenie <em>Associe Comme Objet Mission Genie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMissionGenieMissionGenieImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationMissionGenieMissionGenie {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie.ADDITTO;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetMissionGenie() <em>Associe Comme Sujet Mission Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetMissionGenie()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetMissionGenie;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetMissionGenie() <em>Associe Comme Objet Mission Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetMissionGenie()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetMissionGenie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationMissionGenieMissionGenieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMissionGenieMissionGenie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie newCategorie) {
		TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeSujetMissionGenie() {
		return associeCommeSujetMissionGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetMissionGenie(TypeAssociation newAssocieCommeSujetMissionGenie, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetMissionGenie = associeCommeSujetMissionGenie;
		associeCommeSujetMissionGenie = newAssocieCommeSujetMissionGenie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_SUJET_MISSION_GENIE, oldAssocieCommeSujetMissionGenie, newAssocieCommeSujetMissionGenie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetMissionGenie(TypeAssociation newAssocieCommeSujetMissionGenie) {
		if (newAssocieCommeSujetMissionGenie != associeCommeSujetMissionGenie) {
			NotificationChain msgs = null;
			if (associeCommeSujetMissionGenie != null)
				msgs = ((InternalEObject)associeCommeSujetMissionGenie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_SUJET_MISSION_GENIE, null, msgs);
			if (newAssocieCommeSujetMissionGenie != null)
				msgs = ((InternalEObject)newAssocieCommeSujetMissionGenie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_SUJET_MISSION_GENIE, null, msgs);
			msgs = basicSetAssocieCommeSujetMissionGenie(newAssocieCommeSujetMissionGenie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_SUJET_MISSION_GENIE, newAssocieCommeSujetMissionGenie, newAssocieCommeSujetMissionGenie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetMissionGenie() {
		return associeCommeObjetMissionGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetMissionGenie(TypeAssociation newAssocieCommeObjetMissionGenie, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetMissionGenie = associeCommeObjetMissionGenie;
		associeCommeObjetMissionGenie = newAssocieCommeObjetMissionGenie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_OBJET_MISSION_GENIE, oldAssocieCommeObjetMissionGenie, newAssocieCommeObjetMissionGenie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetMissionGenie(TypeAssociation newAssocieCommeObjetMissionGenie) {
		if (newAssocieCommeObjetMissionGenie != associeCommeObjetMissionGenie) {
			NotificationChain msgs = null;
			if (associeCommeObjetMissionGenie != null)
				msgs = ((InternalEObject)associeCommeObjetMissionGenie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_OBJET_MISSION_GENIE, null, msgs);
			if (newAssocieCommeObjetMissionGenie != null)
				msgs = ((InternalEObject)newAssocieCommeObjetMissionGenie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_OBJET_MISSION_GENIE, null, msgs);
			msgs = basicSetAssocieCommeObjetMissionGenie(newAssocieCommeObjetMissionGenie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_OBJET_MISSION_GENIE, newAssocieCommeObjetMissionGenie, newAssocieCommeObjetMissionGenie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_SUJET_MISSION_GENIE:
				return basicSetAssocieCommeSujetMissionGenie(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_OBJET_MISSION_GENIE:
				return basicSetAssocieCommeObjetMissionGenie(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_SUJET_MISSION_GENIE:
				return getAssocieCommeSujetMissionGenie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_OBJET_MISSION_GENIE:
				return getAssocieCommeObjetMissionGenie();
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_SUJET_MISSION_GENIE:
				setAssocieCommeSujetMissionGenie((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_OBJET_MISSION_GENIE:
				setAssocieCommeObjetMissionGenie((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_SUJET_MISSION_GENIE:
				setAssocieCommeSujetMissionGenie((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_OBJET_MISSION_GENIE:
				setAssocieCommeObjetMissionGenie((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_SUJET_MISSION_GENIE:
				return associeCommeSujetMissionGenie != null;
			case SchemaPackage.TYPE_ASSOCIATION_MISSION_GENIE_MISSION_GENIE__ASSOCIE_COMME_OBJET_MISSION_GENIE:
				return associeCommeObjetMissionGenie != null;
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

} //TypeAssociationMissionGenieMissionGenieImpl
