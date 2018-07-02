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
import mpia.schema.TypeAssociationParagraphePOparagraphePO;
import mpia.schema.TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Paragraphe POparagraphe PO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationParagraphePOparagraphePOImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationParagraphePOparagraphePOImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationParagraphePOparagraphePOImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationParagraphePOparagraphePOImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationParagraphePOparagraphePOImpl#getAPourSujetParagraphePlanOuOrdre <em>APour Sujet Paragraphe Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationParagraphePOparagraphePOImpl#getAPourObjetParagraphePlanOuOrdre <em>APour Objet Paragraphe Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationParagraphePOparagraphePOImpl extends EObjectImpl implements TypeAssociationParagraphePOparagraphePO {
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
	protected static final TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie.ISDISS;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie categorie = CATEGORIE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourSujetParagraphePlanOuOrdre() <em>APour Sujet Paragraphe Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetParagraphePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetParagraphePlanOuOrdre;

	/**
	 * The cached value of the '{@link #getAPourObjetParagraphePlanOuOrdre() <em>APour Objet Paragraphe Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetParagraphePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetParagraphePlanOuOrdre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationParagraphePOparagraphePOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationParagraphePOparagraphePO();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie newCategorie) {
		TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSujetParagraphePlanOuOrdre() {
		return aPourSujetParagraphePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetParagraphePlanOuOrdre(TypeAssociation newAPourSujetParagraphePlanOuOrdre, NotificationChain msgs) {
		TypeAssociation oldAPourSujetParagraphePlanOuOrdre = aPourSujetParagraphePlanOuOrdre;
		aPourSujetParagraphePlanOuOrdre = newAPourSujetParagraphePlanOuOrdre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_SUJET_PARAGRAPHE_PLAN_OU_ORDRE, oldAPourSujetParagraphePlanOuOrdre, newAPourSujetParagraphePlanOuOrdre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetParagraphePlanOuOrdre(TypeAssociation newAPourSujetParagraphePlanOuOrdre) {
		if (newAPourSujetParagraphePlanOuOrdre != aPourSujetParagraphePlanOuOrdre) {
			NotificationChain msgs = null;
			if (aPourSujetParagraphePlanOuOrdre != null)
				msgs = ((InternalEObject)aPourSujetParagraphePlanOuOrdre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_SUJET_PARAGRAPHE_PLAN_OU_ORDRE, null, msgs);
			if (newAPourSujetParagraphePlanOuOrdre != null)
				msgs = ((InternalEObject)newAPourSujetParagraphePlanOuOrdre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_SUJET_PARAGRAPHE_PLAN_OU_ORDRE, null, msgs);
			msgs = basicSetAPourSujetParagraphePlanOuOrdre(newAPourSujetParagraphePlanOuOrdre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_SUJET_PARAGRAPHE_PLAN_OU_ORDRE, newAPourSujetParagraphePlanOuOrdre, newAPourSujetParagraphePlanOuOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetParagraphePlanOuOrdre() {
		return aPourObjetParagraphePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetParagraphePlanOuOrdre(TypeAssociation newAPourObjetParagraphePlanOuOrdre, NotificationChain msgs) {
		TypeAssociation oldAPourObjetParagraphePlanOuOrdre = aPourObjetParagraphePlanOuOrdre;
		aPourObjetParagraphePlanOuOrdre = newAPourObjetParagraphePlanOuOrdre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_OBJET_PARAGRAPHE_PLAN_OU_ORDRE, oldAPourObjetParagraphePlanOuOrdre, newAPourObjetParagraphePlanOuOrdre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetParagraphePlanOuOrdre(TypeAssociation newAPourObjetParagraphePlanOuOrdre) {
		if (newAPourObjetParagraphePlanOuOrdre != aPourObjetParagraphePlanOuOrdre) {
			NotificationChain msgs = null;
			if (aPourObjetParagraphePlanOuOrdre != null)
				msgs = ((InternalEObject)aPourObjetParagraphePlanOuOrdre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_OBJET_PARAGRAPHE_PLAN_OU_ORDRE, null, msgs);
			if (newAPourObjetParagraphePlanOuOrdre != null)
				msgs = ((InternalEObject)newAPourObjetParagraphePlanOuOrdre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_OBJET_PARAGRAPHE_PLAN_OU_ORDRE, null, msgs);
			msgs = basicSetAPourObjetParagraphePlanOuOrdre(newAPourObjetParagraphePlanOuOrdre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_OBJET_PARAGRAPHE_PLAN_OU_ORDRE, newAPourObjetParagraphePlanOuOrdre, newAPourObjetParagraphePlanOuOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__DATE:
				return basicSetDate(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_SUJET_PARAGRAPHE_PLAN_OU_ORDRE:
				return basicSetAPourSujetParagraphePlanOuOrdre(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_OBJET_PARAGRAPHE_PLAN_OU_ORDRE:
				return basicSetAPourObjetParagraphePlanOuOrdre(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__DATE:
				return getDate();
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_SUJET_PARAGRAPHE_PLAN_OU_ORDRE:
				return getAPourSujetParagraphePlanOuOrdre();
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_OBJET_PARAGRAPHE_PLAN_OU_ORDRE:
				return getAPourObjetParagraphePlanOuOrdre();
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
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__DATE:
				setDate((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_SUJET_PARAGRAPHE_PLAN_OU_ORDRE:
				setAPourSujetParagraphePlanOuOrdre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_OBJET_PARAGRAPHE_PLAN_OU_ORDRE:
				setAPourObjetParagraphePlanOuOrdre((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__DATE:
				setDate((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_SUJET_PARAGRAPHE_PLAN_OU_ORDRE:
				setAPourSujetParagraphePlanOuOrdre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_OBJET_PARAGRAPHE_PLAN_OU_ORDRE:
				setAPourObjetParagraphePlanOuOrdre((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__DATE:
				return date != null;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_SUJET_PARAGRAPHE_PLAN_OU_ORDRE:
				return aPourSujetParagraphePlanOuOrdre != null;
			case SchemaPackage.TYPE_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO__APOUR_OBJET_PARAGRAPHE_PLAN_OU_ORDRE:
				return aPourObjetParagraphePlanOuOrdre != null;
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

} //TypeAssociationParagraphePOparagraphePOImpl
