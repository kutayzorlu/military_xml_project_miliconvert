/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationAffiliationAffiliation;
import mpia.schema.TypeDictionaryDicoAssociationAffiliationAffiliationCategorie;
import mpia.schema.TypeDictionaryDicoAssociationAffiliationComportement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Affiliation Affiliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationAffiliationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationAffiliationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationAffiliationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationAffiliationImpl#getComportement <em>Comportement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationAffiliationImpl#getAssocieCommeObjetAffiliation <em>Associe Comme Objet Affiliation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationAffiliationImpl#getAssocieCommeSujetAffiliation <em>Associe Comme Sujet Affiliation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationAffiliationAffiliationImpl extends EObjectImpl implements TypeAssociationAffiliationAffiliation {
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
	protected static final TypeDictionaryDicoAssociationAffiliationAffiliationCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationAffiliationAffiliationCategorie.MIL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationAffiliationAffiliationCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getComportement() <em>Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComportement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationAffiliationComportement COMPORTEMENT_EDEFAULT = TypeDictionaryDicoAssociationAffiliationComportement.VFAV;

	/**
	 * The cached value of the '{@link #getComportement() <em>Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComportement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationAffiliationComportement comportement = COMPORTEMENT_EDEFAULT;

	/**
	 * This is true if the Comportement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean comportementESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetAffiliation() <em>Associe Comme Objet Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetAffiliation()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetAffiliation;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetAffiliation() <em>Associe Comme Sujet Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetAffiliation()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetAffiliation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationAffiliationAffiliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationAffiliationAffiliation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationAffiliationAffiliationCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationAffiliationAffiliationCategorie newCategorie) {
		TypeDictionaryDicoAssociationAffiliationAffiliationCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationAffiliationAffiliationCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoAssociationAffiliationComportement getComportement() {
		return comportement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComportement(TypeDictionaryDicoAssociationAffiliationComportement newComportement) {
		TypeDictionaryDicoAssociationAffiliationComportement oldComportement = comportement;
		comportement = newComportement == null ? COMPORTEMENT_EDEFAULT : newComportement;
		boolean oldComportementESet = comportementESet;
		comportementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__COMPORTEMENT, oldComportement, comportement, !oldComportementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetComportement() {
		TypeDictionaryDicoAssociationAffiliationComportement oldComportement = comportement;
		boolean oldComportementESet = comportementESet;
		comportement = COMPORTEMENT_EDEFAULT;
		comportementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__COMPORTEMENT, oldComportement, COMPORTEMENT_EDEFAULT, oldComportementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComportement() {
		return comportementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetAffiliation() {
		return associeCommeObjetAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetAffiliation(TypeAssociation newAssocieCommeObjetAffiliation, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetAffiliation = associeCommeObjetAffiliation;
		associeCommeObjetAffiliation = newAssocieCommeObjetAffiliation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_OBJET_AFFILIATION, oldAssocieCommeObjetAffiliation, newAssocieCommeObjetAffiliation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetAffiliation(TypeAssociation newAssocieCommeObjetAffiliation) {
		if (newAssocieCommeObjetAffiliation != associeCommeObjetAffiliation) {
			NotificationChain msgs = null;
			if (associeCommeObjetAffiliation != null)
				msgs = ((InternalEObject)associeCommeObjetAffiliation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_OBJET_AFFILIATION, null, msgs);
			if (newAssocieCommeObjetAffiliation != null)
				msgs = ((InternalEObject)newAssocieCommeObjetAffiliation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_OBJET_AFFILIATION, null, msgs);
			msgs = basicSetAssocieCommeObjetAffiliation(newAssocieCommeObjetAffiliation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_OBJET_AFFILIATION, newAssocieCommeObjetAffiliation, newAssocieCommeObjetAffiliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetAffiliation() {
		return associeCommeSujetAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetAffiliation(TypeAssociation newAssocieCommeSujetAffiliation, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetAffiliation = associeCommeSujetAffiliation;
		associeCommeSujetAffiliation = newAssocieCommeSujetAffiliation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_SUJET_AFFILIATION, oldAssocieCommeSujetAffiliation, newAssocieCommeSujetAffiliation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetAffiliation(TypeAssociation newAssocieCommeSujetAffiliation) {
		if (newAssocieCommeSujetAffiliation != associeCommeSujetAffiliation) {
			NotificationChain msgs = null;
			if (associeCommeSujetAffiliation != null)
				msgs = ((InternalEObject)associeCommeSujetAffiliation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_SUJET_AFFILIATION, null, msgs);
			if (newAssocieCommeSujetAffiliation != null)
				msgs = ((InternalEObject)newAssocieCommeSujetAffiliation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_SUJET_AFFILIATION, null, msgs);
			msgs = basicSetAssocieCommeSujetAffiliation(newAssocieCommeSujetAffiliation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_SUJET_AFFILIATION, newAssocieCommeSujetAffiliation, newAssocieCommeSujetAffiliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_OBJET_AFFILIATION:
				return basicSetAssocieCommeObjetAffiliation(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_SUJET_AFFILIATION:
				return basicSetAssocieCommeSujetAffiliation(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__COMPORTEMENT:
				return getComportement();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_OBJET_AFFILIATION:
				return getAssocieCommeObjetAffiliation();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_SUJET_AFFILIATION:
				return getAssocieCommeSujetAffiliation();
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationAffiliationAffiliationCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__COMPORTEMENT:
				setComportement((TypeDictionaryDicoAssociationAffiliationComportement)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_OBJET_AFFILIATION:
				setAssocieCommeObjetAffiliation((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_SUJET_AFFILIATION:
				setAssocieCommeSujetAffiliation((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__COMPORTEMENT:
				unsetComportement();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_OBJET_AFFILIATION:
				setAssocieCommeObjetAffiliation((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_SUJET_AFFILIATION:
				setAssocieCommeSujetAffiliation((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__COMPORTEMENT:
				return isSetComportement();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_OBJET_AFFILIATION:
				return associeCommeObjetAffiliation != null;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_AFFILIATION__ASSOCIE_COMME_SUJET_AFFILIATION:
				return associeCommeSujetAffiliation != null;
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
		result.append(", comportement: ");
		if (comportementESet) result.append(comportement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationAffiliationAffiliationImpl
