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
import mpia.schema.TypeAssocContexteContexte;
import mpia.schema.TypeDictionaryDicoAssocContexteContexteCategorie;
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
 * An implementation of the model object '<em><b>Type Assoc Contexte Contexte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteContexteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteContexteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteContexteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteContexteImpl#getAPourObjetContexte <em>APour Objet Contexte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteContexteImpl#getAPourEtatEtatAssociation <em>APour Etat Etat Association</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteContexteImpl#getAPourSujetContexte <em>APour Sujet Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssocContexteContexteImpl extends EObjectImpl implements TypeAssocContexteContexte {
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
	protected static final TypeDictionaryDicoAssocContexteContexteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssocContexteContexteCategorie.ISNEXT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssocContexteContexteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourObjetContexte() <em>APour Objet Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetContexte()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetContexte;

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
	 * The cached value of the '{@link #getAPourSujetContexte() <em>APour Sujet Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetContexte()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetContexte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssocContexteContexteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssocContexteContexte();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssocContexteContexteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssocContexteContexteCategorie newCategorie) {
		TypeDictionaryDicoAssocContexteContexteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssocContexteContexteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourObjetContexte() {
		return aPourObjetContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetContexte(TypeAssociation newAPourObjetContexte, NotificationChain msgs) {
		TypeAssociation oldAPourObjetContexte = aPourObjetContexte;
		aPourObjetContexte = newAPourObjetContexte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_OBJET_CONTEXTE, oldAPourObjetContexte, newAPourObjetContexte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetContexte(TypeAssociation newAPourObjetContexte) {
		if (newAPourObjetContexte != aPourObjetContexte) {
			NotificationChain msgs = null;
			if (aPourObjetContexte != null)
				msgs = ((InternalEObject)aPourObjetContexte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_OBJET_CONTEXTE, null, msgs);
			if (newAPourObjetContexte != null)
				msgs = ((InternalEObject)newAPourObjetContexte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_OBJET_CONTEXTE, null, msgs);
			msgs = basicSetAPourObjetContexte(newAPourObjetContexte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_OBJET_CONTEXTE, newAPourObjetContexte, newAPourObjetContexte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatAssociation> getAPourEtatEtatAssociation() {
		if (aPourEtatEtatAssociation == null) {
			aPourEtatEtatAssociation = new EObjectContainmentEList<TypeEtatAssociation>(TypeEtatAssociation.class, this, SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION);
		}
		return aPourEtatEtatAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSujetContexte() {
		return aPourSujetContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetContexte(TypeAssociation newAPourSujetContexte, NotificationChain msgs) {
		TypeAssociation oldAPourSujetContexte = aPourSujetContexte;
		aPourSujetContexte = newAPourSujetContexte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_SUJET_CONTEXTE, oldAPourSujetContexte, newAPourSujetContexte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetContexte(TypeAssociation newAPourSujetContexte) {
		if (newAPourSujetContexte != aPourSujetContexte) {
			NotificationChain msgs = null;
			if (aPourSujetContexte != null)
				msgs = ((InternalEObject)aPourSujetContexte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_SUJET_CONTEXTE, null, msgs);
			if (newAPourSujetContexte != null)
				msgs = ((InternalEObject)newAPourSujetContexte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_SUJET_CONTEXTE, null, msgs);
			msgs = basicSetAPourSujetContexte(newAPourSujetContexte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_SUJET_CONTEXTE, newAPourSujetContexte, newAPourSujetContexte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_OBJET_CONTEXTE:
				return basicSetAPourObjetContexte(null, msgs);
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				return ((InternalEList<?>)getAPourEtatEtatAssociation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_SUJET_CONTEXTE:
				return basicSetAPourSujetContexte(null, msgs);
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
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_OBJET_CONTEXTE:
				return getAPourObjetContexte();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				return getAPourEtatEtatAssociation();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_SUJET_CONTEXTE:
				return getAPourSujetContexte();
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
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssocContexteContexteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_OBJET_CONTEXTE:
				setAPourObjetContexte((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
				getAPourEtatEtatAssociation().addAll((Collection<? extends TypeEtatAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_SUJET_CONTEXTE:
				setAPourSujetContexte((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_OBJET_CONTEXTE:
				setAPourObjetContexte((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_SUJET_CONTEXTE:
				setAPourSujetContexte((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_OBJET_CONTEXTE:
				return aPourObjetContexte != null;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				return aPourEtatEtatAssociation != null && !aPourEtatEtatAssociation.isEmpty();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_CONTEXTE__APOUR_SUJET_CONTEXTE:
				return aPourSujetContexte != null;
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

} //TypeAssocContexteContexteImpl