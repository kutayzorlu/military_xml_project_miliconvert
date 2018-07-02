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
import mpia.schema.TypeEvenementRENS;

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
 * An implementation of the model object '<em><b>Type Evenement RENS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvenementRENSImpl#getCategorieEvenement <em>Categorie Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementRENSImpl#getEstSujetAssociationEvenementRENSEvenementRENS <em>Est Sujet Association Evenement RENS Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementRENSImpl#getEstObjetAssociationEvenementRENSEvenementRENS <em>Est Objet Association Evenement RENS Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementRENSImpl#getEstSujetAssociationEvenementRENSAutreEvenement <em>Est Sujet Association Evenement RENS Autre Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEvenementRENSImpl extends TypeEvenementImpl implements TypeEvenementRENS {
	/**
	 * The default value of the '{@link #getCategorieEvenement() <em>Categorie Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieEvenement()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIE_EVENEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategorieEvenement() <em>Categorie Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieEvenement()
	 * @generated
	 * @ordered
	 */
	protected String categorieEvenement = CATEGORIE_EVENEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEvenementRENSEvenementRENS() <em>Est Sujet Association Evenement RENS Evenement RENS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEvenementRENSEvenementRENS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEvenementRENSEvenementRENS;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEvenementRENSEvenementRENS() <em>Est Objet Association Evenement RENS Evenement RENS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEvenementRENSEvenementRENS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEvenementRENSEvenementRENS;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEvenementRENSAutreEvenement() <em>Est Sujet Association Evenement RENS Autre Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEvenementRENSAutreEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEvenementRENSAutreEvenement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvenementRENSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvenementRENS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategorieEvenement() {
		return categorieEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieEvenement(String newCategorieEvenement) {
		String oldCategorieEvenement = categorieEvenement;
		categorieEvenement = newCategorieEvenement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_RENS__CATEGORIE_EVENEMENT, oldCategorieEvenement, categorieEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEvenementRENSEvenementRENS() {
		if (estSujetAssociationEvenementRENSEvenementRENS == null) {
			estSujetAssociationEvenementRENSEvenementRENS = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS);
		}
		return estSujetAssociationEvenementRENSEvenementRENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEvenementRENSEvenementRENS() {
		if (estObjetAssociationEvenementRENSEvenementRENS == null) {
			estObjetAssociationEvenementRENSEvenementRENS = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_RENS__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS);
		}
		return estObjetAssociationEvenementRENSEvenementRENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEvenementRENSAutreEvenement() {
		if (estSujetAssociationEvenementRENSAutreEvenement == null) {
			estSujetAssociationEvenementRENSAutreEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT);
		}
		return estSujetAssociationEvenementRENSAutreEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				return ((InternalEList<?>)getEstSujetAssociationEvenementRENSEvenementRENS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				return ((InternalEList<?>)getEstObjetAssociationEvenementRENSEvenementRENS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationEvenementRENSAutreEvenement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_EVENEMENT_RENS__CATEGORIE_EVENEMENT:
				return getCategorieEvenement();
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				return getEstSujetAssociationEvenementRENSEvenementRENS();
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				return getEstObjetAssociationEvenementRENSEvenementRENS();
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				return getEstSujetAssociationEvenementRENSAutreEvenement();
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
			case SchemaPackage.TYPE_EVENEMENT_RENS__CATEGORIE_EVENEMENT:
				setCategorieEvenement((String)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				getEstSujetAssociationEvenementRENSEvenementRENS().clear();
				getEstSujetAssociationEvenementRENSEvenementRENS().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				getEstObjetAssociationEvenementRENSEvenementRENS().clear();
				getEstObjetAssociationEvenementRENSEvenementRENS().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				getEstSujetAssociationEvenementRENSAutreEvenement().clear();
				getEstSujetAssociationEvenementRENSAutreEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_EVENEMENT_RENS__CATEGORIE_EVENEMENT:
				setCategorieEvenement(CATEGORIE_EVENEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				getEstSujetAssociationEvenementRENSEvenementRENS().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				getEstObjetAssociationEvenementRENSEvenementRENS().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				getEstSujetAssociationEvenementRENSAutreEvenement().clear();
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
			case SchemaPackage.TYPE_EVENEMENT_RENS__CATEGORIE_EVENEMENT:
				return CATEGORIE_EVENEMENT_EDEFAULT == null ? categorieEvenement != null : !CATEGORIE_EVENEMENT_EDEFAULT.equals(categorieEvenement);
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				return estSujetAssociationEvenementRENSEvenementRENS != null && !estSujetAssociationEvenementRENSEvenementRENS.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_OBJET_ASSOCIATION_EVENEMENT_RENS_EVENEMENT_RENS:
				return estObjetAssociationEvenementRENSEvenementRENS != null && !estObjetAssociationEvenementRENSEvenementRENS.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_RENS__EST_SUJET_ASSOCIATION_EVENEMENT_RENS_AUTRE_EVENEMENT:
				return estSujetAssociationEvenementRENSAutreEvenement != null && !estSujetAssociationEvenementRENSAutreEvenement.isEmpty();
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
		result.append(" (categorieEvenement: ");
		result.append(categorieEvenement);
		result.append(')');
		return result.toString();
	}

} //TypeEvenementRENSImpl
