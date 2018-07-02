/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage;
import mpia.schema.TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Objectif Ciblage Objectif Ciblage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageObjectifCiblageImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageObjectifCiblageImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageObjectifCiblageImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageObjectifCiblageImpl#getAPourObjectifObjetObjectifCiblage <em>APour Objectif Objet Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageObjectifCiblageImpl#getAPourObjectifSujetObjectifCiblage <em>APour Objectif Sujet Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationObjectifCiblageObjectifCiblageImpl extends EObjectImpl implements TypeAssociationObjectifCiblageObjectifCiblage {
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
	protected static final TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie.COMPNT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourObjectifObjetObjectifCiblage() <em>APour Objectif Objet Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjectifObjetObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjectifObjetObjectifCiblage;

	/**
	 * The cached value of the '{@link #getAPourObjectifSujetObjectifCiblage() <em>APour Objectif Sujet Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjectifSujetObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjectifSujetObjectifCiblage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationObjectifCiblageObjectifCiblageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationObjectifCiblageObjectifCiblage();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie newCategorie) {
		TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourObjectifObjetObjectifCiblage() {
		return aPourObjectifObjetObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjectifObjetObjectifCiblage(TypeAssociation newAPourObjectifObjetObjectifCiblage, NotificationChain msgs) {
		TypeAssociation oldAPourObjectifObjetObjectifCiblage = aPourObjectifObjetObjectifCiblage;
		aPourObjectifObjetObjectifCiblage = newAPourObjectifObjetObjectifCiblage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_OBJET_OBJECTIF_CIBLAGE, oldAPourObjectifObjetObjectifCiblage, newAPourObjectifObjetObjectifCiblage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjectifObjetObjectifCiblage(TypeAssociation newAPourObjectifObjetObjectifCiblage) {
		if (newAPourObjectifObjetObjectifCiblage != aPourObjectifObjetObjectifCiblage) {
			NotificationChain msgs = null;
			if (aPourObjectifObjetObjectifCiblage != null)
				msgs = ((InternalEObject)aPourObjectifObjetObjectifCiblage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_OBJET_OBJECTIF_CIBLAGE, null, msgs);
			if (newAPourObjectifObjetObjectifCiblage != null)
				msgs = ((InternalEObject)newAPourObjectifObjetObjectifCiblage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_OBJET_OBJECTIF_CIBLAGE, null, msgs);
			msgs = basicSetAPourObjectifObjetObjectifCiblage(newAPourObjectifObjetObjectifCiblage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_OBJET_OBJECTIF_CIBLAGE, newAPourObjectifObjetObjectifCiblage, newAPourObjectifObjetObjectifCiblage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjectifSujetObjectifCiblage() {
		return aPourObjectifSujetObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjectifSujetObjectifCiblage(TypeAssociation newAPourObjectifSujetObjectifCiblage, NotificationChain msgs) {
		TypeAssociation oldAPourObjectifSujetObjectifCiblage = aPourObjectifSujetObjectifCiblage;
		aPourObjectifSujetObjectifCiblage = newAPourObjectifSujetObjectifCiblage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_SUJET_OBJECTIF_CIBLAGE, oldAPourObjectifSujetObjectifCiblage, newAPourObjectifSujetObjectifCiblage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjectifSujetObjectifCiblage(TypeAssociation newAPourObjectifSujetObjectifCiblage) {
		if (newAPourObjectifSujetObjectifCiblage != aPourObjectifSujetObjectifCiblage) {
			NotificationChain msgs = null;
			if (aPourObjectifSujetObjectifCiblage != null)
				msgs = ((InternalEObject)aPourObjectifSujetObjectifCiblage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_SUJET_OBJECTIF_CIBLAGE, null, msgs);
			if (newAPourObjectifSujetObjectifCiblage != null)
				msgs = ((InternalEObject)newAPourObjectifSujetObjectifCiblage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_SUJET_OBJECTIF_CIBLAGE, null, msgs);
			msgs = basicSetAPourObjectifSujetObjectifCiblage(newAPourObjectifSujetObjectifCiblage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_SUJET_OBJECTIF_CIBLAGE, newAPourObjectifSujetObjectifCiblage, newAPourObjectifSujetObjectifCiblage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_OBJET_OBJECTIF_CIBLAGE:
				return basicSetAPourObjectifObjetObjectifCiblage(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_SUJET_OBJECTIF_CIBLAGE:
				return basicSetAPourObjectifSujetObjectifCiblage(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_OBJET_OBJECTIF_CIBLAGE:
				return getAPourObjectifObjetObjectifCiblage();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_SUJET_OBJECTIF_CIBLAGE:
				return getAPourObjectifSujetObjectifCiblage();
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_OBJET_OBJECTIF_CIBLAGE:
				setAPourObjectifObjetObjectifCiblage((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_SUJET_OBJECTIF_CIBLAGE:
				setAPourObjectifSujetObjectifCiblage((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_OBJET_OBJECTIF_CIBLAGE:
				setAPourObjectifObjetObjectifCiblage((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_SUJET_OBJECTIF_CIBLAGE:
				setAPourObjectifSujetObjectifCiblage((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_OBJET_OBJECTIF_CIBLAGE:
				return aPourObjectifObjetObjectifCiblage != null;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE__APOUR_OBJECTIF_SUJET_OBJECTIF_CIBLAGE:
				return aPourObjectifSujetObjectifCiblage != null;
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

} //TypeAssociationObjectifCiblageObjectifCiblageImpl
