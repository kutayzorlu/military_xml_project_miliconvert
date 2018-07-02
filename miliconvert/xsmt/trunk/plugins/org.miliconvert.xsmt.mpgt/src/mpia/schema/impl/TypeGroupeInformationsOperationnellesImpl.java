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
import mpia.schema.TypeDictionaryDicoGroupeInformationsOperationnellesCategorie;
import mpia.schema.TypeGroupeInformationsOperationnelles;

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
 * An implementation of the model object '<em><b>Type Groupe Informations Operationnelles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeGroupeInformationsOperationnellesImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupeInformationsOperationnellesImpl#getInclusAssociationGroupeInfoOpsPlanOuOrdre <em>Inclus Association Groupe Info Ops Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupeInformationsOperationnellesImpl#getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle <em>Est Cite Par Association Groupe Info Ops Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeGroupeInformationsOperationnellesImpl extends TypeContexteImpl implements TypeGroupeInformationsOperationnelles {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoGroupeInformationsOperationnellesCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoGroupeInformationsOperationnellesCategorie.CORENU;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoGroupeInformationsOperationnellesCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getInclusAssociationGroupeInfoOpsPlanOuOrdre() <em>Inclus Association Groupe Info Ops Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusAssociationGroupeInfoOpsPlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> inclusAssociationGroupeInfoOpsPlanOuOrdre;

	/**
	 * The cached value of the '{@link #getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle() <em>Est Cite Par Association Groupe Info Ops Entite Organisationnelle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGroupeInformationsOperationnellesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeGroupeInformationsOperationnelles();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoGroupeInformationsOperationnellesCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoGroupeInformationsOperationnellesCategorie newCategorie) {
		TypeDictionaryDicoGroupeInformationsOperationnellesCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoGroupeInformationsOperationnellesCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public EList<TypeAssociation> getInclusAssociationGroupeInfoOpsPlanOuOrdre() {
		if (inclusAssociationGroupeInfoOpsPlanOuOrdre == null) {
			inclusAssociationGroupeInfoOpsPlanOuOrdre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__INCLUS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE);
		}
		return inclusAssociationGroupeInfoOpsPlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle() {
		if (estCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle == null) {
			estCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__EST_CITE_PAR_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE);
		}
		return estCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__INCLUS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getInclusAssociationGroupeInfoOpsPlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__EST_CITE_PAR_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				return ((InternalEList<?>)getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__INCLUS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				return getInclusAssociationGroupeInfoOpsPlanOuOrdre();
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__EST_CITE_PAR_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				return getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle();
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
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__CATEGORIE:
				setCategorie((TypeDictionaryDicoGroupeInformationsOperationnellesCategorie)newValue);
				return;
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__INCLUS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				getInclusAssociationGroupeInfoOpsPlanOuOrdre().clear();
				getInclusAssociationGroupeInfoOpsPlanOuOrdre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__EST_CITE_PAR_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle().clear();
				getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__INCLUS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				getInclusAssociationGroupeInfoOpsPlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__EST_CITE_PAR_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle().clear();
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
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__INCLUS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				return inclusAssociationGroupeInfoOpsPlanOuOrdre != null && !inclusAssociationGroupeInfoOpsPlanOuOrdre.isEmpty();
			case SchemaPackage.TYPE_GROUPE_INFORMATIONS_OPERATIONNELLES__EST_CITE_PAR_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE:
				return estCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle != null && !estCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle.isEmpty();
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

} //TypeGroupeInformationsOperationnellesImpl
