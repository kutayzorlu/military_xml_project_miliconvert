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
import mpia.schema.TypeAssocActiviteContexte;
import mpia.schema.TypeDictionaryDicoAssocActiviteContexteCategorie;
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
 * An implementation of the model object '<em><b>Type Assoc Activite Contexte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssocActiviteContexteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocActiviteContexteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocActiviteContexteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocActiviteContexteImpl#getAssocieCommeActiviteActivite <em>Associe Comme Activite Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocActiviteContexteImpl#getAPourEtatEtatAssociation <em>APour Etat Etat Association</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocActiviteContexteImpl#getAssocieCommeContexteContexte <em>Associe Comme Contexte Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssocActiviteContexteImpl extends EObjectImpl implements TypeAssocActiviteContexte {
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
	protected static final TypeDictionaryDicoAssocActiviteContexteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssocActiviteContexteCategorie.FINACT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssocActiviteContexteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeActiviteActivite() <em>Associe Comme Activite Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeActiviteActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeActiviteActivite;

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
	protected TypeAssocActiviteContexteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssocActiviteContexte();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssocActiviteContexteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssocActiviteContexteCategorie newCategorie) {
		TypeDictionaryDicoAssocActiviteContexteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssocActiviteContexteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeActiviteActivite() {
		return associeCommeActiviteActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeActiviteActivite(TypeAssociation newAssocieCommeActiviteActivite, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeActiviteActivite = associeCommeActiviteActivite;
		associeCommeActiviteActivite = newAssocieCommeActiviteActivite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_ACTIVITE_ACTIVITE, oldAssocieCommeActiviteActivite, newAssocieCommeActiviteActivite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeActiviteActivite(TypeAssociation newAssocieCommeActiviteActivite) {
		if (newAssocieCommeActiviteActivite != associeCommeActiviteActivite) {
			NotificationChain msgs = null;
			if (associeCommeActiviteActivite != null)
				msgs = ((InternalEObject)associeCommeActiviteActivite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_ACTIVITE_ACTIVITE, null, msgs);
			if (newAssocieCommeActiviteActivite != null)
				msgs = ((InternalEObject)newAssocieCommeActiviteActivite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_ACTIVITE_ACTIVITE, null, msgs);
			msgs = basicSetAssocieCommeActiviteActivite(newAssocieCommeActiviteActivite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_ACTIVITE_ACTIVITE, newAssocieCommeActiviteActivite, newAssocieCommeActiviteActivite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatAssociation> getAPourEtatEtatAssociation() {
		if (aPourEtatEtatAssociation == null) {
			aPourEtatEtatAssociation = new EObjectContainmentEList<TypeEtatAssociation>(TypeEtatAssociation.class, this, SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION);
		}
		return aPourEtatEtatAssociation;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_CONTEXTE_CONTEXTE, oldAssocieCommeContexteContexte, newAssocieCommeContexteContexte);
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
				msgs = ((InternalEObject)associeCommeContexteContexte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_CONTEXTE_CONTEXTE, null, msgs);
			if (newAssocieCommeContexteContexte != null)
				msgs = ((InternalEObject)newAssocieCommeContexteContexte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_CONTEXTE_CONTEXTE, null, msgs);
			msgs = basicSetAssocieCommeContexteContexte(newAssocieCommeContexteContexte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_CONTEXTE_CONTEXTE, newAssocieCommeContexteContexte, newAssocieCommeContexteContexte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				return basicSetAssocieCommeActiviteActivite(null, msgs);
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				return ((InternalEList<?>)getAPourEtatEtatAssociation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
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
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				return getAssocieCommeActiviteActivite();
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				return getAPourEtatEtatAssociation();
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				return getAssocieCommeContexteContexte();
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
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssocActiviteContexteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				setAssocieCommeActiviteActivite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
				getAPourEtatEtatAssociation().addAll((Collection<? extends TypeEtatAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
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
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				setAssocieCommeActiviteActivite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
				return;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
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
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				return associeCommeActiviteActivite != null;
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__APOUR_ETAT_ETAT_ASSOCIATION:
				return aPourEtatEtatAssociation != null && !aPourEtatEtatAssociation.isEmpty();
			case SchemaPackage.TYPE_ASSOC_ACTIVITE_CONTEXTE__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
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

} //TypeAssocActiviteContexteImpl
