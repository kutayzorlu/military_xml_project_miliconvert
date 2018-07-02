/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationEvenementNRBCEvenementNRBC;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Evenement NRBC Evenement NRBC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationEvenementNRBCEvenementNRBCImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEvenementNRBCEvenementNRBCImpl#getAssocieCommeSujetEvenementNRBC <em>Associe Comme Sujet Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEvenementNRBCEvenementNRBCImpl#getAssocieCommeObjetEvenementNRBC <em>Associe Comme Objet Evenement NRBC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEvenementNRBCEvenementNRBCImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationEvenementNRBCEvenementNRBC {
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
	 * The cached value of the '{@link #getAssocieCommeSujetEvenementNRBC() <em>Associe Comme Sujet Evenement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetEvenementNRBC;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetEvenementNRBC() <em>Associe Comme Objet Evenement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetEvenementNRBC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEvenementNRBCEvenementNRBCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationEvenementNRBCEvenementNRBC();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeSujetEvenementNRBC() {
		return associeCommeSujetEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetEvenementNRBC(TypeAssociation newAssocieCommeSujetEvenementNRBC, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetEvenementNRBC = associeCommeSujetEvenementNRBC;
		associeCommeSujetEvenementNRBC = newAssocieCommeSujetEvenementNRBC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_EVENEMENT_NRBC, oldAssocieCommeSujetEvenementNRBC, newAssocieCommeSujetEvenementNRBC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetEvenementNRBC(TypeAssociation newAssocieCommeSujetEvenementNRBC) {
		if (newAssocieCommeSujetEvenementNRBC != associeCommeSujetEvenementNRBC) {
			NotificationChain msgs = null;
			if (associeCommeSujetEvenementNRBC != null)
				msgs = ((InternalEObject)associeCommeSujetEvenementNRBC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_EVENEMENT_NRBC, null, msgs);
			if (newAssocieCommeSujetEvenementNRBC != null)
				msgs = ((InternalEObject)newAssocieCommeSujetEvenementNRBC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_EVENEMENT_NRBC, null, msgs);
			msgs = basicSetAssocieCommeSujetEvenementNRBC(newAssocieCommeSujetEvenementNRBC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_EVENEMENT_NRBC, newAssocieCommeSujetEvenementNRBC, newAssocieCommeSujetEvenementNRBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetEvenementNRBC() {
		return associeCommeObjetEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetEvenementNRBC(TypeAssociation newAssocieCommeObjetEvenementNRBC, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetEvenementNRBC = associeCommeObjetEvenementNRBC;
		associeCommeObjetEvenementNRBC = newAssocieCommeObjetEvenementNRBC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC, oldAssocieCommeObjetEvenementNRBC, newAssocieCommeObjetEvenementNRBC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetEvenementNRBC(TypeAssociation newAssocieCommeObjetEvenementNRBC) {
		if (newAssocieCommeObjetEvenementNRBC != associeCommeObjetEvenementNRBC) {
			NotificationChain msgs = null;
			if (associeCommeObjetEvenementNRBC != null)
				msgs = ((InternalEObject)associeCommeObjetEvenementNRBC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC, null, msgs);
			if (newAssocieCommeObjetEvenementNRBC != null)
				msgs = ((InternalEObject)newAssocieCommeObjetEvenementNRBC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC, null, msgs);
			msgs = basicSetAssocieCommeObjetEvenementNRBC(newAssocieCommeObjetEvenementNRBC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC, newAssocieCommeObjetEvenementNRBC, newAssocieCommeObjetEvenementNRBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_EVENEMENT_NRBC:
				return basicSetAssocieCommeSujetEvenementNRBC(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				return basicSetAssocieCommeObjetEvenementNRBC(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_EVENEMENT_NRBC:
				return getAssocieCommeSujetEvenementNRBC();
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				return getAssocieCommeObjetEvenementNRBC();
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_EVENEMENT_NRBC:
				setAssocieCommeSujetEvenementNRBC((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				setAssocieCommeObjetEvenementNRBC((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_EVENEMENT_NRBC:
				setAssocieCommeSujetEvenementNRBC((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				setAssocieCommeObjetEvenementNRBC((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_EVENEMENT_NRBC:
				return associeCommeSujetEvenementNRBC != null;
			case SchemaPackage.TYPE_ASSOCIATION_EVENEMENT_NRBC_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				return associeCommeObjetEvenementNRBC != null;
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

} //TypeAssociationEvenementNRBCEvenementNRBCImpl
