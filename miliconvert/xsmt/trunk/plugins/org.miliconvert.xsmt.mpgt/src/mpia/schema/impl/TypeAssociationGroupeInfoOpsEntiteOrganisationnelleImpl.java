/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle;
import mpia.schema.TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie;
import mpia.schema.TypeEtatAssociation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Groupe Info Ops Entite Organisationnelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsEntiteOrganisationnelleImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsEntiteOrganisationnelleImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsEntiteOrganisationnelleImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsEntiteOrganisationnelleImpl#getAssocieCommeResponsableEntiteOrganisationnelle <em>Associe Comme Responsable Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsEntiteOrganisationnelleImpl#getAPourEtatEtatAssociation <em>APour Etat Etat Association</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsEntiteOrganisationnelleImpl#getAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles <em>Associe Comme Groupe Informations Operationnelles Groupe Informations Operationnelles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationGroupeInfoOpsEntiteOrganisationnelleImpl extends EObjectImpl implements TypeAssociationGroupeInfoOpsEntiteOrganisationnelle {
	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie.RESP;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeResponsableEntiteOrganisationnelle() <em>Associe Comme Responsable Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeResponsableEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeResponsableEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatAssociation() <em>APour Etat Etat Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatAssociation> aPourEtatEtatAssociation;

	/**
	 * The cached value of the '{@link #getAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles() <em>Associe Comme Groupe Informations Operationnelles Groupe Informations Operationnelles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationGroupeInfoOpsEntiteOrganisationnelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationGroupeInfoOpsEntiteOrganisationnelle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie newCategorie) {
		TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociationEXT getAssocieCommeResponsableEntiteOrganisationnelle() {
		return associeCommeResponsableEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeResponsableEntiteOrganisationnelle(TypeAssociationEXT newAssocieCommeResponsableEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeResponsableEntiteOrganisationnelle = associeCommeResponsableEntiteOrganisationnelle;
		associeCommeResponsableEntiteOrganisationnelle = newAssocieCommeResponsableEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_RESPONSABLE_ENTITE_ORGANISATIONNELLE, oldAssocieCommeResponsableEntiteOrganisationnelle, newAssocieCommeResponsableEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeResponsableEntiteOrganisationnelle(TypeAssociationEXT newAssocieCommeResponsableEntiteOrganisationnelle) {
		if (newAssocieCommeResponsableEntiteOrganisationnelle != associeCommeResponsableEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (associeCommeResponsableEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)associeCommeResponsableEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_RESPONSABLE_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAssocieCommeResponsableEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAssocieCommeResponsableEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_RESPONSABLE_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAssocieCommeResponsableEntiteOrganisationnelle(newAssocieCommeResponsableEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_RESPONSABLE_ENTITE_ORGANISATIONNELLE, newAssocieCommeResponsableEntiteOrganisationnelle, newAssocieCommeResponsableEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatAssociation> getAPourEtatEtatAssociation() {
		if (aPourEtatEtatAssociation == null) {
			aPourEtatEtatAssociation = new EObjectContainmentEList<TypeEtatAssociation>(TypeEtatAssociation.class, this, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_ASSOCIATION);
		}
		return aPourEtatEtatAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles() {
		return associeCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles(TypeAssociation newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles = associeCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles;
		associeCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles = newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_GROUPE_INFORMATIONS_OPERATIONNELLES_GROUPE_INFORMATIONS_OPERATIONNELLES, oldAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles, newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles(TypeAssociation newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles) {
		if (newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles != associeCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles) {
			NotificationChain msgs = null;
			if (associeCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles != null)
				msgs = ((InternalEObject)associeCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_GROUPE_INFORMATIONS_OPERATIONNELLES_GROUPE_INFORMATIONS_OPERATIONNELLES, null, msgs);
			if (newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles != null)
				msgs = ((InternalEObject)newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_GROUPE_INFORMATIONS_OPERATIONNELLES_GROUPE_INFORMATIONS_OPERATIONNELLES, null, msgs);
			msgs = basicSetAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles(newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_GROUPE_INFORMATIONS_OPERATIONNELLES_GROUPE_INFORMATIONS_OPERATIONNELLES, newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles, newAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				return basicSetAssocieCommeResponsableEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_ASSOCIATION:
				return ((InternalEList<?>)getAPourEtatEtatAssociation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_GROUPE_INFORMATIONS_OPERATIONNELLES_GROUPE_INFORMATIONS_OPERATIONNELLES:
				return basicSetAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				return getAssocieCommeResponsableEntiteOrganisationnelle();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_ASSOCIATION:
				return getAPourEtatEtatAssociation();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_GROUPE_INFORMATIONS_OPERATIONNELLES_GROUPE_INFORMATIONS_OPERATIONNELLES:
				return getAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles();
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
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				setAssocieCommeResponsableEntiteOrganisationnelle((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
				getAPourEtatEtatAssociation().addAll((Collection<? extends TypeEtatAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_GROUPE_INFORMATIONS_OPERATIONNELLES_GROUPE_INFORMATIONS_OPERATIONNELLES:
				setAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				setAssocieCommeResponsableEntiteOrganisationnelle((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_GROUPE_INFORMATIONS_OPERATIONNELLES_GROUPE_INFORMATIONS_OPERATIONNELLES:
				setAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				return associeCommeResponsableEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__APOUR_ETAT_ETAT_ASSOCIATION:
				return aPourEtatEtatAssociation != null && !aPourEtatEtatAssociation.isEmpty();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_ENTITE_ORGANISATIONNELLE__ASSOCIE_COMME_GROUPE_INFORMATIONS_OPERATIONNELLES_GROUPE_INFORMATIONS_OPERATIONNELLES:
				return associeCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles != null;
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationGroupeInfoOpsEntiteOrganisationnelleImpl
