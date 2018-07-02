/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationContexteRapport;
import mpia.schema.TypeDictionaryDicoAssociationContexteRapportCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Contexte Rapport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationContexteRapportImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationContexteRapportImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationContexteRapportImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationContexteRapportImpl#getAssocieCommeRapportRapport <em>Associe Comme Rapport Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationContexteRapportImpl#getAssocieCommeContexteContexte <em>Associe Comme Contexte Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationContexteRapportImpl extends EObjectImpl implements TypeAssociationContexteRapport {
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
	protected static final TypeDictionaryDicoAssociationContexteRapportCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationContexteRapportCategorie.IMPL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationContexteRapportCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeRapportRapport() <em>Associe Comme Rapport Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeRapportRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeRapportRapport;

	/**
	 * The cached value of the '{@link #getAssocieCommeContexteContexte() <em>Associe Comme Contexte Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeContexteContexte()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeContexteContexte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationContexteRapportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationContexteRapport();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationContexteRapportCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationContexteRapportCategorie newCategorie) {
		TypeDictionaryDicoAssociationContexteRapportCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationContexteRapportCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeRapportRapport() {
		return associeCommeRapportRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeRapportRapport(TypeAssociation newAssocieCommeRapportRapport, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeRapportRapport = associeCommeRapportRapport;
		associeCommeRapportRapport = newAssocieCommeRapportRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_RAPPORT_RAPPORT, oldAssocieCommeRapportRapport, newAssocieCommeRapportRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeRapportRapport(TypeAssociation newAssocieCommeRapportRapport) {
		if (newAssocieCommeRapportRapport != associeCommeRapportRapport) {
			NotificationChain msgs = null;
			if (associeCommeRapportRapport != null)
				msgs = ((InternalEObject)associeCommeRapportRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_RAPPORT_RAPPORT, null, msgs);
			if (newAssocieCommeRapportRapport != null)
				msgs = ((InternalEObject)newAssocieCommeRapportRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_RAPPORT_RAPPORT, null, msgs);
			msgs = basicSetAssocieCommeRapportRapport(newAssocieCommeRapportRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_RAPPORT_RAPPORT, newAssocieCommeRapportRapport, newAssocieCommeRapportRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeContexteContexte() {
		return associeCommeContexteContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeContexteContexte(TypeAssociation newAssocieCommeContexteContexte, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeContexteContexte = associeCommeContexteContexte;
		associeCommeContexteContexte = newAssocieCommeContexteContexte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_CONTEXTE_CONTEXTE, oldAssocieCommeContexteContexte, newAssocieCommeContexteContexte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeContexteContexte(TypeAssociation newAssocieCommeContexteContexte) {
		if (newAssocieCommeContexteContexte != associeCommeContexteContexte) {
			NotificationChain msgs = null;
			if (associeCommeContexteContexte != null)
				msgs = ((InternalEObject)associeCommeContexteContexte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_CONTEXTE_CONTEXTE, null, msgs);
			if (newAssocieCommeContexteContexte != null)
				msgs = ((InternalEObject)newAssocieCommeContexteContexte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_CONTEXTE_CONTEXTE, null, msgs);
			msgs = basicSetAssocieCommeContexteContexte(newAssocieCommeContexteContexte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_CONTEXTE_CONTEXTE, newAssocieCommeContexteContexte, newAssocieCommeContexteContexte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_RAPPORT_RAPPORT:
				return basicSetAssocieCommeRapportRapport(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				return basicSetAssocieCommeContexteContexte(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_RAPPORT_RAPPORT:
				return getAssocieCommeRapportRapport();
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				return getAssocieCommeContexteContexte();
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
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationContexteRapportCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_RAPPORT_RAPPORT:
				setAssocieCommeRapportRapport((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				setAssocieCommeContexteContexte((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_RAPPORT_RAPPORT:
				setAssocieCommeRapportRapport((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				setAssocieCommeContexteContexte((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_RAPPORT_RAPPORT:
				return associeCommeRapportRapport != null;
			case SchemaPackage.TYPE_ASSOCIATION_CONTEXTE_RAPPORT__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				return associeCommeContexteContexte != null;
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

} //TypeAssociationContexteRapportImpl
