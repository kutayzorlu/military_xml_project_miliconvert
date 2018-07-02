/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutreEvenement;
import mpia.schema.TypeDictionaryDicoAutreEvenementCategorie;
import mpia.schema.TypeDictionaryDicoAutreEvenementSousCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Evenement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreEvenementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreEvenementImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreEvenementImpl#getEstObjetAssociationAutreEvenementAutreEvenement <em>Est Objet Association Autre Evenement Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreEvenementImpl#getEstSujetAssociationAutreEvenementAutreEvenement <em>Est Sujet Association Autre Evenement Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreEvenementImpl#getEstObjetAssociationActionAutreEvenement <em>Est Objet Association Action Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreEvenementImpl#getEstSujetAssociationAutreEvenementAction <em>Est Sujet Association Autre Evenement Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreEvenementImpl#getEstSujetAssociationAutreEvenementEvenementNRBC <em>Est Sujet Association Autre Evenement Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreEvenementImpl#getEstObjetAssociationEvenementNRBCAutreEvenement <em>Est Objet Association Evenement NRBC Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreEvenementImpl#getEstObjetAssociationEvenementRENSAutreEvenement <em>Est Objet Association Evenement RENS Autre Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreEvenementImpl extends TypeEvenementImpl implements TypeAutreEvenement {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreEvenementCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAutreEvenementCategorie.AIRDEF;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreEvenementCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreEvenementSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoAutreEvenementSousCategorie.CRIMIN;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreEvenementSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationAutreEvenementAutreEvenement() <em>Est Objet Association Autre Evenement Autre Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationAutreEvenementAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationAutreEvenementAutreEvenement;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationAutreEvenementAutreEvenement() <em>Est Sujet Association Autre Evenement Autre Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationAutreEvenementAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationAutreEvenementAutreEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationActionAutreEvenement() <em>Est Objet Association Action Autre Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationActionAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationActionAutreEvenement;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationAutreEvenementAction() <em>Est Sujet Association Autre Evenement Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationAutreEvenementAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationAutreEvenementAction;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationAutreEvenementEvenementNRBC() <em>Est Sujet Association Autre Evenement Evenement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationAutreEvenementEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationAutreEvenementEvenementNRBC;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEvenementNRBCAutreEvenement() <em>Est Objet Association Evenement NRBC Autre Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEvenementNRBCAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEvenementNRBCAutreEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEvenementRENSAutreEvenement() <em>Est Objet Association Evenement RENS Autre Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEvenementRENSAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEvenementRENSAutreEvenement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreEvenementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreEvenement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutreEvenementCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAutreEvenementCategorie newCategorie) {
		TypeDictionaryDicoAutreEvenementCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_EVENEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAutreEvenementCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_EVENEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoAutreEvenementSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoAutreEvenementSousCategorie newSousCategorie) {
		TypeDictionaryDicoAutreEvenementSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_EVENEMENT__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoAutreEvenementSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_EVENEMENT__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousCategorie() {
		return sousCategorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationAutreEvenementAutreEvenement() {
		if (estObjetAssociationAutreEvenementAutreEvenement == null) {
			estObjetAssociationAutreEvenementAutreEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT);
		}
		return estObjetAssociationAutreEvenementAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationAutreEvenementAutreEvenement() {
		if (estSujetAssociationAutreEvenementAutreEvenement == null) {
			estSujetAssociationAutreEvenementAutreEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT);
		}
		return estSujetAssociationAutreEvenementAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationActionAutreEvenement() {
		if (estObjetAssociationActionAutreEvenement == null) {
			estObjetAssociationActionAutreEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT);
		}
		return estObjetAssociationActionAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationAutreEvenementAction() {
		if (estSujetAssociationAutreEvenementAction == null) {
			estSujetAssociationAutreEvenementAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION);
		}
		return estSujetAssociationAutreEvenementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationAutreEvenementEvenementNRBC() {
		if (estSujetAssociationAutreEvenementEvenementNRBC == null) {
			estSujetAssociationAutreEvenementEvenementNRBC = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC);
		}
		return estSujetAssociationAutreEvenementEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEvenementNRBCAutreEvenement() {
		if (estObjetAssociationEvenementNRBCAutreEvenement == null) {
			estObjetAssociationEvenementNRBCAutreEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT);
		}
		return estObjetAssociationEvenementNRBCAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEvenementRENSAutreEvenement() {
		if (estObjetAssociationEvenementRENSAutreEvenement == null) {
			estObjetAssociationEvenementRENSAutreEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT);
		}
		return estObjetAssociationEvenementRENSAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationAutreEvenementAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationAutreEvenementAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationActionAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				return ((InternalEList<?>)getEstSujetAssociationAutreEvenementAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				return ((InternalEList<?>)getEstSujetAssociationAutreEvenementEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationEvenementNRBCAutreEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getEstObjetAssociationEvenementRENSAutreEvenement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				return getEstObjetAssociationAutreEvenementAutreEvenement();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				return getEstSujetAssociationAutreEvenementAutreEvenement();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				return getEstObjetAssociationActionAutreEvenement();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				return getEstSujetAssociationAutreEvenementAction();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				return getEstSujetAssociationAutreEvenementEvenementNRBC();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				return getEstObjetAssociationEvenementNRBCAutreEvenement();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				return getEstObjetAssociationEvenementRENSAutreEvenement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAutreEvenementCategorie)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoAutreEvenementSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				getEstObjetAssociationAutreEvenementAutreEvenement().clear();
				getEstObjetAssociationAutreEvenementAutreEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				getEstSujetAssociationAutreEvenementAutreEvenement().clear();
				getEstSujetAssociationAutreEvenementAutreEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				getEstObjetAssociationActionAutreEvenement().clear();
				getEstObjetAssociationActionAutreEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				getEstSujetAssociationAutreEvenementAction().clear();
				getEstSujetAssociationAutreEvenementAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				getEstSujetAssociationAutreEvenementEvenementNRBC().clear();
				getEstSujetAssociationAutreEvenementEvenementNRBC().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				getEstObjetAssociationEvenementNRBCAutreEvenement().clear();
				getEstObjetAssociationEvenementNRBCAutreEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				getEstObjetAssociationEvenementRENSAutreEvenement().clear();
				getEstObjetAssociationEvenementRENSAutreEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				getEstObjetAssociationAutreEvenementAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				getEstSujetAssociationAutreEvenementAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				getEstObjetAssociationActionAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				getEstSujetAssociationAutreEvenementAction().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				getEstSujetAssociationAutreEvenementEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				getEstObjetAssociationEvenementNRBCAutreEvenement().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				getEstObjetAssociationEvenementRENSAutreEvenement().clear();
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
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				return estObjetAssociationAutreEvenementAutreEvenement != null && !estObjetAssociationAutreEvenementAutreEvenement.isEmpty();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_AUTRE_EVENEMENT:
				return estSujetAssociationAutreEvenementAutreEvenement != null && !estSujetAssociationAutreEvenementAutreEvenement.isEmpty();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_ACTION_AUTRE_EVENEMENT:
				return estObjetAssociationActionAutreEvenement != null && !estObjetAssociationActionAutreEvenement.isEmpty();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_ACTION:
				return estSujetAssociationAutreEvenementAction != null && !estSujetAssociationAutreEvenementAction.isEmpty();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_SUJET_ASSOCIATION_AUTRE_EVENEMENT_EVENEMENT_NRBC:
				return estSujetAssociationAutreEvenementEvenementNRBC != null && !estSujetAssociationAutreEvenementEvenementNRBC.isEmpty();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_NRBC_AUTRE_EVENEMENT:
				return estObjetAssociationEvenementNRBCAutreEvenement != null && !estObjetAssociationEvenementNRBCAutreEvenement.isEmpty();
			case SchemaPackage.TYPE_AUTRE_EVENEMENT__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				return estObjetAssociationEvenementRENSAutreEvenement != null && !estObjetAssociationEvenementRENSAutreEvenement.isEmpty();
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
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAutreEvenementImpl
