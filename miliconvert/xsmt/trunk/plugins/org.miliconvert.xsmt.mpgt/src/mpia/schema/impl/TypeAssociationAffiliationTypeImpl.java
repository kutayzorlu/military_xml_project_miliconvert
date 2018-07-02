/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationAffiliationType;
import mpia.schema.TypeDictionaryDicoAssociationAffiliationTypeCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Affiliation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationTypeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationTypeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationTypeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationTypeImpl#getConcerneAffiliationAffiliation <em>Concerne Affiliation Affiliation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationTypeImpl#getConcerneTypeType <em>Concerne Type Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationAffiliationTypeImpl extends EObjectImpl implements TypeAssociationAffiliationType {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationAffiliationTypeCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationAffiliationTypeCategorie.AO;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationAffiliationTypeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

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
	 * The cached value of the '{@link #getConcerneAffiliationAffiliation() <em>Concerne Affiliation Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneAffiliationAffiliation()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneAffiliationAffiliation;

	/**
	 * The cached value of the '{@link #getConcerneTypeType() <em>Concerne Type Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeType()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneTypeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationAffiliationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationAffiliationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationAffiliationTypeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationAffiliationTypeCategorie newCategorie) {
		TypeDictionaryDicoAssociationAffiliationTypeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationAffiliationTypeCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneAffiliationAffiliation() {
		return concerneAffiliationAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneAffiliationAffiliation(TypeAssociationEXT newConcerneAffiliationAffiliation, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneAffiliationAffiliation = concerneAffiliationAffiliation;
		concerneAffiliationAffiliation = newConcerneAffiliationAffiliation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_AFFILIATION_AFFILIATION, oldConcerneAffiliationAffiliation, newConcerneAffiliationAffiliation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneAffiliationAffiliation(TypeAssociationEXT newConcerneAffiliationAffiliation) {
		if (newConcerneAffiliationAffiliation != concerneAffiliationAffiliation) {
			NotificationChain msgs = null;
			if (concerneAffiliationAffiliation != null)
				msgs = ((InternalEObject)concerneAffiliationAffiliation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_AFFILIATION_AFFILIATION, null, msgs);
			if (newConcerneAffiliationAffiliation != null)
				msgs = ((InternalEObject)newConcerneAffiliationAffiliation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_AFFILIATION_AFFILIATION, null, msgs);
			msgs = basicSetConcerneAffiliationAffiliation(newConcerneAffiliationAffiliation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_AFFILIATION_AFFILIATION, newConcerneAffiliationAffiliation, newConcerneAffiliationAffiliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneTypeType() {
		return concerneTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeType(TypeAssociation newConcerneTypeType, NotificationChain msgs) {
		TypeAssociation oldConcerneTypeType = concerneTypeType;
		concerneTypeType = newConcerneTypeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_TYPE_TYPE, oldConcerneTypeType, newConcerneTypeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeType(TypeAssociation newConcerneTypeType) {
		if (newConcerneTypeType != concerneTypeType) {
			NotificationChain msgs = null;
			if (concerneTypeType != null)
				msgs = ((InternalEObject)concerneTypeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_TYPE_TYPE, null, msgs);
			if (newConcerneTypeType != null)
				msgs = ((InternalEObject)newConcerneTypeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_TYPE_TYPE, null, msgs);
			msgs = basicSetConcerneTypeType(newConcerneTypeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_TYPE_TYPE, newConcerneTypeType, newConcerneTypeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_AFFILIATION_AFFILIATION:
				return basicSetConcerneAffiliationAffiliation(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_TYPE_TYPE:
				return basicSetConcerneTypeType(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_AFFILIATION_AFFILIATION:
				return getConcerneAffiliationAffiliation();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_TYPE_TYPE:
				return getConcerneTypeType();
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationAffiliationTypeCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_AFFILIATION_AFFILIATION:
				setConcerneAffiliationAffiliation((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_TYPE_TYPE:
				setConcerneTypeType((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_AFFILIATION_AFFILIATION:
				setConcerneAffiliationAffiliation((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_TYPE_TYPE:
				setConcerneTypeType((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_AFFILIATION_AFFILIATION:
				return concerneAffiliationAffiliation != null;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_TYPE__CONCERNE_TYPE_TYPE:
				return concerneTypeType != null;
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
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationAffiliationTypeImpl
