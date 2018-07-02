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
import mpia.schema.TypeAssociationEntiteOrganisationnellePlanOuOrdre;
import mpia.schema.TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie;
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
 * An implementation of the model object '<em><b>Type Association Entite Organisationnelle Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrganisationnellePlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrganisationnellePlanOuOrdreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrganisationnellePlanOuOrdreImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrganisationnellePlanOuOrdreImpl#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrganisationnellePlanOuOrdreImpl#getAPourObjetPlanOuOrdre <em>APour Objet Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrganisationnellePlanOuOrdreImpl#getAPourEtatEtatAssociation <em>APour Etat Etat Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEntiteOrganisationnellePlanOuOrdreImpl extends EObjectImpl implements TypeAssociationEntiteOrganisationnellePlanOuOrdre {
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
	protected static final TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie.APPR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourSujetEntiteOrganisationnelle() <em>APour Sujet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getAPourObjetPlanOuOrdre() <em>APour Objet Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetPlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetPlanOuOrdre;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEntiteOrganisationnellePlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationEntiteOrganisationnellePlanOuOrdre();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie newCategorie) {
		TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourSujetEntiteOrganisationnelle() {
		return aPourSujetEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetEntiteOrganisationnelle(TypeAssociation newAPourSujetEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociation oldAPourSujetEntiteOrganisationnelle = aPourSujetEntiteOrganisationnelle;
		aPourSujetEntiteOrganisationnelle = newAPourSujetEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, oldAPourSujetEntiteOrganisationnelle, newAPourSujetEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetEntiteOrganisationnelle(TypeAssociation newAPourSujetEntiteOrganisationnelle) {
		if (newAPourSujetEntiteOrganisationnelle != aPourSujetEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (aPourSujetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)aPourSujetEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAPourSujetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAPourSujetEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAPourSujetEntiteOrganisationnelle(newAPourSujetEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, newAPourSujetEntiteOrganisationnelle, newAPourSujetEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetPlanOuOrdre() {
		return aPourObjetPlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetPlanOuOrdre(TypeAssociation newAPourObjetPlanOuOrdre, NotificationChain msgs) {
		TypeAssociation oldAPourObjetPlanOuOrdre = aPourObjetPlanOuOrdre;
		aPourObjetPlanOuOrdre = newAPourObjetPlanOuOrdre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE, oldAPourObjetPlanOuOrdre, newAPourObjetPlanOuOrdre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetPlanOuOrdre(TypeAssociation newAPourObjetPlanOuOrdre) {
		if (newAPourObjetPlanOuOrdre != aPourObjetPlanOuOrdre) {
			NotificationChain msgs = null;
			if (aPourObjetPlanOuOrdre != null)
				msgs = ((InternalEObject)aPourObjetPlanOuOrdre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE, null, msgs);
			if (newAPourObjetPlanOuOrdre != null)
				msgs = ((InternalEObject)newAPourObjetPlanOuOrdre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE, null, msgs);
			msgs = basicSetAPourObjetPlanOuOrdre(newAPourObjetPlanOuOrdre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE, newAPourObjetPlanOuOrdre, newAPourObjetPlanOuOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatAssociation> getAPourEtatEtatAssociation() {
		if (aPourEtatEtatAssociation == null) {
			aPourEtatEtatAssociation = new EObjectContainmentEList<TypeEtatAssociation>(TypeEtatAssociation.class, this, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_ETAT_ETAT_ASSOCIATION);
		}
		return aPourEtatEtatAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return basicSetAPourSujetEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				return basicSetAPourObjetPlanOuOrdre(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_ETAT_ETAT_ASSOCIATION:
				return ((InternalEList<?>)getAPourEtatEtatAssociation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return getAPourSujetEntiteOrganisationnelle();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				return getAPourObjetPlanOuOrdre();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_ETAT_ETAT_ASSOCIATION:
				return getAPourEtatEtatAssociation();
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				setAPourSujetEntiteOrganisationnelle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				setAPourObjetPlanOuOrdre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
				getAPourEtatEtatAssociation().addAll((Collection<? extends TypeEtatAssociation>)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				setAPourSujetEntiteOrganisationnelle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				setAPourObjetPlanOuOrdre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return aPourSujetEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				return aPourObjetPlanOuOrdre != null;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE__APOUR_ETAT_ETAT_ASSOCIATION:
				return aPourEtatEtatAssociation != null && !aPourEtatEtatAssociation.isEmpty();
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

} //TypeAssociationEntiteOrganisationnellePlanOuOrdreImpl
