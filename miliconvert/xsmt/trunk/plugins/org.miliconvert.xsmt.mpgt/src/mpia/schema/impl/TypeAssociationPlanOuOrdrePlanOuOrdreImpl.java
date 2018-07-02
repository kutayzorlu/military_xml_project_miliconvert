/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre;
import mpia.schema.TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Plan Ou Ordre Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanOuOrdrePlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanOuOrdrePlanOuOrdreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanOuOrdrePlanOuOrdreImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanOuOrdrePlanOuOrdreImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanOuOrdrePlanOuOrdreImpl#getAPourObjetPlanOuOrdre <em>APour Objet Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPlanOuOrdrePlanOuOrdreImpl#getAPourSujetPlanOuOrdre <em>APour Sujet Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationPlanOuOrdrePlanOuOrdreImpl extends EObjectImpl implements TypeAssociationPlanOuOrdrePlanOuOrdre {
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
	protected static final TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie.ISAMND;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure date;

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
	 * The cached value of the '{@link #getAPourSujetPlanOuOrdre() <em>APour Sujet Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetPlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetPlanOuOrdre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationPlanOuOrdrePlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationPlanOuOrdrePlanOuOrdre();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie newCategorie) {
		TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDataTypeDateHeure getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(TypeDataTypeDateHeure newDate, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(TypeDataTypeDateHeure newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE, oldAPourObjetPlanOuOrdre, newAPourObjetPlanOuOrdre);
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
				msgs = ((InternalEObject)aPourObjetPlanOuOrdre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE, null, msgs);
			if (newAPourObjetPlanOuOrdre != null)
				msgs = ((InternalEObject)newAPourObjetPlanOuOrdre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE, null, msgs);
			msgs = basicSetAPourObjetPlanOuOrdre(newAPourObjetPlanOuOrdre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE, newAPourObjetPlanOuOrdre, newAPourObjetPlanOuOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSujetPlanOuOrdre() {
		return aPourSujetPlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetPlanOuOrdre(TypeAssociation newAPourSujetPlanOuOrdre, NotificationChain msgs) {
		TypeAssociation oldAPourSujetPlanOuOrdre = aPourSujetPlanOuOrdre;
		aPourSujetPlanOuOrdre = newAPourSujetPlanOuOrdre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_SUJET_PLAN_OU_ORDRE, oldAPourSujetPlanOuOrdre, newAPourSujetPlanOuOrdre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetPlanOuOrdre(TypeAssociation newAPourSujetPlanOuOrdre) {
		if (newAPourSujetPlanOuOrdre != aPourSujetPlanOuOrdre) {
			NotificationChain msgs = null;
			if (aPourSujetPlanOuOrdre != null)
				msgs = ((InternalEObject)aPourSujetPlanOuOrdre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_SUJET_PLAN_OU_ORDRE, null, msgs);
			if (newAPourSujetPlanOuOrdre != null)
				msgs = ((InternalEObject)newAPourSujetPlanOuOrdre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_SUJET_PLAN_OU_ORDRE, null, msgs);
			msgs = basicSetAPourSujetPlanOuOrdre(newAPourSujetPlanOuOrdre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_SUJET_PLAN_OU_ORDRE, newAPourSujetPlanOuOrdre, newAPourSujetPlanOuOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__DATE:
				return basicSetDate(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				return basicSetAPourObjetPlanOuOrdre(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_SUJET_PLAN_OU_ORDRE:
				return basicSetAPourSujetPlanOuOrdre(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__DATE:
				return getDate();
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				return getAPourObjetPlanOuOrdre();
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_SUJET_PLAN_OU_ORDRE:
				return getAPourSujetPlanOuOrdre();
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
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				setAPourObjetPlanOuOrdre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_SUJET_PLAN_OU_ORDRE:
				setAPourSujetPlanOuOrdre((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				setAPourObjetPlanOuOrdre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_SUJET_PLAN_OU_ORDRE:
				setAPourSujetPlanOuOrdre((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__DATE:
				return date != null;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_OBJET_PLAN_OU_ORDRE:
				return aPourObjetPlanOuOrdre != null;
			case SchemaPackage.TYPE_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE__APOUR_SUJET_PLAN_OU_ORDRE:
				return aPourSujetPlanOuOrdre != null;
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

} //TypeAssociationPlanOuOrdrePlanOuOrdreImpl
